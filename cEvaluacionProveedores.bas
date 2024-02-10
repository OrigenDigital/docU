B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private xui As XUI
	
	Private Dialog As B4XDialog
	Private jamLoadingIndicator1 As JamLoadingIndicator
	
	Dim mSQL As SQL
		
	Private Drawer As B4XDrawer
	Private jamTableViewEvaluacionProveedores As jamTableView
	Private pnlFondoEvaluacionProveedores As B4XView
	Private lblIconCerrarDrawer As B4XView
	Private lblTextoCerrarDrawer As B4XView
	Private pnlTopDrawerLeft As B4XView
	Private TreeViewDrawer As TreeView
	
	Private BackgroundProveedoresFijosEvaluacion As B4XView
	Private BaseProveedoresFijosEvaluacion As B4XView
	Private jamTableViewProveedoresFijosEvaluacionProveedores As jamTableView
	Private btnAddMotivoFijarEvaluacionProveedor As B4XView
'	Private btnCancelarNuevoEditarProveedorFijoEvaluacion As B4XView
'	Private btnGrabarNuevoEditarProveedorFijoEvaluacion As B4XView
	
	Private lblTitleMotivosFijarEvaluacionProveedor As B4XView
	Private lblTitleProveedorFijoEvaluacion As B4XView
	Private pnlFondoProveedorFijoEvaluacion As B4XView
	Private txtNombreProveedorFijoEvaluacion As B4XView
	Private txtProveedorFijoEvaluacion As B4XView
	Private jamTableViewMotivosFijarEvaluacionProveedor As jamTableView
	Private lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion As B4XView
	
	Private ProveedorEdicion As String
	Private FilaJamTVEvalProveedorEdicion As Int
	
	Private PermisoCalificarProveedores As Boolean
	Private PermisoValidarCalificacionProveedores As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	#if debug
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	#else
	mSQL.InitializeSQLite("", ":memory:", True)
	#End If
End Sub

public Sub Show
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	
	
	'Drawer.Initialize(Me, "Drawer", frm.RootPane, 400dip)
	'Drawer.CenterPanel.LoadLayout("scrEvaluacionProveedores")
	'Drawer.leftpanel.LoadLayout("scrDrawerLeftTreeView")
	
	frm.RootPane.LoadLayout("scrEvaluacionProveedoresSinDrawer")
	
	Sleep(0)
	
	'CargaTreeViewDrawer
	
	frm.Show
	
	frm.Title=Main.PrefijoTitleForms & "    Evaluación Proveedores"
	
	
	CreacionTablasSQLite
	
	' EJEMPLOS de MENUS
		
	jamTableViewEvaluacionProveedores.EstadoMenuItem(jamTableViewEvaluacionProveedores.MenuBarAcciones,True)
	jamTableViewEvaluacionProveedores.EstadoMenuItem(jamTableViewEvaluacionProveedores.MenuBarLinea,True)
		
'	jamTableViewEvaluacionProveedores.AddMenuItemFontAwesomeToMenuInMenuBar("Gestión Proveedores Fijos","GestionProveedoresFijos",Chr(0xF0CB),jamTableViewEvaluacionProveedores.MenuBarAcciones)
	jamTableViewEvaluacionProveedores.AddMenuItemFontMaterialIconsToMenuInMenuBar("Actualizar Datos","ActualizarDatos",Chr(0xE5D5),jamTableViewEvaluacionProveedores.MenuBarAcciones)
	'jamTableViewEvaluacionProveedores.AddMenuItemFontAwesomeToMenuInMenuBar("Informe Proveedores Evaluables con Incidencias","InformeProveedoresEvaluablesConIncidencias",Chr(0xF0F6),jamTableViewEvaluacionProveedores.MenuBarAcciones)
	jamTableViewEvaluacionProveedores.AddMenuItemFontAwesomeToMenuInMenuBar("Calificar Proveedor","CalificarProveedor",Chr(0xF0F6),jamTableViewEvaluacionProveedores.MenuBarLinea)
	jamTableViewEvaluacionProveedores.AddMenuItemFontAwesomeToMenuInMenuBar("Borrar Calificación Proveedor","BorrarCalificacionProveedor",Chr(0xF014),jamTableViewEvaluacionProveedores.MenuBarLinea)
	jamTableViewEvaluacionProveedores.AddMenuItemFontAwesomeToMenuInMenuBar("Validar Calificación Proveedor","ValidarCalificacionProveedor",Chr(0xF046),jamTableViewEvaluacionProveedores.MenuBarLinea)
	jamTableViewEvaluacionProveedores.AddMenuItemFontAwesomeToMenuInMenuBar("Borrar Validación Calificación Proveedor","BorrarValidacionCalificacionProveedor",Chr(0xF05C),jamTableViewEvaluacionProveedores.MenuBarLinea)
	jamTableViewEvaluacionProveedores.AddMenuItemFontMaterialIconsToMenuInMenuBar("Configurar Proveedor FIJO Evaluación","ConfigurarProveedorFijoEvaluacion",Chr(0xE1B3),jamTableViewEvaluacionProveedores.MenuBarLinea)
	jamTableViewEvaluacionProveedores.AddContextMenuItemSeparator
	jamTableViewEvaluacionProveedores.AddContextMenuItemFontAwesomeText("Calificar Proveedor","CalificarProveedor",Chr(0xF0F6))
	jamTableViewEvaluacionProveedores.AddContextMenuItemFontAwesomeText("Borrar Calificación Proveedor","BorrarCalificacionProveedor",Chr(0xF014))
	jamTableViewEvaluacionProveedores.AddContextMenuItemFontAwesomeText("Validar Calificación Proveedor","ValidarCalificacionProveedor",Chr(0xF046))
	jamTableViewEvaluacionProveedores.AddContextMenuItemFontAwesomeText("Borrar Validación Calificación Proveedor","BorrarValidacionCalificacionProveedor",Chr(0xF05C))
	jamTableViewEvaluacionProveedores.AddContextMenuItemFontMaterialIconsText("Configurar Proveedor FIJO Evaluación","ConfigurarProveedorFijoEvaluacion",Chr(0xE1B3))

	''	Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableView1.AbrirCamposBuilder
'	Return
		
	Dim rSub As ResumableSub=jamTableViewEvaluacionProveedores.ConfigurarTableView("ListaEvaluacionProveedoresDatosActuales.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableViewEvaluacionProveedores.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'
	jamTableViewEvaluacionProveedores.AsignarCellFactoryColumnaFecha(Array("FechaActualizacionDatosLong","FechaCalificacion","FechaValidacionCalificacion"))
	jamTableViewEvaluacionProveedores.AsignarCellFactoryColumnaBooleanaTipoIntegerCheckBox(Array("Bloqueado", "ProveedorFijoEvaluacion"))
	jamTableViewEvaluacionProveedores.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("CalificacionProvisional"),"EVALUABLE",0x00FFFFFF,0xFF000000,0x00FFFFFF,xui.Color_Red)
	jamTableViewEvaluacionProveedores.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("Calificacion"),"NO APTO",0x00FFFFFF,0xFF000000,0x00FFFFFF,xui.Color_Red)
	jamTableViewEvaluacionProveedores.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("ValidacionCalificacion"),"NO OK",0x00FFFFFF,0xFF000000,0x00FFFFFF,xui.Color_Red)
	jamTableViewEvaluacionProveedores.AsignarCellFactoryColumnaNumericaFormatoStringDecimales(Array("ImporteNetoFacturacion12Meses"),"#,##0")
	
	Inicio
	
	
End Sub


Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub SalirModulo
	MainMenu2.Show
	frm.Close
End Sub

  Sub getForm As Form
   Return frm 
End Sub
 
Sub Inicio
 	
	Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"CalificacionProveedores")) complete (sRes As String)
	Select Case sRes
		Case "ErrConn"
			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query PermisosAplicacion.","Error")
			Wait For (msa) Msgbox_Result
			SalirModulo
			Return
		Case "SinPermiso"
			PermisoCalificarProveedores=False
		Case "ERROR"
			Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
			Wait For (msa) Msgbox_Result
			SalirModulo
			Return
		Case "DENIED"
			PermisoCalificarProveedores=False
		Case Else
			PermisoCalificarProveedores=True
	End Select
	
	Wait For(cmPermisos.PermisosAplicacionUsuarioObjetoPermiso(Main.rdclinkMySqlDatosComunes, "PermisosAplicacion",Main.NombreAplicacion,Main.DatosUsuario.NombreUsuarioWindows,"ValidarCalificacionProveedores")) complete (sRes As String)
	Select Case sRes
		Case "ErrConn"
			Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query PermisosAplicacion.","Error")
			Wait For (msa) Msgbox_Result
			SalirModulo
			Return
		Case "SinPermiso"
			PermisoValidarCalificacionProveedores=False
		Case "ERROR"
			Dim msa As Object=xui.MsgboxAsync(sRes,"Error")
			Wait For (msa) Msgbox_Result
			SalirModulo
			Return
		Case "DENIED"
			PermisoValidarCalificacionProveedores=False
		Case Else
			PermisoValidarCalificacionProveedores=True
	End Select
	
	wait for (RefrescarDatosActualesEvaluacion) complete (Success As Boolean)
	jamLoadingIndicator1.Close
End Sub

Sub RefrescarDatosActualesEvaluacion As ResumableSub
	wait for(EvaluacionProveedoresDatosEvaluacionActual) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		 SalirModulo
		 Return False
	End If
	
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblEvaluacionProveedoresDatosEvaluacionActual order by Proveedor")
	
	Dim rSub As ResumableSub=jamTableViewEvaluacionProveedores.setdata(rs)
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
				jamTableViewEvaluacionProveedores.AbrirCamposBuilder
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
				jamTableViewEvaluacionProveedores.SetPlaceholderText("")
			End If
		End If

	End If
	Return True
End Sub

Sub CargaTreeViewDrawer
	
	TreeViewDrawer.Root.Children.Clear

	Dim imgTreeItemGo As Image=Main.fx.LoadImageSample(File.Dirassets, "arrow-right16.png",16,16)
	
	Dim img As Image=Utilidades.SetFontToBitmap(Chr(0xf6cf), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
	
	Dim tiSalir As TreeItem
	tiSalir.Initialize("tItem","Salir")
	tiSalir.Image=Utilidades.MaterialIconsToBitmap(Chr(0xE879),24, 0xFFB22222)
	TreeViewDrawer.Root.Children.Add(tiSalir)
		
	Dim tExpandirTodoMenu As TreeItem
	tExpandirTodoMenu.Initialize("tItem","Expandir Menu")
	tExpandirTodoMenu.Image=Utilidades.SetFontToBitmap(Chr(0xf616), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tExpandirTodoMenu)
	
			
	Dim tContraerTodoMenu As TreeItem
	tContraerTodoMenu.Initialize("tItem","Contraer Menu")
	tContraerTodoMenu.Image=Utilidades.SetFontToBitmap(Chr(0xf615), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tContraerTodoMenu)

	Dim tActualizarDatos As TreeItem
	tActualizarDatos.Initialize("tItem","Actualizar Datos")
	tActualizarDatos.Image=Utilidades.SetFontToBitmap(Chr(0xf450), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,0xFF00BFFF)
	TreeViewDrawer.Root.Children.Add(tActualizarDatos)
	
	Dim tListaProveedoresFijosEvaluacion As TreeItem
	tListaProveedoresFijosEvaluacion.Initialize("tItem","Lista Proveedores Fijos Evaluación")
	tListaProveedoresFijosEvaluacion.Image=Utilidades.SetFontToBitmap(Chr(0xf27b), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
	TreeViewDrawer.Root.Children.Add(tListaProveedoresFijosEvaluacion)
	

	
End Sub

Private Sub TreeViewDrawer_SelectedItemChanged (SelectedItem As TreeItem)
	Drawer.LeftOpen=False
	
	If SelectedItem.IsInitialized=False Then Return
	
	Select Case SelectedItem.Text
		Case "Salir"
			SalirModulo
			Return
	End Select
End Sub

Private Sub pnlTopDrawerLeft_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen=False
End Sub

Private Sub lblTextoCerrarDrawer_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen=False
End Sub

Private Sub lblIconCerrarDrawer_MouseClicked (EventData As MouseEvent)
	Drawer.LeftOpen=False
End Sub

Private Sub btnMenuEvaluacionProveedores_Click
	Drawer.LeftOpen=True
End Sub

Sub CreacionTablasSQLite
	
	mSQL.ExecNonQuery("drop table if exists tblEvaluacionProveedoresDatosEvaluacionActual")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresDatosEvaluacionActual] ([Proveedor] TEXT, [NombreProveedor] TEXT, [Bloqueado] INTEGER
	, [GrupoContableProveedor] TEXT, [ImporteNetoFacturacion12Meses] INTEGER, [NumeroIncidencias12Meses] INTEGER, [ProveedorFijoEvaluacion] INTEGER, [CalificacionProvisional] TEXT, [FechaActualizacionDatosLong] INTEGER
	, [FechaCalificacion] INTEGER, [Calificacion] TEXT, [UsuarioCalificacion] TEXT,[FechaValidacionCalificacion] INTEGER, [ValidacionCalificacion] TEXT, [UsuarioValidacionCalificacion] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)

	mSQL.ExecNonQuery("drop table if exists tblEvaluacionProveedoresDatosNAVPeriodo")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblEvaluacionProveedoresDatosNAVPeriodo] ([Proveedor] TEXT, [NombreProveedor] TEXT, [Bloqueado] INTEGER, [GrupoContableProveedor] TEXT, [TotalImporteNetoFacturacion] REAL)"$
	mSQL.ExecNonQuery(sCrearTabla)

	mSQL.ExecNonQuery("drop table if exists tblEvaluacionProveedoresListaProveedoresFijos")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresListaProveedoresFijos] ([IDLinea] INTEGER
	, [ProveedorFijoEvaluacionProveedores] TEXT, [NombreProveedorFijoEvaluacionProveedoresaluacionProveedores] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblEvaluacionProveedoresNumeroIncidenciasPeriodo")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresNumeroIncidenciasPeriodo] ([Proveedor] TEXT, [NumeroIncidenciasPeriodo] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
	mSQL.ExecNonQuery("drop table if exists tblEvaluacionProveedoresSeleccionProveedoresFijos")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblEvaluacionProveedoresSeleccionProveedoresFijos] ([Proveedor] TEXT, [NombreProveedor] TEXT
	, [Bloqueado] INTEGER, [GrupoContableProveedor] TEXT, [TotalImporteNetoFacturacion] REAL, [ProveedorFijo] INTEGER)"$
	mSQL.ExecNonQuery(sCrearTabla)
	
End Sub


Sub ActualizarDatosNAVEvaluacionProveedores As ResumableSub

	mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresDatosNAVPeriodo")
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="DatosEvaluacionProveedores"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)

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
			Dim msa As Object=xui.MsgboxAsync("No hay datos de proveedores de navision.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblEvaluacionProveedores",mData0,"")
'			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblEvaluacionProveedoresDatosNAVPeriodo",lstReg)
		End If
	End If
	Return mRes
End Sub

Sub jamTableViewEvaluacionProveedores_AccionSalirJamTableView
	SalirModulo
End Sub


Private Sub jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		
		Case "Actualizar"
			ActualizarDatosEvaluacionProveedores12UltimosMeses
		
'		Case "GestionProveedoresFijos"
'			GestionProveedoresFijosEvaluacion
			
		Case "CalificarProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				wait for(Utilidades.MsgBoxXUI("Aviso","No se ha seleccionado ninguna fila.")) complete (rObj As Object)
				Return
			End If
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			CalificarProveedor(ProvSel,FilaSel)
			
		Case "BorrarCalificacionProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				wait for(Utilidades.MsgBoxXUI("Aviso","No se ha seleccionado ninguna fila.")) complete (rObj As Object)
				Return
			End If
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			BorrarCalificacionProveedor(ProvSel,FilaSel)
			
		Case "ValidarCalificacionProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				wait for(Utilidades.MsgBoxXUI("Aviso","No se ha seleccionado ninguna fila.")) complete (rObj As Object)
				Return
			End If
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			ValidarCalificacionProveedor(ProvSel,FilaSel)
			
		Case "BorrarValidacionCalificacionProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				wait for(Utilidades.MsgBoxXUI("Aviso","No se ha seleccionado ninguna fila.")) complete (rObj As Object)
				Return
			End If
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			BorrarValidacionCalificacionProveedor(ProvSel,FilaSel)
			
		Case "ActualizarDatos"
			ActualizarDatosEvaluacionProveedores12UltimosMeses
			
		Case "ConfigurarProveedorFijoEvaluacion"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				wait for(Utilidades.MsgBoxXUI("Aviso","No se ha seleccionado ninguna fila.")) complete (rObj As Object)
				Return
			End If
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			ConfigurarProveedorFijoEvaluacion(ProvSel,FilaSel)
			
	End Select
		
		
End Sub

Sub jamTableViewEvaluacionProveedores_ContextMenuItem_Action(TagMenuItem As String)

	Select Case TagMenuItem
		Case "CalificarProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			CalificarProveedor(ProvSel,FilaSel)
			
		Case "BorrarCalificacionProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			BorrarCalificacionProveedor(ProvSel,FilaSel)
			
		Case "ValidarCalificacionProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			ValidarCalificacionProveedor(ProvSel,FilaSel)
			
		Case "BorrarValidacionCalificacionProveedor"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			BorrarValidacionCalificacionProveedor(ProvSel,FilaSel)
			
		Case "ConfigurarProveedorFijoEvaluacion"
			Dim FilaSel As Int=jamTableViewEvaluacionProveedores.GetIndiceFilaSeleccionada
			Dim ProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Proveedor")
			ConfigurarProveedorFijoEvaluacion(ProvSel,FilaSel)
	End Select
End Sub

Sub EvaluacionProveedoresActualizarVariables As ResumableSub
	Dim prd As Period
	prd.Months=-12
	Dim FechaActualMenos12Meses As Long=DateUtils.AddPeriod(DateTime.Now,prd)
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="EvaluacionProveedoresActualizarVariables"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DateTime.Now,FechaActualMenos12Meses), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar aquí
			Accion="NOK"
'			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso")
'			Wait For (msa) Msgbox_Result
		Else

			Dim lstReg As List=mResult.Get("lstRes")
			Dim mRespuesta As Map=lstReg.Get(0)
			Dim sResp As String=mRespuesta.GetValueAt(0)
			If sResp.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error recuperando datos del SP " & Comando & "." & CRLF & CRLF & sResp,"Aviso")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
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
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync("No se han configurado proveedores fijos para la evaluación.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinProveedoresFijos"
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

'Sub GestionProveedoresFijosEvaluacion
'
'	
''	For Each xNode As B4XView In frm.RootPane
''		If xNode Is Pane Then
''			If xNode.Tag="BackgroundProveedoresFijosEvaluacion" Then
''				xNode.RemoveViewFromParent
''				Exit
''			End If
''		End If
''	Next
''	
''	BackgroundProveedoresFijosEvaluacion= xui.CreatePanel("BackgroundProveedoresFijosEvaluacion")
''	BackgroundProveedoresFijosEvaluacion.Tag = "BackgroundProveedoresFijosEvaluacion"
''	BackgroundProveedoresFijosEvaluacion.Color=0xaa000000
''	frm.RootPane.AddNode(BackgroundProveedoresFijosEvaluacion, 0, 0, frm.RootPane.Width, frm.RootPane.Height)
''
''	BaseProveedoresFijosEvaluacion=xui.CreatePanel("pnlBaseProveedoresFijosEvaluacion")
''	BaseProveedoresFijosEvaluacion.SetLayoutAnimated(0,0,0,650dip, 450dip)
''	BaseProveedoresFijosEvaluacion.LoadLayout("scrEvaluacionProveedoresProveedoresFijos")
''	
''	Sleep(0)
''	
''	BackgroundProveedoresFijosEvaluacion.AddView(BaseProveedoresFijosEvaluacion,(BackgroundProveedoresFijosEvaluacion.Width/2-BaseProveedoresFijosEvaluacion.Width/2), _
''		(BackgroundProveedoresFijosEvaluacion.Height/2-BaseProveedoresFijosEvaluacion.Height/2), BaseProveedoresFijosEvaluacion.Width, BaseProveedoresFijosEvaluacion.Height)
''	
''	jamTableViewProveedoresFijosEvaluacionProveedores.EstadoMenuItem(jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarAcciones,True)
''	jamTableViewProveedoresFijosEvaluacionProveedores.EstadoMenuItem(jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarLinea,True)
''	
''	jamTableViewProveedoresFijosEvaluacionProveedores.AddMenuItemFontMaterialIconsToMenuInMenuBar("Nuevo Proveedor Fijo Evaluación","NuevoProveedorFijoEvaluacion",Chr(0xE148),jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarAcciones)
''	jamTableViewProveedoresFijosEvaluacionProveedores.AddMenuItemFontMaterialIconsToMenuInMenuBar("Quitar Proveedor Fijo Evaluación","QuitarProveedorFijoEvaluacion",Chr(0xE15D),jamTableViewProveedoresFijosEvaluacionProveedores.MenuBarLinea)
''	
''
''	Dim rSub As ResumableSub=jamTableViewProveedoresFijosEvaluacionProveedores.ConfigurarTableView("ListaEvaluacionProveedoresListaProveedoresFijos.json",Null)
''	wait for (rSub) complete (mRes As Map)
''	Log(mRes)
''	If Not(mRes.Get("FlagOK")) Then
''		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
''		Wait For (msa) Msgbox_Result
''		frm.Close
''		Return
''	End If
''	
''	Wait For(CargaListaProveedoresFijosEvaluacion) complete (mRes As Map)
''	Dim Accion As String=mRes.Get("Accion")
''	If Accion="NOK" Then Return
''
''	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblEvaluacionProveedoresListaProveedoresFijos order by NombreProveedorFijoEvaluacionProveedoresaluacionProveedores")
''	
''	Dim rSub As ResumableSub=jamTableViewProveedoresFijosEvaluacionProveedores.setdata(rs)
''	Wait For (rSub) complete (mResultSetData As Map)
''	rs.Close
''	jamLoadingIndicator1.Close
''	If Not(mResultSetData.Get("FlagOK")) Then
''		If ""<>mResultSetData.Get("msgError") Then
''			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
''			Wait For (msa) Msgbox_Result
''			#if debug
''			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
''			Wait For (msa) Msgbox_Result (rInt As Int)
''			If rInt=xui.DialogResponse_Positive Then
''				jamTableViewProveedoresFijosEvaluacionProveedores.AbrirCamposBuilder
''				Return
''			End If
''			#End If
''			ExitApplication
''		End If
''		If ""<>mResultSetData.Get("msgAviso") Then
''			If True<>mResultSetData.Get("ListaVacia") Then
''				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
''				Wait For (msa) Msgbox_Result
''			Else
''				jamTableViewProveedoresFijosEvaluacionProveedores.SetPlaceholderText("")
''			End If
''		End If
''
''	End If
'
'	Dim cProvFij As cEvaluacionProveedoresProveedoresFijos
'	cProvFij.Initialize(Me,frm.RootPane)   ' OJO .... si se llama desde el FormRegistro, el Parent es su panel de fondo. Si se llama desde un form , entonces es su RootPane
'	wait for cEvaluacionProveedoresProveedoresFijos_Done
'	
'End Sub

Sub jamTableViewMotivosFijarEvaluacionProveedor_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "EliminarMotivoProveedorFijoEvaluacion"
			Dim FilaSel As Int=jamTableViewMotivosFijarEvaluacionProveedor.GetIndiceFilaSeleccionada
			Dim ProvSel As String=txtProveedorFijoEvaluacion.Text
			Dim IDMotivolSel As Int=jamTableViewMotivosFijarEvaluacionProveedor.GetValorSQLCampoFila(FilaSel,"IDMotivoProveedorFijoEvaluacion")
			EliminarMotivoProveedorFijoEvaluacion(ProvSel, IDMotivolSel)
	End Select
End Sub

Sub jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "AddMotivoProveedorFijoEvaluacion"
			Dim ProvSel As String=txtProveedorFijoEvaluacion.Text
			Dim NombreProvSel As String=txtNombreProveedorFijoEvaluacion.Text
			AddMotivosProveedorFijoEvaluacion(ProvSel, NombreProvSel)
		Case "EliminarMotivoProveedorFijoEvaluacion"
			Dim FilaSel As Int=jamTableViewMotivosFijarEvaluacionProveedor.GetIndiceFilaSeleccionada
			If FilaSel=-1 Then
				wait for(Utilidades.MsgBoxXUI("Aviso","No se ha seleccionado ninguna fila.")) complete (rObj As Object)
				Return
			End If
			Dim ProvSel As String=txtProveedorFijoEvaluacion.Text
			Dim IDMotivolSel As Int=jamTableViewMotivosFijarEvaluacionProveedor.GetValorSQLCampoFila(FilaSel,"IDMotivoProveedorFijoEvaluacion")
			EliminarMotivoProveedorFijoEvaluacion(ProvSel, IDMotivolSel)
	End Select
End Sub

Private Sub jamTableViewProveedoresFijosEvaluacionProveedores_AccionSalirJamTableView
	For Each xNode As B4XView In BackgroundProveedoresFijosEvaluacion.GetAllViewsRecursive
		xNode.RemoveViewFromParent
	Next
	BackgroundProveedoresFijosEvaluacion.RemoveViewFromParent
End Sub

Sub AddMotivosProveedorFijoEvaluacion(ProvSel As String, NombreProvSel As String)
	Wait For(EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor(ProvSel)) complete (mRes As Map)
	jamLoadingIndicator1.close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return 
	Dim lstReg As List=mRes.Get("lstReg")
	If lstReg.Size=0 Then Return 

'	Dialog.Title=$"Selecciona los motivos de proveedor fijo a asignar al proveedor ${ProvSel}.
'Es posible seleccionar varios"$
	Dialog.Title=$"Selecciona motivo de proveedor fijo a asignar al proveedor ${ProvSel}."$
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize
	'B4XListDlg.AllowMultiSelection=True
	B4XListDlg.AllowMultiSelection=False
	'B4XListDlg.MultiSelectionMinimum=1

	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
	
	Dim lstOpciones As List
	lstOpciones.Initialize
	For Each mData As Map In lstReg
		lstOpciones.Add(mData.Get("DescripcionMotivoProveedorFijoEvaluacion"))
	Next

	B4XListDlg.Options=lstOpciones
	
	B4XListDlg.Resize(600dip, 400dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "OK", "", "Cancelar")
	
'	Dialog.Base.Top=0.1*Dialog.mParent.Height
'	Dialog.Base.Width=500dip
	'Dialog.Base.Height=0.8*Dialog.mParent.Height
            
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'            
'	B4XListDlg.Resize(Dialog.Base.Width, Dialog.Base.Height-bCancel.Height)
'	bCancel.Top=Dialog.Base.Height-bCancel.Height-5dip
'	bCancel.Width=bCancel.Width+40dip
'	bCancel.Left=Dialog.Base.Width-bCancel.Width-5dip
'	bCancel.SetTextAlignment("CENTER","RIGHT")
	
'	xclv.AsView.Top=Dialog.Base.Height-Dialog.TitleBarHeight
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next

	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	If bOK.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bOK.Left=5dip
		bOK.TextSize=18
	End If

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return
	
'	Dim lstCommands As List
'	lstCommands.Initialize
'	Dim lstOpcionesSel As List=B4XListDlg.SelectedItems
'	For Each OpcionSel As String In lstOpcionesSel
'		For Each mDataLista As Map In lstReg
'			Dim DescrMap As String=mDataLista.Get("DescripcionMotivoProveedorFijoEvaluacion")
'			If DescrMap=OpcionSel Then
'				Dim IDMotivoSel As Int=mDataLista.Get("IDMotivoProveedorFijoEvaluacion")
'				Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresNuevoMotivoProveedorFijoProveedor",Array(ProvSel,NombreProvSel,IDMotivoSel))
'				lstCommands.Add(cmd)
'				Exit
'			End If
'		Next
'	Next
'	If lstCommands.Size>0 Then
'		Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstCommands)) complete (rBool As Boolean)
'		If rBool=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync("No ha sido posible añadir los motivos de proveedor fijo seleccionados.","Error")
'			Wait For (msa) Msgbox_Result
'			Return False
'		End If
'	
'	End If

	Dim OpcionSel As String=B4XListDlg.SelectedItem
	For Each mDataLista As Map In lstReg
		Dim DescrMap As String=mDataLista.Get("DescripcionMotivoProveedorFijoEvaluacion")
		If DescrMap=OpcionSel Then
			Dim IDMotivoSel As Int=mDataLista.Get("IDMotivoProveedorFijoEvaluacion")
			Exit
		End If
	Next
	
	Wait For(GrabarNuevoMotivoProveedorFijo(ProvSel,NombreProvSel,IDMotivoSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	Wait For(ActualizarDatosProveedorFijoProveedor(ProvSel)) complete (Success As Boolean)
	If Not(Success) Then
		'SalirProveedorFijoEvaluacion
		Return
	End If
	

End Sub

Sub EliminarMotivoProveedorFijoEvaluacion(ProvSel As String, IDMotProvFijoSel As Int)
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Eliminar el motivo de proveedor fijo seleccionado?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresEliminarMotivoProveedorFijoProveedor",Array(ProvSel,IDMotProvFijoSel))
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (rBool As Boolean)
'	If rBool=False Then
'		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar el motivo de proveedor fijo seleccionado.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	Wait For(ActualizarDatosProveedorFijoProveedor(ProvSel)) complete (Success As Boolean)
'	If Not(Success) Then
'		'SalirProveedorFijoEvaluacion
'		Return
'	End If

	Wait For(GrabarEliminarMotivoProveedorFijo(ProvSel,IDMotProvFijoSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	
	Wait For(ActualizarDatosProveedorFijoProveedor(ProvSel)) complete (Success As Boolean)
	If Not(Success) Then
		'SalirProveedorFijoEvaluacion
		Return
	End If

End Sub



Sub ActualizarDatosEvaluacionProveedores12UltimosMeses As ResumableSub
	
	'actualizar tabla datos NAV
	jamLoadingIndicator1.MensajeLoading="Actualizando datos NAV 12 meses..."
	jamLoadingIndicator1.Show
	Wait For(ActualizarDatosNAVEvaluacionProveedores) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then 
		jamLoadingIndicator1.Close
		Return False
	End If
	
	jamLoadingIndicator1.MensajeLoading="Actualizando datos proveedores en tabla evaluación..."
	' traspasar datos NAV a MySQL
	Dim lstCommands As List
	lstCommands.Initialize
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresBorrarDatosNAV",Null)
	lstCommands.Add(cmd)
	Dim rsDatosNAV As ResultSet=mSQL.ExecQuery("select * from tblEvaluacionProveedoresDatosNAVPeriodo order by Proveedor")
	Do While rsDatosNAV.NextRow
		Dim Proveedor As String=rsDatosNAV.GetString("Proveedor")
		Dim NombreProveedor As String=rsDatosNAV.GetString("NombreProveedor")
		Dim Bloqueado As Int=rsDatosNAV.GetString("Bloqueado")
		Dim GrupoContableProveedor As String=rsDatosNAV.GetString("GrupoContableProveedor")
		Dim TotalImporteNetoFacturacion As Double=rsDatosNAV.GetString("TotalImporteNetoFacturacion")
		Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresInsertarDatosNAVProveedor",Array(Proveedor,NombreProveedor,Bloqueado,GrupoContableProveedor,TotalImporteNetoFacturacion))
		lstCommands.Add(cmd)
	Loop
	rsDatosNAV.Close

	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstCommands)) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar los datos NAV de proveedores.","Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	Wait For(EvaluacionProveedoresActualizarVariables) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		Return False
	End If
	
'	Wait For(CargaListaProveedoresFijosEvaluacion) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		Return False
'	End If
'	
'	mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresSeleccionProveedoresFijos")
'	mSQL.ExecNonQuery($"insert into tblEvaluacionProveedoresSeleccionProveedoresFijos
'Select Proveedor, NombreProveedor, Bloqueado, GrupoContableProveedor, TotalImporteNetoFacturacion
'	,Case when coalesce(tblEvaluacionProveedoresListaProveedoresFijos.ProveedorFijoEvaluacionProveedores,'')<>'' then 1 else 0 end as ProveedorFijo
' from tblEvaluacionProveedoresdatosnavperiodo
' left JOIN
' tblEvaluacionProveedoresListaProveedoresFijos on tblEvaluacionProveedoresdatosnavperiodo.Proveedor=tblEvaluacionProveedoresListaProveedoresFijos.ProveedorFijoEvaluacionProveedores
'"$)
'
'	Wait For(CargaNumeroIncidenciasProveedorPeriodo) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then
'		jamLoadingIndicator1.Close
'		Return False
'	End If

	wait for (RefrescarDatosActualesEvaluacion) complete (Success As Boolean)

	jamLoadingIndicator1.Close
	Return True
End Sub



Sub CargaNumeroIncidenciasProveedorPeriodo As ResumableSub

	mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresNumeroIncidenciasPeriodo")
	
	Dim prd As Period
	prd.Months=-12
	Dim FechaActualMenos12Meses As Long=DateUtils.AddPeriod(DateTime.Now,prd)
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="EvaluacionProveedoresNumeroIncidenciasProveedorPeriodo"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(FechaActualMenos12Meses), Me)

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
			Dim msa As Object=xui.MsgboxAsync("No se han registrado incidencias de proveedor en el periodo.","Aviso")
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
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblEvaluacionProveedoresNumeroIncidenciasPeriodo",lstReg)
		End If
	End If
	Return mRes
End Sub




Sub EvaluacionProveedoresDatosEvaluacionActual As ResumableSub
	jamLoadingIndicator1.MensajeLoading="Actualizando datos evaluacion proveedores..."
	jamLoadingIndicator1.Show
	mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresDatosEvaluacionActual")

	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="EvaluacionProveedoresDatosEvaluacionActual"
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
			Dim msa As Object=xui.MsgboxAsync("No hay datos registrados de evaluación de proveedores.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblEvaluacionProveedoresDatosEvaluacionActual",mData0,"")
'			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblEvaluacionProveedoresDatosEvaluacionActual",lstReg)
		End If
	End If
	Return mRes
End Sub

Sub CalificarProveedor(ProvSel As String, FilaSel As Int) As ResumableSub
	Dialog.Title="Selecciona Calificación"
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
		
	Dim lstOpciones As List=Array As String("APTO","NO APTO")
	
	B4XListDlg.Options=lstOpciones
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,80dip)
	Next
	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return False

	Dim NuevaCalificacion As String=B4XListDlg.SelectedItem
'	If NuevaCalificacion=" " Then
'		Dim CalificacionActualProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Calificacion")
'		If CalificacionActualProvSel="" Then Return False
'		wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Borrar los datos de calificación del proveedor ${ProvSel}?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return False
'		Dim DateTimeActualizacion As Long=0
'		Dim UsuarioCalificacion As String=""
'	Else
		Dim DateTimeActualizacion As Long=DateTime.Now
		Dim UsuarioCalificacion As String=Main.DatosUsuario.NombreUsuarioWindows
'	End If


	Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresActualizarCalificacionProveedor",Array(ProvSel,DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion, DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion))
	
	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible actualizar la calificación del proveedor ${ProvSel}."$,"Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	jamTableViewEvaluacionProveedores.SQL.ExecNonQuery2("update tblOrigenDatos set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion,ProvSel))
	mSQL.ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion,ProvSel))
	
	jamTableViewEvaluacionProveedores.RefrescarFilaTVMetodoSQL(FilaSel)
	
	Return True
End Sub

Sub BorrarCalificacionProveedor(ProvSel As String, FilaSel As Int) As ResumableSub
	Dim CalificacionActualProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Calificacion")
	If CalificacionActualProvSel="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso",$"El proveedor ${ProvSel} no tiene calificación."$)) complete (rObj As Object)
		 Return False
	End If
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Borrar los datos de calificación del proveedor ${ProvSel}?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return False
	Dim NuevaCalificacion As String=""
	Dim DateTimeActualizacion As Long=0
	Dim UsuarioCalificacion As String=""
	
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresActualizarCalificacionProveedor",Array(ProvSel,DateTimeActualizacion,"",UsuarioCalificacion, DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion))
	
	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible borrar la calificación del proveedor ${ProvSel}."$,"Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	jamTableViewEvaluacionProveedores.SQL.ExecNonQuery2("update tblOrigenDatos set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion,ProvSel))
	mSQL.ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,NuevaCalificacion,UsuarioCalificacion,ProvSel))
	
	jamTableViewEvaluacionProveedores.RefrescarFilaTVMetodoSQL(FilaSel)
	
	Return True
	
End Sub



'
'Private Sub btnGrabarNuevoEditarIncidenciaProveedor_Click
'	
'End Sub
'
'Private Sub btnCancelarNuevoEditarProveedorFijoEvaluacion_Click
'	SalirProveedorFijoEvaluacion
'End Sub

Sub SalirProveedorFijoEvaluacion
	If jamTableViewMotivosFijarEvaluacionProveedor.NumeroTotalRegistros=0 Then
		wait for(Utilidades.MsgBox2XUI("Confirma",$"El proveedor ${txtProveedorFijoEvaluacion.Text} no tiene asignado ningún motivo de proveedor fijo, por lo que no es considerado como proveedor fijo.
Continuar?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
	End If
	
	For Each xNode As B4XView In BackgroundProveedoresFijosEvaluacion.GetAllViewsRecursive
		xNode.RemoveViewFromParent
	Next
	BackgroundProveedoresFijosEvaluacion.RemoveViewFromParent

	Wait For(EvaluacionProveedoresDatosEvaluacionActualProveedor(ProveedorEdicion)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.Close
		SalirModulo
	End If
	Dim lstReg As List=mRes.Get("lstReg")
	Dim mDataProv As Map=lstReg.Get(0)
	
	Dim ProveedorFijoEvaluacion As Boolean=mDataProv.Get("ProveedorFijoEvaluacion")
	Dim CalificacionProvisional As String=mDataProv.Get("CalificacionProvisional")
	
	jamTableViewEvaluacionProveedores.SQL.ExecNonQuery2("update tblOrigenDatos set ProveedorFijoEvaluacion=? where Proveedor=?",Array As Object(IIf(ProveedorFijoEvaluacion,1,0),ProveedorEdicion))
	mSQL.ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set ProveedorFijoEvaluacion=? where Proveedor=?",Array As Object(IIf(ProveedorFijoEvaluacion,1,0),ProveedorEdicion))
	jamTableViewEvaluacionProveedores.SQL.ExecNonQuery2("update tblOrigenDatos set CalificacionProvisional=? where Proveedor=?",Array As Object(CalificacionProvisional,ProveedorEdicion))
	mSQL.ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set CalificacionProvisional=? where Proveedor=?",Array As Object(CalificacionProvisional,ProveedorEdicion))
	jamTableViewEvaluacionProveedores.RefrescarFilaTVMetodoSQL(FilaJamTVEvalProveedorEdicion)
	
	FilaJamTVEvalProveedorEdicion=-1
	ProveedorEdicion=""
	
	jamLoadingIndicator1.close
	
End Sub

'Private Sub btnAddMotivoFijarEvaluacionProveedor_Click
'	
'End Sub

Sub ConfigurarProveedorFijoEvaluacion(ProvSel As String, FilaTVProvSel As Int)
	For Each xNode As B4XView In frm.RootPane
		If xNode Is Pane Then
			If xNode.Tag="BackgroundDatosNuevoComponente" Then
				xNode.RemoveViewFromParent
				Exit
			End If
		End If
	Next
	
	BackgroundProveedoresFijosEvaluacion= xui.CreatePanel("BackgroundProveedoresFijosEvaluacion")
	BackgroundProveedoresFijosEvaluacion.Tag = "BackgroundProveedoresFijosEvaluacion"
	BackgroundProveedoresFijosEvaluacion.Color=0xaa000000
	frm.RootPane.AddNode(BackgroundProveedoresFijosEvaluacion, 0, 0, frm.RootPane.Width, frm.RootPane.Height)

	BaseProveedoresFijosEvaluacion=xui.CreatePanel("pnlBase")
	BaseProveedoresFijosEvaluacion.SetLayoutAnimated(0,0,0,700dip, 450dip)
	BaseProveedoresFijosEvaluacion.LoadLayout("scrEvaluacionProveedoresConfigurarProveedorFijoEvaluacion")
	
	Sleep(0)
	
	BackgroundProveedoresFijosEvaluacion.AddView(BaseProveedoresFijosEvaluacion,(BackgroundProveedoresFijosEvaluacion.Width/2-BaseProveedoresFijosEvaluacion.Width/2), _
		(BackgroundProveedoresFijosEvaluacion.Height/2-BaseProveedoresFijosEvaluacion.Height/2), BaseProveedoresFijosEvaluacion.Width, BaseProveedoresFijosEvaluacion.Height)
		
	Utilidades.AddImageToLabel(lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion,File.DirAssets, "twotone_exit_black_24dp.png")
	
	txtProveedorFijoEvaluacion.Text=ProvSel
	txtNombreProveedorFijoEvaluacion.Text=mSQL.ExecQuerySingleResult2("select NombreProveedor from tblEvaluacionProveedoresDatosEvaluacionActual where Proveedor=?",Array As String(ProvSel))
	
	jamTableViewMotivosFijarEvaluacionProveedor.EstadoMenuItem(jamTableViewMotivosFijarEvaluacionProveedor.MenuBarTabla,True)
	
	jamTableViewMotivosFijarEvaluacionProveedor.AddMenuItemFontAwesomeToMenuInMenuBar("Añadir motivo proveedor fijo evaluación","AddMotivoProveedorFijoEvaluacion",Chr(0xF196),jamTableViewMotivosFijarEvaluacionProveedor.MenuBarAcciones)
	jamTableViewMotivosFijarEvaluacionProveedor.AddMenuItemFontAwesomeToMenuInMenuBar("Eliminar motivo proveedor fijo evaluación","EliminarMotivoProveedorFijoEvaluacion",Chr(0xF014),jamTableViewMotivosFijarEvaluacionProveedor.MenuBarLinea)
	jamTableViewMotivosFijarEvaluacionProveedor.AddContextMenuItemSeparator
	jamTableViewMotivosFijarEvaluacionProveedor.AddContextMenuItemFontAwesomeText("Eliminar motivo proveedor fijo evaluación","EliminarMotivoProveedorFijoEvaluacion",Chr(0xF014))
	
	Dim rSub As ResumableSub=jamTableViewMotivosFijarEvaluacionProveedor.ConfigurarTableView("ListaEvaluacionProveedoresMotivosProveedorFijo.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	Wait For(ActualizarDatosProveedorFijoProveedor(ProvSel)) complete (Success As Boolean)
	If Not(Success) Then
		SalirProveedorFijoEvaluacion
	End If
	FilaJamTVEvalProveedorEdicion=FilaTVProvSel
	ProveedorEdicion=ProvSel
End Sub

Sub ActualizarDatosProveedorFijoProveedor(ProvSel As String) As ResumableSub
	Wait For(EvaluacionProveedoresDatosProveedorFijo(ProvSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then
		jamLoadingIndicator1.close
		Return False
	End If
	
	Dim lstReg As List=mRes.Get("lstReg")
	
	Dim rSub As ResumableSub=jamTableViewMotivosFijarEvaluacionProveedor.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	jamLoadingIndicator1.close
	lstReg.Initialize
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewMotivosFijarEvaluacionProveedor.AbrirCamposBuilder
				Return False
			End If
			#End If
			ExitApplication
		End If
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return True
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If
	End If
	Return True
End Sub

Sub EvaluacionProveedoresDatosProveedorFijo(ProvSel As String) As ResumableSub
	jamLoadingIndicator1.MensajeLoading="Actualizando datos proveedor fijo..."
	jamLoadingIndicator1.Show
	'mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresDatosEvaluacionActual")

	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Dim Comando As String="EvaluacionProveedoresDetalleProveedorFijo"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(ProvSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"No hay datos registrados de proveedor fijo para el proveedor ${ProvSel}."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
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

Sub EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor(ProvSel As String) As ResumableSub
	jamLoadingIndicator1.MensajeLoading=$"Cargando tipos motivo proveedor fijo no asignados al proveedor ${ProvSel}..."$
	jamLoadingIndicator1.Show
	'mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresDatosEvaluacionActual")

	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Dim Comando As String="EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(ProvSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"El proveedor seleccionado (${ProvSel}) tiene asignados todos los motivos de proveedor fijo existentes."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
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

Private Sub lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MouseReleased (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xNode.Color,1dip,0xFF696969,5)
	'xNode.TextColor=xui.Color_White
	
'	For Each xNode As B4XView In BackgroundProveedoresFijosEvaluacion.GetAllViewsRecursive
'		xNode.RemoveViewFromParent
'	Next
'	BackgroundProveedoresFijosEvaluacion.RemoveViewFromParent
	SalirProveedorFijoEvaluacion
End Sub

Private Sub lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MouseEntered (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xNode.Color,1dip,xui.Color_Cyan,5)
	'xNode.TextColor=xui.Color_Black
End Sub

Private Sub lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MousePressed (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	xNode.SetColorAndBorder(xNode.Color,1dip,xui.Color_Cyan,5)
	'xNode.TextColor=xui.Color_Black
End Sub

Private Sub lblSalirEvaluacionProveedoresConfigurarProveedorFijoEvaluacion_MouseExited (EventData As MouseEvent)
	Dim xNode As B4XView=Sender
	If xNode.IsInitialized Then
		xNode.SetColorAndBorder(xNode.Color,1dip,0xFF696969,5)
		'xNode.TextColor=xui.Color_White
	End If
End Sub

Sub GrabarNuevoMotivoProveedorFijo(ProvSel As String, NombreProvSel As String, IDMot As Int) As ResumableSub
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="EvaluacionProveedoresNuevoMotivoProveedorFijoProveedor"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(ProvSel,NombreProvSel,IDMot, DateTime.Now), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar aquí
			Accion="NOK"
			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso")
'			Wait For (msa) Msgbox_Result
		Else

			Dim lstReg As List=mResult.Get("lstRes")
			Dim mRespuesta As Map=lstReg.Get(0)
			Dim sResp As String=mRespuesta.GetValueAt(0)
			If sResp.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error SP " & Comando & "." & CRLF & CRLF & sResp & CRLF & CRLF & "No ha sido posible grabar el motivo de proveedor fijo.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

Sub GrabarEliminarMotivoProveedorFijo(ProvSel As String, IDMot As Int) As ResumableSub
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="EvaluacionProveedoresEliminarMotivoProveedorFijoProveedor"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(ProvSel,IDMot, DateTime.Now), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then  ' este caso no se puede dar aquí
			Accion="NOK"
			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso")
'			Wait For (msa) Msgbox_Result
		Else

			Dim lstReg As List=mResult.Get("lstRes")
			Dim mRespuesta As Map=lstReg.Get(0)
			Dim sResp As String=mRespuesta.GetValueAt(0)
			If sResp.StartsWith("ERROR") Then
				Dim msa As Object=xui.MsgboxAsync("Error SP " & Comando & "." & CRLF & CRLF & sResp & CRLF & CRLF & "No ha sido posible eliminar el motivo de proveedor fijo.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
				'mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub


Sub EvaluacionProveedoresDatosEvaluacionActualProveedor(ProvSel As String) As ResumableSub
	jamLoadingIndicator1.MensajeLoading=$"Cargando datos proveedor ${ProvSel}..."$
	jamLoadingIndicator1.Show
	'mSQL.ExecNonQuery("delete from tblEvaluacionProveedoresDatosEvaluacionActual")

	
	Dim Accion As String
	Dim lstReg As List
	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Dim Comando As String="EvaluacionProveedoresDatosEvaluacionActualProveedor"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(ProvSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync($"El proveedor seleccionado (${ProvSel}) no tiene datos asignados."$,"Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
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

Sub ValidarCalificacionProveedor(ProvSel As String, FilaSel As Int) As ResumableSub
	
	Dim CalificacionActualProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"Calificacion")
	If CalificacionActualProvSel="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso",$"El proveedor ${ProvSel} no tiene calificación."$)) complete (rObj As Object)
		Return False
	End If
	
	Dialog.Title="Selecciona Validación Calificación"
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
		
	Dim lstOpciones As List=Array As String("OK","NO OK")
	
	B4XListDlg.Options=lstOpciones
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,80dip)
	Next
	

	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	If rInt<>xui.DialogResponse_Positive Then Return False

	Dim NuevaValidacionCalificacion As String=B4XListDlg.SelectedItem
	

	Dim DateTimeActualizacion As Long=DateTime.Now
	Dim UsuarioValidacionCalificacion As String=Main.DatosUsuario.NombreUsuarioWindows

	Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresActualizarValidacionCalificacionProveedor",Array(DateTimeActualizacion,NuevaValidacionCalificacion, UsuarioValidacionCalificacion,ProvSel))
	
	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible actualizar la validación de la calificación del proveedor ${ProvSel}."$,"Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	jamTableViewEvaluacionProveedores.SQL.ExecNonQuery2("update tblOrigenDatos set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,NuevaValidacionCalificacion, UsuarioValidacionCalificacion,ProvSel))
	mSQL.ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,NuevaValidacionCalificacion, UsuarioValidacionCalificacion,ProvSel))
	
	jamTableViewEvaluacionProveedores.RefrescarFilaTVMetodoSQL(FilaSel)
	
	Return True
End Sub

Sub BorrarValidacionCalificacionProveedor(ProvSel As String, FilaSel As Int) As ResumableSub
	Dim ValidacionCalificacionActualProvSel As String=jamTableViewEvaluacionProveedores.GetValorSQLCampoFila(FilaSel,"ValidacionCalificacion")
	If ValidacionCalificacionActualProvSel="" Then
		wait for(Utilidades.MsgBoxXUI("Aviso",$"El proveedor ${ProvSel} no tiene calificación validada."$)) complete (rObj As Object)
		 Return False
	End If
	
	wait for(Utilidades.MsgBox2XUI("Confirma",$"¿Borrar los datos de validación de calificación del proveedor ${ProvSel}?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return False
	Dim DateTimeActualizacion As Long=0
	Dim UsuarioValidacionCalificacion As String=""
	
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("EvaluacionProveedoresActualizarValidacionCalificacionProveedor",Array(DateTimeActualizacion,"",UsuarioValidacionCalificacion,ProvSel))
	
	Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (rBool As Boolean)
	If rBool=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync($"No ha sido posible borrar la validación de la calificación del proveedor ${ProvSel}."$,"Error")
		Wait For (msa) Msgbox_Result
		Return False
	End If
	
	jamTableViewEvaluacionProveedores.SQL.ExecNonQuery2("update tblOrigenDatos set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,"",UsuarioValidacionCalificacion,ProvSel))
	mSQL.ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",Array As Object(DateTimeActualizacion,"",UsuarioValidacionCalificacion,ProvSel))
	
	jamTableViewEvaluacionProveedores.RefrescarFilaTVMetodoSQL(FilaSel)
	
	Return True
	
End Sub