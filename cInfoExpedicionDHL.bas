B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private xui As XUI
	Private UsuarioWS As String
	Private PasswordWs As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub CargaCredenciales As ResumableSub
	
	Wait For(CargaDatosWebServiceTransporte(17)) complete (mRes As Map)   '17 es el IDTransporte en DatosComunes para CorreosExpress
	Dim accion As String=mRes.Get("Accion")
	If accion="NOK" Then
		Return "Error carga credenciales"
	End If
	Dim lstResWS As List=mRes.Get("lstRes")
	Dim mDatosWS As Map=lstResWS.Get(0)
	
	UsuarioWS=mDatosWS.get("UsuarioWS")
	PasswordWs=mDatosWS.get("PasswordWS")
	If UsuarioWS="" Or PasswordWs="" Then
		Return "Error carga credenciales"
	Else
		Return "OK"
	End If
End Sub

Sub CargaDatosWebServiceTransporte(IDTransportista As Int) As ResumableSub
	'DatosEnvioExpedicion.Initialize
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
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
			Dim lstRes As List=mresult.Get("lstRes")
			Accion="OK"
			mRes.Put("lstRes",lstRes)
		End If
	End If
	mRes.Put("Accion",Accion)
	Return mRes
End Sub

' se puede pasar el NumeroExpedicion o la Referencia
Sub ActualizarInfoExpedicionDHL(IDDatoBuscado As String)
	Dim AccionTracking As String
	Dim lstResultadoTracking As List
	lstResultadoTracking.Initialize

'	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.WAIT)
	Wait For(CargaDatosWebServiceTransporte(1)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
'	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.DEFAULT)
	If Accion="NOK" Then
		AccionTracking="ErrorWS"
		Dim msa As Object=xui.MsgboxAsync("Error credenciales DHL","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Dim lstRes As List=mRes.Get("lstRes")
	Dim mCred As Map=lstRes.Get(0)
	Dim CredUser As String=mCred.Get("UsuarioWS")
	Dim CredPswd As String=mCred.Get("PasswordWS")
	
	' comprobar si tenemos ya el token, y si éste no ha expirado
	Dim su As StringUtils
	Dim accessToken As String
	Dim Cookie As String
	Dim lstHeaders As List
	lstHeaders.Initialize
	lstHeaders.Add(Array As String("Expiration","Token","Cookie"))
	If File.Exists(Main.UserTempFolder,"info.csv") Then
		
		Dim lstToken As List=su.LoadCSV2(Main.UserTempFolder,"info.csv",",",lstHeaders)
		Dim DatosCSV() As String=lstToken.Get(0)
		Dim Expiration As Long=DatosCSV(0)
		If DateTime.Now<Expiration Then
			accessToken=DatosCSV(1)
			Cookie=DatosCSV(2)
		Else
			File.Delete(Main.UserTempFolder,"info.csv")
		End If
	End If
	
	If accessToken="" Then
		'jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.WAIT)
		Wait For(ObtenerTokensWebServiceDHL(CredUser,CredPswd)) complete (mJobResponse As Map)  ' HABRIA QUE BLOQUEAR TODOS LOS EVENTOS HASTA QUE LLEGUE (O FALLE) LA RESPUESTA, PARA IMPEDIR ACCIONES DEL USUARIO ...
		'Log("WSResponse " & sResponse)
		'jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.DEFAULT)
		Dim sResponse As String=mJobResponse.Get("sRespuestaWebService")
		If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
			AccionTracking="ErrorWS"
			Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web  service de DHL" & CRLF & CRLF & _
				"El error puede estar en el servidor de DHL, o en la conexion a internet. Inténtalo más tarde.","Error de comunicación")
			Wait For (msa) Msgbox_Result (Result As Int)
			Return
		Else   ' el web service de DHL ha respondido y la respuesta ha llegado. En el caso de la API de españa es 1 STRING (NO UN json)
			Dim Cookie As String=mJobResponse.Get("Cookie")
			Log("Cookie " & Cookie)

			Dim accessToken As String=mJobResponse.Get("Token")
			Log("accessToken " & accessToken)
			'el token expira en 30 minutos. Ponemos 20, para tener un margen de seguridad
		
			Dim Expiration As Long=DateTime.Now+(DateTime.TicksPerMinute)*20
			Dim lstRegistros As List
			lstRegistros.Initialize
			lstRegistros.Add(Array As String(Expiration,accessToken,Cookie))
			su.SaveCSV2(Main.UserTempFolder,"info.csv",",",lstRegistros,Array As String("Expiration","Token","Cookie"))
		End If
	End If
	
'	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.WAIT)
	Wait For (EnvioDatosWebServiceDHL(IDDatoBuscado,accessToken)) complete (sResponse As String)
'	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.DEFAULT)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		AccionTracking="ErrorWS"
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de DHL."  & CRLF & CRLF & sResponse,"Error de comunicación")
		Wait For (msa) Msgbox_Result (Result As Int)
		
	Else   ' el web service de  DHL ha respondido y la respuesta ha llegado
		Dim jp As JSONParser
		jp.Initialize(sResponse)
		lstResultadoTracking=jp.NextArray
		'Log(lstWSResponse)
		Dim DateFormatAnt As String=DateTime.DateFormat
		Dim TimeFormatAnt As String=DateTime.TimeFormat
		DateTime.DateFormat="yyyy-MM-dd"
		DateTime.TimeFormat="HH-mm-ss"
		For Each m As Map In lstResultadoTracking
			Log("m recibido" & m)
			Dim sFechaHora As String=m.Get("DateTime")
			sFechaHora=sFechaHora.Replace("T"," ")
			Dim Fh() As String=Regex.Split(" ",sFechaHora)
			Dim lFechaHora As Long=DateTime.DateTimeParse(Fh(0),Fh(1))
			DateTime.DateFormat="dd/MM/yyyy"
			sFechaHora=DateTime.Date(lFechaHora) & " " & DateTime.Time(lFechaHora)
			Log("m modificado " & m)
		Next
		DateTime.DateFormat=DateFormatAnt
		DateTime.TimeFormat=TimeFormatAnt
	End If
	CallSubDelayed3(Me,"ActualizarInfoExpedicionDHL_Completed",AccionTracking, lstResultadoTracking)
	
End Sub



Sub EnvioDatosWebServiceDHL(IDDatoEnvioBuscado As String, Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)

	Dim URLDhlTrackTrace As String="https://external.dhl.es/cimapi/api/v1/customer/track?id=" & IDDatoEnvioBuscado & "&idioma=es"
	job.Download(URLDhlTrackTrace)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	If Cookie="null" Then
'		job.GetRequest.SetHeader("Cookie", "BIGipServerpl_external.dhl.es_443=2214595586.47873.0000")
'	Else
'		job.GetRequest.SetHeader("Cookie", Cookie)
'	End If
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
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


Sub ObtenerTokensWebServiceDHL(CredenU As String, CredenPswd As String) As ResumableSub
	
	Dim mTokenJSON As Map
	mTokenJSON.Initialize
	
	'mTokenJSON.Put("Username","50002470PROIN")
	mTokenJSON.Put("Username",CredenU)
	'mTokenJSON.Put("Password","85a11d2a-022f-428b-9ac6-c21dca772656")
	mTokenJSON.Put("Password",CredenPswd)
	
	Dim jp As JSONGenerator
	jp.Initialize(mTokenJSON)
	Dim TokenJSONstring As String
	TokenJSONstring=jp.ToString
	
	Dim job As HttpJob
	job.Initialize("",Me)

	
	Dim AccessTokenURL As String="https://external.dhl.es/cimapi/api/v1/customer/authenticate"
	job.PostString(AccessTokenURL, TokenJSONstring)
	job.GetRequest.SetHeader("accept","application/json")
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)
	Dim mJobResponse As Map
	mJobResponse.Initialize
	If j.Success Then   ' la API de españa devuelve 1 string (el toekn, o
		'Log(j.GetString)
		Dim sRespuestaWebService As String=j.getstring
		Dim resp As OkHttpResponse = job.Response
		Dim headers As Map  = resp.GetHeaders
		For Each key As String In headers.Keys
			Log($"Header: ${key} = ${headers.Get(key)}"$)
		Next
		'Log("job.tag " & j.Tag)
		Dim sCookie As String=resp.GetHeaders.Get("set-cookie")
		sCookie=sCookie.Replace("[","").Replace("]","")
		Dim CookieComponents() As String =Regex.Split(";",sCookie)
		Dim Cookie As String= CookieComponents(0)
		Log("set-cookie " & Cookie)
		j.Release
		mJobResponse.Put("sRespuestaWebService",sRespuestaWebService)
		mJobResponse.Put("Cookie",Cookie)
		mJobResponse.Put("Token",sRespuestaWebService.Replace(QUOTE,""))
		'Return mJobResponse
	Else
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		mJobResponse.Put("sRespuestaWebService",sErrorJobResponse)
		mJobResponse.Put("Cookie","")
		mJobResponse.Put("Token","")
		'Return sErrorJobResponse
	End If
	Return mJobResponse
End Sub