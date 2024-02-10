package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisistarifasinfoventas extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisistarifasinfoventas", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisistarifasinfoventas.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _mdatoslineaseleccionada = null;
public int _mtipotarifa = 0;
public String _mcodigotarifa = "";
public String _marticulo = "";
public String _mdescripcionarticulo = "";
public long _mfechainicialventas = 0L;
public long _mfechafinalventas = 0L;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescripcionarticulo = null;
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
public String  _initialize(b4j.docU.canalisistarifasinfoventas __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _tipotarifa,String _codigotarifa,String _articulo,String _descripcionarticulo,long _fechainicialventas,long _fechafinalventas) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_tipotarifa,_codigotarifa,_articulo,_descripcionarticulo,_fechainicialventas,_fechafinalventas}));}
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=46333956;
 //BA.debugLineNum = 46333956;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=46333957;
 //BA.debugLineNum = 46333957;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=46333958;
 //BA.debugLineNum = 46333958;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=46333959;
 //BA.debugLineNum = 46333959;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=46333960;
 //BA.debugLineNum = 46333960;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=46333964;
 //BA.debugLineNum = 46333964;BA.debugLine="mTipoTarifa=TipoTarifa";
__ref._mtipotarifa /*int*/  = (int)(Double.parseDouble(_tipotarifa));
RDebugUtils.currentLine=46333965;
 //BA.debugLineNum = 46333965;BA.debugLine="mCodigoTarifa=CodigoTarifa";
__ref._mcodigotarifa /*String*/  = _codigotarifa;
RDebugUtils.currentLine=46333966;
 //BA.debugLineNum = 46333966;BA.debugLine="mArticulo=Articulo";
__ref._marticulo /*String*/  = _articulo;
RDebugUtils.currentLine=46333967;
 //BA.debugLineNum = 46333967;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
__ref._mdescripcionarticulo /*String*/  = _descripcionarticulo;
RDebugUtils.currentLine=46333968;
 //BA.debugLineNum = 46333968;BA.debugLine="mFechaInicialVentas=FechaInicialVentas";
__ref._mfechainicialventas /*long*/  = _fechainicialventas;
RDebugUtils.currentLine=46333969;
 //BA.debugLineNum = 46333969;BA.debugLine="mFechaFinalVentas=FechaFinalVentas";
__ref._mfechafinalventas /*long*/  = _fechafinalventas;
RDebugUtils.currentLine=46333971;
 //BA.debugLineNum = 46333971;BA.debugLine="mDatosLineaSeleccionada.Initialize";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=46333972;
 //BA.debugLineNum = 46333972;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioSeleccionado\",";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioSeleccionado"),(Object)(__c.False));
RDebugUtils.currentLine=46333977;
 //BA.debugLineNum = 46333977;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioDivisa\",0)";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioDivisa"),(Object)(0));
RDebugUtils.currentLine=46333978;
 //BA.debugLineNum = 46333978;BA.debugLine="mDatosLineaSeleccionada.Put(\"Divisa\",\"\")";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Divisa"),(Object)(""));
RDebugUtils.currentLine=46333979;
 //BA.debugLineNum = 46333979;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=46333980;
 //BA.debugLineNum = 46333980;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(b4j.docU.canalisistarifasinfoventas __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="End Sub";
return "";
}
public String  _salirform(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=46596101;
 //BA.debugLineNum = 46596101;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasInfoVe";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cAnalisisTarifasInfoVentas_Done",(Object)(__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=46596102;
 //BA.debugLineNum = 46596102;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=46268420;
 //BA.debugLineNum = 46268420;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=46268421;
 //BA.debugLineNum = 46268421;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=46268424;
 //BA.debugLineNum = 46268424;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=46268425;
 //BA.debugLineNum = 46268425;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46268426;
 //BA.debugLineNum = 46268426;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46268428;
 //BA.debugLineNum = 46268428;BA.debugLine="Dim mDatosLineaSeleccionada As Map";
_mdatoslineaseleccionada = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46268430;
 //BA.debugLineNum = 46268430;BA.debugLine="Dim mTipoTarifa As Int";
_mtipotarifa = 0;
RDebugUtils.currentLine=46268431;
 //BA.debugLineNum = 46268431;BA.debugLine="Dim mCodigoTarifa As String";
_mcodigotarifa = "";
RDebugUtils.currentLine=46268432;
 //BA.debugLineNum = 46268432;BA.debugLine="Dim mArticulo As String";
_marticulo = "";
RDebugUtils.currentLine=46268433;
 //BA.debugLineNum = 46268433;BA.debugLine="Dim mDescripcionArticulo As String";
_mdescripcionarticulo = "";
RDebugUtils.currentLine=46268434;
 //BA.debugLineNum = 46268434;BA.debugLine="Dim mFechaInicialVentas, mFechaFinalVentas As Lon";
_mfechainicialventas = 0L;
_mfechafinalventas = 0L;
RDebugUtils.currentLine=46268436;
 //BA.debugLineNum = 46268436;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=46268437;
 //BA.debugLineNum = 46268437;BA.debugLine="Private txtArticulo As TextField";
_txtarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=46268438;
 //BA.debugLineNum = 46268438;BA.debugLine="Private txtDescripcionArticulo As TextField";
_txtdescripcionarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=46268439;
 //BA.debugLineNum = 46268439;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datosventasclientegrp(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "datosventasclientegrp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datosventasclientegrp", null));}
ResumableSub_DatosVentasClienteGRP rsub = new ResumableSub_DatosVentasClienteGRP(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosVentasClienteGRP extends BA.ResumableSub {
public ResumableSub_DatosVentasClienteGRP(b4j.docU.canalisistarifasinfoventas parent,b4j.docU.canalisistarifasinfoventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfoventas __ref;
b4j.docU.canalisistarifasinfoventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
String _dateformatant = "";
String _sfechainicialventas = "";
String _sfechafinalventas = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46792709;
 //BA.debugLineNum = 46792709;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=46792710;
 //BA.debugLineNum = 46792710;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=46792711;
 //BA.debugLineNum = 46792711;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=46792712;
 //BA.debugLineNum = 46792712;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=46792713;
 //BA.debugLineNum = 46792713;BA.debugLine="Select Case mTipoTarifa";
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(__ref._mtipotarifa /*int*/ ,(int) (0),(int) (1))) {
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
RDebugUtils.currentLine=46792715;
 //BA.debugLineNum = 46792715;BA.debugLine="Comando=\"AnalisisTarifasInfoVentasClienteArticu";
_comando = "AnalisisTarifasInfoVentasClienteArticulo";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=46792717;
 //BA.debugLineNum = 46792717;BA.debugLine="Comando=\"AnalisisTarifasInfoVentasGRPArticulo\"";
_comando = "AnalisisTarifasInfoVentasGRPArticulo";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=46792720;
 //BA.debugLineNum = 46792720;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=46792721;
 //BA.debugLineNum = 46792721;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=46792722;
 //BA.debugLineNum = 46792722;BA.debugLine="Dim sFechaInicialVentas As String=DateTime.Date(m";
_sfechainicialventas = parent.__c.DateTime.Date(__ref._mfechainicialventas /*long*/ );
RDebugUtils.currentLine=46792723;
 //BA.debugLineNum = 46792723;BA.debugLine="Dim sFechaFinalVentas As String=DateTime.Date(mFe";
_sfechafinalventas = parent.__c.DateTime.Date(__ref._mfechafinalventas /*long*/ );
RDebugUtils.currentLine=46792724;
 //BA.debugLineNum = 46792724;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=46792726;
 //BA.debugLineNum = 46792726;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(__ref._mcodigotarifa /*String*/ ),(Object)(__ref._marticulo /*String*/ ),(Object)(_sfechainicialventas),(Object)(_sfechafinalventas)},parent);
RDebugUtils.currentLine=46792727;
 //BA.debugLineNum = 46792727;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "datosventasclientegrp"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46792729;
 //BA.debugLineNum = 46792729;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=46792730;
 //BA.debugLineNum = 46792730;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=46792731;
 //BA.debugLineNum = 46792731;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "datosventasclientegrp"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=46792732;
 //BA.debugLineNum = 46792732;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
RDebugUtils.currentLine=46792733;
 //BA.debugLineNum = 46792733;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=46792735;
 //BA.debugLineNum = 46792735;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 12:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=46792736;
 //BA.debugLineNum = 46792736;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de ventas para los parámetros de tipo tarifa, código tarifa, artículo seleccionados","Aviso");
RDebugUtils.currentLine=46792737;
 //BA.debugLineNum = 46792737;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "datosventasclientegrp"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
RDebugUtils.currentLine=46792738;
 //BA.debugLineNum = 46792738;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=46792739;
 //BA.debugLineNum = 46792739;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=46792741;
 //BA.debugLineNum = 46792741;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=46792742;
 //BA.debugLineNum = 46792742;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=46792743;
 //BA.debugLineNum = 46792743;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=46792744;
 //BA.debugLineNum = 46792744;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
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
RDebugUtils.currentLine=46792747;
 //BA.debugLineNum = 46792747;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=46792748;
 //BA.debugLineNum = 46792748;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.canalisistarifasinfoventas __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="End Sub";
return "";
}
public void  _inicio(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {Debug.delegate(ba, "inicio", null); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.canalisistarifasinfoventas parent,b4j.docU.canalisistarifasinfoventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfoventas __ref;
b4j.docU.canalisistarifasinfoventas parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="wait for(DatosVentasClienteGRP) complete (mResult";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "inicio"), __ref._datosventasclientegrp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46727172;
 //BA.debugLineNum = 46727172;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=46727173;
 //BA.debugLineNum = 46727173;BA.debugLine="If mResult.Get(\"Accion\")<>\"Continuar\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_mresult.Get((Object)("Accion"))).equals((Object)("Continuar")) == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=46727174;
 //BA.debugLineNum = 46727174;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=46727175;
 //BA.debugLineNum = 46727175;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=46727178;
 //BA.debugLineNum = 46727178;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=46727180;
 //BA.debugLineNum = 46727180;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=46727181;
 //BA.debugLineNum = 46727181;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=46727182;
 //BA.debugLineNum = 46727182;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "inicio"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46727183;
 //BA.debugLineNum = 46727183;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=46727184;
 //BA.debugLineNum = 46727184;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=46727185;
 //BA.debugLineNum = 46727185;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=46727186;
 //BA.debugLineNum = 46727186;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
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
RDebugUtils.currentLine=46727187;
 //BA.debugLineNum = 46727187;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=46727188;
 //BA.debugLineNum = 46727188;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "inicio"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=46727190;
 //BA.debugLineNum = 46727190;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 11:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=46727191;
 //BA.debugLineNum = 46727191;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=46727192;
 //BA.debugLineNum = 46727192;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "inicio"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
RDebugUtils.currentLine=46727194;
 //BA.debugLineNum = 46727194;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=46727195;
 //BA.debugLineNum = 46727195;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "inicio"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (int) result[1];
;
RDebugUtils.currentLine=46727196;
 //BA.debugLineNum = 46727196;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=46727197;
 //BA.debugLineNum = 46727197;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=46727198;
 //BA.debugLineNum = 46727198;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=46727201;
 //BA.debugLineNum = 46727201;BA.debugLine="ExitApplication";
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
RDebugUtils.currentLine=46727204;
 //BA.debugLineNum = 46727204;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _show(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisistarifasinfoventas parent,b4j.docU.canalisistarifasinfoventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfoventas __ref;
b4j.docU.canalisistarifasinfoventas parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=46399493;
 //BA.debugLineNum = 46399493;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=46399494;
 //BA.debugLineNum = 46399494;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=46399495;
 //BA.debugLineNum = 46399495;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=46399497;
 //BA.debugLineNum = 46399497;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisTarifasInfoVe";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrAnalisisTarifasInfoVentas");
RDebugUtils.currentLine=46399499;
 //BA.debugLineNum = 46399499;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=46399501;
 //BA.debugLineNum = 46399501;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=46399503;
 //BA.debugLineNum = 46399503;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Info Vent";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    Info Ventas Periodo");
RDebugUtils.currentLine=46399507;
 //BA.debugLineNum = 46399507;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=46399508;
 //BA.debugLineNum = 46399508;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=46399511;
 //BA.debugLineNum = 46399511;BA.debugLine="txtArticulo.Text=mArticulo";
__ref._txtarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._marticulo /*String*/ );
RDebugUtils.currentLine=46399512;
 //BA.debugLineNum = 46399512;BA.debugLine="txtDescripcionArticulo.Text=mDescripcionArticulo";
__ref._txtdescripcionarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._mdescripcionarticulo /*String*/ );
RDebugUtils.currentLine=46399518;
 //BA.debugLineNum = 46399518;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=46399519;
 //BA.debugLineNum = 46399519;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=46399521;
 //BA.debugLineNum = 46399521;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=46399523;
 //BA.debugLineNum = 46399523;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisTarifasInfoVentasTipoTarifaCodigoTarifaArticulo.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=46399524;
 //BA.debugLineNum = 46399524;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=46399526;
 //BA.debugLineNum = 46399526;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=46399528;
 //BA.debugLineNum = 46399528;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=46399529;
 //BA.debugLineNum = 46399529;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=46399530;
 //BA.debugLineNum = 46399530;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=46399531;
 //BA.debugLineNum = 46399531;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=46399532;
 //BA.debugLineNum = 46399532;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=46399535;
 //BA.debugLineNum = 46399535;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Añadir Precio Seleccionado a Lista Precios Venta Usuario","AddPrecioVentaUsuarioLineaSeleccionada",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=46399537;
 //BA.debugLineNum = 46399537;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=46399538;
 //BA.debugLineNum = 46399538;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Añadir Precio Seleccionado a Lista Precios Venta Usuario","AddPrecioVentaUsuarioLineaSeleccionada",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))));
RDebugUtils.currentLine=46399540;
 //BA.debugLineNum = 46399540;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=46399541;
 //BA.debugLineNum = 46399541;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=46399542;
 //BA.debugLineNum = 46399542;BA.debugLine="cF.AliasCampoColumna=\"Fecha\"";
_cf.AliasCampoColumna /*String*/  = "Fecha";
RDebugUtils.currentLine=46399543;
 //BA.debugLineNum = 46399543;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=46399544;
 //BA.debugLineNum = 46399544;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=46399545;
 //BA.debugLineNum = 46399545;BA.debugLine="jamTableView1.SetCellFactory(cF)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cf);
RDebugUtils.currentLine=46399552;
 //BA.debugLineNum = 46399552;BA.debugLine="Inicio";
__ref._inicio /*void*/ (null);
RDebugUtils.currentLine=46399553;
 //BA.debugLineNum = 46399553;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.canalisistarifasinfoventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=46661638;
 //BA.debugLineNum = 46661638;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=46661639;
 //BA.debugLineNum = 46661639;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_celldobleclick(b4j.docU.canalisistarifasinfoventas __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}); return;}
ResumableSub_jamTableView1_CellDobleClick rsub = new ResumableSub_jamTableView1_CellDobleClick(this,__ref,_datosceldaseleccionada);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_CellDobleClick extends BA.ResumableSub {
public ResumableSub_jamTableView1_CellDobleClick(b4j.docU.canalisistarifasinfoventas parent,b4j.docU.canalisistarifasinfoventas __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfoventas __ref;
b4j.docU.canalisistarifasinfoventas parent;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Añadir los";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Añadir los datos de la línea como precio venta usuario?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "jamtableview1_celldobleclick"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="SeleccionarDatosPrecioVentaUsuarioLinea(DatosCeld";
__ref._seleccionardatosprecioventausuariolinea /*String*/ (null,_datosceldaseleccionada);
RDebugUtils.currentLine=46923781;
 //BA.debugLineNum = 46923781;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _seleccionardatosprecioventausuariolinea(b4j.docU.canalisistarifasinfoventas __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "seleccionardatosprecioventausuariolinea", false))
	 {return ((String) Debug.delegate(ba, "seleccionardatosprecioventausuariolinea", new Object[] {_datosceldaseleccionada}));}
String _divisa = "";
double _preciodivisa = 0;
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Sub SeleccionarDatosPrecioVentaUsuarioLinea(DatosC";
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioSeleccionado\",";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioSeleccionado"),(Object)(__c.True));
RDebugUtils.currentLine=47054859;
 //BA.debugLineNum = 47054859;BA.debugLine="Dim Divisa As String=jamTableView1.GetValorSQLCam";
_divisa = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"Divisa"));
RDebugUtils.currentLine=47054860;
 //BA.debugLineNum = 47054860;BA.debugLine="mDatosLineaSeleccionada.Put(\"Divisa\",Divisa)";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Divisa"),(Object)(_divisa));
RDebugUtils.currentLine=47054861;
 //BA.debugLineNum = 47054861;BA.debugLine="Dim PrecioDivisa As Double=jamTableView1.GetValor";
_preciodivisa = (double)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"PrecioVenta")));
RDebugUtils.currentLine=47054862;
 //BA.debugLineNum = 47054862;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioDivisa\",Precio";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioDivisa"),(Object)(_preciodivisa));
RDebugUtils.currentLine=47054863;
 //BA.debugLineNum = 47054863;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=47054864;
 //BA.debugLineNum = 47054864;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.canalisistarifasinfoventas __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"AddPrecioVentaUsuarioLineaSeleccionada")) {
case 0: {
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="SeleccionarDatosPrecioVentaUsuarioLinea(Dcs)";
__ref._seleccionardatosprecioventausuariolinea /*String*/ (null,_dcs);
 break; }
}
;
RDebugUtils.currentLine=46989318;
 //BA.debugLineNum = 46989318;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.canalisistarifasinfoventas __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.canalisistarifasinfoventas parent,b4j.docU.canalisistarifasinfoventas __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfoventas __ref;
b4j.docU.canalisistarifasinfoventas parent;
String _tagmenuitem;
int _fsel = 0;
Object _msa = null;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfoventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Select TagMenuItem";
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
RDebugUtils.currentLine=46858245;
 //BA.debugLineNum = 46858245;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
_fsel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=46858246;
 //BA.debugLineNum = 46858246;BA.debugLine="If fSel=-1 Then";
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
RDebugUtils.currentLine=46858247;
 //BA.debugLineNum = 46858247;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ninguna fila","Aviso");
RDebugUtils.currentLine=46858248;
 //BA.debugLineNum = 46858248;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfoventas", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
RDebugUtils.currentLine=46858249;
 //BA.debugLineNum = 46858249;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=46858251;
 //BA.debugLineNum = 46858251;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=46858252;
 //BA.debugLineNum = 46858252;BA.debugLine="SeleccionarDatosPrecioVentaUsuarioLinea(Dcs)";
__ref._seleccionardatosprecioventausuariolinea /*String*/ (null,_dcs);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=46858254;
 //BA.debugLineNum = 46858254;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}