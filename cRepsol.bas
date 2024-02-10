B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
'	Private LocalPath As String = "C:\"
'	Private FTPPath As String = "/"
'	Private sFTP As FTP

	Private xui As XUI
	Private mSQL As SQL
	
	Private DragAndDrop1 As DragAndDrop

	Private SplitPane1 As SplitPane
	Private TreeViewLocal As TreeView
	Private TreeViewFTP As TreeView
	
	Private vLocalPath As TextField
	Private vFTPpath As TextField
	Private TextFTP As TextField
	Private TextUser As TextField
	Private TextPassword As TextField
	Private TextInfo As TextArea
	Private SD_LoadingIndicator1 As SD_LoadingIndicator
	
	Private Dialog As B4XDialog
	
	Public PermisoModuloUsuario As String
	Private btnSalir As B4XView
	
	Private jamLoadingIndicator1 As JamLoadingIndicator
	
	'Private mCodigoNAVClienteRepsolEESS As String
	Private mCodigoNAVGRPRepsolEESS As String
	
	Private sFtpRepsol As SFtp
	Private FilesFoldersFtpRepsol As String
	Private ErrorFilesFoldersFtpRepsol As String
	
	Private CarpetaDestinoFicherosDescargadosFTPPedidosRepsol As String="\\192.168.10.4\Publico\PedidosRepsolOnline\FicherosDescargadosFTP"
	Private CarpetaDestinoFicherosPedidosOKRepsol As String="\\192.168.10.4\Publico\PedidosRepsolOnline\FicherosPedidosOK"
	Private CarpetaDestinoFicherosPedidosErrorRepsol As String="\\192.168.10.4\Publico\PedidosRepsolOnline\FicherosPedidosError"
	
	Private Const CuentaEmailRemitenteAvisos As String="noreply@proin-pinilla.com"
	Private Const CuentaEmailDestinatarioDev1 As String="smarquina@proin-pinilla.com"
	Private Const CuentaEmailDestinatarioDev2 As String="fblazquez@proin-pinilla.com"
	'Private Const CuentaEmailDestinatarioProinPedidosRepsol As String="atencionalcliente@proin-pinilla.com"
	Private Const CuentaEmailDestinatarioProinPedidosRepsol As String="pedidosrepsol@proin-pinilla.com"
	
	'Type TipoCheckLineaPedidoRepsol (NumeroLinea As String, IDSedeEmpresa As String, NumeroPedidoEstacion As String, DNIEmpleado As String, LineaOK As Boolean, Errores As String, TextoLinea As String)
	'Type TipoDatosLineaErrorPedidoRepsol (NumeroLinea As String, IDSedeEmpresa As String, NumeroPedidoEstacion As String, DNIEmpleado As String, Errores As String, TextoLinea As String)
	
	'Type TipoDatosLineaPedidoRepsol (Linea As Int, TipoDato As Int, _
	Type TipoDatosLineaPedidoRepsol (Linea As String, ErrorLongitudLineaCabeceraEstacion As Int, Sede As String, ErrorSede As Int, CodigoClienteERP As String, CodigoDireccionEnvioERP As String, CodigoPedido As String, _
		FechaPedido As String, ErrorFechaPedido As Int, NombreEstacion As String, Calle As String, CodigoPostal As String, Poblacion As String, _
		CodigoProvincia As String, Telefono As String, TipoEstacion As String, Marca As String, ErrorMarca As Int, ErrorCabeceraEstacion As Int, _
		ErrorLongitudLineaEmpleado As Int, DNI As String, ErrorDNI As Int, NombreEmpleado As String, Cargo As String, ErrorCargo As Int, Sexo As String, ErrorSexo As Int, Embarazo As String, ErrorEmbarazo As Int, _
		ErrorLongitudLineaProducto As Int, CodigoPrenda As String, DescripcionCodigoPrenda As String, ErrorCodigoPrenda As Int, CodigoProductoERP As String, ErrorCodigoProductoERP As Int, _
		Talla As String, TallaERP As String, ErrorTalla As Int, Cantidad As Int, ErrorCantidad As Int, LineaConError As Int)
		
	
	Private btnSelFicheroFTP As B4XView
	Private txtFicheroSeleccionado As B4XView
	Private btnProcesar As B4XView
	Private TextAreaDatosProceso As TextArea
	Private btnSelFicheroWindows As B4XView
	
	Private DirFicheroProcesar, NombreFicheroProcesar As String
	Private btnCheckFTPInbox As B4XView
	Private btnUploadFile As B4XView
	Private btnProcesoCompleto As B4XView
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

 Sub CreacionTablasSQLite
	
'	(Sede As String, ControlSede As String, CodigoClienteERP As String, CodigoDireccionEnvioERP As String, CodigoPedido As String, FechaPedido As String, NombreEstacion As String, Calle As String, CodigoPostal As String, Poblacion As String, _
'		CodigoProvincia As String, Telefono As String, TipoEstacion As String, Marca As String, ControlMarca As String, _
'		DNI As String, ControlDNI As String, NombreEmpleado As String, Cargo As String, ControlCargo As String, Sexo As String, ControlSexo As String, Embarazo As String, ControlEmbarazo As String, _
'		CodigoPrenda As String, DescripcionCodigoPrenda As String, ControlCodigoPrenda As String, CodigoProductoERP As String, ControlCodigoProductoERP As String, _
'		Talla As String, ControlTalla As String, Cantidad As Int, LineaOK As Boolean, ErrorLinea As String)
	
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolLineasFicheroPedido")
	Dim sCrearTabla As String=$"CREATE TABLE tblRepsolLineasFicheroPedido (Linea TEXT default '', ErrorLongitudLineaCabeceraEstacion TEXT default ''
	, Sede TEXT default '', CodigoClienteERP TEXT default '', CodigoDireccionEnvioERP TEXT default '', ErrorSede TEXT default ''
	, CodigoPedido TEXT default '', FechaPedido TEXT default '', ErrorFechaPedido TEXT default ''
	, NombreEstacion TEXT default '',Calle TEXT default '', CodigoPostal TEXT default '', Poblacion TEXT default '', CodigoProvincia TEXT default '', Telefono TEXT default ''
	, TipoEstacion TEXT default '', Marca TEXT default '', ErrorMarca TEXT default ''
	, ErrorLongitudLineaEmpleado TEXT default '', DNI TEXT default '', ErrorDNI TEXT default '', NombreEmpleado TEXT default ''
	, Cargo TEXT default '', ErrorCargo TEXT default '', Sexo TEXT default '', ErrorSexo TEXT default '',  Embarazo TEXT default '', ErrorEmbarazo TEXT default ''
	, ErrorLongitudLineaProducto TEXT default '', CodigoPrenda TEXT default '', ErrorCodigoPrenda TEXT default '', CodigoProductoERP TEXT default '', ErrorCodigoProductoERP TEXT default ''
	, Talla TEXT default '', TallaERP TEXT default '', ErrorTalla TEXT default '', Cantidad INTEGER default 0, ErrorCantidad INTEGER default 0
	, LineaConError INTEGER default 0, SedePedidoDNIConError INTEGER default 0
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolMapeoCodigosPrendaEESS")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolMapeoCodigosPrendaEESS] (
	[CodigoPrenda] TEXT, [NombreCodigoPrenda] TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolMapeoArticulosEESS")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolMapeoArticulosEESS] (
	[IDLinea] INTEGER, [Marca] TEXT, [Cargo] TEXT, [Sexo] TEXT, [CodigoPrenda] TEXT, [CodigoArticuloNAV] TEXT, [NombreCodigoPrenda] TEXT
	, [Combi] TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolTallasArticulosEESS")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolTallasArticulosEESS] (
	[Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolMapeoSedesEESS")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolMapeoSedesEESS] (
	[Sede] TEXT default '',  [CodigoClienteNAV] TEXT default '', [CodigoDireccionEnvioNAV] TEXT default ''
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolTarifaVentaGRP07506")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolTarifaVentaGRP07506] ([TipoTarifa] INTEGER, [CodigoTarifa] TEXT
	, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, [Moneda] TEXT, [UM] TEXT, [CantidadMinima] REAL, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER
	, [NumTarifa] INTEGER, [UMVenta] TEXT, [FechaCreacion] INTEGER, [CosteUnitario] REAL, [CosteSTD] REAL, [FechaCosteSTD] INTEGER, [GRC] TEXT, [CompraFab] INTEGER
	, [CosteRazonable] REAL, [FechaCosteRazonable] INTEGER, [Ruta] TEXT, [NombreRuta] TEXT, [LM] TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	
	
	
	
	mSQL.ExecNonQuery("drop table if exists tblRepsolErroresSedePedidoDNIFicheroPedido")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolErroresSedePedidoDNIFicheroPedido] (
	[Sede] TEXT, [PedidoSede] TEXT, [DNI] TEXT, [Errores] TEXT
	)"$
	mSQL.ExecNonQuery(sCrearTabla)
	

End Sub

Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrRepsol")

		
	frm.Title=Main.PrefijoTitleForms & "Repsol"
		
	Dialog.Initialize (frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	frm.Show
	
'''''	Inicio
''''
''''	'mCodigoNAVClienteRepsolEESS="07506"
''''	mCodigoNAVGRPRepsolEESS="07506"
''''
''''
''''	jamLoadingIndicator1.MensajeLoading="Cargando datos Direcciones Envio Repsol EESS..."
''''	jamLoadingIndicator1.Show
''''
''''	'wait for(CargaDireccionesEnvioRepsolEESS) complete (mRes As Map)
''''	wait for(CargaDireccionesEnvioRepsolEESSGRP) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion="NOK" Then
''''		jamLoadingIndicator1.Close
''''		SalirModulo
''''		Return
''''	End If
''''	
''''	wait for(CargaTarifaVentaValidaActualGRPRepsolEESS) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion="NOK" Then
''''		jamLoadingIndicator1.Close
''''		SalirModulo
''''		Return
''''	End If
''''	
'''''	
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00011740","07506","0001"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00012955","07506","0002"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00096025","07506","0003"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00096657","07506","0004"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00010928","07506","0005"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00000657","07506","0006"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00004696","07506","0007"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00096843","07506","0008"))
'''''	mSQL.ExecNonQuery2("INSERT INTO tblRepsolMapeoSedesEESS (Sede, CodigoClienteNAV, CodigoDireccionEnvioNAV) VALUES (?,?,?)",Array("00097146","07506","0009"))
''''
''''	jamLoadingIndicator1.MensajeLoading="Cargando datos artículos Repsol..."
''''
''''	wait for(CargaMapeoCodigosPrendaEESS) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion="NOK" Then
''''		jamLoadingIndicator1.Close
''''		SalirModulo
''''		Return
''''	End If
''''
''''	wait for(CargaMapeoArticulosEESS) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion="NOK" Then 
''''		jamLoadingIndicator1.Close
''''		SalirModulo
''''		Return
''''	End If
''''
'''''	wait for(CargaTallasArticulosEESS) complete (Success As Boolean)
'''''	If Success=False Then
'''''		jamLoadingIndicator1.Close
'''''		SalirModulo
'''''		Return
'''''	End If
''''
''''	wait for(CargaTallasArticulosEESS) complete (mRes As Map)
''''	'If Success=False Then
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion="NOK" Then
''''		jamLoadingIndicator1.Close
''''		SalirModulo
''''		Return
''''	End If
''''	
''''	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
''''	Dim Accion As String=mRes.Get("Accion")
''''	If Accion="NOK" Then
''''		SalirModulo
''''		Return
''''	End If
''''	Dim mDataConn As Map=mRes.Get("mDataConn")
''''	Log(mDataConn)
''''	
''''	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
''''	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
''''	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
''''	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
	''''	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")
	''''
	
	jamLoadingIndicator1.MensajeLoading="Inicializando datos Repsol EESS..."
	jamLoadingIndicator1.Show

	Wait For(InicializacionDatos) complete (respJRDC As TipoRespuestaJRDC)
	Dim FechaHoraInicializacionDatos As Long=DateTime.Now
	If respJRDC.Accion="NOK" Then
		Dim Error As String=respJRDC.Error
		Wait For(EnviarEmailAviso(True,"ERROR inicializacion datos Proceso Pedidos OnLine REPSOL EESS",Error)) complete (sResp As String)
		'''''timer1.Enabled=True
		Return
	Else
		'Wait For(EnviarEmailAviso(True,"Proceso inicializacion datos Pedidos OnLine REPSOL EESS OK",$"Proceso ejecutado, OK $DateTime{DateTime.Now}"$)) complete (sResp As String)
	End If


	jamLoadingIndicator1.Close
	
End Sub


Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Private Sub btnSalir_Click
	SalirModulo
End Sub

'''''
'''''Sub Inicio
''''''	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
''''''	Dim Accion As String=mRes.Get("Accion")
''''''	If Accion="NOK" Then
''''''		 SalirModulo
''''''		 Return
''''''	End If
''''''	Dim mDataConn As Map=mRes.Get("mDataConn")
''''''	'Log(mData0)
''''''	
''''''	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
''''''	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
''''''	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
''''''	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
''''''	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")
'''''	
'''''	'sFtpRepsol.List(FilesFoldersFtpRepsol)
'''''	'Wait For sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)
'''''	
'''''	
'''''	jamLoadingIndicator1.MensajeLoading="Buscando Fichero Pedido en carpeta FTP..."
'''''	jamLoadingIndicator1.Show
'''''	Wait For(BuscarUltimoFicheroPedidoEnFTP) complete (sResp As String)
'''''	If sResp.StartsWith("Error") Then 
'''''		jamLoadingIndicator1.close
'''''		Dim msa As Object=xui.MsgboxAsync(sResp.Replace("Error,",""),"Error")
'''''		Wait For (msa) Msgbox_Result
'''''		Return
'''''	End If
'''''	
'''''	If sResp.StartsWith("Aviso") Then
'''''		jamLoadingIndicator1.close
'''''		Dim msa As Object=xui.MsgboxAsync(sResp.Replace("Aviso,",""),"Aviso")
'''''		Wait For (msa) Msgbox_Result
'''''		Return
'''''	End If
'''''	
'''''	Dim NombreFicheroPedido As String=sResp
'''''	
'''''	Dim RutaFTPFicheroPedido As String=FilesFoldersFtpRepsol & "/" & NombreFicheroPedido
'''''	
'''''	jamLoadingIndicator1.MensajeLoading=$"Descargando Fichero Pedido ${NombreFicheroPedido} desde carpeta FTP..."$
'''''	jamLoadingIndicator1.IniciarControlTiempoProceso
'''''	Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPFicheroPedido, CarpetaDestinoFicherosPedidosRepsol, NombreFicheroPedido)) complete (Success As Boolean)
'''''	jamLoadingIndicator1.DetenerControlTiempoProceso
'''''	If Not(Success) Then
'''''		' PENDIENTE AFINAR EL MENSAJE PARA EL USUARIO (VENTAS PROIN)
'''''		Dim msa As Object=xui.MsgboxAsync($"Ha habido un error en la descarga del fichero ${NombreFicheroPedido}"$,"ATENCION!")
'''''		Wait For (msa) Msgbox_Result
'''''		jamLoadingIndicator1.close
'''''		Return
'''''	End If
'''''	
'''''	''' habilitar sólo cuando el resto funcione totalmente...
''''''	sFtpRepsol.DeleteFile(RutaUltimoFicherosFTP)
''''''	Wait For sFtpRepsol_CommandCompleted (Command As String, Success As Boolean, Reply As String)
'''''' 	If Not(Success) then
''''''		...
''''''	end if
'''''	
'''''	
'''''	jamLoadingIndicator1.MensajeLoading=$"Procesando Fichero Pedido ${NombreFicheroPedido}..."$
'''''	wait for(ProcesarFichero3(CarpetaDestinoFicherosPedidosRepsol,NombreFicheroPedido,CarpetaDestinoFicherosPedidosRepsol,NombreFicheroPedido)) complete (rObj As Object)
'''''	
'''''End Sub

Sub CargaDatosConnSFTP As ResumableSub
	LogColor("CargaDatosConnSFTP", xui.Color_Green)
	Dim Accion As String
	Dim mDataConn As Map
	mDataConn.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mDataConn",mDataConn)
	'Dim Comando As String="DatossFTPRepsolTest"
	Dim Comando As String="DatossFTPRepsolProduccion"
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
			Dim msa As Object=xui.MsgboxAsync($"No existe la configuración necesaria para la conexión."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			mDataConn=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mDataConn", mDataConn)
			
		End If
	End If
	Return mRes
End Sub

Sub BuscarUltimoFicheroPedidoEnFTP As ResumableSub


	sFtpRepsol.List(FilesFoldersFtpRepsol)
	Wait For sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)

	If Success = False Then
		Log(LastException.Message)
		'fx.Msgbox(frm,"Error listando carpeta FTP." & CRLF & CRLF & LastException.Message ,"Error")
		Return "Error listando carpeta FTP." & CRLF & CRLF & LastException.Message
	End If
	
	If Files.Length=0 Then
		' sin ficheros
		Return "Aviso, Carpeta FTP sin ficheros"
	End If

	For i = 0 To Folders.Length - 1
		Log(Folders(i).Name)
		Log(DateTime.Date(Folders(i).Timestamp))
	Next
	
	Dim NombreUltimoFicheroPedido As String
	Dim FechaLongUltimoFichero As Long
	For i = 0 To Files.Length - 1
		Log(Files(i).Name & ", " & Files(i).Size & ", " & DateTime.Date(Files(i).Timestamp))
		If Files(i).Name.StartsWith("PEDVESTUARIO") Then
			If Files(i).Timestamp> FechaLongUltimoFichero Then
				NombreUltimoFicheroPedido=Files(i).Name
				FechaLongUltimoFichero=Files(i).Timestamp
			End If
		End If
	Next
	If NombreUltimoFicheroPedido="" Then Return "Aviso, Carpeta FTP sin fichero de pedido."

	If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreUltimoFicheroPedido) Then
		Return $"Aviso, El fichero ${NombreUltimoFicheroPedido} ha sido descargado anteriormente."$
		 ' esto no debería ocurrir, puesto que debemos borrar el fichero, una vez descargado.
		 '...pero podría fallar:
		 '	- Repsol vuelve a subir el mismo fichero
		 '  - Fallo al borrar el fichero
		 '	- ... ?
	End If

	Return NombreUltimoFicheroPedido

End Sub

Sub BuscarPrimerFicheroPedidoEnFTP As ResumableSub


	sFtpRepsol.List(FilesFoldersFtpRepsol)
	Wait For sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)

	If Success = False Then
		Log(LastException.Message)
		'fx.Msgbox(frm,"Error listando carpeta FTP." & CRLF & CRLF & LastException.Message ,"Error")
		Return "Error listando carpeta FTP." & CRLF & CRLF & LastException.Message
	End If
	
	If Files.Length=0 Then
		' sin ficheros
		Return "Aviso, Carpeta FTP sin ficheros"
	End If

	For i = 0 To Folders.Length - 1
		Log(Folders(i).Name)
		Log(DateTime.Date(Folders(i).Timestamp))
	Next
	
	Dim NombrePrimerFicheroPedido As String
	Dim FechaLongPrimerFichero As Long
	For i = 0 To Files.Length - 1
		Log(Files(i).Name & ", " & Files(i).Size & ", " & DateTime.Date(Files(i).Timestamp))
		If Files(i).Name.StartsWith("PEDVESTUARIO") Then
			If Files(i).Timestamp<= FechaLongPrimerFichero Then
				NombrePrimerFicheroPedido=Files(i).Name
				FechaLongPrimerFichero=Files(i).Timestamp
			End If
		End If
	Next
	If NombrePrimerFicheroPedido="" Then Return "Aviso, Carpeta FTP sin fichero de pedido."

	If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombrePrimerFicheroPedido) Then
		Return $"Aviso, El fichero ${NombrePrimerFicheroPedido} ha sido descargado anteriormente."$
		 ' esto no debería ocurrir, puesto que debemos borrar el fichero, una vez descargado.
		 '...pero podría fallar:
		 '	- Repsol vuelve a subir el mismo fichero
		 '  - Fallo al borrar el fichero
		 '	- ... ?
	End If
	Return NombrePrimerFicheroPedido

End Sub

'Sub sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)
'
'	Dim NombreUltimoFichero As String
'	
'	If Success = False Then
'		Log(LastException.Message)
'		fx.Msgbox(frm,"Error listando carpeta FTP." & CRLF & CRLF & LastException.Message ,"Error")
'		Return
'	End If
'	
'	If Files.Length=0 Then
'		' sin ficheros 
'		Return
'	End If
'
'	For i = 0 To Folders.Length - 1
'		Log(Folders(i).Name)
'		Log(DateTime.Date(Folders(i).Timestamp))
'	Next
'	
'	Dim FechaLongUltimoFichero As Long
'	For i = 0 To Files.Length - 1
'		Log(Files(i).Name & ", " & Files(i).Size & ", " & DateTime.Date(Files(i).Timestamp))
'		If Files(i).Name.StartsWith("PEDVESTUARIO") Then
'			If Files(i).Timestamp> FechaLongUltimoFichero Then
'				NombreUltimoFichero=Files(i).Name
'				FechaLongUltimoFichero=Files(i).Timestamp
'			End If
'		End If
'	Next
'
'	If File.Exists("\\192.168.10.4\Publico\PedidosRepsolOnline",NombreUltimoFichero) Then Return ' ya se ha bajado el fichero anteriormente 
'	
'	Dim RutaUltimoFicherosFTP As String=FilesFoldersFtpRepsol & "/" & NombreUltimoFichero
'	
'	Dim CarpetaDestinoFicherosPedidosRepsol As String="\\192.168.10.4\Publico\PedidosRepsolOnline"
'	
'	sFtpRepsol.DownloadFile(RutaUltimoFicherosFTP, CarpetaDestinoFicherosPedidosRepsol , NombreUltimoFichero)
'	Wait For sFtpRepsol_DownloadCompleted (ServerPath As String, Success As Boolean)
'	
'	If Not(Success) Then
'		Dim msa As Object=xui.MsgboxAsync("Error descargando fichero de pedido.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	
'	Dim lstLineasFichero As List
'	lstLineasFichero = File.ReadList("\\192.168.10.4\Publico\PedidosRepsolOnline"  , NombreUltimoFichero)
'	
''	Dim sTextoFichero As String=File.ReadString(CarpetaDestinoFicherosPedidosRepsol , NombreUltimoFichero)
''	Log(sTextoFichero)
'	
'	ProcesarFichero(lstLineasFichero,CarpetaDestinoFicherosPedidosRepsol, NombreUltimoFichero)
'	
'	
'End Sub

Sub DescargarFicheroDesdeCarpetaFTP(RutaFichero As String, CarpetaDestino As String, NombreFicheroDestino As String) As ResumableSub
	sFtpRepsol.DownloadFile(RutaFichero, CarpetaDestino , NombreFicheroDestino)
	Wait For sFtpRepsol_DownloadCompleted (ServerPath As String, Success As Boolean)
	
'	If Not(Success) Then
'		Dim msa As Object=xui.MsgboxAsync($"Error descargando fichero de pedido ${NombreFicheroDestino}."$,"Error")
'		Wait For (msa) Msgbox_Result
'	End If
	
	Return Success
End Sub

Sub sFtpRepsol_PromptYesNo (Message As String)
	''	Dim res As Int = fx.Msgbox2(frm,Message, "", "Yes", "", "No",Null)
	''	'The next line might be a bit confusing. It is a condition.
	''	'The value will be True if res equals to DialogResponse.POSITIVE.
	''	sFtpDHL.SetPromptResult(res = fx.DialogResponse.POSITIVE)
   
	sFtpRepsol.SetPromptResult(True)
End Sub

Sub sFtpRepsol_ShowMessage (Message As String)
If Message.StartsWith("Welcome")=False Then
		fx.Msgbox(frm,Message, "")
	End If
End Sub

Sub SubirFicheroACarpetaFTP(CarpetaOrigen As String, NombreFicheroOrigen As String, RutaFicheroDestino As String) As ResumableSub
	sFtpRepsol.UploadFile(CarpetaOrigen, NombreFicheroOrigen , RutaFicheroDestino)
	Wait For sFtpRepsol_UploadCompleted (ServerPath As String, Success As Boolean)
	
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync($"Error subiendo fichero de errores de pedido ${NombreFicheroOrigen}
${LastException.message}"$,"Error")
		Wait For (msa) Msgbox_Result
	End If
	
	Return Success
End Sub

Sub sFtpRepsol_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
	Dim s As String
	s = "Uploaded " & Round(TotalUploaded / 1000) & "KB"
	If Total > 0 Then s = s & " out of " & Round(Total / 1000) & "KB"
	Log(s)
End Sub

Sub sFtpRepsol_UploadCompleted (ServerPath As String, Success As Boolean)
	Log(ServerPath & ", Success=" & Success)
	If Success = False Then Log(LastException.Message)
End Sub

'
'Sub sFtpRepsol_CommandCompleted (Command As String, Success As Boolean, Reply As String)
'	
'End Sub



'Sub sFtpRepsol_DownloadCompleted (ServerPath As String, Success As Boolean)
'	frm.RootPane.MouseCursor= fx.Cursors.DEFAULT
'	If Not(Success) Then
'		fx.Msgbox(frm,"Error descargando fichero de pedido.","Error")
'		Return
'	End If
'	
'
'
'End Sub




private Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub

Sub SeleccionFicheroCarpetaRed As String
	Dim fc As FileChooser
	fc.Initialize
	fc.Title="Selecciona Fichero"
	fc.SetExtensionFilter("Ficheros texto", Array As String("*.txt"))
	'fc.InitialFileName=""
	'fc.InitialDirectory=Main.UserFolder
	fc.InitialDirectory=CarpetaDestinoFicherosDescargadosFTPPedidosRepsol
	Dim fileName As String = fc.ShowOpen(frm)
	Return fileName
	

'	
'	Dim DirFichero As String=File.GetFileParent(fileName)
'	Dim NombreFichero As String=File.GetName(fileName)
	
'	Dim lstLineasFichero As List
'	'lstLineasFichero = File.ReadList(DirFichero , NombreFichero)
'	
'	Dim tr As TextReader
'	tr.Initialize2(File.OpenInput(DirFichero, NombreFichero), "ISO-8859-1")
'	Dim line As String
'	line = tr.ReadLine
'	Do While line <> Null
'		Log(line)
'		line = tr.ReadLine
'		lstLineasFichero.Add(line)
'	Loop
'	tr.Close
'	
'	Dim sTextoFichero As String=File.ReadString(DirFichero , NombreFichero)
'	Log(sTextoFichero)
	
	
	
End Sub
'
'Sub ProcesarFichero(CarpetaFicheroOrigen As String, NombreFicheroOrigen As String,  CarpetaDestinoFichero As String, NombreFicheroDestino As String) As ResumableSub
'
'	mSQL.ExecNonQuery("delete from tblRepsolLineasFicheroPedido")
'
'	jamLoadingIndicator1.MensajeLoading="Procesando fichero..."
'	jamLoadingIndicator1.IniciarControlTiempoProceso
'	jamLoadingIndicator1.Show
'	
'	Dim lstLineasFichero As List
'	lstLineasFichero.Initialize
'
'	'lstLineasFichero = File.ReadList(CarpetaFicheroOrigen , NombreFicheroOrigen)   ' SOLO si el fichero origen está en UTF-8 . el de Repsol parece que no lo está...
'
'	Dim tr As TextReader
'	tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "ISO-8859-1")
'	lstLineasFichero=tr.ReadList	
''	Dim line As String
''	line = tr.ReadLine
''	Do While line <> Null
''		'Log(line)
''		line = tr.ReadLine
''		lstLineasFichero.Add(line)
''	Loop
''	tr.Close
'	
'	Dim lstDatosLineasPedido As List
'	lstDatosLineasPedido.Initialize
'	
''	Dim lstCSV As List
''	lstCSV.Initialize
'	
'	Dim lstEmpleadosConError As List
'	lstEmpleadosConError.Initialize
'
'	
'	Dim DNIEmpleadoSel As String
'	
'	Dim mDataEstacionServicio As Map
'	mDataEstacionServicio.Initialize
'	Dim lstLineasPedidoEstacion As List
'	lstLineasPedidoEstacion.Initialize
'	Dim mDataEmpleado As Map
'	mDataEmpleado.Initialize
'	Dim lstLineasPedidoEmpleado As List
'	lstLineasPedidoEmpleado.Initialize
'	
'	Dim lstLineasError As List
'	lstLineasError.Initialize
'	
'	Dim csvHeader(20) As String
'	csvHeader(0)="Linea"
'	'csvHeader(1)="TipoLinea"
'	csvHeader(1)="IDSedeEmpresa"
'	csvHeader(2)="NumeroPedido"
'	csvHeader(3)="FechaSolicitud"
'	csvHeader(4)="NombreEstacion"
'	csvHeader(5)="Calle"
'	csvHeader(6)="CodigoPostal"
'	csvHeader(7)="Poblacion"
'	csvHeader(8)="CodigoProvincia"
'	csvHeader(9)="Telefono"
'	csvHeader(10)="TipoEstacion"
'	csvHeader(11)="Marca"
'	csvHeader(12)="DNI"
'	csvHeader(13)="NombreEmpleado"
'	csvHeader(14)="Cargo"
'	csvHeader(15)="Sexo"
'	csvHeader(16)="Embarazo"
'	csvHeader(17)="CodigoPrenda"
'	csvHeader(18)="Talla"
'	csvHeader(19)="Cantidad"
''	csvHeader(20)="DNIOk"
''	csvHeader(21)="LineaOK"
''	csvHeader(22)="Error"
'	
'	Dim idxFila As Int=1
'	
''	Dim CabeceraPedido As String=lstLineasFichero.Get(0)
''	Dim ElementosCabecera(2) As String=Regex.Split("PEDVESTUARIO",CabeceraPedido)
''	Dim CorrelativoPedido As String=CabeceraPedido.SubString2(0,6)
''	Dim FechaPedido As String=NombreFichero.Replace("PEDVESTUARIO","").Replace(".TXT","")
'
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd-MM-yyyy"
'
'	For Each sLinea As String In lstLineasFichero
'		'Log(sLinea.Length)
'		
'		Dim NumCharLinea As Int=sLinea.Length
'		'Dim sLineaUTF8 As String=utf2android(sLinea)
'		Dim csvLine(20) As Object
'		
'		If NumCharLinea<6 Then
'			'			Dim LineaError As TipoDatosLineaErrorPedidoRepsol
''			LineaError.Initialize
''			LineaError.Errores=LineaError.Errores & " " & LastException
''			LineaError.TextoLinea=sLinea
''			lstLineasError.Add(LineaError)
'			mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, LineaOK, Error) values (?,?,?)"$, Array(idxFila,0,"Longitud línea inferior a 6"))
'			Continue
'		Else
'			Dim NumLinea As String=sLinea.SubString2(0,6)
'		End If
'
'
'
'		csvLine(0)=NumLinea
'
''		jamLoadingIndicator1.MensajeLoading=$"Procesando línea nº $2.0{NumLinea}..."$
''		Sleep(0)
'		Dim TipoLinea As Int=sLinea.SubString2(6,7)
'		csvLine(2)=TipoLinea
'		'Dim IDSedeEmpresaSel As String
'		Select Case TipoLinea
'			Case 0 ' cabecera pedido
'				Dim DatosLineaPedido As TipoDatosLineaPedidoRepsol
'				DatosLineaPedido.Initialize
''				If sLinea.Length<>57 Then
''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 0 inferior a 57 caracteres (${sLinea.Length}"$))
''					Continue
''				End If
'				Dim LineaNumeroPedido As String=sLinea.SubString(7)  ' = nombre fichero?
'				Dim ArrLineaNumeroPedido() As String=Regex.Split(".TXT",LineaNumeroPedido)
'				Dim NumeroPedido As String=ArrLineaNumeroPedido(0)
'				Log($"NumeroPedido ${NumeroPedido}"$)
'			Case 1 ' cabecera estacion servicio
'				Dim ErrorLineaEstacionServicio As Boolean
'				If NumCharLinea<>236 Then
'					ErrorLineaEstacionServicio=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 1 distinto de 236 caracteres (${NumCharLinea}"$))
'					'Continue
'				End If
'				
'				Dim ErrorIDSedeEmpresa As Boolean
'				If NumCharLinea<15 Then
'					ErrorLineaEstacionServicio=True
'					ErrorIDSedeEmpresa=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, 0,$"Sede errónea, longitud línea tipo dato 1 inferior a 15 caracteres (${NumCharLinea}"$))
'				Else
'					Dim IDSedeEmpresa As String=sLinea.SubString2(7,15)   ' 8 posiciones   CAMPO CLAVE 1 PARA FICHERO ERRORES
'					DatosLineaPedido.Sede=IDSedeEmpresa
'				End If
'				
'				'Log($"IDSedeEmpresa ${IDSedeEmpresa}"$)
'				'If IDSedeEmpresaSel<>IDSedeEmpresa Then
'				If mDataEstacionServicio.Size>0 Then
'					Dim mDataPedidoEstacion As Map
'					mDataPedidoEstacion.Initialize
'					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
'					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
'					lstDatosLineasPedido.add(mDataPedidoEstacion)
'				End If
'				
'				Dim ErrorNumeroPedidoEstacion As Boolean
'				If NumCharLinea<19 And ErrorIDSedeEmpresa=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorNumeroPedidoEstacion=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, LineaOK, Error) values (?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa,0,$"NumeroPedidoEstacion erróneo, longitud línea tipo dato 1 inferior a 19 caracteres (${NumCharLinea}"$))
'				Else
'					Dim NumeroPedidoEstacion As String=sLinea.SubString2(15,19)   ' 4 posiciones   CAMPO CLAVE 2 PARA FICHERO ERRORES
'					DatosLineaPedido.CodigoPedido=NumeroPedidoEstacion
'				End If
'				
'				Dim ErrorFechaPedido As Boolean
'				If NumCharLinea<29 And ErrorNumeroPedidoEstacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorFechaPedido=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido,LineaOK, Error) values (?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, 0,$"FechaPedido erróneo, longitud línea tipo dato 1 inferior a 29 caracteres (${NumCharLinea}"$))
'				Else
'					Dim FechaPedido As String=sLinea.SubString2(19,29)   ' 10 posiciones  DD-MM-YYYY
'					Try
'						Dim FechaPedidoLong As Long=DateTime.DateParse(FechaPedido)
'						DatosLineaPedido.FechaPedido=FechaPedido
'					Catch
'						ErrorLineaEstacionServicio=True
'						ErrorFechaPedido=True
'						mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido,LineaOK, Error) values (?,?,?,?,?,?,?)"$, _ 
'							Array(idxFila,NumLinea,TipoLinea,IDSedeEmpresa, NumeroPedidoEstacion, 0,$"FechaPedido erróneo,formato fecha incorrecto (${FechaPedido}"$))
'					End Try
'					
'				End If
'				
'				Dim ErrorNombreEstacion As Boolean
'				If NumCharLinea<94 And ErrorFechaPedido=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorNombreEstacion=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido,LineaOK, Error) values (?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,0,$"NombreEstacion erróneo, longitud línea tipo dato 1 inferior a 94 caracteres (${NumCharLinea}"$))
'				Else
'					Dim NombreEstacion As String=sLinea.SubString2(29,94)   ' 65 posiciones
'					DatosLineaPedido.NombreEstacion=NombreEstacion
'				End If
'				
'				Dim ErrorCalle As Boolean
'				If NumCharLinea<159 And ErrorNombreEstacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorCalle=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,LineaOK, Error) values (?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion, 0,$"Calle errónea, longitud línea tipo dato 1 inferior a 159 caracteres (${NumCharLinea}"$))
'				Else
'					Dim Calle As String=sLinea.SubString2(94,159)   ' 65 posiciones
'					DatosLineaPedido.Calle=Calle
'				End If
'				
'				Dim ErrorCodigoPostal As Boolean
'				If NumCharLinea<164 And ErrorCalle=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorCodigoPostal=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, 0,$"Código Postal erróneo, longitud línea tipo dato 1 inferior a 164 caracteres (${NumCharLinea}"$))
'				Else
'					Dim CodigoPostal As String=sLinea.SubString2(159,164)   ' 5 posiciones
'					DatosLineaPedido.CodigoPostal=CodigoPostal
'				End If
'				
'				Dim ErrorPoblacion As Boolean
'				If NumCharLinea<194 And ErrorCodigoPostal=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorPoblacion=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal,0,$"Población errónea, longitud línea tipo dato 1 inferior a 194 caracteres (${NumCharLinea}"$))
'				Else
'					Dim Poblacion As String=sLinea.SubString2(164,194)   ' 30 posiciones
'					DatosLineaPedido.Poblacion=Poblacion
'				End If
'				
'				Dim ErrorCodigoProvincia As Boolean
'				If NumCharLinea<196 And ErrorPoblacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorCodigoProvincia=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion,0,$"CodigoProvincia erróneo, longitud línea tipo dato 1 inferior a 196 caracteres (${NumCharLinea}"$))
'				Else
'					Dim CodigoProvincia As String=sLinea.SubString2(194,196)   ' 2 posiciones
'					DatosLineaPedido.CodigoProvincia=CodigoProvincia
'				End If
'				
'				Dim ErrorTelefono As Boolean
'				If NumCharLinea<211 And ErrorCodigoProvincia=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorTelefono=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia,0,$"Teléfono erróneo, longitud línea tipo dato 1 inferior a 211 caracteres (${NumCharLinea}"$))
'				Else
'					Dim Telefono As String=sLinea.SubString2(196,211)   ' 15 posiciones
'					DatosLineaPedido.Telefono=Telefono
'				End If
'				
'				Dim ErrorTipoEstacion As Boolean
'				If NumCharLinea<226 And ErrorTelefono=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorTipoEstacion=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,0,$"TipoEstación erróneo, longitud línea tipo dato 1 inferior a 226 caracteres (${NumCharLinea}"$))
'				Else
'					Dim sTipoEstacion As String=sLinea.SubString2(211,226)   ' 15 posiciones
'					Dim TipoEstacion As String=sTipoEstacion
''					Select Case sTipoEstacion   ''' NO CONTROLAMOS EL TIPO DE ESTACION, ya que no influye en el mapeo
''						Case "888-CRED"
''							TipoEstacion="CampsaRed"
''						Case "999-GESPEVESA"
''							TipoEstacion="Gespevesa"
''						Case Else
''							TipoEstacion="Abanderadas"
''					End Select
'					DatosLineaPedido.TipoEstacion=TipoEstacion
'				End If
'				
'				Dim ErrorMarca As Boolean
'				If NumCharLinea<236 And ErrorTipoEstacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorMarca=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, TipoEstacion, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,TipoEstacion,0,$"Marca errónea, longitud línea tipo dato 1 inferior a 236 caracteres (${NumCharLinea}"$))
'				Else
'					Dim Marca As String=sLinea.SubString2(226,236)   ' 10 posiciones
''					Dim Marca As String=sMarca
'''					Select Case sMarca
'''						Case "70"
'''							Marca="Campsa"
'''						Case "80"
'''							Marca="Repsol"
'''						Case "90"
'''							Marca=""
'''						
'''					End Select
'					If Not(Marca.ToUpperCase="REPSOL" Or Marca.ToUpperCase="CAMPSA" Or Marca.ToUpperCase="PETRONOR") Then
'						ErrorLineaEstacionServicio=True
'						ErrorMarca=True
'						mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, TipoEstacion, Marca, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,TipoEstacion,Marca,0,$"Marca errónea, valor distinto de Repsol/Campsa/Petronor (${Marca}"$))
'					Else
'						DatosLineaPedido.Marca=Marca
'					End If
'				End If
'
'				If ErrorLineaEstacionServicio=False Then
'					'...
'					Dim mDataEstacionServicio As Map
'					mDataEstacionServicio.Initialize
'					mDataEstacionServicio.Put("IDSedeEmpresa",IDSedeEmpresa)
'					mDataEstacionServicio.Put("NumeroPedidoEstacion",NumeroPedidoEstacion)
'					mDataEstacionServicio.Put("FechaPedido",FechaPedido)
'					mDataEstacionServicio.Put("NombreEstacion",NombreEstacion.Trim)
'					mDataEstacionServicio.Put("Calle",Calle.Trim)
'					mDataEstacionServicio.Put("CodigoPostal",CodigoPostal.Trim)
'					mDataEstacionServicio.Put("Poblacion",Poblacion.Trim)
'					mDataEstacionServicio.Put("CodigoProvincia",CodigoProvincia.Trim)
'					mDataEstacionServicio.Put("Telefono",Telefono.Trim)
'					mDataEstacionServicio.Put("TipoEstacion",TipoEstacion.Trim)
'					mDataEstacionServicio.Put("Marca",Marca.Trim)
'					
'					Dim lstLineasPedidoEstacion As List
'					lstLineasPedidoEstacion.Initialize
'				End If
'				'End If
'			Case 2 ' empleado
'				Log(sLinea.Length)
'				Dim ErrorLineaEmpleado As Boolean
'				If NumCharLinea<>141 Then
'					ErrorLineaEmpleado=True
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 2 distinto de 141 caracteres (${NumCharLinea}"$))
'					'Continue
'				End If
'				
'				Dim DNI As String=sLinea.SubString2(29,38)   'CAMPO CLAVE 3 PARA FICHERO ERRORES
'				If DNIEmpleadoSel<>DNI Then
'					DNIEmpleadoSel=DNI
'					If Not(checkDNI(DNIEmpleadoSel)) Then
'						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'						LineaError.Initialize
'						LineaError.NumeroLinea=NumLinea
'						LineaError.Errores="DNI NO OK"
'						LineaError.TextoLinea=sLinea
'						LineaError.IDSedeEmpresa=IDSedeEmpresa
'						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'						LineaError.DNIEmpleado=DNI
'						lstLineasError.Add(LineaError)
'						Continue  ' PASAMOS A LA LINEA SIGUIENTE
'					Else
'						If mDataEmpleado.Size>0 Then
'							Dim mDataPedidoEmpleado As Map
'							mDataPedidoEmpleado.Initialize
'							mDataPedidoEmpleado.Put("Empleado",mDataEmpleado)
'							mDataPedidoEmpleado.Put("LineasPedidoEmpleado",lstLineasPedidoEmpleado)
'							lstLineasPedidoEstacion.Add(mDataPedidoEmpleado)
'						End If
'					End If
'
'					Try
'						Dim DNIOK As Boolean=checkDNI(DNIEmpleadoSel)
'						Dim NombreEmpleado As String=sLinea.SubString2(38,138)
'						Dim sCargo As String=sLinea.SubString2(138,139)
'						Dim Cargo As String
'						Select Case sCargo
'							Case "G"
'								Cargo="Gestor"
'							Case "E"
'								Cargo="Encargado"
'							Case "V"
'								Cargo="Vendedor"
'						End Select
'						'Log("NumLinea: " & NumLinea)
'
'						Dim sSexoEmpleado As String=sLinea.SubString2(139,140)
'						Dim SexoEmpleado As String
'						Select Case sSexoEmpleado
'							Case "H"
'								SexoEmpleado="Hombre"
'							Case "M"
'								SexoEmpleado="Mujer"
'						End Select
'					
'						Dim sEmbarazoEmpleado As String=sLinea.SubString2(140,141)
'
'						Dim EmbarazoEmpleado As String
'						Select Case sEmbarazoEmpleado
'							Case "S"
'								EmbarazoEmpleado="SI"
'							Case "N"
'								EmbarazoEmpleado="NO"
'						End Select
'					Catch
'						'Log(LastException)
''						Dim mDataErr As Map
''						mDataErr.Initialize
''						mDataErr.Put("NumLinea",NumLinea)
''						mDataErr.Put("Texto Línea: ", sLinea)
''						lstLineasErroneas.Add(mDataErr)
'
''						DatosCheckLinea.Status="NO OK"
''						DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
''						lstLineasNOOK.Add(DatosCheckLinea)
'						
'						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'						LineaError.Initialize
'						LineaError.NumeroLinea=NumLinea
'						LineaError.Errores=LastException
'						LineaError.TextoLinea=sLinea
'						LineaError.IDSedeEmpresa=IDSedeEmpresa
'						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'						LineaError.DNIEmpleado=DNIEmpleadoSel
'						lstLineasError.Add(LineaError)
'
'						Continue
'					End Try
'					
'					Dim mDataEmpleado As Map
'					mDataEmpleado.Initialize
'					mDataEmpleado.Put("DNI",DNI)
'					mDataEmpleado.Put("DNIOK",DNIOK)
'					mDataEmpleado.Put("NombreEmpleado",NombreEmpleado.Trim)
'					mDataEmpleado.Put("Cargo",Cargo)
'					mDataEmpleado.Put("SexoEmpleado",SexoEmpleado)
'					mDataEmpleado.Put("EmbarazoEmpleado",EmbarazoEmpleado)
'				
'					Dim lstLineasPedidoEmpleado As List
'					lstLineasPedidoEmpleado.Initialize
'				End If
'				
'			Case 3 ' prendas empleado
'				Try
'					Dim CodigoPrenda As String=sLinea.SubString2(38,40)
'					Dim Talla As String=sLinea.SubString2(40,44)
'					Dim Cantidad As Int=sLinea.SubString2(44,45)
'				Catch
'					'Log(LastException)
''					Dim mDataErr As Map
''					mDataErr.Initialize
''					mDataErr.Put("NumLinea",NumLinea)
''					mDataErr.Put("Texto Línea: ", sLinea)
''					lstLineasErroneas.Add(mDataErr)
'
''					DatosCheckLinea.Status="NO OK"
''					DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
''					lstLineasNOOK.Add(DatosCheckLinea)
'					
'					Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'					LineaError.Initialize
'					LineaError.NumeroLinea=NumLinea
'					LineaError.Errores=LastException
'					LineaError.TextoLinea=sLinea
'					LineaError.IDSedeEmpresa=IDSedeEmpresa
'					LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'					LineaError.DNIEmpleado=DNIEmpleadoSel
'					lstLineasError.Add(LineaError)
'					
'					Continue
'				End Try
'				Dim mDataLineaPedidoEmpleado As Map
'				mDataLineaPedidoEmpleado.Initialize
'				mDataLineaPedidoEmpleado.Put("NumLinea",NumLinea)
'				mDataLineaPedidoEmpleado.Put("CodigoPrenda",CodigoPrenda)
'				mDataLineaPedidoEmpleado.Put("Talla",Talla.Trim)
'				mDataLineaPedidoEmpleado.Put("Cantidad",Cantidad)
'				lstLineasPedidoEmpleado.Add(mDataLineaPedidoEmpleado)
'				
'			Case 9  ' fin fichero
'				' añadir los datos del último pedido
'				If mDataEstacionServicio.Size>0 Then
'					Dim mDataPedidoEstacion As Map
'					mDataPedidoEstacion.Initialize
'					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
'					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
'					lstDatosLineasPedido.add(mDataPedidoEstacion)
'				End If
'				Exit ' Salir del loop (ésta debería ser la última línea) En el fichero de ejemplo, se ha añadido 1 línea en blanco, que da error
'			Case Else
'				' error en TipoLinea, no reconocido
'
'				Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'				LineaError.Initialize
'				LineaError.NumeroLinea=NumLinea
'				LineaError.Errores=$"Tipo de línea ${TipoLinea} no reconocido."$
'				LineaError.TextoLinea=sLinea
'				LineaError.IDSedeEmpresa=""
'				LineaError.NumeroPedidoEstacion=""
'				LineaError.DNIEmpleado=""
'				lstLineasError.Add(LineaError)
'		End Select
'	Next
'	
'	DateTime.DateFormat=DateFormatAnt
'	
'	jamLoadingIndicator1.DetenerControlTiempoProceso
'	
''	Log(lstDatosLineas)
'	
''	Dim JSONGenerator As JSONGenerator
''	JSONGenerator.Initialize2(lstJSON)
''	Dim sJSON As String=JSONGenerator.ToPrettyString(2)
''	File.WriteString(xui.DefaultFolder, NombreFichero.Replace(".TXT",".JSON"), sJSON)
''	
''	
''	wait For(Utilidades.JSONtoCSV(sJSON,True,";")) complete (sResp As String)
''	If sResp<>"" Then
''		Dim sCSV As String=sResp
''		File.WriteString(DirFichero,NombreFichero.Replace(".TXT",".CSV"),sCSV)
''	End If
''	
'
'	Sleep(0)
'	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas OK..."
'
'	' EXCEL LINEAS OK
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd-MM-yy"
'	Dim xl As XLUtils
'	xl.Initialize
'	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
'	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos Pedido")
'	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
'	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
'	'Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
'	
'	
'	Dim NumCols As Int=csvHeader.Length
'	
'	For idxCol=0 To NumCols-1
'		sheet1.PutString(xl.AddressZero(idxCol,0), csvHeader(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
'	Next
'	idxFila=1
'	For Each mLineaPedido As Map In lstDatosLineasPedido
'		'Log($"mLineaPedido ${mLineaPedido}"$)
'		Dim mDatosLineaPedidoExcel As Map
'		mDatosLineaPedidoExcel.Initialize
'		Dim mDatosEstacionServicio As Map=mLineaPedido.Get("EstacionServicio")
'		Dim IDSedeEmpresa As String=mDatosEstacionServicio.Get("IDSedeEmpresa")
'		Dim NumeroPedidoEstacion As String=mDatosEstacionServicio.Get("NumeroPedidoEstacion")
'		Dim sFechaSolicitud As String=mDatosEstacionServicio.Get("FechaSolicitud")
'		Dim FechaSolicitudLong As Long=DateTime.DateParse(sFechaSolicitud)
'		Dim NombreEstacion As String=mDatosEstacionServicio.Get("NombreEstacion")
'		Dim Calle As String=mDatosEstacionServicio.Get("Calle")
'		Dim CodigoPostal As String=mDatosEstacionServicio.Get("CodigoPostal")
'		Dim Poblacion As String=mDatosEstacionServicio.Get("Poblacion")
'		Dim CodigoProvincia As String=mDatosEstacionServicio.Get("CodigoProvincia")
'		Dim Telefono As String=mDatosEstacionServicio.Get("Telefono")
'		Dim TipoEstacion As String=mDatosEstacionServicio.Get("TipoEstacion")
'		Dim Marca As String=mDatosEstacionServicio.Get("Marca")
'		Dim lstDatosLineasPedidoEstacion As List=mLineaPedido.Get("LineasPedidoEstacion")
'		For Each mLineaPedidoEstacion As Map In lstDatosLineasPedidoEstacion
'			'Log($"mLineaPedidoEstacion ${mLineaPedidoEstacion}"$)
'			Dim mDatosEmpleado As Map=mLineaPedidoEstacion.Get("Empleado")
'			'Log($"mDatosEmpleado ${mDatosEmpleado}"$)
'			Dim DNI As String=mDatosEmpleado.Get("DNI")
'			Dim DNIOK As Boolean=mDatosEmpleado.Get("DNIOK")
'			Dim NombreEmpleado As String=mDatosEmpleado.Get("NombreEmpleado")
'			Dim Cargo As String=mDatosEmpleado.Get("Cargo")
'			Dim SexoEmpleado As String=mDatosEmpleado.Get("SexoEmpleado")
'			Dim EmbarazoEmpleado As String=mDatosEmpleado.Get("EmbarazoEmpleado")
'			Dim lstLineasPedidoEmpleado As List=mLineaPedidoEstacion.Get("LineasPedidoEmpleado")
'			For Each mLineaPedidoEmpleado As Map In lstLineasPedidoEmpleado
'				'Log($"mLineaPedidoEmpleado ${mLineaPedidoEmpleado}"$)
'				Dim NumLinea As String=mLineaPedidoEmpleado.Get("NumLinea")
'				Dim CodigoPrenda As String=mLineaPedidoEmpleado.Get("CodigoPrenda")
'				Dim Talla As String=mLineaPedidoEmpleado.Get("Talla")
'				Dim Cantidad As Int=mLineaPedidoEmpleado.Get("Cantidad")
'				sheet1.PutString(xl.AddressZero(0,idxFila),NumLinea)
'				sheet1.PutString(xl.AddressZero(1,idxFila),IDSedeEmpresa)
'				sheet1.PutString(xl.AddressZero(2,idxFila),NumeroPedidoEstacion)
'				sheet1.PutDate(xl.AddressZero(3,idxFila),FechaSolicitudLong)
'				sheet1.PutString(xl.AddressZero(4,idxFila),NombreEstacion)
'				sheet1.PutString(xl.AddressZero(5,idxFila),Calle)
'				sheet1.PutString(xl.AddressZero(6,idxFila),CodigoPostal)
'				sheet1.PutString(xl.AddressZero(7,idxFila),Poblacion)
'				sheet1.PutString(xl.AddressZero(8,idxFila),CodigoProvincia)
'				sheet1.PutString(xl.AddressZero(9,idxFila),Telefono)
'				sheet1.PutString(xl.AddressZero(10,idxFila),TipoEstacion)
'				sheet1.PutString(xl.AddressZero(11,idxFila),Marca)
'				sheet1.PutString(xl.AddressZero(12,idxFila),DNI)
'				sheet1.PutString(xl.AddressZero(13,idxFila),NombreEmpleado)
'				sheet1.PutString(xl.AddressZero(14,idxFila),Cargo)
'				sheet1.PutString(xl.AddressZero(15,idxFila),SexoEmpleado)
'				sheet1.PutString(xl.AddressZero(16,idxFila),EmbarazoEmpleado)
'				sheet1.PutString(xl.AddressZero(17,idxFila),CodigoPrenda)
'				sheet1.PutString(xl.AddressZero(18,idxFila),Talla)
'				sheet1.PutNumber(xl.AddressZero(19,idxFila),Cantidad)
'				'sheet1.PutString(xl.AddressZero(20,idxFila),IIf(DNIOK,"OK","NOK"))
'
'				#if debug
'				Log($"idxFila ${idxFila}"$)
'				#End If
'				idxFila=idxFila+1
'			Next
'		Next
'	Next
'	
'	Dim UltimaFila As Int=idxFila
'	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
'	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
'	
'	Sleep(0)
'	jamLoadingIndicator1.MensajeLoading="Grabando Excel líneas OK..."
'	
'	Dim f As String = Workbook.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & ".xlsx", True)
'	DateTime.DateFormat=DateFormatAnt
'	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel líneas ok " & f,"Error")
'		Wait For (msa) Msgbox_Result
'		'Return
'	End If
'	
'	
'	
'	Sleep(0)
'	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas NO OK..."
'	
'	' EXCEL LINEAS NO OK
'	
'	Dim csvHeaderLineasNooK(6) As String
'	csvHeaderLineasNooK(0)="NumeroLinea"
'	csvHeaderLineasNooK(1)="IDSedeEmpresa"
'	csvHeaderLineasNooK(2)="NumeroPedidoEstacion"
'	csvHeaderLineasNooK(3)="DNI"
'	csvHeaderLineasNooK(4)="Errores"
'	csvHeaderLineasNooK(5)="TextoLinea"
'	
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd-MM-yy"
'	Dim xl As XLUtils
'	xl.Initialize
'	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
'	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos Lineas NO OK")
'	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
'	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
'	'Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
'	
'	Dim NumCols As Int=csvHeaderLineasNooK.Length
'	
'	For idxCol=0 To NumCols-1
'		sheet1.PutString(xl.AddressZero(idxCol,0), csvHeaderLineasNooK(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
'	Next
'	idxFila=1
'	For Each LineasErrorPedido As TipoDatosLineaErrorPedidoRepsol In lstLineasError
'		sheet1.PutString(xl.AddressZero(0,idxFila),LineasErrorPedido.NumeroLinea)
'		sheet1.PutString(xl.AddressZero(1,idxFila),LineasErrorPedido.IDSedeEmpresa)
'		sheet1.PutString(xl.AddressZero(2,idxFila),LineasErrorPedido.NumeroPedidoEstacion)
'		sheet1.PutString(xl.AddressZero(3,idxFila),LineasErrorPedido.DNIEmpleado)
'		sheet1.PutString(xl.AddressZero(4,idxFila),LineasErrorPedido.Errores)
'		sheet1.PutString(xl.AddressZero(5,idxFila),LineasErrorPedido.TextoLinea)
'
'		idxFila=idxFila+1
'	Next
'	
'	Dim UltimaFila As Int=idxFila
'	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
'	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
'	
'	Sleep(0)
'	jamLoadingIndicator1.MensajeLoading="Grabando Excel líneas NO OK..."
'	
'	Dim f As String = Workbook.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & "-errores.xlsx", True)
'	DateTime.DateFormat=DateFormatAnt
'	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel " & f,"Error")
'		Wait For (msa) Msgbox_Result
'		'Return
'	End If
'	
'	jamLoadingIndicator1.close
'	
'	Return Null
'End Sub

'Private Sub btnSelFichero_Click
'	Dim FileName As String=SeleccionFicheroCarpetaRed
'	
'		
'	Dim DirFichero As String=File.GetFileParent(FileName)
'	Dim NombreFichero As String=File.GetName(FileName)
'	
'	wait for(ProcesarFichero3(DirFichero,NombreFichero,CarpetaDestinoFicherosPedidosRepsol,NombreFichero)) complete (rObj As Object)
'End Sub

' returns a 16-Bit Android String from 2-bytes-UTF8 String
Sub utf2android(utf As String) As String
	Dim m As Int = utf.Length-1
	Dim i As Int
	Dim android(m+1) As Byte
	For i=0 To m
		android(i) = Asc(utf.CharAt(i))
	Next
	Return BytesToString(android, 0, android.Length, "UTF-8")
End Sub



Sub checkDNI(dni As String) As String
	If dni.Length<>9 Then Return False 'longitud incorrecta
	dni = dni.ToUpperCase
	Dim txtlongitud As Int = dni.Length
	Dim letra As String = dni.SubString2(txtlongitud-1,txtlongitud)
	Try
		Dim letracalculada As String = getLetraDNI(dni.SubString2(0,txtlongitud-1))
	Catch
		Log(LastException)
		Return False
	End Try
	
	If letra=letracalculada Then Return True Else Return False
End Sub

Sub getLetraDNI(dni As String) As String
	If dni.Length<>8 Then Return "" 'longitud incorrecta
	dni = dni.ToUpperCase
	' Si es un NIE hay que cambiar la primera letra por 0, 1 ó 2 dependiendo de si es X, Y o Z.
	Dim primeraletra As String = dni.SubString2(0,1)
	Select Case primeraletra
		Case "X":
			dni = dni.Replace("X","0")
		Case "Y":
			dni = dni.Replace("Y","1")
		Case "Z":
			dni = dni.Replace("Z","2")
	End Select
	Dim letras As String = "TRWAGMYFPDXBNJZSQVHLCKE"
	Dim character As Int
	character = (1 + (dni) Mod 23)
	Return letras.SubString2 ((character-1), (character-1)+ 1)
End Sub


'
'Sub ProcesarFichero2(CarpetaFicheroOrigen As String, NombreFicheroOrigen As String,  CarpetaDestinoFichero As String, NombreFicheroDestino As String) As ResumableSub
'
'	jamLoadingIndicator1.MensajeLoading="Procesando fichero..."
'	jamLoadingIndicator1.IniciarControlTiempoProceso
'	jamLoadingIndicator1.Show
'	
'	Dim lstLineasFichero As List
'	lstLineasFichero.Initialize
'
'	'lstLineasFichero = File.ReadList(CarpetaFicheroOrigen , NombreFicheroOrigen)   ' SOLO si el fichero origen está en UTF-8 . el de Repsol parece que no lo está...
'
'	Dim tr As TextReader
'	tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "ISO-8859-1")
'	lstLineasFichero=tr.ReadList
'	
''	Dim line As String
''	line = tr.ReadLine
''	Do While line <> Null
''		'Log(line)
''		line = tr.ReadLine
''		If line.Length>0 Then lstLineasFichero.Add(line)
''	Loop
''	tr.Close
'	
'	Dim lstDatosLineasPedido As List
'	lstDatosLineasPedido.Initialize
'	
''	Dim lstCSV As List
''	lstCSV.Initialize
'	
'	Dim lstEmpleadosConError As List
'	lstEmpleadosConError.Initialize
'
'	Dim DNIEmpleadoSel As String
'	
'	Dim mDataEstacionServicio As Map
'	mDataEstacionServicio.Initialize
'	Dim lstLineasPedidoEstacion As List
'	lstLineasPedidoEstacion.Initialize
'	Dim mDataEmpleado As Map
'	mDataEmpleado.Initialize
'	Dim lstLineasPedidoEmpleado As List
'	lstLineasPedidoEmpleado.Initialize
'	
'	Dim lstLineasError As List
'	lstLineasError.Initialize
'	
'	Dim csvHeader(20) As String
'	csvHeader(0)="Linea"
'	'csvHeader(1)="TipoLinea"
'	csvHeader(1)="IDSedeEmpresa"
'	csvHeader(2)="NumeroPedido"
'	csvHeader(3)="FechaSolicitud"
'	csvHeader(4)="NombreEstacion"
'	csvHeader(5)="Calle"
'	csvHeader(6)="CodigoPostal"
'	csvHeader(7)="Poblacion"
'	csvHeader(8)="CodigoProvincia"
'	csvHeader(9)="Telefono"
'	csvHeader(10)="TipoEstacion"
'	csvHeader(11)="Marca"
'	csvHeader(12)="DNI"
'	csvHeader(13)="NombreEmpleado"
'	csvHeader(14)="Cargo"
'	csvHeader(15)="Sexo"
'	csvHeader(16)="Embarazo"
'	csvHeader(17)="CodigoPrenda"
'	csvHeader(18)="Talla"
'	csvHeader(19)="Cantidad"
''	csvHeader(20)="DNIOk"
''	csvHeader(21)="LineaOK"
''	csvHeader(22)="Error"
'
'
'	' EXCEL LINEAS OK
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd-MM-yy"
'	Dim xl As XLUtils
'	xl.Initialize
'	Dim WorkbookLineasOK As XLWorkbookWriter = xl.CreateWriterBlank
'	Dim sheet1LineasOK As XLSheetWriter = WorkbookLineasOK.CreateSheetWriterByName("Datos Pedido")
'	Dim HeaderStyleLineasOK As XLStyle=WorkbookLineasOK.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
''	Dim FechasStyle As XLStyle = WorkbookLineasOK.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
''	Dim RowStyles As List = Array(WorkbookLineasOK.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), sheet1LineasOK.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
'	
'	Dim NumCols As Int=csvHeader.Length
'	
'	For idxCol=0 To NumCols-1
'		sheet1LineasOK.PutString(xl.AddressZero(idxCol,0), csvHeader(idxCol)).SetStyle(sheet1LineasOK.LastAccessed, HeaderStyleLineasOK)
'	Next
'
'
'	' EXCEL LINEAS NO OK
'	Dim csvHeaderLineasNooK(6) As String
'	csvHeaderLineasNooK(0)="NumeroLinea"
'	csvHeaderLineasNooK(1)="IDSedeEmpresa"
'	csvHeaderLineasNooK(2)="NumeroPedidoEstacion"
'	csvHeaderLineasNooK(3)="DNI"
'	csvHeaderLineasNooK(4)="Errores"
'	csvHeaderLineasNooK(5)="TextoLinea"
'	
''	Dim DateFormatAnt As String=DateTime.DateFormat
''	DateTime.DateFormat="dd-MM-yy"
''	Dim xl As XLUtils
''	xl.Initialize
'	Dim WorkbookLineasError As XLWorkbookWriter = xl.CreateWriterBlank
'	Dim sheet1LineasError As XLSheetWriter = WorkbookLineasError.CreateSheetWriterByName("Datos Lineas NO OK")
'	Dim HeaderStyleLineasError As XLStyle=WorkbookLineasError.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
''	Dim FechasStyle As XLStyle = WorkbookLineasError.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
''	Dim RowStyles As List = Array(WorkbookLineasError.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), WorkbookLineasError.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
'	
'	Dim NumCols As Int=csvHeaderLineasNooK.Length
'	
'	For idxCol=0 To NumCols-1
'		sheet1LineasError.PutString(xl.AddressZero(idxCol,0), csvHeaderLineasNooK(idxCol)).SetStyle(sheet1LineasError.LastAccessed, HeaderStyleLineasError)
'	Next
'
'
'
'	Dim idxFila As Int=1
'	
''	Dim CabeceraPedido As String=lstLineasFichero.Get(0)
''	Dim ElementosCabecera(2) As String=Regex.Split("PEDVESTUARIO",CabeceraPedido)
''	Dim CorrelativoPedido As String=CabeceraPedido.SubString2(0,6)
''	Dim FechaPedido As String=NombreFichero.Replace("PEDVESTUARIO","").Replace(".TXT","")
'
'	
'
'	For Each sLinea As String In lstLineasFichero
'	
'		'Dim sLineaUTF8 As String=utf2android(sLinea)
'		Dim csvLine(20) As Object
'		
'		Try
'			Dim NumLinea As String=sLinea.SubString2(0,6)
'		Catch
'			Log(LastException)
'			Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'			LineaError.Initialize
'			LineaError.Errores=LineaError.Errores & " " & LastException
'			LineaError.TextoLinea=sLinea
'			lstLineasError.Add(LineaError)
'			InsertarExcelLineaPedidoError(xl,sheet1LineasError,idxFila, LineaError)
'			Continue
'		End Try
'
'		csvLine(0)=NumLinea
'
''		jamLoadingIndicator1.MensajeLoading=$"Procesando línea nº $2.0{NumLinea}..."$
''		Sleep(0)
'		Dim TipoLinea As Int=sLinea.SubString2(6,7)
'		csvLine(2)=TipoLinea
'		'Dim IDSedeEmpresaSel As String
'		Select Case TipoLinea
'			Case 0 ' cabecera pedido
'				Dim LineaNumeroPedido As String=sLinea.SubString(7)  ' = nombre fichero?
'				Dim ArrLineaNumeroPedido() As String=Regex.Split(".TXT",LineaNumeroPedido)
'				Dim NumeroPedido As String=ArrLineaNumeroPedido(0)
'				Log($"NumeroPedido ${NumeroPedido}"$)
'			Case 1 ' cabecera estacion servicio
'				'000002100000022002521-04-2022PUERTA CABA?AS, S.L.
'
'				Dim IDSedeEmpresa As String=sLinea.SubString2(7,15)   ' 8 posiciones   CAMPO CLAVE 1 PARA FICHERO ERRORES
'				'Log($"IDSedeEmpresa ${IDSedeEmpresa}"$)
'				'If IDSedeEmpresaSel<>IDSedeEmpresa Then
'					If mDataEstacionServicio.Size>0 Then
'						Dim mDataPedidoEstacion As Map
'						mDataPedidoEstacion.Initialize
'						mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
'						mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
'						lstDatosLineasPedido.add(mDataPedidoEstacion)
'					End If
'					Dim NumeroPedidoEstacion As String=sLinea.SubString2(15,19)   ' 4 posiciones   CAMPO CLAVE 2 PARA FICHERO ERRORES
'					Dim FechaSolicitud As String=sLinea.SubString2(19,29)   ' 10 posiciones  DD-MM-YYYY
'					Dim NombreEstacion As String=sLinea.SubString2(29,94)   ' 65 posiciones
'					Dim Calle As String=sLinea.SubString2(94,159)   ' 65 posiciones
'					Dim CodigoPostal As String=sLinea.SubString2(159,164)   ' 5 posiciones
'					Dim Poblacion As String=sLinea.SubString2(164,194)   ' 30 posiciones
'					Dim CodigoProvincia As String=sLinea.SubString2(194,196)   ' 2 posiciones
'					Dim Telefono As String=sLinea.SubString2(196,211)   ' 15 posiciones
'					Dim sTipoEstacion As String=sLinea.SubString2(211,226)   ' 15 posiciones
'					Dim TipoEstacion As String=sTipoEstacion
''					Select Case sTipoEstacion
''						Case "888-CRED"
''							TipoEstacion="CampsaRed"
''						Case "999-GESPEVESA"
''							TipoEstacion="Gespevesa"
''						Case Else
''							TipoEstacion="Abanderadas"
''					End Select
'					Dim sMarca As String=sLinea.SubString2(226,236)   ' 10 posiciones
'					Dim Marca As String=sMarca
''					Select Case sMarca
''						Case "70"
''							Marca="Campsa"
''						Case "80"
''							Marca="Repsol"
''						Case "90"
''							Marca=""
''						
''					End Select
'					'...
'					Dim mDataEstacionServicio As Map
'					mDataEstacionServicio.Initialize
'					mDataEstacionServicio.Put("IDSedeEmpresa",IDSedeEmpresa)
'					mDataEstacionServicio.Put("NumeroPedidoEstacion",NumeroPedidoEstacion)
'					mDataEstacionServicio.Put("FechaSolicitud",FechaSolicitud)
'					mDataEstacionServicio.Put("NombreEstacion",NombreEstacion.Trim)
'					mDataEstacionServicio.Put("Calle",Calle.Trim)
'					mDataEstacionServicio.Put("CodigoPostal",CodigoPostal.Trim)
'					mDataEstacionServicio.Put("Poblacion",Poblacion.Trim)
'					mDataEstacionServicio.Put("CodigoProvincia",CodigoProvincia.Trim)
'					mDataEstacionServicio.Put("Telefono",Telefono.Trim)
'					mDataEstacionServicio.Put("TipoEstacion",TipoEstacion.Trim)
'					mDataEstacionServicio.Put("Marca",Marca.Trim)
'					
'					Dim lstLineasPedidoEstacion As List
'					lstLineasPedidoEstacion.Initialize
'				'End If
'			Case 2 ' empleado
'				Dim DNI As String=sLinea.SubString2(29,38)   'CAMPO CLAVE 3 PARA FICHERO ERRORES
'				If DNIEmpleadoSel<>DNI Then
'					DNIEmpleadoSel=DNI
'					If Not(checkDNI(DNIEmpleadoSel)) Then
'						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'						LineaError.Initialize
'						LineaError.NumeroLinea=NumLinea
'						LineaError.Errores=LineaError.Errores & " " & " DNI NO OK"
'						LineaError.TextoLinea=sLinea
'						LineaError.IDSedeEmpresa=IDSedeEmpresa
'						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'						LineaError.DNIEmpleado=DNI
'						lstLineasError.Add(LineaError)
'						InsertarExcelLineaPedidoError(xl,sheet1LineasError,idxFila, LineaError)
'						Continue  ' PASAMOS A LA LINEA SIGUIENTE
'					Else
'						If mDataEmpleado.Size>0 Then
'							Dim mDataPedidoEmpleado As Map
'							mDataPedidoEmpleado.Initialize
'							mDataPedidoEmpleado.Put("Empleado",mDataEmpleado)
'							mDataPedidoEmpleado.Put("LineasPedidoEmpleado",lstLineasPedidoEmpleado)
'							lstLineasPedidoEstacion.Add(mDataPedidoEmpleado)
'						End If
'					End If
'
'					Try
'						Dim DNIOK As Boolean=checkDNI(DNIEmpleadoSel)
'						Dim NombreEmpleado As String=sLinea.SubString2(38,138)
'						Dim sCargo As String=sLinea.SubString2(138,139)
'						Dim Cargo As String
'						Select Case sCargo
'							Case "G"
'								Cargo="Gestor"
'							Case "E"
'								Cargo="Encargado"
'							Case "V"
'								Cargo="Vendedor"
'						End Select
'						'Log("NumLinea: " & NumLinea)
'
'						Dim sSexoEmpleado As String=sLinea.SubString2(139,140)
'						Dim SexoEmpleado As String
'						Select Case sSexoEmpleado
'							Case "H"
'								SexoEmpleado="Hombre"
'							Case "M"
'								SexoEmpleado="Mujer"
'						End Select
'					
'						Dim sEmbarazoEmpleado As String=sLinea.SubString2(140,141)
'
'						Dim EmbarazoEmpleado As String
'						Select Case sEmbarazoEmpleado
'							Case "S"
'								EmbarazoEmpleado="SI"
'							Case "N"
'								EmbarazoEmpleado="NO"
'						End Select
'					Catch
'						'Log(LastException)
''						Dim mDataErr As Map
''						mDataErr.Initialize
''						mDataErr.Put("NumLinea",NumLinea)
''						mDataErr.Put("Texto Línea: ", sLinea)
''						lstLineasErroneas.Add(mDataErr)
'
''						DatosCheckLinea.Status="NO OK"
''						DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
''						lstLineasNOOK.Add(DatosCheckLinea)
'						
'						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'						LineaError.Initialize
'						LineaError.NumeroLinea=NumLinea
'						LineaError.Errores=LineaError.Errores & " " & LastException
'						LineaError.TextoLinea=sLinea
'						LineaError.IDSedeEmpresa=IDSedeEmpresa
'						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'						LineaError.DNIEmpleado=DNIEmpleadoSel
'						lstLineasError.Add(LineaError)
'						InsertarExcelLineaPedidoError(xl,sheet1LineasError,idxFila, LineaError)
'						Continue
'					End Try
'					
'					Dim mDataEmpleado As Map
'					mDataEmpleado.Initialize
'					mDataEmpleado.Put("DNI",DNI)
'					mDataEmpleado.Put("DNIOK",DNIOK)
'					mDataEmpleado.Put("NombreEmpleado",NombreEmpleado.Trim)
'					mDataEmpleado.Put("Cargo",Cargo)
'					mDataEmpleado.Put("SexoEmpleado",SexoEmpleado)
'					mDataEmpleado.Put("EmbarazoEmpleado",EmbarazoEmpleado)
'				
'					Dim lstLineasPedidoEmpleado As List
'					lstLineasPedidoEmpleado.Initialize
'				End If
'				
'			Case 3 ' prendas empleado
'				Try
'					Dim CodigoPrenda As String=sLinea.SubString2(38,40)
'					Dim Talla As String=sLinea.SubString2(40,44)
'					Dim Cantidad As Int=sLinea.SubString2(44,45)
'				Catch
'					'Log(LastException)
''					Dim mDataErr As Map
''					mDataErr.Initialize
''					mDataErr.Put("NumLinea",NumLinea)
''					mDataErr.Put("Texto Línea: ", sLinea)
''					lstLineasErroneas.Add(mDataErr)
'
''					DatosCheckLinea.Status="NO OK"
''					DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
''					lstLineasNOOK.Add(DatosCheckLinea)
'					
'					Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'					LineaError.Initialize
'					LineaError.NumeroLinea=NumLinea
'					LineaError.Errores=LineaError.Errores & " " & LastException
'					LineaError.TextoLinea=sLinea
'					LineaError.IDSedeEmpresa=IDSedeEmpresa
'					LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'					LineaError.DNIEmpleado=DNIEmpleadoSel
'					lstLineasError.Add(LineaError)
'					InsertarExcelLineaPedidoError(xl,sheet1LineasError,idxFila, LineaError)
'					Continue
'				End Try
'				Dim mDataLineaPedidoEmpleado As Map
'				mDataLineaPedidoEmpleado.Initialize
'				mDataLineaPedidoEmpleado.Put("NumLinea",NumLinea)
'				mDataLineaPedidoEmpleado.Put("CodigoPrenda",CodigoPrenda)
'				mDataLineaPedidoEmpleado.Put("Talla",Talla.Trim)
'				mDataLineaPedidoEmpleado.Put("Cantidad",Cantidad)
'				lstLineasPedidoEmpleado.Add(mDataLineaPedidoEmpleado)
'				
'			Case 9  ' fin fichero
'				' añadir los datos del último pedido
'				If mDataEstacionServicio.Size>0 Then
'					Dim mDataPedidoEstacion As Map
'					mDataPedidoEstacion.Initialize
'					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
'					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
'					lstDatosLineasPedido.add(mDataPedidoEstacion)
'				End If
'				Exit ' Salir del loop (ésta debería ser la última línea) En el fichero de ejemplo, se ha añadido 1 línea en blanco, que da error
'			Case Else
'				' error en TipoLinea, no reconocido
'
'				Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'				LineaError.Initialize
'				LineaError.NumeroLinea=NumLinea
'				LineaError.Errores=$"Tipo de línea ${TipoLinea} no reconocido."$
'				LineaError.TextoLinea=sLinea
'				LineaError.IDSedeEmpresa=""
'				LineaError.NumeroPedidoEstacion=""
'				LineaError.DNIEmpleado=""
'				lstLineasError.Add(LineaError)
'				InsertarExcelLineaPedidoError(xl,sheet1LineasError,idxFila, LineaError)
'		End Select
'	Next
'	
'	
'	jamLoadingIndicator1.DetenerControlTiempoProceso
'	
''	Log(lstDatosLineas)
'	
''	Dim JSONGenerator As JSONGenerator
''	JSONGenerator.Initialize2(lstJSON)
''	Dim sJSON As String=JSONGenerator.ToPrettyString(2)
''	File.WriteString(xui.DefaultFolder, NombreFichero.Replace(".TXT",".JSON"), sJSON)
''	
''	
''	wait For(Utilidades.JSONtoCSV(sJSON,True,";")) complete (sResp As String)
''	If sResp<>"" Then
''		Dim sCSV As String=sResp
''		File.WriteString(DirFichero,NombreFichero.Replace(".TXT",".CSV"),sCSV)
''	End If
''	
'	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas OK..."
'
'
'	
'	
'	idxFila=1
'	For Each mLineaPedido As Map In lstDatosLineasPedido
'		'Log($"mLineaPedido ${mLineaPedido}"$)
'		Dim mDatosLineaPedidoExcel As Map
'		mDatosLineaPedidoExcel.Initialize
'		Dim mDatosEstacionServicio As Map=mLineaPedido.Get("EstacionServicio")
'		Dim IDSedeEmpresa As String=mDatosEstacionServicio.Get("IDSedeEmpresa")
'		Dim NumeroPedidoEstacion As String=mDatosEstacionServicio.Get("NumeroPedidoEstacion")
'		Dim sFechaSolicitud As String=mDatosEstacionServicio.Get("FechaSolicitud")
'		Dim FechaSolicitudLong As Long=DateTime.DateParse(sFechaSolicitud)
'		Dim NombreEstacion As String=mDatosEstacionServicio.Get("NombreEstacion")
'		Dim Calle As String=mDatosEstacionServicio.Get("Calle")
'		Dim CodigoPostal As String=mDatosEstacionServicio.Get("CodigoPostal")
'		Dim Poblacion As String=mDatosEstacionServicio.Get("Poblacion")
'		Dim CodigoProvincia As String=mDatosEstacionServicio.Get("CodigoProvincia")
'		Dim Telefono As String=mDatosEstacionServicio.Get("Telefono")
'		Dim TipoEstacion As String=mDatosEstacionServicio.Get("TipoEstacion")
'		Dim Marca As String=mDatosEstacionServicio.Get("Marca")
'		Dim lstDatosLineasPedidoEstacion As List=mLineaPedido.Get("LineasPedidoEstacion")
'		For Each mLineaPedidoEstacion As Map In lstDatosLineasPedidoEstacion
'			'Log($"mLineaPedidoEstacion ${mLineaPedidoEstacion}"$)
'			Dim mDatosEmpleado As Map=mLineaPedidoEstacion.Get("Empleado")
'			'Log($"mDatosEmpleado ${mDatosEmpleado}"$)
'			Dim DNI As String=mDatosEmpleado.Get("DNI")
'			Dim DNIOK As Boolean=mDatosEmpleado.Get("DNIOK")
'			Dim NombreEmpleado As String=mDatosEmpleado.Get("NombreEmpleado")
'			Dim Cargo As String=mDatosEmpleado.Get("Cargo")
'			Dim SexoEmpleado As String=mDatosEmpleado.Get("SexoEmpleado")
'			Dim EmbarazoEmpleado As String=mDatosEmpleado.Get("EmbarazoEmpleado")
'			Dim lstLineasPedidoEmpleado As List=mLineaPedidoEstacion.Get("LineasPedidoEmpleado")
'			For Each mLineaPedidoEmpleado As Map In lstLineasPedidoEmpleado
'				'Log($"mLineaPedidoEmpleado ${mLineaPedidoEmpleado}"$)
'				Dim NumLinea As String=mLineaPedidoEmpleado.Get("NumLinea")
'				Dim CodigoPrenda As String=mLineaPedidoEmpleado.Get("CodigoPrenda")
'				Dim Talla As String=mLineaPedidoEmpleado.Get("Talla")
'				Dim Cantidad As Int=mLineaPedidoEmpleado.Get("Cantidad")
'				sheet1LineasOK.PutString(xl.AddressZero(0,idxFila),NumLinea)
'				sheet1LineasOK.PutString(xl.AddressZero(1,idxFila),IDSedeEmpresa)
'				sheet1LineasOK.PutString(xl.AddressZero(2,idxFila),NumeroPedidoEstacion)
'				sheet1LineasOK.PutDate(xl.AddressZero(3,idxFila),FechaSolicitudLong)
'				sheet1LineasOK.PutString(xl.AddressZero(4,idxFila),NombreEstacion)
'				sheet1LineasOK.PutString(xl.AddressZero(5,idxFila),Calle)
'				sheet1LineasOK.PutString(xl.AddressZero(6,idxFila),CodigoPostal)
'				sheet1LineasOK.PutString(xl.AddressZero(7,idxFila),Poblacion)
'				sheet1LineasOK.PutString(xl.AddressZero(8,idxFila),CodigoProvincia)
'				sheet1LineasOK.PutString(xl.AddressZero(9,idxFila),Telefono)
'				sheet1LineasOK.PutString(xl.AddressZero(10,idxFila),TipoEstacion)
'				sheet1LineasOK.PutString(xl.AddressZero(11,idxFila),Marca)
'				sheet1LineasOK.PutString(xl.AddressZero(12,idxFila),DNI)
'				sheet1LineasOK.PutString(xl.AddressZero(13,idxFila),NombreEmpleado)
'				sheet1LineasOK.PutString(xl.AddressZero(14,idxFila),Cargo)
'				sheet1LineasOK.PutString(xl.AddressZero(15,idxFila),SexoEmpleado)
'				sheet1LineasOK.PutString(xl.AddressZero(16,idxFila),EmbarazoEmpleado)
'				sheet1LineasOK.PutString(xl.AddressZero(17,idxFila),CodigoPrenda)
'				sheet1LineasOK.PutString(xl.AddressZero(18,idxFila),Talla)
'				sheet1LineasOK.PutNumber(xl.AddressZero(19,idxFila),Cantidad)
'				'sheet1.PutString(xl.AddressZero(20,idxFila),IIf(DNIOK,"OK","NOK"))
'
'				#if debug
'				Log($"idxFila ${idxFila}"$)
'				#End If
'				idxFila=idxFila+1
'			Next
'		Next
'	Next
'	
'	Dim UltimaFila As Int=idxFila
'	sheet1LineasOK.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
'	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
'	Dim f As String = WorkbookLineasOK.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & ".xlsx", True)
'	DateTime.DateFormat=DateFormatAnt
'	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel líneas ok " & f,"Error")
'		Wait For (msa) Msgbox_Result
'		'Return
'	End If
'	
'	
'	
'
'	idxFila=1
'	For Each LineasErrorPedido As TipoDatosLineaErrorPedidoRepsol In lstLineasError
'		sheet1LineasError.PutString(xl.AddressZero(0,idxFila),LineasErrorPedido.NumeroLinea)
'		sheet1LineasError.PutString(xl.AddressZero(1,idxFila),LineasErrorPedido.IDSedeEmpresa)
'		sheet1LineasError.PutString(xl.AddressZero(2,idxFila),LineasErrorPedido.NumeroPedidoEstacion)
'		sheet1LineasError.PutString(xl.AddressZero(3,idxFila),LineasErrorPedido.DNIEmpleado)
'		sheet1LineasError.PutString(xl.AddressZero(4,idxFila),LineasErrorPedido.Errores)
'		sheet1LineasError.PutString(xl.AddressZero(5,idxFila),LineasErrorPedido.TextoLinea)
'
'		idxFila=idxFila+1
'	Next
'	
'	Dim UltimaFila As Int=idxFila
'	sheet1LineasError.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
'	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
'	Dim f As String = WorkbookLineasError.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & "-errores.xlsx", True)
'	DateTime.DateFormat=DateFormatAnt
'	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel " & f,"Error")
'		Wait For (msa) Msgbox_Result
'		'Return
'	End If
'	
'	
'	jamLoadingIndicator1.close
'	
'	Return Null
'End Sub
'
'Sub InsertarExcelLineaPedidoOK(mDataLineaOK As Map)
'	
'End Sub
'
'
'
'Sub InsertarExcelLineaPedidoError(xl As XLUtils, sheet1LineasError As XLSheetWriter, iDXFila As Long, DatosLineaError As TipoDatosLineaErrorPedidoRepsol)
'	sheet1LineasError.PutString(xl.AddressZero(0,iDXFila),DatosLineaError.NumeroLinea)
'	sheet1LineasError.PutString(xl.AddressZero(1,iDXFila),DatosLineaError.IDSedeEmpresa)
'	sheet1LineasError.PutString(xl.AddressZero(2,iDXFila),DatosLineaError.NumeroPedidoEstacion)
'	sheet1LineasError.PutString(xl.AddressZero(3,iDXFila),DatosLineaError.DNIEmpleado)
'	sheet1LineasError.PutString(xl.AddressZero(4,iDXFila),DatosLineaError.Errores)
'	sheet1LineasError.PutString(xl.AddressZero(5,iDXFila),DatosLineaError.TextoLinea)
'End Sub




Private Sub btnSelFicheroFTP_Click
	txtFicheroSeleccionado.Text=""
	DirFicheroProcesar=""
	NombreFicheroProcesar=""
	
'	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		SalirModulo
'		Return
'	End If
'	Dim mDataConn As Map=mRes.Get("mDataConn")
'	Log(mDataConn)
'	
'	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
'	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
'	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
'	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
'	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")
	
	'sFtpRepsol.List(FilesFoldersFtpRepsol)
	'Wait For sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)
	
	
	jamLoadingIndicator1.MensajeLoading="Buscando Fichero Pedido en carpeta FTP..."
	jamLoadingIndicator1.Show
	Wait For(BuscarUltimoFicheroPedidoEnFTP) complete (sResp As String)
	If sResp.StartsWith("Error") Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync(sResp.Replace("Error,",""),"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	If sResp.StartsWith("Aviso") Then
		jamLoadingIndicator1.close
		Dim msa As Object=xui.MsgboxAsync(sResp.Replace("Aviso,",""),"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim NombreFicheroPedido As String=sResp
	
	If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroPedido) Then
'	Dim msa As Object = xui.Msgbox2Async($"El fichero ${File.Combine(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFichero)} ya existe.
'	¿Reemplazarlo por el fichero seleccionado?"$,"Confirma", "Sí","Cancelar", "", Null)
		Log("segsdfg")
	End If
	
	Dim RutaFTPFicheroPedido As String=FilesFoldersFtpRepsol & "/" & NombreFicheroPedido
	
	jamLoadingIndicator1.MensajeLoading=$"Descargando Fichero Pedido ${NombreFicheroPedido} desde carpeta FTP..."$
	jamLoadingIndicator1.IniciarControlTiempoProceso
	Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPFicheroPedido, CarpetaDestinoFicherosDescargadosFTPPedidosRepsol, NombreFicheroPedido)) complete (Success As Boolean)
	jamLoadingIndicator1.DetenerControlTiempoProceso
	If Not(Success) Then
		' PENDIENTE AFINAR EL MENSAJE PARA EL USUARIO (VENTAS PROIN)
		Dim msa As Object=xui.MsgboxAsync($"Ha habido un error en la descarga del fichero ${NombreFicheroPedido}"$,"ATENCION!")
		Wait For (msa) Msgbox_Result
		jamLoadingIndicator1.close
		Return
	Else
		DirFicheroProcesar=CarpetaDestinoFicherosDescargadosFTPPedidosRepsol
		NombreFicheroProcesar=NombreFicheroPedido
		txtFicheroSeleccionado.Text=File.Combine(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroProcesar)
		
		Dim msa As Object=xui.MsgboxAsync($"Fichero ${NombreFicheroPedido} descargado a carpeta destino Repsol ${CarpetaDestinoFicherosDescargadosFTPPedidosRepsol}"$,"Aviso")
		Wait For (msa) Msgbox_Result
		

	End If
	
	'comprobar que el fichero está en la carpeta correcta
	
	If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroPedido)=False Then
		Dim msa As Object=xui.MsgboxAsync($"El fichero ${NombreFicheroPedido} descargado a carpeta destino Repsol ${CarpetaDestinoFicherosDescargadosFTPPedidosRepsol} NO se encuentra en esa carpeta."$,"ERROR")
		Wait For (msa) Msgbox_Result
		jamLoadingIndicator1.close
		Return
	End If
	
	'' BORRAR fichero de OUTBOX . Habilitar sólo cuando el resto funcione totalmente...
	
''''''	sFtpRepsol.DeleteFile(RutaFTPFicheroPedido)
''''''	Wait For sFtpRepsol_CommandCompleted (Command As String, Success As Boolean, Reply As String)
''''''	If Not(Success) Then
''''''		'...
''''''	End If
	

	jamLoadingIndicator1.close
End Sub


Private Sub btnSelFicheroWindows_Click
	txtFicheroSeleccionado.Text=""
	Dim FileName As String=SeleccionFicheroCarpetaRed
	
		
	Dim DirFichero As String=File.GetFileParent(FileName)
	Dim NombreFichero As String=File.GetName(FileName)
	
	If NombreFichero="" Then Return
	
	If DirFichero<>CarpetaDestinoFicherosDescargadosFTPPedidosRepsol Then
		Dim msa As Object = xui.Msgbox2Async($"Se copiará el fichero seleccionado a la carpeta ${CarpetaDestinoFicherosDescargadosFTPPedidosRepsol}. ¿Continuar?"$,"Confirma", "Sí","Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFichero) Then
			Dim msa As Object = xui.Msgbox2Async($"El fichero ${File.Combine(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFichero)} ya existe.
¿Reemplazarlo por el fichero seleccionado?"$,"Confirma", "Sí","Cancelar", "", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			File.Delete(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFichero)
		End If
		File.Copy(DirFichero,NombreFichero,CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFichero)
	End If
	
	DirFicheroProcesar=CarpetaDestinoFicherosDescargadosFTPPedidosRepsol
	NombreFicheroProcesar=NombreFichero
	txtFicheroSeleccionado.Text=File.Combine(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroProcesar)
	
'	wait for(ProcesarFichero3(DirFichero,NombreFichero,CarpetaDestinoFicherosPedidosRepsol,NombreFichero)) complete (rObj As Object)
End Sub

Private Sub btnProcesar_Click
	If File.Exists(DirFicheroProcesar,NombreFicheroProcesar)=False Then
		Dim msa As Object=xui.MsgboxAsync($"No existe el fichero ${File.Combine(DirFicheroProcesar,NombreFicheroProcesar)}"$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	
	jamLoadingIndicator1.MensajeLoading=$"Procesando Fichero Pedido ${txtFicheroSeleccionado.Text}..."$
	wait for(ProcesarFichero3(DirFicheroProcesar,NombreFicheroProcesar,DirFicheroProcesar,NombreFicheroProcesar)) complete (Success As Boolean)
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible completar el proceso","Error")
		Wait For (msa) Msgbox_Result
	Else
		Dim msa As Object=xui.MsgboxAsync("Se ha completado el proceso con éxito.","Aviso")
		Wait For (msa) Msgbox_Result
	End If
End Sub


'
'Sub CargaDireccionesEnvioRepsolEESS As ResumableSub
'	
'	mSQL.ExecNonQuery("delete from tblRepsolMapeoSedesEESS")
'	
'	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
'	Dim mRes As Map
'	mRes.Initialize
'	mRes.Put("Accion",Accion)
'	mRes.Put("lstReg",lstReg)
'	Dim Comando As String="RepsolDireccionesEnvioEESS"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mCodigoNAVClienteRepsolEESS), Me)
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
'		If mResult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No hay datos de direcciones de envío de las EESS de España."$,"Error")
'			Wait For (msa) Msgbox_Result
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("lstReg", lstReg)
''			Dim mData0 As Map=lstReg.Get(0)
''			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolMapeoArticulosEESS",mData0,"")
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblRepsolMapeoSedesEESS", lstReg)
'		End If
'	End If
'	Return mRes
'End Sub


Sub CargaDireccionesEnvioRepsolEESSGRP As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblRepsolMapeoSedesEESS")
	
	Dim Accion As String
	Dim Error As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("Error",Error)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="RepsolDireccionesEnvioEESSGRP"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mCodigoNAVGRPRepsolEESS), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
		Accion="NOK"
		Error="Error de conexion servidor/query " & Comando & "."
		mRes.Put("Accion", Accion)
		mRes.Put("Error", Error)
	Else
		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No hay datos de direcciones de envío de las EESS de España."$,"Error")
'			Wait For (msa) Msgbox_Result
			Accion="NOK"
			Error=$"No hay datos de direcciones de envío de las EESS de España."$
			mRes.Put("Accion", Accion)
			mRes.Put("Error", Error)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			Error=""
			mRes.Put("Accion", Accion)
			mRes.Put("Error", Error)
			mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolMapeoArticulosEESS",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblRepsolMapeoSedesEESS", lstReg)
		End If
	End If
	Return mRes
End Sub


Sub CargaTarifaVentaValidaActualGRPRepsolEESS As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblRepsolTarifaVentaGRP07506")
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="TarifaVentaActualTipoTarifaCodigoTarifa"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(1,mCodigoNAVGRPRepsolEESS), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de tarifa de precios de las EESS de España."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolTarifaVentaGRP07506",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblRepsolTarifaVentaGRP07506", lstReg)
		End If
	End If
	Return mRes
End Sub





Sub CargaMapeoArticulosEESS As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblRepsolMapeoArticulosEESS")
	LogColor("CargaMapeoArticulosEESS",xui.Color_Magenta)
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="RepsolMapeoArticulosEESS"
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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de mapeo artículos REPSOL."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolMapeoArticulosEESS",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblRepsolMapeoArticulosEESS", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub CargaMapeoCodigosPrendaEESS As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblRepsolMapeoCodigosPrendaEESS")
	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="RepsolMapeoCodigosPrendaEESS"
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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de mapeo de tipo de prendas."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolMapeoCodigosPrendaEESS",mData0,"")
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblRepsolMapeoCodigosPrendaEESS", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub CargaTallasArticulosEESS As ResumableSub
	
	Dim Accion As String
	Dim Error As String
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("Error",Error)
	
	mSQL.ExecNonQuery("delete from tblRepsolTallasArticulosEESS")
	
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarLineasArticulosTallasBatchUsuarioDispositivo",Array(Main.DatosUsuario.NombreUsuarioWindows,Main.DatosUsuario.Dispositivo))
	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (success As Boolean)
	If success=False Then
		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar los datos batch anteriores del usuario/dispositivo actuales.","Error")
'		Wait For (msa) Msgbox_Result
'		Return False
		Accion="NOK"
		Error="No ha sido posible eliminar los datos batch anteriores del usuario/dispositivo actuales."
		mRes.Put("Accion",Accion)
		mRes.Put("Error",Error)
		Return mRes
	End If

	Dim UUIDBatch As String=Utilidades.GenerarUUIDv4
	Dim lstCommands As List
	lstCommands.Initialize
	Dim rsArtsEESS As ResultSet=mSQL.ExecQuery("select DISTINCT CodigoArticuloNAV from tblRepsolMapeoArticulosEESS")
	Do While rsArtsEESS.NextRow
		Dim CodigoArticuloNAV As String=rsArtsEESS.GetString("CodigoArticuloNAV")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaArticuloTallaBatch", _
			Array(UUIDBatch, Main.DatosUsuario.NombreUsuarioWindows,Main.DatosUsuario.Dispositivo,CodigoArticuloNAV,"",0,0,""))
		lstCommands.Add(cmd)
	Loop
	rsArtsEESS.Close
	
	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (success As Boolean)
	If success=False Then
		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible insertar las líneas batch de los artículos de Respol."$,"Error")
'		Wait For (msa) Msgbox_Result
'  		Return False
		Accion="NOK"
		Error="No ha sido posible insertar las líneas batch de los artículos de Repsol."
		mRes.Put("Accion",Accion)
		mRes.Put("Error",Error)
		Return mRes
		
	End If
	
	Wait For(CargaTallasArticulosEESSBatch(UUIDBatch)) complete (mResBatch As Map)
	Dim AccionBatch As String=mResBatch.Get("Accion")
	If AccionBatch="NOK" Then
		Accion="NOK"
		Error=mResBatch.Get("Error")
		mRes.Put("Accion",Accion)
		mRes.Put("Error",Error)
		Return mRes
	End If

	Dim cmd As DBCommand=JRDCQuery.CreateCommand("BorrarLineasArticulosTallasBatchUUID",Array(UUIDBatch))
	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (success As Boolean)
	' no comprobamos el exito del borrado Batch
	
	
	Accion="OK"
	Error=""
	mRes.Put("Accion",Accion)
	mRes.Put("Error",Error)
	Return mRes
	
	
End Sub



Sub CargaTallasArticulosEESSBatch(UUIDSel As String) As ResumableSub
	
	mSQL.ExecNonQuery("delete from tblRepsolTallasArticulosEESS")
	LogColor("CargaTallasArticulosEESSBatch",xui.Color_Magenta)
	Dim Accion As String
	Dim Error As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("Error",Error)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="RepsolTallasArticulosBatch"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(UUIDSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
		Accion="NOK"
		Error=$"Error de conexion servidor/query ${Comando}."$
		mRes.Put("Accion", Accion)
		mRes.Put("Error", Error)
	Else
		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync($"No hay datos de tallas de artículos Repsol."$,"Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			Error=$"No hay datos de tallas de artículos Repsol."$
			mRes.Put("Accion", Accion)
			mRes.Put("Error", Error)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			Error=""
			mRes.Put("Accion", Accion)
			mRes.Put("Error", Error)
			'mRes.Put("lstReg", lstReg)
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblRepsolMapeoArticulosEESS",mData0,"")
			LogColor("InsertarMapsSoloCamposCoincidentes tblRepsolTallasArticulosEESS",xui.Color_Green)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblRepsolTallasArticulosEESS", lstReg)
		End If
	End If
	Return mRes
End Sub

''''''
''''''
''''''Sub ProcesarFichero2(CarpetaFicheroOrigen As String, NombreFicheroOrigen As String,  CarpetaDestinoFichero As String, NombreFicheroDestino As String) As ResumableSub
''''''
''''''	mSQL.ExecNonQuery("delete from tblRepsolLineasFicheroPedido")
''''''
''''''	jamLoadingIndicator1.MensajeLoading="Procesando fichero..."
''''''	jamLoadingIndicator1.IniciarControlTiempoProceso
''''''	jamLoadingIndicator1.Show
''''''	
''''''	Dim lstLineasFichero As List
''''''	lstLineasFichero.Initialize
''''''
''''''	'lstLineasFichero = File.ReadList(CarpetaFicheroOrigen , NombreFicheroOrigen)   ' SOLO si el fichero origen está en UTF-8 . el de Repsol parece que no lo está...
''''''
''''''	Dim tr As TextReader
''''''	tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "ISO-8859-1")
''''''	lstLineasFichero=tr.ReadList	
'''''''	Dim line As String
'''''''	line = tr.ReadLine
'''''''	Do While line <> Null
'''''''		'Log(line)
'''''''		line = tr.ReadLine
'''''''		lstLineasFichero.Add(line)
'''''''	Loop
'''''''	tr.Close
''''''	
''''''	Dim lstDatosLineasPedido As List
''''''	lstDatosLineasPedido.Initialize
''''''	
'''''''	Dim lstCSV As List
'''''''	lstCSV.Initialize
''''''	
''''''	Dim lstEmpleadosConError As List
''''''	lstEmpleadosConError.Initialize
''''''
''''''	
''''''	Dim DNIEmpleadoSel As String
''''''	
''''''	Dim mDataEstacionServicio As Map
''''''	mDataEstacionServicio.Initialize
''''''	Dim lstLineasPedidoEstacion As List
''''''	lstLineasPedidoEstacion.Initialize
''''''	Dim mDataEmpleado As Map
''''''	mDataEmpleado.Initialize
''''''	Dim lstLineasPedidoEmpleado As List
''''''	lstLineasPedidoEmpleado.Initialize
''''''	
''''''	Dim lstLineasError As List
''''''	lstLineasError.Initialize
''''''	
''''''	Dim csvHeader(20) As String
''''''	csvHeader(0)="Linea"
''''''	'csvHeader(1)="TipoLinea"
''''''	csvHeader(1)="IDSedeEmpresa"
''''''	csvHeader(2)="NumeroPedido"
''''''	csvHeader(3)="FechaSolicitud"
''''''	csvHeader(4)="NombreEstacion"
''''''	csvHeader(5)="Calle"
''''''	csvHeader(6)="CodigoPostal"
''''''	csvHeader(7)="Poblacion"
''''''	csvHeader(8)="CodigoProvincia"
''''''	csvHeader(9)="Telefono"
''''''	csvHeader(10)="TipoEstacion"
''''''	csvHeader(11)="Marca"
''''''	csvHeader(12)="DNI"
''''''	csvHeader(13)="NombreEmpleado"
''''''	csvHeader(14)="Cargo"
''''''	csvHeader(15)="Sexo"
''''''	csvHeader(16)="Embarazo"
''''''	csvHeader(17)="CodigoPrenda"
''''''	csvHeader(18)="Talla"
''''''	csvHeader(19)="Cantidad"
'''''''	csvHeader(20)="DNIOk"
'''''''	csvHeader(21)="LineaOK"
'''''''	csvHeader(22)="Error"
''''''	
''''''	Dim idxFila As Int=1
''''''	
'''''''	Dim CabeceraPedido As String=lstLineasFichero.Get(0)
'''''''	Dim ElementosCabecera(2) As String=Regex.Split("PEDVESTUARIO",CabeceraPedido)
'''''''	Dim CorrelativoPedido As String=CabeceraPedido.SubString2(0,6)
'''''''	Dim FechaPedido As String=NombreFichero.Replace("PEDVESTUARIO","").Replace(".TXT","")
''''''
''''''	Dim DateFormatAnt As String=DateTime.DateFormat
''''''	DateTime.DateFormat="dd-MM-yyyy"
''''''
''''''	For Each sLinea As String In lstLineasFichero
''''''		'Log(sLinea.Length)
''''''		
''''''		Dim NumCharLinea As Int=sLinea.Length
''''''		'Dim sLineaUTF8 As String=utf2android(sLinea)
''''''		Dim csvLine(20) As Object
''''''		
''''''		If NumCharLinea<6 Then
''''''			'			Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'''''''			LineaError.Initialize
'''''''			LineaError.Errores=LineaError.Errores & " " & LastException
'''''''			LineaError.TextoLinea=sLinea
'''''''			lstLineasError.Add(LineaError)
''''''			mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, LineaOK, Error) values (?,?,?)"$, Array(idxFila,0,"Longitud línea inferior a 6"))
''''''			Continue
''''''		Else
''''''			Dim NumLinea As String=sLinea.SubString2(0,6)
''''''		End If
''''''
''''''
''''''
''''''		csvLine(0)=NumLinea
''''''
'''''''		jamLoadingIndicator1.MensajeLoading=$"Procesando línea nº $2.0{NumLinea}..."$
'''''''		Sleep(0)
''''''		Dim TipoLinea As Int=sLinea.SubString2(6,7)
''''''		csvLine(2)=TipoLinea
''''''		'Dim IDSedeEmpresaSel As String
''''''		Select Case TipoLinea
''''''			Case 0 ' cabecera pedido
''''''
'''''''				If sLinea.Length<>57 Then
'''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 0 inferior a 57 caracteres (${sLinea.Length}"$))
'''''''					Continue
'''''''				End If
''''''				Dim LineaNumeroPedido As String=sLinea.SubString(7)  ' = nombre fichero?
''''''				Dim ArrLineaNumeroPedido() As String=Regex.Split(".TXT",LineaNumeroPedido)
''''''				Dim NumeroPedido As String=ArrLineaNumeroPedido(0)
''''''				Log($"NumeroPedido ${NumeroPedido}"$)
''''''			Case 1 ' cabecera estacion servicio
''''''				
''''''				Dim DatosLineaPedido As TipoDatosLineaPedidoRepsol
''''''				DatosLineaPedido.Initialize
''''''				
''''''				Dim ErrorLineaEstacionServicio As Boolean
''''''				If NumCharLinea<>236 Then
''''''					ErrorLineaEstacionServicio=True
''''''					DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion=$"Longitud Linea Cabecera EESS<>236"$
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 1 distinto de 236 caracteres (${NumCharLinea}"$))
''''''					'Continue
''''''				End If
''''''				
''''''				Dim ErrorIDSedeEmpresa As Boolean
''''''				If NumCharLinea<15 Then
''''''					DatosLineaPedido.ControlSede="ERROR"
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorIDSedeEmpresa=True
''''''					'DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Sede longitud campo"$
''''''					DatosLineaPedido.ErrorCabeceraEstacion=$"Longitud Linea Cabecera EESS<15"$
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, 0,$"Sede errónea, longitud línea tipo dato 1 inferior a 15 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim IDSedeEmpresa As String=sLinea.SubString2(7,15)   ' 8 posiciones   CAMPO CLAVE 1 PARA FICHERO ERRORES
''''''					DatosLineaPedido.Sede=IDSedeEmpresa
''''''					DatosLineaPedido.CodigoClienteERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?",Array(DatosLineaPedido.Sede)))
''''''					DatosLineaPedido.ControlSede=IIf(DatosLineaPedido.CodigoClienteERP="","ERROR","OK")
''''''					DatosLineaPedido.CodigoDireccionEnvioERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?",Array(DatosLineaPedido.Sede)))
''''''					DatosLineaPedido.ControlSede=IIf(DatosLineaPedido.CodigoDireccionEnvioERP="","ERROR","OK")
''''''					If DatosLineaPedido.ControlSede="ERROR" Then DatosLineaPedido.ErrorCabeceraEstacion=$",Sede No existe ERP"$
''''''				End If
''''''				
''''''				'Log($"IDSedeEmpresa ${IDSedeEmpresa}"$)
''''''				'If IDSedeEmpresaSel<>IDSedeEmpresa Then
''''''				If mDataEstacionServicio.Size>0 Then
''''''					Dim mDataPedidoEstacion As Map
''''''					mDataPedidoEstacion.Initialize
''''''					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
''''''					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
''''''					lstDatosLineasPedido.add(mDataPedidoEstacion)
''''''				End If
''''''				
''''''				Dim ErrorNumeroPedidoEstacion As Boolean
''''''				If NumCharLinea<19 And ErrorIDSedeEmpresa=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorNumeroPedidoEstacion=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, LineaOK, Error) values (?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa,0,$"NumeroPedidoEstacion erróneo, longitud línea tipo dato 1 inferior a 19 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim NumeroPedidoEstacion As String=sLinea.SubString2(15,19)   ' 4 posiciones   CAMPO CLAVE 2 PARA FICHERO ERRORES
''''''					DatosLineaPedido.CodigoPedido=NumeroPedidoEstacion
''''''				End If
''''''				
''''''				Dim ErrorFechaPedido As Boolean
''''''				If NumCharLinea<29 And ErrorNumeroPedidoEstacion=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorFechaPedido=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido,LineaOK, Error) values (?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, 0,$"FechaPedido erróneo, longitud línea tipo dato 1 inferior a 29 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim FechaPedido As String=sLinea.SubString2(19,29)   ' 10 posiciones  DD-MM-YYYY
''''''					Try
''''''						Dim FechaPedidoLong As Long=DateTime.DateParse(FechaPedido)
''''''						DatosLineaPedido.FechaPedido=FechaPedido
''''''						DatosLineaPedido.ControlFechaPedido="OK"
''''''					Catch
''''''						ErrorLineaEstacionServicio=True
''''''						ErrorFechaPedido=True
''''''						DatosLineaPedido.ControlFechaPedido="ERROR"
''''''						DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Fecha"$
''''''''''						mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido,LineaOK, Error) values (?,?,?,?,?,?,?)"$, _ 
''''''''''							Array(idxFila,NumLinea,TipoLinea,IDSedeEmpresa, NumeroPedidoEstacion, 0,$"FechaPedido erróneo,formato fecha incorrecto (${FechaPedido}"$))
''''''					End Try
''''''					
''''''				End If
''''''				
''''''				Dim ErrorNombreEstacion As Boolean
''''''				If NumCharLinea<94 And ErrorFechaPedido=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorNombreEstacion=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido,LineaOK, Error) values (?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,0,$"NombreEstacion erróneo, longitud línea tipo dato 1 inferior a 94 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim NombreEstacion As String=sLinea.SubString2(29,94)   ' 65 posiciones
''''''					DatosLineaPedido.NombreEstacion=NombreEstacion
''''''				End If
''''''				
''''''				Dim ErrorCalle As Boolean
''''''				If NumCharLinea<159 And ErrorNombreEstacion=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorCalle=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,LineaOK, Error) values (?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion, 0,$"Calle errónea, longitud línea tipo dato 1 inferior a 159 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim Calle As String=sLinea.SubString2(94,159)   ' 65 posiciones
''''''					DatosLineaPedido.Calle=Calle
''''''				End If
''''''				
''''''				Dim ErrorCodigoPostal As Boolean
''''''				If NumCharLinea<164 And ErrorCalle=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorCodigoPostal=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, 0,$"Código Postal erróneo, longitud línea tipo dato 1 inferior a 164 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim CodigoPostal As String=sLinea.SubString2(159,164)   ' 5 posiciones
''''''					DatosLineaPedido.CodigoPostal=CodigoPostal
''''''				End If
''''''				
''''''				Dim ErrorPoblacion As Boolean
''''''				If NumCharLinea<194 And ErrorCodigoPostal=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorPoblacion=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal,0,$"Población errónea, longitud línea tipo dato 1 inferior a 194 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim Poblacion As String=sLinea.SubString2(164,194)   ' 30 posiciones
''''''					DatosLineaPedido.Poblacion=Poblacion
''''''				End If
''''''				
''''''				Dim ErrorCodigoProvincia As Boolean
''''''				If NumCharLinea<196 And ErrorPoblacion=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorCodigoProvincia=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion,0,$"CodigoProvincia erróneo, longitud línea tipo dato 1 inferior a 196 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim CodigoProvincia As String=sLinea.SubString2(194,196)   ' 2 posiciones
''''''					DatosLineaPedido.CodigoProvincia=CodigoProvincia
''''''				End If
''''''				
''''''				Dim ErrorTelefono As Boolean
''''''				If NumCharLinea<211 And ErrorCodigoProvincia=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorTelefono=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia,0,$"Teléfono erróneo, longitud línea tipo dato 1 inferior a 211 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim Telefono As String=sLinea.SubString2(196,211)   ' 15 posiciones
''''''					DatosLineaPedido.Telefono=Telefono
''''''				End If
''''''				
''''''				Dim ErrorTipoEstacion As Boolean
''''''				If NumCharLinea<226 And ErrorTelefono=False Then
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorTipoEstacion=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,0,$"TipoEstación erróneo, longitud línea tipo dato 1 inferior a 226 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim sTipoEstacion As String=sLinea.SubString2(211,226)   ' 15 posiciones
''''''					Dim TipoEstacion As String=sTipoEstacion
''''''
'''''''					Select Case sTipoEstacion   ''' NO CONTROLAMOS EL TIPO DE ESTACION, ya que no influye en el mapeo
'''''''						Case "888-CRED"
'''''''							TipoEstacion="CampsaRed"
'''''''						Case "999-GESPEVESA"
'''''''							TipoEstacion="Gespevesa"
'''''''						Case Else
'''''''							TipoEstacion="Abanderadas"
'''''''					End Select
''''''					DatosLineaPedido.TipoEstacion=TipoEstacion
''''''				End If
''''''				
''''''				Dim ErrorMarca As Boolean
''''''				If NumCharLinea<236 And ErrorTipoEstacion=False Then
''''''					DatosLineaPedido.ControlMarca="ERROR"
''''''					ErrorLineaEstacionServicio=True
''''''					ErrorMarca=True
''''''					DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Marca"$
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, TipoEstacion, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,TipoEstacion,0,$"Marca errónea, longitud línea tipo dato 1 inferior a 236 caracteres (${NumCharLinea}"$))
''''''				Else
''''''					Dim Marca As String=sLinea.SubString2(226,236)   ' 10 posiciones
'''''''					Dim Marca As String=sMarca
''''''''					Select Case sMarca
''''''''						Case "70"
''''''''							Marca="Campsa"
''''''''						Case "80"
''''''''							Marca="Repsol"
''''''''						Case "90"
''''''''							Marca=""
''''''''						
''''''''					End Select
''''''					If Not(Marca.ToUpperCase="REPSOL" Or Marca.ToUpperCase="CAMPSA" Or Marca.ToUpperCase="PETRONOR") Then
''''''						DatosLineaPedido.ControlMarca="ERROR"
''''''						ErrorLineaEstacionServicio=True
''''''						ErrorMarca=True
''''''						DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Marca"$
''''''''''						mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, TipoEstacion, Marca, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,TipoEstacion,Marca,0,$"Marca errónea, valor distinto de Repsol/Campsa/Petronor (${Marca}"$))
''''''					Else
''''''						DatosLineaPedido.Marca=Marca
''''''						DatosLineaPedido.ControlMarca="OK"
''''''					End If
''''''				End If
''''''				
''''''				If DatosLineaPedido.ErrorCabeceraEstacion.Length>0 Then DatosLineaPedido.ErrorCabeceraEstacion=DatosLineaPedido.ErrorCabeceraEstacion.SubString(1)
''''''
'''''''				If ErrorLineaEstacionServicio=False Then
'''''''					'...
'''''''					Dim mDataEstacionServicio As Map
'''''''					mDataEstacionServicio.Initialize
'''''''					mDataEstacionServicio.Put("IDSedeEmpresa",IDSedeEmpresa)
'''''''					mDataEstacionServicio.Put("NumeroPedidoEstacion",NumeroPedidoEstacion)
'''''''					mDataEstacionServicio.Put("FechaPedido",FechaPedido)
'''''''					mDataEstacionServicio.Put("NombreEstacion",NombreEstacion.Trim)
'''''''					mDataEstacionServicio.Put("Calle",Calle.Trim)
'''''''					mDataEstacionServicio.Put("CodigoPostal",CodigoPostal.Trim)
'''''''					mDataEstacionServicio.Put("Poblacion",Poblacion.Trim)
'''''''					mDataEstacionServicio.Put("CodigoProvincia",CodigoProvincia.Trim)
'''''''					mDataEstacionServicio.Put("Telefono",Telefono.Trim)
'''''''					mDataEstacionServicio.Put("TipoEstacion",TipoEstacion.Trim)
'''''''					mDataEstacionServicio.Put("Marca",Marca.Trim)
'''''''					
'''''''					Dim lstLineasPedidoEstacion As List
'''''''					lstLineasPedidoEstacion.Initialize
'''''''				End If
''''''				'End If
''''''			Case 2 ' empleado
''''''				DatosLineaPedido.ErrorEmpleado=""
''''''				Log(sLinea.Length)
''''''				Dim ErrorLineaEmpleado As Boolean
''''''				If NumCharLinea<>141 Then
''''''					ErrorLineaEmpleado=True
''''''''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 2 distinto de 141 caracteres (${NumCharLinea}"$))
''''''					'Continue
''''''					DatosLineaPedido.ErrorLongitudLineaEmpleado=$"Longitud Linea Empleado<>141"$
''''''				End If
''''''				
''''''				Dim DNI As String=sLinea.SubString2(29,38)   'CAMPO CLAVE 3 PARA FICHERO ERRORES
''''''				'If DNIEmpleadoSel<>DNI Then
''''''					
''''''					DNIEmpleadoSel=DNI
''''''					DatosLineaPedido.DNI=DNIEmpleadoSel
''''''					If Not(checkDNI(DNIEmpleadoSel)) Then
''''''						DatosLineaPedido.ControlDNI="ERROR"
''''''						DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error DNI no válido"$
''''''						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
''''''						LineaError.Initialize
''''''						LineaError.NumeroLinea=NumLinea
''''''						LineaError.Errores="DNI NO OK"
''''''						LineaError.TextoLinea=sLinea
''''''						LineaError.IDSedeEmpresa=IDSedeEmpresa
''''''						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
''''''						LineaError.DNIEmpleado=DNI
''''''						lstLineasError.Add(LineaError)
''''''						Continue  ' PASAMOS A LA LINEA SIGUIENTE
''''''					Else
''''''						DatosLineaPedido.ControlDNI="OK"
''''''						If mDataEmpleado.Size>0 Then
''''''							Dim mDataPedidoEmpleado As Map
''''''							mDataPedidoEmpleado.Initialize
''''''							mDataPedidoEmpleado.Put("Empleado",mDataEmpleado)
''''''							mDataPedidoEmpleado.Put("LineasPedidoEmpleado",lstLineasPedidoEmpleado)
''''''							lstLineasPedidoEstacion.Add(mDataPedidoEmpleado)
''''''						End If
''''''					End If
''''''
''''''					Try
''''''
''''''						Dim NombreEmpleado As String=sLinea.SubString2(38,138)
''''''						DatosLineaPedido.NombreEmpleado=NombreEmpleado
''''''						Dim sCargo As String=sLinea.SubString2(138,139)
'''''''						Dim Cargo As String
'''''''						Select Case sCargo
'''''''							Case "G"
'''''''								Cargo="Gestor"
'''''''							Case "E"
'''''''								Cargo="Encargado"
'''''''							Case "V"
'''''''								Cargo="Vendedor"
'''''''						End Select
''''''						DatosLineaPedido.Cargo=sCargo
''''''						If Not(sCargo="G" Or sCargo="E" Or sCargo="V") Then
''''''							 DatosLineaPedido.ControlCargo="ERROR"
''''''							DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Cargo Empleado"$
''''''						Else
''''''							DatosLineaPedido.ControlCargo="ERROR"
''''''						End If
''''''						'Log("NumLinea: " & NumLinea)
''''''
''''''						Dim sSexoEmpleado As String=sLinea.SubString2(139,140)
'''''''						Dim SexoEmpleado As String
'''''''						Select Case sSexoEmpleado
'''''''							Case "H"
'''''''								SexoEmpleado="Hombre"
'''''''							Case "M"
'''''''								SexoEmpleado="Mujer"
'''''''						End Select
''''''						DatosLineaPedido.Sexo=sSexoEmpleado
''''''						If Not(sSexoEmpleado="H" Or sSexoEmpleado="M") Then
''''''							 DatosLineaPedido.ControlSexo="ERROR"
''''''							DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Sexo Empleado"$
''''''						Else
''''''							DatosLineaPedido.ControlSexo="ERROR"
''''''						End If
''''''						
''''''						Dim sEmbarazoEmpleado As String=sLinea.SubString2(140,141)
''''''
'''''''						Dim EmbarazoEmpleado As String
'''''''						Select Case sEmbarazoEmpleado
'''''''							Case "S"
'''''''								EmbarazoEmpleado="SI"
'''''''							Case "N"
'''''''								EmbarazoEmpleado="NO"
'''''''						End Select
''''''						DatosLineaPedido.Embarazo=sEmbarazoEmpleado
''''''						If Not(sEmbarazoEmpleado="S" Or sEmbarazoEmpleado="N") Then
''''''							 DatosLineaPedido.ControlEmbarazo="ERROR"
''''''							DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Embarazo Empleado"$
''''''						Else
''''''							DatosLineaPedido.ControlEmbarazo="ERROR"
''''''						End If
''''''					Catch
''''''						'Log(LastException)
'''''''						Dim mDataErr As Map
'''''''						mDataErr.Initialize
'''''''						mDataErr.Put("NumLinea",NumLinea)
'''''''						mDataErr.Put("Texto Línea: ", sLinea)
'''''''						lstLineasErroneas.Add(mDataErr)
''''''
'''''''						DatosCheckLinea.Status="NO OK"
'''''''						DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
'''''''						lstLineasNOOK.Add(DatosCheckLinea)
''''''						
''''''						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
''''''						LineaError.Initialize
''''''						LineaError.NumeroLinea=NumLinea
''''''						LineaError.Errores=LastException
''''''						LineaError.TextoLinea=sLinea
''''''						LineaError.IDSedeEmpresa=IDSedeEmpresa
''''''						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
''''''						LineaError.DNIEmpleado=DNIEmpleadoSel
''''''						lstLineasError.Add(LineaError)
''''''
''''''						Continue
''''''					End Try
''''''					
''''''					Dim mDataEmpleado As Map
''''''					mDataEmpleado.Initialize
''''''					mDataEmpleado.Put("DNI",DNI)
''''''					'mDataEmpleado.Put("DNIOK",DNIOK)
''''''					mDataEmpleado.Put("NombreEmpleado",NombreEmpleado.Trim)
''''''					mDataEmpleado.Put("Cargo",sCargo)
''''''					mDataEmpleado.Put("SexoEmpleado",sSexoEmpleado)
''''''					mDataEmpleado.Put("EmbarazoEmpleado",sEmbarazoEmpleado)
''''''				
''''''					Dim lstLineasPedidoEmpleado As List
''''''					lstLineasPedidoEmpleado.Initialize
''''''				'End If
''''''				
''''''				If DatosLineaPedido.ErrorEmpleado.Length>0 And DatosLineaPedido.ErrorCabeceraEstacion="" Then DatosLineaPedido.ErrorEmpleado=DatosLineaPedido.ErrorEmpleado.SubString(1)
''''''				
''''''			Case 3 ' prendas empleado
''''''				If NumCharLinea<>45 Then
''''''					ErrorLineaEmpleado=True
''''''					''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 2 distinto de 141 caracteres (${NumCharLinea}"$))
''''''					'Continue
''''''					DatosLineaPedido.ErrorLongitudLineaProducto=$"Longitud Linea Producto<>45"$
''''''				End If
''''''				Try
''''''					DatosLineaPedido.ErrorLineaProducto=""
''''''					Dim CodigoPrenda As String=sLinea.SubString2(38,40)
''''''					DatosLineaPedido.CodigoPrenda=CodigoPrenda
''''''					DatosLineaPedido.DescripcionCodigoPrenda=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?", _
''''''						Array As String(DatosLineaPedido.CodigoPrenda)))
''''''					DatosLineaPedido.ControlCodigoPrenda=IIf(DatosLineaPedido.DescripcionCodigoPrenda="","ERROR","OK")
''''''					If DatosLineaPedido.ControlCodigoPrenda="ERROR" Then DatosLineaPedido.ErrorLineaProducto=$"${DatosLineaPedido.ErrorLineaProducto},Error Código Prenda"$
''''''					If DatosLineaPedido.ControlCodigoPrenda="ERROR" And DatosLineaPedido.ErrorEmpleado.Contains("Error Código Prenda")=False Then DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error Código Prenda"$
''''''					DatosLineaPedido.CodigoProductoERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Sexo=? and Embarazo=? and CodigoPrenda=?", _
''''''						Array(DatosLineaPedido.Marca, DatosLineaPedido.Sexo, DatosLineaPedido.Embarazo, DatosLineaPedido.CodigoPrenda)))
''''''					DatosLineaPedido.ControlCodigoProductoERP=IIf(DatosLineaPedido.CodigoProductoERP="","ERROR","OK")
''''''					If DatosLineaPedido.ControlCodigoProductoERP="ERROR" Then DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorLineaProducto},Error mapeo producto"$
''''''					If DatosLineaPedido.ControlCodigoProductoERP="ERROR" And DatosLineaPedido.ErrorEmpleado.Contains("Error mapeo producto")=False Then DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error mapeo producto"$
''''''					Dim Talla As String=sLinea.SubString2(40,44)
''''''					DatosLineaPedido.Talla=Talla
''''''					DatosLineaPedido.ControlTalla="PENDIENTE DE CONTROL"
''''''					Dim Cantidad As Int=sLinea.SubString2(44,45)
''''''					DatosLineaPedido.Cantidad=Cantidad
''''''				Catch
''''''					'Log(LastException)
'''''''					Dim mDataErr As Map
'''''''					mDataErr.Initialize
'''''''					mDataErr.Put("NumLinea",NumLinea)
'''''''					mDataErr.Put("Texto Línea: ", sLinea)
'''''''					lstLineasErroneas.Add(mDataErr)
''''''
'''''''					DatosCheckLinea.Status="NO OK"
'''''''					DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
'''''''					lstLineasNOOK.Add(DatosCheckLinea)
''''''					
''''''					Dim LineaError As TipoDatosLineaErrorPedidoRepsol
''''''					LineaError.Initialize
''''''					LineaError.NumeroLinea=NumLinea
''''''					LineaError.Errores=LastException
''''''					LineaError.TextoLinea=sLinea
''''''					LineaError.IDSedeEmpresa=IDSedeEmpresa
''''''					LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
''''''					LineaError.DNIEmpleado=DNIEmpleadoSel
''''''					lstLineasError.Add(LineaError)
''''''					
''''''					Continue
''''''				End Try
''''''				
''''''				If DatosLineaPedido.ErrorLineaProducto.Length>0 And DatosLineaPedido.ErrorCabeceraEstacion="" And DatosLineaPedido.ErrorEmpleado="" Then DatosLineaPedido.ErrorLineaProducto=DatosLineaPedido.ErrorLineaProducto.SubString(1)
''''''				
''''''				DatosLineaPedido.CodigoPrenda=CodigoPrenda
''''''				DatosLineaPedido.Talla=Talla
''''''				DatosLineaPedido.Cantidad=Cantidad
''''''				Dim mDataLineaPedidoEmpleado As Map
''''''				mDataLineaPedidoEmpleado.Initialize
''''''				mDataLineaPedidoEmpleado.Put("NumLinea",NumLinea)
''''''				mDataLineaPedidoEmpleado.Put("CodigoPrenda",CodigoPrenda)
''''''				mDataLineaPedidoEmpleado.Put("Talla",Talla.Trim)
''''''				mDataLineaPedidoEmpleado.Put("Cantidad",Cantidad)
''''''				lstLineasPedidoEmpleado.Add(mDataLineaPedidoEmpleado)
''''''				
''''''				If DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion<>"" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ErrorLongitudLineaEmpleado<>"" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ErrorLongitudLineaProducto<>"" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlSede="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlFechaPedido="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlMarca="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlDNI="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlCargo="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlSexo="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlEmbarazo="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlCodigoPrenda="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlCodigoProductoERP="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				If DatosLineaPedido.ControlTalla="ERROR" Then DatosLineaPedido.LineaOK=False
''''''				
''''''				
''''''				
''''''				
''''''				
''''''				'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorCabeceraEstacion}${DatosLineaPedido.ErrorEmpleado }${DatosLineaPedido.ErrorLineaProducto}"$ ' substring para quitar la primera coma de separador de errores
''''''				DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorCabeceraEstacion}${DatosLineaPedido.ErrorEmpleado }"$ ' substring para quitar la primera coma de separador de errores
''''''				
''''''				Log($"DatosLineaPedido ${DatosLineaPedido}"$)
''''''				
''''''				mSQL.AddNonQueryToBatch($"
''''''	insert into tblRepsolLineasFicheroPedido
''''''	(ErrorLongitudLineaCabeceraEstacion, Sede , ControlSede , CodigoClienteERP , CodigoDireccionEnvioERP 
''''''	, CodigoPedido , FechaPedido ,ControlFechaPedido, NombreEstacion ,Calle , CodigoPostal 
''''''	, Poblacion , CodigoProvincia , Telefono 
''''''	, TipoEstacion , Marca , ControlMarca 
''''''	,ErrorLongitudLineaEmpleado,,DNI , ControlDNI , NombreEmpleado , Cargo , ControlCargo 
''''''	, Sexo , ControlSexo ,  Embarazo , ControlEmbarazo 
''''''	,ErrorLongitudLineaProducto,CodigoPrenda , ControlCodigoPrenda , Talla , ControlTalla , Cantidad
''''''	, LineaOK , Error) 
''''''	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''''	Array(DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion, DatosLineaPedido.Sede, DatosLineaPedido.ControlSede, DatosLineaPedido.CodigoClienteERP, DatosLineaPedido.CodigoDireccionEnvioERP, _
''''''	DatosLineaPedido.CodigoPedido, DatosLineaPedido.FechaPedido, DatosLineaPedido.ControlFechaPedido, DatosLineaPedido.NombreEstacion, DatosLineaPedido.Calle, DatosLineaPedido.CodigoPostal, _
''''''	DatosLineaPedido.Poblacion, DatosLineaPedido.CodigoProvincia,DatosLineaPedido.Telefono, _
''''''	DatosLineaPedido.TipoEstacion, DatosLineaPedido.Marca, DatosLineaPedido.ControlMarca, _
''''''	DatosLineaPedido.ErrorLongitudLineaEmpleado,DatosLineaPedido.DNI, DatosLineaPedido.ControlDNI, DatosLineaPedido.NombreEmpleado, DatosLineaPedido.Cargo, DatosLineaPedido.ControlCargo, _
''''''	DatosLineaPedido.Sexo, DatosLineaPedido.ControlSexo, DatosLineaPedido.Embarazo, DatosLineaPedido.ControlEmbarazo, _
''''''	DatosLineaPedido.ErrorLongitudLineaProducto,DatosLineaPedido.CodigoPrenda, DatosLineaPedido.ControlCodigoPrenda, DatosLineaPedido.Talla, DatosLineaPedido.ControlTalla, DatosLineaPedido.Cantidad, _
''''''	DatosLineaPedido.LineaOK, DatosLineaPedido.ErrorLinea))
''''''
''''''				
''''''				
''''''			Case 9  ' fin fichero
''''''				' añadir los datos del último pedido
''''''				If mDataEstacionServicio.Size>0 Then
''''''					Dim mDataPedidoEstacion As Map
''''''					mDataPedidoEstacion.Initialize
''''''					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
''''''					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
''''''					lstDatosLineasPedido.add(mDataPedidoEstacion)
''''''				End If
''''''				Exit ' Salir del loop (ésta debería ser la última línea) En el fichero de ejemplo, se ha añadido 1 línea en blanco, que da error
''''''			Case Else
''''''				' error en TipoLinea, no reconocido
''''''
''''''				Dim LineaError As TipoDatosLineaErrorPedidoRepsol
''''''				LineaError.Initialize
''''''				LineaError.NumeroLinea=NumLinea
''''''				LineaError.Errores=$"Tipo de línea ${TipoLinea} no reconocido."$
''''''				LineaError.TextoLinea=sLinea
''''''				LineaError.IDSedeEmpresa=""
''''''				LineaError.NumeroPedidoEstacion=""
''''''				LineaError.DNIEmpleado=""
''''''				lstLineasError.Add(LineaError)
''''''		End Select
''''''	Next
''''''	
''''''	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
''''''	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
''''''	Log("NonQuery: " & Success)
''''''	
''''''	Dim rs As ResultSet=mSQL.ExecQuery($"select distinct Sede, CodigoPedido, DNI
''''''	,ErrorLongitudLineaCabeceraEstacion,ControlSede,ControlFechaPedido,ControlMarca,ErrorLongitudLineaEmpleado
'''''' ControlDNI<>'' or ControlCargo<>'' or ControlSexo<>'' or ControlEmbarazo<>'' or ErrorLongitudLineaProducto<>'' or ControlCodigoPrenda<>''
'''''' or ControlTalla<>
'''''' from tblRepsolLineasFicheroPedido
'''''' where ErrorLongitudLineaCabeceraEstacion<>'' or ControlSede<>'' or ControlFechaPedido<>'' or ControlMarca<>'' or ErrorLongitudLineaEmpleado<>''
'''''' or ControlDNI<>'' or ControlCargo<>'' or ControlSexo<>'' or ControlEmbarazo<>'' or ErrorLongitudLineaProducto<>'' or ControlCodigoPrenda<>''
'''''' or ControlTalla<>''"$)
''''''	Do While rs.NextRow
''''''		Dim Sede As String=rs.GetString("Sede")
''''''		Dim Pedido As String=rs.GetString("CodigoPedido")
''''''		Dim DNI As String=rs.GetString("DNI")
''''''		
''''''		mSQL.ExecNonQuery2("update tblRepsolLineasFicheroPedido set ErrorSedePedidoDNI=? where Sede=? and Pedido=? and DNI=?", _
''''''			Array As Object(1, Sede, Pedido, DNI))
''''''		Dim sbTextoError As StringBuilder
''''''		sbTextoError.Initialize
'''''''		If ErrorLongitudLineaCabeceraEstacion
'''''''		sbTextoError.Append(
''''''		
''''''	Loop
''''''	
''''''	DateTime.DateFormat=DateFormatAnt
''''''	
''''''	jamLoadingIndicator1.DetenerControlTiempoProceso
''''''	
'''''''	Log(lstDatosLineas)
''''''	
'''''''	Dim JSONGenerator As JSONGenerator
'''''''	JSONGenerator.Initialize2(lstJSON)
'''''''	Dim sJSON As String=JSONGenerator.ToPrettyString(2)
'''''''	File.WriteString(xui.DefaultFolder, NombreFichero.Replace(".TXT",".JSON"), sJSON)
'''''''	
'''''''	
'''''''	wait For(Utilidades.JSONtoCSV(sJSON,True,";")) complete (sResp As String)
'''''''	If sResp<>"" Then
'''''''		Dim sCSV As String=sResp
'''''''		File.WriteString(DirFichero,NombreFichero.Replace(".TXT",".CSV"),sCSV)
'''''''	End If
'''''''	
''''''
''''''	Sleep(0)
''''''	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas OK..."
''''''
''''''	' EXCEL LINEAS OK
''''''	Dim DateFormatAnt As String=DateTime.DateFormat
''''''	DateTime.DateFormat="dd-MM-yy"
''''''	Dim xl As XLUtils
''''''	xl.Initialize
''''''	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
''''''	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos Pedido")
''''''	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
''''''	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
''''''	'Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
''''''	
''''''	
''''''	Dim NumCols As Int=csvHeader.Length
''''''	
''''''	For idxCol=0 To NumCols-1
''''''		sheet1.PutString(xl.AddressZero(idxCol,0), csvHeader(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
''''''	Next
''''''	idxFila=1
''''''	For Each mLineaPedido As Map In lstDatosLineasPedido
''''''		'Log($"mLineaPedido ${mLineaPedido}"$)
''''''		Dim mDatosLineaPedidoExcel As Map
''''''		mDatosLineaPedidoExcel.Initialize
''''''		Dim mDatosEstacionServicio As Map=mLineaPedido.Get("EstacionServicio")
''''''		Dim IDSedeEmpresa As String=mDatosEstacionServicio.Get("IDSedeEmpresa")
''''''		Dim NumeroPedidoEstacion As String=mDatosEstacionServicio.Get("NumeroPedidoEstacion")
''''''		Dim sFechaSolicitud As String=mDatosEstacionServicio.Get("FechaSolicitud")
''''''		Dim FechaSolicitudLong As Long=DateTime.DateParse(sFechaSolicitud)
''''''		Dim NombreEstacion As String=mDatosEstacionServicio.Get("NombreEstacion")
''''''		Dim Calle As String=mDatosEstacionServicio.Get("Calle")
''''''		Dim CodigoPostal As String=mDatosEstacionServicio.Get("CodigoPostal")
''''''		Dim Poblacion As String=mDatosEstacionServicio.Get("Poblacion")
''''''		Dim CodigoProvincia As String=mDatosEstacionServicio.Get("CodigoProvincia")
''''''		Dim Telefono As String=mDatosEstacionServicio.Get("Telefono")
''''''		Dim TipoEstacion As String=mDatosEstacionServicio.Get("TipoEstacion")
''''''		Dim Marca As String=mDatosEstacionServicio.Get("Marca")
''''''		Dim lstDatosLineasPedidoEstacion As List=mLineaPedido.Get("LineasPedidoEstacion")
''''''		For Each mLineaPedidoEstacion As Map In lstDatosLineasPedidoEstacion
''''''			'Log($"mLineaPedidoEstacion ${mLineaPedidoEstacion}"$)
''''''			Dim mDatosEmpleado As Map=mLineaPedidoEstacion.Get("Empleado")
''''''			'Log($"mDatosEmpleado ${mDatosEmpleado}"$)
''''''			Dim DNI As String=mDatosEmpleado.Get("DNI")
''''''			Dim DNIOK As Boolean=mDatosEmpleado.Get("DNIOK")
''''''			Dim NombreEmpleado As String=mDatosEmpleado.Get("NombreEmpleado")
''''''			Dim Cargo As String=mDatosEmpleado.Get("Cargo")
''''''			Dim SexoEmpleado As String=mDatosEmpleado.Get("SexoEmpleado")
''''''			Dim EmbarazoEmpleado As String=mDatosEmpleado.Get("EmbarazoEmpleado")
''''''			Dim lstLineasPedidoEmpleado As List=mLineaPedidoEstacion.Get("LineasPedidoEmpleado")
''''''			For Each mLineaPedidoEmpleado As Map In lstLineasPedidoEmpleado
''''''				'Log($"mLineaPedidoEmpleado ${mLineaPedidoEmpleado}"$)
''''''				Dim NumLinea As String=mLineaPedidoEmpleado.Get("NumLinea")
''''''				Dim CodigoPrenda As String=mLineaPedidoEmpleado.Get("CodigoPrenda")
''''''				Dim Talla As String=mLineaPedidoEmpleado.Get("Talla")
''''''				Dim Cantidad As Int=mLineaPedidoEmpleado.Get("Cantidad")
''''''				sheet1.PutString(xl.AddressZero(0,idxFila),NumLinea)
''''''				sheet1.PutString(xl.AddressZero(1,idxFila),IDSedeEmpresa)
''''''				sheet1.PutString(xl.AddressZero(2,idxFila),NumeroPedidoEstacion)
''''''				sheet1.PutDate(xl.AddressZero(3,idxFila),FechaSolicitudLong)
''''''				sheet1.PutString(xl.AddressZero(4,idxFila),NombreEstacion)
''''''				sheet1.PutString(xl.AddressZero(5,idxFila),Calle)
''''''				sheet1.PutString(xl.AddressZero(6,idxFila),CodigoPostal)
''''''				sheet1.PutString(xl.AddressZero(7,idxFila),Poblacion)
''''''				sheet1.PutString(xl.AddressZero(8,idxFila),CodigoProvincia)
''''''				sheet1.PutString(xl.AddressZero(9,idxFila),Telefono)
''''''				sheet1.PutString(xl.AddressZero(10,idxFila),TipoEstacion)
''''''				sheet1.PutString(xl.AddressZero(11,idxFila),Marca)
''''''				sheet1.PutString(xl.AddressZero(12,idxFila),DNI)
''''''				sheet1.PutString(xl.AddressZero(13,idxFila),NombreEmpleado)
''''''				sheet1.PutString(xl.AddressZero(14,idxFila),Cargo)
''''''				sheet1.PutString(xl.AddressZero(15,idxFila),SexoEmpleado)
''''''				sheet1.PutString(xl.AddressZero(16,idxFila),EmbarazoEmpleado)
''''''				sheet1.PutString(xl.AddressZero(17,idxFila),CodigoPrenda)
''''''				sheet1.PutString(xl.AddressZero(18,idxFila),Talla)
''''''				sheet1.PutNumber(xl.AddressZero(19,idxFila),Cantidad)
''''''				'sheet1.PutString(xl.AddressZero(20,idxFila),IIf(DNIOK,"OK","NOK"))
''''''
''''''				#if debug
''''''				Log($"idxFila ${idxFila}"$)
''''''				#End If
''''''				idxFila=idxFila+1
''''''			Next
''''''		Next
''''''	Next
''''''	
''''''	Dim UltimaFila As Int=idxFila
''''''	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
''''''	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
''''''	
''''''	Sleep(0)
''''''	jamLoadingIndicator1.MensajeLoading="Grabando Excel líneas OK..."
''''''	
''''''	Dim f As String = Workbook.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & ".xlsx", True)
''''''	DateTime.DateFormat=DateFormatAnt
''''''	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
''''''	If Success=False Then
''''''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel líneas ok " & f,"Error")
''''''		Wait For (msa) Msgbox_Result
''''''		'Return
''''''	End If
''''''	
''''''	
''''''	
''''''	Sleep(0)
''''''	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas NO OK..."
''''''	
''''''	' EXCEL LINEAS NO OK
''''''	
''''''	Dim csvHeaderLineasNooK(6) As String
''''''	csvHeaderLineasNooK(0)="NumeroLinea"
''''''	csvHeaderLineasNooK(1)="IDSedeEmpresa"
''''''	csvHeaderLineasNooK(2)="NumeroPedidoEstacion"
''''''	csvHeaderLineasNooK(3)="DNI"
''''''	csvHeaderLineasNooK(4)="Errores"
''''''	csvHeaderLineasNooK(5)="TextoLinea"
''''''	
''''''	Dim DateFormatAnt As String=DateTime.DateFormat
''''''	DateTime.DateFormat="dd-MM-yy"
''''''	Dim xl As XLUtils
''''''	xl.Initialize
''''''	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
''''''	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos Lineas NO OK")
''''''	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
''''''	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
''''''	'Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
''''''	
''''''	Dim NumCols As Int=csvHeaderLineasNooK.Length
''''''	
''''''	For idxCol=0 To NumCols-1
''''''		sheet1.PutString(xl.AddressZero(idxCol,0), csvHeaderLineasNooK(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
''''''	Next
''''''	idxFila=1
''''''	For Each LineasErrorPedido As TipoDatosLineaErrorPedidoRepsol In lstLineasError
''''''		sheet1.PutString(xl.AddressZero(0,idxFila),LineasErrorPedido.NumeroLinea)
''''''		sheet1.PutString(xl.AddressZero(1,idxFila),LineasErrorPedido.IDSedeEmpresa)
''''''		sheet1.PutString(xl.AddressZero(2,idxFila),LineasErrorPedido.NumeroPedidoEstacion)
''''''		sheet1.PutString(xl.AddressZero(3,idxFila),LineasErrorPedido.DNIEmpleado)
''''''		sheet1.PutString(xl.AddressZero(4,idxFila),LineasErrorPedido.Errores)
''''''		sheet1.PutString(xl.AddressZero(5,idxFila),LineasErrorPedido.TextoLinea)
''''''
''''''		idxFila=idxFila+1
''''''	Next
''''''	
''''''	Dim UltimaFila As Int=idxFila
''''''	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
''''''	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
''''''	
''''''	Sleep(0)
''''''	jamLoadingIndicator1.MensajeLoading="Grabando Excel líneas NO OK..."
''''''	
''''''	Dim f As String = Workbook.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & "-errores.xlsx", True)
''''''	DateTime.DateFormat=DateFormatAnt
''''''	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
''''''	If Success=False Then
''''''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel " & f,"Error")
''''''		Wait For (msa) Msgbox_Result
''''''		'Return
''''''	End If
''''''	
''''''	jamLoadingIndicator1.close
''''''	
''''''	Return Null
''''''End Sub



Sub ProcesarFichero3(CarpetaFicheroOrigen As String, NombreFicheroOrigen As String,  CarpetaDestinoFichero As String, NombreFicheroDestino As String) As ResumableSub
	
	jamLoadingIndicator1.MensajeLoading="Cargando configuración FTP..."
	jamLoadingIndicator1.Show
	
	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return False
	End If
	Dim mDataConn As Map=mRes.Get("mDataConn")
	'Log(mData0)
	
	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")

	mSQL.ExecNonQuery("delete from tblRepsolLineasFicheroPedido")
	mSQL.ExecNonQuery("delete from tblRepsolErroresSedePedidoDNIFicheroPedido")

	jamLoadingIndicator1.MensajeLoading="Procesando fichero..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Dim lstLineasFichero As List
	lstLineasFichero.Initialize

	'lstLineasFichero = File.ReadList(CarpetaFicheroOrigen , NombreFicheroOrigen)   ' SOLO si el fichero origen está en UTF-8 . el de Repsol parece que no lo está...

	Dim tr As TextReader
	'tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "ISO-8859-1")
	tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "UTF-8")
	lstLineasFichero=tr.ReadList	
'	Dim line As String
'	line = tr.ReadLine
'	Do While line <> Null
'		'Log(line)
'		line = tr.ReadLine
'		lstLineasFichero.Add(line)
'	Loop
'	tr.Close
	
'	Dim lstDatosLineasPedido As List
'	lstDatosLineasPedido.Initialize
	
'	Dim lstCSV As List
'	lstCSV.Initialize
	
'	Dim lstEmpleadosConError As List
'	lstEmpleadosConError.Initialize

	
	Dim DNIEmpleadoSel As String
	
'	Dim mDataEstacionServicio As Map
'	mDataEstacionServicio.Initialize
'	Dim lstLineasPedidoEstacion As List
'	lstLineasPedidoEstacion.Initialize
'	Dim mDataEmpleado As Map
'	mDataEmpleado.Initialize
'	Dim lstLineasPedidoEmpleado As List
'	lstLineasPedidoEmpleado.Initialize
	
'	Dim lstLineasError As List
'	lstLineasError.Initialize
	
'	Dim csvHeader(20) As String
'	csvHeader(0)="Linea"
'	'csvHeader(1)="TipoLinea"
'	csvHeader(1)="IDSedeEmpresa"
'	csvHeader(2)="NumeroPedido"
'	csvHeader(3)="FechaSolicitud"
'	csvHeader(4)="NombreEstacion"
'	csvHeader(5)="Calle"
'	csvHeader(6)="CodigoPostal"
'	csvHeader(7)="Poblacion"
'	csvHeader(8)="CodigoProvincia"
'	csvHeader(9)="Telefono"
'	csvHeader(10)="TipoEstacion"
'	csvHeader(11)="Marca"
'	csvHeader(12)="DNI"
'	csvHeader(13)="NombreEmpleado"
'	csvHeader(14)="Cargo"
'	csvHeader(15)="Sexo"
'	csvHeader(16)="Embarazo"
'	csvHeader(17)="CodigoPrenda"
'	csvHeader(18)="Talla"
'	csvHeader(19)="Cantidad"
''	csvHeader(20)="DNIOk"
''	csvHeader(21)="LineaOK"
''	csvHeader(22)="Error"
	
	Dim idxFila As Int=1
	
'	Dim CabeceraPedido As String=lstLineasFichero.Get(0)
'	Dim ElementosCabecera(2) As String=Regex.Split("PEDVESTUARIO",CabeceraPedido)
'	Dim CorrelativoPedido As String=CabeceraPedido.SubString2(0,6)
'	Dim FechaPedido As String=NombreFichero.Replace("PEDVESTUARIO","").Replace(".TXT","")

	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd-MM-yyyy"

	For Each sLinea As String In lstLineasFichero
		'Log(sLinea.Length)
		

		
		Dim NumCharLinea As Int=sLinea.Length
		'Dim sLineaUTF8 As String=utf2android(sLinea)
		Dim csvLine(20) As Object
		
		If NumCharLinea<6 Then
			'			Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'			LineaError.Initialize
'			LineaError.Errores=LineaError.Errores & " " & LastException
'			LineaError.TextoLinea=sLinea
'			lstLineasError.Add(LineaError)
			mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, LineaConError) values (?,?)"$, Array(idxFila,1))
			Continue
		Else
			Dim NumLinea As String=sLinea.SubString2(0,6)
		End If



		csvLine(0)=NumLinea

'		jamLoadingIndicator1.MensajeLoading=$"Procesando línea nº $2.0{NumLinea}..."$
'		Sleep(0)
		Dim TipoLinea As Int=sLinea.SubString2(6,7)
		csvLine(2)=TipoLinea
		'Dim IDSedeEmpresaSel As String
		Select Case TipoLinea
			Case 0 ' cabecera pedido

'				If sLinea.Length<>57 Then
'					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 0 inferior a 57 caracteres (${sLinea.Length}"$))
'					Continue
'				End If
				Dim LineaNumeroPedido As String=sLinea.SubString(7)  ' = nombre fichero?
				Dim ArrLineaNumeroPedido() As String=Regex.Split(".TXT",LineaNumeroPedido)
				Dim NumeroPedido As String=ArrLineaNumeroPedido(0)
				'Log($"NumeroPedido ${NumeroPedido}"$)
			Case 1 ' cabecera estacion servicio
				Dim DatosLineaPedido As TipoDatosLineaPedidoRepsol
				DatosLineaPedido.Initialize
				DatosLineaPedido.Linea=NumLinea
				'DatosLineaPedido.LineaOK=True
				'Dim ErrorLineaEstacionServicio As Boolean
				If NumCharLinea<>236 Then
					'ErrorLineaEstacionServicio=True
					'DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion=$"Longitud Linea Cabecera EESS<>236"$
					DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion=1
''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 1 distinto de 236 caracteres (${NumCharLinea}"$))
					'Continue
				End If
				
'				Dim ErrorIDSedeEmpresa As Boolean
'				If NumCharLinea<15 Then
'					DatosLineaPedido.ControlSede="ERROR"
'					ErrorLineaEstacionServicio=True
'					ErrorIDSedeEmpresa=True
'					'DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Sede longitud campo"$
'					DatosLineaPedido.ErrorCabeceraEstacion=$"Longitud Linea Cabecera EESS<15"$
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, 0,$"Sede errónea, longitud línea tipo dato 1 inferior a 15 caracteres (${NumCharLinea}"$))
'				Else
					Dim IDSedeEmpresa As String=sLinea.SubString2(7,15)   ' 8 posiciones   CAMPO CLAVE 1 PARA FICHERO ERRORES
					DatosLineaPedido.Sede=IDSedeEmpresa
					DatosLineaPedido.CodigoClienteERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?",Array(DatosLineaPedido.Sede)))
					DatosLineaPedido.ErrorSede=IIf(DatosLineaPedido.CodigoClienteERP="",1,0)
					DatosLineaPedido.CodigoDireccionEnvioERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?",Array(DatosLineaPedido.Sede)))
					DatosLineaPedido.ErrorSede=IIf(DatosLineaPedido.CodigoDireccionEnvioERP="",1,0)
					'If DatosLineaPedido.ErrorSede="ERROR" Then DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Sede No existe ERP"$
'				End If
				
				'Log($"IDSedeEmpresa ${IDSedeEmpresa}"$)
				'If IDSedeEmpresaSel<>IDSedeEmpresa Then
'				
'				If mDataEstacionServicio.Size>0 Then
'					Dim mDataPedidoEstacion As Map
'					mDataPedidoEstacion.Initialize
'					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
'					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
'					lstDatosLineasPedido.add(mDataPedidoEstacion)
'				End If
				
'				Dim ErrorNumeroPedidoEstacion As Boolean
'				If NumCharLinea<19 And ErrorIDSedeEmpresa=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorNumeroPedidoEstacion=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, LineaOK, Error) values (?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa,0,$"NumeroPedidoEstacion erróneo, longitud línea tipo dato 1 inferior a 19 caracteres (${NumCharLinea}"$))
'				Else
					Dim NumeroPedidoEstacion As String=sLinea.SubString2(15,19)   ' 4 posiciones   CAMPO CLAVE 2 PARA FICHERO ERRORES
					DatosLineaPedido.CodigoPedido=NumeroPedidoEstacion
'				End If
				
				'Dim ErrorFechaPedido As Boolean
'				If NumCharLinea<29 And ErrorNumeroPedidoEstacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorFechaPedido=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido,LineaOK, Error) values (?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, 0,$"FechaPedido erróneo, longitud línea tipo dato 1 inferior a 29 caracteres (${NumCharLinea}"$))
'				Else
					Dim FechaPedido As String=sLinea.SubString2(19,29)   ' 10 posiciones  DD-MM-YYYY
					Try
						Dim FechaPedidoLong As Long=DateTime.DateParse(FechaPedido)
						DatosLineaPedido.FechaPedido=FechaPedido
						DatosLineaPedido.ErrorFechaPedido=0
					Catch
						'ErrorLineaEstacionServicio=True
						'ErrorFechaPedido=True
						DatosLineaPedido.ErrorFechaPedido=1
						'DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Fecha"$
''''						mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido,LineaOK, Error) values (?,?,?,?,?,?,?)"$, _ 
''''							Array(idxFila,NumLinea,TipoLinea,IDSedeEmpresa, NumeroPedidoEstacion, 0,$"FechaPedido erróneo,formato fecha incorrecto (${FechaPedido}"$))
					End Try
					
'				End If
				
'				Dim ErrorNombreEstacion As Boolean
'				If NumCharLinea<94 And ErrorFechaPedido=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorNombreEstacion=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido,LineaOK, Error) values (?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,0,$"NombreEstacion erróneo, longitud línea tipo dato 1 inferior a 94 caracteres (${NumCharLinea}"$))
'				Else
					Dim NombreEstacion As String=sLinea.SubString2(29,94)   ' 65 posiciones
					DatosLineaPedido.NombreEstacion=NombreEstacion
'				End If
				
'				Dim ErrorCalle As Boolean
'				If NumCharLinea<159 And ErrorNombreEstacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorCalle=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,LineaOK, Error) values (?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion, 0,$"Calle errónea, longitud línea tipo dato 1 inferior a 159 caracteres (${NumCharLinea}"$))
'				Else
					Dim Calle As String=sLinea.SubString2(94,159)   ' 65 posiciones
					DatosLineaPedido.Calle=Calle
'				End If
				
'				Dim ErrorCodigoPostal As Boolean
'				If NumCharLinea<164 And ErrorCalle=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorCodigoPostal=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, 0,$"Código Postal erróneo, longitud línea tipo dato 1 inferior a 164 caracteres (${NumCharLinea}"$))
'				Else
					Dim CodigoPostal As String=sLinea.SubString2(159,164)   ' 5 posiciones
					DatosLineaPedido.CodigoPostal=CodigoPostal
'				End If
				
'				Dim ErrorPoblacion As Boolean
'				If NumCharLinea<194 And ErrorCodigoPostal=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorPoblacion=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal,0,$"Población errónea, longitud línea tipo dato 1 inferior a 194 caracteres (${NumCharLinea}"$))
'				Else
					Dim Poblacion As String=sLinea.SubString2(164,194)   ' 30 posiciones
					DatosLineaPedido.Poblacion=Poblacion
'				End If
				
'				Dim ErrorCodigoProvincia As Boolean
'				If NumCharLinea<196 And ErrorPoblacion=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorCodigoProvincia=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion,0,$"CodigoProvincia erróneo, longitud línea tipo dato 1 inferior a 196 caracteres (${NumCharLinea}"$))
'				Else
					Dim CodigoProvincia As String=sLinea.SubString2(194,196)   ' 2 posiciones
					DatosLineaPedido.CodigoProvincia=CodigoProvincia
'				End If
				
'				Dim ErrorTelefono As Boolean
'				If NumCharLinea<211 And ErrorCodigoProvincia=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorTelefono=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia,0,$"Teléfono erróneo, longitud línea tipo dato 1 inferior a 211 caracteres (${NumCharLinea}"$))
'				Else
					Dim Telefono As String=sLinea.SubString2(196,211)   ' 15 posiciones
					DatosLineaPedido.Telefono=Telefono
'				End If
				
				'Dim ErrorTipoEstacion As Boolean
'				If NumCharLinea<226 And ErrorTelefono=False Then
'					ErrorLineaEstacionServicio=True
'					ErrorTipoEstacion=True
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,0,$"TipoEstación erróneo, longitud línea tipo dato 1 inferior a 226 caracteres (${NumCharLinea}"$))
'				Else
					Dim sTipoEstacion As String=sLinea.SubString2(211,226)   ' 15 posiciones
					Dim TipoEstacion As String=sTipoEstacion

'					Select Case sTipoEstacion   ''' NO CONTROLAMOS EL TIPO DE ESTACION, ya que no influye en el mapeo
'						Case "888-CRED"
'							TipoEstacion="CampsaRed"
'						Case "999-GESPEVESA"
'							TipoEstacion="Gespevesa"
'						Case Else
'							TipoEstacion="Abanderadas"
'					End Select
					DatosLineaPedido.TipoEstacion=TipoEstacion
'				End If
				
				'Dim ErrorMarca As Boolean
'				If NumCharLinea<236 And ErrorTipoEstacion=False Then
'					DatosLineaPedido.ErrorMarca=1
'					ErrorLineaEstacionServicio=True
'					'ErrorMarca=True
'					'DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Marca"$
'''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, TipoEstacion, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
'''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,TipoEstacion,0,$"Marca errónea, longitud línea tipo dato 1 inferior a 236 caracteres (${NumCharLinea}"$))
'				Else
					
				Try
					Dim Marca As String=sLinea.SubString2(226,236).Trim.ToUpperCase   ' 10 posiciones
				Catch
					Log(LastException)
					Dim Marca As String=sLinea.SubString2(226,NumCharLinea).Trim.ToUpperCase
				End Try
					
'					Dim Marca As String=sMarca
''					Select Case sMarca
''						Case "70"
''							Marca="Campsa"
''						Case "80"
''							Marca="Repsol"
''						Case "90"
''							Marca=""
''						
''					End Select
					If Not(Marca="REPSOL" Or Marca="CAMPSA" Or Marca="PETRONOR") Then
						DatosLineaPedido.ErrorMarca=1
						'ErrorLineaEstacionServicio=True
						'ErrorMarca=True
						'DatosLineaPedido.ErrorCabeceraEstacion=$"${DatosLineaPedido.ErrorCabeceraEstacion},Error Marca"$
''''						mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, Sede, CodigoPedido, FechaPedido, NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono, TipoEstacion, Marca, LineaOK, Error) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
''''						Array(idxFila,NumLinea,TipoLinea, IDSedeEmpresa, NumeroPedidoEstacion, FechaPedido,NombreEstacion,Calle, CodigoPostal, Poblacion, CodigoProvincia, Telefono,TipoEstacion,Marca,0,$"Marca errónea, valor distinto de Repsol/Campsa/Petronor (${Marca}"$))
					Else
						DatosLineaPedido.Marca=Marca
						'DatosLineaPedido.ErrorMarca=0
					End If
'				End If
				
				'If DatosLineaPedido.ErrorCabeceraEstacion.Length>0 Then DatosLineaPedido.ErrorCabeceraEstacion=DatosLineaPedido.ErrorCabeceraEstacion.SubString(1)

'				If ErrorLineaEstacionServicio=False Then
'					'...
'					Dim mDataEstacionServicio As Map
'					mDataEstacionServicio.Initialize
'					mDataEstacionServicio.Put("IDSedeEmpresa",IDSedeEmpresa)
'					mDataEstacionServicio.Put("NumeroPedidoEstacion",NumeroPedidoEstacion)
'					mDataEstacionServicio.Put("FechaPedido",FechaPedido)
'					mDataEstacionServicio.Put("NombreEstacion",NombreEstacion.Trim)
'					mDataEstacionServicio.Put("Calle",Calle.Trim)
'					mDataEstacionServicio.Put("CodigoPostal",CodigoPostal.Trim)
'					mDataEstacionServicio.Put("Poblacion",Poblacion.Trim)
'					mDataEstacionServicio.Put("CodigoProvincia",CodigoProvincia.Trim)
'					mDataEstacionServicio.Put("Telefono",Telefono.Trim)
'					mDataEstacionServicio.Put("TipoEstacion",TipoEstacion.Trim)
'					mDataEstacionServicio.Put("Marca",Marca.Trim)
'					
'					Dim lstLineasPedidoEstacion As List
'					lstLineasPedidoEstacion.Initialize
'				End If
				
				'End If
			Case 2 ' empleado
				DatosLineaPedido.Linea=NumLinea
				'Log(sLinea.Length)
				'Dim ErrorLineaEmpleado As Boolean
				If NumCharLinea<>141 Then
					'ErrorLineaEmpleado=True
					DatosLineaPedido.ErrorLongitudLineaEmpleado=1
''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 2 distinto de 141 caracteres (${NumCharLinea}"$))
					'Continue
				End If
				
				Dim DNI As String=sLinea.SubString2(29,38)   'CAMPO CLAVE 3 PARA FICHERO ERRORES
'				If DNI="70863138T" Then
'					Log("DNI 70863138T")
'				End If
				If DNIEmpleadoSel<>DNI Then
					DNIEmpleadoSel=DNI
					'DatosLineaPedido.ErrorEmpleado=0
					DatosLineaPedido.DNI=""
					DatosLineaPedido.ErrorDNI=0
					DatosLineaPedido.NombreEmpleado=""
					DatosLineaPedido.Cargo=""
					DatosLineaPedido.ErrorCargo=0
					DatosLineaPedido.Sexo=""
					DatosLineaPedido.errorSexo=0
					DatosLineaPedido.Embarazo=""
					DatosLineaPedido.ErrorEmbarazo=0
					
					'DatosLineaPedido.ErrorLineaProducto=0
					DatosLineaPedido.CodigoPrenda=""
					DatosLineaPedido.DescripcionCodigoPrenda=""
					DatosLineaPedido.ErrorCodigoPrenda=0
					DatosLineaPedido.CodigoProductoERP=""
					DatosLineaPedido.ErrorCodigoProductoERP=0
					DatosLineaPedido.Talla=""
					DatosLineaPedido.TallaERP=""
					DatosLineaPedido.ErrorTalla=0
					DatosLineaPedido.Cantidad=0
					DatosLineaPedido.ErrorCantidad=0
					
					DatosLineaPedido.DNI=DNIEmpleadoSel
					Dim DNIEmpleadoSelOK As Boolean=checkDNI(DNIEmpleadoSel)
					If Not(DNIEmpleadoSelOK) Then DatosLineaPedido.ErrorDNI=1
						'DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error DNI no válido"$
						'DatosLineaPedido.ErrorEmpleado=1
'						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'						LineaError.Initialize
'						LineaError.NumeroLinea=NumLinea
'						LineaError.Errores="DNI NO OK"
'						LineaError.TextoLinea=sLinea
'						LineaError.IDSedeEmpresa=IDSedeEmpresa
'						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'						LineaError.DNIEmpleado=DNI
'						lstLineasError.Add(LineaError)
'						Continue  ' PASAMOS A LA LINEA SIGUIENTE
'					Else
'						DatosLineaPedido.ErrorDNI=0
						
'						If mDataEmpleado.Size>0 Then
'							Dim mDataPedidoEmpleado As Map
'							mDataPedidoEmpleado.Initialize
'							mDataPedidoEmpleado.Put("Empleado",mDataEmpleado)
'							mDataPedidoEmpleado.Put("LineasPedidoEmpleado",lstLineasPedidoEmpleado)
'							lstLineasPedidoEstacion.Add(mDataPedidoEmpleado)
'						End If
'						
'					End If

'					Try

						Dim NombreEmpleado As String=sLinea.SubString2(38,138)
						DatosLineaPedido.NombreEmpleado=NombreEmpleado
						Dim sCargo As String=sLinea.SubString2(138,139)
'						Dim Cargo As String
'						Select Case sCargo
'							Case "G"
'								Cargo="Gestor"
'							Case "E"
'								Cargo="Encargado"
'							Case "V"
'								Cargo="Vendedor"
'						End Select
						DatosLineaPedido.Cargo=sCargo
						If Not(sCargo="G" Or sCargo="E" Or sCargo="V") Then
							 DatosLineaPedido.ErrorCargo=1
							'DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Cargo Empleado"$
						Else
							DatosLineaPedido.ErrorCargo=0
						End If
						'Log("NumLinea: " & NumLinea)

						Dim sSexoEmpleado As String=sLinea.SubString2(139,140)
'						Dim SexoEmpleado As String
'						Select Case sSexoEmpleado
'							Case "H"
'								SexoEmpleado="Hombre"
'							Case "M"
'								SexoEmpleado="Mujer"
'						End Select
						DatosLineaPedido.Sexo=sSexoEmpleado
						If Not(sSexoEmpleado="H" Or sSexoEmpleado="M") Then
							 DatosLineaPedido.ErrorSexo=1
							'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Sexo Empleado"$
							'DatosLineaPedido.ErrorLinea=1
						Else
							DatosLineaPedido.ErrorSexo=0
						End If
						
						Dim sEmbarazoEmpleado As String=sLinea.SubString2(140,141)

'						Dim EmbarazoEmpleado As String
'						Select Case sEmbarazoEmpleado
'							Case "S"
'								EmbarazoEmpleado="SI"
'							Case "N"
'								EmbarazoEmpleado="NO"
'						End Select
						DatosLineaPedido.Embarazo=sEmbarazoEmpleado
						If Not(sEmbarazoEmpleado="S" Or sEmbarazoEmpleado="N") Then
							 DatosLineaPedido.ErrorEmbarazo=1
							'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Embarazo Empleado"$
							'DatosLineaPedido.ErrorLinea=1
						Else
							DatosLineaPedido.ErrorEmbarazo=0
						End If
'					Catch
						'Log(LastException)
'						Dim mDataErr As Map
'						mDataErr.Initialize
'						mDataErr.Put("NumLinea",NumLinea)
'						mDataErr.Put("Texto Línea: ", sLinea)
'						lstLineasErroneas.Add(mDataErr)

'						DatosCheckLinea.Status="NO OK"
'						DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
'						lstLineasNOOK.Add(DatosCheckLinea)
						
'						Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'						LineaError.Initialize
'						LineaError.NumeroLinea=NumLinea
'						LineaError.Errores=LastException
'						LineaError.TextoLinea=sLinea
'						LineaError.IDSedeEmpresa=IDSedeEmpresa
'						LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'						LineaError.DNIEmpleado=DNIEmpleadoSel
'						lstLineasError.Add(LineaError)
'
'						Continue
'					End Try
					
'					Dim mDataEmpleado As Map
'					mDataEmpleado.Initialize
'					mDataEmpleado.Put("DNI",DNI)
'					'mDataEmpleado.Put("DNIOK",DNIOK)
'					mDataEmpleado.Put("NombreEmpleado",NombreEmpleado.Trim)
'					mDataEmpleado.Put("Cargo",sCargo)
'					mDataEmpleado.Put("SexoEmpleado",sSexoEmpleado)
'					mDataEmpleado.Put("EmbarazoEmpleado",sEmbarazoEmpleado)
'				
'					Dim lstLineasPedidoEmpleado As List
'					lstLineasPedidoEmpleado.Initialize
					
				End If
				
				'If DatosLineaPedido.ErrorEmpleado.Length>0 And DatosLineaPedido.ErrorCabeceraEstacion="" Then DatosLineaPedido.ErrorEmpleado=DatosLineaPedido.ErrorEmpleado.SubString(1)
				
			Case 3 ' prendas empleado
				DatosLineaPedido.Linea=NumLinea
'				Try
				'DatosLineaPedido.ErrorLineaProducto=0
				DatosLineaPedido.CodigoPrenda=""
				DatosLineaPedido.DescripcionCodigoPrenda=""
				DatosLineaPedido.ErrorCodigoPrenda=0
				DatosLineaPedido.CodigoProductoERP=""
				DatosLineaPedido.ErrorCodigoProductoERP=0
				DatosLineaPedido.Talla=""
				DatosLineaPedido.TallaERP=""
				DatosLineaPedido.ErrorTalla=0
				DatosLineaPedido.Cantidad=0
				DatosLineaPedido.ErrorCantidad=0
				Try
					Dim CodigoPrenda As String=sLinea.SubString2(38,40)
					
					''''''''''If CodigoPrenda="07" Or CodigoPrenda="08" Or CodigoPrenda="09" Then Continue  ' 23/11/23 por el momento, se descartan las líneas de calzado  ' 07/01/24 SI se distribuye el calzado
					
					DatosLineaPedido.CodigoPrenda=CodigoPrenda
					Dim NumMapeoCodigoPrenda As Int=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select count(*) from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?", _
						Array As String(DatosLineaPedido.CodigoPrenda)))
					DatosLineaPedido.ErrorCodigoPrenda=IIf(NumMapeoCodigoPrenda=0,1,0)
					DatosLineaPedido.DescripcionCodigoPrenda=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?", _
						Array As String(DatosLineaPedido.CodigoPrenda)))
				Catch
					Log(LastException)
					DatosLineaPedido.ErrorCodigoPrenda=1
				End Try

					'If DatosLineaPedido.ErrorCodigoPrenda=1 Then DatosLineaPedido.ErrorLineaProducto=$"${DatosLineaPedido.ErrorLineaProducto},Error Código Prenda"$
					'If DatosLineaPedido.ErrorCodigoPrenda=1 Then DatosLineaPedido.ErrorLineaProducto=1
					'If DatosLineaPedido.ErrorCodigoPrenda="ERROR" And DatosLineaPedido.ErrorEmpleado.Contains("Error Código Prenda")=False Then DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error Código Prenda"$
					'If DatosLineaPedido.ErrorCodigoPrenda=0 Then'
					
					
'					If CodigoPrenda="10" Then
'						DatosLineaPedido.CodigoProductoERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Embarazo=? and CodigoPrenda=?", _
'							Array(DatosLineaPedido.Marca, DatosLineaPedido.Embarazo, DatosLineaPedido.CodigoPrenda)))
'					Else
						DatosLineaPedido.CodigoProductoERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Cargo=? and Sexo=? and CodigoPrenda=?", _
							Array(DatosLineaPedido.Marca, DatosLineaPedido.Cargo, DatosLineaPedido.Sexo, DatosLineaPedido.CodigoPrenda)))
'					End If

					DatosLineaPedido.ErrorCodigoProductoERP=IIf(DatosLineaPedido.CodigoProductoERP="",1,0)
					'If DatosLineaPedido.ErrorCodigoProductoERP=1 Then DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorLineaProducto},Error mapeo producto"$
					'If DatosLineaPedido.ErrorCodigoProductoERP=1 Then DatosLineaPedido.ErrorLinea=1
					'If DatosLineaPedido.ErrorCodigoProductoERP="ERROR" And DatosLineaPedido.ErrorEmpleado.Contains("Error mapeo producto")=False Then DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error mapeo producto"$
					'If DatosLineaPedido.ErrorCodigoProductoERP=0 Then'
					Dim Talla As String=sLinea.SubString2(40,44).trim
					DatosLineaPedido.Talla=Talla
					DatosLineaPedido.TallaERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Talla from tblRepsolTallasArticulosEESS where Articulo=? and Talla=?", _
								Array As String(DatosLineaPedido.CodigoProductoERP, DatosLineaPedido.Talla)))
					'DatosLineaPedido.ErrorTalla=IIf(DatosLineaPedido.TallaERP="",1,0)
					DatosLineaPedido.ErrorTalla=IIf(DatosLineaPedido.TallaERP=DatosLineaPedido.Talla,0,1)
					'If DatosLineaPedido.ErrorTalla=1 Then DatosLineaPedido.ErrorLinea=1
						'End If
					'End If
					
					Try
						Dim Cantidad As Int=sLinea.SubString2(44,45)
						DatosLineaPedido.Cantidad=Cantidad
					Catch
						Log(LastException)
						DatosLineaPedido.ErrorCantidad=1
					End Try
					
					
'				Catch
					'Log(LastException)
'					Dim mDataErr As Map
'					mDataErr.Initialize
'					mDataErr.Put("NumLinea",NumLinea)
'					mDataErr.Put("Texto Línea: ", sLinea)
'					lstLineasErroneas.Add(mDataErr)

'					DatosCheckLinea.Status="NO OK"
'					DatosCheckLinea.Errores=DatosCheckLinea.Errores & " " & LastException
'					lstLineasNOOK.Add(DatosCheckLinea)
					
'					Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'					LineaError.Initialize
'					LineaError.NumeroLinea=NumLinea
'					LineaError.Errores=LastException
'					LineaError.TextoLinea=sLinea
'					LineaError.IDSedeEmpresa=IDSedeEmpresa
'					LineaError.NumeroPedidoEstacion=NumeroPedidoEstacion
'					LineaError.DNIEmpleado=DNIEmpleadoSel
'					lstLineasError.Add(LineaError)
					
'					Continue
'				End Try
				
				'If DatosLineaPedido.ErrorLineaProducto.Length>0 And DatosLineaPedido.ErrorCabeceraEstacion="" And DatosLineaPedido.ErrorEmpleado="" Then DatosLineaPedido.ErrorLineaProducto=DatosLineaPedido.ErrorLineaProducto.SubString(1)
				
'				DatosLineaPedido.CodigoPrenda=CodigoPrenda
'				DatosLineaPedido.Talla=Talla
'				DatosLineaPedido.Cantidad=Cantidad

'				Dim mDataLineaPedidoEmpleado As Map
'				mDataLineaPedidoEmpleado.Initialize
'				mDataLineaPedidoEmpleado.Put("NumLinea",NumLinea)
'				mDataLineaPedidoEmpleado.Put("CodigoPrenda",CodigoPrenda)
'				mDataLineaPedidoEmpleado.Put("Talla",Talla)
'				mDataLineaPedidoEmpleado.Put("Cantidad",Cantidad)
'				lstLineasPedidoEmpleado.Add(mDataLineaPedidoEmpleado)
				
				'DatosLineaPedido.LineaOK=True
				
				If DatosLineaPedido.ErrorSede=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorFechaPedido=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorMarca=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorDNI=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCargo=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorSexo=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorEmbarazo=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCodigoPrenda=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCodigoProductoERP=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorTalla=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCantidad=1 Then DatosLineaPedido.LineaConError=1
				
				If DatosLineaPedido.LineaConError=1 Then
					LogColor("*********************",xui.Color_Blue)
					LogColor($"DatosLineaPedido ERROR: ${DatosLineaPedido}"$, xui.Color_Red)
					LogColor("*********************",xui.Color_Blue)
				End If
				
				
				
				'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorCabeceraEstacion}${DatosLineaPedido.ErrorEmpleado }${DatosLineaPedido.ErrorLineaProducto}"$ ' substring para quitar la primera coma de separador de errores
				'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorCabeceraEstacion}${DatosLineaPedido.ErrorEmpleado }"$ ' substring para quitar la primera coma de separador de errores
				
				
				
				mSQL.AddNonQueryToBatch($"
	insert into tblRepsolLineasFicheroPedido
	(Linea, ErrorLongitudLineaCabeceraEstacion, Sede , ErrorSede , CodigoClienteERP , CodigoDireccionEnvioERP 
	, CodigoPedido , FechaPedido ,ErrorFechaPedido, NombreEstacion ,Calle , CodigoPostal 
	, Poblacion , CodigoProvincia , Telefono 
	, TipoEstacion , Marca , ErrorMarca 
	, DNI , ErrorDNI , NombreEmpleado , Cargo , ErrorCargo 
	, Sexo , ErrorSexo ,  Embarazo , ErrorEmbarazo 
	,CodigoPrenda , ErrorCodigoPrenda , CodigoProductoERP, ErrorCodigoProductoERP, Talla, TallaERP , ErrorTalla , Cantidad, ErrorCantidad
	, LineaConError) 
	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
	Array(DatosLineaPedido.Linea, DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion, DatosLineaPedido.Sede, DatosLineaPedido.ErrorSede, DatosLineaPedido.CodigoClienteERP, DatosLineaPedido.CodigoDireccionEnvioERP, _
	DatosLineaPedido.CodigoPedido, DatosLineaPedido.FechaPedido, DatosLineaPedido.ErrorFechaPedido, DatosLineaPedido.NombreEstacion, DatosLineaPedido.Calle, DatosLineaPedido.CodigoPostal, _
	DatosLineaPedido.Poblacion, DatosLineaPedido.CodigoProvincia,DatosLineaPedido.Telefono, _
	DatosLineaPedido.TipoEstacion, DatosLineaPedido.Marca, DatosLineaPedido.ErrorMarca, _
	DatosLineaPedido.DNI, DatosLineaPedido.ErrorDNI, DatosLineaPedido.NombreEmpleado, DatosLineaPedido.Cargo, DatosLineaPedido.ErrorCargo, _
	DatosLineaPedido.Sexo, DatosLineaPedido.ErrorSexo, DatosLineaPedido.Embarazo, DatosLineaPedido.ErrorEmbarazo, _
	DatosLineaPedido.CodigoPrenda, DatosLineaPedido.ErrorCodigoPrenda, DatosLineaPedido.CodigoProductoERP, DatosLineaPedido.ErrorCodigoProductoERP, _
	DatosLineaPedido.Talla, DatosLineaPedido.TallaERP, DatosLineaPedido.ErrorTalla, _
	DatosLineaPedido.Cantidad, DatosLineaPedido.ErrorCantidad, _
	DatosLineaPedido.LineaConError))

	DatosLineaPedido.LineaConError=0  ' reseteamos la variable LineaConError
				
			Case 9  ' fin fichero
				
				' añadir los datos del último pedido
'				If mDataEstacionServicio.Size>0 Then
'					Dim mDataPedidoEstacion As Map
'					mDataPedidoEstacion.Initialize
'					mDataPedidoEstacion.put("EstacionServicio",mDataEstacionServicio)
'					mDataPedidoEstacion.Put("LineasPedidoEstacion",lstLineasPedidoEstacion)
'					lstDatosLineasPedido.add(mDataPedidoEstacion)
'				End If
				
				Exit ' Salir del loop (ésta debería ser la última línea) En el fichero de ejemplo, se ha añadido 1 línea en blanco, que da error
			Case Else
				' error en TipoLinea, no reconocido

'				Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'				LineaError.Initialize
'				LineaError.NumeroLinea=NumLinea
'				LineaError.Errores=$"Tipo de línea ${TipoLinea} no reconocido."$
'				LineaError.TextoLinea=sLinea
'				LineaError.IDSedeEmpresa=""
'				LineaError.NumeroPedidoEstacion=""
'				LineaError.DNIEmpleado=""
'				lstLineasError.Add(LineaError)
		End Select
	
		
		
	Next
	
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	' Registro Errores en tabla
	
	
'	Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery($"select distinct Sede, CodigoPedido, DNI
'	 from tblRepsolLineasFicheroPedido
'	 where 
'	 ErrorLongitudLineaCabeceraEstacion+ErrorSede+ErrorFechaPedido+ErrorMarca
'	 +ErrorLongitudLineaEmpleado+ErrorDNI+ErrorCargo+ErrorSexo+ErrorEmbarazo 
'	 +ErrorLongitudLineaProducto+ErrorCodigoPrenda+ErrorCodigoProductoERP+ErrorTalla
'	 >0"$)

	Dim NumLineasConError As Int=mSQL.ExecQuerySingleResult2($"select count(*) from tblRepsolLineasFicheroPedido where LineaConError=?"$, Array As String(1))
	Dim CSVErroresSubidoOKFTP As Boolean
	
	If NumLineasConError>0 Then
	 
		Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery($"select distinct Sede, CodigoPedido, DNI from tblRepsolLineasFicheroPedido where LineaConError=1"$)
		Do While rsSedePedidoDNI.NextRow
			Dim Sede As String=rsSedePedidoDNI.GetString("Sede")
			Dim PedidoSede As String=rsSedePedidoDNI.GetString("CodigoPedido")
			Dim DNI As String=rsSedePedidoDNI.GetString("DNI")
		
			mSQL.ExecNonQuery2("update tblRepsolLineasFicheroPedido set SedePedidoDNIConError=? where Sede=? and CodigoPedido=? and DNI=?", _
				Array As Object(1, Sede, PedidoSede, DNI))
		
			mSQL.ExecNonQuery2("insert into tblRepsolErroresSedePedidoDNIFicheroPedido (Sede, PedidoSede, DNI, Errores) values (?,?,?,?)", _
			Array($"${Sede}"$,$"${PedidoSede}"$, $"${DNI}"$, ""))
			
			Dim ErrorLongitudLineaCabeceraEstacion As Boolean
			Dim ErrorSede As Boolean
			Dim ErrorFechaPedido As Boolean
			Dim ErrorMarca As Boolean
			Dim ErrorLongitudLineaEmpleado As Boolean
			Dim ErrorDNI As Boolean
			Dim ErrorCargo As Boolean
			Dim ErrorSexo As Boolean
			Dim ErrorEmbarazo As Boolean
			Dim ErrorLongitudLineaProducto As Boolean
			Dim ErrorCodigoPrenda As Boolean
			Dim ErrorCodigoProductoERP As Boolean
			Dim ErrorTalla As Boolean
			Dim ErrorCantidad As Boolean
		
'		$"Select distinct Sede, CodigoPedido, DNI
'	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca
'	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo
'	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla
'	 from tblRepsolLineasFicheroPedido
'	 where
'	 Sede=? And CodigoPedido=? And DNI=?
'	 And
'	 ErrorLongitudLineaCabeceraEstacion<>'' or ErrorSede<>'' or ErrorFechaPedido<>'' or ErrorMarca<>'' 
'	 Or ErrorLongitudLineaEmpleado<>'' or ErrorDNI<>'' or ErrorCargo<>'' or ErrorSexo<>'' or ErrorEmbarazo<>'' 
'	 Or ErrorLongitudLineaProducto<>'' or ErrorCodigoProductoERP<>'' or ErrorCodigoPrenda<>'' or ErrorTalla<>''"$

			Dim rsLineasSedePedidoDNI As ResultSet= mSQL.ExecQuery2($"Select distinct Sede, CodigoPedido, DNI
	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca
	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo
	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla, ErrorCantidad
	 from tblRepsolLineasFicheroPedido
	 where
	 Sede=? And CodigoPedido=? And DNI=?"$, _
	 	Array(Sede, PedidoSede,DNI))
		
			Do While rsLineasSedePedidoDNI.NextRow
				If rsLineasSedePedidoDNI.GetInt("ErrorLongitudLineaCabeceraEstacion")=1 Then ErrorLongitudLineaCabeceraEstacion=True
				If rsLineasSedePedidoDNI.GetInt("ErrorSede")=1 Then ErrorSede=True
				If rsLineasSedePedidoDNI.GetInt("ErrorFechaPedido")=1 Then ErrorFechaPedido=True
				If rsLineasSedePedidoDNI.GetInt("ErrorMarca")=1 Then ErrorMarca=True
				If rsLineasSedePedidoDNI.GetInt("ErrorLongitudLineaEmpleado")=1 Then ErrorLongitudLineaEmpleado=True
				If rsLineasSedePedidoDNI.GetInt("ErrorDNI")=1 Then ErrorDNI=True
				If rsLineasSedePedidoDNI.GetInt("ErrorCargo")=1 Then ErrorCargo=True
				If rsLineasSedePedidoDNI.GetInt("ErrorSexo")=1 Then ErrorSexo=True
				If rsLineasSedePedidoDNI.GetInt("ErrorEmbarazo")=1 Then ErrorEmbarazo=True
				If rsLineasSedePedidoDNI.GetInt("ErrorLongitudLineaProducto")=1 Then ErrorLongitudLineaProducto=True
				If rsLineasSedePedidoDNI.GetInt("ErrorCodigoPrenda")=1 Then ErrorCodigoPrenda=True
				If ErrorMarca Or ErrorCargo Or ErrorSexo Or ErrorEmbarazo Or ErrorCodigoPrenda Then Continue ' los dos siguientes errores vienen del mapeo
				If rsLineasSedePedidoDNI.GetInt("ErrorCodigoProductoERP")=1 Then ErrorCodigoProductoERP=True
				If rsLineasSedePedidoDNI.GetInt("ErrorTalla")=1 Then ErrorTalla=True
				If rsLineasSedePedidoDNI.GetInt("ErrorCantidad")=1 Then ErrorCantidad=True
			Loop
			rsLineasSedePedidoDNI.close
		
			Dim sbTextoError As StringBuilder
			sbTextoError.Initialize
		
			If ErrorLongitudLineaCabeceraEstacion Then sbTextoError.Append(", ErrorLongitudLineaCabeceraEstacion")
			If ErrorSede Then sbTextoError.Append(", Sede no existe ERP Proin")
			If ErrorFechaPedido Then sbTextoError.Append(", Error Fecha")
			If ErrorMarca Then sbTextoError.Append(", Error Marca")
			If ErrorLongitudLineaEmpleado Then sbTextoError.Append(", ErrorLongitudLineaEmpleado")
			If ErrorDNI Then sbTextoError.Append(", DNI no válido")
			If ErrorCargo Then sbTextoError.Append(", Error Cargo")
			If ErrorSexo Then sbTextoError.Append(", Error Sexo")
			If ErrorEmbarazo Then sbTextoError.Append(", Error Embarazo")
			If ErrorLongitudLineaProducto Then sbTextoError.Append(", ErrorLongitudLineaProducto")
			If ErrorCodigoPrenda Then sbTextoError.Append(", Error Código Prenda")
			If ErrorCodigoProductoERP Then sbTextoError.Append(", ErrorCodigoProductoERP")
			If ErrorTalla Then sbTextoError.Append(", ErrorTalla")
			If ErrorCantidad Then sbTextoError.Append(", ErrorCantidad")

			If sbTextoError.Length>2 Then
				mSQL.ExecNonQuery2("update tblRepsolErroresSedePedidoDNIFicheroPedido set Errores=? where Sede=? and PedidoSede=? and DNI=?", _
					Array As Object($"${sbTextoError.ToString.SubString(2)}"$, Sede, PedidoSede, DNI))
			End If
	
		Loop
		rsSedePedidoDNI.close
	
		DateTime.DateFormat=DateFormatAnt
	
		jamLoadingIndicator1.MensajeLoading="Generando Fichero CSV ERRORES..."
		Dim lstErrores As List=DBUtils.ExecuteMemoryTable(mSQL,$"select * from tblRepsolErroresSedePedidoDNIFicheroPedido"$,Null,0)
		Dim lstEncabezadosErrores As List
		lstEncabezadosErrores.Initialize
		lstEncabezadosErrores.add("Sede")
		lstEncabezadosErrores.add("PedidoSede")
		lstEncabezadosErrores.add("DNI")
		lstEncabezadosErrores.add("ERROR")
		'=Array($"Sede"$,$"PedidoSede"$,$"DNI"$,$"ERROR"$)
'	Dim su As StringUtils
'	su.SaveCSV2(CarpetaDestinoFicherosPedidosRepsol,$"Errores${NumeroPedido}.csv"$,",",lstErrores,lstEncabezadosErrores)
	
'	Dim lstErrLines As List
'	lstErrLines.Initialize
	
'	Dim rsErr As ResultSet=mSQL.ExecQuery("select * from tblRepsolErroresSedePedidoDNIFicheroPedido")
'	Do While rsLineasSedePedidoDNI.NextRow
'		Dim Sede As String=rsLineasSedePedidoDNI.GetString("Sede")
'		Dim PedidoSede As String=rsLineasSedePedidoDNI.GetString("PedidoSede")
'		Dim DNI As String=rsLineasSedePedidoDNI.GetString("DNI")
'		Dim Errores As String=rsLineasSedePedidoDNI.GetString("Errores")
'		Dim mDataErrLin As Map
'		mDataErrLin.Put("Sede","""" & Sede & """")
'		mDataErrLin.Put("PedidoSede","""" & PedidoSede & """")
'		mDataErrLin.Put("Sede","""" & DNI & """")
'		mDataErrLin.Put("Errores","""" & Errores & """")
'		
'		lstErrores.Add(mDataErrLin)
'		
'	Loop
'	rsErr.close
	
'	Dim parser As CSVParser
'	parser.Initialize

		'Dim s As String = parser.GenerateString(lstErrores, ",")
	
		Dim sFicheroErrores As String=GenerarCSVSeparadorComasQuotes(lstErrores,",",lstEncabezadosErrores)
		Dim NombreFicheroErrores As String=$"Errores_${NumeroPedido}.csv"$
		File.WriteString(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores, sFicheroErrores)
		If File.Exists(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores)=False Then
			Dim msa As Object=xui.MsgboxAsync("Fichero error aun no existe!!","Error")
			Wait For (msa) Msgbox_Result
		End If
		Log(File.Exists(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores))
	
'	Sleep(5000) ' espera para grabar csv ...
	
		' DE MOMENTO, DESACTIVAR SUBIDA DEL FICHERO DE ERRORES

		Dim RutaFTPFicheroPedidoErrores As String=ErrorFilesFoldersFtpRepsol & "/" & NombreFicheroErrores
		
		If File.Exists(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores) Then
			wait for(SubirFicheroACarpetaFTP(CarpetaDestinoFicherosPedidosErrorRepsol, NombreFicheroErrores, RutaFTPFicheroPedidoErrores)) complete (Success As Boolean)
			If Not(Success) Then
				' PENDIENTE AFINAR EL MENSAJE PARA EL USUARIO (VENTAS PROIN)
				Dim msa As Object=xui.MsgboxAsync($"Ha habido un error en la subida del fichero de errores${NombreFicheroErrores}"$,"ATENCION!")
				Wait For (msa) Msgbox_Result
				CSVErroresSubidoOKFTP=False
				jamLoadingIndicator1.close
				Return False
			Else
				Dim msa As Object=xui.MsgboxAsync($"Se ha subido el fichero de errores${NombreFicheroErrores} correspondiente al fichero de pedido seleccionado."$,"ATENCION!")
				Wait For (msa) Msgbox_Result
				CSVErroresSubidoOKFTP=True
				
				
				jamLoadingIndicator1.close
				'Return False
			End If
		End If

	End If
	
	Dim NumLineasSinError As Int=mSQL.ExecQuerySingleResult2($"select count(*) from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"$, Array As String(0))
	Dim CSVsFicherosPedidosOK As Boolean=True
	Dim NumPedidosIncluidosEnFichero As Int
	Dim NumFicherosPedidosCSVCreadosEnServidor As Int
	
	If NumLineasSinError>0 Then
		
		Dim lstHeaders As List=Array As String("Docuware ID", "Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen", _
		"FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio")
		'Dim CarpetaFicheroCSV As String=Utilidades.FindUserDocumentsFolder  ' en produccion habrá que cambiarlo a 1 carpeta del 10.6
		Dim CarpetaFicheroCSV As String="\\192.168.10.6\PendientesNAV"
		
		Dim rsCabeceraPedidosLineasSinError As ResultSet=mSQL.ExecQuery2($"select distinct CodigoClienteERP, CodigoDireccionEnvioERP, Sede, CodigoPedido, FechaPedido
			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"$, Array As String(0))
		Do While rsCabeceraPedidosLineasSinError.NextRow
			Dim UUIDPedido As String=Utilidades.GenerarUUIDv4
			Dim IDPedido As String=$"REPSOL_${UUIDPedido}"$
			Dim NombreFicheroCSV As String=$"${IDPedido}.csv"$
			Dim lstLineasPedidoVenta As List
			lstLineasPedidoVenta.Initialize
			Dim CodigoClienteNAV As String=rsCabeceraPedidosLineasSinError.GetString("CodigoClienteERP")
			Dim CodigoDireccionEnvioNAV As String=rsCabeceraPedidosLineasSinError.GetString("CodigoDireccionEnvioERP")
			Dim Sede As String=rsCabeceraPedidosLineasSinError.GetString("Sede")
			Dim CodigoPedido As String=rsCabeceraPedidosLineasSinError.GetString("CodigoPedido")
			Dim DocumentoExterno As String=Sede & CodigoPedido
			Dim FechaPedidoCliente As String=rsCabeceraPedidosLineasSinError.GetString("FechaPedido")
			Dim FechaPedidoClienteNAV As String=FechaPedidoCliente.Replace("-","/")
			
'			Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2($"select distinct CodigoProductoERP, TallaERP, Cantidad
'			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? and CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?"$, _
'			 	Array As String(0, CodigoClienteNAV,CodigoDireccionEnvioNAV,CodigoPedido,FechaPedidoCliente))
				
		Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2($"Select CodigoProductoERP, TallaERP, sum(Cantidad) as TotalCantidad
			from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? And CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?
			group by CodigoProductoERP,TallaERP"$, _
			 	Array As String(0, CodigoClienteNAV,CodigoDireccionEnvioNAV,CodigoPedido,FechaPedidoCliente))
				
			Do While rsLineasPedido.NextRow
				
				Dim Precio As Double=Utilidades.FixNullDouble(mSQL.ExecQuerySingleResult2("select PrecioUnitario from tblRepsolTarifaVentaGRP07506 where Articulo=?",Array As String(rsLineasPedido.GetString("CodigoProductoERP"))))

				Dim ArrDatosLineaPedido(12) As String
				ArrDatosLineaPedido(0)=$"${UUIDPedido}"$
				'ArrDatosLineaPedido(1)=Main.DatosUsuario.NombreADUsuarioWindows   ' OJO, CAMBIAR si se pasa a proceso automático en 10.20.
				ArrDatosLineaPedido(1)="PROIN\SUSANA.DIEZ"   ' OJO, CAMBIAR si se pasa a proceso automático en 10.20.
				ArrDatosLineaPedido(2)=CodigoClienteNAV
				ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV
				ArrDatosLineaPedido(4)=DocumentoExterno
				ArrDatosLineaPedido(5)="0299"
				ArrDatosLineaPedido(6)=FechaPedidoClienteNAV
				ArrDatosLineaPedido(7)=rsLineasPedido.GetString("CodigoProductoERP")
				ArrDatosLineaPedido(8)=""
				ArrDatosLineaPedido(9)=rsLineasPedido.GetString("TallaERP")
				ArrDatosLineaPedido(10)=rsLineasPedido.GetInt("TotalCantidad")
				ArrDatosLineaPedido(11)=Precio
					
				lstLineasPedidoVenta.Add(ArrDatosLineaPedido)
				
				
			Loop
			rsLineasPedido.Close
			
			'DateTime.DateFormat=DateFormatAnt

			If lstLineasPedidoVenta.Size>0 Then
				Dim su As StringUtils
				Try
					su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,";",lstLineasPedidoVenta, lstHeaders)
					NumFicherosPedidosCSVCreadosEnServidor=NumFicherosPedidosCSVCreadosEnServidor+1
	'		wait for(Utilidades.MsgBox2XUI("Aviso",$"Fichero CSV creado.
	'		${File.Combine(CarpetaFicheroCSV,NombreFicheroCSV)}
	'		¿Abrir fichero?"$,"Sí","","No",Null)) complete (rInt As Int)
	'		If rInt<>xui.DialogResponse_Positive Then Return
	'		Try
	'			fx.ShowExternalDocument(File.GetUri(CarpetaFicheroCSV,NombreFicheroCSV))
	'		Catch
	'			Log(LastException)
	'			wait for(Utilidades.MsgBoxXUI("Error",$"No ha sido posible abrir el fichero creado
	'		${File.Combine(CarpetaFicheroCSV,NombreFicheroCSV)}
	'		${LastException.Message}"$)) complete (rObj As Object)
	'		End Try
					'Return "OK"
				Catch
					Log(LastException)
					CSVsFicherosPedidosOK=False
	'		wait for(Utilidades.MsgBoxXUI("Error",$"No ha sido posible crear el fichero. ¿Archivo en uso?
	'		${File.Combine(CarpetaFicheroCSV,NombreFicheroCSV)}
	'		${LastException.Message}"$)) complete (rObj As Object)
					'Return "NOK"
				End Try
				NumPedidosIncluidosEnFichero=NumPedidosIncluidosEnFichero+1
			End If
			
		Loop
		rsCabeceraPedidosLineasSinError.close

	End If
	
	jamLoadingIndicator1.DetenerControlTiempoProceso
	jamLoadingIndicator1.close
	
	Dim BodyEmailInfoProceso As String=$"
		<b>Número de errores: </b> ${IIf(NumLineasConError=0,"OK, SIN ERRORES",NumLineasConError)}
		<b>CSV Errores subido a FTP REPSOL: </b> ${IIf(NumLineasConError=0,"No necesario",IIf(CSVErroresSubidoOKFTP,"SI, OK","NO, ERROR"))}
		<b>Número de Pedidos incluidos en Fichero Pedido Repsol (${NombreFicheroOrigen}) : </b> ${IIf(NumPedidosIncluidosEnFichero=0,"FICHERO SIN PEDIDOS, OK", NumPedidosIncluidosEnFichero)}
		<b>Proceso generación Ficheros CSV de pedidos de venta: </b> ${IIf(NumPedidosIncluidosEnFichero=0,"No necesario",IIf(CSVsFicherosPedidosOK,"OK","ATENCION, PROCESO CON ERRORES"))}
		<b>Número de Ficheros CSV creados en nuestro Servidor : </b> ${IIf(NumPedidosIncluidosEnFichero=0, "SIN PEDIDOS PARA GENERAR CSVs",NumFicherosPedidosCSVCreadosEnServidor)}
		"$
		
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd-MM-yyyy"
	Wait For(EnviarEmailAviso(False,$"Información Proceso Pedidos OnLine Repsol $DateTime{DateTime.Now}"$,BodyEmailInfoProceso)) complete (sResp As String)

	DateTime.DateFormat=DateFormatAnt
	
	
'	Return False
	
'	Log(lstDatosLineas)
	
'	Dim JSONGenerator As JSONGenerator
'	JSONGenerator.Initialize2(lstJSON)
'	Dim sJSON As String=JSONGenerator.ToPrettyString(2)
'	File.WriteString(xui.DefaultFolder, NombreFichero.Replace(".TXT",".JSON"), sJSON)
'	
'	
'	wait For(Utilidades.JSONtoCSV(sJSON,True,";")) complete (sResp As String)
'	If sResp<>"" Then
'		Dim sCSV As String=sResp
'		File.WriteString(DirFichero,NombreFichero.Replace(".TXT",".CSV"),sCSV)
'	End If
'	

''''''''''''''''''	Sleep(0)
''''''''''''''''''	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas OK..."
''''''''''''''''''
''''''''''''''''''	' EXCEL LINEAS OK
''''''''''''''''''	Dim DateFormatAnt As String=DateTime.DateFormat
''''''''''''''''''	DateTime.DateFormat="dd-MM-yy"
''''''''''''''''''	Dim xl As XLUtils
''''''''''''''''''	xl.Initialize
''''''''''''''''''	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
''''''''''''''''''	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos Pedido")
''''''''''''''''''	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
''''''''''''''''''	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
''''''''''''''''''	'Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
''''''''''''''''''	
''''''''''''''''''	
''''''''''''''''''	Dim NumCols As Int=csvHeader.Length
''''''''''''''''''	
''''''''''''''''''	For idxCol=0 To NumCols-1
''''''''''''''''''		sheet1.PutString(xl.AddressZero(idxCol,0), csvHeader(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
''''''''''''''''''	Next
''''''''''''''''''	idxFila=1
''''''''''''''''''	For Each mLineaPedido As Map In lstDatosLineasPedido
''''''''''''''''''		'Log($"mLineaPedido ${mLineaPedido}"$)
''''''''''''''''''		Dim mDatosLineaPedidoExcel As Map
''''''''''''''''''		mDatosLineaPedidoExcel.Initialize
''''''''''''''''''		Dim mDatosEstacionServicio As Map=mLineaPedido.Get("EstacionServicio")
''''''''''''''''''		Dim IDSedeEmpresa As String=mDatosEstacionServicio.Get("IDSedeEmpresa")
''''''''''''''''''		Dim NumeroPedidoEstacion As String=mDatosEstacionServicio.Get("NumeroPedidoEstacion")
''''''''''''''''''		Dim sFechaSolicitud As String=mDatosEstacionServicio.Get("FechaSolicitud")
''''''''''''''''''		Dim FechaSolicitudLong As Long=DateTime.DateParse(sFechaSolicitud)
''''''''''''''''''		Dim NombreEstacion As String=mDatosEstacionServicio.Get("NombreEstacion")
''''''''''''''''''		Dim Calle As String=mDatosEstacionServicio.Get("Calle")
''''''''''''''''''		Dim CodigoPostal As String=mDatosEstacionServicio.Get("CodigoPostal")
''''''''''''''''''		Dim Poblacion As String=mDatosEstacionServicio.Get("Poblacion")
''''''''''''''''''		Dim CodigoProvincia As String=mDatosEstacionServicio.Get("CodigoProvincia")
''''''''''''''''''		Dim Telefono As String=mDatosEstacionServicio.Get("Telefono")
''''''''''''''''''		Dim TipoEstacion As String=mDatosEstacionServicio.Get("TipoEstacion")
''''''''''''''''''		Dim Marca As String=mDatosEstacionServicio.Get("Marca")
''''''''''''''''''		Dim lstDatosLineasPedidoEstacion As List=mLineaPedido.Get("LineasPedidoEstacion")
''''''''''''''''''		For Each mLineaPedidoEstacion As Map In lstDatosLineasPedidoEstacion
''''''''''''''''''			'Log($"mLineaPedidoEstacion ${mLineaPedidoEstacion}"$)
''''''''''''''''''			Dim mDatosEmpleado As Map=mLineaPedidoEstacion.Get("Empleado")
''''''''''''''''''			'Log($"mDatosEmpleado ${mDatosEmpleado}"$)
''''''''''''''''''			Dim DNI As String=mDatosEmpleado.Get("DNI")
''''''''''''''''''			Dim DNIOK As Boolean=mDatosEmpleado.Get("DNIOK")
''''''''''''''''''			Dim NombreEmpleado As String=mDatosEmpleado.Get("NombreEmpleado")
''''''''''''''''''			Dim Cargo As String=mDatosEmpleado.Get("Cargo")
''''''''''''''''''			Dim SexoEmpleado As String=mDatosEmpleado.Get("SexoEmpleado")
''''''''''''''''''			Dim EmbarazoEmpleado As String=mDatosEmpleado.Get("EmbarazoEmpleado")
''''''''''''''''''			Dim lstLineasPedidoEmpleado As List=mLineaPedidoEstacion.Get("LineasPedidoEmpleado")
''''''''''''''''''			For Each mLineaPedidoEmpleado As Map In lstLineasPedidoEmpleado
''''''''''''''''''				'Log($"mLineaPedidoEmpleado ${mLineaPedidoEmpleado}"$)
''''''''''''''''''				Dim NumLinea As String=mLineaPedidoEmpleado.Get("NumLinea")
''''''''''''''''''				Dim CodigoPrenda As String=mLineaPedidoEmpleado.Get("CodigoPrenda")
''''''''''''''''''				Dim Talla As String=mLineaPedidoEmpleado.Get("Talla")
''''''''''''''''''				Dim Cantidad As Int=mLineaPedidoEmpleado.Get("Cantidad")
''''''''''''''''''				sheet1.PutString(xl.AddressZero(0,idxFila),NumLinea)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(1,idxFila),IDSedeEmpresa)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(2,idxFila),NumeroPedidoEstacion)
''''''''''''''''''				sheet1.PutDate(xl.AddressZero(3,idxFila),FechaSolicitudLong)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(4,idxFila),NombreEstacion)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(5,idxFila),Calle)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(6,idxFila),CodigoPostal)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(7,idxFila),Poblacion)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(8,idxFila),CodigoProvincia)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(9,idxFila),Telefono)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(10,idxFila),TipoEstacion)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(11,idxFila),Marca)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(12,idxFila),DNI)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(13,idxFila),NombreEmpleado)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(14,idxFila),Cargo)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(15,idxFila),SexoEmpleado)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(16,idxFila),EmbarazoEmpleado)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(17,idxFila),CodigoPrenda)
''''''''''''''''''				sheet1.PutString(xl.AddressZero(18,idxFila),Talla)
''''''''''''''''''				sheet1.PutNumber(xl.AddressZero(19,idxFila),Cantidad)
''''''''''''''''''				'sheet1.PutString(xl.AddressZero(20,idxFila),IIf(DNIOK,"OK","NOK"))
''''''''''''''''''
''''''''''''''''''				#if debug
''''''''''''''''''				Log($"idxFila ${idxFila}"$)
''''''''''''''''''				#End If
''''''''''''''''''				idxFila=idxFila+1
''''''''''''''''''			Next
''''''''''''''''''		Next
''''''''''''''''''	Next
''''''''''''''''''	
''''''''''''''''''	Dim UltimaFila As Int=idxFila
''''''''''''''''''	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
''''''''''''''''''	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
''''''''''''''''''	
''''''''''''''''''	Sleep(0)
''''''''''''''''''	jamLoadingIndicator1.MensajeLoading="Grabando Excel líneas OK..."
''''''''''''''''''	
''''''''''''''''''	Dim f As String = Workbook.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & ".xlsx", True)
''''''''''''''''''	DateTime.DateFormat=DateFormatAnt
''''''''''''''''''	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
''''''''''''''''''	If Success=False Then
''''''''''''''''''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel líneas ok " & f,"Error")
''''''''''''''''''		Wait For (msa) Msgbox_Result
''''''''''''''''''		'Return
''''''''''''''''''	End If
''''''''''''''''''	
''''''''''''''''''	
''''''''''''''''''	
''''''''''''''''''	Sleep(0)
''''''''''''''''''	jamLoadingIndicator1.MensajeLoading="Generando Excel líneas NO OK..."
''''''''''''''''''	
''''''''''''''''''	' EXCEL LINEAS NO OK
''''''''''''''''''	
''''''''''''''''''	Dim csvHeaderLineasNooK(6) As String
''''''''''''''''''	csvHeaderLineasNooK(0)="NumeroLinea"
''''''''''''''''''	csvHeaderLineasNooK(1)="IDSedeEmpresa"
''''''''''''''''''	csvHeaderLineasNooK(2)="NumeroPedidoEstacion"
''''''''''''''''''	csvHeaderLineasNooK(3)="DNI"
''''''''''''''''''	csvHeaderLineasNooK(4)="Errores"
''''''''''''''''''	csvHeaderLineasNooK(5)="TextoLinea"
''''''''''''''''''	
''''''''''''''''''	Dim DateFormatAnt As String=DateTime.DateFormat
''''''''''''''''''	DateTime.DateFormat="dd-MM-yy"
''''''''''''''''''	Dim xl As XLUtils
''''''''''''''''''	xl.Initialize
''''''''''''''''''	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
''''''''''''''''''	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Datos Lineas NO OK")
''''''''''''''''''	Dim HeaderStyle As XLStyle=Workbook.CreateStyle.FontColor(12,xl.COLOR_WHITE).ForegroundColor(xl.COLOR_DARK_TEAL)
''''''''''''''''''	Dim FechasStyle As XLStyle = Workbook.CreateStyle.DataFormat($"dd"/"mm"/"yyyy"$)
''''''''''''''''''	'Dim RowStyles As List = Array(Workbook.CreateStyle.ForegroundColor(xl.COLOR_ORANGE), Workbook.CreateStyle.ForegroundColor(xl.COLOR_WHITE))
''''''''''''''''''	
''''''''''''''''''	Dim NumCols As Int=csvHeaderLineasNooK.Length
''''''''''''''''''	
''''''''''''''''''	For idxCol=0 To NumCols-1
''''''''''''''''''		sheet1.PutString(xl.AddressZero(idxCol,0), csvHeaderLineasNooK(idxCol)).SetStyle(sheet1.LastAccessed, HeaderStyle)
''''''''''''''''''	Next
''''''''''''''''''	idxFila=1
''''''''''''''''''	For Each LineasErrorPedido As TipoDatosLineaErrorPedidoRepsol In lstLineasError
''''''''''''''''''		sheet1.PutString(xl.AddressZero(0,idxFila),LineasErrorPedido.NumeroLinea)
''''''''''''''''''		sheet1.PutString(xl.AddressZero(1,idxFila),LineasErrorPedido.IDSedeEmpresa)
''''''''''''''''''		sheet1.PutString(xl.AddressZero(2,idxFila),LineasErrorPedido.NumeroPedidoEstacion)
''''''''''''''''''		sheet1.PutString(xl.AddressZero(3,idxFila),LineasErrorPedido.DNIEmpleado)
''''''''''''''''''		sheet1.PutString(xl.AddressZero(4,idxFila),LineasErrorPedido.Errores)
''''''''''''''''''		sheet1.PutString(xl.AddressZero(5,idxFila),LineasErrorPedido.TextoLinea)
''''''''''''''''''
''''''''''''''''''		idxFila=idxFila+1
''''''''''''''''''	Next
''''''''''''''''''	
''''''''''''''''''	Dim UltimaFila As Int=idxFila
''''''''''''''''''	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZero(0,0), xl.AddressZero(NumCols-1,UltimaFila)))
''''''''''''''''''	'Dim f As String = Workbook.SaveAs(File.GetFileParent(fileName),File.GetName(fileName) & ".xlsx", True)
''''''''''''''''''	
''''''''''''''''''	Sleep(0)
''''''''''''''''''	jamLoadingIndicator1.MensajeLoading="Grabando Excel líneas NO OK..."
''''''''''''''''''	
''''''''''''''''''	Dim f As String = Workbook.SaveAs(CarpetaDestinoFichero,NombreFicheroDestino & "-errores.xlsx", True)
''''''''''''''''''	DateTime.DateFormat=DateFormatAnt
''''''''''''''''''	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
''''''''''''''''''	If Success=False Then
''''''''''''''''''		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el fichero excel " & f,"Error")
''''''''''''''''''		Wait For (msa) Msgbox_Result
''''''''''''''''''		'Return
''''''''''''''''''	End If
	

	

	
	'jamLoadingIndicator1.close
	
	Return True
End Sub

Public Sub GenerateString (Table As List, SeparatorChar As String) As String
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

Public Sub GenerarCSVSeparadorComasQuotes (lstTabla As List, SeparatorChar As String, lstEncabezados As List) As String
	Dim eol As String = Chr(10)
	If lstTabla.Size = 0 Then Return ""
	Dim sb As StringBuilder
	sb.Initialize
	
	For Each sH As String In lstEncabezados
		Dim Wrap As Boolean
		Dim word As String=sH
		If word.Contains(SeparatorChar) Then Wrap = True
		If word.Contains(QUOTE) Then
			Wrap = True
			word = word.Replace(QUOTE, $""""$)
		End If
		If Wrap Then
			sb.Append(QUOTE).Append(word).Append(QUOTE)
		Else
			'sb.Append(word)
			sb.Append(QUOTE).Append(word).Append(QUOTE)  ' para forzar los QUOTES
		End If
		sb.Append(SeparatorChar)
	Next
	sb.Remove(sb.Length - 1, sb.Length)
	sb.Append(eol)
	
	For Each row() As String In lstTabla
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
				'sb.Append(word)
				sb.Append(QUOTE).Append(word).Append(QUOTE)  ' para forzar los QUOTES
			End If
			sb.Append(SeparatorChar)
		Next
		sb.Remove(sb.Length - 1, sb.Length)
		sb.Append(eol)
	Next
	sb.Remove(sb.Length - eol.Length, sb.Length)
	Return sb.ToString
End Sub




Private Sub btnCheckFTPInbox_Click
	

'	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		SalirModulo
'		Return
'	End If
'	Dim mDataConn As Map=mRes.Get("mDataConn")
'	'Log(mData0)
'	
'	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
'	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
'	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
'	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
'	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")
	
	'sFtpRepsol.List(FilesFoldersFtpRepsol)
	'Wait For sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)
	
	
	jamLoadingIndicator1.MensajeLoading="Buscando Fichero Pedido en carpeta errores FTP..."
	jamLoadingIndicator1.Show

	sFtpRepsol.List(ErrorFilesFoldersFtpRepsol)
	Wait For sFtpRepsol_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)
	jamLoadingIndicator1.close
	If Success = False Then
		Log(LastException.Message)
		Dim msa As Object=xui.MsgboxAsync("Error listando carpeta de errores FTP." & CRLF & CRLF & LastException.Message ,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	If Files.Length=0 Then
		' sin ficheros
		Dim msa As Object=xui.MsgboxAsync("Carpeta errores FTP sin ficheros","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If

	For i = 0 To Folders.Length - 1
		Log(Folders(i).Name)
		Log(DateTime.Date(Folders(i).Timestamp))
	Next
End Sub


Private Sub btnUploadFile_Click
	
	
'	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		'SalirModulo
'		Return
'	End If
'	Dim mDataConn As Map=mRes.Get("mDataConn")
'	'Log(mData0)
'	
'	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
'	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
'	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
'	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
'	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")
	
	Dim fc As FileChooser
	fc.Initialize
	fc.Title="Selecciona Fichero"
	fc.SetExtensionFilter("Ficheros texto", Array As String("*.csv"))
	'fc.InitialFileName=""
	'fc.InitialDirectory=Main.UserFolder
	fc.InitialDirectory=CarpetaDestinoFicherosDescargadosFTPPedidosRepsol
	Dim fileName As String = fc.ShowOpen(frm)
	
	If fileName="" Then Return
	
	
	
	Dim RutaFTPFicheroPedidoErrores As String=ErrorFilesFoldersFtpRepsol & "/" &  File.GetName(fileName)


	sFtpRepsol.UploadFile(File.GetFileParent(fileName), File.GetName(fileName) , RutaFTPFicheroPedidoErrores)
	Wait For sFtpRepsol_UploadCompleted (ServerPath As String, Success As Boolean)
	
	If Not(Success) Then
		Dim msa As Object=xui.MsgboxAsync($"Error subiendo fichero de errores de pedido ${File.GetName(fileName)}
${LastException.message}"$,"Error")
		Wait For (msa) Msgbox_Result
	Else
		Dim msa As Object=xui.MsgboxAsync($"Fichero subido a carpeta de destino ${File.GetName(fileName)}"$,"Aviso")
		Wait For (msa) Msgbox_Result
	End If
	
	'Return Success

End Sub

Sub ProcesarFichero4(CarpetaFicheroOrigen As String, NombreFicheroOrigen As String,  CarpetaDestinoFichero As String, NombreFicheroDestino As String) As ResumableSub
	
	jamLoadingIndicator1.MensajeLoading="Cargando configuración FTP..."
	jamLoadingIndicator1.Show
	
	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return False
	End If
	Dim mDataConn As Map=mRes.Get("mDataConn")
	'Log(mData0)
	
	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
	sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")

	mSQL.ExecNonQuery("delete from tblRepsolLineasFicheroPedido")
	mSQL.ExecNonQuery("delete from tblRepsolErroresSedePedidoDNIFicheroPedido")

	jamLoadingIndicator1.MensajeLoading="Procesando fichero..."
	jamLoadingIndicator1.IniciarControlTiempoProceso
	jamLoadingIndicator1.Show
	
	Dim lstLineasFichero As List
	lstLineasFichero.Initialize

	'lstLineasFichero = File.ReadList(CarpetaFicheroOrigen , NombreFicheroOrigen)   ' SOLO si el fichero origen está en UTF-8 . el de Repsol parece que no lo está...

	Dim tr As TextReader
	'tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "ISO-8859-1")
	tr.Initialize2(File.OpenInput(CarpetaFicheroOrigen, NombreFicheroOrigen), "UTF-8")
	lstLineasFichero=tr.ReadList	
'	Dim line As String
'	line = tr.ReadLine
'	Do While line <> Null
'		'Log(line)
'		line = tr.ReadLine
'		lstLineasFichero.Add(line)
'	Loop
'	tr.Close
	
	Dim DNIEmpleadoSel As String
	
	Dim idxFila As Int=1

	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd-MM-yyyy"

	For Each sLinea As String In lstLineasFichero
		'Log(sLinea.Length)
		

		
		Dim NumCharLinea As Int=sLinea.Length
		'Dim sLineaUTF8 As String=utf2android(sLinea)
		Dim csvLine(20) As Object
		
		If NumCharLinea<6 Then

			mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, LineaConError) values (?,?)"$, Array(idxFila,1))
			Continue
		Else
			Dim NumLinea As String=sLinea.SubString2(0,6)
		End If



		csvLine(0)=NumLinea

		Dim TipoLinea As Int=sLinea.SubString2(6,7)
		csvLine(2)=TipoLinea
		'Dim IDSedeEmpresaSel As String
		Select Case TipoLinea
			Case 0 ' cabecera pedido

				Dim LineaNumeroPedido As String=sLinea.SubString(7)  ' = nombre fichero?
				Dim ArrLineaNumeroPedido() As String=Regex.Split(".TXT",LineaNumeroPedido)
				Dim NumeroPedido As String=ArrLineaNumeroPedido(0)
				'Log($"NumeroPedido ${NumeroPedido}"$)
			Case 1 ' cabecera estacion servicio
				Dim DatosLineaPedido As TipoDatosLineaPedidoRepsol
				DatosLineaPedido.Initialize
				DatosLineaPedido.Linea=NumLinea
				'DatosLineaPedido.LineaOK=True
				'Dim ErrorLineaEstacionServicio As Boolean
				If NumCharLinea<>236 Then
					'ErrorLineaEstacionServicio=True
					'DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion=$"Longitud Linea Cabecera EESS<>236"$
					DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion=1
''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 1 distinto de 236 caracteres (${NumCharLinea}"$))
					'Continue
				End If
				
					Dim IDSedeEmpresa As String=sLinea.SubString2(7,15)   ' 8 posiciones   CAMPO CLAVE 1 PARA FICHERO ERRORES
					DatosLineaPedido.Sede=IDSedeEmpresa
					DatosLineaPedido.CodigoClienteERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?",Array(DatosLineaPedido.Sede)))
					DatosLineaPedido.ErrorSede=IIf(DatosLineaPedido.CodigoClienteERP="",1,0)
					DatosLineaPedido.CodigoDireccionEnvioERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?",Array(DatosLineaPedido.Sede)))
					DatosLineaPedido.ErrorSede=IIf(DatosLineaPedido.CodigoDireccionEnvioERP="",1,0)

					Dim NumeroPedidoEstacion As String=sLinea.SubString2(15,19)   ' 4 posiciones   CAMPO CLAVE 2 PARA FICHERO ERRORES
					DatosLineaPedido.CodigoPedido=NumeroPedidoEstacion

					Dim FechaPedido As String=sLinea.SubString2(19,29)   ' 10 posiciones  DD-MM-YYYY
					Try
						Dim FechaPedidoLong As Long=DateTime.DateParse(FechaPedido)
						DatosLineaPedido.FechaPedido=FechaPedido
						DatosLineaPedido.ErrorFechaPedido=0
					Catch
						'ErrorLineaEstacionServicio=True
						'ErrorFechaPedido=True
						DatosLineaPedido.ErrorFechaPedido=1

					End Try

					Dim NombreEstacion As String=sLinea.SubString2(29,94)   ' 65 posiciones
					DatosLineaPedido.NombreEstacion=NombreEstacion

					Dim Calle As String=sLinea.SubString2(94,159)   ' 65 posiciones
					DatosLineaPedido.Calle=Calle

					Dim CodigoPostal As String=sLinea.SubString2(159,164)   ' 5 posiciones
					DatosLineaPedido.CodigoPostal=CodigoPostal

					Dim Poblacion As String=sLinea.SubString2(164,194)   ' 30 posiciones
					DatosLineaPedido.Poblacion=Poblacion

					Dim CodigoProvincia As String=sLinea.SubString2(194,196)   ' 2 posiciones
					DatosLineaPedido.CodigoProvincia=CodigoProvincia

					Dim Telefono As String=sLinea.SubString2(196,211)   ' 15 posiciones
					DatosLineaPedido.Telefono=Telefono

					Dim sTipoEstacion As String=sLinea.SubString2(211,226)   ' 15 posiciones
					Dim TipoEstacion As String=sTipoEstacion

'					Select Case sTipoEstacion   ''' NO CONTROLAMOS EL TIPO DE ESTACION, ya que no influye en el mapeo
'						Case "888-CRED"
'							TipoEstacion="CampsaRed"
'						Case "999-GESPEVESA"
'							TipoEstacion="Gespevesa"
'						Case Else
'							TipoEstacion="Abanderadas"
'					End Select
					DatosLineaPedido.TipoEstacion=TipoEstacion

					
				Try
					Dim Marca As String=sLinea.SubString2(226,236).Trim.ToUpperCase   ' 10 posiciones
				Catch
					Log(LastException)
					Dim Marca As String=sLinea.SubString2(226,NumCharLinea).Trim.ToUpperCase
				End Try
					
					If Not(Marca="REPSOL" Or Marca="CAMPSA" Or Marca="PETRONOR") Then
						DatosLineaPedido.ErrorMarca=1

					Else
						DatosLineaPedido.Marca=Marca
						'DatosLineaPedido.ErrorMarca=0
					End If

			Case 2 ' empleado
				DatosLineaPedido.Linea=NumLinea
				'Log(sLinea.Length)
				'Dim ErrorLineaEmpleado As Boolean
				If NumCharLinea<>141 Then
					'ErrorLineaEmpleado=True
					DatosLineaPedido.ErrorLongitudLineaEmpleado=1
''''					mSQL.AddNonQueryToBatch($"insert into tblRepsolLineasFicheroPedido (IDxFila, Linea, TipoDato, LineaOK, Error) values (?,?,?,?,?)"$, Array(idxFila,NumLinea,TipoLinea, 0,$"Longitud línea tipo dato 2 distinto de 141 caracteres (${NumCharLinea}"$))
					'Continue
				End If
				
				Dim DNI As String=sLinea.SubString2(29,38)   'CAMPO CLAVE 3 PARA FICHERO ERRORES
'				If DNI="70863138T" Then
'					Log("DNI 70863138T")
'				End If
				If DNIEmpleadoSel<>DNI Then
					DNIEmpleadoSel=DNI
					'DatosLineaPedido.ErrorEmpleado=0
					DatosLineaPedido.DNI=""
					DatosLineaPedido.ErrorDNI=0
					DatosLineaPedido.NombreEmpleado=""
					DatosLineaPedido.Cargo=""
					DatosLineaPedido.ErrorCargo=0
					DatosLineaPedido.Sexo=""
					DatosLineaPedido.errorSexo=0
					DatosLineaPedido.Embarazo=""
					DatosLineaPedido.ErrorEmbarazo=0
					
					'DatosLineaPedido.ErrorLineaProducto=0
					DatosLineaPedido.CodigoPrenda=""
					DatosLineaPedido.DescripcionCodigoPrenda=""
					DatosLineaPedido.ErrorCodigoPrenda=0
					DatosLineaPedido.CodigoProductoERP=""
					DatosLineaPedido.ErrorCodigoProductoERP=0
					DatosLineaPedido.Talla=""
					DatosLineaPedido.TallaERP=""
					DatosLineaPedido.ErrorTalla=0
					DatosLineaPedido.Cantidad=0
					DatosLineaPedido.ErrorCantidad=0
					
					DatosLineaPedido.DNI=DNIEmpleadoSel
					Dim DNIEmpleadoSelOK As Boolean=checkDNI(DNIEmpleadoSel)
					If Not(DNIEmpleadoSelOK) Then DatosLineaPedido.ErrorDNI=1


						Dim NombreEmpleado As String=sLinea.SubString2(38,138)
						DatosLineaPedido.NombreEmpleado=NombreEmpleado
						Dim sCargo As String=sLinea.SubString2(138,139)
'						Dim Cargo As String
'						Select Case sCargo
'							Case "G"
'								Cargo="Gestor"
'							Case "E"
'								Cargo="Encargado"
'							Case "V"
'								Cargo="Vendedor"
'						End Select
						DatosLineaPedido.Cargo=sCargo
						If Not(sCargo="G" Or sCargo="E" Or sCargo="V") Then
							 DatosLineaPedido.ErrorCargo=1
							'DatosLineaPedido.ErrorEmpleado=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Cargo Empleado"$
						Else
							DatosLineaPedido.ErrorCargo=0
						End If
						'Log("NumLinea: " & NumLinea)

						Dim sSexoEmpleado As String=sLinea.SubString2(139,140)
'						Dim SexoEmpleado As String
'						Select Case sSexoEmpleado
'							Case "H"
'								SexoEmpleado="Hombre"
'							Case "M"
'								SexoEmpleado="Mujer"
'						End Select
						DatosLineaPedido.Sexo=sSexoEmpleado
						If Not(sSexoEmpleado="H" Or sSexoEmpleado="M") Then
							 DatosLineaPedido.ErrorSexo=1
							'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Sexo Empleado"$
							'DatosLineaPedido.ErrorLinea=1
						Else
							DatosLineaPedido.ErrorSexo=0
						End If
						
						Dim sEmbarazoEmpleado As String=sLinea.SubString2(140,141)

'						Dim EmbarazoEmpleado As String
'						Select Case sEmbarazoEmpleado
'							Case "S"
'								EmbarazoEmpleado="SI"
'							Case "N"
'								EmbarazoEmpleado="NO"
'						End Select
						DatosLineaPedido.Embarazo=sEmbarazoEmpleado
						If Not(sEmbarazoEmpleado="S" Or sEmbarazoEmpleado="N") Then
							 DatosLineaPedido.ErrorEmbarazo=1
							'DatosLineaPedido.ErrorLinea=$"${DatosLineaPedido.ErrorEmpleado},Error Campo Embarazo Empleado"$
							'DatosLineaPedido.ErrorLinea=1
						Else
							DatosLineaPedido.ErrorEmbarazo=0
						End If

					
				End If
				
				'If DatosLineaPedido.ErrorEmpleado.Length>0 And DatosLineaPedido.ErrorCabeceraEstacion="" Then DatosLineaPedido.ErrorEmpleado=DatosLineaPedido.ErrorEmpleado.SubString(1)
				
			Case 3 ' prendas empleado
				DatosLineaPedido.Linea=NumLinea
'				Try
				'DatosLineaPedido.ErrorLineaProducto=0
				DatosLineaPedido.CodigoPrenda=""
				DatosLineaPedido.DescripcionCodigoPrenda=""
				DatosLineaPedido.ErrorCodigoPrenda=0
				DatosLineaPedido.CodigoProductoERP=""
				DatosLineaPedido.ErrorCodigoProductoERP=0
				DatosLineaPedido.Talla=""
				DatosLineaPedido.TallaERP=""
				DatosLineaPedido.ErrorTalla=0
				DatosLineaPedido.Cantidad=0
				DatosLineaPedido.ErrorCantidad=0
				Try
					Dim CodigoPrenda As String=sLinea.SubString2(38,40)
					
					''''''''''If CodigoPrenda="07" Or CodigoPrenda="08" Or CodigoPrenda="09" Then Continue  ' 23/11/23 por el momento, se descartan las líneas de calzado  ' 07/01/24 SI se distribuye el calzado
					
					DatosLineaPedido.CodigoPrenda=CodigoPrenda
					Dim NumMapeoCodigoPrenda As Int=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select count(*) from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?", _
						Array As String(DatosLineaPedido.CodigoPrenda)))
					DatosLineaPedido.ErrorCodigoPrenda=IIf(NumMapeoCodigoPrenda=0,1,0)
					DatosLineaPedido.DescripcionCodigoPrenda=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?", _
						Array As String(DatosLineaPedido.CodigoPrenda)))
				Catch
					Log(LastException)
					DatosLineaPedido.ErrorCodigoPrenda=1
				End Try

						DatosLineaPedido.CodigoProductoERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Cargo=? and Sexo=? and CodigoPrenda=?", _
							Array(DatosLineaPedido.Marca, DatosLineaPedido.Cargo, DatosLineaPedido.Sexo, DatosLineaPedido.CodigoPrenda)))
'					End If

					DatosLineaPedido.ErrorCodigoProductoERP=IIf(DatosLineaPedido.CodigoProductoERP="",1,0)

					Dim Talla As String=sLinea.SubString2(40,44).trim
					DatosLineaPedido.Talla=Talla
					DatosLineaPedido.TallaERP=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Talla from tblRepsolTallasArticulosEESS where Articulo=? and Talla=?", _
								Array As String(DatosLineaPedido.CodigoProductoERP, DatosLineaPedido.Talla)))
					'DatosLineaPedido.ErrorTalla=IIf(DatosLineaPedido.TallaERP="",1,0)
					DatosLineaPedido.ErrorTalla=IIf(DatosLineaPedido.TallaERP=DatosLineaPedido.Talla,0,1)

					
					Try
						Dim Cantidad As Int=sLinea.SubString2(44,45)
						DatosLineaPedido.Cantidad=Cantidad
					Catch
						Log(LastException)
						DatosLineaPedido.ErrorCantidad=1
					End Try
					

				
				If DatosLineaPedido.ErrorSede=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorFechaPedido=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorMarca=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorDNI=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCargo=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorSexo=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorEmbarazo=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCodigoPrenda=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCodigoProductoERP=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorTalla=1 Then DatosLineaPedido.LineaConError=1
				If DatosLineaPedido.ErrorCantidad=1 Then DatosLineaPedido.LineaConError=1
				
				If DatosLineaPedido.LineaConError=1 Then
					LogColor("*********************",xui.Color_Blue)
					LogColor($"DatosLineaPedido ERROR: ${DatosLineaPedido}"$, xui.Color_Red)
					LogColor("*********************",xui.Color_Blue)
				End If

				
				mSQL.AddNonQueryToBatch($"
	insert into tblRepsolLineasFicheroPedido
	(Linea, ErrorLongitudLineaCabeceraEstacion, Sede , ErrorSede , CodigoClienteERP , CodigoDireccionEnvioERP 
	, CodigoPedido , FechaPedido ,ErrorFechaPedido, NombreEstacion ,Calle , CodigoPostal 
	, Poblacion , CodigoProvincia , Telefono 
	, TipoEstacion , Marca , ErrorMarca 
	, DNI , ErrorDNI , NombreEmpleado , Cargo , ErrorCargo 
	, Sexo , ErrorSexo ,  Embarazo , ErrorEmbarazo 
	,CodigoPrenda , ErrorCodigoPrenda , CodigoProductoERP, ErrorCodigoProductoERP, Talla, TallaERP , ErrorTalla , Cantidad, ErrorCantidad
	, LineaConError) 
	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"$, _
	Array(DatosLineaPedido.Linea, DatosLineaPedido.ErrorLongitudLineaCabeceraEstacion, DatosLineaPedido.Sede, DatosLineaPedido.ErrorSede, DatosLineaPedido.CodigoClienteERP, DatosLineaPedido.CodigoDireccionEnvioERP, _
	DatosLineaPedido.CodigoPedido, DatosLineaPedido.FechaPedido, DatosLineaPedido.ErrorFechaPedido, DatosLineaPedido.NombreEstacion, DatosLineaPedido.Calle, DatosLineaPedido.CodigoPostal, _
	DatosLineaPedido.Poblacion, DatosLineaPedido.CodigoProvincia,DatosLineaPedido.Telefono, _
	DatosLineaPedido.TipoEstacion, DatosLineaPedido.Marca, DatosLineaPedido.ErrorMarca, _
	DatosLineaPedido.DNI, DatosLineaPedido.ErrorDNI, DatosLineaPedido.NombreEmpleado, DatosLineaPedido.Cargo, DatosLineaPedido.ErrorCargo, _
	DatosLineaPedido.Sexo, DatosLineaPedido.ErrorSexo, DatosLineaPedido.Embarazo, DatosLineaPedido.ErrorEmbarazo, _
	DatosLineaPedido.CodigoPrenda, DatosLineaPedido.ErrorCodigoPrenda, DatosLineaPedido.CodigoProductoERP, DatosLineaPedido.ErrorCodigoProductoERP, _
	DatosLineaPedido.Talla, DatosLineaPedido.TallaERP, DatosLineaPedido.ErrorTalla, _
	DatosLineaPedido.Cantidad, DatosLineaPedido.ErrorCantidad, _
	DatosLineaPedido.LineaConError))

	DatosLineaPedido.LineaConError=0  ' reseteamos la variable LineaConError
				
			Case 9  ' fin fichero

				
				Exit ' Salir del loop (ésta debería ser la última línea) En el fichero de ejemplo, se ha añadido 1 línea en blanco, que da error
			Case Else
				' error en TipoLinea, no reconocido

'				Dim LineaError As TipoDatosLineaErrorPedidoRepsol
'				LineaError.Initialize
'				LineaError.NumeroLinea=NumLinea
'				LineaError.Errores=$"Tipo de línea ${TipoLinea} no reconocido."$
'				LineaError.TextoLinea=sLinea
'				LineaError.IDSedeEmpresa=""
'				LineaError.NumeroPedidoEstacion=""
'				LineaError.DNIEmpleado=""
'				lstLineasError.Add(LineaError)
		End Select
	
		
		
	Next
	
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	

	Dim NumLineasConError As Int=mSQL.ExecQuerySingleResult2($"select count(*) from tblRepsolLineasFicheroPedido where LineaConError=?"$, Array As String(1))
	
	If NumLineasConError>0 Then
	 
		Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery($"select distinct Sede, CodigoPedido, DNI from tblRepsolLineasFicheroPedido where LineaConError=1"$)
		Do While rsSedePedidoDNI.NextRow
			Dim Sede As String=rsSedePedidoDNI.GetString("Sede")
			Dim PedidoSede As String=rsSedePedidoDNI.GetString("CodigoPedido")
			Dim DNI As String=rsSedePedidoDNI.GetString("DNI")
		
			mSQL.ExecNonQuery2("update tblRepsolLineasFicheroPedido set SedePedidoDNIConError=? where Sede=? and CodigoPedido=? and DNI=?", _
				Array As Object(1, Sede, PedidoSede, DNI))
		
			mSQL.ExecNonQuery2("insert into tblRepsolErroresSedePedidoDNIFicheroPedido (Sede, PedidoSede, DNI, Errores) values (?,?,?,?)", _
			Array($"${Sede}"$,$"${PedidoSede}"$, $"${DNI}"$, ""))
			
			Dim ErrorLongitudLineaCabeceraEstacion As Boolean
			Dim ErrorSede As Boolean
			Dim ErrorFechaPedido As Boolean
			Dim ErrorMarca As Boolean
			Dim ErrorLongitudLineaEmpleado As Boolean
			Dim ErrorDNI As Boolean
			Dim ErrorCargo As Boolean
			Dim ErrorSexo As Boolean
			Dim ErrorEmbarazo As Boolean
			Dim ErrorLongitudLineaProducto As Boolean
			Dim ErrorCodigoPrenda As Boolean
			Dim ErrorCodigoProductoERP As Boolean
			Dim ErrorTalla As Boolean
			Dim ErrorCantidad As Boolean


			Dim rsLineasSedePedidoDNI As ResultSet= mSQL.ExecQuery2($"Select distinct Sede, CodigoPedido, DNI
	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca
	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo
	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla, ErrorCantidad
	 from tblRepsolLineasFicheroPedido
	 where
	 Sede=? And CodigoPedido=? And DNI=?"$, _
	 	Array(Sede, PedidoSede,DNI))
		
			Do While rsLineasSedePedidoDNI.NextRow
				If rsLineasSedePedidoDNI.GetInt("ErrorLongitudLineaCabeceraEstacion")=1 Then ErrorLongitudLineaCabeceraEstacion=True
				If rsLineasSedePedidoDNI.GetInt("ErrorSede")=1 Then ErrorSede=True
				If rsLineasSedePedidoDNI.GetInt("ErrorFechaPedido")=1 Then ErrorFechaPedido=True
				If rsLineasSedePedidoDNI.GetInt("ErrorMarca")=1 Then ErrorMarca=True
				If rsLineasSedePedidoDNI.GetInt("ErrorLongitudLineaEmpleado")=1 Then ErrorLongitudLineaEmpleado=True
				If rsLineasSedePedidoDNI.GetInt("ErrorDNI")=1 Then ErrorDNI=True
				If rsLineasSedePedidoDNI.GetInt("ErrorCargo")=1 Then ErrorCargo=True
				If rsLineasSedePedidoDNI.GetInt("ErrorSexo")=1 Then ErrorSexo=True
				If rsLineasSedePedidoDNI.GetInt("ErrorEmbarazo")=1 Then ErrorEmbarazo=True
				If rsLineasSedePedidoDNI.GetInt("ErrorLongitudLineaProducto")=1 Then ErrorLongitudLineaProducto=True
				If rsLineasSedePedidoDNI.GetInt("ErrorCodigoPrenda")=1 Then ErrorCodigoPrenda=True
				If ErrorMarca Or ErrorCargo Or ErrorSexo Or ErrorEmbarazo Or ErrorCodigoPrenda Then Continue ' los dos siguientes errores vienen del mapeo
				If rsLineasSedePedidoDNI.GetInt("ErrorCodigoProductoERP")=1 Then ErrorCodigoProductoERP=True
				If rsLineasSedePedidoDNI.GetInt("ErrorTalla")=1 Then ErrorTalla=True
				If rsLineasSedePedidoDNI.GetInt("ErrorCantidad")=1 Then ErrorCantidad=True
			Loop
			rsLineasSedePedidoDNI.close
		
			Dim sbTextoError As StringBuilder
			sbTextoError.Initialize
		
			If ErrorLongitudLineaCabeceraEstacion Then sbTextoError.Append(", ErrorLongitudLineaCabeceraEstacion")
			If ErrorSede Then sbTextoError.Append(", Sede no existe ERP Proin")
			If ErrorFechaPedido Then sbTextoError.Append(", Error Fecha")
			If ErrorMarca Then sbTextoError.Append(", Error Marca")
			If ErrorLongitudLineaEmpleado Then sbTextoError.Append(", ErrorLongitudLineaEmpleado")
			If ErrorDNI Then sbTextoError.Append(", DNI no válido")
			If ErrorCargo Then sbTextoError.Append(", Error Cargo")
			If ErrorSexo Then sbTextoError.Append(", Error Sexo")
			If ErrorEmbarazo Then sbTextoError.Append(", Error Embarazo")
			If ErrorLongitudLineaProducto Then sbTextoError.Append(", ErrorLongitudLineaProducto")
			If ErrorCodigoPrenda Then sbTextoError.Append(", Error Código Prenda")
			If ErrorCodigoProductoERP Then sbTextoError.Append(", ErrorCodigoProductoERP")
			If ErrorTalla Then sbTextoError.Append(", ErrorTalla")
			If ErrorCantidad Then sbTextoError.Append(", ErrorCantidad")

			If sbTextoError.Length>2 Then
				mSQL.ExecNonQuery2("update tblRepsolErroresSedePedidoDNIFicheroPedido set Errores=? where Sede=? and PedidoSede=? and DNI=?", _
					Array As Object($"${sbTextoError.ToString.SubString(2)}"$, Sede, PedidoSede, DNI))
			End If
	
		Loop
		rsSedePedidoDNI.close
	
		DateTime.DateFormat=DateFormatAnt
	
		jamLoadingIndicator1.MensajeLoading="Generando Fichero CSV ERRORES..."
		Dim lstErrores As List=DBUtils.ExecuteMemoryTable(mSQL,$"select * from tblRepsolErroresSedePedidoDNIFicheroPedido"$,Null,0)
		Dim lstEncabezadosErrores As List
		lstEncabezadosErrores.Initialize
		lstEncabezadosErrores.add("Sede")
		lstEncabezadosErrores.add("PedidoSede")
		lstEncabezadosErrores.add("DNI")
		lstEncabezadosErrores.add("ERROR")

	
		Dim sFicheroErrores As String=GenerarCSVSeparadorComasQuotes(lstErrores,",",lstEncabezadosErrores)
		Dim NombreFicheroErrores As String=$"Errores_${NumeroPedido}.csv"$
		File.WriteString(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores, sFicheroErrores)
		If File.Exists(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores)=False Then
			Dim msa As Object=xui.MsgboxAsync("Fichero error aun no existe!!","Error")
			Wait For (msa) Msgbox_Result
		End If
		Log(File.Exists(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores))
	
'	Sleep(5000) ' espera para grabar csv ...
	
		' DE MOMENTO, DESACTIVAR SUBIDA DEL FICHERO DE ERRORES

		Dim RutaFTPFicheroPedidoErrores As String=ErrorFilesFoldersFtpRepsol & "/" & NombreFicheroErrores
		
		If File.Exists(CarpetaDestinoFicherosPedidosErrorRepsol,NombreFicheroErrores) Then
			wait for(SubirFicheroACarpetaFTP(CarpetaDestinoFicherosPedidosErrorRepsol, NombreFicheroErrores, RutaFTPFicheroPedidoErrores)) complete (Success As Boolean)
			If Not(Success) Then
				' PENDIENTE AFINAR EL MENSAJE PARA EL USUARIO (VENTAS PROIN)
				Dim msa As Object=xui.MsgboxAsync($"Ha habido un error en la subida del fichero de errores${NombreFicheroErrores}"$,"ATENCION!")
				Wait For (msa) Msgbox_Result
				jamLoadingIndicator1.close
				Return False
			Else
				Dim msa As Object=xui.MsgboxAsync($"Se ha subido el fichero de errores${NombreFicheroErrores} correspondiente al fichero de pedido seleccionado."$,"ATENCION!")
				Wait For (msa) Msgbox_Result
				jamLoadingIndicator1.close
				'Return False
			End If
		End If

	End If
	
	Dim NumLineasSinError As Int=mSQL.ExecQuerySingleResult2($"select count(*) from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"$, Array As String(0))
	
	If NumLineasSinError>0 Then
		
		Dim lstHeaders As List=Array As String("Docuware ID", "Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen", _
		"FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio")
		'Dim CarpetaFicheroCSV As String=Utilidades.FindUserDocumentsFolder  ' en produccion habrá que cambiarlo a 1 carpeta del 10.6
		Dim CarpetaFicheroCSV As String="\\192.168.10.6\PendientesNAV"
		
		Dim rsCabeceraPedidosLineasSinError As ResultSet=mSQL.ExecQuery2($"select distinct CodigoClienteERP, CodigoDireccionEnvioERP, Sede, CodigoPedido, FechaPedido
			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"$, Array As String(0))
		Do While rsCabeceraPedidosLineasSinError.NextRow
			Dim UUIDPedido As String=Utilidades.GenerarUUIDv4
			Dim IDPedido As String=$"REPSOL_${UUIDPedido}"$
			Dim NombreFicheroCSV As String=$"${IDPedido}.csv"$
			Dim lstLineasPedidoVenta As List
			lstLineasPedidoVenta.Initialize
			Dim CodigoClienteNAV As String=rsCabeceraPedidosLineasSinError.GetString("CodigoClienteERP")
			Dim CodigoDireccionEnvioNAV As String=rsCabeceraPedidosLineasSinError.GetString("CodigoDireccionEnvioERP")
			Dim Sede As String=rsCabeceraPedidosLineasSinError.GetString("Sede")
			Dim CodigoPedido As String=rsCabeceraPedidosLineasSinError.GetString("CodigoPedido")
			Dim DocumentoExterno As String=Sede & CodigoPedido
			Dim FechaPedidoCliente As String=rsCabeceraPedidosLineasSinError.GetString("FechaPedido")
			Dim FechaPedidoClienteNAV As String=FechaPedidoCliente.Replace("-","/")
			
				
		Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2($"Select CodigoProductoERP, TallaERP, sum(Cantidad) as TotalCantidad
			from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? And CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?
			group by CodigoProductoERP,TallaERP"$, _
			 	Array As String(0, CodigoClienteNAV,CodigoDireccionEnvioNAV,CodigoPedido,FechaPedidoCliente))
				
			Do While rsLineasPedido.NextRow
				
				Dim Precio As Double=Utilidades.FixNullDouble(mSQL.ExecQuerySingleResult2("select PrecioUnitario from tblRepsolTarifaVentaGRP07506 where Articulo=?",Array As String(rsLineasPedido.GetString("CodigoProductoERP"))))

				Dim ArrDatosLineaPedido(12) As String
				ArrDatosLineaPedido(0)=$"${UUIDPedido}"$
				'ArrDatosLineaPedido(1)=Main.DatosUsuario.NombreADUsuarioWindows   ' OJO, CAMBIAR si se pasa a proceso automático en 10.20.
				ArrDatosLineaPedido(1)="PROIN\SUSANA.DIEZ"   ' OJO, CAMBIAR si se pasa a proceso automático en 10.20.
				ArrDatosLineaPedido(2)=CodigoClienteNAV
				ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV
				ArrDatosLineaPedido(4)=DocumentoExterno
				ArrDatosLineaPedido(5)="0299"
				ArrDatosLineaPedido(6)=FechaPedidoClienteNAV
				ArrDatosLineaPedido(7)=rsLineasPedido.GetString("CodigoProductoERP")
				ArrDatosLineaPedido(8)=""
				ArrDatosLineaPedido(9)=rsLineasPedido.GetString("TallaERP")
				ArrDatosLineaPedido(10)=rsLineasPedido.GetInt("TotalCantidad")
				ArrDatosLineaPedido(11)=Precio
					
				lstLineasPedidoVenta.Add(ArrDatosLineaPedido)
				
				
			Loop
			rsLineasPedido.Close
			
			'DateTime.DateFormat=DateFormatAnt

			If lstLineasPedidoVenta.Size>0 Then
				Dim su As StringUtils
				Try
					su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,";",lstLineasPedidoVenta, lstHeaders)

				Catch
					Log(LastException)

				End Try
			End If
			
		Loop
		rsCabeceraPedidosLineasSinError.close

	End If
	
	jamLoadingIndicator1.DetenerControlTiempoProceso
	jamLoadingIndicator1.close

	
	Return True
End Sub

Private Sub btnProcesoCompleto_Click
	
'	Dim msa As Object=xui.MsgboxAsync("Pendiente de terminar programacion, para traspasar a 10.20","Aviso")
'	Wait For (msa) Msgbox_Result
'	Return
	
	ProcesoCompleto
	
	
	
End Sub

Sub CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine As ResumableSub
	Dim Accion As String
	Dim Error As String
	Dim UltimoDiaPedidosOnlineProcesado As Long
	Dim mRes As Map
	mRes.Initialize

	Dim Comando As String="RepsolUltimoDiaProcesadoDatosPedidosOnLine"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		Accion="NOK"
		Error=$"Error de conexion servidor/query ${Comando}."$
		'mRes.Put("Accion", Accion)
	Else
		If mresult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync($"No hay datos de mapeo de tipo de prendas."$,"Error")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			Error=""
			'mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mresult.Get("lstRes")
			Accion="OK"
			Error=""
			'mRes.Put("Accion", Accion)
			'mRes.Put("lstReg", lstReg)
			Dim mData0 As Map=lstReg.Get(0)
			UltimoDiaPedidosOnlineProcesado=Utilidades.FixNullLong(mData0.Get("UltimoDiaPedidosOnlineProcesado"))
		End If
	End If
	mRes.Put("Accion", Accion)
	mRes.Put("Error", Error)
	mRes.Put("UltimoDiaPedidosOnlineProcesado", UltimoDiaPedidosOnlineProcesado)
	Return mRes
End Sub



Sub InicializacionDatos As ResumableSub
	'mCodigoNAVClienteRepsolEESS="07506"
	mCodigoNAVGRPRepsolEESS="07506"
	
	Dim RespuestaJRDC As TipoRespuestaJRDC
	RespuestaJRDC.Initialize

'	jamLoadingIndicator1.MensajeLoading="Cargando datos Direcciones Envio Repsol EESS..."
'	jamLoadingIndicator1.Show

	'wait for(CargaDireccionesEnvioRepsolEESS) complete (mRes As Map)
	wait for(CargaDireccionesEnvioRepsolEESSGRP) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		SalirModulo
		Dim Error As String=mRes.Get("Error")
		RespuestaJRDC.Accion=Accion
		RespuestaJRDC.Error=Error
		Return RespuestaJRDC
	End If
	
	wait for(CargaTarifaVentaValidaActualGRPRepsolEESS) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		SalirModulo
		'   	Return
		Dim Error As String=mRes.Get("Error")
		RespuestaJRDC.Accion=Accion
		RespuestaJRDC.Error=Error
		Return RespuestaJRDC
	End If

'	jamLoadingIndicator1.MensajeLoading="Cargando datos artículos Repsol..."

	wait for(CargaMapeoCodigosPrendaEESS) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		SalirModulo
'		Return
		Dim Error As String=mRes.Get("Error")
		RespuestaJRDC.Accion=Accion
		RespuestaJRDC.Error=Error
		Return RespuestaJRDC
	End If

	wait for(CargaMapeoArticulosEESS) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		SalirModulo
'		Return
		Dim Error As String=mRes.Get("Error")
		RespuestaJRDC.Accion=Accion
		RespuestaJRDC.Error=Error
		Return RespuestaJRDC
	End If

	wait for(CargaTallasArticulosEESS) complete (mRes As Map)
	'If Success=False Then
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		SalirModulo
'		Return
		Dim Error As String=mRes.Get("Error")
		RespuestaJRDC.Accion=Accion
		RespuestaJRDC.Error=Error
		Return RespuestaJRDC
	End If
	
	Wait For(CargaDatosConnSFTP) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Dim Error As String=mRes.Get("Error")
		RespuestaJRDC.Accion=Accion
		RespuestaJRDC.Error=Error
		Return RespuestaJRDC
	End If
	Dim mDataConn As Map=mRes.Get("mDataConn")
	Log(mDataConn)
	
	sFtpRepsol.Initialize("sFtpRepsol", mDataConn.Get("CampoString2"), mDataConn.Get("CampoString3"), mDataConn.Get("CampoString1"), mDataConn.Get("CampoInt1"))
	FilesFoldersFtpRepsol=mDataConn.Get("CampoString4")
	ErrorFilesFoldersFtpRepsol=mDataConn.Get("CampoString5")
	'sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder, "aJma.txt")
	sFtpRepsol.SetKnownHostsStore(File.DirData(Main.NombreAplicacion), "aJma.txt")
	
	'jamLoadingIndicator1.Close
	RespuestaJRDC.Accion="OK"
	RespuestaJRDC.Error=""
	Return RespuestaJRDC
	
End Sub



Sub EnviarEmailAviso(SoloDev As Boolean, Asunto As String, Body As String) As ResumableSub
	Body=Body & $"

No respondas a este correo. Ha sido generado por un proceso automático.
"$
	Body=Body.Replace(CRLF,"<br>")
	Dim Destinatarios As String
	Dim DestinatariosCC As String
	Dim DestinatariosCCO As String
	If SoloDev Then
		'Destinatarios=$"${CuentaEmailDestinatarioDev1};${CuentaEmailDestinatarioDev2}$"$
		Destinatarios=$"${CuentaEmailDestinatarioDev1}"$
	Else
		Destinatarios=$"${CuentaEmailDestinatarioProinPedidosRepsol}"$
		'DestinatariosCC=$"${CuentaEmailDestinatarioDev1};${CuentaEmailDestinatarioDev2}$"$
		DestinatariosCC=$"${CuentaEmailDestinatarioDev1}"$
	End If
	Wait For(Utilidades.EnviarMensajeHttpPA(CuentaEmailRemitenteAvisos,Destinatarios,DestinatariosCC,DestinatariosCCO,Asunto,Body)) COMPLETE (sResp As String)
	Return sResp
End Sub

Sub ProcesoCompleto
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	
	Dim DiaActual As String=DateTime.Date(DateTime.Now)
	
	Dim FechaHoraInicioProceso As Long=DateTime.now
	
	Wait For(CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Dim Error As String=mRes.Get("Error")
		Wait For(EnviarEmailAviso(True,"ERROR Carga Repsol Ultimo Dia ProcesadoDatos Pedidos OnLine EESS",Error)) complete (sResp As String)
		'timer1.Enabled=True
		Return
	End If
	Dim UltimoDiaProcesado As Long=mRes.Get("UltimoDiaPedidosOnlineProcesado")
	
	If DateUtils.IsSameDay(DateTime.Now,UltimoDiaProcesado) Then ' ya se ha procesado el dia actual. Incluimos este control por si se reinicia el servidor.
		' calcular próxima ejecución
		Dim t As Long = Utilidades.FindNextTime(Array As Double(6))
		Log($"Próxima ejecución proceso REPSOL Pedidos Online EESS: $DateTime{t}"$)
	
		Dim DifT As Long=t-DateTime.Now
		'''''timer1.Interval=DifT
	
		DateTime.DateFormat=DateFormatAnt
	
		'timer1.Enabled=True
		Return
	End If
	
	Wait For(InicializacionDatos) complete (respJRDC As TipoRespuestaJRDC)
	Dim FechaHoraInicializacionDatos As Long=DateTime.Now
	If respJRDC.Accion="NOK" Then
		Dim Error As String=respJRDC.Error
		Wait For(EnviarEmailAviso(True,"ERROR inicializacion datos Proceso Pedidos OnLine REPSOL EESS",Error)) complete (sResp As String)
		'''''timer1.Enabled=True
		Return
	Else
		'Wait For(EnviarEmailAviso(True,"Proceso inicializacion datos Pedidos OnLine REPSOL EESS OK",$"Proceso ejecutado, OK $DateTime{DateTime.Now}"$)) complete (sResp As String)
	End If
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	
	
	
	DateTime.DateFormat=DateFormatAnt
	
'	Wait For (File.ListFilesAsync(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol)) Complete (Success As Boolean, Files As List)
'	If Files.Size=0 Then
'		Wait For(EnviarEmailAviso(True,$"No hay ficheros en la carpeta ${FilesFoldersFtpRepsol}"$,"Carpeta sin Fichero Pedido REPSOL EESS OnLine")) complete (sResp As String)
'		timer1.Interval=30* DateTime.TicksPerMinute
'		timer1.Enabled=True
'		Return
'	End If
	
	Wait For(BuscarUltimoFicheroPedidoEnFTP) complete (sResp As String)
	If sResp.StartsWith("Error") Then
'		Dim msa As Object=xui.MsgboxAsync(sResp.Replace("Error,",""),"Error")
'		Wait For (msa) Msgbox_Result
'		Return
		Dim Error As String=sResp
		Wait For(EnviarEmailAviso(True,"ERROR buscar ultimo fichero FTP Proceso Pedidos OnLine REPSOL EESS",Error)) complete (sResp As String)
		'''''timer1.Enabled=True
		Return
	End If
	
'	If sResp.StartsWith("Aviso") Then
	'
'		Dim msa As Object=xui.MsgboxAsync(sResp.Replace("Aviso,",""),"Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	
	Dim NombreFicheroPedido As String=sResp
	
	If NombreFicheroPedido="" Then 'NO HAY FICHERO
		Dim Error As String=sResp
		Wait For(EnviarEmailAviso(True,"ERROR: No hay fichero pedidos en FTP OUTBOX, Proceso Pedidos OnLine REPSOL EESS",Error)) complete (sResp As String)
		'''''timer1.Enabled=True
		Return
	End If
	
	If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroPedido) Then
'	Dim msa As Object = xui.Msgbox2Async($"El fichero ${File.Combine(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFichero)} ya existe.
'	¿Reemplazarlo por el fichero seleccionado?"$,"Confirma", "Sí","Cancelar", "", Null)
		Log("segsdfg")
	End If
	
	Dim RutaFTPFicheroPedido As String=FilesFoldersFtpRepsol & "/" & NombreFicheroPedido
	

	Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPFicheroPedido, CarpetaDestinoFicherosDescargadosFTPPedidosRepsol, NombreFicheroPedido)) complete (Success As Boolean)

	If Not(Success) Then
		' PENDIENTE AFINAR EL MENSAJE PARA EL USUARIO (VENTAS PROIN)
'		Dim msa As Object=xui.MsgboxAsync($"Ha habido un error en la descarga del fichero ${NombreFicheroPedido}"$,"ATENCION!")
'		Wait For (msa) Msgbox_Result

		Return
	Else
		DirFicheroProcesar=CarpetaDestinoFicherosDescargadosFTPPedidosRepsol
		NombreFicheroProcesar=NombreFicheroPedido
'		txtFicheroSeleccionado.Text=File.Combine(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroProcesar)
'		
'		Dim msa As Object=xui.MsgboxAsync($"Fichero ${NombreFicheroPedido} descargado a carpeta destino Repsol ${CarpetaDestinoFicherosDescargadosFTPPedidosRepsol}"$,"Aviso")
'		Wait For (msa) Msgbox_Result
		

	End If
	
	'comprobar que el fichero está en la carpeta correcta
	If File.Exists(CarpetaDestinoFicherosDescargadosFTPPedidosRepsol,NombreFicheroPedido)=False Then
		Dim msa As Object=xui.MsgboxAsync($"El fichero ${NombreFicheroPedido} descargado a carpeta destino Repsol ${CarpetaDestinoFicherosDescargadosFTPPedidosRepsol} NO se encuentra en esa carpeta."$,"ERROR")
		Wait For (msa) Msgbox_Result
		jamLoadingIndicator1.close
		Return
	End If
	
	'' BORRAR fichero de OUTBOX . Habilitar sólo cuando el resto funcione totalmente...
	
	''''''	sFtpRepsol.DeleteFile(RutaFTPFicheroPedido)
	''''''	Wait For sFtpRepsol_CommandCompleted (Command As String, Success As Boolean, Reply As String)
	''''''	If Not(Success) Then
	''''''		'...
	''''''	End If
End Sub