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
'	Private sf As StringFunctions2
'	Private StatusBar1 As StatusBar
	Dim lblVersion As Label
	Dim lblProgress As Label
	
	Dim mSQL As SQL
	
	Private lstDocumentosExpedidos As List
	Private lstDocumentosExpedidosUnicos As List
	Private lstInfoDocumentos As List
	Private lstVendedores As List
	Private lstResponsablesCuenta As List
	Private lstContactosPedidos As List
	'Private lstPedidosVentaNoAbiertosPendientesContacto As List
	'Private lstPedidosVentaNoAbiertosPendientesComercial As List
	'Private lstPedidosPendientes As List
	Private Dialog As B4XDialog
'	Private InputDialog As B4XInputTemplate
	Private Base As B4XView
	Private DateTemplate As B4XDateTemplate
'	Private lstOpcionesInforme As B4XListTemplate
	Private btnFechaFinal As Button
	Private btnFechaInicial As Button
	Private lblTitleFechaFIn As Label
	Private lblTitleFechaIn As Label
	Private pnlFondoInformeExpediciones As Pane
	Private txtFechaInicial As TextField
	Private txtFechaFinal As TextField
	Private FechaInicial, FechaFinal As Long
	Private btnSalir As Button
	Private chkFechaUnica As CheckBox
	Private FechaUnica As Boolean
'	Private nReg As Int
'	Private clvDestinatarios As CustomListView
	Private btnActualizarInfo As Button
'	Private chkSeleccionarContacto As CheckBox
'	Private lblEmail As Label
'	Private lblNombre As Label
'	Private pnlFondoItemClvSeleccionarContacto As Pane
'	Private pnlFondoCLVDestinatarios As Pane
'	Private lblCodigo As Label
	Private pnlFondoDestinatarios As Pane
	Private tvDestinatarios As TableView
	Private btnSeleccionarTodosContactos As Button
	Private btnSeleccionarNingunContacto As Button
	Private CargandoDatos As Boolean
	Private btnGenerarInformesEmail As Button
	Private TipoDestinatarioInforme As String
	Private PeriodoInforme As String
	'Private SMTP As SMTP
	Private lstErrores As List
	Private cboTipoInforme As ComboBox
	Private CargandoItemsCboTipoInforme As Boolean
'	Private TipoInformeSeleccionado As String
	
	Private lstCamposInformeDocumentosExpedidosClientes As List
	Private lstCamposInformeDocumentosExpedidosComerciales As List
	Private lstCamposInformePedidosPendientesClientes As List
	Private lstCamposInformePedidosPendientesComerciales As List

	Private lblTipoInforme As Label
	Private txtEmailAlternativo As TextField
	Private lblInfoEmailAlternativo As Label
	Private EmProin As String
	Private EmProtec As String
	Private PasswProin As String
	Private PassProtec As String
	

	Private btnInformeErroresUltimoEnvio As B4XView
	
	Private jamCircularProgressBar1 As jamCircularProgressBar
	Private jamLoadingIndicator1 As JamLoadingIndicator
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	mSQL.InitializeSQLite("", ":memory:", True)
End Sub

Sub CreateRequest As DBRequestManager
	Dim req As DBRequestManager
	req.Initialize(Me, Main.rdclinkMySqlDatosComunes)
	Return req
End Sub

'Sub CreateRequestNav As DBRequestManager
'	Dim req As DBRequestManager
'	req.Initialize(Me, Main.rdcLinkNav)
'	Return req
'End Sub

Sub CreateCommand(name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = name
	If Parameters <> Null Then
		cmd.Parameters = Parameters
	End If
	'cmd.Parameters = Parameters
	Return cmd
End Sub


Sub Show

	
	frm.Initialize("frm",Main.xScreen, Main.yscreen)
	Dim joForm As JavaObject = frm
	Dim joStage As JavaObject = joForm.GetField("stage")
	joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrInformeExpediciones2")
	Sleep(0)
	
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)
		
	frm.Title=Main.PrefijoTitleForms &  "  " & "Expediciones Expediciones Cliente"
	
	lblInfoEmailAlternativo.MouseCursor= fx.cursors.Hand

'	#if Release
'	Dim rSub As ResumableSub=cmVerificarVersionActual.VerificarVersionActual(Main.rdclinkMySqlDatosComunes, Main.NombreAplicacion, Main.VersionActual)
'	Wait For(rSub) complete (mResp As Map)
'	Dim AccionVersionActual As String=mResp.get("Accion")
'	If AccionVersionActual<>"OK" Then
'		Dim msgErr As String=mResp.get("msgErr")
'		Dim msa As Object=xui.MsgboxAsync(msgErr,"Aviso")
'		Wait For (msa) Msgbox_Result
'		ExitApplication
'	End If
'	#end if
	
	'formUtilidades.Maximizar(frm)
	
	CargandoItemsCboTipoInforme=True
	cboTipoInforme.Value=""
	CargaItemsCbo
	Wait For CargaItemsCbo_Completed
	
	CargandoItemsCboTipoInforme=False
		
	lblTipoInforme.Visible=False
	cboTipoInforme.Visible=False
	
'	CreateStatusBar
	
'	DBUtils.DropTable(Main.sql,"tblDocumentosExpedidos")
'	Dim F As Map
'	F.Initialize
'	F.put("Documento",DBUtils.DB_TEXT)
'	F.put("FechaDocumento",DBUtils.DB_REAL)
'	F.put("PedidoCliente",DBUtils.DB_TEXT)
'	F.put("DocumentoExterno",DBUtils.DB_TEXT)
'	F.put("Cliente",DBUtils.DB_TEXT)
'	F.put("NombreCliente",DBUtils.DB_TEXT)
'	F.put("Contacto",DBUtils.DB_TEXT)
'	F.put("NombreContacto",DBUtils.DB_TEXT)
'	F.put("EmailContacto",DBUtils.DB_TEXT)
'	F.put("DirEnv",DBUtils.DB_TEXT)
'	F.put("NombreDirEnv",DBUtils.DB_TEXT)
'	F.put("Vendedor",DBUtils.DB_TEXT)
'	F.put("NombreVendedor",DBUtils.DB_TEXT)
'	F.put("EmailVendedor",DBUtils.DB_TEXT)
'	F.put("ResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("NombreResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("EmailResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("Linea",DBUtils.DB_REAL)
'	F.put("Almacen",DBUtils.DB_TEXT)
'	F.put("Articulo",DBUtils.DB_TEXT)
'	F.put("DescripcionArticulo",DBUtils.DB_TEXT)
'	F.put("Talla",DBUtils.DB_TEXT)
'	F.put("UM",DBUtils.DB_TEXT)
'	F.put("Qty",DBUtils.DB_REAL)
	''''	F.put("Precio",DBUtils.DB_REAL)
	''''	F.put("Dto",DBUtils.DB_REAL)
	''''	F.put("PrecioNeto",DBUtils.DB_REAL)
	''''	F.put("ImporteLinea",DBUtils.DB_REAL)
'	DBUtils.CreateTable(Main.SQL,"tblDocumentosExpedidos",F,"")
'	
'	DBUtils.DropTable(Main.sql,"tblPedidosPendientesContacto")
'	Dim F As Map
'	F.Initialize
'	F.put("Pedido",DBUtils.DB_TEXT)
'	F.put("FechaPedido",DBUtils.DB_REAL)
'	F.put("DocumentoExterno",DBUtils.DB_TEXT)
'	F.put("Cliente",DBUtils.DB_TEXT)
'	F.put("NombreCliente",DBUtils.DB_TEXT)
'	F.put("Contacto",DBUtils.DB_TEXT)
'	F.put("NombreContacto",DBUtils.DB_TEXT)
'	F.put("EmailContacto",DBUtils.DB_TEXT)
'	F.put("DirEnv",DBUtils.DB_TEXT)
'	F.put("NombreDirEnv",DBUtils.DB_TEXT)
'	F.put("Vendedor",DBUtils.DB_TEXT)
'	F.put("NombreVendedor",DBUtils.DB_TEXT)
'	F.put("EmailVendedor",DBUtils.DB_TEXT)
'	F.put("ResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("NombreResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("EmailResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("Linea",DBUtils.DB_REAL)
'	F.put("Almacen",DBUtils.DB_TEXT)
'	F.put("Articulo",DBUtils.DB_TEXT)
'	F.put("DescripcionArticulo",DBUtils.DB_TEXT)
'	F.put("Talla",DBUtils.DB_TEXT)
'	F.put("UM",DBUtils.DB_TEXT)
'	F.put("QtyPte",DBUtils.DB_REAL)
'	'''	F.put("Precio",DBUtils.DB_REAL)
'	'''	F.put("Dto",DBUtils.DB_REAL)
'	'''	F.put("PrecioNeto",DBUtils.DB_REAL)
'	'''	F.put("ImporteLinea",DBUtils.DB_REAL)
'	DBUtils.CreateTable(Main.SQL,"tblPedidosPendientesContacto",F,"")
'	
'	DBUtils.DropTable(Main.sql,"tblPedidosPendientesContacto")
'	Dim F As Map
'	F.Initialize
'	F.put("Pedido",DBUtils.DB_TEXT)
'	F.put("FechaPedido",DBUtils.DB_REAL)
'	F.put("DocumentoExterno",DBUtils.DB_TEXT)
'	F.put("Cliente",DBUtils.DB_TEXT)
'	F.put("NombreCliente",DBUtils.DB_TEXT)
'	F.put("Contacto",DBUtils.DB_TEXT)
'	F.put("NombreContacto",DBUtils.DB_TEXT)
'	F.put("EmailContacto",DBUtils.DB_TEXT)
'	F.put("DirEnv",DBUtils.DB_TEXT)
'	F.put("NombreDirEnv",DBUtils.DB_TEXT)
'	F.put("Vendedor",DBUtils.DB_TEXT)
'	F.put("NombreVendedor",DBUtils.DB_TEXT)
'	F.put("EmailVendedor",DBUtils.DB_TEXT)
'	F.put("ResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("NombreResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("EmailResponsableCuenta",DBUtils.DB_TEXT)
'	F.put("Linea",DBUtils.DB_REAL)
'	F.put("Almacen",DBUtils.DB_TEXT)
'	F.put("Articulo",DBUtils.DB_TEXT)
'	F.put("DescripcionArticulo",DBUtils.DB_TEXT)
'	F.put("Talla",DBUtils.DB_TEXT)
'	F.put("UM",DBUtils.DB_TEXT)
'	F.put("QtyPte",DBUtils.DB_REAL)
'	'''	F.put("Precio",DBUtils.DB_REAL)
'	'''	F.put("Dto",DBUtils.DB_REAL)
'	'''	F.put("PrecioNeto",DBUtils.DB_REAL)
'	'''	F.put("ImporteLinea",DBUtils.DB_REAL)
'	DBUtils.CreateTable(Main.SQL,"tblPedidosPendientesContacto",F,"")
	
	DBUtils.DropTable(mSQL,"tblDestinatarios")
	Dim u As Map
	u.Initialize
	u.Put("ClienteProtec",DBUtils.DB_INTEGER)
	u.Put("Tipo",DBUtils.DB_TEXT)
	u.Put("Codigo",DBUtils.DB_TEXT)
	u.Put("Nombre",DBUtils.DB_TEXT)
	u.Put("Email",DBUtils.DB_TEXT)
	u.Put("Cliente",DBUtils.DB_TEXT)
	u.Put("NombreCliente",DBUtils.DB_TEXT)
	u.Put("NombreResponsableCuenta",DBUtils.DB_TEXT)
	u.Put("Seleccionado",DBUtils.DB_INTEGER)
	'u.Put("EmailAlternativo",DBUtils.DB_TEXT)
	u.Put("EnviadoEmail",DBUtils.DB_INTEGER)
	'u.Put("FicheroExcel",DBUtils.DB_TEXT)
	DBUtils.CreateTable(mSQL,"tblDestinatarios",u,"")
	'Main.ListTablasUsadasEnModulo.Add("tblDestinatarios")
	
	'tvDestinatarios.Style="table-view;"
	
	tvDestinatarios.SetColumns(Array As String("Seleccionado","Nombre","Email", "Email Enviado"))
	'tvDestinatarios.SetColumns(Array As String("Seleccionado","Nombre","Email","Email Alternativo", "Email Enviado"))
	
	tvDestinatarios.SetColumnWidth(0,100)
	tvDestinatarios.SetColumnWidth(1,200)
	tvDestinatarios.SetColumnWidth(2,420)
	tvDestinatarios.SetColumnWidth(3,100)
	'tvDestinatarios.SetColumnWidth(3,420)
	'tvDestinatarios.SetColumnWidth(4,100)
	
	lstCamposInformeDocumentosExpedidosClientes.Initialize
	lstCamposInformeDocumentosExpedidosClientes.AddAll(Array As String("Documento","FechaDocumento","Pedido", "PedidoCliente","NombreCliente", _
		"Ciudad", "NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","Cantidad","UM"))
	
	lstCamposInformePedidosPendientesClientes.Initialize
	lstCamposInformePedidosPendientesClientes.AddAll(Array As String("Pedido","FechaPedido","Pedido","PedidoCliente","NombreCliente", _
		"Ciudad", "NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","Cantidad","UM"))
		
	lstCamposInformeDocumentosExpedidosComerciales.Initialize
	lstCamposInformeDocumentosExpedidosComerciales.AddAll(Array As String("Documento","Fecha", "PedidoCliente","NombreCliente", _
		"NombreDireccionEnvio","Ciudad","NombreResponsableCuenta", "EmailResponsableCuenta", "Articulo","Descripcion","Talla","Cantidad","UM"))
	
	lstCamposInformePedidosPendientesComerciales.Initialize
	lstCamposInformePedidosPendientesComerciales.AddAll(Array As String("Documento","FechaDocumento","NombreCliente", "PedidoCliente", _
		"Ciudad", "NombreResponsableCuenta","EmailResponsableCuenta","Articulo","Descripcion","Talla","CantidadPte","UM"))
	
	DateTime.DateFormat="dd/MM/yyyy"
	chkFechaUnica.Checked=True
	Base = frm.RootPane
	Dialog.Initialize (Base)
	Dialog.BlurBackground=False
	'Dialog.BackgroundColor=0xFFFF7F50
	Dialog.Title = "Fechas Informe"
	
	
	InicializarCalendario
	pnlFondoDestinatarios.Visible=False
	'pnlFondoCLVDestinatarios.LoadLayout("scrCLVDestinatarios")
	
	wait for (LoadCred) complete (rBool As Boolean)
	If rBool=False Then
		ExitApplication
		Return
	End If
	
	frm.Show

End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub

Sub LoadCred As ResumableSub
	Dim Comando As String="ConfigNoReply"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Return False
	Else
		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay datos config. email.","Aviso")
			Wait For (msa) Msgbox_Result
			Return False
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			For Each mData As Map In lstReg
				Dim Emp As String=mData.Get("Empresa")
				Select Emp
					Case "PROIN"
						EmProin=mData.Get("Cuenta")
						PasswProin=mData.Get("Passw")
					Case "PROTEC"
						EmProtec=mData.Get("Cuenta")
						PassProtec=mData.Get("Passw")
				End Select
			Next
			Return True
		End If
	End If
End Sub

Sub CargaItemsCbo
	cboTipoInforme.Items.AddAll(Array As String("","Clientes", "Comerciales"))
	cboTipoInforme.Value=""
	CallSubDelayed(Me,"CargaItemsCbo_Completed")
End Sub

'Sub CreateStatusBar
'	'add the status bar at the bottom
'	StatusBar1.Initialize("StatusBar1")
'	frm.RootPane.AddNode(StatusBar1, 0, frm.RootPane.PrefHeight-StatusBar1.Height, -1, -1)
'	frm.RootPane.SetAnchors(StatusBar1, 0, -1, 0, 0) 'anchor it to the bottom
'	'StatusBar1.Text = "Expediciones V" & Main.VersionActual
'	StatusBar1.Progress = 0  '(0-1)
'	'''	'add two buttons with separators to the status bar
'	'''	Dim b1, b2 As Button
'	'''	b1.Initialize("b1")
'	'''	b1.Text = "Reset Layout"
'	'''	b2.Initialize("b2")
'	'''	b2.Text = "B2"
'	lblVersion.Initialize("")
'	lblProgress.Initialize("")
'	Dim sep1, sep2 As Separator
'	sep1.Initialize("")
'	sep2.Initialize("")
'	StatusBar1.LeftItems.AddAll(Array(lblVersion, sep1, lblProgress, sep2))
'	lblVersion.Text = "Expediciones V" & Main.VersionActual
'End Sub

Sub InicializarCalendario
	DateTemplate.Initialize
	DateTemplate.MinYear = 2018
	DateTemplate.MaxYear = 2050
	DateTemplate.FirstDay=1
	DateTemplate.Date=DateTime.Now
End Sub


Sub btnFechaInicial_Click
	SeleccionFecha("Inicial")
End Sub

Sub btnFechaFinal_Click
	SeleccionFecha("Final")
End Sub

Sub SeleccionFecha(Tipo As String)
	Dialog.Title = "Fechas Informe"
	InicializarCalendario
	Wait For (Dialog.ShowTemplate(DateTemplate, "OK", "", "Cancel")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		'''btnDate.xLBL.Text = DateTime.Date(DateTemplate.Date)
		Select True
			Case Tipo="Inicial"
				If FechaFinal>0 And FechaUnica=False Then
					If DateTemplate.Date>FechaFinal Then
						Dim msa As Object=xui.MsgboxAsync("La fecha inicial no puede ser posterior a la fecha final","Aviso")
						Wait For (msa) Msgbox_Result
						Return
					End If
				End If
				FechaInicial=DateTemplate.Date
				Log("fecha Inicial: " & CRLF & FechaInicial)
				txtFechaInicial.Text=DateTime.Date(DateTemplate.Date)
				If FechaUnica Then
					Dim SetD As Long= DateUtils.SetDateAndTime(DateTime.GetYear(FechaInicial),DateTime.GetMonth(FechaInicial),DateTime.GetDayOfMonth(FechaInicial),23,59,59)
					FechaFinal=SetD
					txtFechaFinal.Text=txtFechaInicial.text
					Log("Fecha Final: " & CRLF &  FechaFinal)
				End If

			Case Tipo="Final"
				If FechaInicial>0 And FechaUnica=False Then
					If DateTemplate.Date<FechaInicial Then
						Dim msa As Object=xui.MsgboxAsync("La fecha final no puede ser anterior a la fecha final","Aviso")
						Wait For (msa) Msgbox_Result
						Return
					End If
				End If
				'FechaFinal=DateTime.DateParse(DateTime.Date(DateTemplate.Date))+DateTime.TicksPerDay ' ticksperday ... para obtener las 24h de la fecha final
				Dim SetD As Long= DateUtils.SetDateAndTime(DateTime.GetYear(DateTemplate.Date),DateTime.GetMonth(DateTemplate.Date),DateTime.GetDayOfMonth(DateTemplate.Date),23,59,59)
				FechaFinal=SetD
				Log("Fecha Final: " & CRLF &  FechaFinal)
				txtFechaFinal.Text=DateTime.Date(FechaFinal)
				If FechaUnica Then
					FechaInicial=DateUtils.SetDateAndTime(DateTime.GetYear(FechaFinal),DateTime.GetMonth(FechaFinal),DateTime.GetDayOfMonth(FechaFinal),0,0,0)
					txtFechaInicial.Text=txtFechaFinal.text
					Log("fecha Inicial: " & CRLF & FechaInicial)
				End If
		End Select
	End If
End Sub

Sub chkFechaUnica_CheckedChange(Checked As Boolean)
	If CargandoDatos Then Return
	FechaUnica=Checked
	If FechaUnica Then
		If FechaInicial>0 Then
			FechaFinal=FechaInicial+DateTime.TicksPerDay
			txtFechaFinal.Text=txtFechaInicial.text
		Else
			If FechaFinal>0 Then
				FechaInicial=FechaFinal-DateTime.TicksPerDay
				txtFechaInicial.Text=txtFechaFinal.text
			End If
		End If
	End If
	Log("fecha Inicial: " & CRLF & FechaInicial)
	Log("Fecha Final: " & CRLF &  FechaFinal)
End Sub

Sub btnActualizarInfo_Click

	
		
	lblTipoInforme.Visible=False
	cboTipoInforme.Visible=False
	
	pnlFondoDestinatarios.Visible=False
	'clvDestinatarios.Clear
	If FechaFinal=0 And FechaInicial=0 Then
		Dim msa As Object=xui.MsgboxAsync("Indica Fecha Inicial y Fecha Final","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If FechaFinal=0 And FechaInicial<>0 Then
		Dim msa As Object=xui.MsgboxAsync("Indica Fecha Final","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If FechaFinal<>0 And FechaInicial=0 Then
		Dim msa As Object=xui.MsgboxAsync("Indica Fecha Inicial","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	If DateTime.Date(FechaInicial)=DateTime.date(FechaFinal) Then
		'PeriodoInforme=sf.Stuff(txtFechaFinal.Text,"-","/")
		PeriodoInforme=txtFechaFinal.Text.Replace("/","-")
	Else
		'PeriodoInforme=sf.Stuff("Periodo " & txtFechaFinal.Text & " a " & txtFechaFinal.Text,"-","/")
		PeriodoInforme="Periodo " & txtFechaFinal.Text.Replace("/","-") & " a " & txtFechaFinal.Text.Replace("/","-")
	End If
	
	CargandoItemsCboTipoInforme=True
	cboTipoInforme.Value=""
	
'	ActualizarInfoDocumentosExpedidos
'	Wait For ActualizarInfoDocumentosExpedidos_Completed
	
	lstDocumentosExpedidos.Initialize
	lstDocumentosExpedidosUnicos.Initialize
	lstInfoDocumentos.Initialize
	Log("inicio CargaDocumentosExpedidosPeriodoTransporteExterno")
	Wait For (CargaDocumentosExpedidosPeriodoTransporteExterno(FechaInicial,FechaFinal)) complete (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error en query DocumentosExpedidosPeriodoTransporteExterno /Conexion servidor ","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Log("fin CargaDocumentosExpedidosPeriodoTransporteExterno")
	Log("inicio CargaDocumentosAsignadosARepartoPeriodo")
	Wait For (CargaDocumentosAsignadosARepartoPeriodo(FechaInicial,FechaFinal)) complete (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error en query DocumentosAsignadosARepartoPeriodo /Conexion servidor ","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If
	Log("fin CargaDocumentosAsignadosARepartoPeriodo")
	Log("fin carga docs")
	DateTime.DateFormat="dd/MM/yyyy"
	If lstDocumentosExpedidos.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay documentos expedidos/asignados a reparto en el periodo seleccionado","Aviso")
		Wait For (msa) Msgbox_Result
	Else
		lblTipoInforme.Visible=True
		cboTipoInforme.Visible=True
	End If
	CargandoItemsCboTipoInforme=False
	
End Sub

'Sub ActualizarInfoDocumentosExpedidos As ResumableSub
'	lstDocumentosExpedidos.Initialize
'	lstDocumentosExpedidosUnicos.Initialize
'	lstInfoDocumentos.Initialize
'
'	Wait For (CargaDocumentosExpedidosPeriodoTransporteExterno(FechaInicial,FechaFinal)) complete (mresult As Map)
'	
'	Wait For (CargaDocumentosAsignadosARepartoPeriodo(FechaInicial,FechaFinal)) complete (mresult As Map)
'	
'	DateTime.DateFormat="dd/MM/yyyy"
'	If lstDocumentosExpedidos.Size=0 Then
'		Dim msa As Object=xui.MsgboxAsync("No hay documentos expedidos/asignados a reparto en el periodo seleccionado","Aviso")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	
'	lblTipoInforme.Visible=True
'	cboTipoInforme.Visible=True
'	
'	CallSubDelayed(Me,"ActualizarInfoDocumentosExpedidos_Completed")
'End Sub

'Sub DocumentosExpedidosPeriodoTransporteExterno
'	'nReg=0
'	Wait For (CargaDocumentosExpedidosPeriodoTransporteExterno(FechaInicial,FechaFinal)) complete (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		
'	Else
'		If mresult.Get("ReqOK")=False Then
'			
'		Else
'			
'		End If
'	End If
'	CallSubDelayed(Me,"DocumentosExpedidosPeriodoTransporteExterno_Completed")
'End Sub

public Sub CargaDocumentosExpedidosPeriodoTransporteExterno(FechIn As Long, FechFin As Long) As ResumableSub
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("ReqOK",False)
	frm.RootPane.MouseCursor = fx.Cursors.WAIT
	Dim Req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("DocumentosExpedidosPeriodoTransporteExterno",Array(FechIn,FechFin))
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		m.Put("ConnOK",True)
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			jamLoadingIndicator1.show
			For Each records() As Object In res.Rows
				Dim mDoc As Map
				mDoc.Initialize
				For i=0 To  res.Columns.Size-1
					'Log(res.Columns.GetKeyAt(i))
					'mDoc.Put(res.Columns.GetKeyAt(i),sf.Upper(records(i)))
					'Log(res.Columns.GetKeyAt(i) & ": " & records(i))
					
					Dim sVal As String=records(i)
					'mDoc.Put(res.Columns.GetKeyAt(i),sf.Upper(records(i)))
					mDoc.Put(res.Columns.GetKeyAt(i),sVal.ToUpperCase)
				Next
				lstDocumentosExpedidos.Add(mDoc)
				If lstDocumentosExpedidosUnicos.IndexOf(mDoc.Get("Documento"))=-1 Then
					lstDocumentosExpedidosUnicos.Add(mDoc.Get("Documento"))
				End If
				Log("Doc tte externo: " & mDoc.Get("Documento"))
				'lblProgress.Text="Documentos Expedidos Transporte Externo y Asignados a Reparto: " & lstDocumentosExpedidosUnicos.Size
				jamLoadingIndicator1.MensajeLoading="Documentos Expedidos Transporte Externo y Asignados a Reparto: " & lstDocumentosExpedidosUnicos.Size
			Next
			jamLoadingIndicator1.Close
		Else
			
		End If
	Else
		
	End If
	j.Release
	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
	Return m
End Sub

'Sub DocumentosAsignadosARepartoPeriodo
'	Wait For (CargaDocumentosAsignadosARepartoPeriodo(FechaInicial,FechaFinal)) complete (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		
'	Else
'		If mresult.Get("ReqOK")=False Then
'			
'		Else
'			
'		End If
'	End If
'	CallSubDelayed(Me,"DocumentosAsignadosARepartoPeriodo_Completed")
'End Sub

public Sub CargaDocumentosAsignadosARepartoPeriodo(FechIn As Long, FechFin As Long) As ResumableSub
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("ReqOK",False)
	frm.RootPane.MouseCursor = fx.Cursors.WAIT
	Dim Req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("DocumentosAsignadosARepartoPeriodo",Array(FechIn,FechFin))
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		m.Put("ConnOK",True)
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			jamLoadingIndicator1.Show
			For Each records() As Object In res.Rows
				Dim mDoc As Map
				mDoc.Initialize
				For i=0 To  res.Columns.Size-1
					'Log(res.Columns.GetKeyAt(i))
					Dim sVal As String=records(i)
					'mDoc.Put(res.Columns.GetKeyAt(i),sf.Upper(records(i)))
					mDoc.Put(res.Columns.GetKeyAt(i),sVal.ToUpperCase)
					'Log(res.Columns.GetKeyAt(i) & ": " & records(i))
				Next
				lstDocumentosExpedidos.Add(mDoc)
				If lstDocumentosExpedidosUnicos.IndexOf(mDoc.Get("Documento"))=-1 Then
					lstDocumentosExpedidosUnicos.Add(mDoc.Get("Documento"))
				End If
				Log("Doc Reparto: " &  mDoc.Get("Documento"))
				'lblProgress.Text="Documentos Expedidos Transporte Externo y Asignados a Reparto: " & lstDocumentosExpedidosUnicos.Size
				jamLoadingIndicator1.MensajeLoading="Documentos Expedidos Transporte Externo y Asignados a Reparto: " & lstDocumentosExpedidosUnicos.Size
			Next
			jamLoadingIndicator1.Close
		Else
			
		End If
	Else
		
	End If
	j.Release
	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
	Return m
End Sub



Sub InformeClientes
	lstInfoDocumentos.Initialize
	'For i=0 To lstDocumentosExpedidos.Size-1
	Dim Cont As Int=1
	'For i=0 To lstDocumentosExpedidosUnicos.Size-1
'	For Each Doc As String In lstDocumentosExpedidosUnicos
'		Log("Rev prev Docs " & Doc)
'	Next

	jamLoadingIndicator1.Show
	
	For Each Doc As String In lstDocumentosExpedidosUnicos
		
		'StatusBar1.Progress=(i+1)/lstDocumentosExpedidos.Size
		'StatusBar1.Progress=(i+1)/lstDocumentosExpedidosUnicos.Size
		'StatusBar1.Progress=Cont/lstDocumentosExpedidosUnicos.Size
		'lblProgress.Text="Analizando Documento " & (i+1) & " de " & lstDocumentosExpedidos.Size
		'lblProgress.Text="Analizando Documento " & (i+1) & " de " & lstDocumentosExpedidosUnicos.Size
		'lblProgress.Text="Analizando Documento " & Cont & " de " & lstDocumentosExpedidosUnicos.Size
		jamLoadingIndicator1.MensajeLoading="Analizando Documento " & Cont & " de " & lstDocumentosExpedidosUnicos.Size
		'Dim m As Map=lstDocumentosExpedidos.Get(i)
		'Dim Doc As String=lstDocumentosExpedidosUnicos.Get(i)
		'Log("Documento único " & (i+1) & " " & Doc)
		Log("Documento único " & Cont & " " & Doc)
		'If sf.Len(m.Get("Documento"))>4 Then
		'Dim Doc As String=m.Get("Documento")
		'If sf.Left(m.Get("Documento"),4)="ALBV" Then
		Doc=Doc.ToUpperCase
		If Doc.StartsWith("ALBV") Then
			Log("DatosNAVDocumentoInformeClientes " & Doc)
'				DatosNAVDocumentoInformeClientes(sf.Upper(m.Get("Documento")))
'				Wait For DatosNAVDocumentoInformeClientes_Completed
'			CargaDatosNAVDocumentoInformeClientes(Doc)
'			Wait For CargaDatosNAVDocumentoInformeClientes_Completed
			Dim rSub As ResumableSub=CargaDatosNAVDocumentoInformeClientes(Doc)
			Wait For (rSub) complete (rObj As Object)
		End If
		'End If
		Cont=Cont+1
	Next
'	StatusBar1.Progress=0
'	lblProgress.Text=""
	jamLoadingIndicator1.Close

	If lstInfoDocumentos.Size>0 Then
		wait for (AnalisisDestinatarios) complete (rObj As Object)
	Else
		Dim msa As Object=xui.MsgboxAsync("No hay documentos para generar informe de expediciones-pedidos pendientes","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
End Sub

'Sub DatosNAVDocumentoInformeClientes(Doc As String)
'	Wait For (CargaDatosNAVDocumentoInformeClientes(Doc)) complete (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		
'	Else
'		If mresult.Get("ReqOK")=False Then
'			
'		Else
'			
'		End If
'	End If
'	CallSubDelayed(Me,"DatosNAVDocumentoInformeClientes_Completed")
'End Sub

'public Sub CargaDatosNAVDocumentoInformeClientes(Doc As String) As ResumableSub
public Sub CargaDatosNAVDocumentoInformeClientes(Doc As String)  As ResumableSub
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("ReqOK",False)
	frm.RootPane.MouseCursor = fx.Cursors.WAIT
	Dim Req As DBRequestManager = CreateRequestNav
	Dim cmd As DBCommand = CreateCommand("InfoDocInformeExpediciones",Array(Doc))
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		m.Put("ConnOK",True)
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			For Each records() As Object In res.Rows
				Dim mDoc As Map
				mDoc.Initialize
				For i=0 To  res.Columns.Size-1
					'Log(res.Columns.GetKeyAt(i))
					mDoc.Put(res.Columns.GetKeyAt(i),records(i))
					'Log(res.Columns.GetKeyAt(i) & ": " & records(i))
				Next

				lstInfoDocumentos.Add(mDoc)
				Log (mDoc)
			Next
		Else
			Log("Documento sin info " & Doc)
		End If
	Else
		
	End If
	j.Release
	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
	Return Null
	'CallSubDelayed(Me,"CargaDatosNAVDocumentoInformeClientes_Completed")
End Sub

Sub InformeComerciales
	lstInfoDocumentos.Initialize
	'For i=0 To lstDocumentosExpedidos.Size-1
'	jamCircularProgressBar1.Value=0
'	jamCircularProgressBar1.Visible=True
	jamLoadingIndicator1.Show
	For i=0 To lstDocumentosExpedidosUnicos.Size-1
		'StatusBar1.Progress=(i+1)/lstDocumentosExpedidos.Size
		'StatusBar1.Progress=(i+1)/lstDocumentosExpedidosUnicos.Size
		jamLoadingIndicator1.MensajeLoading="Analizando Documento " & (i+1) & " de " & lstDocumentosExpedidosUnicos.Size
		'lblProgress.Text="Analizando Documento " & (i+1) & " de " & lstDocumentosExpedidos.Size
		'lblProgress.Text="Analizando Documento " & (i+1) & " de " & lstDocumentosExpedidosUnicos.Size
		'Dim m As Map=lstDocumentosExpedidos.Get(i)
		Dim Doc As String=lstDocumentosExpedidosUnicos.Get(i)
		'If sf.Len(m.Get("Documento"))>4 Then
		'If sf.Left(m.Get("Documento"),4)="ALBV" Then
		If Doc.StartsWith("ALBV") Then
			'Log("Solicitando Info NAV " & sf.Upper(m.Get("Documento")) & ": " & DateTime.Date(DateTime.Now))
			'DatosNAVDocumentoInformeComerciales(sf.Upper(m.Get("Documento")),"ALBV")
'				DatosNAVDocumentoInformeComerciales(Doc.ToUpperCase,"ALBV")
'				Wait For DatosNAVDocumentoInformeComerciales_Completed
				
			Wait For(CargaDatosNAVDocumentoInformeComerciales(Doc.ToUpperCase,"ALBV")) complete (mResult As Map)
			'Log("Bajada Info NAV " & sf.Upper(m.Get("Documento")) & ": " & DateTime.Date(DateTime.Now))
		End If
		'If sf.Left(m.Get("Documento"),2)="RT" Then
		If Doc.StartsWith("RT") Then
			'Log("Solicitando Info NAV " & sf.Upper(m.Get("Documento")) & ": " & DateTime.Date(DateTime.Now))
			'DatosNAVDocumentoInformeComerciales(sf.Upper(m.Get("Documento")),"RT")
'				DatosNAVDocumentoInformeComerciales(Doc.ToUpperCase,"RT")
'				Wait For DatosNAVDocumentoInformeComerciales_Completed
			Wait For(CargaDatosNAVDocumentoInformeComerciales(Doc.ToUpperCase,"RT")) complete (mResult As Map)
			'Log("Bajada Info NAV " & sf.Upper(m.Get("Documento")) & ": " & DateTime.Date(DateTime.Now))
		End If
		'End If
	Next
'	StatusBar1.Progress=0
'	lblProgress.Text=""
'	jamCircularProgressBar1.Value=0
'	jamCircularProgressBar1.Visible=False
	jamLoadingIndicator1.Close
	If lstInfoDocumentos.Size>0 Then
		wait for (AnalisisDestinatarios) complete (rObj As Object)
	Else
		Dim msa As Object=xui.MsgboxAsync("No hay documentos para generar informe de expediciones-pedidos pendientes","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
End Sub

'Sub DatosNAVDocumentoInformeComerciales(Doc As String, Tipo As String)
'	Wait For (CargaDatosNAVDocumentoInformeComerciales(Doc, Tipo)) complete (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexión / query, descargando info de documento " & Doc ,"Error!")
'		Wait For (msa) Msgbox_Result
'		Return
'	Else
'		If mresult.Get("ReqOK")=False Then
'			
'		Else
'			
'		End If
'	End If
'	CallSubDelayed(Me,"DatosNAVDocumentoInformeComerciales_Completed")
'End Sub

public Sub CargaDatosNAVDocumentoInformeComerciales(Doc As String, Tipo As String) As ResumableSub
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("ReqOK",False)
	frm.RootPane.MouseCursor = fx.Cursors.WAIT
	Dim Req As DBRequestManager = CreateRequestNav
	Select True
		Case Tipo="ALBV"
			Dim cmd As DBCommand = CreateCommand("AlbaranVentaInformeExpedicionComerciales",Array(Doc))
		Case Tipo="RT"
			Dim cmd As DBCommand = CreateCommand("RTInformeExpedicionComerciales",Array(Doc))
	End Select
	
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		m.Put("ConnOK",True)
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			For Each records() As Object In res.Rows
				Dim mDoc As Map
				mDoc.Initialize
				For i=0 To  res.Columns.Size-1
					'Log(res.Columns.GetKeyAt(i))
					mDoc.Put(res.Columns.GetKeyAt(i),records(i))
					Log(res.Columns.GetKeyAt(i) & ": " & records(i))
				Next
				lstInfoDocumentos.Add(mDoc)
			Next
		Else
			
		End If
	Else
		
	End If
	j.Release
	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
	Return m
End Sub

'Sub CargaTiposArticulos As ResumableSub
'	Dim ReqOK As Boolean
'	frm.RootPane.MouseCursor = fx.Cursors.WAIT
'	Dim Req As DBRequestManager = CreateRequest
'	Dim cmd As DBCommand = CreateCommand("TiposArticulo",Null)
'	Main.SQLRent.ExecNonQuery("delete from tblTiposArticulo")
'	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
'	If j.Success Then
'		Req.HandleJobAsync(j, "req")
'		Wait For (Req) req_Result(res As DBResult)
'		If res.Rows.Size>0 Then
'			For Each records() As Object In res.Rows
'				Main.SQL.AddNonQueryToBatch("insert into tblTiposArticulo (IDTipoArticulo, NombreTipoArticulo) values (?,?)", _
'				Array(records(res.Columns.Get("IDTipoArticulo")),records(res.Columns.Get("NombreTipoArticulo"))))
'			Next
'		End If
'		Dim SenderFilter As Object = Main.sql.ExecNonQueryBatch("SQL")
'		Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
'		Log("NonQuery: " & Success)
'		ReqOK=True
'	Else
'		fx.Msgbox(frm,"ERROR: " & j.ErrorMessage,"Error")
'	End If
'	j.Release
'	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
'	Return ReqOK
'End Sub

'Sub AnalisisDestinatarios
'	lstVendedores.Initialize
'	lstResponsablesCuenta.Initialize
'	lstContactosPedidos.Initialize
'	For i=0 To lstInfoDocumentos.Size-1
'		Dim mL As Map=lstInfoDocumentos.Get(i)
'		Dim Flag As Boolean
'		For j=0 To lstVendedores.Size-1
'			Dim mV As Map=lstVendedores.Get(j)
'			If mV.Get("Vendedor")=
'		Next
'		Dim m As Map
'		m.Initialize
'		m.put("Vendedor",mL.Get("Vendedor"))
'		m.put("NombreVendedor",mL.Get("NombreVendedor"))
'		m.put("EmailVendedor",mL.Get("EmailVendedor"))
'		If lstVendedores.IndexOf(m)=-1 Then
'			Log("Vendedor: " & m)
'			lstVendedores.Add(m)
'		End If
'		Dim m As Map
'		m.Initialize
'		m.put("ResponsableCuenta",mL.Get("ResponsableCuenta"))
'		m.put("NombreResponsableCuenta",mL.Get("NombreResponsableCuenta"))
'		m.put("EmailResponsableCuenta",mL.Get("EmailResponsableCuenta"))
'		If lstResponsablesCuenta.IndexOf(m)=-1 Then
'			lstResponsablesCuenta.Add(m)
'			Log("Resp Cuenta : " & m)
'		End If
'		
'		If lstContactosPedidos.IndexOf(mL.Get("Email"))=-1 Then
'			lstContactosPedidos.Add(mL.Get("Email"))
'			Log("Contacto :" & mL.Get("Email"))
'		End If
'	Next
'End Sub

Sub AnalisisDestinatarios As ResumableSub
	jamLoadingIndicator1.Show
	
	'lblProgress.Text="Analizando Destinatarios Email"
	lstVendedores.Initialize
	lstResponsablesCuenta.Initialize
	lstContactosPedidos.Initialize

	For i=0 To lstInfoDocumentos.Size-1
		
		'StatusBar1.Progress=(i+1)/lstInfoDocumentos.Size
		jamLoadingIndicator1.MensajeLoading="Analizando Destinatarios Email " & (((i+1)/lstInfoDocumentos.Size)*100) & "%"
		Dim V As Vendedor
		Dim R As ResponsableCuenta
		Dim C As ContactoCliente
		
		Dim mL As Map=lstInfoDocumentos.Get(i)
		V.Initialize
		V.Codigo=mL.Get("Comercial")
		V.Nombre=mL.Get("NombreComercial")
		V.Email=mL.Get("EmailComercial")
		V.Email=V.Email.ToLowerCase
		
		Dim FlagEnLista As Boolean
		For j=0 To lstVendedores.Size-1
			Dim vList As Vendedor=lstVendedores.Get(j)
			If vList.Codigo=V.Codigo Then
				FlagEnLista=True
				Exit
			End If
		Next
		If FlagEnLista=False Then
			lstVendedores.Add(V)
		End If
		
		R.Initialize
		R.Codigo=mL.Get("ResponsableCuenta")
		R.Nombre=mL.Get("NombreResponsableCuenta")
		R.Email=mL.Get("EmailResponsableCuenta")
		
		Dim FlagEnLista As Boolean
		For j=0 To lstResponsablesCuenta.Size-1
			Dim RList As ResponsableCuenta=lstResponsablesCuenta.Get(j)
			If RList.Codigo=R.Codigo Then
				FlagEnLista=True
				Exit
			End If
		Next
		If FlagEnLista=False Then
			lstResponsablesCuenta.Add(R)
		End If
		
		C.Initialize
		C.ClienteProtec=Utilidades.FixNullInt(mL.Get("ClienteProtec"))
		C.Codigo=mL.Get("Contacto")
		C.Nombre=mL.Get("NombreContacto")
		C.Email=mL.Get("EmailContacto")
		C.Email=C.Email.ToLowerCase
		C.Seleccionado=False
		C.Cliente=mL.Get("Cliente")
		C.NombreCliente=mL.Get("NombreCliente")
		C.NombreResponsableCuenta=mL.Get("NombreResponsableCuenta")
		
		Dim FlagEnLista As Boolean
		For j=0 To lstContactosPedidos.Size-1
			Dim cList As ContactoCliente=lstContactosPedidos.Get(j)
			If cList.Codigo=C.Codigo Then
				FlagEnLista=True
				Exit
			End If
		Next
		If FlagEnLista=False Then
			lstContactosPedidos.Add(C)
		End If
	Next
'	StatusBar1.Progress=0
'	lblProgress.Text="Proceso Finalizado."
'	jamCircularProgressBar1.Value=0
'	jamCircularProgressBar1.Visible=False
	jamLoadingIndicator1.Close
	Select True
		Case TipoDestinatarioInforme="Clientes"
			If lstContactosPedidos.Size=0 Then
				Dim msa As Object=xui.MsgboxAsync("No hay contactos con direcciones de email para los documentos del periodo","Aviso")
				Wait For (msa) Msgbox_Result
				'Return
			Else
				wait for (ActualizarListaContactos) complete (rObj As Object)
			End If
		Case TipoDestinatarioInforme="Comerciales"
			If lstVendedores.Size=0 Then
				Dim msa As Object=xui.MsgboxAsync("No hay contactos de comercial con direcciones de email para los documentos del periodo","Aviso")
				Wait For (msa) Msgbox_Result
				'Return
			Else
				wait for (ActualizarListaContactos) complete (rObj As Object)
			End If
			
	End Select
	Return Null
End Sub

Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	frm.Close
	MainMenu2.Show
End Sub

Sub ActualizarListaContactos As ResumableSub
	'clvDestinatarios.Clear
	tvDestinatarios.Items.Clear
	mSQL.ExecNonQuery("delete from tblDestinatarios")
	Select True
		Case TipoDestinatarioInforme="Clientes"
			For i=0 To lstContactosPedidos.Size-1
				Dim cCli As ContactoCliente=lstContactosPedidos.Get(i)
				mSQL.AddNonQueryToBatch("insert into tblDestinatarios (ClienteProtec,Tipo, Codigo, Nombre, Email, Seleccionado, EnviadoEmail, Cliente, NombreCliente, NombreResponsableCuenta) values (?,?,?,?,?,?,?,?,?,?)", _
					Array As Object(cCli.ClienteProtec, "Cliente",cCli.Codigo,cCli.Nombre,cCli.Email,cCli.Seleccionado,0, cCli.Cliente, cCli.NombreCliente, cCli.NombreResponsableCuenta))
				'AddCLVItemContactoCliente(cCli)
			Next
			Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
			Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
			Log("NonQuery: " & Success)
			
		Case TipoDestinatarioInforme="Comerciales"
			For i=0 To lstVendedores.Size-1
				Dim cVend As Vendedor=lstVendedores.Get(i)
				mSQL.AddNonQueryToBatch("insert into tblDestinatarios (ClienteProtec,Tipo, Codigo, Nombre, Email, Seleccionado, EnviadoEmail, Cliente, NombreCliente, NombreResponsableCuenta) values (?,?,?,?,?,?,?,?,?,?)", _
					Array As Object(0,"Comercial",cVend.Codigo,cVend.Nombre,cVend.Email,cVend.Seleccionado,0,"","",""))
				'AddCLVItemContactoComercial(cVend)
			Next
			Dim SenderFilter As Object = mSQL.ExecNonQueryBatch("SQL")
			Wait For (SenderFilter) SQL_NonQueryComplete (Success As Boolean)
			Log("NonQuery: " & Success)
	End Select
	CargandoDatos=True
	ActualizarTableViewDestinatarios
	Wait For ActualizarTableViewDestinatarios_Completed
	CargandoDatos=False
	pnlFondoDestinatarios.Visible=True
	Return Null
End Sub

'Sub AddCLVItemContactoCliente(DatosContacto As ContactoCliente)
'
'	Dim p As B4XView = xui.CreatePanel("")
'	
'
'	p.LoadLayout("scrSeleccionarContacto")
'	p.SetLayoutAnimated(0, 0, 0, clvDestinatarios.AsView.Width, 35dip)
'	
'	Dim su As StringUtils
'
'	'pnlFondoItemClvSeleccionarContacto.prefHeight=lblNombre.Top+lblNombre.Height+2dip
'	'p.Height=pnlFondoItemClvSeleccionarContacto.PrefHeight+5dip
'	Log("P.height="&p.Height)
'	lblCodigo.Text=DatosContacto.Codigo
'	lblNombre.Text=DatosContacto.Nombre
'	lblEmail.Text=DatosContacto.Email
'	chkSeleccionarContacto.Checked=DatosContacto.Seleccionado
'
'	clvDestinatarios.Add(p,DatosContacto)
'	Dim p2=clvDestinatarios.GetPanel(clvDestinatarios.Size-1) As Pane
'	Dim parent=p2.Parent As Pane
'	
'	pnlFondoCLVDestinatarios.PrefWidth=p.Width
'	Log("size in view: "&parent.height)
'	
'End Sub
'
'Sub AddCLVItemContactoComercial(DatosContacto As Vendedor)
'
'	Dim p As B4XView = xui.CreatePanel("")
'	
'
'	p.LoadLayout("scrSeleccionarContacto")
'	p.SetLayoutAnimated(0, 0, 0, clvDestinatarios.AsView.Width, 35dip)
'	
'	Dim su As StringUtils
'
'	'pnlFondoItemClvSeleccionarContacto.prefHeight=lblNombre.Top+lblNombre.Height+2dip
'	'p.Height=pnlFondoItemClvSeleccionarContacto.PrefHeight+5dip
'	Log("P.height="&p.Height)
'	lblCodigo.Text=DatosContacto.Codigo
'	lblNombre.Text=DatosContacto.Nombre
'	lblEmail.Text=DatosContacto.Email
'	chkSeleccionarContacto.Checked=DatosContacto.Seleccionado
'
'	clvDestinatarios.Add(p,DatosContacto)
'	Dim p2=clvDestinatarios.GetPanel(clvDestinatarios.Size-1) As Pane
'	Dim parent=p2.Parent As Pane
'	
'	pnlFondoCLVDestinatarios.PrefWidth=p.Width
'	Log("size in view: "&parent.height)
'	
'End Sub



Sub ActualizarTableViewDestinatarios
	tvDestinatarios.Items.Clear
	Dim rIDx As Int
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblDestinatarios")
	Do While rs.NextRow
		Dim Row() As Object=CrearFila(rIDx,rs.GetString("Codigo"),rs.GetString("Nombre"), rs.GetString("Email"),rs.GetInt("Seleccionado"), _
			 rs.GetInt("EnviadoEmail"))
		rIDx=rIDx+1
		tvDestinatarios.Items.Add(Row)
	Loop
	rs.Close
	Sleep(0)
	CallSubDelayed(Me,"ActualizarTableViewDestinatarios_Completed")
End Sub

Sub CrearFila(RowIndex As Int, Codigo As String, Nombre As String, Email As String,Sel As Int, EnvEmail As Int) As Object()
	Dim Fila(4) As Object
	
	Dim ap As AnchorPane
	ap.Initialize("")
	Dim ci As CellIndex
	ci.Initialize
	ci.Column=0
	ci.Row=RowIndex
	Dim chbSel As CheckBox
	chbSel.Initialize("chbSel")
	chbSel.Tag=ci
	'chbSel.Text=Sel
'	If DatosFila.Activo="No" Then
'		CSSUtils.SetStyleProperty(chbActivo,"-fx-text-fill","red")
'	Else
'		CSSUtils.SetStyleProperty(chbActivo,"-fx-text-fill","black")
'	End If
	CSSUtils.SetStyleProperty(chbSel,"-fx-text-fill","red")
	chbSel.Visible=True
	If Sel=0 Then
		chbSel.Checked=False
	Else
		chbSel.Checked=True
	End If
	ap.AddNode(chbSel,0,0,-1,-1)
	Dim jo1 = chbSel As JavaObject
	jo1.RunMethod("setAlignment", Array As Object("CENTER"))
	ap.FillHorizontally(chbSel, 0, 0)
	Fila(0)=ap
	
	Dim ap As AnchorPane
	ap.Initialize("")
	ap.Tag=Codigo
	Dim ci As CellIndex
	ci.Initialize
	ci.Column=0
	ci.Row=RowIndex
	Dim txtNombre As TextField
	txtNombre.Initialize("")
	txtNombre.Text=Nombre
	txtNombre.Tag=ci
	txtNombre.Editable=False
	ap.AddNode(txtNombre,0,0,-1,-1)
	ap.FillHorizontally(txtNombre, 0, 0)
	Dim jo1 = txtNombre As JavaObject
	jo1.RunMethod("setAlignment", Array As Object("BASELINE_LEFT"))
	Fila(1)=ap
	
	Dim ap As AnchorPane
	ap.Initialize("")
	ap.Tag=Codigo
	Dim ci As CellIndex
	ci.Initialize
	ci.Column=0
	ci.Row=RowIndex
	Dim txtEmail As TextField
	txtEmail.Initialize("")
	txtEmail.Text=Email
	txtEmail.Tag=ci
	txtEmail.Editable=False
	ap.AddNode(txtEmail,0,0,-1,-1)
	ap.FillHorizontally(txtEmail, 0, 0)
	Dim jo1 = txtEmail As JavaObject
	jo1.RunMethod("setAlignment", Array As Object("BASELINE_LEFT"))
	Fila(2)=ap
	
	
'	Dim ap As AnchorPane
'	ap.Initialize("")
'	ap.Tag=Codigo
'	Dim ci As CellIndex
'	ci.Initialize
'	ci.Column=0
'	ci.Row=RowIndex
'	Dim txtEmailAlt As TextField
'	txtEmailAlt.Initialize("txtEmailAlt")
'	txtEmailAlt.Text=EmailAlt
'	txtEmailAlt.Tag=ci
'	txtEmailAlt.Editable=False
'	ap.AddNode(txtEmailAlt,0,0,-1,-1)
'	ap.FillHorizontally(txtEmailAlt, 0, 0)
'	Dim jo1 = txtEmailAlt As JavaObject
'	jo1.RunMethod("setAlignment", Array As Object("BASELINE_LEFT"))
'	Fila(3)=ap
	
	Dim ap As AnchorPane
	ap.Initialize("")
	Dim ci As CellIndex
	ci.Initialize
	ci.Column=0
	ci.Row=RowIndex
	Dim chbEnviado As CheckBox
	chbEnviado.Initialize("")
	chbEnviado.Tag=ci
	CSSUtils.SetStyleProperty(chbEnviado,"-fx-text-fill","green")
	chbEnviado.Visible=True
	If EnvEmail=0 Then
		chbEnviado.Checked=False
	Else
		chbEnviado.Checked=True
	End If
	chbEnviado.Enabled=False
	ap.AddNode(chbEnviado,0,0,-1,-1)
	Dim jo1 = chbEnviado As JavaObject
	jo1.RunMethod("setAlignment", Array As Object("CENTER"))
	ap.FillHorizontally(chbEnviado, 0, 0)
	Fila(3)=ap

	Return Fila
End Sub

Sub btnSeleccionarTodosContactos_Click
	mSQL.ExecNonQuery("update tblDestinatarios set Seleccionado=1")
	CargandoDatos=True
	ActualizarTableViewDestinatarios
	Wait For ActualizarTableViewDestinatarios_Completed
	CargandoDatos=False
End Sub

Sub btnSeleccionarNingunContacto_Click
	mSQL.ExecNonQuery("update tblDestinatarios set Seleccionado=0")
	CargandoDatos=True
	ActualizarTableViewDestinatarios
	Wait For ActualizarTableViewDestinatarios_Completed
	CargandoDatos=False
End Sub

Sub chbSel_CheckedChange(Checked As Boolean)
	If CargandoDatos Then Return
	Dim chb As CheckBox=Sender
	Dim ci As CellIndex=chb.Tag
	Dim rIdx As Int=ci.Row
	Dim row() As Object=tvDestinatarios.Items.Get(rIdx)
	Dim p As AnchorPane=row(1)
	Dim Codigo As String=p.Tag
	Dim n As Int
	If Checked Then
		n=1
	Else
		n=0
	End If
	mSQL.ExecNonQuery2("update tblDestinatarios set Seleccionado=? where Codigo=?",Array As Object(n,Codigo))
End Sub

'Sub chbEnvAlt_CheckedChange(Checked As Boolean)
'	If CargandoDatos Then Return
'	Dim chb As CheckBox=Sender
'	Dim ci As CellIndex=chb.Tag
'	Dim rIdx As Int=ci.Row
'	Dim row() As Object=tvDestinatarios.Items.Get(rIdx)
'	Dim p As AnchorPane=row(1)
'	Dim Codigo As String=p.Tag
'	Dim n As Int
'	If Checked Then
'		n=1
'	Else
'		n=0
'	End If
'	Main.SQL.ExecNonQuery2("update tblDestinatarios set EnviarAlternativo=? where Codigo=?",Array As Object(n,Codigo))
'End Sub

Sub btnGenerarInformesEmail_Click
	
	If txtEmailAlternativo.Text<>"" Then
		If IsEmail(txtEmailAlternativo.Text)=False Then
			Dim msa As Object=xui.MsgboxAsync("La dirección de email " & txtEmailAlternativo.Text & " no es una dirección de email válida","Aviso")
			Wait For (msa) Msgbox_Result
			Return
		End If
	End If
	
	Dim sbAviso As StringBuilder
	sbAviso.Initialize
	sbAviso.Append("¿Enviar los informes para los destinatarios seleccionados?")
	If txtEmailAlternativo.Text<>"" Then
		sbAviso.Append(CRLF).append(CRLF).Append("Se ha indicado una dirección de email alternativo. Todos los informes seleccionados se enviarán a esa dirección, en lugar del destinatario correspondiente.")
	Else
		sbAviso.Append(CRLF).append(CRLF).Append("NO se ha indicado una dirección de email alternativo. Todos los informes seleccionados se enviarán al destinatario correspondiente.")
	End If
	
	Dim msa As Object=xui.Msgbox2Async(sbAviso.ToString, "Confirma:", "Sí", "", "No", Null)
	
	Wait For (msa) Msgbox_Result (Result As Int)
	If Result <> xui.DialogResponse_Positive Then
		Log("envío de informes cancelado")
		Return
	End If
	
	
	lblProgress.Text="Generando informes y enviando emails."
	lstErrores.Initialize
	Dim nContactosSeleccionadosSinEmail As Int=mSQL.ExecQuerySingleResult2("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email=?", _
		Array As Object(1,""))
	Dim nContactosSeleccionadosConEmail As Int=mSQL.ExecQuerySingleResult2("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email<>?", _
		Array As Object(1,""))
	If nContactosSeleccionadosConEmail=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay seleccionado ningún destinatario para el informe","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	' Comprobar si se intenta enviar un email a un contacto al que ya se le ha enviado el informe.
	
	Dim nContactosEmailEnviado As Int=mSQL.ExecQuerySingleResult2("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email=?", _
		Array As Object(1,""))
	
	
	If nContactosSeleccionadosSinEmail>0 Then
		Dim sb As StringBuilder
		sb.Initialize
		sb.Append("Hay contactos seleccionados sin dirección de email.")
		sb.Append(CRLF).Append(CRLF)
		sb.Append("¿Continuar sin enviar informe a estos contactos?")
		sb.Append(CRLF).Append(CRLF)
		sb.Append("(Puedes cancelar esta acción, configurar la dirección de email en navision, y volver a lanzar el informe.)")
		Dim msa As Object=xui.Msgbox2Async(sb.ToString,"Aviso","Sí","Cancelar","",Null)
		Wait For (msa) Msgbox_Result (Result As Int)
		If Result <> xui.DialogResponse_Positive Then
			Return
		End If
	End If
	
	' revisar que los emails seleccionados son válidos
	Dim lstEmAddrErr As List
	lstEmAddrErr.Initialize
	Dim sbEmAddErr As StringBuilder
	sbEmAddErr.Initialize
	Dim rs As ResultSet=mSQL.ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,""))
	Do While rs.NextRow
		Dim EmailAddress As String=rs.GetString("Email")
		If IsEmail(EmailAddress.Trim)=False Then
			lstEmAddrErr.Add(EmailAddress)
			sbEmAddErr.Append(EmailAddress).Append(",")
		End If
	Loop
	rs.close
	
	If lstEmAddrErr.Size>0 Then
		sbEmAddErr.Remove(sbEmAddErr.Length-1,sbEmAddErr.Length)
		Dim msa As Object=xui.Msgbox2Async("Las siguientes direcciones de email seleccionadas son erróneas." & CRLF & sbEmAddErr.ToString & CRLF & CRLF & "Es necesario corregirlas, o desmarcarlas." ,"Aviso","Sí","Cancelar","",Null)
		Dim msa As Object=xui.MsgboxAsync("La fecha inicial no puede ser posterior a la fecha final","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	jamCircularProgressBar1.Value=0
	jamCircularProgressBar1.Visible=True
	
	Select True
		Case TipoDestinatarioInforme="Clientes"
'			ActualizarListaPedidosPendientesClientes
'			Wait For ActualizarListaPedidosPendientesClientes_Completed
			Dim lstPedPtes As List
			Dim NumEmailsEnviar As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,"")))
			Dim Intervalo As Int=Round((100/NumEmailsEnviar))
			Dim rs As ResultSet=mSQL.ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,""))
			Do While rs.NextRow
				'lstPedidosPendientes.Initialize
				Dim lstInfoDocsEnviadosContacto As List
				lstInfoDocsEnviadosContacto.Initialize
				
				Dim lstPedPtesContacto As List
				lstPedPtesContacto.Initialize
				Dim CodigoDestinatario As String=rs.GetString("Codigo")
				Wait For (CargaPedidosVentaNoAbiertosPendientesContacto(CodigoDestinatario)) complete (mResult As Map)
				If mResult.Get("ReqOK")=True Then
					Dim lstPedPtes As List=mResult.Get("lstPedidosPendientesContacto")
					For Each mP As Map In lstPedPtes
						lstPedPtesContacto.Add(mP)
					Next
				End If
				Dim CtaProtec As Boolean
				If rs.GetInt("ClienteProtec")=1 Then
					CtaProtec=True
				Else
					CtaProtec=False
				End If
				'ExportarDatosInformeAExcel(True, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"),lstPedPtesContacto )
				wait for(ExportarDatosInformeAExcel(CtaProtec, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"),lstPedPtesContacto )) complete (rBool As Boolean)
				
'				Else
'					ExportarDatosInformeAExcel(False, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"),lstPedPtesContacto)
'				End If
				'Wait For ExportarDatosInformeAExcel_Completed
				jamCircularProgressBar1.Value=Min(jamCircularProgressBar1.Value+Intervalo,100)
				Sleep(0)
			Loop
			rs.Close
			
			
			
			
		Case TipoDestinatarioInforme="Comerciales"
'			ActualizarListaPedidosPendientesComerciales
'			Wait For ActualizarListaPedidosPendientesComerciales_Completed
			
			Dim NumEmailsEnviar As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select count(*) from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,"")))
			Dim Intervalo As Int=Round((100/NumEmailsEnviar))
			Dim rs As ResultSet=mSQL.ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,""))
			Do While rs.NextRow
				'lstPedidosVentaNoAbiertosPendientesComercial.Initialize
				'lstPedidosPendientes.Initialize
				Dim lstInfoDocsEnviadosComercial As List
				lstInfoDocsEnviadosComercial.Initialize
				Dim lstPedPtesComercial As List
				lstPedPtesComercial.Initialize
'		DatosPedidosVentaNoAbiertosPendientesComercial(rs.GetString("Codigo"))
'		Wait For DatosPedidosVentaNoAbiertosPendientesComercial_Completed
				Wait For (CargaPedidosVentaNoAbiertosPendientesComercial(rs.GetString("Codigo"))) complete (mResult As Map)
				If mResult.Get("ReqOK")=True Then
					Dim lstPedPtes As List=mResult.Get("lstPedidosPendientesComercial")
					For Each mP As Map In lstPedPtes
						lstPedPtesComercial.Add(mP)
					Next
				End If
				wait for(ExportarDatosInformeAExcel(False, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"), lstPedPtesComercial)) complete (rBool As Boolean)
				'Wait For ExportarDatosInformeAExcel_Completed
				jamCircularProgressBar1.Value=Min(jamCircularProgressBar1.Value+Intervalo,100)
				Sleep(0)
			Loop
			rs.Close
			
	End Select
	lblProgress.Text=""
	btnInformeErroresUltimoEnvio.Visible=lstErrores.Size>0
	jamCircularProgressBar1.Value=0
	jamCircularProgressBar1.Visible=False
	If lstErrores.Size>0 Then
'		Dim sb As StringBuilder
'		sb.Initialize
'		sb.Append("Errores en el proceso:").Append(CRLF).Append(CRLF)
'		For i=0 To lstErrores.Size-1
'			Dim E As ErrorProceso=lstErrores.Get(i)
'			sb.Append(E.CodigoContacto).Append("  ").Append(E.NombreContacto).Append("  ").Append(E.DireccionEmail).Append("  ").Append(E.ProcesoError).Append("  ").Append(E.DescripcionError)
'			sb.Append(CRLF).Append(CRLF)
'		Next
'		Dim msa As Object=xui.MsgboxAsync(sb.ToString,"Aviso")
'		Wait For (msa) Msgbox_Result

		Dim msa As Object=xui.MsgboxAsync("Proceso ejecutado con " & lstErrores.Size & " errores. Consulta el informe de errores mediante el botón Informe Errores ültimo Envío." & _
			CRLF & CRLF & " IMPORTANTE:Este informe se elimina al ejecutar un nuevo envío o al salir de la aplicación." ,"Aviso")
		Wait For (msa) Msgbox_Result

	Else
		Dim msa As Object=xui.MsgboxAsync("Proceso finalizado sin errores","Aviso")
		Wait For (msa) Msgbox_Result
	End If
	ActualizarTableViewDestinatarios
	Wait For ActualizarTableViewDestinatarios_Completed
End Sub

'Sub ActualizarListaPedidosPendientesClientes
'	
'	Dim rs As ResultSet=Main.SQL.ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,""))
'	Do While rs.NextRow
'		'lstPedidosVentaNoAbiertosPendientesContacto.Initialize
'		lstPedidosPendientes.Initialize
''		DatosPedidosVentaNoAbiertosPendientesContacto(rs.GetString("Codigo"))
''		Wait For DatosPedidosVentaNoAbiertosPendientesContacto_Completed
'		
'		Wait For (CargaPedidosVentaNoAbiertosPendientesContacto(rs.GetString("Codigo"))) complete (mresult As Map)
'		
'		If rs.GetString("ClienteProtec")=1 Then
'			ExportarDatosInformeAExcel(True, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"))
'		Else
'			ExportarDatosInformeAExcel(False, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"))
'		End If
'		Wait For ExportarDatosInformeAExcel_Completed
'	Loop
'	rs.Close
'	CallSubDelayed(Me,"ActualizarListaPedidosPendientesClientes_Completed")
'End Sub

'Sub DatosPedidosVentaNoAbiertosPendientesContacto(Contacto As String)
'	Wait For (CargaPedidosVentaNoAbiertosPendientesContacto(Contacto)) complete (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		
'	Else
'		If mresult.Get("ReqOK")=False Then
'			
'		Else
'			
'		End If
'	End If
'	CallSubDelayed(Me,"DatosPedidosVentaNoAbiertosPendientesContacto_Completed")
'End Sub

public Sub CargaPedidosVentaNoAbiertosPendientesContacto(Contacto As String) As ResumableSub
	Dim lstPedidosPendientesContacto As List
	lstPedidosPendientesContacto.Initialize
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("ReqOK",False)
	m.Put("lstPedidosPendientesContacto",lstPedidosPendientesContacto)
	frm.RootPane.MouseCursor = fx.Cursors.WAIT
	Dim Req As DBRequestManager = CreateRequestNav
	Dim cmd As DBCommand = CreateCommand("InfoPedidosVentaNoAbiertosPendientesContacto",Array(Contacto))
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		m.Put("ConnOK",True)
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			For Each records() As Object In res.Rows
				Dim mPed As Map
				mPed.Initialize
				For i=0 To  res.Columns.Size-1
					'Log(res.Columns.GetKeyAt(i))
					mPed.Put(res.Columns.GetKeyAt(i),records(i))
					'Log(res.Columns.GetKeyAt(i) & ": " & records(i))
				Next
				'lstPedidosVentaNoAbiertosPendientesContacto.Add(mPed)
				'lstPedidosPendientes.Add(mPed)
				lstPedidosPendientesContacto.Add(mPed)
			Next
		Else
			
		End If
		m.Put("lstPedidosPendientesContacto",lstPedidosPendientesContacto)
	Else
		
	End If
	j.Release
	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
	Return m
End Sub

'Sub ActualizarListaPedidosPendientesComerciales
'	
'	Dim rs As ResultSet=Main.SQL.ExecQuery2("select * from tblDestinatarios where Seleccionado=? and Email<>?",Array As String(1,""))
'	Do While rs.NextRow
'		'lstPedidosVentaNoAbiertosPendientesComercial.Initialize
'		lstPedidosPendientes.Initialize
'		Dim lstInfoDocsEnviadosComercial As List
'		lstInfoDocsEnviadosComercial.Initialize
'		Dim lstPedPtesComercial As List
'		lstPedPtesComercial.Initialize
''		DatosPedidosVentaNoAbiertosPendientesComercial(rs.GetString("Codigo"))
''		Wait For DatosPedidosVentaNoAbiertosPendientesComercial_Completed
'		Wait For (CargaPedidosVentaNoAbiertosPendientesComercial(rs.GetString("Codigo"))) complete (mresult As Map)
'		ExportarDatosInformeAExcel(False, rs.GetString("Codigo"),rs.GetString("Nombre"),rs.GetString("Email"), lstPedPtesComercial)
'		Wait For ExportarDatosInformeAExcel_Completed
'	Loop
'	rs.Close
'	CallSubDelayed(Me,"ActualizarListaPedidosPendientesComerciales_Completed")
'End Sub

'Sub DatosPedidosVentaNoAbiertosPendientesComercial(Comercial As String)
'	Wait For (CargaPedidosVentaNoAbiertosPendientesComercial(Comercial)) complete (mresult As Map)
'	If mresult.Get("ConnOK")=False Then
'		
'	Else
'		If mresult.Get("ReqOK")=False Then
'			
'		Else
'			
'		End If
'	End If
'	CallSubDelayed(Me,"DatosPedidosVentaNoAbiertosPendientesComercial_Completed")
'End Sub

public Sub CargaPedidosVentaNoAbiertosPendientesComercial(Comercial As String) As ResumableSub
	Dim lstPedidosPendientesComercial As List
	lstPedidosPendientesComercial.Initialize
	Dim m As Map
	m.Initialize
	m.Put("ConnOK",False)
	m.Put("ReqOK",False)
	m.Put("lstPedidosPendientesComercial",lstPedidosPendientesComercial)
	frm.RootPane.MouseCursor = fx.Cursors.WAIT
	Dim Req As DBRequestManager = CreateRequestNav
	'Dim cmd As DBCommand = CreateCommand("InfoPedidosVentaNoAbiertosPendientesVendedor",Array(Comercial))
	Dim cmd As DBCommand = CreateCommand("InfoPedidosVentaTransferenciaPendientesVendedor",Array(Comercial))
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		m.Put("ConnOK",True)
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		If res.Rows.Size>0 Then
			m.Put("ReqOK",True)
			For Each records() As Object In res.Rows
				Dim mPed As Map
				mPed.Initialize
				For i=0 To  res.Columns.Size-1
					Log(res.Columns.GetKeyAt(i))
					mPed.Put(res.Columns.GetKeyAt(i),records(i))
					'Log(res.Columns.GetKeyAt(i) & ": " & records(i))
				Next
				'lstPedidosVentaNoAbiertosPendientesComercial.Add(mPed)
				'lstPedidosPendientes.Add(mPed)
				lstPedidosPendientesComercial.Add(mPed)
			Next
		Else
			
		End If
		m.Put("lstPedidosPendientesComercial",lstPedidosPendientesComercial)
	Else
		
	End If
	j.Release
	frm.RootPane.MouseCursor = fx.Cursors.DEFAULT
	Return m
End Sub

Sub ExportarDatosInformeAExcel(CuentaProtec As Boolean, CodigoContacto As String, NombreContacto As String, EmailContacto As String, lstPedidosPendientesDestinatario As List) As ResumableSub
	If txtEmailAlternativo.Text<>"" Then
		Dim NombreInforme As String="Informe Expediciones - Pedidos Pendientes " & PeriodoInforme & "  " & NombreContacto
	Else
		Dim NombreInforme As String="Informe Expediciones - Pedidos Pendientes " & PeriodoInforme
	End If
	'wait for (CrearInformeExcel(NombreInforme,CodigoContacto, NombreContacto, lstInfoDocumentos, lstPedidosPendientes)) COMPLETE (result As Boolean)
	Dim result As Boolean=CrearInformeExcel(NombreInforme,CodigoContacto, NombreContacto, lstInfoDocumentos, lstPedidosPendientesDestinatario)
	If result Then
		Dim FechaHoraGeneracionInforme As String
		DateTime.DateFormat="dd/MM/yyyy HH:mm:ss"
		FechaHoraGeneracionInforme=DateTime.Date(DateTime.Now)
		Dim sb As StringBuilder
		sb.Initialize
		Select True

			Case TipoDestinatarioInforme="Clientes"
				sb.Append("Estimado cliente,")
				sb.Append(CRLF).Append(CRLF)
				sb.Append("En la tabla adjunta se incluye la siguiente información:")
				sb.Append(CRLF).Append(CRLF)
				sb.Append("1) Datos relativos a las expediciones del periodo indicado en el asunto del mensaje.")
				sb.Append(CRLF).Append(CRLF)
				sb.Append("2) Datos relativos a los pedidos pendientes. Estos se se refieren al momento de generación de este informe (" & FechaHoraGeneracionInforme & ")")
				sb.Append(CRLF).Append(CRLF)
				sb.Append("Saludos")
				sb.Append(CRLF).Append(CRLF).Append(CRLF)
				sb.Append("Este correo ha sido enviado desde una dirección de e-mail que no acepta correos entrantes. Por favor, no responda a este e-mail.").Append(CRLF)
				sb.Append("En caso de duda, por favor contacte con su responsable de cuenta, indicado en la excel.")
			Case TipoDestinatarioInforme="Comerciales"
				sb.Append("En la tabla adjunta se incluye la siguiente información:")
				sb.Append(CRLF).Append(CRLF)
				sb.Append("1) Datos relativos a las expediciones del periodo indicado en el asunto del mensaje.")
				sb.Append(CRLF).Append(CRLF)
				sb.Append("2) Datos relativos a los pedidos pendientes. Estos se se refieren al momento de generación de este informe (" & FechaHoraGeneracionInforme & ")")
				sb.Append(CRLF).Append(CRLF).Append(CRLF)
				sb.Append("Este correo ha sido enviado desde una dirección de e-mail que no acepta correos entrantes. Por favor, no responda a este e-mail.").Append(CRLF)
				sb.Append("En caso de duda, por favor contacte con su responsable de cuenta, indicado en la excel.")
		End Select
		DateTime.DateFormat="dd/MM/yy"
		wait for (EnviarEmailContacto(CuentaProtec, CodigoContacto, NombreContacto, EmailContacto.Trim,NombreInforme,sb.ToString,File.DirData("Expediciones"),NombreInforme & ".xlsx")) complete (rBool As Boolean)
		'Wait For EnviarEmailContacto_Completed
	End If
	'CallSubDelayed(Me,"ExportarDatosInformeAExcel_Completed")
	Return result
End Sub

public Sub CrearInformeExcel(NombreFicheroExcel As String, CodigoContacto As String, NombreContacto As String, _
	lstDatosDocumentos As List,lstDatosPedidosPendientes As List) As Boolean
	Dim wb As PoiWorkbook
	wb.InitializeNew(True) 'crear nuevo libro
	
	Dim csFecha As PoiCellStyle
	csFecha.Initialize(wb)
	csFecha.SetDataFormat(wb,"dd/MM/yyyy")
	
	Dim fNegritaAzul As PoiFont
	fNegritaAzul.Initialize(wb)
	fNegritaAzul.Bold = True
	'fNegritaAzul.SetColor(fx.Colors.From32Bit(0xFF1E90FF))
	fNegritaAzul.SetColor(0xFF1E90FF)
	
	
	Dim csEncabezado As PoiCellStyle
	csEncabezado.Initialize(wb)
	csEncabezado.SetFont(fNegritaAzul)
	
'	Dim fLink As PoiFont
'	fLink.Initialize(wb)
'	fLink.Underline=True
'	fLink.SetColor(fx.Colors.From32Bit(0xFF0000FF))
'	
'	Dim csHyperlink As PoiCellStyle
'	csHyperlink.Initialize(wb)
'	csHyperlink.SetFont(fLink)
'	
'	Hyperlink link = createHelper.createHyperlink(HyperlinkType.URL);
'	link.setAddress("http://poi.apache.org/");
'	cell.setHyperlink(link);
'	cell.setCellStyle(hlink_style);
	
  
	'1) Hoja Documentos expedidos
	
	Dim sheet1 As PoiSheet
	sheet1 = wb.AddSheet("Documentos Expedidos",0)
	
	Dim jo As JavaObject=sheet1
	Try
		jo.RunMethod("trackAllColumnsForAutoSizing",Null)
		
	Catch
		Log(LastException)
	End Try
  
	'Encabezados Excel
	 
	
	Dim FilaEncabezados As PoiRow = sheet1.CreateRow(0)   ' Encabezados= FILA 0


	Dim m As Map=lstDatosDocumentos.Get(0)
	Dim nK As Int
	For Each k As String In m.Keys
		
		Select True
			Case TipoDestinatarioInforme="Clientes"
				If lstCamposInformeDocumentosExpedidosClientes.IndexOf(k)>-1 Then
					FilaEncabezados.CreateCellString(nK,k)
					Dim c As PoiCell=FilaEncabezados.GetCell(nK)
					c.CellStyle=csEncabezado
					nK=nK+1
				End If
			Case TipoDestinatarioInforme="Comerciales"
'				If nK>3 Then ' no añadir las 4 primeras columnas = info contacto al que se le envia el informe y ClienteProtec
'					FilaEncabezados.CreateCellString(nK-4,k)
'					nK=nK+1
'				End If
				If lstCamposInformeDocumentosExpedidosComerciales.IndexOf(k)>-1 Then
					FilaEncabezados.CreateCellString(nK,k)
					Dim c As PoiCell=FilaEncabezados.GetCell(nK)
					c.CellStyle=csEncabezado
					nK=nK+1
				End If
		End Select
		
	Next
		
	Dim NumFilaExcel As Int=1
	
	
	Dim Campo As String
	Select True
		Case TipoDestinatarioInforme="Clientes"
			Campo="Contacto"
		Case TipoDestinatarioInforme="Comerciales"
			Campo="Comercial"
	End Select
	For i=0 To lstDatosDocumentos.Size-1
		Dim m As Map=lstDatosDocumentos.Get(i)

		If m.Get(Campo)=CodigoContacto Then
			Dim FilaExcel As PoiRow = sheet1.CreateRow(NumFilaExcel)
			Dim nK As Int
			Select True
				Case TipoDestinatarioInforme="Clientes"
					For j=0 To m.Size-1
						If lstCamposInformeDocumentosExpedidosClientes.IndexOf(m.GetKeyAt(j))>-1 Then
							
							Select True
								Case sf.InString(m.GetKeyAt(j),"Cantidad")>-1
									FilaExcel.CreateCellNumeric(nK,m.GetValueAt(j))
								Case sf.InString(m.GetKeyAt(j),"Fecha")>-1
									FilaExcel.CreateCellString(nK,DateTime.Date(m.GetValueAt(j)))
'								Case sf.InString(m.GetKeyAt(j),"Email")>-1
'									FilaExcel.CreateCellString(nK,DateTime.Date(m.GetValueAt(j)))
'									Dim c As PoiCell=FilaExcel.GetCell(nK)
'									c.CellStyle
								Case Else
									FilaExcel.CreateCellString(nK,m.GetValueAt(j))
							End Select
							nK=nK+1
						End If
					Next
					
				Case TipoDestinatarioInforme="Comerciales"
					'For j=4 To m.Size-1 ' no añadir las 3 primeras columnas = info contacto al que se le envia el informe
					For j=0 To m.Size-1
						If lstCamposInformeDocumentosExpedidosComerciales.IndexOf(m.GetKeyAt(j))>-1 Then
							
							Select True
								Case sf.InString(m.GetKeyAt(j),"Cantidad")>-1
									FilaExcel.CreateCellNumeric(nK,m.GetValueAt(j))
								Case sf.InString(m.GetKeyAt(j),"Fecha")>-1
									FilaExcel.CreateCellString(nK,DateTime.Date(m.GetValueAt(j)))
								Case Else
									FilaExcel.CreateCellString(nK,m.GetValueAt(j))
							End Select
							nK=nK+1
						End If
					Next
				
			End Select
			NumFilaExcel=NumFilaExcel+1
		End If
	Next

	Dim m As Map=lstDatosDocumentos.Get(0)
	Dim nK As Int
	For Each k As String In m.Keys
		Try
			jo.RunMethod("autoSizeColumn",Array(nK))
		Catch
			Log(LastException)
		End Try
		nK=nK+1
	Next
	
	
	'2) Hoja Pedidos Pendientes
	
	Dim sheet2 As PoiSheet
	sheet2 = wb.AddSheet("Pedidos Pendientes",1)
	
'	Dim jo As JavaObject=sheet2
'	Try
'		jo.RunMethod("trackAllColumnsForAutoSizing",Null)
'	Catch
'		Log(LastException)
'	End Try
  
	If lstDatosPedidosPendientes.Size>0 Then
  
		'Encabezados Excel
		
		Dim FilaEncabezados2 As PoiRow = sheet2.CreateRow(0)   ' Encabezados= FILA 0

		Dim m As Map=lstDatosPedidosPendientes.Get(0)
		Dim nK As Int
		Select True
			Case TipoDestinatarioInforme="Clientes"
				For Each k As String In m.Keys
					If lstCamposInformePedidosPendientesClientes.IndexOf(k)>-1 Then
						FilaEncabezados2.CreateCellString(nK,k)
						Dim c As PoiCell=FilaEncabezados2.GetCell(nK)
						c.CellStyle=csEncabezado
						nK=nK+1
					End If
				Next
			Case TipoDestinatarioInforme="Comerciales"
'				For Each k As String In m.Keys
'					If nK>2 Then   ' no añadir las 3 primeras columnas = info contacto al que se le envia el informe
'						FilaEncabezados2.CreateCellString(nK-3,k)
'					End If
'					nK=nK+1
'				Next
				For Each k As String In m.Keys
					If lstCamposInformePedidosPendientesComerciales.IndexOf(k)>-1 Then
						FilaEncabezados2.CreateCellString(nK,k)
						Dim c As PoiCell=FilaEncabezados2.GetCell(nK)
						c.CellStyle=csEncabezado
						nK=nK+1
					End If
				Next
		End Select

			
		Dim NumFilaExcel As Int=1
		For i=0 To lstDatosPedidosPendientes.Size-1
			Dim m As Map=lstDatosPedidosPendientes.Get(i)
			Dim FilaExcel As PoiRow = sheet2.CreateRow(NumFilaExcel)
			Dim nK As Int
			Select True
				Case TipoDestinatarioInforme="Clientes"
					For j=0 To m.Size-1
						
						If lstCamposInformePedidosPendientesClientes.IndexOf(m.GetKeyAt(j))>-1 Then
							Select True
								Case sf.InString(m.GetKeyAt(j),"Cantidad")>-1
									FilaExcel.CreateCellNumeric(nK,m.GetValueAt(j))
								Case sf.InString(m.GetKeyAt(j),"Fecha")>-1

									If m.GetValueAt(j)<DateTime.DateParse("01/01/2000") Then
										FilaExcel.CreateCellString(nK,"")
									Else
										FilaExcel.CreateCellString(nK,DateTime.Date(m.GetValueAt(j)))
									End If
								Case Else
									FilaExcel.CreateCellString(nK,m.GetValueAt(j))
							End Select
							nK=nK+1
						End If
						
					Next
					NumFilaExcel=NumFilaExcel+1

				Case TipoDestinatarioInforme="Comerciales"
					'For j=3 To m.Size-1   ' no añadir las 3 primeras columnas = info contacto al que se le envia el informe
					For j=0 To m.Size-1
						If lstCamposInformePedidosPendientesComerciales.IndexOf(m.GetKeyAt(j))>-1 Then
							Select True
								Case sf.InString(m.GetKeyAt(j),"Cantidad")>-1
									FilaExcel.CreateCellNumeric(nK,m.GetValueAt(j))
								Case sf.InString(m.GetKeyAt(j),"Fecha")>-1
									If m.GetValueAt(j)<DateTime.DateParse("01/01/2000") Then
										FilaExcel.CreateCellString(nK,"")
									Else
										FilaExcel.CreateCellString(nK,DateTime.Date(m.GetValueAt(j)))
									End If
									
								Case Else
									FilaExcel.CreateCellString(nK,m.GetValueAt(j))
							End Select
							nK=nK+1
						End If
					Next
					NumFilaExcel=NumFilaExcel+1
			End Select
			
		Next


		Dim m As Map=lstDatosPedidosPendientes.Get(0)
		Dim nK As Int
		For Each k As String In m.Keys
			Try
				jo.RunMethod("autoSizeColumn",Array(nK))
			Catch
				Log(LastException)
			End Try
			nK=nK+1
		Next
	Else
		Dim FilaExcel As PoiRow = sheet2.CreateRow(0)
		FilaExcel.CreateCellString(0,"Sin pedidos pendientes")
	End If

	' grabamos el fichero con el titulo del formulario
'	Dim NombreFicheroExcel As String=NombreFicheroExcel
	Try
		wb.Save(File.DirData("Expediciones"), NombreFicheroExcel & ".xlsx")
		wb.Close
		lblProgress.Text="Excel informe para " & NombreContacto & " grabada."
		Return True
	Catch
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el fichero. Verifica si tienes excel en el equipo, y que no esté abierto ya un fichero con el nombre " & NombreFicheroExcel & ".xlsx","Error")
'		Wait For (msa) Msgbox_Result
		Dim E As ErrorProcesoInformeCliente
		E.Initialize
		E.CodigoContacto=CodigoContacto
		E.NombreContacto=NombreContacto
		E.ProcesoError="Creación Fichero Excel"
		E.DescripcionError=LastException.Message
		lstErrores.Add(E)
		Log(LastException.Message)
		lblProgress.Text="Error al intentar grabar excel informe para "  & NombreContacto & "."
		Return False
	End Try
	
End Sub

Sub EnviarEmailContacto(CuentaProtec As Boolean , CodigoContacto As String, NombreContacto As String , Destinatario As String, Subject As String, Body As String, DirFileAtt As String,FileAtt As String) As ResumableSub
	Dim EnvioEmailOK As Boolean
	
	Dim SMTP As SMTP
	If CuentaProtec Then
		SMTP.Initialize("smtp.office365.com", 587, EmProtec, PassProtec, "SMTP")
	Else
		SMTP.Initialize("smtp.office365.com", 587, EmProin, PasswProin, "SMTP")
	End If
	
	SMTP.StartTLSMode = True
	SMTP.UseSSL = True
	SMTP.AuthMethod = SMTP.AUTH_LOGIN


	Log("Destinatario: " & Destinatario)
	
	If txtEmailAlternativo.Text<>"" Then
		Destinatario=txtEmailAlternativo.Text.Trim
		'Log(Destinatario)
		Log("Destinatario alternativo: " & Destinatario)
	End If

	SMTP.To.Add(Destinatario)
	
	SMTP.Subject = Subject
	SMTP.Body = Body
	If FileAtt<>"" And DirFileAtt<>"" Then
		SMTP.AddAttachment(DirFileAtt, FileAtt)
	End If
	Try
		SMTP.Send
		Wait For SMTP_MessageSent(Success As Boolean)

		If Success Then
			EnvioEmailOK=True
'			Dim msa As Object=xui.MsgboxAsync("Email con destinatario " & Destinatario & " enviado con éxito","Aviso")
'			Wait For (msa) Msgbox_Result
			Log("Email enviado con éxito a "  & Destinatario)
			lblProgress.Text="Email enviado a "  & Destinatario
			mSQL.ExecNonQuery2("update tblDestinatarios set EnviadoEmail=? where Codigo=?",Array As Object(True, CodigoContacto))
		Else
			EnvioEmailOK=False
'			frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
'			Dim msa As Object=xui.MsgboxAsync("Email con destinatario " & Destinatario & " no ha podido ser enviado" & CRLF & CRLF & "Revisar la direccion de email y la conexión a internet" &CRLF & CRLF & LastException.Message,"Aviso")
'			Wait For (msa) Msgbox_Result
			Dim E As ErrorProcesoInformeCliente
			E.Initialize
			E.CodigoContacto=CodigoContacto
			E.NombreContacto=NombreContacto
			E.DireccionEmail=Destinatario
			E.ProcesoError="Envio email"
			E.DescripcionError=LastException.Message
			Dim Cliente As String=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select Cliente from tblDestinatarios where Codigo=?",Array As String(CodigoContacto)))
			Dim NombreCliente As String=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select NombreCliente from tblDestinatarios where Codigo=?",Array As String(CodigoContacto)))
			Dim NombreResponsableCuenta As String=Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select NombreResponsableCuenta from tblDestinatarios where Codigo=?",Array As String(CodigoContacto)))
			E.Cliente=Cliente
			E.NombreCliente=NombreCliente
			E.NombreResponsableCuenta=NombreResponsableCuenta
			
			lstErrores.Add(E)
			Log(LastException.Message)
			lblProgress.Text="Error al intentar enviar email a "  & Destinatario & "."
		End If
	Catch
'		frm.RootPane.MouseCursor=fx.Cursors.DEFAULT
'		Dim msa As Object=xui.MsgboxAsync("Email con destinatario " & Destinatario & " no ha podido ser enviado" & CRLF & CRLF & LastException.Message,"Aviso")
'		Wait For (msa) Msgbox_Result
		EnvioEmailOK=False
		Log(LastException.Message)
	End Try
	'CallSubDelayed(Me,"EnviarEmailcontacto_Completed")
	Return EnvioEmailOK
End Sub


Sub cboTipoInforme_ValueChanged (Value As Object)
	If CargandoItemsCboTipoInforme Then
		Log("Cargando items cbo")
		Return
	Else
		Log("Cambio en items cbo, no carga")
'		TipoInformeSeleccionado=Value
'		Log("Tipo Informe " & TipoInformeSeleccionado)
		TipoDestinatarioInforme=Value
		Log("Tipo Destinatario Informe " & TipoDestinatarioInforme)
		Select True
			Case Value=""
				lstInfoDocumentos.Initialize
				lstVendedores.Initialize
				lstResponsablesCuenta.Initialize
				lstContactosPedidos.Initialize
				mSQL.ExecNonQuery("delete from tblDestinatarios")
				tvDestinatarios.Items.Clear
				pnlFondoDestinatarios.Visible=False
			Case Value="Clientes"
				InformeClientes
			Case Value="Comerciales"
				InformeComerciales
		End Select

	End If
End Sub

'Sub txtEmailAlt_MouseClicked (EventData As MouseEvent)
'	If CargandoDatos Then Return
'	
'	Dialog.Title = "Indica Email Alternativo"
'	InputDialog.Initialize
'
'	
'	Dim tF As TextField=Sender
'	Dim ci As CellIndex=tF.Tag
'	Dim rIdx As Int=ci.Row
'	Dim row() As Object=tvDestinatarios.Items.Get(rIdx)
'	Dim p As AnchorPane=row(1)
'	Dim Codigo As String=p.Tag
'	InputDialog.TextField1.Text=Main.FixNull(Main.SQL.ExecQuerySingleResult2("select EmailAlternativo from tblDestinatarios where Codigo=?",Array As Object(Codigo)))
'	InputDialog.lblTitle.Text=""
'	Wait For (Dialog.ShowTemplate(InputDialog, "OK", "", "Cancel")) Complete (Result As Int)
'	If Result = xui.DialogResponse_Positive Then
'		Log(InputDialog.Text)
'
'	End If
'
'End Sub

Sub IsEmail(EmailAddress As String) As Boolean
	Dim MatchEmail As Matcher = Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$", EmailAddress)
	If MatchEmail.Find = True Then
		Log(MatchEmail.Match)
		'Do something
		Return True
	Else
		Log("Oops, please double check your email address")
		Return False
	End If
End Sub


Private Sub lblInfoEmailAlternativo_MouseReleased (EventData As MouseEvent)
	Dim msa As Object=xui.MsgboxAsync("El email alternativo se emplea para realizar pruebas. Los emails NO serán enviados a los emails de los destinatarios, sino al email alternativo indicado.","Información")
	Wait For (msa) Msgbox_Result
End Sub

Private Sub btnInformeErroresUltimoEnvio_Click
	If lstErrores.Size=0 Then
		Dim msa As Object=xui.MsgboxAsync("No hay datos de errores del último envío de correos.","Aviso")
		Wait For (msa) Msgbox_Result
		Return
	End If
	
	Dim UserFolder As String=FindUserDocumentsFolder
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd-MM-yyy"
	Dim TimeFormatAnt As String=DateTime.TimeFormat
	DateTime.Timeformat="HH-mm-ss"
	
	Dim fCH As FileChooser
	fCH.Initialize
	fCH.InitialDirectory=UserFolder
	fCH.InitialFileName=$"ErroresEnvioEmail $DateTime{DateTime.Now}"$
	fCH.SetExtensionFilter("Ficheros Excel",Array As String("*.xlsx"))
	Dim NombreFichero As String=fCH.ShowSave(frm)
	If NombreFichero="" Then Return
	
'	Dim sb As StringBuilder
'	sb.Initialize
'	For Each E As ErrorProceso In lstErrores
'		sb.Append("Proceso:" ).Append(E.ProcesoError).Append(" / ")
'		sb.Append("Codigo Contacto:" ).Append(E.CodigoContacto).Append(" / ")
'		sb.Append("Nombre Contacto:" ).Append(E.NombreContacto).Append(" / ")
'		sb.Append("Email:" ).Append(E.DireccionEmail).Append(" / ")
'		sb.Append("Descripcion Error:" ).Append(E.DescripcionError).Append(" / ")
'		sb.Append(CRLF)
'	Next
'	
'	File.WriteString(File.GetFileParent(NombreFichero),File.GetName(NombreFichero), sb.ToString)
'	Sleep(500)
'	fx.ShowExternalDocument(NombreFichero)

	wait for(CreateWorkbook(NombreFichero)) complete (Success As Boolean)
	If Success=False Then
		Dim msa As Object=xui.MsgboxAsync("Error generando fichero excel.","Error")
		Wait For (msa) Msgbox_Result
	End If
	
	DateTime.DateFormat=DateFormatAnt
	DateTime.Timeformat=TimeFormatAnt
End Sub

Sub FindUserDocumentsFolder As String
	If DetectOS = "windows" Then
		Dim jo As JavaObject
		Dim fs As JavaObject = jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethod("getFileSystemView", Null)
		Return fs.RunMethodJO("getDefaultDirectory", Null).RunMethod("getPath", Null)
	Else
		Return GetSystemProperty("user.home", "") & "/Documents"
	End If
End Sub

Sub DetectOS As String
	Dim os As String = GetSystemProperty("os.name", "").ToLowerCase
	If os.Contains("win") Then
		Return "windows"
	Else If os.Contains("mac") Then
		Return "mac"
	Else
		Return "linux"
	End If
End Sub


Private Sub CreateWorkbook(RutaFichero As String)As ResumableSub
	Dim xl As XLUtils
	xl.Initialize
	Dim Workbook As XLWorkbookWriter = xl.CreateWriterBlank
	Dim sheet1 As XLSheetWriter = Workbook.CreateSheetWriterByName("Sheet1")
	Dim TitleStyle As XLStyle = Workbook.CreateStyle
	TitleStyle.ForegroundColor(xl.COLOR_GREY_80_PERCENT).FontBoldColor(12, xl.COLOR_WHITE).HorizontalAlignment("CENTER")
	sheet1.PutString(xl.AddressName("A1"), "Proceso").SetStyles(sheet1.LastAccessed, Array(TitleStyle, Workbook.CreateStyle.BorderLeft("THIN"))) 'title style + border
	sheet1.PutString(xl.AddressName("B1"), "Cliente").SetStyle(sheet1.LastAccessed, TitleStyle)
	sheet1.PutString(xl.AddressName("C1"), "NombreCliente").SetStyle(sheet1.LastAccessed, TitleStyle)
	sheet1.PutString(xl.AddressName("D1"), "Responsable Cuenta").SetStyle(sheet1.LastAccessed, TitleStyle)
	sheet1.PutString(xl.AddressName("E1"), "Codigo Contacto").SetStyle(sheet1.LastAccessed, TitleStyle)
	sheet1.PutString(xl.AddressName("F1"), "Nombre Contacto").SetStyle(sheet1.LastAccessed, TitleStyle)
	sheet1.PutString(xl.AddressName("G1"), "Email").SetStyles(sheet1.LastAccessed, Array(TitleStyle, Workbook.CreateStyle.BorderRight("THIN")))
	sheet1.PutString(xl.AddressName("H1"), "Descripcion Error").SetStyles(sheet1.LastAccessed, Array(TitleStyle, Workbook.CreateStyle.BorderRight("THIN")))

	Dim i As Int=2
	For Each E As ErrorProcesoInformeCliente In lstErrores
		sheet1.PutString(xl.AddressOne("A", i), E.ProcesoError)
		sheet1.PutString(xl.AddressOne("B", i), E.Cliente)
		sheet1.PutString(xl.AddressOne("C", i), E.NombreCliente)
		sheet1.PutString(xl.AddressOne("D", i), E.NombreResponsableCuenta)
		sheet1.PutString(xl.AddressOne("E", i), E.CodigoContacto)
		sheet1.PutString(xl.AddressOne("F", i), E.NombreContacto)
		sheet1.PutString(xl.AddressOne("G", i), E.DireccionEmail)
		sheet1.PutString(xl.AddressOne("H", i), E.DescripcionError)
		i=i+1
	Next

	'add auto filters - range with the data. The filters will appear above the data.
	sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressName("A1"), xl.AddressOne("E", i)))
    
	'Set the columns widths to fit the content
	'To make sure that the "total" column is measured correctly we need to first evaluate the formulas:
	Workbook.EvaluateFormulas
	For col0 = xl.AddressName("A").Col0Based To xl.AddressName("H").Col0Based
		sheet1.AutoSizeColumn(col0)
	Next

	'make the columns a bit wider to make room for the filter arrows:
	For col0  = 0 To 7
		sheet1.PoiSheet.SetColumnWidth(col0, sheet1.PoiSheet.GetColumnWidth(col0) + 1200)
	Next
    
	'save the workbook
	Dim f As String = Workbook.SaveAs(File.GetFileParent(RutaFichero), File.GetName(RutaFichero), True)
	Wait For (xl.OpenExcel(f)) Complete (Success As Boolean)
	
	Return Success
	'StopMessageLoop 'non-ui
End Sub