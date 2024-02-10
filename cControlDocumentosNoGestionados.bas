B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@

Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private xui As XUI
	
	Private Dialog As B4XDialog
	'Private btnSalir As Button
	Private mSQL As SQL
	
	'(*) Declarar desde el designer los objetos del layout de los Items del CLV
	
	
	Private JamTableCLV1 As JamTableCLV
	Private txtAlmacenDocumento As TextField
	Private txtAlmacenFisico As TextField
	Private txtCliente As TextField
	Private txtDiasAcum As TextField
	Private txtDocumento As TextField
	Private txtFase As TextField
	Private txtFechaDocumento As TextField
	Private txtFechaFase As TextField
	Private txtFechaReferencia As TextField
	Private txtInfoAdicionalFase As TextField
	Private txtNombreCliente As TextField
	Private txtObservaciones As TextField
	Private txtPersonalizado As TextField
	Private txtPrioridad As TextField
	Private txtResponsableFase As TextField
	Private txtTipoDocumento As TextField
	Private txtTotalImp As TextField
	Private txtTotalQty As TextField
	
	Private TimestampBatchFaseDocs As Long
	Private UUIDSesion As String
	
	Private FechaInicioControl As Long
	Private sFechaInicioControl As String
	
	Private PrimerAvisoInfoEstablecerPrioridad As Boolean
	Private txtNombreResponsableCuenta As TextField
	Private txtNumeroAlmacenesFisicos As B4XView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub



Public Sub Show

	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrControlDocumentosNoGestionados")
	Sleep(0)  
	
	Dim JOClvDatosScrollpane As JavaObject=JamTableCLV1.sv
	JOClvDatosScrollpane.RunMethod("setHbarPolicy",Array("ALWAYS"))
	JOClvDatosScrollpane.RunMethod("setVbarPolicy",Array("ALWAYS"))
		
	frm.Title=Main.PrefijoTitleForms & "Control Documentos No Gestionados"
		
	Dialog.Initialize (frm.RootPane)
	
	PrimerAvisoInfoEstablecerPrioridad=True
		
	frm.Show
	
	If mSQL.IsInitialized Then mSQL.Close
	'mSQL.InitializeSQLite("", ":memory:", True)
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	CreacionTablasSQLite
	
	wait for(BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario) complete (rBool As Boolean)
	If rBool=False Then
		SalirModulo
		Return
	End If
	
	UUIDSesion=GenerarUUIDv4
	TimestampBatchFaseDocs=DateTime.Now
	
'	'(*) las siguientes 2 lineas son para abrir el CamposBuilder y crear el JSON. Comentar (o borrar) una vez creado el JSON
'	JamTableCLV1.AbrirCamposBuilder
'	Return

	'(*) añadir Menu Items
	'JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarAcciones,True)
	'JamTableCLV1.AddMenuItemToMenuInMenuBar("test","test",JamTableCLV1.MenuBarAcciones)
		
	Dim rSub As ResumableSub=JamTableCLV1.ConfigurarTableCLV("ListaControlDocumentosNoGestionados2.json")
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarLinea,False)
	JamTableCLV1.AddMenuItemFontAwesomeToMenuInMenuBar("Ver Fecha Inicio Control","VerFechaInicioControl",Chr(0xF274),JamTableCLV1.MenuBarAcciones)
	JamTableCLV1.AddMenuItemFontMaterialIconsToMenuInMenuBar("Resetear Prioridades","ResetearPrioridades",Chr(0xE16D),JamTableCLV1.MenuBarAcciones)
	
	'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
	JamTableCLV1.AlturaItems=120dip
	'(*) opcional 
	JamTableCLV1.ModoSeleccionItems=JamTableCLV1.ModoSeleccionIndividualTemp  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple
	
	JamTableCLV1.AlturaSeparadorPaneles=4dip

	Wait For(CargarFechaInicioControl) complete (sResp As String)
	Dim Accion As String=sResp
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	Log("FechaInicioControl: " & FechaInicioControl & "  , sFechaInicioControl: " & sFechaInicioControl)

	ActualizarDatos
End Sub


Sub ActualizarDatos
	
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	
	JamTableCLV1.Clear
	
	mSQL.ExecNonQuery("delete from tblAlbVtaDepNavLin")
	mSQL.ExecNonQuery("delete from tblDocumentosSinGestionar")
	

	
	'btnSalir.Enabled=False
	Wait For(ActualizarDatosDocumentosNAV) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	
	mSQL.ExecNonQuery("update tblAlbVtaDepNavLin set Importe=Qty*Precio*(100-Descuento)/100")
	mSQL.ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where AlmOrig=?",Array As Object("ADESA","0237"))
	mSQL.ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where GRC like ?",Array As Object("PROTEC","ROPA%"))
	
	' Tabla PROIN/PROTEC actualizada por usuarios
	
	' Totales  (TotalQty, TotalImporte, Personalizado)
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("insert into tblDocumentosSinGestionar (FechaDocumento, TipoDocumento, Documento, Cliente, NombreCliente, AlmacenDocumento, AlmacenFisico, Pedido, ")
	sb.Append("Personalizado, Prioridad, NombrePrioridad, Fase, FechaFase, ResponsableFase, InfoAdicionalFase, Observaciones, TotalQty, TotalImp,NombreResponsableCuenta)")
	sb.Append(" Select Fecha As FechaDocumento, TipoDoc As TipoDocumento, Documento, Cliente, NombreCliente, AlmOrig As AlmacenDocumento , Almacen As AlmacenFisico, Pedido,")
	sb.Append("'NO' As Personalizado, 0 as Prioridad, 'Sin Prioridad' as NombrePrioridad, '' as Fase, 0 as FechaFase, '' as ResponsableFase, '' as InfoAdicionalFase, '' as Observaciones,")
	sb.Append("sum (Qty) As TotalQty, sum (Importe) As TotalImp, NombreResponsableCuenta")
	sb.Append(" from tblAlbVtaDepNavLin group by Fecha, TipoDoc, Documento, Cliente, NombreCliente, AlmOrig, Almacen, NombreResponsableCuenta")
	mSQL.ExecNonQuery(sb.ToString)

	mSQL.ExecNonQuery2("update tblDocumentosSinGestionar set Personalizado=? where Documento in (Select DISTINCT Documento from tblAlbVtaDepNavLin where Personalizado=1)",Array As Object("SI"))
	
	Dim rsDAcum As ResultSet=mSQL.ExecQuery("select Documento, FechaDocumento from tblDocumentosSinGestionar")
	Do While rsDAcum.NextRow
		Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(rsDAcum.GetLong("FechaDocumento"), DateTime.Now)
		Dim DiasAcum As Int=PeriodDiasAcum.Days
		Dim DocDiasAc As String=rsDAcum.GetString("Documento")
		mSQL.AddNonQueryToBatch("update tblDocumentosSinGestionar set DiasAcumulados=? where Documento =?",Array As Object(DiasAcum,DocDiasAc))
	Loop
	rsDAcum.Close
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)

	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	wait for(BorrarDatosBatchAnterioresUUIDSesion) complete (rBool As Boolean)
	If rBool=False Then
		SalirModulo
		Return
	End If
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	wait for(InsertarLineasBatchDocumentos) complete (rBool As Boolean)
	If rBool=False Then
		SalirModulo
		Return
	End If
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	wait for(FaseActualDocumentosBacthUUID) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		SalirModulo
		Return
	End If

	''	wait for(BorrarDocumentosAlmacenManualNoEnBatch) complete (rBool As Boolean)
	''	If rBool=False Then
	''		SalirModulo
	''		Return
	''	End If
	
'	wait for(BorrarPrioridadesDocumentosNoEnBatch) complete (rBool As Boolean)
'	If rBool=False Then
'		SalirModulo
'		Return
'	End If
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	wait for(CargaDocumentosAlmacenManual) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	If Accion="OK" Then
		Dim lstReg As List=mRes.Get("lstReg")
		For Each m As Map In lstReg
			Dim DocAlmF As String=m.Get("Documento")
			Dim AlmF As String=m.Get("Almacen")
			mSQL.ExecNonQuery2("update tblDocumentosSinGestionar set AlmacenFisico=? where Documento=?",Array As Object(AlmF,DocAlmF))
		Next
	End If
	
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	wait for(CargaPrioridadesDocumentos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	If Accion="OK" Then
		Dim lstReg As List=mRes.Get("lstReg")
		For Each m As Map In lstReg
			Dim DocPrioridad As String=m.Get("Documento")
			Dim Prioridad As Int=m.Get("Prioridad")
			Dim NombrePrioridad As String=m.Get("NombrePrioridad")
			mSQL.ExecNonQuery2("update tblDocumentosSinGestionar set Prioridad=?, NombrePrioridad=? where Documento=?",Array As Object(Prioridad,NombrePrioridad, DocPrioridad))
		Next
	End If
	
	mSQL.ExecNonQuery2("update tblDocumentosSinGestionar set Fase=? where Fase=?",Array As Object("NO INICIADO",""))
	mSQL.ExecNonQuery2("update tblDocumentosSinGestionar set NombreResponsableCuenta=? where TipoDocumento=? Or TipoDocumento=?",Array As Object("N/A","CDEV","RTTrf"))
	mSQL.ExecNonQuery($"update tblDocumentosSinGestionar set NumeroAlmacenesFisicos=tAux.NumAlmFis
		from (select Documento, count(AlmacenFisico) as NumAlmFis from tblDocumentosSinGestionar group by Documento) tAux
		where tblDocumentosSinGestionar.Documento=tAux.Documento"$)
	mSQL.ExecNonQuery($"update tblDocumentosSinGestionar set VariosAlmacenesFisicos=case when NumeroAlmacenesFisicos>1 then 'SI' else 'NO' end"$)
	
	JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblDocumentosSinGestionar where Gestionado=0")
	Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				JamTableCLV1.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	wait for(ActualizarFechaInicioControl) complete (Success As Boolean)
	' continuar, incluso si no es posible actualizarla (?)
	JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV

	Dim msa As Object=xui.MsgboxAsync("Datos actualizados.","Aviso")
	Wait For (msa) Msgbox_Result
	
	Dim NumDocsVariosAlmacenes As Int=mSQL.ExecQuerySingleResult("select count(*) from tblDocumentosSinGestionar where NumeroAlmacenesFisicos>1")
	If NumDocsVariosAlmacenes>0 Then
		wait for(Utilidades.MsgBox2XUI("Confirma",$"Hay documentos con más de 1 almacén físico teórico asignado.
¿Filtrar la tabla por esos documentos?"$,"Sí","","No",Null)) complete (rInt As Int)
		If rInt=xui.DialogResponse_Positive Then
			Dim rSub As ResumableSub=JamTableCLV1.AddFiltroCampoValorInicial("VariosAlmacenesFisicos","SI")
			wait for(rSub) complete (Success As Boolean)
			If Success Then

			Else
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible añadir el filtro de varios almacenes","Error")
				Wait For (msa) Msgbox_Result
			End If
		End If
	End If
	
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub JamTableCLV1_AccionSalirJamTableCLV
	SalirModulo
End Sub


Private Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub

Sub JamTableCLV1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "Actualizar"
			ActualizarDatos
		Case "VerFechaInicioControl"
			Wait For(CargarFechaInicioControl) complete (sResp As String)
			Dim Accion As String=sResp
			If Accion="Salir" Then
				SalirModulo
				Return
			End If
			Dim msa As Object=xui.MsgboxAsync("La fecha de inicio del control es " & sFechaInicioControl &".","Fecha Inicio Control")
			Wait For (msa) Msgbox_Result
			
		Case "ResetearPrioridades"
			ResetearPrioridades
			
'		Case "EjemploAccionLineasSeleccionadas"
'			Dim lstDatosLineasSeleccionadas As List=JamTableCLV1.GetDatosItemsSeleccionados
'			For Each mData As Map In lstDatosLineasSeleccionadas
'				LogColor("DatosLineaSeleccionada : " & mData, xui.Color_Blue)
'			Next
'		Case "
	End Select
End Sub

Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAlbVtaDepNavLin"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAlbVtaDepNavLin")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAlbVtaDepNavLin (")
	
	sbCrearTabla.Append("Fecha INTEGER,")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("GRC TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmOrig TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Almacen TEXT COLLATE NOCASE default 'PROIN',")
	sbCrearTabla.Append("Qty REAL,")
	sbCrearTabla.Append("Precio REAL,")
	sbCrearTabla.Append("Descuento REAL,")
	sbCrearTabla.Append("Importe REAL default 0,")
	sbCrearTabla.Append("Personalizado INTEGER,")
	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaPedido TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaProm INTEGER,")
	sbCrearTabla.Append("FechaReq INTEGER,")
	sbCrearTabla.Append("TipoDoc TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '')")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblDocumentosSinGestionar"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblDocumentosSinGestionar")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblDocumentosSinGestionar (")
	
	sbCrearTabla.Append("FechaDocumento INTEGER,")
	sbCrearTabla.Append("DiasAcumulados INTEGER default 0,")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmacenDocumento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmacenFisico TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NumeroAlmacenesFisicos INTEGER DEFAULT 1,")
	sbCrearTabla.Append("VariosAlmacenesFisicos TEXT DEFAULT 'NO',")
	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("TotalQty REAL,")
	sbCrearTabla.Append("TotalImp REAL,")
	sbCrearTabla.Append("Personalizado TEXT COLLATE NOCASE default 'NO',")
'	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaPedido TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaReferencia INTEGER,")
	sbCrearTabla.Append("TipoDocumento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Prioridad Integer default 0,")
	sbCrearTabla.Append("NombrePrioridad TEXT COLLATE NOCASE DEFAULT 'Sin Prioridad',")
	sbCrearTabla.Append("Fase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("Gestionado INTEGER default 0,")
	sbCrearTabla.Append("FechaFase INTEGER default 0,")
	sbCrearTabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("Observaciones TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '')")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblFaseActualDocumentosFecha"))
'	If ntFP>0 Then
'		mSQL.ExecNonQuery("drop table tblFaseActualDocumentosFecha")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblFaseActualDocumentosFecha (")
'	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Fase TEXT COLLATE NOCASE default '',")
'	sbCrearTabla.Append("FechaFase INTEGER default 0,")
'	sbCrearTabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',")
'	sbCrearTabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',")
'	sbCrearTabla.Append("Observaciones TEXT COLLATE NOCASE default '')")
'	mSQL.ExecNonQuery(sbCrearTabla.ToString)

End Sub


Sub ActualizarDatosDocumentosNAV As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblAlbVtaDepNavLin")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicioControlNAV As String=DateTime.Date(FechaInicioControl)
	DateTime.DateFormat=DateFormatAnt
	Dim Comando As String="InfoNavControlDocumentos"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(sFechaInicioControlNAV), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	
	If mResult.Get("ConnOK")=False Then
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Documentos no Gestionados.","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
			'mRes.Put("lstReg", lstReg)
'			For Each m As Map In lstReg
'				Log("m: " & m)
			''				Dim OSUB As String=m.Get("PedidoFab")
			''				Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.UsuarioWindows,Main.DatosUsuario.NombreUsuarioWindows,OSUB))
			''				lstCommands.Add(cmd)
'			Next
			'DBUtils.InsertMaps(mSQL,"tblAlbVtaDepNavLin",lstReg)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAlbVtaDepNavLin",lstReg)
		End If
	End If
	Return mRes
End Sub


Sub GenerarUUIDv4 As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each stp As Int In Array(8, 4, 4, 4, 12)
		If sb.Length > 0 Then sb.Append("-")
		For n = 1 To stp
			Dim c As Int = Rnd(0, 16)
			If c < 10 Then c = c + 48 Else c = c + 55
			If sb.Length = 19 Then c = Asc("8")
			If sb.Length = 14 Then c = Asc("4")
			sb.Append(Chr(c))
		Next
	Next
	Return sb.ToString.ToLowerCase
End Sub

'Sub JamTableCLV1_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	Dim ExtraSize As Int = 30 'Add 5 items at a time, this can be changed to suite your requirements
'	For i = Max(0, FirstIndex - ExtraSize) To Min(LastIndex + ExtraSize, JamTableCLV1.Size - 1) 'Loop for adding/removing your items layout to or from the list
'		Dim Pnl As B4XView = JamTableCLV1.GetPanel(i) 'Declare a new B4XView
''		If ColActualCLV=Col1 Then
''			ColActualCLV=Col2
''		Else
''			ColActualCLV=Col1
''		End If
''		Pnl.SetColorAndBorder(ColActualCLV,1,xui.Color_Gray,0)
'		
'		If i > FirstIndex - ExtraSize And i < LastIndex + ExtraSize Then 'Add a new item to the list
'			If Pnl.NumberOfViews = 0 Then 'Add items to the list
'				Dim mData As Map = JamTableCLV1.GetValue(i) 'Get your custom Type
'				Pnl.LoadLayout("scrItemControlDocumentosNoGestionados") 
'
'				txtAlmacenDocumento.Text=mData.Get("AlmacenDocumento")
'				txtAlmacenFisico.Text=mData.Get("AlmacenFisico")
'				txtCliente.Text=mData.Get("Cliente")
'				Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaDocumento"), DateTime.Now)
'				txtDiasAcum.Text=PeriodDiasAcum.Days
'				txtDocumento.Text=mData.Get("Documento")
'				txtFase.Text=mData.Getdefault("Fase","")
'				Dim txtfaseB As B4XView=txtFase
'				txtfaseB.TextColor=0xFFB22222
'				
'				Dim DateFormatAnt As String=DateTime.DateFormat
'				DateTime.DateFormat="dd/MM/yyyy"
'				Dim TimeFormatAnt As String=DateTime.timeFormat
'				DateTime.TimeFormat	="HH:mm"
'				txtFechaDocumento.Text=DateTime.Date(mData.Get("FechaDocumento"))
'				If mData.Getdefault("FechaFase",0)>0 Then
'					txtFechaFase.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
'				End If
'				Dim txtFechaFaseB As B4XView=txtFechaFase
'				txtFechaFaseB.TextColor=0xFFB22222
'				DateTime.DateFormat=DateFormatAnt
'				DateTime.TimeFormat=TimeFormatAnt
'
'				txtInfoAdicionalFase.Text=mData.Getdefault("InfoAdicionalFase","")
'				Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFase
'				txtInfoAdfaseB.TextColor=0xFFB22222
'				txtNombreCliente.Text=mData.Get("NombreCliente")
'				txtObservaciones.Text=mData.Getdefault("Observaciones","")
'				Dim txtObservacionesB As B4XView=txtObservaciones
'				txtObservacionesB.TextColor=0xFFC71585
'				txtPersonalizado.Text=mData.Get("Personalizado")
'				txtPrioridad.Text=mData.Getdefault("NombrePrioridad","Sin Prioridad")
'				txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
'				Dim txtResponsableFaseB As B4XView=txtResponsableFase
'				txtResponsableFaseB.TextColor=0xFFB22222
'				txtTipoDocumento.Text=mData.Get("TipoDocumento")
'				Dim TotalImp As Double=mData.Get("TotalImp")
'				txtTotalImp.Text=NumberFormat(TotalImp,1,0)
'				Dim TotalQty As Double=mData.Get("TotalQty")
'				txtTotalQty.Text=NumberFormat(TotalQty,1,0)
'				txtPersonalizado.Text=mData.Get("Personalizado")
'				
'				'(*) ejemplo para modificar el alto de un item 
'				' Dim AltoTextArea=JamTableCLV1.MedirAlturaTextoMultilinea ....
'				'JamTableCLV1.ResizeItem(i,txtObservaciones.Top+txtObservaciones.PrefHeight+5dip)
'			End If
'		Else 'Remove items from the list
'			If Pnl.NumberOfViews > 0 Then
'				Pnl.RemoveAllViews 'Remove none visible item from the main xCLV layout
'			End If
'		End If
'	Next
'	
'End Sub


Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemIndexCLV As DatosItemIndexCLVJamTableCLV)
	Dim mData As Map = DatosItemIndexCLV.Value
	Dim pnl As B4XView=DatosItemIndexCLV.Panel
	pnl.LoadLayout("scrItemControlDocumentosNoGestionados")

	txtAlmacenDocumento.Text=mData.Get("AlmacenDocumento")
	txtAlmacenFisico.Text=mData.Get("AlmacenFisico")
	Dim NumAlmFisDoc As Int=mData.get("NumeroAlmacenesFisicos")
	txtNumeroAlmacenesFisicos.Text=NumAlmFisDoc
	If NumAlmFisDoc>1 Then
		txtNumeroAlmacenesFisicos.Textcolor=xui.Color_White
		txtNumeroAlmacenesFisicos.SetColorAndBorder(0xFFFF2226,1,0xFF696969,3)
	Else
		txtNumeroAlmacenesFisicos.TextColor=xui.Color_Black
	End If
	txtCliente.Text=mData.Get("Cliente")
'	Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaDocumento"), DateTime.Now)
'	txtDiasAcum.Text=PeriodDiasAcum.Days
	txtDiasAcum.Text=mData.Get("DiasAcumulados")
	
	txtDocumento.Text=mData.Get("Documento")
	txtFase.Text=mData.Getdefault("Fase","")
	Dim txtfaseB As B4XView=txtFase
	If txtFase.Text="NO INICIADO" Then
		txtfaseB.Textcolor=xui.Color_Black
		txtfaseB.SetColorAndBorder(0xFFFFA500,1,0xFF696969,3)
	Else
		txtfaseB.TextColor=0xFFB22222
	End If
	
	
				
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim TimeFormatAnt As String=DateTime.timeFormat
	DateTime.TimeFormat	="HH:mm"
	txtFechaDocumento.Text=DateTime.Date(mData.Get("FechaDocumento"))
	If mData.Getdefault("FechaFase",0)>0 Then
		txtFechaFase.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
	End If
	Dim txtFechaFaseB As B4XView=txtFechaFase
	txtFechaFaseB.TextColor=0xFFB22222
	DateTime.DateFormat=DateFormatAnt
	DateTime.TimeFormat=TimeFormatAnt

	txtInfoAdicionalFase.Text=mData.Getdefault("InfoAdicionalFase","")
	Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFase
	txtInfoAdfaseB.TextColor=0xFFB22222
	txtNombreCliente.Text=mData.Get("NombreCliente")
	txtObservaciones.Text=mData.Getdefault("Observaciones","")
	Dim txtObservacionesB As B4XView=txtObservaciones
	txtObservacionesB.TextColor=0xFFC71585
	txtPersonalizado.Text=mData.Get("Personalizado")
	txtPrioridad.Text=mData.Getdefault("NombrePrioridad","Sin Prioridad")
	ActualizarColortFPrioridad(txtPrioridad,txtPrioridad.Text)
	txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
	Dim txtResponsableFaseB As B4XView=txtResponsableFase
	txtResponsableFaseB.TextColor=0xFFB22222
	txtTipoDocumento.Text=mData.Get("TipoDocumento")
	Dim TotalImp As Double=mData.Get("TotalImp")
	txtTotalImp.Text=Utilidades.FormatoNumerico2(TotalImp,1,0,0,True)
	Dim TotalQty As Double=mData.Get("TotalQty")
	txtTotalQty.Text=Utilidades.FormatoNumerico2(TotalQty,1,0,0,True)
	txtPersonalizado.Text=mData.Get("Personalizado")
	Dim txtPersonalizadoB As B4XView=txtPersonalizado
	If txtPersonalizadoB.Text="SI" Then
		txtPersonalizadoB.Textcolor=xui.Color_Black
		txtPersonalizadoB.SetColorAndBorder(0xFFFFA500,1,0xFF696969,3)
	Else
		txtPersonalizadoB.TextColor=xui.Color_Black
	End If
	txtNombreResponsableCuenta.Text=mData.Get("NombreResponsableCuenta")
	
End Sub

Sub JamTableCLV1_ItemClick(Index As Int, Value As Object)
	Dim mData As Map=Value
	Log("Datos Item seleccionado (" & Index & "): " )
	For Each k In mData.Keys
		Log(k & ": " & mData.Get(k))
	Next
End Sub

'botón derecho
Sub JamTableCLV1_ItemLongClick(Index As Int, Value As Object)
	Dim mData As Map=Value
	Log("Datos Item seleccionado botón secundario (" & Index & "): " )
	For Each k In mData.Keys
		Log(k & ": " & mData.Get(k))
	Next
End Sub

Private Sub btnActualizar_Click
	ActualizarDatos
End Sub

Private Sub btnEjemplo_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
End Sub



Private Sub btnSelAlmFisico_Click
	Dim btn As Button=Sender
	
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim DocSel As String=mData.Get("Documento")
	'Dim AlmacenSel As String
	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	
	Dialog.Title="Selecciona Almacén Físico de Preparación"
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize

	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
		
	Dim lstOpciones As List=Array As String("PROIN","PROTEC","ADESA")
	
	B4XListDlg.Options=lstOpciones
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,80dip)
	Next
	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim AlmFis As String=B4XListDlg.SelectedItem 

	Dim lstComandos As List
	lstComandos.Initialize
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("BorrarDocumentoAlmacenManual",Array(DocSel))
	lstComandos.Add(cmd)
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("InsertarDocumentoAlmacenManual",Array(DocSel,AlmFis))
	lstComandos.Add(cmd)
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar el almacén físico para el documento " & DocSel & ".","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set AlmacenFisico=? where Documento=?",Array As String(AlmFis,DocSel))
	mSQL.ExecNonQuery2("update tblDocumentosSinGestionar set AlmacenFisico=? where Documento=?",Array As String(AlmFis,DocSel))
'	
'	mData.Put("AlmacenFisico",AlmFis)
'	Dim pnlSel As B4XView=JamTableCLV1.GetPanel(IndexSel)
'	For Each n As Node In pnlSel.GetAllViewsRecursive
'		If n.Tag="AlmacenFisico" Then
'			Dim tF As TextField=n
'			tF.Text=AlmFis
'			Exit
'		End If
'	Next
	
	Dim mDataModif As Map
	mDataModif.Initialize
	mDataModif.Put("AlmacenFisico",AlmFis)
	wait for(JamTableCLV1.ActualizarValueItemCLV(IndexSel, mDataModif)) complete (rBool As Boolean)
	If rBool=False Then
		ExitApplication
	End If
End Sub

Private Sub btnSelPrioridad_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	Dim PrimerIndexVisible As Int=JamTableCLV1.FirstVisibleIndex
	
	Dim DocSel As String=mData.Get("Documento")
	Dim msa As Object = xui.Msgbox2Async("¿Asignar Prioridad al documento " & DocSel & "?", "Confirma", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	If PrimerAvisoInfoEstablecerPrioridad Then
		PrimerAvisoInfoEstablecerPrioridad=False
		Dim msa As Object=xui.MsgboxAsync("A=Máxima prioridad.","Información")
		Wait For (msa) Msgbox_Result
	End If

	
	wait for(CargarTiposPrioridadesDocumentosNoGestionados) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim lstOpciones As List
	lstOpciones.Initialize
	Dim lstReg As List=mRes.Get("lstReg")
'	Dim omTiposPrioridad As B4XOrderedMap
'	omTiposPrioridad.Initialize
	
	For Each mPrioridad As Map In lstReg
		'Dim TipoPrioridad As String=mPrioridad.Get("Prioridad")
		Dim NombreTipoPrioridad As String
'		If Utilidades.FixNull(mPrioridad.Get("TituloPrioridad"))="" Then
'			NombreTipoPrioridad="Sin Prioridad"
'		Else
			NombreTipoPrioridad=Utilidades.FixNull(mPrioridad.Get("TituloPrioridad"))
'		End If
		
		lstOpciones.Add(NombreTipoPrioridad)
'		omTiposPrioridad.Put("TipoPrioridad",TipoPrioridad)
'		omTiposPrioridad.Put("NombreTipoPrioridad",NombreTipoPrioridad)
	Next

	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	Dialog.Title="Selecciona Tipo de Prioridad"
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize

	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize

	B4XListDlg.Options=lstOpciones
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,(xclv.sv.Height/lstOpciones.size)-4dip)
	Next
	
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	
	''JamTableCLV1.JumpToItem(PrimerIndexVisible)
	
	If rInt<>xui.DialogResponse_Positive Then Return
	
	

	Dim PrioridadSel As Int=-1
	Dim NombrePrioridadSel As String=B4XListDlg.SelectedItem
	'Dim lstPr As List=omTiposPrioridad.Values
	For Each mPr As Map In lstReg
		Dim NombreTipoPrioridad As String=Utilidades.FixNull(mPr.Get("TituloPrioridad"))
		If NombreTipoPrioridad=NombrePrioridadSel Then
			PrioridadSel=mPr.Get("Prioridad")
			Exit
		End If
	Next
	If PrioridadSel=-1 Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar la prioridad para el documento " & DocSel & ".","Error")
		Wait For (msa) Msgbox_Result
		 Return
	End If
	
	Wait For(ActualizarPrioridadDocumento(PrioridadSel,DocSel)) complete (Success As Boolean)
	If Success=False Then Return 
	
	
	Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel)
	For Each n As Node In pnl.GetAllViewsRecursive
		If n.Tag="Prioridad" Then
			Dim tF As TextField=n
			tF.Text=NombreTipoPrioridad	
			ActualizarColortFPrioridad(tF,NombreTipoPrioridad)
			Exit
		End If
	Next
	mData.Put("Prioridad",PrioridadSel)
	mData.Put("NombrePrioridad",NombrePrioridadSel)
	JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set Prioridad=?, NombrePrioridad=? where Documento=?",Array As Object(PrioridadSel, NombrePrioridadSel, DocSel))
	
End Sub

Sub ActualizarColortFPrioridad(tF As TextField,NombrePrioridad As String)
	Dim xtF As B4XView=tF
	Select Case NombrePrioridad
		Case "A"
			xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize)
			xtF.Color=xui.Color_Red
			xtF.TextColor=xui.Color_White
		Case "B"
			xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize)
			xtF.Color=0xFFFFA500
			xtF.TextColor=xui.Color_Black
		Case "C"
			xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize)
			xtF.Color=xui.Color_Yellow
			xtF.TextColor=xui.Color_Black
		Case Else
			xtF.Font=xui.CreateDefaultFont(xtF.TextSize)
			xtF.Color=xui.Color_White
			xtF.TextColor=xui.Color_Black
	End Select
	
End Sub

Private Sub btnFasesDoc_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	'Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim DocSel As String=mData.Get("Documento")
	
	Dim cFDoc As cFasesDocumento
	cFDoc.Initialize(Me, frm.RootPane,DocSel)
	cFDoc.Show
End Sub

'Private Sub btnDocNAV_Click
'	
'End Sub

Sub BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario As ResumableSub
	
	Dim lstCommands As List
	lstCommands.Initialize
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario",Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
	lstCommands.Add(cmd)
	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	
	If result=False Then
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		Return True
	End If
End Sub

Sub BorrarDatosBatchAnterioresUUIDSesion As ResumableSub
	
	Dim lstCommands As List
	lstCommands.Initialize
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarLineasFaseActualDocumentoBacthUUID",Array(UUIDSesion))
	lstCommands.Add(cmd)
	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	
	If result=False Then
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		Return True
	End If
End Sub

Sub InsertarLineasBatchDocumentos As ResumableSub
	Dim lstCommands As List
	lstCommands.Initialize
	Dim rs As ResultSet=mSQL.ExecQuery("select distinct Documento from tblDocumentosSinGestionar")
	Do While rs.NextRow
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch", _
			Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,rs.GetString("Documento")))
		lstCommands.Add(cmd)
	Loop
	rs.Close
	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	
	If result=False Then
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		Return True
	End If
End Sub

''Sub BorrarDocumentosAlmacenManualNoEnBatch As ResumableSub
''	Dim lstCommands As List
''	lstCommands.Initialize
''	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarDocumentosAlmacenManualNoEnBatch",Array(UUIDSesion,"",""))
''	lstCommands.Add(cmd)
''
''	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
''	Wait For EjecutarBatch_Completed (result As Boolean)
''	
''	If result=False Then
''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query BorrarDocumentosAlmacenManualNoEnBatch","Error")
''		Wait For (msa) Msgbox_Result
''		Return False
''	Else
''		Return True
''	End If
''End Sub

'''Sub BorrarPrioridadesDocumentosNoEnBatch As ResumableSub
'''	Dim lstCommands As List
'''	lstCommands.Initialize
'''	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarPrioridadDocumentosNoEnBatch",Array(UUIDSesion,""))
'''	lstCommands.Add(cmd)
'''
'''	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
'''	Wait For EjecutarBatch_Completed (result As Boolean)
'''	
'''	If result=False Then
'''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query BorrarPrioridadDocumentosNoEnBatch","Error")
'''		Wait For (msa) Msgbox_Result
'''		Return False
'''	Else
'''		Return True
'''	End If
'''End Sub

Sub CargaDocumentosAlmacenManual As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="DocumentosAlmacenManual"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)

	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub


Sub FaseActualDocumentosBacthUUID As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"FaseActualDocumentosBacthUUID",Array(UUIDSesion), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query FaseActualDocumentosBacthUUID","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="SinFaseActualDocumentos"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
			For Each m As Map In lstReg
				'Log("m: " & m)
				
				mSQL.AddNonQueryToBatch("update tblDocumentosSinGestionar set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, Observaciones=? where Documento=?", _
					Array(m.Get("Fase"),m.Get("Gestionado"), m.Get("FechaHoraMov"),Utilidades.FixNull(m.Get("ResponsableFase")), Utilidades.FixNull(m.Get("InfoAdicionalFase")),Utilidades.FixNull(m.Get("Obs")), m.Get("Documento")))
			Next
			Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
			Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
			Log("NonQuery: " & Success)
			If Success=False Then
				Accion="Salir"
				mRes.Put("Accion", Accion)
			End If
		End If
	End If
	Return mRes
End Sub


'Sub ActualizarDatosFaseActualDocumentosFecha As ResumableSub
'	mSQL.ExecNonQuery("DELETE from tblFaseActualDocumentosFecha")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="yyyy-MM-dd"
'	Dim FechaInicialConsulta As Long=DateTime.DateParse("2022-01-01")
'	DateTime.DateFormat=DateFormatAnt
'
'	Dim Comando As String="FaseActualDocumentosFechaInicial"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(FechaInicialConsulta), Me)
'	
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="Salir"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
'			Accion="Sin Datos"
'			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de .............","Aviso")
'			Wait For (msa) Msgbox_Result
'		Else
'			Accion="OK"
'			mRes.Put("Accion", Accion)
''			Dim lstCommands As List
''			lstCommands.Initialize
'			Dim lstReg As List=mResult.Get("lstRes")
'			'mRes.Put("lstReg", lstReg)
''			For Each m As Map In lstReg
''				Log("m: " & m)
'			''				Dim OSUB As String=m.Get("PedidoFab")
'			''				Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.UsuarioWindows,Main.DatosUsuario.NombreUsuarioWindows,OSUB))
'			''				lstCommands.Add(cmd)
''			Next
'			DBUtils.InsertMaps(mSQL,"tblAlbVtaDepNavLin",lstReg)
'		End If
'	End If
'	Return mRes
'End Sub

Private Sub btnMostrarDocumentoEnNavision_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim DocSel As String=mData.Get("Documento")
	Select True
		Case DocSel.StartsWith("ALBV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico Albaranes Venta",130, "No.", DocSel)
		Case DocSel.StartsWith("RT")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico recep. transferencia",5745, "No.", DocSel)
		Case DocSel.StartsWith("CDEV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico envío devolución",6650, "No.", DocSel)
	End Select
	
	
	'frm.RootPane.MouseCursor=fx.Cursors.WAIT
	
	wait for(rSub) complete (success As Boolean)
	'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	If success Then

	Else
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir la ficha del documento " & DocSel & " en NAVISION." ,"Error")
		Wait For (msa) Msgbox_Result
	End If
End Sub

Sub CargarFechaInicioControl As ResumableSub
	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize

	Dim Comando As String="FechaInicioControlDocumentosNoGestionados"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Salir"
			'mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Fecha Inicio Control","Error")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			'mRes.Put("Accion", Accion)

			Dim lstReg As List=mResult.Get("lstRes")
			Dim mFecha As Map=lstReg.Get(0)
			FechaInicioControl=mFecha.GetValueAt(0)
			Dim DateFormatAnt As String=DateTime.DateFormat
			DateTime.DateFormat="dd/MM/yyyy"
			sFechaInicioControl=DateTime.Date(FechaInicioControl)
			DateTime.DateFormat=DateFormatAnt
		End If
	End If
	Return Accion
End Sub

Sub ActualizarFechaInicioControl As ResumableSub
	Dim MinFechaDocNoGestionado As Long=Utilidades.FixNullLong(mSQL.ExecQuerySingleResult("select min(FechaDocumento) from tblDocumentosSinGestionar where Gestionado=0"))
	If MinFechaDocNoGestionado=0 Then Return False
	Log(DateTime.Date(MinFechaDocNoGestionado))

	Dim lstComandos As List
	lstComandos.Initialize
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat= "yyyy-MM-dd HH:mm:ss"
	Dim sDateTimeFechaInicioControl As String=DateTime.Date(MinFechaDocNoGestionado)
	DateTime.DateFormat=DateFormatAnt
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("ActualizarFechaInicioControlDocumentosNoGestionados",Array(sDateTimeFechaInicioControl))
	lstComandos.Add(cmd)
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar la fecha de inicio del control.","Error")
'		Wait For (msa) Msgbox_Result
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yyyy"
		LogColor("No ha sido posible actualizar la fecha de inicio del control a " & DateTime.Date(MinFechaDocNoGestionado),xui.Color_Red)
		DateTime.DateFormat=DateFormatAnt
		LogColor("Se mantiene en " & sFechaInicioControl & ".",xui.Color_Red) 
		Return False
	End If
	
	Return True
End Sub

Sub CargaPrioridadesDocumentos As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="PrioridadesDocumentos"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)

	Wait For DatosJRDC_Completed (mResult As Map)
	JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub ResetearPrioridades
	Dim NumDocsConPrioridad As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblDocumentosSinGestionar where Gestionado=? and Prioridad<>?",Array As String(0,"")))
	If NumDocsConPrioridad=0 Then 
		Dim msa As Object=xui.MsgboxAsync("No hay ningún documento con prioridad establecida.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim msa As Object = xui.Msgbox2Async("¿Resetear todas las prioridades de documentos establecidas?" & CRLF & CRLF & "Esta acción no es reversible.", "Confirma", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstComandos As List
	lstComandos.Initialize

	Dim cmd As DBCommand = JRDCQuery.CreateCommand("ResetearPrioridadesDocumentosNoGestionados",Null)
	lstComandos.Add(cmd)
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible resetear las prioridades de los documentos.","Error")
		Wait For (msa) Msgbox_Result
	Else
		Dim msa As Object=xui.MsgboxAsync("Se han reseteado todas las prioridades de los documentos.","Aviso")
		Wait For (msa) Msgbox_Result
	End If
	ActualizarDatos
End Sub

Sub CargarTiposPrioridadesDocumentosNoGestionados As ResumableSub

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	
	Dim Comando As String="TiposPrioridadesDocumentosNoGestionados"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de tipos de prioridad para documentos no gestionados","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub ActualizarPrioridadDocumento(IDTipoPrioridad As Int, DocSel As String) As ResumableSub

	Dim lstComandos As List
	lstComandos.Initialize
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("ActualizarPrioridadDocumentoNoGestionado",Array(DocSel,IDTipoPrioridad, IDTipoPrioridad))
	lstComandos.Add(cmd)
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar la prioridad para el documento " & DocSel & ".","Error")
		Wait For (msa) Msgbox_Result
		Return Success
	End If
	
	Return Success
End Sub


