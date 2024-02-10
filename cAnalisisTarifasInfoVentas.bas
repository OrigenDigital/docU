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
	
	Dim mDatosLineaSeleccionada As Map
	
	Dim mTipoTarifa As Int
	Dim mCodigoTarifa As String
	Dim mArticulo As String
	Dim mDescripcionArticulo As String
	Dim mFechaInicialVentas, mFechaFinalVentas As Long

	Private btnSalir As Button
	Private txtArticulo As TextField
	Private txtDescripcionArticulo As TextField
End Sub

'Parent = frm.Rootpane del modulo callback
' Ejemplo forma llamar al formulario de seleccion. En el modulo CallBack:
'<code>
' Dim cSelArtNAV As cSeleccionArticuloNAV
' cSelArtNAV.Initialize(Me,fRegistro.PanelFondoFormRegistro)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
' wait for (cSelArtNAV) cSeleccionArticuloNAV_Done (mSelCliNAV as map)
'</code>
Public Sub Initialize(CallBack As Object,Parent As B4XView, _
		 TipoTarifa As String, CodigoTarifa As String, Articulo As String, DescripcionArticulo As String, _
		 FechaInicialVentas As Long, FechaFinalVentas As Long)
	mCallBack=CallBack
	mParent=Parent
	Background= xui.CreatePanel("background")
	Background.Tag = "b4xdialog_background"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	

	
	mTipoTarifa=TipoTarifa
	mCodigoTarifa=CodigoTarifa
	mArticulo=Articulo
	mDescripcionArticulo=DescripcionArticulo
	mFechaInicialVentas=FechaInicialVentas
	mFechaFinalVentas=FechaFinalVentas
	
	mDatosLineaSeleccionada.Initialize
	mDatosLineaSeleccionada.Put("PrecioSeleccionado",False)
'	mDatosLineaSeleccionada.Put("TipoTarifa","")
'	mDatosLineaSeleccionada.Put("CodigoTarifa","")
'	mDatosLineaSeleccionada.Put("Articulo","")
'	mDatosLineaSeleccionada.Put("DescripcionArticulo","")
	mDatosLineaSeleccionada.Put("PrecioDivisa",0)
	mDatosLineaSeleccionada.Put("Divisa","")
	Show
End Sub

Sub Show
	'If Not(frm.IsInitialized) Then
	'FirstTime=True
	frm.Initialize("frm",-1,-1)

	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
		
	frm.RootPane.LoadLayout("scrAnalisisTarifasInfoVentas")
		
	Sleep(0)
		
	frm.Icon = Main.IconoFormularios
		
	frm.Title=Main.PrefijoTitleForms & "    Info Ventas Periodo"
	


	Dialog.Initialize(frm.RootPane)
	frm.Show


	txtArticulo.Text=mArticulo
	txtDescripcionArticulo.Text=mDescripcionArticulo
	
		
'''	jamTableView1.AbrirCamposBuilder
'''	Return
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,False)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
	
	jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaAnalisisTarifasInfoVentasTipoTarifaCodigoTarifaArticulo.json",Null)
	wait for (rSub) complete (mRes As Map)
		
	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	'Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir Precio Seleccionado a Lista Precios Venta Usuario","AddPrecioVentaUsuarioLineaSeleccionada",Chr(0xF0A4),jamTableView1.MenuBarLinea)
	
	jamTableView1.AddContextMenuItemSeparator
	jamTableView1.AddContextMenuItemFontAwesomeText("Añadir Precio Seleccionado a Lista Precios Venta Usuario","AddPrecioVentaUsuarioLineaSeleccionada",Chr(0xF0A4))
	
	Dim cF As DatosCellFactoryJamTableView
	cF.Initialize
	cF.AliasCampoColumna="Fecha"
	cF.CellFactoryEnCallBack=False
	cF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFecha
	jamTableView1.SetCellFactory(cF)
	
	'jamTableView1.AsignarCellFactoryColumnaNumericoMenorIgualMayorColorFondoColorTexto(Array("Qty"),0,0x00FFFFFF,0xFFFF0000, 0x00FFFFFF,0xFF000000, 0x00FFFFFF,0xFF000000)
		
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
	CallSubDelayed2(mCallBack,"cAnalisisTarifasInfoVentas_Done",mDatosLineaSeleccionada)
End Sub

Sub jamTableView1_AccionSalirJamTableView
'	If mDatosLineaSeleccionada.Get("Articulo")="" Then
'		Dim msa As Object = xui.Msgbox2Async("No se ha seleccionado Artículo." & CRLF & CRLF & "¿Salir sin seleccionar?", "", "Sí", "", "No", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
'	End If
	SalirForm
End Sub


Sub Inicio

	jamTableView1.SetMouseCursor(fx.Cursors.WAIT)
	wait for(DatosVentasClienteGRP) complete (mResult As Map)
	jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)
	If mResult.Get("Accion")<>"Continuar" Then
		SalirForm
		Return
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


Sub DatosVentasClienteGRP As ResumableSub
	Dim lstRegistros As List
	lstRegistros.Initialize
	Dim Accion As String
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Accion",Accion)
	mResult.Put("lstRegistros",lstRegistros)
	Dim Comando As String
	Select Case mTipoTarifa
		Case 0
			Comando="AnalisisTarifasInfoVentasClienteArticulo"
		Case 1
			Comando="AnalisisTarifasInfoVentasGRPArticulo"
	End Select
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd"
	Dim sFechaInicialVentas As String=DateTime.Date(mFechaInicialVentas)
	Dim sFechaFinalVentas As String=DateTime.Date(mFechaFinalVentas)
	DateTime.DateFormat=DateFormatAnt

	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mCodigoTarifa, mArticulo, sFechaInicialVentas, sFechaFinalVentas), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
		
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="Error"
		mResult.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos registrados de ventas para los parámetros de tipo tarifa, código tarifa, artículo seleccionados", "Aviso")
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

Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddPrecioVentaUsuarioLineaSeleccionada"
			Dim Dcs As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaSeleccionada
			SeleccionarDatosPrecioVentaUsuarioLinea(Dcs)
	End Select
End Sub

Sub SeleccionarDatosPrecioVentaUsuarioLinea(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	'Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK
	mDatosLineaSeleccionada.Put("PrecioSeleccionado",True)
'	Dim TipoTarifa As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"TipoTarifa")
'	mDatosLineaSeleccionada.Put("TipoTarifa",TipoTarifa)
'	Dim CodigoTarifa As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"CodigoTarifa")
'	mDatosLineaSeleccionada.Put("CodigoTarifa",CodigoTarifa)
'	Dim Articulo As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"Articulo")
'	mDatosLineaSeleccionada.Put("Articulo",Articulo)
'	Dim DescripcionArticulo As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"DescripcionArticulo")
'	mDatosLineaSeleccionada.Put("DescripcionArticulo",DescripcionArticulo)
	Dim Divisa As String=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"Divisa")
	mDatosLineaSeleccionada.Put("Divisa",Divisa)
	Dim PrecioDivisa As Double=jamTableView1.GetValorSQLCampoFila(jamTableView1.GetIndiceFilaSeleccionada,"PrecioVenta")
	mDatosLineaSeleccionada.Put("PrecioDivisa",PrecioDivisa)
	SalirForm
End Sub

Private Sub Background_MouseClicked (EventData As MouseEvent)
	EventData.Consume
End Sub

