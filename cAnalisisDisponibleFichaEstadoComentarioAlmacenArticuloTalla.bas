B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private xui As XUI
	'Private frm As Form
	Private Dialog As B4XDialog
'	Private btnSalir As Button
	
	Private mCallBack As Object
	Private mParent As B4XView
	Dim Background As B4XView
	Dim pnlBase As B4XView
	
	Private mAlmacen As String
	Private mNombreAlmacen As String
	Private mArticulo As String
	Private mDescripcionArticulo As String
	Private mTalla As String
	
	Type TipoDatosAnalisisDisponibleFichaAlmacenArticuloTalla (DatosModificados As Boolean, ConComentario As Boolean, Estado As String, Comentario As String)
	Private DatosAnalisisDisponibleFichaAlmacenArticuloTalla As TipoDatosAnalisisDisponibleFichaAlmacenArticuloTalla
	
	Private jamLoadingIndicator1 As JamLoadingIndicator

	Private btnSelNuevaFecha As B4XView
	Private chboNuevoEstado As ChoiceBox
	Private txtAlmacen As B4XView
	Private txtAreaComentario As B4XView
	Private txtArticulo As B4XView
	Private txtDescripcionArticulo As B4XView
	Private txtEstadoActual As B4XView
	Private txtFechaActual As B4XView
	Private txtNombreAlmacen As B4XView
	Private txtNuevaFecha As B4XView
	Private txtNuevoUsuario As B4XView
	Private txtTalla As B4XView
	Private txtUsuarioActual As B4XView
	Private btnGrabarFichaEstadoComentarioAlmacenArticuloTalla As B4XView
	Private btnCancelarFichaEstadoComentarioAlmacenArticuloTalla As B4XView
	Private btnEliminarFichaEstadoComentarioAlmacenArticuloTalla As B4XView
	Private lblModoFichaEstadoComentario As B4XView
	
	Private ModoFicha As String
	Private lblTitlePanel As B4XView
	
	Private DownX As Double
	Private DownY As Double
End Sub




'Parent = frm.Rootpane del modulo callback
' Ejemplo forma llamar al formulario de seleccion. En el modulo CallBack:
'<code>
' Dim cSelArtNAV As cSeleccionArticuloNAV
' cSelArtNAV.Initialize(Me,fRegistro.PanelFondoFormRegistro)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
' wait for (cSelArtNAV) cSeleccionArticuloNAV_Done (mSelCliNAV as map)
'</code>
Public Sub Initialize(CallBack As Object,Parent As B4XView, Almacen As String, NombreAlmacen As String, _
		 Articulo As String, DescripcionArticulo As String, Talla As String)
	mCallBack=CallBack
	mParent=Parent
	
	For Each v As B4XView In mParent.GetAllViewsRecursive
		If v.Tag <> Null And v.Tag = "b4xdialog_background" Then
			v.RemoveViewFromParent
			Exit
		End If
	Next
	
	Background= xui.CreatePanel("background")
	Background.Tag = "b4xdialog_background"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	mAlmacen=Almacen
	mNombreAlmacen=NombreAlmacen
	mArticulo=Articulo
	mDescripcionArticulo=DescripcionArticulo
	mTalla=Talla
	
	DatosAnalisisDisponibleFichaAlmacenArticuloTalla.DatosModificados=False
	
End Sub

Sub Show
	'If Not(frm.IsInitialized) Then
	'FirstTime=True
	'frm.Initialize("frm",800dip,500dip)
	
	

	'Dim joForm As JavaObject = frm
	'Dim joStage As JavaObject = joForm.GetField("stage")
	'joStage.RunMethod("setMaximized", Array(True))
	
	pnlBase=xui.CreatePanel("pnlBase")
	pnlBase.SetLayoutAnimated(0,0,0,800dip,500dip)
	pnlBase.Color=xui.Color_White
	pnlBase.LoadLayout("scrAnalisisDisponibleEstadoComentarioAlmacenArticuloTalla")
	
	Background.AddView(pnlBase,(Background.Width-800dip)/2, (Background.Height-500dip)/2,800dip,500dip)
		
	ControlesHabilitados(False)	
	
	'Sleep(0)
		
	'frm.Icon = Main.IconoFormularios
		
	lblTitlePanel.Text="Ficha Estado/Comentario Almacén-Artículo-Talla"

	Dialog.Initialize(pnlBase)
	jamLoadingIndicator1.Initialize(Me,pnlBase)
	
	btnEliminarFichaEstadoComentarioAlmacenArticuloTalla.Visible=False

	'frm.Show

	Wait For(Inicio) complete (rObj As Object)
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub ControlesHabilitados(Habilitados As Boolean)
		
	'btnEliminarFichaEstadoComentarioAlmacenArticuloTalla.Enabled=Habilitados
	btnGrabarFichaEstadoComentarioAlmacenArticuloTalla.Enabled=Habilitados
	btnCancelarFichaEstadoComentarioAlmacenArticuloTalla.Enabled=Habilitados
	btnSelNuevaFecha.Enabled=Habilitados
	txtAreaComentario.Enabled=Habilitados
	chboNuevoEstado.Enabled=Habilitados
End Sub

'Sub btnSalir_Click
'	SalirForm
'End Sub

Sub SalirForm
	Background.RemoveViewFromParent
	'frm.Close
	CallSubDelayed2(mCallBack,"cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla_Done",DatosAnalisisDisponibleFichaAlmacenArticuloTalla)
End Sub




Sub Inicio As ResumableSub
	'frm.Show
	jamLoadingIndicator1.MensajeLoading="Cargando datos..."
	jamLoadingIndicator1.Show
	'frm.RootPane.MouseCursor=fx.Cursors.WAIT
	wait for(CargaDatosFichaEstadoComentarioAlmacenArticuloTalla) complete (mResult As Map)
	
	If mResult.Get("Accion")<>"OK" Then
		'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
		jamLoadingIndicator1.Close
		SalirForm
		Return Null
	End If
	Dim lstReg As List=mResult.Get("lstRes")
	
	chboNuevoEstado.Items.AddAll(Array As String("","OK","PENDIENTE","OBSOLETO"))
	
	txtAlmacen.Text=mAlmacen
	txtNombreAlmacen.Text=mNombreAlmacen
	txtArticulo.Text=mArticulo
	txtDescripcionArticulo.Text=mDescripcionArticulo
	txtTalla.Text=mTalla
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	txtNuevaFecha.Text=DateTime.Date(DateTime.Now)
	DateTime.DateFormat=DateFormatAnt
	
	txtNuevoUsuario.Text=Main.DatosUsuario.NombreUsuarioWindows
	
	If lstReg.Size=0 Then
		btnEliminarFichaEstadoComentarioAlmacenArticuloTalla.Visible=False
		ModoFicha="NUEVO"
		lblModoFichaEstadoComentario.Text="Modo: " & ModoFicha
		
	Else
		ModoFicha="EDICION"
		lblModoFichaEstadoComentario.Text="Modo: " & ModoFicha
		'btnEliminarFichaEstadoComentarioAlmacenArticuloTalla.Visible=True
		Dim mData As Map=lstReg.Get(0)
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yyyy"
		txtFechaActual.Text=DateTime.Date(mData.Get("FechaLong"))
		DateTime.DateFormat=DateFormatAnt
		txtEstadoActual.Text=mData.Get("Estado")
		txtUsuarioActual.Text=mData.Get("Usuario")
		txtAreaComentario.Text=mData.Get("Comentario")
		txtAreaComentario.SetSelection(txtAreaComentario.Text.Length, txtAreaComentario.Text.Length)
		chboNuevoEstado.SelectedIndex=chboNuevoEstado.Items.IndexOf(mData.Get("Estado"))
	End If
	
'	frm.RootPane.MouseCursor=fx.Cursors.DEFAULT

	jamLoadingIndicator1.Close
	
	ControlesHabilitados(True)

	Return Null
End Sub

Sub CargaDatosFichaEstadoComentarioAlmacenArticuloTalla As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Accion",Accion)
	mResult.Put("lstRegistros",lstRegistros)
	Dim Comando As String
	Comando="AnalisisDisponiblesFichaEstadoComentarioAlmacenArticuloTalla"

	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(mAlmacen,mArticulo,mTalla), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
		
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mResult.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay datos registrados de estado ", "Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="OK"
			mResult.Put("Accion",Accion)
		Else
			lstRegistros=mResult.Get("lstRes")
			Accion="OK"
			mResult.Put("Accion",Accion)
			mResult.Put("lstRegistros",lstRegistros)
		End If
	End If
	Return mResult
End Sub


Private Sub background_MouseClicked (EventData As MouseEvent)
	EventData.Consume
End Sub

Private Sub btnSelNuevaFecha_Click
	Dialog.Title="Indica Fecha Registro"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	B4XDateDlg.Date=DateTime.DateParse(txtNuevaFecha.Text)
	DateTime.DateFormat=DateFormatAnt
	

	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim NuevaFechaSel As Long=B4XDateDlg.Date
	txtNuevaFecha.Text=DateTime.Date(NuevaFechaSel)
	DateTime.DateFormat=DateFormatAnt
	
End Sub

'Private Sub btnEliminarFichaEstadoComentarioAlmacenArticuloTalla_Click
'	wait for(Utilidades.MsgBox2XUI("Confirma","¿Eliminar los datos de la ficha?","OK","Cancelar","",Null)) complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	EliminarDatosFicha
'End Sub

Private Sub btnCancelarFichaEstadoComentarioAlmacenArticuloTalla_Click
	wait for(Utilidades.MsgBox2XUI("Confirma","¿Salir sin realizar ningún cambio?","OK","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	SalirForm
End Sub

Private Sub btnGrabarFichaEstadoComentarioAlmacenArticuloTalla_Click
	wait for(Utilidades.MsgBox2XUI("Confirma","¿Grabar los datos de la ficha?","OK","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	GrabarDatosFicha
End Sub

'Private Sub EliminarDatosFicha
'	SalirForm
'End Sub

Private Sub GrabarDatosFicha
	Wait For(NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla) complete (mRes As Map)
	Dim Accion As String=mRes.get("Accion")
	If Accion="NOK" Then Return
	DatosAnalisisDisponibleFichaAlmacenArticuloTalla.DatosModificados=True
	DatosAnalisisDisponibleFichaAlmacenArticuloTalla.ConComentario=txtAreaComentario.Text.Trim<>""
	DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Comentario=txtAreaComentario.Text
	Dim EstadoSel As String
	If chboNuevoEstado.SelectedIndex=-1 Then
		EstadoSel=""
	Else
		EstadoSel=chboNuevoEstado.Items.Get(chboNuevoEstado.SelectedIndex)
	End If
	DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado=EstadoSel
	SalirForm
End Sub


Private Sub pnlBase_Touch(Action As Int, X As Float, Y As Float)
	If Action = pnlBase.TOUCH_ACTION_DOWN Then
		DownX  = X
		DownY  = y
	Else if Action = pnlBase.TOUCH_ACTION_MOVE Then
		pnlBase.Top = Min(Max(pnlBase.Top + y - DownY,0),Background.Height-pnlBase.Height)
		pnlBase.Left = Min(Max(pnlBase.Left + x - DownX,0), Background.Width-pnlBase.Width)
	End If

End Sub

Sub NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla As ResumableSub
	Dim lstReg As List
	lstReg.Initialize
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstRegistros",lstReg)
	Dim Comando As String
	Comando="NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla"
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim NuevaFecha As Long=DateTime.DateParse(txtNuevaFecha.Text)
	DateTime.DateFormat=DateFormatAnt
	Dim EstadoSel As String
	If chboNuevoEstado.SelectedIndex=-1 Then
		EstadoSel=""
	Else
		EstadoSel=chboNuevoEstado.Items.Get(chboNuevoEstado.SelectedIndex)
	End If
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando, _
		Array(NuevaFecha,Main.DatosUsuario.NombreUsuarioWindows, mAlmacen,mArticulo,mTalla, _
			txtAreaComentario.Text,EstadoSel), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
		
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			' este caso no es posible aquí.
			Accion="NOK"
			mRes.Put("Accion",Accion)
		Else
			lstReg=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Dim msa As Object=xui.MsgboxAsync("Error SP NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla" & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
			End If
		End If
	End If
	Return mRes
End Sub

