B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private jamTableView1 As jamTableView
	Private xui As XUI
	Private frm As Form
	Private Dialog As B4XDialog
	Private btnSalir As Button
	
	Private mCallBack As Object
	Private mParent As B4XView
	Dim Background As B4XView
	
	Dim mDatosProveedorSeleccionado As Map
	
	Dim jamLoadingIndicator1 As JamLoadingIndicator

End Sub




'Parent = frm.Rootpane del modulo callback
' Ejemplo forma llamar al formulario de seleccion. En el modulo CallBack:
'<code>
' Dim cSelProvNAV As cSeleccionProveedorNAV
' cSelProvNAV.Initialize(Me,fRegistro.PanelFondoFormRegistro)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
' wait for cSeleccionProveedorNAV_Done (mSelProvNAV as map)
'</code>
Public Sub Initialize(CallBack As Object,Parent As B4XView)
	mCallBack=CallBack
	mParent=Parent
	Background= xui.CreatePanel("BackgroundSeleccionProveedor")
	Background.Tag = "BackgroundSeleccionProveedor"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	mDatosProveedorSeleccionado.Initialize
	mDatosProveedorSeleccionado.Put("Proveedor","")
	mDatosProveedorSeleccionado.Put("NombreProveedor","")
	
	Show
End Sub

Sub Show
	If Not(frm.IsInitialized) Then
		'FirstTime=True
		frm.Initialize("frm",-1,-1)

		Dim joForm As JavaObject = frm
		Dim joStage As JavaObject = joForm.GetField("stage")
		joStage.RunMethod("setMaximized", Array(True))
		
		frm.RootPane.LoadLayout("scrSeleccionProveedorNAV")
		
		Sleep(0)
		
		frm.Icon = Main.IconoFormularios
		
		frm.Title="Selección Proveedor NAV"

		Dialog.Initialize(frm.RootPane)
		jamLoadingIndicator1.Initialize(Me,frm.RootPane)
		frm.Show
		
		jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,False)
		jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
	
		jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
		
		Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaProveedoresNAV.json",Null)
		wait for (rSub) complete (mRes As Map)
		
		jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			SalirForm
			Return
		End If
		
		jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Seleccionar Proveedor","SeleccionarProveedor",Chr(0xF0A4),jamTableView1.MenuBarLinea)
	
		Dim cF As DatosCellFactoryJamTableView
		cF.Initialize
		cF.AliasCampoColumna="Bloqueado"
		cF.CellFactoryEnCallBack=False
		cF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
		jamTableView1.SetCellFactory(cF)
	End If
	
	ActualizarDatos
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub btnSalir_Click
	SalirForm
End Sub

Sub SalirForm
	jamTableView1.GuardarConfiguracionColumnasUsuario
	jamTableView1.LimpiarTabla
	Background.RemoveViewFromParent
	frm.Close
	CallSubDelayed2(mCallBack,"cSeleccionProveedorNAV_Done",mDatosProveedorSeleccionado)
End Sub

Sub jamTableView1_AccionSalirJamTableView
	If mDatosProveedorSeleccionado.Get("Proveedor")="" Then
		Dim msa As Object = xui.Msgbox2Async("No se ha seleccionado Proveedor." & CRLF & CRLF & "¿Salir sin seleccionar?", "", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	SalirForm
End Sub


Sub ActualizarDatos
	'frm.Show
	'jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	wait for(DatosProveedoresNav) complete (mResult As Map)
	'jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	
	If mResult.Get("Accion")="Salir" Then
		jamLoadingIndicator1.Close
		SalirForm
	End If
	'jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
	Dim lstReg As List=mResult.Get("lstRes")
	Dim rSub As ResumableSub=jamTableView1.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	'jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	jamLoadingIndicator1.Close
	lstReg.Initialize
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgAviso") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableView1.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
	End If
End Sub



Sub DatosProveedoresNav As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Accion",Accion)
	mResult.Put("lstRegistros",lstRegistros)
	Dim Comando As String
	Comando="ProveedoresSeleccionNAV"

	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Error"
		mResult.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("No hay datos registrados de Proveedores NAV", "Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
			mResult.Put("Accion",Accion)
		Else
			lstRegistros=mResult.Get("lstRes")
			Accion="Continuar"
			mResult.Put("Accion",Accion)
			mResult.Put("lstRegistros",lstRegistros)
		End If
	End If
	Return mResult
End Sub

Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select TagMenuItem
		Case "Actualizar"
			ActualizarDatos
		Case "SeleccionarProveedor"
			Dim fSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			If fSel=-1 Then
				Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ninguna fila","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim Dcs As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaSeleccionada
			SeleccionarProveedor(Dcs)
	End Select
End Sub

Sub jamTableView1_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	SeleccionarProveedor(DatosCeldaSeleccionada)
End Sub

Sub SeleccionarProveedor(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK
	mDatosProveedorSeleccionado.Put("Proveedor",mDataPK.Get("Proveedor"))
	Dim NombreProveedor As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"NombreProveedor")
	mDatosProveedorSeleccionado.Put("NombreProveedor",NombreProveedor)
	SalirForm
End Sub

Private Sub Background_MouseClicked (EventData As MouseEvent)
	EventData.Consume
End Sub