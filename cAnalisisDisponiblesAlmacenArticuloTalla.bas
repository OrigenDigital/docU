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
	Private jamLoadingIndicator1 As JamLoadingIndicator
	Dim mSQL As SQL
	
	Public PermisoModuloUsuario As String
	
	Private imagencomentario() As Byte
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Public Sub Show
	'If frm.IsInitialized=False Then
	frm.Initialize("frm",Main.xScreen, Main.yScreen)
	frm.Icon = Main.IconoFormularios
	'frm.RootPane.LoadLayout("scrMainMenu2")
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	
	frm.RootPane.LoadLayout("scrAnalisisDisponiblesAlmacenArticuloTalla")
	Sleep(0)
	
	frm.Title=Main.PrefijoTitleForms & "Análisis Disponibles Almacén Artículo Talla"
	
	If mSQL.IsInitialized Then mSQL.Close
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	CreacionTablasSQLite

	'Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableView1.AbrirCamposBuilder
'	Return

	'jamTableView1.SetPlaceholderText("")
	' EJEMPLOS de MENUS
		
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarAcciones,False)
	jamTableView1.EstadoMenuItem(jamTableView1.MenuBarLinea,False)
		
'	jamTableView1.AddMenuItemFontAwesomeToMenuInMenuBar("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003),jamTableView1.MenuBarLinea)
'	jamTableView1.AddContextMenuItemSeparator
'	jamTableView1.AddContextMenuItemFontAwesomeText("Email Reclamación Proveedor","EmailReclamacionProveedor",Chr(0xF003))
		
	jamTableView1.AddContextMenuItemSeparator
	Dim img As Image
	img.InitializeSample(File.DirAssets,"navision.png",24,24)
'	jamTableView1.AddContextMenuItemImage("Ver Pedido Compra NAV","VerPedidoCompraNAV",img)
	jamTableView1.AddContextMenuItemImage("Artículo NAV","VerArticuloNAV",img)
	Dim imgCom As Image
	imgCom.InitializeSample(File.DirAssets,"comment16Freepik.png",16,16)
	jamTableView1.AddContextMenuItemImage("Estado/Comentario","EstadoComentario",imgCom)
	jamTableView1.AddContextMenuItemFontAwesomeText("Copiar Estado-Comentario A Línea Siguiente","CopiarEstadoComentarioALineaSiguiente",Chr(0xF0C5))
'	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")
		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaAnalisisDisponiblesAlmacenArticuloTalla.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
	
	
''	' EJEMPLOS DE CELLFACTORIES
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
	CF.CellFactoryEnCallBack=False
	CF.params=Null
	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("UltimoMovPositivo"))
	
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
	jamTableView1.SetCellFactoryListaCampos(CF, Array As String("DescripcionArticulo"))
''		
''	Dim CF As DatosCellFactoryJamTableView
''	CF.Initialize
''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaWrapText
''	CF.CellFactoryEnCallBack=False
''	CF.params=Null
''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("NombreProveedor","DescripcionArticulo"))
''		
''	Dim CF As DatosCellFactoryJamTableView
''	CF.Initialize
''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBoxSoloTrue
''	CF.CellFactoryEnCallBack=False
''	CF.params=Null
''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPrometidaVencida","PendienteSeguimiento"))
''		
''	Dim dCF As DatosCellFactoryJamTableView
''	dCF.Initialize
''	dCF.AliasCampoColumna="ExcluidoReclamacion"
''	dCF.CellFactoryEnCallBack=False
''	dCF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaBooleanaTipoIntegerCheckBox
''	jamTableView1.SetCellFactory(dCF)
''		
	''	jamTableView1.ToolTipTableColumnColorFondoColorTextoSizeFont("PendienteSeguimiento","Pendiente Seguimiento:" & CRLF & "  - SIN Fecha Prometida" & CRLF & "o" & CRLF &  " - Fecha Prometida Vencida" ,"lightyellow","black",16)

	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory="setColumnaImagenComentario"
	CF.CellFactoryEnCallBack=True
	Dim img As Image
	'img.InitializeSample(File.DirAssets,"Appinfo.png",24,24)
'	Dim xBitmap As B4XBitmap=Utilidades.SetFontToBitmap(Chr(0xf20f), Utilidades.CreateB4XFont("materialdesignicons-webfont.ttf",24,24),24,xui.Color_Black)
'	xBitmap.WriteToStream(
	imagencomentario=Utilidades.GetImageBytes(File.DirAssets,"comment16Freepik.png")
	'imagencomentario=img
	'Dim BufferU () As Byte=File.ReadBytes(File.DirAssets,"Appinfo.png")
	'Dim ser As B4XSerializator
	'Dim obj As Object=ser.ConvertBytesToObject(BufferU)
	'Dim sPath As String=File.GetUri(File.DirAssets,"Appinfo.png")
	'Dim inpS As InputStream=File.OpenInput(File.DirAssets,"Appinfo.png")
	'Dim sFile As String="Appinfo.png"
	CF.params=Null
	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("Comentarios"))
		
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
	jamLoadingIndicator1.EstiloLoadingIndicator="Five Lines 1"
	jamLoadingIndicator1.ColorPanelFondo=xui.Color_Transparent
	jamLoadingIndicator1.ColorLoadingIndicator=0xFF696969
	jamLoadingIndicator1.ColorMensaje=0xFF696969

	frm.Show
	
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

	Wait For(ActualizarDatosDisponiblesNAV) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If
	'Dim lstReg As List=mRes.get("lstReg")
	
	Wait For(ActualizarDatosEstadoComentariosAlmacenArticuloTalla) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		jamLoadingIndicator1.Close
		SalirModulo
		Return
	End If
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblAnalisisDisponiblesAlmacenArticuloTalla set Comentarios=1 from ")
	sb.append(" (select Almacen,Articulo,Talla from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla where Comentario<>? group by Almacen,Articulo,Talla having count(*)>0) as tNumLin")
	sb.Append(" where tblAnalisisDisponiblesAlmacenArticuloTalla.Almacen=tNumLin.Almacen and")
	sb.Append(" tblAnalisisDisponiblesAlmacenArticuloTalla.Articulo=tNumLin.Articulo and tblAnalisisDisponiblesAlmacenArticuloTalla.Talla=tNumLin.Talla")
	mSQL.AddNonQueryToBatch(sb.ToString, Array As Object(""))
	
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=tEst.Estado from ")
	sb.append(" (select Almacen,Articulo,Talla, Estado from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla) as tEst")
	sb.Append(" where tblAnalisisDisponiblesAlmacenArticuloTalla.Almacen=tEst.Almacen")
	sb.Append(" and tblAnalisisDisponiblesAlmacenArticuloTalla.Articulo=tEst.Articulo")
	sb.Append(" and tblAnalisisDisponiblesAlmacenArticuloTalla.Talla=tEst.Talla")
	mSQL.AddNonQueryToBatch(sb.ToString, Null)

	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	If Success=False Then 
		jamLoadingIndicator1.close
		wait for(Utilidades.MsgBoxXUI("Error","No ha sido posible actualizar los datos SQLite.")) complete (rObj As Object)
		SalirModulo
		Return
	End If
	
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblAnalisisDisponiblesAlmacenArticuloTalla order by Almacen, Articulo, Talla")

	Dim rSub As ResumableSub=jamTableView1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	jamLoadingIndicator1.Close
	rs.Close
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

Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisDisponiblesAlmacenArticuloTalla"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisDisponiblesAlmacenArticuloTalla")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesAlmacenArticuloTalla] ([Almacen] TEXT, [NombreAlmacen] TEXT")
	sbCrearTabla.Append(", [Bloqueado] TEXT, [ComputableExistencias] TEXT, [Inactivo] TEXT, [AlmacenGestCompras] TEXT, [AlmacenInterno] TEXT")
	sbCrearTabla.Append(", [Taller] TEXT, [Deposito] TEXT, [Renting] TEXT, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Stock] REAL")
	sbCrearTabla.Append(", [CosteUnitario] REAL, [TotalCosteStock] REAL, [ClienteExclusiva] TEXT, [NombreClienteExclusiva] TEXT, [StockNoConfigurado] TEXT")
	sbCrearTabla.Append(", [SistemaReposicion] TEXT, [ArticuloBloqueado] TEXT, [ArticuloBloqueadoNoDisponible] TEXT, [GrupoContable] TEXT, [NombreRuta] TEXT")
	sbCrearTabla.Append(", [RutaCorte] TEXT, [ProveedorPredeterminado] TEXT, [NombreProveedorPredeterminado] TEXT, [UltimoMovPositivo] INTEGER, [UltimoMovVenta] INTEGER,[Cantidad3M] REAL")
	sbCrearTabla.Append(", [Cantidad6M] REAL, [Cantidad9M] REAL, [Cantidad12M] REAL, [Cantidad24M] REAL, [ArtTallaConMaxMin] TEXT, [StockMax] REAL, [StockMin] REAL, [NecConsumo] REAL")
	sbCrearTabla.Append(", [NecVenta] REAL, [NecEnvioTransf] REAL, [QtyPteRecTransf] REAL,[PteRecepcionTransf] REAL, [NecNeta] REAL, [Disponible] REAL, [CosteDisponible] REAL")
	sbCrearTabla.Append(", [MesesConsumo6M] REAL, [SegConsumo] TEXT, [Comentarios] INTEGER default 0, [Estado] TEXT default '')")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla] ")
	sbCrearTabla.Append("([IDLin] INTEGER, [FechaLong] INTEGER, [Usuario] TEXT, [Almacen] TEXT, [Articulo] TEXT, [Talla] TEXT, [Comentario] TEXT, [Estado] TEXT)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
End Sub


Sub ActualizarDatosDisponiblesNAV As ResumableSub
	jamLoadingIndicator1.MensajeLoading="Actualizando datos Disponible por Almacén Artículo Talla..."
	jamLoadingIndicator1.Show
	mSQL.ExecNonQuery("DELETE from tblAnalisisDisponiblesAlmacenArticuloTalla")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String="AnalisisDisponiblesAlmacenArticuloTalla"
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	jamLoadingIndicator1.close
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Accion="Sin Datos"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Analisis Disponibles Almacen Articulo Talla","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisDisponiblesAlmacenArticuloTalla",mData0,"")
			'jamLoadingIndicator1.MensajeLoading="Insertando registros en tabla Operaciones OFabs..."
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisDisponiblesAlmacenArticuloTalla",lstReg)
		End If
	End If
	Return mRes
End Sub

Sub ActualizarDatosEstadoComentariosAlmacenArticuloTalla As ResumableSub
	jamLoadingIndicator1.MensajeLoading="Actualizando datos Estado-Comentarios por Almacén Artículo Talla..."
	'jamLoadingIndicator1.Show
	'mSQL.ExecNonQuery("DELETE from tblAnalisisDisponiblesAlmacenArticuloTalla")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="AnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla"
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	jamLoadingIndicator1.close
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			'jamLoadingIndicator1.Close
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos de Estado-Comentarios por Almacén Artículo Talla","Aviso")
'			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla",mData0,"")
			'jamLoadingIndicator1.MensajeLoading="Insertando registros en tabla Operaciones OFabs..."
			DBUtils.InsertMaps(mSQL,"tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla",lstReg)
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
'		Case "SeleccionarCuentaRemitenteEmail"
'			wait for (SeleccionarDireccionRemitenteEmails) complete (rBool As Boolean)
'			If rBool=False Then Return
	End Select
End Sub

' EJEMPLO DE ACCIONES DEL MENU CONTEXTUAL
Sub jamTableView1_ContextMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
			
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
			wait for(Utilidades.MsgBox2XUI("Confirma","¿Mostrar en Navision la ficha del artículo " & ArticuloSel & "?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			
			
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Ficha producto",30, "No.", ArticuloSel)
			wait for(rSub) complete (success As Boolean)
			If success=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir el artículo seleccionado en Navision.","Error")
				Wait For (msa) Msgbox_Result
			End If
			
		Case "EstadoComentario"
			Dim FilaSeleccionada As Int=jamTableView1.IndicesFilasSeleccionadas.Get(0)
			Dim AlmacenSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Almacen")
			Dim NombreAlmacenSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"NombreAlmacen")
			Dim ArticuloSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Articulo")
			Dim DescripcionArticuloSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"DescripcionArticulo")
			Dim TallaSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Talla")
			Dim cEstCom As cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla
			cEstCom.Initialize(Me, frm.RootPane,AlmacenSel, NombreAlmacenSel,ArticuloSel, DescripcionArticuloSel,TallaSel)
			cEstCom.Show
			wait for cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla_Done (DatosAnalisisDisponibleFichaAlmacenArticuloTalla As TipoDatosAnalisisDisponibleFichaAlmacenArticuloTalla)
			If DatosAnalisisDisponibleFichaAlmacenArticuloTalla.DatosModificados Then
				Dim intCom As Int
				If DatosAnalisisDisponibleFichaAlmacenArticuloTalla.ConComentario Then
					intCom=1
				Else
					intCom=0
				End If
				jamTableView1.SQL.ExecNonQuery2("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado,intCom, AlmacenSel, ArticuloSel, TallaSel))
				mSQL.ExecNonQuery2("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado,intCom, AlmacenSel, ArticuloSel, TallaSel))
				mSQL.ExecNonQuery2("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado,DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Comentario, AlmacenSel, ArticuloSel, TallaSel))
				jamTableView1.RefrescarFilaTVMetodoSQL(FilaSeleccionada)
			End If
			
		Case "CopiarEstadoComentarioALineaSiguiente"
			Dim FilaSeleccionada As Int=jamTableView1.IndicesFilasSeleccionadas.Get(0)
			If jamTableView1.IndiceUltimaFilaVisible=FilaSeleccionada Then
				wait for(Utilidades.MsgBoxXUI("Aviso","La fila a copiar no puede ser la última fila visible")) complete (rObj As Object)
				Return
			End If
			wait for(Utilidades.MsgBox2XUI("Confirma","Copiar el Estado-Comentario correspondiente a la fila seleccionada, a la fila siguiente?","Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim AlmacenSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Almacen")
			'Dim NombreAlmacenSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"NombreAlmacen")
			Dim ArticuloSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Articulo")
			'Dim DescripcionArticuloSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"DescripcionArticulo")
			Dim TallaSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Talla")
			
			Dim FilaDestino As Int=FilaSeleccionada+1
			Dim AlmacenDestino As String=jamTableView1.GetValorSQLCampoFila(FilaDestino,"Almacen")
			'Dim NombreAlmacenDestino As String=jamTableView1.GetValorSQLCampoFila(FilaDestino,"NombreAlmacen")
			Dim ArticuloDestino As String=jamTableView1.GetValorSQLCampoFila(FilaDestino,"Articulo")
			'Dim DescripcionArticuloDestino As String=jamTableView1.GetValorSQLCampoFila(FilaDestino,"DescripcionArticulo")
			Dim TallaDestino As String=jamTableView1.GetValorSQLCampoFila(FilaDestino,"Talla")
			
			Dim EstadoCopiado As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Estado")
			Dim ComentarioCopiado As String=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("Select Comentario from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla where Almacen=? and Articulo=? and Talla=?", _
				Array As String(AlmacenSel, ArticuloSel, TallaSel)))
			Wait For(CopiarEstadoComentarioAnalisisDispAlmArtTalla(AlmacenDestino,ArticuloDestino,TallaDestino,EstadoCopiado,ComentarioCopiado)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="NOK" Then Return
			
			Dim intCom As Int
			If ComentarioCopiado<>"" Then
				intCom=1
			Else
				intCom=0
			End If
			jamTableView1.SQL.ExecNonQuery2("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(EstadoCopiado,intCom, AlmacenDestino, ArticuloDestino, TallaDestino))
			mSQL.ExecNonQuery2("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(EstadoCopiado,intCom, AlmacenDestino, ArticuloDestino, TallaDestino))
			mSQL.ExecNonQuery2("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(EstadoCopiado,ComentarioCopiado, AlmacenDestino, ArticuloDestino, TallaDestino))
			jamTableView1.RefrescarFilaTVMetodoSQL(FilaDestino)
			
				
	End Select
End Sub

Sub CopiarEstadoComentarioAnalisisDispAlmArtTalla(AlmacenDestino As String, ArticuloDestino As String, TallaDestino As String, _
		EstadoCopiado As String, ComentarioCopiado As String) As ResumableSub
	Dim lstReg As List
	lstReg.Initialize
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	mRes.Put("Accion",Accion)
	mRes.Put("lstRegistros",lstReg)
	Dim Comando As String
	Comando="NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando, _
		Array(DateTime.Now,Main.DatosUsuario.NombreUsuarioWindows, AlmacenDestino,ArticuloDestino,TallaDestino, _
			ComentarioCopiado,EstadoCopiado), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
		
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion",Accion)
	Else
		If mResult.Get("ReqOK")=False Then
			' este caso no es posible aquí.
			Accion="NOK"
			mRes.Put("Accion",Accion)
		Else
			lstReg=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Dim msa As Object=xui.MsgboxAsync("Error SP NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla" & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
				mRes.Put("Accion", Accion)
			Else
				Accion="OK"
				mRes.Put("Accion", Accion)
			End If
		End If
	End If
	Return mRes
End Sub


Sub jamTableView1_CambioEnCeldaSeleccionada(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila
	Dim Alm As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Almacen")
	Dim Art As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Articulo")
	Dim DesArt As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"DescripcionArticulo")
	Dim Tal As String=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Talla")
	Dim Stock As Double=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Stock")
	Dim NecNeta As Double=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"NecNeta")
	Dim Disponible As Double=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Disponible")
	Dim Cantidad6M As Double=jamTableView1.GetValorSQLCampoFila(LineaSelTV,"Cantidad6M")
	jamTableView1.TextoPanelInfoJamTableView="Almacén: " & Alm & " Artículo: " & Art & "  " & DesArt & " Talla " & Tal & _
		"  STOCK: " & Utilidades.FormatoNumerico2(Stock,1,2,0,True) & "  NecNeta: " & Utilidades.FormatoNumerico2(NecNeta,1,2,0,True) & _
		"  Disponible: " & Utilidades.FormatoNumerico2(Disponible,1,2,0,True) & _
		"  Cantidad6M: " & Utilidades.FormatoNumerico2(Cantidad6M,1,2,0,True)
End Sub


''EJEMPLO
'Sub jamTableView1_CellClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
'	Select DatosCeldaSeleccionada.AliasCampo
'		Case "ExcluidoReclamacion"
'			AlternarExcluidoReclamacion(DatosCeldaSeleccionada)
'	End Select
'End Sub

Sub jamTableView1_CellDobleClick(DatosCeldaSeleccionada As DatosCeldaSeleccionadaJamTableView)
	Dim FilaSeleccionada As Int=DatosCeldaSeleccionada.Fila
	Dim AlmacenSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Almacen")
	Dim NombreAlmacenSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"NombreAlmacen")
	Dim ArticuloSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Articulo")
	Dim DescripcionArticuloSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"DescripcionArticulo")
	Dim TallaSel As String=jamTableView1.GetValorSQLCampoFila(FilaSeleccionada,"Talla")
	Dim cEstCom As cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla
	cEstCom.Initialize(Me, frm.RootPane,AlmacenSel, NombreAlmacenSel,ArticuloSel, DescripcionArticuloSel,TallaSel)
	cEstCom.Show
	wait for cAnalisisDisponibleFichaEstadoComentarioAlmacenArticuloTalla_Done (DatosAnalisisDisponibleFichaAlmacenArticuloTalla As TipoDatosAnalisisDisponibleFichaAlmacenArticuloTalla)
	If DatosAnalisisDisponibleFichaAlmacenArticuloTalla.DatosModificados Then
		Dim intCom As Int
		If DatosAnalisisDisponibleFichaAlmacenArticuloTalla.ConComentario Then
			intCom=1
		Else
			intCom=0
		End If
		jamTableView1.SQL.ExecNonQuery2("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado,intCom, AlmacenSel, ArticuloSel, TallaSel))
		mSQL.ExecNonQuery2("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado,intCom, AlmacenSel, ArticuloSel, TallaSel))
		mSQL.ExecNonQuery2("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?", _
					Array As Object(DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Estado,DatosAnalisisDisponibleFichaAlmacenArticuloTalla.Comentario, AlmacenSel, ArticuloSel, TallaSel))
		jamTableView1.RefrescarFilaTVMetodoSQL(FilaSeleccionada)
	End If
End Sub


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

#if Java
import javafx.util.Callback;
//import javafx.scene.Node;
//import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.geometry.Pos;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javafx.scene.image.Image;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javafx.scene.image.ImageView;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableCell;

import java.io.IOException;
import java.io.File;

import java.io.Serializable;


// Pasar imagen como argumento
public void setColumnaImagenComentario(TableColumn tc,  final Object[] args) throws Exception{
	try{
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param){
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						
       					if((int)item == 0) {
							setText(null);
							setGraphic(null);
      					}
						else {	
							//String sFile=String.valueOf(args[0]);
							//InputStream fis=anywheresoftware.b4a.objects.streams.File.OpenInput(anywheresoftware.b4a.objects.streams.File.DirAssets,sFile);
							//InputStream fis=args[0];
							//Image imagen = new Image("../files/"+sFile);
							/*
						    ByteArrayOutputStream out = new ByteArrayOutputStream();
						    ObjectOutputStream os = new ObjectOutputStream(out);
						    os.writeObject(args[0]);
						   
							ByteArrayInputStream bis = new ByteArrayInputStream(out.toByteArray());
     	 					//BufferedImage imagen = ImageIO.read(bis);
     	 					javafx.scene.image.Image imagen = ImageIO.read(bis);
							
							
							byte[] bytes=args[0];
							InputStream is = new ByteArrayInputStream(bytes);
        					BufferedImage newBi = ImageIO.read(is);
							*/
							
							Image imagen=new Image(new ByteArrayInputStream(_imagencomentario));
							ImageView imageView=new ImageView();
							imageView.setImage(imagen);
							setGraphic(imageView);
							setAlignment(Pos.CENTER);
						}
     				}
	 				else {
	          			setText(null);
						setGraphic(null);
              			return;
	 				}
                }
            };
        }
    });
	}
	catch (Exception e) {
		System.out.println(e); 
	}
} 

#End If





