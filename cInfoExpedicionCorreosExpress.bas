B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX

	Private frm As Form
	Private xui As XUI
	
	Private mNumeroExpedicion As String
	
	
	Private lblTitleNumExpedicion As Label
	Private txtNumExpedicion As TextField
	
	Private UsuarioWS As String
	Private PasswordWs As String
	
	Private Dialog As B4XDialog
	'Private cboTipoConsulta As ComboBox
	

	
	Public CallbackInfoEnvio As Object
'	Public NumEnvio As String
	Private jamTableViewInfoTrackingEnvio As jamTableView
	Private txtRef As TextField
	Private txtFecha As TextField
	Private txtDirRte As TextField
	Private txtPobRte As TextField
	Private txtCodPosNacRte As TextField
	Private txtNomDest As TextField
	Private txtDirDest As TextField
	Private txtPobDest As TextField
	Private txtCodPosNacDest As TextField
	Private txtNumBultos As TextField
	Private txtKilos As TextField
	Private txtVolumen As TextField
	Private txtCodIncEstado As TextField
	Private txtDescIncEstado As TextField
	Private btnAlbaranNAV As Button
	
	

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(NumExpedicion As String)
	mNumeroExpedicion=NumExpedicion
End Sub


Sub Show
	
	cmAuxCorreosExpress.CargaListaEstadosCorreosExpress
	cmAuxCorreosExpress.CargaListaIncidenciasCorreosExpress
'	
'	Dim mScreenDim As Map
'	mScreenDim.Initialize
'	mScreenDim=Main.DimensionesPantalla
'	Dim xScreen As Int=mScreenDim.Get("X")
'	Dim yScreen As Int=mScreenDim.Get("Y")
'	If frm.IsInitialized=False Then
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
		frm.Icon =Main.IconoFormularios
		'frm.RootPane.LoadLayout("scrMainMenu2")
		frm.RootPane.LoadLayout("scrInfoTrackingEnvioCorreosExpress")
		Utilidades.SetFormMaximized(frm)
		Sleep(0)
		frm.Title=Main.PrefijoTitleForms & "    " &  "Tracking Envío Correos Express"
		
		jamTableViewInfoTrackingEnvio.EstadoMenuItem(jamTableViewInfoTrackingEnvio.MenuBarAcciones,False)
		jamTableViewInfoTrackingEnvio.EstadoMenuItem(jamTableViewInfoTrackingEnvio.MenuBarLinea,False)
		
		Dialog.Initialize(frm.RootPane)
		
		Dim lstCF As List
		lstCF.initialize

		Dim rSub As ResumableSub=jamTableViewInfoTrackingEnvio.ConfigurarTableView("FasesTrackingExpedicionCorreosExpress.json",lstCF)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
'	Else
'		frm.WindowWidth=xScreen
'		frm.WindowHeight=yScreen
'	End If
	
	frm.Show
	If mNumeroExpedicion<>"" Then
		txtNumExpedicion.Text=mNumeroExpedicion
		btnActualizarInfoTracking_Click
	End If
	
	

End Sub

Sub LimpiarDatosCabEnvio
	txtCodIncEstado.Text=""
	txtCodPosNacDest.Text=""
	txtDescIncEstado.Text=""
	txtDirDest.Text=""
	txtDirRte.Text=""
	txtFecha.Text=""
	txtKilos.Text=""
	txtNomDest.Text=""
	txtNumBultos.Text=""
	txtNumExpedicion.Text=""
	txtPobDest.Text=""
	txtPobRte.Text=""
	txtRef.Text=""
	txtVolumen.Text=""
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub btnSalir_Click
	LimpiarDatosCabEnvio
	jamTableViewInfoTrackingEnvio.GuardarConfiguracionColumnasUsuario
	jamTableViewInfoTrackingEnvio.LimpiarTabla
	frm.Close

'	CallSub(CallbackInfoEnvio,"Show")
End Sub

Sub CargaCredenciales As ResumableSub
	
	CargaDatosWebServiceTransporte(17)   '17 es el IDTransporte en DatosComunes para CorreosExpress
	Wait For CargaDatosWebServiceTransporte_Completed (Accion As String, lstResWS As List)
	If Accion="NOK" Then
		Return "Error carga credenciales"
	End If
	Dim mDatosWS As Map=lstResWS.Get(0)
	
	UsuarioWS=mDatosWS.get("UsuarioWS")
	PasswordWs=mDatosWS.get("PasswordWS")
	'Dim URLWS As String=mDatosWS.Get("URLWebServiceSeguimiento")
	
	'If UsuarioWS="" Or PasswordWs="" Or URLWS="" Then
	If UsuarioWS="" Or PasswordWs="" Then
		Return "Error carga credenciales"
	Else
		Return "OK"
	End If
End Sub

Sub CargaDatosWebServiceTransporte(IDTransportista As Int)
	'DatosEnvioExpedicion.Initialize
	Dim Accion As String
	Dim lstRes As List
	Dim ComandoJRDC As String
	ComandoJRDC="DatosWebServiceTransporte"
	JRDCQuery.DatosJRDC("http://192.168.10.20:17179/rdc", ComandoJRDC, Array As String(IDTransportista), Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		Accion="NOK"
	Else
		If mresult.Get("ReqOK")=False Then
			Accion="NOK"
		Else
			lstRes=mresult.Get("lstRes")
			Accion="OK"
		End If
	End If
	CallSubDelayed3(Me,"CargaDatosWebServiceTransporte_Completed",Accion, lstRes)
End Sub



Sub btnActualizarInfoTracking_Click
	
	If txtNumExpedicion.Text="" Then
		Dim msa As Object = xui.MsgboxAsync("Introduce un número de expedición","Aviso")
		Wait For (msa) Msgbox_Result (Result As Int)
		Return
	Else
		'LimpiarDatosCabEnvio
		jamTableViewInfoTrackingEnvio.LimpiarTabla
		jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.Cursors.WAIT)
		Wait For (CargaCredenciales) complete (sResult As String)
		jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.Cursors.DEFAULT)
		If sResult<>"OK" Then Return
		
		jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.Cursors.WAIT)
		wait for (ActualizarInfoExpedicion("I519390002",txtNumExpedicion.Text)) complete (lstFases As List)
		jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.Cursors.DEFAULT)
		'LimpiarDatosCabEnvio
		jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.Cursors.WAIT)
		Dim rSub As ResumableSub=jamTableViewInfoTrackingEnvio.setdata(lstFases)
		Wait For (rSub) complete (mResultSetData As Map)
		jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.Cursors.DEFAULT)
		lstFases.Initialize
		If Not(mResultSetData.Get("FlagOK")) Then
			If ""<>mResultSetData.Get("msgError") Then
				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
				Wait For (msa) Msgbox_Result
				ExitApplication
			End If
			If ""<>mResultSetData.Get("msgAviso") Then
				If mResultSetData.Get("msgAviso")<>"La lista de datos está vacía." Then
					Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
					Wait For (msa) Msgbox_Result
				End If
			End If

		End If

	End If
End Sub

Sub ActualizarInfoExpedicion(Solicitante As String, NumExpedicion As String) As ResumableSub
	Dim lstFases As List
	lstFases.Initialize
	wait for (InfoExpedicionCorreosExpress(Solicitante, NumExpedicion)) complete (WSResponse As String)
	Log("WSResponse " & WSResponse)
	If WSResponse.StartsWith("Error carga credenciales") Then
		Dim msa As Object = xui.MsgboxAsync("No ha sido posible cargar los credenciales de acceso al web service de Correos Express","Aviso")
		Wait For (msa) Msgbox_Result (Result As Int)
		Return lstFases
	End If
	LimpiarDatosCabEnvio
	If WSResponse.StartsWith("ERROR de comunicacion :") Then
		' ha fallado la llamada al WebServer
		Return lstFases
	Else
		' Ha habido comunicacion con el WebServer. El string WSResponse será un XML.
		' Parsear el resultado del XML devuelto como respuesta
		Dim XMLRespLWebServer As Xml2Map
		XMLRespLWebServer.Initialize
		Dim WSResponseSinPrologo As String=WSResponse.SubString(WSResponse.IndexOf("<"))  ' para elimiar el prólogo ...
		Dim ParsedData As Map=XMLRespLWebServer.Parse(WSResponseSinPrologo)
		Dim mSegEnvio As Map=ParsedData.Get("SeguimientoEnviosResponse")
		Dim CodError As Int=mSegEnvio.Get("Error")
		If 0<>CodError Then
			' la respuesta contiene un error del web server
			Log("Mensaje de error: " & mSegEnvio.Get("MensajeError"))
			If CodError=402 Then
				Dim sMsgErr As String="No hay datos de envío para el número de expedición indicado (" & NumExpedicion & ")."
			Else
				Dim sMsgErr As String=mSegEnvio.Get("MensajeError")
			End If
			Dim msa As Object = xui.MsgboxAsync(sMsgErr,"Aviso")
			Wait For (msa) Msgbox_Result (Result As Int)
			Return lstFases
		Else
			' la respuesta es correcta
			#if debug
			For Each k As String In mSegEnvio.Keys
				If k<>"Attributes" And k<>"Error" And k<>"MensajeError" And k<>"EstadoEnvios" Then
					Log(k & ": " & mSegEnvio.Get(k))
				End If
			Next
			#end if
			txtNumExpedicion.Text=mSegEnvio.Get("NumEnvio")
			txtRef.Text=mSegEnvio.Get("Ref")
			txtFecha.Text=mSegEnvio.Get("Fecha")
			txtDirRte.Text=mSegEnvio.Get("DirRte")
			txtPobRte.Text=mSegEnvio.Get("PobRte")
			txtCodPosNacRte.Text=mSegEnvio.Get("CodPosNacRte")
			txtNomDest.Text=mSegEnvio.Get("NomDest")
			txtDirDest.Text=mSegEnvio.Get("DirDest")
			txtPobDest.Text=mSegEnvio.Get("PobDest")
			txtCodPosNacDest.Text=mSegEnvio.Get("CodPosNacDest")
			txtNumBultos.Text=mSegEnvio.Get("NumBultos")
			txtKilos.Text=mSegEnvio.Get("Kilos")
			txtVolumen.Text=mSegEnvio.Get("Volumen")
			txtCodIncEstado.Text=mSegEnvio.Get("CodIncEstado")
			txtDescIncEstado.Text=mSegEnvio.Get("DescIncEstado")

			'las fases de estado del envio están en una lista = EstadoEnvios
			Log("********* FASES DE ENVIO ********")
			Dim DateFormatOr As String=DateTime.DateFormat
			Dim TimeFormatOr As String=DateTime.TimeFormat
			DateTime.DateFormat="ddMMyyy"
			For Each mFasesEnvio As Map In GetElements(mSegEnvio, "EstadoEnvios")
				For Each k2 As String In mFasesEnvio.Keys
					Log(k2 & ": " & mFasesEnvio.Get(k2))
				Next
				Dim CodEstado As String=mFasesEnvio.Get("CodEstado")
				DateTime.DateFormat="ddMMyyyy"
				Dim FestL As Long=DateTime.DateParse(mFasesEnvio.Get("FechaEstado"))
				DateTime.DateFormat="dd/MM/yyyy"
				mFasesEnvio.put("FechaEstado",DateTime.Date(FestL))
				
				DateTime.TimeFormat="HHmmss"
				Dim TestL As Long=DateTime.TimeParse(mFasesEnvio.Get("HoraEstado"))
				DateTime.DateFormat="hh:mm:ss"
				mFasesEnvio.put("HoraEstado",DateTime.Date(TestL))
				
				Dim NombreEstadoEnvio As String
				Dim DescripcionEstadoEnvio As String
				For Each InfoEstado() As String In cmAuxCorreosExpress.lstEstadosCorreosExpress
					If InfoEstado(0)=CodEstado Then
						NombreEstadoEnvio=InfoEstado(1)
						DescripcionEstadoEnvio=InfoEstado(2)
						mFasesEnvio.Put("NombreEstadoEnvio",NombreEstadoEnvio)
						mFasesEnvio.Put("DescripcionEstadoEnvio",DescripcionEstadoEnvio)
						mFasesEnvio.Remove("DescEstado")
						Exit
					End If
					
				Next
				DateTime.DateFormat=DateFormatOr
				DateTime.TimeFormat=TimeFormatOr
				Log("map Fase " & mFasesEnvio)
				lstFases.Add(mFasesEnvio)
			Next
			Return lstFases
		End If
	End If

End Sub

Sub InfoExpedicionCorreosExpress(Solicitante As String, NumExpedicion As String) As ResumableSub
	
	' Primero parseamos la plantilla XML
	Dim xm As Xml2Map
	xm.Initialize
	Dim ParsedData As Map
	ParsedData = xm.Parse(File.ReadString(File.DirAssets, "PlantillaXLMCorreosSeguimientoEnvio.xml"))
	' Parsed data es un mapa que contiene la informacion del xml.
	' En este caso , contiene una unica clave: SeguimientoEnviosRequest
	Dim mSeguimientoEnviosRequest As Map=ParsedData.Get("SeguimientoEnviosRequest")
	' A su vez contiene un mapa con las claves que necesitamos.
	For Each k As String In mSeguimientoEnviosRequest.keys
		Log("k :" & k)
	Next
	
	' Después cambiamos los valores de los strings del mapa que define el XML
	
	mSeguimientoEnviosRequest.Put("Solicitante",Solicitante)
	mSeguimientoEnviosRequest.Put("Dato",NumExpedicion)  ' Ej: numero de expedicion. Puede ser también nuestra referencia

	' Despues pasar el mapa modificado a una string con el texto XML que vamos a pasar al web service
	
	Dim m2Xml As Map2Xml
	m2Xml.Initialize
	Dim sXML As String=m2Xml.MapToXml(ParsedData)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLCorreosExpress As String="https://www.correosexpress.com/wpsc/apiRestSeguimientoEnvios/rest/seguimientoEnvios"
	job.Username=UsuarioWS
	job.Password=PasswordWs
	job.PostString(URLCorreosExpress,sXML)
	'job.GetRequest.SetHeader("Content-Type","application/json")
	job.GetRequest.SetContentType("application/xml")
	'job.GetRequest.SetContentEncoding("UTF8")
	job.GetRequest.SetContentEncoding("UTF-8")

	Wait For (job) JobDone(j As HttpJob)
	If j.Success Then
		'Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		j.Release
		Return "ERROR de comunicacion con www.correosexpress.com webservice" & iif(LastException.IsInitialized,LastException.Message,"")
	End If
End Sub

'esta sub es necesaria para poder diferenciar correctamente cuando el XML devuelva 1 elemento (map) o varios elementos (list)
' con esta sub, SIEMPRE devolverá una lista
' ver https://www.b4x.com/android/forum/threads/b4x-xml2map-simple-way-to-parse-xml-documents.74848/
Sub GetElements (m As Map, key As String) As List
	Dim res As List
	If m.ContainsKey(key) = False Then
		res.Initialize
		Return res
	Else
		Dim value As Object = m.Get(key)
		If value Is List Then Return value
		res.Initialize
		res.Add(value)
		Return res
	End If
End Sub





Private Sub btnAlbaranNAV_Click
	Dim  PagNAVTipoDoc As Int
	Dim TituloVentana As String
	Dim Doc As String=txtRef.Text
	Select True
		Case Doc=""
			Dim msa As Object=xui.MsgboxAsync("No se ha indicado documento.","Aviso")
			Wait For (msa) Msgbox_Result
			Return
		Case Doc.StartsWith("ALBV")
			PagNAVTipoDoc=130
			TituloVentana="Histórico albaranes venta"
		Case Doc.StartsWith("RT")
			PagNAVTipoDoc=5745
			TituloVentana="Histórico recep. transferencia"
		Case Else
			Dim msa As Object=xui.MsgboxAsync("Sólo es posible navegar a documentos tipo ALBV o RT.","Aviso")
			Wait For (msa) Msgbox_Result
			Return
	End Select
	Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV(TituloVentana,PagNAVTipoDoc, "No.", Doc)
	wait for(rSub) complete (success As Boolean)
End Sub

