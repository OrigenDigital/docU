B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@

Sub Class_Globals

	Private fx As JFX
	Private xui As XUI
	Private frm As Form

	'
	Private btnSalir As Button
	Private jamTableView1 As jamTableView
	
	Dim Dialog As B4XDialog
	Dim mSQL As SQL
	
	Public PermisoModuloUsuario As String
	Public DepartamentoEmisor As String
	
	
	Private jamLoadingIndicator1 As JamLoadingIndicator
	Private TextAreaDialog As TextArea
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
		#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
End Sub

Public Sub Show
	'If frm.IsInitialized=False Then
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	frm.RootPane.LoadLayout("scrIncidenciasProveedorListaTareasPendientes")
	Sleep(0)
	
	frm.Title=Main.PrefijoTitleForms & "Lista Tareas Pendientes Incidencias Proveedor"
	
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	'End If

	
	frm.Show
	


	CreacionTablasSQLite
	
	' EJEMPLOS de MENUS
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Actualizar Datos","Actualizar",Chr(0xF021),jamTableView1.MenuBarAcciones)
	jamTableView1.AddContextMenuItemSeparator
	jamTableView1.AddContextMenuItemFontAwesomeText("Ficha Incidencia Proveedor","FichaIncidenciaProveedor",Chr(0xF0F6))
	jamTableView1.AddContextMenuItemFontAwesomeText("Ver Descripción Incidencia","VerDescripcionIncidencia",Chr(0xF022))

	''	Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableView1.AbrirCamposBuilder
'	Return
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaIncidenciasProveedorTareasPendientes.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	'jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap

	'jamTableView1.AsignarCellFactoryColumnaFecha(Array("FechaIncidenciaLong","FechaDocumentoProveedorLong","FechaAccionComprasLong","FechaCierreLong"))
	jamTableView1.AsignarCellFactoryColumnaFecha(Array("FechaTarea"))
'	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("Estado"),"ABIERTA",0x00FFFFFF,0xFF000000,0x00FFFFFF,xui.Color_Red)
	
	ActualizarDatos

End Sub

private Sub asJO(o As JavaObject) As JavaObject
	Return o
End Sub


Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	jamTableView1.GuardarConfiguracionColumnasUsuario
	frm.Close
	MainMenu2.Show
End Sub

Sub ActualizarDatos
	
	

	jamLoadingIndicator1.MensajeLoading="Cargando datos lista tareas pendientes incidencias proveedor..."
	jamLoadingIndicator1.Show
	Wait For(ActualizarDatosLista) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		jamLoadingIndicator1.close
		SalirModulo
		Return
	End If
	'Dim lstReg As List=mRes.get("lstReg")
	
'	mSQL.ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='ABIERTA' where EstadoIncidencia=?",Array As Object(0))
'	mSQL.ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='CERRADA' where EstadoIncidencia=?",Array As Object(1))
'	mSQL.ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='ANULADA' where EstadoIncidencia=?",Array As Object(2))

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblIncidenciasProveedorListaTareasPendientes")
	Dim rSub As ResumableSub=jamTableView1.setdata(rs)
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
				jamTableView1.AbrirCamposBuilder
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
				jamTableView1.SetPlaceholderText("")
			End If
		End If

	End If
	
	'fx.Msgbox(frm,"Datos actualizados.","Aviso")



End Sub


' EJEMPLO CREACION DE TABLA INTERNA
Sub CreacionTablasSQLite

	mSQL.ExecNonQuery("drop table if exists tblIncidenciasProveedorListaTareasPendientes")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorListaTareasPendientes] ([IDTarea] INTEGER
	, [IDIncidenciaProveedor] INTEGER, [IncidenciaProveedor] TEXT, [FechaTarea] INTEGER, [DepartamentoAsignadoTarea] TEXT
	, [Proveedor] TEXT, [NombreProveedor] TEXT, [DescripcionIncidencia] TEXT, [UsuarioCreacionTarea] TEXT, [DescripcionTarea] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)

	
End Sub


Sub ActualizarDatosLista As ResumableSub

	mSQL.ExecNonQuery("delete from tblIncidenciasProveedorListaTareasPendientes")
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	'Dim Comando As String="IncidenciasProveedorLista"
	Dim Comando As String="IncidenciasProveedorTareasPendientes"
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
			Dim msa As Object=xui.MsgboxAsync("No hay tareas de incidencias de proveedor pendientes.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorListaTareasPendientes",mData0,"")
'			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorListaTareasPendientes",lstReg)
		End If
	End If
	Return mRes
End Sub



Sub jamTableView1_AccionSalirJamTableView
	SalirModulo
End Sub

Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "Actualizar"
			ActualizarDatos

	End Select
End Sub

' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "FichaIncidenciaProveedor"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim IDIncidenciaProveedorSel As Int=jamTableView1.GetValorSQLCampoFila(FilaSel, "IDIncidenciaProveedor")
			Dim IncidenciaProveedorSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel, "IncidenciaProveedor")

			AbrirFichaIncidenciaProveedor(IDIncidenciaProveedorSel, IncidenciaProveedorSel)
			
		Case "VerDescripcionIncidencia"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim IDIncidenciaProveedorSel As Int=jamTableView1.GetValorSQLCampoFila(FilaSel, "IDIncidenciaProveedor")
			Dim IncidenciaProveedorSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel, "IncidenciaProveedor")
			VerDecripcionIncidencia(IDIncidenciaProveedorSel, IncidenciaProveedorSel)
	End Select
End Sub


''EJEMPLO
'Sub jamTableView1_CambioEnCeldaSeleccionada(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'
'End Sub


''EJEMPLO
'Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Select DatosCeldaSeleccionada.AliasCampo
'		Case "ExcluidoReclamacion"
'			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
'	End Select
'End Sub

Sub jamTableView1_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim FilaSel As Int=DatosCeldaSeleccionada.Fila
	Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
	Dim IDIncidenciaProveedorSel As Int=jamTableView1.GetValorSQLCampoFila(FilaSel, "IDIncidenciaProveedor")
	Dim IncidenciaProveedorSel As String=jamTableView1.GetValorSQLCampoFila(FilaSel, "IncidenciaProveedor")

	AbrirFichaIncidenciaProveedor(IDIncidenciaProveedorSel, IncidenciaProveedorSel)
End Sub

''EJEMPLO para checkbox editable en la lista 
'Sub AlternarExcluidoReclamacion(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Log(DatosCeldaSeleccionada)
'	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
'	Dim NuevoValor As Int
'	Select ValorActual
'		Case 0
'			NuevoValor=1
'			
'		Case 1
'			NuevoValor=0
'	End Select
'	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
'	Dim PedidoSel As String=mPK.Get("Pedido")
'	Dim LineaSel As String=mPK.Get("Linea")
'	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",Array(NuevoValor,PedidoSel, LineaSel))
'	jamTableView1.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
'	jamTableView1.SeleccionarCelda("ExcluidoReclamacion",DatosCeldaSeleccionada.Fila)
'End Sub


Sub AbrirFichaIncidenciaProveedor(IDIncProvSel As Int, IncProv As String)
	Dim cFichaIncProv As cIncidenciaProveedorFicha
	cFichaIncProv.Initialize(IDIncProvSel, IncProv)
	cFichaIncProv.DepartamentoEmisor=DepartamentoEmisor
	cFichaIncProv.Show
	frm.Close
End Sub

Sub VerDecripcionIncidencia(IDIncSel As Int, IncidenciaProveedorSel As String)
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	Wait For(CargaDatosCabeceraIncidencia(IDIncSel, IncidenciaProveedorSel)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		'jamLoadingIndicator1.Close
		Return
	End If
	
	Dim mData0 As Map=mRes.Get("mData0")
	Dim DescripcionIncidencia As String=mData0.Get("DescripcionIncidencia")

	Dim DialogTitleBarHeightAnt As Int=Dialog.TitleBarHeight
	Dialog.TitleBarHeight=60dip
	Dialog.Title=$"Descripción de la incidencia."$
	
	Dim pBaseTextArea As B4XView = xui.CreatePanel("")
	pBaseTextArea.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)
	pBaseTextArea.LoadLayout("scrDialogTextArea")
	'TextAreaDialog.Text=TextAreaDescripcionIncidencia.Text
	TextAreaDialog.Text=DescripcionIncidencia
	TextAreaDialog.As(JavaObject).RunMethod("setFont",Array(xui.CreateDefaultFont(12).ToNativeFont))
	TextAreaDialog.As(JavaObject).RunMethod("setEditable",Array(False))
	
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseTextArea, "OK", "", "")
	'TextAreaDialog.RequestFocus
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	
'	bCancel.Left=bCancel.Left-25dip
'	bCancel.Width=bCancel.Width+25dip
'	bCancel.TextSize=15
	
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	bOK.Left=5dip
	
	Wait For (rSub) Complete (rInt As Int)
	Dialog.TitleBarHeight=DialogTitleBarHeightAnt
	'If rInt <> xui.DialogResponse_Positive Then Return

End Sub


Sub CargaDatosCabeceraIncidencia(IDIncSel As Int, IncidenciaProveedorSel As String) As ResumableSub
	
	Dim Accion As String
	Dim mData0 As Map
	mData0.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("mData0",mData0)
	Dim Comando As String="IncidenciasProveedorDatosCabeceraIncidencia"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(IDIncSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No existe la incidencia seleccionada (${IncidenciaProveedorSel})"$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			mData0=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData0", mData0)
		End If
	End If
	Return mRes
End Sub



