package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cseleccionproveedornav extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cseleccionproveedornav", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cseleccionproveedornav.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.collections.Map _mdatosproveedorseleccionado = null;
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
public String  _initialize(b4j.docU.cseleccionproveedornav __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent}));}
RDebugUtils.currentLine=100990976;
 //BA.debugLineNum = 100990976;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=100990977;
 //BA.debugLineNum = 100990977;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=100990978;
 //BA.debugLineNum = 100990978;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=100990979;
 //BA.debugLineNum = 100990979;BA.debugLine="Background= xui.CreatePanel(\"BackgroundSeleccionP";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"BackgroundSeleccionProveedor");
RDebugUtils.currentLine=100990980;
 //BA.debugLineNum = 100990980;BA.debugLine="Background.Tag = \"BackgroundSeleccionProveedor\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("BackgroundSeleccionProveedor"));
RDebugUtils.currentLine=100990981;
 //BA.debugLineNum = 100990981;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=100990982;
 //BA.debugLineNum = 100990982;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=100990984;
 //BA.debugLineNum = 100990984;BA.debugLine="mDatosProveedorSeleccionado.Initialize";
__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=100990985;
 //BA.debugLineNum = 100990985;BA.debugLine="mDatosProveedorSeleccionado.Put(\"Proveedor\",\"\")";
__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Proveedor"),(Object)(""));
RDebugUtils.currentLine=100990986;
 //BA.debugLineNum = 100990986;BA.debugLine="mDatosProveedorSeleccionado.Put(\"NombreProveedor\"";
__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("NombreProveedor"),(Object)(""));
RDebugUtils.currentLine=100990988;
 //BA.debugLineNum = 100990988;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=100990989;
 //BA.debugLineNum = 100990989;BA.debugLine="End Sub";
return "";
}
public void  _actualizardatos(b4j.docU.cseleccionproveedornav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cseleccionproveedornav parent,b4j.docU.cseleccionproveedornav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionproveedornav __ref;
b4j.docU.cseleccionproveedornav parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=101384195;
 //BA.debugLineNum = 101384195;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(""));
RDebugUtils.currentLine=101384196;
 //BA.debugLineNum = 101384196;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=101384197;
 //BA.debugLineNum = 101384197;BA.debugLine="wait for(DatosProveedoresNav) complete (mResult A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "actualizardatos"), __ref._datosproveedoresnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=101384200;
 //BA.debugLineNum = 101384200;BA.debugLine="If mResult.Get(\"Accion\")=\"Salir\" Then";
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
RDebugUtils.currentLine=101384201;
 //BA.debugLineNum = 101384201;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=101384202;
 //BA.debugLineNum = 101384202;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=101384205;
 //BA.debugLineNum = 101384205;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=101384206;
 //BA.debugLineNum = 101384206;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=101384207;
 //BA.debugLineNum = 101384207;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "actualizardatos"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=101384209;
 //BA.debugLineNum = 101384209;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=101384210;
 //BA.debugLineNum = 101384210;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=101384211;
 //BA.debugLineNum = 101384211;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=101384212;
 //BA.debugLineNum = 101384212;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
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
RDebugUtils.currentLine=101384213;
 //BA.debugLineNum = 101384213;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=101384214;
 //BA.debugLineNum = 101384214;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "actualizardatos"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=101384216;
 //BA.debugLineNum = 101384216;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 11:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=101384217;
 //BA.debugLineNum = 101384217;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=101384218;
 //BA.debugLineNum = 101384218;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "actualizardatos"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
RDebugUtils.currentLine=101384220;
 //BA.debugLineNum = 101384220;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=101384221;
 //BA.debugLineNum = 101384221;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "actualizardatos"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (int) result[1];
;
RDebugUtils.currentLine=101384222;
 //BA.debugLineNum = 101384222;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=101384223;
 //BA.debugLineNum = 101384223;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=101384224;
 //BA.debugLineNum = 101384224;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=101384227;
 //BA.debugLineNum = 101384227;BA.debugLine="ExitApplication";
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
RDebugUtils.currentLine=101384230;
 //BA.debugLineNum = 101384230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datosproveedoresnav(b4j.docU.cseleccionproveedornav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "datosproveedoresnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datosproveedoresnav", null));}
ResumableSub_DatosProveedoresNav rsub = new ResumableSub_DatosProveedoresNav(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosProveedoresNav extends BA.ResumableSub {
public ResumableSub_DatosProveedoresNav(b4j.docU.cseleccionproveedornav parent,b4j.docU.cseleccionproveedornav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionproveedornav __ref;
b4j.docU.cseleccionproveedornav parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=101449729;
 //BA.debugLineNum = 101449729;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=101449730;
 //BA.debugLineNum = 101449730;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=101449731;
 //BA.debugLineNum = 101449731;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=101449732;
 //BA.debugLineNum = 101449732;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=101449733;
 //BA.debugLineNum = 101449733;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=101449734;
 //BA.debugLineNum = 101449734;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=101449735;
 //BA.debugLineNum = 101449735;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=101449736;
 //BA.debugLineNum = 101449736;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=101449737;
 //BA.debugLineNum = 101449737;BA.debugLine="Comando=\"ProveedoresSeleccionNAV\"";
_comando = "ProveedoresSeleccionNAV";
RDebugUtils.currentLine=101449739;
 //BA.debugLineNum = 101449739;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=101449740;
 //BA.debugLineNum = 101449740;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "datosproveedoresnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=101449741;
 //BA.debugLineNum = 101449741;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=101449742;
 //BA.debugLineNum = 101449742;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=101449743;
 //BA.debugLineNum = 101449743;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=101449744;
 //BA.debugLineNum = 101449744;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "datosproveedoresnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=101449745;
 //BA.debugLineNum = 101449745;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
RDebugUtils.currentLine=101449746;
 //BA.debugLineNum = 101449746;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=101449748;
 //BA.debugLineNum = 101449748;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=101449749;
 //BA.debugLineNum = 101449749;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=101449750;
 //BA.debugLineNum = 101449750;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de Proveedores NAV","Aviso");
RDebugUtils.currentLine=101449751;
 //BA.debugLineNum = 101449751;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "datosproveedoresnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=101449752;
 //BA.debugLineNum = 101449752;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=101449753;
 //BA.debugLineNum = 101449753;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=101449755;
 //BA.debugLineNum = 101449755;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=101449756;
 //BA.debugLineNum = 101449756;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=101449757;
 //BA.debugLineNum = 101449757;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=101449758;
 //BA.debugLineNum = 101449758;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
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
RDebugUtils.currentLine=101449761;
 //BA.debugLineNum = 101449761;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=101449762;
 //BA.debugLineNum = 101449762;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirform(b4j.docU.cseleccionproveedornav __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=101253120;
 //BA.debugLineNum = 101253120;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=101253121;
 //BA.debugLineNum = 101253121;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=101253122;
 //BA.debugLineNum = 101253122;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=101253123;
 //BA.debugLineNum = 101253123;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=101253124;
 //BA.debugLineNum = 101253124;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=101253125;
 //BA.debugLineNum = 101253125;BA.debugLine="CallSubDelayed2(mCallBack,\"cSeleccionProveedorNAV";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cSeleccionProveedorNAV_Done",(Object)(__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=101253126;
 //BA.debugLineNum = 101253126;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(b4j.docU.cseleccionproveedornav __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=101711872;
 //BA.debugLineNum = 101711872;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=101711873;
 //BA.debugLineNum = 101711873;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=101711874;
 //BA.debugLineNum = 101711874;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cseleccionproveedornav __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=101187584;
 //BA.debugLineNum = 101187584;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=101187585;
 //BA.debugLineNum = 101187585;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=101187586;
 //BA.debugLineNum = 101187586;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cseleccionproveedornav __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
RDebugUtils.currentLine=100925440;
 //BA.debugLineNum = 100925440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=100925441;
 //BA.debugLineNum = 100925441;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=100925442;
 //BA.debugLineNum = 100925442;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=100925443;
 //BA.debugLineNum = 100925443;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=100925444;
 //BA.debugLineNum = 100925444;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=100925445;
 //BA.debugLineNum = 100925445;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=100925446;
 //BA.debugLineNum = 100925446;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=100925448;
 //BA.debugLineNum = 100925448;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=100925449;
 //BA.debugLineNum = 100925449;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=100925450;
 //BA.debugLineNum = 100925450;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=100925452;
 //BA.debugLineNum = 100925452;BA.debugLine="Dim mDatosProveedorSeleccionado As Map";
_mdatosproveedorseleccionado = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=100925454;
 //BA.debugLineNum = 100925454;BA.debugLine="Dim jamLoadingIndicator1 As JamLoadingIndicator";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=100925456;
 //BA.debugLineNum = 100925456;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cseleccionproveedornav __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=101122048;
 //BA.debugLineNum = 101122048;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=101122049;
 //BA.debugLineNum = 101122049;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=101122050;
 //BA.debugLineNum = 101122050;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cseleccionproveedornav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cseleccionproveedornav parent,b4j.docU.cseleccionproveedornav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionproveedornav __ref;
b4j.docU.cseleccionproveedornav parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=101056513;
 //BA.debugLineNum = 101056513;BA.debugLine="If Not(frm.IsInitialized) Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.__c.Not(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .IsInitialized())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=101056515;
 //BA.debugLineNum = 101056515;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=101056517;
 //BA.debugLineNum = 101056517;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=101056518;
 //BA.debugLineNum = 101056518;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=101056519;
 //BA.debugLineNum = 101056519;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=101056521;
 //BA.debugLineNum = 101056521;BA.debugLine="frm.RootPane.LoadLayout(\"scrSeleccionProveedorNA";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrSeleccionProveedorNAV");
RDebugUtils.currentLine=101056523;
 //BA.debugLineNum = 101056523;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "show"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 4;
;
RDebugUtils.currentLine=101056525;
 //BA.debugLineNum = 101056525;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=101056527;
 //BA.debugLineNum = 101056527;BA.debugLine="frm.Title=\"Selección Proveedor NAV\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Selección Proveedor NAV");
RDebugUtils.currentLine=101056529;
 //BA.debugLineNum = 101056529;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=101056530;
 //BA.debugLineNum = 101056530;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=101056531;
 //BA.debugLineNum = 101056531;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=101056533;
 //BA.debugLineNum = 101056533;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=101056534;
 //BA.debugLineNum = 101056534;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=101056536;
 //BA.debugLineNum = 101056536;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=101056538;
 //BA.debugLineNum = 101056538;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configura";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaProveedoresNAV.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=101056539;
 //BA.debugLineNum = 101056539;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=101056541;
 //BA.debugLineNum = 101056541;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=101056542;
 //BA.debugLineNum = 101056542;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8101056542",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=101056543;
 //BA.debugLineNum = 101056543;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=101056544;
 //BA.debugLineNum = 101056544;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=101056545;
 //BA.debugLineNum = 101056545;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 7;
;
RDebugUtils.currentLine=101056546;
 //BA.debugLineNum = 101056546;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=101056547;
 //BA.debugLineNum = 101056547;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=101056550;
 //BA.debugLineNum = 101056550;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenu";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Seleccionar Proveedor","SeleccionarProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=101056552;
 //BA.debugLineNum = 101056552;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=101056553;
 //BA.debugLineNum = 101056553;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=101056554;
 //BA.debugLineNum = 101056554;BA.debugLine="cF.AliasCampoColumna=\"Bloqueado\"";
_cf.AliasCampoColumna /*String*/  = "Bloqueado";
RDebugUtils.currentLine=101056555;
 //BA.debugLineNum = 101056555;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=101056556;
 //BA.debugLineNum = 101056556;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFa";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnabooleanatipointegercheckbox /*String*/ ;
RDebugUtils.currentLine=101056557;
 //BA.debugLineNum = 101056557;BA.debugLine="jamTableView1.SetCellFactory(cF)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cf);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=101056560;
 //BA.debugLineNum = 101056560;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=101056561;
 //BA.debugLineNum = 101056561;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_accionsalirjamtableview(b4j.docU.cseleccionproveedornav __ref) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null); return;}
ResumableSub_jamTableView1_AccionSalirJamTableView rsub = new ResumableSub_jamTableView1_AccionSalirJamTableView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_AccionSalirJamTableView extends BA.ResumableSub {
public ResumableSub_jamTableView1_AccionSalirJamTableView(b4j.docU.cseleccionproveedornav parent,b4j.docU.cseleccionproveedornav __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cseleccionproveedornav __ref;
b4j.docU.cseleccionproveedornav parent;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=101318657;
 //BA.debugLineNum = 101318657;BA.debugLine="If mDatosProveedorSeleccionado.Get(\"Proveedor\")=\"";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Proveedor"))).equals((Object)(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=101318658;
 //BA.debugLineNum = 101318658;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha s";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"No se ha seleccionado Proveedor."+parent.__c.CRLF+parent.__c.CRLF+"¿Salir sin seleccionar?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=101318659;
 //BA.debugLineNum = 101318659;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "jamtableview1_accionsalirjamtableview"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=101318660;
 //BA.debugLineNum = 101318660;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=101318662;
 //BA.debugLineNum = 101318662;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=101318663;
 //BA.debugLineNum = 101318663;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_celldobleclick(b4j.docU.cseleccionproveedornav __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=101580800;
 //BA.debugLineNum = 101580800;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
RDebugUtils.currentLine=101580801;
 //BA.debugLineNum = 101580801;BA.debugLine="SeleccionarProveedor(DatosCeldaSeleccionada)";
__ref._seleccionarproveedor /*String*/ (null,_datosceldaseleccionada);
RDebugUtils.currentLine=101580802;
 //BA.debugLineNum = 101580802;BA.debugLine="End Sub";
return "";
}
public String  _seleccionarproveedor(b4j.docU.cseleccionproveedornav __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "seleccionarproveedor", false))
	 {return ((String) Debug.delegate(ba, "seleccionarproveedor", new Object[] {_datosceldaseleccionada}));}
anywheresoftware.b4a.objects.collections.Map _mdatapk = null;
String _nombreproveedor = "";
RDebugUtils.currentLine=101646336;
 //BA.debugLineNum = 101646336;BA.debugLine="Sub SeleccionarProveedor(DatosCeldaSeleccionada As";
RDebugUtils.currentLine=101646337;
 //BA.debugLineNum = 101646337;BA.debugLine="Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK";
_mdatapk = new anywheresoftware.b4a.objects.collections.Map();
_mdatapk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=101646338;
 //BA.debugLineNum = 101646338;BA.debugLine="mDatosProveedorSeleccionado.Put(\"Proveedor\",mData";
__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Proveedor"),_mdatapk.Get((Object)("Proveedor")));
RDebugUtils.currentLine=101646339;
 //BA.debugLineNum = 101646339;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
_nombreproveedor = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"NombreProveedor"));
RDebugUtils.currentLine=101646340;
 //BA.debugLineNum = 101646340;BA.debugLine="mDatosProveedorSeleccionado.Put(\"NombreProveedor\"";
__ref._mdatosproveedorseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("NombreProveedor"),(Object)(_nombreproveedor));
RDebugUtils.currentLine=101646341;
 //BA.debugLineNum = 101646341;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=101646342;
 //BA.debugLineNum = 101646342;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.cseleccionproveedornav __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cseleccionproveedornav parent,b4j.docU.cseleccionproveedornav __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cseleccionproveedornav __ref;
b4j.docU.cseleccionproveedornav parent;
String _tagmenuitem;
int _fsel = 0;
Object _msa = null;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cseleccionproveedornav";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=101515265;
 //BA.debugLineNum = 101515265;BA.debugLine="Select TagMenuItem";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","SeleccionarProveedor")) {
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
RDebugUtils.currentLine=101515267;
 //BA.debugLineNum = 101515267;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=101515269;
 //BA.debugLineNum = 101515269;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
_fsel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=101515270;
 //BA.debugLineNum = 101515270;BA.debugLine="If fSel=-1 Then";
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
RDebugUtils.currentLine=101515271;
 //BA.debugLineNum = 101515271;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ninguna fila","Aviso");
RDebugUtils.currentLine=101515272;
 //BA.debugLineNum = 101515272;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cseleccionproveedornav", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 9;
;
RDebugUtils.currentLine=101515273;
 //BA.debugLineNum = 101515273;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=101515275;
 //BA.debugLineNum = 101515275;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=101515276;
 //BA.debugLineNum = 101515276;BA.debugLine="SeleccionarProveedor(Dcs)";
__ref._seleccionarproveedor /*String*/ (null,_dcs);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=101515278;
 //BA.debugLineNum = 101515278;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}