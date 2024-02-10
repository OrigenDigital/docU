B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
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
	
	frm.RootPane.LoadLayout("scrIncidenciasProveedorLista")
	Sleep(0)
	
	frm.Title=Main.PrefijoTitleForms & "Lista Incidencias Proveedor"
	
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	
	'End If

	
	frm.Show

	CreacionTablasSQLite
	
	' EJEMPLOS de MENUS
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
		
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Nueva Incidencia proveedor","NuevaIncidenciaProveedorCompras",Chr(0xF196),jamTableView1.MenuBarAcciones)
	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Ficha Incidencia Proveedor","FichaIncidenciaProveedor",Chr(0xF0F6),jamTableView1.MenuBarLinea)
	jamTableView1.AddContextMenuItemSeparator
	jamTableView1.AddContextMenuItemFontAwesomeText("Ficha Incidencia Proveedor","FichaIncidenciaProveedor",Chr(0xF0F6))

''	Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableView1.AbrirCamposBuilder
'	Return
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaIncidenciasProveedorCompras.json",Null)
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
	jamTableView1.AsignarCellFactoryColumnaFecha(Array("FechaIncidenciaLong","FechaDocumentoProveedorLong","FechaCierreLong"))
	jamTableView1.AsignarCellFactoryColumnaTexto1CondicionColorFondoColorTexto(Array("Estado"),"ABIERTA",0x00FFFFFF,0xFF000000,0x00FFFFFF,xui.Color_Red)
	
	wait for(ActualizarDatos) complete (rObj As Object)
	
	If Main.sCamposFiltradosListaIncidenciasProveedor<>"" And Main.lstValoresFiltrosListaIncidenciasProveedor.Size>0 Then
		jamTableView1.sCamposFiltrados= Utilidades.CopyObject(Main.sCamposFiltradosListaIncidenciasProveedor)
		jamTableView1.lstValoresFiltros=Utilidades.CopyObject(Main.lstValoresFiltrosListaIncidenciasProveedor)
		
	End If

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

Sub ActualizarDatos As ResumableSub

	jamLoadingIndicator1.MensajeLoading="Cargando datos lista incidencias proveedor..."
	jamLoadingIndicator1.Show
	Wait For(ActualizarDatosLista) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="Salir" Then
		jamLoadingIndicator1.close
		SalirModulo
		Return Null
	End If
	'Dim lstReg As List=mRes.get("lstReg")
	
	mSQL.ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='ABIERTA' where EstadoIncidencia=?",Array As Object(0))
	mSQL.ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='CERRADA' where EstadoIncidencia=?",Array As Object(1))
	mSQL.ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='ANULADA' where EstadoIncidencia=?",Array As Object(2))

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblIncidenciasProveedorListaCompras")
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
				Return Null
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
	Return Null
End Sub


' EJEMPLO CREACION DE TABLA INTERNA
Sub CreacionTablasSQLite

	mSQL.ExecNonQuery("drop table if exists tblIncidenciasProveedorListaCompras")
	Dim sCrearTabla As String=$"CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorListaCompras] ([IDIncidenciaProveedor] INTEGER
	, [IncidenciaProveedor] TEXT, [MigracionAccess] INTEGER, [Estado] TEXT default '', [EstadoIncidencia] INTEGER,[DepartamentoCoordinador] TEXT, [NumTareasAbiertas] INTEGER default 0
	, [TipoOrigenIncidenciaProveedor] TEXT,[IDUsuarioEmisor] INTEGER, [NombreUsuarioEmisor] TEXT, [IDUsuarioCompras] INTEGER, [NombreUsuarioCompras] TEXT
	, [FechaIncidenciaLong] INTEGER, [Proveedor] TEXT, [NombreProveedor] TEXT, [OrigenIncidencia] TEXT, [IDTipoDocumento] INTEGER, [DocumentoProveedor] TEXT
	, [FechaDocumentoProveedorLong] INTEGER, [IDTipoDocumentoOrigen] INTEGER, [NombreTipoDocumento] TEXT, [DocumentoOrigen] TEXT, [DescripcionIncidencia] TEXT, [IDTipoIncidencia] INTEGER
	, [NombreTipoIncidencia] TEXT, [AccionCompras] TEXT, [FechaAccionComprasLong] INTEGER, [IDUsuarioAccionCompras] INTEGER, [NombreUsuarioAccionCompras] TEXT
	, [FechaCierreLong] INTEGER, [IDUsuarioCierre] INTEGER, [NombreUsuarioCierre] TEXT, [GravedadIncidencia] TEXT, [ResponsabilidadInterna] INTEGER default 0)"$
	mSQL.ExecNonQuery(sCrearTabla)

	
End Sub


Sub ActualizarDatosLista As ResumableSub

	mSQL.ExecNonQuery("delete from tblIncidenciasProveedorListaCompras")
	
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	'Dim Comando As String="IncidenciasProveedorLista"
	Dim Comando As String="IncidenciasProveedorListaDesdeFecha"
	Dim FechaInicialConsulta As Long=DateUtils.SetDate(DateTime.GetYear(DateTime.Now)-2,1,1)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Array(FechaInicialConsulta), Me)  ' ver incidencias desde el 01/01/ de hace 2 años

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
			Dim msa As Object=xui.MsgboxAsync("No hay incidencias de proveedor registradas.","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="OK"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorListaCompras",mData0,"")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			'mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorListaCompras",lstReg)
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
			wait for(ActualizarDatos) complete (rObj As Object)
		Case "NuevaIncidenciaProveedorCompras"
			AbrirFichaIncidenciaProveedor(0,"")
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
	
	Main.sCamposFiltradosListaIncidenciasProveedor=jamTableView1.sCamposFiltrados
	Main.lstValoresFiltrosListaIncidenciasProveedor=jamTableView1.lstValoresFiltros

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
'
'Sub MigracionDatosAccess
'	Wait For(CargaDatosMigracion) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then Return
'	Dim lstCommands As List
'	lstCommands.Initialize
'	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblIncidenciasProveedorDatosMigracionIncidencias order by IdIncProv")
'	Do While rs.NextRow
''		IncidenciaProveedor,IDEmisor,FechaIncidencia,FechaIncidenciaLong,Proveedor,NombreProveedor, \
''		DocumentoProveedor,FechaDocumentoProveedor,FechaDocumentoProveedorLong, \
''		OrigenIncidencia,PedidoCompra,DescripcionIncidencia,IDTipoIncidencia, \
''		AccionCompras,FechaAccionCompras,FechaAccionComprasLong,IDUsuarioAccionCompras, \
''		FechaCierre,FechaCierreLong,IDUsuarioCierre,PuntuacionIncidencia
''		IDDecisor
'
''		CREATE TABLE [tblIncidenciasProveedorDatosMigracionIncidencias]
''		([IdIncProv] TEXT, [IdEmisor] INTEGER, [FechaInc] INTEGER default 0, [IdProv] TEXT, [NombreProv] TEXT, [AlbProv] INTEGER
''		, [FechaAlbProv] TEXT, [PedidoCompra] TEXT default '', [DescripcionIncidencia] TEXT, [IdTipoIncidencia] INTEGER default 0, [AccionCompras] TEXT default ''
''		, [FechaAccionCompras] INTEGER default 0, [FechaCierre] INTEGER default 0 , [PuntInc] INTEGER default 0, [IdDecisor] INTEGER default 0)
'		
'		Dim IncProv As String=rs.GetString("IdIncProv")
'		Dim IdEmisor As Int=rs.GetString("IdEmisor")
'		Dim IdDecisor As Int=rs.GetString("IdDecisor")
'		Dim FechaInc As String=rs.GetLong("FechaInc")
'		Dim IDProv As String=rs.GetString("IDProv")
'		Dim NombreProv As String=rs.GetString("NombreProv")
'		Dim AlbProv As String=rs.GetString("AlbProv")
'		Dim FechaAlbProv As Long=rs.GetLong("FechaAlbProv")
'		Dim PedidoCompra As String=rs.GetString("PedidoCompra")
'		Dim DescripcionIncidencia As String=rs.GetString("DescripcionIncidencia")
'		Dim IDTipoIncidencia As Int=rs.GetInt("IDTipoIncidencia")
'		Dim AccionCompras As String=rs.GetString("AccionCompras")
'		Dim FechaAccionCompras As Long=rs.GetLong("AccionCompras")
'		Dim FechaCierre As Long=rs.GetLong("FechaCierre")
'		Dim PuntInc As Int=rs.GetInt("PuntInc")
'
'		Dim cmd As DBCommand=JRDCQuery.CreateCommand("IncidenciasProveedorNuevaIncidenciaMigracion",Array(""))
'		lstCommands.Add(cmd)
'	Loop
'	rs.Close
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstCommands)) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible incluir las tarifas seleccionadas. Revisar datos.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'End Sub
'
'Sub CargaDatosMigracion As ResumableSub
'	mSQL.ExecNonQuery("delete from tblIncidenciasProveedorDatosMigracionIncidencias")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="IncidenciasProveedorListaIncidenciasOrigenMigracion"
'	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
'
'	Wait For DatosJRDC_Completed (mResult As Map)
'
'	If mResult.Get("ConnOK")=False Then
'		jamLoadingIndicator1.Close
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
'			jamLoadingIndicator1.Close
'			Dim msa As Object=xui.MsgboxAsync("No hay datos migración.","Error")
'			Wait For (msa) Msgbox_Result
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
''			Dim mData0 As Map=lstReg.Get(0)
''			Utilidades.LogStringCrearTablaDesdeMap("tblIncidenciasProveedorDatosMigracionIncidencias",mData0,"")
'			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblIncidenciasProveedorDatosMigracionIncidencias",lstReg)
'			mRes.Put("Accion", Accion)
'		End If
'	End If
'	Return mRes
'End Sub


