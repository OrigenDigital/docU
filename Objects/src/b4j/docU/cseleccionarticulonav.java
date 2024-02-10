package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cseleccionarticulonav extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cseleccionarticulonav", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cseleccionarticulonav.class).invoke(this, new Object[] {null});
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
public b4j.docU.jamtableview _jamtableview1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public b4j.docU.b4xdialog _dialog = null;
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.collections.Map _mdatosarticuloseleccionado = null;
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
public String  _initialize(b4j.docU.cseleccionarticulonav __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent}));}
RDebugUtils.currentLine=100139008;
 //BA.debugLineNum = 100139008;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=100139009;
 //BA.debugLineNum = 100139009;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=100139010;
 //BA.debugLineNum = 100139010;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=100139011;
 //BA.debugLineNum = 100139011;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=100139012;
 //BA.debugLineNum = 100139012;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=100139013;
 //BA.debugLineNum = 100139013;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=100139014;
 //BA.debugLineNum = 100139014;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=100139016;
 //BA.debugLineNum = 100139016;BA.debugLine="mDatosArticuloSeleccionado.Initialize";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=100139017;
 //BA.debugLineNum = 100139017;BA.debugLine="mDatosArticuloSeleccionado.Put(\"Articulo\",\"\")";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Articulo"),(Object)(""));
RDebugUtils.currentLine=100139018;
 //BA.debugLineNum = 100139018;BA.debugLine="mDatosArticuloSeleccionado.Put(\"DescripcionArticu";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DescripcionArticulo"),(Object)(""));
RDebugUtils.currentLine=100139019;
 //BA.debugLineNum = 100139019;BA.debugLine="mDatosArticuloSeleccionado.Put(\"ArticuloBloqueado";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ArticuloBloqueado"),(Object)(__c.False));
RDebugUtils.currentLine=100139020;
 //BA.debugLineNum = 100139020;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=100139021;
 //BA.debugLineNum = 100139021;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(b4j.docU.cseleccionarticulonav __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=100859904;
 //BA.debugLineNum = 100859904;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=100859905;
 //BA.debugLineNum = 100859905;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=100859906;
 //BA.debugLineNum = 100859906;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cseleccionarticulonav __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=100335616;
 //BA.debugLineNum = 100335616;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=100335617;
 //BA.debugLineNum = 100335617;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=100335618;
 //BA.debugLineNum = 100335618;BA.debugLine="End Sub";
return "";
}
public String  _salirform(b4j.docU.cseleccionarticulonav __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=100401152;
 //BA.debugLineNum = 100401152;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=100401153;
 //BA.debugLineNum = 100401153;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=100401154;
 //BA.debugLineNum = 100401154;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=100401155;
 //BA.debugLineNum = 100401155;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=100401156;
 //BA.debugLineNum = 100401156;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=100401157;
 //BA.debugLineNum = 100401157;BA.debugLine="CallSubDelayed2(mCallBack,\"cSeleccionArticuloNAV_";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cSeleccionArticuloNAV_Done",(Object)(__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=100401158;
 //BA.debugLineNum = 100401158;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cseleccionarticulonav __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionarticulonav";
RDebugUtils.currentLine=100073472;
 //BA.debugLineNum = 100073472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=100073473;
 //BA.debugLineNum = 100073473;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=100073474;
 //BA.debugLineNum = 100073474;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=100073475;
 //BA.debugLineNum = 100073475;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=100073476;
 //BA.debugLineNum = 100073476;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=100073477;
 //BA.debugLineNum = 100073477;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=100073480;
 //BA.debugLineNum = 100073480;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=100073481;
 //BA.debugLineNum = 100073481;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=100073482;
 //BA.debugLineNum = 100073482;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=100073484;
 //BA.debugLineNum = 100073484;BA.debugLine="Dim mDatosArticuloSeleccionado As Map";
_mdatosarticuloseleccionado = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=100073486;
 //BA.debugLineNum = 100073486;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datosarticulosnav(b4j.docU.cseleccionarticulonav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "datosarticulosnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datosarticulosnav", null));}
ResumableSub_DatosArticulosNav rsub = new ResumableSub_DatosArticulosNav(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosArticulosNav extends BA.ResumableSub {
public ResumableSub_DatosArticulosNav(b4j.docU.cseleccionarticulonav parent,b4j.docU.cseleccionarticulonav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionarticulonav __ref;
b4j.docU.cseleccionarticulonav parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=100597761;
 //BA.debugLineNum = 100597761;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=100597762;
 //BA.debugLineNum = 100597762;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=100597763;
 //BA.debugLineNum = 100597763;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=100597764;
 //BA.debugLineNum = 100597764;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=100597765;
 //BA.debugLineNum = 100597765;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=100597766;
 //BA.debugLineNum = 100597766;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=100597767;
 //BA.debugLineNum = 100597767;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=100597768;
 //BA.debugLineNum = 100597768;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=100597769;
 //BA.debugLineNum = 100597769;BA.debugLine="Comando=\"ArticulosSeleccionNAV\"";
_comando = "ArticulosSeleccionNAV";
RDebugUtils.currentLine=100597771;
 //BA.debugLineNum = 100597771;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=100597772;
 //BA.debugLineNum = 100597772;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "datosarticulosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=100597774;
 //BA.debugLineNum = 100597774;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=100597775;
 //BA.debugLineNum = 100597775;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=100597776;
 //BA.debugLineNum = 100597776;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "datosarticulosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=100597777;
 //BA.debugLineNum = 100597777;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
RDebugUtils.currentLine=100597778;
 //BA.debugLineNum = 100597778;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=100597780;
 //BA.debugLineNum = 100597780;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=100597781;
 //BA.debugLineNum = 100597781;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de Artículos NAV","Aviso");
RDebugUtils.currentLine=100597782;
 //BA.debugLineNum = 100597782;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "datosarticulosnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=100597783;
 //BA.debugLineNum = 100597783;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=100597784;
 //BA.debugLineNum = 100597784;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=100597786;
 //BA.debugLineNum = 100597786;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=100597787;
 //BA.debugLineNum = 100597787;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=100597788;
 //BA.debugLineNum = 100597788;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=100597789;
 //BA.debugLineNum = 100597789;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
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
RDebugUtils.currentLine=100597792;
 //BA.debugLineNum = 100597792;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=100597793;
 //BA.debugLineNum = 100597793;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cseleccionarticulonav __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=100270080;
 //BA.debugLineNum = 100270080;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=100270081;
 //BA.debugLineNum = 100270081;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=100270082;
 //BA.debugLineNum = 100270082;BA.debugLine="End Sub";
return "";
}
public void  _inicio(b4j.docU.cseleccionarticulonav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {Debug.delegate(ba, "inicio", null); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.cseleccionarticulonav parent,b4j.docU.cseleccionarticulonav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionarticulonav __ref;
b4j.docU.cseleccionarticulonav parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=100532226;
 //BA.debugLineNum = 100532226;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=100532227;
 //BA.debugLineNum = 100532227;BA.debugLine="wait for(DatosArticulosNav) complete (mResult As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "inicio"), __ref._datosarticulosnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=100532228;
 //BA.debugLineNum = 100532228;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=100532229;
 //BA.debugLineNum = 100532229;BA.debugLine="If mResult.Get(\"Accion\")=\"Salir\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_mresult.Get((Object)("Accion"))).equals((Object)("Salir"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=100532230;
 //BA.debugLineNum = 100532230;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=100532231;
 //BA.debugLineNum = 100532231;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=100532233;
 //BA.debugLineNum = 100532233;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=100532234;
 //BA.debugLineNum = 100532234;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=100532235;
 //BA.debugLineNum = 100532235;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=100532236;
 //BA.debugLineNum = 100532236;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "inicio"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=100532237;
 //BA.debugLineNum = 100532237;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=100532238;
 //BA.debugLineNum = 100532238;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=100532239;
 //BA.debugLineNum = 100532239;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 19;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=100532240;
 //BA.debugLineNum = 100532240;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
if (true) break;

case 8:
//if
this.state = 11;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=100532241;
 //BA.debugLineNum = 100532241;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=100532242;
 //BA.debugLineNum = 100532242;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "inicio"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=100532244;
 //BA.debugLineNum = 100532244;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 11:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=100532245;
 //BA.debugLineNum = 100532245;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=100532246;
 //BA.debugLineNum = 100532246;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "inicio"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
RDebugUtils.currentLine=100532248;
 //BA.debugLineNum = 100532248;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=100532249;
 //BA.debugLineNum = 100532249;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "inicio"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (int) result[1];
;
RDebugUtils.currentLine=100532250;
 //BA.debugLineNum = 100532250;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=100532251;
 //BA.debugLineNum = 100532251;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=100532252;
 //BA.debugLineNum = 100532252;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=100532255;
 //BA.debugLineNum = 100532255;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=100532258;
 //BA.debugLineNum = 100532258;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _show(b4j.docU.cseleccionarticulonav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cseleccionarticulonav parent,b4j.docU.cseleccionarticulonav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionarticulonav __ref;
b4j.docU.cseleccionarticulonav parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=100204547;
 //BA.debugLineNum = 100204547;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=100204549;
 //BA.debugLineNum = 100204549;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=100204550;
 //BA.debugLineNum = 100204550;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=100204551;
 //BA.debugLineNum = 100204551;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=100204553;
 //BA.debugLineNum = 100204553;BA.debugLine="frm.RootPane.LoadLayout(\"scrListaSeleccionArticu";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrListaSeleccionArticuloNAV");
RDebugUtils.currentLine=100204555;
 //BA.debugLineNum = 100204555;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=100204557;
 //BA.debugLineNum = 100204557;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=100204559;
 //BA.debugLineNum = 100204559;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Selección Ar";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Selección Artículo NAV");
RDebugUtils.currentLine=100204561;
 //BA.debugLineNum = 100204561;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=100204562;
 //BA.debugLineNum = 100204562;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=100204564;
 //BA.debugLineNum = 100204564;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=100204565;
 //BA.debugLineNum = 100204565;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=100204567;
 //BA.debugLineNum = 100204567;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=100204569;
 //BA.debugLineNum = 100204569;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configura";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaArticulosNAV.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=100204570;
 //BA.debugLineNum = 100204570;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=100204572;
 //BA.debugLineNum = 100204572;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=100204574;
 //BA.debugLineNum = 100204574;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=100204575;
 //BA.debugLineNum = 100204575;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=100204576;
 //BA.debugLineNum = 100204576;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=100204577;
 //BA.debugLineNum = 100204577;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=100204578;
 //BA.debugLineNum = 100204578;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=100204581;
 //BA.debugLineNum = 100204581;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenu";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Seleccionar Articulo","SeleccionarArticulo",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=100204583;
 //BA.debugLineNum = 100204583;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=100204584;
 //BA.debugLineNum = 100204584;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=100204585;
 //BA.debugLineNum = 100204585;BA.debugLine="cF.AliasCampoColumna=\"Bloqueado\"";
_cf.AliasCampoColumna /*String*/  = "Bloqueado";
RDebugUtils.currentLine=100204586;
 //BA.debugLineNum = 100204586;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=100204587;
 //BA.debugLineNum = 100204587;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFa";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnabooleanatipointegercheckbox /*String*/ ;
RDebugUtils.currentLine=100204588;
 //BA.debugLineNum = 100204588;BA.debugLine="jamTableView1.SetCellFactory(cF)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cf);
RDebugUtils.currentLine=100204593;
 //BA.debugLineNum = 100204593;BA.debugLine="Inicio";
__ref._inicio /*void*/ (null);
RDebugUtils.currentLine=100204594;
 //BA.debugLineNum = 100204594;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_accionsalirjamtableview(b4j.docU.cseleccionarticulonav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null); return;}
ResumableSub_jamTableView1_AccionSalirJamTableView rsub = new ResumableSub_jamTableView1_AccionSalirJamTableView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_AccionSalirJamTableView extends BA.ResumableSub {
public ResumableSub_jamTableView1_AccionSalirJamTableView(b4j.docU.cseleccionarticulonav parent,b4j.docU.cseleccionarticulonav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionarticulonav __ref;
b4j.docU.cseleccionarticulonav parent;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=100466689;
 //BA.debugLineNum = 100466689;BA.debugLine="If mDatosArticuloSeleccionado.Get(\"Articulo\")=\"\"";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Articulo"))).equals((Object)(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=100466690;
 //BA.debugLineNum = 100466690;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha s";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"No se ha seleccionado Artículo."+parent.__c.CRLF+parent.__c.CRLF+"¿Salir sin seleccionar?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=100466691;
 //BA.debugLineNum = 100466691;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "jamtableview1_accionsalirjamtableview"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=100466692;
 //BA.debugLineNum = 100466692;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=100466694;
 //BA.debugLineNum = 100466694;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=100466695;
 //BA.debugLineNum = 100466695;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_celldobleclick(b4j.docU.cseleccionarticulonav __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=100728832;
 //BA.debugLineNum = 100728832;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
RDebugUtils.currentLine=100728833;
 //BA.debugLineNum = 100728833;BA.debugLine="SeleccionarArticulo(DatosCeldaSeleccionada)";
__ref._seleccionararticulo /*void*/ (null,_datosceldaseleccionada);
RDebugUtils.currentLine=100728834;
 //BA.debugLineNum = 100728834;BA.debugLine="End Sub";
return "";
}
public void  _seleccionararticulo(b4j.docU.cseleccionarticulonav __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "seleccionararticulo", false))
	 {Debug.delegate(ba, "seleccionararticulo", new Object[] {_datosceldaseleccionada}); return;}
ResumableSub_SeleccionarArticulo rsub = new ResumableSub_SeleccionarArticulo(this,__ref,_datosceldaseleccionada);
rsub.resume(ba, null);
}
public static class ResumableSub_SeleccionarArticulo extends BA.ResumableSub {
public ResumableSub_SeleccionarArticulo(b4j.docU.cseleccionarticulonav parent,b4j.docU.cseleccionarticulonav __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
this.__ref = parent;
}
b4j.docU.cseleccionarticulonav __ref;
b4j.docU.cseleccionarticulonav parent;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada;
anywheresoftware.b4a.objects.collections.Map _mdatapk = null;
String _descripcionarticulo = "";
int _articulobloqueado = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=100794369;
 //BA.debugLineNum = 100794369;BA.debugLine="Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK";
_mdatapk = new anywheresoftware.b4a.objects.collections.Map();
_mdatapk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=100794370;
 //BA.debugLineNum = 100794370;BA.debugLine="mDatosArticuloSeleccionado.Put(\"Articulo\",mDataPK";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Articulo"),_mdatapk.Get((Object)("Articulo")));
RDebugUtils.currentLine=100794371;
 //BA.debugLineNum = 100794371;BA.debugLine="Dim DescripcionArticulo As String=jamTableView1.G";
_descripcionarticulo = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"DescripcionArticulo"));
RDebugUtils.currentLine=100794372;
 //BA.debugLineNum = 100794372;BA.debugLine="mDatosArticuloSeleccionado.Put(\"DescripcionArticu";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DescripcionArticulo"),(Object)(_descripcionarticulo));
RDebugUtils.currentLine=100794373;
 //BA.debugLineNum = 100794373;BA.debugLine="Dim ArticuloBloqueado As Int=jamTableView1.GetVal";
_articulobloqueado = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"Bloqueado")));
RDebugUtils.currentLine=100794374;
 //BA.debugLineNum = 100794374;BA.debugLine="mDatosArticuloSeleccionado.Put(\"ArticuloBloqueado";
__ref._mdatosarticuloseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ArticuloBloqueado"),(Object)(_articulobloqueado));
RDebugUtils.currentLine=100794375;
 //BA.debugLineNum = 100794375;BA.debugLine="If ArticuloBloqueado=1 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_articulobloqueado==1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=100794376;
 //BA.debugLineNum = 100794376;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=100794377;
 //BA.debugLineNum = 100794377;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=100794378;
 //BA.debugLineNum = 100794378;BA.debugLine="sb.Append(\"El artículo seleccionado (\").Append(m";
_sb.Append("El artículo seleccionado (").Append(BA.ObjectToString(_mdatapk.Get((Object)("Articulo")))).Append(" ").Append(_descripcionarticulo).Append(") está BLOQUEADO.");
RDebugUtils.currentLine=100794379;
 //BA.debugLineNum = 100794379;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
_sb.Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=100794380;
 //BA.debugLineNum = 100794380;BA.debugLine="sb.Append(\"¿Continuar?\")";
_sb.Append("¿Continuar?");
RDebugUtils.currentLine=100794381;
 //BA.debugLineNum = 100794381;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(sb.ToString";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,_sb.ToString(),"","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=100794382;
 //BA.debugLineNum = 100794382;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "seleccionararticulo"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=100794383;
 //BA.debugLineNum = 100794383;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=100794385;
 //BA.debugLineNum = 100794385;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=100794386;
 //BA.debugLineNum = 100794386;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.cseleccionarticulonav __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cseleccionarticulonav parent,b4j.docU.cseleccionarticulonav __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cseleccionarticulonav __ref;
b4j.docU.cseleccionarticulonav parent;
String _tagmenuitem;
int _fsel = 0;
Object _msa = null;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionarticulonav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=100663297;
 //BA.debugLineNum = 100663297;BA.debugLine="Select TagMenuItem";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","SeleccionarArticulo")) {
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
RDebugUtils.currentLine=100663299;
 //BA.debugLineNum = 100663299;BA.debugLine="Inicio";
__ref._inicio /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=100663301;
 //BA.debugLineNum = 100663301;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
_fsel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=100663302;
 //BA.debugLineNum = 100663302;BA.debugLine="If fSel=-1 Then";
if (true) break;

case 6:
//if
this.state = 9;
if (_fsel==-1) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=100663303;
 //BA.debugLineNum = 100663303;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ninguna fila","Aviso");
RDebugUtils.currentLine=100663304;
 //BA.debugLineNum = 100663304;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionarticulonav", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
RDebugUtils.currentLine=100663305;
 //BA.debugLineNum = 100663305;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=100663307;
 //BA.debugLineNum = 100663307;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=100663308;
 //BA.debugLineNum = 100663308;BA.debugLine="SeleccionarArticulo(Dcs)";
__ref._seleccionararticulo /*void*/ (null,_dcs);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=100663310;
 //BA.debugLineNum = 100663310;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}