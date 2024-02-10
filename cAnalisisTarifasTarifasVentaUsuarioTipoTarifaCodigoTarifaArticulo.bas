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
'	Private btnSalir As Button
	
	Private mCallBack As Object
	Private mParent As B4XView
	Dim Background As B4XView
	
	Dim mDatosPrecioVentaUsuarioSeleccionado As Map

End Sub

'Parent = frm.Rootpane del modulo callback
' Ejemplo forma llamar al formulario de seleccion. En el modulo CallBack:
'<code>
' Dim cSelArtNAV As cSeleccionArticuloNAV
' cSelArtNAV.Initialize(Me,fRegistro.PanelFondoFormRegistro)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
' wait for (cSelArtNAV) cSeleccionArticuloNAV_Done (mSelCliNAV as map)
'</code>
Public Sub Initialize(CallBack As Object,Parent As B4XView)
	mCallBack=CallBack
	mParent=Parent
	Background= xui.CreatePanel("background")
	Background.Tag = "b4xdialog_background"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	mDatosPrecioVentaUsuarioSeleccionado.Initialize
	mDatosPrecioVentaUsuarioSeleccionado.Put("Articulo","")
	mDatosPrecioVentaUsuarioSeleccionado.Put("DescripcionArticulo","")
	mDatosPrecioVentaUsuarioSeleccionado.Put("ArticuloBloqueado",False)
	Show
End Sub

Sub Show
	'If Not(frm.IsInitialized) Then
	'FirstTime=True
	frm.Initialize("frm",-1,-1)

	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
		
	frm.RootPane.LoadLayout("scrListaSeleccionGeneralJamTableView")
		
	Sleep(0)
		
	frm.Icon = Main.IconoFormularios
		
	frm.Title="Info Ventas"

	Dialog.Initialize(frm.RootPane)
	frm.Show
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,False)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
	
	jamTableView1.AbrirCamposBuilder
	Return
	
	jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView(".json",Null)
	wait for (rSub) complete (mRes As Map)
		
	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	'Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Precio Venta Usuario Línea Seleccionada","AddPrecioVentaUsuarioLineaSeleccionada",Chr(0xF0A4),jamTableView1.MenuBarLinea)
	
'	Dim cF As DatosCellFactoryJamTableView
'	cF.Initialize
'	cF.AliasCampoColumna="Bloqueado"
'	cF.CellFactoryEnCallBack=False
'	cF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'	jamTableView1.SetCellFactory(cF)
		
	'frm.Show
	'End If
	
	Inicio
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
	CallSubDelayed2(mCallBack,"cSeleccionArticuloNAV_Done",mDatosPrecioVentaUsuarioSeleccionado)
End Sub

Sub jamTableView1_AccionSalirJamTableView
	If mDatosPrecioVentaUsuarioSeleccionado.Get("Articulo")="" Then
		Dim msa As Object = xui.Msgbox2Async("No se ha seleccionado Artículo." & CRLF & CRLF & "¿Salir sin seleccionar?", "", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	SalirForm
End Sub


Sub Inicio
	'frm.Show
	jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
	wait for(DatosArticulosNav) complete (mResult As Map)
	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	If mResult.Get("Accion")="Salir" Then
		SalirForm
	End If
	jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
	Dim lstReg As List=mResult.Get("lstRes")
	Dim rSub As ResumableSub=jamTableView1.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
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

Sub DatosVentasCliente As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Accion",Accion)
	mResult.Put("lstRegistros",lstRegistros)
	Dim Comando As String
	Comando="AnalisisTarifasInfoVentasClienteArticulo"

	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)
	Wait For DatosJRDC_Completed (mResult As Map)
		
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Error"
		mResult.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos registrados de Artículos NAV", "Aviso")
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

Sub DatosVentasGRP As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Accion",Accion)
	mResult.Put("lstRegistros",lstRegistros)
	Dim Comando As String
	Comando="AnalisisTarifasInfoVentasGRPArticulo"

	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)
	Wait For DatosJRDC_Completed (mResult As Map)
		
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Error"
		mResult.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos registrados de Artículos NAV", "Aviso")
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
'		Case "Actualizar"
'			Inicio
		Case "AddPrecioVentaUsuarioLineaSeleccionada"
			Dim fSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			If fSel=-1 Then
				Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ninguna fila","Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim Dcs As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaSeleccionada
			SeleccionarDatosPrecioVentaUsuarioLinea(Dcs)
	End Select
End Sub

Sub jamTableView1_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim msa As Object = xui.Msgbox2Async("¿Añadir los datos de la línea como precio venta usuario?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	SeleccionarDatosPrecioVentaUsuarioLinea(DatosCeldaSeleccionada)
End Sub

Sub SeleccionarDatosPrecioVentaUsuarioLinea(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK
	mDatosPrecioVentaUsuarioSeleccionado.Put("Articulo",mDataPK.Get("Articulo"))
	Dim DescripcionArticulo As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"DescripcionArticulo")
	mDatosPrecioVentaUsuarioSeleccionado.Put("DescripcionArticulo",DescripcionArticulo)
	Dim ArticuloBloqueado As Int=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"Bloqueado")
	mDatosPrecioVentaUsuarioSeleccionado.Put("ArticuloBloqueado",ArticuloBloqueado)
	SalirForm
End Sub

Private Sub Background_MouseClicked (EventData As MouseEvent)
	EventData.Consume
End Sub