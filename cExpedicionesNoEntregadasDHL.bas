B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals

	Private fx As JFX
	Private xui As XUI
	Private frm As Form
	'Private ftpDHL As FTP
	Private sFtpDHL As SFtp
	
'	Private lstCodigosEstadosDHL As List
'	Private lstEstadosExpediciones As List
	Private NombreUltimoFichero As String
	Private btnSalir As Button
	Private jamTableViewExpedicionesNoEntregadas As jamTableView
	
	Dim Dialog As B4XDialog
	Dim mSQL As SQL
	
	Private UsuarioWS As String
	Private PasswordWs As String
	Private accessToken As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub Show

		frm.Initialize("frm",Main.xScreen, Main.yScreen)
		frm.Icon = Main.IconoFormularios
		'frm.RootPane.LoadLayout("scrMainMenu2")
		Dim joForm As JavaObject = frm
		Dim joStage As JavaObject = joForm.GetField("stage")
		joStage.RunMethod("setMaximized", Array(True))
		frm.RootPane.LoadLayout("scrExpedicionesDHLNoEntregadas")
		Sleep(0)
		frm.Title="Expediciones DHL"
		
		If Not(File.Exists(xui.DefaultFolder,"hosts.txt")) Then
			File.WriteString(xui.DefaultFolder,"hosts.txt","")
		End If
		

		
		jamTableViewExpedicionesNoEntregadas.EstadoMenuItem(jamTableViewExpedicionesNoEntregadas.MenuBarAcciones,False)
		jamTableViewExpedicionesNoEntregadas.EstadoMenuItem(jamTableViewExpedicionesNoEntregadas.MenuBarLinea,False)
		
		jamTableViewExpedicionesNoEntregadas.AddContextMenuItemSeparator
		Dim imgNAV As Image
		imgNAV.InitializeSample(File.DirAssets,"navision.png",24,24)
		jamTableViewExpedicionesNoEntregadas.AddContextMenuItemImage("Documentos NAV de la expedición","Documentos NAV de la expedicion", imgNAV)
		Dim imgDHL As Image
		imgDHL.InitializeSample(File.DirAssets,"DHLsq.png",24,24)
		jamTableViewExpedicionesNoEntregadas.AddContextMenuItemImage("Trazabilidad Expedición Web DHL","TrazabilidadExpedicionWebDHL",imgDHL)
		
		Dim rSub As ResumableSub=jamTableViewExpedicionesNoEntregadas.ConfigurarTableView("ExpedicionesNoEntregadasDHL.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			SalirModulo
			Return
		End If
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.AliasCampoColumna="Fecha"
		CF.NombreFuncionCellFactory=jamTableViewExpedicionesNoEntregadas.CellFactory_ColumnaFecha
		CF.CellFactoryEnCallBack=False
		CF.params=Null
		jamTableViewExpedicionesNoEntregadas.SetCellFactory(CF)
		
		Dialog.Initialize(frm.RootPane)
	


	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	CreacionTablasSQLite
	
	
	sFtpDHL.Initialize("sftpDHL", "tak3uada", "xfG2&rNpe!fD8QYP", "sftp3.dhl.com", 4222)
	'sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
	sFtpDHL.SetKnownHostsStore(xui.DefaultFolder, "hosts.txt")
	
	frm.Show
	
	Dim joForm As JavaObject=asJO(frm)
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized",Array(True))

'	End If

	frm.RootPane.MouseCursor= fx.Cursors.WAIT
	
	Wait For(CargaCredenciales) complete (sResp As String)
	If sResp<>"OK" Then
		
		Dim msa As Object=xui.MsgboxAsync("Error carga credenciales DHL" & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		btnSalir_Click
	End If
	
	
	
	' por algun motivo, el método List falla con wait for ...
	sFtpDHL.List("out/work")


	'BajarFicheroIncidenciasFTP
End Sub

private Sub asJO(o As JavaObject) As JavaObject
	Return o
End Sub

'Sub BajarFicheroIncidenciasFTP
'	
'
'
'	Try 
'		sFtpDHL.List("out/work")
'		Wait For sftpDHL_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
'		
'		Log(ServerPath)
'		If Success = False Then
'			Log(LastException.Message)
'			fx.Msgbox(frm,"Error listando carpeta FTP." & CRLF & CRLF & LastException.Message ,"Error")
'			Return 
'		Else
'			For i = 0 To Folders.Length - 1
'				Log(Folders(i).Name)
'				Log(DateTime.Date(Folders(i).Timestamp))
'			Next
'			Dim NombreUltimoFichero As String
'			Dim FechaLongUltimoFichero As Long
'			For i = 0 To Files.Length - 1
'				Log(Files(i).Name & ", " & Files(i).Size & ", " & DateTime.Date(Files(i).Timestamp))
'				If Files(i).Timestamp> FechaLongUltimoFichero Then
'					NombreUltimoFichero=Files(i).Name
'					FechaLongUltimoFichero=Files(i).Timestamp
'				End If
'			Next
'		End If
'	Catch
'		fx.Msgbox(frm,"Error listando carpeta FTP."  & CRLF & CRLF & LastException.Message ,"Error")
'		Return 
'	End Try	
'
'	'Dim NombreUltimoFichero As String=Files(Files.Length - 1).Name
'	If File.Exists(File.DirData("TrackingExpedicionesDHL"),NombreUltimoFichero)=False Then
'		Dim RutaUltimoFichero As String="out/work" & "/" & NombreUltimoFichero
'		sFtpDHL.DownloadFile(RutaUltimoFichero, File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
'		Wait For sftpDHL_DownloadCompleted (ServerPath As String, Success As Boolean)
'		If Not(Success) Then
'			fx.Msgbox(frm,"Error descargando fichero de estado expediciones.","Error")
'			Return
'		End If
'	End If
'
'	
'	'CargaListaIncidenciasDHL
'	Dim lstCodigosEstadosDHL As List
'	lstCodigosEstadosDHL.Initialize
'	Dim su As StringUtils
'	'lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,"CodigosIncidenciasDHL.csv",";")
'	lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,"incidencias_carretera.csv",";")
'	
'	Dim lstEnviosNoEntregadosDHL As List
'	lstEnviosNoEntregadosDHL.Initialize
'	Dim lstLineasFichero As List
'	lstLineasFichero = File.ReadList(File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	Dim TimeFormatAnt As String=DateTime.TimeFormat
'	DateTime.DateFormat="yyyyMMdd"
'	DateTime.TimeFormat="HHmmss"
'	For i = 0 To lstLineasFichero.Size - 1
'		Log(lstLineasFichero.Get(i))
'		Dim sLin As String=lstLineasFichero.Get(i)
'		Dim m As Map
'		m.Initialize
'		m.Put("NumExpedicion",sLin.SubString2(47,62))
'		m.Put("TipoRegistro",sLin.SubString2(62,64))
'		Dim ClaveSituacion As String=sLin.SubString2(64,66).Trim
'		Dim PuntoGeneracion As String=sLin.SubString2(140,143)
'		Dim Evento As String=sLin.SubString2(143,146)
'		Dim Motivo As String=sLin.SubString2(146,149)
'		Dim DescripcionSituacion As String
'		For Each sClave() As String In lstCodigosEstadosDHL
'			'Log(sClave(0))
'			If sClave(0) & "#/#" & sClave(3) & "#/#" & sClave(4) =ClaveSituacion & "#/#" & Evento & "#/#" & Motivo Then
'				DescripcionSituacion=sClave(1)
'				Exit
'			End If
'		Next
'		m.Put("DescripcionSituacion",DescripcionSituacion)
'		Dim sFecha As String=sLin.SubString2(66,74)
'		m.Put("Fecha",DateTime.DateParse(sFecha))
'		Dim sHora As String=sLin.SubString2(74,80)
'		m.Put("Hora",DateTime.TimeParse(sHora))
'		m.Put("Observaciones",sLin.SubString2(90,140))
'		Log("Estado Expedicion " & m)
'	Next
'	DateTime.DateFormat=DateFormatAnt
'	DateTime.TimeFormat=TimeFormatAnt
'	
'
'End Sub

'Sub sftpDHL_ListCompleted(ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
'	If Success = False Then
'		Log(LastException)
'		fx.Msgbox(Main.frm,"Error listando carpeta FTP." & CRLF & CRLF & LastException.Message ,"Error")
'		
'	Else
'		For i = 0 To Folders.Length - 1
'			Log(Folders(i).Name)
'			Log(DateTime.Date(Folders(i).Timestamp))
'		Next
'		Dim NombreUltimoFichero As String
'		Dim FechaLongUltimoFichero As Long
'		For i = 0 To Files.Length - 1
'			Log(Files(i).Name & ", " & Files(i).Size & ", " & DateTime.Date(Files(i).Timestamp))
'			If Files(i).Timestamp> FechaLongUltimoFichero Then
'				NombreUltimoFichero=Files(i).Name
'				FechaLongUltimoFichero=Files(i).Timestamp
'			End If
'		Next
'	End If
'	'Dim NombreUltimoFichero As String=Files(Files.Length - 1).Name
'	If File.Exists(File.DirData("TrackingExpedicionesDHL"),NombreUltimoFichero)=False Then
'		Dim RutaUltimoFichero As String="out/work" & "/" & NombreUltimoFichero
'		sFtpDHL.DownloadFile(RutaUltimoFichero, File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
'		Wait For sftpDHL_DownloadCompleted (ServerPath As String, Success As Boolean)
'		If Not(Success) Then
'			fx.Msgbox(Main.frm,"Error descargando fichero de estado expediciones.","Error")
'			
'		End If
'	End If
'
'	'CargaListaIncidenciasDHL
'	Dim lstCodigosEstadosDHL As List
'	lstCodigosEstadosDHL.Initialize
'	Dim su As StringUtils
'	'lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,"CodigosIncidenciasDHL.csv",";")
'	lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,"incidencias_carretera.csv",";")
'	
'	Dim lstEnviosNoEntregadosDHL As List
'	lstEnviosNoEntregadosDHL.Initialize
'	Dim lstLineasFichero As List
'	lstLineasFichero = File.ReadList(File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	Dim TimeFormatAnt As String=DateTime.TimeFormat
'	DateTime.DateFormat="yyyyMMdd"
'	DateTime.TimeFormat="hhmmss"
'	For i = 0 To lstLineasFichero.Size - 1
'		Log(lstLineasFichero.Get(i))
'		Dim sLin As String=lstLineasFichero.Get(i)
'		Dim m As Map
'		m.Initialize
'		m.Put("NumExpedicion",sLin.SubString2(47,62))
'		m.Put("TipoRegistro",sLin.SubString2(62,64))
'		Dim ClaveSituacion As String=sLin.SubString2(64,66).Trim
'		Dim PuntoGeneracion As String=sLin.SubString2(140,143)
'		Dim Evento As String=sLin.SubString2(143,146)
'		Dim Motivo As String=sLin.SubString2(146,149)
'		Dim DescripcionSituacion As String
'		For Each sClave() As String In lstCodigosEstadosDHL
'			'Log(sClave(0))
'			If sClave(0) & "#/#" & sClave(3) & "#/#" & sClave(4) =ClaveSituacion & "#/#" & Evento & "#/#" & Motivo Then
'				DescripcionSituacion=sClave(1)
'				Exit
'			End If
'		Next
'		m.Put("DescripcionSituacion",DescripcionSituacion)
'		Dim sFecha As String=sLin.SubString2(66,74)
'		m.Put("Fecha",DateTime.DateParse(sFecha))
'		Dim sHora As String=sLin.SubString2(74,80)
'		m.Put("Hora",DateTime.TimeParse(sHora))
'		m.Put("Observaciones",sLin.SubString2(90,140))
'		Log("Estado Expedicion " & m)
'	Next
'	DateTime.DateFormat=DateFormatAnt
'	DateTime.TimeFormat=TimeFormatAnt
'
'End Sub



Sub sftpDHL_PromptYesNo (Message As String)
''	Dim res As Int = fx.Msgbox2(frm,Message, "", "Yes", "", "No",Null)
''	'The next line might be a bit confusing. It is a condition.
''	'The value will be True if res equals to DialogResponse.POSITIVE.
''	sFtpDHL.SetPromptResult(res = fx.DialogResponse.POSITIVE)
   
   sFtpDHL.SetPromptResult(True)
End Sub

Sub sftpDHL_ShowMessage (Message As String)
	fx.Msgbox(frm,Message, "")
End Sub

Sub sftpDHL_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
	Dim s As String
	s = "Uploaded " & Round(TotalUploaded / 1000) & "KB"
	If Total > 0 Then s = s & " out of " & Round(Total / 1000) & "KB"
	Log(s)
End Sub

Sub sftpDHL_UploadCompleted (ServerPath As String, Success As Boolean)
	Log(ServerPath & ", Success=" & Success)
	If Success = False Then Log(LastException.Message)
End Sub

Sub sftpDHL_ListCompleted (ServerPath As String, Success As Boolean, Folders() As SFtpEntry, Files() As SFtpEntry)
	frm.RootPane.MouseCursor= fx.Cursors.DEFAULT
	If Files.Length=0 Then
		Dim lstEnviosNoEntregadosDHL As List
		lstEnviosNoEntregadosDHL.Initialize
		wait for (ActualizarDatosTabla(lstEnviosNoEntregadosDHL)) complete (rObj As Object)
		Return
	End If
	Log(ServerPath)
	If Success = False Then
		Log(LastException.Message)
		fx.Msgbox(frm,"Error listando carpeta FTP." & CRLF & CRLF & LastException.Message ,"Error")
		Return
	Else
		For i = 0 To Folders.Length - 1
			Log(Folders(i).Name)
			Log(DateTime.Date(Folders(i).Timestamp))
		Next
		'Dim NombreUltimoFichero As String
		Dim FechaLongUltimoFichero As Long
		For i = 0 To Files.Length - 1
			Log(Files(i).Name & ", " & Files(i).Size & ", " & DateTime.Date(Files(i).Timestamp))
			If Files(i).Timestamp> FechaLongUltimoFichero Then
				NombreUltimoFichero=Files(i).Name
				FechaLongUltimoFichero=Files(i).Timestamp
			End If
		Next
	End If
	Log("********NombreUltimoFichero*******")
	Log(NombreUltimoFichero)
	'If File.Exists(File.DirData("TrackingExpedicionesDHL"),NombreUltimoFichero)=False Then
	If File.Exists(xui.DefaultFolder,NombreUltimoFichero)=False Then
		Dim RutaUltimoFichero As String="out/work" & "/" & NombreUltimoFichero
		frm.RootPane.MouseCursor= fx.Cursors.WAIT
		'sFtpDHL.DownloadFile(RutaUltimoFichero, File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
		sFtpDHL.DownloadFile(RutaUltimoFichero, xui.DefaultFolder , NombreUltimoFichero)
	Else
		IncidenciasPendientes
	End If
End Sub

Sub sftpDHL_DownloadCompleted (ServerPath As String, Success As Boolean)
	frm.RootPane.MouseCursor= fx.Cursors.DEFAULT
	If Not(Success) Then
		fx.Msgbox(frm,"Error descargando fichero de estado expediciones.","Error")
		Return
	End If
	IncidenciasPendientes
End Sub


'Sub CargaListaIncidenciasDHL
'
'End Sub


Sub IncidenciasPendientes
	'CargaListaIncidenciasDHL
	Dim lstCodigosEstadosDHL As List
	lstCodigosEstadosDHL.Initialize
	Dim su As StringUtils
	'lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,"CodigosIncidenciasDHL.csv",";")
	lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,"incidencias_carretera.csv",";")
	
	Dim lstEnviosRepartidos As List
	lstEnviosRepartidos.Initialize
	
	Dim lstEnviosNoEntregadosDHL As List
	lstEnviosNoEntregadosDHL.Initialize
	Dim lstLineasFichero As List
	'lstLineasFichero = File.ReadList(File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
	lstLineasFichero = File.ReadList(xui.DefaultFolder , NombreUltimoFichero)
	Dim DateFormatAnt As String=DateTime.DateFormat
	'Dim TimeFormatAnt As String=DateTime.TimeFormat
	DateTime.DateFormat="yyyyMMdd"
	'DateTime.TimeFormat="HHmmss"
	For i = 0 To lstLineasFichero.Size - 1
		LogColor(lstLineasFichero.Get(i),xui.Color_Blue)
		Dim sLin As String=lstLineasFichero.Get(i)
		Dim m As Map
		m.Initialize
		m.Put("NumExpedicion",sLin.SubString2(47,62))
		m.Put("Referencia",sLin.SubString2(12,46).Trim)
		'm.Put("TipoRegistro",sLin.SubString2(62,64))
		Dim ClaveSituacion As String=sLin.SubString2(64,66).Trim
		Dim PuntoGeneracion As String=sLin.SubString2(140,143)
		Dim Evento As String=sLin.SubString2(143,146)
		Dim Motivo As String=sLin.SubString2(146,149)
		Dim DescripcionSituacion As String
		For Each sClave() As String In lstCodigosEstadosDHL
			'Log(sClave(0))
			If sClave(0) & "#/#" & sClave(3) & "#/#" & sClave(4) =ClaveSituacion & "#/#" & Evento & "#/#" & Motivo Then
				DescripcionSituacion=sClave(1)
				Exit
			End If
		Next
		Dim d As String =DescripcionSituacion
		Dim DescripcionSituacionCorregida As String
		Dim ma As Matcher
		ma = Regex.Matcher("(-?[0-9]+(?:[,.][0-9]+)?)",d)
		If ma.Find Then
			Log(ma.Match)
			DescripcionSituacionCorregida=ma.Match
		Else
			DescripcionSituacionCorregida=DescripcionSituacion
		End If
		m.Put("DescripcionSituacion",DescripcionSituacionCorregida)
		Dim sFecha As String=sLin.SubString2(66,74)
		m.Put("Fecha",DateTime.DateParse(sFecha))
		Dim sHora As String=sLin.SubString2(74,80)
		'm.Put("Hora",DateTime.TimeParse(sHora))
		m.Put("Hora",sHora.SubString2(0,2) & ":" & sHora.SubString2(2,4) & "." & sHora.SubString(4))
		Dim Observaciones As String=sLin.SubString2(90,140)
		Dim ObservacionesCorregidas As String
		Dim d As String =Observaciones
		Dim ma As Matcher
		ma = Regex.Matcher("(-?[0-9]+(?:[,.][0-9]+)?)",d)
		If ma.Find Then
			Log(ma.Match)
			ObservacionesCorregidas=ma.Match
		Else
			ObservacionesCorregidas=Observaciones
		End If
		m.Put("Observaciones",ObservacionesCorregidas)
		LogColor("Estado Expedicion " & m,xui.Color_Gray)
		lstEnviosNoEntregadosDHL.Add(m)
		If DescripcionSituacion="repartido" Then
			lstEnviosRepartidos.Add(m.Get("NumExpedicion"))
		End If
		
	Next
	DateTime.DateFormat=DateFormatAnt
	'DateTime.TimeFormat=TimeFormatAnt

	DBUtils.InsertMaps(mSQL,"tblExpedicionesIncidenciasDHL",lstEnviosNoEntregadosDHL)

	For Each NumExpRepartida As String In lstEnviosRepartidos
		mSQL.ExecNonQuery2("delete from tblExpedicionesIncidenciasDHL where NumExpedicion=?",Array As Object(NumExpRepartida))
	Next
	
'	' Solicitar el estado ACTUAL de las expediciones pendientes
'	Wait For(CargaTokeWebServiceDHL) complete (sResp As String)
'	If sResp="OK" Then
'		Dim rs As ResultSet=mSQL.ExecQuery("select distinct NumExpedicion from tblExpedicionesIncidenciasDHL")
'		Do While rs.NextRow
'			Wait For(ActualizarInfoExpedicionDHL(rs.GetString("NumExpedicion"))) complete (mResp As Map)
'		Loop
'		rs.Close
'	
'	Else
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible gestionar el acceso al web server de DHL. Sólo se mostrará la información del fichero FTP (es posible que la información no esté totalmente actualizada. Revisar las expediciones mediante la accion correspondiente en el menú contextual (botón derecho)","Aviso")
'		Wait For (msa) Msgbox_Result
'	End If
	
	
	wait for (ActualizarDatosTabla(lstEnviosNoEntregadosDHL)) complete (rObj As Object)
End Sub

Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblExpedicionesIncidenciasDHL"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblExpedicionesIncidenciasDHL")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblExpedicionesIncidenciasDHL (")
	

	sbCrearTabla.Append("NumExpedicion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Referencia TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("DescripcionSituacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Hora TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Observaciones TEXT COLLATE NOCASE)")

	mSQL.ExecNonQuery(sbCrearTabla.ToString)

End Sub

Sub btnSalir_Click
	SalirModulo
End Sub

Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub

Sub jamTableViewExpedicionesNoEntregadas_AccionSalirJamTableView
	jamTableViewExpedicionesNoEntregadas.GuardarConfiguracionColumnasUsuario
	jamTableViewExpedicionesNoEntregadas.LimpiarTabla
	frm.Close
	MainMenu2.Show
End Sub

Sub jamTableViewExpedicionesNoEntregadas_ContextMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "Documentos NAV de la expedicion"
			Dim IDTransporteDHL As Int=1
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableViewExpedicionesNoEntregadas.GetDatosCeldaSeleccionada
			Dim mPK As Map=DCS.mDataPK
			Dim ExpedicionDHL As String=mPK.Get("NumExpedicion")
			DatosDocumentosExpedicionDHL(ExpedicionDHL.Trim)
		
		Case "TrazabilidadExpedicionWebDHL"
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableViewExpedicionesNoEntregadas.GetDatosCeldaSeleccionada
			Dim mPK As Map=DCS.mDataPK		
			Dim ExpedicionDHL As String=mPK.Get("NumExpedicion")
			fx.ShowExternalDocument("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo=" & ExpedicionDHL & "&anno=2017&lang=sp")
	End Select
End Sub

Sub ActualizarDatosTabla(lstDatos As List) As ResumableSub
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesIncidenciasDHL")
	
	'Dim rSub As ResumableSub=jamTableViewExpedicionesNoEntregadas.setdata(lstDatos)
	Dim rSub As ResumableSub=jamTableViewExpedicionesNoEntregadas.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	lstDatos.Initialize
	rs.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgAviso") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			ExitApplication
		End If
	End If
	Return Null
End Sub

Sub DocumentosExpedicionDHLNoWebService(NumExp As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="DocumentosExpedicionDHLNoWebService"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(NumExp), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de documentos NAV para la expedicion de DHL seleccionada (" & NumExp & ")","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub


Sub DatosDocumentosExpedicionDHL(NumExp As String)
	Wait For(DocumentosExpedicionDHLNoWebService(NumExp)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")

	
	Dim lstOpciones As List
	lstOpciones.Initialize
	
	For Each mData As Map In lstReg
		Dim DocExp As String=mData.Get("Documento")
		Dim Fecha As Long=mData.Get("FechaHoraMov")
		If DateTime.GetYear(Fecha)=DateTime.GetYear(DateTime.Now) Then
			If DocExp<>"" Then
				If lstOpciones.IndexOf(DocExp)=-1 Then
					lstOpciones.Add(mData.Get("Documento"))
				End If
			End If
		End If
	Next

	
'''	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	
	Dialog.Title="Selecciona Documento NAV"
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize
	
	Utilidades.SetLightThemeDialog(Dialog)
	Utilidades.SetLightThemeList(B4XListDlg)


	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
		

	
	B4XListDlg.Options=lstOpciones
	
	'Dialog.Resize(500dip, 400dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,60dip)
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
	
'''	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim DocSel As String=B4XListDlg.SelectedItem
	Select True
		Case DocSel.StartsWith("ALBV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico Albaranes Venta",130, "No.", DocSel)
		Case DocSel.StartsWith("RT")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico recep. transferencia",5745, "No.", DocSel)
		Case DocSel.StartsWith("CDEV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico envío devolución",6650, "No.", DocSel)
		Case Else
			Dim msa As Object=xui.MsgboxAsync("No es posible abrir la ficha de navision del documento " &DocSel ,"Aviso")
			Wait For (msa) Msgbox_Result
	End Select
End Sub


Sub ExpedicionInternaExpedicionTransporte(IDTransporte As Int, NumExp As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="DatosExpedicionInternaExpedicionTransporte"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTransporte,NumExp), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso")
			Wait For (msa) Msgbox_Result
		Else

			Dim lstReg As List=mResult.Get("lstRes")
			Dim mRespuesta As Map=lstReg.Get(0)
			Dim sResp As String=mRespuesta.GetValueAt(0)
			If sResp.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error recuperando datos del SP " & Comando & "." & CRLF & CRLF & sResp,"Aviso")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub


Sub CargaCredenciales As ResumableSub
	
	Wait For(CargaDatosWebServiceTransporte(1)) complete (mRes As Map)   '17 es el IDTransporte en DatosComunes para DHL
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
Sub ActualizarInfoExpedicionDHL(IDDatoBuscado As String) As ResumableSub
	Dim AccionTracking As String
	Dim lstResultadoTracking As List
	lstResultadoTracking.Initialize
	
'	Dim mResultadoTracking As Map
'	mResultadoTracking.Initialize

''	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.WAIT)
'	Wait For(CargaDatosWebServiceTransporte(1)) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
''	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.DEFAULT)
'	If Accion="NOK" Then
'		AccionTracking="ErrorWS"
'		Dim msa As Object=xui.MsgboxAsync("Error credenciales DHL","Error")
'		Wait For (msa) Msgbox_Result
'		Return Accion
'	End If
'	Dim lstRes As List=mRes.Get("lstRes")
'	Dim mCred As Map=lstRes.Get(0)
'	Dim CredUser As String=mCred.Get("UsuarioWS")
'	Dim CredPswd As String=mCred.Get("PasswordWS")
	

	
'	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.WAIT)
	Wait For (EnvioDatosWebServiceDHL(IDDatoBuscado,accessToken)) complete (sResponse As String)
'	jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.DEFAULT)
	If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
		AccionTracking="ErrorWS"
		Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web service de DHL."  & CRLF & CRLF & sResponse,"Error de comunicación")
		Wait For (msa) Msgbox_Result (Result As Int)
		Dim mResTrack As Map
		mResTrack.Initialize
		mResTrack.Put("AccionTracking",AccionTracking)
		Return mResTrack
		
	Else   ' el web service de  DHL ha respondido y la respuesta ha llegado
		Log(sResponse)
		Dim jp As JSONParser
		jp.Initialize(sResponse)
		lstResultadoTracking=jp.NextArray
		
		'Log(lstWSResponse)
		'Dim mResponse As Map=
		

		
		Dim DateFormatAnt As String=DateTime.DateFormat
		Dim TimeFormatAnt As String=DateTime.TimeFormat
'		DateTime.DateFormat="yyyy-MM-dd"
'		DateTime.TimeFormat="HH-mm-ss"

		For Each m As Map In lstResultadoTracking
			DateTime.DateFormat="yyyy-MM-dd'T'HH:mm:ss"
			Log("m recibido" & m)
			Dim sFechaHora As String=m.Get("DateTime")
			sFechaHora=sFechaHora.Replace("T"," ")
			Dim Fh() As String=Regex.Split(" ",sFechaHora)
			Dim lFechaHora As Long=DateTime.DateParse(m.Get("DateTime"))
			DateTime.DateFormat="dd/MM/yyyy"
			sFechaHora=DateTime.Date(lFechaHora) & " " & Fh(1)
			Log("m modificado " & m)
		Next
		DateTime.DateFormat=DateFormatAnt
		DateTime.TimeFormat=TimeFormatAnt
		
		Dim mResTrack As Map
		mResTrack.Initialize
		mResTrack.Put("AccionTracking",AccionTracking)
		mResTrack.Put("lstResultadoTracking",lstResultadoTracking)
		Return mResTrack
	End If

End Sub



Sub EnvioDatosWebServiceDHL(IDDatoEnvioBuscado As String, Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)

	'Dim URLDhlTrackTrace As String="https://external.dhl.es/cimapi/api/v1/customer/track?id=" & IDDatoEnvioBuscado & "&idioma=es&Show=status"
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


Sub CargaTokeWebServiceDHL As ResumableSub
	' comprobar si tenemos ya el token, y si éste no ha expirado
	Dim su As StringUtils
	'Dim accessToken As String
	accessToken=""
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
		Wait For(ObtenerTokensWebServiceDHL(UsuarioWS,PasswordWs)) complete (mJobResponse As Map)  ' HABRIA QUE BLOQUEAR TODOS LOS EVENTOS HASTA QUE LLEGUE (O FALLE) LA RESPUESTA, PARA IMPEDIR ACCIONES DEL USUARIO ...
		'Log("WSResponse " & sResponse)
		'jamTableViewFasesDocumento.SetMouseCursor(fx.Cursors.DEFAULT)
		Dim sResponse As String=mJobResponse.Get("sRespuestaWebService")
		If sResponse.StartsWith("ERROR HTTPJob") Then  ' ha fallado el httpJob
			
			Dim msa As Object = xui.MsgboxAsync("Ha fallado la llamada al web  service de DHL" & CRLF & CRLF & _
				"El error puede estar en el servidor de DHL, o en la conexion a internet. Inténtalo más tarde.","Error de comunicación")
			Wait For (msa) Msgbox_Result (Result As Int)
			Return "ErrorWS"
		Else   ' el web service de DHL ha respondido y la respuesta ha llegado. En el caso de la API de españa es 1 STRING (NO UN json)
			Dim Cookie As String=mJobResponse.Get("Cookie")
			Log("Cookie " & Cookie)

			accessToken=mJobResponse.Get("Token")
			Log("accessToken " & accessToken)
			'el token expira en 30 minutos. Ponemos 20, para tener un margen de seguridad
		
			Dim Expiration As Long=DateTime.Now+(DateTime.TicksPerMinute)*20
			Dim lstRegistros As List
			lstRegistros.Initialize
			lstRegistros.Add(Array As String(Expiration,accessToken,Cookie))
			su.SaveCSV2(Main.UserTempFolder,"info.csv",",",lstRegistros,Array As String("Expiration","Token","Cookie"))
			Return "OK"
		End If
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

 