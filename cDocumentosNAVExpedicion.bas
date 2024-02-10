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
	
	Private Dialog As B4XDialog
	Private btnSalir As B4XView
	'Private mSQL As SQL
	Private txtNumExpedicion As B4XView
	Private clvDocumentosExpedicion As CustomListView
	Private txtDocumento As B4XView
	Private txtFechaHoraMov As B4XView
	Private txtTransporte As B4XView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrDocumentosExpedicion")
	
	txtNumExpedicion.Text=""
	Dialog.Initialize (frm.RootPane)
	Utilidades.SetLightThemeDialog(Dialog)
	
	frm.Show
End Sub

Private Sub btnSelNumExpedicion_Click
	Dialog.Title="Indica Nº Expedición"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	
	Utilidades.SetLightThemeInput(InputDlg)
	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)

	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NumExpedicion As String=InputDlg.Text.Trim.ToUpperCase
	
	Dim msa As Object = xui.Msgbox2Async("¿Es una expedición de DHL?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt=xui.DialogResponse_Positive Then
		NumExpedicion=NumExpedicion.SubString2(8,10) & NumExpedicion.SubString2(12,20)
	End If
	
	txtNumExpedicion.Text=NumExpedicion
	
	clvDocumentosExpedicion.Clear
	
	Wait For(DocumentosExpedicion(NumExpedicion)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	For Each mData As Map In lstReg
		Log(mData)
		Dim p As Pane=xui.CreatePanel("")
		p.LoadLayout("scrItemDocumentoExpedicion")
		p.SetLayoutAnimated(0,0,0,clvDocumentosExpedicion.AsView.Width,80dip)
		'clvDocumentosExpedicion.AddTextItem($"${mData.Get("ResponsableFase")}  $DateTime{mData.Get("FechaHoraMov")}  Documento: ${mData.Get("Documento")}"$,"")
		txtDocumento.Text=mData.Get("Documento")
		txtFechaHoraMov.Text=$"$DateTime{mData.Get("FechaHoraMov")}"$
		txtTransporte.Text=mData.Get("ResponsableFase")
		clvDocumentosExpedicion.Add(p,"")
	Next
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub


Sub DocumentosExpedicion(NumExp As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="DocumentosFaseExpedicionNumeroExpedicion"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(NumExp), Me)
	
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
			Dim msa As Object=xui.MsgboxAsync("No hay datos de documentos para el número de expedición seleccionado (" & NumExp & ")","Aviso")
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