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
	'Private btnSalir As Button
	Private mSQL As SQL
	
	'(*) Declarar desde el designer los objetos del layout de los Items del CLV
	
	
	Private JamTableCLV1 As JamTableCLV
	Private txtProveedor As TextField
	Private txtNombreProveedor As TextField
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize

End Sub



Public Sub Show

	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrSeguimientoFechasPrometidasPedidosCompraPendientes")
	Sleep(0)  
	
		
	frm.Title="Titulo del formulario"
		
	Dialog.Initialize (frm.RootPane)
		
	frm.Show
'''	
'''	'(*) las siguientes 2 lineas son para abrir el CamposBuilder y crear el JSON. Comentar (o borrar) una vez creado el JSON
'''	JamTableCLV1.AbrirCamposBuilder
'''	Return
''''''''

	'(*) añadir Menu Items
	'JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarAcciones,True)
	'JamTableCLV1.AddMenuItemToMenuInMenuBar("test","test",JamTableCLV1.MenuBarAcciones)
	
	Dim rSub As ResumableSub=JamTableCLV1.ConfigurarTableCLV("ListaSeguimientoFechasPrometidasPedidosCompraPendientes.json")
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	'(*) Opcional
	'JamTableCLV1.AddMenuItemToMenuInMenuBar("Actualizar","Actualizar",JamTableCLV1.MenuBarAcciones)
	
	'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
	JamTableCLV1.AlturaItems=60dip
	'(*) opcional
	JamTableCLV1.ModoSeleccionItems=JamTableCLV1.ModoSeleccionIndividualPerm  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple

	
	If mSQL.IsInitialized Then mSQL.Close
	'mSQLOrdenesCorte.InitializeSQLite("", ":memory:", True)
	mSQL.InitializeSQLite(xui.DefaultFolder,"docU.db",True)
	
	CreacionTablasSQLite
	
	ActualizarDatos
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
	Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
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
				JamTableCLV1.AbrirCamposBuilder
				Return
			End If
			#End If
			ExitApplication
		End If
	End If
	
	fx.Msgbox(frm,"Datos actualizados.","Aviso")
	

End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub JamTableCLV1_AccionSalirJamTableCLV
	SalirModulo
End Sub


Private Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub


Sub JamTableCLV1_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "Actualizar"
			ActualizarDatos
		Case "EjemploAccionLineasSeleccionadas"
			Dim lstDatosLineasSeleccionadas As List=JamTableCLV1.GetDatosItemsSeleccionados
			For Each mData As Map In lstDatosLineasSeleccionadas
				LogColor("DatosLineaSeleccionada : " & mData, xui.Color_Blue)
			Next
		Case "
	End Select
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
	sbCrearTabla.Append("DireccionEmail TEXT COLLATE NOCASE,")
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


Sub GenerarUUIDv4 As String
	Dim sb As StringBuilder
	sb.Initialize
	For Each stp As Int In Array(8, 4, 4, 4, 12)
		If sb.Length > 0 Then sb.Append("-")
		For n = 1 To stp
			Dim c As Int = Rnd(0, 16)
			If c < 10 Then c = c + 48 Else c = c + 55
			If sb.Length = 19 Then c = Asc("8")
			If sb.Length = 14 Then c = Asc("4")
			sb.Append(Chr(c))
		Next
	Next
	Return sb.ToString.ToLowerCase
End Sub

Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemIndexCLVJamTableCLV As DatosItemIndexCLVJamTableCLV)
	Dim mData As Map = DatosItemIndexCLVJamTableCLV.Value
	Dim pnl As B4XView=DatosItemIndexCLVJamTableCLV.Panel
	pnl.LoadLayout("scrItemSeguimientoFechasPrometidasPedidosCompraPendientes")
	txtProveedor.Text=mData.Get("Proveedor")
	txtNombreProveedor.Text=mData.Get("NombreProveedor")
End Sub



Sub JamTableCLV1_ItemClick(Index As Int, Value As Object)
	Dim mData As Map=Value
	Log("Datos Item seleccionado (" & Index & "): " )
	For Each k In mData.Keys
		Log(k & ": " & mData.Get(k))
	Next
End Sub

'botón derecho
Sub JamTableCLV1_ItemLongClick(Index As Int, Value As Object)
	Dim mData As Map=Value
	Log("Datos Item seleccionado botón secundario (" & Index & "): " )
	For Each k In mData.Keys
		Log(k & ": " & mData.Get(k))
	Next
End Sub

Private Sub btnActualizar_Click
	ActualizarDatos
End Sub

Private Sub btnEjemplo_Click
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
End Sub

