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
	
	Private Dialog As B4XDialog
	
	Public PermisoModuloUsuario As String
	Private btnSalir As B4XView
	
	Private jamLoadingIndicator1 As JamLoadingIndicator
	
	Private RutaFicheroSeleccionado As String
	
	Private btnSelFicheroFTP As B4XView
	Private txtFicheroSeleccionado As B4XView
	Private txtCIFCliente As B4XView
	Private pnlFondoGeneracionFicherosCSVPedidosVenta As B4XView
	Private lblItemBuscarCienteDireccionEnvio As B4XView
	Private lblCancelarBuscarClienteDireccionEnvio As B4XView
	Private lblTitleBuscarClienteDireccionEnvio As B4XView
	Private lblTitleDatoBuscar As B4XView
	Private pnlFondoBuscarClienteDireccionEnvio As B4XView
	Private txtBuscarClienteDireccionEnvio As B4XView
	Private chkboxFiltroCIF As CheckBox
	Private CLVBuscarClienteDireccionEnvio As CustomListView
	
	Private AnchoCLV As Double
	Private mAlturaItems As Double
	Public ColorFondoPanelItemsImpares As Int
	Public ColorFondoPanelItemsPares As Int
	Private ArrayColoresItems(2) As Int
	
	Private BackgroundBuscarClienteDireccionEnvio As B4XView
	Private BaseBuscarClienteDireccionEnvio As B4XView
	Private CampoBusqueda As String
	
	
'	Private ClienteSeleccionado As String
'	Private CIFClienteSeleccionado As String
'	Private DireccionEnvioSeleccionada As String
	
	Private txtCodigoCliente As B4XView
	Private txtNombreCliente As B4XView
	Private txtCodigoDireccionEnvio As B4XView
	Private txtNombreDireccionEnvio As B4XView
	Private btnSelDocumentoExterno As B4XView
	Private txtDocumentoExterno As B4XView
	Private btnSelFechaPedidoCliente As B4XView
	Private txtFechaPedidoCliente As B4XView
	Private btnSelAlmacen As B4XView
	Private txtAlmacen As B4XView
	
	Type TipoDatosPlantillaPedidoVentaCab (CodigoCliente As String, NombreCliente As String, GRPCliente As String, CIFCliente As String, CodigoDireccionEnvio As String, NombreDireccionEnvio As String, _
		FechaPedidoCliente As Long, AlmacenOrigen As String, DocumentoExterno As String)
		
	Private DatosPlantillaPedidoVentaCab As TipoDatosPlantillaPedidoVentaCab
	

	Private jamTableView1 As jamTableView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
	CreacionTablasSQLite
End Sub

public Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrGeneracionFicherosCSVPedidosVenta")
	
	Sleep(0)

	frm.Title=Main.PrefijoTitleForms & "Generación Ficheros CSV Plantilla Pedidos Venta"
	
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,False)
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Procesar datos plantilla","ProcesarDatosPlantilla",Chr(0xF1C3),jamTableView1.MenuBarAcciones)
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Generar Fichero CSV","GenerarFicheroCSV",Chr(0xF016),jamTableView1.MenuBarAcciones)
		
		
'	jamTableView1.AbrirCamposBuilder
'	Return
'		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaGeneracionFicherosCSVPedidosVentaLineasPedido.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AlturaFilas=0
		
	Dialog.Initialize (frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	ColorFondoPanelItemsImpares=0xFFF1F1F1
	ColorFondoPanelItemsPares=xui.Color_White
	
	ArrayColoresItems(0)=ColorFondoPanelItemsImpares
	ArrayColoresItems(1)=ColorFondoPanelItemsPares
	
	LimpiarDatos
	
	frm.Show
	
	jamLoadingIndicator1.MensajeLoading="Cargando datos clientes/direcciones envío..."
	jamLoadingIndicator1.Show
	Wait For(CargaClientesDireccionesEnvioDW) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		SalirModulo
		Return
	End If
	
End Sub


Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Private Sub btnSalir_Click
	SalirModulo
End Sub


private Sub SalirModulo
	LimpiarDatos
	frm.Close
	MainMenu2.Show
End Sub

Sub CreacionTablasSQLite
	
	'mSQL.ExecNonQuery("drop table if exists tblClientesDireccionesEnvioDW")

	mSQL.ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW")
	'mSQL.ExecNonQuery("drop table if exists [tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW]")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW ([Fila] INTEGER, [CodigoCliente] TEXT, [ClienteComb] TEXT, [CodigoDireccionEnvio] TEXT, [DireccionEnvioComb] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")
	'mSQL.ExecNonQuery("drop table if exists [tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW]")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido ( [ReferenciaCruzada] TEXT, [CodigoArticulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Cantidad] INTEGER, [Precio] REAL)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo")
	'mSQL.ExecNonQuery("drop table if exists [tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW]")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo ([CodigoArticulo] TEXT, [TotalCantidad] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)

	mSQL.ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente] ([TipoTarifa] INTEGER, [CodigoTarifa] TEXT
	, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, [Moneda] TEXT, [UM] TEXT, [CantidadMinima] REAL, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER
	, [NumTarifa] INTEGER, [UMVenta] TEXT, [FechaCreacion] INTEGER, [CosteUnitario] REAL, [CosteSTD] REAL, [FechaCosteSTD] INTEGER, [GRC] TEXT, [CompraFab] INTEGER
	, [CosteRazonable] REAL, [FechaCosteRazonable] INTEGER, [Ruta] TEXT, [NombreRuta] TEXT, [LM] TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
End Sub

Sub SeleccionFicheroCarpetaRed As ResumableSub

	Dim fc As FileChooser
	fc.Initialize
	fc.Title="Selecciona Fichero"
	fc.SetExtensionFilter("Ficheros texto", Array As String("*.xlsx","*.xls"))
	'fc.InitialFileName=""
	'fc.InitialDirectory=Main.UserFolder
	fc.InitialDirectory=Utilidades.FindUserDocumentsFolder
	Dim fileName As String = fc.ShowOpen(frm)
	Return fileName
	
End Sub

Private Sub btnSelFicheroPlantillaPedidoVenta_Click
	
	If RutaFicheroSeleccionado<>"" Then
		wait for(Utilidades.MsgBox2XUI("Confirma",$"Ya se ha seleccionado previamente un fichero.
¿Continuar?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	RutaFicheroSeleccionado=""
	LimpiarDatos
	
	wait for(SeleccionFicheroCarpetaRed) complete (sRutaFicheroSel As String)
	If sRutaFicheroSel="" Then
		Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado fichero","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	RutaFicheroSeleccionado=sRutaFicheroSel
	txtFicheroSeleccionado.Text=RutaFicheroSeleccionado
	
	ProcesoCabeceraFicheroSeleccionado
End Sub

Sub ProcesoCabeceraFicheroSeleccionado
	
	Dim xl As XLUtils
	xl.Initialize
	Dim xlResult As XLReaderResult=xl.Reader.ReadSheetByIndex(File.GetFileParent(RutaFicheroSeleccionado), File.GetName(RutaFicheroSeleccionado), 0) 
	DatosPlantillaPedidoVentaCab.CIFCliente=xlResult.Get(xl.AddressName("C5"))
	DatosPlantillaPedidoVentaCab.DocumentoExterno=xlResult.Get(xl.AddressName("C13"))
	txtCIFCliente.text=DatosPlantillaPedidoVentaCab.CIFCliente
	txtDocumentoExterno.text=DatosPlantillaPedidoVentaCab.DocumentoExterno
	DatosPlantillaPedidoVentaCab.FechaPedidoCliente=DateTime.Now
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtFechaPedidoCliente.Text=DateTime.Date(DatosPlantillaPedidoVentaCab.FechaPedidoCliente)
	DatosPlantillaPedidoVentaCab.AlmacenOrigen="0001"
	txtAlmacen.Text=DatosPlantillaPedidoVentaCab.AlmacenOrigen
	DateTime.DateFormat=DateFormatAnt
End Sub

Sub LimpiarDatos
	DatosPlantillaPedidoVentaCab.Initialize
	CampoBusqueda="Cliente"
'	ClienteSeleccionado=""
'	CIFClienteSeleccionado=""
'	chkboxFiltroCIF.Checked=False
'	DireccionEnvioSeleccionada=""
	For Each xNode As B4XView In pnlFondoGeneracionFicherosCSVPedidosVenta.GetAllViewsRecursive
		If xNode Is TextField Then
			xNode.Text=""
		End If
	Next
	
	jamTableView1.LimpiarTabla
End Sub



Sub CargaClientesDireccionesEnvioDW As ResumableSub

	mSQL.ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW")
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="ClientesDireccionesEnvioDW"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)

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
			Dim msa As Object=xui.MsgboxAsync("No hay datos de clientes-direcciones envío de navision.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData0 As Map=lstReg.Get(0)
			Utilidades.LogStringCrearTablaDesdeMap("tblEvaluacionProveedores",mData0,"")
			Accion="OK"
			mRes.Put("Accion", Accion)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW",lstReg)
		End If
	End If
	Return mRes
End Sub

Private Sub txtBuscarClienteDireccionEnvio_TextChanged (Old As String, New As String)
	ActualizarDatosCLV
End Sub


Sub ActualizarDatosCLV
	
	CLVBuscarClienteDireccionEnvio.Clear
	
	Dim NumPanel As Int
	
	AnchoCLV=CLVBuscarClienteDireccionEnvio.AsView.Width
	mAlturaItems=25dip

			
		
	'pnl.SetColorAndBorder(ColorFondoPanelActual,AnchoBordeItems,ColorBordeItems,0)
	Select Case CampoBusqueda
		Case "Cliente"
			If chkboxFiltroCIF.Checked Then
				Dim rs As ResultSet=mSQL.ExecQuery2($"Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb like ? order by CodigoCliente"$, _
					Array As String($"%${DatosPlantillaPedidoVentaCab.CIFCliente}%"$))
			Else
				If txtBuscarClienteDireccionEnvio.Text="" Then
					Dim rs As ResultSet=mSQL.ExecQuery($"Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW order by CodigoCliente"$)
				Else
					Dim rs As ResultSet=mSQL.ExecQuery2($"Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb like ? order by CodigoCliente"$, _
						Array As String($"%${txtBuscarClienteDireccionEnvio.Text}%"$))
				End If
			End If
			
		Case "DireccionEnvio"
			If txtBuscarClienteDireccionEnvio.Text="" Then
				Dim rs As ResultSet=mSQL.ExecQuery2($"Select DireccionEnvioComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? order by CodigoDireccionEnvio"$, _
					Array As String(DatosPlantillaPedidoVentaCab.CodigoCliente))
			Else
				Dim rs As ResultSet=mSQL.ExecQuery2($"Select DireccionEnvioComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and DireccionEnvioComb like ? order by CodigoDireccionEnvio"$, _
					Array As String(DatosPlantillaPedidoVentaCab.CodigoCliente, $"%${txtBuscarClienteDireccionEnvio.Text}%"$))
			End If
	End Select
	
	
	Do While rs.NextRow
		Dim pnl As B4XView = xui.CreatePanel(Null)
		pnl.SetLayoutAnimated(0, 0, 0, AnchoCLV, mAlturaItems)
		
		'pnl.Color=ArrayColoresItems(NumPanel Mod 2)
		'pnl.Color=0xFF696969
		pnl.Color=0xFFDCDCDC
		Dim sCombi As String=rs.GetString2(0)
		CLVBuscarClienteDireccionEnvio.Add(pnl,sCombi)
		NumPanel=NumPanel+1
	Loop
	rs.Close

	
End Sub


Sub CLVBuscarClienteDireccionEnvio_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	Dim ExtraSize As Int = 30 'Add 5 items at a time, this can be changed to suite your requirements
	For i = Max(0, FirstIndex - ExtraSize) To Min(LastIndex + ExtraSize, CLVBuscarClienteDireccionEnvio.Size - 1) 'Loop for adding/removing your items layout to or from the list
		Dim Pnl As B4XView = CLVBuscarClienteDireccionEnvio.GetPanel(i) 'Declare a new B4XView
'		If ColActualCLV=Col1 Then
'			ColActualCLV=Col2
'		Else
'			ColActualCLV=Col1
'		End If
'		Pnl.SetColorAndBorder(ColActualCLV,1,xui.Color_Gray,0)
		
		If i > FirstIndex - ExtraSize And i < LastIndex + ExtraSize Then 'Add a new item to the list
			If Pnl.NumberOfViews = 0 Then 'Add items to the list
				'Dim mData As Map = CLVBuscarClienteDireccionEnvio.GetValue(i) 'Get your custom Type
				Dim sData As String = CLVBuscarClienteDireccionEnvio.GetValue(i) 'Get your custom Type
				Pnl.LoadLayout("scrGeneracionFicherosCSVPlantillaPedidosVentaItemListaBuscar")
				
				lblItemBuscarCienteDireccionEnvio.Text=sData

'				txtAlmacenDocumento.Text=mData.Get("AlmacenDocumento")
'				txtAlmacenFisico.Text=mData.Get("AlmacenFisico")
'				txtCliente.Text=mData.Get("Cliente")
'				Dim PeriodDiasAcum As Period=DateUtils.PeriodBetweenInDays(mData.Get("FechaDocumento"), DateTime.Now)
'				txtDiasAcum.Text=PeriodDiasAcum.Days
'				txtDocumento.Text=mData.Get("Documento")
'				txtFase.Text=mData.Getdefault("Fase","")
'				
'				Dim DateFormatAnt As String=DateTime.DateFormat
'				DateTime.DateFormat="dd/MM/yyyy"
'				Dim TimeFormatAnt As String=DateTime.timeFormat
'				DateTime.TimeFormat	="HH:mm"
'				txtFechaDocumento.Text=DateTime.Date(mData.Get("FechaDocumento"))
'				If mData.Getdefault("FechaFase",0)>0 Then
'					txtFechaFase.Text=DateTime.date(mData.Getdefault("FechaFase",0)) & " " & DateTime.time(mData.Getdefault("FechaFase",0))
'				End If
'				DateTime.DateFormat=DateFormatAnt
'				DateTime.TimeFormat=TimeFormatAnt
'
'				txtInfoAdicionalFase.Text=mData.Getdefault("InfoAdicionalFase","")
'				txtNombreCliente.Text=mData.Get("NombreCliente")
'				txtObservaciones.Text=mData.Getdefault("Observaciones","")
'				txtPersonalizado.Text=mData.Get("Personalizado")
'				txtPrioridad.Text=mData.Getdefault("Prioridad","")
'				txtResponsableFase.Text=mData.Getdefault("ResponsableFase","")
'				txtTipoDocumento.Text=mData.Get("TipoDocumento")
'				Dim TotalImp As Double=mData.Get("TotalImp")
'				txtTotalImp.Text=NumberFormat(TotalImp,1,0)
'				Dim TotalQty As Double=mData.Get("TotalQty")
'				txtTotalQty.Text=NumberFormat(TotalQty,1,0)
'				txtPersonalizado.Text=mData.Get("Personalizado")
'				
'				txtNumExpedicion.Text=mData.GetDefault("NumExpedicion","")
				
				'(*) ejemplo para modificar el alto de un item
				' Dim AltoTextArea=JamTableCLV1.MedirAlturaTextoMultilinea ....
				'JamTableCLV1.ResizeItem(i,txtObservaciones.Top+txtObservaciones.PrefHeight+5dip)
			End If
		Else 'Remove items from the list
			If Pnl.NumberOfViews > 0 Then
				Pnl.RemoveAllViews 'Remove none visible item from the main xCLV layout
			End If
		End If
	Next
	
End Sub

Sub CLVBuscarClienteDireccionEnvio_ItemClick(Index As Int, Value As Object)
	'Dim mData As Map=Value
	Dim sData As String=Value
	Log("Datos Item seleccionado (" & Index & "): " )
	
	BackgroundBuscarClienteDireccionEnvio.RemoveAllViews
	BackgroundBuscarClienteDireccionEnvio.RemoveViewFromParent
	
	Select Case CampoBusqueda
		
		Case "Cliente"
			jamLoadingIndicator1.MensajeLoading=$"Cargando datos de cliente..."$
			jamLoadingIndicator1.Show
			mSQL.ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")
			
			Dim ClienteSel As String=mSQL.ExecQuerySingleResult2("select distinct CodigoCliente from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb=?", _
				Array As String(sData))
			Dim PrimerGuion As Int=sData.IndexOf2("_",0)
			Dim SegundoGuion As Int=sData.IndexOf2("_",PrimerGuion+1)
			Dim NombreClienteSel As String=sData.SubString2(PrimerGuion+1,SegundoGuion)
			DatosPlantillaPedidoVentaCab.CodigoCliente=ClienteSel
			DatosPlantillaPedidoVentaCab.NombreCliente=NombreClienteSel
			txtCodigoCliente.Text=DatosPlantillaPedidoVentaCab.CodigoCliente
			txtNombreCliente.Text=DatosPlantillaPedidoVentaCab.NombreCliente
			
			jamLoadingIndicator1.MensajeLoading=$"Cargando datos de tipo tarifa y codigo tarifa precios venta cliente ${DatosPlantillaPedidoVentaCab.CodigoCliente}..."$
			Wait For(CargaGRPClientePedido) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then
				jamLoadingIndicator1.Close
				Dim msa As Object=xui.MsgboxAsync($"No ha sido posible cargar el tipo tarifa y código tarifa de precios aplicables al cliente seleccionado ${DatosPlantillaPedidoVentaCab.CodigoCliente}"$,"Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim lstReg As List=mRes.Get("lstReg")
			Dim mDataReg As Map=lstReg.Get(0)
			DatosPlantillaPedidoVentaCab.GRPCliente=mDataReg.Get("GRP")
			
			jamLoadingIndicator1.MensajeLoading=$"Cargando datos de precios venta del cliente ${DatosPlantillaPedidoVentaCab.CodigoCliente}..."$
			Wait For(CargaTarifaVentaValidaActualAplicableClientePedido(0, DatosPlantillaPedidoVentaCab.CodigoCliente,True)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then
				jamLoadingIndicator1.Close
				Dim msa As Object=xui.MsgboxAsync($"No ha sido posible cargar los datos de la tarifa de precios del cliente seleccionado ${DatosPlantillaPedidoVentaCab.CodigoCliente}"$,"Aviso")
				Wait For (msa) Msgbox_Result
			End If
			
			If DatosPlantillaPedidoVentaCab.GRPCliente<>"" Then
				jamLoadingIndicator1.MensajeLoading=$"Cargando datos de precios venta del grupo precios cliente ${DatosPlantillaPedidoVentaCab.GRPCliente}..."$
				Wait For(CargaTarifaVentaValidaActualAplicableClientePedido(1, DatosPlantillaPedidoVentaCab.GRPCliente,False)) complete (mRes As Map)
				Dim Accion As String=mRes.Get("Accion")
				If Accion="NOK" Then
					jamLoadingIndicator1.Close
					Dim msa As Object=xui.MsgboxAsync($"No ha sido posible cargar los datos de la tarifa de precios del grupo precios cliente seleccionado ${DatosPlantillaPedidoVentaCab.GRPCliente}"$,"Aviso")
					Wait For (msa) Msgbox_Result
				End If
			End If
			
			jamLoadingIndicator1.Close
			

		
		Case "DireccionEnvio"
			Dim DirEnvioSel As String=mSQL.ExecQuerySingleResult2("select distinct CodigoDireccionEnvio from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where DireccionEnvioComb=?", _
				Array As String(sData))
			Dim PrimerGuion As Int=sData.IndexOf2("_",0)
			Dim SegundoGuion As Int=sData.IndexOf2("_",PrimerGuion+1)
			Dim NombreDirEnvioSel As String=sData.SubString2(PrimerGuion+1,SegundoGuion)
			DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio=DirEnvioSel
			DatosPlantillaPedidoVentaCab.NombreDireccionEnvio=NombreDirEnvioSel
			txtCodigoDireccionEnvio.Text=DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio
			'txtNombreDireccionEnvio.Text=DatosPlantillaPedidoVentaCab.NombreDireccionEnvio
			txtNombreDireccionEnvio.Text=sData.Replace("_","   ")
			
	End Select
	
	
'	For Each k In mData.Keys
'		Log(k & ": " & mData.Get(k))
'	Next
End Sub

'botón derecho
Sub CLVBuscarClienteDireccionEnvio_ItemLongClick(Index As Int, Value As Object)
	'Dim mData As Map=Value
	Dim sData As String=Value
	Log("Datos Item seleccionado botón secundario (" & Index & "): " )
'	For Each k In mData.Keys
'		Log(k & ": " & mData.Get(k))
'	Next
End Sub

Private Sub lblCancelarBuscarClienteDireccionEnvio_MouseClicked (EventData As MouseEvent)
	BackgroundBuscarClienteDireccionEnvio.RemoveAllViews
	BackgroundBuscarClienteDireccionEnvio.RemoveViewFromParent
End Sub

Private Sub lblCancelarBuscarClienteDireccionEnvio_MouseEntered (EventData As MouseEvent)
	
End Sub

Private Sub lblCancelarBuscarClienteDireccionEnvio_MouseExited (EventData As MouseEvent)
	
End Sub

Private Sub lblCancelarBuscarClienteDireccionEnvio_MousePressed (EventData As MouseEvent)
	
End Sub

Private Sub btnSelCliente_Click
	If DatosPlantillaPedidoVentaCab.CodigoCliente<>"" Then
		wait for(Utilidades.MsgBox2XUI("Confirma",$"Ya hay seleccionado un cliente.
Seleccionar otro cliente?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	CampoBusqueda="Cliente"
	DatosPlantillaPedidoVentaCab.CodigoCliente=""
	DatosPlantillaPedidoVentaCab.NombreCliente=""
	DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio=""
	DatosPlantillaPedidoVentaCab.NombreDireccionEnvio=""
	txtCodigoCliente.Text=""
	txtNombreCliente.Text=""
	txtCodigoDireccionEnvio.Text=""
	txtNombreDireccionEnvio.Text=""

	MostrarPanelBuscarClienteDireccionEnvio
	
	chkboxFiltroCIF.Checked=True
	ActualizarDatosCLV
End Sub

Private Sub btnSelDireccionEnvio_Click
	If DatosPlantillaPedidoVentaCab.CodigoCliente="" Then
		Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado cliente","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	If DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio<>"" Then
		wait for(Utilidades.MsgBox2XUI("Confirma",$"Ya hay seleccionada una dirección de envío.
Seleccionar otra dirección de envío?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Dim NumDirEnv As Int=mSQL.ExecQuerySingleResult2("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and CodigoDireccionEnvio<>?", _
		Array As String(DatosPlantillaPedidoVentaCab.CodigoCliente,""))
	
	If NumDirEnv=0 Then
		Dim msa As Object=xui.MsgboxAsync($"El Cliente seleccionado (${DatosPlantillaPedidoVentaCab.CodigoCliente}) no tiene direcciones de envío."$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return 
	End If
	
	CampoBusqueda="DireccionEnvio"
	DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio=""
	DatosPlantillaPedidoVentaCab.NombreDireccionEnvio=""
	txtCodigoDireccionEnvio.Text=""
	txtNombreDireccionEnvio.Text=""
	MostrarPanelBuscarClienteDireccionEnvio
	
	chkboxFiltroCIF.Checked=True
	ActualizarDatosCLV
	
	
End Sub

Sub MostrarPanelBuscarClienteDireccionEnvio
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundBuscarClienteDireccionEnvio" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundBuscarClienteDireccionEnvio= xui.CreatePanel("BackgroundBuscarClienteDireccionEnvio")
	BackgroundBuscarClienteDireccionEnvio.Tag = "BackgroundBuscarClienteDireccionEnvio"
	'BackgroundBuscarClienteDireccionEnvio.Color=0xaa000000
	BackgroundBuscarClienteDireccionEnvio.Color=0x3FD3D3D3
	frm.RootPane.AddNode(BackgroundBuscarClienteDireccionEnvio, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseBuscarClienteDireccionEnvio=xui.CreatePanel("pnlBaseBuscarClienteDireccionEnvio")
	BaseBuscarClienteDireccionEnvio.SetLayoutAnimated(0,0,0,1000dip, 750dip)
	BaseBuscarClienteDireccionEnvio.LoadLayout("scrGeneracionFicherosCSVPlantillaPedidosVentaBuscarClienteDireccionEnvio")

	BackgroundBuscarClienteDireccionEnvio.AddView(BaseBuscarClienteDireccionEnvio,(BackgroundBuscarClienteDireccionEnvio.Width/2-BaseBuscarClienteDireccionEnvio.Width/2), _
		(BackgroundBuscarClienteDireccionEnvio.Height/2-BaseBuscarClienteDireccionEnvio.Height/2), BaseBuscarClienteDireccionEnvio.Width, BaseBuscarClienteDireccionEnvio.Height)
		
	chkboxFiltroCIF.Visible=CampoBusqueda="Cliente"
	
	lblTitleDatoBuscar.Text=IIf(CampoBusqueda="Cliente","Cliente","Dirección Envío")
		
End Sub

Private Sub btnSelAlmacen_Click
	Dialog.Title="Indica el Almacén Origen"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	B4XInput.Text=IIf(DatosPlantillaPedidoVentaCab.AlmacenOrigen="","0001",DatosPlantillaPedidoVentaCab.AlmacenOrigen)
	B4XInput.lblTitle.Text=$""$
	'B4XInput.ConfigureForNumbers(True,False)
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
	DatosPlantillaPedidoVentaCab.AlmacenOrigen=B4XInput.Text
	txtAlmacen.Text=DatosPlantillaPedidoVentaCab.AlmacenOrigen
End Sub

Private Sub btnSelFechaPedidoCliente_Click
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	
	
	Dialog.Title="Indica Fecha Pedido Cliente"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If DatosPlantillaPedidoVentaCab.FechaPedidoCliente=0 Then
		B4XDateDlg.Date=DateTime.now
	Else
		B4XDateDlg.Date=DatosPlantillaPedidoVentaCab.FechaPedidoCliente
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
		DateTime.DateFormat=DateFormatAnt
		Return
	End If
	Dim FechaPedCli As Long=B4XDateDlg.Date
	DatosPlantillaPedidoVentaCab.FechaPedidoCliente=FechaPedCli
	txtFechaPedidoCliente.Text=DateTime.Date(DatosPlantillaPedidoVentaCab.FechaPedidoCliente)
	
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSelDocumentoExterno_Click
	Dialog.Title="Indica el Documento Externo"
	Dim B4XInput As B4XInputTemplate
	B4XInput.Initialize
	B4XInput.Text=DatosPlantillaPedidoVentaCab.DocumentoExterno
	B4XInput.lblTitle.Text=$"(Pedido del Cliente)"$
	'B4XInput.ConfigureForNumbers(True,False)
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
	DatosPlantillaPedidoVentaCab.DocumentoExterno=B4XInput.Text.ToUpperCase
	txtDocumentoExterno.Text=DatosPlantillaPedidoVentaCab.DocumentoExterno
End Sub




Private Sub chkboxFiltroCIF_CheckedChange(Checked As Boolean)
	txtBuscarClienteDireccionEnvio.Text=""
	ActualizarDatosCLV
End Sub

Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "ProcesarDatosPlantilla"
			Wait For(CheckDatosCabeceraObligatorios) complete (Success As Boolean)
			If Not(Success) Then Return
			
			ProcesarLineasPlantillaPedidoVenta
		
		Case "GenerarFicheroCSV"
		
			GenerarFicheroCSVPedidoVenta
		
		
	End Select
End Sub


Sub CheckDatosCabeceraObligatorios As ResumableSub
	
	If DatosPlantillaPedidoVentaCab.CodigoCliente="" Then
		Dim msa As Object=xui.MsgboxAsync("El Código de Cliente es obligatorio.","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	Dim NumDirEnv As Int=mSQL.ExecQuerySingleResult2("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and CodigoDireccionEnvio<>?", _
		Array As String(DatosPlantillaPedidoVentaCab.CodigoCliente,""))
	
	If NumDirEnv>0 And DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio="" Then
		Dim msa As Object=xui.MsgboxAsync($"El Cliente seleccionado (${DatosPlantillaPedidoVentaCab.CodigoCliente}) tiene direcciones de envío.
Es obligatorio seleccionar Dirección de envío."$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	If DatosPlantillaPedidoVentaCab.AlmacenOrigen="" Then
		Dim msa As Object=xui.MsgboxAsync("El Almacén de Origen es obligatorio.","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	If DatosPlantillaPedidoVentaCab.FechaPedidoCliente=0 Then
		Dim msa As Object=xui.MsgboxAsync("La Fecha de Pedido de cliente es obligatoria.","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	If DatosPlantillaPedidoVentaCab.DocumentoExterno=0 Then
		Dim msa As Object=xui.MsgboxAsync("El documento externo (Pedido de cliente) es obligatorio.","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	Return True
End Sub

Sub ProcesarLineasPlantillaPedidoVenta
	
	Dim NumLineasProcesadas As Int=mSQL.ExecQuerySingleResult("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")
	If NumLineasProcesadas>0 Then
		Dim msa As Object = xui.Msgbox2Async($"Hay ${NumLineasProcesadas} líneas procesadas.
¿Eliminar estas líneas y procesar de nuevo el fichero?"$,"Confirma", "Sí","Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	mSQL.ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")
	mSQL.ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo")
	
	If File.Exists(File.GetFileParent(RutaFicheroSeleccionado),File.GetName(RutaFicheroSeleccionado))=False Then
		Dim msa As Object=xui.MsgboxAsync($"El fichero seleccionado ${RutaFicheroSeleccionado} no existe."$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim xl As XLUtils
	xl.Initialize
	
	Dim WorkbookWriter As XLWorkbookWriter = xl.CreateWriterFromTemplate(RutaFicheroSeleccionado, "")
	Dim SheetWriter As XLSheetWriter=WorkbookWriter.CreateSheetWriterByIndex(0)
	
	'Dim TallasStyle As XLStyle = WorkbookWriter.CreateStyle.DataFormat("TEXT")
	'Dim TallasStyle As XLStyle = WorkbookWriter.CreateStyle.DataFormat("@")
	
'	CellStyle numericStyle = workbook.createCellStyle();
'	numericStyle.setDataFormat(BuiltinFormats.getBuiltinFormat(2)); // 2 For Number
'	worksheet.setDefaultColumnStyle(colId, numericStyle);

'	Dim joTextStyle As JavaObject=TallasStyle
	
	
	Dim xlResult As XLReaderResult=xl.Reader.ReadSheetByIndex(File.GetFileParent(RutaFicheroSeleccionado), File.GetName(RutaFicheroSeleccionado), 0)

	xlResult.LogResult(True)
	Dim BottomRightAddress As XLAddress= xlResult.BottomRight
	Dim UltimaFila As Long=BottomRightAddress.Row0Based
	Dim PrimeraFila As Long
	
	For iDX=0 To UltimaFila
		Dim CeldaX As String=xlResult.Get(xl.AddressOne("B",iDX))
		If CeldaX="REFERENCIA" Then
			PrimeraFila=iDX+1
			Exit
		End If
	Next
	If PrimeraFila=0 Then
		Dim msa As Object=xui.MsgboxAsync("No se ha localizado el encabezado = REFERENCIA.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

	For iDX=PrimeraFila To UltimaFila
		Dim RefFila As String=xlResult.GetDefault(xl.AddressOne("B",iDX),"")
		If RefFila="" Then Exit ' se ha llegado al final de la tabla de referencias
		' POR EL MOMENTO NO CONSIDERAMOS REFERENCIAS CRUZADAS ....PENDIENTE DE PROGRAMAR
		Dim ReferenciaCruzadaFila As String=""
		Dim ArticuloFila As String=RefFila
		
		Dim QtyFila As Double=xlResult.GetDefault(xl.AddressOne("E",iDX),0)
		If QtyFila>0 Then
			Dim DescripcionArticuloFila As String=xlResult.GetDefault(xl.AddressOne("C",iDX),"")
			'Dim sTalla As String=JOCeldaTalla.RunMethod("getStringCellValue",Null)
			'Log($"Cell.ValueString: ${Cell.ValueString}"$)
			'SheetWriter.SetStyle(xl.AddressOne("D",iDX),TallasStyle)
			'Dim TallaFila As String=xlResult.GetDefault(xl.AddressOne("D",iDX),"")
			Dim Cell As PoiCell=SheetWriter.GetCell(xl.AddressOne("D",iDX))
			Cell.CellType=Cell.TYPE_STRING
			Dim TallaFila As String=Cell.ValueString
			Dim PrecioFila As Double=0 ' los precios se evalúan después, para poder agrupar por cantidad por artículo

			mSQL.AddNonQueryToBatch("insert into tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido (ReferenciaCruzada, CodigoArticulo, DescripcionArticulo, Talla, Cantidad, Precio) values (?,?,?,?,?,?)", _
			Array(ReferenciaCruzadaFila, ArticuloFila,DescripcionArticuloFila,TallaFila,QtyFila, PrecioFila))
		End If

	Next
	WorkbookWriter.PoiWorkbook.Close
	
	
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync($"Ha habido un error al procesar las líneas del fichero.
${LastException.Message}
"$,"Error")
		Wait For (msa) Msgbox_Result
	End If
	
	mSQL.ExecNonQuery($"insert into tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo
		select CodigoArticulo, Sum(Cantidad) as TotalCantidad from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido group by CodigoArticulo"$)
		
	Dim rsPrecios As ResultSet=mSQL.ExecQuery($"select CodigoArticulo, Talla from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido"$)
	Do While rsPrecios.NextRow
		Dim ArtSel As String=rsPrecios.GetString("CodigoArticulo")
		Dim TallaSel As String=rsPrecios.GetString("Talla")
		Dim PrecioSel As Double=PrecioVentaArticuloTallaCantidadTarifaAplicableCliente(ArtSel, TallaSel)
		mSQL.AddNonQueryToBatch("update tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido set precio=? where CodigoArticulo=? and Talla=?", Array(PrecioSel, ArtSel, TallaSel))
	Loop
	rsPrecios.Close

	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync($"Ha habido un error al procesar las líneas del fichero.
${LastException.Message}
"$,"Error")
		Wait For (msa) Msgbox_Result
	End If
	
	
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")
	
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

Sub GenerarFicheroCSVPedidoVenta
	
	Dim NumLinPedido As Int=mSQL.ExecQuerySingleResult("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")
	If NumLinPedido=0 Then
		Dim msa As Object=xui.MsgboxAsync("No se han procesado líneas de pedido","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	wait for(Utilidades.MsgBox2XUI("Confirma","¿Generar Fichero CSV para su integración en navision como pedido de venta?","Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim CarpetaFicheroCSV As String="\\192.168.10.6\PendientesNAV"
	
	Dim UUIDPedido As String=Utilidades.GenerarUUIDv4
	Dim IDPedido As String=$"PlantillaPedidosVenta_${UUIDPedido}"$
	Dim NombreFicheroCSV As String=$"${IDPedido}.csv"$
	
	Dim CodigoClienteNAV As String=DatosPlantillaPedidoVentaCab.CodigoCliente
	Dim CodigoDireccionEnvioNAV As String=DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio
	Dim AlmacenOrigen As String=DatosPlantillaPedidoVentaCab.AlmacenOrigen
	Dim DocumentoExterno As String=DatosPlantillaPedidoVentaCab.DocumentoExterno
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim sFechaPedidoCliente As String=DateTime.Date(DatosPlantillaPedidoVentaCab.FechaPedidoCliente)
	DateTime.DateFormat=DateFormatAnt
	
	Dim lstHeaders As List=Array As String("Docuware ID", "Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen", _
		"FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio")
	
	Dim lstLineasPedidoVenta As List
	lstLineasPedidoVenta.Initialize
	
	Dim rsLineasPedido As ResultSet=mSQL.ExecQuery("select ReferenciaCruzada, CodigoArticulo, DescripcionArticulo, Talla, Cantidad, Precio from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")
	Do While rsLineasPedido.NextRow

		Dim ArrDatosLineaPedido(12) As String
		ArrDatosLineaPedido(0)=$"${UUIDPedido}"$
		ArrDatosLineaPedido(1)=Main.DatosUsuario.NombreADUsuarioWindows.ToUpperCase
		ArrDatosLineaPedido(2)=CodigoClienteNAV
		ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV
		ArrDatosLineaPedido(4)=DocumentoExterno
		ArrDatosLineaPedido(5)=AlmacenOrigen
		ArrDatosLineaPedido(6)=sFechaPedidoCliente
		ArrDatosLineaPedido(7)=rsLineasPedido.GetString("CodigoArticulo")
		ArrDatosLineaPedido(8)=rsLineasPedido.GetString("ReferenciaCruzada")
		ArrDatosLineaPedido(9)=rsLineasPedido.GetString("Talla")
		ArrDatosLineaPedido(10)=rsLineasPedido.GetInt("Cantidad")
		ArrDatosLineaPedido(11)=rsLineasPedido.GetDouble("Precio")
						
		lstLineasPedidoVenta.Add(ArrDatosLineaPedido)
		
	Loop
	rsLineasPedido.Close
	
	If lstLineasPedidoVenta.Size>0 Then
		Dim su As StringUtils
		Try
			su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,";",lstLineasPedidoVenta, lstHeaders)
			Dim msa As Object=xui.MsgboxAsync("Fichero csv grabado en el servidor, OK","Aviso")
			Wait For (msa) Msgbox_Result
		Catch
			Log(LastException)
			Dim msa As Object=xui.MsgboxAsync($"No ha sido posible generar el fichero csv. 
${LastException.Message}"$,"ERROR")
			Wait For (msa) Msgbox_Result
		End Try
	End If
	
End Sub

Sub CargaGRPClientePedido As ResumableSub
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="GRPCodigoCliente"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(DatosPlantillaPedidoVentaCab.CodigoCliente), Me)
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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos navision para el cliente ${DatosPlantillaPedidoVentaCab.CodigoCliente}."$,"Error")
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


Sub CargaTarifaVentaValidaActualAplicableClientePedido(TipoTarifa As Int, CodigoTarifa As String, BorrarTabla As Boolean) As ResumableSub
	
	If BorrarTabla Then mSQL.ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente")
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="TarifaVentaActualTipoTarifaCodigoTarifa"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(TipoTarifa, CodigoTarifa), Me)

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
'			Dim msa As Object=xui.MsgboxAsync($"No hay datos de tarifa de precios aplicable al cliente ${DatosPlantillaPedidoVentaCab.CodigoCliente}."$,"Error")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolTarifaVentaGRP07506",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente", lstReg)
		End If
	End If
	Return mRes
End Sub


Sub PrecioVentaArticuloTallaCantidadTarifaAplicableCliente(Articulo As String, Talla As String) As Double

	Dim QtyTotalArt As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2($"select TotalCantidad from tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo where CodigoArticulo=?"$, _
		Array As String(Articulo)))
	
	Dim sSQL As String=$"select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente 
		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, Variante asc, CantidadMinima desc LIMIT 1"$
	Dim PrecioClienteArtTalla As Double=Utilidades.FixNullDouble(mSQL.ExecQuerySingleResult2(sSQL, Array As String(0, DatosPlantillaPedidoVentaCab.CodigoCliente, Articulo, Talla, QtyTotalArt)))
	If PrecioClienteArtTalla>0 Then
		Return PrecioClienteArtTalla
	End If
	
	Dim sSQL As String=$"select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente
		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, CantidadMinima desc LIMIT 1"$
	Dim PrecioClienteArtSinTalla As Double=Utilidades.FixNullDouble(mSQL.ExecQuerySingleResult2(sSQL, Array As String(0, DatosPlantillaPedidoVentaCab.CodigoCliente, Articulo, "", QtyTotalArt)))
	If PrecioClienteArtSinTalla>0 Then
		Return PrecioClienteArtSinTalla
	End If


	Dim sSQL As String=$"select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente
		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, Variante asc, CantidadMinima desc LIMIT 1"$
	Dim PrecioGRPArtTalla As Double=Utilidades.FixNullDouble(mSQL.ExecQuerySingleResult2(sSQL, Array As String(1, DatosPlantillaPedidoVentaCab.GRPCliente, Articulo, Talla, QtyTotalArt)))
	If PrecioGRPArtTalla>0 Then
		Return PrecioGRPArtTalla
	End If
	
	Dim sSQL As String=$"select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente
		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, CantidadMinima desc LIMIT 1"$
	Dim PrecioGRPArtSinTalla As Double=Utilidades.FixNullDouble(mSQL.ExecQuerySingleResult2(sSQL, Array As String(1, DatosPlantillaPedidoVentaCab.GRPCliente, Articulo, "", QtyTotalArt)))
	If PrecioGRPArtSinTalla>0 Then
		Return PrecioGRPArtSinTalla
	End If

	' Si no hay precio, devolver 0
	Return 0
End Sub

Sub PoiGetFormattedCellValue(ExcelCell As PoiCell) As String
	Dim JOCell As JavaObject = ExcelCell
	Dim JODataFormatter As JavaObject
	Dim JOConditionalFormattingEvaluator As JavaObject
	Dim JOFormulaEvaluator As JavaObject =JOCell.RunMethodJO("getSheet",Null).RunMethodJO("getWorkbook",Null).RunMethodJO("getCreationHelper",Null).RunMethodJO("createFormulaEvaluator",Null)
	JOConditionalFormattingEvaluator.InitializeNewInstance("org.apache.poi.ss.formula.ConditionalFormattingEvaluator",Array As Object (JOCell.RunMethodJO("getSheet",Null).RunMethodJO("getWorkbook",Null),JOCell.RunMethodJO("getSheet",Null).RunMethodJO("getWorkbook",Null).RunMethodJO("getCreationHelper",Null).RunMethodJO("createFormulaEvaluator",Null)))
	Return JODataFormatter.InitializeNewInstance("org.apache.poi.ss.usermodel.DataFormatter",Null).RunMethod("formatCellValue",Array As Object (JOCell,JOFormulaEvaluator,JOConditionalFormattingEvaluator))
   
End Sub

