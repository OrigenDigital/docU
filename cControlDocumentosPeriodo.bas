﻿B4J=true
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
	
	Private txtFechaInicial As TextField
	Private btnSelFechaInicial As Button
	Private txtFechaFinal As TextField
	Private btnSelFechaFinal As Button
	Private btnGetInfo As Button
	Private FechaInicialLong, FechaFinalLong As Long
	
	Private txtNumExpedicion As TextField
	Private btnTrazabilidadTransporte As Button
	
	Private JamLoadingIndicator1 As JamLoadingIndicator
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
	frm.RootPane.LoadLayout("scrControlDocumentosPeriodo")
	Sleep(0)
	
		
	frm.Title=Main.PrefijoTitleForms & "Control Documentos Periodo"
		
	Dialog.Initialize (frm.RootPane)
	
	JamLoadingIndicator1.Initialize(Me,frm.RootPane)
		
	frm.Show
	
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	Dim FechaInicialHora As Long=DateTime.Add(DateTime.Now,0,0,-30)
'	FechaInicialLong=DateUtils.SetDate(DateTime.GetYear(FechaInicialHora),DateTime.GetMonth(FechaInicialHora),DateTime.GetDayOfMonth(FechaInicialHora))
'	txtFechaInicial.Text=DateTime.date(FechaInicialLong)
'	Log(DateUtils.TicksToString(FechaInicialLong))
'	Dim FechaFinalHora As Long=DateTime.Now
'	FechaFinalLong=DateUtils.SetDate(DateTime.GetYear(FechaFinalHora),DateTime.GetMonth(FechaFinalHora),DateTime.GetDayOfMonth(FechaFinalHora))
'	FechaFinalLong=FechaFinalLong+DateTime.TicksPerDay-1
'	txtFechaFinal.Text=DateTime.Date(FechaFinalLong)
'	Log(DateUtils.TicksToString(FechaFinalLong))
'	DateTime.DateFormat=DateFormatAnt
	
	If mSQL.IsInitialized Then mSQL.Close
	'mSQL.InitializeSQLite("", ":memory:", True)
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	CreacionTablasSQLite
	
	wait for(BorrarDatosBatchAnterioresMaquinaUsuario) complete (rBool As Boolean)
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
		
	Dim rSub As ResumableSub=JamTableCLV1.ConfigurarTableCLV("ListaControlDocumentosPeriodo.json")
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	'(*) Opcional
	JamTableCLV1.AddMenuItemToMenuInMenuBar("Actualizar","Actualizar",JamTableCLV1.MenuBarAcciones)
	
	'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
	JamTableCLV1.AlturaItems=130dip
	'(*) opcional
	JamTableCLV1.ModoSeleccionItems=JamTableCLV1.ModoSeleccionMultiple  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple

	JamTableCLV1.AlturaSeparadorPaneles=2dip

	
	
	
'	ActualizarDatos
End Sub


Sub ActualizarDatos
	
	JamLoadingIndicator1.Show

	JamTableCLV1.Clear
	
	mSQL.ExecNonQuery("delete from tblAlbVtaDepNavLin")
	mSQL.ExecNonQuery("delete from tblDocumentosPeriodo")
	
	'btnSalir.Enabled=False
	Wait For(ActualizarDatosDocumentosNAV) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		'JamLoadingIndicator1.close
		SalirModulo
		Return
	End If
	
	mSQL.ExecNonQuery("update tblAlbVtaDepNavLin set Importe=Qty*Precio*(100-Descuento)/100")
	mSQL.ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where AlmOrig=?",Array As Object("ADESA","0237"))
	mSQL.ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where GRC like ?",Array As Object("PROTEC","ROPA%"))
	
	' Tabla PROIN/PROTEC actualizada por usuarios
	
	' Totales  (TotalQty, TotalImporte, Personalizado)
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("insert into tblDocumentosPeriodo (FechaDocumento, TipoDocumento, Documento, Cliente, NombreCliente, AlmacenDocumento, AlmacenFisico, ")
	sb.Append("Personalizado, Prioridad, Fase, FechaFase, ResponsableFase, InfoAdicionalFase, NumExpedicion, Observaciones, TotalQty, TotalImp)")
	sb.Append(" Select Fecha As FechaDocumento, TipoDoc As TipoDocumento, Documento, Cliente, NombreCliente, AlmOrig As AlmacenDocumento , Almacen As AlmacenFisico,")
	sb.Append("'NO' As Personalizado, '' as Prioridad, '' as Fase, 0 as FechaFase, '' as ResponsableFase, '' as NumExpedicion, '' as InfoAdicionalFase, '' as Observaciones,")
	sb.Append("sum (Qty) As TotalQty, sum (Importe) As TotalImp")
	sb.Append(" from tblAlbVtaDepNavLin group by Fecha, TipoDoc, Documento, Cliente, NombreCliente, AlmOrig, Almacen")
	mSQL.ExecNonQuery(sb.ToString)

	mSQL.ExecNonQuery2("update tblDocumentosPeriodo set Personalizado=? where Documento in (Select DISTINCT Documento from tblAlbVtaDepNavLin where Personalizado=1)",Array As Object("SI"))
	mSQL.ExecNonQuery2("update tblDocumentosPeriodo set NombreResponsableCuenta=? where TipoDocumento=? or TipoDocumento=?",Array As Object("N/A","CDEV","RTTrf"))
	
	
	
	wait for(BorrarDatosBatchAnterioresUUIDSesion) complete (rBool As Boolean)
	If rBool=False Then
		JamLoadingIndicator1.close
		SalirModulo
		Return
	End If
	
	wait for(InsertarLineasBatchDocumentos) complete (rBool As Boolean)
	If rBool=False Then
		JamLoadingIndicator1.close
		SalirModulo
		Return
	End If
	
	wait for(FaseActualDocumentosBacthUUID) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		JamLoadingIndicator1.close
		SalirModulo
		Return
	End If

'	wait for(BorrarDocumentosAlmacenManualNoEnBatch) complete (rBool As Boolean)
'	If rBool=False Then
'		SalirModulo
'		Return
'	End If
	
	wait for(CargaDocumentosAlmacenManual) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		'JamLoadingIndicator1.close
		SalirModulo
		Return
	End If
	If Accion="OK" Then
		Dim lstReg As List=mRes.Get("lstReg")
		For Each m As Map In lstReg
			Dim DocAlmF As String=m.Get("Documento")
			Dim AlmF As String=m.Get("Almacen")
			mSQL.ExecNonQuery2("update tblDocumentosPeriodo set AlmacenFisico=? where Documento=?",Array As Object(AlmF,DocAlmF))
		Next
	End If
	
	mSQL.ExecNonQuery2("update tblDocumentosPeriodo set Fase=? where Fase=?",Array As Object("NO INICIADO",""))

	JamLoadingIndicator1.Close
	
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblDocumentosPeriodo") ' where Gestionado=0")
	Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
	'JamLoadingIndicator1.close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
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
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '',")
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
	sbCrearTabla.Append("TipoDoc TEXT COLLATE NOCASE)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblDocumentosPeriodo"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblDocumentosPeriodo")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblDocumentosPeriodo (")
	
	sbCrearTabla.Append("FechaDocumento INTEGER,")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("AlmacenDocumento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmacenFisico TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("TotalQty REAL,")
	sbCrearTabla.Append("TotalImp REAL,")
	sbCrearTabla.Append("Personalizado TEXT COLLATE NOCASE default 'NO',")
'	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaPedido TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaReferencia INTEGER,")
	sbCrearTabla.Append("TipoDocumento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Prioridad TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("Fase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("Gestionado INTEGER default 0,")
	sbCrearTabla.Append("FechaFase INTEGER default 0,")
	sbCrearTabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("NumExpedicion TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("Observaciones TEXT COLLATE NOCASE default '')")
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
	Dim Comando As String="InfoNavControlDocumentosPeriodo"
	Dim sFechaIn As String=DateTime.Date(FechaInicialLong)
	Dim sFechaFin As String=DateTime.Date(FechaFinalLong)
	DateTime.DateFormat=DateFormatAnt
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(sFechaIn,sFechaFin), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	DateTime.DateFormat=DateFormatAnt
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Documentos para el periodo seleccionado.","Aviso")
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
			DBUtils.InsertMaps(mSQL,"tblAlbVtaDepNavLin",lstReg)
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
'				Pnl.LoadLayout("scrItemControlDocumentosPeriodo")
'
'				txtAlmacenDocumento.Text=mData.Get("AlmacenDocumento")
'				txtAlmacenFisico.Text=mData.Get("AlmacenFisico")
'				txtCliente.Text=mData.Get("Cliente")
'				Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaDocumento"), DateTime.Now)
'				txtDiasAcum.Text=PeriodDiasAcum.Days
'				txtDocumento.Text=mData.Get("Documento")
'				txtFase.Text=mData.Getdefault("Fase","")
'				
'				Dim DateFormatAnt As String=DateTime.DateFormat
'				DateTime.DateFormat="dd/MM/yyyy"
'				Dim TimeFormatAnt As String=DateTime.timeFormat
'				DateTime.TimeFormat	="HH:mm"
'				txtFechaDocumento.Text=DateTime.Date(mData.Get("FechaDocumento"))
'				If mData.Getdefault("FechaFase",0)>0 Then
'					txtFechaFase.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
'				End If
'				DateTime.DateFormat=DateFormatAnt
'				DateTime.TimeFormat=TimeFormatAnt
'
'				txtInfoAdicionalFase.Text=mData.Getdefault("InfoAdicionalFase","")
'				txtNombreCliente.Text=mData.Get("NombreCliente")
'				txtObservaciones.Text=mData.Getdefault("Observaciones","")
'				txtPersonalizado.Text=mData.Get("Personalizado")
'				txtPrioridad.Text=mData.Getdefault("Prioridad","")
'				txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
'				txtTipoDocumento.Text=mData.Get("TipoDocumento")
'				Dim TotalImp As Double=mData.Get("TotalImp")
'				txtTotalImp.Text=NumberFormat(TotalImp,1,0)
'				Dim TotalQty As Double=mData.Get("TotalQty")
'				txtTotalQty.Text=NumberFormat(TotalQty,1,0)
'				txtPersonalizado.Text=mData.Get("Personalizado")
'				
'				txtNumExpedicion.Text=mData.GetDefault("NumExpedicion","")
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
	Dim mData As Map=DatosItemIndexCLV.Value
	Dim pnl As B4XView=DatosItemIndexCLV.Panel
	pnl.LoadLayout("scrItemControlDocumentosPeriodo")

	txtAlmacenDocumento.Text=mData.Get("AlmacenDocumento")
	txtAlmacenFisico.Text=mData.Get("AlmacenFisico")
	txtCliente.Text=mData.Get("Cliente")
	Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaDocumento"), DateTime.Now)
	txtDiasAcum.Text=PeriodDiasAcum.Days
	txtDocumento.Text=mData.Get("Documento")
	txtFase.Text=mData.Getdefault("Fase","")
				
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim TimeFormatAnt As String=DateTime.timeFormat
	DateTime.TimeFormat	="HH:mm"
	txtFechaDocumento.Text=DateTime.Date(mData.Get("FechaDocumento"))
	If mData.Getdefault("FechaFase",0)>0 Then
		txtFechaFase.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
	End If
	DateTime.DateFormat=DateFormatAnt
	DateTime.TimeFormat=TimeFormatAnt

	txtInfoAdicionalFase.Text=mData.Getdefault("InfoAdicionalFase","")
	txtNombreCliente.Text=mData.Get("NombreCliente")
	txtObservaciones.Text=mData.Getdefault("Observaciones","")
	txtPersonalizado.Text=mData.Get("Personalizado")
	txtPrioridad.Text=mData.Getdefault("Prioridad","")
	txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
	txtTipoDocumento.Text=mData.Get("TipoDocumento")
	Dim TotalImp As Double=mData.Get("TotalImp")
	txtTotalImp.Text=Utilidades.FormatoNumerico2(TotalImp,1,0,0,True)
	Dim TotalQty As Double=mData.Get("TotalQty")
	txtTotalQty.Text=Utilidades.FormatoNumerico2(TotalQty,1,0,0,True)
	txtPersonalizado.Text=mData.Get("Personalizado")
				
	txtNumExpedicion.Text=mData.GetDefault("NumExpedicion","")
	
	Dim ResponsableFase As String=mData.Get("ResponsableFase")
	Dim NumExpedicion As String=mData.Get("NumExpedicion")
	
	btnTrazabilidadTransporte.Visible= NumExpedicion<>"" And ResponsableFase<>""

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

Private Sub btnTrazabilidadTransporte_Click
	Dim btn As Button=Sender
	
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim ResponsableFase As String=mData.Get("ResponsableFase")
	Dim NumExpedicion As String=mData.Get("NumExpedicion")
	If NumExpedicion<>"" And ResponsableFase<>"" Then
		Dim msa As Object = xui.Msgbox2Async("¿Ver trazabilidad de transporte?", "", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		TrazabilidadTransporte(mData)
		
	End If
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
	End If
	
	
	
End Sub

Private Sub btnSelPrioridad_Click
	
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

Private Sub btnDocNAV_Click
	
End Sub

Sub BorrarDatosBatchAnterioresMaquinaUsuario As ResumableSub
	
	Dim lstCommands As List
	lstCommands.Initialize
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario",Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
	lstCommands.Add(cmd)
	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	
	If result=False Then
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
		'JamLoadingIndicator1.close
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
	Dim rs As ResultSet=mSQL.ExecQuery("select distinct Documento from tblDocumentosPeriodo")
	Do While rs.NextRow
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,rs.GetString("Documento")))
		lstCommands.Add(cmd)
	Loop
	rs.Close
	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	
	If result=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		Return True
	End If
End Sub

Sub BorrarDocumentosAlmacenManualNoEnBatch As ResumableSub
	Dim lstCommands As List
	lstCommands.Initialize
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarDocumentosAlmacenManualNoEnBatch",Array(UUIDSesion))
	lstCommands.Add(cmd)

	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	
	If result=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query BorrarDocumentosAlmacenManualNoEnBatch","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		Return True
	End If
End Sub

Sub CargaDocumentosAlmacenManual As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="DocumentosAlmacenManual"
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
				
				mSQL.AddNonQueryToBatch("update tblDocumentosPeriodo set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, NumExpedicion=?, Observaciones=? where Documento=?", _
					Array(m.Get("Fase"),m.Get("Gestionado"), m.Get("FechaHoraMov"),Utilidades.FixNull(m.Get("ResponsableFase")),Utilidades.FixNull(m.Get("InfoAdicionalFase")), Utilidades.FixNull(m.Get("NumExpedicion")),Utilidades.FixNull(m.Get("Obs")), m.Get("Documento")))
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


Private Sub btnGetInfo_Click
	If FechaFinalLong=0 Or FechaInicialLong=0 Then
		Dim msa As Object=xui.MsgboxAsync("Indica fecha inicial y fecha final.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If FechaFinalLong<FechaInicialLong Then
		Dim msa As Object=xui.MsgboxAsync("La fecha final no puede ser anterior a la fecha inicial.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	ActualizarDatos
End Sub

Private Sub btnSelFechaFinal_Click
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	Dialog.Title="Indica Fecha Final"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaFinalLong=0 Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=FechaFinalLong
	End If
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	Dim FechaFinSel As Long=B4XDateDlg.Date
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim FechaFinalHora As Long=FechaFinSel
	FechaFinalLong=DateUtils.SetDate(DateTime.GetYear(FechaFinalHora),DateTime.GetMonth(FechaFinalHora),DateTime.GetDayOfMonth(FechaFinalHora))
	FechaFinalLong=FechaFinalLong+DateTime.TicksPerDay-1
	txtFechaFinal.Text=DateTime.Date(FechaFinalLong)
	Log(DateUtils.TicksToString(FechaFinalLong))
	
	If FechaInicialLong=0 Then
		FechaInicialLong=FechaFinalLong
		txtFechaInicial.Text=DateTime.date(FechaInicialLong)
	End If
	
	DateTime.DateFormat=DateFormatAnt
	
End Sub

Private Sub btnSelFechaInicial_Click
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	Dialog.Title="Indica Fecha Inicial"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaInicialLong=0 Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=FechaInicialLong
	End If
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	Dim FechaInSel As Long=B4XDateDlg.Date
	
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"

	FechaInicialLong=DateUtils.SetDate(DateTime.GetYear(FechaInSel),DateTime.GetMonth(FechaInSel),DateTime.GetDayOfMonth(FechaInSel))
	txtFechaInicial.Text=DateTime.date(FechaInicialLong)
	Log(DateUtils.TicksToString(FechaInicialLong))
	
	If FechaFinalLong=0 Then
		FechaFinalLong=FechaInicialLong
		txtFechaFinal.Text=DateTime.date(FechaFinalLong)
	End If
	DateTime.DateFormat=DateFormatAnt
	
End Sub

Sub TrazabilidadTransporte(mData As Map)
	Dim Transporte As String=mData.Get("ResponsableFase")
	Transporte=Transporte.ToUpperCase
	Dim Expedicion As String=mData.Get("NumExpedicion")
	Expedicion=Expedicion.ToUpperCase
	Select Case Transporte
		
		Case "DHL"
			
			Dim ExpedicionDHL As String
			If Expedicion.Length>=20 Then
				ExpedicionDHL=Expedicion.SubString2(8,10)&Expedicion.SubString2(12,20)
			Else
				ExpedicionDHL=Expedicion
			End If
			fx.ShowExternalDocument("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo=" & ExpedicionDHL & "&anno=2017&lang=sp")

		Case "TXT"
			wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedicionTXT(Expedicion)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				Dim URLtxt As String=mRes.Get("URL")
				If URLtxt<>"" Then
					fx.ShowExternalDocument(URLtxt)
				Else
					Dim msa As Object=xui.MsgboxAsync("Método UrlTracking TXT devuelve cadena vacía." ,"Error")
					Wait For (msa) Msgbox_Result
				End If
			End If

		Case "CORREOS EXPRESS"
			Dim cInfoExpedCorreosExp As cInfoExpedicionCorreosExpress
			cInfoExpedCorreosExp.Initialize(Expedicion)
			cInfoExpedCorreosExp.Show
			
		Case Else
			Dim msa As Object=xui.MsgboxAsync("No es posible obtener información de trazabilidad de esta expedición mediante este formulario." & _
				CRLF & CRLF & "Consultar con Logística." ,"Error")
			Wait For (msa) Msgbox_Result

	End Select
	
	
End Sub
