﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=4.45
@EndOfDesignText@
'Class module
#Event: FilesAndFoldersFinish(DirListing As List, FileListing as List)
#Event: ListFilesFinish(FileListing as List)
#Event: ListFoldersFinish(DirListing as List)
#Event: DirListingError(error As String)
Sub Class_Globals
	Private EventName As String
	Private CallBack As Object
	Private DirListing As List 	
	Private FileListing As List
End Sub

'Initializes the object "wildcardlisting".
'vCallback  = Reference to Activityobject in which the Events should be fired
'vEventname = prefix for Events to be used
Public Sub Initialize (vCallback As Object, vEventName As String)
	Log("wcl.Initialize("&vEventName&")")
	EventName = vEventName
	CallBack = vCallback
	DirListing.Initialize
	FileListing.Initialize
End Sub

' Lists all folders 
' Path      = Starting path. eg. File.DirRootExternal
' Recursive = use recursive search (true/false)
' Sorted    = The resulting Directory-Listing or File-Listing will be sorted 
'             or not (true/false)
' Ascending = The resulting Directory-Listing or File-Listing will be sorted 
'             Ascending (true/false)
' The Event DirListingFinish will be fired when it finishes.
' The list which will returned in this event will be cleared before this sub runs
' The Event DirListingError will be fired when the given path is not Valid
'
Sub ListFolders(Path As String, Recursive As Boolean, Sorted As Boolean, Ascending As Boolean)
	Log("ListFolders("&Path&")")
	If DirListing.IsInitialized Then
		DirListing.Clear
	Else
		DirListing.Initialize
	End If
	GetDirs(Path, Recursive, "", Sorted, Ascending, False, True)
	Log("Dirlisting.Size = "&DirListing.Size)
	If Sorted Then
		DirListing.SortCaseInsensitive(Ascending)
	End If
	If SubExists(CallBack, EventName & "_ListFoldersFinish") Then
		CallSubDelayed2(CallBack, EventName & "_ListFoldersFinish", DirListing)
	Else
		Log("Event sub ListFoldersFinish should be fire but cannot be found")
	End If
End Sub

' Lists all mathing files 
' Path      = Starting path. eg. File.DirRootExternal
' Recursive = use recursive search (true/false)
' Wildcards = wildcards to use to find FILES. It is only effected on files. 
'             If using recursive search ALL directorys will be scanned but it 
'             will only find those files who matches one of the wildcards.
'             eg: "*.log, *.txt"
'             "*.jpg, *.png"
'             Wildcards is a comma separated list with one or more entries
' Sorted    = The resulting Directory-Listing or File-Listing will be sorted 
'             or not (true/false)
' Ascending = The resulting Directory-Listing or File-Listing will be sorted 
'             Ascending (true/false)
' The Event ListFilesFinish will be fired when it finishes.
' The list of files which will returned in this event will NOT be cleared before this sub runs
' The Event DirListingError will be fired when the given path is not Valid
'
Sub ListFiles(Path As String, Recursive As Boolean, WildCards As String, Sorted As Boolean, Ascending As Boolean)
	Log("ListFiles("&Path&","&WildCards&")")
	If DirListing.IsInitialized Then
		DirListing.Clear
	Else
		DirListing.Initialize
	End If
	If FileListing.IsInitialized Then
		FileListing.Clear
	Else
		FileListing.Initialize
	End If
	GetDirs(Path, Recursive, WildCards, Sorted, Ascending, True, False)
	Log("Filelisting.Size = "&FileListing.Size)
	If Sorted Then
		FileListing.SortCaseInsensitive(Ascending)
	End If
	If SubExists(CallBack, EventName & "_ListFilesFinish") Then
		CallSubDelayed2(CallBack, EventName & "_ListFilesFinish", FileListing)
	Else
		Log("Event sub ListFilesFinish should be fire but cannot be found")
	End If
End Sub

' Lists all found folders and all mathing files 
' Path      = Starting path. eg. File.DirRootExternal
' Recursive = use recursive search (true/false)
' Wildcards = wildcards to use to find FILES. It is only effected on files. 
'             If using recursive search ALL directorys will be scanned but it 
'             will only find those files who matches one of the wildcards.
'             eg: "*.log, *.txt"
'             "*.jpg, *.png"
'             Wildcards is a comma separated list with one or more entries
' Sorted    = The resulting Directory-Listing or File-Listing will be sorted 
'             or not (true/false)
' Ascending = The resulting Directory-Listing or File-Listing will be sorted 
'             Ascending (true/false)
' The Event DirListingFinish will be fired when it finishes.
' The lists which will returned in this event will be cleared before this sub runs
' The Event DirListingError will be fired when the given path is not Valid
'
Sub ListFilesAndFolders(Path As String, Recursive As Boolean, WildCards As String, Sorted As Boolean, Ascending As Boolean)
	Log("ListFilesAndFolders("&Path&","&WildCards&")")
	ClearLists
	GetDirs(Path, Recursive, WildCards, Sorted, Ascending, True, True)
	Log("Filelisting.Size = "&FileListing.Size)
	Log("Dirlisting.Size = "&DirListing.Size)
	If Sorted Then
		DirListing.SortCaseInsensitive(Ascending)
	End If
	If Sorted Then
		FileListing.SortCaseInsensitive(Ascending)
	End If
	If SubExists(CallBack, EventName & "_FilesAndFoldersFinish") Then
		CallSubDelayed3(CallBack, EventName & "_FilesAndFoldersFinish", DirListing, FileListing)
	Else
		Log("Event sub FilesAndFoldersFinish should be fire but cannot be found")
	End If
End Sub

'
' Clears the intern Dir- and File-lists which will be used when firing the event DirListingFinish
Sub ClearLists
	If DirListing.IsInitialized Then
		DirListing.Clear
	Else
		DirListing.Initialize
	End If
	If FileListing.IsInitialized Then
		FileListing.Clear
	Else
		FileListing.Initialize
	End If
End Sub


Private Sub GetDirs(Path As String, Recursive As Boolean, WildCards As String, _
  Sorted As Boolean, Ascending As Boolean, vListFiles As Boolean, vListDirs As Boolean)
	'Log("wcl.GetDirs("&Path&")")
	Dim GetCards() As String = Regex.Split(",", WildCards)
  Dim mask As String
	Dim pattern As String
  If File.IsDirectory("", Path) Then
		Dim FilesFound As List = File.ListFiles(Path)
		For i = 0 To FilesFound.Size -1
			If File.IsDirectory(Path,FilesFound.Get(i)) Then
				' F:\\$RECYCLE.BIN
				Log(Path&"\"&FilesFound.Get(i))
				If FilesFound.Get(i) = "$RECYCLE.BIN" Then
				else If FilesFound.Get(i) = "System Volume Information" Then
				Else
					If vListDirs Then
						DirListing.Add(Path&"\"&FilesFound.Get(i))
					End If
					If Recursive Then
						GetDirs(Path&"\"&FilesFound.Get(i), Recursive, WildCards, Sorted, Ascending, vListFiles, vListDirs)
					End If
				End If
			Else
				Log(Path&"\"&FilesFound.Get(i))
		    If vListFiles Then
					For l = 0 To GetCards.Length -1
			      Dim TestItem As String = FilesFound.Get(i)
						mask = GetCards(l).Trim
						pattern = "^"&mask.Replace(".","\.").Replace("*",".+").Replace("?",".")&"$"
						If Regex.IsMatch(pattern,TestItem) = True Then
							FileListing.Add(Path&"\"&FilesFound.Get(i))
						End If
			    Next
				End If
			End If
		Next
	Else
		If SubExists(CallBack, EventName & "_DirListingError") Then
			CallSub2(CallBack, EventName & "_DirListingError", "La ruta seleccionada ''"&Path&"'' debe ser un directorio válido.")
		Else
			Log("Event sub DirListingError not found")
		End If
	End If
End Sub


