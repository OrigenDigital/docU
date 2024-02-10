package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cevaluacionproveedores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cevaluacionproveedores", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cevaluacionproveedores.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public b4j.docU.b4xdrawer _drawer = null;
public b4j.docU.jamtableview _jamtableviewevaluacionproveedores = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondoevaluacionproveedores = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbliconcerrardrawer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltextocerrardrawer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnltopdrawerleft = null;
public anywheresoftware.b4j.objects.TreeViewWrapper _treeviewdrawer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _backgroundproveedoresfijosevaluacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _baseproveedoresfijosevaluacion = null;
public b4j.docU.jamtableview _jamtableviewproveedoresfijosevaluacionproveedores = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnaddmotivofijarevaluacionproveedor = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlemotivosfijarevaluacionproveedor = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitleproveedorfijoevaluacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondoproveedorfijoevaluacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombreproveedorfijoevaluacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtproveedorfijoevaluacion = null;
public b4j.docU.jamtableview _jamtableviewmotivosfijarevaluacionproveedor = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion = null;
public String _proveedoredicion = "";
public int _filajamtvevalproveedoredicion = 0;
public boolean _permisocalificarproveedores = false;
public boolean _permisovalidarcalificacionproveedores = false;
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
public String  _initialize(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=9568273;
 //BA.debugLineNum = 9568273;BA.debugLine="frm.RootPane.LoadLayout(\"scrEvaluacionProveedores";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrEvaluacionProveedoresSinDrawer");
RDebugUtils.currentLine=9568275;
 //BA.debugLineNum = 9568275;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=9568279;
 //BA.debugLineNum = 9568279;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=9568281;
 //BA.debugLineNum = 9568281;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Evaluació";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    Evaluación Proveedores");
RDebugUtils.currentLine=9568284;
 //BA.debugLineNum = 9568284;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=9568288;
 //BA.debugLineNum = 9568288;BA.debugLine="jamTableViewEvaluacionProveedores.EstadoMenuItem(";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=9568289;
 //BA.debugLineNum = 9568289;BA.debugLine="jamTableViewEvaluacionProveedores.EstadoMenuItem(";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=9568292;
 //BA.debugLineNum = 9568292;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Actualizar Datos","ActualizarDatos",BA.ObjectToString(parent.__c.Chr(((int)0xe5d5))),__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=9568294;
 //BA.debugLineNum = 9568294;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Calificar Proveedor","CalificarProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))),__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=9568295;
 //BA.debugLineNum = 9568295;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Borrar Calificación Proveedor","BorrarCalificacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf014))),__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=9568296;
 //BA.debugLineNum = 9568296;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Validar Calificación Proveedor","ValidarCalificacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf046))),__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=9568297;
 //BA.debugLineNum = 9568297;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Borrar Validación Calificación Proveedor","BorrarValidacionCalificacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf05c))),__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=9568298;
 //BA.debugLineNum = 9568298;BA.debugLine="jamTableViewEvaluacionProveedores.AddMenuItemFont";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Configurar Proveedor FIJO Evaluación","ConfigurarProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xe1b3))),__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=9568299;
 //BA.debugLineNum = 9568299;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=9568300;
 //BA.debugLineNum = 9568300;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Calificar Proveedor","CalificarProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))));
RDebugUtils.currentLine=9568301;
 //BA.debugLineNum = 9568301;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Borrar Calificación Proveedor","BorrarCalificacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf014))));
RDebugUtils.currentLine=9568302;
 //BA.debugLineNum = 9568302;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Validar Calificación Proveedor","ValidarCalificacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf046))));
RDebugUtils.currentLine=9568303;
 //BA.debugLineNum = 9568303;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Borrar Validación Calificación Proveedor","BorrarValidacionCalificacionProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf05c))));
RDebugUtils.currentLine=9568304;
 //BA.debugLineNum = 9568304;BA.debugLine="jamTableViewEvaluacionProveedores.AddContextMenuI";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontmaterialiconstext /*String*/ (null,"Configurar Proveedor FIJO Evaluación","ConfigurarProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xe1b3))));
RDebugUtils.currentLine=9568310;
 //BA.debugLineNum = 9568310;BA.debugLine="Dim rSub As ResumableSub=jamTableViewEvaluacionPr";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaEvaluacionProveedoresDatosActuales.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=9568311;
 //BA.debugLineNum = 9568311;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=9568312;
 //BA.debugLineNum = 9568312;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("89568312",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=9568313;
 //BA.debugLineNum = 9568313;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=9568314;
 //BA.debugLineNum = 9568314;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=9568315;
 //BA.debugLineNum = 9568315;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=9568316;
 //BA.debugLineNum = 9568316;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=9568317;
 //BA.debugLineNum = 9568317;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9568320;
 //BA.debugLineNum = 9568320;BA.debugLine="jamTableViewEvaluacionProveedores.AlturaFilas=0";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=9568322;
 //BA.debugLineNum = 9568322;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnafecha /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaActualizacionDatosLong"),(Object)("FechaCalificacion"),(Object)("FechaValidacionCalificacion")}));
RDebugUtils.currentLine=9568323;
 //BA.debugLineNum = 9568323;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnabooleanatipointegercheckbox /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Bloqueado"),(Object)("ProveedorFijoEvaluacion")}));
RDebugUtils.currentLine=9568324;
 //BA.debugLineNum = 9568324;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("CalificacionProvisional")}),"EVALUABLE",((int)0x00ffffff),((int)0xff000000),((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=9568325;
 //BA.debugLineNum = 9568325;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Calificacion")}),"NO APTO",((int)0x00ffffff),((int)0xff000000),((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=9568326;
 //BA.debugLineNum = 9568326;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnatexto1condicioncolorfondocolortexto /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("ValidacionCalificacion")}),"NO OK",((int)0x00ffffff),((int)0xff000000),((int)0x00ffffff),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=9568327;
 //BA.debugLineNum = 9568327;BA.debugLine="jamTableViewEvaluacionProveedores.AsignarCellFact";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnanumericaformatostringdecimales /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("ImporteNetoFacturacion12Meses")}),"#,##0");
RDebugUtils.currentLine=9568329;
 //BA.debugLineNum = 9568329;BA.debugLine="Inicio";
__ref._inicio /*void*/ (null);
RDebugUtils.currentLine=9568332;
 //BA.debugLineNum = 9568332;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosevaluacionproveedores12ultimosmeses(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "actualizardatosevaluacionproveedores12ultimosmeses", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosevaluacionproveedores12ultimosmeses", null));}
ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses rsub = new ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses extends BA.ResumableSub {
public ResumableSub_ActualizarDatosEvaluacionProveedores12UltimosMeses(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdatosnav = null;
String _proveedor = "";
String _nombreproveedor = "";
int _bloqueado = 0;
String _grupocontableproveedor = "";
double _totalimportenetofacturacion = 0;
boolean _rbool = false;
Object _msa = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos NAV 12 meses..."));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Wait For(ActualizarDatosNAVEvaluacionProveedores)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), __ref._actualizardatosnavevaluacionproveedores /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos proveedores en tabla evaluación..."));
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=11141136;
 //BA.debugLineNum = 11141136;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EvaluacionProveedoresBorrarDatosNAV",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=11141137;
 //BA.debugLineNum = 11141137;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=11141138;
 //BA.debugLineNum = 11141138;BA.debugLine="Dim rsDatosNAV As ResultSet=mSQL.ExecQuery(\"selec";
_rsdatosnav = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdatosnav = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblEvaluacionProveedoresDatosNAVPeriodo order by Proveedor");
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="Do While rsDatosNAV.NextRow";
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsdatosnav.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
RDebugUtils.currentLine=11141140;
 //BA.debugLineNum = 11141140;BA.debugLine="Dim Proveedor As String=rsDatosNAV.GetString(\"Pr";
_proveedor = _rsdatosnav.GetString("Proveedor");
RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="Dim NombreProveedor As String=rsDatosNAV.GetStri";
_nombreproveedor = _rsdatosnav.GetString("NombreProveedor");
RDebugUtils.currentLine=11141142;
 //BA.debugLineNum = 11141142;BA.debugLine="Dim Bloqueado As Int=rsDatosNAV.GetString(\"Bloqu";
_bloqueado = (int)(Double.parseDouble(_rsdatosnav.GetString("Bloqueado")));
RDebugUtils.currentLine=11141143;
 //BA.debugLineNum = 11141143;BA.debugLine="Dim GrupoContableProveedor As String=rsDatosNAV.";
_grupocontableproveedor = _rsdatosnav.GetString("GrupoContableProveedor");
RDebugUtils.currentLine=11141144;
 //BA.debugLineNum = 11141144;BA.debugLine="Dim TotalImporteNetoFacturacion As Double=rsDato";
_totalimportenetofacturacion = (double)(Double.parseDouble(_rsdatosnav.GetString("TotalImporteNetoFacturacion")));
RDebugUtils.currentLine=11141145;
 //BA.debugLineNum = 11141145;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Ev";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EvaluacionProveedoresInsertarDatosNAVProveedor",new Object[]{(Object)(_proveedor),(Object)(_nombreproveedor),(Object)(_bloqueado),(Object)(_grupocontableproveedor),(Object)(_totalimportenetofacturacion)});
RDebugUtils.currentLine=11141146;
 //BA.debugLineNum = 11141146;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=11141148;
 //BA.debugLineNum = 11141148;BA.debugLine="rsDatosNAV.Close";
_rsdatosnav.Close();
RDebugUtils.currentLine=11141150;
 //BA.debugLineNum = 11141150;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands));
this.state = 18;
return;
case 18:
//C
this.state = 9;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=11141151;
 //BA.debugLineNum = 11141151;BA.debugLine="If rBool=False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_rbool==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=11141152;
 //BA.debugLineNum = 11141152;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11141153;
 //BA.debugLineNum = 11141153;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar los datos NAV de proveedores.","Error");
RDebugUtils.currentLine=11141154;
 //BA.debugLineNum = 11141154;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 12;
;
RDebugUtils.currentLine=11141155;
 //BA.debugLineNum = 11141155;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=11141158;
 //BA.debugLineNum = 11141158;BA.debugLine="Wait For(EvaluacionProveedoresActualizarVariables";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), __ref._evaluacionproveedoresactualizarvariables /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11141159;
 //BA.debugLineNum = 11141159;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11141160;
 //BA.debugLineNum = 11141160;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=11141161;
 //BA.debugLineNum = 11141161;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11141162;
 //BA.debugLineNum = 11141162;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=11141188;
 //BA.debugLineNum = 11141188;BA.debugLine="wait for (RefrescarDatosActualesEvaluacion) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosevaluacionproveedores12ultimosmeses"), __ref._refrescardatosactualesevaluacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=11141190;
 //BA.debugLineNum = 11141190;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11141191;
 //BA.debugLineNum = 11141191;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=11141192;
 //BA.debugLineNum = 11141192;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosnavevaluacionproveedores(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "actualizardatosnavevaluacionproveedores", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosnavevaluacionproveedores", null));}
ResumableSub_ActualizarDatosNAVEvaluacionProveedores rsub = new ResumableSub_ActualizarDatosNAVEvaluacionProveedores(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosNAVEvaluacionProveedores extends BA.ResumableSub {
public ResumableSub_ActualizarDatosNAVEvaluacionProveedores(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblEvaluacionProveedoresDatosNAVPeriodo");
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="Dim Comando As String=\"DatosEvaluacionProveedores";
_comando = "DatosEvaluacionProveedores";
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosnavevaluacionproveedores"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosnavevaluacionproveedores"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=10420240;
 //BA.debugLineNum = 10420240;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10420244;
 //BA.debugLineNum = 10420244;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de proveedores de navision.","Error");
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosnavevaluacionproveedores"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=10420255;
 //BA.debugLineNum = 10420255;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=10420256;
 //BA.debugLineNum = 10420256;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=10420258;
 //BA.debugLineNum = 10420258;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblEvaluacionProveedoresDatosNAVPeriodo",_lstreg);
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
RDebugUtils.currentLine=10420261;
 //BA.debugLineNum = 10420261;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=10420262;
 //BA.debugLineNum = 10420262;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _evaluacionproveedoresactualizarvariables(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "evaluacionproveedoresactualizarvariables", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "evaluacionproveedoresactualizarvariables", null));}
ResumableSub_EvaluacionProveedoresActualizarVariables rsub = new ResumableSub_EvaluacionProveedoresActualizarVariables(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EvaluacionProveedoresActualizarVariables extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresActualizarVariables(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
b4j.example.dateutils._period _prd = null;
long _fechaactualmenos12meses = 0L;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mrespuesta = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim prd As Period";
_prd = new b4j.example.dateutils._period();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="prd.Months=-12";
_prd.Months = (int) (-12);
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Dim FechaActualMenos12Meses As Long=DateUtils.Add";
_fechaactualmenos12meses = parent._dateutils._addperiod(parent.__c.DateTime.getNow(),_prd);
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresActua";
_comando = "EvaluacionProveedoresActualizarVariables";
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DateT";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(parent.__c.DateTime.getNow()),(Object)(_fechaactualmenos12meses)},parent);
RDebugUtils.currentLine=10682381;
 //BA.debugLineNum = 10682381;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresactualizarvariables"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresactualizarvariables"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=10682386;
 //BA.debugLineNum = 10682386;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10682389;
 //BA.debugLineNum = 10682389;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then  ' este caso";
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
RDebugUtils.currentLine=10682390;
 //BA.debugLineNum = 10682390;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=10682396;
 //BA.debugLineNum = 10682396;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=10682397;
 //BA.debugLineNum = 10682397;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
_mrespuesta = new anywheresoftware.b4a.objects.collections.Map();
_mrespuesta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=10682398;
 //BA.debugLineNum = 10682398;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
_sresp = BA.ObjectToString(_mrespuesta.GetValueAt((int) (0)));
RDebugUtils.currentLine=10682399;
 //BA.debugLineNum = 10682399;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=10682400;
 //BA.debugLineNum = 10682400;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error recuperando datos del SP "+_comando+"."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Aviso");
RDebugUtils.currentLine=10682401;
 //BA.debugLineNum = 10682401;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresactualizarvariables"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=10682402;
 //BA.debugLineNum = 10682402;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=10682403;
 //BA.debugLineNum = 10682403;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=10682405;
 //BA.debugLineNum = 10682405;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=10682406;
 //BA.debugLineNum = 10682406;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
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
RDebugUtils.currentLine=10682411;
 //BA.debugLineNum = 10682411;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=10682412;
 //BA.debugLineNum = 10682412;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refrescardatosactualesevaluacion(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "refrescardatosactualesevaluacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "refrescardatosactualesevaluacion", null));}
ResumableSub_RefrescarDatosActualesEvaluacion rsub = new ResumableSub_RefrescarDatosActualesEvaluacion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefrescarDatosActualesEvaluacion extends BA.ResumableSub {
public ResumableSub_RefrescarDatosActualesEvaluacion(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="wait for(EvaluacionProveedoresDatosEvaluacionActu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), __ref._evaluacionproveedoresdatosevaluacionactual /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblEvaluacionProveedoresDatosEvaluacionActual order by Proveedor");
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="Dim rSub As ResumableSub=jamTableViewEvaluacionPr";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=9895951;
 //BA.debugLineNum = 9895951;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
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
RDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=9895954;
 //BA.debugLineNum = 9895954;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=9895958;
 //BA.debugLineNum = 9895958;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=9895959;
 //BA.debugLineNum = 9895959;BA.debugLine="jamTableViewEvaluacionProveedores.AbrirCamposB";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=9895960;
 //BA.debugLineNum = 9895960;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=9895965;
 //BA.debugLineNum = 9895965;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=9895966;
 //BA.debugLineNum = 9895966;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
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
RDebugUtils.currentLine=9895967;
 //BA.debugLineNum = 9895967;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=9895968;
 //BA.debugLineNum = 9895968;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "refrescardatosactualesevaluacion"), _msa);
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
RDebugUtils.currentLine=9895970;
 //BA.debugLineNum = 9895970;BA.debugLine="jamTableViewEvaluacionProveedores.SetPlacehold";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._setplaceholdertext /*String*/ (null,"");
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
RDebugUtils.currentLine=9895975;
 //BA.debugLineNum = 9895975;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=9895976;
 //BA.debugLineNum = 9895976;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosproveedorfijoproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "actualizardatosproveedorfijoproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosproveedorfijoproveedor", new Object[] {_provsel}));}
ResumableSub_ActualizarDatosProveedorFijoProveedor rsub = new ResumableSub_ActualizarDatosProveedorFijoProveedor(this,__ref,_provsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosProveedorFijoProveedor extends BA.ResumableSub {
public ResumableSub_ActualizarDatosProveedorFijoProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Wait For(EvaluacionProveedoresDatosProveedorFijo(";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), __ref._evaluacionproveedoresdatosproveedorfijo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="Dim rSub As ResumableSub=jamTableViewMotivosFijar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
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
RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
RDebugUtils.currentLine=11599891;
 //BA.debugLineNum = 11599891;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.Ab";
__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=11599898;
 //BA.debugLineNum = 11599898;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 18:
//if
this.state = 23;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=11599902;
 //BA.debugLineNum = 11599902;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=11599903;
 //BA.debugLineNum = 11599903;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "actualizardatosproveedorfijoproveedor"), _msa);
this.state = 30;
return;
case 30:
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
RDebugUtils.currentLine=11599906;
 //BA.debugLineNum = 11599906;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _evaluacionproveedoresdatosproveedorfijo(b4j.docU.cevaluacionproveedores __ref,String _provsel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "evaluacionproveedoresdatosproveedorfijo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "evaluacionproveedoresdatosproveedorfijo", new Object[] {_provsel}));}
ResumableSub_EvaluacionProveedoresDatosProveedorFijo rsub = new ResumableSub_EvaluacionProveedoresDatosProveedorFijo(this,__ref,_provsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EvaluacionProveedoresDatosProveedorFijo extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresDatosProveedorFijo(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos proveedor fijo..."));
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=11665421;
 //BA.debugLineNum = 11665421;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresDetal";
_comando = "EvaluacionProveedoresDetalleProveedorFijo";
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_provsel)},parent);
RDebugUtils.currentLine=11665424;
 //BA.debugLineNum = 11665424;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosproveedorfijo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=11665427;
 //BA.debugLineNum = 11665427;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11665428;
 //BA.debugLineNum = 11665428;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=11665429;
 //BA.debugLineNum = 11665429;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosproveedorfijo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=11665430;
 //BA.debugLineNum = 11665430;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=11665431;
 //BA.debugLineNum = 11665431;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=11665434;
 //BA.debugLineNum = 11665434;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=11665435;
 //BA.debugLineNum = 11665435;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11665436;
 //BA.debugLineNum = 11665436;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos registrados de proveedor fijo para el proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"."),"Aviso");
RDebugUtils.currentLine=11665437;
 //BA.debugLineNum = 11665437;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosproveedorfijo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=11665438;
 //BA.debugLineNum = 11665438;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11665439;
 //BA.debugLineNum = 11665439;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=11665441;
 //BA.debugLineNum = 11665441;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=11665442;
 //BA.debugLineNum = 11665442;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11665443;
 //BA.debugLineNum = 11665443;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=11665444;
 //BA.debugLineNum = 11665444;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
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
RDebugUtils.currentLine=11665448;
 //BA.debugLineNum = 11665448;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=11665449;
 //BA.debugLineNum = 11665449;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _addmotivosproveedorfijoevaluacion(b4j.docU.cevaluacionproveedores __ref,String _provsel,String _nombreprovsel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "addmotivosproveedorfijoevaluacion", false))
	 {Debug.delegate(ba, "addmotivosproveedorfijoevaluacion", new Object[] {_provsel,_nombreprovsel}); return;}
ResumableSub_AddMotivosProveedorFijoEvaluacion rsub = new ResumableSub_AddMotivosProveedorFijoEvaluacion(this,__ref,_provsel,_nombreprovsel);
rsub.resume(ba, null);
}
public static class ResumableSub_AddMotivosProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_AddMotivosProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,String _nombreprovsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._nombreprovsel = _nombreprovsel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
String _nombreprovsel;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _opcionsel = "";
anywheresoftware.b4a.objects.collections.Map _mdatalista = null;
String _descrmap = "";
int _idmotivosel = 0;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group41;
int index41;
int groupLen41;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Wait For(EvaluacionProveedoresListaMotivosProveed";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), __ref._evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel));
this.state = 49;
return;
case 49:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="If Accion=\"NOK\" Then Return";
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
this.state = 7;
;
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="If lstReg.Size=0 Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_lstreg.getSize()==0) { 
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
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="Dialog.Title=$\"Selecciona motivo de proveedor fij";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)(("Selecciona motivo de proveedor fijo a asignar al proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"."));
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="B4XListDlg.AllowMultiSelection=False";
_b4xlistdlg._allowmultiselection /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=11010068;
 //BA.debugLineNum = 11010068;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=11010069;
 //BA.debugLineNum = 11010069;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=11010070;
 //BA.debugLineNum = 11010070;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=11010072;
 //BA.debugLineNum = 11010072;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=11010073;
 //BA.debugLineNum = 11010073;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=11010077;
 //BA.debugLineNum = 11010077;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 13:
//for
this.state = 16;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group21 = _lstreg;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 50;
if (true) break;

case 50:
//C
this.state = 16;
if (index21 < groupLen21) {
this.state = 15;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 51:
//C
this.state = 50;
index21++;
if (true) break;

case 15:
//C
this.state = 51;
RDebugUtils.currentLine=11010078;
 //BA.debugLineNum = 11010078;BA.debugLine="lstOpciones.Add(mData.Get(\"DescripcionMotivoProv";
_lstopciones.Add(_mdata.Get((Object)("DescripcionMotivoProveedorFijoEvaluacion")));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=11010081;
 //BA.debugLineNum = 11010081;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=11010083;
 //BA.debugLineNum = 11010083;BA.debugLine="B4XListDlg.Resize(600dip, 400dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=11010085;
 //BA.debugLineNum = 11010085;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=11010105;
 //BA.debugLineNum = 11010105;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=11010106;
 //BA.debugLineNum = 11010106;BA.debugLine="If bOK.IsInitialized Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_bok.IsInitialized()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=11010108;
 //BA.debugLineNum = 11010108;BA.debugLine="bOK.Left=5dip";
_bok.setLeft(parent.__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=11010109;
 //BA.debugLineNum = 11010109;BA.debugLine="bOK.TextSize=18";
_bok.setTextSize(18);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=11010112;
 //BA.debugLineNum = 11010112;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=11010113;
 //BA.debugLineNum = 11010113;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_bcancel.IsInitialized()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=11010115;
 //BA.debugLineNum = 11010115;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=11010116;
 //BA.debugLineNum = 11010116;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=11010117;
 //BA.debugLineNum = 11010117;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=11010120;
 //BA.debugLineNum = 11010120;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), _rsub);
this.state = 52;
return;
case 52:
//C
this.state = 25;
_rint = (int) result[1];
;
RDebugUtils.currentLine=11010122;
 //BA.debugLineNum = 11010122;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 25:
//if
this.state = 30;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) return ;
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=11010149;
 //BA.debugLineNum = 11010149;BA.debugLine="Dim OpcionSel As String=B4XListDlg.SelectedItem";
_opcionsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=11010150;
 //BA.debugLineNum = 11010150;BA.debugLine="For Each mDataLista As Map In lstReg";
if (true) break;

case 31:
//for
this.state = 38;
_mdatalista = new anywheresoftware.b4a.objects.collections.Map();
group41 = _lstreg;
index41 = 0;
groupLen41 = group41.getSize();
this.state = 53;
if (true) break;

case 53:
//C
this.state = 38;
if (index41 < groupLen41) {
this.state = 33;
_mdatalista = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group41.Get(index41)));}
if (true) break;

case 54:
//C
this.state = 53;
index41++;
if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=11010151;
 //BA.debugLineNum = 11010151;BA.debugLine="Dim DescrMap As String=mDataLista.Get(\"Descripci";
_descrmap = BA.ObjectToString(_mdatalista.Get((Object)("DescripcionMotivoProveedorFijoEvaluacion")));
RDebugUtils.currentLine=11010152;
 //BA.debugLineNum = 11010152;BA.debugLine="If DescrMap=OpcionSel Then";
if (true) break;

case 34:
//if
this.state = 37;
if ((_descrmap).equals(_opcionsel)) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=11010153;
 //BA.debugLineNum = 11010153;BA.debugLine="Dim IDMotivoSel As Int=mDataLista.Get(\"IDMotivo";
_idmotivosel = (int)(BA.ObjectToNumber(_mdatalista.Get((Object)("IDMotivoProveedorFijoEvaluacion"))));
RDebugUtils.currentLine=11010154;
 //BA.debugLineNum = 11010154;BA.debugLine="Exit";
this.state = 38;
if (true) break;
 if (true) break;

case 37:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=11010158;
 //BA.debugLineNum = 11010158;BA.debugLine="Wait For(GrabarNuevoMotivoProveedorFijo(ProvSel,N";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), __ref._grabarnuevomotivoproveedorfijo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_nombreprovsel,_idmotivosel));
this.state = 55;
return;
case 55:
//C
this.state = 39;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11010159;
 //BA.debugLineNum = 11010159;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11010160;
 //BA.debugLineNum = 11010160;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 39:
//if
this.state = 44;
if ((_accion).equals("NOK")) { 
this.state = 41;
;}if (true) break;

case 41:
//C
this.state = 44;
if (true) return ;
if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=11010162;
 //BA.debugLineNum = 11010162;BA.debugLine="Wait For(ActualizarDatosProveedorFijoProveedor(Pr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "addmotivosproveedorfijoevaluacion"), __ref._actualizardatosproveedorfijoproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel));
this.state = 56;
return;
case 56:
//C
this.state = 45;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=11010163;
 //BA.debugLineNum = 11010163;BA.debugLine="If Not(Success) Then";
if (true) break;

case 45:
//if
this.state = 48;
if (parent.__c.Not(_success)) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=11010165;
 //BA.debugLineNum = 11010165;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=11010169;
 //BA.debugLineNum = 11010169;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor", new Object[] {_provsel}));}
ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor rsub = new ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor(this,__ref,_provsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando ti";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando tipos motivo proveedor fijo no asignados al proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"...")));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresLista";
_comando = "EvaluacionProveedoresListaMotivosProveedoresFijosNoAsignadosAProveedor";
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_provsel)},parent);
RDebugUtils.currentLine=11730960;
 //BA.debugLineNum = 11730960;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11730962;
 //BA.debugLineNum = 11730962;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=11730963;
 //BA.debugLineNum = 11730963;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11730964;
 //BA.debugLineNum = 11730964;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=11730970;
 //BA.debugLineNum = 11730970;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=11730971;
 //BA.debugLineNum = 11730971;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11730972;
 //BA.debugLineNum = 11730972;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El proveedo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El proveedor seleccionado ("+parent.__c.SmartStringFormatter("",(Object)(_provsel))+") tiene asignados todos los motivos de proveedor fijo existentes."),"Aviso");
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoreslistamotivosproveedoresfijosnoasignadosaproveedor"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=11730974;
 //BA.debugLineNum = 11730974;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11730975;
 //BA.debugLineNum = 11730975;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=11730977;
 //BA.debugLineNum = 11730977;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=11730978;
 //BA.debugLineNum = 11730978;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11730979;
 //BA.debugLineNum = 11730979;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=11730980;
 //BA.debugLineNum = 11730980;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
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
RDebugUtils.currentLine=11730984;
 //BA.debugLineNum = 11730984;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=11730985;
 //BA.debugLineNum = 11730985;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _grabarnuevomotivoproveedorfijo(b4j.docU.cevaluacionproveedores __ref,String _provsel,String _nombreprovsel,int _idmot) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "grabarnuevomotivoproveedorfijo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "grabarnuevomotivoproveedorfijo", new Object[] {_provsel,_nombreprovsel,_idmot}));}
ResumableSub_GrabarNuevoMotivoProveedorFijo rsub = new ResumableSub_GrabarNuevoMotivoProveedorFijo(this,__ref,_provsel,_nombreprovsel,_idmot);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GrabarNuevoMotivoProveedorFijo extends BA.ResumableSub {
public ResumableSub_GrabarNuevoMotivoProveedorFijo(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,String _nombreprovsel,int _idmot) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._nombreprovsel = _nombreprovsel;
this._idmot = _idmot;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
String _nombreprovsel;
int _idmot;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mrespuesta = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresNuevo";
_comando = "EvaluacionProveedoresNuevoMotivoProveedorFijoProveedor";
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(ProvS";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_provsel),(Object)(_nombreprovsel),(Object)(_idmot),(Object)(parent.__c.DateTime.getNow())},parent);
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "grabarnuevomotivoproveedorfijo"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "grabarnuevomotivoproveedorfijo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then  ' este caso";
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
RDebugUtils.currentLine=12058643;
 //BA.debugLineNum = 12058643;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=12058644;
 //BA.debugLineNum = 12058644;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=12058649;
 //BA.debugLineNum = 12058649;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=12058650;
 //BA.debugLineNum = 12058650;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
_mrespuesta = new anywheresoftware.b4a.objects.collections.Map();
_mrespuesta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=12058651;
 //BA.debugLineNum = 12058651;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
_sresp = BA.ObjectToString(_mrespuesta.GetValueAt((int) (0)));
RDebugUtils.currentLine=12058652;
 //BA.debugLineNum = 12058652;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=12058653;
 //BA.debugLineNum = 12058653;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP \"";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP "+_comando+"."+parent.__c.CRLF+parent.__c.CRLF+_sresp+parent.__c.CRLF+parent.__c.CRLF+"No ha sido posible grabar el motivo de proveedor fijo.","Error");
RDebugUtils.currentLine=12058654;
 //BA.debugLineNum = 12058654;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "grabarnuevomotivoproveedorfijo"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=12058655;
 //BA.debugLineNum = 12058655;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=12058656;
 //BA.debugLineNum = 12058656;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12058658;
 //BA.debugLineNum = 12058658;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=12058659;
 //BA.debugLineNum = 12058659;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
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
RDebugUtils.currentLine=12058664;
 //BA.debugLineNum = 12058664;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=12058665;
 //BA.debugLineNum = 12058665;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrarcalificacionproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "borrarcalificacionproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrarcalificacionproveedor", new Object[] {_provsel,_filasel}));}
ResumableSub_BorrarCalificacionProveedor rsub = new ResumableSub_BorrarCalificacionProveedor(this,__ref,_provsel,_filasel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarCalificacionProveedor extends BA.ResumableSub {
public ResumableSub_BorrarCalificacionProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _filasel;
String _calificacionactualprovsel = "";
Object _robj = null;
int _rint = 0;
String _nuevacalificacion = "";
long _datetimeactualizacion = 0L;
String _usuariocalificacion = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _rbool = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim CalificacionActualProvSel As String=jamTableV";
_calificacionactualprovsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Calificacion"));
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="If CalificacionActualProvSel=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_calificacionactualprovsel).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"El prove";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso",("El proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+" no tiene calificación.")));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿Borr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("¿Borrar los datos de calificación del proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = 11;
;
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="Dim NuevaCalificacion As String=\"\"";
_nuevacalificacion = "";
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="Dim DateTimeActualizacion As Long=0";
_datetimeactualizacion = (long) (0);
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="Dim UsuarioCalificacion As String=\"\"";
_usuariocalificacion = "";
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EvaluacionProveedoresActualizarCalificacionProveedor",new Object[]{(Object)(_provsel),(Object)(_datetimeactualizacion),(Object)(""),(Object)(_usuariocalificacion),(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion)});
RDebugUtils.currentLine=11403279;
 //BA.debugLineNum = 11403279;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=11403280;
 //BA.debugLineNum = 11403280;BA.debugLine="If rBool=False Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_rbool==parent.__c.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=11403281;
 //BA.debugLineNum = 11403281;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11403282;
 //BA.debugLineNum = 11403282;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible borrar la calificación del proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"."),"Error");
RDebugUtils.currentLine=11403283;
 //BA.debugLineNum = 11403283;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarcalificacionproveedor"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
RDebugUtils.currentLine=11403284;
 //BA.debugLineNum = 11403284;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=11403287;
 //BA.debugLineNum = 11403287;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=11403288;
 //BA.debugLineNum = 11403288;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=11403290;
 //BA.debugLineNum = 11403290;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filasel);
RDebugUtils.currentLine=11403292;
 //BA.debugLineNum = 11403292;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=11403294;
 //BA.debugLineNum = 11403294;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrarvalidacioncalificacionproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "borrarvalidacioncalificacionproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrarvalidacioncalificacionproveedor", new Object[] {_provsel,_filasel}));}
ResumableSub_BorrarValidacionCalificacionProveedor rsub = new ResumableSub_BorrarValidacionCalificacionProveedor(this,__ref,_provsel,_filasel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarValidacionCalificacionProveedor extends BA.ResumableSub {
public ResumableSub_BorrarValidacionCalificacionProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _filasel;
String _validacioncalificacionactualprovsel = "";
Object _robj = null;
int _rint = 0;
long _datetimeactualizacion = 0L;
String _usuariovalidacioncalificacion = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _rbool = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Dim ValidacionCalificacionActualProvSel As String";
_validacioncalificacionactualprovsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"ValidacionCalificacion"));
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="If ValidacionCalificacionActualProvSel=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_validacioncalificacionactualprovsel).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"El prove";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso",("El proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+" no tiene calificación validada.")));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿Borr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("¿Borrar los datos de validación de calificación del proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = 11;
;
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="Dim DateTimeActualizacion As Long=0";
_datetimeactualizacion = (long) (0);
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="Dim UsuarioValidacionCalificacion As String=\"\"";
_usuariovalidacioncalificacion = "";
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EvaluacionProveedoresActualizarValidacionCalificacionProveedor",new Object[]{(Object)(_datetimeactualizacion),(Object)(""),(Object)(_usuariovalidacioncalificacion),(Object)(_provsel)});
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 17;
return;
case 17:
//C
this.state = 11;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="If rBool=False Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_rbool==parent.__c.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=12320784;
 //BA.debugLineNum = 12320784;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible borrar la validación de la calificación del proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"."),"Error");
RDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "borrarvalidacioncalificacionproveedor"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
RDebugUtils.currentLine=12320787;
 //BA.debugLineNum = 12320787;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=12320790;
 //BA.debugLineNum = 12320790;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(""),(Object)(_usuariovalidacioncalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=12320791;
 //BA.debugLineNum = 12320791;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(""),(Object)(_usuariovalidacioncalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=12320793;
 //BA.debugLineNum = 12320793;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filasel);
RDebugUtils.currentLine=12320795;
 //BA.debugLineNum = 12320795;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=12320797;
 //BA.debugLineNum = 12320797;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnmenuevaluacionproveedores_click(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "btnmenuevaluacionproveedores_click", false))
	 {return ((String) Debug.delegate(ba, "btnmenuevaluacionproveedores_click", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub btnMenuEvaluacionProveedores_Click";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Drawer.LeftOpen=True";
__ref._drawer /*b4j.docU.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.True);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _calificarproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "calificarproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "calificarproveedor", new Object[] {_provsel,_filasel}));}
ResumableSub_CalificarProveedor rsub = new ResumableSub_CalificarProveedor(this,__ref,_provsel,_filasel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CalificarProveedor extends BA.ResumableSub {
public ResumableSub_CalificarProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _filasel;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _nuevacalificacion = "";
long _datetimeactualizacion = 0L;
String _usuariocalificacion = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _rbool = false;
Object _msa = null;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Dialog.Title=\"Selecciona Calificación\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Calificación");
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="Dim lstOpciones As List=Array As String(\"APTO\",\"N";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"APTO","NO APTO"});
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=11337747;
 //BA.debugLineNum = 11337747;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=11337749;
 //BA.debugLineNum = 11337749;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step15 = 1;
limit15 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 4;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 3;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=11337750;
 //BA.debugLineNum = 11337750;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=11337754;
 //BA.debugLineNum = 11337754;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=11337755;
 //BA.debugLineNum = 11337755;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_bcancel.IsInitialized()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=11337757;
 //BA.debugLineNum = 11337757;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=11337758;
 //BA.debugLineNum = 11337758;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=11337759;
 //BA.debugLineNum = 11337759;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=11337762;
 //BA.debugLineNum = 11337762;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "calificarproveedor"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=11337764;
 //BA.debugLineNum = 11337764;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 9:
//if
this.state = 14;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=11337766;
 //BA.debugLineNum = 11337766;BA.debugLine="Dim NuevaCalificacion As String=B4XListDlg.Select";
_nuevacalificacion = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=11337775;
 //BA.debugLineNum = 11337775;BA.debugLine="Dim DateTimeActualizacion As Long=DateTime.Now";
_datetimeactualizacion = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=11337776;
 //BA.debugLineNum = 11337776;BA.debugLine="Dim UsuarioCalificacion As String=Main.DatosUsua";
_usuariocalificacion = parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ;
RDebugUtils.currentLine=11337780;
 //BA.debugLineNum = 11337780;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EvaluacionProveedoresActualizarCalificacionProveedor",new Object[]{(Object)(_provsel),(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion),(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion)});
RDebugUtils.currentLine=11337782;
 //BA.debugLineNum = 11337782;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "calificarproveedor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 22;
return;
case 22:
//C
this.state = 15;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=11337783;
 //BA.debugLineNum = 11337783;BA.debugLine="If rBool=False Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rbool==parent.__c.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=11337784;
 //BA.debugLineNum = 11337784;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11337785;
 //BA.debugLineNum = 11337785;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible actualizar la calificación del proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"."),"Error");
RDebugUtils.currentLine=11337786;
 //BA.debugLineNum = 11337786;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "calificarproveedor"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 18;
;
RDebugUtils.currentLine=11337787;
 //BA.debugLineNum = 11337787;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=11337790;
 //BA.debugLineNum = 11337790;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=11337791;
 //BA.debugLineNum = 11337791;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaCalificacion=?, Calificacion=?, UsuarioCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevacalificacion),(Object)(_usuariocalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=11337793;
 //BA.debugLineNum = 11337793;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filasel);
RDebugUtils.currentLine=11337795;
 //BA.debugLineNum = 11337795;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=11337796;
 //BA.debugLineNum = 11337796;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistaproveedoresfijosevaluacion(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "cargalistaproveedoresfijosevaluacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistaproveedoresfijosevaluacion", null));}
ResumableSub_CargaListaProveedoresFijosEvaluacion rsub = new ResumableSub_CargaListaProveedoresFijosEvaluacion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaProveedoresFijosEvaluacion extends BA.ResumableSub {
public ResumableSub_CargaListaProveedoresFijosEvaluacion(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblEvaluacionProveedoresListaProveedoresFijos");
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresLista";
_comando = "EvaluacionProveedoresListaProveedoresFijos";
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "cargalistaproveedoresfijosevaluacion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "cargalistaproveedoresfijosevaluacion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="Accion=\"SinProveedoresFijos\"";
_accion = "SinProveedoresFijos";
RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=10747931;
 //BA.debugLineNum = 10747931;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=10747935;
 //BA.debugLineNum = 10747935;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=10747936;
 //BA.debugLineNum = 10747936;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=10747938;
 //BA.debugLineNum = 10747938;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblEvaluacionProveedoresListaProveedoresFijos",_lstreg);
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
RDebugUtils.currentLine=10747941;
 //BA.debugLineNum = 10747941;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=10747942;
 //BA.debugLineNum = 10747942;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _carganumeroincidenciasproveedorperiodo(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "carganumeroincidenciasproveedorperiodo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "carganumeroincidenciasproveedorperiodo", null));}
ResumableSub_CargaNumeroIncidenciasProveedorPeriodo rsub = new ResumableSub_CargaNumeroIncidenciasProveedorPeriodo(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaNumeroIncidenciasProveedorPeriodo extends BA.ResumableSub {
public ResumableSub_CargaNumeroIncidenciasProveedorPeriodo(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
b4j.example.dateutils._period _prd = null;
long _fechaactualmenos12meses = 0L;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblEvaluacionProveedoresNumeroIncidenciasPeriodo");
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Dim prd As Period";
_prd = new b4j.example.dateutils._period();
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="prd.Months=-12";
_prd.Months = (int) (-12);
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Dim FechaActualMenos12Meses As Long=DateUtils.Add";
_fechaactualmenos12meses = parent._dateutils._addperiod(parent.__c.DateTime.getNow(),_prd);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresNumer";
_comando = "EvaluacionProveedoresNumeroIncidenciasProveedorPeriodo";
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_fechaactualmenos12meses)},parent);
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "carganumeroincidenciasproveedorperiodo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "carganumeroincidenciasproveedorperiodo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=11206677;
 //BA.debugLineNum = 11206677;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=11206680;
 //BA.debugLineNum = 11206680;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=11206681;
 //BA.debugLineNum = 11206681;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11206682;
 //BA.debugLineNum = 11206682;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se han re";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se han registrado incidencias de proveedor en el periodo.","Aviso");
RDebugUtils.currentLine=11206683;
 //BA.debugLineNum = 11206683;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "carganumeroincidenciasproveedorperiodo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=11206684;
 //BA.debugLineNum = 11206684;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11206685;
 //BA.debugLineNum = 11206685;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=11206687;
 //BA.debugLineNum = 11206687;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=11206691;
 //BA.debugLineNum = 11206691;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11206692;
 //BA.debugLineNum = 11206692;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=11206694;
 //BA.debugLineNum = 11206694;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblEvaluacionProveedoresNumeroIncidenciasPeriodo",_lstreg);
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
RDebugUtils.currentLine=11206697;
 //BA.debugLineNum = 11206697;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=11206698;
 //BA.debugLineNum = 11206698;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cargatreeviewdrawer(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "cargatreeviewdrawer", false))
	 {return ((String) Debug.delegate(ba, "cargatreeviewdrawer", null));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imgtreeitemgo = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tisalir = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _texpandirtodomenu = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tcontraertodomenu = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tactualizardatos = null;
anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _tlistaproveedoresfijosevaluacion = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub CargaTreeViewDrawer";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="TreeViewDrawer.Root.Children.Clear";
__ref._treeviewdrawer /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Clear();
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="Dim imgTreeItemGo As Image=Main.fx.LoadImageSampl";
_imgtreeitemgo = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_imgtreeitemgo = _main._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(__c.File.getDirAssets(),"arrow-right16.png",16,16);
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="Dim img As Image=Utilidades.SetFontToBitmap(Chr(0";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_img = (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(_utilidades._setfonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(__c.Chr(((int)0xf6cf))),_utilidades._createb4xfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ("materialdesignicons-webfont.ttf",(float) (24),(float) (24)),(float) (24),((int)0xff00bfff)).getObject()));
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Dim tiSalir As TreeItem";
_tisalir = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="tiSalir.Initialize(\"tItem\",\"Salir\")";
_tisalir.Initialize(ba,"tItem","Salir");
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="tiSalir.Image=Utilidades.MaterialIconsToBitmap(Ch";
_tisalir.setImage((javafx.scene.image.Image)(_utilidades._materialiconstobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(__c.Chr(((int)0xe879))),(float) (24),((int)0xffb22222)).getObject()));
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="TreeViewDrawer.Root.Children.Add(tiSalir)";
__ref._treeviewdrawer /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_tisalir.getObject()));
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="Dim tExpandirTodoMenu As TreeItem";
_texpandirtodomenu = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="tExpandirTodoMenu.Initialize(\"tItem\",\"Expandir Me";
_texpandirtodomenu.Initialize(ba,"tItem","Expandir Menu");
RDebugUtils.currentLine=9961487;
 //BA.debugLineNum = 9961487;BA.debugLine="tExpandirTodoMenu.Image=Utilidades.SetFontToBitma";
_texpandirtodomenu.setImage((javafx.scene.image.Image)(_utilidades._setfonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(__c.Chr(((int)0xf616))),_utilidades._createb4xfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ("materialdesignicons-webfont.ttf",(float) (24),(float) (24)),(float) (24),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black).getObject()));
RDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="TreeViewDrawer.Root.Children.Add(tExpandirTodoMen";
__ref._treeviewdrawer /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_texpandirtodomenu.getObject()));
RDebugUtils.currentLine=9961491;
 //BA.debugLineNum = 9961491;BA.debugLine="Dim tContraerTodoMenu As TreeItem";
_tcontraertodomenu = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=9961492;
 //BA.debugLineNum = 9961492;BA.debugLine="tContraerTodoMenu.Initialize(\"tItem\",\"Contraer Me";
_tcontraertodomenu.Initialize(ba,"tItem","Contraer Menu");
RDebugUtils.currentLine=9961493;
 //BA.debugLineNum = 9961493;BA.debugLine="tContraerTodoMenu.Image=Utilidades.SetFontToBitma";
_tcontraertodomenu.setImage((javafx.scene.image.Image)(_utilidades._setfonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(__c.Chr(((int)0xf615))),_utilidades._createb4xfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ("materialdesignicons-webfont.ttf",(float) (24),(float) (24)),(float) (24),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black).getObject()));
RDebugUtils.currentLine=9961494;
 //BA.debugLineNum = 9961494;BA.debugLine="TreeViewDrawer.Root.Children.Add(tContraerTodoMen";
__ref._treeviewdrawer /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_tcontraertodomenu.getObject()));
RDebugUtils.currentLine=9961496;
 //BA.debugLineNum = 9961496;BA.debugLine="Dim tActualizarDatos As TreeItem";
_tactualizardatos = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=9961497;
 //BA.debugLineNum = 9961497;BA.debugLine="tActualizarDatos.Initialize(\"tItem\",\"Actualizar D";
_tactualizardatos.Initialize(ba,"tItem","Actualizar Datos");
RDebugUtils.currentLine=9961498;
 //BA.debugLineNum = 9961498;BA.debugLine="tActualizarDatos.Image=Utilidades.SetFontToBitmap";
_tactualizardatos.setImage((javafx.scene.image.Image)(_utilidades._setfonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(__c.Chr(((int)0xf450))),_utilidades._createb4xfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ("materialdesignicons-webfont.ttf",(float) (24),(float) (24)),(float) (24),((int)0xff00bfff)).getObject()));
RDebugUtils.currentLine=9961499;
 //BA.debugLineNum = 9961499;BA.debugLine="TreeViewDrawer.Root.Children.Add(tActualizarDatos";
__ref._treeviewdrawer /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_tactualizardatos.getObject()));
RDebugUtils.currentLine=9961501;
 //BA.debugLineNum = 9961501;BA.debugLine="Dim tListaProveedoresFijosEvaluacion As TreeItem";
_tlistaproveedoresfijosevaluacion = new anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper();
RDebugUtils.currentLine=9961502;
 //BA.debugLineNum = 9961502;BA.debugLine="tListaProveedoresFijosEvaluacion.Initialize(\"tIte";
_tlistaproveedoresfijosevaluacion.Initialize(ba,"tItem","Lista Proveedores Fijos Evaluación");
RDebugUtils.currentLine=9961503;
 //BA.debugLineNum = 9961503;BA.debugLine="tListaProveedoresFijosEvaluacion.Image=Utilidades";
_tlistaproveedoresfijosevaluacion.setImage((javafx.scene.image.Image)(_utilidades._setfonttobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (BA.ObjectToString(__c.Chr(((int)0xf27b))),_utilidades._createb4xfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ("materialdesignicons-webfont.ttf",(float) (24),(float) (24)),(float) (24),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black).getObject()));
RDebugUtils.currentLine=9961504;
 //BA.debugLineNum = 9961504;BA.debugLine="TreeViewDrawer.Root.Children.Add(tListaProveedore";
__ref._treeviewdrawer /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_tlistaproveedoresfijosevaluacion.getObject()));
RDebugUtils.currentLine=9961508;
 //BA.debugLineNum = 9961508;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="Private Drawer As B4XDrawer";
_drawer = new b4j.docU.b4xdrawer();
RDebugUtils.currentLine=9437195;
 //BA.debugLineNum = 9437195;BA.debugLine="Private jamTableViewEvaluacionProveedores As jamT";
_jamtableviewevaluacionproveedores = new b4j.docU.jamtableview();
RDebugUtils.currentLine=9437196;
 //BA.debugLineNum = 9437196;BA.debugLine="Private pnlFondoEvaluacionProveedores As B4XView";
_pnlfondoevaluacionproveedores = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="Private lblIconCerrarDrawer As B4XView";
_lbliconcerrardrawer = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="Private lblTextoCerrarDrawer As B4XView";
_lbltextocerrardrawer = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437199;
 //BA.debugLineNum = 9437199;BA.debugLine="Private pnlTopDrawerLeft As B4XView";
_pnltopdrawerleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="Private TreeViewDrawer As TreeView";
_treeviewdrawer = new anywheresoftware.b4j.objects.TreeViewWrapper();
RDebugUtils.currentLine=9437202;
 //BA.debugLineNum = 9437202;BA.debugLine="Private BackgroundProveedoresFijosEvaluacion As B";
_backgroundproveedoresfijosevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437203;
 //BA.debugLineNum = 9437203;BA.debugLine="Private BaseProveedoresFijosEvaluacion As B4XView";
_baseproveedoresfijosevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437204;
 //BA.debugLineNum = 9437204;BA.debugLine="Private jamTableViewProveedoresFijosEvaluacionPro";
_jamtableviewproveedoresfijosevaluacionproveedores = new b4j.docU.jamtableview();
RDebugUtils.currentLine=9437205;
 //BA.debugLineNum = 9437205;BA.debugLine="Private btnAddMotivoFijarEvaluacionProveedor As B";
_btnaddmotivofijarevaluacionproveedor = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437209;
 //BA.debugLineNum = 9437209;BA.debugLine="Private lblTitleMotivosFijarEvaluacionProveedor A";
_lbltitlemotivosfijarevaluacionproveedor = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437210;
 //BA.debugLineNum = 9437210;BA.debugLine="Private lblTitleProveedorFijoEvaluacion As B4XVie";
_lbltitleproveedorfijoevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437211;
 //BA.debugLineNum = 9437211;BA.debugLine="Private pnlFondoProveedorFijoEvaluacion As B4XVie";
_pnlfondoproveedorfijoevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437212;
 //BA.debugLineNum = 9437212;BA.debugLine="Private txtNombreProveedorFijoEvaluacion As B4XVi";
_txtnombreproveedorfijoevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437213;
 //BA.debugLineNum = 9437213;BA.debugLine="Private txtProveedorFijoEvaluacion As B4XView";
_txtproveedorfijoevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437214;
 //BA.debugLineNum = 9437214;BA.debugLine="Private jamTableViewMotivosFijarEvaluacionProveed";
_jamtableviewmotivosfijarevaluacionproveedor = new b4j.docU.jamtableview();
RDebugUtils.currentLine=9437215;
 //BA.debugLineNum = 9437215;BA.debugLine="Private lblSalirEvaluacionProveedoresConfigurarPr";
_lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9437217;
 //BA.debugLineNum = 9437217;BA.debugLine="Private ProveedorEdicion As String";
_proveedoredicion = "";
RDebugUtils.currentLine=9437218;
 //BA.debugLineNum = 9437218;BA.debugLine="Private FilaJamTVEvalProveedorEdicion As Int";
_filajamtvevalproveedoredicion = 0;
RDebugUtils.currentLine=9437220;
 //BA.debugLineNum = 9437220;BA.debugLine="Private PermisoCalificarProveedores As Boolean";
_permisocalificarproveedores = false;
RDebugUtils.currentLine=9437221;
 //BA.debugLineNum = 9437221;BA.debugLine="Private PermisoValidarCalificacionProveedores As";
_permisovalidarcalificacionproveedores = false;
RDebugUtils.currentLine=9437222;
 //BA.debugLineNum = 9437222;BA.debugLine="End Sub";
return "";
}
public void  _configurarproveedorfijoevaluacion(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filatvprovsel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "configurarproveedorfijoevaluacion", false))
	 {Debug.delegate(ba, "configurarproveedorfijoevaluacion", new Object[] {_provsel,_filatvprovsel}); return;}
ResumableSub_ConfigurarProveedorFijoEvaluacion rsub = new ResumableSub_ConfigurarProveedorFijoEvaluacion(this,__ref,_provsel,_filatvprovsel);
rsub.resume(ba, null);
}
public static class ResumableSub_ConfigurarProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_ConfigurarProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filatvprovsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filatvprovsel = _filatvprovsel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _filatvprovsel;
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="For Each xNode As B4XView In frm.RootPane";
if (true) break;

case 1:
//for
this.state = 12;
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
group1 = __ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane();
index1 = 0;
groupLen1 = group1.getSize();
this.state = 21;
if (true) break;

case 21:
//C
this.state = 12;
if (index1 < groupLen1) {
this.state = 3;
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));}
if (true) break;

case 22:
//C
this.state = 21;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="If xNode Is Pane Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_xnode.getObjectOrNull() instanceof javafx.scene.layout.Pane) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="If xNode.Tag=\"BackgroundDatosNuevoComponente\" T";
if (true) break;

case 7:
//if
this.state = 10;
if ((_xnode.getTag()).equals((Object)("BackgroundDatosNuevoComponente"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="xNode.RemoveViewFromParent";
_xnode.RemoveViewFromParent();
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Exit";
this.state = 12;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="BackgroundProveedoresFijosEvaluacion= xui.CreateP";
__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"BackgroundProveedoresFijosEvaluacion");
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="BackgroundProveedoresFijosEvaluacion.Tag = \"Backg";
__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("BackgroundProveedoresFijosEvaluacion"));
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="BackgroundProveedoresFijosEvaluacion.Color=0xaa00";
__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="frm.RootPane.AddNode(BackgroundProveedoresFijosEv";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().AddNode((javafx.scene.Node)(__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth(),__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight());
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="BaseProveedoresFijosEvaluacion=xui.CreatePanel(\"p";
__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlBase");
RDebugUtils.currentLine=11534352;
 //BA.debugLineNum = 11534352;BA.debugLine="BaseProveedoresFijosEvaluacion.SetLayoutAnimated(";
__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (700)),parent.__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="BaseProveedoresFijosEvaluacion.LoadLayout(\"scrEva";
__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrEvaluacionProveedoresConfigurarProveedorFijoEvaluacion",ba);
RDebugUtils.currentLine=11534355;
 //BA.debugLineNum = 11534355;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"),(int) (0));
this.state = 23;
return;
case 23:
//C
this.state = 13;
;
RDebugUtils.currentLine=11534357;
 //BA.debugLineNum = 11534357;BA.debugLine="BackgroundProveedoresFijosEvaluacion.AddView(Base";
__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),(__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._baseproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=11534360;
 //BA.debugLineNum = 11534360;BA.debugLine="Utilidades.AddImageToLabel(lblSalirEvaluacionProv";
parent._utilidades._addimagetolabel /*String*/ ((anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())),parent.__c.File.getDirAssets(),"twotone_exit_black_24dp.png");
RDebugUtils.currentLine=11534362;
 //BA.debugLineNum = 11534362;BA.debugLine="txtProveedorFijoEvaluacion.Text=ProvSel";
__ref._txtproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_provsel);
RDebugUtils.currentLine=11534363;
 //BA.debugLineNum = 11534363;BA.debugLine="txtNombreProveedorFijoEvaluacion.Text=mSQL.ExecQu";
__ref._txtnombreproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NombreProveedor from tblEvaluacionProveedoresDatosEvaluacionActual where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_provsel})));
RDebugUtils.currentLine=11534365;
 //BA.debugLineNum = 11534365;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.Estad";
__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._menubartabla /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=11534367;
 //BA.debugLineNum = 11534367;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddMe";
__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Añadir motivo proveedor fijo evaluación","AddMotivoProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xf196))),__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=11534368;
 //BA.debugLineNum = 11534368;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddMe";
__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Eliminar motivo proveedor fijo evaluación","EliminarMotivoProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xf014))),__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=11534369;
 //BA.debugLineNum = 11534369;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddCo";
__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=11534370;
 //BA.debugLineNum = 11534370;BA.debugLine="jamTableViewMotivosFijarEvaluacionProveedor.AddCo";
__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Eliminar motivo proveedor fijo evaluación","EliminarMotivoProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xf014))));
RDebugUtils.currentLine=11534372;
 //BA.debugLineNum = 11534372;BA.debugLine="Dim rSub As ResumableSub=jamTableViewMotivosFijar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaEvaluacionProveedoresMotivosProveedorFijo.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=11534373;
 //BA.debugLineNum = 11534373;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"), _rsub);
this.state = 24;
return;
case 24:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11534374;
 //BA.debugLineNum = 11534374;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("811534374",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=11534375;
 //BA.debugLineNum = 11534375;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=11534376;
 //BA.debugLineNum = 11534376;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=11534377;
 //BA.debugLineNum = 11534377;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
RDebugUtils.currentLine=11534378;
 //BA.debugLineNum = 11534378;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=11534379;
 //BA.debugLineNum = 11534379;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=11534382;
 //BA.debugLineNum = 11534382;BA.debugLine="Wait For(ActualizarDatosProveedorFijoProveedor(Pr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "configurarproveedorfijoevaluacion"), __ref._actualizardatosproveedorfijoproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel));
this.state = 26;
return;
case 26:
//C
this.state = 17;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=11534383;
 //BA.debugLineNum = 11534383;BA.debugLine="If Not(Success) Then";
if (true) break;

case 17:
//if
this.state = 20;
if (parent.__c.Not(_success)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=11534384;
 //BA.debugLineNum = 11534384;BA.debugLine="SalirProveedorFijoEvaluacion";
__ref._salirproveedorfijoevaluacion /*void*/ (null);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=11534386;
 //BA.debugLineNum = 11534386;BA.debugLine="FilaJamTVEvalProveedorEdicion=FilaTVProvSel";
__ref._filajamtvevalproveedoredicion /*int*/  = _filatvprovsel;
RDebugUtils.currentLine=11534387;
 //BA.debugLineNum = 11534387;BA.debugLine="ProveedorEdicion=ProvSel";
__ref._proveedoredicion /*String*/  = _provsel;
RDebugUtils.currentLine=11534388;
 //BA.debugLineNum = 11534388;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _salirproveedorfijoevaluacion(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "salirproveedorfijoevaluacion", false))
	 {Debug.delegate(ba, "salirproveedorfijoevaluacion", null); return;}
ResumableSub_SalirProveedorFijoEvaluacion rsub = new ResumableSub_SalirProveedorFijoEvaluacion(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SalirProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_SalirProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
int _rint = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdataprov = null;
boolean _proveedorfijoevaluacion = false;
String _calificacionprovisional = "";
anywheresoftware.b4a.BA.IterableList group5;
int index5;
int groupLen5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="If jamTableViewMotivosFijarEvaluacionProveedor.Nu";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._getnumerototalregistros /*int*/ (null)==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"El p";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "salirproveedorfijoevaluacion"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("El proveedor "+parent.__c.SmartStringFormatter("",(Object)(__ref._txtproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()))+" no tiene asignado ningún motivo de proveedor fijo, por lo que no es considerado como proveedor fijo.\n"+"Continuar?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
 if (true) break;
;
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="For Each xNode As B4XView In BackgroundProveedore";

case 10:
//for
this.state = 13;
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
group5 = __ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index5 = 0;
groupLen5 = group5.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index5 < groupLen5) {
this.state = 12;
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));}
if (true) break;

case 20:
//C
this.state = 19;
index5++;
if (true) break;

case 12:
//C
this.state = 20;
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="xNode.RemoveViewFromParent";
_xnode.RemoveViewFromParent();
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="BackgroundProveedoresFijosEvaluacion.RemoveViewFr";
__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="Wait For(EvaluacionProveedoresDatosEvaluacionActu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "salirproveedorfijoevaluacion"), __ref._evaluacionproveedoresdatosevaluacionactualproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._proveedoredicion /*String*/ ));
this.state = 21;
return;
case 21:
//C
this.state = 14;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_accion).equals("NOK")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11468816;
 //BA.debugLineNum = 11468816;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="Dim mDataProv As Map=lstReg.Get(0)";
_mdataprov = new anywheresoftware.b4a.objects.collections.Map();
_mdataprov = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="Dim ProveedorFijoEvaluacion As Boolean=mDataProv.";
_proveedorfijoevaluacion = BA.ObjectToBoolean(_mdataprov.Get((Object)("ProveedorFijoEvaluacion")));
RDebugUtils.currentLine=11468822;
 //BA.debugLineNum = 11468822;BA.debugLine="Dim CalificacionProvisional As String=mDataProv.G";
_calificacionprovisional = BA.ObjectToString(_mdataprov.Get((Object)("CalificacionProvisional")));
RDebugUtils.currentLine=11468824;
 //BA.debugLineNum = 11468824;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set ProveedorFijoEvaluacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{((_proveedorfijoevaluacion) ? ((Object)(1)) : ((Object)(0))),(Object)(__ref._proveedoredicion /*String*/ )}));
RDebugUtils.currentLine=11468825;
 //BA.debugLineNum = 11468825;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set ProveedorFijoEvaluacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{((_proveedorfijoevaluacion) ? ((Object)(1)) : ((Object)(0))),(Object)(__ref._proveedoredicion /*String*/ )}));
RDebugUtils.currentLine=11468826;
 //BA.debugLineNum = 11468826;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set CalificacionProvisional=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_calificacionprovisional),(Object)(__ref._proveedoredicion /*String*/ )}));
RDebugUtils.currentLine=11468827;
 //BA.debugLineNum = 11468827;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set CalificacionProvisional=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_calificacionprovisional),(Object)(__ref._proveedoredicion /*String*/ )}));
RDebugUtils.currentLine=11468828;
 //BA.debugLineNum = 11468828;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,__ref._filajamtvevalproveedoredicion /*int*/ );
RDebugUtils.currentLine=11468830;
 //BA.debugLineNum = 11468830;BA.debugLine="FilaJamTVEvalProveedorEdicion=-1";
__ref._filajamtvevalproveedoredicion /*int*/  = (int) (-1);
RDebugUtils.currentLine=11468831;
 //BA.debugLineNum = 11468831;BA.debugLine="ProveedorEdicion=\"\"";
__ref._proveedoredicion /*String*/  = "";
RDebugUtils.currentLine=11468833;
 //BA.debugLineNum = 11468833;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11468835;
 //BA.debugLineNum = 11468835;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _creaciontablassqlite(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblEvaluacionProveedoresDatosEvaluacionActual");
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresDatosEvaluacionActual] ([Proveedor] TEXT, [NombreProveedor] TEXT, [Bloqueado] INTEGER\n"+"	, [GrupoContableProveedor] TEXT, [ImporteNetoFacturacion12Meses] INTEGER, [NumeroIncidencias12Meses] INTEGER, [ProveedorFijoEvaluacion] INTEGER, [CalificacionProvisional] TEXT, [FechaActualizacionDatosLong] INTEGER\n"+"	, [FechaCalificacion] INTEGER, [Calificacion] TEXT, [UsuarioCalificacion] TEXT,[FechaValidacionCalificacion] INTEGER, [ValidacionCalificacion] TEXT, [UsuarioValidacionCalificacion] TEXT)");
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblEvaluacionProveedoresDatosNAVPeriodo");
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblEvaluacionProveedoresDatosNAVPeriodo] ([Proveedor] TEXT, [NombreProveedor] TEXT, [Bloqueado] INTEGER, [GrupoContableProveedor] TEXT, [TotalImporteNetoFacturacion] REAL)");
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblEvaluacionProveedoresListaProveedoresFijos");
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresListaProveedoresFijos] ([IDLinea] INTEGER\n"+"	, [ProveedorFijoEvaluacionProveedores] TEXT, [NombreProveedorFijoEvaluacionProveedoresaluacionProveedores] TEXT)");
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblEvaluacionProveedoresNumeroIncidenciasPeriodo");
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblEvaluacionProveedoresNumeroIncidenciasPeriodo] ([Proveedor] TEXT, [NumeroIncidenciasPeriodo] INTEGER)");
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblEvalua";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblEvaluacionProveedoresSeleccionProveedoresFijos");
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblEvaluacionProveedoresSeleccionProveedoresFijos] ([Proveedor] TEXT, [NombreProveedor] TEXT\n"+"	, [Bloqueado] INTEGER, [GrupoContableProveedor] TEXT, [TotalImporteNetoFacturacion] REAL, [ProveedorFijo] INTEGER)");
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="End Sub";
return "";
}
public void  _eliminarmotivoproveedorfijoevaluacion(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _idmotprovfijosel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "eliminarmotivoproveedorfijoevaluacion", false))
	 {Debug.delegate(ba, "eliminarmotivoproveedorfijoevaluacion", new Object[] {_provsel,_idmotprovfijosel}); return;}
ResumableSub_EliminarMotivoProveedorFijoEvaluacion rsub = new ResumableSub_EliminarMotivoProveedorFijoEvaluacion(this,__ref,_provsel,_idmotprovfijosel);
rsub.resume(ba, null);
}
public static class ResumableSub_EliminarMotivoProveedorFijoEvaluacion extends BA.ResumableSub {
public ResumableSub_EliminarMotivoProveedorFijoEvaluacion(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _idmotprovfijosel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._idmotprovfijosel = _idmotprovfijosel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _idmotprovfijosel;
int _rint = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿Elim";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "eliminarmotivoproveedorfijoevaluacion"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("¿Eliminar el motivo de proveedor fijo seleccionado?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=11075602;
 //BA.debugLineNum = 11075602;BA.debugLine="Wait For(GrabarEliminarMotivoProveedorFijo(ProvSe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "eliminarmotivoproveedorfijoevaluacion"), __ref._grabareliminarmotivoproveedorfijo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_idmotprovfijosel));
this.state = 18;
return;
case 18:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11075603;
 //BA.debugLineNum = 11075603;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=11075604;
 //BA.debugLineNum = 11075604;BA.debugLine="If Accion=\"NOK\" Then Return";
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
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="Wait For(ActualizarDatosProveedorFijoProveedor(Pr";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "eliminarmotivoproveedorfijoevaluacion"), __ref._actualizardatosproveedorfijoproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=11075607;
 //BA.debugLineNum = 11075607;BA.debugLine="If Not(Success) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent.__c.Not(_success)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=11075609;
 //BA.debugLineNum = 11075609;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _grabareliminarmotivoproveedorfijo(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _idmot) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "grabareliminarmotivoproveedorfijo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "grabareliminarmotivoproveedorfijo", new Object[] {_provsel,_idmot}));}
ResumableSub_GrabarEliminarMotivoProveedorFijo rsub = new ResumableSub_GrabarEliminarMotivoProveedorFijo(this,__ref,_provsel,_idmot);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GrabarEliminarMotivoProveedorFijo extends BA.ResumableSub {
public ResumableSub_GrabarEliminarMotivoProveedorFijo(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _idmot) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._idmot = _idmot;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _idmot;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mrespuesta = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresElimi";
_comando = "EvaluacionProveedoresEliminarMotivoProveedorFijoProveedor";
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(ProvS";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_provsel),(Object)(_idmot),(Object)(parent.__c.DateTime.getNow())},parent);
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "grabareliminarmotivoproveedorfijo"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=12124172;
 //BA.debugLineNum = 12124172;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=12124173;
 //BA.debugLineNum = 12124173;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "grabareliminarmotivoproveedorfijo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=12124174;
 //BA.debugLineNum = 12124174;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12124175;
 //BA.debugLineNum = 12124175;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=12124178;
 //BA.debugLineNum = 12124178;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then  ' este caso";
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
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=12124180;
 //BA.debugLineNum = 12124180;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=12124185;
 //BA.debugLineNum = 12124185;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=12124186;
 //BA.debugLineNum = 12124186;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
_mrespuesta = new anywheresoftware.b4a.objects.collections.Map();
_mrespuesta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=12124187;
 //BA.debugLineNum = 12124187;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
_sresp = BA.ObjectToString(_mrespuesta.GetValueAt((int) (0)));
RDebugUtils.currentLine=12124188;
 //BA.debugLineNum = 12124188;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=12124189;
 //BA.debugLineNum = 12124189;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP \"";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP "+_comando+"."+parent.__c.CRLF+parent.__c.CRLF+_sresp+parent.__c.CRLF+parent.__c.CRLF+"No ha sido posible eliminar el motivo de proveedor fijo.","Error");
RDebugUtils.currentLine=12124190;
 //BA.debugLineNum = 12124190;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "grabareliminarmotivoproveedorfijo"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=12124191;
 //BA.debugLineNum = 12124191;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=12124192;
 //BA.debugLineNum = 12124192;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12124194;
 //BA.debugLineNum = 12124194;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=12124195;
 //BA.debugLineNum = 12124195;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
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
RDebugUtils.currentLine=12124200;
 //BA.debugLineNum = 12124200;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=12124201;
 //BA.debugLineNum = 12124201;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _evaluacionproveedoresdatosevaluacionactual(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "evaluacionproveedoresdatosevaluacionactual", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "evaluacionproveedoresdatosevaluacionactual", null));}
ResumableSub_EvaluacionProveedoresDatosEvaluacionActual rsub = new ResumableSub_EvaluacionProveedoresDatosEvaluacionActual(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EvaluacionProveedoresDatosEvaluacionActual extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresDatosEvaluacionActual(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos evaluacion proveedores..."));
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblEvaluacionProveedoresDatosEvaluacionActual");
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresDatos";
_comando = "EvaluacionProveedoresDatosEvaluacionActual";
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=11272210;
 //BA.debugLineNum = 11272210;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=11272216;
 //BA.debugLineNum = 11272216;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de evaluación de proveedores.","Aviso");
RDebugUtils.currentLine=11272217;
 //BA.debugLineNum = 11272217;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactual"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11272219;
 //BA.debugLineNum = 11272219;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=11272221;
 //BA.debugLineNum = 11272221;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=11272225;
 //BA.debugLineNum = 11272225;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=11272226;
 //BA.debugLineNum = 11272226;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=11272228;
 //BA.debugLineNum = 11272228;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblEvaluacionProveedoresDatosEvaluacionActual",_lstreg);
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
RDebugUtils.currentLine=11272231;
 //BA.debugLineNum = 11272231;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=11272232;
 //BA.debugLineNum = 11272232;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _evaluacionproveedoresdatosevaluacionactualproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "evaluacionproveedoresdatosevaluacionactualproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "evaluacionproveedoresdatosevaluacionactualproveedor", new Object[] {_provsel}));}
ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor rsub = new ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor(this,__ref,_provsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor extends BA.ResumableSub {
public ResumableSub_EvaluacionProveedoresDatosEvaluacionActualProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando da";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando datos proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"...")));
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=12189707;
 //BA.debugLineNum = 12189707;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresDatos";
_comando = "EvaluacionProveedoresDatosEvaluacionActualProveedor";
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_provsel)},parent);
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactualproveedor"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12189714;
 //BA.debugLineNum = 12189714;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=12189715;
 //BA.debugLineNum = 12189715;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactualproveedor"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=12189718;
 //BA.debugLineNum = 12189718;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=12189719;
 //BA.debugLineNum = 12189719;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=12189722;
 //BA.debugLineNum = 12189722;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=12189723;
 //BA.debugLineNum = 12189723;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12189724;
 //BA.debugLineNum = 12189724;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El proveedo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El proveedor seleccionado ("+parent.__c.SmartStringFormatter("",(Object)(_provsel))+") no tiene datos asignados."),"Aviso");
RDebugUtils.currentLine=12189725;
 //BA.debugLineNum = 12189725;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "evaluacionproveedoresdatosevaluacionactualproveedor"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=12189726;
 //BA.debugLineNum = 12189726;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=12189727;
 //BA.debugLineNum = 12189727;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=12189729;
 //BA.debugLineNum = 12189729;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=12189730;
 //BA.debugLineNum = 12189730;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=12189731;
 //BA.debugLineNum = 12189731;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=12189732;
 //BA.debugLineNum = 12189732;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
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
RDebugUtils.currentLine=12189736;
 //BA.debugLineNum = 12189736;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=12189737;
 //BA.debugLineNum = 12189737;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.Form  _getform(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "getform", false))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getform", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub getForm As Form";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Return frm";
if (true) return __ref._frm /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return null;
}
public void  _inicio(b4j.docU.cevaluacionproveedores __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {Debug.delegate(ba, "inicio", null); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _sres = "";
Object _msa = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioObje";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"CalificacionProveedores"));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_sres = (String) result[1];
;
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="Select Case sRes";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query PermisosAplicacion.","Error");
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 12;
;
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="PermisoCalificarProveedores=False";
__ref._permisocalificarproveedores /*boolean*/  = parent.__c.False;
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 12;
;
RDebugUtils.currentLine=9830414;
 //BA.debugLineNum = 9830414;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="PermisoCalificarProveedores=False";
__ref._permisocalificarproveedores /*boolean*/  = parent.__c.False;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="PermisoCalificarProveedores=True";
__ref._permisocalificarproveedores /*boolean*/  = parent.__c.True;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=9830422;
 //BA.debugLineNum = 9830422;BA.debugLine="Wait For(cmPermisos.PermisosAplicacionUsuarioObje";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), parent._cmpermisos._permisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"ValidarCalificacionProveedores"));
this.state = 28;
return;
case 28:
//C
this.state = 13;
_sres = (String) result[1];
;
RDebugUtils.currentLine=9830423;
 //BA.debugLineNum = 9830423;BA.debugLine="Select Case sRes";
if (true) break;

case 13:
//select
this.state = 24;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
default: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 24;
RDebugUtils.currentLine=9830425;
 //BA.debugLineNum = 9830425;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query PermisosAplicacion.","Error");
RDebugUtils.currentLine=9830426;
 //BA.debugLineNum = 9830426;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 24;
;
RDebugUtils.currentLine=9830427;
 //BA.debugLineNum = 9830427;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=9830428;
 //BA.debugLineNum = 9830428;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 24;
RDebugUtils.currentLine=9830430;
 //BA.debugLineNum = 9830430;BA.debugLine="PermisoValidarCalificacionProveedores=False";
__ref._permisovalidarcalificacionproveedores /*boolean*/  = parent.__c.False;
 if (true) break;

case 19:
//C
this.state = 24;
RDebugUtils.currentLine=9830432;
 //BA.debugLineNum = 9830432;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=9830433;
 //BA.debugLineNum = 9830433;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 24;
;
RDebugUtils.currentLine=9830434;
 //BA.debugLineNum = 9830434;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=9830435;
 //BA.debugLineNum = 9830435;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=9830437;
 //BA.debugLineNum = 9830437;BA.debugLine="PermisoValidarCalificacionProveedores=False";
__ref._permisovalidarcalificacionproveedores /*boolean*/  = parent.__c.False;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=9830439;
 //BA.debugLineNum = 9830439;BA.debugLine="PermisoValidarCalificacionProveedores=True";
__ref._permisovalidarcalificacionproveedores /*boolean*/  = parent.__c.True;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=9830442;
 //BA.debugLineNum = 9830442;BA.debugLine="wait for (RefrescarDatosActualesEvaluacion) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "inicio"), __ref._refrescardatosactualesevaluacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 31;
return;
case 31:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=9830443;
 //BA.debugLineNum = 9830443;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=9830444;
 //BA.debugLineNum = 9830444;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub SalirModulo";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="End Sub";
return "";
}
public String  _jamtableviewevaluacionproveedores_accionsalirjamtableview(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "jamtableviewevaluacionproveedores_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewevaluacionproveedores_accionsalirjamtableview", null));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub jamTableViewEvaluacionProveedores_AccionSalirJ";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="End Sub";
return "";
}
public String  _jamtableviewevaluacionproveedores_contextmenuitem_action(b4j.docU.cevaluacionproveedores __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "jamtableviewevaluacionproveedores_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewevaluacionproveedores_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _filasel = 0;
String _provsel = "";
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub jamTableViewEvaluacionProveedores_ContextMenuI";
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"CalificarProveedor","BorrarCalificacionProveedor","ValidarCalificacionProveedor","BorrarValidacionCalificacionProveedor","ConfigurarProveedorFijoEvaluacion")) {
case 0: {
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="CalificarProveedor(ProvSel,FilaSel)";
__ref._calificarproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 break; }
case 1: {
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="BorrarCalificacionProveedor(ProvSel,FilaSel)";
__ref._borrarcalificacionproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 break; }
case 2: {
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="ValidarCalificacionProveedor(ProvSel,FilaSel)";
__ref._validarcalificacionproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 break; }
case 3: {
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10616852;
 //BA.debugLineNum = 10616852;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10616853;
 //BA.debugLineNum = 10616853;BA.debugLine="BorrarValidacionCalificacionProveedor(ProvSel,F";
__ref._borrarvalidacioncalificacionproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 break; }
case 4: {
RDebugUtils.currentLine=10616856;
 //BA.debugLineNum = 10616856;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10616857;
 //BA.debugLineNum = 10616857;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10616858;
 //BA.debugLineNum = 10616858;BA.debugLine="ConfigurarProveedorFijoEvaluacion(ProvSel,FilaS";
__ref._configurarproveedorfijoevaluacion /*void*/ (null,_provsel,_filasel);
 break; }
}
;
RDebugUtils.currentLine=10616860;
 //BA.debugLineNum = 10616860;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _validarcalificacionproveedor(b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "validarcalificacionproveedor", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "validarcalificacionproveedor", new Object[] {_provsel,_filasel}));}
ResumableSub_ValidarCalificacionProveedor rsub = new ResumableSub_ValidarCalificacionProveedor(this,__ref,_provsel,_filasel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ValidarCalificacionProveedor extends BA.ResumableSub {
public ResumableSub_ValidarCalificacionProveedor(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _provsel,int _filasel) {
this.parent = parent;
this.__ref = __ref;
this._provsel = _provsel;
this._filasel = _filasel;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _provsel;
int _filasel;
String _calificacionactualprovsel = "";
Object _robj = null;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _nuevavalidacioncalificacion = "";
long _datetimeactualizacion = 0L;
String _usuariovalidacioncalificacion = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _rbool = false;
Object _msa = null;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Dim CalificacionActualProvSel As String=jamTableV";
_calificacionactualprovsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Calificacion"));
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="If CalificacionActualProvSel=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_calificacionactualprovsel).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"El prove";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso",("El proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+" no tiene calificación.")));
this.state = 23;
return;
case 23:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Dialog.Title=\"Selecciona Validación Calificación\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Validación Calificación");
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=12255254;
 //BA.debugLineNum = 12255254;BA.debugLine="Dim lstOpciones As List=Array As String(\"OK\",\"NO";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"OK","NO OK"});
RDebugUtils.currentLine=12255256;
 //BA.debugLineNum = 12255256;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 5:
//for
this.state = 8;
step20 = 1;
limit20 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 8;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 7;
if (true) break;

case 25:
//C
this.state = 24;
_i = ((int)(0 + _i + step20)) ;
if (true) break;

case 7:
//C
this.state = 25;
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=12255265;
 //BA.debugLineNum = 12255265;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=12255266;
 //BA.debugLineNum = 12255266;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_bcancel.IsInitialized()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=12255268;
 //BA.debugLineNum = 12255268;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=12255269;
 //BA.debugLineNum = 12255269;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=12255270;
 //BA.debugLineNum = 12255270;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=12255273;
 //BA.debugLineNum = 12255273;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), _rsub);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_rint = (int) result[1];
;
RDebugUtils.currentLine=12255275;
 //BA.debugLineNum = 12255275;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 13:
//if
this.state = 18;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=12255277;
 //BA.debugLineNum = 12255277;BA.debugLine="Dim NuevaValidacionCalificacion As String=B4XList";
_nuevavalidacioncalificacion = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=12255280;
 //BA.debugLineNum = 12255280;BA.debugLine="Dim DateTimeActualizacion As Long=DateTime.Now";
_datetimeactualizacion = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12255281;
 //BA.debugLineNum = 12255281;BA.debugLine="Dim UsuarioValidacionCalificacion As String=Main.";
_usuariovalidacioncalificacion = parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ;
RDebugUtils.currentLine=12255283;
 //BA.debugLineNum = 12255283;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eva";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EvaluacionProveedoresActualizarValidacionCalificacionProveedor",new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevavalidacioncalificacion),(Object)(_usuariovalidacioncalificacion),(Object)(_provsel)});
RDebugUtils.currentLine=12255285;
 //BA.debugLineNum = 12255285;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 27;
return;
case 27:
//C
this.state = 19;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=12255286;
 //BA.debugLineNum = 12255286;BA.debugLine="If rBool=False Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_rbool==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=12255287;
 //BA.debugLineNum = 12255287;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12255288;
 //BA.debugLineNum = 12255288;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible actualizar la validación de la calificación del proveedor "+parent.__c.SmartStringFormatter("",(Object)(_provsel))+"."),"Error");
RDebugUtils.currentLine=12255289;
 //BA.debugLineNum = 12255289;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "validarcalificacionproveedor"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
;
RDebugUtils.currentLine=12255290;
 //BA.debugLineNum = 12255290;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=12255293;
 //BA.debugLineNum = 12255293;BA.debugLine="jamTableViewEvaluacionProveedores.SQL.ExecNonQuer";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevavalidacioncalificacion),(Object)(_usuariovalidacioncalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=12255294;
 //BA.debugLineNum = 12255294;BA.debugLine="mSQL.ExecNonQuery2(\"update tblEvaluacionProveedor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblEvaluacionProveedoresDatosEvaluacionActual set FechaValidacionCalificacion=?, ValidacionCalificacion=?, UsuarioValidacionCalificacion=? where Proveedor=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datetimeactualizacion),(Object)(_nuevavalidacioncalificacion),(Object)(_usuariovalidacioncalificacion),(Object)(_provsel)}));
RDebugUtils.currentLine=12255296;
 //BA.debugLineNum = 12255296;BA.debugLine="jamTableViewEvaluacionProveedores.RefrescarFilaTV";
__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filasel);
RDebugUtils.currentLine=12255298;
 //BA.debugLineNum = 12255298;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=12255299;
 //BA.debugLineNum = 12255299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableviewevaluacionproveedores_menubarmenuitem_action(b4j.docU.cevaluacionproveedores __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "jamtableviewevaluacionproveedores_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewevaluacionproveedores_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewEvaluacionProveedores_MenuBarMenuItem_Action(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _tagmenuitem;
int _filasel = 0;
Object _robj = null;
String _provsel = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 36;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","CalificarProveedor","BorrarCalificacionProveedor","ValidarCalificacionProveedor","BorrarValidacionCalificacionProveedor","ActualizarDatos","ConfigurarProveedorFijoEvaluacion")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
case 3: {
this.state = 17;
if (true) break;
}
case 4: {
this.state = 23;
if (true) break;
}
case 5: {
this.state = 29;
if (true) break;
}
case 6: {
this.state = 31;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 36;
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="ActualizarDatosEvaluacionProveedores12UltimosMe";
__ref._actualizardatosevaluacionproveedores12ultimosmeses /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 6:
//if
this.state = 9;
if (_filasel==-1) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","No se ha seleccionado ninguna fila."));
this.state = 37;
return;
case 37:
//C
this.state = 9;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 36;
;
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="CalificarProveedor(ProvSel,FilaSel)";
__ref._calificarproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=10551315;
 //BA.debugLineNum = 10551315;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_filasel==-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=10551317;
 //BA.debugLineNum = 10551317;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","No se ha seleccionado ninguna fila."));
this.state = 38;
return;
case 38:
//C
this.state = 15;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=10551318;
 //BA.debugLineNum = 10551318;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 36;
;
RDebugUtils.currentLine=10551320;
 //BA.debugLineNum = 10551320;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10551321;
 //BA.debugLineNum = 10551321;BA.debugLine="BorrarCalificacionProveedor(ProvSel,FilaSel)";
__ref._borrarcalificacionproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=10551324;
 //BA.debugLineNum = 10551324;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10551325;
 //BA.debugLineNum = 10551325;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_filasel==-1) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=10551326;
 //BA.debugLineNum = 10551326;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","No se ha seleccionado ninguna fila."));
this.state = 39;
return;
case 39:
//C
this.state = 21;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=10551327;
 //BA.debugLineNum = 10551327;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 36;
;
RDebugUtils.currentLine=10551329;
 //BA.debugLineNum = 10551329;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10551330;
 //BA.debugLineNum = 10551330;BA.debugLine="ValidarCalificacionProveedor(ProvSel,FilaSel)";
__ref._validarcalificacionproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=10551333;
 //BA.debugLineNum = 10551333;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10551334;
 //BA.debugLineNum = 10551334;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_filasel==-1) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=10551335;
 //BA.debugLineNum = 10551335;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","No se ha seleccionado ninguna fila."));
this.state = 40;
return;
case 40:
//C
this.state = 27;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=10551336;
 //BA.debugLineNum = 10551336;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 36;
;
RDebugUtils.currentLine=10551338;
 //BA.debugLineNum = 10551338;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10551339;
 //BA.debugLineNum = 10551339;BA.debugLine="BorrarValidacionCalificacionProveedor(ProvSel,F";
__ref._borrarvalidacioncalificacionproveedor /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_provsel,_filasel);
 if (true) break;

case 29:
//C
this.state = 36;
RDebugUtils.currentLine=10551342;
 //BA.debugLineNum = 10551342;BA.debugLine="ActualizarDatosEvaluacionProveedores12UltimosMe";
__ref._actualizardatosevaluacionproveedores12ultimosmeses /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=10551345;
 //BA.debugLineNum = 10551345;BA.debugLine="Dim FilaSel As Int=jamTableViewEvaluacionProvee";
_filasel = __ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10551346;
 //BA.debugLineNum = 10551346;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 32:
//if
this.state = 35;
if (_filasel==-1) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=10551347;
 //BA.debugLineNum = 10551347;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "jamtableviewevaluacionproveedores_menubarmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","No se ha seleccionado ninguna fila."));
this.state = 41;
return;
case 41:
//C
this.state = 35;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=10551348;
 //BA.debugLineNum = 10551348;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=10551350;
 //BA.debugLineNum = 10551350;BA.debugLine="Dim ProvSel As String=jamTableViewEvaluacionPro";
_provsel = BA.ObjectToString(__ref._jamtableviewevaluacionproveedores /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Proveedor"));
RDebugUtils.currentLine=10551351;
 //BA.debugLineNum = 10551351;BA.debugLine="ConfigurarProveedorFijoEvaluacion(ProvSel,FilaS";
__ref._configurarproveedorfijoevaluacion /*void*/ (null,_provsel,_filasel);
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=10551356;
 //BA.debugLineNum = 10551356;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableviewmotivosfijarevaluacionproveedor_contextmenuitem_action(b4j.docU.cevaluacionproveedores __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "jamtableviewmotivosfijarevaluacionproveedor_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewmotivosfijarevaluacionproveedor_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _filasel = 0;
String _provsel = "";
int _idmotivolsel = 0;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub jamTableViewMotivosFijarEvaluacionProveedor_Co";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"EliminarMotivoProveedorFijoEvaluacion")) {
case 0: {
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Dim FilaSel As Int=jamTableViewMotivosFijarEval";
_filasel = __ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Dim ProvSel As String=txtProveedorFijoEvaluacio";
_provsel = __ref._txtproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Dim IDMotivolSel As Int=jamTableViewMotivosFija";
_idmotivolsel = (int)(BA.ObjectToNumber(__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDMotivoProveedorFijoEvaluacion")));
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="EliminarMotivoProveedorFijoEvaluacion(ProvSel,";
__ref._eliminarmotivoproveedorfijoevaluacion /*void*/ (null,_provsel,_idmotivolsel);
 break; }
}
;
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="End Sub";
return "";
}
public void  _jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action(b4j.docU.cevaluacionproveedores __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewMotivosFijarEvaluacionProveedor_MenuBarMenuItem_Action(b4j.docU.cevaluacionproveedores parent,b4j.docU.cevaluacionproveedores __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedores __ref;
b4j.docU.cevaluacionproveedores parent;
String _tagmenuitem;
String _provsel = "";
String _nombreprovsel = "";
int _filasel = 0;
Object _robj = null;
int _idmotivolsel = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,"AddMotivoProveedorFijoEvaluacion","EliminarMotivoProveedorFijoEvaluacion")) {
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
this.state = 10;
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="Dim ProvSel As String=txtProveedorFijoEvaluacio";
_provsel = __ref._txtproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Dim NombreProvSel As String=txtNombreProveedorF";
_nombreprovsel = __ref._txtnombreproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="AddMotivosProveedorFijoEvaluacion(ProvSel, Nomb";
__ref._addmotivosproveedorfijoevaluacion /*void*/ (null,_provsel,_nombreprovsel);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="Dim FilaSel As Int=jamTableViewMotivosFijarEval";
_filasel = __ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="If FilaSel=-1 Then";
if (true) break;

case 6:
//if
this.state = 9;
if (_filasel==-1) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"No se h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedores", "jamtableviewmotivosfijarevaluacionproveedor_menubarmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","No se ha seleccionado ninguna fila."));
this.state = 11;
return;
case 11:
//C
this.state = 9;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="Dim ProvSel As String=txtProveedorFijoEvaluacio";
_provsel = __ref._txtproveedorfijoevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="Dim IDMotivolSel As Int=jamTableViewMotivosFija";
_idmotivolsel = (int)(BA.ObjectToNumber(__ref._jamtableviewmotivosfijarevaluacionproveedor /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDMotivoProveedorFijoEvaluacion")));
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="EliminarMotivoProveedorFijoEvaluacion(ProvSel,";
__ref._eliminarmotivoproveedorfijoevaluacion /*void*/ (null,_provsel,_idmotivolsel);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=10878992;
 //BA.debugLineNum = 10878992;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview(b4j.docU.cevaluacionproveedores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub jamTableViewProveedoresFijosEvaluacion";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="For Each xNode As B4XView In BackgroundProveedore";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="xNode.RemoveViewFromParent";
_xnode.RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="BackgroundProveedoresFijosEvaluacion.RemoveViewFr";
__ref._backgroundproveedoresfijosevaluacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return "";
}
public String  _lbliconcerrardrawer_mouseclicked(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "lbliconcerrardrawer_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lbliconcerrardrawer_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub lblIconCerrarDrawer_MouseClicked (Even";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Drawer.LeftOpen=False";
__ref._drawer /*b4j.docU.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseentered(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseentered", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
_xnode.SetColorAndBorder(_xnode.getColor(),__c.DipToCurrent((int) (1)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan,5);
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseexited(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mouseexited", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="If xNode.IsInitialized Then";
if (_xnode.IsInitialized()) { 
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,0xFF696";
_xnode.SetColorAndBorder(_xnode.getColor(),__c.DipToCurrent((int) (1)),((int)0xff696969),5);
 };
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousepressed(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousepressed", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
_xnode.SetColorAndBorder(_xnode.getColor(),__c.DipToCurrent((int) (1)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan,5);
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousereleased(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lblsalirevaluacionproveedoresconfigurarproveedorfijoevaluacion_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub lblSalirEvaluacionProveedoresConfigura";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,0xFF6969";
_xnode.SetColorAndBorder(_xnode.getColor(),__c.DipToCurrent((int) (1)),((int)0xff696969),5);
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="SalirProveedorFijoEvaluacion";
__ref._salirproveedorfijoevaluacion /*void*/ (null);
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="End Sub";
return "";
}
public String  _lbltextocerrardrawer_mouseclicked(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "lbltextocerrardrawer_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lbltextocerrardrawer_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub lblTextoCerrarDrawer_MouseClicked (Eve";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Drawer.LeftOpen=False";
__ref._drawer /*b4j.docU.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
public String  _pnltopdrawerleft_mouseclicked(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "pnltopdrawerleft_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "pnltopdrawerleft_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub pnlTopDrawerLeft_MouseClicked (EventDa";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Drawer.LeftOpen=False";
__ref._drawer /*b4j.docU.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="End Sub";
return "";
}
public String  _treeviewdrawer_selecteditemchanged(b4j.docU.cevaluacionproveedores __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedores";
if (Debug.shouldDelegate(ba, "treeviewdrawer_selecteditemchanged", false))
	 {return ((String) Debug.delegate(ba, "treeviewdrawer_selecteditemchanged", new Object[] {_selecteditem}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub TreeViewDrawer_SelectedItemChanged (Se";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Drawer.LeftOpen=False";
__ref._drawer /*b4j.docU.b4xdrawer*/ ._setleftopen /*boolean*/ (null,__c.False);
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="If SelectedItem.IsInitialized=False Then Return";
if (_selecteditem.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Select Case SelectedItem.Text";
switch (BA.switchObjectToInt(_selecteditem.getText(),"Salir")) {
case 0: {
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="Return";
if (true) return "";
 break; }
}
;
RDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="End Sub";
return "";
}
}