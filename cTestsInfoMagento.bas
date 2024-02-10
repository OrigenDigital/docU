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
	Private btnSalir As B4XView
	Private jamTableView1 As jamTableView
	
	Dim Dialog As B4XDialog
	Dim JamLoadingIndicator1 As JamLoadingIndicator
	
	Private FlexGridDialog As FlexGrid
	Private MeasurementCanvas As B4XCanvas
	
	Dim mSQL As SQL
	
	Public PermisoModuloUsuario As String
	
'	Private const k As String="lox18xzyi3xof450v1rkumyoym409m3m"
'	Private const tk As String="d4lthat3abma7cfrnlptlz4u75jjbv3e"

	Private tk As  String

	Private B4XComboBoxTablasB2B As B4XComboBox
	Private B4XComboBoxStores As B4XComboBox
	Private TextAreaHTTPResponse As TextArea
	Private SplitPane1 As SplitPane
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
	CreacionTablasSQLite
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)
	MeasurementCanvas.Initialize(p)
End Sub

Public Sub Show
	'If frm.IsInitialized=False Then
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	'frm.RootPane.LoadLayout("scrECommerce")
	frm.RootPane.LoadLayout("scrTestMagento")
	SplitPane1.LoadLayout("scrTestMagentoJamTableView")
	Sleep(0)
	SplitPane1.LoadLayout("scrTestMagentoHTTPResponse")
	
	jamTableView1.EstadoMenuItem("Actualizar",False)
	
	Dim img As Image=xui.LoadBitmapResize(File.DirAssets,"twotone_exit_black_24dp.png",16,16,True)
	Dim imgV As ImageView
	imgV.Initialize("")
	imgV.SetImage(img)
	Dim btnJO As JavaObject=btnSalir
	btnJO.RunMethod("setGraphic",Array(imgV))
	
	
	frm.Title=Main.PrefijoTitleForms & "B2B"

'''''	CreacionTablasSQLite
'''''
'''''' Usar las 2 siguientes lineas para abrir el CampoBuilder		
''''''	jamTableView1.AbrirCamposBuilder
''''''	Return
'''''	
'''''	' EJEMPLOS de MENUS
'''''		
'''''	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
'''''	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
'''''		
'''''	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003),jamTableView1.MenuBarLinea)
'''''	jamTableView1.AddContextMenuItemSeparator
'''''	jamTableView1.AddContextMenuItemFontAwesomeText("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003))
'''''		
'''''	jamTableView1.AddContextMenuItemSeparator
'''''	Dim img As Image
'''''	img.InitializeSample(File.DirAssets,"navision.png",24,24)
'''''	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
'''''	jamTableView1.AddContextMenuItemImage("Articulo NAV","VerArticuloNAV",img)
'''''	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")
'''''
'''''
'''''		
'''''	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("",Null)
'''''	wait for (rSub) complete (mRes As Map)
'''''	Log(mRes)
'''''	If Not(mRes.Get("FlagOK")) Then
'''''		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''''		Wait For (msa) Msgbox_Result
'''''		frm.Close
'''''		Return
'''''	End If
'''''		
'''''	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'''''	
'''''	
'''''	' EJEMPLOS DE CELLFACTORIES
'''''	Dim CF As DatosCellFactoryJamTableView
'''''	CF.Initialize
'''''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
'''''	CF.CellFactoryEnCallBack=False
'''''	CF.params=Null
'''''	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
'''''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"))
'''''		
'''''	Dim CF As DatosCellFactoryJamTableView
'''''	CF.Initialize
'''''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
'''''	CF.CellFactoryEnCallBack=False
'''''	CF.params=Null
'''''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("NombreProveedor","DescripcionArticulo"))
'''''		
'''''	Dim CF As DatosCellFactoryJamTableView
'''''	CF.Initialize
'''''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'''''	CF.CellFactoryEnCallBack=False
'''''	CF.params=Null
'''''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPrometidaVencida","PendienteSeguimiento"))
'''''		
'''''	Dim dCF As DatosCellFactoryJamTableView
'''''	dCF.Initialize
'''''	dCF.AliasCampoColumna="ExcluidoReclamacion"
'''''	dCF.CellFactoryEnCallBack=False
'''''	dCF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'''''	jamTableView1.SetCellFactory(dCF)
'''''		
'''''	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("PendienteSeguimiento","Pendiente Seguimiento:" & CRLF & "  - SIN Fecha Prometida" & CRLF & "o" & CRLF &  " - Fecha Prometida Vencida" ,"lightyellow","black",16)
'''''
'''''		
		Dialog.Initialize(frm.RootPane)
		JamLoadingIndicator1.Initialize(Me,frm.RootPane)
'''''	
'''''	'End If
'''''
'''''	
'''''	
'''''	
'''''	
		frm.Show
'''''	
'''''	ActualizarDatos

	Wait For(CargaDatosCredenciales) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then 
		wait for(Utilidades.MsgBoxXUI("Aviso","Error credenciales.")) complete (rObj As Object)
		SalirModulo
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	Dim mData0 As Map=lstReg.Get(0)
	tk=mData0.GetValueAt(0)
	
	B4XComboBoxTablasB2B.SetItems(Array As String("","Stores","Grupos Cliente", "Clientes","Direcciones Cliente", "Categorias Productos","Productos", _
		"Valores Atributo size (Tallas Productos)", "Pedidos"))
End Sub

Sub getForm As Form
   Return frm 
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
	If jamTableView1.IsInitialized Then
		jamTableView1.GuardarConfiguracionColumnasUsuario
	End If
	frm.Close
	MainMenu2.Show
End Sub



' EJEMPLO CREACION DE TABLA INTERNA
Sub CreacionTablasSQLite

	mSQL.ExecNonQuery("drop table if exists tblB2BStores")
	Dim sCrearTabla As String=$"CREATE TABLE tblB2BStores (
	code TEXT,default_store_id INTEGER , name TEXT, root_category_id INT, id INTEGER, website_id INTEGER
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BGruposCliente")
	Dim sCrearTabla As String=$"CREATE TABLE tblB2BGruposCliente (
	code TEXT,tax_class_id INTEGER , id INTEGER, tax_class_name TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BClientes")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblB2BClientes] ([store_id] INTEGER, [firstname] TEXT
	, [addresses] TEXT, [created_at] TEXT, [extension_attributes] TEXT, [default_shipping] INTEGER default 0, [lastname] TEXT, gender INTEGER default 0, dob INTEGER default 0
	, [custom_attributes] TEXT, [updated_at] TEXT, [disable_auto_group_change] INTEGER, [group_id] INTEGER, [id] INTEGER
	, [default_billing] INTEGER default 0, [website_id] INTEGER, [email] TEXT PRIMARY KEY, [created_in] TEXT, [is_blocked] INTEGER default 0
	, [is_commercial] INTEGER default 0, [company] TEXT default '', [code] TEXT default '', [customer_group_code] TEXT default '', [customer_group_name] TEXT default ''
	, [language] TEXT default '', [country_id] TEXT '')"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BProductos")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BProductos] ([visibility] INTEGER, [type_id] TEXT, [created_at] TEXT
	, [extension_attributes] TEXT, [tier_prices] TEXT, [custom_attributes] TEXT, IDTalla INTEGER default -1, Talla TEXT default '', UnidadMedida TEXT default ''
	, [attribute_set_id] INTEGER, [updated_at] TEXT, [price] INTEGER default 0
	, [media_gallery_entries] TEXT, [name] TEXT, [options] TEXT, [id] INTEGER, [sku] TEXT PRIMARY KEY, [product_links] TEXT, [status] INTEGER, weight INTEGER default 0
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BDireccionesCliente")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BDireccionesCliente] ([firstname] TEXT,[lastname] TEXT, [city] TEXT
	, customer_code TEXT defalut'' , code TEXT default'', [region_id] INTEGER
	, [postcode] TEXT, [telephone] INTEGER, [default_shipping] TEXT default '', [default_billing] TEXT default '',[custom_attributes] TEXT
	, [street] TEXT default '', [street1] TEXT default '', [street2] TEXT default '', [street3] TEXT default '', [company] TEXT
	, [id] INTEGER, [customer_id] INTEGER, [region] TEXT, [country_id] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	
	mSQL.ExecNonQuery("drop table if exists tblB2BAtributoSizeProducts")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BAtributoSizeProducts] ([label] TEXT, [value] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BAtributoUnidadMedidaProductos")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BAtributoUnidadMedidaProductos] ([label] TEXT, [value] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
'	mSQL.ExecNonQuery("drop table if exists tblB2BOrders")
'	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BOrders] ([tax_amount] REAL, [tax_invoiced] REAL, [original_price] INTEGER
'	, [free_shipping] INTEGER, [base_discount_tax_compensation_invoiced] INTEGER, [discount_amount] INTEGER, [tax_percent] REAL
'	, [price_incl_tax] REAL, [price] INTEGER, [product_id] INTEGER, [base_row_total] INTEGER, [sku] TEXT, [discount_tax_compensation_amount] INTEGER
'	, [weight] INTEGER, [base_original_price] INTEGER, [row_weight] INTEGER, [applied_rule_ids] INTEGER, [base_amount_refunded] INTEGER
'	, [base_price_incl_tax] REAL, [no_discount] INTEGER, [name] TEXT, [base_discount_invoiced] INTEGER, [discount_percent] INTEGER
'	, [order_id] INTEGER, [discount_tax_compensation_invoiced] INTEGER, [created_at] TEXT, [qty_shipped] INTEGER, [qty_ordered] INTEGER
'	, [row_total] INTEGER, [qty_canceled] INTEGER, [product_option] TEXT, [amount_refunded] INTEGER, [updated_at] TEXT, [base_price] INTEGER
'	, [qty_invoiced] INTEGER, [row_invoiced] INTEGER, [row_total_incl_tax] REAL, [base_tax_amount] REAL, [store_id] INTEGER, [item_id] INTEGER
'	, [base_discount_amount] INTEGER, [base_row_total_incl_tax] REAL, [base_discount_tax_compensation_amount] INTEGER, [product_type] TEXT
'	, [qty_refunded] INTEGER, [base_row_invoiced] INTEGER, [is_qty_decimal] INTEGER, [discount_invoiced] INTEGER, [base_tax_invoiced] REAL)"$
'	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BOrders")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BOrders] ([order_id] INTEGER,  [created_at] TEXT, [store_id] INTEGER default 0
	, [po_number] TEXT default ''
	, [item_id] INTEGER,[product_id] INTEGER default 0, [sku] TEXT, [name] TEXT, [Talla] TEXT DEFAULT '', parent_id TEXT default ''
	,[original_price] INTEGER default 0
	, [free_shipping] INTEGER default 0, [discount_amount] REAL default 0, [tax_percent] REAL default 0
	, [price] REAL default 0, [base_row_total] REAL
	,  [base_original_price] REAL default 0
	, [qty_shipped] INTEGER, [qty_ordered] INTEGER
	, [row_total] REAL, [qty_canceled] INTEGER, [product_option] TEXT, [updated_at] TEXT, [base_price] REAL
	, [qty_invoiced] INTEGER, [row_invoiced] INTEGER
	,  [product_type] TEXT
	, [qty_refunded] INTEGER, [base_row_invoiced] INTEGER, [is_qty_decimal] INTEGER default 0)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BCategoriasProductos")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BCategoriasProductos] ([label] TEXT, [value] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	

End Sub

' EJEMPLO, modificar según formulario
Sub ActualizarDatosMysql As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String=""
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
			DBUtils.InsertMaps(mSQL,"tblDatosFormulario",lstReg)
		End If
	End If
	Return mRes
End Sub



Sub jamTableView1_AccionSalirJamTableView
	SalirModulo
End Sub

Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
'		Case "Actualizar"
'			Actualizar
		Case "SeleccionarCuentaRemitenteEmail"
			wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
			If rBool=False Then Return
	End Select
End Sub

' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
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
			
		Case "DireccionesClientes"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			'Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Pedido",FilaSel)
			Dim IDClienteSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel,"id")
			
			MostrarDireccionesClienteMagento(IDClienteSel)
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


'EJEMPLO
Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "ExcluidoReclamacion"
			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
	End Select
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



#Region Magento

Sub CargaDatosCredenciales As ResumableSub
	'DatosEnvioExpedicion.Initialize
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim ComandoJRDC As String
	ComandoJRDC="TokenB2BPruebas"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes, ComandoJRDC, Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		Accion="NOK"
	Else
		If mresult.Get("ReqOK")=False Then
			Accion="NOK"
		Else
			Dim lstReg As List=mresult.Get("lstRes")
			Accion="OK"
			mRes.Put("lstReg",lstReg)
		End If
	End If
	mRes.Put("Accion",Accion)
	Return mRes
End Sub


Private Sub MostrarListaStoresMagento
	JamLoadingIndicator1.MensajeLoading="Cargando Stores..."
	JamLoadingIndicator1.Show
	Wait For(CargaListaStoresMagento) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Stores B2B")) complete (rObj As Object)
		Return
	End If
	
	Dim lstMapRecords As List
	lstMapRecords.Initialize
	Dim rsRowIDs As ResultSet=mSQL.ExecQuery("select rowid from tblB2BStores")
	Do While rsRowIDs.NextRow
		Dim mData As Map=DBUtils.ExecuteMap(mSQL,"select * from tblB2BStores where rowid=?",Array As String(rsRowIDs.GetInt("rowId")))
		lstMapRecords.Add(mData)
	Loop
	rsRowIDs.Close
	
	Dim pBaseFlexGrid As B4XView = xui.CreatePanel("")
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip, (0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	pBaseFlexGrid.LoadLayout("scrDialogFlexGrid")

	Dim HeadersFont As Font=xui.CreateDefaultfont(15)
	FlexGridDialog.HeaderFont=HeadersFont

	Dim RowsFont As Font=xui.CreateDefaultfont(14)
	FlexGridDialog.Font=RowsFont
	Dim NumColumnasTablaTotales As Int=mData.Size
	Dim AnchosColumnas(NumColumnasTablaTotales) As Int
	FlexGridDialog.SetColsNumber(NumColumnasTablaTotales)
	Dim ColIndex As Int
	For Each k As String In mData.Keys
		FlexGridDialog.SetColName(ColIndex,k)

		Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
		If AnchoColumna<MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip Then
			AnchoColumna=MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip
			AnchosColumnas(ColIndex)=AnchoColumna
		End If
		
		ColIndex=ColIndex+1
	Next
	
	For Each mDatos As Map In lstMapRecords
		Dim Fila(NumColumnasTablaTotales) As String
		Dim ColIndex As Int
		For Each k As String In mDatos.Keys
			Fila(ColIndex)=mDatos.get(k)
			Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
			If AnchoColumna<MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip Then
				AnchoColumna=MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip
				AnchosColumnas(ColIndex)=AnchoColumna
			End If
			ColIndex=ColIndex+1
		Next
		FlexGridDialog.AddRow(Fila,False)
	Next
	
	'AutoSize
	Dim AnchoTotalTabla As Int
	For ColIndex=0 To NumColumnasTablaTotales-1
		FlexGridDialog.SetColWidth(ColIndex,AnchosColumnas(ColIndex))
		AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(ColIndex)
	Next

	For RowIndex=0 To FlexGridDialog.RowCount-1
		FlexGridDialog.SetRowHeight(RowIndex,50dip)
	Next
	Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.RowCount)+50dip,(0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	FlexGridDialog.Base.Width=AnchoTotalTabla
	FlexGridDialog.Base.Height=AltoTotal
	
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTotalTabla+30dip, AltoTotal+60dip)
	Sleep(100)
	FlexGridDialog.Invalidate
	
	JamLoadingIndicator1.Close
	
	Dialog.Title="Datos Stores"
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseFlexGrid, "OK", "", "")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=16
	Wait For (rSub) Complete (Result As Int)
End Sub

Private Sub CargaListaStoresMagento As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BStores")
	wait for(EnvioDatosAPIMagentoListaStores(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		 Return False
	End If
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As List = parser.NextArray
	For Each colroot As Map In root
		Dim code As String = colroot.Get("code")
		Dim default_store_id As Int = colroot.Getdefault("default_store_id",-1)
		Dim name As String = colroot.Get("name")
		Dim root_category_id As Int = colroot.Getdefault("root_category_id",-1)
		Dim id As Int = colroot.Get("id")
		Dim website_id As Int = colroot.Get("website_id")
		
		Log("code: " & code & " Name: " & name & " ID: " & id)
		Log(" ")
		mSQL.ExecNonQuery2($"insert into tblB2BStores (code, default_store_id, name, root_category_id, id, website_id) values (?,?,?,?,?,?)"$, _
			Array As Object(code, default_store_id, name, root_category_id, id,website_id))
	Next

	
	Return True
End Sub

Sub EnvioDatosAPIMagentoListaStores(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	'Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/store/storeViews"$
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/store/storeGroups"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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


Private Sub MostrarListaGruposClienteMagento
	JamLoadingIndicator1.MensajeLoading="Cargando Grupos Cliente..."
	JamLoadingIndicator1.Show
	Wait For(CargaListaGruposClienteMagento) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Grupos Cliente B2B")) complete (rObj As Object)
		Return
	End If
	
	Dim lstMapRecords As List
	lstMapRecords.Initialize
	Dim rsRowIDs As ResultSet=mSQL.ExecQuery("select rowid from tblB2BGruposCliente")
	Do While rsRowIDs.NextRow
		Dim mData As Map=DBUtils.ExecuteMap(mSQL,"select * from tblB2BGruposCliente where rowid=?",Array As String(rsRowIDs.GetInt("rowId")))
		lstMapRecords.Add(mData)
	Loop
	rsRowIDs.Close
	
	Dim pBaseFlexGrid As B4XView = xui.CreatePanel("")
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip, (0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	pBaseFlexGrid.LoadLayout("scrDialogFlexGrid")

	Dim HeadersFont As Font=xui.CreateDefaultfont(15)
	FlexGridDialog.HeaderFont=HeadersFont

	Dim RowsFont As Font=xui.CreateDefaultfont(14)
	FlexGridDialog.Font=RowsFont
	Dim NumColumnasTablaTotales As Int=mData.Size
	Dim AnchosColumnas(NumColumnasTablaTotales) As Int
	FlexGridDialog.SetColsNumber(NumColumnasTablaTotales)
	Dim ColIndex As Int
	For Each k As String In mData.Keys
		FlexGridDialog.SetColName(ColIndex,k)

		Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
		If AnchoColumna<MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip Then
			AnchoColumna=MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip
			AnchosColumnas(ColIndex)=AnchoColumna
		End If
		
		ColIndex=ColIndex+1
	Next
	
	For Each mDatos As Map In lstMapRecords
		Dim Fila(NumColumnasTablaTotales) As String
		Dim ColIndex As Int
		For Each k As String In mDatos.Keys
			Fila(ColIndex)=mDatos.get(k)
			Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
			If AnchoColumna<MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip Then
				AnchoColumna=MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip
				AnchosColumnas(ColIndex)=AnchoColumna
			End If
			ColIndex=ColIndex+1
		Next
		FlexGridDialog.AddRow(Fila,False)
	Next
	
	'AutoSize
	Dim AnchoTotalTabla As Int
	For ColIndex=0 To NumColumnasTablaTotales-1
		FlexGridDialog.SetColWidth(ColIndex,AnchosColumnas(ColIndex))
		AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(ColIndex)
	Next

	For RowIndex=0 To FlexGridDialog.RowCount-1
		FlexGridDialog.SetRowHeight(RowIndex,50dip)
	Next
	Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.RowCount)+50dip,(0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	FlexGridDialog.Base.Width=AnchoTotalTabla
	FlexGridDialog.Base.Height=AltoTotal
	
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTotalTabla+30dip, AltoTotal+60dip)
	Sleep(100)
	FlexGridDialog.Invalidate
	
	JamLoadingIndicator1.Close
	
	Dialog.Title="Datos Grupos Cliente"
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseFlexGrid, "OK", "", "")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=16
	Wait For (rSub) Complete (Result As Int)
End Sub


Private Sub CargaListaGruposClienteMagento As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BGruposCliente")
	wait for(EnvioDatosAPIMagentoBusquedaGruposClientes(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False

	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Dim code As String = colitems.Get("code")
		Dim tax_class_id As Int = colitems.Get("tax_class_id")
		Dim id As Int = colitems.Get("id")
		Dim tax_class_name As String = colitems.Get("tax_class_name")
		Log(colitems)
		Log("")
		mSQL.ExecNonQuery2($"insert into tblB2BGruposCliente (code, tax_class_id, id, tax_class_name) values (?,?,?,?)"$, _
			Array As Object(code, tax_class_id, id, tax_class_name))
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	For Each colfilter_groups As Map In filter_groups
		Dim filters As List = colfilter_groups.Get("filters")
		For Each colfilters As Map In filters
			Dim field As String = colfilters.Get("field")
			Dim condition_type As String = colfilters.Get("condition_type")
			Dim value As String = colfilters.Get("value")
		Next
	Next
	Return True

End Sub

Sub EnvioDatosAPIMagentoBusquedaGruposClientes(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customerGroups/search?
	searchCriteria[filterGroups][0][filters][0][field]=code&
	searchCriteria[filterGroups][0][filters][0][value]=%&
	searchCriteria[filterGroups][0][filters][0][condition_type]=like"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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

Private Sub MostrarListaClientesMagento
	JamLoadingIndicator1.MensajeLoading="Cargando Clientes..."
	JamLoadingIndicator1.Show
	Wait For(CargaListaClientesMagento) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Clientes B2B")) complete (rObj As Object)
		Return
	End If
		
'	jamTableView1.AbrirCamposBuilder
'	Return

	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BClientes.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	jamTableView1.AddContextMenuItemFontMaterialIconsText("Direcciones Cliente","DireccionesClientes",Chr(0xE0C8))
	
	Dim rsClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BClientes")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If
End Sub


Private Sub CargaListaClientesMagento As ResumableSub
 	mSQL.ExecNonQuery("delete from tblB2BClientes")
	wait for(EnvioDatosAPIMagentoBusquedaClientes(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Log("ColItems: " & colitems)
		
		Dim id As Int = colitems.Get("id")
		If id=66 Then
			Log("Mary J")
		End If
		
		For Each sK As String In colitems.Keys
			Log(sK & ": " & colitems.Get(sK))
		Next
		Dim store_id As Int = colitems.Get("store_id")
		Dim firstname As String = colitems.Get("firstname")
		Dim addresses As List = colitems.Get("addresses")
		For Each coladdresses As Map In addresses
			
			Log("coladdresses: " & coladdresses)
			Dim firstname As String = coladdresses.Get("firstname")
			Dim city As String = coladdresses.Get("city")
			Dim region_id As Int = coladdresses.Get("region_id")
			Dim postcode As String = coladdresses.Get("postcode")
			Dim telephone As String = coladdresses.Get("telephone")
			Dim default_shipping As String = coladdresses.Get("default_shipping")
			Dim lastname As String = coladdresses.Get("lastname")
			Dim street As List = coladdresses.Get("street")
			For Each colstreet As String In street
			Next
			Dim id As Int = coladdresses.Get("id")
			Dim customer_id As Int = coladdresses.Get("customer_id")
			Dim region As Map = coladdresses.Get("region")
			Dim region_id As Int = region.Get("region_id")
			Dim regionA As String = region.Get("region")
			Dim region_code As String = region.Get("region_code")
			Dim default_billing As String = coladdresses.Get("default_billing")
			Dim country_id As String = coladdresses.Get("country_id")
		Next
		Dim gender As Int = colitems.Getdefault("gender",0)
		Dim created_at As String = colitems.Get("created_at")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim is_subscribed As String = extension_attributes.Get("is_subscribed")
		Dim default_shipping As String = colitems.Get("default_shipping")
		Dim lastname As String = colitems.Get("lastname")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim disable_auto_group_change As Int = colitems.Get("disable_auto_group_change")
		Dim group_id As Int = colitems.Get("group_id")
		Dim dob As String = colitems.Get("dob")
		Dim id As Int = colitems.Get("id")
		Dim default_billing As String = colitems.Get("default_billing")
		Dim website_id As Int = colitems.Get("website_id")
		Dim email As String = colitems.Get("email")
		Dim created_in As String = colitems.Get("created_in")
		Dim custom_attributes As List=colitems.Get("custom_attributes")
		Dim is_blocked As Int=0
		Dim is_commercial As Int=0
		Dim company As String=""
		Dim code As String=""
		Dim customer_group_code As String=""
		Dim customer_group_name As String=""
		Dim language As String=""
		Dim country_id As String=""
		If custom_attributes.IsInitialized Then
			Log(custom_attributes)
			For Each mAttribute As Map In custom_attributes
				If mAttribute.Get("attribute_code")="is_blocked" Then is_blocked= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="is_commercial" Then is_commercial= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="company" Then company= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="code" Then code= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="customer_group_code" Then customer_group_code= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="customer_group_name" Then customer_group_name= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="language" Then language= mAttribute.Get("value")
				If mAttribute.Get("attribute_code")="country_id" Then country_id= mAttribute.Get("value")
			Next

			colitems.put("is_blocked",is_blocked)
			colitems.put("is_commercial",is_commercial)
			colitems.put("company",company)
			colitems.put("code",code)
			colitems.put("customer_group_code",customer_group_code)
			colitems.put("customer_group_name",customer_group_name)
			colitems.put("language",language)
			colitems.put("country_id",country_id)
			
			'Utilidades.LogStringCrearTablaDesdeMap("tblB2BClientes",colitems,"email")
		End If
	Next
	
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BClientes",items)
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	For Each colfilter_groups As Map In filter_groups
		Dim filters As List = colfilter_groups.Get("filters")
		For Each colfilters As Map In filters
			Dim field As String = colfilters.Get("field")
			Dim condition_type As String = colfilters.Get("condition_type")
			Dim value As String = colfilters.Get("value")
		Next
	Next
	Return True
End Sub

'End Sub


Sub EnvioDatosAPIMagentoBusquedaClientes(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)

	
	'Dim URLAPIReq As String="https://proingroup-webstorepre.com/admin?id=" & IDDatoEnvioBuscado & "&idioma=es"
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customers/search?
	searchCriteria[filterGroups][0][filters][0][field]=firstname&
	searchCriteria[filterGroups][0][filters][0][value]=%&
	searchCriteria[filterGroups][0][filters][0][condition_type]=like"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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



Private Sub CargaInfoClienteMagento As ResumableSub

	Wait For(SeleccionarCliente) complete (IDClienteSel As Int)
	If IDClienteSel=-1 Then Return
	
	wait for(EnvioDatosAPIMagentoInformacionCliente(tk,IDClienteSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	For Each sK As String In root.Keys
		Log(sK & ": " & root.Get(sK))
	Next
	Dim store_id As Int = root.Get("store_id")
	Dim firstname As String = root.Get("firstname")
	Dim addresses As List = root.Get("addresses")
	Dim created_at As String = root.Get("created_at")
	Dim extension_attributes As Map = root.Get("extension_attributes")
	Dim is_subscribed As String = extension_attributes.Get("is_subscribed")
	Dim lastname As String = root.Get("lastname")
	Dim custom_attributes As List = root.Get("custom_attributes")
	If custom_attributes.IsInitialized Then
		For Each colcustom_attributes As Map In custom_attributes
			Dim value As String = colcustom_attributes.Get("value")
			Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
		Next
	End If
	Dim updated_at As String = root.Get("updated_at")
	Dim disable_auto_group_change As Int = root.Get("disable_auto_group_change")
	Dim group_id As Int = root.Get("group_id")
	Dim id As Int = root.Get("id")
	Dim website_id As Int = root.Get("website_id")
	Dim email As String = root.Get("email")
	Dim created_in As String = root.Get("created_in")   ' Nombre del grupo de clientes
	For Each mAddress As Map In addresses
		Log("Address: " & mAddress)
	Next
	Return True
End Sub

Private Sub CargaInfoDireccionesClienteMagento(IDClienteSel As Int) As ResumableSub

'	Wait For(SeleccionarCliente) complete (IDClienteSel As Int)
'	If IDClienteSel=-1 Then Return

'	Dim mDireccionesCliente As Map
'	mDireccionesCliente.Initialize
	
	mSQL.ExecNonQuery("delete from tblB2BDireccionesCliente")
	
	wait for(EnvioDatosAPIMagentoInformacionCliente(tk,IDClienteSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
'	For Each sK As String In root.Keys
'		Log(sK & ": " & root.Get(sK))
'	Next
	Dim store_id As Int = root.Get("store_id")
	Dim firstname As String = root.Get("firstname")
	Dim addresses As List = root.Get("addresses")
	Dim created_at As String = root.Get("created_at")
	Dim extension_attributes As Map = root.Get("extension_attributes")
	Dim is_subscribed As String = extension_attributes.Get("is_subscribed")
	Dim lastname As String = root.Get("lastname")
	Dim custom_attributes As List = root.Get("custom_attributes")
	Dim code As String
	Dim customer_code As String
	If custom_attributes.IsInitialized Then
		For Each colcustom_attributes As Map In custom_attributes
			Dim value As String = colcustom_attributes.Get("value")
			Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
			If attribute_code="code" Then code=value
			If attribute_code="customer_code" Then customer_code=value
		Next
	End If

	Dim updated_at As String = root.Get("updated_at")
	Dim disable_auto_group_change As Int = root.Get("disable_auto_group_change")
	Dim group_id As Int = root.Get("group_id")
	Dim id As Int = root.Get("id")
	Dim website_id As Int = root.Get("website_id")
	Dim email As String = root.Get("email")
	Dim created_in As String = root.Get("created_in")   ' Nombre del grupo de clientes
	For Each mAddress As Map In addresses
		Log("Address: " & mAddress)
		Dim Street As String=mAddress.Get("Street")
'		Dim Street1 As String=Street.Get(0)
'		Dim street2 As String
'		Dim street3 As String
'		If Street.Size>1 Then street2=Street.Get(1)
'		If Street.Size>2 Then street3=Street.Get(2)
'		mAddress.Put("Street1",Street1)
'		mAddress.Put("Street2",street2)
'		mAddress.Put("Street3",street3)
		mAddress.Put("code",code)
		mAddress.Put("customer_code",customer_code)
		Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BDireccionesCliente",Array(mAddress))
	Next
	
	Return True
End Sub

Sub EnvioDatosAPIMagentoInformacionCliente(Token As String, IDCliente As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customers/${IDCliente}"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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

Private Sub MostrarListaProductosMagento
	JamLoadingIndicator1.MensajeLoading="Cargando Lista Productos..."
	JamLoadingIndicator1.Show
	Wait For(CargaListaProductosMagento) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Productos B2B")) complete (rObj As Object)
		Return
	End If
	
'	JamLoadingIndicator1.Close
'	jamTableView1.AbrirCamposBuilder
'	Return

	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BProductos.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BProductos")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If
End Sub


Private Sub CargaListaProductosMagento As ResumableSub
	
	wait for(CargaValoresAtributoSizeProductos) complete (Success As Boolean)
	If Not(Success) Then Return False
	
'	wait for(CargaValoresAtributoUnidadMedidaProductos) complete (Success As Boolean)
'	If Not(Success) Then Return False
	
	mSQL.ExecNonQuery("delete from tblB2BProductos")

	wait for(EnvioDatosAPIMagentoInformacionProductos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	Dim lstTallas As List
	lstTallas.Initialize
	Dim lstUnidadesMedida As List
	lstUnidadesMedida.Initialize
	For Each colitems As Map In items
		Log("colitems:" & colitems)
		Dim visibility As Int = colitems.Get("visibility")
		Dim type_id As String = colitems.Get("type_id")
		Dim created_at As String = colitems.Get("created_at")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim website_ids As List = extension_attributes.Get("website_ids")
		For Each colwebsite_ids As Int In website_ids
		
		Next
		Dim category_links As List = extension_attributes.Get("category_links")
		If category_links.IsInitialized Then
			For Each colcategory_links As Map In category_links
				Dim category_id As String = colcategory_links.Get("category_id")
				Dim position As Int = colcategory_links.Get("position")
			Next
		End If
		Dim tier_prices As List = colitems.Get("tier_prices")
		Dim sku As String = colitems.Get("sku")
'		If sku="0101000000035_9" Then
'			Log("0101000000035_9")
'		End If
'		If sku="0101000000183_10" Then
'			Log("0101000000183_10")
'		End If
'		If sku="0101000000183" Then
'			Log("0101000000183")
'		End If
		
		Dim custom_attributes As List = colitems.Get("custom_attributes")
		Dim IDTalla As Int=-1
		Dim UnidadMedida As String
		For Each colcustom_attributes As Map In custom_attributes
			Log(colcustom_attributes.Get("attribute_code") & ": " & colcustom_attributes.Get("value"))
			Dim value As String = colcustom_attributes.Get("value")
'			If value="PAR" Then
'				Log("PAR")
'			End If
			Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
			If attribute_code="size" Then
				Log("size")
				IDTalla=value
			End If
			If attribute_code="unidad_medida" Then
				Log("unidad_medida")
				UnidadMedida=value
			End If
		Next
		colitems.Put("IDTalla",IDTalla)
		colitems.Put("UnidadMedida",UnidadMedida)
		Dim attribute_set_id As Int = colitems.Get("attribute_set_id")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim price As Int = colitems.Getdefault("price",0)
		Dim media_gallery_entries As List = colitems.Get("media_gallery_entries")
		For Each colmedia_gallery_entries As Map In media_gallery_entries
			Dim types As List = colmedia_gallery_entries.Get("types")
			For Each coltypes As String In types
			Next
			Dim Fichero As String = colmedia_gallery_entries.Get("file")
			Dim media_type As String = colmedia_gallery_entries.Get("media_type")
			Dim disabled As String = colmedia_gallery_entries.Get("disabled")
			Dim id As Int = colmedia_gallery_entries.Get("id")
			Dim label As String = colmedia_gallery_entries.Get("label")
			Dim position As Int = colmedia_gallery_entries.Get("position")
		Next
		Dim name As String = colitems.Get("name")
		Dim options As List = colitems.Get("options")
		Dim id As Int = colitems.Get("id")
		Dim sku As String = colitems.Get("sku")
'		If sku="0101000000035_9" Then
'			Log("0101000000035_9")
'		End If
		Dim product_links As List = colitems.Get("product_links")
		For Each colproduct_links As Map In product_links
			Dim link_type As String = colproduct_links.Get("link_type")
			Dim linked_product_sku As String = colproduct_links.Get("linked_product_sku")
			Dim linked_product_type As String = colproduct_links.Get("linked_product_type")
			Dim position As Int = colproduct_links.Get("position")
			Dim sku As String = colproduct_links.Get("sku")
		Next
		Dim status As Int = colitems.Get("status")
'		Utilidades.LogStringCrearTablaDesdeMap("tblB2BProductos",colitems,"sku")
	Next
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BProductos",items)
	
	mSQL.ExecNonQuery($"update tblB2BProductos set Talla=tTallas.Talla
	from (select value as IDTalla, label as Talla from tblB2BAtributoSizeProducts) tTallas
	where tblB2BProductos.IDTalla=tTallas.IDTalla
	"$)
	
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	Dim current_page As Int = search_criteria.Getdefault("current_page",0)
	Dim page_size As Int = search_criteria.Getdefault("page_size",0)

	Return True
End Sub

Sub EnvioDatosAPIMagentoInformacionProductos(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	

	' TODOS los productos
	'Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[currentPage]=1&searchCriteria[pageSize]=100"$
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[pageSize] = 0"$
'	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[pageSize] = 0
'	&searchCriteria[filterGroups][0][filters][0][field]=website_ids&
'	searchCriteria[filterGroups][0][filters][0][value]=32&
'	searchCriteria[filterGroups][0][filters][0][condition_type]=eq"$

	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=30000
	
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

Private Sub btnListaPedidosMagento_Click

	wait for(EnvioDatosAPIMagentoInformacionPedidos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Log("ColItems: " & colitems)
'		Dim tax_amount As Double = colitems.Get("tax_amount")
'		Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
'		Dim customer_note_notify As Int = colitems.Get("customer_note_notify")
'		Dim shipping_discount_amount As Int = colitems.Get("shipping_discount_amount")
'		Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
		Dim customer_firstname As String = colitems.Get("customer_firstname")
'		Dim discount_amount As Int = colitems.Get("discount_amount")
		Dim billing_address As Map = colitems.Get("billing_address")
		Dim firstname As String = billing_address.Get("firstname")
		Dim address_type As String = billing_address.Get("address_type")
		Dim customer_address_id As Int = billing_address.Getdefault("customer_address_id",-1)
		Dim city As String = billing_address.Get("city")
		Dim postcode As String = billing_address.Get("postcode")
		Dim region_id As Int = billing_address.Getdefault("region_id",0)
		Dim telephone As String = billing_address.Get("telephone")
		Dim entity_id As Int = billing_address.Get("entity_id")
		Dim lastname As String = billing_address.Get("lastname")
		Dim parent_id As Int = billing_address.Get("parent_id")
		Dim street As List = billing_address.Get("street")
		For Each colstreet As String In street
			Log("colstreet:" & colstreet)
		Next
		Dim region As String = billing_address.Get("region")
		Dim country_id As String = billing_address.Get("country_id")
		Dim email As String = billing_address.Get("email")
		Dim region_code As String = billing_address.Get("region_code")
		Dim total_paid As Double = colitems.Getdefault("total_paid",0)
		Dim increment_id As String = colitems.Get("increment_id")
		Dim payment As Map = colitems.Get("payment")
		Dim base_amount_ordered As Double = payment.Getdefault("base_amount_ordered",0)
		Dim amount_paid As Double = payment.Getdefault("amount_paid",0)
		Dim method As String = payment.Get("method")
		Dim cc_last4 As String = payment.Get("cc_last4")
'		Dim shipping_captured As Int = payment.Get("shipping_captured")
		Dim account_status As String = payment.Get("account_status")
		Dim amount_ordered As Double = payment.Getdefault("amount_ordered",0)
		Dim entity_id As Int = payment.Get("entity_id")
		Dim base_amount_paid As Double = payment.Getdefault("base_amount_paid",0)
		Dim shipping_amount As Int = payment.Get("shipping_amount")
		Dim additional_information As List = payment.Get("additional_information")
		For Each coladditional_information As String In additional_information
		Next
		Dim base_shipping_amount As Int = payment.Get("base_shipping_amount")
		Dim parent_id As Int = payment.Get("parent_id")
'		Dim base_shipping_captured As Int = payment.Get("base_shipping_captured")
		Dim state As String = colitems.Get("state")
'		Dim base_shipping_tax_amount As Int = colitems.Get("base_shipping_tax_amount")
		Dim base_grand_total As Double = colitems.Get("base_grand_total")
		Dim billing_address_id As Int = colitems.Get("billing_address_id")
		Dim customer_lastname As String = colitems.Get("customer_lastname")
		Dim quote_id As Int = colitems.Get("quote_id")
		Dim shipping_invoiced As Int = colitems.Getdefault("shipping_invoiced",-1)
		Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
		Dim weight As Int = colitems.Get("weight")
		Dim entity_id As Int = colitems.Get("entity_id")
		Dim IDPedido As Int = colitems.Get("entity_id")
		Dim base_total_invoiced As Double = colitems.Getdefault("base_total_invoiced",0)
		Dim base_shipping_amount As Int = colitems.Get("base_shipping_amount")
		Dim base_subtotal_invoiced As Int = colitems.Getdefault("base_subtotal_invoiced",0)
		Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim subtotal_incl_tax As Double = colitems.Get("subtotal_incl_tax")
		Dim base_shipping_discount_tax_compensation_amnt As Int = colitems.Get("base_shipping_discount_tax_compensation_amnt")
		Dim subtotal As Int = colitems.Get("subtotal")
		Dim base_shipping_incl_tax As Int = colitems.Get("base_shipping_incl_tax")
		Dim customer_email As String = colitems.Get("customer_email")
		Dim base_discount_invoiced As Int = colitems.Getdefault("base_discount_invoiced",0)
		Dim total_invoiced As Double = colitems.Getdefault("total_invoiced",0)
		Dim base_to_global_rate As Int = colitems.Get("base_to_global_rate")
		Dim customer_is_guest As Int = colitems.Get("customer_is_guest")
		Dim items As List = colitems.Get("items")
		For Each colitems As Map In items
			Dim tax_amount As Double = Utilidades.FixNullDouble(colitems.Get("tax_amount"))
			Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
			Dim original_price As Int = colitems.Get("original_price")
			Dim free_shipping As Int = colitems.Get("free_shipping")
			Dim base_discount_tax_compensation_invoiced As Int = Utilidades.FixNullInt(colitems.Getdefault("base_discount_tax_compensation_invoiced",0))
			Dim discount_amount As Int = Utilidades.FixNullint(colitems.Get("discount_amount"))
			Dim tax_percent As Double = Utilidades.FixNullDouble(colitems.Get("tax_percent"))
			Dim price_incl_tax As Double = Utilidades.FixNullDouble(colitems.Getdefault("price_incl_tax",0))
			Dim price As Int = colitems.Get("price")
			Dim product_id As Int = colitems.Get("product_id")
			Dim base_row_total As Int = colitems.Get("base_row_total")
			Dim sku As String = colitems.Get("sku")
			Dim discount_tax_compensation_amount As Int = Utilidades.FixNullInt(colitems.Getdefault("discount_tax_compensation_amount",0))
			Dim weight As Int = Utilidades.FixNullInt(colitems.Getdefault("weight",-1))
			Dim base_original_price As Int = colitems.GetDEFAULT("base_original_price",0)
			Dim row_weight As Int = colitems.Get("row_weight")
			Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
			Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
			Dim base_price_incl_tax As Double = colitems.Getdefault("base_price_incl_tax",-1)
			Dim no_discount As Int = colitems.Get("no_discount")
			Dim name As String = colitems.Get("name")
			Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
			Dim discount_percent As Int = colitems.Get("discount_percent")
			Dim order_id As Int = colitems.Get("order_id")
			Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
			Dim created_at As String = colitems.Get("created_at")
			Dim qty_shipped As Int = colitems.Get("qty_shipped")
			Dim qty_ordered As Int = colitems.Get("qty_ordered")
			Dim row_total As Int = colitems.Get("row_total")
			Dim qty_canceled As Int = colitems.Get("qty_canceled")
			Dim product_option As Map = colitems.Get("product_option")
			If product_option.IsInitialized Then
				Dim extension_attributes As Map = product_option.Get("extension_attributes")
				Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
				For Each colconfigurable_item_options As Map In configurable_item_options
					Dim option_value As Int = colconfigurable_item_options.Get("option_value")
					Dim option_id As String = colconfigurable_item_options.Get("option_id")
				Next
			End If
			Dim amount_refunded As Int = colitems.Get("amount_refunded")
			Dim updated_at As String = colitems.Get("updated_at")
			Dim base_price As Int = colitems.Get("base_price")
			Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
			Dim row_invoiced As Int = colitems.Get("row_invoiced")
			Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
			Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
			Dim store_id As Int = colitems.Get("store_id")
			Dim item_id As Int = colitems.Get("item_id")
			Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
			Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
			Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
			Dim product_type As String = colitems.Get("product_type")
			Dim qty_refunded As Int = colitems.Get("qty_refunded")
			Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
			Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
			Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
			Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Next
		Dim global_currency_code As String = colitems.Get("global_currency_code")
		Dim status As String = colitems.Get("status")
		Dim is_virtual As Int = colitems.Getdefault("is_virtual",0)
		Dim base_total_invoiced_cost As Int = colitems.Getdefault("base_total_invoiced_cost",-1)
		Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
		Dim status_histories As List = colitems.Get("status_histories")
		Dim store_currency_code As String = colitems.Get("store_currency_code")
		Dim created_at As String = colitems.Get("created_at")
		Dim total_item_count As Int = colitems.Getdefault("total_item_count",-1)
		Dim shipping_tax_amount As Int = colitems.Getdefault("shipping_tax_amount",-1)
		Dim store_to_base_rate As Int = colitems.Getdefault("store_to_base_rate",1)
		Dim updated_at As String = colitems.Get("updated_at")
		Dim base_shipping_discount_amount As Int = colitems.Getdefault("base_shipping_discount_amount",-1)
		Dim store_name As String = colitems.Get("store_name")
		Dim grand_total As Double = colitems.Getdefault("grand_total",-1)
		Dim base_currency_code As String = colitems.Get("base_currency_code")
		Dim base_total_paid As Double = colitems.Getdefault("base_total_paid",-1)
		Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim store_id As Int = colitems.Get("store_id")
		Dim shipping_discount_tax_compensation_amount As Int = colitems.Getdefault("shipping_discount_tax_compensation_amount",-1)
		Dim total_due As Int = colitems.Getdefault("total_due",-1)
		Dim total_qty_ordered As Int = colitems.Getdefault("total_qty_ordered",-1)
		Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		If extension_attributes.IsInitialized Then
			Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
			If shipping_assignments.IsInitialized Then
				For Each colshipping_assignments As Map In shipping_assignments
					Dim shipping As Map = colshipping_assignments.Get("shipping")
					Dim total As Map = shipping.Get("total")
					Dim shipping_amount As Int = total.Get("shipping_amount")
					Dim base_shipping_amount As Int = total.Get("base_shipping_amount")
					Dim shipping_discount_tax_compensation_amount As Int = total.Get("shipping_discount_tax_compensation_amount")
					Dim shipping_discount_amount As Int = total.Get("shipping_discount_amount")
					Dim base_shipping_discount_amount As Int = total.Get("base_shipping_discount_amount")
					Dim base_shipping_discount_tax_compensation_amnt As Int = total.Get("base_shipping_discount_tax_compensation_amnt")
					Dim base_shipping_incl_tax As Int = total.Get("base_shipping_incl_tax")
					Dim shipping_invoiced As Int = total.Get("shipping_invoiced")
					Dim shipping_incl_tax As Int = total.Get("shipping_incl_tax")
					Dim base_shipping_invoiced As Int = total.Get("base_shipping_invoiced")
					Dim base_shipping_tax_amount As Int = total.Get("base_shipping_tax_amount")
					Dim shipping_tax_amount As Int = total.Get("shipping_tax_amount")
					Dim address As Map = shipping.Get("address")
					Dim firstname As String = address.Get("firstname")
					Dim address_type As String = address.Get("address_type")
					Dim customer_address_id As Int = address.Get("customer_address_id")
					Dim city As String = address.Get("city")
					Dim postcode As String = address.Get("postcode")
					Dim region_id As Int = address.Get("region_id")
					Dim telephone As String = address.Get("telephone")
					Dim entity_id As Int = address.Get("entity_id")
					Dim lastname As String = address.Get("lastname")
					Dim parent_id As Int = address.Get("parent_id")
					Dim street As List = address.Get("street")
					For Each colstreet As String In street
					Next
					Dim region As String = address.Get("region")
					Dim country_id As String = address.Get("country_id")
					Dim email As String = address.Get("email")
					Dim region_code As String = address.Get("region_code")
					Dim method As String = shipping.Get("method")
					Dim items As List = colshipping_assignments.Get("items")
					For Each colitems As Map In items
						Dim tax_amount As Double = colitems.Get("tax_amount")
						Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
						Dim original_price As Int = colitems.Get("original_price")
						Dim free_shipping As Int = colitems.Get("free_shipping")
						Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
						Dim discount_amount As Int = colitems.Get("discount_amount")
						Dim tax_percent As Double = colitems.Get("tax_percent")
						Dim price_incl_tax As Double = Utilidades.FixNullDouble(colitems.Getdefault("price_incl_tax",0))
						Dim price As Int = colitems.Get("price")
						Dim product_id As Int = colitems.Get("product_id")
						Dim base_row_total As Int = colitems.Get("base_row_total")
						Dim sku As String = colitems.Get("sku")
						Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
						Dim weight As Int = colitems.Get("weight")
						Dim base_original_price As Int = colitems.Get("base_original_price")
						Dim row_weight As Int = colitems.Get("row_weight")
						Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
						Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
						Dim base_price_incl_tax As Double = colitems.Get("base_price_incl_tax")
						Dim no_discount As Int = colitems.Get("no_discount")
						Dim name As String = colitems.Get("name")
						Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
						Dim discount_percent As Int = colitems.Get("discount_percent")
						Dim order_id As Int = colitems.Get("order_id")
						Dim discount_tax_compensation_invoiced As Int = colitems.Get("discount_tax_compensation_invoiced")
						Dim created_at As String = colitems.Get("created_at")
						Dim qty_shipped As Int = colitems.Get("qty_shipped")
						Dim qty_ordered As Int = colitems.Get("qty_ordered")
						Dim row_total As Int = colitems.Get("row_total")
						Dim qty_canceled As Int = colitems.Get("qty_canceled")
						Dim product_option As Map = colitems.Get("product_option")
						Dim extension_attributes As Map = product_option.Get("extension_attributes")
						Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
						For Each colconfigurable_item_options As Map In configurable_item_options
							Dim option_value As Int = colconfigurable_item_options.Get("option_value")
							Dim option_id As String = colconfigurable_item_options.Get("option_id")
						Next
						Dim amount_refunded As Int = colitems.Get("amount_refunded")
						Dim updated_at As String = colitems.Get("updated_at")
						Dim base_price As Int = colitems.Get("base_price")
						Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
						Dim row_invoiced As Int = colitems.Get("row_invoiced")
						Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
						Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
						Dim store_id As Int = colitems.Get("store_id")
						Dim item_id As Int = colitems.Get("item_id")
						Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
						Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
						Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
						Dim product_type As String = colitems.Get("product_type")
						Dim qty_refunded As Int = colitems.Get("qty_refunded")
						Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
						Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
						Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
						Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
					Next
			
				Next
			End If
		
			Dim payment_additional_info As List = extension_attributes.Get("payment_additional_info")
			For Each colpayment_additional_info As Map In payment_additional_info
				Dim value As String = colpayment_additional_info.Get("value")
				Dim key As String = colpayment_additional_info.Get("key")
			Next
			Dim applied_taxes As List = extension_attributes.Get("applied_taxes")
			For Each colapplied_taxes As Map In applied_taxes
				Dim amount As Double = colapplied_taxes.Get("amount")
				Dim code As String = colapplied_taxes.Get("code")
				Dim base_amount As Double = colapplied_taxes.Get("base_amount")
				Dim title As String = colapplied_taxes.Get("title")
				Dim percent As Double = colapplied_taxes.Get("percent")
			Next
			Dim item_applied_taxes As List = extension_attributes.Get("item_applied_taxes")
			For Each colitem_applied_taxes As Map In item_applied_taxes
				Dim applied_taxes As List = colitem_applied_taxes.Get("applied_taxes")
				For Each colapplied_taxes As Map In applied_taxes
					Dim amount As Double = colapplied_taxes.Get("amount")
					Dim code As String = colapplied_taxes.Get("code")
					Dim base_amount As Double = colapplied_taxes.Get("base_amount")
					Dim title As String = colapplied_taxes.Get("title")
					Dim percent As Double = colapplied_taxes.Get("percent")
				Next
				Dim Type As String = colitem_applied_taxes.Get("type")
			Next
			Dim converting_from_quote As String = extension_attributes.Get("converting_from_quote")
		
		End If
		Dim shipping_description As String = colitems.Get("shipping_description")
		Dim store_to_order_rate As Int = colitems.Getdefault("store_to_order_rate",-1)
		Dim shipping_amount As Int = colitems.Getdefault("shipping_amount",-1)
		Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
		Dim subtotal_invoiced As Int = colitems.Getdefault("subtotal_invoiced",-1)
		Dim base_to_order_rate As Int = colitems.Getdefault("base_to_order_rate",-1)
		Dim base_subtotal As Int = colitems.Getdefault("base_subtotal",-1)
		Dim protect_code As String = colitems.Get("protect_code")
		Dim customer_dob As String = colitems.Get("customer_dob")
		Dim base_total_due As Int = colitems.Getdefault("base_total_due",-1)
		Dim base_subtotal_incl_tax As Double = colitems.Getdefault("base_subtotal_incl_tax",-1)
		Dim customer_id As Int = colitems.Getdefault("customer_id",-1)
		Dim customer_group_id As Int = colitems.Getdefault("customer_group_id",-1)
		Dim discount_invoiced As Int = colitems.Getdefault("discount_invoiced",-1)
		Dim order_currency_code As String = colitems.Get("order_currency_code")
		Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Dim customer_gender As Int = colitems.Getdefault("customer_gender",-1)
		Dim shipping_incl_tax As Int = colitems.Getdefault("shipping_incl_tax",-1)
		Dim base_shipping_invoiced As Int = colitems.Getdefault("base_shipping_invoiced",-1)
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	Dim page_size As Int = search_criteria.Get("page_size")


End Sub

Sub EnvioDatosAPIMagentoInformacionPedidos(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	


	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/?searchCriteria[pageSize] = 0
	&searchCriteria[filterGroups][0][filters][0][field]=store_id&
	searchCriteria[filterGroups][0][filters][0][value]=32,35,37,38&
	searchCriteria[filterGroups][0][filters][0][condition_type]=in"$

	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=30000
	
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

Private Sub btnInfoPedidoClienteMagento_Click
	
	Dim msa As Object = xui.Msgbox2Async("Selecciona tipo de identificador","Tipo identificador", "ID Pedido","Cancelar", "Numero pedido", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt=xui.DialogResponse_Cancel Then Return
	Dim TipoIdentificador As String
	If rInt=xui.DialogResponse_Positive Then
		TipoIdentificador="ID Pedido"
	Else
		TipoIdentificador="Numero Pedido"
	End If
	
	Dialog.Title=$"Indica ${TipoIdentificador}"$
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	InputDlg.ConfigureForNumbers(False,False)

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
	Dim IDSel As Int=InputDlg.Text
	
	wait for(EnvioDatosAPIMagentoInformacionPedidoCliente(tk,TipoIdentificador, IDSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	TextAreaHTTPResponse.Text=sResp
	
	Dim mDataPedido As Map
	mDataPedido.Initialize
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim tax_amount As Double = root.Getdefault("tax_amount",0)
	Dim tax_invoiced As Double = root.Getdefault("tax_invoiced",0)
	Dim customer_note_notify As Int = root.Getdefault("customer_note_notify",0)
	Dim shipping_discount_amount As Int = root.Getdefault("shipping_discount_amount",0)
	Dim base_discount_tax_compensation_invoiced As Int = root.Getdefault("base_discount_tax_compensation_invoiced",0)
	Dim customer_firstname As String = root.Get("customer_firstname")
	mDataPedido.Put("customer_firstname",customer_firstname)
	Dim discount_amount As Double = root.Getdefault("discount_amount",0)
	Dim billing_address As Map = root.Get("billing_address")
	Log("billing_address" & billing_address)
	mDataPedido.Put("billing_address",billing_address)
	Dim firstname As String = billing_address.Get("firstname")
	Dim address_type As String = billing_address.Get("address_type")
	Dim customer_address_id As Int = billing_address.Getdefault("customer_address_id",0)
	Dim city As String = billing_address.Get("city")
	Dim postcode As String = billing_address.Get("postcode")
	Dim region_id As Int = billing_address.Getdefault("region_id",0)
	Dim telephone As String = billing_address.Get("telephone")
	'Dim entity_id As Int = billing_address.Get("entity_id")
	Dim IDbilling_address As Int = billing_address.Getdefault("entity_id",0)
	Dim lastname As String = billing_address.Get("lastname")
	Dim parent_id As Int = billing_address.Getdefault("parent_id",0)
	Dim street As List = billing_address.Get("street")
	For Each colstreet As String In street
		Log(colstreet)
		Dim Calle As String=colstreet
	Next
	Dim region As String = billing_address.Get("region")
	Dim country_id As String = billing_address.Get("country_id")
	Dim email As String = billing_address.Get("email")
	Dim region_code As String = billing_address.Get("region_code")
	Dim total_paid As Double = root.Getdefault("total_paid",0)
	Dim increment_id As String = root.Get("increment_id")  ' numero de pedido "largo"
	Dim payment As Map = root.Get("payment")
	Log("payment" & payment)
	Dim base_amount_ordered As Double = payment.Getdefault("base_amount_ordered",0)
	Dim amount_paid As Double = payment.Getdefault("amount_paid",0)
	Dim method As String = payment.Get("method")
	Dim cc_last4 As String = payment.Get("cc_last4")
	Dim shipping_captured As Int = payment.Getdefault("shipping_captured",0)
	Dim account_status As String = payment.Get("account_status")
	Dim amount_ordered As Double = payment.Getdefault("amount_ordered",0)
	'Dim entity_id As Int = payment.Get("entity_id")
	Dim PaymentID As Int = payment.Getdefault("entity_id",0)
	Dim base_amount_paid As Double = payment.Getdefault("base_amount_paid",0)
	Dim shipping_amount As Int = payment.Getdefault("shipping_amount",0)
	Dim additional_information As List = payment.Get("additional_information")
	For Each coladditional_information As String In additional_information
		Log(coladditional_information)
	Next
	Dim base_shipping_amount As Int = payment.Getdefault("base_shipping_amount",0)
	Dim parent_id As Int = payment.Get("parent_id")
	Dim base_shipping_captured As Int = payment.Getdefault("base_shipping_captured",0)
	Dim state As String = root.Get("state")
	Dim base_shipping_tax_amount As Int = root.Getdefault("base_shipping_tax_amount",0)
	Dim base_grand_total As Double = root.Getdefault("base_grand_total",0)
	Dim billing_address_id As Int = root.Get("billing_address_id")
	Dim customer_lastname As String = root.Get("customer_lastname")
	Dim quote_id As Int = root.Getdefault("quote_id",0)
	Dim shipping_invoiced As Int = root.Getdefault("shipping_invoiced",0)
	Dim discount_tax_compensation_amount As Int = root.Getdefault("discount_tax_compensation_amount",0)
	Dim weight As Int = root.Getdefault("weight",0)
	'Dim entity_id As Int = root.Get("entity_id")
	Dim IDPedido As Int = root.Get("entity_id")
	Dim base_total_invoiced As Double = root.Getdefault("base_total_invoiced",0)
	Dim base_shipping_amount As Int = root.Getdefault("base_shipping_amount",0)
	Dim base_subtotal_invoiced As Int = root.Getdefault("base_subtotal_invoiced",0)
	Dim applied_rule_ids As String = root.Get("applied_rule_ids")
	Dim subtotal_incl_tax As Double = root.Getdefault("subtotal_incl_tax",0)
	Dim base_shipping_discount_tax_compensation_amnt As Int = root.Getdefault("base_shipping_discount_tax_compensation_amnt",0)
	Dim subtotal As Int = root.Getdefault("subtotal",0)
	Dim base_shipping_incl_tax As Int = root.Getdefault("base_shipping_incl_tax",0)
	Dim customer_email As String = root.Get("customer_email")
	Dim base_discount_invoiced As Int = root.Getdefault("base_discount_invoiced",0)
	Dim total_invoiced As Double = root.Getdefault("total_invoiced",0)
	Dim base_to_global_rate As Int = root.Getdefault("base_to_global_rate",0)
	Dim customer_is_guest As Int = root.Getdefault("customer_is_guest",0)
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Dim tax_amount As Double = colitems.Getdefault("tax_amount",0)
		Dim tax_invoiced As Double = colitems.Getdefault("tax_invoiced",0)
		Dim original_price As Int = colitems.Getdefault("original_price",0)
		Dim free_shipping As Int = colitems.Getdefault("free_shipping",0)
		Dim base_discount_tax_compensation_invoiced As Int = colitems.Getdefault("base_discount_tax_compensation_invoiced",0)
		Dim discount_amount As Double = colitems.Getdefault("discount_amount",0)
		Dim tax_percent As Double = colitems.Getdefault("tax_percent",0)
		Dim price_incl_tax As Double = colitems.Getdefault("price_incl_tax",0)
		Dim price As Double = colitems.Getdefault("price",0)
		Dim product_id As Int = colitems.Get("product_id")
		Dim base_row_total As Double = colitems.Getdefault("base_row_total",0)
		Dim sku As String = colitems.Get("sku")
		Dim discount_tax_compensation_amount As Int = colitems.Getdefault("discount_tax_compensation_amount",0)
		Dim weight As Int = colitems.Get("weight")
		Dim base_original_price As Int = colitems.Getdefault("base_original_price",0)
		Dim row_weight As Int = colitems.Get("row_weight")
		Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim base_amount_refunded As Int = colitems.Getdefault("base_amount_refunded",0)
		Dim base_price_incl_tax As Double = colitems.Getdefault("base_price_incl_tax",0)
		Dim no_discount As Int = colitems.Getdefault("no_discount",0)
		Dim name As String = colitems.Get("name")
		Dim base_discount_invoiced As Int = colitems.Getdefault("base_discount_invoiced",0)
		Dim discount_percent As Int = colitems.Getdefault("discount_percent",0)
		Dim order_id As Int = colitems.Get("order_id")
		Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
		Dim created_at As String = colitems.Get("created_at")
		Dim qty_shipped As Int = colitems.Getdefault("qty_shipped",0)
		Dim qty_ordered As Int = colitems.Getdefault("qty_ordered",0)
		Dim row_total As Int = colitems.Getdefault("row_total",0)
		Dim qty_canceled As Int = colitems.Get("qty_canceled")
		Dim product_option As Map = IIf(colitems.Get("product_option")=Null,CreateMap("":""),colitems.Get("product_option"))
		Dim extension_attributes As Map = product_option.Get("extension_attributes")
		If extension_attributes.IsInitialized Then
			Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
			Dim Talla As String
			For Each colconfigurable_item_options As Map In configurable_item_options
				Dim option_value As Int = colconfigurable_item_options.Get("option_value")
				Dim option_id As String = colconfigurable_item_options.Get("option_id")
				If option_id=142 Then
					Talla=mSQL.ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",Array As String(option_value))
				End If
			Next
		End If
		Dim amount_refunded As Int = colitems.Get("amount_refunded")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim base_price As Int = colitems.Get("base_price")
		Dim qty_invoiced As Int = colitems.Getdefault("qty_invoiced",0)
		Dim row_invoiced As Int = colitems.Getdefault("row_invoiced",0)
		Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
		Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim store_id As Int = colitems.Getdefault("store_id",0)
		Dim item_id As Int = colitems.Get("item_id")
		Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
		Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
		Dim product_type As String = colitems.Get("product_type")
		Dim qty_refunded As Int = colitems.Get("qty_refunded")
		Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
		Dim is_qty_decimal As Int = colitems.Getdefault("is_qty_decimal",0)
		Dim discount_invoiced As Int = colitems.Getdefault("discount_invoiced",0)
		Dim base_tax_invoiced As Double = colitems.Getdefault("base_tax_invoiced",0)
	Next
	Dim global_currency_code As String = root.Get("global_currency_code")
	Dim status As String = root.Get("status")
	Dim is_virtual As Int = root.Getdefault("is_virtual",0)
	Dim base_total_invoiced_cost As Int = root.Getdefault("base_total_invoiced_cost",0)
	Dim discount_tax_compensation_invoiced As Int = root.Getdefault("discount_tax_compensation_invoiced",0)
	Dim status_histories As List = root.Get("status_histories")
	Dim store_currency_code As String = root.Get("store_currency_code")
	Dim created_at As String = root.Get("created_at")
	Dim total_item_count As Int = root.Get("total_item_count")
	Dim shipping_tax_amount As Int = root.Getdefault("shipping_tax_amount",0)
	Dim store_to_base_rate As Int = root.Getdefault("store_to_base_rate",0)
	Dim updated_at As String = root.Get("updated_at")
	Dim base_shipping_discount_amount As Int = root.Getdefault("base_shipping_discount_amount",0)
	Dim store_name As String = root.Get("store_name")
	Dim grand_total As Double = root.Get("grand_total")
	Dim base_currency_code As String = root.Get("base_currency_code")
	Dim base_total_paid As Double = root.Getdefault("base_total_paid",0)
	Dim base_tax_amount As Double = root.Getdefault("base_tax_amount",0)
	Dim store_id As Int = root.Get("store_id")
	Dim shipping_discount_tax_compensation_amount As Int = root.Getdefault("shipping_discount_tax_compensation_amount",0)
	Dim total_due As Int = root.Get("total_due")
	Dim total_qty_ordered As Int = root.Getdefault("total_qty_ordered",0)
	Dim base_discount_amount As Int = root.Getdefault("base_discount_amount",0)
	Dim extension_attributes As Map = root.Get("extension_attributes")
	Log("extension_attributes" & extension_attributes)
	Dim pgw As Map = extension_attributes.Get("pgw")
	Log("pgw" & pgw)
	Dim extrinsic As List = pgw.Get("extrinsic")
	Dim extra_data As List = pgw.Get("extra_data")
	Dim posr_data As List = pgw.Get("posr_data")
	Dim originator As List = pgw.Get("originator")
	Dim entity_id As String = pgw.Get("entity_id")
	Dim poom_data As List = pgw.Get("poom_data")
	Dim po_number As String=pgw.Get("po_number")
	Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
	For Each colshipping_assignments As Map In shipping_assignments
		Dim shipping As Map = colshipping_assignments.Get("shipping")
		Log("shipping" & shipping)
		Dim total As Map = shipping.Get("total")
		Dim shipping_amount As Int = total.Get("shipping_amount")
		Dim base_shipping_amount As Int = total.Get("base_shipping_amount")
		Dim shipping_discount_tax_compensation_amount As Int = total.Getdefault("shipping_discount_tax_compensation_amount",0)
		Dim shipping_discount_amount As Int = total.Getdefault("shipping_discount_amount",0)
		Dim base_shipping_discount_amount As Int = total.Getdefault("base_shipping_discount_amount",0)
		Dim base_shipping_discount_tax_compensation_amnt As Int = total.Getdefault("base_shipping_discount_tax_compensation_amnt",0)
		Dim base_shipping_incl_tax As Int = total.Getdefault("base_shipping_incl_tax",0)
		Dim shipping_invoiced As Int = total.Getdefault("shipping_invoiced",0)
		Dim shipping_incl_tax As Int = total.Getdefault("shipping_incl_tax",0)
		Dim base_shipping_invoiced As Int = total.Getdefault("base_shipping_invoiced",0)
		Dim base_shipping_tax_amount As Int = total.Getdefault("base_shipping_tax_amount",0)
		Dim shipping_tax_amount As Int = total.Getdefault("shipping_tax_amount",0)
		Dim address As Map = shipping.Get("address")
		Dim firstname As String = address.Get("firstname")
		Dim address_type As String = address.Get("address_type")
		Dim customer_address_id As Int = address.Getdefault("customer_address_id",0)
		Dim city As String = address.Get("city")
		Dim postcode As String = address.Get("postcode")
		Dim region_id As Int = address.Getdefault("region_id",0)
		Dim telephone As String = address.Get("telephone")
		'Dim entity_id As Int = address.Get("entity_id")
		Dim IDAddress As Int = address.Getdefault("entity_id",0)
		Dim lastname As String = address.Get("lastname")
		Dim parent_id As Int = address.Getdefault("parent_id",0)
		Dim street As List = address.Get("street")
		For Each colstreet As String In street
		Next
		Dim region As String = address.Get("region")
		Dim country_id As String = address.Get("country_id")
		Dim email As String = address.Get("email")
		Dim region_code As String = address.Get("region_code")
		Dim method As String = shipping.Get("method")
		Dim items As List = colshipping_assignments.Get("items")
		For Each colitems As Map In items
			Log("colitems" & colitems)
'''			Dim tax_amount As Double = colitems.Get("tax_amount")
'''			Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
'''			Dim original_price As Int = colitems.Get("original_price")
'''			Dim free_shipping As Int = colitems.Get("free_shipping")
'''			Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
'''			Dim discount_amount As Double = colitems.Get("discount_amount")
'''			Dim tax_percent As Double = colitems.Get("tax_percent")
'''			Dim price_incl_tax As Double = Utilidades.FixNullDouble(colitems.Getdefault("price_incl_tax",0))
'''			Dim price As Double = colitems.Get("price")
'''			Dim product_id As Int = colitems.Get("product_id")
'''			Dim base_row_total As Double = colitems.Get("base_row_total")
'''			Dim sku As String = colitems.Get("sku")
'''			Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
'''			Dim weight As Int = colitems.Get("weight")
'''			Dim base_original_price As Int = colitems.Get("base_original_price")
'''			Dim row_weight As Int = colitems.Get("row_weight")
'''			Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
'''			Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
'''			Dim base_price_incl_tax As Double = colitems.Get("base_price_incl_tax")
'''			Dim no_discount As Int = colitems.Get("no_discount")
'''			Dim name As String = colitems.Get("name")
'''			Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
'''			Dim discount_percent As Int = colitems.Get("discount_percent")
'''			Dim order_id As Int = colitems.Get("order_id")
'''			Dim discount_tax_compensation_invoiced As Int = colitems.Get("discount_tax_compensation_invoiced")
'''			Dim created_at As String = colitems.Get("created_at")
'''			Dim qty_shipped As Int = colitems.Get("qty_shipped")
'''			Dim qty_ordered As Int = colitems.Get("qty_ordered")
'''			Dim row_total As Int = colitems.Get("row_total")
'''			Dim qty_canceled As Int = colitems.Get("qty_canceled")
'''			Dim product_option As Map = IIf(colitems.Get("product_option")=Null,CreateMap("":""),colitems.Get("product_option"))
'''			Dim extension_attributes As Map = product_option.Get("extension_attributes")
'''			Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
'''			For Each colconfigurable_item_options As Map In configurable_item_options
'''				Dim option_value As Int = colconfigurable_item_options.Get("option_value")
'''				Dim option_id As String = colconfigurable_item_options.Get("option_id")
'''			Next
'''			Dim amount_refunded As Int = colitems.Get("amount_refunded")
'''			Dim updated_at As String = colitems.Get("updated_at")
'''			Dim base_price As Int = colitems.Get("base_price")
'''			Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
'''			Dim row_invoiced As Int = colitems.Get("row_invoiced")
'''			Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
'''			Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
'''			Dim store_id As Int = colitems.Get("store_id")
'''			Dim item_id As Int = colitems.Get("item_id")
'''			Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
'''			Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
'''			Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
'''			Dim product_type As String = colitems.Get("product_type")
'''			Dim qty_refunded As Int = colitems.Get("qty_refunded")
'''			Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
'''			Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
'''			Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
'''			Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Next
	Next
	Dim carts As List = extension_attributes.Get("carts")
	If extension_attributes.ContainsKey("payment_additional_info") Then
		Dim payment_additional_info As List = extension_attributes.Get("payment_additional_info")
		For Each colpayment_additional_info As Map In payment_additional_info
			Dim value As String = colpayment_additional_info.Get("value")
			Dim key As String = colpayment_additional_info.Get("key")
		Next
	End If
	If extension_attributes.ContainsKey("applied_taxes") Then
		Dim applied_taxes As List = extension_attributes.Get("applied_taxes")
		For Each colapplied_taxes As Map In applied_taxes
			Dim amount As Double = colapplied_taxes.Get("amount")
			Dim code As String = colapplied_taxes.Get("code")
			Dim base_amount As Double = colapplied_taxes.Get("base_amount")
			Dim title As String = colapplied_taxes.Get("title")
			Dim percent As Double = colapplied_taxes.Get("percent")
		Next
	End If
	If extension_attributes.ContainsKey("item_applied_taxes") Then
		Dim item_applied_taxes As List = extension_attributes.Get("item_applied_taxes")
		For Each colitem_applied_taxes As Map In item_applied_taxes
			Dim applied_taxes As List = colitem_applied_taxes.Get("applied_taxes")
			For Each colapplied_taxes As Map In applied_taxes
				Dim amount As Double = colapplied_taxes.Get("amount")
				Dim code As String = colapplied_taxes.Get("code")
				Dim base_amount As Double = colapplied_taxes.Get("base_amount")
				Dim title As String = colapplied_taxes.Get("title")
				Dim percent As Double = colapplied_taxes.Get("percent")
			Next
			Dim Type As String = colitem_applied_taxes.Get("type")
		Next
	End If
	Dim converting_from_quote As String = extension_attributes.Get("converting_from_quote")
	Dim contacts As List = extension_attributes.Get("contacts")
	Dim shipping_description As String = root.Get("shipping_description")
	Dim store_to_order_rate As Int = root.Getdefault("store_to_order_rate",0)
	Dim shipping_amount As Int = root.Getdefault("shipping_amount",0)
	Dim base_discount_tax_compensation_amount As Int = root.Getdefault("base_discount_tax_compensation_amount",0)
	Dim subtotal_invoiced As Int = root.Getdefault("subtotal_invoiced",0)
	Dim base_to_order_rate As Int = root.Getdefault("base_to_order_rate",0)
	Dim base_subtotal As Int = root.Getdefault("base_subtotal",0)
	Dim protect_code As String = root.Get("protect_code")
	Dim customer_dob As String = root.Get("customer_dob")
	Dim base_total_due As Int = root.Getdefault("base_total_due",0)
	Dim base_subtotal_incl_tax As Double = root.Getdefault("base_subtotal_incl_tax",0)
	Dim customer_id As Int = root.Getdefault("customer_id",0)
	Dim customer_group_id As Int = root.Getdefault("customer_group_id",0)
	Dim discount_invoiced As Int = root.Getdefault("discount_invoiced",0)
	Dim order_currency_code As String = root.Get("order_currency_code")
	Dim base_tax_invoiced As Double = root.Getdefault("base_tax_invoiced",0)
	Dim customer_gender As Int = root.Getdefault("customer_gender",0)
	Dim shipping_incl_tax As Int = root.Getdefault("shipping_incl_tax",0)
	Dim base_shipping_invoiced As Int = root.Getdefault("base_shipping_invoiced",0)

	

End Sub

Sub EnvioDatosAPIMagentoInformacionPedidoCliente(Token As String, TipoIdentificador As String, IDSel As Int) As ResumableSub
	
	If TipoIdentificador="ID Pedido" Then
		Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/${IDSel}"$
	Else
		Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/search?
	searchCriteria[filterGroups][0][filters][0][field]=increment_id&
	searchCriteria[filterGroups][0][filters][0][value]=${IDSel}&
	searchCriteria[filterGroups][0][filters][0][condition_type]=eq"$
	End If

	Dim job As HttpJob
	job.Initialize("",Me)

	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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

Sub SeleccionarCliente As ResumableSub
	Dialog.Title="Indica ID Cliente"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return -1
	Dim IDClienteSel As Int=InputDlg.Text
	Return IDClienteSel
End Sub

Private Sub MostrarDireccionesClienteMagento(IDClienteSel As Int)
	

	
	Dialog.Title="Selecciona Tipo Dirección"
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
		
	Dim lstOpciones As List=Array As String("Default Shipping Adress","Default Billing Address","Todas")
	
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
	
	Select Case Opcion
		Case "Default Shipping Adress"
			MostrarDireccionDefectoEnvioCliente(IDClienteSel)
		Case "Default Billing Address"
			MostrarDireccionDefectoFacturacionCliente(IDClienteSel)
		Case "Todas"
			MostrarTodasDireccionesCliente(IDClienteSel)
			Return
	End Select
End Sub

Sub MostrarDireccionDefectoEnvioCliente(IDClienteSel As Int) As ResumableSub
	JamLoadingIndicator1.MensajeLoading="Cargando Direccion Defecto Envío Cliente..."
	JamLoadingIndicator1.Show
	Wait For(CargaDireccionDefectoEnvioCliente(IDClienteSel)) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Direccion Defecto Envío Cliente B2B")) complete (rObj As Object)
		Return
	End If
	
'	jamTableView1.AbrirCamposBuilder
'	Return False
	
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BDireccionesCliente.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsDireccionesClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BDireccionesCliente")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsDireccionesClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsDireccionesClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If

End Sub

Sub EnvioDatosAPIMagentoBusquedaDireccionesCliente(Token As String, IDClienteSel As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customers/${IDClienteSel}/Addreses"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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

Sub CargaDireccionDefectoEnvioCliente(IDClienteSel As Int) As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BDireccionesCliente")
	wait for(EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente(tk, IDClienteSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Direccion Defecto Envio Cliente B2B")) complete (rObj As Object)
		Return False
	End If
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim firstname As String = root.Get("firstname")
	Dim city As String = root.Get("city")
	Dim region_id As Int = root.Get("region_id")
	Dim postcode As String = root.Get("postcode")
	Dim telephone As String = root.Get("telephone")
	Dim default_shipping As String = root.Get("default_shipping")
	Dim lastname As String = root.Get("lastname")
	Dim code As String
	Dim customer_code As String
	Dim custom_attributes As List = root.Get("custom_attributes")
	For Each colcustom_attributes As Map In custom_attributes
		Dim value As String = colcustom_attributes.Get("value")
		Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
		If attribute_code="code" Then code=value
		If attribute_code="customer_code" Then customer_code=value
	Next
	Dim street As List = root.Get("street")
	For Each colstreet As String In street
		
	Next
	Dim Street1 As String=street.Get(0)
	Dim street2 As String
	Dim street3 As String
	If street.Size>1 Then street2=street.Get(1)
	If street.Size>2 Then street3=street.Get(2)
	root.Put("Street1",Street1)
	root.Put("Street2",street2)
	root.Put("Street3",street3)
	Dim company As String = root.Get("company")
	Dim id As Int = root.Get("id")
	Dim customer_id As Int = root.Get("customer_id")
	Dim mregion As Map = root.Get("region")
	Dim region_id As Int = mregion.Get("region_id")
	Dim region As String = mregion.Get("region")
	root.Put("region",region)
	Dim region_code As String = mregion.Get("region_code")
	Dim country_id As String = root.Get("country_id")
	
	root.Put("default_billing","")
	root.Put("code",code)
	root.Put("customer_code",customer_code)
	
	
	'Utilidades.LogStringCrearTablaDesdeMap("tblB2BDireccionesCliente",root,"Id")
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BDireccionesCliente",Array(root))
	Return True
End Sub

Sub EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente(Token As String, IDClienteSel As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customers/${IDClienteSel}/shippingAddress"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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


Sub MostrarDireccionDefectoFacturacionCliente(IDClienteSel As Int) As ResumableSub
	JamLoadingIndicator1.MensajeLoading="Cargando Direccion Defecto Facturación Cliente..."
	JamLoadingIndicator1.Show
	Wait For(CargaDireccionDefectoFacturacionCliente(IDClienteSel)) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Direccion Defecto Facturacion Cliente B2B")) complete (rObj As Object)
		Return
	End If
	
'	jamTableView1.AbrirCamposBuilder
'	Return False
	
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BDireccionesCliente.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsDireccionesClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BDireccionesCliente")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsDireccionesClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsDireccionesClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If

End Sub

Sub CargaDireccionDefectoFacturacionCliente(IDClienteSel As Int) As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BDireccionesCliente")
	wait for(EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente(tk, IDClienteSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Direccion Defecto Facturacion Cliente B2B")) complete (rObj As Object)
		Return False
	End If
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim firstname As String = root.Get("firstname")
	Dim city As String = root.Get("city")
	Dim region_id As Int = root.Get("region_id")
	Dim postcode As String = root.Get("postcode")
	Dim telephone As String = root.Get("telephone")
	Dim default_shipping As String = root.Get("default_shipping")
	Dim lastname As String = root.Get("lastname")
	Dim code As String
	Dim customer_code As String
	Dim custom_attributes As List = root.Get("custom_attributes")
	For Each colcustom_attributes As Map In custom_attributes
		Dim value As String = colcustom_attributes.Get("value")
		Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
		If attribute_code="code" Then code=value
		If attribute_code="customer_code" Then customer_code=value
	Next
	Dim street As List = root.Get("street")
	For Each colstreet As String In street
		
	Next
	Dim Street1 As String=street.Get(0)
	Dim street2 As String
	Dim street3 As String
	If street.Size>1 Then street2=street.Get(1)
	If street.Size>2 Then street3=street.Get(2)
	root.Put("Street1",Street1)
	root.Put("Street2",street2)
	root.Put("Street3",street3)
	Dim company As String = root.Get("company")
	Dim id As Int = root.Get("id")
	Dim customer_id As Int = root.Get("customer_id")
	Dim mregion As Map = root.Get("region")
	Dim region_id As Int = mregion.Get("region_id")
	Dim region As String = mregion.Get("region")
	root.Put("region",region)
	Dim region_code As String = mregion.Get("region_code")
	Dim country_id As String = root.Get("country_id")
	
	root.Put("default_shipping","")
	root.Put("code",code)
	root.Put("customer_code",customer_code)
	
	'Utilidades.LogStringCrearTablaDesdeMap("tblB2BDireccionesCliente",root,"Id")
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BDireccionesCliente",Array(root))
	Return True
End Sub

Sub EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente(Token As String, IDClienteSel As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customers/${IDClienteSel}/billingAddress"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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

Sub MostrarTodasDireccionesCliente(IDClienteSel As Int) As ResumableSub
	JamLoadingIndicator1.MensajeLoading="Cargando Direcciones Cliente..."
	JamLoadingIndicator1.Show
	Wait For(CargaInfoDireccionesClienteMagento(IDClienteSel)) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Direcciones Cliente B2B")) complete (rObj As Object)
		Return
	End If
	
'	jamTableView1.AbrirCamposBuilder
'	Return False
	
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BDireccionesCliente.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsDireccionesClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BDireccionesCliente")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsDireccionesClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsDireccionesClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If

End Sub

Sub MostrarValoresAtributoSizeProductos As ResumableSub
	JamLoadingIndicator1.MensajeLoading="Cargando Valores Atributo Size Productos..."
	JamLoadingIndicator1.Show
	Wait For(CargaValoresAtributoSizeProductos) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargandoValores Atributo Size Productos B2B")) complete (rObj As Object)
		Return
	End If
	
'	jamTableView1.AbrirCamposBuilder
'	Return False
	
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BProductAttributeSize.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsDireccionesClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BAtributoSizeProducts order by label")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsDireccionesClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsDireccionesClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If

End Sub

Sub CargaValoresAtributoSizeProductos As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BAtributoSizeProducts")
	wait for(EnvioDatosAPIMagentoValoresAtributoSizeProductos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Valores atributo size (talla) B2B")) complete (rObj As Object)
		Return False
	End If
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As List = parser.NextArray
'	For Each colroot As Map In root
'		Dim label As String = colroot.Get("label")
'		Dim value As String = colroot.Get("value")
'	Next

	
	'Utilidades.LogStringCrearTablaDesdeMap("tblB2BAtributoSizeProducts",colroot,"Id")
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BAtributoSizeProducts",root)
	Return True
End Sub
'
'Sub CargaValoresAtributoUnidadMedidaProductos As ResumableSub
'	'mSQL.ExecNonQuery("delete from tblB2BAtributoUnidadMedidaProductos")
'	wait for(EnvioDatosAPIMagentoValoresAtributoUnidadMedidaProductos(tk)) complete (sResp As String)
'	If sResp.StartsWith("ERROR") Then
'		JamLoadingIndicator1.Close
'		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Valores atributo unidad medida B2B")) complete (rObj As Object)
'		Return False
'	End If
'	
''	Dim parser As JSONParser
''	parser.Initialize(sResp)
''	Dim root As List = parser.NextArray
''	For Each colroot As Map In root
''		Dim label As String = colroot.Get("label")
''		Dim value As String = colroot.Get("value")
''	Next.
'
'' unidad_medida --> attribute_id=298
'	
'	Dim parser As JSONParser
'	parser.Initialize(sResp)
'	Dim root As Map = parser.NextObject
'	Dim total_count As Int = root.Get("total_count")
'	Dim items As List = root.Get("items")
'	For Each colitems As Map In items
'		Dim is_html_allowed_on_front As String = colitems.Get("is_html_allowed_on_front")
'		Dim is_visible_in_grid As String = colitems.Get("is_visible_in_grid")
'		Dim frontend_labels As List = colitems.Get("frontend_labels")
'		For Each colfrontend_labels As Map In frontend_labels
'			Dim store_id As Int = colfrontend_labels.Get("store_id")
'			Dim label As String = colfrontend_labels.Get("label")
'		Next
'		Dim backend_type As String = colitems.Get("backend_type")
'		Dim is_visible_on_front As String = colitems.Get("is_visible_on_front")
'		Dim is_wysiwyg_enabled As String = colitems.Get("is_wysiwyg_enabled")
'		Dim is_unique As String = colitems.Get("is_unique")
'		Dim used_for_sort_by As String = colitems.Get("used_for_sort_by")
'		Dim entity_type_id As String = colitems.Get("entity_type_id")
'		Dim frontend_input As String = colitems.Get("frontend_input")
'		Dim is_user_defined As String = colitems.Get("is_user_defined")
'		Dim validation_rules As List = colitems.Get("validation_rules")
'		Dim is_filterable_in_grid As String = colitems.Get("is_filterable_in_grid")
'		Dim is_used_for_promo_rules As String = colitems.Get("is_used_for_promo_rules")
'		Dim is_required As String = colitems.Get("is_required")
'		Dim used_in_product_listing As String = colitems.Get("used_in_product_listing")
'		Dim scope As String = colitems.Get("scope")
'		Dim options As List = colitems.Get("options")
'		Dim is_filterable As String = colitems.Get("is_filterable")
'		Dim is_comparable As String = colitems.Get("is_comparable")
'		Dim is_searchable As String = colitems.Get("is_searchable")
'		Dim is_visible_in_advanced_search As String = colitems.Get("is_visible_in_advanced_search")
'		Dim is_visible As String = colitems.Get("is_visible")
'		Dim is_filterable_in_search As String = colitems.Get("is_filterable_in_search")
'		Dim is_used_in_grid As String = colitems.Get("is_used_in_grid")
'		Dim default_frontend_label As String = colitems.Get("default_frontend_label")
'		Dim attribute_id As Int = colitems.Get("attribute_id")
'		Dim apply_to As List = colitems.Get("apply_to")
'		Dim position As Int = colitems.Get("position")
'		Dim attribute_code As String = colitems.Get("attribute_code")
'	Next
'	Dim search_criteria As Map = root.Get("search_criteria")
'	Dim filter_groups As List = search_criteria.Get("filter_groups")
'	For Each colfilter_groups As Map In filter_groups
'		Dim filters As List = colfilter_groups.Get("filters")
'		For Each colfilters As Map In filters
'			Dim field As String = colfilters.Get("field")
'			Dim condition_type As String = colfilters.Get("condition_type")
'			Dim value As String = colfilters.Get("value")
'		Next
'	Next
'
'
'	
'	Utilidades.LogStringCrearTablaDesdeMap("tblB2BAtributoUnidadMedidaProductos",items,"Id")
'	'Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BAtributoUnidadMedidaProductos",root)
'	Return True
'End Sub



Sub EnvioDatosAPIMagentoValoresAtributoSizeProductos(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes/size/options"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
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

'Sub EnvioDatosAPIMagentoValoresAtributoUnidadMedidaProductos(Token As String) As ResumableSub
'
'	Dim job As HttpJob
'	job.Initialize("",Me)
'	
'	'Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes/unidad_medida/options"$
'	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes?searchCriteria[filterGroups][0][filters][0][field]=attribute_code&searchCriteria[filterGroups][0][filters][0][value]=unidad_medida"$
'
'	
'	job.Download(sQueryAPI)
'
'	job.GetRequest.SetHeader("Accept","application/json")
'	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
''	job.GetRequest.SetContentType("application/json")
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
'End Sub

'
'Sub EnvioDatosAPIMagento(IDDatoEnvioBuscado As String, Token As String) As ResumableSub
'
'	Dim job As HttpJob
'	job.Initialize("",Me)
'
'	
'	Dim URLAPIReq As String="https://proingroup-webstorepre.com/admin?id=" & IDDatoEnvioBuscado & "&idioma=es"
'	job.Download(URLAPIReq)
'
'	job.GetRequest.SetHeader("Accept","application/json")
'	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
'	job.GetRequest.Timeout=15000
'	
'	Wait For (job) JobDone(j As HttpJob)
'
'	If j.Success Then
'		Log("job.response.StatusCode: " & job.response.StatusCode)
'		'Log(j.GetString)
'		Dim sRespuestaWebService As String=j.GetString
'		j.Release
'		Return sRespuestaWebService
'	Else
'		
'		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
'		j.Release
'		Return sErrorJobResponse
'	End If


Sub MostrarPedidos As ResumableSub
	TextAreaHTTPResponse.Text=""
	JamLoadingIndicator1.MensajeLoading="Cargando Pedidos..."
	JamLoadingIndicator1.Show
	Wait For(CargaPedidos) complete (Success As Boolean)
	If Not(Success) Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Pedidos (Orders) B2B")) complete (rObj As Object)
		Return
	End If
'	
'	jamTableView1.AbrirCamposBuilder
'	Return False
	
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BPedidos2.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsPedidos As ResultSet=mSQL.ExecQuery("select * from tblB2BOrders")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsPedidos)
	Wait For (rSub) complete (mResultSetData As Map)
	rsPedidos.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If

End Sub

Sub CargaPedidos As ResumableSub
	
	wait for(CargaValoresAtributoSizeProductos) complete (Success As Boolean)
	If Not(Success) Then Return False

	mSQL.ExecNonQuery("delete from tblB2BOrders")
	wait for(EnvioDatosAPIMagentoInformacionPedidos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		JamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Pedidos B2B")) complete (rObj As Object)
		Return False
	End If
	
	TextAreaHTTPResponse.Text=sResp
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Log("ColItems: " & colitems)
'		Dim tax_amount As Double = colitems.Get("tax_amount")
'		Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
'		Dim customer_note_notify As Int = colitems.Get("customer_note_notify")
'		Dim shipping_discount_amount As Int = colitems.Get("shipping_discount_amount")
'		Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim po_number As String
		If extension_attributes.IsInitialized Then
			Dim pgw As Map=extension_attributes.Get("pgw")
			If pgw.IsInitialized Then
				po_number=pgw.Getdefault("po_number","")
'				Dim extrinsic As Map=pgw.Get("extrinsic")
'				Log(extrinsic)
'				Dim posr_data As Map=pgw.Get("posr_data")
'				Log(posr_data)
'				Dim originator As Map=pgw.Get("originator")
'				Log(originator)
'				Dim poom_data As Map=pgw.Get("poom_data")
'				Log(poom_data)
			End If
			
		End If
		colitems.put("po_number",po_number)
		Dim customer_firstname As String = colitems.Get("customer_firstname")
'		Dim discount_amount As Int = colitems.Get("discount_amount")
		Dim billing_address As Map = colitems.Get("billing_address")
		Dim firstname As String = billing_address.Get("firstname")
		Dim address_type As String = billing_address.Get("address_type")
		Dim customer_address_id As Int = billing_address.Getdefault("customer_address_id",-1)
		Dim city As String = billing_address.Get("city")
		Dim postcode As String = billing_address.Get("postcode")
		Dim region_id As Int = billing_address.Getdefault("region_id",0)
		Dim telephone As String = billing_address.Get("telephone")
		Dim entity_id As Int = billing_address.Get("entity_id")
		Dim lastname As String = billing_address.Get("lastname")
		Dim parent_id As Int = billing_address.Get("parent_id")
		Dim street As List = billing_address.Get("street")
		For Each colstreet As String In street
			Log("colstreet:" & colstreet)
		Next
		Dim region As String = billing_address.Get("region")
		Dim country_id As String = billing_address.Get("country_id")
		Dim email As String = billing_address.Get("email")
		Dim region_code As String = billing_address.Get("region_code")
		Dim total_paid As Double = colitems.Getdefault("total_paid",0)
		Dim increment_id As String = colitems.Get("increment_id")
		Dim payment As Map = colitems.Get("payment")
		Dim base_amount_ordered As Double = payment.Getdefault("base_amount_ordered",0)
		Dim amount_paid As Double = payment.Getdefault("amount_paid",0)
		Dim method As String = payment.Get("method")
		Dim cc_last4 As String = payment.Get("cc_last4")
'		Dim shipping_captured As Int = payment.Get("shipping_captured")
		Dim account_status As String = payment.Get("account_status")
		Dim amount_ordered As Double = payment.Getdefault("amount_ordered",0)
		Dim entity_id As Int = payment.Get("entity_id")
		Dim base_amount_paid As Double = payment.Getdefault("base_amount_paid",0)
		Dim shipping_amount As Int = payment.Getdefault("shipping_amount",0)
		Dim additional_information As List = payment.Get("additional_information")
		For Each coladditional_information As String In additional_information
		Next
		Dim base_shipping_amount As Int = payment.Getdefault("base_shipping_amount",0)
		Dim parent_id As Int = payment.Get("parent_id")
'		Dim base_shipping_captured As Int = payment.Get("base_shipping_captured")
		Dim state As String = colitems.Get("state")
'		Dim base_shipping_tax_amount As Int = colitems.Get("base_shipping_tax_amount")
		Dim base_grand_total As Double = colitems.Get("base_grand_total")
		Dim billing_address_id As Int = colitems.Get("billing_address_id")
		Dim customer_lastname As String = colitems.Get("customer_lastname")
		Dim quote_id As Int = colitems.Getdefault("quote_id",0)
		Dim shipping_invoiced As Int = colitems.Getdefault("shipping_invoiced",-1)
		Dim discount_tax_compensation_amount As Int = colitems.Getdefault("discount_tax_compensation_amount",0)
		Dim weight As Int = colitems.Getdefault("weight",0)
		Dim entity_id As Int = colitems.Get("entity_id")
		Dim IDPedido As Int = colitems.Get("entity_id")
		Dim base_total_invoiced As Double = colitems.Getdefault("base_total_invoiced",0)
		Dim base_shipping_amount As Int = colitems.Get("base_shipping_amount")
		Dim base_subtotal_invoiced As Int = colitems.Getdefault("base_subtotal_invoiced",0)
		Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim subtotal_incl_tax As Double = colitems.Getdefault("subtotal_incl_tax",0)
		Dim base_shipping_discount_tax_compensation_amnt As Int = colitems.Getdefault("base_shipping_discount_tax_compensation_amnt",0)
		Dim subtotal As Int = colitems.Get("subtotal")
		Dim base_shipping_incl_tax As Int = colitems.Getdefault("base_shipping_incl_tax",0)
		Dim customer_email As String = colitems.Get("customer_email")
		Dim base_discount_invoiced As Int = colitems.Getdefault("base_discount_invoiced",0)
		Dim total_invoiced As Double = colitems.Getdefault("total_invoiced",0)
		Dim base_to_global_rate As Int = colitems.Get("base_to_global_rate")
		Dim customer_is_guest As Int = colitems.Get("customer_is_guest")
		Dim items As List = colitems.Get("items")
		For Each colitems As Map In items
			colitems.Put("po_number",po_number)
			Dim tax_amount As Double = colitems.Getdefault("tax_amount",0)
			Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
			Dim original_price As Int = colitems.Get("original_price")
			Dim free_shipping As Int = colitems.Get("free_shipping")
			Dim base_discount_tax_compensation_invoiced As Int = colitems.Getdefault("base_discount_tax_compensation_invoiced",0)
			Dim discount_amount As Int = colitems.Getdefault("discount_amount",0)
			Dim tax_percent As Double = colitems.Getdefault("tax_percent",0)
			Dim price_incl_tax As Double = Utilidades.FixNullDouble(colitems.Getdefault("price_incl_tax",0))
			Dim price As Int = colitems.Get("price")
			Dim product_id As Int = colitems.Getdefault("product_id",-1)
			Dim base_row_total As Int = colitems.Get("base_row_total")
			Dim sku As String = colitems.Get("sku")
			Dim discount_tax_compensation_amount As Int = colitems.Getdefault("discount_tax_compensation_amount",0)
			Dim weight As Int = colitems.Getdefault("weight",-1)
			Dim base_original_price As Int = colitems.GetDEFAULT("base_original_price",0)
			Dim row_weight As Int = colitems.Get("row_weight")
			Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
			Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
			Dim base_price_incl_tax As Double = colitems.Getdefault("base_price_incl_tax",-1)
			Dim no_discount As Int = colitems.Get("no_discount")
			Dim name As String = colitems.Get("name")
			Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
			Dim discount_percent As Int = colitems.Getdefault("discount_percent",0)
			Dim order_id As Int = colitems.Get("order_id")
			Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
			Dim created_at As String = colitems.Get("created_at")
			Dim qty_shipped As Int = colitems.Get("qty_shipped")
			Dim qty_ordered As Int = colitems.Get("qty_ordered")
			Dim row_total As Int = colitems.Get("row_total")
			Dim qty_canceled As Int = colitems.Get("qty_canceled")
			Dim product_option As Map = colitems.Get("product_option")
			Dim Talla As String
			If product_option.IsInitialized Then
				Dim extension_attributes As Map = product_option.Get("extension_attributes")
				Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
				For Each colconfigurable_item_options As Map In configurable_item_options
					Dim option_value As Int = colconfigurable_item_options.Get("option_value")
					Dim option_id As String = colconfigurable_item_options.Get("option_id")
					If option_id=142 Then
						Talla=mSQL.ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",Array As String(option_value))
					End If
				Next
			End If
			colitems.Put("Talla",Talla)
			Dim amount_refunded As Int = colitems.Get("amount_refunded")
			Dim updated_at As String = colitems.Get("updated_at")
			Dim base_price As Int = colitems.Get("base_price")
			Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
			Dim row_invoiced As Int = colitems.Get("row_invoiced")
			Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
			Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
			Dim store_id As Int = colitems.Getdefault("store_id",0)
			Dim item_id As Int = colitems.Get("item_id")
			Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
			Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
			Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
			Dim product_type As String = colitems.Get("product_type")
			Dim qty_refunded As Int = colitems.Get("qty_refunded")
			Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
			Dim is_qty_decimal As Int = colitems.Getdefault("is_qty_decimal",0)
			Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
			Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Next
		Dim global_currency_code As String = colitems.Get("global_currency_code")
		Dim status As String = colitems.Get("status")
		Dim is_virtual As Int = colitems.Getdefault("is_virtual",0)
		Dim base_total_invoiced_cost As Int = colitems.Getdefault("base_total_invoiced_cost",-1)
		Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
		Dim status_histories As List = colitems.Get("status_histories")
		Dim store_currency_code As String = colitems.Get("store_currency_code")
		Dim created_at As String = colitems.Get("created_at")
		Dim total_item_count As Int = colitems.Getdefault("total_item_count",-1)
		Dim shipping_tax_amount As Int = colitems.Getdefault("shipping_tax_amount",-1)
		Dim store_to_base_rate As Int = colitems.Getdefault("store_to_base_rate",1)
		Dim updated_at As String = colitems.Get("updated_at")
		Dim base_shipping_discount_amount As Int = colitems.Getdefault("base_shipping_discount_amount",-1)
		Dim store_name As String = colitems.Get("store_name")
		Dim grand_total As Double = colitems.Getdefault("grand_total",-1)
		Dim base_currency_code As String = colitems.Get("base_currency_code")
		Dim base_total_paid As Double = colitems.Getdefault("base_total_paid",-1)
		Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim store_id As Int = colitems.Getdefault("store_id",0)
		Dim shipping_discount_tax_compensation_amount As Int = colitems.Getdefault("shipping_discount_tax_compensation_amount",-1)
		Dim total_due As Int = colitems.Getdefault("total_due",-1)
		Dim total_qty_ordered As Int = colitems.Getdefault("total_qty_ordered",-1)
		Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		If extension_attributes.IsInitialized Then
			Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
			If shipping_assignments.IsInitialized Then
''''				For Each colshipping_assignments As Map In shipping_assignments
''''					Dim shipping As Map = colshipping_assignments.Get("shipping")
''''					Dim total As Map = shipping.Get("total")
''''					Dim shipping_amount As Int = total.Get("shipping_amount")
''''					Dim base_shipping_amount As Int = total.Get("base_shipping_amount")
''''					Dim shipping_discount_tax_compensation_amount As Int = total.Get("shipping_discount_tax_compensation_amount")
''''					Dim shipping_discount_amount As Int = total.Get("shipping_discount_amount")
''''					Dim base_shipping_discount_amount As Int = total.Get("base_shipping_discount_amount")
''''					Dim base_shipping_discount_tax_compensation_amnt As Int = total.Get("base_shipping_discount_tax_compensation_amnt")
''''					Dim base_shipping_incl_tax As Int = total.Get("base_shipping_incl_tax")
''''					Dim shipping_invoiced As Int = total.Get("shipping_invoiced")
''''					Dim shipping_incl_tax As Int = total.Get("shipping_incl_tax")
''''					Dim base_shipping_invoiced As Int = total.Get("base_shipping_invoiced")
''''					Dim base_shipping_tax_amount As Int = total.Get("base_shipping_tax_amount")
''''					Dim shipping_tax_amount As Int = total.Get("shipping_tax_amount")
''''					Dim address As Map = shipping.Get("address")
''''					Dim firstname As String = address.Get("firstname")
''''					Dim address_type As String = address.Get("address_type")
''''					Dim customer_address_id As Int = address.Get("customer_address_id")
''''					Dim city As String = address.Get("city")
''''					Dim postcode As String = address.Get("postcode")
''''					Dim region_id As Int = address.Get("region_id")
''''					Dim telephone As String = address.Get("telephone")
''''					Dim entity_id As Int = address.Get("entity_id")
''''					Dim lastname As String = address.Get("lastname")
''''					Dim parent_id As Int = address.Get("parent_id")
''''					Dim street As List = address.Get("street")
''''					For Each colstreet As String In street
''''					Next
''''					Dim region As String = address.Get("region")
''''					Dim country_id As String = address.Get("country_id")
''''					Dim email As String = address.Get("email")
''''					Dim region_code As String = address.Get("region_code")
''''					Dim method As String = shipping.Get("method")
''''					Dim items As List = colshipping_assignments.Get("items")
''''					For Each colitems As Map In items
''''						Dim tax_amount As Double = colitems.Get("tax_amount")
''''						Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
''''						Dim original_price As Int = colitems.Get("original_price")
''''						Dim free_shipping As Int = colitems.Get("free_shipping")
''''						Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
''''						Dim discount_amount As Int = colitems.Get("discount_amount")
''''						Dim tax_percent As Double = colitems.Get("tax_percent")
''''						Dim price_incl_tax As Double = Utilidades.FixNullDouble(colitems.Getdefault("price_incl_tax",0))
''''						Dim price As Int = colitems.Get("price")
''''						Dim product_id As Int = colitems.Get("product_id")
''''						Dim base_row_total As Int = colitems.Get("base_row_total")
''''						Dim sku As String = colitems.Get("sku")
''''						Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
''''						Dim weight As Int = colitems.Get("weight")
''''						Dim base_original_price As Int = colitems.Get("base_original_price")
''''						Dim row_weight As Int = colitems.Get("row_weight")
''''						Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
''''						Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
''''						Dim base_price_incl_tax As Double = colitems.Get("base_price_incl_tax")
''''						Dim no_discount As Int = colitems.Get("no_discount")
''''						Dim name As String = colitems.Get("name")
''''						Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
''''						Dim discount_percent As Int = colitems.Get("discount_percent")
''''						Dim order_id As Int = colitems.Get("order_id")
''''						Dim discount_tax_compensation_invoiced As Int = colitems.Get("discount_tax_compensation_invoiced")
''''						Dim created_at As String = colitems.Get("created_at")
''''						Dim qty_shipped As Int = colitems.Get("qty_shipped")
''''						Dim qty_ordered As Int = colitems.Get("qty_ordered")
''''						Dim row_total As Int = colitems.Get("row_total")
''''						Dim qty_canceled As Int = colitems.Get("qty_canceled")
''''						Dim product_option As Map = colitems.Get("product_option")
''''						Dim extension_attributes As Map = product_option.Get("extension_attributes")
''''						Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
''''						For Each colconfigurable_item_options As Map In configurable_item_options
''''							Dim option_value As Int = colconfigurable_item_options.Get("option_value")
''''							Dim option_id As String = colconfigurable_item_options.Get("option_id")
''''						Next
''''						Dim amount_refunded As Int = colitems.Get("amount_refunded")
''''						Dim updated_at As String = colitems.Get("updated_at")
''''						Dim base_price As Int = colitems.Get("base_price")
''''						Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
''''						Dim row_invoiced As Int = colitems.Get("row_invoiced")
''''						Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
''''						Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
''''						Dim store_id As Int = colitems.Get("store_id")
''''						Dim item_id As Int = colitems.Get("item_id")
''''						Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
''''						Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
''''						Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
''''						Dim product_type As String = colitems.Get("product_type")
''''						Dim qty_refunded As Int = colitems.Get("qty_refunded")
''''						Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
''''						Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
''''						Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
''''						Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
''''					Next
''''			
''''				Next
			End If
		
			Dim payment_additional_info As List = extension_attributes.Get("payment_additional_info")
			If payment_additional_info.IsInitialized Then
				For Each colpayment_additional_info As Map In payment_additional_info
					Dim value As String = colpayment_additional_info.Get("value")
					Dim key As String = colpayment_additional_info.Get("key")
				Next
			End If
			Dim applied_taxes As List = extension_attributes.Get("applied_taxes")
			If applied_taxes.IsInitialized Then
				For Each colapplied_taxes As Map In applied_taxes
					Dim amount As Double = colapplied_taxes.Get("amount")
					Dim code As String = colapplied_taxes.Get("code")
					Dim base_amount As Double = colapplied_taxes.Get("base_amount")
					Dim title As String = colapplied_taxes.Get("title")
					Dim percent As Double = colapplied_taxes.Get("percent")
				Next
			End If
			Dim item_applied_taxes As List = extension_attributes.Get("item_applied_taxes")
			If item_applied_taxes.IsInitialized Then
				For Each colitem_applied_taxes As Map In item_applied_taxes
					Dim applied_taxes As List = colitem_applied_taxes.Get("applied_taxes")
					For Each colapplied_taxes As Map In applied_taxes
						Dim amount As Double = colapplied_taxes.Get("amount")
						Dim code As String = colapplied_taxes.Get("code")
						Dim base_amount As Double = colapplied_taxes.Get("base_amount")
						Dim title As String = colapplied_taxes.Get("title")
						Dim percent As Double = colapplied_taxes.Get("percent")
					Next
					Dim Type As String = colitem_applied_taxes.Get("type")
				Next
			End If
			Dim converting_from_quote As String = extension_attributes.Get("converting_from_quote")
		
			Dim pgw As Map=extension_attributes.Get("pgw")
		
		End If
		Dim shipping_description As String = colitems.Get("shipping_description")
		Dim store_to_order_rate As Int = colitems.Getdefault("store_to_order_rate",-1)
		Dim shipping_amount As Int = colitems.Getdefault("shipping_amount",-1)
		Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
		Dim subtotal_invoiced As Int = colitems.Getdefault("subtotal_invoiced",-1)
		Dim base_to_order_rate As Int = colitems.Getdefault("base_to_order_rate",-1)
		Dim base_subtotal As Int = colitems.Getdefault("base_subtotal",-1)
		Dim protect_code As String = colitems.Get("protect_code")
		Dim customer_dob As String = colitems.Get("customer_dob")
		Dim base_total_due As Int = colitems.Getdefault("base_total_due",-1)
		Dim base_subtotal_incl_tax As Double = colitems.Getdefault("base_subtotal_incl_tax",-1)
		Dim customer_id As Int = colitems.Getdefault("customer_id",-1)
		Dim customer_group_id As Int = colitems.Getdefault("customer_group_id",-1)
		Dim discount_invoiced As Int = colitems.Getdefault("discount_invoiced",-1)
		Dim order_currency_code As String = colitems.Get("order_currency_code")
		Dim base_tax_invoiced As Double = colitems.Getdefault("base_tax_invoiced",0)
		Dim customer_gender As Int = colitems.Getdefault("customer_gender",-1)
		Dim shipping_incl_tax As Int = colitems.Getdefault("shipping_incl_tax",-1)
		Dim base_shipping_invoiced As Int = colitems.Getdefault("base_shipping_invoiced",-1)
		

		'Utilidades.LogStringCrearTablaDesdeMap("tblB2BOrders",colitems,"Id")
		Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BOrders",items)
		
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	Dim page_size As Int = search_criteria.Get("page_size")
	
	

	
	Return True
End Sub

#End Region

Private Sub B4XComboBoxTablasB2B_SelectedIndexChanged (Index As Int)
	Dim ItemSeleccionado As String=B4XComboBoxTablasB2B.cmbBox.Items.Get(Index)
	Select Case ItemSeleccionado
		Case ""
			jamTableView1.LimpiarTabla
			TextAreaHTTPResponse.Text=""
		Case "Stores"
			MostrarListaStoresMagento
		Case "Grupos Cliente"	
			MostrarListaGruposClienteMagento
		Case "Clientes"
			MostrarListaClientesMagento
		Case "Direcciones Cliente"
			Wait For(SeleccionarCliente) complete (IDClienteSel As Int)
			If IDClienteSel=-1 Then Return
			MostrarDireccionesClienteMagento(IDClienteSel)
		Case "Productos"
			MostrarListaProductosMagento
		Case "Valores Atributo size (Tallas Productos)"
			MostrarValoresAtributoSizeProductos
		Case "Pedidos"
			MostrarPedidos
		Case "Categorias Productos"
			MostrarListaCategoriasMagento
			
	End Select
End Sub

Private Sub B4XComboBoxStores_SelectedIndexChanged (Index As Int)
	
End Sub



Private Sub MostrarListaCategoriasMagento
	
	JamLoadingIndicator1.MensajeLoading="Cargando Lista Categorias..."
	JamLoadingIndicator1.Show
	Wait For(CargaListaCategoriasMagento) complete (Success As Boolean)
	JamLoadingIndicator1.Close
	If Not(Success) Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando categorias B2B")) complete (rObj As Object)
		Return
	End If
	
'	JamLoadingIndicator1.Close
'	jamTableView1.AbrirCamposBuilder
'	Return

	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaB2BProductos.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		JamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Dim rsClientes As ResultSet=mSQL.ExecQuery("select * from tblB2BCategorias")
	Dim rSub As ResumableSub=jamTableView1.setdata(rsClientes)
	Wait For (rSub) complete (mResultSetData As Map)
	rsClientes.close
	JamLoadingIndicator1.Close
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If
End Sub


Private Sub CargaListaCategoriasMagento As ResumableSub
	

	mSQL.ExecNonQuery("delete from tblB2BCategoriasProductos")

	wait for(EnvioDatosAPIMagentoInformacionCategoriasProductos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False
	
	Log(sResp)

	Return True
End Sub

Sub EnvioDatosAPIMagentoInformacionCategoriasProductos(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	


	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/categories/list"$

	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=30000
	
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