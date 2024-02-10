package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cseguimientofechasprometidascompra extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cseguimientofechasprometidascompra", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cseguimientofechasprometidascompra.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public b4j.docU.jamtableview _jamtableview1 = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _direccionseleccionadaremitenteemails = "";
public String _permisousuariomodulo = "";
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.docU.main _main = null;
public b4j.docU.mainmenu2 _mainmenu2 = null;
public b4j.docU.utilidades _utilidades = null;
public b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public b4j.docU.cmauxtxt _cmauxtxt = null;
public b4j.docU.jrdcquery _jrdcquery = null;
public b4j.docU.dbutils _dbutils = null;
public b4j.docU.transfermode _transfermode = null;
public b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public b4j.docU.b4xcollections _b4xcollections = null;
public b4j.docU.jamlinknavision _jamlinknavision = null;
public b4j.docU.cmpermisos _cmpermisos = null;
public b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public b4j.docU.httputils2service _httputils2service = null;
public b4j.docU.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.docU.cseguimientofechasprometidascompra __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _dcf = null;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="frm.RootPane.LoadLayout(\"scrSeguimientoFechasProm";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrSeguimientoFechasPrometidasCompra");
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "show"),(int) (0));
this.state = 17;
return;
case 17:
//C
this.state = 1;
;
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Seguimien";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    Seguimiento Fechas Prometidas Pedidos Compra");
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Email Reclamación Proveedor","EmailReclamacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf003))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Seleccionar Cuenta Remitente Email","SeleccionarCuentaRemitenteEmail",BA.ObjectToString(parent.__c.Chr(((int)0xf2bc))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Excluir Todo lo Filtrado","ExcluirtodoLoFiltrado",BA.ObjectToString(parent.__c.Chr(((int)0xf046))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="jamTableView1.AddMenuItemFontMaterialIconsToMenuI";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Desmarcar Todo lo Excluido","DesmarcarTodoLoExcluido",BA.ObjectToString(parent.__c.Chr(((int)0xe835))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Email Reclamación Proveedor","EmailReclamacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf003))));
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=7602201;
 //BA.debugLineNum = 7602201;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.png";
_img.InitializeSample(parent.__c.File.getDirAssets(),"navision.png",24,24);
RDebugUtils.currentLine=7602203;
 //BA.debugLineNum = 7602203;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Ver Pedido";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Ver Pedido Compra NAV","VerPedidoCompraNAV",_img);
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Artículo N";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Artículo NAV","VerArticuloNAV",_img);
RDebugUtils.currentLine=7602207;
 //BA.debugLineNum = 7602207;BA.debugLine="jamTableView1.AddContextMenuItemColumna(\"FechaEnv";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemcolumna /*String*/ (null,"FechaEnvioReclamacionLong","Ver datos última RFP","DatosUltimaRFP");
RDebugUtils.currentLine=7602212;
 //BA.debugLineNum = 7602212;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaSeguimientoFechasPrometidasCompras.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=7602213;
 //BA.debugLineNum = 7602213;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "show"), _rsub);
this.state = 18;
return;
case 18:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7602214;
 //BA.debugLineNum = 7602214;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("87602214",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=7602215;
 //BA.debugLineNum = 7602215;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7602216;
 //BA.debugLineNum = 7602216;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=7602217;
 //BA.debugLineNum = 7602217;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "show"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 4;
;
RDebugUtils.currentLine=7602218;
 //BA.debugLineNum = 7602218;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=7602219;
 //BA.debugLineNum = 7602219;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=7602222;
 //BA.debugLineNum = 7602222;BA.debugLine="jamTableView1.AlturaFilas=0";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=7602224;
 //BA.debugLineNum = 7602224;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=7602225;
 //BA.debugLineNum = 7602225;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=7602226;
 //BA.debugLineNum = 7602226;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnafechasqlserver /*String*/ ;
RDebugUtils.currentLine=7602227;
 //BA.debugLineNum = 7602227;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7602228;
 //BA.debugLineNum = 7602228;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=7602230;
 //BA.debugLineNum = 7602230;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"FechaPedido","FechaPrometida","FechaEnvioReclamacionLong"}));
RDebugUtils.currentLine=7602232;
 //BA.debugLineNum = 7602232;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=7602233;
 //BA.debugLineNum = 7602233;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=7602234;
 //BA.debugLineNum = 7602234;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnawraptext /*String*/ ;
RDebugUtils.currentLine=7602235;
 //BA.debugLineNum = 7602235;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7602236;
 //BA.debugLineNum = 7602236;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=7602237;
 //BA.debugLineNum = 7602237;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"NombreProveedor","DescripcionArticulo"}));
RDebugUtils.currentLine=7602239;
 //BA.debugLineNum = 7602239;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=7602240;
 //BA.debugLineNum = 7602240;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=7602241;
 //BA.debugLineNum = 7602241;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnabooleanatipointegercheckboxsolotrue /*String*/ ;
RDebugUtils.currentLine=7602242;
 //BA.debugLineNum = 7602242;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7602243;
 //BA.debugLineNum = 7602243;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=7602244;
 //BA.debugLineNum = 7602244;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"FechaPrometidaVencida","PendienteSeguimiento"}));
RDebugUtils.currentLine=7602246;
 //BA.debugLineNum = 7602246;BA.debugLine="Dim dCF As DatosCellFactoryJamTableView";
_dcf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=7602247;
 //BA.debugLineNum = 7602247;BA.debugLine="dCF.Initialize";
_dcf.Initialize();
RDebugUtils.currentLine=7602248;
 //BA.debugLineNum = 7602248;BA.debugLine="dCF.AliasCampoColumna=\"ExcluidoReclamacion\"";
_dcf.AliasCampoColumna /*String*/  = "ExcluidoReclamacion";
RDebugUtils.currentLine=7602249;
 //BA.debugLineNum = 7602249;BA.debugLine="dCF.CellFactoryEnCallBack=False";
_dcf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=7602250;
 //BA.debugLineNum = 7602250;BA.debugLine="dCF.NombreFuncionCellFactory=jamTableView1.CellFa";
_dcf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnabooleanatipointegercheckbox /*String*/ ;
RDebugUtils.currentLine=7602251;
 //BA.debugLineNum = 7602251;BA.debugLine="jamTableView1.SetCellFactory(dCF)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_dcf);
RDebugUtils.currentLine=7602253;
 //BA.debugLineNum = 7602253;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"PendienteSeguimiento","Pendiente Seguimiento:"+parent.__c.CRLF+"  - SIN Fecha Prometida"+parent.__c.CRLF+"o"+parent.__c.CRLF+" - Fecha Prometida Vencida","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602254;
 //BA.debugLineNum = 7602254;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"FechaPrometidaVencida","Fecha Prometida Vencida","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602255;
 //BA.debugLineNum = 7602255;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"DiasRespectoAPlazo","Días Respecto al plazo prometido por el proveedor","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602256;
 //BA.debugLineNum = 7602256;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"FechaEnvioReclamacionLong","Fecha en la que se grabó la última reclamación de plazo para cada Pedido-Línea","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602257;
 //BA.debugLineNum = 7602257;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"ExcluidoReclamacion","Marcar para EXCLUIR del informe de reclamación que se adjuntará al correo.","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602258;
 //BA.debugLineNum = 7602258;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"VPG","Grupo Contable Negocio del proveedor.","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602259;
 //BA.debugLineNum = 7602259;BA.debugLine="jamTableView1.ToolTipTableColumnColorFondoColorTe";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"DiasDesdePedido","Nº de días transcurridos entre la fecha de creación del pedido y la fecha actual.","lightyellow","black",(float) (14));
RDebugUtils.currentLine=7602261;
 //BA.debugLineNum = 7602261;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=7602265;
 //BA.debugLineNum = 7602265;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
if (true) break;

case 5:
//if
this.state = 10;
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=7602267;
 //BA.debugLineNum = 7602267;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nom";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=7602272;
 //BA.debugLineNum = 7602272;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=7602274;
 //BA.debugLineNum = 7602274;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=7602276;
 //BA.debugLineNum = 7602276;BA.debugLine="Dim joForm As JavaObject=asJO(frm)";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ )));
RDebugUtils.currentLine=7602277;
 //BA.debugLineNum = 7602277;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=7602278;
 //BA.debugLineNum = 7602278;BA.debugLine="joStage.RunMethod(\"setMaximized\",Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=7602282;
 //BA.debugLineNum = 7602282;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=7602284;
 //BA.debugLineNum = 7602284;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlook";
__ref._crearvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=7602288;
 //BA.debugLineNum = 7602288;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTML";
__ref._crearvbsscriptenvioemailoutlookhtml /*String*/ (null);
RDebugUtils.currentLine=7602290;
 //BA.debugLineNum = 7602290;BA.debugLine="WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "show"), __ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 11;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=7602291;
 //BA.debugLineNum = 7602291;BA.debugLine="If rBool= False Then SalirModulo";
if (true) break;

case 11:
//if
this.state = 16;
if (_rbool==parent.__c.False) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
__ref._salirmodulo /*String*/ (null);
if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=7602293;
 //BA.debugLineNum = 7602293;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatos(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatos", null));}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
long _fechahoyhora0 = 0L;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbqtysenrecepptes = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="Wait For(ActualizarDatosFechasPrometidasComprasPe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), __ref._actualizardatosfechasprometidascompraspendientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("OK") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="Dim FechaHoyHora0 As Long=DateUtils.SetDate(DateT";
_fechahoyhora0 = parent._dateutils._setdate(parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetMonth(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetDayOfMonth(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaPrometidaVencida=1 where FechaPrometida>? and FechaPrometida<?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0),(Object)(_fechahoyhora0)}));
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set PendienteSeguimiento=1 where FechaPrometidaVencida=? or FechaPrometida<?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(0)}));
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set FechaHoyHora0=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fechahoyhora0)}));
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasRespectoAPlazo=(FechaPrometida-FechaHoyHora0)/? where FechaPrometida>0",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdePedido=(FechaHoyHora0-FechaPedido)/?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=7929873;
 //BA.debugLineNum = 7929873;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set DiasDesdeReclamacion=(FechaHoyHora0-FechaEnvioReclamacionLong)/? where FechaEnvioReclamacionLong>0",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=7929875;
 //BA.debugLineNum = 7929875;BA.debugLine="Wait For(CargaDatosPedidosCompraRecepcionesPendie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), __ref._cargadatospedidoscomprarecepcionespendientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"PROIN",parent.__c.True));
this.state = 35;
return;
case 35:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7929876;
 //BA.debugLineNum = 7929876;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=7929877;
 //BA.debugLineNum = 7929877;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_accion).equals("OK") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=7929878;
 //BA.debugLineNum = 7929878;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=7929879;
 //BA.debugLineNum = 7929879;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=7929882;
 //BA.debugLineNum = 7929882;BA.debugLine="Wait For(CargaDatosPedidosCompraRecepcionesPendie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), __ref._cargadatospedidoscomprarecepcionespendientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"PROTEC",parent.__c.False));
this.state = 36;
return;
case 36:
//C
this.state = 9;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7929883;
 //BA.debugLineNum = 7929883;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=7929884;
 //BA.debugLineNum = 7929884;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_accion).equals("OK") == false) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=7929885;
 //BA.debugLineNum = 7929885;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=7929886;
 //BA.debugLineNum = 7929886;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=7929889;
 //BA.debugLineNum = 7929889;BA.debugLine="Dim sbQtysEnRecepPtes As StringBuilder";
_sbqtysenrecepptes = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7929890;
 //BA.debugLineNum = 7929890;BA.debugLine="sbQtysEnRecepPtes.Initialize";
_sbqtysenrecepptes.Initialize();
RDebugUtils.currentLine=7929891;
 //BA.debugLineNum = 7929891;BA.debugLine="sbQtysEnRecepPtes.Append(\"update tblDatosFechasPr";
_sbqtysenrecepptes.Append("update tblDatosFechasPrometidasPedidosCompraPendientes as t1 set QtyEnAlmacenRecepcionPendiente=tRecepPtesAlm.QtyRecepPte from");
RDebugUtils.currentLine=7929892;
 //BA.debugLineNum = 7929892;BA.debugLine="sbQtysEnRecepPtes.Append(\" (Select Pedido, Linea,";
_sbqtysenrecepptes.Append(" (Select Pedido, Linea, Articulo, Talla, sum(QtyARecibir) As QtyRecepPte from tblDatosFechasPrometidasPedidosCompraPendientes tDF join");
RDebugUtils.currentLine=7929893;
 //BA.debugLineNum = 7929893;BA.debugLine="sbQtysEnRecepPtes.Append(\" tblPedidosCompraRecepc";
_sbqtysenrecepptes.Append(" tblPedidosCompraRecepcionesPendientesAlmacen tPCRPA on tdf.Pedido=tPCRPA.PedidoNav And tdf.Proveedor=tPCRPA.ProvOrigen group by Pedido, Linea, Articulo, Talla) As tRecepPtesAlm");
RDebugUtils.currentLine=7929894;
 //BA.debugLineNum = 7929894;BA.debugLine="sbQtysEnRecepPtes.Append(\" where t1.Pedido=tRecep";
_sbqtysenrecepptes.Append(" where t1.Pedido=tRecepPtesAlm.Pedido And t1.Linea=tRecepPtesAlm.Linea");
RDebugUtils.currentLine=7929895;
 //BA.debugLineNum = 7929895;BA.debugLine="mSQL.ExecNonQuery(sbQtysEnRecepPtes.tostring)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbqtysenrecepptes.ToString());
RDebugUtils.currentLine=7929898;
 //BA.debugLineNum = 7929898;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblDatosFechasPrometidasPedidosCompraPendientes order by Pedido, Linea");
RDebugUtils.currentLine=7929899;
 //BA.debugLineNum = 7929899;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=7929900;
 //BA.debugLineNum = 7929900;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _rsub);
this.state = 37;
return;
case 37:
//C
this.state = 13;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=7929901;
 //BA.debugLineNum = 7929901;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=7929902;
 //BA.debugLineNum = 7929902;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 13:
//if
this.state = 33;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=7929903;
 //BA.debugLineNum = 7929903;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 16:
//if
this.state = 23;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=7929904;
 //BA.debugLineNum = 7929904;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=7929905;
 //BA.debugLineNum = 7929905;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _msa);
this.state = 38;
return;
case 38:
//C
this.state = 19;
;
RDebugUtils.currentLine=7929907;
 //BA.debugLineNum = 7929907;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=7929908;
 //BA.debugLineNum = 7929908;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 19;
_rint = (int) result[1];
;
RDebugUtils.currentLine=7929909;
 //BA.debugLineNum = 7929909;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=7929910;
 //BA.debugLineNum = 7929910;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=7929911;
 //BA.debugLineNum = 7929911;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=7929914;
 //BA.debugLineNum = 7929914;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=7929916;
 //BA.debugLineNum = 7929916;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 23:
//if
this.state = 32;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=7929917;
 //BA.debugLineNum = 7929917;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 26:
//if
this.state = 31;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=7929918;
 //BA.debugLineNum = 7929918;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=7929919;
 //BA.debugLineNum = 7929919;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatos"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=7929924;
 //BA.debugLineNum = 7929924;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=7929926;
 //BA.debugLineNum = 7929926;BA.debugLine="jamTableView1.AddFiltroCampoValorInicial(\"Pendien";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addfiltrocampovalorinicial /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"PendienteSeguimiento",(Object)(1));
RDebugUtils.currentLine=7929928;
 //BA.debugLineNum = 7929928;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=7929929;
 //BA.debugLineNum = 7929929;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosfechasprometidascompraspendientes(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "actualizardatosfechasprometidascompraspendientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosfechasprometidascompraspendientes", null));}
ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes rsub = new ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes extends BA.ResumableSub {
public ResumableSub_ActualizarDatosFechasPrometidasComprasPendientes(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblDatosFechasProm";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblDatosFechasPrometidasPedidosCompraPendientes");
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
_slinkjrdc = parent._main._rdclinknav /*String*/ ;
RDebugUtils.currentLine=8060934;
 //BA.debugLineNum = 8060934;BA.debugLine="Dim Comando As String=\"PedidosCompraPendientesFec";
_comando = "PedidosCompraPendientesFechasPrometidasReclamaciones";
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatosfechasprometidascompraspendientes"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatosfechasprometidascompraspendientes"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8060945;
 //BA.debugLineNum = 8060945;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=8060946;
 //BA.debugLineNum = 8060946;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=8060947;
 //BA.debugLineNum = 8060947;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=8060948;
 //BA.debugLineNum = 8060948;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de .............","Aviso");
RDebugUtils.currentLine=8060949;
 //BA.debugLineNum = 8060949;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "actualizardatosfechasprometidascompraspendientes"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=8060951;
 //BA.debugLineNum = 8060951;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=8060952;
 //BA.debugLineNum = 8060952;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=8060953;
 //BA.debugLineNum = 8060953;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=8060954;
 //BA.debugLineNum = 8060954;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblDatosFechasPrometidasPedidosCompraPendientes",_lstreg);
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=8060957;
 //BA.debugLineNum = 8060957;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=8060958;
 //BA.debugLineNum = 8060958;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
__ref._borrarvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
__ref._borrarvbsscriptenvioemailoutlook /*String*/ (null);
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatospedidoscomprarecepcionespendientes(b4j.docU.cseguimientofechasprometidascompra __ref,String _almfisico,boolean _borrarcontenidotabla) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "cargadatospedidoscomprarecepcionespendientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatospedidoscomprarecepcionespendientes", new Object[] {_almfisico,_borrarcontenidotabla}));}
ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes rsub = new ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes(this,__ref,_almfisico,_borrarcontenidotabla);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes extends BA.ResumableSub {
public ResumableSub_CargaDatosPedidosCompraRecepcionesPendientes(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,String _almfisico,boolean _borrarcontenidotabla) {
this.parent = parent;
this.__ref = __ref;
this._almfisico = _almfisico;
this._borrarcontenidotabla = _borrarcontenidotabla;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _almfisico;
boolean _borrarcontenidotabla;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="If BorrarContenidoTabla Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_borrarcontenidotabla) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblPedidosCompraR";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblPedidosCompraRecepcionesPendientesAlmacen");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="Select Case AlmFisico";
if (true) break;

case 5:
//select
this.state = 12;
switch (BA.switchObjectToInt(_almfisico,"PROIN","PROTEC")) {
case 0: {
this.state = 7;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlAlmPro";
_slinkjrdc = parent._main._rdclinkmysqlalmproin /*String*/ ;
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlAlmPro";
_slinkjrdc = parent._main._rdclinkmysqlalmprotec /*String*/ ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="Dim Comando As String=\"PedidosCompraRecepcionesPe";
_comando = "PedidosCompraRecepcionesPendientes";
RDebugUtils.currentLine=9371667;
 //BA.debugLineNum = 9371667;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=9371669;
 //BA.debugLineNum = 9371669;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "cargadatospedidoscomprarecepcionespendientes"), null);
this.state = 25;
return;
case 25:
//C
this.state = 13;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=9371670;
 //BA.debugLineNum = 9371670;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 13:
//if
this.state = 24;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=9371672;
 //BA.debugLineNum = 9371672;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "cargadatospedidoscomprarecepcionespendientes"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 24;
;
RDebugUtils.currentLine=9371673;
 //BA.debugLineNum = 9371673;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=9371674;
 //BA.debugLineNum = 9371674;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then' puede no hab";
if (true) break;

case 18:
//if
this.state = 23;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=9371677;
 //BA.debugLineNum = 9371677;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=9371678;
 //BA.debugLineNum = 9371678;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=9371680;
 //BA.debugLineNum = 9371680;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=9371681;
 //BA.debugLineNum = 9371681;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=9371682;
 //BA.debugLineNum = 9371682;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=9371685;
 //BA.debugLineNum = 9371685;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblPedidosCompraRecepcionesPendientesAlmacen",_lstreg);
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=9371688;
 //BA.debugLineNum = 9371688;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=9371689;
 //BA.debugLineNum = 9371689;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _alternarexcluidoreclamacion(b4j.docU.cseguimientofechasprometidascompra __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "alternarexcluidoreclamacion", false))
	 {return ((String) Debug.delegate(ba, "alternarexcluidoreclamacion", new Object[] {_datosceldaseleccionada}));}
int _valoractual = 0;
int _nuevovalor = 0;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _pedidosel = "";
String _lineasel = "";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Log(DatosCeldaSeleccionada)";
__c.LogImpl("88454145",BA.ObjectToString(_datosceldaseleccionada),0);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
_valoractual = (int)(BA.ObjectToNumber(_datosceldaseleccionada.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Dim NuevoValor As Int";
_nuevovalor = 0;
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Select ValorActual";
switch (_valoractual) {
case 0: {
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="NuevoValor=1";
_nuevovalor = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="NuevoValor=0";
_nuevovalor = (int) (0);
 break; }
}
;
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
_pedidosel = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
_lineasel = BA.ObjectToString(_mpk.Get((Object)("Linea")));
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nuevovalor),(Object)(_pedidosel),(Object)(_lineasel)}));
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescartablavalorceldaeditada /*String*/ (null,_datosceldaseleccionada.Fila /*int*/ ,_datosceldaseleccionada.Columna /*int*/ ,(Object)(_nuevovalor),_datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._seleccionarcelda /*String*/ (null,"ExcluidoReclamacion",_datosceldaseleccionada.Fila /*int*/ );
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.cseguimientofechasprometidascompra __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return null;
}
public String  _borrarvbsscriptdireccionremitenteemailoutlook(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "borrarvbsscriptdireccionremitenteemailoutlook", false))
	 {return ((String) Debug.delegate(ba, "borrarvbsscriptdireccionremitenteemailoutlook", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub BorrarVBSScriptDireccionRemitenteEmailOutlook";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc.vbs\")";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs")) { 
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc.vbs\")";
__c.File.Delete(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs");
 };
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="End Sub";
return "";
}
public String  _borrarvbsscriptenvioemailoutlook(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "borrarvbsscriptenvioemailoutlook", false))
	 {return ((String) Debug.delegate(ba, "borrarvbsscriptenvioemailoutlook", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub BorrarVBSScriptEnvioEmailOutlook";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc2.vbs\")";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs")) { 
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc2.vbs\")";
__c.File.Delete(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs");
 };
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _carpetaconfiguradaficherosreclamaciones(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "carpetaconfiguradaficherosreclamaciones", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "carpetaconfiguradaficherosreclamaciones", null));}
ResumableSub_CarpetaConfiguradaFicherosReclamaciones rsub = new ResumableSub_CarpetaConfiguradaFicherosReclamaciones(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CarpetaConfiguradaFicherosReclamaciones extends BA.ResumableSub {
public ResumableSub_CarpetaConfiguradaFicherosReclamaciones(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mcarp = null;
String _carpetafich = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"CarpetaDatoAplicacion",new Object[]{(Object)("docU"),(Object)("FicherosReclamacionesFechasPrometidasCompras")},parent);
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "carpetaconfiguradaficherosreclamaciones"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query CarpetaDatoAplicacion","Error");
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "carpetaconfiguradaficherosreclamaciones"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=8716302;
 //BA.debugLineNum = 8716302;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8716306;
 //BA.debugLineNum = 8716306;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=8716307;
 //BA.debugLineNum = 8716307;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay defin";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay definida una carpeta predeterminada para ubicar los ficheros de reclamaciones.","Error");
RDebugUtils.currentLine=8716308;
 //BA.debugLineNum = 8716308;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "carpetaconfiguradaficherosreclamaciones"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=8716309;
 //BA.debugLineNum = 8716309;BA.debugLine="Accion=\"NO\"";
_accion = "NO";
RDebugUtils.currentLine=8716310;
 //BA.debugLineNum = 8716310;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=8716312;
 //BA.debugLineNum = 8716312;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=8716313;
 //BA.debugLineNum = 8716313;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=8716314;
 //BA.debugLineNum = 8716314;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=8716315;
 //BA.debugLineNum = 8716315;BA.debugLine="Dim mCarp As Map=lstReg.Get(0)";
_mcarp = new anywheresoftware.b4a.objects.collections.Map();
_mcarp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=8716316;
 //BA.debugLineNum = 8716316;BA.debugLine="Dim CarpetaFich As String=mCarp.GetValueAt(0)";
_carpetafich = BA.ObjectToString(_mcarp.GetValueAt((int) (0)));
RDebugUtils.currentLine=8716317;
 //BA.debugLineNum = 8716317;BA.debugLine="mRes.Put(\"CarpetaFichero\", CarpetaFich)";
_mres.Put((Object)("CarpetaFichero"),(Object)(_carpetafich));
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=8716320;
 //BA.debugLineNum = 8716320;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=8716321;
 //BA.debugLineNum = 8716321;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Dim DireccionSeleccionadaRemitenteEmails As Strin";
_direccionseleccionadaremitenteemails = "";
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Public PermisoUsuarioModulo As String";
_permisousuariomodulo = "";
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblDatosFechasPrometidasPedidosCompraPendientes"}))));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDatosFechasProm";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblDatosFechasPrometidasPedidosCompraPendientes");
 };
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblDatosFechasPrometidasPedidosCompraPendientes (");
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("Pedido TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="sbCrearTabla.Append(\"Proveedor TEXT COLLATE NOCAS";
_sbcreartabla.Append("Proveedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="sbCrearTabla.Append(\"NombreProveedor TEXT COLLATE";
_sbcreartabla.Append("NombreProveedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="sbCrearTabla.Append(\"DireccionEmail TEXT COLLATE";
_sbcreartabla.Append("DireccionEmail TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="sbCrearTabla.Append(\"FechaPedido INTEGER,\")";
_sbcreartabla.Append("FechaPedido INTEGER,");
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="sbCrearTabla.Append(\"DiasDesdePedido INTEGER defa";
_sbcreartabla.Append("DiasDesdePedido INTEGER default 0,");
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="sbCrearTabla.Append(\"VPG TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("VPG TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER ,\")";
_sbcreartabla.Append("Linea INTEGER ,");
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
_sbcreartabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="sbCrearTabla.Append(\"Qty REAL,\")";
_sbcreartabla.Append("Qty REAL,");
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="sbCrearTabla.Append(\"QtyRecibida REAL,\")";
_sbcreartabla.Append("QtyRecibida REAL,");
RDebugUtils.currentLine=7995415;
 //BA.debugLineNum = 7995415;BA.debugLine="sbCrearTabla.Append(\"QtyPendiente REAL,\")";
_sbcreartabla.Append("QtyPendiente REAL,");
RDebugUtils.currentLine=7995416;
 //BA.debugLineNum = 7995416;BA.debugLine="sbCrearTabla.Append(\"QtyARecibir REAL,\")";
_sbcreartabla.Append("QtyARecibir REAL,");
RDebugUtils.currentLine=7995417;
 //BA.debugLineNum = 7995417;BA.debugLine="sbCrearTabla.Append(\"QtyEnAlmacenRecepcionPendien";
_sbcreartabla.Append("QtyEnAlmacenRecepcionPendiente REAL default 0,");
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="sbCrearTabla.Append(\"RecPteRecep REAL,\")";
_sbcreartabla.Append("RecPteRecep REAL,");
RDebugUtils.currentLine=7995419;
 //BA.debugLineNum = 7995419;BA.debugLine="sbCrearTabla.Append(\"FechaPrometida INTEGER,\")";
_sbcreartabla.Append("FechaPrometida INTEGER,");
RDebugUtils.currentLine=7995420;
 //BA.debugLineNum = 7995420;BA.debugLine="sbCrearTabla.Append(\"FechaPrometidaOriginal INTEG";
_sbcreartabla.Append("FechaPrometidaOriginal INTEGER,");
RDebugUtils.currentLine=7995421;
 //BA.debugLineNum = 7995421;BA.debugLine="sbCrearTabla.Append(\"FechaPrometidaOriginalModifi";
_sbcreartabla.Append("FechaPrometidaOriginalModificada INTEGER,");
RDebugUtils.currentLine=7995422;
 //BA.debugLineNum = 7995422;BA.debugLine="sbCrearTabla.Append(\"FechaPrometidaVencida INTEGE";
_sbcreartabla.Append("FechaPrometidaVencida INTEGER default 0,");
RDebugUtils.currentLine=7995423;
 //BA.debugLineNum = 7995423;BA.debugLine="sbCrearTabla.Append(\"PendienteSeguimiento INTEGER";
_sbcreartabla.Append("PendienteSeguimiento INTEGER default 0,");
RDebugUtils.currentLine=7995424;
 //BA.debugLineNum = 7995424;BA.debugLine="sbCrearTabla.Append(\"FechaHoyHora0 INTEGER defaul";
_sbcreartabla.Append("FechaHoyHora0 INTEGER default 0,");
RDebugUtils.currentLine=7995425;
 //BA.debugLineNum = 7995425;BA.debugLine="sbCrearTabla.Append(\"DiasRespectoAPlazo INTEGER d";
_sbcreartabla.Append("DiasRespectoAPlazo INTEGER default 0,");
RDebugUtils.currentLine=7995426;
 //BA.debugLineNum = 7995426;BA.debugLine="sbCrearTabla.Append(\"ExcluidoReclamacion INTEGER";
_sbcreartabla.Append("ExcluidoReclamacion INTEGER default 0,");
RDebugUtils.currentLine=7995427;
 //BA.debugLineNum = 7995427;BA.debugLine="sbCrearTabla.Append(\"IDReclamacionFPC INTEGER def";
_sbcreartabla.Append("IDReclamacionFPC INTEGER default 0,");
RDebugUtils.currentLine=7995428;
 //BA.debugLineNum = 7995428;BA.debugLine="sbCrearTabla.Append(\"FechaEnvioReclamacionLong IN";
_sbcreartabla.Append("FechaEnvioReclamacionLong INTEGER default 0,");
RDebugUtils.currentLine=7995429;
 //BA.debugLineNum = 7995429;BA.debugLine="sbCrearTabla.Append(\"DiasDesdeReclamacion INTEGER";
_sbcreartabla.Append("DiasDesdeReclamacion INTEGER default 0,");
RDebugUtils.currentLine=7995430;
 //BA.debugLineNum = 7995430;BA.debugLine="sbCrearTabla.Append(\"IDUsuario INTEGER default 0,";
_sbcreartabla.Append("IDUsuario INTEGER default 0,");
RDebugUtils.currentLine=7995431;
 //BA.debugLineNum = 7995431;BA.debugLine="sbCrearTabla.Append(\"NombreUsuario TEXT COLLATE N";
_sbcreartabla.Append("NombreUsuario TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=7995432;
 //BA.debugLineNum = 7995432;BA.debugLine="sbCrearTabla.Append(\"DireccionEmailRemitente TEXT";
_sbcreartabla.Append("DireccionEmailRemitente TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=7995433;
 //BA.debugLineNum = 7995433;BA.debugLine="sbCrearTabla.Append(\"DireccionEmailDestinatario T";
_sbcreartabla.Append("DireccionEmailDestinatario TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=7995434;
 //BA.debugLineNum = 7995434;BA.debugLine="sbCrearTabla.Append(\"ReclamacionFPC TEXT COLLATE";
_sbcreartabla.Append("ReclamacionFPC TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=7995435;
 //BA.debugLineNum = 7995435;BA.debugLine="sbCrearTabla.Append(\"RecepcionesPendientes INTEGE";
_sbcreartabla.Append("RecepcionesPendientes INTEGER default 0)");
RDebugUtils.currentLine=7995438;
 //BA.debugLineNum = 7995438;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=7995440;
 //BA.debugLineNum = 7995440;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblPedidosCompraRecepcionesPendientesAlmacen"}))));
RDebugUtils.currentLine=7995441;
 //BA.debugLineNum = 7995441;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=7995442;
 //BA.debugLineNum = 7995442;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblPedidosCompraRe";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblPedidosCompraRecepcionesPendientesAlmacen");
 };
RDebugUtils.currentLine=7995444;
 //BA.debugLineNum = 7995444;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7995445;
 //BA.debugLineNum = 7995445;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=7995446;
 //BA.debugLineNum = 7995446;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
_sbcreartabla.Append("CREATE TABLE If Not EXISTS [tblPedidosCompraRecepcionesPendientesAlmacen] ([LR] INTEGER, [FechaCreacion] INTEGER, [PedidoNav] TEXT, [ProvOrigen] TEXT)");
RDebugUtils.currentLine=7995447;
 //BA.debugLineNum = 7995447;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=7995449;
 //BA.debugLineNum = 7995449;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _crearcabecerareclamacion(b4j.docU.cseguimientofechasprometidascompra __ref,long _fenviolong,int _idu,String _nombreusu,String _diremailrem,String _diremaildest) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "crearcabecerareclamacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "crearcabecerareclamacion", new Object[] {_fenviolong,_idu,_nombreusu,_diremailrem,_diremaildest}));}
ResumableSub_CrearCabeceraReclamacion rsub = new ResumableSub_CrearCabeceraReclamacion(this,__ref,_fenviolong,_idu,_nombreusu,_diremailrem,_diremaildest);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearCabeceraReclamacion extends BA.ResumableSub {
public ResumableSub_CrearCabeceraReclamacion(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,long _fenviolong,int _idu,String _nombreusu,String _diremailrem,String _diremaildest) {
this.parent = parent;
this.__ref = __ref;
this._fenviolong = _fenviolong;
this._idu = _idu;
this._nombreusu = _nombreusu;
this._diremailrem = _diremailrem;
this._diremaildest = _diremaildest;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
long _fenviolong;
int _idu;
String _nombreusu;
String _diremailrem;
String _diremaildest;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="Dim Comando As String=\"NuevaReclamacionFechasProm";
_comando = "NuevaReclamacionFechasPrometidasCompras";
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_fenviolong),(Object)(_idu),(Object)(_nombreusu),(Object)(_diremailrem),(Object)(_diremaildest)},parent);
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "crearcabecerareclamacion"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=9306123;
 //BA.debugLineNum = 9306123;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=9306124;
 //BA.debugLineNum = 9306124;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "crearcabecerareclamacion"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=9306125;
 //BA.debugLineNum = 9306125;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=9306126;
 //BA.debugLineNum = 9306126;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=9306129;
 //BA.debugLineNum = 9306129;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
RDebugUtils.currentLine=9306130;
 //BA.debugLineNum = 9306130;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=9306131;
 //BA.debugLineNum = 9306131;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=9306133;
 //BA.debugLineNum = 9306133;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=9306134;
 //BA.debugLineNum = 9306134;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=9306135;
 //BA.debugLineNum = 9306135;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=9306136;
 //BA.debugLineNum = 9306136;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.toUpperCase().startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=9306137;
 //BA.debugLineNum = 9306137;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de SP";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de SP "+_sresp+".","Error");
RDebugUtils.currentLine=9306138;
 //BA.debugLineNum = 9306138;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "crearcabecerareclamacion"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=9306139;
 //BA.debugLineNum = 9306139;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=9306141;
 //BA.debugLineNum = 9306141;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=9306142;
 //BA.debugLineNum = 9306142;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=9306143;
 //BA.debugLineNum = 9306143;BA.debugLine="mRes.Put(\"IDReclamacionFPC\", mResp.Get(\"IDRecl";
_mres.Put((Object)("IDReclamacionFPC"),_mresp.Get((Object)("IDReclamacionFPC")));
RDebugUtils.currentLine=9306144;
 //BA.debugLineNum = 9306144;BA.debugLine="mRes.Put(\"ReclamacionFPC\", mResp.Get(\"Reclamac";
_mres.Put((Object)("ReclamacionFPC"),_mresp.Get((Object)("ReclamacionFPC")));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=9306148;
 //BA.debugLineNum = 9306148;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=9306149;
 //BA.debugLineNum = 9306149;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _crearvbsscriptdireccionremitenteemailoutlook(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "crearvbsscriptdireccionremitenteemailoutlook", false))
	 {return ((String) Debug.delegate(ba, "crearvbsscriptdireccionremitenteemailoutlook", null));}
String _svbscript = "";
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub CrearVBSScriptDireccionRemitenteEmailOutlook";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
__ref._borrarvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Dim sVBscript As String";
_svbscript = "";
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
_svbscript = ("\n"+"		Option Explicit\n"+"		On Error Resume Next\n"+"		Dim xOLApp, olAccounts\n"+"		Dim objStdOut,objStdErr\n"+"			\n"+"		Set objStdOut = WScript.StdOut\n"+"		Set objStdErr = WScript.StdErr\n"+"			\n"+"		'Set xOLApp = CreateObject(\"Outlook.Application\")\n"+"		Set xOLApp =GetObject(, \"Outlook.Application\")\n"+"		If Err.Number<>0 Then\n"+"			If Err.Number=429 Then\n"+"				'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"			Else\n"+"				'MsgBox Err.Number & \" \" & Err.Description\n"+"				objStdErr.Write Err.Number & \" \" & Err.Description\n"+"			End If\n"+"			WScript.Quit (1) 'return code 1\n"+"		End If\n"+"\n"+"		Dim i\n"+"		For i = 1 To xOLApp.Session.Accounts.count\n"+"			objStdOut.Write xOLApp.Session.Accounts.Item(i) & \",\"\n"+"		Next\n"+"		Set xOLApp = Nothing\n"+"		If Err.Number<>0 Then\n"+"			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"+"			WScript.Quit (1)\n"+"		Else\n"+"			WScript.Quit (0)\n"+"		End If\n"+"			");
RDebugUtils.currentLine=8912959;
 //BA.debugLineNum = 8912959;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc.vbs\"";
__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs",_svbscript);
RDebugUtils.currentLine=8912960;
 //BA.debugLineNum = 8912960;BA.debugLine="End Sub";
return "";
}
public String  _crearvbsscriptenvioemailoutlookhtml(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "crearvbsscriptenvioemailoutlookhtml", false))
	 {return ((String) Debug.delegate(ba, "crearvbsscriptenvioemailoutlookhtml", null));}
String _svbscript = "";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub CrearVBSScriptEnvioEmailOutlookHTML";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
__ref._borrarvbsscriptenvioemailoutlook /*String*/ (null);
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Dim sVBscript As String";
_svbscript = "";
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
_svbscript = ("\n"+"		Option Explicit\n"+"		On Error Resume Next\n"+"\n"+"		Dim objStdOut,objStdErr\n"+"			\n"+"		Set objStdOut = WScript.StdOut\n"+"		Set objStdErr = WScript.StdErr\n"+"		\n"+"		Dim xOLApp\n"+"		Dim objMailItem\n"+"		\n"+"		'Dim OutAccount\n"+"		\n"+"		Dim signature\n"+"			\n"+"		'Set xOLApp = CreateObject(\"Outlook.Application\")\n"+"		Set xOLApp =GetObject(, \"Outlook.Application\")\n"+"		If Err.Number<>0 Then\n"+"			If Err.Number=429 Then\n"+"				'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"			Else\n"+"				'MsgBox Err.Number & \" \" & Err.Description\n"+"				objStdErr.Write Err.Number & \" \" & Err.Description\n"+"			End If\n"+"			WScript.Quit (1) 'return code 1\n"+"		End If\n"+"		Set objMailItem = xOLApp.CreateItem(0)\n"+"		\n"+"   		objMailItem.Display\n"+"		signature = objMailItem.HTMLBody\n"+"		\n"+"		'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))\n"+"		\n"+"		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)\n"+"		'objMailItem.SendUsingAccount = WScript.Arguments(0)\n"+"		'objMailItem.SendUsingAccount = OutAccount\n"+"		'objMailItem.SentOnBehalfOfName = OutAccount\n"+"		\n"+"		objMailItem.To = WScript.Arguments(1)\n"+"		if WScript.Arguments(5)<>\"None\" then\n"+"			objMailItem.CC = WScript.Arguments(5)\n"+"		end if\n"+"		objMailItem.Subject = WScript.Arguments(2)\n"+"		'objMailItem.HTMLBody = WScript.Arguments(3) & \"<br><br>\" & objMailItem.HTMLBody & \"</p>\"\n"+"		objMailItem.HTMLBody = \"<p><br>\" & WScript.Arguments(3) & \"<br>\" & signature & \"</p>\"\n"+"		objMailItem.Attachments.Add WScript.Arguments(4)\n"+"		'objMailItem.Send\n"+"		Set xOLApp = Nothing\n"+"		Set objMailItem = Nothing\n"+"		If Err.Number = 0 Then\n"+"			objStdOut.Write \"Email enviado\"\n"+"			WScript.Quit (0)\n"+"		Else\n"+"			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"+"			WScript.Quit (1)\n"+"		End If\n"+"			");
RDebugUtils.currentLine=9044033;
 //BA.debugLineNum = 9044033;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc2.vbs";
__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs",_svbscript);
RDebugUtils.currentLine=9044034;
 //BA.debugLineNum = 9044034;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ejecutarvbsscriptdireccionesemail(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "ejecutarvbsscriptdireccionesemail", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ejecutarvbsscriptdireccionesemail", null));}
ResumableSub_EjecutarVBSScriptDireccionesEmail rsub = new ResumableSub_EjecutarVBSScriptDireccionesEmail(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EjecutarVBSScriptDireccionesEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptDireccionesEmail(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
_shl.Initialize("shl","c:\\windows\\system32\\cscript.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"//nologo","smfpromc.vbs"}));
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
_shl.setWorkingDirectory(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder());
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "ejecutarvbsscriptdireccionesemail"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="Log(\"Success\")";
parent.__c.LogImpl("89175050","Success",0);
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("89175051",_stdout,0);
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="mRes.Put(\"Success\",True)";
_mres.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
_mres.Put((Object)("StdOut"),(Object)(_stdout));
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
_mres.Put((Object)("StdErr"),(Object)(_stderr));
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
_mres.Put((Object)("ExitCode"),(Object)(_exitcode));
RDebugUtils.currentLine=9175056;
 //BA.debugLineNum = 9175056;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ejecutarvbsscriptenviaremail(b4j.docU.cseguimientofechasprometidascompra __ref,String _senderaddr,String _receiveraddr,String _subject,String _body,String _fileattch,String _ccreceiveraddr) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "ejecutarvbsscriptenviaremail", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ejecutarvbsscriptenviaremail", new Object[] {_senderaddr,_receiveraddr,_subject,_body,_fileattch,_ccreceiveraddr}));}
ResumableSub_EjecutarVBSScriptEnviarEmail rsub = new ResumableSub_EjecutarVBSScriptEnviarEmail(this,__ref,_senderaddr,_receiveraddr,_subject,_body,_fileattch,_ccreceiveraddr);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EjecutarVBSScriptEnviarEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptEnviarEmail(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,String _senderaddr,String _receiveraddr,String _subject,String _body,String _fileattch,String _ccreceiveraddr) {
this.parent = parent;
this.__ref = __ref;
this._senderaddr = _senderaddr;
this._receiveraddr = _receiveraddr;
this._subject = _subject;
this._body = _body;
this._fileattch = _fileattch;
this._ccreceiveraddr = _ccreceiveraddr;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _senderaddr;
String _receiveraddr;
String _subject;
String _body;
String _fileattch;
String _ccreceiveraddr;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
_body = _body.replace(parent.__c.CRLF,"<br>");
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
_shl.Initialize("shl","c:\\windows\\system32\\cscript.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"//nologo","smfpromc2.vbs",_senderaddr,_receiveraddr,_subject,_body,_fileattch,_ccreceiveraddr}));
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
_shl.setWorkingDirectory(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder());
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "ejecutarvbsscriptenviaremail"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="Log(\"Success\")";
parent.__c.LogImpl("89240589","Success",0);
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("89240590",_stdout,0);
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="mRes.Put(\"Success\",True)";
_mres.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
_mres.Put((Object)("StdOut"),(Object)(_stdout));
RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
_mres.Put((Object)("StdErr"),(Object)(_stderr));
RDebugUtils.currentLine=9240594;
 //BA.debugLineNum = 9240594;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
_mres.Put((Object)("ExitCode"),(Object)(_exitcode));
RDebugUtils.currentLine=9240595;
 //BA.debugLineNum = 9240595;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=9240596;
 //BA.debugLineNum = 9240596;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _emailreclamacionproveedor(b4j.docU.cseguimientofechasprometidascompra __ref,String _proveedor,String _nombreproveedor,String _direccionemail) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "emailreclamacionproveedor", false))
	 {Debug.delegate(ba, "emailreclamacionproveedor", new Object[] {_proveedor,_nombreproveedor,_direccionemail}); return;}
ResumableSub_EmailReclamacionProveedor rsub = new ResumableSub_EmailReclamacionProveedor(this,__ref,_proveedor,_nombreproveedor,_direccionemail);
rsub.resume(ba, null);
}
public static class ResumableSub_EmailReclamacionProveedor extends BA.ResumableSub {
public ResumableSub_EmailReclamacionProveedor(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,String _proveedor,String _nombreproveedor,String _direccionemail) {
this.parent = parent;
this.__ref = __ref;
this._proveedor = _proveedor;
this._nombreproveedor = _nombreproveedor;
this._direccionemail = _direccionemail;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _proveedor;
String _nombreproveedor;
String _direccionemail;
Object _msa = null;
int _lineasrecl = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
String _carpetafichero = "";
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _direcciondestinoemail = "";
String _direcciondestinoemailcc = "";
boolean _rbool = false;
int _idrecl = 0;
String _recl = "";
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rspedlin = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.docU.xlutils _xl = null;
b4j.docU.xlworkbookwriter _workbook = null;
b4j.docU.xlsheetwriter _sheet1 = null;
String _dateformatant = "";
int _numcolsrs = 0;
b4j.docU.xlstyle _headerstyle = null;
int _idxcol = 0;
b4j.docU.xlstyle _fechasstyle = null;
anywheresoftware.b4a.objects.collections.List _rowstyles = null;
int _idxfila = 0;
String _nombrecampo = "";
long _ticks = 0L;
long _tickshora0 = 0L;
int _ultimafila = 0;
int _i = 0;
String _filename = "";
String _sbbody = "";
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
Object _robj = null;
int step135;
int limit135;
int step147;
int limit147;
int step180;
int limit180;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="If PermisoUsuarioModulo<>\"RW\" And PermisoUsuarioM";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._permisousuariomodulo /*String*/ ).equals("RW") == false && (__ref._permisousuariomodulo /*String*/ ).equals("ADMIN") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes per";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No tienes permiso para enviar email de reclamación.","Aviso");
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 155;
return;
case 155:
//C
this.state = 4;
;
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Dim LineasRecl As Int=jamTableView1.FixNullInt(mS";
_lineasrecl = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._fixnullint /*int*/ (null,(Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and ExcluidoReclamacion=? order by Pedido, Linea",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_proveedor,BA.NumberToString(0)}))));
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="If LineasRecl=0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_lineasrecl==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay líneas";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay líneas no excluidas para enviar en la reclamación de plazo.","Aviso");
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 156;
return;
case 156:
//C
this.state = 8;
;
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Wait For(CarpetaConfiguradaFicherosReclamaciones)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref._carpetaconfiguradaficherosreclamaciones /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 157;
return;
case 157:
//C
this.state = 9;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 9:
//if
this.state = 14;
if ((_accion).equals("OK") == false) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) return ;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Dim CarpetaFichero As String=mRes.Get(\"CarpetaFic";
_carpetafichero = BA.ObjectToString(_mres.Get((Object)("CarpetaFichero")));
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="If File.Exists(CarpetaFichero,\"\")=False Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent.__c.File.Exists(_carpetafichero,"")==parent.__c.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No existe la";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No existe la carpeta configurada para grabar los ficheros de reclamaciones."+parent.__c.CRLF+parent.__c.CRLF+_carpetafichero,"Aviso");
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 158;
return;
case 158:
//C
this.state = 18;
;
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="Dialog.Title=\"Confirma Dirección Email Destinatar";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Confirma Dirección Email Destinatario");
RDebugUtils.currentLine=8519706;
 //BA.debugLineNum = 8519706;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="InputDlg.Text=DireccionEmail.Trim";
_inputdlg._text /*String*/  = _direccionemail.trim();
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="InputDlg.RegexPattern=\"^(?i)[a-z0-9!#$%&'*+/=?^_`";
_inputdlg._regexpattern /*String*/  = "^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$";
RDebugUtils.currentLine=8519714;
 //BA.debugLineNum = 8519714;BA.debugLine="InputDlg.mBase.Width = 600dip";
_inputdlg._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=8519716;
 //BA.debugLineNum = 8519716;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=8519717;
 //BA.debugLineNum = 8519717;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=8519718;
 //BA.debugLineNum = 8519718;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=8519719;
 //BA.debugLineNum = 8519719;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=8519720;
 //BA.debugLineNum = 8519720;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=8519721;
 //BA.debugLineNum = 8519721;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=8519722;
 //BA.debugLineNum = 8519722;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=8519723;
 //BA.debugLineNum = 8519723;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 159;
return;
case 159:
//C
this.state = 19;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8519725;
 //BA.debugLineNum = 8519725;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 19:
//if
this.state = 24;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=8519726;
 //BA.debugLineNum = 8519726;BA.debugLine="Dim DireccionDestinoEmail As String=InputDlg.Text";
_direcciondestinoemail = _inputdlg._text /*String*/ .trim();
RDebugUtils.currentLine=8519728;
 //BA.debugLineNum = 8519728;BA.debugLine="Dim DireccionDestinoEmailCC As String";
_direcciondestinoemailcc = "";
RDebugUtils.currentLine=8519730;
 //BA.debugLineNum = 8519730;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Añadir otr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Añadir otra dirección de email a la que enviar el mensaje en copia?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8519731;
 //BA.debugLineNum = 8519731;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 160;
return;
case 160:
//C
this.state = 25;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8519732;
 //BA.debugLineNum = 8519732;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 25:
//if
this.state = 38;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=8519733;
 //BA.debugLineNum = 8519733;BA.debugLine="Dialog.Title=\"Indica Dirección Email Destinatari";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Dirección Email Destinatario (Copia)");
RDebugUtils.currentLine=8519734;
 //BA.debugLineNum = 8519734;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=8519735;
 //BA.debugLineNum = 8519735;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=8519736;
 //BA.debugLineNum = 8519736;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519737;
 //BA.debugLineNum = 8519737;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=8519738;
 //BA.debugLineNum = 8519738;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=8519739;
 //BA.debugLineNum = 8519739;BA.debugLine="InputDlg.RegexPattern=\"^(?i)[a-z0-9!#$%&'*+/=?^_";
_inputdlg._regexpattern /*String*/  = "^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$";
RDebugUtils.currentLine=8519742;
 //BA.debugLineNum = 8519742;BA.debugLine="InputDlg.mBase.Width = 600dip";
_inputdlg._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=8519744;
 //BA.debugLineNum = 8519744;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inp";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=8519745;
 //BA.debugLineNum = 8519745;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRe";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=8519746;
 //BA.debugLineNum = 8519746;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=8519747;
 //BA.debugLineNum = 8519747;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dial";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=8519748;
 //BA.debugLineNum = 8519748;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=8519749;
 //BA.debugLineNum = 8519749;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=8519750;
 //BA.debugLineNum = 8519750;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=8519751;
 //BA.debugLineNum = 8519751;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 161;
return;
case 161:
//C
this.state = 28;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8519753;
 //BA.debugLineNum = 8519753;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 28:
//if
this.state = 37;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 30;
}else {
this.state = 36;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=8519754;
 //BA.debugLineNum = 8519754;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"No se ha añadido direccion de email destinatario (copia) ¿Continuar con el proceso?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8519755;
 //BA.debugLineNum = 8519755;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 162;
return;
case 162:
//C
this.state = 31;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8519756;
 //BA.debugLineNum = 8519756;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 31:
//if
this.state = 34;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=8519757;
 //BA.debugLineNum = 8519757;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=8519760;
 //BA.debugLineNum = 8519760;BA.debugLine="Dim DireccionDestinoEmailCC As String=InputDlg.";
_direcciondestinoemailcc = _inputdlg._text /*String*/ .trim();
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;
;
RDebugUtils.currentLine=8519764;
 //BA.debugLineNum = 8519764;BA.debugLine="If DireccionDestinoEmailCC=\"\" Then DireccionDesti";

case 38:
//if
this.state = 43;
if ((_direcciondestinoemailcc).equals("")) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
_direcciondestinoemailcc = "None";
if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=8519805;
 //BA.debugLineNum = 8519805;BA.debugLine="If DireccionSeleccionadaRemitenteEmails=\"\" Then";
if (true) break;

case 44:
//if
this.state = 59;
if ((__ref._direccionseleccionadaremitenteemails /*String*/ ).equals("")) { 
this.state = 46;
}else {
this.state = 52;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=8519807;
 //BA.debugLineNum = 8519807;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails) c";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref._seleccionardireccionremitenteemails /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 163;
return;
case 163:
//C
this.state = 47;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=8519808;
 //BA.debugLineNum = 8519808;BA.debugLine="If rBool=False Then";
if (true) break;

case 47:
//if
this.state = 50;
if (_rbool==parent.__c.False) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=8519809;
 //BA.debugLineNum = 8519809;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es necesario";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es necesario seleccionar la dirección desde la que enviar emails."+parent.__c.CRLF+parent.__c.CRLF+"Selecciónala desde el menú de Acciones.","Aviso");
RDebugUtils.currentLine=8519810;
 //BA.debugLineNum = 8519810;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 164;
return;
case 164:
//C
this.state = 50;
;
RDebugUtils.currentLine=8519811;
 //BA.debugLineNum = 8519811;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 50:
//C
this.state = 59;
;
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=8519814;
 //BA.debugLineNum = 8519814;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La direcci";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"La dirección DESDE la que se enviará el correo será:"+parent.__c.CRLF+parent.__c.CRLF+__ref._direccionseleccionadaremitenteemails /*String*/ ,"Direccion envío email","Sí","Cancelar","Seleccionar Otra",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8519815;
 //BA.debugLineNum = 8519815;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 165;
return;
case 165:
//C
this.state = 53;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8519816;
 //BA.debugLineNum = 8519816;BA.debugLine="Select rInt";
if (true) break;

case 53:
//select
this.state = 58;
switch (BA.switchObjectToInt(_rint,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative)) {
case 0: {
this.state = 55;
if (true) break;
}
case 1: {
this.state = 57;
if (true) break;
}
}
if (true) break;

case 55:
//C
this.state = 58;
RDebugUtils.currentLine=8519818;
 //BA.debugLineNum = 8519818;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=8519820;
 //BA.debugLineNum = 8519820;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Selecciona otra cuenta remitente desde el menú Acciones.","Aviso");
RDebugUtils.currentLine=8519821;
 //BA.debugLineNum = 8519821;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 166;
return;
case 166:
//C
this.state = 58;
;
RDebugUtils.currentLine=8519822;
 //BA.debugLineNum = 8519822;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=8519826;
 //BA.debugLineNum = 8519826;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursorwaitdeshabilitartableview /*String*/ (null);
RDebugUtils.currentLine=8519827;
 //BA.debugLineNum = 8519827;BA.debugLine="Wait For(CrearCabeceraReclamacion(DateTime.Now,0,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref._crearcabecerareclamacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.DateTime.getNow(),(int) (0),parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,__ref._direccionseleccionadaremitenteemails /*String*/ ,_direcciondestinoemail));
this.state = 167;
return;
case 167:
//C
this.state = 60;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8519828;
 //BA.debugLineNum = 8519828;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=8519829;
 //BA.debugLineNum = 8519829;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 60:
//if
this.state = 65;
if ((_accion).equals("OK") == false) { 
this.state = 62;
;}if (true) break;

case 62:
//C
this.state = 65;
if (true) return ;
if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=8519830;
 //BA.debugLineNum = 8519830;BA.debugLine="Dim IDRecl As Int=mRes.Get(\"IDReclamacionFPC\")";
_idrecl = (int)(BA.ObjectToNumber(_mres.Get((Object)("IDReclamacionFPC"))));
RDebugUtils.currentLine=8519831;
 //BA.debugLineNum = 8519831;BA.debugLine="Dim Recl As String=mRes.Get(\"ReclamacionFPC\")";
_recl = BA.ObjectToString(_mres.Get((Object)("ReclamacionFPC")));
RDebugUtils.currentLine=8519833;
 //BA.debugLineNum = 8519833;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursorwaitdeshabilitartableview /*String*/ (null);
RDebugUtils.currentLine=8519834;
 //BA.debugLineNum = 8519834;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8519835;
 //BA.debugLineNum = 8519835;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=8519836;
 //BA.debugLineNum = 8519836;BA.debugLine="Dim rsPedLin As ResultSet=mSQL.ExecQuery2(\"select";
_rspedlin = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rspedlin = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select Pedido, Linea from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and PendienteSeguimiento=? and ExcluidoReclamacion=? order by Pedido, Linea",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_proveedor,BA.NumberToString(1),BA.NumberToString(0)}));
RDebugUtils.currentLine=8519837;
 //BA.debugLineNum = 8519837;BA.debugLine="Do While rsPedLin.NextRow";
if (true) break;

case 66:
//do while
this.state = 69;
while (_rspedlin.NextRow()) {
this.state = 68;
if (true) break;
}
if (true) break;

case 68:
//C
this.state = 66;
RDebugUtils.currentLine=8519838;
 //BA.debugLineNum = 8519838;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("UpdatePedidosLineasReclamacionesFPCMov0",new Object[]{(Object)(_rspedlin.GetString("Pedido")),(Object)(_rspedlin.GetInt("Linea"))});
RDebugUtils.currentLine=8519839;
 //BA.debugLineNum = 8519839;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
 if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=8519841;
 //BA.debugLineNum = 8519841;BA.debugLine="rsPedLin.Close";
_rspedlin.Close();
RDebugUtils.currentLine=8519843;
 //BA.debugLineNum = 8519843;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,_lstcomandos));
this.state = 168;
return;
case 168:
//C
this.state = 70;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=8519844;
 //BA.debugLineNum = 8519844;BA.debugLine="If Success=False Then";
if (true) break;

case 70:
//if
this.state = 73;
if (_success==parent.__c.False) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=8519845;
 //BA.debugLineNum = 8519845;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=8519846;
 //BA.debugLineNum = 8519846;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible resetear mov de las líneas de Pedido reclamaciones anteriores  "+_recl+".","Error");
RDebugUtils.currentLine=8519847;
 //BA.debugLineNum = 8519847;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 169;
return;
case 169:
//C
this.state = 73;
;
RDebugUtils.currentLine=8519848;
 //BA.debugLineNum = 8519848;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=8519851;
 //BA.debugLineNum = 8519851;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8519852;
 //BA.debugLineNum = 8519852;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=8519853;
 //BA.debugLineNum = 8519853;BA.debugLine="Dim rsPedLin As ResultSet=mSQL.ExecQuery2(\"select";
_rspedlin = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rspedlin = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select Pedido, Linea from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? And PendienteSeguimiento=? And ExcluidoReclamacion=? order by Pedido, Linea",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_proveedor,BA.NumberToString(1),BA.NumberToString(0)}));
RDebugUtils.currentLine=8519854;
 //BA.debugLineNum = 8519854;BA.debugLine="Do While rsPedLin.NextRow";
if (true) break;

case 74:
//do while
this.state = 77;
while (_rspedlin.NextRow()) {
this.state = 76;
if (true) break;
}
if (true) break;

case 76:
//C
this.state = 74;
RDebugUtils.currentLine=8519856;
 //BA.debugLineNum = 8519856;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarPedidoCompraLineaReclamacionFPC",new Object[]{(Object)(_idrecl),(Object)(_rspedlin.GetString("Pedido")),(Object)(_rspedlin.GetInt("Linea"))});
RDebugUtils.currentLine=8519857;
 //BA.debugLineNum = 8519857;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=8519859;
 //BA.debugLineNum = 8519859;BA.debugLine="rsPedLin.Close";
_rspedlin.Close();
RDebugUtils.currentLine=8519861;
 //BA.debugLineNum = 8519861;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,_lstcomandos));
this.state = 170;
return;
case 170:
//C
this.state = 78;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=8519862;
 //BA.debugLineNum = 8519862;BA.debugLine="If Success=False Then";
if (true) break;

case 78:
//if
this.state = 81;
if (_success==parent.__c.False) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=8519863;
 //BA.debugLineNum = 8519863;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=8519864;
 //BA.debugLineNum = 8519864;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible insertar las líneas de Pedido en la nueva reclamación  "+_recl+".","Error");
RDebugUtils.currentLine=8519865;
 //BA.debugLineNum = 8519865;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 171;
return;
case 171:
//C
this.state = 81;
;
RDebugUtils.currentLine=8519866;
 //BA.debugLineNum = 8519866;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 81:
//C
this.state = 82;
;
RDebugUtils.currentLine=8519869;
 //BA.debugLineNum = 8519869;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select Pedid";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select Pedido, Linea, FechaPedido, Articulo, DescripcionArticulo, Talla, Qty, QtyPendiente, FechaPrometida from tblDatosFechasPrometidasPedidosCompraPendientes where Proveedor=? and PendienteSeguimiento=? and ExcluidoReclamacion=? order by Pedido, Linea",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_proveedor,BA.NumberToString(1),BA.NumberToString(0)}));
RDebugUtils.currentLine=8519871;
 //BA.debugLineNum = 8519871;BA.debugLine="Dim xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=8519872;
 //BA.debugLineNum = 8519872;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8519873;
 //BA.debugLineNum = 8519873;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
_workbook = _xl._createwriterblank /*b4j.docU.xlworkbookwriter*/ (null);
RDebugUtils.currentLine=8519874;
 //BA.debugLineNum = 8519874;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
_sheet1 = _workbook._createsheetwriterbyname /*b4j.docU.xlsheetwriter*/ (null,"Datos");
RDebugUtils.currentLine=8519877;
 //BA.debugLineNum = 8519877;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=8519878;
 //BA.debugLineNum = 8519878;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=8519880;
 //BA.debugLineNum = 8519880;BA.debugLine="Dim NumColsRs As Int=rs.ColumnCount";
_numcolsrs = _rs.getColumnCount();
RDebugUtils.currentLine=8519881;
 //BA.debugLineNum = 8519881;BA.debugLine="Dim HeaderStyle As XLStyle=Workbook.CreateStyle.F";
_headerstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._fontcolor /*b4j.docU.xlstyle*/ (null,(short) (12),(int) (_xl._color_white /*short*/ ))._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_dark_teal /*short*/ );
RDebugUtils.currentLine=8519883;
 //BA.debugLineNum = 8519883;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
if (true) break;

case 82:
//for
this.state = 91;
step135 = 1;
limit135 = (int) (_rs.getColumnCount()-1);
_idxcol = (int) (0) ;
this.state = 172;
if (true) break;

case 172:
//C
this.state = 91;
if ((step135 > 0 && _idxcol <= limit135) || (step135 < 0 && _idxcol >= limit135)) this.state = 84;
if (true) break;

case 173:
//C
this.state = 172;
_idxcol = ((int)(0 + _idxcol + step135)) ;
if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=8519884;
 //BA.debugLineNum = 8519884;BA.debugLine="If rs.GetColumnName(idxCol)<>\"FechaPrometida\" Th";
if (true) break;

case 85:
//if
this.state = 90;
if ((_rs.GetColumnName(_idxcol)).equals("FechaPrometida") == false) { 
this.state = 87;
}else {
this.state = 89;
}if (true) break;

case 87:
//C
this.state = 90;
RDebugUtils.currentLine=8519885;
 //BA.debugLineNum = 8519885;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), rs.G";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,(int) (0)),_rs.GetColumnName(_idxcol))._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_headerstyle);
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=8519887;
 //BA.debugLineNum = 8519887;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), \"Fec";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,(int) (0)),"Fecha Entrega Anterior")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_headerstyle);
 if (true) break;

case 90:
//C
this.state = 173;
;
 if (true) break;
if (true) break;

case 91:
//C
this.state = 92;
;
RDebugUtils.currentLine=8519890;
 //BA.debugLineNum = 8519890;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), \"Nueva";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,(int) (0)),"Nueva Fecha Entrega")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_headerstyle);
RDebugUtils.currentLine=8519893;
 //BA.debugLineNum = 8519893;BA.debugLine="Dim FechasStyle As XLStyle = Workbook.CreateStyle";
_fechasstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._dataformat /*b4j.docU.xlstyle*/ (null,("dd\"/\"mm\"/\"yyyy"));
RDebugUtils.currentLine=8519894;
 //BA.debugLineNum = 8519894;BA.debugLine="Dim RowStyles As List = Array(Workbook.CreateStyl";
_rowstyles = new anywheresoftware.b4a.objects.collections.List();
_rowstyles = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_orange /*short*/ )),(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_white /*short*/ ))});
RDebugUtils.currentLine=8519895;
 //BA.debugLineNum = 8519895;BA.debugLine="Dim idxFila As Int=1";
_idxfila = (int) (1);
RDebugUtils.currentLine=8519897;
 //BA.debugLineNum = 8519897;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 92:
//do while
this.state = 121;
while (_rs.NextRow()) {
this.state = 94;
if (true) break;
}
if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=8519899;
 //BA.debugLineNum = 8519899;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
if (true) break;

case 95:
//for
this.state = 120;
step147 = 1;
limit147 = (int) (_rs.getColumnCount()-1);
_idxcol = (int) (0) ;
this.state = 174;
if (true) break;

case 174:
//C
this.state = 120;
if ((step147 > 0 && _idxcol <= limit147) || (step147 < 0 && _idxcol >= limit147)) this.state = 97;
if (true) break;

case 175:
//C
this.state = 174;
_idxcol = ((int)(0 + _idxcol + step147)) ;
if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=8519900;
 //BA.debugLineNum = 8519900;BA.debugLine="Dim NombreCampo As String=rs.GetColumnName(idxC";
_nombrecampo = _rs.GetColumnName(_idxcol);
RDebugUtils.currentLine=8519901;
 //BA.debugLineNum = 8519901;BA.debugLine="Select True";
if (true) break;

case 98:
//select
this.state = 119;
switch (BA.switchObjectToInt(parent.__c.True,(_nombrecampo).equals("Pedido") || (_nombrecampo).equals("Articulo") || (_nombrecampo).equals("DescripcionArticulo") || (_nombrecampo).equals("Talla"),(_nombrecampo).equals("Linea"),(_nombrecampo).equals("FechaPedido"),(_nombrecampo).equals("Qty") || (_nombrecampo).equals("QtyPendiente"),(_nombrecampo).equals("FechaPrometida"))) {
case 0: {
this.state = 100;
if (true) break;
}
case 1: {
this.state = 102;
if (true) break;
}
case 2: {
this.state = 104;
if (true) break;
}
case 3: {
this.state = 110;
if (true) break;
}
case 4: {
this.state = 112;
if (true) break;
}
default: {
this.state = 118;
if (true) break;
}
}
if (true) break;

case 100:
//C
this.state = 119;
RDebugUtils.currentLine=8519904;
 //BA.debugLineNum = 8519904;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,idxFil";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_rs.GetString(_nombrecampo));
 if (true) break;

case 102:
//C
this.state = 119;
RDebugUtils.currentLine=8519907;
 //BA.debugLineNum = 8519907;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFil";
_sheet1._putnumber /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_rs.GetInt(_nombrecampo));
 if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=8519911;
 //BA.debugLineNum = 8519911;BA.debugLine="Dim ticks As Long = rs.GetLong(NombreCampo)";
_ticks = _rs.GetLong(_nombrecampo);
RDebugUtils.currentLine=8519913;
 //BA.debugLineNum = 8519913;BA.debugLine="If ticks > 0 Then";
if (true) break;

case 105:
//if
this.state = 108;
if (_ticks>0) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
RDebugUtils.currentLine=8519914;
 //BA.debugLineNum = 8519914;BA.debugLine="Dim TicksHora0 As Long=DateUtils.SetDate(Da";
_tickshora0 = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_ticks),parent.__c.DateTime.GetMonth(_ticks),parent.__c.DateTime.GetDayOfMonth(_ticks));
RDebugUtils.currentLine=8519916;
 //BA.debugLineNum = 8519916;BA.debugLine="sheet1.PutDate(xl.AddressZero(idxCol,idxFil";
_sheet1._putdate /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_tickshora0)._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_fechasstyle);
 if (true) break;

case 108:
//C
this.state = 119;
;
 if (true) break;

case 110:
//C
this.state = 119;
RDebugUtils.currentLine=8519920;
 //BA.debugLineNum = 8519920;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFil";
_sheet1._putnumber /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),parent.__c.Round2(_rs.GetDouble(_nombrecampo),(int) (2)));
 if (true) break;

case 112:
//C
this.state = 113;
RDebugUtils.currentLine=8519923;
 //BA.debugLineNum = 8519923;BA.debugLine="Dim ticks As Long = rs.GetLong(NombreCampo)";
_ticks = _rs.GetLong(_nombrecampo);
RDebugUtils.currentLine=8519925;
 //BA.debugLineNum = 8519925;BA.debugLine="If ticks > 0 Then";
if (true) break;

case 113:
//if
this.state = 116;
if (_ticks>0) { 
this.state = 115;
}if (true) break;

case 115:
//C
this.state = 116;
RDebugUtils.currentLine=8519926;
 //BA.debugLineNum = 8519926;BA.debugLine="Dim TicksHora0 As Long=DateUtils.SetDate(Dat";
_tickshora0 = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_ticks),parent.__c.DateTime.GetMonth(_ticks),parent.__c.DateTime.GetDayOfMonth(_ticks));
RDebugUtils.currentLine=8519928;
 //BA.debugLineNum = 8519928;BA.debugLine="sheet1.PutDate(xl.AddressZero(idxCol,idxFila";
_sheet1._putdate /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_tickshora0)._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_fechasstyle);
 if (true) break;

case 116:
//C
this.state = 119;
;
 if (true) break;

case 118:
//C
this.state = 119;
 if (true) break;

case 119:
//C
this.state = 175;
;
 if (true) break;
if (true) break;

case 120:
//C
this.state = 92;
;
RDebugUtils.currentLine=8519935;
 //BA.debugLineNum = 8519935;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Proces";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Procesando Fila "+BA.NumberToString(_idxfila)));
RDebugUtils.currentLine=8519936;
 //BA.debugLineNum = 8519936;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"),(int) (0));
this.state = 176;
return;
case 176:
//C
this.state = 92;
;
RDebugUtils.currentLine=8519937;
 //BA.debugLineNum = 8519937;BA.debugLine="idxFila=idxFila+1";
_idxfila = (int) (_idxfila+1);
 if (true) break;

case 121:
//C
this.state = 122;
;
RDebugUtils.currentLine=8519939;
 //BA.debugLineNum = 8519939;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=8519943;
 //BA.debugLineNum = 8519943;BA.debugLine="Dim UltimaFila As Int=idxFila";
_ultimafila = _idxfila;
RDebugUtils.currentLine=8519944;
 //BA.debugLineNum = 8519944;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Generan";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Generando fichero excel..."));
RDebugUtils.currentLine=8519945;
 //BA.debugLineNum = 8519945;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"),(int) (0));
this.state = 177;
return;
case 177:
//C
this.state = 122;
;
RDebugUtils.currentLine=8519949;
 //BA.debugLineNum = 8519949;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZ";
_sheet1._setautofilter /*b4j.docU.xlsheetwriter*/ (null,_xl._createxlrange /*b4j.docU.xlutils._xlrange*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (0),(int) (0)),_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_numcolsrs,_ultimafila)));
RDebugUtils.currentLine=8519951;
 //BA.debugLineNum = 8519951;BA.debugLine="For i=0 To idxCol+1 ' +1 ,  porque hemos añadido";
if (true) break;

case 122:
//for
this.state = 125;
step180 = 1;
limit180 = (int) (_idxcol+1);
_i = (int) (0) ;
this.state = 178;
if (true) break;

case 178:
//C
this.state = 125;
if ((step180 > 0 && _i <= limit180) || (step180 < 0 && _i >= limit180)) this.state = 124;
if (true) break;

case 179:
//C
this.state = 178;
_i = ((int)(0 + _i + step180)) ;
if (true) break;

case 124:
//C
this.state = 179;
RDebugUtils.currentLine=8519952;
 //BA.debugLineNum = 8519952;BA.debugLine="sheet1.AutoSizeColumn(i)";
_sheet1._autosizecolumn /*b4j.docU.xlsheetwriter*/ (null,_i);
 if (true) break;
if (true) break;

case 125:
//C
this.state = 126;
;
RDebugUtils.currentLine=8519955;
 //BA.debugLineNum = 8519955;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=8519956;
 //BA.debugLineNum = 8519956;BA.debugLine="jamTableView1.EstadoLabelSalirJamTableView(True)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadolabelsalirjamtableview /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=8519957;
 //BA.debugLineNum = 8519957;BA.debugLine="jamTableView1.HabilitarJamTableView(True)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._habilitarjamtableview /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=8519959;
 //BA.debugLineNum = 8519959;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)(""));
RDebugUtils.currentLine=8519963;
 //BA.debugLineNum = 8519963;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=8519979;
 //BA.debugLineNum = 8519979;BA.debugLine="Dim filename As String = Workbook.SaveAs(CarpetaF";
_filename = _workbook._saveas /*String*/ (null,_carpetafichero,"Reclamación "+_recl+" Fechas Entrega "+_nombreproveedor+".xlsx",parent.__c.True);
RDebugUtils.currentLine=8519980;
 //BA.debugLineNum = 8519980;BA.debugLine="If filename<>CarpetaFichero & \"\\\" & \"Reclamación";
if (true) break;

case 126:
//if
this.state = 129;
if ((_filename).equals(_carpetafichero+"\\"+"Reclamación "+_recl+" Fechas Entrega "+_nombreproveedor+".xlsx") == false) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
RDebugUtils.currentLine=8519981;
 //BA.debugLineNum = 8519981;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=8519982;
 //BA.debugLineNum = 8519982;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error al grab";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error al grabar el fichero excel.","Error");
RDebugUtils.currentLine=8519983;
 //BA.debugLineNum = 8519983;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 180;
return;
case 180:
//C
this.state = 129;
;
RDebugUtils.currentLine=8519984;
 //BA.debugLineNum = 8519984;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 129:
//C
this.state = 130;
;
RDebugUtils.currentLine=8520012;
 //BA.debugLineNum = 8520012;BA.debugLine="Dim sbBody As String=HTMLBodyEmail";
_sbbody = __ref._htmlbodyemail /*String*/ (null);
RDebugUtils.currentLine=8520015;
 //BA.debugLineNum = 8520015;BA.debugLine="wait for(EjecutarVBSScriptEnviarEmail(DireccionSe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref._ejecutarvbsscriptenviaremail /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._direccionseleccionadaremitenteemails /*String*/ ,_direcciondestinoemail,"Reclamación Confirmación Fechas Entrega Pedidos Pendientes "+_recl,_sbbody,_filename,_direcciondestinoemailcc));
this.state = 181;
return;
case 181:
//C
this.state = 130;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8520016;
 //BA.debugLineNum = 8520016;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=8520017;
 //BA.debugLineNum = 8520017;BA.debugLine="Log(\"mRes: \" & mRes)";
parent.__c.LogImpl("88520017","mRes: "+BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=8520018;
 //BA.debugLineNum = 8520018;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=8520019;
 //BA.debugLineNum = 8520019;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
_exitcode = (int)(BA.ObjectToNumber(_mres.Get((Object)("ExitCode"))));
RDebugUtils.currentLine=8520020;
 //BA.debugLineNum = 8520020;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
_stdout = BA.ObjectToString(_mres.Get((Object)("StdOut")));
RDebugUtils.currentLine=8520021;
 //BA.debugLineNum = 8520021;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
_stderr = BA.ObjectToString(_mres.Get((Object)("StdErr")));
RDebugUtils.currentLine=8520022;
 //BA.debugLineNum = 8520022;BA.debugLine="If Success=False Then";
if (true) break;

case 130:
//if
this.state = 133;
if (_success==parent.__c.False) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
RDebugUtils.currentLine=8520023;
 //BA.debugLineNum = 8520023;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt env";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt enviar email"+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=8520024;
 //BA.debugLineNum = 8520024;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 182;
return;
case 182:
//C
this.state = 133;
;
RDebugUtils.currentLine=8520025;
 //BA.debugLineNum = 8520025;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=8520027;
 //BA.debugLineNum = 8520027;BA.debugLine="If ExitCode=1 Then";

case 133:
//if
this.state = 136;
if (_exitcode==1) { 
this.state = 135;
}if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=8520028;
 //BA.debugLineNum = 8520028;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt env";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt enviar email"+parent.__c.CRLF+_stderr,"Error");
RDebugUtils.currentLine=8520029;
 //BA.debugLineNum = 8520029;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 183;
return;
case 183:
//C
this.state = 136;
;
RDebugUtils.currentLine=8520030;
 //BA.debugLineNum = 8520030;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 136:
//C
this.state = 137;
;
RDebugUtils.currentLine=8520032;
 //BA.debugLineNum = 8520032;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Email enviado,";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Email enviado, OK","Aviso");
RDebugUtils.currentLine=8520033;
 //BA.debugLineNum = 8520033;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 184;
return;
case 184:
//C
this.state = 137;
;
RDebugUtils.currentLine=8520035;
 //BA.debugLineNum = 8520035;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero excel";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Fichero excel con datos reclamacion grabado en "+_filename,"Aviso");
RDebugUtils.currentLine=8520036;
 //BA.debugLineNum = 8520036;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _msa);
this.state = 185;
return;
case 185:
//C
this.state = 137;
;
RDebugUtils.currentLine=8520038;
 //BA.debugLineNum = 8520038;BA.debugLine="WAIT FOR (ActualizarDatos) COMPLETE (rBool As Boo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 186;
return;
case 186:
//C
this.state = 137;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=8520039;
 //BA.debugLineNum = 8520039;BA.debugLine="If rBool= False Then Return";
if (true) break;

case 137:
//if
this.state = 142;
if (_rbool==parent.__c.False) { 
this.state = 139;
;}if (true) break;

case 139:
//C
this.state = 142;
if (true) return ;
if (true) break;

case 142:
//C
this.state = 143;
;
RDebugUtils.currentLine=8520041;
 //BA.debugLineNum = 8520041;BA.debugLine="Wait For(jamTableView1.QuitarFiltros) complete (r";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._quitarfiltros /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 187;
return;
case 187:
//C
this.state = 143;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=8520044;
 //BA.debugLineNum = 8520044;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.AddFiltroC";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addfiltrocampovalorinicial /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"PendienteSeguimiento",(Object)(1));
RDebugUtils.currentLine=8520045;
 //BA.debugLineNum = 8520045;BA.debugLine="wait for(rSub) complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 188;
return;
case 188:
//C
this.state = 143;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=8520046;
 //BA.debugLineNum = 8520046;BA.debugLine="If Success Then";
if (true) break;

case 143:
//if
this.state = 148;
if (_success) { 
this.state = 145;
}else {
this.state = 147;
}if (true) break;

case 145:
//C
this.state = 148;
 if (true) break;

case 147:
//C
this.state = 148;
 if (true) break;

case 148:
//C
this.state = 149;
;
RDebugUtils.currentLine=8520052;
 //BA.debugLineNum = 8520052;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.AddFiltroC";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addfiltrocampovalorinicial /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"Proveedor",(Object)(_proveedor));
RDebugUtils.currentLine=8520053;
 //BA.debugLineNum = 8520053;BA.debugLine="wait for(rSub) complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "emailreclamacionproveedor"), _rsub);
this.state = 189;
return;
case 189:
//C
this.state = 149;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=8520054;
 //BA.debugLineNum = 8520054;BA.debugLine="If Success Then";
if (true) break;

case 149:
//if
this.state = 154;
if (_success) { 
this.state = 151;
}else {
this.state = 153;
}if (true) break;

case 151:
//C
this.state = 154;
 if (true) break;

case 153:
//C
this.state = 154;
 if (true) break;

case 154:
//C
this.state = -1;
;
RDebugUtils.currentLine=8520060;
 //BA.debugLineNum = 8520060;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionardireccionremitenteemails(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "seleccionardireccionremitenteemails", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionardireccionremitenteemails", null));}
ResumableSub_SeleccionarDireccionRemitenteEmails rsub = new ResumableSub_SeleccionarDireccionRemitenteEmails(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarDireccionRemitenteEmails extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmails(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
Object _msa = null;
String _sdireccionescuentasemail = "";
String[] _arrdireccionescuentasemail = null;
anywheresoftware.b4a.objects.collections.List _lstdireccionescuentasemail = null;
int _idx = 0;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
int step26;
int limit26;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="wait for(EjecutarVBSScriptDireccionesEmail) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), __ref._ejecutarvbsscriptdireccionesemail /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Log(\"mRes: \" & mRes)";
parent.__c.LogImpl("88847363","mRes: "+BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
_exitcode = (int)(BA.ObjectToNumber(_mres.Get((Object)("ExitCode"))));
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
_stdout = BA.ObjectToString(_mres.Get((Object)("StdOut")));
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
_stderr = BA.ObjectToString(_mres.Get((Object)("StdErr")));
RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="If Success=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt direcciones email"+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
RDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="If ExitCode=1 Then";

case 4:
//if
this.state = 7;
if (_exitcode==1) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt direcciones email"+parent.__c.CRLF+_stderr,"Error");
RDebugUtils.currentLine=8847377;
 //BA.debugLineNum = 8847377;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 7;
;
RDebugUtils.currentLine=8847378;
 //BA.debugLineNum = 8847378;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="Dim sDireccionesCuentasEmail As String=StdOut.Sub";
_sdireccionescuentasemail = _stdout.substring((int) (0),(int) (_stdout.length()-1));
RDebugUtils.currentLine=8847381;
 //BA.debugLineNum = 8847381;BA.debugLine="If sDireccionesCuentasEmail=\"\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_sdireccionescuentasemail).equals("")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=8847382;
 //BA.debugLineNum = 8847382;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay direcciones de email configuradas."+parent.__c.CRLF+parent.__c.CRLF+"¿Outlook no instalado?","Aviso");
RDebugUtils.currentLine=8847383;
 //BA.debugLineNum = 8847383;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
RDebugUtils.currentLine=8847384;
 //BA.debugLineNum = 8847384;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=8847387;
 //BA.debugLineNum = 8847387;BA.debugLine="Dim ArrDireccionesCuentasEmail() As String=Regex.";
_arrdireccionescuentasemail = parent.__c.Regex.Split(",",_sdireccionescuentasemail);
RDebugUtils.currentLine=8847388;
 //BA.debugLineNum = 8847388;BA.debugLine="Dim lstDireccionesCuentasEmail As List";
_lstdireccionescuentasemail = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8847389;
 //BA.debugLineNum = 8847389;BA.debugLine="lstDireccionesCuentasEmail.Initialize";
_lstdireccionescuentasemail.Initialize();
RDebugUtils.currentLine=8847391;
 //BA.debugLineNum = 8847391;BA.debugLine="For iDx =0 To ArrDireccionesCuentasEmail.Length-1";
if (true) break;

case 12:
//for
this.state = 15;
step26 = 1;
limit26 = (int) (_arrdireccionescuentasemail.length-1);
_idx = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 15;
if ((step26 > 0 && _idx <= limit26) || (step26 < 0 && _idx >= limit26)) this.state = 14;
if (true) break;

case 38:
//C
this.state = 37;
_idx = ((int)(0 + _idx + step26)) ;
if (true) break;

case 14:
//C
this.state = 38;
RDebugUtils.currentLine=8847392;
 //BA.debugLineNum = 8847392;BA.debugLine="lstDireccionesCuentasEmail.Add(ArrDireccionesCue";
_lstdireccionescuentasemail.Add((Object)(_arrdireccionescuentasemail[_idx]));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=8847395;
 //BA.debugLineNum = 8847395;BA.debugLine="If lstDireccionesCuentasEmail.Size=0 Then";

case 15:
//if
this.state = 18;
if (_lstdireccionescuentasemail.getSize()==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=8847396;
 //BA.debugLineNum = 8847396;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay direcciones de email configuradas."+parent.__c.CRLF+parent.__c.CRLF+"¿Outlook no instalado?","Aviso");
RDebugUtils.currentLine=8847397;
 //BA.debugLineNum = 8847397;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 18;
;
RDebugUtils.currentLine=8847398;
 //BA.debugLineNum = 8847398;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=8847401;
 //BA.debugLineNum = 8847401;BA.debugLine="lstDireccionesCuentasEmail.Add(\"compras@proin-pin";
_lstdireccionescuentasemail.Add((Object)("compras@proin-pinilla.com"));
RDebugUtils.currentLine=8847403;
 //BA.debugLineNum = 8847403;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Cuenta para Enviar los Emails");
RDebugUtils.currentLine=8847404;
 //BA.debugLineNum = 8847404;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=8847405;
 //BA.debugLineNum = 8847405;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=8847406;
 //BA.debugLineNum = 8847406;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=8847407;
 //BA.debugLineNum = 8847407;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=8847408;
 //BA.debugLineNum = 8847408;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8847410;
 //BA.debugLineNum = 8847410;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=8847411;
 //BA.debugLineNum = 8847411;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=8847412;
 //BA.debugLineNum = 8847412;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=8847414;
 //BA.debugLineNum = 8847414;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=8847415;
 //BA.debugLineNum = 8847415;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=8847417;
 //BA.debugLineNum = 8847417;BA.debugLine="B4XListDlg.Options=lstDireccionesCuentasEmail";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstdireccionescuentasemail;
RDebugUtils.currentLine=8847418;
 //BA.debugLineNum = 8847418;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=8847420;
 //BA.debugLineNum = 8847420;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=8847427;
 //BA.debugLineNum = 8847427;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=8847428;
 //BA.debugLineNum = 8847428;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_bcancel.IsInitialized()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=8847430;
 //BA.debugLineNum = 8847430;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=8847431;
 //BA.debugLineNum = 8847431;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=8847432;
 //BA.debugLineNum = 8847432;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=8847435;
 //BA.debugLineNum = 8847435;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemails"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8847436;
 //BA.debugLineNum = 8847436;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=8847439;
 //BA.debugLineNum = 8847439;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=8847443;
 //BA.debugLineNum = 8847443;BA.debugLine="DireccionSeleccionadaRemitenteEmails=B4XListDlg.S";
__ref._direccionseleccionadaremitenteemails /*String*/  = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=8847444;
 //BA.debugLineNum = 8847444;BA.debugLine="If DireccionSeleccionadaRemitenteEmails=\"compras@";
if (true) break;

case 27:
//if
this.state = 32;
if ((__ref._direccionseleccionadaremitenteemails /*String*/ ).equals("compras@proin-pinilla.com")) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
__ref._direccionseleccionadaremitenteemails /*String*/  = "Compras Proin";
if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=8847446;
 //BA.debugLineNum = 8847446;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8847489;
 //BA.debugLineNum = 8847489;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _htmlbodyemail(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "htmlbodyemail", false))
	 {return ((String) Debug.delegate(ba, "htmlbodyemail", null));}
String _strbodyhtml = "";
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub HTMLBodyEmail As String";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Dim strBodyHTML As String";
_strbodyhtml = "";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="strBodyHTML = \"<p>Buenos días<br><br>\" & _";
_strbodyhtml = "<p>Buenos días<br><br>"+"Adjunto listado excel de pedidos pendientes sin información de plazo de entrega o cuya fecha informada esta vencida.<br>"+"Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.<br>"+"<br>Gracias";
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="Return strBodyHTML";
if (true) return _strbodyhtml;
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cseguimientofechasprometidascompra __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cambioenceldaseleccionada(b4j.docU.cseguimientofechasprometidascompra __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "jamtableview1_cambioenceldaseleccionada", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cambioenceldaseleccionada", new Object[] {_datosceldaseleccionada}));}
int _lineaseltv = 0;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _pedido = "";
int _linea = 0;
String _nombreproveedor = "";
String _articulo = "";
String _descripcion = "";
String _talla = "";
String _stalla = "";
int _qtypte = 0;
String _dateformatant = "";
long _fechaprometidalong = 0L;
String _sfechaprometida = "";
int _pendienteseguimiento = 0;
String _spendienteseguimiento = "";
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
_lineaseltv = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
_pedido = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
_linea = (int)(BA.ObjectToNumber(_mpk.Get((Object)("Linea"))));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
_nombreproveedor = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"NombreProveedor"));
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
_articulo = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Articulo"));
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
_descripcion = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"DescripcionArticulo"));
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
_talla = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Talla"));
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
_stalla = BA.ObjectToString((((_talla).equals("") == false) ? ((Object)("Talla: "+_talla)) : ((Object)(""))));
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
_qtypte = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"QtyPendiente")));
RDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
_fechaprometidalong = BA.ObjectToLongNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"FechaPrometida"));
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
_sfechaprometida = BA.ObjectToString(((_fechaprometidalong>0) ? ((Object)("Fecha Prometida: "+__c.DateTime.Date(_fechaprometidalong))) : ((Object)("SIN FECHA PROMETIDA"))));
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
_pendienteseguimiento = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"PendienteSeguimiento")));
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
_spendienteseguimiento = BA.ObjectToString(((_pendienteseguimiento==1) ? ((Object)("PENDIENTE SEGUIMIENTO")) : ((Object)(""))));
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Pedido: "+_pedido+" Línea:"+BA.NumberToString(_linea)+"  "+_nombreproveedor+"  "+_articulo+"  "+_descripcion+"  "+_stalla+"  QtyPte: "+BA.NumberToString(_qtypte)+"  "+_sfechaprometida+" "+_spendienteseguimiento));
RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cellclick(b4j.docU.cseguimientofechasprometidascompra __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "jamtableview1_cellclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cellclick", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
switch (BA.switchObjectToInt(_datosceldaseleccionada.AliasCampo /*String*/ ,"ExcluidoReclamacion")) {
case 0: {
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="AlternarExcluidoReclamacion(DatosCeldaSeleccion";
__ref._alternarexcluidoreclamacion /*String*/ (null,_datosceldaseleccionada);
 break; }
}
;
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_contextmenuitem_action(b4j.docU.cseguimientofechasprometidascompra __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _tagmenuitem;
int _filasel = 0;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
String _pedidosel = "";
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
String _articulosel = "";
int _filaseleccionada = 0;
anywheresoftware.b4a.objects.collections.List _lstinfofila = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
String _nombreproveedor = "";
String _proveedor = "";
String _direccionemail = "";
int _lineasel = 0;
String _rfpc = "";
long _fechaenviolong = 0L;
String _dateformatant = "";
String _fechaenvio = "";
String _nombreusuario = "";
String _direccionemailremitente = "";
String _direccionemaildestinatario = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 51;
switch (BA.switchObjectToInt(_tagmenuitem,"VerPedidoCompraNAV","VerArticuloNAV","EmailReclamacionProveedor","DatosUltimaRFP")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 32;
if (true) break;
}
case 3: {
this.state = 40;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"Pedido",_filasel);
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Dim PedidoSel As String=DCS.ValorCelda";
_pedidosel = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Ver el p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Ver el pedido de compra "+_pedidosel+" en NAVISION?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 4:
//if
this.state = 9;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Pedido compra",(int) (50),"No.",_pedidosel);
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 53;
return;
case 53:
//C
this.state = 10;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="If success=False Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_success==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el pedido seleccionado en Navision.","Error");
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 51;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=8257553;
 //BA.debugLineNum = 8257553;BA.debugLine="Dim ArticuloSel As String";
_articulosel = "";
RDebugUtils.currentLine=8257554;
 //BA.debugLineNum = 8257554;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=8257555;
 //BA.debugLineNum = 8257555;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
_lstinfofila = new anywheresoftware.b4a.objects.collections.List();
_lstinfofila = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,_filaseleccionada);
RDebugUtils.currentLine=8257556;
 //BA.debugLineNum = 8257556;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
if (true) break;

case 16:
//for
this.state = 23;
group19 = _lstinfofila;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 55;
if (true) break;

case 55:
//C
this.state = 23;
if (index19 < groupLen19) {
this.state = 18;
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group19.Get(index19));}
if (true) break;

case 56:
//C
this.state = 55;
index19++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=8257557;
 //BA.debugLineNum = 8257557;BA.debugLine="If dc.Campo=\"Articulo\" Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((_dc.Campo /*String*/ ).equals("Articulo")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=8257558;
 //BA.debugLineNum = 8257558;BA.debugLine="ArticuloSel=dc.ValorCampo";
_articulosel = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
RDebugUtils.currentLine=8257559;
 //BA.debugLineNum = 8257559;BA.debugLine="Exit";
this.state = 23;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 56;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=8257562;
 //BA.debugLineNum = 8257562;BA.debugLine="If ArticuloSel=\"\" Then";

case 23:
//if
this.state = 26;
if ((_articulosel).equals("")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=8257563;
 //BA.debugLineNum = 8257563;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Artículo.","Error");
RDebugUtils.currentLine=8257564;
 //BA.debugLineNum = 8257564;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 26;
;
RDebugUtils.currentLine=8257565;
 //BA.debugLineNum = 8257565;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=8257567;
 //BA.debugLineNum = 8257567;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Ficha producto",(int) (30),"No.",_articulosel);
RDebugUtils.currentLine=8257568;
 //BA.debugLineNum = 8257568;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 58;
return;
case 58:
//C
this.state = 27;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=8257569;
 //BA.debugLineNum = 8257569;BA.debugLine="If success=False Then";
if (true) break;

case 27:
//if
this.state = 30;
if (_success==parent.__c.False) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=8257570;
 //BA.debugLineNum = 8257570;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el artículo seleccionado en Navision.","Error");
RDebugUtils.currentLine=8257571;
 //BA.debugLineNum = 8257571;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 51;
;
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=8257574;
 //BA.debugLineNum = 8257574;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=8257575;
 //BA.debugLineNum = 8257575;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"NombreProveedor",_filasel);
RDebugUtils.currentLine=8257576;
 //BA.debugLineNum = 8257576;BA.debugLine="Dim NombreProveedor As String=DCS.ValorCelda";
_nombreproveedor = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8257577;
 //BA.debugLineNum = 8257577;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"Proveedor",_filasel);
RDebugUtils.currentLine=8257578;
 //BA.debugLineNum = 8257578;BA.debugLine="Dim Proveedor As String=DCS.ValorCelda";
_proveedor = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8257579;
 //BA.debugLineNum = 8257579;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"DireccionEmail",_filasel);
RDebugUtils.currentLine=8257580;
 //BA.debugLineNum = 8257580;BA.debugLine="Dim DireccionEmail As String=DCS.ValorCelda";
_direccionemail = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8257581;
 //BA.debugLineNum = 8257581;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Enviar e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Enviar email reclamación de plazos de entrega al proveedor "+_nombreproveedor+"?"+parent.__c.CRLF+parent.__c.CRLF+"Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8257582;
 //BA.debugLineNum = 8257582;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 33;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8257583;
 //BA.debugLineNum = 8257583;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 33:
//if
this.state = 38;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
if (true) return ;
if (true) break;

case 38:
//C
this.state = 51;
;
RDebugUtils.currentLine=8257584;
 //BA.debugLineNum = 8257584;BA.debugLine="EmailReclamacionProveedor(Proveedor, NombreProv";
__ref._emailreclamacionproveedor /*void*/ (null,_proveedor,_nombreproveedor,_direccionemail);
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=8257587;
 //BA.debugLineNum = 8257587;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=8257588;
 //BA.debugLineNum = 8257588;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"Pedido",_filasel);
RDebugUtils.currentLine=8257589;
 //BA.debugLineNum = 8257589;BA.debugLine="Dim PedidoSel As String=DCS.ValorCelda";
_pedidosel = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8257590;
 //BA.debugLineNum = 8257590;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"Linea",_filasel);
RDebugUtils.currentLine=8257591;
 //BA.debugLineNum = 8257591;BA.debugLine="Dim LineaSel As Int=DCS.ValorCelda";
_lineasel = (int)(BA.ObjectToNumber(_dcs.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=8257592;
 //BA.debugLineNum = 8257592;BA.debugLine="Dim RFPC As String=mSQL.ExecQuerySingleResult2(";
_rfpc = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select ReclamacionFPC from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_pedidosel,BA.NumberToString(_lineasel)}));
RDebugUtils.currentLine=8257593;
 //BA.debugLineNum = 8257593;BA.debugLine="If RFPC=\"\" Then";
if (true) break;

case 41:
//if
this.state = 44;
if ((_rfpc).equals("")) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=8257594;
 //BA.debugLineNum = 8257594;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La línea de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La línea de pedido seleccionada no tiene datos de reclamación de fechas prometidas.","Información Reclamación");
RDebugUtils.currentLine=8257595;
 //BA.debugLineNum = 8257595;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 61;
return;
case 61:
//C
this.state = 44;
;
RDebugUtils.currentLine=8257596;
 //BA.debugLineNum = 8257596;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=8257598;
 //BA.debugLineNum = 8257598;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"FechaEnvioReclamacionLong",_filasel);
RDebugUtils.currentLine=8257599;
 //BA.debugLineNum = 8257599;BA.debugLine="Dim FechaEnvioLong As Long=DCS.ValorCelda";
_fechaenviolong = BA.ObjectToLongNumber(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8257600;
 //BA.debugLineNum = 8257600;BA.debugLine="Dim DateFormatAnt As String=DateTime.Dateformat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=8257601;
 //BA.debugLineNum = 8257601;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=8257602;
 //BA.debugLineNum = 8257602;BA.debugLine="Dim FechaEnvio As String=DateTime.Date(FechaEnv";
_fechaenvio = parent.__c.DateTime.Date(_fechaenviolong);
RDebugUtils.currentLine=8257603;
 //BA.debugLineNum = 8257603;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=8257604;
 //BA.debugLineNum = 8257604;BA.debugLine="Dim NombreUsuario As String=mSQL.ExecQuerySingl";
_nombreusuario = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NombreUsuario from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_pedidosel,BA.NumberToString(_lineasel)}));
RDebugUtils.currentLine=8257605;
 //BA.debugLineNum = 8257605;BA.debugLine="Dim DireccionEmailRemitente As String=mSQL.Exec";
_direccionemailremitente = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select DireccionEmailRemitente from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_pedidosel,BA.NumberToString(_lineasel)}));
RDebugUtils.currentLine=8257606;
 //BA.debugLineNum = 8257606;BA.debugLine="Dim DireccionEmailDestinatario As String=mSQL.E";
_direccionemaildestinatario = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select DireccionEmailDestinatario from tblDatosFechasPrometidasPedidosCompraPendientes where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_pedidosel,BA.NumberToString(_lineasel)}));
RDebugUtils.currentLine=8257611;
 //BA.debugLineNum = 8257611;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8257612;
 //BA.debugLineNum = 8257612;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8257613;
 //BA.debugLineNum = 8257613;BA.debugLine="sb.Append(\"Pedido / Línea:  \").Append(PedidoSel";
_sb.Append("Pedido / Línea:  ").Append(_pedidosel).Append(" / ").Append(BA.NumberToString(_lineasel)).Append(parent.__c.CRLF);
RDebugUtils.currentLine=8257614;
 //BA.debugLineNum = 8257614;BA.debugLine="sb.Append(\"Reclamación:  \").Append(RFPC).Append";
_sb.Append("Reclamación:  ").Append(_rfpc).Append(parent.__c.CRLF);
RDebugUtils.currentLine=8257615;
 //BA.debugLineNum = 8257615;BA.debugLine="sb.Append(\"Fecha Reclamación:  \").Append(FechaE";
_sb.Append("Fecha Reclamación:  ").Append(_fechaenvio).Append(parent.__c.CRLF);
RDebugUtils.currentLine=8257616;
 //BA.debugLineNum = 8257616;BA.debugLine="sb.Append(\"Usuario: \").Append(NombreUsuario).Ap";
_sb.Append("Usuario: ").Append(_nombreusuario).Append(parent.__c.CRLF);
RDebugUtils.currentLine=8257617;
 //BA.debugLineNum = 8257617;BA.debugLine="sb.Append(\"DireccionEmailRemitente:  \").Append(";
_sb.Append("DireccionEmailRemitente:  ").Append(_direccionemailremitente).Append(parent.__c.CRLF);
RDebugUtils.currentLine=8257618;
 //BA.debugLineNum = 8257618;BA.debugLine="sb.Append(\"DireccionEmailDestinatario:  \").Appe";
_sb.Append("DireccionEmailDestinatario:  ").Append(_direccionemaildestinatario).Append(parent.__c.CRLF);
RDebugUtils.currentLine=8257620;
 //BA.debugLineNum = 8257620;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sb.ToString,\"";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sb.ToString(),"Información Reclamación");
RDebugUtils.currentLine=8257621;
 //BA.debugLineNum = 8257621;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 62;
return;
case 62:
//C
this.state = 45;
;
RDebugUtils.currentLine=8257623;
 //BA.debugLineNum = 8257623;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Copiar e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Copiar el número de reclamación ("+_rfpc+") ?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8257624;
 //BA.debugLineNum = 8257624;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 45;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8257625;
 //BA.debugLineNum = 8257625;BA.debugLine="If rInt= xui.DialogResponse_Positive Then fx.Cl";
if (true) break;

case 45:
//if
this.state = 50;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 47;
;}if (true) break;

case 47:
//C
this.state = 50;
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Clipboard.SetString(_rfpc);
if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = -1;
;
RDebugUtils.currentLine=8257627;
 //BA.debugLineNum = 8257627;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.cseguimientofechasprometidascompra __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
String _tagmenuitem;
boolean _rbool = false;
int _filasel = 0;
Object _msa = null;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
String _nombreproveedor = "";
String _proveedor = "";
String _direccionemail = "";
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 24;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","SeleccionarCuentaRemitenteEmail","EmailReclamacionProveedor")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 24;
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="WAIT FOR (ActualizarDatos) COMPLETE (rBool As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), __ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 25;
return;
case 25:
//C
this.state = 24;
_rbool = (boolean) result[1];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), __ref._seleccionardireccionremitenteemails /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 6;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="If rBool=False Then Return";
if (true) break;

case 6:
//if
this.state = 11;
if (_rbool==parent.__c.False) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
if (true) return ;
if (true) break;

case 11:
//C
this.state = 24;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_filasel==-1) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ninguna línea.","Aviso");
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 17;
;
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=8192017;
 //BA.debugLineNum = 8192017;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"NombreProveedor",_filasel);
RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="Dim NombreProveedor As String=DCS.ValorCelda";
_nombreproveedor = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8192019;
 //BA.debugLineNum = 8192019;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"Proveedor",_filasel);
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="Dim Proveedor As String=DCS.ValorCelda";
_proveedor = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8192021;
 //BA.debugLineNum = 8192021;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"DireccionEmail",_filasel);
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="Dim DireccionEmail As String=DCS.ValorCelda";
_direccionemail = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=8192023;
 //BA.debugLineNum = 8192023;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Enviar e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Enviar email reclamación de plazos de entrega al proveedor "+_nombreproveedor+"?"+parent.__c.CRLF+parent.__c.CRLF+"Se generará un fichero excel con la información de todas sus líneas de pedido pendientes no excluidas","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=8192024;
 //BA.debugLineNum = 8192024;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 18;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8192025;
 //BA.debugLineNum = 8192025;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 18:
//if
this.state = 23;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=8192032;
 //BA.debugLineNum = 8192032;BA.debugLine="EmailReclamacionProveedor(Proveedor, NombreProv";
__ref._emailreclamacionproveedor /*void*/ (null,_proveedor,_nombreproveedor,_direccionemail);
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=8192034;
 //BA.debugLineNum = 8192034;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionardireccionremitenteemailsant(b4j.docU.cseguimientofechasprometidascompra __ref,anywheresoftware.b4a.objects.collections.List _lstopciones) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "seleccionardireccionremitenteemailsant", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionardireccionremitenteemailsant", new Object[] {_lstopciones}));}
ResumableSub_SeleccionarDireccionRemitenteEmailsAnt rsub = new ResumableSub_SeleccionarDireccionRemitenteEmailsAnt(this,__ref,_lstopciones);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarDireccionRemitenteEmailsAnt extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmailsAnt(b4j.docU.cseguimientofechasprometidascompra parent,b4j.docU.cseguimientofechasprometidascompra __ref,anywheresoftware.b4a.objects.collections.List _lstopciones) {
this.parent = parent;
this.__ref = __ref;
this._lstopciones = _lstopciones;
this.__ref = parent;
}
b4j.docU.cseguimientofechasprometidascompra __ref;
b4j.docU.cseguimientofechasprometidascompra parent;
anywheresoftware.b4a.objects.collections.List _lstopciones;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseguimientofechasprometidascompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="DireccionSeleccionadaRemitenteEmails=\"\"";
__ref._direccionseleccionadaremitenteemails /*String*/  = "";
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Cuenta para Enviar los Emails");
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=8781842;
 //BA.debugLineNum = 8781842;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=8781851;
 //BA.debugLineNum = 8781851;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=8781852;
 //BA.debugLineNum = 8781852;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_bcancel.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8781854;
 //BA.debugLineNum = 8781854;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=8781855;
 //BA.debugLineNum = 8781855;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=8781856;
 //BA.debugLineNum = 8781856;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=8781859;
 //BA.debugLineNum = 8781859;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseguimientofechasprometidascompra", "seleccionardireccionremitenteemailsant"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=8781860;
 //BA.debugLineNum = 8781860;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=8781862;
 //BA.debugLineNum = 8781862;BA.debugLine="DireccionSeleccionadaRemitenteEmails=B4XListDlg.S";
__ref._direccionseleccionadaremitenteemails /*String*/  = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=8781864;
 //BA.debugLineNum = 8781864;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=8781867;
 //BA.debugLineNum = 8781867;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stringbodyemail(b4j.docU.cseguimientofechasprometidascompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseguimientofechasprometidascompra";
if (Debug.shouldDelegate(ba, "stringbodyemail", false))
	 {return ((String) Debug.delegate(ba, "stringbodyemail", null));}
String _sbody = "";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub StringBodyEmail As String";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim sBody As String=$\" Buenos Días  Adjunto lista";
_sbody = ("\n"+"Buenos Días\n"+"\n"+"Adjunto listado excel de pedidos pendientes sin información de plazo de entrega o cuya fecha informada esta vencida.\n"+"Necesitamos cumplimenten el documento adjunto con las fechas actualizadas y nos lo hagan llegar a urgentemente.\n"+"\n"+"");
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="Return sBody";
if (true) return _sbody;
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="End Sub";
return "";
}
}