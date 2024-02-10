package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cevaluacionproveedoresproveedoresfijos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cevaluacionproveedoresproveedoresfijos", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cevaluacionproveedoresproveedoresfijos.class).invoke(this, new Object[] {null});
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
public b4j.docU.jamtableview _jamtableviewproveedoresfijosevaluacionproveedores = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
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
public String  _btnsalir_click(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=61865984;
 //BA.debugLineNum = 61865984;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=61865985;
 //BA.debugLineNum = 61865985;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=61865986;
 //BA.debugLineNum = 61865986;BA.debugLine="End Sub";
return "";
}
public String  _salirform(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=61931520;
 //BA.debugLineNum = 61931520;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=61931521;
 //BA.debugLineNum = 61931521;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=61931522;
 //BA.debugLineNum = 61931522;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=61931523;
 //BA.debugLineNum = 61931523;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=61931524;
 //BA.debugLineNum = 61931524;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=61931525;
 //BA.debugLineNum = 61931525;BA.debugLine="CallSubDelayed(mCallBack,\"cEvaluacionProveedoresP";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,"cEvaluacionProveedoresProveedoresFijos_Done");
RDebugUtils.currentLine=61931526;
 //BA.debugLineNum = 61931526;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistaproveedoresfijosevaluacion(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "cargalistaproveedoresfijosevaluacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistaproveedoresfijosevaluacion", null));}
ResumableSub_CargaListaProveedoresFijosEvaluacion rsub = new ResumableSub_CargaListaProveedoresFijosEvaluacion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaProveedoresFijosEvaluacion extends BA.ResumableSub {
public ResumableSub_CargaListaProveedoresFijosEvaluacion(b4j.docU.cevaluacionproveedoresproveedoresfijos parent,b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedoresproveedoresfijos __ref;
b4j.docU.cevaluacionproveedoresproveedoresfijos parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62062594;
 //BA.debugLineNum = 62062594;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblEvaluacionProve";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblEvaluacionProveedoresListaProveedoresFijos");
RDebugUtils.currentLine=62062596;
 //BA.debugLineNum = 62062596;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=62062597;
 //BA.debugLineNum = 62062597;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62062598;
 //BA.debugLineNum = 62062598;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=62062599;
 //BA.debugLineNum = 62062599;BA.debugLine="Dim Comando As String=\"EvaluacionProveedoresLista";
_comando = "EvaluacionProveedoresListaProveedoresFijos";
RDebugUtils.currentLine=62062600;
 //BA.debugLineNum = 62062600;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=62062602;
 //BA.debugLineNum = 62062602;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "cargalistaproveedoresfijosevaluacion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=62062604;
 //BA.debugLineNum = 62062604;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=62062605;
 //BA.debugLineNum = 62062605;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=62062606;
 //BA.debugLineNum = 62062606;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=62062607;
 //BA.debugLineNum = 62062607;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "cargalistaproveedoresfijosevaluacion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=62062608;
 //BA.debugLineNum = 62062608;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=62062609;
 //BA.debugLineNum = 62062609;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=62062612;
 //BA.debugLineNum = 62062612;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=62062613;
 //BA.debugLineNum = 62062613;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=62062614;
 //BA.debugLineNum = 62062614;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se han co";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se han configurado proveedores fijos para la evaluación.","Aviso");
RDebugUtils.currentLine=62062615;
 //BA.debugLineNum = 62062615;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "cargalistaproveedoresfijosevaluacion"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=62062616;
 //BA.debugLineNum = 62062616;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=62062617;
 //BA.debugLineNum = 62062617;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=62062619;
 //BA.debugLineNum = 62062619;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=62062623;
 //BA.debugLineNum = 62062623;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=62062624;
 //BA.debugLineNum = 62062624;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=62062626;
 //BA.debugLineNum = 62062626;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
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
RDebugUtils.currentLine=62062629;
 //BA.debugLineNum = 62062629;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=62062630;
 //BA.debugLineNum = 62062630;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
RDebugUtils.currentLine=61603840;
 //BA.debugLineNum = 61603840;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=61603841;
 //BA.debugLineNum = 61603841;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=61603842;
 //BA.debugLineNum = 61603842;BA.debugLine="Private jamTableViewProveedoresFijosEvaluacionPro";
_jamtableviewproveedoresfijosevaluacionproveedores = new b4j.docU.jamtableview();
RDebugUtils.currentLine=61603843;
 //BA.debugLineNum = 61603843;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=61603844;
 //BA.debugLineNum = 61603844;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=61603845;
 //BA.debugLineNum = 61603845;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=61603846;
 //BA.debugLineNum = 61603846;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=61603848;
 //BA.debugLineNum = 61603848;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=61603850;
 //BA.debugLineNum = 61603850;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=61603851;
 //BA.debugLineNum = 61603851;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61603852;
 //BA.debugLineNum = 61603852;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61603853;
 //BA.debugLineNum = 61603853;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=61800448;
 //BA.debugLineNum = 61800448;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=61800449;
 //BA.debugLineNum = 61800449;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=61800450;
 //BA.debugLineNum = 61800450;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent}));}
RDebugUtils.currentLine=61669376;
 //BA.debugLineNum = 61669376;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=61669377;
 //BA.debugLineNum = 61669377;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=61669378;
 //BA.debugLineNum = 61669378;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=61669379;
 //BA.debugLineNum = 61669379;BA.debugLine="Background= xui.CreatePanel(\"backgroundProveedore";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"backgroundProveedoresFijos");
RDebugUtils.currentLine=61669380;
 //BA.debugLineNum = 61669380;BA.debugLine="Background.Tag = \"backgroundProveedoresFijos\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("backgroundProveedoresFijos"));
RDebugUtils.currentLine=61669381;
 //BA.debugLineNum = 61669381;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=61669382;
 //BA.debugLineNum = 61669382;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=61669385;
 //BA.debugLineNum = 61669385;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=61669390;
 //BA.debugLineNum = 61669390;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=61669391;
 //BA.debugLineNum = 61669391;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cevaluacionproveedoresproveedoresfijos parent,b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cevaluacionproveedoresproveedoresfijos __ref;
b4j.docU.cevaluacionproveedoresproveedoresfijos parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61734915;
 //BA.debugLineNum = 61734915;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=61734917;
 //BA.debugLineNum = 61734917;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=61734918;
 //BA.debugLineNum = 61734918;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=61734919;
 //BA.debugLineNum = 61734919;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=61734921;
 //BA.debugLineNum = 61734921;BA.debugLine="frm.RootPane.LoadLayout(\"scrEvaluacionProveedores";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrEvaluacionProveedoresProveedoresFijos");
RDebugUtils.currentLine=61734923;
 //BA.debugLineNum = 61734923;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"),(int) (0));
this.state = 32;
return;
case 32:
//C
this.state = 1;
;
RDebugUtils.currentLine=61734925;
 //BA.debugLineNum = 61734925;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=61734927;
 //BA.debugLineNum = 61734927;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"  Proveedores";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"  Proveedores fijos Evaluación ");
RDebugUtils.currentLine=61734929;
 //BA.debugLineNum = 61734929;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=61734930;
 //BA.debugLineNum = 61734930;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=61734931;
 //BA.debugLineNum = 61734931;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=61734933;
 //BA.debugLineNum = 61734933;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=61734934;
 //BA.debugLineNum = 61734934;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=61734936;
 //BA.debugLineNum = 61734936;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Nuevo Proveedor Fijo Evaluación","NuevoProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xe148))),__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=61734937;
 //BA.debugLineNum = 61734937;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedores";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Quitar Proveedor Fijo Evaluación","QuitarProveedorFijoEvaluacion",BA.ObjectToString(parent.__c.Chr(((int)0xe15d))),__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=61734940;
 //BA.debugLineNum = 61734940;BA.debugLine="Dim rSub As ResumableSub=jamTableViewProveedoresF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaEvaluacionProveedoresListaProveedoresFijos.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=61734941;
 //BA.debugLineNum = 61734941;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _rsub);
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=61734942;
 //BA.debugLineNum = 61734942;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("861734942",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=61734943;
 //BA.debugLineNum = 61734943;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=61734944;
 //BA.debugLineNum = 61734944;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=61734945;
 //BA.debugLineNum = 61734945;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
RDebugUtils.currentLine=61734946;
 //BA.debugLineNum = 61734946;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=61734947;
 //BA.debugLineNum = 61734947;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=61734950;
 //BA.debugLineNum = 61734950;BA.debugLine="Wait For(CargaListaProveedoresFijosEvaluacion) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), __ref._cargalistaproveedoresfijosevaluacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=61734951;
 //BA.debugLineNum = 61734951;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=61734952;
 //BA.debugLineNum = 61734952;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if ((_accion).equals("NOK")) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=61734954;
 //BA.debugLineNum = 61734954;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblEvaluacionProveedoresListaProveedoresFijos order by NombreProveedorFijoEvaluacionProveedoresaluacionProveedores");
RDebugUtils.currentLine=61734956;
 //BA.debugLineNum = 61734956;BA.debugLine="Dim rSub As ResumableSub=jamTableViewProveedoresF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=61734957;
 //BA.debugLineNum = 61734957;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _rsub);
this.state = 36;
return;
case 36:
//C
this.state = 11;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=61734958;
 //BA.debugLineNum = 61734958;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=61734959;
 //BA.debugLineNum = 61734959;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=61734960;
 //BA.debugLineNum = 61734960;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 11:
//if
this.state = 31;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=61734961;
 //BA.debugLineNum = 61734961;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 14:
//if
this.state = 21;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=61734962;
 //BA.debugLineNum = 61734962;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=61734963;
 //BA.debugLineNum = 61734963;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 17;
;
RDebugUtils.currentLine=61734965;
 //BA.debugLineNum = 61734965;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=61734966;
 //BA.debugLineNum = 61734966;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 38;
return;
case 38:
//C
this.state = 17;
_rint = (int) result[1];
;
RDebugUtils.currentLine=61734967;
 //BA.debugLineNum = 61734967;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=61734968;
 //BA.debugLineNum = 61734968;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedo";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=61734969;
 //BA.debugLineNum = 61734969;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=61734972;
 //BA.debugLineNum = 61734972;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=61734974;
 //BA.debugLineNum = 61734974;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 21:
//if
this.state = 30;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=61734975;
 //BA.debugLineNum = 61734975;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 24:
//if
this.state = 29;
if (parent.__c.True!=BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=61734976;
 //BA.debugLineNum = 61734976;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=61734977;
 //BA.debugLineNum = 61734977;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cevaluacionproveedoresproveedoresfijos", "show"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=61734979;
 //BA.debugLineNum = 61734979;BA.debugLine="jamTableViewProveedoresFijosEvaluacionProveedo";
__ref._jamtableviewproveedoresfijosevaluacionproveedores /*b4j.docU.jamtableview*/ ._setplaceholdertext /*String*/ (null,"");
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=61734984;
 //BA.debugLineNum = 61734984;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview(b4j.docU.cevaluacionproveedoresproveedoresfijos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cevaluacionproveedoresproveedoresfijos";
if (Debug.shouldDelegate(ba, "jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewproveedoresfijosevaluacionproveedores_accionsalirjamtableview", null));}
RDebugUtils.currentLine=61997056;
 //BA.debugLineNum = 61997056;BA.debugLine="Sub jamTableViewProveedoresFijosEvaluacionProveedo";
RDebugUtils.currentLine=61997058;
 //BA.debugLineNum = 61997058;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=61997059;
 //BA.debugLineNum = 61997059;BA.debugLine="End Sub";
return "";
}
}