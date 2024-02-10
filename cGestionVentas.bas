B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private xui As XUI
	Private jamTableViewGestionVentas As jamTableView
	Private fx As JFX
	Private frm As Form
	
	Private Dialog As B4XDialog
	Dim JamLoadingIndicator1  As JamLoadingIndicator
	
	'Private mCallback As Object
	
	'Private FirstTime As Boolean
	
	Private mSQLGestionventas As SQL
	
	'Private CodVendedorSeleccionado As String
	Private txtCodigoVendedor As TextField
	Private txtNombreVendedor As TextField
	Private btnSalir As Button
	
	Private CalcularFechas As Boolean
	Dim Cal As GregorianCalendar
	Dim Locale As Locale
	
	Public PermisoModuloUsuario As String
	
	Private CarpetaFicherosCSVRepsol As String
	Private CarpetaFicherosPDFRepsol As String
	Private BuzonCompartidoEmailEnvioInfoRepsol As String
	Private BuzonCompartidoEmailEnvioInfoRepsol As String
	Private DireccionSeleccionadaRemitenteEmailsRepsol As String
	Private DireccionDestinoEmailsRepsol As String
	Private DireccionCCDestinoEmailsRepsol As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub


Sub Show
		frm.Initialize("frm",Main.xScreen, Main.yscreen)
		Dim joForm As JavaObject = frm
		Dim joStage As JavaObject = joForm.GetField("stage")
		joStage.RunMethod("setMaximized", Array(True))
		frm.Icon = Main.IconoFormularios
		frm.RootPane.LoadLayout("scrGestionVentas")
		
		Sleep(0)

		frm.Title=Main.PrefijoTitleForms & "    Gestión Ventas"
		
'		Main.CodVendedorSeleccionado="V021"
'		Main.CodVendedorSeleccionado=""
	
		Dialog.Initialize(frm.RootPane)
		JamLoadingIndicator1.Initialize(Me, frm.RootPane)
	
		jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.WAIT)
		

		Dim rSub As ResumableSub=jamTableViewGestionVentas.ConfigurarTableView("GestionVentasAmpliadaPlazos.json",Null)
		wait for (rSub) complete (mRes As Map)
		
		jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.DEFAULT)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			'CallSubDelayed(mCallback,"Show")
			Return
		End If
		
		jamTableViewGestionVentas.ToolTipTableColumn("Documento","Tooltip para columna Documento")
		jamTableViewGestionVentas.EstadoMenuItem("MenuAccionesjamTableView",True)
		jamTableViewGestionVentas.EstadoMenuItem("MenuLineajamTableView",False)
		'jamTableViewGestionVentas.AddContextMenuItem("Ver Pedido NAV","VerPedidoNAV")
		Dim img As Image
		img.InitializeSample(File.DirAssets,"navision.png",24,24)
		jamTableViewGestionVentas.AddContextMenuItemImage("Ver Pedido NAV","VerPedidoNAV",img)
		'jamTableViewGestionVentas.AddContextMenuItem("Ver Articulo NAV","VerArticuloNAV")
		'jamTableViewGestionVentas.AddContextMenuItemColumna("Articulo","Ver Articulo NAV","VerArticuloNAV")

		jamTableViewGestionVentas.AddContextMenuItemImageColumna("Artículo","Ver Articulo NAV","VerArticuloNAV",img)
		jamTableViewGestionVentas.AddContextMenuItemImageColumna("FechaDisponibilidad","Ver Fechas Prometidas Compra","VerFechasPrometidasCompraArticuloNAV",img)
	jamTableViewGestionVentas.AddContextMenuItemFontMaterialIconsTextColumna("Documento","Enviar Email Transnatur-Albarán REPSOL","EnviarEmailAlbaranTransnaturREPSOL",Chr(0xE0BE))
		
		jamTableViewGestionVentas.AddMenuItemImagenToMenuInMenuBar("Prevision semanal ventas","PrevisionSemanalVentas",jamTableViewGestionVentas.MenuBarAcciones, File.DirAssets,"predecir.png",32,32)
	jamTableViewGestionVentas.AddMenuItemFontMaterialIconsToMenuInMenuBar("Enviar Email Transnatur-Albarán REPSOL","EnviarEmailAlbaranTransnaturREPSOL",Chr(0xE0BE),jamTableViewGestionVentas.MenuBarAcciones)
		
'		Dim CFFechaDocumento As DatosCellFactoryJamTableView
'		CFFechaDocumento.Initialize
'		CFFechaDocumento.AliasCampoColumna="FechaDocumento"
'		CFFechaDocumento.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFecha
'		CFFechaDocumento.CellFactoryEnCallBack=False
'		jamTableViewGestionVentas.SetCellFactory(CFFechaDocumento)
'		
'		Dim CFFecha As DatosCellFactoryJamTableView
'		CFFecha.Initialize
'		CFFecha.AliasCampoColumna="FechaMaterial"
'		'CFFecha.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFechaSqlServer
'		CFFecha.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFechaSqlServer
'		CFFecha.CellFactoryEnCallBack=False
'		jamTableViewGestionVentas.SetCellFactory(CFFecha)
'		
'		Dim CFFecha As DatosCellFactoryJamTableView
'		CFFecha.Initialize
'		CFFecha.AliasCampoColumna="FechaPlanificada"
'		CFFecha.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFechaSqlServer
'		CFFecha.CellFactoryEnCallBack=False
'		jamTableViewGestionVentas.SetCellFactory(CFFecha)
'		
'		Dim CFFecha As DatosCellFactoryJamTableView
'		CFFecha.Initialize
'		CFFecha.AliasCampoColumna="FechaPrometida"
'		CFFecha.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFechaSqlServer
'		CFFecha.CellFactoryEnCallBack=False
'		jamTableViewGestionVentas.SetCellFactory(CFFecha)
'		
'		Dim CFFecha As DatosCellFactoryJamTableView
'		CFFecha.Initialize
'		CFFecha.AliasCampoColumna="FechaRequerida"
'		CFFecha.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFechaSqlServer
'		CFFecha.CellFactoryEnCallBack=False
'		jamTableViewGestionVentas.SetCellFactory(CFFecha)
'		
'		
'		''
'		Dim CFFechaDisponibilidad As DatosCellFactoryJamTableView
'		CFFechaDisponibilidad.Initialize
'		CFFechaDisponibilidad.AliasCampoColumna="FechaDisponibilidad"
'		CFFechaDisponibilidad.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFecha
'		CFFechaDisponibilidad.CellFactoryEnCallBack=False
'		'lstCellfactories.Add(CFFechaDisponibilidad)
'		jamTableViewGestionVentas.SetCellFactory(CFFechaDisponibilidad)
		
		Dim CFFechaNAV As DatosCellFactoryJamTableView
		CFFechaNAV.Initialize
		CFFechaNAV.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFechaSqlServer
		CFFechaNAV.CellFactoryEnCallBack=False
		jamTableViewGestionVentas.SetCellFactoryListaCampos(CFFechaNAV, _
			Array("FechaDocumento", "FechaMaterial", "FechaPlanificada", "FechaPrometida", "FechaRequerida"))
			
		Dim CFFecha As DatosCellFactoryJamTableView
		CFFecha.Initialize
		CFFecha.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFecha
		CFFecha.CellFactoryEnCallBack=False
		jamTableViewGestionVentas.SetCellFactoryListaCampos(CFFecha, _
			Array("FechaPrevVentasDocumento"))
			
			
		Dim CFFechaV As DatosCellFactoryJamTableView
		CFFechaV.Initialize
		CFFechaV.NombreFuncionCellFactory="setFormatoColumnaFechaVencida"
		'CFFechaV.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFecha
		CFFechaV.CellFactoryEnCallBack=True
		'CFFechaV.CellFactoryEnCallBack=false
		Dim FechaHOY As Long=DateUtils.SetDate(DateTime.GetYear(DateTime.Now),DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now)) ' ticks de las 0 horas del dia actual (para eliminar horas, minutos , segundos)
		CFFechaV.params=Array(FechaHOY,"red","white")
		jamTableViewGestionVentas.SetCellFactoryListaCampos(CFFechaV, _
			Array("FechaDisponibilidad", "FechaPrevVentasLinea","FechaTeoricaEntrega"))	
		
		
		''
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		CF.CellFactoryEnCallBack=False
		'jamTableViewGestionVentas.SetCellFactoryListaCampos(CF, Array As String("Fabricacion", "Personalizado", "PedidoBloqueado", "PedidoAbierto", "Stand_By"))
		jamTableViewGestionVentas.SetCellFactoryListaCampos(CF, Array As String("Personalizado", "PedidoBloqueado", "PedidoAbierto", "Stand_By"))
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.NombreFuncionCellFactory="setColumnaBooleanaNumericaColorNOSITextoVacio"
		CF.CellFactoryEnCallBack=True
		CF.params=Array("orangered")
		jamTableViewGestionVentas.SetCellFactoryListaCampos(CF, Array As String("AlmOrigenGV"))
		
'		Dim CFFabricacion As DatosCellFactoryJamTableView
'		CFFabricacion.Initialize
'		CFFabricacion.AliasCampoColumna="Fabricacion"
'		'CFFabricacion.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaNumericaColorValor0ColorValor1
'		CFFabricacion.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'		CFFabricacion.CellFactoryEnCallBack=False
'		CFFabricacion.params=Array("red","black")
'		'lstCellfactories.Add(CFFabricacion)
'		jamTableViewGestionVentas.SetCellFactory(CFFabricacion)
'		
'		Dim CFPersonalizado As DatosCellFactoryJamTableView
'		CFPersonalizado.Initialize
'		CFPersonalizado.AliasCampoColumna="Personalizado"
'		'CFPersonalizado.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaNumericaColorValor0ColorValor1
'		CFPersonalizado.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'		CFPersonalizado.CellFactoryEnCallBack=False
'		CFPersonalizado.params=Array("black","#FF0000")
'		'lstCellfactories.Add(CFPersonalizado)
'		jamTableViewGestionVentas.SetCellFactory(CFPersonalizado)
'		'
'		Dim CFPedidoBloqueado As DatosCellFactoryJamTableView
'		CFPedidoBloqueado.Initialize
'		CFPedidoBloqueado.AliasCampoColumna="PedidoBloqueado"
'		'CFPedidoBloqueado.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaNumericaColorValor0ColorValor1
'		CFPedidoBloqueado.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'		CFPedidoBloqueado.CellFactoryEnCallBack=False
'		CFPedidoBloqueado.params=Array("red","black")
'		'lstCellfactories.Add(CFPedidoBloqueado)
'		jamTableViewGestionVentas.SetCellFactory(CFPedidoBloqueado)
'		
'		Dim CFPedidoAbierto As DatosCellFactoryJamTableView
'		CFPedidoAbierto.Initialize
'		CFPedidoAbierto.AliasCampoColumna="PedidoAbierto"
'		'CFPedidoAbierto.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaNumericaColorValor0ColorValor1
'		CFPedidoAbierto.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'		CFPedidoAbierto.CellFactoryEnCallBack=False
'		CFPedidoAbierto.params=Array("black","red")
'		'lstCellfactories.Add(CFPedidoBloqueado)
'		jamTableViewGestionVentas.SetCellFactory(CFPedidoAbierto)
		''
'		Dim CFPedidoBloqueado As DatosCellFactoryJamTableView
'		CFPedidoBloqueado.Initialize
'		CFPedidoBloqueado.AliasCampoColumna="Stand_By"
'		'CFPedidoBloqueado.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaNumericaColorValor0ColorValor1
'		CFPedidoBloqueado.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'		CFPedidoBloqueado.CellFactoryEnCallBack=False
'		CFPedidoBloqueado.params=Array("red","black")
'		'lstCellfactories.Add(CFPedidoBloqueado)
'		jamTableViewGestionVentas.SetCellFactory(CFPedidoBloqueado)
'		'
		''		'
'		Dim CFFechaCalculoActualCliente As DatosCellFactoryJamTableView
'		CFFechaCalculoActualCliente.Initialize
'		CFFechaCalculoActualCliente.AliasCampoColumna="FechaCalculoActualCliente"
'		CFFechaCalculoActualCliente.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaFecha
'		'lstCellfactories.Add(CFFechaCalculoActualCliente)
'		jamTableViewGestionVentas.SetCellFactory(CFFechaCalculoActualCliente)
'		
		Dim CFStatus As DatosCellFactoryJamTableView
		CFStatus.Initialize
		CFStatus.AliasCampoColumna="Status"
		CFStatus.NombreFuncionCellFactory="setFormatoColumnaStatus"
		CFStatus.CellFactoryEnCallBack=True
		jamTableViewGestionVentas.SetCellFactory(CFStatus)
		
'		Dim CFImportePendiente As DatosCellFactoryJamTableView
'		CFImportePendiente.Initialize
'		CFImportePendiente.AliasCampoColumna="ImportePendiente"
'		CFImportePendiente.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_NumeroDecimalesColumnaNumerica
'		CFImportePendiente.CellFactoryEnCallBack=False
'		CFImportePendiente.params=Array(2)
'		jamTableViewGestionVentas.SetCellFactory(CFImportePendiente)
		
				
		Dim CFNumCurrency As DatosCellFactoryJamTableView
		CFNumCurrency.Initialize
		CFNumCurrency.AliasCampoColumna="ImportePendiente"
		CFNumCurrency.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_FormatoMonedaColumnaNumerica
		CFNumCurrency.CellFactoryEnCallBack=False
		jamTableViewGestionVentas.SetCellFactory(CFNumCurrency)
		
		Dim CFNumDec2 As DatosCellFactoryJamTableView
		CFNumDec2.Initialize
		CFNumDec2.AliasCampoColumna="QtyPteNeta"
		CFNumDec2.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_FormatoStringDecimalesColumnaNumerica
		CFNumDec2.CellFactoryEnCallBack=False
		CFNumDec2.params=Array("#,##0.##")
		jamTableViewGestionVentas.SetCellFactory(CFNumDec2)
		
		Dim CFNumDec2 As DatosCellFactoryJamTableView
		CFNumDec2.Initialize
		CFNumDec2.AliasCampoColumna="StockLibre"
		CFNumDec2.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_FormatoStringDecimalesColumnaNumerica
		CFNumDec2.CellFactoryEnCallBack=False
		CFNumDec2.params=Array("#,##0.##")
		jamTableViewGestionVentas.SetCellFactory(CFNumDec2)
		
		
		
		
		
		Dim CFDesArt As DatosCellFactoryJamTableView
		CFDesArt.Initialize
		CFDesArt.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColumnaWrapText
		CFDesArt.CellFactoryEnCallBack=False
		jamTableViewGestionVentas.SetCellFactoryListaCampos(CFDesArt,Array As String("DescripcionArticulo","PedidoCliente","NombreCliente"))
		
'		Dim CFLinea As DatosCellFactoryJamTableView
'		CFLinea.Initialize
'		CFLinea.AliasCampoColumna="Linea"
'		CFLinea.NombreFuncionCellFactory="setEditCellFactory"
'		CFLinea.CellFactoryEnCallBack=False
'		jamTableViewGestionVentas.SetCellFactory(CFLinea)
		
		
		jamTableViewGestionVentas.ToolTipTableColumn("Status","L:Linea Completa." & CRLF & _
			"P:Pedido Completo" & CRLF & "+: Diponible acum>=0" & CRLF & "-: Diponible acum<0")

		jamTableViewGestionVentas.TableViewEditable=True
		
		'jamTableViewGestionVentas.SetNodoFocusTraversable(btnSalir,False)
		
		jamTableViewGestionVentas.AlturaFilas=0
		
		jamTableViewGestionVentas.ToolTipTableColumnColorFondoColorTextoSizeFont("FechaTeoricaEntrega","Fecha Material, si existe, y si no existe, Fecha de documento+Plazo configurado según Artículo-Cliente-GRP-Ruta)", _
			"BLACK","LIGHTYELLOW",14)

	
	Inicio
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub btnSalir_Click
	BorrarVBSScriptDireccionRemitenteEmailOutlookREPSOL
	BorrarVBSScriptEnvioEmailOutlookREPSOL
	jamTableViewGestionVentas.GuardarConfiguracionColumnasUsuario
	'jamTableViewGestionVentas.LiberarRecursosTableView
	'frm.RootPane.RemoveAllNodes
	jamTableViewGestionVentas.LimpiarTabla
	MainMenu2.Show
	frm.Close
End Sub


'Sub BorrarVBSScriptDireccionRemitenteEmailOutlookRepsol
'	If File.Exists(xui.DefaultFolder,"smfpromc.vbs") Then
'		File.Delete(xui.DefaultFolder,"smfpromc.vbs")
'	End If
'End Sub
'
'Sub BorrarVBSScriptEnvioEmailOutlookRepsol
'	If File.Exists(xui.DefaultFolder,"smfpromc2.vbs") Then
'		File.Delete(xui.DefaultFolder,"smfpromc2.vbs")
'	End If
'End Sub



Sub Inicio
	frm.Show
	Utilidades.SetFormMaximized(frm)
	ResfreshDatosGestionVentas
End Sub

Sub jamTableViewGestionVentas_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "Actualizar"
			ResfreshDatosGestionVentas
		Case "PrevisionSemanalVentas"
			GenerarExcelPrevisionSemanalVentas
		
		Case "EnviarEmailAlbaranTransnaturREPSOL"
			JamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cRepsol")) complete (sRes As String)
			JamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return

			JamLoadingIndicator1.MensajeLoading="Cargando configuración..."
			JamLoadingIndicator1.Show
	
			Wait For(CargaRepsolConfiguracionLogisticaAlbaranesVenta) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then
				JamLoadingIndicator1.Close
				'SalirModulo
				Return
			End If
			Dim mData As Map=mRes.Get("mDataConf")
			CarpetaFicherosCSVRepsol=mData.Get("CampoString1")
			CarpetaFicherosPDFRepsol=mData.Get("CampoString5")
			BuzonCompartidoEmailEnvioInfoRepsol=mData.Get("CampoString2")
			DireccionDestinoEmailsRepsol=mData.Get("CampoString3")
			DireccionCCDestinoEmailsRepsol=mData.Get("CampoString4")
	
			BorrarVBSScriptDireccionRemitenteEmailOutlookREPSOL
			BorrarVBSScriptEnvioEmailOutlookREPSOL
	
			CrearVBSScriptDireccionRemitenteEmailOutlookREPSOL
			CrearVBSScriptEnvioEmailOutlookHTMLREPSOL
	
			JamLoadingIndicator1.close

			wait for(SeleccionarDocumentoREPSOL) complete (DocumentoSeleccionado As String)
			If DocumentoSeleccionado="" Then Return
			
			CrearEmailInfoLogistica(DocumentoSeleccionado)
	End Select
End Sub


Sub ResfreshDatosGestionVentas
	
	jamTableViewGestionVentas.EstadoLabelSalirJamTableView(False)
	'Dim CalcularFechas As Boolean
	Dim msa As Object = xui.Msgbox2Async("¿Calcular datos de fechas estimadas?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (Result As Int)
	CalcularFechas=Result=xui.DialogResponse_Positive
	
	jamTableViewGestionVentas.SetColumnaVisible("PlazoTeoricoFabLinea",CalcularFechas)
	jamTableViewGestionVentas.SetColumnaVisible("FechaTeoricaEntrega",CalcularFechas)
	jamTableViewGestionVentas.SetColumnaVisible("FechaDisponibilidad",CalcularFechas)
	jamTableViewGestionVentas.SetColumnaVisible("FechaPrevVentasLinea",CalcularFechas)
	jamTableViewGestionVentas.SetColumnaVisible("FechaPrevVentasLineaVencida",CalcularFechas)
	jamTableViewGestionVentas.SetColumnaVisible("FechaPrevVentasDocumento",CalcularFechas)
	
	If mSQLGestionventas.IsInitialized Then
		mSQLGestionventas.Close
	End If
	
	jamTableViewGestionVentas.HabilitarJamTableView(False)
	'mSQLGestionventas.InitializeSQLite(xui.DefaultFolder,"SQLGestionVentas.db",True)
	mSQLGestionventas.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	CrearTablasSQLite
	
	jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.WAIT)
	wait for(ActualizacionDatos) complete (Accion As String)
	'Wait For ActualizacionDatos_Completed(Accion As String)
	
	jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.DEFAULT)
	If Accion="Salir" Then
		MainMenu2.Show
		frm.Close
		'CallSubDelayed(mCallback,"show")
		Return
	End If
	
	Dim cF As DatosCellFactoryJamTableView
	cF.Initialize
	cF.AliasCampoColumna="QtyDisponibleAcum"
	cF.NombreFuncionCellFactory=jamTableViewGestionVentas.CellFactory_ColorValorMenorColorValorMayorIgualColumna
	'lstCellfactories.Add(CFFechaCalculoActualCliente)
	cF.CellFactoryEnCallBack=True
	cF.params=Array(0,"Red","Green","#,##0.##")
'	Dim EstiloCelda As EstiloCeldaJamTableView
'	EstiloCelda.Initialize
'	EstiloCelda.Alineacion=c.AlineacionColumna
'	EstiloCelda.AnchoBorde=c.AnchoBordeCelda
'	EstiloCelda.ColorBorde=c.ColorBordeCelda
'	EstiloCelda.ColorFondo=c.ColorFondoCelda
'	EstiloCelda.ColorTexto=c.ColorTextoCelda
'	EstiloCelda.EstiloFuente=FontStyle_Normal
'	EstiloCelda.TamanoFuente=mFontSizeCeldas
	jamTableViewGestionVentas.SetCellFactory(cF)
	
	jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.WAIT)
	Dim rsData As ResultSet=mSQLGestionventas.ExecQuery("select * from tblGestionVentas")
	Dim rSub As ResumableSub=jamTableViewGestionVentas.setdata(rsData)
	wait for (rSub) complete (mRes As Map)
	jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.DEFAULT)
	rsData.Close
	Log(mRes)
	
	jamTableViewGestionVentas.EstadoLabelSalirJamTableView(True)
	jamTableViewGestionVentas.HabilitarJamTableView(True)
	If Not(mRes.Get("FlagOK")) Then
		If ""<>mRes.Get("msgAviso") Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
		If ""<>mRes.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewGestionVentas.AbrirCamposBuilder
				Return

			End If
			#End If
			ExitApplication
		End If
	End If

	mSQLGestionventas.close
	'TimerMemoryFullTest.Enabled=True
End Sub

'Sub TimerMemoryFullTest_Tick
'	TimerMemoryFullTest.Enabled=False
'	mSQLGestionventas.InitializeSQLite(File.DirData(B4XPages.MainPage.NombreAplicacion),"SQLGestionVentas.db",True)
'	CrearTablasSQLite
'	wait for(ActualizacionDatos) complete (Accion As String)
'	'Wait For ActualizacionDatos_Completed(Accion As String)
'	
'	If Accion="Salir" Then
'		
'		B4XPages.ClosePage(Me)
'		B4XPages.ShowPage("MenuPage")
'		Return
'	End If
'	Dim rsData As ResultSet=mSQLGestionventas.ExecQuery("select * from tblGestionVentas")
'	Dim rSub As ResumableSub=jamTableViewGestionVentas.setdata(rsData)
'	wait for (rSub) complete (mRes As Map)
'	rsData.Close
'	TimerMemoryFullTest.Enabled=True
'End Sub


Sub CrearTablasSQLite
'	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblArticulosGestionVentasVendedor"))
'	If ntFP>0 Then
'		mSQLGestionventas.ExecNonQuery("drop table tblArticulosGestionVentasVendedor")
'	End If
	'mSQLGestionventas.ExecNonQuery("CREATE TABLE IF NOT EXISTS tblArticulosGestionVentasVendedor (Articulo TEXT , Talla TEXT)")
	
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblFechasPrometidasCompra"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblFechasPrometidasCompra")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblFechasPrometidasCompra (")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Linea INTEGER,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaProm INTEGER,")
	sbCrearTabla.Append("FechaPromAj INTEGER,")
	sbCrearTabla.Append("Almacen TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmacenGV INTEGER,")
	sbCrearTabla.Append("QtyPteRecibir INTEGER,")
	sbCrearTabla.Append("sFechaProm TEXT)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblPedidosCompraRecibidosPtesRecepcionar"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblPedidosCompraRecibidosPtesRecepcionar")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblPedidosCompraRecibidosPtesRecepcionar (")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Linea INTEGER,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("QtyARecepcionar INTEGER)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion (")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("TQtyPte INTEGER,")
	sbCrearTabla.Append("FechaVencimiento INTEGER,")
	sbCrearTabla.Append("FechaVencimientoAj INTEGER,")
	sbCrearTabla.Append("sFechaProm TEXT)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)

	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblStockDisponibleArticuloTallaFecha"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblStockDisponibleArticuloTallaFecha")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleArticuloTallaFecha (")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha INTEGER,")
	sbCrearTabla.Append("QtyDisponible INTEGER,")
	sbCrearTabla.Append("sFecha TEXT)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	

	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblStockDisponibleArticuloTallaFechaAlmacenesNoGV"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblStockDisponibleArticuloTallaFechaAlmacenesNoGV")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleArticuloTallaFechaAlmacenesNoGV (")
	sbCrearTabla.Append("Almacen TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha INTEGER,")
	sbCrearTabla.Append("QtyDisponible INTEGER,")
	sbCrearTabla.Append("sFecha TEXT)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblStockDisponibleAcumuladoArticuloTallaFecha"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblStockDisponibleAcumuladoArticuloTallaFecha")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleAcumuladoArticuloTallaFecha (")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha INTEGER,")
	sbCrearTabla.Append("QtyDisponible INTEGER,")
	sbCrearTabla.Append("QtyDisponibleAcumulada INTEGER,")
	sbCrearTabla.Append("sFecha TEXT)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV (")
	sbCrearTabla.Append("Almacen TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha INTEGER,")
	sbCrearTabla.Append("QtyDisponible INTEGER,")
	sbCrearTabla.Append("QtyDisponibleAcumulada INTEGER,")
	sbCrearTabla.Append("sFecha TEXT)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblReservasDocumentoAlmZen"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblReservasDocumentoAlmZen")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblReservasDocumentoAlmZen (")
	sbCrearTabla.Append("IDEmbalajeReserva TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmacenFisico TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DocumentoReserva TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("IDEmbalajeReservaDocumento INTEGER,")
	sbCrearTabla.Append("LoteRecepcion INTEGER,")
	sbCrearTabla.Append("Estado INTEGER,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Qty REAL)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	
	
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblGestionVentasCalculos"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblGestionVentasCalculos")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblGestionVentasCalculos (")
	sbCrearTabla.Append("IDPrioridad INTEGER,")
	sbCrearTabla.Append("IDPrioridadUsuario INTEGER,")
	sbCrearTabla.Append("CodigoResponsableCuenta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CodigoVendedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreVendedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaDocumento INTEGER,")
	sbCrearTabla.Append("FechaPrometida INTEGER,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("GRP TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreGRP TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DirEnv TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CiudadDirEnvio TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("PedidoCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Stand_By INTEGER,")
	sbCrearTabla.Append("PedidoBloqueado INTEGER,")
	sbCrearTabla.Append("PedidoAbierto INTEGER,")
	sbCrearTabla.Append("Linea INTEGER,")
	sbCrearTabla.Append("AlmOrigen TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmOrigenGV INTEGER DEFAULT 0,")
	sbCrearTabla.Append("AlmDest TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Personalizado INTEGER,")
	sbCrearTabla.Append("Fabricacion INTEGER,")
	sbCrearTabla.Append("CompraFab TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Dual INTEGER,")
	sbCrearTabla.Append("Ruta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("PlazoRuta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("RutaDual TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("PlazoRutaDual TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("ArticuloCorte TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("RutaAplicable TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("PlazoRutaAplicable INTEGER DEFAULT 0,")
	sbCrearTabla.Append("PlazoTeoricoFabLinea INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaTeoricaFabLinea INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaMaterial INTEGER,")
	sbCrearTabla.Append("FechaPlanificada INTEGER,")
	sbCrearTabla.Append("FechaRequerida INTEGER,")
	sbCrearTabla.Append("FechaTeoricaEntrega INTEGER DEFAULT 0,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("QtyPte INTEGER,")
	sbCrearTabla.Append("Reserva INTEGER,")
	sbCrearTabla.Append("QtyPteNeta INTEGER,")
	sbCrearTabla.Append("StockLibre INTEGER,")
	sbCrearTabla.Append("StockAlmNoGV INTEGER DEFAULT 0,")
	sbCrearTabla.Append("QtyPteNetaAcum INTEGER DEFAULT 0,")
	sbCrearTabla.Append("QtyDisponibleAcum INTEGER DEFAULT 0,")
'	sbCrearTabla.Append("QtyPteNetaAcumAlmNoGV INTEGER DEFAULT 0,")
'	sbCrearTabla.Append("QtyDisponibleAcumAlmNoGV INTEGER DEFAULT 0,")
	sbCrearTabla.Append("Status TEXT,")
	sbCrearTabla.Append("ReservaAlmacen INTEGER,")
	sbCrearTabla.Append("ImportePendiente REAL,")
	sbCrearTabla.Append("FechaCalculoActualCliente INTEGER,")
	sbCrearTabla.Append("FechaDisponibilidad INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaDisponibilidadVencida TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("FechaPrevVentasLinea INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaPrevVentasLineaVencida TEXT COLLATE NOCASE default '',")
	'sbCrearTabla.Append("SemanaPrevVentasLinea TEXT default '',")
	sbCrearTabla.Append("FechaPrevVentasDocumento INTEGER DEFAULT 0)")
	'sbCrearTabla.Append("SemanaPrevVentasDocumento TEXT default '')")
	
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE INDEX idxArticuloTallatblGestionVentasCalculos ")
	sbCrearTabla.Append("ON tblGestionVentasCalculos (Articulo, Talla)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblGestionVentas"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblGestionVentas")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblGestionVentas (")
	sbCrearTabla.Append("IDPrioridad INTEGER,")
	sbCrearTabla.Append("IDPrioridadUsuario INTEGER,")
	sbCrearTabla.Append("CodigoResponsableCuenta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CodigoVendedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreVendedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaDocumento INTEGER,")
	sbCrearTabla.Append("FechaPrometida INTEGER,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("GRP TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreGRP TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DirEnv TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CiudadDirEnvio TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("PedidoCliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Stand_By INTEGER,")
	sbCrearTabla.Append("PedidoBloqueado INTEGER,")
	sbCrearTabla.Append("PedidoAbierto INTEGER,")
	sbCrearTabla.Append("Linea INTEGER,")
	sbCrearTabla.Append("AlmOrigen TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("AlmOrigenGV INTEGER DEFAULT 0,")
	sbCrearTabla.Append("AlmDest TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Personalizado INTEGER,")
	sbCrearTabla.Append("Fabricacion INTEGER,")
	sbCrearTabla.Append("CompraFab TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Dual INTEGER,")
	sbCrearTabla.Append("Ruta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("PlazoRuta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("RutaDual TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("PlazoRutaDual TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("ArticuloCorte TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("RutaAplicable TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("PlazoRutaAplicable INTEGER DEFAULT 0,")
	sbCrearTabla.Append("PlazoTeoricoFabLinea INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaTeoricaFabLinea INTEGER DEFAULT 0,")
	sbCrearTabla.Append("FechaMaterial INTEGER,")
	sbCrearTabla.Append("FechaPlanificada INTEGER,")
	sbCrearTabla.Append("FechaRequerida INTEGER,")
	sbCrearTabla.Append("FechaTeoricaEntrega INTEGER DEFAULT 0,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("QtyPte INTEGER,")
	sbCrearTabla.Append("Reserva INTEGER,")
	sbCrearTabla.Append("StockLibre INTEGER,")
	sbCrearTabla.Append("StockAlmNoGV INTEGER default 0,")
	sbCrearTabla.Append("QtyPteNeta INTEGER,")
	sbCrearTabla.Append("QtyPteNetaAcum INTEGER default 0,")
	sbCrearTabla.Append("QtyDisponibleAcum INTEGER default 0,")
	sbCrearTabla.Append("Status TEXT,")
	sbCrearTabla.Append("ReservaAlmacen INTEGER,")
	sbCrearTabla.Append("QtyPteRecibir REAL default 0,")
	sbCrearTabla.Append("ImportePendiente REAL,")
	sbCrearTabla.Append("FechaCalculoActualCliente INTEGER,")
	sbCrearTabla.Append("FechaDisponibilidad INTEGER default 0,")
	sbCrearTabla.Append("FechaDisponibilidadVencida TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("FechaPrevVentasLinea INTEGER default 0,")
	sbCrearTabla.Append("FechaPrevVentasLineaVencida TEXT COLLATE NOCASE default '',")
	'sbCrearTabla.Append("SemanaPrevVentasLinea TEXT default '',")
	sbCrearTabla.Append("FechaPrevVentasDocumento INTEGER default 0)")
	'sbCrearTabla.Append("SemanaPrevVentasDocumento TEXT default '')")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE INDEX idxArticuloTallatblGestionVentas ")
	sbCrearTabla.Append("ON tblGestionVentas (Articulo, Talla)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblConfPlazoFechaEntregaPlan"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblConfPlazoFechaEntregaPlan")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlan (")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("GRP TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Ruta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Plazo INTEGER)")
	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
'	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblConfPlazoFechaEntregaPlan"))
'	If ntFP>0 Then
'		mSQLGestionventas.ExecNonQuery("drop table tblConfPlazoFechaEntregaPlan")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlan (")
'	sbCrearTabla.Append("ArticuloClienteRuta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("ArticuloCliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("ArticuloGRPRuta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("ArticuloGRP TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("ArticuloRuta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("ClienteRuta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("GRPRuta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("GRP TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Ruta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Plazo INTEGER)")
'	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	

	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblConfPlazoFechaEntregaPlanArticulosCorteGV"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblConfPlazoFechaEntregaPlanArticulosCorteGV")
	End If
	
	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblConfPlazoFechaEntregaPlanArticulosFabGV"))
	If ntFP>0 Then
		mSQLGestionventas.ExecNonQuery("drop table tblConfPlazoFechaEntregaPlanArticulosFabGV")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlanArticulosFabGV (")
	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Linea INTEGER,")
	sbCrearTabla.Append("FechaDocumento Long,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("GRP TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Ruta TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Plazo1 INTEGER,")
	sbCrearTabla.Append("Plazo2 INTEGER,")
	sbCrearTabla.Append("Plazo3 INTEGER,")
	sbCrearTabla.Append("Plazo4 INTEGER,")
	sbCrearTabla.Append("Plazo5 INTEGER,")
	sbCrearTabla.Append("Plazo6 INTEGER,")
	sbCrearTabla.Append("Plazo7 INTEGER,")
	sbCrearTabla.Append("Plazo8 INTEGER,")
	sbCrearTabla.Append("Plazo9 INTEGER,")
	sbCrearTabla.Append("Plazo10 INTEGER,")
	sbCrearTabla.Append("PlazoRutaAplicable INTEGER DEFAULT 0,")
	sbCrearTabla.Append("PlazoArtLinea INTEGER,")
	sbCrearTabla.Append("FechaDocumentoMasPlazoArtLinea Long)")

	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
'	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblGestionVentasVendedor"))
'	If ntFP>0 Then
'		mSQLGestionventas.ExecNonQuery("drop table tblGestionVentasVendedor")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblGestionVentasVendedor (")
'	sbCrearTabla.Append("CodigoResponsableCuenta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaDocumento INTEGER,")
'	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("DirEnv TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("CiudadDirEnvio TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("PedidoCliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Linea INTEGER,")
'	sbCrearTabla.Append("AlmOrigen TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("AlmDest TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Personalizado INTEGER,")
'	sbCrearTabla.Append("Fabricacion INTEGER,")
'	sbCrearTabla.Append("Ruta TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("QtyPte INTEGER,")
'	sbCrearTabla.Append("Reserva INTEGER,")
'	sbCrearTabla.Append("QtyPteNeta INTEGER,")
'	sbCrearTabla.Append("QtyPteNetaAcumArtVar INTEGER,")
'	sbCrearTabla.Append("FechaDisponibilidad INTEGER)")
'	Log("sb tblGestionVentasVendedor " & CRLF & sbCrearTabla.ToString)
'	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	
	
End Sub

Sub ActualizacionDatos As ResumableSub
	
	mSQLGestionventas.AddNonQueryToBatch("delete from tblGestionVentas",Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
'	If Main.CodVendedorSeleccionado<>"" Then
'		NombreVendedor(Main.CodVendedorSeleccionado)
'		Wait For NombreVendedor_Completed (Accion As String ,lstRegNomVend As List)
'		If Accion="Salir" Or Accion="SinDatos" Then
'			Return Accion
'		End If
'		txtCodigoVendedor.Text=Main.CodVendedorSeleccionado
'		Dim mreg As Map=lstRegNomVend.Get(0)
'		txtNombreVendedor.Text=mreg.Get("Nombre")
'	End If
	
	'JAWTMemoryReport.LogJVMMemoryInfo("despues de NombreVendedor")
	
	' Datos de Gestion de ventas total desde navision. YA VIENE ORDENADA POR FECHA-DOCUMENTO
	DatosGestionVentas
	Wait For DatosGestionVentas_Completed (Accion As String ,lstRegGV As List)
	If Accion="Salir" Then
'		B4XPages.ClosePage(Me)
'		B4XPages.ShowPage("MenuPage")
		Return Accion
	End If
	
	'JAWTMemoryReport.LogJVMMemoryInfo("despues de DatosGestionVentas")
	
	'mSQLGestionventas.ExecNonQuery("delete from tblGestionVentasCalculos")
	
	mSQLGestionventas.AddNonQueryToBatch("delete from tblGestionVentasCalculos",Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	DBUtils.InsertMaps(mSQLGestionventas, "tblGestionVentasCalculos",lstRegGV)
	
	Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblGestionVentasCalculos")
	If regIns<>lstRegGV.Size Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
		Wait For (msa) Msgbox_Result
	End If
	
	lstRegGV.Clear
	
	'14/10/21 reunion Begoña/Henry
	' eliminar el almacen 0026 (pedidos bloqueados)
	'mSQLGestionventas.ExecNonQuery2("delete from tblGestionVentasCalculos where AlmOrigen=?", Array As Object("0026"))
	mSQLGestionventas.AddNonQueryToBatch("delete from tblGestionVentasCalculos where AlmOrigen=?", Array As Object("0026"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	
	'JAWTMemoryReport.LogJVMMemoryInfo("despues de DBUtils.InsertMaps(mSQLGestionventas, tblGestionVentas,lstRegGV)")
	
	'''	If Main.CodVendedorSeleccionado<>"" Then
	'''		' eliminación de la tabla de Gestion de ventas de los registros que no sean articulos-tallas de las líneas del vendedor
	'''		'(pueden quedar lineas de otros vendendores, siempre que tengan los mismos articulos-tallas que las lineas del vendedor)
	'''		Dim sb As StringBuilder
	'''		sb.Initialize
	'''		sb.Append("delete from tblGestionVentasCalculos as t1 where Not exists (")
	'''		sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos as t2 where CodigoVendedor=? And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
	'''		mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Array(Main.CodVendedorSeleccionado))
	'''		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	'''		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	'''		Log("NonQuery: " & Success)
	'''		If Not(Success) Then
	'''			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
	'''			Wait For (msa) Msgbox_Result
	'''			Accion="Salir"
	'''			Return Accion
	'''		Else
	'''			Log("Success delete from tblGestionVentasCalculos")
	'''		End If
	'''	End If
	'''
	
	'Actualizar campo CompraFab
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set CompraFab = iif(Fabricacion=0,?,?)")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("Compra","Fab"))

	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	

	Dim FechaHOY As Long=DateUtils.SetDate(DateTime.GetYear(DateTime.Now),DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now)) ' ticks de las 0 horas del dia actual (para eliminar horas, minutos , segundos)
	Dim DateTimeFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaHOY As String=DateTime.Date(FechaHOY)
	Log("sFECHA " & sFechaHOY)
	DateTime.DateFormat=DateTimeFormatAnt

	'mSQLGestionventas.ExecNonQuery("delete from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV")
	mSQLGestionventas.AddNonQueryToBatch("delete from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV",Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	wait for (ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		Return Accion
	End If
	Dim lstRegStockAlmNoGV As List=mRes.Get("lstRegistros")
	If lstRegStockAlmNoGV.Size>0 Then
		For Each mStNoGV As Map In lstRegStockAlmNoGV
			Dim QStock As Int=mStNoGV.Get("Stock")
			mSQLGestionventas.AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV (Almacen, Articulo, Talla, Fecha, QtyDisponible, sFecha) values (?,?,?,?,?,?)", _
				Array(mStNoGV.Get("AlmOrigenDoc"), mStNoGV.Get("Articulo"), mStNoGV.Get("Talla"), FechaHOY, QStock, sFechaHOY))
		Next

		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
	End If
	
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos as t1 set StockAlmNoGV = ifnull((Select Stock from (Select Almacen, Articulo, Talla, QtyDisponible As Stock from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV) t2 ")
	sb.Append(" where t1.AlmOrigenGV=0 And t1.AlmOrigen=t2.Almacen And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla),0)")
	
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Stock Alm No GV")
	End If

	' Insercion en la tabla de disponibles, del stock actual de los artículos-tallas del vendedor, como si fuera 1 entrada a fecha = fecha actual
	'mSQLGestionventas.ExecNonQuery("delete from tblStockDisponibleArticuloTallaFecha")
	mSQLGestionventas.AddNonQueryToBatch("delete from tblStockDisponibleArticuloTallaFecha",Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)

'	If Main.CodVendedorSeleccionado<>"" Then
'		mSQLGestionventas.AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFecha select distinct Articulo, Talla, " & FechaHOY & ", StockLibre, '" & sFecha & "' from tblGestionVentasCalculos where StockLibre>0 and CodigoVendedor=?", Array As String(Main.CodVendedorSeleccionado))
'	Else
	mSQLGestionventas.AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFecha select distinct Articulo, Talla, " & FechaHOY & ", StockLibre, '" & sFechaHOY & "' from tblGestionVentasCalculos where StockLibre>0",Null)
'	End If
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success insert into tblStockDisponibleArticuloTallaFecha (Stock libre-> fecha hoy)")
	End If
	
	' Running Sum de QtyPteNeta en GestionVentas por artículo-talla  (Lineas AlmOrigen pertenecientes a "Almacenes GV")
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set QtyPteNetaAcum = ")
	sb.append("(Select sum(QtyPteNeta) from tblGestionVentasCalculos t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and AlmOrigenGV=1)")
	sb.Append(" where AlmOrigenGV=1")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos  Running Sum de QtyPteNeta en GestionVentas por artículo-talla")
	End If
	
	' Running Sum de QtyPteNeta en GestionVentas por artículo-talla  (Lineas AlmOrigen NO pertenecientes a "Almacenes GV". POR ALMACEN de la LINEA)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set QtyPteNetaAcum = ")
	sb.append("(Select sum(QtyPteNeta) from tblGestionVentasCalculos t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and t1.AlmOrigen=t2.AlmOrigen)")
	sb.Append(" where AlmOrigenGV=0")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos  Running Sum de QtyPteNeta en GestionVentas por artículo-talla  almNoGV")
	End If
	
	
	
	' Running Sum Repartiendo Primero el stock del almacen de la linea cuando es distinto de almacenesGV
	
	
	
	'mSQLGestionventas.ExecNonQuery("update tblGestionVentas as t1 set QtyDisponibleAcum=(select (t2.StockLibre-t2.QtyPteNetaAcum) as Dp from tblGestionVentas as t2 where t2.Documento=t1.Documento and t2.Linea=t1.Linea)")

	' Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla  (Alm linea perteneciente a "Almacenes GV")
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set QtyDisponibleAcum = ")
	'sb.append("(Select (StockLibre-QtyPteNetaAcum) from tblGestionVentas t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
	sb.append("(Select (StockLibre-QtyPteNetaAcum) from tblGestionVentasCalculos t2 where t2.ROWID=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and AlmOrigenGV=1)")
	sb.Append(" where AlmOrigenGV=1")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla")
	End If
	
	
	' Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla  (almacen linea no perteneciente a Almacenes GV)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set QtyDisponibleAcum = ")
	'sb.append("(Select (StockLibre-QtyPteNetaAcum) from tblGestionVentas t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
	sb.append("(Select (StockAlmNoGV-QtyPteNetaAcum) from tblGestionVentasCalculos t2 where t2.ROWID=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
	sb.Append(" where AlmOrigenGV=0")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla")
	End If
	
	' Actualizar STATUS líneas


	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos set Status = ?")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String(""))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Limpiar Status")
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set Status = ?")
	sb.append(" where (StockLibre-QtyPteNeta)>=0 and QtyDisponibleAcum>=0 and AlmOrigenGV=1")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("L+"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Status L+")
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set Status = ?")
	sb.append(" where (StockAlmNoGV-QtyPteNeta)>=0 and QtyDisponibleAcum>=0 and AlmOrigenGV=0")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("L+"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Status L+")
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set Status = ?")
	sb.append(" where (StockLibre-QtyPteNeta)>=0 and QtyDisponibleAcum<0  and AlmOrigenGV=1")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("L-"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Status L-")
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos As t1 set Status = ?")
	sb.append(" where (StockAlmNoGV-QtyPteNeta)>=0 and QtyDisponibleAcum<0 and AlmOrigenGV=0")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("L-"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Status L-")
	End If
	
	' Actualizar Pedidos Completos
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("UPDATE tblGestionVentasCalculos SET STATUS=? WHERE Documento in (")
	sb.Append("Select tLineasDoc.Documento ")
	sb.append("FROM ")
	sb.append("(Select Documento, count(Linea) As NumLineas from tblGestionVentasCalculos group by Documento) tLineasDoc ")
	sb.append("LEFT JOIN ")
	sb.append("(Select Documento, count(Linea) As NumLineasCompletas FROM tblGestionVentasCalculos WHERE Status='L+' GROUP BY Documento) tLineasDocCompletas ")
	sb.append("USING (Documento) ")
	sb.append("WHERE  tLineasDoc.NumLineas=coalesce(tLineasDocCompletas.NumLineasCompletas,0))")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("P+"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Status P+")
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("UPDATE tblGestionVentasCalculos SET STATUS=? WHERE Documento in (")
	sb.Append("Select tLineasDoc.Documento ")
	sb.append("FROM ")
	sb.append("(Select Documento, count(Linea) As NumLineas from tblGestionVentasCalculos group by Documento) tLineasDoc ")
	sb.append("LEFT JOIN ")
	sb.append("(Select Documento, count(Linea) As NumLineasCompletas FROM tblGestionVentasCalculos WHERE Status='L+' or Status='L-' GROUP BY Documento) tLineasDocCompletas ")
	sb.append("USING (Documento) ")
	sb.append("LEFT JOIN ")
	sb.append("(Select Documento, count(Linea) As NumLineasCompletasDispNeg FROM tblGestionVentasCalculos WHERE Status='L-' GROUP BY Documento) tLineasDocCompletasDispNeg ")
	sb.append("USING (Documento) ")
	sb.append("WHERE  tLineasDoc.NumLineas=coalesce(tLineasDocCompletas.NumLineasCompletas,0) and coalesce(tLineasDocCompletasDispNeg.NumLineasCompletasDispNeg,0)>0)")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("P-"))
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos Status P-")
	End If
	
	mSQLGestionventas.ExecNonQuery("delete from tblReservasDocumentoAlmZen")
	Wait For (ReservasDocumentoAlmZenProin) complete (mRes As Map)
	If mRes.Get("Accion")="Salir" Then
		Accion="Salir"
		Return Accion
	End If
	Dim lstRegResAlmZen As List=mRes.Get("lstRegistros")
	
	DBUtils.InsertMaps(mSQLGestionventas, "tblReservasDocumentoAlmZen",lstRegResAlmZen)
'	Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblFechasPrometidasCompra")
'	If regIns<>lstRegResAlmZen.Size Then
'		Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
'		Wait For (msa) Msgbox_Result
'	End If
	lstRegResAlmZen.Clear
	
	
	Wait For (ReservasDocumentoAlmZenProtec) complete (mRes As Map)
	If mRes.Get("Accion")="Salir" Then
		Accion="Salir"
		Return Accion
	End If
	Dim lstRegResAlmZen As List=mRes.Get("lstRegistros")
	
	DBUtils.InsertMaps(mSQLGestionventas, "tblReservasDocumentoAlmZen",lstRegResAlmZen)
'	Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblFechasPrometidasCompra")
'	If regIns<>lstRegResAlmZen.Size Then
'		Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
'		Wait For (msa) Msgbox_Result
'	End If
	lstRegResAlmZen.Clear
	
	
	'''''' OJOOOOO  , pendiente de hacer un running sum ... puede haber varias lineas del mismo pedido con el mismo artículo-talla (habria que repartir por linea ...)
	Dim sb As StringBuilder
	sb.Initialize
	sb.append("update tblGestionVentasCalculos as t1 set ReservaAlmacen = ifnull((Select QtyReservaAlmZen from ")
	sb.append("(Select DocumentoReserva, Articulo, Talla, Sum(qty) As QtyReservaAlmZen from tblReservasDocumentoAlmZen group by DocumentoReserva, Articulo, Talla) t2 ")
	sb.append("where t1.Documento=t2.DocumentoReserva And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla),0)")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentasCalculos reservasAlmzen")
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblGestionVentasCalculos set IDPrioridad=ROWID, IDPrioridadUsuario=ROWID")
	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update IDPrioridadUsuario")
	End If
	
	
	'*****************
	If CalcularFechas Then
	

	
		' datos de Fechas Prometidas, todas, desde navision. Ya incluye el ajuste de sumar 1 dia, o si está vencida, hoy + 1 dia
		FechasPrometidasCompras
		Wait For FechasPrometidasCompras_Completed (Accion As String ,lstRegFP As List)
		If Accion="Salir" Then
'		B4XPages.ClosePage(Me)
'		B4XPages.ShowPage("MenuPage")
			Return Accion
		End If
		mSQLGestionventas.ExecNonQuery("delete from tblFechasPrometidasCompra")
		DBUtils.InsertMaps(mSQLGestionventas, "tblFechasPrometidasCompra",lstRegFP)
		Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblFechasPrometidasCompra")
		If regIns<>lstRegFP.Size Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
			Wait For (msa) Msgbox_Result
		End If
		lstRegFP.Clear
	
		PedidosComprasRecibidosPtesRecepcionar
		Wait For PedidosComprasRecibidosPtesRecepcionar_Completed (Accion As String ,lstRegPCRec As List)
		If Accion="Salir" Then
'		B4XPages.ClosePage(Me)
'		B4XPages.ShowPage("MenuPage")
			Return Accion
		End If
		mSQLGestionventas.ExecNonQuery("delete from tblPedidosCompraRecibidosPtesRecepcionar")
		DBUtils.InsertMaps(mSQLGestionventas, "tblPedidosCompraRecibidosPtesRecepcionar",lstRegPCRec)
		Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblPedidosCompraRecibidosPtesRecepcionar")
		If regIns<>lstRegPCRec.Size Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
			Wait For (msa) Msgbox_Result
		End If
		lstRegPCRec.Clear
	

		'Eliminacion de la tabla de fechas prometidas, para los articulos-tallas que no estén en las lineas de Gestion de ventas
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("delete from tblFechasPrometidasCompra As t1 where Not exists (")
'		If Main.CodVendedorSeleccionado<>"" Then
'			sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where CodigoVendedor=? And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
'			mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Array(Main.CodVendedorSeleccionado))
'		Else
		sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Null)
'		End If
	
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success delete from tblFechasPrometidasCompra arts-tallas no en GV")
		End If
	
	
		mSQLGestionventas.ExecNonQuery("update tblFechasPrometidasCompra set sFechaProm=DATE(ROUND(FechaProm / 1000), 'unixepoch') ")
	
	
		'Eliminacion de la tabla de pedidos compra ptes recepcionar, para los articulos-tallas que no estén en las lineas de Gestion de ventas para el vendedor concreto
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("delete from tblPedidosCompraRecibidosPtesRecepcionar As t1 where Not exists (")
'		If Main.CodVendedorSeleccionado<>"" Then
'			sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where CodigoVendedor=? And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
'			mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Array(Main.CodVendedorSeleccionado))
'		Else
		sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Null)
'		End If
	
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success delete from tblPedidosCompraRecibidosPtesRecepcionar arts-tallas no vendedor actual")
		End If

		OSUBsPendientesTerminaProductoNoCorteNoConfeccion
		Wait For OSUBsPendientesTerminaProductoNoCorteNoConfeccion_Completed (Accion As String ,lstRegOSUBRec As List)
		If Accion="Salir" Then
'		B4XPages.ClosePage(Me)
'		B4XPages.ShowPage("MenuPage")
			Return Accion
		End If
		mSQLGestionventas.ExecNonQuery("delete from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")
		DBUtils.InsertMaps(mSQLGestionventas, "tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion",lstRegOSUBRec)
		Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")
		If regIns<>lstRegOSUBRec.Size Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
			Wait For (msa) Msgbox_Result
		End If
		lstRegOSUBRec.Clear
	
		' Ajustar fechas de vencimiento. Sumar 1 dia, o cambiar a mañana si está vencida
		Dim TicksHoraCeroDia As Long=DateUtils.SetDate(DateTime.GetYear(DateTime.Now),DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now))
		Dim Periodo As Period
		Periodo.Initialize
		Periodo.Days=1
		Dim TicksHoraCeroDiaSiguiente As Long=DateUtils.AddPeriod(TicksHoraCeroDia,Periodo)
'		
'		
'		Dim ticksManana As Long=DateTime.Add(DateTime.Now,0,0,1)
'		Dim TicksMananaCeroHoras As Long=DateUtils.SetDate(DateTime.GetYear(ticksManana),DateTime.GetMonth(ticksManana),DateTime.GetDayOfMonth(ticksManana))
		Log("Mañana " & DateTime.Date(TicksHoraCeroDiaSiguiente))
		mSQLGestionventas.ExecNonQuery2("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set FechaVencimientoAj=FechaVencimiento+?", Array As Object(DateTime.TicksPerDay))
		mSQLGestionventas.ExecNonQuery2("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set FechaVencimientoAj=? where FechaVencimiento<=?", _
		Array As Object(TicksHoraCeroDiaSiguiente,TicksHoraCeroDiaSiguiente))
		mSQLGestionventas.ExecNonQuery2("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set sFechaProm=DATE(ROUND(FechaVencimiento+?/ 1000), 'unixepoch') ",Array(DateTime.TicksPerDay))


		'mSQLGestionventas.AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaPromAj, sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra where FechaPromAj>=? group by Articulo, Talla, FechaPromAj, sFechaProm", Array(lFecha))
		' 14/10/21 reunion Begoña/Henry NO hay ajuste en fechas prometidas. Fecha prometida , aunque esté vencida. En los datos POR LINEA se indicará la fecha vencida. A nivel de PEDIDO, se ELIMINA toda fecha VENCIDA
		' El unico ajuste es SUMAR 1 dia a la fecha prometida (TicksPerDay)
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaProm+? , sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra")
		sb.Append(" where AlmacenGV=1")
		sb.Append(" group by Articulo, Talla, FechaProm, sFechaProm")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Array(DateTime.TicksPerDay))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			'Log("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaPromAj , sum(QtyPteRecibir) desde tblFechasPrometidasCompra")
			Log("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaProm , sum(QtyPteRecibir) desde tblFechasPrometidasCompra")
		End If
		
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV select Almacen, Articulo, Talla, FechaProm+? , sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra")
		sb.Append(" where AlmacenGV=0")
		sb.Append(" group by Almacen,Articulo, Talla, FechaProm, sFechaProm")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Array(DateTime.TicksPerDay))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			'Log("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaPromAj , sum(QtyPteRecibir) desde tblFechasPrometidasCompra")
			Log("Success SQLite insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV datos FechaProm , sum(QtyPteRecibir) desde tblFechasPrometidasCompra")
		End If
	
		' Insercion en la tabla de disponibles, de las distintas fechas de vencimiento de las OSUBs terminan producto NOCorte-NoConf
		mSQLGestionventas.AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaVencimientoAj, sum(TQtyPte), sFechaProm from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion where FechaVencimientoAj>=? group by Articulo, Talla, FechaVencimientoAj,sFechaProm", Array(FechaHOY))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaVencimientoAj , sum(TQtyPte) desde tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")
		End If

	
		' para los artículos de corte, actualizar la ruta y el plazo ruta aplicable: Si es Dual, aplican los datos duales
	
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set RutaAplicable = Ruta, PlazoRutaAplicable=PlazoRuta")
		sb.append(" where ArticuloCorte=? and Dual=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("SI",0))
	
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set RutaAplicable = RutaDual, PlazoRutaAplicable=PlazoRutaDual")
		sb.append(" where ArticuloCorte=? and Dual=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("SI",1))
		
		'para los artículos que no contienen corte en su ruta, ("artículos NO corte"), la RutaAplicable es =Ruta y el PlazoRutaAplicable=PlazoRuta)
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set RutaAplicable = Ruta, PlazoRutaAplicable=PlazoRuta")
		sb.append(" where ArticuloCorte=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String("NO"))
	
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos")
		End If
	
	
		' datos de Configuracion de Plazos Entrega Articulos Corte

		ConfPlazoFechaEntregaPlan
		Wait For ConfPlazoFechaEntregaPlan_Completed (Accion As String ,lstRegConfPL As List)
		If Accion="Salir" Then
'		B4XPages.ClosePage(Me)
'		B4XPages.ShowPage("MenuPage")
			Return Accion
		End If
		mSQLGestionventas.ExecNonQuery("delete from tblConfPlazoFechaEntregaPlan")
		DBUtils.InsertMaps(mSQLGestionventas, "tblConfPlazoFechaEntregaPlan",lstRegConfPL)
		Dim regIns As Int=mSQLGestionventas.ExecQuerySingleResult("select count(*) from tblConfPlazoFechaEntregaPlan")
		If regIns<>lstRegConfPL.Size Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite, revisar logs.","Error")
			Wait For (msa) Msgbox_Result
		End If
		lstRegConfPL.Clear
	
	
		' Insercion en la tabla de ConfPlazos de los campos necesarios concatenados, para las líneas de Articulos FAB de la gestion de ventas
		' tabla de excepciones en NAV = PROIN PINILLA/Departamentos/Fabricación/Diseño de productos/Conf. plazos producción
		' tabla de plazos std por RUTAS = PROIN PINILLA/Departamentos/PROIN PINILLA/Maestros/Rutas
		' los plazos 1 a 10, son los de la tabla de excepciones, en orden de prioridad.
		' Plazo Ruta aplicable , es de de la tabla de Rutas.
		mSQLGestionventas.ExecNonQuery("delete from tblConfPlazoFechaEntregaPlanArticulosFabGV")
		Dim sbCP As StringBuilder
		sbCP.Initialize
	
		sbCP.Append("insert into tblConfPlazoFechaEntregaPlanArticulosFabGV ")
	
		sbCP.Append("Select tGV.Documento, tGV.Linea, tGV.FechaDocumento, tGV.Articulo, tGV.Cliente, tGV.GRP, tGV.Ruta,")

		sbCP.Append("coalesce(t1.Plazo,0) As Plazo1,")
		sbCP.Append("coalesce(t2.Plazo,0) As Plazo2,")
		sbCP.Append("coalesce(t3.Plazo,0) As Plazo3,")
		sbCP.Append("coalesce(t4.Plazo,0) As Plazo4,")
		sbCP.Append("coalesce(t5.Plazo,0) As Plazo5,")
		sbCP.Append("coalesce(t6.Plazo,0) As Plazo6,")
		sbCP.Append("coalesce(t7.Plazo,0) As Plazo7,")
		sbCP.Append("coalesce(t8.Plazo,0) As Plazo8,")
		sbCP.Append("coalesce(t9.Plazo,0) As Plazo9,")
		sbCP.Append("coalesce(t10.Plazo,0) As Plazo10,")
	
		sbCP.Append("tGV.PlazoRutaAplicable,")

		sbCP.Append("iif(coalesce(t1.Plazo,0)>0, t1.Plazo,")
		sbCP.Append("iif(coalesce(t2.Plazo,0)>0, t2.Plazo,")
		sbCP.Append("iif(coalesce(t3.Plazo,0)>0, t3.Plazo,")
		sbCP.Append("iif(coalesce(t4.Plazo,0)>0, t4.Plazo,")
		sbCP.Append("iif(coalesce(t5.Plazo,0)>0, t5.Plazo,")
		sbCP.Append("iif(coalesce(t6.Plazo,0)>0, t6.Plazo,")
		sbCP.Append("iif(coalesce(t7.Plazo,0)>0, t7.Plazo,")
		sbCP.Append("iif(coalesce(t8.Plazo,0)>0, t8.Plazo,")
		sbCP.Append("iif(coalesce(t9.Plazo,0)>0, t9.Plazo,")
		sbCP.Append("iif(coalesce(t10.Plazo,0)>0,t10.Plazo,")
		sbCP.Append("iif(coalesce(tGV.PlazoRutaAplicable,0)>0,tGV.PlazoRutaAplicable,0))))))))))) As PlazoArtLinea, ")

		sbCP.Append("0 ") ' sumaremos luego los ticks del plazoArtCorte a la fecha

		sbCP.Append("from tblGestionVentasCalculos tGV ")

		'sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta<>'') t1 using(Articulo, Cliente, RutaAplicable) ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta<>'') t1 on tGV.Articulo=t1.Articulo and tGV.Cliente=t1.Cliente and tGV.RutaAplicable=t1.Ruta ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta='') t2 using(Articulo, Cliente) ")
		'sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta<>'') t3 using(Articulo, GRP, RutaAplicable) ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta<>'') t3 on tGV.Articulo=t3.Articulo and tGV.GRP=t3.GRP and tGV.RutaAplicable=t3.Ruta ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta='') t4 using(Articulo, GRP) ")
		'sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta<>'') t5 using(Articulo, RutaAplicable) ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta<>'') t5 on tGV.Articulo=t5.Articulo and tGV.RutaAplicable=t5.Ruta ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta='') t6 using(Articulo) ")
		'sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta<>'') t7 using(Cliente, RutaAplicable) ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta<>'') t7 on tGV.Cliente=t7.Cliente and tGV.RutaAplicable=t7.Ruta ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta='') t8 using(Cliente) ")
		'sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta<>'') t9 using(GRP, RutaAplicable) ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta<>'') t9 on tGV.GRP=t9.GRP and tGV.RutaAplicable=t9.Ruta ")
		sbCP.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta='') t10 using(GRP) ")

		'sbCP.Append("where tGV.ArticuloCorte=? and tGV.QtyDisponibleAcum<?")
		'mSQLGestionventas.AddNonQueryToBatch(sbCP.ToString,Array("SI",0))
		sbCP.Append("where tGV.Fabricacion=?")
		mSQLGestionventas.AddNonQueryToBatch(sbCP.ToString,Array(1))


		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success insert into tblConfPlazoFechaEntregaPlanArticulosFabGV")
		End If
	
		' Actualizar La fecha de entrega = fecha documnento + ticks plazo
	
		Dim TpD As Long=DateTime.TicksPerDay
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblConfPlazoFechaEntregaPlanArticulosFabGV set FechaDocumentoMasPlazoArtLinea= FechaDocumento+(PlazoArtLinea * ?)")
		'sb.Append("update tblConfPlazoFechaEntregaPlanArticulosCorteGV set TicksPlazoArtCorte=PlazoArtCorte * ?, FechaDocumentoMasPlazoArtCorte=FechaDocumento+(PlazoArtCorte * ?)")
		'sb.Append("update tblConfPlazoFechaEntregaPlanArticulosCorteGV as t1 set TicksPlazoArtCorte=(select PlazoArtCorte * ? from tblConfPlazoFechaEntregaPlan as t2 where t1.Documento=t2.Documento and t1.Linea=t2.Linea)")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array(TpD))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblConfPlazoFechaEntregaPlanArticulosFabGV")
		End If
		
		
		'Actualizar PlazoFabLinea SOLO ARTICULOS FAB CON CORTE  (los sin corte se rigen por las OSUBs creadas q terminan producto + su plazo)
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos ")
		sb.Append("set PlazoTeoricoFabLinea = t2.PlazoArtLinea  ")
		sb.append("from (select Documento, Linea, PlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV) as t2 ")
		sb.Append(" where tblGestionVentasCalculos.Documento=t2.Documento and tblGestionVentasCalculos.Linea=t2.Linea")
		sb.Append(" and tblGestionVentasCalculos.ArticuloCorte=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("SI"))
		
		
		'Actualizar FechaPlazoRutaAplicable=FechaDocumentoMasPlazoArtLinea SOLO ARTICULOS FAB CON CORTE  (los sin corte se rigen por las OSUBs creadas q terminan producto + su plazo)
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos ")
		sb.Append("set FechaTeoricaFabLinea = t2.FechaDocumentoMasPlazoArtLinea  ")
		sb.append("from (select Documento, Linea, FechaDocumentoMasPlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV) as t2 ")
		sb.Append(" where tblGestionVentasCalculos.Documento=t2.Documento and tblGestionVentasCalculos.Linea=t2.Linea")
		sb.Append(" and tblGestionVentasCalculos.ArticuloCorte=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("SI"))
	
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaPlazoRutaAplicable")
		End If
		
		'Actualizar FechaTeoricaEntrega :  FechaMaterial si existe, y si no, FechaPlazoRutaAplicable
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos ")
		sb.Append("set FechaTeoricaEntrega= iif(FechaMaterial>0 and ArticuloCorte=?, FechaMaterial, FechaTeoricaFabLinea)")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("SI"))
	
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaTeoricaEntrega")
		End If
		
	
		' Running SUM de la tabla de StockDisponible, por Articulo-Talla-Fecha
		mSQLGestionventas.ExecNonQuery("delete from tblStockDisponibleAcumuladoArticuloTallaFecha")
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("insert into tblStockDisponibleAcumuladoArticuloTallaFecha (Articulo, Talla, Fecha, QtyDisponible, QtyDisponibleAcumulada, sFecha) ")
		sb.Append("Select Articulo, Talla, Fecha,QtyDisponible,")
		sb.Append("(Select sum(tS1.QtyDisponible) from tblStockDisponibleArticuloTallaFecha tS1 ")
		sb.Append("where tS1.Articulo=tS.Articulo And tS1.Talla=tS.Talla And tS1.Fecha<=tS.Fecha group by tS1.Articulo, tS1.Talla) QtyDisponibleAcumulada, ")
		sb.Append("sFecha ")
		sb.Append("from tblStockDisponibleArticuloTallaFecha tS ORDER BY Articulo, Talla, Fecha")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite delete from tblStockDisponibleAcumuladoArticuloTallaFecha")
		End If


		' Actualizar FechaDisponibilidad en funcion del disponibleacumulado por fecha
		Dim sb As StringBuilder
		sb.Initialize
	
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=")
		sb.Append("ifnull((Select Fecha from tblStockDisponibleAcumuladoArticuloTallaFecha As t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla ")
		sb.Append("And t2.QtyDisponibleAcumulada>=t1.QtyPteNetaAcum and AlmOrigenGV=1 limit 1),0)")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos")
		End If
		
		
	
'	Actualizar la FechaDisponibilidad para articulos de fabricacion cuyo disponible acumulado sea negativo.
'	Su fecha será = fecha de pedido + plazo calculado en tblConfPlazoFechaEntregaPlanArticulosCorteGV
'	Si esa fecha es anterior o igual a hoy, indicar mañana --> NO... 14/10/21 reunion Henry / Begoña , dejar la fecha vencida
	
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=")
		'sb.append("(Select FechaDocumentoMasPlazoArtCorte from tblConfPlazoFechaEntregaPlanArticulosCorteGV t2")
		sb.append("(Select FechaDocumentoMasPlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV t2")
		sb.Append(" where t1.Documento=t2.Documento and t1.Linea=t2.Linea)")
		'sb.Append(" where t1.ArticuloCorte=? and t1.QtyDisponibleAcum<?")
		sb.Append(" where t1.Fabricacion=? and t1.QtyDisponibleAcum<?")
		'mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("SI",0))
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array(1,0))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos")
		End If

	
		' Actualizar la fecha de Disponibilidad a la FechaMaterial si esta está indicada en el pedido para los articulos de corte
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=FechaMaterial")
		sb.Append(" where FechaMaterial>0 and ArticuloCorte=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("SI"))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos")
		End If
		
	
		' Actualizar la fecha de Disponibilidad a la FechaPlanificada si esta está indicada en el pedido
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=FechaPlanificada")
		sb.Append(" where FechaPlanificada>0 and ArticuloCorte=?")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array("SI"))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos")
		End If
	

	
		' Actualizar La fecha de entrega = fecha mañana si la fecha de entrega está vencida. Ojo las fechas = hoy, no actualizar a mañana. (Serán las que tengan QtyDisponibleAcum>=0)
		'' 14/10/21 reunion Henry / Begoña , dejar la fecha vencida
		' Si no hay Fecha (=0) , no actualizar a nada.
		''''		Dim sb As StringBuilder
		''''		sb.Initialize
		''''		sb.Append("update tblGestionVentasCalculos set FechaDisponibilidad=? where FechaDisponibilidad>0 and FechaDisponibilidad<=?") ' and QtyDisponibleAcum<0")
		''''		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array(TicksHoraCeroDiaSiguiente,TicksHoraCeroDia))
		''''		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		''''		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		''''		Log("NonQuery: " & Success)
		''''		If Not(Success) Then
		''''			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		''''			Wait For (msa) Msgbox_Result
		''''			Accion="Salir"
		''''			Return Accion
		''''		Else
		''''			Log("Success SQLite update tblGestionVentasCalculos")
		''''		End If
		
		
	
		' Actualizar La fecha de entrega + 10 dias si la linea es Personalizada, y Si la fecha es >0 (es decir, si tiene fecha)
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos set FechaDisponibilidad=FechaDisponibilidad + ? where Personalizado=? and FechaDisponibilidad>0")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array((10*DateTime.TicksPerDay),1))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaDisponibilidad")
		End If
		
		
		' Para Lineas de documentos con almacen de destino <>"" tomar, si existe, su fecha de disponibilidad +1  como fecha prometida de entrada en el almacen de destino
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV select AlmDest, Articulo, Talla, FechaDisponibilidad+? as Fecha, sum(QtyPte) as QtyDisponible, DATE(ROUND(FechaDisponibilidad+?/ 1000), 'unixepoch') as sFecha")
		sb.Append(" from tblGestionVentasCalculos")
		sb.Append(" where AlmDest<>? and FechaDisponibilidad>0")
		sb.Append(" group by AlmDest,Articulo, Talla, Fecha, sFecha")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString,Array(DateTime.TicksPerDay,DateTime.TicksPerDay,""))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			'Log("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaPromAj , sum(QtyPteRecibir) desde tblFechasPrometidasCompra")
			Log("Success SQLite insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV datos documentos alm destino<>'' , con fechadisponbilidad>0")
		End If
		
		' Running SUM de la tabla de tblStockDisponibleArticuloTallaFechaAlmacenesNoGV, por Articulo-Talla-Fecha
		mSQLGestionventas.ExecNonQuery("delete from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV")
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("insert into tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV (Almacen, Articulo, Talla, Fecha, QtyDisponible, QtyDisponibleAcumulada, sFecha) ")
		sb.Append("Select Almacen, Articulo, Talla, Fecha,QtyDisponible,")
		sb.Append("(Select sum(tS1.QtyDisponible) from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV tS1 ")
		sb.Append("where tS1.Almacen=tS.Almacen and tS1.Articulo=tS.Articulo And tS1.Talla=tS.Talla And tS1.Fecha<=tS.Fecha group by tS1.Almacen, tS1.Articulo, tS1.Talla) QtyDisponibleAcumulada, ")
		sb.Append("sFecha ")
		sb.Append("from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV tS ORDER BY Almacen, Articulo, Talla, Fecha")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite delete from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV")
		End If


		' Actualizar FechaDisponibilidad en funcion del disponibleacumulado por fecha para los almacenes NO GV
		Dim sb As StringBuilder
		sb.Initialize
	
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=")
		sb.Append("ifnull((Select Fecha from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV As t2 where t1.AlmOrigen=t2.Almacen and t1.Articulo=t2.Articulo And t1.Talla=t2.Talla ")
		sb.Append("And t2.QtyDisponibleAcumulada>=t1.QtyPteNetaAcum and AlmOrigenGV=0 limit 1),0)")
		sb.Append(" where AlmOrigenGV=0")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos")
		End If
		
		
		' Actualizar FechaDisponibilidadVencida
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidadVencida=iif(FechaDisponibilidad<?,'SI','NO') ")
		sb.Append(" where FechaDisponibilidad>0")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array(FechaHOY))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos FechaDisponibilidadVencida")
		End If
		

		
		
		Dim sb As StringBuilder
		sb.Initialize
		
		sb.Append("update tblGestionVentasCalculos set FechaPrevVentasLinea=FechaDisponibilidad where PedidoAbierto=0 and FechaDisponibilidad>0 and FechaDisponibilidad>=FechaRequerida")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaPrevVentasLinea")
		End If
		
		
		
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos set FechaPrevVentasLinea=FechaRequerida where PedidoAbierto=0 and FechaRequerida>0 and FechaDisponibilidad>0 and FechaRequerida>FechaDisponibilidad")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaPrevVentasLinea")
		End If
		
		
		' Actualizar FechaPrevVentasLineaVencida
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set FechaPrevVentasLineaVencida=iif(FechaPrevVentasLinea<?,'SI','NO') ")
		sb.Append(" where FechaPrevVentasLinea>0")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array(FechaHOY))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update tblGestionVentasCalculos FechaPrevVentasLineaVencida")
		End If
		
		' para los documentos con TODAS sus lineas con fechaprevventas>=HOY , actualizar la fecha del documento al maximo de sus fechas de linea
		Dim rs As ResultSet=mSQLGestionventas.ExecQuery("select distinct Documento from tblGestionVentasCalculos")
		Do While rs.NextRow
			Dim Doc As String=rs.GetString("Documento")
			Dim NumLinDocSinFechaCalcPrevVentas As Int=jamTableViewGestionVentas.FixNullInt(mSQLGestionventas.ExecQuerySingleResult2("select count(*) from tblGestionVentasCalculos where Documento=? and FechaPrevVentasLinea<?", _
			Array As String(Doc, FechaHOY)))
			If NumLinDocSinFechaCalcPrevVentas=0 Then
				Dim MaxFechaCalcPrevVentasDoc As Long=mSQLGestionventas.ExecQuerySingleResult2("select max(FechaPrevVentasLinea) from tblGestionVentasCalculos where Documento=?", _
			Array As String(Doc))
				mSQLGestionventas.AddNonQueryToBatch("update tblGestionVentasCalculos set FechaPrevVentasDocumento=? where Documento=?",Array(MaxFechaCalcPrevVentasDoc,Doc))
			End If
		Loop
		rs.Close
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		
		
		' para las lineas con Fechaprevventas>=HOY y Fecha Requerida>0, actualizar la FechaPrevVentasDocumento=FechaPrevVentasLinea
		mSQLGestionventas.AddNonQueryToBatch("update tblGestionVentasCalculos set FechaPrevVentasDocumento=FechaPrevVentasLinea where FechaPrevVentasLinea>? and FechaRequerida>0",Array(FechaHOY))
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
	
	
	
		' Actualizar FechaCalculoActualCliente=0 si la fecha es 01/01/2000
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yyyy"
		Log(DateTime.DateParse("01/01/2000"))
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos set FechaCalculoActualCliente=0 where FechaCalculoActualCliente<" & DateTime.DateParse("01/02/2000"))
		DateTime.DateFormat=DateFormatAnt
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaCalculoActualCliente=01/01/2000")
		End If
		
'		If Main.CodVendedorSeleccionado<>"" Then
'			' Eliminar las filas de tblGestion de ventas en las que el vendedor sea distinto del que se está analizando
'			Dim sb As StringBuilder
'			sb.Initialize
'			sb.Append("delete from tblGestionVentasCalculos where CodigoVendedor<>?")
'			mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Array As String(Main.CodVendedorSeleccionado))
'			Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
'			Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
'			Log("NonQuery: " & Success)
'			If Not(Success) Then
'				Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
'				Wait For (msa) Msgbox_Result
'				Accion="Salir"
'				Return Accion
'			Else
'				Log("Success SQLite delete tblGestionVentasCalculos líneas otros comerciales")
'			End If
'		End If

	Else   'SI NO HAY CALCULO DE FECHAS :  actualizar FechaDisponibilidad=0 para quitar los nulos
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=0, FechaDisponibilidadVencida='', FechaPrevVentasLinea=0, FechaPrevVentasdocumento=0")
		mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
		Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		If Not(Success) Then
			Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
			Wait For (msa) Msgbox_Result
			Accion="Salir"
			Return Accion
		Else
			Log("Success SQLite update FechaDisponibilidad=0")
		End If
		
		
	End If
	
'	Dim sb As StringBuilder
'	sb.Initialize
'	sb.Append("update tblGestionVentasCalculos As t1 set SemanaFechaDisponibilidad=0")
'	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
'	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
'	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
'	Log("NonQuery: " & Success)
'	If Not(Success) Then
'		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
'		Wait For (msa) Msgbox_Result
'		Accion="Salir"
'		Return Accion
'	Else
'		Log("Success SQLite update SemanaFechaDisponibilidad=0")
'	End If
	
	
	
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("insert into tblGestionVentas (")
	sb.Append("IDPrioridad, IDPrioridadUsuario, CodigoResponsableCuenta,NombreResponsableCuenta, CodigoVendedor, NombreVendedor,")
	sb.Append("Documento,FechaDocumento, FechaPrometida, Cliente, NombreCliente, GRP, NombreGRP, DirEnv, CiudadDirEnvio, PedidoCliente, Stand_By,")
	sb.Append("PedidoBloqueado, PedidoAbierto, Linea, AlmOrigen, AlmOrigenGV, AlmDest, Personalizado, Fabricacion, CompraFab, Dual, Ruta, PlazoRuta, RutaDual, PlazoRutaDual, ArticuloCorte,FechaMaterial, FechaPlanificada, FechaRequerida, ")
	sb.Append("Ruta, Articulo, DescripcionArticulo, Talla,")
	sb.Append("QtyPte, Reserva, StockLibre, StockAlmNoGV, QtyPteNeta,QtyPteNetaAcum, QtyDisponibleAcum, Status, ReservaAlmacen, ImportePendiente, FechaDisponibilidad, FechaDisponibilidadVencida, FechaCalculoActualCliente, ")  ',SemanaFechaDisponibilidad) ")
	sb.Append("RutaAplicable, PlazoRutaAplicable,")
	sb.Append("PlazoTeoricoFabLinea, FechaTeoricaFabLinea, FechaTeoricaEntrega,")
	sb.Append("FechaPrevVentasLinea,FechaPrevVentasLineaVencida, FechaPrevVentasDocumento) ")  ',SemanaFechaDisponibilidad) ")
	sb.Append("Select ")
	sb.Append("IDPrioridad, IDPrioridadUsuario, CodigoResponsableCuenta,NombreResponsableCuenta, CodigoVendedor, NombreVendedor,")
	sb.Append("Documento,FechaDocumento, FechaPrometida, Cliente, NombreCliente, GRP, NombreGRP, DirEnv, CiudadDirEnvio, PedidoCliente, Stand_By,")
	sb.Append("PedidoBloqueado, PedidoAbierto, Linea, AlmOrigen, AlmOrigenGV, AlmDest, Personalizado, Fabricacion, CompraFab, Dual, Ruta, PlazoRuta, RutaDual, PlazoRutaDual, ArticuloCorte,FechaMaterial, FechaPlanificada, FechaRequerida,")
	sb.Append("Ruta, Articulo, DescripcionArticulo, Talla,")
	sb.Append("QtyPte, Reserva, StockLibre, StockAlmNoGV, QtyPteNeta,QtyPteNetaAcum, QtyDisponibleAcum, Status, ReservaAlmacen, ImportePendiente, FechaDisponibilidad, FechaDisponibilidadVencida, FechaCalculoActualCliente, ") ',SemanaFechaDisponibilidad ")
	sb.Append("RutaAplicable, PlazoRutaAplicable,")
	sb.Append("PlazoTeoricoFabLinea, FechaTeoricaFabLinea,FechaTeoricaEntrega,")
	sb.Append("FechaPrevVentasLinea, FechaPrevVentasLineaVencida,FechaPrevVentasDocumento ")
	sb.Append("from tblGestionVentasCalculos")
	

	mSQLGestionventas.AddNonQueryToBatch(sb.ToString, Null)
	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("Error SQLite " & LastException.Message,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		Return Accion
	Else
		Log("Success SQLite update tblGestionVentas")
	End If
	
	Accion="OK"
	Return Accion
End Sub

Sub NombreVendedor(CodigoVendedorSel As String)
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"NombreVendedor",Array As String(CodigoVendedorSel), Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query NombreVendedor ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'LimpiarDatos
			
		'' codigo callback
	Else
		If mresult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay ningún vendedor registrado en Navision con el código " & CodigoVendedorSel & ".","Error")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	CallSubDelayed3(Me,"NombreVendedor_Completed",Accion,lstRegistros)
End Sub

Sub DatosGestionVentas
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"GestionVentasAmpliadaPlazos2",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query GestionVentas ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
	Else
		If mresult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos en Gestión de Ventas.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	CallSubDelayed3(Me,"DatosGestionVentas_Completed",Accion,lstRegistros)
End Sub

Sub ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV As ResumableSub
	Dim mRes As Map
	mRes.Initialize
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	mRes.Put("Accion", Accion)
	mRes.Put("lstRegistros", lstRegistros)
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query GestionVentas ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else
		If mresult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos en Gestión de Ventas.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
			mRes.Put("Accion", Accion)
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
			mRes.Put("Accion", Accion)
			mRes.Put("lstRegistros", lstRegistros)
		End If
	End If
	Return mRes
End Sub

Sub FechasPrometidasCompras
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"FechasPrometidasCompra",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query GestionVentas ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'LimpiarDatos
			
		'' codigo callback
	Else
		If mresult.Get("ReqOK")=False Then
			' no es necesario avisarlo
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de fecha prometidass.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	CallSubDelayed3(Me,"FechasPrometidasCompras_Completed",Accion,lstRegistros)
End Sub

Sub PedidosComprasRecibidosPtesRecepcionar
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"PedidosCompraRecibidosPtesRecepcionar",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query PedidosCompraRecibidosPtesRecepcionar ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'LimpiarDatos
			
		'' codigo callback
	Else
		If mresult.Get("ReqOK")=False Then
			' no es necesario avisarlo
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de Pedido sCompra Recibidos Ptes Recepcionar.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	CallSubDelayed3(Me,"PedidosComprasRecibidosPtesRecepcionar_Completed",Accion,lstRegistros)
End Sub

Sub ConfPlazoFechaEntregaPlan
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"ConfPlazoFechaEntregaPlan",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query ConfPlazoFechaEntregaPlan ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'LimpiarDatos
			
		'' codigo callback
	Else
		If mresult.Get("ReqOK")=False Then
			' no es necesario avisarlo
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de Pedido sCompra Recibidos Ptes Recepcionar.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	CallSubDelayed3(Me,"ConfPlazoFechaEntregaPlan_Completed",Accion,lstRegistros)
End Sub




Sub OSUBsPendientesTerminaProductoNoCorteNoConfeccion
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"OSUBsPtesTerminaProductoNoCorteNoConfeccionSumaArtVar",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query OSUBsPtesTerminaProductoNoCorteNoConfeccionSumaArtVar ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'LimpiarDatos
			
		'' codigo callback
	Else
		If mresult.Get("ReqOK")=False Then
			' no es necesario avisarlo
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de Pedido sCompra Recibidos Ptes Recepcionar.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	CallSubDelayed3(Me,"OSUBsPendientesTerminaProductoNoCorteNoConfeccion_Completed",Accion,lstRegistros)
End Sub


Sub ReservasDocumentoAlmZenProin As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mReg As Map
	mReg.Initialize
	mReg.Put("Accion", Accion)
	mReg.Put("lstRegistros", lstRegistros)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlAlmProin,"EmbalajesReservasActivas",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query EmbalajesReservasActivas Proin ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mReg.Put("Accion", Accion)
	Else
		If mresult.Get("ReqOK")=False Then
			Accion="SinDatos"
			mReg.Put("Accion", Accion)
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
			mReg.Put("Accion", Accion)
			mReg.Put("lstRegistros", lstRegistros)
		End If
	End If
	Return mReg
End Sub

Sub ReservasDocumentoAlmZenProtec As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mReg As Map
	mReg.Initialize
	mReg.Put("Accion", Accion)
	mReg.Put("lstRegistros", lstRegistros)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlAlmProtec,"EmbalajesReservasActivas",Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query EmbalajesReservasActivas Proin ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mReg.Put("Accion", Accion)
	Else
		If mresult.Get("ReqOK")=False Then
			Accion="SinDatos"
			mReg.Put("Accion", Accion)
		Else
			lstRegistros=mresult.Get("lstRes")
			Accion="Continuar"
			mReg.Put("Accion", Accion)
			mReg.Put("lstRegistros", lstRegistros)
		End If
	End If
	Return mReg
End Sub

Sub GenerarExcelPrevisionSemanalVentas

	
	
	Dim msa As Object = xui.Msgbox2Async("¿Calcular Previsión de Ventas?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (Result As Int)
	CalcularFechas=Result=xui.DialogResponse_Positive
	
	If CalcularFechas=False Then
		Dim msa As Object=xui.MsgboxAsync("En la última actualización de la tabla no se actualizó la Fecha de Disponibilidad." & _
		" Es necesario actualizar estas fechas para Generar Excel de Prevision Semanal Ventas.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	
'	If mSQLGestionventas.IsInitialized Then
'		mSQLGestionventas.Close
'	End If
'	
'	jamTableViewGestionVentas.HabilitarJamTableView(False)
'	mSQLGestionventas.InitializeSQLite(xui.DefaultFolder,"SQLGestionVentas.db",True)
'	
'	Dim ntFP As Int=mSQLGestionventas.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblFechasCalculadasPrevVentas"))
'	If ntFP>0 Then
'		mSQLGestionventas.ExecNonQuery("drop table tblFechasCalculadasPrevVentas")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblFechasCalculadasPrevVentas (")
'	sbCrearTabla.Append("Documento TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Linea INTEGER,")
'	sbCrearTabla.Append("FechaCalcPrevVentasLinea INTEGER default 0,")
'	sbCrearTabla.Append("FechaCalcPrevVentasDocumento INTEGER default 0)")
	'
'	mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToString)
	
	Dim xl As XLUtils
	xl.Initialize
	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos")
	
'	Dim jo As JavaObject=sheet1.PoiSheet
'	Try
'		jo.RunMethod("trackAllColumnsForAutoSizing",Null)
'	Catch
'		Log(LastException.Message)
'	End Try

	If jamTableViewGestionVentas.NumeroTotalRegistros<>jamTableViewGestionVentas.NumeroTotalRegistrosFiltrados Then
		Dim msa As Object = xui.Msgbox2Async("La tabla está filtrada. El cálculo se realizará sobre los registros filtrados." & CRLF & CRLF & "¿Continuar?", "Tabla filtrada", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	Dim TimeFormatAnt As String=DateTime.TimeFormat
	Dim TimeZoneAnt As String=DateTime.TimeZoneOffset
	DateTime.DateFormat="dd-MM-yy"
	DateTime.TimeFormat="HH.mm.ss"
	'Dim FechaInicioTicks As Long=DateUtils.SetDate(1970,1,1)
	
	jamTableViewGestionVentas.EstadoLabelSalirJamTableView(False)
	jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.WAIT)
	jamTableViewGestionVentas.HabilitarJamTableView(False)
	' encabezados
	Dim rs As ResultSet=jamTableViewGestionVentas.GetTableViewResultSet
	Dim idxColFechaDisponibilidad As Int
	Dim idxColFechaRequerida As Int
	Dim idxColLineaPedidoAbierto As Int
	Dim NumColsRs As Int=rs.ColumnCount
	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
	'encabezados
	For idxCol=0 To rs.ColumnCount-1
		sheet1.PutString(xl.AddressZero(idxCol,0), rs.GetColumnName(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
		If rs.GetColumnName(idxCol)="FechaDisponibilidad" Then idxColFechaDisponibilidad=idxCol
		If rs.GetColumnName(idxCol)="FechaRequerida" Then idxColFechaRequerida=idxCol
		If rs.GetColumnName(idxCol)="PedidoAbierto" Then idxColLineaPedidoAbierto=idxCol
	Next
	'sheet1.PutString(xl.AddressZero(idxCol,0),"Fecha Prev. Ventas").SetStyle(sheet1.LastAccessed, HeaderStyle)
	sheet1.PutString(xl.AddressZero(idxCol,0),"Año-Semana Prev.Ventas Linea").SetStyle(sheet1.LastAccessed, HeaderStyle)
	'sheet1.PutString(xl.AddressZero(idxCol+2,0),"Fecha Prev. Ventas Documento").SetStyle(sheet1.LastAccessed, HeaderStyle)
	sheet1.PutString(xl.AddressZero(idxCol+1,0),"Año-Semana Prev.Ventas Documento").SetStyle(sheet1.LastAccessed, HeaderStyle)
	
	Dim Columnwidth(idxCol+1),Cw As Int   ' variables para el autoajustado de las columnas     https://www.b4x.com/android/forum/threads/jpoi-library-automatic-column-width.109448/
	
	
	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
	Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
	Dim idxFila As Int=1
	
'	Dim Documento As String
'	Dim LineaDocumento As Int
'	Dim PedidoAbiertoLinea As Int
'	Dim FechaRequeridaLinea As Long
'	Dim FechaDisponibilidadLinea As Long
'	Dim FechaPrevisionVentasLinea As Long
	Dim FechaPrevVentasLinea As Long
	Dim FechaPrevVentasdocumento As Long
	
	Do While rs.NextRow
		'Dim RowStyle As XLStyle = RowStyles.Get(idxFila Mod RowStyles.Size)
		For idxCol=0 To rs.ColumnCount-1
			Dim AliasCampo As String=rs.GetColumnName(idxCol)
			Dim cTV As CampoOrigenDatosJamTableView=jamTableViewGestionVentas.GetDatosCampoOrigenDatosJamTableViewAliasCampo(AliasCampo)
			Select cTV.TipoDato
				Case "INTEGER"
					'sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetInt(AliasCampo)).SetStyles(sheet1.LastAccessed, Array(RowStyle))
					sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetInt(AliasCampo))
				Case "REAL"
					If cTV.EsFecha Then
'						Dim pFecha As Period=DateUtils.PeriodBetweenInDays(0,rs.GetLong(AliasCampo))
'						Dim FechaExcel As Int= pFecha.Days+25569
'						#if debug
'						Log("Fecha Excel " & FechaExcel)
'						#end if
'						If FechaExcel<=-53688 Then
'							' fecha en blanco, no poner nada en la celda
'						Else
'							sheet1.PutDate(xl.AddressZero(idxCol,idxFila),FechaExcel)
'						End If
						Dim ticks As Long = rs.GetLong(AliasCampo)
						
						If ticks > 0 Then
							Dim TicksHora0 As Long=DateUtils.SetDate(DateTime.GetYear(ticks),DateTime.GetMonth(ticks),DateTime.GetDayOfMonth(ticks))
							'sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, Array(FechasStyle, RowStyle))
							sheet1.PutDate(xl.AddressZero(idxCol,idxFila), TicksHora0).SetStyle(sheet1.LastAccessed, FechasStyle)
						End If
						
					Else
						'sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),rs.GetDouble(AliasCampo)).SetStyles(sheet1.LastAccessed, Array(RowStyle))
						sheet1.PutNumber(xl.AddressZero(idxCol,idxFila),Round2(rs.GetDouble(AliasCampo),2))
					End If
				Case "TEXT"
					'sheet1.PutString(xl.AddressZero(idxCol,idxFila),rs.GetString(AliasCampo)).SetStyles(sheet1.LastAccessed, Array(RowStyle))
					sheet1.PutString(xl.AddressZero(idxCol,idxFila),rs.GetString(AliasCampo))
				Case Else
					'sheet1.PutString(xl.AddressZero(idxCol,idxFila),rs.GetString(AliasCampo)).SetStyles(sheet1.LastAccessed, Array(RowStyle))
					sheet1.PutString(xl.AddressZero(idxCol,idxFila),rs.GetString(AliasCampo))
			End Select
'			Select AliasCampo
'				Case "Documento"
'					Documento=rs.GetString("Documento")
'				Case "Linea"
'					LineaDocumento=rs.GetInt("Linea")
'				Case "FechaDisponibilidad"
'					FechaDisponibilidadLinea=rs.GetLong(AliasCampo)
'				Case "FechaRequerida"
'					FechaRequeridaLinea=rs.GetLong(AliasCampo)
'				Case "PedidoAbierto"
'					PedidoAbiertoLinea=rs.getint(AliasCampo)
'			End Select
			
		Next
		
		'Select AliasCampo

		'	Case "FechaPrevVentasLinea"
		FechaPrevVentasLinea=rs.GetLong("FechaPrevVentasLinea")
		'	Case "FechaPrevVentasDocumento"
		FechaPrevVentasdocumento=rs.GetLong("FechaPrevVentasdocumento")
		'End Select
		
		If FechaPrevVentasLinea>0 Then
			Dim TicksHora0FechaPrevVentasLinea As Long=DateUtils.SetDate(DateTime.GetYear(FechaPrevVentasLinea),DateTime.GetMonth(FechaPrevVentasLinea),DateTime.GetDayOfMonth(FechaPrevVentasLinea))
			Cal.InitializeWith(TicksHora0FechaPrevVentasLinea)
			Cal.MinimalDaysInFirstWeek=4
			Cal.FirstDayOfWeek=Cal.MONDAY
			Cal.toString
			Dim WeekISOFechaPrevisionVentas As Int= Cal.Get(Cal.WEEK_OF_YEAR)
			Dim YearISOPrevisionVentas As Int=Cal.WeekYear
			sheet1.PutString(xl.AddressZero(NumColsRs,idxFila), YearISOPrevisionVentas & "-" & NumberFormat2(WeekISOFechaPrevisionVentas,2,0,0,False)).SetStyle(sheet1.LastAccessed, FechasStyle)
'			Else
'				sheet1.PutString(xl.AddressZero(NumColsRs,idxFila), "")
		End If
			
		If FechaPrevVentasdocumento>0 Then
			Dim TicksHora0FechaPrevVentasDocumento As Long=DateUtils.SetDate(DateTime.GetYear(FechaPrevVentasdocumento),DateTime.GetMonth(FechaPrevVentasdocumento),DateTime.GetDayOfMonth(FechaPrevVentasdocumento))
			Cal.InitializeWith(TicksHora0FechaPrevVentasDocumento)
			Cal.MinimalDaysInFirstWeek=4
			Cal.FirstDayOfWeek=Cal.MONDAY
			Cal.toString
			Dim WeekISOFechaPrevisionVentas As Int= Cal.Get(Cal.WEEK_OF_YEAR)
			Dim YearISOPrevisionVentas As Int=Cal.WeekYear
			sheet1.PutString(xl.AddressZero(NumColsRs+1,idxFila),  YearISOPrevisionVentas & "-" & NumberFormat2(WeekISOFechaPrevisionVentas,2,0,0,False)).SetStyle(sheet1.LastAccessed, FechasStyle)
'			Else
'				sheet1.PutString(xl.AddressZero(NumColsRs+1,idxFila), "")
		End If
			
			
		'Next
		
'		Dim xlAddressFechaDisponibilidad As String= xl.AddressZeroToString(idxColFechaDisponibilidad,idxFila)
'		Dim xlAddressFechaRequerida As String= xl.AddressZeroToString(idxColFechaRequerida,idxFila)
		''		Dim xlAddressLineaPedidoAbierto As String= xl.AddressZeroToString(idxColLineaPedidoAbierto,idxFila)
'		Dim xlAddressFechaCalculoPrevisionVentas As String
'		
'		Dim FechaCalculoPrevisionVentasLinea As Long
		''		Dim PedidoAbiertoLinea=
'		If PedidoAbiertoLinea=0 And FechaDisponibilidadLinea>0 Then  ' si es pedido abierto , NO cuenta para Prevision de ventas (aunque sí para Disponibilidad)
		'
'			If FechaRequeridaLinea>FechaDisponibilidadLinea Then ' si la fecha requerida, si la hay, es posterior a la fecha de disponibilidad, se venderá en la fecha requerida.
'				xlAddressFechaCalculoPrevisionVentas=xlAddressFechaRequerida
'				FechaCalculoPrevisionVentasLinea=FechaRequeridaLinea
'			Else
'				xlAddressFechaCalculoPrevisionVentas=xlAddressFechaDisponibilidad ' si la fecha requerida, si la hay, es anterior a la fecha de disponiblidad, se venderá en la fecha de disponibilidad.
'				FechaCalculoPrevisionVentasLinea=FechaDisponibilidadLinea
'			End If
		''			Dim FormulaSemana As String="Year(" & xlAddressFechaCalculoPrevisionVentas & "-WEEKDAY(" & xlAddressFechaCalculoPrevisionVentas & ",3)+3) & " & QUOTE & "-" & QUOTE & " & TEXT(WEEKNUM(" & xlAddressFechaCalculoPrevisionVentas & ",21)," & QUOTE & "00" & QUOTE & ")"
		''			'Log("FormulaSemana: " & FormulaSemana)
		''			sheet1.PutFormula(xl.AddressZero(NumColsRs, idxFila),FormulaSemana)
'			
'			Dim TicksHora0FechaCalcPrevVentas As Long=DateUtils.SetDate(DateTime.GetYear(FechaCalculoPrevisionVentasLinea),DateTime.GetMonth(FechaCalculoPrevisionVentasLinea),DateTime.GetDayOfMonth(FechaCalculoPrevisionVentasLinea))
'			sheet1.PutDate(xl.AddressZero(NumColsRs,idxFila), TicksHora0FechaCalcPrevVentas).SetStyle(sheet1.LastAccessed, FechasStyle)
'			
'			Cal.InitializeWith(TicksHora0FechaCalcPrevVentas)
'			Cal.MinimalDaysInFirstWeek=4
'			Cal.FirstDayOfWeek=Cal.MONDAY
'			Cal.toString
'			
'			Dim WeekISOFechaPrevisionVentas As Int= Cal.Get(Cal.WEEK_OF_YEAR)
'			Dim YearISOPrevisionVentasLinea As Int=Cal.WeekYear
'			sheet1.putstring(xl.AddressZero(NumColsRs+1, idxFila), YearISOPrevisionVentasLinea & "-" & WeekISOFechaPrevisionVentas)
'			
'		End If	
'		mSQLGestionventas.AddNonQueryToBatch("insert into tblFechasCalculadasPrevVentas (Documento, Linea, FechaCalcPrevVentasLinea) values (?,?,?)",Array(Documento, LineaDocumento,FechaCalculoPrevisionVentasLinea))
		
'		End If
		jamTableViewGestionVentas.TextoPanelInfoJamTableView="Procesando Fila " & idxFila
		Sleep(0)
		idxFila=idxFila+1
		
		
	Loop
	rs.Close
	
'	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
'	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
'	Log("NonQuery: " & Success)
'	
'	Dim rs As ResultSet=mSQLGestionventas.ExecQuery("select distinct Documento from tblFechasCalculadasPrevVentas")
'	Do While rs.NextRow
'		Dim Doc As String=rs.GetString("Documento")
'		Dim NumLinDocSinFechaCalcPrevVentas As Int=jamTableViewGestionVentas.FixNullInt(mSQLGestionventas.ExecQuerySingleResult2("select count(*) from tblFechasCalculadasPrevVentas where Documento=? and FechaCalcPrevVentasLinea=0", _
'			Array As String(Doc)))
'		If NumLinDocSinFechaCalcPrevVentas=0 Then
'			Dim MaxFechaCalcPrevVentasDoc As Long=mSQLGestionventas.ExecQuerySingleResult2("select max(FechaCalcPrevVentasLinea) from tblFechasCalculadasPrevVentas where Documento=?", _
'			Array As String(Doc))
'			mSQLGestionventas.AddNonQueryToBatch("update tblFechasCalculadasPrevVentas set FechaCalcPrevVentasDocumento=? where Documento=?",Array(MaxFechaCalcPrevVentasDoc,Doc))
'		End If
'	Loop
'	rs.Close
'	Dim SenderFilter As Object = mSQLGestionventas.ExecNonQueryBatch("SQL")
'	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
'	Log("NonQuery: " & Success)
	'
'	
'	
'	Dim rs As ResultSet=mSQLGestionventas.ExecQuery("select distinct Documento FechaCalcPrevVentasDocumentofrom tblFechasCalculadasPrevVentas where FechaCalcPrevVentasDocumento>0")
'	Do While rs.NextRow
'		
'		
'		
'	Loop
'	rs.Close
'	
'	
	'
'	mSQLGestionventas.Close
	
	
	Dim LastTableRow1 As Int = sheet1.LastAccessed.Row0Based + 1
	
	
	Dim UltimaFila As Int=idxFila
	jamTableViewGestionVentas.TextoPanelInfoJamTableView="Generando fichero excel..."
	Sleep(0)
	'add sum field:
	'sheet1.PutFormula(xl.AddressZero(NumColsRs, 1), "WEEKNUM(R2C"&)(D2:${xl.AddressZero(,UltimaFila)})"$)
	
	
	'Dim BoldStyle As XLStyle = Workbook.CreateStyle.FontBold(Workbook.DefaultFontSize)



	
	'crear tabla
'	Dim table As XLTable = sheet1.CreateTable(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumColsRs,UltimaFila)),"Tabla1","TableStyleMedium3")
'	table.AddAutoFilter
	
'	For k=0 To NumColsRs
'		Try
'			jo.RunMethod("autoSizeColumn",Array(k))
'		Catch
'			Log(LastException.Message)
'		End Try
'	Next
	
	
	'add auto filters - range with the data. The filters will appear above the data.
	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumColsRs+1,UltimaFila)))
	
'	jamTableViewGestionVentas.TextoPanelInfoJamTableView="Creando formatos..."
'	Sleep(0)
'	
'	'Set the columns widths to fit the content
'	'To make sure that the "total" column is measured correctly we need to first evaluate the formulas:
'	Workbook.EvaluateFormulas
'	For col0 = xl.AddressZero(0,0).Col0Based To xl.AddressZero(NumColsRs,UltimaFila).Col0Based
'	'For col0 = 0 To NumColsRs
'		sheet1.AutoSizeColumn(col0)
'		#if debug
'		Log("Autosize Columna " & col0)
'		#End If
'		jamTableViewGestionVentas.TextoPanelInfoJamTableView="Autosize Columna " & col0
'		Sleep(0)
'	Next
'	'sheet1.CreateFreezePane(0, 1) 'lock the upmost row
	'
	'
'	'make the columns a bit wider to make room for the filter arrows:
'	For col0  = 0 To NumColsRs
'		sheet1.PoiSheet.SetColumnWidth(col0, sheet1.PoiSheet.GetColumnWidth(col0) + 1200)
'	Next
	
	jamTableViewGestionVentas.SetMouseCursor(fx.Cursors.DEFAULT)
	jamTableViewGestionVentas.EstadoLabelSalirJamTableView(True)
	jamTableViewGestionVentas.HabilitarJamTableView(True)
	
	jamTableViewGestionVentas.TextoPanelInfoJamTableView=""
	'save the workbook

	
	Dim UserDocFolder As String=jamTableViewGestionVentas.FindUserDocumentsFolder
	Dim fc As FileChooser
	fc.Initialize
	fc.Title="Exportación Excel"
	fc.SetExtensionFilter("Ficheros Excel", Array As String("*.xlsx","*.xlsm","*.xls"))
	Dim Hora As Int=DateTime.GetHour(DateTime.Now)
	Dim Minutos As Int=DateTime.GetMinute(DateTime.Now)
	Dim Segundos As Int=DateTime.GetMinute(DateTime.Now)
	fc.InitialFileName= "Prevision Semanal Ventas " & DateTime.Date(DateTime.Now) & " " & Hora & "h" & Minutos & "m" & Segundos & "s" & ".xlsx"
	fc.InitialDirectory=UserDocFolder
	Dim fileName As String = fc.ShowSave(frm)
	If fileName="" Then Return
	
	Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName), True)
	DateTime.DateFormat=DateFormatAnt
	DateTime.TimeFormat=TimeFormatAnt
	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel " & f,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

End Sub

Sub jamTableViewGestionVentas_ContextMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		'If TagMenuItem="VerPedidoNAV" Then
		Case "VerPedidoNAV"
			'If File.Exists(
			Dim PedidoSel As String
			Dim FilaSeleccionada As Int=jamTableViewGestionVentas.IndicesFilasSeleccionadas.Get(0)
'		Dim lstInfoFila As List=jamTableViewGestionVentas.DatosRegistroIndiceFila(FilaSeleccionada)
'		For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
'			If dc.Campo="Documento" Then
'				PedidoSel=dc.ValorCampo
'				Exit
'			End If
'		Next
			Dim pObj As Object=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Documento")
			PedidoSel=jamTableViewGestionVentas.FixNull(pObj)
			If PedidoSel="" Then
				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Documento.","Error")
				Wait For (msa) Msgbox_Result
				Return
			End If
'		Dim answ As Object =xui.Msgbox2Async("¿Mostrar el pedido " & PedidoSel & " en NAVISION?", "Abrir documento NAVISION", "Sí", "Cancelar", "", Null)
'		Wait For (answ) Msgbox_Result (Result As Int)
'		If Result <>xui.DialogResponse_Positive Then Return
'		
'		Dim NavFilePath As String="C:\Program Files (x86)\Microsoft Dynamics NAV\90\RoleTailored Client\Microsoft.Dynamics.Nav.Client.exe"
'		'//server/service/company
'		Dim NAVHyperlink As String="Dynamicsnav://NAVISION2012:7046/PROIN/PROIN%20PINILLA/runpage?page=42&$filter='No.'%20IS%20" & PedidoSel
'		Log("Microsoft.Dynamics.Nav.Client.exe " & NAVHyperlink)
'		Dim shl As Shell
'		shl.Initialize("shl",NavFilePath, Array As String(NAVHyperlink))
'		'shl.WorkingDirectory="C:\Program Files (x86)\Microsoft Dynamics NAV\90\RoleTailored Client"  ASÍ NO FUNCIONA ... HAY QUE INDICAR LA RUTA COMPLETA EN INITIALIZE
'		Try
'			shl.Run(-1)
'			Log("try Success")
'			Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
'			If Success Then
'				For Each line As String In Regex.Split("[\r\n]+", StdOut)
'					Log(line)
'				Next
'				SetForegroundWindow(PedidoSel)
'			Else
			'
'				Dim msa As Object=xui.MsgboxAsync(StdErr,"Error")
'				Wait For (msa) Msgbox_Result
'			End If
'			
'		Catch
'			Log(LastException)
'			If LastException.Message.Contains(shl.WorkingDirectory) Then
'				Dim msa As Object=xui.MsgboxAsync("La aplicación NAVISION no está instalada en el directorio predeterminado.","Error")
'				Wait For (msa) Msgbox_Result
'			Else
'				Dim msa As Object=xui.MsgboxAsync(LastException.Message,"Error")
'				Wait For (msa) Msgbox_Result
'			End If
'			Return
'		End Try
			Select True
				Case PedidoSel.StartsWith("PV")
					Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido venta",42, "No.", PedidoSel)
				Case PedidoSel.StartsWith("PT")
					Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido venta",5740, "No.", PedidoSel)
				Case Else
					Return
			End Select
			wait for(rSub) complete (success As Boolean)
			If success Then

			Else

			End If
		
		Case "VerArticuloNAV"
			Dim ArticuloSel As String
			Dim FilaSeleccionada As Int=jamTableViewGestionVentas.IndicesFilasSeleccionadas.Get(0)
			Dim lstInfoFila As List=jamTableViewGestionVentas.DatosRegistroIndiceFila(FilaSeleccionada)
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
			If success Then

			Else

			End If
			
		Case "VerFechasPrometidasCompraArticuloNAV"
			Dim FilaSeleccionada As Int=jamTableViewGestionVentas.IndicesFilasSeleccionadas.Get(0)
'			Dim lstInfoFila As List=jamTableViewGestionVentas.DatosRegistroIndiceFila(FilaSeleccionada)
'			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
'				If dc.Campo="Articulo" Then
'					ArticuloSel=dc.ValorCampo
'					Exit
'				End If
'			Next
			Dim ArticuloSel As String=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Articulo")
			If ArticuloSel="" Then
				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Artículo.","Error")
				Wait For (msa) Msgbox_Result
				Return
			End If
			
			Dim TallaSel As String=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Talla")
			Dim SistRepoArticuloSel As Int=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Fabricacion")
			
'			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
'				If dc.Campo="Fabricacion" Then
'					SistRepoArticuloSel=dc.ValorCampo
'					Exit
'				End If
'			Next

			If SistRepoArticuloSel=1 Then
				Dim msa As Object=xui.MsgboxAsync("El artículo " & ArticuloSel & " tiene sistema reposición Fabricación. No está disponible la información de fechas prometidas.","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			
			Wait For(FechasPrometidasComprasArticuloTalla(ArticuloSel,TallaSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"Continuar" Then Return
			Dim lstReg As List=mRes.Get("lstReg")
			Dim DateFormatAnt As String=DateTime.DateFormat
			DateTime.DateFormat="dd/MM/yy"
			Dim sb As StringBuilder
			sb.Initialize
			For Each mF As Map In lstReg
				Dim DocFP As String=mF.Get("Documento")
				Dim QtyPteRecFP As Double=mF.Get("QtyPteRecibir")
				Dim SQtyPteRecFP As String=NumberFormat2(QtyPteRecFP,1,0,0,False)
				'Dim FechaPromAjFP As Long=mF.Get("FechaPromAj")
				Dim FechaPromFP As Long=mF.Get("FechaProm")
				sb.Append("Pedido: " & DocFP & "   Qty Pte: " & SQtyPteRecFP)
				'sb.Append("   Fecha Prom: " & DateTime.Date(FechaPromAjFP)).Append(CRLF)
				If FechaPromFP<DateUtils.SetDate(DateTime.GetYear(DateTime.Now),DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now)) Then
					sb.Append("   Fecha Prom: " & DateTime.Date(FechaPromFP)).Append("  (VENCIDA)").Append(CRLF)
				Else
					sb.Append("   Fecha Prom: " & DateTime.Date(FechaPromFP)).Append(CRLF)
				End If
			Next
'			Dim msa As Object=xui.MsgboxAsync(sb.ToString,"FECHAS PROMETIDAS COMPRA")
'			Wait For (msa) Msgbox_Result
			Dialog.Title="Fechas Prometidas Compra"
			Dim B4XLongMsg As B4XLongTextTemplate
			B4XLongMsg.Initialize
			B4XLongMsg.Resize(700dip,300dip)
			B4XLongMsg.Text=sb.ToString
			Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XLongMsg,"OK","","")
			
			Wait For(rSub) complete (rInt As Int)
			
			DateTime.DateFormat=DateFormatAnt
			
		Case "EnviarEmailAlbaranTransnaturREPSOL"
			JamLoadingIndicator1.MensajeLoading="Comprobando permisos..."
			JamLoadingIndicator1.show
			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cRepsol")) complete (sRes As String)
			JamLoadingIndicator1.Close
			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return
			'Dim PermisoModuloUsuario As String=sRes
			
			Dim FilaSeleccionada As Int=jamTableViewGestionVentas.GetIndiceFilaSeleccionada
			Dim PedidoSel As String
'			Dim pObj As Object=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Documento")
'			PedidoSel=jamTableViewGestionVentas.FixNull(pObj)
'			If PedidoSel="" Then
'				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Documento.","Error")
'				Wait For (msa) Msgbox_Result
'				Return
'			End If
			Dim PedidoSel As String=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Documento")
			Dim ClienteSel As String=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"Cliente")
			Dim GRPSel As String=jamTableViewGestionVentas.GetValorSQLCampoFila(FilaSeleccionada,"GRP")
			'If ClienteSel<>"07506" Or ClienteSel<>"07548" Then
			If GRPSel<>"07506" Then
				JamLoadingIndicator1.close
				Dim msa As Object=xui.MsgboxAsync($"El pedido ${PedidoSel} no corresponde al GRP REPSOL"$,"Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			
			JamLoadingIndicator1.MensajeLoading=$"Buscando albaranes del pedido ${PedidoSel}"$
			JamLoadingIndicator1.Show
			Wait For(ListaAlbaranesVentaRegistradosPedidoVenta(PedidoSel)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then
				JamLoadingIndicator1.Close
				 Return
			End If
			
			Dim lstReg As List=mRes.Get("lstReg")
			If lstReg.Size=0 Then
				JamLoadingIndicator1.Close
				Dim msa As Object=xui.MsgboxAsync($"No hay albaranes registrados para el pedido de venta ${PedidoSel}"$,"Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			
			JamLoadingIndicator1.Close
			Dim lstAlbaranesPedido As List
			lstAlbaranesPedido.Initialize
			Dim DateFormatAnt As String=DateTime.DateFormat
			DateTime.DateFormat="dd/MM/yyyy"
			For Each mDataAlb As Map In lstReg
				Dim sAlb As String=$"${mDataAlb.Get("Documento")}  Fecha: $Date{mDataAlb.Get("FechaDocumento")} "$
				lstAlbaranesPedido.Add(sAlb)
			Next
			DateTime.DateFormat=DateFormatAnt
			Dialog.Title="Selecciona ALBARAN"
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
		
			B4XListDlg.Options=lstAlbaranesPedido
			B4XListDlg.Resize(600dip,300dip)
	
			Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")

			Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
			If bCancel.IsInitialized Then
				'Log("bCancel" & bCancel.Text)
				bCancel.Left=bCancel.Left-50dip
				bCancel.Width=bCancel.Width+30dip
				bCancel.TextSize=18
			End If
	
			Wait For (rSub) Complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then
				Return
			End If
			
			Dim sDocumentoSel As String=B4XListDlg.SelectedItem
			Dim mAlbaranSel As Map=lstReg.Get(lstAlbaranesPedido.IndexOf(sDocumentoSel))
			Dim AlbaranSel As String=mAlbaranSel.Get("Documento")

			wait for(Utilidades.MsgBox2XUI("Confirma",$"¿enviar email a Transnatur correspondiente al albarán ${AlbaranSel}?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
'			JamLoadingIndicator1.show
'			Wait For(Utilidades.CheckPermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"cRepsol")) complete (sRes As String)
'			JamLoadingIndicator1.Close
'			If sRes="NO" Or sRes="ERROR" Or sRes="DENIED" Then Return

			JamLoadingIndicator1.MensajeLoading="Cargando configuración..."
			JamLoadingIndicator1.Show
	
			Wait For(CargaRepsolConfiguracionLogisticaAlbaranesVenta) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then
				JamLoadingIndicator1.Close
				'SalirModulo
				Return
			End If
			Dim mData As Map=mRes.Get("mDataConf")
			CarpetaFicherosCSVRepsol=mData.Get("CampoString1")
			CarpetaFicherosPDFRepsol=mData.Get("CampoString5")
			BuzonCompartidoEmailEnvioInfoRepsol=mData.Get("CampoString2")
			DireccionDestinoEmailsRepsol=mData.Get("CampoString3")
			DireccionCCDestinoEmailsRepsol=mData.Get("CampoString4")
	
			BorrarVBSScriptDireccionRemitenteEmailOutlookREPSOL
			BorrarVBSScriptEnvioEmailOutlookREPSOL
	
			CrearVBSScriptDireccionRemitenteEmailOutlookREPSOL
			CrearVBSScriptEnvioEmailOutlookHTMLREPSOL
	
			JamLoadingIndicator1.close
			
			CrearEmailInfoLogistica(AlbaranSel)
			
	End Select
	'End If
	
End Sub

Sub jamTableViewGestionVentas_ValidacionEdicionTableCell(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView, ValorValidacion As Object)
	Dim AliasCampo As String=DatosCeldaSeleccionada.AliasCampo
	Select AliasCampo
		Case "NombreResponsableCuenta"
			Dim ValorValidacionNombreRespCuenta As String=ValorValidacion
			If ValorValidacionNombreRespCuenta.ToUpperCase.StartsWith("ANA") Then
				jamTableViewGestionVentas.ValidacionEditedCell(DatosCeldaSeleccionada, ValorValidacionNombreRespCuenta.ToUpperCase,True)
			Else
				fx.Msgbox(frm,"El nombre debe empezar por ANA.","Error garrafal!!!")
				jamTableViewGestionVentas.ValidacionEditedCell(DatosCeldaSeleccionada, ValorValidacion,False)
			End If
		Case Else
			jamTableViewGestionVentas.ValidacionEditedCell(DatosCeldaSeleccionada, ValorValidacion,True)
	End Select
	
End Sub

Sub jamTableViewGestionVentas_AccionSalirJamTableView
	jamTableViewGestionVentas.GuardarConfiguracionColumnasUsuario
	'jamTableViewGestionVentas.LiberarRecursosTableView
	'frm.RootPane.RemoveAllNodes
	jamTableViewGestionVentas.LimpiarTabla
	MainMenu2.Show
	frm.Close
	
End Sub
Sub jamTableViewGestionVentas_CambioEnFilaSeleccionada(lstDatosFilaSeleccionada As List)
	Dim STexto As String
	Dim Doc As String
	Dim Linea As Int
	Dim Cliente As String
	Dim NombreCliente As String
	Dim TipoArtCompraFab As String
	For Each dC As DatosCampoRegistroJamTableView In lstDatosFilaSeleccionada
		If dC.AliasCampo="Documento" Then
			Doc=dC.ValorCampo
		End If
		If dC.AliasCampo="Linea" Then
			Linea=dC.ValorCampo
		End If
		If dC.AliasCampo="Cliente" Then
			Cliente=dC.ValorCampo
		End If
		If dC.AliasCampo="NombreCliente" Then
			NombreCliente=dC.ValorCampo
		End If
		If dC.AliasCampo="Fabricacion" Then
			If 0=dC.ValorCampo Then
				TipoArtCompraFab="Compra"
			Else
				TipoArtCompraFab="Fabricación"
			End If
			
		End If
		
	Next
	STexto="Documento: " & Doc & " Línea: " & Linea & " Cliente: " & Cliente & " " & NombreCliente & " Tipo Art: " & TipoArtCompraFab
	jamTableViewGestionVentas.TextoPanelInfoJamTableView=STexto
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

Sub FechasPrometidasComprasArticuloTalla(Art As String, Talla As String) As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize

	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"FechasPrometidasCompraArticuloTalla",Array(Art,Talla), Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query FechasPrometidasCompraArticuloTalla ","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'LimpiarDatos
			
		'' codigo callback
	Else
		If mresult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos de fecha prometidas para el artículo " & Art & " talla " & Talla & ".","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
		Else
			lstReg=mresult.Get("lstRes")
			Accion="Continuar"
		End If
	End If
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Return mRes
End Sub

Sub ListaAlbaranesVentaRegistradosPedidoVenta(PedidoVentaSel As String) As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	
	Dim Comando As String="ListaAlbaranesVentaRegistradosPedidoVenta"

	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(PedidoVentaSel), Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	'lblStatus.Text=""
		
	If mresult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync($"Error de conexion servidor/query ${Comando} "$,"Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
	Else
		If mresult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync($"No hay albaranes de venta registrados (no anulados) para el pedido de venta ${PedidoVentaSel}"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
		Else
			lstReg=mresult.Get("lstRes")
			Accion="OK"
		End If
	End If
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Return mRes
End Sub


#Region REPSOL


Sub CargaRepsolConfiguracionLogisticaAlbaranesVenta As ResumableSub

	Dim Accion As String
	Dim mDataConf As Map
	mDataConf.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mDataConf",mDataConf)
	Dim Comando As String="RepsolConfiguracionLogisticaAlbaranesVenta"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			JamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync($"No existe la configuración necesaria para la conexión."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			mDataConf=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mDataConf", mDataConf)
			
		End If
	End If
	Return mRes
End Sub



Sub CargaRepsolInformacionLogisticaAlbaranVenta(AlbaranNAV As String) As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="RepsolInformacionLogisticaAlbaranVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(AlbaranNAV), Me)

	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			JamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync($"No existe el documento ${AlbaranNAV} en navision, o no tiene lineas no corregidas de tipo producto."$,"Aviso")
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

Sub SeleccionarDocumentoREPSOL As ResumableSub
	
	Dialog.Title="Indica Documento"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt=xui.DialogResponse_Cancel Then Return ""
	
	Dim Documento As String=InputDlg.Text
	
	If Documento="" Then
		Dim msa As Object=xui.MsgboxAsync("No se ha indicado documento","Aviso")
		Wait For (msa) Msgbox_Result
		Return ""
	End If
	
	Return Documento
	
End Sub
	

Sub CrearEmailInfoLogistica(Documento As String)
	
	JamLoadingIndicator1.MensajeLoading=$"Cargando información logística documento ${Documento}"$
	JamLoadingIndicator1.Show
	Wait For(CargaRepsolInformacionLogisticaAlbaranVenta(Documento)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		JamLoadingIndicator1.close
		 Return
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	Log(lstReg)
	
	If lstReg.Size=0 Then
		JamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync($"No hay datos en el documento ${Documento} para generar el fichero. Revisar información en navision."$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim RutaFicheroPDFDocumento As String
	Dim NombreFicheroPDFDocumento As String=$"${Documento}.pdf"$
	If File.Exists(CarpetaFicherosPDFRepsol,NombreFicheroPDFDocumento) Then
		RutaFicheroPDFDocumento=File.Combine(CarpetaFicherosPDFRepsol,NombreFicheroPDFDocumento)
	Else
		wait for(Utilidades.MsgBox2XUI("Confirma",$"No existe el fichero ${NombreFicheroPDFDocumento} en la carpeta ${CarpetaFicherosPDFRepsol}
¿Continuar? (Puedes añadir manualmente el PDF en el email"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then
			JamLoadingIndicator1.close
			 Return
		End If
	End If
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat=DateFormatAnt
	
	Dim lstLineasAlbaran As List
	lstLineasAlbaran.Initialize
	
	Dim mData0 As Map=lstReg.Get(0)
	'encabezados
	Dim iDX As Int
	Dim arrH(mData0.size) As String=mapKeysToArray(mData0)
	lstLineasAlbaran.Add(arrH)
	
	Dim su As StringUtils
	For Each mData As Map In lstReg
		Log(mData)
		Dim row() As Object=mapValuesToArrayOfStringsConCamposFecha(mData)
'		For i=0 To row.Length-1
'			Log(row(i))
'		Next
		lstLineasAlbaran.Add(row)
	Next
	
	DateTime.DateFormat=DateTime.DateFormat
	
	'Dim DirFicherosAlbaranesVentaRepsol As String="\\192.168.10.4\Publico\Gestion de Ventas\CLIENTES\REPSOL\Ficheros csv Albaranes"
	Dim DirFicherosAlbaranesVentaRepsol As String=CarpetaFicherosCSVRepsol
	
'	Dim fCH As FileChooser
'	fCH.Initialize
'	fCH.InitialDirectory=DirFicherosAlbaranesVentaRepsol
'	fCH.InitialFileName=$"${Documento}.csv"$
'	fCH.SetExtensionFilter("Ficheros csv Albaranes Venta",Array As String("*.csv"))
'	Dim RutaFichero As String=fCH.ShowSave(frm)
'	If RutaFichero="" Then Return
'	
'	Dim NombreFichero As String=File.GetName(RutaFichero)
'	
'	If NombreFichero<>$"${Documento}.csv"$ Then
'		Dim msa As Object=xui.MsgboxAsync($"Es obligatorio que el nombre del fichero sea ${Documento}.csv"$,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If

	Dim NombreFichero As String=$"${Documento}.csv"$
	
	
	Dim parser As CSVParser
	parser.Initialize
	Dim s As String = parser.GenerateString(lstLineasAlbaran, TAB)
	File.WriteString(DirFicherosAlbaranesVentaRepsol,NombreFichero, s)
	
	Dim RutaFicheroDocumento As String=File.Combine(DirFicherosAlbaranesVentaRepsol,NombreFichero)
	
	'
'	
'	Dim msa As Object=xui.MsgboxAsync($"Fichero grabado, ${RutaFicheroDocumento}"$,"Aviso")
'	Wait For (msa) Msgbox_Result
	
	wait for(SeleccionarDireccionRemitenteEmailsREPSOL) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar la dirección desde la que enviar el correo al operador logístico." ,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	Else
		Dim msa As Object = xui.Msgbox2Async("La dirección DESDE la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmailsRepsol, "Direccion envío email", "Sí", "Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		Select rInt
			Case xui.DialogResponse_Cancel
				JamLoadingIndicator1.close
				Return
		End Select
	End If
	
	Dim sbBody As String=HTMLBodyEmail
	If DireccionCCDestinoEmailsRepsol="" Then DireccionCCDestinoEmailsRepsol="None"
	
	Dim EmailSubject As String=$"Albarán venta REPSOL ${Documento}"$
	
	JamLoadingIndicator1.MensajeLoading="Creando email..."
	JamLoadingIndicator1.Show
	wait for(EjecutarVBSScriptEnviarEmailREPSOL(DireccionSeleccionadaRemitenteEmailsRepsol,DireccionDestinoEmailsRepsol,DireccionCCDestinoEmailsRepsol, _
		EmailSubject,sbBody,RutaFicheroDocumento,RutaFicheroPDFDocumento)) complete (mRes As Map)
	Log("mRes: " & mRes)
	Dim Success As Boolean=mRes.Get("Success")
	Dim ExitCode As Int=mRes.Get("ExitCode")
	Dim StdOut As String=mRes.Get("StdOut")
	Dim StdErr As String=mRes.Get("StdErr")
	JamLoadingIndicator1.Close
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error spt creación de email" & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Sleep(250)
	
	Dim msa As Object=xui.MsgboxAsync("Email creado","Aviso")
	Wait For (msa) Msgbox_Result

	Wait For(AbrirVentanaOutlookEmail($"${EmailSubject} - Mensaje (HTML)"$,Documento)) complete (Success As Boolean)

End Sub


'Private Sub btnSeleccionarDocumento_Click
'	SeleccionarDocumento
'End Sub

Sub mapKeysToArray(mData As Map) As String()
	Dim arr(mData.Size) As String
	Dim iDx As Int
	For Each key As String In mData.Keys
		arr(iDx)=key
		iDx=iDx+1
	Next
	Return arr
End Sub

public Sub mapValuesToArrayOfStringsConCamposFecha(m As Map) As Object()
	Dim arr(m.Size) As String  'array size is double of the map because both keys and values are elements
	Dim i As Int=0
	Dim value As Object
	For Each key As Object In m.Keys
		
		value=m.Get(key)
		LogColor($"key=${key}, value=${value}"$, xui.Color_Blue)
		If key.As(String).ToUpperCase.StartsWith("FECHA")Then
			arr(i)=DateTime.Date(value)
		Else
			If value Is String Then
				Dim sValue As String=value
				sValue=sValue.Replace(TAB,"")
				arr(i)=sValue
			Else
				Dim intValue As Int=value
				Dim sValue As String=intValue
				arr(i)=sValue
			End If
		End If
		i =i +1
	Next
    
	Return arr
End Sub

public Sub mapToArrayOfStringsConCamposFecha(m As Map) As Object()
	Dim arr(m.Size * 2) As Object  'array size is double of the map because both keys and values are elements
	Dim i As Int=0
	Dim value As Object
	For Each key As Object In m.Keys
		
		value=m.Get(key)
		LogColor($"key=${key}, value=${value}"$, xui.Color_Blue)
		arr(i)=key
		i = i +1
		If key.As(String).ToUpperCase.StartsWith("FECHA") And i Mod 2=0 Then
			arr(i)=DateTime.Date(value)
		Else
			If value Is String Then
				arr(i)=value
			Else
				Dim intValue As Int=value
				Dim sValue As String=intValue
				arr(i)=sValue
			End If
		End If
		i =i +1
	Next
    
	Return arr
End Sub

Sub GenerateString (Table As List, SeparatorChar As String) As String
	Dim eol As String = Chr(10)
	If Table.Size = 0 Then Return ""
	Dim sb As StringBuilder
	sb.Initialize
	For Each row() As String In Table
		For i = 0 To row.Length - 1
			Dim Wrap As Boolean
			Dim word As String = row(i)
			If word.Contains(SeparatorChar) Then Wrap = True
			If word.Contains(QUOTE) Then
				Wrap = True
				word = word.Replace(QUOTE, $""""$)
			End If
			If Wrap Then
				sb.Append(QUOTE).Append(word).Append(QUOTE)
			Else
				sb.Append(word)
			End If
			sb.Append(SeparatorChar)
		Next
		sb.Remove(sb.Length - 1, sb.Length)
		sb.Append(eol)
	Next
	sb.Remove(sb.Length - eol.Length, sb.Length)
	Return sb.ToString
End Sub


#Region Email
Sub CrearVBSScriptDireccionRemitenteEmailOutlookREPSOL
	
	BorrarVBSScriptDireccionRemitenteEmailOutlookREPSOL
	
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

Sub BorrarVBSScriptDireccionRemitenteEmailOutlookREPSOL
	If File.Exists(xui.DefaultFolder,"smfpromc.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc.vbs")
	End If
End Sub


Sub SeleccionarDireccionRemitenteEmailsREPSOL As ResumableSub
	
	wait for(EjecutarVBSScriptDireccionesEmailREPSOL) complete (mRes As Map)
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
	
'	lstDireccionesCuentasEmail.Add("atencionalcliente@proin-pinilla.com")
'	lstDireccionesCuentasEmail.Add("ict@proin-pinilla.com")
	
	If lstDireccionesCuentasEmail.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	''lstDireccionesCuentasEmail.Add("compras@proin-pinilla.com")
	
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
	

	DireccionSeleccionadaRemitenteEmailsRepsol=B4XListDlg.SelectedItem
	
	If DireccionSeleccionadaRemitenteEmailsRepsol="atencionalcliente@proin-pinilla.com" Then DireccionSeleccionadaRemitenteEmailsRepsol="Servicio de Atención al Cliente"
	
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


Sub EjecutarVBSScriptDireccionesEmailREPSOL As ResumableSub
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

Sub EjecutarVBSScriptEnviarEmailREPSOL(SenderAddr As String, ReceiverAddr As String,CCReceiverAddr As String,Subject As String, Body As String,  FileAttch As String, FileAttch2 As String) As ResumableSub
	
	Body=Body.Replace(CRLF,"<br>")
	
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromc2.vbs",SenderAddr, ReceiverAddr,CCReceiverAddr,Subject, Body, FileAttch,FileAttch2))  ' nologo para no mostar avisos windows
	shl.WorkingDirectory = xui.DefaultFolder
	shl.Run(-1)
	frm.RootPane.MouseCursor=fx.Cursors.WAIT
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	Log("Success: " & Success)
	Log(StdOut)
	mRes.Put("Success",True)
	mRes.Put("StdOut",StdOut)
	mRes.Put("StdErr",StdErr)
	mRes.Put("ExitCode",ExitCode)
	Return mRes
End Sub


Sub HTMLBodyEmail As String
	Dim strBodyHTML As String
	strBodyHTML = $"<p>Buenos días<br><br>
Adjunto el albarán en pdf y el archivo csv para que procedáis a la preparación de la mercancía y su envío a la mayor brevedad posible.<br>
En caso de alguna incidencia por favor indicádnoslo.<br>
<br>Muchas gracias"$  
	Return strBodyHTML
End Sub


Sub CrearVBSScriptEnvioEmailOutlookHTMLREPSOL

	BorrarVBSScriptEnvioEmailOutlookREPSOL
	
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
		if WScript.Arguments(2)<>"None" then
			objMailItem.CC = WScript.Arguments(2)
		end if
		objMailItem.Subject = WScript.Arguments(3)
	'objMailItem.HTMLBody = WScript.Arguments(4) & "<br><br>" & objMailItem.HTMLBody & "</p>"
		objMailItem.HTMLBody = "<p><br>" & WScript.Arguments(4) & "<br>" & signature & "</p>"
		objMailItem.Attachments.Add WScript.Arguments(5)
		if WScript.Arguments(6)<>"" then
			objMailItem.Attachments.Add WScript.Arguments(6)
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

Sub BorrarVBSScriptEnvioEmailOutlookREPSOL
	If File.Exists(xui.DefaultFolder,"smfpromc2.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc2.vbs")
	End If
End Sub


Sub AbrirVentanaOutlookEmail(TituloWindow As String, Documento As String) As ResumableSub
	' comprobar si ya existe la ventana
	#if debug
	Log("Buscando window title " & TituloWindow)
	#End If
	
	Dim WU As JavaObject
	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
	Dim FlagOk As Boolean
	For Each JO As JavaObject In L
		Dim t As String = JO.RunMethod("getTitle",Null)
		#if debug
		Log("window title" & t)
		#End If
		

		If t.Contains(TituloWindow) Then
'			Dim m As Matcher=Regex.Matcher(".*" & TituloWindow & ".*" & ValorRegistro, t)
'			Do While m.Find
'				Log("match " & m.Match)
'				FlagOk=True
'				Exit
'			Loop
			FlagOk=True
			Exit
		End If
	Next
	
	If FlagOk Then
		SetForegroundWindowREPSOL(t,False)
		Return True
	Else
		Dim msa As Object=xui.MsgboxAsync($"No se ha encontrado la ventana de Outlook con el correo correspondiente al documento ${Documento}
Busca manualmente la ventana en outlook para enviar el email.
"$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If

		
End Sub


Sub SetForegroundWindowREPSOL(Title As String, JustFind As Boolean) As Boolean
	Return Me.As(JavaObject).RunMethod("SetForegroundWindow", Array(Title, JustFind))
End Sub

#if Java
import com.sun.jna.platform.win32.*;
public static boolean SetForegroundWindow(String title, boolean justFind) {
    User32 user32 = com.sun.jna.platform.win32.User32.INSTANCE;
    for (com.sun.jna.platform.DesktopWindow s : com.sun.jna.platform.WindowUtils.getAllWindows(false)) {
        String t = s.getTitle();
        if (t.toLowerCase().equals(title.toLowerCase())) {
            if (!justFind) {
                user32.SetForegroundWindow(s.getHWND());
                user32.SetFocus(s.getHWND());
                user32.ShowWindow(s.getHWND(), 3);
            }
            return true;
        }
        
    }
    return false;
}
#End If



#End Region



#if java
import javafx.scene.control.*; 
import javafx.util.Callback;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.TableColumn;

import javafx.scene.paint.Paint;
import java.util.Arrays;
import java.util.List;

import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

import javafx.geometry.Pos;

import java.text.DecimalFormat;

/*
import java.util.function.Function;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
*/

import java.text.SimpleDateFormat; 



 public static void setColumnaWrapText(TableColumn tc,  final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
				Text text = new Text();
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        return;
                    }
					String textoItem=(String)item;
                   // text.setWrappingWidth(getTableColumn().getWidth() - 10);
					text.wrappingWidthProperty().bind(getTableColumn().widthProperty().subtract(35));
                    text.setText(textoItem);
                    setGraphic(text);
					setPrefHeight(Control.USE_COMPUTED_SIZE);
                }
            };

		}
    });
}




Label label = new Label("My Label");


public static void setColorValorMenorColorValorMayorIgualColumna(TableColumn tc,  final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Number>() {
                @Override
                public void updateItem(Number item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						String str = args[0].toString(); 
						int valorInf = Integer.valueOf(str);
       					if((int)item < valorInf) {
							String sColorMenor =  String.valueOf(args[1]);
							Color colorMenor = Color.valueOf(sColorMenor);
							setTextFill(colorMenor);
       						//setText(""+item);
							//setStyle("-fx-alignment: CENTER-RIGHT;");
							String sFormato =  String.valueOf(args[3]);
							DecimalFormat df = new DecimalFormat(sFormato);
							setText(df.format(item.doubleValue()));
							setStyle("-fx-alignment: CENTER-RIGHT;");
      					} else {
							String sColorMayorIgual =  String.valueOf(args[2]);
							Color colorMayorIgual = Color.valueOf(sColorMayorIgual);
							setTextFill(colorMayorIgual);
       						//setText(""+item);
							//setStyle("-fx-alignment: CENTER-RIGHT;");
							String sFormato =  String.valueOf(args[3]);
							DecimalFormat df = new DecimalFormat(sFormato);
							setText(df.format(item.doubleValue()));
							setStyle("-fx-alignment: CENTER-RIGHT;");
      					}
     				}
	 				else {
	          			setText(null);
              			setTextFill(null);
						setStyle(null);
						setGraphic(null);
              			return;
	 				}
                }
            };
        }
    });
}



public static Color getColorByName(String name) {
    try {
        return (Color)Color.class.getField(name.toUpperCase()).get(null);
    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
        e.printStackTrace();
        return null;
    }
}

public static String format(double val) {
    String in = Integer.toHexString((int) Math.round(val * 255));
    return in.length() == 1 ? "0" + in : in;
}

public static String toHexString(Color value) {
    return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) + format(value.getOpacity()))
            .toUpperCase();
}


public static void setFormatoColumnaStatus(TableColumn tc,  final Object[] args)  throws Exception {
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						
					
						//setStyle(sCSSStyle);
						
						
						String Status=(String)item;
						
						String sColorF=new String("");
						
						String sColorT=new String("");
						
						//String sColorB=new String("")
						
						
					     switch (Status) 
					        {
							
							// prefijo #99 = opacidad=60%
					            case "P+":      
									sColorT = "black";
									sColorF = "lime"; 
									//sColorB = "lime";

					                break;
									
					            case "P-": 
									sColorT = "black";
									sColorF = "orange";  
									//sColorB = "orange";
					              	break;
									
					            case "L+":  
									sColorT = "red";
									sColorF = "yellow";  
									//sColorB = "yellow";
					                break;
									
					            case "L-":  
									sColorT = "red";
									sColorF = "khaki";  
									//sColorB = "khaki";
					                break;

					            default: 
									sColorT = "black";
									sColorF = "transparent";
									//sColorB = "lightgray";

					                break;
					        }
					
						Color colorF = Color.valueOf(sColorF);
						Color colorFSemiTransparente=colorF.deriveColor(1,1,1,0.5);
						 String hexColorF = toHexString(colorFSemiTransparente);
						 
						 Color colorT = Color.valueOf(sColorT);
						 String hexColorT = toHexString(colorT);
						 
						// Color colorB = Color.valueOf(sColorB);
						// String hexColorB = toHexString(colorB);
						
						//setStyle("-fx-alignment: CENTER;-fx-border-color: "+ hexColorB + ";-fx-border-width: 1;");
						//setStyle(isSelected() ? 
						//	"-fx-border-color: red red red red;-fx-text-fill: black;-fx-border-width: 1px;-fx-background-color: lightskyblue;":
						//   "-fx-background-color: " + hexColorF +";-fx-opacity: 0.6;");
						  setStyle("-fx-text-fill:" + hexColorT +";-fx-background-color: " + hexColorF + ";-fx-background-insets: 0.5 0.5 0.5 0.5 ;");
						setAlignment(Pos.CENTER);
						//setBackground(new Background(new BackgroundFill(colorF, CornerRadii.EMPTY, new Insets(0.5))));
						//String sColorT =  String.valueOf(args[0]);
						//Color colorT = Color.valueOf(sColorT);
						//Paint colorT = Paint.valueOf(sColorT);
						//setTextFill(colorT);
       					setText(""+item);
					}
	 				else {
	          			setText(null);
              			//setTextFill(null);
						setStyle(null);
              			return;
	 				}
                }
            };
        }
    });
}

public static void setFormatoColumnaFechaVencida(TableColumn tc,  final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Long>() {
                @Override
                public void updateItem(Long item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
					
						setAlignment(Pos.CENTER);
						
						if (item!=0){
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							String sFecha = sdf.format(new Date(item.longValue())); 
							setText(sFecha);
							
							Long TicksHoy=Long.parseLong((String.valueOf(args[0])));
							if (item<TicksHoy && item>0){
								String sColorF=String.valueOf(args[1]);
								Color colorF = Color.valueOf(sColorF);
								Color colorFSemiTransparente=colorF.deriveColor(1,1,1,0.75);
								String hexColorF = toHexString(colorFSemiTransparente);
								
								String sColorT=String.valueOf(args[2]);
								Color colorT = Color.valueOf(sColorT);
								String hexColorT = toHexString(colorT);
								
								setStyle("-fx-text-fill:" + hexColorT +";-fx-background-color: " + hexColorF + ";-fx-background-insets: 0.5 0.5 0.5 0.5 ;");
							}
							else {
								setStyle("-fx-text-fill: black;-fx-background-color: transparent;-fx-background-insets: 0.5 0.5 0.5 0.5 ;");
							}
						}
						else {
							setText(null);
              				setStyle(null);
						}
     				}
	 				else {
	          			setText(null);
              			//setTextFill(null);
						//setGraphic(null);
						setStyle(null);
              			return;
	 				}
                }
            };
        }
    });
} 


public static void setColumnaBooleanaNumericaColorNOSITextoVacio(TableColumn tc,   final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						if((int)item == 0) {
							String sColorNO =  String.valueOf(args[0]);
							Color colorNO = Color.valueOf(sColorNO);
							String hexColorNO = toHexString(colorNO);
                      		//setTextFill(colorNO);
							setStyle("-fx-text-fill:" + hexColorNO +";");
       						setText("NO");
							setAlignment(Pos.CENTER);
      					} else {
       						setText(null);
							setStyle(null);
      					}
     				}
	 				else {
	          			setText(null);
              			//setTextFill(null);
						setStyle(null);
						//setGraphic(null);
              			return;
	 				}
                }
            };
        }
    });
}

#End If






