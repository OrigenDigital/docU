B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private xui As XUI
	
	Type TipoDatosEstadosAnalisisTarifasVenta (Estado As String, EstadoVentas As String, EstadoCostesFabricacionCorte As String, EstadoCostesFabricacionNoCorte As String, _
		EstadoCostesImportacion As String, EstadoCostesCompras As String)
		
	Private DatosEstadosAnalisisTarifasVenta As TipoDatosEstadosAnalisisTarifasVenta

	Private Dialog As B4XDialog
	
	Public mSQL As SQL
		
	Private Drawer As B4XDrawer
	'Private clvDrawer As CustomListView
	
	Private jamLoadingIndicator1 As JamLoadingIndicator

	Private mIDAnalisisTarifasVenta As Int
	Private mCodigoAnalisisTarifasVenta As String
	Private mDescripcionAnalisisTarifasVenta As String
	
	Private imvDrawerMenuItem1 As ImageView
	Private imvDrawerMenuItem2 As ImageView
	Private lblTextoDrawerMenuItem As Label
	Private pnlFondoDrawerMenuItem As Pane
	Private txtAnalisisTarifasVenta As B4XView
	Private txtDescripcion As B4XView
	Private txtFechaCreacion As B4XView
	Private txtUsuarioCreacion As B4XView
	Private txtFechaModificacion As B4XView
	Private txtUsuarioModificacion As B4XView
	Private txtFechaInicioVentas As B4XView
	Private txtFechaFinalVentas As B4XView
	Private txtFechaReferenciaCoste As B4XView
	
	Private DescripcionAnalisis As String
	Private FechaInicialVentas, FechaFinalVentas, FechaReferenciaCoste As Long
	Private FechaInicialVentasDefecto As Long
	Private btnSelFechaInicialVentas As B4XView
	Private btnSelFechaFinalVentas As B4XView
	
	Private btnEditarDescripcionAnalisisCab As B4XView

	Private pnlFondoInfo As B4XView
	Private lblInfoMostrada As Label
	
	Private jamTableViewListaTarifasAnalisis As jamTableView
	Private pnljamTableViewListaTarifasAnalisis As B4XView
	Private jamTableViewListaTarifasIncluidas As jamTableView
	Private pnljamTableViewListaTarifasIncluidas As B4XView
	
	
	Private TreeViewDrawer As TreeView
	
	Private jamTableViewListaGRCsAnalisis As jamTableView
	Private pnljamTableViewListaGRCsAnalisis As B4XView
	
	Private pnljamTableViewListaRutasAnalisis As B4XView
	Private jamTableViewListaRutasAnalisis As jamTableView
	
	Private pnljamTableViewListaTarifasExcluidas As B4XView
	Private jamTableViewListaTarifasExcluidas As jamTableView
	
	'Private jFRegTipoDelimitacion As jamFormRegistro
	
	'Private mSistemasReposicionAnalisis As String
	
	Private pnljamTableViewListaSistemasReposicionAnalisis As B4XView
	Private jamTableViewListaSistemasReposicionAnalisis As jamTableView
	
	Private pnljamTableViewListaProductosSeleccionadosAnalisis As B4XView
	Private jamTableViewListaProductosSeleccionadosAnalisis As jamTableView
	
	Private pnljamTableViewListaClientesTarifasAnalisis As B4XView
	Private jamTableViewListaClientesTarifasAnalisis As jamTableView
	
	Private pnljamTableViewListaArticulosIncluidos As B4XView
	Private jamTableViewListaArticulosIncluidos As jamTableView
	
	Private pnljamTableViewAnalisisTarifasListaArticulosImportacion As B4XView
	Private jamTableViewListaArticulosImportacion As jamTableView
	
	Private pnljamTableViewAnalisisTarifasListaArticulosFabNoCorte As B4XView
	Private jamTableViewListaArticulosFabNoCorte As jamTableView
	
	Private pnljamTableViewAnalisisTarifasListaArticulosFabCorte As B4XView
	Private jamTableViewListaArticulosFabCorte As jamTableView
	
	Private pnljamTableViewAnalisisTarifasListaDatosRevisionVentas As B4XView
	Private jamTableViewListaDatosRevisionVentas As jamTableView
	
	Private pnljamTableViewListaArticulosExcluidos As B4XView
	Private jamTableViewListaArticulosExcluidos As jamTableView
	
	Private pnljamTableViewListaCodigosArticulosSeleccionadosAnalisis As B4XView
	Private jamTableViewListaCodigosArticulosSeleccionadosAnalisis As jamTableView
	
'	Private pnljamTableViewAnalisisTarifasLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As B4XView
'	Private jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As jamTableView
'	
'	Private txtTipoTarifaAvisos As TextField
'	Private txtCodigoTarifaAvisos As TextField
'	Private txtArticuloAvisos As TextField
'	Private txtDescripcionArticuloAvisos As TextField
'	Private txtNumMinQty As TextField
'	Private txtNumPrecios As TextField
'	Private txtNumPreciosArtTalla As TextField
'	Private txtNumPreciosDivisa As TextField
'	Private txtNumPreciosUMDifUMVta As TextField
	
	Private lblBackScreenInfo As Label
	
	Private pnljamTableViewListaArticulosExcluidosDatosRevisionVentas As B4XView
	Private jamTableViewListaArticulosExcluidosDatosRevisionVentas As jamTableView
	
	Private lstHistorial As List
	Private IndexActualHistorial As Int
	Private Navegando As Boolean
	
	Private pnljamTableViewAnalisisTarifasListaArticulosCompra As B4XView
	Private jamTableViewListaArticulosCompra As jamTableView
	
	Private txtEstadoAnalisisTarifas As B4XView
	
	Private pnljamTableViewListaTarifasVentaUsuario As B4XView
	Private jamTableViewListaTarifasVentaUsuario As jamTableView
	
	Private pnljamTableViewAnalisisTarifasEvaluacionFinal As B4XView
	Private jamTableViewAnalisisTarifasEvaluacionFinal As jamTableView
	Private lblTitleImporteVenta As B4XView
	Private lblTitleImporteCoste As B4XView
	Private lblTitleImporteMargenSVta As B4XView
	Private lblTitleMargenSVentaPromedio As B4XView
	Private lblTitleDatosActuales As B4XView
	Private lblImporteVentaActual As B4XView
	Private lblImporteCosteActual As B4XView
	Private lblImporteMargenSVtaActual As B4XView
	Private lblMargenSVentaPromedioActual As B4XView
	Private lblTitleDatosNuevos As B4XView
	Private lblImporteVentaNuevo As B4XView
	Private lblImporteCosteNuevo As B4XView
	Private lblImporteMargenSVtaNuevo As B4XView
	Private lblMargenSVentaPromedioNuevo As B4XView
	Private lblTitleDiferenciaNuevoActual As B4XView
	Private lblDiferenciaImporteVentaNuevoActual As B4XView
	Private lblDiferenciaImporteCosteNuevoActual As B4XView
	Private lblDiferenciaImporteMargenSVtaNuevoActual As B4XView
	Private lblDiferenciaMargenSVentaPromedioNuevoActual As B4XView
	Private lblPorVariacion As B4XView
	Private lblPorVariacionImporteVenta As B4XView
	Private lblPorVariacionImporteCoste As B4XView
	Private lblPorVariacionImporteMargenSVta As B4XView
	Private lblPorVariacionMargenSVentaPromedio As B4XView
	Private DatosTotalesEvaluacionVisibles As Boolean
	Private pnlFondoDatosGlobalesEvaluacionFinal As B4XView
	Private pnlFondojamTableViewAnalisisTarifasEvaluacionFinal As B4XView
	
	Private TreeItemFechas As TreeItem
	
	Private fRPrecioVentaUsuario As jamFormRegistro
	'Private fRPrecioCompraUsuario As jamFormRegistro
	'Private fRCosteArticuloUsuario As jamFormRegistro

	Private pnljamTableCLVAnalisisTarifasEvaluacionFinal As B4XView
	Private jamTableCLVAnalisisTarifasEvaluacionFinal As JamTableCLV
	Private pnlFondoDatosGlobalesEvaluacionFinalCLV As B4XView
	
	Private txtTipoTarifa As TextField
	Private txtCodigoTarifa As TextField
	Private txtArticulo As TextField
	Private txtDescripcionArticulo As TextField
	Private txtQtyVentasAnual As TextField
	Private txtPrecioVenta As TextField
	Private txtDivisa As TextField
	Private txtTipoCambio As TextField
	Private txtPrecioEUR As TextField
	Private txtTipoVariacion As TextField
	Private btnEditTipoVariacion As Button
	Private txtDatoVariacion As TextField
	Private txtTipoCosteArticulo As TextField
	Private txtCosteArticulo As TextField
	Private txtDivisaCoste As TextField
	Private txtTipoCambioCoste As TextField
	Private txtCosteEUR As TextField
	Private txtNuevoPrecio As TextField
	Private txtNuevoPorMargenSVta As TextField
	Private txtNuevoImporteMargenSVtaInd As TextField
	Private txtNuevoImporteMargenSVtaLinea As TextField
	Private txtPorVariacionMargenSVta As TextField
	Private txtPorMargenSVta As TextField
	Private txtImporteMargenSVtaInd As TextField
	Private txtImporteMargenSVtaLinea As TextField
	Private btnEditDatoVariacion As Button
	Private btnStatus As Button


	Private lblVariacionNuevoPrecio As Label
	
	Private const tblAnalisisTarifasEvaluacionFinal As String="tblAnalisisTarifasEvaluacionFinal"
	Private const tblAnalisisTarifasAnalisisDatosRevisionVentas As String="tblAnalisisTarifasAnalisisDatosRevisionVentas"
	Private txtNuevoPrecioEUR As TextField
	
	Private pnlFondoVacio As B4XView
	
'	Private pnlJamTableViewListaTarifasCompraUsuario As B4XView
'	Private jamTableViewListaTarifasCompraUsuario As jamTableView

	Private jamTableViewListaCostesArticulosUsuario As jamTableView
	Private pnlJamTableViewListaCostesArticulosUsuario As B4XView
	Private lblEstadoSeccion As B4XView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(IDAnalisisTarifasVenta As Int, CodigoAnalisisTarifasVenta As String, DescripcionAnalisisTarifasVenta As String)
	mIDAnalisisTarifasVenta=IDAnalisisTarifasVenta
	mCodigoAnalisisTarifasVenta=CodigoAnalisisTarifasVenta
	mDescripcionAnalisisTarifasVenta=DescripcionAnalisisTarifasVenta
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
	CreacionTablasSQLite
	

End Sub

Sub EventName_Resize (Width As Double, Height As Double)
	
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub


Private Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	'frm.Close
	'MainMenu2.Show
	
'	Wait For(Utilidades.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cAnalisisTarifasVenta")) complete (sRes As String)
'	Select Case sRes
'		Case "ErrConn"
'			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query.","Error")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case "SinPermiso"
'			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case "ERROR"
'			Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case "DENIED"
'			Dim msa As Object=xui.MsgboxAsync("No tienes permiso para acceder a este módulo.","Aviso")
'			Wait For (msa) Msgbox_Result
'			Return
'		Case Else
'			Dim PermisoModuloUsuario As String=sRes
'	End Select
'	

	jamLoadingIndicator1.show
	Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cAnalisisTarifasVenta")) complete (sRes As String)
	jamLoadingIndicator1.Close
	If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
	Dim PermisoModuloUsuario As String=sRes

	Dim cListaAnTarifasVenta As cListaAnalisisTarifasVenta
	cListaAnTarifasVenta.Initialize
	cListaAnTarifasVenta.PermisoModuloUsuario=PermisoModuloUsuario
	cListaAnTarifasVenta.Show
	frm.Close
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



Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	jamLoadingIndicator1.EstiloLoadingIndicator="Three Circles 1"
	jamLoadingIndicator1.DuracionCiclo=1000
	lstHistorial.initialize
	Navegando=False
	
	frm.Title=Main.PrefijoTitleForms & "    Ficha Análisis Tarifas Venta " & mCodigoAnalisisTarifasVenta & "  " & mDescripcionAnalisisTarifasVenta
	
	Drawer.Initialize(Me, "Drawer", frm.RootPane, 400dip)
	Drawer.CenterPanel.LoadLayout("scrFichaAnalisisTarifasVenta")
	Drawer.leftpanel.LoadLayout("scrDrawerLeftTreeView")

	'''CSSUtils.SetStyleProperty(TreeViewDrawer,"selected","ff0000")
	
	Dim iv As ImageView
	iv.Initialize("imgHamburger")
	'iv.SetImage(HamburgerIcon)
	iv.SetImage(MaterialIconsToBitmap(Chr(0xE3C7),24,xui.Color_White))
	Drawer.CenterPanel.AddView(iv, 2dip, 2dip, 32dip, 32dip)
	iv.PickOnBounds = True
	
	'AddItemsCVLDrawer
	
	CargaTreeViewDrawer
	

	
	txtAnalisisTarifasVenta.TextColor=xui.Color_White
	txtDescripcion.TextColor=xui.Color_White
	txtFechaCreacion.TextColor=xui.Color_White
	txtFechaModificacion.TextColor=xui.Color_White
	txtUsuarioCreacion.TextColor=xui.Color_White
	txtUsuarioModificacion.TextColor=xui.Color_White
	
	frm.Show
	iv.RequestFocus
	
	
	
	Inicio
End Sub



#Region TreeView
Sub ExpandirTreeView
	Dim NativeMe As JavaObject
	NativeMe=Me
	Dim tRitem As TreeItem=TreeViewDrawer.Root
	NativeMe.RunMethod("expandTreeView",Array(tRitem))
End Sub

Sub ColapsarTreeView
	TreeViewDrawer.ClearSelection
	Dim NativeMe As JavaObject
	NativeMe=Me
	For i=0 To TreeViewDrawer.Root.Children.Size-1
		Dim tI As TreeItem=TreeViewDrawer.Root.Children.Get(i)
		NativeMe.RunMethod("collapseTreeView",Array(tI))
	Next
	
End Sub

'Set the cell background color of all treeview items (cells)
'Example: setTreeCellsColors(TreeView1, fx.colors.yellow)
Sub setTreeCellsColors(tv As TreeView, clr As Paint)
	Dim joTV As JavaObject = tv
	'Get all treecells
	Dim joTCL As JavaObject = joTV.RunMethodJo("lookupAll", Array(".tree-cell"))
	'Add those to an arraylist
	Dim joAL As JavaObject
	joAL.InitializeNewInstance("java.util.ArrayList", Array(joTCL))
	'Create a B4J list from the java arraylist
	Dim l As List = joAL
	'Set the color of the treecells
	For i = 0 To l.size - 1
		CSSUtils.SetBackgroundColor(l.Get(i), clr)
		' CSSUtils.SetStyleProperty(l.Get(i), "-fx-text-fill", "red")  ' enhance if text color needs to change
	Next
End Sub


Sub CargaTreeViewDrawer

	
	Dim imgTreeItemGo As Image=Main.fx.LoadImageSample(File.Dirassets, "arrow-right16.png",16,16)
	
	Dim img As Image=SetFontToBitmap(Chr(0xf6cf), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
	
	Dim tiSalir As TreeItem
	tiSalir.Initialize("tItem","Salir")
	tiSalir.Image=MaterialIconsToBitmap(Chr(0xE879),24, 0xFFB22222)
	TreeViewDrawer.Root.Children.Add(tiSalir)
		
	Dim tExpandirTodoMenu As TreeItem
	tExpandirTodoMenu.Initialize("tItem","Expandir Menu")
	tExpandirTodoMenu.Image=SetFontToBitmap(Chr(0xf616), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tExpandirTodoMenu)
	
			
	Dim tContraerTodoMenu As TreeItem
	tContraerTodoMenu.Initialize("tItem","Contraer Menu")
	tContraerTodoMenu.Image=SetFontToBitmap(Chr(0xf615), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tContraerTodoMenu)

	Dim tActualizarDatos As TreeItem
	tActualizarDatos.Initialize("tItem","Actualizar Datos")
	tActualizarDatos.Image=FontAwesomeToBitmap(Chr(0xF021),20, 0xFF00BFFF)
	TreeViewDrawer.Root.Children.Add(tActualizarDatos)
	
	Dim tInformacionCreacionModificacionAnalisis As TreeItem
	tInformacionCreacionModificacionAnalisis.Initialize("tItem","Info General Ficha Análisis")
	tInformacionCreacionModificacionAnalisis.Image=SetFontToBitmap(Chr(0xfb33), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tInformacionCreacionModificacionAnalisis)
	
	Dim tConfiguracionDatosAnalisis As TreeItem
	tConfiguracionDatosAnalisis.Initialize("tItem","Configuración Datos Análisis")
	tConfiguracionDatosAnalisis.Image=SetFontToBitmap(Chr(0xf494), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tConfiguracionDatosAnalisis)
	
'	Dim tDelimitacionAnalisis As TreeItem
'	tDelimitacionAnalisis.Initialize("tItem","Tipo Delimitación Análisis")
'	tDelimitacionAnalisis.Image=SetFontToBitmap(Chr(0xfa3d), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tConfiguracionDatosAnalisis.Children.Add(tDelimitacionAnalisis)

	Dim tiConfiguracionFechasVentas As TreeItem
	tiConfiguracionFechasVentas.Initialize("tItem","Selección Periodo Datos Ventas" & CRLF & "sdfgsdrgsdrt")
	tiConfiguracionFechasVentas.Image=SetFontToBitmap(Chr(0xfa31), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tConfiguracionDatosAnalisis.Children.Add(tiConfiguracionFechasVentas)
	TreeItemFechas=tiConfiguracionFechasVentas
	
	Dim tiEditarFechasVentas As TreeItem
	tiEditarFechasVentas.Initialize("tItem","Editar Fechas Ventas")
	tiEditarFechasVentas.Image=SetFontToBitmap(Chr(0xf8a6), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiConfiguracionFechasVentas.Children.Add(tiEditarFechasVentas)
	
'	Dim tiEditarFechaFinalVentas As TreeItem
'	tiEditarFechaFinalVentas.Initialize("tItem","Editar Fecha Final")
'	tiEditarFechaFinalVentas.Image=SetFontToBitmap(Chr(0xf8a6), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiConfiguracionFechasVentas.Children.Add(tiEditarFechaFinalVentas)
	
	Dim tTarifas As TreeItem
	tTarifas.Initialize("tItem","Selección de Tarifas Venta")
	tTarifas.Image=SetFontToBitmap(Chr(0xf4fd), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tConfiguracionDatosAnalisis.Children.Add(tTarifas)
	
	Dim tiTarifasVentaIncluidas As TreeItem
	tiTarifasVentaIncluidas.Initialize("tItem","Tarifas Venta Incluidas")
	tiTarifasVentaIncluidas.Image=SetFontToBitmap(Chr(0xf077), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF228B22)
	tTarifas.Children.Add(tiTarifasVentaIncluidas)
	
	Dim tiTarifasVentaExcluidas As TreeItem
	tiTarifasVentaExcluidas.Initialize("tItem","Tarifas Venta Excluidas")
	tiTarifasVentaExcluidas.Image=SetFontToBitmap(Chr(0xf078), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Red)
	tTarifas.Children.Add(tiTarifasVentaExcluidas)
	
	Dim tiTarifasVentaSeleccionadasAnalisis As TreeItem
	tiTarifasVentaSeleccionadasAnalisis.Initialize("tItem","Tarifas Venta Seleccionadas Análisis")
	tiTarifasVentaSeleccionadasAnalisis.Image=SetFontToBitmap(Chr(0xf55d), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tTarifas.Children.Add(tiTarifasVentaSeleccionadasAnalisis)
	
	Dim tiClientesTarifasVentaSeleccionadasAnalisis As TreeItem
	tiClientesTarifasVentaSeleccionadasAnalisis.Initialize("tItem","Clientes Tarifas Venta Seleccionadas Análisis")
	tiClientesTarifasVentaSeleccionadasAnalisis.Image=SetFontToBitmap(Chr(0xf55d), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tTarifas.Children.Add(tiClientesTarifasVentaSeleccionadasAnalisis)
	
	Dim tiProductos As TreeItem
	tiProductos.Initialize("tItem","Selección de Productos")
	tiProductos.Image=SetFontToBitmap(Chr(0xf316),CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tConfiguracionDatosAnalisis.Children.Add(tiProductos)
	
	Dim tiCodigosProductos As TreeItem
	tiCodigosProductos.Initialize("tItem","Códigos Productos")
	tiCodigosProductos.Image=SetFontToBitmap(Chr(0xf072),CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiProductos.Children.Add(tiCodigosProductos)
	
	Dim tiCodigosProductosIncluidos As TreeItem
	tiCodigosProductosIncluidos.Initialize("tItem","Códigos Productos Incluidos")
	tiCodigosProductosIncluidos.Image=SetFontToBitmap(Chr(0xf077), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF228B22)
	tiCodigosProductos.Children.Add(tiCodigosProductosIncluidos)
	
	Dim tiCodigosProductosExcluidos As TreeItem
	tiCodigosProductosExcluidos.Initialize("tItem","Códigos Productos Excluidos")
	tiCodigosProductosExcluidos.Image=SetFontToBitmap(Chr(0xf078), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Red)
	tiCodigosProductos.Children.Add(tiCodigosProductosExcluidos)
	
	Dim tiCodigosProductosSeleccionadosAnalisis As TreeItem
	tiCodigosProductosSeleccionadosAnalisis.Initialize("tItem","Códigos Productos Seleccionados Análisis")
	tiCodigosProductosSeleccionadosAnalisis.Image=SetFontToBitmap(Chr(0xf55d), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiCodigosProductos.Children.Add(tiCodigosProductosSeleccionadosAnalisis)

	Dim tiSistemasReposicionIncluidos As TreeItem
	tiSistemasReposicionIncluidos.Initialize("tItem","Sistemas de Reposición Incluidos")
	tiSistemasReposicionIncluidos.Image=SetFontToBitmap(Chr(0xf20f), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	'tiGruposContables.Children.Add(tiGruposContablesIncluidos)
	tiProductos.Children.Add(tiSistemasReposicionIncluidos)

'	Dim tiGruposContables As TreeItem
'	tiGruposContables.Initialize("tItem","Grupos Contables")
'	tiGruposContables.Image=SetFontToBitmap(Chr(0xf2c3), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiProductos.Children.Add(tiGruposContables)
	
	Dim tiGruposContablesIncluidos As TreeItem
	tiGruposContablesIncluidos.Initialize("tItem","Grupos Contables Producto Incluidos")
	tiGruposContablesIncluidos.Image=SetFontToBitmap(Chr(0xf2c3), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	'tiGruposContables.Children.Add(tiGruposContablesIncluidos)
	tiProductos.Children.Add(tiGruposContablesIncluidos)
	
'	Dim tiGruposContablesExcluidos As TreeItem
'	tiGruposContablesExcluidos.Initialize("tItem","Grupos Contables Excluidos")
'	tiGruposContablesExcluidos.Image=SetFontToBitmap(Chr(0xf078), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Red)
'	tiGruposContables.Children.Add(tiGruposContablesExcluidos)
	
'	Dim tiRutasProduccion As TreeItem
'	tiRutasProduccion.Initialize("tItem","Rutas Producción")
'	tiRutasProduccion.Image=SetFontToBitmap(Chr(0xfd19), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiProductos.Children.Add(tiRutasProduccion)
	
	Dim tiRutasProduccionIncluidas As TreeItem
	tiRutasProduccionIncluidas.Initialize("tItem","Rutas Produccion Incluidas")
	tiRutasProduccionIncluidas.Image=SetFontToBitmap(Chr(0xfd19), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	'tiRutasProduccion.Children.Add(tiRutasProduccionIncluidas)
	tiProductos.Children.Add(tiRutasProduccionIncluidas)
	
'	Dim tiRutasProduccionExcluidas As TreeItem
'	tiRutasProduccionExcluidas.Initialize("tItem","Rutas Produccion Excluidas")
'	tiRutasProduccionExcluidas.Image=SetFontToBitmap(Chr(0xf078), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Red)
'	tiRutasProduccion.Children.Add(tiRutasProduccionExcluidas)
	
'	Dim tiRutasProduccionCorte As TreeItem
'	tiRutasProduccionCorte.Initialize("tItem","Rutas Producción Corte")
'	tiRutasProduccionCorte.Image=SetFontToBitmap(Chr(0xfa6a), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiProductos.Children.Add(tiRutasProduccionCorte)
'	
'	Dim tiConfigRutasProduccionCorte As TreeItem
'	tiConfigRutasProduccionCorte.Initialize("tItem","Configurar Rutas Producción Corte")
'	tiConfigRutasProduccionCorte.Image=SetFontToBitmap(Chr(0xf9bd), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiRutasProduccionCorte.Children.Add(tiConfigRutasProduccionCorte)
'	
	Dim tiProductosSeleccionados As TreeItem
	tiProductosSeleccionados.Initialize("tItem","Productos Seleccionados Análisis")
	tiProductosSeleccionados.Image=SetFontToBitmap(Chr(0xf55d), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiProductos.Children.Add(tiProductosSeleccionados)

	Dim tAnalisisDatos As TreeItem
	tAnalisisDatos.Initialize("tItem","Análisis Datos")
	tAnalisisDatos.Image=SetFontToBitmap(Chr(0xf9d0), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tAnalisisDatos)
	
	Dim tiAnalisisDatosVentas As TreeItem
	tiAnalisisDatosVentas.Initialize("tItem","Analisis Datos Ventas")
	tiAnalisisDatosVentas.Image=SetFontToBitmap(Chr(0xfd43), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tAnalisisDatos.Children.Add(tiAnalisisDatosVentas)
	
	Dim tiDatosTarifasYVentas As TreeItem
	tiDatosTarifasYVentas.Initialize("tItem","Datos Precios y Ventas")
	tiDatosTarifasYVentas.Image=SetFontToBitmap(Chr(0xf115), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosVentas.Children.Add(tiDatosTarifasYVentas)
	
	Dim tiCodigosProductosNAVAdicionalesAnalisisDatosVentas As TreeItem
	tiCodigosProductosNAVAdicionalesAnalisisDatosVentas.Initialize("tItem","Códigos Productos NAV Adicionales")
	tiCodigosProductosNAVAdicionalesAnalisisDatosVentas.Image=SetFontToBitmap(Chr(0xf077), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF191970)
	tiAnalisisDatosVentas.Children.Add(tiCodigosProductosNAVAdicionalesAnalisisDatosVentas)
	
	Dim tiCodigosProductosNoNAVAdicionalesAnalisisDatosVentas As TreeItem
	tiCodigosProductosNoNAVAdicionalesAnalisisDatosVentas.Initialize("tItem","Códigos Productos NO NAV Adicionales")
	tiCodigosProductosNoNAVAdicionalesAnalisisDatosVentas.Image=SetFontToBitmap(Chr(0xf077), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF6495ED)
	tiAnalisisDatosVentas.Children.Add(tiCodigosProductosNoNAVAdicionalesAnalisisDatosVentas)
	
	Dim tiCodigosProductosExcluidosAnalisisDatosVentas As TreeItem
	tiCodigosProductosExcluidosAnalisisDatosVentas.Initialize("tItem","Códigos Productos Excluidos Análisis Datos Ventas")
	tiCodigosProductosExcluidosAnalisisDatosVentas.Image=SetFontToBitmap(Chr(0xf078), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Red)
	tiAnalisisDatosVentas.Children.Add(tiCodigosProductosExcluidosAnalisisDatosVentas)
	
	Dim tiTarifasVentaUsuario As TreeItem
	tiTarifasVentaUsuario.Initialize("tItem","Tarifas Venta Usuario")
	tiTarifasVentaUsuario.Image=SetFontToBitmap(Chr(0xfd86), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosVentas.Children.Add(tiTarifasVentaUsuario)
	
'	Dim tiDatosVentaProducto As TreeItem
'	tiDatosVentaProducto.Initialize("tItem","Info Ventas Producto")
'	tiDatosVentaProducto.Image=SetFontToBitmap(Chr(0xf12a), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiAnalisisDatosVentas.Children.Add(tiDatosVentaProducto)

	Dim tiAnalisisDatosCostes As TreeItem
	tiAnalisisDatosCostes.Initialize("tItem","Análisis Datos Costes")
	tiAnalisisDatosCostes.Image=SetFontToBitmap(Chr(0xf117), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tAnalisisDatos.Children.Add(tiAnalisisDatosCostes)
	
	Dim tiAnalisisDatosCostesProduccion As TreeItem
	tiAnalisisDatosCostesProduccion.Initialize("tItem","Análisis Datos Costes Fabricación")
	tiAnalisisDatosCostesProduccion.Image=SetFontToBitmap(Chr(0xf20f), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostes.Children.Add(tiAnalisisDatosCostesProduccion)
	
	Dim tiAnalisisDatosCostesProduccionCorte As TreeItem
	tiAnalisisDatosCostesProduccionCorte.Initialize("tItem","Análisis Datos Costes Fabricación Corte")
	tiAnalisisDatosCostesProduccionCorte.Image=SetFontToBitmap(Chr(0xfa6a), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostesProduccion.Children.Add(tiAnalisisDatosCostesProduccionCorte)
	
	Dim tiAnalisisDatosCostesProduccionNoCorte As TreeItem
	tiAnalisisDatosCostesProduccionNoCorte.Initialize("tItem","Análisis Datos Costes Fabricación No Corte")
	tiAnalisisDatosCostesProduccionNoCorte.Image=SetFontToBitmap(Chr(0xf03e), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostesProduccion.Children.Add(tiAnalisisDatosCostesProduccionNoCorte)
	
	Dim tiAnalisisDatosCostesImportacion As TreeItem
	tiAnalisisDatosCostesImportacion.Initialize("tItem","Analisis Datos Costes Importación")
	tiAnalisisDatosCostesImportacion.Image=SetFontToBitmap(Chr(0xf1e7), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostes.Children.Add(tiAnalisisDatosCostesImportacion)
	
	Dim tiAnalisisDatosCostesCompra As TreeItem
	tiAnalisisDatosCostesCompra.Initialize("tItem","Analisis Datos Costes Compra")
	tiAnalisisDatosCostesCompra.Image=SetFontToBitmap(Chr(0xfd42), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostes.Children.Add(tiAnalisisDatosCostesCompra)
	
		
	Dim tiDatosTarifasCompra As TreeItem
	tiDatosTarifasCompra.Initialize("tItem","Tarifas Compra")
	tiDatosTarifasCompra.Image=SetFontToBitmap(Chr(0xf115), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostesCompra.Children.Add(tiDatosTarifasCompra)
	
'	Dim tiTarifasCompraUsuario As TreeItem
'	tiTarifasCompraUsuario.Initialize("tItem","Tarifas Compra Usuario")
'	tiTarifasCompraUsuario.Image=SetFontToBitmap(Chr(0xfd86), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiAnalisisDatosCostesCompra.Children.Add(tiTarifasCompraUsuario)

	Dim tiCostesArticulosUsuario As TreeItem
	tiCostesArticulosUsuario.Initialize("tItem","Costes Artículos Usuario")
	tiCostesArticulosUsuario.Image=SetFontToBitmap(Chr(0xfd86), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	tiAnalisisDatosCostes.Children.Add(tiCostesArticulosUsuario)

	
'	Dim tiDatosEntradasProducto As TreeItem
'	tiDatosEntradasProducto.Initialize("tItem","Info Entradas Producto")
'	tiDatosEntradasProducto.Image=SetFontToBitmap(Chr(0xf12a), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	tiAnalisisDatosCostes.Children.Add(tiDatosEntradasProducto)

	Dim tiEditarEstadoAnalisisTarifas As TreeItem
	tiEditarEstadoAnalisisTarifas.Initialize("tItem","Editar Estado Análisis Tarifas")
	tiEditarEstadoAnalisisTarifas.Image=SetFontToBitmap(Chr(0xf33f), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tiEditarEstadoAnalisisTarifas)
	
	Dim tiEvaluacionFinalAnalisisTarifas As TreeItem
	tiEvaluacionFinalAnalisisTarifas.Initialize("tItem","Evaluación Final Análisis Tarifas")
	tiEvaluacionFinalAnalisisTarifas.Image=SetFontToBitmap(Chr(0xf8ff), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tiEvaluacionFinalAnalisisTarifas)

	''''setTreeCellsColors(TreeViewDrawer, fx.Colors.From32Bit(0x00FFFFFF))  ' fondo treeview transparente
End Sub

'Returns an uninitialized TreeItem if not found.
Sub SearchTreeItemByText(Parent As TreeItem, s As String) As TreeItem
	For Each ti As TreeItem In Parent.Children
		If ti.Text = s Then
			Return ti
		End If
		If ti.Children.Size > 0 Then
			Dim res As TreeItem = SearchTreeItemByText(ti, s)
			If res.IsInitialized Then Return res
		End If
	Next
	Dim res As TreeItem
	Return res
End Sub

'Sub DeshabilitarOpcionesDelimitacionAnalisis
'			
'	Dim mDataDelimitacion As Map=CargaMapaValoresDelimitacion
'	Log(mDataDelimitacion)
'	
'	Dim NativeMe As JavaObject=Me
'	
'	Dim tI As TreeItem=SearchTreeItemByText(TreeViewDrawer.Root,"Selección de Tarifas Venta")
'	
'
'
'	'Dim tCell As JavaObject=NativeMe.RunMethodJO("findCellByItem", Array(tI,TreeViewDrawer))
'	Dim tCell As JavaObject=NativeMe.RunMethodJO("findCellByItemLookupAll", Array(tI,TreeViewDrawer))
'	tCell.RunMethod("setDisabled",Array(1=mDataDelimitacion.Get("tarifasventa")))
'End Sub

Sub TreeViewDrawer_SelectedItemChanged (SelectedItem As TreeItem)
	If SelectedItem.IsInitialized=False Then Return
	'Main.TreeItemMenuAbreForm=SelectedItem
	
	'Dim TextoSelectedItem As String=SelectedItem.Text
	
	LogColor("SelectedItem " & SelectedItem.Text,xui.Color_Blue)
	
	Select SelectedItem.Text
		Case "Salir"
			Drawer.LeftOpen=False
			SalirModulo
			
		Case "Expandir Menu"
			ExpandirTreeView
			
		Case "Contraer Menu"
			ColapsarTreeView
			
'		Case "Tipo Delimitación Análisis"
'			Drawer.LeftOpen=False
'			DefinirTipoDelimitacionAnalisis

		Case "Info General Ficha Análisis"
			Drawer.LeftOpen=False
			Navegando=False
			ActualizarInfoGeneralFichaAnalisis
			
			
		Case "Editar Fechas Ventas"
			Drawer.LeftOpen=False
			Navegando=False
			'EditarFechaInicialVentas
			EditarFechasVentas
			
'		Case "Editar Fecha Final"
'			Drawer.LeftOpen=False
'			Navegando=False
'			EditarFechaFinalVentas
			
		Case "Tarifas Venta Incluidas"
			Drawer.LeftOpen=False
			Navegando=False
			TarifasIncluidas
			
		Case "Tarifas Venta Excluidas"
			Drawer.LeftOpen=False
			Navegando=False
			TarifasExcluidas
			
		Case "Tarifas Venta Seleccionadas Análisis"
			Drawer.LeftOpen=False
			Navegando=False
			VerTarifasAnalisis
			
		Case "Clientes Tarifas Venta Seleccionadas Análisis"
			Drawer.LeftOpen=False
			Navegando=False
			ClientesTarifasAnalisis
			
		Case "Códigos Productos Incluidos"
			Drawer.LeftOpen=False
			Navegando=False
			ArticulosIncluidos
		
		Case "Códigos Productos Excluidos"
			Drawer.LeftOpen=False
			Navegando=False
			ArticulosExcluidos
			
		Case "Códigos Productos Seleccionados Análisis"
			Drawer.LeftOpen=False
			Navegando=False
			CodigosArticulosSeleccionadoAnalisis
			
		Case "Sistemas de Reposición Incluidos"
			Drawer.LeftOpen=False
			Navegando=False
			SistemasReposicionIncluidos
			
		Case "Grupos Contables Producto Incluidos"
			Drawer.LeftOpen=False
			Navegando=False
			GruposContablesProductoIncluidos
			
		Case "Rutas Produccion Incluidas"
			Drawer.LeftOpen=False
			Navegando=False
			wait for(RutasProduccionIncluidas) complete (rBool As Boolean)
			
		Case "Productos Seleccionados Análisis"
			Drawer.LeftOpen=False
			ProductosSeleccionadosAnalisis
			
		Case "Datos Precios y Ventas"
			Drawer.LeftOpen=False
			Navegando=False
			AnalisisDatosRevisionVentas
			
		Case "Códigos Productos Excluidos Análisis Datos Ventas"
			Drawer.LeftOpen=False
			Navegando=False
			ArticulosExcluidosDatosRevisionVentas
			
		Case "Tarifas Venta Usuario"
			Drawer.LeftOpen=False
			Navegando=False
			TarifasVentaUsuario
			
		Case "Análisis Datos Costes Fabricación Corte"
			Drawer.LeftOpen=False
			Navegando=False
			AnalisisCostesArticulosFabCorte
			
		Case "Análisis Datos Costes Fabricación No Corte"
			Drawer.LeftOpen=False
			Navegando=False
			AnalisisCostesArticulosFabNoCorte
			
		Case "Tarifas Compra"
			Drawer.LeftOpen=False
			Navegando=False
			AnalisisCostesArticulosCompra
			
					
'		Case "Tarifas Compra Usuario"
'			Drawer.LeftOpen=False
'			Navegando=False
'			TarifasCompraUsuario
			
		Case "Costes Artículos Usuario"
			Drawer.LeftOpen=False
			Navegando=False
			CostesArticulosUsuario
			
			
		Case "Analisis Datos Costes Importación"	
			Drawer.LeftOpen=False
			Navegando=False
			AnalisisCostesArticulosImportacion
			
		Case "Evaluación Final Análisis Tarifas"
			jamLoadingIndicator1.MensajeLoading="Cargando datos cabecera..."
			jamLoadingIndicator1.Show
			wait for (ActualizarCabecera) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then
				SalirModulo
				Return
			End If
	
			Dim mData As Map=mRes.Get("mData")
	
			Dim EstadoAnalisistarifas As String=mData.Get("Estado")
			If EstadoAnalisistarifas="Abierto" Then
				wait for(Utilidades.MsgBoxXUI("Aviso",$"El estado del análisis de tarifas seleccionado ${mCodigoAnalisisTarifasVenta} es ABIERTO.
Para proceder a la evaluación del mismo, es necesario cerrarlo previamente."$)) complete (rObj As Object)
				Return
			End If
			
			Drawer.LeftOpen=False
			Navegando=False
			EvaluacionFinalAnalisisTarifasCLV
			
		Case "Editar Estado Análisis Tarifas"
			Drawer.LeftOpen=False
			Navegando=False
			EditarEstadoAnalisisTarifas
			
		Case "Acerca De"
			Drawer.LeftOpen=False
			
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
			'<div>Iconos diseñados por <a href="https://www.flaticon.es/autores/eucalyp" title="Eucalyp">Eucalyp</a> from <a href="https://www.flaticon.es/" title="Flaticon">www.flaticon.es</a></div>
			'<a href="https://www.flaticon.com/free-icons/phase" title="phase icons">Phase icons created by Flat Icons - Flaticon</a>


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
		
End Sub

#If Java
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.util.List;

public TreeCell findCellByItem(TreeItem treeItem, TreeView treeView) {
        return recursiveFindCellByItem(treeItem, treeView);
    }

public TreeCell recursiveFindCellByItem(TreeItem treeItem, Node node) {

    if (node.getStyleClass().contains("tree-cell")
            && TreeCell.class.isAssignableFrom(node.getClass())
            && ((TreeCell) node).getTreeItem() == treeItem)
        return (TreeCell) node;

    if (!Parent.class.isAssignableFrom(node.getClass()))
        return null;

    List<Node> nodes = ((Parent) node).getChildrenUnmodifiable();
    if (nodes == null) return null;

    for (Node n : nodes) {
        TreeCell cell = recursiveFindCellByItem(treeItem, n);
        if (cell != null) return cell;
    }
    return null;
}


public TreeCell findCellByItemLookupAll(TreeItem treeItem, TreeView treeView) {
    return (TreeCell) treeView.lookupAll(".tree-cell").stream()
            .filter(n -> ((TreeCell) n).getTreeItem() == treeItem)
            .findFirst()
            .orElse(null);
}


#End If

#End Region

Sub CreacionTablasSQLite
	
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasTiposFiltradoDelimitacion"))
'	If ntFP>0 Then
'		mSQL.ExecNonQuery("drop table tblAnalisisTarifasTiposFiltradoDelimitacion")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasTiposFiltradoDelimitacion (")
'
'	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
'	sbCrearTabla.Append("TarifasVenta INTEGER default 0,")
'	sbCrearTabla.Append("CodigosArticulo INTEGER default 0,")
'	sbCrearTabla.Append("SistemaReposicion INTEGER default 0,")
'	sbCrearTabla.Append("Rutas INTEGER default 0,")
'	sbCrearTabla.Append("GruposContablesProducto INTEGER default 0)")
'
'	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tbl_PROIN_AnalisisTarifasListaTarifas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tbl_PROIN_AnalisisTarifasListaTarifas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tbl_PROIN_AnalisisTarifasListaTarifas (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
'	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
'	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreTipoTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tbl_PROIN_AnalisisTarifasListaTarifasInclusiones"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tbl_PROIN_AnalisisTarifasListaTarifasInclusiones")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tbl_PROIN_AnalisisTarifasListaTarifasInclusiones (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreTipoTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tbl_PROIN_AnalisisTarifasListaTarifasExclusiones"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tbl_PROIN_AnalisisTarifasListaTarifasExclusiones")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tbl_PROIN_AnalisisTarifasListaTarifasExclusiones (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreTipoTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreTarifa TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaClientesTarifas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaClientesTarifas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaClientesTarifas (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("NombreTipoTarifa TEXT,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '')")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaArticulos"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaArticulos")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaArticulos (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
	sbCrearTabla.Append("Bloqueado INTEGER,")
	sbCrearTabla.Append("BloqueadoNoDisponible INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaArticulosInclusiones"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaArticulosInclusiones")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaArticulosInclusiones (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
	sbCrearTabla.Append("Bloqueado INTEGER,")
	sbCrearTabla.Append("BloqueadoNoDisponible INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaArticulosExclusiones"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaArticulosExclusiones")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaArticulosExclusiones (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
	sbCrearTabla.Append("Bloqueado INTEGER,")
	sbCrearTabla.Append("BloqueadoNoDisponible INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
'	sbCrearTabla.Append("Bloqueado INTEGER,")
'	sbCrearTabla.Append("BloqueadoNoDisponible INTEGER,")
'	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
'	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaGRCs"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaGRCs")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaGRCs (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("NombreGRC TEXT,")
	sbCrearTabla.Append("TipoIVAGRC TEXT,")
	sbCrearTabla.Append("GRCAnalisis INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE)")
	'sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaRutas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaRutas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaRutas (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
	sbCrearTabla.Append("RutaCorte TEXT,")
	sbCrearTabla.Append("RutaAnalisis INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE)")
	'sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaSistemasReposicion"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaSistemasReposicion")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaSistemasReposicion (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("SistemaReposicion TEXT,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("SistemaReposicionAnalisis INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE)")
	'sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaProductosSeleccionadosAnalisis"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaProductosSeleccionadosAnalisis")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaProductosSeleccionadosAnalisis (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("DescripcionRuta TEXT)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasAnalisisDatosRevisionVentas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasAnalisisDatosRevisionVentas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasAnalisisDatosRevisionVentas (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa TEXT,")
	sbCrearTabla.Append("NombreTipoTarifa TEXT,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("NombreTarifa TEXT,")
	sbCrearTabla.Append("ResponsableCuenta TEXT,")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
'	sbCrearTabla.Append("Talla TEXT,")
	sbCrearTabla.Append("QtyVenta INTEGER,")
	sbCrearTabla.Append("MaxFechaVentas INTEGER DEFAULT 0,")
	sbCrearTabla.Append("QtyVentasAnualEstimada INTEGER DEFAULT 0,")
	sbCrearTabla.Append("QtyVentasAnual INTEGER DEFAULT 0,")
'	sbCrearTabla.Append("QtyVentaTalla INTEGER,")
'	sbCrearTabla.Append("MaxFechaVentasTalla INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaInicialNAV INTEGER,")
	sbCrearTabla.Append("PrecioUnitarioNAV REAL,")
	sbCrearTabla.Append("DivisaNAV TEXT,")
	sbCrearTabla.Append("TipoPrecioVentaUsuarioNAV TEXT,")
	sbCrearTabla.Append("PrecioVentaUsuarioNAV REAL,")
	sbCrearTabla.Append("DivisaUsuarioNAV TEXT,")
	sbCrearTabla.Append("FechaInicialUsuarioNAV INTEGER DEFAULT 0,")
	sbCrearTabla.Append("NumTAvisos INTEGER default 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis] ")
	sbCrearTabla.Append("([IDAnalisisTarifas] INTEGER default 0, [TipoTarifa] INTEGER, [CodigoTarifa] TEXT, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, ")
	sbCrearTabla.Append("[CantidadMinima] REAL, [Moneda] TEXT, [UM] TEXT, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER, [UMVenta] TEXT)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasVentasAvisosTarifasVentas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasVentasAvisosTarifasVentas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasAvisosTarifasVentas] ([IDAnalisisTarifas] INTEGER default 0, [TipoTarifa] INTEGER, [CodigoTarifa] TEXT, [Articulo] TEXT, ")
	sbCrearTabla.Append("[NumPreciosArt] INTEGER, [NumPreciosArtTalla] INTEGER, [NumPreciosQtyMin] INTEGER, [NumPreciosDivisa] INTEGER, [NumPreciosUMDifUMVta] INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasVentasNumAvisosTarifasVentas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasVentasNumAvisosTarifasVentas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasNumAvisosTarifasVentas] ([IDAnalisisTarifas] INTEGER default 0, [TipoTarifa] INTEGER, ")
	sbCrearTabla.Append("[CodigoTarifa] TEXT, [Articulo] TEXT, [NumTAvisos] INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("GRC TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
	sbCrearTabla.Append("Bloqueado INTEGER,")
	sbCrearTabla.Append("BloqueadoNoDisponible INTEGER,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaTarifasVentaUsuario"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaTarifasVentaUsuario")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaTarifasVentaUsuario (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("Divisa TEXT,")
	sbCrearTabla.Append("PrecioUnitarioDivisa REAL,")
	sbCrearTabla.Append("TipoCambio REAL,")
	sbCrearTabla.Append("PrecioUnitarioEUR REAL,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)


	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasAnalisisCostesArticulosCompra"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasAnalisisCostesArticulosCompra")
	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasAnalisisCostesArticulosCompra (")
'	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
'	sbCrearTabla.Append("Articulo TEXT,")
'	sbCrearTabla.Append("DescripcionArticulo TEXT,")
'	sbCrearTabla.Append("Proveedor TEXT,")
'	sbCrearTabla.Append("NombreProveedor TEXT,")
'	sbCrearTabla.Append("TipoPrecioCompraUsuarioNAV TEXT,")
'	sbCrearTabla.Append("PrecioCompraUsuarioNAV REAL,")
'	sbCrearTabla.Append("DivisaUsuarioNAV TEXT,")
'	sbCrearTabla.Append("FechaPrecioCompraUsuarioNAV INTEGER,")
'	sbCrearTabla.Append("CosteArticuloUsuario REAL,")
'	sbCrearTabla.Append("PrecioCompraNAV REAL,")
'	sbCrearTabla.Append("FechaInicial INTEGER,")
'	sbCrearTabla.Append("FechaUltimaEntradaCompraFab INTEGER,")
'	sbCrearTabla.Append("NumTAvisos INTEGER default 0)")
	'mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim sCrearTabla As String=$"
CREATE TABLE If Not EXISTS [tblAnalisisTarifasAnalisisCostesArticulosCompra] (IDAnalisisTarifas INTEGER, [TipoArticulo] TEXT DEFAULT '', [Articulo] TEXT, [DescripcionArticulo] TEXT, [Proveedor] TEXT, [NombreProveedor] TEXT,
 [FechaInicialNAV] INTEGER, [PrecioCompraNAV] REAL, [DivisaNAV] TEXT, [PrecioCompraNAVEUR] REAL, [CosteUnitarioUsuario] REAL, [FechaCosteUnitarioUsuario] INTEGER,
  [TipoPrecioCompraUsuarioNAV] TEXT, [PrecioCompraUsuarioNAVEUR] REAL, [FechaPrecioCompraUsuarioNAV] INTEGER, [FechaUltimaEntradaCompraFab] INTEGER,NumTAvisos INTEGER default 0, CosteUnitarioArticulo REAL)
"$
	mSQL.ExecNonQuery(sCrearTabla)
	
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaTarifasCompraUsuario"))
'	If ntFP>0 Then
'		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaTarifasCompraUsuario")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaTarifasCompraUsuario (")
'	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
'	sbCrearTabla.Append("Proveedor INTEGER,")
'	sbCrearTabla.Append("NombreProveedor TEXT,")
'	sbCrearTabla.Append("Articulo TEXT,")
'	sbCrearTabla.Append("DescripcionArticulo TEXT,")
'	sbCrearTabla.Append("Divisa TEXT,")
'	sbCrearTabla.Append("PrecioUnitarioDivisa REAL,")
'	sbCrearTabla.Append("TipoCambio REAL,")
'	sbCrearTabla.Append("PrecioUnitarioEUR REAL,")
'	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
'	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
'	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasListaCostesArticulosUsuario"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasListaCostesArticulosUsuario")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasListaCostesArticulosUsuario (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("CosteUnitarioUsuario REAL,")
	sbCrearTabla.Append("FechaActualizacionLong INTEGER,")
	sbCrearTabla.Append("UsuarioActualizacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Seleccionado INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis] ")
	sbCrearTabla.Append("([IDAnalisisTarifas] INTEGER, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Proveedor] TEXT, [NombreProveedor] TEXT, [Variante] TEXT, ")
	sbCrearTabla.Append("[MinQty] REAL, [UM] TEXT, [Moneda] TEXT, [PrecioCompra] REAL, [TipoCambio] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasVentasAvisosTarifasCompras"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasVentasAvisosTarifasCompras")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	'sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasAvisosTarifasCompras] ([IDAnalisisTarifas] INTEGER default 0, [Proveedor] TEXT, [Articulo] TEXT, ")
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasAvisosTarifasCompras] ([IDAnalisisTarifas] INTEGER default 0, [Articulo] TEXT, ")
	sbCrearTabla.Append("[NumPreciosArt] INTEGER, [NumPreciosArtTalla] INTEGER, [NumPreciosQtyMin] INTEGER, [NumPreciosDivisa] INTEGER, [NumPreciosUMDifUMCompra] INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasVentasNumAvisosTarifasCompras"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasVentasNumAvisosTarifasCompras")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	'sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasNumAvisosTarifasCompras] ([IDAnalisisTarifas] INTEGER default 0, [Proveedor] TEXT, [Articulo] TEXT, [NumTAvisos] INTEGER)")
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasVentasNumAvisosTarifasCompras] ([IDAnalisisTarifas] INTEGER default 0, [Articulo] TEXT, [NumTAvisos] INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasLineasTarifasCompraArticulo"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasLineasTarifasCompraArticulo")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisTarifasLineasTarifasCompraArticulo] ([IDAnalisisTarifas] INTEGER default 0, [Articulo] TEXT, [DescripcionArticulo] TEXT, ")
	sbCrearTabla.Append("[Proveedor] TEXT, [NombreProveedor] TEXT, [FechaInicial] INTEGER, [Moneda] TEXT, [Variante] TEXT, ")
	sbCrearTabla.Append("[UMTarifaCompra] TEXT, [UMBaseArt] TEXT, [UMCompraArt] TEXT, [MinQty] REAL, [PrecioCompra] REAL, ")
	sbCrearTabla.Append("[FechaFinal] INTEGER, [PrecioEspecial] INTEGER, [PrecioStdCostes] INTEGER, [ProveedorPredeterminado] TEXT)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasAnalisisCostesArticulosImportacion"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasAnalisisCostesArticulosImportacion")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasAnalisisCostesArticulosImportacion (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("Proveedor TEXT,")
	sbCrearTabla.Append("NombreProveedor TEXT,")
	sbCrearTabla.Append("GrupoContableProveedor TEXT,")
	sbCrearTabla.Append("SistemaReposicion INTEGER,")
	sbCrearTabla.Append("NombreSistemaReposicion TEXT,")
	sbCrearTabla.Append("Ruta TEXT,")
	sbCrearTabla.Append("NombreRuta TEXT,")
	sbCrearTabla.Append("RutaCorte TEXT,")
	sbCrearTabla.Append("SistAprov TEXT,")
	sbCrearTabla.Append("CosteRazonable REAL,")
	sbCrearTabla.Append("FechaCosteRazonable INTEGER,")
	sbCrearTabla.Append("CosteStd REAL,")
	sbCrearTabla.Append("FechaCosteStd INTEGER,")
	sbCrearTabla.Append("CosteUnitarioArticulo REAL,")
	sbCrearTabla.Append("CosteUnitarioUsuario REAL,")
	sbCrearTabla.Append("FechaCosteUnitarioUsuario INTEGER,")
	sbCrearTabla.Append("TipoCosteUsuarioNAV TEXT,")
	sbCrearTabla.Append("CosteUsuarioNAV REAL,")
	sbCrearTabla.Append("FechaCosteUsuarioNAV INTEGER,")
	sbCrearTabla.Append("FechaUltimaEntradaCompraFab INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	

	mSQL.ExecNonQuery("drop table if exists tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos] ([Articulo] TEXT, [Ficha] TEXT, [FechaCreacionLong] INTEGER, [TotalCoste] REAL)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte"))
'	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table if exists tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte")
'	End If
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte (IDAnalisisTarifas INTEGER,Articulo TEXT,DescripcionArticulo TEXT,
	Proveedor TEXT,NombreProveedor TEXT,GrupoContableProveedor TEXT,SistemaReposicion INTEGER,NombreSistemaReposicion TEXT,
	Ruta TEXT,NombreRuta TEXT, RutaCorte TEXT,SistAprov TEXT,CosteRazonable REAL,FechaCosteRazonable INTEGER,
	CosteStd REAL,FechaCosteStd INTEGER,FichaCosteOferta TEXT default '',CosteOferta REAL default 0,FechaCosteOferta INTEGER default 0,
	CosteUnitarioUsuario REAL,FechaCosteUnitarioUsuario INTEGER,TipoCosteUsuarioNAV TEXT,CosteUsuarioNAV REAL,FechaCosteUsuarioNAV INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasAnalisisCostesArticulosFabCorte"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasAnalisisCostesArticulosFabCorte")
	End If
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS tblAnalisisTarifasAnalisisCostesArticulosFabCorte (IDAnalisisTarifas INTEGER,Articulo TEXT,DescripcionArticulo TEXT,
	Proveedor TEXT,NombreProveedor TEXT,GrupoContableProveedor TEXT,SistemaReposicion INTEGER,NombreSistemaReposicion TEXT,
	Ruta TEXT,NombreRuta TEXT,RutaCorte TEXT,SistAprov TEXT,CosteRazonable REAL,FechaCosteRazonable INTEGER,CosteStd REAL,FechaCosteStd INTEGER,
	FichaCosteOferta TEXT default '',CosteOferta REAL default 0,FechaCosteOferta INTEGER default 0,
	CosteUnitarioUsuario REAL,FechaCosteUnitarioUsuario INTEGER,TipoCosteUsuarioNAV TEXT,CosteUsuarioNAV REAL,FechaCosteUsuarioNAV INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("Variante TEXT,")
	sbCrearTabla.Append("CantidadMinima Real,")
	sbCrearTabla.Append("Moneda TEXT,")
	sbCrearTabla.Append("UM TEXT,")
	sbCrearTabla.Append("PrecioUnitario REAL,")
	sbCrearTabla.Append("FechaInicial INTEGER,")
	sbCrearTabla.Append("FechaFinal INTEGER,")
	sbCrearTabla.Append("UMVenta TEXT)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasLineasTarifasCompraArticulo"))
'	If ntFP>0 Then
'		mSQL.ExecNonQuery("drop table tblAnalisisTarifasLineasTarifasCompraArticulo")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasLineasTarifasCompraArticulo (")
'	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
'	sbCrearTabla.Append("Proveedor TEXT,")
'	sbCrearTabla.Append("NombreProveedor TEXT,")
'	sbCrearTabla.Append("Articulo TEXT,")
'	sbCrearTabla.Append("DescripcionArticulo TEXT,")
'	sbCrearTabla.Append("Variante TEXT,")
'	sbCrearTabla.Append("CantidadMinima Real,")
'	sbCrearTabla.Append("Moneda TEXT,")
'	sbCrearTabla.Append("UM TEXT,")
'	sbCrearTabla.Append("PrecioUnitario REAL,")
'	sbCrearTabla.Append("FechaInicial INTEGER,")
'	sbCrearTabla.Append("FechaFinal INTEGER,")
'	sbCrearTabla.Append("UMCompra TEXT)")
'	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisTarifasEvaluacionFinal"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblAnalisisTarifasEvaluacionFinal (")
	sbCrearTabla.Append("IDAnalisisTarifas INTEGER,")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
'	sbCrearTabla.Append("Talla TEXT,")
'	sbCrearTabla.Append("QtyMin REAL,")
'	sbCrearTabla.Append("UM TEXT,")
	sbCrearTabla.Append("Status TEXT,")
	sbCrearTabla.Append("DescripcionStatus TEXT,")
	sbCrearTabla.Append("QtyVentasAnual REAL,")
	sbCrearTabla.Append("PrecioVenta REAL,")
	sbCrearTabla.Append("DivisaVenta TEXT,")
	sbCrearTabla.Append("TipoCambioVenta REAL,")
	sbCrearTabla.Append("PrecioEUR REAL,")
	sbCrearTabla.Append("CosteArticulo REAL,")
	sbCrearTabla.Append("DivisaCoste TEXT,")
	sbCrearTabla.Append("TipoCambioCoste REAL,")
	sbCrearTabla.Append("CosteEUR REAL,")
	sbCrearTabla.Append("Proveedor TEXT,")
	sbCrearTabla.Append("NombreProveedor TEXT,")
	sbCrearTabla.Append("TipoCosteArticulo TEXT,")
	sbCrearTabla.Append("PorMargensVta REAL default -99999,")
	sbCrearTabla.Append("ImporteMargenSVtaInd REAL default -99999,")
	sbCrearTabla.Append("ImporteMargenSVtaLinea REAL default -99999,")
	sbCrearTabla.Append("TipoVariacion TEXT default 'VAr.Margen',")
	sbCrearTabla.Append("DatoVariacion REAL default 0,")
	sbCrearTabla.Append("NuevoPrecio REAL default -99999,")
	sbCrearTabla.Append("NuevoPrecioEUR REAL default -99999,")
	sbCrearTabla.Append("NuevoPorMargenSVta REAL default -99999,")
	sbCrearTabla.Append("NuevoImporteMargenSVtaInd REAL default -99999,")
	sbCrearTabla.Append("NuevoImporteMargenSVtaLinea REAL default -99999,")
	sbCrearTabla.Append("PorVariacionMargenSVta REAL default -99999)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblVentasTipoCodigoTarifaArticuloTallaSeleccionados"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblVentasTipoCodigoTarifaArticuloTallaSeleccionados")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblVentasTipoCodigoTarifaArticuloTallaSeleccionados (")
	sbCrearTabla.Append("TipoTarifa INTEGER,")
	sbCrearTabla.Append("CodigoTarifa TEXT,")
	sbCrearTabla.Append("Articulo TEXT,")
	sbCrearTabla.Append("DescripcionArticulo TEXT,")
	sbCrearTabla.Append("Variante TEXT,")
	sbCrearTabla.Append("Cliente TEXT,")
	sbCrearTabla.Append("NombreCliente TEXT,")
	sbCrearTabla.Append("GRP TEXT,")
	sbCrearTabla.Append("NombreGRP TEXT,")
	sbCrearTabla.Append("Fecha INTEGER,")
	sbCrearTabla.Append("Documento TEXT,")
	sbCrearTabla.Append("Qty REAL,")
	sbCrearTabla.Append("Precio REAL,")
	sbCrearTabla.Append("Divisa TEXT,")
	sbCrearTabla.Append("PrecioEUR REAL)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
End Sub


Sub imgHamburger_MouseClicked (EventData As MouseEvent)
	'DeshabilitarOpcionesDelimitacionAnalisis
	Drawer.LeftOpen = True
End Sub

Sub FontAwesomeToBitmap (Text As String, FontSize As Float, Color As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As Pane = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim fnt As B4XFont = xui.CreateFontAwesome(FontSize)
	Dim r As B4XRect = cvs1.MeasureText(Text, fnt)
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(Text, cvs1.TargetRect.CenterX, BaseLine, fnt, Color, "CENTER")
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub

Sub MaterialIconsToBitmap (Text As String, FontSize As Float, Color As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As Pane = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim fnt As B4XFont = xui.CreateMaterialIcons(FontSize)
	Dim r As B4XRect = cvs1.MeasureText(Text, fnt)
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(Text, cvs1.TargetRect.CenterX, BaseLine, fnt, Color, "CENTER")
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub

Public Sub SetFontToBitmap (FontText As String, FontType As B4XFont , FontSize As Float, FontColor As Int) As B4XBitmap
	Dim xui As XUI
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)
	Dim cvs1 As B4XCanvas
	cvs1.Initialize(p)
	Dim r As B4XRect = cvs1.MeasureText(FontText, xui.CreateFont2(FontType, FontSize))
	Dim BaseLine As Int = cvs1.TargetRect.CenterY - r.Height / 2 - r.Top
	cvs1.DrawText(FontText, cvs1.TargetRect.CenterX, BaseLine, xui.CreateFont2(FontType, FontSize), FontColor, "CENTER")
	cvs1.Invalidate
	Dim b As B4XBitmap = cvs1.CreateBitmap
	cvs1.Release
	Return b
End Sub

'NativeFontSize is needed only for B4J or B4I.
'ejemplo
'<code>
'Dim PackageImg As Image=SetFontToBitmap(Chr(0xf3d6), CreateB4XFont("materialdesignicons-webfont.ttf",32,32),32,xui.Color_Black)
'</code>
Public Sub CreateB4XFont(FontFileName As String, FontSize As Float, NativeFontSize As Float) As B4XFont
    #If B4A
        Return xui.CreateFont(Typeface.LoadFromAssets(FontFileName), FontSize)
    #Else If B4i
        Return xui.CreateFont(Font.CreateNew2(FontFileName, NativeFontSize), FontSize)
    #Else    ' B4J
	Return xui.CreateFont(fx.LoadFont(File.DirAssets, FontFileName, NativeFontSize), FontSize)
    #End If
End Sub


'#Region CLVDrawer
'private Sub AddItemCLVDrawer1Img(Imagen1DrawerMenuItem As Image, TextoDrawerMenuItem As String,ValorItem As String,AlturaItem As Double)
'	clvDrawer.Add(CreateItemCLVDrawer1Img(Imagen1DrawerMenuItem,TextoDrawerMenuItem,AlturaItem),ValorItem)
'End Sub
'
'private Sub AddItemCLVDrawer2Img(Imagen1DrawerMenuItem As Image, Imagen2DrawerMenuItem As Image, TextoDrawerMenuItem As String,ValorItem As String,AlturaItem As Double)
'	clvDrawer.Add(CreateItemCLVDrawer2Img(Imagen1DrawerMenuItem, Imagen2DrawerMenuItem,TextoDrawerMenuItem,AlturaItem),ValorItem)
'End Sub
'
'private Sub CreateItemCLVDrawer1Img(Imagen1DrawerMenuItem As Image, TextoDrawerMenuItem As String, AlturaItem As Double) As B4XView
'	Dim p As B4XView =xui.CreatePanel("")
'	p.LoadLayout("scrDrawerMenuItemCLV")
'	CSSUtils.SetBackgroundColor(p,fx.Colors.From32Bit(0x00FFFFFF))
'	p.SetLayoutAnimated(0, 0, 0, clvDrawer.AsView.Width, AlturaItem)
'	
'	imvDrawerMenuItem1.SetImage(Imagen1DrawerMenuItem)
'	lblTextoDrawerMenuItem.Text=TextoDrawerMenuItem
'
'	Return p
'End Sub
'
'private Sub CreateItemCLVDrawer2Img(Imagen1DrawerMenuItem As Image, Imagen2DrawerMenuItem As Image, TextoDrawerMenuItem As String, AlturaItem As Double) As B4XView
'	Dim p As B4XView =xui.CreatePanel("")
'	p.LoadLayout("scrDrawerMenuItemCLV2Img")
'	CSSUtils.SetBackgroundColor(p,fx.Colors.From32Bit(0x00FFFFFF))
'	p.SetLayoutAnimated(0, 0, 0, clvDrawer.AsView.Width, AlturaItem)
'	
'	imvDrawerMenuItem1.SetImage(Imagen1DrawerMenuItem)
'	imvDrawerMenuItem2.SetImage(Imagen2DrawerMenuItem)
'	lblTextoDrawerMenuItem.Text=TextoDrawerMenuItem
'
'	Return p
'End Sub
'
'Sub AddItemsCVLDrawer
'	Dim imgPlus As Image=FontAwesomeToBitmap(Chr(0xF196),20, 0xFF7FFF00)
'	Dim imgMinus As Image=FontAwesomeToBitmap(Chr(0xF147),20, 0xFFFF00FF)
'	'Dim imgMinus As Image=FontAwesomeToBitmap(Chr(0xF147),20, 0xFFFF1493)
'	Dim ImgBlank As Image=FontAwesomeToBitmap(Chr(0xF192),32,xui.Color_Transparent)
'	
''	' salir
''	Dim img As Image=MaterialIconsToBitmap(Chr(0xE5C4),24, xui.Color_White)
''	AddItemCLVDrawer1Img(img, "Cerrar Menú", "CerrarMenu",40dip)
'
'	Dim img As Image=MaterialIconsToBitmap(Chr(0xE879),24, xui.Color_White)
'	AddItemCLVDrawer1Img(img, "Salir", "Salir",40dip)
'	
'	clvDrawer.AddTextItem("","")
'	
'	Dim img As Image=FontAwesomeToBitmap(Chr(0xF021),20, 0xFF00BFFF)
'	AddItemCLVDrawer1Img(img, "Actualizar Datos", "ActualizarDatos",40dip)
'	
'	clvDrawer.AddTextItem("","")
'	
'	'Dim ImgBlank=SetFontToBitmap(Chr(0xF192), CreateB4XFont("materialdesignicons-webfont.ttf",32,32),32,xui.Color_Black)
'	
''	Dim img As Image=SetFontToBitmap(Chr(0xf90b), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
''	AddItemCLVDrawer1Img(img, "Editar Descripcion", "EditarDescripcion",40dip)
'	
''	Dim img As Image=SetFontToBitmap(Chr(0xf8a6), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
''	AddItemCLVDrawer1Img(img, "Editar Parámetros Fecha", "EditarParametrosFecha",40dip)
'	
'	Dim img As Image=SetFontToBitmap(Chr(0xf4fd), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgPlus,img, "Tarifas Incluidas", "TarifasIncluidas",40dip)
'	
'	Dim img As Image=SetFontToBitmap(Chr(0xf4fd), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgMinus,img, "Tarifas Excluidas", "TarifasExcluidas",40dip)
'	
'	Dim img As Image=SetFontToBitmap(Chr(0xf6cf), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
'	Dim img2 As Image=SetFontToBitmap(Chr(0xf4fd), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(img, img2, "Ver Tarifas Análisis", "VerTarifasAnalisis",40dip)
'	
'	Dim img As Image=SetFontToBitmap(Chr(0xf072),CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgPlus, img, "Códigos Productos Incluidos", "CodigosProductosIncluidos",40dip)
'	
'	Dim img As Image=SetFontToBitmap(Chr(0xf072), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgMinus,img, "Codigos Productos Excluidos", "CodigosProductosExcluidos",40dip)
'
'	'Dim img As Image=MaterialIconsToBitmap(Chr(0xF247),24, xui.Color_White)
'	Dim img As Image=SetFontToBitmap(Chr(0xf2c3), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgPlus, img, "Grupos Contables Producto Incluidos", "GruposContablesIncluidos",40dip)
'	
'	'Dim img As Image=MaterialIconsToBitmap(Chr(0xF248),24, xui.Color_White)
'	Dim img As Image=SetFontToBitmap(Chr(0xf2c3), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgMinus, img, "Grupos Contables Excluidos", "GruposContablesIncluidos",40dip)
'	
'	'Dim img As Image=MaterialIconsToBitmap(Chr(0xF247),24, xui.Color_White)
'	Dim img As Image=SetFontToBitmap(Chr(0xfd19), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgPlus, img, "Rutas Incluidas", "RutasIncluidas",40dip)
'	
'	'Dim img As Image=MaterialIconsToBitmap(Chr(0xF248),24, xui.Color_White)
'	Dim img As Image=SetFontToBitmap(Chr(0xfd19), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgMinus, img, "Rutas Excluidas", "RutasExcluidas",40dip)
'	
'	'Dim img As Image=MaterialIconsToBitmap(Chr(0xF247),24, xui.Color_White)
'	Dim img As Image=SetFontToBitmap(Chr(0xfa6a), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgPlus, img, "Incluir Rutas con Operación Corte", "IncluirRutasConOperacionCorte",40dip)
'	
'	'Dim img As Image=MaterialIconsToBitmap(Chr(0xF248),24, xui.Color_White)
'	Dim img As Image=SetFontToBitmap(Chr(0xfa6a), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(imgMinus, img, "Excluir Rutas con Operación Corte", "ExcluirRutasConOperacionCorte",40dip)
'
'	Dim img As Image=SetFontToBitmap(Chr(0xf6cf), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
'	Dim img2 As Image=SetFontToBitmap(Chr(0xf9c9), CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_White)
'	AddItemCLVDrawer2Img(img, img2, "Ver Artículos Análisis", "Ver Artículos Análisis",40dip)
'
'	'clvDrawer.AddTextItem("","")
'
'
'End Sub
'
''Private Sub imvMenuDrawerItem_MouseReleased (EventData As MouseEvent)
''	Dim sdr As B4XView=Sender
''	AccionDrawerMenuItem(sdr)
''End Sub
''
''Private Sub lblTextoDrawerMenuItem_MouseReleased (EventData As MouseEvent)
''	Dim sdr As B4XView=Sender
''	AccionDrawerMenuItem(sdr)
''End Sub
''
''Private Sub pnlFondoDrawerMenuItem_MouseReleased (EventData As MouseEvent)
''	Dim sdr As B4XView=Sender
''	AccionDrawerMenuItem(sdr)
''End Sub
'
'Sub clvDrawer_ItemClick (Index As Int, Value As Object)
''	#if debug
''	Log("ValueClvDrawer: " & Value)
''	#End If
''	
''	Select Case Value
''		Case ""
''			Return
''		Case "Salir"
''			SalirModulo
''		Case "Cerrar Menú"
''			Drawer.LeftOpen=False
''			Return
''		Case "EditarDescripcion"
''			EditarDescripcion
''			
''		Case "ActualizarDatos"
''			ActualizarDatos
''		
''		Case "TarifasIncluidas"
''			TarifasIncluidas
''		Case "VerTarifasAnalisis"
''			VerTarifasAnalisis
''	End Select
''	Drawer.LeftOpen=False
'End Sub
'
'''''''Description: Set TreeItem text to some color you want.
'''''''Tag: TreeItem, color, font size
''''''Sub TreeViewItemSetColorImage(ti As TreeItem, Color As Paint, FontSize As Int, dir As String, img As String)
''''''	Dim ft As Font = fx.DefaultFont(FontSize)
''''''	Dim text As String = ti.Text
''''''	Dim tf As TextFlow
''''''	tf.Initialize
''''''	tf.AddImage(dir,img).AddText(" ")
''''''	tf.AddText(text).SetColor(Color).SetFont(ft)
''''''	Dim jo As JavaObject = ti
''''''	Dim p As Pane = tf.CreateTextFlow
''''''	p.Tag = ti.text
''''''	jo.RunMethod("setGraphic", Array(p))
''''''End Sub
''''''
''''''Public Sub AddImage(dir As String, img As String) As TextFlow
''''''	Dim simg As Image = fx.LoadImage(dir,img)
''''''	Dim uri As ImageView
''''''	uri.Initialize("")
''''''	uri.SetImage(simg)
''''''	uri.SetLayoutAnimated(0,0,0,16,16)
''''''	texts.Add(uri)
''''''	Return Me
''''''End Sub
''''''
''''''public Sub AddImage1(img As Image, imgw As Double, imgh As Double) As TextFlow
''''''	Dim uri As ImageView
''''''	uri.Initialize("")
''''''	uri.SetImage(img)
''''''	uri.SetLayoutAnimated(0,0,0,imgw,imgh)
''''''	texts.Add(uri)
''''''	Return Me
''''''End Sub
'
'
'
'Private Sub lblIconCerrarDrawer_MouseClicked (EventData As MouseEvent)
'	Drawer.LeftOpen=False
'End Sub
'
'Private Sub lblTextoCerrarDrawer_MouseClicked (EventData As MouseEvent)
'	Drawer.LeftOpen=False
'End Sub
'
'Private Sub pnlTopDrawerLeft_MouseClicked (EventData As MouseEvent)
'	Drawer.LeftOpen=False
'End Sub
'
'#End Region

Sub Inicio

	jamLoadingIndicator1.MensajeLoading="Cargando datos Análisis Tarifas Venta " & mCodigoAnalisisTarifasVenta & "..."
	jamLoadingIndicator1.Show
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then 
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	
	DescripcionAnalisis=mData.Get("DescripcionAnalisis")
	FechaReferenciaCoste=mData.Get("FechaReferenciaCosteLong")
	
	
	Dim FechasSinDatos As Boolean
	Dim NuevaFechaInicialVentasLong As Long
	Dim NuevaFechaFinalVentasLong As Long
	If 0=mData.Get("FechaInicialVentasLong") Then
		FechasSinDatos=True
		NuevaFechaInicialVentasLong=DateUtils.SetDate(DateTime.GetYear(DateTime.Now)-1,DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now))
	End If
	If 0=mData.Get("FechaFinalVentasLong") Then
		FechasSinDatos=True
		NuevaFechaFinalVentasLong=DateTime.now
	End If
	
	If FechasSinDatos Then

		Wait For(RegistrarEdicionDatosCabecera(DescripcionAnalisis,NuevaFechaInicialVentasLong,NuevaFechaFinalVentasLong,FechaReferenciaCoste)) complete (mRes As Map)
		Dim Accion As String=mRes.Get("Accion")
		If Accion="NOK" Then
			jamLoadingIndicator1.Close
			SalirModulo
			 Return
		End If
		
		wait for (ActualizarCabecera) complete (mRes As Map)
		Dim Accion As String=mRes.Get("Accion")
		If Accion="NOK" Then
			jamLoadingIndicator1.Close
			SalirModulo
			Return 
		End If
		Dim mData As Map=mRes.Get("mData")
	End If
	
	RefrescarDatosCabecera(mData)

	
''	wait for (CargaTiposDelimitacionAnalisis) complete (mRes As Map)
''	Dim Accion As String=mRes.Get("Accion")
''	If Accion<>"OK" Then
''		SalirModulo
''		Return
''	End If
	
	'DeshabilitarOpcionesDelimitacionAnalisis
	
	
	
	wait for (CargarSistemasReposicionAnalisis) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	Select Accion
		Case "NOK"
			jamLoadingIndicator1.Close
			SalirModulo
			Return

		Case "SinSistemasReposicion"
			wait for (AddTodosSistemasReposicionAnalisis) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then
				jamLoadingIndicator1.Close
				SalirModulo
				Return
			Else
				'mSistemasReposicionAnalisis="TODOS"
			End If

		Case "OK"
			'mSistemasReposicionAnalisis=""
			Dim lstSistRepo As List=mRes.Get("lstReg")
			Dim SRCompra As Boolean=False
			Dim SRFab As Boolean=False
			For Each m As Map In lstSistRepo
				Dim SistR As Int=m.Get("SistemaReposicion")
				Select Case SistR
					Case 0
						SRCompra=True
					Case 1
						SRFab=True
				End Select
			Next
			Select True
				Case SRCompra And Not(SRFab)
					'mSistemasReposicionAnalisis="COMPRA"
				Case Not(SRCompra) And SRFab
					'mSistemasReposicionAnalisis="FABRICACION"
				Case SRCompra And SRFab
					'mSistemasReposicionAnalisis="TODOS"
				Case Else 
					jamLoadingIndicator1.Close
					Dim msa As Object=xui.MsgboxAsync("Sin sistemas de reposición asignados !.","Error")
					Wait For (msa) Msgbox_Result
					SalirModulo
					Return
			End Select

	End Select
	
'''	wait for (CargaListaGRCsAnalisisTarifasVenta) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	If Accion="NOK" Then
'''		SalirModulo
'''		Return
'''	End If
'''	
'''	If mSQL.ExecQuerySingleResult("select count(*) from tblAnalisisTarifasListaGRCs where GRCAnalisis=1")=0 Then
'''		Dim msa As Object=xui.MsgboxAsync("No se ha configurado ningún Grupo Contable Producto." & CRLF & "Es necesario que haya al menos uno.","Aviso")
'''		Wait For (msa) Msgbox_Result
'''		
'''		Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'''		Wait For (msa) Msgbox_Result (rInt As Int)
'''		If rInt=xui.DialogResponse_Positive Then
'''			jamTableViewListaTarifasIncluidas.AbrirCamposBuilder
'''			Return
'''		End If
'''	End If
	jamLoadingIndicator1.Close

	Drawer.LeftOpen=True
End Sub


#Region Cabecera
Sub ActualizarCabecera As ResumableSub

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="DatosCabAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No hay datos para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & ".","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
		End If
	End If
	Return mRes
End Sub

Sub RefrescarDatosCabecera(mData As Map)
'	For Each k As String In mData.Keys
'		Log(k)
'	Next
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtAnalisisTarifasVenta.Text=mData.Get("CodigoAnalisisTarifas")
	
	txtFechaCreacion.Text=DateTime.Date(mData.Get("FechaCreacion"))
	txtUsuarioCreacion.Text=mData.Get("UsuarioCreacion")
	
	DescripcionAnalisis=mData.Get("DescripcionAnalisis")
	txtDescripcion.Text=DescripcionAnalisis
	
	FechaInicialVentas=IIf(0=mData.Get("FechaInicialVentasLong"), _
		DateUtils.SetDate(DateTime.GetYear(DateTime.Now)-1,DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now)), _
		mData.Get("FechaInicialVentasLong"))
	FechaFinalVentas=IIf(0=mData.Get("FechaFinalVentasLong"),DateTime.Now,mData.Get("FechaFinalVentasLong"))
	
	
	
	
	FechaReferenciaCoste=mData.Get("FechaReferenciaCosteLong")
	
	txtFechaModificacion.Text=DateTime.Date(mData.Get("FechaModificacion"))
	txtUsuarioModificacion.Text=mData.Get("UsuarioModificacion")
	txtFechaInicioVentas.Text=DateTime.Date(FechaInicialVentas)
	txtFechaFinalVentas.Text=DateTime.Date(FechaFinalVentas)
	txtFechaReferenciaCoste.Text=IIf(FechaReferenciaCoste=0,"20/11/2017",DateTime.Date(FechaReferenciaCoste))

	
	
	txtEstadoAnalisisTarifas.Text=mData.Get("Estado")
	If mData.Get("Estado")="Abierto" Then
		txtEstadoAnalisisTarifas.Color=0xFF7FFF00
		txtEstadoAnalisisTarifas.TextColor=xui.Color_Black
	Else
		txtEstadoAnalisisTarifas.Color=0xFFFF4500
		txtEstadoAnalisisTarifas.TextColor=xui.Color_White
	End If
	
	TreeItemFechas.Text="Selección Fechas Datos Ventas" & CRLF & _
		"Periodo Configurado: " & DateTime.Date(FechaInicialVentas) & _
	 	"-" & DateTime.Date(FechaFinalVentas)
		
	DateTime.DateFormat=DateFormatAnt
	
	
End Sub

Sub CargaTiposDelimitacionAnalisis As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasTiposFiltradoDelimitacion")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasTiposDelimitacionAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & ".","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasTiposFiltradoDelimitacion",lstReg)
		End If
	End If
	Return mRes
End Sub



Private Sub btnEditarDescripcionAnalisisCab_Click
	EditarDescripcion
End Sub

Sub EditarDescripcion
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
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
	
	b4xInputDlg.Text=txtDescripcion.Text
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
	
	Wait For(RegistrarEdicionDatosCabecera(NuevaDescripcion,FechaInicialVentas,FechaFinalVentas,FechaReferenciaCoste)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
End Sub

Sub ActualizarInfoGeneralFichaAnalisis
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabeceraTreeViewMenu(mData)
End Sub

Sub RefrescarDatosCabeceraTreeViewMenu(mData As Map)
'	For Each k As String In mData.Keys
'		Log(k)
'	Next
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("Información Análisis de Tarifas actual: ").Append(CRLF).Append(CRLF)
	sb.Append("ID: ").Append(mIDAnalisisTarifasVenta).Append("  ")
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	'txtAnalisisTarifasVenta.Text=mData.Get("CodigoAnalisisTarifas")
	sb.Append("Código: ").Append(mData.Get("CodigoAnalisisTarifas")).Append(CRLF)
	'txtFechaCreacion.Text=DateTime.Date(mData.Get("FechaCreacion"))
	'sb.Append("FechaCreacion: ").Append(DateTime.Date(mData.Get("FechaCreacion"))).Append(CRLF)
	'txtUsuarioCreacion.Text=mData.Get("UsuarioCreacion")
	sb.Append("Descripción: ").Append(mData.Get("DescripcionAnalisis")).Append(CRLF).Append(CRLF)
	sb.Append("Creado por: ").Append(mData.Get("UsuarioCreacion")).Append(" en ").Append(DateTime.Date(mData.Get("FechaCreacion"))).Append(CRLF).Append(CRLF)
	'DescripcionAnalisis=mData.Get("DescripcionAnalisis")
	'txtDescripcion.Text=DescripcionAnalisis

	FechaInicialVentas=IIf(0=mData.Get("FechaInicialVentasLong"), _
		DateUtils.SetDate(DateTime.GetYear(DateTime.Now)-1,DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now)), _
		mData.Get("FechaInicialVentasLong"))
	FechaFinalVentas=IIf(0=mData.Get("FechaFinalVentasLong"),DateTime.Now,mData.Get("FechaFinalVentasLong"))
	'FechaReferenciaCoste=mData.Get("FechaReferenciaCosteLong")
	'sb.Append("Modificado por: ").Append(mData.Get("UsuarioModificacion")).Append(" en ").Append(DateTime.Date(mData.Get("FechaModificacion"))).Append(CRLF)
	'txtFechaModificacion.Text=DateTime.Date(mData.Get("FechaModificacion"))
	'txtUsuarioModificacion.Text=mData.Get("UsuarioModificacion")
	txtFechaInicioVentas.Text=DateTime.Date(FechaInicialVentas)
	txtFechaFinalVentas.Text=DateTime.Date(FechaFinalVentas)
	'txtFechaReferenciaCoste.Text=IIf(FechaReferenciaCoste=0,"20/11/2017",DateTime.Date(FechaReferenciaCoste))
	sb.Append("Periodo Datos Ventas: ").Append(DateTime.Date(FechaInicialVentas)).Append(" - ").Append(DateTime.Date(FechaFinalVentas)).Append(CRLF).Append(CRLF)

	'txtEstadoAnalisisTarifas.Text=mData.Get("Estado")
	If mData.Get("Estado")="Abierto" Then
		txtEstadoAnalisisTarifas.Color=0xFF7FFF00
		txtEstadoAnalisisTarifas.TextColor=xui.Color_Black
	Else
		txtEstadoAnalisisTarifas.Color=0xFFFF4500
		txtEstadoAnalisisTarifas.TextColor=xui.Color_White
	End If
	
	sb.Append("Estado: ").Append(mData.Get("Estado")).Append(".")
	

	
	TreeItemFechas.Text="Selección Fechas Datos Ventas" & CRLF & _
		"Periodo Configurado: " & DateTime.Date(FechaInicialVentas) & _
	 	"-" & DateTime.Date(FechaFinalVentas)
		
	DateTime.DateFormat=DateFormatAnt
	
	Dim msa As Object=xui.MsgboxAsync(sb.ToString,"Información general Análisis Tarifas actual")
	Wait For (msa) Msgbox_Result
End Sub

#End Region


#Region Parametros
Sub EditarFechasVentas
	wait for (EditarFechaInicialVentas) complete (rBool As Boolean)
	If Not(rBool) Then Return
	wait for (EditarFechaFinalVentas) complete (rBool As Boolean)
	If Not(rBool) Then Return
End Sub


Private Sub btnSelFechaInicialVentas_Click
	EditarFechaInicialVentas
End Sub

Sub EditarFechaInicialVentas As ResumableSub
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
	
	Dialog.Title="Indica Fecha Inicial Ventas"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaInicialVentas=0 Then
		B4XDateDlg.Date=DateTime.DateParse("01/01/2017")
	Else
		B4XDateDlg.Date=FechaInicialVentas
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

	If rInt<>xui.DialogResponse_Positive Then
		Return False
	End If
	Dim NuevaFechaInicialVentas As Long=B4XDateDlg.Date

	Wait For(RegistrarEdicionDatosCabecera(DescripcionAnalisis,NuevaFechaInicialVentas,FechaFinalVentas,FechaReferenciaCoste)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return False
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
	Return True
End Sub

Private Sub btnSelFechaFinalVentas_Click
	EditarFechaFinalVentas
End Sub

Sub EditarFechaFinalVentas As ResumableSub
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
	
	Dialog.Title="Indica Fecha Final Ventas"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaFinalVentas=0 Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=FechaFinalVentas
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

	If rInt<>xui.DialogResponse_Positive Then
		Return False
	End If
	Dim NuevaFechaFinalVentas As Long=B4XDateDlg.Date

	Wait For(RegistrarEdicionDatosCabecera(DescripcionAnalisis,FechaInicialVentas,NuevaFechaFinalVentas,FechaReferenciaCoste)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return False
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
	Return True
End Sub


Private Sub btnSelFechaReferenciaCoste_Click
	EditarFechaReferenciaCoste
End Sub


Sub EditarFechaReferenciaCoste
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
	
	Dialog.Title="Indica Fecha Final Ventas"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaInicialVentas=0 Then
		B4XDateDlg.Date=DateTime.DateParse("01/01/2017")
	Else
		B4XDateDlg.Date=FechaInicialVentas
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

	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	Dim NuevaFechaReferenciaCoste As Long=B4XDateDlg.Date

	Wait For(RegistrarEdicionDatosCabecera(DescripcionAnalisis,FechaInicialVentas,FechaFinalVentas,NuevaFechaReferenciaCoste)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	wait for (ActualizarCabecera) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mData")
	RefrescarDatosCabecera(mData)
End Sub
#End Region

Sub RegistrarEdicionDatosCabecera(DescAn As String, FechInVtas As Long, FechFinVtas As Long, FechaRefCoste As Long) As ResumableSub

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="EditarDatosCabAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,DescAn,FechInVtas,FechFinVtas,FechaRefCoste, _ 
		Main.DatosUsuario.NombreADUsuarioWindows, DateTime.Now),Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			' este caso no se puede dar. Siempre debe devolver OK o ERROR ...
			Accion="NOK"
			mRes.Put("Accion", Accion)
			jamLoadingIndicator1.Close
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				jamLoadingIndicator1.Close
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub







Sub ActualizarDatos
	Wait For(ActualizarListaTarifasAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	
End Sub

'#Region DelimitacionAnalisis
'Sub DefinirTipoDelimitacionAnalisis
'	
'	wait for (CargaTiposDelimitacionAnalisis) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion<>"OK" Then Return
'	Dim mDataPrev As Map=mRes.Get("mData")
'	Dim mData As Map
'	mData.Initialize
'	For Each k In mDataPrev.Keys
'		If k<>"IDAnalisisTarifas" Then
'			If True=mDataPrev.Get(k) Then 
'				mData.Put(k,1)
'			Else
'				mData.Put(k,0)
'			End If
'		Else
'			mData.Put(k,mDataPrev.Get(k))
'		End If
'	Next
'	
'	jFRegTipoDelimitacion.Initialize(Me,"jFRegTipoDelimitacion",frm,"Definición Tipo Delimitación Análisis","Editar","EditarAnalisisTarifasTiposFiltradoDelimitacionJamFormRegistro.json",mData)
'End Sub
'
'Sub jFRegTipoDelimitacion_AfterFormLoad
'	jFRegTipoDelimitacion.AsignarToolTipInfoCampo("TarifasVenta","Seleccionando este campo, se habilitará la delimitación del análisis por Tarifas de Venta. Si no se marca, el análisis se aplicará a TODAS las tarifas de venta de Navision.",True)
'	jFRegTipoDelimitacion.AsignarToolTipInfoCampo("CodigosArticulo","Seleccionando este campo, se habilitará la delimitación del análisis por Códigos de Artículos. Si no se marca, el análisis se aplicará a TODOS los artículos de navision.",True)
'	jFRegTipoDelimitacion.AsignarToolTipInfoCampo("SistemaReposicion","Seleccionando este campo, se habilitará la delimitación del análisis por Sistema de Reposición (Compra/Fabricacion). Si no se marca, el análisis se aplicará a TODOS los sistemas de reposición.",True)
'	jFRegTipoDelimitacion.AsignarToolTipInfoCampo("Rutas","Seleccionando este campo, se habilitará la delimitación del análisis por Rutas de Produccion. Si no se marca, el análisis se aplicará a TODAS las Rutas (incluyendo la ruta vacía (sistema de reposicion=Compra) de navision.",True)
'	jFRegTipoDelimitacion.AsignarToolTipInfoCampo("GruposContablesProducto","Seleccionando este campo, se habilitará la delimitación del análisis por Grupos Contables Producto. Si no se marca, el análisis se aplicará a TODOS los grupos contables producto de navision.",True)
'
'End Sub
'
'Sub jFRegTipoDelimitacion_GrabarEdicionRegistro(lstInfoCampoJamFormRegistro As List)
'	Dim TarifasVenta As Int
'	Dim CodigosArticulo As Int
'	Dim SistemaReposicion As Int
'	Dim Rutas As Int
'	Dim GruposContablesProducto As Int
'	Dim NumFiltrosOn As Int
'	For Each iFR As InfoCampoJamFormRegistro In lstInfoCampoJamFormRegistro
'		Log(iFR)
'
'		Select Case iFR.CampoSQL
'			Case "TarifasVenta"
'				TarifasVenta=iFR.ValorOutputCampo
'				NumFiltrosOn=(NumFiltrosOn+iFR.ValorOutputCampo)
'			Case "CodigosArticulo"
'				CodigosArticulo=iFR.ValorOutputCampo
'				NumFiltrosOn=(NumFiltrosOn+iFR.ValorOutputCampo)
'			Case "SistemaReposicion"
'				SistemaReposicion=iFR.ValorOutputCampo
'				NumFiltrosOn=(NumFiltrosOn+iFR.ValorOutputCampo)
'			Case "Rutas"
'				Rutas=iFR.ValorOutputCampo
'				NumFiltrosOn=(NumFiltrosOn+iFR.ValorOutputCampo)
'			Case "GruposContablesProducto"
'				GruposContablesProducto=iFR.ValorOutputCampo
'				NumFiltrosOn=(NumFiltrosOn+iFR.ValorOutputCampo)
'		End Select
'	Next
'	If NumFiltrosOn=0 Then
'		Dim msa As Object=xui.MsgboxAsync("Es obligatorio marcar al menos una de las opciones.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	Dim cmd As DBCommand = JRDCQuery.CreateCommand("AnalisisTarifasEditarTiposDelimitacionAnalisis", _
'		Array(TarifasVenta,CodigosArticulo,SistemaReposicion,Rutas,GruposContablesProducto, mIDAnalisisTarifasVenta))
'
'	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (Success As Boolean)
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar los tipos de delimitación del análisis de tarifas.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	jFRegTipoDelimitacion.CerrarFormRegistro
'	
'	wait for (CargaTiposDelimitacionAnalisis) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion<>"OK" Then
'		SalirModulo
'		Return
'	End If
'	
'End Sub
'
'
'Sub CargaMapaValoresDelimitacion As Map
'	Dim mDataDelimitacion As Map=DBUtils.ExecuteMap(mSQL,"select * from tblAnalisisTarifasTiposFiltradoDelimitacion",Null)
'	Return mDataDelimitacion
'End Sub

'#End Region



#Region Tarifas

Sub CargarListaTarifasAnalisisTarifasIncluidas As ResumableSub
	mSQL.ExecNonQuery("delete from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaTarifasAnalisisTarifasIncluidas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinTarifasIncluidas"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				jamLoadingIndicator1.Close
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tbl_PROIN_AnalisisTarifasListaTarifasInclusiones",lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub CargarListaTarifasAnalisisTarifasExcluidas As ResumableSub
	mSQL.ExecNonQuery("delete from tbl_PROIN_AnalisisTarifasListaTarifasExclusiones")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaTarifasAnalisisTarifasExcluidas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas excluidas para este Análisis de Tarifas Venta.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinTarifasExcluidas"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tbl_PROIN_AnalisisTarifasListaTarifasExclusiones",lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub ActualizarListaTarifasAnalisisTarifas As ResumableSub
	
	mSQL.ExecNonQuery("delete from tbl_PROIN_AnalisisTarifasListaTarifas")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaTarifasSeleccionadasAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then 
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then    
			Dim msa As Object=xui.MsgboxAsync("No hay tarifas seleccionadas para este Análisis de Tarifas.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinTarifas"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tbl_PROIN_AnalisisTarifasListaTarifas",lstReg)
				mSQL.ExecNonQuery2("update tbl_PROIN_AnalisisTarifasListaTarifas set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
			End If
		End If
	End If
	Return mRes
End Sub


Sub ActualizarInfoUltimaModificacionListaTarifasAnalisisTarifas As ResumableSub

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaTarifasAnalisisTarifasInfoUltimaActualizacion"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,mIDAnalisisTarifasVenta,mIDAnalisisTarifasVenta,mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay información de última modificación en la selección de tarifas para este Análisis de Tarifas.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinUltimaModificacion"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub TarifasIncluidas
	If Navegando=False Then
		lstHistorial.Add("TarifasIncluidas")
	End If
	'MostrarJamTableView(pnljamTableViewListaTarifasAnalisis)
	If pnljamTableViewListaTarifasIncluidas.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaTarifasIncluidas")
		Sleep(0)
		
		Dim rSub As ResumableSub=jamTableViewListaTarifasIncluidas.ConfigurarTableView("ListaAnalisisTarifasListaTarifasIncluidas.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaTarifasIncluidas.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaTarifasIncluidas.CellFactory_ColumnaFecha
		jamTableViewListaTarifasIncluidas.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaTarifasIncluidas.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaTarifasIncluidas.SetCellFactory(dCF)
		
		jamTableViewListaTarifasIncluidas.EstadoMenuItem(jamTableViewListaTarifasIncluidas.MenuBarLinea,False)
		
		jamTableViewListaTarifasIncluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Tarifas a Lista de Tarifas Incluidas","AddTarifasAListaTarifasIncluidas",Chr(0xF196),jamTableViewListaTarifasIncluidas.MenuBarAcciones)
		jamTableViewListaTarifasIncluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaTarifasIncluidas.MenuBarAcciones)
		jamTableViewListaTarifasIncluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaTarifasIncluidas.MenuBarAcciones)
		jamTableViewListaTarifasIncluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Tarifas Seleccionadas de la Lista de Tarifas Incluidas","QuitarTarifasSeleccionadasListaIncluidas",Chr(0xF196),jamTableViewListaTarifasIncluidas.MenuBarAcciones)
		
		jamTableViewListaTarifasIncluidas.AddContextMenuItemFontAwesomeText("Quitar Tarifa de la Lista de Tarifas Incluidas","QuitarTarifadeListaTarifasIncluidas",Chr(0xF196))
	End If
	pnljamTableViewListaTarifasIncluidas.BringToFront
	lblInfoMostrada.Text="Tarifas Incluidas"
	
	
	Wait For(CargarListaTarifasAnalisisTarifasIncluidas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinTarifasIncluidas" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para este Análisis de Tarifas." & CRLF & _
				"Por tanto, se seleccionarán TODAS las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones order by [TipoTarifa],[CodigoTarifa]")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasIncluidas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasIncluidas.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaTarifasIncluidas.SetPlaceholderText("")
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub


Sub TarifasExcluidas
	If Navegando=False Then
		lstHistorial.Add("TarifasExcluidas")
	End If
	If pnljamTableViewListaTarifasExcluidas.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaTarifasExcluidas")
		Sleep(0)
		
		Dim rSub As ResumableSub=jamTableViewListaTarifasExcluidas.ConfigurarTableView("ListaAnalisisTarifasListaTarifasExcluidas.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaTarifasExcluidas.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaTarifasExcluidas.CellFactory_ColumnaFecha
		jamTableViewListaTarifasExcluidas.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaTarifasExcluidas.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaTarifasExcluidas.SetCellFactory(dCF)
		
		jamTableViewListaTarifasExcluidas.EstadoMenuItem(jamTableViewListaTarifasExcluidas.MenuBarLinea,False)
		
		jamTableViewListaTarifasExcluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Tarifas a Lista de Tarifas Excluidas","AddTarifasAListaTarifasExcluidas",Chr(0xF196),jamTableViewListaTarifasExcluidas.MenuBarAcciones)
		jamTableViewListaTarifasExcluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaTarifasExcluidas.MenuBarAcciones)
		jamTableViewListaTarifasExcluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaTarifasExcluidas.MenuBarAcciones)
		jamTableViewListaTarifasExcluidas.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Tarifas Seleccionadas de la Lista de Tarifas Excluidas","QuitarTarifasSeleccionadas",Chr(0xF196),jamTableViewListaTarifasExcluidas.MenuBarAcciones)
		
		jamTableViewListaTarifasExcluidas.AddContextMenuItemFontAwesomeText("Quitar Tarifa de la Lista de Tarifas Excluidas","QuitarTarifadeListaTarifasExcluidas",Chr(0xF196))
	End If
	pnljamTableViewListaTarifasExcluidas.BringToFront
	lblInfoMostrada.Text="Tarifas Excluidas"
	
	
	Wait For(CargarListaTarifasAnalisisTarifasExcluidas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinTarifasExcluidas" Then
'		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas excluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Por tanto, se seleccionarán TODAS las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasExclusiones order by [TipoTarifa],[CodigoTarifa]")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasExcluidas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasExcluidas.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaTarifasExcluidas.SetPlaceholderText("")
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub


Sub VerTarifasAnalisis
	If Navegando=False Then
		lstHistorial.Add("VerTarifasAnalisis")
	End If
	'MostrarJamTableView(pnljamTableViewListaTarifasAnalisis)
	If pnljamTableViewListaTarifasAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaTarifasAnalisis")
		Sleep(0)

		Dim rSub As ResumableSub=jamTableViewListaTarifasAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaTarifasAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaTarifasAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

'		Dim CF As DatosCellFactoryJamTableView
'		CF.Initialize
'		CF.NombreFuncionCellFactory=jamTableViewListaTarifasAnalisis.CellFactory_ColumnaFecha
'		jamTableViewListaTarifasAnalisis.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaTarifasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaTarifasAnalisis.SetCellFactory(dCF)
		
		jamTableViewListaTarifasAnalisis.EstadoMenuItem(jamTableViewListaTarifasAnalisis.MenuBarAcciones,False)
		jamTableViewListaTarifasAnalisis.EstadoMenuItem(jamTableViewListaTarifasAnalisis.MenuBarLinea,False)
		
		'jamTableViewListaTarifasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Tarifas","IncluirTarifas",Chr(0xF196),jamTableViewListaTarifasAnalisis.MenuBarAcciones)
		'jamTableViewListaTarifasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaTarifasAnalisis.MenuBarAcciones)
		'jamTableViewListaTarifasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaTarifasAnalisis.MenuBarAcciones)
		'jamTableViewListaTarifasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Tarifas Seleccionadas","ExcluirTarifasSeleccionadas",Chr(0xF196),jamTableViewListaTarifasAnalisis.MenuBarAcciones)
		
		'jamTableViewListaTarifasAnalisis.AddContextMenuItemFontAwesomeText("Excluir Tarifa","ExcluirTarifa",Chr(0xF196))
	End If
	pnljamTableViewListaTarifasAnalisis.BringToFront
	lblInfoMostrada.Text="Tarifas Analizadas"
	
	
	Wait For(ActualizarListaTarifasAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifas order by [TipoTarifa],[CodigoTarifa]")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasAnalisis.AbrirCamposBuilder
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
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")

'''	Wait For(ActualizarInfoUltimaModificacionListaTarifasAnalisisTarifas) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	Select Case Accion
'''		Case "NOK"
'''			Return
'''		Case "SinUltimaModificacion"
'''			jamTableViewListaTarifasAnalisis.TextoPanelInfoJamTableView="Sin información de última actualización en las tarifas seleccionadas."
'''		Case "OK"
'''			Dim lstReg As List=mRes.Get("lstReg")
'''			Dim mData As Map=lstReg.Get(0)
'''			Dim DateFormatAnt As String=DateTime.DateFormat
'''			DateTime.DateFormat="dd/MM/yyyy"
'''			Dim sFechaUltimaModif As String=DateTime.Date(mData.Get("FechaActualizacionLong"))
'''			Dim sUsuarioUltimaModif As String=mData.Get("UsuarioActualizacion")
'''			jamTableViewListaTarifasAnalisis.TextoPanelInfoJamTableView="Ultima modificación en la selección de tarifas: " & sFechaUltimaModif & "  usuario: " & sUsuarioUltimaModif
'''			DateTime.DateFormat=DateFormatAnt
'''	End Select
	

	
End Sub

Sub jamTableViewListaTarifasAnalisis_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "SeleccionarTodos"
			SeleccionarTodos(True)
		Case "DeseleccionarTodos"
			SeleccionarTodos(False)
		Case "ExcluirTarifasSeleccionadas"
			ExcluirTarifasSeleccionadas
		Case "Actualizar"
			VerTarifasAnalisis
	End Select
End Sub

Sub SeleccionarTodos(Seleccionar As Boolean)
	Dim SelInt As Int
	If Seleccionar Then
		SelInt=1
	Else
		SelInt=0
	End If
	jamTableViewListaTarifasAnalisis.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(SelInt))
	mSQL.ExecNonQuery2("update tbl_PROIN_AnalisisTarifasListaTarifas set Seleccionado=?",Array As Object(SelInt))
	wait for(jamTableViewListaTarifasAnalisis.RefreshTableViewData) complete (rObj As Object)
End Sub

Sub jamTableViewListaTarifasAnalisis_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "Seleccionado"
			AlternarSeleccionado(DatosCeldaSeleccionada)
	End Select
	
End Sub

Sub AlternarSeleccionado(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			
		Case 1
			NuevoValor=0
	End Select
	jamTableViewListaTarifasAnalisis.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
End Sub



Sub jamTableViewListaTarifasAnalisis_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "ExcluirTarifa"
			Dim FilaSel As Int=jamTableViewListaTarifasAnalisis.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaTarifasAnalisis.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaTarifasAnalisis.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim NombreTipoTarifaSel As String=jamTableViewListaTarifasAnalisis.GetValorSQLCampoFila(FilaSel,"NombreTipoTarifa")
			Dim NombreTarifaSel As String=jamTableViewListaTarifasAnalisis.GetValorSQLCampoFila(FilaSel,"NombreTarifa")
			
			
			
	End Select
End Sub

Sub jamTableViewListaTarifasExcluidas_ContextMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "QuitarTarifadeListaTarifasExcluidas"
			Dim FilaSel As Int=jamTableViewListaTarifasExcluidas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As String=jamTableViewListaTarifasExcluidas.GetValorSQLCampoFila(FilaSel, "TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaTarifasExcluidas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			wait for(QuitarTarifaListaTarifasExcluidas(TipoTarifaSel, CodigoTarifaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			Wait For(CargarListaTarifasAnalisisTarifasExcluidas) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasExclusiones order by [TipoTarifa],[CodigoTarifa]")
	
			Dim rSub As ResumableSub=jamTableViewListaTarifasExcluidas.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaTarifasExcluidas.AbrirCamposBuilder
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

	End Select
End Sub

Sub jamTableViewListaTarifasExcluidas_MenuBarMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "AddTarifasAListaTarifasExcluidas"
			AddTarifasAListaTarifasExcluidas
		
		
	End Select
End Sub

Sub AddTarifasAListaTarifasExcluidas
	
	Dialog.Title="Selecciona método"
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
		
	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	If Opcion="Individual" Then
		AddTarifaIndividualATarifasExcluidas
	Else
		AddGrupoTarifasATarifasExcluidas
	End If
	
End Sub

Sub SeleccionarListaTarifasTipoTarifaNoExcluidas(TipoTarifaSel As Int) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaTarifasTipoTarifaNoExcluidasEnAnalisisVentaParaSeleccionar"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(TipoTarifaSel,mIDAnalisisTarifasVenta), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay tarifas restantes del tipo seleccionado para añadir a las incluidas.","Aviso")
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
				Accion="SinTarifas"
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub


Sub AddTarifaIndividualATarifasExcluidas
	
	Dialog.Title="Indica Tipo de Tarifa"
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
		
	Dim lstOpciones As List=Array As String("Cliente","Grupo de Precio")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	Dim NuevoTipoTarifa As Int
	If Opcion="Cliente" Then
		NuevoTipoTarifa=0
	Else
		NuevoTipoTarifa=1
	End If
	
	
	'**** B4XInputTemplate
'''	Dialog.Title="Indica Código Tarifa"
'''	Dialog.TitleBarHeight=60dip
'''	'Dialog.TitleBarFont = xui.CreateFont(Typeface.DEFAULT,20)
'''	Dim b4xInputDlg As B4XInputTemplate
'''	b4xInputDlg.Initialize
'''	b4xInputDlg.lblTitle.Text=""
'''	b4xInputDlg.TextField1.SetTextAlignment("TOP", "LEFT")
'''	
'''	'b4xInputDlg.mBase.Height = 150dip
'''	'b4xInputDlg.mBase.Width = 800dip
'''	b4xInputDlg.RegexPattern="^.{" & 1 & "," & 10 & "}$"
'''	'Dim et As B4XView = b4xInputDlg.TextField1
'''	'et.SingleLine = False
'''	'et.Height=60dip
'''	'et.Height = 120dip
'''	
'''	b4xInputDlg.Text=""
'''	Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xInputDlg,"OK","","Cancelar")
'''
'''	Dim btnOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'''	btnOK.Left=10dip
'''	btnOK.TextSize=14
'''
'''	Dim btnCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'''	btnCancel.Left=btnCancel.Left-30dip
'''	btnCancel.width=btnCancel.width+10dip
'''	btnCancel.SetTextAlignment("CENTER","RIGHT")
'''	btnCancel.TextSize=14
'''
'''	Wait For (rSub) complete (rInt As Int)
'''	If rInt=xui.DialogResponse_Cancel Then Return
'''
	'''	Dim NuevoCodigoTarifa As String=b4xInputDlg.Text.ToUpperCase
	
	' fin B4XInputTemplate
	
	Wait For(SeleccionarListaTarifasTipoTarifaNoExcluidas(NuevoTipoTarifa)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim lstTarifas As List=mRes.Get("lstReg")
	Dim lstIndiceTarifas As List
	lstIndiceTarifas.Initialize
	Dim lstOpciones As List
	lstOpciones.Initialize
	For Each mTar As Map In lstTarifas
		Dim CodigoTar As String=mTar.Get("CodigoTarifa")
		Dim NombreTarifa As String=mTar.Get("NombreTarifa")
		Dim sCodigoNombreTarifa As String=CodigoTar & ": " & NombreTarifa
		lstIndiceTarifas.Add(CodigoTar)
		lstOpciones.Add(sCodigoNombreTarifa)
	Next
	
	Dialog.Title="Selecciona Código Tarifa"
	Dialog.TitleBarHeight=50dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
	
	Dim B4XSearchListDlg As B4XSearchTemplate
	B4XSearchListDlg.Initialize
	B4XSearchListDlg.SetItems(lstOpciones)
	B4XSearchListDlg.SearchField.HintText="Buscar"
	B4XSearchListDlg.SearchField.Update
	B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XSearchListDlg,"","","Cancelar")
'		Dim btOKDlg As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'		btOKDlg.TextSize=14
	Dim btCancelDlg As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	btCancelDlg.TextSize=14
	'AnimateDialog(Dialog,"top")
	
'	Utilidades.SetLightThemeDialog(Dialog)
'	Utilidades.SetLightThemeSearch(B4XSearchListDlg)
	
	Dim TextSize As Float = 16 'FLOAT
	Dim xclv As CustomListView=B4XSearchListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	
	B4XSearchListDlg.Resize(600dip,0.75*Dialog.mParent.Height)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XSearchListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,60dip)
'	Next

	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
	Dim lblB4Xv As B4XView=dlbl
	lblB4Xv.SetTextAlignment("CENTER","LEFT")
	
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim sOpcionSel As String=B4XSearchListDlg.SelectedItem
	Dim IndexSel As Int=lstOpciones.IndexOf(sOpcionSel)
	Dim NuevoCodigoTarifa As String=lstIndiceTarifas.Get(IndexSel)
	
	Wait For(ExcluirTarifa(NuevoTipoTarifa, NuevoCodigoTarifa)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	Wait For(CargarListaTarifasAnalisisTarifasExcluidas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasExclusiones order by [TipoTarifa],[CodigoTarifa]")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasExcluidas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasExcluidas.AbrirCamposBuilder
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

End Sub

Sub AddGrupoTarifasATarifasExcluidas

	wait for(Utilidades.MsgBoxXUI("Aviso","Pendiente de programar...")) complete (rObj As Object)
	Return
	
	Dim B4XLongMsg As B4XLongTextTemplate
	B4XLongMsg.Initialize
	B4XLongMsg.Resize(600dip,500dip)
	Dim sbA As StringBuilder
	sbA.Initialize
	sbA.Append("Los datos deben ser copiados de una tabla con los encabezados siguientes:").Append(CRLF).Append(CRLF)
	sbA.Append("TipoTarifa").Append(CRLF)
	sbA.Append("CodigoTarifa").Append(CRLF).Append(CRLF)
	sbA.Append("No importa si los encabezados están en mayúsculas o minúsculas, ni el orden de las columnas.").Append(CRLF).Append(CRLF)
	sbA.Append("Los posibles valores para el campo TipoTarifa son:").Append(CRLF)
	sbA.Append("0 (=Cliente)").Append(CRLF)
	sbA.Append("1 (=Grupo de Precio)").Append(CRLF).Append(CRLF)
	sbA.Append("No debe haber lineas en blanco entre los datos.").Append(CRLF)
	
	B4XLongMsg.Text=sbA.ToString
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip

	Wait For(rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstEncabezadosTabla As List
	lstEncabezadosTabla.Initialize
	lstEncabezadosTabla.Add("TipoTarifa")
	lstEncabezadosTabla.Add("CodigoTarifa")

	Dim cjamPegarDatosTarifasExcluidas As jamPegarDatosPreview
	cjamPegarDatosTarifasExcluidas.Initialize(Me, frm.RootPane, lstEncabezadosTabla)
	cjamPegarDatosTarifasExcluidas.show
	Wait For(cjamPegarDatosTarifasExcluidas) jamPegarDatos_Done (lstCamposPegar As List)

End Sub

'Sub cjamPegarDatosTarifasExcluidas_Done(lstCamposPegar As List)
'
'	Log(lstCamposPegar)
'	Dim lstCommands As List
'	lstCommands.Initialize
'	For Each m As Map In lstCamposPegar
'		Log(m)
'		
'	Next
'
'	Do While rs.NextRow
'		Dim PatronSel As String=rs.GetString("Patron")
'		TallajeAsociadoPatron(PatronSel)
'		wait for TallajeAsociadoPatron_Completed ( Accion As String, lstRegPatr As List)
'		If Accion="Error" Then
'			Return
'		End If
'		If lstRegPatr.Size=0 Then
'			Dim cmd As DBCommand=JRDCQuery.CreateCommand("AsociarNuevoPatronTallajeBatch",Array(PatronSel,IDTallajeSel))
'		Else
'			Dim mPatr As Map=lstRegPatr.Get(0)
'			Dim IDPatronSel As Int=mPatr.Get("IDPatron")
'			Dim cmd As DBCommand=JRDCQuery.CreateCommand("EditarAsociacionPatronTallajeBatch",Array(IDTallajeSel,IDPatronSel))
'		End If
'		lstCommands.Add(cmd)
'	Loop
'	rs.Close
'	
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible excluir las tarifas seleccionadas.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'End Sub

Sub ExcluirTarifa(TipoTarifaSel As String, CodigoTarifaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirTarifa"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,TipoTarifaSel, CodigoTarifaSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub ExcluirTarifasSeleccionadas
	Dim SelCount As Int=jamTableViewListaTarifasAnalisis.FixNullInt(jamTableViewListaTarifasAnalisis.SQL.ExecQuerySingleResult2("select count(Seleccionado) from tblOrigenDatos where Seleccionado=?",Array As String(1)))
	If SelCount=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay ninguna tarifa seleccionada para excluir.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim msa As Object = xui.Msgbox2Async("¿Excluir tarifas seleccionadas?" & CRLF & CRLF & "(Hay " & SelCount & " tarifas seleccionadas)", "Confirma", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	

'	Dim lstCommands As List
'	lstCommands.Initialize
'	Dim rs As ResultSet=jamTableViewListaTarifasAnalisis.SQL.ExecQuery2("select * from tblOrigenDatos where Seleccionado=?",Array As String(1))
'	Do While rs.NextRow
'		Dim PatronSel As String=rs.GetString("Patron")
'		TallajeAsociadoPatron(PatronSel)
'		wait for TallajeAsociadoPatron_Completed ( Accion As String, lstRegPatr As List)
'		If Accion="Error" Then
'			Return
'		End If
'		If lstRegPatr.Size=0 Then
'			Dim cmd As DBCommand=JRDCQuery.CreateCommand("AsociarNuevoPatronTallajeBatch",Array(PatronSel,IDTallajeSel))
'		Else
'			Dim mPatr As Map=lstRegPatr.Get(0)
'			Dim IDPatronSel As Int=mPatr.Get("IDPatron")
'			Dim cmd As DBCommand=JRDCQuery.CreateCommand("EditarAsociacionPatronTallajeBatch",Array(IDTallajeSel,IDPatronSel))
'		End If
'		lstCommands.Add(cmd)
'	Loop
'	rs.Close
'
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible excluir las tarifas seleccionadas.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If

End Sub

Sub QuitarTarifaListaTarifasExcluidas(TipoTarifaSel As Int, CodigoTarifaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarTarifaListaTarifasExcluidas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,TipoTarifaSel, CodigoTarifaSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub


Sub SeleccionarTodasTarifasIncluidas(Seleccionar As Boolean)
	Dim SelInt As Int
	If Seleccionar Then
		SelInt=1
	Else
		SelInt=0
	End If
	jamTableViewListaTarifasIncluidas.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(SelInt))
	mSQL.ExecNonQuery2("update tbl_PROIN_AnalisisTarifasListaTarifasInclusiones set Seleccionado=?",Array As Object(SelInt))
	wait for(jamTableViewListaTarifasIncluidas.RefreshTableViewData) complete (rObj As Object)
End Sub

Sub jamTableViewListaTarifasIncluidas_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "Seleccionado"
			AlternarSeleccionadojamTableViewListaTarifasIncluidas(DatosCeldaSeleccionada)
	End Select
	
End Sub

Sub AlternarSeleccionadojamTableViewListaTarifasIncluidas(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim FilaSel As Int=jamTableViewListaTarifasIncluidas.GetIndiceFilaSeleccionada
	Dim TipoTarifaSel As String=jamTableViewListaTarifasIncluidas.GetValorSQLCampoFila(FilaSel, "TipoTarifa")
	Dim CodigoTarifaSel As String=jamTableViewListaTarifasIncluidas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			
		Case 1
			NuevoValor=0
	End Select
	'jamTableViewListaTarifasIncluidas.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(NuevoValor))
	mSQL.ExecNonQuery2("update tbl_PROIN_AnalisisTarifasListaTarifasInclusiones set Seleccionado=? where TipoTarifa=? and CodigoTarifa=?",Array As Object(NuevoValor, TipoTarifaSel,CodigoTarifaSel))
	jamTableViewListaTarifasIncluidas.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
End Sub


Sub jamTableViewListaTarifasIncluidas_MenuBarMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "AddTarifasAListaTarifasIncluidas"
			AddTarifasAListaTarifasIncluidas
		Case "SeleccionarTodos"
			SeleccionarTodasTarifasIncluidas(True)
		Case "DeseleccionarTodos"
			SeleccionarTodasTarifasIncluidas(False)
		Case "QuitarTarifasSeleccionadasListaIncluidas"
			QuitarTarifasSeleccionadasDeListaTarifasIncluidas
		Case "Actualizar"
			
	End Select
End Sub


Sub jamTableViewListaTarifasIncluidas_ContextMenuItem_Action(TagMenuItem As String)
	
	Select TagMenuItem
		Case "QuitarTarifadeListaTarifasIncluidas"
			Dim FilaSel As Int=jamTableViewListaTarifasIncluidas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As String=jamTableViewListaTarifasIncluidas.GetValorSQLCampoFila(FilaSel, "TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaTarifasIncluidas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			wait for(QuitarTarifaListaTarifasIncluidas(TipoTarifaSel, CodigoTarifaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			Wait For(CargarListaTarifasAnalisisTarifasIncluidas) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones order by [TipoTarifa],[CodigoTarifa]")
	
			Dim rSub As ResumableSub=jamTableViewListaTarifasIncluidas.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaTarifasIncluidas.AbrirCamposBuilder
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

	End Select
End Sub

Sub QuitarTarifaListaTarifasIncluidas(TipoTarifaSel As Int, CodigoTarifaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarTarifaListaTarifasIncluidas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,TipoTarifaSel, CodigoTarifaSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & "." & CRLF & CRLF & "No ha sido posible quitar el tipo tarifa " & TipoTarifaSel & "-Codigo Tarifa " & CodigoTarifaSel & " de la lista de tarifas incluidas.","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				jamLoadingIndicator1.Close
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & "." & CRLF & CRLF & "No ha sido posible quitar el tipo tarifa " & TipoTarifaSel & "-Codigo Tarifa " & CodigoTarifaSel & " de la lista de tarifas incluidas.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub

Sub QuitarTarifasSeleccionadasDeListaTarifasIncluidas
	
	Dim NumTarifasSel As Int=Utilidades.FixNullint(mSQL.ExecQuerySingleResult("select count(*) from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones where Seleccionado=1"))
	If NumTarifasSel=0 Then 
		wait for(Utilidades.MsgBoxXUI("Aviso","No hay lineas seleccionadas para quitar de la lista de tarifas incluidas.")) complete (rObj As Object)
		Return
	Else
		wait for(Utilidades.MsgBox2XUI("Confirma","¿Se han seleccionado " & NumTarifasSel & " tarifas para quitar de la lista de tarifas incluidas." & CRLF & CRLF & "¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	jamLoadingIndicator1.MensajeLoading="Quitando tarifas seleccionadas de la lista de tarifas incluidas..."
	jamLoadingIndicator1.Show
	Dim rsQuitarTarifasSeleccionadasDeIncluidas As ResultSet=mSQL.ExecQuery("select TipoTarifa, CodigoTarifa from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones where Seleccionado=1")
	Do While rsQuitarTarifasSeleccionadasDeIncluidas.NextRow
		Dim TipoTarifaSel As String=rsQuitarTarifasSeleccionadasDeIncluidas.GetString("TipoTarifa")
		Dim CodigoTarifaSel As String=rsQuitarTarifasSeleccionadasDeIncluidas.GetString("CodigoTarifa")
		wait for(QuitarTarifaListaTarifasIncluidas(TipoTarifaSel, CodigoTarifaSel)) complete (mRes As Map)
		Dim Accion As String=mRes.Get("Accion")
		If Accion<>"OK" Then
			jamLoadingIndicator1.Close
			Return
		End If
	Loop
	rsQuitarTarifasSeleccionadasDeIncluidas.Close
	
	jamLoadingIndicator1.MensajeLoading="Cargando lista de tarifas incluidas..."
	Wait For(CargarListaTarifasAnalisisTarifasIncluidas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	jamLoadingIndicator1.Close
	If Accion="NOK" Then Return
	


	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones order by [TipoTarifa],[CodigoTarifa]")
	
	If Accion="SinTarifasIncluidas" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para este Análisis de Tarifas." & CRLF & _
				"Por tanto, se seleccionarán TODAS las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
		Wait For (msa) Msgbox_Result
	End If
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasIncluidas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasIncluidas.AbrirCamposBuilder
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
End Sub

Sub AddTarifasAListaTarifasIncluidas
	
	Dialog.Title="Selecciona método"
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
		
	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	If Opcion="Individual" Then
		AddTarifaIndividualATarifasIncluidas
	Else
		AddGrupoTarifasATarifasIncluidas
	End If
	
End Sub

Sub SeleccionarListaTarifasTipoTarifaNoIncluidas(TipoTarifaSel As Int) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaTarifasTipoTarifaNoIncluidasEnAnalisisVentaParaSeleccionar"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(TipoTarifaSel,mIDAnalisisTarifasVenta), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then 
			Dim msa As Object=xui.MsgboxAsync("No hay tarifas restantes del tipo seleccionado para añadir a las incluidas.","Aviso")
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
				Accion="SinTarifas"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub AddTarifaIndividualATarifasIncluidas
	
	Dialog.Title="Indica Tipo de Tarifa"
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
		
	Dim lstOpciones As List=Array As String("Cliente","Grupo de Precio")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	Dim NuevoTipoTarifa As Int
	If Opcion="Cliente" Then
		NuevoTipoTarifa=0
	Else
		NuevoTipoTarifa=1
	End If
	
	
	'*** B4XInputTemplate
'	Dialog.Title="Indica Código Tarifa"
'	Dialog.TitleBarHeight=60dip
'	'Dialog.TitleBarFont = xui.CreateFont(Typeface.DEFAULT,20)
'	Dim b4xInputDlg As B4XInputTemplate
'	b4xInputDlg.Initialize
'	b4xInputDlg.lblTitle.Text=""
'	b4xInputDlg.TextField1.SetTextAlignment("TOP", "LEFT")
'	
'	'b4xInputDlg.mBase.Height = 150dip
'	'b4xInputDlg.mBase.Width = 800dip
'	b4xInputDlg.RegexPattern="^.{" & 1 & "," & 10 & "}$"
'	'Dim et As B4XView = b4xInputDlg.TextField1
'	'et.SingleLine = False
'	'et.Height=60dip
'	'et.Height = 120dip
'	
'	b4xInputDlg.Text=""
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xInputDlg,"OK","","Cancelar")
'
'	Dim btnOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	btnOK.Left=10dip
'	btnOK.TextSize=14
'
'	Dim btnCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	btnCancel.Left=btnCancel.Left-30dip
'	btnCancel.width=btnCancel.width+10dip
'	btnCancel.SetTextAlignment("CENTER","RIGHT")
'	btnCancel.TextSize=14
'
'	Wait For (rSub) complete (rInt As Int)
'	If rInt=xui.DialogResponse_Cancel Then Return
'	
'	Dim NuevoCodigoTarifa As String=b4xInputDlg.Text.ToUpperCase
	
	'**** fin B4XInputTemplate
	
	Wait For(SeleccionarListaTarifasTipoTarifaNoIncluidas(NuevoTipoTarifa)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim lstTarifas As List=mRes.Get("lstReg")
	Dim lstIndiceTarifas As List
	lstIndiceTarifas.Initialize
	Dim lstOpciones As List
	lstOpciones.Initialize
	For Each mTar As Map In lstTarifas
		Dim CodigoTar As String=mTar.Get("CodigoTarifa")
		Dim NombreTarifa As String=mTar.Get("NombreTarifa")
		Dim sCodigoNombreTarifa As String=CodigoTar & ": " & NombreTarifa
		lstIndiceTarifas.Add(CodigoTar)
		lstOpciones.Add(sCodigoNombreTarifa)
	Next
	
	Dialog.Title="Selecciona Código Tarifa"
	Dialog.TitleBarHeight=50dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
	
	Dim B4XSearchListDlg As B4XSearchTemplate
	B4XSearchListDlg.Initialize
	B4XSearchListDlg.SetItems(lstOpciones)
	B4XSearchListDlg.SearchField.HintText="Buscar"
	B4XSearchListDlg.SearchField.Update
	B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XSearchListDlg,"","","Cancelar")
'		Dim btOKDlg As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'		btOKDlg.TextSize=14
	Dim btCancelDlg As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	btCancelDlg.TextSize=14
	'AnimateDialog(Dialog,"top")
	
'	Utilidades.SetLightThemeDialog(Dialog)
'	Utilidades.SetLightThemeSearch(B4XSearchListDlg)
	
	Dim TextSize As Float = 16 'FLOAT
	Dim xclv As CustomListView=B4XSearchListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	
	B4XSearchListDlg.Resize(600dip,0.75*Dialog.mParent.Height)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XSearchListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,60dip)
'	Next

	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
	Dim lblB4Xv As B4XView=dlbl
	lblB4Xv.SetTextAlignment("CENTER","LEFT")
	
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim sOpcionSel As String=B4XSearchListDlg.SelectedItem
	Dim IndexSel As Int=lstOpciones.IndexOf(sOpcionSel)
	Dim NuevoCodigoTarifa As String=lstIndiceTarifas.Get(IndexSel)

	
	Wait For(IncluirTarifa(NuevoTipoTarifa, NuevoCodigoTarifa)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	Wait For(CargarListaTarifasAnalisisTarifasIncluidas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	If Accion="SinTarifasIncluidas" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para este Análisis de Tarifas." & CRLF & _
				"Por tanto, se seleccionarán TODAS las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
		Wait For (msa) Msgbox_Result
	End If
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones order by [TipoTarifa],[CodigoTarifa]")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasIncluidas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasIncluidas.AbrirCamposBuilder
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
End Sub

Sub IncluirTarifa(TipoTarifaSel As String, CodigoTarifaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirTarifa"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,TipoTarifaSel, CodigoTarifaSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If

		End If
	End If
	Return mRes
End Sub

Sub AddGrupoTarifasATarifasIncluidas
	
	Dim B4XLongMsg As B4XLongTextTemplate
	B4XLongMsg.Initialize
	B4XLongMsg.Resize(600dip,500dip)
	Dim sbA As StringBuilder
	sbA.Initialize
	sbA.Append("Los datos deben ser copiados de una tabla con los encabezados siguientes:").Append(CRLF).Append(CRLF)
	sbA.Append("TipoTarifa").Append(CRLF)
	sbA.Append("CodigoTarifa").Append(CRLF).Append(CRLF)
	sbA.Append("No importa si los encabezados están en mayúsculas o minúsculas, ni el orden de las columnas.").Append(CRLF).Append(CRLF)
	sbA.Append("Los posibles valores para el campo TipoTarifa son:").Append(CRLF)
	sbA.Append("0 (=Cliente)").Append(CRLF)
	sbA.Append("1 (=Grupo de Precio)").Append(CRLF).Append(CRLF)
	sbA.Append("No debe haber lineas en blanco entre los datos.").Append(CRLF)
	
	B4XLongMsg.Text=sbA.ToString
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For(rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstEncabezadosTabla As List
	lstEncabezadosTabla.Initialize
	lstEncabezadosTabla.Add("TipoTarifa")
	lstEncabezadosTabla.Add("CodigoTarifa")

	Dim cjamPegarDatosTarifasIncluidas As jamPegarDatosPreview
	cjamPegarDatosTarifasIncluidas.Initialize(Me, frm.RootPane, lstEncabezadosTabla)
	cjamPegarDatosTarifasIncluidas.show
	wait for (cjamPegarDatosTarifasIncluidas) jamPegarDatos_Done (lstCamposPegar As List)
	Dim lstCommands As List
	lstCommands.Initialize
	For Each mData As Map In lstCamposPegar
		Dim TipoTarifa As Int=mData.Get("TIPOTARIFA")
		Dim CodigoTarifa As String=mData.Get("CODIGOTARIFA")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasQuitarTarifaListaTarifasIncluidasBatch",Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa))
		lstCommands.Add(cmd)
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasIncluirTarifaBatch",Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows))
		lstCommands.Add(cmd)
	Next
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible incluir las tarifas seleccionadas. Revisar datos.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(CargarListaTarifasAnalisisTarifasIncluidas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tbl_PROIN_AnalisisTarifasListaTarifasInclusiones order by [TipoTarifa],[CodigoTarifa]")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasIncluidas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasIncluidas.AbrirCamposBuilder
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
End Sub

'Sub cjamPegarDatosTarifasIncluidas_Done(lstCamposPegar As List)
'	Log(lstCamposPegar)
'	For Each m As Map In lstCamposPegar
'		Log(m)
'	Next
'	
'End Sub
#End Region

#Region CodigosArticulosIncluidos

Sub ArticulosIncluidos
	If Navegando=False Then
		lstHistorial.Add("ArticulosIncluidos")
	End If
	If pnljamTableViewListaArticulosIncluidos.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaArticulosIncluidos")
		Sleep(0)
		
'		jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
'		Return
		
		Dim rSub As ResumableSub=jamTableViewListaArticulosIncluidos.ConfigurarTableView("ListaAnalisisTarifasListaArticulosIncluidos.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaArticulosIncluidos.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		'dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaArticulosIncluidos.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaArticulosIncluidos.SetCellFactoryListaCampos(dCF,Array As String("Bloqueado","BloqueadoNoDisponible"))
		
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosIncluidos.CellFactory_ColumnaFecha
		jamTableViewListaArticulosIncluidos.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaArticulosIncluidos.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaArticulosIncluidos.SetCellFactory(dCF)
		
		jamTableViewListaArticulosIncluidos.EstadoMenuItem(jamTableViewListaArticulosIncluidos.MenuBarLinea,False)
		
		jamTableViewListaArticulosIncluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Artículos a Lista de Artículos Incluidos","AddArticulosAListaArticulosIncluidos",Chr(0xF196),jamTableViewListaArticulosIncluidos.MenuBarAcciones)
		jamTableViewListaArticulosIncluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaArticulosIncluidos.MenuBarAcciones)
		jamTableViewListaArticulosIncluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaArticulosIncluidos.MenuBarAcciones)
		jamTableViewListaArticulosIncluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Artículos Seleccionados de la Lista de Artículos Incluidos","QuitarArticulosSeleccionados",Chr(0xF196),jamTableViewListaArticulosIncluidos.MenuBarAcciones)
		
		jamTableViewListaArticulosIncluidos.AddContextMenuItemFontAwesomeText("Quitar Artículo de la Lista de Artículos Incluidos","QuitarArticuloDeListaArticulosIncluidos",Chr(0xF196))
	End If
	pnljamTableViewListaArticulosIncluidos.BringToFront
	lblInfoMostrada.Text="Artículos Incluidos"
	
	
	Wait For(CargarListaCodigosArticulosIncluidos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinArticulosIncluidos" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos incluidos para este Análisis de Tarifas." & CRLF & _
				"Por tanto, se seleccionarán TODOS las códigos de Artículos de Navision, salvo los que se indiquen en la tabla de exclusiones.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosInclusiones order by [Articulo]")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosIncluidos.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaArticulosIncluidos.SetPlaceholderText("")
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub

Sub CargarListaCodigosArticulosIncluidos As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaArticulosInclusiones")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaArticulosIncluidosAnalisisTarifas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinArticulosIncluidos"
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
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaArticulosInclusiones",lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaArticulosIncluidos_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddArticulosAListaArticulosIncluidos"
			AddArticulosAListaArticulosIncluidos
		Case "SeleccionarTodos"
			SeleccionarTodosArticulosIncluidos(True)
		Case "DeseleccionarTodos"
			SeleccionarTodosArticulosIncluidos(False)
		Case "QuitarArticulosSeleccionados"
			QuitarArticulosSeleccionadosListaArticulosIncluidos
	End Select
End Sub

Sub jamTableViewListaArticulosIncluidos_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "Seleccionado"
			AlternarSeleccionadojamTableViewListaArticulosIncluidos(DatosCeldaSeleccionada)
	End Select
End Sub	


Sub AlternarSeleccionadojamTableViewListaArticulosIncluidos(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim FilaSel As Int=jamTableViewListaArticulosIncluidos.GetIndiceFilaSeleccionada
	Dim ArticuloSel As String=jamTableViewListaArticulosIncluidos.GetValorSQLCampoFila(FilaSel, "Articulo")
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			
		Case 1
			NuevoValor=0
	End Select
	'jamTableViewListaTarifasIncluidas.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(NuevoValor))
	mSQL.ExecNonQuery2("update tblAnalisisTarifasListaArticulosInclusiones set Seleccionado=? where Articulo=?",Array As Object(NuevoValor, ArticuloSel))
	jamTableViewListaArticulosIncluidos.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
End Sub

Sub QuitarArticulosSeleccionadosListaArticulosIncluidos
	Dim SelCount As Int=jamTableViewListaArticulosIncluidos.FixNullInt(jamTableViewListaArticulosIncluidos.SQL.ExecQuerySingleResult2("select count(Seleccionado) from tblOrigenDatos where Seleccionado=?",Array As String(1)))
	If SelCount=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay ningún artículo seleccionado para quitar de la lista de artículos incluidos.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	Else
		wait for(Utilidades.MsgBox2XUI("Confirma","¿Se han seleccionado " & SelCount & " artículos para quitar de la lista de artículos incluidos." & CRLF & CRLF & "¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Dim lstCommands As List
	lstCommands.Initialize
	Dim rs As ResultSet=mSQL.ExecQuery("select Articulo from tblAnalisisTarifasListaArticulosInclusiones where Seleccionado=1")
	Do While rs.NextRow
		Dim Articulo As String=rs.GetString("Articulo")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasQuitarArticuloListaArticulosIncluidosBatch",Array(mIDAnalisisTarifasVenta,Articulo))
		lstCommands.Add(cmd)
	Loop
	rs.Close
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible quitar los articulos seleccionados de la lista de artículos incluidos.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(CargarListaCodigosArticulosIncluidos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosInclusiones order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosIncluidos.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
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
End Sub

Sub SeleccionarTodosArticulosIncluidos(Seleccionar As Boolean)
	Dim SelInt As Int
	If Seleccionar Then
		SelInt=1
	Else
		SelInt=0
	End If
	jamTableViewListaArticulosIncluidos.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(SelInt))
	mSQL.ExecNonQuery2("update tblAnalisisTarifasListaArticulosInclusiones set Seleccionado=?",Array As Object(SelInt))
	wait for(jamTableViewListaArticulosIncluidos.RefreshTableViewData) complete (rObj As Object)
End Sub

Sub jamTableViewListaArticulosIncluidos_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "QuitarArticuloDeListaArticulosIncluidos"
			Dim FilaSel As Int=jamTableViewListaArticulosIncluidos.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosIncluidos.GetValorSQLCampoFila(FilaSel,"Articulo")

			Wait For(QuitarArticuloListaArticulosIncluidos(ArticuloSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return

			Wait For(CargarListaCodigosArticulosIncluidos) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			
			If Accion="SinArticulosIncluidos" Then
				Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos incluidos para este Análisis de Tarifas." & CRLF & _
				"Por tanto, se seleccionarán TODOS las códigos de Artículos de Navision, salvo los que se indiquen en la tabla de exclusiones.","Aviso")
				Wait For (msa) Msgbox_Result
			End If

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosInclusiones order by Articulo")
	
			Dim rSub As ResumableSub=jamTableViewListaArticulosIncluidos.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
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
	End Select
End Sub


Sub AddArticulosAListaArticulosIncluidos
	
	Dialog.Title="Selecciona método"
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
		
	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	If Opcion="Individual" Then
		AddArticuloIndividualAArticulosIncluidos
	Else
		AddGrupoArticulosAArticulosIncluidos
	End If
	
End Sub

Sub AddArticuloIndividualAArticulosIncluidos
	Dim cSelArtNAV As cSeleccionArticuloNAV
	cSelArtNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
	wait for cSeleccionArticuloNAV_Done (mSelCliNAV As Map)
	Dim ArticuloSel As String=mSelCliNAV.Get("Articulo")
	If ArticuloSel="" Then Return
	If 1=mSelCliNAV.Get("ArticuloBloqueado") Then
		Dim msa As Object=xui.MsgboxAsync("Los artículos bloqueados y bloqueados por no disponible se excluyen siempre del análisis","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(IncluirArticulo(ArticuloSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	Wait For(CargarListaCodigosArticulosIncluidos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosInclusiones order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosIncluidos.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
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
End Sub

Sub IncluirArticulo(ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirArticulo"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,ArticuloSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub QuitarArticuloListaArticulosIncluidos(ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarArticuloListaArticulosIncluidos"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,ArticuloSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub


Sub AddGrupoArticulosAArticulosIncluidos
	
	Dim B4XLongMsg As B4XLongTextTemplate
	B4XLongMsg.Initialize
	B4XLongMsg.Resize(600dip,500dip)
	Dim sbA As StringBuilder
	sbA.Initialize
	sbA.Append("Los datos deben ser copiados de una tabla con el encabezado siguiente:").Append(CRLF).Append(CRLF)
	sbA.Append("Articulo").Append(CRLF)
	sbA.Append("No importa si el encabezado están en mayúsculas o minúsculas.").Append(CRLF).Append(CRLF)
	sbA.Append("No debe haber lineas en blanco entre los datos.").Append(CRLF)
	
	B4XLongMsg.Text=sbA.ToString
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For(rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstEncabezadosTabla As List
	lstEncabezadosTabla.Initialize
	lstEncabezadosTabla.Add("Articulo")

	Dim cjamPegarDatosArticulosIncluidos As jamPegarDatosPreview
	cjamPegarDatosArticulosIncluidos.Initialize(Me, frm.RootPane, lstEncabezadosTabla)
	cjamPegarDatosArticulosIncluidos.show
	wait for (cjamPegarDatosArticulosIncluidos) jamPegarDatos_Done (lstCamposPegar As List)
	If lstCamposPegar.Size=0 Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Proceso copiar datos cancelado por el usuario.")) complete (rObj As Object)
		Return
	End If
	Dim UUIDSel As String=GenerarUUIDv4
	Dim lstCommands As List
	lstCommands.Initialize
	For Each mData As Map In lstCamposPegar
		Dim Articulo As String=mData.Get("ARTICULO")  'ojo jamPegarDatosPreview devuelve las claves de los maps en mayusculas
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasQuitarArticuloListaArticulosIncluidosBatch",Array(mIDAnalisisTarifasVenta,Articulo))
		lstCommands.Add(cmd)
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasArticulosIncluidosBatchInsertar",Array(UUIDSel, mIDAnalisisTarifasVenta,Articulo))
		lstCommands.Add(cmd)
	Next
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible incluir los articulos seleccionados. Revisar datos.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(AnalisisTarifasIncluirBatchArticulosListaArticulosInclusiones(UUIDSel)) complete (mRes As Map)
	' no controlamos el error. Los avisos se muestran en la sub. En cualquier caso, actualizamos los datos de articulos	
	
	Wait For(CargarListaCodigosArticulosIncluidos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosInclusiones order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosIncluidos.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
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
End Sub



Sub AnalisisTarifasIncluirBatchArticulosListaArticulosInclusiones(UUIDSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirBatchArticulosListaArticulosInclusiones"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDSel, DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub

#End Region

#Region CodigosArticulosExcluidos

Sub ArticulosExcluidos
	If Navegando=False Then
		lstHistorial.Add("ArticulosExcluidos")
	End If
	If pnljamTableViewListaArticulosExcluidos.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaArticulosExcluidos")
		Sleep(0)
		
'		jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
'		Return
		
		Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidos.ConfigurarTableView("ListaAnalisisTarifasListaArticulosExcluidos.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaArticulosExcluidos.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		'dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaArticulosExcluidos.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaArticulosExcluidos.SetCellFactoryListaCampos(dCF,Array As String("Bloqueado","BloqueadoNoDisponible"))
		
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosExcluidos.CellFactory_ColumnaFecha
		jamTableViewListaArticulosExcluidos.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaArticulosExcluidos.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaArticulosExcluidos.SetCellFactory(dCF)
		
		jamTableViewListaArticulosExcluidos.EstadoMenuItem(jamTableViewListaArticulosExcluidos.MenuBarLinea,False)
		
		jamTableViewListaArticulosExcluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Artículos a Lista de Artículos Excluidos","AddArticulosAListaArticulosExcluidos",Chr(0xF196),jamTableViewListaArticulosExcluidos.MenuBarAcciones)
		jamTableViewListaArticulosExcluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaArticulosExcluidos.MenuBarAcciones)
		jamTableViewListaArticulosExcluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaArticulosExcluidos.MenuBarAcciones)
		jamTableViewListaArticulosExcluidos.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Artículos Seleccionados de la Lista de Artículos Incluidos","QuitarArtículosSeleccionados",Chr(0xF196),jamTableViewListaArticulosExcluidos.MenuBarAcciones)
		
		jamTableViewListaArticulosExcluidos.AddContextMenuItemFontAwesomeText("Quitar Artículo de la Lista de Artículos Excluidos","QuitarArticuloDeListaArticulosExcluidos",Chr(0xF196))
	End If
	pnljamTableViewListaArticulosExcluidos.BringToFront
	lblInfoMostrada.Text="Artículos Excluidos"
	
	
	Wait For(CargarListaCodigosArticulosExcluidos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinArticulosExcluidos" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos excluidos para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExclusiones order by [Articulo]")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidos.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosExcluidos.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaArticulosExcluidos.SetPlaceholderText("")
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub

Sub CargarListaCodigosArticulosExcluidos As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaArticulosExclusiones")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaArticulosExcluidosAnalisisTarifas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinArticulosExcluidos"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaArticulosExclusiones",lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaArticulosExcluidos_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddArticulosAListaArticulosExcluidos"
			AddArticulosAListaArticulosExcluidos
	End Select
End Sub

Sub jamTableViewListaArticulosExcluidos_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "QuitarArticuloDeListaArticulosExcluidos"
			Dim FilaSel As Int=jamTableViewListaArticulosExcluidos.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosExcluidos.GetValorSQLCampoFila(FilaSel,"Articulo")

			Wait For(QuitarArticuloListaArticulosExcluidos(ArticuloSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return

			Wait For(CargarListaCodigosArticulosExcluidos) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			
			If Accion="SinArticulosExcluidos" Then
				Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos excluidos para este Análisis de Tarifas.","Aviso")
				Wait For (msa) Msgbox_Result
			End If

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExclusiones order by Articulo")
	
			Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidos.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaArticulosExcluidos.AbrirCamposBuilder
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
			
			
	End Select
End Sub


Sub AddArticulosAListaArticulosExcluidos
	
	Dialog.Title="Selecciona método"
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
		
	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	If Opcion="Individual" Then
		AddArticuloIndividualAArticulosExcluidos
	Else
		'AddGrupoArticulosAArticulosIncluidos
	End If
	
End Sub

Sub AddArticuloIndividualAArticulosExcluidos
	Dim cSelArtNAV As cSeleccionArticuloNAV
	cSelArtNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
	wait for cSeleccionArticuloNAV_Done (mSelCliNAV As Map)
	Dim ArticuloSel As String=mSelCliNAV.Get("Articulo")
	If ArticuloSel="" Then Return
	If 1=mSelCliNAV.Get("ArticuloBloqueado") Then
		Dim msa As Object=xui.MsgboxAsync("Los artículos bloqueados y bloqueados por no disponible se excluyen siempre del análisis","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(ExcluirArticulo(ArticuloSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	Wait For(CargarListaCodigosArticulosExcluidos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExclusiones order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidos.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosExcluidos.AbrirCamposBuilder
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
End Sub

Sub ExcluirArticulo(ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirArticulo"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,ArticuloSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub QuitarArticuloListaArticulosExcluidos(ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarArticuloListaArticulosExcluidos"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,ArticuloSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub
#End Region


#Region CodigosArticulosSeleccionadoAnálisis
Sub CodigosArticulosSeleccionadoAnalisis As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("CodigosArticulosSeleccionadoAnalisis")
	End If
	If pnljamTableViewListaCodigosArticulosSeleccionadosAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis")
		Sleep(0)
		
'		jamTableViewListaArticulosFabNoCorte.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaCodigosArticulosSeleccionadosAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaCodigosArticulosSeleccionadosAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		''
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
		''		Dim dCF As DatosCellFactoryJamTableView
		''		dCF.Initialize
		''		dCF.AliasCampoColumna="RutaAnalisis"
		''		dCF.CellFactoryEnCallBack=False
		''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		jamTableViewListaCodigosArticulosSeleccionadosAnalisis.EstadoMenuItem(jamTableViewListaCodigosArticulosSeleccionadosAnalisis.MenuBarAcciones,False)
		jamTableViewListaCodigosArticulosSeleccionadosAnalisis.EstadoMenuItem(jamTableViewListaCodigosArticulosSeleccionadosAnalisis.MenuBarLinea,False)
		
		'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
		'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaRutasAnalisis.MenuBarLinea)
		'''
		'''		jamTableViewListaRutasAnalisis.AddContextMenuItemSeparator
		'''		jamTableViewListaRutasAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096))
	End If
	pnljamTableViewListaCodigosArticulosSeleccionadosAnalisis.BringToFront
	lblInfoMostrada.Text="Códigos Artículos Seleccionados Análisis"
	
	jamLoadingIndicator1.MensajeLoading="Cargando Códigos Artículos Seleccionados Análisis..."
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaCodigosArticulosSeleccionadosAnalisis) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaCodigosArticulosSeleccionadosAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaCodigosArticulosSeleccionadosAnalisis.AbrirCamposBuilder
				Return False
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
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub ActualizarListaCodigosArticulosSeleccionadosAnalisis As ResumableSub

	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaCodigosArticulosSeleccionadosAnalisisTarifas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene códigos de artículos seleccionados.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasListaCodigosArticulosSeleccionadosAnalisis set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

#End Region

#Region ClientesTarifasAnalisis
Sub ClientesTarifasAnalisis
	If Navegando=False Then
		lstHistorial.Add("ClientesTarifasAnalisis")
	End If
	If pnljamTableViewListaClientesTarifasAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaClientesTarifasAnalisis")
		Sleep(0)
		
'		jamTableViewListaClientesTarifasAnalisis.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaClientesTarifasAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaClientesTarifasAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaClientesTarifasAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

''		Dim CF As DatosCellFactoryJamTableView
''		CF.Initialize
''		CF.NombreFuncionCellFactory=jamTableViewListaClientesTarifasAnalisis.CellFactory_ColumnaFecha
''		jamTableViewListaGRCsAnalisis.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
''		Dim dCF As DatosCellFactoryJamTableView
''		dCF.Initialize
''		dCF.AliasCampoColumna="GRCAnalisis"
''		dCF.CellFactoryEnCallBack=False
''		dCF.NombreFuncionCellFactory=jamTableViewListaClientesTarifasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''		jamTableViewListaClientesTarifasAnalisis.SetCellFactory(dCF)
		
		jamTableViewListaClientesTarifasAnalisis.EstadoMenuItem(jamTableViewListaClientesTarifasAnalisis.MenuBarAcciones,False)
		jamTableViewListaClientesTarifasAnalisis.EstadoMenuItem(jamTableViewListaClientesTarifasAnalisis.MenuBarLinea,False)
		
''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
''		jamTableViewListaClientesTarifasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todos GRCs","IncluirTodosGRCs",Chr(0xF046),jamTableViewListaGRCsAnalisis.MenuBarAcciones)
''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
''		jamTableViewListaClientesTarifasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos GRCs Excepto Línea Seleccionada","ExcluirTodosGRCsExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaGRCsAnalisis.MenuBarLinea)
''		
''		jamTableViewListaClientesTarifasAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Excepto Línea Seleccionada","ExcluirTodosGRCsExceptoLineaSeleccionada",Chr(0xF096))
	End If
	pnljamTableViewListaClientesTarifasAnalisis.BringToFront
	lblInfoMostrada.Text="Clientes asociados a las Tarifas Analizados"
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos Clientes análisis..."
	jamLoadingIndicator1.Show
	
	wait For (CargaListaClientesTarifasAnalisisTarifasVenta) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	jamLoadingIndicator1.Close
	If Accion="NOK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaClientesTarifas")
	
	Dim rSub As ResumableSub=jamTableViewListaClientesTarifasAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaClientesTarifasAnalisis.AbrirCamposBuilder
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
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub CargaListaClientesTarifasAnalisisTarifasVenta As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaClientesTarifas")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaClientesTarifasSeleccionadasAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Clientes correspondientes a las tarifas seleccionadas para el análisis.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinClientes"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaClientesTarifas",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasListaClientesTarifas set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

#End Region

#Region GRCs
Sub CargaListaGRCsAnalisisTarifasVenta As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaGRCs")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaGRCsAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar (salvo que no haya GRCs definidos en NAV??
			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Grupos Contables Producto definidos en NAV??.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaGRCs",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasListaGRCs set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Sub GruposContablesProductoIncluidos
	If Navegando=False Then
		lstHistorial.Add("GruposContablesProductoIncluidos")
	End If
	If pnljamTableViewListaGRCsAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaGRCsAnalisis")
		Sleep(0)

		Dim rSub As ResumableSub=jamTableViewListaGRCsAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaGRCsAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaGRCsAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaGRCsAnalisis.CellFactory_ColumnaFecha
		jamTableViewListaGRCsAnalisis.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="GRCAnalisis"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaGRCsAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaGRCsAnalisis.SetCellFactory(dCF)
		
		'jamTableViewListaGRPSAnalisis.EstadoMenuItem(jamTableViewListaGRPSAnalisis.MenuBarLinea,False)
		
		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		jamTableViewListaGRCsAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todos GRCs","IncluirTodosGRCs",Chr(0xF046),jamTableViewListaGRCsAnalisis.MenuBarAcciones)
		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		jamTableViewListaGRCsAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos GRCs Excepto Línea Seleccionada","ExcluirTodosGRCsExceptoLineaSeleccionada",Chr(0xF2D4),jamTableViewListaGRCsAnalisis.MenuBarLinea)
		
		jamTableViewListaGRCsAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Excepto Línea Seleccionada","ExcluirTodosGRCsExceptoLineaSeleccionada",Chr(0xF2D4))
	End If
	pnljamTableViewListaGRCsAnalisis.BringToFront
	lblInfoMostrada.Text="Grupos Contables Producto Analizados"
	
	
	Wait For(CargaListaGRCsAnalisisTarifasVenta) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaGRCs")
	
	Dim rSub As ResumableSub=jamTableViewListaGRCsAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaGRCsAnalisis.AbrirCamposBuilder
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
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub

Sub jamTableViewListaGRCsAnalisis_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "ExcluirTodosGRCsExceptoLineaSeleccionada"
			Dim FilaSel As Int=jamTableViewListaGRCsAnalisis.GetIndiceFilaSeleccionada
			Dim GRCSel As String=jamTableViewListaGRCsAnalisis.GetValorSQLCampoFila(FilaSel,"GRC")
			wait for(ExcluirTodosGRCsExceptoGRCLinea(GRCSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				wait for(CargaListaGRCsAnalisisTarifasVenta) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="OK" Then
					Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaGRCs order by GRC")
	
					Dim rSub As ResumableSub=jamTableViewListaGRCsAnalisis.setdata(rsData)
					Wait For (rSub) complete (mResultSetData As Map)
					rsData.Close
	
					If Not(mResultSetData.Get("FlagOK")) Then
						If ""<>mResultSetData.Get("msgError") Then
							Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
							Wait For (msa) Msgbox_Result
			#if debug
							Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
							Wait For (msa) Msgbox_Result (rInt As Int)
							If rInt=xui.DialogResponse_Positive Then
								jamTableViewListaGRCsAnalisis.AbrirCamposBuilder
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
				End If
			End If
	End Select
End Sub

Sub jamTableViewListaGRCsAnalisis_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "IncluirTodosGRCs"
			wait for(IncluirTodosGRCs) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				wait for(CargaListaGRCsAnalisisTarifasVenta) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="OK" Then
					Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaGRCs order by GRC")
	
					Dim rSub As ResumableSub=jamTableViewListaGRCsAnalisis.setdata(rsData)
					Wait For (rSub) complete (mResultSetData As Map)
					rsData.Close
	
					If Not(mResultSetData.Get("FlagOK")) Then
						If ""<>mResultSetData.Get("msgError") Then
							Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
							Wait For (msa) Msgbox_Result
			#if debug
							Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
							Wait For (msa) Msgbox_Result (rInt As Int)
							If rInt=xui.DialogResponse_Positive Then
								jamTableViewListaGRCsAnalisis.AbrirCamposBuilder
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
				End If
			End If
		
		Case "ExcluirTodosGRCsExceptoLineaSeleccionada"
			Dim FilaSel As Int=jamTableViewListaGRCsAnalisis.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then 
				Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ninguna línea.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim GRCSel As String=jamTableViewListaGRCsAnalisis.GetValorSQLCampoFila(FilaSel,"GRC")
			
			wait for(ExcluirTodosGRCsExceptoGRCLinea(GRCSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				wait for(CargaListaGRCsAnalisisTarifasVenta) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="OK" Then
					Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaGRCs order by GRC")
	
					Dim rSub As ResumableSub=jamTableViewListaGRCsAnalisis.setdata(rsData)
					Wait For (rSub) complete (mResultSetData As Map)
					rsData.Close
	
					If Not(mResultSetData.Get("FlagOK")) Then
						If ""<>mResultSetData.Get("msgError") Then
							Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
							Wait For (msa) Msgbox_Result
			#if debug
							Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
							Wait For (msa) Msgbox_Result (rInt As Int)
							If rInt=xui.DialogResponse_Positive Then
								jamTableViewListaGRCsAnalisis.AbrirCamposBuilder
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
				End If
			End If
	End Select
End Sub

Sub IncluirTodosGRCs As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirTodosGRCs"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaGRCsAnalisis_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "GRCAnalisis"
			AlternarSeleccionadoGRCAnalisis(DatosCeldaSeleccionada)
	End Select
End Sub

Sub AlternarSeleccionadoGRCAnalisis(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			Dim GRCSel As String=DatosCeldaSeleccionada.mDataPK.Get("GRC")
			wait for(IncluirGRC(GRCSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			jamTableViewListaGRCsAnalisis.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set GRCAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where GRC=?", _
				Array As Object(1,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows,GRCSel))
			mSQL.ExecNonQuery2("UPDATE tblAnalisisTarifasListaGRCs set GRCAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where GRC=?", _
				Array As Object(1,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows,GRCSel))
		Case 1
			Dim NumGRCsActuales As Int=mSQL.ExecQuerySingleResult("select count(*) from tblAnalisisTarifasListaGRCs where GRCAnalisis=1")
			If NumGRCsActuales<=1 Then
				Dim msa As Object=xui.MsgboxAsync("No es posible dejar la lista de Grupos Contables Producto sin ningún elemento seleccionado.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			NuevoValor=0
			Dim GRCSel As String=DatosCeldaSeleccionada.mDataPK.Get("GRC")
			wait for(ExcluirGRC(GRCSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			jamTableViewListaGRCsAnalisis.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set GRCAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where GRC=?", _
				Array As Object(0,0,"",GRCSel))
			mSQL.ExecNonQuery2("UPDATE tblAnalisisTarifasListaGRCs set GRCAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where GRC=?", _
				Array As Object(0,0,"",GRCSel))
	End Select
	jamTableViewListaGRCsAnalisis.RefrescarFilaTVMetodoSQL(DatosCeldaSeleccionada.Fila)
	jamTableViewListaGRCsAnalisis.SeleccionarCelda("GRCAnalisis",DatosCeldaSeleccionada.Fila)
End Sub

Sub IncluirGRC(GRCSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirGRC"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,GRCSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub ExcluirGRC(GRCSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirGRC"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,GRCSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub ExcluirTodosGRCsExceptoGRCLinea(GRCSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirTodosGRCsExceptoGRC"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,GRCSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
'			Accion="OK"
'			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

#End Region

#Region SistemaReposicion

Sub CargaListaSistemasReposicionAnalisisTarifasVenta As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaSistemasReposicion")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaSistemasReposicionAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar (salvo que no haya GRCs definidos en NAV??
			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Sistemas de reposicion definidos en tabla personalizada tbl_PROIN_AnalisisTarifasSistemasReposicion??.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaSistemasReposicion",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasListaSistemasReposicion set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Sub SistemasReposicionIncluidos As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("SistemasReposicionIncluidos")
	End If
	'MostrarJamTableView(pnljamTableViewListaTarifasAnalisis)
	If pnljamTableViewListaSistemasReposicionAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaSistemasReposicionAnalisis")
		Sleep(0)
		
'		jamTableViewListaSistemasReposicionAnalisis.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaSistemasReposicionAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaSistemasReposicionAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaSistemasReposicionAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaSistemasReposicionAnalisis.CellFactory_ColumnaFecha
		jamTableViewListaSistemasReposicionAnalisis.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="SistemaReposicionAnalisis"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaSistemasReposicionAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaSistemasReposicionAnalisis.SetCellFactory(dCF)
		
		jamTableViewListaSistemasReposicionAnalisis.EstadoMenuItem(jamTableViewListaSistemasReposicionAnalisis.MenuBarAcciones,False)
		jamTableViewListaSistemasReposicionAnalisis.EstadoMenuItem(jamTableViewListaSistemasReposicionAnalisis.MenuBarLinea,False)
		
		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaSistemasReposicionAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todos Sistemas Reposicion","IncluirTodosSistemasReposicion",Chr(0xF046),jamTableViewListaSistemasReposicionAnalisis.MenuBarAcciones)
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaSistemasReposicionAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaSistemasReposicionAnalisis.MenuBarLinea)
'''		
'''		jamTableViewListaSistemasReposicionAnalisis.AddContextMenuItemSeparator
'''		jamTableViewListaSistemasReposicionAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096))
	End If
	pnljamTableViewListaSistemasReposicionAnalisis.BringToFront
	lblInfoMostrada.Text="Sistemas Reposición Analizados"
	
	
	Wait For(CargaListaSistemasReposicionAnalisisTarifasVenta) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return False

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaSistemasReposicion")
	
	Dim rSub As ResumableSub=jamTableViewListaSistemasReposicionAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaSistemasReposicionAnalisis.AbrirCamposBuilder
				Return False
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
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub

Sub CargarSistemasReposicionAnalisis As ResumableSub
	'mSistemasReposicionAnalisis=""
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasSistemasReposicionAnalis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinSistemasReposicion"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub
	
'''Sub EditarSistemasReposicionIncluidos
'''	
'''	wait for (CargarSistemasReposicionAnalisis) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	Select Accion
'''		Case "NOK"
'''			SalirModulo
'''			Return
'''
'''		Case "SinSistemasReposicion"
'''			wait for (AddTodosSistemasReposicionAnalisis) complete (mRes As Map)
'''			Dim Accion As String=mRes.Get("Accion")
'''			If Accion<>"OK" Then
'''				SalirModulo
'''				Return
'''			Else
'''				mSistemasReposicionAnalisis="TODOS"
'''			End If
'''
'''		Case "OK"
'''			mSistemasReposicionAnalisis=""
'''			Dim lstSistRepo As List=mRes.Get("lstReg")
'''			Dim SRCompra As Boolean=False
'''			Dim SRFab As Boolean=False
'''			For Each m As Map In lstSistRepo
'''				Dim SistR As Int=m.Get("SistemaReposicion")
'''				Select Case SistR
'''					Case 0
'''						SRCompra=True
'''					Case 1
'''						SRFab=True
'''				End Select
'''			Next
'''			Select True
'''				Case SRCompra And Not(SRFab)
'''					mSistemasReposicionAnalisis="COMPRA"
'''				Case Not(SRCompra) And SRFab
'''					mSistemasReposicionAnalisis="FABRICACION"
'''				Case SRCompra And SRFab
'''					mSistemasReposicionAnalisis="TODOS"
'''				Case Else
'''					Dim msa As Object=xui.MsgboxAsync("Sin sistemas de reposición asignados !.","Error")
'''					Wait For (msa) Msgbox_Result
'''					SalirModulo
'''					Return
'''			End Select
'''	End Select
'''	
'''	Dialog.Title="Indica Sistema/s de Reposición" & CRLF & "Valor actual: " & mSistemasReposicionAnalisis
'''	Dialog.TitleBarHeight=60dip
'''	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
'''	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'''	Dim B4XListDlg As B4XListTemplate
'''	B4XListDlg.Initialize
'''
'''	Dim TextSize As Float = 18 'FLOAT
'''	Dim xclv As CustomListView=B4XListDlg.CustomListView1
'''	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
'''	
'''	Dim dlbl As Label=xclv.DesignerLabel
'''	dlbl.TextSize=TextSize
'''		
'''	Dim lstOpciones As List=Array As String("TODOS","COMPRA", "FABRICACION")
'''	
'''	B4XListDlg.Options=lstOpciones
'''	
'''	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'''	
'''	For i=0 To lstOpciones.size-1
'''		xclv.ResizeItem(i,80dip)
'''	Next
'''	
'''	' OJO ... es un B4XView no Button
'''	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'''	If bCancel.IsInitialized Then
'''		'Log("bCancel" & bCancel.Text)
'''		bCancel.Left=bCancel.Left-50dip
'''		bCancel.Width=bCancel.Width+30dip
'''		bCancel.TextSize=18
'''	End If
'''	
'''	Wait For (rSub) Complete (rInt As Int)
'''	If rInt<>xui.DialogResponse_Positive Then Return
'''
'''	Dim NuevoSistemaReposicion As String=B4XListDlg.SelectedItem
'''	
'''	Select Case NuevoSistemaReposicion
'''		Case "COMPRA"
'''			
'''		Case
'''		
'''		
'''		
'''	End Select
'''
'''	wait for (ActualizarSistemasReposicionAnalisis(NuevoSistemaReposicion)) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	If Accion<>"OK" Then
'''		SalirModulo
'''		Return
'''	Else
'''		mSistemasReposicionAnalisis=NuevoSistemaReposicion
'''	End If
'''	
'''End Sub

Sub AddTodosSistemasReposicionAnalisis As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirTodosSistemasReposicion"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then ' esta opcion no se puede dar para este sp
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("Sin respuesta desde query " & Comando & ".","Error")
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

'Sub ActualizarSistemasReposicionAnalisis(SistRepoSel As String) As ResumableSub
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasEditarSistemasReposicionAnalisis"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,SistRepoSel,DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then ' esta opcion no se puede dar para este sp
'			Dim msa As Object=xui.MsgboxAsync("Sin respuesta desde query " & Comando & ".","Error")
'			Wait For (msa) Msgbox_Result
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mResp As Map=lstReg.Get(0)
'			Dim sResp As String=mResp.GetValueAt(0)
'			If sResp.ToUpperCase.StartsWith("ERROR") Then
'				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
'				Wait For (msa) Msgbox_Result
'				Accion="NOK"
'			Else
'				Accion="OK"
'				mRes.Put("Accion", Accion)
'				mRes.Put("lstReg", lstReg)
'			End If
'		End If
'	End If
'	Return mRes
'End Sub

Sub jamTableViewListaSistemasReposicionAnalisis_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "SistemaReposicionAnalisis"
			AlternarSeleccionadoSistemaReposicionAnalisis(DatosCeldaSeleccionada)
	End Select
End Sub



Sub AlternarSeleccionadoSistemaReposicionAnalisis(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			Dim SistemaReposicionSel As Int=DatosCeldaSeleccionada.mDataPK.Get("SistemaReposicion")
			wait for(IncluirSistemaReposicion(SistemaReposicionSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			jamTableViewListaSistemasReposicionAnalisis.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set SistemaReposicionAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where SistemaReposicion=?", _
				Array As Object(1,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows,SistemaReposicionSel))
			mSQL.ExecNonQuery2("UPDATE tblAnalisisTarifasListaSistemasReposicion set SistemaReposicionAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where SistemaReposicion=?", _
				Array As Object(1,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows,SistemaReposicionSel))
		Case 1
			Dim NumSistemasReposicionActuales As Int=mSQL.ExecQuerySingleResult("select count(*) from tblAnalisisTarifasListaSistemasReposicion where SistemaReposicionAnalisis=1")
			If NumSistemasReposicionActuales<=1 Then
				Dim msa As Object=xui.MsgboxAsync("No es posible dejar la lista de Sistemas Reposición sin ningún elemento seleccionado.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			NuevoValor=0
			Dim SistemaReposicionSel As Int=DatosCeldaSeleccionada.mDataPK.Get("SistemaReposicion")
			wait for(ExcluirSistemaReposicion(SistemaReposicionSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			jamTableViewListaSistemasReposicionAnalisis.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set SistemaReposicionAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where SistemaReposicion=?", _
				Array As Object(0,0,"",SistemaReposicionSel))
			mSQL.ExecNonQuery2("UPDATE tblAnalisisTarifasListaSistemasReposicion set SistemaReposicionAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where SistemaReposicion=?", _
				Array As Object(0,0,"",SistemaReposicionSel))
	End Select
	jamTableViewListaSistemasReposicionAnalisis.RefrescarFilaTVMetodoSQL(DatosCeldaSeleccionada.Fila)
	jamTableViewListaSistemasReposicionAnalisis.SeleccionarCelda("SistemaReposicionAnalisis",DatosCeldaSeleccionada.Fila)
End Sub

Sub IncluirSistemaReposicion(SistemaReposicionSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirSistemaReposicion"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,SistemaReposicionSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub ExcluirSistemaReposicion(SistemaReposicionSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirSistemaReposicion"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,SistemaReposicionSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

#End Region

#Region Rutas
Sub RutasProduccionIncluidas As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("RutasProduccionIncluidas")
	End If
	'MostrarJamTableView(pnljamTableViewListaTarifasAnalisis)
	If pnljamTableViewListaRutasAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaRutasAnalisis")
		Sleep(0)
		
'		jamTableViewListaRutasAnalisis.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaRutasAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaRutasAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaRutasAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaFecha
		jamTableViewListaRutasAnalisis.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="RutaAnalisis"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		'jamTableViewListaGRPSAnalisis.EstadoMenuItem(jamTableViewListaGRPSAnalisis.MenuBarLinea,False)
		
		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF2D4),jamTableViewListaRutasAnalisis.MenuBarLinea)
		
		jamTableViewListaRutasAnalisis.AddContextMenuItemSeparator
		jamTableViewListaRutasAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF2D4))
	End If
	pnljamTableViewListaRutasAnalisis.BringToFront
	lblInfoMostrada.Text="Rutas Producción Analizadas"
	
	
	Wait For(ActualizarListaRutasAnalisisTarifasVenta) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return False

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaRutas order by Ruta")
	
	Dim rSub As ResumableSub=jamTableViewListaRutasAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaRutasAnalisis.AbrirCamposBuilder
				Return False
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
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub ActualizarListaRutasAnalisisTarifasVenta As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaRutas")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaRutasAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar (salvo que no haya Rutas definidos en NAV??
			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaRutas",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasListaRutas set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaRutasAnalisis_ContextMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "ExcluirTodasRutasExceptoLineaSeleccionada"
			Dim FilaSel As Int=jamTableViewListaRutasAnalisis.GetIndiceFilaSeleccionada
			Dim RutaSel As String=jamTableViewListaRutasAnalisis.GetValorSQLCampoFila(FilaSel,"Ruta")
			wait for(ExcluirTodasRutasExceptoRutaLinea(RutaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				wait for(ActualizarListaRutasAnalisisTarifasVenta) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="OK" Then
					Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaRutas order by Ruta")
	
					Dim rSub As ResumableSub=jamTableViewListaRutasAnalisis.setdata(rsData)
					Wait For (rSub) complete (mResultSetData As Map)
					rsData.Close
	
					If Not(mResultSetData.Get("FlagOK")) Then
						If ""<>mResultSetData.Get("msgError") Then
							Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
							Wait For (msa) Msgbox_Result
			#if debug
							Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
							Wait For (msa) Msgbox_Result (rInt As Int)
							If rInt=xui.DialogResponse_Positive Then
								jamTableViewListaRutasAnalisis.AbrirCamposBuilder
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
				End If
			End If
	End Select
End Sub

Sub jamTableViewListaRutasAnalisis_MenuBarMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "IncluirTodasRutas"
			wait for(IncluirTodasRutas) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				wait for(ActualizarListaRutasAnalisisTarifasVenta) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="OK" Then
					Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaRutas order by Ruta")
	
					Dim rSub As ResumableSub=jamTableViewListaRutasAnalisis.setdata(rsData)
					Wait For (rSub) complete (mResultSetData As Map)
					rsData.Close
	
					If Not(mResultSetData.Get("FlagOK")) Then
						If ""<>mResultSetData.Get("msgError") Then
							Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
							Wait For (msa) Msgbox_Result
			#if debug
							Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
							Wait For (msa) Msgbox_Result (rInt As Int)
							If rInt=xui.DialogResponse_Positive Then
								jamTableViewListaRutasAnalisis.AbrirCamposBuilder
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
				End If
			End If
			
			
		Case "ExcluirTodasRutasExceptoLineaSeleccionada"
			Dim FilaSel As Int=jamTableViewListaRutasAnalisis.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ninguna línea.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If

			Dim RutaSel As String=jamTableViewListaRutasAnalisis.GetValorSQLCampoFila(FilaSel,"Ruta")
			wait for(ExcluirTodasRutasExceptoRutaLinea(RutaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				wait for(ActualizarListaRutasAnalisisTarifasVenta) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="OK" Then
					Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaRutas order by Ruta")
	
					Dim rSub As ResumableSub=jamTableViewListaRutasAnalisis.setdata(rsData)
					Wait For (rSub) complete (mResultSetData As Map)
					rsData.Close
	
					If Not(mResultSetData.Get("FlagOK")) Then
						If ""<>mResultSetData.Get("msgError") Then
							Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
							Wait For (msa) Msgbox_Result
			#if debug
							Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
							Wait For (msa) Msgbox_Result (rInt As Int)
							If rInt=xui.DialogResponse_Positive Then
								jamTableViewListaRutasAnalisis.AbrirCamposBuilder
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
				End If
			End If
	End Select
End Sub

Sub jamTableViewListaRutasAnalisis_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "RutaAnalisis"
			AlternarSeleccionadoRutaAnalisis(DatosCeldaSeleccionada)
	End Select
	
End Sub

Sub AlternarSeleccionadoRutaAnalisis(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			Dim RutaSel As String=DatosCeldaSeleccionada.mDataPK.Get("Ruta")
			wait for(IncluirRuta(RutaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			jamTableViewListaRutasAnalisis.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set RutaAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where Ruta=?", _
				Array As Object(1,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows,RutaSel))
			mSQL.ExecNonQuery2("UPDATE tblAnalisisTarifasListaRutas set RutaAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where Ruta=?", _
				Array As Object(1,DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows,RutaSel))
		Case 1
			Dim NumRutasActuales As Int=mSQL.ExecQuerySingleResult("select count(*) from tblAnalisisTarifasListaRutas where RutaAnalisis=1")
			If NumRutasActuales<=1 Then
				Dim msa As Object=xui.MsgboxAsync("No es posible dejar la lista de Rutas sin ningún elemento seleccionado.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			NuevoValor=0
			Dim RutaSel As String=DatosCeldaSeleccionada.mDataPK.Get("Ruta")
			wait for(ExcluirRuta(RutaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			jamTableViewListaRutasAnalisis.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set RutaAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where Ruta=?", _
				Array As Object(0,0,"",RutaSel))
			mSQL.ExecNonQuery2("UPDATE tblAnalisisTarifasListaRutas set RutaAnalisis=?, FechaActualizacionLong=?, UsuarioActualizacion=? where Ruta=?", _
				Array As Object(0,0,"",RutaSel))
	End Select
	
'	jamTableViewListaRutasAnalisis.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
	
	jamTableViewListaRutasAnalisis.RefrescarFilaTVMetodoSQL(DatosCeldaSeleccionada.Fila)
	jamTableViewListaRutasAnalisis.SeleccionarCelda("RutaAnalisis",DatosCeldaSeleccionada.Fila)
	
'	wait for(ActualizarListaRutasAnalisisTarifasVenta) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="OK" Then
'		Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaRutas order by Ruta")
'	
'		Dim rSub As ResumableSub=jamTableViewListaRutasAnalisis.setdata(rsData)
'		Wait For (rSub) complete (mResultSetData As Map)
'		rsData.Close
'	
'		If Not(mResultSetData.Get("FlagOK")) Then
'			If ""<>mResultSetData.Get("msgError") Then
'				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'				Wait For (msa) Msgbox_Result
'			#if debug
'				Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'				Wait For (msa) Msgbox_Result (rInt As Int)
'				If rInt=xui.DialogResponse_Positive Then
'					jamTableViewListaRutasAnalisis.AbrirCamposBuilder
'					Return
'				End If
'			#End If
'				ExitApplication
'			End If
'			If ""<>mResultSetData.Get("msgAviso") Then
'				If True=mResultSetData.Get("ListaVacia") Then Return
'				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'				Wait For (msa) Msgbox_Result
'			End If
'	
'		End If
'	End If
'	
'	jamTableViewListaRutasAnalisis.SeleccionarCelda("RutaAnalisis",DatosCeldaSeleccionada.Fila)
End Sub

Sub IncluirTodasRutas As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirTodasRutas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub IncluirRuta(RutaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasIncluirRuta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,RutaSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub ExcluirRuta(RutaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirRuta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,RutaSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

Sub ExcluirTodasRutasExceptoRutaLinea(RutaSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirTodasRutasExceptoRuta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,RutaSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub

#End Region

#Region ProductosSeleccionadosAnalisis
Sub ProductosSeleccionadosAnalisis As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("ProductosSeleccionadosAnalisis")
	End If
	'MostrarJamTableView(pnljamTableViewListaTarifasAnalisis)
	If pnljamTableViewListaProductosSeleccionadosAnalisis.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasProductosSeleccionadosAnalisis")
		Sleep(0)
		
'		jamTableViewListaProductosSeleccionadosAnalisis.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaProductosSeleccionadosAnalisis.ConfigurarTableView("ListaAnalisisTarifasListaProductosSeleccionadosAnalisis.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaProductosSeleccionadosAnalisis.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
''
''		Dim CF As DatosCellFactoryJamTableView
''		CF.Initialize
''		CF.NombreFuncionCellFactory=jamTableViewListaProductosSeleccionadosAnalisis.CellFactory_ColumnaFecha
''		jamTableViewListaProductosSeleccionadosAnalisis.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
''		Dim dCF As DatosCellFactoryJamTableView
''		dCF.Initialize
''		dCF.AliasCampoColumna="RutaAnalisis"
''		dCF.CellFactoryEnCallBack=False
''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		'jamTableViewListaGRPSAnalisis.EstadoMenuItem(jamTableViewListaGRPSAnalisis.MenuBarLinea,False)
		
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaRutasAnalisis.MenuBarLinea)
'''		
'''		jamTableViewListaRutasAnalisis.AddContextMenuItemSeparator
'''		jamTableViewListaRutasAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096))
	End If
	pnljamTableViewListaProductosSeleccionadosAnalisis.BringToFront
	lblInfoMostrada.Text="Productos Seleccionados Análisis"
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos productos análisis..."
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaProductosSeleccionadosAnalisisTarifasVenta) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaProductosSeleccionadosAnalisis order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaProductosSeleccionadosAnalisis.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaProductosSeleccionadosAnalisis.AbrirCamposBuilder
				Return False
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
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub ActualizarListaProductosSeleccionadosAnalisisTarifasVenta As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaProductosSeleccionadosAnalisis")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaArticulosAnalisisTarifasVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No se han seleccionado artículos para el análisis. Revisar módulos de configuración.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaProductosSeleccionadosAnalisis",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasListaProductosSeleccionadosAnalisis set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub



#End Region


#Region AnalisisDatosRevisionVentas
Sub AnalisisDatosRevisionVentas As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("AnalisisDatosRevisionVentas")
	End If
	If pnljamTableViewAnalisisTarifasListaDatosRevisionVentas.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasDatosRevisionVentas")
		Sleep(0)
'		
'		jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
'		Return

		jamTableViewListaDatosRevisionVentas.AddContextMenuItemSeparator
		Dim img As Image
		img.InitializeSample(File.DirAssets,"navision.png",24,24)
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemImage("Artículo NAV","VerArticuloNAV",img)

		Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.ConfigurarTableView("ListaAnalisisTarifasListaAnalisisDatosRevisionVentas.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaDatosRevisionVentas.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		''
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaDatosRevisionVentas.CellFactory_ColumnaWrapText
		jamTableViewListaDatosRevisionVentas.SetCellFactoryListaCampos(CF, Array As String("DescripcionArticulo"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaDatosRevisionVentas.CellFactory_ColumnaFechaSqlServer
		jamTableViewListaDatosRevisionVentas.SetCellFactoryListaCampos(CF, Array As String("MaxFechaVentas"))
		
						
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaDatosRevisionVentas.CellFactory_ColumnaFechaSqlServer
		jamTableViewListaDatosRevisionVentas.SetCellFactoryListaCampos(CF, Array As String("FechaInicialNAV","FechaInicialUsuarioNAV"))
		
		
		jamTableViewListaDatosRevisionVentas.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array As String("NumTAvisos"),0,0x00FFFFFF,0xFF000000, 0x00FFFFFF,0xFF008000,0xFFFFB6C1,0xFFFF0000)
		jamTableViewListaDatosRevisionVentas.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array As String("TipoPrecioVentaUsuarioNAV"),"SinPrecio",0x00FFFFFF,0xFF000000, 0xFFFFA500,0xFF000000)
		jamTableViewListaDatosRevisionVentas.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array As String("QtyVenta"),0, 0xFFFFA500,0xFF000000, 0xFFFFA500,0xFF000000,0x00FFFFFF,0xFF000000)
		
		
		Dim FtoDef As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoDef.Initialize
		'Fto.ColorBorde=
		FtoDef.ColorFondo=xui.Color_Transparent
		FtoDef.ColorTexto=xui.Color_Black
		Dim FtoNav As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoNav.Initialize
		'Fto.ColorBorde=
		FtoNav.ColorFondo=xui.Color_Transparent
		FtoNav.ColorTexto=xui.Color_Blue
		Dim FtoCosteUsuario As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoCosteUsuario.Initialize
		'Fto.ColorBorde=
		FtoCosteUsuario.ColorFondo=xui.Color_Transparent
		FtoCosteUsuario.ColorTexto=0xFFB22222
		Dim FtoSinPrecio As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoSinPrecio.Initialize
		'Fto.ColorBorde=
		FtoSinPrecio.ColorFondo=xui.Color_Red
		FtoSinPrecio.ColorTexto=xui.Color_White
		jamTableViewListaDatosRevisionVentas.AsignarCellFactoryColumnaTextoNCondiciones(Array("TipoPrecioVentaUsuarioNAV"),FtoDef,Array("NAV","Usuario","SinPrecio"),Array(FtoNav,FtoCosteUsuario,FtoSinPrecio))

		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
		''		Dim dCF As DatosCellFactoryJamTableView
		''		dCF.Initialize
		''		dCF.AliasCampoColumna="RutaAnalisis"
		''		dCF.CellFactoryEnCallBack=False
		''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		jamTableViewListaDatosRevisionVentas.EstadoMenuItem(jamTableViewListaDatosRevisionVentas.MenuBarLinea,False)
		
		'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
		'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
		jamTableViewListaDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas las líneas filtradas","ExcluirTodasLineasFiltradas",Chr(0xF2D4),jamTableViewListaDatosRevisionVentas.MenuBarAcciones)
		'''
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemSeparator
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Ver Avisos Línea Tarifa / Precios Línea","VerAvisosLineaTarifa",Chr(0xF071))
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Excluir TipoTarifa-CodigoTarifa-Artículo del Análisis de Ventas","AddArticuloAArticulosExcluidosDatosRevisionVentas",Chr(0xF2D4))
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Excluir del Análisis de Ventas TODAS las líneas filtradas","ExcluirTodasLineasRegistrosFiltradosDatosRevisionVentas",Chr(0xF2D4))
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemFontMaterialIconsText("Añadir/Editar Precio Venta Usuario","AddEditPrecioVentaUsuario",Chr(0xE851))
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Ver Histórico Ventas","VerHistoricoVentas",Chr(0xF1FE))
		jamTableViewListaDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Editar Cifra Ventas Anual Estimada","EditarCifraVentasAnualEstimada",Chr(0xF044))
		
		jamTableViewListaDatosRevisionVentas.SetPanelInfoVisible(True)
	End If
	pnljamTableViewAnalisisTarifasListaDatosRevisionVentas.BringToFront
	lblInfoMostrada.Text="Análisis Datos Revisión Ventas"
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos para revisión Ventas..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisDatosRevisionVentas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentas=0 where MaxFechaVentas is null")
	'mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentasTalla=0 where MaxFechaVentasTalla is null")
	

	Wait For(AnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasAvisosTarifasVentas")
	
	Dim sbAvisosTarifasVentas As StringBuilder
	sbAvisosTarifasVentas.initialize

	sbAvisosTarifasVentas.Append("Insert into tblAnalisisTarifasVentasAvisosTarifasVentas")

	sbAvisosTarifasVentas.Append(" Select distinct ")
	sbAvisosTarifasVentas.Append(mIDAnalisisTarifasVenta)
	sbAvisosTarifasVentas.Append(" ,tLinTar.TipoTarifa, tLinTar.CodigoTarifa, tLinTar.Articulo")
	sbAvisosTarifasVentas.Append(" ,tNumTarArt.NumPreciosArt")
	sbAvisosTarifasVentas.Append(" ,coalesce(tNumTarArtTalla.NumPreciosArtTalla,0) As NumPreciosArtTalla")
	sbAvisosTarifasVentas.Append(" ,coalesce(tNumTarQtyMin.NumPreciosQtyMin,0) As NumPreciosQtyMin")
	sbAvisosTarifasVentas.Append(" ,coalesce(tNumTarDivisa.NumPreciosDivisa,0) As NumPreciosDivisa")
	sbAvisosTarifasVentas.Append(" , coalesce(tNumUMDifUMVta.NumPreciosUMDifUMVta,0) As NumPreciosUMDifUMVta")
	sbAvisosTarifasVentas.Append(" from tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis tLinTar")
	
	'sbAvisosTarifasVentas.Append(" -- NumPreciosArticulo")
	sbAvisosTarifasVentas.Append(" left join")
	sbAvisosTarifasVentas.Append(" (Select TipoTarifa, CodigoTarifa, Articulo,count(PrecioUnitario) As NumPreciosArt")
	sbAvisosTarifasVentas.Append(" from")
	sbAvisosTarifasVentas.Append(" tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis")
	sbAvisosTarifasVentas.Append(" group by TipoTarifa, CodigoTarifa, Articulo) tNumTarArt")
	sbAvisosTarifasVentas.Append(" on tLinTar.TipoTarifa=tNumTarArt.TipoTarifa And tLinTar.CodigoTarifa=tNumTarArt.CodigoTarifa And tLinTar.Articulo=tNumTarArt.Articulo")
		
	'sbAvisosTarifasVentas.Append(" -- num precios talla")
	sbAvisosTarifasVentas.Append(" left join")
	sbAvisosTarifasVentas.Append(" (Select TipoTarifa, CodigoTarifa, Articulo, Count(PrecioUnitario) As NumPreciosArtTalla")
	sbAvisosTarifasVentas.Append(" from tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis tTar")
	sbAvisosTarifasVentas.Append(" where Variante<>''")
	sbAvisosTarifasVentas.Append(" group by TipoTarifa, CodigoTarifa, Articulo) tNumTarArtTalla")
	sbAvisosTarifasVentas.Append(" on tLinTar.TipoTarifa=tNumTarArtTalla.TipoTarifa And tLinTar.CodigoTarifa=tNumTarArtTalla.CodigoTarifa And tLinTar.Articulo=tNumTarArtTalla.Articulo")
		
	'sbAvisosTarifasVentas.Append(" -- UM<>UM venta")
	sbAvisosTarifasVentas.Append(" left join")
	sbAvisosTarifasVentas.Append(" (Select TipoTarifa, CodigoTarifa, Articulo, Count(PrecioUnitario) As NumPreciosUMDifUMVta")
	sbAvisosTarifasVentas.Append(" FROM tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis tTar")
	sbAvisosTarifasVentas.Append(" where UMVenta<>'' and UM<>UMVenta")
	sbAvisosTarifasVentas.Append(" group by TipoTarifa, CodigoTarifa, Articulo) tNumUMDifUMVta")
	sbAvisosTarifasVentas.Append(" on tLinTar.TipoTarifa=tNumUMDifUMVta.TipoTarifa And tLinTar.CodigoTarifa=tNumUMDifUMVta.CodigoTarifa And tLinTar.Articulo=tNumUMDifUMVta.Articulo")
		
	'sbAvisosTarifasVentas.Append(" --num precios Qty Min")
	sbAvisosTarifasVentas.Append(" left join")
	sbAvisosTarifasVentas.Append(" (Select TipoTarifa, CodigoTarifa, Articulo, Count(PrecioUnitario) As NumPreciosQtyMin")
	sbAvisosTarifasVentas.Append(" FROM tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis tTar")
	sbAvisosTarifasVentas.Append(" where CantidadMinima>0")
	sbAvisosTarifasVentas.Append(" group by TipoTarifa, CodigoTarifa, Articulo) tNumTarQtyMin")
	sbAvisosTarifasVentas.Append(" on tLinTar.TipoTarifa=tNumTarQtyMin.TipoTarifa And tLinTar.CodigoTarifa=tNumTarQtyMin.CodigoTarifa And tLinTar.Articulo=tNumTarQtyMin.Articulo")

	'sbAvisosTarifasVentas.Append(" --num precios divisas")
	sbAvisosTarifasVentas.Append(" left join")
	sbAvisosTarifasVentas.Append(" (Select TipoTarifa, CodigoTarifa, Articulo, Count(PrecioUnitario) As NumPreciosDivisa")
	sbAvisosTarifasVentas.Append(" FROM tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis tTar")
	sbAvisosTarifasVentas.Append(" where Moneda<>''")
	sbAvisosTarifasVentas.Append(" group by TipoTarifa, CodigoTarifa, Articulo) tNumTarDivisa")
	sbAvisosTarifasVentas.Append(" on tLinTar.TipoTarifa=tNumTarDivisa.TipoTarifa And tLinTar.CodigoTarifa=tNumTarDivisa.CodigoTarifa And tLinTar.Articulo=tNumTarDivisa.Articulo")
	mSQL.ExecNonQuery(sbAvisosTarifasVentas)
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasNumAvisosTarifasVentas")
	
	Dim sbNumAvisosTarifasVentas As StringBuilder
	sbNumAvisosTarifasVentas.Initialize
	sbNumAvisosTarifasVentas.Append(" insert into tblAnalisisTarifasVentasNumAvisosTarifasVentas")
	sbNumAvisosTarifasVentas.append(" Select ")
	sbNumAvisosTarifasVentas.append(mIDAnalisisTarifasVenta)
	sbNumAvisosTarifasVentas.append(", TipoTarifa, CodigoTarifa, Articulo")
	sbNumAvisosTarifasVentas.append(", (AvisoNumPreciosArt+AvisoNumPreciosArtTalla+AvisoNumPreciosQtyMin+AvisoNumPreciosDivisa+AvisoNumPreciosUMDifUMVta) As NumTAvisos")
	sbNumAvisosTarifasVentas.append(" from")
	sbNumAvisosTarifasVentas.append(" (Select TipoTarifa, CodigoTarifa, Articulo")
	sbNumAvisosTarifasVentas.append(", Case when NumPreciosArt>1 Then 1 Else 0 end as AvisoNumPreciosArt, Case when NumPreciosArtTalla>0 Then 1 Else 0 end as AvisoNumPreciosArtTalla")
	sbNumAvisosTarifasVentas.append(", Case when NumPreciosQtyMin>0 Then 1 Else 0 end As AvisoNumPreciosQtyMin, Case when NumPreciosDivisa>0 Then 1 Else 0 end as AvisoNumPreciosDivisa")
	sbNumAvisosTarifasVentas.append(",Case when NumPreciosUMDifUMVta>0 Then 1 Else 0 end as AvisoNumPreciosUMDifUMVta")
	sbNumAvisosTarifasVentas.append(" from tblAnalisisTarifasVentasAvisosTarifasVentas) ")
	mSQL.ExecNonQuery(sbNumAvisosTarifasVentas)
	
	Dim sbNumAvisosT As StringBuilder
	sbNumAvisosT.Initialize
	sbNumAvisosT.Append("update tblAnalisisTarifasAnalisisDatosRevisionVentas set NumTAvisos=tNumAv.NumTAvisos from (")
	sbNumAvisosT.Append(" Select IDAnalisisTarifas, TipoTarifa, CodigoTarifa,Articulo, NumTAvisos from tblAnalisisTarifasVentasNumAvisosTarifasVentas) tNumAv")
	sbNumAvisosT.Append(" where tblAnalisisTarifasAnalisisDatosRevisionVentas.IDAnalisisTarifas=tNumAv.IDAnalisisTarifas")
	sbNumAvisosT.Append(" And tblAnalisisTarifasAnalisisDatosRevisionVentas.TipoTarifa=tNumAv.TipoTarifa")
	sbNumAvisosT.Append(" And tblAnalisisTarifasAnalisisDatosRevisionVentas.CodigoTarifa=tNumAv.CodigoTarifa")
	sbNumAvisosT.Append(" And tblAnalisisTarifasAnalisisDatosRevisionVentas.Articulo=tNumAv.Articulo")
	mSQL.ExecNonQuery(sbNumAvisosT)
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisDatosRevisionVentas order by TipoTarifa, CodigoTarifa, Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
				Return False
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
	
	Wait For(CargarEstadosAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	Dim EstadoVentas As String=mData.Get("EstadoVentas")
	lblEstadoSeccion.Text=EstadoVentas
	lblEstadoSeccion.Visible=True
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub ActualizarListaAnalisisDatosRevisionVentas As ResumableSub
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasAnalisisDatosRevisionVentas")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene datos para revisión por parte de Ventas.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasAnalisisDatosRevisionVentas",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisDatosRevisionVentas set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

'Sub ActualizarNumAvisosAnalisisTarifasVentas As ResumableSub
'
'	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasNumAvisosAnalisisTarifasVentas")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasVentasNumAvisosTarifasVentas"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
''			jamLoadingIndicator1.Close
''			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene datos para revisión por parte de Ventas.","Aviso")
''			Wait For (msa) Msgbox_Result
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
''			Dim mData0 As Map=lstReg.Get(0)
''			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasVentasNumAvisosAnalisisTarifasVentas",mData0,"")
'			Dim mData As Map=lstReg.Get(0)
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("mData", mData)
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasVentasNumAvisosAnalisisTarifasVentas",lstReg)
'			mSQL.ExecNonQuery2("update tblAnalisisTarifasVentasNumAvisosAnalisisTarifasVentas set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
'		End If
'	End If
'	Return mRes
'End Sub

Sub AnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis As ResumableSub

	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene datos para revisión por parte de Ventas.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis",mData0,"")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasVentasLineasVigentesTarifasVentaArticulosSeleccionadosAnalisis set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Sub AnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis As ResumableSub

	mSQL.ExecNonQuery("delete from tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis")
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas, sFechaFinalVentas), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene datos para revisión por parte de Ventas.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis",mData0,"")
			'Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub




Sub jamTableViewListaDatosRevisionVentas_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "Actualizar"
			AnalisisDatosRevisionVentas
		
		Case "ExcluirTodasLineasFiltradas"
			ExcluirTodasLineasRegistrosFiltradosDatosRevisionVentas
	End Select
End Sub

Sub jamTableViewListaDatosRevisionVentas_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	
End Sub

Sub jamTableViewListaDatosRevisionVentas_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "VerAvisosLineaTarifa"
			Dim FilaSel As Int=jamTableViewListaDatosRevisionVentas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")

			'DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(TipoTarifaSel, CodigoTarifaSel, ArticuloTarifaSel,DescripcionArticuloTarifaSel)
			
			Dim cAnTarAvisosVenta As cAnalisisTarifasAvisosTarifaVenta
			cAnTarAvisosVenta.Initialize(Me,frm.RootPane, frm, mIDAnalisisTarifasVenta, TipoTarifaSel,CodigoTarifaSel,ArticuloTarifaSel,DescripcionArticuloTarifaSel)
			'cAnTarAvisosVenta.Show
			Wait For cAnalisisTarifasAvisosTarifaVenta_Done(DatosEditados As Boolean)
			If DatosEditados Then
				AnalisisDatosRevisionVentas
			End If
			
		Case "AddArticuloAArticulosExcluidosDatosRevisionVentas"
			Dim FilaSel As Int=jamTableViewListaDatosRevisionVentas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")

			AddArticuloAArticulosExcluidosDatosRevisionVentas(TipoTarifaSel, CodigoTarifaSel, ArticuloTarifaSel,DescripcionArticuloTarifaSel)
			
		Case "ExcluirTodasLineasRegistrosFiltradosDatosRevisionVentas"
			ExcluirTodasLineasRegistrosFiltradosDatosRevisionVentas
			
		Case "EditarCifraVentasAnualEstimada"
			Dim FilaSel As Int=jamTableViewListaDatosRevisionVentas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim QtyVtasEstimadaActual As Int=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"QtyVentasAnualEstimada")
			EditarCifraVentasAnualEstimada(TipoTarifaSel, CodigoTarifaSel,ArticuloSel,QtyVtasEstimadaActual)
			
		Case "AddEditPrecioVentaUsuario"
			Dim FilaSel As Int=jamTableViewListaDatosRevisionVentas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"Articulo")
			AddEditarPrecioVentaUsuario(TipoTarifaSel, CodigoTarifaSel,ArticuloSel)
			
		Case "VerHistoricoVentas"
			Dim FilaSel As Int=jamTableViewListaDatosRevisionVentas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloSel As String=jamTableViewListaDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")
			VerHistoricoVentas(TipoTarifaSel, CodigoTarifaSel,ArticuloSel, DescripcionArticuloSel)
			
		Case "VerArticuloNAV"
			Dim ArticuloSel As String
			Dim FilaSeleccionada As Int=jamTableViewListaDatosRevisionVentas.IndicesFilasSeleccionadas.Get(0)
			Dim lstInfoFila As List=jamTableViewListaDatosRevisionVentas.DatosRegistroIndiceFila(FilaSeleccionada)
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
			wait for(Utilidades.MsgBox2XUI("Confirma","¿Mostrar en Navision la ficha del artículo " & ArticuloSel & "?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
	End Select
End Sub

Sub ExcluirTodasLineasRegistrosFiltradosDatosRevisionVentas

	If jamTableViewListaDatosRevisionVentas.NumeroTotalRegistros-jamTableViewListaDatosRevisionVentas.NumeroTotalRegistrosFiltrados=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay registros filtrados.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
		
	Dim msa As Object = xui.Msgbox2Async("¿Excluir del análisis TODAS las líneas filtradas?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim UUIDBatch As String=GenerarUUIDv4
	
	Dim rsExcl As ResultSet=jamTableViewListaDatosRevisionVentas.SQL.ExecQuery2("select * from tblOrigenDatos where " & jamTableViewListaDatosRevisionVentas.sCamposFiltrados,jamTableViewListaDatosRevisionVentas.lstValoresFiltros)
	Dim lstCommands As List
	lstCommands.Initialize
	Do While rsExcl.NextRow
		Dim TipoTarifa As Int=rsExcl.GetInt("TipoTarifa")
		Dim CodigoTarifa As String=rsExcl.Getstring("CodigoTarifa")
		Dim Articulo As String=rsExcl.Getstring("Articulo")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasTipoCodigoArticuloBatchInsertar",Array(UUIDBatch, mIDAnalisisTarifasVenta, TipoTarifa,CodigoTarifa,Articulo))
		lstCommands.Add(cmd)
	Loop
	rsExcl.Close
	JRDCQuery.EjecutarBatch(Main.rdcLinkNav,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	If result=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query AnalisisTarifasTipoCodigoArticuloBatchInsertar","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim Comando As String="AnalisisTarifasExcluirBatchArticulosDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDBatch, DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	'Eliminar el batch está incluido en el SP anterior
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasTipoCodigoArticuloBatchEliminar",Array(UUIDBatch))
'	JRDCQuery.EjecutarBatch(Main.rdcLinkNav,lstCommands,Me)
'	Wait For EjecutarBatch_Completed (result As Boolean)
'	If result=False Then
'	Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query AnalisisTarifasTipoCodigoArticuloBatchEliminar","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	

	jamLoadingIndicator1.MensajeLoading="Cargando datos para revisión Ventas..."
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisDatosRevisionVentas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		'Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentas=0 where MaxFechaVentas is null")
	'mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentasTalla=0 where MaxFechaVentasTalla is null")
	
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisDatosRevisionVentas order by TipoTarifa, CodigoTarifa, Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
				'Return False
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return 'True
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
	
End Sub





Sub AddEditarPrecioVentaUsuario(TipoTarifa As String, CodigoTarifa As String, Articulo As String) 

	Wait For (PrecioVentaUsuarioTipoTarifaCodigoTarifaArticulo(TipoTarifa,CodigoTarifa, Articulo)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim mData As Map
	mData.Initialize
	mData.put("IDAnalisisTarifas",mIDAnalisisTarifasVenta)
	mData.put("TipoTarifa",TipoTarifa)
	mData.put("CodigoTarifa",CodigoTarifa)
	mData.put("Articulo",Articulo)
	If Accion="SinPrecioVentaUsuario" Then
		fRPrecioVentaUsuario.Initialize(Me,"fRPrecioVentaUsuario",frm,"Nuevo Precio Venta Usuario","Nuevo","AnalisisTarifasPrecioVentaUsuarioFormRegistro.json",mData)
	Else
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mP As Map=lstReg.Get(0)
		Dim PrecioVentaUsu As Double=mP.Get("PrecioUnitario")
		Dim DivisaUsu As String=mP.Get("Divisa")
		mData.put("PrecioUnitario",PrecioVentaUsu)
		mData.put("Divisa",DivisaUsu)
		fRPrecioVentaUsuario.Initialize(Me,"fRPrecioVentaUsuario",frm,"Editar Precio Venta Usuario","Editar","AnalisisTarifasPrecioVentaUsuarioFormRegistro.json",mData)
	End If
End Sub

Sub PrecioVentaUsuarioTipoTarifaCodigoTarifaArticulo(TipoTarifa As String, CodigoTarifa As String, Articulo As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasPrecioVentaUsuarioTipoTarifaCodigoTarifaArticulo"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifa,CodigoTarifa, Articulo), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay Precio de Venta Usuario para el Tipo Tarifa-Codigo Tarifa-Articulo seleccionado.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinPrecioVentaUsuario"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub fRPrecioVentaUsuario_GrabarNuevoRegistro(lstDatosCamposRegistroNuevo As List)

	Dim TipoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("TipoTarifa").ValorOutputCampo
	Dim CodigoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("CodigoTarifa").ValorOutputCampo
	Dim Articulo As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Articulo").ValorOutputCampo
	Dim Divisa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Divisa").ValorOutputCampo
	Dim PrecioVentaUsuario As Double=fRPrecioVentaUsuario.DatosCampoSeleccionado("PrecioUnitario").ValorOutputCampo

	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioVentas", _
		Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa, Articulo,PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible crear el nuevo precio de venta usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
	End If
	fRPrecioVentaUsuario.CerrarFormRegistro
End Sub

Sub fRPrecioVentaUsuario_GrabarEdicionRegistro(lstInfoCampoJamFormRegistro As List)
	Dim TipoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("TipoTarifa").ValorOutputCampo
	Dim CodigoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("CodigoTarifa").ValorOutputCampo
	Dim Articulo As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Articulo").ValorOutputCampo
	Dim Divisa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Divisa").ValorOutputCampo
	Dim PrecioVentaUsuario As Double=fRPrecioVentaUsuario.DatosCampoSeleccionado("PrecioUnitario").ValorOutputCampo

	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioVentas", _
		Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa, Articulo,PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible modificar el precio de venta usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
	End If
	fRPrecioVentaUsuario.CerrarFormRegistro

End Sub

Sub VerHistoricoVentas(TipoTarifa As String, CodigoTarifa As String, Articulo As String, DescripcionArticulo As String)
	Dim cInfoVentas As cAnalisisTarifasInfoVentas
	cInfoVentas.Initialize(Me,frm.RootPane, TipoTarifa, CodigoTarifa, Articulo, DescripcionArticulo, FechaInicialVentas, FechaFinalVentas)
	wait for (cInfoVentas) cAnalisisTarifasInfoVentas_Done (mDatosLinSel As Map)
'	
	If False=mDatosLinSel.Get("PrecioSeleccionado") Then Return
'		Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ningún precio para añadirlo a la lista de precios de venta usuario.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	Dim PrecioVentaUsuario As Double=mDatosLinSel.Get("PrecioDivisa")
	Dim DivisaPrecioVentaUsuario As String=mDatosLinSel.Get("Divisa")
	
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioVentas", _
		Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa, Articulo,PrecioVentaUsuario, DivisaPrecioVentaUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			PrecioVentaUsuario, DivisaPrecioVentaUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible crear el nuevo precio de venta usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
End Sub

#End Region

#Region AnalisisCostesArticulosCompra
Sub AnalisisCostesArticulosCompra As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("AnalisisCostesArticulosCompra")
	End If
	If pnljamTableViewAnalisisTarifasListaArticulosCompra.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasAnalisisCostesArticulosCompra")
		Sleep(0)
		
'		jamTableViewListaArticulosCompra.AbrirCamposBuilder
'		Return

		jamTableViewListaArticulosCompra.AddMenuItemFontAwesomeToMenuInMenuBar("Cerrar Análisis Compra","CerrarAnalisisCompra",Chr(0xF023),jamTableViewListaArticulosCompra.MenuBarAcciones)
		jamTableViewListaArticulosCompra.AddMenuItemFontAwesomeToMenuInMenuBar("Abrir Análisis Compra","AbrirAnalisisCompra",Chr(0xF09C),jamTableViewListaArticulosCompra.MenuBarAcciones)

		jamTableViewListaArticulosCompra.AddContextMenuItemSeparator
		Dim img As Image
		img.InitializeSample(File.DirAssets,"navision.png",24,24)
		jamTableViewListaArticulosCompra.AddContextMenuItemImage("Artículo NAV","VerArticuloNAV",img)
		jamTableViewListaArticulosCompra.AddContextMenuItemSeparator
		jamTableViewListaArticulosCompra.AddContextMenuItemFontAwesomeText("Fecha Ultima Compra","FechaUltimaCompra",Chr(0xF073))
		jamTableViewListaArticulosCompra.AddContextMenuItemFontAwesomeText("Ver Histórico Compras","VerHistoricoCompras",Chr(0xF1FE))
		jamTableViewListaArticulosCompra.AddContextMenuItemFontAwesomeText("Ver Avisos Línea Tarifa Compra / Precios Línea","VerAvisosLineaTarifaCompra",Chr(0xF071))
		
		jamTableViewListaArticulosCompra.AddContextMenuItemFontAwesomeTextColumna("CosteUnitarioArticulo","Coste Unitario Artículo=Costes Artículo Usuario","AddEditarCosteArticuloUsuarioValorCosteUnitarioArticulo",Chr(0xE851))
		
		Dim rSub As ResumableSub=jamTableViewListaArticulosCompra.ConfigurarTableView("ListaAnalisisTarifasListaAnalisisCostesArticulosCompra.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaArticulosCompra.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
		'''jamTableViewListaArticulosCompra.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array As String("PrecioCompraUsuarioNAV"),0,0x00FFFFFF,0xFF000000, 0x00FFFFFF,0xFF008000,0xFFFFB6C1,0xFFFF0000)
		jamTableViewListaArticulosCompra.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array As String("NumTAvisos"),0,0x00FFFFFF,0xFF000000, 0x00FFFFFF,0xFF008000,0xFFFFB6C1,0xFFFF0000)
		jamTableViewListaArticulosCompra.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array As String("TipoPrecioCompraUsuarioNAV"),"SinPrecio",0x00FFFFFF,0xFF000000, 0xFFFFA500,0xFF000000)
		''
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosCompra.CellFactory_ColumnaFechaSqlServer
		jamTableViewListaArticulosCompra.SetCellFactoryListaCampos(CF, Array As String("FechaPrecioCompraUsuarioNAV", "FechaUltimaEntradaCompraFab", "FechaInicialNAV"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosCompra.CellFactory_ColumnaWrapText
		jamTableViewListaArticulosCompra.SetCellFactoryListaCampos(CF, Array As String("DescripcionArticulo", "NombreProveedor"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosCompra.CellFactory_FormatoStringDecimalesColumnaNumerica
		CF.CellFactoryEnCallBack=False
		CF.params=Array("#,##0.00####")
		jamTableViewListaArticulosCompra.SetCellFactoryListaCampos(CF,Array("PrecioCompraNAV","PrecioCompraNAVEUR","CosteUnitarioArticulo","PrecioCompraUsuarioNAVEUR"))


		Dim FtoDef As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoDef.Initialize
		'Fto.ColorBorde=
		FtoDef.ColorFondo=xui.Color_Transparent
		FtoDef.ColorTexto=xui.Color_Black
		Dim FtoNav As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoNav.Initialize
		'Fto.ColorBorde=
		FtoNav.ColorFondo=xui.Color_Transparent
		FtoNav.ColorTexto=xui.Color_Blue
		Dim FtoCosteUsuario As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoCosteUsuario.Initialize
		'Fto.ColorBorde=
		FtoCosteUsuario.ColorFondo=xui.Color_Transparent
		FtoCosteUsuario.ColorTexto=0xFFB22222
		Dim FtoSinPrecio As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoSinPrecio.Initialize
		'Fto.ColorBorde=
		FtoSinPrecio.ColorFondo=xui.Color_Red
		FtoSinPrecio.ColorTexto=xui.Color_White
		jamTableViewListaArticulosCompra.AsignarCellFactoryColumnaTextoNCondiciones(Array("TipoPrecioCompraUsuarioNAV"),FtoDef,Array("NAV","Usuario","SinPrecio"),Array(FtoNav,FtoCosteUsuario,FtoSinPrecio))

		
		
		jamTableViewListaArticulosCompra.AddContextMenuItemSeparator
		jamTableViewListaArticulosCompra.AddContextMenuItemFontMaterialIconsText("Añadir/Editar Coste Artículo Usuario","AddEditCosteArticuloUsuario",Chr(0xE851))
		
		jamTableViewListaArticulosCompra.SetPanelInfoVisible(True)
	End If
	pnljamTableViewAnalisisTarifasListaArticulosCompra.BringToFront
	lblInfoMostrada.Text="Análisis Costes Artículos Compra"
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos Artículos Compra..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisCostesArticulosCompra) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	Wait For(AnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasAvisosTarifasCompras")
	
	Dim sbAvisosTarifasCompras As StringBuilder
	sbAvisosTarifasCompras.initialize
	
	sbAvisosTarifasCompras.Append("Insert into tblAnalisisTarifasVentasAvisosTarifasCompras")

	sbAvisosTarifasCompras.Append(" Select ")
	sbAvisosTarifasCompras.Append(mIDAnalisisTarifasVenta)
	'sbAvisosTarifasCompras.Append(" ,tLinTar.Proveedor, tLinTar.Articulo")
	sbAvisosTarifasCompras.Append(" ,tLinTar.Articulo")
	sbAvisosTarifasCompras.Append(" ,tNumTarArt.NumPreciosArt")
	sbAvisosTarifasCompras.Append(" ,coalesce(tNumTarArtTalla.NumPreciosArtTalla,0) As NumPreciosArtTalla")
	sbAvisosTarifasCompras.Append(" ,coalesce(tNumTarQtyMin.NumPreciosQtyMin,0) As NumPreciosQtyMin")
	sbAvisosTarifasCompras.Append(" ,coalesce(tNumTarDivisa.NumPreciosDivisa,0) As NumPreciosDivisa")
	'sbAvisosTarifasCompras.Append(" , coalesce(tNumUMDifUMVta.NumPreciosUMDifUMVta,0) As NumPreciosUMDifUMVta")
	sbAvisosTarifasCompras.Append(" , 0 As NumPreciosUMDifUMCompra")
	sbAvisosTarifasCompras.Append(" from (select Distinct Articulo from tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis) tLinTar")
	
	'sbAvisosTarifasCompras.Append(" -- NumPreciosArticulo")
	sbAvisosTarifasCompras.Append(" left join")
	'sbAvisosTarifasCompras.Append(" (Select Proveedor, Articulo,count(PrecioCompra) As NumPreciosArt")
	sbAvisosTarifasCompras.Append(" (Select Articulo,count(PrecioCompra) As NumPreciosArt")
	sbAvisosTarifasCompras.Append(" from")
	sbAvisosTarifasCompras.Append(" tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis")
	'sbAvisosTarifasCompras.Append(" group by Proveedor, Articulo) tNumTarArt")
	sbAvisosTarifasCompras.Append(" group by Articulo) tNumTarArt")
	'sbAvisosTarifasCompras.Append(" on tLinTar.Proveedor=tNumTarArt.Proveedor And tLinTar.Articulo=tNumTarArt.Articulo")
	sbAvisosTarifasCompras.Append(" on tLinTar.Articulo=tNumTarArt.Articulo")
		
	'sbAvisosTarifasCompras.Append(" -- num precios talla")
	sbAvisosTarifasCompras.Append(" left join")
	'sbAvisosTarifasCompras.Append(" (Select Proveedor, Articulo, Count(PrecioCompra) As NumPreciosArtTalla")
	sbAvisosTarifasCompras.Append(" (Select Articulo, Count(PrecioCompra) As NumPreciosArtTalla")
	sbAvisosTarifasCompras.Append(" from tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis tTar")
	sbAvisosTarifasCompras.Append(" where Variante<>''")
	'sbAvisosTarifasCompras.Append(" group by Proveedor, Articulo) tNumTarArtTalla")
	sbAvisosTarifasCompras.Append(" group by Articulo) tNumTarArtTalla")
	'sbAvisosTarifasCompras.Append(" on tLinTar.Proveedor=tNumTarArtTalla.Proveedor And tLinTar.Articulo=tNumTarArtTalla.Articulo")
	sbAvisosTarifasCompras.Append(" on tLinTar.Articulo=tNumTarArtTalla.Articulo")
		
		''' PENDIENTE!!!!!!!!
		
''''	'sbAvisosTarifasCompras.Append(" -- UM<>UM compra")
''''	sbAvisosTarifasCompras.Append(" left join")
''''	sbAvisosTarifasCompras.Append(" (Select Proveedor, Articulo, Count(PrecioCompra) As NumPreciosUMDifUMCompra")
''''	sbAvisosTarifasCompras.Append(" FROM tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis tTar")
''''	sbAvisosTarifasCompras.Append(" where UM<>UMVenta")
''''	sbAvisosTarifasCompras.Append(" group by Proveedor, Articulo) tNumUMDifUMVta")
''''	sbAvisosTarifasCompras.Append(" on tLinTar.Proveedor=tNumUMDifUMVta.Proveedor And tLinTar.Articulo=tNumUMDifUMVta.Articulo")
		
	'sbAvisosTarifasCompras.Append(" --num precios Qty Min")
	sbAvisosTarifasCompras.Append(" left join")
	'sbAvisosTarifasCompras.Append(" (Select Proveedor, Articulo, Count(PrecioCompra) As NumPreciosQtyMin")
	sbAvisosTarifasCompras.Append(" (Select Articulo, Count(PrecioCompra) As NumPreciosQtyMin")
	sbAvisosTarifasCompras.Append(" FROM tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis tTar")
	sbAvisosTarifasCompras.Append(" where MinQty>0")
	'sbAvisosTarifasCompras.Append(" group by Proveedor, Articulo) tNumTarQtyMin")
	sbAvisosTarifasCompras.Append(" group by Articulo) tNumTarQtyMin")
	'sbAvisosTarifasCompras.Append(" on tLinTar.Proveedor=tNumTarQtyMin.Proveedor And tLinTar.Articulo=tNumTarQtyMin.Articulo")
	sbAvisosTarifasCompras.Append(" on tLinTar.Articulo=tNumTarQtyMin.Articulo")

	'sbAvisosTarifasCompras.Append(" --num precios divisas")
	sbAvisosTarifasCompras.Append(" left join")
	'sbAvisosTarifasCompras.Append(" (Select Proveedor, Articulo, Count(PrecioCompra) As NumPreciosDivisa")
	sbAvisosTarifasCompras.Append(" (Select Articulo, Count(PrecioCompra) As NumPreciosDivisa")
	sbAvisosTarifasCompras.Append(" FROM tblAnalisisTarifasLineasVigentesTarifasCompraArticulosCompraAnalisis tTar")
	sbAvisosTarifasCompras.Append(" where Moneda<>''")
	'sbAvisosTarifasCompras.Append(" group by Proveedor, Articulo) tNumTarDivisa")
	sbAvisosTarifasCompras.Append(" group by Articulo) tNumTarDivisa")
	'sbAvisosTarifasCompras.Append(" on tLinTar.Proveedor=tNumTarDivisa.Proveedor And tLinTar.Articulo=tNumTarDivisa.Articulo")
	sbAvisosTarifasCompras.Append(" on tLinTar.Articulo=tNumTarDivisa.Articulo")
	mSQL.ExecNonQuery(sbAvisosTarifasCompras)
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasNumAvisosTarifasCompras")
	
	Dim sbNumAvisosTarifasCompras As StringBuilder
	sbNumAvisosTarifasCompras.Initialize
	sbNumAvisosTarifasCompras.Append(" insert into tblAnalisisTarifasVentasNumAvisosTarifasCompras")
	sbNumAvisosTarifasCompras.append(" Select ")
	sbNumAvisosTarifasCompras.append(mIDAnalisisTarifasVenta)
	'sbNumAvisosTarifasCompras.append(", Proveedor, Articulo")
	sbNumAvisosTarifasCompras.append(", Articulo")
	sbNumAvisosTarifasCompras.append(", (AvisoNumPreciosArt+AvisoNumPreciosArtTalla+AvisoNumPreciosQtyMin+AvisoNumPreciosDivisa+AvisoNumPreciosUMDifUMCompra) As NumTAvisos")
	sbNumAvisosTarifasCompras.append(" from")
	'sbNumAvisosTarifasCompras.append(" (Select Proveedor, Articulo")
	sbNumAvisosTarifasCompras.append(" (Select Articulo")
	sbNumAvisosTarifasCompras.append(", Case when NumPreciosArt>1 Then 1 Else 0 end as AvisoNumPreciosArt, Case when NumPreciosArtTalla>0 Then 1 Else 0 end as AvisoNumPreciosArtTalla")
	sbNumAvisosTarifasCompras.append(", Case when NumPreciosQtyMin>0 Then 1 Else 0 end As AvisoNumPreciosQtyMin, Case when NumPreciosDivisa>0 Then 1 Else 0 end as AvisoNumPreciosDivisa")
	sbNumAvisosTarifasCompras.append(",Case when NumPreciosUMDifUMCompra>0 Then 1 Else 0 end as AvisoNumPreciosUMDifUMCompra")
	sbNumAvisosTarifasCompras.append(" from tblAnalisisTarifasVentasAvisosTarifasCompras) ")
	mSQL.ExecNonQuery(sbNumAvisosTarifasCompras)
	
	Dim sbNumAvisosT As StringBuilder
	sbNumAvisosT.Initialize
	sbNumAvisosT.Append("update tblAnalisisTarifasAnalisisCostesArticulosCompra set NumTAvisos=tNumAv.NumTAvisos from (")
	'sbNumAvisosT.Append(" Select IDAnalisisTarifas, Proveedor,Articulo, NumTAvisos from tblAnalisisTarifasVentasNumAvisosTarifasCompras) tNumAv")
	sbNumAvisosT.Append(" Select IDAnalisisTarifas, Articulo, NumTAvisos from tblAnalisisTarifasVentasNumAvisosTarifasCompras) tNumAv")
	sbNumAvisosT.Append(" where tblAnalisisTarifasAnalisisCostesArticulosCompra.IDAnalisisTarifas=tNumAv.IDAnalisisTarifas")
	'sbNumAvisosT.Append(" And tblAnalisisTarifasAnalisisCostesArticulosCompra.Proveedor=tNumAv.Proveedor")
	sbNumAvisosT.Append(" And tblAnalisisTarifasAnalisisCostesArticulosCompra.Articulo=tNumAv.Articulo")
	mSQL.ExecNonQuery(sbNumAvisosT)
	
'	Wait For(ActualizarAnalisisTarifasVentasNumAvisosTarifasCompras) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion<>"OK" Then
'		SalirModulo
'		Return False
'	End If
	

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisCostesArticulosCompra order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosCompra.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosCompra.AbrirCamposBuilder
				Return False
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
	
	Wait For(CargarEstadosAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	Dim EstadoCompras As String=mData.Get("EstadoCostesCompra")
	lblEstadoSeccion.Text=EstadoCompras
	lblEstadoSeccion.Visible=True
	

	If CheckEstadoPendienteTerminadoAnalisisCompras=0 Then
		Dim msa As Object = xui.Msgbox2Async("Todas las líneas de análisis de costes de compra tienen precio asignado","", "Sí","", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
	End If
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub

Sub CheckEstadoPendienteTerminadoAnalisisCompras As Int
	Dim NumArtsSinPrecio As Int=mSQL.ExecQuerySingleResult2("select count(*) from tblAnalisisTarifasAnalisisCostesArticulosCompra where TipoPrecioCompraUsuarioNAV=?",Array As String("SinPrecio"))
	Return NumArtsSinPrecio
	
End Sub


Sub ActualizarListaAnalisisCostesArticulosCompra As ResumableSub
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasAnalisisCostesArticulosCompra")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaArticulosSistemaAprovCompras"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene artículos de compra relacionados.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasAnalisisCostesArticulosCompra",mData0,"")
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasAnalisisCostesArticulosCompra",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisCostesArticulosCompra set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub
'''
'''Sub ActualizarAnalisisTarifasVentasNumAvisosTarifasCompras As ResumableSub
'''	Dim DateFormatAnt As String=DateTime.DateFormat
'''	DateTime.DateFormat="yyyy-MM-dd"
'''	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
'''	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
'''	DateTime.DateFormat=DateFormatAnt
'''	
'''	mSQL.ExecNonQuery("delete from tblAnalisisTarifasVentasNumAvisosTarifasCompras")
'''	Dim Accion As String
'''	Dim mRes As Map
'''	mRes.Initialize
'''	Dim Comando As String="AnalisisTarifasVentasNumAvisosTarifasCompras"
'''	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas), Me)
'''
'''	Wait For DatosJRDC_Completed (mResult As Map)
'''
'''	If mResult.Get("ConnOK")=False Then
'''		jamLoadingIndicator1.Close
'''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'''		Wait For (msa) Msgbox_Result
'''		Accion="NOK"
'''		mRes.Put("Accion", Accion)
'''	Else
'''
'''		If mResult.Get("ReqOK")=False Then
'''			jamLoadingIndicator1.Close
''''			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene artículos de compra relacionados.","Aviso")
''''			Wait For (msa) Msgbox_Result
'''			Accion="OK"
'''			mRes.Put("Accion", Accion)
'''		Else
'''			Dim lstReg As List=mResult.Get("lstRes")
''''			Dim mData0 As Map=lstReg.Get(0)
''''			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasVentasNumAvisosTarifasCompras",mData0,"")
'''			Dim mData As Map=lstReg.Get(0)
'''			Accion="OK"
'''			mRes.Put("Accion", Accion)
'''			mRes.Put("mData", mData)
'''			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasVentasNumAvisosTarifasCompras",lstReg)
'''			mSQL.ExecNonQuery2("update tblAnalisisTarifasVentasNumAvisosTarifasCompras set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
'''		End If
'''	End If
'''	Return mRes
'''End Sub

Sub jamTableViewListaArticulosCompra_MenuBarMenuItem_Action(TagMenuItem As String)
	
	Select TagMenuItem
		Case "Actualizar"
			AnalisisCostesArticulosCompra
	End Select
End Sub

Sub jamTableViewListaArticulosCompra_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddEditCosteArticuloUsuario"
			Dim FilaSel As Int=jamTableViewListaArticulosCompra.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Articulo")
			'Dim ProveedorSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Proveedor")
			AddEditarCosteArticuloUsuario(ArticuloSel)
			
		Case "AddEditarCosteArticuloUsuarioValorCosteUnitarioArticulo"
			Dim FilaSel As Int=jamTableViewListaArticulosCompra.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim CosteUnitarioArticulo As Double=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"CosteUnitarioArticulo")
			AddEditarCosteArticuloUsuarioValor(ArticuloSel, CosteUnitarioArticulo)
			
		Case "VerArticuloNAV"
			Dim ArticuloSel As String
			Dim FilaSeleccionada As Int=jamTableViewListaArticulosCompra.IndicesFilasSeleccionadas.Get(0)
			Dim lstInfoFila As List=jamTableViewListaArticulosCompra.DatosRegistroIndiceFila(FilaSeleccionada)
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
			wait for(Utilidades.MsgBox2XUI("Confirma","¿Mostrar en Navision la ficha del artículo " & ArticuloSel & "?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
			
		Case "VerAvisosLineaTarifaCompra"
			Dim FilaSel As Int=jamTableViewListaArticulosCompra.GetIndiceFilaSeleccionada
'			Dim TipoTarifaSel As Int=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
'			Dim CodigoTarifaSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloTarifaSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloTarifaSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")

			'DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(TipoTarifaSel, CodigoTarifaSel, ArticuloTarifaSel,DescripcionArticuloTarifaSel)
			
			Dim cAnTarAvisosCompra As cAnalisisTarifasAvisosTarifaCompra
			cAnTarAvisosCompra.Initialize(Me,frm.RootPane, frm, mSQL,  mIDAnalisisTarifasVenta, ArticuloTarifaSel,DescripcionArticuloTarifaSel)
			'cAnTarAvisosVenta.Show
			Wait For cAnalisisTarifasAvisosTarifaCompra_Done(DatosEditados As Boolean)
			If DatosEditados Then
				AnalisisCostesArticulosCompra
			End If
			
		Case "VerHistoricoCompras"
			Dim FilaSel As Int=jamTableViewListaArticulosCompra.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")
			VerHistoricoCompras(ArticuloSel, DescripcionArticuloSel)
			
		Case "FechaUltimaCompra"
			Dim FilaSel As Int=jamTableViewListaArticulosCompra.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")
			VerFechaUltimaCompraArticulo(ArticuloSel, DescripcionArticuloSel)
	End Select
End Sub


Sub VerFechaUltimaCompraArticulo(ArtSel As String, DesArtSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="DatosUltimaCompraArticulo"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de compras del artículo ${ArtSel}  ${DesArtSel}."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
		End If
	End If
	Return mRes
End Sub



'Sub fRCosteArticuloUsuario_GrabarNuevoRegistro(lstDatosCamposRegistroNuevo As List)
'
'	'Dim Proveedor As String=fRCosteArticuloUsuario.DatosCampoSeleccionado("Proveedor").ValorOutputCampo
'	Dim Articulo As String=fRCosteArticuloUsuario.DatosCampoSeleccionado("Articulo").ValorOutputCampo
'	'Dim Divisa As String=fRPrecioCompraUsuario.DatosCampoSeleccionado("Divisa").ValorOutputCampo
'	Dim CosteArtUsuario As Double=fRCosteArticuloUsuario.DatosCampoSeleccionado("CosteArticuloUsuario").ValorOutputCampo
'
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarCosteArticuloUsuario", _
'		Array(mIDAnalisisTarifasVenta,Articulo,CosteArtUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
'			CosteArtUsuario,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	fRCosteArticuloUsuario.CerrarFormRegistro
'End Sub
'
'Sub fRPrecioCompraUsuario_GrabarEdicionRegistro(lstInfoCampoJamFormRegistro As List)
'	'Dim Proveedor As String=fRCosteArticuloUsuario.DatosCampoSeleccionado("Proveedor").ValorOutputCampo
'	Dim Articulo As String=fRCosteArticuloUsuario.DatosCampoSeleccionado("Articulo").ValorOutputCampo
'	'Dim Divisa As String=fRCosteArticuloUsuario.DatosCampoSeleccionado("Divisa").ValorOutputCampo
'	Dim CosteArtUsuario As Double=fRCosteArticuloUsuario.DatosCampoSeleccionado("CosteArticuloUsuario").ValorOutputCampo
'
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioCompras", _
'		Array(mIDAnalisisTarifasVenta,Articulo,CosteArtUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
'			CosteArtUsuario,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible modificar el coste artículo usuario indicado.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	fRCosteArticuloUsuario.CerrarFormRegistro
'End Sub

Sub VerHistoricoCompras(Articulo As String, DescripcionArticulo As String)
	Dim cInfoCompras As cAnalisisTarifasInfoCompras
	cInfoCompras.Initialize(Me,frm.RootPane, Articulo, DescripcionArticulo, FechaInicialVentas, FechaFinalVentas)
	wait for (cInfoCompras) cAnalisisTarifasInfoCompras_Done (mDatosLinSel As Map)
'	
	If False=mDatosLinSel.Get("PrecioSeleccionado") Then Return
'		Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ningún precio para añadirlo a la lista de precios de venta usuario.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	Dim PrecioCompraUsuario As Double=mDatosLinSel.Get("PrecioDivisa")
	Dim DivisaPrecioCompraUsuario As String=mDatosLinSel.Get("Divisa")
	
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioCompras", _
		Array(mIDAnalisisTarifasVenta,Articulo,PrecioCompraUsuario, DivisaPrecioCompraUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			PrecioCompraUsuario, DivisaPrecioCompraUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible crear el nuevo precio de compra usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
End Sub

#End Region




#Region TarifasVentaUsuario
Sub TarifasVentaUsuario
	If Navegando=False Then
		lstHistorial.Add("TarifasVentaUsuario")
	End If
	If pnljamTableViewListaTarifasVentaUsuario.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaTarifasVentaUsuario")
		Sleep(0)
		
'		jamTableViewListaTarifasVentaUsuario.AbrirCamposBuilder
'		Return
		
		Dim rSub As ResumableSub=jamTableViewListaTarifasVentaUsuario.ConfigurarTableView("ListaAnalisisTarifasListaTarifasVentaUsuario.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaTarifasVentaUsuario.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaTarifasVentaUsuario.CellFactory_ColumnaFecha
		jamTableViewListaTarifasVentaUsuario.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaTarifasVentaUsuario.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaTarifasVentaUsuario.SetCellFactory(dCF)
		
		jamTableViewListaTarifasVentaUsuario.EstadoMenuItem(jamTableViewListaTarifasVentaUsuario.MenuBarLinea,False)
		
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Artículos a Lista de Artículos Excluidos de la Revision Ventas","AddArticulosAListaArticulosExcluidosDatosRevisionVentas",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Artículos Seleccionados de la Lista de Artículos Incluidos de la Revision Ventas","QuitarArtículosSeleccionados",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
		
		jamTableViewListaTarifasVentaUsuario.AddContextMenuItemFontAwesomeText("Borrar Precio Venta Usuario","QuitarLineaDeListaTarifasVentaUsuario",Chr(0xF196))
		
	End If
	pnljamTableViewListaTarifasVentaUsuario.BringToFront
	lblInfoMostrada.Text="Lista Tarifas Venta Usuario"
	
	
	Wait For(CargarListaTarifasVentaUsuario) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinTarifasVentaUsuario" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos de Tarifas Venta Usuario para este análisis de tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaTarifasVentaUsuario order by TipoTarifa, CodigoTarifa,Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaTarifasVentaUsuario.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaTarifasVentaUsuario.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaTarifasVentaUsuario.SetPlaceholderText("")
				Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub

Sub CargarListaTarifasVentaUsuario As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaTarifasVentaUsuario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaTarifasVentaUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinTarifasVentaUsuario"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaTarifasVentaUsuario",lstReg)
				mSQL.ExecNonQuery2("update tblAnalisisTarifasListaTarifasVentaUsuario set IDAnalisisTarifas=?",Array(mIDAnalisisTarifasVenta))
			End If
		End If
	End If
	Return mRes
End Sub
'
'Sub jamTableViewListaArticulosExcluidosDatosRevisionVentas_MenuBarMenuItem_Action(TagMenuItem As String)
'	Select Case TagMenuItem
'		Case "AddArticulosAListaArticulosExcluidosDatosRevisionVentas"
'			AddArticuloAArticulosExcluidosDatosRevisionVentas
'	End Select
'End Sub

Sub jamTableViewListaTarifasVentaUsuario_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "QuitarLineaDeListaTarifasVentaUsuario"
			Dim FilaSel As Int=jamTableViewListaTarifasVentaUsuario.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaTarifasVentaUsuario.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaTarifasVentaUsuario.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloSel As String=jamTableViewListaTarifasVentaUsuario.GetValorSQLCampoFila(FilaSel,"Articulo")

			Wait For(QuitarLineaListaTarifasVentaUsuario(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return

			Wait For(CargarListaTarifasVentaUsuario) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			
			If Accion="SinTarifasVentaUsuario" Then
				Dim msa As Object=xui.MsgboxAsync("No hay datos de Tarifas Venta Usuario para este Análisis de Tarifas.","Aviso")
				Wait For (msa) Msgbox_Result
			End If

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaTarifasVentaUsuario order by Articulo")
	
			Dim rSub As ResumableSub=jamTableViewListaTarifasVentaUsuario.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaTarifasVentaUsuario.AbrirCamposBuilder
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
	End Select
End Sub


'Sub AddArticulosAListaArticulosExcluidosDatosRevisionVentas(ArticuloSel As String) As ResumableSub 
'	
'	Dialog.Title="Selecciona método"
'	Dialog.TitleBarHeight=60dip
'	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
'	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
'
'	Dim TextSize As Float = 18 'FLOAT
'	Dim xclv As CustomListView=B4XListDlg.CustomListView1
'	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
'	
'	Dim dlbl As Label=xclv.DesignerLabel
'	dlbl.TextSize=TextSize
'		
'	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
'	
'	B4XListDlg.Options=lstOpciones
'	
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	
'	' OJO ... es un B4XView no Button
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	If bCancel.IsInitialized Then
'		'Log("bCancel" & bCancel.Text)
'		bCancel.Left=bCancel.Left-50dip
'		bCancel.Width=bCancel.Width+30dip
'		bCancel.TextSize=18
'	End If
'	
'	Wait For (rSub) Complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim Opcion As String= B4XListDlg.SelectedItem
'	If Opcion="Individual" Then
'		AddArticuloIndividualAArticulosExcluidos
'	Else
'		'AddGrupoArticulosAArticulosIncluidos
'	End If
'	
'End Sub
'''''
'''''Sub AddLineaListaTarifasVentaUsuario(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String, DescripcionArticuloSel As String, Divisa As String, PrecioVentaDivisa As Double)   'solo se podrán añadir desde el jamTV de DatosRevisionVentas
''''''	Dim cSelArtNAV As cSeleccionArticuloNAV
''''''	cSelArtNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
''''''	wait for cSeleccionArticuloNAV_Done (mSelCliNAV As Map)
''''''	Dim ArticuloSel As String=mSelCliNAV.Get("Articulo")
''''''	If ArticuloSel="" Then Return
''''''	If 1=mSelCliNAV.Get("ArticuloBloqueado") Then
''''''		Dim msa As Object=xui.MsgboxAsync("Los artículos bloqueados y bloqueados por no disponible se excluyen siempre del análisis","Aviso")
''''''		Wait For (msa) Msgbox_Result
''''''		Return
''''''	End If
''''''	
'''''	Wait For(ExcluirArticuloDatosRevisionVentas(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
'''''	Dim Accion As String=mRes.Get("Accion")
'''''	If Accion<>"OK" Then Return
'''''
'''''	'''	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
'''''	'''	Dim Accion As String=mRes.Get("Accion")
'''''	'''	If Accion<>"OK" Then Return
'''''	'''
'''''	'''	'Dim lstReg As List=mRes.get("lstReg")
'''''	'''
'''''	'''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
'''''	'''
'''''	'''	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
'''''	'''	Wait For (rSub) complete (mResultSetData As Map)
'''''	'''	rsData.Close
'''''	'''
'''''	'''	If Not(mResultSetData.Get("FlagOK")) Then
'''''	'''		If ""<>mResultSetData.Get("msgError") Then
'''''	'''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''''	'''			Wait For (msa) Msgbox_Result
'''''	'''			#if debug
'''''	'''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'''''	'''			Wait For (msa) Msgbox_Result (rInt As Int)
'''''	'''			If rInt=xui.DialogResponse_Positive Then
'''''	'''				jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
'''''	'''				Return
'''''	'''			End If
'''''	'''			#End If
'''''	'''			ExitApplication
'''''	'''		End If
'''''	'''		If ""<>mResultSetData.Get("msgAviso") Then
'''''	'''			If True=mResultSetData.Get("ListaVacia") Then Return
'''''	'''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'''''	'''			Wait For (msa) Msgbox_Result
'''''	'''		End If
'''''	'''
'''''	'''	End If
'''''
'''''
'''''	jamLoadingIndicator1.MensajeLoading="Cargando datos para revisión Ventas..."
'''''	jamLoadingIndicator1.Show
'''''	
'''''	Wait For(ActualizarListatarifasventausuario) complete (mRes As Map)
'''''	Dim Accion As String=mRes.Get("Accion")
'''''	If Accion<>"OK" Then
'''''		SalirModulo
'''''		'Return False
'''''	End If
'''''
'''''	'Dim lstReg As List=mRes.get("lstReg")
'''''	
'''''	mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentas=0 where MaxFechaVentas is null")
'''''	'mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentasTalla=0 where MaxFechaVentasTalla is null")
'''''	
'''''	
'''''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisDatosRevisionVentas order by TipoTarifa, CodigoTarifa, Articulo, Talla")
'''''	
'''''	Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.setdata(rsData)
'''''	Wait For (rSub) complete (mResultSetData As Map)
'''''	rsData.Close
'''''	jamLoadingIndicator1.Close
'''''	If Not(mResultSetData.Get("FlagOK")) Then
'''''		If ""<>mResultSetData.Get("msgError") Then
'''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''''			Wait For (msa) Msgbox_Result
'''''			#if debug
'''''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'''''			Wait For (msa) Msgbox_Result (rInt As Int)
'''''			If rInt=xui.DialogResponse_Positive Then
'''''				jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
'''''				'Return False
'''''			End If
'''''			#End If
'''''			ExitApplication
'''''		End If
'''''		If ""<>mResultSetData.Get("msgAviso") Then
'''''			If True=mResultSetData.Get("ListaVacia") Then Return 'True
'''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'''''			Wait For (msa) Msgbox_Result
'''''		End If
'''''	
'''''	End If
'''''End Sub

'Sub ExcluirArticuloDatosRevisionVentas(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasExcluirArticuloDatosRevisionVentas"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
''			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
''			Wait For (msa) Msgbox_Result
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mResp As Map=lstReg.Get(0)
'			Dim sResp As String=mResp.GetValueAt(0)
'			If sResp.ToUpperCase.StartsWith("ERROR") Then
'				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
'				Wait For (msa) Msgbox_Result
'				Accion="NOK"
'			Else
'				Accion="OK"
'				mRes.Put("Accion", Accion)
'				'mRes.Put("mData", mResp)
'			End If
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		End If
'	End If
'	Return mRes
'End Sub

Sub QuitarLineaListaTarifasVentaUsuario(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarPrecioVentaUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub
#End Region



#Region AnalisisCostesArticulosImportacion
Sub AnalisisCostesArticulosImportacion As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("AnalisisCostesArticulosImportacion")
	End If
	If pnljamTableViewAnalisisTarifasListaArticulosImportacion.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasAnalisisCostesArticulosImportacion")
		Sleep(0)
		
'		jamTableViewListaArticulosImportacion.AbrirCamposBuilder
'		Return

		jamTableViewListaArticulosImportacion.AddContextMenuItemSeparator
		Dim img As Image
		img.InitializeSample(File.DirAssets,"navision.png",24,24)
		jamTableViewListaArticulosImportacion.AddContextMenuItemImage("Artículo NAV","VerArticuloNAV",img)
		jamTableViewListaArticulosImportacion.AddContextMenuItemSeparator
		jamTableViewListaArticulosImportacion.AddContextMenuItemFontAwesomeText("Ver Histórico Compras","VerHistoricoCompras",Chr(0xF1FE))
		jamTableViewListaArticulosImportacion.AddContextMenuItemFontMaterialIconsText("Añadir/Editar Coste Artículo Usuario","AddEditCosteArticuloUsuario",Chr(0xE851))
		jamTableViewListaArticulosImportacion.AddContextMenuItemFontAwesomeTextColumna("CosteUnitarioArticulo","Coste Unitario Artículo=Costes Artículo Usuario","AddEditarCosteArticuloUsuarioValorCosteUnitarioArticulo",Chr(0xE851))

		Dim rSub As ResumableSub=jamTableViewListaArticulosImportacion.ConfigurarTableView("ListaAnalisisTarifasListaAnalisisCostesArticulosImportacion.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaArticulosImportacion.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
''
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosImportacion.CellFactory_ColumnaFechaSqlServer
		jamTableViewListaArticulosImportacion.SetCellFactoryListaCampos(CF, Array As String("FechaCosteRazonable","FechaUltimaEntradaCompraFab", "FechaCosteUsuarioNAV"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosImportacion.CellFactory_ColumnaWrapText
		jamTableViewListaArticulosImportacion.SetCellFactoryListaCampos(CF, Array As String("DescripcionArticulo", "NombreProveedor"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosImportacion.CellFactory_FormatoStringDecimalesColumnaNumerica
		CF.CellFactoryEnCallBack=False
		CF.params=Array("#,##0.00")
		jamTableViewListaArticulosImportacion.SetCellFactoryListaCampos(CF,Array("CosteUnitarioArticulo"))
		
		Dim FtoDef As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoDef.Initialize
		'Fto.ColorBorde=
		FtoDef.ColorFondo=xui.Color_Transparent
		FtoDef.ColorTexto=xui.Color_Black
		Dim FtoNav As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoNav.Initialize
		'Fto.ColorBorde=
		FtoNav.ColorFondo=xui.Color_Transparent
		FtoNav.ColorTexto=xui.Color_Blue
		Dim FtoCosteUsuario As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoCosteUsuario.Initialize
		'Fto.ColorBorde=
		FtoCosteUsuario.ColorFondo=xui.Color_Transparent
		FtoCosteUsuario.ColorTexto=0xFFB22222
		Dim FtoSinPrecio As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoSinPrecio.Initialize
		'Fto.ColorBorde=
		FtoSinPrecio.ColorFondo=xui.Color_Red
		FtoSinPrecio.ColorTexto=xui.Color_White
		jamTableViewListaArticulosImportacion.AsignarCellFactoryColumnaTextoNCondiciones(Array("TipoCosteUsuarioNAV"),FtoDef,Array("NAV","Usuario","SinPrecio"),Array(FtoNav,FtoCosteUsuario,FtoSinPrecio))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
''		Dim dCF As DatosCellFactoryJamTableView
''		dCF.Initialize
''		dCF.AliasCampoColumna="RutaAnalisis"
''		dCF.CellFactoryEnCallBack=False
''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		'jamTableViewListaGRPSAnalisis.EstadoMenuItem(jamTableViewListaGRPSAnalisis.MenuBarLinea,False)
		
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaRutasAnalisis.MenuBarLinea)
'''		
'''		jamTableViewListaRutasAnalisis.AddContextMenuItemSeparator
'''		jamTableViewListaRutasAnalisis.AddContextMenuItemFontAwesomeText("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096))
	
		jamTableViewListaArticulosImportacion.SetPanelInfoVisible(True)
	End If
	pnljamTableViewAnalisisTarifasListaArticulosImportacion.BringToFront
	lblInfoMostrada.Text="Análisis Costes Artículos Importación"
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos Artículos Importación..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisCostesArticulosImportacion) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisCostesArticulosImportacion order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosImportacion.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosImportacion.AbrirCamposBuilder
				Return False
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
	
	Wait For(CargarEstadosAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	Dim EstadoImportacion As String=mData.Get("EstadoCostesImportacion")
	lblEstadoSeccion.Text=EstadoImportacion
	lblEstadoSeccion.Visible=True
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub ActualizarListaAnalisisCostesArticulosImportacion As ResumableSub
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasAnalisisCostesArticulosImportacion")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaArticulosSistemaAprov"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas,"Importacion"), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene artículos de importación relacionados.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasAnalisisCostesArticulosImportacion",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisCostesArticulosImportacion set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaArticulosImportacion_MenuBarMenuItem_Action(TagMenuItem As String)

	Select TagMenuItem
		Case "Actualizar"
			AnalisisCostesArticulosImportacion
	End Select
End Sub 

Sub jamTableViewListaArticulosImportacion_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "AddEditarCosteArticuloUsuarioValorCosteUnitarioArticulo"
			Dim FilaSel As Int=jamTableViewListaArticulosImportacion.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosImportacion.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim CosteUnitarioArticulo As Double=jamTableViewListaArticulosImportacion.GetValorSQLCampoFila(FilaSel,"CosteUnitarioArticulo")
			AddEditarCosteArticuloUsuarioValor(ArticuloSel, CosteUnitarioArticulo)
		
		Case "AddEditCosteArticuloUsuario"
			Dim FilaSel As Int=jamTableViewListaArticulosImportacion.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosImportacion.GetValorSQLCampoFila(FilaSel,"Articulo")
			'Dim ProveedorSel As String=jamTableViewListaArticulosCompra.GetValorSQLCampoFila(FilaSel,"Proveedor")
			AddEditarCosteArticuloUsuario(ArticuloSel)
			
		Case "VerArticuloNAV"
			Dim ArticuloSel As String
			Dim FilaSeleccionada As Int=jamTableViewListaArticulosImportacion.IndicesFilasSeleccionadas.Get(0)
			Dim lstInfoFila As List=jamTableViewListaArticulosImportacion.DatosRegistroIndiceFila(FilaSeleccionada)
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
			wait for(Utilidades.MsgBox2XUI("Confirma","¿Mostrar en Navision la ficha del artículo " & ArticuloSel & "?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
			
			
		Case "VerHistoricoCompras"
			Dim FilaSel As Int=jamTableViewListaArticulosImportacion.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosImportacion.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim DescripcionArticuloSel As String=jamTableViewListaArticulosImportacion.GetValorSQLCampoFila(FilaSel,"DescripcionArticulo")
			VerHistoricoCompras(ArticuloSel, DescripcionArticuloSel)
	End Select
End Sub


#End Region

#Region AnalisisCostesArticulosFabNoCorte
Sub AnalisisCostesArticulosFabNoCorte As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("AnalisisCostesArticulosFabNoCorte")
	End If
	If pnljamTableViewAnalisisTarifasListaArticulosFabNoCorte.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasAnalisisCostesArticulosFabNoCorte")
		Sleep(0)
		
'		jamTableViewListaArticulosFabNoCorte.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaArticulosFabNoCorte.ConfigurarTableView("ListaAnalisisTarifasListaAnalisisCostesArticulosFabNoCorte.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaArticulosFabNoCorte.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
''
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosFabNoCorte.CellFactory_ColumnaFechaSqlServer
		jamTableViewListaArticulosFabNoCorte.SetCellFactoryListaCampos(CF, Array As String("FechaCosteStd","FechaCosteUsuarioNAV", "FechaCosteOferta"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosFabNoCorte.CellFactory_ColumnaWrapText
		jamTableViewListaArticulosFabNoCorte.SetCellFactoryListaCampos(CF, Array As String("DescripcionArticulo"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
''		Dim dCF As DatosCellFactoryJamTableView
''		dCF.Initialize
''		dCF.AliasCampoColumna="RutaAnalisis"
''		dCF.CellFactoryEnCallBack=False
''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		'jamTableViewListaGRPSAnalisis.EstadoMenuItem(jamTableViewListaGRPSAnalisis.MenuBarLinea,False)
		
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaRutasAnalisis.MenuBarLinea)
'''		
		jamTableViewListaArticulosFabNoCorte.AddContextMenuItemSeparator
		jamTableViewListaArticulosFabNoCorte.AddContextMenuItemFontAwesomeText("Añadir/Editar Coste Unitario Usuario","AddEditCosteArticuloUsuario",Chr(0xF096))


		Dim FtoDef As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoDef.Initialize
		'Fto.ColorBorde=
		FtoDef.ColorFondo=xui.Color_Transparent
		FtoDef.ColorTexto=xui.Color_Black
		Dim FtoOferta As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoOferta.Initialize
		'Fto.ColorBorde=
		FtoOferta.ColorFondo=xui.Color_Transparent
		FtoOferta.ColorTexto=0xFFB22222
		Dim FtoCosteUsuario As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoCosteUsuario.Initialize
		'Fto.ColorBorde=
		FtoCosteUsuario.ColorFondo=xui.Color_Transparent
		FtoCosteUsuario.ColorTexto=0xFFB22222
		Dim FtoSinPrecio As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoSinPrecio.Initialize
		'Fto.ColorBorde=
		FtoSinPrecio.ColorFondo=xui.Color_Red
		FtoSinPrecio.ColorTexto=xui.Color_White
		jamTableViewListaArticulosFabNoCorte.AsignarCellFactoryColumnaTextoNCondiciones(Array("TipoCosteUsuarioNAV"),FtoDef,Array("Oferta","Usuario","Sin Coste"),Array(FtoOferta,FtoCosteUsuario,FtoSinPrecio))

		jamTableViewListaArticulosFabNoCorte.SetPanelInfoVisible(True)
	End If
	pnljamTableViewAnalisisTarifasListaArticulosFabNoCorte.BringToFront
	lblInfoMostrada.Text="Análisis Costes Artículos Fabricación No Corte"
	
	jamLoadingIndicator1.MensajeLoading="Actualizando datos ultimo coste de oferta..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarUltimaFichaCosteOfertaArticulos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	

	jamLoadingIndicator1.MensajeLoading="Cargando datos Artículos Fabricación No Corte..."
	'jamLoadingIndicator1.IniciarControlTiempoProceso
	'jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisCostesArticulosFabNoCorte) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte SET FichaCosteOferta=tFichasOferta.Ficha, CosteOferta=ROUND(tFichasOferta.TotalCoste,3), FechaCosteOferta=tFichasOferta.FechaCreacionLong
from (select Articulo, Ficha, FechaCreacionLong, TotalCoste from tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos) as tFichasOferta
where tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte.Articulo=tFichasOferta.Articulo"$)

	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte SET TipoCosteUsuarioNAV='', CosteUsuarioNAV=0, FechaCosteUsuarioNAV=0"$)

	mSQL.ExecNonQuery2($"update tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte set TipoCosteUsuarioNAV=case when CosteUnitarioUsuario>0 then ? when FichaCosteOferta<>'' then ? else ? end"$, _
		Array As Object("Usuario","Oferta","Sin Coste"))
	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte set CosteUsuarioNAV=case when CosteUnitarioUsuario>0 then CosteUnitarioUsuario when FichaCosteOferta<>'' then CosteOferta else 0 end"$)
	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte set FechaCosteUsuarioNAV=case when CosteUnitarioUsuario>0 then FechaCosteUnitarioUsuario when FichaCosteOferta<>'' then FechaCosteOferta else 0 end"$)


	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosFabNoCorte.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosFabNoCorte.AbrirCamposBuilder
				Return False
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
	
	Wait For(CargarEstadosAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	Dim EstadoFabNoCorte As String=mData.Get("EstadoCostesFabricacionNoCorte")
	lblEstadoSeccion.Text=EstadoFabNoCorte
	lblEstadoSeccion.Visible=True
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub


Sub ActualizarListaAnalisisCostesArticulosFabNoCorte As ResumableSub
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaArticulosSistemaAprov"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas,"FabNoCorte"), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene artículos de fabricación no corte relacionados.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisCostesArticulosFabNoCorte set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaArticulosFabNoCorte_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddEditCosteArticuloUsuario"
			Dim FilaSel As Int=jamTableViewListaArticulosFabNoCorte.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaArticulosFabNoCorte.GetValorSQLCampoFila(FilaSel,"Articulo")
			AddEditarCosteArticuloUsuario(ArticuloSel)
	End Select
End Sub

#End Region


#Region AnalisisCostesArticulosFabCorte
Sub AnalisisCostesArticulosFabCorte As ResumableSub
	If Navegando=False Then
		lstHistorial.Add("AnalisisCostesArticulosFabCorte")
	End If
	If pnljamTableViewAnalisisTarifasListaArticulosFabCorte.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasAnalisisCostesArticulosFabCorte")
		Sleep(0)
		
'		jamTableViewListaArticulosFabNoCorte.AbrirCamposBuilder
'		Return

		Dim rSub As ResumableSub=jamTableViewListaArticulosFabCorte.ConfigurarTableView("ListaAnalisisTarifasListaAnalisisCostesArticulosFabCorte.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return False
		End If
		
		jamTableViewListaArticulosFabCorte.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
''
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosFabCorte.CellFactory_ColumnaFechaSqlServer
		jamTableViewListaArticulosFabCorte.SetCellFactoryListaCampos(CF, Array As String("FechaCosteStd","FechaCosteUsuarioNAV","FechaCosteOferta"))
		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
		
''		Dim dCF As DatosCellFactoryJamTableView
''		dCF.Initialize
''		dCF.AliasCampoColumna="RutaAnalisis"
''		dCF.CellFactoryEnCallBack=False
''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
		
		'jamTableViewListaGRPSAnalisis.EstadoMenuItem(jamTableViewListaGRPSAnalisis.MenuBarLinea,False)
		
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir GRPs","IncluirTarifas",Chr(0xF196),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas Rutas Excepto Línea Seleccionada","ExcluirTodasRutasExceptoLineaSeleccionada",Chr(0xF096),jamTableViewListaRutasAnalisis.MenuBarLinea)
		'''
		jamTableViewListaArticulosFabCorte.AddContextMenuItemSeparator
		jamTableViewListaArticulosFabCorte.AddContextMenuItemFontAwesomeText("Añadir/Editar Coste Unitario Usuario","AddEditCosteArticuloUsuario",Chr(0xF096))
		
		Dim FtoDef As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoDef.Initialize
		'Fto.ColorBorde=
		FtoDef.ColorFondo=xui.Color_Transparent
		FtoDef.ColorTexto=xui.Color_Black
		Dim FtoOferta As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoOferta.Initialize
		'Fto.ColorBorde=
		FtoOferta.ColorFondo=xui.Color_Transparent
		FtoOferta.ColorTexto=0xFFB22222
		Dim FtoCosteUsuario As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoCosteUsuario.Initialize
		'Fto.ColorBorde=
		FtoCosteUsuario.ColorFondo=xui.Color_Transparent
		FtoCosteUsuario.ColorTexto=0xFFB22222
		Dim FtoSinPrecio As TipoFormatoFondoTextoBordeCeldaJamTableView
		FtoSinPrecio.Initialize
		'Fto.ColorBorde=
		FtoSinPrecio.ColorFondo=xui.Color_Red
		FtoSinPrecio.ColorTexto=xui.Color_White
		jamTableViewListaArticulosFabCorte.AsignarCellFactoryColumnaTextoNCondiciones(Array("TipoCosteUsuarioNAV"),FtoDef,Array("Oferta","Usuario","Sin Coste"),Array(FtoOferta,FtoCosteUsuario,FtoSinPrecio))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosFabCorte.CellFactory_ColumnaWrapText
		jamTableViewListaArticulosFabCorte.SetCellFactoryListaCampos(CF, Array As String("DescripcionArticulo"))
		
		jamTableViewListaArticulosFabCorte.SetPanelInfoVisible(True)
	End If
	pnljamTableViewAnalisisTarifasListaArticulosFabCorte.BringToFront
	lblInfoMostrada.Text="Análisis Costes Artículos Fabricación Corte"
	
	jamLoadingIndicator1.MensajeLoading="Actualizando datos ultimo coste de oferta..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarUltimaFichaCosteOfertaArticulos) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos Artículos Fabricación Corte..."
'	jamLoadingIndicator1.IniciarControlTiempoProceso
'	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisCostesArticulosFabCorte) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabCorte  SET FichaCosteOferta=tFichasOferta.Ficha, CosteOferta=ROUND(tFichasOferta.TotalCoste,3), FechaCosteOferta=tFichasOferta.FechaCreacionLong
from (select Articulo, Ficha, FechaCreacionLong, TotalCoste from tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos) as tFichasOferta
where tblAnalisisTarifasAnalisisCostesArticulosFabCorte.Articulo=tFichasOferta.Articulo"$)

	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabCorte SET FichaCosteOferta=tFichasOferta.Ficha, CosteOferta=ROUND(tFichasOferta.TotalCoste,3), FechaCosteOferta=tFichasOferta.FechaCreacionLong
from (select Articulo, Ficha, FechaCreacionLong, TotalCoste from tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos) as tFichasOferta
where tblAnalisisTarifasAnalisisCostesArticulosFabCorte.Articulo=tFichasOferta.Articulo"$)

	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabCorte SET TipoCosteUsuarioNAV='', CosteUsuarioNAV=0, FechaCosteUsuarioNAV=0"$)

	mSQL.ExecNonQuery2($"update tblAnalisisTarifasAnalisisCostesArticulosFabCorte set TipoCosteUsuarioNAV=case when CosteUnitarioUsuario>0 then ? when FichaCosteOferta<>'' then ? else ? end"$, _
		Array As Object("Usuario","Oferta","Sin Coste"))
	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabCorte set CosteUsuarioNAV=case when CosteUnitarioUsuario>0 then CosteUnitarioUsuario when FichaCosteOferta<>'' then CosteOferta else 0 end"$)
	mSQL.ExecNonQuery($"update tblAnalisisTarifasAnalisisCostesArticulosFabCorte set FechaCosteUsuarioNAV=case when CosteUnitarioUsuario>0 then FechaCosteUnitarioUsuario when FichaCosteOferta<>'' then FechaCosteOferta else 0 end"$)


	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisCostesArticulosFabCorte order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosFabCorte.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosFabCorte.AbrirCamposBuilder
				Return False
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
	
	Wait For(CargarEstadosAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return False
	End If
	Dim mData As Map=mRes.Get("mData")
	Dim EstadoFabCorte As String=mData.Get("EstadoCostesFabricacionCorte")
	lblEstadoSeccion.Text=EstadoFabCorte
	lblEstadoSeccion.Visible=True
	
	Return True
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	
	
End Sub

Sub ActualizarUltimaFichaCosteOfertaArticulos As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos")

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="FichasCostesFabricacionUltimaFichaCosteOfertaArticulos"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No hay datos de ultima ficha de costes oferta por articulo.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaUltimaFichaCosteOfertaArticulos",lstReg)
			'Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
		End If
	End If
	Return mRes
End Sub


Sub ActualizarListaAnalisisCostesArticulosFabCorte As ResumableSub
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasAnalisisCostesArticulosFabCorte")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaArticulosSistemaAprov"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas,"FabCorte"), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene artículos de fabricación no corte relacionados.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasAnalisisCostesArticulosFabCorte",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisCostesArticulosFabCorte set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub


#End Region
'
'
'#Region DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo
'
'Sub  DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String, DescripcionArticuloSel As String) As ResumableSub
'	If pnljamTableViewAnalisisTarifasLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.IsInitialized=False Then
'		pnlFondoInfo.LoadLayout("scrAnalisisTarifasInfoTarifasVentaValidasTipoTarifaCodigoTarifaArticulo")
'		Sleep(0)
''		
''		jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AbrirCamposBuilder
''		Return
'
'		txtTipoTarifaAvisos.Alignment="CENTER"
'		txtCodigoTarifaAvisos.Alignment="CENTER"
'		txtArticuloAvisos.Alignment="CENTER"
'		txtNumPrecios.Alignment="CENTER_RIGHT"
'		txtNumPreciosArtTalla.Alignment="CENTER_RIGHT"
'		txtNumPreciosDivisa.Alignment="CENTER_RIGHT"
'		txtNumMinQty.Alignment="CENTER_RIGHT"
'		txtNumPreciosUMDifUMVta.Alignment="CENTER_RIGHT"
'
'		Dim rSub As ResumableSub=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.ConfigurarTableView("ListaAnalisisTarifasListaTarifasTipoTarifaCodigoTarifaArticulo.json",Null)
'		wait for (rSub) complete (mRes As Map)
'		Log(mRes)
'		If Not(mRes.Get("FlagOK")) Then
'			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			frm.Close
'			Return False
'		End If
'		
'		jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'		
'		Dim CF As DatosCellFactoryJamTableView
'		CF.Initialize
'		CF.NombreFuncionCellFactory=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.CellFactory_ColumnaFecha
'		jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.SetCellFactoryListaCampos(CF, Array As String("FechaInicial","FechaFinal"))
'		
'		jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AddContextMenuItemSeparator
'		jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AddContextMenuItemFontAwesomeText("Añadir Línea a Lista Precios Venta Usuario","AddLíneaAListaPreciosVentaUsuario",Chr(0xF071))
'	End If
'	pnljamTableViewAnalisisTarifasLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.BringToFront
'	lblInfoMostrada.Text="Líneas Tarifa Venta Tipo Tarifa-Codigo Tarifa-Articulo Seleccionados"
'	
'	jamLoadingIndicator1.MensajeLoading="Cargando datos tarifas..."
'	jamLoadingIndicator1.Show
'	
'	Dim sTipoTarifaSel As String
'	If TipoTarifaSel=0 Then
'		sTipoTarifaSel="Cliente"
'	Else
'		sTipoTarifaSel="GRP"
'	End If
'	txtTipoTarifaAvisos.Text=sTipoTarifaSel
'	txtCodigoTarifaAvisos.Text=CodigoTarifaSel
'	txtArticuloAvisos.Text=ArticuloSel
'	txtDescripcionArticuloAvisos.Text=DescripcionArticuloSel
'	
'
'	Dim NumPreciosArt As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
'	txtNumPrecios.Text=NumPreciosArt
'	Dim tF As B4XView=txtNumPrecios
'	If NumPreciosArt>1 Then 
'		tF.Color=xui.Color_Red
'		tF.TextColor=xui.Color_White
'	Else
'		tF.Color=0xFF00FA9A
'		tF.TextColor=xui.Color_Black
'	End If
'	
'	Dim NumPreciosArtTalla As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
'	txtNumPreciosArtTalla.text=NumPreciosArtTalla
'	Dim tF As B4XView=txtNumPreciosArtTalla
'	If NumPreciosArtTalla>0 Then
'		tF.Color=xui.Color_Red
'		tF.TextColor=xui.Color_White
'	Else
'		tF.Color=0xFF00FA9A
'		tF.TextColor=xui.Color_Black
'	End If
'	
'	Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
'	txtNumMinQty.text=NumMinQty
'	Dim tF As B4XView=txtNumMinQty
'	If NumMinQty>0 Then
'		tF.Color=xui.Color_Red
'		tF.TextColor=xui.Color_White
'	Else
'		tF.Color=0xFF00FA9A
'		tF.TextColor=xui.Color_Black
'	End If
'	
'	
'	Dim NumPreciosDivisa As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
'	txtNumPreciosDivisa.text=NumPreciosDivisa
'	Dim tF As B4XView=txtNumPreciosDivisa
'	If NumPreciosDivisa>0 Then
'		tF.Color=xui.Color_Red
'		tF.TextColor=xui.Color_White
'	Else
'		tF.Color=0xFF00FA9A
'		tF.TextColor=xui.Color_Black
'	End If
'	
'	
'	
'	Dim NumPreciosUMDifUMVta As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosUMDifUMVta from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
'	txtNumPreciosUMDifUMVta.text=NumPreciosUMDifUMVta
'	Dim tF As B4XView=txtNumPreciosUMDifUMVta
'	If NumPreciosUMDifUMVta>0 Then
'		tF.Color=xui.Color_Red
'		tF.TextColor=xui.Color_White
'	Else
'		tF.Color=0xFF00FA9A
'		tF.TextColor=xui.Color_Black
'	End If
'	
'
'	
'	wait for (CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	Select Case Accion
'		Case "NOK"
'			SalirModulo
'			Return False
'		Case "SinDatos"
'			
'		Case "OK"
'			
'	End Select
'	
'	
'	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")
'	
'	Dim rSub As ResumableSub=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.setdata(rsData)
'	Wait For (rSub) complete (mResultSetData As Map)
'	rsData.Close
'	jamLoadingIndicator1.Close
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			#if debug
'			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt=xui.DialogResponse_Positive Then
'				jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AbrirCamposBuilder
'				Return False
'			End If
'			#End If
'			ExitApplication
'		End If
'		If ""<>mResultSetData.Get("msgAviso") Then
'			If True=mResultSetData.Get("ListaVacia") Then Return True
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'	
'	End If
'	
'	Return True
'
'End Sub
'
'
''
''
''
''Sub InfoLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String)
''
''	
''End Sub
'
''Sub CargaAvisosTarifaVentaTipoTarifaCodigoTarifaArticulo(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
''	
''	'mSQL.ExecNonQuery("delete from tblAnalisisTarifasAnalisisCostesArticulosFabCorte")
''	Dim Accion As String
''	Dim mRes As Map
''	mRes.Initialize
''	Dim Comando As String="AnalisisTarifasAvisosLineaTarifa"
''	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,TipoTarifaSel, CodigoTarifaSel, ArticuloSel), Me)
''
''	Wait For DatosJRDC_Completed (mResult As Map)
''
''	If mResult.Get("ConnOK")=False Then
''		jamLoadingIndicator1.Close
''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
''		Wait For (msa) Msgbox_Result
''		Accion="NOK"
''		mRes.Put("Accion", Accion)
''	Else
''
''		If mResult.Get("ReqOK")=False Then
''			jamLoadingIndicator1.Close
''			Dim msa As Object=xui.MsgboxAsync("NO hay avisos para la línea de tarifa seleccionada.","Aviso")
''			Wait For (msa) Msgbox_Result
''			Accion="SinAvisos"
''			mRes.Put("Accion", Accion)
''		Else
''			Dim lstReg As List=mResult.Get("lstRes")
''			Dim mData As Map=lstReg.Get(0)
''			Accion="OK"
''			mRes.Put("Accion", Accion)
''			mRes.Put("mData", mData)
'''			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasAnalisisCostesArticulosFabCorte",lstReg)
'''			mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisCostesArticulosFabCorte set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
''
''			txtNumPrecios.Text=mData.get("NumPrecios")
''			txtNumPreciosArtTalla.text=mData.get("NumPreciosArtTalla")
''			txtNumMinQty.text=mData.get("NumPreciosQtyMin")
''			txtNumPreciosDivisa.text=mData.get("NumPreciosDivisa")
''			txtNumPreciosUMDifUMVta.text=mData.get("NumPreciosUMDifUMVta")
''		End If
''	End If
''	Return mRes
''End Sub
'
'Sub CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
'	Dim sTipoTarifaSel As String
'	If TipoTarifaSel=0 Then 
'		sTipoTarifaSel="Cliente"
'	Else
'		sTipoTarifaSel="GRP"
'	End If
'	
'	mSQL.ExecNonQuery("delete from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasLineasTarifaVentaTipoTarifaCodigoTarifaArticulo"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(TipoTarifaSel, CodigoTarifaSel, ArticuloSel), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync("NO hay líneas de tarifas de venta válidas para los datos seleccionados (Tipo: " & sTipoTarifaSel & " Código: " & CodigoTarifaSel & " Artículo: " & ArticuloSel & ".","Aviso")
'			Wait For (msa) Msgbox_Result
'			Accion="SinDatos"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData As Map=lstReg.Get(0)
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("mData", mData)
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo",lstReg)
'			mSQL.ExecNonQuery2("update tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
'		End If
'	End If
'	Return mRes
'End Sub
'
'
'#End Region

#Region CodigosArticulosExcluidosRevisionVentas
Sub ArticulosExcluidosDatosRevisionVentas
	If Navegando=False Then
		lstHistorial.Add("ArticulosExcluidosDatosRevisionVentas")
	End If
	If pnljamTableViewListaArticulosExcluidosDatosRevisionVentas.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas")
		Sleep(0)
		
'		jamTableViewListaArticulosIncluidos.AbrirCamposBuilder
'		Return
		
		Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.ConfigurarTableView("ListaAnalisisTarifasListaArticulosExcluidos.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		'dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaArticulosExcluidosDatosRevisionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.SetCellFactoryListaCampos(dCF,Array As String("Bloqueado","BloqueadoNoDisponible"))
		
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaArticulosExcluidosDatosRevisionVentas.CellFactory_ColumnaFecha
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaArticulosExcluidosDatosRevisionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.SetCellFactory(dCF)
		
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.EstadoMenuItem(jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarLinea,False)
		
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Artículos a Lista de Artículos Excluidos de la Revision Ventas","AddArticulosAListaArticulosExcluidosDatosRevisionVentas",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
'		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Lista Artículos a Lista de Artículos Excluidos de la Revision Ventas","AddListaArticulosAArticulosExcluidosDatosRevisionVenta",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar de la Lista de Artículos Excluidos de la Revision Ventas TODAS las líneas FILTRADAS?","QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
		
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Quitar Artículo de la Lista de Artículos Excluidos de la Revision Ventas","QuitarArticuloDeListaArticulosExcluidosDatosRevisionVentas",Chr(0xF196))
		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddContextMenuItemFontAwesomeText("Quitar de la Lista de Artículos Excluidos de la Revision Ventas TODAS las líneas FILTRADAS?","QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas",Chr(0xF196))
		
	End If
	pnljamTableViewListaArticulosExcluidosDatosRevisionVentas.BringToFront
	lblInfoMostrada.Text="Artículos Excluidos Datos Revision Ventas"
	
	
	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinArticulosExcluidos" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos excluidos de la revision de ventas para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by [Articulo]")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosExcluidos.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaArticulosExcluidosDatosRevisionVentas.SetPlaceholderText("")
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub

Sub CargarListaCodigosArticulosExcluidosDatosRevisionVentas As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ListaArticulosExcluidosAnalisisTarifasDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinArticulosExcluidos"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas",lstReg)
			End If
		End If
	End If
	Return mRes
End Sub
'
Sub jamTableViewListaArticulosExcluidosDatosRevisionVentas_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas"
			QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas
		Case "AddListaArticulosAArticulosExcluidosDatosRevisionVenta"
			AddListaArticulosAArticulosExcluidosDatosRevisionVenta
	End Select
End Sub

Sub jamTableViewListaArticulosExcluidosDatosRevisionVentas_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "QuitarArticuloDeListaArticulosExcluidosDatosRevisionVentas"
			Dim FilaSel As Int=jamTableViewListaArticulosExcluidosDatosRevisionVentas.GetIndiceFilaSeleccionada
			Dim TipoTarifaSel As Int=jamTableViewListaArticulosExcluidosDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
			Dim CodigoTarifaSel As String=jamTableViewListaArticulosExcluidosDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
			Dim ArticuloSel As String=jamTableViewListaArticulosExcluidosDatosRevisionVentas.GetValorSQLCampoFila(FilaSel,"Articulo")

			Wait For(QuitarArticuloListaArticulosExcluidosDatosRevisionVentas(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return

			Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			
			If Accion="SinArticulosExcluidos" Then
				Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos excluidos para este Análisis de Tarifas.","Aviso")
				Wait For (msa) Msgbox_Result
			End If

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
	
			Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
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
			
		Case "QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas"
			QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas
			

	End Select
End Sub


Sub AddArticuloAArticulosExcluidosDatosRevisionVentas(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String, DescripcionArticuloSel As String)   'solo se podrán añadir desde el jamTV de DatosRevisionVentas
'	Dim cSelArtNAV As cSeleccionArticuloNAV
'	cSelArtNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
'	wait for cSeleccionArticuloNAV_Done (mSelCliNAV As Map)
'	Dim ArticuloSel As String=mSelCliNAV.Get("Articulo")
'	If ArticuloSel="" Then Return
'	If 1=mSelCliNAV.Get("ArticuloBloqueado") Then
'		Dim msa As Object=xui.MsgboxAsync("Los artículos bloqueados y bloqueados por no disponible se excluyen siempre del análisis","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If

	Dim msa As Object = xui.Msgbox2Async("¿Excluir el artículo " & ArticuloSel & " " & DescripcionArticuloSel & " del análisis de tarifas actual?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
'	
	Wait For(ExcluirArticuloDatosRevisionVentas(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return

'''	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	If Accion<>"OK" Then Return
'''
'''	'Dim lstReg As List=mRes.get("lstReg")
'''	
'''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
'''	
'''	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
'''	Wait For (rSub) complete (mResultSetData As Map)
'''	rsData.Close
'''	
'''	If Not(mResultSetData.Get("FlagOK")) Then
'''		If ""<>mResultSetData.Get("msgError") Then
'''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''			Wait For (msa) Msgbox_Result
'''			#if debug
'''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'''			Wait For (msa) Msgbox_Result (rInt As Int)
'''			If rInt=xui.DialogResponse_Positive Then
'''				jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
'''				Return
'''			End If
'''			#End If
'''			ExitApplication
'''		End If
'''		If ""<>mResultSetData.Get("msgAviso") Then
'''			If True=mResultSetData.Get("ListaVacia") Then Return
'''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
	'''			Wait For (msa) Msgbox_Result
	'''		End If
	'''
	'''	End If


	jamLoadingIndicator1.MensajeLoading="Cargando datos para revisión Ventas..."
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarListaAnalisisDatosRevisionVentas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		'Return False
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentas=0 where MaxFechaVentas is null")
	'mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentasTalla=0 where MaxFechaVentasTalla is null")
	
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisDatosRevisionVentas order by TipoTarifa, CodigoTarifa, Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
				'Return False
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return 'True
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub


Sub ExcluirArticuloDatosRevisionVentas(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasExcluirArticuloDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
			Accion="OK"
			mRes.Put("Accion", Accion)
		End If
	End If
	Return mRes
End Sub


Sub AddListaArticulosAArticulosExcluidosDatosRevisionVenta
	
	Dim B4XLongMsg As B4XLongTextTemplate
	B4XLongMsg.Initialize
	B4XLongMsg.Resize(600dip,500dip)
	Dim sbA As StringBuilder
	sbA.Initialize
	sbA.Append("Los datos deben ser copiados de una tabla con los encabezados siguientes:").Append(CRLF).Append(CRLF)
	sbA.Append("TipoTarifa").Append(CRLF)
	sbA.Append("CodigoTarifa").Append(CRLF)
	sbA.Append("Articulo").Append(CRLF).Append(CRLF)
	sbA.Append("No importa si los encabezados están en mayúsculas o minúsculas, ni el orden de las columnas.").Append(CRLF).Append(CRLF)
	sbA.Append("Los posibles valores para el campo TipoTarifa son:").Append(CRLF)
	sbA.Append("0 (=Cliente)").Append(CRLF)
	sbA.Append("1 (=Grupo de Precio)").Append(CRLF).Append(CRLF)
	sbA.Append("No debe haber lineas en blanco entre los datos.").Append(CRLF)
	
	B4XLongMsg.Text=sbA.ToString
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip

	Wait For(rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstEncabezadosTabla As List
	lstEncabezadosTabla.Initialize
	lstEncabezadosTabla.Add("TipoTarifa")
	lstEncabezadosTabla.Add("CodigoTarifa")
	lstEncabezadosTabla.Add("Articulo")

	Dim cjamPegarDatosTipoTarifaCodigoTarifaArticulosExcluidos As jamPegarDatosPreview
	cjamPegarDatosTipoTarifaCodigoTarifaArticulosExcluidos.Initialize(Me, frm.RootPane, lstEncabezadosTabla)
	cjamPegarDatosTipoTarifaCodigoTarifaArticulosExcluidos.show
	Wait For(cjamPegarDatosTipoTarifaCodigoTarifaArticulosExcluidos) jamPegarDatos_Done (lstCamposPegar As List)
	
	Dim UUIDBatch As String=GenerarUUIDv4
	Dim lstCommands As List
	lstCommands.Initialize
	For Each mData As Map In lstCamposPegar
		Dim TipoTarifa As Int=mData.Get("TIPOTARIFA")
		Dim CodigoTarifa As String=mData.Get("CODIGOTARIFA")
		Dim Articulo As String=mData.Get("ARTICULO")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasTipoCodigoArticuloBatchInsertar",Array(UUIDBatch, mIDAnalisisTarifasVenta, TipoTarifa,CodigoTarifa,Articulo))
		lstCommands.Add(cmd)
	Next
	JRDCQuery.EjecutarBatch(Main.rdcLinkNav,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	If result=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query AnalisisTarifasTipoCodigoArticuloBatchInsertar","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim Comando As String="AnalisisTarifasExcluirBatchArticulosDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDBatch, DateTime.Now,Main.DatosUsuario.NombreADUsuarioWindows), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	'Eliminar el batch está incluido en el SP anterior
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasTipoCodigoArticuloBatchEliminar",Array(UUIDBatch))
'	JRDCQuery.EjecutarBatch(Main.rdcLinkNav,lstCommands,Me)
'	Wait For EjecutarBatch_Completed (result As Boolean)

	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
			
	If Accion="SinArticulosExcluidos" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos excluidos para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
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


End Sub

Sub QuitarArticuloListaArticulosExcluidosDatosRevisionVentas(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarArticuloListaArticulosExcluidosDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub



Sub QuitarTodasLineasRegistrosFiltradosArticulosExcluidosDatosRevisionVentas

	If jamTableViewListaArticulosExcluidosDatosRevisionVentas.NumeroTotalRegistros-jamTableViewListaArticulosExcluidosDatosRevisionVentas.NumeroTotalRegistrosFiltrados=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay registros filtrados.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
		
	Dim msa As Object = xui.Msgbox2Async("¿Quitar todas las líneas filtradas de la lista de exclusiones de datos ventas?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim UUIDBatch As String=GenerarUUIDv4
	
	Dim rsExcl As ResultSet=jamTableViewListaArticulosExcluidosDatosRevisionVentas.SQL.ExecQuery2("select * from tblOrigenDatos where " & jamTableViewListaArticulosExcluidosDatosRevisionVentas.sCamposFiltrados,jamTableViewListaArticulosExcluidosDatosRevisionVentas.lstValoresFiltros)
	Dim lstCommands As List
	lstCommands.Initialize
	Do While rsExcl.NextRow
		Dim TipoTarifa As Int=rsExcl.GetInt("TipoTarifa")
		Dim CodigoTarifa As String=rsExcl.Getstring("CodigoTarifa")
		Dim Articulo As String=rsExcl.Getstring("Articulo")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasTipoCodigoArticuloBatchInsertar",Array(UUIDBatch, mIDAnalisisTarifasVenta, TipoTarifa,CodigoTarifa,Articulo))
		lstCommands.Add(cmd)
	Loop
	rsExcl.Close
	JRDCQuery.EjecutarBatch(Main.rdcLinkNav,lstCommands,Me)
	Wait For EjecutarBatch_Completed (result As Boolean)
	If result=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query AnalisisTarifasTipoCodigoArticuloBatchInsertar","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim Comando As String="AnalisisTarifasQuitarBatchListaArticulosExcluidosDatosRevisionVentas"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDBatch), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	'Eliminar el batch está incluido en el SP anterior
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasTipoCodigoArticuloBatchEliminar",Array(UUIDBatch))
'	JRDCQuery.EjecutarBatch(Main.rdcLinkNav,lstCommands,Me)
'	Wait For EjecutarBatch_Completed (result As Boolean)

	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
			
	If Accion="SinArticulosExcluidos" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de códigos de artículos excluidos para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
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
End Sub

#End Region

'
'
'#Region TarifasCompraUsuario
'Sub TarifasCompraUsuario
'	If Navegando=False Then
'		lstHistorial.Add("TarifasCompraUsuario")
'	End If
'	If pnlJamTableViewListaTarifasCompraUsuario.IsInitialized=False Then
'		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaTarifasCompraUsuario")
'		Sleep(0)
'		
''		jamTableViewListaTarifasCompraUsuario.AbrirCamposBuilder
''		Return
''		
'		Dim rSub As ResumableSub=jamTableViewListaTarifasCompraUsuario.ConfigurarTableView("ListaAnalisisTarifasListaTarifasCompraUsuario.json",Null)
'		wait for (rSub) complete (mRes As Map)
'		Log(mRes)
'		If Not(mRes.Get("FlagOK")) Then
'			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			frm.Close
'			Return
'		End If
'		
'		jamTableViewListaTarifasCompraUsuario.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'
'		Dim CF As DatosCellFactoryJamTableView
'		CF.Initialize
'		CF.NombreFuncionCellFactory=jamTableViewListaTarifasCompraUsuario.CellFactory_ColumnaFecha
'		jamTableViewListaTarifasCompraUsuario.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
'		
'		Dim dCF As DatosCellFactoryJamTableView
'		dCF.Initialize
'		dCF.AliasCampoColumna="Seleccionado"
'		dCF.CellFactoryEnCallBack=False
'		dCF.NombreFuncionCellFactory=jamTableViewListaTarifasCompraUsuario.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		jamTableViewListaTarifasCompraUsuario.SetCellFactory(dCF)
'		
'		jamTableViewListaTarifasCompraUsuario.EstadoMenuItem(jamTableViewListaTarifasCompraUsuario.MenuBarLinea,False)
'		
''		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Artículos a Lista de Artículos Excluidos de la Revision Ventas","AddArticulosAListaArticulosExcluidosDatosRevisionVentas",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
''		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
''		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
''		jamTableViewListaArticulosExcluidosDatosRevisionVentas.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Artículos Seleccionados de la Lista de Artículos Incluidos de la Revision Ventas","QuitarArtículosSeleccionados",Chr(0xF196),jamTableViewListaArticulosExcluidosDatosRevisionVentas.MenuBarAcciones)
'		
'		jamTableViewListaTarifasCompraUsuario.AddContextMenuItemFontAwesomeText("Borrar Precio Compra Usuario","QuitarLineaDeListaTarifasCompraUsuario",Chr(0xF196))
'		
'	End If
'	pnlJamTableViewListaTarifasCompraUsuario.BringToFront
'	lblInfoMostrada.Text="Lista Tarifas Compra Usuario"
'	
'	
'	Wait For(CargarListaTarifasCompraUsuario) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then Return
'	
'	If Accion="SinTarifasCompraUsuario" Then
'		Dim msa As Object=xui.MsgboxAsync("No hay datos de Tarifas Compra Usuario para este análisis de tarifas.","Aviso")
'		Wait For (msa) Msgbox_Result
'	End If
'
'	'Dim lstReg As List=mRes.get("lstReg")
'	
'	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaTarifasCompraUsuario order by Articulo, Proveedor")
'	
'	Dim rSub As ResumableSub=jamTableViewListaTarifasCompraUsuario.setdata(rsData)
'	Wait For (rSub) complete (mResultSetData As Map)
'	rsData.Close
'	
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			#if debug
'			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt=xui.DialogResponse_Positive Then
'				jamTableViewListaTarifasCompraUsuario.AbrirCamposBuilder
'				Return
'			End If
'			#End If
'			ExitApplication
'		End If
'		If ""<>mResultSetData.Get("msgAviso") Then
'			If True=mResultSetData.Get("ListaVacia") Then
'				jamTableViewListaTarifasCompraUsuario.SetPlaceholderText("")
'				 Return
'			End If
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'	
'	End If
'End Sub
'
'Sub CargarListaTarifasCompraUsuario As ResumableSub
'	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaTarifasCompraUsuario")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasListaTarifasCompraUsuario"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
''			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
''				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
''			Wait For (msa) Msgbox_Result
'			Accion="SinTarifasCompraUsuario"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mResp As Map=lstReg.Get(0)
'			Dim sResp As String=mResp.GetValueAt(0)
'			If sResp.ToUpperCase.StartsWith("ERROR") Then
'				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
'				Wait For (msa) Msgbox_Result
'				Accion="NOK"
'				mRes.Put("Accion", Accion)
'			Else
'				Accion="OK"
'				mRes.Put("Accion", Accion)
'				mRes.Put("lstReg", lstReg)
'				
'				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaTarifasCompraUsuario",lstReg)
'				mSQL.ExecNonQuery2("update tblAnalisisTarifasListaTarifasCompraUsuario set IDAnalisisTarifas=?",Array(mIDAnalisisTarifasVenta))
'			End If
'		End If
'	End If
'	Return mRes
'End Sub
''
''Sub jamTableViewListaArticulosExcluidosDatosRevisionVentas_MenuBarMenuItem_Action(TagMenuItem As String)
''	Select Case TagMenuItem
''		Case "AddArticulosAListaArticulosExcluidosDatosRevisionVentas"
''			AddArticuloAArticulosExcluidosDatosRevisionVentas
''	End Select
''End Sub
'
'Sub jamTableViewListaTarifasCompraUsuario_ContextMenuItem_Action(TagMenuItem As String)
'	Select Case TagMenuItem
'		Case "QuitarLineaDeListaTarifasCompraUsuario"
'			Dim FilaSel As Int=jamTableViewListaTarifasCompraUsuario.GetIndiceFilaSeleccionada
'			Dim TipoTarifaSel As Int=jamTableViewListaTarifasCompraUsuario.GetValorSQLCampoFila(FilaSel,"TipoTarifa")
'			Dim CodigoTarifaSel As String=jamTableViewListaTarifasCompraUsuario.GetValorSQLCampoFila(FilaSel,"CodigoTarifa")
'			Dim ArticuloSel As String=jamTableViewListaTarifasCompraUsuario.GetValorSQLCampoFila(FilaSel,"Articulo")
'
'			Wait For(QuitarLineaListaTarifasCompraUsuario(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
'			Dim Accion As String=mRes.Get("Accion")
'			If Accion<>"OK" Then Return
'
'			Wait For(CargarListaTarifasCompraUsuario) complete (mRes As Map)
'			Dim Accion As String=mRes.Get("Accion")
'			If Accion="NOK" Then Return
'			
'			If Accion="SinTarifasCompraUsuario" Then
'				Dim msa As Object=xui.MsgboxAsync("No hay datos de Tarifas Compra Usuario para este Análisis de Tarifas.","Aviso")
'				Wait For (msa) Msgbox_Result
'			End If
'
'			'Dim lstReg As List=mRes.get("lstReg")
'	
'			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaTarifasCompraUsuario order by Articulo")
'	
'			Dim rSub As ResumableSub=jamTableViewListaTarifasCompraUsuario.setdata(rsData)
'			Wait For (rSub) complete (mResultSetData As Map)
'			rsData.Close
'	
'			If Not(mResultSetData.Get("FlagOK")) Then
'				If ""<>mResultSetData.Get("msgError") Then
'					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'					Wait For (msa) Msgbox_Result
'			#if debug
'					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'					Wait For (msa) Msgbox_Result (rInt As Int)
'					If rInt=xui.DialogResponse_Positive Then
'						jamTableViewListaTarifasCompraUsuario.AbrirCamposBuilder
'						Return
'					End If
'			#End If
'					ExitApplication
'				End If
'				If ""<>mResultSetData.Get("msgAviso") Then
'					If True=mResultSetData.Get("ListaVacia") Then Return
'					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'					Wait For (msa) Msgbox_Result
'				End If
'	
'			End If
'	End Select
'End Sub
'
'
''Sub AddArticulosAListaArticulosExcluidosDatosRevisionVentas(ArticuloSel As String) As ResumableSub 
''	
''	Dialog.Title="Selecciona método"
''	Dialog.TitleBarHeight=60dip
''	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
''	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
''	Dim B4XListDlg As B4XListTemplate
''	B4XListDlg.Initialize
''
''	Dim TextSize As Float = 18 'FLOAT
''	Dim xclv As CustomListView=B4XListDlg.CustomListView1
''	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
''	
''	Dim dlbl As Label=xclv.DesignerLabel
''	dlbl.TextSize=TextSize
''		
''	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
''	
''	B4XListDlg.Options=lstOpciones
''	
''	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
''	
''	For i=0 To lstOpciones.size-1
''		xclv.ResizeItem(i,80dip)
''	Next
''	
''	' OJO ... es un B4XView no Button
''	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
''	If bCancel.IsInitialized Then
''		'Log("bCancel" & bCancel.Text)
''		bCancel.Left=bCancel.Left-50dip
''		bCancel.Width=bCancel.Width+30dip
''		bCancel.TextSize=18
''	End If
''	
''	Wait For (rSub) Complete (rInt As Int)
''	If rInt<>xui.DialogResponse_Positive Then Return
''	Dim Opcion As String= B4XListDlg.SelectedItem
''	If Opcion="Individual" Then
''		AddArticuloIndividualAArticulosExcluidos
''	Else
''		'AddGrupoArticulosAArticulosIncluidos
''	End If
''	
''End Sub
'
''''Sub AddLineaListaTarifasCompraUsuario(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String, DescripcionArticuloSel As String, Proveedor As String, Divisa As String, PrecioCompraDivisa As Double)   'solo se podrán añadir desde el jamTV de Compras
'''''	Dim cSelArtNAV As cSeleccionArticuloNAV
'''''	cSelArtNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
'''''	wait for cSeleccionArticuloNAV_Done (mSelCliNAV As Map)
'''''	Dim ArticuloSel As String=mSelCliNAV.Get("Articulo")
'''''	If ArticuloSel="" Then Return
'''''	If 1=mSelCliNAV.Get("ArticuloBloqueado") Then
'''''		Dim msa As Object=xui.MsgboxAsync("Los artículos bloqueados y bloqueados por no disponible se excluyen siempre del análisis","Aviso")
'''''		Wait For (msa) Msgbox_Result
'''''		Return
'''''	End If
'''''	
''''	Wait For(ExcluirArticuloDatosRevisionVentas(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion<>"OK" Then Return
''''
'''''''	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
'''''''	Dim Accion As String=mRes.Get("Accion")
'''''''	If Accion<>"OK" Then Return
'''''''
'''''''	'Dim lstReg As List=mRes.get("lstReg")
'''''''	
'''''''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
'''''''	
'''''''	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
'''''''	Wait For (rSub) complete (mResultSetData As Map)
'''''''	rsData.Close
'''''''	
'''''''	If Not(mResultSetData.Get("FlagOK")) Then
'''''''		If ""<>mResultSetData.Get("msgError") Then
'''''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''''''			Wait For (msa) Msgbox_Result
'''''''			#if debug
'''''''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'''''''			Wait For (msa) Msgbox_Result (rInt As Int)
'''''''			If rInt=xui.DialogResponse_Positive Then
'''''''				jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
'''''''				Return
'''''''			End If
'''''''			#End If
'''''''			ExitApplication
'''''''		End If
'''''''		If ""<>mResultSetData.Get("msgAviso") Then
'''''''			If True=mResultSetData.Get("ListaVacia") Then Return
'''''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
''''	'''			Wait For (msa) Msgbox_Result
''''	'''		End If
''''	'''
''''	'''	End If
''''
''''
''''	jamLoadingIndicator1.MensajeLoading="Cargando datos Tarifas Compras..."
''''	jamLoadingIndicator1.Show
''''	
''''	Wait For(ActualizarListatarifascomprausuario) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion<>"OK" Then
''''		SalirModulo
''''		'Return False
''''	End If
''''
''''	'Dim lstReg As List=mRes.get("lstReg")
''''	
''''	mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentas=0 where MaxFechaVentas is null")
''''	'mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentasTalla=0 where MaxFechaVentasTalla is null")
''''	
''''	
''''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisDatosRevisionVentas order by TipoTarifa, CodigoTarifa, Articulo, Talla")
''''	
''''	Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.setdata(rsData)
''''	Wait For (rSub) complete (mResultSetData As Map)
''''	rsData.Close
''''	jamLoadingIndicator1.Close
''''	If Not(mResultSetData.Get("FlagOK")) Then
''''		If ""<>mResultSetData.Get("msgError") Then
''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
''''			Wait For (msa) Msgbox_Result
''''			#if debug
''''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
''''			Wait For (msa) Msgbox_Result (rInt As Int)
''''			If rInt=xui.DialogResponse_Positive Then
''''				jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
''''				'Return False
''''			End If
''''			#End If
''''			ExitApplication
''''		End If
''''		If ""<>mResultSetData.Get("msgAviso") Then
''''			If True=mResultSetData.Get("ListaVacia") Then Return 'True
''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
''''			Wait For (msa) Msgbox_Result
''''		End If
''''	
''''	End If
''''End Sub
'
''Sub ExcluirArticuloDatosRevisionVentas(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
''	Dim Accion As String
''	Dim mRes As Map
''	mRes.Initialize
''	Dim Comando As String="AnalisisTarifasExcluirArticuloDatosRevisionVentas"
''	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)
''
''	Wait For DatosJRDC_Completed (mResult As Map)
''
''	If mResult.Get("ConnOK")=False Then
''		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
''		Wait For (msa) Msgbox_Result
''		Accion="NOK"
''		mRes.Put("Accion", Accion)
''	Else
''
''		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'''			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'''			Wait For (msa) Msgbox_Result
''			Accion="NOK"
''			mRes.Put("Accion", Accion)
''		Else
''			Dim lstReg As List=mResult.Get("lstRes")
''			Dim mResp As Map=lstReg.Get(0)
''			Dim sResp As String=mResp.GetValueAt(0)
''			If sResp.ToUpperCase.StartsWith("ERROR") Then
''				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
''				Wait For (msa) Msgbox_Result
''				Accion="NOK"
''			Else
''				Accion="OK"
''				mRes.Put("Accion", Accion)
''				'mRes.Put("mData", mResp)
''			End If
''			Accion="OK"
''			mRes.Put("Accion", Accion)
''		End If
''	End If
''	Return mRes
''End Sub
'
'Sub QuitarLineaListaTarifasCompraUsuario(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasQuitarPrecioCompraUsuario"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
''			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
''			Wait For (msa) Msgbox_Result
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mResp As Map=lstReg.Get(0)
'			Dim sResp As String=mResp.GetValueAt(0)
'			If sResp.ToUpperCase.StartsWith("ERROR") Then
'				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
'				Wait For (msa) Msgbox_Result
'				Accion="NOK"
'				mRes.Put("Accion", Accion)
'			Else
'				Accion="OK"
'				mRes.Put("Accion", Accion)
'				'mRes.Put("mData", mResp)
'			End If
'		End If
'	End If
'	Return mRes
'End Sub
'#End Region
'

#Region CostesArticuloUsuario
Sub CostesArticulosUsuario
	If Navegando=False Then
		lstHistorial.Add("CostesArticulosUsuario")
	End If
	If pnlJamTableViewListaCostesArticulosUsuario.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasListaCostesArticulosUsuario")
		Sleep(0)
		
'		jamTableViewListaCostesArticulosUsuario.AbrirCamposBuilder
'		Return
'		
		Dim rSub As ResumableSub=jamTableViewListaCostesArticulosUsuario.ConfigurarTableView("ListaAnalisisTarifasListaCostesArticulosUsuario.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		jamTableViewListaCostesArticulosUsuario.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewListaCostesArticulosUsuario.CellFactory_ColumnaFecha
		jamTableViewListaCostesArticulosUsuario.SetCellFactoryListaCampos(CF, Array As String("FechaActualizacionLong"))
		
		Dim dCF As DatosCellFactoryJamTableView
		dCF.Initialize
		dCF.AliasCampoColumna="Seleccionado"
		dCF.CellFactoryEnCallBack=False
		dCF.NombreFuncionCellFactory=jamTableViewListaCostesArticulosUsuario.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableViewListaCostesArticulosUsuario.SetCellFactory(dCF)
		
		jamTableViewListaCostesArticulosUsuario.EstadoMenuItem(jamTableViewListaCostesArticulosUsuario.MenuBarLinea,False)
		
		jamTableViewListaCostesArticulosUsuario.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Costes Artículo Usuario","AddCostesArticuloUsuario",Chr(0xF196),jamTableViewListaCostesArticulosUsuario.MenuBarAcciones)
		jamTableViewListaCostesArticulosUsuario.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Todos","SeleccionarTodos",Chr(0xF046),jamTableViewListaCostesArticulosUsuario.MenuBarAcciones)
		jamTableViewListaCostesArticulosUsuario.AddMenuItemFontAwesomeToMenuInMenuBar("Deseleccionar Todos","DeseleccionarTodos",Chr(0xF096),jamTableViewListaCostesArticulosUsuario.MenuBarAcciones)
		jamTableViewListaCostesArticulosUsuario.AddMenuItemFontAwesomeToMenuInMenuBar("Quitar Costes Seleccionados de la Lista de Costes Usuario","QuitarLineasSeleccionadasDeListaCostesArticulosUsuario",Chr(0xF196),jamTableViewListaCostesArticulosUsuario.MenuBarAcciones)
		
		jamTableViewListaCostesArticulosUsuario.AddContextMenuItemFontAwesomeText("Editar Coste Artículo Usuario","EditarCosteArticuloUsuario",Chr(0xF044))
		jamTableViewListaCostesArticulosUsuario.AddContextMenuItemFontAwesomeText("Borrar Coste Artículo Usuario","QuitarLineaDeListaCostesArticulosUsuario",Chr(0xF014))

	End If
	pnlJamTableViewListaCostesArticulosUsuario.BringToFront
	lblInfoMostrada.Text="Lista Costes Artículos Usuario"
	
	
	Wait For(CargarListaCostesArticulosUsuario) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	If Accion="SinCostesArticuloUsuario" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos de Costes Artículos Usuario para este análisis de tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaCostesArticulosUsuario order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaCostesArticulosUsuario.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaCostesArticulosUsuario.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				jamTableViewListaCostesArticulosUsuario.SetPlaceholderText("")
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	
	End If
End Sub

Sub CargarListaCostesArticulosUsuario As ResumableSub
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasListaCostesArticulosUsuario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasListaCostesArticulosUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en la tabla de tarifas incluidas para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & "." & CRLF & _
'				"Se seleccionarán todas las tarifas de Navision, salvo las que se indiquen en la tabla de exclusiones.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinCostesArticuloUsuario"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				jamLoadingIndicator1.close
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
				
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasListaCostesArticulosUsuario",lstReg)
				mSQL.ExecNonQuery2("update tblAnalisisTarifasListaCostesArticulosUsuario set IDAnalisisTarifas=?",Array(mIDAnalisisTarifasVenta))
			End If
		End If
	End If
	Return mRes
End Sub


Sub AnalisisTarifasNuevoEditarListaCostesArticuloUsuarioBatch(UUIDSel As String, IDAnTar As Int, Fech As Long, Usr As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasNuevoEditarListaCostesArticuloUsuarioBatch"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDSel,IDAnTar,Fech,Usr), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result

		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			'no se puede dar este error aquí.
			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewListaCostesArticulosUsuario_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "Seleccionado"
			AlternarSeleccionadojamTableViewListaCostesArticulosUsuario(DatosCeldaSeleccionada)

	End Select
End Sub

Sub SeleccionarTodosCostesArticulosUsuario(Seleccionar As Boolean)
	Dim SelInt As Int
	If Seleccionar Then
		SelInt=1
	Else
		SelInt=0
	End If
	jamTableViewListaCostesArticulosUsuario.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(SelInt))
	mSQL.ExecNonQuery2("update tblAnalisisTarifasListaCostesArticulosUsuario set Seleccionado=?",Array As Object(SelInt))
	wait for(jamTableViewListaCostesArticulosUsuario.RefreshTableViewData) complete (rObj As Object)
End Sub

Sub AlternarSeleccionadojamTableViewListaCostesArticulosUsuario(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim FilaSel As Int=jamTableViewListaCostesArticulosUsuario.GetIndiceFilaSeleccionada
	Dim ArticuloSel As String=jamTableViewListaCostesArticulosUsuario.GetValorSQLCampoFila(FilaSel, "Articulo")
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			
		Case 1
			NuevoValor=0
	End Select
	'jamTableViewListaTarifasIncluidas.SQL.ExecNonQuery2("update tblorigenDatos set Seleccionado=?",Array As Object(NuevoValor))
	mSQL.ExecNonQuery2("update tblAnalisisTarifasListaCostesArticulosUsuario set Seleccionado=? where Articulo=?",Array As Object(NuevoValor, ArticuloSel))
	jamTableViewListaCostesArticulosUsuario.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
End Sub


Sub jamTableViewListaCostesArticulosUsuario_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddCostesArticuloUsuario"
			AddCostesArticuloUsuario
		Case "SeleccionarTodos"
			SeleccionarTodosCostesArticulosUsuario(True)
		Case "DeseleccionarTodos"
			SeleccionarTodosCostesArticulosUsuario(False)
		Case "QuitarLineasSeleccionadasDeListaCostesArticulosUsuario"
			QuitarLineasSeleccionadasDeListaCostesArticulosUsuario
	End Select
	
End Sub

Sub QuitarLineasSeleccionadasDeListaCostesArticulosUsuario
	
	Dim NumCostesArtUsu As Int=Utilidades.FixNullint(mSQL.ExecQuerySingleResult("select count(*) from tblAnalisisTarifasListaCostesArticulosUsuario where Seleccionado=1"))
	If NumCostesArtUsu=0 Then
		wait for(Utilidades.MsgBoxXUI("Aviso","No hay líneas seleccionadas para quitar de la lista costes usuario.")) complete (rObj As Object)
		Return
	Else
		wait for(Utilidades.MsgBox2XUI("Confirma","¿Se han seleccionado " & NumCostesArtUsu & " costes para quitar de la lista de costes usuario." & CRLF & CRLF & "¿Continuar?","Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	jamLoadingIndicator1.MensajeLoading="Quitando Costes seleccionadas de la lista de costes usuario..."
	jamLoadingIndicator1.Show

	Dim UUIDSel As String=GenerarUUIDv4
	Dim lstCommands As List
	lstCommands.Initialize
	Dim rsQuitarCostesUsuarioSeleccionadas As ResultSet=mSQL.ExecQuery("select Articulo from tblAnalisisTarifasListaCostesArticulosUsuario where Seleccionado=1")
	Do While rsQuitarCostesUsuarioSeleccionadas.NextRow
		Dim Articulo As String=rsQuitarCostesUsuarioSeleccionadas.GetString("Articulo")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasInsertarLineaCosteArticuloUsuarioBatch", _
			Array(UUIDSel,mIDAnalisisTarifasVenta,Articulo,0))
		lstCommands.Add(cmd)
	Loop
	rsQuitarCostesUsuarioSeleccionadas.Close
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible incluir los artículos usuario en la tabla batch.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	' CREAR Y EJECUTAR SP PARA BORRAR COSTES MASIVAMENTE DESDE TABLA BATCH
	wait for(AnalisisTarifasQuitarBatchCostesArticuloUsuario(UUIDSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar los costes seleccionados de la tabla de Costes de Usuario.","Error")
		Wait For (msa) Msgbox_Result
		 Return
	End If
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos de Costes Usuario..."
	Wait For(CargarListaCostesArticulosUsuario) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
			
	If Accion="SinCostesArticulosUsuario" Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No hay datos de Costes Artículos Usuario para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaCostesArticulosUsuario order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaCostesArticulosUsuario.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaCostesArticulosUsuario.AbrirCamposBuilder
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
End Sub

Sub jamTableViewListaCostesArticulosUsuario_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "EditarCosteArticuloUsuario"
			Dim FilaSel As Int=jamTableViewListaCostesArticulosUsuario.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaCostesArticulosUsuario.GetValorSQLCampoFila(FilaSel,"Articulo")
			EditarCosteArticuloUsuarioEnListaCostes(ArticuloSel,FilaSel)
		
		Case "QuitarLineaDeListaCostesArticulosUsuario"
			Dim FilaSel As Int=jamTableViewListaCostesArticulosUsuario.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewListaCostesArticulosUsuario.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim sMsg As String=$"¿Eliminar el coste artículo usuario para el artículo ${ArticuloSel}"$
			wait for(Utilidades.MsgBox2XUI("Confirma",sMsg,"Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return

			Wait For(QuitarLineaListaCostesArticulosUsuario(ArticuloSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return

			Wait For(CargarListaCostesArticulosUsuario) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			
			If Accion="SinCostesArticulosUsuario" Then
				Dim msa As Object=xui.MsgboxAsync("No hay datos de Costes Artículos Usuario para este Análisis de Tarifas.","Aviso")
				Wait For (msa) Msgbox_Result
			End If

			'Dim lstReg As List=mRes.get("lstReg")
	
			Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaCostesArticulosUsuario order by Articulo")
	
			Dim rSub As ResumableSub=jamTableViewListaCostesArticulosUsuario.setdata(rsData)
			Wait For (rSub) complete (mResultSetData As Map)
			rsData.Close
	
			If Not(mResultSetData.Get("FlagOK")) Then
				If ""<>mResultSetData.Get("msgError") Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
					Wait For (msa) Msgbox_Result
			#if debug
					Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
					Wait For (msa) Msgbox_Result (rInt As Int)
					If rInt=xui.DialogResponse_Positive Then
						jamTableViewListaCostesArticulosUsuario.AbrirCamposBuilder
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
	End Select
End Sub


'Sub AddArticulosAListaArticulosExcluidosDatosRevisionVentas(ArticuloSel As String) As ResumableSub 
'	
'	Dialog.Title="Selecciona método"
'	Dialog.TitleBarHeight=60dip
'	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
'	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
'
'	Dim TextSize As Float = 18 'FLOAT
'	Dim xclv As CustomListView=B4XListDlg.CustomListView1
'	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
'	
'	Dim dlbl As Label=xclv.DesignerLabel
'	dlbl.TextSize=TextSize
'		
'	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
'	
'	B4XListDlg.Options=lstOpciones
'	
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	
'	' OJO ... es un B4XView no Button
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	If bCancel.IsInitialized Then
'		'Log("bCancel" & bCancel.Text)
'		bCancel.Left=bCancel.Left-50dip
'		bCancel.Width=bCancel.Width+30dip
'		bCancel.TextSize=18
'	End If
'	
'	Wait For (rSub) Complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim Opcion As String= B4XListDlg.SelectedItem
'	If Opcion="Individual" Then
'		AddArticuloIndividualAArticulosExcluidos
'	Else
'		'AddGrupoArticulosAArticulosIncluidos
'	End If
'	
'End Sub

'''Sub AddLineaListaTarifasCompraUsuario(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String, DescripcionArticuloSel As String, Proveedor As String, Divisa As String, PrecioCompraDivisa As Double)   'solo se podrán añadir desde el jamTV de Compras
''''	Dim cSelArtNAV As cSeleccionArticuloNAV
''''	cSelArtNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
''''	wait for cSeleccionArticuloNAV_Done (mSelCliNAV As Map)
''''	Dim ArticuloSel As String=mSelCliNAV.Get("Articulo")
''''	If ArticuloSel="" Then Return
''''	If 1=mSelCliNAV.Get("ArticuloBloqueado") Then
''''		Dim msa As Object=xui.MsgboxAsync("Los artículos bloqueados y bloqueados por no disponible se excluyen siempre del análisis","Aviso")
''''		Wait For (msa) Msgbox_Result
''''		Return
''''	End If
''''	
'''	Wait For(ExcluirArticuloDatosRevisionVentas(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	If Accion<>"OK" Then Return
'''
''''''	Wait For(CargarListaCodigosArticulosExcluidosDatosRevisionVentas) complete (mRes As Map)
''''''	Dim Accion As String=mRes.Get("Accion")
''''''	If Accion<>"OK" Then Return
''''''
''''''	'Dim lstReg As List=mRes.get("lstReg")
''''''	
''''''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaArticulosExcluidosDatosRevisionVentas order by Articulo")
''''''	
''''''	Dim rSub As ResumableSub=jamTableViewListaArticulosExcluidosDatosRevisionVentas.setdata(rsData)
''''''	Wait For (rSub) complete (mResultSetData As Map)
''''''	rsData.Close
''''''	
''''''	If Not(mResultSetData.Get("FlagOK")) Then
''''''		If ""<>mResultSetData.Get("msgError") Then
''''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
''''''			Wait For (msa) Msgbox_Result
''''''			#if debug
''''''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
''''''			Wait For (msa) Msgbox_Result (rInt As Int)
''''''			If rInt=xui.DialogResponse_Positive Then
''''''				jamTableViewListaArticulosExcluidosDatosRevisionVentas.AbrirCamposBuilder
''''''				Return
''''''			End If
''''''			#End If
''''''			ExitApplication
''''''		End If
''''''		If ""<>mResultSetData.Get("msgAviso") Then
''''''			If True=mResultSetData.Get("ListaVacia") Then Return
''''''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'''	'''			Wait For (msa) Msgbox_Result
'''	'''		End If
'''	'''
'''	'''	End If
'''
'''
'''	jamLoadingIndicator1.MensajeLoading="Cargando datos Tarifas Compras..."
'''	jamLoadingIndicator1.Show
'''	
'''	Wait For(ActualizarListatarifascomprausuario) complete (mRes As Map)
'''	Dim Accion As String=mRes.Get("Accion")
'''	If Accion<>"OK" Then
'''		SalirModulo
'''		'Return False
'''	End If
'''
'''	'Dim lstReg As List=mRes.get("lstReg")
'''	
'''	mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentas=0 where MaxFechaVentas is null")
'''	'mSQL.ExecNonQuery("Update tblAnalisisTarifasAnalisisDatosRevisionVentas set MaxFechaVentasTalla=0 where MaxFechaVentasTalla is null")
'''	
'''	
'''	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasAnalisisDatosRevisionVentas order by TipoTarifa, CodigoTarifa, Articulo, Talla")
'''	
'''	Dim rSub As ResumableSub=jamTableViewListaDatosRevisionVentas.setdata(rsData)
'''	Wait For (rSub) complete (mResultSetData As Map)
'''	rsData.Close
'''	jamLoadingIndicator1.Close
'''	If Not(mResultSetData.Get("FlagOK")) Then
'''		If ""<>mResultSetData.Get("msgError") Then
'''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''			Wait For (msa) Msgbox_Result
'''			#if debug
'''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'''			Wait For (msa) Msgbox_Result (rInt As Int)
'''			If rInt=xui.DialogResponse_Positive Then
'''				jamTableViewListaDatosRevisionVentas.AbrirCamposBuilder
'''				'Return False
'''			End If
'''			#End If
'''			ExitApplication
'''		End If
'''		If ""<>mResultSetData.Get("msgAviso") Then
'''			If True=mResultSetData.Get("ListaVacia") Then Return 'True
'''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'''			Wait For (msa) Msgbox_Result
'''		End If
'''	
'''	End If
'''End Sub

'Sub ExcluirArticuloDatosRevisionVentas(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasExcluirArticuloDatosRevisionVentas"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifaSel, CodigoTarifaSel,ArticuloSel, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows), Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
''			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
''			Wait For (msa) Msgbox_Result
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mResp As Map=lstReg.Get(0)
'			Dim sResp As String=mResp.GetValueAt(0)
'			If sResp.ToUpperCase.StartsWith("ERROR") Then
'				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
'				Wait For (msa) Msgbox_Result
'				Accion="NOK"
'			Else
'				Accion="OK"
'				mRes.Put("Accion", Accion)
'				'mRes.Put("mData", mResp)
'			End If
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		End If
'	End If
'	Return mRes
'End Sub

Sub AddCostesArticuloUsuario
	
	Dialog.Title="Selecciona método"
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
		
	Dim lstOpciones As List=Array As String("Individual","Conjunto (Copiar-Pegar Datos)")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	If Opcion="Individual" Then
		AddCosteArticuloUsuarioIndividual
	Else
		AddGrupoCostesArticulosUsuario
	End If
	
End Sub


Sub AddCosteArticuloUsuarioIndividual
	Dialog.Title="Indica Artículo"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	B4XInput.Text=""
	B4XInput.lblTitle.Text=""
	'B4XInput.mBase.Width=450dip
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XInput,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result <> xui.DialogResponse_Positive Then Return
	Dim ArticuloSel As String=B4XInput.Text
	
	Dialog.Title="Indica el coste artículo usuario"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	B4XInput.Text=0
	B4XInput.lblTitle.Text=$"Artículo: ${ArticuloSel} (Indicar dato en EUR)"$
	B4XInput.ConfigureForNumbers(True,False)
	B4XInput.mBase.Width=450dip
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XInput,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result <> xui.DialogResponse_Positive Then Return
	Dim CosteArtUsuario As Double=B4XInput.Text
	
	jamLoadingIndicator1.MensajeLoading="Añadiendo coste artículo usuario para artículo " & ArticuloSel & "..."
	jamLoadingIndicator1.Show
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarCosteArticuloUsuario", _
	Array(mIDAnalisisTarifasVenta,ArticuloSel,CosteArtUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			CosteArtUsuario,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	jamLoadingIndicator1.Close
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(CargarListaCostesArticulosUsuario) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
			
	If Accion="SinCostesArticulosUsuario" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos de Costes Artículos Usuario para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaCostesArticulosUsuario order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaCostesArticulosUsuario.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaCostesArticulosUsuario.AbrirCamposBuilder
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

	
End Sub

Sub AddGrupoCostesArticulosUsuario
	
	Dim B4XLongMsg As B4XLongTextTemplate
	B4XLongMsg.Initialize
	B4XLongMsg.Resize(600dip,500dip)
	Dim sbA As StringBuilder
	sbA.Initialize
	sbA.Append("Los datos deben ser copiados de una tabla con el encabezado siguiente:").Append(CRLF).Append(CRLF)
	sbA.Append("Articulo").Append(CRLF)
	sbA.Append("CosteUsuario").Append(CRLF).Append(CRLF)
	sbA.Append("No importa si el encabezado están en mayúsculas o minúsculas.").Append(CRLF).Append(CRLF)
	sbA.Append("No debe haber lineas en blanco entre los datos.").Append(CRLF)
	
	B4XLongMsg.Text=sbA.ToString
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For(rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim lstEncabezadosTabla As List
	lstEncabezadosTabla.Initialize
	lstEncabezadosTabla.Add("Articulo")
	lstEncabezadosTabla.Add("CosteUsuario")

	Dim cjamPegarDatosCostesArticuloUsuario As jamPegarDatosPreview
	cjamPegarDatosCostesArticuloUsuario.Initialize(Me, frm.RootPane, lstEncabezadosTabla)
	cjamPegarDatosCostesArticuloUsuario.show
	wait for (cjamPegarDatosCostesArticuloUsuario) jamPegarDatos_Done (lstCamposPegar As List)
	If lstCamposPegar.Size=0 Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Proceso copiar datos cancelado por el usuario.")) complete (rObj As Object)
		Return
	End If
	
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarLineasArticulosTallasBatchUsuarioDispositivo",Array(Main.DatosUsuario.NombreUsuarioWindows,Main.DatosUsuario.UsuarioWindows))
'	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (success As Boolean)
'	If success=False Then
'		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar los datos batch anteriores del usuario/dispositivo actuales.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	Dim Locale As AHLocale
	Locale.Initialize
	Dim AHNum As AHNumeric
	AHNum.InitializeNumber2(Locale)
	
	Dim UUIDSel As String=GenerarUUIDv4
	Dim lstCommands As List
	lstCommands.Initialize
	For Each mData As Map In lstCamposPegar
		Dim Articulo As String=mData.Get("ARTICULO")  'ojo jamPegarDatosPreview devuelve las claves de los maps en mayusculas
		Dim sCosteUsuario As String=mData.Get("COSTEUSUARIO")  'ojo jamPegarDatosPreview devuelve las claves de los maps en mayusculas
		Dim CosteUsuario As Double=AHNum.Parse(sCosteUsuario)
		'Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaCosteArticuloUsuarioBatch", _
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasInsertarLineaCosteArticuloUsuarioBatch", _
			Array(UUIDSel,mIDAnalisisTarifasVenta,Articulo,CosteUsuario))
		lstCommands.Add(cmd)
	Next
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible incluir los artículos-Costes usuario en la tabla batch.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	wait for (AnalisisTarifasNuevoEditarListaCostesArticuloUsuarioBatch(UUIDSel,mIDAnalisisTarifasVenta,DateTime.now,Main.DatosUsuario.NombreADUsuarioWindows)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	Wait For(CargarListaCostesArticulosUsuario) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
			
	If Accion="SinCostesArticulosUsuario" Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos de Costes Artículos Usuario para este Análisis de Tarifas.","Aviso")
		Wait For (msa) Msgbox_Result
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasListaCostesArticulosUsuario order by Articulo")
	
	Dim rSub As ResumableSub=jamTableViewListaCostesArticulosUsuario.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewListaCostesArticulosUsuario.AbrirCamposBuilder
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
End Sub

Sub QuitarLineaListaCostesArticulosUsuario(ArticuloSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarCosteArticuloUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,ArticuloSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
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
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub

Sub AnalisisTarifasQuitarBatchCostesArticuloUsuario(UUIDSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasQuitarBatchCostesArticuloUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
'			Dim msa As Object=xui.MsgboxAsync("¿¿No hay datos de Rutas de Producción definidas en NAV??.","Error")
'			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				jamLoadingIndicator1.close
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("mData", mResp)
			End If
		End If
	End If
	Return mRes
End Sub

Sub EditarCosteArticuloUsuarioEnListaCostes(Articulo As String, FilaSel As Int)

	jamLoadingIndicator1.MensajeLoading="Cargando datos coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Wait For (CosteArticuloUsuario(Articulo)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	If Accion="SinCosteArticuloUsuario" Then
		Dim sMsg As String=$"No existe coste artículo usuario para el artículo seleccionado."$
		wait for(Utilidades.MsgBoxXUI("Aviso",sMsg)) complete (rObj As Object)
		Return
	Else
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mP As Map=lstReg.Get(0)
		Dim CosteArticuloUsu As Double=mP.Get("CosteUnitarioUsuario")
	End If
	
	Dialog.Title="Indica el coste artículo usuario"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	B4XInput.Text=CosteArticuloUsu
	B4XInput.lblTitle.Text=$"Artículo: ${Articulo} (Indicar dato en EUR)"$
	B4XInput.ConfigureForNumbers(True,False)
	B4XInput.mBase.Width=450dip
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XInput,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result <> xui.DialogResponse_Positive Then Return
	Dim CosteArtUsuario As Double=B4XInput.Text
	
	jamLoadingIndicator1.MensajeLoading="Actualizando coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarCosteArticuloUsuario", _
		Array(mIDAnalisisTarifasVenta,Articulo,CosteArtUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			CosteArtUsuario,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	jamLoadingIndicator1.Close
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

	mSQL.ExecNonQuery2("update tblAnalisisTarifasListaCostesArticulosUsuario set CosteUnitarioUsuario=? where Articulo=?",Array As Object(CosteArtUsuario,Articulo))
	jamTableViewListaCostesArticulosUsuario.SQL.ExecNonQuery2("update tblOrigenDatos set CosteUnitarioUsuario=? where Articulo=?",Array As Object(CosteArtUsuario,Articulo))
	jamTableViewListaCostesArticulosUsuario.RefrescarFilaTVMetodoSQL(FilaSel)
	jamTableViewListaCostesArticulosUsuario.SeleccionarCelda("CosteUnitarioUsuario",FilaSel)
	
	
End Sub

Sub AddEditarCosteArticuloUsuario(Articulo As String)
	jamLoadingIndicator1.MensajeLoading="Cargando datos coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Wait For (CosteArticuloUsuario(Articulo)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	'Dim mData As Map
	'mData.Initialize
	'mData.put("IDAnalisisTarifas",mIDAnalisisTarifasVenta)
	'mData.put("Proveedor",Proveedor)
	'mData.put("Articulo",Articulo)
	Dim ExisteCosteArticuloUsuario As Boolean
	If Accion="SinCosteArticuloUsuario" Then
		Dim sMsg As String=$"No existe coste artículo usuario para el artículo seleccionado.
¿Grabar uno nuevo?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",sMsg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
'		Dim msa As Object = xui.Msgbox2Async($"No existe coste artículo usuario para el artículo seleccionado.
		'¿Grabar uno nuevo?"$,"Confirma", "Sí","Cancelar", "", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
		'fRCosteArticuloUsuario.Initialize(Me,"fRCosteArticuloUsuario",frm,"Nuevo Coste Artículo Usuario","Nuevo","AnalisisTarifasCosteArticuloUsuarioFormRegistro.json",mData)
		ExisteCosteArticuloUsuario=False
		
	Else
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mP As Map=lstReg.Get(0)
		Dim CosteArticuloUsu As Double=mP.Get("CosteUnitarioUsuario")
		ExisteCosteArticuloUsuario=True
		'Dim DivisaUsu As String=mP.Get("Divisa")
		'mData.put("CosteArticuloUsuario",CosteArticuloUsu)
		'mData.put("Divisa",DivisaUsu)
		'fRCosteArticuloUsuario.Initialize(Me,"fRCosteArticuloUsuario",frm,"Editar Coste Artículo Usuario","Editar","AnalisisTarifasCosteArticuloUsuarioFormRegistro.json",mData)
	End If
	
	Dialog.Title="Indica el coste artículo usuario"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	If ExisteCosteArticuloUsuario Then
		B4XInput.Text=CosteArticuloUsu
	End If
	B4XInput.lblTitle.Text=$"Artículo: ${Articulo} (Indicar dato en EUR)"$
	B4XInput.ConfigureForNumbers(True,False)
	B4XInput.mBase.Width=450dip
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XInput,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result <> xui.DialogResponse_Positive Then Return
	Dim CosteArtUsuario As Double=B4XInput.Text
	
	jamLoadingIndicator1.MensajeLoading="Actualizando coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarCosteArticuloUsuario", _
		Array(mIDAnalisisTarifasVenta,Articulo,CosteArtUsuario, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			CosteArtUsuario,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	jamLoadingIndicator1.Close
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

'	If pnlJamTableViewListaCostesArticulosUsuario.IsInitialized Then
'		If jamTableViewListaCostesArticulosUsuario.IndiceUltimaFilaVisible>-1 Then
'			'Dim mData0 As Map=jamTableViewListaCostesArticulosUsuario.DatosPKRegistroIndiceFila(jamTableViewListaCostesArticulosUsuario.IndiceUltimaFilaVisible)
'			Dim mPK As Map= CreateMap("IDAnalisisTarifas": mIDAnalisisTarifasVenta, "Articulo": Articulo)
'			Dim LineaArticulo As Int=jamTableViewListaCostesArticulosUsuario.GetIDxFilaTVRegistroPK(mPK)
'			If LineaArticulo>-1 Then
'				'jamTableViewListaCostesArticulosUsuario.
'			End If
'			
'		End If
'		
'	End If
	Dim sMsg As String
	If ExisteCosteArticuloUsuario=False Then
		sMsg=$"Se ha grabado el nuevo coste artículo usuario.
Para ver el efecto del cambio, actualiza la tabla."$
		Dim msa As Object=xui.MsgboxAsync(sMsg ,"Aviso")
		Wait For (msa) Msgbox_Result
	Else
		sMsg=$"Se ha actualizado el valor del coste artículo usuario.
Para ver el efecto del cambio, actualiza la tabla."$
		Dim msa As Object=xui.MsgboxAsync(sMsg,"Aviso")
		Wait For (msa) Msgbox_Result
	End If
	
End Sub

Sub AddEditarCosteArticuloUsuarioValor(Articulo As String, Valor As Double)
	jamLoadingIndicator1.MensajeLoading="Cargando datos coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Wait For (CosteArticuloUsuario(Articulo)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	'Dim mData As Map
	'mData.Initialize
	'mData.put("IDAnalisisTarifas",mIDAnalisisTarifasVenta)
	'mData.put("Proveedor",Proveedor)
	'mData.put("Articulo",Articulo)
	Dim ExisteCosteArticuloUsuario As Boolean
	If Accion="SinCosteArticuloUsuario" Then
		Dim sMsg As String=$"No existe coste artículo usuario para el artículo seleccionado.
¿Grabar uno nuevo=$1.2{Valor}?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",sMsg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
'		Dim msa As Object = xui.Msgbox2Async($"No existe coste artículo usuario para el artículo seleccionado.
		'¿Grabar uno nuevo?"$,"Confirma", "Sí","Cancelar", "", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
		'fRCosteArticuloUsuario.Initialize(Me,"fRCosteArticuloUsuario",frm,"Nuevo Coste Artículo Usuario","Nuevo","AnalisisTarifasCosteArticuloUsuarioFormRegistro.json",mData)
		ExisteCosteArticuloUsuario=False
		
	Else
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mP As Map=lstReg.Get(0)
		Dim CosteArticuloUsu As Double=mP.Get("CosteUnitarioUsuario")
		ExisteCosteArticuloUsuario=True
		Dim sMsg As String=$"Ya existe coste artículo usuario para el artículo seleccionado ( $1.2{CosteArticuloUsu} ).
¿Cambiarlo por el valor $1.2{Valor}?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",sMsg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		'Dim DivisaUsu As String=mP.Get("Divisa")
		'mData.put("CosteArticuloUsuario",CosteArticuloUsu)
		'mData.put("Divisa",DivisaUsu)
		'fRCosteArticuloUsuario.Initialize(Me,"fRCosteArticuloUsuario",frm,"Editar Coste Artículo Usuario","Editar","AnalisisTarifasCosteArticuloUsuarioFormRegistro.json",mData)
	End If
	
	
	jamLoadingIndicator1.MensajeLoading="Actualizando coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarCosteArticuloUsuario", _
		Array(mIDAnalisisTarifasVenta,Articulo,Valor, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			Valor,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	jamLoadingIndicator1.Close
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

'	If pnlJamTableViewListaCostesArticulosUsuario.IsInitialized Then
'		If jamTableViewListaCostesArticulosUsuario.IndiceUltimaFilaVisible>-1 Then
'			'Dim mData0 As Map=jamTableViewListaCostesArticulosUsuario.DatosPKRegistroIndiceFila(jamTableViewListaCostesArticulosUsuario.IndiceUltimaFilaVisible)
'			Dim mPK As Map= CreateMap("IDAnalisisTarifas": mIDAnalisisTarifasVenta, "Articulo": Articulo)
'			Dim LineaArticulo As Int=jamTableViewListaCostesArticulosUsuario.GetIDxFilaTVRegistroPK(mPK)
'			If LineaArticulo>-1 Then
'				'jamTableViewListaCostesArticulosUsuario.
'			End If
'			
'		End If
'		
'	End If
	Dim sMsg As String
	If ExisteCosteArticuloUsuario=False Then
		sMsg=$"Se ha grabado el nuevo coste artículo usuario.
Para ver el efecto del cambio, actualiza la tabla."$
		Dim msa As Object=xui.MsgboxAsync(sMsg ,"Aviso")
		Wait For (msa) Msgbox_Result
	Else
		sMsg=$"Se ha actualizado el valor del coste artículo usuario.
Para ver el efecto del cambio, actualiza la tabla."$
		Dim msa As Object=xui.MsgboxAsync(sMsg,"Aviso")
		Wait For (msa) Msgbox_Result
	End If
	
End Sub

Sub CosteArticuloUsuario(Articulo As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim lstReg As List
	lstReg.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Dim Comando As String="AnalisisTarifasCosteArticuloUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, Articulo), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay Coste Artículo Usuario para el Articulo seleccionado.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinCosteArticuloUsuario"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub


#End Region

'Private Sub lblBackScreenInfo_MouseClicked (EventData As MouseEvent)
'	
'End Sub

Sub lblBackScreenInfo_MousePressed (EventData As MouseEvent)
	lblBackScreenInfo.TextColor=fx.Colors.From32Bit(0xFF00FFFF)
End Sub

Sub lblBackScreenInfo_MouseReleased (EventData As MouseEvent)
	lblBackScreenInfo.TextColor=fx.Colors.From32Bit(0xFF7FFF00)
	BackToScreen
End Sub

Sub BackToScreen
	If lstHistorial.Size<2 Then Return
	IndexActualHistorial=Max(IndexActualHistorial-1,0)
	Dim PreviousScreen As String=lstHistorial.Get(IndexActualHistorial)
'	Select Case PreviousScreen
'		
'		Case ""
'			Return
'		Case "TarifasIncluidas"
'			TarifasIncluidas
'	End Select
	Navegando=True
	CallSub(Me,PreviousScreen)
End Sub

'
'Private Sub btnEditarEstado_Click
'	EditarEstadoAnalisisTarifas
'End Sub

Sub CargaEstadoActualAnalisisTarifas As ResumableSub

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasEstado"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & ".","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
		End If
	End If
	Return mRes
End Sub

Sub EditarEstadoAnalisisTarifas
	wait for(CargaEstadoActualAnalisisTarifas) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim mData As Map=mRes.Get("mData")
	Dim EstadoActual As String=mData.Get("Estado")
	
	
	Dim msa As Object = xui.Msgbox2Async("¿Cambiar el estado del Analisis de Tarifas?" & CRLF & CRLF & "Un cambio en el estado tiene consecuencias importantes sobre la actualización de los datos (consultar la ayuda)" & CRLF & CRLF & "(El estado actual es "& EstadoActual & ")" , "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoEstado As String
	If EstadoActual="Abierto" Then
		NuevoEstado="Cerrado"
	Else
		NuevoEstado="Abierto"
	End If
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasEditarEstado",Array(NuevoEstado, mIDAnalisisTarifasVenta))

	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible cambiar el estado del análisis de tarifas actual.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	txtEstadoAnalisisTarifas.Text=NuevoEstado
	If NuevoEstado="Abierto" Then
		txtEstadoAnalisisTarifas.Color=0xFF7FFF00
		txtEstadoAnalisisTarifas.TextColor=xui.Color_Black
	Else
		txtEstadoAnalisisTarifas.Color=0xFFFF4500
		txtEstadoAnalisisTarifas.TextColor=xui.Color_White
	End If
	Dim msa As Object=xui.MsgboxAsync($"Se ha cambiado el estado del análisis de tarifas actual a ${NuevoEstado}."$,"Aviso")
	Wait For (msa) Msgbox_Result
End Sub

#Region EvaluacionFinalAnalisisTarifas
'Sub EvaluacionFinalAnalisisTarifas As ResumableSub
'	If Navegando=False Then
'		lstHistorial.Add("EvaluacionFinal")
'	End If
'	If pnljamTableViewAnalisisTarifasEvaluacionFinal.IsInitialized=False Then
'		pnlFondoInfo.LoadLayout("scrAnalisisTarifasEvaluacionFinal")
'		Sleep(0)
''		
''		jamTableViewAnalisisTarifasEvaluacionFinal.AbrirCamposBuilder
''		Return
'
'		Dim rSub As ResumableSub=jamTableViewAnalisisTarifasEvaluacionFinal.ConfigurarTableView("ListaAnalisisTarifasEvaluacionFinal.json",Null)
'		wait for (rSub) complete (mRes As Map)
'		Log(mRes)
'		If Not(mRes.Get("FlagOK")) Then
'			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			frm.Close
'			Return False
'		End If
'		
'		jamTableViewAnalisisTarifasEvaluacionFinal.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'		''
''		Dim CF As DatosCellFactoryJamTableView
''		CF.Initialize
''		CF.NombreFuncionCellFactory=jamTableViewAnalisisTarifasEvaluacionFinal.CellFactory_ColumnaFecha
''		jamTableViewAnalisisTarifasEvaluacionFinal.SetCellFactoryListaCampos(CF, Array As String("MaxFechaVentas"))
''		
''		
''		jamTableViewAnalisisTarifasEvaluacionFinal.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array As String("NumTAvisos"),0,0x00FFFFFF,0xFF000000, 0x00FFFFFF,0xFF008000,0xFFFFB6C1,0xFFFF0000)
''		jamTableViewAnalisisTarifasEvaluacionFinal.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array As String("TipoPrecioVentaUsuarioNAV"),"SinPrecio",0x00FFFFFF,0xFF000000, 0xFFFFA500,0xFF000000)
''		jamTableViewAnalisisTarifasEvaluacionFinal.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array As String("QtyVenta"),0, 0xFFFFA500,0xFF000000, 0xFFFFA500,0xFF000000,0x00FFFFFF,0xFF000000)
''		
''		Dim dCF As DatosCellFactoryJamTableView
''		dCF.Initialize
''		dCF.AliasCampoColumna="Seleccionado"
''		dCF.CellFactoryEnCallBack=False
''		dCF.NombreFuncionCellFactory=jamTableViewListaGRPSAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''		jamTableViewListaGRPSAnalisis.SetCellFactory(dCF)
'		
'		''		Dim dCF As DatosCellFactoryJamTableView
'		''		dCF.Initialize
'		''		dCF.AliasCampoColumna="RutaAnalisis"
'		''		dCF.CellFactoryEnCallBack=False
'		''		dCF.NombreFuncionCellFactory=jamTableViewListaRutasAnalisis.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'		''		jamTableViewListaRutasAnalisis.SetCellFactory(dCF)
'		
'		jamTableViewAnalisisTarifasEvaluacionFinal.EstadoMenuItem(jamTableViewAnalisisTarifasEvaluacionFinal.MenuBarLinea,False)
'		
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddMenuItemFontMaterialIconsToMenuInMenuBar("Mostrar/Ocultar Datos Totales","MostrarOcultarDatosTotales",Chr(0xE24A),jamTableViewAnalisisTarifasEvaluacionFinal.MenuBarAcciones)
'		'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
'		'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
''		jamTableViewAnalisisTarifasEvaluacionFinal.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas las líneas filtradas","ExcluirTodasLineasFiltradas",Chr(0xF2D4),jamTableViewListaDatosRevisionVentas.MenuBarAcciones)
''		'''
''		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemSeparator
''		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontAwesomeText("Ver Avisos/Línea Tarifa","VerAvisosLineaTarifa",Chr(0xF071))
''		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontAwesomeText("Excluir TipoTarifa-CodigoTarifa-Artículo del Análisis de Ventas","AddArticuloAArticulosExcluidosDatosRevisionVentas",Chr(0xF2D4))
''		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontMaterialIconsText("Añadir Precio Venta Usuario","AddPrecioVentaUsuario",Chr(0xE851))
''		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontAwesomeText("Editar Cifra Ventas Anual Estimada","EditarCifraVentasAnualEstimada",Chr(0xF1FE))
'	End If
'	pnljamTableViewAnalisisTarifasEvaluacionFinal.BringToFront
'	lblInfoMostrada.Text="Evaluación Final"
'	jamLoadingIndicator1.MensajeLoading="Cargando datos para Evaluación Final..."
'	jamLoadingIndicator1.Show
'	
'	Wait For(ActualizarDatosEvaluacionFinal) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion<>"OK" Then
'		SalirModulo
'		Return False
'	End If
'
'	'Dim lstReg As List=mRes.get("lstReg")
'	
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PrecioEUR=PrecioVenta*TipoCambioVenta")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set CosteEUR=CosteArticulo*TipoCambioCoste")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set ImporteMargenSVtaInd=(PrecioEUR-CosteEUR)")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PorMargensVta=ROUND((PrecioEUR-CosteEUR)/PrecioEUR,2)")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set ImporteMargenSVtaLinea=ImporteMargenSVtaInd*QtyVentasAnual")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set TipoVariacion='Precio'")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set DatoVariacion=PrecioVenta")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoPrecio=PrecioVenta")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoPorMargenSVta=ROUND(((NuevoPrecio*TipoCambioVenta)-CosteEUR)/(NuevoPrecio*TipoCambioVenta),2)")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoImporteMargenSVtaInd=((NuevoPrecio*TipoCambioVenta)-CosteEUR)")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoImporteMargenSVtaLinea=(NuevoImporteMargenSVtaInd*QtyVentasAnual)")
'	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PorVariacionMargenSVta=ROUND((NuevoPorMargenSVta-PorMargensVta)/PorMargensVta,2)")
'
'	
'	
'	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasEvaluacionFinal order by TipoTarifa, CodigoTarifa, Articulo")
'	
'	Dim rSub As ResumableSub=jamTableViewAnalisisTarifasEvaluacionFinal.setdata(rsData)
'	Wait For (rSub) complete (mResultSetData As Map)
'	rsData.Close
'	jamLoadingIndicator1.Close
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			#if debug
'			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt=xui.DialogResponse_Positive Then
'				jamTableViewAnalisisTarifasEvaluacionFinal.AbrirCamposBuilder
'				Return False
'			End If
'			#End If
'			ExitApplication
'		End If
'		If ""<>mResultSetData.Get("msgAviso") Then
'			If True=mResultSetData.Get("ListaVacia") Then Return True
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'	
'	End If
'	
'	Return True
''	
''	fx.Msgbox(frm,"Datos actualizados.","Aviso")
'	
'	
'End Sub

Sub EvaluacionFinalAnalisisTarifasCLV
	

	
	DatosTotalesEvaluacionVisibles=False
	If Navegando=False Then
		lstHistorial.Add("EvaluacionFinal")
	End If
	If pnljamTableCLVAnalisisTarifasEvaluacionFinal.IsInitialized=False Then
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasFondoVacio")
		
		pnlFondoInfo.LoadLayout("scrAnalisisTarifasEvaluacionFinal2")
		Sleep(0)
		
		jamTableCLVAnalisisTarifasEvaluacionFinal.ColorPanelSeleccionado=0xFF87CEFA
		
'		JamTableCLVAnalisisTarifasEvaluacionFinal.AbrirCamposBuilder
'		Return
	
		Dim rSub As ResumableSub=jamTableCLVAnalisisTarifasEvaluacionFinal.ConfigurarTableCLV("ListaAnalisisTarifasEvaluacionFinalCLV.json")
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
	
		'(*) Opcional
		jamTableCLVAnalisisTarifasEvaluacionFinal.AddMenuItemToMenuInMenuBar("Actualizar","Actualizar",jamTableCLVAnalisisTarifasEvaluacionFinal.MenuBarAcciones)
	
		'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
		jamTableCLVAnalisisTarifasEvaluacionFinal.AlturaItems=170dip
		'(*) opcional
		jamTableCLVAnalisisTarifasEvaluacionFinal.ModoSeleccionItems=jamTableCLVAnalisisTarifasEvaluacionFinal.ModoSeleccionIndividualTemp  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple
		
		jamTableCLVAnalisisTarifasEvaluacionFinal.EstadoMenuItem(jamTableCLVAnalisisTarifasEvaluacionFinal.MenuBarLinea,False)
		
		jamTableCLVAnalisisTarifasEvaluacionFinal.AddMenuItemFontMaterialIconsToMenuInMenuBar("Mostrar/Ocultar Datos Totales","MostrarOcultarDatosTotales",Chr(0xE24A),jamTableCLVAnalisisTarifasEvaluacionFinal.MenuBarAcciones)
		'''		jamTableViewListaRutasAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Incluir Todas Rutas","IncluirTodasRutas",Chr(0xF046),jamTableViewListaRutasAnalisis.MenuBarAcciones)
		'''		'jamTableViewListaGRPSAnalisis.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todos","ExcluirTodos",Chr(0xF096),jamTableViewListaGRPSAnalisis.MenuBarAcciones)
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddMenuItemFontAwesomeToMenuInMenuBar("Excluir Todas las líneas filtradas","ExcluirTodasLineasFiltradas",Chr(0xF2D4),jamTableViewListaDatosRevisionVentas.MenuBarAcciones)
'		'''
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemSeparator
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontAwesomeText("Ver Avisos/Línea Tarifa","VerAvisosLineaTarifa",Chr(0xF071))
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontAwesomeText("Excluir TipoTarifa-CodigoTarifa-Artículo del Análisis de Ventas","AddArticuloAArticulosExcluidosDatosRevisionVentas",Chr(0xF2D4))
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontMaterialIconsText("Añadir Precio Venta Usuario","AddPrecioVentaUsuario",Chr(0xE851))
'		jamTableViewAnalisisTarifasEvaluacionFinal.AddContextMenuItemFontAwesomeText("Editar Cifra Ventas Anual Estimada","EditarCifraVentasAnualEstimada",Chr(0xF1FE))
	End If
	pnlFondoVacio.BringToFront
	pnljamTableCLVAnalisisTarifasEvaluacionFinal.BringToFront
	lblInfoMostrada.Text="Evaluación Final"
	jamLoadingIndicator1.MensajeLoading="Cargando datos para Evaluación Final..."
	jamLoadingIndicator1.Show
	
	Wait For(ActualizarDatosEvaluacionFinal) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If

	'Dim lstReg As List=mRes.get("lstReg")
	
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PrecioEUR=PrecioVenta*TipoCambioVenta")
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set CosteEUR=CosteArticulo*TipoCambioCoste")
	
	Dim sbStatus As StringBuilder
	sbStatus.Initialize
	sbStatus.Append("Update tblAnalisisTarifasEvaluacionFinal set DescripcionStatus=Case WHEN QtyVentasAnual<=0 then 'ERROR QTY VENTA'")
	sbStatus.Append(" WHEN PrecioVenta<=0 then 'ERROR PRECIO VENTA'")
	sbStatus.Append(" WHEN TipoCambioVenta<=0 then 'ERROR TIPO CAMBIO VENTA'")
	sbStatus.Append(" WHEN PrecioEUR<=0 then 'ERROR PRECIO VENTA EUR'")
	sbStatus.Append(" WHEN TipoCosteArticulo='ERROR' then 'ERROR TIPO COSTE ARTICULO'")
	sbStatus.Append(" WHEN CosteArticulo<=0 then 'ERROR COSTE ARTICULO'")
	sbStatus.Append(" WHEN TipoCambioCoste<=0 then 'ERROR TIPO CAMBIO COSTE'")
	sbStatus.Append(" else 'OK' end")
	mSQL.ExecNonQuery(sbStatus.ToString)
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set Status=Case when DescripcionStatus='OK' then 'OK' else 'NOK' end")
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set ImporteMargenSVtaInd=(PrecioEUR-CosteEUR) where Status='OK'")
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PorMargensVta=(ImporteMargenSVtaInd/PrecioEUR) where Status='OK'")
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set ImporteMargenSVtaLinea=(ImporteMargenSVtaInd*QtyVentasAnual) where Status='OK'")
	
	Dim sbUpdNuevoPrecio As StringBuilder
	sbUpdNuevoPrecio.Initialize
	sbUpdNuevoPrecio.Append("Update tblAnalisisTarifasEvaluacionFinal set NuevoPrecioEUR=")
	sbUpdNuevoPrecio.Append(" Case when TipoVariacion='Precio' then DatoVariacion")
	sbUpdNuevoPrecio.Append(" when TipoVariacion='Margen' then (CosteEUR/(1-(DatoVariacion/100)))")
	sbUpdNuevoPrecio.Append(" when TipoVariacion='Var.Margen' then (PrecioEUR*(1+DatoVariacion)/100)")
	sbUpdNuevoPrecio.Append(" Else -999999 End")
	sbUpdNuevoPrecio.Append("  where Status='OK'")
	mSQL.ExecNonQuery(sbUpdNuevoPrecio.ToString)
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoPrecio=(NuevoPrecioEUR/TipoCambioVenta) where Status='OK'")
	
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoPorMargenSVta=((NuevoPrecioEUR-CosteEUR)/NuevoPrecioEUR) where Status='OK'")
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoImporteMargenSVtaInd=(NuevoPrecioEUR-CosteEUR) where Status='OK'")
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set NuevoImporteMargenSVtaLinea=(NuevoImporteMargenSVtaInd*QtyVentasAnual) where Status='OK'")
	'mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PorVariacionMargenSVta=ROUND((NuevoPorMargenSVta-PorMargensVta)/PorMargensVta,2) where Status='OK'")
	mSQL.ExecNonQuery("Update tblAnalisisTarifasEvaluacionFinal set PorVariacionMargenSVta=(NuevoPorMargenSVta-PorMargensVta) where Status='OK'")



	jamLoadingIndicator1.close
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasEvaluacionFinal order by TipoTarifa, CodigoTarifa, Articulo")
	Dim rSub As ResumableSub=jamTableCLVAnalisisTarifasEvaluacionFinal.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
	
	jamTableCLVAnalisisTarifasEvaluacionFinal.SetMouseCursorDefaultHabilitarTableCLV
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableCLVAnalisisTarifasEvaluacionFinal.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				Dim msa As Object=xui.MsgboxAsync("No hay datos para la Evaluación.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
End Sub

Sub ActualizarCalculosEvaluacion(iDXPanel As Int, TipoTarifa As Int, CodigoTarifa As String, Articulo As String, TipoVariacion As String, DatoVariacion As Double)
	Dim CosteEUR As Double=mSQL.ExecQuerySingleResult2("select CosteEUR from " & tblAnalisisTarifasEvaluacionFinal & " where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifa, CodigoTarifa, Articulo))
	Dim TipoCambioVenta As Double=mSQL.ExecQuerySingleResult2("select TipoCambioVenta from " & tblAnalisisTarifasEvaluacionFinal & " where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifa, CodigoTarifa, Articulo))
	Dim PrecioEUR As Double=mSQL.ExecQuerySingleResult2("select PrecioEUR from " & tblAnalisisTarifasEvaluacionFinal & " where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifa, CodigoTarifa, Articulo))
	Dim QtyVentasAnual As Double=mSQL.ExecQuerySingleResult2("select QtyVentasAnual from " & tblAnalisisTarifasEvaluacionFinal & " where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifa, CodigoTarifa, Articulo))
	Dim PorMargenVenta As Double=((PrecioEUR-CosteEUR)/PrecioEUR)
	
	
	Dim NuevoPrecio As Double
	Dim NuevoPrecioEUR As Double
	Select Case TipoVariacion
		Case "Precio"
			NuevoPrecioEUR=DatoVariacion
		Case "Margen"
			NuevoPrecioEUR=CosteEUR/(1-DatoVariacion)
		Case "Var.Margen"
			Dim NuevoMargenEUR As Double=((PrecioEUR-CosteEUR)/PrecioEUR)*(1+DatoVariacion/100)
			NuevoPrecioEUR=CosteEUR/(1-NuevoMargenEUR)
	End Select
	NuevoPrecio=NuevoPrecioEUR/TipoCambioVenta
	
	Dim NuevoPorMargenSVta As Double=((NuevoPrecioEUR-CosteEUR)/NuevoPrecioEUR)
	Dim NuevoImporteMargenSVtaInd As Double=NuevoPrecioEUR-CosteEUR
	Dim NuevoImporteMargenSVtaLinea As Double=NuevoImporteMargenSVtaInd*QtyVentasAnual
	Dim PorVariacionMargenSVta As Double=NuevoPorMargenSVta-PorMargenVenta
	
	mSQL.ExecNonQuery2("UPDATE " & tblAnalisisTarifasEvaluacionFinal & " set TipoVariacion=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
				Array(TipoVariacion,TipoTarifa,CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set TipoVariacion=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
				Array(TipoVariacion,TipoTarifa,CodigoTarifa, Articulo))
				
	mSQL.ExecNonQuery2("UPDATE " & tblAnalisisTarifasEvaluacionFinal & " set DatoVariacion=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
				Array(DatoVariacion,TipoTarifa,CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set DatoVariacion=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
				Array(DatoVariacion,TipoTarifa,CodigoTarifa, Articulo))
	
	mSQL.ExecNonQuery2("Update " & tblAnalisisTarifasEvaluacionFinal & " set NuevoPrecio=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoPrecio,TipoTarifa, CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("Update tblOrigenDatos set NuevoPrecio=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoPrecio,TipoTarifa, CodigoTarifa, Articulo))
		
	mSQL.ExecNonQuery2("Update " & tblAnalisisTarifasEvaluacionFinal & " set NuevoPrecioEUR=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoPrecioEUR,TipoTarifa, CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("Update tblOrigenDatos set NuevoPrecioEUR=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoPrecioEUR,TipoTarifa, CodigoTarifa, Articulo))
	
	mSQL.ExecNonQuery2("Update " & tblAnalisisTarifasEvaluacionFinal & " set NuevoPorMargenSVta=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoPorMargenSVta,TipoTarifa, CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("Update tblOrigenDatos set NuevoPorMargenSVta=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoPorMargenSVta,TipoTarifa, CodigoTarifa, Articulo))
		
	mSQL.ExecNonQuery2("Update " & tblAnalisisTarifasEvaluacionFinal & " set NuevoImporteMargenSVtaInd=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoImporteMargenSVtaInd,TipoTarifa, CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("Update tblOrigenDatos set NuevoImporteMargenSVtaInd=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoImporteMargenSVtaInd,TipoTarifa, CodigoTarifa, Articulo))
				
	mSQL.ExecNonQuery2("Update " & tblAnalisisTarifasEvaluacionFinal & " set NuevoImporteMargenSVtaLinea=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoImporteMargenSVtaLinea,TipoTarifa, CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("Update tblOrigenDatos set NuevoImporteMargenSVtaLinea=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevoImporteMargenSVtaLinea,TipoTarifa, CodigoTarifa, Articulo))
		
	mSQL.ExecNonQuery2("Update " & tblAnalisisTarifasEvaluacionFinal & " set PorVariacionMargenSVta=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(PorVariacionMargenSVta,TipoTarifa, CodigoTarifa, Articulo))
	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("Update tblOrigenDatos set PorVariacionMargenSVta=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(PorVariacionMargenSVta,TipoTarifa, CodigoTarifa, Articulo))

	Dim mDataCamposModificados As Map
	mDataCamposModificados.Initialize
	mDataCamposModificados.Put("TipoVariacion",TipoVariacion)
	mDataCamposModificados.Put("DatoVariacion",DatoVariacion)
	mDataCamposModificados.Put("NuevoPrecioEUR",NuevoPrecioEUR)
	mDataCamposModificados.Put("NuevoPrecio",NuevoPrecio)
	mDataCamposModificados.Put("NuevoPorMargenSVta",NuevoPorMargenSVta)
	mDataCamposModificados.Put("NuevoImporteMargenSVtaInd",NuevoImporteMargenSVtaInd)
	mDataCamposModificados.Put("NuevoImporteMargenSVtaLinea",NuevoImporteMargenSVtaLinea)
	mDataCamposModificados.Put("PorVariacionMargenSVta",PorVariacionMargenSVta)
	wait for(jamTableCLVAnalisisTarifasEvaluacionFinal.ActualizarValueItemCLV(iDXPanel, mDataCamposModificados)) complete (rBool As Boolean)
	If rBool=False Then
		ExitApplication
	End If
End Sub


Sub JamTableCLVAnalisisTarifasEvaluacionFinal_LoadLayoutPanelItem(DatosItemIndexCLV As DatosItemIndexCLVJamTableCLV)
	Dim mData As Map=DatosItemIndexCLV.Value
	Dim Pnl As B4XView=DatosItemIndexCLV.Panel
	Pnl.LoadLayout("scrItemAnalisisTarifasCLVEvaluacionFinal")
	
	'btnStatus.visible="NOK"=mData.Get("Status")
	btnStatus.Text=mData.Get("Status")
	Dim B4xBtn As B4XView=btnStatus
	If "OK"=mData.Get("Status") Then
		B4xBtn.TextColor=xui.Color_Black
		B4xBtn.Color=xui.Color_Green
	Else
		B4xBtn.TextColor=xui.Color_White
		B4xBtn.Color=xui.Color_Red
	End If
				
	If 0=mData.Get("TipoTarifa") Then 
		txtTipoTarifa.Text="Cliente"
	Else
		txtTipoTarifa.Text="GRP"
	End If
	Dim xtF As B4XView=txtTipoTarifa
	xtF.Color=0x7F95AAC0
	txtCodigoTarifa.Text=mData.Get("CodigoTarifa")
	Dim xtF As B4XView=txtCodigoTarifa
	xtF.Color=0x7F95AAC0
	txtArticulo.Text=mData.Get("Articulo")
	Dim xtF As B4XView=txtArticulo
	xtF.Color=0x7F95AAC0
	txtDescripcionArticulo.Text=mData.Get("DescripcionArticulo")
	Dim xtF As B4XView=txtDescripcionArticulo
	xtF.Color=0x7F95AAC0
	
	txtQtyVentasAnual.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("QtyVentasAnual"),1,0,0,True)
	txtPrecioVenta.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("PrecioVenta"),1,5,2,True)
	txtDivisa.Text=IIf(mData.Get("DivisaVenta")="","EUR",mData.Get("DivisaVenta"))
	txtTipoCambio.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("TipoCambioVenta"),1,2,0,False)
	txtPrecioEUR.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("PrecioEUR"),1,5,2,True)

	
	txtTipoCosteArticulo.Text=mData.Get("TipoCosteArticulo")
	txtCosteArticulo.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("CosteArticulo"),1,5,2,True)
	txtDivisaCoste.Text=IIf(mData.Get("DivisaCoste")="","EUR",mData.Get("DivisaCoste"))
	txtTipoCambioCoste.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("TipoCambioCoste"),1,2,0,False)
	txtCosteEUR.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("CosteEUR"),1,5,2,True)
	
	Dim TipoVariacion As String=mData.Get("TipoVariacion")
	txtTipoVariacion.Text=(TipoVariacion)
	Dim DatoVariacion As Double=mData.Get("DatoVariacion")
	Select Case TipoVariacion
		Case "Precio"
			txtDatoVariacion.Text=DatoVariacion
		Case "Margen"
			txtDatoVariacion.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2((DatoVariacion* 100),1,2,2,True) & " %"
		Case "Var.Margen"
			txtDatoVariacion.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2((DatoVariacion),1,2,2,True) & " %"
		Case Else
			txtDatoVariacion.Text=mData.Get("DatoVariacion")
	End Select
	
	
	
	If "NOK"=mData.Get("Status") Then Return
		
	txtNuevoPrecio.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("NuevoPrecio"),1,5,2,True)
	txtNuevoPrecioEUR.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("NuevoPrecioEUR"),1,5,2,True)
		
	Dim PorMargenSVta As Double=mData.Get("PorMargensVta")
	txtPorMargenSVta.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2((PorMargenSVta* 100),1,2,2,True) & " %"
	txtImporteMargenSVtaInd.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("ImporteMargenSVtaInd"),1,2,0,True)
	txtImporteMargenSVtaLinea.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("ImporteMargenSVtaLinea"),1,0,0,True)

	
	Dim NuevoPorMargenSVta As Double=mData.Get("NuevoPorMargenSVta")
	txtNuevoPorMargenSVta.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2((NuevoPorMargenSVta* 100),1,2,2,True) & " %"
	txtNuevoImporteMargenSVtaInd.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("NuevoImporteMargenSVtaInd"),1,2,0,True)
	txtNuevoImporteMargenSVtaLinea.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(mData.Get("NuevoImporteMargenSVtaLinea"),1,0,0,True)
	Dim PorVariacionMargenSVta As Double=mData.Get("PorVariacionMargenSVta")
	txtPorVariacionMargenSVta.Text=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2((PorVariacionMargenSVta* 100),1,2,2,True) & " %"
	
End Sub

Sub JamTableCLVAnalisisTarifasEvaluacionFinal_AfterUpdateJamTableCLV
	RefrescarDatosGlobalesCLV
	
End Sub

Sub JamTableCLVAnalisisTarifasEvaluacionFinal_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "MostrarOcultarDatosTotales"
			MostrarOcultarDatosTotalesCLV
	End Select
End Sub

'Private Sub chcboxTipoVariacion_MousePressed (EventData As MouseEvent)
'	Dim chcbox As ChoiceBox=Sender
'	Dim JO As JavaObject = chcbox
'	If JO.RunMethod("isShowing",Null) = False Then                'Only populate new data if the Choicebox is opening
'		chcbox.Items.Clear                                'Clear existing entries
'		chcbox.Items.Add("Precio")
'		chcbox.Items.Add("Margen")
'		chcbox.Items.Add("Var.Margen")
'	End If
'End Sub

Sub ActualizarDatosEvaluacionFinal As ResumableSub
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(FechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(FechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasEvaluacionFinal")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasEvaluacionFinalActualizacion"
	'Dim Comando As String="AnalisisTarifasEvaluacionFinal"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta,sFechaInicialVentas,sFechaFinalVentas), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("El análisis de tarifas actual no tiene datos para la Evaluación Final.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Dim sResp As String=mData.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error de SP " & sResp & ".","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("mData", mData)
				Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasEvaluacionFinal",lstReg)
				''' ya lo hace el sp en este caso   mSQL.ExecNonQuery2("update tblAnalisisTarifasEvaluacionFinal set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
			End If
		End If
	End If
	Return mRes
End Sub

Sub RefrescarDatosGlobales
	' Actuales
	If jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalVentaActual As Int=mSQL.ExecQuerySingleResult2("select sum(PrecioEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableViewAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalVentaActual As Int=mSQL.ExecQuerySingleResult("select sum(PrecioEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalVentaActual As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalVentaActual,1,0,0,True) & " "
	lblImporteVentaActual.Text=sImporteTotalVentaActual
	
	If jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalCosteActual As Int=mSQL.ExecQuerySingleResult2("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableViewAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalCosteActual As Int=mSQL.ExecQuerySingleResult("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalCosteActual As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalCosteActual,1,0,0,True) & " "
	lblImporteCosteActual.Text=sImporteTotalCosteActual
	
	If jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalMargenActual As Int=mSQL.ExecQuerySingleResult2("select sum(ImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal where " & jamTableViewAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalMargenActual As Int=mSQL.ExecQuerySingleResult("select sum(ImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalMargenActual As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalMargenActual,1,0,0,True) & " "
	lblImporteMargenSVtaActual.Text=sImporteTotalMargenActual
	
	Dim PorTotalMargenActual As Double=((ImporteTotalVentaActual-ImporteTotalCosteActual)/ImporteTotalVentaActual)*100
	Dim sPorTotalMargenActual As String=PorTotalMargenActual & " % "
	lblMargenSVentaPromedioActual.Text=sPorTotalMargenActual
	
	'Nuevos
	If jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalVentaNuevo As Int=mSQL.ExecQuerySingleResult2("select sum(NuevoPrecio*TipoCambioVenta*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableViewAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalVentaNuevo As Int=mSQL.ExecQuerySingleResult("select sum(NuevoPrecio*TipoCambioVenta*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalVentaNuevo As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalVentaNuevo,1,0,0,True) & " "
	lblImporteVentaNuevo.Text=sImporteTotalVentaNuevo
	
	If jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalCosteNuevo As Int=mSQL.ExecQuerySingleResult2("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableViewAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalCosteNuevo As Int=mSQL.ExecQuerySingleResult("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalCosteNuevo As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalCosteNuevo,1,0,0,True) & " "
	lblImporteCosteNuevo.Text=sImporteTotalCosteNuevo
	
	If jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalMargenNuevo As Int=mSQL.ExecQuerySingleResult2("select sum(NuevoImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal where " & jamTableViewAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableViewAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalMargenNuevo As Int=mSQL.ExecQuerySingleResult("select sum(NuevoImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalMargenNuevo As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalMargenNuevo,1,0,0,True) & " "
	lblImporteMargenSVtaNuevo.Text=sImporteTotalMargenNuevo
	
	Dim PorTotalMargenNuevo As Double=((ImporteTotalVentaNuevo-ImporteTotalCosteNuevo)/ImporteTotalVentaNuevo)*100
	Dim sPorTotalMargenNuevo As String=PorTotalMargenNuevo & " % "
	lblMargenSVentaPromedioNuevo.Text=sPorTotalMargenNuevo
	
	'Diferencias
	Dim DiferenciaImporteTotalVentaNuevo As Int=ImporteTotalVentaNuevo-ImporteTotalVentaActual
	Dim sDiferenciaImporteTotalVentaNuevo As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaImporteTotalVentaNuevo,1,0,0,True) & " "
	lblDiferenciaImporteVentaNuevoActual.Text=sDiferenciaImporteTotalVentaNuevo
	
	Dim DiferenciaImporteTotalCoste As Int=ImporteTotalCosteNuevo-ImporteTotalCosteActual
	Dim sDiferenciaImporteTotalCoste As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaImporteTotalCoste,1,0,0,True) & " "
	lblDiferenciaImporteCosteNuevoActual.Text=sDiferenciaImporteTotalCoste
	
	Dim DiferenciaImporteTotalMargen As Int=ImporteTotalMargenNuevo-ImporteTotalMargenActual
	Dim sDiferenciaImporteTotalMargen As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaImporteTotalMargen,1,0,0,True) & " "
	lblDiferenciaImporteMargenSVtaNuevoActual.Text=sDiferenciaImporteTotalMargen
	
	Dim DiferenciaPorTotalMargen As Double=(PorTotalMargenNuevo-PorTotalMargenActual)
	Dim sDiferenciaPorTotalMargen As String=DiferenciaPorTotalMargen & " % "
	lblDiferenciaMargenSVentaPromedioNuevoActual.Text=sDiferenciaPorTotalMargen
	
	' variacion
	Dim VariacionImporteTotalVenta As Int=(ImporteTotalVentaNuevo-ImporteTotalVentaActual)/ImporteTotalVentaActual
	Dim sVariacionImporteTotalVenta As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionImporteTotalVenta,1,0,0,True) & " % "
	lblPorVariacionImporteVenta.Text=sVariacionImporteTotalVenta
	
	Dim VariacionImporteTotalCoste As Int=(ImporteTotalCosteNuevo-ImporteTotalCosteActual)/ImporteTotalCosteActual
	Dim sVariacionImporteTotalCoste As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionImporteTotalCoste,1,0,0,True) & " % "
	lblPorVariacionImporteCoste.Text=sVariacionImporteTotalCoste
	
	Dim VariacionImporteTotalMargen As Int=(ImporteTotalMargenNuevo-ImporteTotalMargenActual)/ImporteTotalMargenActual
	Dim sVariacionImporteTotalMargen As String=jamTableViewAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionImporteTotalMargen,1,0,0,True) & " % "
	lblPorVariacionImporteMargenSVta.Text=sVariacionImporteTotalMargen
	
	Dim VariacionPorTotalMargen As Double=(PorTotalMargenNuevo-PorTotalMargenActual)/PorTotalMargenActual
	Dim sVariacionPorTotalMargen As String=VariacionPorTotalMargen & " % "
	lblPorVariacionMargenSVentaPromedio.Text=sVariacionPorTotalMargen

	
End Sub

Sub RefrescarDatosGlobalesCLV
	' Actuales
	If jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalVentaActual As Int=mSQL.ExecQuerySingleResult2("select sum(PrecioEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableCLVAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalVentaActual As Int=mSQL.ExecQuerySingleResult("select sum(PrecioEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalVentaActual As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalVentaActual,1,0,0,True)  & " € "
	lblImporteVentaActual.Text=sImporteTotalVentaActual
	
	If jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalCosteActual As Int=mSQL.ExecQuerySingleResult2("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableCLVAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalCosteActual As Int=mSQL.ExecQuerySingleResult("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalCosteActual As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalCosteActual,1,0,0,True) & " € "
	lblImporteCosteActual.Text=sImporteTotalCosteActual
	
	If jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalMargenActual As Int=mSQL.ExecQuerySingleResult2("select sum(ImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal where " & jamTableCLVAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalMargenActual As Int=mSQL.ExecQuerySingleResult("select sum(ImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalMargenActual As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalMargenActual,1,0,0,True) & " € "
	lblImporteMargenSVtaActual.Text=sImporteTotalMargenActual
	
	Dim PorTotalMargenActual As Double=(ImporteTotalVentaActual-ImporteTotalCosteActual)/ImporteTotalVentaActual*100
	Dim sPorTotalMargenActual As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(PorTotalMargenActual,1,2,2,True) & " % "
	lblMargenSVentaPromedioActual.Text=sPorTotalMargenActual
	
	'Nuevos
	If jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalVentaNuevo As Int=mSQL.ExecQuerySingleResult2("select sum(NuevoPrecio*TipoCambioVenta*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableCLVAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalVentaNuevo As Int=mSQL.ExecQuerySingleResult("select sum(NuevoPrecio*TipoCambioVenta*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalVentaNuevo As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalVentaNuevo,1,0,0,True)  & " € "
	lblImporteVentaNuevo.Text=sImporteTotalVentaNuevo
	
	If jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalCosteNuevo As Int=mSQL.ExecQuerySingleResult2("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal where " & jamTableCLVAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalCosteNuevo As Int=mSQL.ExecQuerySingleResult("select sum(CosteEUR*QtyVentasAnual) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalCosteNuevo As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalCosteNuevo,1,0,0,True)  & " € "
	lblImporteCosteNuevo.Text=sImporteTotalCosteNuevo
	
	If jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros.Size>0 Then
		Dim ImporteTotalMargenNuevo As Int=mSQL.ExecQuerySingleResult2("select sum(NuevoImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal where " & jamTableCLVAnalisisTarifasEvaluacionFinal.sCamposFiltrados,jamTableCLVAnalisisTarifasEvaluacionFinal.lstValoresFiltros)
	Else
		Dim ImporteTotalMargenNuevo As Int=mSQL.ExecQuerySingleResult("select sum(NuevoImporteMargenSVtaLinea) from tblAnalisisTarifasEvaluacionFinal")
	End If
	Dim sImporteTotalMargenNuevo As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(ImporteTotalMargenNuevo,1,0,0,True)  & " € "
	lblImporteMargenSVtaNuevo.Text=sImporteTotalMargenNuevo
	
	Dim PorTotalMargenNuevo As Double=(ImporteTotalVentaNuevo-ImporteTotalCosteNuevo)/ImporteTotalVentaNuevo*100
	Dim sPorTotalMargenNuevo As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(PorTotalMargenNuevo,1,2,2,True) & " % "
	lblMargenSVentaPromedioNuevo.Text=sPorTotalMargenNuevo
	
	'Diferencias
	Dim DiferenciaImporteTotalVentaNuevo As Int=ImporteTotalVentaNuevo-ImporteTotalVentaActual
	Dim sDiferenciaImporteTotalVentaNuevo As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaImporteTotalVentaNuevo,1,0,0,True)  & " € "
	lblDiferenciaImporteVentaNuevoActual.Text=sDiferenciaImporteTotalVentaNuevo
	
	Dim DiferenciaImporteTotalCoste As Int=ImporteTotalCosteNuevo-ImporteTotalCosteActual
	Dim sDiferenciaImporteTotalCoste As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaImporteTotalCoste,1,0,0,True)  & " € "
	lblDiferenciaImporteCosteNuevoActual.Text=sDiferenciaImporteTotalCoste
	
	Dim DiferenciaImporteTotalMargen As Int=ImporteTotalMargenNuevo-ImporteTotalMargenActual
	Dim sDiferenciaImporteTotalMargen As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaImporteTotalMargen,1,0,0,True)  & " € "
	lblDiferenciaImporteMargenSVtaNuevoActual.Text=sDiferenciaImporteTotalMargen
	
	Dim DiferenciaPorTotalMargen As Double=(PorTotalMargenNuevo-PorTotalMargenActual)
	Dim sDiferenciaPorTotalMargen As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(DiferenciaPorTotalMargen,1,2,2,True) & " % "
	lblDiferenciaMargenSVentaPromedioNuevoActual.Text=sDiferenciaPorTotalMargen
	
	' variacion
	Dim VariacionImporteTotalVenta As Int=(ImporteTotalVentaNuevo-ImporteTotalVentaActual)/ImporteTotalVentaActual
	Dim sVariacionImporteTotalVenta As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionImporteTotalVenta,1,0,0,True) & " % "
	lblPorVariacionImporteVenta.Text=sVariacionImporteTotalVenta
	
	Dim VariacionImporteTotalCoste As Int=(ImporteTotalCosteNuevo-ImporteTotalCosteActual)/ImporteTotalCosteActual
	Dim sVariacionImporteTotalCoste As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionImporteTotalCoste,1,0,0,True) & " % "
	lblPorVariacionImporteCoste.Text=sVariacionImporteTotalCoste
	
	Dim VariacionImporteTotalMargen As Int=(ImporteTotalMargenNuevo-ImporteTotalMargenActual)
	Dim sVariacionImporteTotalMargen As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionImporteTotalMargen,1,0,0,True) & " € "
	lblPorVariacionImporteMargenSVta.Text=sVariacionImporteTotalMargen
	
	Dim VariacionPorTotalMargen As Double=(PorTotalMargenNuevo-PorTotalMargenActual)
	Dim sVariacionPorTotalMargen As String=jamTableCLVAnalisisTarifasEvaluacionFinal.FormatoNumerico2(VariacionPorTotalMargen,1,2,2,True) & " % "
	lblPorVariacionMargenSVentaPromedio.Text=sVariacionPorTotalMargen

	
End Sub

Sub jamTableViewAnalisisTarifasEvaluacionFinal_AfterUpdateJamTableView
	RefrescarDatosGlobales
End Sub 

'Sub jamTableViewAnalisisTarifasEvaluacionFinal_MenuBarMenuItem_Action(TagMenuItem As String)
'	Select Case TagMenuItem
'		Case "MostrarOcultarDatosTotales"
'			MostrarOcultarDatosTotales
'	End Select
'End Sub

'Sub MostrarOcultarDatosTotales
'	If DatosTotalesEvaluacionOcultos Then
'		'Mostrar
'		pnlFondoDatosGlobalesEvaluacionFinal.Height=105dip
'	Else
'		'Ocultar
'		pnlFondoDatosGlobalesEvaluacionFinal.Height=0dip
'	End If
'	pnlFondoJamTableCLVAnalisisTarifasEvaluacionFinal.Top=pnlFondoDatosGlobalesEvaluacionFinal.Height
'	pnlFondoJamTableCLVAnalisisTarifasEvaluacionFinal.Height=pnljamTableViewAnalisisTarifasEvaluacionFinal.Height-pnlFondoDatosGlobalesEvaluacionFinal.Height
'	DatosTotalesEvaluacionOcultos=Not(DatosTotalesEvaluacionOcultos)
'End Sub

Sub MostrarOcultarDatosTotalesCLV
	DatosTotalesEvaluacionVisibles=Not(DatosTotalesEvaluacionVisibles)
	pnlFondoDatosGlobalesEvaluacionFinalCLV.Visible=DatosTotalesEvaluacionVisibles
	If DatosTotalesEvaluacionVisibles Then
		'Mostrar
		jamTableCLVAnalisisTarifasEvaluacionFinal.mBase.Top=pnlFondoDatosGlobalesEvaluacionFinalCLV.Top+pnlFondoDatosGlobalesEvaluacionFinalCLV.Height
		jamTableCLVAnalisisTarifasEvaluacionFinal.mBase.Height=pnljamTableCLVAnalisisTarifasEvaluacionFinal.Height-pnlFondoDatosGlobalesEvaluacionFinalCLV.Height
	Else
		'Ocultar
		jamTableCLVAnalisisTarifasEvaluacionFinal.mBase.Top=0
		jamTableCLVAnalisisTarifasEvaluacionFinal.mBase.Height=pnljamTableCLVAnalisisTarifasEvaluacionFinal.Height
	End If
	
End Sub

Private Sub btnEditTipoVariacion_Click
	Dim btn As Button=Sender
	Dim IdXPanel As Int=jamTableCLVAnalisisTarifasEvaluacionFinal.GetItemFromView(btn)
	
	Dim mData As Map=jamTableCLVAnalisisTarifasEvaluacionFinal.GetValue(jamTableCLVAnalisisTarifasEvaluacionFinal.GetItemFromView(btn))
	
	Dim Status As String=mData.Get("Status")
	If Status="NOK" Then
		Dim msa As Object=xui.MsgboxAsync("Función deshabilitada para líneas con Status NOK.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim TipoTarifa As Int=mData.Get("TipoTarifa")
	Dim CodigoTarifa As String=mData.Get("CodigoTarifa")
	Dim Articulo As String=mData.Get("Articulo")
	Dim PrecioEUR As Double=mData.Get("PrecioEUR")
	Dim CosteEUR As Double=mData.Get("CosteEUR")

	Dialog.Title="Selecciona tipo de variación"
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
		
	Dim lstOpciones As List=Array As String("Precio","Margen","Var.Margen")
	
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
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	
'	mSQL.ExecNonQuery2("UPDATE " & tblAnalisisTarifasEvaluacionFinal & " set TipoVariacion=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'				Array(Opcion,TipoTarifa,CodigoTarifa, Articulo))
'	jamTableCLVAnalisisTarifasEvaluacionFinal.SQL.ExecNonQuery2("UPDATE tblOrigenDatos set TipoVariacion=? where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
'				Array(Opcion,TipoTarifa,CodigoTarifa, Articulo))
'	
'	Dim mDataCamposModificados As Map
'	mDataCamposModificados.Initialize
'	mDataCamposModificados.Put("TipoVariacion",Opcion)
'	wait for(jamTableCLVAnalisisTarifasEvaluacionFinal.ActualizarValueItemCLV(jamTableCLVAnalisisTarifasEvaluacionFinal.GetItemFromView(btn), mDataCamposModificados)) complete (rBool As Boolean)
'	If rBool=False Then
'		ExitApplication
'	End If
	Dim NuevoTipoVariacion As String=Opcion
	Dim NuevoDatoVariacion As Double
	Select Case NuevoTipoVariacion
		Case "Precio"
			NuevoDatoVariacion=PrecioEUR
		Case "Margen"
			NuevoDatoVariacion=((PrecioEUR-CosteEUR)/PrecioEUR)
		Case "Var.Margen"
			NuevoDatoVariacion=0
	End Select

	ActualizarCalculosEvaluacion(IdXPanel,TipoTarifa,CodigoTarifa,Articulo,NuevoTipoVariacion,NuevoDatoVariacion)


End Sub

Private Sub btnEditDatoVariacion_Click
	Dim btn As Button=Sender
	Dim IdXPanel As Int=jamTableCLVAnalisisTarifasEvaluacionFinal.GetItemFromView(btn)
	
	Dim mData As Map=jamTableCLVAnalisisTarifasEvaluacionFinal.GetValue(jamTableCLVAnalisisTarifasEvaluacionFinal.GetItemFromView(btn))
	
	Dim Status As String=mData.Get("Status")
	If Status="NOK" Then
		Dim msa As Object=xui.MsgboxAsync("Función deshabilitada para líneas con Status NOK.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim TipoTarifa As Int=mData.Get("TipoTarifa")
	Dim CodigoTarifa As String=mData.Get("CodigoTarifa")
	Dim Articulo As String=mData.Get("Articulo")
	Dim PrecioEUR As Double=mData.Get("PrecioEUR")
	Dim CosteEUR As Double=mData.Get("CosteEUR")
	
	Dim TipoVariacion As String=mData.Get("TipoVariacion")
	Dim DatoVariacion As Double=mData.Get("DatoVariacion")
	Dim NuevoPrecioEUR As Double=mData.Get("NuevoPrecioEUR")
	Dim NuevoPorMargenSVta As Double=mData.Get("NuevoPorMargenSVta")
	
	Dialog.Title="Indica Nuevo " & TipoVariacion
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	
	
	Select Case TipoVariacion
		Case "Precio"
			B4XInput.lblTitle.Text="NuevoPrecioEUR"
			B4XInput.ConfigureForNumbers(True,False)
			B4XInput.Text=DatoVariacion
		Case "Margen"
			B4XInput.Text=DatoVariacion*100
			B4XInput.lblTitle.Text="Nuevo Margen S/Vta en %"
			B4XInput.ConfigureForNumbers(True,True)
		Case "Var.Margen"
			B4XInput.Text=DatoVariacion
			B4XInput.lblTitle.Text="(variación respecto al margen actual en %"
			B4XInput.ConfigureForNumbers(True,True)
	End Select

	B4XInput.mBase.Width=450dip
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XInput,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result <> xui.DialogResponse_Positive Then Return
	
	
	Select Case TipoVariacion
		Case "Precio"
			Dim NuevoDatoVariacion As Double=B4XInput.Text
		Case "Margen"
			Dim NuevoDatoVariacion As Double=B4XInput.Text/100
		Case "Var.Margen"
			Dim NuevoDatoVariacion As Double=B4XInput.Text
	End Select
	
	ActualizarCalculosEvaluacion(IdXPanel,TipoTarifa,CodigoTarifa,Articulo,TipoVariacion,NuevoDatoVariacion)
	
End Sub

Private Sub btnStatus_Click
	Dim btn As Button=Sender
	Dim mData As Map=jamTableCLVAnalisisTarifasEvaluacionFinal.GetValue(jamTableCLVAnalisisTarifasEvaluacionFinal.GetItemFromView(btn))
	If "OK"=mData.Get("Status") Then
		Dim msa As Object=xui.MsgboxAsync("Datos Ventas, Precios Venta, Coste Artículo OK.","Datos OK")
		Wait For (msa) Msgbox_Result
		 Return
	Else
		'	Dim TipoTarifa As Int=mData.Get("TipoTarifa")
'	Dim CodigoTarifa As String=mData.Get("CodigoTarifa")
'	Dim Articulo As String=mData.Get("Articulo")
		Dim DescStatus As String=mData.Get("DescripcionStatus")
		Dim msa As Object=xui.MsgboxAsync(DescStatus & ".","Error de datos")
		Wait For (msa) Msgbox_Result
	End If

End Sub

#End Region

Sub EditarCifraVentasAnualEstimada(TipoTarifa As Int, CodigoTarifa As String, Articulo As String, QtyEstimadaActual As Int)
	Dialog.Title="Indica la Cantidad de Venta Estimada Anual"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	
	B4XInput.Text=QtyEstimadaActual
	B4XInput.lblTitle.Text=""
	B4XInput.ConfigureForNumbers(False,False)
	B4XInput.mBase.Width=450dip
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XInput,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.TextSize=16
	bOk.Left=(Dialog.Base.Width-bOk.Width)/2
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=16
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result <> xui.DialogResponse_Positive Then Return
	Dim NuevaQtyEstimadaVentasAnual As Int=B4XInput.Text
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasEditarQtyEstimadaVentas", _
		Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa, Articulo,NuevaQtyEstimadaVentasAnual, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, NuevaQtyEstimadaVentasAnual, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar la cantidad de venta estimada para la línea seleccionada.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	jamTableViewListaDatosRevisionVentas.SQL.ExecNonQuery2("update tblOrigenDatos set QtyVentasAnualEstimada=? where IDAnalisisTarifas=? and TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevaQtyEstimadaVentasAnual, mIDAnalisisTarifasVenta,TipoTarifa, CodigoTarifa,Articulo))
	mSQL.ExecNonQuery2("update tblAnalisisTarifasAnalisisDatosRevisionVentas set QtyVentasAnualEstimada=? where IDAnalisisTarifas=? and TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array(NuevaQtyEstimadaVentasAnual, mIDAnalisisTarifasVenta,TipoTarifa, CodigoTarifa,Articulo))
	Dim mDataPK As Map=CreateMap("IDAnalisisTarifas":mIDAnalisisTarifasVenta,"TipoTarifa":TipoTarifa,"CodigoTarifa":CodigoTarifa, "Articulo":Articulo)
	Dim FilaSel As Int=jamTableViewListaDatosRevisionVentas.GetIDxFilaTVRegistroPK(mDataPK)
	jamTableViewListaDatosRevisionVentas.RefrescarFilaTVMetodoSQL(FilaSel)
	
End Sub


#IF java
import javafx.scene.control.TreeItem;
public void expandTreeView(TreeItem<?> item){
    if(item != null && !item.isLeaf()){
        item.setExpanded(true);
        for(TreeItem<?> child:item.getChildren()){
            expandTreeView(child);
        }
    }
}

public void collapseTreeView(TreeItem<?> item){
    if(item != null && !item.isLeaf()){
        item.setExpanded(false);
        for(TreeItem<?> child:item.getChildren()){
            collapseTreeView(child);
        }
    }
}
#End If

Sub ActualizarEstadoModulo(TipoEstado As String, NuevoEstado As String) As ResumableSub
	Dim Comando As String
	Select Case TipoEstado
		Case "Ventas"
			Comando="AnalisisTarifasActualizarEstadoVentas"
		Case "FabricacionCorte"
			Comando="AnalisisTarifasActualizarEstadoCostesFabricacionCorte"
		Case "FabricacionNoCorte"
			Comando="AnalisisTarifasActualizarEstadoCostesFabricacionNoCorte"
		Case "Importacion"
			Comando="AnalisisTarifasActualizarEstadoCostesImportacion"
		Case "Compras"
			Comando="AnalisisTarifasActualizarEstadoCostesCompra"
		Case Else
			Dim msa As Object=xui.MsgboxAsync($"TipoEstado ${TipoEstado} incorrecto. Avisa al administrador de la aplicación."$,"Error")
			Wait For (msa) Msgbox_Result
			Return False
	End Select
	Dim cmd As DBCommand=JRDCQuery.CreateCommand(Comando,Array(NuevoEstado, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar el estado.","Error")
		Wait For (msa) Msgbox_Result
	End If
	Return Success
End Sub

Sub CargarEstadosAnalisisTarifas As ResumableSub

	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasEstadosAnalisis"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Estados para el Análisis de Tarifas Venta con ID " & mIDAnalisisTarifasVenta & ".","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			
		End If
	End If
	Return mRes
End Sub







