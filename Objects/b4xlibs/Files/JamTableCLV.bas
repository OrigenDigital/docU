B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@

#Event: ItemClick(Index As Int, Value As Object)
#Event: ItemLongClick(Index As Int, Value As Object)
#Event: ReachEnd
#Event: VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'#Event: ScrollChanged (Offset As Int)
'#Event: CrearItemJamTableCLV(mData as map)
#Event: AccionSalirJamTableCLV

#Event: ContextMenuItem_Action(TagMenuItem as string)
#Event: ContextTableColumnMenuItem_Action(AliasCampoTableColumn as string, TagMenuItem as string)
#Event: MenuBarMenuItem_Action(TagMenuItem as string)


#DesignerProperty: Key: IncluirBotonSalir, DisplayName: Botón Acción Salir, FieldType: Boolean, DefaultValue: False, Description: Botón Salir incluido en CustomView
#DesignerProperty: Key: PanelInfoVisible, DisplayName: Panel Info Visible, FieldType: Boolean, DefaultValue: false, Description: True: Se muestra un panel con un label en la parte inferior de la pantalla


Sub Class_Globals
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Public mBase As B4XView
	Private xui As XUI 'ignore
	Public Tag As Object
	Private fx As JFX
	Private clvDatos As CustomListView
	Private clvFiltros As CustomListView
	Private pnlMainJamTableCLV As Pane
	
	Private mSQL As SQL
	
	Private LayoutLoaded As Boolean
	Private mParentForm As Form
	
	Private Dialog As B4XDialog
	
	Private mIncluirBotonSalir As Boolean
	Private lblMostrarEliminarFiltros As Label
	
	Private MenuBar As MenuBar
	Private lstItemsDefaultMenu As List
	Public MenuBarLinea = "MenuLineajamTableCLV", MenuBarAcciones="MenuAccionesjamTableCLV", MenuBarTabla ="MenuTablajamTableCLV" As String
	
	Private btnAddCampoOrdenacionSQL As Button
	Private btnEliminarCampoOrdenacionSQL As Button
	Private cboCampoOrdenacionSQL As ComboBox
	Private cboTipoOrdenacionSQL As ComboBox
	Private CLVOrdenSQLjamTableCLV As CustomListView

	
		
	Private mLeft As Int
	Private mTop As Int
	Private mWidth As Int
	Private mHeight As Int

	'Type clvJAMTableCLVFiltroItemValue (cboCampoFiltro As ComboBox, cboAndOrFiltro As ComboBox, cboComparadorFiltro As ComboBox, cbComparadorFiltro As ChoiceBox, cboValorFiltro As ComboBox, txtValorFiltro As TextField, txtValorFechaFiltro As TextField, btnSelFechaFiltro As Button, chkValorFiltro As CheckBox)
	Type clvJAMTableCLVFiltroItemValue (cboCampoFiltro As ComboBox, cboAndOrFiltro As ComboBox,  cbComparadorFiltro As ChoiceBox, cboValorFiltro As ComboBox, txtValorFiltro As TextField, txtValorFechaFiltro As TextField, btnSelFechaFiltro As Button, chkValorFiltro As CheckBox)
	Type clvJAMTableCLVOrdenSQLItemValue (cboCampoOrdenacionSQL As ComboBox, cboTipoOrdenacionSQL As ComboBox)
	Type CampoOrigenDatosJamTableCLV (ID As Int, AliasCampo As String, Campo As String, CampoCalculado As Boolean , TipoDato As String, EsFecha As Boolean, EsBooleano As Boolean, ValorTrueCampoBooleano As Object, KeyID As Int, NoNulo As Boolean, ConValorDefecto As Boolean, ValorDefecto As Object, _
	ColumnaTableCLV As Boolean, EncabezadoColumna As String, OrdenColumna As Int, AnchoColumna As Double, AlineacionColumna As String, ColumnaOcultable As Boolean, TipoControlFiltro As String, ColumnaVisible As Boolean, _
	ColorTextoCelda As String, ColorFondoCelda As String, ColorBordeCelda As String, AnchoBordeCelda As Int, TipoControlEdicion As String )

	Type CampoPrimaryKeyJamTableCLV (Campo As String, AliasCampo As String, OrdenClave As Int)
	Type ContextMenuItemColumnaJamTableCLV (AliasCampo As String,  TextoMenuItem As String, TagMenuItem As String, ImageMenuItem As Image)
	
	Type DatosItemCLVJamTableCLV(pnl As Pane, Value As Object)
	
	Type DatosOrdenSQLJamTableCLV (IndiceOrdenSQL As Int, CampoOrdenSQL As String, AliasCampoOrdenSQL As String, TipoOrdenSQL As String)

	Private lstMembersCampoOrigenDatosJamTableCLV As List=Array("ID", "AliasCampo", "Campo", "CampoCalculado", "TipoDato", "EsFecha", "KeyID", "NoNulo", "ConValorDefecto", "ValorDefecto", _
		 "EncabezadoColumna", "TipoControlFiltro")
	
	Private mLstCamposOrigenDatos As List  ' lista de elementos CampoOrigenDatosJAMTableCLV
	Private mLstCamposOrigenDatosConfiguracionOriginal As List
	Private msCampostblOrigenDatos As String
	Private mlstCamposOrigenDatosNoCalculados As List
	Private mlstCamposPrimaryKey As List
	
	Private NombreJSONOrigenDatos As String
	Private NombreJSONOrigenDatosUsuario As String
	Private FechaUltimaModificacionJSON As Long
	
	
	Public sCamposFiltrados As String
	Private lstOperadoresFiltros As List
	Private lstCamposFiltros As List
	Private lstComparadoresFiltros As List
	Public lstValoresFiltros As List
	
	Private lstComparadoresTexto As List
	Private lstComparadoresFechas As List
	Private lstComparadoresNumericos As List
	Private lstComparadoresCamposTipoControlComboBox As List
	Private lstComparadoresBooleanos As List
	
	Private lblTitleFiltroDonde As Label
	Private cboCampoFiltro As ComboBox
	Private cboCampoFiltroUserChange As Boolean
	Private cboAndOrFiltro As ComboBox
	Private cboAndOrFiltroUserChange As Boolean
	'Private cboComparadorFiltro As ComboBox
	Private cbComparadorFiltro As ChoiceBox
	'Private cboComparadorFiltroUserChange As Boolean
	Private cbComparadorFiltroUserChange As Boolean
	Private cboValorFiltro As ComboBox
	Private cboValorFiltroUserChange As Boolean
	Private txtValorFiltro As TextField
	Private btnSelFechaFiltro As Button
	Private txtValorFechaFiltro As TextField
	Private chkValorFiltro As CheckBox
	Private chkValorFiltroUserChange As Boolean
	
	Private ActualizarFiltroTextFieldAction As Boolean
	
	Private OrigenDatosConfiguradoOK As Boolean
	Private FiltrosVisibles As Boolean
	
	Private lblFirst As Label
	Private lblLast As Label
	Private lblNext As Label
	Private lblPrior As Label
	Private lblRecords As Label
	Private lblPageRecords As Label
	Private pnlNavButtons As Pane
	
	Private mPaginacion As Boolean  
	
	Private pnlMainJamTableCLV As Pane
	Private lstNodosHabilitados As List
	
		
	Private mFiltroActual As String
	Private FiltrosVisibles As Boolean
	Private NumCamposConControlFiltro As Int
	
	Private NTotalRegistros, NTotalRegistrosFiltrados, NPrimerRegistroVisible, NUltimoRegistroVisible As Int
	'Private NTotalRegistros, NTotalRegistrosFiltrados, NPrimerRegistroVisible, NUltimoRegistroVisible As Int
	
	Private lstOrdenSQL As List
	
	Private mlstIndicesFilasVisibles As List
	
	Private mContextMenu As ContextMenu
	Private lstContextMenuItemsGenerales As List
	Private lstContextMenuItemsColumna As List
	Private lstContextMenuItemsColumnaSeleccionada As List
	
	

	Private mPanelInfoVisible As Boolean
	Private lblInfoJamTableCLV As B4XView
	
	Private mNombreAplicacion As String
	Private mNombreUsuarioWindows As String
	
	Private lblSalirJamTableCLV As Label

	Private CLVCustomDialogJamTableCLV As CustomListView
	
	Private jamCircularProgressBarCLV As jamCircularProgressBar
	Private pnlInfoJamTableCLV As Pane
	
	Private TipoControlFiltro_TextField, TipoControlFiltro_ComboBox, TipoControlFiltro_CheckBox,TipoControlFiltro_TextFieldButtonSelFecha As String
	TipoControlFiltro_TextField = "TextField"
	TipoControlFiltro_ComboBox = "ComboBox"
	TipoControlFiltro_CheckBox = "CheckBox"
	TipoControlFiltro_TextFieldButtonSelFecha = "TextFieldBtnSelFecha"
	
	Public ColorFondoPanelInfoInicial As Int
	Public ColorTextoPanelInfoInicial As Int
	
	'public pnlItemsCLVDatos as B4XView

End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

'Base type must be Object
Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	Tag = mBase.Tag
	mBase.Tag = Me

'	Dim clr As Int = Xui.PaintOrColorToColor(Props.Get("TextColor")) 'Example of getting a color value from Props

	mLeft=mBase.Left
	mTop=mBase.top
	mWidth=mBase.Width
	mHeight=mBase.Height
	
'	CallSubDelayed2(Me, "AfterLoadLayout", Props)

	'	' Carga de propiedades del Designer
	If Props<>Null Then
		mParentForm=Props.Get("Form")
		mIncluirBotonSalir=Props.Getdefault("IncluirBotonSalir",False)
		mPanelInfoVisible=Props.Getdefault("PanelInfoVisible",False)
		mPaginacion=Props.Getdefault("Paginacion",False)
	
	End If
	
	If mParentForm=Null Then

		If SubExists(mCallBack, "getForm")= False Then
			LogColor("En algunos casos, por ejemplo usando TabPanes, Props.Get(Form) devuelve NULL.",xui.Color_Blue)
			LogColor("Hay que crear una sub en el CallBack:",xui.Color_Blue)
			Log("")
			LogColor("   sub getForm as Form",xui.Color_Blue)
			Log("")
			LogColor("   Return frm End sub",xui.Color_Blue)
			fx.Msgbox(Null,"No se ha definido método getForm en el módulo Callback." & CRLF & "(necesario cuando hay más de 1 jamTableCLV en el mismo formulario)" & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			ExitApplication
		Else
			mParentForm=CallSub(mCallBack,"getForm")
		End If
	End If
	
'	If SubExists(mCallBack, mEventName &  "_CrearItemJamTableCLV")= False Then
'		LogColor("No se ha definido método CrearItemJamTableCLV en el módulo Callback.",xui.Color_Red)
'		fx.Msgbox(Null,"No se ha definido método CrearItemJamTableCLV en el módulo Callback." & CRLF & "(necesario para la carga de Items en el CLV)" & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'		ExitApplication
'	End If
	
	If SubExists(mCallBack, mEventName &  "_VisibleRangeChanged")= False Then
		LogColor("No se ha definido método VisibleRangeChanged en el módulo Callback.",xui.Color_Red)
		fx.Msgbox(Null,"No se ha definido método VisibleRangeChanged en el módulo Callback." & CRLF & "(necesario para la carga de Items en el CLV)" & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		ExitApplication
	End If
	
	
	OrigenDatosConfiguradoOK=False
	

	
	FiltrosVisibles=False
	
	lstOperadoresFiltros.Initialize
	lstCamposFiltros.Initialize
	lstComparadoresFiltros.Initialize
	lstValoresFiltros.Initialize
	
	mContextMenu.Initialize("ContextMenu")
	
	lblMostrarEliminarFiltros.Initialize("lblMostrarEliminarFiltros")
	lblMostrarEliminarFiltros.PrefWidth=20dip
	lblMostrarEliminarFiltros.PrefHeight=12dip
	
	
	Log("antes loadlayout jamTableCLV")
	
	Sleep(0)  ' necesario, puesto que hay 1 cutomview (jamCircularProgressBar) dentro de éste customview (jamTableCLV)
	mBase.LoadLayout("scrJamTableCLV")
	
	Log("después de loadlayout jamTableCLV")
	
	LayoutLoaded = True
	CallSubDelayed(Me,"InitClass")
End Sub


Private Sub InitClass
	
	Log("InitClass jamTV")
	

	
	If mSQL.IsInitialized Then mSQL.Close
	#if B4J
	mSQL.InitializeSQLite("", ":memory:", True)
	#Else If B4A
	mSQL.Initialize("", ":memory:", True)
	#End If

	Dim FlagVersionSQLite As Boolean=True
	Log("version SQLite: " & mSQL.ExecQuerySingleResult( "SELECT sqlite_version();" ))
	Dim SQLiteVersion As String=mSQL.ExecQuerySingleResult( "SELECT sqlite_version();" )
	SQLiteVersion=SQLiteVersion.Replace(".",",")
	mSQL.Close
	Dim ComponentesVersionSQLite() As String
	ComponentesVersionSQLite=Regex.Split(",",SQLiteVersion)
	Dim V As Int=ComponentesVersionSQLite(0)
	If V<3 Then FlagVersionSQLite=False
	Dim sV As Int=ComponentesVersionSQLite(1)
	If sV<31 Then FlagVersionSQLite=False
	If Not(FlagVersionSQLite) Then
		fx.Msgbox(mParentForm,"La versión de SQLite de la aplicación (" & SQLiteVersion & ") es inferior a la mínima (3.31)." & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		ExitApplication
	End If

	clvFiltros.AsView.Visible=False
	
	lblFirst.Visible=mPaginacion
	lblNext.Visible=mPaginacion
	lblPrior.Visible=mPaginacion
	lblLast.Visible=mPaginacion
	lblPageRecords.Visible=mPaginacion
	
	
	mParentForm.RootPane.MouseCursor=fx.Cursors.WAIT

	Dialog.Initialize(mParentForm.RootPane)

	lstComparadoresTexto.Initialize
	lstComparadoresTexto.AddAll(Array As String("Es igual a","No es igual a","Comienza por","Termina con","Contiene","No contiene"))
	lstComparadoresFechas.Initialize
	lstComparadoresFechas.AddAll(Array As String("Es igual a","No es igual a", "Anterior a","Anterior o igual a","Posterior a","Posterior o igual a"))
	lstComparadoresNumericos.Initialize
	lstComparadoresNumericos.AddAll(Array As String("Es igual a","No es igual a","Mayor que","Mayor o igual que","Menor que","Menor o igual que"))
	lstComparadoresCamposTipoControlComboBox.Initialize
	lstComparadoresCamposTipoControlComboBox.AddAll(Array As String("Es igual a","No es igual a"))
	lstComparadoresBooleanos.Initialize
	lstComparadoresBooleanos.addall(Array As String("Es igual a"))
	
	cboAndOrFiltroUserChange=False
	cboCampoFiltroUserChange=False
	'cboComparadorFiltroUserChange=False
	cbComparadorFiltroUserChange=False
	cboValorFiltroUserChange=False
	chkValorFiltroUserChange=False

	
	''''''''''''''''TableCLVJAM.ContextMenu=mContextMenu
	lstContextMenuItemsGenerales.Initialize  ' lista de menús contextuales (Generales)
'	lstContextMenuItemsColumna.Initialize  ' lista de menús contextuales (Columna)
'	lstContextMenuItemsColumnaSeleccionada.Initialize  ' lista de menús contextuales (Columna)
	MenusBasicos
	MenuContextualBasico
	
	mParentForm.RootPane.MouseCursor=fx.Cursors.DEFAULT

	
	
	PosicionDimensionesCLVFiltros
	

End Sub


private Sub asJO(o As JavaObject) As JavaObject
	Return o
End Sub


'Metodo para Items Generales
Public Sub AddContextMenuItem(TextoMenuItem As String, TagMenuItem As String)
	Dim mi As MenuItem
	mi.Initialize(TextoMenuItem, "ContextMenuItem")
	mi.Tag=TagMenuItem
	lstContextMenuItemsGenerales.Add(mi)
	'mContextMenu.MenuItems.Add(mi)
End Sub

''Metodo para Items De Columna
'Public Sub AddContextMenuItemColumna(AliasCampo As String, TextoMenuItem As String, TagMenuItem As String)
'	Dim mIC As ContextMenuItemColumnaJamTableCLV
'	mIC.Initialize
'	mIC.AliasCampo=AliasCampo
'	mIC.TextoMenuItem=TextoMenuItem
'	mIC.TagMenuItem=TagMenuItem
'	lstContextMenuItemsColumna.Add(mIC)
'End Sub



'Metodo para Items Generales
Public Sub AddContextMenuItemImage(TextoMenuItem As String, TagMenuItem As String, Img As Image)
	Dim mi As MenuItem
	mi.Initialize(TextoMenuItem, "ContextMenuItem")
	mi.Tag=TagMenuItem
	mi.Image=Img
	lstContextMenuItemsGenerales.Add(mi)
	'mContextMenu.MenuItems.Add(mi)
End Sub

''Metodo para Items de Columna
'Public Sub AddContextMenuItemImageColumna(AliasCampo As String,TextoMenuItem As String, TagMenuItem As String, Img As Image)
'	Dim mIC As ContextMenuItemColumnaJamTableCLV
'	mIC.Initialize
'	mIC.AliasCampo=AliasCampo
'	mIC.TextoMenuItem=TextoMenuItem
'	mIC.TagMenuItem=TagMenuItem
'	mIC.Imagemenuitem=Img
'	lstContextMenuItemsColumna.Add(mIC)
'	'mContextMenu.MenuItems.Add(mi)
'End Sub

'Metodo para Items Generales
' sChr = texto del icono fontawesome, obtenido mediante Icon Picker del IDE
Public Sub AddContextMenuItemFontAwesomeText(TextoMenuItem As String, TagMenuItem As String, sChr As String)
	Dim mi As MenuItem
	mi.Initialize(TextoMenuItem, "ContextMenuItem")
	mi.Tag=TagMenuItem
	Dim img As Image=TextToImageAwesome(sChr,16)
	mi.Image=img
	lstContextMenuItemsGenerales.Add(mi)
	'mContextMenu.MenuItems.Add(mi)
End Sub

'Metodo para Items de Columna
' sChr = texto del icono fontawesome, obtenido mediante Icon Picker del IDE
Public Sub AddContextMenuItemFontAwesomeTextColumna(AliasCampo As String, TextoMenuItem As String, TagMenuItem As String, sChr As String)
	Dim mIC As ContextMenuItemColumnaJamTableCLV
	mIC.Initialize
	mIC.TagMenuItem=TagMenuItem
	Dim img As Image=TextToImageAwesome(sChr,16)
	mIC.ImageMenuItem=img
	lstContextMenuItemsColumna.Add(mIC)
	'mContextMenu.MenuItems.Add(mi)
End Sub

'Metodo para Items Generales
' sChr = texto del icono MaterialIcons, obtenido mediante Icon Picker del IDE
Public Sub AddContextMenuItemFontMaterialIconsText(TextoMenuItem As String, TagMenuItem As String, sChr As String)
	Dim mi As MenuItem
	mi.Initialize(TextoMenuItem, "ContextMenuItem")
	mi.Tag=TagMenuItem
	Dim img As Image=TextToImageMaterialIcons(sChr,16)
	mi.Image=img
	lstContextMenuItemsGenerales.Add(mi)
	'mContextMenu.MenuItems.Add(mi)
End Sub

'Metodo para Items de Columna
' sChr = texto del icono MaterialIcons, obtenido mediante Icon Picker del IDE
Public Sub AddContextMenuItemFontMaterialIconsTextColumna(AliasCampo As String, TextoMenuItem As String, TagMenuItem As String, sChr As String)
	Dim mIC As ContextMenuItemColumnaJamTableCLV
	mIC.Initialize
	mIC.TagMenuItem=TagMenuItem
	Dim img As Image=TextToImageMaterialIcons(sChr,16)
	mIC.ImageMenuItem=img
	lstContextMenuItemsColumna.Add(mIC)
	
	'mContextMenu.MenuItems.Add(mi)
End Sub

'Metodo para items generales
Public Sub AddContextMenuItemSeparator
	Dim sSeparator As JavaObject
	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
	'mContextMenu.MenuItems.Add(sSeparator)
	lstContextMenuItemsGenerales.Add(sSeparator)
End Sub

'Metodo para Items de Columna
Public Sub AddContextMenuItemSeparatorColumna(AliasCampo As String)
	Dim sSeparator As JavaObject
	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
	'mContextMenu.MenuItems.Add(sSeparator)
	lstContextMenuItemsColumna.Add(sSeparator)
End Sub

Public Sub RemoveMenuItemContextMenu(IndexMenuItem As String)
	mContextMenu.MenuItems.RemoveAt(IndexMenuItem)
End Sub

private Sub ContextMenuItem_Action
'	If asJO(TableCLVJAM).RunMethodjo("getSelectionModel",Null).RunMethod("isEmpty",Null) Then Return
'	'If TableCLVJAMExt.SelectedCells.Length=0 Then Return
'	Dim mI As MenuItem=Sender
'	Select mI.Tag
'		Case "CopiarValorCelda"
'			CopiarCeldaSeleccionada
'			Return
'	
'		Case "FiltrarAEsteValor"
'			Dim DatosCeldaSel As DatosCeldaSeleccionadaJamTableCLV=GetDatosCeldaSeleccionada
'			Log("DatosCeldaSel " & DatosCeldaSel)
'			wait for (AddFiltroCampoValorSeleccionado(DatosCeldaSel.AliasCampo,DatosCeldaSel.ValorCelda)) complete (rBool As Boolean)
'			
'		Case "QuitarTodosFiltros"
'			QuitarFiltros
'			
'		Case "SumaTotalesCampoColumnaSeleccionada"
'			Dim DatosCeldaSel As DatosCeldaSeleccionadaJamTableCLV=GetDatosCeldaSeleccionada
'			Log("DatosCeldaSel " & DatosCeldaSel)
'			TotalesCampoColumnaSeleccionada(DatosCeldaSel,"sum",Sender)
'			
'		Case "PromedioTotalesCampoColumnaSeleccionada"
'			Dim DatosCeldaSel As DatosCeldaSeleccionadaJamTableCLV=GetDatosCeldaSeleccionada
'			Log("DatosCeldaSel " & DatosCeldaSel)
'			TotalesCampoColumnaSeleccionada(DatosCeldaSel,"avg",Sender)
'			
'		Case "MaxTotalesCampoColumnaSeleccionada"
'			Dim DatosCeldaSel As DatosCeldaSeleccionadaJamTableCLV=GetDatosCeldaSeleccionada
'			Log("DatosCeldaSel " & DatosCeldaSel)
'			TotalesCampoColumnaSeleccionada(DatosCeldaSel,"max",Sender)
'			
'		Case "MinTotalesCampoColumnaSeleccionada"
'			Dim DatosCeldaSel As DatosCeldaSeleccionadaJamTableCLV=GetDatosCeldaSeleccionada
'			Log("DatosCeldaSel " & DatosCeldaSel)
'			TotalesCampoColumnaSeleccionada(DatosCeldaSel,"min",Sender)
'			
'		Case Else
'			If SubExists(mCallBack,mEventName & "_ContextMenuItem_Action") Then
'				CallSub2(mCallBack,mEventName & "_ContextMenuItem_Action",mI.Tag)
'			End If
'	End Select
	

End Sub

' Convert text string to an image using a hidden label.
' Example with FontAwesome:
' Dim img As Image = TextToImage(MainForm.RootPane, Chr(0xF0AA), 16)
' This can be used to add f.e. a fontawesome icon dynamically to a menu item:
' Dim mi As MenuItem ... mi.Image = img
private Sub TextToImageAwesome(s As String, FontSize As Double) As Image
	Dim img As Image
	Dim lbl As Label
	lbl.Initialize("lbl")
	lbl.Font = fx.CreateFontAwesome(FontSize)
	lbl.Text = s
	'Dim p As Pane=mBase
	Dim p As Pane=mParentForm.RootPane
	p.AddNode(lbl, -1, -1, -1, -1)
	' img = lbl.Snapshot
	img = lbl.Snapshot2(fx.Colors.Transparent) ' snapshot2, para que el icono tenga fondo transparente al seleccionarlo
	lbl.Visible = False

	p.RemoveNodeAt(p.NumberOfNodes-1)
	Return img
End Sub

private Sub TextToImageMaterialIcons(s As String, FontSize As Double) As Image
	Dim img As Image
	Dim lbl As Label
	lbl.Initialize("lbl")
	lbl.Font = fx.CreateMaterialIcons(FontSize)
	lbl.Text = s
	' Dim p As Pane=mBase
	Dim p As Pane=mParentForm.RootPane
	p.AddNode(lbl, -1, -1, -1, -1)
	' img = lbl.Snapshot
	img = lbl.Snapshot2(fx.Colors.Transparent) ' snapshot2, para que el icono tenga fondo transparente al seleccionarlo
	lbl.Visible = False

	p.RemoveNodeAt(p.NumberOfNodes-1)
	Return img
End Sub

private Sub MenusBasicos
	lstItemsDefaultMenu.Initialize
	
	If mIncluirBotonSalir Then
		
		lblSalirJamTableCLV.Initialize("lblSalirJamTableCLV")
'		lblSalirJamTableCLV.Font=xui.CreateMaterialIcons(18)
'		lblSalirJamTableCLV.Text=Chr(0xE566)
'		lblSalirJamTableCLV.PrefWidth=40dip
'		lblSalirJamTableCLV.PrefHeight=30dip
		'CSSUtils.SetBackgroundImage(lblSalirJamTableCLV,File.DirAssets,"doorexit.png")
		CSSUtils.SetBackgroundImage(lblSalirJamTableCLV,File.DirAssets,"salidaPuerta32.png")
		lblSalirJamTableCLV.PrefWidth=24dip
		lblSalirJamTableCLV.PrefHeight=24dip
		lblSalirJamTableCLV.Alignment="CENTER"
		'CSSUtils.SetBorder(lblSalirJamTableCLV,1,fx.Colors.From32Bit(0xFF696969),3)
		asJO(Me).RunMethod("addLabelMenuAccionMenuBar",Array(MenuBar, lblSalirJamTableCLV))
		
'		Dim btnSalirJamTableCLV As Button
'		btnSalirJamTableCLV.Initialize("btnSalirJamTableCLV")
'		btnSalirJamTableCLV.Font=xui.CreateMaterialIcons(12)
'		btnSalirJamTableCLV.Text=Chr(0xE566)
'		btnSalirJamTableCLV.PrefWidth=40dip
'		btnSalirJamTableCLV.PrefHeight=25dip
'		btnSalirJamTableCLV.Alignment="CENTER"
'		asJO(Me).RunMethod("addBotonSalirMenuBar",Array(MenuBar, btnSalirJamTableCLV))
	End If

	AddMenuImageToMenuBar("Tabla", "MenuTablajamTableCLV",File.DirAssets,"Tabla.png", 20dip, 20dip)
	AddMenuImageToMenuBar("Acciones",MenuBarAcciones,File.DirAssets,"acciones.png", 20dip, 20dip)
	AddMenuImageToMenuBar("Línea",MenuBarLinea,File.DirAssets,"Fila.png", 20dip, 20dip)
	


	ImagenLabelFiltros

	
	asJO(Me).RunMethod("addLabelMenuAccionMenuBar",Array(MenuBar, lblMostrarEliminarFiltros))
	lblMostrarEliminarFiltros.Visible=False
	'
'	Dim Img As Image
'	Img.InitializeSample(File.DirAssets,"MostrarPanelFiltros.png",20dip,20dip)
'	imvMostrarEliminarFiltros.Initialize("imvMostrarEliminarFiltros")
'	imvMostrarEliminarFiltros.SetImage(Img)
'	asJO(Me).RunMethod("addImageViewMenuAccionMenuBar",Array(MenuBar, imvMostrarEliminarFiltros))

	'CSSUtils.SetBorder(lblSalirJamTableCLV,1,fx.Colors.From32Bit(0xFF696969),3)
	
	
	AddMenuItemImagenToMenuInMenuBar("Exportar a Excel","ExportarTablaAExcel","MenuTablajamTableCLV",File.DirAssets,"ExcelExport.png",24dip, 24dip)
	lstItemsDefaultMenu.Add("ExportarTablaAExcel")
	AddMenuItemImagenToMenuInMenuBar("Actualizar","Actualizar","MenuTablajamTableCLV",File.DirAssets,"TablaActualizar.png",24dip, 24dip)
	lstItemsDefaultMenu.Add("Actualizar")
	Dim mI As MenuItem=GetMenuBarMenuItem("Actualizar")
	If Not(SubExists(mCallBack,mEventName & "_MenuBarMenuItem_Action")) Then
		mI.Enabled=False
	End If
	AddMenuItemImagenToMenuInMenuBar("Ordenar Registros","OrdenarRegistros","MenuTablajamTableCLV",File.DirAssets,"sort2.png",24dip, 24dip)
	lstItemsDefaultMenu.Add("OrdenarRegistros")
	
'	AddMenuItemImagenToMenuInMenuBar("Invertir Orden Actual Registros","InvertirOrdenActualRegistros","MenuTablajamTableCLV",File.DirAssets,"exchange.png",24dip, 24dip)
'	lstItemsDefaultMenu.Add("InvertirOrdenActualRegistros")
	
'	AddMenuItemImagenToMenuInMenuBar("Configurar Columnas Visibles","ConfigurarColumnasVisibles","MenuTablajamTableCLV",File.DirAssets,"Columna.png",24dip, 24dip)
'	lstItemsDefaultMenu.Add("ConfigurarColumnasVisibles")

'	AddMenuItemImagenToMenuInMenuBar("Tamaño Fuente","TamañoFuente","MenuTablajamTableCLV",File.DirAssets,"text-size.png",24dip, 24dip)
'	lstItemsDefaultMenu.Add("TamañoFuente")
	
'	AddMenuItemImagenToMenuInMenuBar("AutoAjustar Ancho","AutoAjustarAncho","MenuTablajamTableCLV",File.DirAssets,"ancho-del-texto.png",24dip, 24dip)
'	lstItemsDefaultMenu.Add("AutoAjustarAncho")
	
'	AddMenuItemImagenToMenuInMenuBar("Reset Columnas","ResetColumnas","MenuTablajamTableCLV",File.DirAssets,"resetConfig.png",24dip, 24dip)
'	lstItemsDefaultMenu.Add("ResetColumnas")
	
	AddMenuItemSeparatorInMenuBar("MenuTablajamTableCLV")
	AddMenuItemImagenToMenuInMenuBar("Totales Campos Numéricos","TotalesCamposNumericos","MenuTablajamTableCLV",File.DirAssets,"TotalesTabla.png",24dip, 24dip)
	lstItemsDefaultMenu.Add("TotalesCamposNumericos")
	
	
	#if debug
	AddMenuItemSeparatorInMenuBar("MenuTablajamTableCLV")
	AddMenuItemImagenToMenuInMenuBar("Campos Builder","CamposBuilder","MenuTablajamTableCLV",File.DirAssets,"tableDesign.png",24dip, 24dip)
	lstItemsDefaultMenu.Add("CamposBuilder")
	#End If
End Sub

#Region MenuBar


' evento genérico para los MenuItems de la barra de menús

private Sub MenuBarMenuItem_Action
	Dim mI As MenuItem=Sender
	If lstItemsDefaultMenu.IndexOf(mI.Tag)>-1 Then
		Select Case mI.tag
			Case "ExportarTablaAExcel"
				wait for (ExportarTablaAExcel) complete (rBool As Boolean)
			Case "Actualizar"
				' este caso necesita una sub concreta en el Callback
				If SubExists(mCallBack,mEventName & "_MenuBarMenuItem_Action") Then
					CallSub2(mCallBack,mEventName & "_MenuBarMenuItem_Action",mI.Tag)
				Else
					Dim msa As Object=xui.MsgboxAsync("No se ha definido método " & mI.Tag & " en el módulo Callback. Avisa al administrador de la aplicación.","Aviso")
					Wait For (msa) Msgbox_Result
				End If
			Case "OrdenarRegistros"
				wait for (DialogoOrdenarSQL) complete (rBool As Boolean)
				'Case "ConfigurarColumnas"
				'ElegirOrdenarColumnasVisibles

'			Case "ConfigurarColumnasVisibles"
'				wait for (DialogoMostrarOcultarColumnas) complete (rBool As Boolean)
'			Case "ResetColumnas"
'				wait for (ResetColumnas) complete (rBool As Boolean)
'				If rBool Then
'					ExitApplication
'					Return
'				End If
'			Case "TamañoFuente"
''				If mPaginacion Then
''					Dim msa As Object=xui.MsgboxAsync("Acción deshabilitada en tablas con paginación.","Aviso")
''					Wait For (msa) Msgbox_Result
''					Return
''				Else
''					If mAltoCeldas<>0 Then
''						Dim msa As Object=xui.MsgboxAsync("Acción deshabilitada en tablas con alto de celdas fijo.","Aviso")
''						Wait For (msa) Msgbox_Result
''						Return
''					End If
'					Dim DialogTitleBarHeightAnt As Int=Dialog.TitleBarHeight
'					Dialog.Title="Indica tamaño de fuente"
'					Dialog.TitleBarHeight=60dip
'					Dim b4xInputDlg As B4XInputTemplate
'					b4xInputDlg.Initialize
'					b4xInputDlg.lblTitle.Text="(min 10, max 20)"
'	
'					b4xInputDlg.mBase.Height = 150dip
'					b4xInputDlg.RegexPattern="^[1][0-9]|[2][0]$"
'					b4xInputDlg.Text=mFontSizeCeldas
'					Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xInputDlg,"OK","","Cancelar")
'					Dim btnOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'					btnOK.Left=10dip
'					'btnOK.TextSize=20
'					Dim btnCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'					btnCancel.Left=btnCancel.Left-40dip
'					btnCancel.width=btnCancel.width+10dip
'					btnCancel.SetTextAlignment("CENTER","LEFT")
'					'btnCancel.TextSize=20
'					Wait For (rSub) complete (rInt As Int)
'					Dialog.TitleBarHeight=DialogTitleBarHeightAnt
'					If rInt=xui.DialogResponse_Cancel Then Return
'					Dim NuevoFontSize As Float=b4xInputDlg.Text
'					wait for(EditarCellFontSize(NuevoFontSize)) complete (rBool As Boolean)
'					
''				End If
				
'			Case "AutoAjustarTexto"
'				Dim NativeMe As JavaObject=Me
'				NativeMe.RunMethod("autoResizeColumns",Array(TableCLVJAM))
'				Dim JavaVersion As Int=	GetSystemProperty("java.version","").SubString2(0,2)
'				If JavaVersion<11 Then
'					RefrescarTableCLV
'				Else
'					asJO(TableCLVJAM).RunMethod("refresh",Null)
'				End If
			
			Case "TotalesCamposNumericos"
				TotalesCamposNumericos
			Case "CamposBuilder"
				AbrirCamposBuilder
'				If NombreJSONOrigenDatos<>"" Then
'					Dim sb As StringBuilder
'					sb.Initialize
'					sb.Append("La tabla ya tiene un fichero JSON de configuración (").Append(NombreJSONOrigenDatos).Append(")").Append(CRLF).Append(CRLF)
'					sb.Append("¿Editar este fichero o crear uno nuevo?")
'					
'					Dim msa As Object = xui.Msgbox2Async(sb.tostring, "Confirma", "Editar", "Cancelar", "Nuevo",Null)
'					Wait For (msa) Msgbox_Result (rInt As Int)
'					Select True
'						Case rInt=xui.DialogResponse_Positive 
'							'"../files/"   es la forma válida de referenciar File.DirAssets en B4J
'							'si indicamos File.DirAssets para obtener la ruta de la carpeta DirAssets, devuelve "AssetsDir" ...
'							jamTableCLVCamposBuilder.show("../files/" & NombreJSONOrigenDatos)
'								
'						Case rInt=xui.DialogResponse_Negative
'							jamTableCLVCamposBuilder.show("")
'								
'						Case rInt=xui.DialogResponse_Cancel
'							Return
'					End Select
'		
'				Else
'					jamTableCLVCamposBuilder.show("")
'				End If

		End Select
	Else
		
		If SubExists(mCallBack,mEventName & "_MenuBarMenuItem_Action") Then
			CallSub2(mCallBack,mEventName & "_MenuBarMenuItem_Action",mI.Tag)
		Else
			Dim msa As Object=xui.MsgboxAsync("No se ha definido método " & mI.Tag & " en el módulo Callback. Avisa al administrador de la aplicación.","Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If
End Sub

Private Sub CollectMenuItems(Menus As Map, Items As List)
	For Each mi As MenuItem In Items
		If mi.Tag <> Null And mi.Tag <> "" Then Menus.Put(mi.Tag, mi)
		If mi Is Menu Then
			Dim mn As Menu = mi
			CollectMenuItems(Menus, mn.MenuItems)
		End If
	Next
End Sub

private Sub GetMenuBarMenuItem(TagMenuItem As String) As MenuItem
	Dim mmenus As  Map 'better to make it a global variable
	mmenus.Initialize
	CollectMenuItems(mmenus, MenuBar.Menus)
	If mmenus.Get(TagMenuItem)=Null Then
		LogColor("TagMenuItem buscado " & TagMenuItem & " no existe. ERROR",xui.Color_Red)
		fx.Msgbox(mParentForm,"No existe el MenuItem con tag: " & TagMenuItem & CRLF & CRLF & "Avisa al administrador de la aplicación.", "Error!")
		ExitApplication
	End If
	Dim mi As MenuItem = mmenus.Get(TagMenuItem)
	Return mi
End Sub



' Añade 1 Menu (solo texto) a la barra de menús.
public Sub AddMenuToMenuBar(TextMenu As String, TagMenu As String)
	Dim Mnu As Menu
	Mnu.Initialize(TextMenu,"")
	Mnu.Text=TextMenu
	Mnu.tag=TagMenu
	MenuBar.Menus.Add(Mnu)
End Sub


' Añade 1 Menu con texto + imagen a la barra de menús.
' Los ficheros de imagen deben estar en File.DirAssests
' Ficheros png, jpg (ico , no)
' Indicar Width, Height en dip  (tamaño estandar 16dip x 16dip)
public Sub AddMenuImageToMenuBar(TextMenu As String, TagMenu As String, _
		DirName As String, FileName As String,ImageWidth As Double,ImageHeight As Double)
	Dim Mnu As Menu
	Mnu.Initialize(TextMenu,"")
	Mnu.Text=TextMenu
	Mnu.tag=TagMenu
	Dim Img As Image
	Img.InitializeSample(DirName,FileName,ImageWidth,ImageHeight)
	Dim Imv As ImageView
	Imv.Initialize("")
	Imv.SetImage(Img)

	Dim JOMnu As JavaObject=Mnu
	JOMnu.RunMethod("setGraphic",Array(Imv))
	MenuBar.Menus.Add(Mnu)
End Sub

' Añade un menu (solo texto) a otro menu de la barra de menus
' Será un submenú
public Sub AddMenuToMenuInMenuBar(TextMenu As String, TagMenu As String, TagMenuParent As String)
	Dim NuevoMnu As Menu
	NuevoMnu.Initialize("TextMenu","")
	NuevoMnu.Text=TextMenu
	NuevoMnu.tag=TagMenu
	For Each menu As Menu In MenuBar.Menus
		If menu.Tag=TagMenuParent Then
			menu.MenuItems.Add(NuevoMnu)
		End If
	Next
End Sub

' Añade un menu con texto + imagen a otro menu de la barra de menus
' Será un submenú
' Los ficheros de imagen deben estar en File.DirAssests
' Ficheros png, jpg (ico , no)
' Indicar Width, Height en dip  (tamaño estandar 16dip x 16dip)
public Sub AddMenuImagenToMenuInMenuBar(TextMenu As String, TagMenu As String, TagMenuParent As String, _
		DirName As String, FileName As String, ImageWidth As Double,ImageHeight As Double)
	Dim NuevoMnu As Menu
	NuevoMnu.Initialize("TextMenu","")
	NuevoMnu.Text=TextMenu
	NuevoMnu.tag=TagMenu
	Dim Img As Image
	Img.InitializeSample(DirName,FileName,ImageWidth,ImageHeight)
	Dim Imv As ImageView
	Imv.Initialize("")
	Imv.SetImage(Img)

	Dim JOMnu As JavaObject=NuevoMnu
	JOMnu.RunMethod("setGraphic",Array(Imv))
	
	For Each menu As Menu In MenuBar.Menus
		If menu.Tag=TagMenuParent Then
			
			menu.MenuItems.Add(NuevoMnu)
		End If
	Next
End Sub


' Añade un MenuItem (sólo texto) a un menú de la barra de menús
public Sub AddMenuItemToMenuInMenuBar(TextoMenuItem As String, TagMenuItem As String,TagMenuParent As String)
	Dim ParentMenu As Menu=GetMenuBarMenuItem(TagMenuParent)
	If ParentMenu.IsInitialized Then
		Dim mi As MenuItem
		mi.Initialize(TextoMenuItem, "MenuBarMenuItem")
		mi.Tag=TagMenuItem
		ParentMenu.MenuItems.Add(mi)
	End If
End Sub

' Añade un MenuItem con texto + imagen FontAwesome a un menú de la barra de menús
public Sub AddMenuItemFontAwesomeToMenuInMenuBar(TextoMenuItem As String, TagMenuItem As String,sChr As String, TagMenuParent As String)
	Dim ParentMenu As Menu=GetMenuBarMenuItem(TagMenuParent)
	If ParentMenu.IsInitialized Then
		Dim mi As MenuItem
		mi.Initialize(TextoMenuItem, "MenuBarMenuItem")
		mi.Tag=TagMenuItem
		Dim img As Image=TextToImageAwesome(sChr,16)
		mi.Image=img
		ParentMenu.MenuItems.Add(mi)
	End If

End Sub

' Añade un MenuItem con texto + imagen FontAwesome a un menú de la barra de menús
public Sub AddMenuItemFontMaterialIconsToMenuInMenuBar(TextoMenuItem As String, TagMenuItem As String,sChr As String, TagMenuParent As String)
	Dim ParentMenu As Menu=GetMenuBarMenuItem(TagMenuParent)
	If ParentMenu.IsInitialized Then
		Dim mi As MenuItem
		mi.Initialize(TextoMenuItem, "MenuBarMenuItem")
		mi.Tag=TagMenuItem
		Dim img As Image=TextToImageMaterialIcons(sChr,16)
		mi.Image=img
		ParentMenu.MenuItems.Add(mi)
	End If

End Sub


' Añade un MenuItem con texto + imagen  a un menú de la barra de menús
' Los ficheros de imagen deben estar en File.DirAssests
' Ficheros png, jpg (ico , no)
' Indicar Width, Height en dip  (tamaño estandar 16dip x 16dip)
public Sub AddMenuItemImagenToMenuInMenuBar(TextoMenuItem As String, TagMenuItem As String,TagMenuParent As String, _
		DirName As String, FileName As String, ImageWidth As Double,ImageHeight As Double)
	Dim ParentMenu As Menu=GetMenuBarMenuItem(TagMenuParent)
	If ParentMenu.IsInitialized Then
		Dim img As Image
		img.InitializeSample(DirName,FileName,ImageWidth,ImageHeight)
		Dim mi As MenuItem
		mi.Initialize(TextoMenuItem, "MenuBarMenuItem")
		mi.Tag=TagMenuItem
		mi.Image=img
		ParentMenu.MenuItems.Add(mi)
	End If

End Sub


public Sub AddMenuItemSeparatorInMenuBar(TagMenuParent As String)
	Dim sSeparator As JavaObject
	sSeparator.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",Null)
	Dim ParentMenu As Menu=GetMenuBarMenuItem(TagMenuParent)
	If ParentMenu.IsInitialized Then
		ParentMenu.MenuItems.Add(sSeparator)
	End If
End Sub

#End Region

Private Sub MenuContextualBasico
'	If mSingleCellSelection Then
'		AddContextMenuItemFontAwesomeText("Copiar Valor","CopiarValorCelda",Chr(0xF0C5))
''		If NumCamposConControlFiltro>0 Then
'		AddContextMenuItemFontAwesomeText("Filtrar a este Valor","FiltrarAEsteValor",Chr(0xF0B0))
'		AddContextMenuItemFontMaterialIconsText("Quitar Todos Filtros","QuitarTodosFiltros",Chr(0xE0B8))
''		End If
'	End If
End Sub


' Método para habiitar/deshabilitar menutiems
public Sub EstadoMenuItem(TagMenuItem As String, Habilitado As Boolean)
	Dim mI As MenuItem=GetMenuBarMenuItem(TagMenuItem)
	mI.Enabled=Habilitado
End Sub


#Region Filtros


Private Sub ImagenLabelFiltros
	If Not(FiltrosVisibles) Then

		CSSUtils.SetBackgroundImage(lblMostrarEliminarFiltros,File.DirAssets,"filter32verde.png")
	Else

		CSSUtils.SetBackgroundImage(lblMostrarEliminarFiltros,File.DirAssets,"filter32rojo.png")
	End If
End Sub

private Sub lblMostrarEliminarFiltros_MouseClicked (EventData As MouseEvent)
	If NumCamposConControlFiltro=0 Then
		fx.Msgbox(mParentForm,"No se han definido campos con control de filtro. No es posible filtrar la tabla.","Aviso")
		Return
	End If
	
	If FiltrosVisibles Then
		FiltrosVisibles=False
		clvFiltros.Clear
		wait for(ActualizarFiltro) complete (rObj As Object)
		PosicionDimensionesCLVFiltros
	Else
		FiltrosVisibles=True
		If clvFiltros.Size=0 Then
			AddFiltro
			Wait For AddFiltro_completed
		End If
	End If
	ImagenLabelFiltros
End Sub

private Sub ReiniciarFiltros
	'If CheckColumnasFiltrables Then
	'If mLstCamposFiltros.Size>0 Then
	'Log ("NumCamposConControlFiltro " & NumCamposConControlFiltro)
	'If NumCamposConControlFiltro>0 Then
		'If B4XTable1.sql1.IsInitialized Then
		FiltrosVisibles=False
		clvFiltros.Clear
		mFiltroActual=""
		If lstOperadoresFiltros.IsInitialized Then lstOperadoresFiltros.Clear
		If lstCamposFiltros.IsInitialized Then lstCamposFiltros.Clear
		If lstComparadoresFiltros.IsInitialized Then lstComparadoresFiltros.Clear
		If lstValoresFiltros.IsInitialized Then lstValoresFiltros.Clear
		'wait for(ActualizarFiltro) complete (rObj As Object)
		'CargandoDatos=True
		''''AddFiltro
		'Wait For AddFiltro_completed  ' en este caso NO hace falta controlar el cambio en los controles del clv, 
		'puesto que estarán vacio, excepto el cboAndOr, que no importa en este caso...
		'CargandoDatos=False
		'End If
		'Else
	PosicionDimensionesCLVFiltros
	'End If
	'PosicionDimensionesCLVFiltros
	'CallSubDelayed(Me,"ReiniciarFiltros_Completed")
End Sub

public Sub QuitarFiltros
	FiltrosVisibles=False
	clvFiltros.Clear
	wait for(ActualizarFiltro) complete (rObj As Object)
	PosicionDimensionesCLVFiltros
End Sub

'Sub CheckColumnasFiltrables As Boolean
'	Dim FlagColumnasFiltrables As Boolean
'	For i=0 To ColumnasJAM.Size-1
'		Dim c As B4XTableColumnJAM=ColumnasJAM.Get(i)
'		If c.TipoControlFiltro<>"" Then
'			FlagColumnasFiltrables=True
'			Exit
'		End If
'	Next
'	Return FlagColumnasFiltrables
'End Sub


'private Sub InicializarCLVFiltros
'	mClvB4XTable.AsView.Visible=True
'	AddFiltro
'End Sub

'Sub DatosFiltro(FiltroCompleto As Boolean, OperadorFiltro As String, TableCLVFiltroJAM As TableCLVFiltroJAM, ComparadorFiltro As String, ValorFiltro As Object) As Map
private Sub DatosFiltro(FiltroCompleto As Boolean, OperadorFiltro As String, CampoFiltroJAM As CampoOrigenDatosJamTableCLV, ComparadorFiltro As String, ValorFiltro As Object) As Map
	Dim m As Map
	m.Initialize
	m.Put("FiltroCompleto",FiltroCompleto)
	m.Put("OperadorFiltro",OperadorFiltro)
	'm.Put("TableCLVFiltroJAM",TableCLVFiltroJAM)
	m.Put("DatosCampoFiltro",CampoFiltroJAM)
	m.Put("ComparadorFiltro",ComparadorFiltro)
	m.Put("ValorFiltro",ValorFiltro)
	Return m
End Sub

private Sub CreateItemFiltro(PrimerFiltro As Boolean, clvIV As clvJAMTableCLVFiltroItemValue) As B4XView
	Dim p As B4XView =xui.CreatePanel("")
	p.LoadLayout("scrFiltroCampojamTableCLV")
	CSSUtils.SetBackgroundColor(p,fx.Colors.From32Bit(0x00FFFFFF))
	p.SetLayoutAnimated(0, 0, 0, p.Width, 30dip)
	
	clvIV.btnSelFechaFiltro=btnSelFechaFiltro
	clvIV.txtValorFechaFiltro=txtValorFechaFiltro
	clvIV.cboAndOrFiltro=cboAndOrFiltro
	clvIV.cboCampoFiltro=cboCampoFiltro
	'clvIV.cboComparadorFiltro=cboComparadorFiltro
	clvIV.cbComparadorFiltro=cbComparadorFiltro
	clvIV.cboValorFiltro=cboValorFiltro
	clvIV.txtValorFiltro=txtValorFiltro
	clvIV.chkValorFiltro=chkValorFiltro
	
	Dim OperadorFiltro As String
	If PrimerFiltro Then
		'm.Put("OperadorFiltro","")
		OperadorFiltro=""
		lblTitleFiltroDonde.Left=70
		lblTitleFiltroDonde.prefWidth=105
		cboAndOrFiltro.Visible=False
		lblTitleFiltroDonde.Text="Filtrar donde"
		
	Else
		lblTitleFiltroDonde.Left=128
		lblTitleFiltroDonde.PrefWidth=50
		cboAndOrFiltro.Visible=True
		'm.Put("OperadorFiltro","Y")
		cboAndOrFiltro.Items.Add("Y")
		cboAndOrFiltro.Items.Add("O")
		OperadorFiltro="Y"
		cboAndOrFiltro.Value="Y"
		lblTitleFiltroDonde.Text="donde"
	End If
	
	
	
	'CargaItemsCboCamposFiltro(cboCampoFiltro)

	'Dim tvFJAM As TableCLVFiltroJAM
	Dim c As CampoOrigenDatosJamTableCLV
	c.Initialize
	p.Tag=DatosFiltro(False,OperadorFiltro,c,Null,Null)
	Return p
End Sub

private Sub btnAddFiltro_Click
	If NumCamposConControlFiltro=0 Then 
		fx.Msgbox(mParentForm,"No se han definido campos con control de filtro. No es posible filtrar la tabla.","Aviso")
	End If
	
	
	' Comprobar si existe ya 1 panel con 1 filtro incompleto, para no añadir otro
	For i=0 To clvFiltros.Size-1
		Dim p As Pane=clvFiltros.GetPanel(i)
		Dim m As Map=p.Tag
		If m.Get("FiltroCompleto")=False Then
			Dim msa As Object=xui.MsgboxAsync("Ya existe un panel del filtro sin completar.","Aviso")
			Wait For (msa) Msgbox_Result
			Return
		End If
	Next
	
	
	'CargandoDatos=True
	AddFiltro
	Wait For AddFiltro_completed
	'CargandoDatos=False
	'SetMouseCursor(fx.Cursors.WAIT)
'	WAIT FOR (ActualizarTableCLV(True)) COMPLETE (rObj As Object)
	'SetMouseCursor(fx.Cursors.DEFAULT)

End Sub

'Añade 1 panel de filtros al CLV
'IMPORTANTE: Llamar esta sub asi:
'<code>
'CargandoDatos=True
'AddFiltro
'Wait For AddFiltro_completed
'CargandoDatos=False
'</code>
private Sub AddFiltro
	If Not(clvFiltros.IsInitialized) Then Return
	Dim clviv As clvJAMTableCLVFiltroItemValue
	clviv.Initialize
	If clvFiltros.Size=0 Then
		clvFiltros.Add(CreateItemFiltro(True, clviv),clviv)
	Else
		clvFiltros.Add(CreateItemFiltro(False, clviv),clviv)
	End If
	FiltrosVisibles=True
	PosicionDimensionesCLVFiltros
	CallSubDelayed(Me,"AddFiltro_Completed")
End Sub

private Sub PosicionDimensionesCLVFiltros

	ImagenLabelFiltros
	
	If MenuBar.Menus.Size=0 Then
		MenuBar.PrefHeight=0dip
		MenuBar.Visible=False
	Else
		MenuBar.PrefHeight=30dip
		MenuBar.Visible=True
		MenuBar.Top=0dip
	End If
	
	pnlInfoJamTableCLV.Visible=mPanelInfoVisible
	pnlInfoJamTableCLV.Top=pnlNavButtons.PrefHeight
	If mPanelInfoVisible Then
		pnlInfoJamTableCLV.prefHeight=20dip
	Else
		pnlInfoJamTableCLV.prefHeight=0dip
	End If
	
	clvFiltros.sv.Height=Max(clvFiltros.sv.ScrollViewContentHeight,0)
	'clvFiltros.AsView.Visible=clvFiltros.Size>0
	clvFiltros.AsView.Visible=FiltrosVisibles
	If FiltrosVisibles Then
		clvFiltros.AsView.Height=clvFiltros.sv.Height
	Else
		clvFiltros.AsView.Height=0
	End If
	clvFiltros.AsView.Top=pnlInfoJamTableCLV.Top+pnlInfoJamTableCLV.Height
	
	clvDatos.AsView.Top=pnlNavButtons.prefHeight+pnlInfoJamTableCLV.prefHeight+Max(0,clvFiltros.sv.Height)
'	#if debug
'	LogColor("pnlInfoJamTableCLV.Height " & pnlInfoJamTableCLV.Height,xui.Color_Magenta)
'	LogColor("pnlInfoJamTableCLV.Top " & pnlInfoJamTableCLV.Top,xui.Color_Magenta)
'	LogColor("clvFiltros.AsView.Top " & clvFiltros.AsView.Top,xui.Color_Magenta)
'	LogColor("clvDatos.AsView.Top " & clvDatos.AsView.Top,xui.Color_Magenta)
'	#End If
	
	clvDatos.AsView.Height=mBase.Height-clvDatos.AsView.top-1dip
'	
End Sub


private Sub cboCampofiltro_MouseClicked(EventData As MouseEvent)
	If EventData.SecondaryButtonPressed Then Return
	
	Dim cbo As ComboBox=Sender
	cboCampoFiltroUserChange=False
	' Al hacer click en el combo, el Show de la lista se invierte.
	' ComboCheckListaVisible devolverá cómo estaba la lista ANTES del MouseClick
	If ComboCheckListaVisible(cbo) Then Return
	
	wait for (CargaItemsCboCamposFiltro(cbo)) complete (rObj As Object)
	ComboHideItems(cbo)
	'Log("Min(cbo.Items.Size+1,8) " & 10)
	ComboSetVisibleRowCount(cbo, 8)
	ComboShowItems(cbo)


	cboCampoFiltroUserChange=True
End Sub

private Sub cboCampofiltro_ValueChanged (Value As Object)

	'If CargandoDatos Then Return
	Log("cboCampoFiltroUserChange " & cboCampoFiltroUserChange)
	If cboCampoFiltroUserChange=False Then
		 Return
	End If
	
'	If Value=Null Or Value="" Or Value="null" Then
'		 Return
'	End If
	'CargandoDatos=True

	Dim cbo As ComboBox=Sender
	Log("***********")
	Log("Valor Campo " & cbo.Value)
	Log("***********")
	Wait For (CambioCampoFiltro(cbo)) complete (rBool As Boolean)
'	If rBool Then
		cboCampoFiltroUserChange=False
'	Else
'		cboCampoFiltroUserChange=True
'	End If
	
'	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
'	Dim p As Pane=clvFiltros.GetPanel(nP)
'	Dim mDatosFiltro As Map=p.Tag
'	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
'	
'	clviv.txtValorFiltro.Visible=False
'	clviv.txtValorFiltro.Text=""
'	clviv.txtValorFiltro.editable=False
'	clviv.cboValorFiltro.Visible=False
'	clviv.cboValorFiltro.Items.Clear
'	clviv.btnSelFechaFiltro.Visible=False
'	clviv.chkValorFiltro.Visible=False
'	
'	Dim c As CampoOrigenDatosJamTableCLV=GetDatosCampoOrigenDatosJamTableCLVAliasCampo(Value)
'	Log(c)
'	If c.AliasCampo<>Value Then Return
'	If c.Campo="" Then Return
'	'Log("Campo seleccionado: " & c)
'	Dim TipoControlF As String=c.TipoControlFiltro
'	
'	Select True
'		Case TipoControlF=TipoControlFiltro_ComboBox
'			'CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.campo)
'			CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.AliasCampo)
'			Wait For CargarItemsCboValorFiltro_Completed
'			CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresCamposTipoControlComboBox)
'		Case TipoControlF=TipoControlFiltro_CheckBox
'			CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresBooleanos)
'		Case Else
'			If c.TipoDato="INTEGER" Or c.TipoDato="REAL" Then
'				If c.EsFecha Then
'					'btnSelF.Visible=True
'					'tFV.Editable=False
'					CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)
'				Else
'					'btnSelF.Visible=False
'					clviv.txtValorFiltro.Editable=True
'					CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresNumericos)
'				End If
'			Else
'				If c.TipoDato= "TEXT" Then
'					'btnSelF.Visible=False
'					clviv.txtValorFiltro.Editable=True
'					CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresTexto)
'				End If
'			End If	
'	End Select		
'	Wait For CargarItemsCboComparadorFiltro_Completed
'
'	CargandoDatos=False
'
'	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
'	
'	If TipoControlF=TipoControlFiltro_CheckBox Then
''		Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
''		'el Comparador será siempre "Es Igual a" en este caso
''		Dim ComparadorFiltro As String=lstComparadoresBooleanos.Get(0)
''		' Por defecto, el valor del CheckBox será False
''		Dim ValorFiltro As Boolean=False
''		p.Tag=DatosFiltro(False,OperadorFiltro,c,ComparadorFiltro,ValorFiltro)
'
'		'el Comparador será siempre "Es Igual a" en este caso
'		Dim ComparadorFiltro As String=lstComparadoresBooleanos.Get(0)
'		clviv.cboComparadorFiltro.Value=ComparadorFiltro
'		p.Tag=DatosFiltro(True,OperadorFiltro,c,ComparadorFiltro,Null)
'	Else
'		p.Tag=DatosFiltro(False,OperadorFiltro,c,Null,Null)
'		ActualizarFiltro
'	End If
End Sub

Private Sub CambioCampoFiltro(cbo As ComboBox) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	Dim mDatosFiltro As Map=p.Tag
	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
	
	' comprobar "compatibilidad" con filtros OR
	
	If Not(CheckCompatiblidadCampoFiltroConFiltrosOr(cbo.Value, nP)) Then
		Dim sbErr As StringBuilder
		sbErr.Initialize
		sbErr.Append("Sólo puede establecerse un filtro con comparador tipo O, cuando tenemos únicamente 2 filtros,")
		sbErr.Append(" o bien cuando todos los filtros son relativos al mismo campo.").Append(CRLF)
		Dim msa As Object=xui.MsgboxAsync(sbErr.ToString,"Aviso")
		Wait For (msa) Msgbox_Result
		cboCampoFiltroUserChange=False
		cbo.Value=Null
		Return False
	End If
	
	
	
	' Un cambio en el cboCampoFiltro , limpia todo el filtro actual
	'clviv.cboComparadorFiltro.Visible=False
	clviv.cbComparadorFiltro.Visible=False
	clviv.txtValorFiltro.Visible=False
	clviv.txtValorFiltro.Text=""
	clviv.txtValorFiltro.editable=False
	clviv.cboValorFiltro.Visible=False
	'clviv.cboValorFiltro.Items.Clear
	cboValorFiltroUserChange=False
	wait for (cboBorrarItems(clviv.cboValorFiltro)) complete (rObj As Object)
	clviv.btnSelFechaFiltro.Visible=False
	clviv.txtValorFechaFiltro.Visible=False
	clviv.txtValorFechaFiltro.text=""
	clviv.txtValorFechaFiltro.editable=False
	clviv.chkValorFiltro.Visible=False
	'cboComparadorFiltroUserChange=False
	cbComparadorFiltroUserChange=False
	'wait for (cboBorrarItems(clviv.cboComparadorFiltro)) complete (rObj As Object)
	wait for (cbBorrarItems(clviv.cbComparadorFiltro)) complete (rObj As Object)
	
	
	Dim c As CampoOrigenDatosJamTableCLV=GetDatosCampoOrigenDatosJamTableCLVAliasCampo(cbo.Value)
	Log("***CampoOrigenDatosJamTableCLV cboCampo " & c)
	
	If c.AliasCampo<>cbo.Value Then Return False
	If c.Campo="" Then Return False
	'Log("Campo seleccionado: " & c)
	
	'clviv.cboComparadorFiltro.Visible=True
	clviv.cbComparadorFiltro.Visible=True
	Dim TipoControlF As String=c.TipoControlFiltro
'''	
'''	cboComparadorFiltroUserChange=False
'''	Select True
'''		Case TipoControlF=TipoControlFiltro_ComboBox
''''''			CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.AliasCampo)
''''''			Wait For CargarItemsCboValorFiltro_Completed
'''			wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresCamposTipoControlComboBox)) complete (rObj As Object)
'''		Case TipoControlF=TipoControlFiltro_CheckBox
'''			wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresBooleanos)) complete (rObj As Object)
'''			
'''		Case Else
'''			If c.TipoDato="INTEGER" Or c.TipoDato="REAL" Then
'''				If c.EsFecha Then
'''					'btnSelF.Visible=True
'''					'tFV.Editable=False
'''					'CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)
'''					wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)) complete (rObj As Object)
'''				Else
'''					'btnSelF.Visible=False
'''					clviv.txtValorFiltro.Editable=True
'''					wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresNumericos)) complete (rObj As Object)
'''				End If
'''			Else
'''				If c.TipoDato= "TEXT" Then
'''					'btnSelF.Visible=False
'''					clviv.txtValorFiltro.Editable=True
'''					WAIT FOR (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresTexto)) COMPLETE (rObj As Object)
'''				End If
'''			End If
'''	End Select
	'Wait For CargarItemsCboComparadorFiltro_Completed

	'CargandoDatos=False

	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
	
'	Select True
'		Case TipoControlF=TipoControlFiltro_ComboBox
'			clviv.cboValorFiltro.Visible=True
'			
'		Case TipoControlF=TipoControlFiltro_CheckBox
'			clviv.chkValorFiltro.Visible=True
'			clviv.chkValorFiltro.Enabled=True
'
'		
'		Case Else
'			If c.TipoDato="INTEGER" Or c.TipoDato="REAL" Then
'				If c.EsFecha Then
'					clviv.btnSelFechaFiltro.Visible=True
'					clviv.txtValorFiltro.Visible=True
'					clviv.txtValorFiltro.Editable=False
'				Else
'					clviv.txtValorFiltro.Visible=True
'					clviv.txtValorFiltro.Editable=True
'				End If
'			Else
'				If c.TipoDato= "TEXT" Then
'					clviv.txtValorFiltro.Visible=True
'					clviv.txtValorFiltro.Editable=True
'				End If
'			End If
'			
'	End Select
	
	If TipoControlF=TipoControlFiltro_CheckBox Then
		'		Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
		'		'el Comparador será siempre "Es Igual a" en este caso
		'		Dim ComparadorFiltro As String=lstComparadoresBooleanos.Get(0)
		'		' Por defecto, el valor del CheckBox será False
		'		Dim ValorFiltro As Boolean=False
		'		p.Tag=DatosFiltro(False,OperadorFiltro,c,ComparadorFiltro,ValorFiltro)

		'el Comparador será siempre "Es Igual a" en este caso
		Dim ComparadorFiltro As String=lstComparadoresBooleanos.Get(0)
		'cboComparadorFiltroUserChange=False
		cbComparadorFiltroUserChange=False
		'clviv.cboComparadorFiltro.Value=ComparadorFiltro
		clviv.cbComparadorFiltro.SelectedIndex=clviv.cbComparadorFiltro.Items.IndexOf(ComparadorFiltro)
		chkValorFiltroUserChange=False
		wait for(CambioChkValorFiltro(clviv.chkValorFiltro)) complete (rObject As Object)
		clviv.chkValorFiltro.Visible=True
		clviv.chkValorFiltro.Enabled=True
		p.Tag=DatosFiltro(True,OperadorFiltro,c,ComparadorFiltro,0)
	Else
		p.Tag=DatosFiltro(False,OperadorFiltro,c,Null,Null)
		'ActualizarFiltro
	End If
	Log("Datos filtro despues de cambio en cboCampo " & p.Tag)
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return True
End Sub

Private Sub cboBorrarItems(cbo As ComboBox) As ResumableSub
	cbo.Items.clear
	Return Null
End Sub

Private Sub cbBorrarItems(cb As ChoiceBox) As ResumableSub
	cb.Items.clear
	Return Null
End Sub


private Sub cbComparadorFiltro_MouseClicked (EventData As MouseEvent)
	If EventData.SecondaryButtonPressed Then Return
	Dim cb As ChoiceBox=Sender
	
	' Al hacer click en el combo, el Show de la lista se invierte.
	' ComboCheckListaVisible devolverá cómo estaba la lista ANTES del MouseClick
	'If ComboCheckListaVisible(cb) Then Return
	If ChoiceBoxCheckListaVisible(cb) Then Return

	Dim nP As Int=clvFiltros.GetItemFromView(cb)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	Dim mDatosFiltro As Map=p.Tag
	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
	Dim cboCampoFiltroSel As ComboBox=clviv.cboCampoFiltro
	Dim cboCampoFiltroSel As ComboBox=clviv.cboCampoFiltro
	If FixNull(cboCampoFiltroSel.Value)="" Then Return
	Dim CSel As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
	'Log("cboComparadorFiltro_MouseClicked cSEL " & CRLF & CSel & "  cboCampoValue " & cboCampoFiltroSel.Value)
	'cboComparadorFiltroUserChange=False
	cbComparadorFiltroUserChange=False
	wait for(CargarItemsCbComparadorFiltro(cb,CSel, clviv)) complete (rObj As Object)

	'ComboHideItems(cb)
	cb.HideChoices
	'ComboSetVisibleRowCount(cbo, Min(cbo.Items.Size+2,8))
	'ComboSetVisibleRowCount(cb, 8)
	'Log("Min(cbo.Items.Size,8) " & Min(cbo.Items.Size,8))
	'ComboShowItems(cb)
	cb.ShowChoices


	'cboComparadorFiltroUserChange=True
	cbComparadorFiltroUserChange=True
End Sub


'private Sub cboComparadorFiltro_MouseClicked (EventData As MouseEvent)
'	If EventData.SecondaryButtonPressed Then Return
'	Dim cbo As ComboBox=Sender
'	
'	' Al hacer click en el combo, el Show de la lista se invierte.
'	' ComboCheckListaVisible devolverá cómo estaba la lista ANTES del MouseClick
'	If ComboCheckListaVisible(cbo) Then Return
'
'	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
'	Dim p As Pane=clvFiltros.GetPanel(nP)
'	Dim mDatosFiltro As Map=p.Tag
'	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
'	Dim cboCampoFiltroSel As ComboBox=clviv.cboCampoFiltro
'	If FixNull(cboCampoFiltroSel.Value)="" Then Return
'	Dim CSel As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
'	'Log("cboComparadorFiltro_MouseClicked cSEL " & CRLF & CSel & "  cboCampoValue " & cboCampoFiltroSel.Value)
'	cboComparadorFiltroUserChange=False
'	cbComparadorFiltroUserChange=False
'	wait for(CargarItemsCboComparadorFiltro(cbo,CSel, clviv)) complete (rObj As Object)
'
'	ComboHideItems(cbo)
'	'ComboSetVisibleRowCount(cbo, Min(cbo.Items.Size+2,8))
'	ComboSetVisibleRowCount(cbo, 8)
'	'Log("Min(cbo.Items.Size,8) " & Min(cbo.Items.Size,8))
'	ComboShowItems(cbo)
'
'
'	cboComparadorFiltroUserChange=True
'	cbComparadorFiltroUserChange=True
'End Sub

Private Sub cbComparadorFiltro_SelectedIndexChanged(Index As Int, Value As Object)
	If cbComparadorFiltroUserChange=False Then
		Return
	End If
	
	If Index=-1 Then
		'Log("index = -1")
		cbComparadorFiltroUserChange=False
		Return
	End If
	Dim cb As ChoiceBox=Sender
	wait for (CambioComparadorFiltroChoiceBox(cb)) complete (rObject As Object)
	
	cbComparadorFiltroUserChange=False
End Sub

'private Sub cboComparadorFiltro_SelectedIndexChanged(Index As Int, Value As Object)
'	'If CargandoDatos Then Return
'	
'	If cboComparadorFiltroUserChange=False Then
'		Return
'	End If
'	
'	If Index=-1 Then
'		'Log("index = -1")
'		cboComparadorFiltroUserChange=False
'		Return
'	End If
'	Dim cbo As ComboBox=Sender
'	wait for (CambioComparadorFiltro(cbo)) complete (rObject As Object)
'	
'	cboComparadorFiltroUserChange=False
''	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
''	Dim p As Pane=clvFiltros.GetPanel(nP)
''	Dim mDatosFiltro As Map=p.Tag
'	'Log("Campo del filtro del Panel " & nP & " seleccionado")
''	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
''	
''	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
''
''	If c.EsFecha Then
''		clviv.cboValorFiltro.Visible=False
''		clviv.txtValorFiltro.Visible=True
''		clviv.txtValorFiltro.Editable=False
''		clviv.txtValorFiltro.Text=""
''		clviv.btnSelFechaFiltro.Visible=True
''		clviv.chkValorFiltro.Visible=False
''	Else
''		clviv.btnSelFechaFiltro.Visible=False
''		Select True
''			Case c.TipoControlFiltro=TipoControlFiltro_ComboBox
''				clviv.txtValorFiltro.Visible=False
''				clviv.txtValorFiltro.Text=""
''				clviv.cboValorFiltro.Visible=True
''				clviv.cboValorFiltro.Enabled=True
''				clviv.chkValorFiltro.Visible=False
''				clviv.chkValorFiltro.Enabled=False
''				CargandoDatos=True
''				'CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.Campo)
''				CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.AliasCampo)
''				Wait For CargarItemsCboValorFiltro_Completed
''				CargandoDatos=False
''			Case c.TipoControlFiltro=TipoControlFiltro_TextField
''				clviv.txtValorFiltro.Text=""
''				clviv.txtValorFiltro.Enabled=True
''				clviv.txtValorFiltro.Visible=True
''				clviv.cboValorFiltro.Visible=False
''				clviv.chkValorFiltro.Visible=False
''				clviv.chkValorFiltro.Enabled=False
''			Case c.TipoControlFiltro=TipoControlFiltro_CheckBox
''				CargandoDatos=True
''				clviv.chkValorFiltro.Visible=True
''				clviv.chkValorFiltro.Enabled=True
''				clviv.chkValorFiltro.Checked=False
''				CargandoDatos=False
''		End Select
''	End If
''
''
''
''	mDatosFiltro.Put("ComparadorFiltro",cbo.Value)
'	'
''	p.Tag=mDatosFiltro
'	'
''	ActualizarFiltro
'End Sub

private Sub CambioComparadorFiltroChoiceBox(cb As ChoiceBox) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(cb)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	Dim mDatosFiltro As Map=p.Tag
	'Log("Campo del filtro del Panel " & nP & " seleccionado")
	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)

	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")

	If c.EsFecha Then
		clviv.cboValorFiltro.Visible=False
		clviv.txtValorFechaFiltro.Visible=True
		clviv.txtValorFechaFiltro.Editable=False
		'clviv.txtValorFiltro.Text=""
		clviv.btnSelFechaFiltro.Visible=True
		clviv.chkValorFiltro.Visible=False
	Else
		clviv.btnSelFechaFiltro.Visible=False
		Select True
			Case c.TipoControlFiltro=TipoControlFiltro_ComboBox
				clviv.txtValorFiltro.Visible=False
				clviv.txtValorFechaFiltro.Visible=False
				'clviv.txtValorFiltro.Text=""
				clviv.cboValorFiltro.Visible=True
				clviv.cboValorFiltro.Enabled=True
				clviv.chkValorFiltro.Visible=False
				clviv.chkValorFiltro.Enabled=False
'				CargandoDatos=True
'				CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.AliasCampo)
'				Wait For CargarItemsCboValorFiltro_Completed
'				CargandoDatos=False
			Case c.TipoControlFiltro=TipoControlFiltro_TextField
				'clviv.txtValorFiltro.Text=""
				clviv.txtValorFiltro.Enabled=True
				clviv.txtValorFiltro.Visible=True
				clviv.cboValorFiltro.Visible=False
				clviv.chkValorFiltro.Visible=False
				clviv.chkValorFiltro.Enabled=False
				clviv.txtValorFechaFiltro.Enabled=False
				clviv.txtValorFechaFiltro.Visible=False
			Case c.TipoControlFiltro=TipoControlFiltro_CheckBox
				'CargandoDatos=True
				clviv.chkValorFiltro.Visible=True
				clviv.chkValorFiltro.Enabled=True
				'chkValorFiltroUserChange=False
				'clviv.chkValorFiltro.Checked=False
				'CargandoDatos=False
		End Select
	End If



'	Dim OperadorFiltro As String=m.Get("OperadorFiltro")
	
'	If c.TipoControlFiltro=TipoControlFiltro_CheckBox Then
'		p.Tag=DatosFiltro(True,OperadorFiltro,c,cbo.Value,0)  ' 0=false
'	Else

	mDatosFiltro.Put("ComparadorFiltro",cb.items.get(cbComparadorFiltro.SelectedIndex))
	p.Tag=mDatosFiltro
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return Null
End Sub

private Sub CambioComparadorFiltro(cbo As ComboBox) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	Dim mDatosFiltro As Map=p.Tag
	'Log("Campo del filtro del Panel " & nP & " seleccionado")
	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)

	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")

	If c.EsFecha Then
		clviv.cboValorFiltro.Visible=False
		clviv.txtValorFechaFiltro.Visible=True
		clviv.txtValorFechaFiltro.Editable=False
		'clviv.txtValorFiltro.Text=""
		clviv.btnSelFechaFiltro.Visible=True
		clviv.chkValorFiltro.Visible=False
	Else
		clviv.btnSelFechaFiltro.Visible=False
		Select True
			Case c.TipoControlFiltro=TipoControlFiltro_ComboBox
				clviv.txtValorFiltro.Visible=False
				clviv.txtValorFechaFiltro.Visible=False
				'clviv.txtValorFiltro.Text=""
				clviv.cboValorFiltro.Visible=True
				clviv.cboValorFiltro.Enabled=True
				clviv.chkValorFiltro.Visible=False
				clviv.chkValorFiltro.Enabled=False
'				CargandoDatos=True
'				CargarItemsCboValorFiltro(clviv.cboValorFiltro,c.AliasCampo)
'				Wait For CargarItemsCboValorFiltro_Completed
'				CargandoDatos=False
			Case c.TipoControlFiltro=TipoControlFiltro_TextField
				'clviv.txtValorFiltro.Text=""
				clviv.txtValorFiltro.Enabled=True
				clviv.txtValorFiltro.Visible=True
				clviv.cboValorFiltro.Visible=False
				clviv.chkValorFiltro.Visible=False
				clviv.chkValorFiltro.Enabled=False
				clviv.txtValorFechaFiltro.Enabled=False
				clviv.txtValorFechaFiltro.Visible=False
			Case c.TipoControlFiltro=TipoControlFiltro_CheckBox
				'CargandoDatos=True
				clviv.chkValorFiltro.Visible=True
				clviv.chkValorFiltro.Enabled=True
				'chkValorFiltroUserChange=False
				'clviv.chkValorFiltro.Checked=False
				'CargandoDatos=False
		End Select
	End If



'	Dim OperadorFiltro As String=m.Get("OperadorFiltro")
	
'	If c.TipoControlFiltro=TipoControlFiltro_CheckBox Then
'		p.Tag=DatosFiltro(True,OperadorFiltro,c,cbo.Value,0)  ' 0=false
'	Else

	mDatosFiltro.Put("ComparadorFiltro",cbo.Value)
	p.Tag=mDatosFiltro
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return Null
End Sub

'private Sub InicializarCalendario
'
'End Sub



private Sub btnSelFechaFiltro_Click
	Dim bF As Button=Sender

	Private DateTemplate As B4XDateTemplate
	Dim FechaSelFiltro As Long
	Dim DatetimeFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yy"
	'InicializarCalendario
	DateTemplate.Initialize
	DateTemplate.MinYear = 2018
	DateTemplate.MaxYear = 2050
	DateTemplate.FirstDay=1
	DateTemplate.Date=DateTime.Now
	Dim rSub As ResumableSub=Dialog.ShowTemplate(DateTemplate, "OK", "", "Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.Left=5dip
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.left=bCancel.left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) Complete (Result As Int)
	If Result =xui.DialogResponse_Positive Then
		
		Dim nP As Int=clvFiltros.GetItemFromView(bF)
		Dim p As Pane=clvFiltros.GetPanel(nP)
		Dim mDatosFiltro As Map=p.Tag
		Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
		
		FechaSelFiltro=DateTemplate.Date
		clviv.txtValorFechaFiltro.Text=DateTime.Date(FechaSelFiltro)
		
		'Dim c As TableCLVFiltroJAM=mDatosFiltro.Get("TableCLVFiltroJAM")
		Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")

		Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
		Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
		p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,FechaSelFiltro)
		wait for(ActualizarFiltro) complete (rObj As Object)
	End If
	DateTime.DateFormat=DatetimeFormatAnt
End Sub

private Sub cboValorFiltro_MouseClicked (EventData As MouseEvent)
	
	If EventData.SecondaryButtonPressed Then Return
	
	Dim cbo As ComboBox=Sender
	
	' Al hacer click en el combo, el Show de la lista se invierte.
	' ComboCheckListaVisible devolverá cómo estaba la lista ANTES del MouseClick
	If ComboCheckListaVisible(cbo) Then
		Log("Lista visible--> ocultar")
		 Return
	End If
	Dim p As Pane=clvFiltros.GetPanel(clvFiltros.GetItemFromView(cbo))
	Dim m As Map=p.Tag
	cboValorFiltroUserChange=False  ' lo pasamos a False, ya que el Cargar los items primero borra el seleccionado y no queremos que se ejecute el valueChanged
	Dim c As CampoOrigenDatosJamTableCLV=m.Get("DatosCampoFiltro")
	wait for (CargarItemsCboValorFiltro(cbo, c.AliasCampo)) complete (rObj As Object)
	'Wait For CargarItemsCboValorFiltro_Completed
	
	ComboHideItems(cbo)
	ComboSetVisibleRowCount(cbo, 10)
	'Log("Min(cbo.Items.Size+1,8) " & Min(cbo.Items.Size+1,8))
	ComboShowItems(cbo)
	
	cboValorFiltroUserChange=True
End Sub

private Sub cboValorFiltro_ValueChanged (Value As Object)
	'If CargandoDatos Then Return
	
	Log("cboValorFiltro_ValueChanged  valor " & Value)
	Log("cboValorFiltroUserChange " & cboValorFiltroUserChange)
	If cboValorFiltroUserChange=False Then
		Return
	Else
		cboValorFiltroUserChange=False 
	End If
	
'	If AsignacionValorCboValorFiltro Then
'		AsignacionValorCboValorFiltro=False
'		Return
'	End If
	
	Dim cbo As ComboBox=Sender
	
	wait for (CambioCboValorFiltro(cbo,Value)) complete (rBool As Boolean) 
	
'	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
'	Dim p As Pane=clvFiltros.GetPanel(nP)
'	'Log("Valor del filtro del Panel " & nP & " modificado")
'	Dim mDatosFiltro As Map=p.Tag
''	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
''	Dim m As Map=p.Tag
''	m.Put("ValorFiltro",cbo.value)
''	p.Tag=m
'
'	'Dim c As TableCLVFiltroJAM=mDatosFiltro.Get("TableCLVFiltroJAM")
'	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
'	
'	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
'
'	Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
'	p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,Value)
'	ActualizarFiltro

End Sub

private Sub CambioCboValorFiltro(cbo As ComboBox, Value As Object) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	'Log("Valor del filtro del Panel " & nP & " modificado")
	Dim mDatosFiltro As Map=p.Tag
'	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
'	Dim m As Map=p.Tag
'	m.Put("ValorFiltro",cbo.value)
'	p.Tag=m

	'Dim c As TableCLVFiltroJAM=mDatosFiltro.Get("TableCLVFiltroJAM")
	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
	
	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")

	Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
	p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,Value)
	wait for(ActualizarFiltro) complete (rObj As Object)
	
	Return True
End Sub


private Sub txtValorFiltro_Action
	'If CargandoDatos Then Return
	

	Dim tF As TextField=Sender
	wait for (CambioTxtValorFiltro(tF)) complete (rBool As Boolean)
'	Dim nP As Int=clvFiltros.GetItemFromView(tF)
'	Dim p As Pane=clvFiltros.GetPanel(nP)
'	'tF.Text=tF.Text.ToUpperCase
'	'Log("Valor del filtro del Panel " & nP & " modificado")
'	Dim mDatosFiltro As Map=p.Tag
'	
'	'Dim clviv As clvJAMTableCLVItemValue=clvFiltros.GetValue(nP)
'	
''	Dim m As Map=p.Tag
''	m.Put("ValorFiltro",tF.Text)
''	p.Tag=m
''	ActualizarFiltro
'
'	'Dim c As TableCLVFiltroJAM=mDatosFiltro.Get("TableCLVFiltroJAM")
'	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
'
'	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
'
'	Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
'	p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,tF.Text)
'	ActualizarFiltroTextFieldAction=True
'	ActualizarFiltro
	
End Sub

private Sub CambioTxtValorFiltro(tF As TextField) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(tF)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	'tF.Text=tF.Text.ToUpperCase
	'Log("Valor del filtro del Panel " & nP & " modificado")
	Dim mDatosFiltro As Map=p.Tag
	
	'Dim clviv As clvJAMTableCLVItemValue=clvFiltros.GetValue(nP)
	
'	Dim m As Map=p.Tag
'	m.Put("ValorFiltro",tF.Text)
'	p.Tag=m
'	ActualizarFiltro

	'Dim c As TableCLVFiltroJAM=mDatosFiltro.Get("TableCLVFiltroJAM")
	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")

	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")

	Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
	p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,tF.Text)
	ActualizarFiltroTextFieldAction=True
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return True
End Sub

private Sub chkValorFiltro_MouseClicked(EventData As MouseEvent)
	If EventData.SecondaryButtonDown Then Return
	chkValorFiltroUserChange=True
End Sub

private Sub chkValorFiltro_CheckedChange(Checked As Boolean)
	'If CargandoDatos Then Return
	
	If chkValorFiltroUserChange=False Then Return
	
	Dim chk As CheckBox=Sender
	wait for (CambioChkValorFiltro(chk)) complete (rObject As Object)
	chkValorFiltroUserChange=False
	
'	Dim nP As Int=clvFiltros.GetItemFromView(chk)
'	Dim p As Pane=clvFiltros.GetPanel(nP)
'	Dim mDatosFiltro As Map=p.Tag
'	'Dim clviv As clvJAMTableCLVItemValue=clvFiltros.GetValue(nP)
'	'Log("Valor del operador del Panel " & nP & " modificado")
'	
'	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
'
'	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
'	Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
'	
'	Dim ValorChecked As Int
'	If chk.Checked Then
'		ValorChecked=1
'	Else
'		ValorChecked=0
'	End If
'	mDatosFiltro.Put("ValorFiltro",ValorChecked)
'	p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,ValorChecked)
'	ActualizarFiltro
	
'	
'	mDatosFiltro.Put("ValorFiltro",chk.Checked)
'	p.Tag=mDatosFiltro
'	ActualizarFiltro
End Sub

Private Sub CambioChkValorFiltro(chk As CheckBox) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(chk)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	Dim mDatosFiltro As Map=p.Tag
	'Dim clviv As clvJAMTableCLVItemValue=clvFiltros.GetValue(nP)
	'Log("Valor del operador del Panel " & nP & " modificado")
	
	Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")

	Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
	Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
	
	Dim ValorChecked As Int
	If chk.Checked Then
		ValorChecked=1
	Else
		ValorChecked=0
	End If
	mDatosFiltro.Put("ValorFiltro",ValorChecked)
	p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,ValorChecked)
	wait for(ActualizarFiltro) complete (rObj As Object)
	
	Return Null
End Sub


private Sub txtValorFiltro_FocusChanged (HasFocus As Boolean)
	'If CargandoDatos Then Return
	
	If ActualizarFiltroTextFieldAction Then
		ActualizarFiltroTextFieldAction=False
		Return
	End If
	
	If HasFocus=False Then
		Try
			Dim tF As TextField=Sender
'			Dim nP As Int=clvFiltros.GetItemFromView(tF)
'			Dim p As Pane=clvFiltros.GetPanel(nP)
'			tF.Text=tF.Text.ToUpperCase
'		'	Log("Valor del filtro del Panel " & nP & " modificado")
'			Dim mDatosFiltro As Map=p.Tag
'			'Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
''			Dim m As Map=p.Tag
''			m.Put("ValorFiltro",tF.Text)
''			p.Tag=m
''			ActualizarFiltro
'
'			'Dim c As TableCLVFiltroJAM=mDatosFiltro.Get("TableCLVFiltroJAM")
'			Dim c As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
'
'			Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
'
'			Dim Comparador As String=mDatosFiltro.Get("ComparadorFiltro")
'			p.Tag=DatosFiltro(True,OperadorFiltro,c,Comparador,tF.Text)
'			ActualizarFiltro
			wait for (CambioTxtValorFiltro(tF)) complete (rBool As Boolean)
		Catch
			LogColor(LastException.Message, xui.Color_Red)
		End Try
	End If
End Sub

private Sub DevolverFocoAtxtValorFiltroErrorValor(strValortxtfiltro As String)
	Dim msa As Object= xui.MsgboxAsync(strValortxtfiltro & " no es un valor de filtro válido","Error")
	Wait For (msa) Msgbox_Result
	'Return
	txtValorFiltro.RequestFocus
End Sub

private Sub cboAndOrFiltro_MouseClicked(EventData As MouseEvent)
	If EventData.SecondaryButtonPressed Then Return
	
	Dim cbo As ComboBox=Sender
	cboAndOrFiltroUserChange=False
	' Al hacer click en el combo, el Show de la lista se invierte.
	' ComboCheckListaVisible devolverá cómo estaba la lista ANTES del MouseClick
	If ComboCheckListaVisible(cbo) Then Return
	
	'wait for (CargaItemsCboCamposFiltro(cbo)) complete (rObj As Object)  en este caso los items son siempre los mismos (Y ó O)
	ComboHideItems(cbo)
	'Log("Min(cbo.Items.Size+1,8) " & 10)
	'ComboSetVisibleRowCount(cbo, 8)
	ComboShowItems(cbo)
	cboAndOrFiltroUserChange=True
End Sub


private Sub cboAndOrFiltro_SelectedIndexChanged (Index As Int, Value As Object)
	'If CargandoDatos Then Return
	
	If cboAndOrFiltroUserChange=False Then
		Return
	End If
	
	Dim cbo As ComboBox=Sender
	wait for (CambioAndOrFiltro(cbo)) complete (rObject As Object)
'	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
'	Dim p As Pane=clvFiltros.GetPanel(nP)
'	Dim mDatosFiltro As Map=p.Tag
'	'Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
'	'Log("Valor del operador del Panel " & nP & " modificado")
'	mDatosFiltro.Put("OperadorFiltro",cbo.Value)
'	p.Tag=mDatosFiltro
'	ActualizarFiltro
	
	cboAndOrFiltroUserChange=False
End Sub

private Sub CambioAndOrFiltro(cbo As ComboBox) As ResumableSub
	Dim nP As Int=clvFiltros.GetItemFromView(cbo)
	Dim p As Pane=clvFiltros.GetPanel(nP)
	Dim mDatosFiltro As Map=p.Tag
	Dim CSel As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
	If cbo.Value="O" Then
		' SOLO será posible añadir filtro tipo O, si hay únicamentente 2 filtros, o si hay más de 2, si únicamente se filtra por un campo
		If Not(CheckPosibleFiltroOr(CSel.AliasCampo)) Then
			Dim sbErr As StringBuilder
			sbErr.Initialize
			sbErr.Append("Sólo puede establecerse un filtro con comparador tipo O, cuando tenemos únicamente 2 filtros,")
			sbErr.Append(" o bien cuando todos los filtros son relativos al mismo campo.").Append(CRLF)
			sbErr.Append("Se MODIFICA el tipo de comparador a tipo Y.")
			Dim msa As Object=xui.MsgboxAsync(sbErr.ToString,"Aviso")
			Wait For (msa) Msgbox_Result
			cbo.Value="Y"
			Return Null
		End If
	End If
	
	'Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(nP)
	'Log("Valor del operador del Panel " & nP & " modificado")
	mDatosFiltro.Put("OperadorFiltro",cbo.Value)
	p.Tag=mDatosFiltro
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return Null
End Sub


private Sub CheckPosibleFiltroOr(AliasCampoAnalizado As String) As Boolean
	If clvFiltros.Size=2 Then Return True  
	Dim FlagOK As Boolean
	For clvItemIdx=0 To clvFiltros.Size-1
		Dim p As Pane=clvFiltros.GetPanel(clvItemIdx)
		Dim mDatosFiltro As Map=p.Tag
		Dim CSel As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
		If CSel.AliasCampo<>AliasCampoAnalizado Then
			FlagOK=False
			Exit
		End If
	Next
	If FlagOK Then
		Return True
	Else
		Return False
	End If
End Sub

private Sub CheckCompatiblidadCampoFiltroConFiltrosOr(AliasCampoAnalizado As String, iDxPanel As Int) As Boolean
	If Not(clvFiltros.Size>2) Then Return True  
	'Dim FlagOK As Boolean
	Dim NumOpO As Int
	Dim lstCamposFiltrados As List
	lstCamposFiltrados.Initialize
	For clvItemIdx=0 To clvFiltros.Size-1
		Dim p As Pane=clvFiltros.GetPanel(clvItemIdx)
		Dim mDatosFiltro As Map=p.Tag
		Dim OperadorFiltro As String=mDatosFiltro.Get("OperadorFiltro")
		If OperadorFiltro="O" Then NumOpO=NumOpO+1
		If clvItemIdx<>iDxPanel Then
			Dim CSel As CampoOrigenDatosJamTableCLV=mDatosFiltro.Get("DatosCampoFiltro")
			If lstCamposFiltrados.IndexOf(CSel.AliasCampo)=-1 Then lstCamposFiltrados.Add(CSel.AliasCampo)
		End If
	Next
	If NumOpO=0 Then Return True
	If lstCamposFiltrados.IndexOf(AliasCampoAnalizado)=-1 Then Return False
	Return True
End Sub

private Sub CargaItemsCboCamposFiltro(cbo As ComboBox) As ResumableSub
	Dim sCampoAnt As String=cbo.Value
	cbo.Items.Clear
	If mLstCamposOrigenDatos.IsInitialized=False Then Return Null
	'For i=0 To mLstCamposFiltros.Size-1
	Dim lstAliasCamposControlFiltro As List
	lstAliasCamposControlFiltro.Initialize
	If mLstCamposOrigenDatos.Size>0 Then
		For i=0 To mLstCamposOrigenDatos.Size-1
			'Dim c As TableCLVFiltroJAM=mLstCamposFiltros.Get(i)
			Dim c As CampoOrigenDatosJamTableCLV=mLstCamposOrigenDatos.Get(i)
			If c.TipoControlFiltro<>"" Then
				lstAliasCamposControlFiltro.Add(c.AliasCampo)
			End If
		Next
		lstAliasCamposControlFiltro.Sort(True)
		cbo.Items.AddAll(lstAliasCamposControlFiltro)
	End If
	If FixNull(sCampoAnt)<>"" Then
		cbo.Value=sCampoAnt
	End If
	Return Null
End Sub

'private Sub CargarItemsCboValorFiltro(cboVF As ComboBox, Campo As String)
private Sub CargarItemsCboValorFiltro(cboVF As ComboBox, AliasCampo As String) As ResumableSub
	Log("CargarItemsCboValorFiltro , campo  " & AliasCampo)
	
	Dim sValorFiltroAnt As Object=cboVF.Value
	cboVF.Items.Clear

	'Dim lstVF As List=DBUtils.ExecuteList(mOrigenDatosTableCLVJAM.SQLOrigen,"select distinct " & Campo & " from " & mOrigenDatosTableCLVJAM.NombreTablaOrigen,Null,0)
	'Dim lstVF As List=DBUtils.ExecuteList(mSQL,"select distinct [" & Campo & "] from tblOrigenDatos order by [" & Campo & "]",Null,0)
	If lstValoresFiltros.Size=0 Then  ' si solo hay un filtro, o ninguno las opciones para cambiar el filtro deben ser todas. 
		Dim lstVF As List=DBUtils.ExecuteList(mSQL,"select distinct [" & AliasCampo & "] from tblOrigenDatos order by [" & AliasCampo & "]",Null,0)
	Else
		' hay que extraer el campo y el valor del filtro del cbo seleccionado
		Dim lstValoresSinCampoAnalizado As List
		lstValoresSinCampoAnalizado.Initialize
		Dim Args() As String
		Dim sWhere As StringBuilder
		sWhere.Initialize
		Dim iDxIt As Int
		For Each sCampoFiltro As String In lstCamposFiltros
			If sCampoFiltro=AliasCampo Then
				iDxIt=iDxIt+1
				Continue
			Else
				If sWhere.Length>0 Then
					Dim OperadorFiltroSQL As String
					If lstOperadoresFiltros.Get(iDxIt)="Y" Then
						OperadorFiltroSQL="and"
					Else
						OperadorFiltroSQL="or"
					End If
					
					sWhere.Append(" ").Append(OperadorFiltroSQL).Append(" ").Append("[").Append(sCampoFiltro).append("]")
				Else
					sWhere.Append("[").Append(sCampoFiltro).append("]")
				End If
				Dim sComp As String=lstComparadoresFiltros.Get(iDxIt)
				sWhere.Append(" ").Append(sComp).Append(" ?")
				Dim sObjVal As String=lstValoresFiltros.Get(iDxIt)
				lstValoresSinCampoAnalizado.Add(sObjVal)
			End If
			iDxIt=iDxIt+1
		Next
		If lstValoresSinCampoAnalizado.Size=0 Then
			Dim lstVF As List=DBUtils.ExecuteList(mSQL,"select distinct [" & AliasCampo & "] from tblOrigenDatos order by [" & AliasCampo & "]",Null,0)
		Else
			Dim Args(lstValoresSinCampoAnalizado.Size) As String
			Dim IDxArgs As Int
			For Each sFV As String In lstValoresSinCampoAnalizado
				Args(IDxArgs)=sFV
				IDxArgs=IDxArgs+1
			Next
			Log("sWhere to string " & sWhere.ToString)
			Dim lstVF As List=DBUtils.ExecuteList(mSQL,"select distinct [" & AliasCampo & "] from tblOrigenDatos where " & sWhere.ToString & " order by [" & AliasCampo & "]",Args,0)
		End If
	End If
	cboVF.Items.AddAll(lstVF)
	If FixNull(sValorFiltroAnt)<>"" Then
		cboVF.Value=sValorFiltroAnt
	End If
	'CallSubDelayed(Me,"CargarItemsCboValorFiltro_Completed")
	Return Null
End Sub

private Sub CargarItemsCbComparadorFiltro(cbComp As ChoiceBox, cSel As CampoOrigenDatosJamTableCLV, clvivSel As clvJAMTableCLVFiltroItemValue) As ResumableSub
	Dim sComparadorAnt As String
	If cbComp.SelectedIndex=-1 Then
		sComparadorAnt=""
	Else
		sComparadorAnt=cbComp.items.get(cbComp.SelectedIndex)
	End If
	
	cbComp.Items.Clear

	Dim TipoControlF As String=cSel.TipoControlFiltro
	
	'cboComparadorFiltroUserChange=False
	cbComparadorFiltroUserChange=False
	Select True
		Case TipoControlF=TipoControlFiltro_ComboBox
			'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresCamposTipoControlComboBox)) complete (rObj As Object)
			cbComp.Items.AddAll(lstComparadoresCamposTipoControlComboBox)
		Case TipoControlF=TipoControlFiltro_CheckBox
			'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresBooleanos)) complete (rObj As Object)
			cbComp.Items.AddAll(lstComparadoresBooleanos)
		Case Else
			If cSel.TipoDato="INTEGER" Or cSel.TipoDato="REAL" Then
				If cSel.EsFecha Then
					'btnSelF.Visible=True
					'tFV.Editable=False
					'CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)
					'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)) complete (rObj As Object)
					clvivSel.txtValorFiltro.Editable=False
					clvivSel.txtValorFechaFiltro.Editable=False
					cbComp.Items.AddAll(lstComparadoresFechas)
				Else
					'btnSelF.Visible=False
					clvivSel.txtValorFiltro.Editable=True
					'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresNumericos)) complete (rObj As Object)
					cbComp.Items.AddAll(lstComparadoresNumericos)
				End If
			Else
				If cSel.TipoDato= "TEXT" Then
					'btnSelF.Visible=False
					clvivSel.txtValorFiltro.Editable=True
					'WAIT FOR (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresTexto)) COMPLETE (rObj As Object)
					cbComp.Items.AddAll(lstComparadoresTexto)
				End If
			End If
	End Select
	
	
	
	
'	For i=0 To lstComparadores.Size-1
'		cboComp.Items.Add(lstComparadores.Get(i))
'	Next

	cbComp.Visible=True
	If FixNull(sComparadorAnt)<>"" Then
		'cboComp.Value=sComparadorAnt
		cbComp.SelectedIndex=cbComp.items.IndexOf(sComparadorAnt)
	End If
	'CallSubDelayed(Me,"CargarItemsCboComparadorFiltro_Completed")
	

	
	Return Null
End Sub

'private Sub CargarItemsCboComparadorFiltro(cboComp As ComboBox, cSel As CampoOrigenDatosJamTableCLV, clvivSel As clvJAMTableCLVFiltroItemValue) As ResumableSub
'	Dim sComparadorAnt As String=cboComp.Value
'	cboComp.Items.Clear
'
'	Dim TipoControlF As String=cSel.TipoControlFiltro
'	
'	cboComparadorFiltroUserChange=False
'	cbComparadorFiltroUserChange=False
'	Select True
'		Case TipoControlF=TipoControlFiltro_ComboBox
'			'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresCamposTipoControlComboBox)) complete (rObj As Object)
'			cboComp.Items.AddAll(lstComparadoresCamposTipoControlComboBox)
'		Case TipoControlF=TipoControlFiltro_CheckBox
'			'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresBooleanos)) complete (rObj As Object)
'			cboComp.Items.AddAll(lstComparadoresBooleanos)
'		Case Else
'			If cSel.TipoDato="INTEGER" Or cSel.TipoDato="REAL" Then
'				If cSel.EsFecha Then
'					'btnSelF.Visible=True
'					'tFV.Editable=False
'					'CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)
'					'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresFechas)) complete (rObj As Object)
'					clvivSel.txtValorFiltro.Editable=False
'					clvivSel.txtValorFechaFiltro.Editable=False
'					cboComp.Items.AddAll(lstComparadoresFechas)
'				Else
'					'btnSelF.Visible=False
'					clvivSel.txtValorFiltro.Editable=True
'					'wait for (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresNumericos)) complete (rObj As Object)
'					cboComp.Items.AddAll(lstComparadoresNumericos)
'				End If
'			Else
'				If cSel.TipoDato= "TEXT" Then
'					'btnSelF.Visible=False
'					clvivSel.txtValorFiltro.Editable=True
'					'WAIT FOR (CargarItemsCboComparadorFiltro(clviv.cboComparadorFiltro,lstComparadoresTexto)) COMPLETE (rObj As Object)
'					cboComp.Items.AddAll(lstComparadoresTexto)
'				End If
'			End If
'	End Select
'	
'	
'	
'	
''	For i=0 To lstComparadores.Size-1
''		cboComp.Items.Add(lstComparadores.Get(i))
''	Next
'
'	cboComp.Visible=True
'	If FixNull(sComparadorAnt)<>"" Then
'		cboComp.Value=sComparadorAnt
'	End If
'	'CallSubDelayed(Me,"CargarItemsCboComparadorFiltro_Completed")
'	
'
'	
'	Return Null
'End Sub

private Sub btnDelFiltro_Click
	Dim b As Button=Sender
	'Log ("IDLineaFiltro = " & b.Tag)
	Dim NumFiltrosAntesBorrado As Int=clvFiltros.Size
	
	Dim idx As Int=clvFiltros.GetItemFromView(b)  ' indice del panel que se borra
	clvFiltros.RemoveAt(idx)
	Sleep(0)
'	NumeroPanelesFiltros=NumeroPanelesFiltros-1
'	PosicionDimensionesCLVFiltros
'	If NumeroPanelesFiltros=0 Then
	If NumFiltrosAntesBorrado=1 Then  ' se elimina el unico panel de filtro que había: añadir 1 vacío
		'CargandoDatos=True
'''''		AddFiltro
'''''		Wait For AddFiltro_completed
		'CargandoDatos=False
		FiltrosVisibles=False
	Else ' habia más paneles, aparte del que se borra
		If idx=0 Then
			'si idx=0, se ha borrado el primer filtro, pero hay mas
			'convertir el siguiente panel de filtros en panel sin condiciones Y/O
			Dim p As Pane=clvFiltros.GetPanel(0)  ' ahora será el primer panel
			Dim lblTitleFD As Label
			Dim cboOP As ComboBox
			For Each n As Node In p.GetAllViewsRecursive
				Select True
					Case n.Tag="lblTitleFiltroDonde"
						lblTitleFD=n
						Continue
					Case n.Tag="cboAndOrFiltro"
						cboOP=n
						Continue
				End Select
			Next
			
			lblTitleFD.Left=70
			lblTitleFD.prefWidth=105
			lblTitleFD.Text="Filtrar donde"
			cboOP.Visible=False
			
			' solo cambia el operador del filtro
			Dim m As Map=p.Tag
			m.Put("OperadorFiltro","")
			p.Tag=m
		End If
		'PosicionDimensionesCLVFiltros
	End If
	wait for(ActualizarFiltro) complete (rObj As Object)
	PosicionDimensionesCLVFiltros
	'ActualizarTableCLV
End Sub

private Sub AddFiltroCampoValorSeleccionado(AliasCampoSel As String, ValorFiltroSel As Object) As ResumableSub
	
	' comprobar si el campo seleccionado tiene un tipo de filtro definido en el JSON
	Dim c As CampoOrigenDatosJamTableCLV=GetDatosCampoOrigenDatosJamTableCLVAliasCampo(AliasCampoSel)
	If c.TipoControlFiltro="" Then
		Dim msa As Object=xui.MsgboxAsync("No existe un tipo de control de filtro para el campo de la columna seleccionada." & CRLF & CRLF & "No es posible filtrar por el campo " & AliasCampoSel,"Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	Dim CrearFiltro As Boolean
	Dim CambioOperador As Boolean
	' comprobar si hay un filtro incompleto
	Dim FlagFiltroIncompleto As Boolean
	For i=0 To clvFiltros.Size-1
		Dim p As Pane=clvFiltros.GetPanel(i)
		Dim m As Map=p.Tag
		If m.Get("FiltroCompleto")=False Then
				FlagFiltroIncompleto=True
				Exit
		End If
	Next
	
	If FlagFiltroIncompleto Then
		Dim dCFiltro As CampoOrigenDatosJamTableCLV=m.Get("DatosCampoFiltro")
		If dCFiltro.Campo<>"" Then ' hay un filtro incompleto
			Dim msa As Object=xui.MsgboxAsync("Existe un panel del filtro sin completar." & CRLF & CRLF & "Es necesario completar el filtro, o eliminarlo antes de añadir otro filtro.","Aviso")
			Wait For (msa) Msgbox_Result
			Return False
		Else
			'el filtro incompleto será el filtro vacío. Usaremos ése.
			CrearFiltro=False
		End If
	Else
			'CargandoDatos=True
'			AddFiltro
'			Wait For AddFiltro_completed
			'CargandoDatos=False
		CrearFiltro=True
	End If
	
	' en el caso de ser fecha, el datos con el que comparar debería ser = ticksHoraCero del dia seleccionado
	If c.EsFecha Then
		ValorFiltroSel=DateUtils.SetDate(DateTime.GetYear(ValorFiltroSel),DateTime.GetMonth(ValorFiltroSel),DateTime.GetDayOfMonth(ValorFiltroSel))
	End If
	
	If CrearFiltro Then
		' comprobar que no exista el mismo filtro ya
		Dim FlagFiltroYaExiste As Boolean
		For i=0 To clvFiltros.Size-1
			Dim p As Pane=clvFiltros.GetPanel(i)
			Dim m As Map=p.Tag
			Dim mDatosCampoFiltro As CampoOrigenDatosJamTableCLV=m.Get("DatosCampoFiltro")
			If m.Get("FiltroCompleto")=True And m.Get("ComparadorFiltro")="Es igual a" _
				And m.Get("ValorFiltro")=ValorFiltroSel And mDatosCampoFiltro.AliasCampo=AliasCampoSel Then
				FlagFiltroYaExiste=True
				Exit
			End If
		Next
		
		If FlagFiltroYaExiste Then
'			Dim sTipoAndOr As String=m.get("OperadorFiltro")
'			If sTipoAndOr="" Then sTipoAndOr="Y"
'			Dim sTipoAndOrContrario As String
'			If sTipoAndOr="Y" Then
'				sTipoAndOrContrario="O"
'			Else
'				sTipoAndOrContrario="Y"
'			End If
'			Dim msa As Object = xui.Msgbox2Async("El filtro seleccionado ya existe, con el operador " &  sTipoAndOr & CRLF & CRLF & _
'				"¿Crear filtro con el operador " & sTipoAndOrContrario & "?" , "Confirma", "Sí", "", "No",Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return False
'			CambioOperador=True
			Dim msa As Object=xui.MsgboxAsync("El filtro seleccionado ya existe.","Aviso")
			Wait For (msa) Msgbox_Result
			Return False
		End If
		
		'CargandoDatos=True
		AddFiltro
		Wait For AddFiltro_completed
		'CargandoDatos=False
	End If
	
	
	' el filtro que vamos a añadir será el último panel del CLV
	Dim p As Pane=clvFiltros.GetPanel(clvFiltros.Size-1)
	Dim mDatosFiltro As Map=p.Tag
	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(clvFiltros.Size-1)
	'clviv.cboCampoFiltro.Value=AliasCampoSel
	
'	If CambioOperador Then
'		clviv.cboAndOrFiltro.Value=sTipoAndOrContrario
'		mDatosFiltro.put("OperadorFiltro",sTipoAndOrContrario)
'	End If
	
	cboCampoFiltroUserChange=False
	clviv.cboCampoFiltro.Value=AliasCampoSel
'	wait for (CambioCampoFiltro(clviv.cboCampoFiltro,AliasCampoSel)) complete (rBool As Boolean)
'	If Not(rBool) Then Return False
	'cboComparadorFiltroUserChange=False
	cbComparadorFiltroUserChange=False
	'clviv.cboComparadorFiltro.Value="Es igual a"
	'clviv.cboComparadorFiltro.Visible=True
	
	clviv.cbComparadorFiltro.SelectedIndex=clviv.cbComparadorFiltro.Items.IndexOf("Es igual a")
	clviv.cbComparadorFiltro.Visible=True
'	Dim c As CampoOrigenDatosJamTableCLV=GetDatosCampoOrigenDatosJamTableCLVAliasCampo(AliasCampoSel)

	
	If c.EsFecha Then
		Dim DatetimeFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yy"
		clviv.txtValorFechaFiltro.Text=DateTime.Date(ValorFiltroSel)
		DateTime.DateFormat=DatetimeFormatAnt
		clviv.txtValorFechaFiltro.Visible=True
		clviv.btnSelFechaFiltro.Visible=True
		clviv.btnSelFechaFiltro.Enabled=True
	Else
		Select True
			Case c.TipoControlFiltro=TipoControlFiltro_ComboBox
				cboValorFiltroUserChange=False
				clviv.cboValorFiltro.Value=ValorFiltroSel
				clviv.cboValorFiltro.Visible=True
				clviv.cboValorFiltro.Enabled=True
			Case c.TipoControlFiltro=TipoControlFiltro_TextField
				clviv.txtValorFiltro.Text=ValorFiltroSel
				clviv.txtValorFiltro.Visible=True
				clviv.txtValorFiltro.Enabled=True
			Case c.TipoControlFiltro=TipoControlFiltro_CheckBox
				chkValorFiltroUserChange=False
				If ValorFiltroSel Is Int Then 
					If 0=ValorFiltroSel Then
						clviv.chkValorFiltro.Checked=False
					Else
						clviv.chkValorFiltro.Checked=True
					End If
				Else
					clviv.chkValorFiltro.Checked=ValorFiltroSel
				End If
				clviv.chkValorFiltro.Visible=True
				clviv.chkValorFiltro.Enabled=True
		End Select
	End If
	'p.Tag=DatosFiltro(True,mDatosFiltro.Get("OperadorFiltro"),c,clviv.cboComparadorFiltro.Value,ValorFiltroSel)
	p.Tag=DatosFiltro(True,mDatosFiltro.Get("OperadorFiltro"),c,clviv.cbComparadorFiltro.Items.Get(clviv.cbComparadorFiltro.SelectedIndex),ValorFiltroSel)
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return True
End Sub

' Añade un filtro a los ya existentes, con comparador "igual a"
' es 1 resumable sub. Ejemplo:
'<code>
'dim rSub as ResumableSub=jamTableCLV1.AddFiltroCampoValorInicial(AliasCampoSel,ValorFiltroSel) 
' wait for(rSub) complete (success as boolean)
'If success then
'
'Else
'
'End If
'</code>
public Sub AddFiltroCampoValorInicial(AliasCampoSel As String, ValorFiltroSel As Object) As ResumableSub
	
	' comprobar si el campo seleccionado tiene un tipo de filtro definido en el JSON
	Dim c As CampoOrigenDatosJamTableCLV=GetDatosCampoOrigenDatosJamTableCLVAliasCampo(AliasCampoSel)
	If c.TipoControlFiltro="" Then
		Dim msa As Object=xui.MsgboxAsync("No existe un tipo de control de filtro para el campo de la columna seleccionada." & CRLF & CRLF & "No es posible establecer un filtro inicial para el campo " & AliasCampoSel & ".","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	Dim CrearFiltro As Boolean
	Dim CambioOperador As Boolean
	' comprobar si hay un filtro incompleto
	Dim FlagFiltroIncompleto As Boolean
	For i=0 To clvFiltros.Size-1
		Dim p As Pane=clvFiltros.GetPanel(i)
		Dim m As Map=p.Tag
		If m.Get("FiltroCompleto")=False Then
				FlagFiltroIncompleto=True
				Exit
		End If
	Next
	
	If FlagFiltroIncompleto Then
		Dim dCFiltro As CampoOrigenDatosJamTableCLV=m.Get("DatosCampoFiltro")
		If dCFiltro.Campo<>"" Then ' hay un filtro incompleto
			Dim msa As Object=xui.MsgboxAsync("Existe un panel del filtro sin completar." & CRLF & CRLF & "Es necesario completar el filtro, o eliminarlo antes de añadir otro filtro.","Aviso")
			Wait For (msa) Msgbox_Result
			Return False
		Else
			'el filtro incompleto será el filtro vacío. Usaremos ése.
			CrearFiltro=False
		End If
	Else
			'CargandoDatos=True
'			AddFiltro
'			Wait For AddFiltro_completed
			'CargandoDatos=False
		CrearFiltro=True
	End If
	
	' en el caso de ser fecha, el datos con el que comparar debería ser = ticksHoraCero del dia seleccionado
	If c.EsFecha Then
		ValorFiltroSel=DateUtils.SetDate(DateTime.GetYear(ValorFiltroSel),DateTime.GetMonth(ValorFiltroSel),DateTime.GetDayOfMonth(ValorFiltroSel))
	End If
	
	If CrearFiltro Then
		' comprobar que no exista el mismo filtro ya
		Dim FlagFiltroYaExiste As Boolean
		For i=0 To clvFiltros.Size-1
			Dim p As Pane=clvFiltros.GetPanel(i)
			Dim m As Map=p.Tag
			Dim mDatosCampoFiltro As CampoOrigenDatosJamTableCLV=m.Get("DatosCampoFiltro")
			If m.Get("FiltroCompleto")=True And m.Get("ComparadorFiltro")="Es igual a" _
				And m.Get("ValorFiltro")=ValorFiltroSel And mDatosCampoFiltro.AliasCampo=AliasCampoSel Then
				FlagFiltroYaExiste=True
				Exit
			End If
		Next
		
		If FlagFiltroYaExiste Then
'			Dim sTipoAndOr As String=m.get("OperadorFiltro")
'			If sTipoAndOr="" Then sTipoAndOr="Y"
'			Dim sTipoAndOrContrario As String
'			If sTipoAndOr="Y" Then
'				sTipoAndOrContrario="O"
'			Else
'				sTipoAndOrContrario="Y"
'			End If
'			Dim msa As Object = xui.Msgbox2Async("El filtro seleccionado ya existe, con el operador " &  sTipoAndOr & CRLF & CRLF & _
'				"¿Crear filtro con el operador " & sTipoAndOrContrario & "?" , "Confirma", "Sí", "", "No",Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return False
'			CambioOperador=True
			Dim msa As Object=xui.MsgboxAsync("El filtro seleccionado ya existe.","Aviso")
			Wait For (msa) Msgbox_Result
			Return False
		End If
		
		'CargandoDatos=True
		AddFiltro
		Wait For AddFiltro_completed
		'CargandoDatos=False
	End If
	
	
	' el filtro que vamos a añadir será el último panel del CLV
	Dim p As Pane=clvFiltros.GetPanel(clvFiltros.Size-1)
	Dim mDatosFiltro As Map=p.Tag
	Dim clviv As clvJAMTableCLVFiltroItemValue=clvFiltros.GetValue(clvFiltros.Size-1)
	'clviv.cboCampoFiltro.Value=AliasCampoSel
	
'	If CambioOperador Then
'		clviv.cboAndOrFiltro.Value=sTipoAndOrContrario
'		mDatosFiltro.put("OperadorFiltro",sTipoAndOrContrario)
'	End If
	
	cboCampoFiltroUserChange=False
	clviv.cboCampoFiltro.Value=AliasCampoSel
'	wait for (CambioCampoFiltro(clviv.cboCampoFiltro,AliasCampoSel)) complete (rBool As Boolean)
'	If Not(rBool) Then Return False
	'cboComparadorFiltroUserChange=False
	cbComparadorFiltroUserChange=False
	'clviv.cboComparadorFiltro.Value="Es igual a"
	'clviv.cboComparadorFiltro.Visible=True
	
	clviv.cbComparadorFiltro.SelectedIndex=clviv.cbComparadorFiltro.Items.IndexOf("Es igual a")
	clviv.cbComparadorFiltro.Visible=True
'	Dim c As CampoOrigenDatosJamTableCLV=GetDatosCampoOrigenDatosJamTableCLVAliasCampo(AliasCampoSel)

	
	If c.EsFecha Then
		Dim DatetimeFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yy"
		clviv.txtValorFechaFiltro.Text=DateTime.Date(ValorFiltroSel)
		DateTime.DateFormat=DatetimeFormatAnt
		clviv.txtValorFechaFiltro.Visible=True
		clviv.btnSelFechaFiltro.Visible=True
		clviv.btnSelFechaFiltro.Enabled=True
	Else
		Select True
			Case c.TipoControlFiltro=TipoControlFiltro_ComboBox
				cboValorFiltroUserChange=False
				clviv.cboValorFiltro.Value=ValorFiltroSel
				clviv.cboValorFiltro.Visible=True
				clviv.cboValorFiltro.Enabled=True
			Case c.TipoControlFiltro=TipoControlFiltro_TextField
				clviv.txtValorFiltro.Text=ValorFiltroSel
				clviv.txtValorFiltro.Visible=True
				clviv.txtValorFiltro.Enabled=True
			Case c.TipoControlFiltro=TipoControlFiltro_CheckBox
				chkValorFiltroUserChange=False
				If ValorFiltroSel Is Int Then 
					If 0=ValorFiltroSel Then
						clviv.chkValorFiltro.Checked=False
					Else
						clviv.chkValorFiltro.Checked=True
					End If
				Else
					clviv.chkValorFiltro.Checked=ValorFiltroSel
				End If
				clviv.chkValorFiltro.Visible=True
				clviv.chkValorFiltro.Enabled=True
		End Select
	End If
	'p.Tag=DatosFiltro(True,mDatosFiltro.Get("OperadorFiltro"),c,clviv.cboComparadorFiltro.Value,ValorFiltroSel)
	p.Tag=DatosFiltro(True,mDatosFiltro.Get("OperadorFiltro"),c,clviv.cbComparadorFiltro.Items.Get(clviv.cbComparadorFiltro.SelectedIndex),ValorFiltroSel)
	wait for(ActualizarFiltro) complete (rObj As Object)
	Return True
End Sub

private Sub ActualizarFiltro As ResumableSub
	
	
	'Log("************************ Actualizando Filtro ...")

	'''	If  B4XTable1.sql1.IsInitialized=False Then
	'''		Log("B4XTable1Asociada.sql1 no inicializado")
	'''		Return  ' No se han asignado datos a la B4XTable (o está vacía)
	'''	End If
	Dim sbTextoNuevoFiltro As StringBuilder
	sbTextoNuevoFiltro.Initialize
	Dim sbNuevoFiltroSQL As StringBuilder
	sbNuevoFiltroSQL.Initialize
	'Dim lstValoresFiltros As List
	lstOperadoresFiltros.Initialize
	lstCamposFiltros.Initialize
	lstComparadoresFiltros.Initialize
	lstValoresFiltros.Initialize
	For i=0 To clvFiltros.Size-1
		Dim p As Pane=clvFiltros.GetPanel(i)
		Dim m As Map=p.Tag
		Dim FiltroCompleto As Boolean=m.Get("FiltroCompleto")
		'Log("FiltroCompleto " & FiltroCompleto)
		If FiltroCompleto=False Then Continue  ' EL FILTRO NO ESTA COMPLETAMENTE DEFINIDO: PASAR AL SIGUIENTE PANEL DE FILTRO
		Dim OperadorFiltro As String=m.Get("OperadorFiltro")
		'Log("OperadorFiltro " & OperadorFiltro)
		'Dim c As TableCLVFiltroJAM=m.Get("TableCLVFiltroJAM")
		Dim c As CampoOrigenDatosJamTableCLV=m.Get("DatosCampoFiltro")
		'Dim ColumnaFiltro As B4XTableColumn=B4XTableColumnJAM.B4XTableColumna
		'Dim CampoAnalizadoSQL As String=c.Campo
		Dim CampoAnalizadoSQL As String=c.AliasCampo
		'Log("CampoAnalizadoSQL " & CampoAnalizadoSQL)
		'If CampoAnalizadoSQL="" Then Continue
		'Dim CampoAnalizado As String=ColumnaFiltro.Id
		'Log("CampoAnalizado " & CampoAnalizado)
		'If CampoAnalizado="" Then Continue
		'Dim TipoColumnaFiltro As String=ColumnaFiltro.ColumnType
		Dim TipoDatoFiltro As String=c.TipoDato
		Dim ComparadorFiltro As String=m.Get("ComparadorFiltro")
		#if DEBUG
			Log("ComparadorFiltro " & ComparadorFiltro)
		#End If
		
		Dim ComparadorFiltroSQL As String
		Dim ValorFiltro As Object=m.Get("ValorFiltro")
		'Log("ValorFiltro " & ValorFiltro)
		Dim ValorfiltroSQL As Object
		
		'If ValorFiltro="*" Or ValorFiltro="" Then Continue  ' si el unico caracter del valor filtro es *, o si no indica nada, equivale a no filtro. Pasar a siguiente campo de filtro
		'If ValorFiltro="*"  Then Continue  ' si el unico caracter del valor filtro es * equivale a no filtro. Pasar a siguiente campo de filtro

		If TipoDatoFiltro="" Then
			' no deberia darse
			Continue
		End If
		
		'If sbNuevoFiltroSQL.Length>0 Then 	' el primer filtro puede ser del tipo =*  , y entonces sbNuevoFiltroSQL estaría vacío
			Select OperadorFiltro
				Case ""
					' nada
				Case "Y"
						sbNuevoFiltroSQL.Append(" AND ")
				Case "O"
					sbNuevoFiltroSQL.Append(" OR ")
			End Select
		'End If
	
		If (TipoDatoFiltro="INTEGER" Or TipoDatoFiltro="REAL") And c.EsFecha Then
			Log("Tipo fecha")
'			Dim DateFormatAnt As String=DateTime.DateFormat
'			DateTime.DateFormat="dd/MM/yyyy"
			'ValorfiltroSQL=DateTime.DateParse(ValorFiltro)
			
			'OJO!!!!  EN EL CASO DE FECHAS, LOS VALORES DE LOS DATOS PUEDEN ESTAR EXPRESADOS EN FECHA-HORA. 
			
			'ValorfiltroSQL=ValorFiltro
'			Dim sDia As String=DateTime.Date(ValorFiltro)
'			Log("Dia seleccionado " & sDia)
			'Dim TicksHoraCeroDia As Long=DateTime.DateParse(sDia)
			Dim TicksHoraCeroDia As Long=DateUtils.SetDate(DateTime.GetYear(ValorFiltro),DateTime.GetMonth(ValorFiltro),DateTime.GetDayOfMonth(ValorFiltro))
			Log("Valor seleccionado " & ValorFiltro & " Valor dia seleccionado" & TicksHoraCeroDia)
			Dim Periodo As Period
			Periodo.Initialize
			Periodo.Days=1
			Dim TicksHoraCeroDiaSiguiente As Long=DateUtils.AddPeriod(TicksHoraCeroDia,Periodo)
			Select Case ComparadorFiltro
				Case "Es igual a"
					'ComparadorFiltroSQL="="

					sbNuevoFiltroSQL.Append("(")
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbNuevoFiltroSQL.Append(" >= ? ")
					lstValoresFiltros.Add(TicksHoraCeroDia)
					
					sbNuevoFiltroSQL.Append(" AND ")
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbNuevoFiltroSQL.Append(" < ? ")
					sbNuevoFiltroSQL.Append(")")

					'lstValoresFiltros.Add(DateTime.Add(TicksHoraCeroDia,0,0,1))
					lstValoresFiltros.Add(TicksHoraCeroDiaSiguiente)

					'sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" ([").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(ValorfiltroSQL).Append(" ")
					
					sbTextoNuevoFiltro.Append("(")
					sbTextoNuevoFiltro.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbTextoNuevoFiltro.Append(" >= ").Append(TicksHoraCeroDia)
					
					sbTextoNuevoFiltro.Append(" AND ")
					sbTextoNuevoFiltro.append("[").Append(CampoAnalizadoSQL).Append("]")
					'sbTextoNuevoFiltro.Append(" < ").Append(DateTime.Add(TicksHoraCeroDia,0,0,1))
					sbTextoNuevoFiltro.Append(" < ").Append(TicksHoraCeroDiaSiguiente)
					sbTextoNuevoFiltro.Append(")")

				Case "No es igual a"
					'ComparadorFiltroSQL="<>"
					
					sbNuevoFiltroSQL.Append("(")
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbNuevoFiltroSQL.Append(" < ? ")
					lstValoresFiltros.Add(TicksHoraCeroDia)
					
					sbNuevoFiltroSQL.Append(" OR ")
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbNuevoFiltroSQL.Append(" >= ? ")
					sbNuevoFiltroSQL.Append(")")
					lstValoresFiltros.Add(TicksHoraCeroDiaSiguiente)

					'sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" ([").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(ValorfiltroSQL).Append(" ")
					
					sbTextoNuevoFiltro.Append("(")
					sbTextoNuevoFiltro.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbTextoNuevoFiltro.Append(" < ").Append(TicksHoraCeroDia)
					
					sbTextoNuevoFiltro.Append(" OR ")
					sbTextoNuevoFiltro.append("[").Append(CampoAnalizadoSQL).Append("]")
					sbTextoNuevoFiltro.Append(" >= ").Append(TicksHoraCeroDiaSiguiente)
					sbTextoNuevoFiltro.Append(")")
							
				Case "Anterior a"
					ComparadorFiltroSQL="<"
					
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					'sb.Append(" " & ComparadorFiltroSQL & " " & ValorfiltroSQL)
					sbNuevoFiltroSQL.Append(" " & ComparadorFiltroSQL & " ? ")
					lstValoresFiltros.Add(TicksHoraCeroDia)

					sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" [").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(TicksHoraCeroDia).Append(" ")
						
				Case "Anterior o igual a"
					ComparadorFiltroSQL="<"
						
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					'sb.Append(" " & ComparadorFiltroSQL & " " & ValorfiltroSQL)
					sbNuevoFiltroSQL.Append(" " & ComparadorFiltroSQL & " ? ")
					lstValoresFiltros.Add(TicksHoraCeroDiaSiguiente)

					sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" [").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(TicksHoraCeroDiaSiguiente).Append(" ")
					
				Case "Posterior a"
					ComparadorFiltroSQL=">="
					
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					'sb.Append(" " & ComparadorFiltroSQL & " " & ValorfiltroSQL)
					sbNuevoFiltroSQL.Append(" " & ComparadorFiltroSQL & " ? ")
					lstValoresFiltros.Add(TicksHoraCeroDiaSiguiente)

					sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" [").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(TicksHoraCeroDiaSiguiente).Append(" ")
						
				Case "Posterior o igual a"
					ComparadorFiltroSQL=">="
					
					sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
					'sb.Append(" " & ComparadorFiltroSQL & " " & ValorfiltroSQL)
					sbNuevoFiltroSQL.Append(" " & ComparadorFiltroSQL & " ? ")
					lstValoresFiltros.Add(TicksHoraCeroDia)

					sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" [").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(TicksHoraCeroDia).Append(" ")
						
			End Select
				
			'DateTime.DateFormat=DateFormatAnt
			
			Continue   ' IMPORTANTE EN ESTE CASO (PARA NO VOLVER A HACER APPEND EN LOS STRINGBUILDERS)
			
			
			
		End If
					

		If (TipoDatoFiltro="INTEGER" Or TipoDatoFiltro="REAL") And c.EsFecha=False Then
			Log("Tipo numérico")
			ValorfiltroSQL=ValorFiltro
				
			If IsNumber(ValorFiltro)=False Then
				'Log("El valor del filtro " & ValorFiltro  & " no es un número.")
				ValorfiltroSQL="'" & ValorfiltroSQL & "'"
			End If
				
				

			Select Case ComparadorFiltro
				Case "Es igual a"
'						If ValorFiltro.Contains("*") Then
'							ComparadorSQL="LIKE "
'						Else
					ComparadorFiltroSQL="="
'						End If
						
				Case "No es igual a"
'						If ValorFiltro.Contains("*") Then
'							ComparadorSQL="NOT LIKE "
'						Else
					ComparadorFiltroSQL="<>"
'						End If
						
				Case "Mayor que"
					ComparadorFiltroSQL=">"
						
				Case "Mayor o igual que"
					ComparadorFiltroSQL=">="
						
				Case "Menor que"
					ComparadorFiltroSQL="<"
						
				Case "Menor o igual que"
					ComparadorFiltroSQL="<="
						
			End Select
				
		End If
		
		If TipoDatoFiltro="TEXT" Then
			Log("Tipo texto")
			Dim sValorFiltro As String=ValorFiltro

				
			Select Case ComparadorFiltro
				Case "Es igual a"
					If sValorFiltro.Contains("*") Then
						ComparadorFiltroSQL="LIKE "
						ValorfiltroSQL=sValorFiltro.Replace("*","%")
						'ValorfiltroSQL= "'" & ValorfiltroSQL & "'"
					Else
						ComparadorFiltroSQL="="
						ValorfiltroSQL=sValorFiltro
					End If
						
				Case "No es igual a"
					If sValorFiltro.Contains("*") Then
						ComparadorFiltroSQL="NOT LIKE "
						ValorfiltroSQL=sValorFiltro.Replace("*","%")
						'ValorfiltroSQL= "'" & ValorfiltroSQL & "'"
					Else
						ComparadorFiltroSQL="<>"
						ValorfiltroSQL=sValorFiltro
					End If
						
				Case "Comienza por"
					ComparadorFiltroSQL="LIKE "
					ValorfiltroSQL=sValorFiltro.Replace("*","%")
					'ValorfiltroSQL= "'" & ValorfiltroSQL & "%'"
					ValorfiltroSQL= ValorfiltroSQL & "%"
						
				Case "No comienza por"
					ComparadorFiltroSQL="NOT LIKE "
					ValorfiltroSQL=sValorFiltro.Replace("*","%")
					'ValorfiltroSQL= "'" & ValorfiltroSQL & "%'"
					ValorfiltroSQL= ValorfiltroSQL & "%"
						
				Case "Termina con"
					ComparadorFiltroSQL="LIKE "
					ValorfiltroSQL=sValorFiltro.Replace("*","%")
					'ValorfiltroSQL= "'%" & ValorfiltroSQL & "'"
					ValorfiltroSQL= "%" & ValorfiltroSQL
						
				Case "No termina con"
					ComparadorFiltroSQL="NOT LIKE "
					ValorfiltroSQL=sValorFiltro.Replace("*","%")
					'ValorfiltroSQL= "'%" & ValorfiltroSQL & "'"
					ValorfiltroSQL= "%" & ValorfiltroSQL
	
						
				Case "Contiene"
					ComparadorFiltroSQL="LIKE "
					ValorfiltroSQL=sValorFiltro.Replace("*","%")
					'ValorfiltroSQL= "'%" & ValorfiltroSQL & "%'"
					ValorfiltroSQL= "%" & ValorfiltroSQL & "%"
					
				Case "No contiene"
					ComparadorFiltroSQL="NOT LIKE"
					ValorfiltroSQL=sValorFiltro.Replace("*","%")
					'ValorfiltroSQL= "'%" & ValorfiltroSQL & "%'"
					ValorfiltroSQL= "%" & ValorfiltroSQL & "%"
			End Select
				
		End If
		
		Log("ComparadorFiltroSQL " & ComparadorFiltroSQL)
		Log("ValorfiltroSQL " & ValorfiltroSQL)
'
'		Select OperadorFiltro
'			Case ""
'				' nada
'			Case "Y"
'				sbNuevoFiltroSQL.Append(" AND ")
'					
'			Case "O"
'				sbNuevoFiltroSQL.Append(" OR ")
'		End Select
		
		sbNuevoFiltroSQL.append("[").Append(CampoAnalizadoSQL).Append("]")
		'sb.Append(" " & ComparadorFiltroSQL & " " & ValorfiltroSQL)
		sbNuevoFiltroSQL.Append(" " & ComparadorFiltroSQL & " ? ")
		lstOperadoresFiltros.Add(OperadorFiltro)
		lstCamposFiltros.Add(CampoAnalizadoSQL)
		lstComparadoresFiltros.Add(ComparadorFiltroSQL)
		lstValoresFiltros.Add(ValorfiltroSQL)

		'sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" [").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltro).Append(" ").Append(ValorfiltroSQL).Append(" ")
		sbTextoNuevoFiltro.Append(OperadorFiltro).Append(" [").Append(CampoAnalizadoSQL).Append("] ").Append(ComparadorFiltroSQL).Append(" ").Append(ValorfiltroSQL).Append(" ")

		Log(sbTextoNuevoFiltro.ToString)

	Next

	sCamposFiltrados=sbNuevoFiltroSQL.ToString
	'If sb.ToString.Length=0 Then Return

	

	
	'Log("Filtro actual: " & mFiltroActual & CRLF & " FiltroNuevo: " & sbTextoNuevoFiltro)
	
	'If CheckFiltroNuevoFiltroActual(FiltroNuevo,lstValoresFiltroNuevo) Then Return
	''''	sCamposFiltroActual=FiltroNuevo
	''''	lstCamposFiltroActual.Clear
	''''	lstValoresFiltroActual.Clear
	''''	For i=0 To lstCamposFiltroNuevo.Size-1
	''''		lstCamposFiltroActual.Add(lstCamposFiltroNuevo.Get(i))
	''''	Next
	''''	For i=0 To lstValoresFiltroNuevo.Size-1
	''''		lstValoresFiltroActual.Add(lstValoresFiltroNuevo.Get(i))
	''''
	''''	Next
	''''	FiltrarRegistros
	If mFiltroActual<>sbTextoNuevoFiltro Then
		mFiltroActual=sbTextoNuevoFiltro
		NPrimerRegistroVisible=1
		'SetMouseCursor(fx.Cursors.WAIT)
		WAIT FOR (ActualizarTableCLV(True)) COMPLETE (rObj As Object)
		'SetMouseCursor(fx.Cursors.DEFAULT)
		'Wait For ActualizarTableCLV_Completed
	End If
	Return Null
End Sub

'private Sub CheckFiltroNuevoFiltroActual(sFNuevo As String, lstValoresFNuevo As List) As Boolean
'	''''	If sFNuevo<>sCamposFiltroActual Then Return False
'	''''	If lstValoresFiltroActual.Size<>lstValoresFNuevo.Size Then Return False
'	''''	For i=0 To lstValoresFNuevo.Size-1
'	''''		If lstValoresFiltroActual.IndexOf(lstValoresFNuevo.Get(i))=-1 Then Return False
'	''''	Next
'	Return True
'End Sub

'Sub FiltrarRegistrosB4XTable(NuevoFiltro)
'	If SubExists(mCallBack, mEventName & "_ActualizarFiltro") Then
'		CallSub2(mCallBack, mEventName & "_ActualizarFiltro",NuevoFiltro)
'	Else
'		Dim msa As Object=xui.MsgboxAsync("Falta ","Error de programación.")
'		Log("Falta sub " & mEventName & "_ActualizarFiltro")
'		Dim ValErr As Int="asdfasf"  ' VARIABLE ERRONEA PARA PROVOCAR QUE LA APLICACION SE CIERRE POR ERROR Y SE ENVIE EL LogCrash.
'	End If
'End Sub
#End Region




Private Sub Base_Resize (Width As Double, Height As Double)
	Log("jamTV Base Resize")
'	mWidth=Width
'	mHeight=Height
'	mBase.Height=mHeight
'	mBase.Width=mWidth

	If LayoutLoaded=False Then Return
	
	jamCircularProgressBarCLV.Left=(clvDatos.AsView.Width-jamCircularProgressBarCLV.Width)/2
	jamCircularProgressBarCLV.Top=(clvDatos.AsView.Height-jamCircularProgressBarCLV.Height)/2

'	
	PosicionDimensionesCLVFiltros
End Sub


Public Sub SetPanelInfoVisible(Visible As Boolean)
	mPanelInfoVisible=Visible
	PosicionDimensionesCLVFiltros
End Sub

Public Sub getTextoPanelInfoJamTableView As Object
	Return lblInfoJamTableCLV.Text
End Sub

' Color es Int
Public Sub SetColorFondoPanelInfoJamTableView(ColorFondo As Int)
	Dim pI As B4XView=lblInfoJamTableCLV
	pI.Color=ColorFondo
End Sub

' Color es Int
Public Sub GetColorFondoActualPanelInfoJamTableView As Int
	Dim pI As B4XView=pnlInfoJamTableCLV
	Return pI.Color
End Sub

' Color es Int
Public Sub GetColorTextoActualPanelInfoJamTableView As Int
	Return lblInfoJamTableCLV.Color
End Sub

' el color que se asigna en el JSON
Public Sub GetColorFondoInicialPanelInfoJamTableView As Int
	Return ColorFondoPanelInfoInicial
End Sub

' el color que se asigna en el JSON
Public Sub GetColorTextoInicialPanelInfoJamTableView As Int
	Return ColorTextoPanelInfoInicial
End Sub

Public Sub SetColorTextoPanelInfoJamTableView(ColorTexto As Int)
	lblInfoJamTableCLV.TextColor=ColorTexto
End Sub


'Private Sub clvFiltros_ItemClick (Index As Int, Value As Object)
'	
'End Sub
'
'Private Sub clvFiltros_ItemLongClick (Index As Int, Value As Object)
'	
'End Sub
'
'Private Sub clvFiltros_ReachEnd
'	
'End Sub
'
'Private Sub clvFiltros_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	
'End Sub
'
'Private Sub clvFiltros_ScrollChanged (Offset As Int)
'	
'End Sub

private Sub FindUserDocumentsFolder As String
	If DetectOS = "windows" Then
		Dim jo As JavaObject
		Dim fs As JavaObject = jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethod("getFileSystemView", Null)
		Return fs.RunMethodJO("getDefaultDirectory", Null).RunMethod("getPath", Null)
	Else
		Return GetSystemProperty("user.home", "") & "/Documents"
	End If
End Sub

private Sub DetectOS As String
	Dim os As String = GetSystemProperty("os.name", "").ToLowerCase
	If os.Contains("win") Then
		Return "windows"
	Else If os.Contains("mac") Then
		Return "mac"
	Else
		Return "linux"
	End If
End Sub


Private Sub ExportarTablaAExcel As ResumableSub
	
	Dim answ As Object =xui.Msgbox2Async("Se exportarán a excel los datos de la tabla ( sólo los registros FILTRADOS. Si la tabla no está filtrada, se exportarán todos los registros)", "Exportación a excel", "Sí", "Cancelar", "", Null)
	Wait For (answ) Msgbox_Result (Result As Int)
	If Result <>xui.DialogResponse_Positive Then Return False
	
	
	If clvDatos.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay registros seleccionados para exportar a excel","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
		
'	Dim UserFolderDocuments As String=FindUserDocumentsFolder
'	Log("UserFolderDocuments: " & UserFolderDocuments)
'	
'	If mNombreAplicacion="" Then
'		Dim msa As Object=xui.MsgboxAsync("No se ha definido el nombre de la aplicación para la carpeta roaming. Avisa al administrador de la aplicación","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If

	Dim UserDocFolder As String=FindUserDocumentsFolder
	Dim fc As FileChooser
	fc.Initialize
	fc.Title="Exportación Excel"
	fc.SetExtensionFilter("Ficheros Excel", Array As String("*.xlsx","*.xlsm","*.xls"))
	'fc.InitialFileName=""
	fc.InitialDirectory=UserDocFolder
	Dim fileName As String = fc.ShowSave(mParentForm)
	If fileName = "" Then Return False
		

	Dim NombreFicheroExcel As String=File.GetName(fileName)
	Dim DirFicheroExcel As String=File.GetFileParent(fileName)
'	
'	'	If FixNull(mNombreExcel)="" Then
'	Dialog.Title="Exportación excel"
'	Dim input As B4XInputTemplate
'	input.Initialize
'	input.lblTitle.Text ="Indica Nombre fichero excel:"
'	Dim rSub As ResumableSub=(Dialog.ShowTemplate(input, "OK", "", "CANCELAR"))
'	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOk.Left=5dip
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.left=bCancel.left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For (rSub) Complete (Result As Int)
'	If Result <> xui.DialogResponse_Positive Then Return False
'	NombreFicheroExcel=input.Text


	If ExportarOrigenDatosAExcel(DirFicheroExcel, NombreFicheroExcel, "Hoja1") Then

		'fx.ShowExternalDocument(File.GetUri(File.DirData(mNombreAplicacion), NombreFicheroExcel & ".xlsx"))
		'Dim UserDocFolder As String=FindUserDocumentsFolder
		'Dim msa As Object=xui.MsgboxAsync("Fichero excel " & UserDocFolder & "\" & NombreFicheroExcel & ".xlsx grabado." & CRLF & CRLF & ".","Aviso")
		Dim msa As Object=xui.MsgboxAsync("Fichero excel " & fileName & " grabado." & CRLF & CRLF & ".","Aviso")
		Wait For (msa) Msgbox_Result
			
		'fx.ShowExternalDocument(File.GetUri(UserDocFolder, NombreFicheroExcel & ".xlsx"))
		fx.ShowExternalDocument(File.GetUri(DirFicheroExcel,NombreFicheroExcel))
		Return True
	Else
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el fichero. Verifica si tienes excel en el equipo, y que no esté abierto ya un fichero con el nombre" &  NombreFicheroExcel & ".xlsx","Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If

'	End If
End Sub

private Sub ExportarOrigenDatosAExcel(DirectorioFicheroExcel As String,NombreFicheroExcel As String, NombreHojaExcel As String) As Boolean

	'Dim sf2 As StringFunctions2
	Dim wb As PoiWorkbook
	wb.InitializeNew(True) 'crear nuevo libro
  
	'creamos la hoja del libro, con el nombre del parámetro
	Dim sheet1 As PoiSheet
	sheet1 = wb.AddSheet(NombreHojaExcel,0)
	
	Dim jo As JavaObject=sheet1
	Try
		jo.RunMethod("trackAllColumnsForAutoSizing",Null)
	Catch
		LogColor(LastException.Message, xui.Color_Red)
	End Try
	
	Dim csFecha As PoiCellStyle
	csFecha.Initialize(wb)
	csFecha.SetDataFormat(wb,"dd/MM/yyyy")
	
	Dim fNegritaAzul As PoiFont
	fNegritaAzul.Initialize(wb)
	fNegritaAzul.Bold = True
	'fNegritaAzul.SetColor(fx.Colors.From32Bit(0xFF1E90FF))
	fNegritaAzul.SetColor(0xFF1E90FF)
	
	Dim csEncabezado As PoiCellStyle
	csEncabezado.Initialize(wb)
	csEncabezado.SetFont(fNegritaAzul)
	
'	Dim sbCamposDeControlesVisibles As StringBuilder
'	sbCamposDeControlesVisibles.Initialize
'	For i=0 To mlstColumnasVisibles.Size-1
'		Dim Col As TableColumn=mlstColumnasVisibles.Get(i)
'		sbCamposDeControlesVisibles.Append(Col.Tag).Append(",")
'	Next
'	sbCamposDeControlesVisibles.Remove(sbCamposDeControlesVisibles.Length-1,sbCamposDeControlesVisibles.Length)

	Dim sbCamposDeControlesVisibles As StringBuilder
	sbCamposDeControlesVisibles.Initialize
	'ActualizarStatusColumnasTableCLV
	
	'For i=0 To mlstCamposColumnasVisibles.Size-1
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		'For i=0 To TableCLVJAM.Size-1
		'Dim Col As TableColumn=mlstColumnasVisibles.Get(i)
		'Dim c As CampoOrigenDatosJamTableCLV=mlstCamposColumnasVisibles.Get(i)
		'sbCamposDeControlesVisibles.Append(Col.Tag).Append(",")
		'If c.EncabezadoColumna<>"" Then
		'If c.ColumnaTableCLV And c.ColumnaVisible Then
			'sbCamposDeControlesVisibles.append("[").Append(c.Campo).Append("]").Append(",")
			sbCamposDeControlesVisibles.append("[").Append(c.AliasCampo).Append("]").Append(",")
		'End If
		'End If
	Next
	sbCamposDeControlesVisibles.Remove(sbCamposDeControlesVisibles.Length-1,sbCamposDeControlesVisibles.Length)
	
	Dim rsRegistrosFiltradosTabla As ResultSet
	If lstValoresFiltros.Size>0 Then
		rsRegistrosFiltradosTabla=mSQL.ExecQuery2("select " & sbCamposDeControlesVisibles.ToString & " from tblOrigenDatos where " & sCamposFiltrados,lstValoresFiltros)
	Else
		rsRegistrosFiltradosTabla=mSQL.ExecQuery("select " & sbCamposDeControlesVisibles.ToString & " from tblOrigenDatos")
	End If
	
  
	'Encabezados Excel
	Dim FilaEncabezados As PoiRow = sheet1.CreateRow(0)   ' Encabezados= FILA 0
	'For i= 0 To TableCLVJAM.ColumnsCount-1
	Dim iDx As Int
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		'If c.ColumnaTableCLV And c.ColumnaVisible Then
			'FilaEncabezados.CreateCellString(i, TableCLVJAM.GetColumnHeader(i))
			FilaEncabezados.CreateCellString(iDx, c.AliasCampo)
			Dim cAct As PoiCell=FilaEncabezados.GetCell(iDx)
			cAct.CellStyle=csEncabezado
			iDx=iDx+1
		'End If
		
	Next
	
'	creamos la primera fila de la excel
'	Dim FilaExcel As PoiRow = sheet1.CreateRow(1)
  
	Dim FAct As Int=1
	'Recorremos las filas del recordset
	Do While rsRegistrosFiltradosTabla.NextRow
		Dim FilaExcel As PoiRow = sheet1.CreateRow(FAct)
		'Indice para las columnas de la excel
		Dim ColumnaExcel As Int = 0
	
		'recorrer todas las columnas de la tabla

'		For k=0 To mlstColumnasVisibles.Size-1
'			Dim c As TableColumn=mlstColumnasVisibles.Get(k)
'			Dim CampoCol As String=c.Tag
'			Select True
'				Case c.TipoDato=DBUtils.DB_INTEGER
'					Dim vi As Int=rsRegistrosFiltradosTabla.GetInt(c.Campo)
'					FilaExcel.CreateCellNumeric(ColumnaExcel,vi)
'				Case c.TipoDato=DBUtils.DB_REAL
'					Dim vr As Double=rsRegistrosFiltradosTabla.GetDouble(c.Campo)
'					FilaExcel.CreateCellNumeric(ColumnaExcel,sf2.Val(NumberFormat(vr,1,c.NumeroDecimales)))
'				Case c.TipoDato=DBUtils.DB_TEXT
'					Dim vs As String=rsRegistrosFiltradosTabla.GetString(c.Campo)
'					FilaExcel.CreateCellString(ColumnaExcel,vs)
'			End Select
'			ColumnaExcel = ColumnaExcel  + 1
'		Next
		
		'For k=0 To mLstCamposOrigenDatos.Size-1
		For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
			'Dim c As TableColumn=mlstColumnasVisibles.Get(k)
			'Dim c As CampoOrigenDatosJamTableCLV=mLstCamposOrigenDatos.Get(k)
			'If c.EncabezadoColumna<>"" Then
			'If c.ColumnaTableCLV And c.ColumnaVisible Then
				'Dim CampoCol As String=c.campo
				Select True
					Case c.TipoDato="INTEGER"
						'Dim vi As Int=rsRegistrosFiltradosTabla.GetInt(c.Campo)
						Dim vi As Int=rsRegistrosFiltradosTabla.GetInt(c.AliasCampo)
						FilaExcel.CreateCellNumeric(ColumnaExcel,vi)
					Case c.TipoDato="REAL"
						'Dim vr As Double=rsRegistrosFiltradosTabla.GetDouble(c.Campo)
						
						'FilaExcel.CreateCellNumeric(ColumnaExcel,sf2.Val(NumberFormat(vr,1,c.NumeroDecimales)))
						
						If c.EsFecha Then
							Dim vr As Double=rsRegistrosFiltradosTabla.GetLong(c.AliasCampo)
							FilaExcel.CreateCellNumeric(ColumnaExcel,(vr/DateTime.TicksPerDay)+25569)
							Dim cellF As PoiCell=FilaExcel.GetCell(ColumnaExcel)
							cellF.CellStyle=csFecha
						Else
							Dim vr As Double=rsRegistrosFiltradosTabla.GetDouble(c.AliasCampo)
							FilaExcel.CreateCellNumeric(ColumnaExcel,vr)
	
						End If
					Case c.TipoDato="TEXT"
						'Dim vs As String=rsRegistrosFiltradosTabla.GetString(c.Campo)
						Dim vs As String=rsRegistrosFiltradosTabla.GetString(c.AliasCampo)
						FilaExcel.CreateCellString(ColumnaExcel,vs)
				End Select
				ColumnaExcel = ColumnaExcel  + 1
			'End If
		Next


  
'		'Go to the next row... remember, first row is title and second row is the beginning of data...
'		FilaExcel = sheet1.CreateRow(i + 2)
'		FilaExcel.RowNumber = i + 2
		FAct=FAct+1
	Loop
	rsRegistrosFiltradosTabla.Close
	
	For k=0 To ColumnaExcel-1
		Try
			jo.RunMethod("autoSizeColumn",Array(k))
		Catch
			LogColor(LastException.Message, xui.Color_Red)
		End Try
	Next
	
	' Incluir un autofiltro
	Dim CelReng As JavaObject
	'CelReng.InitializeNewInstance("org.apache.poi.ss.util.CellRangeAddress",Array(0,0, 0, TableCLVJAM.ColumnsCount-1))
	CelReng.InitializeNewInstance("org.apache.poi.ss.util.CellRangeAddress",Array(0,0, 0, ColumnaExcel-1))
	jo.RunMethod("setAutoFilter",Array(CelReng))
	

	
	''''
	' grabamos el fichero con el titulo del formulario
	Dim NombreFicheroExcel As String=NombreFicheroExcel
	Dim UserDocFolder As String=FindUserDocumentsFolder
	Try
		'wb.Save(File.DirData(mNombreAplicacion), NombreFicheroExcel & ".xlsx")
		'wb.Save(UserDocFolder, NombreFicheroExcel & ".xlsx")
		'wb.Save(UserDocFolder, NombreFicheroExcel)
		wb.Save(DirectorioFicheroExcel.Replace("\","/"), NombreFicheroExcel)
		wb.Close
		Return True
	Catch
		Return False
	End Try
	

End Sub


#Region Orden SQL
private Sub DialogoOrdenarSQL As ResumableSub
	
	Dialog.Title="Ordenar tabla de datos"
	Dialog.BlurBackground=False
	Dim pBaseCLV As B4XView = xui.CreatePanel("")
	pBaseCLV.SetLayoutAnimated(0, 0, 0, 580dip, 500dip)
	pBaseCLV.LoadLayout("scrCLVOrdenSQLJamTableCLV")
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseCLV,"OK","","Cancelar")
	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOk.Left=5dip
	bOk.TextSize=16
	'bOk.Enabled=False
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.left=bCancel.left-20dip
	bCancel.Width=bCancel.Width+20dip
	bCancel.Textsize=16
	If lstOrdenSQL.Size=0 Then
		Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue
		clviv2.Initialize
		Dim dOrd As DatosOrdenSQLJamTableCLV
		dOrd.Initialize
		CLVOrdenSQLjamTableCLV.Add(CreateItemOrdenSQL(dOrd, clviv2),clviv2)
	Else
		lstOrdenSQL.SortType("IndiceOrdenSQL",True)
		For Each dOrd As DatosOrdenSQLJamTableCLV In lstOrdenSQL
			Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue
			CLVOrdenSQLjamTableCLV.Add(CreateItemOrdenSQL(dOrd, clviv2),clviv2)
		Next
	End If

	wait for (rSub) complete (rint As Int)
	If rint=xui.DialogResponse_Positive Then
		lstOrdenSQL.Initialize
		For i=0 To CLVOrdenSQLjamTableCLV.Size-1
			Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue=CLVOrdenSQLjamTableCLV.GetValue(i)
			Dim dOL As DatosOrdenSQLJamTableCLV
			dOL.IndiceOrdenSQL=i
			dOL.AliasCampoOrdenSQL=clviv2.cboCampoOrdenacionSQL.Value
			If dOL.AliasCampoOrdenSQL<>"" Then
				dOL.TipoOrdenSQL=clviv2.cboTipoOrdenacionSQL.Value
				For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
					If c.AliasCampo=dOL.AliasCampoOrdenSQL Then
						dOL.CampoOrdenSQL=c.Campo
						Exit
					End If
				Next
				lstOrdenSQL.Add(dOL)
			End If
		Next
		'SetMouseCursor(fx.Cursors.WAIT)
		WAIT FOR (ActualizarTableCLV(True)) COMPLETE (rObj As Object)
		'SetMouseCursor(fx.Cursors.DEFAULT)

		Return True
	Else
		Return False
	End If
End Sub

'private Sub AddItemOrdenSQL
'	
'End Sub

private Sub CreateItemOrdenSQL(dOSQL As DatosOrdenSQLJamTableCLV, clviv2 As clvJAMTableCLVOrdenSQLItemValue) As B4XView
	Dim p As B4XView =xui.CreatePanel("")
	p.LoadLayout("scrItemOrdenacionSQLJamTableCLV")
	CSSUtils.SetBackgroundColor(p,fx.Colors.From32Bit(0x00FFFFFF))
	p.SetLayoutAnimated(0, 0, 0, CLVOrdenSQLjamTableCLV.AsView.Width, 70dip)
	
	clviv2.cboCampoOrdenacionSQL=cboCampoOrdenacionSQL
	clviv2.cboTipoOrdenacionSQL=cboTipoOrdenacionSQL
	
	cboCampoOrdenacionSQL.Items.Addall(RestoCamposOrdenSQLcbo)
	cboTipoOrdenacionSQL.Items.AddAll(Array As String("Ascendente","Descendente"))
	'cboCampoOrdenacionSQL.Value=dOSQL.CampoOrdenSQL
	cboCampoOrdenacionSQL.Value=dOSQL.AliasCampoOrdenSQL
	cboTipoOrdenacionSQL.Value=dOSQL.TipoOrdenSQL
	cboTipoOrdenacionSQL.Value="Ascendente"
	'cboCampoOrdenacionSQL.Value=dOSQL.CampoOrdenSQL
	cboCampoOrdenacionSQL.Value=dOSQL.AliasCampoOrdenSQL
	cboTipoOrdenacionSQL.Value=dOSQL.TipoOrdenSQL
	
	Return p
End Sub

private Sub btnAddCampoOrdenacionSQL_Click
	Dim iDx As Int=CLVOrdenSQLjamTableCLV.GetItemFromView(Sender)
	Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue=CLVOrdenSQLjamTableCLV.GetValue(iDx)
	If FixNull(clviv2.cboCampoOrdenacionSQL.Value)="" Or FixNull(clviv2.cboTipoOrdenacionSQL.Value)="" Then
		Dim msa As Object=xui.MsgboxAsync("El elemento actual no está completo. No se puede añadir otro elemento hasta completar éste.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Dim lstNombresRestoCampos As List=RestoCamposOrdenSQLcbo
	If lstNombresRestoCampos.size=0 Then
		Dim msa As Object=xui.MsgboxAsync("Todos los campos ordenables están ya seleccionados. No se puede añadir otro elemento.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim dOl As DatosOrdenSQLJamTableCLV
	dOl.Initialize
	Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue
	CLVOrdenSQLjamTableCLV.Add(CreateItemOrdenSQL(dOl,clviv2),clviv2)
	Sleep(350)
	CLVOrdenSQLjamTableCLV.ScrollToItem(CLVOrdenSQLjamTableCLV.Size-1)
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.Enabled=False
End Sub

private Sub btnEliminarCampoOrdenacionSQL_Click
	Dim iDx As Int=CLVOrdenSQLjamTableCLV.GetItemFromView(Sender)
	Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue=CLVOrdenSQLjamTableCLV.GetValue(iDx)
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	CLVOrdenSQLjamTableCLV.RemoveAt(iDx)
	If CLVOrdenSQLjamTableCLV.Size=0 Then
		Dim dOl As DatosOrdenSQLJamTableCLV
		dOl.Initialize
		Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue
		CLVOrdenSQLjamTableCLV.Add(CreateItemOrdenSQL(dOl,clviv2),clviv2)
		
		'bOK.Enabled=False
		bOK.Enabled=True
	Else
		bOK.Enabled=True
	End If
	Sleep(350)
	CLVOrdenSQLjamTableCLV.ScrollToItem(Max(0,(iDx-1)))
End Sub

private Sub RestoCamposOrdenSQLcbo As List
	Dim lstNombresCamposOrdenSQLActual As List
	lstNombresCamposOrdenSQLActual.Initialize
	Dim lstNombresRestoCampos As List
	lstNombresRestoCampos.Initialize
	For i=0 To CLVOrdenSQLjamTableCLV.Size-1
		Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue=CLVOrdenSQLjamTableCLV.GetValue(i)
		If FixNull(clviv2.cboCampoOrdenacionSQL.Value)<>"" Then
			lstNombresCamposOrdenSQLActual.Add(clviv2.cboCampoOrdenacionSQL.Value)
		End If
	Next

	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		If lstNombresCamposOrdenSQLActual.IndexOf(c.AliasCampo)=-1 Then
			lstNombresRestoCampos.Add(c.AliasCampo)
		End If
	Next
	lstNombresRestoCampos.Sort(True)
	Return lstNombresRestoCampos
End Sub

private Sub cboCampoOrdenacionSQL_ValueChanged (Value As Object)
	Dim iDx As Int=CLVOrdenSQLjamTableCLV.GetItemFromView(Sender)
	Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue=CLVOrdenSQLjamTableCLV.GetValue(iDx)
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	'Log("FixNull(clviv2.cboTipoOrdenacionSQL.Value)<>"" " & FixNull(clviv2.cboTipoOrdenacionSQL.Value)<>"")
	'bOK.Enabled=FixNull(clviv2.cboTipoOrdenacionSQL.Value)<>""
	bOK.Enabled=(FixNull(clviv2.cboTipoOrdenacionSQL.Value)="") = (FixNull(clviv2.cboCampoOrdenacionSQL.Value)="")
		

End Sub

private Sub cboTipoOrdenacionSQL_ValueChanged (Value As Object)
	Dim iDx As Int=CLVOrdenSQLjamTableCLV.GetItemFromView(Sender)
	Dim clviv2 As clvJAMTableCLVOrdenSQLItemValue=CLVOrdenSQLjamTableCLV.GetValue(iDx)
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	'Log("FixNull(clviv2.cboCampoOrdenacionSQL.Value)<>"" " & FixNull(clviv2.cboCampoOrdenacionSQL.Value)<>"")
	'bOK.Enabled=FixNull(clviv2.cboCampoOrdenacionSQL.Value)<>""
	bOK.Enabled=(FixNull(clviv2.cboTipoOrdenacionSQL.Value)="") = (FixNull(clviv2.cboCampoOrdenacionSQL.Value)="")
End Sub
#End Region



'El NombreAplicacion es necesario para la carpeta AppData\Roaming\...
'<code>
'Dim rSub As ResumableSub=jamTableCLV1.ConfigurarTableCLV("NombreFicheroJSON.json")
'wait for (rSub) complete (mRes As Map)
'Log(mRes)
'If Not(mRes.Get("FlagOK")) Then
'	Dim msa As Object=Xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'	Wait For (msa) Msgbox_Result
'	frm.Close
'	Return
'End If
'</code>
' si el json no está creado, añadir previamente:
'<code>
'	jamTableCLV1.AbrirCamposBuilder
'	Return
'</code>
' (despues de creado, comentar o eliminar ese codigo)
public Sub ConfigurarTableCLV(NombreFicheroJSON As String) As ResumableSub
		
	Dim joBA As JavaObject
	joBA.InitializeStatic("anywheresoftware.b4a.BA")
	Log("Packagename: " & joBA.GetField("packageName"))
	Dim sPackage As String=joBA.GetField("packageName")
	Dim PackageName() As String=Regex.Split("\.",sPackage)
	mNombreAplicacion=PackageName(PackageName.Length-1)
	#if DEBUG 
	Log("NombreAplicacion "& mNombreAplicacion)
	#end if
	
	mNombreUsuarioWindows=GetSystemProperty("user.name", "default")
	
	If File.Exists(File.DirData(mNombreAplicacion),"")=False Then
		File.MakeDir(File.DirData(mNombreAplicacion),"")
	End If

	Dim mResultConfigurarTableCLV As Map
	mResultConfigurarTableCLV.Initialize
	mResultConfigurarTableCLV.put("FlagOK", True)  ' por defecto asignamos TRUE. Si hay error, modificamos a FALSE
	
	ReiniciarFiltros

	
	Dim mResultSetOrigenDatos As Map=SetOrigenDatos(NombreFicheroJSON)

	If  Not(mResultSetOrigenDatos.get("FlagOK")) Then
		#If Debug
		Dim answ As Object =xui.Msgbox2Async(mResultSetOrigenDatos.Get("msgError") & CRLF & CRLF & "¿Abrir CamposBuilder con el JSON correspondiente?", "Error Origen de datos", "Sí", "", "No", Null)
		Wait For (answ) Msgbox_Result (Result As Int)
		If Result =xui.DialogResponse_Positive Then
			AbrirCamposBuilderEdicion
		End If
		Return mResultSetOrigenDatos
		#Else
			Return mResultSetOrigenDatos
	    #End If
		
	Else
		OrigenDatosConfiguradoOK=True
		Return mResultConfigurarTableCLV
	End If

End Sub


private Sub SetOrigenDatos(NombreFicheroJSON As String) As Map
	'mBase.MouseCursor=fx.Cursors.WAIT
	'TableCLVJAM.Visible=False
	
	ReiniciarFiltros
	
	If mSQL.IsInitialized Then mSQL.Close
	
	mLstCamposOrigenDatos.Initialize
	mLstCamposOrigenDatosConfiguracionOriginal.Initialize
	mlstCamposOrigenDatosNoCalculados.Initialize
	mlstCamposPrimaryKey.Initialize
	mlstIndicesFilasVisibles.Initialize

	lstOperadoresFiltros.Initialize
	lstCamposFiltros.Initialize
	lstComparadoresFiltros.Initialize
	lstValoresFiltros.Initialize
	lstOrdenSQL.Initialize
	
	NombreJSONOrigenDatos=NombreFicheroJSON
	NombreJSONOrigenDatosUsuario=NombreFicheroJSON.Replace(".json","") & "_" & mNombreUsuarioWindows & ".json"
	
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("FlagOK",True)
	mResult.Put("msgError","")
	mResult.Put("mlstTableColumns",Null)
	
	Try
		Dim FicheroJSON As String=File.ReadString(File.DirAssets, NombreFicheroJSON)
	Catch
		mResult.Put("FlagOK",False)
		mResult.Put("msgError","Fichero no encontrado " & NombreFicheroJSON)
		'mBase.MouseCursor=fx.Cursors.DEFAULT
		Return mResult
	End Try

	Dim p As JSONParser
	p.Initialize(FicheroJSON)
	Dim m As Map = p.NextObject


	FechaUltimaModificacionJSON=m.Getdefault("FechaUltimaModificacion",0)
	Dim sColorTextoPanelInfo As String=m.Getdefault("ColorTextoPanelInfo","")
	If sColorTextoPanelInfo="" Then
		lblInfoJamTableCLV.TextColor=0xFF000000
		
	Else
		lblInfoJamTableCLV.TextColor=HexToColor(sColorTextoPanelInfo)
	End If
	ColorTextoPanelInfoInicial=lblInfoJamTableCLV.TextColor
	
	Dim sColorFondoPanelInfo As String=m.Getdefault("ColorFondoPanelInfo","")
	If sColorFondoPanelInfo="" Then
		'pnlInfoJamTableCLV.Color=0xFFFFF8C3
		CSSUtils.SetBackgroundColor(pnlInfoJamTableCLV,fx.Colors.From32Bit(0xFFFFF8C3))
		ColorFondoPanelInfoInicial=0xFFFFF8C3
	Else
		'pnlInfoJamTableCLV.Color=HexToColor(sColorFondoPanelInfo)
		'CSSUtils.SetBackgroundColor(pnlInfoJamTableCLV,sColorFondoPanelInfo)
		pnlInfoJamTableCLV.Style="-fx-background-color:" & sColorFondoPanelInfo & ";"
		ColorFondoPanelInfoInicial=HexToColor(sColorFondoPanelInfo)
	End If
	
	
	Dim lstDatosCamposOrigenDatos As List = m.Get("Items")
	If lstDatosCamposOrigenDatos.Size= 0 Then
		mResult.Put("FlagOK",False)
		mResult.Put("msgError","No hay datos de campos en el fichero " & NombreFicheroJSON)
		'mBase.MouseCursor=fx.Cursors.DEFAULT
		Return mResult
	End If
	
	' Comprobar que los items del JSON tienen todas las claves necesarias=variables del tipo (type) CampoOrigenDatosJamLCLV
	
	Dim lstDataJSON As List
	lstDataJSON.Initialize
	Dim iDxMapsItemslstDatosCamposOrigenDatos As Int
	Dim sbErroresKeysMapsItems As StringBuilder
	sbErroresKeysMapsItems.Initialize
	
	For Each m As Map In lstDatosCamposOrigenDatos
		For Each sMember As String In lstMembersCampoOrigenDatosJamTableCLV
			If Not(m.ContainsKey(sMember)) Then
				sbErroresKeysMapsItems.Append("Item #" & iDxMapsItemslstDatosCamposOrigenDatos & " no existe key " & sMember).Append(CRLF)
			End If
		Next
		If sbErroresKeysMapsItems.Length>0 Then Exit
		iDxMapsItemslstDatosCamposOrigenDatos=iDxMapsItemslstDatosCamposOrigenDatos+1
	Next
	If sbErroresKeysMapsItems.Length>0 Then
		sbErroresKeysMapsItems.Insert(0,"Existen errores de clave de mapas de definicion JSON." & CRLF & "Fichero JSON: " & NombreFicheroJSON & CRLF & "El formato no es correcto (¿versión obsoleta?)." & CRLF & CRLF)
		mResult.Put("FlagOK",False)
		mResult.Put("msgError",sbErroresKeysMapsItems.ToString)
		'mBase.MouseCursor=fx.Cursors.DEFAULT
		Return mResult
	End If
	
	
	For Each m As Map In lstDatosCamposOrigenDatos
		Dim c As CampoOrigenDatosJamTableCLV

		c.ID=m.GetDefault("ID",0)

		c.Campo=m.get("Campo")

		c.AliasCampo=m.get("AliasCampo")
		
		c.CampoCalculado=m.Getdefault("CampoCalculado",False)
		
		c.EncabezadoColumna=m.get("EncabezadoColumna")

		c.KeyID=m.getdefault("KeyID",0)
		
		c.TipoControlFiltro=m.getdefault("TipoControlFiltro","")
		
		c.TipoDato=m.get("TipoDato")
		
		c.NoNulo=m.getdefault("NoNulo",True)
		
		c.ConValorDefecto=m.getdefault("ConValorDefecto",False)
		
		c.ValorDefecto=m.getdefault("ValorDefecto","")

		c.EsFecha=m.getdefault("EsFecha",False)
		
		c.EsBooleano=m.GetDefault("EsBooleano",False)
		
		c.TipoControlEdicion=m.GetDefault("TipoControlEdicion","")
		
		lstDataJSON.Add(c)
	Next
	


	If lstDataJSON.Size= 0 Then
		mResult.Put("FlagOK",False)
		mResult.Put("msgError","No hay datos de campos en el fichero " & FicheroJSON)
		'mBase.MouseCursor=fx.Cursors.DEFAULT
		Return mResult
	End If
	
	lstDataJSON.SortType("OrdenColumna",True)
	
'	mLstCamposOrigenDatos=lstDataJSON
	
	For lstIdx=0 To lstDataJSON.Size-1
		mLstCamposOrigenDatos.Add(lstDataJSON.Get(lstIdx))
		mLstCamposOrigenDatosConfiguracionOriginal.Add(lstDataJSON.Get(lstIdx))
	Next
	
	#If Debug
	Log("Campos Origen Datos JSON: " & NombreJSONOrigenDatos)
	Log(" ")
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		Log("DATOS CAMPO " & mLstCamposOrigenDatos.IndexOf(c))
		Log(c)
		Log(" ")
	Next
	#End If
	

	'Dim NombreJSON As String=File.GetName(NombreJSONOrigenDatos)
	
	mlstCamposPrimaryKey.Initialize
	Dim lstAliasCampos As List
	lstAliasCampos.Initialize
	Dim lstCampos As List
	lstCampos.Initialize
'	Dim lstCamposPrimaryKeysOrden As List
'	lstCamposPrimaryKeysOrden.Initialize
	mlstCamposOrigenDatosNoCalculados.Initialize ' su utilidad es comparar los datos que se pasan como datos del registro con los campos que se han definido para el origen de datos (los calculados NO se pasan)
	
	Dim sbCampostblOrigenDatos As StringBuilder
	sbCampostblOrigenDatos.Initialize
	sbCampostblOrigenDatos.Append("IDClaveUnicaRegistrojamTableCLV").Append(",")
	'Dim lstColumnasVisibles As List
	'mlstCamposColumnasVisibles.Initialize
'	Dim lstEncabezadosColumnasVisibles As List
'	lstEncabezadosColumnasVisibles.Initialize
'	Dim lstAliasCampoColumnasVisibles As List
'	lstAliasCampoColumnasVisibles.Initialize


	'NumCamposConControlFiltro=0
	'Dim NumCamposConControlFiltro As Int
	'Dim NumColsTV As Int
	'For Each c As CampoOrigenDatosJamTableCLV
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		'sbCamposDeControlesVisibles.Append(Col.Tag).Append(",")
		If lstCampos.IndexOf(c.Campo)>-1 Then
			mResult.Put("FlagOK",False)
			mResult.Put("msgError","El campo " & c.Campo & " está repetido en el fichero " & NombreFicheroJSON & "." & CRLF & _
				"Avisa al administrador de la aplicación.")
			Exit
		Else
			lstCampos.Add(c.Campo)
		End If
		
		If lstAliasCampos.IndexOf(c.AliasCampo)>-1 Then
			mResult.Put("FlagOK",False)
			mResult.Put("msgError","El alias de campo " & c.AliasCampo & " está repetido en el fichero " & NombreFicheroJSON & "." & CRLF & _
				"Avisa al administrador de la aplicación.")
			Exit
		Else
			lstAliasCampos.Add(c.AliasCampo)
		End If
		
'		If Not(c.CampoCalculado) Then
'			sbCampostblOrigenDatos.append("[").Append(c.Campo).append("]").Append(",")
'		Else
'			sbCampostblOrigenDatos.append("[").Append(c.AliasCampo).append("]").Append(",")
'		End If
		
		sbCampostblOrigenDatos.append("[").Append(c.AliasCampo).append("]").Append(",")
		
		If c.TipoControlFiltro<>"" Then NumCamposConControlFiltro=NumCamposConControlFiltro+1
		If c.KeyID>0 Then
			Dim PKF As CampoPrimaryKeyJamTableCLV
			PKF.Campo=c.Campo
			PKF.AliasCampo=c.AliasCampo
			PKF.OrdenClave=c.KeyID
			mlstCamposPrimaryKey.Add(PKF)
			'mlstCamposPrimaryKey.Add(c.Campo)
		End If
		If c.CampoCalculado=False Then
			'mlstCamposOrigenDatosNoCalculados.Add(c.Campo)
			mlstCamposOrigenDatosNoCalculados.Add(c)
		Else
			Dim FormulaCampoCalculado As String=c.Campo
			'Log("Formula " & FormulaCampoCalculado)
			Dim lstNombresCamposIncluidosEnFormula As List
			lstNombresCamposIncluidosEnFormula.Initialize
			Dim pattern As String
			pattern = "\[(.*?)\]"  ' texto entre brackets
			Dim Matcher1 As Matcher
			Matcher1 = Regex.Matcher(pattern, FormulaCampoCalculado)
			Do While Matcher1.Find
				'Log("Campo incluido en fórmula: " & Matcher1.Match)
				lstNombresCamposIncluidosEnFormula.Add(Matcher1.Match)
			Loop
			For idxCamposFormula=0 To lstNombresCamposIncluidosEnFormula.Size-1
				'Dim NombreCampoBuscado As String=lstNombresCamposIncluidosEnFormula.Get(idxCamposFormula)
				Dim AliasCampoBuscado As String=lstNombresCamposIncluidosEnFormula.Get(idxCamposFormula)
				Dim FlagC As Boolean=False
				For IDxNf=0 To mLstCamposOrigenDatos.Size-1
					Dim cFormula As CampoOrigenDatosJamTableCLV=mLstCamposOrigenDatos.Get(IDxNf)
					'If cFormula.Campo=NombreCampoBuscado.Replace("[","").Replace("]","") Then
					If cFormula.AliasCampo=AliasCampoBuscado.Replace("[","").Replace("]","") Then
						FlagC=True
						Exit
					End If
				Next
				If FlagC=False Then
					'''' error: el campo incluido en la formula no existe en la tblOrigenDatos !
					mResult.Put("FlagOK",False)
					'mResult.Put("msgError","El campo " & NombreCampoBuscado & " incluido en el campo calculado " & c.Campo & " no existe en tblOrigenDatos. Avisa al administrador de la aplicacion")
					mResult.Put("msgError","El ALIASCAMPO " & AliasCampoBuscado & " incluido en el campo calculado " & c.Campo & " no existe en tblOrigenDatos. Avisa al administrador de la aplicacion")
					Exit
				End If
			Next
		End If
	Next

	If mResult.Get("FlagOK")=False Then
		'mBase.MouseCursor=fx.Cursors.DEFAULT
		Return mResult
	End If
	

	lblMostrarEliminarFiltros.Visible=NumCamposConControlFiltro>0
	ImagenLabelFiltros

	
	If mlstCamposPrimaryKey.Size>0 Then
		mlstCamposPrimaryKey.SortType("OrdenClave",True)
	End If
	
	
	sbCampostblOrigenDatos.Remove(sbCampostblOrigenDatos.Length-1,sbCampostblOrigenDatos.Length)
	'Log("sbCampostblOrigenDatos " & sbCampostblOrigenDatos.ToString)
	msCampostblOrigenDatos= sbCampostblOrigenDatos.ToString
	
	If mResult.Get("FlagOK")=False Then
		'mBase.MouseCursor=fx.Cursors.DEFAULT
		Return mResult
	End If
	

	Return mResult
End Sub

private Sub CopyObject(o As Object) As Object
	Dim s As B4XSerializator
	Return s.ConvertBytesToObject(s.ConvertObjectToBytes(o))
End Sub

private Sub CrearTablaSQLite
	' Crear SQLite en memoria
	If mSQL.IsInitialized Then mSQL.Close
	#if B4J
	mSQL.InitializeSQLite("", ":memory:", True)
	#Else If B4A
	mSQL.Initialize("", ":memory:", True)
	#End If

	
	Log("version SQLite: " & mSQL.ExecQuerySingleResult( "SELECT sqlite_version();" ))
	
	' crear tabla
	DBUtils.DropTable(mSQL,"tblOrigenDatos")
	'Dim u As Map
	'u.Initialize
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	
	Dim sbInsertData As StringBuilder
	sbInsertData.Initialize
	
	Dim sbParametros As StringBuilder
	sbParametros.Initialize
	
	sbInsertData.Append("INSERT INTO tblOrigenDatos (")
	
	sbCrearTabla.Append("(IDClaveUnicaRegistrojamTableCLV INTEGER NOT NULL ")
	sbInsertData.Append("[IDClaveUnicaRegistrojamTableCLV],")
	sbParametros.Append("?,")
	'sbCrearTabla.Append("(")
	  
'	Dim omPrimaryKeys As B4XOrderedMap  
'	omPrimaryKeys.Initialize

	'mLstCamposOrigenDatos.SortType("OrdenColumna",True)
	'For i=0 To mLstCamposOrigenDatos.Size-1
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		'Dim c As CampoOrigenDatosJamTableCLV=mLstCamposOrigenDatos.Get(i)
		'u.Put(c.Campo,c.TipoDato)
		''''''''''''''''''''''''If i > 0 Then sbCrearTabla.Append(", ")  ' eliminado al añadir IDClaveUnicaRegistrojamTableCLV
		sbCrearTabla.Append(", ")
		
		' parece que hay un bug en el jdbc driver 3.31.1
		
		' este codigo con el ejemplo de sqlite.org falla ....
'		Dim sbQueryExample As StringBuilder
'		sbQueryExample.Initialize
'		sbQueryExample.append("CREATE TABLE t1(")
'		sbQueryExample.append("a INTEGER PRIMARY KEY,")
'		sbQueryExample.append("b INT,")
'		sbQueryExample.append("c TEXT,")
'		sbQueryExample.append("d INT As (a*Abs(b)),")
'		sbQueryExample.append("e TEXT As (substr(c,b,b+1)) STORED")
'		sbQueryExample.append(")")
'	
'		mSQL.ExecNonQuery(sbQueryExample.ToString)
		

		If c.CampoCalculado=False Then
			'sbCrearTabla.Append(EscapeField(c.Campo)).Append(" ").Append(c.TipoDato)
			If c.EsBooleano Then
				sbCrearTabla.Append(EscapeField(c.AliasCampo)).Append(" INTEGER")
			Else
				sbCrearTabla.Append(EscapeField(c.AliasCampo)).Append(" ").Append(c.TipoDato)
				If c.TipoDato="TEXT" Then sbCrearTabla.Append(" COLLATE NOCASE")
			End If

		Else
			
			sbCrearTabla.Append(EscapeField(c.AliasCampo)).Append(" ").Append(c.TipoDato).Append(" ")
			If c.TipoDato="TEXT" Then sbCrearTabla.Append("COLLATE NOCASE ")
			sbCrearTabla.Append("GENERATED ALWAYS AS (").Append(c.Campo).Append(") ")
		End If
		
		'If c.NoNulo Then
		sbCrearTabla.Append(" NOT NULL")
		'End If
'		If c.ConValorDefecto Then
'			 sbCrearTabla.Append(" DEFAULT " & c.ValorDefecto)
'		End If
		
		
'		If c.CampoCalculado=False Then
'			sbCrearTabla.Append(EscapeField(c.Campo)).Append(" ").Append(c.TipoDato)
'			If c.TipoDato="TEXT" Then sbCrearTabla.Append(" COLLATE NOCASE")
'		Else
'			sbCrearTabla.Append(EscapeField(c.AliasCampo)).Append(" ").Append(c.TipoDato).Append(" ")
'			If c.TipoDato="TEXT" Then sbCrearTabla.Append("COLLATE NOCASE ")
'		End If

'		If c.KeyID>0 Then
'			'sbPrimaryKey.Append(c.Campo).Append(",")
'			omPrimaryKeys.Put(c.Campo,c.KeyID)
'		End If
		sbInsertData.Append(EscapeField(c.AliasCampo)).Append(",")
		sbParametros.Append("?,")
	Next
	
	sbParametros.Remove(sbParametros.Length-1,sbParametros.Length)
	sbInsertData.Remove(sbInsertData.Length-1,sbInsertData.Length)
	sbInsertData.Append(") VALUES (").Append(sbParametros.ToString).Append(")")
	Dim sSQLInsertDatos As String
	sSQLInsertDatos=sbInsertData.ToString
	#if debug
	Log("sSQLInsertDatos " & sSQLInsertDatos)
	#End If
	
	'DBUtils.CreateTable(mSQL,"tblOrigenDatos",u,"")
	'sbCrearTabla.Append(")")
	'Dim query As String = "CREATE TABLE IF NOT EXISTS " & EscapeField("tblOrigenDatos") & " " & sbCrearTabla.ToString
	Dim query As String = "CREATE TABLE IF NOT EXISTS tblOrigenDatos " & sbCrearTabla.ToString
	'If sbPrimaryKey.Length>0 Then
'	If omPrimaryKeys.Size>0 Then
'		omPrimaryKeys.Values.Sort(True)
'		Dim sbPrimaryKey As StringBuilder
'		sbPrimaryKey.Initialize
'		For i=0 To omPrimaryKeys.Size-1
'			If i>0 And i<omPrimaryKeys.Size-1 Then sbPrimaryKey.Append(",")
'			sbPrimaryKey.Append(omPrimaryKeys.Keys.Get(i))
'		Next
'		'sbPrimaryKey.Remove(sbPrimaryKey.Length-1,sbPrimaryKey.Length)
'	End If
	'If sbPrimaryKey.Length>0 Then query=query & ", PRIMARY KEY (" & sbPrimaryKey.ToString & ")"
	'''''''	If mlstCamposPrimaryKey.Size>0 Then
	'''''''		Dim sCamposPrimaryKey As StringBuilder
	'''''''		sCamposPrimaryKey.Initialize
	'''''''		'For i=0 To mlstCamposPrimaryKey.Size-1
	'''''''		For Each pk As CampoPrimaryKeyJamTableCLV In mlstCamposPrimaryKey
	'''''''			'Dim pk As CampoPrimaryKeyJamTableCLV=mlstCamposPrimaryKey.Get(i)
	'''''''			'sCamposPrimaryKey.Append(Pk.Campo).Append(",")
	'''''''			sCamposPrimaryKey.Append(pk.AliasCampo).Append(",")
	'''''''		Next
	'''''''		sCamposPrimaryKey.Remove(sCamposPrimaryKey.Length-1,sCamposPrimaryKey.Length)
	'''''''		query=query & ", PRIMARY KEY (" & sCamposPrimaryKey.ToString & ")"
	'''''''	End If
	query=query & ")"
	'Log("Query " & query)
	Try
		mSQL.ExecNonQuery(query)
	Catch
		LogColor(LastException.Message, xui.Color_Red)
		fx.Msgbox(mParentForm, "Error SQLite en la creación de la tabla tblOrigenDatos :" & CRLF & CRLF & query & CRLF & CRLF & LastException.Message & CRLF & "Avisa al administrador de la aplicación.","Error")
		ExitApplication
	End Try
	#if debug 
	Log("CrearTablaSQLite " & query)
	#End If

End Sub


'Pasa los datos al tableCLV. No configura ni el origen de datos, ni los Items del CLV
'(ek origen de datos se define mediante ConfigurarTableCLV y los Items se crean el modulo CallBack)
' Parámetro DatosRegistros: es 1 objeto que puede ser de tipo lista(items=mapas con los datos de los registros camp/valor),
' o bien de tipo resultset (clave / valor)
'(si se pasa un resultset en lugar de 1 lista sustituir en el ejemplo, lstReg por rsReg, y lstreg.initialize por rsReg.Close
'<code>
'	Dim rSub As ResumableSub=jamTableCLVNombreJamTV.setdata(lstReg)
'	Wait For (rSub) complete (mResultSetData As Map)
'	lstReg.Initialize
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgAviso") Then
'			if true=mResultSetData.Get("ListaVacia") then return
'			Dim msa As Object=Xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=Xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			#if debug
'				Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'				Wait For (msa) Msgbox_Result (rInt As Int)
'				If rInt=xui.DialogResponse_Positive Then
'					jamTableCLVNombreJamTV.AbrirCamposBuilder
'					Return
'				End If
'			#End If
'			ExitApplication
'		End If
'	End If
'</code>
Public Sub SetData(DatosRegistros As Object) As ResumableSub
	
	#if debug
	Log("JamTableCLV Set Data, JSON Origen Datos: " & NombreJSONOrigenDatos)
	#End If
	
	If OrigenDatosConfiguradoOK=False Then
		fx.Msgbox(mParentForm,"Se ha ejecutado el método SetData jamTableCLV antes de haber creado el origen de datos (JSON). Avisa al administrador de la aplicación.","Error")
		ExitApplication
	End If
	
	Dim mResultSetData As Map
	mResultSetData.Initialize
	mResultSetData.Put("FlagOK",True)

	CrearTablaSQLite

	Select True
		Case DatosRegistros Is List
			Dim rSub As ResumableSub=SetRecordsDataList(DatosRegistros)
		Case DatosRegistros Is ResultSet
			Dim rSub As ResumableSub=SetRecordsDataResultset(DatosRegistros)
		Case Else
			'FlagOK=False
			mResultSetData.Put("msgError","Los registros de datos sólo pueden ser de tipo List o Resultset. Avisa al administrador de la aplicación.")
			mResultSetData.Put("FlagOK",False)
'			Dim msa As Object=Xui.MsgboxAsync("Los registros de datos sólo pueden ser de tipo List o Resultset. Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
			Return mResultSetData
	End Select
	Wait For (rSub) complete (mResultSetData As Map)
	'B4XLoadingIndicator.hide
	DatosRegistros=Null
	If Not(mResultSetData.Get("FlagOK")) Then
		'FlagOK=False
		If mResultSetData.Get("msgAviso")="La lista de datos para el Origen Datos con JSON " & NombreJSONOrigenDatos & " está vacía." Then
			'SetPlaceholderText("Tabla sin registros")
			'SetMouseCursor(fx.Cursors.WAIT)
			WAIT FOR (ActualizarTableCLV(True)) COMPLETE (rObj As Object)
			'SetMouseCursor(fx.Cursors.DEFAULT)
		End If
		If mResultSetData.Get("msgError")<>"" Then
			'SetPlaceholderText("Tabla error datos")
			'SetMouseCursor(fx.Cursors.WAIT)
			WAIT FOR (ActualizarTableCLV(True)) COMPLETE (rObj As Object)
			'SetMouseCursor(fx.Cursors.DEFAULT)
		End If
		'SetPlaceholderText("Tabla error datos")
'		Dim msa As Object=Xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'		Wait For (msa) Msgbox_Result
		Return mResultSetData
	Else
		'SetPlaceholderText("Tabla sin registros")
		'SetMouseCursor(fx.Cursors.WAIT)
		WAIT FOR (ActualizarTableCLV(True)) COMPLETE (rObj As Object)
		'SetMouseCursor(fx.Cursors.DEFAULT)
		Return mResultSetData
	End If

End Sub

'lstData: lista de mapas ((Campo1, Valor1),(Campo2, Valor2)), ....
private Sub SetRecordsDataList(lstData As List) As ResumableSub
	

	Dim mResult As Map
	mResult.Initialize
	mResult.Put("msgError","")
	mResult.Put("msgAviso","")
	mResult.Put("FlagOK",True)
	mResult.Put("ListaVacia",False)
	
	If lstData.Size=0 Then
		mResult.Put("FlagOK",False)
		mResult.Put("msgAviso","La lista de datos está vacía.")
		mResult.Put("ListaVacia",True)
		lstData.Initialize
		Return mResult
	End If
	
	'los campos del origen de datos, excepto los NO CALCULADOS, deben estar en la lista de datos.
	' Puede haber campos en el map que NO estén en la lista de campos no calculados, pero no al revés
	' los campos calculados NO deben pasarse en el lstData, es 1 error
	For idxData=0 To lstData.Size-1
	
	
		Dim sbQuery As StringBuilder
		sbQuery.Initialize

		Dim sbParametros As StringBuilder
		sbParametros.Initialize
		
		Dim lstValores As List
		lstValores.Initialize
		
		sbQuery.Append("INSERT INTO tblOrigenDatos (")

		sbQuery.Append("[IDClaveUnicaRegistrojamTableCLV],")
		sbParametros.Append("?,")
		
		lstValores.Add(idxData)   ' clave unica del registro jamTableCLV
	
'		Dim lstCamposData As List
'		lstCamposData.Initialize
	
		Dim lstCamposDataNoEncontrados As List
		lstCamposDataNoEncontrados.Initialize
		
		'Dim mCD As Map=lstData.Get(0)
		Dim mCD As Map=lstData.Get(idxData)
		'For i=0 To mCD.Size-1
		
		
		For Each CoD As CampoOrigenDatosJamTableCLV In mlstCamposOrigenDatosNoCalculados
			If mCD.ContainsKey(CoD.Campo) Then
				sbQuery.Append("[").Append(CoD.AliasCampo).Append("],")
				sbParametros.Append("?,")
				lstValores.Add(mCD.Get(CoD.Campo))
			Else
				lstCamposDataNoEncontrados.Add(CoD.Campo)
			End If
		Next
		
		If lstCamposDataNoEncontrados.Size>0  Then
			#if debug
			LogColor("***registro #" & idxData & " con errores de campos no encontrados",xui.Color_Red)
			LogColor("SQL Insert list of maps: " & sbQuery,xui.Color_Red)
			LogColor("Lista valores insert: " & lstValores,xui.Color_Red)
			#end if
			Dim sbCamposDataNoEncontrados As StringBuilder
			sbCamposDataNoEncontrados.Initialize
			sbCamposDataNoEncontrados.Append("Registro #" & idxData & ", faltan los siguientes campos en el REGISTRO de datos.")
			sbCamposDataNoEncontrados.Append(" con la aplicacion CamposBuilder.").Append(CRLF).Append(CRLF)
			For Each CNoE As String In lstCamposDataNoEncontrados
				sbCamposDataNoEncontrados.Append(CNoE).Append(", ")
			Next
			sbCamposDataNoEncontrados.Remove(sbCamposDataNoEncontrados.Length-2,sbCamposDataNoEncontrados.Length)
			sbCamposDataNoEncontrados.Append(CRLF).Append(CRLF).Append("Revisar JSON ").Append(NombreJSONOrigenDatos).Append(" y el registro indicado.")
			mResult.Put("FlagOK",False)
			'mResult.Put("msgError","El campo de Datos " & CampoData & " no tiene su correspondiente Alias Campo. Revisar JSON " & NombreJSONOrigenDatos & " con la aplicacion CamposBuilder.")
			mResult.Put("msgError",sbCamposDataNoEncontrados.ToString)
			'mResult.Put("Campos no coincidentes",lstCamposNoCoincidentes)
			Exit
		Else
			sbParametros.Remove(sbParametros.Length-1,sbParametros.Length)
			sbQuery.Remove(sbQuery.Length-1,sbQuery.Length)
			sbQuery.Append(") VALUES (").Append(sbParametros.ToString).Append(")")
			mSQL.AddNonQueryToBatch(sbQuery, lstValores)
			#if debug
			Log("SQL Insert list of maps: " & sbQuery)
			Log("Lista valores insert: " & lstValores)
			#End If
		End If
		
	Next
	
	If lstCamposDataNoEncontrados.Size>0 Then
		Return mResult
	End If
	
	lstData.Initialize  'INICIALIZAR LISTA DE REGISTROS PARA LIBERAR MEMORIA
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("mSQL")
	Wait For (SenderFilter) mSQL_NonQueryComplete (Success As Boolean)
	If Not(Success) Then
		mResult.Put("FlagOK",False)
		mResult.Put("msgError","Error SQLite al insertar los registros de la lista de registros." & CRLF & LastException.Message)
		Return mResult
	End If

	' pasar datos a TableCLV
	'NTotalRegistros=lstData.Size
	NTotalRegistros=mSQL.ExecQuerySingleResult("select count(*) from tblOrigenDatos")
	NPrimerRegistroVisible=1

	'SetScrollbarSize(TableCLVJAM,"BOTH",20)  ' los scrollbar son muy estrechos por defecto
	
	'ConfiguracionColumnasUsuario
	
	Return mResult
End Sub

'rsData: Resultset proveniente de 1 query de SQLite. Los campos deben coincidir con los del JSON
private Sub SetRecordsDataResultset(rsData As ResultSet) As ResumableSub
	
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("msgError","")
	mResult.Put("msgAviso","")
	mResult.Put("FlagOK",True)
	mResult.Put("ListaVacia",False)
	
	
'	If rsData.NextRow=False Then   '  ERROR !!!!!  esto hace que el resultset pase al siguiente registro, si existe ... por lo que la tabla NO lo incluye.......
'		mResult.Put("FlagOK",False)
'		mResult.Put("msgAviso","La lista de datos está vacía.")
'		'mResult.Put("msgError","La lista de datos está vacía.")
'		Return mResult
'	End If

	
	'los campos del origen de datos, excepto los NO CALCULADOS, deben estar en las columnas del resultset
	' Puede haber campos en las columnas del resultset que NO estén en la lista de campos no calculados, pero no al revés
	' los campos calculados NO deben pasarse en el lstData, es 1 error

	
	Dim jrs As JavaObject = rsData
	Dim rsmd As JavaObject = jrs.RunMethod("getMetaData", Null)
	
	Dim NumReg As Int
	Do While rsData.NextRow
		
		Dim sbQuery As StringBuilder
		sbQuery.Initialize

		Dim sbParametros As StringBuilder
		sbParametros.Initialize
		
		Dim lstValores As List
		lstValores.Initialize
		
		sbQuery.Append("INSERT INTO tblOrigenDatos (")

		sbQuery.Append("[IDClaveUnicaRegistrojamTableCLV],")
		sbParametros.Append("?,")
		
		lstValores.Add(NumReg)   ' clave unica del registro jamTableCLV
	
		Dim lstCamposDataNoEncontrados As List
		lstCamposDataNoEncontrados.Initialize
		
		Dim mCD As Map
		mCD.Initialize
		
		For idxColumnasRS=0 To rsData.ColumnCount-1
			Dim CampoRS As String=rsData.GetColumnName(idxColumnasRS)
			
			Dim columnType As Int = rsmd.RunMethod("getColumnType", Array(idxColumnasRS + 1))
			If columnType = -2 Or columnType = 2004 Or columnType = -3 Or columnType = -4 Then
				'lstValores.Add(rsData.GetBlob2(idxColumnasRS))
				mCD.Put(CampoRS,rsData.GetBlob2(idxColumnasRS))
			Else if columnType = 2 Or columnType = 3 Then
				'lstValores.Add(rsData.GetDouble2(idxColumnasRS))
				mCD.Put(CampoRS,rsData.GetDouble2(idxColumnasRS))
			Else
				'lstValores.Add(jrs.RunMethod("getObject", Array(idxColumnasRS + 1)))
				mCD.Put(CampoRS,jrs.RunMethod("getObject", Array(idxColumnasRS + 1)))
			End If
		Next
		
		
		For Each CoD As CampoOrigenDatosJamTableCLV In mlstCamposOrigenDatosNoCalculados
			If mCD.ContainsKey(CoD.Campo) Then
				sbQuery.Append("[").Append(CoD.AliasCampo).Append("],")
				sbParametros.Append("?,")
				lstValores.Add(mCD.Get(CoD.Campo))
			Else
				lstCamposDataNoEncontrados.Add(CoD.Campo)
			End If
		Next
		
		If lstCamposDataNoEncontrados.Size>0  Then
			Dim sbCamposDataNoEncontrados As StringBuilder
			sbCamposDataNoEncontrados.Initialize
			sbCamposDataNoEncontrados.Append("Registro #" & NumReg & ", faltan los siguientes campos en el REGISTRO de datos.")
			sbCamposDataNoEncontrados.Append(" con la aplicacion CamposBuilder.").Append(CRLF).Append(CRLF)
			For Each CNoE As String In lstCamposDataNoEncontrados
				sbCamposDataNoEncontrados.Append(CNoE).Append(", ")
			Next
			sbCamposDataNoEncontrados.Remove(sbCamposDataNoEncontrados.Length-2,sbCamposDataNoEncontrados.Length)
			sbCamposDataNoEncontrados.Append(CRLF).Append(CRLF).Append("Revisar JSON ").Append(NombreJSONOrigenDatos).Append(" y el registro indicado.")
			mResult.Put("FlagOK",False)
			'mResult.Put("msgError","El campo de Datos " & CampoData & " no tiene su correspondiente Alias Campo. Revisar JSON " & NombreJSONOrigenDatos & " con la aplicacion CamposBuilder.")
			mResult.Put("msgError",sbCamposDataNoEncontrados.ToString)
			'mResult.Put("Campos no coincidentes",lstCamposNoCoincidentes)
			Exit
		Else
			sbParametros.Remove(sbParametros.Length-1,sbParametros.Length)
			sbQuery.Remove(sbQuery.Length-1,sbQuery.Length)
			sbQuery.Append(") VALUES (").Append(sbParametros.ToString).Append(")")
			mSQL.AddNonQueryToBatch(sbQuery, lstValores)
'			#if debug
'			Log("SQL Insert list of maps: " & sbQuery)
'			Log("Lista valores insert: " & lstValores)
'			#End If
		End If
		NumReg=NumReg+1
	Loop
	rsData.Close
	
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("mSQL")
	Wait For (SenderFilter) mSQL_NonQueryComplete (Success As Boolean)
	If Not(Success) Then
		mResult.Put("FlagOK",False)
		mResult.Put("msgError","Error SQLite al insertar los registros del resultset." & CRLF & LastException.Message)
		Return mResult
	End If
	
	If NumReg=0 Then
		mResult.Put("FlagOK",False)
		mResult.Put("msgAviso","La lista de datos está vacía.")
		mResult.Put("ListaVacia",True)
		'mResult.Put("msgError","La lista de datos está vacía.")
		Return mResult
	End If

	' pasar datos a TableCLV
	'NTotalRegistros=lstData.Size
	NTotalRegistros=mSQL.ExecQuerySingleResult("select count(*) from tblOrigenDatos")
	'Log("NTotalRegistros SetDataInicial: " & NTotalRegistros)
	NPrimerRegistroVisible=1

	'SetScrollbarSize(TableCLVJAM,"BOTH",20)  ' los scrollbar son muy estrechos por defecto
	
	'ConfiguracionColumnasUsuario
	
	Return mResult
End Sub


private Sub ActualizarTableCLV(ScrollTo0 As Boolean) As ResumableSub
	DeshabilitarTableCLV
	clvDatos.Clear
	
	Dim DatetimeFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yy"
	

	Dim T1 As Long=DateTime.Now

	mlstIndicesFilasVisibles.Initialize

	' AJUSTAR TAMAÑO TableCLV EN FUNCION DEL ALTOCELDAS
	
'''	mNMaxRegistrosVisibles=Floor((Min(TableCLVJAM.Height, TableCLVJAM.PrefHeight)-22-22)/mAltoCeldas)  '21 por el Header + 20 por el scrollbar
''''	Log("mNMaxRegistrosVisibles " & mNMaxRegistrosVisibles)
'''	
'''	NUltimoRegistroVisible=NPrimerRegistroVisible+Min(NTotalRegistros, mNMaxRegistrosVisibles)-1
	
	
	Dim sOrdenSQL As String
	If lstOrdenSQL.Size>0 Then
		lstOrdenSQL.SortType("IndiceOrdenSQL",True)
		Dim sbOrdenSQL As StringBuilder
		sbOrdenSQL.Initialize
		sbOrdenSQL.append(" ORDER BY ")
		For idXOrdenSQL=0 To lstOrdenSQL.Size-1
			Dim dOl As DatosOrdenSQLJamTableCLV=lstOrdenSQL.Get(idXOrdenSQL)
			Dim sTipoOrden As String
			If dOl.TipoOrdenSQL="Ascendente" Then
				sTipoOrden="ASC"
			Else
				sTipoOrden="DESC"
			End If
			'sbOrdenSQL.Append(dOl.CampoOrdenSQL).Append(" ").Append(sTipoOrden).Append(",")
			sbOrdenSQL.Append(dOl.AliasCampoOrdenSQL).Append(" ").Append(sTipoOrden).Append(",")
		Next
		sbOrdenSQL=sbOrdenSQL.Remove(sbOrdenSQL.Length-1,sbOrdenSQL.Length)
		sOrdenSQL=sbOrdenSQL.ToString
	End If
	
	' Paginacion
	Dim rsRegistrosFiltradosVisibles As ResultSet
	'Dim sSQL As String
	Dim sbDatos As StringBuilder
	sbDatos.Initialize
	If lstValoresFiltros.Size>0 Then
		' solo visibles los registros que cumplan el filtro

		NTotalRegistrosFiltrados=mSQL.ExecQuerySingleResult2("select count(*) from tblOrigenDatos where " & sCamposFiltrados,lstValoresFiltros)
				#if debug
		Log("sCamposFiltrados " & sCamposFiltrados)
		Log("NTotalRegistrosFiltrados " & NTotalRegistrosFiltrados)
		#End If
		If NUltimoRegistroVisible>NTotalRegistrosFiltrados Then NUltimoRegistroVisible=NTotalRegistrosFiltrados

		If sOrdenSQL<>"" Then
			sbDatos.Append("select ").append(msCampostblOrigenDatos).append(" from tblOrigenDatos where ").Append(sCamposFiltrados).Append(sOrdenSQL)' & " limit " & mNMaxRegistrosVisibles & " OFFSET " & (NPrimerRegistroVisible-1)
		Else
			sbDatos.Append("select ").Append(msCampostblOrigenDatos).Append(" from tblOrigenDatos where ").Append(sCamposFiltrados) '& " limit " & mNMaxRegistrosVisibles & " OFFSET " & (NPrimerRegistroVisible-1)
		End If
		
'		If mPaginacion Then
'			sbDatos.Append(" limit ").Append(mNMaxRegistrosVisibles).Append(" OFFSET ").Append(NPrimerRegistroVisible-1)
'		End If

		Try
		#if debug
			Log("****** FILTRO ************")
			Log(sbDatos.ToString)
			Log(lstValoresFiltros)
			Log("******************")
		#End If
			rsRegistrosFiltradosVisibles=mSQL.ExecQuery2(sbDatos.ToString ,lstValoresFiltros)
		Catch
			LogColor(LastException.Message, xui.Color_Red)
			fx.Msgbox(mParentForm, "Error SQLite " & LastException.Message & CRLF & CRLF & sbDatos.ToString & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			ExitApplication
		End Try
	Else
		NTotalRegistrosFiltrados=NTotalRegistros
		If NUltimoRegistroVisible>NTotalRegistrosFiltrados Then NUltimoRegistroVisible=NTotalRegistrosFiltrados
		If sOrdenSQL<>"" Then
			sbDatos.Append("select ").Append(msCampostblOrigenDatos).Append(" from tblOrigenDatos ").Append(sOrdenSQL) ' & " LIMIT " & mNMaxRegistrosVisibles   & " OFFSET " & (NPrimerRegistroVisible-1)
		Else
			sbDatos.Append("select ").Append(msCampostblOrigenDatos).Append(" from tblOrigenDatos") ' LIMIT " & mNMaxRegistrosVisibles   & " OFFSET " & (NPrimerRegistroVisible-1)
		End If
		
'		If mPaginacion Then
'			sbDatos.Append(" limit ").Append(mNMaxRegistrosVisibles).Append(" OFFSET ").Append(NPrimerRegistroVisible-1)
'		End If
		
		Try
			#if debug
			Log("******SIN FILTRO ************")
			Log(sbDatos.ToString)
			Log("******************")
		#End If
			rsRegistrosFiltradosVisibles=mSQL.ExecQuery(sbDatos.ToString)
		Catch
			LogColor(LastException.Message, xui.Color_Red)
			fx.Msgbox(mParentForm, "Error SQLite " & LastException.Message & CRLF & CRLF & sbDatos.ToString & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			ExitApplication
		End Try
	End If
	
'	If mPaginacion Then
'		Dim NumTotalPaginas, NumPaginaActual As Int
'		NumTotalPaginas=Ceil(NTotalRegistrosFiltrados/mNMaxRegistrosVisibles)
'		NumPaginaActual=Floor(NPrimerRegistroVisible/mNMaxRegistrosVisibles)+1
'		lblPageRecords.Text=NumPaginaActual & " / " & NumTotalPaginas
'	End If

'	Dim lstFilasMapTV As List
'	lstFilasMapTV.Initialize
	
	'mLstCamposOrigenDatos.SortType("OrdenColumna",True)
	
	Dim tiRS As Long=DateTime.Now
	
'	Dim lstCamposOrigenDatosColumnas As List
'	lstCamposOrigenDatosColumnas.Initialize
'	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
'		'If Not(c.ColumnaTableCLV) Then Continue
'		lstCamposOrigenDatosColumnas.Add(c)
'	Next
	
	Dim Interv As Double=Round2(100/NTotalRegistrosFiltrados,2)
	Dim ValAcum As Double
	jamCircularProgressBarCLV.Visible=True
	Do While rsRegistrosFiltradosVisibles.NextRow

		Dim mRegistro As Map
		mRegistro.Initialize
		
		'For Each c As CampoOrigenDatosJamTableCLV In lstCamposOrigenDatosColumnas
		For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
			Dim sTipoDato As String=c.TipoDato
			Select sTipoDato
				Case "INTEGER"
					mRegistro.Put(c.AliasCampo,rsRegistrosFiltradosVisibles.GetInt(c.AliasCampo))
				Case "REAL"
					If c.EsFecha Then
						mRegistro.Put(c.AliasCampo,rsRegistrosFiltradosVisibles.GetLong(c.AliasCampo))
					Else
						mRegistro.Put(c.AliasCampo,rsRegistrosFiltradosVisibles.GetDouble(c.AliasCampo))
					End If
				Case "TEXT"

					mRegistro.Put(c.AliasCampo,rsRegistrosFiltradosVisibles.GetString(c.AliasCampo))
				Case Else
					mRegistro.Put(c.AliasCampo,rsRegistrosFiltradosVisibles.GetString(c.AliasCampo))
			End Select
		Next
		'''lstFilasMapTV.Add(mRegistro)

		Dim idxClaveUnica As Int=rsRegistrosFiltradosVisibles.getint("IDClaveUnicaRegistrojamTableCLV")
		mlstIndicesFilasVisibles.Add(idxClaveUnica)
		
		'Dim pnl As B4XView=CopyObject(pnlItemsCLVDatos)
		'CallSub3(mCallBack, mEventName &  "_CrearItemJamTableCLV",mRegistro, pnl)
		
		'CallSub2(mCallBack, mEventName &  "_CrearItemJamTableCLV",mRegistro)
		
		Dim pnl As B4XView = xui.CreatePanel(Null)
		pnl.SetLayoutAnimated(0, 0, 0, clvDatos.AsView.Width, 200dip)
		clvDatos.Add(pnl,mRegistro)
		
		ValAcum=ValAcum+Interv
		jamCircularProgressBarCLV.Value=ValAcum
		Sleep(0)
	Loop
	jamCircularProgressBarCLV.Visible=False
	jamCircularProgressBarCLV.Value=0
	rsRegistrosFiltradosVisibles.Close
	
	Log($"Fin Actualizacion Recordset. Tiempo Ejecución ${DateTime.Now - tiRS}ms"$)

	'asJO(TableCLVJAM).RunMethodJO("getItems",Null).RunMethod("setAll",Array(lstFilasMapTV))  ' setAll  BORRA los items anteriores y AÑADE los actuales
	
	

	If NTotalRegistrosFiltrados>0 Then
'		If mPaginacion Then
'			lblRecords.Text="Registros: " & NumberFormat2(NTotalRegistros,1,0,0,True) & "  Filtrados: " & NumberFormat2(NTotalRegistrosFiltrados,1,0,0,True) & "  Visibles del " & NumberFormat2(NPrimerRegistroVisible,1,0,0,True) & " al " & NumberFormat2(NUltimoRegistroVisible,1,0,0,True)
'		Else
			lblRecords.Text="Registros: " & NumberFormat2(NTotalRegistros,1,0,0,True) & "  Filtrados: " & NumberFormat2(NTotalRegistrosFiltrados,1,0,0,True)
'		End If
		
		'SetPlaceholderText("")
	Else
		lblRecords.Text="Registros: " & NumberFormat2(NTotalRegistros,1,0,0,True) & "  Filtrados: " & NumberFormat2(NTotalRegistrosFiltrados,1,0,0,True)
		'SetPlaceholderText("Tabla sin registros")
	End If

	DateTime.DateFormat=DatetimeFormatAnt
	
	If ScrollTo0 And clvDatos.Size>0 Then clvDatos.JumpToItem(0)
	
	Log($"Fin Actualizar tv. Tiempo Ejecución ${DateTime.Now - T1}ms"$)
	HabilitarTableCLV
	Return Null
End Sub

Sub clvDatos_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	CallSub3(mCallBack, mEventName &  "_VisibleRangeChanged", FirstIndex, LastIndex)
End Sub


'Devuelve un resultset con los registros del JamTableCLV
' Tiene en cuenta:
'	- Fitro actual de los registros
'	- Orden Actual de los registros
'	- Si hay paginación, considerará TODAS las páginas
'	- Columnas Visibles y su orden
'		IMPORTANTE:
'		1) El ResultSet debe obtenerse DESPUES de actualizar el TableCLV
'		2) CERRAR el resultset después de emplearlo
Public Sub GetTableCLVResultSet As ResultSet
	
	Dim sbCamposColumnasVisibles As StringBuilder
	sbCamposColumnasVisibles.Initialize
	
	Dim lstCamposOrigenDatosColumnas As List
	lstCamposOrigenDatosColumnas.Initialize
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		If Not(c.ColumnaTableCLV) Then Continue
		lstCamposOrigenDatosColumnas.Add(c)
		sbCamposColumnasVisibles.append("[").Append(c.AliasCampo).append("]").Append(",")
	Next
	sbCamposColumnasVisibles.Remove(sbCamposColumnasVisibles.Length-1,sbCamposColumnasVisibles.Length)
	
	Dim sOrdenSQL As String
	If lstOrdenSQL.Size>0 Then
		lstOrdenSQL.SortType("IndiceOrdenSQL",True)
		Dim sbOrdenSQL As StringBuilder
		sbOrdenSQL.Initialize
		sbOrdenSQL.append(" ORDER BY ")
		For idXOrdenSQL=0 To lstOrdenSQL.Size-1
			Dim dOl As DatosOrdenSQLJamTableCLV=lstOrdenSQL.Get(idXOrdenSQL)
			Dim sTipoOrden As String
			If dOl.TipoOrdenSQL="Ascendente" Then
				sTipoOrden="ASC"
			Else
				sTipoOrden="DESC"
			End If
			sbOrdenSQL.Append(dOl.AliasCampoOrdenSQL).Append(" ").Append(sTipoOrden).Append(",")
		Next
		sbOrdenSQL=sbOrdenSQL.Remove(sbOrdenSQL.Length-1,sbOrdenSQL.Length)
		sOrdenSQL=sbOrdenSQL.ToString
	End If
	

	Dim rsRegistrosFiltradosVisibles As ResultSet

	Dim sbDatos As StringBuilder
	sbDatos.Initialize
	If lstValoresFiltros.Size>0 Then

		NTotalRegistrosFiltrados=mSQL.ExecQuerySingleResult2("select count(*) from tblOrigenDatos where " & sCamposFiltrados,lstValoresFiltros)
				#if debug
		Log("sCamposFiltrados " & sCamposFiltrados)
		Log("NTotalRegistrosFiltrados " & NTotalRegistrosFiltrados)
		#End If
		If NUltimoRegistroVisible>NTotalRegistrosFiltrados Then NUltimoRegistroVisible=NTotalRegistrosFiltrados
		

		If sOrdenSQL<>"" Then
			sbDatos.Append("select ").append(sbCamposColumnasVisibles.ToString).append(" from tblOrigenDatos where ").Append(sCamposFiltrados).Append(sOrdenSQL)' & " limit " & mNMaxRegistrosVisibles & " OFFSET " & (NPrimerRegistroVisible-1)
		Else
			sbDatos.Append("select ").Append(sbCamposColumnasVisibles.ToString).Append(" from tblOrigenDatos where ").Append(sCamposFiltrados) '& " limit " & mNMaxRegistrosVisibles & " OFFSET " & (NPrimerRegistroVisible-1)
		End If
		
		Try
		#if debug
			Log("****** FILTRO ************")
			Log(sbDatos.ToString)
			Log(lstValoresFiltros)
			Log("******************")
		#End If
			rsRegistrosFiltradosVisibles=mSQL.ExecQuery2(sbDatos.ToString ,lstValoresFiltros)
		Catch
			LogColor(LastException.Message, xui.Color_Red)
			fx.Msgbox(mParentForm, "Error SQLite " & LastException.Message & CRLF & CRLF & sbDatos.ToString & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			ExitApplication
		End Try

	Else
		NTotalRegistrosFiltrados=NTotalRegistros
		If NUltimoRegistroVisible>NTotalRegistrosFiltrados Then NUltimoRegistroVisible=NTotalRegistrosFiltrados
		If sOrdenSQL<>"" Then
			sbDatos.Append("select ").Append(sbCamposColumnasVisibles.ToString).Append(" from tblOrigenDatos ").Append(sOrdenSQL) ' & " LIMIT " & mNMaxRegistrosVisibles   & " OFFSET " & (NPrimerRegistroVisible-1)
		Else
			sbDatos.Append("select ").Append(sbCamposColumnasVisibles.ToString).Append(" from tblOrigenDatos") ' LIMIT " & mNMaxRegistrosVisibles   & " OFFSET " & (NPrimerRegistroVisible-1)
		End If
		
		''''		If mPaginacion Then
		''''			sbDatos.Append(" limit ").Append(mNMaxRegistrosVisibles).Append(" OFFSET ").Append(NPrimerRegistroVisible-1)
		''''		End If
		''''		'	Log("sSQL TableCLV" & sSQL)
		
		Try
			#if debug
			Log("******SIN FILTRO ************")
			Log(sbDatos.ToString)
			Log("******************")
		#End If
			rsRegistrosFiltradosVisibles=mSQL.ExecQuery(sbDatos.ToString)
		Catch
			LogColor(LastException.Message, xui.Color_Red)
			fx.Msgbox(mParentForm, "Error SQLite " & LastException.Message & CRLF & CRLF & sbDatos.ToString & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			ExitApplication
		End Try
	End If
	Return rsRegistrosFiltradosVisibles
End Sub




' fx.Cursors.WAIT o fx.Cursors.DEFAULT
' Usarlo cuando el formulario base esté recuperando datos, etc.
' Ejemplo:
'<code>
'jamTableCLV1.SetMouseCursor(fx.Cursors.WAIT)
'</code>
Sub SetMouseCursor(MouseCursor As Object)
	'asJO(TableCLVJAM).runmethod("setCursor",Array(MouseCursor))
	Dim pmBase As Pane=mBase
	pmBase.MouseCursor=MouseCursor
	mParentForm.RootPane.MouseCursor=MouseCursor
End Sub

Sub SetMouseCursorWaitDeshabilitarTableCLV
	Dim pmBase As Pane=mBase
	pmBase.MouseCursor=fx.Cursors.WAIT
	mParentForm.RootPane.MouseCursor=fx.Cursors.WAIT
	If lstNodosHabilitados.IsInitialized=False Then lstNodosHabilitados.Initialize

	For Each n As Node In pnlMainJamTableCLV
		If n.Enabled Then lstNodosHabilitados.Add(n)
		n.Enabled=False
	Next
End Sub

Sub SetMouseCursorDefaultHabilitarTableCLV
	Dim pmBase As Pane=mBase
	pmBase.MouseCursor=fx.Cursors.DEFAULT
	mParentForm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	If lstNodosHabilitados.IsInitialized=False Then lstNodosHabilitados.Initialize

	For Each n As Node In lstNodosHabilitados
		n.Enabled=True
	Next
	lstNodosHabilitados.Initialize
End Sub

Sub HabilitarTableCLV
	If lstNodosHabilitados.IsInitialized=False Then lstNodosHabilitados.Initialize

	For Each n As Node In lstNodosHabilitados
		n.Enabled=True
	Next
	lstNodosHabilitados.Initialize
End Sub

Sub DeshabilitarTableCLV
	If lstNodosHabilitados.IsInitialized=False Then lstNodosHabilitados.Initialize

	For Each n As Node In pnlMainJamTableCLV
		If n.Enabled And Not(n Is jamCircularProgressBar) Then lstNodosHabilitados.Add(n)
		n.Enabled=False
	Next
End Sub

Sub AbrirCamposBuilder
	If NombreJSONOrigenDatos<>"" Then
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("La tabla ya tiene un fichero JSON de configuración (").Append(NombreJSONOrigenDatos).Append(")").Append(CRLF).Append(CRLF)
		sb.Append("¿Editar este fichero o crear uno nuevo?")
					
		Dim msa As Object = xui.Msgbox2Async(sb.tostring, "Confirma", "Editar", "Cancelar", "Nuevo",Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		Select True
			Case rInt=xui.DialogResponse_Positive
				'"../files/"   es la forma válida de referenciar File.DirAssets en B4J
				'si indicamos File.DirAssets para obtener la ruta de la carpeta DirAssets, devuelve "AssetsDir" ...
				Dim clvBuilder As jamTableCLVCamposBuilder
				clvBuilder.Initialize
				clvBuilder.Show("../files/" & NombreJSONOrigenDatos)
								
			Case rInt=xui.DialogResponse_Negative
				Dim clvBuilder As jamTableCLVCamposBuilder
				clvBuilder.Initialize
				clvBuilder.Show("")
								
			Case rInt=xui.DialogResponse_Cancel
				Return
		End Select
		
	Else
		Dim clvBuilder As jamTableCLVCamposBuilder
		clvBuilder.Initialize
		clvBuilder.Show("")
	End If
End Sub

private Sub AbrirCamposBuilderEdicion
	Dim clvBuilder As jamTableCLVCamposBuilder
	clvBuilder.Initialize
	clvBuilder.Show("../files/" & NombreJSONOrigenDatos)
End Sub

Private Sub clvDatos_ItemClick (Index As Int, Value As Object)
	If SubExists(mCallBack,mEventName & "_ItemClick") Then
		CallSubDelayed3(mCallBack, mEventName & "_ItemClick", Index, Value)
	End If
End Sub


Private Sub clvDatos_ItemLongClick (Index As Int, Value As Object)
	If SubExists(mCallBack,mEventName & "_ItemLongClick") Then
		CallSubDelayed3(mCallBack, mEventName & "_ItemLongClick", Index, Value)
	End If
End Sub

Private Sub clvDatos_ReachEnd
	If SubExists(mCallBack,mEventName & "_ReachEnd") Then
		CallSubDelayed(mCallBack, mEventName & "_ReachEnd")
	End If
End Sub

'Private Sub clvDatos_ScrollChanged (Offset As Int)
'	
'End Sub

public Sub getSize As Int
	Return clvDatos.Size
End Sub

public Sub getWidth As Int
	Return clvDatos.AsView.Width
End Sub

public Sub Add(pnl As B4XView, Value As Object)
	clvDatos.Add(pnl,Value)
End Sub

public Sub Clear
	clvDatos.Clear
End Sub

public Sub GetPanel(Index As Int) As B4XView
	Return clvDatos.GetPanel(Index)
End Sub

public Sub GetValue(Index As Int) As Object
	Return clvDatos.GetValue(Index)
End Sub

public Sub GetItemFromView(v As B4XView) As Int
	Return clvDatos.GetItemFromView(v)
End Sub

public Sub setEnabled(Enabled As Boolean)
	mBase.Enabled=Enabled
End Sub

Sub TotalesCamposNumericos As ResumableSub
	

	
	Dim lstFunciones As List=Array As String("SUM","AVG","MAX","MIN")
	Dim lstTextosTotales As List
	lstTextosTotales.Initialize

	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		If c.ColumnaVisible=False Then Continue
		If c.TipoDato="INTEGER" Or c.Tipodato="REAL" And Not(c.EsFecha) Then
			
			
			Dim sbTotales As StringBuilder
			sbTotales.Initialize
			
			sbTotales.Append(c.EncabezadoColumna.ToUpperCase).append("  ")
			
			For Each sFuncionTotal As String In lstFunciones

				Dim ValorCampoColumna As Object=mSQL.ExecQuerySingleResult("select " & sFuncionTotal & "(" & c.AliasCampo & ") from tblOrigenDatos")
'				If lstValoresFiltros.Size>0 Then
'					Dim ValorCampoColumnaFiltrada As Object=mSQL.ExecQuerySingleResult2("select " & sFuncionTotal & "(" & c.AliasCampo & ") from tblOrigenDatos where " & sCamposFiltrados,lstValoresFiltros)
'				End If
				Dim sTituloFuncion As String
				Select sFuncionTotal.ToUpperCase
					Case "SUM"
						sTituloFuncion="Suma"
					Case "AVG"
						sTituloFuncion="Promedio"
					Case "MAX"
						sTituloFuncion="Máximo"
					Case "MIN"
						sTituloFuncion="Mínimo"
				End Select

				Select c.TipoDato
					Case "INTEGER"
						Dim ValorCampoColumnaInt As Int=ValorCampoColumna
						Dim sValorCampoColumnaInt As String=NumberFormat2(ValorCampoColumnaInt,1,0,0,True).Replace(",",".")
						'sbTotales.Append("Total ").Append(sTituloFuncion).Append(" ").Append(c.AliasCampo).Append(":  ").Append(sValorCampoColumnaInt)
						sbTotales.Append(sTituloFuncion).Append(":  ").Append(sValorCampoColumnaInt).append("  ")
'						If lstValoresFiltros.Size>0 Then
'							Dim ValorCampoColumnaFiltradaInt As Int=ValorCampoColumnaFiltrada
'							Dim sValorCampoColumnaFiltradaInt As String=NumberFormat2(ValorCampoColumnaFiltradaInt,1,0,0,True).Replace(",",".")
'							'sbTotales.Append(CRLF).Append(CRLF).Append("Total ").Append(sTituloFuncion).Append(" ").Append(c.AliasCampo).Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaInt)
'							sbTotales.apennd(CRLF).Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaInt).Append(TAB)
'						End If
				
					Case "REAL"
						Dim ValorCampoColumnaDouble As Double=ValorCampoColumna
						Dim sValorCampoColumnaDouble As String=NumberFormat2(ValorCampoColumnaDouble,1,2,0,True)
						'sbTotales.Append("Total ").Append(sTituloFuncion).Append(" ").Append(c.AliasCampo).Append(":  ").Append(sValorCampoColumnaDouble)
						sbTotales.Append(sTituloFuncion).Append(":  ").Append(sValorCampoColumnaDouble).append("  ")
'						If lstValoresFiltros.Size>0 Then
'							Dim ValorCampoColumnaFiltradaDouble As Double=ValorCampoColumnaFiltrada
'							Dim sValorCampoColumnaFiltradaDouble As String=NumberFormat2(ValorCampoColumnaFiltradaDouble,1,2,0,True)
'							'sbTotales.Append(CRLF).Append(CRLF).Append("Total ").Append(sTituloFuncion).Append(" ").Append(c.AliasCampo).Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaDouble)
'							sbTotales.Append(CRLF).Append(CRLF).Append(sTituloFuncion).Append(" ").Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaDouble).Append(TAB)
'						End If
				
				End Select
			Next
			'Dim sTotalesCampo As String=sbTotales.ToString
			
			If lstValoresFiltros.Size>0 Then
				sbTotales.Append(CRLF).Append(" Registros Filtrados:  ").Append(CRLF)
				For Each sFuncionTotal As String In lstFunciones


					Dim ValorCampoColumnaFiltrada As Object=mSQL.ExecQuerySingleResult2("select " & sFuncionTotal & "(" & c.AliasCampo & ") from tblOrigenDatos where " & sCamposFiltrados,lstValoresFiltros)

					Dim sTituloFuncion As String
					Select sFuncionTotal.ToUpperCase
						Case "SUM"
							sTituloFuncion="Suma"
						Case "AVG"
							sTituloFuncion="Promedio"
						Case "MAX"
							sTituloFuncion="Máximo"
						Case "MIN"
							sTituloFuncion="Mínimo"
					End Select

					Select c.TipoDato
						Case "INTEGER"


							Dim ValorCampoColumnaFiltradaInt As Int=ValorCampoColumnaFiltrada
							Dim sValorCampoColumnaFiltradaInt As String=NumberFormat2(ValorCampoColumnaFiltradaInt,1,0,0,True).Replace(",",".")
							'sbTotales.Append(CRLF).Append(CRLF).Append("Total ").Append(sTituloFuncion).Append(" ").Append(c.AliasCampo).Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaInt)
							sbTotales.Append(sTituloFuncion).Append(":  ").Append(sValorCampoColumnaFiltradaInt).append("  ")

				
						Case "REAL"

							Dim ValorCampoColumnaFiltradaDouble As Double=ValorCampoColumnaFiltrada
							Dim sValorCampoColumnaFiltradaDouble As String=NumberFormat2(ValorCampoColumnaFiltradaDouble,1,2,0,True)
							'sbTotales.Append(CRLF).Append(CRLF).Append("Total ").Append(sTituloFuncion).Append(" ").Append(c.AliasCampo).Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaDouble)
							'sbTotales.Append(CRLF).Append(CRLF).Append(sTituloFuncion).Append(" ").Append(" Registros Filtrados:  ").Append(sValorCampoColumnaFiltradaDouble).Append(TAB)
							sbTotales.Append(sTituloFuncion).Append(":  ").Append(sValorCampoColumnaFiltradaDouble).append("  ")
				
					End Select
				Next
			End If
			lstTextosTotales.Add(sbTotales)
			
		End If
		'sbTotales.Append(CRLF)

	Next
	
	'fx.Msgbox(mParentForm,sbTotales.ToString,"Información Totales")
	
	If lstTextosTotales.Size=0 Then Return True
	
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, 800dip, (0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	p.LoadLayout("scrCLVCustomDialogJamTableCLV")
	Dialog.Title="Totales Campos Numéricos"
	'Dialog.PutAtTop = True 'put the dialog at the top of the screen
	CLVCustomDialogJamTableCLV.DesignerLabel.Alignment="CENTER_LEFT"
	CLVCustomDialogJamTableCLV.Clear
	CLVCustomDialogJamTableCLV.DefaultTextBackgroundColor=0xFFDCDCDC
	
	For Each sbT As StringBuilder In lstTextosTotales
		CLVCustomDialogJamTableCLV.AddTextItem(sbT.ToString,0)
	Next
	Dim rSub As ResumableSub=Dialog.ShowCustom(p, "OK", "", "")
	Wait For (rSub) Complete (Result As Int)
	
	Return True
End Sub




Private Sub EscapeField(f As String) As String
	Return "[" & f & "]"
End Sub


'''''Private Sub cb_MousePressed (EventData As MouseEvent) 
'''''	Dim cb As ChoiceBox=Sender      
'''''	Dim JO As JavaObject = Sender
'''''	If JO.RunMethod("isShowing",Null) = False Then                'Only populate new data if the Choicebox is opening
'''''		cb.Items.Clear                                'Clear existing entries
'''''		For Each Item As String In lstComparadoresBooleanos
'''''			cb.Items.Add(Item)
'''''		Next
'''''	End If
'''''
'''''End Sub

private Sub lblSalirJamTableCLV_MouseClicked (EventData As MouseEvent)
	If SubExists(mCallBack,mEventName & "_AccionSalirJamTableCLV") Then
		CallSub(mCallBack,mEventName & "_AccionSalirJamTableCLV")
	Else
		fx.Msgbox(mParentForm,"Falta programación evento _AccionSalirJamTableCLV. Avisa al administrador de la aplicación." ,"Aviso")
	End If
End Sub

Private Sub HexToColor(Hex As String) As Int
	Dim bc As ByteConverter
	If Hex.StartsWith("#") Then
		Hex = Hex.SubString(1)
	Else If Hex.StartsWith("0x") Then
		Hex = Hex.SubString(2)
	End If
	If Hex.Length=6 Then Hex="FF" & Hex
	Dim ints() As Int = bc.IntsFromBytes(bc.HexToBytes(Hex))
	Return ints(0)
End Sub



public Sub FixNull(sObj As Object) As String
	Dim sValue As String
	If sObj = Null Then
		sValue = ""
	Else
		sValue = CStr(sObj)
	End If
	sValue = sValue.Replace("NULL","").Replace("null","")
	Return sValue
End Sub

public Sub FixNullDouble(sObj As Object) As Double
	Dim dValue As Double
	If sObj = Null Then
		dValue = 0
	Else
		dValue = CDbl(sObj)
	End If
	Return dValue
End Sub

public Sub FixNullFloat(sObj As Object) As Float
	Dim fValue As Float
	If sObj = Null Then
		fValue = 0
	Else
		fValue = CFlt(sObj)
	End If
	Return fValue
End Sub

public Sub FixNullLong(sObj As Object) As Double
	Dim dValue As Long
	If sObj = Null Then
		dValue = 0
	Else
		dValue = CLng(sObj)
	End If
	Return dValue
End Sub

public Sub FixNullInt(sObj As Object) As Int
	Dim dValue As Int
	If sObj = Null Then
		dValue = 0
	Else
		dValue = CInt(sObj)
	End If
	Return dValue
End Sub



public Sub CStr(o As Object) As String
	Return "" & o
End Sub

'convert string to long
public Sub CLng(o As Object) As Long
	Try
		Dim ox As String = o
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return Floor(ox)
	Catch
		Return 0
	End Try
End Sub

'convert string to double
public Sub CDbl(o As Object) As Double
	Try
		Dim ox As String = o
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return ox
	Catch
		Return 0
	End Try
End Sub

'convert string to float
public Sub CFlt(o As Object) As Float
	Try
		Dim ox As String = o
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return ox
	Catch
		Return 0
	End Try
End Sub

'convert string to int
public Sub CInt(o As Object) As Int
	Try
		Dim ox As String = o
		ox = GetNumbers(ox)
		If ox = "" Then ox = "0"
		Return Floor(ox)
	Catch
		Return 0
	End Try
End Sub

'return numeric values from a string
public Sub GetNumbers(value As String) As String
	Dim strCnt As Int
	Dim str As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim master As String = "0123456789-."
	For strCnt = 0 To value.Length - 1
		str = value.CharAt(strCnt)
		If master.IndexOf(str) >= 0 Then
			sb.Append(str)
		End If
	Next
	Return sb.tostring
End Sub

private Sub ChoiceBoxCheckListaVisible(cb As ChoiceBox) As Boolean
	Dim jo As JavaObject = cb
	Dim ListaVisible As Boolean=jo.RunMethod("isShowing",Null)
	#if debug
	Log("Lista visible ANTES de picar en el combobox=" & Not(ListaVisible))
	#End If
	If ListaVisible=False Then ' es decir, si ANTES de picar en el combobox, la lista estaba visible, ocultarla
		'ComboHideItems(cbo)
		cb.HideChoices
	End If
	Return Not(ListaVisible)
End Sub

#Region HelpersCombos
	' Al hacer click en el combo, el Show de la lista se invierte.
	' Si ejecutamos esta funcion desde el evento MouseClick, ComboCheckListaVisible devolverá cómo estaba la lista ANTES del MouseClick
private Sub ComboCheckListaVisible(cbo As ComboBox) As Boolean
	Dim jo As JavaObject = cbo
	Dim ListaVisible As Boolean=jo.RunMethod("isShowing",Null)
	#if debug
	Log("Lista visible ANTES de picar en el combobox=" & Not(ListaVisible))
	#End If
	If ListaVisible=False Then ' es decir, si ANTES de picar en el combobox, la lista estaba visible, ocultarla
		ComboHideItems(cbo)
	End If
	Return Not(ListaVisible)
End Sub

private Sub ComboSetVisibleRowCount(cb As ComboBox, arg As Int)
	Dim jo As JavaObject = cb
	jo.RunMethod("setVisibleRowCount",Array(arg))

End Sub

private Sub ComboShowItems(cb As ComboBox)
	Dim jo As JavaObject = cb
	jo.RunMethod("show",Null)
End Sub
private Sub ComboHideItems(cb As ComboBox)

	Dim jo As JavaObject = cb
	jo.RunMethod("hide",Null)
End Sub

#End Region


Public Sub GetDatosCampoOrigenDatosJamTableCLVAliasCampo(AliasCampoSel As String) As CampoOrigenDatosJamTableCLV
	Dim FlagOk As Boolean=False
	For Each c As CampoOrigenDatosJamTableCLV In mLstCamposOrigenDatos
		If c.AliasCampo=AliasCampoSel Then
			FlagOk=True
			Exit
		End If
	Next
	If FlagOk Then
		Return c
	Else
		Return Null
	End If
End Sub


#if Java

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;

import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;

public void addBotonSalirMenuBar (MenuBar menuBar, Button BotonSalir ) {
	//Label menuSalirLabel = new Label("Salir");
	//menuSalirLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
	//    @Override
	//    public void handle(MouseEvent event) {
	//		ba.raiseEventFromUI(this, "salirjamtableCLV", null);
	//    }
	//});
	Menu SalirMenu = new Menu();
	SalirMenu.setGraphic(BotonSalir);
	menuBar.getMenus().add(SalirMenu);
}

public void addLabelMenuAccionMenuBar (MenuBar menuBar, Label lbl) {
	Menu MenuAccion = new Menu();
	MenuAccion.setGraphic(lbl);
	menuBar.getMenus().add(MenuAccion);
	System.out.println("addLabelMenuAccionMenuBar .... ejecutada");
}


public void addImageViewMenuAccionMenuBar (MenuBar menuBar, ImageView imv) {
	Menu MenuAccion = new Menu();
	MenuAccion.setGraphic(imv);
	menuBar.getMenus().add(MenuAccion);
}




#End If


