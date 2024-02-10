B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
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
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub Show
	If frm.IsInitialized=False Then
		frm.Initialize("frm",Main.xScreen, Main.yScreen)
		frm.Icon = Main.IconoFormularios
		'frm.RootPane.LoadLayout("scrMainMenu2")
		Dim joForm As JavaObject = frm
		Dim joStage As JavaObject = joForm.GetField("stage")
		joStage.RunMethod("setMaximized", Array(True))
		frm.RootPane.LoadLayout("scrSeguimientoFechasPrometidasCompra")
		Sleep(0)
		frm.Title=Main.PrefijoTitleForms & "    " &  "Seguimiento Fechas Prometidas Pedidos Compra"
		
		jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,False)
		jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,False)
		
		jamTableView1.AddContextMenuItem("Documentos NAV de la expedición","Documentos NAV de la expedicion")
		
		jamTableView1.AbrirCamposBuilder
		return
		
		Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ExpedicionesNoEntregadasDHL.json",Null)
		wait for (rSub) complete (mRes As Map)
		Log(mRes)
		If Not(mRes.Get("FlagOK")) Then
			Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			frm.Close
			Return
		End If
		
		Dim CF As DatosCellFactoryJamTableView
		CF.Initialize
		CF.AliasCampoColumna="Fecha"
		CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFecha
		CF.CellFactoryEnCallBack=False
		CF.params=Null
		jamTableView1.SetCellFactory(CF)
		
		Dialog.Initialize(frm.RootPane)
	
	End If

	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	CreacionTablasSQLite
	
	frm.Show
	
	Dim joForm As JavaObject=asJO(frm)
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized",Array(True))

'	End If

	frm.RootPane.MouseCursor= fx.Cursors.WAIT

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
	frm.Close
	MainMenu2.Show
End Sub

Sub ActualizarDatos
	
	'btnSalir.Enabled=False
	Wait For(ActualizarDatosFechasPrometidasComprasPendientes) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	
	Dim FechaHoyHora0 As Long=DateUtils.SetDate(DateTime.GetYear(DateTime.Now), DateTime.GetMonth(DateTime.Now),DateTime.GetDayOfMonth(DateTime.Now))
	
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaPrometidaVencida=1 where FechaPrometida>? and FechaPrometida<?",Array As Object(0,FechaHoyHora0))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set PendienteSeguimiento=1 where FechaPrometidaVencida=? or FechaPrometida<?",Array As Object(1,0))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaHoyHora0=?",Array As Object(FechaHoyHora0))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasRespectoAPlazo=(FechaPrometida-FechaHoyHora0)/? where FechaPrometida>0", Array As Object(DateTime.TicksPerDay))
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdePedido=(FechaHoyHora0-FechaPedido)/?",Array As Object(DateTime.TicksPerDay))

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblDatosFechasPrometidasPedidosCompraPendientes")
	Dim rSub As ResumableSub=jamTableView1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then Return
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
	
	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	

End Sub



Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblDatosFechasPrometidasPedidosCompraPendientes"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblDatosFechasPrometidasPedidosCompraPendientes")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblDatosFechasPrometidasPedidosCompraPendientes (")
	
	
	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Proveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NombreProveedor TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaPedido INTEGER,")
	sbCrearTabla.Append("DiasDesdePedido INTEGER default 0,")
	sbCrearTabla.Append("VPG TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Linea INTEGER ,")
	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Qty REAL,")
	sbCrearTabla.Append("QtyRecibida REAL,")
	sbCrearTabla.Append("QtyPendiente REAL,")
	sbCrearTabla.Append("RecPteRecep REAL,")
	sbCrearTabla.Append("FechaPrometida INTEGER,")
	sbCrearTabla.Append("FechaPrometidaOriginal INTEGER,")
	sbCrearTabla.Append("FechaPrometidaOriginalModificada INTEGER,")
	sbCrearTabla.Append("FechaPrometidaVencida INTEGER default 0,")
	sbCrearTabla.Append("PendienteSeguimiento INTEGER default 0,")
	sbCrearTabla.Append("FechaHoyHora0 INTEGER default 0,")
	sbCrearTabla.Append("DiasRespectoAPlazo INTEGER default 0)")

	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
End Sub

' EJEMPLO, modificar según formulario
Sub ActualizarDatosFechasPrometidasComprasPendientes As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblDatosFechasPrometidasPedidosCompraPendientes")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String="PedidosCompraPendientesFechasPrometidas"
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de .............","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
			'mRes.Put("lstReg", lstReg)
'			For Each m As Map In lstReg
'				Log("m: " & m)
			''				Dim OSUB As String=m.Get("PedidoFab")
			''				Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.UsuarioWindows,Main.DatosUsuario.NombreUsuarioWindows,OSUB))
			''				lstCommands.Add(cmd)
'			Next
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblDatosFechasPrometidasPedidosCompraPendientes",lstReg)
		End If
	End If
	Return mRes
End Sub
