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
	
	Private mCallBack As Object
	Private mParent As B4XView
	Dim Background As B4XView
	
	Private Dialog As B4XDialog
	'Private btnSalir As Button
	Private mSQL As SQL
	
	Private mDocumentoSel As String
	
	'(*) Declarar desde el designer los objetos del layout de los Items del CLV
	
	
	Private JamTableCLVFasesDoc As JamTableCLV
	Private btnAccionesFase As Button
	Private chkFaseActiva As CheckBox
	Private txtFase As TextField
	Private txtFechaFase As TextField
	Private txtInfoAdicionalFase As TextField
	Private txtNumeroExpedicion As TextField
	Private txtObservaciones As TextField
	Private txtResponsableFase As TextField
	'Private txtCliente As TextField
	Private txtDocumento As TextField
	Private txtFechaDocumento As TextField
	'Private txtNombreCliente As TextField
	Private txtAreaFase As TextField
	
	Private DestinatarioTaller As Boolean
	Private OSUBTaller As String
	

	Private lblTitleCodigoDestinoDoc As Label
	Private txtCodigoDestinoDoc As TextField
	Private lblTitleNombreDestinoDoc As Label
	Private txtNombreDestinoDoc As TextField
	
	Private JamLoadingIndicator1 As JamLoadingIndicator
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(CallBack As Object,Parent As B4XView, DocumentoSel As String)
	mCallBack=CallBack
	mParent=Parent
	Background= xui.CreatePanel("background")
	Background.Tag = "b4xdialog_background"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	
	mDocumentoSel=DocumentoSel
End Sub

Private Sub Background_MouseClicked (EventData As MouseEvent)
	EventData.Consume
End Sub




Public Sub Show

	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrFasesDocumento")
	Sleep(0)  
	
		
	frm.Title=Main.PrefijoTitleForms & "Fases Documento"
		
	Dialog.Initialize (frm.RootPane)
	Utilidades.SetLightThemeDialog(Dialog)
	
	JamLoadingIndicator1.Initialize(Me,frm.RootPane)
		
	frm.Show
	
	txtDocumento.Text=""
	LimpiarDatosDocumento
	
	
	'(*) añadir Menu Items
	JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFasesDoc.MenuBarTabla,False)
	JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFasesDoc.MenuBarAcciones,True)
	JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFasesDoc.MenuBarLinea,False)
	JamTableCLVFasesDoc.AddMenuItemFontAwesomeToMenuInMenuBar("Actualizar Datos Fases Documento","Actualizar",Chr(0xF021),JamTableCLVFasesDoc.MenuBarAcciones)
	
'	'(*) las siguientes 2 lineas son para abrir el CamposBuilder y crear el JSON. Comentar (o borrar) una vez creado el JSON
'	JamTableCLVFasesDoc.AbrirCamposBuilder
'	Return


		
	Dim rSub As ResumableSub=JamTableCLVFasesDoc.ConfigurarTableCLV("ListaFasesDocumentoNoCorregidas.json")
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
	
	'(*) Opcional	
	JamTableCLVFasesDoc.AddMenuItemFontAwesomeToMenuInMenuBar("Nueva Fase","NuevaFase",Chr(0xF196),JamTableCLVFasesDoc.MenuBarAcciones)
	
	'(*) opcional. Tambien se puede asignar en el designer, o en la sub VisibleRangeChanged
	JamTableCLVFasesDoc.AlturaItems=90dip
	'(*) opcional 
	JamTableCLVFasesDoc.ModoSeleccionItems=JamTableCLVFasesDoc.ModoSeleccionIndividualTemp  ' por defecto es individual tenmporal. Tambien es posible seleccionar modo multiple

	JamTableCLVFasesDoc.AlturaSeparadorPaneles=4dip
	
'	If mSQL.IsInitialized Then mSQL.Close
'	'mSQLOrdenesCorte.InitializeSQLite("", ":memory:", True)
'	mSQL.InitializeSQLite(xui.DefaultFolder,"PrioridadesOSUBsNoCorte.db",True)
'	
'	CreacionTablasSQLite
	
	'ActualizarDatos
	
	If mDocumentoSel<>"" Then
		Wait For(ActualizarDatosTotalesDocumentoSel(mDocumentoSel)) complete (Success As Boolean)
		If Success=False Then SalirModulo
	End If
End Sub


'Sub ActualizarDatos
'	
'	'btnSalir.Enabled=False
'	Wait For(ActualizarDatosMysql) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion<>"OK" Then
'		SalirModulo
'		Return
'	End If
'
'
'	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblDatosFormulario")
'	Dim rSub As ResumableSub=JamTableCLVFasesDoc.setdata(rs)
'	Wait For (rSub) complete (mResultSetData As Map)
'	rs.Close
'	If Not(mResultSetData.Get("FlagOK")) Then
'		If ""<>mResultSetData.Get("msgAviso") Then
'			If True=mResultSetData.Get("ListaVacia") Then Return
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgAviso"),"Aviso")
'			Wait For (msa) Msgbox_Result
'		End If
'		If ""<>mResultSetData.Get("msgError") Then
'			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
'			Wait For (msa) Msgbox_Result
'			#if debug
'			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
'			Wait For (msa) Msgbox_Result (rInt As Int)
'			If rInt=xui.DialogResponse_Positive Then
'				JamTableCLVFasesDoc.AbrirCamposBuilder
'				Return
'			End If
'			#End If
'			ExitApplication
'		End If
'	End If
'	
'	fx.Msgbox(frm,"Datos actualizados.","Aviso")
'	
'
'End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub JamTableCLVFasesDoc_AccionSalirJamTableCLV
	SalirModulo
End Sub


Private Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	Background.RemoveViewFromParent
	frm.Close
	'MainMenu2.Show
	If SubExists(mCallBack,"FaseDocumentoActualizada") Then
		CallSub2(mCallBack,"FaseDocumentoActualizada",mDocumentoSel)
	End If
End Sub


Sub JamTableCLVFasesDoc_MenuBarMenuItem_Action(TagMenuItem As String)
	Select Case TagMenuItem
		Case "Actualizar"
			Wait For(ActualizarDatosTotalesDocumentoSel(mDocumentoSel)) complete (Success As Boolean)
			If Success=False Then SalirModulo
'		Case "EjemploAccionLineasSeleccionadas"
'			Dim lstDatosLineasSeleccionadas As List=JamTableCLVFasesDoc.GetDatosItemsSeleccionados
'			For Each mData As Map In lstDatosLineasSeleccionadas
'				LogColor("DatosLineaSeleccionada : " & mData, xui.Color_Blue)
'			Next
		Case "NuevaFase"
			NuevaFaseDoc
	End Select
End Sub

Sub NuevaFaseDoc
	Dim TipoDoc As String
	If mDocumentoSel.StartsWith("OSUB") Then
		TipoDoc="FAB"
	Else
		TipoDoc="DOC"
	End If
	Dim cNuevaFaseDoc As cNuevaFaseDocumento
	cNuevaFaseDoc.Initialize(Me,frm.RootPane,mDocumentoSel,TipoDoc, DestinatarioTaller, OSUBTaller)
	cNuevaFaseDoc.Show
	
End Sub

Sub NuevaFaseDocActualizada(Actualizada As Boolean)
	If Actualizada=False Then Return
	Wait For(ActualizarDatosTotalesDocumentoSel(mDocumentoSel)) complete (Success As Boolean)
	If Success=False Then SalirModulo
End Sub



''(*) EJEMPLO, modificar según el formulario
'Sub CreacionTablasSQLite
'	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblDatosFormulario"))
'	If ntFP>0 Then
'		mSQL.ExecNonQuery("drop table tblOSUBsNoCortePtes")
'	End If
'	Dim sbCrearTabla As StringBuilder
'	sbCrearTabla.Initialize
'	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblDatosFormulario (")
'	
'	sbCrearTabla.Append("PedidoFab TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Proveedor TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("NombreProveedor TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FechaPedido INTEGER,")
'	sbCrearTabla.Append("RutaOF TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Articulo TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Descripcion TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Talla TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("QtyRec INTEGER,")
'	sbCrearTabla.Append("QtyPte INTEGER,")
'	sbCrearTabla.Append("FechaRequerida INTEGER,")
'	sbCrearTabla.Append("Cliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("NombreCliente TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("CodDirenvio TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("NombreDirEnvio TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("Personalizacion INTEGER,")
'	sbCrearTabla.Append("FechaOF INTEGER,")
'	sbCrearTabla.Append("OFab TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("CodPatron TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("[Routing No_] TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("TransfComp INTEGER,")
'	sbCrearTabla.Append("Operacion TEXT COLLATE NOCASE,")
'	sbCrearTabla.Append("FinalizaProducto INTEGER,")
'	sbCrearTabla.Append("DescripcionModelo TEXT COLLATE NOCASE DEFAULT '')")
'	mSQL.ExecNonQuery(sbCrearTabla.ToString)
'	
'	
'End Sub

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
'
'Sub JamTableCLVFasesDoc_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	Dim ExtraSize As Int = 30 'Add 5 items at a time, this can be changed to suite your requirements
'	For i = Max(0, FirstIndex - ExtraSize) To Min(LastIndex + ExtraSize, JamTableCLVFasesDoc.Size - 1) 'Loop for adding/removing your items layout to or from the list
'		Dim Pnl As B4XView = JamTableCLVFasesDoc.GetPanel(i) 'Declare a new B4XView
''		If ColActualCLV=Col1 Then
''			ColActualCLV=Col2
''		Else
''			ColActualCLV=Col1
''		End If
''		Pnl.SetColorAndBorder(ColActualCLV,1,xui.Color_Gray,0)
'		
'		If i > FirstIndex - ExtraSize And i < LastIndex + ExtraSize Then 'Add a new item to the list
'			If Pnl.NumberOfViews = 0 Then 'Add items to the list
'				Dim mData As Map = JamTableCLVFasesDoc.GetValue(i) 'Get your custom Type
'				Pnl.LoadLayout("scrItemFasesDocumentoLin") 
'
'				txtFase.Text=mData.Get("Fase")
'				txtAreaFase.Text=mData.Get("AreaFase")
'				txtResponsableFase.Text=mData.Get("ResponsableFase")
'				txtInfoAdicionalFase.Text=mData.Get("InfoAdicionalFase")
'				txtNumeroExpedicion.Text=mData.Get("NumExpedicion")
'				txtObservaciones.Text=mData.Get("Obs")
'		
'				Dim DateFormatAnt As String=DateTime.DateFormat
'				DateTime.DateFormat="dd/MM/yyyy"
'				Dim TimeFormatAnt As String=DateTime.timeFormat
'				DateTime.TimeFormat	="HH:mm"
'				txtFechaFase.Text=DateTime.date(mData.Get("FechaFase")) & " " & DateTime.time(mData.Get("FechaFase"))
'				
'				DateTime.DateFormat=DateFormatAnt
'				DateTime.TimeFormat=TimeFormatAnt
'				
'				chkFaseActiva.Checked=1=mData.Get("Mov")
'				
'				'(*) ejemplo para modificar el alto de un item 
'				' Dim AltoTextArea=JamTableCLVFasesDoc.MedirAlturaTextoMultilinea ....
'				'JamTableCLVFasesDoc.ResizeItem(i,txtObservaciones.Top+txtObservaciones.PrefHeight+5dip)
'			End If
'		Else 'Remove items from the list
'			If Pnl.NumberOfViews > 0 Then
'				Pnl.RemoveAllViews 'Remove none visible item from the main xCLV layout
'			End If
'		End If
'	Next
'	
'End Sub


Sub JamTableCLVFasesDoc_LoadLayoutPanelItem(DatosItemIndexCLV As DatosItemIndexCLVJamTableCLV)
	Dim mData As Map = DatosItemIndexCLV.Value
	Dim pnl As B4XView=DatosItemIndexCLV.Panel
	pnl.LoadLayout("scrItemFasesDocumentoLin")

	txtFase.Text=mData.Get("Fase")
	txtAreaFase.Text=mData.Get("AreaFase")
	txtResponsableFase.Text=mData.Get("ResponsableFase")
	txtInfoAdicionalFase.Text=mData.Get("InfoAdicionalFase")
	txtNumeroExpedicion.Text=mData.Get("NumExpedicion")
	txtObservaciones.Text=mData.Get("Obs")
		
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"
	Dim TimeFormatAnt As String=DateTime.timeFormat
	DateTime.TimeFormat	="HH:mm"
	txtFechaFase.Text=DateTime.date(mData.Get("FechaFase")) & " " & DateTime.time(mData.Get("FechaFase"))
				
	DateTime.DateFormat=DateFormatAnt
	DateTime.TimeFormat=TimeFormatAnt
				
	chkFaseActiva.Checked=1=mData.Get("Mov")
End Sub

Sub JamTableCLVFasesDoc_ItemClick(Index As Int, Value As Object)
	Dim mData As Map=Value
	Log("Datos Item seleccionado (" & Index & "): " )
	For Each k In mData.Keys
		Log(k & ": " & mData.Get(k))
	Next
End Sub

'botón derecho
Sub JamTableCLVFasesDoc_ItemLongClick(Index As Int, Value As Object)
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
	Dim mData As Map=JamTableCLVFasesDoc.GetValue(JamTableCLVFasesDoc.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLVFasesDoc.GetItemFromView(btn)
End Sub



Private Sub btnSelDocumento_Click
	mDocumentoSel=""
	DestinatarioTaller=False
	txtDocumento.Text=""
	LimpiarDatosDocumento
	Dim offset_before_dialog As Float=  JamTableCLVFasesDoc.sv.ScrollViewOffsetY
	Dialog.Title="Indica Documento"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=""
	
	Utilidades.SetLightThemeInput(InputDlg)
	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim DocSel As String=InputDlg.Text.Trim.ToUpperCase
	If Not(DocSel.StartsWith("ALBV")) And Not(DocSel.StartsWith("RT")) And Not(DocSel.StartsWith("CDEV")) And Not(DocSel.StartsWith("OSUB")) Then
		'Dim msa As Object=xui.MsgboxAsync(DocSel & " no es un documento no válido." & CRLF & CRLF & "(sólo ALBV,RT,CDEV, Y OSUB existentes en navision.)","Aviso")
		Dim msa As Object=xui.MsgboxAsync(DocSel & " no es un documento no válido." & CRLF & CRLF & "(sólo ALBV,RT,CDEV, Y OSUB.)","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	mDocumentoSel=DocSel
	JamLoadingIndicator1.Show
	Wait For(ActualizarDatosTotalesDocumentoSel(mDocumentoSel)) complete (Success As Boolean)
	JamLoadingIndicator1.Close
	If Success=False Then SalirModulo
End Sub


Sub ActualizarDatosTotalesDocumentoSel(DocSel As String) As ResumableSub
	OSUBTaller=""
	Wait For(ActualizarDatosNavDocumentoSel(DocSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return False
	Dim lstReg As List=mRes.Get("lstReg")
	If lstReg.Size=0 Then Return False
	Dim mData As Map=lstReg.Get(0)
	Log(mData)
	txtDocumento.Text=mDocumentoSel
	Select True
		Case DocSel.StartsWith("ALBV")
			lblTitleCodigoDestinoDoc.Text="Cliente"
			lblTitleNombreDestinoDoc.Text="Nombre Cliente"
			txtCodigoDestinoDoc.Text=mData.Get("Destinatario")
			txtNombreDestinoDoc.Text=mData.Get("NombreDestinatario")
		Case DocSel.StartsWith("RT")
			lblTitleCodigoDestinoDoc.Text="Codigo"
			lblTitleNombreDestinoDoc.Text="Nombre Destinatario"
			txtCodigoDestinoDoc.Text=mData.Get("Destinatario")
			txtNombreDestinoDoc.Text=mData.Get("NombreDestinatario")
		Case DocSel.StartsWith("CDEV")
			lblTitleCodigoDestinoDoc.Text="Proveedor"
			lblTitleNombreDestinoDoc.Text="Nombre Proveedor"
			txtCodigoDestinoDoc.Text=mData.Get("Destinatario")
			txtNombreDestinoDoc.Text=mData.Get("NombreDestinatario")
		Case DocSel.StartsWith("OSUB")
			lblTitleCodigoDestinoDoc.Text="Proveedor"
			lblTitleNombreDestinoDoc.Text="Nombre Proveedor"
			txtCodigoDestinoDoc.Text=mData.Get("Proveedor")
			txtNombreDestinoDoc.Text=mData.Get("NombreProveedor")
			
	End Select

	txtFechaDocumento.Text=mData.Get("Fecha")
	
	If DocSel.StartsWith("RT") Then
		Dim OsubRT As String=mData.Get("PedidoFab")
		DestinatarioTaller=OsubRT<>""
		OSUBTaller=OsubRT
	End If
	
	JamTableCLVFasesDoc.Clear
	
	Wait For(ActualizarFasesDocumentoSel(DocSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return False
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mData As Map In lstReg
		Log(mData)
	Next
	
	JamLoadingIndicator1.Close
	
	Dim rSub As ResumableSub=JamTableCLVFasesDoc.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	lstReg.Initialize
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				JamTableCLVFasesDoc.AbrirCamposBuilder
				Return
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
Private Sub btnAccionesFase_Click
	
	Dim btn As Button=Sender
	Dim mData As Map=JamTableCLVFasesDoc.GetValue(JamTableCLVFasesDoc.GetItemFromView(btn))
	Log(mData)
	Dim IndexSel As Int=JamTableCLVFasesDoc.GetItemFromView(btn)
	Dim offset_before_dialog As Float=  JamTableCLVFasesDoc.sv.ScrollViewOffsetY
	
	Dialog.Title="Selecciona Acción"
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
	Dim B4XListDlg As B4XListTemplate
	B4XListDlg.Initialize
	Utilidades.SetLightThemeList(B4XListDlg)

	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	
	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
	
	Dim lstOpciones As List
	lstOpciones.Initialize
	lstOpciones.Add("Anular Fase")
	lstOpciones.Add("Editar Observaciones")
	
	Dim FaseSel As String=mData.Get("Fase")
	
	If FaseSel.ToUpperCase="EXPEDIDO" Then
		lstOpciones.Add("Trazabilidad Transporte")
	End If
	

	'lstOpciones.Add("Buscar Expedicion DHL")

	B4XListDlg.Options=lstOpciones
	
	Dim rs As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
	
	For i=0 To lstOpciones.size-1
		xclv.ResizeItem(i,80dip)
	Next
	
	' OJO ... es un B4XView no Button
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		'Log("bCancel" & bCancel.Text)
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=16
	End If
	
	Wait For (rs) Complete (Result As Int)
	JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_before_dialog
	Dim AccionFase As String=B4XListDlg.SelectedItem
	
	
	Select AccionFase
		Case "Trazabilidad Transporte"
			TrazabilidadTransporte(mData)
			
		Case "Anular Fase"
			AnularFase(mData)
			
		Case "Editar Observaciones"
			EditarObservaciones(mData)
			
		Case "Buscar Expedicion DHL"
			BuscarExpedicionDHLPorReferencia
		
	End Select
End Sub


Sub ActualizarDatosNavDocumentoSel(DocSel As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String
	Select True
		Case DocSel.StartsWith("ALBV")
			Comando="CabFasesALBV"
		Case DocSel.StartsWith("RT")
			Comando="CabFasesRT"
		Case DocSel.StartsWith("CDEV")
			Comando="CabFasesCDEV"
		Case DocSel.StartsWith("OSUB")
			Comando="CabFasesProduccionPC"
		Case Else
			Dim msa As Object=xui.MsgboxAsync(DocSel & " no es un documento no válido." & CRLF & CRLF & "(sólo ALBV,RT,CDEV, Y OSUB.)","Aviso")
			Wait For (msa) Msgbox_Result
			mRes.Put("Accion", "NOK")
			Return mRes
	End Select
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSel), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No hay datos en NAVISION para el documento seleccionado (" & DocSel & ")","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
'			Dim lstCommands As List
'			lstCommands.Initialize
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
'			For Each m As Map In lstReg
'				Log("m: " & m)
			''				Dim OSUB As String=m.Get("PedidoFab")
			''				Dim cmd As DBCommand=JRDCQuery.CreateCommand("InsertarLineaFaseActualDocumentoBatch",Array(TimestampBatchFaseDocs,UUIDSesion,Main.DatosUsuario.UsuarioWindows,Main.DatosUsuario.NombreUsuarioWindows,OSUB))
			''				lstCommands.Add(cmd)
'			Next
'			DBUtils.InsertMaps(mSQL,"tblDatosFormulario",lstReg)
		End If
	End If
	Return mRes
End Sub

Sub LimpiarDatosDocumento
	'txtCliente.Text=""
	txtCodigoDestinoDoc.Text=""
	'txtNombreCliente.Text=""
	txtNombreDestinoDoc.Text=""
	txtFechaDocumento.Text=""
	JamTableCLVFasesDoc.Clear
End Sub

Sub ActualizarFaseActualDocumentoSel(DocSel As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="FaseActualDocumentoSP"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSel), Me)
	
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
			Dim msa As Object=xui.MsgboxAsync("No hay datos en NAVISION para el documento seleccionado (" & DocSel & ")","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Sub ActualizarFasesDocumentoSel(DocSel As String) As ResumableSub
	'mSQL.ExecNonQuery("DELETE from tblDatosFormulario")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="FasesDocNoCorregidasDateTime"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSel), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List
			lstReg.Initialize
			mRes.Put("lstReg", lstReg)
			Dim msa As Object=xui.MsgboxAsync("No hay datos de fases para el documento seleccionado (" & DocSel & ")","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			mRes.Put("Accion", Accion)
			Dim lstReg As List=mResult.Get("lstRes")
			mRes.Put("lstReg", lstReg)
		End If
	End If
	Return mRes
End Sub

Private Sub btnMostrarDocumentoEnNavision_Click

	If mDocumentoSel="" Then
		Dim msa As Object=xui.MsgboxAsync("No se ha seleccionado ningún documento válido." ,"Aviso")
		Wait For (msa) Msgbox_Result
		 Return
	End If
	
	Dim msa As Object = xui.Msgbox2Async("¿Mostrar el documento " & mDocumentoSel & " en NAVISION?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return

	
	Dim DocSel As String=mDocumentoSel
	Select True
		Case DocSel.StartsWith("ALBV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico Albaranes Venta",130, "No.", DocSel)
		Case DocSel.StartsWith("RT")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico recep. transferencia",5745, "No.", DocSel)
		Case DocSel.StartsWith("CDEV")
			Dim rSub As ResumableSub=jamLinkNavision.AbrirLinkFichaNAV("Histórico envío devolución",6650, "No.", DocSel)
	End Select
	
	
	'frm.RootPane.MouseCursor=fx.Cursors.WAIT
	
	wait for(rSub) complete (success As Boolean)
	'frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
	If success Then

	Else
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible abrir la ficha del documento " & DocSel & " en NAVISION." ,"Error")
		Wait For (msa) Msgbox_Result
	End If
End Sub


Sub TrazabilidadTransporte(mData As Map)
	Dim Transporte As String=mData.Get("ResponsableFase")
	Transporte=Transporte.ToUpperCase
	Dim Expedicion As String=mData.Get("NumExpedicion")
	Expedicion=Expedicion.ToUpperCase
	Select Case Transporte
		
		Case "DHL"
			
			Dim ExpedicionDHL As String
			If Expedicion.Length>=20 Then
				ExpedicionDHL=Expedicion.SubString2(8,10)&Expedicion.SubString2(12,20)
			Else
				ExpedicionDHL=Expedicion
			End If
			fx.ShowExternalDocument("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo=" & ExpedicionDHL & "&anno=2017&lang=sp")

		Case "TXT"
			wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedicionTXT(Expedicion)) complete (mRes As Map)
			Dim Accion As String=mRes.Get("Accion")
			If Accion="OK" Then
				Dim URLtxt As String=mRes.Get("URL")
				If URLtxt<>"" Then
					fx.ShowExternalDocument(URLtxt)
				Else
					Dim msa As Object=xui.MsgboxAsync("Ha fallado el método obtener URL TXT." ,"Error")
					Wait For (msa) Msgbox_Result
				End If
			End If
			
		Case "CORREOS EXPRESS"
			Dim cInfoExpedCorreosExp As cInfoExpedicionCorreosExpress
			cInfoExpedCorreosExp.Initialize(Expedicion)
			cInfoExpedCorreosExp.Show
		Case Else
			Dim msa As Object=xui.MsgboxAsync("No es posible obtener información de trazabilidad de esta expedición mediante este formulario." & _
				CRLF & CRLF & "Consultar con Logística." ,"Error")
			Wait For (msa) Msgbox_Result
			

	End Select
	
	
End Sub

Sub AnularFase(mData As Map)
	
	Dim msa As Object = xui.Msgbox2Async("¿Anular movimiento seleccionado?", "Anulación de Fase", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return

'	Dim IDMvtoFase As Int=mData.Get("IDMov")
'	Dim UltFaseDoc As Int=Starter.SQLAlmZ.ExecQuerySingleResult("select max(IDMov) from tblDocFasesNav where Corregido=0")
'	If IDMvtoFase<UltFaseDoc Then
'		Dim msa As Object=xui.MsgboxAsync("Sólo se puede anular la última fase del documento.","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
	Dim FaseActiva As Boolean=1=mData.Get("Mov")
	If FaseActiva=False Then
		Dim msa As Object=xui.MsgboxAsync("Sólo se puede anular la última fase del documento.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If

	If DestinatarioTaller Then
		wait for (AnularMovimientoFaseRTFab(mData.Get("IDMov"),mDocumentoSel,0,OSUBTaller)) complete (Accion As String)
		If Accion<>"OK" Then Return
	Else
		wait for (AnularMovimientoFaseDoc(mData.Get("IDMov"),mDocumentoSel,0)) complete (Accion As String)
		If Accion<>"OK" Then Return
	End If
	Wait For(ActualizarDatosTotalesDocumentoSel(mDocumentoSel)) complete (Success As Boolean)
	If Success=False Then SalirModulo
End Sub


Sub AnularMovimientoFaseRTFab(IDMov As Int, Doc As String, IDU As Int, OSUB As String) As ResumableSub
	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="AnularFaseRTFab"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov,Doc,IDU,OSUB), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			'mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible anular la fase.","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Dim lstRes As List=mResult.Get("lstRes")
			Dim mResp As Map=lstRes.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Accion="NOK"
				'mRes.Put("Accion", Accion)
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible ." & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
			Else
				Accion="OK"
				'mRes.Put("Accion", Accion)
			End If
		End If
	End If
	'Return mRes
	Return Accion
End Sub

Sub AnularMovimientoFaseDoc(IDMov As Int, Doc As String, IDU As Int) As ResumableSub
	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="AnularFase"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov,Doc,IDU), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			'mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible anular la fase.","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			Dim lstRes As List=mResult.Get("lstRes")
			Dim mResp As Map=lstRes.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Accion="NOK"
				'mRes.Put("Accion", Accion)
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible ." & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
			Else
				Accion="OK"
				'mRes.Put("Accion", Accion)
			End If
		End If
	End If
	Return Accion
End Sub

Sub EditarObservaciones(mData As Map)
	Dim offset_before_dialog As Float=  JamTableCLVFasesDoc.sv.ScrollViewOffsetY
	Dialog.Title="Editar Observaciones Fase"
	Dialog.TitleBarHeight=50dip
	Dim InputDlg As B4XInputTemplate
	InputDlg.Initialize
	InputDlg.lblTitle.Text=""
	InputDlg.Text=mData.Get("Obs")
	Dim MaxNumChar As Int=100
	InputDlg.RegexPattern="^.{" & 0 & "," & MaxNumChar & "}$"
	InputDlg.mBase.Width=750dip
	Utilidades.SetLightThemeInput(InputDlg)
	Dim rSub As ResumableSub=Dialog.ShowTemplate(InputDlg,"OK","","Cancelar")
	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	'Dialog.TitleBarHeight=AltTitleAnt
	JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_before_dialog
	If rInt<>xui.DialogResponse_Positive Then Return
	Dim NuevasObs As String=InputDlg.Text
	Wait For(UpdateObservacionesFaseDoc(mData.Get("IDMov"),NuevasObs)) complete (sResp As String)
	If sResp="NOK" Then Return
	
	Wait For(ActualizarFasesDocumentoSel(mDocumentoSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return 
	Dim lstReg As List=mRes.Get("lstReg")
	For Each mData As Map In lstReg
		Log(mData)
	Next
	
	Dim rSub As ResumableSub=JamTableCLVFasesDoc.setdata(lstReg)
	Wait For (rSub) complete (mResultSetData As Map)
	lstReg.Initialize
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				JamTableCLVFasesDoc.AbrirCamposBuilder
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
	
End Sub





Sub UpdateObservacionesFaseDoc(IDMov As Int, Observaciones As String) As ResumableSub
	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="UpdateObsFaseDoc"

	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov,Observaciones), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
		'mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Accion="NOK"
			'mRes.Put("Accion", Accion)
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar las observaciones de la fase.","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Dim lstRes As List=mResult.Get("lstRes")
			Dim mResp As Map=lstRes.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Accion="NOK"
				'mRes.Put("Accion", Accion)
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible actualizar las observaciones de la fase." & CRLF & CRLF & sResp,"Error")
				Wait For (msa) Msgbox_Result
			Else
				Accion="OK"
				'mRes.Put("Accion", Accion)
			End If

		End If
	End If
	Return Accion
End Sub



Sub CargaDatosWebServiceTransporte(IDTransportista As Int) As ResumableSub
	'DatosEnvioExpedicion.Initialize
	Dim Accion As String
	Dim lstRes As List
	lstRes.Initialize
	Dim ComandoJRDC As String
	ComandoJRDC="DatosWebServiceTransporte"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes, ComandoJRDC, Array As String(IDTransportista), Me)
	Wait For DatosJRDC_Completed (mresult As Map)
	If mresult.Get("ConnOK")=False Then
		Accion="NOK"
	Else
		If mresult.Get("ReqOK")=False Then
			Accion="NOK"
		Else
			lstRes=mresult.Get("lstRes")
			Accion="OK"
		End If
	End If
	Dim mRes As Map
	mRes.Initialize
	mRes.put("Accion",Accion)
	mRes.put("lstRes",lstRes)
	Return mRes
	'CallSubDelayed3(Me,"CargaDatosWebServiceTransporte_Completed",Accion, lstRes)
End Sub

'Sub OpcionesTrazabilidadExpedicionTXT(NumExpedicion As String)
'	Dialog.Title="Selecciona Acción"
'	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
'	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
'
'	Dim TextSize As Float = 18 'FLOAT
'	Dim xclv As CustomListView=B4XListDlg.CustomListView1
'	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_White
'	
'	Dim dlbl As Label=xclv.DesignerLabel
'	dlbl.TextSize=TextSize
'	
'	Dim lstOpciones As List
'	lstOpciones.Initialize
'	lstOpciones.Add("Anular Fase")
'	lstOpciones.Add("Editar Observaciones")
'	
'	Dim FaseSel As String=mData.Get("Fase")
'	
'	If FaseSel.ToUpperCase="EXPEDIDO" Then
'		lstOpciones.Add("Trazabilidad Transporte")
'	End If
'	
'	B4XListDlg.Options=lstOpciones
'	
'	Dim rs As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,80dip)
'	Next
'	
'	' OJO ... es un B4XView no Button
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	If bCancel.IsInitialized Then
'		'Log("bCancel" & bCancel.Text)
'		bCancel.Left=bCancel.Left-50dip
'		bCancel.Width=bCancel.Width+30dip
'		bCancel.TextSize=16
'	End If
'	
'	Wait For (rs) Complete (Result As Int)
'
'	Dim AccionFase As String=B4XListDlg.SelectedItem
'	
'	
'	Select AccionFase
'		Case "Trazabilidad Transporte"
'			TrazabilidadTransporte(mData)
'			
'		Case "Anular Fase"
'			AnularFase(mData)
'			
'		Case "Editar Observaciones"
'			EditarObservaciones(mData)
'		
'	End Select
'End Sub


Sub BuscarExpedicionDHLPorReferencia
	
	Dim cExpDHL As cInfoExpedicionDHL
	cExpDHL.Initialize
	cExpDHL.ActualizarInfoExpedicionDHL(mDocumentoSel)
End Sub




