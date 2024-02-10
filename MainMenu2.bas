B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@

'Static code module
Sub Process_Globals
	Private xui As XUI
	Private fx As JFX
	Private frm As Form
'	Private btnDatosLoteCorte As Button
'	Private btnPlanDeCorte As Button
'	Private btnSalir As Button
	Private pnlFondoMainMenu As Pane
'	Private btnOrdenesCorte As Button
'	Private btnDocumentacionOSUB As Button
	Private TreeViewMainMenu As TreeView
	
	
	'Private SplitPaneMainMenu As SplitPane
	'Private pnlFondoMainMenuElementos As Pane
	
	'Private PrefDialogConfiguracionUsuario As PreferencesDialog
	'Private clvListOrder As CustomListView
	Private Dialog As B4XDialog

	Private SplitPaneMainMenu As SplitPane
	
	Private TextEngine1 As BCTextEngine
	Private BBCodeViewElementosMainMenu As BBCodeView
	
'	Private Const rdclinkMySqlAlmProin As String="http://192.168.10.20:17178/rdc"
'	Private Const rdclinkMySqlAlmProtec As String="http://192.168.10.21:17178/rdc"

	Private jamLoadingIndicator1 As JamLoadingIndicator
End Sub

Sub Show
	If frm.IsInitialized=False Then
		
		'Main.forceGC.process_gc
		frm.Initialize("frm",Main.xScreen, Main.yscreen)
		Dim joForm As JavaObject = frm
		Dim joStage As JavaObject = joForm.GetField("stage")
		joStage.RunMethod("setMaximized", Array(True))
		frm.Icon = Main.IconoFormularios
		frm.RootPane.LoadLayout("scrMainMenu2")
		SplitPaneMainMenu.LoadLayout("scrMainMenuTreeView")
		'SplitPaneMainMenu.LoadLayout("scrMainMenuElementos")
		SplitPaneMainMenu.LoadLayout("scrMainMenuBBCodeElementos")
		frm.Title=Main.PrefijoTitleForms & "   " & "Menú Inicio"
		
		Dialog.Initialize (frm.RootPane)
		
		Dim jo As JavaObject
		jo=SplitPaneMainMenu
		'addPositionChangedEvent(jo.RunMethodJO("getDividers",Null).RunMethodJO("get",Array(0)),"dividerPosition")
		
		CSSUtils.SetStyleProperty(TreeViewMainMenu,"-fx-selection-bar", "#00FA9A")
		
		frm.Title="Menú Inicio " & Main.SufijoTitleForms
		
		Dialog.Initialize (frm.RootPane)
		jamLoadingIndicator1.Initialize(Me,frm.RootPane)
		jamLoadingIndicator1.EstiloLoadingIndicator="Five Lines 1"
		'jamLoadingIndicator1.ColorPanelFondo=0x40000000
		jamLoadingIndicator1.ColorPanelFondo=xui.Color_Transparent
		jamLoadingIndicator1.ColorLoadingIndicator=0xFF696969
		jamLoadingIndicator1.ColorMensaje=0xFF696969
		
		SplitPaneMainMenu.DividerPositions=Array As Double(0.30)

		
	End If
	
	'Log(TreeViewMainMenu.As(B4XView).Color)
	
'	SplitPaneMainMenu.LoadLayout("scrMainMenuTreeView")
'	SplitPaneMainMenu.LoadLayout("scrMainMenuElementos")
'	SplitPaneMainMenu.DividerPositions= Array As Double(0.3)

	CargaTreeView
	
	frm.Show
	
	TreeViewMainMenu.ClearSelection
	
	jamLoadingIndicator1.Close
	
	If TextEngine1.IsInitialized=False Then
		TextEngine1.Initialize(frm.RootPane)
	End If

'	For i=0 To Main.lstSelItem.Size-1
'	Dim strTi As String=Main.lstSelItem.Get(i)
'		'Dim strTi As String="Producción"
'		Dim ti As TreeItem=SearchTreeItem(TreeViewMainMenu.Root,strTi)
'		If ti.IsInitialized Then
'			Dim jo As JavaObject=ti
'			jo.RunMethod("setExpanded", Array(True))
'		End If
'	Next
	'
	'
'	If Main.TreeItemMenuAbreForm.IsInitialized Then
'		SearchParentsTreeItem(Main.TreeItemMenuAbreForm) Then
'		
'	End If

'''''	Main.lstSelItem.Clear
'''''	If Main.TreeItemMenuAbreForm.IsInitialized Then
'''''		Log(Main.TreeItemMenuAbreForm.Text)
'''''		If Main.TreeItemMenuAbreForm<>Null Then
'''''			SearchParentsTreeItem(Main.TreeItemMenuAbreForm)
'''''			If Main.lstSelItem.Size>0 Then
'''''				For i=Main.lstSelItem.Size-2 To 0 Step-1
'''''					Dim ti As TreeItem=Main.lstSelItem.Get(i)
'''''					
'''''					Dim tiOpen As TreeItem=SearchTreeItem(TreeViewMainMenu.Root,ti.Text)
'''''					'Log("set expanded true " & tiOpen)
'''''					Dim jo As JavaObject=tiOpen
'''''					jo.RunMethod("setExpanded", Array(True))
'''''				Next
'''''			End If
	'''''			ScrollToItem(TreeViewMainMenu,Main.TreeItemMenuAbreForm)
	'''''		End If
	'''''	End If

	Main.lstSelItem.Clear
	If Main.TreeItemMenuAbreForm.IsInitialized Then
		#if debug
		Log(Main.TreeItemMenuAbreForm.Text)
		#End If
		If Main.TreeItemMenuAbreForm<>Null Then
			SearchParentsTreeItem(Main.TreeItemMenuAbreForm)
			If Main.lstSelItem.Size>0 Then
				For i=Main.lstSelItem.Size-2 To 0 Step-1
					Dim ti As TreeItem=Main.lstSelItem.Get(i)
					#if debug
					Log("ti.text " & ti.Text)
					#End If
					Dim tiOpen As TreeItem=SearchTreeItem(TreeViewMainMenu.Root,ti.Text)
					If tiOpen.Text="root" Then Continue
					#if debug
					Log("tiOpen.text " & tiOpen.Text)
					#End If
					
					'Log("set expanded true " & tiOpen)
					
					Dim jo As JavaObject=tiOpen
					jo.RunMethod("setExpanded", Array(True))
					'CrearAccesosDirectosItemExpandido(tiOpen)
				Next
			End If
			ScrollToItem(TreeViewMainMenu,Main.TreeItemMenuAbreForm)
			'CrearAccesosDirectosItem2(Main.TreeItemMenuAbreForm.Parent)
			CrearAccesosDirectosItem3(TreeItemMayorNivelExpandido(TreeViewMainMenu.Root))
		Else
			'CrearAccesosDirectosItem2(TreeViewMainMenu.Root)
			CrearAccesosDirectosItem3(TreeItemMayorNivelExpandido(TreeViewMainMenu.Root))
		End If
	Else
		'CrearAccesosDirectosItem2(TreeViewMainMenu.Root)
		CrearAccesosDirectosItem3(TreeItemMayorNivelExpandido(TreeViewMainMenu.Root))
	End If
	
	wait for(VerificarVersionActual) complete (Accion As String)
	If Accion="ExitApp" Then
		ExitApplication
	End If
	
'	If Main.AlmacenConexion="" Then
'		Wait For(SeleccionarAlmacen) complete (sResp As String)
'		If sResp="" Then
''			Dim msa As Object = xui.Msgbox2Async("Es necesario indicar el almacén de conexión." & CRLF & CRLF & "¿Salir de la aplicación?", "", "Sí", "", "No", Null)
''			Wait For (msa) Msgbox_Result (rInt As Int)
''			If rInt=xui.DialogResponse_Positive Then
''				frm.Close
''			Else
''				
''			End If
'			frm.close
'		Else
'			Main.AlmacenConexion=sResp
'			Select Case Main.AlmacenConexion
'				Case "PROIN"
'					Main.rdclinkMySqlAlmConexion=rdclinkMySqlAlmProin
'				Case "PROTEC"
'					Main.rdclinkMySqlAlmConexion=rdclinkMySqlAlmProtec
'			End Select
'
'			'Main.SufijoTitleForms="   " & Main.NombreAplicacionForms & "  v" & Main.Version & "    Usuario: " &  Main.DatosUsuario.NombreUsuarioWindows & "   ALMACEN CONEXION: " & Main.AlmacenConexion
'			'frm.Title="Menú Inicio " & Main.SufijoTitleForms
'		End If
'	Else
'		'Main.SufijoTitleForms="   " & Main.NombreAplicacionForms & "  v" & Main.Version & "    Usuario: " &  Main.DatosUsuario.NombreUsuarioWindows & "   ALMACEN CONEXION: " & Main.AlmacenConexion
'		frm.Title=Main.PrefijoTitleForms & "Menú Inicio"
'		Select Case Main.AlmacenConexion
'			Case "PROIN"
'				Main.rdclinkMySqlAlmConexion=rdclinkMySqlAlmProin
'			Case "PROTEC"
'				Main.rdclinkMySqlAlmConexion=rdclinkMySqlAlmProtec
'		End Select
'	End If
End Sub

Sub SeleccionarAlmacen As ResumableSub

	Dialog.Title="Selecciona Almacén de Conexión"
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
		
	Dim lstOpciones As List=Array As String("PROIN","PROTEC")
	
	B4XListDlg.Options=lstOpciones
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,80dip)
	Next
	
	' OJO ... es un B4XView no Button
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then 
		Return ""
	Else
		
		If Main.AlmacenIPConexion<>"" And Main.AlmacenIPConexion<>B4XListDlg.SelectedItem Then
			Dim msa As Object = xui.Msgbox2Async("Se ha seleccionado un almacén distinto al almacén en el que te has conectado por red." & CRLF & CRLF & _
				"Esto afecta a los datos de Almacen que se pueden ver/editar y a las impresoras que se pueden seleccionar." & CRLF & CRLF & "¿Continuar?","Confirma", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return ""
		End If
		
		Return B4XListDlg.SelectedItem
	End If
End Sub

Sub VerificarVersionActual As ResumableSub
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"VersionActualAplicacion",Array As String(Main.NombreAplicacion),Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query VersionActualAplicacion. Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		'frm.Close
		'ExitApplication
		Accion="ExitApp"
		Return Accion
	Else
		If mresult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos de versión actual en la tabla...","Aviso")
			Wait For (msa) Msgbox_Result
			'frm.Close
'			ExitApplication
'			Return
			Accion="ExitApp"
			Return Accion
		Else
			Dim lstRegistros As List=mresult.Get("lstRes")
			Dim m As Map=lstRegistros.Get(0)
			Dim VersionServidor As String=m.Get("VersionActual")
			#if release
				If VersionServidor<>Main.Version Then
					Dim msa As Object=xui.MsgboxAsync("Existe una versión más actual de la aplicación." & CRLF & CRLF & "La aplicación se cerrará." & _
						CRLF & CRLF & "Vuelve a abrir la aplicación para actualizarla." & CRLF & CRLF & "(Versión aplicacion: " & Main.version & " / Versión Servidor: " & VersionServidor & ")","Aviso")
					Wait For (msa) Msgbox_Result
					frm.Close
					Accion="ExitApp"
					Return Accion
					
'					ExitApplication
'					return
				Else
			'CargaTreeView
				Return "OK"
				End If
			#end if
			#if debug 
			'CargaTreeView
			Return "OK"
			#End If

		End If
	End If
	
End Sub

Sub CargaTreeView
	
	TreeViewMainMenu.Root.Children.Clear
	
	Dim imgTreeItemGo As Image=Main.fx.LoadImageSample(File.Dirassets, "arrow-right16.png",16,16)

	''
'	Dim tiLogistica As TreeItem
'	tiLogistica.Initialize("tItem","Documento")
'	tiLogistica.Image=Main.fx.LoadImageSample(File.Dirassets, "cargo32.png",32,32)
'	TreeViewMainMenu.Root.Children.Add(tiLogistica)

	Dim tiDocumentos As TreeItem
	tiDocumentos.Initialize("tItem","Documentos")
	'tiDocumentos.Image=Main.fx.LoadImageSample(File.Dirassets, "documento naranja32.png",32,32)
	'tiDocumentos.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF1EA),32,xui.Color_Black)
	tiDocumentos.Image=Main.fx.LoadImage(File.Dirassets, "outline_description_black_36dp.png")
	TreeViewMainMenu.Root.Children.Add(tiDocumentos)

	Dim tiControlDocumentosNoGestionados As TreeItem
	tiControlDocumentosNoGestionados.Initialize("tItem","Documentos No Gestionados")
	tiControlDocumentosNoGestionados.Image=imgTreeItemGo
	tiDocumentos.Children.Add(tiControlDocumentosNoGestionados)
	
	Dim tiControlDocumentosPeriodo As TreeItem
	tiControlDocumentosPeriodo.Initialize("tItem","Documentos Periodo")
	tiControlDocumentosPeriodo.Image=imgTreeItemGo
	tiDocumentos.Children.Add(tiControlDocumentosPeriodo)
	
	Dim tiControlOSUBsPendientesNoConfeccion As TreeItem
	tiControlOSUBsPendientesNoConfeccion.Initialize("tItem","OSUBs Pendientes No Confección")
	tiControlOSUBsPendientesNoConfeccion.Image=imgTreeItemGo
	tiDocumentos.Children.Add(tiControlOSUBsPendientesNoConfeccion)
	
	Dim tiFasesDocumento As TreeItem
	tiFasesDocumento.Initialize("tItem","Fases Documento")
	tiFasesDocumento.Image=imgTreeItemGo
	tiDocumentos.Children.Add(tiFasesDocumento)
	
	Dim tiMarcarAlbaranFisico As TreeItem
	tiMarcarAlbaranFisico.Initialize("tItem","Marcar Albarán Físico")
	tiMarcarAlbaranFisico.Image=imgTreeItemGo
	tiDocumentos.Children.Add(tiMarcarAlbaranFisico)
	
	Dim tiLogistica As TreeItem
	tiLogistica.Initialize("tItem","Logística")
	'tiLogistica.Image=Main.fx.LoadImageSample(File.Dirassets, "cargo32.png",32,32)
	tiLogistica.Image=Main.fx.LoadImage(File.Dirassets, "outline_local_shipping_black_36dp.png")

	TreeViewMainMenu.Root.Children.Add(tiLogistica)
	
	Dim tiTransportes As TreeItem
	tiTransportes.Initialize("tItem","Transportes")
	'tiTransportes.Image=Main.fx.LoadImageSample(File.Dirassets, "delivery-truck32b.png",32,32)
	tiTransportes.Image=imgTreeItemGo
	tiLogistica.Children.Add(tiTransportes)
	
	Dim tiTXT As TreeItem
	tiTXT.Initialize("tItem","TXT")
	tiTXT.Image=Main.fx.LoadImageSample(File.Dirassets, "txttransporte.jpg",32,32)
	tiTransportes.Children.Add(tiTXT)
	
	Dim tiTXTExpedicionesSinEntregar As TreeItem
	tiTXTExpedicionesSinEntregar.Initialize("tItem","Expediciones Sin Entregar TXT")
	tiTXTExpedicionesSinEntregar.Image=imgTreeItemGo
	tiTXT.Children.Add(tiTXTExpedicionesSinEntregar)
	
	Dim tiTXTExpedicionesPeriodo As TreeItem
	tiTXTExpedicionesPeriodo.Initialize("tItem","Expediciones Periodo TXT")
	tiTXTExpedicionesPeriodo.Image=imgTreeItemGo
	tiTXT.Children.Add(tiTXTExpedicionesPeriodo)
	
	Dim tiDHL As TreeItem
	tiDHL.Initialize("tiItem","DHL")
	tiDHL.Image=Main.fx.LoadImageSample(File.Dirassets, "DHLsq.png",32,32)
	tiTransportes.Children.Add(tiDHL)
	
	Dim tiDHLExpedicionesSinEntregar As TreeItem
	tiDHLExpedicionesSinEntregar.Initialize("tItem","Expediciones Sin Entregar DHL")
	tiDHLExpedicionesSinEntregar.Image=imgTreeItemGo
	tiDHL.Children.Add(tiDHLExpedicionesSinEntregar)
	
	Dim tiCorreosExpress As TreeItem
	tiCorreosExpress.Initialize("tiItem","Correos Express")
	tiCorreosExpress.Image=Main.fx.LoadImageSample(File.Dirassets, "correosexpress.jpg",32,32)
	tiTransportes.Children.Add(tiCorreosExpress)
	
	Dim tiCorreosExpressExpedicionesPeriodo As TreeItem
	tiCorreosExpressExpedicionesPeriodo.Initialize("tItem","Expediciones Periodo Correos Express")
	tiCorreosExpressExpedicionesPeriodo.Image=imgTreeItemGo
	tiCorreosExpress.Children.Add(tiCorreosExpressExpedicionesPeriodo)
	
	Dim tiCorreosExpressInfoExpedicion As TreeItem
	tiCorreosExpressInfoExpedicion.Initialize("tItem","Info Expedición Correos Express")
	tiCorreosExpressInfoExpedicion.Image=imgTreeItemGo
	tiCorreosExpress.Children.Add(tiCorreosExpressInfoExpedicion)
	
'''''	Dim tiDocumentosExpedicion As TreeItem
'''''	tiDocumentosExpedicion.Initialize("tItem","Documentos Expedición")
'''''	tiDocumentosExpedicion.Image=imgTreeItemGo
'''''	tiTransportes.Children.Add(tiDocumentosExpedicion)
	
	Dim tiCompras As TreeItem
	tiCompras.Initialize("tItem","Compras")
	'tiCompras.Image=Main.fx.LoadImageSample(File.Dirassets, "shopping-cart32freepick.png",32,32)
	tiCompras.Image=Main.fx.LoadImage(File.Dirassets, "outline_shopping_cart_IN_black_36dp.png")
	TreeViewMainMenu.Root.Children.Add(tiCompras)
	
	Dim tiSeguimientoFechasPrometidasPedidosCompra As TreeItem
	tiSeguimientoFechasPrometidasPedidosCompra.Initialize("tItem","Seguimiento Fechas Prometidas Pedidos Compra")
	tiSeguimientoFechasPrometidasPedidosCompra.Image=imgTreeItemGo
	tiCompras.Children.Add(tiSeguimientoFechasPrometidasPedidosCompra)
	
'	Dim tiIncidenciasProveedor As TreeItem
'	tiIncidenciasProveedor.Initialize("tItem","Incidencias Proveedor")
'	tiIncidenciasProveedor.Image=imgTreeItemGo
'	tiCompras.Children.Add(tiIncidenciasProveedor)
'	
'	Dim tiTareasAbiertasIncidenciasProveedor As TreeItem
'	tiTareasAbiertasIncidenciasProveedor.Initialize("tItem","Tareas Pendientes Incidencias Proveedor")
'	tiTareasAbiertasIncidenciasProveedor.Image=imgTreeItemGo
'	tiCompras.Children.Add(tiTareasAbiertasIncidenciasProveedor)
	
	Dim tiEvaluacionProveedores As TreeItem
	tiEvaluacionProveedores.Initialize("tItem","Evaluación Proveedores")
	tiEvaluacionProveedores.Image=imgTreeItemGo
	tiCompras.Children.Add(tiEvaluacionProveedores)
	
	Dim tiVentas As TreeItem
	tiVentas.Initialize("tItem","Ventas")
	'tiVentas.Image=Main.fx.LoadImageSample(File.Dirassets, "quitar-del-carrito32.png",32,32)
	tiVentas.Image=Main.fx.LoadImage(File.Dirassets, "outline_shopping_cart_OUT_black_36dp.png")
	TreeViewMainMenu.Root.Children.Add(tiVentas)
	
	Dim tiGestionVentas As TreeItem
	tiGestionVentas.Initialize("tItem","Gestión Ventas")
	tiGestionVentas.Image=imgTreeItemGo
	tiVentas.Children.Add(tiGestionVentas)
	
	Dim tiInformesExpedicionesClientes As TreeItem
	tiInformesExpedicionesClientes.Initialize("tItem","Informes Expediciones Clientes")
	tiInformesExpedicionesClientes.Image=imgTreeItemGo
	tiVentas.Children.Add(tiInformesExpedicionesClientes)
	
	Dim ticGeneracionFicherosCSVPlantillaPedidos As TreeItem
	ticGeneracionFicherosCSVPlantillaPedidos.Initialize("tItem","Generación Ficheros CSV Plantilla Pedidos Venta")
	ticGeneracionFicherosCSVPlantillaPedidos.Image=imgTreeItemGo
	tiVentas.Children.Add(ticGeneracionFicherosCSVPlantillaPedidos)
	
	Dim ticRestartDocuwareBackworker As TreeItem
	ticRestartDocuwareBackworker.Initialize("tItem","Reiniciar sincronización Docuware")
	ticRestartDocuwareBackworker.Image=imgTreeItemGo
	tiVentas.Children.Add(ticRestartDocuwareBackworker)
	
	
	' cambiado a cTOJ, para relacionarlo directamente con la generacion de las fichas de oferta
'''	Dim tiAnalisisTarifasVenta As TreeItem
'''	tiAnalisisTarifasVenta.Initialize("tItem","Análisis Tarifas Venta")
'''	tiAnalisisTarifasVenta.Image=imgTreeItemGo
'''	tiVentas.Children.Add(tiAnalisisTarifasVenta)
	
	Dim tiB2B As TreeItem
	tiB2B.Initialize("tItem","B2B")
	'tiB2B.Image=imgTreeItemGo
	tiVentas.Children.Add(tiB2B)
	
	Dim tiTestsInfoMagento As TreeItem
	tiTestsInfoMagento.Initialize("tItem","Tests Info Magento")
	tiTestsInfoMagento.Image=imgTreeItemGo
	tiB2B.Children.Add(tiTestsInfoMagento)
	
	Dim tiPedidosClientes As TreeItem
	tiPedidosClientes.Initialize("tItem","Pedidos Clientes")
	tiPedidosClientes.Image=imgTreeItemGo
	tiB2B.Children.Add(tiPedidosClientes)
	
'	Dim tiPunchoutLear As TreeItem
'	tiPunchoutLear.Initialize("tItem","Punchout Lear")
'	tiPunchoutLear.Image=imgTreeItemGo
'	tiB2B.Children.Add(tiPunchoutLear)
'	
'	Dim tiPedidosClientePunchoutLear As TreeItem
'	tiPedidosClientePunchoutLear.Initialize("tItem","Pedidos Cliente Punchout Lear")
'	tiPedidosClientePunchoutLear.Image=imgTreeItemGo
'	tiPunchoutLear.Children.Add(tiPedidosClientePunchoutLear)
'	
'	Dim tiFacturacionPedidosClientePunchoutLear As TreeItem
'	tiFacturacionPedidosClientePunchoutLear.Initialize("tItem","Facturación Pedidos Cliente Punchout Lear")
'	tiFacturacionPedidosClientePunchoutLear.Image=imgTreeItemGo
'	tiPunchoutLear.Children.Add(tiFacturacionPedidosClientePunchoutLear)
	
	Dim tiRepsol As TreeItem
	tiRepsol.Initialize("tItem","Repsol")
	'tiRepsol.Image=imgTreeItemGo
	tiVentas.Children.Add(tiRepsol)
	
	Dim tiImportacionPedidosEESSRepsol As TreeItem
	tiImportacionPedidosEESSRepsol.Initialize("tItem","Importacion Pedidos EESS Repsol")
	tiImportacionPedidosEESSRepsol.Image=imgTreeItemGo
	tiRepsol.Children.Add(tiImportacionPedidosEESSRepsol)
	
	Dim tiAlbaranesVentaRepsol As TreeItem
	tiAlbaranesVentaRepsol.Initialize("tItem","Albaranes Venta Repsol")
	tiAlbaranesVentaRepsol.Image=imgTreeItemGo
	tiRepsol.Children.Add(tiAlbaranesVentaRepsol)
	

	
'	Dim PackageImg As Image=Utilidades.SetFontToBitmap(Chr(0xf3d6), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",32,32),32,xui.Color_Black)
'	'Dim PackageImg As Image=SetFontToBitmap(Utilidades.UnescapeUnicode("\uf0f4"), Main.LaRegularFont,32,xui.Color_Black)
'	Dim tiAlmacen As TreeItem
'	tiAlmacen.Initialize("tItem","Almacén")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "package64.png",32,32)
'	tiAlmacen.Image=PackageImg
'	TreeViewMainMenu.Root.Children.Add(tiAlmacen)
'	
'	Dim tiIncidenciasProveedorAlmacen As TreeItem
'	tiIncidenciasProveedorAlmacen.Initialize("tItem","Incidencias Proveedor Almacén")
'	tiIncidenciasProveedorAlmacen.Image=imgTreeItemGo
'	tiAlmacen.Children.Add(tiIncidenciasProveedorAlmacen)

	Dim tiAnalisisDatos As TreeItem
	tiAnalisisDatos.Initialize("tItem","Análisis de Datos")
	'tiAnalisisDatos.Image=Main.fx.LoadImageSample(File.Dirassets, "analisisDatos32UniconLabs.png",32,32)
	'tiAnalisisDatos.Image=Main.fx.LoadImageSample(File.Dirassets, "outline_data_exploration_black_36dp.png",32,32)
	tiAnalisisDatos.Image=Main.fx.LoadImageSample(File.Dirassets, "outline_analytics_black_36dp.png",36,36)
	TreeViewMainMenu.Root.Children.Add(tiAnalisisDatos)
	
	Dim tiAnalisisDisponiblesAlmacenArticuloTalla As TreeItem
	tiAnalisisDisponiblesAlmacenArticuloTalla.Initialize("tItem","Análisis Disponibles Almacén Artículo Talla")
	tiAnalisisDisponiblesAlmacenArticuloTalla.Image=imgTreeItemGo
	tiAnalisisDatos.Children.Add(tiAnalisisDisponiblesAlmacenArticuloTalla)
	
''''	Dim tiAnalisisDisponiblesArticuloTallaAlmacenesComputables As TreeItem
''''	tiAnalisisDisponiblesArticuloTallaAlmacenesComputables.Initialize("tItem","Análisis Disponibles Artículo Talla Almacenes Computables")
''''	tiAnalisisDisponiblesArticuloTallaAlmacenesComputables.Image=imgTreeItemGo
''''	tiAnalisisDatos.Children.Add(tiAnalisisDisponiblesArticuloTallaAlmacenesComputables)
	
	
	
	Dim tiIncidencias As TreeItem
	tiIncidencias.Initialize("tItem","Incidencias")
	'tiAnalisisDatos.Image=Main.fx.LoadImageSample(File.Dirassets, "analisisDatos32UniconLabs.png",32,32)
	'tiAnalisisDatos.Image=Main.fx.LoadImageSample(File.Dirassets, "outline_data_exploration_black_36dp.png",32,32)
	Dim BombImg As Image=Utilidades.SetFontToBitmap(Chr(0xf690), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",32,32),32,xui.Color_Black)
	tiIncidencias.Image=BombImg
	TreeViewMainMenu.Root.Children.Add(tiIncidencias)
	
	Dim tiIncidenciasProveedor As TreeItem
	tiIncidenciasProveedor.Initialize("tItem","Proveedores")
	tiIncidenciasProveedor.Image=imgTreeItemGo
	tiIncidencias.Children.Add(tiIncidenciasProveedor)
	
	Dim tiIncidenciasProveedorLista As TreeItem
	tiIncidenciasProveedorLista.Initialize("tItem","Incidencias Proveedor")
	tiIncidenciasProveedorLista.Image=imgTreeItemGo
	tiIncidenciasProveedor.Children.Add(tiIncidenciasProveedorLista)
	
	Dim tiIncidenciasProveedorTaeasPendientes As TreeItem
	tiIncidenciasProveedorTaeasPendientes.Initialize("tItem","Tareas Pendientes Incidencias Proveedor")
	tiIncidenciasProveedorTaeasPendientes.Image=imgTreeItemGo
	tiIncidenciasProveedor.Children.Add(tiIncidenciasProveedorTaeasPendientes)
	
	
	
	Dim tiIncidenciasCliente As TreeItem
	tiIncidenciasCliente.Initialize("tItem","Clientes")
	tiIncidenciasCliente.Image=imgTreeItemGo
	tiIncidencias.Children.Add(tiIncidenciasCliente)
	
		
	Dim tiIncidenciasInternas As TreeItem
	tiIncidenciasInternas.Initialize("tItem","Internas")
	tiIncidenciasInternas.Image=imgTreeItemGo
	tiIncidencias.Children.Add(tiIncidenciasInternas)
	
	
'	
'	
'	Dim tiConsultasAlmacen As TreeItem
'	tiConsultasAlmacen.Initialize("tItem","Consultas Almacén")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiAlmacen.Children.Add(tiConsultasAlmacen)
'	
'	Dim tiStockArticulo As TreeItem
'	tiStockArticulo.Initialize("tItem","Stock Artículo")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiConsultasAlmacen.Children.Add(tiStockArticulo)
'	
'	Dim tiHistoricoMovimientosEtiqueta As TreeItem
'	tiHistoricoMovimientosEtiqueta.Initialize("tItem","Histórico Movimientos Artículo")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiConsultasAlmacen.Children.Add(tiHistoricoMovimientosEtiqueta)
'	
'	Dim tiHistoricoMovimientosEtiqueta As TreeItem
'	tiHistoricoMovimientosEtiqueta.Initialize("tItem","Histórico Movimientos Etiqueta")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiConsultasAlmacen.Children.Add(tiHistoricoMovimientosEtiqueta)
'	
'
'	
'	Dim tiGestionAlmacen As TreeItem
'	tiGestionAlmacen.Initialize("tItem","Gestión Almacén")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiAlmacen.Children.Add(tiGestionAlmacen)
'	
'		
'	Dim tiUbicaciones As TreeItem
'	tiUbicaciones.Initialize("tItem","Zonas-Ubicaciones")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiGestionAlmacen.Children.Add(tiUbicaciones)
'	
'	Dim tiTiposEmbalajes As TreeItem
'	tiTiposEmbalajes.Initialize("tItem","Tipos Embalajes")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiGestionAlmacen.Children.Add(tiTiposEmbalajes)
'	
'	Dim tiInventarios As TreeItem
'	tiInventarios.Initialize("tItem","Inventarios")
'	'tiAlmacen.Image=Main.fx.LoadImageSample(File.Dirassets, "almacen32.png",32,32)
'	tiGestionAlmacen.Children.Add(tiInventarios)
'	
'	
'	
'	Dim tiExpediciones As TreeItem
'	tiExpediciones.Initialize("tItem","Expediciones")
'	tiExpediciones.Image=Main.fx.LoadImageSample(File.Dirassets, "delivery-truck32.png",32,32)
'	'tiAlmacen.Children.Add(tiExpediciones)
'	TreeViewMainMenu.Root.Children.Add(tiExpediciones)
'	
'	Dim tiTXT As TreeItem
'	tiTXT.Initialize("tItem","Expediciones TXT")
'	tiTXT.Image=Main.fx.LoadImageSample(File.Dirassets, "txttransporte.jpg",32,32)
'	tiExpediciones.Children.Add(tiTXT)
'	
'	Dim tiBuscarExpedicionesTempTXT As TreeItem
'	tiBuscarExpedicionesTempTXT.Initialize("tItem","Expediciones Abiertas TXT")
'	'tiBuscarExpedicionesTempTXT.Image=Main.fx.LoadImageSample(File.Dirassets, "txttransporte.jpg",32,32)
'	tiTXT.Children.Add(tiBuscarExpedicionesTempTXT)
	'
'''
'''	Dim tiConfiguracionAplicacion As TreeItem
'''	tiConfiguracionAplicacion.Initialize("tItem","Configuración Aplicacion")
'''	tiConfiguracionAplicacion.Image=Main.fx.LoadImageSample(File.Dirassets, "settings32.png",32,32)
'''	TreeViewMainMenu.Root.Children.Add(tiConfiguracionAplicacion)
'''	
'''	Dim tiConfiguracionUsuario As TreeItem
'''	tiConfiguracionUsuario.Initialize("tItem","Configuración Usuario")
'''	tiConfiguracionUsuario.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-ajustes-100.png",48,48)
'''	tiConfiguracionAplicacion.Children.Add(tiConfiguracionUsuario)
	
''''	Dim tiHelpDesk As TreeItem
''''	tiHelpDesk.Initialize("tItem","HelpDesk")
''''	tiHelpDesk.Image=Main.fx.LoadImageSample(File.Dirassets, "customer-service.png",48,48)
''''	TreeViewMainMenu.Root.Children.Add(tiHelpDesk)
	
'	If Main.DatosUsuario.Administrador Then
'		Dim tiConfiguracionAdmin As TreeItem
'		tiConfiguracionAdmin.Initialize("tItem","Configuración Administrador")
'		tiConfiguracionAdmin.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-ajustes-100.png",48,48)
'		tiConfiguracionAplicacion.Children.Add(tiConfiguracionAdmin)
'	End If
'
'	If Main.DatosUsuario.Administrador Then
'		Dim tiPrueba As TreeItem
'		tiPrueba.Initialize("tItem","Test")
'		tiPrueba.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-tubo-de-ensayo-100.png",48,48)
'		TreeViewMainMenu.Root.Children.Add(tiPrueba)
'	End If

	Dim tiUtilidades As TreeItem
	tiUtilidades.Initialize("tItem","Utilidades")
	'tiSalir.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-running-100.png",48,48)
	tiUtilidades.Image=Main.fx.LoadImage(File.Dirassets, "outline_handyman_black_36dp.png")
	TreeViewMainMenu.Root.Children.Add(tiUtilidades)

	Dim tiFicherosCarpetaExcelLinks As TreeItem
	tiFicherosCarpetaExcelLinks.Initialize("tItem","Crear Excel Links Ficheros Carpeta")
	'tiSalir.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-running-100.png",48,48)
	tiFicherosCarpetaExcelLinks.Image=imgTreeItemGo
	tiUtilidades.Children.Add(tiFicherosCarpetaExcelLinks)
	
	If Main.DatosUsuario.Administrador Then
		Dim tiPermisosAplicacion As TreeItem
		tiPermisosAplicacion.Initialize("tItem","Permisos Aplicacion")
		'tiPermisosAplicacion.Image=Main.fx.LoadImageSample(File.Dirassets, "key-person32.png",32,32)
		tiPermisosAplicacion.Image=Main.fx.LoadImage(File.Dirassets, "outline_vpn_key_black_36dp.png")
		TreeViewMainMenu.Root.Children.Add(tiPermisosAplicacion)
	End If
	
	Dim tiAcercaDe As TreeItem
	tiAcercaDe.Initialize("tItem","Acerca De")
	'tiSalir.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-running-100.png",48,48)
	'tiAcercaDe.Image=Main.fx.LoadImage(File.Dirassets, "information32freepik.png")
	tiAcercaDe.Image=Main.fx.LoadImage(File.Dirassets, "outline_info_black_36dp.png")
	TreeViewMainMenu.Root.Children.Add(tiAcercaDe)

	Dim tiSalir As TreeItem
	tiSalir.Initialize("tItem","Salir de la aplicación")
	'tiSalir.Image=Main.fx.LoadImageSample(File.Dirassets, "icons8-running-100.png",48,48)
	'tiSalir.Image=Main.fx.LoadImageSample(File.Dirassets, "salidaPuerta64.png",32,32)
	tiSalir.Image=Main.fx.LoadImage(File.Dirassets, "outline_logout_black_36dp.png")
	TreeViewMainMenu.Root.Children.Add(tiSalir)
	
'	TreeViewMainMenu.ClearSelection
'	
'	
'	
'
''	For i=0 To Main.lstSelItem.Size-1
''	Dim strTi As String=Main.lstSelItem.Get(i)
''		'Dim strTi As String="Producción"
''		Dim ti As TreeItem=SearchTreeItem(TreeViewMainMenu.Root,strTi)
''		If ti.IsInitialized Then
''			Dim jo As JavaObject=ti
''			jo.RunMethod("setExpanded", Array(True))
''		End If
''	Next
''
''
''	If Main.TreeItemMenuAbreForm.IsInitialized Then
''		SearchParentsTreeItem(Main.TreeItemMenuAbreForm) Then
''		
''	End If
'
'	Main.lstSelItem.Clear
'	If Main.TreeItemMenuAbreForm.IsInitialized Then
'		Log(Main.TreeItemMenuAbreForm.Text)
'		If Main.TreeItemMenuAbreForm<>Null Then
'			SearchParentsTreeItem(Main.TreeItemMenuAbreForm)
'			If Main.lstSelItem.Size>0 Then
'				For i=Main.lstSelItem.Size-2 To 0 Step-1
'					Dim ti As TreeItem=Main.lstSelItem.Get(i)
'					
'					Dim tiOpen As TreeItem=SearchTreeItem(TreeViewMainMenu.Root,ti.Text)
'					'Log("set expanded true " & tiOpen)
'					Dim jo As JavaObject=tiOpen
'					jo.RunMethod("setExpanded", Array(True))
'				Next
'			End If
'			ScrollToItem(TreeViewMainMenu,Main.TreeItemMenuAbreForm)
'		End If
'	End If

	
End Sub

Sub SearchTreeItem(Parent As TreeItem, s As String) As TreeItem
	For Each ti As TreeItem In Parent.Children
		If ti.Text = s Then
			Return ti
		End If
		If ti.Children.Size > 0 Then
			Dim res As TreeItem = SearchTreeItem(ti, s)
			If res.IsInitialized Then Return res
		End If
	Next
	Dim res As TreeItem
	Return res
End Sub

Sub SearchParentsTreeItem(tiOR As TreeItem)
	
	Dim tiP As TreeItem=tiOR.Parent
	If tiP.IsInitialized Then
		Log(tiP.Text)
		'If tiP.Text<>"root" Then
			Main.lstSelItem.Add(tiP)
			SearchParentsTreeItem(tiP)
		'End If
	End If
End Sub

'Sub frm_CloseRequest (EventData As Event)
'	EventData.Consume
'End Sub

Sub tItem_MouseClicked_Event(MethodName As String, Args() As Object)
	Dim tI As TreeItem=Sender
	Dim JOMbtn As JavaObject=asJO(Args(0)).RunMethodJO("getButton",Null)
	Dim sBtn As String=JOMbtn.RunMethod("name",Null)
	Log("tItem_MouseClicked")
	Log(tI.Text & " " & tI.Expanded)
	

	If tI.Expanded Then
		'TreeItemNivelMaxExpandido=ti
		ContraerItemsOtrasRamas2(tI)
		Select Case tI.Text   ' con este select se puede controlar permisos sobre los menús "parents"
			Case "Calidad"
				
				jamLoadingIndicator1.show
				Dim PermisoCalidadOK As Boolean
				Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cImpresionEtiquetasOlano")) complete (sRes As String)
				jamLoadingIndicator1.Close
				If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then
					tI.Expanded=False
					Return
				End If
				'				PermisoCalidadOK=True
				'
				'
				'				If PermisoCalidadOK=False Then
				'					ti.Expanded=False
				'					Return
				'				End If
	
		End Select
		
		Main.lstSelItem.Clear
		SearchParentsTreeItem(tI)
		'ContraerItemsOtrasRamas(TreeViewMainMenu.Root, ti)
		'CrearAccesosDirectosItem2(ti)
		
		
	Else
		'TreeItemNivelMaxExpandido=ti.Parent
		'		Main.lstSelItem.Clear
		'		SearchParentsTreeItem(ti)
		ContraerItemsChildren(tI)
		'
		'		If ti.Parent.Expanded Then
		'			CrearAccesosDirectosItem2(ti.Parent)
		'		End If
	
	End If
	'CrearAccesosDirectosItem2(TreeItemMayorNivelExpandido(TreeViewMainMenu.Root))
	Dim tiMaxNivelExp As TreeItem=TreeItemMayorNivelExpandido(TreeViewMainMenu.Root)
	CrearAccesosDirectosItem3(tiMaxNivelExp)
End Sub


Sub tItem_ExpandedChanged(Expanded As Boolean)
	
	Dim ti As TreeItem=Sender
	Log(ti.Text & " " & ti.Expanded)
	
	If ti.Expanded Then
		'TreeItemNivelMaxExpandido=ti
		ContraerItemsOtrasRamas2(ti)
'		Select Case ti.Text   ' con este select se puede controlar permisos sobre los menús "parents"
'			Case "Calidad"
'				
'				jamLoadingIndicator1.show
'				Dim PermisoCalidadOK As Boolean
'				Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cImpresionEtiquetasOlano")) complete (sRes As String)
'				jamLoadingIndicator1.Close
'				If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then
'					ti.Expanded=False
'					Return
'				End If
		''				PermisoCalidadOK=True
		''
		''
		''				If PermisoCalidadOK=False Then
		''					ti.Expanded=False
		''					Return
		''				End If
		'
'		End Select
		
		Main.lstSelItem.Clear
		SearchParentsTreeItem(ti)
		'ContraerItemsOtrasRamas(TreeViewMainMenu.Root, ti)
		'CrearAccesosDirectosItem2(ti)
		
		
	Else
		'TreeItemNivelMaxExpandido=ti.Parent
'		Main.lstSelItem.Clear
'		SearchParentsTreeItem(ti)
		ContraerItemsChildren(ti)
'		
'		If ti.Parent.Expanded Then
'			CrearAccesosDirectosItem2(ti.Parent)
'		End If

	End If
	'CrearAccesosDirectosItem2(TreeItemMayorNivelExpandido(TreeViewMainMenu.Root))
	Dim tiMaxNivelExp As TreeItem=TreeItemMayorNivelExpandido(TreeViewMainMenu.Root)
	CrearAccesosDirectosItem3(tiMaxNivelExp)
End Sub


Sub TreeViewMainMenu_SelectedItemChanged (SelectedItem As TreeItem)
	If SelectedItem.IsInitialized=False Then Return
	Main.TreeItemMenuAbreForm=SelectedItem
	
	'Dim TextoSelectedItem As String=SelectedItem.Text
	
	LogColor("SelectedItem " & SelectedItem.Text,xui.Color_Blue)
	
	
	
	Select SelectedItem.Text
		Case "Salir de la aplicación"
			Dim answ As Int
			answ=Main.fx.Msgbox2(frm,"¿Salir de la aplicación?","Salir","Sí","","No",Main.fx.MSGBOX_CONFIRMATION)
			If answ=Main.fx.DialogResponse.POSITIVE Then
'				Main.SQLMem.Close
'				Main.SQLFich.Close
				ExitApplication
			End If
			
'		Case "Selección Almacén Conexión"
'			Wait For(SeleccionarAlmacen) complete (sResp As String)
'			If sResp="" Then 
'				Return
'			Else
'				Main.AlmacenConexion=sResp
'				Select Case Main.AlmacenConexion
'					Case "PROIN"
'						Main.rdclinkMySqlAlmConexion=rdclinkMySqlAlmProin
'					Case "PROTEC"
'						Main.rdclinkMySqlAlmConexion=rdclinkMySqlAlmProtec
'				End Select
'				'Main.SufijoTitleForms="   " & Main.NombreAplicacionForms & "  v" & Main.Version & "    Usuario: " &  Main.DatosUsuario.NombreUsuarioWindows & "   ALMACEN CONEXION: " & Main.AlmacenConexion
'				frm.Title=Main.PrefijoTitleForms & "Menú Inicio "
'			End If
			
		Case "Documentos No Gestionados"
			Dim cCDG As cControlDocumentosNoGestionados
			cCDG.Initialize
			cCDG.Show
			frm.Close
			
		Case "Documentos Periodo"
			Dim cCDP As cControlDocumentosPeriodo
			cCDP.Initialize
			cCDP.Show
			frm.Close

		Case "Fases Documento"
			Dim cFDoc As cFasesDocumento
			cFDoc.Initialize(Me, frm.RootPane,"")
			cFDoc.Show
			'frm.Close
			
		Case "Marcar Albarán Físico"
			Dim msa As Object=xui.MsgboxAsync("pendiente de programar...","Aviso")
			Wait For (msa) Msgbox_Result
			Return
			
			Dim cDocFis As cMarcarAlbaranFisico
			cDocFis.Initialize
			cDocFis.Show
			frm.Close
			
		Case "OSUBs Pendientes No Confección"
			Dim cCOSUBsPNC As cControlOSUBsPendientesNoConfeccion
			cCOSUBsPNC.Initialize
			cCOSUBsPNC.Show
			frm.Close
			
		Case "Expediciones Sin Entregar TXT"
			Dim cExpSinE As cExpedicionesSinEntregarTXT
			cExpSinE.Initialize
			cExpSinE.Show	
			frm.Close
			
		Case "Expediciones Periodo TXT"
			Dim cExpPTXT As cExpedicionesPeriodoTXT
			cExpPTXT.Initialize
			cExpPTXT.Show
			frm.Close
			
		Case "Expediciones Sin Entregar DHL"

'			cmExpedicionesIncidenciasDHL.Show
'			frm.Close
'			
			Dim cExpDHL As cExpedicionesNoEntregadasDHL
			cExpDHL.Initialize
			cExpDHL.Show
			frm.Close
			
		Case "Expediciones Periodo Correos Express"
			'Dim cExpPCEx As cInfoEnviosPeriodoCorreosExpress
		Dim cExpPCEx As cInfoEnviosPeriodoCorreosExpress2
			cExpPCEx.Initialize
			cExpPCEx.Show
			frm.Close
			
		Case "Info Expedición Correos Express"
				
			Dim cInfoExpedCorreosExp As cInfoExpedicionCorreosExpress
			cInfoExpedCorreosExp.Initialize("")
			cInfoExpedCorreosExp.Show
			'frm.Close
			
		Case "Documentos Expedición"
			Dim cDocsExp As cDocumentosNAVExpedicion
			cDocsExp.Initialize
			cDocsExp.Show
			frm.Close
			
		Case "Seguimiento Fechas Prometidas Pedidos Compra"
			
			Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cSeguimientoFechasPrometidasCompra")) complete (sRes As String)
			Select Case sRes
				Case "ErrConn"
					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "SinPermiso"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case "ERROR"
					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "DENIED"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case Else
					Dim PermisoModuloUsuario As String=sRes
			End Select
			
			
			Dim cSegFPC As cSeguimientoFechasPrometidasCompra
			cSegFPC.Initialize
			cSegFPC.PermisoUsuarioModulo=PermisoModuloUsuario
			cSegFPC.Show
			frm.Close
		
		Case "Incidencias Proveedor"
			Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"IncidenciasProveedorCompras")) complete (sRes As String)
			Select Case sRes
				Case "ErrConn"
					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "SinPermiso"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case "ERROR"
					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "DENIED"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case Else
					Dim PermisoModuloUsuario As String=sRes
			End Select
			
			Dim cIncProv As cIncidenciasProveedorLista
			cIncProv.Initialize
			cIncProv.DepartamentoEmisor="COMPRAS"
			cIncProv.Show
			frm.Close
			
		Case "Tareas Pendientes Incidencias Proveedor"
			Dim cTareasAbiertasIncProv As cIncidenciasProveedorTareasAbiertas
			cTareasAbiertasIncProv.Initialize
			cTareasAbiertasIncProv.Show
			frm.Close
			
		Case "Evaluación Proveedores"
			Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"EvaluacionProveedores")) complete (sRes As String)
			Select Case sRes
				Case "ErrConn"
					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "SinPermiso"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case "ERROR"
					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "DENIED"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case Else
					Dim PermisoModuloUsuario As String=sRes
			End Select
			
			Dim cEvalProv As cEvaluacionProveedores
			cEvalProv.Initialize
			cEvalProv.Show
			frm.Close
			
		
		Case "Gestión Ventas"
'
'			Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cGestionVentas")) complete (sRes As String)
'			Select Case sRes
'				Case "ErrConn"
'					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "SinPermiso"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "ERROR"
'					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "DENIED"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case Else
'					Dim PermisoModuloUsuario As String=sRes
'			End Select
			
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cGestionVentas")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
			Dim cGVtas As cGestionVentas
			cGVtas.Initialize
			cGVtas.PermisoModuloUsuario=PermisoModuloUsuario
			cGVtas.Show
			frm.Close
			
		Case "Análisis Tarifas Venta"

'			Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cAnalisisTarifasVenta")) complete (sRes As String)
'			Select Case sRes
'				Case "ErrConn"
'					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "SinPermiso"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "ERROR"
'					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "DENIED"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case Else
'					Dim PermisoModuloUsuario As String=sRes
'			End Select

			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cAnalisisTarifasVenta")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
'			wait for(Utilidades.MsgBox2XUI("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim cListaAnTarifasVenta As cListaAnalisisTarifasVenta
			cListaAnTarifasVenta.Initialize
			cListaAnTarifasVenta.PermisoModuloUsuario=PermisoModuloUsuario
			cListaAnTarifasVenta.Show
			frm.Close
			
'		Case "B2B"
'			jamLoadingIndicator1.show
'			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cB2B")) complete (sRes As String)
'			jamLoadingIndicator1.Close
'			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
'			Dim PermisoModuloUsuario As String=sRes
'			
'			wait for(Utilidades.MsgBox2XUI("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
'			
'			Dim B2B As cB2B
'			B2B.Initialize
'			B2B.PermisoModuloUsuario=PermisoModuloUsuario
'			B2B.Show
'			frm.Close
			
		Case "Tests Info Magento"
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cB2B")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
			wait for(Utilidades.MsgBox2XUI("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim TestsInfoMagento As cTestsInfoMagento
			TestsInfoMagento.Initialize
			TestsInfoMagento.PermisoModuloUsuario=PermisoModuloUsuario
			TestsInfoMagento.Show
			frm.Close
			
		Case "Pedidos Clientes"
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cB2B")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
			Dim B2BListaPedCli As cB2BListaPedidosCliente
			B2BListaPedCli.Initialize
			frm.Close
			
'		Case "Pedidos Cliente Punchout Lear"
'			jamLoadingIndicator1.show
'			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cB2B")) complete (sRes As String)
'			jamLoadingIndicator1.Close
'			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
'			Dim PermisoModuloUsuario As String=sRes
'			
'						
'			Dim B2BListaPedCli As cB2BListaPedidosCliente
'			B2BListaPedCli.Initialize
'			frm.Close
'			
'		Case "Datos Pedido Cliente Punchout LEAR"
'			jamLoadingIndicator1.show
'			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cB2B")) complete (sRes As String)
'			jamLoadingIndicator1.Close
'			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
'			Dim PermisoModuloUsuario As String=sRes
'			
'			Dim B2BPedCli As cB2BFichaPedidoCliente
'			B2BPedCli.Initialize(0)
'			frm.Close
			
			
'		Case "Facturación Pedidos Cliente Punchout Lear"
'			jamLoadingIndicator1.show
'			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cB2B")) complete (sRes As String)
'			jamLoadingIndicator1.Close
'			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
'			Dim PermisoModuloUsuario As String=sRes
			
			
		Case "Importacion Pedidos EESS Repsol"
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cFTPRepsol")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
'			wait for(Utilidades.MsgBox2XUI("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim cPedidosRepsol As cRepsol
			cPedidosRepsol.Initialize
			cPedidosRepsol.PermisoModuloUsuario=PermisoModuloUsuario
			cPedidosRepsol.Show
			frm.Close
			
'			Dim cClienteFTP As cClientFTP
'			cClienteFTP.Initialize
'			frm.Close
			
			
		Case "Albaranes Venta Repsol"
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cRepsol")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
'			wait for(Utilidades.MsgBox2XUI("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim RepsolInformacionLogisticaAlbaran As cRepsolInformacionLogisticaAlbaran
			RepsolInformacionLogisticaAlbaran.Initialize
			'RepsolInformacionLogisticaAlbaran.PermisoModuloUsuario=PermisoModuloUsuario
			RepsolInformacionLogisticaAlbaran.Show
			frm.Close
			
		Case "Generación Ficheros CSV Plantilla Pedidos Venta"
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cGeneracionFicherosCSVPlantillaPedidosVenta")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
'			wait for(Utilidades.MsgBox2XUI("Aviso","Módulo en pruebas. No utilizar. ¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim GeneracionFicherosCSVPlantillaPedidosVenta As cGeneracionFicherosCSVPlantillaPedidosVenta
			GeneracionFicherosCSVPlantillaPedidosVenta.Initialize
			'RepsolInformacionLogisticaAlbaran.PermisoModuloUsuario=PermisoModuloUsuario
			GeneracionFicherosCSVPlantillaPedidosVenta.Show
			frm.Close
	
		Case "Informes Expediciones Clientes"
				
'			Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cInformesExpedicionesClientes")) complete (sRes As String)
'			Select Case sRes
'				Case "ErrConn"
'					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "SinPermiso"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "ERROR"
'					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "DENIED"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case Else
'					Dim PermisoModuloUsuario As String=sRes
'			End Select

			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cInformesExpedicionesClientes")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
			Dim cInfExpedCliente As cInformesExpedicionesClientes
			cInfExpedCliente.Initialize
			'cInfExpedCliente.PermisoModuloUsuario=PermisoModuloUsuario
			cInfExpedCliente.Show
			frm.Close
			
		Case "Reiniciar sincronización Docuware"
			Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"ReiniciarSincronizacionDocuware")) complete (sRes As String)
			Select Case sRes
				Case "ErrConn"
					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "SinPermiso"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case "ERROR"
					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "DENIED"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case Else
					Dim PermisoModuloUsuario As String=sRes
			End Select
			
			wait for(Utilidades.MsgBox2XUI("Confirma","¿Reiniciar la sincronización con Docuware?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Wait For(ReiniciarSincronizacionDocuware) complete (sResp As String)
			If sResp="OK" Then
				Dim msa As Object=xui.MsgboxAsync("Envío petición reinicio sincronización Docuware, OK","Aviso")
				Wait For (msa) Msgbox_Result
			Else
				Dim msa As Object=xui.MsgboxAsync($"No ha sido posible enviar la petición de reinicio de la sincronización con Docuware.
${sResp}"$,"Error")
				Wait For (msa) Msgbox_Result
			End If
			
			
		Case "Incidencias Proveedor Almacén"
			Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"IncidenciasProveedorAlmacen")) complete (sRes As String)
			Select Case sRes
				Case "ErrConn"
					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "SinPermiso"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case "ERROR"
					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
					Wait For (msa) Msgbox_Result
					Return
				Case "DENIED"
					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
					Wait For (msa) Msgbox_Result
					Return
				Case Else
					Dim PermisoModuloUsuario As String=sRes
			End Select
			
			Dim cIncProv As cIncidenciasProveedorLista
			cIncProv.Initialize
			cIncProv.DepartamentoEmisor="ALMACEN"
			cIncProv.Show
			frm.Close
			
		Case "Análisis Disponibles Almacén Artículo Talla"
'			Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"AnalisisDisponiblesAlmacenArticuloTalla")) complete (sRes As String)
'			Select Case sRes
'				Case "ErrConn"
'					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "SinPermiso"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "ERROR"
'					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "DENIED"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case Else
'					Dim PermisoModuloUsuario As String=sRes
'			End Select
			
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"AnalisisDisponiblesAlmacenArticuloTalla")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
			Dim cAnalisisDispAlmArtTalla As cAnalisisDisponiblesAlmacenArticuloTalla
			cAnalisisDispAlmArtTalla.Initialize
			cAnalisisDispAlmArtTalla.PermisoModuloUsuario=PermisoModuloUsuario
			cAnalisisDispAlmArtTalla.Show
			frm.Close
			
			
		Case "Análisis Disponibles Artículo Talla Almacenes Computables"
			wait for(Utilidades.MsgBoxXUI("Aviso","Pendiente de programar.")) complete (rObj As Object)
			Return
			
'			Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"AnalisisDisponiblesArticuloTallaAlmacenesComputables")) complete (sRes As String)
'			Select Case sRes
'				Case "ErrConn"
'					Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "SinPermiso"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "ERROR"
'					Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case "DENIED"
'					Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'					Wait For (msa) Msgbox_Result
'					Return
'				Case Else
'					Dim PermisoModuloUsuario As String=sRes
'			End Select
			
			jamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"AnalisisDisponiblesArticuloTallaAlmacenesComputables")) complete (sRes As String)
			jamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			Dim PermisoModuloUsuario As String=sRes
			
			Dim cAnalisisDispArtTallaAlmacenesComputables As cAnalisisDisponiblesArticuloTallaAlmacenesComputables
			cAnalisisDispArtTallaAlmacenesComputables.Initialize
			cAnalisisDispArtTallaAlmacenesComputables.PermisoModuloUsuario=PermisoModuloUsuario
			cAnalisisDispArtTallaAlmacenesComputables.Show
			frm.Close

'		Case "Histórico Movimientos Artículo"
'			Dim cHistMovArt As cHistoricoMovsArticulo
'			cHistMovArt.Initialize
'			cHistMovArt.Show
'			frm.Close
'			
'		Case "Histórico Movimientos Etiqueta"
'			Dim cHistMovEtiq As cHistoricoMovsEtiqueta
'			cHistMovEtiq.Initialize
'			cHistMovEtiq.Show
'			frm.Close
'			
'		Case "Tipos Embalajes"
'			Dim cTiposEmb As cTiposEmbalajes
'			cTiposEmb.Initialize
'			cTiposEmb.Show
'			frm.Close
			
'		Case "Zonas-Ubicaciones"
'			
'			
'		Case "Inventarios"
''			Dim msa As Object=xui.MsgboxAsync("Menú Item pendiente de programar...","Aviso")
''			Wait For (msa) Msgbox_Result
''			Return
'			Dim cInvent As cInventario
'			cInvent.Initialize
'			cInvent.Show
'			frm.Close
'
''			
'		Case "Expediciones Abiertas TXT"
''			Dim msa As Object=xui.MsgboxAsync("Menú Item pendiente de programar...","Aviso")
''			Wait For (msa) Msgbox_Result
'
'			If Main.AlmacenIPConexion<>"" And Main.AlmacenIPConexion<>Main.AlmacenConexion Then
'				Dim msa As Object = xui.Msgbox2Async("Se ha seleccionado un almacén de conexión distinto al almacén en el que te has conectado por red." & CRLF & CRLF & _
'				"Las expediciones son comunes a ambos almacenes , pero las impresoras que se pueden seleccionar serán las del almacén de " &  Main.AlmacenConexion & "." & CRLF & CRLF & "¿Continuar?","Confirma", "Sí", "", "No", Null)
'				Wait For (msa) Msgbox_Result (rInt As Int) 
'				If rInt<>xui.DialogResponse_Positive Then Return 
'			End If
'
'			Dim cExpAbiertas As cTransportesTXTExpedicionesTemp
'			cExpAbiertas.Initialize
'			cExpAbiertas.Show
'			frm.Close
'			
'		Case SelectedItem.Text="Configuración Usuario"
'			Dim msa As Object=xui.MsgboxAsync("Menú Item pendiente de programar...","Aviso")
'			Wait For (msa) Msgbox_Result
'			Return
'			ConfiguracionUsuario
'			
'		Case SelectedItem.Text="HelpDesk"
'			fx.ShowExternalDocument("https://forms.office.com/Pages/ResponsePage.aspx?id=YumysFdtdUCqnQ65qGTPdizMgQN947hKn-ropPF81wpUNjlJWk8yMVVMM0JLN1NKWjZCWTJIWTFBOC4u")
'			
'		Case SelectedItem.Text="Test"
''			Dim cPrueba As Prueba
''			cPrueba.Initialize
'			
''			Dim msa As Object=xui.MsgboxAsync("Menú Item pendiente de programar...","Aviso")
''			Wait For (msa) Msgbox_Result
'
'			cmBuscarDispositivo.show
'			frm.Close

		Case "Crear Excel Links Ficheros Carpeta"
			CrearExcelLinksFicherosCarpeta
			
		Case "Permisos Aplicacion"
			Dim cPermApl As cPermisosAplicacion
			cPermApl.Initialize
			cPermApl.Show
			'frm.Close
'			
		Case "Acerca De"

			Dialog.Title="Información"
			Dim B4XLongMsg As B4XLongTextTemplate
			B4XLongMsg.Initialize
			B4XLongMsg.Resize(600dip,500dip)
			Dim sbA As StringBuilder
			sbA.Initialize
			sbA.Append(Main.NombreAplicacion).Append(" v").Append(Main.Version).Append(CRLF)
			'sbA.Append("PROIN PINILLA, S.L.").Append(CRLF)
			sbA.Append("(2022-").Append(DateTime.GetYear(DateTime.Now)).Append(")").Append(CRLF)
			sbA.Append(CRLF)
			sbA.Append("Iconos aplicación:").Append(CRLF)
			
			sbA.Append("Icons made by Freepik from www.flaticon.com").Append(CRLF)
'			sbA.Append("Icons made by Smashicons from www.flaticon.com").Append(CRLF)
'			sbA.Append("Icons made by srip from www.flaticon.com").Append(CRLF)
'			sbA.Append("Icons made by Pixel perfect from www.flaticon.com").Append(CRLF)
'			sbA.Append("Icons made by Creaticca Creative Agency from www.flaticon.com").Append(CRLF)
'			sbA.Append("Icons made by ultimatearm from www.flaticon.com").Append(CRLF)
			sbA.Append("Icons made by Flat Icons from www.flaticon.com").Append(CRLF)
'			sbA.Append("Icons made by surang from www.flaticon.com").Append(CRLF)
			sbA.Append("Icons made by Eucalyp from www.flaticon.com").Append(CRLF)
			sbA.Append("Icons made by Uniconlabs from www.flaticon.com").Append(CRLF)
			'sbA.Append("Icons made by SmashingStocks from www.flaticon.com").Append(CRLF)
			'<div>Iconos diseñados por <a href="https://www.flaticon.es/autores/eucalyp" title="Eucalyp">Eucalyp</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
			'<a href="https://www.flaticon.com/free-icons/phase" title="phase icons">Phase icons created by Flat Icons - Flaticon</a>
			'sbA.Append("<a href="https://www.flaticon.es/iconos-gratis/analisis-de-los-datos" title="análisis de los datos iconos">Análisis de los datos iconos creados por smashingstocks - Flaticon</a>

			B4XLongMsg.Text=sbA.ToString
			Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","")
			Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
			bOk.TextSize=16
			Wait For(rSub) complete (rInt As Int)
			
			
		Case Else
			If SelectedItem.Children.Size=0 Then
				Dim msa As Object=xui.MsgboxAsync("Menú Item pendiente de programar...","Aviso")
				Wait For (msa) Msgbox_Result
			End If
	End Select
'	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
'	TreeViewMainMenu.ClearSelection
	
End Sub

Sub AbrirFichero(fSel As String)
	Dim nombreF As String=File.GetName(fSel)
	Dim DirF As String=File.GetFileParent(fSel)
	If File.Exists(DirF,"") =False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible acceder a la carpeta " & DirF & "." & CRLF & CRLF & "Verifica si tienes acceso a la red. En caso afirmativo, es posible que la carpeta haya sido eliminada o cambiada de ubicación","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If File.Exists(fSel,"") =False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible acceder al fichero " & nombreF & "." & CRLF & CRLF & "Verifica si tienes acceso a la red. En caso afirmativo, es posible que el fichero haya sido eliminada o cambiado de ubicación","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Try
		Dim jR As AWTRobot
		jR.SystemOpenExternalFile(fSel)
	Catch
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero seleccionado." & CRLF & CRLF & "Verifica si tienes acceso a la red. En caso afirmativo, es posible que el fichero haya sido eliminado o cambiado de ubicación","Error")
		Wait For (msa) Msgbox_Result
	End Try
End Sub

'Sub AppStartJar (Args() As String)
'	Dim shl As Shell
'	shl.Initialize("shl", "java", _
'     Array As String("-cp", "curl.jar", "b4j.example.main", "http://www.basic4ppc.com"))
'	shl.WorkingDirectory = "C:\Users\H\Documents\B4J\Curl\Objects"
'	shl.Run(10000) 'set a timeout of 10 seconds
'	StartMessageLoop 'need to call this as this is a console app.
'End Sub


Sub shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		Log("Success")
		Log(StdOut)
	Else
		Log("Error: " & StdErr)
	End If
	ExitApplication
End Sub

Sub AppStartOtros(sURL As String)
	fx.ShowExternalDocument(sURL)
End Sub
'

Sub TreeViewMainMenu_ExpandedChanged(Expanded As Boolean)
	Dim ti As TreeItem=Sender
	Log(ti.Text & " " & ti.Expanded)
End Sub

'Sub TreeViewMainMenu_MouseClicked (EventData As MouseEvent)
'	Dim jo As JavaObject = EventData
'	Dim target As JavaObject = jo.RunMethodJO("getTarget", Null)
'	Do Until target Is TreeView
'		If GetType(target) = "com.sun.javafx.scene.control.skin.TreeViewSkin$1" Then
'			Dim ti As TreeItem = target.RunMethod("getTreeItem", Null)
'			If ti.IsInitialized Then
'				If ti.Expanded=False Then
'					Main.lstSelItem.Add(ti.text)
'				Else
'					If Main.lstSelItem.IndexOf(ti.Text)<>-1 Then Main.lstSelItem.RemoveAt(Main.lstSelItem.IndexOf(ti.Text))
'				End If
'			End If
'			Log($"Clicked tree item: ${ti}"$)
'			If EventData.ClickCount = 2 Then
'				Log("double click!")
'			End If
'			Exit
'		End If
'		Dim n As Node = target
'		target = n.Parent
'	Loop
'End Sub

Sub SplitPaneMainMenu_Resize (Width As Double, Height As Double)
	'SplitPaneMainMenu.DividerPositions= Array As Double(0.3)
End Sub

Sub ScrollToItem (tree As TreeView, ti As TreeItem)
	Dim p As TreeItem = ti.Parent
	Do While p.Root = False
		p.Expanded = True
		p = p.Parent
	Loop
	Dim index As Int = CountVisibleChildren(tree.Root, ti, Array As Boolean(False))
	Dim jo As JavaObject = tree
	Log(index)
	jo.RunMethod("scrollTo", Array(index))
End Sub

Sub CountVisibleChildren(ti As TreeItem, Target As TreeItem, Found() As Boolean) As Int
	Dim c As Int = 1
	If ti = Target Then
		Found(0) = True
		Return -1
	End If
	If ti.Expanded Then
		For Each child As TreeItem In ti.Children
			c = c + CountVisibleChildren(child, Target, Found)
			If Found(0) = True Then Return c
		Next
	End If
	Return c
End Sub
'
'#Region ConfiguracionUsuario
'
'private Sub ConfiguracionUsuario
'	
'	If PrefDialogConfiguracionUsuario.IsInitialized=False Then
'		PrefDialogConfiguracionUsuario.Initialize(frm.RootPane,"Configuración Usuario",600,400)
'	End If
'	' JSON creado con la aplicacion FormsBuilder (B4J
'	PrefDialogConfiguracionUsuario.LoadFromJson(File.ReadString(File.DirAssets, "PreferencesTOJUser.json"))
'	
'	'PrefDialogConfiguracionUsuario.SetOptions("Cities", File.ReadList(File.DirAssets, "cities.txt"))
'	'CargaDatosGrabadosConfiguracionUsuario
'	Dim rs As ResumableSub=PrefDialogConfiguracionUsuario.ShowDialog(Main.mConfiguracionUsuario, "OK", "CANCELAR")
'
'	Wait For (rs) Complete (Result As Int)
'	If Result = xui.DialogResponse_Positive Then
'		GrabarDatosConfiguracionUsuario
'	End If
'End Sub
'
'
'
'Sub GrabarDatosConfiguracionUsuario
'	Dim ser As B4XSerializator
'	File.WriteBytes(Main.UserFolder, "ConfiguracionUsuario.txt", ser.ConvertObjectToBytes(Array(Main.mConfiguracionUsuario)))
'End Sub
'
'Sub PermisosUsuario
'	
'End Sub
'
'#End region


Sub DownloadFile(Link As String, DirDestino As String, NombrFicheroDestino As String) As ResumableSub
	Dim m As Map
	m.Initialize
	m.Put("DownLoadOK",False)
	Dim job As HttpJob
	job.Initialize("", Me)
	job.Download(Link)
	Wait For (job) JobDone(job As HttpJob)
	If job.Success Then
		m.Put("DownLoadOK",True)
		Dim out As OutputStream
		out = File.OpenOutput(DirDestino,NombrFicheroDestino,False)
		File.Copy2(job.GetInputStream, out)
		out.Close
		Sleep(100)
	End If
	job.Release
	Return m
End Sub

Sub CrearExcelLinksFicherosCarpeta
	
'	Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"CrearExcelLinksFicherosCarpeta")) complete (sRes As String)
'	Select Case sRes
'		Case "ErrConn"
'			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case "SinPermiso"
'			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a esta utilidad.","Aviso")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case "ERROR"
'			Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case "DENIED"
'			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a  esta utilidad.","Aviso")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case Else
'			Dim PermisoModuloUsuario As String=sRes
'	End Select
	
	jamLoadingIndicator1.show
	Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"CrearExcelLinksFicherosCarpeta")) complete (sRes As String)
	jamLoadingIndicator1.Close
	If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
	Dim PermisoModuloUsuario As String=sRes
	
	Dim msa As Object = xui.Msgbox2Async("¿Crear excel con los nombres de ficheros contenidos en la carpeta seleccionada como links?","Confirma", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim UserDocFolder As String=Utilidades.FindUserDocumentsFolder
	
	Dim DirCh As DirectoryChooser
	DirCh.Initialize
	DirCh.InitialDirectory=UserDocFolder
	Dim SearchDirName As String = DirCh.Show(frm)
	If SearchDirName="" Then Return
	Log("DirName: " & SearchDirName)

	Dim wcl As wildcardlisting
	'Dim PatronGuion As String=Patron.SubString2(0,Patron.IndexOf("0"))&"-"&Patron.SubString2(Patron.IndexOf("0")+1,Patron.Length)
	If File.Exists(SearchDirName,"") =False Then
		frm.RootPane.MouseCursor=fx.Cursors.default
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible acceder a la carpeta " & SearchDirName,"Error")
		Wait For (msa) Msgbox_Result
	Else
		wcl.Initialize(Me,"wcl")
		wcl.ClearLists
		frm.RootPane.MouseCursor=fx.Cursors.WAIT
		wcl.ListFiles(SearchDirName,True,"*.*",True,True)
		wait for wcl_ListFilesFinish(FileListing As List)
		frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
		Log("wcl_ListFilesFinish(" & FileListing.Size & ")")
		For i = 0 To FileListing.Size -1
			Log(FileListing.Get(i))
			'lstFichasProduccionArticulo.Add(FileListing.Get(i))
		Next
	End If
	
	If FileListing.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("La carpeta seleccionada (" & SearchDirName & ") no contiene ficheros.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim fc As FileChooser
	fc.Initialize
	fc.Title="Indica Fichero Excel destino"
	fc.SetExtensionFilter("Ficheros Excel", Array As String("*.xlsx","*.xlsm","*.xls"))
	'fc.InitialFileName=""
	fc.InitialDirectory=UserDocFolder
	Dim fileName As String = fc.ShowSave(frm)
	If fileName = "" Then Return
		
	Dim NombreFicheroExcel As String=File.GetName(fileName)
	Dim DirFicheroExcel As String=File.GetFileParent(fileName)

	wait For (ExportarExcelFicherosCarpeta(DirFicheroExcel,NombreFicheroExcel, FileListing)) complete (Success As Boolean)
	If Success Then
		Dim msa As Object=xui.MsgboxAsync("Fichero excel " & fileName & " grabado." & CRLF & CRLF & ".","Aviso")
		Wait For (msa) Msgbox_Result
		fx.ShowExternalDocument(File.GetUri(DirFicheroExcel,NombreFicheroExcel))
		Return 
	Else
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el fichero. Verifica si tienes excel en el equipo, y que no esté abierto ya un fichero con el nombre " &  NombreFicheroExcel,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
End Sub


private Sub ExportarExcelFicherosCarpeta(DirectorioFicheroExcel As String,NombreFicheroExcel As String, lstFicheros As List) As ResumableSub

	Dim lstHeaders As List=Array As String("Fichero")


	Dim xl As XLUtils
	xl.Initialize
	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos")

	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"

	Dim NumColsRs As Int=lstHeaders.Size
	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_BLACK).ForegroundColor(xl.COLOR_GREY_25_PERCENT)
	'encabezados
	For idxCol=0 To lstHeaders.Size-1
		'sheet1.PutString(xl.AddressZero(idxCol,0), lstHeaders.Get(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
		sheet1.PutString(xl.AddressZero(idxCol,0), lstHeaders.Get(idxCol))
	Next

	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
	Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
	
	Dim LinkStyle As XLStyle = Workbook.CreateStyle.FontLink(11).HorizontalAlignment("LEFT")

	
	
	
	Dim idxFila As Int=1

	For Each NombreFichero As String In lstFicheros
		'Dim RowStyle As XLStyle = RowStyles.Get(idxFila Mod RowStyles.Size)
'		For idxCol=0 To lstHeaders.Size-1
'			Dim NombreCampo As String=lstHeaders.Get(idxCol)
'			Select True
'				Case NombreCampo="Pedido" Or NombreCampo="Articulo" Or NombreCampo="DescripcionArticulo" Or NombreCampo="Talla"
'					'sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetInt(AliasCampo)).SetStyles(sheet1.LastAccessed, Array(RowStyle))
'					sheet1.PutString(xl.AddressZero(idxCol,idxFila),rs.GetString(NombreCampo))
'					
'				Case NombreCampo="Linea"
'					sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetInt(NombreCampo))
'					
'				Case NombreCampo="FechaPedido" 'Or NombreCampo="FechaPrometida"
'
'					Dim ticks As Long = rs.GetLong(NombreCampo)
'						
'					If ticks > 0 Then
'						Dim TicksHora0 As Long=DateUtils.SetDate(DateTime.GetYear(ticks),DateTime.GetMonth(ticks),DateTime.GetDayOfMonth(ticks))
'						'sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, Array(FechasStyle, RowStyle))
'						sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, FechasStyle)
'					End If
'						
'				Case NombreCampo="Qty" Or NombreCampo="QtyPendiente"
'					sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),Round2(rs.GetDouble(NombreCampo),2))
'					
'				Case NombreCampo="FechaPrometida"
'					Dim ticks As Long = rs.GetLong(NombreCampo)
'						
'					If ticks > 0 Then
'						Dim TicksHora0 As Long=DateUtils.SetDate(DateTime.GetYear(ticks),DateTime.GetMonth(ticks),DateTime.GetDayOfMonth(ticks))
'						'sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, Array(FechasStyle, RowStyle))
'						sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, FechasStyle)
'					End If
'				Case Else
'
'			End Select
'		Next

		sheet1.PutString(xl.AddressZero(0,idxFila),NombreFichero).SetStyle(sheet1.LastAccessed, LinkStyle)
		sheet1.CreateHyperlink(sheet1.LastAccessed, "FILE", "file://" & NombreFichero.Replace("\","/").Replace(" ","%20")) 

'		Sleep(0)
		idxFila=idxFila+1
	Next


	'Dim LastTableRow1 As Int = sheet1.LastAccessed.Row0Based + 1

	Dim UltimaFila As Int=idxFila
'	jamTableView1.TextoPanelInfoJamTableView="Generando fichero excel..."
'	Sleep(0)

	'add auto filters - range with the data. The filters will appear above the data.
	'sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumColsRs-1,UltimaFila)))
	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(0,UltimaFila)))   '  ... NumColsRs , porque hemos añadido 1 columna manual
	
	For i=0 To idxCol+1 ' +1 ,  porque hemos añadido 1 columna manual
		sheet1.AutoSizeColumn(i)
	Next
	
'	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
'	jamTableView1.EstadoLabelSalirJamTableView(True)
'	jamTableView1.HabilitarJamTableView(True)
'	
'	jamTableView1.TextoPanelInfoJamTableView=""
	
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
	Dim filename As String = Workbook.SaveAs(DirectorioFicheroExcel ,NombreFicheroExcel, True)
	If filename<>DirectorioFicheroExcel & "\" & NombreFicheroExcel Then
		Dim msa As Object=xui.MsgboxAsync("Error al grabar el fichero excel.","Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	Return True
End Sub

'
'#if Java
'	import java.io.*;
'	import java.util.zip.*;
'	//import java.nio.file.*;
'	//import java.nio.file.attribute;
'	import java.nio.file.Path;
'	import java.nio.file.SimpleFileVisitor;
'	
'	public static void zipFolder(Path sourceFolderPath, Path zipPath) throws Exception {
'	   ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipPath.toFile()));
'	   Files.walkFileTree(sourceFolderPath, new SimpleFileVisitor<Path>() {
'	       public FileVisitResult visitFile(Path File, BasicFileAttributes attrs) throws IOException {
'	           zos.putNextEntry(new ZipEntry(sourceFolderPath.relativize(File).toString()));
'	           Files.copy(File, zos);
'	           zos.closeEntry();
'	           return FileVisitResult.CONTINUE;
'	        }
'	    });
'	    zos.close();
'	 }
'#End If


' 2 niveles de "recursión"
Sub CrearAccesosDirectosItem3(tISel As TreeItem)
	
	Dim imgTreeItemGo As Image=Main.fx.LoadImage(File.Dirassets, "outline_arrow_circle_right_black_18dp.png")
		
	Dim sTextoBBCodeView As StringBuilder
	sTextoBBCodeView.Initialize
	BBCodeViewElementosMainMenu.Text=$""$
	'	Log("Item expandido: " & tISel.Text)
	'	Log("ti.Children " & tISel.Children)
	'sTextoBBCodeView.Append($"[font=Arial]"$)
		
	Dim NivelTiSel As Int=NivelTreeItem(tISel)
		
	Dim TextSizeTISel As Float
	Dim TextSizeNivel0 As Float=18
	Dim TextSizeNivel1 As Float=16
	Dim TextSizeNivel2 As Float=14
	Dim sIndentNivelTISel As String
	Dim sIndentNivel0 As String=$"${TAB}"$
	Dim sIndentNivel1 As String=$"${TAB}${TAB}"$
	Dim sIndentNivel2 As String=$"${TAB}${TAB}${TAB}"$
		
	If tISel<>TreeViewMainMenu.Root Then
		If tISel.Children.Size=0 Then
			sTextoBBCodeView.Append($"${sIndentNivel0}[Vertical=5][img dir="${File.Dirassets}" FileName="outline_arrow_circle_right_black_24dp.png" width=24/][/vertical] [TextSize=$1.0{TextSizeNivel0}][url]${tISel.Text}[/url][/textsize]
	"$)
		Else
			sTextoBBCodeView.Append($"${sIndentNivel0}[TextSize=$1.0{TextSizeNivel0}][Color=#191970][b]${tISel.Text}[/b][/color][/textsize]
	"$)
		End If
			
		For Each tiCh1 As TreeItem In tISel.Children
			If tiCh1.Children.Size=0 Then
				sTextoBBCodeView.Append($"${sIndentNivel1}[Vertical=5][img dir="${File.Dirassets}" FileName="outline_arrow_circle_right_black_24dp.png" width=24/][/vertical] [TextSize=$1.0{TextSizeNivel1}][url]${tiCh1.Text}[/url][/textsize]
	"$)
			Else
				sTextoBBCodeView.Append($"${sIndentNivel1}[TextSize=$1.0{TextSizeNivel1}][Color=#191970][b]${tiCh1.Text}[/b][/color][/textsize]
	"$)
			End If

			Log("tiCh.Children " & tiCh1.Children)
			For Each tiCh2 As TreeItem In tiCh1.Children
				Log("tiCh2.Children " & tiCh2.Children)
				If tiCh2.Children.Size=0 Then
					sTextoBBCodeView.Append($"${sIndentNivel2}[Vertical=5][img dir="${File.Dirassets}" FileName="outline_arrow_circle_right_black_18dp.png" width=18/][/vertical] [TextSize=$1.0{TextSizeNivel2}][url]${tiCh2.Text}[/url][/textsize]
	"$)
				Else
					sTextoBBCodeView.Append($"${sIndentNivel2}[TextSize=$1.0{TextSizeNivel2}][Color=#191970][b][url]${tiCh2.Text}[/url][/b][/color][/textsize]
	"$)
				End If
			Next
		Next
			
			
	Else
		For Each tiCh1 As TreeItem In tISel.Children
			If tiCh1.Children.Size=0 Then
				sTextoBBCodeView.Append($"${sIndentNivel0}[Vertical=5][img dir="${File.Dirassets}" FileName="outline_arrow_circle_right_black_24dp.png" width=24/][/vertical] [TextSize=$1.0{TextSizeNivel0}][url]${tiCh1.Text}[/url][/textsize]
	"$)
			Else
				sTextoBBCodeView.Append($"${sIndentNivel0}[TextSize=$1.0{TextSizeNivel0}][Color=#191970][b]${tiCh1.Text}[/b][/color][/textsize]
	"$)
			End If

			Log("tiCh.Children " & tiCh1.Children)
			For Each tiCh2 As TreeItem In tiCh1.Children
				Log("tiCh1.Children " & tiCh2.Children)
				If tiCh2.Children.Size=0 Then
					sTextoBBCodeView.Append($"${sIndentNivel1}[Vertical=5][img dir="${File.Dirassets}" FileName="outline_arrow_circle_right_black_24dp.png" width=24/][/vertical] [TextSize=$1.0{TextSizeNivel1}][url]${tiCh2.Text}[/url][/textsize]
	"$)
				Else
					sTextoBBCodeView.Append($"${sIndentNivel1}[TextSize=$1.0{TextSizeNivel1}][Color=#191970][b]${tiCh2.Text}[/b][/color][/textsize]
	"$)
					For Each tiCh3 As TreeItem In tiCh2.Children
						Log("tiCh3.Children " & tiCh3.Children)
						If tiCh3.Children.Size=0 Then
							'sTextoBBCodeView.Append($"${sIndentNivel2}[TextSize=$1.0{TextSizeNivel2}][url]${tiCh3.Text}[/url][/textsize]
							sTextoBBCodeView.Append($"${sIndentNivel2}[Vertical=5][img dir="${File.Dirassets}" FileName="outline_arrow_circle_right_black_18dp.png" width=18/][/vertical] [TextSize=$1.0{TextSizeNivel2}][url]${tiCh3.Text}[/url][/textsize]
	"$)
						Else
							sTextoBBCodeView.Append($"${sIndentNivel2}[TextSize=$1.0{TextSizeNivel2}][Color=#191970][b][url]${tiCh3.Text}[/url][/b][/color][/textsize]
	"$)
					
						End If
					Next
					
				End If
			Next
		Next
	End If

	BBCodeViewElementosMainMenu.Text=sTextoBBCodeView.ToString
End Sub


Sub SeleccionarMenuItem(ti As TreeItem)
	Dim jo As JavaObject = TreeViewMainMenu
	jo.RunMethodJO("getSelectionModel", Null).RunMethod("select", Array(ti))
End Sub

Sub IterateOverChildren(parent As TreeItem)
	For Each tti As TreeItem In parent.Children
		If tti.Children.Size > 0 Then
			IterateOverChildren(tti)
		End If
	Next
End Sub

Sub CrearListaParentsMenuItem(tiOr As TreeItem) As List
	Dim lstParents As List
	lstParents.Initialize
	Dim NumNiveles As Int
	Dim tiP As TreeItem=tiOr.Parent
	If tiP.IsInitialized Then
		#if debug
		Log("Parent treeitem: " & tiP.Text)
		#End If
		
		If tiP.Text<>"root" Then
			NumNiveles=NumNiveles+1
			lstParents.Add(tiP)
			CrearListaParentsMenuItem(tiP)
		End If
	End If
	Return lstParents
End Sub

Sub NivelTreeItem(tI As TreeItem) As Int
	Dim jo As JavaObject = TreeViewMainMenu
	Dim NivelTI As Object=jo.RunMethodJO("getTreeItemLevel",Array(tI))
	Return NivelTI
End Sub

Private Sub BBCodeViewElementosMainMenu_LinkClicked (URL As String)
	Log(URL)
	Dim tIURL As TreeItem=SearchTreeItem(TreeViewMainMenu.Root,URL)
	If tIURL.IsInitialized Then
		'''''		' intentar expandir el menu desde el root, para comprobar si hay algún permiso en las ramas parent (tienen que estar definidos en el evento tItem_ExpandedChanged)... no funciona, el evento debería ser resumablesub...
		'''''		Dim lstParents As List=CrearListaParentsMenuItem(tIURL)
		'''''		For iDx=lstParents.Size-1 To 0
		'''''			Dim tiP As TreeItem=lstParents.Get(iDx)
		'''''			tiP.Expanded=False
		'''''			tiP.Expanded=True
		'''''		Next
		SeleccionarMenuItem(tIURL)
	Else
		wait for(Utilidades.MsgBoxXUI("Error","Error en URL treeItem...")) complete (rObj As Object)
	End If
End Sub


Sub TreeItemMayorNivelExpandido(tI As TreeItem) As TreeItem
	If tI.Children.Size=0 Then Return tI
	
	Dim FlagExpanded As Boolean
	For Each tiCh As TreeItem In tI.Children
		If tiCh.Expanded Then
			FlagExpanded=True
			Exit
		End If
	Next
	If FlagExpanded Then
		Dim tI As TreeItem=TreeItemMayorNivelExpandido(tiCh)
		Return tI
	Else
		Return tI
	End If
End Sub


Sub ContraerItemsOtrasRamas2(tiSel As TreeItem)
	'Dim NivelTiSel As Int=NivelTreeItem(tiSel)
	Dim tiP As TreeItem=tiSel.Parent
	If tiP.IsInitialized=False Then Return
	For Each mI As TreeItem In tiP.Children
		#if debug
		Log(mI.Text)
		#End If
		If mI=tiSel Then Continue
		If mI.Expanded Then
			mI.Expanded=False
			'ContraerItemsOtrasRamas2(mI,tiSel)
		End If
	Next
End Sub


Sub ContraerItemsChildren(ti As TreeItem)
	For Each mI As TreeItem In ti.Children
		#if debug
		Log(mI.Text)
		#End If
		If mI.Expanded Then
			mI.Expanded=False
		End If
		ContraerItemsChildren(mI)
	Next
End Sub

Private Sub setHandler(ob As JavaObject,eventName As String,handlerName As String)
	ob.RunMethod(eventName, Array(ob.CreateEventFromUI("javafx.event.EventHandler",handlerName,False)))
End Sub

'private Sub SetHandlerTreeItemMouseClicked(tItem As TreeItem)
'	setHandler(tItem,"setOnMouseClicked","tItem_MouseClicked")
'End Sub


private Sub asJO(o As JavaObject) As JavaObject
	Return o
End Sub

Sub ReiniciarSincronizacionDocuware As ResumableSub
	Dim sResp As String
	
	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLSincronizacionDocuware As String="http://192.168.10.20:17501/RebootDocuwareTimer"
	Dim ser As B4XSerializator
	Dim data() As Byte = ser.ConvertObjectToBytes("") ' enviamos cadena vacía, ya que en RebootDocuwareTimer no hay parámetro
	job.PostBytes(URLSincronizacionDocuware,data)
	job.GetRequest.Timeout=10000
	Wait For (job) JobDone(job As HttpJob)
	#if DEBUG
	Log("Success ReiniciarSincronizacionDocuware: " & job.Success)
	#End If
	If Not(job.Success) Then
		Log("jobTest.Response.ErrorMessage: " & job.ErrorMessage)
		sResp=$"ERROR, ${job.ErrorMessage}"$
	Else
		sResp="OK"
	End If
	job.Release
	Return sResp
End Sub


