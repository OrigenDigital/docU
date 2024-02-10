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
	Private mSQL As SQL
	
	'Dim jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As jamTableView
		
	Dim mIDAnalisisTarifasVenta As Int
'	Dim mTipoTarifa As Int
'	Dim mCodigoTarifa As String
	Dim mArticulo As String
	Dim mDescripcionArticulo As String
	
	
	Dim DatosEditados As Boolean
	
'	Private lblInfoTarifasVentaValidasTipoTarifaCodigoTarifaArticulo As B4XView
'	Private btnSalirInfoAvisosTarifasVentaTipoTarifaCodigoTarifaArticulo As B4XView
	Private btnSalirInfoAvisosTarifasCompraValidasArticulo As B4XView
	Private jamTableViewLineasTarifasCompraValidasArticulo As jamTableView
	Private lblInfoAvisosTarifasCompraValidasArticulo As B4XView
	Private lblNumPreciosDivisaTarifasCompraValidasArticulo As B4XView
	Private lblTitleArticuloTarifasCompraValidasArticulo As B4XView
	Private lblTitleDescripcionArticuloTarifasCompraValidasArticulo As B4XView
	Private lblTitleNumMinQtyTarifasCompraValidasArticulo As B4XView
	Private lblTitleNumPreciosArtTallaTarifasCompraValidasArticulo As B4XView
	Private lblTitleNumPreciosTarifasCompraValidasArticulo As B4XView
	Private lblTitleNumPreciosUMDifUMCompra As B4XView
	Private pnlFondoDatosAvisosTarifasCompraValidasArticulo As B4XView
	Private pnljamTableViewAnalisisTarifasLineasTarifasCompraValidasArticulo As B4XView
	Private txtArticuloAvisosTarifasCompraValidasArticulo As TextField
	Private txtDescripcionArticuloAvisosTarifasCompraValidasArticulo As TextField
	Private txtNumMinQtyTarifasCompraValidasArticulo As TextField
	Private txtNumPreciosArtTallaTarifasCompraValidasArticulo As TextField
	Private txtNumPreciosDivisaTarifasCompraValidasArticulo As TextField
	Private txtNumPreciosTarifasCompraValidasArticulo As TextField
	Private txtNumPreciosUMDifUMCompra As TextField
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(CallBack As Object,Parent As B4XView, frmParent As Form, SQLAnalisis As SQL, _
		IDAnalisisVenta As Int, Articulo As String, DescripcionArticulo As String)
		
		
'	#if debug
'	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
'	#else
'	mSQL.InitializeSQLite("", ":memory:", True)
'	#End If

	mSQL=SQLAnalisis
		
	mCallBack=CallBack
	mParent=Parent
	
	mFrmParent=frmParent
	
	mIDAnalisisTarifasVenta=IDAnalisisVenta
'	mTipoTarifa=TipoTarifa
'	mCodigoTarifa=CodigoTarifa
	mArticulo=Articulo
	mDescripcionArticulo=DescripcionArticulo

	Show
End Sub

Sub getForm As Form
	Return mFrmParent
End Sub

Public Sub Show

	Background= xui.CreatePanel("Background")
	Background.Tag = "AnalisisTarifasAvisosTarifaCompra_background"
	'Background.Color=0xaa000000
	Background.Color=xui.Color_Transparent
	mParent.AddView(Background, 0, 0, mParent.Width, mParent.Height)
	
	Base=xui.CreatePanel("pnlBase")
	Base.SetLayoutAnimated(0,0,0,Background.Width, Background.Height)
	Base.LoadLayout("scrAnalisisTarifasVentaInfoTarifasCompraValidasArticulo")
	Sleep(0)
	Background.AddView(Base,Background.Width/2-Base.Width/2, Background.Height/2-Base.Height/2, Base.Width, Base.Height)
	
	lblInfoAvisosTarifasCompraValidasArticulo.Text="Avisos Tarifa / Líneas Tarifas Compra"

	
'	txtTipoTarifaAvisos.Alignment="CENTER"
'	txtCodigoTarifaAvisos.Alignment="CENTER"
	txtArticuloAvisosTarifasCompraValidasArticulo.Alignment="CENTER"
	txtNumPreciosTarifasCompraValidasArticulo.Alignment="CENTER_RIGHT"
	txtNumPreciosArtTallaTarifasCompraValidasArticulo.Alignment="CENTER_RIGHT"
	txtNumPreciosDivisaTarifasCompraValidasArticulo.Alignment="CENTER_RIGHT"
	txtNumMinQtyTarifasCompraValidasArticulo.Alignment="CENTER_RIGHT"
	txtNumPreciosUMDifUMCompra.Alignment="CENTER_RIGHT"
	
	'CreacionTablasSQLite
	
	''
'	''' Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableViewLineasTarifasCompraValidasArticulo.AbrirCamposBuilder
'	Return
	'''
	jamTableViewLineasTarifasCompraValidasArticulo.EstadoMenuItem(jamTableViewLineasTarifasCompraValidasArticulo.MenuBarTabla,True)
	jamTableViewLineasTarifasCompraValidasArticulo.EstadoMenuItem(jamTableViewLineasTarifasCompraValidasArticulo.MenuBarAcciones,False)
	jamTableViewLineasTarifasCompraValidasArticulo.EstadoMenuItem(jamTableViewLineasTarifasCompraValidasArticulo.MenuBarLinea,False)

		
	Dim rSub As ResumableSub=jamTableViewLineasTarifasCompraValidasArticulo.ConfigurarTableView("ListaAnalisisTarifasInfoTarifaComprasArticulo2.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		SalirModulo
		Return
	End If
		
	jamTableViewLineasTarifasCompraValidasArticulo.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
		
	Dim CF As DatosCellFactoryJamTableView
	CF.Initialize
	CF.NombreFuncionCellFactory=jamTableViewLineasTarifasCompraValidasArticulo.CellFactory_ColumnaFecha
	jamTableViewLineasTarifasCompraValidasArticulo.SetCellFactoryListaCampos(CF, Array As String("FechaInicial","FechaFinal"))
	
		
	jamTableViewLineasTarifasCompraValidasArticulo.AddContextMenuItemSeparator
	'jamTableViewLineasTarifasCompraValidasArticulo.AddContextMenuItemFontAwesomeText("Añadir Línea a Lista Precios Compra Usuario","AddLineaAListaPreciosCompraUsuario",Chr(0xF071))
	jamTableViewLineasTarifasCompraValidasArticulo.AddContextMenuItemFontAwesomeText("Añadir Precio EUR Línea Tarifa a Coste Artículo Usuario","AddEditarCosteArticuloUsuarioValorPrecioEURLineaTarifaCompra",Chr(0xF071))

	Dialog.Initialize(Base)
	jamLoadingIndicator1.Initialize(Me,Base)

	'ActualizarDatos
	
	DatosLineasTarifasCompraAvisosArticulo(mArticulo, mDescripcionArticulo)

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
	If jamTableViewLineasTarifasCompraValidasArticulo.IsInitialized Then
		jamTableViewLineasTarifasCompraValidasArticulo.GuardarConfiguracionColumnasUsuario
	End If
'	frm.Close
'	MainMenu2.Show
	Background.RemoveViewFromParent
	'frm.Close
	CallSubDelayed2(mCallBack,"cAnalisisTarifasAvisosTarifaCompra_Done", DatosEditados)
End Sub



Sub  DatosLineasTarifasCompraAvisosArticulo(ArticuloSel As String, DescripcionArticuloSel As String) As ResumableSub

	
	jamLoadingIndicator1.MensajeLoading="Cargando datos tarifas..."
	jamLoadingIndicator1.Show
	

	txtArticuloAvisosTarifasCompraValidasArticulo.Text=ArticuloSel
	txtDescripcionArticuloAvisosTarifasCompraValidasArticulo.Text=DescripcionArticuloSel
	

	Dim NumPreciosArt As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?", _
		Array As String(ArticuloSel)))
	txtNumPreciosTarifasCompraValidasArticulo.Text=NumPreciosArt
	Dim tF As B4XView=txtNumPreciosTarifasCompraValidasArticulo
	If NumPreciosArt>1 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	Dim NumPreciosArtTalla As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?", _
		Array As String(ArticuloSel)))
	txtNumPreciosArtTallaTarifasCompraValidasArticulo.text=NumPreciosArtTalla
	Dim tF As B4XView=txtNumPreciosArtTallaTarifasCompraValidasArticulo
	If NumPreciosArtTalla>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?", _
		Array As String(ArticuloSel)))
	txtNumMinQtyTarifasCompraValidasArticulo.text=NumMinQty
	Dim tF As B4XView=txtNumMinQtyTarifasCompraValidasArticulo
	If NumMinQty>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	
	Dim NumPreciosDivisa As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?", _
		Array As String(ArticuloSel)))
	txtNumPreciosDivisaTarifasCompraValidasArticulo.text=NumPreciosDivisa
	Dim tF As B4XView=txtNumPreciosDivisaTarifasCompraValidasArticulo
	If NumPreciosDivisa>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	
	
	
	Dim NumPreciosUMDifUMCompra As Int=Utilidades.FixNullInt(mSQL.ExecQuerySingleResult2("select NumPreciosUMDifUMCompra from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?", _
		Array As String(ArticuloSel)))
	txtNumPreciosUMDifUMCompra.text=NumPreciosUMDifUMCompra
	Dim tF As B4XView=txtNumPreciosUMDifUMCompra
	If NumPreciosUMDifUMCompra>0 Then
		tF.Color=xui.Color_Red
		tF.TextColor=xui.Color_White
	Else
		tF.Color=0xFF00FA9A
		tF.TextColor=xui.Color_Black
	End If
	

	
	wait for (CargaLineasTarifaCompraArticulo(ArticuloSel)) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	Select Case Accion
		Case "NOK"
			SalirModulo
			Return False
		Case "SinDatos"
			
		Case "OK"
			
	End Select
	
	
	Dim rsData As ResultSet=mSQL.ExecQuery("select * from tblAnalisisTarifasLineasTarifasCompraArticulo")
	
	Dim rSub As ResumableSub=jamTableViewLineasTarifasCompraValidasArticulo.setdata(rsData)
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
				jamTableViewLineasTarifasCompraValidasArticulo.AbrirCamposBuilder
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

Sub CargaLineasTarifaCompraArticulo(ArticuloSel As String) As ResumableSub

	mSQL.ExecNonQuery("delete from tblAnalisisTarifasLineasTarifasCompraArticulo")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim Comando As String="TarifasCompraValidasActualesYFuturasUltimaFechaInicialArticulo"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(ArticuloSel), Me)

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
			Dim msa As Object=xui.MsgboxAsync("NO hay líneas de tarifas de compra válidas para los datos seleccionados (Artículo: " & ArticuloSel & ".","Aviso")
			Wait For (msa) Msgbox_Result
			Accion="SinDatos"
			mRes.Put("Accion", Accion)
		Else
			Dim lstReg As List=mResult.Get("lstRes")
'			Dim mData0 As Map=lstReg.Get(0)
'			Utilidades.LogStringCrearTablaDesdeMap("tblAnalisisTarifasLineasTarifasCompraArticulo",mData0,"")
			Accion="OK"
			mRes.Put("Accion", Accion)
'			mRes.Put("mData", mData)
			Utilidades.InsertarMapsSoloCamposCoincidentes(mSQL,"tblAnalisisTarifasLineasTarifasCompraArticulo",lstReg)
			mSQL.ExecNonQuery2("update tblAnalisisTarifasLineasTarifasCompraArticulo set IDAnalisisTarifas=?",Array As String(mIDAnalisisTarifasVenta))
		End If
	End If
	Return mRes
End Sub

Private Sub btnSalirInfoAvisosTarifasCompraValidasArticulo_Click
	SalirModulo
End Sub

Sub jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action(TagMenuItem As String)
	
	Select Case TagMenuItem
'		Case "AddEditPrecioCompraUsuario"
'			
'			Dim FilaSel As Int=jamTableViewLineasTarifasCompraValidasArticulo.GetIndiceFilaSeleccionada
'			Dim CosteCompraUsuario As Double=jamTableViewLineasTarifasCompraValidasArticulo.GetValorSQLCampoFila(FilaSel,"PrecioCompra")
'			Dim Proveedor As String=jamTableViewLineasTarifasCompraValidasArticulo.GetValorSQLCampoFila(FilaSel,"Proveedor")
'			Dim Divisa As String=jamTableViewLineasTarifasCompraValidasArticulo.GetValorSQLCampoFila(FilaSel,"Moneda")
'			Dim sDivisa As String=IIf(Divisa="","EUR",Divisa)
'		
'			wait for(Utilidades.MsgBox2XUI("Confirma", _
'$"¿Grabar el precio de la línea $1.2{CosteCompraUsuario} (${sDivisa}) como precio compra usuario?"$,"Sí","Cancelar","",Null)) complete (rInt As Int)
'			If rInt<>xui.DialogResponse_Positive Then Return
'			
'			Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarPrecioUsuarioCompras", _
'		Array(mIDAnalisisTarifasVenta,Proveedor, mArticulo,CosteCompraUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
'			CosteCompraUsuario, Divisa, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
'			Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
'			If rBool=False Then
'				Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo precio de compra usuario indicado.","Error")
'				Wait For (msa) Msgbox_Result
'				DatosEditados=False
'			Else
'				Dim msa As Object=xui.MsgboxAsync($"Se ha grabado el Coste de Artículo usuario ($1.2{CosteCompraUsuario} (${sDivisa})"$,"Aviso")
'				Wait For (msa) Msgbox_Result
'				DatosEditados=True
'			End If
'			
			
			
		Case "AddEditarCosteArticuloUsuarioValorPrecioEURLineaTarifaCompra"
			Dim FilaSel As Int=jamTableViewLineasTarifasCompraValidasArticulo.GetIndiceFilaSeleccionada
			Dim ArticuloSel As String=jamTableViewLineasTarifasCompraValidasArticulo.GetValorSQLCampoFila(FilaSel,"Articulo")
			Dim PrecioCompra As Double=jamTableViewLineasTarifasCompraValidasArticulo.GetValorSQLCampoFila(FilaSel,"PrecioCompra")
			Dim Divisa As String=jamTableViewLineasTarifasCompraValidasArticulo.GetValorSQLCampoFila(FilaSel,"Moneda")
			Dim ValorEURPrecioCompra As Double
			If Divisa<>"" And Divisa<>"EUR" Then
				jamLoadingIndicator1.MensajeLoading="Cargando tipos de cambio grabados en NAV..."
				jamLoadingIndicator1.Show
				Wait For (TiposCambioConDatosNAV) complete (mRes As Map)
				jamLoadingIndicator1.Close
				Dim Accion As String=mRes.Get("Accion")
				If Accion="NOK" Then Return
				Dim FlagDivisaOK As Boolean=False
				Dim lstReg As List=mRes.Get("lstReg")
				For Each m As Map In lstReg
					Dim sDiv As String=m.Get("Divisa")
					If sDiv=Divisa Then
						FlagDivisaOK=True
						Dim TipoCambio As Double=m.Get("TipoCambio")
					End If
				Next
				If FlagDivisaOK=False Then
					Dim sMsg As String=$"No se ha grabado tipo de cambio para la divisa ${Divisa} en NAVISION
No es posible calcular el valor en EUR correspondiente al coste de compra"$
					Dim msa As Object=xui.MsgboxAsync(sMsg,"Error")
					Wait For (msa) Msgbox_Result
					Return
				End If
				ValorEURPrecioCompra=PrecioCompra*TipoCambio
			Else
				ValorEURPrecioCompra=PrecioCompra
			End If
			AddEditarCosteArticuloUsuarioValor(ArticuloSel, ValorEURPrecioCompra)
			
			
	End Select
End Sub


Sub AddEditarCosteArticuloUsuarioValor(Articulo As String, Valor As Double)
	DatosEditados=False
	jamLoadingIndicator1.MensajeLoading="Cargando datos coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Wait For (CosteArticuloUsuario(Articulo)) complete (mRes As Map)
	jamLoadingIndicator1.Close
	Dim Accion As String=mRes.Get("Accion")
	If Accion="NOK" Then Return
	'Dim mData As Map
	'mData.Initialize
	'mData.put("IDAnalisisTarifas",mIDAnalisisTarifasVenta)
	'mData.put("Proveedor",Proveedor)
	'mData.put("Articulo",Articulo)
	Dim ExisteCosteArticuloUsuario As Boolean
	If Accion="SinCosteArticuloUsuario" Then
		Dim sMsg As String=$"No existe coste artículo usuario para el artículo seleccionado.
¿Grabar uno nuevo=$1.2{Valor}?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",sMsg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
'		Dim msa As Object = xui.Msgbox2Async($"No existe coste artículo usuario para el artículo seleccionado.
		'¿Grabar uno nuevo?"$,"Confirma", "Sí","Cancelar", "", Null)
'		Wait For (msa) Msgbox_Result (rInt As Int)
'		If rInt<>xui.DialogResponse_Positive Then Return
		'fRCosteArticuloUsuario.Initialize(Me,"fRCosteArticuloUsuario",frm,"Nuevo Coste Artículo Usuario","Nuevo","AnalisisTarifasCosteArticuloUsuarioFormRegistro.json",mData)
		ExisteCosteArticuloUsuario=False
		
	Else
		Dim lstReg As List=mRes.Get("lstReg")
		Dim mP As Map=lstReg.Get(0)
		Dim CosteArticuloUsu As Double=mP.Get("CosteUnitarioUsuario")
		ExisteCosteArticuloUsuario=True
		Dim sMsg As String=$"Ya existe coste artículo usuario para el artículo seleccionado ( $1.2{CosteArticuloUsu} ).
¿Cambiarlo por el valor $1.2{Valor}?"$
		wait for(Utilidades.MsgBox2XUI("Confirma",sMsg,"Sí","Cancelar","",Null)) complete (rInt As Int)
		If rInt<>xui.DialogResponse_Positive Then Return
		'Dim DivisaUsu As String=mP.Get("Divisa")
		'mData.put("CosteArticuloUsuario",CosteArticuloUsu)
		'mData.put("Divisa",DivisaUsu)
		'fRCosteArticuloUsuario.Initialize(Me,"fRCosteArticuloUsuario",frm,"Editar Coste Artículo Usuario","Editar","AnalisisTarifasCosteArticuloUsuarioFormRegistro.json",mData)
	End If
	
	
	jamLoadingIndicator1.MensajeLoading="Actualizando coste artículo usuario para artículo " & Articulo & "..."
	jamLoadingIndicator1.Show
	Dim cmd As DBCommand=JRDCQuery.CreateCommand("AnalisisTarifasNuevoEditarCosteArticuloUsuario", _
		Array(mIDAnalisisTarifasVenta,Articulo,Valor, DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows, _
			Valor,  DateTime.Now, Main.DatosUsuario.NombreADUsuarioWindows))
	Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,Array(cmd))) complete (rBool As Boolean)
	jamLoadingIndicator1.Close
	If rBool=False Then
		Dim msa As Object=xui.MsgboxAsync("No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error")
		Wait For (msa) Msgbox_Result
		Return
	End If

'	If pnlJamTableViewListaCostesArticulosUsuario.IsInitialized Then
'		If jamTableViewListaCostesArticulosUsuario.IndiceUltimaFilaVisible>-1 Then
'			'Dim mData0 As Map=jamTableViewListaCostesArticulosUsuario.DatosPKRegistroIndiceFila(jamTableViewListaCostesArticulosUsuario.IndiceUltimaFilaVisible)
'			Dim mPK As Map= CreateMap("IDAnalisisTarifas": mIDAnalisisTarifasVenta, "Articulo": Articulo)
'			Dim LineaArticulo As Int=jamTableViewListaCostesArticulosUsuario.GetIDxFilaTVRegistroPK(mPK)
'			If LineaArticulo>-1 Then
'				'jamTableViewListaCostesArticulosUsuario.
'			End If
'			
'		End If
'		
'	End If

	DatosEditados=True

	Dim sMsg As String
	If ExisteCosteArticuloUsuario=False Then
		sMsg=$"Se ha grabado el nuevo coste artículo usuario.
Para ver el efecto del cambio, actualiza la tabla."$
		Dim msa As Object=xui.MsgboxAsync(sMsg ,"Aviso")
		Wait For (msa) Msgbox_Result
	Else
		sMsg=$"Se ha actualizado el valor del coste artículo usuario.
Para ver el efecto del cambio, actualiza la tabla."$
		Dim msa As Object=xui.MsgboxAsync(sMsg,"Aviso")
		Wait For (msa) Msgbox_Result
	End If
	
End Sub

Sub CosteArticuloUsuario(Articulo As String) As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim lstReg As List
	lstReg.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Dim Comando As String="AnalisisTarifasCosteArticuloUsuario"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array(mIDAnalisisTarifasVenta, Articulo), Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
'			Dim msa As Object=xui.MsgboxAsync("No hay Coste Artículo Usuario para el Articulo seleccionado.","Aviso")
'			Wait For (msa) Msgbox_Result
			Accion="SinCosteArticuloUsuario"
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

Sub TiposCambioConDatosNAV As ResumableSub
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim lstReg As List
	lstReg.Initialize
	mRes.Put("Accion", Accion)
	mRes.Put("lstReg", lstReg)
	Dim Comando As String="TiposCambioConDatosNAV"
	JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null, Me)
	Wait For DatosJRDC_Completed (mResult As Map)
	If mResult.Get("ConnOK")=False Then
		jamLoadingIndicator1.Close
		Dim msa As Object=xui.MsgboxAsync("Error de conexion servidor/query " & Comando & ".","Error")
		Wait For (msa) Msgbox_Result
		Accion="NOK"
		mRes.Put("Accion", Accion)
	Else

		If mResult.Get("ReqOK")=False Then
			Dim msa As Object=xui.MsgboxAsync("No hay tipos de cambio grabados en NAV.","Error")
			Wait For (msa) Msgbox_Result
			Accion="NOK"
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