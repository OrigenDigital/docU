package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clistaanalisistarifasventa extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.clistaanalisistarifasventa", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.clistaanalisistarifasventa.class).invoke(this, new Object[] {null});
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
public String _permisomodulousuario = "";
public b4j.docU.jamformregistro _jformreg = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
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
public String  _initialize(b4j.docU.clistaanalisistarifasventa __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=92012544;
 //BA.debugLineNum = 92012544;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=92012546;
 //BA.debugLineNum = 92012546;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=92078082;
 //BA.debugLineNum = 92078082;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=92078083;
 //BA.debugLineNum = 92078083;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=92078085;
 //BA.debugLineNum = 92078085;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=92078086;
 //BA.debugLineNum = 92078086;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=92078087;
 //BA.debugLineNum = 92078087;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=92078089;
 //BA.debugLineNum = 92078089;BA.debugLine="frm.RootPane.LoadLayout(\"scrListaAnalisisTarifasV";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrListaAnalisisTarifasVenta");
RDebugUtils.currentLine=92078090;
 //BA.debugLineNum = 92078090;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=92078092;
 //BA.debugLineNum = 92078092;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Análisi";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Lista Análisis Tarifas Venta");
RDebugUtils.currentLine=92078094;
 //BA.debugLineNum = 92078094;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=92078096;
 //BA.debugLineNum = 92078096;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=92078100;
 //BA.debugLineNum = 92078100;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=92078101;
 //BA.debugLineNum = 92078101;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=92078103;
 //BA.debugLineNum = 92078103;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Nuevo Análisis Tarifas Venta","NuevoAnalisisTarifasVenta",BA.ObjectToString(parent.__c.Chr(((int)0xf196))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=92078104;
 //BA.debugLineNum = 92078104;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Ficha Análisis Tarifas Venta","FichaAnalisisTarifasVenta",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=92078105;
 //BA.debugLineNum = 92078105;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=92078106;
 //BA.debugLineNum = 92078106;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Ficha Análisis Tarifas Venta","FichaAnalisisTarifasVenta",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))));
RDebugUtils.currentLine=92078119;
 //BA.debugLineNum = 92078119;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisTarifasVenta.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=92078120;
 //BA.debugLineNum = 92078120;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=92078121;
 //BA.debugLineNum = 92078121;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("892078121",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=92078122;
 //BA.debugLineNum = 92078122;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=92078123;
 //BA.debugLineNum = 92078123;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=92078124;
 //BA.debugLineNum = 92078124;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=92078125;
 //BA.debugLineNum = 92078125;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=92078126;
 //BA.debugLineNum = 92078126;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=92078129;
 //BA.debugLineNum = 92078129;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=92078133;
 //BA.debugLineNum = 92078133;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=92078134;
 //BA.debugLineNum = 92078134;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=92078135;
 //BA.debugLineNum = 92078135;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=92078136;
 //BA.debugLineNum = 92078136;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=92078137;
 //BA.debugLineNum = 92078137;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=92078139;
 //BA.debugLineNum = 92078139;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"FechaCreacionLong","FechaModificacionLong"}));
RDebugUtils.currentLine=92078141;
 //BA.debugLineNum = 92078141;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Estado")}),"ABIERTO",((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=92078142;
 //BA.debugLineNum = 92078142;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("EstadoVentas")}),"PENDIENTE",((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=92078143;
 //BA.debugLineNum = 92078143;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("EstadoCostesFabricacionCorte")}),"PENDIENTE",((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=92078144;
 //BA.debugLineNum = 92078144;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("EstadoCostesFabricacionNoCorte")}),"PENDIENTE",((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=92078145;
 //BA.debugLineNum = 92078145;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("EstadoCostesImportacion")}),"PENDIENTE",((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=92078146;
 //BA.debugLineNum = 92078146;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("EstadoCostesCompra")}),"PENDIENTE",((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green,((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=92078172;
 //BA.debugLineNum = 92078172;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=92078173;
 //BA.debugLineNum = 92078173;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=92078178;
 //BA.debugLineNum = 92078178;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=92078180;
 //BA.debugLineNum = 92078180;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=92078182;
 //BA.debugLineNum = 92078182;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _abrirfichaanalisistarifasventa(b4j.docU.clistaanalisistarifasventa __ref,int _idantar,String _antar,String _descantar) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "abrirfichaanalisistarifasventa", false))
	 {return ((String) Debug.delegate(ba, "abrirfichaanalisistarifasventa", new Object[] {_idantar,_antar,_descantar}));}
b4j.docU.cfichaanalisistarifasventa _cfichaantar = null;
RDebugUtils.currentLine=93323264;
 //BA.debugLineNum = 93323264;BA.debugLine="Sub AbrirFichaAnalisisTarifasVenta(IDAnTar As Int,";
RDebugUtils.currentLine=93323265;
 //BA.debugLineNum = 93323265;BA.debugLine="Dim cFichaAnTar As cFichaAnalisisTarifasVenta";
_cfichaantar = new b4j.docU.cfichaanalisistarifasventa();
RDebugUtils.currentLine=93323266;
 //BA.debugLineNum = 93323266;BA.debugLine="cFichaAnTar.Initialize(IDAnTar, AnTar, DescAnTar)";
_cfichaantar._initialize /*String*/ (null,ba,_idantar,_antar,_descantar);
RDebugUtils.currentLine=93323267;
 //BA.debugLineNum = 93323267;BA.debugLine="cFichaAnTar.Show";
_cfichaantar._show /*String*/ (null);
RDebugUtils.currentLine=93323268;
 //BA.debugLineNum = 93323268;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=93323269;
 //BA.debugLineNum = 93323269;BA.debugLine="End Sub";
return "";
}
public void  _actualizardatos(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=92405762;
 //BA.debugLineNum = 92405762;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos lista análisis tarifas..."));
RDebugUtils.currentLine=92405763;
 //BA.debugLineNum = 92405763;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=92405764;
 //BA.debugLineNum = 92405764;BA.debugLine="Wait For(ActualizarDatosLista) complete (mRes As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatos"), __ref._actualizardatoslista /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=92405765;
 //BA.debugLineNum = 92405765;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=92405766;
 //BA.debugLineNum = 92405766;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("Salir")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=92405767;
 //BA.debugLineNum = 92405767;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=92405768;
 //BA.debugLineNum = 92405768;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=92405769;
 //BA.debugLineNum = 92405769;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=92405771;
 //BA.debugLineNum = 92405771;BA.debugLine="Dim lstReg As List=mRes.get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=92405773;
 //BA.debugLineNum = 92405773;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=92405774;
 //BA.debugLineNum = 92405774;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=92405775;
 //BA.debugLineNum = 92405775;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=92405776;
 //BA.debugLineNum = 92405776;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 25;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=92405777;
 //BA.debugLineNum = 92405777;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 8:
//if
this.state = 15;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=92405778;
 //BA.debugLineNum = 92405778;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=92405779;
 //BA.debugLineNum = 92405779;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
RDebugUtils.currentLine=92405781;
 //BA.debugLineNum = 92405781;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=92405782;
 //BA.debugLineNum = 92405782;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=92405783;
 //BA.debugLineNum = 92405783;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=92405784;
 //BA.debugLineNum = 92405784;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=92405785;
 //BA.debugLineNum = 92405785;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=92405788;
 //BA.debugLineNum = 92405788;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=92405790;
 //BA.debugLineNum = 92405790;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=92405791;
 //BA.debugLineNum = 92405791;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent.__c.True!=BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=92405792;
 //BA.debugLineNum = 92405792;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=92405793;
 //BA.debugLineNum = 92405793;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatos"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=92405795;
 //BA.debugLineNum = 92405795;BA.debugLine="jamTableView1.SetPlaceholderText(\"\")";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setplaceholdertext /*String*/ (null,"");
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=92405805;
 //BA.debugLineNum = 92405805;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatoslista(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "actualizardatoslista", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatoslista", null));}
ResumableSub_ActualizarDatosLista rsub = new ResumableSub_ActualizarDatosLista(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosLista extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLista(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=92536833;
 //BA.debugLineNum = 92536833;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblListaAnalisisTa";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblListaAnalisisTarifasVenta");
RDebugUtils.currentLine=92536834;
 //BA.debugLineNum = 92536834;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=92536835;
 //BA.debugLineNum = 92536835;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92536836;
 //BA.debugLineNum = 92536836;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=92536837;
 //BA.debugLineNum = 92536837;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
_slinkjrdc = parent._main._rdclinknav /*String*/ ;
RDebugUtils.currentLine=92536838;
 //BA.debugLineNum = 92536838;BA.debugLine="Dim Comando As String=\"ListaSimpleAnalisisTarifas";
_comando = "ListaSimpleAnalisisTarifasVenta";
RDebugUtils.currentLine=92536839;
 //BA.debugLineNum = 92536839;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=92536841;
 //BA.debugLineNum = 92536841;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatoslista"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=92536842;
 //BA.debugLineNum = 92536842;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=92536843;
 //BA.debugLineNum = 92536843;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=92536844;
 //BA.debugLineNum = 92536844;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=92536845;
 //BA.debugLineNum = 92536845;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatoslista"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=92536846;
 //BA.debugLineNum = 92536846;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=92536847;
 //BA.debugLineNum = 92536847;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=92536850;
 //BA.debugLineNum = 92536850;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=92536851;
 //BA.debugLineNum = 92536851;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=92536852;
 //BA.debugLineNum = 92536852;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=92536853;
 //BA.debugLineNum = 92536853;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=92536854;
 //BA.debugLineNum = 92536854;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Análisis Tarifas Venta","Aviso");
RDebugUtils.currentLine=92536855;
 //BA.debugLineNum = 92536855;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "actualizardatoslista"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=92536856;
 //BA.debugLineNum = 92536856;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92536857;
 //BA.debugLineNum = 92536857;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=92536858;
 //BA.debugLineNum = 92536858;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=92536860;
 //BA.debugLineNum = 92536860;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=92536861;
 //BA.debugLineNum = 92536861;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=92536864;
 //BA.debugLineNum = 92536864;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=92536865;
 //BA.debugLineNum = 92536865;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=92536873;
 //BA.debugLineNum = 92536873;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblListaAnalisisTarifasVenta",_lstreg);
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
RDebugUtils.currentLine=92536876;
 //BA.debugLineNum = 92536876;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=92536877;
 //BA.debugLineNum = 92536877;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=92340224;
 //BA.debugLineNum = 92340224;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=92340225;
 //BA.debugLineNum = 92340225;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=92340226;
 //BA.debugLineNum = 92340226;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=92340227;
 //BA.debugLineNum = 92340227;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=92340228;
 //BA.debugLineNum = 92340228;BA.debugLine="End Sub";
return "";
}
public String  _alternarexcluidoreclamacion(b4j.docU.clistaanalisistarifasventa __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "alternarexcluidoreclamacion", false))
	 {return ((String) Debug.delegate(ba, "alternarexcluidoreclamacion", new Object[] {_datosceldaseleccionada}));}
int _valoractual = 0;
int _nuevovalor = 0;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _pedidosel = "";
String _lineasel = "";
RDebugUtils.currentLine=92930048;
 //BA.debugLineNum = 92930048;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
RDebugUtils.currentLine=92930049;
 //BA.debugLineNum = 92930049;BA.debugLine="Log(DatosCeldaSeleccionada)";
__c.LogImpl("892930049",BA.ObjectToString(_datosceldaseleccionada),0);
RDebugUtils.currentLine=92930050;
 //BA.debugLineNum = 92930050;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
_valoractual = (int)(BA.ObjectToNumber(_datosceldaseleccionada.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=92930051;
 //BA.debugLineNum = 92930051;BA.debugLine="Dim NuevoValor As Int";
_nuevovalor = 0;
RDebugUtils.currentLine=92930052;
 //BA.debugLineNum = 92930052;BA.debugLine="Select ValorActual";
switch (_valoractual) {
case 0: {
RDebugUtils.currentLine=92930054;
 //BA.debugLineNum = 92930054;BA.debugLine="NuevoValor=1";
_nuevovalor = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=92930057;
 //BA.debugLineNum = 92930057;BA.debugLine="NuevoValor=0";
_nuevovalor = (int) (0);
 break; }
}
;
RDebugUtils.currentLine=92930059;
 //BA.debugLineNum = 92930059;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=92930060;
 //BA.debugLineNum = 92930060;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
_pedidosel = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=92930061;
 //BA.debugLineNum = 92930061;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
_lineasel = BA.ObjectToString(_mpk.Get((Object)("Linea")));
RDebugUtils.currentLine=92930062;
 //BA.debugLineNum = 92930062;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nuevovalor),(Object)(_pedidosel),(Object)(_lineasel)}));
RDebugUtils.currentLine=92930063;
 //BA.debugLineNum = 92930063;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescartablavalorceldaeditada /*String*/ (null,_datosceldaseleccionada.Fila /*int*/ ,_datosceldaseleccionada.Columna /*int*/ ,(Object)(_nuevovalor),_datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=92930064;
 //BA.debugLineNum = 92930064;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._seleccionarcelda /*String*/ (null,"ExcluidoReclamacion",_datosceldaseleccionada.Fila /*int*/ );
RDebugUtils.currentLine=92930065;
 //BA.debugLineNum = 92930065;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.clistaanalisistarifasventa __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=92143616;
 //BA.debugLineNum = 92143616;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=92143617;
 //BA.debugLineNum = 92143617;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=92143618;
 //BA.debugLineNum = 92143618;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=92274688;
 //BA.debugLineNum = 92274688;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=92274689;
 //BA.debugLineNum = 92274689;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=92274690;
 //BA.debugLineNum = 92274690;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargaranalisistarifasventadatoscababriranalisis(b4j.docU.clistaanalisistarifasventa __ref,int _idantarsel) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "cargaranalisistarifasventadatoscababriranalisis", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargaranalisistarifasventadatoscababriranalisis", new Object[] {_idantarsel}));}
ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis rsub = new ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis(this,__ref,_idantarsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis extends BA.ResumableSub {
public ResumableSub_CargarAnalisisTarifasVentaDatosCabAbrirAnalisis(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref,int _idantarsel) {
this.parent = parent;
this.__ref = __ref;
this._idantarsel = _idantarsel;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
int _idantarsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=93388801;
 //BA.debugLineNum = 93388801;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=93388802;
 //BA.debugLineNum = 93388802;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=93388803;
 //BA.debugLineNum = 93388803;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=93388804;
 //BA.debugLineNum = 93388804;BA.debugLine="Dim Comando As String=\"AnalisisTarifasVentaDatosC";
_comando = "AnalisisTarifasVentaDatosCabAbrirAnalisis";
RDebugUtils.currentLine=93388805;
 //BA.debugLineNum = 93388805;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_idantarsel)},parent);
RDebugUtils.currentLine=93388807;
 //BA.debugLineNum = 93388807;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "cargaranalisistarifasventadatoscababriranalisis"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=93388809;
 //BA.debugLineNum = 93388809;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=93388810;
 //BA.debugLineNum = 93388810;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=93388811;
 //BA.debugLineNum = 93388811;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "cargaranalisistarifasventadatoscababriranalisis"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=93388812;
 //BA.debugLineNum = 93388812;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=93388813;
 //BA.debugLineNum = 93388813;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=93388815;
 //BA.debugLineNum = 93388815;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=93388816;
 //BA.debugLineNum = 93388816;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de sp";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de sp "+_comando+". No se ha obtenido respuesta.","Error");
RDebugUtils.currentLine=93388817;
 //BA.debugLineNum = 93388817;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "cargaranalisistarifasventadatoscababriranalisis"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=93388818;
 //BA.debugLineNum = 93388818;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=93388819;
 //BA.debugLineNum = 93388819;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=93388821;
 //BA.debugLineNum = 93388821;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=93388822;
 //BA.debugLineNum = 93388822;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=93388823;
 //BA.debugLineNum = 93388823;BA.debugLine="mRes.Put(\"mData\", mData)";
_mres.Put((Object)("mData"),(Object)(_mdata.getObject()));
RDebugUtils.currentLine=93388824;
 //BA.debugLineNum = 93388824;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=93388825;
 //BA.debugLineNum = 93388825;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
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
RDebugUtils.currentLine=93388828;
 //BA.debugLineNum = 93388828;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=93388829;
 //BA.debugLineNum = 93388829;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
RDebugUtils.currentLine=91947008;
 //BA.debugLineNum = 91947008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=91947010;
 //BA.debugLineNum = 91947010;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=91947011;
 //BA.debugLineNum = 91947011;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=91947012;
 //BA.debugLineNum = 91947012;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=91947015;
 //BA.debugLineNum = 91947015;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=91947016;
 //BA.debugLineNum = 91947016;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=91947018;
 //BA.debugLineNum = 91947018;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=91947019;
 //BA.debugLineNum = 91947019;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=91947021;
 //BA.debugLineNum = 91947021;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=91947023;
 //BA.debugLineNum = 91947023;BA.debugLine="Private jFormReg As jamFormRegistro";
_jformreg = new b4j.docU.jamformregistro();
RDebugUtils.currentLine=91947025;
 //BA.debugLineNum = 91947025;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=91947026;
 //BA.debugLineNum = 91947026;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=92471296;
 //BA.debugLineNum = 92471296;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=92471297;
 //BA.debugLineNum = 92471297;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblListaAnalisisTarifasVenta"}))));
RDebugUtils.currentLine=92471298;
 //BA.debugLineNum = 92471298;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=92471299;
 //BA.debugLineNum = 92471299;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblListaAnalisisTa";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblListaAnalisisTarifasVenta");
 };
RDebugUtils.currentLine=92471301;
 //BA.debugLineNum = 92471301;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=92471302;
 //BA.debugLineNum = 92471302;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=92471303;
 //BA.debugLineNum = 92471303;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblListaAnalisisTarifasVenta (");
RDebugUtils.currentLine=92471305;
 //BA.debugLineNum = 92471305;BA.debugLine="sbCrearTabla.Append(\"IDAnalisisTarifas INTEGER,\")";
_sbcreartabla.Append("IDAnalisisTarifas INTEGER,");
RDebugUtils.currentLine=92471306;
 //BA.debugLineNum = 92471306;BA.debugLine="sbCrearTabla.Append(\"CodigoAnalisisTarifas TEXT C";
_sbcreartabla.Append("CodigoAnalisisTarifas TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=92471307;
 //BA.debugLineNum = 92471307;BA.debugLine="sbCrearTabla.Append(\"DescripcionAnalisis TEXT COL";
_sbcreartabla.Append("DescripcionAnalisis TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=92471311;
 //BA.debugLineNum = 92471311;BA.debugLine="sbCrearTabla.Append(\"FechaCreacionLong INTEGER DE";
_sbcreartabla.Append("FechaCreacionLong INTEGER DEFAULT 0,");
RDebugUtils.currentLine=92471312;
 //BA.debugLineNum = 92471312;BA.debugLine="sbCrearTabla.Append(\"FechaCreacion TEXT COLLATE N";
_sbcreartabla.Append("FechaCreacion TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=92471313;
 //BA.debugLineNum = 92471313;BA.debugLine="sbCrearTabla.Append(\"UsuarioCreacion TEXT COLLATE";
_sbcreartabla.Append("UsuarioCreacion TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=92471314;
 //BA.debugLineNum = 92471314;BA.debugLine="sbCrearTabla.Append(\"FechaModificacionLong INTEGE";
_sbcreartabla.Append("FechaModificacionLong INTEGER DEFAULT 0,");
RDebugUtils.currentLine=92471315;
 //BA.debugLineNum = 92471315;BA.debugLine="sbCrearTabla.Append(\"FechaModificacion TEXT COLLA";
_sbcreartabla.Append("FechaModificacion TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471316;
 //BA.debugLineNum = 92471316;BA.debugLine="sbCrearTabla.Append(\"UsuarioModificacion TEXT COL";
_sbcreartabla.Append("UsuarioModificacion TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471317;
 //BA.debugLineNum = 92471317;BA.debugLine="sbCrearTabla.Append(\"Estado TEXT COLLATE NOCASE D";
_sbcreartabla.Append("Estado TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471318;
 //BA.debugLineNum = 92471318;BA.debugLine="sbCrearTabla.Append(\"EstadoVentas TEXT COLLATE NO";
_sbcreartabla.Append("EstadoVentas TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471319;
 //BA.debugLineNum = 92471319;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesFabricacionCorte";
_sbcreartabla.Append("EstadoCostesFabricacionCorte TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471320;
 //BA.debugLineNum = 92471320;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesFabricacionNoCor";
_sbcreartabla.Append("EstadoCostesFabricacionNoCorte TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471321;
 //BA.debugLineNum = 92471321;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesImportacion TEXT";
_sbcreartabla.Append("EstadoCostesImportacion TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=92471322;
 //BA.debugLineNum = 92471322;BA.debugLine="sbCrearTabla.Append(\"EstadoCostesCompra TEXT COLL";
_sbcreartabla.Append("EstadoCostesCompra TEXT COLLATE NOCASE DEFAULT '')");
RDebugUtils.currentLine=92471324;
 //BA.debugLineNum = 92471324;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=92471326;
 //BA.debugLineNum = 92471326;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _crearcabeceraanalisistarifasventa(b4j.docU.clistaanalisistarifasventa __ref,String _descripcionanalisis,String _tipoanalisistarifa,String _tipotarifa,String _codigotarifa,String _usuariocreacion) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "crearcabeceraanalisistarifasventa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "crearcabeceraanalisistarifasventa", new Object[] {_descripcionanalisis,_tipoanalisistarifa,_tipotarifa,_codigotarifa,_usuariocreacion}));}
ResumableSub_CrearCabeceraAnalisisTarifasVenta rsub = new ResumableSub_CrearCabeceraAnalisisTarifasVenta(this,__ref,_descripcionanalisis,_tipoanalisistarifa,_tipotarifa,_codigotarifa,_usuariocreacion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearCabeceraAnalisisTarifasVenta extends BA.ResumableSub {
public ResumableSub_CrearCabeceraAnalisisTarifasVenta(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref,String _descripcionanalisis,String _tipoanalisistarifa,String _tipotarifa,String _codigotarifa,String _usuariocreacion) {
this.parent = parent;
this.__ref = __ref;
this._descripcionanalisis = _descripcionanalisis;
this._tipoanalisistarifa = _tipoanalisistarifa;
this._tipotarifa = _tipotarifa;
this._codigotarifa = _codigotarifa;
this._usuariocreacion = _usuariocreacion;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
String _descripcionanalisis;
String _tipoanalisistarifa;
String _tipotarifa;
String _codigotarifa;
String _usuariocreacion;
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
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=93192195;
 //BA.debugLineNum = 93192195;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=93192196;
 //BA.debugLineNum = 93192196;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=93192197;
 //BA.debugLineNum = 93192197;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=93192198;
 //BA.debugLineNum = 93192198;BA.debugLine="Dim Comando As String=\"NuevoAnalisisTarifasVenta\"";
_comando = "NuevoAnalisisTarifasVenta";
RDebugUtils.currentLine=93192199;
 //BA.debugLineNum = 93192199;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_descripcionanalisis),(Object)(_tipoanalisistarifa),(Object)(_tipotarifa),(Object)(_codigotarifa),(Object)(_usuariocreacion),(Object)(parent.__c.DateTime.getNow())},parent);
RDebugUtils.currentLine=93192201;
 //BA.debugLineNum = 93192201;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=93192203;
 //BA.debugLineNum = 93192203;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=93192204;
 //BA.debugLineNum = 93192204;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=93192205;
 //BA.debugLineNum = 93192205;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=93192206;
 //BA.debugLineNum = 93192206;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=93192207;
 //BA.debugLineNum = 93192207;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=93192210;
 //BA.debugLineNum = 93192210;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=93192211;
 //BA.debugLineNum = 93192211;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de sp";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de sp "+_comando+". No se ha obtenido respuesta.","Error");
RDebugUtils.currentLine=93192212;
 //BA.debugLineNum = 93192212;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
RDebugUtils.currentLine=93192213;
 //BA.debugLineNum = 93192213;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=93192214;
 //BA.debugLineNum = 93192214;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=93192216;
 //BA.debugLineNum = 93192216;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=93192217;
 //BA.debugLineNum = 93192217;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=93192218;
 //BA.debugLineNum = 93192218;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=93192219;
 //BA.debugLineNum = 93192219;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERROR\") Then";
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
RDebugUtils.currentLine=93192220;
 //BA.debugLineNum = 93192220;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de SP";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de SP "+_sresp+".","Error");
RDebugUtils.currentLine=93192221;
 //BA.debugLineNum = 93192221;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=93192222;
 //BA.debugLineNum = 93192222;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=93192224;
 //BA.debugLineNum = 93192224;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=93192225;
 //BA.debugLineNum = 93192225;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=93192226;
 //BA.debugLineNum = 93192226;BA.debugLine="mRes.Put(\"mData\", mResp)";
_mres.Put((Object)("mData"),(Object)(_mresp.getObject()));
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
RDebugUtils.currentLine=93192230;
 //BA.debugLineNum = 93192230;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=93192231;
 //BA.debugLineNum = 93192231;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _crearcabeceraanalisistarifasventa2(b4j.docU.clistaanalisistarifasventa __ref,String _descripcionanalisis) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "crearcabeceraanalisistarifasventa2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "crearcabeceraanalisistarifasventa2", new Object[] {_descripcionanalisis}));}
ResumableSub_CrearCabeceraAnalisisTarifasVenta2 rsub = new ResumableSub_CrearCabeceraAnalisisTarifasVenta2(this,__ref,_descripcionanalisis);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearCabeceraAnalisisTarifasVenta2 extends BA.ResumableSub {
public ResumableSub_CrearCabeceraAnalisisTarifasVenta2(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref,String _descripcionanalisis) {
this.parent = parent;
this.__ref = __ref;
this._descripcionanalisis = _descripcionanalisis;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
String _descripcionanalisis;
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
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=93257730;
 //BA.debugLineNum = 93257730;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=93257731;
 //BA.debugLineNum = 93257731;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=93257732;
 //BA.debugLineNum = 93257732;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=93257733;
 //BA.debugLineNum = 93257733;BA.debugLine="Dim Comando As String=\"NuevoAnalisisTarifasVenta2";
_comando = "NuevoAnalisisTarifasVenta2";
RDebugUtils.currentLine=93257734;
 //BA.debugLineNum = 93257734;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_descripcionanalisis),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ ),(Object)(parent.__c.DateTime.getNow())},parent);
RDebugUtils.currentLine=93257736;
 //BA.debugLineNum = 93257736;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=93257738;
 //BA.debugLineNum = 93257738;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=93257739;
 //BA.debugLineNum = 93257739;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=93257740;
 //BA.debugLineNum = 93257740;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=93257741;
 //BA.debugLineNum = 93257741;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=93257742;
 //BA.debugLineNum = 93257742;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=93257745;
 //BA.debugLineNum = 93257745;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=93257746;
 //BA.debugLineNum = 93257746;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de sp";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de sp "+_comando+". No se ha obtenido respuesta.","Error");
RDebugUtils.currentLine=93257747;
 //BA.debugLineNum = 93257747;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
RDebugUtils.currentLine=93257748;
 //BA.debugLineNum = 93257748;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=93257749;
 //BA.debugLineNum = 93257749;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=93257751;
 //BA.debugLineNum = 93257751;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=93257752;
 //BA.debugLineNum = 93257752;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=93257753;
 //BA.debugLineNum = 93257753;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=93257754;
 //BA.debugLineNum = 93257754;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERROR\") Then";
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
RDebugUtils.currentLine=93257755;
 //BA.debugLineNum = 93257755;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de SP";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de SP "+_sresp+".","Error");
RDebugUtils.currentLine=93257756;
 //BA.debugLineNum = 93257756;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "crearcabeceraanalisistarifasventa2"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=93257757;
 //BA.debugLineNum = 93257757;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=93257759;
 //BA.debugLineNum = 93257759;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=93257760;
 //BA.debugLineNum = 93257760;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=93257761;
 //BA.debugLineNum = 93257761;BA.debugLine="mRes.Put(\"mData\", mResp)";
_mres.Put((Object)("mData"),(Object)(_mresp.getObject()));
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
RDebugUtils.currentLine=93257765;
 //BA.debugLineNum = 93257765;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=93257766;
 //BA.debugLineNum = 93257766;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.clistaanalisistarifasventa __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=92209152;
 //BA.debugLineNum = 92209152;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=92209153;
 //BA.debugLineNum = 92209153;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=92209154;
 //BA.debugLineNum = 92209154;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=92602368;
 //BA.debugLineNum = 92602368;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=92602369;
 //BA.debugLineNum = 92602369;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=92602370;
 //BA.debugLineNum = 92602370;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cambioenceldaseleccionada(b4j.docU.clistaanalisistarifasventa __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
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
RDebugUtils.currentLine=92798976;
 //BA.debugLineNum = 92798976;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
RDebugUtils.currentLine=92798977;
 //BA.debugLineNum = 92798977;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
_lineaseltv = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=92798978;
 //BA.debugLineNum = 92798978;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=92798979;
 //BA.debugLineNum = 92798979;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
_pedido = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=92798980;
 //BA.debugLineNum = 92798980;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
_linea = (int)(BA.ObjectToNumber(_mpk.Get((Object)("Linea"))));
RDebugUtils.currentLine=92798981;
 //BA.debugLineNum = 92798981;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
_nombreproveedor = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"NombreProveedor"));
RDebugUtils.currentLine=92798982;
 //BA.debugLineNum = 92798982;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
_articulo = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Articulo"));
RDebugUtils.currentLine=92798983;
 //BA.debugLineNum = 92798983;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
_descripcion = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"DescripcionArticulo"));
RDebugUtils.currentLine=92798984;
 //BA.debugLineNum = 92798984;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
_talla = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Talla"));
RDebugUtils.currentLine=92798985;
 //BA.debugLineNum = 92798985;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
_stalla = BA.ObjectToString((((_talla).equals("") == false) ? ((Object)("Talla: "+_talla)) : ((Object)(""))));
RDebugUtils.currentLine=92798986;
 //BA.debugLineNum = 92798986;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
_qtypte = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"QtyPendiente")));
RDebugUtils.currentLine=92798987;
 //BA.debugLineNum = 92798987;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=92798988;
 //BA.debugLineNum = 92798988;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=92798989;
 //BA.debugLineNum = 92798989;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
_fechaprometidalong = BA.ObjectToLongNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"FechaPrometida"));
RDebugUtils.currentLine=92798990;
 //BA.debugLineNum = 92798990;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
_sfechaprometida = BA.ObjectToString(((_fechaprometidalong>0) ? ((Object)("Fecha Prometida: "+__c.DateTime.Date(_fechaprometidalong))) : ((Object)("SIN FECHA PROMETIDA"))));
RDebugUtils.currentLine=92798991;
 //BA.debugLineNum = 92798991;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=92798992;
 //BA.debugLineNum = 92798992;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
_pendienteseguimiento = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"PendienteSeguimiento")));
RDebugUtils.currentLine=92798993;
 //BA.debugLineNum = 92798993;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
_spendienteseguimiento = BA.ObjectToString(((_pendienteseguimiento==1) ? ((Object)("PENDIENTE SEGUIMIENTO")) : ((Object)(""))));
RDebugUtils.currentLine=92798995;
 //BA.debugLineNum = 92798995;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Pedido: "+_pedido+" Línea:"+BA.NumberToString(_linea)+"  "+_nombreproveedor+"  "+_articulo+"  "+_descripcion+"  "+_stalla+"  QtyPte: "+BA.NumberToString(_qtypte)+"  "+_sfechaprometida+" "+_spendienteseguimiento));
RDebugUtils.currentLine=92798997;
 //BA.debugLineNum = 92798997;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_celldobleclick(b4j.docU.clistaanalisistarifasventa __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}));}
int _filasel = 0;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
int _idanalisissel = 0;
String _codigoanalisistarifassel = "";
String _descripcionanalisistarifassel = "";
RDebugUtils.currentLine=92864512;
 //BA.debugLineNum = 92864512;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
RDebugUtils.currentLine=92864513;
 //BA.debugLineNum = 92864513;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
_filasel = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=92864514;
 //BA.debugLineNum = 92864514;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=jam";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"IDAnalisisTarifas",_filasel);
RDebugUtils.currentLine=92864515;
 //BA.debugLineNum = 92864515;BA.debugLine="Dim IDAnalisisSel As Int=DCS.ValorCelda";
_idanalisissel = (int)(BA.ObjectToNumber(_dcs.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=92864518;
 //BA.debugLineNum = 92864518;BA.debugLine="Dim CodigoAnalisisTarifasSel As String=jamTableVi";
_codigoanalisistarifassel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"CodigoAnalisisTarifas"));
RDebugUtils.currentLine=92864519;
 //BA.debugLineNum = 92864519;BA.debugLine="Dim DescripcionAnalisisTarifasSel As String=jamTa";
_descripcionanalisistarifassel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"DescripcionAnalisis"));
RDebugUtils.currentLine=92864523;
 //BA.debugLineNum = 92864523;BA.debugLine="AbrirFichaAnalisisTarifasVenta(IDAnalisisSel, Cod";
__ref._abrirfichaanalisistarifasventa /*String*/ (null,_idanalisissel,_codigoanalisistarifassel,_descripcionanalisistarifassel);
RDebugUtils.currentLine=92864524;
 //BA.debugLineNum = 92864524;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.clistaanalisistarifasventa __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _filasel = 0;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
int _idanalisissel = 0;
String _codigoanalisistarifassel = "";
String _descripcionanalisistarifassel = "";
RDebugUtils.currentLine=92733440;
 //BA.debugLineNum = 92733440;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=92733441;
 //BA.debugLineNum = 92733441;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"FichaAnalisisTarifasVenta")) {
case 0: {
RDebugUtils.currentLine=92733443;
 //BA.debugLineNum = 92733443;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=92733444;
 //BA.debugLineNum = 92733444;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"IDAnalisisTarifas",_filasel);
RDebugUtils.currentLine=92733445;
 //BA.debugLineNum = 92733445;BA.debugLine="Dim IDAnalisisSel As Int=DCS.ValorCelda";
_idanalisissel = (int)(BA.ObjectToNumber(_dcs.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=92733451;
 //BA.debugLineNum = 92733451;BA.debugLine="Dim CodigoAnalisisTarifasSel As String=jamTable";
_codigoanalisistarifassel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"CodigoAnalisisTarifas"));
RDebugUtils.currentLine=92733452;
 //BA.debugLineNum = 92733452;BA.debugLine="Dim DescripcionAnalisisTarifasSel As String=jam";
_descripcionanalisistarifassel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"DescripcionAnalisis"));
RDebugUtils.currentLine=92733453;
 //BA.debugLineNum = 92733453;BA.debugLine="AbrirFichaAnalisisTarifasVenta(IDAnalisisSel, C";
__ref._abrirfichaanalisistarifasventa /*String*/ (null,_idanalisissel,_codigoanalisistarifassel,_descripcionanalisistarifassel);
 break; }
}
;
RDebugUtils.currentLine=92733456;
 //BA.debugLineNum = 92733456;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_menubarmenuitem_action(b4j.docU.clistaanalisistarifasventa __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=92667904;
 //BA.debugLineNum = 92667904;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=92667905;
 //BA.debugLineNum = 92667905;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","NuevoAnalisisTarifasVenta")) {
case 0: {
RDebugUtils.currentLine=92667908;
 //BA.debugLineNum = 92667908;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=92667911;
 //BA.debugLineNum = 92667911;BA.debugLine="NuevoAnalisisTarifasVenta2";
__ref._nuevoanalisistarifasventa2 /*void*/ (null);
 break; }
}
;
RDebugUtils.currentLine=92667913;
 //BA.debugLineNum = 92667913;BA.debugLine="End Sub";
return "";
}
public void  _nuevoanalisistarifasventa2(b4j.docU.clistaanalisistarifasventa __ref) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "nuevoanalisistarifasventa2", false))
	 {Debug.delegate(ba, "nuevoanalisistarifasventa2", null); return;}
ResumableSub_NuevoAnalisisTarifasVenta2 rsub = new ResumableSub_NuevoAnalisisTarifasVenta2(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_NuevoAnalisisTarifasVenta2 extends BA.ResumableSub {
public ResumableSub_NuevoAnalisisTarifasVenta2(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
b4j.docU.b4xinputtemplate _b4xinputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btnok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btncancel = null;
int _rint = 0;
String _nuevadescripcion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _idnuevoantar = 0;
String _nuevoantar = "";
String _desnuevoantar = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=93126658;
 //BA.debugLineNum = 93126658;BA.debugLine="Dialog.Title=\"Descripción Análisis (max. \" & 255";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Descripción Análisis (max. "+BA.NumberToString(255)+" caracteres) ");
RDebugUtils.currentLine=93126659;
 //BA.debugLineNum = 93126659;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=93126661;
 //BA.debugLineNum = 93126661;BA.debugLine="Dim b4xInputDlg As B4XInputTemplate";
_b4xinputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=93126662;
 //BA.debugLineNum = 93126662;BA.debugLine="b4xInputDlg.Initialize";
_b4xinputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=93126663;
 //BA.debugLineNum = 93126663;BA.debugLine="b4xInputDlg.lblTitle.Text=\"\"";
_b4xinputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=93126664;
 //BA.debugLineNum = 93126664;BA.debugLine="b4xInputDlg.TextField1.SetTextAlignment(\"TOP\", \"L";
_b4xinputdlg._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=93126667;
 //BA.debugLineNum = 93126667;BA.debugLine="b4xInputDlg.mBase.Width = 800dip";
_b4xinputdlg._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (800)));
RDebugUtils.currentLine=93126668;
 //BA.debugLineNum = 93126668;BA.debugLine="b4xInputDlg.RegexPattern=\"^.{\" & 1 & \",\" & 255 &";
_b4xinputdlg._regexpattern /*String*/  = "^.{"+BA.NumberToString(1)+","+BA.NumberToString(255)+"}$";
RDebugUtils.currentLine=93126674;
 //BA.debugLineNum = 93126674;BA.debugLine="b4xInputDlg.Text=\"\"";
_b4xinputdlg._text /*String*/  = "";
RDebugUtils.currentLine=93126675;
 //BA.debugLineNum = 93126675;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xI";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xinputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=93126677;
 //BA.debugLineNum = 93126677;BA.debugLine="Dim btnOK As B4XView=Dialog.GetButton(xui.DialogR";
_btnok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btnok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=93126678;
 //BA.debugLineNum = 93126678;BA.debugLine="btnOK.Left=10dip";
_btnok.setLeft(parent.__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=93126679;
 //BA.debugLineNum = 93126679;BA.debugLine="btnOK.TextSize=14";
_btnok.setTextSize(14);
RDebugUtils.currentLine=93126681;
 //BA.debugLineNum = 93126681;BA.debugLine="Dim btnCancel As B4XView=Dialog.GetButton(xui.Dia";
_btncancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btncancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=93126682;
 //BA.debugLineNum = 93126682;BA.debugLine="btnCancel.Left=btnCancel.Left-30dip";
_btncancel.setLeft(_btncancel.getLeft()-parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=93126683;
 //BA.debugLineNum = 93126683;BA.debugLine="btnCancel.width=btnCancel.width+10dip";
_btncancel.setWidth(_btncancel.getWidth()+parent.__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=93126684;
 //BA.debugLineNum = 93126684;BA.debugLine="btnCancel.SetTextAlignment(\"CENTER\",\"RIGHT\")";
_btncancel.SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=93126685;
 //BA.debugLineNum = 93126685;BA.debugLine="btnCancel.TextSize=14";
_btncancel.setTextSize(14);
RDebugUtils.currentLine=93126687;
 //BA.debugLineNum = 93126687;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "nuevoanalisistarifasventa2"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=93126688;
 //BA.debugLineNum = 93126688;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=93126690;
 //BA.debugLineNum = 93126690;BA.debugLine="Dim NuevaDescripcion As String=b4xInputDlg.Text.T";
_nuevadescripcion = _b4xinputdlg._text /*String*/ .toUpperCase();
RDebugUtils.currentLine=93126693;
 //BA.debugLineNum = 93126693;BA.debugLine="Wait For (CrearCabeceraAnalisisTarifasVenta2(Nuev";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "nuevoanalisistarifasventa2"), __ref._crearcabeceraanalisistarifasventa2 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_nuevadescripcion));
this.state = 18;
return;
case 18:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=93126694;
 //BA.debugLineNum = 93126694;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=93126695;
 //BA.debugLineNum = 93126695;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if ((_accion).equals("NOK")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=93126696;
 //BA.debugLineNum = 93126696;BA.debugLine="Dim mData As Map=mRes.Get(\"mData\")";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mData"))));
RDebugUtils.currentLine=93126697;
 //BA.debugLineNum = 93126697;BA.debugLine="Dim IDNuevoAnTar As Int=mData.GetValueAt(0)";
_idnuevoantar = (int)(BA.ObjectToNumber(_mdata.GetValueAt((int) (0))));
RDebugUtils.currentLine=93126699;
 //BA.debugLineNum = 93126699;BA.debugLine="Wait For(CargarAnalisisTarifasVentaDatosCabAbrirA";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "nuevoanalisistarifasventa2"), __ref._cargaranalisistarifasventadatoscababriranalisis /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idnuevoantar));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=93126700;
 //BA.debugLineNum = 93126700;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=93126701;
 //BA.debugLineNum = 93126701;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_accion).equals("NOK")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=93126702;
 //BA.debugLineNum = 93126702;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=93126703;
 //BA.debugLineNum = 93126703;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=93126705;
 //BA.debugLineNum = 93126705;BA.debugLine="Dim mData As Map=mRes.Get(\"mData\")";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mData"))));
RDebugUtils.currentLine=93126706;
 //BA.debugLineNum = 93126706;BA.debugLine="Dim NuevoAnTar As String=mData.Get(\"CodigoAnalisi";
_nuevoantar = BA.ObjectToString(_mdata.Get((Object)("CodigoAnalisisTarifas")));
RDebugUtils.currentLine=93126707;
 //BA.debugLineNum = 93126707;BA.debugLine="Dim DesNuevoAnTar As String=mData.Get(\"Descripcio";
_desnuevoantar = BA.ObjectToString(_mdata.Get((Object)("DescripcionAnalisis")));
RDebugUtils.currentLine=93126709;
 //BA.debugLineNum = 93126709;BA.debugLine="AbrirFichaAnalisisTarifasVenta(IDNuevoAnTar, Nuev";
__ref._abrirfichaanalisistarifasventa /*String*/ (null,_idnuevoantar,_nuevoantar,_desnuevoantar);
RDebugUtils.currentLine=93126710;
 //BA.debugLineNum = 93126710;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jformreg_grabaredicionregistro(b4j.docU.clistaanalisistarifasventa __ref,anywheresoftware.b4a.objects.collections.List _lstinfocampojamformregistro) throws Exception{
__ref = this;
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "jformreg_grabaredicionregistro", false))
	 {return ((String) Debug.delegate(ba, "jformreg_grabaredicionregistro", new Object[] {_lstinfocampojamformregistro}));}
b4j.docU.jamformregistro._infocampojamformregistro _ifr = null;
RDebugUtils.currentLine=93061120;
 //BA.debugLineNum = 93061120;BA.debugLine="Sub jFormReg_GrabarEdicionRegistro(lstInfoCampoJam";
RDebugUtils.currentLine=93061121;
 //BA.debugLineNum = 93061121;BA.debugLine="For Each iFR As InfoCampoJamFormRegistro In lstIn";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lstinfocampojamformregistro;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ifr = (b4j.docU.jamformregistro._infocampojamformregistro)(group1.Get(index1));
RDebugUtils.currentLine=93061122;
 //BA.debugLineNum = 93061122;BA.debugLine="Log(iFR)";
__c.LogImpl("893061122",BA.ObjectToString(_ifr),0);
 }
};
RDebugUtils.currentLine=93061124;
 //BA.debugLineNum = 93061124;BA.debugLine="End Sub";
return "";
}
public void  _jformreg_grabarnuevoregistro(b4j.docU.clistaanalisistarifasventa __ref,anywheresoftware.b4a.objects.collections.List _lstdatoscamposregistronuevo) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";
if (Debug.shouldDelegate(ba, "jformreg_grabarnuevoregistro", false))
	 {Debug.delegate(ba, "jformreg_grabarnuevoregistro", new Object[] {_lstdatoscamposregistronuevo}); return;}
ResumableSub_jFormReg_GrabarNuevoRegistro rsub = new ResumableSub_jFormReg_GrabarNuevoRegistro(this,__ref,_lstdatoscamposregistronuevo);
rsub.resume(ba, null);
}
public static class ResumableSub_jFormReg_GrabarNuevoRegistro extends BA.ResumableSub {
public ResumableSub_jFormReg_GrabarNuevoRegistro(b4j.docU.clistaanalisistarifasventa parent,b4j.docU.clistaanalisistarifasventa __ref,anywheresoftware.b4a.objects.collections.List _lstdatoscamposregistronuevo) {
this.parent = parent;
this.__ref = __ref;
this._lstdatoscamposregistronuevo = _lstdatoscamposregistronuevo;
this.__ref = parent;
}
b4j.docU.clistaanalisistarifasventa __ref;
b4j.docU.clistaanalisistarifasventa parent;
anywheresoftware.b4a.objects.collections.List _lstdatoscamposregistronuevo;
String _descripcionanalisis = "";
String _tipoanalisistarifas = "";
String _tipotarifa = "";
String _codigotarifa = "";
String _usuariocreacion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clistaanalisistarifasventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=92995588;
 //BA.debugLineNum = 92995588;BA.debugLine="Dim DescripcionAnalisis As String=jFormReg.DatosC";
_descripcionanalisis = BA.ObjectToString(__ref._jformreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"DescripcionAnalisis").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=92995589;
 //BA.debugLineNum = 92995589;BA.debugLine="Dim TipoAnalisisTarifas As String=jFormReg.DatosC";
_tipoanalisistarifas = BA.ObjectToString(__ref._jformreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"TipoAnalisisTarifas").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=92995590;
 //BA.debugLineNum = 92995590;BA.debugLine="Dim TipoTarifa As String=jFormReg.DatosCampoSelec";
_tipotarifa = BA.ObjectToString(__ref._jformreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"TipoTarifa").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=92995591;
 //BA.debugLineNum = 92995591;BA.debugLine="Dim CodigoTarifa As String=jFormReg.DatosCampoSel";
_codigotarifa = BA.ObjectToString(__ref._jformreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"CodigoTarifa").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=92995592;
 //BA.debugLineNum = 92995592;BA.debugLine="Dim UsuarioCreacion As String=Main.DatosUsuario.N";
_usuariocreacion = parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ ;
RDebugUtils.currentLine=92995594;
 //BA.debugLineNum = 92995594;BA.debugLine="Wait For (CrearCabeceraAnalisisTarifasVenta(Descr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clistaanalisistarifasventa", "jformreg_grabarnuevoregistro"), __ref._crearcabeceraanalisistarifasventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_descripcionanalisis,_tipoanalisistarifas,_tipotarifa,_codigotarifa,_usuariocreacion));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=92995595;
 //BA.debugLineNum = 92995595;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=92995596;
 //BA.debugLineNum = 92995596;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((_accion).equals("NOK")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=92995597;
 //BA.debugLineNum = 92995597;BA.debugLine="jFormReg.CerrarFormRegistro";
__ref._jformreg /*b4j.docU.jamformregistro*/ ._cerrarformregistro /*String*/ (null);
RDebugUtils.currentLine=92995598;
 //BA.debugLineNum = 92995598;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=92995599;
 //BA.debugLineNum = 92995599;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}