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
	
	frm.Title=Main.PrefijoTitleForms & "Análisis Disponibles Artículo Talla Almacenes Computables"
	
	If mSQL.IsInitialized Then mSQL.Close
	mSQL.InitializeSQLite(xui.DefaultFolder,Main.NombreAplicacion & ".db",True)
	
	CreacionTablasSQLite

	'Usar las 2 siguientes lineas para abrir el CampoBuilder
'	jamTableView1.AbrirCamposBuilder
'	Return

	
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
'	jamTableView1.AddContextMenuItemColumna("FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP")


		
	Dim rSub As ResumableSub=jamTableView1.ConfigurarTableView("ListaAnalisisDisponiblesArticuloTallaAlmacenesComputables.json",Null)
	wait for (rSub) complete (mRes As Map)
	Log(mRes)
	If Not(mRes.Get("FlagOK")) Then
		Dim msa As Object=xui.MsgboxAsync(mRes.Get("msgError") & CRLF & CRLF & "Avisa al administrador de la aplicación.","Error")
		Wait For (msa) Msgbox_Result
		frm.Close
		Return
	End If
		
	jamTableView1.AlturaFilas=0    ' 0 si se quiere que las lineas sean autoajustables . Para ello tiene que haber lineas con cell factory tipo wrap
	
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
	
''	' EJEMPLOS DE CELLFACTORIES
''	Dim CF As DatosCellFactoryJamTableView
''	CF.Initialize
''	CF.NombreFuncionCellFactory=jamTableView1.CellFactory_ColumnaFechaSqlServer
''	CF.CellFactoryEnCallBack=False
''	CF.params=Null
''	'jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaPrometidaOriginal","FechaUltimaReclamacion"))
''	jamTableView1.SetCellFactoryListaCampos(CF,Array As String("FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"))
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

		
	Dialog.Initialize(frm.RootPane)
	jamLoadingIndicator1.Initialize(Me,frm.RootPane)

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

	Wait For(ActualizarDatosDisponibles) complete (mRes As Map)
	Dim Accion As String=mRes.Get("Accion")
	If Accion<>"OK" Then
		SalirModulo
		Return
	End If
	'Dim lstReg As List=mRes.get("lstReg")
	
'''''	mSQL.ExecNonQuery2("update tblAnalisisDisponiblesArticuloTallaAlmacenesComputables set Comentarios=1 where Articulo like ?",Array("%05%"))
	
	Dim rs As ResultSet=mSQL.ExecQuery("select * from tblAnalisisDisponiblesArticuloTallaAlmacenesComputables order by Articulo, Talla")

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


' EJEMPLO CREACION DE TABLA INTERNA
Sub CreacionTablasSQLite
	Dim ntFP As Int=mSQL.ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",Array As String("tblAnalisisDisponiblesArticuloTallaAlmacenesComputables"))
	If ntFP>0 Then
		mSQL.ExecNonQuery("drop table tblAnalisisDisponiblesArticuloTallaAlmacenesComputables")
	End If
	Dim sbCrearTabla As StringBuilder
	sbCrearTabla.Initialize
	sbCrearTabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesArticuloTallaAlmacenesComputables] (")
	sbCrearTabla.Append("  [Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Stock] REAL")
	sbCrearTabla.Append(", [CosteUnitario] REAL, [TotalCosteStock] REAL, [ClienteExclusiva] TEXT, [NombreClienteExclusiva] TEXT, [StockNoConfigurado] TEXT")
	sbCrearTabla.Append(", [SistemaReposicion] TEXT, [ArticuloBloqueado] TEXT, [ArticuloBloqueadoNoDisponible] TEXT, [GrupoContable] TEXT, [NombreRuta] TEXT")
	sbCrearTabla.Append(", [RutaCorte] TEXT, [ProveedorPredeterminado] TEXT, [NombreProveedorPredeterminado] TEXT, [UltimoMovPositivo] INTEGER, [Cantidad3M] REAL")
	sbCrearTabla.Append(", [Cantidad6M] REAL, [Cantidad9M] REAL, [Cantidad12M] REAL, [Cantidad24M] REAL, [ArtTallaConMaxMin] TEXT, [NecConsumo] REAL")
	sbCrearTabla.Append(", [NecVenta] REAL, [NecEnvioTransf] REAL, [PteRecepcionTransf] REAL, [NecNeta] REAL, [Disponible] REAL, [CosteDisponible] REAL")
	sbCrearTabla.Append(", [MesesConsumo6M] REAL, [SegConsumo] TEXT, [Comentarios] INTEGER DEFAULT 0)")
	mSQL.ExecNonQuery(sbCrearTabla.ToString)

End Sub

' EJEMPLO, modificar según formulario
Sub ActualizarDatosDisponibles As ResumableSub
	jamLoadingIndicator1.MensajeLoading="Actualizando datos Disponible por Artículo Talla en Almacenes Computables..."
	jamLoadingIndicator1.Show
	mSQL.ExecNonQuery("DELETE from tblAnalisisDisponiblesArticuloTallaAlmacenesComputables")
	Dim Accion As String
	Dim mRes As Map
	mRes.Initialize
	Dim sLinkJRDC As String=Main.rdcLinkNav
	Dim Comando As String="AnalisisDisponiblesArticuloTallaAlmacenesComputables"
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
			DBUtils.InsertMaps(mSQL,"tblAnalisisDisponiblesArticuloTallaAlmacenesComputables",lstReg)
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

'Sub GetImageBytes(Dir As String, Filename As String) As Byte()
'	Dim bytes() As Byte = Bit.InputStreamToBytes(File.OpenInput(Dir,Filename))
'	Return bytes
'End Sub



''/*
''public Node createGraphic(){
''    HBox graphicContainer = new HBox();
''    graphicContainer.setAlignment(Pos.CENTER);
''   // ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/img/Appinfo.png")));
''    ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/Appinfo.png")));
''    imageView.setFitHeight(25);
''    imageView.setPreserveRatio(true);
''    graphicContainer.getChildren().add(imageView);
''    return graphicContainer;
''}
''*/
''
''
''/*
'''        if (empty || item == null) {
'''            // set back to look of empty cell
'''            setText(null);
'''            image.setImage(null);
'''        } else {
'''            // set image and text for non-empty cell
'''            image.setImage(item.getEmoji());
'''            setText(item.getValue());
'''        }
''*/

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

'Public int Load(String Dir, String File) throws IOException {
'     If (Dir.equals(anywheresoftware.b4a.objects.streams.File.getDirAssets())) {
'       If (anywheresoftware.b4a.objects.streams.File.virtualAssetsFolder != Null) {
'         Return Load(anywheresoftware.b4a.objects.streams.File.virtualAssetsFolder,
'             anywheresoftware.b4a.objects.streams.File.getUnpackedVirtualAssetFile(File));
'       }
'       Return getObject().load(BA.applicationContext.getAssets().openFd(File.toLowerCase(BA.cul)), 1);
'     }
'     Else {
'       Return getObject().load(anywheresoftware.b4a.objects.streams.File.Combine(Dir, File), 1);
'     }
'   }


