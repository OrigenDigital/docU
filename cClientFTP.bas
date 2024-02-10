B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private LocalPath As String = "C:\"
	Private FTPPath As String = "/"
	Private sFTP As FTP
	
	Dim xui As XUI
	
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
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Show
End Sub

Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("mainFTP")
	frm.Show

	SplitPane1.LoadLayout("local")
	SplitPane1.LoadLayout("ftp")
	
	DragAndDrop1.Initialize(Me)
	DragAndDrop1.MakeDragTarget(TreeViewFTP, "DropTarget")
	
	If File.Exists(File.DirApp,"save.map") Then
		Dim M As Map = File.ReadMap(File.DirApp,"save.map")
		LocalPath=M.Get("localpath")
		TextFTP.Text=M.Get("host")
		TextUser.Text=M.Get("user")
		TextPassword.Text=M.Get("password")
	Else
		Dim M As Map = CreateMap("localpath":LocalPath,"host":"","user":"","password":"")
		File.WriteMap(File.DirApp,"save.map",m)
	End If
	
	TreeViewFTP.SetCheckBoxesMode
	TreeViewLocal.SetCheckBoxesMode
	
	SD_LoadingIndicator1.Hide

	refreshtree
End Sub



#Region Event

Private Sub MenuBar1_Action
	Dim mi As MenuItem = Sender
	
	Select mi.Text
		Case "_Load"
			Dim FC As FileChooser
			FC.Initialize
			FC.InitialDirectory = File.DirData("clientFTP")
			FC.InitialFileName = ""
			FC.Title = "Selezione il file Credenziali da caricare"
			FC.SetExtensionFilter("Credenziali", Array As String("*.crd"))
			Dim Choix As String = FC.ShowOpen(frm)

			If Choix <> "" Then
				Dim M As Map = File.ReadMap("",Choix)
				TextFTP.Text=M.Get("host")
				TextUser.Text=M.Get("user")
				TextPassword.Text=M.Get("password")
			End If
		Case "_Save"
			Dim FC As FileChooser
			FC.Initialize
			FC.InitialDirectory = File.DirData("clientFTP")
			FC.InitialFileName = ""
			FC.Title = "Salva file Credenziali"
			FC.SetExtensionFilter("Credenziali", Array As String("*.crd"))
			Dim Choix As String = FC.ShowSave(frm)

			If Choix <> "" Then
				Dim M As Map = CreateMap("host":TextFTP.Text,"user":TextUser.Text,"password":TextPassword.Text)
				File.WriteMap("",Choix,m)
			End If
	End Select
End Sub

Private Sub TreeViewLocal_SelectedItemChanged (SelectedItem As TreeItem)
	If SelectedItem.IsInitialized Then
		TreeViewLocal.Root.Children.Clear
		Dim V As String = SelectedItem.Text
		If V=".." Then
			Dim i As Int = LocalPath.LastIndexOf("\")
			LocalPath=LocalPath.SubString2(0,i)
		Else
			If File.IsDirectory(LocalPath,v) Then LocalPath=File.Combine(LocalPath,v)
		End If
		refreshtree
	End If
End Sub

Private Sub TreeViewFTP_SelectedItemChanged (SelectedItem As TreeItem)
	If SelectedItem.IsInitialized Then
		TreeViewFTP.Root.Children.Clear
		Dim V As String = SelectedItem.Text
		If V=".." Then
			If FTPPath<>"/"  Then
				Dim i As Int = FTPPath.LastIndexOf("/")
				FTPPath=FTPPath.SubString2(0,i)
			End If
		Else
			If SelectedItem.Image.IsInitialized Then FTPPath=FTPPath & "/" & v
		End If
		refreshftp
	End If
End Sub

Private Sub ButtonConn_Click
	Dim host As String = TextFTP.Text
	Dim M As Map = File.ReadMap(File.DirApp,"save.map")
	
	Dim M As Map = CreateMap("localpath":LocalPath,"host":"","user":"","password":"")
	m.Put("host",host)
	M.Put("user",TextUser.Text)
	m.put("password",TextPassword.Text)
	File.WriteMap(File.DirApp,"save.map",m)
	
	sFTP.Initialize("sftp",host.Replace("ftp://","").Replace("/",""),21,TextUser.Text,TextPassword.Text)
	
	refreshftp
End Sub

Private Sub ButtonDisc_Click
	sFTP.Close
End Sub

Private Sub ButtonHome_Click
	LocalPath="C:\"
	refreshtree
End Sub

Private Sub ButtonRoot_Click
	FTPPath="/"
	refreshftp
End Sub


Private Sub VlocalPath_Action
	LocalPath=vLocalPath.Text
	refreshtree
End Sub

Private Sub vFTPpath_Action
	FTPPath=vFTPpath.Text
	refreshftp
End Sub

Private Sub TextInfo_TextChanged (Old As String, New As String)
	TextInfo.SetSelection(New.Length,New.Length)
End Sub

Private Sub ButtonFTPup_Click
	If FTPPath<>"/"  Then
		Dim i As Int = FTPPath.LastIndexOf("/")
		FTPPath=FTPPath.SubString2(0,i)
	End If
	refreshftp
End Sub

Private Sub ButtonLocalUp_Click
	Dim i As Int = LocalPath.LastIndexOf("\")
	LocalPath=LocalPath.SubString2(0,i)
	refreshtree
End Sub

Private Sub ButtonLocalDel_Click
	For Each tn As CheckboxTreeItem In TreeViewLocal.Root.Children
		If tn.Checked Then
			Log(tn.Text)
		End If
	Next
End Sub

Private Sub ButtonFTPdel_Click
	Wait For (xui.Msgbox2Async("Are you sure?","DELETE","Ok","","No, no no",Null)) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SD_LoadingIndicator1.Show
		For Each tn As CheckboxTreeItem In TreeViewFTP.Root.Children
			If tn.Checked Then
				wait for (deleteftp(FTPPath,tn.Text,tn.Image.IsInitialized)) COMPLETE (Success As Boolean)
			End If
		Next
		refreshftp
		SD_LoadingIndicator1.Hide
	End If
End Sub

Private Sub ButtonUpLoad_Click
	SD_LoadingIndicator1.Show
	
	For Each tn As CheckboxTreeItem In TreeViewLocal.Root.Children
		If tn.Checked Then
			Dim filename As String = File.Combine(LocalPath,tn.text)
			If File.IsDirectory("",filename) Then
				Wait For (upload(filename,FTPPath & "/" & File.GetName(filename))) complete (Success As Boolean)
				logInfo($"Create path: ${filename}: ${Success}"$)
			Else
				Wait For (upload(filename,FTPPath)) complete (Success As Boolean)
				logInfo($"Upload: ${filename}: ${Success}"$)
			End If
		End If
	Next
	refreshftp
	SD_LoadingIndicator1.Hide
End Sub

Private Sub ButtonDownLoad_Click
	SD_LoadingIndicator1.Show
	For Each tn As CheckboxTreeItem In TreeViewFTP.Root.Children
		If tn.Checked Then
			wait for (download(LocalPath,FTPPath,tn.Text,tn.Image.IsInitialized)) COMPLETE (Success As Boolean)
		End If
	Next
	refreshtree
	SD_LoadingIndicator1.Hide
End Sub

Private Sub ButtonRefresh_Click
	refreshftp
End Sub

Private Sub ButtonLocalRefresh_Click
	refreshtree
End Sub

#End Region

#region FTP

Private Sub sftp_UploadProgress (ServerPath As String, TotalUploaded As Long, Total As Long)
	
End Sub

#End Region

#Region Drag & DragAndDrop1

Sub DropTarget_DragEntered(e As DragEvent)
	Log("DragEntered")
	Dim clr As Int
	If IsValidDropEvent(e) And sFTP.IsInitialized Then
		clr = 0xFF007F46
	Else
		clr = 0xFFFF0000
	End If
	TreeViewFTP.As(B4XView).SetColorAndBorder(0xFFFFFFFF, 4dip, clr, 0)
End Sub

Sub DropTarget_DragExited(e As DragEvent)
	TreeViewFTP.As(B4XView).SetColorAndBorder(0xFFFFFFFF, 0, 0, 0)
End Sub

Sub DropTarget_DragOver(e As DragEvent)
	If IsValidDropEvent(e) Then e.AcceptTransferModes(TransferMode.COPY)
End Sub

Sub IsValidDropEvent(e As DragEvent) As Boolean
	Return e.GetDragboard.HasFiles
'	
'	If e.GetDragboard.HasFiles Then
'		Dim files As List = e.GetDragboard.GetFiles
'		If files.Size = 1 Then
'			Dim filename As String = files.Get(0)
'			Return filename.EndsWith(".txt")
'		End If
'		Return True
'	End If
'	Return False
End Sub

Sub DropTarget_DragDropped(e As DragEvent)
	Log("drag dropped")
	SD_LoadingIndicator1.Show
	For Each filename As String In e.GetDragboard.GetFiles
		If File.IsDirectory("",filename) Then
			Wait For (upload(filename,FTPPath & "/" & File.GetName(filename))) complete (Success As Boolean)
			logInfo($"Create path: ${filename}: ${Success}"$)
		Else
			Wait For (upload(filename,FTPPath)) complete (Success As Boolean)
			logInfo($"Upload: ${filename}: ${Success}"$)
		End If
	Next

	e.SetDropCompleted(True)
	SD_LoadingIndicator1.Hide
	
	refreshftp
End Sub

#End Region

#Region Function

Public Sub refreshtree
	If LocalPath.EndsWith(":") Then LocalPath=LocalPath & "\"
	If File.Exists(LocalPath,"") = False Then LocalPath = "C:\"
	
	TreeViewLocal.Root.Children.Clear
	vLocalPath.Text=LocalPath
	scanpath(LocalPath,TreeViewLocal.Root)
End Sub

Public Sub refreshftp
	FTPPath=FTPPath.Replace("//","/")
	If FTPPath="" Then FTPPath="/"
	vFTPpath.Text=FTPPath
	sFTP.List(FTPPath)
	
	Wait For sftp_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
	
	If ServerPath=FTPPath Then
		TreeViewFTP.Root.Children.Clear
		For Each fname As FTPEntry In Folders
			Dim fti As CheckboxTreeItem
			fti.Initialize("ti",fname.Name)
			fti.Image=fx.LoadImageSample(File.DirAssets,"folder.png",16,16)
			fti.Checked=False
			TreeViewFTP.Root.Children.Add(fti)
		Next
	
		For Each fname As FTPEntry In Files
			Dim fti As CheckboxTreeItem
			fti.Initialize("ti",fname.Name)
			fti.Checked=False
			TreeViewFTP.Root.Children.Add(fti)
		Next
	End If
End Sub

Private Sub scanpath(path As String, ti As TreeItem)
	Dim l As List = File.ListFiles(path)
	
	If path.EndsWith(":\")=False Then
		Dim fti As CheckboxTreeItem
		fti.Initialize("ti","..")
		fti.Checked=False
		fti.Image=fx.LoadImageSample(File.DirAssets,"folder.png",16,16)
		ti.Children.Add(fti)
	End If
	If l.IsInitialized Then
		l.Sort(True)
		For Each fname As String In l
			If fname.StartsWith("$")=False Then
				If File.IsDirectory(path,fname) Then
					Dim fti As CheckboxTreeItem
					fti.Initialize("ti",fname)
					fti.Image=fx.LoadImageSample(File.DirAssets,"folder.png",16,16)
					fti.Checked=False
					ti.Children.Add(fti)
				End If
			End If
		Next
		For Each fname As String In l
			If fname.StartsWith("$")=False Then
				If File.IsDirectory(path,fname)=False Then
					Dim fti As CheckboxTreeItem
					fti.Initialize("ti",fname)
					fti.Checked=False
					ti.Children.Add(fti)
				End If
			End If
		Next
	End If
End Sub

Private Sub logInfo(Text As String)
	TextInfo.Text=TextInfo.Text & Text & CRLF
End Sub


Private Sub upload(local_filepath As String, ftp_path As String) As ResumableSub
	Dim Res As Boolean = False
	
	If File.IsDirectory("",local_filepath) Then
		sFTP.SendCommand("MKD", ftp_path)
		
		Wait For sftp_CommandCompleted (Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
		If ReplyCode="550" Then Success=True
		Res=Success
		If Success Then
			For Each filename As String In File.ListFiles(local_filepath)
				If File.IsDirectory(local_filepath,filename) Then
					'Log("P:" & ftp_path & "/" & filename)
					Wait For (upload(local_filepath & "\" & filename,ftp_path & "/" & filename)) COMPLETE (Success As Boolean)
					logInfo($"Create path: ${filename}: ${Success}"$)
				Else
					'Log("f:" & ftp_path & "-" & filename)
					Wait For (upload(local_filepath & "\" & filename,ftp_path)) complete (Success As Boolean)
					logInfo($"Upload: ${filename}: ${Success}"$)
				End If
			Next
		End If
	Else
		Dim Ph As String = File.GetFileParent(local_filepath)
		Dim fn As String = File.GetName(local_filepath)
		sFTP.UploadFile(Ph,fn,False,ftp_path & "/" & fn)
	
		Wait For sftp_UploadCompleted (ServerPath As String, Success As Boolean)
		Res=Success
	End If

	Return Res
End Sub

Private Sub deleteftp(ftp_path As String, ftp_file As String, IsDir As Boolean) As ResumableSub
	Dim Res As Boolean = False
	
	If IsDir Then
		sFTP.List(ftp_path & "/" & ftp_file)
		
		Wait For sftp_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
		
		For Each fname As FTPEntry In Folders
			Dim filename As String = fname.Name
			Wait For (deleteftp(ftp_path & "/" & ftp_file, filename,True)) COMPLETE (Success As Boolean)
		Next

		For Each fname As FTPEntry In Files
			Dim filename As String = fname.Name
			Wait For (deleteftp(ftp_path & "/" & ftp_file, filename,False)) COMPLETE (Success As Boolean)
		Next
		
		sFTP.SendCommand("RMD",ftp_path & "/" & ftp_file)
		Wait For sftp_CommandCompleted (Command As String, Success As Boolean, ReplyCode As Int, ReplyString As String)
		logInfo($"Delete path: ${ftp_path & "/" & ftp_file}: ${Success}"$)
	Else
		sFTP.DeleteFile(ftp_path & "/" & ftp_file)
	
		Wait For sftp_DeleteCompleted (ServerPath As String, Success As Boolean)
		logInfo($"Delete file: ${ftp_path & "/" & ftp_file}: ${Success}"$)
		Res=Success
	End If
	
	Return Res
End Sub

Private Sub download(local_path As String, ftp_path As String, ftp_file As String, IsDir As Boolean) As ResumableSub
	Dim Res As Boolean = False
	
	If IsDir Then
		sFTP.List(ftp_path & "/" & ftp_file)
		
		File.MakeDir(local_path, ftp_file)
		
		Wait For sftp_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)
		
		For Each fname As FTPEntry In Folders
			Dim filename As String = fname.Name
			Wait For (download(File.Combine(local_path,ftp_file),ftp_path & "/" & ftp_file, filename,True)) COMPLETE (Success As Boolean)
		Next

		For Each fname As FTPEntry In Files
			Dim filename As String = fname.Name
			Wait For (download(File.Combine(local_path,ftp_file),ftp_path & "/" & ftp_file, filename,False)) COMPLETE (Success As Boolean)
		Next
		
	Else
		sFTP.DownloadFile(ftp_path & "/" & ftp_file,False,local_path,ftp_file)
	
		Wait For sftp_DownloadCompleted (ServerPath As String, Success As Boolean)
		logInfo($"Download file: ${ftp_path & "/" & ftp_file}: ${Success}"$)
		Res=Success
	End If
	
	Return Res
End Sub

#End Region