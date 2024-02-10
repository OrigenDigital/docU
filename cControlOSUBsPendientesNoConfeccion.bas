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

	
	Private TimestampBatchFaseDocs As Long
	Private UUIDSesion As String
	
	Private PrimerAvisoInfoEstablecerPrioridad As Boolean
	Private btnFasesDoc As Button
	Private btnMostrarDocumentoEnNavision As Button
	Private btnSelFechaRequerida As Button
	Private btnSelPrioridad As Button
	Private txtAreaFaseActual As TextField
	Private txtArticulo As TextField
	Private txtDescripcion As TextField
	Private txtFaseActual As TextField
	Private txtFechaFaseActual As TextField
	Private txtFechaOF As TextField
	Private txtFechaRequerida As TextField
	Private txtFinalizaProducto As TextField
	Private txtInfoAdicionalFaseActual As TextField
	Private txtNombreProveedor As TextField
	Private txtObservaciones As TextField
	Private txtOSUB As TextField
	Private txtPrioridad As TextField
	Private txtProveedor As TextField
	Private txtQtyPte As TextField
	Private txtRequiereTransferenciaComponentes As TextField
	Private txtRuta As TextField
	Private txtDiasAcumulados As TextField
	
	Private FechaHoyHora0 As Long
	Private txtCliente As TextField
	Private txtNombreCliente As TextField
	Private txtNombreResponsableCuenta As TextField
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
	frm.RootPane.LoadLayout("scrControlOSUBsPendientesNoConfeccion")
	Sleep(0)
	
		
	frm.Title=Main.PrefijoTitleForms & "Control OSUBs Pendientes No Confección"
		
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
	''
	'(*) añadir Menu Items
	'JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarAcciones,True)
	'JamTableCLV1.AddMenuItemToMenuInMenuBar("test","test",JamTableCLV1.MenuBarAcciones)
	
	Dim rSub As ResumableSub=JamTableCLV1.ConfigurarTableCLV("ListaControlOSUBsPendientesNoCorteNoConfeccion.json")
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarLinea,False)
'	JamTableCLV1.AddMenuItemFontAwesomeToMenuInMenuBar("Ver Fecha Inicio Control","VerFechaInicioControl",Chr(0xF274),JamTableCLV1.MenuBarAcciones)
	JamTableCLV1.AddMenuItemFontMaterialIconsToMenuInMenuBar("Resetear Prioridades","ResetearPrioridades",Chr(0xE16D),JamTableCLV1.MenuBarAcciones)
	
	'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
	'JamTableCLV1.AlturaItems=180dip
	JamTableCLV1.AlturaItems=210dip
	JamTableCLV1.ColorSeparadorPaneles=0xFF696969
	JamTableCLV1.AlturaSeparadorPaneles=2dip
	JamTableCLV1.ColorPanelSeleccionado=0xFF87CEFA

	JamTableCLV1.ModoSeleccionItems=JamTableCLV1.ModoSeleccionIndividualPerm 

	ActualizarDatos
End Sub



Sub ActualizarDatos
	
	JamTableCLV1.Clear
	
	mSQL.ExecNonQuery("delete from tblPedFabPtesNoCorteNoConf")
	mSQL.ExecNonQuery("delete from tblOSUBsPendientesNoCorteNoConf")
	
	FechaHoyHora0=DateUtils.SetDate(DateTime.GetYear(DateTime.Now), DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now))
	
	'btnSalir.Enabled=False
	Wait For(ActualizarDatosOSUBsPtesNAV) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	

	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("insert into tblOSUBsPendientesNoCorteNoConf (OSUB, FechaOSUB, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta, QtyPte, TransfComp, FinalizaProducto)")
	sb.Append(" Select PedidoFab As OSUB, FechaPedido As FechaOSUB, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta,sum(QtyPte) as QtyPte, TransfComp, FinalizaProducto")
	sb.Append(" from tblPedFabPtesNoCorteNoConf group by PedidoFab, FechaPedido, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta,TransfComp, FinalizaProducto")
	mSQL.ExecNonQuery(sb.ToString)

	wait for(BorrarDatosBatchAnterioresUUIDSesion) complete (rBool As Boolean)
	If rBool=False Then
		SalirModulo
		Return
	End If
	
	wait for(InsertarLineasBatchDocumentos) complete (rBool As Boolean)
	If rBool=False Then
		SalirModulo
		Return
	End If
	
	wait for(FaseActualDocumentosBacthUUID) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	
'''''	wait for(BorrarPrioridadesOrdenesFabNoEnBatch) complete (rBool As Boolean)
'''''	If rBool=False Then
'''''		SalirModulo
'''''		Return
'''''	End If
	
'	wait for(CargaPrioridadesDocumentos) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="Salir" Then
'		SalirModulo
'		Return
'	End If
'	If Accion="OK" Then
'		Dim lstReg As List=mRes.Get("lstReg")
'		For Each m As Map In lstReg
'			Dim DocPrioridad As String=m.Get("Documento")
'			Dim Prioridad As Int=m.Get("Prioridad")
'			Dim NombrePrioridad As String=m.Get("NombrePrioridad")
'			mSQL.ExecNonQuery2("update tblOSUBsPendientesNoCorteNoConf set Prioridad=?, NombrePrioridad=? where Documento=?",Array As Object(Prioridad,NombrePrioridad, DocPrioridad))
'		Next
'	End If
	
	
	wait for(FechasPrioridadVentasDocumentosBacthUUID) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	
	mSQL.ExecNonQuery2("update tblOSUBsPendientesNoCorteNoConf set Fase=? where Fase=?",Array As Object("NO INICIADO",""))

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblOSUBsPendientesNoCorteNoConf")
	Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
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


	Dim msa As Object=xui.MsgboxAsync("Datos actualizados.","Aviso")
	Wait For (msa) Msgbox_Result
	
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

			
		Case "ResetearPrioridades"
			Dim msa As Object=xui.MsgboxAsync("Función deshabilitada." & CRLF & CRLF & "Si es necesaria su utilización , avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			Return
			
			ResetearPrioridades
			
		Case "EjemploAccionLineasSeleccionadas"
			Dim lstDatosLineasSeleccionadas As List=JamTableCLV1.GetDatosItemsSeleccionados
			For Each mData As Map In lstDatosLineasSeleccionadas
				LogColor("DatosLineaSeleccionada : " & mData, xui.Color_Blue)
			Next
		Case "
	End Select
End Sub

Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblPedFabPtesNoCorteNoConf"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblPedFabPtesNoCorteNoConf")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblPedFabPtesNoCorteNoConf (")
	
	
	sbCrearTabla.Append("PedidoFab TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaPedido INTEGER,")
	sbCrearTabla.Append("Proveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreProveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Descripcion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("RutaOF TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("ResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("QtyRec REAL,")
	sbCrearTabla.Append("QtyPte REAL,")
	sbCrearTabla.Append("FechaRequerida REAL default 0,")
	sbCrearTabla.Append("TransfComp INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FinalizaProducto INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblOSUBsPendientesNoCorteNoConf"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblOSUBsPendientesNoCorteNoConf")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblOSUBsPendientesNoCorteNoConf (")
	
	
	sbCrearTabla.Append("OSUB TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaOSUB INTEGER,")
	sbCrearTabla.Append("Proveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreProveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Descripcion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("RutaOF TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("ResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("QtyPte REAL,")
	sbCrearTabla.Append("TransfComp INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FinalizaProducto INTEGER DEFAULT 0,")
	sbCrearTabla.Append("PrioridadVentas INTEGER DEFAULT 0,")
	sbCrearTabla.Append("NombrePrioridadVentas TEXT COLLATE NOCASE default 'Sin Prioridad',")
	sbCrearTabla.Append("FechaRequeridaVentas INTEGER DEFAULT 0,")
	sbCrearTabla.Append("IDFase INTEGER DEFAULT 0,")
	sbCrearTabla.Append("AreaFase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("Fase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("FechaFase INTEGER default 0,")
	sbCrearTabla.Append("Gestionado INTEGER default 0,")
	sbCrearTabla.Append("IDResponsableFase INTEGER default 0,")
	sbCrearTabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("IDInfoAdicionalFase INTEGER default 0,")
	sbCrearTabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',")
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


Sub ActualizarDatosOSUBsPtesNAV As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblPedFabPtesNoCorteNoConf")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="yyyy-MM-dd"
'	Dim sFechaInicioControlNAV As String=DateTime.Date(FechaInicioControl)
'	DateTime.DateFormat=DateFormatAnt
	Dim Comando As String="InfoPedidosFabPtesNoCorteNoConfeccion"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)
	
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
			Dim msa As Object=xui.MsgboxAsync("No hay datos de OSUBs Pendientes No Corte No Confección","Aviso")
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
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblPedFabPtesNoCorteNoConf",lstReg)
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
'				Pnl.LoadLayout("scrItemControlPedidosFabNoConfeccion")
'
'
'				txtOSUB.Text=mData.Get("OSUB")
'				txtFaseActual.Text=mData.Getdefault("Fase","")
'				Dim txtfaseB As B4XView=txtFaseActual
'				txtfaseB.TextColor=0xFFB22222
'				
'				txtRuta.Text=mData.Get("RutaOF")
''				
'				Dim DateFormatAnt As String=DateTime.DateFormat
'				DateTime.DateFormat="dd/MM/yyyy"
'				Dim TimeFormatAnt As String=DateTime.timeFormat
'				DateTime.TimeFormat	="HH:mm"
'				txtFechaOF.Text=DateTime.Date(mData.Get("FechaOSUB"))
'				If mData.Getdefault("FechaFase",0)>0 Then
'					txtFechaFaseActual.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
'				End If
'				Dim txtFechaFaseB As B4XView=txtFechaFaseActual
'				txtFechaFaseB.TextColor=0xFFB22222
'				DateTime.DateFormat=DateFormatAnt
'				DateTime.TimeFormat=TimeFormatAnt
'				
'				Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaOSUB"), DateTime.Now)
'				txtDiasAcumulados.Text=PeriodDiasAcum.Days
'
'				txtInfoAdicionalFaseActual.Text=mData.Getdefault("InfoAdicionalFase","")
'				Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFaseActual
'				txtInfoAdfaseB.TextColor=0xFFB22222
'				txtProveedor.Text=mData.Get("Proveedor")
'				txtNombreProveedor.Text=mData.Get("NombreProveedor")
'				txtObservaciones.Text=mData.Getdefault("Observaciones","")
'				Dim txtObservacionesB As B4XView=txtObservaciones
'				txtObservacionesB.TextColor=0xFFC71585
'				txtArticulo.Text=mData.Get("Articulo")
'				txtDescripcion.Text=mData.Get("Descripcion")
''				txtPrioridad.Text=mData.Getdefault("NombrePrioridad","Sin Prioridad")
''				txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
''				Dim txtResponsableFaseB As B4XView=txtResponsableFase
''				txtResponsableFaseB.TextColor=0xFFB22222
''				txtTipoDocumento.Text=mData.Get("TipoDocumento")
''				Dim TotalImp As Double=mData.Get("TotalImp")
''				txtTotalImp.Text=NumberFormat(TotalImp,1,0)
'				If 0=mData.get("FinalizaProducto") Then
'					txtFinalizaProducto.Text="NO"
'				Else
'					txtFinalizaProducto.Text="SI"
'					Dim txtFinalizaProductoB As B4XView=txtFinalizaProducto
'					txtFinalizaProductoB.Color=0xFF7FFF00
'				End If
'				
'				If 0=mData.get("TransfComp") Then
'					txtRequiereTransferenciaComponentes.Text="NO"
'				Else
'					txtRequiereTransferenciaComponentes.Text="SI"
'				End If
'				
'				Dim QtyPte As Double=mData.Get("QtyPte")
'				txtQtyPte.Text=NumberFormat(QtyPte,1,0)
''				txtPersonalizado.Text=mData.Get("Personalizado")
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
	Dim Pnl As B4XView=DatosItemIndexCLV.Panel
	Pnl.LoadLayout("scrItemControlPedidosFabNoConfeccion2")


	txtOSUB.Text=mData.Get("OSUB")
	txtFaseActual.Text=mData.Getdefault("Fase","")
	Dim txtfaseB As B4XView=txtFaseActual
	txtfaseB.TextColor=0xFFB22222
	
	txtAreaFaseActual.Text=mData.get("AreaFase")
				
	txtRuta.Text=mData.Get("RutaOF")
'				
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim TimeFormatAnt As String=DateTime.timeFormat
	DateTime.TimeFormat	="HH:mm"
	txtFechaOF.Text=DateTime.Date(mData.Get("FechaOSUB"))
	If mData.Getdefault("FechaFase",0)>0 Then
		txtFechaFaseActual.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
	End If
	Dim txtFechaFaseB As B4XView=txtFechaFaseActual
	txtFechaFaseB.TextColor=0xFFB22222
	DateTime.DateFormat=DateFormatAnt
	DateTime.TimeFormat=TimeFormatAnt
				
	Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaOSUB"), DateTime.Now)
	txtDiasAcumulados.Text=PeriodDiasAcum.Days

	txtInfoAdicionalFaseActual.Text=mData.Getdefault("InfoAdicionalFase","")
	Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFaseActual
	txtInfoAdfaseB.TextColor=0xFFB22222
	txtProveedor.Text=mData.Get("Proveedor")
	txtNombreProveedor.Text=mData.Get("NombreProveedor")
	txtObservaciones.Text=mData.Getdefault("Observaciones","")
	Dim txtObservacionesB As B4XView=txtObservaciones
	txtObservacionesB.TextColor=0xFFC71585
	txtArticulo.Text=mData.Get("Articulo")
	txtDescripcion.Text=mData.Get("Descripcion")
'				txtPrioridad.Text=mData.Getdefault("NombrePrioridad","Sin Prioridad")
'				txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
'				Dim txtResponsableFaseB As B4XView=txtResponsableFase
'				txtResponsableFaseB.TextColor=0xFFB22222
'				txtTipoDocumento.Text=mData.Get("TipoDocumento")
'				Dim TotalImp As Double=mData.Get("TotalImp")
'				txtTotalImp.Text=NumberFormat(TotalImp,1,0)
	If 0=mData.get("FinalizaProducto") Then
		txtFinalizaProducto.Text="NO"
	Else
		txtFinalizaProducto.Text="SI"
		Dim txtFinalizaProductoB As B4XView=txtFinalizaProducto
		txtFinalizaProductoB.Color=0xFF7FFF00
	End If
				
	If 0=mData.get("TransfComp") Then
		txtRequiereTransferenciaComponentes.Text="NO"
	Else
		txtRequiereTransferenciaComponentes.Text="SI"
	End If
				
	Dim QtyPte As Double=mData.Get("QtyPte")
	txtQtyPte.Text=Utilidades.FormatoNumerico2(QtyPte,1,0,0,True)
	
	Dim FechaReqVtas As Long=mData.Get("FechaRequeridaVentas")
	If FechaReqVtas=0 Then
		txtFechaRequerida.Text=""
	Else
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yyyy"
		txtFechaRequerida.Text=DateTime.Date(FechaReqVtas)
		If FechaHoyHora0>FechaReqVtas Then
			Dim txtFechaRequeridaVentasB As B4XView=txtFechaRequerida
			txtFechaRequeridaVentasB.TextColor=xui.Color_Red
			txtFechaRequeridaVentasB.Font=xui.CreateDefaultBoldFont(12)
			'txtFechaRequeridaVentasB.SetColorAndBorder(xui.Color_Red,1dip,xui.Color_Gray,3)
		End If

'	If DateUtils.IsSameDay(FechaHoyHora0,mData.Get("FechaRequeridaVentas")) Then
'		Dim txtFechaRequeridaVentasB As B4XView=txtFechaRequerida
'		txtFechaRequeridaVentasB.TextColor=xui.Color_Black
'		txtFechaRequeridaVentasB.SetColorAndBorder(0xA5FFA500,1dip,xui.Color_Gray,3)
'	End If
		DateTime.DateFormat=DateFormatAnt
	End If

	txtCliente.Text=mData.Get("Cliente")
	txtNombreCliente.Text=mData.Get("NombreCliente")
	txtNombreResponsableCuenta.Text=mData.Get("ResponsableCuenta")
	Dim B4xtF As B4XView=txtNombreResponsableCuenta
	'B4xtF.Color=0xFFFFA500
	B4xtF.SetColorAndBorder(0xFFFFA500,1dip,0xFF696969,3)
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
	End If
	
	
	JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set AlmacenFisico=? where Documento=?",Array As String(AlmFis,DocSel))
	JamTableCLV1.SQL.ExecNonQuery2("update tblOSUBsPendientesNoCorteNoConf set AlmacenFisico=? where Documento=?",Array As String(AlmFis,DocSel))
	
'	mData.Put("AlmacenFisico",AlmFis)
'	Dim pnlSel As B4XView=JamTableCLV1.GetPanel(IndexSel)
'	JamTableCLV1.ReemplazarItem(IndexSel,pnlSel,pnlSel.Height,mData)
'	Sleep(0)

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
	
	Dim DocSel As String=mData.Get("OSUB")
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
			Exit
		End If
	Next
	mData.Put("Prioridad",PrioridadSel)
	mData.Put("NombrePrioridad",NombrePrioridadSel)
	JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set PrioridadVentas=?, NombrePrioridadVentas=? where OSUB=?",Array As Object(PrioridadSel, NombrePrioridadSel, DocSel))
	
End Sub

Private Sub btnFasesDoc_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	'Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim DocSel As String=mData.Get("OSUB")
	
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
	Dim rs As ResultSet=mSQL.ExecQuery("select distinct OSUB from tblOSUBsPendientesNoCorteNoConf")
	Do While rs.NextRow
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,rs.GetString("OSUB")))
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

'
'''''Sub BorrarPrioridadesOrdenesFabNoEnBatch As ResumableSub
'''''	Dim lstCommands As List
'''''	lstCommands.Initialize
'''''	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarPrioridadDocumentosNoEnBatch",Array(UUIDSesion,""))
'''''	lstCommands.Add(cmd)
'''''
'''''	JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosComunes,lstCommands,Me)
'''''	Wait For EjecutarBatch_Completed (result As Boolean)
'''''	
'''''	If result=False Then
'''''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query BorrarPrioridadDocumentosNoEnBatch","Error")
'''''		Wait For (msa) Msgbox_Result
'''''		Return False
'''''	Else
'''''		Return True
'''''	End If
'''''End Sub

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
				
				mSQL.AddNonQueryToBatch("update tblOSUBsPendientesNoCorteNoConf set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, Observaciones=? where OSUB=?", _
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

'
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
'			DBUtils.InsertMaps(mSQL,"tblPedFabPtesNoCorteNoConf",lstReg)
'		End If
'	End If
'	Return mRes
'End Sub

Private Sub btnMostrarDocumentoEnNavision_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim DocSel As String=mData.Get("OSUB")
'	Select True
'		Case DocSel.StartsWith("ALBV")
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico Albaranes Venta",130, "No.", DocSel)
'		Case DocSel.StartsWith("RT")
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico recep. transferencia",5745, "No.", DocSel)
'		Case DocSel.StartsWith("CDEV")
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico envío devolución",6650, "No.", DocSel)
'	End Select

	Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Orden producción",50147, "No.", DocSel)
	
	
	'frm.RootPane.MouseCursor=fx.Cursors.WAIT
	
	wait for(rSub) complete (success As Boolean)
	'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	If success Then

	Else
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir la ficha de la OSUB " & DocSel & " en NAVISION." ,"Error")
		Wait For (msa) Msgbox_Result
	End If
End Sub

'Sub CargarFechaInicioControl As ResumableSub
'	Dim Accion As String
''	Dim mRes As Map
''	mRes.Initialize
'
'	Dim Comando As String="FechaInicioControlDocumentosNoGestionados"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
'	
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="Salir"
'		'mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
'			Accion="Salir"
'			'mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de Fecha Inicio Control","Error")
'			Wait For (msa) Msgbox_Result
'		Else
'			Accion="OK"
'			'mRes.Put("Accion", Accion)
'
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mFecha As Map=lstReg.Get(0)
'			FechaInicioControl=mFecha.GetValueAt(0)
'			Dim DateFormatAnt As String=DateTime.DateFormat
'			DateTime.DateFormat="dd/MM/yyyy"
'			sFechaInicioControl=DateTime.Date(FechaInicioControl)
'			DateTime.DateFormat=DateFormatAnt
'		End If
'	End If
'	Return Accion
'End Sub


Sub FechasPrioridadVentasDocumentosBacthUUID As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"FechasPrioridadVentasDocumentosBacthUUID",Array(UUIDSesion), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query FechasPrioridadVentasDocumentosBacthUUID","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="SinFechasPrioridadVentasOSUBsPendientes"
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
				mSQL.AddNonQueryToBatch("update tblOSUBsPendientesNoCorteNoConf set PrioridadVentas=?, NombrePrioridadVentas=?, FechaRequeridaVentas=? where OSUB=?", _
					Array(m.Get("IDPrioridadVentas"), m.Get("PrioridadVentas"),m.Get("FechaVentasLong"), m.Get("PedidoFab")))
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

Sub ResetearPrioridades
	Dim NumDocsConPrioridad As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblOSUBsPendientesNoCorteNoConf where Gestionado=? and Prioridad<>?",Array As String(0,"")))
	If NumDocsConPrioridad=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay ninguna OSUB con prioridad establecida.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim msa As Object = xui.Msgbox2Async("¿Resetear todas las prioridades de OSUBs establecidas?" & CRLF & CRLF & "Esta acción no es reversible.", "Confirma", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstComandos As List
	lstComandos.Initialize

	Dim cmd As DBCommand = JRDCQuery.CreateCommand("ResetearPrioridadesDocumentosNoGestionados",Null)
	lstComandos.Add(cmd)
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible resetear las prioridades de las OSUBs.","Error")
		Wait For (msa) Msgbox_Result
	Else
		Dim msa As Object=xui.MsgboxAsync("Se han reseteado todas las prioridades de las OSUBs.","Aviso")
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




Private Sub btnSelFechaRequerida_Click
	
	'''' PENDIENTE DE SINCRONIZAR ACCESS Y MYSQL!!!
	
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(Sender)
	EditarFechaRequeridaVentas(IndexSel, mData)
End Sub
Sub EditarFechaRequeridaVentas(IndexSel As Int, mData As Map)


	Log(mData)
	Dim OSUBSel As String=mData.Get("OSUB")
	Dim IDPrioridadVentas As Int=mData.Get("PrioridadVentas")


	Dim offset_before_dialog As Float= JamTableCLV1.sv.ScrollViewOffsetY

	Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel)
	'Dim hPnl As Int=pnl.Height
	Dim FechaActual As Long=mData.Get("FechaRequeridaVentas")
	If FechaActual>0 Then
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yy"
		Dim sFechaActual As String=DateTime.Date(FechaActual)
		DateTime.DateFormat=DateFormatAnt
		'Dim offset_before_dialog As Float= JamTableCLV1.sv.ScrollViewOffsetY
		''		Dim msg As jamMsgDialogBBCodeView
		''		msg.Initialize(Me,"jamMsgDialogBBCodeView1",frm.RootPane, "Aviso","Ya hay una fecha requerida a taller grabada para la OSUB " & OSUBSel & " (" & sFechaActual & ")." & CRLF & CRLF & "¿Editar la fecha requerida a taller?")
		''		'msg.Initialize(frm.RootPane, "Aviso","Ya hay una fecha prometida taller grabada para la OSUB " & OSUBSel & " (" & sFechaPromTActual & ")." & CRLF & CRLF & "¿Editar la fecha prometida?")
		''		msg.TextoBotonPositive="SI"
		''		msg.TextoBotonNegative="NO"
		''		msg.ColorFondoTitulo=0xFFB22222
		''		msg.AnchoDialogo=500dip
		''		msg.ColorOverlay=xui.Color_Transparent
		''		msg.TamanoFuenteTextoMensaje=16
		''		Wait For(msg.MostrarAviso) complete (rInt As Int)
		Dim msa As Object = xui.Msgbox2Async("Ya hay una fecha Requerida Ventas grabada para la OSUB " & OSUBSel & " (" & sFechaActual & ")." & CRLF & CRLF & "¿Editar la Fecha Requerida de Ventas?", "Aviso", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
		If rInt <>xui.DialogResponse_Positive Then Return
	End If
	
	Dialog.Title="Indica Fecha Requerida Ventas"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaActual>0 Then
		B4XDateDlg.Date=FechaActual
	Else
		B4XDateDlg.Date=DateTime.Now
	End If
	'B4XDateDlg.Date=DateTime.Now
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	If FechaActual>0 Then
		Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","Borrar","Cancelar")
	Else
		Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	End If
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt=xui.DialogResponse_Cancel Then
'		Dim msg As jamMsgDialogBBCodeView
'		msg.Initialize(Me,"jamMsgDialogBBCodeView1",frm.RootPane, "Aviso","No se ha seleccionado fecha." & CRLF)
'		msg.AltoDialogo=250dip
'		msg.ColorFondoTitulo=0xFFFF4500
'		Wait For(msg.MostrarAviso) complete (rInt As Int)
		Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado fecha." & CRLF,"Aviso")
		Wait For (msa) Msgbox_Result
		'JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
		Return
	End If
	If rInt=xui.DialogResponse_Negative Then
		Dim FechaRequeridaVentas As Long=0
	Else
		Dim FechaRequeridaVentas As Long=B4XDateDlg.Date
	End If
	'Dim FechaPrometidaTaller As Long=B4XDateDlg.Date
	
	Wait For(ActualizarFechaGestionOrden(1,OSUBSel,FechaRequeridaVentas,0,Main.DatosUsuario.NombreUsuarioWindows)) complete (Accion As String)
	If Accion="OK" Then
		JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set [FechaRequeridaVentas]=?",Array(FechaRequeridaVentas))
		mData.put("FechaRequeridaVentas", FechaRequeridaVentas)
		'JamTableCLV1.ReemplazarItem(IndexSel, pnl, hPnl,mData)
		For Each n As Node In pnl.GetAllViewsRecursive
			If n.Tag="FechaRequeridaVentas" Then
				Dim B4xtF As B4XView=n
				If FechaRequeridaVentas=0 Then
					B4xtF.Text=""
				Else
					Dim DateFormatAnt As String=DateTime.DateFormat
					DateTime.DateFormat="dd/MM/yyyy"
					B4xtF.Text=DateTime.Date(FechaRequeridaVentas)
					If DateUtils.IsSameDay(DateTime.Now,FechaRequeridaVentas) Then
						B4xtF.TextColor=xui.Color_Red
					End If
					DateTime.DateFormat=DateFormatAnt
				End If

				Exit
			End If
		Next
'		Dim msg As jamMsgDialog
'		msg.Initialize(frm.RootPane, "Aviso","Fecha Prometida Taller Modificada")
'		msg.TextoBotonPositive="OK"
'		msg.TextoBotonNegative=""
'		msg.TextoBotonCancel=""
'		msg.ColorFondoTitulo=0xFFB22222
'		Wait For(msg.MostrarAviso) complete (rInt As Int)

		wait for(ActualizarTblPrioridadesPedidosFab(OSUBSel,IDPrioridadVentas,FechaRequeridaVentas,Main.DatosUsuario.NombreUsuarioWindows)) complete (Success As Boolean)
'		If Success=False Then
'			
'		End If

	End If
	
End Sub

Sub ActualizarFechaGestionOrden(IDTipoF As Int,OrdenF As String,FechaL As Long,IDU As Int,NombreUsu As String) As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"NuevaFechaGestionOrdenFab",Array As String(IDTipoF,OrdenF,FechaL,IDU,NombreUsu), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query NuevaFechaGestionOrdenFab","Error")
		Wait For (msa) Msgbox_Result
		Accion="Error"
	Else
		If mResult.Get("ReqOK")=False Then
			' este resultado no puede darse aquí
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mReg As Map=lstReg.Get(0)
			Dim sResp As String=mReg.GetValueAt(0)
			If sResp<>"OK" Then
				Dim msa As Object=xui.MsgboxAsync(sResp & CRLF & CRLF & "No se ha actualizado la fecha","Error")
				Wait For (msa) Msgbox_Result
				Accion="Error"
			Else
				Accion="OK"
			End If
		End If
	End If
	Return Accion
End Sub


'''''PROCESO PENDIENTE DE ELIMINAR, CUANDO SE ELIMINE EL ACCESS "TACITA"
Sub ActualizarTblPrioridadesPedidosFab(PedidoFab As String, Prioridad As Int,FechaRequeridaLong As Long, Usuario As String) As ResumableSub
	Dim FechaExcel As Int=TicksToExcelDate(FechaRequeridaLong)
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("ActualizarPrioridadOrdenesFab",Array(PedidoFab, Prioridad,FechaExcel, Usuario, Prioridad,FechaExcel,Usuario))
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar la tabla tblprioridadespedidosfab.","Error")
		Wait For (msa) Msgbox_Result
	End If
	Return Success
	
End Sub

Public Sub ExcelDateToString(t As Long) As String
	Dim ExcelUnixDiff As Long=25569             'days between Jan 01 1900 and Jan 01 1970
	Dim  DaySecs As Long=86400             'number of seconds in a day
	Dim val As Long
	val=  (t - ExcelUnixDiff) * DaySecs
	val=DateUtils.UnixTimeToTicks(val)
	DateTime.DateFormat="dd-MMM-yyyy"
	Return(DateTime.Date(val))
 
End Sub

Public Sub TicksToExcelDate(t As Long) As String
    Dim ExcelUnixDiff As Long=25569             'days between Jan 01 1900 and Jan 01 1970
   ' Dim  DaySecs As Long=86400             'number of seconds in a day
	
	
	Dim p As Period=DateUtils.PeriodBetweenInDays(0,t)
	Dim DiasDesde0101970 As Int=p.Days

	
	Dim DiasExcel As Int=ExcelUnixDiff+DiasDesde0101970+1 ' importante sumar este día, para que incluya el dia en cuestión
	Log("DiasExcel " & DiasExcel)
    Return(DiasExcel)
 
End Sub




Private Sub btnMostrarDocumentoEnNavision_MousePressed (EventData As MouseEvent)
	Dim b As Button=Sender
	CSSUtils.SetBorder(b,2,fx.Colors.From32Bit(0xFF00FFFF),0)
End Sub

Private Sub btnMostrarDocumentoEnNavision_MouseReleased (EventData As MouseEvent)
	Dim b As Button=Sender
	CSSUtils.SetBorder(b,2,fx.Colors.From32Bit(0xFF87CEFA),0)
End Sub