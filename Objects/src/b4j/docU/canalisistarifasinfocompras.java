package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisistarifasinfocompras extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisistarifasinfocompras", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisistarifasinfocompras.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4j.docU.canalisistarifasinfocompras __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _articulo,String _descripcionarticulo,long _fechainicialventas,long _fechafinalventas) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_articulo,_descripcionarticulo,_fechainicialventas,_fechafinalventas}));}
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=45416458;
 //BA.debugLineNum = 45416458;BA.debugLine="mArticulo=Articulo";
__ref._marticulo /*String*/  = _articulo;
RDebugUtils.currentLine=45416459;
 //BA.debugLineNum = 45416459;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
__ref._mdescripcionarticulo /*String*/  = _descripcionarticulo;
RDebugUtils.currentLine=45416460;
 //BA.debugLineNum = 45416460;BA.debugLine="mFechaInicialVentas=FechaInicialVentas";
__ref._mfechainicialventas /*long*/  = _fechainicialventas;
RDebugUtils.currentLine=45416461;
 //BA.debugLineNum = 45416461;BA.debugLine="mFechaFinalVentas=FechaFinalVentas";
__ref._mfechafinalventas /*long*/  = _fechafinalventas;
RDebugUtils.currentLine=45416463;
 //BA.debugLineNum = 45416463;BA.debugLine="mDatosLineaSeleccionada.Initialize";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=45416464;
 //BA.debugLineNum = 45416464;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioSeleccionado\",";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioSeleccionado"),(Object)(__c.False));
RDebugUtils.currentLine=45416469;
 //BA.debugLineNum = 45416469;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioDivisa\",0)";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioDivisa"),(Object)(0));
RDebugUtils.currentLine=45416470;
 //BA.debugLineNum = 45416470;BA.debugLine="mDatosLineaSeleccionada.Put(\"Divisa\",\"\")";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Divisa"),(Object)(""));
RDebugUtils.currentLine=45416471;
 //BA.debugLineNum = 45416471;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=45416472;
 //BA.debugLineNum = 45416472;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(b4j.docU.canalisistarifasinfocompras __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="End Sub";
return "";
}
public String  _salirform(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "salirform", false))
	 {return ((String) Debug.delegate(ba, "salirform", null));}
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Sub SalirForm";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=45678597;
 //BA.debugLineNum = 45678597;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasInfoCo";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cAnalisisTarifasInfoCompras_Done",(Object)(__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ ));
RDebugUtils.currentLine=45678598;
 //BA.debugLineNum = 45678598;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=45350915;
 //BA.debugLineNum = 45350915;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=45350917;
 //BA.debugLineNum = 45350917;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=45350920;
 //BA.debugLineNum = 45350920;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=45350921;
 //BA.debugLineNum = 45350921;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=45350922;
 //BA.debugLineNum = 45350922;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=45350924;
 //BA.debugLineNum = 45350924;BA.debugLine="Dim mDatosLineaSeleccionada As Map";
_mdatoslineaseleccionada = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45350926;
 //BA.debugLineNum = 45350926;BA.debugLine="Dim mTipoTarifa As Int";
_mtipotarifa = 0;
RDebugUtils.currentLine=45350927;
 //BA.debugLineNum = 45350927;BA.debugLine="Dim mCodigoTarifa As String";
_mcodigotarifa = "";
RDebugUtils.currentLine=45350928;
 //BA.debugLineNum = 45350928;BA.debugLine="Dim mArticulo As String";
_marticulo = "";
RDebugUtils.currentLine=45350929;
 //BA.debugLineNum = 45350929;BA.debugLine="Dim mDescripcionArticulo As String";
_mdescripcionarticulo = "";
RDebugUtils.currentLine=45350930;
 //BA.debugLineNum = 45350930;BA.debugLine="Dim mFechaInicialVentas, mFechaFinalVentas As Lon";
_mfechainicialventas = 0L;
_mfechafinalventas = 0L;
RDebugUtils.currentLine=45350932;
 //BA.debugLineNum = 45350932;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=45350933;
 //BA.debugLineNum = 45350933;BA.debugLine="Private txtArticulo As TextField";
_txtarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=45350934;
 //BA.debugLineNum = 45350934;BA.debugLine="Private txtDescripcionArticulo As TextField";
_txtdescripcionarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=45350935;
 //BA.debugLineNum = 45350935;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datoscompraarticulo(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "datoscompraarticulo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datoscompraarticulo", null));}
ResumableSub_DatosCompraArticulo rsub = new ResumableSub_DatosCompraArticulo(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosCompraArticulo extends BA.ResumableSub {
public ResumableSub_DatosCompraArticulo(b4j.docU.canalisistarifasinfocompras parent,b4j.docU.canalisistarifasinfocompras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfocompras __ref;
b4j.docU.canalisistarifasinfocompras parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _comando = "";
String _dateformatant = "";
String _sfechainicialcompras = "";
String _sfechafinalcompras = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=45875203;
 //BA.debugLineNum = 45875203;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=45875206;
 //BA.debugLineNum = 45875206;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=45875207;
 //BA.debugLineNum = 45875207;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
_mresult.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=45875208;
 //BA.debugLineNum = 45875208;BA.debugLine="Dim Comando As String=\"AnalisisTarifasInfoCompras";
_comando = "AnalisisTarifasInfoComprasArticulo";
RDebugUtils.currentLine=45875209;
 //BA.debugLineNum = 45875209;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=45875210;
 //BA.debugLineNum = 45875210;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=45875211;
 //BA.debugLineNum = 45875211;BA.debugLine="Dim sFechaInicialCompras As String=DateTime.Date(";
_sfechainicialcompras = parent.__c.DateTime.Date(__ref._mfechainicialventas /*long*/ );
RDebugUtils.currentLine=45875212;
 //BA.debugLineNum = 45875212;BA.debugLine="Dim sFechaFinalCompras As String=DateTime.Date(mF";
_sfechafinalcompras = parent.__c.DateTime.Date(__ref._mfechafinalventas /*long*/ );
RDebugUtils.currentLine=45875213;
 //BA.debugLineNum = 45875213;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=45875215;
 //BA.debugLineNum = 45875215;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(__ref._marticulo /*String*/ ),(Object)(_sfechainicialcompras),(Object)(_sfechafinalcompras)},parent);
RDebugUtils.currentLine=45875216;
 //BA.debugLineNum = 45875216;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "datoscompraarticulo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45875218;
 //BA.debugLineNum = 45875218;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=45875219;
 //BA.debugLineNum = 45875219;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=45875220;
 //BA.debugLineNum = 45875220;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "datoscompraarticulo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=45875221;
 //BA.debugLineNum = 45875221;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
RDebugUtils.currentLine=45875222;
 //BA.debugLineNum = 45875222;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=45875224;
 //BA.debugLineNum = 45875224;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=45875225;
 //BA.debugLineNum = 45875225;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos registrados de compras para el artículo seleccionados","Aviso");
RDebugUtils.currentLine=45875226;
 //BA.debugLineNum = 45875226;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "datoscompraarticulo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=45875227;
 //BA.debugLineNum = 45875227;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=45875228;
 //BA.debugLineNum = 45875228;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=45875230;
 //BA.debugLineNum = 45875230;BA.debugLine="lstRegistros=mResult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=45875231;
 //BA.debugLineNum = 45875231;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=45875232;
 //BA.debugLineNum = 45875232;BA.debugLine="mResult.Put(\"Accion\",Accion)";
_mresult.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=45875233;
 //BA.debugLineNum = 45875233;BA.debugLine="mResult.Put(\"lstRegistros\",lstRegistros)";
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
RDebugUtils.currentLine=45875236;
 //BA.debugLineNum = 45875236;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=45875237;
 //BA.debugLineNum = 45875237;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.canalisistarifasinfocompras __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="End Sub";
return "";
}
public void  _inicio(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {Debug.delegate(ba, "inicio", null); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.canalisistarifasinfocompras parent,b4j.docU.canalisistarifasinfocompras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfocompras __ref;
b4j.docU.canalisistarifasinfocompras parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45809666;
 //BA.debugLineNum = 45809666;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=45809667;
 //BA.debugLineNum = 45809667;BA.debugLine="wait for(DatosCompraArticulo) complete (mResult A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "inicio"), __ref._datoscompraarticulo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45809668;
 //BA.debugLineNum = 45809668;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=45809669;
 //BA.debugLineNum = 45809669;BA.debugLine="If mResult.Get(\"Accion\")<>\"Continuar\" Then";
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
RDebugUtils.currentLine=45809670;
 //BA.debugLineNum = 45809670;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=45809671;
 //BA.debugLineNum = 45809671;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=45809674;
 //BA.debugLineNum = 45809674;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=45809676;
 //BA.debugLineNum = 45809676;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=45809677;
 //BA.debugLineNum = 45809677;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(ls";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=45809678;
 //BA.debugLineNum = 45809678;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "inicio"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45809679;
 //BA.debugLineNum = 45809679;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=45809680;
 //BA.debugLineNum = 45809680;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=45809681;
 //BA.debugLineNum = 45809681;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=45809682;
 //BA.debugLineNum = 45809682;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
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
RDebugUtils.currentLine=45809683;
 //BA.debugLineNum = 45809683;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=45809684;
 //BA.debugLineNum = 45809684;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "inicio"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=45809686;
 //BA.debugLineNum = 45809686;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 11:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=45809687;
 //BA.debugLineNum = 45809687;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=45809688;
 //BA.debugLineNum = 45809688;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "inicio"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 14;
;
RDebugUtils.currentLine=45809690;
 //BA.debugLineNum = 45809690;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=45809691;
 //BA.debugLineNum = 45809691;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "inicio"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
_rint = (int) result[1];
;
RDebugUtils.currentLine=45809692;
 //BA.debugLineNum = 45809692;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=45809693;
 //BA.debugLineNum = 45809693;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=45809694;
 //BA.debugLineNum = 45809694;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=45809697;
 //BA.debugLineNum = 45809697;BA.debugLine="ExitApplication";
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
RDebugUtils.currentLine=45809700;
 //BA.debugLineNum = 45809700;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _show(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisistarifasinfocompras parent,b4j.docU.canalisistarifasinfocompras __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfocompras __ref;
b4j.docU.canalisistarifasinfocompras parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45481987;
 //BA.debugLineNum = 45481987;BA.debugLine="frm.Initialize(\"frm\",-1,-1)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",-1,-1);
RDebugUtils.currentLine=45481989;
 //BA.debugLineNum = 45481989;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=45481990;
 //BA.debugLineNum = 45481990;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=45481991;
 //BA.debugLineNum = 45481991;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=45481993;
 //BA.debugLineNum = 45481993;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisTarifasInfoCo";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrAnalisisTarifasInfoCompras");
RDebugUtils.currentLine=45481995;
 //BA.debugLineNum = 45481995;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=45481997;
 //BA.debugLineNum = 45481997;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=45481999;
 //BA.debugLineNum = 45481999;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Info Comp";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    Info Compras Periodo");
RDebugUtils.currentLine=45482003;
 //BA.debugLineNum = 45482003;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=45482004;
 //BA.debugLineNum = 45482004;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=45482007;
 //BA.debugLineNum = 45482007;BA.debugLine="txtArticulo.Text=mArticulo";
__ref._txtarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._marticulo /*String*/ );
RDebugUtils.currentLine=45482008;
 //BA.debugLineNum = 45482008;BA.debugLine="txtDescripcionArticulo.Text=mDescripcionArticulo";
__ref._txtdescripcionarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._mdescripcionarticulo /*String*/ );
RDebugUtils.currentLine=45482014;
 //BA.debugLineNum = 45482014;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=45482015;
 //BA.debugLineNum = 45482015;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=45482017;
 //BA.debugLineNum = 45482017;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.WAIT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=45482019;
 //BA.debugLineNum = 45482019;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisTarifasInfoComprasArticulo.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=45482020;
 //BA.debugLineNum = 45482020;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45482025;
 //BA.debugLineNum = 45482025;BA.debugLine="jamTableView1.SetMouseCursor(fx.Cursors.DEFAULT)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=45482027;
 //BA.debugLineNum = 45482027;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=45482028;
 //BA.debugLineNum = 45482028;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=45482029;
 //BA.debugLineNum = 45482029;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=45482030;
 //BA.debugLineNum = 45482030;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=45482031;
 //BA.debugLineNum = 45482031;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=45482034;
 //BA.debugLineNum = 45482034;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Añadir Precio Seleccionado a Lista Precios Compra Usuario","AddPrecioCompraUsuarioLineaSeleccionada",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ );
RDebugUtils.currentLine=45482036;
 //BA.debugLineNum = 45482036;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=45482037;
 //BA.debugLineNum = 45482037;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Añadir Precio Seleccionado a Lista Precios Compra Usuario","AddPrecioCompraUsuarioLineaSeleccionada",BA.ObjectToString(parent.__c.Chr(((int)0xf0a4))));
RDebugUtils.currentLine=45482039;
 //BA.debugLineNum = 45482039;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=45482040;
 //BA.debugLineNum = 45482040;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=45482041;
 //BA.debugLineNum = 45482041;BA.debugLine="cF.AliasCampoColumna=\"FechaRegistro\"";
_cf.AliasCampoColumna /*String*/  = "FechaRegistro";
RDebugUtils.currentLine=45482042;
 //BA.debugLineNum = 45482042;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=45482043;
 //BA.debugLineNum = 45482043;BA.debugLine="cF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=45482044;
 //BA.debugLineNum = 45482044;BA.debugLine="jamTableView1.SetCellFactory(cF)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cf);
RDebugUtils.currentLine=45482058;
 //BA.debugLineNum = 45482058;BA.debugLine="Inicio";
__ref._inicio /*void*/ (null);
RDebugUtils.currentLine=45482059;
 //BA.debugLineNum = 45482059;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.canalisistarifasinfocompras __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=45744134;
 //BA.debugLineNum = 45744134;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=45744135;
 //BA.debugLineNum = 45744135;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_celldobleclick(b4j.docU.canalisistarifasinfocompras __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}); return;}
ResumableSub_jamTableView1_CellDobleClick rsub = new ResumableSub_jamTableView1_CellDobleClick(this,__ref,_datosceldaseleccionada);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_CellDobleClick extends BA.ResumableSub {
public ResumableSub_jamTableView1_CellDobleClick(b4j.docU.canalisistarifasinfocompras parent,b4j.docU.canalisistarifasinfocompras __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfocompras __ref;
b4j.docU.canalisistarifasinfocompras parent;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Añadir los";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Añadir los datos de la línea como precio compra usuario?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "jamtableview1_celldobleclick"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=46006275;
 //BA.debugLineNum = 46006275;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=46006276;
 //BA.debugLineNum = 46006276;BA.debugLine="SeleccionarDatosPrecioCompraUsuarioLinea(DatosCel";
__ref._seleccionardatospreciocomprausuariolinea /*String*/ (null,_datosceldaseleccionada);
RDebugUtils.currentLine=46006277;
 //BA.debugLineNum = 46006277;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _seleccionardatospreciocomprausuariolinea(b4j.docU.canalisistarifasinfocompras __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "seleccionardatospreciocomprausuariolinea", false))
	 {return ((String) Debug.delegate(ba, "seleccionardatospreciocomprausuariolinea", new Object[] {_datosceldaseleccionada}));}
String _divisa = "";
double _preciodivisa = 0;
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Sub SeleccionarDatosPrecioCompraUsuarioLinea(Datos";
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioSeleccionado\",";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioSeleccionado"),(Object)(__c.True));
RDebugUtils.currentLine=46137355;
 //BA.debugLineNum = 46137355;BA.debugLine="Dim Divisa As String=jamTableView1.GetValorSQLCam";
_divisa = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"Divisa"));
RDebugUtils.currentLine=46137356;
 //BA.debugLineNum = 46137356;BA.debugLine="mDatosLineaSeleccionada.Put(\"Divisa\",Divisa)";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Divisa"),(Object)(_divisa));
RDebugUtils.currentLine=46137357;
 //BA.debugLineNum = 46137357;BA.debugLine="Dim PrecioDivisa As Double=jamTableView1.GetValor";
_preciodivisa = (double)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null),"PrecioCompraDivisa")));
RDebugUtils.currentLine=46137358;
 //BA.debugLineNum = 46137358;BA.debugLine="mDatosLineaSeleccionada.Put(\"PrecioDivisa\",Precio";
__ref._mdatoslineaseleccionada /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("PrecioDivisa"),(Object)(_preciodivisa));
RDebugUtils.currentLine=46137359;
 //BA.debugLineNum = 46137359;BA.debugLine="SalirForm";
__ref._salirform /*String*/ (null);
RDebugUtils.currentLine=46137360;
 //BA.debugLineNum = 46137360;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.canalisistarifasinfocompras __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"AddPrecioCompraUsuarioLineaSeleccionada")) {
case 0: {
RDebugUtils.currentLine=46071811;
 //BA.debugLineNum = 46071811;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="SeleccionarDatosPrecioCompraUsuarioLinea(Dcs)";
__ref._seleccionardatospreciocomprausuariolinea /*String*/ (null,_dcs);
 break; }
}
;
RDebugUtils.currentLine=46071814;
 //BA.debugLineNum = 46071814;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.canalisistarifasinfocompras __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.canalisistarifasinfocompras parent,b4j.docU.canalisistarifasinfocompras __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisistarifasinfocompras __ref;
b4j.docU.canalisistarifasinfocompras parent;
String _tagmenuitem;
int _fsel = 0;
Object _msa = null;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasinfocompras";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="Select TagMenuItem";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_tagmenuitem,"AddPrecioCompraUsuarioLineaSeleccionada")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=45940741;
 //BA.debugLineNum = 45940741;BA.debugLine="Dim fSel As Int=jamTableView1.GetIndiceFilaSele";
_fsel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=45940742;
 //BA.debugLineNum = 45940742;BA.debugLine="If fSel=-1 Then";
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
RDebugUtils.currentLine=45940743;
 //BA.debugLineNum = 45940743;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha se";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ninguna fila","Aviso");
RDebugUtils.currentLine=45940744;
 //BA.debugLineNum = 45940744;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasinfocompras", "jamtableview1_menubarmenuitem_action"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
RDebugUtils.currentLine=45940745;
 //BA.debugLineNum = 45940745;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=45940747;
 //BA.debugLineNum = 45940747;BA.debugLine="Dim Dcs As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=45940748;
 //BA.debugLineNum = 45940748;BA.debugLine="SeleccionarDatosPrecioCompraUsuarioLinea(Dcs)";
__ref._seleccionardatospreciocomprausuariolinea /*String*/ (null,_dcs);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=45940750;
 //BA.debugLineNum = 45940750;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}