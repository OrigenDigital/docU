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
	Private Background As B4XView
	
	Private mNuevaFaseDocumento As NuevaFaseDocumento
	Private mDestinatarioTaller As Boolean
	Private mOrdenFab As String
	
	Private Dialog As B4XDialog
	'Private btnSalir As Button
	Private mSQL As SQL
	
	Private mDocumentoSel As String
	Private mTipoDocumento As String
	Private btnCancelarGrabarNuevaFase As Button
	Private btnGrabarNuevaFase As Button
	Private btnSalir As Button
	Private btnSelDocumento As Button
	Private btnSelFechaNuevaFase As Button
	Private btnSelInfoAdicionalDoc As Button
	Private btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion As Button
	Private btnSelNuevaFaseDestinoPreparacion As Button
	Private btnSelNuevaFase As Button
	Private btnSelResponsableNuevaFase As Button
	Private btnSelResponsableNuevaFaseDestinoPreparacion As Button
	Private chkFijarFechaNuevaFase As CheckBox
	Private chkFijarNuevaFase As CheckBox

	Private lblTitleDocumento As Label
	Private lblTitleFechaNuevaFase As Label
	Private lblTitleInfoAdicionalDoc As Label
	Private lblTitleNuevaFase As Label
	Private lblTitleResponsableNuevaFase As Label
	Private lblTitleResponsableNuevaFaseDestinoPreparacion As Label
	Private txtDocumento As TextField
	Private txtFechaNuevaFase As TextField
	Private txtInfoAdicionalDoc As TextField
	Private txtNuevaFaseDestinoPreparacion As TextField
	Private txtNuevaFase As TextField
	Private txtResponsableNuevaFase As TextField
	Private txtResponsableNuevaFaseDestinoPreparacion As TextField
	Private lblTitleNuevaFaseDestinoPreparacion As Label
	Private lblTitleInfoAdicionalNuevaFaseDestinoPreparacion As Label
	Private txtInfoAdicionalNuevaFaseDestinoPreparacion As TextField
	
	'Private IDFaseSel, IDRespFaseSel,IDInfoAdicionalFaseSel,IDRespFaseDestSel,IDInfoAdicionalFaseDestSel,IDFaseDestSel As Int
	Private DatosSeleccionados As String
	Private SourceTableCls, stringSourceTableCls,TipoQryCls As String
	'Private NumExpFaseActual, NumExpFaseAdicional, ObsFaseActual As String
	Private IDDatosCls As Int
	Private Obstmp As String
	
	Type NuevaFaseDocumento (FechaFase As Long, IDFase As Int, IDRespFase As Int, IDInfoAdicionalFase As Int,IDRespFaseDest As Int, _
		IDInfoAdicionalFaseDest As Int,IDFaseDest As Int, NumExpFaseActual As String, NumExpFaseAdicional As String, ObsFaseActual As String)
	
	Private pnlNuevaFaseComplementaria As Pane
	
	Private NuevaFaseDocumentoRegistrada As Boolean
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(CallBack As Object, Parent As B4XView, Documento As String, TipoDocumento As String, DestinatarioTaller As Boolean, OrdenFab As String)
	mCallBack=CallBack
	mParent=Parent
	Background= xui.CreatePanel("background")
	Background.Tag = "b4xdialog_background"
	Background.Color=0xaa000000
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	
	mDocumentoSel=Documento
	mTipoDocumento=TipoDocumento
	mDestinatarioTaller=DestinatarioTaller
	mOrdenFab=OrdenFab
	
	If mSQL.IsInitialized Then mSQL.close
	
	mNuevaFaseDocumento.Initialize
	NuevaFaseDocumentoRegistrada=False
End Sub

Private Sub Background_MouseClicked (EventData As MouseEvent)
	EventData.Consume
End Sub

Sub frm_CloseRequest (EventData As Event)
	EventData.Consume
End Sub


Private Sub btnSalir_Click
	SalirModulo
End Sub

private Sub SalirModulo
	Background.RemoveViewFromParent
	mDocumentoSel=""
	mTipoDocumento=""
	mNuevaFaseDocumento.Initialize
	
	If SubExists(mCallBack,"NuevaFaseDocActualizada") Then 
		CallSub2(mCallBack,"NuevaFaseDocActualizada",NuevaFaseDocumentoRegistrada)
	End If
	frm.Close
End Sub


Sub Show
	frm.Initialize("frm",Main.xScreen*0.7, Main.yscreen*0.6)
	'Dim joForm As JavaObject = frm
	'Dim joStage As JavaObject = joForm.GetField("stage")
	'joStage.RunMethod("setMaximized", Array(True))
	frm.Icon = Main.IconoFormularios
	frm.RootPane.LoadLayout("scrNuevaFaseDocumento")
	Sleep(0)
	
	If mSQL.IsInitialized Then mSQL.close
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	CreacionTablasSQLite
	
	
	frm.Title=Main.PrefijoTitleForms & "Nueva Fase Documento"
		
	Dialog.Initialize (frm.RootPane)
	
	
	
	ResetNuevaFase(True)
	
	ResetNuevaFaseAdicional
	
	FaseAdicionalVisible(False)
	
	txtDocumento.Text=mDocumentoSel
		
	frm.Show
	
	Wait For(ActualizarFases) complete (sResp As String)
	If sResp<>"OK" Then 
		SalirModulo
		Return
	End If

End Sub

Sub CreacionTablasSQLite
	
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblFasesDoc"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblFasesDoc")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE IF NOT EXISTS tblFasesDoc (")
	
	sbCrearTabla.Append("TipoOrigenDoc TEXT,")
	sbCrearTabla.Append("IDFase INTEGER,")
	sbCrearTabla.Append("OrdenSecuencial INTEGER,")
	sbCrearTabla.Append("Agrupable INTEGER,")
	sbCrearTabla.Append("Fase TEXT,")
	sbCrearTabla.Append("AreaFase TEXT,")
	sbCrearTabla.Append("DestinoPreparacion INTEGER,")
	sbCrearTabla.Append("Gestionado INTEGER,")
	sbCrearTabla.Append("cboResponsableVisible INTEGER,")
	sbCrearTabla.Append("TextoEtiquetaResponsable TEXT,")
	sbCrearTabla.Append("OrigenResponsableMovFase TEXT,")
	sbCrearTabla.Append("OrigenFilaCboResponsable TEXT,")
	sbCrearTabla.Append("LimitarAListaResponsable INTEGER,")
	sbCrearTabla.Append("cboInfoAdicionalVisible INTEGER,")
	sbCrearTabla.Append("txtInfoAdicionalVisible INTEGER,")
	sbCrearTabla.Append("TextoEtiquetaInfoAdicional TEXT,")
	sbCrearTabla.Append("OrigenFilacboInfoAdicional TEXT,")
	sbCrearTabla.Append("LimitarAListaInfoAdicional INTEGER,")
	sbCrearTabla.Append("InformeExpediciones INTEGER,")
	sbCrearTabla.Append("DestinoTaller INTEGER)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)
	
	DBUtils.DropTable(mSQL,"tblTipificacionInfoAdicionalFases")
	Dim f As Map
	f.Initialize
	f.Put("TipoOrigenDoc",DBUtils.DB_TEXT)
	f.Put("IDFase",DBUtils.DB_INTEGER)
	f.Put("IDInfoAdicional",DBUtils.DB_INTEGER)
	f.Put("InfoAdicional",DBUtils.DB_TEXT)
	DBUtils.CreateTable(mSQL,"tbltipificacioninfoadicionalfases",f,"")
	
	
	DBUtils.DropTable(mSQL,"tblRowSourceCboResponsableNuevafase")
	Dim f As Map
	f.Initialize
	f.Put("IDResponsableNuevaFase",DBUtils.DB_INTEGER)
	f.Put("ResponsableNuevaFase",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"tblRowSourceCboResponsableNuevafase",f,"")

	
	DBUtils.DropTable(mSQL,"tblRowSourceCboResponsableNuevaFaseAdicional")
	Dim f As Map
	f.Initialize
	f.Put("IDResponsableNuevaFaseAdicional",DBUtils.DB_INTEGER)
	f.Put("ResponsableNuevaFaseAdicional",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"tblRowSourceCboResponsableNuevafaseAdicional",f,"")

	
	DBUtils.DropTable(mSQL,"tblRowSourceCboInfoAdicionalNuevafase")
	Dim f As Map
	f.Initialize
	f.Put("IDInfoAdicionalNuevaFase",DBUtils.DB_INTEGER)
	f.Put("InfoAdicionalNuevaFase",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"tblRowSourceCboInfoAdicionalNuevafase",f,"")
	
	DBUtils.DropTable(mSQL,"tblRowSourceCboInfoAdicionalNuevafaseAdicional")
	Dim f As Map
	f.Initialize
	f.Put("IDInfoAdicionalNuevaFaseAdicional",DBUtils.DB_INTEGER)
	f.Put("IDInfoAdicionalNuevaFaseAdicional",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"tblRowSourceCboInfoAdicionalNuevafaseAdicional",f,"")

	DBUtils.DropTable(mSQL,"vwEmpleados")
	Dim f As Map
	f.Initialize
	f.Put("IDEmpleado",DBUtils.DB_INTEGER)
	f.Put("Empleado",DBUtils.DB_TEXT)
	f.Put("Preparacion",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"vwEmpleados",f,"")

	
	DBUtils.DropTable(mSQL,"vwempleadosactivos")
	Dim f As Map
	f.Initialize
	f.Put("IDEmpleado",DBUtils.DB_INTEGER)
	f.Put("Empleado",DBUtils.DB_TEXT)
	f.Put("Preparacion",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"vwempleadosactivos",f,"")

	
	DBUtils.DropTable(mSQL,"tblTransporte")
	Dim f As Map
	f.Initialize
	f.Put("IDTransporte",DBUtils.DB_INTEGER)
	f.Put("Transporte",DBUtils.DB_TEXT)
	f.Put("RequiereNumeroExpedicion",DBUtils.DB_INTEGER)
	DBUtils.CreateTable(mSQL,"tblTransporte",f,"")

	
End Sub

Sub ActualizarFases As ResumableSub
	
	mSQL.ExecNonQuery("DELETE from tblFasesDoc")
	Dim Accion As String

	
	Dim Comando As String="FasesDocumentos"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"

	Else

		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"

			Dim msa As Object=xui.MsgboxAsync("No hay datos de Fases de Documentos","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			Dim lstReg As List=mResult.Get("lstRes")
			DBUtils.InsertMaps(mSQL,"tblFasesDoc",lstReg)
		End If
	End If
	Return Accion
End Sub
	


Private Sub chkFijarNuevaFase_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub chkFijarFechaNuevaFase_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub btnSelResponsableNuevaFaseDestinoPreparacion_Click
	DatosSeleccionados="ResponsableFaseAdicional"
	Dim sRowSource As String
	sRowSource=mSQL.ExecQuerySingleResult2("select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest, mTipoDocumento))
	sRowSource=sRowSource.Replace("=true","<>0")
	PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.IDFaseDest)
End Sub

Private Sub btnSelResponsableNuevaFase_Click
	If txtNuevaFase.Text="" Then
		Dim msa As Object=xui.MsgboxAsync("Selecciona antes la fase.","Aviso")
		Wait For (msa) Msgbox_Result
		SeleccionarNuevaFase
		Return
	End If
	
	If txtResponsableNuevaFase.Text<>"" Then
		Dim msa As Object = xui.Msgbox2Async("¿Seleccionar otro " & DatosSeleccionados & "?", "", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		
		txtInfoAdicionalDoc.Text=""
	End If
	
	
	'mNuevaFaseDocumento.IDFase=mSQL.ExecQuerySingleResult2("select IDFase from tblFasesDoc where Fase=?",Array As String(txtNuevaFase.text))
	
	Dim OpcionNuevo As Boolean=mSQL.ExecQuerySingleResult2("select LimitarAListaResponsable from tblFasesDoc where IDFase=? And TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento))=1
	
	DatosSeleccionados="ResponsableNuevaFase"
	Dim sRowSource As String
	sRowSource=mSQL.ExecQuerySingleResult2("select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase, mTipoDocumento))
	sRowSource=sRowSource.Replace("=true","<>0")
	'LoadDatosCls(1,sRowSource,mNuevaFaseDocumento.IDFase)
	PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.IDFase)
	
	
'	Dim lstOpciones As List
'	lstOpciones.Initialize
'	DBUtils.ExecuteList2(mSQL,"select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(IDFase,mTipoDocumento),0,lstOpciones)
'
'	Dialog.Title="Selecciona Opción"
'	Dialog.TitleBarHeight=60dip
'	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
'	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
'	
'	Utilidades.SetLightThemeDialog(Dialog)
'	Utilidades.SetLightThemeList(B4XListDlg)
'
'	Dim TextSize As Float = 18 'FLOAT
'	Dim xclv As CustomListView=B4XListDlg.CustomListView1
'	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
'	
'	Dim dlbl As Label=xclv.DesignerLabel
'	dlbl.TextSize=TextSize
'	Dim lblB4Xv As B4XView=dlbl
'	lblB4Xv.SetTextAlignment("CENTER","LEFT")
'
'	B4XListDlg.Options=lstOpciones
'	
'	B4XListDlg.Resize(400dip,0.80*Dialog.mParent.Height)
'	
'	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,60dip)
'	Next
'	
'	' OJO ... es un B4XView no Button
'	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'	If bCancel.IsInitialized Then
'		'Log("bCancel" & bCancel.Text)
'		bCancel.Left=bCancel.Left-50dip
'		bCancel.Width=bCancel.Width+30dip
'		bCancel.TextSize=18
'	End If
'	
'	Wait For (rSub) Complete (rInt As Int)
'	If rInt<>xui.DialogResponse_Positive Then Return
'	Dim ResponsableFase As String=B4XListDlg.SelectedItem

End Sub


Sub ResetNuevaFase(ResetFechaFase As Boolean)
	
	Dim FechaActualFase As Long=mNuevaFaseDocumento.FechaFase
	mNuevaFaseDocumento.Initialize
	
	If ResetFechaFase Then
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="dd/MM/yyyy"
		txtFechaNuevaFase.Text=DateTime.Date(DateTime.Now)
		DateTime.DateFormat=DateFormatAnt
		mNuevaFaseDocumento.FechaFase=DateTime.Now
	Else
		mNuevaFaseDocumento.FechaFase=FechaActualFase
	End If
'	IDFaseSel=0
'	IDRespFaseSel=0
'	IDInfoAdicionalFaseSel=0
'	NumExpFaseActual=""
'	IDRespFaseDestSel=0
'	IDInfoAdicionalFaseDestSel=0
'	NumExpFaseAdicional=""
'	IDFaseDestSel=0
	txtNuevaFase.Visible=True
	btnSelNuevaFase.Visible=True
	txtNuevaFase.Text=""
	lblTitleResponsableNuevaFase.Visible=False
	txtResponsableNuevaFase.Visible=False
	txtResponsableNuevaFase.text=""
	btnSelResponsableNuevaFase.Visible=False
	lblTitleInfoAdicionalDoc.Visible=False
	txtInfoAdicionalDoc.Text=""
	txtInfoAdicionalDoc.visible=False
	btnSelInfoAdicionalDoc.Visible=False

	lblTitleNuevaFaseDestinoPreparacion.Visible=True
	btnSelNuevaFaseDestinoPreparacion.Visible=True
	txtNuevaFaseDestinoPreparacion.Text=""
	lblTitleResponsableNuevaFaseDestinoPreparacion.Visible=False
	txtResponsableNuevaFaseDestinoPreparacion.Visible=False
	txtResponsableNuevaFaseDestinoPreparacion.text=""
	btnSelResponsableNuevaFaseDestinoPreparacion.Visible=False
	lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.Visible=False
	txtInfoAdicionalNuevaFaseDestinoPreparacion.Visible=False
	txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=""
	btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion.Visible=False

	'pnlNuevaFase.Height=spnNuevaFase.Top+spnNuevaFase.Height+3dip
'	pnlNuevaFase.Height=btnNuevaFase.Top+btnNuevaFase.Height+5dip
'	pnlNuevaFase.Visible=True
'	pnlFaseAdicional.Top=pnlNuevaFase.Top+pnlNuevaFase.Height+5dip
'	pnlFaseAdicional.Height=btnNuevaFaseDestinoPreparacion.Top+btnNuevaFaseDestinoPreparacion.Height+5dip
'	pnlFaseAdicional.Visible=False
'	pnlBtnsNuevaFase.Visible=True
'	pnlBtnsNuevaFase.Height=45dip

	pnlNuevaFaseComplementaria.Visible=False
End Sub
'''
Sub ResetNuevaFaseAdicional
	mNuevaFaseDocumento.IDRespFaseDest=0
	mNuevaFaseDocumento.IDInfoAdicionalFaseDest=0
	mNuevaFaseDocumento.NumExpFaseAdicional=""
	mNuevaFaseDocumento.IDFaseDest=0

	lblTitleNuevaFaseDestinoPreparacion.Visible=True
	btnSelNuevaFaseDestinoPreparacion.Visible=True
	txtNuevaFaseDestinoPreparacion.Text=""
	lblTitleResponsableNuevaFaseDestinoPreparacion.Visible=False
	txtResponsableNuevaFaseDestinoPreparacion.Visible=False
	txtResponsableNuevaFaseDestinoPreparacion.text=""
	btnSelResponsableNuevaFaseDestinoPreparacion.Visible=False
	lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.Visible=False
	txtInfoAdicionalNuevaFaseDestinoPreparacion.Visible=False
	txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=""
	btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion.Visible=False
'	pnlFaseAdicional.Height=btnNuevaFaseDestinoPreparacion.Top+btnNuevaFaseDestinoPreparacion.Height+5dip
'	pnlFaseAdicional.Visible=True
End Sub

Sub PreLoadDatosCls(tipoQuery As Int, sClsSource As String, ID As Int)
	TipoQryCls=tipoQuery
	stringSourceTableCls=sClsSource
	IDDatosCls=ID
	'SourceTableCls=sf.SplitGetWord(sf.Right(sClsSource,sf.len(sClsSource)-sf.InString(sClsSource,"from"))," ",2)
	Dim lstClsS As List= Regex.Split(" ",sClsSource.SubString(sClsSource.IndexOf("from")+5))
	SourceTableCls=lstClsS.Get(0)
	
	If mSQL.ExecQuerySingleResult("select count(*) from " & SourceTableCls)=0 Then
		CallSub(Me,SourceTableCls)
	Else
		LoadDatosB4xSearchList(tipoQuery, sClsSource, ID)
	End If
	
End Sub


Sub LoadDatosB4xSearchList(TipoQuery As Int, sClsSource As String, ID As Int)

	Dim rs As ResultSet
	If TipoQuery=1 Then
		rs=mSQL.ExecQuery(sClsSource)
	Else
		rs=mSQL.ExecQuery2(sClsSource,Array As String(ID))
	End If
	
	Dim lstOpcionesMap As List
	lstOpcionesMap.Initialize
	
	Dim lstOpciones As List
	lstOpciones.Initialize

	Do While rs.NextRow
		Dim mSel As Map
		mSel.Initialize
		mSel.Put("ID",rs.getint2(0))
		mSel.Put("Sel",rs.getstring2(1))
		lstOpcionesMap.Add(mSel)
		lstOpciones.Add(rs.getstring2(1))
	Loop
	rs.Close
	
	Dialog.Title="Selecciona Opción"
	Dialog.TitleBarHeight=50dip
	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'	Dim B4XListDlg As B4XListTemplate
'	B4XListDlg.Initialize
	
	Dim B4XSearchListDlg As B4XSearchTemplate
	B4XSearchListDlg.Initialize
	B4XSearchListDlg.SetItems(lstOpciones)
	B4XSearchListDlg.SearchField.HintText="Buscar"
	B4XSearchListDlg.SearchField.Update
	B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XSearchListDlg,"","","Cancelar")
'		Dim btOKDlg As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'		btOKDlg.TextSize=14
	Dim btCancelDlg As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	btCancelDlg.TextSize=14
	'AnimateDialog(Dialog,"top")
	
	Utilidades.SetLightThemeDialog(Dialog)
	Utilidades.SetLightThemeSearch(B4XSearchListDlg)
	
	Dim TextSize As Float = 18 'FLOAT
	Dim xclv As CustomListView=B4XSearchListDlg.CustomListView1
	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
	



	B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParent.Height)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XSearchListDlg, "", "", "Cancelar")
	
'	For i=0 To lstOpciones.size-1
'		xclv.ResizeItem(i,60dip)
'	Next

	Dim dlbl As Label=xclv.DesignerLabel
	dlbl.TextSize=TextSize
	Dim lblB4Xv As B4XView=dlbl
	lblB4Xv.SetTextAlignment("CENTER","LEFT")
	
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	If bCancel.IsInitialized Then
		bCancel.Left=bCancel.Left-50dip
		bCancel.Width=bCancel.Width+30dip
		bCancel.TextSize=18
	End If
	
	Wait For (rSub) Complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then Return
	
	Dim sOpcionSel As String=B4XSearchListDlg.SelectedItem
	Dim IndexSel As Int=lstOpciones.IndexOf(sOpcionSel)
	Dim mDataSel As Map=lstOpcionesMap.Get(IndexSel)
	Dim IDSel As Int=mDataSel.Get("ID")
	
''''	Select Case DatosSeleccionados
''''		Case "ResponsableNuevaFase"
''''			mNuevaFaseDocumento.IDRespFase=IDSel
''''			Dim ResponsableNuevaFase As String=sOpcionSel
''''			txtResponsableNuevaFase.Text=ResponsableNuevaFase
''''			If mNuevaFaseDocumento.IDFase=15 And mNuevaFaseDocumento.IDRespFase<>0 Then
''''				FaseAdicionalVisible(True)
''''				'pnlFaseAdicional.Top=pnlNuevaFase.Top+pnlNuevaFase.Height+5dip
''''			Else
''''				FaseAdicionalVisible(False)
''''			End If
''''		Case "InfoAdicionalFase"
''''			
''''	End Select

	ActualizarDatosOpcionSeleccionada(IDSel,sOpcionSel)
	
End Sub


Sub ActualizarDatosOpcionSeleccionada(ID As Int, TextoOpcionSeleccionada As String)
	Select True
		Case DatosSeleccionados="NuevaFase" 
			If ID>0 Then
				ResetNuevaFase(False)
				mNuevaFaseDocumento.IDFase=ID
				txtNuevaFase.Text=TextoOpcionSeleccionada
				Dim ResponsableNuevaFaseVisible As Boolean
				If mSQL.ExecQuerySingleResult2("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase, mTipoDocumento))=0 Then
					ResponsableNuevaFaseVisible =False
				Else
					ResponsableNuevaFaseVisible=True
				End If
				lblTitleResponsableNuevaFase.Visible=ResponsableNuevaFaseVisible
				txtResponsableNuevaFase.Visible = ResponsableNuevaFaseVisible
				btnSelResponsableNuevaFase.Visible = ResponsableNuevaFaseVisible
		    
				If ResponsableNuevaFaseVisible Then
					lblTitleResponsableNuevaFase.Text=mSQL.ExecQuerySingleResult2("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=?  and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento))
'					pnlNuevaFase.Height=btnResponsableNuevaFase.Top+btnResponsableNuevaFase.Height+5dip
'					lblInfoAdicional.Top=btnResponsableNuevaFase.Top+btnResponsableNuevaFase.Height+5dip
				Else
					lblTitleResponsableNuevaFase.Text=""
					'lblInfoAdicional.Top=btnNuevaFase.top+btnNuevaFase.Height+5dip
				End If
		   		Dim InfoAdicionalNuevaFaseVisible As Boolean
				If mSQL.ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento))+mSQL.ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento))=0 Then
					InfoAdicionalNuevaFaseVisible=False
				Else
					InfoAdicionalNuevaFaseVisible=True
				End If
				If InfoAdicionalNuevaFaseVisible=False Then
					lblTitleInfoAdicionalDoc.Visible =False
					txtInfoAdicionalDoc.Visible=False
					txtInfoAdicionalDoc.Text=""
					btnSelInfoAdicionalDoc.Visible=False
				Else
					lblTitleInfoAdicionalDoc.text = mSQL.ExecQuerySingleResult2("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento))
					lblTitleInfoAdicionalDoc.Visible =True
					'btnInfoAdicionalNuevaFase.Top=lblInfoAdicional.Top+lblInfoAdicional.Height
					txtInfoAdicionalDoc.Visible=True
					txtInfoAdicionalDoc.text=""
					btnSelInfoAdicionalDoc.Visible=True
					'pnlNuevaFase.Height=btnInfoAdicionalNuevaFase.Top+btnInfoAdicionalNuevaFase.Height+5dip
				End If
				txtInfoAdicionalDoc.Text=""
				'btnInfoAdicionalNuevaFase.Enabled = btnInfoAdicionalNuevaFase.Visible

'				If IDFaseSel<>15 Then
'					pnlFaseAdicional.Visible=False
'				Else
'					pnlFaseAdicional.Visible=True
'				End If
			Else
				ResetNuevaFase(False)
			End If
			
		Case DatosSeleccionados="ResponsableNuevaFase"
'			Dim lbl As Label
'			lbl.Initialize("")
'			lbl=pnl.GetView(0)
			mNuevaFaseDocumento.IDRespFase=ID
			txtResponsableNuevaFase.Text=TextoOpcionSeleccionada
			If mNuevaFaseDocumento.IDFase=15 And mNuevaFaseDocumento.IDRespFase<>0 Then
				pnlNuevaFaseComplementaria.Visible=True
				'pnlFaseAdicional.Top=pnlNuevaFase.Top+pnlNuevaFase.Height+5dip
			Else
				pnlNuevaFaseComplementaria.Visible=False
			End If
			
		Case DatosSeleccionados="InfoAdicionalNuevaFase"
'			Dim lbl As Label
'			lbl.Initialize("")
'			lbl=pnl.GetView(0)
			mNuevaFaseDocumento.IDInfoAdicionalFase=ID
			txtInfoAdicionalDoc.Text=TextoOpcionSeleccionada
			
		Case DatosSeleccionados="NuevaFaseAdicional"
			If ID>0 Then
				ResetNuevaFaseAdicional
'				Dim lbl As Label
'				lbl.Initialize("")
'				lbl=pnl.GetView(0)
				mNuevaFaseDocumento.IDFaseDest=ID
				txtNuevaFaseDestinoPreparacion.Text=TextoOpcionSeleccionada
				Dim ResponsableFaseDestinoPreparacionVisible As Boolean
				If mSQL.ExecQuerySingleResult2("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest,mTipoDocumento))=0 Then
					ResponsableFaseDestinoPreparacionVisible =False
				Else
					ResponsableFaseDestinoPreparacionVisible =True
				End If
				lblTitleResponsableNuevaFaseDestinoPreparacion.visible=ResponsableFaseDestinoPreparacionVisible
				txtResponsableNuevaFaseDestinoPreparacion.Visible = ResponsableFaseDestinoPreparacionVisible
				btnSelResponsableNuevaFaseDestinoPreparacion.Visible = ResponsableFaseDestinoPreparacionVisible
		    
				If ResponsableFaseDestinoPreparacionVisible Then
					lblTitleResponsableNuevaFaseDestinoPreparacion.Text =mSQL.ExecQuerySingleResult2("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest,mTipoDocumento))
					'pnlFaseAdicional.Height=btnResponsableNuevaFaseDestinoPreparacion.Top+btnResponsableNuevaFaseDestinoPreparacion.Height+5dip
					'lblInfoAdicionalDestinoPreparacion.Top=btnResponsableNuevaFaseDestinoPreparacion.Top+btnResponsableNuevaFaseDestinoPreparacion.Height+5dip
				Else
					'lblInfoAdicionalDestinoPreparacion.Top=btnNuevaFaseDestinoPreparacion.top+btnNuevaFaseDestinoPreparacion.Height+5dip
				End If
		   
				Dim InfoAdicionalDestinoPreparacionVisible As Boolean
				If mSQL.ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest,mTipoDocumento))+mSQL.ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest,mTipoDocumento))=0 Then
					InfoAdicionalDestinoPreparacionVisible=False
				Else
					InfoAdicionalDestinoPreparacionVisible=True
				End If
				If InfoAdicionalDestinoPreparacionVisible=False Then
					lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.Visible =False
					txtInfoAdicionalNuevaFaseDestinoPreparacion.Visible=False
					btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion.Visible=False
				Else
					lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.text = mSQL.ExecQuerySingleResult2("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest,mTipoDocumento))
					lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.Visible =True
					'btnInfoAdicionalDocDestinoPreparacion.Top=lblInfoAdicionalDestinoPreparacion.Top+lblInfoAdicionalDestinoPreparacion.Height
					txtInfoAdicionalNuevaFaseDestinoPreparacion.Visible=True
					btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion.Visible=True
'					pnlFaseAdicional.Top=pnlNuevaFase.Top+pnlNuevaFase.Height+5dip
'					pnlFaseAdicional.Height=btnInfoAdicionalDocDestinoPreparacion.Top+btnInfoAdicionalDocDestinoPreparacion.Height+5dip
				
				End If
				txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=""
				'btnInfoAdicionalDocDestinoPreparacion.Enabled = btnInfoAdicionalDocDestinoPreparacion.Visible

				'				If IDFaseSel<>15 Then
				'					pnlFaseAdicional.Visible=False
				'				Else
				'					pnlFaseAdicional.Visible=True
				'				End If
			Else
				ResetNuevaFaseAdicional
			End If
			
		Case DatosSeleccionados="ResponsableFaseAdicional"
'			Dim lbl As Label
'			lbl.Initialize("")
'			lbl=pnl.GetView(0)
			mNuevaFaseDocumento.IDRespFaseDest=ID
			txtResponsableNuevaFaseDestinoPreparacion.Text=TextoOpcionSeleccionada
			
		Case DatosSeleccionados="InfoAdicionalFaseAdicional"
'			Dim lbl As Label
'			lbl.Initialize("")
'			lbl=pnl.GetView(0)
			mNuevaFaseDocumento.IDInfoAdicionalFaseDest=ID
			txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=TextoOpcionSeleccionada
				
	End Select
	
End Sub

Private Sub btnSelNuevaFase_Click
	SeleccionarNuevaFase
End Sub

Sub SeleccionarNuevaFase
	'If txtFechaNuevaFase.Text="" Then
	If mNuevaFaseDocumento.FechaFase=0 Then
		Dim msa As Object=xui.MsgboxAsync("Selecciona antes la fecha de la nueva fase.","Aviso")
		Wait For (msa) Msgbox_Result
		SeleccionarFechaNuevaFase
		Return
	End If
	
	If mNuevaFaseDocumento.IDFase<>0 Then
		Dim msa As Object = xui.Msgbox2Async("¿Seleccionar otra fase?", "Confirma", "Sí", "", "No", Null)
		Wait For (msa) Msgbox_Result (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		
'		txtNuevaFase.Text=""
'		mNuevaFaseDocumento.IDFase=-1
	End If
	
	ResetNuevaFase(False)
	ResetNuevaFaseAdicional
	pnlNuevaFaseComplementaria.Visible=False
	
	DatosSeleccionados="NuevaFase"
	If mDestinatarioTaller Then
		LoadDatosB4xSearchList(1,"SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='" & mTipoDocumento & "' and DestinoTaller<>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial",0)
	Else
		LoadDatosB4xSearchList(1,"SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='" & mTipoDocumento & "' and IDFase>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial",0)
	End If
'''''	Return
'''''	
'''''	Dim lstOpciones As List
'''''	lstOpciones.Initialize
'''''	Dim rs As ResultSet=mSQL.ExecQuery2("select * from tblFasesDoc where TipoOrigenDoc=?",Array As String(mTipoDocumento))
'''''	Do While rs.NextRow
'''''		lstOpciones.Add(rs.GetString("Fase"))
'''''	Loop
'''''	rs.Close
'''''	
'''''	Dialog.Title="Selecciona Fase"
'''''	Dialog.TitleBarHeight=60dip
'''''	Dialog.TitleBarFont=xui.CreateDefaultFont(18)
'''''	Dialog.ButtonsFont=xui.CreateDefaultFont(20)
'''''	Dim B4XListDlg As B4XListTemplate
'''''	B4XListDlg.Initialize
'''''	
'''''	Utilidades.SetLightThemeList(B4XListDlg)
'''''
'''''	Dim TextSize As Float = 18 'FLOAT
'''''	Dim xclv As CustomListView=B4XListDlg.CustomListView1
'''''	xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gray
'''''	
'''''	Dim dlbl As Label=xclv.DesignerLabel
'''''	dlbl.TextSize=TextSize
'''''	Dim lblB4Xv As B4XView=dlbl
'''''	lblB4Xv.SetTextAlignment("CENTER","LEFT")
'''''
'''''	B4XListDlg.Options=lstOpciones
'''''	
'''''	B4XListDlg.Resize(400dip,0.80*Dialog.mParent.Height)
'''''	
'''''	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XListDlg, "", "", "Cancelar")
'''''	
'''''	For i=0 To lstOpciones.size-1
'''''		xclv.ResizeItem(i,60dip)
'''''	Next
'''''	
'''''	' OJO ... es un B4XView no Button
'''''	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
'''''	If bCancel.IsInitialized Then
'''''		'Log("bCancel" & bCancel.Text)
'''''		bCancel.Left=bCancel.Left-50dip
'''''		bCancel.Width=bCancel.Width+30dip
'''''		bCancel.TextSize=18
'''''	End If
'''''	
'''''	Wait For (rSub) Complete (rInt As Int)
'''''	If rInt<>xui.DialogResponse_Positive Then Return
'''''	Dim NombreFaseSel As String=B4XListDlg.SelectedItem
'''''	
'''''	txtNuevaFase.Text=NombreFaseSel
'''''	
'''''	mNuevaFaseDocumento.IDFase=mSQL.ExecQuerySingleResult2("select IDFase from tblFasesDoc where Fase=?",Array As String(NombreFaseSel))
'''''	
'''''	txtResponsableNuevaFase.Text=""
'''''	Dim ResponsableVisible As Boolean=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento)))=1
'''''	
'''''	lblTitleResponsableNuevaFase.Visible =ResponsableVisible
'''''	txtResponsableNuevaFase.Visible = ResponsableVisible
'''''	txtResponsableNuevaFase.Enabled =ResponsableVisible
'''''	btnSelResponsableNuevaFase.Visible=ResponsableVisible
'''''	
'''''	'''	If ResponsableVisible Then
'''''	'''		Me.cboResponsableNuevaFase.RowSource = Nz(DLookup("OrigenFilacboResponsable", "tblFasesDoc", "IDFase=" & Me.cboNuevaFase & " and TipoOrigenDoc='" & TipoOrigenDoc & "'"), "")
'''''	'''		Me.cboResponsableNuevaFase.LimitToList = Nz(DLookup("LimitarAListaResponsable", "tblFasesDoc", "IDFase=" & Me.cboNuevaFase & " and TipoOrigenDoc='" & TipoOrigenDoc & "'"), True)
'''''	'''	End If
'''''	If ResponsableVisible Then
'''''		lblTitleResponsableNuevaFase.text = Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento)))
'''''		If lblTitleResponsableNuevaFase.text="" Then lblTitleResponsableNuevaFase.text="Responsable Fase"
'''''	End If
'''''	
'''''	txtInfoAdicionalDoc.Text = ""
'''''	Dim InfoAdicionalVisible As Boolean=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento)))=1 _
'''''		Or Utilidades.FixNullInt(mSQL.ExecQuery2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento)))=1
'''''	lblTitleInfoAdicionalDoc.Visible=InfoAdicionalVisible
'''''	txtInfoAdicionalDoc.Visible=InfoAdicionalVisible
'''''	btnSelInfoAdicionalDoc.Visible=InfoAdicionalVisible
'''''	
'''''	If InfoAdicionalVisible Then
'''''		lblTitleInfoAdicionalDoc.Text = Utilidades.FixNull(mSQL.ExecQuerySingleResult2("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?", Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento)))
'''''		If lblTitleInfoAdicionalDoc.text="" Then lblTitleInfoAdicionalDoc.text="Información adicional"
'''''	End If
'''''	
'''''	'''	Me.cboInfoAdicionalDoc.Visible = Nz(DLookup("cboInfoAdicionalVisible", "tblFasesDoc", "IDFase=" & Me.cboNuevaFase & " and TipoOrigenDoc='" & TipoOrigenDoc & "'"), False)
'''''	'''	Me.cboInfoAdicionalDoc.Enabled = Me.cboInfoAdicionalDoc.Visible
'''''	'''	If Me.cboInfoAdicionalDoc.Enabled Then
'''''	'''		Me.cboInfoAdicionalDoc.RowSource = Nz(DLookup("OrigenFilacboInfoAdicional", "tblFasesDoc", "IDFase=" & Me.cboNuevaFase & " and TipoOrigenDoc='" & TipoOrigenDoc & "'"), "")
'''''	'''		Me.cboInfoAdicionalDoc.LimitToList = Nz(DLookup("LimitarAListaInfoAdicional", "tblFasesDoc", "IDFase=" & Me.cboNuevaFase & " and TipoOrigenDoc='" & TipoOrigenDoc & "'"), True)
'''''	'''	End If
'''''	'''
'''''	'''	Me.txtInfoAdicionalDoc.Visible = Nz(DLookup("txtInfoAdicionalVisible", "tblFasesDoc", "IDFase=" & Me.cboNuevaFase & " and TipoOrigenDoc='" & TipoOrigenDoc & "'"), False)
'''''	
''''''	If Me.cboResponsableNuevaFase.Visible Then
''''''		Me.cboInfoAdicionalDoc.Left = Me.cboResponsableNuevaFase.Left + Me.cboResponsableNuevaFase.Width + 50
''''''		Me.txtInfoAdicionalDoc.Left = Me.cboResponsableNuevaFase.Left + Me.cboResponsableNuevaFase.Width + 50
''''''	Else
''''''		Me.cboInfoAdicionalDoc.Left = Me.cboResponsableNuevaFase.Left
''''''		Me.txtInfoAdicionalDoc.Left = Me.cboResponsableNuevaFase.Left
''''''	End If
''''''	Me.lblInfoAdicional.Left = Me.cboInfoAdicionalDoc.Left
''''''	
''''''	If Me.cboInfoAdicionalDoc.Visible Then
''''''		Me.cboInfoAdicionalDoc.SetFocus
''''''		Me.cboInfoAdicionalDoc.Dropdown
''''''	End If
''''''	If Me.cboResponsableNuevaFase.Visible Then
''''''		Me.cboResponsableNuevaFase.SetFocus
''''''		Me.cboResponsableNuevaFase.Dropdown
''''''	End If
'''''	If mNuevaFaseDocumento.IDFase <> 15 Then
'''''		FaseAdicionalVisible(False)
'''''	End If
End Sub


Sub FaseAdicionalVisible(Visible As Boolean)
'	lblTitleNuevaFaseDestinoPreparacion.Visible=Visible
'	txtNuevaFaseDestinoPreparacion.Visible=Visible
'	btnSelNuevaFaseDestinoPreparacion.Visible=Visible
'	
'	lblTitleResponsableNuevaFaseDestinoPreparacion.Visible=Visible
'	txtResponsableNuevaFaseDestinoPreparacion.Visible=Visible
'	btnSelResponsableNuevaFaseDestinoPreparacion.Visible=Visible
'	
'	lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.Visible=Visible
'	txtTitleInfoAdicionalNuevaFaseDestinoPreparacion.Visible=Visible
'	btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion.Visible=Visible

	pnlNuevaFaseComplementaria.Visible=Visible
End Sub

Private Sub btnSelNuevaFaseDestinoPreparacion_Click
	DatosSeleccionados="NuevaFaseAdicional"
	'If DestinatarioTallerInterno Then
	If mDestinatarioTaller Then
		LoadDatosB4xSearchList(1,"SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='" & mTipoDocumento & "' and DestinoTaller<>0 and DestinoPreparacion<>0 and IDFase=16 ORDER BY tblFasesDoc.OrdenSecuencial",0)
	Else
		LoadDatosB4xSearchList(1,"SELECT IDFase, Fase FROM tblFasesDoc where  TipoOrigenDoc='" & mTipoDocumento & "' and DestinoPreparacion<>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial",0)
	End If
End Sub

Private Sub btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click
	Select True
		Case mSQL.ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest, mTipoDocumento))<>0
			Dim sRowSource As String
			sRowSource=mSQL.ExecQuerySingleResult2("select OrigenFilacboInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest, mTipoDocumento))
			sRowSource=sRowSource.Replace("=true","<>0")
			DatosSeleccionados="InfoAdicionalFaseAdicional"
			PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.IDFaseDest)
		Case mSQL.ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFaseDest,mTipoDocumento))<>0
'			ResetVariables.ResetDatosScanner
'			Starter.DatosScanner.ScanEnabled=True
'			Starter.DatosScanner.ScanMsg="Escanea " & lblInfoAdicionalDestinoPreparacion.text
'			lblScan.Text=Starter.DatosScanner.ScanMsg
'			Starter.DatosScanner.ScanTxtField=Starter.DatosScanner.ScanMsg.Replace("Escanea","Indica")
'			Starter.DatosScanner.ScanValue=""
'			Starter.DatosScanner.ScanField="InfoAdicionalFaseAdicional"
'			Starter.DatosScanner.ModuloScan=Me
'			If pnlFondoMainFasesDocumento.IsInitialized Then
'				pnlFondoMainFasesDocumento.Visible=False
'			End If
'			pnlFondoScan.Visible=True
'			txtScan.RequestFocus
			Dialog.Title="Selecciona " & lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.Text
			Dialog.TitleBarHeight=50dip
			Dim InputDlg As B4XInputTemplate
			InputDlg.Initialize
			InputDlg.lblTitle.Text=""
			InputDlg.Text=""
'			Dim MaxNumChar As Int=100
'			InputDlg.RegexPattern="^.{" & 0 & "," & MaxNumChar & "}$"
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
			If rInt<>xui.DialogResponse_Positive Then Return
			
			Dim sInfoAdicionalDocDestinoPreparacion As String=InputDlg.Text
			
			txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=sInfoAdicionalDocDestinoPreparacion
			mNuevaFaseDocumento.NumExpFaseAdicional=sInfoAdicionalDocDestinoPreparacion
			'pnlFondoMainFasesDocumento.Visible=True
	End Select
End Sub

Private Sub btnSelInfoAdicionalDoc_Click
	If txtNuevaFase.Text="" Then
		Dim msa As Object=xui.MsgboxAsync("Selecciona antes la fase.","Aviso")
		Wait For (msa) Msgbox_Result
		SeleccionarNuevaFase
		Return
	End If
	
	
	Select True
		Case mSQL.ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase, mTipoDocumento))<>0
			Dim sRowSource As String
			sRowSource=mSQL.ExecQuerySingleResult2("select OrigenFilacboInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase, mTipoDocumento))
			sRowSource=sRowSource.Replace("=true","<>0")
			DatosSeleccionados="InfoAdicionalNuevaFase"
			PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.IDFase)
			
		Case mSQL.ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",Array As String(mNuevaFaseDocumento.IDFase,mTipoDocumento))<>0
			
			Dialog.Title="Selecciona " & lblTitleInfoAdicionalDoc.Text
			Dialog.TitleBarHeight=50dip
			
			Dim InputDlg As B4XInputTemplate
			InputDlg.Initialize
			InputDlg.lblTitle.Text=""
			InputDlg.Text=""
'			Dim MaxNumChar As Int=100
'			InputDlg.RegexPattern="^.{" & 0 & "," & MaxNumChar & "}$"
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
			If rInt<>xui.DialogResponse_Positive Then Return
			
		'Dim NuevasObs As String=InputDlg.Text
			
			Dim sInfoAdicionalDoc As String=InputDlg.Text
			
			txtInfoAdicionalDoc.Text=sInfoAdicionalDoc
			mNuevaFaseDocumento.NumExpFaseActual=sInfoAdicionalDoc
	End Select
			
End Sub

Private Sub btnSelFechaNuevaFase_Click
	SeleccionarFechaNuevaFase
End Sub

Sub SeleccionarFechaNuevaFase
	Dialog.Title="Indica Fecha Nueva Fase"
	'Dialog.TitleBarHeight=80dip
	Dim B4XDateDlg As B4XDateTemplate
	B4XDateDlg.Initialize
	If mNuevaFaseDocumento.FechaFase=0 Then
		B4XDateDlg.Date=DateTime.Now
	Else
		B4XDateDlg.Date=mNuevaFaseDocumento.FechaFase
	End If
	B4XDateDlg.CloseOnSelection=True
	B4XDateDlg.FirstDay=1
	
	Utilidades.SetLightThemeDialog(Dialog)
	Utilidades.SetLightThemeDate(B4XDateDlg)
	
	Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XDateDlg,"","","Cancelar")
'	Dim bOK As B4XView=Dialog.GetButton(xui.DialogResponse_Positive)
'	bOK.TextSize=15
	Dim bCancel As B4XView=Dialog.GetButton(xui.DialogResponse_Cancel)
	bCancel.TextSize=15
	bCancel.Left=bCancel.Left-20dip
	bCancel.Width=bCancel.Width+20dip
	Wait For (rSub) complete (rInt As Int)
	If rInt<>xui.DialogResponse_Positive Then
		Return
	End If
	mNuevaFaseDocumento.FechaFase=B4XDateDlg.Date
	
	Dim DateFormatAnt As String=DateTime.DateFormat
	DateTime.DateFormat="dd/MM/yyyy"

	
	txtFechaNuevaFase.Text=DateTime.Date(mNuevaFaseDocumento.FechaFase)
	DateTime.DateFormat=DateFormatAnt
	
End Sub

Private Sub btnSelDocumento_Click
'	Wait For (GetDateFromHeaders("https://www.google.com")) Complete (Time As Long)
'	If Time <> 0 Then
'		Log($"Network time: $DateTime{Time}"$)
'	End If
End Sub

Private Sub btnGrabarNuevaFase_Click
	btnGrabarNuevaFase.Enabled=False
	Wait For(checkNuevosDatosOk) complete (rBool As Boolean)
	If rBool Then
		Dim DateFormatAnt As String=DateTime.DateFormat
		DateTime.DateFormat="yyyy-MM-dd"
		Dim Fn As String=DateUtils.TicksToString(mNuevaFaseDocumento.FechaFase)
		DateTime.DateFormat=DateFormatAnt
		
		If mNuevaFaseDocumento.IDFase = 15 Then
			'sSQL = "Call NuevaFasePreparacionDoc('" & DocumentoFases & "', "
			'sSQL = sSQL & IDFaseSel & ", " & IDRespFaseSel & ", '" & btnResponsableNuevaFase.Text
			'sSQL = sSQL & "', " & IDFaseDestSel
			'sSQL = sSQL & ", '" & Format(FechaFase, "yyyy-mm-dd hh:mm:ss") & "'," & IDRespFaseDestSel & ", '" & btnNuevaFaseDestinoPreparacion.Text
			'sSQL = sSQL & ", '" & FechaFase & "'," & IDRespFaseDestSel & ", '" & btnResponsableNuevaFaseDestinoPreparacion.Text
			If mNuevaFaseDocumento.IDInfoAdicionalFase<>0 Then
				'sSQL = sSQL & "', " & IDInfoAdicionalFaseSel & ", null, 1,0)"
				If mDestinatarioTaller Then
					wait for(RegistroPreparacionRTFab(mNuevaFaseDocumento.IDFase,mNuevaFaseDocumento.IDRespFase,txtResponsableNuevaFase.Text,mNuevaFaseDocumento.IDFaseDest, _
						Fn,mNuevaFaseDocumento.IDRespFaseDest,txtResponsableNuevaFaseDestinoPreparacion.Text,mNuevaFaseDocumento.IDInfoAdicionalFase,"",mOrdenFab)) complete (sResp As String)
					If sResp="OK" Then
						NuevaFaseDocumentoRegistrada=True
						SalirModulo
						Return
					End If
				Else
					wait for(RegistroPreparacion(mNuevaFaseDocumento.IDFase,mNuevaFaseDocumento.IDRespFase,txtResponsableNuevaFase.Text,mNuevaFaseDocumento.IDFaseDest, _
						Fn,mNuevaFaseDocumento.IDRespFaseDest,txtResponsableNuevaFaseDestinoPreparacion.Text,mNuevaFaseDocumento.IDInfoAdicionalFase,"")) complete (sResp As String)
					If sResp="OK" Then
						NuevaFaseDocumentoRegistrada=True
						SalirModulo
						Return
					End If
				End If
				Return
			Else
				If mDestinatarioTaller Then
					wait for(RegistroPreparacionRTFab(mNuevaFaseDocumento.IDFase,mNuevaFaseDocumento.IDRespFase,txtResponsableNuevaFase.Text,mNuevaFaseDocumento.IDFaseDest, _
						Fn,mNuevaFaseDocumento.IDRespFaseDest,txtResponsableNuevaFaseDestinoPreparacion.Text,0, mNuevaFaseDocumento.NumExpFaseAdicional,mOrdenFab)) complete (sResp As String)
					If sResp="OK" Then
						NuevaFaseDocumentoRegistrada=True
						SalirModulo
						Return
					End If

				Else
					wait for(RegistroPreparacion(mNuevaFaseDocumento.IDFase,mNuevaFaseDocumento.IDRespFase,txtResponsableNuevaFase.Text,mNuevaFaseDocumento.IDFaseDest, _
						Fn,mNuevaFaseDocumento.IDRespFaseDest,txtResponsableNuevaFaseDestinoPreparacion.Text,0,mNuevaFaseDocumento.NumExpFaseAdicional)) complete (sResp As String)
					If sResp="OK" Then
						NuevaFaseDocumentoRegistrada=True
						SalirModulo
						Return
					End If
				End If
				Return
			End If
'			If NumExpFaseAdicional<>"" Then
'				'sSQL = sSQL & "', 0, '" & NumExpFaseActual & "',1,0)"
'				RegistroPreparacion(IDFaseSel,IDRespFaseSel,btnResponsableNuevaFase.Text,IDFaseDestSel,Fn,IDRespFaseDestSel,btnResponsableNuevaFaseDestinoPreparacion.Text,0,NumExpFaseAdicional)
'				Return
'			End If
'			If btnInfoAdicionalDocDestinoPreparacion.Visible = False Then
'				sSQL = sSQL & "', 0, null, 1, 0)"
'				RegistroPreparacion(IDFaseSel,IDRespFaseSel,btnResponsableNuevaFase.Text,IDFaseDestSel,Fn,IDRespFaseDestSel,btnResponsableNuevaFaseDestinoPreparacion.Text,0,"")
'				Return
'			End If
		Else
			'sSQL = "Call NuevaFaseDoc('" & DocumentoFases & "', "
			'sSQL = sSQL & IDFaseSel & ", '" & FechaFase & "'," & IDRespFaseSel & ", '" & btnResponsableNuevaFase.Text
			If mNuevaFaseDocumento.IDInfoAdicionalFase>0 Then
				'sSQL = sSQL & "', " & IDInfoAdicionalFaseSel & ", null, 1,0)"
				wait for(RegistroNuevaFase(mNuevaFaseDocumento.IDFase,Fn,mNuevaFaseDocumento.IDRespFase,txtResponsableNuevaFase.Text,mNuevaFaseDocumento.IDInfoAdicionalFase,"")) complete (sResp As String)
				If sResp="OK" Then
					NuevaFaseDocumentoRegistrada=True
					SalirModulo
					Return
				End If
				Return
			Else
				wait for(RegistroNuevaFase(mNuevaFaseDocumento.IDFase,Fn,mNuevaFaseDocumento.IDRespFase,txtResponsableNuevaFase.Text,0,mNuevaFaseDocumento.NumExpFaseActual)) complete (sResp As String)
				If sResp="OK" Then
					NuevaFaseDocumentoRegistrada=True
					SalirModulo
					Return
				End If
				Return
			End If
			'If NumExpFaseActual<>"" Then
			'sSQL = sSQL & "', 0, '" & NumExpFaseActual & "',1,0)"
			'RegistroNuevaFase(IDFaseSel,Fn,IDRespFaseSel,btnResponsableNuevaFase.Text,0,NumExpFaseActual)
			'Return
			'End If
			'If btnInfoAdicionalNuevaFase.Visible = False Then
			'sSQL = sSQL & "', 0, null, 1, 0)
			'RegistroNuevaFase(IDFaseSel,Fn,IDRespFaseSel,btnResponsableNuevaFase.Text,0,"")
			'Return
			'End If
		End If
	Else
		btnGrabarNuevaFase.Enabled=True
	End If
End Sub

Private Sub checkNuevosDatosOk As ResumableSub
	Dim checkNDatosOk As Boolean= True

	If Utilidades.FixNullLong(mNuevaFaseDocumento.FechaFase)=0 Then
		Dim msa As Object=xui.MsgboxAsync("La fecha indicada para la nueva fase no es válida","Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
	End If
    
	'If spnNuevaFase.SelectedItem ="" Then
	If Utilidades.FixNullInt(mNuevaFaseDocumento.IDFase)=0 Then
		'Msgbox ("No se ha indicado la nueva fase", "Aviso")
		Dim msa As Object=xui.MsgboxAsync("No se ha indicado la nueva fase","Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
		'Return
	End If
    
	'    If IDFaseActualDoc = 2 And Me.cboNuevaFase = 2 Then
	'        MsgBox "El documento " & Doc & " ya está asignado para preparar" & Chr(10) & Chr(13) & Chr(10) & Chr(13) & "Para asignarlo a otra persona es necesario anular el movimiento de asignación actual (botón ANULAR)", vbCritical
	'        checkNuevosDatosOk = False
	'        Exit Function
	'    End If
    
	'If spnResponsableNuevaFase.Visible And IDRespFaseSel=0 Then
	If txtResponsableNuevaFase.Visible And Utilidades.FixNullInt(mNuevaFaseDocumento.IDRespFase)=0 Then
		Dim msa As Object=xui.MsgboxAsync("No se ha indicado responsable de la fase","Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
		'Return
	End If
    
	'If spnInfoAdicionalDoc.Visible And IDInfoAdicionalFaseSel=0 Then
	If txtInfoAdicionalDoc.Visible And Utilidades.FixNullInt(mNuevaFaseDocumento.IDInfoAdicionalFase)=0 And Utilidades.FixNullInt(mNuevaFaseDocumento.IDFase)<>9 And Utilidades.FixNull(mNuevaFaseDocumento.NumExpFaseActual)="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio seleccionar información adicional para esta fase","Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
		'Return
	End If
	
	If txtInfoAdicionalDoc.Visible And Utilidades.FixNullInt(mNuevaFaseDocumento.IDInfoAdicionalFase)=0 And Utilidades.FixNullInt(mNuevaFaseDocumento.IDFase)=9 And Utilidades.FixNull(mNuevaFaseDocumento.NumExpFaseActual)="" Then
		Dim expReq As Int
		expReq=utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select RequiereNumeroExpedicion from tblTransporte where IDTransporte=?",Array As String(Utilidades.FixNullInt(mNuevaFaseDocumento.IDRespFase))))
		If expReq<>0 Then
			Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar Número de expedición para esta fase","Aviso")
			Wait For (msa) Msgbox_Result
'			Dim msa As Object=xui.MsgboxAsync("Es obligatorio seleccionar información adicional para esta fase","Aviso")
'			Wait For (msa) Msgbox_Result
			checkNDatosOk = False
		End If
		'Return
	End If
    
	If Utilidades.FixNullInt(mNuevaFaseDocumento.IDFase)=15 And Utilidades.FixNullInt(mNuevaFaseDocumento.IDFaseDest) = 0 Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio indicar el destino del documento preparado.","Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
		'Return
	End If
    
	'If spnResponsableNuevaFaseDestinoPreparacion.Visible And IDRespFaseDestSel=0 Then
	If txtResponsableNuevaFaseDestinoPreparacion.Visible And Utilidades.FixNullInt(mNuevaFaseDocumento.IDRespFaseDest)=0 Then
		Dim msa As Object=xui.MsgboxAsync("No se ha indicado " & lblTitleResponsableNuevaFaseDestinoPreparacion.text, "Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
		'Return
	End If
    
	'If spnInfoAdicionalDocDestinoPreparacion.Visible And IDInfoAdicionalFaseDestSel=0 Then
	If txtInfoAdicionalNuevaFaseDestinoPreparacion.Visible And Utilidades.FixNullInt(mNuevaFaseDocumento.IDInfoAdicionalFaseDest)=0 And Utilidades.fixnullint(mNuevaFaseDocumento.IDFaseDest)<>9 And Utilidades.FixNull(mNuevaFaseDocumento.NumExpFaseAdicional)="" Then
		Dim msa As Object=xui.MsgboxAsync("Es obligatorio seleccionar información adicional para la fase de destino de preparación", "Aviso")
		Wait For (msa) Msgbox_Result
		checkNDatosOk = False
		'Return
	End If
	
	If txtInfoAdicionalNuevaFaseDestinoPreparacion.Visible And Utilidades.FixNullInt(mNuevaFaseDocumento.IDInfoAdicionalFaseDest)=0 And Utilidades.fixnullint(mNuevaFaseDocumento.IDFaseDest)=9 And Utilidades.FixNull(mNuevaFaseDocumento.NumExpFaseAdicional)="" Then
		Dim expReq As Int
		expReq=Utilidades.FixNullint(mSQL.ExecQuerySingleResult2("select RequiereNumeroExpedicion from tblTransporte where IDTransporte=?",Array As String(Utilidades.FixNullInt(mNuevaFaseDocumento.IDRespFaseDest))))
		If expReq<>0 Then
			Dim msa As Object=xui.MsgboxAsync("Es obligatorio seleccionar información adicional para esta fase de destino de preparación", "Aviso")
			Wait For (msa) Msgbox_Result
			checkNDatosOk = False
		End If
		'Return
	End If
    
	'''''''''''''	If btnInfoAdicionalDoc.Visible And btnInfoAdicionalDoc.Text = "" And spnNuevaFase = 9 And DLookup("RequiereNumeroExpedicion", "tbltransporte", "IDTransporte=" & Me.cboResponsableNuevaFase) <> 0 Then
	'''''''''''''        Msgbox ("Es obligatorio indicar número de expedición", "Aviso")
	'''''''''''''		checkNDatosOk = False
	'''''''''''''		'Return
	'''''''''''''    End If
	'''''''''''''
	'''''''''''''	If btnInfoAdicionalDocDestinoPreparacion.Visible And btnInfoAdicionalDocDestinoPreparacion.Text = "" And spnNuevaFaseDestinoPreparacion = 9 And DLookup("RequiereNumeroExpedicion", "tbltransporte", "IDTransporte=" & spnResponsableNuevaFaseDestinoPreparacion.SelectedItem) <>"" Then
	'''''''''''''        Msgbox ("Es obligatorio indicar número de expedición", "Aviso")
	'''''''''''''		checkNDatosOk = False
	'''''''''''''		'Return
	'''''''''''''    End If
    
	'    If IDFaseActualDoc = Me.cboNuevaFase Then
	'        MsgBox "El documento " & Doc & " está actualmente en esta fase", vbInformation
	'        checkNuevosDatosOk = False
	'        Exit Function
	'    End If
	Return checkNDatosOk
End Sub

Sub RegistroPreparacion(IDFasePrep As Int, IDRFPrep As Int, RespFPrep As String, IDFase As Int,Fchmv As String, IDRFase As Int, ResponsFase As String, IDIAFase As Int, NumExpFase As String) As ResumableSub

	Dim Accion As String
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="NuevaFasePreparacionDoc"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mDocumentoSel,IDFasePrep,IDRFPrep,RespFPrep, IDFase, Fchmv,IDRFase,ResponsFase,IDIAFase,NumExpFase,1,0), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
	Else
		If mResult.Get("ReqOK")=False Then
			' aqui no se puede dar este caso
			Accion="NOK"
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible registrar la nueva fase de documento.","Error")
			Wait For (msa) Msgbox_Result
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible registrar la nueva fase de documento.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
			Else
				Dim msa As Object=xui.MsgboxAsync("Se ha registrado la nueva fase de documento.","Error")
				Wait For (msa) Msgbox_Result
				Accion="OK"
			End If

		End If
	End If
	Return Accion
	
End Sub

Sub RegistroPreparacionRTFab(IDFasePrep As Int, IDRFPrep As Int, RespFPrep As String, IDFase As Int,Fchmv As String, IDRFase As Int, ResponsFase As String, IDIAFase As Int, NumExpFase As String, PedFab As String) As ResumableSub

	Dim Accion As String
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="NuevaFasePreparacionDocRTFab"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mDocumentoSel,IDFasePrep,IDRFPrep,RespFPrep, IDFase, Fchmv,IDRFase,ResponsFase,IDIAFase,NumExpFase,1,0,PedFab), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
	Else
		If mResult.Get("ReqOK")=False Then
			' aqui no se puede dar este caso
			Accion="NOK"
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible registrar la nueva fase de documento.","Error")
			Wait For (msa) Msgbox_Result
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible registrar la nueva fase de documento.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
			Else
				Accion="OK"
				Dim msa As Object=xui.MsgboxAsync("Se ha registrado la nueva fase de documento.","Error")
				Wait For (msa) Msgbox_Result
			End If

		End If
	End If
	Return Accion
End Sub

Sub RegistroNuevaFase(IDFase As Int,Fchmv As String, IDRFase As Int, ResponsFase As String, IDIAFase As Int, NumExpFase As String) As ResumableSub

	
	Dim Accion As String
	Dim sLinkJRDC As String=Main.rdclinkMySqlDatosComunes
	Dim Comando As String="NuevaFaseDoc"
	
	JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mTipoDocumento, mDocumentoSel,IDFase,Fchmv,IDRFase,ResponsFase,IDIAFase,NumExpFase,1,0), Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
	Else
		If mResult.Get("ReqOK")=False Then
			' aqui no se puede dar este caso
			Accion="NOK"
			Dim msa As Object=xui.MsgboxAsync("No ha sido posible registrar la nueva fase de documento.","Error")
			Wait For (msa) Msgbox_Result
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mResp As Map=lstReg.Get(0)
			Dim sResp As String=mResp.GetValueAt(0)
			If sResp.ToUpperCase.StartsWith("ERR") Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible registrar la nueva fase de documento.","Error")
				Wait For (msa) Msgbox_Result
				Accion="NOK"
			Else
				Accion="OK"
				Dim msa As Object=xui.MsgboxAsync("Se ha registrado la nueva fase de documento.","Error")
				Wait For (msa) Msgbox_Result
			End If

		End If
	End If
	Return Accion
	
End Sub


Private Sub btnCancelarGrabarNuevaFase_Click
	If txtFechaNuevaFase.Text="" Then

		 SalirModulo
		 Return
	End If
	
	Dim msa As Object = xui.Msgbox2Async("¿Salir sin grabar la nueva fase?", "", "Sí", "", "No", Null)
	Wait For (msa) Msgbox_Result (rInt As Int)
	If rInt=xui.DialogResponse_Positive Then
		 SalirModulo
		 Return
	End If

End Sub

'Obtiene la hora de internet
'<code>
'Wait For (GetDateFromHeaders("https://www.google.com")) Complete (Time As Long)
'If Time <> 0 Then
'    Log($"Network time: $DateTime{Time}"$)
'End If
'</code>
Sub GetDateFromHeaders (Url As String) As ResumableSub
    Dim j As HttpJob
    j.Initialize("", Me)
    j.Download(Url)
    Dim res As Long
    Wait For (j) JobDone(j As HttpJob)
    If j.Success Then
        If j.Response.GetHeaders.ContainsKey("date") Then
            Dim date As String = j.Response.GetHeaders.Get("date")
            date = date.Replace("[", "").Replace("]", "")
            Dim f As String = DateTime.DateFormat
            Try
                DateTime.DateFormat = "EEE, dd MMM yyyy HH:mm:ss z"
                res = DateTime.DateParse(date)
            Catch
                Log(LastException)
            End Try
            DateTime.DateFormat = f
        End If
    End If
    j.Release
    Return res
End Sub

Sub tblTransporte
	Wait For(ActualizarTransportes) complete (Accion As String)
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	LoadDatosB4xSearchList(TipoQryCls, stringSourceTableCls, IDDatosCls)
End Sub


Sub ActualizarTransportes As ResumableSub
	
	mSQL.ExecNonQuery("DELETE from tblTransporte")
	Dim Accion As String

	
	Dim Comando As String="Transportes"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
	Else
		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			Dim msa As Object=xui.MsgboxAsync("No hay datos de transportes","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			Dim lstReg As List=mResult.Get("lstRes")
			DBUtils.InsertMaps(mSQL,"tblTransporte",lstReg)
		End If
	End If
	Return Accion
End Sub

Sub tblTipificacionInfoAdicionalFases
	Wait For(ActualizarTipificacionInfoAdicionalFases) complete (Accion As String)
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	LoadDatosB4xSearchList(TipoQryCls, stringSourceTableCls, IDDatosCls)
End Sub

Sub ActualizarTipificacionInfoAdicionalFases As ResumableSub
	
	mSQL.ExecNonQuery("DELETE from tblTipificacionInfoAdicionalFases")
	Dim Accion As String

	
	Dim Comando As String="TipificacionInfoAdicionalFases"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
	Else
		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			Dim msa As Object=xui.MsgboxAsync("No hay datos de Tipificacion Info Adicional Fases","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			Dim lstReg As List=mResult.Get("lstRes")
			DBUtils.InsertMaps(mSQL,"tblTipificacionInfoAdicionalFases",lstReg)
		End If
	End If
	Return Accion
End Sub

Sub vwempleadosactivos
	Wait For(Actualizarvwempleadosactivos) complete (Accion As String)
	If Accion="Salir" Then
		SalirModulo
		Return
	End If
	LoadDatosB4xSearchList(TipoQryCls, stringSourceTableCls, IDDatosCls)
End Sub

Sub Actualizarvwempleadosactivos As ResumableSub
	
	mSQL.ExecNonQuery("DELETE from vwempleadosactivos")
	Dim Accion As String

	
	Dim Comando As String="vwempleadosactivos"
	JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes,Comando,Null, Me)
	
	Wait For DatosJRDC_Completed (mResult As Map)
	
	If mResult.Get("ConnOK")=False Then
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="Salir"
	Else
		If mResult.Get("ReqOK")=False Then
			Accion="Sin Datos"
			Dim msa As Object=xui.MsgboxAsync("No hay datos de empleados activos","Aviso")
			Wait For (msa) Msgbox_Result
		Else
			Accion="OK"
			Dim lstReg As List=mResult.Get("lstRes")
			DBUtils.InsertMaps(mSQL,"vwempleadosactivos",lstReg)
		End If
	End If
	Return Accion
End Sub








