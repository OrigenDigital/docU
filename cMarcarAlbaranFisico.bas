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
	
	Private btnSalir As Button
	Private btnSeleccionarDocumento As Button
	Private lblTitleDocumentosActualizados As Label	
'	Private lvDocumentosActualizados As ListView
	Private lstDocumentosActualizados As List
	Private clvDocumentosActualizados As CustomListView
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
	frm.RootPane.LoadLayout("scrMarcarAlbaranFisico")
	Sleep(0)
	frm.Title=Main.PrefijoTitleForms & "   " & "Marcar documentos NAVISION con Albaran Físico=Sí"
	
	Dialog.Initialize(frm.RootPane)
	
	lstDocumentosActualizados.Initialize

	lblTitleDocumentosActualizados.Visible=False
	clvDocumentosActualizados.AsView.Visible=False
	clvDocumentosActualizados.Base_Resize(clvDocumentosActualizados.AsView.Width,0)
	
	frm.Show
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Private Sub btnSalir_Click
	SalirModulo
End Sub

Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub

'Private Sub lvDocumentosActualizados_SelectedIndexChanged(Index As Int)
'	
'End Sub

Private Sub btnSeleccionarDocumento_Click
	SeleccionarDocumento
End Sub

Sub SeleccionarDocumento
	Dialog.Title="Selecciona Documento"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	Dim MaxNumChar As Int=20
	InputDlg.RegexPattern="^.{" & 5 & "," & MaxNumChar & "}$"
	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim DocSel As String=InputDlg.Text.Trim.ToUpperCase
	
	If DocSel.StartsWith("ALBV")=False And DocSel.StartsWith("RT")=False And DocSel.StartsWith("VDEV")=False Then
		Dim msa As Object=xui.MsgboxAsync("Sólo es posible actualizar documentos de tipo ALBV y VDEV","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Wait For(CheckExisteDocumentoNAV(DocSel)) complete (rBool As Boolean)
	If rBool=False Then Return

	Wait For(ActualizarDocumentoFisico(DocSel)) complete (rBool As Boolean)
	If rBool=False Then Return
	
	Dim IndexDocSel As Int=lstDocumentosActualizados.IndexOf(DocSel)
	If IndexDocSel>-1 Then
		lstDocumentosActualizados.RemoveAt(IndexDocSel)
		clvDocumentosActualizados.RemoveAt(IndexDocSel)
	End If
	lstDocumentosActualizados.Add(DocSel)
	clvDocumentosActualizados.AddTextItem(DocSel,DocSel)
	Dim p As B4XView=clvDocumentosActualizados.GetPanel(clvDocumentosActualizados.Size-1)
	Dim hClv As Int=Min(0.75*(frm.RootPane.Height-clvDocumentosActualizados.AsView.Top), (p.Height+clvDocumentosActualizados.DividerSize)*clvDocumentosActualizados.Size+clvDocumentosActualizados.DividerSize*2)
	clvDocumentosActualizados.Base_Resize(clvDocumentosActualizados.AsView.Width,hClv)
	clvDocumentosActualizados.AsView.Height=hClv

	Sleep(100)
	clvDocumentosActualizados.ScrollToItem(clvDocumentosActualizados.Size-1)
	

	If lstDocumentosActualizados.Size>0 Then
		lblTitleDocumentosActualizados.Visible=True
		clvDocumentosActualizados.AsView.Visible=True
	End If
	
	' volver a seleccionar otro documento hasta que el usuario detenga el flujo mediante el boton cancelar
	SeleccionarDocumento
	
End Sub

Sub CheckExisteDocumentoNAV(DocSel As String) As ResumableSub
	Dim Comando As String
	Select True
		Case DocSel.StartsWith("ALBV")
			Comando="CheckExisteDocumentoALBV"
		Case DocSel.StartsWith("RT")
			Comando="CheckExisteDocumentoRT"
		Case DocSel.StartsWith("VDEV")
			Comando="CheckExisteDocumentoVDEV"
		Case Else
			Dim msa As Object=xui.MsgboxAsync("Sólo es posible seleccionar documentos tipo ALBV o VDEV.","Error")
			Wait For (msa) Msgbox_Result
			Return False
	End Select
	
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(DocSel), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("El documento " & DocSel & " no existe en navision.","Aviso")
			Wait For (msa) Msgbox_Result
			Return False
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim NumDoc As Int=mResp.GetValueAt(0)
			If NumDoc=0 Then
				Dim msa As Object=xui.MsgboxAsync("El documento " & DocSel & " no existe en navision.","Aviso")
				Wait For (msa) Msgbox_Result
				Return False
			Else
				Return True
			End If
		End If
	End If

End Sub



Sub ActualizarDocumentoFisico(DocSel As String) As ResumableSub
	Dim Comando As String
	Select True
		Case DocSel.StartsWith("ALBV")
			Comando="ActualizarAlbaranFisicoALBV"
		Case DocSel.StartsWith("RT")
			Comando="ActualizarAlbaranFisicoRT" ''' pendiente de ver si implementamos este campo en los RT de depósitos cliente
			Dim msa As Object=xui.MsgboxAsync("Sólo es posible seleccionar documentos tipo ALBV o VDEV.","Error")
			Wait For (msa) Msgbox_Result
			Return False
		Case DocSel.StartsWith("VDEV")
			Comando="ActualizarAlbaranFisicoVDEV"
		Case Else
			Dim msa As Object=xui.MsgboxAsync("Sólo es posible seleccionar documentos tipo ALBV o VDEV.","Error")
			Wait For (msa) Msgbox_Result
			Return False
	End Select
	
	Dim cmd As DBCommand = JRDCQuery.CreateCommand(Comando,Array(DocSel))  
	wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar el campo albarán físico para el documento " & DocSel & ".","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		 Return True
	End If
End Sub