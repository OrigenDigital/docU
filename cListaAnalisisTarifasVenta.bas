B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@

Sub Class_Globals

	Private fx As JFX
	Private xui As XUI
	Private frm As Form

	'
	Private btnSalir As Button
	Private jamTableView1 As jamTableView
	
	Dim Dialog As B4XDialog
	Dim mSQL As SQL
	
	Public PermisoModuloUsuario As String
	
	Private jFormReg As jamFormRegistro
	
	Private jamLoadingIndicator1 As JamLoadingIndicator
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub Show
	'If frm.IsInitialized=False Then
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	frm.RootPane.LoadLayout("scrListaAnalisisTarifasVenta")
	Sleep(0)
	
	frm.Title=Main.PrefijoTitleForms & "Lista Análisis Tarifas Venta"
	
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	CreacionTablasSQLite
	
	' EJEMPLOS de MENUS
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Nuevo Análisis Tarifas Venta","NuevoAnalisisTarifasVenta",Chr(0xF196),jamTableView1.MenuBarAcciones)
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Ficha Análisis Tarifas Venta","FichaAnalisisTarifasVenta",Chr(0xF0F6),jamTableView1.MenuBarLinea)
	jamTableView1.AddContextMenuItemSeparator
	jamTableView1.AddContextMenuItemFontAwesomeText("Ficha Análisis Tarifas Venta","FichaAnalisisTarifasVenta",Chr(0xF0F6))
'		
'	jamTableView1.AddContextMenuItemSeparator
'	Dim img As Image
'	img.InitializeSample(File.DirAssets,"navision.png",24,24)
'	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
'	jamTableView1.AddContextMenuItemImage("Articulo NAV","VerArticuloNAV",img)
'	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")

' Usar las 2 siguientes lineas para abrir el CampoBuilder		
'	jamTableView1.AbrirCamposBuilder
'	Return
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaAnalisisTarifasVenta.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
	
	
	' EJEMPLOS DE CELLFACTORIES
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFecha
	CF.CellFactoryEnCallBack=False
	CF.params=Null
	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaCreacionLong","FechaModificacionLong"))
	
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("Estado"),"ABIERTO",0x00FFFFFF,xui.Color_Green,0x00FFFFFF,xui.Color_Red)
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("EstadoVentas"),"PENDIENTE",0x00FFFFFF,xui.Color_Green,0x00FFFFFF,xui.Color_Red)
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("EstadoCostesFabricacionCorte"),"PENDIENTE",0x00FFFFFF,xui.Color_Green,0x00FFFFFF,xui.Color_Red)
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("EstadoCostesFabricacionNoCorte"),"PENDIENTE",0x00FFFFFF,xui.Color_Green,0x00FFFFFF,xui.Color_Red)
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("EstadoCostesImportacion"),"PENDIENTE",0x00FFFFFF,xui.Color_Green,0x00FFFFFF,xui.Color_Red)
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("EstadoCostesCompra"),"PENDIENTE",0x00FFFFFF,xui.Color_Green,0x00FFFFFF,xui.Color_Red)
		
'	Dim CF As DatosCellFactoryJamTableView
'	CF.Initialize
'	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
'	CF.CellFactoryEnCallBack=False
'	CF.params=Null
'	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("NombreProveedor","DescripcionArticulo"))
'		
'	Dim CF As DatosCellFactoryJamTableView
'	CF.Initialize
'	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'	CF.CellFactoryEnCallBack=False
'	CF.params=Null
'	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPrometidaVencida","PendienteSeguimiento"))
'		
'	Dim dCF As DatosCellFactoryJamTableView
'	dCF.Initialize
'	dCF.AliasCampoColumna="ExcluidoReclamacion"
'	dCF.CellFactoryEnCallBack=False
'	dCF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'	jamTableView1.SetCellFactory(dCF)
'		
'	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("PendienteSeguimiento","Pendiente Seguimiento:" & CRLF & "  - SIN Fecha Prometida" & CRLF & "o" & CRLF &  " - Fecha Prometida Vencida" ,"lightyellow","black",16)

		
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	'End If

	
	frm.Show
	
	ActualizarDatos

End Sub

private Sub asJO(o As JavaObject) As JavaObject
	Return o
End Sub


Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	jamTableView1.GuardarConfiguracionColumnasUsuario
	frm.Close
	MainMenu2.Show
End Sub

Sub ActualizarDatos

	jamLoadingIndicator1.MensajeLoading="Cargando datos lista análisis tarifas..."
	jamLoadingIndicator1.Show
	Wait For(ActualizarDatosLista) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		jamLoadingIndicator1.close
		SalirModulo
		Return
	End If
	Dim lstReg As List=mRes.get("lstReg")

	Dim rSub As ResumableSub=jamTableView1.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableView1.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True<>mResultSetData.Get("ListaVacia") Then 
				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
				Wait For (msa) Msgbox_Result
			Else	
				jamTableView1.SetPlaceholderText("")
			End If
		End If

	End If
	
	'fx.Msgbox(frm,"Datos actualizados.","Aviso")



End Sub


' EJEMPLO CREACION DE TABLA INTERNA
Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblListaAnalisisTarifasVenta"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblListaAnalisisTarifasVenta")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblListaAnalisisTarifasVenta (")

	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("CodigoAnalisisTarifas TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DescripcionAnalisis TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("TipoAnalisisTarifas  TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("TipoTarifa TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("CodigoTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("FechaCreacionLong INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaCreacion TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("UsuarioCreacion TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("FechaModificacionLong INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaModificacion TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("UsuarioModificacion TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Estado TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("EstadoVentas TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("EstadoCostesFabricacionCorte TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("EstadoCostesFabricacionNoCorte TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("EstadoCostesImportacion TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("EstadoCostesCompra TEXT COLLATE NOCASE DEFAULT '')")

	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
End Sub


Sub ActualizarDatosLista As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblListaAnalisisTarifasVenta")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String="ListaSimpleAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Análisis Tarifas Venta","Aviso")
			Wait For (msa) Msgbox_Result
			Dim lstReg As List
			lstReg.Initialize
			mRes.Put("lstReg", lstReg)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
'			For Each m As Map In lstReg
'				Log("m: " & m)
			''				Dim OSUB As String=m.Get("PedidoFab")
			''				Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.UsuarioWindows,Main.DatosUsuario.NombreUsuarioWindows,OSUB))
			''				lstCommands.Add(cmd)
'			Next
			'DBUtils.InsertMaps(mSQL,"tblListaAnalisisTarifasVenta",lstReg)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL, "tblListaAnalisisTarifasVenta",lstReg)
		End If
	End If
	Return mRes
End Sub



Sub jamTableView1_AccionSalirJamTableView
	SalirModulo
End Sub

Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "Actualizar"
			ActualizarDatos
		Case "NuevoAnalisisTarifasVenta"
			'NuevoAnalisisTarifasVenta
			NuevoAnalisisTarifasVenta2
	End Select
End Sub

' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "FichaAnalisisTarifasVenta"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("IDAnalisisTarifas",FilaSel)
			Dim IDAnalisisSel As Int=DCS.ValorCelda
'			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("CodigoAnalisisTarifas",FilaSel)
'			Dim AnalisisSel As String=DCS.ValorCelda
'			Dim msa As Object = xui.Msgbox2Async("¿Abrir la ficha " & AnalisisSel & "?", "Análisis Tarifas Venta", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			Dim CodigoAnalisisTarifasSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel,"CodigoAnalisisTarifas")
			Dim DescripcionAnalisisTarifasSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel,"DescripcionAnalisis")
			AbrirFichaAnalisisTarifasVenta(IDAnalisisSel, CodigoAnalisisTarifasSel, DescripcionAnalisisTarifasSel)
			'AbrirFichaAnalisisTarifasVenta(IDAnalisisSel)
	End Select
End Sub


'EJEMPLO
Sub jamTableView1_CambioEnCeldaSeleccionada(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila
	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
	Dim Pedido As String=mPK.Get("Pedido")
	Dim Linea As Int=mPK.Get("Linea")
	Dim NombreProveedor As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"NombreProveedor")
	Dim Articulo As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Articulo")
	Dim Descripcion As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"DescripcionArticulo")
	Dim Talla As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Talla")
	Dim sTalla As String=IIf(Talla<>"","Talla: " & Talla,"")
	Dim QtyPte As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"QtyPendiente")
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim FechaPrometidaLong As Long=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"FechaPrometida")
	Dim sFechaPrometida As String=IIf(FechaPrometidaLong>0,"Fecha Prometida: " & DateTime.Date(FechaPrometidaLong),"SIN FECHA PROMETIDA")
	DateTime.DateFormat=DateFormatAnt
	Dim PendienteSeguimiento As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"PendienteSeguimiento")
	Dim sPendienteSeguimiento As String=IIf(PendienteSeguimiento=1,"PENDIENTE SEGUIMIENTO","")
	
	jamTableView1.TextoPanelInfoJamTableView="Pedido: " & Pedido & " Línea:" & Linea & "  " & NombreProveedor & "  " & Articulo & "  " & _
		Descripcion & "  " & sTalla & "  QtyPte: " & QtyPte & "  " & sFechaPrometida & " " & sPendienteSeguimiento 
End Sub


''EJEMPLO
'Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Select DatosCeldaSeleccionada.AliasCampo
'		Case "ExcluidoReclamacion"
'			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
'	End Select
'End Sub

Sub jamTableView1_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim FilaSel As Int=DatosCeldaSeleccionada.Fila
	Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("IDAnalisisTarifas",FilaSel)
	Dim IDAnalisisSel As Int=DCS.ValorCelda
	'Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("CodigoAnalisisTarifas",FilaSel)
	'Dim AnalisisSel As String=DCS.ValorCelda
	Dim CodigoAnalisisTarifasSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel,"CodigoAnalisisTarifas")
	Dim DescripcionAnalisisTarifasSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel,"DescripcionAnalisis")
'	Dim msa As Object = xui.Msgbox2Async("¿Abrir la ficha " & AnalisisSel & "?", "Análisis Tarifas Venta", "Sí", "", "No", Null)
'	Wait For (msa) Msgbox_Result (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
	AbrirFichaAnalisisTarifasVenta(IDAnalisisSel, CodigoAnalisisTarifasSel, DescripcionAnalisisTarifasSel)
End Sub

'EJEMPLO para checkbox editable en la lista 
Sub AlternarExcluidoReclamacion(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			
		Case 1
			NuevoValor=0
	End Select
	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
	Dim PedidoSel As String=mPK.Get("Pedido")
	Dim LineaSel As String=mPK.Get("Linea")
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",Array(NuevoValor,PedidoSel, LineaSel))
	jamTableView1.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
	jamTableView1.SeleccionarCelda("ExcluidoReclamacion",DatosCeldaSeleccionada.Fila)
End Sub

'Sub NuevoAnalisisTarifasVenta
'	Dim mData As Map
'	mData.Initialize
'	jFormReg.Initialize(Me,"jFormReg",frm,"Nuevo Análisis Tarifas Venta","Nuevo","NuevoAnalisisTarifasVentaFormRegistro.json",mData)
'	
'End Sub


Sub jFormReg_GrabarNuevoRegistro(lstDatosCamposRegistroNuevo As List)
'	For Each iFR As InfoCampoJamFormRegistro In lstDatosCamposRegistroNuevo
'		Log(iFR)
'	Next
	Dim DescripcionAnalisis As String=jFormReg.DatosCampoSeleccionado("DescripcionAnalisis").ValorOutputCampo
	Dim TipoAnalisisTarifas As String=jFormReg.DatosCampoSeleccionado("TipoAnalisisTarifas").ValorOutputCampo
	Dim TipoTarifa As String=jFormReg.DatosCampoSeleccionado("TipoTarifa").ValorOutputCampo
	Dim CodigoTarifa As String=jFormReg.DatosCampoSeleccionado("CodigoTarifa").ValorOutputCampo
	Dim UsuarioCreacion As String=Main.DatosUsuario.NombreADUsuarioWindows
	
	Wait For (CrearCabeceraAnalisisTarifasVenta(DescripcionAnalisis, TipoAnalisisTarifas, TipoTarifa, CodigoTarifa, UsuarioCreacion)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	jFormReg.CerrarFormRegistro
	ActualizarDatos
End Sub

Sub jFormReg_GrabarEdicionRegistro(lstInfoCampoJamFormRegistro As List)
	For Each iFR As InfoCampoJamFormRegistro In lstInfoCampoJamFormRegistro
		Log(iFR)
	Next
End Sub

Sub NuevoAnalisisTarifasVenta2

	Dialog.Title="Descripción Análisis (max. " & 255 & " caracteres) "
	Dialog.TitleBarHeight=60dip
	'Dialog.TitleBarFont = xui.CreateFont(Typeface.DEFAULT,20)
	Dim b4xInputDlg As B4XInputTemplate
	b4xInputDlg.Initialize
	b4xInputDlg.lblTitle.Text=""
	b4xInputDlg.TextField1.SetTextAlignment("TOP", "LEFT")
	
	'b4xInputDlg.mBase.Height = 150dip
	b4xInputDlg.mBase.Width = 800dip
	b4xInputDlg.RegexPattern="^.{" & 1 & "," & 255 & "}$"
	'Dim et As B4XView = b4xInputDlg.TextField1
	'et.SingleLine = False
	'et.Height=60dip
	'et.Height = 120dip
	
	b4xInputDlg.Text=""
	Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xInputDlg,"OK","","Cancelar")

	Dim btnOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	btnOK.Left=10dip
	btnOK.TextSize=14

	Dim btnCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	btnCancel.Left=btnCancel.Left-30dip
	btnCancel.width=btnCancel.width+10dip
	btnCancel.SetTextAlignment("CENTER","RIGHT")
	btnCancel.TextSize=14

	Wait For (rSub) complete (rInt As Int)
	If rInt=xui.DialogResponse_Cancel Then Return
	
	Dim NuevaDescripcion As String=b4xInputDlg.Text.ToUpperCase
	
	'Wait For (CrearCabeceraAnalisisTarifasVenta(NuevaDescripcion)) complete (mRes As Map)
	Wait For (CrearCabeceraAnalisisTarifasVenta2(NuevaDescripcion)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim mData As Map=mRes.Get("mData")
	Dim IDNuevoAnTar As Int=mData.GetValueAt(0)
	
	Wait For(CargarAnalisisTarifasVentaDatosCabAbrirAnalisis(IDNuevoAnTar)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		ActualizarDatos
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	Dim NuevoAnTar As String=mData.Get("CodigoAnalisisTarifas")
	Dim DesNuevoAnTar As String=mData.Get("DescripcionAnalisis")
	
	AbrirFichaAnalisisTarifasVenta(IDNuevoAnTar, NuevoAnTar, DesNuevoAnTar)
End Sub

Sub CrearCabeceraAnalisisTarifasVenta(DescripcionAnalisis As String, TipoAnalisisTarifa As String, TipoTarifa As String, _
		CodigoTarifa As String, UsuarioCreacion As String) As ResumableSub
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="NuevoAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(DescripcionAnalisis, TipoAnalisisTarifa, TipoTarifa, CodigoTarifa, UsuarioCreacion, DateTime.Now), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("Error de sp " & Comando & ". No se ha obtenido respuesta.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub


Sub CrearCabeceraAnalisisTarifasVenta2(DescripcionAnalisis As String) As ResumableSub
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="NuevoAnalisisTarifasVenta2"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(DescripcionAnalisis,Main.DatosUsuario.NombreADUsuarioWindows, DateTime.Now), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("Error de sp " & Comando & ". No se ha obtenido respuesta.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub

Sub AbrirFichaAnalisisTarifasVenta(IDAnTar As Int, AnTar As String, DescAnTar As String)
	Dim cFichaAnTar As cFichaAnalisisTarifasVenta
	cFichaAnTar.Initialize(IDAnTar, AnTar, DescAnTar)
	cFichaAnTar.Show
	frm.Close
End Sub

Sub CargarAnalisisTarifasVentaDatosCabAbrirAnalisis(IDAnTarSel As Int) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasVentaDatosCabAbrirAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(IDAnTarSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("Error de sp " & Comando & ". No se ha obtenido respuesta.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			mRes.Put("mData", mData)
			Accion="OK"
			mRes.Put("Accion", Accion)	
		End If
	End If
	Return mRes
End Sub




