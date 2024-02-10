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
	
	Dim mSQL As SQL
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub Show
	If frm.IsInitialized=False Then
		frm.Initialize("frm",Main.xScreen, Main.yScreen)
		frm.Icon = Main.IconoFormularios
		'frm.RootPane.LoadLayout("scrMainMenu2")
		Dim joForm As JavaObject = frm
		Dim joStage As JavaObject = joForm.GetField("stage")
		joStage.RunMethod("setMaximized", Array(True))
		frm.RootPane.LoadLayout("scrExpedicionesDHLNoEntregadas")
		Sleep(0)
		frm.Title="Expediciones DHL"
		
		sFtpDHL.Initialize("sftpDHL", "tak3uada", "xfG2&rNpe!fD8QYP", "sftp3.dhl.com", 4222)
		sFtpDHL.SetKnownHostsStore(File.DirApp, "hosts.txt")
		
		jamTableViewExpedicionesNoEntregadas.EstadoMenuItem(jamTableViewExpedicionesNoEntregadas.MenuBarAcciones,False)
		jamTableViewExpedicionesNoEntregadas.EstadoMenuItem(jamTableViewExpedicionesNoEntregadas.MenuBarLinea,False)
		
		Dim rSub As ResumableSub=jamTableViewExpedicionesNoEntregadas.ConfigurarTableView("ExpedicionesNoEntregadasDHL.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.AliasCampoColumna="Fecha"
		CF.NombreFuncionCellFactory=jamTableViewExpedicionesNoEntregadas.CellFactory_ColumnaFecha
		CF.CellFactoryEnCallBack=False
		CF.params=Null
		jamTableViewExpedicionesNoEntregadas.SetCellFactory(CF)
	
	End If

	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	CreacionTablasSQLite
	
	frm.Show
	
	Dim joForm As JavaObject=asJO(frm)
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized",Array(True))
'	If Args.Length>0 Then
'	Dim AlmacenSalida As String=Args(0)
'		Dim NumExpedicion As String=Args(1)
	'
'		Dim Solicitante As String
'		
'		Select True
'			Case AlmacenSalida="PROIN"
'				Solicitante="I519390001"
'			Case AlmacenSalida="PROTEC"
'				Solicitante="I519390002"
'		End Select
'		
'		
'		ActualizarInfoExpedicion(Solicitante,NumExpedicion)
'	End If

	frm.RootPane.MouseCursor= fx.Cursors.WAIT
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
	Dim res As Int = fx.Msgbox2(frm,Message, "", "Yes", "", "No",Null)
	'The next line might be a bit confusing. It is a condition.
	'The value will be True if res equals to DialogResponse.POSITIVE.
	sFtpDHL.SetPromptResult(res = fx.DialogResponse.POSITIVE)
   
	'sftp1.SetPromptResult(True)
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
	If File.Exists(File.DirData("TrackingExpedicionesDHL"),NombreUltimoFichero)=False Then
		Dim RutaUltimoFichero As String="out/work" & "/" & NombreUltimoFichero
		frm.RootPane.MouseCursor= fx.Cursors.WAIT
		sFtpDHL.DownloadFile(RutaUltimoFichero, File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
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
	lstLineasFichero = File.ReadList(File.DirData("TrackingExpedicionesDHL") , NombreUltimoFichero)
	Dim DateFormatAnt As String=DateTime.DateFormat
	'Dim TimeFormatAnt As String=DateTime.TimeFormat
	DateTime.DateFormat="yyyyMMdd"
	'DateTime.TimeFormat="HHmmss"
	For i = 0 To lstLineasFichero.Size - 1
		Log(lstLineasFichero.Get(i))
		Dim sLin As String=lstLineasFichero.Get(i)
		Dim m As Map
		m.Initialize
		m.Put("NumExpedicion",sLin.SubString2(47,62))
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
		m.Put("DescripcionSituacion",DescripcionSituacion)
		Dim sFecha As String=sLin.SubString2(66,74)
		m.Put("Fecha",DateTime.DateParse(sFecha))
		Dim sHora As String=sLin.SubString2(74,80)
		'm.Put("Hora",DateTime.TimeParse(sHora))
		m.Put("Hora",sHora.SubString2(0,2) & ":" & sHora.SubString2(2,4) & "." & sHora.SubString(4))
		m.Put("Observaciones",sLin.SubString2(90,140))
		Log("Estado Expedicion " & m)
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
	
	
	
	ActualizarDatosTabla(lstEnviosNoEntregadosDHL)
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
	sbCrearTabla.Append("DescripcionSituacion TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Hora TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Observaciones TEXT COLLATE NOCASE)")

	mSQL.ExecNonQuery(sbCrearTabla.ToString)

End Sub

Sub btnSalir_Click
	frm.Close
	MainMenu2.Show
End Sub

Sub jamTableViewExpedicionesNoEntregadas_AccionSalirJamTableView
	jamTableViewExpedicionesNoEntregadas.GuardarConfiguracionColumnasUsuario
	jamTableViewExpedicionesNoEntregadas.LimpiarTabla
	frm.Close
	MainMenu2.Show
End Sub

Sub ActualizarDatosTabla(lstDatos As List)
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
End Sub