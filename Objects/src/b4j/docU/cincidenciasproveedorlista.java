package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cincidenciasproveedorlista extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cincidenciasproveedorlista", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cincidenciasproveedorlista.class).invoke(this, new Object[] {null});
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
public String _departamentoemisor = "";
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
public String  _initialize(b4j.docU.cincidenciasproveedorlista __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cincidenciasproveedorlista parent,b4j.docU.cincidenciasproveedorlista __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedorlista __ref;
b4j.docU.cincidenciasproveedorlista parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=29097991;
 //BA.debugLineNum = 29097991;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=29097993;
 //BA.debugLineNum = 29097993;BA.debugLine="frm.RootPane.LoadLayout(\"scrIncidenciasProveedorL";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrIncidenciasProveedorLista");
RDebugUtils.currentLine=29097994;
 //BA.debugLineNum = 29097994;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "show"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=29097996;
 //BA.debugLineNum = 29097996;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Inciden";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Lista Incidencias Proveedor");
RDebugUtils.currentLine=29097998;
 //BA.debugLineNum = 29097998;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=29097999;
 //BA.debugLineNum = 29097999;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=29098004;
 //BA.debugLineNum = 29098004;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=29098006;
 //BA.debugLineNum = 29098006;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=29098010;
 //BA.debugLineNum = 29098010;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=29098011;
 //BA.debugLineNum = 29098011;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=29098013;
 //BA.debugLineNum = 29098013;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Nueva Incidencia proveedor","NuevaIncidenciaProveedorCompras",BA.ObjectToString(parent.__c.Chr(((int)0xf196))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=29098014;
 //BA.debugLineNum = 29098014;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Ficha Incidencia Proveedor","FichaIncidenciaProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=29098015;
 //BA.debugLineNum = 29098015;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=29098016;
 //BA.debugLineNum = 29098016;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Ficha Incidencia Proveedor","FichaIncidenciaProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))));
RDebugUtils.currentLine=29098022;
 //BA.debugLineNum = 29098022;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaIncidenciasProveedorCompras.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=29098023;
 //BA.debugLineNum = 29098023;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=29098024;
 //BA.debugLineNum = 29098024;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("829098024",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=29098025;
 //BA.debugLineNum = 29098025;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=29098026;
 //BA.debugLineNum = 29098026;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=29098027;
 //BA.debugLineNum = 29098027;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=29098028;
 //BA.debugLineNum = 29098028;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=29098029;
 //BA.debugLineNum = 29098029;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=29098035;
 //BA.debugLineNum = 29098035;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaFecha(Arra";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnafecha /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaIncidenciaLong"),(Object)("FechaDocumentoProveedorLong"),(Object)("FechaCierreLong")}));
RDebugUtils.currentLine=29098036;
 //BA.debugLineNum = 29098036;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaTexto1Cond";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Estado")}),"ABIERTA",((int)0x00ffffff),((int)0xff000000),((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=29098038;
 //BA.debugLineNum = 29098038;BA.debugLine="wait for(ActualizarDatos) complete (rObj As Objec";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "show"), __ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=29098040;
 //BA.debugLineNum = 29098040;BA.debugLine="If Main.sCamposFiltradosListaIncidenciasProveedor";
if (true) break;

case 5:
//if
this.state = 8;
if ((parent._main._scamposfiltradoslistaincidenciasproveedor /*String*/ ).equals("") == false && parent._main._lstvaloresfiltroslistaincidenciasproveedor /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=29098041;
 //BA.debugLineNum = 29098041;BA.debugLine="jamTableView1.sCamposFiltrados= Utilidades.CopyO";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._scamposfiltrados /*String*/  = BA.ObjectToString(parent._utilidades._copyobject /*Object*/ ((Object)(parent._main._scamposfiltradoslistaincidenciasproveedor /*String*/ )));
RDebugUtils.currentLine=29098042;
 //BA.debugLineNum = 29098042;BA.debugLine="jamTableView1.lstValoresFiltros=Utilidades.CopyO";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._lstvaloresfiltros /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent._utilidades._copyobject /*Object*/ ((Object)(parent._main._lstvaloresfiltroslistaincidenciasproveedor /*anywheresoftware.b4a.objects.collections.List*/ .getObject()))));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=29098046;
 //BA.debugLineNum = 29098046;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _abrirfichaincidenciaproveedor(b4j.docU.cincidenciasproveedorlista __ref,int _idincprovsel,String _incprov) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "abrirfichaincidenciaproveedor", false))
	 {return ((String) Debug.delegate(ba, "abrirfichaincidenciaproveedor", new Object[] {_idincprovsel,_incprov}));}
b4j.docU.cincidenciaproveedorficha _cfichaincprov = null;
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Sub AbrirFichaIncidenciaProveedor(IDIncProvSel As";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Dim cFichaIncProv As cIncidenciaProveedorFicha";
_cfichaincprov = new b4j.docU.cincidenciaproveedorficha();
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="cFichaIncProv.Initialize(IDIncProvSel, IncProv)";
_cfichaincprov._initialize /*String*/ (null,ba,_idincprovsel,_incprov);
RDebugUtils.currentLine=29884419;
 //BA.debugLineNum = 29884419;BA.debugLine="cFichaIncProv.DepartamentoEmisor=DepartamentoEmis";
_cfichaincprov._departamentoemisor /*String*/  = __ref._departamentoemisor /*String*/ ;
RDebugUtils.currentLine=29884420;
 //BA.debugLineNum = 29884420;BA.debugLine="cFichaIncProv.Show";
_cfichaincprov._show /*void*/ (null);
RDebugUtils.currentLine=29884421;
 //BA.debugLineNum = 29884421;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=29884422;
 //BA.debugLineNum = 29884422;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatos(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatos", null));}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cincidenciasproveedorlista parent,b4j.docU.cincidenciasproveedorlista __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedorlista __ref;
b4j.docU.cincidenciasproveedorlista parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos lista incidencias proveedor..."));
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="Wait For(ActualizarDatosLista) complete (mRes As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatos"), __ref._actualizardatoslista /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=29425669;
 //BA.debugLineNum = 29425669;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=29425670;
 //BA.debugLineNum = 29425670;BA.debugLine="If Accion=\"Salir\" Then";
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
RDebugUtils.currentLine=29425671;
 //BA.debugLineNum = 29425671;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=29425672;
 //BA.debugLineNum = 29425672;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=29425673;
 //BA.debugLineNum = 29425673;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=29425677;
 //BA.debugLineNum = 29425677;BA.debugLine="mSQL.ExecNonQuery2(\"Update tblIncidenciasProveedo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='ABIERTA' where EstadoIncidencia=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=29425678;
 //BA.debugLineNum = 29425678;BA.debugLine="mSQL.ExecNonQuery2(\"Update tblIncidenciasProveedo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='CERRADA' where EstadoIncidencia=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
RDebugUtils.currentLine=29425679;
 //BA.debugLineNum = 29425679;BA.debugLine="mSQL.ExecNonQuery2(\"Update tblIncidenciasProveedo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("Update tblIncidenciasProveedorListaCompras set Estado='ANULADA' where EstadoIncidencia=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(2)}));
RDebugUtils.currentLine=29425681;
 //BA.debugLineNum = 29425681;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblIncidenciasProveedorListaCompras");
RDebugUtils.currentLine=29425682;
 //BA.debugLineNum = 29425682;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=29425683;
 //BA.debugLineNum = 29425683;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=29425684;
 //BA.debugLineNum = 29425684;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=29425685;
 //BA.debugLineNum = 29425685;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=29425686;
 //BA.debugLineNum = 29425686;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=29425687;
 //BA.debugLineNum = 29425687;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
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
RDebugUtils.currentLine=29425688;
 //BA.debugLineNum = 29425688;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=29425689;
 //BA.debugLineNum = 29425689;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
RDebugUtils.currentLine=29425691;
 //BA.debugLineNum = 29425691;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=29425692;
 //BA.debugLineNum = 29425692;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=29425693;
 //BA.debugLineNum = 29425693;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=29425694;
 //BA.debugLineNum = 29425694;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=29425695;
 //BA.debugLineNum = 29425695;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=29425698;
 //BA.debugLineNum = 29425698;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=29425700;
 //BA.debugLineNum = 29425700;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=29425701;
 //BA.debugLineNum = 29425701;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
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
RDebugUtils.currentLine=29425702;
 //BA.debugLineNum = 29425702;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=29425703;
 //BA.debugLineNum = 29425703;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatos"), _msa);
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
RDebugUtils.currentLine=29425705;
 //BA.debugLineNum = 29425705;BA.debugLine="jamTableView1.SetPlaceholderText(\"\")";
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
RDebugUtils.currentLine=29425712;
 //BA.debugLineNum = 29425712;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=29425713;
 //BA.debugLineNum = 29425713;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatoslista(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "actualizardatoslista", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatoslista", null));}
ResumableSub_ActualizarDatosLista rsub = new ResumableSub_ActualizarDatosLista(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosLista extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLista(b4j.docU.cincidenciasproveedorlista parent,b4j.docU.cincidenciasproveedorlista __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedorlista __ref;
b4j.docU.cincidenciasproveedorlista parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
long _fechainicialconsulta = 0L;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblIncidenciasProv";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblIncidenciasProveedorListaCompras");
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=29556741;
 //BA.debugLineNum = 29556741;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=29556742;
 //BA.debugLineNum = 29556742;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=29556744;
 //BA.debugLineNum = 29556744;BA.debugLine="Dim Comando As String=\"IncidenciasProveedorListaD";
_comando = "IncidenciasProveedorListaDesdeFecha";
RDebugUtils.currentLine=29556745;
 //BA.debugLineNum = 29556745;BA.debugLine="Dim FechaInicialConsulta As Long=DateUtils.SetDat";
_fechainicialconsulta = parent._dateutils._setdate((int) (parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow())-2),(int) (1),(int) (1));
RDebugUtils.currentLine=29556746;
 //BA.debugLineNum = 29556746;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_fechainicialconsulta)},parent);
RDebugUtils.currentLine=29556748;
 //BA.debugLineNum = 29556748;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatoslista"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=29556750;
 //BA.debugLineNum = 29556750;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=29556751;
 //BA.debugLineNum = 29556751;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=29556752;
 //BA.debugLineNum = 29556752;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=29556753;
 //BA.debugLineNum = 29556753;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatoslista"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=29556754;
 //BA.debugLineNum = 29556754;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=29556755;
 //BA.debugLineNum = 29556755;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=29556758;
 //BA.debugLineNum = 29556758;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=29556759;
 //BA.debugLineNum = 29556759;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=29556760;
 //BA.debugLineNum = 29556760;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay incid";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay incidencias de proveedor registradas.","Aviso");
RDebugUtils.currentLine=29556761;
 //BA.debugLineNum = 29556761;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "actualizardatoslista"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=29556762;
 //BA.debugLineNum = 29556762;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=29556763;
 //BA.debugLineNum = 29556763;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=29556765;
 //BA.debugLineNum = 29556765;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=29556768;
 //BA.debugLineNum = 29556768;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=29556769;
 //BA.debugLineNum = 29556769;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=29556770;
 //BA.debugLineNum = 29556770;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=29556772;
 //BA.debugLineNum = 29556772;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblIncidenciasProveedorListaCompras",_lstreg);
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
RDebugUtils.currentLine=29556775;
 //BA.debugLineNum = 29556775;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=29556776;
 //BA.debugLineNum = 29556776;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=29360132;
 //BA.debugLineNum = 29360132;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.cincidenciasproveedorlista __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=28966919;
 //BA.debugLineNum = 28966919;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=28966922;
 //BA.debugLineNum = 28966922;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=28966923;
 //BA.debugLineNum = 28966923;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=28966925;
 //BA.debugLineNum = 28966925;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=28966926;
 //BA.debugLineNum = 28966926;BA.debugLine="Public DepartamentoEmisor As String";
_departamentoemisor = "";
RDebugUtils.currentLine=28966929;
 //BA.debugLineNum = 28966929;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=28966930;
 //BA.debugLineNum = 28966930;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblIncide";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblIncidenciasProveedorListaCompras");
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorListaCompras] ([IDIncidenciaProveedor] INTEGER\n"+"	, [IncidenciaProveedor] TEXT, [MigracionAccess] INTEGER, [Estado] TEXT default '', [EstadoIncidencia] INTEGER,[DepartamentoCoordinador] TEXT, [NumTareasAbiertas] INTEGER default 0\n"+"	, [TipoOrigenIncidenciaProveedor] TEXT,[IDUsuarioEmisor] INTEGER, [NombreUsuarioEmisor] TEXT, [IDUsuarioCompras] INTEGER, [NombreUsuarioCompras] TEXT\n"+"	, [FechaIncidenciaLong] INTEGER, [Proveedor] TEXT, [NombreProveedor] TEXT, [OrigenIncidencia] TEXT, [IDTipoDocumento] INTEGER, [DocumentoProveedor] TEXT\n"+"	, [FechaDocumentoProveedorLong] INTEGER, [IDTipoDocumentoOrigen] INTEGER, [NombreTipoDocumento] TEXT, [DocumentoOrigen] TEXT, [DescripcionIncidencia] TEXT, [IDTipoIncidencia] INTEGER\n"+"	, [NombreTipoIncidencia] TEXT, [AccionCompras] TEXT, [FechaAccionComprasLong] INTEGER, [IDUsuarioAccionCompras] INTEGER, [NombreUsuarioAccionCompras] TEXT\n"+"	, [FechaCierreLong] INTEGER, [IDUsuarioCierre] INTEGER, [NombreUsuarioCierre] TEXT, [GravedadIncidencia] TEXT, [ResponsabilidadInterna] INTEGER default 0)");
RDebugUtils.currentLine=29491210;
 //BA.debugLineNum = 29491210;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=29491213;
 //BA.debugLineNum = 29491213;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cincidenciasproveedorlista __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.cincidenciasproveedorlista __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_celldobleclick(b4j.docU.cincidenciasproveedorlista __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}));}
int _filasel = 0;
int _idincidenciaproveedorsel = 0;
String _incidenciaproveedorsel = "";
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
_filasel = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaSel";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableView1";
_idincidenciaproveedorsel = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDIncidenciaProveedor")));
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableView";
_incidenciaproveedorsel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IncidenciaProveedor"));
RDebugUtils.currentLine=29818886;
 //BA.debugLineNum = 29818886;BA.debugLine="Main.sCamposFiltradosListaIncidenciasProveedor=ja";
_main._scamposfiltradoslistaincidenciasproveedor /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._scamposfiltrados /*String*/ ;
RDebugUtils.currentLine=29818887;
 //BA.debugLineNum = 29818887;BA.debugLine="Main.lstValoresFiltrosListaIncidenciasProveedor=j";
_main._lstvaloresfiltroslistaincidenciasproveedor /*anywheresoftware.b4a.objects.collections.List*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._lstvaloresfiltros /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=29818889;
 //BA.debugLineNum = 29818889;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProveed";
__ref._abrirfichaincidenciaproveedor /*String*/ (null,_idincidenciaproveedorsel,_incidenciaproveedorsel);
RDebugUtils.currentLine=29818890;
 //BA.debugLineNum = 29818890;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.cincidenciasproveedorlista __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _filasel = 0;
int _idincidenciaproveedorsel = 0;
String _incidenciaproveedorsel = "";
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"FichaIncidenciaProveedor")) {
case 0: {
RDebugUtils.currentLine=29753347;
 //BA.debugLineNum = 29753347;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableVie";
_idincidenciaproveedorsel = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDIncidenciaProveedor")));
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableVi";
_incidenciaproveedorsel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IncidenciaProveedor"));
RDebugUtils.currentLine=29753351;
 //BA.debugLineNum = 29753351;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProve";
__ref._abrirfichaincidenciaproveedor /*String*/ (null,_idincidenciaproveedorsel,_incidenciaproveedorsel);
 break; }
}
;
RDebugUtils.currentLine=29753353;
 //BA.debugLineNum = 29753353;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.cincidenciasproveedorlista __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cincidenciasproveedorlista parent,b4j.docU.cincidenciasproveedorlista __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedorlista __ref;
b4j.docU.cincidenciasproveedorlista parent;
String _tagmenuitem;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedorlista";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","NuevaIncidenciaProveedorCompras")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=29687812;
 //BA.debugLineNum = 29687812;BA.debugLine="wait for(ActualizarDatos) complete (rObj As Obj";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedorlista", "jamtableview1_menubarmenuitem_action"), __ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_robj = (Object) result[1];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=29687814;
 //BA.debugLineNum = 29687814;BA.debugLine="AbrirFichaIncidenciaProveedor(0,\"\")";
__ref._abrirfichaincidenciaproveedor /*String*/ (null,(int) (0),"");
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=29687816;
 //BA.debugLineNum = 29687816;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}