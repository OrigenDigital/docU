B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private jamTableViewProveedoresFijosEvaluacionProveedores As jamTableView
	Private xui As XUI
	Private frm As Form
	Private Dialog As B4XDialog
	Private jamLoadingIndicator1 As JamLoadingIndicator
	
	Private mSQL As SQL
	
	Private mCallBack As Object
	Private mParent As B4XView
	Dim Background As B4XView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(CallBack As Object,Parent As B4XView)
	mCallBack=CallBack
	mParent=Parent
	Background= xui.CreatePanel("backgroundProveedoresFijos")
	Background.Tag = "backgroundProveedoresFijos"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
	
	Show
End Sub


Sub Show
	'If Not(frm.IsInitialized) Then
	'FirstTime=True
	frm.Initialize("frm",-1,-1)

	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
		
	frm.RootPane.LoadLayout("scrEvaluacionProveedoresProveedoresFijos")
		
	Sleep(0)
		
	frm.Icon = Main.IconoFormularios
		
	frm.Title=Main.PrefijoTitleForms & "  Proveedores fijos Evaluación "

	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	frm.Show
		
	jamTableViewProveedoresFijosEvaluacionProveedores.EstadoMenuItem(jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarAcciones,True)
	jamTableViewProveedoresFijosEvaluacionProveedores.EstadoMenuItem(jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarLinea,True)
	
	jamTableViewProveedoresFijosEvaluacionProveedores.AddMenuItemFontMaterialIconsToMenuInMenuBar("Nuevo Proveedor Fijo Evaluación","NuevoProveedorFijoEvaluacion",Chr(0xE148),jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarAcciones)
	jamTableViewProveedoresFijosEvaluacionProveedores.AddMenuItemFontMaterialIconsToMenuInMenuBar("Quitar Proveedor Fijo Evaluación","QuitarProveedorFijoEvaluacion",Chr(0xE15D),jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarLinea)
	

	Dim rSub As ResumableSub=jamTableViewProveedoresFijosEvaluacionProveedores.ConfigurarTableView("ListaEvaluacionProveedoresListaProveedoresFijos.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Wait For(CargaListaProveedoresFijosEvaluacion) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblEvaluacionProveedoresListaProveedoresFijos order by NombreProveedorFijoEvaluacionProveedoresaluacionProveedores")
	
	Dim rSub As ResumableSub=jamTableViewProveedoresFijosEvaluacionProveedores.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewProveedoresFijosEvaluacionProveedores.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True<>mResultSetData.Get("ListaVacia") Then
				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
				Wait For (msa) Msgbox_Result
			Else
				jamTableViewProveedoresFijosEvaluacionProveedores.SetPlaceholderText("")
			End If
		End If

	End If
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub btnSalir_Click
	SalirForm
End Sub

Sub SalirForm
	jamTableViewProveedoresFijosEvaluacionProveedores.GuardarConfiguracionColumnasUsuario
	jamTableViewProveedoresFijosEvaluacionProveedores.LimpiarTabla
	Background.RemoveViewFromParent
	frm.Close
	CallSubDelayed(mCallBack,"cEvaluacionProveedoresProveedoresFijos_Done")
End Sub

Sub jamTableViewProveedoresFijosEvaluacionProveedores_AccionSalirJamTableView

	SalirForm
End Sub

Sub CargaListaProveedoresFijosEvaluacion As ResumableSub

	mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresListaProveedoresFijos")
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="EvaluacionProveedoresListaProveedoresFijos"
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
			Dim msa As Object=xui.MsgboxAsync("No se han configurado proveedores fijos para la evaluación.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblEvaluacionProveedores",mData0,"")
'			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblEvaluacionProveedoresListaProveedoresFijos",lstReg)
		End If
	End If
	Return mRes
End Sub
