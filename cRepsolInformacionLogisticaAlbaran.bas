B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	
	Private xui As XUI
	Private mSQL As SQL
	
	Private jamLoadingIndicator1 As JamLoadingIndicator
	Private Dialog As B4XDialog
	Private btnSalir As B4XView
	Private btnSeleccionarDocumento As B4XView
	Private lblDocumento As B4XView
	Private pnlFondo As B4XView
	Private txtDocumento As B4XView
	
	Private CarpetaFicherosCSV As String
	Private CarpetaFicherosPDF As String
	Private BuzonCompartidoEmailEnvioInfo As String
	Private BuzonCompartidoEmailEnvioInfo As String
	Private DireccionSeleccionadaRemitenteEmails As String
	Private DireccionDestinoEmails As String
	Private DireccionCCDestinoEmails As String
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

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Private Sub btnSalir_Click
	SalirModulo
End Sub


private Sub SalirModulo
	BorrarVBSScriptDireccionRemitenteEmailOutlook
	BorrarVBSScriptEnvioEmailOutlook
	frm.Close
	MainMenu2.Show
End Sub




Sub CreacionTablasSQLite

'	mSQL.ExecNonQuery("drop table if exists tblRepsolMapeoCodigosPrendaEESS")
'	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblRepsolMapeoCodigosPrendaEESS] (
'	[CodigoPrenda] TEXT, [NombreCodigoPrenda] TEXT
'	)"$
'	mSQL.ExecNonQuery(sCrearTabla)
	
End Sub

Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrRepsolInformacionLogisticaAlbaranVenta")

		
	frm.Title=Main.PrefijoTitleForms & "Exportación Información Albarán Repsol"
		
	Dialog.Initialize (frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	frm.Show
	jamLoadingIndicator1.MensajeLoading="Cargando configuración..."
	jamLoadingIndicator1.Show
	
	Wait For(CargaRepsolConfiguracionLogisticaAlbaranesVenta) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If
	Dim mData As Map=mRes.Get("mDataConf")
	CarpetaFicherosCSV=mData.Get("CampoString1")
	CarpetaFicherosPDF=mData.Get("CampoString5")
	BuzonCompartidoEmailEnvioInfo=mData.Get("CampoString2")
	DireccionDestinoEmails=mData.Get("CampoString3")
	DireccionCCDestinoEmails=mData.Get("CampoString4")
	
	BorrarVBSScriptDireccionRemitenteEmailOutlook
	BorrarVBSScriptEnvioEmailOutlook
	
	CrearVBSScriptDireccionRemitenteEmailOutlook
	CrearVBSScriptEnvioEmailOutlookHTML
	
	jamLoadingIndicator1.close
End Sub


Sub CargaRepsolConfiguracionLogisticaAlbaranesVenta As ResumableSub

	Dim Accion As String
	Dim mDataConf As Map
	mDataConf.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mDataConf",mDataConf)
	Dim Comando As String="RepsolConfiguracionLogisticaAlbaranesVenta"
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
			mDataConf=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mDataConf", mDataConf)
			
		End If
	End If
	Return mRes
End Sub



Sub CargaRepsolInformacionLogisticaAlbaranVenta(AlbaranNAV As String) As ResumableSub
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstReg",lstReg)
	Dim Comando As String="RepsolInformacionLogisticaAlbaranVenta"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(AlbaranNAV), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No existe el documento ${AlbaranNAV} en navision, o no tiene lineas no corregidas de tipo producto."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			lstReg=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub SeleccionarDocumento
	
	Dialog.Title="Indica Documento"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt=xui.DialogResponse_Cancel Then Return
	
	Dim Documento As String=InputDlg.Text
	
	If Documento="" Then
		Dim msa As Object=xui.MsgboxAsync("No se ha indicado documento","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	txtDocumento.Text=Documento
	
	Wait For(CargaRepsolInformacionLogisticaAlbaranVenta(Documento)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Log(lstReg)
	
	If lstReg.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync($"No hay datos en el documento ${Documento} para generar el fichero. Revisar información en navision."$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim RutaFicheroPDFDocumento As String
	Dim NombreFicheroPDFDocumento As String=$"${Documento}.pdf"$
	If File.Exists(CarpetaFicherosPDF,NombreFicheroPDFDocumento) Then
		RutaFicheroPDFDocumento=File.Combine(CarpetaFicherosPDF,NombreFicheroPDFDocumento)
	Else
		wait for(Utilidades.MsgBox2XUI("Confirma",$"No existe el fichero ${NombreFicheroPDFDocumento} en la carpeta ${CarpetaFicherosPDF}
¿Continuar? (Puedes añadir manualmente el PDF en el email"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat=DateFormatAnt
	
	Dim lstLineasAlbaran As List
	lstLineasAlbaran.Initialize
	
	Dim mData0 As Map=lstReg.Get(0)
	'encabezados
	Dim iDX As Int
	Dim arrH(mData0.size) As String=mapKeysToArray(mData0)
	lstLineasAlbaran.Add(arrH)
	
	Dim su As StringUtils
	For Each mData As Map In lstReg
		Log(mData)
		Dim row() As Object=mapValuesToArrayOfStringsConCamposFecha(mData)
		For i=0 To row.Length-1
			Log(row(i))
		Next
		lstLineasAlbaran.Add(row)
	Next
	
	DateTime.DateFormat=DateTime.DateFormat
	
	'Dim DirFicherosAlbaranesVentaRepsol As String="\\192.168.10.4\Publico\Gestion de Ventas\CLIENTES\REPSOL\Ficheros csv Albaranes"
	Dim DirFicherosAlbaranesVentaRepsol As String=CarpetaFicherosCSV
	
'	Dim fCH As FileChooser
'	fCH.Initialize
'	fCH.InitialDirectory=DirFicherosAlbaranesVentaRepsol
'	fCH.InitialFileName=$"${Documento}.csv"$
'	fCH.SetExtensionFilter("Ficheros csv Albaranes Venta",Array As String("*.csv"))
'	Dim RutaFichero As String=fCH.ShowSave(frm)
'	If RutaFichero="" Then Return
'	
'	Dim NombreFichero As String=File.GetName(RutaFichero)
'	
'	If NombreFichero<>$"${Documento}.csv"$ Then
'		Dim msa As Object=xui.MsgboxAsync($"Es obligatorio que el nombre del fichero sea ${Documento}.csv"$,"Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If

	Dim NombreFichero As String=$"${Documento}.csv"$
	
	
	Dim parser As CSVParser
	parser.Initialize
	Dim s As String = parser.GenerateString(lstLineasAlbaran, TAB)
	File.WriteString(DirFicherosAlbaranesVentaRepsol,NombreFichero, s)
	
	Dim RutaFicheroDocumento As String=File.Combine(DirFicherosAlbaranesVentaRepsol,NombreFichero)
	
'
'	
'	Dim msa As Object=xui.MsgboxAsync($"Fichero grabado, ${RutaFicheroDocumento}"$,"Aviso")
'	Wait For (msa) Msgbox_Result
	
	wait for(SeleccionarDireccionRemitenteEmails) complete (Success As Boolean)
	If Not(Success) Then 
			Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar la dirección desde la que enviar el correo al operador logístico." ,"Aviso")
			Wait For (msa) Msgbox_Result
			Return
	Else
		Dim msa As Object = xui.Msgbox2Async("La dirección DESDE la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmails, "Direccion envío email", "Sí", "Cancelar", "", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		Select rInt
			Case xui.DialogResponse_Cancel
				Return
		End Select
	End If
	
	Dim sbBody As String=HTMLBodyEmail
	If DireccionCCDestinoEmails="" Then DireccionCCDestinoEmails="None"
	
	Dim EmailSubject As String=$"Albarán venta REPSOL ${Documento}"$
	
	jamLoadingIndicator1.MensajeLoading="Creando email..."
	jamLoadingIndicator1.Show
	wait for(EjecutarVBSScriptEnviarEmail(DireccionSeleccionadaRemitenteEmails,DireccionDestinoEmails,DireccionCCDestinoEmails, _
		EmailSubject,sbBody,RutaFicheroDocumento,RutaFicheroPDFDocumento)) complete (mRes As Map)
	Log("mRes: " & mRes)
	Dim Success As Boolean=mRes.Get("Success")
	Dim ExitCode As Int=mRes.Get("ExitCode")
	Dim StdOut As String=mRes.Get("StdOut")
	Dim StdErr As String=mRes.Get("StdErr")
	jamLoadingIndicator1.Close
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error spt creación de email" & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt creación email" & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Dim msa As Object=xui.MsgboxAsync("Email creado, OK","Aviso")
	Wait For (msa) Msgbox_Result
	
	Wait For(AbrirVentanaOutlookEmail($"${EmailSubject} - Mensaje(HTML)"$,Documento)) complete (Success As Boolean)

	
End Sub


Private Sub btnSeleccionarDocumento_Click
	SeleccionarDocumento
End Sub

Sub mapKeysToArray(mData As Map) As String()
	Dim arr(mData.Size) As String
	Dim iDx As Int
	For Each key As String In mData.Keys
		arr(iDx)=key
		iDx=iDx+1
	Next
	Return arr
End Sub

'public Sub mapValuesToArrayOfStringsConCamposFecha(m As Map) As Object()
'	Dim arr(m.Size) As String  'array size is double of the map because both keys and values are elements
'	Dim i As Int=0
'	Dim value As Object
'	For Each key As Object In m.Keys
'		
'		value=m.Get(key)
'		LogColor($"key=${key}, value=${value}"$, xui.Color_Blue)
'		If key.As(String).ToUpperCase.StartsWith("FECHA")Then
'			arr(i)=DateTime.Date(value)
'		Else
'			If value Is String Then
'				arr(i)=value
'			Else
'				Dim intValue As Int=value
'				Dim sValue As String=intValue
'				arr(i)=sValue
'			End If
'		End If
'		i =i +1
'	Next
'    
'	Return arr
'End Sub

public Sub mapValuesToArrayOfStringsConCamposFecha(m As Map) As Object()
	Dim arr(m.Size) As String  'array size is double of the map because both keys and values are elements
	Dim i As Int=0
	Dim value As Object
	For Each key As Object In m.Keys
		
		value=m.Get(key)
		LogColor($"key=${key}, value=${value}"$, xui.Color_Blue)
		If key.As(String).ToUpperCase.StartsWith("FECHA")Then
			arr(i)=DateTime.Date(value)
		Else
			If value Is String Then
				Dim sValue As String=value
				sValue=sValue.Replace(TAB,"")
				arr(i)=sValue
			Else
				Dim intValue As Int=value
				Dim sValue As String=intValue
				arr(i)=sValue
			End If
		End If
		i =i +1
	Next
    
	Return arr
End Sub

public Sub mapToArrayOfStringsConCamposFecha(m As Map) As Object()
	Dim arr(m.Size * 2) As Object  'array size is double of the map because both keys and values are elements
	Dim i As Int=0
	Dim value As Object
	For Each key As Object In m.Keys
		
		value=m.Get(key)
		LogColor($"key=${key}, value=${value}"$, xui.Color_Blue)
		arr(i)=key
		i = i +1
		If key.As(String).ToUpperCase.StartsWith("FECHA") And i Mod 2=0 Then
			arr(i)=DateTime.Date(value)
		Else
			If value Is String Then
				arr(i)=value
			Else
				Dim intValue As Int=value
				Dim sValue As String=intValue
				arr(i)=sValue
			End If
		End If
			i =i +1
		Next
    
	Return arr
End Sub

Sub GenerateString (Table As List, SeparatorChar As String) As String
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


#Region Email
Sub CrearVBSScriptDireccionRemitenteEmailOutlook
	
	BorrarVBSScriptDireccionRemitenteEmailOutlook
	
	Dim sVBscript As String
            
	sVBscript =$"
		Option Explicit
		On Error Resume Next
		Dim xOLApp, olAccounts
		Dim objStdOut,objStdErr
			
		Set objStdOut = WScript.StdOut
		Set objStdErr = WScript.StdErr
			
	'Set xOLApp = CreateObject("Outlook.Application")
		Set xOLApp =GetObject(, "Outlook.Application")
		If Err.Number<>0 Then
			If Err.Number=429 Then
	'MsgBox "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
			Else
	'MsgBox Err.Number & " " & Err.Description
				objStdErr.Write Err.Number & " " & Err.Description
			End If
			WScript.Quit (1) 'return code 1
		End If

		Dim i
		For i = 1 To xOLApp.Session.Accounts.count
			objStdOut.Write xOLApp.Session.Accounts.Item(i) & ","
		Next
		Set xOLApp = Nothing
		If Err.Number<>0 Then
			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
			WScript.Quit (1)
		Else
			WScript.Quit (0)
		End If
			"$


'		Dim sAccounts
'		For i = 1 To xOLApp.Session.Accounts.count
'			sAccounts =  "Cuentas," & sAccounts & xOLApp.Session.Accounts.Item(i)
'		Next
'		Set xOLApp = Nothing
'		If Err.Number = 0 Then
'			objStdOut.Write sAccounts
'			'msgbox sAccounts
'			WScript.Quit (0)
'		Else
'			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
'			'msgbox Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
'			WScript.Quit (1)
'		End If

'	Set olAccounts = xOLApp.Session.Accounts
'	For Each olAccountTemp In olAccounts
'		REM msgbox "Dir " & olAccountTemp
'		objStdOut.Write olAccountTemp
'	Next
		
	File.WriteString(xui.DefaultFolder,"smfpromc.vbs",sVBscript)
End Sub

Sub BorrarVBSScriptDireccionRemitenteEmailOutlook
	If File.Exists(xui.DefaultFolder,"smfpromc.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc.vbs")
	End If
End Sub


Sub SeleccionarDireccionRemitenteEmails As ResumableSub
	
	wait for(EjecutarVBSScriptDireccionesEmail) complete (mRes As Map)
	Log("mRes: " & mRes)
	Dim Success As Boolean=mRes.Get("Success")
	Dim ExitCode As Int=mRes.Get("ExitCode")
	Dim StdOut As String=mRes.Get("StdOut")
	Dim StdErr As String=mRes.Get("StdErr")
'	Dim msa As Object=xui.MsgboxAsync("StdOut." & StdOut,"Aviso Temp")
'	Wait For (msa) Msgbox_Result
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	If ExitCode=1 Then
		Dim msa As Object=xui.MsgboxAsync("Error spt direcciones email" & CRLF & StdErr,"Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	Dim sDireccionesCuentasEmail As String=StdOut.SubString2(0,StdOut.Length-1)
	If sDireccionesCuentasEmail="" Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
'	
	Dim ArrDireccionesCuentasEmail() As String=Regex.Split(",",sDireccionesCuentasEmail)
	Dim lstDireccionesCuentasEmail As List
	lstDireccionesCuentasEmail.Initialize

	For iDx =0 To ArrDireccionesCuentasEmail.Length-1
		lstDireccionesCuentasEmail.Add(ArrDireccionesCuentasEmail(iDx))
	Next
	
'	lstDireccionesCuentasEmail.Add("atencionalcliente@proin-pinilla.com")
'	lstDireccionesCuentasEmail.Add("ict@proin-pinilla.com")
	
	If lstDireccionesCuentasEmail.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay direcciones de email configuradas." & CRLF & CRLF & "¿Outlook no instalado?","Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	''lstDireccionesCuentasEmail.Add("compras@proin-pinilla.com")
	
	Dialog.Title="Selecciona Cuenta para Enviar los Emails"
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize

	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
		
	B4XListDlg.Options=lstDireccionesCuentasEmail
	B4XListDlg.Resize(600dip,300dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,40dip)
'	Next
	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
'		Dim msa As Object=xui.MsgboxAsync("Es necesario seleccionar  hay dirección de email seleccionada desde la que enviar los emails." & CRLF & CRLF & ,"Aviso")
'		Wait For (msa) Msgbox_Result
		Return False
	End If
	

	DireccionSeleccionadaRemitenteEmails=B4XListDlg.SelectedItem
	
	If DireccionSeleccionadaRemitenteEmails="atencionalcliente@proin-pinilla.com" Then DireccionSeleccionadaRemitenteEmails="Servicio de Atención al Cliente"
	
	Return True
	
	
'	Dialog.Title="Confirma Dirección Email Destinatario"
'	Dialog.TitleBarHeight=50dip
'	Dim InputDlg As B4XInputTemplate
'	InputDlg.Initialize
'	InputDlg.lblTitle.Text=""
'	InputDlg.Text=DireccionSeleccionadaRemitenteEmails.Trim
'	InputDlg.RegexPattern="^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$"
'	
'	'InputDlg.mBase.Height = 20%y
'	InputDlg.mBase.Width = 600dip
'	
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.TextSize=15
'	bCancel.Left=bCancel.Left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For (rSub) complete (rInt As Int)
	'
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim DireccionDestinoEmail As String=InputDlg.Text.Trim
	

	
'	If DireccionSeleccionadaRemitenteEmails="" Then
'		wait for (SeleccionarDireccionRemitenteEmails(lstDireccionesCuentasEmail)) complete (rBool As Boolean)
'		If rBool=False Then Return
'	Else
'		Dim msa As Object = xui.Msgbox2Async("La dirección desde la que se enviará el correo será:" & CRLF & CRLF & DireccionSeleccionadaRemitenteEmails & ".", "Direccion envío email", "Sí", "Cancelar", "Seleccionar Otra", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		Select rInt
'			Case xui.DialogResponse_Cancel
'				Return
'			Case xui.DialogResponse_Negative
'				Dim msa As Object=xui.MsgboxAsync("Selecciona otra cuenta remitente desde el menú acciones." ,"Aviso")
'				Wait For (msa) Msgbox_Result
'				Return
'		End Select
'	End If
End Sub


Sub EjecutarVBSScriptDireccionesEmail As ResumableSub
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromc.vbs"))  ' nologo para no mostar avisos windows
	shl.WorkingDirectory = xui.DefaultFolder
	shl.Run(-1)
	frm.RootPane.MouseCursor=fx.Cursors.WAIT
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	Log("Success")
	Log(StdOut)
	mRes.Put("Success",True)
	mRes.Put("StdOut",StdOut)
	mRes.Put("StdErr",StdErr)
	mRes.Put("ExitCode",ExitCode)
	Return mRes
End Sub

Sub EjecutarVBSScriptEnviarEmail(SenderAddr As String, ReceiverAddr As String,CCReceiverAddr As String,Subject As String, Body As String,  FileAttch As String, FileAttch2 As String) As ResumableSub
	
	Body=Body.Replace(CRLF,"<br>")
	
	Dim mRes As Map
	mRes.Initialize
	Dim shl As Shell
	shl.Initialize("shl", "c:\windows\system32\cscript.exe", Array As String("//nologo", "smfpromc2.vbs",SenderAddr, ReceiverAddr,CCReceiverAddr,Subject, Body, FileAttch,FileAttch2))  ' nologo para no mostar avisos windows
	shl.WorkingDirectory = xui.DefaultFolder
	shl.Run(-1)
	frm.RootPane.MouseCursor=fx.Cursors.WAIT
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	Log("Success: " & Success)
	Log(StdOut)
	mRes.Put("Success",True)
	mRes.Put("StdOut",StdOut)
	mRes.Put("StdErr",StdErr)
	mRes.Put("ExitCode",ExitCode)
	Return mRes
End Sub


Sub HTMLBodyEmail As String
	Dim strBodyHTML As String
	strBodyHTML = $"<p>Buenos días<br><br>
Adjunto el albarán en pdf y el archivo csv para que procedáis a la preparación de la mercancía y su envío a la mayor brevedad posible.<br>
En caso de alguna incidencia por favor indicádnoslo.<br>
<br>Muchas gracias"$  
	Return strBodyHTML
End Sub


Sub CrearVBSScriptEnvioEmailOutlookHTML

	BorrarVBSScriptEnvioEmailOutlook
	
	Dim sVBscript As String
            
	sVBscript =$"
		Option Explicit
		On Error Resume Next

		Dim objStdOut,objStdErr
			
		Set objStdOut = WScript.StdOut
		Set objStdErr = WScript.StdErr
		
		Dim xOLApp
		Dim objMailItem
		
	'Dim OutAccount
		
		Dim signature
			
	'Set xOLApp = CreateObject("Outlook.Application")
		Set xOLApp =GetObject(, "Outlook.Application")
		If Err.Number<>0 Then
			If Err.Number=429 Then
	'MsgBox "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
				objStdErr.Write "Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci" + chr(243) + "n (err 429)"
			Else
	'MsgBox Err.Number & " " & Err.Description
				objStdErr.Write Err.Number & " " & Err.Description
			End If
			WScript.Quit (1) 'return code 1
		End If
		Set objMailItem = xOLApp.CreateItem(0)
		
   		objMailItem.Display
		signature = objMailItem.HTMLBody
		
	'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))
		
		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)
	'objMailItem.SendUsingAccount = WScript.Arguments(0)
	'objMailItem.SendUsingAccount = OutAccount
	'objMailItem.SentOnBehalfOfName = OutAccount
		
		objMailItem.To = WScript.Arguments(1)
		if WScript.Arguments(2)<>"None" then
			objMailItem.CC = WScript.Arguments(2)
		end if
		objMailItem.Subject = WScript.Arguments(3)
	'objMailItem.HTMLBody = WScript.Arguments(4) & "<br><br>" & objMailItem.HTMLBody & "</p>"
		objMailItem.HTMLBody = "<p><br>" & WScript.Arguments(4) & "<br>" & signature & "</p>"
		objMailItem.Attachments.Add WScript.Arguments(5)
		if WScript.Arguments(6)<>"" then
			objMailItem.Attachments.Add WScript.Arguments(6)
		end if
	'objMailItem.Send
		Set xOLApp = Nothing
		Set objMailItem = Nothing
		If Err.Number = 0 Then
			objStdOut.Write "Email enviado"
			WScript.Quit (0)
		Else
			objStdErr.Write Err.Number & " Srce: " & Err.Source & " Desc: " &  Err.Description
			WScript.Quit (1)
		End If
			"$
	File.WriteString(xui.DefaultFolder,"smfpromc2.vbs",sVBscript)
End Sub

Sub BorrarVBSScriptEnvioEmailOutlook
	If File.Exists(xui.DefaultFolder,"smfpromc2.vbs") Then
		File.Delete(xui.DefaultFolder,"smfpromc2.vbs")
	End If
End Sub


Sub AbrirVentanaOutlookEmail(TituloWindow As String, Documento As String) As ResumableSub
	' comprobar si ya existe la ventana
	#if debug
	Log("Buscando window title " & TituloWindow)
	#End If
	
	Dim WU As JavaObject
	WU.InitializeStatic("com.sun.jna.platform.WindowUtils")
	Dim L As List = WU.RunMethod("getAllWindows",Array(False))
	Dim FlagOk As Boolean
	For Each JO As JavaObject In L
		Dim t As String = JO.RunMethod("getTitle",Null)
		#if debug
		Log("window title" & t)
		#End If
		

		If t.Contains(TituloWindow) Then
'			Dim m As Matcher=Regex.Matcher(".*" & TituloWindow & ".*" & ValorRegistro, t)
'			Do While m.Find
'				Log("match " & m.Match)
'				FlagOk=True
'				Exit
'			Loop
			FlagOk=True
			Exit
		End If
	Next
	
	If FlagOk Then
		SetForegroundWindow(t,False)
		Return True
	Else
		Dim msa As Object=xui.MsgboxAsync($"No se ha encontrado la ventana de Outlook con el correo correspondiente al documento ${Documento}
Busca manualmente la ventana en outlook para enviar el email"$,"Aviso")
		Wait For (msa) Msgbox_Result
		Return False
	End If

		
End Sub


Sub SetForegroundWindow(Title As String, JustFind As Boolean) As Boolean
	Return Me.As(JavaObject).RunMethod("SetForegroundWindow", Array(Title, JustFind))
End Sub

#if Java
import com.sun.jna.platform.win32.*;
public static boolean SetForegroundWindow(String title, boolean justFind) {
    User32 user32 = com.sun.jna.platform.win32.User32.INSTANCE;
    for (com.sun.jna.platform.DesktopWindow s : com.sun.jna.platform.WindowUtils.getAllWindows(false)) {
        String t = s.getTitle();
        if (t.toLowerCase().equals(title.toLowerCase())) {
            if (!justFind) {
                user32.SetForegroundWindow(s.getHWND());
                user32.SetFocus(s.getHWND());
                user32.ShowWindow(s.getHWND(), 3);
            }
            return true;
        }
        
    }
    return false;
}
#End If


#End Region
