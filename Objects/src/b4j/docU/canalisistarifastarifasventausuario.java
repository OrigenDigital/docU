package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisistarifastarifasventausuario extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisistarifastarifasventausuario", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisistarifastarifasventausuario.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _mdatosprecioventausuarioseleccionado = null;
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
public String  _background_mouseclicked(b4j.docU.canalisistarifastarifasventausuario __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="End Sub";
return "";
}
public String  _salirform(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=47513603;
 //BA.debugLineNum = 47513603;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=47513604;
 //BA.debugLineNum = 47513604;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=47513605;
 //BA.debugLineNum = 47513605;BA.debugLine="CallSubDelayed2(mCallBack,\"cSeleccionArticuloNAV_";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cSeleccionArticuloNAV_Done",(Object)(__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=47513606;
 //BA.debugLineNum = 47513606;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=47185925;
 //BA.debugLineNum = 47185925;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=47185928;
 //BA.debugLineNum = 47185928;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=47185929;
 //BA.debugLineNum = 47185929;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=47185930;
 //BA.debugLineNum = 47185930;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=47185932;
 //BA.debugLineNum = 47185932;BA.debugLine="Dim mDatosPrecioVentaUsuarioSeleccionado As Map";
_mdatosprecioventausuarioseleccionado = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47185934;
 //BA.debugLineNum = 47185934;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datosventascliente(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "datosventascliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datosventascliente", null));}
ResumableSub_DatosVentasCliente rsub = new ResumableSub_DatosVentasCliente(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosVentasCliente extends BA.ResumableSub {
public ResumableSub_DatosVentasCliente(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=47710212;
 //BA.debugLineNum = 47710212;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=47710214;
 //BA.debugLineNum = 47710214;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=47710215;
 //BA.debugLineNum = 47710215;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=47710216;
 //BA.debugLineNum = 47710216;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="Comando=\"AnalisisTarifasInfoVentasClienteArticulo";
_comando = "AnalisisTarifasInfoVentasClienteArticulo";
RDebugUtils.currentLine=47710219;
 //BA.debugLineNum = 47710219;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=47710220;
 //BA.debugLineNum = 47710220;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "datosventascliente"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=47710222;
 //BA.debugLineNum = 47710222;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=47710223;
 //BA.debugLineNum = 47710223;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=47710224;
 //BA.debugLineNum = 47710224;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "datosventascliente"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=47710225;
 //BA.debugLineNum = 47710225;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
RDebugUtils.currentLine=47710226;
 //BA.debugLineNum = 47710226;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=47710228;
 //BA.debugLineNum = 47710228;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=47710229;
 //BA.debugLineNum = 47710229;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de Artículos NAV","Aviso");
RDebugUtils.currentLine=47710230;
 //BA.debugLineNum = 47710230;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "datosventascliente"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=47710231;
 //BA.debugLineNum = 47710231;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=47710232;
 //BA.debugLineNum = 47710232;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=47710234;
 //BA.debugLineNum = 47710234;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=47710235;
 //BA.debugLineNum = 47710235;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=47710236;
 //BA.debugLineNum = 47710236;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=47710237;
 //BA.debugLineNum = 47710237;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
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
RDebugUtils.currentLine=47710240;
 //BA.debugLineNum = 47710240;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=47710241;
 //BA.debugLineNum = 47710241;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datosventasgrp(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "datosventasgrp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datosventasgrp", null));}
ResumableSub_DatosVentasGRP rsub = new ResumableSub_DatosVentasGRP(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosVentasGRP extends BA.ResumableSub {
public ResumableSub_DatosVentasGRP(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=47775748;
 //BA.debugLineNum = 47775748;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=47775749;
 //BA.debugLineNum = 47775749;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=47775750;
 //BA.debugLineNum = 47775750;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=47775751;
 //BA.debugLineNum = 47775751;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=47775752;
 //BA.debugLineNum = 47775752;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=47775753;
 //BA.debugLineNum = 47775753;BA.debugLine="Comando=\"AnalisisTarifasInfoVentasGRPArticulo\"";
_comando = "AnalisisTarifasInfoVentasGRPArticulo";
RDebugUtils.currentLine=47775755;
 //BA.debugLineNum = 47775755;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=47775756;
 //BA.debugLineNum = 47775756;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "datosventasgrp"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=47775758;
 //BA.debugLineNum = 47775758;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=47775759;
 //BA.debugLineNum = 47775759;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=47775760;
 //BA.debugLineNum = 47775760;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "datosventasgrp"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=47775761;
 //BA.debugLineNum = 47775761;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
RDebugUtils.currentLine=47775762;
 //BA.debugLineNum = 47775762;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=47775764;
 //BA.debugLineNum = 47775764;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=47775765;
 //BA.debugLineNum = 47775765;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de Artículos NAV","Aviso");
RDebugUtils.currentLine=47775766;
 //BA.debugLineNum = 47775766;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "datosventasgrp"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=47775767;
 //BA.debugLineNum = 47775767;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=47775768;
 //BA.debugLineNum = 47775768;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=47775770;
 //BA.debugLineNum = 47775770;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=47775771;
 //BA.debugLineNum = 47775771;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=47775772;
 //BA.debugLineNum = 47775772;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=47775773;
 //BA.debugLineNum = 47775773;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
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
RDebugUtils.currentLine=47775776;
 //BA.debugLineNum = 47775776;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=47775777;
 //BA.debugLineNum = 47775777;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.canalisistarifastarifasventausuario __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="End Sub";
return "";
}
public void  _inicio(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {Debug.delegate(ba, "inicio", null); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
String _datosarticulosnav = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=47644675;
 //BA.debugLineNum = 47644675;BA.debugLine="wait for(DatosArticulosNav) complete (mResult As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "inicio"), (Object)(_datosarticulosnav));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=47644676;
 //BA.debugLineNum = 47644676;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=47644677;
 //BA.debugLineNum = 47644677;BA.debugLine="If mResult.Get(\"Accion\")=\"Salir\" Then";
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
RDebugUtils.currentLine=47644678;
 //BA.debugLineNum = 47644678;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=47644680;
 //BA.debugLineNum = 47644680;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=47644681;
 //BA.debugLineNum = 47644681;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=47644682;
 //BA.debugLineNum = 47644682;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=47644683;
 //BA.debugLineNum = 47644683;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "inicio"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=47644684;
 //BA.debugLineNum = 47644684;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=47644685;
 //BA.debugLineNum = 47644685;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=47644686;
 //BA.debugLineNum = 47644686;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=47644687;
 //BA.debugLineNum = 47644687;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
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
RDebugUtils.currentLine=47644688;
 //BA.debugLineNum = 47644688;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=47644689;
 //BA.debugLineNum = 47644689;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "inicio"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=47644691;
 //BA.debugLineNum = 47644691;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 11:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=47644692;
 //BA.debugLineNum = 47644692;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=47644693;
 //BA.debugLineNum = 47644693;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "inicio"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
RDebugUtils.currentLine=47644695;
 //BA.debugLineNum = 47644695;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=47644696;
 //BA.debugLineNum = 47644696;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "inicio"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (int) result[1];
;
RDebugUtils.currentLine=47644697;
 //BA.debugLineNum = 47644697;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=47644698;
 //BA.debugLineNum = 47644698;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=47644699;
 //BA.debugLineNum = 47644699;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=47644702;
 //BA.debugLineNum = 47644702;BA.debugLine="ExitApplication";
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
RDebugUtils.currentLine=47644705;
 //BA.debugLineNum = 47644705;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.docU.canalisistarifastarifasventausuario __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent}));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=47251461;
 //BA.debugLineNum = 47251461;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=47251462;
 //BA.debugLineNum = 47251462;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=47251464;
 //BA.debugLineNum = 47251464;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Initialize";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=47251465;
 //BA.debugLineNum = 47251465;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Put(\"Articul";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Articulo"),(Object)(""));
RDebugUtils.currentLine=47251466;
 //BA.debugLineNum = 47251466;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Put(\"Descrip";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DescripcionArticulo"),(Object)(""));
RDebugUtils.currentLine=47251467;
 //BA.debugLineNum = 47251467;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Put(\"Articul";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ArticuloBloqueado"),(Object)(__c.False));
RDebugUtils.currentLine=47251468;
 //BA.debugLineNum = 47251468;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=47251469;
 //BA.debugLineNum = 47251469;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=47316997;
 //BA.debugLineNum = 47316997;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=47316998;
 //BA.debugLineNum = 47316998;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=47316999;
 //BA.debugLineNum = 47316999;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=47317001;
 //BA.debugLineNum = 47317001;BA.debugLine="frm.RootPane.LoadLayout(\"scrListaSeleccionGeneral";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrListaSeleccionGeneralJamTableView");
RDebugUtils.currentLine=47317003;
 //BA.debugLineNum = 47317003;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=47317005;
 //BA.debugLineNum = 47317005;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=47317007;
 //BA.debugLineNum = 47317007;BA.debugLine="frm.Title=\"Info Ventas\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Info Ventas");
RDebugUtils.currentLine=47317009;
 //BA.debugLineNum = 47317009;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=47317010;
 //BA.debugLineNum = 47317010;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=47317012;
 //BA.debugLineNum = 47317012;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=47317013;
 //BA.debugLineNum = 47317013;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=47317015;
 //BA.debugLineNum = 47317015;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=47317016;
 //BA.debugLineNum = 47317016;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=47317018;
 //BA.debugLineNum = 47317018;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=47317020;
 //BA.debugLineNum = 47317020;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,".json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=47317021;
 //BA.debugLineNum = 47317021;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=47317023;
 //BA.debugLineNum = 47317023;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=47317025;
 //BA.debugLineNum = 47317025;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=47317026;
 //BA.debugLineNum = 47317026;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=47317027;
 //BA.debugLineNum = 47317027;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=47317028;
 //BA.debugLineNum = 47317028;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=47317029;
 //BA.debugLineNum = 47317029;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=47317032;
 //BA.debugLineNum = 47317032;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Añadir Precio Venta Usuario Línea Seleccionada","AddPrecioVentaUsuarioLineaSeleccionada",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=47317044;
 //BA.debugLineNum = 47317044;BA.debugLine="Inicio";
__ref._inicio /*void*/ (null);
RDebugUtils.currentLine=47317045;
 //BA.debugLineNum = 47317045;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_accionsalirjamtableview(b4j.docU.canalisistarifastarifasventausuario __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null); return;}
ResumableSub_jamTableView1_AccionSalirJamTableView rsub = new ResumableSub_jamTableView1_AccionSalirJamTableView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_AccionSalirJamTableView extends BA.ResumableSub {
public ResumableSub_jamTableView1_AccionSalirJamTableView(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47579137;
 //BA.debugLineNum = 47579137;BA.debugLine="If mDatosPrecioVentaUsuarioSeleccionado.Get(\"Arti";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("Articulo"))).equals((Object)(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No se ha s";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"No se ha seleccionado Artículo."+parent.__c.CRLF+parent.__c.CRLF+"¿Salir sin seleccionar?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=47579139;
 //BA.debugLineNum = 47579139;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "jamtableview1_accionsalirjamtableview"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=47579140;
 //BA.debugLineNum = 47579140;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=47579142;
 //BA.debugLineNum = 47579142;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=47579143;
 //BA.debugLineNum = 47579143;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_celldobleclick(b4j.docU.canalisistarifastarifasventausuario __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}); return;}
ResumableSub_jamTableView1_CellDobleClick rsub = new ResumableSub_jamTableView1_CellDobleClick(this,__ref,_datosceldaseleccionada);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_CellDobleClick extends BA.ResumableSub {
public ResumableSub_jamTableView1_CellDobleClick(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Añadir los";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Añadir los datos de la línea como precio venta usuario?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "jamtableview1_celldobleclick"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=47906819;
 //BA.debugLineNum = 47906819;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = -1;
;
RDebugUtils.currentLine=47906820;
 //BA.debugLineNum = 47906820;BA.debugLine="SeleccionarDatosPrecioVentaUsuarioLinea(DatosCeld";
__ref._seleccionardatosprecioventausuariolinea /*String*/ (null,_datosceldaseleccionada);
RDebugUtils.currentLine=47906821;
 //BA.debugLineNum = 47906821;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _seleccionardatosprecioventausuariolinea(b4j.docU.canalisistarifastarifasventausuario __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "seleccionardatosprecioventausuariolinea", false))
	 {return ((String) Debug.delegate(ba, "seleccionardatosprecioventausuariolinea", new Object[] {_datosceldaseleccionada}));}
anywheresoftware.b4a.objects.collections.Map _mdatapk = null;
String _descripcionarticulo = "";
int _articulobloqueado = 0;
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Sub SeleccionarDatosPrecioVentaUsuarioLinea(DatosC";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="Dim mDataPK As Map=DatosCeldaSeleccionada.mDataPK";
_mdatapk = new anywheresoftware.b4a.objects.collections.Map();
_mdatapk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Put(\"Articul";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Articulo"),_mdatapk.Get((Object)("Articulo")));
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="Dim DescripcionArticulo As String=jamTableView1.G";
_descripcionarticulo = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"DescripcionArticulo"));
RDebugUtils.currentLine=47972356;
 //BA.debugLineNum = 47972356;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Put(\"Descrip";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DescripcionArticulo"),(Object)(_descripcionarticulo));
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="Dim ArticuloBloqueado As Int=jamTableView1.GetVal";
_articulobloqueado = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"Bloqueado")));
RDebugUtils.currentLine=47972358;
 //BA.debugLineNum = 47972358;BA.debugLine="mDatosPrecioVentaUsuarioSeleccionado.Put(\"Articul";
__ref._mdatosprecioventausuarioseleccionado /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("ArticuloBloqueado"),(Object)(_articulobloqueado));
RDebugUtils.currentLine=47972359;
 //BA.debugLineNum = 47972359;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=47972360;
 //BA.debugLineNum = 47972360;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.canalisistarifastarifasventausuario __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.canalisistarifastarifasventausuario parent,b4j.docU.canalisistarifastarifasventausuario __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisistarifastarifasventausuario __ref;
b4j.docU.canalisistarifastarifasventausuario parent;
String _tagmenuitem;
int _fsel = 0;
Object _msa = null;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifastarifasventausuario";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="Select TagMenuItem";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_tagmenuitem,"AddPrecioVentaUsuarioLineaSeleccionada")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=47841285;
 //BA.debugLineNum = 47841285;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
_fsel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=47841286;
 //BA.debugLineNum = 47841286;BA.debugLine="If fSel=-1 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_fsel==-1) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=47841287;
 //BA.debugLineNum = 47841287;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ninguna fila","Aviso");
RDebugUtils.currentLine=47841288;
 //BA.debugLineNum = 47841288;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifastarifasventausuario", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
RDebugUtils.currentLine=47841289;
 //BA.debugLineNum = 47841289;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=47841291;
 //BA.debugLineNum = 47841291;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=47841292;
 //BA.debugLineNum = 47841292;BA.debugLine="SeleccionarDatosPrecioVentaUsuarioLinea(Dcs)";
__ref._seleccionardatosprecioventausuariolinea /*String*/ (null,_dcs);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=47841294;
 //BA.debugLineNum = 47841294;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}