    Option Explicit
	On Error Resume Next
	Dim xOLApp
	Dim objStdOut,objStdErr
	
	Set objStdOut = WScript.StdOut
	Set objStdErr = WScript.StdErr
	
    'Set xOLApp = CreateObject("Outlook.Application")
	Set xOLApp =GetObject(, "Outlook.Application")
	if Err<>0 then
		if Err.Number=429 then 
			'MsgBox "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
			objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
		else
			'MsgBox Err.Number & " " & Err.Description
			objStdErr.Write Err.Number & " " & Err.Description
		end if
		WScript.Quit (1) 'return code 1
	end if
	
	Dim sAccounts
	For i = 1 To xOLApp.Session.Accounts.count
		 sAccounts =  "Cuentas," & sAccounts & xOLApp.Session.Accounts.Item(i)
	Next
	Set xOLApp = Nothing
	If Err.Number = 0 Then
		Set objStdOut = WScript.StdOut
		objStdOut.Write sAccounts
		'msgbox sAccounts
		WScript.Quit (0)
	else
		Set objStdErr = WScript.StdErr
		objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
		'msgbox Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
		WScript.Quit (1)
	end if
	
	
	
	
		
