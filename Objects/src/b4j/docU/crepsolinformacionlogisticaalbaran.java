package b4j.docU;

import anywheresoftware.b4a.debug.*;
import com.sun.jna.platform.win32.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class crepsolinformacionlogisticaalbaran extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.crepsolinformacionlogisticaalbaran", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.crepsolinformacionlogisticaalbaran.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.SQL _msql = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalir = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnseleccionardocumento = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldocumento = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdocumento = null;
public String _carpetaficheroscsv = "";
public String _carpetaficherospdf = "";
public String _buzoncompartidoemailenvioinfo = "";
public String _direccionseleccionadaremitenteemails = "";
public String _direcciondestinoemails = "";
public String _direccionccdestinoemails = "";
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
public String  _initialize(b4j.docU.crepsolinformacionlogisticaalbaran __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=98500608;
 //BA.debugLineNum = 98500608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=98500610;
 //BA.debugLineNum = 98500610;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=98500614;
 //BA.debugLineNum = 98500614;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=98500615;
 //BA.debugLineNum = 98500615;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98828289;
 //BA.debugLineNum = 98828289;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=98828290;
 //BA.debugLineNum = 98828290;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=98828291;
 //BA.debugLineNum = 98828291;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=98828292;
 //BA.debugLineNum = 98828292;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=98828293;
 //BA.debugLineNum = 98828293;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=98828294;
 //BA.debugLineNum = 98828294;BA.debugLine="frm.RootPane.LoadLayout(\"scrRepsolInformacionLogi";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrRepsolInformacionLogisticaAlbaranVenta");
RDebugUtils.currentLine=98828297;
 //BA.debugLineNum = 98828297;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Exportación I";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Exportación Información Albarán Repsol");
RDebugUtils.currentLine=98828299;
 //BA.debugLineNum = 98828299;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=98828300;
 //BA.debugLineNum = 98828300;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=98828302;
 //BA.debugLineNum = 98828302;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=98828303;
 //BA.debugLineNum = 98828303;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando con";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando configuración..."));
RDebugUtils.currentLine=98828304;
 //BA.debugLineNum = 98828304;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=98828306;
 //BA.debugLineNum = 98828306;BA.debugLine="Wait For(CargaRepsolConfiguracionLogisticaAlbaran";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "show"), __ref._cargarepsolconfiguracionlogisticaalbaranesventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=98828307;
 //BA.debugLineNum = 98828307;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=98828308;
 //BA.debugLineNum = 98828308;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=98828309;
 //BA.debugLineNum = 98828309;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=98828310;
 //BA.debugLineNum = 98828310;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=98828311;
 //BA.debugLineNum = 98828311;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=98828313;
 //BA.debugLineNum = 98828313;BA.debugLine="Dim mData As Map=mRes.Get(\"mDataConf\")";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mDataConf"))));
RDebugUtils.currentLine=98828314;
 //BA.debugLineNum = 98828314;BA.debugLine="CarpetaFicherosCSV=mData.Get(\"CampoString1\")";
__ref._carpetaficheroscsv /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString1")));
RDebugUtils.currentLine=98828315;
 //BA.debugLineNum = 98828315;BA.debugLine="CarpetaFicherosPDF=mData.Get(\"CampoString5\")";
__ref._carpetaficherospdf /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString5")));
RDebugUtils.currentLine=98828316;
 //BA.debugLineNum = 98828316;BA.debugLine="BuzonCompartidoEmailEnvioInfo=mData.Get(\"CampoStr";
__ref._buzoncompartidoemailenvioinfo /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString2")));
RDebugUtils.currentLine=98828317;
 //BA.debugLineNum = 98828317;BA.debugLine="DireccionDestinoEmails=mData.Get(\"CampoString3\")";
__ref._direcciondestinoemails /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString3")));
RDebugUtils.currentLine=98828318;
 //BA.debugLineNum = 98828318;BA.debugLine="DireccionCCDestinoEmails=mData.Get(\"CampoString4\"";
__ref._direccionccdestinoemails /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString4")));
RDebugUtils.currentLine=98828320;
 //BA.debugLineNum = 98828320;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
__ref._borrarvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=98828321;
 //BA.debugLineNum = 98828321;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
__ref._borrarvbsscriptenvioemailoutlook /*String*/ (null);
RDebugUtils.currentLine=98828323;
 //BA.debugLineNum = 98828323;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlook";
__ref._crearvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=98828324;
 //BA.debugLineNum = 98828324;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTML";
__ref._crearvbsscriptenvioemailoutlookhtml /*String*/ (null);
RDebugUtils.currentLine=98828326;
 //BA.debugLineNum = 98828326;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=98828327;
 //BA.debugLineNum = 98828327;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _abrirventanaoutlookemail(b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _titulowindow,String _documento) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "abrirventanaoutlookemail", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "abrirventanaoutlookemail", new Object[] {_titulowindow,_documento}));}
ResumableSub_AbrirVentanaOutlookEmail rsub = new ResumableSub_AbrirVentanaOutlookEmail(this,__ref,_titulowindow,_documento);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AbrirVentanaOutlookEmail extends BA.ResumableSub {
public ResumableSub_AbrirVentanaOutlookEmail(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _titulowindow,String _documento) {
this.parent = parent;
this.__ref = __ref;
this._titulowindow = _titulowindow;
this._documento = _documento;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
String _titulowindow;
String _documento;
anywheresoftware.b4j.object.JavaObject _wu = null;
anywheresoftware.b4a.objects.collections.List _l = null;
boolean _flagok = false;
anywheresoftware.b4j.object.JavaObject _jo = null;
String _t = "";
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=99942403;
 //BA.debugLineNum = 99942403;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
parent.__c.LogImpl("899942403","Buscando window title "+_titulowindow,0);
RDebugUtils.currentLine=99942406;
 //BA.debugLineNum = 99942406;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=99942407;
 //BA.debugLineNum = 99942407;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=99942408;
 //BA.debugLineNum = 99942408;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(parent.__c.False)})));
RDebugUtils.currentLine=99942409;
 //BA.debugLineNum = 99942409;BA.debugLine="Dim FlagOk As Boolean";
_flagok = false;
RDebugUtils.currentLine=99942410;
 //BA.debugLineNum = 99942410;BA.debugLine="For Each JO As JavaObject In L";
if (true) break;

case 1:
//for
this.state = 8;
_jo = new anywheresoftware.b4j.object.JavaObject();
group6 = _l;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group6.Get(index6)));}
if (true) break;

case 15:
//C
this.state = 14;
index6++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=99942411;
 //BA.debugLineNum = 99942411;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=99942413;
 //BA.debugLineNum = 99942413;BA.debugLine="Log(\"window title\" & t)";
parent.__c.LogImpl("899942413","window title"+_t,0);
RDebugUtils.currentLine=99942417;
 //BA.debugLineNum = 99942417;BA.debugLine="If t.Contains(TituloWindow) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_t.contains(_titulowindow)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=99942424;
 //BA.debugLineNum = 99942424;BA.debugLine="FlagOk=True";
_flagok = parent.__c.True;
RDebugUtils.currentLine=99942425;
 //BA.debugLineNum = 99942425;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 15;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=99942429;
 //BA.debugLineNum = 99942429;BA.debugLine="If FlagOk Then";

case 8:
//if
this.state = 13;
if (_flagok) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=99942430;
 //BA.debugLineNum = 99942430;BA.debugLine="SetForegroundWindow(t,False)";
__ref._setforegroundwindow /*boolean*/ (null,_t,parent.__c.False);
RDebugUtils.currentLine=99942431;
 //BA.debugLineNum = 99942431;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=99942433;
 //BA.debugLineNum = 99942433;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No se ha enc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No se ha encontrado la ventana de Outlook con el correo correspondiente al documento "+parent.__c.SmartStringFormatter("",(Object)(_documento))+"\n"+"Busca manualmente la ventana en outlook para enviar el email"),"Aviso");
RDebugUtils.currentLine=99942435;
 //BA.debugLineNum = 99942435;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "abrirventanaoutlookemail"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
RDebugUtils.currentLine=99942436;
 //BA.debugLineNum = 99942436;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=99942440;
 //BA.debugLineNum = 99942440;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _setforegroundwindow(b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _title,boolean _justfind) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "setforegroundwindow", false))
	 {return ((Boolean) Debug.delegate(ba, "setforegroundwindow", new Object[] {_title,_justfind}));}
RDebugUtils.currentLine=100007936;
 //BA.debugLineNum = 100007936;BA.debugLine="Sub SetForegroundWindow(Title As String, JustFind";
RDebugUtils.currentLine=100007937;
 //BA.debugLineNum = 100007937;BA.debugLine="Return Me.As(JavaObject).RunMethod(\"SetForeground";
if (true) return BA.ObjectToBoolean(((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this))).RunMethod("SetForegroundWindow",new Object[]{(Object)(_title),(Object)(_justfind)}));
RDebugUtils.currentLine=100007938;
 //BA.debugLineNum = 100007938;BA.debugLine="End Sub";
return false;
}
public String  _borrarvbsscriptdireccionremitenteemailoutlook(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "borrarvbsscriptdireccionremitenteemailoutlook", false))
	 {return ((String) Debug.delegate(ba, "borrarvbsscriptdireccionremitenteemailoutlook", null));}
RDebugUtils.currentLine=99483648;
 //BA.debugLineNum = 99483648;BA.debugLine="Sub BorrarVBSScriptDireccionRemitenteEmailOutlook";
RDebugUtils.currentLine=99483649;
 //BA.debugLineNum = 99483649;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc.vbs\")";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs")) { 
RDebugUtils.currentLine=99483650;
 //BA.debugLineNum = 99483650;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc.vbs\")";
__c.File.Delete(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs");
 };
RDebugUtils.currentLine=99483652;
 //BA.debugLineNum = 99483652;BA.debugLine="End Sub";
return "";
}
public String  _borrarvbsscriptenvioemailoutlook(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "borrarvbsscriptenvioemailoutlook", false))
	 {return ((String) Debug.delegate(ba, "borrarvbsscriptenvioemailoutlook", null));}
RDebugUtils.currentLine=99876864;
 //BA.debugLineNum = 99876864;BA.debugLine="Sub BorrarVBSScriptEnvioEmailOutlook";
RDebugUtils.currentLine=99876865;
 //BA.debugLineNum = 99876865;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc2.vbs\")";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs")) { 
RDebugUtils.currentLine=99876866;
 //BA.debugLineNum = 99876866;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc2.vbs\")";
__c.File.Delete(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs");
 };
RDebugUtils.currentLine=99876868;
 //BA.debugLineNum = 99876868;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=98631680;
 //BA.debugLineNum = 98631680;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=98631681;
 //BA.debugLineNum = 98631681;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=98631682;
 //BA.debugLineNum = 98631682;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=98697216;
 //BA.debugLineNum = 98697216;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=98697217;
 //BA.debugLineNum = 98697217;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
__ref._borrarvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=98697218;
 //BA.debugLineNum = 98697218;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
__ref._borrarvbsscriptenvioemailoutlook /*String*/ (null);
RDebugUtils.currentLine=98697219;
 //BA.debugLineNum = 98697219;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=98697220;
 //BA.debugLineNum = 98697220;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=98697221;
 //BA.debugLineNum = 98697221;BA.debugLine="End Sub";
return "";
}
public String  _btnseleccionardocumento_click(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "btnseleccionardocumento_click", false))
	 {return ((String) Debug.delegate(ba, "btnseleccionardocumento_click", null));}
RDebugUtils.currentLine=99090432;
 //BA.debugLineNum = 99090432;BA.debugLine="Private Sub btnSeleccionarDocumento_Click";
RDebugUtils.currentLine=99090433;
 //BA.debugLineNum = 99090433;BA.debugLine="SeleccionarDocumento";
__ref._seleccionardocumento /*void*/ (null);
RDebugUtils.currentLine=99090434;
 //BA.debugLineNum = 99090434;BA.debugLine="End Sub";
return "";
}
public void  _seleccionardocumento(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "seleccionardocumento", false))
	 {Debug.delegate(ba, "seleccionardocumento", null); return;}
ResumableSub_SeleccionarDocumento rsub = new ResumableSub_SeleccionarDocumento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SeleccionarDocumento extends BA.ResumableSub {
public ResumableSub_SeleccionarDocumento(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _documento = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _rutaficheropdfdocumento = "";
String _nombreficheropdfdocumento = "";
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.List _lstlineasalbaran = null;
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
int _idx = 0;
String[] _arrh = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object[] _row = null;
int _i = 0;
String _dirficherosalbaranesventarepsol = "";
String _nombrefichero = "";
b4j.docU.csvparser _parser = null;
String _s = "";
String _rutaficherodocumento = "";
boolean _success = false;
String _sbbody = "";
String _emailsubject = "";
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
anywheresoftware.b4a.BA.IterableList group50;
int index50;
int groupLen50;
int step53;
int limit53;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=99024898;
 //BA.debugLineNum = 99024898;BA.debugLine="Dialog.Title=\"Indica Documento\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Documento");
RDebugUtils.currentLine=99024899;
 //BA.debugLineNum = 99024899;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=99024900;
 //BA.debugLineNum = 99024900;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=99024901;
 //BA.debugLineNum = 99024901;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=99024902;
 //BA.debugLineNum = 99024902;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=99024903;
 //BA.debugLineNum = 99024903;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=99024905;
 //BA.debugLineNum = 99024905;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=99024906;
 //BA.debugLineNum = 99024906;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=99024907;
 //BA.debugLineNum = 99024907;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=99024908;
 //BA.debugLineNum = 99024908;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=99024909;
 //BA.debugLineNum = 99024909;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=99024910;
 //BA.debugLineNum = 99024910;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=99024911;
 //BA.debugLineNum = 99024911;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=99024912;
 //BA.debugLineNum = 99024912;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _rsub);
this.state = 64;
return;
case 64:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=99024913;
 //BA.debugLineNum = 99024913;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return";
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
RDebugUtils.currentLine=99024915;
 //BA.debugLineNum = 99024915;BA.debugLine="Dim Documento As String=InputDlg.Text";
_documento = _inputdlg._text /*String*/ ;
RDebugUtils.currentLine=99024917;
 //BA.debugLineNum = 99024917;BA.debugLine="If Documento=\"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_documento).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=99024918;
 //BA.debugLineNum = 99024918;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha indicado documento","Aviso");
RDebugUtils.currentLine=99024919;
 //BA.debugLineNum = 99024919;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 10;
;
RDebugUtils.currentLine=99024920;
 //BA.debugLineNum = 99024920;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=99024923;
 //BA.debugLineNum = 99024923;BA.debugLine="txtDocumento.Text=Documento";
__ref._txtdocumento /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_documento);
RDebugUtils.currentLine=99024925;
 //BA.debugLineNum = 99024925;BA.debugLine="Wait For(CargaRepsolInformacionLogisticaAlbaranVe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref._cargarepsolinformacionlogisticaalbaranventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_documento));
this.state = 66;
return;
case 66:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=99024926;
 //BA.debugLineNum = 99024926;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=99024927;
 //BA.debugLineNum = 99024927;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 11:
//if
this.state = 16;
if ((_accion).equals("NOK")) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) return ;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=99024928;
 //BA.debugLineNum = 99024928;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=99024929;
 //BA.debugLineNum = 99024929;BA.debugLine="Log(lstReg)";
parent.__c.LogImpl("899024929",BA.ObjectToString(_lstreg),0);
RDebugUtils.currentLine=99024931;
 //BA.debugLineNum = 99024931;BA.debugLine="If lstReg.Size=0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_lstreg.getSize()==0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=99024932;
 //BA.debugLineNum = 99024932;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos en el documento "+parent.__c.SmartStringFormatter("",(Object)(_documento))+" para generar el fichero. Revisar información en navision."),"Aviso");
RDebugUtils.currentLine=99024933;
 //BA.debugLineNum = 99024933;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 67;
return;
case 67:
//C
this.state = 20;
;
RDebugUtils.currentLine=99024934;
 //BA.debugLineNum = 99024934;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=99024937;
 //BA.debugLineNum = 99024937;BA.debugLine="Dim RutaFicheroPDFDocumento As String";
_rutaficheropdfdocumento = "";
RDebugUtils.currentLine=99024938;
 //BA.debugLineNum = 99024938;BA.debugLine="Dim NombreFicheroPDFDocumento As String=$\"${Docum";
_nombreficheropdfdocumento = (""+parent.__c.SmartStringFormatter("",(Object)(_documento))+".pdf");
RDebugUtils.currentLine=99024939;
 //BA.debugLineNum = 99024939;BA.debugLine="If File.Exists(CarpetaFicherosPDF,NombreFicheroPD";
if (true) break;

case 21:
//if
this.state = 32;
if (parent.__c.File.Exists(__ref._carpetaficherospdf /*String*/ ,_nombreficheropdfdocumento)) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 32;
RDebugUtils.currentLine=99024940;
 //BA.debugLineNum = 99024940;BA.debugLine="RutaFicheroPDFDocumento=File.Combine(CarpetaFich";
_rutaficheropdfdocumento = parent.__c.File.Combine(__ref._carpetaficherospdf /*String*/ ,_nombreficheropdfdocumento);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=99024942;
 //BA.debugLineNum = 99024942;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"No e";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("No existe el fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropdfdocumento))+" en la carpeta "+parent.__c.SmartStringFormatter("",(Object)(__ref._carpetaficherospdf /*String*/ ))+"\n"+"¿Continuar? (Puedes añadir manualmente el PDF en el email"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 68;
return;
case 68:
//C
this.state = 26;
_rint = (int) result[1];
;
RDebugUtils.currentLine=99024944;
 //BA.debugLineNum = 99024944;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 26:
//if
this.state = 31;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) return ;
if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=99024947;
 //BA.debugLineNum = 99024947;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=99024948;
 //BA.debugLineNum = 99024948;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=99024950;
 //BA.debugLineNum = 99024950;BA.debugLine="Dim lstLineasAlbaran As List";
_lstlineasalbaran = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=99024951;
 //BA.debugLineNum = 99024951;BA.debugLine="lstLineasAlbaran.Initialize";
_lstlineasalbaran.Initialize();
RDebugUtils.currentLine=99024953;
 //BA.debugLineNum = 99024953;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=99024955;
 //BA.debugLineNum = 99024955;BA.debugLine="Dim iDX As Int";
_idx = 0;
RDebugUtils.currentLine=99024956;
 //BA.debugLineNum = 99024956;BA.debugLine="Dim arrH(mData0.size) As String=mapKeysToArray(mD";
_arrh = __ref._mapkeystoarray /*String[]*/ (null,_mdata0);
RDebugUtils.currentLine=99024957;
 //BA.debugLineNum = 99024957;BA.debugLine="lstLineasAlbaran.Add(arrH)";
_lstlineasalbaran.Add((Object)(_arrh));
RDebugUtils.currentLine=99024959;
 //BA.debugLineNum = 99024959;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=99024960;
 //BA.debugLineNum = 99024960;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 33:
//for
this.state = 40;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group50 = _lstreg;
index50 = 0;
groupLen50 = group50.getSize();
this.state = 69;
if (true) break;

case 69:
//C
this.state = 40;
if (index50 < groupLen50) {
this.state = 35;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group50.Get(index50)));}
if (true) break;

case 70:
//C
this.state = 69;
index50++;
if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=99024961;
 //BA.debugLineNum = 99024961;BA.debugLine="Log(mData)";
parent.__c.LogImpl("899024961",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=99024962;
 //BA.debugLineNum = 99024962;BA.debugLine="Dim row() As Object=mapValuesToArrayOfStringsCon";
_row = __ref._mapvaluestoarrayofstringsconcamposfecha /*Object[]*/ (null,_mdata);
RDebugUtils.currentLine=99024963;
 //BA.debugLineNum = 99024963;BA.debugLine="For i=0 To row.Length-1";
if (true) break;

case 36:
//for
this.state = 39;
step53 = 1;
limit53 = (int) (_row.length-1);
_i = (int) (0) ;
this.state = 71;
if (true) break;

case 71:
//C
this.state = 39;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 38;
if (true) break;

case 72:
//C
this.state = 71;
_i = ((int)(0 + _i + step53)) ;
if (true) break;

case 38:
//C
this.state = 72;
RDebugUtils.currentLine=99024964;
 //BA.debugLineNum = 99024964;BA.debugLine="Log(row(i))";
parent.__c.LogImpl("899024964",BA.ObjectToString(_row[_i]),0);
 if (true) break;
if (true) break;

case 39:
//C
this.state = 70;
;
RDebugUtils.currentLine=99024966;
 //BA.debugLineNum = 99024966;BA.debugLine="lstLineasAlbaran.Add(row)";
_lstlineasalbaran.Add((Object)(_row));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=99024969;
 //BA.debugLineNum = 99024969;BA.debugLine="DateTime.DateFormat=DateTime.DateFormat";
parent.__c.DateTime.setDateFormat(parent.__c.DateTime.getDateFormat());
RDebugUtils.currentLine=99024972;
 //BA.debugLineNum = 99024972;BA.debugLine="Dim DirFicherosAlbaranesVentaRepsol As String=Car";
_dirficherosalbaranesventarepsol = __ref._carpetaficheroscsv /*String*/ ;
RDebugUtils.currentLine=99024990;
 //BA.debugLineNum = 99024990;BA.debugLine="Dim NombreFichero As String=$\"${Documento}.csv\"$";
_nombrefichero = (""+parent.__c.SmartStringFormatter("",(Object)(_documento))+".csv");
RDebugUtils.currentLine=99024993;
 //BA.debugLineNum = 99024993;BA.debugLine="Dim parser As CSVParser";
_parser = new b4j.docU.csvparser();
RDebugUtils.currentLine=99024994;
 //BA.debugLineNum = 99024994;BA.debugLine="parser.Initialize";
_parser._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=99024995;
 //BA.debugLineNum = 99024995;BA.debugLine="Dim s As String = parser.GenerateString(lstLineas";
_s = _parser._generatestring /*String*/ (null,_lstlineasalbaran,parent.__c.TAB);
RDebugUtils.currentLine=99024996;
 //BA.debugLineNum = 99024996;BA.debugLine="File.WriteString(DirFicherosAlbaranesVentaRepsol,";
parent.__c.File.WriteString(_dirficherosalbaranesventarepsol,_nombrefichero,_s);
RDebugUtils.currentLine=99024998;
 //BA.debugLineNum = 99024998;BA.debugLine="Dim RutaFicheroDocumento As String=File.Combine(D";
_rutaficherodocumento = parent.__c.File.Combine(_dirficherosalbaranesventarepsol,_nombrefichero);
RDebugUtils.currentLine=99025005;
 //BA.debugLineNum = 99025005;BA.debugLine="wait for(SeleccionarDireccionRemitenteEmails) com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref._seleccionardireccionremitenteemails /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 73;
return;
case 73:
//C
this.state = 41;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=99025006;
 //BA.debugLineNum = 99025006;BA.debugLine="If Not(Success) Then";
if (true) break;

case 41:
//if
this.state = 50;
if (parent.__c.Not(_success)) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 50;
RDebugUtils.currentLine=99025007;
 //BA.debugLineNum = 99025007;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es necesario";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es necesario seleccionar la dirección desde la que enviar el correo al operador logístico.","Aviso");
RDebugUtils.currentLine=99025008;
 //BA.debugLineNum = 99025008;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 74;
return;
case 74:
//C
this.state = 50;
;
RDebugUtils.currentLine=99025009;
 //BA.debugLineNum = 99025009;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=99025011;
 //BA.debugLineNum = 99025011;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La direcci";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"La dirección DESDE la que se enviará el correo será:"+parent.__c.CRLF+parent.__c.CRLF+__ref._direccionseleccionadaremitenteemails /*String*/ ,"Direccion envío email","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=99025012;
 //BA.debugLineNum = 99025012;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 75;
return;
case 75:
//C
this.state = 46;
_rint = (int) result[1];
;
RDebugUtils.currentLine=99025013;
 //BA.debugLineNum = 99025013;BA.debugLine="Select rInt";
if (true) break;

case 46:
//select
this.state = 49;
switch (BA.switchObjectToInt(_rint,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel)) {
case 0: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=99025015;
 //BA.debugLineNum = 99025015;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=99025019;
 //BA.debugLineNum = 99025019;BA.debugLine="Dim sbBody As String=HTMLBodyEmail";
_sbbody = __ref._htmlbodyemail /*String*/ (null);
RDebugUtils.currentLine=99025020;
 //BA.debugLineNum = 99025020;BA.debugLine="If DireccionCCDestinoEmails=\"\" Then DireccionCCDe";
if (true) break;

case 51:
//if
this.state = 56;
if ((__ref._direccionccdestinoemails /*String*/ ).equals("")) { 
this.state = 53;
;}if (true) break;

case 53:
//C
this.state = 56;
__ref._direccionccdestinoemails /*String*/  = "None";
if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=99025022;
 //BA.debugLineNum = 99025022;BA.debugLine="Dim EmailSubject As String=$\"Albarán venta REPSOL";
_emailsubject = ("Albarán venta REPSOL "+parent.__c.SmartStringFormatter("",(Object)(_documento))+"");
RDebugUtils.currentLine=99025024;
 //BA.debugLineNum = 99025024;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Creando emai";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Creando email..."));
RDebugUtils.currentLine=99025025;
 //BA.debugLineNum = 99025025;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=99025026;
 //BA.debugLineNum = 99025026;BA.debugLine="wait for(EjecutarVBSScriptEnviarEmail(DireccionSe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref._ejecutarvbsscriptenviaremail /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._direccionseleccionadaremitenteemails /*String*/ ,__ref._direcciondestinoemails /*String*/ ,__ref._direccionccdestinoemails /*String*/ ,_emailsubject,_sbbody,_rutaficherodocumento,_rutaficheropdfdocumento));
this.state = 76;
return;
case 76:
//C
this.state = 57;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=99025028;
 //BA.debugLineNum = 99025028;BA.debugLine="Log(\"mRes: \" & mRes)";
parent.__c.LogImpl("899025028","mRes: "+BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=99025029;
 //BA.debugLineNum = 99025029;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=99025030;
 //BA.debugLineNum = 99025030;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
_exitcode = (int)(BA.ObjectToNumber(_mres.Get((Object)("ExitCode"))));
RDebugUtils.currentLine=99025031;
 //BA.debugLineNum = 99025031;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
_stdout = BA.ObjectToString(_mres.Get((Object)("StdOut")));
RDebugUtils.currentLine=99025032;
 //BA.debugLineNum = 99025032;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
_stderr = BA.ObjectToString(_mres.Get((Object)("StdErr")));
RDebugUtils.currentLine=99025033;
 //BA.debugLineNum = 99025033;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=99025034;
 //BA.debugLineNum = 99025034;BA.debugLine="If Success=False Then";
if (true) break;

case 57:
//if
this.state = 60;
if (_success==parent.__c.False) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=99025035;
 //BA.debugLineNum = 99025035;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt creación de email"+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=99025036;
 //BA.debugLineNum = 99025036;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 77;
return;
case 77:
//C
this.state = 60;
;
RDebugUtils.currentLine=99025037;
 //BA.debugLineNum = 99025037;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=99025039;
 //BA.debugLineNum = 99025039;BA.debugLine="If ExitCode=1 Then";

case 60:
//if
this.state = 63;
if (_exitcode==1) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=99025040;
 //BA.debugLineNum = 99025040;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt creación email"+parent.__c.CRLF+_stderr,"Error");
RDebugUtils.currentLine=99025041;
 //BA.debugLineNum = 99025041;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 78;
return;
case 78:
//C
this.state = 63;
;
RDebugUtils.currentLine=99025042;
 //BA.debugLineNum = 99025042;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 63:
//C
this.state = -1;
;
RDebugUtils.currentLine=99025044;
 //BA.debugLineNum = 99025044;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Email creado,";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Email creado, OK","Aviso");
RDebugUtils.currentLine=99025045;
 //BA.debugLineNum = 99025045;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), _msa);
this.state = 79;
return;
case 79:
//C
this.state = -1;
;
RDebugUtils.currentLine=99025047;
 //BA.debugLineNum = 99025047;BA.debugLine="Wait For(AbrirVentanaOutlookEmail($\"${EmailSubjec";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardocumento"), __ref._abrirventanaoutlookemail /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(""+parent.__c.SmartStringFormatter("",(Object)(_emailsubject))+" - Mensaje(HTML)"),_documento));
this.state = 80;
return;
case 80:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=99025050;
 //BA.debugLineNum = 99025050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargarepsolconfiguracionlogisticaalbaranesventa(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "cargarepsolconfiguracionlogisticaalbaranesventa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargarepsolconfiguracionlogisticaalbaranesventa", null));}
ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta rsub = new ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta extends BA.ResumableSub {
public ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdataconf = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98893826;
 //BA.debugLineNum = 98893826;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=98893827;
 //BA.debugLineNum = 98893827;BA.debugLine="Dim mDataConf As Map";
_mdataconf = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=98893828;
 //BA.debugLineNum = 98893828;BA.debugLine="mDataConf.Initialize";
_mdataconf.Initialize();
RDebugUtils.currentLine=98893829;
 //BA.debugLineNum = 98893829;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=98893830;
 //BA.debugLineNum = 98893830;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=98893831;
 //BA.debugLineNum = 98893831;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=98893832;
 //BA.debugLineNum = 98893832;BA.debugLine="mRes.Put(\"mDataConf\",mDataConf)";
_mres.Put((Object)("mDataConf"),(Object)(_mdataconf.getObject()));
RDebugUtils.currentLine=98893833;
 //BA.debugLineNum = 98893833;BA.debugLine="Dim Comando As String=\"RepsolConfiguracionLogisti";
_comando = "RepsolConfiguracionLogisticaAlbaranesVenta";
RDebugUtils.currentLine=98893834;
 //BA.debugLineNum = 98893834;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=98893836;
 //BA.debugLineNum = 98893836;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolconfiguracionlogisticaalbaranesventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=98893838;
 //BA.debugLineNum = 98893838;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=98893839;
 //BA.debugLineNum = 98893839;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=98893840;
 //BA.debugLineNum = 98893840;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=98893841;
 //BA.debugLineNum = 98893841;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=98893842;
 //BA.debugLineNum = 98893842;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=98893843;
 //BA.debugLineNum = 98893843;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=98893846;
 //BA.debugLineNum = 98893846;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=98893847;
 //BA.debugLineNum = 98893847;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=98893848;
 //BA.debugLineNum = 98893848;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe la configuración necesaria para la conexión."),"Aviso");
RDebugUtils.currentLine=98893849;
 //BA.debugLineNum = 98893849;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=98893850;
 //BA.debugLineNum = 98893850;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=98893851;
 //BA.debugLineNum = 98893851;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=98893853;
 //BA.debugLineNum = 98893853;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=98893854;
 //BA.debugLineNum = 98893854;BA.debugLine="mDataConf=lstReg.Get(0)";
_mdataconf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=98893855;
 //BA.debugLineNum = 98893855;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=98893856;
 //BA.debugLineNum = 98893856;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=98893857;
 //BA.debugLineNum = 98893857;BA.debugLine="mRes.Put(\"mDataConf\", mDataConf)";
_mres.Put((Object)("mDataConf"),(Object)(_mdataconf.getObject()));
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
RDebugUtils.currentLine=98893861;
 //BA.debugLineNum = 98893861;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=98893862;
 //BA.debugLineNum = 98893862;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargarepsolinformacionlogisticaalbaranventa(b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _albarannav) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "cargarepsolinformacionlogisticaalbaranventa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargarepsolinformacionlogisticaalbaranventa", new Object[] {_albarannav}));}
ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta rsub = new ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(this,__ref,_albarannav);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta extends BA.ResumableSub {
public ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _albarannav) {
this.parent = parent;
this.__ref = __ref;
this._albarannav = _albarannav;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
String _albarannav;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98959361;
 //BA.debugLineNum = 98959361;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=98959362;
 //BA.debugLineNum = 98959362;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=98959363;
 //BA.debugLineNum = 98959363;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=98959364;
 //BA.debugLineNum = 98959364;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=98959365;
 //BA.debugLineNum = 98959365;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=98959366;
 //BA.debugLineNum = 98959366;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=98959367;
 //BA.debugLineNum = 98959367;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=98959368;
 //BA.debugLineNum = 98959368;BA.debugLine="Dim Comando As String=\"RepsolInformacionLogistica";
_comando = "RepsolInformacionLogisticaAlbaranVenta";
RDebugUtils.currentLine=98959369;
 //BA.debugLineNum = 98959369;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_albarannav)},parent);
RDebugUtils.currentLine=98959371;
 //BA.debugLineNum = 98959371;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolinformacionlogisticaalbaranventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=98959372;
 //BA.debugLineNum = 98959372;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=98959373;
 //BA.debugLineNum = 98959373;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=98959374;
 //BA.debugLineNum = 98959374;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=98959375;
 //BA.debugLineNum = 98959375;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=98959376;
 //BA.debugLineNum = 98959376;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=98959377;
 //BA.debugLineNum = 98959377;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=98959379;
 //BA.debugLineNum = 98959379;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=98959380;
 //BA.debugLineNum = 98959380;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=98959381;
 //BA.debugLineNum = 98959381;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe el documento "+parent.__c.SmartStringFormatter("",(Object)(_albarannav))+" en navision, o no tiene lineas no corregidas de tipo producto."),"Aviso");
RDebugUtils.currentLine=98959382;
 //BA.debugLineNum = 98959382;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=98959383;
 //BA.debugLineNum = 98959383;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=98959384;
 //BA.debugLineNum = 98959384;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=98959386;
 //BA.debugLineNum = 98959386;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=98959387;
 //BA.debugLineNum = 98959387;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=98959388;
 //BA.debugLineNum = 98959388;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=98959389;
 //BA.debugLineNum = 98959389;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=98959392;
 //BA.debugLineNum = 98959392;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=98959393;
 //BA.debugLineNum = 98959393;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
RDebugUtils.currentLine=98435072;
 //BA.debugLineNum = 98435072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=98435073;
 //BA.debugLineNum = 98435073;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=98435074;
 //BA.debugLineNum = 98435074;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=98435076;
 //BA.debugLineNum = 98435076;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=98435077;
 //BA.debugLineNum = 98435077;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=98435079;
 //BA.debugLineNum = 98435079;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=98435080;
 //BA.debugLineNum = 98435080;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=98435081;
 //BA.debugLineNum = 98435081;BA.debugLine="Private btnSalir As B4XView";
_btnsalir = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=98435082;
 //BA.debugLineNum = 98435082;BA.debugLine="Private btnSeleccionarDocumento As B4XView";
_btnseleccionardocumento = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=98435083;
 //BA.debugLineNum = 98435083;BA.debugLine="Private lblDocumento As B4XView";
_lbldocumento = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=98435084;
 //BA.debugLineNum = 98435084;BA.debugLine="Private pnlFondo As B4XView";
_pnlfondo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=98435085;
 //BA.debugLineNum = 98435085;BA.debugLine="Private txtDocumento As B4XView";
_txtdocumento = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=98435087;
 //BA.debugLineNum = 98435087;BA.debugLine="Private CarpetaFicherosCSV As String";
_carpetaficheroscsv = "";
RDebugUtils.currentLine=98435088;
 //BA.debugLineNum = 98435088;BA.debugLine="Private CarpetaFicherosPDF As String";
_carpetaficherospdf = "";
RDebugUtils.currentLine=98435089;
 //BA.debugLineNum = 98435089;BA.debugLine="Private BuzonCompartidoEmailEnvioInfo As String";
_buzoncompartidoemailenvioinfo = "";
RDebugUtils.currentLine=98435090;
 //BA.debugLineNum = 98435090;BA.debugLine="Private BuzonCompartidoEmailEnvioInfo As String";
_buzoncompartidoemailenvioinfo = "";
RDebugUtils.currentLine=98435091;
 //BA.debugLineNum = 98435091;BA.debugLine="Private DireccionSeleccionadaRemitenteEmails As S";
_direccionseleccionadaremitenteemails = "";
RDebugUtils.currentLine=98435092;
 //BA.debugLineNum = 98435092;BA.debugLine="Private DireccionDestinoEmails As String";
_direcciondestinoemails = "";
RDebugUtils.currentLine=98435093;
 //BA.debugLineNum = 98435093;BA.debugLine="Private DireccionCCDestinoEmails As String";
_direccionccdestinoemails = "";
RDebugUtils.currentLine=98435094;
 //BA.debugLineNum = 98435094;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
RDebugUtils.currentLine=98762752;
 //BA.debugLineNum = 98762752;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=98762760;
 //BA.debugLineNum = 98762760;BA.debugLine="End Sub";
return "";
}
public String  _crearvbsscriptdireccionremitenteemailoutlook(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "crearvbsscriptdireccionremitenteemailoutlook", false))
	 {return ((String) Debug.delegate(ba, "crearvbsscriptdireccionremitenteemailoutlook", null));}
String _svbscript = "";
RDebugUtils.currentLine=99418112;
 //BA.debugLineNum = 99418112;BA.debugLine="Sub CrearVBSScriptDireccionRemitenteEmailOutlook";
RDebugUtils.currentLine=99418114;
 //BA.debugLineNum = 99418114;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlook";
__ref._borrarvbsscriptdireccionremitenteemailoutlook /*String*/ (null);
RDebugUtils.currentLine=99418116;
 //BA.debugLineNum = 99418116;BA.debugLine="Dim sVBscript As String";
_svbscript = "";
RDebugUtils.currentLine=99418118;
 //BA.debugLineNum = 99418118;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
_svbscript = ("\n"+"		Option Explicit\n"+"		On Error Resume Next\n"+"		Dim xOLApp, olAccounts\n"+"		Dim objStdOut,objStdErr\n"+"			\n"+"		Set objStdOut = WScript.StdOut\n"+"		Set objStdErr = WScript.StdErr\n"+"			\n"+"	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"+"		Set xOLApp =GetObject(, \"Outlook.Application\")\n"+"		If Err.Number<>0 Then\n"+"			If Err.Number=429 Then\n"+"	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"			Else\n"+"	'MsgBox Err.Number & \" \" & Err.Description\n"+"				objStdErr.Write Err.Number & \" \" & Err.Description\n"+"			End If\n"+"			WScript.Quit (1) 'return code 1\n"+"		End If\n"+"\n"+"		Dim i\n"+"		For i = 1 To xOLApp.Session.Accounts.count\n"+"			objStdOut.Write xOLApp.Session.Accounts.Item(i) & \",\"\n"+"		Next\n"+"		Set xOLApp = Nothing\n"+"		If Err.Number<>0 Then\n"+"			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"+"			WScript.Quit (1)\n"+"		Else\n"+"			WScript.Quit (0)\n"+"		End If\n"+"			");
RDebugUtils.currentLine=99418175;
 //BA.debugLineNum = 99418175;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc.vbs\"";
__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs",_svbscript);
RDebugUtils.currentLine=99418176;
 //BA.debugLineNum = 99418176;BA.debugLine="End Sub";
return "";
}
public String  _crearvbsscriptenvioemailoutlookhtml(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "crearvbsscriptenvioemailoutlookhtml", false))
	 {return ((String) Debug.delegate(ba, "crearvbsscriptenvioemailoutlookhtml", null));}
String _svbscript = "";
RDebugUtils.currentLine=99811328;
 //BA.debugLineNum = 99811328;BA.debugLine="Sub CrearVBSScriptEnvioEmailOutlookHTML";
RDebugUtils.currentLine=99811330;
 //BA.debugLineNum = 99811330;BA.debugLine="BorrarVBSScriptEnvioEmailOutlook";
__ref._borrarvbsscriptenvioemailoutlook /*String*/ (null);
RDebugUtils.currentLine=99811332;
 //BA.debugLineNum = 99811332;BA.debugLine="Dim sVBscript As String";
_svbscript = "";
RDebugUtils.currentLine=99811334;
 //BA.debugLineNum = 99811334;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
_svbscript = ("\n"+"		Option Explicit\n"+"		On Error Resume Next\n"+"\n"+"		Dim objStdOut,objStdErr\n"+"			\n"+"		Set objStdOut = WScript.StdOut\n"+"		Set objStdErr = WScript.StdErr\n"+"		\n"+"		Dim xOLApp\n"+"		Dim objMailItem\n"+"		\n"+"	'Dim OutAccount\n"+"		\n"+"		Dim signature\n"+"			\n"+"	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"+"		Set xOLApp =GetObject(, \"Outlook.Application\")\n"+"		If Err.Number<>0 Then\n"+"			If Err.Number=429 Then\n"+"	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"			Else\n"+"	'MsgBox Err.Number & \" \" & Err.Description\n"+"				objStdErr.Write Err.Number & \" \" & Err.Description\n"+"			End If\n"+"			WScript.Quit (1) 'return code 1\n"+"		End If\n"+"		Set objMailItem = xOLApp.CreateItem(0)\n"+"		\n"+"   		objMailItem.Display\n"+"		signature = objMailItem.HTMLBody\n"+"		\n"+"	'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))\n"+"		\n"+"		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)\n"+"	'objMailItem.SendUsingAccount = WScript.Arguments(0)\n"+"	'objMailItem.SendUsingAccount = OutAccount\n"+"	'objMailItem.SentOnBehalfOfName = OutAccount\n"+"		\n"+"		objMailItem.To = WScript.Arguments(1)\n"+"		if WScript.Arguments(2)<>\"None\" then\n"+"			objMailItem.CC = WScript.Arguments(2)\n"+"		end if\n"+"		objMailItem.Subject = WScript.Arguments(3)\n"+"	'objMailItem.HTMLBody = WScript.Arguments(4) & \"<br><br>\" & objMailItem.HTMLBody & \"</p>\"\n"+"		objMailItem.HTMLBody = \"<p><br>\" & WScript.Arguments(4) & \"<br>\" & signature & \"</p>\"\n"+"		objMailItem.Attachments.Add WScript.Arguments(5)\n"+"		if WScript.Arguments(6)<>\"\" then\n"+"			objMailItem.Attachments.Add WScript.Arguments(6)\n"+"		end if\n"+"	'objMailItem.Send\n"+"		Set xOLApp = Nothing\n"+"		Set objMailItem = Nothing\n"+"		If Err.Number = 0 Then\n"+"			objStdOut.Write \"Email enviado\"\n"+"			WScript.Quit (0)\n"+"		Else\n"+"			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"+"			WScript.Quit (1)\n"+"		End If\n"+"			");
RDebugUtils.currentLine=99811396;
 //BA.debugLineNum = 99811396;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc2.vbs";
__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs",_svbscript);
RDebugUtils.currentLine=99811397;
 //BA.debugLineNum = 99811397;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ejecutarvbsscriptdireccionesemail(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "ejecutarvbsscriptdireccionesemail", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ejecutarvbsscriptdireccionesemail", null));}
ResumableSub_EjecutarVBSScriptDireccionesEmail rsub = new ResumableSub_EjecutarVBSScriptDireccionesEmail(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EjecutarVBSScriptDireccionesEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptDireccionesEmail(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=99614721;
 //BA.debugLineNum = 99614721;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=99614722;
 //BA.debugLineNum = 99614722;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=99614723;
 //BA.debugLineNum = 99614723;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=99614724;
 //BA.debugLineNum = 99614724;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
_shl.Initialize("shl","c:\\windows\\system32\\cscript.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"//nologo","smfpromc.vbs"}));
RDebugUtils.currentLine=99614725;
 //BA.debugLineNum = 99614725;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
_shl.setWorkingDirectory(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder());
RDebugUtils.currentLine=99614726;
 //BA.debugLineNum = 99614726;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=99614727;
 //BA.debugLineNum = 99614727;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=99614728;
 //BA.debugLineNum = 99614728;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "ejecutarvbsscriptdireccionesemail"), null);
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
RDebugUtils.currentLine=99614729;
 //BA.debugLineNum = 99614729;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=99614730;
 //BA.debugLineNum = 99614730;BA.debugLine="Log(\"Success\")";
parent.__c.LogImpl("899614730","Success",0);
RDebugUtils.currentLine=99614731;
 //BA.debugLineNum = 99614731;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("899614731",_stdout,0);
RDebugUtils.currentLine=99614732;
 //BA.debugLineNum = 99614732;BA.debugLine="mRes.Put(\"Success\",True)";
_mres.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=99614733;
 //BA.debugLineNum = 99614733;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
_mres.Put((Object)("StdOut"),(Object)(_stdout));
RDebugUtils.currentLine=99614734;
 //BA.debugLineNum = 99614734;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
_mres.Put((Object)("StdErr"),(Object)(_stderr));
RDebugUtils.currentLine=99614735;
 //BA.debugLineNum = 99614735;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
_mres.Put((Object)("ExitCode"),(Object)(_exitcode));
RDebugUtils.currentLine=99614736;
 //BA.debugLineNum = 99614736;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=99614737;
 //BA.debugLineNum = 99614737;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ejecutarvbsscriptenviaremail(b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _senderaddr,String _receiveraddr,String _ccreceiveraddr,String _subject,String _body,String _fileattch,String _fileattch2) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "ejecutarvbsscriptenviaremail", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ejecutarvbsscriptenviaremail", new Object[] {_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2}));}
ResumableSub_EjecutarVBSScriptEnviarEmail rsub = new ResumableSub_EjecutarVBSScriptEnviarEmail(this,__ref,_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EjecutarVBSScriptEnviarEmail extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptEnviarEmail(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref,String _senderaddr,String _receiveraddr,String _ccreceiveraddr,String _subject,String _body,String _fileattch,String _fileattch2) {
this.parent = parent;
this.__ref = __ref;
this._senderaddr = _senderaddr;
this._receiveraddr = _receiveraddr;
this._ccreceiveraddr = _ccreceiveraddr;
this._subject = _subject;
this._body = _body;
this._fileattch = _fileattch;
this._fileattch2 = _fileattch2;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
String _senderaddr;
String _receiveraddr;
String _ccreceiveraddr;
String _subject;
String _body;
String _fileattch;
String _fileattch2;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=99680258;
 //BA.debugLineNum = 99680258;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
_body = _body.replace(parent.__c.CRLF,"<br>");
RDebugUtils.currentLine=99680260;
 //BA.debugLineNum = 99680260;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=99680261;
 //BA.debugLineNum = 99680261;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=99680262;
 //BA.debugLineNum = 99680262;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=99680263;
 //BA.debugLineNum = 99680263;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
_shl.Initialize("shl","c:\\windows\\system32\\cscript.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"//nologo","smfpromc2.vbs",_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2}));
RDebugUtils.currentLine=99680264;
 //BA.debugLineNum = 99680264;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
_shl.setWorkingDirectory(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder());
RDebugUtils.currentLine=99680265;
 //BA.debugLineNum = 99680265;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=99680266;
 //BA.debugLineNum = 99680266;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=99680267;
 //BA.debugLineNum = 99680267;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "ejecutarvbsscriptenviaremail"), null);
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
RDebugUtils.currentLine=99680268;
 //BA.debugLineNum = 99680268;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=99680269;
 //BA.debugLineNum = 99680269;BA.debugLine="Log(\"Success: \" & Success)";
parent.__c.LogImpl("899680269","Success: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=99680270;
 //BA.debugLineNum = 99680270;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("899680270",_stdout,0);
RDebugUtils.currentLine=99680271;
 //BA.debugLineNum = 99680271;BA.debugLine="mRes.Put(\"Success\",True)";
_mres.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=99680272;
 //BA.debugLineNum = 99680272;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
_mres.Put((Object)("StdOut"),(Object)(_stdout));
RDebugUtils.currentLine=99680273;
 //BA.debugLineNum = 99680273;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
_mres.Put((Object)("StdErr"),(Object)(_stderr));
RDebugUtils.currentLine=99680274;
 //BA.debugLineNum = 99680274;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
_mres.Put((Object)("ExitCode"),(Object)(_exitcode));
RDebugUtils.currentLine=99680275;
 //BA.debugLineNum = 99680275;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=99680276;
 //BA.debugLineNum = 99680276;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.crepsolinformacionlogisticaalbaran __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=98566144;
 //BA.debugLineNum = 98566144;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=98566145;
 //BA.debugLineNum = 98566145;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=98566146;
 //BA.debugLineNum = 98566146;BA.debugLine="End Sub";
return "";
}
public String  _generatestring(b4j.docU.crepsolinformacionlogisticaalbaran __ref,anywheresoftware.b4a.objects.collections.List _table,String _separatorchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "generatestring", false))
	 {return ((String) Debug.delegate(ba, "generatestring", new Object[] {_table,_separatorchar}));}
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String[] _row = null;
int _i = 0;
boolean _wrap = false;
String _word = "";
RDebugUtils.currentLine=99352576;
 //BA.debugLineNum = 99352576;BA.debugLine="Sub GenerateString (Table As List, SeparatorChar A";
RDebugUtils.currentLine=99352577;
 //BA.debugLineNum = 99352577;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=99352578;
 //BA.debugLineNum = 99352578;BA.debugLine="If Table.Size = 0 Then Return \"\"";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=99352579;
 //BA.debugLineNum = 99352579;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=99352580;
 //BA.debugLineNum = 99352580;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=99352581;
 //BA.debugLineNum = 99352581;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group5 = _table;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (String[])(group5.Get(index5));
RDebugUtils.currentLine=99352582;
 //BA.debugLineNum = 99352582;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=99352583;
 //BA.debugLineNum = 99352583;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=99352584;
 //BA.debugLineNum = 99352584;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
RDebugUtils.currentLine=99352585;
 //BA.debugLineNum = 99352585;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=99352586;
 //BA.debugLineNum = 99352586;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=99352587;
 //BA.debugLineNum = 99352587;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=99352588;
 //BA.debugLineNum = 99352588;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=99352590;
 //BA.debugLineNum = 99352590;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=99352591;
 //BA.debugLineNum = 99352591;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=99352593;
 //BA.debugLineNum = 99352593;BA.debugLine="sb.Append(word)";
_sb.Append(_word);
 };
RDebugUtils.currentLine=99352595;
 //BA.debugLineNum = 99352595;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=99352597;
 //BA.debugLineNum = 99352597;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=99352598;
 //BA.debugLineNum = 99352598;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
RDebugUtils.currentLine=99352600;
 //BA.debugLineNum = 99352600;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
RDebugUtils.currentLine=99352601;
 //BA.debugLineNum = 99352601;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=99352602;
 //BA.debugLineNum = 99352602;BA.debugLine="End Sub";
return "";
}
public String  _htmlbodyemail(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "htmlbodyemail", false))
	 {return ((String) Debug.delegate(ba, "htmlbodyemail", null));}
String _strbodyhtml = "";
RDebugUtils.currentLine=99745792;
 //BA.debugLineNum = 99745792;BA.debugLine="Sub HTMLBodyEmail As String";
RDebugUtils.currentLine=99745793;
 //BA.debugLineNum = 99745793;BA.debugLine="Dim strBodyHTML As String";
_strbodyhtml = "";
RDebugUtils.currentLine=99745794;
 //BA.debugLineNum = 99745794;BA.debugLine="strBodyHTML = $\"<p>Buenos días<br><br> Adjunto el";
_strbodyhtml = ("<p>Buenos días<br><br>\n"+"Adjunto el albarán en pdf y el archivo csv para que procedáis a la preparación de la mercancía y su envío a la mayor brevedad posible.<br>\n"+"En caso de alguna incidencia por favor indicádnoslo.<br>\n"+"<br>Muchas gracias");
RDebugUtils.currentLine=99745798;
 //BA.debugLineNum = 99745798;BA.debugLine="Return strBodyHTML";
if (true) return _strbodyhtml;
RDebugUtils.currentLine=99745799;
 //BA.debugLineNum = 99745799;BA.debugLine="End Sub";
return "";
}
public String[]  _mapkeystoarray(b4j.docU.crepsolinformacionlogisticaalbaran __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "mapkeystoarray", false))
	 {return ((String[]) Debug.delegate(ba, "mapkeystoarray", new Object[] {_mdata}));}
String[] _arr = null;
int _idx = 0;
String _key = "";
RDebugUtils.currentLine=99155968;
 //BA.debugLineNum = 99155968;BA.debugLine="Sub mapKeysToArray(mData As Map) As String()";
RDebugUtils.currentLine=99155969;
 //BA.debugLineNum = 99155969;BA.debugLine="Dim arr(mData.Size) As String";
_arr = new String[_mdata.getSize()];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=99155970;
 //BA.debugLineNum = 99155970;BA.debugLine="Dim iDx As Int";
_idx = 0;
RDebugUtils.currentLine=99155971;
 //BA.debugLineNum = 99155971;BA.debugLine="For Each key As String In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=99155972;
 //BA.debugLineNum = 99155972;BA.debugLine="arr(iDx)=key";
_arr[_idx] = _key;
RDebugUtils.currentLine=99155973;
 //BA.debugLineNum = 99155973;BA.debugLine="iDx=iDx+1";
_idx = (int) (_idx+1);
 }
};
RDebugUtils.currentLine=99155975;
 //BA.debugLineNum = 99155975;BA.debugLine="Return arr";
if (true) return _arr;
RDebugUtils.currentLine=99155976;
 //BA.debugLineNum = 99155976;BA.debugLine="End Sub";
return null;
}
public Object[]  _maptoarrayofstringsconcamposfecha(b4j.docU.crepsolinformacionlogisticaalbaran __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "maptoarrayofstringsconcamposfecha", false))
	 {return ((Object[]) Debug.delegate(ba, "maptoarrayofstringsconcamposfecha", new Object[] {_m}));}
Object[] _arr = null;
int _i = 0;
Object _value = null;
Object _key = null;
int _intvalue = 0;
String _svalue = "";
RDebugUtils.currentLine=99287040;
 //BA.debugLineNum = 99287040;BA.debugLine="public Sub mapToArrayOfStringsConCamposFecha(m As";
RDebugUtils.currentLine=99287041;
 //BA.debugLineNum = 99287041;BA.debugLine="Dim arr(m.Size * 2) As Object  'array size is dou";
_arr = new Object[(int) (_m.getSize()*2)];
{
int d0 = _arr.length;
for (int i0 = 0;i0 < d0;i0++) {
_arr[i0] = new Object();
}
}
;
RDebugUtils.currentLine=99287042;
 //BA.debugLineNum = 99287042;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=99287043;
 //BA.debugLineNum = 99287043;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=99287044;
 //BA.debugLineNum = 99287044;BA.debugLine="For Each key As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _m.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=99287046;
 //BA.debugLineNum = 99287046;BA.debugLine="value=m.Get(key)";
_value = _m.Get(_key);
RDebugUtils.currentLine=99287047;
 //BA.debugLineNum = 99287047;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
__c.LogImpl("899287047",("key="+__c.SmartStringFormatter("",_key)+", value="+__c.SmartStringFormatter("",_value)+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=99287048;
 //BA.debugLineNum = 99287048;BA.debugLine="arr(i)=key";
_arr[_i] = _key;
RDebugUtils.currentLine=99287049;
 //BA.debugLineNum = 99287049;BA.debugLine="i = i +1";
_i = (int) (_i+1);
RDebugUtils.currentLine=99287050;
 //BA.debugLineNum = 99287050;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
if ((BA.ObjectToString(_key)).toUpperCase().startsWith("FECHA") && _i%2==0) { 
RDebugUtils.currentLine=99287051;
 //BA.debugLineNum = 99287051;BA.debugLine="arr(i)=DateTime.Date(value)";
_arr[_i] = (Object)(__c.DateTime.Date(BA.ObjectToLongNumber(_value)));
 }else {
RDebugUtils.currentLine=99287053;
 //BA.debugLineNum = 99287053;BA.debugLine="If value Is String Then";
if (_value instanceof String) { 
RDebugUtils.currentLine=99287054;
 //BA.debugLineNum = 99287054;BA.debugLine="arr(i)=value";
_arr[_i] = _value;
 }else {
RDebugUtils.currentLine=99287056;
 //BA.debugLineNum = 99287056;BA.debugLine="Dim intValue As Int=value";
_intvalue = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=99287057;
 //BA.debugLineNum = 99287057;BA.debugLine="Dim sValue As String=intValue";
_svalue = BA.NumberToString(_intvalue);
RDebugUtils.currentLine=99287058;
 //BA.debugLineNum = 99287058;BA.debugLine="arr(i)=sValue";
_arr[_i] = (Object)(_svalue);
 };
 };
RDebugUtils.currentLine=99287061;
 //BA.debugLineNum = 99287061;BA.debugLine="i =i +1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=99287064;
 //BA.debugLineNum = 99287064;BA.debugLine="Return arr";
if (true) return _arr;
RDebugUtils.currentLine=99287065;
 //BA.debugLineNum = 99287065;BA.debugLine="End Sub";
return null;
}
public Object[]  _mapvaluestoarrayofstringsconcamposfecha(b4j.docU.crepsolinformacionlogisticaalbaran __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "mapvaluestoarrayofstringsconcamposfecha", false))
	 {return ((Object[]) Debug.delegate(ba, "mapvaluestoarrayofstringsconcamposfecha", new Object[] {_m}));}
String[] _arr = null;
int _i = 0;
Object _value = null;
Object _key = null;
String _svalue = "";
int _intvalue = 0;
RDebugUtils.currentLine=99221504;
 //BA.debugLineNum = 99221504;BA.debugLine="public Sub mapValuesToArrayOfStringsConCamposFecha";
RDebugUtils.currentLine=99221505;
 //BA.debugLineNum = 99221505;BA.debugLine="Dim arr(m.Size) As String  'array size is double";
_arr = new String[_m.getSize()];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=99221506;
 //BA.debugLineNum = 99221506;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=99221507;
 //BA.debugLineNum = 99221507;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=99221508;
 //BA.debugLineNum = 99221508;BA.debugLine="For Each key As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _m.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=99221510;
 //BA.debugLineNum = 99221510;BA.debugLine="value=m.Get(key)";
_value = _m.Get(_key);
RDebugUtils.currentLine=99221511;
 //BA.debugLineNum = 99221511;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
__c.LogImpl("899221511",("key="+__c.SmartStringFormatter("",_key)+", value="+__c.SmartStringFormatter("",_value)+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=99221512;
 //BA.debugLineNum = 99221512;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
if ((BA.ObjectToString(_key)).toUpperCase().startsWith("FECHA")) { 
RDebugUtils.currentLine=99221513;
 //BA.debugLineNum = 99221513;BA.debugLine="arr(i)=DateTime.Date(value)";
_arr[_i] = __c.DateTime.Date(BA.ObjectToLongNumber(_value));
 }else {
RDebugUtils.currentLine=99221515;
 //BA.debugLineNum = 99221515;BA.debugLine="If value Is String Then";
if (_value instanceof String) { 
RDebugUtils.currentLine=99221516;
 //BA.debugLineNum = 99221516;BA.debugLine="Dim sValue As String=value";
_svalue = BA.ObjectToString(_value);
RDebugUtils.currentLine=99221517;
 //BA.debugLineNum = 99221517;BA.debugLine="sValue=sValue.Replace(TAB,\"\")";
_svalue = _svalue.replace(__c.TAB,"");
RDebugUtils.currentLine=99221518;
 //BA.debugLineNum = 99221518;BA.debugLine="arr(i)=sValue";
_arr[_i] = _svalue;
 }else {
RDebugUtils.currentLine=99221520;
 //BA.debugLineNum = 99221520;BA.debugLine="Dim intValue As Int=value";
_intvalue = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=99221521;
 //BA.debugLineNum = 99221521;BA.debugLine="Dim sValue As String=intValue";
_svalue = BA.NumberToString(_intvalue);
RDebugUtils.currentLine=99221522;
 //BA.debugLineNum = 99221522;BA.debugLine="arr(i)=sValue";
_arr[_i] = _svalue;
 };
 };
RDebugUtils.currentLine=99221525;
 //BA.debugLineNum = 99221525;BA.debugLine="i =i +1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=99221528;
 //BA.debugLineNum = 99221528;BA.debugLine="Return arr";
if (true) return (Object[])(_arr);
RDebugUtils.currentLine=99221529;
 //BA.debugLineNum = 99221529;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionardireccionremitenteemails(b4j.docU.crepsolinformacionlogisticaalbaran __ref) throws Exception{
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";
if (Debug.shouldDelegate(ba, "seleccionardireccionremitenteemails", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionardireccionremitenteemails", null));}
ResumableSub_SeleccionarDireccionRemitenteEmails rsub = new ResumableSub_SeleccionarDireccionRemitenteEmails(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarDireccionRemitenteEmails extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmails(b4j.docU.crepsolinformacionlogisticaalbaran parent,b4j.docU.crepsolinformacionlogisticaalbaran __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsolinformacionlogisticaalbaran __ref;
b4j.docU.crepsolinformacionlogisticaalbaran parent;
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
RDebugUtils.currentModule="crepsolinformacionlogisticaalbaran";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=99549186;
 //BA.debugLineNum = 99549186;BA.debugLine="wait for(EjecutarVBSScriptDireccionesEmail) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), __ref._ejecutarvbsscriptdireccionesemail /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=99549187;
 //BA.debugLineNum = 99549187;BA.debugLine="Log(\"mRes: \" & mRes)";
parent.__c.LogImpl("899549187","mRes: "+BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=99549188;
 //BA.debugLineNum = 99549188;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=99549189;
 //BA.debugLineNum = 99549189;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
_exitcode = (int)(BA.ObjectToNumber(_mres.Get((Object)("ExitCode"))));
RDebugUtils.currentLine=99549190;
 //BA.debugLineNum = 99549190;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
_stdout = BA.ObjectToString(_mres.Get((Object)("StdOut")));
RDebugUtils.currentLine=99549191;
 //BA.debugLineNum = 99549191;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
_stderr = BA.ObjectToString(_mres.Get((Object)("StdErr")));
RDebugUtils.currentLine=99549194;
 //BA.debugLineNum = 99549194;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=99549195;
 //BA.debugLineNum = 99549195;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt direcciones email"+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=99549196;
 //BA.debugLineNum = 99549196;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
RDebugUtils.currentLine=99549197;
 //BA.debugLineNum = 99549197;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=99549199;
 //BA.debugLineNum = 99549199;BA.debugLine="If ExitCode=1 Then";

case 4:
//if
this.state = 7;
if (_exitcode==1) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=99549200;
 //BA.debugLineNum = 99549200;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt direcciones email"+parent.__c.CRLF+_stderr,"Error");
RDebugUtils.currentLine=99549201;
 //BA.debugLineNum = 99549201;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 7;
;
RDebugUtils.currentLine=99549202;
 //BA.debugLineNum = 99549202;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=99549204;
 //BA.debugLineNum = 99549204;BA.debugLine="Dim sDireccionesCuentasEmail As String=StdOut.Sub";
_sdireccionescuentasemail = _stdout.substring((int) (0),(int) (_stdout.length()-1));
RDebugUtils.currentLine=99549205;
 //BA.debugLineNum = 99549205;BA.debugLine="If sDireccionesCuentasEmail=\"\" Then";
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
RDebugUtils.currentLine=99549206;
 //BA.debugLineNum = 99549206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay direcciones de email configuradas."+parent.__c.CRLF+parent.__c.CRLF+"¿Outlook no instalado?","Aviso");
RDebugUtils.currentLine=99549207;
 //BA.debugLineNum = 99549207;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
RDebugUtils.currentLine=99549208;
 //BA.debugLineNum = 99549208;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=99549211;
 //BA.debugLineNum = 99549211;BA.debugLine="Dim ArrDireccionesCuentasEmail() As String=Regex.";
_arrdireccionescuentasemail = parent.__c.Regex.Split(",",_sdireccionescuentasemail);
RDebugUtils.currentLine=99549212;
 //BA.debugLineNum = 99549212;BA.debugLine="Dim lstDireccionesCuentasEmail As List";
_lstdireccionescuentasemail = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=99549213;
 //BA.debugLineNum = 99549213;BA.debugLine="lstDireccionesCuentasEmail.Initialize";
_lstdireccionescuentasemail.Initialize();
RDebugUtils.currentLine=99549215;
 //BA.debugLineNum = 99549215;BA.debugLine="For iDx =0 To ArrDireccionesCuentasEmail.Length-1";
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
RDebugUtils.currentLine=99549216;
 //BA.debugLineNum = 99549216;BA.debugLine="lstDireccionesCuentasEmail.Add(ArrDireccionesCue";
_lstdireccionescuentasemail.Add((Object)(_arrdireccionescuentasemail[_idx]));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=99549222;
 //BA.debugLineNum = 99549222;BA.debugLine="If lstDireccionesCuentasEmail.Size=0 Then";

case 15:
//if
this.state = 18;
if (_lstdireccionescuentasemail.getSize()==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=99549223;
 //BA.debugLineNum = 99549223;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay direcciones de email configuradas."+parent.__c.CRLF+parent.__c.CRLF+"¿Outlook no instalado?","Aviso");
RDebugUtils.currentLine=99549224;
 //BA.debugLineNum = 99549224;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 18;
;
RDebugUtils.currentLine=99549225;
 //BA.debugLineNum = 99549225;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=99549230;
 //BA.debugLineNum = 99549230;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Cuenta para Enviar los Emails");
RDebugUtils.currentLine=99549231;
 //BA.debugLineNum = 99549231;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=99549232;
 //BA.debugLineNum = 99549232;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=99549233;
 //BA.debugLineNum = 99549233;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=99549234;
 //BA.debugLineNum = 99549234;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=99549235;
 //BA.debugLineNum = 99549235;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=99549237;
 //BA.debugLineNum = 99549237;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=99549238;
 //BA.debugLineNum = 99549238;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=99549239;
 //BA.debugLineNum = 99549239;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=99549241;
 //BA.debugLineNum = 99549241;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=99549242;
 //BA.debugLineNum = 99549242;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=99549244;
 //BA.debugLineNum = 99549244;BA.debugLine="B4XListDlg.Options=lstDireccionesCuentasEmail";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstdireccionescuentasemail;
RDebugUtils.currentLine=99549245;
 //BA.debugLineNum = 99549245;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=99549247;
 //BA.debugLineNum = 99549247;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=99549254;
 //BA.debugLineNum = 99549254;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=99549255;
 //BA.debugLineNum = 99549255;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=99549257;
 //BA.debugLineNum = 99549257;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=99549258;
 //BA.debugLineNum = 99549258;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=99549259;
 //BA.debugLineNum = 99549259;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=99549262;
 //BA.debugLineNum = 99549262;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsolinformacionlogisticaalbaran", "seleccionardireccionremitenteemails"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=99549263;
 //BA.debugLineNum = 99549263;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=99549266;
 //BA.debugLineNum = 99549266;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=99549270;
 //BA.debugLineNum = 99549270;BA.debugLine="DireccionSeleccionadaRemitenteEmails=B4XListDlg.S";
__ref._direccionseleccionadaremitenteemails /*String*/  = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=99549272;
 //BA.debugLineNum = 99549272;BA.debugLine="If DireccionSeleccionadaRemitenteEmails=\"atencion";
if (true) break;

case 27:
//if
this.state = 32;
if ((__ref._direccionseleccionadaremitenteemails /*String*/ ).equals("atencionalcliente@proin-pinilla.com")) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
__ref._direccionseleccionadaremitenteemails /*String*/  = "Servicio de Atención al Cliente";
if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=99549274;
 //BA.debugLineNum = 99549274;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=99549317;
 //BA.debugLineNum = 99549317;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean SetForegroundWindow(String title, boolean justFind) {
    User32 user32 = com.sun.jna.platform.win32.User32.INSTANCE;
    for (com.sun.jna.platform.DesktopWindow s : com.sun.jna.platform.WindowUtils.getAllWindows(false)) {
        String t = s.getTitle();
        if (t.toLowerCase().equals(title.toLowerCase())) {
            if (!justFind) {
                user32.SetForegroundWindow(s.getHWND());
                user32.SetFocus(s.getHWND());
                user32.ShowWindow(s.getHWND(), 3);
            }
            return true;
        }
        
    }
    return false;
}
}