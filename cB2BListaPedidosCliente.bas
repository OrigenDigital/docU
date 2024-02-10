B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
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
	
	Public PermisoUsuarioModulo As String
	Private jamLoadingIndicator1 As JamLoadingIndicator
	
	Private tk As  String
	
	Type TipoDatosCabeceraPedidoB2B (IDPedido As Int, PedidoPunchout As Boolean, Pedido As String, IDTienda As Int, NombreTienda As String,FechaCreacion As Long, FechaActualizacion As Long, _
	 OrdenCompra As String , EmailComprador As String, NombreUsuarioComprador As String, ApellidoUsuarioComprador As String, _
	IDCliente As Int , CodigoClienteERP As String , NombreCliente As String, _ 
	IDGRP As Int , CodigoGRPERP As String , NombreGRP As String, _
	IDDireccionEnvio As Int , CodigoDireccionEnvioERP As String , NombreDireccionEnvio, DireccionEnvio, _
	IDDireccionFacturacion As String , NombreDireccionFacturacion As String, DireccionFacturacion As String, _
	TotalQtyPedida As Int, TotalQtyEnviada As Int, TotalQtyPendienteEnvio As Int , TotalQtyFacturada As Int, TotalQtyPendienteFacturar As Int, _
	Moneda As String, _
	ImporteTotalSinIVA As Double, ImporteTotalIVA As Double, ImporteTotalFacturadoSinIVA As Double, ImporteTotalFacturadoIVA As Double,EstadoPedido As String)
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	If mSQL.IsInitialized Then mSQL.Close
	#If debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#end if
	
	Show
End Sub

Public Sub Show
	'If frm.IsInitialized=False Then
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	frm.RootPane.LoadLayout("scrB2BListaPedidosCliente")
	Sleep(0)
	
	frm.Title=Main.PrefijoTitleForms & "Lista Pedidos Cliente B2B"

	CreacionTablasSQLite

''Usar las 2 siguientes lineas para abrir el CampoBuilder		
'	jamTableView1.AbrirCamposBuilder
'	Return
	
	' EJEMPLOS de MENUS
		
'	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
'	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
'		
'	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003),jamTableView1.MenuBarLinea)
'	jamTableView1.AddContextMenuItemSeparator
'	jamTableView1.AddContextMenuItemFontAwesomeText("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003))
'		
'	jamTableView1.AddContextMenuItemSeparator
'	Dim img As Image
'	img.InitializeSample(File.DirAssets,"navision.png",24,24)
'	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
'	jamTableView1.AddContextMenuItemImage("Articulo NAV","VerArticuloNAV",img)
'	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")


		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaPedidosClienteB2B.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
	
	'preferentemente, usar las funciones signarCellFactory
	
	jamTableView1.AsignarCellFactoryColumnaFecha(Array("FechaCreacion","FechaActualizacion"))
	
	' EJEMPLOS DE CELLFACTORIES
'	Dim CF As DatosCellFactoryJamTableView
'	CF.Initialize
'	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
'	CF.CellFactoryEnCallBack=False
'	CF.params=Null
'	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
'	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"))
'		
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

	
	frm.Show
	
	ActualizarDatos

End Sub


Sub SalirModulo
	If jamTableView1.IsInitialized Then
		jamTableView1.GuardarConfiguracionColumnasUsuario
	End If
	frm.Close
	MainMenu2.Show
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


Sub ActualizarDatos As ResumableSub
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	
	Wait For(CargaDatosCredenciales) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		wait for(Utilidades.MsgBoxXUI("Aviso","Error credenciales.")) complete (rObj As Object)
		Return False
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	Dim mData0 As Map=lstReg.Get(0)
	tk=mData0.GetValueAt(0)
	
	jamLoadingIndicator1.MensajeLoading="Cargando Stores..."

	Wait For(CargaListaStoresMagento) complete (Success As Boolean)
	If Not(Success) Then
		jamLoadingIndicator1.Close
		Return False
	End If

	wait for(CargaValoresAtributoSizeProductos) complete (Success As Boolean)
	If Not(Success) Then Return False
	
	jamLoadingIndicator1.MensajeLoading="Cargando Clientes..."
	Wait For(CargaListaClientesMagento) complete (Success As Boolean)
	If Not(Success) Then
		jamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Clientes B2B")) complete (rObj As Object)
		Return False
	End If
	
	jamLoadingIndicator1.MensajeLoading="Cargando Pedidos..."
	Wait For(CargaPedidos) complete (Success As Boolean)
	If Not(Success) Then
		jamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Pedidos (Orders) B2B")) complete (rObj As Object)
		Return False
	End If
	
	mSQL.ExecNonQuery("update tblB2BOrdersTotales set TotalQtyPendienteEnvio=TotalQtyPedida-TotalQtyEnviada")
	mSQL.ExecNonQuery("update tblB2BOrdersTotales set TotalQtyPendienteFacturar=TotalQtyPedida-TotalQtyFacturada")
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblB2BOrdersTotales")

	Dim rSub As ResumableSub=jamTableView1.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			jamLoadingIndicator1.close
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableView1.AbrirCamposBuilder
				Return False
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	jamLoadingIndicator1.close
	'fx.Msgbox(frm,"Datos actualizados.","Aviso")

	Return True


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
	, customer_code TEXT default'' , code TEXT default'', [region_id] INTEGER
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
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BOrders] ([item_id] INTEGER, [store_id] INTEGER default 0
	, [order_id] INTEGER,  [created_at] TEXT, [updated_at] TEXT
	, [po_number] TEXT default ''
	, [product_type] TEXT
	, [product_id] INTEGER default 0, parent_id TEXT default ''
	, line_number INTEGER
	, [product_option] TEXT
	, [sku] TEXT,[name] TEXT, [Talla] TEXT DEFAULT ''
	, [qty_ordered] INTEGER, [qty_canceled] INTEGER, [qty_refunded] INTEGER
	, [qty_shipped] INTEGER
	, [base_row_invoiced] INTEGER,[qty_invoiced] INTEGER, [row_invoiced] INTEGER
	, [base_original_price] REAL default 0, [original_price] REAL default 0, [base_price] REAL, [price] REAL default 0
	, [tax_percent] REAL default 0
	, [free_shipping] INTEGER default 0, [discount_amount] REAL default 0
	, [base_row_total] REAL, [row_total] REAL
	, [is_qty_decimal] INTEGER default 0)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
		
	mSQL.ExecNonQuery("drop table if exists tblB2BOrdersTotales")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BOrdersTotales] ([IDPedido] INTEGER
	, [IDTienda] INTEGER default 0, [NombreTienda] TEXT ''
	, [Pedido] TEXT,  [FechaCreacion] INTEGER, [FechaActualizacion] INTEGER
	, [OrdenCompra] TEXT default ''
	, [name] TEXT
	, [EmailComprador] TEXT, [NombreUsuarioComprador] TEXT, [ApellidoUsuarioComprador] TEXT
	, [IDGRPCliente] INTEGER default 0, [IDCliente] INTEGER default 0, [IDDireccionEnvioClienteERP] INTEGER default 0
	, [GRPClienteERP] TEXT default '', [ClienteERP] TEXT default '', [NombreClienteERP] TEXT, [NombreDireccionEnvioClienteERP] TEXT default '', IDDireccionFacturacion INTEGER default 0, NombreDireccionFacturacion TEXT default ''
	, [TotalQtyPedida] INTEGER, [TotalQtyEnviada] INTEGER, [TotalQtyPendienteEnvio] INTEGER default 0, [TotalQtyFacturada] INTEGER, [TotalQtyPendienteFacturar] INTEGER default 0
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BCategoriasProductos")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BCategoriasProductos] ([label] TEXT, [value] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
End Sub





Sub jamTableView1_AccionSalirJamTableView
	SalirModulo
End Sub

Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "Actualizar"
			ActualizarDatos
'		Case "SeleccionarCuentaRemitenteEmail"
'			wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
'			If rBool=False Then Return
	End Select
End Sub

' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
'		Case "VerPedidoCompraNAV"
'			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
'			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Pedido",FilaSel)
'			Dim PedidoSel As String=DCS.ValorCelda
'			Dim msa As Object = xui.Msgbox2Async("¿Ver el pedido de compra " & PedidoSel & " en NAVISION?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido compra",50, "No.", PedidoSel)
'			wait for(rSub) complete (success As Boolean)
'			If success=False Then
'				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el pedido seleccionado en Navision.","Error")
'				Wait For (msa) Msgbox_Result
'			End If
'			
'		Case "VerArticuloNAV"
'			Dim ArticuloSel As String
'			Dim FilaSeleccionada As Int=jamTableView1.IndicesFilasSeleccionadas.Get(0)
'			Dim lstInfoFila As List=jamTableView1.DatosRegistroIndiceFila(FilaSeleccionada)
'			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
'				If dc.Campo="Articulo" Then
'					ArticuloSel=dc.ValorCampo
'					Exit
'				End If
'			Next
'			If ArticuloSel="" Then
'				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Artículo.","Error")
'				Wait For (msa) Msgbox_Result
'				Return
'			End If
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
'			wait for(rSub) complete (success As Boolean)
'			If success=False Then
'				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
'				Wait For (msa) Msgbox_Result
'			End If

	End Select
End Sub


'EJEMPLO
Sub jamTableView1_CambioEnCeldaSeleccionada(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila
'	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
'	Dim Pedido As String=mPK.Get("Pedido")
'	Dim Linea As Int=mPK.Get("Linea")
'	Dim NombreProveedor As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"NombreProveedor")
'	Dim Articulo As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Articulo")
'	Dim Descripcion As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"DescripcionArticulo")
'	Dim Talla As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Talla")
'	Dim sTalla As String=IIf(Talla<>"","Talla: " & Talla,"")
'	Dim QtyPte As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"QtyPendiente")
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	Dim FechaPrometidaLong As Long=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"FechaPrometida")
'	Dim sFechaPrometida As String=IIf(FechaPrometidaLong>0,"Fecha Prometida: " & DateTime.Date(FechaPrometidaLong),"SIN FECHA PROMETIDA")
'	DateTime.DateFormat=DateFormatAnt
'	Dim PendienteSeguimiento As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"PendienteSeguimiento")
'	Dim sPendienteSeguimiento As String=IIf(PendienteSeguimiento=1,"PENDIENTE SEGUIMIENTO","")
'	
'	jamTableView1.TextoPanelInfoJamTableView="Pedido: " & Pedido & " Línea:" & Linea & "  " & NombreProveedor & "  " & Articulo & "  " & _
'		Descripcion & "  " & sTalla & "  QtyPte: " & QtyPte & "  " & sFechaPrometida & " " & sPendienteSeguimiento 
End Sub


'EJEMPLO
Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
'		Case "ExcluidoReclamacion"
'			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
	End Select
End Sub


'EJEMPLO para checkbox editable en la lista 
Sub AlternarExcluidoReclamacion(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Log(DatosCeldaSeleccionada)
'	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
'	Dim NuevoValor As Int
'	Select ValorActual
'		Case 0
'			NuevoValor=1
'			
'		Case 1
'			NuevoValor=0
'	End Select
'	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
'	Dim PedidoSel As String=mPK.Get("Pedido")
'	Dim LineaSel As String=mPK.Get("Linea")
'	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",Array(NuevoValor,PedidoSel, LineaSel))
'	jamTableView1.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
'	jamTableView1.SeleccionarCelda("ExcluidoReclamacion",DatosCeldaSeleccionada.Fila)
End Sub




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

Sub CargaValoresAtributoSizeProductos As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BAtributoSizeProducts")
	wait for(EnvioDatosAPIMagentoValoresAtributoSizeProductos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		jamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Valores atributo size (talla) B2B")) complete (rObj As Object)
		Return False
	End If
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As List = parser.NextArray
	For Each colroot As Map In root
		Dim label As String = colroot.Get("label")
		Dim value As String = colroot.Get("value")
	Next

	
	'Utilidades.LogStringCrearTablaDesdeMap("tblB2BAtributoSizeProducts",colroot,"Id")
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BAtributoSizeProducts",root)
	Return True
End Sub

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



Sub CargaPedidos As ResumableSub
	
	Dim Locale As AHLocale
	Locale.Initialize
	Dim AHNum As AHNumeric
	AHNum.InitializeNumber2(Locale)
	
	mSQL.ExecNonQuery("delete from tblB2BOrders")
	mSQL.ExecNonQuery("delete from tblB2BOrdersTotales")
	wait for(EnvioDatosAPIMagentoInformacionPedidos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		jamLoadingIndicator1.Close
		wait for(Utilidades.MsgBoxXUI("Aviso","Error cargando Pedidos B2B")) complete (rObj As Object)
		Return False
	End If
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd HH:mm:ss"
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	'Dim items As List = root.Get("items")
	Dim lstPedidos As List = root.Get("items")
	'For Each colitems As Map In items
	For Each mDataPedido As Map In lstPedidos
		'Log("ColItems: " & colitems)
		Log("mDataPedido: " & mDataPedido)
'		Dim tax_amount As Double = colitems.Get("tax_amount")
'		Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
'		Dim customer_note_notify As Int = colitems.Get("customer_note_notify")
'		Dim shipping_discount_amount As Int = colitems.Get("shipping_discount_amount")
'		Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
		Dim IDPedido, IDTienda As Int
		Dim NombreTienda As String
		Dim Pedido, FechaCreacion, FechaActualizacion As String
		Dim FechaCreacionLong, FechaActualizacionLong As Long
		Dim OrdenCompra As String
		Dim EmailComprador, NombreUsuarioComprador, ApellidoUsuarioComprador As String
		Dim IDCliente, IDGRPCliente As Int
		Dim ClienteERP, NombreClienteERP, GRPClienteERP, NombreGRPClienteERP As String
		Dim IDDireccionEnvioClienteERP As Int
		Dim NombreDireccionEnvioClienteERP As String
		Dim IDDireccionFacturacion As Int
		Dim NombreDireccionFacturacion As String
		Dim TotalQtyPedida, TotalQtyEnviada, TotalQtyFacturada As Double
		Dim StatusPedido As String
		
		'Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim extension_attributesPedido As Map = mDataPedido.Get("extension_attributes")
		Dim po_number As String
		Dim TipoIVAPedido As Double
		Dim ImporteIVAPedido As Double    ' .... NO TIENE SENTIDO UN TIPO DE IVA PARA TODO EL PEDIDO ....
		If extension_attributesPedido.IsInitialized Then
			Dim pgw As Map=extension_attributesPedido.Get("pgw")
			If pgw.IsInitialized Then
				po_number=pgw.Getdefault("po_number","")
				OrdenCompra=po_number
				Dim sExtraDataPgw As String=pgw.Get("extra_data")
				'Log(sExtraDataPgw)
				Try
					Dim parserExtraDataPgw As JSONParser
					parserExtraDataPgw.Initialize(sExtraDataPgw)
					Dim mExtraDataPgw As Map = parserExtraDataPgw.NextObject
					Dim TipoIVAPedido As Double=mExtraDataPgw.Get("tax_rate")
					Dim lstExtraDataPgwTaxDetails As List=mExtraDataPgw.Get("Tax Details")
					For Each mDataTaxesPedido As Map In lstExtraDataPgwTaxDetails
						'Log(mDataTaxesPedido)
						ImporteIVAPedido=mDataTaxesPedido.Get("Amount")
					Next
				Catch
					Log(LastException)
				End Try
'				Dim sTipoIVA As Object=mExtraData.Get("tax_rate")
'				Dim TipoIVA As Double=AHNum.Parse(sTipoIVA)
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
		'colitems.put("po_number",po_number)
		'Dim customer_firstname As String = colitems.Get("customer_firstname")
		Dim customer_firstname As String = mDataPedido.Get("customer_firstname")
		NombreUsuarioComprador=customer_firstname
'		Dim discount_amount As Int = colitems.Get("discount_amount")
		'Dim billing_address As Map = colitems.Get("billing_address")
		Dim billing_address As Map = mDataPedido.Get("billing_address")
		IDDireccionFacturacion=billing_address.Get("entity_id")
		Dim firstname As String = billing_address.Get("firstname")
		Dim address_type As String = billing_address.Get("address_type")
		Dim customer_address_id As Int = billing_address.Getdefault("customer_address_id",-1)
		IDDireccionEnvioClienteERP=customer_address_id
		'DireccionEnvioClienteERP=
		Dim city As String = billing_address.Get("city")
		Dim postcode As String = billing_address.Get("postcode")
		Dim region_id As Int = billing_address.Getdefault("region_id",0)
		Dim telephone As String = billing_address.Get("telephone")
		Dim entity_id As Int = billing_address.Get("entity_id")
		Dim lastname As String = billing_address.Get("lastname")
		Dim parent_id As Int = billing_address.Get("parent_id")
		Dim street As List = billing_address.Get("street")
		For Each colstreet As String In street
			'Log("colstreet:" & colstreet)
			NombreDireccionFacturacion=NombreDireccionFacturacion & " " & colstreet
		Next
		Dim region As String = billing_address.Get("region")
		Dim country_id As String = billing_address.Get("country_id")
		Dim email As String = billing_address.Get("email")
		Dim region_code As String = billing_address.Get("region_code")
		NombreDireccionFacturacion=NombreDireccionFacturacion & ", " & postcode & " " & city & " " & region & " " & country_id
		NombreDireccionFacturacion=NombreDireccionFacturacion.Trim
		Dim BillingExtensionAttributes As Map=billing_address.get("extension_attributes")
		'Dim total_paid As Double = colitems.Getdefault("total_paid",0)
		Dim total_paid As Double = mDataPedido.Getdefault("total_paid",0)
		'Dim increment_id As String = colitems.Get("increment_id")
		Dim increment_id As String = mDataPedido.Get("increment_id")
		Pedido=increment_id
		'Dim payment As Map = colitems.Get("payment")
		Dim payment As Map = mDataPedido.Get("payment")
		Dim base_amount_ordered As Double = payment.Getdefault("base_amount_ordered",0)
		Dim amount_paid As Double = payment.Getdefault("amount_paid",0)
		Dim method As String = payment.Get("method")
		Dim cc_last4 As String = payment.Get("cc_last4")
'		Dim shipping_captured As Int = payment.Get("shipping_captured")
		Dim account_status As String = payment.Get("account_status")
		Dim amount_ordered As Double = payment.Getdefault("amount_ordered",0)
		Dim PaymentEntity_id As Int = payment.Get("entity_id")
		Dim base_amount_paid As Double = payment.Getdefault("base_amount_paid",0)
		Dim shipping_amount As Int = payment.Getdefault("shipping_amount",0)
		Dim additional_information As List = payment.Get("additional_information")
		For Each coladditional_information As String In additional_information
		Next
		Dim base_shipping_amount As Double = payment.Getdefault("base_shipping_amount",0)
		Dim PaymentParent_id As Int = payment.Get("parent_id")
'		Dim base_shipping_captured As Int = payment.Get("base_shipping_captured")
		'Dim state As String = colitems.Get("state")
		Dim state As String = mDataPedido.Get("state")
'		Dim base_shipping_tax_amount As Int = colitems.Get("base_shipping_tax_amount")
		'Dim base_grand_total As Double = colitems.Get("base_grand_total")
		Dim base_grand_total As Double = mDataPedido.Get("base_grand_total")
		'Dim billing_address_id As Int = colitems.Get("billing_address_id")
		Dim billing_address_id As Int = mDataPedido.Get("billing_address_id")
		'Dim customer_lastname As String = colitems.Get("customer_lastname")
		Dim customer_lastname As String = mDataPedido.Get("customer_lastname")
		ApellidoUsuarioComprador=customer_lastname
		'Dim quote_id As Int = colitems.Getdefault("quote_id",0)
		Dim quote_id As Int = mDataPedido.Getdefault("quote_id",0)
		'Dim shipping_invoiced As Int = colitems.Getdefault("shipping_invoiced",-1)
		Dim shipping_invoiced As Int = mDataPedido.Getdefault("shipping_invoiced",-1)
		'Dim discount_tax_compensation_amount As Int = colitems.Getdefault("discount_tax_compensation_amount",0)
		Dim discount_tax_compensation_amount As Int = mDataPedido.Getdefault("discount_tax_compensation_amount",0)
		'Dim weight As Int = colitems.Getdefault("weight",0)
		Dim weight As Int = mDataPedido.Getdefault("weight",0)
		'Dim entity_id As Int = colitems.Get("entity_id")
		Dim entity_id As Int = mDataPedido.Get("entity_id")
		'Dim IDPedido As Int = colitems.Get("entity_id")
		Dim IDPedido As Int = mDataPedido.Get("entity_id")
		Log($"IDPedido: ${IDPedido}"$)
		'Dim base_total_invoiced As Double = colitems.Getdefault("base_total_invoiced",0)
		Dim base_total_invoiced As Double = mDataPedido.Getdefault("base_total_invoiced",0)
		'Dim base_shipping_amount As Int = colitems.Get("base_shipping_amount")
		Dim base_shipping_amount As Double = mDataPedido.Get("base_shipping_amount")
		'Dim base_subtotal_invoiced As Int = colitems.Getdefault("base_subtotal_invoiced",0)
		Dim base_subtotal_invoiced As Int = mDataPedido.Getdefault("base_subtotal_invoiced",0)
		'Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim applied_rule_ids As String = mDataPedido.Get("applied_rule_ids")
		'Dim subtotal_incl_tax As Double = colitems.Getdefault("subtotal_incl_tax",0)
		Dim subtotal_incl_tax As Double = mDataPedido.Getdefault("subtotal_incl_tax",0)
		'Dim base_shipping_discount_tax_compensation_amnt As Int = colitems.Getdefault("base_shipping_discount_tax_compensation_amnt",0)
		Dim base_shipping_discount_tax_compensation_amnt As Int = mDataPedido.Getdefault("base_shipping_discount_tax_compensation_amnt",0)
		'Dim subtotal As Int = colitems.Get("subtotal")
		Dim subtotal As Double = mDataPedido.Get("subtotal")
		'Dim base_shipping_incl_tax As Int = colitems.Getdefault("base_shipping_incl_tax",0)
		Dim base_shipping_incl_tax As Int = mDataPedido.Getdefault("base_shipping_incl_tax",0)
		'Dim customer_email As String = colitems.Get("customer_email")
		Dim customer_email As String = mDataPedido.Get("customer_email")
		EmailComprador=customer_email
		'Dim base_discount_invoiced As Int = colitems.Getdefault("base_discount_invoiced",0)
		Dim base_discount_invoiced As Int = mDataPedido.Getdefault("base_discount_invoiced",0)
		'Dim total_invoiced As Double = colitems.Getdefault("total_invoiced",0)
		Dim total_invoiced As Double = mDataPedido.Getdefault("total_invoiced",0)
		'Dim base_to_global_rate As Int = colitems.Get("base_to_global_rate")
		Dim base_to_global_rate As Int = mDataPedido.Get("base_to_global_rate")
		'Dim customer_is_guest As Int = colitems.Get("customer_is_guest")
		Dim customer_is_guest As Int = mDataPedido.Get("customer_is_guest")
		'Dim items As List = colitems.Get("items")
		Dim items As List = mDataPedido.Get("items")
		For Each colitems As Map In items
			
			Dim product_type As String = colitems.Get("product_type")
			If product_type="configurable" Then Continue
			
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
			
			TotalQtyPedida=TotalQtyPedida+qty_ordered
			TotalQtyEnviada=TotalQtyEnviada+qty_shipped
			
			Dim row_total As Int = colitems.Get("row_total")
			Dim qty_canceled As Int = colitems.Get("qty_canceled")
			Dim product_option As Map = colitems.Get("product_option")
			Dim Talla As String
			If product_option.IsInitialized Then
				Dim extension_attributesProductOption As Map = product_option.Get("extension_attributes")
				Dim configurable_item_options As List = extension_attributesProductOption.Get("configurable_item_options")
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
			Dim base_price As Double = colitems.Get("base_price")
			Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
			
			TotalQtyFacturada=TotalQtyFacturada+qty_invoiced
			
			Dim row_invoiced As Int = colitems.Get("row_invoiced")
			Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
			Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
			Dim store_id As Int = colitems.Getdefault("store_id",0)
			IDTienda=store_id
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
			Dim parent_item As Map=colitems.Get("parent_item")
			If parent_item.IsInitialized Then
				Log("parent_item: " & parent_item)
			End If
			Dim mColItemsExtensionAttributes As Map=colitems.Get("extension_attributes")  ' EN EL CASO DE PUNCHOUT, PARECE QUE HAN GRABADO AQUI LOS DATOS QUE TRANSMITE LA PO
			If mColItemsExtensionAttributes.IsInitialized Then
				Log(mColItemsExtensionAttributes)
			End If
		Next
		'Dim global_currency_code As String = colitems.Get("global_currency_code")
		Dim global_currency_code As String = mDataPedido.Get("global_currency_code")
		'Dim status As String = colitems.Get("status")
		Dim status As String = mDataPedido.Get("status")
		StatusPedido=status
		'Dim is_virtual As Int = colitems.Getdefault("is_virtual",0)
		Dim is_virtual As Int = mDataPedido.Getdefault("is_virtual",0)
		'Dim base_total_invoiced_cost As Int = colitems.Getdefault("base_total_invoiced_cost",-1)
		Dim base_total_invoiced_cost As Int = mDataPedido.Getdefault("base_total_invoiced_cost",-1)
		'Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
		Dim discount_tax_compensation_invoiced As Int = mDataPedido.Getdefault("discount_tax_compensation_invoiced",0)
		'Dim status_histories As List = colitems.Get("status_histories")
		Dim status_histories As List = mDataPedido.Get("status_histories")
		'Dim store_currency_code As String = colitems.Get("store_currency_code")
		Dim store_currency_code As String = mDataPedido.Get("store_currency_code")
		'Dim created_at As String = colitems.Get("created_at")
		Dim created_at As String = mDataPedido.Get("created_at")
		FechaCreacion=created_at
		FechaCreacionLong=DateTime.DateParse(FechaCreacion)
		'Dim total_item_count As Int = colitems.Getdefault("total_item_count",-1)
		Dim total_item_count As Int = mDataPedido.Getdefault("total_item_count",-1)
		'Dim shipping_tax_amount As Int = colitems.Getdefault("shipping_tax_amount",-1)
		Dim shipping_tax_amount As Int = mDataPedido.Getdefault("shipping_tax_amount",-1)
		'Dim store_to_base_rate As Int = colitems.Getdefault("store_to_base_rate",1)
		Dim store_to_base_rate As Int = mDataPedido.Getdefault("store_to_base_rate",1)
		'Dim updated_at As String = colitems.Get("updated_at")
		Dim updated_at As String = mDataPedido.Get("updated_at")
		FechaActualizacion=updated_at
		FechaActualizacionLong=DateTime.DateParse(FechaActualizacion)
		'Dim base_shipping_discount_amount As Int = colitems.Getdefault("base_shipping_discount_amount",-1)
		Dim base_shipping_discount_amount As Int = mDataPedido.Getdefault("base_shipping_discount_amount",-1)
		'Dim store_name As String = colitems.Get("store_name")
		'NombreTienda=store_name
		NombreTienda=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select name from tblB2BStores where id=?",Array As String(IDTienda)))
		'Dim grand_total As Double = colitems.Getdefault("grand_total",-1)
		Dim grand_total As Double = mDataPedido.Getdefault("grand_total",-1)
		'Dim base_currency_code As String = colitems.Get("base_currency_code")
		Dim base_currency_code As String = mDataPedido.Get("base_currency_code")
		'Dim base_total_paid As Double = colitems.Getdefault("base_total_paid",-1)
		Dim base_total_paid As Double = mDataPedido.Getdefault("base_total_paid",-1)
		'Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim base_tax_amount As Double = mDataPedido.Get("base_tax_amount")
		'Dim store_id As Int = colitems.Getdefault("store_id",0)
		Dim store_id As Int = mDataPedido.Getdefault("store_id",0)
		'Dim shipping_discount_tax_compensation_amount As Int = colitems.Getdefault("shipping_discount_tax_compensation_amount",-1)
		Dim shipping_discount_tax_compensation_amount As Int = mDataPedido.Getdefault("shipping_discount_tax_compensation_amount",-1)
		'Dim total_due As Int = colitems.Getdefault("total_due",-1)
		Dim total_due As Int = mDataPedido.Getdefault("total_due",-1)
		'Dim total_qty_ordered As Int = colitems.Getdefault("total_qty_ordered",-1)
		Dim total_qty_ordered As Int = mDataPedido.Getdefault("total_qty_ordered",-1)
		'Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim base_discount_amount As Int = mDataPedido.Get("base_discount_amount")
		'Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim extension_attributes As Map = mDataPedido.Get("extension_attributes")
		If extension_attributes.IsInitialized Then
			Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
			If shipping_assignments.IsInitialized Then
				Dim pgwShipping As Map=extension_attributes.Get("pgw")
				If pgw.IsInitialized Then
					
				End If
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
		'Dim shipping_description As String = colitems.Get("shipping_description")
		Dim shipping_description As String = mDataPedido.Get("shipping_description")
		'Dim store_to_order_rate As Int = colitems.Getdefault("store_to_order_rate",-1)
		Dim store_to_order_rate As Int = mDataPedido.Getdefault("store_to_order_rate",-1)
		'Dim shipping_amount As Int = colitems.Getdefault("shipping_amount",-1)
		Dim shipping_amount As Int = mDataPedido.Getdefault("shipping_amount",-1)
		'Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
		Dim base_discount_tax_compensation_amount As Int = mDataPedido.Getdefault("base_discount_tax_compensation_amount",-1)
		'Dim subtotal_invoiced As Int = colitems.Getdefault("subtotal_invoiced",-1)
		Dim subtotal_invoiced As Int = mDataPedido.Getdefault("subtotal_invoiced",-1)
		'Dim base_to_order_rate As Int = colitems.Getdefault("base_to_order_rate",-1)
		Dim base_to_order_rate As Int = mDataPedido.Getdefault("base_to_order_rate",-1)
		'Dim base_subtotal As Int = colitems.Getdefault("base_subtotal",-1)
		Dim base_subtotal As Int = mDataPedido.Getdefault("base_subtotal",-1)
		'Dim protect_code As String = colitems.Get("protect_code")
		Dim protect_code As String = mDataPedido.Get("protect_code")
		'Dim customer_dob As String = colitems.Get("customer_dob")
		Dim customer_dob As String = mDataPedido.Get("customer_dob")
		'Dim base_total_due As Int = colitems.Getdefault("base_total_due",-1)
		Dim base_total_due As Int = mDataPedido.Getdefault("base_total_due",-1)
		'Dim base_subtotal_incl_tax As Double = colitems.Getdefault("base_subtotal_incl_tax",-1)
		Dim base_subtotal_incl_tax As Double = mDataPedido.Getdefault("base_subtotal_incl_tax",-1)
		'Dim customer_id As Int = colitems.Getdefault("customer_id",-1)
		Dim customer_id As Int = mDataPedido.Getdefault("customer_id",-1)
		IDCliente=customer_id
		'ClienteERP=customer_id
		'Dim customer_group_id As Int = colitems.Getdefault("customer_group_id",-1)
		ClienteERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Code from tblB2BClientes where id=?",Array As String(IDCliente)))
		NombreClienteERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Company from tblB2BClientes where id=?",Array As String(IDCliente)))
		Dim customer_group_id As Int = mDataPedido.Getdefault("customer_group_id",-1)
		IDGRPCliente=customer_group_id
		'GRPClienteERP=Utilidades.FixNull(mSQL.ExecQuery2("select Code from tblB2BClientes where id=?",Array As String(IDCliente)))
		'Dim discount_invoiced As Int = colitems.Getdefault("discount_invoiced",-1)
		Dim discount_invoiced As Int = mDataPedido.Getdefault("discount_invoiced",-1)
		'Dim order_currency_code As String = colitems.Get("order_currency_code")
		Dim order_currency_code As String = mDataPedido.Get("order_currency_code")
		'Dim base_tax_invoiced As Double = colitems.Getdefault("base_tax_invoiced",0)
		Dim base_tax_invoiced As Double = mDataPedido.Getdefault("base_tax_invoiced",0)
		'Dim customer_gender As Int = colitems.Getdefault("customer_gender",-1)
		Dim customer_gender As Int = mDataPedido.Getdefault("customer_gender",-1)
		'Dim shipping_incl_tax As Int = colitems.Getdefault("shipping_incl_tax",-1)
		Dim shipping_incl_tax As Int = mDataPedido.Getdefault("shipping_incl_tax",-1)
		'Dim base_shipping_invoiced As Int = colitems.Getdefault("base_shipping_invoiced",-1)
		Dim base_shipping_invoiced As Int = mDataPedido.Getdefault("base_shipping_invoiced",-1)
		

		'Utilidades.LogStringCrearTablaDesdeMap("tblB2BOrders",colitems,"Id")
		Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblB2BOrders",items)
		
		Dim sSQL As String=$"Insert into tblB2BOrdersTotales (IDPedido
		, IDTienda, NombreTienda
		, Pedido, FechaCreacion, FechaActualizacion
		, OrdenCompra
		, name
		, EmailComprador, NombreUsuarioComprador, ApellidoUsuarioComprador
		, IDGRPCliente,IDCliente,IDDireccionEnvioClienteERP
		, GRPClienteERP, ClienteERP, NombreClienteERP, IDDireccionEnvioClienteERP, NombreDireccionEnvioClienteERP, IDDireccionFacturacion, NombreDireccionFacturacion
		, TotalQtyPedida, TotalQtyEnviada, TotalQtyFacturada) 
		values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
		"$
		
		mSQL.ExecNonQuery2(sSQL,Array As Object(IDPedido,IDTienda,NombreTienda,Pedido,FechaCreacionLong,FechaActualizacionLong, OrdenCompra,"", EmailComprador,NombreUsuarioComprador, _
		ApellidoUsuarioComprador,IDGRPCliente,IDCliente,IDDireccionEnvioClienteERP,GRPClienteERP,ClienteERP, NombreClienteERP, NombreDireccionEnvioClienteERP, NombreDireccionEnvioClienteERP, _
		IDDireccionFacturacion, NombreDireccionFacturacion, _
		TotalQtyPedida, TotalQtyEnviada, TotalQtyFacturada))
		
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	Dim page_size As Int = search_criteria.Get("page_size")
	
	
	DateTime.DateFormat=DateFormatAnt
	
	Return True
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
		'Log("job.response.StatusCode: " & job.response.StatusCode)
		'Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub


Private Sub CargaListaStoresMagento As ResumableSub
	mSQL.ExecNonQuery("delete from tblB2BStores")
	wait for(EnvioDatosAPIMagentoListaStores(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Or sResp.Contains("Uncaught ReflectionException") Then
		wait for(Utilidades.MsgBoxXUI("Aviso",$"Error cargando Stores B2B 
${sResp}"$)) complete (rObj As Object)
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
	'Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/store/storeConfigs"$
	
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

Sub jamTableView1_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim FilaSel As Int=DatosCeldaSeleccionada.Fila
	Dim IDPedidoSel As Int=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDPedido")
'	Dim DatosCabeceraPedidoCliente As TipoDatosCabeceraPedidoB2B
'	DatosCabeceraPedidoCliente.Initialize
'	DatosCabeceraPedidoCliente.ApellidoUsuarioComprador=jamTableView1.GetValorSQLCampoFila(FilaSel,"ApellidoUsuarioComprador")
'	DatosCabeceraPedidoCliente.ClienteERP=jamTableView1.GetValorSQLCampoFila(FilaSel,"ClienteERP")
'	DatosCabeceraPedidoCliente.IDDireccionEnvioClienteERP=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDDireccionEnvioClienteERP")
'	DatosCabeceraPedidoCliente.IDDireccionFacturacion=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDDireccionFacturacion")
'	DatosCabeceraPedidoCliente.EmailComprador=jamTableView1.GetValorSQLCampoFila(FilaSel,"EmailComprador")
'	DatosCabeceraPedidoCliente.FechaActualizacion=jamTableView1.GetValorSQLCampoFila(FilaSel,"FechaActualizacion")
'	DatosCabeceraPedidoCliente.FechaCreacion=jamTableView1.GetValorSQLCampoFila(FilaSel,"FechaCreacion")
'	DatosCabeceraPedidoCliente.GRPClienteERP=jamTableView1.GetValorSQLCampoFila(FilaSel,"GRPClienteERP")
'	DatosCabeceraPedidoCliente.IDCliente=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDCliente")
'	DatosCabeceraPedidoCliente.NombreDireccionEnvioCliente=jamTableView1.GetValorSQLCampoFila(FilaSel,"NombreDireccionEnvioClienteERP")
'	DatosCabeceraPedidoCliente.NombreDireccionFacturacion=jamTableView1.GetValorSQLCampoFila(FilaSel,"NombreDireccionFacturacion")
'	DatosCabeceraPedidoCliente.IDGRPCliente=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDGRPCliente")
'	DatosCabeceraPedidoCliente.IDPedido=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDPedido")
'	DatosCabeceraPedidoCliente.IDTienda=jamTableView1.GetValorSQLCampoFila(FilaSel,"IDTienda")
'	DatosCabeceraPedidoCliente.NombreClienteERP=jamTableView1.GetValorSQLCampoFila(FilaSel,"NombreClienteERP")
'	DatosCabeceraPedidoCliente.NombreTienda=jamTableView1.GetValorSQLCampoFila(FilaSel,"NombreTienda")
'	DatosCabeceraPedidoCliente.NombreUsuarioComprador=jamTableView1.GetValorSQLCampoFila(FilaSel,"NombreUsuarioComprador")
'	DatosCabeceraPedidoCliente.OrdenCompra=jamTableView1.GetValorSQLCampoFila(FilaSel,"OrdenCompra")
'	DatosCabeceraPedidoCliente.Pedido=jamTableView1.GetValorSQLCampoFila(FilaSel,"Pedido")
'	DatosCabeceraPedidoCliente.TotalQtyEnviada=jamTableView1.GetValorSQLCampoFila(FilaSel,"TotalQtyEnviada")
'	DatosCabeceraPedidoCliente.TotalQtyFacturada=jamTableView1.GetValorSQLCampoFila(FilaSel,"TotalQtyFacturada")
'	DatosCabeceraPedidoCliente.TotalQtyPedida=jamTableView1.GetValorSQLCampoFila(FilaSel,"TotalQtyPedida")
'	DatosCabeceraPedidoCliente.TotalQtyPendienteEnvio=jamTableView1.GetValorSQLCampoFila(FilaSel,"TotalQtyPendienteEnvio")
'	DatosCabeceraPedidoCliente.TotalQtyPendienteFacturar=jamTableView1.GetValorSQLCampoFila(FilaSel,"TotalQtyPendienteFacturar")
	Dim cPedidoB2B As cB2BFichaPedidoCliente
	cPedidoB2B.Initialize(IDPedidoSel,tk)
	'cPedidoB2B.Initialize(DatosCabeceraPedidoCliente,tk)
	frm.Close
End Sub


