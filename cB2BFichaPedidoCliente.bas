B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private xui As XUI
	Private mSQL As SQL
	Private mIDPedidoCliente As Int
	Private mDatosCabeceraPedidoCliente As TipoDatosCabeceraPedidoB2B
	Private mTk As String
	
	Private Dialog As B4XDialog
	Private jamLoadingIndicator1 As JamLoadingIndicator
	'Private jamTableView1 As jamTableView
	Private lblSalirB2BPedidoClienteFicha As B4XView
	Private txtClienteERP As B4XView
	Private txtComprador As B4XView
	Private txtDireccionEnvioERP As B4XView
	Private txtEmailComprador As B4XView
	Private txtFechaCreacion As B4XView
	Private txtFechaModificacion As B4XView
	Private txtIDPedido As B4XView
	Private txtNombreClienteERP As B4XView
	Private txtNombreDireccionEnvioERP As B4XView
	Private txtNombreTienda As B4XView
	Private txtOrdenCompra As B4XView
	Private txtPedido As B4XView
	
	Type TipoDatosLineaPedidoClienteB2B (IDLinea As Int, LineaPedido As Int, IDProductoB2B As Int, TipoItem As String, _
		ItemSKU As String, UNSPSC As String, _
		DescripcionProductoB2B As String, TallaB2B As String, _
		QtyPedida As Int, QtyEnviada As Int, QtyFacturada As Int, Precio As Double, UOMB2B As String, _
		TipoIVA As Double, ImporteIVA As Double, ItemParentSKU As String, CodigoArticuloNAV As String)
		
	Private TabPaneInfoPedidoCliente As TabPane
	Private jamTableViewLineasPedidoClienteB2B As jamTableView
	Private jamTableViewLineasAlbaranesPedidoClienteB2B As jamTableView
	Private jamTableViewLineasFacturasPedidoClienteB2B As jamTableView
	
	'Private lstAlbaranesPedido As List
	Private txtDireccionFacturacion As B4XView
	Private txtNombreDireccionFacturacion As B4XView
	Private txtIDDireccionEnvio As B4XView
	Private txtCodigoDireccionEnvioERP As B4XView
	Private txtNombreDireccionEnvio As B4XView
	Private txtIDDireccionFacturacion As B4XView
	Private txtCodigoDireccionFacturacion As B4XView
	Private txtDireccionEnvio As B4XView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(IDPedidoCliente As Int, tk As String)
'Public Sub Initialize(DatosCabeceraPedidoCliente As TipoDatosCabeceraPedidoB2B, tk As String)
	
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
	
	'mDatosCabeceraPedidoCliente=DatosCabeceraPedidoCliente
	mDatosCabeceraPedidoCliente.Initialize
	
	'mIDPedidoCliente=mDatosCabeceraPedidoCliente.IDPedido
	mIDPedidoCliente=IDPedidoCliente
	
	'lstAlbaranesPedido.Initialize
	
	mTk=tk
	
	CreacionTablasSQLite
	
	Show
End Sub

Private Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	
	frm.RootPane.LoadLayout("scrB2BFichaPedidoCliente2")
	
	frm.Title=Main.PrefijoTitleForms & "    B2B Pedido Cliente "
	
	TabPaneInfoPedidoCliente.LoadLayout("scrB2BPedidoClienteLineasPedido","Líneas Pedido")
	Sleep(0)
	TabPaneInfoPedidoCliente.LoadLayout("scrB2BPedidoClienteLineasAlbaranesPedido","Líneas Albaranes Pedido")
	Sleep(0)
	TabPaneInfoPedidoCliente.LoadLayout("scrB2BPedidoClienteLineasFacturasPedido","Líneas Facturas Pedido")
	Sleep(0)
	
	Utilidades.AddImageToLabel(lblSalirB2BPedidoClienteFicha,File.DirAssets, "twotone_exit_black_24dp.png")
	

	
	frm.Show
	
	'	jamTableViewLineasPedidoClienteB2B.AbrirCamposBuilder
'	Return

'	jamTableViewLineasAlbaranesPedidoClienteB2B.AbrirCamposBuilder
'	Return
'	
'	jamTableViewLineasFacturasPedidoClienteB2B.AbrirCamposBuilder
'	Return
	
'	
	wait for(Inicio) complete (Success As Boolean)
	If Success=False Then
		SalirModulo
		Return
	End If

End Sub

Sub getForm As Form
	Return frm
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub SalirModulo
	If jamTableViewLineasPedidoClienteB2B.IsInitialized Then
		jamTableViewLineasPedidoClienteB2B.GuardarConfiguracionColumnasUsuario
	End If

	Dim B2BListaPedCli As cB2BListaPedidosCliente
	B2BListaPedCli.Initialize
	frm.Close
	
End Sub

Sub Inicio As ResumableSub
	

	
	wait for(ConfiguracionTableViews) complete (rObj As Object)

	wait for (CargaDatosPedidoCliente(mIDPedidoCliente)) complete (Success As Boolean)
	If Success=False Then Return False
	
	Wait For(ActualizarDatosLineasPedido) complete (Success As Boolean)
	If Success=False Then Return False
	
	Wait For(CargaInfoDireccionesClienteMagento(mDatosCabeceraPedidoCliente.IDCliente)) complete (Success As Boolean)
	If Not(Success) Then Return False

	
'	If mDatosCabeceraPedidoCliente.IDDireccionFacturacion>0 Then
'		Wait For(CargaDatosDireccionCliente(mDatosCabeceraPedidoCliente.IDDireccionFacturacion,"Facturacion")) complete (Success As Boolean)
'		If Success=False Then Return False
'	End If
	
	If mDatosCabeceraPedidoCliente.IDDireccionEnvio>0 Then
		Wait For(CargaDatosDireccionCliente(mDatosCabeceraPedidoCliente.IDDireccionEnvio,"Envio")) complete (Success As Boolean)
		If Success=False Then Return False
	End If
	
	ActualizarDatosCabecera

	Return True
End Sub

Private Sub lblSalirB2BPedidoClienteFicha_MouseClicked (EventData As MouseEvent)
	SalirModulo
End Sub

Private Sub lblSalirB2BPedidoClienteFicha_MousePressed (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xui.Color_Cyan,1dip,xui.Color_Black,5)
	xNode.TextColor=xui.Color_Black
End Sub

Private Sub lblSalirB2BPedidoClienteFicha_MouseReleased (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xui.Color_Transparent,1dip,xui.Color_Black,5)
	xNode.TextColor=xui.Color_White
End Sub

private Sub lblSalirB2BPedidoClienteFicha_MouseEntered (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xNode.Color,1dip,xui.Color_Cyan,5)
End Sub

private Sub lblSalirB2BPedidoClienteFicha_MouseExited (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xNode.Color,1dip,xui.Color_Black,5)
End Sub

Sub CreacionTablasSQLite
	mSQL.ExecNonQuery("drop table if exists tblB2BLineasPedidoCliente")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BLineasPedidoCliente] (
		IDLinea INTEGER, LineaPedido INTEGER default 0, IDProductoB2B INTEGER, TipoItem TEXT, 
		ItemSKU TEXT, UNSPSC TEXT, 
		DescripcionProductoB2B TEXT, TallaB2B TEXT, 
		QtyPedida INTEGER, QtyEnviada INTEGER, QtyFacturada INTEGER, QtyPteEnviar INTEGER default 0, QtyEnviadaPteFacturar INTEGER default 0, Precio REAL, UOMB2B TEXT, 
		TipoIVA REAL, ImporteIVA REAL, ItemParentSKU TEXT, CodigoArticuloNAV TEXT default ''
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblB2BLineasAlbaranPedidoCliente")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblB2BLineasAlbaranPedidoCliente] (
		Albaran TEXT, FechaAlbaran INTEGER,
		LineaAlbaran INTEGER default 0, LineaPedido INTEGER default 0, IDProductoB2B INTEGER,
		ItemSKU TEXT,
		DescripcionProductoB2B TEXT, TallaB2B TEXT, 
		QtyEnviada INTEGER, UOMB2B TEXT, 
		ItemParentSKU TEXT, CodigoArticuloNAV TEXT default ''
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
End Sub

Sub ConfiguracionTableViews As ResumableSub
	


	
	jamTableViewLineasPedidoClienteB2B.EstadoMenuItem(jamTableViewLineasPedidoClienteB2B.MenuBarAcciones,True)
	jamTableViewLineasPedidoClienteB2B.EstadoMenuItem(jamTableViewLineasPedidoClienteB2B.MenuBarLinea,True)
	
	jamTableViewLineasPedidoClienteB2B.AddMenuItemFontAwesomeToMenuInMenuBar("Actualizar Datos Pedido","ActualizarDatosPedido",Chr(0xF021),jamTableViewLineasPedidoClienteB2B.MenuBarAcciones)
	jamTableViewLineasPedidoClienteB2B.AddMenuItemFontAwesomeToMenuInMenuBar("Generar fichero CSV Pedido Venta","GenerarFicheroCSVPedido",Chr(0xF0F6),jamTableViewLineasPedidoClienteB2B.MenuBarAcciones)
	
	Dim rSub As ResumableSub=jamTableViewLineasPedidoClienteB2B.ConfigurarTableView("ListaB2BLineasPedidoCliente.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableViewLineasPedidoClienteB2B.AlturaFilas=0
	
	
	jamTableViewLineasAlbaranesPedidoClienteB2B.EstadoMenuItem(jamTableViewLineasAlbaranesPedidoClienteB2B.MenuBarAcciones,True)
	jamTableViewLineasAlbaranesPedidoClienteB2B.EstadoMenuItem(jamTableViewLineasAlbaranesPedidoClienteB2B.MenuBarLinea,True)
	
	'jamTableViewLineasAlbaranesPedidoClienteB2B.AddMenuItemFontAwesomeToMenuInMenuBar("Actualizar Datos Pedido","ActualizarDatosPedido",Chr(0xF021),jamTableViewLineasAlbaranesPedidoClienteB2B.MenuBarAcciones)
	
	Dim rSub As ResumableSub=jamTableViewLineasAlbaranesPedidoClienteB2B.ConfigurarTableView("ListaB2BLineasAlbaranPedidoCliente.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableViewLineasAlbaranesPedidoClienteB2B.AlturaFilas=0
	jamTableViewLineasAlbaranesPedidoClienteB2B.AsignarCellFactoryColumnaFecha(Array("FechaAlbaran"))

	Return Null
End Sub

'Sub EnvioDatosAPIMagentoInformacionPedidoCliente(Token As String, TipoIdentificador As String, IDSel As Int) As ResumableSub
Sub EnvioDatosAPIMagentoInformacionPedidoCliente(Token As String, IDSel As Int) As ResumableSub
	
	'If TipoIdentificador="ID Pedido" Then
		Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/${IDSel}"$
'	Else
'		Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/search?
'	searchCriteria[filterGroups][0][filters][0][field]=increment_id&
'	searchCriteria[filterGroups][0][filters][0][value]=${IDSel}&
'	searchCriteria[filterGroups][0][filters][0][condition_type]=eq"$
'	End If

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

Sub CargaDatosPedidoCliente(IDPedidoSel As Int) As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblB2BLineasPedidoCliente")
	mDatosCabeceraPedidoCliente.Initialize


	'wait for(EnvioDatosAPIMagentoInformacionPedidoCliente(mTk,TipoIdentificador, IDSel)) complete (sResp As String)
	wait for(EnvioDatosAPIMagentoInformacionPedidoCliente(mTk, IDPedidoSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False

	
'	Dim mDataPedido As Map
'	mDataPedido.Initialize
	
	

	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd HH:mm:ss"
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	
	Dim extension_attributes As Map = root.Get("extension_attributes")
	Log("extension_attributes" & extension_attributes)
	Dim pgw As Map = extension_attributes.Get("pgw")
	Log("pgw" & pgw)
	Dim sPunchout As String=pgw.Get("entity_id")
	If sPunchout="null" Then
		mDatosCabeceraPedidoCliente.PedidoPunchout=False
	Else
		Dim IDPunchout As Int=pgw.Get("entity_id")
		If IDPunchout>0 Then
			mDatosCabeceraPedidoCliente.PedidoPunchout=True
			Dim extrinsic As List = pgw.Get("extrinsic")
			Dim extra_data As List = pgw.Get("extra_data")
			Dim posr_data As List = pgw.Get("posr_data")
			Dim originator As List = pgw.Get("originator")
			Dim entity_id As String = pgw.Get("entity_id")
			Dim poom_data As List = pgw.Get("poom_data")
			Dim po_number As String=pgw.Getdefault("po_number","")
			mDatosCabeceraPedidoCliente.OrdenCompra=po_number
		Else
			mDatosCabeceraPedidoCliente.PedidoPunchout=False
		End If
	End If
	

	Dim tax_amount As Double = root.Getdefault("tax_amount",0)
	Dim tax_invoiced As Double = root.Getdefault("tax_invoiced",0)
	Dim customer_note_notify As Int = root.Getdefault("customer_note_notify",0)
	Dim shipping_discount_amount As Int = root.Getdefault("shipping_discount_amount",0)
	Dim base_discount_tax_compensation_invoiced As Int = root.Getdefault("base_discount_tax_compensation_invoiced",0)
	
	mDatosCabeceraPedidoCliente.NombreUsuarioComprador = $"${root.Get("customer_firstname")}"$
	mDatosCabeceraPedidoCliente.ApellidoUsuarioComprador = $"${root.Get("customer_lastname")}"$
	
	'mDataPedido.Put("customer_firstname",customer_firstname)
	Dim discount_amount As Double = root.Getdefault("discount_amount",0)
	Dim billing_address As Map = root.Get("billing_address")
	Log("billing_address" & billing_address)
	'mDataPedido.Put("billing_address",billing_address)
	Dim firstname As String = billing_address.Get("firstname")
	Dim address_type As String = billing_address.Get("address_type")
	Dim Billing_Customer_address_id As Int = billing_address.Getdefault("customer_address_id",0)
	Dim IDBilling_address As Int = billing_address.Getdefault("entity_id",0)
	
	If mDatosCabeceraPedidoCliente.PedidoPunchout Then
		mDatosCabeceraPedidoCliente.IDDireccionFacturacion=IDBilling_address
	Else
		mDatosCabeceraPedidoCliente.IDDireccionFacturacion=Billing_Customer_address_id
	End If
	
	Dim Billingcompany As String=billing_address.Getdefault("company","")
	
	mDatosCabeceraPedidoCliente.NombreDireccionFacturacion=Billingcompany
	
	Dim city As String = billing_address.Get("city")
	Dim postcode As String = billing_address.Get("postcode")
	Dim region_id As Int = billing_address.Getdefault("region_id",0)
	Dim telephone As String = billing_address.Get("telephone")
	'Dim entity_id As Int = billing_address.Get("entity_id")
	'Dim IDBilling_address As Int = billing_address.Getdefault("entity_id",0)
	Dim lastname As String = billing_address.Get("lastname")
	Dim parent_id As Int = billing_address.Getdefault("parent_id",0)
	Dim street As List = billing_address.Get("street")
	Dim DireccionFisicaFacturacion As String
	For Each colstreet As String In street
		Log(colstreet)
		DireccionFisicaFacturacion=DireccionFisicaFacturacion & " " & colstreet
	Next
	Dim region As String = billing_address.Get("region")
	Dim country_id As String = billing_address.Get("country_id")
	Dim email As String = billing_address.Get("email")
	Dim region_code As String = billing_address.Get("region_code")
	
	mDatosCabeceraPedidoCliente.DireccionFacturacion=$"${DireccionFisicaFacturacion} ${postcode}, ${city} ${region} ${country_id}"$
	
	Dim BillingAddress_ExtensionAttributes As Map=billing_address.get("extension_attributes")
	If BillingAddress_ExtensionAttributes.IsInitialized Then
		Dim BillingAddress_ExtensionAttributes_pgw As Map=BillingAddress_ExtensionAttributes.get("pgw")
	End If
	
	Dim total_paid As Double = root.Getdefault("total_paid",0)
	Dim increment_id As String = root.Get("increment_id")  ' numero de pedido "largo"
	
	mDatosCabeceraPedidoCliente.Pedido=increment_id
	
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
	Dim base_shipping_amount As Double = payment.Getdefault("base_shipping_amount",0)
	Dim parent_id As Int = payment.Get("parent_id")
	Dim base_shipping_captured As Int = payment.Getdefault("base_shipping_captured",0)
	Dim state As String = root.Get("state")
	
	mDatosCabeceraPedidoCliente.EstadoPedido=state
	
	Dim base_shipping_tax_amount As Int = root.Getdefault("base_shipping_tax_amount",0)
	Dim base_grand_total As Double = root.Getdefault("base_grand_total",0)
	Dim billing_address_id As Int = root.Get("billing_address_id")
	'mDatosCabeceraPedidoCliente.IDDireccionFacturacion=billing_address_id
	
	Dim quote_id As Int = root.Getdefault("quote_id",0)
	Dim shipping_invoiced As Int = root.Getdefault("shipping_invoiced",0)
	Dim discount_tax_compensation_amount As Int = root.Getdefault("discount_tax_compensation_amount",0)
	Dim weight As Int = root.Getdefault("weight",0)
	'Dim entity_id As Int = root.Get("entity_id")
	Dim IDPedido As Int = root.Get("entity_id")
	
	mDatosCabeceraPedidoCliente.IDPedido=IDPedido
	
	Dim base_total_invoiced As Double = root.Getdefault("base_total_invoiced",0)
	Dim base_shipping_amount As Double = root.Getdefault("base_shipping_amount",0)
	Dim base_subtotal_invoiced As Int = root.Getdefault("base_subtotal_invoiced",0)
	Dim applied_rule_ids As String = root.Get("applied_rule_ids")
	Dim subtotal_incl_tax As Double = root.Getdefault("subtotal_incl_tax",0)
	Dim base_shipping_discount_tax_compensation_amnt As Int = root.Getdefault("base_shipping_discount_tax_compensation_amnt",0)
	Dim subtotal As Double = root.Getdefault("subtotal",0)
	Dim base_shipping_incl_tax As Int = root.Getdefault("base_shipping_incl_tax",0)
	'Dim customer_email As String = root.Get("customer_email")
	
	mDatosCabeceraPedidoCliente.EmailComprador=root.Get("customer_email")
	
	Dim base_discount_invoiced As Int = root.Getdefault("base_discount_invoiced",0)
	'Dim total_invoiced As Double = root.Getdefault("total_invoiced",0)
	
	mDatosCabeceraPedidoCliente.ImporteTotalFacturadoSinIVA=root.Getdefault("total_invoiced",0)
	
	Dim base_to_global_rate As Int = root.Getdefault("base_to_global_rate",0)
	Dim customer_is_guest As Int = root.Getdefault("customer_is_guest",0)
	

		
	Dim global_currency_code As String = root.Get("global_currency_code")
	Dim status As String = root.Get("status")
	Dim is_virtual As Int = root.Getdefault("is_virtual",0)
	Dim base_total_invoiced_cost As Int = root.Getdefault("base_total_invoiced_cost",0)
	Dim discount_tax_compensation_invoiced As Int = root.Getdefault("discount_tax_compensation_invoiced",0)
	Dim status_histories As List = root.Get("status_histories")
	Dim store_currency_code As String = root.Get("store_currency_code")
	Dim created_at As String = root.Get("created_at")
	
	mDatosCabeceraPedidoCliente.FechaCreacion=DateTime.DateParse(created_at)
	
	Dim total_item_count As Int = root.Get("total_item_count")
	Dim shipping_tax_amount As Int = root.Getdefault("shipping_tax_amount",0)
	Dim store_to_base_rate As Int = root.Getdefault("store_to_base_rate",0)
	Dim updated_at As String = root.Get("updated_at")
	
	mDatosCabeceraPedidoCliente.FechaActualizacion=DateTime.DateParse(updated_at)
	
	Dim base_shipping_discount_amount As Int = root.Getdefault("base_shipping_discount_amount",0)
	Dim store_id As Int = root.Get("store_id")
	mDatosCabeceraPedidoCliente.IDTienda=store_id
	Dim store_name As String = root.Get("store_name")
	'mDatosCabeceraPedidoCliente.NombreTienda=store_name
	
	mDatosCabeceraPedidoCliente.NombreTienda=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select name from tblB2BStores where id=?",Array As String(mDatosCabeceraPedidoCliente.IDTienda)))
	
	Dim grand_total As Double = root.Get("grand_total")
	Dim base_currency_code As String = root.Get("base_currency_code")
	
	mDatosCabeceraPedidoCliente.Moneda=base_currency_code
	
	Dim base_total_paid As Double = root.Getdefault("base_total_paid",0)
	Dim base_tax_amount As Double = root.Getdefault("base_tax_amount",0)

	Dim shipping_discount_tax_compensation_amount As Int = root.Getdefault("shipping_discount_tax_compensation_amount",0)
	Dim total_due As Int = root.Get("total_due")
	Dim total_qty_ordered As Int = root.Getdefault("total_qty_ordered",0)
	Dim base_discount_amount As Int = root.Getdefault("base_discount_amount",0)
	
	Dim carts As List = extension_attributes.Get("carts")
	For Each mCart As Map In carts
		Log(mCart)
	Next
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
			Dim TipoImpuestoAplicado As String = colitem_applied_taxes.Get("type")
		Next
	End If
	
	Dim converting_from_quote As String = extension_attributes.Get("converting_from_quote")
	Dim contacts As List = extension_attributes.Get("contacts")
	For Each mContacts As Map In contacts
		Log(mContacts)
	Next
	Dim shipping_description As String = root.Get("shipping_description")
	Dim store_to_order_rate As Int = root.Getdefault("store_to_order_rate",0)
	Dim shipping_amount As Int = root.Getdefault("shipping_amount",0)
	Dim base_discount_tax_compensation_amount As Int = root.Getdefault("base_discount_tax_compensation_amount",0)
	Dim subtotal_invoiced As Int = root.Getdefault("subtotal_invoiced",0)
	
	mDatosCabeceraPedidoCliente.ImporteTotalFacturadoSinIVA=subtotal_invoiced
	
	Dim base_to_order_rate As Int = root.Getdefault("base_to_order_rate",0)
	Dim base_subtotal As Int = root.Getdefault("base_subtotal",0)
	
	mDatosCabeceraPedidoCliente.ImporteTotalSinIVA=base_subtotal
	
	Dim protect_code As String = root.Get("protect_code")
	Dim customer_dob As String = root.Get("customer_dob")
	Dim base_total_due As Int = root.Getdefault("base_total_due",0)
	Dim base_subtotal_incl_tax As Double = root.Getdefault("base_subtotal_incl_tax",0)
	Dim customer_id As Int = root.Getdefault("customer_id",0)
	
	mDatosCabeceraPedidoCliente.IDCliente=customer_id
	mDatosCabeceraPedidoCliente.CodigoClienteERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Code from tblB2BClientes where id=?",Array As String(mDatosCabeceraPedidoCliente.IDCliente)))
	mDatosCabeceraPedidoCliente.NombreCliente=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Company from tblB2BClientes where id=?",Array As String(mDatosCabeceraPedidoCliente.IDCliente)))
	
	Dim customer_group_id As Int = root.Getdefault("customer_group_id",0)
	
	mDatosCabeceraPedidoCliente.IDGRP=customer_group_id
	
	Dim discount_invoiced As Int = root.Getdefault("discount_invoiced",0)
	Dim order_currency_code As String = root.Get("order_currency_code")
	
	mDatosCabeceraPedidoCliente.Moneda=order_currency_code
	
	Dim base_tax_invoiced As Double = root.Getdefault("base_tax_invoiced",0)
	Dim customer_gender As Int = root.Getdefault("customer_gender",0)
	Dim shipping_incl_tax As Int = root.Getdefault("shipping_incl_tax",0)
	Dim base_shipping_invoiced As Int = root.Getdefault("base_shipping_invoiced",0)
	
	Dim items As List = root.Get("items")
	
'	Dim TallaParentItemLinea As String
'	Dim PrecioParentItemLinea As Double
'	Dim QtyPedidaParentItemLinea As Int
'	Dim QtyEnviadaParentItemLinea As Int
'	Dim QtyFacturadaParentItemLinea As Int
	
	Dim LineaPedido As Int
	Dim lstProductosConfigurables As List
	lstProductosConfigurables.Initialize
	
	For Each colitems As Map In items
		
		Dim DatosLineaPedidoClienteB2B As TipoDatosLineaPedidoClienteB2B
		DatosLineaPedidoClienteB2B.Initialize
		
		Dim sku As String = colitems.Get("sku")
		DatosLineaPedidoClienteB2B.ItemSKU=sku
		
		Dim product_type As String = colitems.Get("product_type")
		DatosLineaPedidoClienteB2B.TipoItem=product_type
'		
'		If product_type="configurable" Then
''			Dim ItemProductOption As Map=colitems.Get("product_option")
''			Dim ItemProductOptionExtensionAttributes As Map=ItemProductOption.Get("extension_attributes")
''			Dim lstItemProductOptionExtensionAttributesConfigurableItemOptions As List=ItemProductOptionExtensionAttributes.Get("configurable_item_options")
''			For Each mDataItemProductOptionExtensionAttributesConfigurableItemOptions As Map In lstItemProductOptionExtensionAttributesConfigurableItemOptions
''				
''			Next
'			'lstProductosConfigurables.Add(
'			 Continue ' ojo, case sensitive...
'		End If
'
		If DatosLineaPedidoClienteB2B.TipoItem="configurable" Then Continue
		

		
		
		Dim tax_amount As Double = colitems.Getdefault("tax_amount",0)
		DatosLineaPedidoClienteB2B.ImporteIVA=tax_amount
		Dim tax_invoiced As Double = colitems.Getdefault("tax_invoiced",0)
		Dim original_price As Double = colitems.Getdefault("original_price",0)
		Dim free_shipping As Int = colitems.Getdefault("free_shipping",0)
		Dim base_discount_tax_compensation_invoiced As Int = colitems.Getdefault("base_discount_tax_compensation_invoiced",0)
		Dim discount_amount As Double = colitems.Getdefault("discount_amount",0)
		Dim tax_percent As Double = colitems.Getdefault("tax_percent",0)
		DatosLineaPedidoClienteB2B.TipoIVA=tax_percent
		Dim price_incl_tax As Double = colitems.Getdefault("price_incl_tax",0)
		Dim price As Double = colitems.Getdefault("price",0)
		DatosLineaPedidoClienteB2B.Precio=price
		Dim product_id As Int = colitems.Get("product_id")
		DatosLineaPedidoClienteB2B.IDProductoB2B=product_id  
		Dim base_row_total As Double = colitems.Getdefault("base_row_total",0)

		Dim discount_tax_compensation_amount As Int = colitems.Getdefault("discount_tax_compensation_amount",0)
		Dim weight As Int = colitems.Get("weight")
		Dim base_original_price As Int = colitems.Getdefault("base_original_price",0)
		Dim row_weight As Int = colitems.Get("row_weight")
		Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim base_amount_refunded As Int = colitems.Getdefault("base_amount_refunded",0)
		Dim base_price_incl_tax As Double = colitems.Getdefault("base_price_incl_tax",0)
		Dim no_discount As Int = colitems.Getdefault("no_discount",0)
		Dim name As String = colitems.Get("name")
		DatosLineaPedidoClienteB2B.DescripcionProductoB2B=name
		Dim base_discount_invoiced As Int = colitems.Getdefault("base_discount_invoiced",0)
		Dim discount_percent As Int = colitems.Getdefault("discount_percent",0)
		Dim order_id As Int = colitems.Get("order_id")
		Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
		Dim created_at As String = colitems.Get("created_at")
		Dim qty_shipped As Int = colitems.Getdefault("qty_shipped",0)
		DatosLineaPedidoClienteB2B.QtyEnviada=qty_shipped
		Dim qty_ordered As Int = colitems.Getdefault("qty_ordered",0)
		DatosLineaPedidoClienteB2B.QtyPedida=qty_ordered
		Dim row_total As Int = colitems.Getdefault("row_total",0)
		Dim qty_canceled As Int = colitems.Get("qty_canceled")
		Dim Talla As String
		Dim product_option As Map = IIf(colitems.Get("product_option")=Null,CreateMap("":""),colitems.Get("product_option"))
		Dim ItemProductOptionExtension_attributes As Map = product_option.Get("extension_attributes")
		If ItemProductOptionExtension_attributes.IsInitialized Then
			Dim configurable_item_options As List = ItemProductOptionExtension_attributes.Get("configurable_item_options")
			
			For Each colconfigurable_item_options As Map In configurable_item_options
				Dim option_value As Int = colconfigurable_item_options.Get("option_value")
				Dim option_id As String = colconfigurable_item_options.Get("option_id")
				If option_id=142 Then
					Talla=mSQL.ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",Array As String(option_value))
				End If
			Next
		End If
		Dim ItemExtensionAttributes As Map=colitems.Get("extension_attributes")   ' = datos punchout???
		If ItemExtensionAttributes.IsInitialized Then
			Dim ItemPgw As Map=ItemExtensionAttributes.Get("pgw")
			If ItemPgw.IsInitialized Then
				Log(ItemPgw)
				DatosLineaPedidoClienteB2B.UNSPSC=ItemPgw.Get("unspsc")
				DatosLineaPedidoClienteB2B.UOMB2B=ItemPgw.Get("uom")
			End If
		End If
		If DatosLineaPedidoClienteB2B.UNSPSC="" Then
			'DatosLineaPedidoClienteB2B.UNSPSC=
		End If
		DatosLineaPedidoClienteB2B.TallaB2B=Talla
		Dim amount_refunded As Int = colitems.Get("amount_refunded")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim base_price As Double = colitems.Get("base_price")
		Dim qty_invoiced As Int = colitems.Getdefault("qty_invoiced",0)
		Dim row_invoiced As Int = colitems.Getdefault("row_invoiced",0)
		Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
		Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim store_id As Int = colitems.Getdefault("store_id",0)

		Dim item_id As Int = colitems.Get("item_id")
		DatosLineaPedidoClienteB2B.IDLinea=item_id
		LineaPedido=LineaPedido+1
		DatosLineaPedidoClienteB2B.LineaPedido=LineaPedido
		Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
		Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)

		Dim qty_refunded As Int = colitems.Get("qty_refunded")
		Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
		Dim is_qty_decimal As Int = colitems.Getdefault("is_qty_decimal",0)
		Dim discount_invoiced As Int = colitems.Getdefault("discount_invoiced",0)
		Dim base_tax_invoiced As Double = colitems.Getdefault("base_tax_invoiced",0)
		
		Dim IDParentItem As Int= colitems.Getdefault("parent_item_id",-1)
		
		'Dim ProductoPadre As String
		Dim mParent_item As Map=colitems.Get("parent_item")
'		If parent_item.IsInitialized Then
'			Log("parent_item: " & parent_item)
'		End If
		
'		If product_type="configurable" Then
'			DatosLineaPedidoClienteB2B.TipoItem="Configurable"
'		Else
		If mParent_item.IsInitialized Then
			Log("parent_item: " & mParent_item)
			DatosLineaPedidoClienteB2B.TipoItem="SimpleConPadre"
			DatosLineaPedidoClienteB2B.Precio=mParent_item.Get("price")
			DatosLineaPedidoClienteB2B.QtyEnviada=mParent_item.Get("qty_shipped")
			DatosLineaPedidoClienteB2B.QtyFacturada=mParent_item.Get("qty_invoiced")
			'DatosLineaPedidoClienteB2B.ItemParentSKU=
			Dim mProductOptionParentItem As Map=mParent_item.Get("product_option")
			If mProductOptionParentItem.IsInitialized Then
				Dim mExtensionAttributesProductOptionParentItem As Map=mProductOptionParentItem.Get("extension_attributes")
				If mExtensionAttributesProductOptionParentItem.IsInitialized Then
					Dim configurable_item_options As List =mExtensionAttributesProductOptionParentItem.Get("configurable_item_options")
					For Each mDataConfigurable_item_options As Map In configurable_item_options
						Dim option_value As Int = mDataConfigurable_item_options.Get("option_value")
						Dim option_id As String = mDataConfigurable_item_options.Get("option_id")
						If option_id=142 Then
							Talla=mSQL.ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",Array As String(option_value))
							DatosLineaPedidoClienteB2B.TallaB2B=Talla
						End If
					Next
				End If
			End If
			Dim mExtensionAttributesParentItem As Map=mParent_item.Get("extension_attributes")
			If mExtensionAttributesParentItem.IsInitialized Then
				Dim mPgwExtensionAttributesParentItem As Map=mExtensionAttributesParentItem.Get("pgw")
				If mPgwExtensionAttributesParentItem.IsInitialized Then
					'DatosLineaPedidoClienteB2B.ItemParentSKU=mPgwExtensionAttributesParentItem.Get("manufacture_part_id")
					DatosLineaPedidoClienteB2B.UNSPSC=mPgwExtensionAttributesParentItem.Get("unspsc")
					DatosLineaPedidoClienteB2B.UOMB2B=mPgwExtensionAttributesParentItem.Get("uom")
				End If
			End If
			Dim PartesSKU() As String=Regex.Split("_",DatosLineaPedidoClienteB2B.ItemSKU)
			DatosLineaPedidoClienteB2B.ItemParentSKU=PartesSKU(0)
		Else
			DatosLineaPedidoClienteB2B.TipoItem="SimpleSinPadre"
		End If
'		End If

		DatosLineaPedidoClienteB2B.CodigoArticuloNAV=IIf(DatosLineaPedidoClienteB2B.TipoItem="SimpleSinPadre", DatosLineaPedidoClienteB2B.ItemSKU, DatosLineaPedidoClienteB2B.ItemParentSKU)
		
		Log($"DatosLineaPedidoClienteB2B: ${DatosLineaPedidoClienteB2B}"$)
		
		Dim sSQL As String=$"insert into tblB2BLineasPedidoCliente (
		IDLinea, LineaPedido, IDProductoB2B, TipoItem , 
		ItemSKU , UNSPSC , 
		DescripcionProductoB2B , TallaB2B , 
		QtyPedida , QtyEnviada , QtyFacturada , Precio , UOMB2B , 
		TipoIVA , ImporteIVA , ItemParentSKU, CodigoArticuloNAV
		) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$
		mSQL.ExecNonQuery2(sSQL,Array As Object(DatosLineaPedidoClienteB2B.IDLinea, DatosLineaPedidoClienteB2B.LineaPedido, DatosLineaPedidoClienteB2B.IDProductoB2B, DatosLineaPedidoClienteB2B.TipoItem, _
		DatosLineaPedidoClienteB2B.ItemSKU, DatosLineaPedidoClienteB2B.UNSPSC, _
		DatosLineaPedidoClienteB2B.DescripcionProductoB2B, DatosLineaPedidoClienteB2B.TallaB2B, _
		DatosLineaPedidoClienteB2B.QtyPedida, DatosLineaPedidoClienteB2B.QtyEnviada, DatosLineaPedidoClienteB2B.QtyFacturada, DatosLineaPedidoClienteB2B.Precio, DatosLineaPedidoClienteB2B.UOMB2B, _
		DatosLineaPedidoClienteB2B.Tipoiva, DatosLineaPedidoClienteB2B.ImporteIVA, DatosLineaPedidoClienteB2B.ItemParentSKU, DatosLineaPedidoClienteB2B.CodigoArticuloNAV))
		
	Next


	Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
	For Each colshipping_assignments As Map In shipping_assignments
		Dim shipping As Map = colshipping_assignments.Get("shipping")
		Log("shipping" & shipping)
		Dim total As Map = shipping.Get("total")
		Dim shipping_amount As Int = total.Get("shipping_amount")
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
		Dim shipping_customer_address_id As Int = address.Getdefault("customer_address_id",0)
		If mDatosCabeceraPedidoCliente.PedidoPunchout Then
			Dim IDDireccionEnvio As Int = address.Get("entity_id")
		Else
			Dim IDDireccionEnvio As Int = shipping_customer_address_id
		End If
		
		
		mDatosCabeceraPedidoCliente.IDDireccionEnvio=IDDireccionEnvio
		
		Dim company As String=address.Get("company")
		
		mDatosCabeceraPedidoCliente.NombreDireccionEnvio=company
		
		Dim city As String = address.Get("city")
		Dim postcode As String = address.Get("postcode")
		Dim region_id As Int = address.Getdefault("region_id",0)
		Dim telephone As String = address.Get("telephone")
		
		'lstAlbaranesPedido.Add(AlbaranEntity_id)
		'Dim IDAddress As Int = address.Getdefault("entity_id",0)
		Dim lastname As String = address.Get("lastname")
		Dim parent_id As Int = address.Getdefault("parent_id",0)
		Dim DireccionEnvio As String
		Dim street As List = address.Get("street")
		For Each colstreet As String In street
			DireccionEnvio=DireccionEnvio & " " & colstreet
		Next
		Dim region As String = address.Get("region")
		Dim country_id As String = address.Get("country_id")
		Dim email As String = address.Get("email")
		Dim region_code As String = address.Get("region_code")
		
		mDatosCabeceraPedidoCliente.DireccionEnvio=$"${mDatosCabeceraPedidoCliente.DireccionEnvio} ${postcode} ${city} ${region} ${country_id}"$
		
		Dim method As String = shipping.Get("method")
		Dim AddressExtensionAttributes As Map=address.Get("extension_attributes")
		If AddressExtensionAttributes.IsInitialized Then
			Dim AddressPgW As Map=AddressExtensionAttributes.Get("pgw")
		End If
		
		Dim ItemsShipping_Assignments As List = colshipping_assignments.Get("items")
		For Each colItemsShipping_Assignments As Map In ItemsShipping_Assignments
			Log("colItemsShipping_Assignments" & colItemsShipping_Assignments)
			''			Dim tax_amount As Double = colitems.Get("tax_amount")
			''			Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
			Dim original_price As Double = colItemsShipping_Assignments.Get("original_price")
			Dim free_shipping As Int = colItemsShipping_Assignments.Get("free_shipping")
			Dim base_discount_tax_compensation_invoiced As Int = colItemsShipping_Assignments.Getdefault("base_discount_tax_compensation_invoiced",-1)
			Dim discount_amount As Double = colItemsShipping_Assignments.Getdefault("discount_amount",0)
			Dim tax_percent As Double = colItemsShipping_Assignments.Getdefault("tax_percent",-1)
			Dim price_incl_tax As Double = Utilidades.FixNullDouble(colItemsShipping_Assignments.Getdefault("price_incl_tax",0))
			Dim price As Double = colItemsShipping_Assignments.Get("price")
			Dim product_id As Int = colItemsShipping_Assignments.Get("product_id")
			Dim base_row_total As Double = colItemsShipping_Assignments.Get("base_row_total")
			Dim sku As String = colItemsShipping_Assignments.Get("sku")
			Dim discount_tax_compensation_amount As Int = colItemsShipping_Assignments.Getdefault("discount_tax_compensation_amount",-1)
			Dim weight As Int = colItemsShipping_Assignments.Get("weight")
			Dim base_original_price As Int = colItemsShipping_Assignments.Getdefault("base_original_price",-1)
			Dim row_weight As Int = colItemsShipping_Assignments.Get("row_weight")
			Dim applied_rule_ids As String = colItemsShipping_Assignments.Get("applied_rule_ids")
			Dim base_amount_refunded As Int = colItemsShipping_Assignments.Get("base_amount_refunded")
			Dim base_price_incl_tax As Double = colItemsShipping_Assignments.Getdefault("base_price_incl_tax",-1)
			Dim no_discount As Int = colItemsShipping_Assignments.Get("no_discount")
			Dim name As String = colItemsShipping_Assignments.Get("name")
			Dim base_discount_invoiced As Int = colItemsShipping_Assignments.Get("base_discount_invoiced")
			Dim discount_percent As Int = colItemsShipping_Assignments.Getdefault("discount_percent",-1)
			Dim order_id As Int = colItemsShipping_Assignments.Get("order_id")
			Dim discount_tax_compensation_invoiced As Int = colItemsShipping_Assignments.Getdefault("discount_tax_compensation_invoiced",-1)
			Dim created_at As String = colItemsShipping_Assignments.Get("created_at")
			Dim qty_shipped As Int = colItemsShipping_Assignments.Get("qty_shipped")
			Dim qty_ordered As Int = colItemsShipping_Assignments.Get("qty_ordered")
			Dim row_total As Int = colItemsShipping_Assignments.Get("row_total")
			Dim qty_canceled As Int = colItemsShipping_Assignments.Get("qty_canceled")
			Dim ItemsShipping_AssignmentsProduct_option As Map = IIf(colItemsShipping_Assignments.Get("product_option")=Null,CreateMap("":""),colItemsShipping_Assignments.Get("product_option"))
			Dim ItemsShipping_AssignmentsProduct_optionExtension_attributes As Map = ItemsShipping_AssignmentsProduct_option.Get("extension_attributes")
			Dim TallaLineaAlbaran As String
			If ItemsShipping_AssignmentsProduct_optionExtension_attributes.IsInitialized Then
				Dim ItemsShipping_AssignmentsProduct_optionExtension_attributesConfigurable_item_options As List = ItemsShipping_AssignmentsProduct_optionExtension_attributes.Get("configurable_item_options")
				For Each ItemsShippingcolconfigurable_item_options As Map In ItemsShipping_AssignmentsProduct_optionExtension_attributesConfigurable_item_options
					Dim option_value As Int = ItemsShippingcolconfigurable_item_options.Get("option_value")
					Dim option_id As String = ItemsShippingcolconfigurable_item_options.Get("option_id")
					If option_id=142 Then
						TallaLineaAlbaran=mSQL.ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",Array As String(option_value))
					End If
				Next
			End If
			Dim amount_refunded As Int = colItemsShipping_Assignments.Get("amount_refunded")
			Dim updated_at As String = colItemsShipping_Assignments.Get("updated_at")
			Dim base_price As Double = colItemsShipping_Assignments.Get("base_price")
			Dim qty_invoiced As Int = colItemsShipping_Assignments.Get("qty_invoiced")
			Dim row_invoiced As Int = colItemsShipping_Assignments.Get("row_invoiced")
			Dim row_total_incl_tax As Double = colItemsShipping_Assignments.Get("row_total_incl_tax")
			Dim base_tax_amount As Double = colItemsShipping_Assignments.Get("base_tax_amount")
			'Dim store_id As Int = colItemsShipping_Assignments.Getdefault("store_id",-1)
			Dim item_id As Int = colItemsShipping_Assignments.Get("item_id")
			Dim base_discount_amount As Int = colItemsShipping_Assignments.Get("base_discount_amount")
			Dim base_row_total_incl_tax As Double = colItemsShipping_Assignments.Get("base_row_total_incl_tax")
			Dim base_discount_tax_compensation_amount As Int = colItemsShipping_Assignments.Getdefault("base_discount_tax_compensation_amount",-1)
			Dim product_type As String = colItemsShipping_Assignments.Get("product_type")
			Dim qty_refunded As Int = colItemsShipping_Assignments.Get("qty_refunded")
			Dim base_row_invoiced As Int = colItemsShipping_Assignments.Get("base_row_invoiced")
			Dim is_qty_decimal As Int = colItemsShipping_Assignments.Getdefault("is_qty_decimal",-1)
			Dim discount_invoiced As Int = colItemsShipping_Assignments.Get("discount_invoiced")
			Dim base_tax_invoiced As Double = colItemsShipping_Assignments.Get("base_tax_invoiced")
		Next
	Next




	DateTime.DateFormat=DateFormatAnt
	
	mSQL.ExecNonQuery($"update tblB2BLineasPedidoCliente set QtyPteEnviar=QtyPedida-QtyEnviada"$)
	mSQL.ExecNonQuery($"update tblB2BLineasPedidoCliente set QtyEnviadaPteFacturar=QtyEnviada-QtyFacturada"$)


	Return True
End Sub

Sub ActualizarDatosCabecera
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy HH:mm:ss"
	
	txtClienteERP.Text=mDatosCabeceraPedidoCliente.CodigoClienteERP
	txtComprador.Text=$"${mDatosCabeceraPedidoCliente.NombreUsuarioComprador} ${mDatosCabeceraPedidoCliente.ApellidoUsuarioComprador} "$
	txtCodigoDireccionEnvioERP.Text=mDatosCabeceraPedidoCliente.CodigoDireccionEnvioERP
	txtEmailComprador.Text=mDatosCabeceraPedidoCliente.EmailComprador
	txtFechaCreacion.Text=DateTime.Date(mDatosCabeceraPedidoCliente.FechaCreacion)
	txtFechaModificacion.Text=DateTime.date(mDatosCabeceraPedidoCliente.FechaActualizacion)
	txtIDPedido.Text=mDatosCabeceraPedidoCliente.IDPedido
	txtNombreClienteERP.Text=mDatosCabeceraPedidoCliente.NombreCliente
	'txtNombreDireccionEnvioERP.Text=mDatosCabeceraPedidoCliente.NombreClienteERP
	txtNombreTienda.Text=mDatosCabeceraPedidoCliente.NombreTienda
	txtOrdenCompra.Text=mDatosCabeceraPedidoCliente.OrdenCompra
	txtPedido.Text=mDatosCabeceraPedidoCliente.Pedido

	txtIDDireccionFacturacion.Text=mDatosCabeceraPedidoCliente.IDDireccionFacturacion
	txtNombreDireccionFacturacion.Text=mDatosCabeceraPedidoCliente.NombreDireccionFacturacion
	txtDireccionFacturacion.Text=mDatosCabeceraPedidoCliente.DireccionFacturacion
	txtIDDireccionEnvio.Text=mDatosCabeceraPedidoCliente.IDDireccionEnvio
	txtNombreDireccionEnvio.Text=mDatosCabeceraPedidoCliente.NombreDireccionEnvio
	txtDireccionEnvio.Text=mDatosCabeceraPedidoCliente.DireccionEnvio
	
	DateTime.DateFormat=DateFormatAnt
End Sub

Sub ActualizarDatosLineasPedido As ResumableSub
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblB2BLineasPedidoCliente order by IDLinea")
	Dim rSub As ResumableSub=jamTableViewLineasPedidoClienteB2B.setdata(rs)
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
				jamTableViewLineasPedidoClienteB2B.AbrirCamposBuilder
				Return True
			End If
			#End If
			ExitApplication
			Return False
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return True
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	Return True
End Sub

Sub jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action(TagMenuItem As String)
	
	Select Case TagMenuItem
		
		Case "ActualizarDatosPedido"
			wait for (CargaDatosPedidoCliente(mIDPedidoCliente)) complete (Success As Boolean)
			If Success=False Then
				SalirModulo
				Return
			End If
			Wait For(ActualizarDatosLineasPedido) complete (Success As Boolean)
			If Success=False Then
				SalirModulo
				Return
			End If
'			
'			Wait For(CargaDatosPedidoClienteSearch(mIDPedidoCliente)) complete (Success As Boolean)
'			If Success=False Then
'				SalirModulo
'				Return
'			End If
'		

		Case "GenerarFicheroCSVPedido"
			GenerarCSVPedidoVenta
		
	End Select
End Sub

Sub TabPaneInfoPedidoCliente_TabChanged (SelectedTab As TabPage)
	Select Case SelectedTab.Text
		Case "Líneas Albaranes Pedido"
			jamTableViewLineasAlbaranesPedidoClienteB2B.LimpiarTabla
			'For Each IDAlb As Int In lstAlbaranesPedido
				Wait For(CargaDatosAlbaranesPedidoCliente(mIDPedidoCliente)) complete (Success As Boolean)
				If Success=False Then
					SalirModulo
					Return
				End If
				Wait For(ActualizarDatosLineasAlbaranesPedido) complete (Success As Boolean)
				If Success=False Then
					SalirModulo
					Return
				End If
				
				
				
			'Next
	End Select
	
End Sub

Sub CargaDatosAlbaranesPedidoCliente(IDPedidoSel As Int) As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblB2BLineasAlbaranPedidoCliente")
	
	wait for(EnvioDatosAPIMagentoAlbaranesPedido(mTk, IDPedidoSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		Dim msa As Object=xui.MsgboxAsync($"Error en la descarga de albaranes del pedido.
${sResp}"$,"Error")
		Wait For (msa) Msgbox_Result
		 Return False
	End If
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd HH:mm:ss"
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim lstAlbaranes As List=root.Get("items")
	For Each mDataAlbaran As Map In lstAlbaranes
		Log(mDataAlbaran)
		Dim IDAlbaran As String=mDataAlbaran.Get("entity_id")
		Dim Albaran As String=mDataAlbaran.Get("increment_id")
		Dim FechaAlbaran As Long=DateTime.DateParse(mDataAlbaran.Get("created_at"))
		Dim IDDireccionEnvio As Int=mDataAlbaran.Get("shipping_address_id")
		Dim lstLineasAlbaran As List=mDataAlbaran.Get("items")
		Dim LineaAlbaran As Int
		For Each mDataLineaAlbaran As Map In lstLineasAlbaran
			Log(mDataLineaAlbaran)
			Dim IDProductoB2B As Int=mDataLineaAlbaran.Get("product_id")
			Dim ItemSKU As String=mDataLineaAlbaran.get("sku")
			Dim ItemParentSKU As String=mSQL.ExecQuerySingleResult2("select ItemParentSKU from tblB2BLineasPedidoCliente where ItemSKU=?",Array As String(ItemSKU))
			Dim CodigoArticuloNAV As String=mSQL.ExecQuerySingleResult2("select CodigoArticuloNav from tblB2BLineasPedidoCliente where ItemSKU=?",Array As String(ItemSKU))
			Dim DescripcionProductoB2B As String=mSQL.ExecQuerySingleResult2("select DescripcionProductoB2B from tblB2BLineasPedidoCliente where ItemSKU=?",Array As String(ItemSKU))
			Dim TallaB2B As String=mSQL.ExecQuerySingleResult2("select TallaB2B from tblB2BLineasPedidoCliente where ItemSKU=?",Array As String(ItemSKU))
			Dim QtyLineaAlbaran As Int=mDataLineaAlbaran.get("qty")
			Dim UOMB2B As String=mSQL.ExecQuerySingleResult2("select UOMB2B from tblB2BLineasPedidoCliente where ItemSKU=?",Array As String(ItemSKU))
			LineaAlbaran=LineaAlbaran+1
			
			mSQL.ExecNonQuery2($"insert into tblB2BLineasAlbaranPedidoCliente (
			Albaran,FechaAlbaran,
			LineaAlbaran, IDProductoB2B,
			ItemSKU, 
			DescripcionProductoB2B, TallaB2B,
			QtyEnviada, UOMB2B ,
			ItemParentSKU, CodigoArticuloNAV
			)
			values(?,?,?,?,?,?,?,?,?,?,?)
			"$, _
			Array As Object(Albaran, FechaAlbaran,LineaAlbaran, IDProductoB2B,ItemSKU, DescripcionProductoB2B, TallaB2B, QtyLineaAlbaran, UOMB2B, ItemParentSKU,CodigoArticuloNAV))
			
			
		Next
		'Dim mExtensionAttributesAlbaran As Map=mDataAlbaran.Get("extension_attributes")
	Next
	
	DateTime.DateFormat=DateFormatAnt
	
	Return True
End Sub

'Sub EnvioDatosAPIMagentoInformacionPedidoCliente(Token As String, TipoIdentificador As String, IDSel As Int) As ResumableSub
Sub EnvioDatosAPIMagentoAlbaranesPedido(Token As String, IDPedidoSel As Int) As ResumableSub
	
	
	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/shipments/?
	searchCriteria[pageSize] = 0&
	searchCriteria[filterGroups][0][filters][0][field]=order_id&
	searchCriteria[filterGroups][0][filters][0][value]=${IDPedidoSel}&
	searchCriteria[filterGroups][0][filters][0][condition_type]=eq"$


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


Sub ActualizarDatosLineasAlbaranesPedido As ResumableSub
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblB2BLineasAlbaranPedidoCliente order by FechaAlbaran, Albaran, LineaAlbaran")
	Dim rSub As ResumableSub=jamTableViewLineasAlbaranesPedidoClienteB2B.setdata(rs)
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
				jamTableViewLineasAlbaranesPedidoClienteB2B.AbrirCamposBuilder
				Return True
			End If
			#End If
			ExitApplication
			Return False
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return True
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	Return True
End Sub


Sub CargaDatosPedidoClienteSearch(IDPedidoSel As Int) As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblB2BLineasPedidoCliente")

	'wait for(EnvioDatosAPIMagentoInformacionPedidoCliente(mTk,TipoIdentificador, IDSel)) complete (sResp As String)
	wait for(EnvioDatosAPIMagentoInformacionPedidoClienteSearch(mTk, IDPedidoSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return False

	
	Dim mDataPedido As Map
	mDataPedido.Initialize
	
	

	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd HH:mm:ss"
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim lstItems As List=root.Get("items")
	For Each mDataItem As Map In lstItems
		Log(mDataItem)
	Next
	
	Return True
	
End Sub


'Sub EnvioDatosAPIMagentoInformacionPedidoCliente(Token As String, TipoIdentificador As String, IDSel As Int) As ResumableSub
Sub EnvioDatosAPIMagentoInformacionPedidoClienteSearch(Token As String, IDSel As Int) As ResumableSub
	

	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/?
	searchCriteria[filterGroups][0][filters][0][field]=entity_id&
	searchCriteria[filterGroups][0][filters][0][value]=${IDSel}&
	searchCriteria[filterGroups][0][filters][0][condition_type]=eq"$


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

Sub CargaDatosDireccionCliente(IDDireccionSel As Int, TipoDireccion As String) As ResumableSub
	
	'mSQL.ExecNonQuery("delete from tblB2BLineasPedidoCliente")

	'wait for(EnvioDatosAPIMagentoInformacionPedidoCliente(mTk,TipoIdentificador, IDSel)) complete (sResp As String)
	wait for(EnvioDatosAPIMagentoInformacionDireccionCliente(mTk, IDDireccionSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then
		If sResp.StartsWith($"ERROR HTTPJob {"message":"No such entity with %fieldName = %fieldValue","parameters":{"fieldName":"addressId","fieldValue":${IDDireccionSel}}"$) Then
			Select Case TipoDireccion
				Case "Facturacion"
					'mDatosCabeceraPedidoCliente.CodigoDireccionEnvioERP=value
					Return True
				Case "Envio"
					mDatosCabeceraPedidoCliente.CodigoDireccionEnvioERP=""
					Return True
			End Select
		Else
			Return False
		End If
	End If

	
	Dim mDataPedido As Map
	mDataPedido.Initialize
	
	

	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd HH:mm:ss"
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim lstCustomAttributes As List=root.Get("custom_attributes")
	For Each mCustomAttributes As Map In lstCustomAttributes
		Dim attribute_code As String = mCustomAttributes.Get("attribute_code")
		Dim value As String = mCustomAttributes.Get("value")
'		If attribute_code="customer_code" Then
'			mDatosCabeceraPedidoCliente.CodigoClienteERP=value
'		End If
		If attribute_code="code" Then
			Select Case TipoDireccion
				Case "Facturacion"
					'mDatosCabeceraPedidoCliente.CodigoDireccionEnvioERP=value
				Case "Envio"
					mDatosCabeceraPedidoCliente.CodigoDireccionEnvioERP=value
			End Select
			
		End If
		
	Next
	
	DateTime.DateFormat=DateFormatAnt
	
	Return True
	
End Sub


Sub EnvioDatosAPIMagentoInformacionDireccionCliente(Token As String, IDDireccionSel As Int) As ResumableSub
	

	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/customers/addresses/${IDDireccionSel}"$

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


Sub EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL(Token As String, IDSel As Int) As ResumableSub
	

	Dim sQueryAPI As String=$"https://proingroup-webstorepre.com/index.php/rest/V1/orders/?
	searchCriteria[filterGroups][0][filters][0][field]=entity_id&
	searchCriteria[filterGroups][0][filters][0][value]=${IDSel}&
	searchCriteria[filterGroups][0][filters][0][condition_type]=eq"$


'	Dim job As HttpJob
'	job.Initialize("",Me)
'
'	job.Download(sQueryAPI)
'
'	job.GetRequest.SetHeader("Accept","application/json")
'	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
''	job.GetRequest.SetContentType("application/json")
'	job.GetRequest.Timeout=15000
	
	Dim job As HttpJob
	job.Initialize("", Me)
	job.Download($"https://www.../graphql?query={yourQuery}"$)  '  pendiente de ver cómo adaptarlo
	job.Download(sQueryAPI)
	'job.GetRequest.SetHeader("Content-Type", "application/json")
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.SetHeader("Authorization", $"Bearer ${Token}"$)
	job.GetRequest.SetHeader("Accept", "application/json")
	
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


Private Sub CargaInfoDireccionesClienteMagento(IDClienteSel As Int) As ResumableSub

'	Wait For(SeleccionarCliente) complete (IDClienteSel As Int)
'	If IDClienteSel=-1 Then Return

'	Dim mDireccionesCliente As Map
'	mDireccionesCliente.Initialize
	
	mSQL.ExecNonQuery("delete from tblB2BDireccionesCliente")
	
	wait for(EnvioDatosAPIMagentoInformacionCliente(mTk,IDClienteSel)) complete (sResp As String)
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
		Dim lstAddressCustomAttributes As List=mAddress.Get("custom_attributes")
		If lstAddressCustomAttributes.IsInitialized Then
			For Each mAddressCustomAttributes As Map In lstAddressCustomAttributes
				Log(mAddressCustomAttributes)
				If mAddressCustomAttributes.Get("attribute_code")="code" Then
					
				End If
			Next
		End If
		Dim Street As List=mAddress.Get("Street")
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
		
'		([firstname] TEXT,[lastname] TEXT, [city] TEXT
'		, customer_code TEXT default'' , code TEXT default'', [region_id] INTEGER
'		, [postcode] TEXT, [telephone] INTEGER, [default_shipping] TEXT default '', [default_billing] TEXT default '',[custom_attributes] TEXT
'		, [street] TEXT default '', [street1] TEXT default '', [street2] TEXT default '', [street3] TEXT default '', [company] TEXT
'		, [id] INTEGER, [customer_id] INTEGER, [region] TEXT, [country_id] TEXT)"$
		
		
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





#Region CSVPedido

Sub GenerarCSVPedidoVenta
		
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat=DateFormatAnt
	
	Dim lstLineasPedidoVenta As List
	lstLineasPedidoVenta.Initialize
	
	Dim UUIDPedido As String=Utilidades.GenerarUUIDv4
	Dim DocumentoExterno As String
	
	DateTime.DateFormat="dd/MM/yyyy"
	Dim sFechaPedidoCliente As String=DateTime.Date(mDatosCabeceraPedidoCliente.FechaCreacion)
	DateTime.Dateformat=DateFormatAnt
	
	Dim sSQL As String="select CodigoArticuloNAV, TallaB2B, QtyPedida, Precio from tblB2BLineasPedidoCliente order by LineaPedido"
	Dim rs As ResultSet=mSQL.ExecQuery(sSQL)
	Do While rs.NextRow
							
		Dim DatosLineaPedido(12) As String
		DatosLineaPedido(0)=$"${UUIDPedido}"$
		DatosLineaPedido(1)=Main.DatosUsuario.NombreADUsuarioWindows
		DatosLineaPedido(2)=mDatosCabeceraPedidoCliente.CodigoClienteERP
		DatosLineaPedido(3)=mDatosCabeceraPedidoCliente.CodigoDireccionEnvioERP
		DatosLineaPedido(4)=mDatosCabeceraPedidoCliente.OrdenCompra
		DatosLineaPedido(5)="0001"
		DatosLineaPedido(6)=sFechaPedidoCliente
		DatosLineaPedido(7)=rs.GetString("CodigoArticuloNAV")
		DatosLineaPedido(8)=""
		DatosLineaPedido(9)=rs.GetString("TallaB2B")
		DatosLineaPedido(10)=rs.GetDouble("QtyPedida")
		DatosLineaPedido(11)=rs.GetDouble("Precio")
		
		lstLineasPedidoVenta.Add(DatosLineaPedido)
	Loop
	rs.Close		

	DateTime.DateFormat=DateFormatAnt
	Dim lstHeaders As List=Array As String("Docuware ID", "Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen", _
		"FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio")
	Dim CarpetaFicheroCSV As String="\\192.168.10.6\PendientesNAV"
	Dim NombreFicheroCSV As String=$"B2B_${UUIDPedido}.csv"$
	Dim su As StringUtils
	Try
		su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,";",lstLineasPedidoVenta, lstHeaders)
		Dim msa As Object=xui.MsgboxAsync($"Fichero ${NombreFicheroCSV} creado en la carpeta del servidor.
Queda pendiente de convertir en Pedido de Venta en navision. Procésalo mediante el módulo de integración de pedidos de venta de navision."$,"Aviso")
		Wait For (msa) Msgbox_Result
	Catch
		Log(LastException)
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible generar el fichero CSV.
${LastException.Message}."$,"ERROR")
		Wait For (msa) Msgbox_Result
	End Try

End Sub


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

#End Region




