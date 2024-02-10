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
	Private txtANO As TextField
	Private txtBULTOS As TextField
	Private txtCODDESTIN As TextField
	Private txtCODEMPRESA As TextField
	Private txtCODORIGEN As TextField
	Private txtCPOSTALDESTINATARIO As TextField
	Private txtDIRECCIONDESTINATARIO As TextField
	Private txtDOCADJUNTA As TextField
	Private txtFECHAALTA As TextField
	Private txtKILOS As TextField
	Private txtNEXPED1 As TextField
	Private txtNEXPED2 As TextField
	Private txtNOMBREDESTINATARIO As TextField
	Private txtOBSERVACIONES As TextField
	Private txtPOBLACIONDESTINATARIO As TextField
	Private txtPORTEE As TextField
	Private txtREFERENCIA1 As TextField
	Private txtDestino As TextField
	Private txtEstadoActual As TextField
	
	Private MeasurementCanvas As B4XCanvas
	
	Private FlexGridDialog As FlexGrid
	Private jamCircularProgressBar1 As jamCircularProgressBar
	Private txtNombreCliente As TextField
	Private txtNombreResponsableCuenta As TextField
	
	'private JamLoadingIndicator1 as JamLoadingIndicator
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)
	MeasurementCanvas.Initialize(p)
End Sub



Public Sub Show

	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrExpedicionesSinEntregarTXT")
	Sleep(0)  
	
		
	frm.Title=Main.PrefijoTitleForms &  "  " & "Expediciones Sin Entregar TXT"
		
	Dialog.Initialize (frm.RootPane)
	'JamLoadingIndicator1.Initialize(Me,frm.RootPane)
		
	frm.Show
	
'	'(*) las siguientes 2 lineas son para abrir el CamposBuilder y crear el JSON. Comentar (o borrar) una vez creado el JSON
'	JamTableCLV1.AbrirCamposBuilder
'	Return
	''
	'(*) añadir Menu Items
	'JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarAcciones,True)
	'JamTableCLV1.AddMenuItemToMenuInMenuBar("test","test",JamTableCLV1.MenuBarAcciones)
	
	JamTableCLV1.ColorPanelSeleccionado=0xFF87CEFA
	
	Dim rSub As ResumableSub=JamTableCLV1.ConfigurarTableCLV("ListaExpedicionesSinEntregarTXT.json")
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	'(*) Opcional
	JamTableCLV1.AddMenuItemToMenuInMenuBar("Actualizar","Actualizar",JamTableCLV1.MenuBarAcciones)
	
	'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
	JamTableCLV1.AlturaItems=190dip
	'(*) opcional
	JamTableCLV1.ModoSeleccionItems=JamTableCLV1.ModoSeleccionIndividualTemp  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple
	
	
	If mSQL.IsInitialized Then mSQL.Close
	'mSQLOrdenesCorte.InitializeSQLite("", ":memory:", True)
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	mSQL.ExecNonQuery("PRAGMA journal_mode = wal")
	'
	CreacionTablasSQLite
	
	ActualizarDatos
End Sub


Sub ActualizarDatos
	JamTableCLV1.Clear
'	JamLoadingIndicator1.MensajeLoading="Actualizando datos..."
'	JamLoadingIndicator1.IniciarControlTiempoProceso
'	JamLoadingIndicator1.Show
	
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	mSQL.ExecNonQuery("delete from tblExpedicionesSinEntregar")
	wait for(cmAuxTxT.ObtenerExpedicionesSinEntregarTXT) complete (mRes As Map)
	'JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	
	Dim lstRes As List=mRes.Get("lstRes")
'	For Each mData As Map In lstRes
'		For Each k As String In mData.Keys
'			Log("")
'			Log(k & ": " & mData.Get(k))
'		Next
'		
'	Next
	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblExpedicionesSinEntregar",lstRes)
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesSinEntregar")
	Do While rs.nextrow
'		mSQL.ExecNonQuery2("update tblExpedicionesSinEntregar set FechaSalida=? where CODORIGEN=? And CODDESTIN=? And NEXPED1=? And NEXPED2=? And ANO=?", _
'			Array(DateTime.DateParse(rs.GetString("FECHA_x0020_SALIDA")),rs.GetString("CODORIGEN"),rs.GetString("CODDESTIN"),rs.GetInt("NEXPED1"),rs.GetInt("NEXPED2"), rs.GetString("ANO")))
			
		mSQL.AddNonQueryToBatch("update tblExpedicionesSinEntregar set FechaSalida=? where CODORIGEN=? And CODDESTIN=? And NEXPED1=? And NEXPED2=? And ANO=?", _
			Array(DateTime.DateParse(rs.GetString("FECHA_x0020_SALIDA")),rs.GetString("CODORIGEN"),rs.GetString("CODDESTIN"),rs.GetInt("NEXPED1"),rs.GetInt("NEXPED2"), rs.GetString("ANO")))
	Loop
	rs.Close
	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	DateTime.DateFormat=DateFormatAnt
	
	Dim lstRegDocsExpPtes As List
	lstRegDocsExpPtes.Initialize
	Wait For(DocumentosExpedicionesSinEntregarBatch) complete (mRes As Map)
	Dim Success As Boolean=mRes.Get("Success")
	If Success Then
		Dim lstRegDocsExpPtes As List=mRes.Get("lstReg")
	End If
	
	Wait For(EliminarTablaTemporalDocumentosReferenciasTte) complete (rObj As Object)
	
	If lstRegDocsExpPtes.Size>0 Then
		
''''		Wait For(CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT) complete (mRes As Map)
''''		Dim Accion As String=mRes.Get("Accion")
''''		If Accion<>"OK" Then
''''			SalirModulo
''''			Return
''''		End If
''''		
''''		Dim lstComandos As List
''''		lstComandos.Initialize
''''	
''''		For Each m As Map In lstRegDocsExpPtes
''''			Log(m)
''''			Dim cmd As DBCommand = JRDCQuery.CreateCommand("InsertarDocumentoTablaTemporalDocumentosExpedicionesPendientes",Array(m.Get("Documento")))
''''			lstComandos.Add(cmd)
''''		Next
''''		wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,lstComandos)) complete (Success As Boolean)
''''		If Success=False Then
''''			Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar los datos de documentos en la tabla temporal #tbllDocumentosExpedicionesPendientes.","Error")
''''			Wait For (msa) Msgbox_Result
''''			SalirModulo
''''			Return
''''		End If
''''		
''''		' obtener los responsables de cuenta de los documentos (ojo, puede haber ALBVs y RTs)
''''		'
''''		
''''		' eliminar la tabla temporal
		''''		'actualizar tabla SQLite tblExpedicionesSinEntregar

		For Each m As Map In lstRegDocsExpPtes
			'Log(m)
			
			Wait For(ClienteResponsableCuentaDocumento(m.Get("Documento"))) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="ErrConn" Then 
				SalirModulo
				Return
			End If
			If Accion="OK" Then
				Dim lstReg As List=mRes.Get("lstReg")
				Dim mICli As Map=lstReg.Get(0)
				'Log(mICli)
				mSQL.AddNonQueryToBatch("update tblExpedicionesSinEntregar set NombreCliente=?, NombreResponsableCuenta=? where trim(REFERENCIA1)=?",Array(mICli.Get("NombreCliente"),mICli.Get("ResponsableCuenta"), m.Get("ReferenciaExpedicionTransporte")))
			End If
			

		Next
		Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
		
	End If
	
'	JamLoadingIndicator1.close
	
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesSinEntregar order by FechaSalida")
	Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
	rs.Close
	JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
	If Not(mResultSetData.Get("FlagOK")) Then
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
		If ""<>mResultSetData.Get("msgAviso") Then
			If True=mResultSetData.Get("ListaVacia") Then
				Dim msa As Object=xui.MsgboxAsync($"No hay Expediciones de TXT sin entregar.
(¿Error en webservice?)"$,"Aviso")
				Wait For (msa) Msgbox_Result
				Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	Dim msa As Object = xui.Msgbox2Async("¿Actualizar de forma masiva los estados de las expediciciones pendientes?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt=xui.DialogResponse_Positive Then
		
		Dim NumExpPtes As Int=mSQL.ExecQuerySingleResult("select count(*) from tblExpedicionesSinEntregar")
		Dim Intervalo As Int=100/NumExpPtes
		jamCircularProgressBar1.Visible=True
		Dim iDxAQctEstados As Int
		Dim rsEstados As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesSinEntregar order by FechaSalida")
		Do While rsEstados.NextRow
			Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO"))) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then
				jamCircularProgressBar1.Value=0
				jamCircularProgressBar1.Visible=False
				Dim msa As Object=xui.MsgboxAsync("No se ha actualizado el estado de las expediciones no entregadas","Error")
				Wait For (msa) Msgbox_Result
				Exit
			Else
				Dim lstDatosEstadosExpedicion As List=mRes.Get("lstRes")
				Dim mDataEstado As Map=lstDatosEstadosExpedicion.Get(0)
				Dim EstadoExp As String=mDataEstado.Get("ESTADO")
				mSQL.ExecNonQuery2("update tblExpedicionesSinEntregar set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
					Array(EstadoExp, rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO")))
			End If
			iDxAQctEstados=iDxAQctEstados+1
			jamCircularProgressBar1.Value=Floor(iDxAQctEstados*Intervalo)
		Loop
		rsEstados.Close
		jamCircularProgressBar1.Value=0
		jamCircularProgressBar1.Visible=False

		Dim rs As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesSinEntregar order by FechaSalida")
		Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
		Wait For (rSub) complete (mResultSetData As Map)
		rs.Close
		JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
		If Not(mResultSetData.Get("FlagOK")) Then
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
			If ""<>mResultSetData.Get("msgAviso") Then
				If True=mResultSetData.Get("ListaVacia") Then
					Dim msa As Object=xui.MsgboxAsync($"No hay Expediciones de TXT sin entregar.
(¿Error en webservice?)"$,"Aviso")
					Wait For (msa) Msgbox_Result
					 Return
				End If
				Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
				Wait For (msa) Msgbox_Result
			End If

		End If
	
	End If
	
'	Dim msa As Object=xui.MsgboxAsync("Datos actualizados.","Aviso")
'	Wait For (msa) Msgbox_Result
'	
''	Dim msa As Object=xui.MsgboxAsync("Datos pendientes de validar. O bien el web servide devuelve sólo las expediciones en reparto, o bien sólo la primera expedición pendiente... NO es correcto........","Atención")
''	Wait For (msa) Msgbox_Result
'	
'	

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
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblExpedicionesSinEntregar"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblExpedicionesSinEntregar")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblExpedicionesSinEntregar (")
	
	sbCrearTabla.Append("CODEMPRESA TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CODORIGEN TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CODDESTIN TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NEXPED1 INTEGER,")
	sbCrearTabla.Append("NEXPED2 INTEGER,")
	sbCrearTabla.Append("ANO TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FECHA_x0020_SALIDA TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("FechaSalida INTEGER DEFAULT 0,")
	sbCrearTabla.Append("DESTINO TEXT,")
	sbCrearTabla.Append("DESTINATARIO TEXT,")
	sbCrearTabla.Append("DIRECCION TEXT,")
	sbCrearTabla.Append("CP TEXT,")
	sbCrearTabla.Append("POBLACION TEXT,")
	sbCrearTabla.Append("REFERENCIA1 TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("REFERENCIA2 TEXT COLLATE NOCASE default '',")
	sbCrearTabla.Append("BULTOS INTEGER,")
	sbCrearTabla.Append("KILOS INTEGER,")	
	sbCrearTabla.Append("ESTADO TEXT COLLATE NOCASE DEFAULT '',")	
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")	
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '')")	
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	
End Sub

'' EJEMPLO, modificar según formulario
'Sub ActualizarDatosMysql As ResumableSub
'	mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim sLinkJRDC As String
'	Dim Comando As String
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
'			'mRes.Put("lstReg", lstReg)
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

'Sub JamTableCLV1_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	Dim ExtraSize As Int = 30 'Add 5 items at a time, this can be changed to suite your requirements
'	For i = Max(0, FirstIndex - ExtraSize) To Min(LastIndex + ExtraSize, JamTableCLV1.Size - 1) 'Loop for adding/removing your items layout to or from the list
'		Dim Pnl As B4XView = JamTableCLV1.GetPanel(i) 'Declare a new B4XView
''		If ColActualCLV=Col1 Then
''			ColActualCLV=Col2
''		Else
''			ColActualCLV=Col1
''		End If
''		Pnl.SetColorAndBorder(ColActualCLV,1,xui.Color_Gray,0)
'		
'		If i > FirstIndex - ExtraSize And i < LastIndex + ExtraSize Then 'Add a new item to the list
'			If Pnl.NumberOfViews = 0 Then 'Add items to the list
'				Dim mData As Map = JamTableCLV1.GetValue(i) 'Get your custom Type
'				Pnl.LoadLayout("scrItemExpedicionSinEntregarTxt") 
'				
'				'(*) ejemplos de controles del layout de los items
'				txtANO.Text=mData.Get("ANO")
'				txtBULTOS.Text=mData.Get("BULTOS")
'				txtCODDESTIN.Text=mData.Get("CODDESTIN")
'				txtCODEMPRESA.Text=mData.Get("CODEMPRESA")
'				txtCODORIGEN.Text=mData.Get("CODORIGEN")
'				txtCPOSTALDESTINATARIO.Text=mData.Get("CP")
'				txtDIRECCIONDESTINATARIO.Text=mData.Get("DIRECCION")
''				txtDOCADJUNTA.Text=mData.Get("DOCADJUNTA")
'				txtKILOS.Text=mData.Get("KILOS")
'				txtNEXPED1.Text=mData.Get("NEXPED1")
'				txtNEXPED2.Text=mData.Get("NEXPED2")
'				txtNOMBREDESTINATARIO.Text=mData.Get("DESTINATARIO")
'				txtDestino.Text=mData.Get("DESTINO")
'				txtPOBLACIONDESTINATARIO.Text=mData.Get("POBLACION")
'				txtREFERENCIA1.Text=mData.Get("REFERENCIA1")
''				txtFaseActual.Text=mData.Get("Fase")
''				txtAreaFaseActual.Text=mData.Get("AreaFase")
''				txtInfoAdicionalFaseActual.Text=mData.Get("InfoAdicionalFase")
''				txtPatron.Text=mData.Get("CodPatron")
''				txtOBSERVACIONES.Text=mData.Get("OBSERVACIONES")
'				txtFECHAALTA.Text=mData.Get("FECHA_x0020_SALIDA")
'				txtEstadoActual.Text=mData.Get("ESTADO")
'''	
'''				txtFechaPromProv.Text=mData.Get("ObservacionesFase")
'				
'				'(*) ejemplo para modificar el alto de un item 
'				' Dim AltoTextArea=JamTableCLV1.MedirAlturaTextoMultilinea ....
'				'JamTableCLV1.ResizeItem(i,txtObservaciones.Top+txtObservaciones.PrefHeight+5dip)
'			End If
'		Else 'Remove items from the list
'			If Pnl.NumberOfViews > 0 Then
'				Pnl.RemoveAllViews 'Remove none visible item from the main xCLV layout
'			End If
'		End If
'	Next
'	
'End Sub


Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemIndexCLV As DatosItemIndexCLVJamTableCLV)
	Dim mData As Map=DatosItemIndexCLV.Value
	Dim Pnl As B4XView=DatosItemIndexCLV.Panel
	Pnl.LoadLayout("scrItemExpedicionSinEntregarTxt")
				
	'(*) ejemplos de controles del layout de los items
	txtANO.Text=mData.Get("ANO")
	txtBULTOS.Text=mData.Get("BULTOS")
	txtCODDESTIN.Text=mData.Get("CODDESTIN")
	txtCODEMPRESA.Text=mData.Get("CODEMPRESA")
	txtCODORIGEN.Text=mData.Get("CODORIGEN")
	txtCPOSTALDESTINATARIO.Text=mData.Get("CP")
	txtDIRECCIONDESTINATARIO.Text=mData.Get("DIRECCION")
'				txtDOCADJUNTA.Text=mData.Get("DOCADJUNTA")
	txtKILOS.Text=mData.Get("KILOS")
	txtNEXPED1.Text=mData.Get("NEXPED1")
	txtNEXPED2.Text=mData.Get("NEXPED2")
	txtNOMBREDESTINATARIO.Text=mData.Get("DESTINATARIO")
	txtDestino.Text=mData.Get("DESTINO")
	txtPOBLACIONDESTINATARIO.Text=mData.Get("POBLACION")
	txtREFERENCIA1.Text=mData.Get("REFERENCIA1")
'				txtFaseActual.Text=mData.Get("Fase")
'				txtAreaFaseActual.Text=mData.Get("AreaFase")
'				txtInfoAdicionalFaseActual.Text=mData.Get("InfoAdicionalFase")
'				txtPatron.Text=mData.Get("CodPatron")
'				txtOBSERVACIONES.Text=mData.Get("OBSERVACIONES")
	txtFECHAALTA.Text=mData.Get("FECHA_x0020_SALIDA")
	
	Dim EstadoExp As String=mData.Get("ESTADO")
	Dim xtF As B4XView=txtEstadoActual
	If EstadoExp="" Then 
		EstadoExp="ESTADO PENDIENTE DE ACTUALIZAR"
		xtF.Color=xui.Color_LightGray
		xtF.TextColor=xui.Color_Red
	Else
		If EstadoExp.Contains("con incidencia") Then
			xtF.Color=xui.Color_Red
			xtF.TextColor=xui.Color_White
		Else
			xtF.Color=0xFFFFA500
			xtF.TextColor=xui.Color_Black
		End If

	End If
	txtEstadoActual.Text=EstadoExp
	txtNombreCliente.Text=mData.Get("NombreCliente")
	Dim xtF As B4XView=txtNombreResponsableCuenta
	txtNombreResponsableCuenta.Text=mData.Get("NombreResponsableCuenta")
	If txtNombreResponsableCuenta.Text<>"" Then
		xtF.Color=0xFFFFA500
	End If
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


Private Sub btnAccionesExpedicionSinEntregar_Click
	
		
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLV1.GetValue(JamTableCLV1.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLV1.GetItemFromView(btn)
	
	Dim IDTransporteTXT As Int=7
	Dim NumExpedicionTXTMySQL As String="001" & mData.Get("CODORIGEN") & "000" & mData.Get("NEXPED1") & mData.Get("NEXPED2") & mData.Get("ANO")  ' internamente la habremos puesto que el código de destino es 000
	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	
	Dialog.Title="Selecciona Acción"
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize
	
	Utilidades.SetLightThemeDialog(Dialog)
	Utilidades.SetLightThemeList(B4XListDlg)


	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
		
	Dim lstOpciones As List
	lstOpciones.Initialize
	lstOpciones.Add("Actualizar Estado Expedición")
	lstOpciones.Add("Buscar Histórico Estados Expedición")
	lstOpciones.Add("Consulta Incidencias Expedición")
	lstOpciones.Add("Ficha Expedición Web TXT")
	lstOpciones.Add("Documentos NAV de la expedición")
	
	B4XListDlg.Options=lstOpciones
	
	B4XListDlg.Resize(500dip, 400dip)
	B4XListDlg.CustomListView1.AsView.width=500dip
	B4XListDlg.CustomListView1.AsView.Height=400dip
	
	'Dialog.Resize(500dip, 400dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,60dip)
	Next
	
	' OJO ... es un B4XView no Button
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then Return
	
	JamTableCLV1.QuitarSeleccionTodosItems
	JamTableCLV1.SeleccionarItem(IndexSel)

	Dim OpcionSel As String=B4XListDlg.SelectedItem
	
	Select Case OpcionSel
		Case "Actualizar Estado Expedición"
			Dim offset_before_update As Float=  JamTableCLV1.sv.ScrollViewOffsetY
			JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
			Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(mData.Get("CODORIGEN"),mData.Get("CODDESTIN"),mData.Get("NEXPED1"),mData.Get("NEXPED2"), mData.Get("ANO"))) complete (mRes As Map)
			JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			Dim lstDatosEstadosExpedicion As List=mRes.Get("lstRes")
			'MostrarEstadosExpedicion(lstDatosEstadosExpedicion)
			wait for(ActualizarEstadoExpedicion(IndexSel, lstDatosEstadosExpedicion)) complete (rObj As Object)
			JamTableCLV1.sv.ScrollViewOffsetY=offset_before_update
			
		Case "Buscar Histórico Estados Expedición"
			Wait For(cmAuxTxT.ObtenerHistoricoEstadosExpedicionTXT(mData.Get("CODORIGEN"),mData.Get("CODDESTIN"),mData.Get("NEXPED1"),mData.Get("NEXPED2"), mData.Get("ANO"))) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			Dim lstDatosEstadosExpedicion As List=mRes.Get("lstRes")
			MostrarHistoricoEstadosExpedicion(lstDatosEstadosExpedicion)
		Case "Consulta Incidencias Expedición"
			Wait For(cmAuxTxT.ObtenerConsultaIncidenciasExpedicionTXT(mData.Get("CODORIGEN"),mData.Get("CODDESTIN"),mData.Get("NEXPED1"),mData.Get("NEXPED2"), mData.Get("ANO"))) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			Dim lstDatosIncidenciasExpedicion As List=mRes.Get("lstRes")
			MostrarIncidenciasExpedicion(lstDatosIncidenciasExpedicion)
			
		Case "Ficha Expedición Web TXT"
			Dim NumExpedicion As String=$"${mData.Get("CODEMPRESA")}${mData.Get("CODORIGEN")}${mData.Get("CODDESTIN")}${mData.Get("NEXPED1")}${mData.Get("NEXPED2")}${mData.Get("ANO")}"$
			wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedicionTXT(NumExpedicion)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				Dim URLtxt As String=mRes.Get("URL")
				If URLtxt<>"" Then
					fx.ShowExternalDocument(URLtxt)
				Else
					Dim msa As Object=xui.MsgboxAsync("Método UrlTracking TXT devuelve cadena vacía." ,"Error")
					Wait For (msa) Msgbox_Result
				End If
			End If
		Case "Documentos NAV de la expedición"
			DatosExpedicionInternaExpedicionTransporte(IDTransporteTXT,NumExpedicionTXTMySQL)
	End Select
End Sub


Sub MostrarEstadosExpedicion(lstEstadosExpedicion As List)
	For Each mData As Map In lstEstadosExpedicion
		Log(mData)
	Next
	Dim msa As Object=xui.MsgboxAsync(mData.Get("ESTADO"),"Estado actual")
	Wait For (msa) Msgbox_Result
End Sub

Sub ActualizarEstadoExpedicion(IndexSel As Int, lstEstadosExpedicion As List) As ResumableSub
	
	Log("Offset: " & JamTableCLV1.sv.ScrollViewOffsetY)
	
	Dim mEstado As Map=lstEstadosExpedicion.Get(0)
	Dim EstadoExp As String
	If mEstado.ContainsKey("ESTADO") Then
		EstadoExp=mEstado.get("ESTADO")
	Else
		EstadoExp="ERROR, ESTADO SIN ACTUALIZAR "
	End If
	Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel)
	For Each n As Node In pnl.GetAllViewsRecursive
		If n.Tag="ESTADO" Then
			Dim tF As TextField=n
			tF.Text=EstadoExp
			Exit
		End If
	Next
	
	Dim xtF As B4XView=tF
	If EstadoExp.StartsWith("ERROR") Then
		xtF.Color=xui.Color_Red
		xtF.TextColor=xui.Color_White
	Else
'		xtF.Color=0xFFFFA500
'		xtF.TextColor=xui.Color_Black
		If EstadoExp.Contains("con incidencia") Then
			xtF.Color=xui.Color_Red
			xtF.TextColor=xui.Color_White
		Else
			xtF.Color=0xFFFFA500
			xtF.TextColor=xui.Color_Black
		End If
	End If

	Dim mData As Map=JamTableCLV1.GetDatosItemNodo(tF)
	mData.Put("ESTADO",EstadoExp)
	Log("Offset: " & JamTableCLV1.sv.ScrollViewOffsetY)
	mSQL.ExecNonQuery2("update tblExpedicionesSinEntregar set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
					Array(EstadoExp, mData.get("CODORIGEN"),mData.get("CODDESTIN"),mData.get("NEXPED1"),mData.get("NEXPED2"), mData.get("ANO")))
	JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
					Array(EstadoExp, mData.get("CODORIGEN"),mData.get("CODDESTIN"),mData.get("NEXPED1"),mData.get("NEXPED2"), mData.get("ANO")))
	
	Sleep(0)
	
	Return Null
					
	Log("Offset: " & JamTableCLV1.sv.ScrollViewOffsetY)
End Sub

Sub MostrarHistoricoEstadosExpedicion(lstEstadosExpedicion As List)
	If lstEstadosExpedicion.Size=0 Then Return

	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd'T'HH:mm:ssXXX"

	Dim lstEstadosAj As List
	lstEstadosAj.Initialize
	For Each mData As Map In lstEstadosExpedicion
		'Log(mData)
'		Dim mDataAj As Map=CreateMap("Empresa":mData.Get("CODEMPRESA"),"Origen":mData.Get("CODORIGEN"),"Destino":mData.Get("CODDESTIN"), _
'			"NExped1":mData.Get("NEXPED1"),"NExped2":mData.Get("NEXPED2"),"Año":mData.Get("ANO"),"Centro":mData.Get("CENTRO"),"Estado":mData.Get("ESTADO"),"Fecha":mData.Get("FECHAESTADO"))
		DateTime.DateFormat="yyyy-MM-dd'T'HH:mm:ssXXX"
		Dim TicksFecha As Long=DateTime.DateParse(mData.Get("FECHAESTADO"))
		DateTime.DateFormat="dd/MM/yyyy"
		Dim mDataAj As Map=CreateMap("Centro":mData.Get("CENTRO"),"Estado":mData.Get("ESTADO"),"Fecha":DateTime.Date(TicksFecha) & " " & DateTime.Time(TicksFecha))
		lstEstadosAj.Add(mDataAj)
	Next
	DateTime.DateFormat=DateFormatAnt

	Dim pBaseFlexGrid As B4XView = xui.CreatePanel("")
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip, (0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	'p.LoadLayout("scrCLVCustomDialogJamTableCLV")
	pBaseFlexGrid.LoadLayout("scrDialogFlexGrid")

	Dim HeadersFont As Font=xui.CreateDefaultfont(15)
	FlexGridDialog.HeaderFont=HeadersFont

	Dim RowsFont As Font=xui.CreateDefaultfont(14)
	FlexGridDialog.Font=RowsFont
	Dim NumColumnasTablaTotales As Int=mDataAj.Size
	Dim AnchosColumnas(NumColumnasTablaTotales) As Int
	FlexGridDialog.SetColsNumber(NumColumnasTablaTotales)
	Dim ColIndex As Int
	'Dim mDatos As Map=lstDatosTotalesCamposNumericos.Get(0) ' para obtener encabezados
	For Each k As String In mDataAj.Keys

		FlexGridDialog.SetColName(ColIndex,k)

		Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
		If AnchoColumna<MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip Then
			AnchoColumna=MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip
			AnchosColumnas(ColIndex)=AnchoColumna
		End If
		
		ColIndex=ColIndex+1
	Next
	
	For Each mDatos As Map In lstEstadosAj
		Dim Fila(NumColumnasTablaTotales) As String
		Dim ColIndex As Int
		For Each k As String In mDatos.Keys
			Fila(ColIndex)=mDatos.get(k)
			Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
			If AnchoColumna<MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip Then
				AnchoColumna=MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip
				AnchosColumnas(ColIndex)=AnchoColumna
			End If
			ColIndex=ColIndex+1
		Next
		FlexGridDialog.AddRow(Fila,False)
	Next
	
	'AutoSize
	Dim AnchoTotalTabla As Int
	For ColIndex=0 To NumColumnasTablaTotales-1
		FlexGridDialog.SetColWidth(ColIndex,AnchosColumnas(ColIndex))
		AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(ColIndex)
	Next

	For RowIndex=0 To FlexGridDialog.RowCount-1
		FlexGridDialog.SetRowHeight(RowIndex,50dip)
	Next
	Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.RowCount)+50dip,(0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	FlexGridDialog.Base.Width=AnchoTotalTabla
	FlexGridDialog.Base.Height=AltoTotal
	
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTotalTabla+30dip, AltoTotal+60dip)
	'p.LoadLayout("scrCLVCustomDialogJamTableCLV")
	Sleep(100)
	FlexGridDialog.Invalidate
	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY

	Dialog.Title="Histórico Estados Expedición"
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseFlexGrid, "OK", "", "")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=16
	Wait For (rSub) Complete (Result As Int)

	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
End Sub


Sub MostrarIncidenciasExpedicion(lstIncidenciasExpedicion As List)
	For Each mData As Map In lstIncidenciasExpedicion
		Log(mData)
	Next
	If lstIncidenciasExpedicion.Size=0 Then Return

	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="yyyy-MM-dd'T'HH:mm:ssXXX"

	Dim lstIncidenciasAj As List
	lstIncidenciasAj.Initialize
	For Each mData As Map In lstIncidenciasExpedicion
		'Log(mData)
'		Dim mDataAj As Map=CreateMap("Empresa":mData.Get("CODEMPRESA"),"Origen":mData.Get("CODORIGEN"),"Destino":mData.Get("CODDESTIN"), _
'			"NExped1":mData.Get("NEXPED1"),"NExped2":mData.Get("NEXPED2"),"Año":mData.Get("ANO"),"Centro":mData.Get("CENTRO"),"Estado":mData.Get("ESTADO"),"Fecha":mData.Get("FECHAESTADO"))
		DateTime.DateFormat="yyyy-MM-dd'T'HH:mm:ssXXX"
		Dim TicksFecha As Long=DateTime.DateParse(mData.Get("FECHA"))
		DateTime.DateFormat="dd/MM/yyyy"
		Dim mDataAj As Map=CreateMap("CodigoIncidencia":mData.Get("CODINCIDENCIA"),"Descripcion":mData.Get("DESCRIPCION"),"Fecha":DateTime.Date(TicksFecha) & " " & DateTime.Time(TicksFecha))
		lstIncidenciasAj.Add(mDataAj)
	Next
	DateTime.DateFormat=DateFormatAnt

	Dim pBaseFlexGrid As B4XView = xui.CreatePanel("")
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip, (0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	'p.LoadLayout("scrCLVCustomDialogJamTableCLV")
	pBaseFlexGrid.LoadLayout("scrDialogFlexGrid")

	Dim HeadersFont As Font=xui.CreateDefaultfont(15)
	FlexGridDialog.HeaderFont=HeadersFont

	Dim RowsFont As Font=xui.CreateDefaultfont(14)
	FlexGridDialog.Font=RowsFont
	Dim NumColumnasTablaTotales As Int=mDataAj.Size
	Dim AnchosColumnas(NumColumnasTablaTotales) As Int
	FlexGridDialog.SetColsNumber(NumColumnasTablaTotales)
	Dim ColIndex As Int
	'Dim mDatos As Map=lstDatosTotalesCamposNumericos.Get(0) ' para obtener encabezados
	For Each k As String In mDataAj.Keys

		FlexGridDialog.SetColName(ColIndex,k)

		Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
		If AnchoColumna<MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip Then
			AnchoColumna=MeasurementCanvas.MeasureText(FlexGridDialog.ColsName(ColIndex), HeadersFont).Width+40dip
			AnchosColumnas(ColIndex)=AnchoColumna
		End If
		
		ColIndex=ColIndex+1
	Next
	
	For Each mDatos As Map In lstIncidenciasAj
		Dim Fila(NumColumnasTablaTotales) As String
		Dim ColIndex As Int
		For Each k As String In mDatos.Keys
			Fila(ColIndex)=mDatos.get(k)
			Dim AnchoColumna As Int=AnchosColumnas(ColIndex)
			If AnchoColumna<MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip Then
				AnchoColumna=MeasurementCanvas.MeasureText(mDatos.Get(k), RowsFont).Width+40dip
				AnchosColumnas(ColIndex)=AnchoColumna
			End If
			ColIndex=ColIndex+1
		Next
		FlexGridDialog.AddRow(Fila,False)
	Next
	
	'AutoSize
	Dim AnchoTotalTabla As Int
	For ColIndex=0 To NumColumnasTablaTotales-1
		FlexGridDialog.SetColWidth(ColIndex,AnchosColumnas(ColIndex))
		AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(ColIndex)
	Next

	For RowIndex=0 To FlexGridDialog.RowCount-1
		FlexGridDialog.SetRowHeight(RowIndex,50dip)
	Next
	Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.RowCount)+50dip,(0.75*(fx.PrimaryScreen.MaxY - fx.PrimaryScreen.MinY)))
	FlexGridDialog.Base.Width=AnchoTotalTabla
	FlexGridDialog.Base.Height=AltoTotal
	
	pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTotalTabla+30dip, AltoTotal+60dip)
	'p.LoadLayout("scrCLVCustomDialogJamTableCLV")
	Sleep(100)
	FlexGridDialog.Invalidate

	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	Dialog.Title="Histórico Incidencias Expedición"
	Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseFlexGrid, "OK", "", "")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=16
	Wait For (rSub) Complete (Result As Int)
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	
End Sub

Sub DatosExpedicionInternaExpedicionTransporte(IDTransporte As Int, NumExp As String)
	Wait For(ExpedicionInternaExpedicionTransporte(IDTransporte,NumExp)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return
	Dim lstReg As List=mRes.Get("lstReg")

	
	Dim lstOpciones As List
	lstOpciones.Initialize
	
	For Each mData As Map In lstReg
		Dim DocExp As String=mData.Get("Documento")
		If DocExp<>"" Then
			lstOpciones.Add(mData.Get("Documento"))
		End If
	Next

	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	
	Dialog.Title="Selecciona Documento NAV"
	Dialog.TitleBarHeight=60dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize
	
	Utilidades.SetLightThemeDialog(Dialog)
	Utilidades.SetLightThemeList(B4XListDlg)


	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
		

	
	B4XListDlg.Options=lstOpciones
	
	'Dialog.Resize(500dip, 400dip)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,60dip)
	Next
	
	' OJO ... es un B4XView no Button
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim DocSel As String=B4XListDlg.SelectedItem
	Select True
		Case DocSel.StartsWith("ALBV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico Albaranes Venta",130, "No.", DocSel)
		Case DocSel.StartsWith("RT")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico recep. transferencia",5745, "No.", DocSel)
		Case DocSel.StartsWith("CDEV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico envío devolución",6650, "No.", DocSel)
		Case Else
			Dim msa As Object=xui.MsgboxAsync("No es posible abrir la ficha de navision del documento " &DocSel ,"Aviso")
			Wait For (msa) Msgbox_Result
	End Select
End Sub


Sub ExpedicionInternaExpedicionTransporte(IDTransporte As Int, NumExp As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="DatosExpedicionInternaExpedicionTransporte"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTransporte,NumExp), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso")
			Wait For (msa) Msgbox_Result
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
				mRes.Put("lstReg", lstReg)
			End If
		End If
	End If
	Return mRes
End Sub

'Sub DatosDocumentosExpedicion(IDTransporte As Int, NumExp As String) As ResumableSub
'	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
'	Dim Comando As String="DatosDocumentosExpedicion"
'
'	
'	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSel), Me)
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
'			Accion="NOK"
'			mRes.Put("Accion", Accion)
'			Dim msa As Object=xui.MsgboxAsync("No hay datos en NAVISION para el documento seleccionado (" & DocSel & ")","Aviso")
'			Wait For (msa) Msgbox_Result
'		Else
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			Dim lstReg As List=mResult.Get("lstRes")
'			mRes.Put("lstReg", lstReg)
'		End If
'	End If
'	Return mRes
'End Sub


Sub DocumentosExpedicionesSinEntregarBatch As ResumableSub
	
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Success", False)
	
	Dim NumRegRef1Doc As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblExpedicionesSinEntregar where REFERENCIA1<>?",Array As String("")))
	If NumRegRef1Doc=0 Then Return mResult
	
	Wait For(CrearTablaTemporalDocumentosReferenciasTte) COMPLETE (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return mResult
	

	Dim lstComandos As List
	lstComandos.Initialize
	
'	Dim cmd As DBCommand = JRDCQuery.CreateCommand("CrearTablaTemporalDocumentosReferenciasTte",Null)
'	lstComandos.Add(cmd)
'	
	Dim rs As ResultSet=mSQL.ExecQuery2("select REFERENCIA1 from tblExpedicionesSinEntregar where referencia1<>? order by REFERENCIA1",Array As String(""))
	Do While rs.NextRow
		#if debug
		Log("REFERENCIA1 " & rs.GetString("REFERENCIA1"))
		#End If
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("InsertarDatosTablaTemporalDocumentosReferenciasTte",Array(rs.GetString("REFERENCIA1")))
		lstComandos.Add(cmd)
	Loop
	rs.Close
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.","Error")
		Wait For (msa) Msgbox_Result
		Return mResult
	End If
	
	Wait For(DocumentosExpedicionesPendientes) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return mResult
	
	Dim lstReg As List=mRes.Get("lstReg")
	mResult.put("Success", True)
	mResult.put("lstReg", lstReg)
	
	Return mResult
End Sub

Sub CrearTablaTemporalDocumentosReferenciasTte As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"CrearTablaTemporalDocumentosReferenciasTte",Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte","Error")
		Wait For (msa) Msgbox_Result
		Accion="ErrConn"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			' aqui no se puede dar este caso
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Dim msa As Object=xui.MsgboxAsync("Error SP CrearTablaTemporalDocumentosReferenciasTte" & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
				Accion="ERROR SP"
				mRes.Put("Accion", Accion)
			Else	
				Accion="OK"
				mRes.Put("Accion", Accion)
			End If
		End If
	End If
	Return mRes
End Sub

Sub DocumentosExpedicionesPendientes As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,"DocumentosReferenciasExpedicionesTte",Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query DocumentosReferenciasExpedicionesTte","Error")
		Wait For (msa) Msgbox_Result
		Accion="ErrConn"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="SinDocumentos"
			mRes.Put("Accion", Accion)
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub EliminarTablaTemporalDocumentosReferenciasTte As ResumableSub
	Dim cmd As DBCommand = JRDCQuery.CreateCommand("EliminarTablaTemporalDocumentosReferenciasTte",Null)
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,Array(cmd))) complete (Success As Boolean)
'	If Success=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible eliminar la tabla temporal tblreferenciasexpedicionestemp.","Error")
'		Wait For (msa) Msgbox_Result
'		Return mResult
'	End If
	Return Null
End Sub


Sub CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,"CrearTablaTemporalDocumentosExpedicionesPendientes",Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query CrearTablaTemporalDocumentosExpedicionesPendientes","Error")
		Wait For (msa) Msgbox_Result
		Accion="ErrConn"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			' aqui no se puede dar este caso
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase="OK" Then
				Accion="OK"
				mRes.Put("Accion", Accion)
			Else
				Dim msa As Object=xui.MsgboxAsync("Error SP CrearTablaTemporalDocumentosExpedicionesPendientes " & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
				Accion="ERROR SP"
				mRes.Put("Accion", Accion)
			End If
		End If
	End If
	Return mRes
End Sub


Sub ClienteResponsableCuentaDocumento(Doc As String) As ResumableSub
	Dim Accion As String
'	Dim lstReg As List
'	lstReg.Initialize
	Dim mRes As Map
	mRes.Initialize
	'mRes.Put("Accion", Accion)
	'mRes.Put("lstReg", lstReg)
	Dim comando As String
	Select True
		Case Doc.StartsWith("ALBV")
			comando="ClienteResponsableCuentaALBV"
		Case Doc.StartsWith("RT")
			comando="ClienteResponsableCuentaRT"
		Case Else
			Accion="ErrTipoDoc"
			mRes.Put("Accion",Accion)
			Return mRes
	End Select
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array(Doc), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & comando,"Error")
		Wait For (msa) Msgbox_Result
		Accion="ErrConn"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="SinResultado"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("lstReg", lstReg)
		End If
	End If

	Return mRes
End Sub
