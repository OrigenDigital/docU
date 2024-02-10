B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=9.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	'Private fx As JFX
	Private xui As XUI
	Private UserTXT, PswTXT, TokenWebTXT As String
	Private CodigoClienteTXT As Int=66441
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


Sub CargaDatosWebServiceTransporte(IDTransportista As Int) As ResumableSub
	'DatosEnvioExpedicion.Initialize
	Dim Accion As String
	Dim lstRes As List
	lstRes.Initialize
	Dim ComandoJRDC As String
	ComandoJRDC="DatosWebServiceTransporte"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes, ComandoJRDC, Array As String(IDTransportista), Me)
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
	Dim mRes As Map
	mRes.Initialize
	mRes.put("Accion",Accion)
	mRes.put("lstRes",lstRes)
	Return mRes
	'CallSubDelayed3(Me,"CargaDatosWebServiceTransporte_Completed",Accion, lstRes)
End Sub

Sub CargaCredencialesTXT As ResumableSub
	Dim CodigoTransportista As Int=7
	'Dim CodigoClienteTXT As Int=66441

	wait for (CargaDatosWebServiceTransporte(CodigoTransportista)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		Dim msa As Object=xui.MsgboxAsync("Error credenciales TXT","Error")
		Wait For (msa) Msgbox_Result
		Return "NOK"
	End If
	Dim lstRes As List=mRes.Get("lstRes")
	Dim mCred As Map=lstRes.Get(0)
	UserTXT=mCred.Get("UsuarioWS")
	PswTXT=mCred.Get("PasswordWS")
	
	TokenWebTXT=mCred.Get("TokenWeb")
	Return "OK"
End Sub



Sub ObtenerURLTrazabilidadExpedicionTXT(NumExpedicion As String) As ResumableSub
	
	Dim Accion As String
	Dim URL As String
	Dim mRes As Map
	mRes.Initialize
	
	If NumExpedicion.Length<23 Then
		Dim msa As Object = xui.MsgboxAsync("El número de expedición es erróneo, revisar.","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion","NOK")
		Return mRes
	End If
	
'	Dim msa As Object = xui.MsgboxAsync("prueba mensaje desde módulo código.","Error")
'	Wait For (msa) Msgbox_Result (Result As Int)
	

	
	wait for(CargaCredencialesTXT) complete (sResp As String)
	If sResp="NOK" Then
		mRes.Put("Accion","NOK")
		Return mRes
	End If

	Dim CodOrigen As String=NumExpedicion.SubString2(3,6)
	Dim CodDestino As String=NumExpedicion.SubString2(6,9)
	Dim Nexped1 As Int=NumExpedicion.SubString2(9,12)
	Dim Nexped2 As String=NumExpedicion.SubString2(12,19)
	Dim Ano As String=NumExpedicion.SubString2(19,23)
	Wait For(EnvioDatosWebServiceURLTrackingTxT(CodigoClienteTXT,UserTXT,PswTXT,TokenWebTXT,CodOrigen,CodDestino,Nexped1,Nexped2,Ano)) complete (sResponse As String)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		Accion="NOK"
'		URL="Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse & ".","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion",Accion)
		mRes.Put("URL",URL)

		Return mRes
	End If

	Log("sresponse URLTRacking")
	Log("")
	Log(sResponse)

	Dim xm As Xml2Map
	xm.Initialize
	Dim mParsedData As Map
	mParsedData = xm.Parse(sResponse)  '
'	Log("mParsedData " & mParsedData)
'	
'	For Each k As String In mParsedData.Keys
'		Log("kPD: " & k)
'	Next
	Dim mEnvelope As Map=mParsedData.get("soap:Envelope")
'	For Each k As String In mEnvelope.Keys
'		Log("kEnv: " & k)
'	Next
	Dim mBody As Map=mEnvelope.get("soap:Body")
'	For Each k As String In mBody.Keys
'		Log("kBody: " & k)
'	Next
	Dim mURLTrackingResponse As Map=mBody.Get("UrlTrackingResponse")
'	For Each k As String In mURLTrackingResponse.Keys
'		Log("mURLTrackingResponse: " & k & ": " & mURLTrackingResponse.Get(k))
'	Next
	Dim URLTrackingResult As String=mURLTrackingResponse.Get("UrlTrackingResult")
	mRes.Put("Accion","OK")
	mRes.Put("URL",URLTrackingResult)

	Return mRes

	
End Sub

public Sub EnvioDatosWebServiceURLTrackingTxT(CodCliente As String, User As String, Pwd As String, TokenWeb As String, _
		CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As String, Ano As String) As ResumableSub
	
	Dim xml As String=XmlSoapURLTrackingTxT("001",CodCliente,User,Pwd,TokenWeb, _
		CodOrigen, CodDestino,Nexped1,Nexped2,Ano)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLWebServiceTXT As String="http://ws.txt.es/webserviceTXT.asmx"
	job.PostString(URLWebServiceTXT, xml)
	job.GetRequest.SetContentType("application/soap+xml")
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

Sub XmlSoapURLTrackingTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String, _
		CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Long, Ano As String) As String
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
	<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
	<soap12:Header>
	<cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>${CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
	</cLoginCredential>
	</soap12:Header>
	<soap12:Body>
	<UrlTracking xmlns="https://ws.txt.es/webserviceTXT.asmx">
	<CodEmpresa>${CodEmpresa}</CodEmpresa>
	<CodOrigen>${CodOrigen}</CodOrigen>
	<CodDestin>${CodDestino}</CodDestin>
	<Nexped1>$1.0{Nexped1}</Nexped1>
	<Nexped2>${Nexped2}</Nexped2>
	<Ano>${Ano}</Ano>
	</UrlTracking>
	</soap12:Body>
	</soap12:Envelope>"$
	Return xlmStr
End Sub

public Sub ObtenerExpedicionesSinEntregarTXT As ResumableSub
	
'	Dim msa As Object = xui.MsgboxAsync("prueba mensaje desde módulo código.","Error")
'	Wait For (msa) Msgbox_Result (Result As Int)
	
	Dim Accion As String
	Dim URL As String
	Dim mRes As Map
	mRes.Initialize
	
	wait for(CargaCredencialesTXT) complete (sResp As String)
	If sResp="NOK" Then
		mRes.Put("Accion","NOK")
		Return mRes
	End If

	Wait For(EnvioDatosWebServiceExpedicionesSinEntregarTxT(CodigoClienteTXT,UserTXT,PswTXT,TokenWebTXT)) complete (sResponse As String)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		Accion="NOK"

'		URL="Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse & ".","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion",Accion)
		mRes.Put("URL",URL)

		Return mRes
	End If
	
	' el web service de  DHL ha respondido y la respuesta ha llegado
'	Dim jp As JSONParser
'	jp.Initialize(sResponse)
'	lstResultadoTracking=jp.NextArray

	Log("sresponse Expediciones Sin Entregar")
	Log("")
	Log(sResponse)
	
	Dim lstDatosExpediciones As List
	lstDatosExpediciones.Initialize

	Dim xm As Xml2Map
	xm.Initialize
	Dim mParsedData As Map
	mParsedData = xm.Parse(sResponse)  '
'	Log("mParsedData " & mParsedData)
'	
'	For Each k As String In mParsedData.Keys
'		Log("kPD: " & k)
'	Next
	Dim mEnvelope As Map=mParsedData.get("soap:Envelope")
'	For Each k As String In mEnvelope.Keys
'		Log("kEnv: " & k)
'	Next
	Dim mBody As Map=mEnvelope.get("soap:Body")
'	For Each k As String In mBody.Keys
'		Log("kBody: " & k)
'	Next
	Dim mExpedicionesSinEntregarResponse As Map=mBody.Get("ExpedicionesSinEntregarResponse")
	For Each k As String In mExpedicionesSinEntregarResponse.Keys
		Log("mExpedicionesSinEntregarResponse: " & k & ": " & mExpedicionesSinEntregarResponse.Get(k))
	Next
	If mExpedicionesSinEntregarResponse.ContainsKey("ExpedicionesSinEntregarResult") Then
		Dim mExpedicionesSinEntregarResult As Map=mExpedicionesSinEntregarResponse.Get("ExpedicionesSinEntregarResult")
		For Each k As String In mExpedicionesSinEntregarResult.Keys
			Log("mExpedicionesSinEntregarResult: " & k & ": " & mExpedicionesSinEntregarResult.Get(k))
		Next

		Dim mDiffgram As Map=mExpedicionesSinEntregarResult.get("diffgr:diffgram")
		'Log("mDiffgram: "  & mDiffgram)
		If mDiffgram.ContainsKey("EXPEDICIONES")=False Then
			Log("Sin Expediciones pendientes")
		Else
			Dim mExpediciones As Map=mDiffgram.get("EXPEDICIONES")
			Log("Hay Expediciones pendientes")
			'	Dim lstExpediciones As List=GetElements(mDiffgram,"EXPEDICIONES")
			'	For Each m As Map  In lstExpediciones
			'		Log("m: " & m)
			'	Next
	
'		For Each k As String In mExpediciones.Keys
'			Log("k: " & k)
'		Next

			lstDatosExpediciones=GetElements(mExpediciones,"EXPEDICIONES")
		End If
	End If
	
	Accion="OK"

	mRes.Put("Accion",Accion)
	mRes.Put("lstRes",lstDatosExpediciones)
	Return mRes

	
End Sub

public Sub EnvioDatosWebServiceExpedicionesSinEntregarTxT(CodCliente As String, User As String, Pwd As String, TokenWeb As String) As ResumableSub
	
	Dim xml As String=XmlSoapExpedicionesSinEntregarTxT("001",CodCliente,User,Pwd,TokenWeb)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLWebServiceTXT As String="http://ws.txt.es/webserviceTXT.asmx"
	job.PostString(URLWebServiceTXT, xml)
	job.GetRequest.SetContentType("application/soap+xml")
	job.GetRequest.Timeout=30000

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

Sub XmlSoapExpedicionesSinEntregarTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String) As String
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Header>
	<cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>${CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
	</cLoginCredential>
  </soap12:Header>
  <soap12:Body>
    <ExpedicionesSinEntregar xmlns="https://ws.txt.es/webserviceTXT.asmx" />
  </soap12:Body>
</soap12:Envelope>"$
	Return xlmStr
End Sub

'Sub XmlSoapExpedicionesSinEntregarTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String) As String
'	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
'<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
'  <soap12:Header>
'	<cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
'      <CodEmpresa>${CodEmpresa}</CodEmpresa>
'      <CodCliente>${CodCliente}</CodCliente>
'      <Usuario>${Usuario}</Usuario>
'      <Password>${Passw}</Password>
'      <Token>${TokenWeb}</Token>
'	</cLoginCredential>
'  </soap12:Header>
'  <soap12:Body>
'    <ExpedicionesSinEntregar xmlns="https://ws.txt.es/webserviceTXT.asmx" />
'  </soap12:Body>
'</soap12:Envelope>"$
'	Return xlmStr
'End Sub


Public Sub ObtenerEstadoExpedicionTXT(CodOrigen As String, CodDestino As String,  Nexped1 As Int, Nexped2 As Int, Ano As String) As ResumableSub

	Dim Accion As String
	Dim URL As String
	Dim mRes As Map
	mRes.Initialize
	
	wait for(CargaCredencialesTXT) complete (sResp As String)
	If sResp="NOK" Then
		mRes.Put("Accion","NOK")
		Return mRes
	End If

'	Dim CodOrigen As String=NumExpedicion.SubString2(3,6)
'	Dim CodDestino As String=NumExpedicion.SubString2(6,9)
'	Dim Nexped1 As Int=NumExpedicion.SubString2(9,12)
'	Dim Nexped2 As Int=NumExpedicion.SubString2(12,19)
'	Dim Ano As String=NumExpedicion.SubString2(19,23)
	Wait For(EnvioDatosWebServiceBuscarEstadoExpedicionTxT(CodigoClienteTXT,UserTXT,PswTXT,TokenWebTXT,CodOrigen,CodDestino,Nexped1,Nexped2,Ano)) complete (sResponse As String)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		Accion="NOK"
'		URL="Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de TXT solicitando BuscarEstadoExpedicionTxT."  & CRLF & CRLF & sResponse & ".","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion",Accion)
		mRes.Put("URL",URL)

		Return mRes
	End If
	
	' el web service de  DHL ha respondido y la respuesta ha llegado
'	Dim jp As JSONParser
'	jp.Initialize(sResponse)
'	lstResultadoTracking=jp.NextArray

	Log("sresponse BuscarEstadoExpedicion")
	Log("")
	Log(sResponse)

	Dim xm As Xml2Map
	xm.Initialize
	Dim mParsedData As Map
	mParsedData = xm.Parse(sResponse)  '
'	Log("mParsedData " & mParsedData)
'	
'	For Each k As String In mParsedData.Keys
'		Log("kPD: " & k)
'	Next
	Dim mEnvelope As Map=mParsedData.get("soap:Envelope")
'	For Each k As String In mEnvelope.Keys
'		Log("kEnv: " & k)
'	Next
	Dim mBody As Map=mEnvelope.get("soap:Body")
'	For Each k As String In mBody.Keys
'		Log("kBody: " & k)
'	Next
	Dim mBuscarEstadoResponse As Map=mBody.Get("BuscarEstadoResponse")
'	For Each k As String In mURLTrackingResponse.Keys
'		Log("mURLTrackingResponse: " & k & ": " & mURLTrackingResponse.Get(k))
'	Next
	Dim mBuscarEstadoResult As Map=mBuscarEstadoResponse.Get("BuscarEstadoResult")
'	For Each k As String In mBuscarEstadoResult.Keys
'		Log("mBuscarEstadoResult: " & k & ": " & mBuscarEstadoResult.Get(k))
'	Next
	
	Dim mDiffgram As Map=mBuscarEstadoResult.get("diffgr:diffgram")
	'Log("mDiffgram: "  & mDiffgram)
	Dim mEstados As Map=mDiffgram.Get("ESTADO")

	If mEstados.IsInitialized=False Then  ' no datos de estados para la expedicion
		Dim lstDatosEstadosExpedicion As List
		lstDatosEstadosExpedicion.Initialize
		Dim msa As Object = xui.MsgboxAsync("No hay datos de estados para la expedicion seleccionada (" & CodOrigen & CodDestino & Nexped1 & Nexped2 & Ano & ") .","Aviso")
		Wait For (msa) Msgbox_Result (Result As Int)
		Accion="NOK"
	Else
		Dim lstDatosEstadosExpedicion As List=GetElements(mEstados,"ESTADO")
		Accion="OK"
	End If

	mRes.Put("Accion",Accion)
	mRes.Put("lstRes",lstDatosEstadosExpedicion)
	Return mRes

End Sub

public Sub EnvioDatosWebServiceBuscarEstadoExpedicionTxT(CodCliente As String, User As String, Pwd As String, TokenWeb As String, _
		CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Int, Ano As String) As ResumableSub
	
	Dim xml As String=XmlSoapBuscarEstadoExpedicionTxT("001",CodCliente,User,Pwd,TokenWeb, _
		CodOrigen, CodDestino,Nexped1,Nexped2,Ano)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLWebServiceTXT As String="http://ws.txt.es/webserviceTXT.asmx"
	job.PostString(URLWebServiceTXT, xml)
	job.GetRequest.SetContentType("application/soap+xml")
	job.GetRequest.Timeout=30000

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

Sub XmlSoapBuscarEstadoExpedicionTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String, _
	CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Int, Ano As String) As String 
	
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Header>
	<cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>${CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
	</cLoginCredential>
  </soap12:Header>
  <soap12:Body>
    <BuscarEstado xmlns="https://ws.txt.es/webserviceTXT.asmx">
		<CodEmpresa>${CodEmpresa}</CodEmpresa>
		<CodOrigen>${CodOrigen}</CodOrigen>
		<CodDestin>${CodDestino}</CodDestin>
		<Nexped1>$1.0{Nexped1}</Nexped1>
		<Nexped2>${Nexped2}</Nexped2>
		<Ano>${Ano}</Ano>
    </BuscarEstado>
  </soap12:Body>
</soap12:Envelope>"$
	Return xlmStr
End Sub




Public Sub ObtenerHistoricoEstadosExpedicionTXT(CodOrigen As String, CodDestino As String,  Nexped1 As Int, Nexped2 As Int, Ano As String) As ResumableSub

	Dim Accion As String
	Dim URL As String
	Dim mRes As Map
	mRes.Initialize
	
	wait for(CargaCredencialesTXT) complete (sResp As String)
	If sResp="NOK" Then
		mRes.Put("Accion","NOK")
		Return mRes
	End If

'	Dim CodOrigen As String=NumExpedicion.SubString2(3,6)
'	Dim CodDestino As String=NumExpedicion.SubString2(6,9)
'	Dim Nexped1 As Int=NumExpedicion.SubString2(9,12)
'	Dim Nexped2 As Int=NumExpedicion.SubString2(12,19)
'	Dim Ano As String=NumExpedicion.SubString2(19,23)
	Wait For(EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT(CodigoClienteTXT,UserTXT,PswTXT,TokenWebTXT,CodOrigen,CodDestino,Nexped1,Nexped2,Ano)) complete (sResponse As String)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		Accion="NOK"
'		URL="Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse & ".","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion",Accion)
		mRes.Put("URL",URL)

		Return mRes
	End If
	
	' el web service de  DHL ha respondido y la respuesta ha llegado
'	Dim jp As JSONParser
'	jp.Initialize(sResponse)
'	lstResultadoTracking=jp.NextArray

	Log("sresponse BuscarHistoricoEstados")
	Log("")
	Log(sResponse)

	Dim xm As Xml2Map
	xm.Initialize
	Dim mParsedData As Map
	mParsedData = xm.Parse(sResponse)  '
'	Log("mParsedData " & mParsedData)
'	
'	For Each k As String In mParsedData.Keys
'		Log("kPD: " & k)
'	Next
	Dim mEnvelope As Map=mParsedData.get("soap:Envelope")
'	For Each k As String In mEnvelope.Keys
'		Log("kEnv: " & k)
'	Next
	Dim mBody As Map=mEnvelope.get("soap:Body")
'	For Each k As String In mBody.Keys
'		Log("kBody: " & k)
'	Next
	Dim mBuscarHistoricoEstadosResponse As Map=mBody.Get("BuscarHistoricoEstadosResponse")
'	For Each k As String In mURLTrackingResponse.Keys
'		Log("mURLTrackingResponse: " & k & ": " & mURLTrackingResponse.Get(k))
'	Next
	Dim mBuscarHistoricoEstadosResult As Map=mBuscarHistoricoEstadosResponse.Get("BuscarHistoricoEstadosResult")
'	For Each k As String In mBuscarEstadoResult.Keys
'		Log("mBuscarEstadoResult: " & k & ": " & mBuscarEstadoResult.Get(k))
'	Next
	
	Dim mDiffgram As Map=mBuscarHistoricoEstadosResult.get("diffgr:diffgram")
	'Log("mDiffgram: "  & mDiffgram)
	Dim mEstados As Map=mDiffgram.Get("ESTADO")

	If mEstados.IsInitialized=False Then  ' no datos de estados para la expedicion
		Dim lstDatosEstadosExpedicion As List
		lstDatosEstadosExpedicion.Initialize
		Dim msa As Object = xui.MsgboxAsync("No hay datos de estados para la expedicion seleccionada.","Aviso")
		Wait For (msa) Msgbox_Result (Result As Int)
		Accion="NOK"
	Else
		Dim lstDatosEstadosExpedicion As List=GetElements(mEstados,"ESTADO")
		Accion="OK"
	End If

	mRes.Put("Accion",Accion)
	mRes.Put("lstRes",lstDatosEstadosExpedicion)
	Return mRes

End Sub

public Sub EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT(CodCliente As String, User As String, Pwd As String, TokenWeb As String, _
		CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Int, Ano As String) As ResumableSub
	
	Dim xml As String=XmlSoapBuscarHistoricoEstadosExpedicionTxT("001",CodCliente,User,Pwd,TokenWeb, _
		CodOrigen, CodDestino,Nexped1,Nexped2,Ano)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLWebServiceTXT As String="http://ws.txt.es/webserviceTXT.asmx"
	job.PostString(URLWebServiceTXT, xml)
	job.GetRequest.SetContentType("application/soap+xml")
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

Sub XmlSoapBuscarHistoricoEstadosExpedicionTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String, _
	CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Int, Ano As String) As String 
	
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Header>
	<cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>${CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
	</cLoginCredential>
  </soap12:Header>
  <soap12:Body>
    <BuscarHistoricoEstados xmlns="https://ws.txt.es/webserviceTXT.asmx">
		<CodEmpresa>${CodEmpresa}</CodEmpresa>
		<CodOrigen>${CodOrigen}</CodOrigen>
		<CodDestin>${CodDestino}</CodDestin>
		<Nexped1>$1.0{Nexped1}</Nexped1>
		<Nexped2>${Nexped2}</Nexped2>
		<Ano>${Ano}</Ano>
    </BuscarHistoricoEstados>
  </soap12:Body>
</soap12:Envelope>"$
	Return xlmStr
End Sub


Public Sub ObtenerConsultaIncidenciasExpedicionTXT(CodOrigen As String, CodDestino As String,  Nexped1 As Int, Nexped2 As Int, Ano As String) As ResumableSub

	Dim Accion As String
	Dim URL As String
	Dim mRes As Map
	mRes.Initialize
	
	wait for(CargaCredencialesTXT) complete (sResp As String)
	If sResp="NOK" Then
		mRes.Put("Accion","NOK")
		Return mRes
	End If

'	Dim CodOrigen As String=NumExpedicion.SubString2(3,6)
'	Dim CodDestino As String=NumExpedicion.SubString2(6,9)
'	Dim Nexped1 As Int=NumExpedicion.SubString2(9,12)
'	Dim Nexped2 As Int=NumExpedicion.SubString2(12,19)
'	Dim Ano As String=NumExpedicion.SubString2(19,23)
	Wait For(EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT(CodigoClienteTXT,UserTXT,PswTXT,TokenWebTXT,CodOrigen,CodDestino,Nexped1,Nexped2,Ano)) complete (sResponse As String)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		Accion="NOK"
'		URL="Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse & ".","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion",Accion)
		mRes.Put("URL",URL)

		Return mRes
	End If
	
	' el web service de  DHL ha respondido y la respuesta ha llegado
'	Dim jp As JSONParser
'	jp.Initialize(sResponse)
'	lstResultadoTracking=jp.NextArray

	Log("sresponse ConsultaIncidencias")
	Log("")
	Log(sResponse)

	Dim xm As Xml2Map
	xm.Initialize
	Dim mParsedData As Map
	mParsedData = xm.Parse(sResponse)  '
'	Log("mParsedData " & mParsedData)
'	
'	For Each k As String In mParsedData.Keys
'		Log("kPD: " & k)
'	Next
	Dim mEnvelope As Map=mParsedData.get("soap:Envelope")
'	For Each k As String In mEnvelope.Keys
'		Log("kEnv: " & k)
'	Next
	Dim mBody As Map=mEnvelope.get("soap:Body")
'	For Each k As String In mBody.Keys
'		Log("kBody: " & k)
'	Next
	Dim mConsultaIncidenciasResponse  As Map=mBody.Get("ConsultaIncidenciasResponse")
'	For Each k As String In mURLTrackingResponse.Keys
'		Log("mURLTrackingResponse: " & k & ": " & mURLTrackingResponse.Get(k))
'	Next
	Dim mConsultaIncidenciasResult As Map=mConsultaIncidenciasResponse.Get("ConsultaIncidenciasResult")
'	For Each k As String In mBuscarEstadoResult.Keys
'		Log("mBuscarEstadoResult: " & k & ": " & mBuscarEstadoResult.Get(k))
'	Next
'	Dim objDiffgram As Object=mConsultaIncidenciasResult.get("diffgr:diffgram")
'	If objDiffgram Is String Then
'		Accion="Sin Incidencias"
'		mRes.Put("Accion",Accion)
'		Return mRes
'	End If
	Dim mDiffgram As Map=mConsultaIncidenciasResult.get("diffgr:diffgram")
	'Log("mDiffgram: "  & mDiffgram)
	If mDiffgram.ContainsKey("Incidencias")=False Then
		Dim lstDatosIncidenciasExpedicion As List
		lstDatosIncidenciasExpedicion.Initialize
		Dim msa As Object = xui.MsgboxAsync("No hay datos de incidencias para la expedicion seleccionada.","Aviso")
		Wait For (msa) Msgbox_Result (Result As Int)
		Accion="NOK"
	Else
		Dim mIncidencias As Map=mDiffgram.Get("Incidencias")
		Dim lstDatosIncidenciasExpedicion As List=GetElements(mIncidencias,"Incidencias")
		Accion="OK"
	End If

	mRes.Put("Accion",Accion)
	mRes.Put("lstRes",lstDatosIncidenciasExpedicion)
	Return mRes

End Sub

public Sub EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT(CodCliente As String, User As String, Pwd As String, TokenWeb As String, _
		CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Int, Ano As String) As ResumableSub
	
	Dim xml As String=XmlSoapConsultaIncidenciasExpedicionTxT("001",CodCliente,User,Pwd,TokenWeb, _
		CodOrigen, CodDestino,Nexped1,Nexped2,Ano)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLWebServiceTXT As String="http://ws.txt.es/webserviceTXT.asmx"
	job.PostString(URLWebServiceTXT, xml)
	job.GetRequest.SetContentType("application/soap+xml")
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

Sub XmlSoapConsultaIncidenciasExpedicionTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String, _
	CodOrigen As String, CodDestino As String, Nexped1 As Int, Nexped2 As Int, Ano As String) As String 
	
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Body>
    <ConsultaIncidencias xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>${CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
      <CodOrigen>${CodOrigen}</CodOrigen>
      <CodDestin>${CodDestino}</CodDestin>
      <Nexped1>$1.0{Nexped1}</Nexped1>
      <Nexped2>${Nexped2}</Nexped2>
      <Ano>${Ano}</Ano>
    </ConsultaIncidencias>
  </soap12:Body>
</soap12:Envelope>"$
	Return xlmStr
End Sub


public Sub ObtenerBuscarExpedicionesPeriodoTXT(FechaDesde As String, FechaHasta As String) As ResumableSub
	
'	Dim msa As Object = xui.MsgboxAsync("prueba mensaje desde módulo código.","Error")
'	Wait For (msa) Msgbox_Result (Result As Int)
	
	Dim Accion As String
	Dim URL As String
	Dim mRes As Map
	mRes.Initialize
	
	wait for(CargaCredencialesTXT) complete (sResp As String)
	If sResp="NOK" Then
		mRes.Put("Accion","NOK")
		Return mRes
	End If

	Wait For(EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT(CodigoClienteTXT,UserTXT,PswTXT,TokenWebTXT, FechaDesde, FechaHasta)) complete (sResponse As String)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		Accion="NOK"
'		URL="Ha fallado la llamada al web service de TXT solicitando URL Tracking."  & CRLF & CRLF & sResponse
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de TXT solicitando BuscarExpediciones."  & CRLF & CRLF & sResponse & ".","Error")
		Wait For (msa) Msgbox_Result (Result As Int)
		mRes.Put("Accion",Accion)
		mRes.Put("URL",URL)

		Return mRes
	End If
	
	' el web service de  DHL ha respondido y la respuesta ha llegado
'	Dim jp As JSONParser
'	jp.Initialize(sResponse)
'	lstResultadoTracking=jp.NextArray

	Log("sresponse BuscarExpediciones")
	Log("")
	Log(sResponse)

	Dim xm As Xml2Map
	xm.Initialize
	Dim mParsedData As Map
	mParsedData = xm.Parse(sResponse)  '
'	Log("mParsedData " & mParsedData)
'	
'	For Each k As String In mParsedData.Keys
'		Log("kPD: " & k)
'	Next
	Dim mEnvelope As Map=mParsedData.get("soap:Envelope")
'	For Each k As String In mEnvelope.Keys
'		Log("kEnv: " & k)
'	Next
	Dim mBody As Map=mEnvelope.get("soap:Body")
'	For Each k As String In mBody.Keys
'		Log("kBody: " & k)
'	Next
	Dim mBuscarExpedicionesResponse As Map=mBody.Get("BuscarExpedicionesResponse")
'	For Each k As String In mURLTrackingResponse.Keys
'		Log("mURLTrackingResponse: " & k & ": " & mURLTrackingResponse.Get(k))
'	Next
	Dim mBuscarExpedicionesResult As Map=mBuscarExpedicionesResponse.Get("BuscarExpedicionesResult")
'	For Each k As String In mExpedicionesSinEntregarResult.Keys
'		Log("mExpedicionesSinEntregarResult: " & k & ": " & mExpedicionesSinEntregarResult.Get(k))
'	Next

''	Dim objDiffgram As Object=mBuscarExpedicionesResult.get("diffgr:diffgram")
''	If objDiffgram Is String Then
''		Accion="Sin Expediciones sin entregar"
''		mRes.Put("Accion",Accion)
''		Return mRes
''	End If
	Dim mDiffgram As Map=mBuscarExpedicionesResult.get("diffgr:diffgram")
	'Log("mDiffgram: "  & mDiffgram)
	If mDiffgram.ContainsKey("Expediciones") Then
		Dim mExpediciones As Map=mDiffgram.Get("Expediciones")
		Dim lstDatosExpediciones As List=GetElements(mExpediciones,"Expediciones")
	Else
		Dim lstDatosExpediciones As List
		lstDatosExpediciones.Initialize
	End If
	Accion="OK"
	
	For Each m As Map In lstDatosExpediciones
		Dim Ref1 As String=m.Get("Referencia_x0020_1")
		If Ref1="{Attributes={xml:space=preserve}, Text= }" Then m.Put("Referencia_x0020_1","")
	Next
	
	

	mRes.Put("Accion",Accion)
	mRes.Put("lstRes",lstDatosExpediciones)
	Return mRes

	
End Sub

public Sub EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT(CodCliente As String, User As String, Pwd As String, TokenWeb As String, _
		FechaDesde As String, FechaHasta As String) As ResumableSub
	
	Dim xml As String=XmlSoapBuscarExpedicionesPeriodoTxT("001",CodCliente,User,Pwd,TokenWeb, _
		FechaDesde,FechaHasta)

	Dim job As HttpJob
	job.Initialize("",Me)
	Dim URLWebServiceTXT As String="http://ws.txt.es/webserviceTXT.asmx"
	job.PostString(URLWebServiceTXT, xml)
	job.GetRequest.SetContentType("application/soap+xml")
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

Sub XmlSoapBuscarExpedicionesPeriodoTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String, _
	FechaDesde As String, FechaHasta As String) As String 
	
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Header>
	<cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>${CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
	</cLoginCredential>
  </soap12:Header>
  <soap12:Body>
    <BuscarExpediciones xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <FechaDesde>${FechaDesde}</FechaDesde>
      <FechaHasta>${FechaHasta}</FechaHasta>
    </BuscarExpediciones>
  </soap12:Body>
</soap12:Envelope>"$
	Return xlmStr
End Sub



Sub XmlSoapExpediciones_IncidenciasExpedicionTxT(CodEmpresa As String, CodCliente As Int, Usuario As String, Passw As String, TokenWeb As String, IDExpedicion As Long) As String 
	
	Dim xlmStr As String=$"<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Header>
    <cLoginCredential xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <CodEmpresa>${CodEmpresa}</CodEmpresa>
      <CodCliente>$1.0{CodCliente}</CodCliente>
      <Usuario>${Usuario}</Usuario>
      <Password>${Passw}</Password>
      <Token>${TokenWeb}</Token>
    </cLoginCredential>ººº
  </soap12:Header>
  <soap12:Body>
    <Expediciones_Incidencias xmlns="https://ws.txt.es/webserviceTXT.asmx">
      <IdExpedicion>$1.0{IDExpedicion}</IdExpedicion>
    </Expediciones_Incidencias>
  </soap12:Body>
</soap12:Envelope>"$
	Return xlmStr
End Sub

