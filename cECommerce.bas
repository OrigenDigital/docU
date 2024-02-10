B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@
B4J=True

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
	
	Private const k As String="lox18xzyi3xof450v1rkumyoym409m3m"
	Private const tk As String="d4lthat3abma7cfrnlptlz4u75jjbv3e"

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
	
	frm.RootPane.LoadLayout("scrECommerce")
	Sleep(0)
	
	frm.Title=Main.PrefijoTitleForms & "e-commerce"

'''''	CreacionTablasSQLite
'''''
'''''' Usar las 2 siguientes lineas para abrir el CampoBuilder		
''''''	jamTableView1.AbrirCamposBuilder
''''''	Return
'''''	
'''''	' EJEMPLOS de MENUS
'''''		
'''''	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,True)
'''''	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,True)
'''''		
'''''	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003),jamTableView1.MenuBarLinea)
'''''	jamTableView1.AddContextMenuItemSeparator
'''''	jamTableView1.AddContextMenuItemFontAwesomeText("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003))
'''''		
'''''	jamTableView1.AddContextMenuItemSeparator
'''''	Dim img As Image
'''''	img.InitializeSample(File.DirAssets,"navision.png",24,24)
'''''	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
'''''	jamTableView1.AddContextMenuItemImage("Articulo NAV","VerArticuloNAV",img)
'''''	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")
'''''
'''''
'''''		
'''''	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("",Null)
'''''	wait for (rSub) complete (mRes As Map)
'''''	Log(mRes)
'''''	If Not(mRes.Get("FlagOK")) Then
'''''		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'''''		Wait For (msa) Msgbox_Result
'''''		frm.Close
'''''		Return
'''''	End If
'''''		
'''''	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
'''''	
'''''	
'''''	' EJEMPLOS DE CELLFACTORIES
'''''	Dim CF As DatosCellFactoryJamTableView
'''''	CF.Initialize
'''''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
'''''	CF.CellFactoryEnCallBack=False
'''''	CF.params=Null
'''''	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
'''''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"))
'''''		
'''''	Dim CF As DatosCellFactoryJamTableView
'''''	CF.Initialize
'''''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
'''''	CF.CellFactoryEnCallBack=False
'''''	CF.params=Null
'''''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("NombreProveedor","DescripcionArticulo"))
'''''		
'''''	Dim CF As DatosCellFactoryJamTableView
'''''	CF.Initialize
'''''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
'''''	CF.CellFactoryEnCallBack=False
'''''	CF.params=Null
'''''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPrometidaVencida","PendienteSeguimiento"))
'''''		
'''''	Dim dCF As DatosCellFactoryJamTableView
'''''	dCF.Initialize
'''''	dCF.AliasCampoColumna="ExcluidoReclamacion"
'''''	dCF.CellFactoryEnCallBack=False
'''''	dCF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
'''''	jamTableView1.SetCellFactory(dCF)
'''''		
'''''	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("PendienteSeguimiento","Pendiente Seguimiento:" & CRLF & "  - SIN Fecha Prometida" & CRLF & "o" & CRLF &  " - Fecha Prometida Vencida" ,"lightyellow","black",16)
'''''
'''''		
		Dialog.Initialize(frm.RootPane)
'''''	
'''''	'End If
'''''
'''''	
'''''	
'''''	
'''''	
		frm.Show
'''''	
'''''	ActualizarDatos

	Wait For(CargaDatosCredenciales) complete (mRes As Map)
	

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


' OBTENER LOS DATOS via JRDCQuery ... o por la via que se considere

	Wait For(ActualizarDatosMysql) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	Dim lstReg As List=mRes.get("lstReg")

	Dim rSub As ResumableSub=jamTableView1.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	
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
			If True=mResultSetData.Get("ListaVacia") Then Return
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	fx.Msgbox(frm,"Datos actualizados.","Aviso")



End Sub


' EJEMPLO CREACION DE TABLA INTERNA
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
	sbCrearTabla.Append("DiasRespectoAPlazo INTEGER default 0,")
	sbCrearTabla.Append("ExcluidoReclamacion INTEGER default 0,")
	sbCrearTabla.Append("IDReclamacionFPC INTEGER default 0,")
	sbCrearTabla.Append("FechaEnvioReclamacionLong INTEGER default 0,")
	sbCrearTabla.Append("IDUsuario INTEGER default 0,")
	sbCrearTabla.Append("NombreUsuario TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("DireccionEmailRemitente TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("DireccionEmailDestinatario TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("ReclamacionFPC TEXT COLLATE NOCASE default '')")


	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
End Sub

' EJEMPLO, modificar según formulario
Sub ActualizarDatosMysql As ResumableSub
	mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String=""
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
			DBUtils.InsertMaps(mSQL,"tblDatosFormulario",lstReg)
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
		Case "SeleccionarCuentaRemitenteEmail"
			wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
			If rBool=False Then Return
	End Select
End Sub

' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "VerPedidoCompraNAV"
			Dim FilaSel As Int=jamTableView1.GetIndiceFilaSeleccionada
			Dim DCS As DatosCeldaSeleccionadaJamTableView=jamTableView1.GetDatosCeldaAliasCampoFilaTV("Pedido",FilaSel)
			Dim PedidoSel As String=DCS.ValorCelda
			Dim msa As Object = xui.Msgbox2Async("¿Ver el pedido de compra " & PedidoSel & " en NAVISION?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Pedido compra",50, "No.", PedidoSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el pedido seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
			
		Case "VerArticuloNAV"
			Dim ArticuloSel As String
			Dim FilaSeleccionada As Int=jamTableView1.IndicesFilasSeleccionadas.Get(0)
			Dim lstInfoFila As List=jamTableView1.DatosRegistroIndiceFila(FilaSeleccionada)
			For Each dc As DatosCampoRegistroJamTableView In lstInfoFila
				If dc.Campo="Articulo" Then
					ArticuloSel=dc.ValorCampo
					Exit
				End If
			Next
			If ArticuloSel="" Then
				Dim msa As Object=xui.MsgboxAsync("No se ha encontrado el campo Artículo.","Error")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If

	End Select
End Sub


'EJEMPLO
Sub jamTableView1_CambioEnCeldaSeleccionada(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila
	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
	Dim Pedido As String=mPK.Get("Pedido")
	Dim Linea As Int=mPK.Get("Linea")
	Dim NombreProveedor As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"NombreProveedor")
	Dim Articulo As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Articulo")
	Dim Descripcion As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"DescripcionArticulo")
	Dim Talla As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Talla")
	Dim sTalla As String=IIf(Talla<>"","Talla: " & Talla,"")
	Dim QtyPte As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"QtyPendiente")
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim FechaPrometidaLong As Long=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"FechaPrometida")
	Dim sFechaPrometida As String=IIf(FechaPrometidaLong>0,"Fecha Prometida: " & DateTime.Date(FechaPrometidaLong),"SIN FECHA PROMETIDA")
	DateTime.DateFormat=DateFormatAnt
	Dim PendienteSeguimiento As Int=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"PendienteSeguimiento")
	Dim sPendienteSeguimiento As String=IIf(PendienteSeguimiento=1,"PENDIENTE SEGUIMIENTO","")
	
	jamTableView1.TextoPanelInfoJamTableView="Pedido: " & Pedido & " Línea:" & Linea & "  " & NombreProveedor & "  " & Articulo & "  " & _
		Descripcion & "  " & sTalla & "  QtyPte: " & QtyPte & "  " & sFechaPrometida & " " & sPendienteSeguimiento 
End Sub


'EJEMPLO
Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Select DatosCeldaSeleccionada.AliasCampo
		Case "ExcluidoReclamacion"
			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
	End Select
End Sub


'EJEMPLO para checkbox editable en la lista 
Sub AlternarExcluidoReclamacion(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Log(DatosCeldaSeleccionada)
	Dim ValorActual As Int= DatosCeldaSeleccionada.ValorCelda
	Dim NuevoValor As Int
	Select ValorActual
		Case 0
			NuevoValor=1
			
		Case 1
			NuevoValor=0
	End Select
	Dim mPK As Map=DatosCeldaSeleccionada.mDataPK
	Dim PedidoSel As String=mPK.Get("Pedido")
	Dim LineaSel As String=mPK.Get("Linea")
	mSQL.ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",Array(NuevoValor,PedidoSel, LineaSel))
	jamTableView1.RefrescarTablaValorCeldaEditada(DatosCeldaSeleccionada.Fila,DatosCeldaSeleccionada.Columna,NuevoValor,DatosCeldaSeleccionada.mDataPK)
	jamTableView1.SeleccionarCelda("ExcluidoReclamacion",DatosCeldaSeleccionada.Fila)
End Sub



#Region Magento

Sub CargaDatosCredenciales As ResumableSub
	'DatosEnvioExpedicion.Initialize
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim ComandoJRDC As String
	ComandoJRDC="TokenB2BPruebas"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes, ComandoJRDC, Null, Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		Accion="NOK"
	Else
		If mresult.Get("ReqOK")=False Then
			Accion="NOK"
		Else
			Dim lstRes As List=mresult.Get("lstRes")
			Accion="OK"
			mRes.Put("lstRes",lstRes)
		End If
	End If
	mRes.Put("Accion",Accion)
	Return mRes
End Sub

private Sub CreacionTablasSQLiteMagento
	mSQL.ExecNonQuery("drop table if exists tblFichasCosteListaArticulosNuevoLoteMasivo")
	Dim sCrearTabla As String=$"CREATE TABLE If Not EXISTS [tblFichasCosteListaArticulosNuevoLoteMasivo]
([Articulo] TEXT)"$
	mSQL.ExecNonQuery(sCrearTabla)
End Sub

Private Sub btnTestAPIMagento_Click
	wait for(EnvioDatosAPIMagentoBusquedaClientes(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Log("ColItems: " & colitems)
		For Each sK As String In colitems.Keys
			Log(sK & ": " & colitems.Get(sK))
		Next
		Dim store_id As Int = colitems.Get("store_id")
		Dim firstname As String = colitems.Get("firstname")
		Dim addresses As List = colitems.Get("addresses")
		For Each coladdresses As Map In addresses
			Log("coladdresses: " & coladdresses)
			Dim firstname As String = coladdresses.Get("firstname")
			Dim city As String = coladdresses.Get("city")
			Dim region_id As Int = coladdresses.Get("region_id")
			Dim postcode As String = coladdresses.Get("postcode")
			Dim telephone As String = coladdresses.Get("telephone")
			Dim default_shipping As String = coladdresses.Get("default_shipping")
			Dim lastname As String = coladdresses.Get("lastname")
			Dim street As List = coladdresses.Get("street")
			For Each colstreet As String In street
			Next
			Dim id As Int = coladdresses.Get("id")
			Dim customer_id As Int = coladdresses.Get("customer_id")
			Dim region As Map = coladdresses.Get("region")
			Dim region_id As Int = region.Get("region_id")
			Dim regionA As String = region.Get("region")
			Dim region_code As String = region.Get("region_code")
			Dim default_billing As String = coladdresses.Get("default_billing")
			Dim country_id As String = coladdresses.Get("country_id")
		Next
		Dim gender As Int = colitems.Getdefault("gender",0)
		Dim created_at As String = colitems.Get("created_at")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim is_subscribed As String = extension_attributes.Get("is_subscribed")
		Dim default_shipping As String = colitems.Get("default_shipping")
		Dim lastname As String = colitems.Get("lastname")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim disable_auto_group_change As Int = colitems.Get("disable_auto_group_change")
		Dim group_id As Int = colitems.Get("group_id")
		Dim dob As String = colitems.Get("dob")
		Dim id As Int = colitems.Get("id")
		Dim default_billing As String = colitems.Get("default_billing")
		Dim website_id As Int = colitems.Get("website_id")
		Dim email As String = colitems.Get("email")
		Dim created_in As String = colitems.Get("created_in")
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	For Each colfilter_groups As Map In filter_groups
		Dim filters As List = colfilter_groups.Get("filters")
		For Each colfilters As Map In filters
			Dim field As String = colfilters.Get("field")
			Dim condition_type As String = colfilters.Get("condition_type")
			Dim value As String = colfilters.Get("value")
		Next
	Next
End Sub

Sub EnvioDatosAPIMagento(IDDatoEnvioBuscado As String, Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)

	
	Dim URLAPIReq As String="http://proingroup-webstorepre.com/admin?id=" & IDDatoEnvioBuscado & "&idioma=es"
	job.Download(URLAPIReq)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		'Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnListaGruposClienteMagento_Click
	wait for(EnvioDatosAPIMagentoBusquedaGruposClientes(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return

	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Dim code As String = colitems.Get("code")
		Dim tax_class_id As Int = colitems.Get("tax_class_id")
		Dim id As Int = colitems.Get("id")
		Dim tax_class_name As String = colitems.Get("tax_class_name")
		Log(colitems)
		Log("")
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	For Each colfilter_groups As Map In filter_groups
		Dim filters As List = colfilter_groups.Get("filters")
		For Each colfilters As Map In filters
			Dim field As String = colfilters.Get("field")
			Dim condition_type As String = colfilters.Get("condition_type")
			Dim value As String = colfilters.Get("value")
		Next
	Next


End Sub

Sub EnvioDatosAPIMagentoBusquedaGruposClientes(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/customerGroups/search?
	searchCriteria[filterGroups][0][filters][0][field]=code&
	searchCriteria[filterGroups][0][filters][0][value]=%&
	searchCriteria[filterGroups][0][filters][0][condition_type]=like"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Sub EnvioDatosAPIMagentoBusquedaClientes(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)

	
	'Dim URLAPIReq As String="http://proingroup-webstorepre.com/admin?id=" & IDDatoEnvioBuscado & "&idioma=es"
	
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/customers/search?
	searchCriteria[filterGroups][0][filters][0][field]=firstname&
	searchCriteria[filterGroups][0][filters][0][value]=%&
	searchCriteria[filterGroups][0][filters][0][condition_type]=like"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnListaStoresMagento_Click
	wait for(EnvioDatosAPIMagentoListaStores(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As List = parser.NextArray
	For Each colroot As Map In root
		Dim code As String = colroot.Get("code")
		Dim is_active As Int = colroot.Get("is_active")
		Dim store_group_id As Int = colroot.Get("store_group_id")
		Dim name As String = colroot.Get("name")
		Dim id As Int = colroot.Get("id")
		Dim website_id As Int = colroot.Get("website_id")
		
		Log("code: " & code & "Name: " & name & "ID: " & id)
		Log(" ")

	Next

End Sub

Sub EnvioDatosAPIMagentoListaStores(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/store/storeViews"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnInfoClienteMagento_Click
	Dialog.Title="Indica ID Cliente"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim IDClienteSel As Int=InputDlg.Text
	
	wait for(EnvioDatosAPIMagentoInformacionCliente(tk,IDClienteSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	For Each sK As String In root.Keys
		Log(sK & ": " & root.Get(sK))
	Next
	Dim store_id As Int = root.Get("store_id")
	Dim firstname As String = root.Get("firstname")
	Dim addresses As List = root.Get("addresses")
	Dim created_at As String = root.Get("created_at")
	Dim extension_attributes As Map = root.Get("extension_attributes")
	Dim is_subscribed As String = extension_attributes.Get("is_subscribed")
	Dim lastname As String = root.Get("lastname")
	Dim custom_attributes As List = root.Get("custom_attributes")
	If custom_attributes.IsInitialized Then
		For Each colcustom_attributes As Map In custom_attributes
			Dim value As String = colcustom_attributes.Get("value")
			Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
		Next
	End If
	Dim updated_at As String = root.Get("updated_at")
	Dim disable_auto_group_change As Int = root.Get("disable_auto_group_change")
	Dim group_id As Int = root.Get("group_id")
	Dim id As Int = root.Get("id")
	Dim website_id As Int = root.Get("website_id")
	Dim email As String = root.Get("email")
	Dim created_in As String = root.Get("created_in")   ' Nombre del grupo de clientes
	For Each mAddress As Map In addresses
		Log("Address: " & mAddress)
	Next

End Sub

Sub EnvioDatosAPIMagentoInformacionCliente(Token As String, IDCliente As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/customers/${IDCliente}"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnListaProductosMagento_Click

	wait for(EnvioDatosAPIMagentoInformacionProductos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Log("colitems:" & colitems)
		Dim visibility As Int = colitems.Get("visibility")
		Dim type_id As String = colitems.Get("type_id")
		Dim created_at As String = colitems.Get("created_at")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		Dim website_ids As List = extension_attributes.Get("website_ids")
		For Each colwebsite_ids As Int In website_ids
		Next
		Dim category_links As List = extension_attributes.Get("category_links")
		If category_links.IsInitialized Then
			For Each colcategory_links As Map In category_links
				Dim category_id As String = colcategory_links.Get("category_id")
				Dim position As Int = colcategory_links.Get("position")
			Next
		End If
		Dim tier_prices As List = colitems.Get("tier_prices")
		Dim custom_attributes As List = colitems.Get("custom_attributes")
		For Each colcustom_attributes As Map In custom_attributes
			Dim value As String = colcustom_attributes.Get("value")
			Dim attribute_code As String = colcustom_attributes.Get("attribute_code")
		Next
		Dim attribute_set_id As Int = colitems.Get("attribute_set_id")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim price As Int = colitems.Getdefault("price",0)
		Dim media_gallery_entries As List = colitems.Get("media_gallery_entries")
		For Each colmedia_gallery_entries As Map In media_gallery_entries
			Dim types As List = colmedia_gallery_entries.Get("types")
			For Each coltypes As String In types
			Next
			Dim Fichero As String = colmedia_gallery_entries.Get("file")
			Dim media_type As String = colmedia_gallery_entries.Get("media_type")
			Dim disabled As String = colmedia_gallery_entries.Get("disabled")
			Dim id As Int = colmedia_gallery_entries.Get("id")
			Dim label As String = colmedia_gallery_entries.Get("label")
			Dim position As Int = colmedia_gallery_entries.Get("position")
		Next
		Dim name As String = colitems.Get("name")
		Dim options As List = colitems.Get("options")
		Dim id As Int = colitems.Get("id")
		Dim sku As String = colitems.Get("sku")
		Dim product_links As List = colitems.Get("product_links")
		For Each colproduct_links As Map In product_links
			Dim link_type As String = colproduct_links.Get("link_type")
			Dim linked_product_sku As String = colproduct_links.Get("linked_product_sku")
			Dim linked_product_type As String = colproduct_links.Get("linked_product_type")
			Dim position As Int = colproduct_links.Get("position")
			Dim sku As String = colproduct_links.Get("sku")
		Next
		Dim status As Int = colitems.Get("status")
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	Dim current_page As Int = search_criteria.Getdefault("current_page",0)
	Dim page_size As Int = search_criteria.Getdefault("page_size",0)

	
End Sub

Sub EnvioDatosAPIMagentoInformacionProductos(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	

	' TODOS los productos
	'Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[currentPage]=1&searchCriteria[pageSize]=100"$
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[pageSize] = 0"$

	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=30000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnListaPedidosMagento_Click

	wait for(EnvioDatosAPIMagentoInformacionPedidos(tk)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim total_count As Int = root.Get("total_count")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Log("ColItems: " & colitems)
'		Dim tax_amount As Double = colitems.Get("tax_amount")
'		Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
'		Dim customer_note_notify As Int = colitems.Get("customer_note_notify")
'		Dim shipping_discount_amount As Int = colitems.Get("shipping_discount_amount")
'		Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
		Dim customer_firstname As String = colitems.Get("customer_firstname")
'		Dim discount_amount As Int = colitems.Get("discount_amount")
		Dim billing_address As Map = colitems.Get("billing_address")
		Dim firstname As String = billing_address.Get("firstname")
		Dim address_type As String = billing_address.Get("address_type")
		Dim customer_address_id As Int = billing_address.Getdefault("customer_address_id",-1)
		Dim city As String = billing_address.Get("city")
		Dim postcode As String = billing_address.Get("postcode")
		Dim region_id As Int = billing_address.Getdefault("region_id",0)
		Dim telephone As String = billing_address.Get("telephone")
		Dim entity_id As Int = billing_address.Get("entity_id")
		Dim lastname As String = billing_address.Get("lastname")
		Dim parent_id As Int = billing_address.Get("parent_id")
		Dim street As List = billing_address.Get("street")
		For Each colstreet As String In street
			Log("colstreet:" & colstreet)
		Next
		Dim region As String = billing_address.Get("region")
		Dim country_id As String = billing_address.Get("country_id")
		Dim email As String = billing_address.Get("email")
		Dim region_code As String = billing_address.Get("region_code")
		Dim total_paid As Double = colitems.Getdefault("total_paid",0)
		Dim increment_id As String = colitems.Get("increment_id")
		Dim payment As Map = colitems.Get("payment")
		Dim base_amount_ordered As Double = payment.Getdefault("base_amount_ordered",0)
		Dim amount_paid As Double = payment.Getdefault("amount_paid",0)
		Dim method As String = payment.Get("method")
		Dim cc_last4 As String = payment.Get("cc_last4")
'		Dim shipping_captured As Int = payment.Get("shipping_captured")
		Dim account_status As String = payment.Get("account_status")
		Dim amount_ordered As Double = payment.Getdefault("amount_ordered",0)
		Dim entity_id As Int = payment.Get("entity_id")
		Dim base_amount_paid As Double = payment.Getdefault("base_amount_paid",0)
		Dim shipping_amount As Int = payment.Get("shipping_amount")
		Dim additional_information As List = payment.Get("additional_information")
		For Each coladditional_information As String In additional_information
		Next
		Dim base_shipping_amount As Int = payment.Get("base_shipping_amount")
		Dim parent_id As Int = payment.Get("parent_id")
'		Dim base_shipping_captured As Int = payment.Get("base_shipping_captured")
		Dim state As String = colitems.Get("state")
'		Dim base_shipping_tax_amount As Int = colitems.Get("base_shipping_tax_amount")
		Dim base_grand_total As Double = colitems.Get("base_grand_total")
		Dim billing_address_id As Int = colitems.Get("billing_address_id")
		Dim customer_lastname As String = colitems.Get("customer_lastname")
		Dim quote_id As Int = colitems.Get("quote_id")
		Dim shipping_invoiced As Int = colitems.Getdefault("shipping_invoiced",-1)
		Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
		Dim weight As Int = colitems.Get("weight")
		Dim entity_id As Int = colitems.Get("entity_id")
		Dim IDPedido As Int = colitems.Get("entity_id")
		Dim base_total_invoiced As Double = colitems.Getdefault("base_total_invoiced",0)
		Dim base_shipping_amount As Int = colitems.Get("base_shipping_amount")
		Dim base_subtotal_invoiced As Int = colitems.Getdefault("base_subtotal_invoiced",0)
		Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim subtotal_incl_tax As Double = colitems.Get("subtotal_incl_tax")
		Dim base_shipping_discount_tax_compensation_amnt As Int = colitems.Get("base_shipping_discount_tax_compensation_amnt")
		Dim subtotal As Int = colitems.Get("subtotal")
		Dim base_shipping_incl_tax As Int = colitems.Get("base_shipping_incl_tax")
		Dim customer_email As String = colitems.Get("customer_email")
		Dim base_discount_invoiced As Int = colitems.Getdefault("base_discount_invoiced",0)
		Dim total_invoiced As Double = colitems.Getdefault("total_invoiced",0)
		Dim base_to_global_rate As Int = colitems.Get("base_to_global_rate")
		Dim customer_is_guest As Int = colitems.Get("customer_is_guest")
		Dim items As List = colitems.Get("items")
		For Each colitems As Map In items
			Dim tax_amount As Double = colitems.Get("tax_amount")
			Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
			Dim original_price As Int = colitems.Get("original_price")
			Dim free_shipping As Int = colitems.Get("free_shipping")
			Dim base_discount_tax_compensation_invoiced As Int = colitems.Getdefault("base_discount_tax_compensation_invoiced",0)
			Dim discount_amount As Int = colitems.Get("discount_amount")
			Dim tax_percent As Double = colitems.Get("tax_percent")
			Dim price_incl_tax As Double = colitems.Getdefault("price_incl_tax",0)
			Dim price As Int = colitems.Get("price")
			Dim product_id As Int = colitems.Get("product_id")
			Dim base_row_total As Int = colitems.Get("base_row_total")
			Dim sku As String = colitems.Get("sku")
			Dim discount_tax_compensation_amount As Int = colitems.Getdefault("discount_tax_compensation_amount",0)
			Dim weight As Int = colitems.Getdefault("weight",-1)
			Dim base_original_price As Int = colitems.GetDEFAULT("base_original_price",0)
			Dim row_weight As Int = colitems.Get("row_weight")
			Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
			Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
			Dim base_price_incl_tax As Double = colitems.Getdefault("base_price_incl_tax",-1)
			Dim no_discount As Int = colitems.Get("no_discount")
			Dim name As String = colitems.Get("name")
			Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
			Dim discount_percent As Int = colitems.Get("discount_percent")
			Dim order_id As Int = colitems.Get("order_id")
			Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
			Dim created_at As String = colitems.Get("created_at")
			Dim qty_shipped As Int = colitems.Get("qty_shipped")
			Dim qty_ordered As Int = colitems.Get("qty_ordered")
			Dim row_total As Int = colitems.Get("row_total")
			Dim qty_canceled As Int = colitems.Get("qty_canceled")
			Dim product_option As Map = colitems.Get("product_option")
			If product_option.IsInitialized Then
				Dim extension_attributes As Map = product_option.Get("extension_attributes")
				Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
				For Each colconfigurable_item_options As Map In configurable_item_options
					Dim option_value As Int = colconfigurable_item_options.Get("option_value")
					Dim option_id As String = colconfigurable_item_options.Get("option_id")
				Next
			End If
			Dim amount_refunded As Int = colitems.Get("amount_refunded")
			Dim updated_at As String = colitems.Get("updated_at")
			Dim base_price As Int = colitems.Get("base_price")
			Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
			Dim row_invoiced As Int = colitems.Get("row_invoiced")
			Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
			Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
			Dim store_id As Int = colitems.Get("store_id")
			Dim item_id As Int = colitems.Get("item_id")
			Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
			Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
			Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
			Dim product_type As String = colitems.Get("product_type")
			Dim qty_refunded As Int = colitems.Get("qty_refunded")
			Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
			Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
			Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
			Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Next
		Dim global_currency_code As String = colitems.Get("global_currency_code")
		Dim status As String = colitems.Get("status")
		Dim is_virtual As Int = colitems.Getdefault("is_virtual",0)
		Dim base_total_invoiced_cost As Int = colitems.Getdefault("base_total_invoiced_cost",-1)
		Dim discount_tax_compensation_invoiced As Int = colitems.Getdefault("discount_tax_compensation_invoiced",0)
		Dim status_histories As List = colitems.Get("status_histories")
		Dim store_currency_code As String = colitems.Get("store_currency_code")
		Dim created_at As String = colitems.Get("created_at")
		Dim total_item_count As Int = colitems.Getdefault("total_item_count",-1)
		Dim shipping_tax_amount As Int = colitems.Getdefault("shipping_tax_amount",-1)
		Dim store_to_base_rate As Int = colitems.Getdefault("store_to_base_rate",1)
		Dim updated_at As String = colitems.Get("updated_at")
		Dim base_shipping_discount_amount As Int = colitems.Getdefault("base_shipping_discount_amount",-1)
		Dim store_name As String = colitems.Get("store_name")
		Dim grand_total As Double = colitems.Getdefault("grand_total",-1)
		Dim base_currency_code As String = colitems.Get("base_currency_code")
		Dim base_total_paid As Double = colitems.Getdefault("base_total_paid",-1)
		Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim store_id As Int = colitems.Get("store_id")
		Dim shipping_discount_tax_compensation_amount As Int = colitems.Getdefault("shipping_discount_tax_compensation_amount",-1)
		Dim total_due As Int = colitems.Getdefault("total_due",-1)
		Dim total_qty_ordered As Int = colitems.Getdefault("total_qty_ordered",-1)
		Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim extension_attributes As Map = colitems.Get("extension_attributes")
		If extension_attributes.IsInitialized Then
			Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
			If shipping_assignments.IsInitialized Then
				For Each colshipping_assignments As Map In shipping_assignments
					Dim shipping As Map = colshipping_assignments.Get("shipping")
					Dim total As Map = shipping.Get("total")
					Dim shipping_amount As Int = total.Get("shipping_amount")
					Dim base_shipping_amount As Int = total.Get("base_shipping_amount")
					Dim shipping_discount_tax_compensation_amount As Int = total.Get("shipping_discount_tax_compensation_amount")
					Dim shipping_discount_amount As Int = total.Get("shipping_discount_amount")
					Dim base_shipping_discount_amount As Int = total.Get("base_shipping_discount_amount")
					Dim base_shipping_discount_tax_compensation_amnt As Int = total.Get("base_shipping_discount_tax_compensation_amnt")
					Dim base_shipping_incl_tax As Int = total.Get("base_shipping_incl_tax")
					Dim shipping_invoiced As Int = total.Get("shipping_invoiced")
					Dim shipping_incl_tax As Int = total.Get("shipping_incl_tax")
					Dim base_shipping_invoiced As Int = total.Get("base_shipping_invoiced")
					Dim base_shipping_tax_amount As Int = total.Get("base_shipping_tax_amount")
					Dim shipping_tax_amount As Int = total.Get("shipping_tax_amount")
					Dim address As Map = shipping.Get("address")
					Dim firstname As String = address.Get("firstname")
					Dim address_type As String = address.Get("address_type")
					Dim customer_address_id As Int = address.Get("customer_address_id")
					Dim city As String = address.Get("city")
					Dim postcode As String = address.Get("postcode")
					Dim region_id As Int = address.Get("region_id")
					Dim telephone As String = address.Get("telephone")
					Dim entity_id As Int = address.Get("entity_id")
					Dim lastname As String = address.Get("lastname")
					Dim parent_id As Int = address.Get("parent_id")
					Dim street As List = address.Get("street")
					For Each colstreet As String In street
					Next
					Dim region As String = address.Get("region")
					Dim country_id As String = address.Get("country_id")
					Dim email As String = address.Get("email")
					Dim region_code As String = address.Get("region_code")
					Dim method As String = shipping.Get("method")
					Dim items As List = colshipping_assignments.Get("items")
					For Each colitems As Map In items
						Dim tax_amount As Double = colitems.Get("tax_amount")
						Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
						Dim original_price As Int = colitems.Get("original_price")
						Dim free_shipping As Int = colitems.Get("free_shipping")
						Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
						Dim discount_amount As Int = colitems.Get("discount_amount")
						Dim tax_percent As Double = colitems.Get("tax_percent")
						Dim price_incl_tax As Double = colitems.Get("price_incl_tax")
						Dim price As Int = colitems.Get("price")
						Dim product_id As Int = colitems.Get("product_id")
						Dim base_row_total As Int = colitems.Get("base_row_total")
						Dim sku As String = colitems.Get("sku")
						Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
						Dim weight As Int = colitems.Get("weight")
						Dim base_original_price As Int = colitems.Get("base_original_price")
						Dim row_weight As Int = colitems.Get("row_weight")
						Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
						Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
						Dim base_price_incl_tax As Double = colitems.Get("base_price_incl_tax")
						Dim no_discount As Int = colitems.Get("no_discount")
						Dim name As String = colitems.Get("name")
						Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
						Dim discount_percent As Int = colitems.Get("discount_percent")
						Dim order_id As Int = colitems.Get("order_id")
						Dim discount_tax_compensation_invoiced As Int = colitems.Get("discount_tax_compensation_invoiced")
						Dim created_at As String = colitems.Get("created_at")
						Dim qty_shipped As Int = colitems.Get("qty_shipped")
						Dim qty_ordered As Int = colitems.Get("qty_ordered")
						Dim row_total As Int = colitems.Get("row_total")
						Dim qty_canceled As Int = colitems.Get("qty_canceled")
						Dim product_option As Map = colitems.Get("product_option")
						Dim extension_attributes As Map = product_option.Get("extension_attributes")
						Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
						For Each colconfigurable_item_options As Map In configurable_item_options
							Dim option_value As Int = colconfigurable_item_options.Get("option_value")
							Dim option_id As String = colconfigurable_item_options.Get("option_id")
						Next
						Dim amount_refunded As Int = colitems.Get("amount_refunded")
						Dim updated_at As String = colitems.Get("updated_at")
						Dim base_price As Int = colitems.Get("base_price")
						Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
						Dim row_invoiced As Int = colitems.Get("row_invoiced")
						Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
						Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
						Dim store_id As Int = colitems.Get("store_id")
						Dim item_id As Int = colitems.Get("item_id")
						Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
						Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
						Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
						Dim product_type As String = colitems.Get("product_type")
						Dim qty_refunded As Int = colitems.Get("qty_refunded")
						Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
						Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
						Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
						Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
					Next
			
				Next
			End If
		
			Dim payment_additional_info As List = extension_attributes.Get("payment_additional_info")
			For Each colpayment_additional_info As Map In payment_additional_info
				Dim value As String = colpayment_additional_info.Get("value")
				Dim key As String = colpayment_additional_info.Get("key")
			Next
			Dim applied_taxes As List = extension_attributes.Get("applied_taxes")
			For Each colapplied_taxes As Map In applied_taxes
				Dim amount As Double = colapplied_taxes.Get("amount")
				Dim code As String = colapplied_taxes.Get("code")
				Dim base_amount As Double = colapplied_taxes.Get("base_amount")
				Dim title As String = colapplied_taxes.Get("title")
				Dim percent As Double = colapplied_taxes.Get("percent")
			Next
			Dim item_applied_taxes As List = extension_attributes.Get("item_applied_taxes")
			For Each colitem_applied_taxes As Map In item_applied_taxes
				Dim applied_taxes As List = colitem_applied_taxes.Get("applied_taxes")
				For Each colapplied_taxes As Map In applied_taxes
					Dim amount As Double = colapplied_taxes.Get("amount")
					Dim code As String = colapplied_taxes.Get("code")
					Dim base_amount As Double = colapplied_taxes.Get("base_amount")
					Dim title As String = colapplied_taxes.Get("title")
					Dim percent As Double = colapplied_taxes.Get("percent")
				Next
				Dim Type As String = colitem_applied_taxes.Get("type")
			Next
			Dim converting_from_quote As String = extension_attributes.Get("converting_from_quote")
		
		End If
		Dim shipping_description As String = colitems.Get("shipping_description")
		Dim store_to_order_rate As Int = colitems.Getdefault("store_to_order_rate",-1)
		Dim shipping_amount As Int = colitems.Getdefault("shipping_amount",-1)
		Dim base_discount_tax_compensation_amount As Int = colitems.Getdefault("base_discount_tax_compensation_amount",-1)
		Dim subtotal_invoiced As Int = colitems.Getdefault("subtotal_invoiced",-1)
		Dim base_to_order_rate As Int = colitems.Getdefault("base_to_order_rate",-1)
		Dim base_subtotal As Int = colitems.Getdefault("base_subtotal",-1)
		Dim protect_code As String = colitems.Get("protect_code")
		Dim customer_dob As String = colitems.Get("customer_dob")
		Dim base_total_due As Int = colitems.Getdefault("base_total_due",-1)
		Dim base_subtotal_incl_tax As Double = colitems.Getdefault("base_subtotal_incl_tax",-1)
		Dim customer_id As Int = colitems.Getdefault("customer_id",-1)
		Dim customer_group_id As Int = colitems.Getdefault("customer_group_id",-1)
		Dim discount_invoiced As Int = colitems.Getdefault("discount_invoiced",-1)
		Dim order_currency_code As String = colitems.Get("order_currency_code")
		Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Dim customer_gender As Int = colitems.Getdefault("customer_gender",-1)
		Dim shipping_incl_tax As Int = colitems.Getdefault("shipping_incl_tax",-1)
		Dim base_shipping_invoiced As Int = colitems.Getdefault("base_shipping_invoiced",-1)
	Next
	Dim search_criteria As Map = root.Get("search_criteria")
	Dim filter_groups As List = search_criteria.Get("filter_groups")
	Dim page_size As Int = search_criteria.Get("page_size")


End Sub

Sub EnvioDatosAPIMagentoInformacionPedidos(Token As String) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	


	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/orders/?searchCriteria[pageSize] = 0"$

	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=30000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnInfoPedidoClienteMagento_Click
	Dialog.Title="Indica ID Pedido"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim IDPedidoSel As Int=InputDlg.Text
	
	wait for(EnvioDatosAPIMagentoInformacionPedidoCliente(tk,IDPedidoSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	Dim parser As JSONParser
	parser.Initialize(sResp)
	Dim root As Map = parser.NextObject
	Dim tax_amount As Double = root.Get("tax_amount")
	Dim tax_invoiced As Double = root.Get("tax_invoiced")
	Dim customer_note_notify As Int = root.Get("customer_note_notify")
	Dim shipping_discount_amount As Int = root.Get("shipping_discount_amount")
	Dim base_discount_tax_compensation_invoiced As Int = root.Get("base_discount_tax_compensation_invoiced")
	Dim customer_firstname As String = root.Get("customer_firstname")
	Dim discount_amount As Int = root.Get("discount_amount")
	Dim billing_address As Map = root.Get("billing_address")
	Dim firstname As String = billing_address.Get("firstname")
	Dim address_type As String = billing_address.Get("address_type")
	Dim customer_address_id As Int = billing_address.Get("customer_address_id")
	Dim city As String = billing_address.Get("city")
	Dim postcode As String = billing_address.Get("postcode")
	Dim region_id As Int = billing_address.Get("region_id")
	Dim telephone As String = billing_address.Get("telephone")
	'Dim entity_id As Int = billing_address.Get("entity_id")
	Dim IDbilling_address As Int = billing_address.Get("entity_id")
	Dim lastname As String = billing_address.Get("lastname")
	Dim parent_id As Int = billing_address.Get("parent_id")
	Dim street As List = billing_address.Get("street")
	For Each colstreet As String In street
	Next
	Dim region As String = billing_address.Get("region")
	Dim country_id As String = billing_address.Get("country_id")
	Dim email As String = billing_address.Get("email")
	Dim region_code As String = billing_address.Get("region_code")
	Dim total_paid As Double = root.Get("total_paid")
	Dim increment_id As String = root.Get("increment_id")
	Dim payment As Map = root.Get("payment")
	Dim base_amount_ordered As Double = payment.Get("base_amount_ordered")
	Dim amount_paid As Double = payment.Get("amount_paid")
	Dim method As String = payment.Get("method")
	Dim cc_last4 As String = payment.Get("cc_last4")
	Dim shipping_captured As Int = payment.Get("shipping_captured")
	Dim account_status As String = payment.Get("account_status")
	Dim amount_ordered As Double = payment.Get("amount_ordered")
	'Dim entity_id As Int = payment.Get("entity_id")
	Dim PaymentID As Int = payment.Get("entity_id")
	Dim base_amount_paid As Double = payment.Get("base_amount_paid")
	Dim shipping_amount As Int = payment.Get("shipping_amount")
	Dim additional_information As List = payment.Get("additional_information")
	For Each coladditional_information As String In additional_information
	Next
	Dim base_shipping_amount As Int = payment.Get("base_shipping_amount")
	Dim parent_id As Int = payment.Get("parent_id")
	Dim base_shipping_captured As Int = payment.Get("base_shipping_captured")
	Dim state As String = root.Get("state")
	Dim base_shipping_tax_amount As Int = root.Get("base_shipping_tax_amount")
	Dim base_grand_total As Double = root.Get("base_grand_total")
	Dim billing_address_id As Int = root.Get("billing_address_id")
	Dim customer_lastname As String = root.Get("customer_lastname")
	Dim quote_id As Int = root.Get("quote_id")
	Dim shipping_invoiced As Int = root.Get("shipping_invoiced")
	Dim discount_tax_compensation_amount As Int = root.Get("discount_tax_compensation_amount")
	Dim weight As Int = root.Get("weight")
	'Dim entity_id As Int = root.Get("entity_id")
	Dim IDPedido As Int = root.Get("entity_id")
	Dim base_total_invoiced As Double = root.Get("base_total_invoiced")
	Dim base_shipping_amount As Int = root.Get("base_shipping_amount")
	Dim base_subtotal_invoiced As Int = root.Get("base_subtotal_invoiced")
	Dim applied_rule_ids As String = root.Get("applied_rule_ids")
	Dim subtotal_incl_tax As Double = root.Get("subtotal_incl_tax")
	Dim base_shipping_discount_tax_compensation_amnt As Int = root.Get("base_shipping_discount_tax_compensation_amnt")
	Dim subtotal As Int = root.Get("subtotal")
	Dim base_shipping_incl_tax As Int = root.Get("base_shipping_incl_tax")
	Dim customer_email As String = root.Get("customer_email")
	Dim base_discount_invoiced As Int = root.Get("base_discount_invoiced")
	Dim total_invoiced As Double = root.Get("total_invoiced")
	Dim base_to_global_rate As Int = root.Get("base_to_global_rate")
	Dim customer_is_guest As Int = root.Get("customer_is_guest")
	Dim items As List = root.Get("items")
	For Each colitems As Map In items
		Dim tax_amount As Double = colitems.Get("tax_amount")
		Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
		Dim original_price As Int = colitems.Get("original_price")
		Dim free_shipping As Int = colitems.Get("free_shipping")
		Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
		Dim discount_amount As Int = colitems.Get("discount_amount")
		Dim tax_percent As Double = colitems.Get("tax_percent")
		Dim price_incl_tax As Double = colitems.Get("price_incl_tax")
		Dim price As Int = colitems.Get("price")
		Dim product_id As Int = colitems.Get("product_id")
		Dim base_row_total As Int = colitems.Get("base_row_total")
		Dim sku As String = colitems.Get("sku")
		Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
		Dim weight As Int = colitems.Get("weight")
		Dim base_original_price As Int = colitems.Get("base_original_price")
		Dim row_weight As Int = colitems.Get("row_weight")
		Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
		Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
		Dim base_price_incl_tax As Double = colitems.Get("base_price_incl_tax")
		Dim no_discount As Int = colitems.Get("no_discount")
		Dim name As String = colitems.Get("name")
		Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
		Dim discount_percent As Int = colitems.Get("discount_percent")
		Dim order_id As Int = colitems.Get("order_id")
		Dim discount_tax_compensation_invoiced As Int = colitems.Get("discount_tax_compensation_invoiced")
		Dim created_at As String = colitems.Get("created_at")
		Dim qty_shipped As Int = colitems.Get("qty_shipped")
		Dim qty_ordered As Int = colitems.Get("qty_ordered")
		Dim row_total As Int = colitems.Get("row_total")
		Dim qty_canceled As Int = colitems.Get("qty_canceled")
		Dim product_option As Map = colitems.Get("product_option")
		Dim extension_attributes As Map = product_option.Get("extension_attributes")
		Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
		For Each colconfigurable_item_options As Map In configurable_item_options
			Dim option_value As Int = colconfigurable_item_options.Get("option_value")
			Dim option_id As String = colconfigurable_item_options.Get("option_id")
		Next
		Dim amount_refunded As Int = colitems.Get("amount_refunded")
		Dim updated_at As String = colitems.Get("updated_at")
		Dim base_price As Int = colitems.Get("base_price")
		Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
		Dim row_invoiced As Int = colitems.Get("row_invoiced")
		Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
		Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
		Dim store_id As Int = colitems.Get("store_id")
		Dim item_id As Int = colitems.Get("item_id")
		Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
		Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
		Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
		Dim product_type As String = colitems.Get("product_type")
		Dim qty_refunded As Int = colitems.Get("qty_refunded")
		Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
		Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
		Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
		Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
	Next
	Dim global_currency_code As String = root.Get("global_currency_code")
	Dim status As String = root.Get("status")
	Dim is_virtual As Int = root.Get("is_virtual")
	Dim base_total_invoiced_cost As Int = root.Get("base_total_invoiced_cost")
	Dim discount_tax_compensation_invoiced As Int = root.Get("discount_tax_compensation_invoiced")
	Dim status_histories As List = root.Get("status_histories")
	Dim store_currency_code As String = root.Get("store_currency_code")
	Dim created_at As String = root.Get("created_at")
	Dim total_item_count As Int = root.Get("total_item_count")
	Dim shipping_tax_amount As Int = root.Get("shipping_tax_amount")
	Dim store_to_base_rate As Int = root.Get("store_to_base_rate")
	Dim updated_at As String = root.Get("updated_at")
	Dim base_shipping_discount_amount As Int = root.Get("base_shipping_discount_amount")
	Dim store_name As String = root.Get("store_name")
	Dim grand_total As Double = root.Get("grand_total")
	Dim base_currency_code As String = root.Get("base_currency_code")
	Dim base_total_paid As Double = root.Get("base_total_paid")
	Dim base_tax_amount As Double = root.Get("base_tax_amount")
	Dim store_id As Int = root.Get("store_id")
	Dim shipping_discount_tax_compensation_amount As Int = root.Get("shipping_discount_tax_compensation_amount")
	Dim total_due As Int = root.Get("total_due")
	Dim total_qty_ordered As Int = root.Get("total_qty_ordered")
	Dim base_discount_amount As Int = root.Get("base_discount_amount")
	Dim extension_attributes As Map = root.Get("extension_attributes")
	Dim pgw As Map = extension_attributes.Get("pgw")
	Dim extrinsic As List = pgw.Get("extrinsic")
	Dim extra_data As List = pgw.Get("extra_data")
	Dim posr_data As List = pgw.Get("posr_data")
	Dim originator As List = pgw.Get("originator")
	Dim entity_id As String = pgw.Get("entity_id")
	Dim poom_data As List = pgw.Get("poom_data")
	Dim shipping_assignments As List = extension_attributes.Get("shipping_assignments")
	For Each colshipping_assignments As Map In shipping_assignments
		Dim shipping As Map = colshipping_assignments.Get("shipping")
		Dim total As Map = shipping.Get("total")
		Dim shipping_amount As Int = total.Get("shipping_amount")
		Dim base_shipping_amount As Int = total.Get("base_shipping_amount")
		Dim shipping_discount_tax_compensation_amount As Int = total.Get("shipping_discount_tax_compensation_amount")
		Dim shipping_discount_amount As Int = total.Get("shipping_discount_amount")
		Dim base_shipping_discount_amount As Int = total.Get("base_shipping_discount_amount")
		Dim base_shipping_discount_tax_compensation_amnt As Int = total.Get("base_shipping_discount_tax_compensation_amnt")
		Dim base_shipping_incl_tax As Int = total.Get("base_shipping_incl_tax")
		Dim shipping_invoiced As Int = total.Get("shipping_invoiced")
		Dim shipping_incl_tax As Int = total.Get("shipping_incl_tax")
		Dim base_shipping_invoiced As Int = total.Get("base_shipping_invoiced")
		Dim base_shipping_tax_amount As Int = total.Get("base_shipping_tax_amount")
		Dim shipping_tax_amount As Int = total.Get("shipping_tax_amount")
		Dim address As Map = shipping.Get("address")
		Dim firstname As String = address.Get("firstname")
		Dim address_type As String = address.Get("address_type")
		Dim customer_address_id As Int = address.Get("customer_address_id")
		Dim city As String = address.Get("city")
		Dim postcode As String = address.Get("postcode")
		Dim region_id As Int = address.Get("region_id")
		Dim telephone As String = address.Get("telephone")
		'Dim entity_id As Int = address.Get("entity_id")
		Dim IDAddress As Int = address.Get("entity_id")
		Dim lastname As String = address.Get("lastname")
		Dim parent_id As Int = address.Get("parent_id")
		Dim street As List = address.Get("street")
		For Each colstreet As String In street
		Next
		Dim region As String = address.Get("region")
		Dim country_id As String = address.Get("country_id")
		Dim email As String = address.Get("email")
		Dim region_code As String = address.Get("region_code")
		Dim method As String = shipping.Get("method")
		Dim items As List = colshipping_assignments.Get("items")
		For Each colitems As Map In items
			Dim tax_amount As Double = colitems.Get("tax_amount")
			Dim tax_invoiced As Double = colitems.Get("tax_invoiced")
			Dim original_price As Int = colitems.Get("original_price")
			Dim free_shipping As Int = colitems.Get("free_shipping")
			Dim base_discount_tax_compensation_invoiced As Int = colitems.Get("base_discount_tax_compensation_invoiced")
			Dim discount_amount As Int = colitems.Get("discount_amount")
			Dim tax_percent As Double = colitems.Get("tax_percent")
			Dim price_incl_tax As Double = colitems.Get("price_incl_tax")
			Dim price As Int = colitems.Get("price")
			Dim product_id As Int = colitems.Get("product_id")
			Dim base_row_total As Int = colitems.Get("base_row_total")
			Dim sku As String = colitems.Get("sku")
			Dim discount_tax_compensation_amount As Int = colitems.Get("discount_tax_compensation_amount")
			Dim weight As Int = colitems.Get("weight")
			Dim base_original_price As Int = colitems.Get("base_original_price")
			Dim row_weight As Int = colitems.Get("row_weight")
			Dim applied_rule_ids As String = colitems.Get("applied_rule_ids")
			Dim base_amount_refunded As Int = colitems.Get("base_amount_refunded")
			Dim base_price_incl_tax As Double = colitems.Get("base_price_incl_tax")
			Dim no_discount As Int = colitems.Get("no_discount")
			Dim name As String = colitems.Get("name")
			Dim base_discount_invoiced As Int = colitems.Get("base_discount_invoiced")
			Dim discount_percent As Int = colitems.Get("discount_percent")
			Dim order_id As Int = colitems.Get("order_id")
			Dim discount_tax_compensation_invoiced As Int = colitems.Get("discount_tax_compensation_invoiced")
			Dim created_at As String = colitems.Get("created_at")
			Dim qty_shipped As Int = colitems.Get("qty_shipped")
			Dim qty_ordered As Int = colitems.Get("qty_ordered")
			Dim row_total As Int = colitems.Get("row_total")
			Dim qty_canceled As Int = colitems.Get("qty_canceled")
			Dim product_option As Map = colitems.Get("product_option")
			Dim extension_attributes As Map = product_option.Get("extension_attributes")
			Dim configurable_item_options As List = extension_attributes.Get("configurable_item_options")
			For Each colconfigurable_item_options As Map In configurable_item_options
				Dim option_value As Int = colconfigurable_item_options.Get("option_value")
				Dim option_id As String = colconfigurable_item_options.Get("option_id")
			Next
			Dim amount_refunded As Int = colitems.Get("amount_refunded")
			Dim updated_at As String = colitems.Get("updated_at")
			Dim base_price As Int = colitems.Get("base_price")
			Dim qty_invoiced As Int = colitems.Get("qty_invoiced")
			Dim row_invoiced As Int = colitems.Get("row_invoiced")
			Dim row_total_incl_tax As Double = colitems.Get("row_total_incl_tax")
			Dim base_tax_amount As Double = colitems.Get("base_tax_amount")
			Dim store_id As Int = colitems.Get("store_id")
			Dim item_id As Int = colitems.Get("item_id")
			Dim base_discount_amount As Int = colitems.Get("base_discount_amount")
			Dim base_row_total_incl_tax As Double = colitems.Get("base_row_total_incl_tax")
			Dim base_discount_tax_compensation_amount As Int = colitems.Get("base_discount_tax_compensation_amount")
			Dim product_type As String = colitems.Get("product_type")
			Dim qty_refunded As Int = colitems.Get("qty_refunded")
			Dim base_row_invoiced As Int = colitems.Get("base_row_invoiced")
			Dim is_qty_decimal As Int = colitems.Get("is_qty_decimal")
			Dim discount_invoiced As Int = colitems.Get("discount_invoiced")
			Dim base_tax_invoiced As Double = colitems.Get("base_tax_invoiced")
		Next
	Next
	Dim carts As List = extension_attributes.Get("carts")
	If extension_attributes.ContainsKey("payment_additional_info") Then
		Dim payment_additional_info As List = extension_attributes.Get("payment_additional_info")
		For Each colpayment_additional_info As Map In payment_additional_info
			Dim value As String = colpayment_additional_info.Get("value")
			Dim key As String = colpayment_additional_info.Get("key")
		Next
	End If
	If extension_attributes.ContainsKey("applied_taxes") Then
		Dim applied_taxes As List = extension_attributes.Get("applied_taxes")
		For Each colapplied_taxes As Map In applied_taxes
			Dim amount As Double = colapplied_taxes.Get("amount")
			Dim code As String = colapplied_taxes.Get("code")
			Dim base_amount As Double = colapplied_taxes.Get("base_amount")
			Dim title As String = colapplied_taxes.Get("title")
			Dim percent As Double = colapplied_taxes.Get("percent")
		Next
	End If
	If extension_attributes.ContainsKey("item_applied_taxes") Then
		Dim item_applied_taxes As List = extension_attributes.Get("item_applied_taxes")
		For Each colitem_applied_taxes As Map In item_applied_taxes
			Dim applied_taxes As List = colitem_applied_taxes.Get("applied_taxes")
			For Each colapplied_taxes As Map In applied_taxes
				Dim amount As Double = colapplied_taxes.Get("amount")
				Dim code As String = colapplied_taxes.Get("code")
				Dim base_amount As Double = colapplied_taxes.Get("base_amount")
				Dim title As String = colapplied_taxes.Get("title")
				Dim percent As Double = colapplied_taxes.Get("percent")
			Next
			Dim Type As String = colitem_applied_taxes.Get("type")
		Next
	End If
	Dim converting_from_quote As String = extension_attributes.Get("converting_from_quote")
	Dim contacts As List = extension_attributes.Get("contacts")
	Dim shipping_description As String = root.Get("shipping_description")
	Dim store_to_order_rate As Int = root.Get("store_to_order_rate")
	Dim shipping_amount As Int = root.Get("shipping_amount")
	Dim base_discount_tax_compensation_amount As Int = root.Get("base_discount_tax_compensation_amount")
	Dim subtotal_invoiced As Int = root.Get("subtotal_invoiced")
	Dim base_to_order_rate As Int = root.Get("base_to_order_rate")
	Dim base_subtotal As Int = root.Get("base_subtotal")
	Dim protect_code As String = root.Get("protect_code")
	Dim customer_dob As String = root.Get("customer_dob")
	Dim base_total_due As Int = root.Get("base_total_due")
	Dim base_subtotal_incl_tax As Double = root.Get("base_subtotal_incl_tax")
	Dim customer_id As Int = root.Get("customer_id")
	Dim customer_group_id As Int = root.Get("customer_group_id")
	Dim discount_invoiced As Int = root.Get("discount_invoiced")
	Dim order_currency_code As String = root.Get("order_currency_code")
	Dim base_tax_invoiced As Double = root.Get("base_tax_invoiced")
	Dim customer_gender As Int = root.Get("customer_gender")
	Dim shipping_incl_tax As Int = root.Get("shipping_incl_tax")
	Dim base_shipping_invoiced As Int = root.Get("base_shipping_invoiced")

	

End Sub

Sub EnvioDatosAPIMagentoInformacionPedidoCliente(Token As String, IDPedidoCliente As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/orders/${IDPedidoCliente}"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

Private Sub btnDireccionesClienteMagento_Click
	
	Dialog.Title="Indica ID Cliente"
	Dialog.TitleBarHeight=60dip
	Dialog.OverlayColor=0x00FFFFFF
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	InputDlg.ConfigureForNumbers(False,False)

	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim IDClienteSel As Int=InputDlg.Text
	
	wait for(EnvioDatosAPIMagentoBusquedaDireccionesCliente(tk, IDClienteSel)) complete (sResp As String)
	If sResp.StartsWith("ERROR") Then Return
	
	
End Sub

Sub EnvioDatosAPIMagentoBusquedaDireccionesCliente(Token As String, IDClienteSel As Int) As ResumableSub

	Dim job As HttpJob
	job.Initialize("",Me)
	
	Dim sQueryAPI As String=$"http://proingroup-webstorepre.com/index.php/rest/V1/customers/${IDClienteSel}/addresses"$
	
	job.Download(sQueryAPI)

	job.GetRequest.SetHeader("Accept","application/json")
	job.GetRequest.SetHeader("Authorization", "Bearer " & Token)
'	job.GetRequest.SetContentType("application/json")
	job.GetRequest.Timeout=15000
	
	Wait For (job) JobDone(j As HttpJob)

	If j.Success Then
		Log("job.response.StatusCode: " & job.response.StatusCode)
		Log(j.GetString)
		Dim sRespuestaWebService As String=j.GetString
		j.Release
		Return sRespuestaWebService
	Else
		
		Dim sErrorJobResponse As String="ERROR HTTPJob " & j.ErrorMessage
		j.Release
		Return sErrorJobResponse
	End If
End Sub

#End Region





