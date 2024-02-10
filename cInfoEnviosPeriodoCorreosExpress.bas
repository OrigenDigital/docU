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

	Private UsuarioWS As String
	Private PasswordWs As String
	
	Private txtfechaInicial As TextField
	Private btnSelFechaInicial As Button
	Private txtFechaFinal As TextField
	Private btnSelFechaFinal As Button
	
	Private Dialog As B4XDialog
	'Private cboTipoConsulta As ComboBox
	

	Private jamTableViewInfoTrackingEnviosPeriodo As jamTableView
	
	Private lstInfoEnviosFechas As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

'Static code module
Sub Process_Globals

End Sub
'
'Sub show
''	Dim mScreenDim As Map
''	mScreenDim.Initialize
''	mScreenDim=Main.DimensionesPantalla
''	Dim xScreen As Int=mScreenDim.Get("X")
''	Dim yScreen As Int=mScreenDim.Get("Y")
'
'		frm.Initialize("frm",Main.xScreen, Main.yScreen)
'		frm.Icon = Main.IconoFormularios
'		'frm.RootPane.LoadLayout("scrMainMenu2")
'		frm.RootPane.LoadLayout("scrInfoTrackingEnviosPeriodo")
'		Sleep(0)
'		frm.Title="Tracking Envíos Periodo Correos Express"
'		
'		Dialog.Initialize(frm.RootPane)
'		
'	cmAuxCorreosExpress.CargaListaEstadosCorreosExpress
'	cmAuxCorreosExpress.CargaListaIncidenciasCorreosExpress
'		
'		jamTableViewInfoTrackingEnviosPeriodo.EstadoMenuItem(jamTableViewInfoTrackingEnviosPeriodo.MenuBarAcciones,False)
'		jamTableViewInfoTrackingEnviosPeriodo.EstadoMenuItem(jamTableViewInfoTrackingEnviosPeriodo.MenuBarLinea,False)
'		
'		Dim lstCF As List
'		lstCF.initialize
'		
'		Dim cF As DatosCellFactoryJamTableView
'		cF.Initialize
'		cF.AliasCampoColumna="FechaEstadoEnvio"
'		cF.CellFactoryEnCallBack=False
'		cF.NombreFuncionCellFactory=jamTableViewInfoTrackingEnviosPeriodo.CellFactory_ColumnaFecha
'		lstCF.Add(cF)
'		
'		Dim cF As DatosCellFactoryJamTableView
'		cF.Initialize
'		cF.AliasCampoColumna="NombreEstadoEnvio"
'		cF.CellFactoryEnCallBack=True
'		cF.NombreFuncionCellFactory="setFormatoColumnaNombreEstadoEnvio"
'		lstCF.Add(cF)
'		
'		
'
'		Dim rSub As ResumableSub=jamTableViewInfoTrackingEnviosPeriodo.ConfigurarTableView("FasesTrackingExpedicionesPeriodoCorreosExpress.json",lstCF)
'		wait for (rSub) complete (mRes As Map)
'		Log(mRes)
'		If Not(mRes.Get("FlagOK")) Then
'			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			frm.Close
'			Return
'		End If
'		jamTableViewInfoTrackingEnviosPeriodo.AddContextMenuItem("Ver trazabilidad envío","TrazabilidadEnvio")
'		jamTableViewInfoTrackingEnviosPeriodo.AddContextMenuItem("Ver Documento NAV","VerDocumentoNAV")
'		
'
'	lstInfoEnviosFechas.Initialize
'	frm.Show
'	
''	CargaListaEstadosCorreosExpress
''	CargaListaIncidenciasCorreosExpress
'	
'	FechasUltimaSemana
'End Sub
'
'Sub FechasUltimaSemana
'	Dim DateTimeAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yy"
'	Dim nw As Long=DateTime.Now
'	Dim hoy0 As Long=DateUtils.SetDate(DateTime.GetYear(nw), DateTime.GetMonth(nw),DateTime.GetDayOfMonth(nw))
'	Dim hoy0menos7 As Long
'	Dim p As Period
'	p.Days=-7
'	hoy0menos7=DateUtils.AddPeriod(hoy0,p)
'	txtFechaFinal.Text=DateTime.Date(hoy0)
'	txtfechaInicial.Text=DateTime.Date(hoy0menos7)
'	DateTime.DateFormat=DateTimeAnt
'End Sub
'
'
'Sub btnSalir_Click
'	SalirModulo
'End Sub
'
'Sub SalirModulo
'	jamTableViewInfoTrackingEnviosPeriodo.GuardarConfiguracionColumnasUsuario
'	jamTableViewInfoTrackingEnviosPeriodo.LimpiarTabla
'	frm.Close
'	MainMenu2.Show
'End Sub
'
'Sub frm_CloseRequest (EventData As Event)
'	EventData.Consume
'End Sub
'
'Sub CargaCredenciales As ResumableSub
'	
'	CargaDatosWebServiceTransporte(17)   '17 es el IDTransporte en DatosComunes para CorreosExpress
'	Wait For CargaDatosWebServiceTransporte_Completed (Accion As String, lstResWS As List)
'	If Accion="NOK" Then
'		Return "Error carga credenciales"
'	End If
'	Dim mDatosWS As Map=lstResWS.Get(0)
'	
'	UsuarioWS=mDatosWS.get("UsuarioWS")
'	PasswordWs=mDatosWS.get("PasswordWS")
'	'Dim URLWS As String=mDatosWS.Get("URLWebServiceSeguimiento")
'	
'	'If UsuarioWS="" Or PasswordWs="" Or URLWS="" Then
'	If UsuarioWS="" Or PasswordWs="" Then
'		Return "Error carga credenciales"
'	Else
'		Return "OK"
'	End If
'End Sub
'
'Sub CargaDatosWebServiceTransporte(IDTransportista As Int)
'	'DatosEnvioExpedicion.Initialize
'	Dim Accion As String
'	Dim lstRes As List
'	Dim ComandoJRDC As String
'	ComandoJRDC="DatosWebServiceTransporte"
'	JRDCQuery.DatosJRDC("http://192.168.10.20:17179/rdc", ComandoJRDC, Array As String(IDTransportista), Me)
'	Wait For DatosJRDC_Completed (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		Accion="NOK"
'	Else
'		If mresult.Get("ReqOK")=False Then
'			Accion="NOK"
'		Else
'			lstRes=mresult.Get("lstRes")
'			Accion="OK"
'		End If
'	End If
'	CallSubDelayed3(Me,"CargaDatosWebServiceTransporte_Completed",Accion, lstRes)
'End Sub
'
'
'
'
'Private Sub btnSelFechaInicial_Click
'	Dim DateTimeAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yy"
'	Dim B4XDate As B4XDateTemplate
'	B4XDate.Initialize
'	B4XDate.FirstDay=1
'	
'	If txtfechaInicial.Text<>"" Then
'		B4XDate.Date=DateTime.DateParse(txtfechaInicial.text)
'	Else
'		B4XDate.Date=DateTime.now
'	End If
'	
'	
'	Dialog.Title="Selecciona Fecha Inicial"
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDate,"OK","","Cancelar")
'	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOk.Left=bOk.Left-20dip
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.Left=bCancel.Left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For(rSub) complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim FechaInPrev As Long=B4XDate.Date
'	If txtFechaFinal.Text<>"" Then
'		If DateTime.DateParse(txtFechaFinal.Text)<FechaInPrev Then
'			Dim msa As Object=xui.MsgboxAsync("La fecha inicial no puede ser posterior a la final.","Error")
'			Wait For (msa) Msgbox_Result
'			Return
'		End If
'	End If
'	txtfechaInicial.Text=DateTime.Date(FechaInPrev)
'	DateTime.DateFormat=DateTimeAnt
'End Sub
'
'Private Sub btnSelFechaFinal_Click
'	Dim DateTimeAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yy"
'	Dim B4XDate As B4XDateTemplate
'	B4XDate.Initialize
'	B4XDate.FirstDay=1
'	If txtFechaFinal.Text<>"" Then
'		B4XDate.Date=DateTime.DateParse(txtFechaFinal.text)
'	Else
'		B4XDate.Date=DateTime.now
'	End If
'	Dialog.Title="Selecciona Fecha Final"
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDate,"OK","","Cancelar")
'	Dim bOk As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOk.Left=bOk.Left-20dip
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.Left=bCancel.Left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For(rSub) complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim FechaFinPrev As Long=B4XDate.Date
'	If txtfechaInicial.Text<>"" Then
'		If DateTime.DateParse(txtfechaInicial.Text)>FechaFinPrev Then
'			Dim msa As Object=xui.MsgboxAsync("La fecha final no puede ser anterior a la inicial.","Error")
'			Wait For (msa) Msgbox_Result
'			Return
'		End If
'	End If
'	txtFechaFinal.Text=DateTime.Date(FechaFinPrev)
'	DateTime.DateFormat=DateTimeAnt
'End Sub
'
'Sub btnActualizarInfoTracking_Click
'	lstInfoEnviosFechas.Initialize
''	If cboTipoConsulta.Value="Individual" Then
''		If txtNumExpedicion.Text="" Then
''			Dim msa As Object = xui.MsgboxAsync("Introduce un número de expedición","Aviso")
''			Wait For (msa) Msgbox_Result (Result As Int)
''			Return
''		Else
''			
''			Wait For (CargaCredenciales) complete (sResult As String)
''			If sResult<>"OK" Then Return
''			wait for (ActualizarInfoExpedicion("I519390002",txtNumExpedicion.Text)) complete (rBoolean As Boolean)
''		End If
''	End If
'	
''	If cboTipoConsulta.Value="Periodo" Then
'	If txtfechaInicial.Text="" Or txtFechaFinal.Text="" Then
'		Dim msa As Object=xui.MsgboxAsync("No se ha establecido el periodo de consulta.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'		
'	Dim DateTimeAnt As String=DateTime.DateFormat
'	DateTime.dateformat="dd/MM/yy"
'	Dim lFItF As Long=DateTime.DateParse(txtfechaInicial.Text)
'	Dim lFFtF As Long=DateTime.DateParse(txtFechaFinal.Text)
'            
'	DateTime.dateformat="yyyy-MM-dd"
'	Dim sFInicial As String=DateTime.Date(lFItF)
'	Dim sFFinal As String=DateTime.Date(lFFtF)
'	Log( sFInicial & "," & sFFinal)
'	DateTime.dateformat=DateTimeAnt
'			
'			
'
'	Dim p As Period=DateUtils.PeriodBetweenInDays(lFItF,lFFtF)
'	If p.Days>15 Then
'		Dim msa As Object=xui.MsgboxAsync("El periodo máximo de análisis son 15 días.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'			
'	Wait For (CargaCredenciales) complete (sResult As String)
'	If sResult<>"OK" Then Return
'			
'	' ... como el WS de correos NO devuelve la fecha del envío, paso la solicitud, dia a dia ......
'	' pasar los 2 almacenes Proin y Protec
'	For i=0 To p.Days
'		Dim LDia As Long=lFItF+(i*DateTime.TicksPerDay)
'		wait for (InfoEnviosFecha("519390001", LDia)) complete (success As Boolean)
'		If Not(success) Then
'			Exit
'		End If
'		wait for (InfoEnviosFecha("519390002", LDia)) complete (success As Boolean)
'		If Not(success) Then
'			Exit
'		End If
'	Next
'			
'	'If Not(success) Then Return
'			
'	TotalDatosPeriodo(lstInfoEnviosFechas)
'			
'
''		jamTableViewInfoTrackingEnviosPeriodo.SetMouseCursor(fx.Cursors.WAIT)
''			wait for (InfoExpedicionesCorreosExpressEntreFechas(lFItF, lFFtF)) complete (WSResponse As String)
''		jamTableViewInfoTrackingEnviosPeriodo.SetMouseCursor(fx.Cursors.DEFAULT)
''			Log("WSResponse " & WSResponse)
''			If WSResponse.StartsWith("Error carga credenciales") Then
''				Dim msa As Object = xui.MsgboxAsync("No ha sido posible cargar los credenciales de acceso al web service de Correos Express","Error")
''				Wait For (msa) Msgbox_Result (Result As Int)
''				Return
''			End If
''	
''	
''			If WSResponse.StartsWith("ERROR de comunicacion :") Then
''				' ha fallado la llamada al WebServer
''				Dim msa As Object = xui.MsgboxAsync(WSResponse,"Error")
''				Wait For (msa) Msgbox_Result (Result As Int)
''				Return
''			Else
''				' Ha habido comunicacion con el WebServer. El string WSResponse será un XML.
''				' Parsear el resultado del XML devuelto como respuesta
''				Dim XMLRespLWebServer As Xml2Map
''				XMLRespLWebServer.Initialize
''				Dim WSResponseSinPrologo As String=WSResponse.SubString(WSResponse.IndexOf("<"))  ' para elimiar el prólogo ...
''				Dim ParsedData As Map=XMLRespLWebServer.Parse(WSResponseSinPrologo)
''				Dim mSegEnvio As Map=ParsedData.Get("SeguimientoEnviosFechasResponse")
''				Dim CodError As Int=mSegEnvio.Get("Error")
''				If 0<>CodError Then
''					' la respuesta contiene un error del web server
''					Log("Mensaje de error: " & mSegEnvio.Get("MensajeError"))
''					If CodError=402 Then
''						Dim sMsgErr As String="No hay datos de envíos entre las fechas indicadas."
''					Else
''						Dim sMsgErr As String=mSegEnvio.Get("MensajeError")
''					End If
''					Dim msa As Object = xui.MsgboxAsync(sMsgErr,"Aviso")
''					Wait For (msa) Msgbox_Result (Result As Int)
''					Return
''				Else
'	'
''					Dim lstInfoEstadoActualEnvios As List
''					lstInfoEstadoActualEnvios.Initialize
'	'
''					For Each mEstadoActualEnvio As Map In GetElements(mSegEnvio, "SeguimientoEnvioFecha")
''						For Each k2 As String In mEstadoActualEnvio.Keys
''							'Log(k2 & ": " & mEstadoActualEnvio.Get(k2))
''							Dim CodigoEstadoEnvio As String=mEstadoActualEnvio.Get("EstadoEnvio")
''							Dim NombreEstadoEnvio As String
''							Dim DescripcionEstadoEnvio As String
''							For Each InfoEstado() As String In cmMainMenu.lstEstadosCorreosExpress
''								If InfoEstado(0)=CodigoEstadoEnvio Then
''									NombreEstadoEnvio=InfoEstado(1)
''									DescripcionEstadoEnvio=InfoEstado(2)
''									mEstadoActualEnvio.Put("NombreEstadoEnvio",NombreEstadoEnvio)
''									mEstadoActualEnvio.Put("DescripcionEstadoEnvio",DescripcionEstadoEnvio)
''									Exit
''								End If
''							Next
''							mEstadoActualEnvio.Put("FechaEstadoEnvio",DateTime.Now)
''							
''						Next
''					lstInfoEstadoActualEnvios.Add(mEstadoActualEnvio)
''					Next
''					Log("lstInfoEstadoActualEnvios " & lstInfoEstadoActualEnvios)
'					
'					
'					
'					
''				Dim rSub As ResumableSub=jamTableViewInfoTrackingEnviosPeriodo.setdata(lstInfoEstadoActualEnvios)
''				Wait For (rSub) complete (mResultSetData As Map)
''				lstInfoEstadoActualEnvios.Initialize
''				If Not(mResultSetData.Get("FlagOK")) Then
''					If ""<>mResultSetData.Get("msgAviso") Then
''						Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
''						Wait For (msa) Msgbox_Result
''					End If
''					If ""<>mResultSetData.Get("msgError") Then
''						Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
''						Wait For (msa) Msgbox_Result
''						ExitApplication
''					End If
''				End If
''				End If
''			End If
''	End If
''	End If
'End Sub
'
'Sub InfoEnviosFecha(CliFac As String , LFecha As Long) As ResumableSub
'	Dim lstInfoEnviosFecha As List
'	lstInfoEnviosFecha.Initialize
'	jamTableViewInfoTrackingEnviosPeriodo.SetMouseCursor(fx.Cursors.WAIT)
'	wait for (InfoExpedicionesCorreosExpressEntreFechas(CliFac, LFecha, LFecha)) complete (WSResponse As String)
'	jamTableViewInfoTrackingEnviosPeriodo.SetMouseCursor(fx.Cursors.DEFAULT)
'	Log("WSResponse " & WSResponse)
'	If WSResponse.StartsWith("Error carga credenciales") Then
'		Dim msa As Object = xui.MsgboxAsync("No ha sido posible cargar los credenciales de acceso al web service de Correos Express","Error")
'		Wait For (msa) Msgbox_Result (Result As Int)
'		Return False
'	End If
'
'	If WSResponse.StartsWith("ERROR de comunicacion :") Then
'		' ha fallado la llamada al WebServer
'		Dim msa As Object = xui.MsgboxAsync(WSResponse,"Error")
'		Wait For (msa) Msgbox_Result (Result As Int)
'		Return False
'	Else
'		' Ha habido comunicacion con el WebServer. El string WSResponse será un XML.
'		' Parsear el resultado del XML devuelto como respuesta
'		Dim XMLRespLWebServer As Xml2Map
'		XMLRespLWebServer.Initialize
'		Dim WSResponseSinPrologo As String=WSResponse.SubString(WSResponse.IndexOf("<"))  ' para elimiar el prólogo ...
'		Dim ParsedData As Map=XMLRespLWebServer.Parse(WSResponseSinPrologo)
'		Dim mSegEnvio As Map=ParsedData.Get("SeguimientoEnviosFechasResponse")
'		Dim CodError As Int=mSegEnvio.Get("Error")
'		If 0<>CodError And CodError<>402 Then
'			' la respuesta contiene un error del web server
'			Log("Mensaje de error: " & mSegEnvio.Get("MensajeError"))
''			If CodError=402 Then
''				Dim sMsgErr As String="No hay datos de envíos entre las fechas indicadas."
''			Else
'			Dim sMsgErr As String=mSegEnvio.Get("MensajeError")
''			End If
'			Dim msa As Object = xui.MsgboxAsync(sMsgErr,"Aviso")
'			Wait For (msa) Msgbox_Result (Result As Int)
'			Return False
'		Else
'			'
''			Dim lstInfoEstadoActualEnvios As List
''			lstInfoEstadoActualEnvios.Initialize
'
'			For Each mEstadoActualEnvio As Map In GetElements(mSegEnvio, "SeguimientoEnvioFecha")
'				'For Each k2 As String In mEstadoActualEnvio.Keys
'				'Log(k2 & ": " & mEstadoActualEnvio.Get(k2))
'				Dim CodigoEstadoEnvio As String=mEstadoActualEnvio.Get("EstadoEnvio")
'				Dim NombreEstadoEnvio As String
'				Dim DescripcionEstadoEnvio As String
'				For Each InfoEstado() As String In cmAuxCorreosExpress.lstEstadosCorreosExpress
'					If InfoEstado(0)=CodigoEstadoEnvio Then
'						NombreEstadoEnvio=InfoEstado(1)
'						DescripcionEstadoEnvio=InfoEstado(2)
'						mEstadoActualEnvio.Put("NombreEstadoEnvio",NombreEstadoEnvio)
'						mEstadoActualEnvio.Put("DescripcionEstadoEnvio",DescripcionEstadoEnvio)
'						Exit
'					End If
'				Next
'				mEstadoActualEnvio.Put("FechaEstadoEnvio",LFecha)
'				'puede haber envíos sin referencia
'				If mEstadoActualEnvio.ContainsKey("Referencia")=False Then
'					mEstadoActualEnvio.put("Referencia","")
'				End If
'				'Next
'				'lstInfoEstadoActualEnvios.Add(mEstadoActualEnvio)
'				lstInfoEnviosFechas.Add(mEstadoActualEnvio)
'			Next
'			'Log("lstInfoEstadoActualEnvios " & lstInfoEstadoActualEnvios)
'			Log("lstInfoEnviosFechas " & lstInfoEnviosFechas)
'			'Return lstInfoEstadoActualEnvios
'			Return True
'		End If
'	End If
'End Sub
'
'Sub EliminarEnviosSinRecepcionErroneos
'	Dim lstEnviosSinRecepcion As List
'	lstEnviosSinRecepcion.Initialize
'	Dim lstEnviosSinRecepcionEliminar As List
'	lstEnviosSinRecepcionEliminar.Initialize
'	For Each mEstEnv As Map In lstInfoEnviosFechas
'		If 1=mEstEnv.Get("EstadoEnvio") Then
'			lstEnviosSinRecepcion.add(mEstEnv.Get("Referencia"))
'		Else
'			If lstEnviosSinRecepcion.IndexOf(mEstEnv.Get("Referencia"))>-1 Then
'				lstEnviosSinRecepcionEliminar.Add(mEstEnv.Get("Referencia"))
'			End If
'		End If
'	Next
'	For Each ref As String In lstEnviosSinRecepcionEliminar
'		For i=0 To lstInfoEnviosFechas.Size-1
'			Dim mEstEnv As Map=lstInfoEnviosFechas.Get(i)
'			If ref= mEstEnv.Get("Referencia") And 1=mEstEnv.Get("EstadoEnvio") Then
'				lstInfoEnviosFechas.RemoveAt(i)
'				Exit
'			End If
'		Next
'	Next
'End Sub
'
'Sub TotalDatosPeriodo(lstTotalInfoEnviosFechas As List)
'	
'	EliminarEnviosSinRecepcionErroneos
'	
'	Dim rSub As ResumableSub=jamTableViewInfoTrackingEnviosPeriodo.setdata(lstTotalInfoEnviosFechas)
'	Wait For (rSub) complete (mResultSetData As Map)
'	lstTotalInfoEnviosFechas.Initialize
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgAviso") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			ExitApplication
'		End If
'	End If
'End Sub
'
'
'' Devolverá un XML con información de:
''	 Numero Envio (nº expedicion)
''	 Referencia (la que hayamos asignado nosotros a la expedicion, 
''	Estado envío: Código que hay que relacionar con una tabla de estados
'Sub InfoExpedicionesCorreosExpressEntreFechas(CliFac As String, FechaInL As Long, FechaFinL As Long) As ResumableSub
'	
'	CargaDatosWebServiceTransporte(17)   '17 es el IDTransporte en DatosComunes para CorreosExpress
'	Wait For CargaDatosWebServiceTransporte_Completed (Accion As String, lstResWS As List)
'	If Accion="NOK" Then
'		Return "Error carga credenciales"
'	End If
'	Dim mDatosWS As Map=lstResWS.Get(0)
'	
'	Dim UsuarioWS As String=mDatosWS.get("UsuarioWS")
'	Dim PasswordWs As String=mDatosWS.get("PasswordWS")
'	Dim URLWS As String=mDatosWS.Get("URLWebServiceSeguimiento")
'	
'	If UsuarioWS="" Or PasswordWs="" Or URLWS="" Then
'		Return "Error carga credenciales"
'	End If
'	
'	
'	
'	' Primero parseamos la plantilla XML
'	Dim xm As Xml2Map
'	xm.Initialize
'	Dim ParsedData As Map
'	ParsedData = xm.Parse(File.ReadString(File.DirAssets, "PlantillaXLMCorreosSeguimientoFechas.xml"))
'	' Parsed data es un mapa que contiene la informacion del xml.
'	' En este caso , contiene una unica clave: SeguimientoEnviosFechasRequest
'	Dim mSeguimientoEnviosFechasRequest As Map=ParsedData.Get("SeguimientoEnviosFechasRequest")
'	' A su vez contiene un mapa con las claves que necesitamos.
'	For Each k As String In mSeguimientoEnviosFechasRequest.keys
'		Log("k :" & k)
'	Next
'	
'	' Después cambiamos los valores de los strings del mapa que define el XML
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="yyyy-MM-dd"   ' el formato tiene que ser así para el XML  AAAA-MM-DD --> "yyyy-MM-dd" para B4X
'	
'	'mSeguimientoEnviosFechasRequest.Put("KeyCliFac","555559999")
'	'mSeguimientoEnviosFechasRequest.Put("KeyCliFac","519390001")
'	mSeguimientoEnviosFechasRequest.Put("KeyCliFac",CliFac)
'	mSeguimientoEnviosFechasRequest.Put("FechaInicial",DateTime.Date(FechaInL))
'	mSeguimientoEnviosFechasRequest.Put("FechaFinal",DateTime.Date(FechaFinL))
'	
'	DateTime.DateFormat=DateFormatAnt
'	
'	' Despues pasar el mapa modificado a una string con el texto XML que vamos a pasar al web service
'	
'	Dim m2Xml As Map2Xml
'	m2Xml.Initialize
'	Dim sXML As String=m2Xml.MapToXml(ParsedData)
'	
'	
'	
'	Dim job As HttpJob
'	job.Initialize("",Me)
'	'Dim URLCorreosExpressFechas As String="https://test.correosexpress.com/wspsc/apiRestSeguimientoEnvios/rest/seguimientoEnviosFechas"
'	Dim URLCorreosExpressFechas As String="https://www.correosexpress.com/wpsc/apiRestSeguimientoEnvios/rest/seguimientoEnviosFechas"
'	'Dim URLCorreosExpress As String=URLWS
'	job.Username=UsuarioWS
'	job.Password=PasswordWs
'	job.PostString(URLCorreosExpressFechas,sXML)
'	'job.GetRequest.SetHeader("Content-Type","application/json")
'	job.GetRequest.SetContentType("application/xml")
'	job.GetRequest.SetContentEncoding("UTF8")
'
'	Wait For (job) JobDone(j As HttpJob)
'	If j.Success Then
'		'Log(j.GetString)
'		Dim sRespuestaWebService As String=j.GetString
'		j.Release
'		Return sRespuestaWebService
'	Else
'		j.Release
'		Return "ERROR de comunicacion :" & j.ErrorMessage
'	End If
'End Sub
'
''esta sub es necesaria para poder diferenciar correctamente cuando el XML devuelva 1 elemento (map) o varios elementos (list)
'' con esta sub, SIEMPRE devolverá una lista
'' ver https://www.b4x.com/android/forum/threads/b4x-xml2map-simple-way-to-parse-xml-documents.74848/
'Sub GetElements (m As Map, key As String) As List
'	Dim res As List
'	If m.ContainsKey(key) = False Then
'		res.Initialize
'		Return res
'	Else
'		Dim value As Object = m.Get(key)
'		If value Is List Then Return value
'		res.Initialize
'		res.Add(value)
'		Return res
'	End If
'End Sub
'
'Sub jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action(TagMenuItem As String)
'	Select TagMenuItem
'		Case "TrazabilidadEnvio"
'			Dim NumEnvio As String
'			Dim lstReg As List=jamTableViewInfoTrackingEnviosPeriodo.DatosRegistroIndiceFila(jamTableViewInfoTrackingEnviosPeriodo.GetIndiceFilaSeleccionada)
'			For Each dcRS As DatosCampoRegistroJamTableView In lstReg
'				If dcRS.AliasCampo="NumEnvio" Then
'					NumEnvio=dcRS.ValorCampo
'					Exit
'				End If
'			Next
'			If NumEnvio<>"" Then
'				jamTableViewInfoTrackingEnviosPeriodo.GuardarConfiguracionColumnasUsuario
'				' NO limpiar la tabla, volveremos a ella al cerrar el formulario de envio
'''''''				cmInfoEnvio.CallbackInfoEnvio=Me
'''''''				cmInfoEnvio.NumEnvio=NumEnvio
'''''''				cmInfoEnvio.Show
'				Dim cInfoExpCE As cInfoExpedicionCorreosExpress
'				cInfoExpCE.Initialize(NumEnvio)
'				cInfoExpCE.Show
'				
'			End If
'		Case "VerDocumentoNAV"
'			Dim DocumentoSel As String
'			Dim FilaSeleccionada As Int=jamTableViewInfoTrackingEnviosPeriodo.IndicesFilasSeleccionadas.Get(0)
'			Dim lstInfoFila As List=jamTableViewInfoTrackingEnviosPeriodo.DatosRegistroIndiceFila(FilaSeleccionada)
'			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
'				If dc.Campo="Referencia" Then
'					DocumentoSel=dc.ValorCampo
'					Exit
'				End If
'			Next
'			If DocumentoSel="" Then
'				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Documento.","Error")
'				Wait For (msa) Msgbox_Result
'			Else
'
'				WAIT FOR (VerDocumentoNAV(DocumentoSel)) COMPLETE (success As Boolean)
''				If success Then
''					SetForegroundWindow(DocumentoSel)
''				End If
'			End If
'
'	End Select
'End Sub
'
'Sub VerDocumentoNAV(DocumentoSel As String) As ResumableSub
'
'	
'	' comprobar si ya existe la ventana
'	Log("Buscando window title " & DocumentoSel)
'
'	Dim WU As JavaObject
'	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
'	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
'	Dim FlagOk As Boolean
'	For Each JO As JavaObject In L
'		Dim t As String = JO.RunMethod("getTitle",Null)
'		Log("window title" & t)
'		If t.Contains(DocumentoSel) Then
'			FlagOk=True
'			Exit
'		End If
'	Next
'	
'	If FlagOk Then
'		Dim msa As Object = xui.Msgbox2Async("Ya hay una ventana abierta con el título: " & CRLF & CRLF & JO.RunMethod("getTitle",Null) & CRLF , "Aviso", "Abrir Nueva", "Cancelar", "Abrir Actual", Null)
'		Wait For (msa) Msgbox_Result (RInt As Int)
'		If RInt=xui.DialogResponse_Cancel Then Return False
'		If RInt <>xui.DialogResponse_Positive Then
'			Dim user32 As JavaObject
'			user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
'			Dim hwnd As Object = JO.RunMethod("getHWND", Null)
'			user32.RunMethod("SetForegroundWindow", Array(hwnd))
'			user32.RunMethod("SetFocus", Array(hwnd))
'			user32.RunMethod("ShowWindow", Array(hwnd, 9))'SW_RESTORE
'			Return True
'		End If
'	End If
'		
'	Dim  PagNAVTipoDoc As Int
'	Select True
'		Case DocumentoSel.StartsWith("ALBV")
'			PagNAVTipoDoc=130
'		Case DocumentoSel.StartsWith("RT")
'			PagNAVTipoDoc=5745
'		Case Else
'			Dim msa As Object=xui.MsgboxAsync("Sólo es posible navegar a documentos tipo ALBV o RT.","Aviso")
'			Wait For (msa) Msgbox_Result
'			Return False
'	End Select
'		
'	Dim NavFilePath As String="C:\Program Files (x86)\Microsoft Dynamics NAV\90\RoleTailored Client\Microsoft.Dynamics.Nav.Client.exe"
'	'//server/service/company
'
'	Dim NAVHyperlink As String="Dynamicsnav://NAVISION2012:7046/PROIN/PROIN%20PINILLA/runpage?page=" & PagNAVTipoDoc & "&$filter='No.'%20IS%20" & DocumentoSel
'	Log("Microsoft.Dynamics.Nav.Client.exe " & NAVHyperlink)
'	Dim shl As Shell
'	shl.Initialize("shl",NavFilePath, Array As String(NAVHyperlink))
'	'shl.WorkingDirectory="C:\Program Files (x86)\Microsoft Dynamics NAV\90\RoleTailored Client"  ASÍ NO FUNCIONA ... HAY QUE INDICAR LA RUTA COMPLETA EN INITIALIZE
'	Try
'		shl.Run(-1)
'		Log("try Success")
'		Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
'		If Success Then
'			For Each line As String In Regex.Split("[\r\n]+", StdOut)
'				Log("line shell " & line)
'			Next
'			Dim FlagOk As Boolean
'			For i=0 To 3 ' intentarlo 3 veces ... por si navision es lento en arrancar ...
'				Sleep(1000) ' dar tiempo a que la ventana se abra
'				Log("Buscando window title " & DocumentoSel)
'				Dim WU As JavaObject
'				WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
'				Dim user32 As JavaObject
'				user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
'				Dim L As List = WU.RunMethod("getAllWindows",Array(False))
'				For Each JO As JavaObject In L
'					Dim t As String = JO.RunMethod("getTitle",Null)
'					Log("window title" & t)
'					If t.Contains(DocumentoSel) Then
'						Dim hwnd As Object = JO.RunMethod("getHWND", Null)
'						user32.RunMethod("SetForegroundWindow", Array(hwnd))
'						user32.RunMethod("SetFocus", Array(hwnd))
'						user32.RunMethod("ShowWindow", Array(hwnd, 9))'SW_RESTORE
'						FlagOk=True
'						Exit
'					End If
'				Next
'				If FlagOk Then Exit
'			Next
'			Return True
'		Else
'			If StdErr.Contains(shl.WorkingDirectory) Then
'				Dim msa As Object=xui.MsgboxAsync("La aplicación NAVISION no está instalada en el directorio predeterminado.","Error")
'				Wait For (msa) Msgbox_Result
'			Else
'				Dim msa As Object=xui.MsgboxAsync(StdErr,"Error")
'				Wait For (msa) Msgbox_Result
'			End If
'			Return False
'		End If
'			
'	Catch
'		Log(LastException)
'		If LastException.Message.Contains(shl.WorkingDirectory) Then
'			Dim msa As Object=xui.MsgboxAsync("La aplicación NAVISION no está instalada en el directorio predeterminado.","Error")
'			Wait For (msa) Msgbox_Result
'		Else
'			Dim msa As Object=xui.MsgboxAsync(LastException.Message,"Error")
'			Wait For (msa) Msgbox_Result
'		End If
'		Return False
'	End Try
'
'End Sub
'
'' pasa el foco a otra aplicacion de Windows
''para usar conjuntamente, por ejemplo, con jSHELL , abrir ventana navision
''requiere:
''#AdditionalJar: jna-5.6.0
''#AdditionalJar: jna-platform-5.6.0
'Sub SetForegroundWindow(Title As String) As ResumableSub
'	Sleep(1000) ' dar tiempo a que la ventana se abra
'	Log("Buscando window title " & Title)
'	Dim WU As JavaObject
'	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
'	Dim user32 As JavaObject
'	user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
'	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
'	For Each JO As JavaObject In L
'		Dim t As String = JO.RunMethod("getTitle",Null)
'		Log("window title" & t)
'		If t.Contains(Title) Then
'			Dim hwnd As Object = JO.RunMethod("getHWND", Null)
'			user32.RunMethod("SetForegroundWindow", Array(hwnd))
'			user32.RunMethod("SetFocus", Array(hwnd))
'			user32.RunMethod("ShowWindow", Array(hwnd, 9))'SW_RESTORE
'			Return True
'		End If
'	Next
'	Log("Window not found")
'	Return False
'End Sub
'
'
'
'Sub SearchWindow(Title As String) As JavaObject
'	Log("Buscando window title " & Title)
'	'Dim mW As Map
'	'mW.Initialize
'	'Dim WindowFound As Boolean
'	'Dim JOWindowFound As JavaObject
'	'mW.Put("WindowFound",WindowFound)
'	Dim WU As JavaObject
'	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
'	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
'	For Each JO As JavaObject In L
'		Dim t As String = JO.RunMethod("getTitle",Null)
'		Log("window title" & t)
'		If t.Contains(Title) Then
'			Log("Window found")
'			Return JO
'		End If
'	Next
'	Log("Window not found")
'	Return Null
'End Sub
'
'Sub SetForegroundWindowJO(JOWindow As JavaObject)
'	Dim user32 As JavaObject
'	user32 = user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")
'	Dim hwnd As Object = JOWindow.RunMethod("getHWND", Null)
'	user32.RunMethod("SetForegroundWindow", Array(hwnd))
'	user32.RunMethod("SetFocus", Array(hwnd))
'	user32.RunMethod("ShowWindow", Array(hwnd, 9))'SW_RESTORE
'End Sub
'
'
'
'#If Java
'import javafx.scene.control.*; 
'import javafx.util.Callback;
'import javafx.scene.paint.Color;
'import javafx.scene.paint.Paint;
'import javafx.scene.control.TableColumn;
'import java.util.Arrays;
'import java.util.List;
'
'
'
'public static Color getColorByName(String name) {
'    try {
'        return (Color)Color.class.getField(name.toUpperCase()).get(null);
'    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
'        e.printStackTrace();
'        return null;
'    }
'}
'
'public static String format(double val) {
'    String in = Integer.toHexString((int) Math.round(val * 255));
'    return in.length() == 1 ? "0" + in : in;
'}
'
'public static String toHexString(Color value) {
'    return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) + format(value.getOpacity()))
'            .toUpperCase();
'}
'
'
'public static void setFormatoColumnaNombreEstadoEnvio(TableColumn tc, final Object[] args)  throws Exception {
'
'
'    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
'        @Override
'        public TableCell call(TableColumn param) {
'            return new TableCell<Object, Object>() {
'                @Override
'                public void updateItem(Object item, boolean empty) {
'                    super.updateItem(item, empty);
'                    if (!isEmpty()){
'					
'						String EstadoEnvio=(String)item;
'						
'						String sColorF=new String("");
'						
'						String sColorT=new String("");
'						
'						String sColorB=new String("");
'						
'					     switch (EstadoEnvio) 
'					        {
'					            case "ENTREGADO":
'									sColorT = "lime";
'									//sColorF = "lime";
'									//sColorB = "lightgray";
'					                break;
'
'					            default: 
'									sColorT = "red";
'									//sColorF = "red";
'									//sColorB = "lightgray";
'					                break;
'					        }
'					
'						//Color colorF = Color.valueOf(sColorF);
'						// String hexColorF = toHexString(colorF);
'						 //Color colorB = Color.valueOf(sColorB);
'						// String hexColorB = toHexString(colorB);
'						//System.out.println("hexColor "+ hexColor);
'						//setStyle("-fx-background-color: #baffba;");
'						//setStyle("-fx-alignment: CENTER;-fx-border-color: #D3D3D3;-fx-border-width: 1;-fx-background-color: " + hexColorF +";");
'						//setStyle("-fx-alignment: CENTER;-fx-border-color: "+ hexColorB + ";-fx-border-width: 1;-fx-background-color: " + hexColorF +";");
'						//String sColorT =  String.valueOf(args[0]);
'						Color colorT = Color.valueOf(sColorT);
'						setTextFill(colorT);
'       						setText(""+item);
'							}
'	 				else {
'	          			setText(null);
'              			setTextFill(null);
'						setStyle(null);
'              			return;
'	 				}
'                }
'            };
'        }
'    });
'}
'#End If
