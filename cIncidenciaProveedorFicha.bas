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
	
	Private Dialog As B4XDialog
	Private jamLoadingIndicator1 As JamLoadingIndicator

	
	Dim mSQL As SQL
		
	Private Drawer As B4XDrawer
	'Private clvDrawer As CustomListView
	
	Type TipoDatosCabeceraIncidenciaProveedor (IDIncidenciaProveedor As Int, IncidenciaProveedor As String, EstadoIncidencia As Int, _
		MigracionAccess As Boolean, TipoOrigenIncidenciaProveedor As String, IDUsuarioEmisor As Int, NombreUsuarioEmisor As String, IDUsuarioCompras As Int, NombreUsuarioCompras As String, _
		DepartamentoCoordinador As String, _
		FechaIncidenciaLong As Long, Proveedor As String,  NombreProveedor As String, OrigenIncidencia As String, _
		IDTipoDocumento As Int, NombreTipoDocumento As String, DocumentoProveedor As String, FechaDocumentoProveedorLong As Long, _
		IDTipoDocumentoOrigen As Int, NombreTipoDocumentoOrigen As String, DocumentoOrigen As String, _
		DescripcionIncidencia As String, IDTipoIncidencia As Int,NombreTipoIncidencia As String, _
		AccionCompras As String, FechaAccionComprasLong As Long, IDUsuarioAccionCompras As Int, NombreUsuarioAccionCompras As String, _
		FechaCierreLong As Long, IDUsuarioCierre As String, NombreUsuarioCierre As String, GravedadIncidencia As String,  NumeroFicherosAdjuntosIncidencia As Int, _
		NoConformidadAsociada As Boolean, IDNoConformidadAsociada As Int, LinkInformeNoConformidadAsociada As String, _ 
		CosteIncidencia As Double, ResponsabilidadInterna As Boolean, ResponsableCausaIncidencia As String)
		
	Type TipoDatosAccionIncidencia (IDLineaAccion As Int, IDLineaAccionTemp As Int, IDLineaCorrelativo As Int, IDIncidencia As Int, TipoCambio As String, FechaLineaAccionLong As Long, _
		UsuarioCreacionLineaAccion As String, NumeroFicherosAdjuntosAccion As Int, AccionCierraIncidencia As Boolean, DescripcionAccion As String, DepartamentoAsignadoAccion As String, _
		DependenciasPendientesAccion As Int, _
		EstadoAccion As Int, FechaCierreAccion As Long, UsuarioCierreAccion As String, ComentariosCierreAccion As String)
		
	'Type TipoDatosFicherosAccionIncidencia(IDLineaFicherosAdjuntos As Int, IDIncidencia As Int,  IDLineaAccion As Int, IDLineaAccionTemp As Int, LinkFichero As String)
	Type TipoDatosFicheroAdjuntoIncidencia(IDLineaFicherosAdjuntos As Int, IDIncidencia As Int,  IDLineaAccion As Int, LinkFichero As String)
		
	Private DatosCabeceraIncidenciaProveedor As TipoDatosCabeceraIncidenciaProveedor
	Private lstAccionesIncidenciaProveedor As List
	Private lstFicherosAdjuntosIncidencia As List
	'Private lstFicherosAccionesIncidencia As List
	
	Private CuentaEmailArchivadoIncidencias As String
	Private NombreCuentaEmailArchivadoIncidencias As String
	
	Private DatosCabeceraIncidenciaProveedorTemp As TipoDatosCabeceraIncidenciaProveedor
'	Private lstAccionesIncidenciaProveedorTemp As List
	'Private lstFicherosAccionesIncidenciaTemp As List
	'Private AccionTemp As TipoDatosAccionIncidencia
	Private IDIncidenciaProveedorAnterior As Int
	Private IncidenciaProveedorAnterior As String
	
'	Private mIDLinea As Int

'	Private mIncidenciaProveedor As String
'	Private mIDTipoDocumentoProveedor As Int
'	Private mIDTipoDocumentoOrigen As Int
'	Private mEstadoIncidencia As String
'	Private mMigracionAccess As Boolean
	
	Private ModoFicha As String
	Public DepartamentoEmisor As String
	
	
	Private btnCancelarNuevoEditarIncidenciaProveedor As B4XView
	Private btnGrabarNuevoEditarEstadoRevision As B4XView
	'Private btnMenuFichaIncidencia As B4XView
	Private btnSelDocumentoOrigen As B4XView
	Private btnSelDocumentoProveedor As B4XView
	Private btnSelFechaCierreIncidencia As B4XView
	Private btnSelFechaDocumentoProveedor As B4XView
	Private btnSelFechaIncidencia As B4XView
	Private btnSelProveedor As B4XView
	Private btnSelTipoDocumentoOrigen As B4XView
	Private btnSelTipoDocumentoProveedor As B4XView
	Private btnSelUsuarioCompras As B4XView
	Private btnSelUsuarioEmisor As B4XView
	
	'Private cboTipoIncidencia As ComboBox
	Private pnlFondoIncidenciaProveedorFicha As B4XView
	Private TextAreaAccionCompras As B4XView
	'Private TextAreaDescripcionIncidencia As TextArea
	Private txtDocumentoOrigenProveedor As B4XView
	Private txtDocumentoProveedor As B4XView
	Private txtFechaCierreIncidencia As B4XView
	Private txtFechaDocumentoProveedor As B4XView
	Private txtFechaIncidencia As B4XView
	Private txtNombreProveedor As B4XView
	Private txtNumeroIncidencia As B4XView
	Private txtProveedor As B4XView
	Private txtTipoDocumentoOrigen As B4XView
	Private txtTipoDocumentoProveedor As B4XView
	Private txtUsuarioCompras As B4XView
	Private txtUsuarioEmisor As B4XView
	Private lblIconCerrarDrawer As B4XView
	Private lblTextoCerrarDrawer As B4XView
	Private pnlTopDrawerLeft As B4XView
	Private TreeViewDrawer As TreeView
	Private txtFechaAccionCompras As B4XView
	Private btnSelFechaAccionCompras As B4XView
	Private txtUsuarioAccionCompras As B4XView
	Private txtUsuarioCierreIncidencia As B4XView
	Private txtModo As B4XView
	Private txtEstadoIncidencia As B4XView
	
	Private mContextMenuDescripcionIncidencia As ContextMenu
	
	Private lblTitleAcciones As B4XView
	Private lblTitleFechaAccionCompras As B4XView
	Private lblTitleUsuarioAccionCompras As B4XView
	Private lblTitleTipoIncidencia As B4XView
	Private lblTitleFechaCierreIncidencia As B4XView
	Private lblTitleGravedadIncidencia As B4XView
	Private lblTitleUsuarioCierreIncidencia As B4XView
	Private txtTipoIncidencia As B4XView
	Private btnSelTipoIncidencia As B4XView
	Private txtGravedadIncidencia As B4XView
	Private btnSelGravedadIncidencia As B4XView
	Private lblModo As B4XView
	
	Private DireccionSeleccionadaRemitenteEmails As String
	Private btnSelDescripcionIncidencia As B4XView
	'Private btnSelAccionesIncidencia As B4XView
	Private txtTipoOrigenIncidencia As B4XView
	Private btnSelTipoOrigenIncidenciaProveedor As B4XView
	Private TextAreaDialog As TextArea

'	Private BackgroundSeleccionCuentasCorreoIncidencia As B4XView
'	Private BaseSeleccionCuentasCorreoIncidencia As B4XView

	Private BackgroundNuevancidencia As B4XView
	Private BaseNuevaIncidencia As B4XView
	
	Private BackgroundSeleccionDatosEmailIncidencia As B4XView
	Private BaseSeleccionDatosEmailIncidencia As B4XView
	
	Private BackgroundSeleccionDatosEmailTareaIncidencia As B4XView
	Private BaseSeleccionDatosEmailTareaIncidencia As B4XView
	
	Private BackgroundCerrarIncidencia As B4XView
	Private BaseCerrarIncidencia As B4XView
	
	Private BackgroundCerrarTareaIncidencia As B4XView
	Private BaseCerrarTareaIncidencia As B4XView
	
	Private NombreCuentaDepartamentoCoordinador As String
	Private DireccionEmailDepartamentoCoordinador As String
	
	Private NombreCuentaIncidenciasProveedorAlmacenProtec As String
	Private DireccionEmailIncidenciasProveedorAlmacenProtec As String
	
	Private NombreCuentaIncidenciasProveedorAlmacenProin As String
	Private DireccionEmailIncidenciasProveedorAlmacenProin As String
	
	Private NombreCuentaFacturasProveedor As String
	Private DireccionEmailFacturasProveedor As String
	
'	Private NombreCuentaIncidenciasCompras As String="Incidencias Compras"
'	Private EmailIncidenciasCompras As String="incidencias.compras@proin-pinilla.com"
'	Private NombreCuentaIncidenciasProveedor As String="incidenciasproveedor@protec-marti.com"
'	Private EmailIncidenciasProveedor As String="incidenciasproveedor@protec-marti.com"
'	Private NombreCuentaFacturas As String="Facturas"
'	Private EmailFacturas As String="facturas@proin-pinilla.com"
	Private btnCancelarCuentasCorreoIncidencia As B4XView
	Private btnOKCuentasCorreoIncidencia As B4XView
	Private CheckBoxCCIncidenciasCompras As B4XView
	Private CheckBoxCCIncidenciasProveedor As B4XView
	Private CheckBoxParaIncidenciasCompras As B4XView
	Private CheckBoxParaIncidenciasProveedor As B4XView
	Private CheckBoxParaProveedor As B4XView
	
	
	Private RadioButtonDeIncidenciasProveedor As B4XView
	Private RadioButtonDeIncidenciasCompras As B4XView
	Private RadioButtonDeCuentaUsuario As B4XView
	Private CheckBoxCCFacturas As B4XView
	
	Private BackgroundAccionIncidencia As B4XView
	Private BaseAccionIncidencia As B4XView
	'Private TextAreaAccionLinea As TextArea
	Private txtFechaAccionLinea As B4XView
	Private txtUsuarioCreacionAccionLinea As B4XView
	Private txtFechaAccion As B4XView
	Private lblAddAccionIncidencia As B4XView
	Private clvAccionesIncidencia As CustomListView
	Private btnGrabarNuevoEditarAccionIncidencia As B4XView
	Private btnCancelarNuevoEditarAccionIncidencia As B4XView
	'Private cboGravedadIncidencia As ComboBox
	'Private cboDepartamentoAsignadoAccionIncidencia As ComboBox
	Private B4XSwitchAccionCierraIncidencia As B4XSwitch
	Private ChoiceBoxGravedadIncidencia As ChoiceBox
	'Private cboTipoIncidencia As ComboBox
	Private TextAreaDescripcionAccion As TextArea
	Private ModoAccion As String
	Private lblTitleAcciónIncidencia As B4XView
	Private pnlFondoDatosCierreIncidencia As B4XView
	'Private lblTitleDepartamentoAsignadoAccionIncidencia As B4XView
	Private btnInsertarDescripcionAccionTextoPredefinido As B4XView
	Private txtDepartamentoGestorAccionLinea As B4XView
'	Private btnEditarAccionLinea As B4XView
'	Private btnAnularAccionLinea As B4XView
	
	Private Color1, Color2, ColorActualItemCLVAcciones As Int
	Private pnlFondoItemAccion As B4XView
	Private CheckBoxAccionCierraIncidencia As B4XView
	Private lblTitleDepartamentoGestorAccionLinea As B4XView
	Private txtFechaAccionNuevaEditar As B4XView
	Private TextAreaDescripcionAccionNuevaEditar As TextArea
	Private cboDepartamentoAsignadoAccionIncidenciaNuevaEditar As ComboBox
	Private cboTipoIncidenciaNuevaEditar As ComboBox
	Private lblTitleDepartamentoAsignadoAccionIncidenciaNuevaEditar As B4XView
	Private pnlFondoDatosCierreIncidenciaNuevaEditar As B4XView
	Private lblTitleUsuarioCierreIncidenciaNuevaEditar As B4XView
	Private txtUsuarioCierreIncidenciaNuevaEditar As B4XView
	Private txtFechaCierreIncidenciaNuevaEditar As B4XView
	Private lblMenuFichaIncidencia As B4XView
	Private btnCopiarInfoLineasPedidoCompraADescripcionIncidencia As B4XView
	Private lblMenuAccionesAccionLinea As B4XView
	
	Private mContextMenuAccionesAccionIncidencia As ContextMenu
	'Private lblDescripcionFaseBodyEmailFaseIncidencia As B4XView
	Private btnOKDatosEmailFaseIncidencia As B4XView
	Private btnCancelarDatosEmailFaseIncidencia As B4XView
	Private B4XSwitchIncluirDescripcionFaseBodyEmailFaseIncidencia As B4XSwitch
	Private RadioButtonDeAlmacenPROIN As RadioButton
	Private CheckBoxParaAlmacenPROIN As CheckBox
	Private CheckBoxCCAlmacenPROIN As CheckBox
	Private CheckBoxParaDepartamentoAsignadoFase As CheckBox
	
	Private BackgroundSeleccionFicherosAdjuntosIncidencia As B4XView
	Private BaseSeleccionFicherosAdjuntosIncidencia As B4XView
	Private BackgroundSeleccionFicherosAdjuntosFaseIncidencia As B4XView
	Private BaseSeleccionFicherosAdjuntosFaseIncidencia As B4XView
	
	Private lblFicherosAdjuntosAccionLinea As B4XView
	Private btnCopiarInfoLineasPedidoCompraADescripcionFaseIncidencia As B4XView
	Private clvFicherosAdjuntosFaseIncidencia As CustomListView
	Private lblAbrirLinkFicheroAdjuntoFaseIncidencia As B4XView
	Private lblEliminarLinkFicheroAdjuntoFaseIncidencia As B4XView
	Private lblLinkFicheroAdjuntoFaseIncidencia As B4XView
	Private pnlFondoItemFicheroAdjuntoFaseIncidencia As B4XView
	Private lblNuevoLinkFicheroAdjuntoFaseIncidencia As B4XView
	Private lblTitleNuevoFicheroAdjuntoFaseIncidencia As B4XView
	Private btnOKFicherosAdjuntosFaseIncidencia As B4XView
	Private pnlFondoNuevaEditarAccion As B4XView
	Private TextAreaDummy As TextArea
	Private CheckBoxCCDepartamentoAsignadoFase As CheckBox
	Private lblAyudaDepartamentoAsignadoFase As B4XView
	Private lblTitleUsuarioCompras As B4XView
	
	Private JamClickableBadges1 As JamClickableBadges
	
	Private lblIconFicherosAdjuntosAccionLinea As B4XView
	'Private lblDescripcionAccionLinea As B4XView
	Private TextAreaDescripcionFaseBodyEmailFaseIncidencia As TextArea
	Private txtDepartamentoCoordinador As TextField
	Private btnSelDepartamentoCoordinador As Button
	Private btnCancelarNuevaIncidenciaProveedor As B4XView
	Private btnCopiarInfoLineasPedidoCompraADescripcionNuevaIncidencia As B4XView
	Private btnGrabarNuevaIncidenciaProveedor As B4XView
	Private btnInsertarDescripcionAccionInicialTextoPredefinidoNuevaIncidencia As B4XView
	Private btnSelDocumentoOrigenNuevaIncidencia As B4XView
	Private btnSelDocumentoProveedorNuevaIncidencia As B4XView
	Private btnSelFechaAccionIncidencia As B4XView
	Private btnSelFechaDocumentoProveedorNuevaIncidencia As B4XView
	Private btnSelFechaNuevaIncidencia As B4XView
	Private btnSelProveedorNuevaIncidencia As B4XView
	Private btnSelTipoDocumentoOrigenNuevaIncidencia As B4XView
	Private btnSelTipoDocumentoProveedorNuevaIncidencia As B4XView
	Private btnSelTipoOrigenNuevaIncidenciaProveedor As B4XView
	Private btnSelUsuarioEmisorNuevaIncidencia As B4XView
	'Private cboDepartamentoAsignadoAccionInicialNuevaIncidencia As B4XView
	Private pnlFondoIncidenciaProveedorNuevaIncidencia As B4XView
	Private txtDocumentoOrigenProveedorNuevaIncidencia As B4XView
	Private txtDocumentoProveedorNuevaIncidencia As B4XView
	Private txtFechaAccionInicialNuevaIncidencia As B4XView
	Private txtFechaDocumentoProveedorNuevaIncidencia As B4XView
	Private txtFechaNuevaIncidencia As B4XView
	Private txtNombreProveedorNuevaIncidencia As B4XView
	Private txtProveedorNuevaIncidencia As B4XView
	Private txtTipoDocumentoOrigenNuevaIncidencia As B4XView
	Private txtTipoDocumentoProveedorNuevaIncidencia As B4XView
	Private txtTipoOrigenNuevaIncidencia As B4XView
	Private txtUsuarioEmisorNuevaIncidencia As B4XView
	Private cboDepartamentoCoordinadorNuevaIncidencia As B4XView
	Private TextAreaDescripcionNuevaIncidencia As TextArea
	Private TextAreaDescripcionAccionInicialNuevaIncidencia As TextArea
	Private txtDepartamentoCoordinadorNuevaIncidencia As B4XView
	Private btnSelDepartamentoCoordinadorNuevaIncidencia As B4XView
	Private lblIconFicherosAdjuntosIncidencia As B4XView
	Private txtEstadoAccionIncidencia As B4XView
	
	Private txtFechaCierreAccionLinea As B4XView
	Private txtUsuarioCierreAccionLinea As B4XView
	Private lblComentariosCierreAccionLinea As B4XView
	Private lblMenuAccionesDescripcionIncidencia As B4XView
	Private lblDependenciasPendientesAccionLinea As B4XView
	Private btnSelFechaAccionIncidenciaNuevaIncidencia As B4XView
	Private lblAnularIncidencia As B4XView
	Private lblCerrarIncidencia As B4XView
	Private lblEmailIncidencia As B4XView
	Private lblVolverAListaIncidencias As B4XView
	Private lblNuevaIncidencia As B4XView
	Private scrpnlFondoIncidenciaProveedorFicha As ScrollPane
	Private txtDepartamentoAsignadoAccionInicialNuevaIncidencia As B4XView
	Private btnSelDepartamentoAsignadoAccionInicialNuevaIncidencia As B4XView
	Private btnGrabarCierreIncidenciaCancelar As B4XView
	Private btnGrabarCierreIncidenciaGrabar As B4XView
	Private btnSelGrabarCierreIncidenciaFechaCierreIncidencia As B4XView
	Private btnSelGrabarCierreIncidenciaGravedadIncidencia As B4XView
	Private btnSelGrabarCierreIncidenciaTipoIncidencia As B4XView
	Private pnlFondoGrabarCierreIncidencia As B4XView
	Private txtGrabarCierreIncidenciaFechaCierreIncidencia As B4XView
	Private txtGrabarCierreIncidenciaGravedadIncidencia As B4XView
	Private txtGrabarCierreIncidenciaTipoIncidencia As B4XView
	Private txtGrabarCierreIncidenciaUsuarioCierreIncidencia As B4XView
	Private B4XSwitchIncluirDescripcionBodyEmailIncidencia As B4XSwitch_AdjSize
	Private btnCancelarDatosEmailIncidencia As B4XView
	Private btnOKDatosEmailIncidencia As B4XView
	Private CheckBoxCCDepartamentoCoordinador As B4XView
	Private CheckBoxParaDepartamentoCoordinador As B4XView
	Private clvAdjuntarFicherosEmailIncidencia As CustomListView
	Private pnlFondoSeleccionDatosEmailIncidencia As B4XView
	Private RadioButtonDeDepartamentoCoordinador As B4XView
	Private TextAreaDescripcionBodyEmailIncidencia As B4XView
	Private RadioButtonDeIncidenciasProveedorAlmacenProtec As B4XView
	Private RadioButtonDeIncidenciasProveedorAlmacenProin As B4XView
	Private CheckBoxParaIncidenciasProveedorAlmacenProtec As B4XView
	Private CheckBoxParaIncidenciasProveedorAlmacenProin As B4XView
	Private CheckBoxCCIncidenciasProveedorAlmacenProtec As B4XView
	Private CheckBoxCCIncidenciasProveedorAlmacenProin As B4XView
	Private btnOKFicherosAdjuntosIncidencia As B4XView
	Private clvFicherosAdjuntosIncidencia As CustomListView
	Private lblTitleFicherosAdjuntosIncidencia As B4XView
	Private lblNuevoLinkFicheroAdjuntoIncidencia As B4XView
	Private lblTitleNuevoFicheroAdjuntoIncidencia As B4XView
	Private pnlFondoItemFicheroAdjuntoIncidencia As B4XView
	Private lblAbrirLinkFicheroAdjuntoIncidencia As B4XView
	Private lblEliminarLinkFicheroAdjuntoIncidencia As B4XView
	Private lblLinkFicheroAdjuntoIncidencia As B4XView
	Private btnCancelarNuevoEditarTareaIncidencia As B4XView
	Private btnGrabarNuevoEditarTareaIncidencia As B4XView
	Private btnSelFechaEditarCierreTareaIncidencia As B4XView
	Private pnlFondoEditarCierreTarea As B4XView
	Private txtEditarComentarioCierreAccionIncidencia As B4XView
	Private txtFechaEditarCierreTarea As B4XView
	Private SplitPaneFichaIncidencia As SplitPane
	Private SplitPaneAux1 As SplitPane
	Private SplitPaneAux2 As SplitPane
	Private SplitPaneAux3 As SplitPane
	Private SplitPaneAux4 As SplitPane
	Private txtInformeNoConformidadAsociadaIncidencia As B4XView
	Private btnSelInformeNoConformidad As B4XView
	Private CheckBoxIncidenciaInterna As CheckBox
	Private txtResponsableCausaIncidencia As B4XView
	Private txtComentariosCierreAccionLinea As B4XView
	Private txtCosteIncidencia As B4XView
	Private btnSelGrabarCierreIncidenciaCosteIncidencia As B4XView
	Private btnSelGrabarCierreIncidenciaResponsableCausaIncidencia As B4XView
	Private CheckBoxGrabarCierreIncidenciaIncidenciaInterna As B4XView
	Private txtGrabarCierreIncidenciaCosteIncidencia As B4XView
	Private txtGrabarCierreIncidenciaResponsableCausaIncidencia As B4XView
	Private ScrollPane1 As ScrollPane
	Private lblReabrirIncidencia As B4XView
	Private lblSalirIncidenciaProveedorFicha As B4XView
	Private pnlFondoCLVAccionesIncidencia As B4XView
	
	Private TextEngine1 As BCTextEngine
	Private BBCodeViewDescripcionIncidencia As BBCodeView
	Private pnlFondoDescripcionIncidencia As B4XView
	Private lblTitleDescripcionIncidencia As B4XView
	'Private BBCodeViewAccionLinea As BBCodeView
	'Private BBListItemAccionLinea As BBListItem
	'Private BBListItemIndexInItems As Int = 1
	Private lblTitleSeleccionDatosEmail As B4XView
	Private lblTitleIncluirDescripcionBodyEmail As B4XView
	Private lblTitleIncluirFicherosAdjuntosEmail As B4XView
	Private B4XSwitchAdjuntarFicherosAdjuntosIncidencia As B4XSwitch_AdjSize
	Private lblImprimirIncidencia As B4XView
	Private btnOKDatosCabeceraAnalisisTarifasVenta As B4XView
	Private btnSelAnalisisTarifasVentaEdicionDatosCabeceraDescripcionAnalisis As B4XView
	Private btnSelAnalisisTarifasVentaEdicionDatosCabeceraEmailCoordinador As B4XView
	Private lblAnalisisTarifasVentaEdicionDatosCabeceraCreadoPor As B4XView
	Private pnlFondoEdicionDatosCabeceraAnalisisTarifasVenta As B4XView
	Private txtAnalisisTarifasVentaEdicionDatosCabeceraAnalisisTarifas As B4XView
	Private txtAnalisisTarifasVentaEdicionDatosCabeceraDescripcionAnalisis As B4XView
	Private txtAnalisisTarifasVentaEdicionDatosCabeceraEmailCoordinador As B4XView
	Private txtAnalisisTarifasVentaEdicionDatosCabeceraEstadoAnalisis As B4XView
	Private txtAnalisisTarifasVentaEdicionDatosCabeceraIDAnalisisTarifas As B4XView
	Private lblDocumentoOrigenNAV As B4XView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(IDIncidenciaProveedor As Int, IncidenciaProveedor As String)
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
	IDIncidenciaProveedorAnterior=0
	IncidenciaProveedorAnterior=""
	DatosCabeceraIncidenciaProveedor.Initialize
	lstAccionesIncidenciaProveedor.Initialize
	lstFicherosAdjuntosIncidencia.Initialize
'	lstFicherosAccionesIncidencia.Initialize
	
'	DatosCabeceraIncidenciaProveedorTemp.Initialize
'	lstAccionesIncidenciaProveedorTemp.Initialize
	
	DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=IDIncidenciaProveedor
	DatosCabeceraIncidenciaProveedor.IncidenciaProveedor=IncidenciaProveedor

'	Color1=0xFFE7E7E7
'	Color2=0xFFDCDCDC
	
	Color1=xui.Color_White
	Color2=xui.Color_White
	
'
'	Color1=0xFFC0DBFC
'	Color2=0xFFAEC8E2
End Sub

Public Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	

	
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	JamClickableBadges1.Initialize(Me,"JamClickableBadges1")
	


	
	frm.Title=Main.PrefijoTitleForms & "    Ficha Incidencia Proveedor " & IIf(DatosCabeceraIncidenciaProveedor.IncidenciaProveedor="","",DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
	
'	Drawer.Initialize(Me, "Drawer", frm.RootPane, 400dip)
'	Drawer.CenterPanel.LoadLayout("scrIncidenciasProveedorFichaVert")
'	Drawer.leftpanel.LoadLayout("scrDrawerLeftTreeView")

'	frm.RootPane.LoadLayout("scrFichaIncidenciaSplitPane")
'	SplitPaneFichaIncidencia.LoadLayout("scrIncidenciasProveedorScrollPane1")
'	ScrollPane1.LoadLayout("scrIncidenciasProveedoresFichaIncidenciaSplitPanelAux1",-1,-1)
'	
	
	frm.RootPane.LoadLayout("scrIncidenciasProveedorBaseFicha")
	scrpnlFondoIncidenciaProveedorFicha.LoadLayout("scrIncidenciasProveedorFichaVert2",-1,-1)
	
	Utilidades.AddImageToLabel(lblSalirIncidenciaProveedorFicha,File.DirAssets, "twotone_exit_black_24dp.png")
	
	
	''frm.Stylesheets.Add(File.GetUri(File.DirAssets, "TextAreaSinPadding.css"))
	
'	CSSUtils.SetStyleProperty(TextAreaDescripcionIncidencia,"-fx-control-inner-background","transparent")
'	CSSUtils.SetStyleProperty(TextAreaDescripcionIncidencia,"-fx-background","transparent")
'	CSSUtils.SetStyleProperty(TextAreaDescripcionIncidencia,"-fx-faint-focus-color","transparent")
'	CSSUtils.SetStyleProperty(TextAreaDescripcionIncidencia,"-fx-background-color","transparent")
'	CSSUtils.SetStyleProperty(TextAreaDescripcionIncidencia,"-fx-text-fill","Black")
	
	frm.Show
	
	If TextEngine1.IsInitialized=False Then
		TextEngine1.Initialize(frm.RootPane)
	End If
	
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	
	CreacionTablasSQLite
	
	CrearVBSScriptDireccionRemitenteEmailOutlook
	
	'CrearVBSScriptEnvioEmailOutlook
	
	CrearVBSScriptCrearEmailOutlookHTML
	
	'CrearVBSScriptCrearEmailOutlookHTMLSinRemitente
	
	CrearScriptVerificarAccesoBuzonCompartido
	
	mContextMenuDescripcionIncidencia.Initialize("")
	Dim joCtxM As JavaObject=mContextMenuDescripcionIncidencia
	joCtxM.RunMethod("setAutoHide",Array(True))
	'joCtxM.RunMethod("setStyle",Array($"-fx-selection-bar:#00FA9A;-fx-background-color: dimgray;"$))
	joCtxM.RunMethod("setStyle",Array($"-fx-selection-bar:#8C8C8C;-fx-background-color: #434343;"$))
	'mContextMenuAccionesAccionIncidencia.As(Node).StyleClasses.Add("MyMenu.css")
	
	mContextMenuAccionesAccionIncidencia.Initialize("")
	Dim joCtxM As JavaObject=mContextMenuAccionesAccionIncidencia
	joCtxM.RunMethod("setAutoHide",Array(True))
	'joCtxM.RunMethod("setStyle",Array($"-fx-selection-bar:#00FA9A;-fx-background-color: dimgray;"$))
	joCtxM.RunMethod("setStyle",Array($"-fx-selection-bar:#8C8C8C;-fx-background-color: #434343;"$))
	'mContextMenuAccionesAccionIncidencia.As(Node).StyleClasses.Add("MyMenu.css")
	
	Wait For(CargaIncidenciasProveedorTiposDocumentos) complete (mRes As Map)
	'jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If

	'AddItemsMenuContextualAccionesAccionIncidencia
	
	'OcultarControlesDepartamento
	
	Wait For(BorrarTablasBatchDispositivoUsuario) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If
	
	If DatosCabeceraIncidenciaProveedor.IncidenciaProveedor="" Then  ' NUEVA INCIDENCIA
'		ModoNuevo
'		MostrarDatosNuevaIncidencia
'		ValoresInicialesNuevaIncidenciaProveedor

		CambioAModoNuevo
	Else  ' FICHA YA EXISTE
		'ModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
'		ModoVer
'		jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}..."$
'		jamLoadingIndicator1.Show
'		Wait For(CargaDatosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (success As Boolean)
'		If success=False Then
'			jamLoadingIndicator1.Close
'			SalirModulo
'			Return
'		End If
'		MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor,lstAccionesIncidencia)
'		jamLoadingIndicator1.Close
		Dim CarpetaIncidencia As String=$"//servidor/publico/IncidenciasProveedor/${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor} "$
		If File.Exists(CarpetaIncidencia,"")=False Then
			File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,$"${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}"$)
			File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,$"${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}/Adjuntos"$)
			File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,$"${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}/Emails"$)
		End If
		CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor,DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
	End If
	
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub CreacionTablasSQLite

	mSQL.ExecNonQuery("drop table if exists tblIncidenciasProveedorTiposDocumentos")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorTiposDocumentos] ([IDTipoDocumento] INTEGER
, [NombreTipoDocumento] TEXT, [DocumentoTipoOrigen] TEXT, [IDTipoDocumentoOrigenAsociado] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblIncidenciasProveedorTiposIncidencias")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorTiposIncidencias] ([IDTipoIncidencia] INTEGER, [NombreTipoIncidencia] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblIncidenciasProveedorCuentasEmailIncidencias")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblIncidenciasProveedorCuentasEmailIncidencias] ([Departamento] TEXT, [DireccionEmail] TEXT, [NombreCuenta] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)
	

	
End Sub

Sub BorrarTablasBatchDispositivoUsuario As ResumableSub
	
	jamLoadingIndicator1.MensajeLoading=""
	'jamLoadingIndicator1.ColorPanelFondo=xui.Color_Transparent
	jamLoadingIndicator1.Show
	
	Dim lstComandos As List
	lstComandos.Initialize
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasAccionIncidenciaBatchDispositivoUsuario", _
			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
	lstComandos.Add(cmd)
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasFicheroAdjuntoAccionIncidenciaBatchDispositivoUsuario", _
			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
	lstComandos.Add(cmd)
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
'	jamLoadingIndicator1.Close
'	jamLoadingIndicator1.ColorPanelFondo=0xaa000000
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar las tablas batch de incidencias proveedor dispositivo-usuario.","Error")
		Wait For (msa) Msgbox_Result
		
	End If
	Return Success
	
End Sub

Sub OcultarControlesDepartamento
	If DepartamentoEmisor="ALMACEN" Then
		lblTitleAcciones.Visible=False
		lblTitleFechaAccionCompras.Visible=False
		lblTitleUsuarioAccionCompras.Visible=False
		lblTitleTipoIncidencia.Visible=False
		lblTitleFechaCierreIncidencia.Visible=False
		lblTitleGravedadIncidencia.Visible=False
		lblTitleUsuarioCierreIncidencia.Visible=False
		TextAreaAccionCompras.Visible=False
		txtFechaAccionCompras.Visible=False
		'btnSelAccionesIncidencia.Visible=False
		btnSelFechaAccionCompras.Visible=False
		txtUsuarioAccionCompras.Visible=False
		txtTipoIncidencia.Visible=False
		btnSelTipoIncidencia.Visible=False
		txtFechaCierreIncidencia.Visible=False
		btnSelFechaCierreIncidencia.Visible=False
		txtGravedadIncidencia.Visible=False
		btnSelGravedadIncidencia.Visible=False
		txtUsuarioCierreIncidencia.Visible=False
'		btnGrabarNuevoEditarEstadoRevision.Top=TextAreaDescripcionIncidencia.Top+TextAreaDescripcionIncidencia.Height+30dip
'		btnCancelarNuevoEditarIncidenciaProveedor.Top=btnGrabarNuevoEditarEstadoRevision.Top
	End If
End Sub

'Sub ModoVer(IDIncSel As Int, IncSel As String)
Sub ModoVer
	ModoFicha="VER"
	'lblModo.Text="Modo " & ModoFicha
	lblModo.Text=""
	
'	TextAreaAccionCompras.As(TextArea).Editable=False
'	TextAreaDescripcionIncidencia.As(TextArea).Editable=False
'	btnSelFechaIncidencia.Enabled=False
'	btnSelFechaAccionCompras.Enabled=False
'	btnSelDocumentoOrigen.Enabled=False
'	btnSelDocumentoProveedor.Enabled=False
'	btnSelFechaDocumentoProveedor.Enabled=False
'	btnSelProveedor.Enabled=False
'	btnSelUsuarioCompras.Enabled=False
'	btnSelUsuarioEmisor.Enabled=False
'	btnSelTipoDocumentoOrigen.Enabled=False
'	btnSelTipoDocumentoProveedor.Enabled=False
'	btnSelTipoIncidencia.Enabled=False
'	btnSelFechaCierreIncidencia.Enabled=False
'	btnSelGravedadIncidencia.Enabled=False
	'btnMenuFichaIncidencia.Visible=True
	'''lblMenuFichaIncidencia.Visible=True
	btnGrabarNuevoEditarEstadoRevision.Visible=False
	btnCancelarNuevoEditarIncidenciaProveedor.Visible=False
'	btnCopiarInfoLineasPedidoCompraADescripcionIncidencia.Visible=False
'	Wait For(ActualizarDatosIncidencia(IDIncSel, IncSel)) complete (success As Boolean)
'	If success=False Then
'		SalirModulo
'		Return
'	End If
'	EliminarItemCLVAccionesNuevaAccion
End Sub
'
'Sub ModoEditar
'	ModoFicha="EDITAR"
'	lblModo.Text="Modo EDICION"
''	TextAreaAccionCompras.As(TextArea).Editable=True
'	TextAreaDescripcionIncidencia.As(TextArea).Editable=True
''	btnSelFechaIncidencia.Enabled=True
''	btnSelFechaAccionCompras.Enabled=True
''	btnSelDocumentoOrigen.Enabled=True
''	btnSelDocumentoProveedor.Enabled=True
''	btnSelFechaDocumentoProveedor.Enabled=True
''	btnSelProveedor.Enabled=True
''	btnSelUsuarioCompras.Enabled=True
''	btnSelUsuarioEmisor.Enabled=True
''	btnSelTipoDocumentoOrigen.Enabled=True
''	btnSelTipoDocumentoProveedor.Enabled=True
''	btnSelTipoIncidencia.Enabled=True
''	btnSelFechaCierreIncidencia.Enabled=True
''	btnSelGravedadIncidencia.Enabled=True
'	'btnMenuFichaIncidencia.Visible=False
'	lblMenuFichaIncidencia.Visible=False
'	btnGrabarNuevoEditarEstadoRevision.Visible=True
'	btnCancelarNuevoEditarIncidenciaProveedor.Visible=True
''	btnCopiarInfoLineasPedidoCompraADescripcionIncidencia.Visible=True
''	Wait For(ActualizarDatosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (success As Boolean)
''	If success=False Then
''		'SalirModulo
''		Return False
''	End If
''	If txtEstadoIncidencia.Text="ABIERTA" Then
''		AddItemCLVAccionesNuevaAccion
''	End If
''	Return True
'End Sub

'Sub ModoNuevo
'	ModoFicha="NUEVO"
'	lblModo.Text="Modo " & ModoFicha
'	frm.Title=Main.PrefijoTitleForms & "    Nueva Ficha Incidencia Proveedor "
''	TextAreaAccionCompras.As(TextArea).Editable=True
'	TextAreaDescripcionIncidencia.As(TextArea).Editable=True
''	btnSelFechaIncidencia.Enabled=True
''	btnSelFechaAccionCompras.Enabled=True
''	btnSelDocumentoOrigen.Enabled=True
''	btnSelDocumentoProveedor.Enabled=True
''	btnSelFechaDocumentoProveedor.Enabled=True
''	btnSelProveedor.Enabled=True
''	btnSelUsuarioCompras.Enabled=True
''	btnSelUsuarioEmisor.Enabled=True
''	btnSelTipoDocumentoOrigen.Enabled=True
''	btnSelTipoDocumentoProveedor.Enabled=True
''	btnSelTipoIncidencia.Enabled=True
''	btnSelFechaCierreIncidencia.Enabled=True
''	btnSelGravedadIncidencia.Enabled=True
'	'btnMenuFichaIncidencia.Visible=False
'	lblMenuFichaIncidencia.Visible=False
'	btnGrabarNuevoEditarEstadoRevision.Visible=True
'	btnCancelarNuevoEditarIncidenciaProveedor.Visible=True
'	'btnCopiarInfoLineasPedidoCompraADescripcionIncidencia.Visible=True
''	clvAccionesIncidencia.Clear
''	AddItemCLVAccionesNuevaAccion
'End Sub

Sub CambioAModoNuevo As ResumableSub
	
	jamLoadingIndicator1.MensajeLoading=$"Cambio a modo nueva incidencia..."$
	jamLoadingIndicator1.Show

''	DatosCabeceraIncidenciaProveedorTemp.Initialize
''	lstAccionesIncidenciaProveedorTemp.Initialize
''	lstFicherosAccionesIncidenciaTemp.Initialize

	'ModoNuevo
	ValoresInicialesNuevaIncidenciaProveedor ' por defecto, tipo Compra.
	MostrarPanelNuevaIncidencia
	MostrarDatosNuevaIncidencia(DatosCabeceraIncidenciaProveedorTemp)
	'wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor, lstAccionesIncidenciaProveedor)) complete (rObj As Object)
	
	jamLoadingIndicator1.Close
	Return True
End Sub

Sub MostrarPanelNuevaIncidencia
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundNuevancidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundNuevancidencia= xui.CreatePanel("BackgroundNuevancidencia")
	BackgroundNuevancidencia.Tag = "BackgroundNuevancidencia"
	BackgroundNuevancidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundNuevancidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseNuevaIncidencia=xui.CreatePanel("pnlBaseNuevaIncidencia")
	BaseNuevaIncidencia.SetLayoutAnimated(0,0,0,1000dip, 750dip)
	BaseNuevaIncidencia.LoadLayout("scrIncidenciasProveedorNuevaIncidencia")

	
	BackgroundNuevancidencia.AddView(BaseNuevaIncidencia,(BackgroundNuevancidencia.Width/2-BaseNuevaIncidencia.Width/2), _
		(BackgroundNuevancidencia.Height/2-BaseNuevaIncidencia.Height/2), BaseNuevaIncidencia.Width, BaseNuevaIncidencia.Height)
		
End Sub

Sub MostrarDatosNuevaIncidencia(DatosCabIncidenciaSel As TipoDatosCabeceraIncidenciaProveedor) As ResumableSub
'	frm.Title=Main.PrefijoTitleForms & "    Ficha Incidencia Proveedor " & IIf(DatosCabIncidenciaSel.IncidenciaProveedor="","",DatosCabIncidenciaSel.IncidenciaProveedor)
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	'txtNumeroIncidencia.Text=DatosCabIncidenciaSel.IncidenciaProveedor
	txtFechaNuevaIncidencia.Text=DateTime.Date(DatosCabIncidenciaSel.FechaIncidenciaLong)
	txtTipoOrigenNuevaIncidencia.Text=DatosCabIncidenciaSel.TipoOrigenIncidenciaProveedor
	txtUsuarioEmisorNuevaIncidencia.Text=DatosCabIncidenciaSel.NombreUsuarioEmisor
	txtDepartamentoCoordinadorNuevaIncidencia.Text=DatosCabIncidenciaSel.DepartamentoCoordinador
	'txtUsuarioCompras.Text=DatosCabIncidenciaSel.NombreUsuarioCompras
	'cboDepartamentoCoordinadorNuevaIncidencia.
	txtProveedorNuevaIncidencia.Text=DatosCabIncidenciaSel.Proveedor
	txtNombreProveedorNuevaIncidencia.Text=DatosCabIncidenciaSel.NombreProveedor
	txtTipoDocumentoProveedorNuevaIncidencia.Text=DatosCabIncidenciaSel.NombreTipoDocumento
	txtTipoDocumentoOrigenNuevaIncidencia.Text=DatosCabIncidenciaSel.NombreTipoDocumentoOrigen
	txtDocumentoProveedorNuevaIncidencia.Text=DatosCabIncidenciaSel.DocumentoProveedor
	txtFechaDocumentoProveedorNuevaIncidencia.Text=IIf(0<DatosCabIncidenciaSel.FechaDocumentoProveedorLong,DateTime.Date(DatosCabIncidenciaSel.FechaDocumentoProveedorLong),"")
	txtDocumentoOrigenProveedorNuevaIncidencia.Text=DatosCabIncidenciaSel.DocumentoOrigen
	
'	If TextAreaDescripcionNuevaIncidencia.StyleClasses.IndexOf("text-area")>-1 Then
'		TextAreaDescripcionNuevaIncidencia.StyleClasses.RemoveAt(TextAreaDescripcionNuevaIncidencia.StyleClasses.IndexOf("text-area"))
'	End If
'	TextAreaDescripcionNuevaIncidencia.StyleClasses.Add("TextArea0Padding")
	
	TextAreaDescripcionNuevaIncidencia.Text=DatosCabIncidenciaSel.DescripcionIncidencia
	
	txtFechaAccionInicialNuevaIncidencia.Text=DateTime.Date(DateTime.Now)
	
'	Dim JOContentTextArea As JavaObject=TextAreaDescripcionNuevaIncidencia.As(JavaObject).RunMethodJO("lookup",Array(".content"))
'	JOContentTextArea.RunMethod("setStyle",Array("-fx-background-color: green;"))
	
'	If TextAreaDescripcionAccionInicialNuevaIncidencia.StyleClasses.IndexOf("text-area")>-1 Then
'		TextAreaDescripcionAccionInicialNuevaIncidencia.StyleClasses.RemoveAt(TextAreaDescripcionAccionInicialNuevaIncidencia.StyleClasses.IndexOf("text-area"))
'	End If
'	TextAreaDescripcionAccionInicialNuevaIncidencia.StyleClasses.Add("TextArea0Padding")
	
	'txtTiponuevaIncidencia.Text=DatosCabIncidenciaSel.NombreTipoIncidencia
	'txtGravedadIncidencia.text=DatosCabIncidenciaSel.GravedadIncidencia
	'txtFechaCierreIncidencia.Text=IIf(0<DatosCabIncidenciaSel.FechaCierreLong, DateTime.Date(DatosCabIncidenciaSel.FechaCierreLong),"")
	'txtUsuarioCierreIncidencia.Text=DatosCabIncidenciaSel.NombreUsuarioCierre
	
'	btnGrabarNuevoEditarEstadoRevision.Visible=Not(ModoFicha="VER")
'	btnCancelarNuevoEditarIncidenciaProveedor.Visible=Not(ModoFicha="VER")
	

	
'	clvAccionesIncidencia.Clear
'	If DatosCabIncidenciaSel.MigracionAccess Then
'		If DatosCabIncidenciaSel.AccionCompras<>"" Then
'			TextAreaAccionCompras.Text=DatosCabIncidenciaSel.AccionCompras
'			txtUsuarioAccionCompras.Text=DatosCabIncidenciaSel.NombreUsuarioAccionCompras
'			txtFechaAccionCompras.Text=IIf(0<DatosCabIncidenciaSel.FechaAccionComprasLong,DateTime.Date(DatosCabIncidenciaSel.FechaAccionComprasLong),"")
	''			Dim mDataAccion As Map
	''			mDataAccion.Initialize
	''			mDataAccion.put("IDLineaAccion",-1)
	''			mDataAccion.put("FechaLineaAccionLong",mData.Get("FechaAccionComprasLong"))
	''			mDataAccion.put("UsuarioCreacionLineaAccion",mData.Get("NombreUsuarioAccionCompras"))
	''			mDataAccion.put("AccionCierraIncidencia",IIf(EstadoIncidencia="CERRADA",1,0))
	''			mDataAccion.put("DescripcionAccion",mData.Get("AccionCompras"))
	''			mDataAccion.put("DepartamentoAsignadoAccion","")
	''			AddItemCLVAccionesAccion(mDataAccion)
'			
'			Dim DataAccion As TipoDatosAccionIncidencia
'			DataAccion.Initialize
'			DataAccion.IDLineaAccion=-1
'			DataAccion.FechaLineaAccionLong=DatosCabIncidenciaSel.FechaAccionComprasLong
'			DataAccion.UsuarioCreacionLineaAccion=DatosCabIncidenciaSel.NombreUsuarioAccionCompras
'			DataAccion.AccionCierraIncidencia=IIf(DatosCabIncidenciaSel.EstadoIncidencia="CERRADA",1,0)
'			DataAccion.DescripcionAccion=DatosCabIncidenciaSel.AccionCompras
'			DataAccion.DepartamentoAsignadoAccion=""
'			AddItemCLVAccionesAccion(DataAccion)
'		Else
'			' incidencia grabada desde access sin accion de compras
'		
'		End If
'	Else
'	Dim IncidenciaSelCerrada As Boolean
'	For Each AccionIncidencia As TipoDatosAccionIncidencia In lstAccionesIncidenciaSel
'		wait for(AddItemCLVAccionesAccion(AccionIncidencia))  complete (rObj As Object)
'		Sleep(10)
'		If AccionIncidencia.AccionCierraIncidencia=1 Then
'			IncidenciaSelCerrada=True
'		End If
'	Next
'		
'	If IncidenciaSelCerrada Then
'		DatosCabIncidenciaSel.EstadoIncidencia="CERRADA"
'	Else
'		DatosCabIncidenciaSel.EstadoIncidencia="ABIERTA"
'	End If
		
'	txtEstadoIncidencia.Text=DatosCabIncidenciaSel.EstadoIncidencia
'	txtEstadoIncidencia.SetTextAlignment("CENTER","CENTER")
'	If DatosCabIncidenciaSel.EstadoIncidencia="CERRADA" Then
'		txtEstadoIncidencia.Color=xui.Color_Green
'		txtEstadoIncidencia.TextColor=xui.Color_Black
'		'CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","bold")
'		Dim JOtxtSt As JavaObject=txtEstadoIncidencia.As(TextField)
'		Dim JOStyle As JavaObject=JOtxtSt.RunMethodJO("getStyleClass",Null)
'		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;-fx-text-fill:springgreen;"))
'		pnlFondoDatosCierreIncidencia.Visible=True
'	Else
'		txtEstadoIncidencia.Color=xui.Color_Red
'		txtEstadoIncidencia.TextColor=xui.Color_White
'		'CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","normal")
'		Dim JOtxtSt As JavaObject=txtEstadoIncidencia.As(TextField)
'		Dim JOStyle As JavaObject=JOtxtSt.RunMethodJO("getStyleClass",Null)
'		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;-fx-text-fill:red;"))
'		pnlFondoDatosCierreIncidencia.Visible=False
'	End If

		
'	End If
	
'	If ModoFicha<>"VER" And DatosCabIncidenciaSel.EstadoIncidencia="ABIERTA" Then
'		AddItemCLVAccionesNuevaAccion
'	End If
'	
'	If ModoFicha="VER" Then
'		EliminarItemCLVAccionesNuevaAccion
'	End If
	
	'jamLoadingIndicator1.Close
	DateTime.DateFormat=DateFormatAnt

	Return Null
End Sub
	

Private Sub btnSelTipoOrigenIncidenciaProveedor_Click
	
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
'	
	Dialog.Title="Selecciona Tipo Origen de la Incidencia"
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
		
	Dim lstOpciones As List=Array As String("Compra","Servicio")
	
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
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim TipoOrigenIncidencia As String=B4XListDlg.SelectedItem
	txtTipoOrigenIncidencia.Text=TipoOrigenIncidencia
	
	Select Case TipoOrigenIncidencia
		
		Case "Compra"
			txtTipoDocumentoProveedor.Text="Albarán Compra"
			txtTipoDocumentoOrigen.Text="Pedido Compra"
		Case "Servicio"
			txtTipoDocumentoProveedor.Text="Albarán Servicio"
			txtTipoDocumentoOrigen.Text="Pedido Servicio"
	End Select
	
	Wait For(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtTipoOrigenIncidencia.Text=DatosCabeceraIncidenciaProveedor.TipoOrigenIncidenciaProveedor
		txtTipoDocumentoProveedor.Text=DatosCabeceraIncidenciaProveedor.NombreTipoDocumento
		txtTipoDocumentoOrigen.Text=DatosCabeceraIncidenciaProveedor.NombreTipoDocumentoOrigen
	Else
		DatosCabeceraIncidenciaProveedor.TipoOrigenIncidenciaProveedor=TipoOrigenIncidencia
		DatosCabeceraIncidenciaProveedor.IDTipoDocumento=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?",Array As String(txtTipoDocumentoProveedor.Text))
		DatosCabeceraIncidenciaProveedor.NombreTipoDocumento=txtTipoDocumentoProveedor.Text
		DatosCabeceraIncidenciaProveedor.IdTipoDocumentoOrigen=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?",Array As String(txtTipoDocumentoOrigen.Text))
		DatosCabeceraIncidenciaProveedor.nombreTipoDocumentoOrigen=txtTipoDocumentoOrigen.Text
	End If
End Sub


Private Sub btnSelUsuarioEmisor_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
End Sub

Private Sub btnSelUsuarioCompras_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
End Sub

Private Sub btnSelTipoDocumentoProveedor_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	jamLoadingIndicator1.MensajeLoading="Cargando tipos de documento..."
	jamLoadingIndicator1.Show
	Wait For(CargaIncidenciasProveedorTiposDocumentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	Dim sTipoDocProvActual As String=txtTipoDocumentoProveedor.Text
	
	Dialog.Title="Selecciona Tipo Documento"
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
		
	Dim lstOpciones As List
	lstOpciones.Initialize
	
	Dim rs As ResultSet=mSQL.ExecQuery2("select NombreTipoDocumento from tblIncidenciasProveedorTiposDocumentos where DocumentoTipoOrigen=?",Array As String(0))
	Do While rs.NextRow
		lstOpciones.Add(rs.GetString("NombreTipoDocumento"))
	Loop
	rs.Close
	
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
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim NombreTipoDocumentoSel As String=B4XListDlg.SelectedItem
	txtTipoDocumentoProveedor.Text=NombreTipoDocumentoSel
	Dim IDTipoDocumentoSel As Int=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?",Array As String(NombreTipoDocumentoSel))
	Dim IDTipoDocumentoOrigenAsociadoSel As Int=mSQL.ExecQuerySingleResult2("select IDTipoDocumentoOrigenAsociado from tblIncidenciasProveedorTiposDocumentos where IDTipoDocumento=?",Array As String(IDTipoDocumentoSel))
	Dim NombreTipoDocumentoOrigenAsociadoSel As String=mSQL.ExecQuerySingleResult2("select NombreTipoDocumento from tblIncidenciasProveedorTiposDocumentos where IDTipoDocumento=?",Array As String(IDTipoDocumentoOrigenAsociadoSel))
	txtTipoDocumentoOrigen.Text=NombreTipoDocumentoOrigenAsociadoSel
End Sub

Private Sub btnSelTipoDocumentoOrigen_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	If DatosCabeceraIncidenciaProveedor.IDTipoDocumento=0 Then
		Dim msa As Object=xui.MsgboxAsync("Selecciona antes el tipo de doccumento","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	

End Sub

Private Sub btnSelProveedor_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If

	Dim ProveedorAct As String=DatosCabeceraIncidenciaProveedor.Proveedor
	Dim NombreProveedorAct As String=DatosCabeceraIncidenciaProveedor.NombreProveedor
	Dim cSelProvNAV As cSeleccionProveedorNAV
	cSelProvNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
	wait for cSeleccionProveedorNAV_Done (mSelProvNAV As Map)
	Dim ProveedorSel As String=mSelProvNAV.Get("Proveedor")
	Dim NombreProveedorSel As String=mSelProvNAV.Get("NombreProveedor")
	If ProveedorSel="" Then Return
	txtProveedor.Text=ProveedorSel
	txtNombreProveedor.Text=NombreProveedorSel

	wait for(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtProveedor.Text=ProveedorAct
		txtNombreProveedor.Text=NombreProveedorAct
	Else
		DatosCabeceraIncidenciaProveedor.Proveedor=ProveedorSel
		DatosCabeceraIncidenciaProveedor.NombreProveedor=NombreProveedorSel
	End If
End Sub

Private Sub btnSelFechaIncidencia_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	Dim SFechaIncidenciaActual As String=txtFechaIncidencia.Text
	Dialog.Title="Indica Fecha Incidencia"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If SFechaIncidenciaActual="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(SFechaIncidenciaActual)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		 Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaIncidencia.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
	wait for(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtFechaIncidencia.Text=SFechaIncidenciaActual
	Else
		DatosCabeceraIncidenciaProveedor.FechaIncidenciaLong=NuevaFecha
	End If
End Sub

'Private Sub btnSelDescripcionIncidencia_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		ModoEditar
'	End If
'	
'	Dim DialogTitleBarHeightAnt As Int=Dialog.TitleBarHeight
'	Dialog.TitleBarHeight=60dip
'	Dialog.Title=$"Indica Descripción detallada de la incidencia."$
'	
'	Dim pBaseTextArea As B4XView = xui.CreatePanel("")
'	pBaseTextArea.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)
'	pBaseTextArea.LoadLayout("scrDialogTextArea")
'	
'	
'	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseTextArea, "OK", "", "Cancelar")
'	TextAreaDialog.RequestFocus
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'
'	bCancel.Left=bCancel.Left-25dip
'	bCancel.Width=bCancel.Width+25dip
'	bCancel.TextSize=15
'	
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
'
'	Wait For (rSub) Complete (rInt As Int)
'	Dialog.TitleBarHeight=DialogTitleBarHeightAnt
'	If rInt <> xui.DialogResponse_Positive Then Return
'	
'	TextAreaDescripcionIncidencia.Text=TextAreaDialog.Text
'End Sub

'Private Sub btnSelAccionesIncidencia_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		ModoEditar
'	End If
'End Sub

Private Sub btnSelFechaDocumentoProveedor_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	Dim sFechaDocProvAct As String=txtFechaDocumentoProveedor.Text
	Dialog.Title="Indica Fecha Documento Proveedor"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If sFechaDocProvAct="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(sFechaDocProvAct)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaDocumentoProveedor.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
	
	wait for(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtFechaDocumentoProveedor.Text=sFechaDocProvAct
	Else
		DatosCabeceraIncidenciaProveedor.FechaDocumentoProveedorLong=NuevaFecha
	End If
	
End Sub

Private Sub btnSelFechaCierreIncidencia_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	Dialog.Title="Indica Fecha Cierre Incidencia"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaCierreIncidencia.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaCierreIncidencia.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaCierreIncidencia.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSelDocumentoProveedor_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
'	
	If txtTipoDocumentoProveedor.Text="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario indicar antes el tipo de documento.")) complete (rObj As Object)
		Return
	End If
	
	Dim sDocumentoProveedorAct As String=DatosCabeceraIncidenciaProveedor.DocumentoProveedor
	
	Dialog.Title="Indica Documento Proveedor"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=sDocumentoProveedorAct
	'InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoDocumentoProveedor As String=InputDlg.Text
	txtDocumentoProveedor.Text=NuevoDocumentoProveedor
	
	wait for(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtDocumentoProveedor.Text=sDocumentoProveedorAct
	Else
		DatosCabeceraIncidenciaProveedor.DocumentoProveedor=NuevoDocumentoProveedor
	End If
End Sub

Private Sub btnSelDocumentoOrigen_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then 
'			'SalirModulo
'			Return
'		End If
'	End If

	Dim sDocumentoOrigenAct As String=DatosCabeceraIncidenciaProveedor.DocumentoOrigen
	
	Dialog.Title="Indica Documento Origen"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=sDocumentoOrigenAct
	'InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoDocumentoOrigen As String=InputDlg.Text.ToUpperCase
	
	
	If txtTipoDocumentoOrigen.Text="Pedido Compra" Then
		If NuevoDocumentoOrigen.StartsWith("PC")=False Then
			Dim msa As Object=xui.MsgboxAsync("El documento origen para tipo documento origen=Pedido Compra debe empezar por PC","Aviso")
			Wait For (msa) Msgbox_Result
			Return
		End If
		jamLoadingIndicator1.MensajeLoading="Cargando info pedido compra..."
		jamLoadingIndicator1.Show
		Wait For(CargaDatosPedidoCompra(NuevoDocumentoOrigen)) complete (mRes As Map)
		Dim Accion As String=mRes.Get("Accion")
		If Accion="NOK" Then
			jamLoadingIndicator1.Close
			Return
		End If
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mDataPC As Map=lstReg.Get(0)
		Dim ProveedorPC As String=mDataPC.Get("PO")
		Dim NombreProveedorPC As String=mDataPC.Get("NPO")
		If txtProveedor.Text<>"" And txtProveedor.Text<>ProveedorPC Then
			jamLoadingIndicator1.close
			Dim msa As Object=xui.MsgboxAsync($"El proveedor del pedido de compra (${ProveedorPC}) NO coincide con el proveedor indicado para la incidencia (${txtProveedor.Text}).
Revisar datos."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Return
		End If
		If txtProveedor.Text="" Then 
			txtProveedor.Text=ProveedorPC
			txtNombreProveedor.Text=NombreProveedorPC
		End If
		jamLoadingIndicator1.Close
	End If
	txtDocumentoOrigenProveedor.Text=NuevoDocumentoOrigen.ToUpperCase
	
	wait for(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtDocumentoOrigenProveedor.Text=sDocumentoOrigenAct
	Else
		DatosCabeceraIncidenciaProveedor.DocumentoOrigen=NuevoDocumentoOrigen.ToUpperCase
	End If
	
End Sub

'Private Sub btnMenuFichaIncidencia_Click
'	CargaTreeViewDrawer
'	Drawer.LeftOpen=True
'End Sub

''Sub CambioAModoEditar As ResumableSub
''	If DatosCabeceraIncidenciaProveedor.MigracionAccess And DatosCabeceraIncidenciaProveedor.EstadoIncidencia="CERRADA" Then
''		Dim msa As Object=xui.MsgboxAsync("No es posible editar incidencias CERRADAS que provengan del Access de incidencias","Aviso")
''		Wait For (msa) Msgbox_Result
''		Return False
''	End If
''	jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}..."$
''	jamLoadingIndicator1.Show
''	Wait For(CargaDatosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (Success As Boolean)
''	If Success=False Then
''		jamLoadingIndicator1.Close
''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible cargar los datos de la incidencia","Aviso")
''		Wait For (msa) Msgbox_Result
''		Return False
''	End If
''	
''	DatosCabeceraIncidenciaProveedorTemp.Initialize
''	DatosCabeceraIncidenciaProveedorTemp=CopyObject(DatosCabeceraIncidenciaProveedor)
''	lstAccionesIncidenciaProveedorTemp.Initialize
''	lstAccionesIncidenciaProveedorTemp=CopyObject(lstAccionesIncidenciaProveedor)
'''	lstFicherosAccionesIncidenciaTemp.Initialize
'''	lstFicherosAccionesIncidenciaTemp=CopyObject(lstFicherosAccionesIncidencia)
''	
''	ModoEditar
''	wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedorTemp, lstAccionesIncidenciaProveedorTemp)) complete (rObj As Object)
''	
''	jamLoadingIndicator1.Close
''	Return True
''End Sub

Private Sub btnGrabarNuevoEditarIncidenciaProveedor_Click

	jamLoadingIndicator1.MensajeLoading="Registrando datos incidencia..."
	jamLoadingIndicator1.Show
		
	Dim lstComandos As List
	lstComandos.Initialize
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasAccionIncidenciaBatchDispositivoUsuario", _
			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
	lstComandos.Add(cmd)
	
'	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasFicheroAdjuntoAccionIncidenciaBatchDispositivoUsuario", _
'			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
'	lstComandos.Add(cmd)
'	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar las tablas batch de incidencias proveedor dispositivo-usuario.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

	Dim UUIDSel As String=Utilidades.GenerarUUIDv4
	
	Dim lstComandos As List
	lstComandos.Initialize

	For Each DatosAccion As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedor
		
		If DatosAccion.TipoCambio="" Then Continue

		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaAccionIncidenciaBatch", _
			Array(DateTime.Now, UUIDSel, Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows, _
			DatosAccion.IDLineaAccion, DatosAccion.IDLineaAccionTemp, DatosAccion.IDIncidencia, DatosAccion.TipoCambio, _
			DateTime.Now,Main.DatosUsuario.NombreUsuarioWindows,DatosAccion.AccionCierraIncidencia,DatosAccion.DescripcionAccion, _
			DatosAccion.DepartamentoAsignadoAccion, 0))
		lstComandos.Add(cmd)
	Next
	
'	For Each DatosFicheroAccion As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
'		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaFicheroAdjuntoAccionIncidenciaBatch", _
'			Array(DateTime.Now, UUIDSel,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,DatosFicheroAccion.IDIncidencia, _
'			DatosFicheroAccion.IDLineaAccion, DatosFicheroAccion.IDLineaAcciontemp,DatosFicheroAccion.LinkFichero))
'		lstComandos.Add(cmd)
'	Next

	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar las líneas Batch de la incidencia.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	' EJECUTAR SP QUE ACTUALICE/CREE LA NUEVA INCIDENCIA
	
	Dim lstComandos As List
	lstComandos.Initialize
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasAccionIncidenciaBatchUUID", _
			Array(UUIDSel))
	lstComandos.Add(cmd)
	
'	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasFicheroAdjuntoAccionIncidenciaBatchUUID", _
'			Array(UUIDSel))
'	lstComandos.Add(cmd)
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	' no importa demasiado si no se consiguen eliminar ... es sólo para liberar espacio en tabla ...
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible eliminar las líneas Batch del UUID ${UUIDSel}."$,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	DatosCabeceraIncidenciaProveedor.Initialize
	lstAccionesIncidenciaProveedor.Initialize
'	lstFicherosAccionesIncidenciaTemp.Initialize

'	jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}..."$
'	jamLoadingIndicator1.Show
'	Wait For(CargaDatosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (Success As Boolean)
'	If Success=False Then
'		jamLoadingIndicator1.Close
'		SalirModulo
'		Return
'	End If
'	wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor,lstAccionesIncidenciaProveedor)) complete (rObj As Object)
'	jamLoadingIndicator1.Close

	CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor,DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)

	jamLoadingIndicator1.close

	
End Sub

'Sub CargaDatosIncidenciaProvisional
'	
'	jamLoadingIndicator1.MensajeLoading="..."
'	jamLoadingIndicator1.Show
'	Wait For(CargaTiposIncidenciasProveedor) complete (mRes As Map)
'
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then 
'		jamLoadingIndicator1.Close
'		Return
'	End If
'	
'	jamLoadingIndicator1.MensajeLoading="Cargando tipos de documento..."
'	jamLoadingIndicator1.Show
'	Wait For(CargaIncidenciasProveedorTiposDocumentos) complete (mRes As Map)
'
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		 Return
'	End If
'	
'	
'	
'	DatosCabeceraIncidenciaProveedorProvisional.Initialize
'	If ModoFicha="EDITAR" Then
'		DatosCabeceraIncidenciaProveedorProvisional.IDIncidenciaProveedor=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
'		DatosCabeceraIncidenciaProveedorProvisional.IncidenciaProveedor=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
'		DatosCabeceraIncidenciaProveedorProvisional.MigracionAccess=DatosCabeceraIncidenciaProveedor.MigracionAccess
'		DatosCabeceraIncidenciaProveedorProvisional.TipoOrigenIncidenciaProveedor=DatosCabeceraIncidenciaProveedor.TipoOrigenIncidenciaProveedor
'		DatosCabeceraIncidenciaProveedorProvisional.IDUsuarioEmisor=DatosCabeceraIncidenciaProveedor.IDUsuarioEmisor
'		DatosCabeceraIncidenciaProveedorProvisional.IDUsuarioCompras=DatosCabeceraIncidenciaProveedor.IDUsuarioCompras
'		DatosCabeceraIncidenciaProveedorProvisional.OrigenIncidencia=DatosCabeceraIncidenciaProveedor.OrigenIncidencia
'	End If
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	DatosCabeceraIncidenciaProveedorProvisional.FechaIncidenciaLong=DateTime.DateParse(txtFechaIncidencia.Text)
'	DatosCabeceraIncidenciaProveedorProvisional.Proveedor=txtProveedor.Text
'	DatosCabeceraIncidenciaProveedorProvisional.NombreProveedor=txtNombreProveedor.Text
'	DatosCabeceraIncidenciaProveedorProvisional.IDTipoDocumento=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?", _
'		Array As String(txtTipoDocumentoProveedor.Text))
'	DatosCabeceraIncidenciaProveedorProvisional.DocumentoProveedor=txtDocumentoProveedor.Text
'	DatosCabeceraIncidenciaProveedorProvisional.FechaDocumentoProveedorLong=DateTime.DateParse(txtFechaDocumentoProveedor.Text)
'	DatosCabeceraIncidenciaProveedorProvisional.IDTipoDocumentoOrigen=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?", _
'		Array As String(txtTipoDocumentoOrigen.Text))
'	DatosCabeceraIncidenciaProveedorProvisional.DocumentoOrigen=txtDocumentoOrigenProveedor.Text
'	DatosCabeceraIncidenciaProveedorProvisional.DescripcionIncidencia=TextAreaDescripcionIncidencia.Text
'	DatosCabeceraIncidenciaProveedorProvisional.IDTipoIncidencia=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select IDTipoIncidencia from tblIncidenciasProveedorTiposIncidencias where NombreTipoIncidencia=?", _
'		Array As String(txtTipoIncidencia.Text)))
'''	DatosCabeceraIncidenciaProveedorProvisional.AccionCompras
'	DatosCabeceraIncidenciaProveedorProvisional.FechaAccionComprasLong=DateTime.DateParse(txtFechaAccionCompras.Text)
'''	DatosCabeceraIncidenciaProveedorProvisional.IDUsuarioAccionCompras
'	DatosCabeceraIncidenciaProveedorProvisional.NombreUsuarioAccionCompras=txtUsuarioAccionCompras.Text
'	DatosCabeceraIncidenciaProveedorProvisional.FechaCierreLong=DateTime.DateParse(txtFechaCierreIncidencia.Text)
'''	DatosCabeceraIncidenciaProveedorProvisional.IDUsuarioCierre
'	DatosCabeceraIncidenciaProveedorProvisional.NombreUsuarioCierre=txtUsuarioCierreIncidencia.Text
'	DatosCabeceraIncidenciaProveedorProvisional.GravedadIncidencia=txtGravedadIncidencia.Text
'	DatosCabeceraIncidenciaProveedorProvisional.Anulada=False  ' ...si está anulada, no aparecerá aquí
'	
'	
'	Dim lstAccionesIncidenciaProveedorProvisional As List
'	lstAccionesIncidenciaProveedorProvisional.Initialize
'	For iDx=0 To clvAccionesIncidencia.Size-1
'		Dim AccInc As TipoDatosAccionIncidencia=clvAccionesIncidencia.GetValue(iDx)
'		lstAccionesIncidenciaProveedorProvisional.Add(AccInc)
'	Next
'	
'
'	DateTime.DateFormat=DateFormatAnt
'	
'	jamLoadingIndicator1.Close
'End Sub

Private Sub btnCancelarNuevoEditarIncidenciaProveedor_Click
	
	Dim msa As Object = xui.Msgbox2Async($"¿Cancelar la grabación de la incidencia?
Se perderán los datos no guardados."$,"Confirma", "Sí","Cancelar", "", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim IDIncSel As Int
	Dim IncSel As String
	Select True
		
		Case DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior=0  ' nuevo desde lista
			Wait For(BorrarTablasBatchDispositivoUsuario) complete (Success As Boolean)

			SalirModulo
			Return
			
		Case DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior>0 ' nuevo desde otra Ficha
'			DatosCabeceraIncidenciaProveedor.Initialize
'			DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=IDIncidenciaProveedorAnterior
'			IDIncidenciaProveedorAnterior=0
'			IncidenciaProveedorAnterior=""
			IDIncSel=IDIncidenciaProveedorAnterior
			IncSel=IncidenciaProveedorAnterior
			
		Case Else ' estaremos editando una ficha. mantenenemos DatosCabeceraIncidendiaProveedor
			IDIncSel=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
			IncSel=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
			
	End Select
	
''	If DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior=0 Then  ' nuevo desde lista
''		SalirModulo
''		Return
''	End If
'''	If DatosCabeceraIncidenciaProveedor.IncidenciaProveedor=Null Or DatosCabeceraIncidenciaProveedor.IncidenciaProveedor="" Then
'''		SalirModulo
'''		Return
'''	End If
''	If DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior>0 Then ' nuevo desde otra Ficha
''		DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=IDIncidenciaProveedorAnterior
''		IDIncidenciaProveedorAnterior=0
''	End If



	'ModoVer(IDIncSel,IncSel)
'	ModoVer
'	jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${IncSel}..."$
'	jamLoadingIndicator1.Show
'	Wait For(CargaDatosIncidencia(IDIncSel, IncSel)) complete (success As Boolean)
'	If success=False Then
'		jamLoadingIndicator1.Close
'		SalirModulo
'		Return
'	End If
'	MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor,lstAccionesIncidencia)
'	jamLoadingIndicator1.Close

	CambioAModoVer(IDIncSel,IncSel)
End Sub

Sub CambioAModoVer(IDIncSel As Int, IncSel As String)
	ModoVer
	jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${IncSel}..."$
	jamLoadingIndicator1.Show
	Wait For(CargaDatosIncidencia(IDIncSel, IncSel)) complete (success As Boolean)
	If success=False Then
		Wait For(BorrarTablasBatchDispositivoUsuario) complete (success As Boolean)
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If
	wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor,lstAccionesIncidenciaProveedor)) complete (rObj As Object)
	jamLoadingIndicator1.Close
	pnlFondoIncidenciaProveedorFicha.RequestFocus
End Sub



Sub ValoresInicialesNuevaIncidenciaProveedor
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	txtFechaIncidencia.Text=DateTime.Date(DateTime.Now)
'	DateTime.DateFormat=DateFormatAnt
'	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumento=2 ' Albaran Proveedor
'	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumentoOrigen=1 ' Pedido Compra
'	txtTipoDocumentoProveedor.Text="Albarán Compra"
'	txtTipoDocumentoOrigen.Text="Pedido Compra"
'	txtGravedadIncidencia.text="LEVE"

	DatosCabeceraIncidenciaProveedorTemp.Initialize
	DatosCabeceraIncidenciaProveedorTemp.NombreUsuarioEmisor=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
	DatosCabeceraIncidenciaProveedorTemp.DepartamentoCoordinador="COMPRAS"
	DatosCabeceraIncidenciaProveedorTemp.FechaIncidenciaLong=DateTime.Now
	DatosCabeceraIncidenciaProveedorTemp.TipoOrigenIncidenciaProveedor="Compra"
	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumento=2 ' Albaran Compra
	DatosCabeceraIncidenciaProveedorTemp.NombreTipoDocumento="Albarán Compra"
	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumentoOrigen=1 ' Pedido Compra
	DatosCabeceraIncidenciaProveedorTemp.NombreTipoDocumentoOrigen="Pedido Compra"
	DatosCabeceraIncidenciaProveedorTemp.GravedadIncidencia="LEVE"
End Sub

Sub ValoresInicialesNuevaIncidenciaAcreedor
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	txtFechaIncidencia.Text=DateTime.Date(DateTime.Now)
'	DateTime.DateFormat=DateFormatAnt
'	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumento=4 ' Albaran servicio
'	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumentoOrigen=3 ' Pedido Servicio
'	txtTipoDocumentoProveedor.Text="Albarán Servicio"
'	txtTipoDocumentoOrigen.Text=""
'	txtGravedadIncidencia.text="LEVE"
	DatosCabeceraIncidenciaProveedorTemp.Initialize
	DatosCabeceraIncidenciaProveedorTemp.NombreUsuarioEmisor=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
	DatosCabeceraIncidenciaProveedorTemp.FechaIncidenciaLong=DateTime.Now
	DatosCabeceraIncidenciaProveedorTemp.TipoOrigenIncidenciaProveedor="Servicio"
	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumento=4 ' Albaran servicio
	DatosCabeceraIncidenciaProveedorTemp.NombreTipoDocumento="Albarán Servicio"
	DatosCabeceraIncidenciaProveedorTemp.IDTipoDocumentoOrigen=3 ' Pedido Servicio
	DatosCabeceraIncidenciaProveedorTemp.NombreTipoDocumentoOrigen="Pedido Servicio"
	DatosCabeceraIncidenciaProveedorTemp.GravedadIncidencia="LEVE"
End Sub

'Sub ActualizarDatosIncidencia(IDIncidenciaSel As Int, IncidenciaSel As String) As ResumableSub
'
'	Wait For(CargaDatosIncidencia(IDIncidenciaSel, IncidenciaSel)) complete (Success As Boolean)
'	Return Success
'	
'End Sub

Sub CargaDatosIncidencia(IDIncidenciaSel As Int, IncidenciaSel As String) As ResumableSub
	

	Wait For(CargaDatosCabeceraIncidencia(IDIncidenciaSel,IncidenciaSel)) complete (mRes As Map)
	Dim accion As String=mRes.Get("Accion")
	If accion="NOK" Then
		jamLoadingIndicator1.Close
		 Return False
	End If
	
'	MigracionAccess,IncidenciaProveedor,TipoOrigenIncidenciaProveedor,IDUsuarioEmisor,IDUsuarioCompras,FechaIncidenciaLong,
'	Proveedor,NombreProveedor,OrigenIncidencia,IDTipoDocumento,DocumentoProveedor,FechaDocumentoProveedorLong,
'	IDTipoDocumentoOrigen,DocumentoOrigen,DescripcionIncidencia,IDTipoIncidencia,
'	AccionCompras,FechaAccionComprasLong,IDUsuarioAccionCompras,UsuarioAccionCompras,
'	FechaCierreLong,IDUsuarioCierre,UsuarioCierre,GravedadIncidencia,Anulada
	
	Dim mData0 As Map=mRes.Get("mData0")
	DatosCabeceraIncidenciaProveedor.Initialize
	lstAccionesIncidenciaProveedor.Initialize
	'lstFicherosAccionesIncidencia.Initialize
	lstFicherosAdjuntosIncidencia.Initialize
	
	DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=mData0.Get("IDIncidenciaProveedor")
	DatosCabeceraIncidenciaProveedor.IncidenciaProveedor=mData0.Get("IncidenciaProveedor")
	DatosCabeceraIncidenciaProveedor.MigracionAccess=mData0.Get("MigracionAccess")
	DatosCabeceraIncidenciaProveedor.TipoOrigenIncidenciaProveedor=mData0.Get("TipoOrigenIncidenciaProveedor")
	DatosCabeceraIncidenciaProveedor.IDUsuarioEmisor=mData0.Get("IDUsuarioEmisor")
	DatosCabeceraIncidenciaProveedor.NombreUsuarioEmisor=mData0.Get("NombreUsuarioEmisor")
	DatosCabeceraIncidenciaProveedor.IDUsuarioCompras=mData0.Get("IDUsuarioCompras")
	DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador=mData0.Get("DepartamentoCoordinador")
	DatosCabeceraIncidenciaProveedor.NombreUsuarioCompras=mData0.Get("NombreUsuarioCompras")
	DatosCabeceraIncidenciaProveedor.FechaIncidenciaLong=mData0.Get("FechaIncidenciaLong")
	DatosCabeceraIncidenciaProveedor.Proveedor=mData0.Get("Proveedor")
	DatosCabeceraIncidenciaProveedor.NombreProveedor=mData0.Get("NombreProveedor")
	DatosCabeceraIncidenciaProveedor.OrigenIncidencia=mData0.Get("OrigenIncidencia")
	DatosCabeceraIncidenciaProveedor.IDTipoDocumento=mData0.Get("IDTipoDocumento")
	DatosCabeceraIncidenciaProveedor.NombreTipoDocumento=mData0.Get("NombreTipoDocumento")
	DatosCabeceraIncidenciaProveedor.DocumentoProveedor=mData0.Get("DocumentoProveedor")
	DatosCabeceraIncidenciaProveedor.FechaDocumentoProveedorLong=mData0.Get("FechaDocumentoProveedorLong")
	DatosCabeceraIncidenciaProveedor.IDTipoDocumentoOrigen=mData0.Get("IDTipoDocumentoOrigen")
	DatosCabeceraIncidenciaProveedor.NombreTipoDocumentoOrigen=mData0.Get("NombreTipoDocumentoOrigen")
	DatosCabeceraIncidenciaProveedor.DocumentoOrigen=mData0.Get("DocumentoOrigen")
	DatosCabeceraIncidenciaProveedor.DescripcionIncidencia=mData0.Get("DescripcionIncidencia")
	DatosCabeceraIncidenciaProveedor.IDTipoIncidencia=mData0.Get("IDTipoIncidencia")
	DatosCabeceraIncidenciaProveedor.NombreTipoIncidencia=mData0.Get("NombreTipoIncidencia")
	DatosCabeceraIncidenciaProveedor.AccionCompras=mData0.Get("AccionCompras")
	DatosCabeceraIncidenciaProveedor.FechaAccionComprasLong=mData0.Get("FechaAccionComprasLong")
	DatosCabeceraIncidenciaProveedor.IDUsuarioAccionCompras=mData0.Get("IDUsuarioAccionCompras")
	DatosCabeceraIncidenciaProveedor.NombreUsuarioAccionCompras=mData0.Get("NombreUsuarioAccionCompras")
	DatosCabeceraIncidenciaProveedor.FechaCierreLong=mData0.Get("FechaCierreLong")
	DatosCabeceraIncidenciaProveedor.IDUsuarioCierre=mData0.Get("IDUsuarioCierre")
	DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre=mData0.Get("UsuarioCierre")
	DatosCabeceraIncidenciaProveedor.GravedadIncidencia=mData0.Get("GravedadIncidencia")
	DatosCabeceraIncidenciaProveedor.ResponsabilidadInterna=mData0.Get("ResponsabilidadInterna")
	DatosCabeceraIncidenciaProveedor.ResponsableCausaIncidencia=mData0.Get("ResponsableCausaIncidencia")
	DatosCabeceraIncidenciaProveedor.NoConformidadAsociada=mData0.Get("NoConformidadAsociada")
	DatosCabeceraIncidenciaProveedor.IDNoConformidadAsociada=mData0.Get("IDNoConformidadAsociada")
	DatosCabeceraIncidenciaProveedor.LinkInformeNoConformidadAsociada=mData0.Get("LinkInformeNoConformidadAsociada")
	DatosCabeceraIncidenciaProveedor.CosteIncidencia=mData0.Get("CosteIncidencia")
	'DatosCabeceraIncidenciaProveedor.Anulada=mData0.Get("Anulada")
	DatosCabeceraIncidenciaProveedor.EstadoIncidencia=mData0.Get("EstadoIncidencia")
	
	lblCerrarIncidencia.Visible=DatosCabeceraIncidenciaProveedor.EstadoIncidencia=0
	lblReabrirIncidencia.Visible=DatosCabeceraIncidenciaProveedor.EstadoIncidencia=1
	
	'DatosCabeceraIncidenciaProveedor.Anulada=mData0.Get("Anulada")
	
	lstFicherosAdjuntosIncidencia.Initialize
	Wait For(CargaDatosFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
	Dim accion As String=mRes.get("Accion")
	If accion="NOK" Then
		'DateTime.DateFormat=DateFormatAnt
		jamLoadingIndicator1.Close
		Return False
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mDataFichero As Map In lstReg
		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicheroAdjuntoIncidencia
		FicheroAdjuntoAccionIncidencia.Initialize
		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
		lstFicherosAdjuntosIncidencia.Add(FicheroAdjuntoAccionIncidencia)
		'AddItemCLVAccionesAccion(AccionIncidencia)
	Next
	Dim NumFicherosIncidencia As Int
	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFichero.IDLineaAccion=0 Then NumFicherosIncidencia=NumFicherosIncidencia+1
	Next
	DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia=NumFicherosIncidencia
	
	
	Wait For(CargaAccionesIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
	Dim accion As String=mRes.get("Accion")
	If accion="NOK" Then
		'DateTime.DateFormat=DateFormatAnt
		jamLoadingIndicator1.Close
		Return False
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mDataAccion As Map In lstReg
		Dim AccionIncidencia As TipoDatosAccionIncidencia
		AccionIncidencia.Initialize
		AccionIncidencia.IDLineaAccion=mDataAccion.Get("IDLineaAccion")
		'AccionIncidencia.IDLineaIncidencia=mDataAccion.Get("IDLineaIncidencia")
		AccionIncidencia.IDIncidencia=mDataAccion.Get("IDIncidenciaProveedor")
		AccionIncidencia.UsuarioCreacionLineaAccion=mDataAccion.Get("UsuarioCreacionLineaAccion")
		AccionIncidencia.FechaLineaAccionLong=mDataAccion.Get("FechaLineaAccionLong")
		AccionIncidencia.DescripcionAccion=mDataAccion.Get("DescripcionAccion")
		AccionIncidencia.NumeroFicherosAdjuntosAccion=mDataAccion.Get("NumeroFicherosAdjuntosAccion")
		AccionIncidencia.AccionCierraIncidencia=mDataAccion.Get("AccionCierraIncidencia")
		AccionIncidencia.DepartamentoAsignadoAccion=mDataAccion.Get("DepartamentoAsignadoAccion")
'		AccionIncidencia.Anulada=mDataAccion.Get("Anulada")
		AccionIncidencia.FechaCierreAccion=mDataAccion.Get("FechaCierreAccion")
		AccionIncidencia.UsuarioCierreAccion=mDataAccion.Get("UsuarioCierraAccion")
		AccionIncidencia.ComentariosCierreAccion=Utilidades.FixNull(mDataAccion.Get("ComentarioCierreAccion"))
		AccionIncidencia.EstadoAccion=mDataAccion.Get("EstadoAccion")
		Dim NumFicherosAccion As Int
		For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
			If DatosFichero.IDLineaAccion=AccionIncidencia.IDLineaAccion Then NumFicherosAccion=NumFicherosAccion+1
		Next
		AccionIncidencia.NumeroFicherosAdjuntosAccion=NumFicherosAccion
		
		lstAccionesIncidenciaProveedor.Add(AccionIncidencia)
		'AddItemCLVAccionesAccion(AccionIncidencia)
	Next
	
'	Wait For(CargaDatosFicherosAdjuntosAccionesIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
'	Dim accion As String=mRes.get("Accion")
'	If accion="NOK" Then
'		'DateTime.DateFormat=DateFormatAnt
'		jamLoadingIndicator1.Close
'		Return False
'	End If
'	Dim lstReg As List=mRes.Get("lstReg")
'	For Each mDataFichero As Map In lstReg
'		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicherosAccionIncidencia
'		FicheroAdjuntoAccionIncidencia.Initialize
'		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
'		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
'		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
'		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
'
'		lstFicherosAccionesIncidencia.Add(FicheroAdjuntoAccionIncidencia)
'		'AddItemCLVAccionesAccion(AccionIncidencia)
'	Next
	
	
	'Si viene de migracion access y aun no se han grabado sus fases (descripcion =fase inicial + Accion compras como fase 2, si accion Compras<>""
	If DatosCabeceraIncidenciaProveedor.MigracionAccess And lstAccionesIncidenciaProveedor.Size=0 Then
	
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasAccionIncidenciaBatchDispositivoUsuario", _
			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows))
			
		wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
		If Success=False Then
			jamLoadingIndicator1.close
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar las tablas batch de incidencias proveedor dispositivo-usuario.","Error")
			Wait For (msa) Msgbox_Result
			Return False
		End If
		
		Dim UUIDSel As String=Utilidades.GenerarUUIDv4
	
		Dim lstComandos As List
		lstComandos.Initialize
		
'''''			' la descripcion de la incidencia es la primera Fase de la incidencia
			
'''''		Dim DatosAccionInicial As TipoDatosAccionIncidencia
'''''		DatosAccionInicial.Initialize
'''''		DatosAccionInicial.IDLineaAccion=-1
'''''		'AccionIncidencia.IDLineaIncidencia=-1
'''''		DatosAccionInicial.TipoCambio="Nueva"
'''''		DatosAccionInicial.IDIncidencia=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
'''''		DatosAccionInicial.UsuarioCreacionLineaAccion=DatosCabeceraIncidenciaProveedor.NombreUsuarioEmisor
'''''		DatosAccionInicial.FechaLineaAccionLong=DatosCabeceraIncidenciaProveedor.FechaIncidenciaLong
'''''		DatosAccionInicial.DescripcionAccion=DatosCabeceraIncidenciaProveedor.DescripcionIncidencia.Trim.Replace(CRLF & CRLF,"")
'''''		DatosAccionInicial.NumeroFicherosAdjuntosAccion=0
'''''		DatosAccionInicial.AccionCierraIncidencia=0
'''''		DatosAccionInicial.DepartamentoAsignadoAccion=""
'''''		DatosAccionInicial.Anulada=0
'''''		
'''''		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaAccionIncidenciaBatch", _
'''''			Array(DateTime.Now, UUIDSel, Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows, _
'''''			DatosAccionInicial.IDLineaAccion, DatosAccionInicial.IDLineaAccionTemp, DatosAccionInicial.IDIncidencia, DatosAccionInicial.TipoCambio, _
'''''			DatosAccionInicial.FechaLineaAccionLong,Main.DatosUsuario.NombreUsuarioWindows,DatosAccionInicial.AccionCierraIncidencia,DatosAccionInicial.DescripcionAccion, _
'''''			DatosAccionInicial.DepartamentoAsignadoAccion, DatosAccionInicial.Anulada))
'''''		lstComandos.Add(cmd)
'''''		
'''''		lstAccionesIncidenciaProveedor.Add(DatosAccionInicial)
		
		'If DatosCabeceraIncidenciaProveedor.AccionCompras<>"" And lstAccionesIncidencia.Size=0 Then
		If DatosCabeceraIncidenciaProveedor.AccionCompras<>"" Then
			Dim DatosAccionCierre As TipoDatosAccionIncidencia
			DatosAccionCierre.Initialize
			DatosAccionCierre.IDLineaAccion=0
			'AccionIncidencia.IDLineaIncidencia=0
			DatosAccionCierre.TipoCambio="Nueva"
			DatosAccionCierre.IDIncidencia=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
			DatosAccionCierre.UsuarioCreacionLineaAccion=DatosCabeceraIncidenciaProveedor.NombreUsuarioAccionCompras
			DatosAccionCierre.FechaLineaAccionLong=DatosCabeceraIncidenciaProveedor.FechaAccionComprasLong
			DatosAccionCierre.DescripcionAccion=DatosCabeceraIncidenciaProveedor.AccionCompras
			DatosAccionCierre.AccionCierraIncidencia=DatosCabeceraIncidenciaProveedor.EstadoIncidencia=1  '1=cerrada
			DatosAccionCierre.DepartamentoAsignadoAccion=""
			DatosAccionCierre.FechaCierreAccion=DatosCabeceraIncidenciaProveedor.FechaCierreLong
			DatosAccionCierre.UsuarioCierreAccion=DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre
			
			Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaAccionIncidenciaBatch", _
			Array(DateTime.Now, UUIDSel, Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows, _
			DatosAccionCierre.IDLineaAccion, DatosAccionCierre.IDLineaAccionTemp, DatosAccionCierre.IDIncidencia, DatosAccionCierre.TipoCambio, _
			DatosAccionCierre.FechaLineaAccionLong,Main.DatosUsuario.NombreUsuarioWindows,DatosAccionCierre.AccionCierraIncidencia,DatosAccionCierre.DescripcionAccion, _
			DatosAccionCierre.DepartamentoAsignadoAccion, 0))
			lstComandos.Add(cmd)
			
			
			lstAccionesIncidenciaProveedor.Add(DatosAccionCierre)
		End If
		
		wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
		If Success=False Then
			jamLoadingIndicator1.close
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar los datos de tareas en las tabla batch de la incidencia.","Error")
			Wait For (msa) Msgbox_Result
			Return False
		End If

	End If
	
	IDIncidenciaProveedorAnterior=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
	IncidenciaProveedorAnterior=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
	'wait for (MostrarDatosIncidencia(mData0)) complete (success As Boolean)
	Return True
End Sub

Sub CargaDatosCabeceraIncidencia(IDLinSel As Int, IncidenciaProveedorSel As String) As ResumableSub
	
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="IncidenciasProveedorDatosCabeceraIncidencia"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDLinSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No existe la incidencia seleccionada (${IncidenciaProveedorSel})"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			mData0=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData0", mData0)
		End If
	End If
	Return mRes
End Sub


Sub CargaAccionesIncidencia(IDIncSel As Int) As ResumableSub
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorAccionesIncidencia"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDIncSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' la incidencia no tiene acciones 
			'jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No existe la incidencia seleccionada (${IDIncSel})"$,"Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			lstReg=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

'
'
'Sub CargaDatosAccionIncidencia(IDLineaAccion As Int) As ResumableSub
'	
'	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
'	Dim mRes As Map
'	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("lstReg",lstReg)
'	Dim Comando As String="IncidenciasProveedorDatosAccionIncidencia"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDLineaAccion), Me)
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
'			Dim msa As Object=xui.MsgboxAsync($"No existe la acción de la incidencia seleccionada (${IDLineaAccion}), o está anulada."$,"Aviso")
'			Wait For (msa) Msgbox_Result
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'		Else
'			lstReg=mResult.Get("lstRes")
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("lstReg", lstReg)
'		End If
'	End If
'	Return mRes
'End Sub

'Sub CargaDatosFicherosAdjuntosAccionesIncidencia(IDIncidenciaSel As Int) As ResumableSub
'	
'	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
'	Dim mRes As Map
'	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("lstReg",lstReg)
'	Dim Comando As String="IncidenciasProveedorFicherosAdjuntosAccionesIncidencia"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDIncidenciaSel), Me)
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
'			'jamLoadingIndicator1.Close
''			Dim msa As Object=xui.MsgboxAsync($"No hay ficheros adjuntos a la fase de la incidencia seleccionada."$,"Aviso")
''			Wait For (msa) Msgbox_Result
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		Else
'			lstReg=mResult.Get("lstRes")
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("lstReg", lstReg)
'		End If
'	End If
'	Return mRes
'End Sub

'Sub CargaDatosFicherosAdjuntosAccionIncidencia(IDIncidenciaSel As Int,IDLineaAccion As Int) As ResumableSub
'	
'	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
'	Dim mRes As Map
'	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("lstReg",lstReg)
'	Dim Comando As String="IncidenciasProveedorFicherosAdjuntosAccionIncidencia"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDIncidenciaSel, IDLineaAccion), Me)
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
''			Dim msa As Object=xui.MsgboxAsync($"No hay ficheros adjuntos a la fase de la incidencia seleccionada."$,"Aviso")
''			Wait For (msa) Msgbox_Result
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		Else
'			lstReg=mResult.Get("lstRes")
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("lstReg", lstReg)
'		End If
'	End If
'	Return mRes
'End Sub



'
'Sub MostrarDatosIncidencia(mData As Map) As ResumableSub
'	frm.Title=Main.PrefijoTitleForms & "    Ficha Incidencia Proveedor " & IIf(DatosCabeceraIncidenciaProveedor.IncidenciaProveedor="","",DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	txtNumeroIncidencia.Text=mData.get("IncidenciaProveedor")
'	txtFechaIncidencia.Text=DateTime.Date(mData.Get("FechaIncidenciaLong"))
'	txtTipoOrigenIncidencia.Text=mData.get("TipoOrigenIncidenciaProveedor")
'	txtUsuarioEmisor.Text=mData.Get("NombreUsuarioEmisor")
'	txtUsuarioCompras.Text=mData.Get("NombreUsuarioCompras")
'	txtProveedor.Text=mData.Get("Proveedor")
'	txtNombreProveedor.Text=mData.Get("NombreProveedor")
'	txtTipoDocumentoProveedor.Text=mData.Get("NombreTipoDocumento")
'	txtTipoDocumentoOrigen.Text=mData.Get("NombreTipoDocumentoOrigen")
'	txtDocumentoProveedor.Text=mData.Get("DocumentoProveedor")
'	txtFechaDocumentoProveedor.Text=IIf(0<mData.Get("FechaDocumentoProveedorLong"),DateTime.Date(mData.Get("FechaDocumentoProveedorLong")),"")
'	txtDocumentoOrigenProveedor.Text=mData.Get("DocumentoOrigen")
'	TextAreaDescripcionIncidencia.Text=mData.Get("DescripcionIncidencia")
'	
'
'	txtGravedadIncidencia.text=mData.Get("GravedadIncidencia")
'	txtFechaCierreIncidencia.Text=IIf(0<mData.Get("FechaCierreLong"), DateTime.Date(mData.Get("FechaCierreLong")),"")
'	txtUsuarioCierreIncidencia.Text=mData.Get("NombreUsuarioCierre")
'	
'	btnGrabarNuevoEditarEstadoRevision.Visible=Not(ModoFicha="VER")
'	btnCancelarNuevoEditarIncidenciaProveedor.Visible=Not(ModoFicha="VER")
'	
'	Dim EstadoIncidencia As String=mData.Get("EstadoIncidencia")
'	If EstadoIncidencia="CERRADA" Then
'		EstadoIncidencia="CERRADA"
'		txtEstadoIncidencia.Color=xui.Color_Green
'		txtEstadoIncidencia.TextColor=xui.Color_Black
'		CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","bold")
'		pnlFondoDatosCierreIncidencia.Visible=True
'	Else
'		EstadoIncidencia="ABIERTA"
'		txtEstadoIncidencia.Color=xui.Color_Red
'		txtEstadoIncidencia.TextColor=xui.Color_White
'		CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","normal")
'		pnlFondoDatosCierreIncidencia.Visible=False
'	End If
'	txtEstadoIncidencia.Text=EstadoIncidencia
'	txtEstadoIncidencia.SetTextAlignment("CENTER","CENTER")
'	
'	clvAccionesIncidencia.Clear
'	If DatosCabeceraIncidenciaProveedor.MigracionAccess Then
'		If ""<>mData.Get("AccionCompras") Then  
'			TextAreaAccionCompras.Text=mData.Get("AccionCompras")
'			txtUsuarioAccionCompras.Text=mData.Get("NombreUsuarioAccionCompras")
'			txtFechaAccionCompras.Text=IIf(0<mData.Get("FechaAccionComprasLong"),DateTime.Date(mData.Get("FechaAccionComprasLong")),"")
''			Dim mDataAccion As Map
''			mDataAccion.Initialize
''			mDataAccion.put("IDLineaAccion",-1)
''			mDataAccion.put("FechaLineaAccionLong",mData.Get("FechaAccionComprasLong"))
''			mDataAccion.put("UsuarioCreacionLineaAccion",mData.Get("NombreUsuarioAccionCompras"))
''			mDataAccion.put("AccionCierraIncidencia",IIf(EstadoIncidencia="CERRADA",1,0))
''			mDataAccion.put("DescripcionAccion",mData.Get("AccionCompras"))
''			mDataAccion.put("DepartamentoAsignadoAccion","")
''			AddItemCLVAccionesAccion(mDataAccion)
'			
'			Dim DataAccion As TipoDatosAccionIncidencia
'			DataAccion.Initialize
'			DataAccion.IDLineaAccion=-1
'			DataAccion.FechaLineaAccionLong=mData.Get("FechaAccionComprasLong")
'			DataAccion.UsuarioCreacionLineaAccion=mData.Get("NombreUsuarioAccionCompras")
'			DataAccion.AccionCierraIncidencia=IIf(EstadoIncidencia="CERRADA",1,0)
'			DataAccion.DescripcionAccion=mData.Get("AccionCompras")
'			DataAccion.DepartamentoAsignadoAccion=""
'			AddItemCLVAccionesAccion(DataAccion)
'			
'		Else
'			' incidencia grabada desde access sin accion de compras
'		
'		
'		End If
'	Else
'		Wait For(CargaAccionesIncidencia(DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (mRes As Map)
'		Dim Accion As String=mRes.get("Accion")
'		If Accion="NOK" Then
'			DateTime.DateFormat=DateFormatAnt
'			jamLoadingIndicator1.Close
'			Return False
'		End If
'		Dim lstReg As List=mRes.Get("lstReg")
'		For Each mDataAccion As Map In lstReg
'			Dim AccionIncidencia As TipoDatosAccionIncidencia
'			AccionIncidencia.Initialize
'			AccionIncidencia.IDLineaAccion=mDataAccion.Get("IDLineaAccion")
'			AccionIncidencia.IDLineaIncidencia=mDataAccion.Get("IDLineaIncidencia")
'			AccionIncidencia.IDIncidencia=mDataAccion.Get("IDIncidencia")
'			AccionIncidencia.UsuarioCreacionLineaAccion=mDataAccion.Get("UsuarioCreacionLineaAccion")
'			AccionIncidencia.FechaLineaAccionLong=mDataAccion.Get("FechaLineaAccionLong")
'			AccionIncidencia.DescripcionAccion=mDataAccion.Get("DescripcionAccion")
'			AccionIncidencia.AccionCierraIncidencia=mDataAccion.Get("AccionCierraIncidencia")
'			AccionIncidencia.DepartamentoAsignadoAccion=mDataAccion.Get("DepartamentoAsignadoAccion")
'			AccionIncidencia.Anulada=mDataAccion.Get("Anulada")
'			AddItemCLVAccionesAccion(AccionIncidencia)
'		Next
'	End If
'	jamLoadingIndicator1.Close
'	DateTime.DateFormat=DateFormatAnt
'	Return True
'End Sub


Sub MostrarDatosIncidencia(DatosCabIncidenciaSel As TipoDatosCabeceraIncidenciaProveedor, lstAccionesIncidenciaSel As List) As ResumableSub
	frm.Title=Main.PrefijoTitleForms & "    Ficha Incidencia Proveedor " & IIf(DatosCabIncidenciaSel.IncidenciaProveedor="","",DatosCabIncidenciaSel.IncidenciaProveedor)
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtNumeroIncidencia.Text=DatosCabIncidenciaSel.IncidenciaProveedor
	txtFechaIncidencia.Text=DateTime.Date(DatosCabIncidenciaSel.FechaIncidenciaLong)
	txtTipoOrigenIncidencia.Text=DatosCabIncidenciaSel.TipoOrigenIncidenciaProveedor
	txtUsuarioEmisor.Text=DatosCabIncidenciaSel.NombreUsuarioEmisor
	txtUsuarioCompras.Text=DatosCabIncidenciaSel.NombreUsuarioCompras
	txtDepartamentoCoordinador.Text=DatosCabIncidenciaSel.DepartamentoCoordinador
	txtProveedor.Text=DatosCabIncidenciaSel.Proveedor
	txtNombreProveedor.Text=DatosCabIncidenciaSel.NombreProveedor
	txtTipoDocumentoProveedor.Text=DatosCabIncidenciaSel.NombreTipoDocumento
	txtTipoDocumentoOrigen.Text=DatosCabIncidenciaSel.NombreTipoDocumentoOrigen
	txtDocumentoProveedor.Text=DatosCabIncidenciaSel.DocumentoProveedor
	txtFechaDocumentoProveedor.Text=IIf(0<DatosCabIncidenciaSel.FechaDocumentoProveedorLong,DateTime.Date(DatosCabIncidenciaSel.FechaDocumentoProveedorLong),"")
	txtDocumentoOrigenProveedor.Text=DatosCabIncidenciaSel.DocumentoOrigen
'	If TextAreaDescripcionIncidencia.StyleClasses.IndexOf("text-area")>-1 Then
'		TextAreaDescripcionIncidencia.StyleClasses.RemoveAt(TextAreaDescripcionIncidencia.StyleClasses.IndexOf("text-area"))
'	End If
'	TextAreaDescripcionIncidencia.StyleClasses.Add("TextArea0Padding")
'	TextAreaDescripcionIncidencia.Text=DatosCabIncidenciaSel.DescripcionIncidencia
	BBCodeViewDescripcionIncidencia.Text=$"${DatosCabIncidenciaSel.DescripcionIncidencia}"$
	
	Dim HTextoDescripcionIncidencia As Double = Utilidades.MeasureMultilineTextHeight(fx.DefaultFont(12), BBCodeViewDescripcionIncidencia.sv.Width,BBCodeViewDescripcionIncidencia.Text)
	' 25 dip de marggen vertical
	BBCodeViewDescripcionIncidencia.mBase.Height=Min(0.40*frm.RootPane.Height,HTextoDescripcionIncidencia+25dip)
	pnlFondoDescripcionIncidencia.Height=lblTitleDescripcionIncidencia.Height+Min(0.40*frm.RootPane.Height,HTextoDescripcionIncidencia+25dip)+5dip
	
	txtTipoIncidencia.Text=DatosCabIncidenciaSel.NombreTipoIncidencia
	txtGravedadIncidencia.text=DatosCabIncidenciaSel.GravedadIncidencia
	txtFechaCierreIncidencia.Text=IIf(0<DatosCabIncidenciaSel.FechaCierreLong, DateTime.Date(DatosCabIncidenciaSel.FechaCierreLong),"")
	
	Dim jbd As JamClickableBadgeData
	jbd.DataType=JamClickableBadges1.DataTypeInt
	jbd.Radius=8
	jbd.TextSize=11
	If DatosCabIncidenciaSel.NumeroFicherosAdjuntosIncidencia=0 Then
		jbd.TextColor=xui.Color_White
		jbd.BackGroundColor=xui.Color_Gray
	Else
		jbd.TextColor=xui.Color_Black
		jbd.BackGroundColor=0xFF00FF7F
	End If
	jbd.Value=DatosCabIncidenciaSel.NumeroFicherosAdjuntosIncidencia
	wait for(JamClickableBadges1.SetBadge(lblIconFicherosAdjuntosIncidencia,jbd)) complete (rObj As Object)
	
	txtUsuarioCierreIncidencia.Text=DatosCabIncidenciaSel.NombreUsuarioCierre
	
'	btnGrabarNuevoEditarEstadoRevision.Visible=Not(ModoFicha="VER")
'	btnCancelarNuevoEditarIncidenciaProveedor.Visible=Not(ModoFicha="VER")
	

	
	clvAccionesIncidencia.Clear
'	If DatosCabIncidenciaSel.MigracionAccess Then
'		If DatosCabIncidenciaSel.AccionCompras<>"" Then
'			TextAreaAccionCompras.Text=DatosCabIncidenciaSel.AccionCompras
'			txtUsuarioAccionCompras.Text=DatosCabIncidenciaSel.NombreUsuarioAccionCompras
'			txtFechaAccionCompras.Text=IIf(0<DatosCabIncidenciaSel.FechaAccionComprasLong,DateTime.Date(DatosCabIncidenciaSel.FechaAccionComprasLong),"")
''			Dim mDataAccion As Map
''			mDataAccion.Initialize
''			mDataAccion.put("IDLineaAccion",-1)
''			mDataAccion.put("FechaLineaAccionLong",mData.Get("FechaAccionComprasLong"))
''			mDataAccion.put("UsuarioCreacionLineaAccion",mData.Get("NombreUsuarioAccionCompras"))
''			mDataAccion.put("AccionCierraIncidencia",IIf(EstadoIncidencia="CERRADA",1,0))
''			mDataAccion.put("DescripcionAccion",mData.Get("AccionCompras"))
	''			mDataAccion.put("DepartamentoAsignadoAccion","")
''			AddItemCLVAccionesAccion(mDataAccion)
'			
'			Dim DataAccion As TipoDatosAccionIncidencia
'			DataAccion.Initialize
'			DataAccion.IDLineaAccion=-1
'			DataAccion.FechaLineaAccionLong=DatosCabIncidenciaSel.FechaAccionComprasLong
'			DataAccion.UsuarioCreacionLineaAccion=DatosCabIncidenciaSel.NombreUsuarioAccionCompras
'			DataAccion.AccionCierraIncidencia=IIf(DatosCabIncidenciaSel.EstadoIncidencia="CERRADA",1,0)
'			DataAccion.DescripcionAccion=DatosCabIncidenciaSel.AccionCompras
'			DataAccion.DepartamentoAsignadoAccion=""
'			AddItemCLVAccionesAccion(DataAccion)
'		Else
'			' incidencia grabada desde access sin accion de compras
'		
'		End If
'	Else
		Dim NumAccionesAbiertas As Int
		'Dim IncidenciaSelCerrada As Boolean
		For Each AccionIncidencia As TipoDatosAccionIncidencia In lstAccionesIncidenciaSel
			wait for(AddItemCLVAccionesAccion(AccionIncidencia))  complete (rObj As Object)
			Sleep(10)
'			If AccionIncidencia.AccionCierraIncidencia Then
'				IncidenciaSelCerrada=True
'			End If
			If AccionIncidencia.EstadoAccion=0 Then
				NumAccionesAbiertas=NumAccionesAbiertas+1
		End If
	Next
	
	'''clvAccionesIncidencia_ScrollChanged(0)  'IMPORTANTE, PARA QUE SE MUESTRE EL TEXTO EN EL BBLISTITEM!! (eliminada el planteamiento de usar BBList para la descripcion de la tarea
	
	Dim hToBottom As Int=frm.Height-clvAccionesIncidencia.AsView.Top
	Dim maxCLVH As Int=hToBottom-50dip
	
	Log(clvAccionesIncidencia.sv.ScrollViewContentHeight)
	pnlFondoCLVAccionesIncidencia.Top=pnlFondoDescripcionIncidencia.Top+pnlFondoDescripcionIncidencia.Height+10dip
	pnlFondoCLVAccionesIncidencia.Height=clvAccionesIncidencia.AsView.top+Min(clvAccionesIncidencia.sv.ScrollViewContentHeight,maxCLVH)
	clvAccionesIncidencia.AsView.Height=pnlFondoCLVAccionesIncidencia.Height
	

	Dim jbd As JamClickableBadgeData
	jbd.DataType=JamClickableBadges1.DataTypeInt
	jbd.Radius=8
	jbd.TextSize=11
'	If NumAccionesAbiertas=0 Then
'		jbd.TextColor=xui.Color_Black
'		jbd.BackGroundColor=0xFF00FF7F
'	Else
	If NumAccionesAbiertas>0 Then
		jbd.BackGroundColor=xui.Color_Red
		jbd.TextColor=xui.Color_White
	Else
		jbd.BackGroundColor=0xFF00FA9A
		jbd.TextColor=xui.Color_Black
	End If
'	End If
	jbd.Value=NumAccionesAbiertas
	wait for(JamClickableBadges1.SetBadge(lblTitleAcciones,jbd)) complete (rObj As Object)

		
		
'		If IncidenciaSelCerrada Then
'			DatosCabIncidenciaSel.EstadoIncidencia="CERRADA"
'		Else
'			DatosCabIncidenciaSel.EstadoIncidencia="ABIERTA"
'		End If
		
	txtEstadoIncidencia.Text=IIf(DatosCabIncidenciaSel.EstadoIncidencia=0,"ABIERTA","CERRADA")
	txtEstadoIncidencia.SetTextAlignment("CENTER","CENTER")
	'If DatosCabIncidenciaSel.EstadoIncidencia="CERRADA" Then
	If DatosCabIncidenciaSel.EstadoIncidencia=1 Then  '1= cerrada
'		txtEstadoIncidencia.Color=0xFF00FF7F
'		txtEstadoIncidencia.TextColor=xui.Color_Black
		txtEstadoIncidencia.Color=xui.Color_Transparent
		txtEstadoIncidencia.TextColor=0xFF00FF7F
		'CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","bold")
		Dim JOtxtSt As JavaObject=txtEstadoIncidencia.As(TextField)
		Dim JOStyle As JavaObject=JOtxtSt.RunMethodJO("getStyleClass",Null)
'		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;-fx-text-fill:springgreen;"))
		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;"))
		'txtEstadoIncidencia.As(TextField).Style="-fx-font-weight:bold;"
		'pnlFondoDatosCierreIncidencia.Visible=True
	Else
'		txtEstadoIncidencia.Color=xui.Color_Red
'		txtEstadoIncidencia.TextColor=xui.Color_White
		txtEstadoIncidencia.Color=xui.Color_Red
		txtEstadoIncidencia.TextColor=xui.Color_White
		'CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","normal")
		Dim JOtxtSt As JavaObject=txtEstadoIncidencia.As(TextField)
		Dim JOStyle As JavaObject=JOtxtSt.RunMethodJO("getStyleClass",Null)
		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;"))
		'txtEstadoIncidencia.As(TextField).Style="-fx-font-weight:bold;"
		'pnlFondoDatosCierreIncidencia.Visible=False
	End If
	
	txtCosteIncidencia.Text=Utilidades.FormatoNumerico2(DatosCabIncidenciaSel.CosteIncidencia,1,2,2,True)
	txtCosteIncidencia.SetTextAlignment("CENTER","RIGHT")
	
	CheckBoxIncidenciaInterna.Checked=DatosCabIncidenciaSel.ResponsabilidadInterna
	txtResponsableCausaIncidencia.Text=DatosCabIncidenciaSel.ResponsableCausaIncidencia
	txtTipoIncidencia.Text=DatosCabIncidenciaSel.NombreTipoIncidencia
	txtUsuarioCierreIncidencia.Text=DatosCabIncidenciaSel.NombreUsuarioCierre


		
'	End If
	
'	If ModoFicha<>"VER" And DatosCabIncidenciaSel.EstadoIncidencia="ABIERTA" Then
'		AddItemCLVAccionesNuevaAccion
'	End If
'	
'	If ModoFicha="VER" Then
'		EliminarItemCLVAccionesNuevaAccion
'	End If

'	If DatosCabIncidenciaSel.EstadoIncidencia=0 Then
'		AddItemCLVAccionesNuevaAccion
'	End If
	
	lblAddAccionIncidencia.Visible=DatosCabIncidenciaSel.EstadoIncidencia=0
	
	'jamLoadingIndicator1.Close
	DateTime.DateFormat=DateFormatAnt

	Return Null
End Sub

Sub pnlFondoDescripcionIncidencia_Resize (Width As Double, Height As Double)
	
End Sub

'Sub AddItemCLVAccionesAccion(mDataAccion As Map)
Sub AddItemCLVAccionesAccion(DataAccion As TipoDatosAccionIncidencia) As ResumableSub
	
'	'TextAreaDummy.PrefWidth=clvAccionesIncidencia.sv.Width
'	TextAreaDummy.Text=DataAccion.DescripcionAccion
'	Sleep(0)
'	Dim TAJO As JavaObject = TextAreaDummy
'	Dim Content As JavaObject = TAJO.RunMethod("lookup",Array(".content"))
'	If Content.IsInitialized Then
'		'Get the layoutbounds property
'		Dim LayoutBoundsProperty As JavaObject = Content.RunMethod("getLayoutBounds",Null)
'		'Log(LayoutBoundsProperty.RunMethod("getMaxY",Null))
'		Dim HTexto As Int=LayoutBoundsProperty.RunMethod("getMaxY",Null)
'	End If

	
	
'	
	Dim HTexto As Double = Utilidades.MeasureMultilineTextHeight(fx.DefaultFont(12), clvAccionesIncidencia.sv.Width-30dip,DataAccion.DescripcionAccion & CRLF)
	' 30dip=diferencia del ancho del textarea respecto al pane del clv
	
	Dim MahHTextArea As Int=350dip
	Dim MaxYTextArea As Int=Max(25dip,Min(HTexto,MahHTextArea))
	Dim hTotalPnl As Int=40dip+40dip+MaxYTextArea+15dip  ' añadir el top y el distante to bottom del textarea + 15dip del padding , debido al css del B4xDialog
	'Dim hTotalPnl As Int=40dip+40dip+MaxYTextArea
	
	
	Dim pnl As B4XView=xui.CreatePanel("pnlItemAccion")

	'pnl.SetLayoutAnimated(0,5dip,5dip,clvAccionesIncidencia.AsView.Width-10dip,80dip)
	pnl.SetLayoutAnimated(0,5dip,5dip,clvAccionesIncidencia.AsView.Width-10dip,hTotalPnl)
	pnl.LoadLayout("scrIncidenciasProveedorItemAccion")
	pnl.Tag=DataAccion
	
	
	
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-control-inner-background","transparent")
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-background","transparent")
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-faint-focus-color","transparent")
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-background-color","transparent")
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-text-fill","Black")
	
	
	'clvAccionesIncidencia.Add(pnl,mDataAccion)
	clvAccionesIncidencia.Add(pnl,DataAccion)
	pnlFondoItemAccion.Height=hTotalPnl
'	For Each xNode As B4XView In pnl.GetAllViewsRecursive 
'		xNode.TextSize=12
'	Next
	If clvAccionesIncidencia.Size Mod 2=0 Then
		pnlFondoItemAccion.Color=Color1
	Else
		pnlFondoItemAccion.Color=Color2
	End If
	
	'clvAccionesIncidencia.AsView.Tag = clvAccionesIncidencia
	
	

'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-padding","1,1,1,1")
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-text-alignment","left")
'	CSSUtils.SetStyleProperty(TextAreaAccionLinea,"-fx-text-origin","top")
	'TextAreaAccionLinea.Style=$"-fx-border-width: 0; -fx-border-insets: 0; -fx-border-color: transparent; -fx-background-insets: 0;"$
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
'	txtFechaAccionLinea.Text=DateTime.Date(mDataAccion.Get("FechaLineaAccionLong"))
'	txtUsuarioCreacionAccionLinea.Text=mDataAccion.Get("UsuarioCreacionLineaAccion")
'	CheckBoxAccionCierraIncidencia.Checked=1=mDataAccion.Get("AccionCierraIncidencia")
'	txtDepartamentoGestorAccionLinea.Visible=0=mDataAccion.Get("AccionCierraIncidencia")
'	lblTitleDepartamentoGestorAccionLinea.Visible=0=mDataAccion.Get("AccionCierraIncidencia")
'	txtDepartamentoGestorAccionLinea.Text=mDataAccion.Get("DepartamentoAsignadoAccion")
'	TextAreaAccionLinea.Text=mDataAccion.Get("DescripcionAccion")
	
	txtFechaAccionLinea.Text=DateTime.Date(DataAccion.FechaLineaAccionLong)
	txtUsuarioCreacionAccionLinea.Text=DataAccion.UsuarioCreacionLineaAccion
'	CheckBoxAccionCierraIncidencia.Checked=DataAccion.AccionCierraIncidencia
	txtDepartamentoGestorAccionLinea.Visible=Not(DataAccion.AccionCierraIncidencia)
	lblTitleDepartamentoGestorAccionLinea.Visible=Not(DataAccion.AccionCierraIncidencia)
	'lblAyudaDepartamentoAsignadoFase.Visible=Not(DataAccion.AccionCierraIncidencia)
	
	If lblTitleDepartamentoGestorAccionLinea.Visible Then
		Dim jbd As JamClickableBadgeData
		jbd.DataType=JamClickableBadges1.DataTypeString
		jbd.Radius=8
		jbd.TextSize=11
		jbd.TextColor=xui.Color_White
		jbd.BackGroundColor=xui.Color_Blue
		jbd.Value="?"

		wait for(JamClickableBadges1.SetBadge(lblTitleDepartamentoGestorAccionLinea,jbd)) complete (rObj As Object)
	End If

	txtDepartamentoGestorAccionLinea.Text=DataAccion.DepartamentoAsignadoAccion
'	Dim sStyle As String=TextAreaAccionLinea.As(JavaObject).RunMethod("getStyle",Null)
''	
'	sStyle=$"${sStyle}}.content {-fx-padding: 10;}"$
'	TextAreaAccionLinea.As(JavaObject).RunMethod("setStyle",Array(sStyle))
	'CSSUtils.SetStyleProperty(TextAreaAccionLinea, "-fx-padding", "0 0 0 0")
'	Dim JOInsets As JavaObject=TextAreaAccionLinea.As(JavaObject).RunMethodJO("getPadding",Null)
''	JOInsets.InitializeNewInstance("javafx.geometry.Insets",Array(0))
'	TextAreaAccionLinea.As(JavaObject).RunMethod("setPadding",Array As Object(0,0,0,0))
'	Log(TextAreaAccionLinea.As(JavaObject).RunMethod("getPrefRowCount",Null))

'	Log(TextAreaAccionLinea.StyleClasses.Size)
'	Log(TextAreaAccionLinea.StyleClasses.Get(0))
'	Log(TextAreaAccionLinea.StyleClasses.Get(1))
	TextAreaDescripcionAccion.StyleClasses.RemoveAt(TextAreaDescripcionAccion.StyleClasses.IndexOf("text-area"))
	TextAreaDescripcionAccion.StyleClasses.Add("TextArea0Padding")
	TextAreaDescripcionAccion.Text=DataAccion.DescripcionAccion

'	Dim BB As BBListItem = pnlFondoItemAccion.GetView(0).Tag
'	BB.TextEngine=TextEngine1
'	TextEngine1.RTLAware = True
'	BB.Text=$"${DataAccion.DescripcionAccion}"$ & CRLF & $"asdfasdf"$ & CRLF & $"asdfasdfasdf"$ & CRLF & CRLF & $"asdfasdf "$
'	BB.mBase.Height=MaxYTextArea
	'lblDescripcionAccionLinea.Text=DataAccion.DescripcionAccion
	'Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",18,18)
	'lblFicherosAdjuntosAccionLinea.Font=Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",20,20)
	'lblFicherosAdjuntosAccionLinea.Text=Chr(0xf066) & " " & DataAccion.NumeroFicherosAdjuntosAccion
	'lblIconFicherosAdjuntosAccionLinea.Text=DataAccion.NumeroFicherosAdjuntosAccion
	
'	Dim jbd As JamClickableBadgeData
'	jbd.DataType=JamClickableBadges1.DataTypeInt
'	jbd.Radius=8
'	jbd.TextSize=11
'	If DataAccion.NumeroFicherosAdjuntosAccion=0 Then
'		jbd.TextColor=xui.Color_White
'		jbd.BackGroundColor=xui.Color_Gray
'	Else
'		jbd.TextColor=xui.Color_Black
'		jbd.BackGroundColor=0xFF00FF7F
'	End If
'	jbd.Value=DataAccion.NumeroFicherosAdjuntosAccion
'	wait for(JamClickableBadges1.SetBadge(lblIconFicherosAdjuntosAccionLinea,jbd)) complete (rObj As Object)
	
	Dim jbd As JamClickableBadgeData
	jbd.DataType=JamClickableBadges1.DataTypeInt
	jbd.Radius=8
	jbd.TextSize=11
	If DataAccion.DependenciasPendientesAccion=0 Then
		jbd.TextColor=xui.Color_White
		jbd.BackGroundColor=xui.Color_Gray
	Else
		jbd.TextColor=xui.Color_Black
		jbd.BackGroundColor=0xFF00CED1
	End If
	jbd.Value=DataAccion.DependenciasPendientesAccion
	wait for(JamClickableBadges1.SetBadge(lblDependenciasPendientesAccionLinea,jbd)) complete (rObj As Object)
	
	Dim EstadoAccion As Int=DataAccion.EstadoAccion
'	If DataAccion.FechaCierreAccion=0 Then
'		EstadoAccion="ABIERTA"
'	Else
'		EstadoAccion="CERRADA"
'	End If
	txtEstadoAccionIncidencia.Text=IIf(EstadoAccion=0,"ABIERTA","CERRADA")
	txtEstadoAccionIncidencia.SetTextAlignment("CENTER","CENTER")
	If EstadoAccion=1 Then
		txtEstadoAccionIncidencia.Color=0xFF00FA9A
		txtEstadoAccionIncidencia.TextColor=xui.Color_Black
		'CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","bold")
		Dim JOtxtSt As JavaObject=txtEstadoAccionIncidencia.As(TextField)
		Dim JOStyle As JavaObject=JOtxtSt.RunMethodJO("getStyleClass",Null)
		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;-fx-text-fill:springgreen;"))
		'pnlFondoDatosCierreIncidencia.Visible=True
	Else
		txtEstadoAccionIncidencia.Color=xui.Color_Red
		txtEstadoAccionIncidencia.TextColor=xui.Color_White
		'CSSUtils.SetStyleProperty(txtEstadoIncidencia,"fx-font-weight","normal")
		Dim JOtxtSt As JavaObject=txtEstadoAccionIncidencia.As(TextField)
		Dim JOStyle As JavaObject=JOtxtSt.RunMethodJO("getStyleClass",Null)
		JOStyle.RunMethod("add",Array("-fx-font-weight:bold;-fx-text-fill:red;"))
		'pnlFondoDatosCierreIncidencia.Visible=False
		
	End If
	
	If DataAccion.FechaCierreAccion>0 Then
		txtFechaCierreAccionLinea.Text=DateTime.Date(DataAccion.FechaCierreAccion)
	Else
		txtFechaCierreAccionLinea.Text=""
	End If
	txtUsuarioCierreAccionLinea.Text=DataAccion.UsuarioCierreAccion
	txtComentariosCierreAccionLinea.Text=DataAccion.ComentariosCierreAccion
'	lblComentariosCierreAccionLinea.Visible=DataAccion.ComentariosCierreAccion<>""
'	btnEditarAccionLinea.Enabled=ModoFicha<>"VER"
'	btnAnularAccionLinea.Enabled=ModoFicha<>"VER"
'	If btnEditarAccionLinea.Enabled Then
'		btnEditarAccionLinea.TextColor=0xFFB22222
'	Else
'		btnEditarAccionLinea.TextColor=xui.Color_Gray
'	End If
'	If btnAnularAccionLinea.Enabled Then
'		btnEditarAccionLinea.TextColor=0xFFB22222
'	Else
'		btnAnularAccionLinea.TextColor=xui.Color_Gray
'	End If
'	
'	lblMenuAccionesAccionLinea.Enabled=ModoFicha<>"VER"
'	If lblMenuAccionesAccionLinea.Enabled Then
'		lblMenuAccionesAccionLinea.TextColor=0xFFB22222
'	Else
'		lblMenuAccionesAccionLinea.TextColor=xui.Color_Gray
'	End If


	DateTime.DateFormat=DateFormatAnt

'''	Sleep(0)
'''	Dim hPnl As Int=pnl.Height
'''	Dim MahHTextArea As Int=350dip
'''	
'''	Dim TAJO As JavaObject = TextAreaAccionLinea
'''	Dim Content As JavaObject = TAJO.RunMethod("lookup",Array(".content"))
'''	If Content.IsInitialized Then
'''		'Get the layoutbounds property
'''		Dim LayoutBoundsProperty As JavaObject = Content.RunMethod("getLayoutBounds",Null)
'''		'Log(LayoutBoundsProperty.RunMethod("getMaxY",Null))
'''		Dim HTexto As Int=LayoutBoundsProperty.RunMethod("getMaxY",Null)
'''		Dim MaxYTextArea As Int=Max(80dip,Min(HTexto,MahHTextArea))
'''		Dim ExcesoYSobreTextAreaLayout As Int=MaxYTextArea-TextAreaAccionLinea.Height
'''
''''		Dim xTextArea As B4XView=TextAreaAccionLinea
''''		xTextArea.Height=MaxYTextArea
'''
''''		pnl.SetLayoutAnimated(0,5dip,5dip,clvAccionesIncidencia.AsView.Width-10dip,pnl.Height+ExcesoYSobreTextAreaLayout)
''''		Sleep(0)
'''		clvAccionesIncidencia.ResizeItem(clvAccionesIncidencia.Size-1,Max(hPnl+ExcesoYSobreTextAreaLayout,hPnl))
'''
'''		Sleep(0)
'''	End If
	
'	Dim sv As ScrollPane = clvAccionesIncidencia.sv
'	sv.SetVScrollVisibility("AS_NEEDED")

	

	
	Return Null
End Sub

'Private Sub clvAccionesIncidencia_ScrollChanged (Offset As Int)
'	For i = 0 To clvAccionesIncidencia.Size - 1
'		Dim pnlItem As B4XView=clvAccionesIncidencia.GetPanel(0)
'		Dim pnlFondoItem As B4XView=pnlItem.GetView(0)
'		Dim BB As BBListItem = pnlFondoItem.GetView(0).Tag
'		BB.ParentScrolled(Offset, clvAccionesIncidencia.AsView.Height, 0dip) '40dip - height of the "title" pane in the layout
'	Next
'End Sub

Sub pnlItemAccion_Resize (Width As Double, Height As Double)
'	Log("pnlItemAccion_Resize")
'	pnlFondoItemAccion.Height=Height
'
'	Dim xTextArea As B4XView=TextAreaAccionLinea
'	Log(xTextArea.Text)
'	Log(xTextArea.Height)
	
'	Dim pnl As Pane=TextAreaAccionLinea.Parent
	'xTextArea.Height=MaxYTextArea
End Sub

'
'Sub MostrarDatosNuevaIncidencia
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	txtNumeroIncidencia.Text=""
'	txtTipoOrigenIncidencia.Text="Compra"
'	txtFechaIncidencia.Text=DateTime.Date(DateTime.Now)
'	txtUsuarioEmisor.Text=Main.DatosUsuario.NombreUsuarioWindows
'	txtUsuarioCompras.Text=""
'	txtProveedor.Text=""
'	txtNombreProveedor.Text=""
'	txtTipoDocumentoProveedor.Text=""
'	txtTipoDocumentoOrigen.Text=""
'	txtDocumentoProveedor.Text=""
'	txtFechaDocumentoProveedor.Text=""
'	txtDocumentoOrigenProveedor.Text=""
'	TextAreaDescripcionIncidencia.Text=""
'	TextAreaAccionCompras.Text=""
'	txtUsuarioAccionCompras.Text=""
'	txtFechaAccionCompras.Text=""
'	txtGravedadIncidencia.text="LEVE"
'	txtFechaCierreIncidencia.Text=""
'	txtUsuarioCierreIncidencia.Text=""
'	DateTime.DateFormat=DateFormatAnt
'	btnGrabarNuevoEditarEstadoRevision.Visible=Not(ModoFicha="VER")
'	btnCancelarNuevoEditarIncidenciaProveedor.Visible=Not(ModoFicha="VER")
'	
'	Dim EstadoIncidencia As String="ABIERTA"
''	If EstadoIncidencia="CERRADA" Then
''		EstadoIncidencia="CERRADA"
''		txtEstadoIncidencia.Color=xui.Color_Green
''		txtEstadoIncidencia.TextColor=xui.Color_Black
''		CSSUtils.SetStyleProperty(txtEstadoIncidencia,"font-weight","bold")
''	Else
''		EstadoIncidencia="ABIERTA"
'		txtEstadoIncidencia.Color=xui.Color_Red
'		txtEstadoIncidencia.TextColor=xui.Color_White
'		CSSUtils.SetStyleProperty(txtEstadoIncidencia,"font-weight","normal")
''	End If
'	txtEstadoIncidencia.Text=EstadoIncidencia
'	pnlFondoDatosCierreIncidencia.Visible=False
'	
'	lstAccionesIncidenciaProveedorTemp.Initialize
'	'lstFicherosAccionesIncidenciaTemp.Initialize
'	
'End Sub

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


Sub CargaTreeViewDrawer
	
		
	
	TreeViewDrawer.Root.Children.Clear

	Dim imgTreeItemGo As Image=Main.fx.LoadImageSample(File.Dirassets, "arrow-right16.png",16,16)
	
	Dim img As Image=Utilidades.SetFontToBitmap(Chr(0xf6cf), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
	
	Dim tiSalir As TreeItem
	tiSalir.Initialize("tItem","Salir")
	tiSalir.Image=Utilidades.MaterialIconsToBitmap(Chr(0xE879),24, 0xFFB22222)
	TreeViewDrawer.Root.Children.Add(tiSalir)
		
'	Dim tExpandirTodoMenu As TreeItem
'	tExpandirTodoMenu.Initialize("tItem","Expandir Menu")
'	tExpandirTodoMenu.Image=Utilidades.SetFontToBitmap(Chr(0xf616), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	TreeViewDrawer.Root.Children.Add(tExpandirTodoMenu)
'	
'			
'	Dim tContraerTodoMenu As TreeItem
'	tContraerTodoMenu.Initialize("tItem","Contraer Menu")
'	tContraerTodoMenu.Image=Utilidades.SetFontToBitmap(Chr(0xf615), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	TreeViewDrawer.Root.Children.Add(tContraerTodoMenu)

'	Dim tActualizarDatos As TreeItem
'	tActualizarDatos.Initialize("tItem","Actualizar Datos")
'	tActualizarDatos.Image=Utilidades.SetFontToBitmap(Chr(0xf450), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
'	TreeViewDrawer.Root.Children.Add(tActualizarDatos)
	
	Dim tNuevaIncidenciaProveedor As TreeItem
	tNuevaIncidenciaProveedor.Initialize("tItem","Nueva Incidencia Proveedor")
	tNuevaIncidenciaProveedor.Image=Utilidades.SetFontToBitmap(Chr(0xfa74), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF228B22)
	TreeViewDrawer.Root.Children.Add(tNuevaIncidenciaProveedor)
	
'	Dim tEditarIncidenciaProveedor As TreeItem
'	tEditarIncidenciaProveedor.Initialize("tItem","Editar Incidencia Proveedor")
'	tEditarIncidenciaProveedor.Image=Utilidades.SetFontToBitmap(Chr(0xf4f0), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFFB22222)
'	TreeViewDrawer.Root.Children.Add(tEditarIncidenciaProveedor)
	
	Dim tCerrarIncidenciaProveedor As TreeItem
	tCerrarIncidenciaProveedor.Initialize("tItem","Cerrar Incidencia Proveedor")
	tCerrarIncidenciaProveedor.Image=Utilidades.SetFontToBitmap(Chr(0xF11E), xui.CreateFontAwesome(24),24,0xFFB22222)
	TreeViewDrawer.Root.Children.Add(tCerrarIncidenciaProveedor)
	
	Dim tAnularIncidenciaProveedor As TreeItem
	tAnularIncidenciaProveedor.Initialize("tItem","Anular Incidencia Proveedor")
	tAnularIncidenciaProveedor.Image=Utilidades.SetFontToBitmap(Chr(0xfa75), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Red)
	TreeViewDrawer.Root.Children.Add(tAnularIncidenciaProveedor)
	
	Dim tImprimirIncidenciaProveedor As TreeItem
	tImprimirIncidenciaProveedor.Initialize("tItem","Imprimir Incidencia Proveedor")
	tImprimirIncidenciaProveedor.Image=Utilidades.SetFontToBitmap(Chr(0xf42a), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tImprimirIncidenciaProveedor)
	
	Dim tEnviarEmailIncidenciaProveedor As TreeItem
	tEnviarEmailIncidenciaProveedor.Initialize("tItem","Enviar Email Incidencia Proveedor")
	tEnviarEmailIncidenciaProveedor.Image=Utilidades.SetFontToBitmap(Chr(0xf1f0), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tEnviarEmailIncidenciaProveedor)
	
	
End Sub

Sub EventName_AnimationCompleted
	
End Sub

Private Sub TreeViewDrawer_SelectedItemChanged (SelectedItem As TreeItem)
	
	Drawer.LeftOpen=False
	
	If SelectedItem.IsInitialized=False Then Return
	
	Dim ItemSeleccionado As String=SelectedItem.Text
	Select Case ItemSeleccionado
		
		Case "Nueva Incidencia Proveedor"
			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
				Return
			End If
			IDIncidenciaProveedorAnterior=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
			IncidenciaProveedorAnterior=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
			DatosCabeceraIncidenciaProveedor.Initialize
			lstAccionesIncidenciaProveedor.Initialize
			'lstFicherosAccionesIncidencia.Initialize
			lstFicherosAdjuntosIncidencia.Initialize
'			ModoNuevo
'			MostrarDatosNuevaIncidencia
'			ValoresInicialesNuevaIncidenciaProveedor
			CambioAModoNuevo
'			
'		Case "Editar Incidencia Proveedor"
'			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
'				Return
'			End If
'			wait for(CambioAModoEditar) complete (Success As Boolean)
'			If Not(Success) Then
'				'SalirModulo
'				Return
'			End If
'			
'			
'			
		Case "Cerrar Incidencia Proveedor"
'			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
'				Return
'			End If
'			wait for(CambioAModoEditar) complete (Success As Boolean)
'			If Not(Success) Then
'				'SalirModulo
'				Return
'			End If
			
		Case "Anular Incidencia Proveedor"
			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
				Return
			End If
			Dim msa As Object=xui.MsgboxAsync("Pendiente de programar","Aviso")
			Wait For (msa) Msgbox_Result
			
'		Case "Enviar Email Incidencia Proveedor"
'			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
'				Return
'			End If
'			If txtProveedor.Text="" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio indicar un Proveedor de Navision.")) complete (rObj As Object)
'				Return
'			End If
'			ConfiguracionEnvioEmailIncidencia

		Case "Imprimir Incidencia Proveedor"
			Dim msa As Object=xui.MsgboxAsync("Pendiente de programar","Aviso")
			Wait For (msa) Msgbox_Result
			
		Case "Salir"
			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
				Return
			End If
			Wait For(BorrarTablasBatchDispositivoUsuario) complete (Success As Boolean)
			SalirModulo
			
'		Case "Actualizar Datos"
'			Wait For(ActualizarDatosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (Success As Boolean)
'			If Success=False Then
'				SalirModulo
'				Return
'			End If
			
		Case Else
			Dim msa As Object=xui.MsgboxAsync("pendiente de programar...","Aviso")
			Wait For (msa) Msgbox_Result
			Return
	End Select
End Sub

Sub SalirModulo
	jamLoadingIndicator1.close
	BorrarVBSScriptDireccionRemitenteEmailOutlook
	BorrarVBSScriptEnvioEmailOutlook
	BorrarVBSScriptComprobarAccesoBuzonCompartidoOutlook
	
	Dim cIncProv As cIncidenciasProveedorLista
	cIncProv.Initialize
	cIncProv.DepartamentoEmisor=DepartamentoEmisor
	cIncProv.Show
	frm.Close
	
End Sub

Private Sub btnSelFechaAccionCompras_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	Dialog.Title="Indica Fecha Acción Compras"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaAccionCompras.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaAccionCompras.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaAccionCompras.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
	txtUsuarioAccionCompras.Text=Main.DatosUsuario.NombreUsuarioWindows
End Sub

Private Sub btnSelGravedadIncidencia_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	Dialog.Title="Selecciona Gravedad de la incidencia"
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
	
		
	Dim lstOpciones As List=Array("LEVE","GRAVE")
	
	B4XListDlg.Options=lstOpciones
	
'	B4XListDlg.Resize(500dip, 400dip)
'	B4XListDlg.CustomListView1.AsView.width=500dip
'	B4XListDlg.CustomListView1.AsView.Height=400dip
	
	
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
	jamLoadingIndicator1.Close
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim OpcionSel As String= B4XListDlg.SelectedItem
	txtGravedadIncidencia.Text=OpcionSel
	
End Sub

Private Sub btnSelTipoIncidencia_Click
'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			'SalirModulo
'			Return
'		End If
'	End If
	jamLoadingIndicator1.MensajeLoading="Cargando tipos incidencias proveedor..."
	jamLoadingIndicator1.Show
	Wait For(CargaTiposIncidenciasProveedor) complete (mRes As Map)
	
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim B4XSetTiposIncidencias As B4XSet
	B4XSetTiposIncidencias.Initialize
	Dim lstNombresTiposIncidencia As List
	For Each mData As Map In lstReg
		Log(mData)
		B4XSetTiposIncidencias.Add(mData.Get("NombreTipoIncidencia"))
	Next
	
	Dialog.Title="Selecciona Tipo Incidencia Proveedor"
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
	
		
	Dim lstOpciones As List=B4XSetTiposIncidencias.AsList
	
	B4XListDlg.Options=lstOpciones
	
	B4XListDlg.Resize(500dip, 400dip)
'	B4XListDlg.CustomListView1.AsView.width=500dip
'	B4XListDlg.CustomListView1.AsView.Height=400dip
	
	
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
	jamLoadingIndicator1.Close
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim Opcion As String= B4XListDlg.SelectedItem
	
	
	
End Sub

Sub CargaTiposIncidenciasProveedor As ResumableSub
	mSQL.ExecNonQuery("delete from tblIncidenciasProveedorTiposIncidencias")
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorTiposIncidencias"
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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de tipos de incidencias."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblTiposIncidenciasProveedor",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorTiposIncidencias", lstReg)
		End If
	End If
	Return mRes
	
End Sub





Sub CargaAccionesPredefinidasIncidenciasProveedor As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorAccionesPredefinidas"
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
			Dim msa As Object=xui.MsgboxAsync($"No se han creado aún acciones predefinidas para las incidencias proveedor."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
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



'Sub CargaDepartamentosAsignarAccionesIncidenciasProveedor As ResumableSub
'	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
'	Dim mRes As Map
'	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("lstReg",lstReg)
'	Dim Comando As String="IncidenciasProveedorDepartamentosAsignarAcciones"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
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
'			Dim msa As Object=xui.MsgboxAsync($"No se han creado aún acciones predefinidas para las incidencias proveedor."$,"Aviso")
'			Wait For (msa) Msgbox_Result
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("lstReg", lstReg)
'		End If
'	End If
'	Return mRes
'	
'End Sub


Sub CargaIncidenciasProveedorDepartamentos As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorDepartamentos"
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
			Dim msa As Object=xui.MsgboxAsync($"No se han creado departamentos para las incidencias proveedor."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
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

Sub ConfiguracionEnvioEmailIncidencia As ResumableSub
	wait for(ComprobarExisteVentanaAbiertaOutlookIncidencia(txtNumeroIncidencia.Text)) complete (Success As Boolean)
	If Success Then
		wait for(Utilidades.MsgBox2XUI("Aviso",$"Hay una ventana abierta en Outlook con el número de incidencia actual.
Comprueba su estado.

¿Mostrar esa ventana?"$,"Sí","","NO",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return False
		MoverFocoAOutlookIncidencia(txtNumeroIncidencia.Text)
		Return False
	End If
	
	Return True

End Sub
'
'Sub EnviarEmailIncidencia(CuentaDe As String, sCuentaPara As String, sCuentaCC As String)
'
''	If DireccionSeleccionadaRemitenteEmails="" Then
''		wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
''		If rBool=False Then
''			Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar la dirección desde la que enviar emails." & CRLF & CRLF & "Selecciónala desde el menú de Acciones." ,"Aviso")
''			Wait For (msa) Msgbox_Result
''			Return
''		End If
''	Else
''		Dim msa As Object = xui.Msgbox2Async("La dirección DESDE la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmails, "Direccion envío email", "Sí", "Cancelar", "Seleccionar Otra", Null)
''		Wait For (msa) Msgbox_Result (rInt As Int)
''		Select rInt
''			Case xui.DialogResponse_Cancel
''				Return
''			Case xui.DialogResponse_Negative
''				Dim msa As Object=xui.MsgboxAsync("Selecciona otra cuenta remitente desde el menú Acciones." ,"Aviso")
''				Wait For (msa) Msgbox_Result
''				Return
''		End Select
''	End If
'
'
'	
'	
'' ESTA SCRIPT PARECE QUE SOLO COMPRUEBA SI LA CUENTA DEL BUZON COMPARTIDO EXISTE EN LA LIBRETA DE DIRECCIONES DEL USUARIO
'' NO SI TIENE PERMISO PARA ENVIAR EN NOMBRE DE ...
'	
''	wait for(EjecutarVBSScriptAccesoABuzonCompartido("incidenciasproveedor@protec-marti.com")) complete (mRes As Map)
''	Log("mRes: " & mRes)
''	Dim Success As Boolean=mRes.Get("Success")
''	Dim ExitCode As Int=mRes.Get("ExitCode")
''	Dim StdOut As String=mRes.Get("StdOut")
''	Dim StdErr As String=mRes.Get("StdErr")
''	If Success=False Then
''		Dim msa As Object=xui.MsgboxAsync("Error spt acceso a buzon compartido" & CRLF & "Avisa al administrador de la aplicación.","Error")
''		Wait For (msa) Msgbox_Result
''		Return
''	End If
''	If ExitCode=1 Then
''		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & StdErr,"Error")
''		Wait For (msa) Msgbox_Result
''		Return
''	End If
''	Dim msa As Object=xui.MsgboxAsync("Acceso a buzón compartido, OK","Aviso")
''	Wait For (msa) Msgbox_Result
''	
''	
''	
''
''	
''	Dim DireccionDestinoEmailCC As String
''	
''	Dim msa As Object = xui.Msgbox2Async("¿Añadir otra dirección de email a la que enviar el mensaje en copia?", "", "Sí", "", "No", Null)
''	Wait For (msa) Msgbox_Result (rInt As Int)
''	If rInt=xui.DialogResponse_Positive Then
''		Dialog.Title="Indica Dirección Email Destinatario (Copia)"
''		Dialog.TitleBarHeight=50dip
''		Dim InputDlg As B4XInputTemplate
''		InputDlg.Initialize
''		InputDlg.lblTitle.Text=""
''		InputDlg.Text=""
''		InputDlg.RegexPattern="^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"
''	
''		'InputDlg.mBase.Height = 20%y
''		InputDlg.mBase.Width = 600dip
''	
''		Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
''		Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
''		bOK.TextSize=15
''		Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
''		bCancel.TextSize=15
''		bCancel.Left=bCancel.Left-20dip
''		bCancel.Width=bCancel.Width+20dip
''		Wait For (rSub) complete (rInt As Int)
''
''		If rInt<>xui.DialogResponse_Positive Then
''			Dim msa As Object = xui.Msgbox2Async("No se ha añadido direccion de email destinatario (copia) ¿Continuar con el proceso?", "", "Sí", "", "No", Null)
''			Wait For (msa) Msgbox_Result (rInt As Int)
''			If rInt<>xui.DialogResponse_Positive Then
''				Return
''			End If
''		Else
''			Dim DireccionDestinoEmailCC As String=InputDlg.Text.Trim
''		End If
''	End If
''	
''	If DireccionDestinoEmailCC="" Then DireccionDestinoEmailCC="None"
'	
'	'Dim sbBody As String=$"$Xml{TextAreaDescripcionIncidencia.Text}"$
'	Dim sbBody As String=$"$Xml{BBCodeViewDescripcionIncidencia.Text}"$
'	
'	
'	wait for(EjecutarVBSScriptCrearEmail(CuentaDe,sCuentaPara, sCuentaCC, "Incidencia proveedor " & txtNumeroIncidencia.Text,sbBody,"None")) complete (mRes As Map)
'
'	Log("mRes: " & mRes)
'	Dim Success As Boolean=mRes.Get("Success")
'	Dim ExitCode As Int=mRes.Get("ExitCode")
'	Dim StdOut As String=mRes.Get("StdOut")
'	Dim StdErr As String=mRes.Get("StdErr")
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & "Avisa al administrador de la aplicación.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	If ExitCode=1 Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF  & CRLF & StdErr,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	wait for(Utilidades.MsgBoxXUI("Aviso","Email creado en Outlook.")) complete (rObj As Object)
'	
'	MoverFocoAOutlookIncidencia(txtNumeroIncidencia.Text)
'	
'End Sub

Sub CargaDireccionEmailProveedor(ProvSel As String) As ResumableSub
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="DireccionEmailProveedor"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(ProvSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos del proveedor ${ProvSel} en NAVISION."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
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
		Return ""
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return ""
	End If
	Dim sDireccionesCuentasEmail As String=StdOut.SubString2(0,StdOut.Length-1)
	If sDireccionesCuentasEmail="" Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return ""
	End If
'	
	Dim ArrDireccionesCuentasEmail() As String=Regex.Split(",",sDireccionesCuentasEmail)
	If ArrDireccionesCuentasEmail.Length=1 Then
		Return ArrDireccionesCuentasEmail(0)
	End If
	
	Dim lstDireccionesCuentasEmail As List
	lstDireccionesCuentasEmail.Initialize

	For iDx =0 To ArrDireccionesCuentasEmail.Length-1
		lstDireccionesCuentasEmail.Add(ArrDireccionesCuentasEmail(iDx))
	Next
	
	If lstDireccionesCuentasEmail.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return ""
	End If
	
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
		Return ""
	End If
	

	Return B4XListDlg.SelectedItem


End Sub

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

Sub BorrarVBSScriptDireccionRemitenteEmailOutlook
	If File.Exists(xui.DefaultFolder,"smfpromc.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc.vbs")
	End If
End Sub

Sub BorrarVBSScriptEnvioEmailOutlook
	If File.Exists(xui.DefaultFolder,"smfpromc2.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc2.vbs")
	End If
End Sub

Sub BorrarVBSScriptComprobarAccesoBuzonCompartidoOutlook
	If File.Exists(xui.DefaultFolder,"smfpromcbc.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromcbc.vbs")
	End If
End Sub

Sub CrearScriptVerificarAccesoBuzonCompartido
	
	BorrarVBSScriptComprobarAccesoBuzonCompartidoOutlook
	

	Dim sVBscript As String
            
	sVBscript =$"
		Option Explicit
		On Error Resume Next
		Dim xOLApp, olAccounts, objOwner, objSharedFolder, objPropertyAccesor, objItems
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

		set objOwner=xOLApp.Session.CreateRecipient(WScript.Arguments(0))
		objOwner.Resolve
		
		If objOwner.Resolved Then ' la cuenta está en la libreta de direcciones
			set objSharedFolder= xOLApp.Session.GetSharedDefaultFolder(objOwner,6)  ' 6=Inbox folder
			Set objPropertyAccesor = objSharedFolder.PropertyAccessor
			set objItems=objSharedFolder.Items
			If IsNull(objItems)  Or  IsEmpty(objItems) Then
				objStdOut.write "NOK, sin Acesso a buzón compartido " &  WScript.Arguments(0)
			else
				objStdOut.write "OK, Acesso a buzón compartido " &  WScript.Arguments(0)
			End If
		else
			objStdOut.write "NOK, sin Acesso a buzón compartido " &  WScript.Arguments(0) 
		End If
		
		Set xOLApp = Nothing
		If Err.Number<>0 Then
			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
			WScript.Quit (1)
		Else
			WScript.Quit (0)
		End If
			"$
		
	File.WriteString(xui.DefaultFolder,"smfpromcbc.vbs",sVBscript)
	
	
	
End Sub

'Comprueba si la cuenta indicada existe en la lista de direcciones del usuario en Outlook 
Sub EjecutarVBSScriptAccesoABuzonCompartido(BuzonCompartido As String) As ResumableSub
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromcbc.vbs", BuzonCompartido))  ' nologo para no mostar avisos windows
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
			'Debug.Print xOLApp.Accounts.Item(I) & " : This is account number " & I
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

Sub CrearVBSScriptCrearEmailOutlookHTML

	BorrarVBSScriptEnvioEmailOutlook
	
	Dim sVBscript As String
            
	sVBscript =$"
		Option Explicit
		On Error Resume Next

		Dim objStdOut,objStdErr
		
		Dim signature

		Set objStdOut = WScript.StdOut
		Set objStdErr = WScript.StdErr

		Dim xOLApp

		'Set xOLApp = CreateObject("Outlook.Application")
		Set xOLApp =GetObject(, "Outlook.Application")
		If Err.Number<>0 Then
			Set xOLApp = Nothing
			If Err.Number=429 Then
				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
			Else
				objStdErr.Write Err.Number & " " & Err.Description
			End If
			WScript.Quit(1) 'return code 1
		End If
		

		Dim objMailItem
		'Dim lstDest, Recipients, Recipient, ToDestinatario, CCDestinatario, objOutlookRecip, iDx
		Set objMailItem = xOLApp.CreateItem(0)
		
		objMailItem.Display

		signature = objMailItem.HTMLBody
		'MsgBox signature
		
		
		'objMailItem.SendUsingAccount = WScript.Arguments(0)
		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
		
		'if InStr(WScript.Arguments(1),";")=0 then
			objMailItem.To = WScript.Arguments(1)
		'else
		'	Set Recipients=objMailItem.Recipients
		'	Set lstDest=Split(WScript.Arguments(1),";")
		'	'MsgBox "lstDesr size " & UBound(lstDest)
		'	WScript.Echo "lstDesr size " & UBound(lstDest)
		'	for each ToDestinatario in lstDest
		'	'MsgBox ToDestinatario
		'		Set Recipient = Recipients.Add(ToDestinatario)
		'		Recipient.Type = 3  ' 3 = To  tambien se puede dejar en blanco, ya que el tipo "To" (3) es el tipo por defecto
		'	next
		'	For Each objOutlookRecip In objMailItem.Recipients
		'		objOutlookRecip.Resolve
		'	Next
		'end if
		
		if WScript.Arguments(2)<>"None" then
			'MsgBox "Varios destinatarios CC"
			'if InStr(WScript.Arguments(2),";")=0 then
			'	objMailItem.CC = WScript.Arguments(2)
			'else
			'	Set Recipients=objMailItem.Recipients
			'	Set lstDest=Split(WScript.Arguments(2),";")
			'	MsgBox "lstDesr size " + UBound(lstDest)
			'	For iDx=0 to UBound(lstDest)-1
			'		Set CCDestinatario=lstDest(iDx)
			'		Set Recipient = Recipients.Add(CCDestinatario)
			'		Recipient.Type = 1  ' 1 = CC
			'	Next
			'	MsgBox "antes de For Each objOutlookRecip In objMailItem.Recipients CC"
			'	For Each objOutlookRecip In objMailItem.Recipients
			'		MsgBox objOutlookRecip.Address
			'		objOutlookRecip.Resolve
			'	Next
			'end if
			objMailItem.CC = WScript.Arguments(2)
		end if
		
		objMailItem.Subject = WScript.Arguments(3)
		'msgbox WScript.Arguments(4)
		objMailItem.HTMLBody = "<p><br>" & WScript.Arguments(4) & "</p>" & signature 
		'msgbox objMailItem.HTMLBody
		'objMailItem.Body = WScript.Arguments(4) & vbNewLine & signature
		
		if WScript.Arguments(5)<>"None" then
			objMailItem.Attachments.Add WScript.Arguments(5)
		end if

		'objMailItem.Display
		'objMailItem.Send

		Set xOLApp = Nothing
		Set objMailItem = Nothing
		'Set lstDest = Nothing
		'Set Recipients = Nothing
		'Set Recipient = Nothing
		'Set ToDestinatario = Nothing
		'Set CCDestinatario = Nothing
		'Set objOutlookRecip = Nothing
		'Set IDx = Nothing
		
		If Err.Number = 0 Then
			objStdOut.Write "Email creado"
			WScript.Quit (0)
		Else
			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
			WScript.Quit (1)
		End If
			"$
			
	File.WriteString(xui.DefaultFolder,"smfpromc2.vbs",sVBscript)
End Sub

Sub CrearVBSScriptCrearEmailOutlookHTMLSinRemitente

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
				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) +" n (err 429)"
			Else
	'MsgBox Err.Number & " " & Err.Description
				objStdErr.Write Err.Number & " " & Err.Description
			End If
			WScript.Quit (1) 'return code 1
		End If
		Set objMailItem = xOLApp.CreateItem(0)
		
   		objMailItem.Display
		
	'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))
		
	'objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
	objMailItem.SendUsingAccount = WScript.Arguments(0)
	'objMailItem.SendUsingAccount = OutAccount
	'objMailItem.SentOnBehalfOfName = OutAccount
		
		objMailItem.To = WScript.Arguments(1)
		if WScript.Arguments(5)<>"None" then
			objMailItem.CC = WScript.Arguments(5)
		end if
		objMailItem.Subject = WScript.Arguments(2)
		objMailItem.HTMLBody = WScript.Arguments(3) & "<br><br>" & objMailItem.HTMLBody & "</p>"
		if WScript.Arguments(4)<>"" then
			objMailItem.Attachments.Add WScript.Arguments(4)
		end if
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

Sub EjecutarVBSScriptCrearEmail(SenderAddr As String, ReceiverAddr As String,CCReceiverAddr As String, Subject As String, Body As String, FileAttch As String) As ResumableSub
	'SenderAddr="Informática y Comunicación Proin-Pinilla"
	
	Body=Body.Replace(CRLF,"<br>")
	
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromc2.vbs",SenderAddr, ReceiverAddr,CCReceiverAddr,Subject, Body, FileAttch))  ' nologo para no mostar avisos windows
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




Private Sub lblIconCerrarDrawer_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen=False
End Sub

Private Sub lblTextoCerrarDrawer_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen=False
End Sub

Private Sub pnlTopDrawerLeft_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen=False
End Sub




Sub CargaIncidenciasProveedorTiposDocumentos As ResumableSub
	jamLoadingIndicator1.MensajeLoading="Cargando tipos documentos..."
	jamLoadingIndicator1.Show
	mSQL.ExecNonQuery("delete from tblIncidenciasProveedorTiposDocumentos")
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="IncidenciasProveedorTiposDocumentos"
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
			Dim msa As Object=xui.MsgboxAsync($"No se han definido aún tipos de documentos. Avisa al administrador de la aplicación."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorTiposDocumentos",mData0,"")
			Accion="OK"
			mRes.Put("Accion", Accion)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorTiposDocumentos",lstReg)
		End If
	End If
	Return mRes
End Sub


Sub RemoveHTMLTags(HtmlText As String) As String

'	Dim Pattern, Replacement As String
'	Dim m As Matcher
'
'	Pattern = "<[^>]*>"
'	Replacement = " "
'
'	m = Regex.Matcher2(Pattern, Regex.CASE_INSENSITIVE, Text)
'
'	Dim r As Reflector
'    
'	r.Target = m
'  
'	Return r.RunMethod2("replaceAll", Replacement, "java.lang.String")

	Return Regex.Replace("<[^>]*>",HtmlText,"")

End Sub

Sub MoverFocoAOutlookIncidencia(NumeroIncidencia As String)
	Log("Buscando window title " & NumeroIncidencia)
	Dim WU As JavaObject
	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
	Dim user32 As JavaObject
	user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
	Dim flagok As Boolean
	For Each JO As JavaObject In L
		Dim t As String = JO.RunMethod("getTitle",Null)
		'Log("window title" & t)
		If t.Contains($"Incidencia proveedor ${NumeroIncidencia} - Mensaje"$) Then
			flagok=True
			Try
				SetForegroundWindow(t)
			Catch
				Log(LastException.Message)
				wait for(Utilidades.MsgBoxXUI("Aviso",$"No ha sido posible abrir la ventana de Outlook con el correo de la incidencia ${NumeroIncidencia}.
Selecciónala manualmente en Outlook, para enviar el correo."$)) complete (rObj As Object)
			End Try
			Exit
		End If
	Next
	If flagok=False Then
		wait for(Utilidades.MsgBoxXUI("Aviso",$"No ha sido posible abrir la ventana de Outlook con el correo de la incidencia ${NumeroIncidencia}.
Selecciónala manualmente en Outlook, para enviar el correo."$)) complete (rObj As Object)
	End If
End Sub

' pasa el foco a otra aplicacion de Windows
'para usar conjuntamente, por ejemplo, con jSHELL , abrir ventana navision
' tambien usado por jamLinkNavision
'requiere:
'#AdditionalJar: jna-5.6.0
'#AdditionalJar: jna-platform-5.6.0
Sub SetForegroundWindow(Title As String)
	Dim WU As JavaObject
	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
	Dim user32 As JavaObject
	user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
	For Each JO As JavaObject In L
		Dim t As String = JO.RunMethod("getTitle",Null)
		Log(t)
		If t.Contains(Title) Then
			Dim hwnd As Object = JO.RunMethod("getHWND", Null)
			user32.RunMethod("SetForegroundWindow", Array(hwnd))
			user32.RunMethod("SetFocus", Array(hwnd))
			user32.RunMethod("ShowWindow", Array(hwnd, 9))'SW_RESTORE
			Return
		End If
	Next
	Log("Window not found")
End Sub

Sub ComprobarExisteVentanaAbiertaOutlookIncidencia(NumeroIncidencia As String) As ResumableSub

	Log("Buscando window title " & NumeroIncidencia)
	Dim WU As JavaObject
	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
	Dim user32 As JavaObject
	user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
	Dim ExisteVentanaAbiertaIncidencia As Boolean
	For Each JO As JavaObject In L
		Dim t As String = JO.RunMethod("getTitle",Null)
		'Log("window title" & t)
		If t.Contains($"Incidencia proveedor ${NumeroIncidencia} - Mensaje"$) Then
			ExisteVentanaAbiertaIncidencia=True
			Exit
		End If
	Next
	Return ExisteVentanaAbiertaIncidencia
End Sub



'Sub MostrarSeleccionarCuentasCorreoIncidencia
'	For Each xNode As B4XView In frm.RootPane
'		If xNode Is Pane Then
'			If xNode.Tag="BackgroundSeleccionCuentasCorreoIncidencia" Then
'				xNode.RemoveViewFromParent
'				Exit
'			End If
'		End If
'	Next
'	
'	BackgroundSeleccionCuentasCorreoIncidencia= xui.CreatePanel("BackgroundSeleccionCuentasCorreoIncidencia")
'	BackgroundSeleccionCuentasCorreoIncidencia.Tag = "BackgroundSeleccionCuentasCorreoIncidencia"
'	BackgroundSeleccionCuentasCorreoIncidencia.Color=0xaa000000
'	frm.RootPane.AddNode(BackgroundSeleccionCuentasCorreoIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)
'
'	BaseSeleccionCuentasCorreoIncidencia=xui.CreatePanel("pnlBaseSeleccionCuentasCorreoIncidencia")
'	BaseSeleccionCuentasCorreoIncidencia.SetLayoutAnimated(0,0,0,700dip, 450dip)
'	BaseSeleccionCuentasCorreoIncidencia.LoadLayout("scrIncidenciasProveedorSeleccionDatosEmailFaseIncidencia")
'
'	
'	BackgroundSeleccionCuentasCorreoIncidencia.AddView(BaseSeleccionCuentasCorreoIncidencia,(BackgroundSeleccionCuentasCorreoIncidencia.Width/2-BaseSeleccionCuentasCorreoIncidencia.Width/2), _
'		(BackgroundSeleccionCuentasCorreoIncidencia.Height/2-BaseSeleccionCuentasCorreoIncidencia.Height/2), BaseSeleccionCuentasCorreoIncidencia.Width, BaseSeleccionCuentasCorreoIncidencia.Height)
'		
'	RadioButtonDeIncidenciasProveedor.Checked=True
'	RadioButtonDeIncidenciasCompras.Checked=False
'	RadioButtonDeCuentaUsuario.Checked=False
'	
'	CheckBoxParaProveedor.As(CheckBox).Checked=True
'	CheckBoxParaIncidenciasCompras.As(CheckBox).Checked=False
'	CheckBoxParaIncidenciasProveedor.As(CheckBox).Checked=False
'	
'	CheckBoxCCIncidenciasCompras.As(CheckBox).Checked=True
'	CheckBoxCCIncidenciasProveedor.As(CheckBox).Checked=False
'	CheckBoxCCFacturas.As(CheckBox).Checked=True
'	
'End Sub



Private Sub CheckBoxParaProveedor_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub CheckBoxParaIncidenciasProveedor_CheckedChange(Checked As Boolean)
	If Checked Then CheckBoxCCIncidenciasProveedor.Checked=False
End Sub

Private Sub CheckBoxParaIncidenciasCompras_CheckedChange(Checked As Boolean)
	If Checked Then CheckBoxCCIncidenciasCompras.Checked=False
End Sub

Private Sub CheckBoxCCIncidenciasProveedor_CheckedChange(Checked As Boolean)
	If Checked Then CheckBoxParaIncidenciasProveedor.Checked=False
End Sub

Private Sub CheckBoxCCIncidenciasCompras_CheckedChange(Checked As Boolean)
	If Checked Then CheckBoxParaIncidenciasCompras.Checked=False
End Sub

'Private Sub btnOKCuentasCorreoIncidencia_Click
'	
'	SalirSeleccionCuentasCorreoIncidencia
'	
'	Dim CuentaDEEmailIncidencia As String
'	Dim sCuentasParaEmailIncidencia As String
'	Dim sCuentasCCEmailIncidencia As String
'	Select True
'		Case RadioButtonDeCuentaUsuario.As(RadioButton).Selected
'			wait for(SeleccionarDireccionRemitenteEmails) complete (sCuenta As String)
'			If sCuenta="" Then 
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio seleccionar una cuenta de remitente.")) complete (rObj As Object)
'				Return
'			End If
'			CuentaDEEmailIncidencia=sCuenta
'		Case RadioButtonDeIncidenciasProveedor.As(RadioButton).Selected
'			CuentaDEEmailIncidencia=NombreCuentaIncidenciasProveedor
'		Case RadioButtonDeIncidenciasCompras.As(RadioButton).Selected
'			CuentaDEEmailIncidencia=NombreCuentaIncidenciasCompras
'	End Select
'	
'	If CheckBoxParaProveedor.Checked Then
'		wait for (SeleccionarCuentaEmailProveedor(txtProveedor.Text)) complete (sResp As String)
'		If sResp="" Then
'			wait for(Utilidades.MsgBoxXUI("Cuenta email proveedor no seleccionada","Indica la cuenta de email del proveedor en el correo, en Outlook,")) complete (rObj As Object)
'		Else
'			sCuentasParaEmailIncidencia=sResp
'		End If
'	End If
'	
'	If CheckBoxParaIncidenciasProveedor.Checked Then
'		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
'		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaIncidenciasProveedor
'	End If
'	If CheckBoxParaIncidenciasCompras.Checked Then
'		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
'		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaIncidenciasCompras
'	End If
'	
'	If CheckBoxCCIncidenciasProveedor.Checked Then
'		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
'		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaIncidenciasProveedor
'	End If
'	If CheckBoxCCIncidenciasCompras.Checked Then
'		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
'		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaIncidenciasCompras
'	End If
'	If CheckBoxCCFacturas.Checked Then
'		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
'		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & EmailFacturas
'	End If
'	
'	If sCuentasParaEmailIncidencia="" Then sCuentasParaEmailIncidencia="None"
'	If sCuentasCCEmailIncidencia="" Then sCuentasCCEmailIncidencia="None"
'	
'	EnviarEmailIncidencia(CuentaDEEmailIncidencia, sCuentasParaEmailIncidencia, sCuentasCCEmailIncidencia)
'	
'End Sub
'
'Private Sub btnCancelarCuentasCorreoIncidencia_Click
'	SalirSeleccionCuentasCorreoIncidencia
'End Sub
'
'Sub SalirSeleccionCuentasCorreoIncidencia
'	For Each xNode As B4XView In BackgroundSeleccionCuentasCorreoIncidencia.GetAllViewsRecursive
'		xNode.RemoveViewFromParent
'	Next
'	BackgroundSeleccionCuentasCorreoIncidencia.RemoveViewFromParent
'End Sub

Private Sub RadioButtonDeCuentaUsuario_SelectedChange(Selected As Boolean)
	
End Sub

Private Sub RadioButtonDeIncidenciasCompras_SelectedChange(Selected As Boolean)
	If Selected Then
		CheckBoxCCIncidenciasCompras.Checked=False
		CheckBoxParaIncidenciasCompras.Checked=False
	End If
End Sub

Private Sub RadioButtonDeIncidenciasProveedor_SelectedChange(Selected As Boolean)
	If Selected Then
		CheckBoxCCIncidenciasProveedor.Checked=False
		CheckBoxParaIncidenciasProveedor.Checked=False
	End If
End Sub

Sub SeleccionarCuentaEmailProveedor(ProvSel As String)  As ResumableSub

	Wait For(CargaDireccionEmailProveedor(ProvSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return ""
	Dim lstReg As List=mRes.Get("lstReg")
	Dim mData0 As Map=lstReg.Get(0)
	Dim DireccionEmailProveedor As String=mData0.Get("E-Mail")
	If DireccionEmailProveedor="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso","La dirección de email del proveedor está vacía en la ficha de NAVISION")) complete (rObj As Object)
		Return ""
	End If
	
	Dialog.Title="Confirma Dirección Email Proveedor"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=DireccionEmailProveedor.Trim
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

	If rInt<>xui.DialogResponse_Positive Then Return ""
	Dim DireccionDestinoEmail As String=InputDlg.Text.Trim
	Return DireccionDestinoEmail

End Sub

Private Sub cboDepartamentoGestorAccionLinea_ValueChanged (Value As Object)
	
End Sub

Private Sub cboDepartamentoGestorAccionLinea_SelectedIndexChanged(Index As Int, Value As Object)
	
End Sub

Private Sub lblAddAccionIncidencia_MouseEntered (EventData As MouseEvent)
	lblAddAccionIncidencia.SetColorAndBorder(0xFFFFD700,1dip,xui.Color_Black,10)
End Sub

Private Sub lblAddAccionIncidencia_MouseExited (EventData As MouseEvent)
	lblAddAccionIncidencia.SetColorAndBorder(0xFF00FA9A,1dip,xui.Color_Black,10)
	If lblAddAccionIncidencia.IsInitialized=False Then Return
End Sub

Private Sub lblAddAccionIncidencia_MouseClicked (EventData As MouseEvent)
	lblAddAccionIncidencia.SetColorAndBorder(lblAddAccionIncidencia.Color,1dip,xui.Color_Black,10)
	ModoAccion="NuevaAccion"
	
	Dim MaxIDLineaAccionTemp As Int
	For Each Fase As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedor
		Dim IDLineaAccionTempFase As Int=Fase.IDLineaAccionTemp
		If IDLineaAccionTempFase>MaxIDLineaAccionTemp Then
			MaxIDLineaAccionTemp=IDLineaAccionTempFase
		End If
	Next
	
	Dim NuevoIDLineaAccionTemp As Int=MaxIDLineaAccionTemp+1

	Dim DatosNuevaAccion As TipoDatosAccionIncidencia
	DatosNuevaAccion.Initialize
	DatosNuevaAccion.IDLineaAccionTemp=NuevoIDLineaAccionTemp
	DatosNuevaAccion.FechaLineaAccionLong=DateTime.Now
	DatosNuevaAccion.IDIncidencia=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
	DatosNuevaAccion.UsuarioCreacionLineaAccion=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
	DatosNuevaAccion.TipoCambio="Nueva"
	
	wait for(MostrarPanelNuevaEditarAccionIncidencia(DatosNuevaAccion)) complete (Success As Boolean)
	If Not(Success) Then Return

	MostrarDatosNuevaAccion
End Sub

Private Sub lblAddAccionIncidencia_MouseReleased (EventData As MouseEvent)
	lblAddAccionIncidencia.SetColorAndBorder(0xFF00FA9A,1dip,xui.Color_Black,10)
End Sub

Sub EliminarItemCLVAccionesNuevaAccion
	For iDX=0 To clvAccionesIncidencia.Size-1
		If clvAccionesIncidencia.GetValue(iDX) Is String Then
			Dim sData As String=clvAccionesIncidencia.GetValue(iDX)
			If sData="Nuevo" Then
				clvAccionesIncidencia.RemoveAt(iDX)
				Exit
			End If
		End If
	Next
End Sub

'Sub AddItemCLVAccionesNuevaAccion(DataAccionNueva As TipoDatosAccionIncidencia)
Sub AddItemCLVAccionesNuevaAccion
	EliminarItemCLVAccionesNuevaAccion
	Dim pnl As B4XView=xui.CreatePanel("")
	pnl.SetLayoutAnimated(0,5dip,5dip,clvAccionesIncidencia.AsView.Width-10dip,35dip)
	pnl.Color=xui.Color_Transparent
	pnl.LoadLayout("scrIncidenciasProveedorAddAccionIncidencia")
'	If clvAccionesIncidencia.Size Mod 2=0 Then
'		pnlFondoItemAccion.Color=Color1
'	Else
'		pnlFondoItemAccion.Color=Color2
'	End If
'	Dim mData As Map
'	mData.Initialize
'	mData.Put("Nuevo","Nuevo")

'	Dim MaxIDAccionTemp As Int
'	For Each DataAccion As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedorTemp
'		Dim IDAccion As Int=DataAccion.IDLineaAccionTemp
'		If IDAccion>MaxIDAccionTemp Then MaxIDAccionTemp=IDAccion
'	Next

	clvAccionesIncidencia.Add(pnl,"")
End Sub

Sub MostrarPanelNuevaEditarAccionIncidencia(DataAccionSel As TipoDatosAccionIncidencia) As ResumableSub
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundAccionIncidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundAccionIncidencia= xui.CreatePanel("BackgroundAccionIncidencia")
	BackgroundAccionIncidencia.Tag = "BackgroundAccionIncidencia"
	BackgroundAccionIncidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundAccionIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseAccionIncidencia=xui.CreatePanel("pnlBaseAccionIncidencia")
	BaseAccionIncidencia.SetLayoutAnimated(0,0,0,850dip, 450dip)
	BaseAccionIncidencia.LoadLayout("scrIncidenciaProveedorNuevoEditarAccionIncidencia")

	BackgroundAccionIncidencia.AddView(BaseAccionIncidencia,(BackgroundAccionIncidencia.Width/2-BaseAccionIncidencia.Width/2), _
		(BackgroundAccionIncidencia.Height/2-BaseAccionIncidencia.Height/2), BaseAccionIncidencia.Width, BaseAccionIncidencia.Height)
		
	pnlFondoNuevaEditarAccion.Tag=DataAccionSel
		
	btnCopiarInfoLineasPedidoCompraADescripcionFaseIncidencia.Text="Copiar Info Líneas Pedido Compra a Descripción"
				
	ChoiceBoxGravedadIncidencia.Items.AddAll(Array("LEVE","GRAVE"))
	
	jamLoadingIndicator1.MensajeLoading="Cargando tipos incidencias proveedor..."
	jamLoadingIndicator1.Show
	Wait For(CargaTiposIncidenciasProveedor) complete (mRes As Map)
	
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return False
	Dim lstReg As List=mRes.Get("lstReg")
	Dim B4XSetTiposIncidencias As B4XSet
	B4XSetTiposIncidencias.Initialize
	'Dim lstNombresTiposIncidencia As List
	For Each mData As Map In lstReg
		Log(mData)
		B4XSetTiposIncidencias.Add(mData.Get("NombreTipoIncidencia"))
	Next
	For Each value As String In B4XSetTiposIncidencias.AsList
		cboTipoIncidenciaNuevaEditar.Items.Add(value)
	Next

	jamLoadingIndicator1.MensajeLoading="Cargando departamentos incidencias proveedor..."

'	Wait For(CargaDepartamentosAsignarAccionesIncidenciasProveedor) complete (mRes As Map)
'
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then Return False
'	Dim lstReg As List=mRes.Get("lstReg")
'	Dim B4XSetDepartamentosAccionesIncidencias As B4XSet
'	B4XSetDepartamentosAccionesIncidencias.Initialize
'	'Dim lstDepartamentosAccionesIncidencias As List
'	For Each mData As Map In lstReg
'		Log(mData)
'		B4XSetDepartamentosAccionesIncidencias.Add(mData.Get("Departamento"))
'	Next
'	For Each value As String In B4XSetDepartamentosAccionesIncidencias.AsList
'		cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Items.Add(value)
'	Next

	Wait For(CargaDatosConfiguracionCuentasEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Return False
	End If
	
	Wait For(CargaDatosConfiguracionCuentaArchivadoEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return False
	Dim mDataArch As Map=mRes.Get("mData0")
	CuentaEmailArchivadoIncidencias=mDataArch.Get("DireccionEmail")
	NombreCuentaEmailArchivadoIncidencias=mDataArch.Get("NombreCuenta")


	Dim lstOpciones As List=DBUtils.ExecuteList(mSQL,"select Departamento from tblIncidenciasProveedorCuentasEmailIncidencias order by Departamento",Null,0)
	For Each Dpto As String In lstOpciones
		cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Items.Add(Dpto)
	Next

	jamLoadingIndicator1.Close
		
'	Select Case ModoAccion
'		Case "NuevaAccion"
'			MostrarDatosNuevaAccion
'			
'		Case "EditarAccion"
'			MostrarDatosEditarAccion(mDataAccion)
'	End Select

	Return True
		
End Sub

Private Sub btnCancelarNuevoEditarAccionIncidencia_Click
	Dim msa As Object = xui.Msgbox2Async($"¿Cancelar la grabación de la fase de la incidencia?
Se perderán los datos no guardados."$,"Confirma", "Sí","Cancelar", "", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	BackgroundAccionIncidencia.RemoveAllViews
	BackgroundAccionIncidencia.RemoveViewFromParent
End Sub

Private Sub btnGrabarNuevoEditarAccionIncidencia_Click
	
	If TextAreaDescripcionAccionNuevaEditar.Text="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio indicar la descripción de la acción.")) complete (rObj As Object)
		Return
	End If
	
'	If B4XSwitchAccionCierraIncidencia.Value Then
'		If cboTipoIncidenciaNuevaEditar.SelectedIndex=-1 Then
'			wait for(Utilidades.MsgBoxXUI("Aviso","Para acciones que cierran la incidencia, es obligatorio indicar el tipo de incidencia acción.")) complete (rObj As Object)
'			Return
'		End If
'	Else
		If cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.SelectedIndex=-1 Then
			'wait for(Utilidades.MsgBoxXUI("Aviso","Para acciones que no cierran la incidencia, es obligatorio indicar el departamento al que se asigna la acción.")) complete (rObj As Object)
			wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio indicar el departamento al que se asigna la acción.")) complete (rObj As Object)
			Return
		End If
'	End If
	
	'Log(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)
	
	Dim DatosAccionNuevaEditada As TipoDatosAccionIncidencia=pnlFondoNuevaEditarAccion.Tag
	
	'Dim AccionCierraIncidenciaPrevia As Boolean=DatosAccionNuevaEditada.AccionCierraIncidencia  ' Accion cierra incidena ANTES de ser editada

'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
	
	'DatosAccionNuevaEditada.AccionCierraIncidencia=B4XSwitchAccionCierraIncidencia.Value
	DatosAccionNuevaEditada.DescripcionAccion=TextAreaDescripcionAccionNuevaEditar.Text.trim
	DatosAccionNuevaEditada.FechaLineaAccionLong=DateTime.now
	DatosAccionNuevaEditada.UsuarioCreacionLineaAccion=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
'	If DatosAccionNuevaEditada.AccionCierraIncidencia Then
''		DatosCabeceraIncidenciaProveedorTemp.EstadoIncidencia="CERRADA"
''		
'		DatosCabeceraIncidenciaProveedor.FechaCierreLong=DateTime.DateParse(txtFechaCierreIncidenciaNuevaEditar.Text)
'		DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre=txtUsuarioCierreIncidenciaNuevaEditar.Text
'		DatosCabeceraIncidenciaProveedor.IDTipoIncidencia=mSQL.ExecQuerySingleResult2($"
'select IDTipoIncidencia from tblIncidenciasProveedorTiposIncidencias where NombreTipoIncidencia=?"$, Array As String(cboTipoIncidenciaNuevaEditar.Value))
'		DatosCabeceraIncidenciaProveedor.NombreTipoIncidencia=cboTipoIncidenciaNuevaEditar.Value
'		DatosCabeceraIncidenciaProveedor.GravedadIncidencia=ChoiceBoxGravedadIncidencia.Items.get(ChoiceBoxGravedadIncidencia.SelectedIndex)
'
'		DatosAccionNuevaEditada.DepartamentoAsignadoAccion=""
'	Else
			
'		If AccionCierraIncidenciaPrevia=1 Then	 ' la accion cerraba la incidencia antes de ser editada, y ahora ya no la cierra
'			DatosCabeceraIncidenciaProveedor.EstadoIncidencia=0   ' 0="ABIERTA"
'			DatosCabeceraIncidenciaProveedor.FechaCierreLong=0
'			DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre=""
'			DatosCabeceraIncidenciaProveedor.IDTipoIncidencia=0
'			DatosCabeceraIncidenciaProveedor.NombreTipoIncidencia=0
'			DatosCabeceraIncidenciaProveedor.GravedadIncidencia=""
'		End If
		
		DatosAccionNuevaEditada.DepartamentoAsignadoAccion=cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Value
'	End If
	
'	For Each AccionIncidenciaTemp As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedorTemp
'		Dim IDLineaAccion As Int=AccionIncidenciaTemp.IDLineaAccion
'		Dim IDLineaAccionTemp As Int=AccionIncidenciaTemp.IDLineaAccionTemp
'		If DatosAccionNuevaEditada.IDLineaAccion=IDLineaAccion And DatosAccionNuevaEditada.IDLineaAcciontemp=IDLineaAccionTemp Then
''			AccionIncidenciaTemp.AccionCierraIncidencia=DatosAccionNuevaEditada.AccionCierraIncidencia
''			AccionIncidenciaTemp.Anulada=DatosAccionNuevaEditada.Anulada
	''			AccionIncidenciaTemp.DepartamentoAsignadoAccion=DatosAccionNuevaEditada.DepartamentoAsignadoAccion
''			AccionIncidenciaTemp.DescripcionAccion=DatosAccionNuevaEditada.DescripcionAccion
''			AccionIncidenciaTemp.FechaLineaAccionLong=DatosAccionNuevaEditada.FechaLineaAccionLong
''			AccionIncidenciaTemp.IDIncidencia=DatosAccionNuevaEditada.IDIncidencia
'			AccionIncidenciaTemp=CopyObject(DatosAccionNuevaEditada)
'			Exit
'		End If
'	Next

	If ModoAccion="NuevaAccion" Then
		'lstAccionesIncidenciaProveedor.Add(DatosAccionNuevaEditada)
		Wait For(GrabarNuevaTareaIncidencia(DatosAccionNuevaEditada)) complete (mRes As Map)	
		Dim Accion As String=mRes.Get("Accion")
		If Accion="NOK" Then Return
		
		Dim CuerpoMensaje As String=$"<b>Descripción de la nueva tarea:</b>
${DatosAccionNuevaEditada.DescripcionAccion}

<b>Descripción de la incidencia:</b>
${DatosCabeceraIncidenciaProveedor.DescripcionIncidencia}
	
"$

		Dim UsuarioTarea As String=DatosAccionNuevaEditada.UsuarioCreacionLineaAccion
		Dim DepartamentoAsignadoTarea As String=DatosAccionNuevaEditada.DepartamentoAsignadoAccion
		Dim IncidenciaTarea As String=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
		
		jamLoadingIndicator1.MensajeLoading="Enviando email nueva tarea incidencia..."
		jamLoadingIndicator1.Show
		
		Wait For(EnvioAutomaticoEmailNuevaTareaIncidencia(UsuarioTarea, DepartamentoAsignadoTarea, IncidenciaTarea, CuerpoMensaje)) complete (sResp As String)
		jamLoadingIndicator1.Close
		Dim msgAviso As String
		If sResp.StartsWith("ERROR") Then
			msgAviso=$"No ha sido posible enviar automáticamente el email de creación de nueva tarea al departamento asignado.
			ERROR: ${sResp}.
			Enviar manualmente el email desde el menú de tarea."$
		Else
			msgAviso=$"Se ha enviado automáticamente el email de creación de nueva tarea al departamento asignado."$
		End If
		Dim msa As Object=xui.MsgboxAsync(msgAviso,"Aviso")
		Wait For (msa) Msgbox_Result
	Else
		'????????
		
		Dim Accion As String=mRes.Get("Accion")
		If Accion="NOK" Then Return
	End If



	
	
	
'	DateTime.DateFormat=DateFormatAnt
	BackgroundAccionIncidencia.RemoveAllViews
	BackgroundAccionIncidencia.RemoveViewFromParent
	CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
End Sub

Sub GrabarNuevaTareaIncidencia(DatosAccionNueva As TipoDatosAccionIncidencia) As ResumableSub
	
'	IDIncSel int, FechSel long
'	, UsuCreac varchar(255), DescrAcc text,DptoAsignAcc varchar(255))
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorNuevaTareaIncidencia"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor,DatosAccionNueva.FechaLineaAccionLong, _
		DatosAccionNueva.UsuarioCreacionLineaAccion, DatosAccionNueva.DescripcionAccion, DatosAccionNueva.DepartamentoAsignadoAccion), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de tipos de incidencias."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
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


Sub GrabarEdicionTareaIncidencia() As ResumableSub

'sql.IncidenciasProveedorEditarDescripcionDepartamentoAsignadoAccionIncidencia=UPDATE datoscomunes.tblincidenciasproveedoracciones \
'	SET DescripcionAccion=?, DepartamentoAsignadoAccion=? WHERE IDLineaAccion = ?


End Sub

Sub MostrarDatosNuevaAccion
	lblTitleAcciónIncidencia.Text="Nueva Tarea Incidencia"
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtFechaAccionNuevaEditar.Text=DateTime.Date(DateTime.Now)
	DateTime.DateFormat=DateFormatAnt
	ChoiceBoxGravedadIncidencia.SelectedIndex=ChoiceBoxGravedadIncidencia.Items.IndexOf("LEVE")
	BaseAccionIncidencia.Height=440dip
'	lblTitleUsuarioCierreIncidencia.Visible=False
'	txtUsuarioCierreIncidencia.Visible=False
'	lblTitleFechaCierreIncidencia.Visible=False
'	txtFechaCierreIncidencia.Visible=False
'	btnSelFechaCierreIncidencia.Visible=False
'	lblTitleGravedadIncidencia.Visible=False
'	cboTipoIncidencia.Visible=False
'	ChoiceBoxGravedadIncidencia.Visible=False
	B4XSwitchAccionCierraIncidencia.Value=False
	pnlFondoDatosCierreIncidenciaNuevaEditar.Visible=False
	lblTitleDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=True
	cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=True
End Sub

Sub MostrarDatosEditarAccion(DataAccion As TipoDatosAccionIncidencia)
	lblTitleAcciónIncidencia.Text="Editar Tarea Incidencia"
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtFechaAccionNuevaEditar.Text=DateTime.Date(DataAccion.FechaLineaAccionLong)
	TextAreaDescripcionAccionNuevaEditar.Text=DataAccion.DescripcionAccion
	'txtUsuarioCreacionAccionLinea.Text=mDataAccion.Get("UsuarioCreacionLineaAccion")
	Dim AccionCierraIncidencia As Boolean=DataAccion.AccionCierraIncidencia
	B4XSwitchAccionCierraIncidencia.value=AccionCierraIncidencia
	lblTitleDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=Not(AccionCierraIncidencia)
	cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=Not(AccionCierraIncidencia)
	lblTitleDepartamentoGestorAccionLinea.Visible=Not(AccionCierraIncidencia)
	pnlFondoDatosCierreIncidenciaNuevaEditar.Visible=AccionCierraIncidencia
	If Not(AccionCierraIncidencia) Then
		BaseAccionIncidencia.Height=440dip
		Dim cboDepIDX As Int=cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Items.IndexOf(DataAccion.DepartamentoAsignadoAccion)
		cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.SelectedIndex=cboDepIDX
		
	Else
		BaseAccionIncidencia.Height=540dip
		txtTipoIncidencia.Text=DatosCabeceraIncidenciaProveedor.NombreTipoIncidencia
		txtUsuarioCierreIncidenciaNuevaEditar.Text=DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre
		txtFechaCierreIncidenciaNuevaEditar.Text=DateTime.Date(DatosCabeceraIncidenciaProveedor.FechaCierreLong)
		ChoiceBoxGravedadIncidencia.SelectedIndex=ChoiceBoxGravedadIncidencia.Items.IndexOf(DatosCabeceraIncidenciaProveedor.GravedadIncidencia.ToUpperCase)
	End If
	
	
	DateTime.DateFormat=DateFormatAnt
	
	Dim sv As ScrollPane = clvAccionesIncidencia.sv
	sv.SetVScrollVisibility("AS_NEEDED")
	
End Sub

Private Sub B4XSwitchAccionCierraIncidencia_ValueChanged (Value As Boolean)
	If Value Then
		BaseAccionIncidencia.Height=540dip
		pnlFondoDatosCierreIncidenciaNuevaEditar.Visible=True
		lblTitleDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=False
		cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=False
		cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.SelectedIndex=-1
		txtUsuarioCierreIncidenciaNuevaEditar.Text=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yyyy"
		txtFechaCierreIncidenciaNuevaEditar.Text=DateTime.Date(DateTime.Now)
		DateTime.DateFormat=DateFormatAnt
	Else
		BaseAccionIncidencia.Height=440dip
		pnlFondoDatosCierreIncidenciaNuevaEditar.Visible=False
		lblTitleDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=True
		cboDepartamentoAsignadoAccionIncidenciaNuevaEditar.Visible=True
		txtUsuarioCierreIncidenciaNuevaEditar.Text=""
		txtFechaCierreIncidenciaNuevaEditar.Text=""
		ChoiceBoxGravedadIncidencia.SelectedIndex=0
		cboTipoIncidenciaNuevaEditar.SelectedIndex=-1
	End If
End Sub

Private Sub btnSelFechaAccionIncidencia_Click
	Dialog.Title="Indica Fecha Acción"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaAccionNuevaEditar.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaAccionNuevaEditar.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaAccionNuevaEditar.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnInsertarDescripcionAccionTextoPredefinido_Click
	
	If TextAreaDescripcionAccionNuevaEditar.Text.Trim<>"" Then
		Dim msg As String=$"La acción ya tiene un texto definido. Si se selecciona un texto mediante este botón, se añadirá el texto seleccionado al final del texto existente.
Continuar?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",msg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Wait For(CargaAccionesPredefinidasIncidenciasProveedor) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	If lstReg.Size=0 Then Return
	
	Dim lstOpciones As List
	lstOpciones.Initialize
	For Each mT As Map In lstReg
		lstOpciones.Add(mT.Get("TextoAccionPredefinida"))
	Next
	
	Dialog.Title="Selecciona Texto Accion predefefinido"
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
	
	B4XListDlg.Resize(600dip, 500dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim TextoDescripcionAccionAdicional As String=B4XListDlg.SelectedItem
	Dim NuevoTexto As String=IIf(TextAreaDescripcionAccionNuevaEditar.Text="",TextoDescripcionAccionAdicional,TextAreaDescripcionAccionNuevaEditar.Text & CRLF & TextoDescripcionAccionAdicional)
	TextAreaDescripcionAccionNuevaEditar.Text=NuevoTexto
	
End Sub





Private Sub lblMenuFichaIncidencia_MouseEntered (EventData As MouseEvent)
	lblMenuFichaIncidencia.TextColor=xui.Color_Black
	lblMenuFichaIncidencia.Color=0xFFFFD700
End Sub

Private Sub lblMenuFichaIncidencia_MouseClicked (EventData As MouseEvent)
	EventData.Consume
	lblMenuFichaIncidencia.TextColor=xui.Color_Black
	lblMenuFichaIncidencia.Color=0xFF00FFFF
End Sub

Private Sub lblMenuFichaIncidencia_MouseReleased (EventData As MouseEvent)
	lblMenuFichaIncidencia.TextColor=xui.Color_White
	lblMenuFichaIncidencia.Color=xui.Color_Black
	lblMenuFichaIncidencia.Color=0xFF696969
	CargaTreeViewDrawer
	Drawer.LeftOpen=True
End Sub

Private Sub lblMenuFichaIncidencia_MouseExited (EventData As MouseEvent)
	lblMenuFichaIncidencia.TextColor=xui.Color_White
	lblMenuFichaIncidencia.Color=xui.Color_Black
	lblMenuFichaIncidencia.Color=0xFF696969
End Sub

'Private Sub btnCopiarInfoLineasPedidoCompraADescripcionIncidencia_Click
'	If txtTipoDocumentoOrigen.Text<>"Pedido Compra" Then
'		Dim msa As Object=xui.MsgboxAsync("La función Copiar Líneas de Pedido a Descripción sólo está disponible para Tipo Documento Origen=Pedido de compra","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	Dim PedidoCompraSel As String=txtDocumentoOrigenProveedor.Text.ToUpperCase
'	If PedidoCompraSel.StartsWith("PC")= False Then
'		Dim msa As Object=xui.MsgboxAsync("Es necesario indicar el pedido de compra","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Añadir la información de Descripción + artículo/talla de las líneas del pedido de compra ${PedidoCompraSel} a la Descripción de la incidencia?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	
'	jamLoadingIndicator1.MensajeLoading="Cargando info pedido compra..."
'	jamLoadingIndicator1.Show
'	Wait For(CargaDatosPedidoCompra(PedidoCompraSel)) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		 Return
'	End If
'	Dim lstReg As List=mRes.Get("lstReg")
'	Dim sLineasPedido As String
'	If txtDocumentoProveedor.Text<>"" Then
'		sLineasPedido=txtTipoDocumentoProveedor.Text & ": " & txtDocumentoProveedor.Text
'	End If
'	If txtDocumentoOrigenProveedor.Text<>"" Then
'		If sLineasPedido<>"" Then sLineasPedido=sLineasPedido & "   "
'		sLineasPedido=sLineasPedido & txtTipoDocumentoOrigen.Text & ": " & txtDocumentoOrigenProveedor.Text.ToUpperCase
'	End If
'	If sLineasPedido<>"" Then sLineasPedido=sLineasPedido & CRLF & CRLF
'	For Each mData As Map In lstReg
'		Log(mData)
'		Dim Variante As String=mData.get("Variante")
'		If Variante="" Then		
'			'sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "    Cantidad Pedido: " & mData.get("Qty") & CRLF
'			sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & CRLF
'		Else
'			'sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "   Talla: " & mData.Get("Talla") & "    Cantidad Pedido: " & mData.get("Qty") & CRLF
'			sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "   Talla: " & mData.Get("Variante") & CRLF
'		End If
'	Next
'	sLineasPedido=sLineasPedido.SubString2(0,sLineasPedido.Length-1) ' eliminar el ultimo crlf
'	TextAreaDescripcionIncidencia.Text=TextAreaDescripcionIncidencia.Text & CRLF & sLineasPedido
'	jamLoadingIndicator1.Close
'End Sub




Sub CargaDatosPedidoCompra(PedidoCompraSel As String) As ResumableSub
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim lstReg As List
	lstReg.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="DatosPedidoCompra"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(PedidoCompraSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No existe el pedido de compra (${PedidoCompraSel} en NAVISION)"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			lstReg=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub


Private Sub btnAnularAccionLinea_Click
	
End Sub

'Private Sub btnEditarAccionLinea_Click
'	Dim btn As B4XView=Sender
'	Dim mDataAccion As Map=clvAccionesIncidencia.GetValue(clvAccionesIncidencia.GetItemFromView(btn))
'	Dim IDLineaAccion As Int=mDataAccion.Get("IDLineaAccion")
'	
'	If IDLineaAccion>-1 Then
'		mDataAccion.Initialize
'		Wait For(CargaDatosAccionIncidencia(IDLineaAccion)) complete (mRes As Map)
'		Dim Accion As String=mRes.Get("Accion")
'		If Accion="NOK" Then Return
'		Dim lstReg As List=mRes.Get("lstReg")
'		If lstReg.Size=0 Then Return
'		Dim mDataAccion As Map=lstReg.Get(0)
'	Else
'		' registro de Access??
'		
'	End If
'	
'	ModoAccion="EditarAccion"
'	wait for(MostrarPanelNuevaEditarAccionIncidencia) complete (Success As Boolean)
'	If Not(Success) Then Return
'	
'
'	MostrarDatosEditarAccion(mDataAccion)
'
'
'	
'End Sub

Private Sub lblMenuAccionesAccionLinea_MouseEntered (EventData As MouseEvent)
	Dim lblAccionesSel As B4XView=Sender
	lblAccionesSel.TextColor=xui.Color_Black
	lblAccionesSel.Color=0xFFFFD700
	
'	Dim JOlbl As JavaObject=lblAccionesSel
''	Dim JOCtxMnu As JavaObject=JOlbl.RunMethodJO("getContextMenu",Null)
''	JOCtxMnu=mContextMenuAccionesAccionIncidencia
'	
'	JOlbl.RunMethod("setContextMenu",Array(mContextMenuAccionesAccionIncidencia))
'	
'	Dim lbl As Label=lblAccionesSel
'	MostrarContextMenuLabelJO(lbl)
	
End Sub

Private Sub lblMenuAccionesAccionLinea_MouseClicked (EventData As MouseEvent)
	
	Dim lblAccionesSel As B4XView=Sender

	
	lblAccionesSel.TextColor=xui.Color_Black
	lblAccionesSel.Color=0xFF00FFFF

	Sleep(0)

'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			SalirModulo
'			Return
'		End If
'	End If
	
	Dim JOlbl As JavaObject=lblAccionesSel
'	Dim JOCtxMnu As JavaObject=JOlbl.RunMethodJO("getContextMenu",Null)
'	JOCtxMnu=mContextMenuAccionesAccionIncidencia
	
	JOlbl.RunMethod("setContextMenu",Array(mContextMenuAccionesAccionIncidencia))
	
	Dim lbl As Label=lblAccionesSel
	Dim DataAccionSel As TipoDatosAccionIncidencia=clvAccionesIncidencia.GetValue(clvAccionesIncidencia.GetItemFromView(lbl))
	MostrarContextMenuLabelJOAccionesAccionIncidencia(lbl, DataAccionSel)
	
End Sub
 

Private Sub lblMenuAccionesAccionLinea_MouseReleased (EventData As MouseEvent)
	Dim lblAccionesSel As B4XView=Sender
	lblAccionesSel.TextColor=xui.Color_White
	'lblAccionesSel.Color=xui.Color_Black
	lblAccionesSel.Color=0xFFB22222

End Sub

Private Sub lblMenuAccionesAccionLinea_MouseExited (EventData As MouseEvent)
	Dim lblAccionesSel As B4XView=Sender
	If lblAccionesSel.IsInitialized Then
		lblAccionesSel.TextColor=xui.Color_White
		'lblAccionesSel.Color=xui.Color_Black
		lblAccionesSel.Color=0xFFB22222
	End If
End Sub

Private Sub AddItemsMenuContextualAccionesAccionIncidencia(DataAccionSel As TipoDatosAccionIncidencia)
	mContextMenuAccionesAccionIncidencia.MenuItems.Clear
	
'	Dim sSeparator As JavaObject
'	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
'	mContextMenuAccionesAccionIncidencia.MenuItems.Add(sSeparator)
	
	'If ModoFicha="VER" Then
	Dim mI As MenuItem
	mI.Initialize("Enviar Email Tarea","ContextMenuItemAccionesAccionIncidencia")
	mI.Tag="EnviarEmailTarea"
	Dim B4XBitm As B4XBitmap=Utilidades.MaterialIconsToBitmap(Chr(0xE0BE),16, xui.Color_White)
	mI.Image=B4XBitm.As(Image)
	Dim JOmI As JavaObject=mI
	'JOmI.RunMethod("setDisable",Array(ModoFicha<>"VER"))
	JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))

	mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
		
'	Dim sSeparator As JavaObject
'	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
'	mContextMenuAccionesAccionIncidencia.MenuItems.Add(sSeparator)
		
	'Else
	
	If DataAccionSel.EstadoAccion=0 Then
	
		Dim mI As MenuItem
		mI.Initialize("Editar Tarea","ContextMenuItemAccionesAccionIncidencia")
		mI.Tag="EditarTarea"
		mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF044),16, xui.Color_White)
		Dim JOmI As JavaObject=mI
		'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
		JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
		mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
			
	'	Dim sSeparator As JavaObject
	'	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
	'	mContextMenuAccionesAccionIncidencia.MenuItems.Add(sSeparator)

		Dim mI As MenuItem
		mI.Initialize("Cerrar Tarea","ContextMenuItemAccionesAccionIncidencia")
		mI.Tag="CerrarTarea"
		mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF11E),16, xui.Color_White)
		Dim JOmI As JavaObject=mI
		'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
		JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
		mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
	Else
		Dim mI As MenuItem
		mI.Initialize("Reabrir Tarea","ContextMenuItemAccionesAccionIncidencia")
		mI.Tag="ReabrirTarea"
		mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF11E),16, xui.Color_White)
		Dim JOmI As JavaObject=mI
		'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
		JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
		mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
		
	End If
	
	Dim mI As MenuItem
	mI.Initialize("Eliminar Tarea","ContextMenuItemAccionesAccionIncidencia")
	mI.Tag="EliminarTarea"
	mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF014),16, 0xFFFF004A)
	Dim JOmI As JavaObject=mI
	'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
	JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
	mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
'		
'	Dim sSeparator As JavaObject
'	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
'	mContextMenuAccionesAccionIncidencia.MenuItems.Add(sSeparator)
		
	
'		Dim mI As MenuItem
'		mI.Initialize("Adjuntar Ficheros","ContextMenuItemAccionesAccionIncidencia")
'		mI.Tag="AdjuntarFicheros"
'		mI.Image=Utilidades.MaterialIconsToBitmap(Chr(0xE226),16, xui.Color_Black)
'		Dim JOmI As JavaObject=mI
'		JOmI.RunMethod("setStyle",Array("-fx-font-size:14;"))
'		mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
	'End If
	
'		For Each mI As MenuItem In mContextMenuAccionesAccionIncidencia.MenuItems
'			Dim JOmI As JavaObject=mI
'			JOmI.RunMethod("setStyle",Array("-fx-padding: 0.0em 0.0em 0.0em 0.0em;-fx-border-color: #DDDEE2 transparent #B9C0C8 transparent;-fx-border-width:0.50px;"))
'		Next
End Sub



private Sub MostrarContextMenuLabelJODescripcionIncidencia(lbl As Label)
	
	AddItemsMenuContextualDescripcionIncidencia
	
	If mContextMenuDescripcionIncidencia.MenuItems.Size=0 Then Return
	Dim JOctXNode As JavaObject=mContextMenuDescripcionIncidencia
	JOctXNode.RunMethod("setUserData",Array(lbl)) ' fija el TAG del ContextMenu=Nodo (=labelMenu)
	JOctXNode.RunMethod("hide", Null)
'	Dim xCurrMouse As Double=PosicionActualRaton(0)
'	Dim yCurrMouse As Double=PosicionActualRaton(1)
'	JOctXNode.RunMethod("show", Array(lbl, lbl.Left+lbl.Width+5dip,lbl.Top))
	Dim JOSide As JavaObject
	JOSide.InitializeStatic("javafx.geometry.Side")
	Dim JOEnumSide As JavaObject=JOSide.RunMethodJO("valueOf",Array("RIGHT"))
	JOctXNode.RunMethod("show", Array(lbl, JOEnumSide,0.1,0.1))
End Sub

Private Sub AddItemsMenuContextualDescripcionIncidencia
	mContextMenuDescripcionIncidencia.MenuItems.Clear
	
		
'	Dim sSeparator As JavaObject
'	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
'	mContextMenuAccionesAccionIncidencia.MenuItems.Add(sSeparator)
		
	'Else
	Dim mI As MenuItem
	mI.Initialize("Editar Descripción","ContextMenuDescripcionIncidencia")
	mI.Tag="EditarDescripcion"
	mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF044),16, xui.Color_White)
	Dim JOmI As JavaObject=mI
	'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
	JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
	mContextMenuDescripcionIncidencia.MenuItems.Add(mI)
		
	Dim sSeparator As JavaObject
	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
	mContextMenuDescripcionIncidencia.MenuItems.Add(sSeparator)


	Dim mI As MenuItem
	mI.Initialize("Copiar Info Lineas Pedido Compra","ContextMenuDescripcionIncidencia")
	mI.Tag="CopiarInfoLineasPedidoCompraADescripcionFaseIncidencia"
	mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF11E),16, xui.Color_White)
	Dim JOmI As JavaObject=mI
	'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
	JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
	mContextMenuDescripcionIncidencia.MenuItems.Add(mI)

	
'	Dim mI As MenuItem
'	mI.Initialize("Eliminar Tarea","ContextMenuItemAccionesAccionIncidencia")
'	mI.Tag="EliminarFase"
'	mI.Image=Utilidades.FontAwesomeToBitmap(Chr(0xF014),16, 0xFFFF004A)
'	Dim JOmI As JavaObject=mI
'	'JOmI.RunMethod("setDisable",Array(ModoFicha="VER"))
'	JOmI.RunMethod("setStyle",Array("-fx-font-size:12px; -fx-text-fill: white;-fx-font-weight:bold;"))
'	mContextMenuDescripcionIncidencia.MenuItems.Add(mI)
'		
'	Dim sSeparator As JavaObject
'	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
'	mContextMenuAccionesAccionIncidencia.MenuItems.Add(sSeparator)
		
	
'		Dim mI As MenuItem
'		mI.Initialize("Adjuntar Ficheros","ContextMenuItemAccionesAccionIncidencia")
'		mI.Tag="AdjuntarFicheros"
'		mI.Image=Utilidades.MaterialIconsToBitmap(Chr(0xE226),16, xui.Color_Black)
'		Dim JOmI As JavaObject=mI
'		JOmI.RunMethod("setStyle",Array("-fx-font-size:14;"))
'		mContextMenuAccionesAccionIncidencia.MenuItems.Add(mI)
	'End If
	
'		For Each mI As MenuItem In mContextMenuAccionesAccionIncidencia.MenuItems
'			Dim JOmI As JavaObject=mI
'			JOmI.RunMethod("setStyle",Array("-fx-padding: 0.0em 0.0em 0.0em 0.0em;-fx-border-color: #DDDEE2 transparent #B9C0C8 transparent;-fx-border-width:0.50px;"))
'		Next
End Sub




private Sub MostrarContextMenuLabelJOAccionesAccionIncidencia(lbl As Label, DataAccionSel As TipoDatosAccionIncidencia)
	
	AddItemsMenuContextualAccionesAccionIncidencia(DataAccionSel)
	
	If mContextMenuAccionesAccionIncidencia.MenuItems.Size=0 Then Return
	Dim JOctXNode As JavaObject=mContextMenuAccionesAccionIncidencia
	JOctXNode.RunMethod("setUserData",Array(lbl)) ' fija el TAG del ContextMenu=Nodo (=labelMenu)
	JOctXNode.RunMethod("hide", Null)
'	Dim xCurrMouse As Double=PosicionActualRaton(0)
'	Dim yCurrMouse As Double=PosicionActualRaton(1)
'	JOctXNode.RunMethod("show", Array(lbl, lbl.Left+lbl.Width+5dip,lbl.Top))
	Dim JOSide As JavaObject
	JOSide.InitializeStatic("javafx.geometry.Side")
	Dim JOEnumSide As JavaObject=JOSide.RunMethodJO("valueOf",Array("RIGHT"))
	JOctXNode.RunMethod("show", Array(lbl, JOEnumSide,0.1,0.1))
End Sub

Private Sub PosicionActualRaton As Int()
	Dim jTb As AWTRobot
	Return jTb.RobotMouseCurrentLocation
End Sub


private Sub ContextMenuItemAccionesAccionIncidencia_Action
	Dim mI As MenuItem=Sender
	Log("Tag MenuItem: " & mI.Tag)
	Dim JOmI As JavaObject=mI
	Dim JOCtxMenu As JavaObject=JOmI.RunMethodJO("getParentPopup",Null)
	Dim lblMenu As Label=JOCtxMenu.RunMethodJO("getUserData",Null)
	Dim iDxCLVItem As Int=clvAccionesIncidencia.GetItemFromView(lblMenu)
	Dim DataAccionSel As TipoDatosAccionIncidencia=clvAccionesIncidencia.GetValue(iDxCLVItem)
	Dim IDLineaAccionSel As Int=DataAccionSel.IDLineaAccion
	Select Case mI.Tag
		Case "EditarTarea"
'			If ModoFicha="VER" Then
'				Dim msa As Object=xui.MsgboxAsync("Función disponible en modo Editar o Nuevo","Aviso")
'				Wait For (msa) Msgbox_Result
'				Return
'			End If

			jamLoadingIndicator1.MensajeLoading="Cargando datos edición línea..."
			jamLoadingIndicator1.Show
			wait for(EditarAccionLinea(DataAccionSel)) complete (Success As Boolean)
			jamLoadingIndicator1.close
			If Not(Success) Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible cargar los datos de edición de línea","Error")
				Wait For (msa) Msgbox_Result
			End If
		
		Case "EnviarEmailTarea"
			
'			If ModoFicha="EDITAR" Or ModoFicha="NUEVO" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario grabar (o cancelar) antes la incidencia actual.")) complete (rObj As Object)
'				Return
'			End If
'			If txtProveedor.Text="" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio indicar un Proveedor de Navision.")) complete (rObj As Object)
'				Return
'			End If
'			wait for(ConfiguracionEnvioEmailIncidencia) complete (Success As Boolean)
'			If Not(Success) Then Return
			
			Wait For(CargaDatosConfiguracionCuentasEmailIncidencias) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then 
				Return
			End If
			
			Wait For(CargaDatosConfiguracionCuentaArchivadoEmailIncidencias) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			Dim mDataArch As Map=mRes.Get("mData0")
			CuentaEmailArchivadoIncidencias=mDataArch.Get("DireccionEmail")
			NombreCuentaEmailArchivadoIncidencias=mDataArch.Get("NombreCuenta")
			
			
			
			
			MostrarSeleccionarDatosEmailIncidencia(DataAccionSel)
		
			
		Case "CerrarTarea"
			If DataAccionSel.UsuarioCierreAccion<>"" Or DataAccionSel.FechaCierreAccion>0 Then
				Dim msa As Object=xui.MsgboxAsync("La tarea ya está cerrada.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			MostrarCierraTareaIncidencia(DataAccionSel)
			
		Case "ReabrirTarea"
			ReabrirTarea(DataAccionSel)
		
		Case "EliminarTarea"
'			If ModoFicha="VER" Then
'				Dim msa As Object=xui.MsgboxAsync("Función disponible en modo Editar o Nuevo","Aviso")
'				Wait For (msa) Msgbox_Result
'				Return
'			End If
			
			EliminarTarea(DataAccionSel)
			
'		Case "AdjuntarFicheros"
'			If ModoFicha="VER" Then
'				Dim msa As Object=xui.MsgboxAsync("Función disponible en modo Editar o Nuevo","Aviso")
'				Wait For (msa) Msgbox_Result
'				Return
'			End If
'			
'			AdjuntarFicherosAccion(DataAccionSel)
			
	End Select
	
End Sub

Sub EditarAccionLinea(DataAccionSel As TipoDatosAccionIncidencia) As ResumableSub
	
	'AccionTemp.Initialize

'	jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}..."$
'	jamLoadingIndicator1.Show
	Wait For(CargaDatosIncidencia(DatosCabeceraIncidenciaProveedor.idIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (success As Boolean)
	If success=False Then
'		jamLoadingIndicator1.Close
'		SalirModulo
		Return False
	End If

'	Dim IDLineaAccionSel As Int=DataAccion.IDLineaAccion
	
'	If IDLineaAccion>-1 Then
'		'actualizamos datos incidencia
'		jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}..."$
'		jamLoadingIndicator1.Show
'		Wait For(CargaDatosIncidencia(DatosCabeceraIncidenciaProveedor.idIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)) complete (success As Boolean)
'		If success=False Then
'			jamLoadingIndicator1.Close
'			SalirModulo
'			Return False
'		End If
'		
'		
'	Else
'		' registro de Access??  ' no refrescamos nada...
'	End If
	
	ModoAccion="EditarAccion"
	
	
	wait for(MostrarPanelNuevaEditarAccionIncidencia(DataAccionSel)) complete (success As Boolean)
	If Not(success) Then Return False
	
'	Dim AccionTemp As TipoDatosAccionIncidencia
'	AccionTemp.Initialize
'	For Each AccionInc As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedorTemp
'		If AccionInc.IDLineaAccion=IDLineaAccionSel Then
'			AccionTemp=CopyObject(AccionInc)
'			Exit
'		End If
'	Next
	
	'AccionTemp.FechaLineaAccionLong=DateTime.Now
	DataAccionSel.FechaLineaAccionLong=DateTime.now
	DataAccionSel.TipoCambio="Editada"
	MostrarDatosEditarAccion(DataAccionSel)
	
	Return True
	
End Sub

Sub EliminarTarea(DataAccionSel As TipoDatosAccionIncidencia)
	Dim msa As Object = xui.Msgbox2Async("¿Eliminar la tarea seleccionada?","Confirma", "Sí","Cancelar", "", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
'	For Each DataAccionItem As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedorTemp
'		Dim IDLineaAccionItem As Int=DataAccionItem.IDLineaAccion
'		Dim IDLineaAccionTempItem As Int=DataAccionItem.IDLineaAcciontemp
'		If DataAccionItem.IDLineaAccion=DataAccionSel.IDLineaAccion And DataAccionItem.IDLineaAcciontemp=DataAccionSel.IDLineaAcciontemp Then
'			lstAccionesIncidenciaProveedorTemp.RemoveAt(lstAccionesIncidenciaProveedorTemp.IndexOf(DataAccionSel)
'			Exit
'		End If
'	Next

	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorAnularTareaIncidencia", Array(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DataAccionSel.IDLineaAccion))
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible anular la tarea de la incidencia.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)

''	Log(lstAccionesIncidenciaProveedorTemp.Size)
'	lstAccionesIncidenciaProveedor.RemoveAt(lstAccionesIncidenciaProveedor.IndexOf(DataAccionSel))
''	Log(lstAccionesIncidenciaProveedorTemp.Size)
'	
'	wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor, lstAccionesIncidenciaProveedor)) complete (rObj As Object)
End Sub
'
'Sub EnviarEmailTarea(CuentaDe As String, sCuentaPara As String, sCuentaCC As String, sBody As String)
'
'	wait for(EjecutarVBSScriptCrearEmail(CuentaDe,sCuentaPara, sCuentaCC, "Incidencia proveedor " & txtNumeroIncidencia.Text,sBody,"None")) complete (mRes As Map)
'
'	Log("mRes: " & mRes)
'	Dim Success As Boolean=mRes.Get("Success")
'	Dim ExitCode As Int=mRes.Get("ExitCode")
'	Dim StdOut As String=mRes.Get("StdOut")
'	Dim StdErr As String=mRes.Get("StdErr")
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & "Avisa al administrador de la aplicación.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	If ExitCode=1 Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF  & CRLF & StdErr,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	wait for(Utilidades.MsgBoxXUI("Aviso","Email creado en Outlook.")) complete (rObj As Object)
'	
'	MoverFocoAOutlookIncidencia($"${txtNumeroIncidencia.Text}"$)
'	
'End Sub


'
'Public Sub CreateTipoDatosCabeceraIncidenciaProveedor (IDIncidenciaProveedor As Int, IncidenciaProveedor As String, EstadoIncidencia As String, MigracionAccess As Boolean, TipoOrigenIncidenciaProveedor As String, IDUsuarioEmisor As Int, NombreUsuarioEmisor As String, IDUsuarioCompras As Int, NombreUsuarioCompras As String, FechaIncidenciaLong As Long, Proveedor As String, NombreProveedor As String, OrigenIncidencia As String, IDTipoDocumento As Int, NombreTipoDocumento As String, DocumentoProveedor As String, FechaDocumentoProveedorLong As Long, IDTipoDocumentoOrigen As Int, NombreTipoDocumentoOrigen As String, DocumentoOrigen As String, DescripcionIncidencia As String, IDTipoIncidencia As Int, NombreTipoIncidencia As String, AccionCompras As String, FechaAccionComprasLong As Long, IDUsuarioAccionCompras As Int, NombreUsuarioAccionCompras As String, FechaCierreLong As Long, IDUsuarioCierre As String, NombreUsuarioCierre As String, GravedadIncidencia As String, Anulada As Boolean) As TipoDatosCabeceraIncidenciaProveedor
'	Dim t1 As TipoDatosCabeceraIncidenciaProveedor
'	t1.Initialize
'	t1.IDIncidenciaProveedor = IDIncidenciaProveedor
'	t1.IncidenciaProveedor = IncidenciaProveedor
'	t1.EstadoIncidencia = EstadoIncidencia
'	t1.MigracionAccess = MigracionAccess
'	t1.TipoOrigenIncidenciaProveedor = TipoOrigenIncidenciaProveedor
'	t1.IDUsuarioEmisor = IDUsuarioEmisor
'	t1.NombreUsuarioEmisor = NombreUsuarioEmisor
'	t1.IDUsuarioCompras = IDUsuarioCompras
'	t1.NombreUsuarioCompras = NombreUsuarioCompras
'	t1.FechaIncidenciaLong = FechaIncidenciaLong
'	t1.Proveedor = Proveedor
'	t1.NombreProveedor = NombreProveedor
'	t1.OrigenIncidencia = OrigenIncidencia
'	t1.IDTipoDocumento = IDTipoDocumento
'	t1.NombreTipoDocumento = NombreTipoDocumento
'	t1.DocumentoProveedor = DocumentoProveedor
'	t1.FechaDocumentoProveedorLong = FechaDocumentoProveedorLong
'	t1.IDTipoDocumentoOrigen = IDTipoDocumentoOrigen
'	t1.NombreTipoDocumentoOrigen = NombreTipoDocumentoOrigen
'	t1.DocumentoOrigen = DocumentoOrigen
'	t1.DescripcionIncidencia = DescripcionIncidencia
'	t1.IDTipoIncidencia = IDTipoIncidencia
'	t1.NombreTipoIncidencia = NombreTipoIncidencia
'	t1.AccionCompras = AccionCompras
'	t1.FechaAccionComprasLong = FechaAccionComprasLong
'	t1.IDUsuarioAccionCompras = IDUsuarioAccionCompras
'	t1.NombreUsuarioAccionCompras = NombreUsuarioAccionCompras
'	t1.FechaCierreLong = FechaCierreLong
'	t1.IDUsuarioCierre = IDUsuarioCierre
'	t1.NombreUsuarioCierre = NombreUsuarioCierre
'	t1.GravedadIncidencia = GravedadIncidencia
'
'	Return t1
'End Sub

Sub CopyObject(o As Object) As Object
	Dim s As B4XSerializator
	Return s.ConvertBytesToObject(s.ConvertObjectToBytes(o))
End Sub

Sub CargaDatosConfiguracionCuentasEmailIncidencias As ResumableSub
	mSQL.ExecNonQuery("delete from tblIncidenciasProveedorCuentasEmailIncidencias")
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="ConfiguracionCuentasCorreoIncidencias"
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
			Dim msa As Object=xui.MsgboxAsync($"No existe configuración de cuentas de correo de incidencias"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData0", mData0)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorCuentasEmailIncidencias",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorCuentasEmailIncidencias", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub CargaDatosConfiguracionCuentaArchivadoEmailIncidencias As ResumableSub
	'mSQL.ExecNonQuery("delete from tblIncidenciasProveedorCuentasEmailIncidencias")
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="ConfiguracionCuentaArchivadoEmailIncidencias"
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
			Dim msa As Object=xui.MsgboxAsync($"No existe configuración de cuentas de correo de incidencias"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData0 As Map=lstReg.Get(0)
			mRes.Put("mData0", mData0)
			Accion="OK"
			mRes.Put("Accion", Accion)


'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorCuentasEmailIncidencias",mData0,"")
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorCuentasEmailIncidencias", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub CargaDatosConfiguracionHttpRequestEnvioAutomaticoEmailNuevaTarea As ResumableSub
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="IncidenciasProveedorConfiguracionHttpRequestEnvioAutomaticoEmailNuevaTarea"
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
			Dim msa As Object=xui.MsgboxAsync($"No existe configuración para envio automático de email nueva tarea incidencia."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim mData0 As Map=lstReg.Get(0)
			mRes.Put("mData0", mData0)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorCuentasEmailIncidencias",mData0,"")
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorCuentasEmailIncidencias", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido As ResumableSub
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="ConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido"
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
			Dim msa As Object=xui.MsgboxAsync($"No existe configuración para envio automático de email nueva tarea incidencia."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim mData0 As Map=lstReg.Get(0)
			mRes.Put("mData0", mData0)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorCuentasEmailIncidencias",mData0,"")
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorCuentasEmailIncidencias", lstReg)
		End If
	End If
	Return mRes
End Sub


'Sub MostrarSeleccionarDatosEmailTareaIncidencia(DatosAccionSel As TipoDatosAccionIncidencia)
'	Wait For(CargaDatosConfiguracionCuentasEmailIncidencias) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		Return
'	End If
'	
'	For Each xNode As B4XView In frm.RootPane
'		If xNode Is Pane Then
'			If xNode.Tag="BackgroundSeleccionDatosEmailIncidencia" Then
'				xNode.RemoveViewFromParent
'				Exit
'			End If
'		End If
'	Next
'	
'	BackgroundSeleccionDatosEmailIncidencia= xui.CreatePanel("BackgroundSeleccionDatosEmailIncidencia")
'	BackgroundSeleccionDatosEmailIncidencia.Tag = "BackgroundSeleccionDatosEmailIncidencia"
'	BackgroundSeleccionDatosEmailIncidencia.Color=0xaa000000
'	frm.RootPane.AddNode(BackgroundSeleccionDatosEmailIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)
'
'	BaseSeleccionDatosEmailTareaIncidencia=xui.CreatePanel("pnlBaseSeleccionDatosEmailTareaIncidencia")
'	BaseSeleccionDatosEmailTareaIncidencia.SetLayoutAnimated(0,0,0,900dip, 700dip)
'	BaseSeleccionDatosEmailTareaIncidencia.LoadLayout("scrIncidenciasProveedorSeleccionDatosEmailIncidencia")
'
'	
'	BackgroundSeleccionDatosEmailIncidencia.AddView(BaseSeleccionDatosEmailIncidencia,(BackgroundSeleccionDatosEmailIncidencia.Width/2-BaseSeleccionDatosEmailIncidencia.Width/2), _
'		(BackgroundSeleccionDatosEmailIncidencia.Height/2-BaseSeleccionDatosEmailIncidencia.Height/2), BaseSeleccionDatosEmailIncidencia.Width, BaseSeleccionDatosEmailIncidencia.Height)
'	
'	
'	Log($"AlmacenIPConexion ${Main.AlmacenIPConexion}"$)
'	
'	Dim NombreCuentaDepartamentoCoordinador As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador))
'	Dim DireccionEmailDepartamentoCoordinador As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador))
'	
'	Dim NombreCuentaIncidenciasProveedorAlmacenProin As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROIN"))
'	Dim DireccionEmailIncidenciasProveedorAlmacenProin As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROIN"))
'	
'	Dim NombreCuentaIncidenciasProveedorAlmacenProtec As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROTEC"))
'	Dim DireccionEmailIncidenciasProveedorAlmacenProtec As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROTEC"))
'	
'	Dim NombreCuentaFacturasProveedor As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ADMINISTRACION-PROVEEDORES"))
'	Dim DireccionEmailDepartamentoCoordinador As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ADMINISTRACION-PROVEEDORES"))
'	
'	
'	RadioButtonDeIncidenciasProveedorAlmacenProin.Checked=Main.AlmacenConexion="PROIN"
'	RadioButtonDeIncidenciasProveedorAlmacenProtec.Checked=Main.AlmacenConexion="PROTEC"
''	RadioButtonDeIncidenciasCompras.Checked=False
'	RadioButtonDeDepartamentoCoordinador.Checked=False
'	If NombreCuentaDepartamentoCoordinador<>"" Then
'		RadioButtonDeDepartamentoCoordinador.Text=NombreCuentaDepartamentoCoordinador
'	Else
'		If DireccionEmailDepartamentoCoordinador<>"" Then
'			RadioButtonDeDepartamentoCoordinador.Text=DireccionEmailDepartamentoCoordinador
'		Else
'			RadioButtonDeDepartamentoCoordinador.Text=""
'		End If
'	End If
'
'	
'	RadioButtonDeCuentaUsuario.Checked=False
'	
'	CheckBoxParaProveedor.As(CheckBox).Checked=False
'	'CheckBoxParaIncidenciasCompras.As(CheckBox).Checked=False
'	CheckBoxParaIncidenciasProveedorAlmacenProin.As(CheckBox).Checked=False
'	CheckBoxParaIncidenciasProveedorAlmacenProtec.As(CheckBox).Checked=False
'
'	CheckBoxParaDepartamentoCoordinador.Checked=True
'	If NombreCuentaDepartamentoCoordinador<>"" Then
'		CheckBoxParaDepartamentoCoordinador.Text=NombreCuentaDepartamentoCoordinador
'	Else
'		If DireccionEmailDepartamentoCoordinador<>"" Then
'			CheckBoxParaDepartamentoCoordinador.Text=DireccionEmailDepartamentoCoordinador
'		Else
'			CheckBoxParaDepartamentoCoordinador.Text=""
'		End If
'	End If
'
'
'	'CheckBoxCCIncidenciasCompras.As(CheckBox).Checked=True
'	CheckBoxCCIncidenciasProveedorAlmacenProin.As(CheckBox).Checked=False
'	CheckBoxCCIncidenciasProveedorAlmacenProtec.As(CheckBox).Checked=False
'	CheckBoxCCFacturas.As(CheckBox).Checked=True
'	If NombreCuentaFacturasProveedor<>"" Then
'		CheckBoxCCFacturas.Text=NombreCuentaFacturasProveedor
'	Else
'		If DireccionEmailFacturasProveedor<>"" Then
'			CheckBoxCCFacturas.Text=DireccionEmailFacturasProveedor
'		Else
'			CheckBoxCCFacturas.Text=""
'		End If
'	End If
'
'
'	CheckBoxCCDepartamentoCoordinador.Visible=True
'	CheckBoxCCDepartamentoCoordinador.Checked=False
'	If NombreCuentaDepartamentoCoordinador<>"" Then
'		CheckBoxCCDepartamentoCoordinador.Text=NombreCuentaDepartamentoCoordinador
'	Else
'		If DireccionEmailDepartamentoCoordinador<>"" Then
'			CheckBoxCCDepartamentoCoordinador.Text=DireccionEmailDepartamentoCoordinador
'		Else
'			CheckBoxCCDepartamentoCoordinador.Text=""
'		End If
'	End If
'
'	
'	B4XSwitchIncluirDescripcionFaseBodyEmailIncidencia.Value=True
''	lblDescripcionFaseBodyEmailFaseIncidencia.tag=DatosFaseIncSel.DescripcionAccion
''	lblDescripcionFaseBodyEmailFaseIncidencia.Text=lblDescripcionFaseBodyEmailFaseIncidencia.tag
'	TextAreaDescripcionFaseBodyEmailIncidencia.tag=DatosCabeceraIncidenciaProveedor.DescripcionIncidencia
'	TextAreaDescripcionFaseBodyEmailIncidencia.Text=TextAreaDescripcionFaseBodyEmailIncidencia.tag
'	
'End Sub




Private Sub B4XSwitchIncluirDescripcionFaseBodyEmailFaseIncidencia_ValueChanged (Value As Boolean)
	If Value Then
		'lblDescripcionFaseBodyEmailFaseIncidencia.Text=lblDescripcionFaseBodyEmailFaseIncidencia.tag
		TextAreaDescripcionFaseBodyEmailFaseIncidencia.Text=TextAreaDescripcionFaseBodyEmailFaseIncidencia.tag
	Else
		'lblDescripcionFaseBodyEmailFaseIncidencia.Text=""
		TextAreaDescripcionFaseBodyEmailFaseIncidencia.Text=""
	End If
End Sub

Sub SalirSeleccionDatosEmailTareaIncidencia
	BackgroundSeleccionDatosEmailTareaIncidencia.RemoveAllViews
	BackgroundSeleccionDatosEmailTareaIncidencia.RemoveViewFromParent
End Sub

Private Sub btnCancelarDatosEmailFaseIncidencia_Click
	SalirSeleccionDatosEmailTareaIncidencia
End Sub



Private Sub btnOKDatosEmailFaseIncidencia_Click
		
	SalirSeleccionDatosEmailTareaIncidencia
	
'	Dim CuentaDEEmailIncidencia As String
'	Dim sCuentasParaEmailIncidencia As String
'	Dim sCuentasCCEmailIncidencia As String
'	Select True
'		Case RadioButtonDeCuentaUsuario.As(RadioButton).Selected
'			wait for(SeleccionarDireccionRemitenteEmails) complete (sCuenta As String)
'			If sCuenta="" Then
'				wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio seleccionar una cuenta de remitente.")) complete (rObj As Object)
'				Return
'			End If
'			CuentaDEEmailIncidencia=sCuenta
'		Case RadioButtonDeIncidenciasProveedor.As(RadioButton).Selected
'			CuentaDEEmailIncidencia=NombreCuentaIncidenciasProveedor
'		Case RadioButtonDeIncidenciasCompras.As(RadioButton).Selected
'			CuentaDEEmailIncidencia=NombreCuentaIncidenciasCompras
'	End Select
'	
'	If CheckBoxParaProveedor.Checked Then
'		wait for (SeleccionarCuentaEmailProveedor(txtProveedor.Text)) complete (sResp As String)
'		If sResp="" Then
'			wait for(Utilidades.MsgBoxXUI("Cuenta email proveedor no seleccionada","Indica la cuenta de email del proveedor en el correo, en Outlook,")) complete (rObj As Object)
'		Else
'			sCuentasParaEmailIncidencia=sResp
'		End If
'	End If
'	
'	If CheckBoxParaIncidenciasProveedor.Checked Then
'		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
'		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaIncidenciasProveedor
'	End If
'	If CheckBoxParaIncidenciasCompras.Checked Then
'		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
'		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaIncidenciasCompras
'	End If
'	
'	If CheckBoxCCIncidenciasProveedor.Checked Then
'		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
'		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaIncidenciasProveedor
'	End If
'	If CheckBoxCCIncidenciasCompras.Checked Then
'		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
'		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaIncidenciasCompras
'	End If
'	If CheckBoxCCFacturas.Checked Then
'		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
'		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & EmailFacturas
'	End If
'	
'	If sCuentasParaEmailIncidencia="" Then sCuentasParaEmailIncidencia="None"
'	If sCuentasCCEmailIncidencia="" Then sCuentasCCEmailIncidencia="None"
'	
'	If B4XSwitchIncluirDescripcionFaseBodyEmailFaseIncidencia.Value Then
'		'Dim sBody As String=$"$Xml{lblDescripcionFaseBodyEmailFaseIncidencia.Text}"$
'		Dim sBody As String=$"$Xml{TextAreaDescripcionFaseBodyEmailFaseIncidencia.Text}"$
'	Else
'		Dim sBody As String=$"$Xml{""}"$
'	End If
'	
'	EnviarEmailFaseIncidencia(CuentaDEEmailIncidencia, sCuentasParaEmailIncidencia, sCuentasCCEmailIncidencia, sBody)
End Sub

Sub EnviarEmail(CuentaDe As String, sCuentaPara As String, sCuentaCC As String, sBody As String)

'	If DireccionSeleccionadaRemitenteEmails="" Then
'		wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
'		If rBool=False Then
'			Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar la dirección desde la que enviar emails." & CRLF & CRLF & "Selecciónala desde el menú de Acciones." ,"Aviso")
'			Wait For (msa) Msgbox_Result
'			Return
'		End If
'	Else
'		Dim msa As Object = xui.Msgbox2Async("La dirección DESDE la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmails, "Direccion envío email", "Sí", "Cancelar", "Seleccionar Otra", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		Select rInt
'			Case xui.DialogResponse_Cancel
'				Return
'			Case xui.DialogResponse_Negative
'				Dim msa As Object=xui.MsgboxAsync("Selecciona otra cuenta remitente desde el menú Acciones." ,"Aviso")
'				Wait For (msa) Msgbox_Result
'				Return
'		End Select
'	End If


	
	
' ESTA SCRIPT PARECE QUE SOLO COMPRUEBA SI LA CUENTA DEL BUZON COMPARTIDO EXISTE EN LA LIBRETA DE DIRECCIONES DEL USUARIO
' NO SI TIENE PERMISO PARA ENVIAR EN NOMBRE DE ...
	
'	wait for(EjecutarVBSScriptAccesoABuzonCompartido("incidenciasproveedor@protec-marti.com")) complete (mRes As Map)
'	Log("mRes: " & mRes)
'	Dim Success As Boolean=mRes.Get("Success")
'	Dim ExitCode As Int=mRes.Get("ExitCode")
'	Dim StdOut As String=mRes.Get("StdOut")
'	Dim StdErr As String=mRes.Get("StdErr")
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt acceso a buzon compartido" & CRLF & "Avisa al administrador de la aplicación.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	If ExitCode=1 Then
'		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & StdErr,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	Dim msa As Object=xui.MsgboxAsync("Acceso a buzón compartido, OK","Aviso")
'	Wait For (msa) Msgbox_Result
'	
'	
'	
'
'	
'	Dim DireccionDestinoEmailCC As String
'	
'	Dim msa As Object = xui.Msgbox2Async("¿Añadir otra dirección de email a la que enviar el mensaje en copia?", "", "Sí", "", "No", Null)
'	Wait For (msa) Msgbox_Result (rInt As Int)
'	If rInt=xui.DialogResponse_Positive Then
'		Dialog.Title="Indica Dirección Email Destinatario (Copia)"
'		Dialog.TitleBarHeight=50dip
'		Dim InputDlg As B4XInputTemplate
'		InputDlg.Initialize
'		InputDlg.lblTitle.Text=""
'		InputDlg.Text=""
'		InputDlg.RegexPattern="^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"
'	
'		'InputDlg.mBase.Height = 20%y
'		InputDlg.mBase.Width = 600dip
'	
'		Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
'		Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'		bOK.TextSize=15
'		Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'		bCancel.TextSize=15
'		bCancel.Left=bCancel.Left-20dip
'		bCancel.Width=bCancel.Width+20dip
'		Wait For (rSub) complete (rInt As Int)
'
'		If rInt<>xui.DialogResponse_Positive Then
'			Dim msa As Object = xui.Msgbox2Async("No se ha añadido direccion de email destinatario (copia) ¿Continuar con el proceso?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then
'				Return
'			End If
'		Else
'			Dim DireccionDestinoEmailCC As String=InputDlg.Text.Trim
'		End If
'	End If
'	
'	If DireccionDestinoEmailCC="" Then DireccionDestinoEmailCC="None"
	
	
	
	
	wait for(EjecutarVBSScriptCrearEmail(CuentaDe,sCuentaPara, sCuentaCC, "Incidencia proveedor [" & txtNumeroIncidencia.Text & "]",sBody,"None")) complete (mRes As Map)

	Log("mRes: " & mRes)
	Dim Success As Boolean=mRes.Get("Success")
	Dim ExitCode As Int=mRes.Get("ExitCode")
	Dim StdOut As String=mRes.Get("StdOut")
	Dim StdErr As String=mRes.Get("StdErr")
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF  & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	wait for(Utilidades.MsgBoxXUI("Aviso","Email creado en Outlook.")) complete (rObj As Object)
	
	MoverFocoAOutlookIncidencia(txtNumeroIncidencia.Text)
	
End Sub


Private Sub CheckBoxCCAlmacenPROIN_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub CheckBoxParaAlmacenPROIN_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub RadioButtonDeAlmacenPROIN_SelectedChange(Selected As Boolean)
	
End Sub

Private Sub CheckBoxParaDepartamentoAsignadoFase_CheckedChange(Checked As Boolean)
	If Checked Then CheckBoxCCDepartamentoAsignadoFase.Checked=False
End Sub



Private Sub lblIconFicherosAdjuntosAccionLinea_MouseClicked (EventData As MouseEvent)
	Dim lblFicherosAdjuntosAccionSel As B4XView=Sender

	lblFicherosAdjuntosAccionSel.TextColor=xui.Color_Black
	lblFicherosAdjuntosAccionSel.Color=0xFF00FFFF

	Sleep(0)
	
	Dim iDxAccionSel As Int=clvAccionesIncidencia.GetItemFromView(lblFicherosAdjuntosAccionSel)
	Dim DataAccionSel As TipoDatosAccionIncidencia=clvAccionesIncidencia.GetValue(iDxAccionSel)

	
'	If ModoFicha="VER" Then
'		VerFicherosAdjuntosFaseIncidencia(DataAccionSel)
'	Else
'		EditarFicherosAdjuntosFaseIncidencia(DataAccionSel)
'	End If
	
	If ModoFicha<>"VER" Then
		
		'VerFicherosAdjuntosFaseIncidencia(DataAccionSel)
		Dim msa As Object=xui.MsgboxAsync("No es posible adjuntar ficheros en Modo Edición ni en Modo Nuevo.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	Else
		EditarFicherosAdjuntosFaseIncidencia(DataAccionSel)
	End If
	

	
	
End Sub

Private Sub lblIconFicherosAdjuntosAccionLinea_MouseReleased (EventData As MouseEvent)
	Dim lblFicherosAdjuntosAccionSel As B4XView=Sender
	lblFicherosAdjuntosAccionSel.TextColor=xui.Color_Black
	lblFicherosAdjuntosAccionSel.Color=xui.Color_Transparent
	
End Sub

Private Sub lblIconFicherosAdjuntosAccionLinea_MouseEntered (EventData As MouseEvent)
	Dim lblFicherosAdjuntosAccionSel As B4XView=Sender
	lblFicherosAdjuntosAccionSel.TextColor=xui.Color_Black
	lblFicherosAdjuntosAccionSel.Color=0xFFFFD700
End Sub

Private Sub lblIconFicherosAdjuntosAccionLinea_MouseExited (EventData As MouseEvent)
	Dim lblFicherosAdjuntosAccionSel As B4XView=Sender
	If lblFicherosAdjuntosAccionSel.IsInitialized Then
		lblFicherosAdjuntosAccionSel.TextColor=xui.Color_Black
		lblFicherosAdjuntosAccionSel.Color=xui.Color_Transparent
	End If
End Sub

Private Sub btnCopiarInfoLineasPedidoCompraADescripcionFaseIncidencia_Click
	CopiarInfoLineasPedidoCompraADescripcionFaseIncidencia
End Sub

Sub CopiarInfoLineasPedidoCompraADescripcionFaseIncidencia
	If txtTipoDocumentoOrigen.Text<>"Pedido Compra" Then
		Dim msa As Object=xui.MsgboxAsync("La función Copiar Líneas de Pedido a Descripción sólo está disponible para Tipo Documento Origen=Pedido de compra","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Dim PedidoCompraSel As String=txtDocumentoOrigenProveedor.Text.ToUpperCase
	If PedidoCompraSel.StartsWith("PC")= False Then
		Dim msa As Object=xui.MsgboxAsync("Es necesario indicar el pedido de compra en la cabecera de la incidencia.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Añadir la información de Descripción + artículo/talla de las líneas del pedido de compra ${PedidoCompraSel} a la Descripción de la incidencia?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	jamLoadingIndicator1.MensajeLoading="Cargando info pedido compra..."
	jamLoadingIndicator1.Show
	Wait For(CargaDatosPedidoCompra(PedidoCompraSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		Return
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	Dim sLineasPedido As String
	If txtDocumentoProveedor.Text<>"" Then
		sLineasPedido=txtTipoDocumentoProveedor.Text & ": " & txtDocumentoProveedor.Text
	End If
	If txtDocumentoOrigenProveedor.Text<>"" Then
		If sLineasPedido<>"" Then sLineasPedido=sLineasPedido & "   "
		sLineasPedido=sLineasPedido & txtTipoDocumentoOrigen.Text & ": " & txtDocumentoOrigenProveedor.Text.ToUpperCase
	End If
	If sLineasPedido<>"" Then sLineasPedido=sLineasPedido & CRLF & CRLF
	For Each mData As Map In lstReg
		Log(mData)
		Dim Variante As String=mData.get("Variante")
		If Variante="" Then
			'sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "    Cantidad Pedido: " & mData.get("Qty") & CRLF
			sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & CRLF
		Else
			'sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "   Talla: " & mData.Get("Talla") & "    Cantidad Pedido: " & mData.get("Qty") & CRLF
			sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "   Talla: " & mData.Get("Variante") & CRLF
		End If
	Next
	sLineasPedido=sLineasPedido.SubString2(0,sLineasPedido.Length-1) ' eliminar el ultimo crlf
'	TextAreaDescripcionAccionNuevaEditar.Text=TextAreaDescripcionAccionNuevaEditar.Text & CRLF & sLineasPedido
'	TextAreaDescripcionAccionNuevaEditar.Text=TextAreaDescripcionAccionNuevaEditar.Text.Trim
'	TextAreaDescripcionIncidencia.Text=TextAreaDescripcionIncidencia.Text & CRLF & sLineasPedido
'	TextAreaDescripcionIncidencia.Text=TextAreaDescripcionIncidencia.Text.Trim
	If BBCodeViewDescripcionIncidencia.Text="" Then
		BBCodeViewDescripcionIncidencia.Text=$"${sLineasPedido}"$
	Else
		BBCodeViewDescripcionIncidencia.Text=$"${BBCodeViewDescripcionIncidencia.Text}
${sLineasPedido}"$
	End If

	BBCodeViewDescripcionIncidencia.Text=BBCodeViewDescripcionIncidencia.Text.Trim
	jamLoadingIndicator1.Close
End Sub


Sub GrabarFicherosAdjuntosAccionIncidencia(IDLineaAccion As Int)
	
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoFaseIncidencia_MousePressed (EventData As MouseEvent)
	Dim lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Cyan
End Sub

Sub lblEliminarLinkFicheroAdjuntoFaseIncidencia_MouseClicked (EventData As MouseEvent)
	Dim lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Black
	
	Dim iDx As Int=clvFicherosAdjuntosFaseIncidencia.GetItemFromView(lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel)
	Dim DataFicheroSel As TipoDatosFicheroAdjuntoIncidencia=clvFicherosAdjuntosFaseIncidencia.GetValue(iDx)
	Dim LinkFicheroSel As String=DataFicheroSel.LinkFichero
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿eliminar el link del fichero seleccionado?
${LinkFicheroSel}
(No se elimina el fichero, sólo el enlace de ese fichero con la Fase de la incidencia"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim DatosAccionSel As TipoDatosAccionIncidencia=btnOKFicherosAdjuntosFaseIncidencia.Tag
	Dim IDlineaAccionSel As Int=DatosAccionSel.IDLineaAccion
'	For iDxFichDel=0 To lstFicherosAccionesIncidenciaTemp.Size-1
'		Dim DatosFicheroIDx As TipoDatosFicherosAccionIncidencia=lstFicherosAccionesIncidenciaTemp.Get(iDxFichDel)
'		If DatosFicheroIDx.IDLineaAccion=IDlineaAccionSel And DatosFicheroIDx.LinkFichero=LinkFicheroSel Then
'			lstFicherosAccionesIncidenciaTemp.RemoveAt(iDxFichDel)
'			Exit
'		End If
'	Next

	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorEliminarLinkFicheroAdjuntoFaseIncidencia", _
			Array(IDlineaAccionSel, DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, IDlineaAccionSel, LinkFicheroSel))
			
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar el link del fichero de la fase seleccionada.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	'MostrarFicherosAdjuntosFaseIncidencia(DatosAccionSel)
	
	clvFicherosAdjuntosFaseIncidencia.RemoveAt(iDx)
	'lstFicherosAccionesIncidenciaTemp.RemoveAt(lstFicherosAccionesIncidenciaTemp.IndexOf(DataFicheroSel))
	'lstFicherosAccionesIncidencia.RemoveAt(lstFicherosAccionesIncidencia.IndexOf(DataFicheroSel))
	lstFicherosAdjuntosIncidencia.RemoveAt(lstFicherosAdjuntosIncidencia.IndexOf(DataFicheroSel))
	
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoFaseIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Black
	
'	Dim iDx As Int=clvFicherosAdjuntosFaseIncidencia.GetItemFromView(lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel)
'	Dim DataFicheroSel As TipoDatosFicherosAccionIncidencia=clvFicherosAdjuntosFaseIncidencia.GetValue(iDx)
'	Dim LinkFicheroSel As String=DataFicheroSel.LinkFichero
'	
'	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿eliminar el link del fichero seleccionado?
'${LinkFicheroSel}
'(No se elimina el fichero, sólo el enlace de ese fichero con la Fase de la incidencia"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	
'	Dim DatosAccionSel As TipoDatosAccionIncidencia=btnOKFicherosAdjuntosFaseIncidencia.Tag
'	Dim IDlineaAccionSel As Int=DatosAccionSel.IDLineaAccion
'	For iDxFichDel=0 To lstFicherosAccionesIncidenciaTemp.Size-1
'		Dim DatosFicheroIDx As TipoDatosFicherosAccionIncidencia=lstFicherosAccionesIncidenciaTemp.Get(iDxFichDel)
'		If DatosFicheroIDx.IDLineaAccion=IDlineaAccionSel And DatosFicheroIDx.LinkFichero=LinkFicheroSel Then
'			lstFicherosAccionesIncidenciaTemp.RemoveAt(iDxFichDel)
'			Exit
'		End If
'	Next
'	MostrarFicherosAdjuntosFaseIncidencia(DatosAccionSel)
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoFaseIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Black

	
	Dim iDx As Int=clvFicherosAdjuntosFaseIncidencia.GetItemFromView(lbl)
	Dim DataFicheroSel As TipoDatosFicheroAdjuntoIncidencia=clvFicherosAdjuntosFaseIncidencia.GetValue(iDx)
	Dim LinkFicheroSel As String=DataFicheroSel.LinkFichero
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿eliminar el link del fichero seleccionado?
${LinkFicheroSel}
(No se elimina el fichero, sólo el enlace de ese fichero con la Fase de la incidencia"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim DatosAccionSel As TipoDatosAccionIncidencia=btnOKFicherosAdjuntosFaseIncidencia.Tag
	Dim IDlineaAccionSel As Int=DatosAccionSel.IDLineaAccion
'	For iDxFichDel=0 To lstFicherosAccionesIncidenciaTemp.Size-1
'		Dim DatosFicheroIDx As TipoDatosFicherosAccionIncidencia=lstFicherosAccionesIncidenciaTemp.Get(iDxFichDel)
'		If DatosFicheroIDx.IDLineaAccion=IDlineaAccionSel And DatosFicheroIDx.LinkFichero=LinkFicheroSel Then
'			lstFicherosAccionesIncidenciaTemp.RemoveAt(iDxFichDel)
'			Exit
'		End If
'	Next

	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorEliminarLinkFicheroAdjuntoFaseIncidencia", _
			Array(IDlineaAccionSel, DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, IDlineaAccionSel, LinkFicheroSel))
			
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar el link del fichero de la fase seleccionada.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	'MostrarFicherosAdjuntosFaseIncidencia(DatosAccionSel)
	
	clvFicherosAdjuntosFaseIncidencia.RemoveAt(iDx)
	'lstFicherosAccionesIncidenciaTemp.RemoveAt(lstFicherosAccionesIncidenciaTemp.IndexOf(DataFicheroSel))
	'lstFicherosAccionesIncidencia.RemoveAt(lstFicherosAccionesIncidencia.IndexOf(DataFicheroSel))
	lstFicherosAdjuntosIncidencia.RemoveAt(lstFicherosAdjuntosIncidencia.IndexOf(DataFicheroSel))
	
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoFaseIncidencia_MouseExited (EventData As MouseEvent)
	Dim lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	If lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel.IsInitialized Then
		lblEliminarLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Black
	End If
End Sub


Private Sub lblAbrirLinkFicheroAdjuntoFaseIncidencia_MousePressed (EventData As MouseEvent)
	Dim lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Cyan
End Sub

'Private Sub lblAbrirLinkFicheroAdjuntoFaseIncidencia_MouseClicked (EventData As MouseEvent)
'	Dim lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
'	lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Cyan
'End Sub

Private Sub lblAbrirLinkFicheroAdjuntoFaseIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Black
	
	Dim iDx As Int=clvFicherosAdjuntosFaseIncidencia.GetItemFromView(lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel)
	Dim DataFichero As TipoDatosFicheroAdjuntoIncidencia=clvFicherosAdjuntosFaseIncidencia.GetValue(iDx)
	Dim LinkFichero As String=DataFichero.LinkFichero
	If File.Exists(File.GetFileParent(LinkFichero), File.GetName(LinkFichero))=False Then
		Dim msa As Object=xui.MsgboxAsync($"No existe el fichero seleccionado
 ${LinkFichero}"$,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Try
		fx.ShowExternalDocument(LinkFichero)
	Catch
		Log(LastException)
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible abrir el fichero seleccionado
		 ${LinkFichero }
		 ${LastException.Message}"$,"Error")
		Wait For (msa) Msgbox_Result
	End Try
End Sub

Private Sub lblAbrirLinkFicheroAdjuntoFaseIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=0xFFFFD700
End Sub

Private Sub lblAbrirLinkFicheroAdjuntoFaseIncidencia_MouseExited (EventData As MouseEvent)
	Dim lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel As B4XView=Sender
	lblAbrirLinkFicheroAdjuntoFaseIncidenciaSel.Textcolor=xui.Color_Black
End Sub


'Sub VerFicherosAdjuntosFaseIncidencia(DataAccionSel As TipoDatosAccionIncidencia)
'	
'	Dim IDLineaAccionSel As Int=DataAccionSel.IDLineaAccion
'	
'	jamLoadingIndicator1.MensajeLoading="Cargando Ficheros Adjuntos Fase Incidencia..."
'	jamLoadingIndicator1.Show
'	Wait For(CargaDatosFicherosAdjuntosAccionIncidencia(IDLineaAccionSel)) complete (mRes As Map)
'	jamLoadingIndicator1.Close
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then Return
'	Dim lstReg As List=mRes.Get("lstReg")
'	If lstReg.Size=0 Then 
'		Dim msa As Object=xui.MsgboxAsync("No se han adjuntado ficheros a la fase seleccionada de la incidencia. En caso necesario, añadirlos en modo Edición.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	For Each xNode As B4XView In frm.RootPane
'		If xNode Is Pane Then
'			If xNode.Tag="BackgroundSeleccionFicherosAdjuntosFaseIncidencia" Then
'				xNode.RemoveViewFromParent
'				Exit
'			End If
'		End If
'	Next
'	
'	BackgroundSeleccionFicherosAdjuntosFaseIncidencia= xui.CreatePanel("BackgroundSeleccionFicherosAdjuntosFaseIncidencia")
'	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Tag = "BackgroundSeleccionFicherosAdjuntosFaseIncidencia"
'	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Color=0xaa000000
'	frm.RootPane.AddNode(BackgroundSeleccionFicherosAdjuntosFaseIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)
'
'	BaseSeleccionFicherosAdjuntosFaseIncidencia=xui.CreatePanel("pnlBaseSeleccionFicherosAdjuntosFaseIncidencia")
'	BaseSeleccionFicherosAdjuntosFaseIncidencia.SetLayoutAnimated(0,0,0,600dip,500dip)
'	BaseSeleccionFicherosAdjuntosFaseIncidencia.LoadLayout("scrIncidenciasProveedoresFicherosAdjuntosFase")
'
'	
'	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.AddView(BaseSeleccionFicherosAdjuntosFaseIncidencia,(BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Width/2-BaseSeleccionFicherosAdjuntosFaseIncidencia.Width/2), _
'		(BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Height/2-BaseSeleccionFicherosAdjuntosFaseIncidencia.Height/2), BaseSeleccionFicherosAdjuntosFaseIncidencia.Width, BaseSeleccionFicherosAdjuntosFaseIncidencia.Height)
'		
'End Sub


Sub EditarFicherosAdjuntosIncidencia(IDIncidenciaSel As Int)
	
	jamLoadingIndicator1.MensajeLoading="Cargando Ficheros Adjuntos Incidencia..."
	jamLoadingIndicator1.Show
	lstFicherosAdjuntosIncidencia.Initialize
	Wait For(CargaDatosFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
	Dim accion As String=mRes.get("Accion")
	If accion="NOK" Then
		'DateTime.DateFormat=DateFormatAnt
		jamLoadingIndicator1.Close
		Return
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mDataFichero As Map In lstReg
		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicheroAdjuntoIncidencia
		FicheroAdjuntoAccionIncidencia.Initialize
		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
		lstFicherosAdjuntosIncidencia.Add(FicheroAdjuntoAccionIncidencia)
		'AddItemCLVAccionesAccion(AccionIncidencia)
	Next
	Dim NumFicherosIncidencia As Int
	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFichero.IDLineaAccion=0 Then NumFicherosIncidencia=NumFicherosIncidencia+1
	Next
	DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia=NumFicherosIncidencia
	
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundSeleccionFicherosAdjuntosIncidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundSeleccionFicherosAdjuntosIncidencia= xui.CreatePanel("BackgroundSeleccionFicherosAdjuntosIncidencia")
	BackgroundSeleccionFicherosAdjuntosIncidencia.Tag = "BackgroundSeleccionFicherosAdjuntosIncidencia"
	BackgroundSeleccionFicherosAdjuntosIncidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundSeleccionFicherosAdjuntosIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseSeleccionFicherosAdjuntosIncidencia=xui.CreatePanel("pnlBaseSeleccionFicherosAdjuntosIncidencia")
	BaseSeleccionFicherosAdjuntosIncidencia.SetLayoutAnimated(0,0,0,750dip,500dip)
	BaseSeleccionFicherosAdjuntosIncidencia.LoadLayout("scrIncidenciasProveedoresFicherosAdjuntos")

	
	BackgroundSeleccionFicherosAdjuntosIncidencia.AddView(BaseSeleccionFicherosAdjuntosIncidencia,(BackgroundSeleccionFicherosAdjuntosIncidencia.Width/2-BaseSeleccionFicherosAdjuntosIncidencia.Width/2), _
		(BackgroundSeleccionFicherosAdjuntosIncidencia.Height/2-BaseSeleccionFicherosAdjuntosIncidencia.Height/2), BaseSeleccionFicherosAdjuntosIncidencia.Width, BaseSeleccionFicherosAdjuntosIncidencia.Height)
	
	jamLoadingIndicator1.Close

	MostrarFicherosAdjuntosIncidencia(IDIncidenciaSel)

End Sub


Sub EditarFicherosAdjuntosFaseIncidencia(DataAccionSel As TipoDatosAccionIncidencia)
	
	lstFicherosAdjuntosIncidencia.Initialize
	jamLoadingIndicator1.MensajeLoading="Cargando Ficheros Adjuntos Incidencia..."
	jamLoadingIndicator1.Show
	Wait For(CargaDatosFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mDataFichero As Map In lstReg
		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicheroAdjuntoIncidencia
		FicheroAdjuntoAccionIncidencia.Initialize
		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
		lstFicherosAdjuntosIncidencia.Add(FicheroAdjuntoAccionIncidencia)
		'AddItemCLVAccionesAccion(AccionIncidencia)
	Next
	Dim NumFicherosIncidencia As Int
	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFichero.IDLineaAccion=0 Then NumFicherosIncidencia=NumFicherosIncidencia+1
	Next
	DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia=NumFicherosIncidencia
	
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundSeleccionFicherosAdjuntosFaseIncidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundSeleccionFicherosAdjuntosFaseIncidencia= xui.CreatePanel("BackgroundSeleccionFicherosAdjuntosFaseIncidencia")
	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Tag = "BackgroundSeleccionFicherosAdjuntosFaseIncidencia"
	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundSeleccionFicherosAdjuntosFaseIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseSeleccionFicherosAdjuntosFaseIncidencia=xui.CreatePanel("pnlBaseSeleccionFicherosAdjuntosFaseIncidencia")
	BaseSeleccionFicherosAdjuntosFaseIncidencia.SetLayoutAnimated(0,0,0,750dip,500dip)
	BaseSeleccionFicherosAdjuntosFaseIncidencia.LoadLayout("scrIncidenciasProveedoresFicherosAdjuntosFase")

	
	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.AddView(BaseSeleccionFicherosAdjuntosFaseIncidencia,(BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Width/2-BaseSeleccionFicherosAdjuntosFaseIncidencia.Width/2), _
		(BackgroundSeleccionFicherosAdjuntosFaseIncidencia.Height/2-BaseSeleccionFicherosAdjuntosFaseIncidencia.Height/2), BaseSeleccionFicherosAdjuntosFaseIncidencia.Width, BaseSeleccionFicherosAdjuntosFaseIncidencia.Height)
		

	MostrarFicherosAdjuntosFaseIncidencia(DataAccionSel)

End Sub

'Sub MostrarFicherosAdjuntosFaseIncidenciaEdicion(DataAccionSel As TipoDatosAccionIncidencia)
'	
'	clvFicherosAdjuntosFaseIncidencia.Clear
'	
'	btnOKFicherosAdjuntosFaseIncidencia.Tag=DataAccionSel
'	
'	Dim IDLineaAccionSel As Int=DataAccionSel.IDLineaAccion
'	
'	Dim lstLinksFicherosActualesAccion As List
'	lstLinksFicherosActualesAccion.Initialize
'	
'	For Each DatosFicheroAccion As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
'		If DatosFicheroAccion.IDLineaAccion=IDLineaAccionSel Then
'			lstLinksFicherosActualesAccion.Add(DatosFicheroAccion)
'		End If
'	Next
'	
'	Dim pnlNuevoFicheroAdjunto As Pane=xui.CreatePanel("")
'	pnlNuevoFicheroAdjunto.SetLayoutAnimated(0,0,0,clvFicherosAdjuntosFaseIncidencia.AsView.Width,40dip)
'	pnlNuevoFicheroAdjunto.LoadLayout("scrIncidenciasProveedoresItemNuevoFicheroAdjuntoFaseIncidencia")
'	Dim sv As ScrollPane = clvAccionesIncidencia.sv
'	sv.SetVScrollVisibility("AS_NEEDED")
'	Dim NuevoFicheroAdjuntoAccion As TipoDatosFicherosAccionIncidencia
'	NuevoFicheroAdjuntoAccion.IDIncidencia=DatosCabeceraIncidenciaProveedorTemp.IDIncidenciaProveedor
'	NuevoFicheroAdjuntoAccion.IDLineaAccion=IDLineaAccionSel
'	NuevoFicheroAdjuntoAccion.IDLineaFicherosAdjuntos=-1 ' nueva
'	NuevoFicheroAdjuntoAccion.LinkFichero=""
'	clvFicherosAdjuntosFaseIncidencia.Add(pnlNuevoFicheroAdjunto,NuevoFicheroAdjuntoAccion)
'	
'	For Each DatoFicheroAccionSel As TipoDatosFicherosAccionIncidencia In lstLinksFicherosActualesAccion
'		Dim pnlItemFicheroAdjunto As Pane=xui.CreatePanel("")
'		pnlItemFicheroAdjunto.SetLayoutAnimated(0,0,0,clvFicherosAdjuntosFaseIncidencia.AsView.Width,40dip)
'		pnlItemFicheroAdjunto.LoadLayout("scrIncidenciasProveedorItemFicheroAdjuntoFaseIncidencia")
'		lblAbrirLinkFicheroAdjuntoFaseIncidencia.Font=Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24)
'		lblAbrirLinkFicheroAdjuntoFaseIncidencia.Textsize=24
'		lblAbrirLinkFicheroAdjuntoFaseIncidencia.TextColor=xui.Color_Black
'		lblAbrirLinkFicheroAdjuntoFaseIncidencia.Text=Chr(0xfda6)
'		lblLinkFicheroAdjuntoFaseIncidencia.Text=DatoFicheroAccionSel.LinkFichero
'		clvFicherosAdjuntosFaseIncidencia.Add(pnlItemFicheroAdjunto,DatoFicheroAccionSel)
'	Next
'End Sub

Sub MostrarFicherosAdjuntosFaseIncidencia(DataAccionSel As TipoDatosAccionIncidencia)
	
'	lstFicherosAccionesIncidenciaTemp.Initialize
'	lstFicherosAccionesIncidenciaTemp=CopyObject(lstFicherosAccionesIncidencia)
	
	clvFicherosAdjuntosFaseIncidencia.Clear
	
	btnOKFicherosAdjuntosFaseIncidencia.Tag=DataAccionSel
	
	Dim IDLineaAccionSel As Int=DataAccionSel.IDLineaAccion
	
	Dim lstLinksFicherosActualesAccion As List
	lstLinksFicherosActualesAccion.Initialize
	
	'For Each DatosFicheroAccion As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
	'For Each DatosFicheroAccion As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidencia
	For Each DatosFicheroAccion As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFicheroAccion.IDLineaAccion=IDLineaAccionSel Then
			lstLinksFicherosActualesAccion.Add(DatosFicheroAccion)
		End If
	Next
	
	Dim pnlNuevoFicheroAdjunto As Pane=xui.CreatePanel("")
	pnlNuevoFicheroAdjunto.SetLayoutAnimated(0,0,0,clvFicherosAdjuntosFaseIncidencia.AsView.Width,40dip)
	pnlNuevoFicheroAdjunto.LoadLayout("scrIncidenciasProveedoresItemNuevoFicheroAdjuntoFaseIncidencia")
	Dim sv As ScrollPane = clvFicherosAdjuntosFaseIncidencia.sv
	sv.SetVScrollVisibility("AS_NEEDED")
	Dim NuevoFicheroAdjuntoAccion As TipoDatosFicheroAdjuntoIncidencia
	'NuevoFicheroAdjuntoAccion.IDIncidencia=DatosCabeceraIncidenciaProveedorTemp.IDIncidenciaProveedor
	NuevoFicheroAdjuntoAccion.IDIncidencia=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
	NuevoFicheroAdjuntoAccion.IDLineaAccion=IDLineaAccionSel
	NuevoFicheroAdjuntoAccion.IDLineaFicherosAdjuntos=-1 ' nueva
	NuevoFicheroAdjuntoAccion.LinkFichero=""
	clvFicherosAdjuntosFaseIncidencia.Add(pnlNuevoFicheroAdjunto,NuevoFicheroAdjuntoAccion)
	
	For Each DatoFicheroAccionSel As TipoDatosFicheroAdjuntoIncidencia In lstLinksFicherosActualesAccion
		Dim pnlItemFicheroAdjunto As Pane=xui.CreatePanel("")
		pnlItemFicheroAdjunto.SetLayoutAnimated(0,0,0,clvFicherosAdjuntosFaseIncidencia.AsView.Width,40dip)
		pnlItemFicheroAdjunto.LoadLayout("scrIncidenciasProveedorItemFicheroAdjuntoFaseIncidencia")
		lblAbrirLinkFicheroAdjuntoFaseIncidencia.Font=Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24)
		lblAbrirLinkFicheroAdjuntoFaseIncidencia.Textsize=24
		lblAbrirLinkFicheroAdjuntoFaseIncidencia.TextColor=xui.Color_Black
		lblAbrirLinkFicheroAdjuntoFaseIncidencia.Text=Chr(0xfda6)
		lblLinkFicheroAdjuntoFaseIncidencia.Text=DatoFicheroAccionSel.LinkFichero
		clvFicherosAdjuntosFaseIncidencia.Add(pnlItemFicheroAdjunto,DatoFicheroAccionSel)
	Next
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoFaseIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Cyan
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoFaseIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	Dim iDx As Int=clvFicherosAdjuntosFaseIncidencia.GetItemFromView(lbl)
	Dim DatosFicheroNuevo As TipoDatosFicheroAdjuntoIncidencia=clvFicherosAdjuntosFaseIncidencia.GetValue(iDx)
	Dim DataAccionSel As TipoDatosAccionIncidencia
	'For Each DataAccion As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedorTemp
	For Each DataAccion As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedor
		If DataAccion.IDLineaAccion=DatosFicheroNuevo.IDLineaAccion Then
			DataAccionSel=CopyObject(DataAccion)
			Exit
		End If
	Next
	AdjuntarFicherosAccion(DataAccionSel)
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoFaseIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=0xFFFFD700
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoFaseIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized=False Then Return
	lbl.TextColor=xui.Color_Black
End Sub


Sub AdjuntarFicherosAccion(DatosAccionSel As TipoDatosAccionIncidencia)
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasFicheroAdjuntoAccionIncidenciaBatchDispositivoUsuario", _
			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	jamLoadingIndicator1.Close
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar las tablas batch de incidencias proveedor dispositivo-usuario.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
		
	Dim lstLinksFicherosNuevos As List
	lstLinksFicherosNuevos.Initialize
	
	Dim FcH As FileChooser
	FcH.Initialize
	Dim lstLinksFicherosNuevosSeleccionados As List=FcH.ShowOpenMultiple(frm)
	If lstLinksFicherosNuevosSeleccionados.IsInitialized=False Then Return
	Log(lstLinksFicherosNuevosSeleccionados)
	
'''	Dim UUIDSel As String=Utilidades.GenerarUUIDv4
'''	
'''	Dim lstComandos As List
'''	lstComandos.Initialize
'''	
'''	For Each sLink As String In lstLinksFicherosNuevos
'''		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaFicheroAdjuntoAccionIncidenciaBatch", _
'''			Array(DateTime.Now, UUIDSel,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,DatosAccionSel.IDIncidencia, _
'''			DatosAccionSel.IDLineaAccion, DatosAccionSel.IDLineaAcciontemp,sLink))
'''		lstComandos.Add(cmd)
'''	Next
'''	
'''	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
'''	If Success=False Then
'''		jamLoadingIndicator1.close
'''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar los datos en la tabla batch de incidencias proveedor dispositivo-usuario.","Error")
'''		Wait For (msa) Msgbox_Result
'''		Return
'''	End If
'''
'''	
'''	Dim UUIDSel As String=Utilidades.GenerarUUIDv4
'''	
'''	Dim lstComandos As List
'''	lstComandos.Initialize
'''	
'''	For Each sLink As String In lstLinksFicherosNuevos
'''		' usamos la misma tabla que los adjuntos de accion (tarea) con IDLineaAccion=0
'''		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaFicheroAdjuntoAccionIncidenciaBatch", _
'''			Array(DateTime.Now, UUIDSel,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, 0,0, sLink))
'''		lstComandos.Add(cmd)
'''	Next
'''	
'''	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
'''	If Success=False Then
'''		jamLoadingIndicator1.close
'''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar los datos en la tabla batch de ficheros adjuntos de incidencias proveedor dispositivo-usuario.","Error")
'''		Wait For (msa) Msgbox_Result
'''		Return
'''	End If
'''
'''	Wait For(GrabarNuevosLinksFicherosAdjuntos(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor,0,UUIDSel)) complete (mRes As Map)
'''	Dim Accion As String=mRes.get("Accion")
'''	If Accion<>"OK" Then Return
'''	
'''	lstFicherosAdjuntosIncidencia.Initialize
'''	jamLoadingIndicator1.MensajeLoading="Cargando Ficheros Adjuntos Incidencia..."
'''	jamLoadingIndicator1.Show
'''	Wait For(CargaDatosFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
'''	jamLoadingIndicator1.Close
'''	Dim Accion As String=mRes.Get("Accion")
'''	If Accion="NOK" Then Return
'''	Dim lstReg As List=mRes.Get("lstReg")
'''	For Each mDataFichero As Map In lstReg
'''		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicheroAdjuntoIncidencia
'''		FicheroAdjuntoAccionIncidencia.Initialize
'''		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
'''		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
'''		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
'''		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
'''		lstFicherosAdjuntosIncidencia.Add(FicheroAdjuntoAccionIncidencia)
'''		'AddItemCLVAccionesAccion(AccionIncidencia)
'''	Next
'''	Dim NumFicherosIncidencia As Int
'''	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
'''		If DatosFichero.IDLineaAccion=0 Then NumFicherosIncidencia=NumFicherosIncidencia+1
'''	Next
'''	DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia=NumFicherosIncidencia
'''
	'''	MostrarFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)

	Dim lstLinksFicherosActuales As List
	lstLinksFicherosActuales.Initialize
	'For Each FicheroAccionesActual As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
	For Each FicheroAccionesActual As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If FicheroAccionesActual.IDLineaAccion=DatosAccionSel.IDLineaAccion Then
			lstLinksFicherosActuales.Add(FicheroAccionesActual.LinkFichero)
		End If
	Next
	
	For Each sLinkNuevo As String In lstLinksFicherosNuevosSeleccionados
		Dim NuevoLink As Boolean=True
		For Each sLinkActual In lstLinksFicherosActuales
			If sLinkActual=sLinkNuevo Then
				NuevoLink=False
			End If
		Next
		If NuevoLink Then
'			Dim NuevoFichero As TipoDatosFicherosAccionIncidencia
'			NuevoFichero.IDIncidencia=DatosCabeceraIncidenciaProveedorTemp.IDIncidenciaProveedor
'			'NuevoFichero.IDLineaAccion=DatosAccionSel.IDLineaAccion
'			NuevoFichero.IDLineaAccion=0  ' 0 para los ficheros de la incidencia
'			''NuevoFichero.IDLineaFicherosAdjuntos=-1 ' será una nueva línea de Fichero adjunto, si finalmente se llega a grabar la incidencia.
'			NuevoFichero.LinkFichero=sLinkNuevo
'			'lstFicherosAccionesIncidenciaTemp.add(NuevoFicheroAccion)
			lstLinksFicherosNuevos.add(sLinkNuevo)
		End If
	Next
	
	'''	Dim lstLinksFicherosActualesAccion As List
	'''	lstLinksFicherosActualesAccion.Initialize
	'''	For Each FicheroAccionesActual As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
	'''		If FicheroAccionesActual.IDLineaAccion=DatosAccionSel.IDLineaAccion Then
	'''			lstLinksFicherosActualesAccion.Add(FicheroAccionesActual.LinkFichero)
	'''		End If
	'''	Next
	
	
	
	Dim UUIDSel As String=Utilidades.GenerarUUIDv4
	
	Dim lstComandos As List
	lstComandos.Initialize
	
	For Each sLink As String In lstLinksFicherosNuevos
		' usamos la misma tabla que los adjuntos de accion (tarea) con IDLineaAccion=0
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaFicheroAdjuntoAccionIncidenciaBatch", _
			Array(DateTime.Now, UUIDSel,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosAccionSel.IDLineaAccion,0, sLink))
		lstComandos.Add(cmd)
	Next
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar los datos en la tabla batch de ficheros adjuntos de incidencias proveedor dispositivo-usuario.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

	Wait For(GrabarNuevosLinksFicherosAdjuntos(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor,DatosAccionSel.IDLineaAccion,UUIDSel)) complete (mRes As Map)
	Dim Accion As String=mRes.get("Accion")
	If Accion<>"OK" Then Return
	
	lstFicherosAdjuntosIncidencia.Initialize
	jamLoadingIndicator1.MensajeLoading="Cargando Ficheros Adjuntos Incidencia..."
	jamLoadingIndicator1.Show
	Wait For(CargaDatosFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mDataFichero As Map In lstReg
		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicheroAdjuntoIncidencia
		FicheroAdjuntoAccionIncidencia.Initialize
		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
		lstFicherosAdjuntosIncidencia.Add(FicheroAdjuntoAccionIncidencia)
		'AddItemCLVAccionesAccion(AccionIncidencia)
	Next
	Dim NumFicherosAccionIncidencia As Int
	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFichero.IDLineaAccion=DatosAccionSel.IDLineaAccion Then NumFicherosAccionIncidencia=NumFicherosAccionIncidencia+1
	Next
	DatosAccionSel.NumeroFicherosAdjuntosAccion=NumFicherosAccionIncidencia

	MostrarFicherosAdjuntosFaseIncidencia(DatosAccionSel)
	
End Sub





Private Sub btnOKFicherosAdjuntosFaseIncidencia_Click
	
	Dim DataAccionSel As TipoDatosAccionIncidencia=btnOKFicherosAdjuntosFaseIncidencia.Tag
	Dim IDLineaAccionSel As Int=DataAccionSel.IDLineaAccion
	
	Dim NumFicherosAccionTemp As Int
	'For Each Fich As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
'	For Each Fich As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidencia
	For Each Fich As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If Fich.IDLineaAccion=IDLineaAccionSel Then
			NumFicherosAccionTemp=NumFicherosAccionTemp+1
		End If
	Next
	

	For iDx=0 To clvAccionesIncidencia.Size-1
		If clvAccionesIncidencia.GetValue(iDx) Is TipoDatosAccionIncidencia Then
			Dim DatosAccionItemCLVAcciones As TipoDatosAccionIncidencia=clvAccionesIncidencia.GetValue(iDx)
			Dim IDLineaItemCLVAcciones As Int=DatosAccionItemCLVAcciones.IDLineaAccion
			If IDLineaItemCLVAcciones=DataAccionSel.IDLineaAccion Then
				DatosAccionItemCLVAcciones.NumeroFicherosAdjuntosAccion=NumFicherosAccionTemp
			End If
		End If
	Next
	
	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.RemoveAllViews
	BackgroundSeleccionFicherosAdjuntosFaseIncidencia.RemoveViewFromParent

	'wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedorTemp, lstAccionesIncidenciaProveedorTemp)) complete (rObj As Object)
	wait for(MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor, lstAccionesIncidenciaProveedor)) complete (rObj As Object)
	

End Sub

Private Sub CheckBoxCCDepartamentoAsignadoFase_CheckedChange(Checked As Boolean)
	If Checked Then CheckBoxParaDepartamentoAsignadoFase.Checked=False
End Sub

Private Sub lblAyudaDepartamentoAsignadoFase_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Cyan

	
End Sub

Private Sub lblAyudaDepartamentoAsignadoFase_MouseReleased (EventData As MouseEvent)

	Dim lbl As B4XView=Sender
	lbl.TextColor=0xFF1E90FF
	Dim msa As Object=xui.MsgboxAsync($"Es el departamento que debe continuar con la resolución de la incidencia, gestionando la fase actual."$,"Departamento Asignado Fase")
	Wait For (msa) Msgbox_Result
End Sub

Private Sub lblAyudaDepartamentoAsignadoFase_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=0xFFFFD700
End Sub

Private Sub lblAyudaDepartamentoAsignadoFase_MouseExited (EventData As MouseEvent)
	EventData.Consume
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized Then
		lbl.TextColor=0xFF1E90FF
	End If
End Sub

Private Sub btnSelDepartamentoCoordinador_Click
	
	Dim sDepartamentoCoordinadorAct As String=DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador
	
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Wait For(CargaIncidenciasProveedorDepartamentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim lstDepartamentos As List
	lstDepartamentos.Initialize
	For Each mData As Map In lstReg
		lstDepartamentos.Add(mData.GetValueAt(0))
	Next
	lstDepartamentos.Sort(True)
	Dialog.Title="Selecciona Departamento Coordinador"
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
		
	'Dim lstOpciones As List=Array As String("Compra","Servicio")
	
	B4XListDlg.Options=lstDepartamentos
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return

	txtDepartamentoCoordinador.Text=B4XListDlg.SelectedItem
	
	wait for(EditarDatosCabeceraIncidencia) complete (Success As Boolean)
	If Not(Success) Then
		txtDepartamentoCoordinador.Text=sDepartamentoCoordinadorAct
	Else
		DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador=txtDepartamentoCoordinador.Text
	End If
	
End Sub

Private Sub btnSelUsuarioEmisorNuevaIncidencia_Click
	
End Sub

Private Sub btnSelTipoOrigenNuevaIncidenciaProveedor_Click

	Dialog.Title="Selecciona Tipo Origen de la Incidencia"
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
		
	Dim lstOpciones As List=Array As String("Compra","Servicio")
	
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
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim TipoOrigenIncidencia As String=B4XListDlg.SelectedItem
	txtTipoOrigenNuevaIncidencia.Text=TipoOrigenIncidencia
	
	Select Case TipoOrigenIncidencia
		
		Case "Compra"
			ValoresInicialesNuevaIncidenciaProveedor
		Case "Servicio"
			ValoresInicialesNuevaIncidenciaAcreedor
	End Select
	txtTipoDocumentoProveedorNuevaIncidencia.Text=DatosCabeceraIncidenciaProveedorTemp.NombreTipoDocumento
	txtTipoDocumentoOrigenNuevaIncidencia.Text=DatosCabeceraIncidenciaProveedorTemp.NombreTipoDocumentoOrigen
End Sub

Private Sub btnSelTipoDocumentoProveedorNuevaIncidencia_Click
	jamLoadingIndicator1.MensajeLoading="Cargando tipos de documento..."
	jamLoadingIndicator1.Show
	Wait For(CargaIncidenciasProveedorTiposDocumentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	Dialog.Title="Selecciona Tipo Documento"
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
		
	Dim lstOpciones As List
	lstOpciones.Initialize
	
	Dim rs As ResultSet=mSQL.ExecQuery2("select NombreTipoDocumento from tblIncidenciasProveedorTiposDocumentos where DocumentoTipoOrigen=?",Array As String(0))
	Do While rs.NextRow
		lstOpciones.Add(rs.GetString("NombreTipoDocumento"))
	Loop
	rs.Close
	
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
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim NombreTipoDocumentoSel As String=B4XListDlg.SelectedItem
	txtTipoDocumentoProveedorNuevaIncidencia.Text=NombreTipoDocumentoSel
	Dim IDTipoDocumentoSel As Int=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?",Array As String(NombreTipoDocumentoSel))
	Dim IDTipoDocumentoOrigenAsociadoSel As Int=mSQL.ExecQuerySingleResult2("select IDTipoDocumentoOrigenAsociado from tblIncidenciasProveedorTiposDocumentos where IDTipoDocumento=?",Array As String(IDTipoDocumentoSel))
	Dim NombreTipoDocumentoOrigenAsociadoSel As String=mSQL.ExecQuerySingleResult2("select NombreTipoDocumento from tblIncidenciasProveedorTiposDocumentos where IDTipoDocumento=?",Array As String(IDTipoDocumentoOrigenAsociadoSel))
	txtTipoDocumentoOrigenNuevaIncidencia.Text=NombreTipoDocumentoOrigenAsociadoSel
End Sub

Private Sub btnSelTipoDocumentoOrigenNuevaIncidencia_Click
	
End Sub

Private Sub btnSelProveedorNuevaIncidencia_Click
	Dialog.Title="Indica Código NAV Proveedor"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=txtProveedorNuevaIncidencia.Text
	'InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoProveedor As String=InputDlg.Text
	If NuevoProveedor="" Then Return
	
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Wait For(CargaNombreProveedor(NuevoProveedor)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	Dim mData0 As Map=mRes.Get("mData0")
	Dim NombreProveedorNAV As String=mData0.GetValueAt(0)
	txtProveedorNuevaIncidencia.Text=NuevoProveedor
	txtNombreProveedorNuevaIncidencia.Text=NombreProveedorNAV
	jamLoadingIndicator1.Close
End Sub

Private Sub btnSearchProveedorNuevaIncidencia_Click
	Dim cSelProvNAV As cSeleccionProveedorNAV
	cSelProvNAV.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
	wait for cSeleccionProveedorNAV_Done (mSelProvNAV As Map)
	Dim ProveedorSel As String=mSelProvNAV.Get("Proveedor")
	Dim NombreProveedorSel As String=mSelProvNAV.Get("NombreProveedor")
	If ProveedorSel<>"" Then
		txtProveedorNuevaIncidencia.Text=ProveedorSel
		txtNombreProveedorNuevaIncidencia.Text=NombreProveedorSel
	End If
End Sub

Private Sub btnSelFechaNuevaIncidencia_Click
	Dialog.Title="Indica Fecha Apertura Incidencia"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaNuevaIncidencia.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaNuevaIncidencia.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaNuevaIncidencia.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSelFechaDocumentoProveedorNuevaIncidencia_Click
	Dialog.Title="Indica Fecha Documento Proveedor"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaDocumentoProveedorNuevaIncidencia.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaDocumentoProveedorNuevaIncidencia.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaDocumentoProveedorNuevaIncidencia.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSelDocumentoProveedorNuevaIncidencia_Click
	If txtTipoDocumentoProveedorNuevaIncidencia.Text="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Es necesario indicar antes el tipo de documento.")) complete (rObj As Object)
		Return
	End If
	
	Dialog.Title="Indica Documento Proveedor"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=txtDocumentoProveedorNuevaIncidencia.Text
	'InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoDocumentoProveedor As String=InputDlg.Text
	txtDocumentoProveedorNuevaIncidencia.Text=NuevoDocumentoProveedor
End Sub

Private Sub btnSelDocumentoOrigenNuevaIncidencia_Click
		
	Dialog.Title="Indica Documento Origen"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=txtDocumentoOrigenProveedorNuevaIncidencia.Text
	'InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoDocumentoOrigen As String=Utilidades.FixNull(InputDlg.Text)
	
	If NuevoDocumentoOrigen="" Then Return
	
	If txtTipoDocumentoOrigenNuevaIncidencia.Text="Pedido Compra" Then
		If NuevoDocumentoOrigen.StartsWith("PC")=False Then 
			Dim msa As Object=xui.MsgboxAsync("El documento origen para tipo documento origen=Pedido Compra debe empezar por PC","Aviso")
			Wait For (msa) Msgbox_Result
			Return		
		End If
		jamLoadingIndicator1.MensajeLoading="Cargando info pedido compra..."
		jamLoadingIndicator1.Show
		Wait For(CargaDatosPedidoCompra(NuevoDocumentoOrigen)) complete (mRes As Map)
		Dim Accion As String=mRes.Get("Accion")
		If Accion="NOK" Then
			jamLoadingIndicator1.Close
			Return
		End If
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mDataPC As Map=lstReg.Get(0)
		Dim ProveedorPC As String=mDataPC.Get("PO")
		Dim NombreProveedorPC As String=mDataPC.Get("NPO")
		If Utilidades.FixNull(txtProveedorNuevaIncidencia.Text)<>"" And Utilidades.FixNull(txtProveedorNuevaIncidencia.Text)<>ProveedorPC Then
			jamLoadingIndicator1.close
			Dim msa As Object=xui.MsgboxAsync($"El proveedor del pedido de compra (${ProveedorPC}) NO coincide con el proveedor indicado para la incidencia (${txtProveedorNuevaIncidencia.Text}).
Revisar datos"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Return
		End If
		If txtProveedorNuevaIncidencia.Text="" Then
			txtProveedorNuevaIncidencia.Text=ProveedorPC
			txtNombreProveedorNuevaIncidencia.Text=NombreProveedorPC
		End If
		jamLoadingIndicator1.Close
	End If
	txtDocumentoOrigenProveedorNuevaIncidencia.Text=NuevoDocumentoOrigen.ToUpperCase
End Sub

Private Sub btnInsertarDescripcionAccionInicialTextoPredefinidoNuevaIncidencia_Click
	If TextAreaDescripcionAccionInicialNuevaIncidencia.Text.Trim<>"" Then
		Dim msg As String=$"La acción ya tiene un texto definido. Si se selecciona un texto mediante este botón, se añadirá el texto seleccionado al final del texto existente.
Continuar?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",msg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Wait For(CargaAccionesPredefinidasIncidenciasProveedor) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	If lstReg.Size=0 Then Return
	
	Dim lstOpciones As List
	lstOpciones.Initialize
	For Each mT As Map In lstReg
		lstOpciones.Add(mT.Get("TextoAccionPredefinida"))
	Next
	
	Dialog.Title="Selecciona Texto Accion predefefinido"
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
	
	B4XListDlg.Resize(600dip, 500dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim TextoDescripcionAccionAdicional As String=B4XListDlg.SelectedItem
	TextAreaDescripcionAccionInicialNuevaIncidencia.Text=TextAreaDescripcionAccionInicialNuevaIncidencia.Text & CRLF & TextoDescripcionAccionAdicional
		
End Sub

Private Sub btnGrabarNuevaIncidenciaProveedor_Click

	Wait For(CargaIncidenciasProveedorTiposDocumentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		Return
	End If
	
	Dim DatosCabeceraNuevaIncidencia As TipoDatosCabeceraIncidenciaProveedor
	DatosCabeceraNuevaIncidencia.Initialize
	DatosCabeceraNuevaIncidencia.IDIncidenciaProveedor = 0
	DatosCabeceraNuevaIncidencia.IncidenciaProveedor = ""
	DatosCabeceraNuevaIncidencia.EstadoIncidencia =0  ' 0= "ABIERTA"
	DatosCabeceraNuevaIncidencia.MigracionAccess = False
	DatosCabeceraNuevaIncidencia.TipoOrigenIncidenciaProveedor = txtTipoOrigenNuevaIncidencia.Text
	DatosCabeceraNuevaIncidencia.IDUsuarioEmisor = 0
	DatosCabeceraNuevaIncidencia.NombreUsuarioEmisor = Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
	DatosCabeceraNuevaIncidencia.IDUsuarioCompras = 0
	DatosCabeceraNuevaIncidencia.NombreUsuarioCompras = ""
	DatosCabeceraNuevaIncidencia.DepartamentoCoordinador = txtDepartamentoCoordinadorNuevaIncidencia.Text
	DatosCabeceraNuevaIncidencia.FechaIncidenciaLong = DateTime.now
	DatosCabeceraNuevaIncidencia.Proveedor = Utilidades.FixNull(txtProveedorNuevaIncidencia.Text)
	If DatosCabeceraNuevaIncidencia.Proveedor="" Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar código de proveedor","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	DatosCabeceraNuevaIncidencia.NombreProveedor = Utilidades.FixNull(txtNombreProveedorNuevaIncidencia.Text)
	DatosCabeceraNuevaIncidencia.OrigenIncidencia = ""
	DatosCabeceraNuevaIncidencia.IDTipoDocumento = Utilidades.FixNullint(mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?", _
		Array As String(txtTipoDocumentoProveedorNuevaIncidencia.Text)))
	DatosCabeceraNuevaIncidencia.NombreTipoDocumento = txtTipoDocumentoProveedorNuevaIncidencia.Text
	DatosCabeceraNuevaIncidencia.DocumentoProveedor = txtDocumentoProveedorNuevaIncidencia.Text
	If DatosCabeceraNuevaIncidencia.DocumentoProveedor="" Then
		jamLoadingIndicator1.Close
		Dim msa As Object = xui.Msgbox2Async($"No se ha indicado documento de proveedor.
¿Continuar sin este dato?"$,"Aviso", "Sí","Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		jamLoadingIndicator1.Show
	End If
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	DatosCabeceraNuevaIncidencia.FechaDocumentoProveedorLong = IIf(txtFechaDocumentoProveedorNuevaIncidencia.Text="",0,DateTime.DateParse(txtFechaDocumentoProveedorNuevaIncidencia.Text))
	DateTime.DateFormat=DateFormatAnt
	DatosCabeceraNuevaIncidencia.IDTipoDocumentoOrigen =Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?", _
		Array As String(txtTipoDocumentoOrigenNuevaIncidencia.Text)))
	DatosCabeceraNuevaIncidencia.NombreTipoDocumentoOrigen = Utilidades.FixNull(txtTipoDocumentoOrigenNuevaIncidencia.Text)
	DatosCabeceraNuevaIncidencia.DocumentoOrigen = Utilidades.FixNull(txtDocumentoOrigenProveedorNuevaIncidencia.Text)
	If DatosCabeceraNuevaIncidencia.DocumentoOrigen="" Then
		jamLoadingIndicator1.close
		Dim msa As Object = xui.Msgbox2Async($"No se ha indicado documento origen.
¿Continuar sin este dato?"$,"Aviso", "Sí","Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		jamLoadingIndicator1.Show
	End If
	DatosCabeceraNuevaIncidencia.DescripcionIncidencia = Utilidades.FixNull(TextAreaDescripcionNuevaIncidencia.Text)
	If DatosCabeceraNuevaIncidencia.DescripcionIncidencia="" Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar descripción de la incidencia","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	DatosCabeceraNuevaIncidencia.IDTipoIncidencia = 0
	DatosCabeceraNuevaIncidencia.NombreTipoIncidencia = ""
	DatosCabeceraNuevaIncidencia.AccionCompras = ""
	DatosCabeceraNuevaIncidencia.FechaAccionComprasLong = 0
	DatosCabeceraNuevaIncidencia.IDUsuarioAccionCompras = 0
	DatosCabeceraNuevaIncidencia.NombreUsuarioAccionCompras = ""
	DatosCabeceraNuevaIncidencia.FechaCierreLong = 0
	DatosCabeceraNuevaIncidencia.IDUsuarioCierre = 0
	DatosCabeceraNuevaIncidencia.NombreUsuarioCierre = ""
	DatosCabeceraNuevaIncidencia.GravedadIncidencia = "LEVE"
	DatosCabeceraNuevaIncidencia.NumeroFicherosAdjuntosIncidencia = 0
	
	Dim DatosAccionInicialNuevaIncidencia As TipoDatosAccionIncidencia
	DatosAccionInicialNuevaIncidencia.Initialize
	DatosAccionInicialNuevaIncidencia.IDLineaAccion = 0
	DatosAccionInicialNuevaIncidencia.IDLineaAccionTemp = 0
	DatosAccionInicialNuevaIncidencia.IDLineaCorrelativo = 0
	DatosAccionInicialNuevaIncidencia.IDIncidencia = 0
	DatosAccionInicialNuevaIncidencia.TipoCambio = ""
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	DatosAccionInicialNuevaIncidencia.FechaLineaAccionLong =DateTime.DateParse(txtFechaAccionInicialNuevaIncidencia.Text)
	DateTime.DateFormat=DateFormatAnt
	DatosAccionInicialNuevaIncidencia.UsuarioCreacionLineaAccion = Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
	DatosAccionInicialNuevaIncidencia.NumeroFicherosAdjuntosAccion = 0
	DatosAccionInicialNuevaIncidencia.AccionCierraIncidencia = False
	DatosAccionInicialNuevaIncidencia.DescripcionAccion = Utilidades.FixNull(TextAreaDescripcionAccionInicialNuevaIncidencia.Text)
	If DatosAccionInicialNuevaIncidencia.DescripcionAccion="" Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar descripción de la tarea inicial de la incidencia","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	DatosAccionInicialNuevaIncidencia.DepartamentoAsignadoAccion = txtDepartamentoAsignadoAccionInicialNuevaIncidencia.Text
	If DatosAccionInicialNuevaIncidencia.DepartamentoAsignadoAccion="" Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync($"Es obligatorio indicar departamento asignado a la acción inicial de la incidencia.
Es posible editar este departamento posteriormente."$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	DatosAccionInicialNuevaIncidencia.DependenciasPendientesAccion = 0
	DatosAccionInicialNuevaIncidencia.FechaCierreAccion = 0
	DatosAccionInicialNuevaIncidencia.UsuarioCierreAccion = "
	DatosAccionInicialNuevaIncidencia.ComentariosCierreAccion = ""
	
	Wait For(GrabarNuevaIncidenciaProveedor(DatosCabeceraNuevaIncidencia, DatosAccionInicialNuevaIncidencia)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	jamLoadingIndicator1.Close
	If Accion="NOK" Then Return
	Dim mData As Map=mRes.Get("mData")
	Dim IDNuevaInc As Int=mData.Get("IDNuevaIncidencia")
	Dim NuevaInc As String=mData.Get("NuevaIncidencia")
	
	Dim CarpetaIncidencia As String=$"//servidor/publico/IncidenciasProveedor/${NuevaInc} "$
	If File.Exists(CarpetaIncidencia,"")=False Then
		File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,NuevaInc)
		File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,$"${NuevaInc}"$)
		File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,$"${NuevaInc}/Adjuntos"$)
		File.MakeDir($"//servidor/publico/IncidenciasProveedor/"$,$"${NuevaInc}/Emails"$)
	End If

	BackgroundNuevancidencia.RemoveAllViews
	BackgroundNuevancidencia.RemoveViewFromParent
	
	jamLoadingIndicator1.MensajeLoading="Enviando email nueva incidencia..."
	jamLoadingIndicator1.Show
	
	Dim CuerpoMensaje As String
		
	Wait For(EnvioAutomaticoEmailNuevaTareaIncidencia(Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase, DatosAccionInicialNuevaIncidencia.DepartamentoAsignadoAccion, _
		NuevaInc, CuerpoMensaje)) complete (sResp As String)
	jamLoadingIndicator1.Close
	Dim msgAviso As String
	If sResp.StartsWith("ERROR") Then
		msgAviso=$"No ha sido posible enviar automáticamente el email de creación de nueva tarea al departamento asignado.
			ERROR: ${sResp}.
			Enviar manualmente el email desde el menú de tarea."$
	Else
		msgAviso=$"Se ha enviado automáticamente el email de creación de nueva tarea al departamento asignado."$
	End If
	Dim msa As Object=xui.MsgboxAsync(msgAviso,"Aviso")
	Wait For (msa) Msgbox_Result
	
	CambioAModoVer(IDNuevaInc,NuevaInc)
End Sub


Sub GrabarNuevaIncidenciaProveedor(DatosCabNuevaInc As TipoDatosCabeceraIncidenciaProveedor, DatosAccInNuevaInc As TipoDatosAccionIncidencia) As ResumableSub
'	PROCEDURE `IncidenciasProveedorNuevaIncidenciaAccionInicial`(TipoOrigenInc varchar(20), Usu varchar(100),DepartamentoCoord varchar(100),
'	FechInc long, Prov varchar(20), NombreProv varchar(255), IDTipoDoc int,  DocProv varchar(255), FechaDocProv long,
'	IDTipoDocOrigen int, DocOrigen varchar(100), DescInc text, FechaAccIn long,  UsuAcc varchar(100), DescrAcc text, DepartamentoAcc varchar(100))

	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorNuevaIncidenciaAccionInicial"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(DatosCabNuevaInc.TipoOrigenIncidenciaProveedor, DatosCabNuevaInc.NombreUsuarioEmisor, _
		DatosCabNuevaInc.DepartamentoCoordinador, DatosCabNuevaInc.FechaIncidenciaLong, DatosCabNuevaInc.Proveedor, DatosCabNuevaInc.NombreProveedor, _
		DatosCabNuevaInc.IDTipoDocumento, DatosCabNuevaInc.DocumentoProveedor, DatosCabNuevaInc.FechaDocumentoProveedorLong, DatosCabNuevaInc.IDTipoDocumentoOrigen, _
		DatosCabNuevaInc.DocumentoOrigen, DatosCabNuevaInc.DescripcionIncidencia, DatosAccInNuevaInc.FechaLineaAccionLong, DatosAccInNuevaInc.UsuarioCreacionLineaAccion, _
		DatosAccInNuevaInc.DescripcionAccion, DatosAccInNuevaInc.DepartamentoAsignadoAccion), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  
			'jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No existe la incidencia seleccionada (${IDIncSel})"$,"Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mRespuesta As Map=lstReg.Get(0)
			Dim sResp As String=mRespuesta.GetValueAt(0)
			If sResp.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error recuperando datos del SP " & Comando & "." & CRLF & CRLF & sResp,"Aviso")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("mData", mRespuesta)
			End If
		End If
	End If
	Return mRes
End Sub

Private Sub btnCopiarInfoLineasPedidoCompraADescripcionNuevaIncidencia_Click
	If txtTipoDocumentoOrigenNuevaIncidencia.Text<>"Pedido Compra" Then
		Dim msa As Object=xui.MsgboxAsync("La función Copiar Líneas de Pedido a Descripción sólo está disponible para Tipo Documento Origen=Pedido de compra","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Dim PedidoCompraSel As String=Utilidades.FixNull(txtDocumentoOrigenProveedorNuevaIncidencia.Text).ToUpperCase
	If PedidoCompraSel="" Then
		Dim msa As Object=xui.MsgboxAsync("No se ha indicado ningún pedido de compra","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If PedidoCompraSel.StartsWith("PC")= False Then
		Dim msa As Object=xui.MsgboxAsync("Es necesario indicar el pedido de compra en la cabecera de la incidencia.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Añadir la información de Descripción + artículo/talla de las líneas del pedido de compra ${PedidoCompraSel} a la Descripción de la incidencia?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	jamLoadingIndicator1.MensajeLoading="Cargando info pedido compra..."
	jamLoadingIndicator1.Show
	Wait For(CargaDatosPedidoCompra(PedidoCompraSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		Return
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	Dim sLineasPedido As String
	If txtDocumentoProveedorNuevaIncidencia.Text<>"" Then
		sLineasPedido=txtTipoDocumentoProveedorNuevaIncidencia.Text & ": " & txtDocumentoProveedorNuevaIncidencia.Text
	End If
	If txtDocumentoOrigenProveedorNuevaIncidencia.Text<>"" Then
		If sLineasPedido<>"" Then sLineasPedido=sLineasPedido & "   "
		sLineasPedido=sLineasPedido & txtTipoDocumentoOrigenNuevaIncidencia.Text & ": " & txtDocumentoOrigenProveedorNuevaIncidencia.Text.ToUpperCase
	End If
	If sLineasPedido<>"" Then sLineasPedido=sLineasPedido & CRLF & CRLF
	For Each mData As Map In lstReg
		Log(mData)
		Dim Variante As String=mData.get("Variante")
		If Variante="" Then
			'sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "    Cantidad Pedido: " & mData.get("Qty") & CRLF
			sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & CRLF
		Else
			'sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "   Talla: " & mData.Get("Talla") & "    Cantidad Pedido: " & mData.get("Qty") & CRLF
			sLineasPedido=sLineasPedido & " - " & mData.Get("Descripcion") & "   Talla: " & mData.Get("Variante") & CRLF
		End If
	Next
	sLineasPedido=sLineasPedido.SubString2(0,sLineasPedido.Length-1) ' eliminar el ultimo crlf
	TextAreaDescripcionNuevaIncidencia.Text=TextAreaDescripcionNuevaIncidencia.Text & CRLF & sLineasPedido
	TextAreaDescripcionNuevaIncidencia.Text=TextAreaDescripcionNuevaIncidencia.Text.Trim
	jamLoadingIndicator1.Close
End Sub

Private Sub btnCancelarNuevaIncidenciaProveedor_Click
	Dim msa As Object = xui.Msgbox2Async("¿Cancelar la creación de la nueva incidencia?","Confirma", "Sí","", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	BackgroundNuevancidencia.RemoveAllViews
	BackgroundNuevancidencia.RemoveViewFromParent

	Dim IDIncSel As Int
	Dim IncSel As String
	Select True
		
		Case DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior=0  ' nuevo desde lista
			Wait For(BorrarTablasBatchDispositivoUsuario) complete (Success As Boolean)

			SalirModulo
			Return
			
		Case DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior>0 ' nuevo desde otra Ficha
'			DatosCabeceraIncidenciaProveedor.Initialize
'			DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=IDIncidenciaProveedorAnterior
'			IDIncidenciaProveedorAnterior=0
'			IncidenciaProveedorAnterior=""
			IDIncSel=IDIncidenciaProveedorAnterior
			IncSel=IncidenciaProveedorAnterior
			
		Case Else ' estaremos editando una ficha. mantenenemos DatosCabeceraIncidendiaProveedor
			IDIncSel=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
			IncSel=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
			
	End Select
	
	''	If DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior=0 Then  ' nuevo desde lista
	''		SalirModulo
	''		Return
	''	End If
	'''	If DatosCabeceraIncidenciaProveedor.IncidenciaProveedor=Null Or DatosCabeceraIncidenciaProveedor.IncidenciaProveedor="" Then
	'''		SalirModulo
	'''		Return
	'''	End If
	''	If DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=0 And IDIncidenciaProveedorAnterior>0 Then ' nuevo desde otra Ficha
	''		DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor=IDIncidenciaProveedorAnterior
	''		IDIncidenciaProveedorAnterior=0
	''	End If



	'ModoVer(IDIncSel,IncSel)
'	ModoVer
'	jamLoadingIndicator1.MensajeLoading=$"Cargando datos incidencia ${IncSel}..."$
'	jamLoadingIndicator1.Show
'	Wait For(CargaDatosIncidencia(IDIncSel, IncSel)) complete (success As Boolean)
'	If success=False Then
'		jamLoadingIndicator1.Close
'		SalirModulo
'		Return
'	End If
'	MostrarDatosIncidencia(DatosCabeceraIncidenciaProveedor,lstAccionesIncidencia)
'	jamLoadingIndicator1.Close

	CambioAModoVer(IDIncSel,IncSel)
End Sub

Private Sub btnSelDepartamentoCoordinadorNuevaIncidencia_Click
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Wait For(CargaIncidenciasProveedorDepartamentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim lstDepartamentos As List
	lstDepartamentos.Initialize
	For Each mData As Map In lstReg	
		lstDepartamentos.Add(mData.GetValueAt(0))
	Next
	lstDepartamentos.Sort(True)
	Dialog.Title="Selecciona Departamento Coordinador"
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
		
	'Dim lstOpciones As List=Array As String("Compra","Servicio")
	
	B4XListDlg.Options=lstDepartamentos
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return

	txtDepartamentoCoordinadorNuevaIncidencia.Text=B4XListDlg.SelectedItem
End Sub

Private Sub lblIconFicherosAdjuntosIncidencia_MouseClicked (EventData As MouseEvent)
	Dim lbl As B4XView=Sender

	lbl.TextColor=xui.Color_Black
	lbl.Color=0xFF00FFFF

	Sleep(0)
'	
'	Dim iDxAccionSel As Int=clvAccionesIncidencia.GetItemFromView(lbl)
'	Dim DataAccionSel As TipoDatosAccionIncidencia=clvAccionesIncidencia.GetValue(iDxAccionSel)

	
'	If ModoFicha="VER" Then
'		VerFicherosAdjuntosFaseIncidencia(DataAccionSel)
'	Else
'		EditarFicherosAdjuntosFaseIncidencia(DataAccionSel)
'	End If
	
'	If ModoFicha<>"VER" Then
'		
'		'VerFicherosAdjuntosFaseIncidencia(DataAccionSel)
'		Dim msa As Object=xui.MsgboxAsync("No es posible adjuntar ficheros en Modo Edición ni en Modo Nuevo.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	Else
'		Dim DataAccionSel As TipoDatosAccionIncidencia
		EditarFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)
'	End If
	

	
	
End Sub

Private Sub lblIconFicherosAdjuntosIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	lbl.Color=xui.Color_Transparent
	
End Sub

Private Sub lblIconFicherosAdjuntosIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	lbl.Color=0xFFFFD700
End Sub

Private Sub lblIconFicherosAdjuntosIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized Then
		lbl.TextColor=xui.Color_Black
		lbl.Color=xui.Color_Transparent
	End If
End Sub



Private Sub lblMenuAccionesDescripcionIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	lbl.Color=0xFFFFD700
	
'	Dim JOlbl As JavaObject=lblAccionesSel
''	Dim JOCtxMnu As JavaObject=JOlbl.RunMethodJO("getContextMenu",Null)
''	JOCtxMnu=mContextMenuAccionesAccionIncidencia
'	
'	JOlbl.RunMethod("setContextMenu",Array(mContextMenuAccionesAccionIncidencia))
'	
'	Dim lbl As Label=lblAccionesSel
'	MostrarContextMenuLabelJO(lbl)
	
End Sub

Private Sub lblMenuAccionesDescripcionIncidencia_MouseClicked (EventData As MouseEvent)
	
	Dim xlbl As B4XView=Sender
	xlbl.TextColor=xui.Color_Black
	xlbl.Color=0xFF00FFFF

	Sleep(0)

'	If ModoFicha="VER" Then
'		wait for(Utilidades.MsgBox2XUI("Confirma","La ficha está en Modo=VER" & CRLF & "¿Cambiar a modo Editar?","Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'		wait for(CambioAModoEditar) complete (Success As Boolean)
'		If Not(Success) Then
'			SalirModulo
'			Return
'		End If
'	End If
	Dim lbl As Label=xlbl
	Dim JOlbl As JavaObject=lbl
'	Dim JOCtxMnu As JavaObject=JOlbl.RunMethodJO("getContextMenu",Null)
'	JOCtxMnu=mContextMenuAccionesAccionIncidencia
	
	JOlbl.RunMethod("setContextMenu",Array(mContextMenuDescripcionIncidencia))

	MostrarContextMenuLabelJODescripcionIncidencia(lbl)
	
End Sub
 

Private Sub lblMenuAccionesDescripcionIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_White
	'lblAccionesSel.Color=xui.Color_Black
	lbl.Color=0xFFB22222

End Sub

private Sub lblMenuAccionesDescripcionIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_White
	'lblAccionesSel.Color=xui.Color_Black
	lbl.Color=0xFFB22222
End Sub


'Private Sub lblDependenciasPendientesAccionLinea_MouseClicked (EventData As MouseEvent)
'	Dim lbl As B4XView=Sender
'	
'End Sub

Private Sub lblDependenciasPendientesAccionLinea_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	lbl.Color=0xFF00FFFF
End Sub

Private Sub lblDependenciasPendientesAccionLinea_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	lbl.Color=xui.Color_Transparent
	EventData.Consume
	Dim msa As Object=xui.MsgboxAsync("Pendiente de programar","Aviso")
	Wait For (msa) Msgbox_Result
End Sub

Private Sub lblDependenciasPendientesAccionLinea_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.TextColor=xui.Color_Black
	lbl.Color=0xFFFFD700
End Sub

Private Sub lblDependenciasPendientesAccionLinea_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized=False Then Return
	lbl.TextColor=xui.Color_Black
	lbl.Color=xui.Color_Transparent
End Sub

private Sub ContextMenuDescripcionIncidencia_Action
	Dim mI As MenuItem=Sender
	Log("Tag MenuItem: " & mI.Tag)
	Dim JOmI As JavaObject=mI
	Dim JOCtxMenu As JavaObject=JOmI.RunMethodJO("getParentPopup",Null)
	Dim lblMenu As Label=JOCtxMenu.RunMethodJO("getUserData",Null)

	Select Case mI.Tag
		Case "EditarDescripcion"
			EditarDescripcionIncidencia
			
		Case "CopiarInfoLineasPedidoCompraADescripcionFaseIncidencia"
			Dim msa As Object=xui.MsgboxAsync("Pendiente de programar","Aviso")
			Wait For (msa) Msgbox_Result
			Return
			
			CopiarInfoLineasPedidoCompraADescripcionFaseIncidencia
		

			
	End Select
	
End Sub

Sub EditarDescripcionIncidencia
	Dim DialogTitleBarHeightAnt As Int=Dialog.TitleBarHeight
	Dialog.TitleBarHeight=60dip
	Dialog.Title=$"Indica Descripción detallada de la incidencia."$
	
	Dim pBaseTextArea As B4XView = xui.CreatePanel("")
	pBaseTextArea.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)
	pBaseTextArea.LoadLayout("scrDialogTextArea")
	'TextAreaDialog.Text=TextAreaDescripcionIncidencia.Text
	TextAreaDialog.Text=BBCodeViewDescripcionIncidencia.Text
	TextAreaDialog.As(JavaObject).RunMethod("setFont",Array(xui.CreateDefaultFont(12).ToNativeFont))
	
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseTextArea, "OK", "", "Cancelar")
	TextAreaDialog.RequestFocus
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	
	bCancel.Left=bCancel.Left-25dip
	bCancel.Width=bCancel.Width+25dip
	bCancel.TextSize=15
	
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	bOK.Left=5dip
	
	Wait For (rSub) Complete (rInt As Int)
	Dialog.TitleBarHeight=DialogTitleBarHeightAnt
	If rInt <> xui.DialogResponse_Positive Then Return
	jamLoadingIndicator1.MensajeLoading="Actualizando descripción incidencia..."
	jamLoadingIndicator1.Show
'	TextAreaDescripcionIncidencia.Text=TextAreaDialog.Text
	Dim NuevaDescripcionIncidencia As String=TextAreaDialog.Text.Trim
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorActualizarDescripcionIncidencia", _
			Array(NuevaDescripcionIncidencia, DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	jamLoadingIndicator1.close
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar la descripción de la incidencia.","Error")
		Wait For (msa) Msgbox_Result
	Else
		BBCodeViewDescripcionIncidencia.Text=NuevaDescripcionIncidencia
		DatosCabeceraIncidenciaProveedor.DescripcionIncidencia=NuevaDescripcionIncidencia
	End If
	
End Sub

Private Sub btnSelFechaAccionIncidenciaNuevaIncidencia_Click
	Dialog.Title="Indica Fecha Acción"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaAccionInicialNuevaIncidencia.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaAccionInicialNuevaIncidencia.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaAccionInicialNuevaIncidencia.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub lblEmailIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblEmailIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
	Dim DataAccionSel As TipoDatosAccionIncidencia
	DataAccionSel.Initialize
	MostrarSeleccionarDatosEmailIncidencia(DataAccionSel)
End Sub

Private Sub lblEmailIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblEmailIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
End Sub

Private Sub lblCerrarIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblCerrarIncidencia_MouseReleased (EventData As MouseEvent)
	EventData.Consume
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)

	If DatosCabeceraIncidenciaProveedor.EstadoIncidencia=1 Then   '1=cerrada
		Dim msa As Object = xui.Msgbox2Async("La incidencia ya está cerrada. ¿Editar los datos de cierre de la incidencia?","Confirma", "Sí","Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Dim NumeroTareasAbiertasIncidencia As Int
	For Each Tarea As TipoDatosAccionIncidencia In lstAccionesIncidenciaProveedor
		Dim IDLineaAccionTempFase As Int=Tarea.IDLineaAccionTemp
		If Tarea.EstadoAccion=0 Then
			NumeroTareasAbiertasIncidencia=NumeroTareasAbiertasIncidencia+1
		End If
	Next
	If NumeroTareasAbiertasIncidencia>0 Then
		Dim msgCerrar As String=$"Hay ${NumeroTareasAbiertasIncidencia} tareas abiertas.
¿Continuar con el cierre de la incidencia?"$
		Dim msa As Object = xui.Msgbox2Async(msgCerrar,"Confirma", "Sí","Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt=xui.DialogResponse_Cancel Then Return
	End If
	
	MostrarPanelCerrarIncidencia
End Sub

Private Sub lblCerrarIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblCerrarIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	If lbl.IsInitialized=False Then Return
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
End Sub

Private Sub lblAnularIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblAnularIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
	AnularIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)

End Sub

Private Sub lblAnularIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblAnularIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized=False Then Return
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
End Sub


Private Sub lblImprimirIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblImprimirIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
	ImprimirIncidencia
End Sub

Private Sub lblImprimirIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblImprimirncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized=False Then Return
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
End Sub

Private Sub lblSalirIncidenciaProveedorFicha_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblSalirIncidenciaProveedorFicha_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
	
	Wait For(BorrarTablasBatchDispositivoUsuario) complete (Success As Boolean)
	SalirModulo
End Sub

Private Sub lblSalirIncidenciaProveedorFicha_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblSalirIncidenciaProveedorFicha_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
End Sub

Private Sub lblNuevaIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblNuevaIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
	
	IDIncidenciaProveedorAnterior=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
	IncidenciaProveedorAnterior=DatosCabeceraIncidenciaProveedor.IncidenciaProveedor
	DatosCabeceraIncidenciaProveedor.Initialize
	lstAccionesIncidenciaProveedor.Initialize
	lstFicherosAdjuntosIncidencia.Initialize
'	lstFicherosAccionesIncidencia.Initialize
'			ModoNuevo
'			MostrarDatosNuevaIncidencia
'			ValoresInicialesNuevaIncidenciaProveedor
	CambioAModoNuevo
End Sub

Private Sub lblNuevaIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblNuevaIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	'lbl.SetColorAndBorder(xui.Color_White,1dip,0xFF696969,5)
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
End Sub

Private Sub btnSelDepartamentoAsignadoAccionInicialNuevaIncidencia_Click
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Wait For(CargaIncidenciasProveedorDepartamentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim lstDepartamentos As List
	lstDepartamentos.Initialize
	For Each mData As Map In lstReg
		lstDepartamentos.Add(mData.GetValueAt(0))
	Next
	lstDepartamentos.Sort(True)
	Dialog.Title="Selecciona Departamento Coordinador"
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
		
	'Dim lstOpciones As List=Array As String("Compra","Servicio")
	
	B4XListDlg.Options=lstDepartamentos
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return

	txtDepartamentoAsignadoAccionInicialNuevaIncidencia.Text=B4XListDlg.SelectedItem
End Sub

Private Sub btnSelGrabarCierreIncidenciaTipoIncidencia_Click
	jamLoadingIndicator1.MensajeLoading="Cargando tipos incidencias proveedor..."
	jamLoadingIndicator1.Show
	Wait For(CargaTiposIncidenciasProveedor) complete (mRes As Map)
	
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim B4XSetTiposIncidencias As B4XSet
	B4XSetTiposIncidencias.Initialize
	'Dim lstNombresTiposIncidencia As List
	For Each mData As Map In lstReg
		Log(mData)
		If 7<>mData.Get("IDTipoIncidencia") Then
			B4XSetTiposIncidencias.Add(mData.Get("NombreTipoIncidencia"))
		End If
	Next
	
	Dialog.Title="Selecciona Tipo Incidencia Proveedor"
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
	
		
	Dim lstOpciones As List=B4XSetTiposIncidencias.AsList
	
	B4XListDlg.Options=lstOpciones
	
	B4XListDlg.Resize(500dip, 400dip)
'	B4XListDlg.CustomListView1.AsView.width=500dip
'	B4XListDlg.CustomListView1.AsView.Height=400dip
	
	
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
	jamLoadingIndicator1.Close
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim OpcionSel As String= B4XListDlg.SelectedItem
	txtGrabarCierreIncidenciaTipoIncidencia.Text=OpcionSel
End Sub

Private Sub btnSelGrabarCierreIncidenciaGravedadIncidencia_Click
	Dialog.Title="Selecciona Gravedad de la incidencia"
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
	
		
	Dim lstOpciones As List=Array("LEVE","GRAVE")
	
	B4XListDlg.Options=lstOpciones
	
'	B4XListDlg.Resize(500dip, 400dip)
'	B4XListDlg.CustomListView1.AsView.width=500dip
'	B4XListDlg.CustomListView1.AsView.Height=400dip
	
	
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
	jamLoadingIndicator1.Close
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim OpcionSel As String= B4XListDlg.SelectedItem
	txtGrabarCierreIncidenciaGravedadIncidencia.Text=OpcionSel
End Sub

Private Sub btnSelGrabarCierreIncidenciaFechaCierreIncidencia_Click
	Dialog.Title="Indica Fecha Cierre Incidencia"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtGrabarCierreIncidenciaFechaCierreIncidencia.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtGrabarCierreIncidenciaFechaCierreIncidencia.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtGrabarCierreIncidenciaFechaCierreIncidencia.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnGrabarCierreIncidenciaGrabar_Click
	If txtGrabarCierreIncidenciaTipoIncidencia.Text="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar el tipo de incidencia.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If txtGrabarCierreIncidenciaFechaCierreIncidencia.Text="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar la fecha de cierre de incidencia.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If txtGrabarCierreIncidenciaGravedadIncidencia.Text="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar la gravedad de la incidencia.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	If txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar el responsable causa de la incidencia.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	If Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase<>DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre.ToUpperCase And DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre.ToUpperCase<>"" Then
		Dim msa As Object = xui.Msgbox2Async($"El usuario que cerró la incidencia (${DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre}) es distinto al usuario actual (${Main.DatosUsuario.NombreUsuarioWindows}).
Confirma con qué usuario hay que registrar el cierre de la incidencia."$, _
			"Confirma", "Usuario actual","Cancelar", "Usuario Cierre", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		Select Case rInt
			Case xui.DialogResponse_Cancel
				Return
			Case xui.DialogResponse_Positive
				Dim NuevoUsuarioCierreIncidencia As String=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
			Case xui.DialogResponse_Negative
				Dim NuevoUsuarioCierreIncidencia As String=txtGrabarCierreIncidenciaUsuarioCierreIncidencia.Text
		End Select
	Else
		NuevoUsuarioCierreIncidencia=Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase
	End If
	
	jamLoadingIndicator1.MensajeLoading="Registrando cierre incidencia..."
	jamLoadingIndicator1.Show
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim NuevaFechaCierreincidencia As Long=DateTime.DateParse(txtGrabarCierreIncidenciaFechaCierreIncidencia.Text)
	DateTime.DateFormat=DateFormatAnt
	Dim NuevoTipoIncidencia As String=txtGrabarCierreIncidenciaTipoIncidencia.Text
	
	
	Wait For(CargaTiposIncidenciasProveedor) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.close
		 Return
	End If
	
	Dim NuevoIDTipoIncidencia As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select IDTipoIncidencia from tblIncidenciasProveedorTiposIncidencias where NombreTipoIncidencia=?", _
		Array(NuevoTipoIncidencia)))
	If NuevoIDTipoIncidencia=0 Then 
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync($"No existe un IDTipoIncidencia asociado al tipo de incidencia seleccionado (${NuevoTipoIncidencia})."$,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim NuevaGravedadIncidencia As String=txtGrabarCierreIncidenciaGravedadIncidencia.Text
	
	Dim NuevaResponsabilidadInterna As Int=IIf(NuevoIDTipoIncidencia=7,1,0)
	
	Dim NuevoResponsableCausaIncidencia As String=txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text

	' EstadoIncidencia=1 --> cerrada
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorCerrarIncidencia", _
			Array(1, NuevoIDTipoIncidencia,NuevaFechaCierreincidencia,NuevoUsuarioCierreIncidencia, NuevaGravedadIncidencia, NuevaResponsabilidadInterna, NuevoResponsableCausaIncidencia, _
				DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el cierre de la incidencia.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	BackgroundCerrarIncidencia.RemoveAllViews
	BackgroundCerrarIncidencia.RemoveViewFromParent
	CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
End Sub

Private Sub btnGrabarCierreIncidenciaCancelar_Click
	BackgroundCerrarIncidencia.RemoveAllViews
	BackgroundCerrarIncidencia.RemoveViewFromParent
End Sub


Sub MostrarPanelCerrarIncidencia
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundCerrarIncidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundCerrarIncidencia= xui.CreatePanel("BackgroundCerrarIncidencia")
	BackgroundCerrarIncidencia.Tag = "BackgroundCerrarIncidencia"
	BackgroundCerrarIncidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundCerrarIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseCerrarIncidencia=xui.CreatePanel("pnlBaseCerrarIncidencia")
	BaseCerrarIncidencia.SetLayoutAnimated(0,0,0,600dip, 400dip)
	BaseCerrarIncidencia.LoadLayout("scrIncidenciasProveedorGrabarCierreIncidencia")

	
	BackgroundCerrarIncidencia.AddView(BaseCerrarIncidencia,(BackgroundCerrarIncidencia.Width/2-BaseCerrarIncidencia.Width/2), _
		(BackgroundCerrarIncidencia.Height/2-BaseCerrarIncidencia.Height/2), BaseCerrarIncidencia.Width, BaseCerrarIncidencia.Height)
		
	txtGrabarCierreIncidenciaTipoIncidencia.Text=DatosCabeceraIncidenciaProveedor.NombreTipoIncidencia
	txtGrabarCierreIncidenciaGravedadIncidencia.Text=DatosCabeceraIncidenciaProveedor.GravedadIncidencia
	txtGrabarCierreIncidenciaUsuarioCierreIncidencia.Text=IIf(DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre="",Main.DatosUsuario.NombreUsuarioWindows,DatosCabeceraIncidenciaProveedor.NombreUsuarioCierre)
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtGrabarCierreIncidenciaFechaCierreIncidencia.Text=IIf(DatosCabeceraIncidenciaProveedor.FechaCierreLong=0,DateTime.Date(DateTime.Now),DateTime.Date(DatosCabeceraIncidenciaProveedor.FechaCierreLong))
	DateTime.DateFormat=DateFormatAnt
	txtGrabarCierreIncidenciaCosteIncidencia.Text=Utilidades.FormatoNumerico2(DatosCabeceraIncidenciaProveedor.CosteIncidencia,1,2,2,True)
	txtGrabarCierreIncidenciaCosteIncidencia.SetTextAlignment("CENTER","RIGHT")
	
	CheckBoxGrabarCierreIncidenciaIncidenciaInterna.Checked=DatosCabeceraIncidenciaProveedor.ResponsabilidadInterna
	
'	If DatosCabeceraIncidenciaProveedor.ResponsabilidadInterna Then
'		txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text=""
'		txtGrabarCierreIncidenciaTipoIncidencia.Text="Responsabilidad Interna"
'		
'	Else
'		txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text="Proveedor"
'		txtGrabarCierreIncidenciaTipoIncidencia.Text=""
'	End If
	btnSelGrabarCierreIncidenciaResponsableCausaIncidencia.Visible=DatosCabeceraIncidenciaProveedor.ResponsabilidadInterna
	If DatosCabeceraIncidenciaProveedor.ResponsabilidadInterna=False And DatosCabeceraIncidenciaProveedor.ResponsableCausaIncidencia="" Then
		txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text="Proveedor"
	Else
		txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text=DatosCabeceraIncidenciaProveedor.ResponsableCausaIncidencia
	End If
	btnSelGrabarCierreIncidenciaTipoIncidencia.Visible=Not(DatosCabeceraIncidenciaProveedor.ResponsabilidadInterna)
		
End Sub

'pasar DataAccionSel inicializada y vacia para  email de la incidencia. Con datos para email de acciones
Sub MostrarSeleccionarDatosEmailIncidencia(DataAccionSel As TipoDatosAccionIncidencia)
	Wait For(CargaDatosConfiguracionCuentasEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Return
	End If
	
	Wait For(CargaDatosConfiguracionCuentaArchivadoEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim mDataArch As Map=mRes.Get("mData0")
	CuentaEmailArchivadoIncidencias=mDataArch.Get("DireccionEmail")
	NombreCuentaEmailArchivadoIncidencias=mDataArch.Get("NombreCuenta")
	
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundSeleccionDatosEmailIncidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundSeleccionDatosEmailIncidencia= xui.CreatePanel("BackgroundSeleccionDatosEmailIncidencia")
	BackgroundSeleccionDatosEmailIncidencia.Tag = "BackgroundSeleccionDatosEmailIncidencia"
	BackgroundSeleccionDatosEmailIncidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundSeleccionDatosEmailIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseSeleccionDatosEmailIncidencia=xui.CreatePanel("pnlBaseSeleccionDatosEmailIncidenciaa")
	BaseSeleccionDatosEmailIncidencia.SetLayoutAnimated(0,0,0,900dip, 700dip)
	BaseSeleccionDatosEmailIncidencia.LoadLayout("scrIncidenciasProveedorSeleccionDatosEmailIncidencia")

	BackgroundSeleccionDatosEmailIncidencia.AddView(BaseSeleccionDatosEmailIncidencia,(BackgroundSeleccionDatosEmailIncidencia.Width/2-BaseSeleccionDatosEmailIncidencia.Width/2), _
		(BackgroundSeleccionDatosEmailIncidencia.Height/2-BaseSeleccionDatosEmailIncidencia.Height/2), BaseSeleccionDatosEmailIncidencia.Width, BaseSeleccionDatosEmailIncidencia.Height)

	pnlFondoSeleccionDatosEmailIncidencia.Tag=DataAccionSel

	Log($"AlmacenIPConexion ${Main.AlmacenIPConexion}"$)
	
	If DataAccionSel.IDLineaAccion=0 Then
		lblTitleSeleccionDatosEmail.Text=$"Selección Datos Email Incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}"$
		lblTitleIncluirDescripcionBodyEmail.Text="Incluir Descripción Incidencia"
		lblTitleIncluirFicherosAdjuntosEmail.Text="Incluir Ficheros Adjuntos Incidencia"
		TextAreaDescripcionBodyEmailIncidencia.tag=DatosCabeceraIncidenciaProveedor.DescripcionIncidencia
	Else
		lblTitleSeleccionDatosEmail.Text=$"Selección Datos Email Tarea Incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}"$
		lblTitleIncluirDescripcionBodyEmail.Text="Incluir Descripción Tarea"
		lblTitleIncluirFicherosAdjuntosEmail.Text="Incluir Ficheros Adjuntos Tarea"
		TextAreaDescripcionBodyEmailIncidencia.tag=DataAccionSel.DescripcionAccion
	End If
	TextAreaDescripcionBodyEmailIncidencia.Text=TextAreaDescripcionBodyEmailIncidencia.tag
	
	
	Dim NombreCuentaDepartamentoCoordinador As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador))
	Dim DireccionEmailDepartamentoCoordinador As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DatosCabeceraIncidenciaProveedor.DepartamentoCoordinador))
	
	Dim NombreCuentaIncidenciasProveedorAlmacenProin As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROIN"))
	Dim DireccionEmailIncidenciasProveedorAlmacenProin As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROIN"))
	
	Dim NombreCuentaIncidenciasProveedorAlmacenProtec As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROTEC"))
	Dim DireccionEmailIncidenciasProveedorAlmacenProtec As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ALMACEN PROTEC"))
	
	Dim NombreCuentaFacturasProveedor As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ADMINISTRACION-PROVEEDORES"))
	Dim DireccionEmailDepartamentoCoordinador As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String("ADMINISTRACION-PROVEEDORES"))
	
	Dim NombreCuentaDepartamentoAccion As String
	Dim DireccionEmailDepartamentoAccion As String
	If DataAccionSel.IDLineaAccion>0 Then
		Dim NombreCuentaDepartamentoAccion As String=mSQL.ExecQuerySingleResult2("select NombreCuenta from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DataAccionSel.DepartamentoAsignadoAccion))
		Dim DireccionEmailDepartamentoAccion As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DataAccionSel.DepartamentoAsignadoAccion))
	End If
	
	
	RadioButtonDeIncidenciasProveedorAlmacenProin.Checked=Main.AlmacenConexion="PROIN"
	RadioButtonDeIncidenciasProveedorAlmacenProtec.Checked=Main.AlmacenConexion="PROTEC"
'	RadioButtonDeIncidenciasCompras.Checked=False
	RadioButtonDeDepartamentoCoordinador.Checked=False
	If NombreCuentaDepartamentoCoordinador<>"" Then
		RadioButtonDeDepartamentoCoordinador.Text=NombreCuentaDepartamentoCoordinador
	Else
		If DireccionEmailDepartamentoCoordinador<>"" Then
			RadioButtonDeDepartamentoCoordinador.Text=DireccionEmailDepartamentoCoordinador
		Else
			RadioButtonDeDepartamentoCoordinador.Text=""
		End If
	End If

	
	RadioButtonDeCuentaUsuario.Checked=False
	
	CheckBoxParaProveedor.As(CheckBox).Checked=False
	'CheckBoxParaIncidenciasCompras.As(CheckBox).Checked=False
	CheckBoxParaIncidenciasProveedorAlmacenProin.As(CheckBox).Checked=False
	CheckBoxParaIncidenciasProveedorAlmacenProtec.As(CheckBox).Checked=False

	CheckBoxParaDepartamentoCoordinador.Checked=True
	If NombreCuentaDepartamentoCoordinador<>"" Then
		CheckBoxParaDepartamentoCoordinador.Text=NombreCuentaDepartamentoCoordinador
	Else
		If DireccionEmailDepartamentoCoordinador<>"" Then
			CheckBoxParaDepartamentoCoordinador.Text=DireccionEmailDepartamentoCoordinador
		Else
			CheckBoxParaDepartamentoCoordinador.Text=""
		End If
	End If


	'CheckBoxCCIncidenciasCompras.As(CheckBox).Checked=True
	CheckBoxCCIncidenciasProveedorAlmacenProin.As(CheckBox).Checked=False
	CheckBoxCCIncidenciasProveedorAlmacenProtec.As(CheckBox).Checked=False
	CheckBoxCCFacturas.As(CheckBox).Checked=True
	If NombreCuentaFacturasProveedor<>"" Then
		CheckBoxCCFacturas.Text=NombreCuentaFacturasProveedor
	Else
		If DireccionEmailFacturasProveedor<>"" Then
			CheckBoxCCFacturas.Text=DireccionEmailFacturasProveedor
		Else
			CheckBoxCCFacturas.Text=""
		End If
	End If


	CheckBoxCCDepartamentoCoordinador.Visible=True
	CheckBoxCCDepartamentoCoordinador.Checked=False
	If NombreCuentaDepartamentoCoordinador<>"" Then
		CheckBoxCCDepartamentoCoordinador.Text=NombreCuentaDepartamentoCoordinador
	Else
		If DireccionEmailDepartamentoCoordinador<>"" Then
			CheckBoxCCDepartamentoCoordinador.Text=DireccionEmailDepartamentoCoordinador
		Else
			CheckBoxCCDepartamentoCoordinador.Text=""
		End If
	End If

	
	B4XSwitchIncluirDescripcionBodyEmailIncidencia.Value=True
'	lblDescripcionFaseBodyEmailFaseIncidencia.tag=DatosFaseIncSel.DescripcionAccion
'	lblDescripcionFaseBodyEmailFaseIncidencia.Text=lblDescripcionFaseBodyEmailFaseIncidencia.tag


End Sub

Private Sub RadioButtonDeDepartamentoCoordinador_SelectedChange(Selected As Boolean)
	
End Sub

Private Sub btnOKDatosEmailIncidencia_Click

	
	Dim CuentaDEEmailIncidencia As String
	Dim sCuentasParaEmailIncidencia As String
	Dim sCuentasCCEmailIncidencia As String
	Select True
		Case RadioButtonDeCuentaUsuario.As(RadioButton).Selected
			wait for(SeleccionarDireccionRemitenteEmails) complete (sCuenta As String)
			If sCuenta="" Then
				wait for(Utilidades.MsgBoxXUI("Aviso","Es obligatorio seleccionar una cuenta de remitente.")) complete (rObj As Object)
				Return
			End If
			CuentaDEEmailIncidencia=sCuenta
		Case RadioButtonDeIncidenciasProveedorAlmacenProin.As(RadioButton).Selected
			CuentaDEEmailIncidencia=NombreCuentaIncidenciasProveedorAlmacenProin
			
		Case RadioButtonDeIncidenciasProveedorAlmacenProtec.As(RadioButton).Selected
			CuentaDEEmailIncidencia=NombreCuentaIncidenciasProveedorAlmacenProtec
			
		Case RadioButtonDeDepartamentoCoordinador.As(RadioButton).Selected
			CuentaDEEmailIncidencia=IIf(NombreCuentaDepartamentoCoordinador<>"",NombreCuentaDepartamentoCoordinador,DireccionEmailDepartamentoCoordinador)
	End Select
	
	If CuentaDEEmailIncidencia="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio seleccionar la cuenta de remitente del correo. Es posible modificarla posteriormente, antes de enviar el correo.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	If CheckBoxParaProveedor.Checked Then
		wait for (SeleccionarCuentaEmailProveedor(txtProveedor.Text)) complete (sResp As String)
		If sResp="" Then
			wait for(Utilidades.MsgBoxXUI("Cuenta email proveedor no seleccionada","Indica la cuenta de email del proveedor en el correo, en Outlook,")) complete (rObj As Object)
		Else
			sCuentasParaEmailIncidencia=sResp
		End If
	End If
	
	If CheckBoxParaIncidenciasProveedorAlmacenProin.Checked Then
		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaIncidenciasProveedorAlmacenProin
	End If
	If CheckBoxParaIncidenciasProveedorAlmacenProtec.Checked Then
		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaIncidenciasProveedorAlmacenProtec
	End If
	
	If CheckBoxParaDepartamentoCoordinador.Checked Then
		If sCuentasParaEmailIncidencia<>"" Then sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & ";"
		sCuentasParaEmailIncidencia=sCuentasParaEmailIncidencia & NombreCuentaDepartamentoCoordinador
	End If
	
	If CheckBoxCCIncidenciasProveedorAlmacenProin.Checked Then
		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaIncidenciasProveedorAlmacenProin
	End If
	If CheckBoxCCIncidenciasProveedorAlmacenProtec.Checked Then
		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaIncidenciasProveedorAlmacenProtec
	End If
	If CheckBoxCCDepartamentoCoordinador.Checked Then
		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaDepartamentoCoordinador
	End If
	If CheckBoxCCFacturas.Checked Then
		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaFacturasProveedor
	End If
	
'	Dim msgArch As String=$"¿Archivar el correo?
'La función del archivado es agrupar los correos relacionados con la incidencia, y poder acceder a ellos de forma ágil."$
'	Dim msa As Object = xui.Msgbox2Async(msgArch,"Confirma", "Sí","Cancelar", "No", Null)
'	Wait For (msa) Msgbox_Result (rInt As Int)
'	If rInt=xui.DialogResponse_Cancel Then Return
'	If rInt=xui.DialogResponse_Positive Then
	If sCuentasCCEmailIncidencia.Contains(NombreCuentaEmailArchivadoIncidencias)=False Then
		If sCuentasCCEmailIncidencia<>"" Then sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & ";"
		sCuentasCCEmailIncidencia=sCuentasCCEmailIncidencia & NombreCuentaEmailArchivadoIncidencias
	End If
'	End If
	
	If sCuentasParaEmailIncidencia="" Then sCuentasParaEmailIncidencia="None"
	If sCuentasCCEmailIncidencia="" Then sCuentasCCEmailIncidencia="None"
	
	If B4XSwitchIncluirDescripcionBodyEmailIncidencia.Value Then
		'Dim sBody As String=$"$Xml{lblDescripcionFaseBodyEmailFaseIncidencia.Text}"$
		Dim sBody As String=$"$Xml{TextAreaDescripcionBodyEmailIncidencia.Text}"$
	Else
		Dim sBody As String=$"$Xml{""}"$
	End If
	
	BackgroundSeleccionDatosEmailIncidencia.RemoveAllViews
	BackgroundSeleccionDatosEmailIncidencia.RemoveViewFromParent
	
	
	EnviarEmail(CuentaDEEmailIncidencia, sCuentasParaEmailIncidencia, sCuentasCCEmailIncidencia, sBody)
End Sub

Private Sub btnCancelarDatosEmailIncidencia_Click
	BackgroundSeleccionDatosEmailIncidencia.RemoveAllViews
	BackgroundSeleccionDatosEmailIncidencia.RemoveViewFromParent
End Sub

Private Sub B4XSwitchIncluirDescripcionBodyEmailIncidencia_ValueChanged (Value As Boolean)
	If Value Then
		'lblDescripcionFaseBodyEmailFaseIncidencia.Text=lblDescripcionFaseBodyEmailFaseIncidencia.tag
		TextAreaDescripcionBodyEmailIncidencia.Text=TextAreaDescripcionBodyEmailIncidencia.tag
	Else
		'lblDescripcionFaseBodyEmailFaseIncidencia.Text=""
		TextAreaDescripcionBodyEmailIncidencia.Text=""
	End If
End Sub

Private Sub CheckBoxCCIncidenciasProveedorAlmacenProin_CheckedChange(Checked As Boolean)
	CheckBoxParaIncidenciasProveedorAlmacenProin.Checked=Not(Checked)
End Sub

Private Sub CheckBoxCCIncidenciasProveedorAlmacenProtec_CheckedChange(Checked As Boolean)
	CheckBoxParaIncidenciasProveedorAlmacenProtec.Checked=Not(Checked)
End Sub

Private Sub CheckBoxParaIncidenciasProveedorAlmacenProin_CheckedChange(Checked As Boolean)
	CheckBoxCCIncidenciasProveedorAlmacenProin.Checked=Not(Checked)
End Sub

Private Sub CheckBoxParaIncidenciasProveedorAlmacenProtec_CheckedChange(Checked As Boolean)
	CheckBoxCCIncidenciasProveedorAlmacenProtec.Checked=Not(Checked)
End Sub

Private Sub RadioButtonDeIncidenciasProveedorAlmacenProin_SelectedChange(Selected As Boolean)
	
End Sub

Private Sub RadioButtonDeIncidenciasProveedorAlmacenProtec_SelectedChange(Selected As Boolean)

End Sub


Sub CargaDatosFicherosAdjuntosIncidencia(IDIncidenciaSel As Int) As ResumableSub
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="IncidenciasProveedorFicherosAdjuntosIncidencia"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDIncidenciaSel), Me)

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
'			Dim msa As Object=xui.MsgboxAsync($"No hay ficheros adjuntos a la fase de la incidencia seleccionada."$,"Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			lstReg=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub


Sub MostrarFicherosAdjuntosIncidencia(IDIncidenciaSel As Int)
	
'	lstFicherosAccionesIncidenciaTemp.Initialize
'	lstFicherosAccionesIncidenciaTemp=CopyObject(lstFicherosAccionesIncidencia)
	
	clvFicherosAdjuntosIncidencia.Clear
	
	'btnOKFicherosAdjuntosIncidencia.Tag=IDIncidenciaSel
	
	
	Dim lstLinksFicherosActualesIncidencia As List
	lstLinksFicherosActualesIncidencia.Initialize
	
	'For Each DatosFicheroAccion As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
	For Each DatosFicheroAccion As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		lstLinksFicherosActualesIncidencia.Add(DatosFicheroAccion)
	Next
	
	Dim pnlNuevoFicheroAdjunto As Pane=xui.CreatePanel("")
	pnlNuevoFicheroAdjunto.SetLayoutAnimated(0,0,0,clvFicherosAdjuntosIncidencia.AsView.Width,40dip)
	pnlNuevoFicheroAdjunto.LoadLayout("scrIncidenciasProveedoresItemNuevoFicheroAdjuntoIncidencia")
	Dim sv As ScrollPane = clvFicherosAdjuntosIncidencia.sv
	sv.SetVScrollVisibility("AS_NEEDED")
	Dim NuevoFicheroAdjunto As TipoDatosFicheroAdjuntoIncidencia
	'NuevoFicheroAdjuntoAccion.IDIncidencia=DatosCabeceraIncidenciaProveedorTemp.IDIncidenciaProveedor
	NuevoFicheroAdjunto.IDIncidencia=DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor
	NuevoFicheroAdjunto.IDLineaAccion=0
	NuevoFicheroAdjunto.IDLineaFicherosAdjuntos=-1 ' nueva
	NuevoFicheroAdjunto.LinkFichero=""
	clvFicherosAdjuntosIncidencia.Add(pnlNuevoFicheroAdjunto,NuevoFicheroAdjunto)
	
	For Each DatoFicheroSel As TipoDatosFicheroAdjuntoIncidencia In lstLinksFicherosActualesIncidencia
		Dim pnlItemFicheroAdjunto As Pane=xui.CreatePanel("")
		pnlItemFicheroAdjunto.SetLayoutAnimated(0,0,0,clvFicherosAdjuntosIncidencia.AsView.Width,40dip)
		pnlItemFicheroAdjunto.LoadLayout("scrIncidenciasProveedorItemFicheroAdjuntoIncidencia")
		lblAbrirLinkFicheroAdjuntoIncidencia.Font=Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24)
		lblAbrirLinkFicheroAdjuntoIncidencia.Textsize=24
		lblAbrirLinkFicheroAdjuntoIncidencia.TextColor=xui.Color_Black
		lblAbrirLinkFicheroAdjuntoIncidencia.Text=Chr(0xfda6)
		lblLinkFicheroAdjuntoIncidencia.Text=DatoFicheroSel.LinkFichero
		clvFicherosAdjuntosIncidencia.Add(pnlItemFicheroAdjunto,DatoFicheroSel)
	Next
End Sub

Private Sub btnOKFicherosAdjuntosIncidencia_Click
	BackgroundSeleccionFicherosAdjuntosIncidencia.RemoveAllViews	
	BackgroundSeleccionFicherosAdjuntosIncidencia.RemoveViewFromParent
	Dim NumFicherosIncidencia As Int
	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFichero.IDLineaAccion=0 Then NumFicherosIncidencia=NumFicherosIncidencia+1
	Next
	DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia=NumFicherosIncidencia
	wait for(JamClickableBadges1.ReplaceLabel(lblIconFicherosAdjuntosIncidencia, DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia)) complete (rObj As Object)

	
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Cyan
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Black

	'Dim iDx As Int=clvFicherosAdjuntosIncidencia.GetItemFromView(lbl)
	'Dim DatosFicheroNuevo As TipoDatosFicherosAccionIncidencia=clvFicherosAdjuntosIncidencia.GetValue(iDx)
	AdjuntarFicherosIncidencia
End Sub

Sub AdjuntarFicherosIncidencia
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	' usamos la misma tabla que los adjuntos de accion (tarea) con IDLineaAccion=0
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorBorrarLineasFicheroAdjuntoAccionIncidenciaBatchDispositivoUsuario", _
			Array(Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	jamLoadingIndicator1.Close
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar las tablas batch de ficheros adjuntos incidencias proveedor dispositivo-usuario.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim lstLinksFicherosNuevos As List
	lstLinksFicherosNuevos.Initialize
	
	Dim FcH As FileChooser
	FcH.Initialize
	Dim lstLinksFicherosNuevosSeleccionados As List=FcH.ShowOpenMultiple(frm)
	If lstLinksFicherosNuevosSeleccionados.IsInitialized=False Then Return
	Log(lstLinksFicherosNuevosSeleccionados)
	
	'comprobar que no están ya los mismos links
	
	Dim lstLinksFicherosActuales As List
	lstLinksFicherosActuales.Initialize
	'For Each FicheroAccionesActual As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
	For Each FicheroAccionesActual As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		'If FicheroAccionesActual.IDLineaAccion=DatosAccionSel.IDLineaAccion Then
		lstLinksFicherosActuales.Add(FicheroAccionesActual.LinkFichero)
		'End If
	Next
	
	For Each sLinkNuevo As String In lstLinksFicherosNuevosSeleccionados
		Dim NuevoLink As Boolean=True
		For Each sLinkActual In lstLinksFicherosActuales
			If sLinkActual=sLinkNuevo Then
				NuevoLink=False
			End If
		Next
		If NuevoLink Then
'			Dim NuevoFichero As TipoDatosFicherosAccionIncidencia
'			NuevoFichero.IDIncidencia=DatosCabeceraIncidenciaProveedorTemp.IDIncidenciaProveedor
'			'NuevoFichero.IDLineaAccion=DatosAccionSel.IDLineaAccion
'			NuevoFichero.IDLineaAccion=0  ' 0 para los ficheros de la incidencia
'			''NuevoFichero.IDLineaFicherosAdjuntos=-1 ' será una nueva línea de Fichero adjunto, si finalmente se llega a grabar la incidencia.
'			NuevoFichero.LinkFichero=sLinkNuevo
'			'lstFicherosAccionesIncidenciaTemp.add(NuevoFicheroAccion)
			lstLinksFicherosNuevos.add(sLinkNuevo)
		End If
	Next
	
'''	Dim lstLinksFicherosActualesAccion As List
'''	lstLinksFicherosActualesAccion.Initialize
'''	For Each FicheroAccionesActual As TipoDatosFicherosAccionIncidencia In lstFicherosAccionesIncidenciaTemp
'''		If FicheroAccionesActual.IDLineaAccion=DatosAccionSel.IDLineaAccion Then
'''			lstLinksFicherosActualesAccion.Add(FicheroAccionesActual.LinkFichero)
'''		End If
'''	Next
	
	
	
	Dim UUIDSel As String=Utilidades.GenerarUUIDv4
	
	Dim lstComandos As List
	lstComandos.Initialize
	
	For Each sLink As String In lstLinksFicherosNuevos
		' usamos la misma tabla que los adjuntos de accion (tarea) con IDLineaAccion=0
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorNuevaLineaFicheroAdjuntoAccionIncidenciaBatch", _
			Array(DateTime.Now, UUIDSel,Main.DatosUsuario.Dispositivo,Main.DatosUsuario.NombreUsuarioWindows,DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, 0,0, sLink))
		lstComandos.Add(cmd)
	Next
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible insertar los datos en la tabla batch de ficheros adjuntos de incidencias proveedor dispositivo-usuario.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

	Wait For(GrabarNuevosLinksFicherosAdjuntos(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor,0,UUIDSel)) complete (mRes As Map)
	Dim Accion As String=mRes.get("Accion")
	If Accion<>"OK" Then Return
	
	lstFicherosAdjuntosIncidencia.Initialize
	jamLoadingIndicator1.MensajeLoading="Cargando Ficheros Adjuntos Incidencia..."
	jamLoadingIndicator1.Show
	Wait For(CargaDatosFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mDataFichero As Map In lstReg
		Dim FicheroAdjuntoAccionIncidencia As TipoDatosFicheroAdjuntoIncidencia
		FicheroAdjuntoAccionIncidencia.Initialize
		FicheroAdjuntoAccionIncidencia.IDLineaFicherosAdjuntos=mDataFichero.Get("IDLineaFicherosAdjuntos")
		FicheroAdjuntoAccionIncidencia.IDIncidencia=mDataFichero.Get("IDIncidencia")
		FicheroAdjuntoAccionIncidencia.IDLineaAccion=mDataFichero.Get("IDLineaAccion")
		FicheroAdjuntoAccionIncidencia.LinkFichero=mDataFichero.Get("LinkFichero")
		lstFicherosAdjuntosIncidencia.Add(FicheroAdjuntoAccionIncidencia)
		'AddItemCLVAccionesAccion(AccionIncidencia)
	Next
	Dim NumFicherosIncidencia As Int
	For Each DatosFichero As TipoDatosFicheroAdjuntoIncidencia In lstFicherosAdjuntosIncidencia
		If DatosFichero.IDLineaAccion=0 Then NumFicherosIncidencia=NumFicherosIncidencia+1
	Next
	DatosCabeceraIncidenciaProveedor.NumeroFicherosAdjuntosIncidencia=NumFicherosIncidencia

	MostrarFicherosAdjuntosIncidencia(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor)
	
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=0xFFFFD700
End Sub

Private Sub lblNuevoLinkFicheroAdjuntoIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Black
End Sub

'Private Sub lblLinkFicheroAdjuntoIncidencia_MousePressed (EventData As MouseEvent)
'	Dim lbl As B4XView=Sender
'	lbl.Textcolor=xui.Color_Cyan
'End Sub
'
'Private Sub lblLinkFicheroAdjuntoIncidencia_MouseReleased (EventData As MouseEvent)
'	Dim lbl As B4XView=Sender
'	lbl.Textcolor=xui.Color_Black
'End Sub
'
'Private Sub lblLinkFicheroAdjuntoIncidencia_MouseEntered (EventData As MouseEvent)
'	Dim lbl As B4XView=Sender
'	lbl.Textcolor=0xFFFFD700
'End Sub
'
'Private Sub lblLinkFicheroAdjuntoIncidencia_MouseExited (EventData As MouseEvent)
'	Dim lbl As B4XView=Sender
'	lbl.Textcolor=xui.Color_Black
'End Sub

Private Sub lblEliminarLinkFicheroAdjuntoIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Cyan
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Black
	
	Dim iDx As Int=clvFicherosAdjuntosIncidencia.GetItemFromView(lbl)
	Dim DataFicheroSel As TipoDatosFicheroAdjuntoIncidencia=clvFicherosAdjuntosIncidencia.GetValue(iDx)
	Dim LinkFicheroSel As String=DataFicheroSel.LinkFichero
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿eliminar el link del fichero seleccionado?
${LinkFicheroSel}
(No se elimina el fichero, sólo el enlace de ese fichero con la incidencia)"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorEliminarLinkFicheroAdjuntoFaseIncidencia", _
			Array(0, DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, LinkFicheroSel))
			
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar el link del fichero seleccionado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	'MostrarFicherosAdjuntosFaseIncidencia(DatosAccionSel)
	
	clvFicherosAdjuntosIncidencia.RemoveAt(iDx)
	'lstFicherosAccionesIncidenciaTemp.RemoveAt(lstFicherosAccionesIncidenciaTemp.IndexOf(DataFicheroSel))
	lstFicherosAdjuntosIncidencia.RemoveAt(lstFicherosAdjuntosIncidencia.IndexOf(DataFicheroSel))
	
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=0xFFFFD700
End Sub

Private Sub lblEliminarLinkFicheroAdjuntoIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized=False Then Return
	lbl.Textcolor=xui.Color_Black
End Sub

Private Sub lblAbrirLinkFicheroAdjuntoIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Cyan
End Sub

Private Sub lblAbrirLinkFicheroAdjuntoIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=0xFFFFD700
	

End Sub

Private Sub lblAbrirLinkFicheroAdjuntoIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized= False Then Return
	lbl.Textcolor=xui.Color_Black
End Sub

private Sub lblAbrirLinkFicheroAdjuntoIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.Textcolor=xui.Color_Black
	Dim iDx As Int=clvFicherosAdjuntosIncidencia.GetItemFromView(lbl)
	Dim DataFichero As TipoDatosFicheroAdjuntoIncidencia=clvFicherosAdjuntosIncidencia.GetValue(iDx)
	Dim LinkFichero As String=DataFichero.LinkFichero
	If File.Exists(File.GetFileParent(LinkFichero), File.GetName(LinkFichero))=False Then
		Dim msa As Object=xui.MsgboxAsync($"No existe el fichero seleccionado
 ${LinkFichero}"$,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Try
		fx.ShowExternalDocument(LinkFichero)
	Catch
		Log(LastException)
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible abrir el fichero seleccionado
		 ${LinkFichero }
		 ${LastException.Message}"$,"Error")
		Wait For (msa) Msgbox_Result
	End Try
End Sub




Sub CargaNombreProveedor(ProvSel As String) As ResumableSub
	
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="NombreProveedor"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(ProvSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No existe el proveedor seleccionado (${ProvSel})"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			mData0=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData0", mData0)
		End If
	End If
	Return mRes
End Sub




Sub EditarDatosCabeceraIncidencia As ResumableSub
	
'	IncidenciasProveedorActualizarCabeceraIncidencia=UPDATE datoscomunes.tblincidenciasproveedor SET \
'	TipoOrigenIncidenciaProveedor = ?,DepartamentoCoordinador = ?,FechaIncidenciaLong = ?,\
'	Proveedor = ?,NombreProveedor = ?,IDTipoDocumento = ?,DocumentoProveedor = ?,FechaDocumentoProveedorLong = ?,IDTipoDocumentoOrigen=?,DocumentoOrigen = ?\
'	WHERE IDIncidenciaProveedor = ?

	Dim IDTipoDocumentoSel As Int=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?",Array As String(txtTipoDocumentoProveedor.Text))
	Dim IDTipoDocumentoOrigenAsociadoSel As Int=mSQL.ExecQuerySingleResult2("select IDTipoDocumento from tblIncidenciasProveedorTiposDocumentos where NombreTipoDocumento=?",Array As String(txtTipoDocumentoOrigen.text))

	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorActualizarCabeceraIncidencia", _
			Array(txtTipoOrigenIncidencia.Text, txtDepartamentoCoordinador.Text, DateTime.DateParse(txtFechaIncidencia.Text), _
			txtProveedor.Text, txtNombreProveedor.Text, IDTipoDocumentoSel, txtDocumentoProveedor.Text, DateTime.DateParse(txtFechaDocumentoProveedor.text), _
			IDTipoDocumentoOrigenAsociadoSel, txtDocumentoOrigenProveedor.Text, _
			DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor))
			
	DateTime.DateFormat=DateFormatAnt
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	Return Success
End Sub

Sub JamClickableBadges1_BadgeClick(Data As JamClickableBadgeData)
	Select Case Data.ParentView
		Case lblTitleDepartamentoGestorAccionLinea
			Dim msa As Object=xui.MsgboxAsync($"Es el departamento que debe continuar con la resolución de la incidencia, gestionando la fase actual."$,"Departamento Asignado Fase")
			Wait For (msa) Msgbox_Result
	End Select
End Sub

Sub ReabrirTarea(DataAccionSel As TipoDatosAccionIncidencia)
	Dim msa As Object = xui.Msgbox2Async($"¿Reabrir la tarea seleccionada?
Se eliminarán los datos de cierre de tarea:
(Fecha, Usuario, Comentario)"$,"Confirma", "Sí","Cancelar", "", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorReabrirTarea", _
			Array(DataAccionSel.IDIncidencia, DataAccionSel.IDLineaAccion))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	jamLoadingIndicator1.Close
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible reabrir la tarea seleccionada.","Error")
		Wait For (msa) Msgbox_Result
	Else
		CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
	End If

End Sub

Sub MostrarCierraTareaIncidencia(DataAccionSel As TipoDatosAccionIncidencia)
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundCerrarTareaIncidencia" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	

	
	BackgroundCerrarTareaIncidencia= xui.CreatePanel("BackgroundCerrarTareaIncidencia")
	BackgroundCerrarTareaIncidencia.Tag = "BackgroundCerrarTareaIncidencia"
	BackgroundCerrarTareaIncidencia.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundCerrarTareaIncidencia, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseCerrarTareaIncidencia=xui.CreatePanel("pnlBaseCerrarTareaIncidencia")
	BaseCerrarTareaIncidencia.SetLayoutAnimated(0,0,0,700dip, 150dip)
	BaseCerrarTareaIncidencia.LoadLayout("scrIncidenciaProveedorCierreAccionIncidencia")

	
	BackgroundCerrarTareaIncidencia.AddView(BaseCerrarTareaIncidencia,(BackgroundCerrarTareaIncidencia.Width/2-BaseCerrarTareaIncidencia.Width/2), _
		(BackgroundCerrarTareaIncidencia.Height/2-BaseCerrarTareaIncidencia.Height/2), BaseCerrarTareaIncidencia.Width, BaseCerrarTareaIncidencia.Height)
		
	pnlFondoEditarCierreTarea.Tag=DataAccionSel.IDLineaAccion
		
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtFechaEditarCierreTarea.Text=IIf(DataAccionSel.FechaCierreAccion=0,DateTime.Date(DateTime.Now),DateTime.Date(DataAccionSel.FechaCierreAccion))
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSelFechaEditarCierreTareaIncidencia_Click
	Dialog.Title="Indica Fecha Cierre Tarea"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	If txtFechaEditarCierreTarea.Text="" Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=DateTime.DateParse(txtFechaEditarCierreTarea.Text)
	End If
	
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim NuevaFecha As Long=B4XDateDlg.Date
	txtFechaEditarCierreTarea.Text=DateTime.Date(NuevaFecha)
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnGrabarCierreAccionIncidencia_Click

	
	'Dim DatosAccionSel As TipoDatosAccionIncidencia=pnlFondoEditarCierreTarea.Tag
	'Dim IDLineaAccionSel As Int=DatosAccionSel.IDLineaAccion
	Dim IDLineaAccionSel As Int=pnlFondoEditarCierreTarea.Tag
	
'	IncidenciasProveedorEditarCierreAccionIncidencia
'	UPDATE datoscomunes.tblincidenciasproveedoracciones \
'	SET EstadoAccion = ?,UsuarioCierraAccion = ?,FechaCierreAccion = ?,ComentarioCierreAccion = ? WHERE IDLineaAccion = ?
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("IncidenciasProveedorEditarCierreAccionIncidencia",Array(1,Main.DatosUsuario.NombreUsuarioWindows.ToUpperCase, _
		DateTime.DateParse(txtFechaEditarCierreTarea.Text), txtEditarComentarioCierreAccionIncidencia.Text, IDLineaAccionSel))
	DateTime.DateFormat=DateFormatAnt
	
	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el cierre de la tarea.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	BackgroundCerrarTareaIncidencia.RemoveAllViews
	BackgroundCerrarTareaIncidencia.RemoveViewFromParent
	
	CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
	
End Sub

Private Sub btnCancelarCierreAccionIncidencia_Click
	BackgroundCerrarTareaIncidencia.RemoveAllViews
	BackgroundCerrarTareaIncidencia.RemoveViewFromParent
End Sub

Private Sub btnSelInformeNoConformidad_Click
	
	
	Dim FcH As FileChooser
	FcH.Initialize
	FcH.InitialDirectory="\\192.168.10.4\Publico\ModuloD\80 REGISTROS\PGI-07 INCIDENCIAS\INFORMES DE NO CONFORMIDAD"
	If txtInformeNoConformidadAsociadaIncidencia.Text<>"" Then
		Dim DirLink As String=File.GetFileParent(txtInformeNoConformidadAsociadaIncidencia.Text)
		FcH.InitialDirectory=DirLink
	Else
		
	End If
	Dim FicheroLinkInformeNoConformidad As String=FcH.ShowOpen(frm)
	If FicheroLinkInformeNoConformidad="" And txtInformeNoConformidadAsociadaIncidencia.Text="" Then Return
	If FicheroLinkInformeNoConformidad="" And txtInformeNoConformidadAsociadaIncidencia.Text<>"" Then
		Dim msa As Object = xui.Msgbox2Async("Eliminar el link actual al fichero de informe no conformidad?","Confirma", "Sí","", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorLinkInformeNoConformidadAsociada", _
			Array(FicheroLinkInformeNoConformidad, DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	jamLoadingIndicator1.Close
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar el link del informe de no conformidad asociado a la incidencia.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	txtInformeNoConformidadAsociadaIncidencia.Text=FicheroLinkInformeNoConformidad
	DatosCabeceraIncidenciaProveedor.LinkInformeNoConformidadAsociada=FicheroLinkInformeNoConformidad
	
End Sub

Sub GrabarNuevosLinksFicherosAdjuntos(IDIncSel As Int, IDAccionSel As Int, UUIDSel As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	Dim Comando As String="IncidenciasProveedorNuevosLinksFicherosAdjuntosFaseIncidencia"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDIncSel,IDAccionSel,UUIDSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar
			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No existe la incidencia seleccionada (${IncidenciaProveedorSel})"$,"Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mRespuesta As Map=lstReg.Get(0)
			Dim sResp As String=mRespuesta.GetValueAt(0)
			If sResp.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error SP " & Comando & "." & CRLF & CRLF & sResp & CRLF & CRLF & "No ha sido posible guardar los links de fichero adjunto.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Private Sub btnSelGrabarCierreIncidenciaCosteIncidencia_Click
	Dialog.Title="Indica Coste de la incidencia"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=DatosCabeceraIncidenciaProveedor.CosteIncidencia
	InputDlg.ConfigureForNumbers(True,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevoCosteIncidencia As Double=InputDlg.Text
	txtGrabarCierreIncidenciaCosteIncidencia.Text=NuevoCosteIncidencia
End Sub

Private Sub btnSelGrabarCierreIncidenciaResponsableCausaIncidencia_Click
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Wait For(CargaIncidenciasProveedorDepartamentos) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim lstDepartamentos As List
	lstDepartamentos.Initialize
	For Each mData As Map In lstReg
		lstDepartamentos.Add(mData.GetValueAt(0))
	Next
	lstDepartamentos.Sort(True)
	Dialog.Title="Selecciona Departamento Responsable Causa Incidencia"
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
		
	'Dim lstOpciones As List=Array As String("Compra","Servicio")
	
	B4XListDlg.Options=lstDepartamentos
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return

	txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text=B4XListDlg.SelectedItem
End Sub

Private Sub CheckBoxGrabarCierreIncidenciaIncidenciaInterna_CheckedChange(Checked As Boolean)
'	If txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text<>"" Or txtGrabarCierreIncidenciaTipoIncidencia<>"" Then
'		Dim msa As Object = xui.Msgbox2Async($"Modificar el campo Incidencia Interna implica borrar los datos de Responsable Causa Incidencia y Tipo Incidencia.
'¿Continuar?"$,"Confirma", "Sí","Cancelar", "", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then
'			
'		End If
'	End If
	If Checked Then
		txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text=""
		txtGrabarCierreIncidenciaTipoIncidencia.Text="Responsabilidad Interna"
		
	Else
		txtGrabarCierreIncidenciaResponsableCausaIncidencia.Text="Proveedor"
		txtGrabarCierreIncidenciaTipoIncidencia.Text=""
	End If
	btnSelGrabarCierreIncidenciaResponsableCausaIncidencia.Visible=Checked
	btnSelGrabarCierreIncidenciaTipoIncidencia.Visible=Not(Checked)
End Sub

Private Sub lblReabrirIncidencia_MousePressed (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FFFF,1dip,0xFF696969,5)
End Sub

Private Sub lblReabrirIncidencia_MouseReleased (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
	Dim msa As Object = xui.Msgbox2Async($"¿Reabrir la incidencia?
Se borrarán todos los datos de cierre."$,"Confirma", "Sí","Cancelar", "", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	
	If rInt=xui.DialogResponse_Cancel Then Return
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorReabrirIncidencia", _
			Array(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor))
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible reabrir la incidencia.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	CambioAModoVer(DatosCabeceraIncidenciaProveedor.IDIncidenciaProveedor, DatosCabeceraIncidenciaProveedor.IncidenciaProveedor)
End Sub

Private Sub lblReabrirIncidencia_MouseEntered (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	lbl.SetColorAndBorder(0xFFFFD700,1dip,0xFF696969,5)
End Sub

Private Sub lblReabrirIncidencia_MouseExited (EventData As MouseEvent)
	Dim lbl As B4XView=Sender
	If lbl.IsInitialized=False Then Return
	lbl.SetColorAndBorder(0xFF00FA9A,1dip,0xFF696969,5)
End Sub

Sub AnularIncidencia(IDIncSel As Int)
	Dim msa As Object = xui.Msgbox2Async($"¿Anular la incidencia ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}?"$,"Confirma", "Sí","Cancelar", "", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	jamLoadingIndicator1.MensajeLoading="Anulando incidencia..."
	jamLoadingIndicator1.Show
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("IncidenciasProveedorAnularIncidencia", _
			Array(IDIncSel))
			
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
	jamLoadingIndicator1.close
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible anular la incidencia.","Error")
		Wait For (msa) Msgbox_Result
	Else
		Dim msa As Object=xui.MsgboxAsync("Incidencia anulada.","Aviso")
		Wait For (msa) Msgbox_Result
		SalirModulo
		Return
	End If

End Sub

Sub ImprimirIncidencia
	
	jamLoadingIndicator1.MensajeLoading="Generando documento..."
	jamLoadingIndicator1.Show
	

	Dim sImagenLogo As String
	Dim hLogo, wLogo As Int
'	Select ClienteProtec
'		Case 0
			sImagenLogo="Logo_Proin_bn_transparente.jpg"
			hLogo=30
			wLogo=75
'		Case 1
'			sImagenLogo="logo_protec-marti_BN.jpg"
'			hLogo=50
'			wLogo=50
'	End Select
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	
	Dim wd As WordUtils
	wd.Initialize
	Dim doc As WordDocument = wd.CreateDocument
	Dim joDoc As JavaObject=doc.XWPFDocument
	
	doc.SetMargins(560,560,280,280,280,720,0) ' en twips
	
	doc.Append($"[table rows=1 cols=2]
	[row]
        [cell width=100 VerticalAlignment=Center][p][img Dir=assets FileName=${sImagenLogo} Width=${wLogo} Height=${hLogo}/][/p][/cell]
        [cell width=350 VerticalAlignment=Center][p Alignment=Center][textsize=24]INCIDENCIA PROVEEDOR[/textsize][/p][/cell]
    [/row]
	[/table]"$)
	
	Dim joTableH As JavaObject=joDoc.RunMethod("getTableArray",Array(0))
	joTableH.RunMethod("removeBorders",Null)
	
	'doc.Append($"[p][img Dir=assets FileName="Logo Proin bn transparente.jpg" Width=75 Height=30/][/p][p Alignment=Center][textsize=24]PACKING LIST Nº ${txtIDPackingList.Text}[/textsize][/p]
	
	Dim sFechaDocProveedor As String=IIf(DatosCabeceraIncidenciaProveedor.FechaDocumentoProveedorLong=0,"",DateTime.Date(DatosCabeceraIncidenciaProveedor.FechaDocumentoProveedorLong))
	
	doc.Append($"[p]
	
	
[b]Nº Incidencia:[/b] ${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}	[b]Fecha:[/b] $Date{DatosCabeceraIncidenciaProveedor.FechaIncidenciaLong}
[b]Proveedor:[/b] ${DatosCabeceraIncidenciaProveedor.Proveedor}   ${DatosCabeceraIncidenciaProveedor.NombreProveedor}
[b]Documento Proveedor:[/b] ${DatosCabeceraIncidenciaProveedor.DocumentoProveedor}	[b]Fecha Documento Proveedor:[/b] ${sFechaDocProveedor}
[b]${DatosCabeceraIncidenciaProveedor.NombreTipoDocumentoOrigen}:[/b] ${DatosCabeceraIncidenciaProveedor.DocumentoOrigen}

[b]Descripción de la Incidencia:[/b]

${DatosCabeceraIncidenciaProveedor.DescripcionIncidencia}
[/p]"$)


	Dim f1 As JavaObject = joDoc.RunMethod("createFooter", Array("DEFAULT")) 'XWPFFooter
	Dim f1paragraph As JavaObject = f1.RunMethod("createParagraph", Null) 'XWPFParagraph
	f1paragraph.RunMethod("setAlignment",Array("RIGHT"))
	Dim f1r1 As JavaObject = f1paragraph.RunMethod("createRun", Null) 'XWPFRun
	f1r1.RunMethod("setText",Array("Página "))
	f1r1.RunMethodJO("getCTR",Null).RunMethod("addNewPgNum",Null)
	'f1r1.setText(" of 9");
	'Dim ctrf1 As JavaObject=f1r1.RunMethod("getCTR",Null)


	DateTime.DateFormat=DateFormatAnt
	
'	doc.Append($"[footer]
'	[p]Generated automatically...[/p]
'	[/footer]"$)

	'
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd-MM-yyy"
'	Dim NombreFichero As String=$"Packing List ${txtIDPackingList.Text}  $Date{DateTime.Now}.docx"$
	
'	Dim f As String = doc.SaveAs(CarpetaDestino,NombreFichero, True)
'	DateTime.DateFormat=DateFormatAnt

	Dim DirInforme As String="\\192.168.10.4\Publico\IncidenciasProveedor\Informes"
	Dim NombreInforme As String=$"${DatosCabeceraIncidenciaProveedor.IncidenciaProveedor}.docx"$
	doc.SaveAs(DirInforme, NombreInforme,True)
	
	Dim FicheroWordDestino As String=File.Combine(DirInforme, NombreInforme)
	Dim FicheroPDFdestino As String=FicheroWordDestino.Replace("docx","pdf")
	Wait For (wd.PowerShellConvertToPdf(FicheroWordDestino, FicheroPDFdestino, True)) Complete (Success As Boolean)
	jamLoadingIndicator1.Close
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible crear el fichero PDF.","Error")
		Wait For (msa) Msgbox_Result
	End If
	If Success Then
		File.Delete(DirInforme, NombreInforme)
	End If
	
	'Wait For (wd.OpenWord(f)) Complete (Success As Boolean)
	
	'fx.ShowExternalDocument(File.GetUri(File.GetFileParent(FicheroPDFdestino), File.GetName(FicheroPDFdestino)))

End Sub

Private Sub B4XSwitchAdjuntarFicherosAdjuntosIncidencia_ValueChanged (Value As Boolean)
	Dim msa As Object=xui.MsgboxAsync("Pendiente de programar...","Aviso")
	Wait For (msa) Msgbox_Result
	B4XSwitchAdjuntarFicherosAdjuntosIncidencia.Value=False
End Sub

Private Sub btnSelAnalisisTarifasVentaEdicionDatosCabeceraEmailCoordinador_Click
	
End Sub

Private Sub btnSelAnalisisTarifasVentaEdicionDatosCabeceraDescripcionAnalisis_Click
	
End Sub

Private Sub btnOKDatosCabeceraAnalisisTarifasVenta_Click
	
End Sub


Sub lblDocumentoOrigenNAV_MouseClicked (EventData As MouseEvent)
	If DatosCabeceraIncidenciaProveedor.DocumentoOrigen.StartsWith("PC")=False Then
		Dim msa As Object=xui.MsgboxAsync("No es posible abrir el documento origen en navision","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	VerPedidoCompraNAV(DatosCabeceraIncidenciaProveedor.DocumentoOrigen)
End Sub

Sub VerPedidoCompraNAV(PedCompraNAVSel As String)
	Dim msa As Object = xui.Msgbox2Async("¿Ver el pedido de compra " & PedCompraNAVSel & " en NAVISION?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido compra",50, "No.", PedCompraNAVSel)
	wait for(rSub) complete (success As Boolean)
	If success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el pedido seleccionado en Navision.","Error")
		Wait For (msa) Msgbox_Result
	End If
End Sub

Sub EnvioAutomaticoEmailNuevaIncidencia(UsuarioIncidencia As String, DepartamentoAsignado As String, Incidencia As String, Proveedor As String, NombreProveedor As String, CuerpoMensaje As String) As ResumableSub

	Wait For(CargaDatosConfiguracionCuentasEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Return "ERROR"
	End If
	Dim EmailDepartamentoAsignado As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DepartamentoAsignado))
			
	Wait For(CargaDatosConfiguracionCuentaArchivadoEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return "ERROR"
	Dim mDataArch As Map=mRes.Get("mData0")
	CuentaEmailArchivadoIncidencias=mDataArch.Get("DireccionEmail")
	NombreCuentaEmailArchivadoIncidencias=mDataArch.Get("NombreCuenta")

	Dim Asunto As String=$"Nueva Incidencia de proveedor [${Incidencia}] Proveedor ${Proveedor}  ${NombreProveedor}"$
	Dim Body As String=$"${UsuarioIncidencia} ha creado nueva incidencia de proveedor (${Incidencia}), asignando al departamento de ${DepartamentoAsignado} la tarea inicial.
	
${CuerpoMensaje}

No respondas a este correo. Ha sido generado por un proceso automático.
"$
	Body=Body.Replace(CRLF,"<br>")

	Wait For(EnviarMensajeHttpPA(CuentaEmailArchivadoIncidencias,EmailDepartamentoAsignado,"",CuentaEmailArchivadoIncidencias, Asunto,Body)) complete (sResp As String)
	Return sResp

End Sub

Sub EnvioAutomaticoEmailNuevaTareaIncidencia(UsuarioTarea As String, DepartamentoAsignado As String, Incidencia As String, CuerpoMensaje As String) As ResumableSub

	
	Wait For(CargaDatosConfiguracionCuentasEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Return "ERROR"
	End If
	Dim EmailDepartamentoAsignado As String=mSQL.ExecQuerySingleResult2("select DireccionEmail from tblIncidenciasProveedorCuentasEmailIncidencias where Departamento=?", Array As String(DepartamentoAsignado))
			
	Wait For(CargaDatosConfiguracionCuentaArchivadoEmailIncidencias) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return "ERROR"
	Dim mDataArch As Map=mRes.Get("mData0")
	CuentaEmailArchivadoIncidencias=mDataArch.Get("DireccionEmail")
	NombreCuentaEmailArchivadoIncidencias=mDataArch.Get("NombreCuenta")
	
'	Wait For(CargaDatosConfiguracionHttpRequestEnvioAutomaticoEmailNuevaTarea) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		Return "ERROR"
'	End If
'	Dim mData0 As Map=mRes.Get("mData0")
'	Dim Link As String=mData0.Get("Link")
'	
'	Dim mData As Map
'	mData.Initialize
'	mData.Put("UsuarioTarea",UsuarioTarea)
'	mData.Put("DepartamentoAsignado",DepartamentoAsignado)
'	mData.Put("EmailDepartamentoAsignado",EmailDepartamentoAsignado)
'	mData.Put("Incidencia",Incidencia)
'	mData.Put("CuerpoMensaje",CuerpoMensaje)
'
'
'
'	Dim job As HttpJob
'	job.Initialize("",Me)
'	
''	Dim sQueryAPI As String=$""$
''	
''	job.Download(sQueryAPI)
'
'	'job.GetRequest.SetHeader("Accept","application/json")
'	'job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'
'	job.PostMultipart(Link,mData,Null)
'	'job.GetRequest.SetContentType("application/json")
''	job.GetRequest.SetContentType("JSON")
''	job.GetRequest.SetContentType("application/JSON")
'	job.GetRequest.SetHeader("Content-Type","application/JSON")
'	job.GetRequest.Timeout=15000
'	
'	Wait For (job) JobDone(j As HttpJob)
'
'	If j.Success Then
'		Log("job.response.StatusCode: " & job.response.StatusCode)
'		Log(j.GetString)
'		Dim sRespuestaWebService As String=j.GetString
'		j.Release
'		Return sRespuestaWebService
'	Else
'		
'		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
'		j.Release
'		Return sErrorJobResponse
'	End If

	Dim Asunto As String=$"Asignada Tarea Incidencia [${Incidencia}]"$
	Dim Body As String=$"${UsuarioTarea} ha asignado al departamento de ${DepartamentoAsignado} una nueva tarea, correspondiente a la incidencia nº ${Incidencia}
	
${CuerpoMensaje}

No respondas a este correo. Ha sido generado por un proceso automático.
"$
	Body=Body.Replace(CRLF,"<br>")

	Wait For(EnviarMensajeHttpPA(CuentaEmailArchivadoIncidencias,EmailDepartamentoAsignado,"",CuentaEmailArchivadoIncidencias, Asunto,Body)) complete (sResp As String)
	Return sResp

End Sub


Sub EnviarMensajeHttpPA(SenderAccount As String, ToAccounts As String, CCAccounts As String, CCOAccounts As String, Subject As String, Body As String) As ResumableSub

	Wait For(CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Return "ERROR"
	End If
	Dim mData0 As Map=mRes.Get("mData0")
	Dim Link As String=mData0.Get("Link")
	
	Dim mData As Map
	mData.Initialize
	mData.Put("Remitente",SenderAccount)
	mData.Put("Destinatario",ToAccounts)
	mData.Put("CC",CCAccounts)
	mData.Put("CCO",CCOAccounts)
	mData.Put("Asunto",Subject)
	mData.Put("CuerpoMensaje",Body)
	

	Dim jGEn As JSONGenerator
	jGEn.Initialize(mData)
	Dim sJSON As String=jGEn.ToString

	Dim job As HttpJob
	job.Initialize("",Me)

	job.PostString(Link,sJSON)
	job.GetRequest.SetContentType("application/JSON")
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub