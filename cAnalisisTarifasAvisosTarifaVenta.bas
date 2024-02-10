B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.8
@EndOfDesignText@

Sub Class_Globals

	Private fx As JFX
	Private xui As XUI
'	Private frm As Form
	
	Private mCallBack As Object
	Private mParent As B4XView
	Dim Background As B4XView
	Dim Base As B4XView
	
	Dim mFrmParent As Form  '  necesario para el jamTableView

	'
	Private btnSalir As Button
	
	Dim Dialog As B4XDialog
	Private jamLoadingIndicator1 As JamLoadingIndicator
	Dim mSQL As SQL
	
	Dim jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As jamTableView
		
	Dim mIDAnalisisTarifasVenta As Int
	Dim mTipoTarifa As Int
	Dim mCodigoTarifa As String
	Dim mArticulo As String
	Dim mDescripcionArticulo As String
	
	
	Dim DatosEditados As Boolean
	Private lblNumPreciosDivisa As B4XView
	Private lblTitleArticulo As B4XView
	Private lblTitleCodigoTarifa As B4XView
	Private lblTitleDescripcionArticulo As B4XView
	Private lblTitleNumMinQty As B4XView
	Private lblTitleNumPrecios As B4XView
	Private lblTitleNumPreciosArtTalla As B4XView
	Private lblTitleNumPreciosUMDifUMVta As B4XView
	Private lblTitleTipoTarifa As B4XView
	Private pnlFondoDatosAvisos As B4XView
	Private pnljamTableViewAnalisisTarifasLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As B4XView
	Private txtArticuloAvisos As TextField
	Private txtCodigoTarifaAvisos As TextField
	Private txtDescripcionArticuloAvisos As TextField
	Private txtNumMinQty As TextField
	Private txtNumPrecios As TextField
	Private txtNumPreciosArtTalla As TextField
	Private txtNumPreciosDivisa As TextField
	Private txtNumPreciosUMDifUMVta As TextField
	Private txtTipoTarifaAvisos As TextField
	
	Private lblInfoTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As B4XView
	Private btnSalirInfoAvisosTarifasVentaTipoTarifaCodigoTarifaArticulo As B4XView
	
	Private fRPrecioVentaUsuario As jamFormRegistro
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(CallBack As Object,Parent As B4XView, frmParent As Form, _
		IDAnalisisVenta As Int, TipoTarifa As Int, CodigoTarifa As String, Articulo As String, DescripcionArticulo As String)
	mCallBack=CallBack
	mParent=Parent
	
	mFrmParent=frmParent
	
	mIDAnalisisTarifasVenta=IDAnalisisVenta
	mTipoTarifa=TipoTarifa
	mCodigoTarifa=CodigoTarifa
	mArticulo=Articulo
	mDescripcionArticulo=DescripcionArticulo

	Show
End Sub

Sub getForm As Form
	Return mFrmParent
End Sub

Public Sub Show

	Background= xui.CreatePanel("Background")
	Background.Tag = "AnalisisTarifasAvisosTarifaVenta_background"
	'Background.Color=0xaa000000
	Background.Color=xui.Color_Transparent
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	Base=xui.CreatePanel("pnlBase")
	Base.SetLayoutAnimated(0,0,0,Background.Width, Background.Height)
	Base.LoadLayout("scrAnalisisTarifasInfoTarifasVentaValidasTipoTarifaCodigoTarifaArticulo")
	Sleep(0)
	Background.AddView(Base,Background.Width/2-Base.Width/2, Background.Height/2-Base.Height/2, Base.Width, Base.Height)

	If mSQL.IsInitialized Then mSQL.Close
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	txtTipoTarifaAvisos.Alignment="CENTER"
	txtCodigoTarifaAvisos.Alignment="CENTER"
	txtArticuloAvisos.Alignment="CENTER"
	txtNumPrecios.Alignment="CENTER_RIGHT"
	txtNumPreciosArtTalla.Alignment="CENTER_RIGHT"
	txtNumPreciosDivisa.Alignment="CENTER_RIGHT"
	txtNumMinQty.Alignment="CENTER_RIGHT"
	txtNumPreciosUMDifUMVta.Alignment="CENTER_RIGHT"
	
	'CreacionTablasSQLite  
	
	''
'	''' Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableViewTotalesLineas.AbrirCamposBuilder
'	Return
	'''
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.EstadoMenuItem(jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.MenuBarTabla,False)
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.EstadoMenuItem(jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.MenuBarAcciones,False)
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.EstadoMenuItem(jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.MenuBarLinea,False)

		
	Dim rSub As ResumableSub=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.ConfigurarTableView("ListaAnalisisTarifasListaTarifasTipoTarifaCodigoTarifaArticulo.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		SalirModulo
		Return
	End If
		
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.CellFactory_ColumnaFecha
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.SetCellFactoryListaCampos(CF, Array As String("FechaInicial","FechaFinal"))
		
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AddContextMenuItemSeparator
	jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AddContextMenuItemFontAwesomeText("Añadir Precio de Línea a Lista Precios Venta Usuario","AddPrecioLineaAListaPreciosVentaUsuario",Chr(0xF071))

	Dialog.Initialize(Base)
	jamLoadingIndicator1.Initialize(Me,Base)

	'ActualizarDatos
	
	DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(mTipoTarifa, mCodigoTarifa, mArticulo, mDescripcionArticulo)

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
	If jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.IsInitialized Then
		jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.GuardarConfiguracionColumnasUsuario
	End If
'	frm.Close
'	MainMenu2.Show
	Background.RemoveViewFromParent
	'frm.Close
	CallSubDelayed2(mCallBack,"cAnalisisTarifasAvisosTarifaVenta_Done", DatosEditados)
End Sub


#Region DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo

Sub  DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String, DescripcionArticuloSel As String) As ResumableSub

	
	jamLoadingIndicator1.MensajeLoading="Cargando datos tarifas..."
	jamLoadingIndicator1.Show
	
	Dim sTipoTarifaSel As String
	If TipoTarifaSel=0 Then
		sTipoTarifaSel="Cliente"
	Else
		sTipoTarifaSel="GRP"
	End If
	txtTipoTarifaAvisos.Text=sTipoTarifaSel
	txtCodigoTarifaAvisos.Text=CodigoTarifaSel
	txtArticuloAvisos.Text=ArticuloSel
	txtDescripcionArticuloAvisos.Text=DescripcionArticuloSel
	

	Dim NumPreciosArt As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
	txtNumPrecios.Text=NumPreciosArt
	Dim tF As B4XView=txtNumPrecios
	If NumPreciosArt>1 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	Dim NumPreciosArtTalla As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
	txtNumPreciosArtTalla.text=NumPreciosArtTalla
	Dim tF As B4XView=txtNumPreciosArtTalla
	If NumPreciosArtTalla>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
	txtNumMinQty.text=NumMinQty
	Dim tF As B4XView=txtNumMinQty
	If NumMinQty>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	
	Dim NumPreciosDivisa As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
	txtNumPreciosDivisa.text=NumPreciosDivisa
	Dim tF As B4XView=txtNumPreciosDivisa
	If NumPreciosDivisa>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	
	
	Dim NumPreciosUMDifUMVta As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosUMDifUMVta from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?", _
		Array As String(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)))
	txtNumPreciosUMDifUMVta.text=NumPreciosUMDifUMVta
	Dim tF As B4XView=txtNumPreciosUMDifUMVta
	If NumPreciosUMDifUMVta>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	

	
	wait for (CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(TipoTarifaSel, CodigoTarifaSel, ArticuloSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	Select Case Accion
		Case "NOK"
			SalirModulo
			Return False
		Case "SinDatos"
			
		Case "OK"
			
	End Select
	
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")
	
	Dim rSub As ResumableSub=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.setdata(rsData)
	Wait For (rSub) complete (mResultSetData As Map)
	rsData.Close
	jamLoadingIndicator1.Close
	If Not(mResultSetData.Get("FlagOK")) Then
		If ""<>mResultSetData.Get("msgError") Then
			Dim msa As Object=xui.MsgboxAsync(mResultSetData.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
			Wait For (msa) Msgbox_Result
			#if debug
			Dim msa As Object = xui.Msgbox2Async("¿Abrir CamposBuilder?", "", "Sí", "", "No", Null)
			Wait For (msa) Msgbox_Result (rInt As Int)
			If rInt=xui.DialogResponse_Positive Then
				jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.AbrirCamposBuilder
				Return False
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

Sub CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(TipoTarifaSel As Int, CodigoTarifaSel As String, ArticuloSel As String) As ResumableSub
	Dim sTipoTarifaSel As String
	If TipoTarifaSel=0 Then
		sTipoTarifaSel="Cliente"
	Else
		sTipoTarifaSel="GRP"
	End If
	
	mSQL.ExecNonQuery("delete from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="AnalisisTarifasLineasTarifaVentaTipoTarifaCodigoTarifaArticulo"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(TipoTarifaSel, CodigoTarifaSel, ArticuloSel), Me)

	Wait For DatosJRDC_Completed (mResult As Map)

	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			jamLoadingIndicator1.Close
			Dim msa As Object=xui.MsgboxAsync("NO hay líneas de tarifas de venta válidas para los datos seleccionados (Tipo: " & sTipoTarifaSel & " Código: " & CodigoTarifaSel & " Artículo: " & ArticuloSel & ".","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
			Dim mData As Map=lstReg.Get(0)
			Accion="OK"
			mRes.Put("Accion", Accion)
			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub


Private Sub btnSalirInfoAvisosTarifasVentaTipoTarifaCodigoTarifaArticulo_Click
	SalirModulo
End Sub


#End Region

Sub jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action(TagMenuItem As String)
	
	
	Select Case TagMenuItem
		Case "AddPrecioLineaAListaPreciosVentaUsuario"
		
			Dim FilaSel As Int=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.GetIndiceFilaSeleccionada
			Dim PrecioVentaUsuario As Double=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.GetValorSQLCampoFila(FilaSel,"PrecioUnitario")
			Dim Divisa As String=jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo.GetValorSQLCampoFila(FilaSel,"Moneda")
			Dim sDivisa As String=IIf(Divisa="","EUR",Divisa)
		
			wait for(Utilidades.MsgBox2XUI("Confirma", _
$"¿Grabar el precio de la línea $1.2{PrecioVentaUsuario} (${sDivisa}) como precio venta usuario?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
			If rInt<>xui.DialogResponse_Positive Then Return
			
			
			Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioVentas", _
		Array(mIDAnalisisTarifasVenta,mTipoTarifa,mCodigoTarifa, mArticulo,PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
			Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
			If rBool=False Then
				Dim msa As Object=xui.MsgboxAsync("No ha sido posible crear el nuevo precio de venta usuario indicado.","Error")
				Wait For (msa) Msgbox_Result
				DatosEditados=False
			Else
				Dim msa As Object=xui.MsgboxAsync($"Precio de venta usuario grabado ($1.2{PrecioVentaUsuario})"$,"Error")
				Wait For (msa) Msgbox_Result
				DatosEditados=True
			End If
	End Select
End Sub

'Sub AddEditarPrecioVentaUsuario(TipoTarifa As String, CodigoTarifa As String, Articulo As String, PrecioUnitario As Double)

'	Wait For (PrecioVentaUsuarioTipoTarifaCodigoTarifaArticulo(TipoTarifa,CodigoTarifa, Articulo)) complete (mRes As Map)
'	Dim Accion As String=mRes.Get("Accion")
'	If Accion="NOK" Then Return
'	Dim mData As Map
'	mData.Initialize
'	mData.put("IDAnalisisTarifas",mIDAnalisisTarifasVenta)
'	mData.put("TipoTarifa",TipoTarifa)
'	mData.put("CodigoTarifa",CodigoTarifa)
'	mData.put("Articulo",Articulo)
'	mData.put("PrecioUnitario",PrecioUnitario)
'	If Accion="SinPrecioVentaUsuario" Then
'		fRPrecioVentaUsuario.Initialize(Me,"fRPrecioVentaUsuario",mFrmParent,"Nuevo Precio Venta Usuario","Nuevo","AnalisisTarifasPrecioVentaUsuarioFormRegistro.json",mData)
'	Else
'		Dim lstReg As List=mRes.Get("lstReg")
'		Dim mP As Map=lstReg.Get(0)
'		Dim PrecioVentaUsu As Double=mP.Get("PrecioUnitario")
'		Dim DivisaUsu As String=mP.Get("Divisa")
'		mData.put("PrecioUnitario",PrecioVentaUsu)
'		mData.put("Divisa",DivisaUsu)
'		fRPrecioVentaUsuario.Initialize(Me,"fRPrecioVentaUsuario",mFrmParent,"Editar Precio Venta Usuario","Editar","AnalisisTarifasPrecioVentaUsuarioFormRegistro.json",mData)
'	End If

'End Sub

'Sub PrecioVentaUsuarioTipoTarifaCodigoTarifaArticulo(TipoTarifa As String, CodigoTarifa As String, Articulo As String) As ResumableSub
'	Dim Accion As String
'	Dim mRes As Map
'	mRes.Initialize
'	Dim Comando As String="AnalisisTarifasPrecioVentaUsuarioTipoTarifaCodigoTarifaArticulo"
'	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, TipoTarifa,CodigoTarifa, Articulo), Me)
'	Wait For DatosJRDC_Completed (mResult As Map)
'	If mResult.Get("ConnOK")=False Then
'		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
'		Wait For (msa) Msgbox_Result
'		Accion="NOK"
'		mRes.Put("Accion", Accion)
'	Else
'
'		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay Precio de Venta Usuario para el Tipo Tarifa-Codigo Tarifa-Articulo seleccionado.","Aviso")
'			Wait For (msa) Msgbox_Result
'			Accion="SinPrecioVentaUsuario"
'			mRes.Put("Accion", Accion)
'		Else
'			Dim lstReg As List=mResult.Get("lstRes")
'			Accion="OK"
'			mRes.Put("Accion", Accion)
'			mRes.Put("lstReg", lstReg)
'		End If
'	End If
'	Return mRes
'End Sub

'Sub fRPrecioVentaUsuario_GrabarNuevoRegistro(lstDatosCamposRegistroNuevo As List)
'
'	Dim TipoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("TipoTarifa").ValorOutputCampo
'	Dim CodigoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("CodigoTarifa").ValorOutputCampo
'	Dim Articulo As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Articulo").ValorOutputCampo
'	Dim Divisa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Divisa").ValorOutputCampo
'	Dim PrecioVentaUsuario As Double=fRPrecioVentaUsuario.DatosCampoSeleccionado("PrecioUnitario").ValorOutputCampo
'
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioVentas", _
'		Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa, Articulo,PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
'			PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible crear el nuevo precio de venta usuario indicado.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	fRPrecioVentaUsuario.CerrarFormRegistro
'End Sub
'
'Sub fRPrecioVentaUsuario_GrabarEdicionRegistro(lstInfoCampoJamFormRegistro As List)
'	Dim TipoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("TipoTarifa").ValorOutputCampo
'	Dim CodigoTarifa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("CodigoTarifa").ValorOutputCampo
'	Dim Articulo As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Articulo").ValorOutputCampo
'	Dim Divisa As String=fRPrecioVentaUsuario.DatosCampoSeleccionado("Divisa").ValorOutputCampo
'	Dim PrecioVentaUsuario As Double=fRPrecioVentaUsuario.DatosCampoSeleccionado("PrecioUnitario").ValorOutputCampo
'
'	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioVentas", _
'		Array(mIDAnalisisTarifasVenta,TipoTarifa,CodigoTarifa, Articulo,PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
'			PrecioVentaUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
'	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
'	If rBool=False Then
'		Dim msa As Object=xui.MsgboxAsync("No ha sido posible modificar el precio de venta usuario indicado.","Error")
'		Wait For (msa) Msgbox_Result
'		Return
'	End If
'	fRPrecioVentaUsuario.CerrarFormRegistro
'End Sub




