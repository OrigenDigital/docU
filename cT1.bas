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
	
	Public PermisoUsuarioModulo As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub
'
'Public Sub Show
'	'If frm.IsInitialized=False Then
'	frm.Initialize("frm",Main.xScreen, Main.yScreen)
'	frm.Icon = Main.IconoFormularios
'	'frm.RootPane.LoadLayout("scrMainMenu2")
'	Dim joForm As JavaObject = frm
'	Dim joStage As JavaObject = joForm.GetField("stage")
'	joStage.RunMethod("setMaximized", Array(True))
'	
'	frm.RootPane.LoadLayout(nombreLayoutFormulario)
'	Sleep(0)
'	
'	frm.Title=Main.PrefijoTitleForms & Titulo del formulario
'	
'	' EJEMPLOS de MENUS
'		
'	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
'	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
'		
'	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003),jamTableView1.MenuBarLinea)
'	jamTableView1.AddContextMenuItemSeparator
'	jamTableView1.AddContextMenuItemFontAwesomeText("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003))
'		
'	jamTableView1.AddContextMenuItemSeparator
'	Dim img As Image
'	img.InitializeSample(File.DirAssets,"navision.png",24,24)
'	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
'	jamTableView1.AddContextMenuItemImage("Articulo NAV","VerArticuloNAV",img)
'	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")
'
'' Usar las 2 siguientes lineas para abrir el CampoBuilder		
''		jamTableView1.AbrirCamposBuilder
''		Return
'		
'	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView(NombreFicheroJSON creado con el CamposBuilder,Null)
'	wait for (rSub) complete (mRes As Map)
'	Log(mRes)
'	If Not(mRes.Get("FlagOK")) Then
'		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'		Wait For (msa) Msgbox_Result
'		frm.Close
'		Return
'	End If
'		
'	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'	
'	
'	' EJEMPLOS DE CELLFACTORIES
'	Dim CF As DatosCellFactoryJamTableView
'	CF.Initialize
'	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
'	CF.CellFactoryEnCallBack=False
'	CF.params=Null
'	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
'	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"))
'		
'	Dim CF As DatosCellFactoryJamTableView
'	CF.Initialize
'	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
'	CF.CellFactoryEnCallBack=False
'	CF.params=Null
'	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("NombreProveedor","DescripcionArticulo"))
'		
'	Dim CF As DatosCellFactoryJamTableView
'	CF.Initialize
'	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'	CF.CellFactoryEnCallBack=False
'	CF.params=Null
'	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPrometidaVencida","PendienteSeguimiento"))
'		
'	Dim dCF As DatosCellFactoryJamTableView
'	dCF.Initialize
'	dCF.AliasCampoColumna="ExcluidoReclamacion"
'	dCF.CellFactoryEnCallBack=False
'	dCF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'	jamTableView1.SetCellFactory(dCF)
'		
'	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("PendienteSeguimiento","Pendiente Seguimiento:" & CRLF & "  - SIN Fecha Prometida" & CRLF & "o" & CRLF &  " - Fecha Prometida Vencida" ,"lightyellow","black",16)
'
'		
'	Dialog.Initialize(frm.RootPane)
'	
'	'End If
'
'	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
'	
'	CreacionTablasSQLite
'	
'	frm.Show
'	
'	ActualizarDatos
'
'End Sub
'
'private Sub asJO(o As JavaObject) As JavaObject
'	Return o
'End Sub
'
'
'Sub frm_CloseRequest (EventData As Event)
'	EventData.Consume
'End Sub
'
'Sub btnSalir_Click
'	SalirModulo
'End Sub
'
'private Sub SalirModulo
'	jamTableView1.GuardarConfiguracionColumnasUsuario
'	frm.Close
'	MainMenu2.Show
'End Sub
'
'Sub ActualizarDatos
'
'
'' OBTENER LOS DATOS via JRDCQuery ... o por la via que se considere
'
'	Wait For(ActualizarDatosMysql) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion<>"OK" Then
'		SalirModulo
'		Return
'	End If
'	Dim lstReg As List=mRes.get("lstReg")
'
'	Dim rSub As ResumableSub=jamTableView1.setdata(lstReg)
'	Wait For (rSub) complete (mResultSetData As Map)
'	
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			#if debug
'			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt=xui.DialogResponse_Positive Then
'				jamTableView1.AbrirCamposBuilder
'				Return
'			End If
'			#End If
'			ExitApplication
'		End If
'		If ""<>mResultSetData.Get("msgAviso") Then
'			If True=mResultSetData.Get("ListaVacia") Then Return
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'
'	End If
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
'
'
'
'End Sub
'
'
'' EJEMPLO CREACION DE TABLA INTERNA
'Sub CreacionTablasSQLite
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblDatosFechasPrometidasPedidosCompraPendientes"))
'	If ntFP>0 Then
'		mSQL.ExecNonQuery("drop table tblDatosFechasPrometidasPedidosCompraPendientes")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblDatosFechasPrometidasPedidosCompraPendientes (")
'	
'	
'	sbCrearTabla.Append("Pedido TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Proveedor TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("NombreProveedor TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("DireccionEmail TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaPedido INTEGER,")
'	sbCrearTabla.Append("DiasDesdePedido INTEGER default 0,")
'	sbCrearTabla.Append("VPG TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Linea INTEGER ,")
'	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Qty REAL,")
'	sbCrearTabla.Append("QtyRecibida REAL,")
'	sbCrearTabla.Append("QtyPendiente REAL,")
'	sbCrearTabla.Append("RecPteRecep REAL,")
'	sbCrearTabla.Append("FechaPrometida INTEGER,")
'	sbCrearTabla.Append("FechaPrometidaOriginal INTEGER,")
'	sbCrearTabla.Append("FechaPrometidaOriginalModificada INTEGER,")
'	sbCrearTabla.Append("FechaPrometidaVencida INTEGER default 0,")
'	sbCrearTabla.Append("PendienteSeguimiento INTEGER default 0,")
'	sbCrearTabla.Append("FechaHoyHora0 INTEGER default 0,")
'	sbCrearTabla.Append("DiasRespectoAPlazo INTEGER default 0,")
'	sbCrearTabla.Append("ExcluidoReclamacion INTEGER default 0,")
'	sbCrearTabla.Append("IDReclamacionFPC INTEGER default 0,")
'	sbCrearTabla.Append("FechaEnvioReclamacionLong INTEGER default 0,")
'	sbCrearTabla.Append("IDUsuario INTEGER default 0,")
'	sbCrearTabla.Append("NombreUsuario TEXT COLLATE NOCASE default '',")
'	sbCrearTabla.Append("DireccionEmailRemitente TEXT COLLATE NOCASE default '',")
'	sbCrearTabla.Append("DireccionEmailDestinatario TEXT COLLATE NOCASE default '',")
'	sbCrearTabla.Append("ReclamacionFPC TEXT COLLATE NOCASE default '')")
'
'
'	mSQL.ExecNonQuery(sbCrearTabla.ToString)
'	
'	
'End Sub
'
'' EJEMPLO, modificar según formulario
'Sub ActualizarDatosMysql As ResumableSub
'	mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim sLinkJRDC As String=rdclinkConfigPropertiesQueCorresponda
'	Dim Comando As String=ComandoDelConfigPropertiesQueCorresponda
'	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
'	
'	Wait For DatosJRDC_Completed (mResult As Map)
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="Salir"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
'			Accion="Sin Datos"
'			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de .............","Aviso")
'			Wait For (msa) Msgbox_Result
'		Else
'			Accion="OK"
'			mRes.Put("Accion", Accion)
''			Dim lstCommands As List
''			lstCommands.Initialize
'			Dim lstReg As List=mResult.Get("lstRes")
'			mRes.Put("lstReg", lstReg)
''			For Each m As Map In lstReg
''				Log("m: " & m)
'			''				Dim OSUB As String=m.Get("PedidoFab")
'			''				Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.UsuarioWindows,Main.DatosUsuario.NombreUsuarioWindows,OSUB))
'			''				lstCommands.Add(cmd)
''			Next
'			DBUtils.InsertMaps(mSQL,"tblDatosFormulario",lstReg)
'		End If
'	End If
'	Return mRes
'End Sub
'
'
'
'Sub jamTableView1_AccionSalirJamTableView
'	SalirModulo
'End Sub
'
'Sub jamTableView1_MenuBarMenuItem_Action(TagMenuItem As String)
'	Select Case TagMenuItem
'		
'		Case "Actualizar"
'			ActualizarDatos
'		Case "SeleccionarCuentaRemitenteEmail"
'			wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
'			If rBool=False Then Return
'	End Select
'End Sub
'
'' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
'Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
'	Select Case TagMenuItem
'		Case "VerPedidoCompraNAV"
'			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
'			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Pedido",FilaSel)
'			Dim PedidoSel As String=DCS.ValorCelda
'			Dim msa As Object = xui.Msgbox2Async("¿Ver el pedido de compra " & PedidoSel & " en NAVISION?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido compra",50, "No.", PedidoSel)
'			wait for(rSub) complete (success As Boolean)
'			If success=False Then
'				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el pedido seleccionado en Navision.","Error")
'				Wait For (msa) Msgbox_Result
'			End If
'			
'		Case "VerArticuloNAV"
'			Dim ArticuloSel As String
'			Dim FilaSeleccionada As Int=jamTableView1.IndicesFilasSeleccionadas.Get(0)
'			Dim lstInfoFila As List=jamTableView1.DatosRegistroIndiceFila(FilaSeleccionada)
'			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
'				If dc.Campo="Articulo" Then
'					ArticuloSel=dc.ValorCampo
'					Exit
'				End If
'			Next
'			If ArticuloSel="" Then
'				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Artículo.","Error")
'				Wait For (msa) Msgbox_Result
'				Return
'			End If
'			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
'			wait for(rSub) complete (success As Boolean)
'			If success=False Then
'				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
'				Wait For (msa) Msgbox_Result
'			End If
'
'	End Select
'End Sub
'
'
''EJEMPLO
'Sub jamTableView1_CambioEnCeldaSeleccionada(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila
'	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
'	Dim Pedido As String=mPK.Get("Pedido")
'	Dim Linea As Int=mPK.Get("Linea")
'	Dim NombreProveedor As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"NombreProveedor")
'	Dim Articulo As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Articulo")
'	Dim Descripcion As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"DescripcionArticulo")
'	Dim Talla As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Talla")
'	Dim sTalla As String=IIf(Talla<>"","Talla: " & Talla,"")
'	Dim QtyPte As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"QtyPendiente")
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	Dim FechaPrometidaLong As Long=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"FechaPrometida")
'	Dim sFechaPrometida As String=IIf(FechaPrometidaLong>0,"Fecha Prometida: " & DateTime.Date(FechaPrometidaLong),"SIN FECHA PROMETIDA")
'	DateTime.DateFormat=DateFormatAnt
'	Dim PendienteSeguimiento As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"PendienteSeguimiento")
'	Dim sPendienteSeguimiento As String=IIf(PendienteSeguimiento=1,"PENDIENTE SEGUIMIENTO","")
'	
'	jamTableView1.TextoPanelInfoJamTableView="Pedido: " & Pedido & " Línea:" & Linea & "  " & NombreProveedor & "  " & Articulo & "  " & _
'		Descripcion & "  " & sTalla & "  QtyPte: " & QtyPte & "  " & sFechaPrometida & " " & sPendienteSeguimiento 
'End Sub
'
'
''EJEMPLO
'Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Select DatosCeldaSeleccionada.AliasCampo
'		Case "ExcluidoReclamacion"
'			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
'	End Select
'End Sub
'
'
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
'
'
'
'
