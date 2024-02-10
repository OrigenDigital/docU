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
'	Private txtDOCADJUNTA As TextField
	Private txtFECHAALTA As TextField
	Private txtKILOS As TextField
	Private txtNEXPED1 As TextField
	Private txtNEXPED2 As TextField
	Private txtNOMBREDESTINATARIO As TextField
	'Private txtOBSERVACIONES As TextField
	Private txtPOBLACIONDESTINATARIO As TextField
	'Private txtPORTEE As TextField
	Private txtREFERENCIA1 As TextField
	Private txtDestino As TextField
	Private txtEstadoActual As B4XView
	
	Private MeasurementCanvas As B4XCanvas
	
	Private FlexGridDialog As FlexGrid
	Private btnSalir As Button
	Private txtFechaInicial As TextField
	Private btnSelFechaInicial As Button
	Private txtFechaFinal As TextField
	Private btnSelFechaFinal As Button
	Private btnGetInfo As Button
	
	Private FechaInicialLong, FechaFinalLong As Long
	Private txtFechaSalida As TextField
	Private txtFechaEntrega As TextField
	Private txtNombreCliente As TextField
	Private txtNombreResponsableCuenta As B4XView
	Private txtTipo As B4XView
	Private lblIndicadorEstado As B4XView
	Private txtEntregado As B4XView
	Private lblIndicadorTipo As B4XView
	

	Private jamCircularProgressBar1 As jamCircularProgressBar
	Private jamLoadingIndicator1 As JamLoadingIndicator
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
	frm.RootPane.LoadLayout("scrExpedicionesPeriodoTXT")
	Sleep(0)
	
		
	frm.Title=Main.PrefijoTitleForms &  "  " & "Expediciones Periodo TXT"
		
	Dialog.Initialize (frm.RootPane)
	'Utilidades.SetLightThemeDialog(Dialog)
	
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
		
	frm.Show
	
	'(*) las siguientes 2 lineas son para abrir el CamposBuilder y crear el JSON. Comentar (o borrar) una vez creado el JSON
'	JamTableCLV1.AbrirCamposBuilder
'	Return
'	''
	'(*) añadir Menu Items
	JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarAcciones,True)
	JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarLinea,False)
	JamTableCLV1.AddMenuItemToMenuInMenuBar("Actualizar Status Expediciones No Entregadas","ActualizarStatusExpedicionesNoEntregadas",JamTableCLV1.MenuBarAcciones)
	
	Dim rSub As ResumableSub=JamTableCLV1.ConfigurarTableCLV("ListaExpedicionesPeriodoTXT.json")
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
	JamTableCLV1.AlturaItems=180dip
	'(*) opcional
	JamTableCLV1.ModoSeleccionItems=JamTableCLV1.ModoSeleccionIndividualPerm  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple
	
	JamTableCLV1.AlturaSeparadorPaneles=2dip
	JamTableCLV1.ColorSeparadorPaneles=0xFF696969
	
	If mSQL.IsInitialized Then mSQL.Close
	'mSQLOrdenesCorte.InitializeSQLite("", ":memory:", True)
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	'
	CreacionTablasSQLite
	
'	ActualizarDatos
End Sub


Sub ActualizarDatos
	
'	JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	jamLoadingIndicator1.DuracionCiclo=1000
	'jamLoadingIndicator1.EstiloLoadingIndicator="Single Circle"
	jamLoadingIndicator1.MensajeLoading=""
	jamLoadingIndicator1.Show
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	'DateTime.DateFormat="yyyy-MM-dd'T'HH:mm:ssXXX"
	DateTime.DateFormat="dd/MM/yyyy"
	Dim SFechaDesde As String=DateTime.Date(FechaInicialLong)
	Dim SFechaHasta As String=DateTime.Date(FechaFinalLong)
	
	
	DateTime.DateFormat=DateFormatAnt
	
	JamTableCLV1.Clear
	
	mSQL.ExecNonQuery("delete from tblExpedicionesPeriodoTXT")
	wait for(cmAuxTxT.ObtenerBuscarExpedicionesPeriodoTXT(SFechaDesde,SFechaHasta)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	
 	Dim lstRes As List=mRes.Get("lstRes")
	If lstRes.Size>0 Then
		#if debug
		Dim mData As Map=lstRes.Get(0)
		For Each k As String In mData.Keys
			Log("")
			Log(k & ": " & mData.Get(k))
		Next
		#End If

	End If
	
	Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblExpedicionesPeriodoTXT",lstRes)
	
'	Dim rsEstados As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesPeriodoTXT")
'	Do While rsEstados.NextRow
'		Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO"))) complete (mRes As Map)
'		Dim Accion As String=mRes.Get("Accion")
'		If Accion<>"OK" Then
'			Dim msa As Object=xui.MsgboxAsync("No se ha actualizado el estado de las expediciones no entregadas","Error")
'			Wait For (msa) Msgbox_Result
'			Exit
'		Else
'			Dim lstDatosEstadosExpedicion As List=mRes.Get("lstRes")
'			Dim mDataEstado As Map=lstDatosEstadosExpedicion.Get(0)
'			Dim EstadoExp As String=mDataEstado.Get("ESTADO")
'			mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
'				Array(EstadoExp, rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO")))
'		End If
'	Loop
'	rsEstados.Close
	'mSQL.ExecNonQuery("update tblExpedicionesPeriodoTXT set Referencia_x0020_1=trim(Referencia_x0020_1)")
	mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where  Fecha_x0020_Entrega<>?",Array As Object("ENTREGADO",""))
	mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set Entregado=? where  Fecha_x0020_Entrega<>?",Array As Object("SI",""))
	mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where  Fecha_x0020_Entrega=?",Array As Object("PENDIENTE DE ACTUALIZAR",""))
	mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set Entregado=? where  Fecha_x0020_Entrega=?",Array As Object("NO",""))
	
	'JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
	
	'''''''''''''''
	Dim lstRegDocsExpPeriodo As List
	lstRegDocsExpPeriodo.Initialize
	Wait For(DocumentosExpedicionesPeriodoBatch) complete (mRes As Map)
	Dim Success As Boolean=mRes.Get("Success")
	If Success Then
		Dim lstRegDocsExpPeriodo As List=mRes.Get("lstReg")
	End If
	
	Wait For(EliminarTablaTemporalDocumentosReferenciasTte) complete (rObj As Object)
	
	If lstRegDocsExpPeriodo.Size>0 Then
	
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
''''		For Each m As Map In lstRegDocsExpPeriodo
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
		
		' obtener los responsables de cuenta de los documentos (ojo, puede haber ALBVs y RTs)
		'
		
		' eliminar la tabla temporal
		'actualizar tabla SQLite tblExpedicionesSinEntregar
	
'''''''''		For Each m As Map In lstRegDocsExpPeriodo
'''''''''			'Log(m)
'''''''''	
'''''''''			Wait For(ClienteResponsableCuentaDocumento(m.Get("Documento"))) complete (mRes As Map)
'''''''''			Dim Accion As String=mRes.Get("Accion")
'''''''''			If Accion="ErrConn" Then
'''''''''				SalirModulo
'''''''''				Return
'''''''''			End If
'''''''''			If Accion="OK" Then
'''''''''				Dim lstReg As List=mRes.Get("lstReg")
'''''''''				Dim mICli As Map=lstReg.Get(0)
'''''''''				'Log(mICli)
'''''''''				mSQL.AddNonQueryToBatch("update tblExpedicionesPeriodoTXT set NombreCliente=?, NombreResponsableCuenta=? where trim(Referencia_x0020_1)=?",Array(mICli.Get("NombreCliente"),mICli.Get("ResponsableCuenta"), m.Get("ReferenciaExpedicionTransporte")))
'''''''''			End If
'''''''''	
'''''''''	
'''''''''		Next
'''''''''		Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
'''''''''		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		'''''''''		Log("NonQuery: " & Success)



		Dim nDoc As Int=1
		For Each m As Map In lstRegDocsExpPeriodo
			'Log(m)
			jamLoadingIndicator1.MensajeLoading="Actualizando info " & m.Get("Documento") & " (" & nDoc & " de " & lstRegDocsExpPeriodo.Size & ") ..."
			Wait For(ClienteResponsableCuentaDocumento(m.Get("Documento"))) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="ErrConn" Then
				'Return False
			End If
			If Accion="OK" Then
				Dim lstReg As List=mRes.Get("lstReg")
				Dim mICli As Map=lstReg.Get(0)
				'Log(mICli)
				''''				mSQL.AddNonQueryToBatch("insert into tblDocumentosExpediciones (NumExpedicion, Referencia, Documento, Cliente, NombreCliente, NombreResponsableCuenta) values(?,?,?,?,?,?)", _
				''''					Array("", m.Get("ReferenciaExpedicionTransporte"), mICli.Get("Documento"), mICli.Get("Cliente"), mICli.Get("NombreCliente"),mICli.Get("ResponsableCuenta")))
					
				For Each mInfoExp As Map In lstRegDocsExpPeriodo
					Dim RefExp As String=mInfoExp.Get("ReferenciaExpedicionTransporte")
					If RefExp=m.Get("ReferenciaExpedicionTransporte") Then
'						mInfoExp.Put("Cliente",mICli.Get("Cliente"))
'						mInfoExp.Put("NombreCliente",mICli.Get("NombreCliente"))
'						mInfoExp.Put("NombreResponsableCuenta",mICli.Get("ResponsableCuenta"))
						mSQL.AddNonQueryToBatch("update tblExpedicionesPeriodoTXT set NombreCliente=?, NombreResponsableCuenta=? where Referencia_x0020_1=?",Array(mICli.Get("NombreCliente"),mICli.Get("ResponsableCuenta"), RefExp))
						Exit
					End If
				Next
			End If
			nDoc=nDoc+1
		Next

		Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
		Log("NonQuery: " & Success)
	
	End If
	
	
	
	

	jamLoadingIndicator1.Close

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesPeriodoTXT order by Fecha_x0020_Alta, NExped1, Nexped2")
	Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)
	Wait For (rSub) complete (mResultSetData As Map)
'	JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV

	rs.Close
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
				Dim msa As Object=xui.MsgboxAsync("No hay expediciones de TXT en el periodo seleccionado","Aviso")
				Wait For (msa) Msgbox_Result
				 Return
			End If
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
			Wait For (msa) Msgbox_Result
		End If

	End If
	
	Dim msa As Object=xui.MsgboxAsync("Datos actualizados.","Aviso")
	Wait For (msa) Msgbox_Result

	ActualizarStatusExpedicionesNoEntregadas

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
			If FechaFinalLong=0 Or FechaInicialLong=0 Then
				Dim msa As Object=xui.MsgboxAsync("Indica fecha inicial y fecha final.","Error")
				Wait For (msa) Msgbox_Result
				Return
			End If
			If FechaFinalLong<FechaInicialLong Then
				Dim msa As Object=xui.MsgboxAsync("La fecha final no puede ser anterior a la fecha inicial.","Error")
				Wait For (msa) Msgbox_Result
				Return
			End If
			ActualizarDatos
		Case "EjemploAccionLineasSeleccionadas"
			Dim lstDatosLineasSeleccionadas As List=JamTableCLV1.GetDatosItemsSeleccionados
			For Each mData As Map In lstDatosLineasSeleccionadas
				LogColor("DatosLineaSeleccionada : " & mData, xui.Color_Blue)
			Next
		Case "ActualizarStatusExpedicionesNoEntregadas"
			ActualizarStatusExpedicionesNoEntregadas
	End Select
End Sub



Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblExpedicionesPeriodoTXT"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblExpedicionesPeriodoTXT")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblExpedicionesPeriodoTXT (")
	
	sbCrearTabla.Append("CODEMPRESA TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CODORIGEN TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("CODDESTIN TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("NEXPED1 INTEGER,")
	sbCrearTabla.Append("NEXPED2 INTEGER,")
	sbCrearTabla.Append("ANO TEXT COLLATE NOCASE,")
	sbCrearTabla.Append("Fecha_x0020_salida TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Fecha_x0020_Alta TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Fecha_x0020_Entrega TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Nombre_x0020_Destinatario TEXT DEFAULT '',")
	sbCrearTabla.Append("Dirección_x0020_Destinatario TEXT DEFAULT '',")
	sbCrearTabla.Append("Código_x0020_Postal_x0020_Destinatario TEXT DEFAULT '',")
	sbCrearTabla.Append("Población_x0020_Destinatario TEXT DEFAULT '',")
	sbCrearTabla.Append("Referencia_x0020_1 TEXT DEFAULT '',")
	sbCrearTabla.Append("Bultos INTEGER DEFAULT 0,")
	sbCrearTabla.Append("Kilos_x0020_Reales INTEGER DEFAULT 0,")
	sbCrearTabla.Append("Volumen INTEGER DEFAULT 0,")
	sbCrearTabla.Append("Tipo TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("Entregado TEXT COLLATE NOCASE DEFAULT '',")
	sbCrearTabla.Append("EstadoActual TEXT COLLATE NOCASE DEFAULT '')")
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
'				Pnl.LoadLayout("scrItemExpedicionesPeriodoTxT")
'				
'				'(*) ejemplos de controles del layout de los items
'				txtANO.Text=mData.Get("ANO")
'				txtBULTOS.Text=mData.Get("Bultos")
'				txtCODDESTIN.Text=mData.Get("CODDESTIN")
'				txtCODEMPRESA.Text=mData.Get("CODEMPRESA")
'				txtCODORIGEN.Text=mData.Get("CODORIGEN")
'				txtCPOSTALDESTINATARIO.Text=mData.Get("Código_x0020_Postal_x0020_Destinatario")
'				txtDIRECCIONDESTINATARIO.Text=mData.Get("Dirección_x0020_Destinatario")
''				txtDOCADJUNTA.Text=mData.Get("DOCADJUNTA")
'				txtKILOS.Text=mData.Get("Kilos_x0020_Reales")
'				txtNEXPED1.Text=mData.Get("NEXPED1")
'				txtNEXPED2.Text=mData.Get("NEXPED2")
'				txtNOMBREDESTINATARIO.Text=mData.Get("Nombre_x0020_Destinatario")
'				txtDestino.Text=mData.Get("DESTINO")
'				txtPOBLACIONDESTINATARIO.Text=mData.Get("Población_x0020_Destinatario")
'				txtREFERENCIA1.Text=mData.Get("Referencia_x0020_1")
''				txtFaseActual.Text=mData.Get("Fase")
''				txtAreaFaseActual.Text=mData.Get("AreaFase")
''				txtInfoAdicionalFaseActual.Text=mData.Get("InfoAdicionalFase")
''				txtPatron.Text=mData.Get("CodPatron")
''				txtOBSERVACIONES.Text=mData.Get("OBSERVACIONES")
'				txtFECHAALTA.Text=mData.Get("Fecha_x0020_Alta")
'				txtEstadoActual.Text=mData.Get("ESTADO")
'				txtFechaEntrega.Text=mData.Get("Fecha_x0020_Entrega")
'				txtFechaSalida.Text=mData.Get("Fecha_x0020_Salida")
'				''
'				''				txtFechaPromProv.Text=mData.Get("ObservacionesFase")
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
	Dim mData As Map = DatosItemIndexCLV.Value
	Dim pnl As B4XView=DatosItemIndexCLV.Panel
	pnl.LoadLayout("scrItemExpedicionesPeriodoTxT")
				

	txtANO.Text=mData.Get("ANO")
	txtBULTOS.Text=mData.Get("Bultos")
	txtCODDESTIN.Text=mData.Get("CODDESTIN")
	txtCODEMPRESA.Text=mData.Get("CODEMPRESA")
	txtCODORIGEN.Text=mData.Get("CODORIGEN")
	txtCPOSTALDESTINATARIO.Text=mData.Get("Código_x0020_Postal_x0020_Destinatario")
	txtDIRECCIONDESTINATARIO.Text=mData.Get("Dirección_x0020_Destinatario")
	'				txtDOCADJUNTA.Text=mData.Get("DOCADJUNTA")
	txtKILOS.Text=mData.Get("Kilos_x0020_Reales")
	txtNEXPED1.Text=mData.Get("NEXPED1")
	txtNEXPED2.Text=mData.Get("NEXPED2")
	txtNOMBREDESTINATARIO.Text=mData.Get("Nombre_x0020_Destinatario")
	'txtDestino.Text=mData.Get("DESTINO")
	txtDestino.Text=""
	txtPOBLACIONDESTINATARIO.Text=mData.Get("Población_x0020_Destinatario")
	txtREFERENCIA1.Text=mData.Get("Referencia_x0020_1")
	'				txtFaseActual.Text=mData.Get("Fase")
	'				txtAreaFaseActual.Text=mData.Get("AreaFase")
	'				txtInfoAdicionalFaseActual.Text=mData.Get("InfoAdicionalFase")
	'				txtPatron.Text=mData.Get("CodPatron")
	'				txtOBSERVACIONES.Text=mData.Get("OBSERVACIONES")
	txtFECHAALTA.Text=mData.Get("Fecha_x0020_Alta")
	
	txtFechaEntrega.Text=mData.Get("Fecha_x0020_Entrega")
	txtFechaSalida.Text=mData.Get("Fecha_x0020_salida")

	txtNombreResponsableCuenta.Text=mData.Get("NombreResponsableCuenta")
	If txtNombreResponsableCuenta.Text<>"" Then
		txtNombreResponsableCuenta.Color=0xFFFFA500
	End If
	Dim Tipo As String=mData.Get("Tipo")
	txtTipo.Text=Tipo
	If Tipo="LLEGADAS" Then
		lblIndicadorTipo.Color=0xFFF0E68C
		lblIndicadorTipo.Text=Chr(0xF090)
	Else
		lblIndicadorTipo.Color=0xC0FF7F50
		lblIndicadorTipo.Text=Chr(0xF08B)
	End If
	
	Dim EstadoActual As String=mData.Get("EstadoActual")
	
	If EstadoActual="PENDIENTE DE ACTUALIZAR" Then
		txtEstadoActual.TextColor=xui.Color_Gray
		txtEstadoActual.Text="STATUS PENDIENTE DE ACTUALIZAR"
	Else
		txtEstadoActual.Text=EstadoActual
		If EstadoActual.ToUpperCase.StartsWith("ENTREGADO") Then
			txtEstadoActual.TextColor=xui.Color_Blue
		Else
			txtEstadoActual.TextColor=0xFFDC143C
		End If
	End If
	txtEntregado.Text=mData.Get("Entregado")
	If EstadoActual="ENTREGADO" Then
		lblIndicadorEstado.Color=0xFF7FFF00
	Else
		lblIndicadorEstado.Color=0xFFFF4500
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

'Private Sub btnActualizar_Click
'	ActualizarDatos
'End Sub

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
	
	JamTableCLV1.SeleccionarItem(IndexSel)
	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY 

	Dialog.Title="Selecciona Acción"
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
		
	Dim lstOpciones As List
	lstOpciones.Initialize
	lstOpciones.Add("Actualizar Estado Expedición")
	lstOpciones.Add("Histórico Estados Expedición")
	lstOpciones.Add("Consulta Incidencias Expedición")
	lstOpciones.Add("Ficha Expedición Web TXT")
	lstOpciones.Add("Documentos NAV de la expedición")
	
	B4XListDlg.Options=lstOpciones
	
		
	B4XListDlg.Resize(500dip, 400dip)
	B4XListDlg.CustomListView1.AsView.width=500dip
	B4XListDlg.CustomListView1.AsView.Height=400dip
	
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
	
	

	Dim OpcionSel As String=B4XListDlg.SelectedItem
	
	Select Case OpcionSel
		Case "Actualizar Estado Expedición"

			JamTableCLV1.SetMouseCursorWaitDeshabilitarparentTableCLV
			Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(mData.Get("CODORIGEN"),mData.Get("CODDESTIN"),mData.Get("NEXPED1"),mData.Get("NEXPED2"), mData.Get("ANO"))) complete (mRes As Map)
			JamTableCLV1.SetMouseCursorDefaultHabilitarTableCLV
			Dim Accion As String=mRes.Get("Accion")
			If Accion<>"OK" Then Return
			Dim lstDatosEstadosExpedicion As List=mRes.Get("lstRes")
			'MostrarEstadosExpedicion(lstDatosEstadosExpedicion)
			ActualizarEstadoExpedicion(IndexSel,mData, lstDatosEstadosExpedicion)
			
		Case "Histórico Estados Expedición"
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

			Dim nExped1 As String=mData.Get("NEXPED1")
			If nExped1="0" Then nExped1="000"
			Dim NumExpedicion As String=$"${mData.Get("CODEMPRESA")}${mData.Get("CODORIGEN")}${mData.Get("CODDESTIN")}${nExped1}${mData.Get("NEXPED2")}${mData.Get("ANO")}"$
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
			Dim IDTransporteTXT As Int=7
			Dim NumExpedicionTXTMySQL As String="001" & mData.Get("CODORIGEN") & "000" & mData.Get("NEXPED1") & mData.Get("NEXPED2") & mData.Get("ANO")  ' internamente la habremos puesto que el código de destino es 000
			DatosExpedicionInternaExpedicionTransporte(IDTransporteTXT,NumExpedicionTXTMySQL)
	End Select
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



Sub MostrarEstadosExpedicion(lstEstadosExpedicion As List)
	For Each mData As Map In lstEstadosExpedicion
		Log(mData)
	Next
	Dim msa As Object=xui.MsgboxAsync(mData.Get("ESTADO"),"Estado actual")
	Wait For (msa) Msgbox_Result
End Sub

Sub ActualizarEstadoExpedicion(IDxItem As Int, mData As Map, lstEstadosExpedicion As List)
	
	For Each mDataEstadoActual As Map In lstEstadosExpedicion
		Log(mDataEstadoActual)
	Next
	Dim EstadoActual As String=mDataEstadoActual.Get("ESTADO")
'	Dim msa As Object=xui.MsgboxAsync(mData.Get("ESTADO"),"Estado actual")
'	Wait For (msa) Msgbox_Result

	mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
					Array(EstadoActual, mData.get("CODORIGEN"),mData.get("CODDESTIN"),mData.get("NEXPED1"),mData.get("NEXPED2"), mData.get("ANO")))
	JamTableCLV1.SQL.ExecNonQuery2("update tblOrigenDatos set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
					Array(EstadoActual, mData.get("CODORIGEN"),mData.get("CODDESTIN"),mData.get("NEXPED1"),mData.get("NEXPED2"), mData.get("ANO")))


	Dim p As B4XView=JamTableCLV1.GetPanel(IDxItem)
	Dim Entregado As Boolean
	For Each xNEnt As B4XView In p.GetAllViewsRecursive
		If xNEnt.Tag="Entregado" Then
			Entregado=xNEnt.text="SI"
			Exit
		End If
	Next
	For Each xNE As B4XView In p.GetAllViewsRecursive
		If xNE.Tag="EstadoActual" Then
			xNE.Text=EstadoActual
			If Entregado Then
				xNE.TextColor=xui.Color_Blue
			Else
				xNE.TextColor=0xFFDC143C
			End If
			Exit
		End If
	Next
	
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
'	Dim msa As Object=xui.MsgboxAsync(mData.Get("ESTADO"),"Estado actual")
'	Wait For (msa) Msgbox_Result
End Sub




Private Sub btnGetInfo_Click
	If FechaFinalLong=0 Or FechaInicialLong=0 Then
		Dim msa As Object=xui.MsgboxAsync("Indica fecha inicial y fecha final.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If FechaFinalLong<FechaInicialLong Then
		Dim msa As Object=xui.MsgboxAsync("La fecha final no puede ser anterior a la fecha inicial.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	ActualizarDatos
End Sub

Private Sub btnSelFechaFinal_Click
'	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
'	Dialog.Title="Indica Fecha Final"
'	'Dialog.TitleBarHeight=80dip
'	Dim B4XDateDlg As B4XDateTemplate
'	B4XDateDlg.Initialize
'	B4XDateDlg.Date=DateTime.Now
'	B4XDateDlg.CloseOnSelection=True
'	B4XDateDlg.FirstDay=1
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
''	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
''	bOK.TextSize=15
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.TextSize=15
'	bCancel.Left=bCancel.Left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For (rSub) complete (rInt As Int)
'	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
'	If rInt<>xui.DialogResponse_Positive Then
'		Return
'	End If
'	Dim FechaFinSel As Long=B4XDateDlg.Date
'	
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'	Dim FechaFinalHora As Long=FechaFinSel
'	FechaFinalLong=DateUtils.SetDate(DateTime.GetYear(FechaFinalHora),DateTime.GetMonth(FechaFinalHora),DateTime.GetDayOfMonth(FechaFinalHora))
'	FechaFinalLong=FechaFinalLong+DateTime.TicksPerDay-1
'	txtFechaFinal.Text=DateTime.Date(FechaFinalLong)
'	Log(DateUtils.TicksToString(FechaFinalLong))
'	DateTime.DateFormat=DateFormatAnt
'	
	
	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	Dialog.Title="Indica Fecha Final"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaFinalLong=0 Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=FechaFinalLong
	End If
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	Dim FechaFinSel As Long=B4XDateDlg.Date
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim FechaFinalHora As Long=FechaFinSel
	FechaFinalLong=DateUtils.SetDate(DateTime.GetYear(FechaFinalHora),DateTime.GetMonth(FechaFinalHora),DateTime.GetDayOfMonth(FechaFinalHora))
	FechaFinalLong=FechaFinalLong+DateTime.TicksPerDay-1
	txtFechaFinal.Text=DateTime.Date(FechaFinalLong)
	Log(DateUtils.TicksToString(FechaFinalLong))
	
	If FechaInicialLong=0 Then
		FechaInicialLong=FechaFinalLong
		txtFechaInicial.Text=DateTime.date(FechaInicialLong)
	End If
	
	DateTime.DateFormat=DateFormatAnt
End Sub

Private Sub btnSelFechaInicial_Click
'	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
'	Dialog.Title="Indica Fecha Inicial"
'	'Dialog.TitleBarHeight=80dip
'	Dim B4XDateDlg As B4XDateTemplate
'	B4XDateDlg.Initialize
'	B4XDateDlg.Date=DateTime.Now
'	B4XDateDlg.CloseOnSelection=True
'	B4XDateDlg.FirstDay=1
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
''	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
''	bOK.TextSize=15
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	bCancel.TextSize=15
'	bCancel.Left=bCancel.Left-20dip
'	bCancel.Width=bCancel.Width+20dip
'	Wait For (rSub) complete (rInt As Int)
'	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
'	If rInt<>xui.DialogResponse_Positive Then
'		Return
'	End If
'	Dim FechaInSel As Long=B4XDateDlg.Date
'	
'	
'	Dim DateFormatAnt As String=DateTime.DateFormat
'	DateTime.DateFormat="dd/MM/yyyy"
'
'	FechaInicialLong=DateUtils.SetDate(DateTime.GetYear(FechaInSel),DateTime.GetMonth(FechaInSel),DateTime.GetDayOfMonth(FechaInSel))
'	txtFechaInicial.Text=DateTime.date(FechaInicialLong)
'	Log(DateUtils.TicksToString(FechaInicialLong))
'	DateTime.DateFormat=DateFormatAnt
	
	Dim offset_before_dialog As Float=  JamTableCLV1.sv.ScrollViewOffsetY
	Dialog.Title="Indica Fecha Inicial"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If FechaInicialLong=0 Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=FechaInicialLong
	End If
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	JamTableCLV1.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	Dim FechaInSel As Long=B4XDateDlg.Date
	
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"

	FechaInicialLong=DateUtils.SetDate(DateTime.GetYear(FechaInSel),DateTime.GetMonth(FechaInSel),DateTime.GetDayOfMonth(FechaInSel))
	txtFechaInicial.Text=DateTime.date(FechaInicialLong)
	Log(DateUtils.TicksToString(FechaInicialLong))
	
	If FechaFinalLong=0 Then
		FechaFinalLong=FechaInicialLong
		txtFechaFinal.Text=DateTime.date(FechaFinalLong)
	End If
	DateTime.DateFormat=DateFormatAnt
	
End Sub


Sub ActualizarStatusExpedicionesNoEntregadas
	Dim msa As Object = xui.Msgbox2Async("¿Actualizar Status expediciones pendientes de entrega?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	'JamTableCLV1.SetMouseCursorWaitDeshabilitarTableCLV
	If rInt<>xui.DialogResponse_Positive Then Return

	Dim NumExpPtes As Int=mSQL.ExecQuerySingleResult2("select count(*) from tblExpedicionesPeriodoTXT where Entregado=?",Array As String("NO"))
	Dim Intervalo As Int=100/NumExpPtes
	jamCircularProgressBar1.Visible=True
	Dim iDxAQctEstados As Int
	Dim rsEstados As ResultSet=mSQL.ExecQuery2("select * from tblExpedicionesPeriodoTXT where Entregado=?",Array As String("NO"))
	Do While rsEstados.NextRow
		Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO"))) complete (mRes As Map)
		Dim Accion As String=mRes.Get("Accion")
		If Accion<>"OK" Then
'			jamCircularProgressBar1.Value=0
'			jamCircularProgressBar1.Visible=False
'			Dim msa As Object=xui.MsgboxAsync("No se ha actualizado el estado de las expediciones no entregadas","Error")
'			Wait For (msa) Msgbox_Result
'			Exit
		Else
			Dim lstDatosEstadosExpedicion As List=mRes.Get("lstRes")
			Dim mDataEstado As Map=lstDatosEstadosExpedicion.Get(0)
			Dim EstadoExp As String=mDataEstado.Get("ESTADO")
'			mSQL.ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
'					Array(EstadoExp, rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO")))
					
			mSQL.AddNonQueryToBatch("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?", _
					Array(EstadoExp, rsEstados.Getstring("CODORIGEN"),rsEstados.GetString("CODDESTIN"),rsEstados.GetInt("NEXPED1"),rsEstados.GetInt("NEXPED2"), rsEstados.GetString("ANO")))		
		End If
		iDxAQctEstados=iDxAQctEstados+1
		jamCircularProgressBar1.Value=Floor(iDxAQctEstados*Intervalo)
	Loop
	rsEstados.Close

	Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
	Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
	Log("NonQuery: " & Success)
	
	
	jamCircularProgressBar1.Value=0
	jamCircularProgressBar1.Visible=False

	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblExpedicionesPeriodoTXT order by Fecha_x0020_Alta, NExped1, Nexped2")
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
End Sub


Sub DocumentosExpedicionesPeriodoBatch As ResumableSub
	
	Dim mResult As Map
	mResult.Initialize
	mResult.Put("Success", False)
	
	Dim NumRegRef1Doc As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblExpedicionesPeriodoTXT where Referencia_x0020_1<>?",Array As String("")))
	If NumRegRef1Doc=0 Then Return mResult
	
	Wait For(CrearTablaTemporalDocumentosReferenciasTte) COMPLETE (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then Return mResult
	

	Dim lstComandos As List
	lstComandos.Initialize
	
'	Dim cmd As DBCommand = JRDCQuery.CreateCommand("CrearTablaTemporalDocumentosReferenciasTte",Null)
'	lstComandos.Add(cmd)
'	
	Dim rs As ResultSet=mSQL.ExecQuery2("select Referencia_x0020_1 from tblExpedicionesPeriodoTXT where Referencia_x0020_1<>? order by Referencia_x0020_1",Array As String(""))
	Do While rs.NextRow
		#if debug
		Log("Referencia_x0020_1 " & rs.GetString("Referencia_x0020_1"))
		#End If
		Dim cmd As DBCommand = JRDCQuery.CreateCommand("InsertarDatosTablaTemporalDocumentosReferenciasTte",Array(rs.GetString("Referencia_x0020_1")))
		lstComandos.Add(cmd)
	Loop
	rs.Close
	wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySqlDatosComunes,lstComandos)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.","Error")
		Wait For (msa) Msgbox_Result
		Return mResult
	End If
	
	Wait For(DocumentosExpedicionesPeriodo) complete (mRes As Map)
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



Sub DocumentosExpedicionesPeriodo As ResumableSub
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
