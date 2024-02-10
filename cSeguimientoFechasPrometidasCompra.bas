B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
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
	
	Dim DireccionSeleccionadaRemitenteEmails As String
	
	Public PermisoUsuarioModulo As String
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
	frm.RootPane.LoadLayout("scrSeguimientoFechasPrometidasCompra")
	Sleep(0)
	frm.Title=Main.PrefijoTitleForms & "    Seguimiento Fechas Prometidas Pedidos Compra"
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003),jamTableView1.MenuBarLinea)
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Cuenta Remitente Email","SeleccionarCuentaRemitenteEmail",Chr(0xF2BC),jamTableView1.MenuBarAcciones)
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todo lo Filtrado","ExcluirtodoLoFiltrado",Chr(0xF046),jamTableView1.MenuBarAcciones)
	jamTableView1.AddMenuItemFontMaterialIconsToMenuInMenuBar("Desmarcar Todo lo Excluido","DesmarcarTodoLoExcluido",Chr(0xE835),jamTableView1.MenuBarAcciones)
	
	jamTableView1.AddContextMenuItemSeparator
	jamTableView1.AddContextMenuItemFontAwesomeText("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003))
		
	jamTableView1.AddContextMenuItemSeparator
	Dim img As Image
	img.InitializeSample(File.DirAssets,"navision.png",24,24)
	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
	'jamTableView1.AddContextMenuItem("Ver Pedido Compra NAV","VerPedidoCompraNAV")
	'jamTableView1.AddContextMenuItem("Ver Articulo NAV","VerArticuloNAV")
	jamTableView1.AddContextMenuItemImage("Artículo NAV","VerArticuloNAV",img)
	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")
		
'	jamTableView1.AbrirCamposBuilder
'	Return
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaSeguimientoFechasPrometidasCompras.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AlturaFilas=0
		
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
	CF.CellFactoryEnCallBack=False
	CF.params=Null
	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"))
		
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
	CF.CellFactoryEnCallBack=False
	CF.params=Null
	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("NombreProveedor","DescripcionArticulo"))
		
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
	CF.CellFactoryEnCallBack=False
	CF.params=Null
	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPrometidaVencida","PendienteSeguimiento"))
		
	Dim dCF As DatosCellFactoryJamTableView
	dCF.Initialize
	dCF.AliasCampoColumna="ExcluidoReclamacion"
	dCF.CellFactoryEnCallBack=False
	dCF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
	jamTableView1.SetCellFactory(dCF)
		
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("PendienteSeguimiento","Pendiente Seguimiento:" & CRLF & "  - SIN Fecha Prometida" & CRLF & "o" & CRLF &  " - Fecha Prometida Vencida" ,"lightyellow","black",14)
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("FechaPrometidaVencida","Fecha Prometida Vencida","lightyellow","black",14)
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("DiasRespectoAPlazo","Días Respecto al plazo prometido por el proveedor","lightyellow","black",14)
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("FechaEnvioReclamacionLong","Fecha en la que se grabó la última reclamación de plazo para cada Pedido-Línea","lightyellow","black",14)
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("ExcluidoReclamacion","Marcar para EXCLUIR del informe de reclamación que se adjuntará al correo.","lightyellow","black",14)
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("VPG","Grupo Contable Negocio del proveedor.","lightyellow","black",14)
	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("DiasDesdePedido","Nº de días transcurridos entre la fecha de creación del pedido y la fecha actual.","lightyellow","black",14)
		
	Dialog.Initialize(frm.RootPane)
	
	'End If
	
	If mSQL.IsInitialized Then mSQL.Close
	#if DEBUG
		mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#ELSE
		mSQL.InitializeSQLite("", ":memory:", True)
	#END IF
	
	CreacionTablasSQLite
	
	frm.Show
	
	Dim joForm As JavaObject=asJO(frm)
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized",Array(True))

'	End If

	frm.RootPane.MouseCursor= fx.Cursors.WAIT
	
	CrearVBSScriptDireccionRemitenteEmailOutlook
	
	'CrearVBSScriptEnvioEmailOutlook
	
	CrearVBSScriptEnvioEmailOutlookHTML
	
	WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boolean)
	If rBool= False Then SalirModulo

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
	BorrarVBSScriptDireccionRemitenteEmailOutlook
	BorrarVBSScriptEnvioEmailOutlook
	frm.Close
	MainMenu2.Show
End Sub

Sub ActualizarDatos As ResumableSub
	
	'btnSalir.Enabled=False
	Wait For(ActualizarDatosFechasPrometidasComprasPendientes) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	Dim FechaHoyHora0 As Long=DateUtils.SetDate(DateTime.GetYear(DateTime.Now), DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now))
	
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaPrometidaVencida=1 where FechaPrometida>? and FechaPrometida<?",Array As Object(0,FechaHoyHora0))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set PendienteSeguimiento=1 where FechaPrometidaVencida=? or FechaPrometida<?",Array As Object(1,0))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaHoyHora0=?",Array As Object(FechaHoyHora0))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasRespectoAPlazo=(FechaPrometida-FechaHoyHora0)/? where FechaPrometida>0", Array As Object(DateTime.TicksPerDay))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdePedido=(FechaHoyHora0-FechaPedido)/?",Array As Object(DateTime.TicksPerDay))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdeReclamacion=(FechaHoyHora0-FechaEnvioReclamacionLong)/? where FechaEnvioReclamacionLong>0",Array As Object(DateTime.TicksPerDay))

	Wait For(CargaDatosPedidosCompraRecepcionesPendientes("PROIN",True)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	Wait For(CargaDatosPedidosCompraRecepcionesPendientes("PROTEC",False)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If

	Dim sbQtysEnRecepPtes As StringBuilder
	sbQtysEnRecepPtes.Initialize
	sbQtysEnRecepPtes.Append("update tblDatosFechasPrometidasPedidosCompraPendientes as t1 set QtyEnAlmacenRecepcionPendiente=tRecepPtesAlm.QtyRecepPte from")
	sbQtysEnRecepPtes.Append(" (Select Pedido, Linea, Articulo, Talla, sum(QtyARecibir) As QtyRecepPte from tblDatosFechasPrometidasPedidosCompraPendientes tDF join")
	sbQtysEnRecepPtes.Append(" tblPedidosCompraRecepcionesPendientesAlmacen tPCRPA on tdf.Pedido=tPCRPA.PedidoNav And tdf.Proveedor=tPCRPA.ProvOrigen group by Pedido, Linea, Articulo, Talla) As tRecepPtesAlm")
	sbQtysEnRecepPtes.Append(" where t1.Pedido=tRecepPtesAlm.Pedido And t1.Linea=tRecepPtesAlm.Linea")
	mSQL.ExecNonQuery(sbQtysEnRecepPtes.tostring)


	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblDatosFechasPrometidasPedidosCompraPendientes order by Pedido, Linea")
	Dim rSub As ResumableSub=jamTableView1.setdata(rs)
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
				jamTableView1.AbrirCamposBuilder
				Return True
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return True
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	jamTableView1.AddFiltroCampoValorInicial("PendienteSeguimiento",1)

	Return True
End Sub



Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblDatosFechasPrometidasPedidosCompraPendientes"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblDatosFechasPrometidasPedidosCompraPendientes")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblDatosFechasPrometidasPedidosCompraPendientes (")
	
	
	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Proveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreProveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DireccionEmail TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaPedido INTEGER,")
	sbCrearTabla.Append("DiasDesdePedido INTEGER default 0,")
	sbCrearTabla.Append("VPG TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Linea INTEGER ,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Qty REAL,")
	sbCrearTabla.Append("QtyRecibida REAL,")
	sbCrearTabla.Append("QtyPendiente REAL,")
	sbCrearTabla.Append("QtyARecibir REAL,")
	sbCrearTabla.Append("QtyEnAlmacenRecepcionPendiente REAL default 0,")
	sbCrearTabla.Append("RecPteRecep REAL,")
	sbCrearTabla.Append("FechaPrometida INTEGER,")
	sbCrearTabla.Append("FechaPrometidaOriginal INTEGER,")
	sbCrearTabla.Append("FechaPrometidaOriginalModificada INTEGER,")
	sbCrearTabla.Append("FechaPrometidaVencida INTEGER default 0,")
	sbCrearTabla.Append("PendienteSeguimiento INTEGER default 0,")
	sbCrearTabla.Append("FechaHoyHora0 INTEGER default 0,")
	sbCrearTabla.Append("DiasRespectoAPlazo INTEGER default 0,")
	sbCrearTabla.Append("ExcluidoReclamacion INTEGER default 0,")
	sbCrearTabla.Append("IDReclamacionFPC INTEGER default 0,")
	sbCrearTabla.Append("FechaEnvioReclamacionLong INTEGER default 0,")
	sbCrearTabla.Append("DiasDesdeReclamacion INTEGER default 0,")
	sbCrearTabla.Append("IDUsuario INTEGER default 0,")
	sbCrearTabla.Append("NombreUsuario TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("DireccionEmailRemitente TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("DireccionEmailDestinatario TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("ReclamacionFPC TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("RecepcionesPendientes INTEGER default 0)")


	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblPedidosCompraRecepcionesPendientesAlmacen"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblPedidosCompraRecepcionesPendientesAlmacen")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblPedidosCompraRecepcionesPendientesAlmacen] ([LR] INTEGER, [FechaCreacion] INTEGER, [PedidoNav] TEXT, [ProvOrigen] TEXT)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
End Sub

' EJEMPLO, modificar según formulario
Sub ActualizarDatosFechasPrometidasComprasPendientes As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblDatosFechasPrometidasPedidosCompraPendientes")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String="PedidosCompraPendientesFechasPrometidasReclamaciones"
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
	
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
			Dim msa As Object=xui.MsgboxAsync("No hay datos de .............","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblDatosFechasPrometidasPedidosCompraPendientes",lstReg)
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
			WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boolean)
			
		Case "SeleccionarCuentaRemitenteEmail"
			wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
			If rBool=False Then Return
			
		Case "EmailReclamacionProveedor"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ninguna línea.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("NombreProveedor",FilaSel)
			Dim NombreProveedor As String=DCS.ValorCelda
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Proveedor",FilaSel)
			Dim Proveedor As String=DCS.ValorCelda
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("DireccionEmail",FilaSel)
			Dim DireccionEmail As String=DCS.ValorCelda
			Dim msa As Object = xui.Msgbox2Async("¿Enviar email reclamación de plazos de entrega al proveedor " & NombreProveedor  & "?" & CRLF & CRLF & "Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas", "Confirma", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
'			Dim jamMsg As jamMsgDialog
'			jamMsg.Initialize(frm.RootPane, "Confirma","¿Enviar email reclamación de plazos de entrega al proveedor " & NombreProveedor  & "?" & CRLF & CRLF & "Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas")
'			jamMsg.TextoBotonPositive="SI"
'			jamMsg.TextoBotonCancel="Cancelar"
'			Wait For(jamMsg.MostrarAviso) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			EmailReclamacionProveedor(Proveedor, NombreProveedor,DireccionEmail)
	End Select
End Sub

Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "VerPedidoCompraNAV"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Pedido",FilaSel)
			Dim PedidoSel As String=DCS.ValorCelda
			Dim msa As Object = xui.Msgbox2Async("¿Ver el pedido de compra " & PedidoSel & " en NAVISION?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido compra",50, "No.", PedidoSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el pedido seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
			
		Case "VerArticuloNAV"
			Dim ArticuloSel As String
			Dim FilaSeleccionada As Int=jamTableView1.IndicesFilasSeleccionadas.Get(0)
			Dim lstInfoFila As List=jamTableView1.DatosRegistroIndiceFila(FilaSeleccionada)
			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
				If dc.Campo="Articulo" Then
					ArticuloSel=dc.ValorCampo
					Exit
				End If
			Next
			If ArticuloSel="" Then
				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Artículo.","Error")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
		Case "EmailReclamacionProveedor"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("NombreProveedor",FilaSel)
			Dim NombreProveedor As String=DCS.ValorCelda
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Proveedor",FilaSel)
			Dim Proveedor As String=DCS.ValorCelda
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("DireccionEmail",FilaSel)
			Dim DireccionEmail As String=DCS.ValorCelda
			Dim msa As Object = xui.Msgbox2Async("¿Enviar email reclamación de plazos de entrega al proveedor " & NombreProveedor  & "?" & CRLF & CRLF & "Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas", "Confirma", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			EmailReclamacionProveedor(Proveedor, NombreProveedor,DireccionEmail)
			
		Case "DatosUltimaRFP"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Pedido",FilaSel)
			Dim PedidoSel As String=DCS.ValorCelda
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Linea",FilaSel)
			Dim LineaSel As Int=DCS.ValorCelda
			Dim RFPC As String=mSQL.ExecQuerySingleResult2("select ReclamacionFPC from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",Array As String(PedidoSel,LineaSel))
			If RFPC="" Then 
				Dim msa As Object=xui.MsgboxAsync("La línea de pedido seleccionada no tiene datos de reclamación de fechas prometidas.","Información Reclamación")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("FechaEnvioReclamacionLong",FilaSel)
			Dim FechaEnvioLong As Long=DCS.ValorCelda
			Dim DateFormatAnt As String=DateTime.Dateformat
			DateTime.DateFormat="dd/MM/yyyy"
			Dim FechaEnvio As String=DateTime.Date(FechaEnvioLong)
			DateTime.DateFormat=DateFormatAnt
			Dim NombreUsuario As String=mSQL.ExecQuerySingleResult2("select NombreUsuario from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",Array As String(PedidoSel,LineaSel))
			Dim DireccionEmailRemitente As String=mSQL.ExecQuerySingleResult2("select DireccionEmailRemitente from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",Array As String(PedidoSel,LineaSel))
			Dim DireccionEmailDestinatario As String=mSQL.ExecQuerySingleResult2("select DireccionEmailDestinatario from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",Array As String(PedidoSel,LineaSel))

'			Dim msa As Object = xui.Msgbox2Async("¿Ver datos de la última reclamación pedido de compra " & PedidoSel & " línea " & LineaSel & "?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			Dim sb As StringBuilder
			sb.Initialize
			sb.Append("Pedido / Línea:  ").Append(PedidoSel).Append(" / ").Append(LineaSel).Append(CRLF)
			sb.Append("Reclamación:  ").Append(RFPC).Append(CRLF)
			sb.Append("Fecha Reclamación:  ").Append(FechaEnvio).Append(CRLF)
			sb.Append("Usuario: ").Append(NombreUsuario).Append(CRLF)
			sb.Append("DireccionEmailRemitente:  ").Append(DireccionEmailRemitente).Append(CRLF)
			sb.Append("DireccionEmailDestinatario:  ").Append(DireccionEmailDestinatario).Append(CRLF)
			
			Dim msa As Object=xui.MsgboxAsync(sb.ToString,"Información Reclamación")
			Wait For (msa) Msgbox_Result
			
			Dim msa As Object = xui.Msgbox2Async("¿Copiar el número de reclamación (" & RFPC  & ") ?", "Confirma", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt= xui.DialogResponse_Positive Then fx.Clipboard.SetString(RFPC)
	End Select
End Sub

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

Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "ExcluidoReclamacion"
			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
	End Select
End Sub


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

'Sub IsEmail(EmailAddress As String) As Boolean
'	Dim MatchEmail As Matcher = Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$", EmailAddress)
'	If MatchEmail.Find = True Then
'		Log(MatchEmail.Match)
'		'Do something
'		Return True
'	Else
'		Log("Oops, please double check your email address")
'		Return False
'	End If
'End Sub


Sub EmailReclamacionProveedor(Proveedor As String, NombreProveedor As String, DireccionEmail As String)
	If PermisoUsuarioModulo<>"RW" And PermisoUsuarioModulo<>"ADMIN" Then
		Dim msa As Object=xui.MsgboxAsync("No tienes permiso para enviar email de reclamación.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim LineasRecl As Int=jamTableView1.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and ExcluidoReclamacion=? order by Pedido, Linea",Array As String(Proveedor,0)))
	If LineasRecl=0 Then 
		Dim msa As Object=xui.MsgboxAsync("No hay líneas no excluidas para enviar en la reclamación de plazo.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(CarpetaConfiguradaFicherosReclamaciones) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim CarpetaFichero As String=mRes.Get("CarpetaFichero")
	
	If File.Exists(CarpetaFichero,"")=False Then
		Dim msa As Object=xui.MsgboxAsync("No existe la carpeta configurada para grabar los ficheros de reclamaciones." & CRLF & CRLF & CarpetaFichero,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dialog.Title="Confirma Dirección Email Destinatario"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=DireccionEmail.Trim
	InputDlg.RegexPattern="^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"
	
	'InputDlg.mBase.Height = 20%y
	InputDlg.mBase.Width = 600dip
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)

	If rInt<>xui.DialogResponse_Positive Then Return
	Dim DireccionDestinoEmail As String=InputDlg.Text.Trim
	
	Dim DireccionDestinoEmailCC As String
	
	Dim msa As Object = xui.Msgbox2Async("¿Añadir otra dirección de email a la que enviar el mensaje en copia?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt=xui.DialogResponse_Positive Then
		Dialog.Title="Indica Dirección Email Destinatario (Copia)"
		Dialog.TitleBarHeight=50dip
		Dim InputDlg As B4XInputTemplate
		InputDlg.Initialize
		InputDlg.lblTitle.Text=""
		InputDlg.Text=""
		InputDlg.RegexPattern="^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"
	
		'InputDlg.mBase.Height = 20%y
		InputDlg.mBase.Width = 600dip
	
		Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
		Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
		bOK.TextSize=15
		Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
		bCancel.TextSize=15
		bCancel.Left=bCancel.Left-20dip
		bCancel.Width=bCancel.Width+20dip
		Wait For (rSub) complete (rInt As Int)

		If rInt<>xui.DialogResponse_Positive Then
			Dim msa As Object = xui.Msgbox2Async("No se ha añadido direccion de email destinatario (copia) ¿Continuar con el proceso?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then
				 Return
			End If
		Else
			Dim DireccionDestinoEmailCC As String=InputDlg.Text.Trim
		End If
	End If
	
	If DireccionDestinoEmailCC="" Then DireccionDestinoEmailCC="None"
	
'	wait for(EjecutarVBSScriptDireccionesEmail) complete (mRes As Map)
'	Log("mRes: " & mRes)
'	Dim Success As Boolean=mRes.Get("Success")
'	Dim ExitCode As Int=mRes.Get("ExitCode")
'	Dim StdOut As String=mRes.Get("StdOut")
'	Dim StdErr As String=mRes.Get("StdErr")
''	Dim msa As Object=xui.MsgboxAsync("StdOut." & StdOut,"Aviso Temp")
''	Wait For (msa) Msgbox_Result
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & "Avisa al administrador de la aplicación.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	If ExitCode=1 Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & StdErr,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	Dim sDireccionesCuentasEmail As String=StdOut.SubString2(0,StdOut.Length-1)
'	If sDireccionesCuentasEmail="" Then
'		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
''	
'	Dim ArrDireccionesCuentasEmail() As String=Regex.Split(",",sDireccionesCuentasEmail)
'	Dim lstDireccionesCuentasEmail As List
'	lstDireccionesCuentasEmail.Initialize
'
'	For iDx =0 To ArrDireccionesCuentasEmail.Length-1
'		lstDireccionesCuentasEmail.Add(ArrDireccionesCuentasEmail(iDx))
'	Next
'	
'	If lstDireccionesCuentasEmail.Size=0 Then
'		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	If DireccionSeleccionadaRemitenteEmails="" Then
		'wait for (SeleccionarDireccionRemitenteEmails(lstDireccionesCuentasEmail)) complete (rBool As Boolean)
		wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
		If rBool=False Then
			Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar la dirección desde la que enviar emails." & CRLF & CRLF & "Selecciónala desde el menú de Acciones." ,"Aviso")
			Wait For (msa) Msgbox_Result
			Return
		End If
	Else
		Dim msa As Object = xui.Msgbox2Async("La dirección DESDE la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmails, "Direccion envío email", "Sí", "Cancelar", "Seleccionar Otra", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		Select rInt
			Case xui.DialogResponse_Cancel
				Return
			Case xui.DialogResponse_Negative
				Dim msa As Object=xui.MsgboxAsync("Selecciona otra cuenta remitente desde el menú Acciones." ,"Aviso")
				Wait For (msa) Msgbox_Result
				Return
		End Select
	End If
	
	jamTableView1.SetMouseCursorWaitDeshabilitarTableView
	Wait For(CrearCabeceraReclamacion(DateTime.Now,0,Main.DatosUsuario.NombreUsuarioWindows,DireccionSeleccionadaRemitenteEmails,DireccionDestinoEmail)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim IDRecl As Int=mRes.Get("IDReclamacionFPC")
	Dim Recl As String=mRes.Get("ReclamacionFPC")
	
	jamTableView1.SetMouseCursorWaitDeshabilitarTableView
	Dim lstComandos As List
	lstComandos.Initialize
	Dim rsPedLin As ResultSet=mSQL.ExecQuery2("select Pedido, Linea from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and PendienteSeguimiento=? and ExcluidoReclamacion=? order by Pedido, Linea",Array As String(Proveedor,1,0))
	Do While rsPedLin.NextRow
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("UpdatePedidosLineasReclamacionesFPCMov0",Array(rsPedLin.Getstring("Pedido"), rsPedLin.GetInt("Linea")))
		lstComandos.Add(cmd)
	Loop
	rsPedLin.Close
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		jamTableView1.SetMouseCursorDefaultHabilitarTableView
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible resetear mov de las líneas de Pedido reclamaciones anteriores  " & Recl & ".","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim lstComandos As List
	lstComandos.Initialize
	Dim rsPedLin As ResultSet=mSQL.ExecQuery2("select Pedido, Linea from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? And PendienteSeguimiento=? And ExcluidoReclamacion=? order by Pedido, Linea",Array As String(Proveedor,1,0))
	Do While rsPedLin.NextRow
		'Dim cmd As DBCommand = JRDCQuery.CreateCommand("UpdatePedidosLineasReclamacionesFPCMov0",Array(rsPedLin.Getstring("Pedido"), rsPedLin.GetInt("Linea")))
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("InsertarPedidoCompraLineaReclamacionFPC",Array(IDRecl,rsPedLin.Getstring("Pedido"), rsPedLin.GetInt("Linea")))
		lstComandos.Add(cmd)
	Loop
	rsPedLin.Close
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		jamTableView1.SetMouseCursorDefaultHabilitarTableView
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar las líneas de Pedido en la nueva reclamación  " & Recl & ".","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

	Dim rs As ResultSet=mSQL.ExecQuery2("select Pedido, Linea, FechaPedido, Articulo, DescripcionArticulo, Talla, Qty, QtyPendiente, FechaPrometida from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and PendienteSeguimiento=? and ExcluidoReclamacion=? order by Pedido, Linea",Array As String(Proveedor,1,0))

	Dim xl As XLUtils
	xl.Initialize
	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos")

	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"

	Dim NumColsRs As Int=rs.ColumnCount
	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
	'encabezados
	For idxCol=0 To rs.ColumnCount-1
		If rs.GetColumnName(idxCol)<>"FechaPrometida" Then
			sheet1.PutString(xl.AddressZero(idxCol,0), rs.GetColumnName(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
		Else
			sheet1.PutString(xl.AddressZero(idxCol,0), "Fecha Entrega Anterior").SetStyle(sheet1.LastAccessed, HeaderStyle)
		End If
	Next
	sheet1.PutString(xl.AddressZero(idxCol,0), "Nueva Fecha Entrega").SetStyle(sheet1.LastAccessed, HeaderStyle)
	
	
	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
	Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
	Dim idxFila As Int=1

	Do While rs.NextRow
		'Dim RowStyle As XLStyle = RowStyles.Get(idxFila Mod RowStyles.Size)
		For idxCol=0 To rs.ColumnCount-1
			Dim NombreCampo As String=rs.GetColumnName(idxCol)
			Select True 
				Case NombreCampo="Pedido" Or NombreCampo="Articulo" Or NombreCampo="DescripcionArticulo" Or NombreCampo="Talla"
					'sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetInt(AliasCampo)).SetStyles(sheet1.LastAccessed, Array(RowStyle))
					sheet1.PutString(xl.AddressZero(idxCol,idxFila),rs.GetString(NombreCampo))
					
				Case NombreCampo="Linea"
					sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetInt(NombreCampo))
					
				Case NombreCampo="FechaPedido" 'Or NombreCampo="FechaPrometida"

						Dim ticks As Long = rs.GetLong(NombreCampo)
						
						If ticks > 0 Then
							Dim TicksHora0 As Long=DateUtils.SetDate(DateTime.GetYear(ticks),DateTime.GetMonth(ticks),DateTime.GetDayOfMonth(ticks))
							'sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, Array(FechasStyle, RowStyle))
							sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, FechasStyle)
						End If
						
				Case NombreCampo="Qty" Or NombreCampo="QtyPendiente"
					sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),Round2(rs.GetDouble(NombreCampo),2))
					
				Case NombreCampo="FechaPrometida"
					Dim ticks As Long = rs.GetLong(NombreCampo)
						
					If ticks > 0 Then
						Dim TicksHora0 As Long=DateUtils.SetDate(DateTime.GetYear(ticks),DateTime.GetMonth(ticks),DateTime.GetDayOfMonth(ticks))
						'sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, Array(FechasStyle, RowStyle))
						sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, FechasStyle)
					End If
				Case Else

			End Select
		Next

		jamTableView1.TextoPanelInfoJamTableView="Procesando Fila " & idxFila
		Sleep(0)
		idxFila=idxFila+1
	Loop
	rs.Close

	'Dim LastTableRow1 As Int = sheet1.LastAccessed.Row0Based + 1

	Dim UltimaFila As Int=idxFila
	jamTableView1.TextoPanelInfoJamTableView="Generando fichero excel..."
	Sleep(0)

	'add auto filters - range with the data. The filters will appear above the data.
	'sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumColsRs-1,UltimaFila)))
	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumColsRs,UltimaFila)))   '  ... NumColsRs , porque hemos añadido 1 columna manual
	
	For i=0 To idxCol+1 ' +1 ,  porque hemos añadido 1 columna manual
		sheet1.AutoSizeColumn(i)
	Next
	
	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	jamTableView1.EstadoLabelSalirJamTableView(True)
	jamTableView1.HabilitarJamTableView(True)
	
	jamTableView1.TextoPanelInfoJamTableView=""
	
	'save the workbook
	
	DateTime.DateFormat=DateFormatAnt

'	Dim UserDocFolder As String=jamTableView1.FindUserDocumentsFolder
'	Dim fc As FileChooser
'	fc.Initialize
'	fc.Title="Exportación Excel"
'	fc.SetExtensionFilter("Ficheros Excel", Array As String("*.xlsx","*.xlsm","*.xls"))
''	Dim Hora As Int=DateTime.GetHour(DateTime.Now)
''	Dim Minutos As Int=DateTime.GetMinute(DateTime.Now)
''	Dim Segundos As Int=DateTime.GetMinute(DateTime.Now)
'	fc.InitialFileName= "Reclamación " & Recl & " Fechas Entrega " & NombreProveedor & ".xlsx"
'	fc.InitialDirectory=UserDocFolder
'	Dim fileName As String = fc.ShowSave(frm)
'	If fileName="" Then Return
	
'	Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName), True)
	Dim filename As String = Workbook.SaveAs(CarpetaFichero,"Reclamación " & Recl & " Fechas Entrega " & NombreProveedor & ".xlsx", True)
	If filename<>CarpetaFichero & "\" & "Reclamación " & Recl & " Fechas Entrega " & NombreProveedor & ".xlsx" Then
		jamTableView1.SetMouseCursorDefaultHabilitarTableView
		Dim msa As Object=xui.MsgboxAsync("Error al grabar el fichero excel.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	'Wait For (xl.PowerShellConvertToPdf(fileName, fileName.replace("xlsx","pdf"), 0, True)) Complete (Success As Boolean)
	
''''	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
''''	If Success=False Then
''''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel " & f,"Error")
''''		Wait For (msa) Msgbox_Result
''''		Return
''''	End If
	
''''	' (*) OJO... CAMBIAR PARA PASAR A PRODUCCION
''''	DireccionDestinoEmail=Main.DatosConfiguracionAplicacion.EmailDesarrollador1
	
'	Dim msa As Object = xui.Msgbox2Async("¿Enviar email al proveedor con el fichero excel adjunto?", "Confirma", "Sí", "", "No", Null)
'	Wait For (msa) Msgbox_Result (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return

'	Dim sbBody As String=$"
'Buenos Días
'
'Adjunto listado excel de pedidos pendientes sin información de plazo de entrega cuya fecha informada esta vencida.
'Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.
'
'"$

	'Dim sbBody As String=StringBodyEmail
	Dim sbBody As String=HTMLBodyEmail
	
	
	wait for(EjecutarVBSScriptEnviarEmail(DireccionSeleccionadaRemitenteEmails,DireccionDestinoEmail,"Reclamación Confirmación Fechas Entrega Pedidos Pendientes " & Recl,sbBody,filename, DireccionDestinoEmailCC)) complete (mRes As Map)
	jamTableView1.SetMouseCursorDefaultHabilitarTableView
	Log("mRes: " & mRes)
	Dim Success As Boolean=mRes.Get("Success")
	Dim ExitCode As Int=mRes.Get("ExitCode")
	Dim StdOut As String=mRes.Get("StdOut")
	Dim StdErr As String=mRes.Get("StdErr")
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error spt enviar email" & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt enviar email" & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Dim msa As Object=xui.MsgboxAsync("Email enviado, OK","Aviso")
	Wait For (msa) Msgbox_Result
	
	Dim msa As Object=xui.MsgboxAsync("Fichero excel con datos reclamacion grabado en " & filename, "Aviso")
	Wait For (msa) Msgbox_Result
	
	WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boolean)
	If rBool= False Then Return
	
	Wait For(jamTableView1.QuitarFiltros) complete (rObj As Object)
	
	'jamTableView1.AddFiltroCampoValorInicial("PendienteSeguimiento",1)
	Dim rSub As ResumableSub=jamTableView1.AddFiltroCampoValorInicial("PendienteSeguimiento",1)
	wait for(rSub) complete (Success As Boolean)
	If Success Then

	Else

	End If
	'jamTableView1.AddFiltroCampoValorInicial("Proveedor",Proveedor)
	Dim rSub As ResumableSub=jamTableView1.AddFiltroCampoValorInicial("Proveedor",Proveedor)
	wait for(rSub) complete (Success As Boolean)
	If Success Then

	Else

	End If
	
End Sub

Sub HTMLBodyEmail As String
	Dim strBodyHTML As String
	strBodyHTML = "<p>Buenos días<br><br>" & _
              "Adjunto listado excel de pedidos pendientes sin información de plazo de entrega o cuya fecha informada esta vencida.<br>" & _
              "Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.<br>" & _
              "<br>Gracias"	  
	Return strBodyHTML
End Sub

Sub StringBodyEmail As String
	Dim sBody As String=$"
Buenos Días

Adjunto listado excel de pedidos pendientes sin información de plazo de entrega o cuya fecha informada esta vencida.
Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.

"$
Return sBody
End Sub

Sub CarpetaConfiguradaFicherosReclamaciones As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"CarpetaDatoAplicacion",Array("docU","FicherosReclamacionesFechasPrometidasCompras"), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query CarpetaDatoAplicacion","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay definida una carpeta predeterminada para ubicar los ficheros de reclamaciones.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NO"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mCarp As Map=lstReg.Get(0)
			Dim CarpetaFich As String=mCarp.GetValueAt(0)
			mRes.Put("CarpetaFichero", CarpetaFich)
		End If
	End If
	Return mRes
End Sub

Sub SeleccionarDireccionRemitenteEmailsAnt(lstOpciones As List) As ResumableSub
	DireccionSeleccionadaRemitenteEmails=""
	
	Dialog.Title="Selecciona Cuenta para Enviar los Emails"
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
	B4XListDlg.Resize(600dip,300dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,40dip)
'	Next
	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return False
	
	DireccionSeleccionadaRemitenteEmails=B4XListDlg.SelectedItem
	
	Return True
	
	
End Sub

Sub SeleccionarDireccionRemitenteEmails As ResumableSub
	
	wait for(EjecutarVBSScriptDireccionesEmail) complete (mRes As Map)
	Log("mRes: " & mRes)
	Dim Success As Boolean=mRes.Get("Success")
	Dim ExitCode As Int=mRes.Get("ExitCode")
	Dim StdOut As String=mRes.Get("StdOut")
	Dim StdErr As String=mRes.Get("StdErr")
'	Dim msa As Object=xui.MsgboxAsync("StdOut." & StdOut,"Aviso Temp")
'	Wait For (msa) Msgbox_Result
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	Dim sDireccionesCuentasEmail As String=StdOut.SubString2(0,StdOut.Length-1)
	If sDireccionesCuentasEmail="" Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
'	
	Dim ArrDireccionesCuentasEmail() As String=Regex.Split(",",sDireccionesCuentasEmail)
	Dim lstDireccionesCuentasEmail As List
	lstDireccionesCuentasEmail.Initialize

	For iDx =0 To ArrDireccionesCuentasEmail.Length-1
		lstDireccionesCuentasEmail.Add(ArrDireccionesCuentasEmail(iDx))
	Next
	
	If lstDireccionesCuentasEmail.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	lstDireccionesCuentasEmail.Add("compras@proin-pinilla.com")
	
	Dialog.Title="Selecciona Cuenta para Enviar los Emails"
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
		
	B4XListDlg.Options=lstDireccionesCuentasEmail
	B4XListDlg.Resize(600dip,300dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,40dip)
'	Next
	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
'		Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar  hay dirección de email seleccionada desde la que enviar los emails." & CRLF & CRLF & ,"Aviso")
'		Wait For (msa) Msgbox_Result
		 Return False
	End If
	

	DireccionSeleccionadaRemitenteEmails=B4XListDlg.SelectedItem
	If DireccionSeleccionadaRemitenteEmails="compras@proin-pinilla.com" Then DireccionSeleccionadaRemitenteEmails="Compras Proin"
	
	Return True
	
	
'	Dialog.Title="Confirma Dirección Email Destinatario"
'	Dialog.TitleBarHeight=50dip
'	Dim InputDlg As B4XInputTemplate
'	InputDlg.Initialize
'	InputDlg.lblTitle.Text=""
'	InputDlg.Text=DireccionSeleccionadaRemitenteEmails.Trim
'	InputDlg.RegexPattern="^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"
'	
'	'InputDlg.mBase.Height = 20%y
'	InputDlg.mBase.Width = 600dip
'	
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.TextSize=15
'	bCancel.Left=bCancel.Left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For (rSub) complete (rInt As Int)
'
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim DireccionDestinoEmail As String=InputDlg.Text.Trim
	

	
'	If DireccionSeleccionadaRemitenteEmails="" Then
'		wait for (SeleccionarDireccionRemitenteEmails(lstDireccionesCuentasEmail)) complete (rBool As Boolean)
'		If rBool=False Then Return
'	Else
'		Dim msa As Object = xui.Msgbox2Async("La dirección desde la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmails & ".", "Direccion envío email", "Sí", "Cancelar", "Seleccionar Otra", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		Select rInt
'			Case xui.DialogResponse_Cancel
'				Return
'			Case xui.DialogResponse_Negative
'				Dim msa As Object=xui.MsgboxAsync("Selecciona otra cuenta remitente desde el menú acciones." ,"Aviso")
'				Wait For (msa) Msgbox_Result
'				Return
'		End Select
'	End If
End Sub


'Sub CrearVBSScriptEmailOutlook(BatchName As String, DirEmailRemitente As String,DirEmailDestinatario As String, _
'		Subject As String,  MBody As String, PathAndNameAttchFile As String)
'	Dim Writer As TextWriter
'	'Writer.Initialize2(File.OpenOutput(File.DirApp & "/SENDMAILVBS","sendmails.vbs", False),"cp1252")
'	Writer.Initialize2(File.OpenOutput(xui.DefaultFolder & "/SENDMAILVBS","smfpromc.vbs", False),"ISO-8859-1")   ' smfpromc: sendemailfechasprometidascompra ...
'	Dim vbsscript As String
'            
'            
'	vbsscript=$"outFile="${xui.DefaultFolder}/SENDMAILVBS/${BatchName}.log""$ & CRLF
'	Writer.WriteLine(vbsscript)
'	vbsscript=$"Set FSO = CreateObject("Scripting.FileSystemObject")"$
'	Writer.WriteLine(vbsscript)
'	vbsscript="Set objFile = FSO.CreateTextFile(outFile,True)" & CRLF &CRLF
'	Writer.WriteLine(vbsscript)
'            
'	vbsscript ="Const olByValue = 1" & CRLF & "Const olMailItem = 0" & CRLF & "Dim oOApp" & CRLF & "Dim oOMail" & CRLF & $"Set oOApp = CreateObject("Outlook.Application")"$ & CRLF
'	Writer.WriteLine(vbsscript)
'	
'	vbsscript= CRLF & "Set oOMail = oOApp.CreateItem(olMailItem)" & CRLF
'	vbsscript=vbsscript& "With oOMail" & CRLF
'	vbsscript=vbsscript& $" .To = "${DirEmailDestinatario}""$ &CRLF
'	vbsscript=vbsscript& $".SentOnBehalfOfName = ${DirEmailRemitente}"$ & CRLF
'	vbsscript=vbsscript& $".Subject = ${Subject} & CRLF
'                        
'                        MBody = $"Dear Mr. Smith, " & vbCrLf & vbCrLf & _
'                        "Line 2 " & vbCrLf & vbCrLf & _
'                        "Line 3" & vbCrLf & _
'                        
'                        vbsscript=vbsscript& $".Body = "${MBody} "$ & CRLF
'	vbsscript=vbsscript& $".Attachments.Add "${PathAndNameAttchFile}" "$ & CRLF
'	'vbsscript=vbsscript& $".DeferredDeliveryTime = Date & " ${MailTimeSP.Value}:00:00""$ & CRLF
'	vbsscript=vbsscript& $".Send()"$ & CRLF
'	vbsscript=vbsscript& $"End With"$ & CRLF
'	Writer.WriteLine(vbsscript)
'End Sub


''''Sub EjecutarVBSScript
''''	Dim shl As Shell
''''	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", xui.DefaultFolder & "\PRINT\print.vbs",Folder))   ' nologo para no mostar avisos windows
''''	shl.WorkingDirectory = Main.UserFolder 
''''	shl.Run(-1)
''''	frm.RootPane.MouseCursor=fx.Cursors.WAIT
''''	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
''''	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
''''	If Success And ExitCode = 0 Then
''''		Log("Success")
''''		Log(StdOut)
''''	Else
''''		Log("Error: " & StdErr)
''''	End If
''''End Sub

Sub CrearVBSScriptDireccionRemitenteEmailOutlook
	
	BorrarVBSScriptDireccionRemitenteEmailOutlook
	
	Dim sVBscript As String
            
	sVBscript =$"
		Option Explicit
		On Error Resume Next
		Dim xOLApp, olAccounts
		Dim objStdOut,objStdErr
			
		Set objStdOut = WScript.StdOut
		Set objStdErr = WScript.StdErr
			
		'Set xOLApp = CreateObject("Outlook.Application")
		Set xOLApp =GetObject(, "Outlook.Application")
		If Err.Number<>0 Then
			If Err.Number=429 Then
				'MsgBox "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
			Else
				'MsgBox Err.Number & " " & Err.Description
				objStdErr.Write Err.Number & " " & Err.Description
			End If
			WScript.Quit (1) 'return code 1
		End If

		Dim i
		For i = 1 To xOLApp.Session.Accounts.count
			objStdOut.Write xOLApp.Session.Accounts.Item(i) & ","
		Next
		Set xOLApp = Nothing
		If Err.Number<>0 Then
			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
			WScript.Quit (1)
		Else
			WScript.Quit (0)
		End If
			"$


'		Dim sAccounts
'		For i = 1 To xOLApp.Session.Accounts.count
'			sAccounts =  "Cuentas," & sAccounts & xOLApp.Session.Accounts.Item(i)
'		Next
'		Set xOLApp = Nothing
'		If Err.Number = 0 Then
'			objStdOut.Write sAccounts
'			'msgbox sAccounts
'			WScript.Quit (0)
'		Else
'			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
'			'msgbox Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
'			WScript.Quit (1)
'		End If

'	Set olAccounts = xOLApp.Session.Accounts
'	For Each olAccountTemp In olAccounts
'		REM msgbox "Dir " & olAccountTemp
'		objStdOut.Write olAccountTemp
'	Next
		
	File.WriteString(xui.DefaultFolder,"smfpromc.vbs",sVBscript)
End Sub

Sub BorrarVBSScriptDireccionRemitenteEmailOutlook
	If File.Exists(xui.DefaultFolder,"smfpromc.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc.vbs")
	End If
End Sub

'''Sub CrearVBSScriptEnvioEmailOutlook
'''
'''	BorrarVBSScriptEnvioEmailOutlook
'''	
'''	Dim sVBscript As String
'''            
'''	sVBscript =$"
'''		Option Explicit
'''		On Error Resume Next
'''
'''		Dim objStdOut,objStdErr
'''			
'''		Set objStdOut = WScript.StdOut
'''		Set objStdErr = WScript.StdErr
'''		
'''		Dim xOLApp
'''		Dim objMailItem
'''		
'''		Dim signature
'''			
'''		'Set xOLApp = CreateObject("Outlook.Application")
'''		Set xOLApp =GetObject(, "Outlook.Application")
'''		If Err.Number<>0 Then
'''			If Err.Number=429 Then
'''				'MsgBox "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
'''				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicacion (err 429)"
'''			Else
'''				'MsgBox Err.Number & " " & Err.Description
'''				objStdErr.Write Err.Number & " " & Err.Description
'''			End If
'''			WScript.Quit (1) 'return code 1
'''		End If
'''		Set objMailItem = xOLApp.CreateItem(0)
'''		
'''   		objMailItem .Display
'''		
'''		signature = objMailItem.body
'''		
'''		'objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
'''		objMailItem.SendUsingAccount = WScript.Arguments(0)
'''		objMailItem.To = WScript.Arguments(1)
'''		if WScript.Arguments(5)<>"" then
'''			objMailItem.CC = WScript.Arguments(5)
'''		end if
'''		objMailItem.Subject = WScript.Arguments(2)
'''		objMailItem.Body = WScript.Arguments(3) & vbCrLf & vbCrLf & signature
'''		objMailItem.Attachments.Add WScript.Arguments(4)
'''		objMailItem.Send
'''		Set xOLApp = Nothing
'''		Set objMailItem = Nothing
'''		If Err.Number = 0 Then
'''			objStdOut.Write "Email enviado"
'''			WScript.Quit (0)
'''		Else
'''			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
'''			WScript.Quit (1)
'''		End If
'''			"$
'''	File.WriteString(xui.DefaultFolder,"smfpromc2.vbs",sVBscript)
'''End Sub

Sub CrearVBSScriptEnvioEmailOutlookHTML

	BorrarVBSScriptEnvioEmailOutlook
	
	Dim sVBscript As String
            
	sVBscript =$"
		Option Explicit
		On Error Resume Next

		Dim objStdOut,objStdErr
			
		Set objStdOut = WScript.StdOut
		Set objStdErr = WScript.StdErr
		
		Dim xOLApp
		Dim objMailItem
		
		'Dim OutAccount
		
		Dim signature
			
		'Set xOLApp = CreateObject("Outlook.Application")
		Set xOLApp =GetObject(, "Outlook.Application")
		If Err.Number<>0 Then
			If Err.Number=429 Then
				'MsgBox "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
			Else
				'MsgBox Err.Number & " " & Err.Description
				objStdErr.Write Err.Number & " " & Err.Description
			End If
			WScript.Quit (1) 'return code 1
		End If
		Set objMailItem = xOLApp.CreateItem(0)
		
   		objMailItem.Display
		signature = objMailItem.HTMLBody
		
		'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))
		
		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
		'objMailItem.SendUsingAccount = WScript.Arguments(0)
		'objMailItem.SendUsingAccount = OutAccount
		'objMailItem.SentOnBehalfOfName = OutAccount
		
		objMailItem.To = WScript.Arguments(1)
		if WScript.Arguments(5)<>"None" then
			objMailItem.CC = WScript.Arguments(5)
		end if
		objMailItem.Subject = WScript.Arguments(2)
		'objMailItem.HTMLBody = WScript.Arguments(3) & "<br><br>" & objMailItem.HTMLBody & "</p>"
		objMailItem.HTMLBody = "<p><br>" & WScript.Arguments(3) & "<br>" & signature & "</p>"
		objMailItem.Attachments.Add WScript.Arguments(4)
		'objMailItem.Send
		Set xOLApp = Nothing
		Set objMailItem = Nothing
		If Err.Number = 0 Then
			objStdOut.Write "Email enviado"
			WScript.Quit (0)
		Else
			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
			WScript.Quit (1)
		End If
			"$
	File.WriteString(xui.DefaultFolder,"smfpromc2.vbs",sVBscript)
End Sub

Sub BorrarVBSScriptEnvioEmailOutlook
	If File.Exists(xui.DefaultFolder,"smfpromc2.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc2.vbs")
	End If
End Sub


'Sub CrearVBSScriptDireccionRemitenteEmailOutlook(BatchName As String, DirEmailRemitente As String,DirEmailDestinatario As String, _
'		Subject As String,  MBody As String, PathAndNameAttchFile As String)
'	Dim Writer As TextWriter
'	'Writer.Initialize2(File.OpenOutput(File.DirApp & "/SENDMAILVBS","sendmails.vbs", False),"cp1252")
'	Writer.Initialize2(File.OpenOutput(xui.DefaultFolder & "/SENDMAILVBS","smfpromc.vbs", False),"ISO-8859-1")   ' smfpromc: sendemailfechasprometidascompra ...
'	Dim vbsscript As String
'            
'            
'	vbsscript=$"outFile="${xui.DefaultFolder}/SENDMAILVBS/${BatchName}.log""$ & CRLF
'	Writer.WriteLine(vbsscript)
'	vbsscript=$"Set FSO = CreateObject("Scripting.FileSystemObject")"$
'	Writer.WriteLine(vbsscript)
'	vbsscript="Set objFile = FSO.CreateTextFile(outFile,True)" & CRLF &CRLF
'	Writer.WriteLine(vbsscript)
'            
'	vbsscript ="Const olByValue = 1" & CRLF & "Const olMailItem = 0" & CRLF & "Dim oOApp" & CRLF & "Dim oOMail" & CRLF & $"Set oOApp = CreateObject("Outlook.Application")"$ & CRLF
'	Writer.WriteLine(vbsscript)
'	
'	vbsscript= CRLF & "Set oOMail = oOApp.CreateItem(olMailItem)" & CRLF
'	vbsscript=vbsscript& "With oOMail" & CRLF
'	vbsscript=vbsscript& $" .To = "${DirEmailDestinatario}""$ &CRLF
'	vbsscript=vbsscript& $".SentOnBehalfOfName = ${DirEmailRemitente}"$ & CRLF
'	vbsscript=vbsscript& $".Subject = ${Subject} & CRLF
'                        
'                        MBody = $"Dear Mr. Smith, " & vbCrLf & vbCrLf & _
'                        "Line 2 " & vbCrLf & vbCrLf & _
'                        "Line 3" & vbCrLf & _
'                        
'                        vbsscript=vbsscript& $".Body = "${MBody} "$ & CRLF
'	vbsscript=vbsscript& $".Attachments.Add "${PathAndNameAttchFile}" "$ & CRLF
'	'vbsscript=vbsscript& $".DeferredDeliveryTime = Date & " ${MailTimeSP.Value}:00:00""$ & CRLF
'	vbsscript=vbsscript& $".Send()"$ & CRLF
'	vbsscript=vbsscript& $"End With"$ & CRLF
'	Writer.WriteLine(vbsscript)
'End Sub



'''Dim olApp
'''Dim objMailItem
'''
'''Set olApp = CreateObject("Outlook.Application")
'''Set objMailItem = olApp.CreateItem(0)
'''
'''objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
'''objMailItem.To = WScript.Arguments(1)
'''objMailItem.Subject = WScript.Arguments(2)
'''objMailItem.Body = WScript.Arguments(3)
'''objMailItem.Attachments.Add = WScript.Arguments(4)
'''objMailItem.Send
'''
'''Set olApp = Nothing
'''Set objMailItem = Nothing



Sub EjecutarVBSScriptDireccionesEmail As ResumableSub
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromc.vbs"))  ' nologo para no mostar avisos windows
	shl.WorkingDirectory = xui.DefaultFolder
	shl.Run(-1)
	frm.RootPane.MouseCursor=fx.Cursors.WAIT
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	Log("Success")
	Log(StdOut)
	mRes.Put("Success",True)
	mRes.Put("StdOut",StdOut)
	mRes.Put("StdErr",StdErr)
	mRes.Put("ExitCode",ExitCode)
	Return mRes
End Sub

Sub EjecutarVBSScriptEnviarEmail(SenderAddr As String, ReceiverAddr As String,Subject As String, Body As String, FileAttch As String, CCReceiverAddr As String) As ResumableSub
	
	Body=Body.Replace(CRLF,"<br>")
	
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromc2.vbs",SenderAddr, ReceiverAddr,Subject, Body, FileAttch,CCReceiverAddr))  ' nologo para no mostar avisos windows
	shl.WorkingDirectory = xui.DefaultFolder
	shl.Run(-1)
	frm.RootPane.MouseCursor=fx.Cursors.WAIT
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	Log("Success")
	Log(StdOut)
	mRes.Put("Success",True)
	mRes.Put("StdOut",StdOut)
	mRes.Put("StdErr",StdErr)
	mRes.Put("ExitCode",ExitCode)
	Return mRes
End Sub


Sub CrearCabeceraReclamacion(FEnvioLong As Long, IDU As Int, NombreUsu As String,DirEmailRem As String, DirEmailDest As String) As ResumableSub
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="NuevaReclamacionFechasPrometidasCompras"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(FEnvioLong, IDU, NombreUsu,DirEmailRem, DirEmailDest), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
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
				mRes.Put("IDReclamacionFPC", mResp.Get("IDReclamacionFPC"))
				mRes.Put("ReclamacionFPC", mResp.Get("ReclamacionFPC"))
			End If
		End If
	End If
	Return mRes
End Sub


' EJEMPLO, modificar según formulario
Sub CargaDatosPedidosCompraRecepcionesPendientes(AlmFisico As String, BorrarContenidoTabla As Boolean) As ResumableSub
	If BorrarContenidoTabla Then
		mSQL.ExecNonQuery("DELETE from tblPedidosCompraRecepcionesPendientesAlmacen")
	End If
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Select Case AlmFisico
		Case "PROIN"
			Dim sLinkJRDC As String=Main.rdclinkMySqlAlmProin
		Case "PROTEC"
			Dim sLinkJRDC As String=Main.rdclinkMySqlAlmProtec
		Case Else
			Accion="NOK"
			mRes.Put("Accion", Accion)
			Return mRes
	End Select
	
	Dim Comando As String="PedidosCompraRecepcionesPendientes"
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else
		If mResult.Get("ReqOK")=False Then' puede no haber recepciones pendientes
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tbPedidosCompraRecepcionesPendientes",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblPedidosCompraRecepcionesPendientesAlmacen",lstReg)
		End If
	End If
	Return mRes
End Sub





