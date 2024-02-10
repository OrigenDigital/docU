package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisistarifasavisostarifaventa extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisistarifasavisostarifaventa", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisistarifasavisostarifaventa.class).invoke(this, new Object[] {null});
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
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public anywheresoftware.b4j.objects.Form _mfrmparent = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public b4j.docU.jamtableview _jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo = null;
public int _midanalisistarifasventa = 0;
public int _mtipotarifa = 0;
public String _mcodigotarifa = "";
public String _marticulo = "";
public String _mdescripcionarticulo = "";
public boolean _datoseditados = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnumpreciosdivisa = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlearticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlecodigotarifa = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitledescripcionarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumminqty = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumprecios = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumpreciosarttalla = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumpreciosumdifumvta = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitletipotarifa = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondodatosavisos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnljamtableviewanalisistarifaslineastarifasventavalidastipotarifacodigotarifaarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtarticuloavisos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodigotarifaavisos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescripcionarticuloavisos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumminqty = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumprecios = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciosarttalla = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciosdivisa = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciosumdifumvta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttipotarifaavisos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfotarifasventavalidastipotarifacodigotarifaarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo = null;
public b4j.docU.jamformregistro _frprecioventausuario = null;
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
public String  _initialize(b4j.docU.canalisistarifasavisostarifaventa __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4j.objects.Form _frmparent,int _idanalisisventa,int _tipotarifa,String _codigotarifa,String _articulo,String _descripcionarticulo) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_frmparent,_idanalisisventa,_tipotarifa,_codigotarifa,_articulo,_descripcionarticulo}));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=44630019;
 //BA.debugLineNum = 44630019;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=44630021;
 //BA.debugLineNum = 44630021;BA.debugLine="mFrmParent=frmParent";
__ref._mfrmparent /*anywheresoftware.b4j.objects.Form*/  = _frmparent;
RDebugUtils.currentLine=44630023;
 //BA.debugLineNum = 44630023;BA.debugLine="mIDAnalisisTarifasVenta=IDAnalisisVenta";
__ref._midanalisistarifasventa /*int*/  = _idanalisisventa;
RDebugUtils.currentLine=44630024;
 //BA.debugLineNum = 44630024;BA.debugLine="mTipoTarifa=TipoTarifa";
__ref._mtipotarifa /*int*/  = _tipotarifa;
RDebugUtils.currentLine=44630025;
 //BA.debugLineNum = 44630025;BA.debugLine="mCodigoTarifa=CodigoTarifa";
__ref._mcodigotarifa /*String*/  = _codigotarifa;
RDebugUtils.currentLine=44630026;
 //BA.debugLineNum = 44630026;BA.debugLine="mArticulo=Articulo";
__ref._marticulo /*String*/  = _articulo;
RDebugUtils.currentLine=44630027;
 //BA.debugLineNum = 44630027;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
__ref._mdescripcionarticulo /*String*/  = _descripcionarticulo;
RDebugUtils.currentLine=44630029;
 //BA.debugLineNum = 44630029;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=44630030;
 //BA.debugLineNum = 44630030;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.canalisistarifasavisostarifaventa __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.canalisistarifasavisostarifaventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.canalisistarifasavisostarifaventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="If jamTableViewLineasTarifasVentaValidasTipoTarif";
if (__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaC";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
 };
RDebugUtils.currentLine=45023238;
 //BA.debugLineNum = 45023238;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=45023240;
 //BA.debugLineNum = 45023240;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasAvisos";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cAnalisisTarifasAvisosTarifaVenta_Done",(Object)(__ref._datoseditados /*boolean*/ ));
RDebugUtils.currentLine=45023241;
 //BA.debugLineNum = 45023241;BA.debugLine="End Sub";
return "";
}
public String  _btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo_click(b4j.docU.canalisistarifasavisostarifaventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo_click", null));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Private Sub btnSalirInfoAvisosTarifasVentaTipoTari";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalineastarifaventatipotarifacodigotarifaarticulo(b4j.docU.canalisistarifasavisostarifaventa __ref,int _tipotarifasel,String _codigotarifasel,String _articulosel) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "cargalineastarifaventatipotarifacodigotarifaarticulo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalineastarifaventatipotarifacodigotarifaarticulo", new Object[] {_tipotarifasel,_codigotarifasel,_articulosel}));}
ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo rsub = new ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(this,__ref,_tipotarifasel,_codigotarifasel,_articulosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo extends BA.ResumableSub {
public ResumableSub_CargaLineasTarifaVentaTipoTarifaCodigoTarifaArticulo(b4j.docU.canalisistarifasavisostarifaventa parent,b4j.docU.canalisistarifasavisostarifaventa __ref,int _tipotarifasel,String _codigotarifasel,String _articulosel) {
this.parent = parent;
this.__ref = __ref;
this._tipotarifasel = _tipotarifasel;
this._codigotarifasel = _codigotarifasel;
this._articulosel = _articulosel;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifaventa __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
int _tipotarifasel;
String _codigotarifasel;
String _articulosel;
String _stipotarifasel = "";
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="Dim sTipoTarifaSel As String";
_stipotarifasel = "";
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="If TipoTarifaSel=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_tipotarifasel==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=45154307;
 //BA.debugLineNum = 45154307;BA.debugLine="sTipoTarifaSel=\"Cliente\"";
_stipotarifasel = "Cliente";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=45154309;
 //BA.debugLineNum = 45154309;BA.debugLine="sTipoTarifaSel=\"GRP\"";
_stipotarifasel = "GRP";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=45154312;
 //BA.debugLineNum = 45154312;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAnalisisTarifas";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo");
RDebugUtils.currentLine=45154313;
 //BA.debugLineNum = 45154313;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=45154314;
 //BA.debugLineNum = 45154314;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=45154315;
 //BA.debugLineNum = 45154315;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=45154316;
 //BA.debugLineNum = 45154316;BA.debugLine="Dim Comando As String=\"AnalisisTarifasLineasTarif";
_comando = "AnalisisTarifasLineasTarifaVentaTipoTarifaCodigoTarifaArticulo";
RDebugUtils.currentLine=45154317;
 //BA.debugLineNum = 45154317;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_tipotarifasel),(Object)(_codigotarifasel),(Object)(_articulosel)},parent);
RDebugUtils.currentLine=45154319;
 //BA.debugLineNum = 45154319;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "cargalineastarifaventatipotarifacodigotarifaarticulo"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45154321;
 //BA.debugLineNum = 45154321;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=45154322;
 //BA.debugLineNum = 45154322;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=45154323;
 //BA.debugLineNum = 45154323;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=45154324;
 //BA.debugLineNum = 45154324;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "cargalineastarifaventatipotarifacodigotarifaarticulo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=45154325;
 //BA.debugLineNum = 45154325;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=45154326;
 //BA.debugLineNum = 45154326;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=45154329;
 //BA.debugLineNum = 45154329;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=45154330;
 //BA.debugLineNum = 45154330;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=45154331;
 //BA.debugLineNum = 45154331;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"NO hay línea";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"NO hay líneas de tarifas de venta válidas para los datos seleccionados (Tipo: "+_stipotarifasel+" Código: "+_codigotarifasel+" Artículo: "+_articulosel+".","Aviso");
RDebugUtils.currentLine=45154332;
 //BA.debugLineNum = 45154332;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "cargalineastarifaventatipotarifacodigotarifaarticulo"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
RDebugUtils.currentLine=45154333;
 //BA.debugLineNum = 45154333;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=45154334;
 //BA.debugLineNum = 45154334;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=45154336;
 //BA.debugLineNum = 45154336;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=45154337;
 //BA.debugLineNum = 45154337;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=45154338;
 //BA.debugLineNum = 45154338;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=45154339;
 //BA.debugLineNum = 45154339;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=45154340;
 //BA.debugLineNum = 45154340;BA.debugLine="mRes.Put(\"mData\", mData)";
_mres.Put((Object)("mData"),(Object)(_mdata.getObject()));
RDebugUtils.currentLine=45154341;
 //BA.debugLineNum = 45154341;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo",_lstreg);
RDebugUtils.currentLine=45154342;
 //BA.debugLineNum = 45154342;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisTarifasLi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo set IDAnalisisTarifas=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._midanalisistarifasventa /*int*/ )}));
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
RDebugUtils.currentLine=45154345;
 //BA.debugLineNum = 45154345;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=45154346;
 //BA.debugLineNum = 45154346;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.canalisistarifasavisostarifaventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=44564483;
 //BA.debugLineNum = 44564483;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=44564486;
 //BA.debugLineNum = 44564486;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=44564487;
 //BA.debugLineNum = 44564487;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564488;
 //BA.debugLineNum = 44564488;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564489;
 //BA.debugLineNum = 44564489;BA.debugLine="Dim Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564491;
 //BA.debugLineNum = 44564491;BA.debugLine="Dim mFrmParent As Form  '  necesario para el jamT";
_mfrmparent = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=44564494;
 //BA.debugLineNum = 44564494;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=44564496;
 //BA.debugLineNum = 44564496;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=44564497;
 //BA.debugLineNum = 44564497;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=44564498;
 //BA.debugLineNum = 44564498;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=44564500;
 //BA.debugLineNum = 44564500;BA.debugLine="Dim jamTableViewLineasTarifasVentaValidasTipoTari";
_jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo = new b4j.docU.jamtableview();
RDebugUtils.currentLine=44564502;
 //BA.debugLineNum = 44564502;BA.debugLine="Dim mIDAnalisisTarifasVenta As Int";
_midanalisistarifasventa = 0;
RDebugUtils.currentLine=44564503;
 //BA.debugLineNum = 44564503;BA.debugLine="Dim mTipoTarifa As Int";
_mtipotarifa = 0;
RDebugUtils.currentLine=44564504;
 //BA.debugLineNum = 44564504;BA.debugLine="Dim mCodigoTarifa As String";
_mcodigotarifa = "";
RDebugUtils.currentLine=44564505;
 //BA.debugLineNum = 44564505;BA.debugLine="Dim mArticulo As String";
_marticulo = "";
RDebugUtils.currentLine=44564506;
 //BA.debugLineNum = 44564506;BA.debugLine="Dim mDescripcionArticulo As String";
_mdescripcionarticulo = "";
RDebugUtils.currentLine=44564509;
 //BA.debugLineNum = 44564509;BA.debugLine="Dim DatosEditados As Boolean";
_datoseditados = false;
RDebugUtils.currentLine=44564510;
 //BA.debugLineNum = 44564510;BA.debugLine="Private lblNumPreciosDivisa As B4XView";
_lblnumpreciosdivisa = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564511;
 //BA.debugLineNum = 44564511;BA.debugLine="Private lblTitleArticulo As B4XView";
_lbltitlearticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564512;
 //BA.debugLineNum = 44564512;BA.debugLine="Private lblTitleCodigoTarifa As B4XView";
_lbltitlecodigotarifa = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564513;
 //BA.debugLineNum = 44564513;BA.debugLine="Private lblTitleDescripcionArticulo As B4XView";
_lbltitledescripcionarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564514;
 //BA.debugLineNum = 44564514;BA.debugLine="Private lblTitleNumMinQty As B4XView";
_lbltitlenumminqty = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564515;
 //BA.debugLineNum = 44564515;BA.debugLine="Private lblTitleNumPrecios As B4XView";
_lbltitlenumprecios = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564516;
 //BA.debugLineNum = 44564516;BA.debugLine="Private lblTitleNumPreciosArtTalla As B4XView";
_lbltitlenumpreciosarttalla = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564517;
 //BA.debugLineNum = 44564517;BA.debugLine="Private lblTitleNumPreciosUMDifUMVta As B4XView";
_lbltitlenumpreciosumdifumvta = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564518;
 //BA.debugLineNum = 44564518;BA.debugLine="Private lblTitleTipoTarifa As B4XView";
_lbltitletipotarifa = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564519;
 //BA.debugLineNum = 44564519;BA.debugLine="Private pnlFondoDatosAvisos As B4XView";
_pnlfondodatosavisos = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564520;
 //BA.debugLineNum = 44564520;BA.debugLine="Private pnljamTableViewAnalisisTarifasLineasTarif";
_pnljamtableviewanalisistarifaslineastarifasventavalidastipotarifacodigotarifaarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564521;
 //BA.debugLineNum = 44564521;BA.debugLine="Private txtArticuloAvisos As TextField";
_txtarticuloavisos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564522;
 //BA.debugLineNum = 44564522;BA.debugLine="Private txtCodigoTarifaAvisos As TextField";
_txtcodigotarifaavisos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564523;
 //BA.debugLineNum = 44564523;BA.debugLine="Private txtDescripcionArticuloAvisos As TextField";
_txtdescripcionarticuloavisos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564524;
 //BA.debugLineNum = 44564524;BA.debugLine="Private txtNumMinQty As TextField";
_txtnumminqty = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564525;
 //BA.debugLineNum = 44564525;BA.debugLine="Private txtNumPrecios As TextField";
_txtnumprecios = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564526;
 //BA.debugLineNum = 44564526;BA.debugLine="Private txtNumPreciosArtTalla As TextField";
_txtnumpreciosarttalla = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564527;
 //BA.debugLineNum = 44564527;BA.debugLine="Private txtNumPreciosDivisa As TextField";
_txtnumpreciosdivisa = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564528;
 //BA.debugLineNum = 44564528;BA.debugLine="Private txtNumPreciosUMDifUMVta As TextField";
_txtnumpreciosumdifumvta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564529;
 //BA.debugLineNum = 44564529;BA.debugLine="Private txtTipoTarifaAvisos As TextField";
_txttipotarifaavisos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=44564531;
 //BA.debugLineNum = 44564531;BA.debugLine="Private lblInfoTarifasVentaValidasTipoTarifaCodig";
_lblinfotarifasventavalidastipotarifacodigotarifaarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564532;
 //BA.debugLineNum = 44564532;BA.debugLine="Private btnSalirInfoAvisosTarifasVentaTipoTarifaC";
_btnsalirinfoavisostarifasventatipotarifacodigotarifaarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=44564534;
 //BA.debugLineNum = 44564534;BA.debugLine="Private fRPrecioVentaUsuario As jamFormRegistro";
_frprecioventausuario = new b4j.docU.jamformregistro();
RDebugUtils.currentLine=44564535;
 //BA.debugLineNum = 44564535;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datoslineastarifasavisostipotarifacodigotarifaarticulo(b4j.docU.canalisistarifasavisostarifaventa __ref,int _tipotarifasel,String _codigotarifasel,String _articulosel,String _descripcionarticulosel) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "datoslineastarifasavisostipotarifacodigotarifaarticulo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datoslineastarifasavisostipotarifacodigotarifaarticulo", new Object[] {_tipotarifasel,_codigotarifasel,_articulosel,_descripcionarticulosel}));}
ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo rsub = new ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(this,__ref,_tipotarifasel,_codigotarifasel,_articulosel,_descripcionarticulosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo extends BA.ResumableSub {
public ResumableSub_DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArticulo(b4j.docU.canalisistarifasavisostarifaventa parent,b4j.docU.canalisistarifasavisostarifaventa __ref,int _tipotarifasel,String _codigotarifasel,String _articulosel,String _descripcionarticulosel) {
this.parent = parent;
this.__ref = __ref;
this._tipotarifasel = _tipotarifasel;
this._codigotarifasel = _codigotarifasel;
this._articulosel = _articulosel;
this._descripcionarticulosel = _descripcionarticulosel;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifaventa __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
int _tipotarifasel;
String _codigotarifasel;
String _articulosel;
String _descripcionarticulosel;
String _stipotarifasel = "";
int _numpreciosart = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _tf = null;
int _numpreciosarttalla = 0;
int _numminqty = 0;
int _numpreciosdivisa = 0;
int _numpreciosumdifumvta = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45088771;
 //BA.debugLineNum = 45088771;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos tarifas..."));
RDebugUtils.currentLine=45088772;
 //BA.debugLineNum = 45088772;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=45088774;
 //BA.debugLineNum = 45088774;BA.debugLine="Dim sTipoTarifaSel As String";
_stipotarifasel = "";
RDebugUtils.currentLine=45088775;
 //BA.debugLineNum = 45088775;BA.debugLine="If TipoTarifaSel=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_tipotarifasel==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=45088776;
 //BA.debugLineNum = 45088776;BA.debugLine="sTipoTarifaSel=\"Cliente\"";
_stipotarifasel = "Cliente";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=45088778;
 //BA.debugLineNum = 45088778;BA.debugLine="sTipoTarifaSel=\"GRP\"";
_stipotarifasel = "GRP";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=45088780;
 //BA.debugLineNum = 45088780;BA.debugLine="txtTipoTarifaAvisos.Text=sTipoTarifaSel";
__ref._txttipotarifaavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_stipotarifasel);
RDebugUtils.currentLine=45088781;
 //BA.debugLineNum = 45088781;BA.debugLine="txtCodigoTarifaAvisos.Text=CodigoTarifaSel";
__ref._txtcodigotarifaavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_codigotarifasel);
RDebugUtils.currentLine=45088782;
 //BA.debugLineNum = 45088782;BA.debugLine="txtArticuloAvisos.Text=ArticuloSel";
__ref._txtarticuloavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_articulosel);
RDebugUtils.currentLine=45088783;
 //BA.debugLineNum = 45088783;BA.debugLine="txtDescripcionArticuloAvisos.Text=DescripcionArti";
__ref._txtdescripcionarticuloavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_descripcionarticulosel);
RDebugUtils.currentLine=45088786;
 //BA.debugLineNum = 45088786;BA.debugLine="Dim NumPreciosArt As Int=Utilidades.FixNullInt(mS";
_numpreciosart = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))));
RDebugUtils.currentLine=45088788;
 //BA.debugLineNum = 45088788;BA.debugLine="txtNumPrecios.Text=NumPreciosArt";
__ref._txtnumprecios /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosart));
RDebugUtils.currentLine=45088789;
 //BA.debugLineNum = 45088789;BA.debugLine="Dim tF As B4XView=txtNumPrecios";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumprecios /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=45088790;
 //BA.debugLineNum = 45088790;BA.debugLine="If NumPreciosArt>1 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_numpreciosart>1) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=45088791;
 //BA.debugLineNum = 45088791;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=45088792;
 //BA.debugLineNum = 45088792;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=45088794;
 //BA.debugLineNum = 45088794;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=45088795;
 //BA.debugLineNum = 45088795;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=45088798;
 //BA.debugLineNum = 45088798;BA.debugLine="Dim NumPreciosArtTalla As Int=Utilidades.FixNullI";
_numpreciosarttalla = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))));
RDebugUtils.currentLine=45088800;
 //BA.debugLineNum = 45088800;BA.debugLine="txtNumPreciosArtTalla.text=NumPreciosArtTalla";
__ref._txtnumpreciosarttalla /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosarttalla));
RDebugUtils.currentLine=45088801;
 //BA.debugLineNum = 45088801;BA.debugLine="Dim tF As B4XView=txtNumPreciosArtTalla";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciosarttalla /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=45088802;
 //BA.debugLineNum = 45088802;BA.debugLine="If NumPreciosArtTalla>0 Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_numpreciosarttalla>0) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=45088803;
 //BA.debugLineNum = 45088803;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=45088804;
 //BA.debugLineNum = 45088804;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=45088806;
 //BA.debugLineNum = 45088806;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=45088807;
 //BA.debugLineNum = 45088807;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=45088810;
 //BA.debugLineNum = 45088810;BA.debugLine="Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.E";
_numminqty = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))));
RDebugUtils.currentLine=45088812;
 //BA.debugLineNum = 45088812;BA.debugLine="txtNumMinQty.text=NumMinQty";
__ref._txtnumminqty /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numminqty));
RDebugUtils.currentLine=45088813;
 //BA.debugLineNum = 45088813;BA.debugLine="Dim tF As B4XView=txtNumMinQty";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumminqty /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=45088814;
 //BA.debugLineNum = 45088814;BA.debugLine="If NumMinQty>0 Then";
if (true) break;

case 19:
//if
this.state = 24;
if (_numminqty>0) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=45088815;
 //BA.debugLineNum = 45088815;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=45088816;
 //BA.debugLineNum = 45088816;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=45088818;
 //BA.debugLineNum = 45088818;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=45088819;
 //BA.debugLineNum = 45088819;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=45088823;
 //BA.debugLineNum = 45088823;BA.debugLine="Dim NumPreciosDivisa As Int=Utilidades.FixNullInt";
_numpreciosdivisa = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))));
RDebugUtils.currentLine=45088825;
 //BA.debugLineNum = 45088825;BA.debugLine="txtNumPreciosDivisa.text=NumPreciosDivisa";
__ref._txtnumpreciosdivisa /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosdivisa));
RDebugUtils.currentLine=45088826;
 //BA.debugLineNum = 45088826;BA.debugLine="Dim tF As B4XView=txtNumPreciosDivisa";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciosdivisa /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=45088827;
 //BA.debugLineNum = 45088827;BA.debugLine="If NumPreciosDivisa>0 Then";
if (true) break;

case 25:
//if
this.state = 30;
if (_numpreciosdivisa>0) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=45088828;
 //BA.debugLineNum = 45088828;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=45088829;
 //BA.debugLineNum = 45088829;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=45088831;
 //BA.debugLineNum = 45088831;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=45088832;
 //BA.debugLineNum = 45088832;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=45088837;
 //BA.debugLineNum = 45088837;BA.debugLine="Dim NumPreciosUMDifUMVta As Int=Utilidades.FixNul";
_numpreciosumdifumvta = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosUMDifUMVta from tblAnalisisTarifasVentasAvisosTarifasVentas where TipoTarifa=? and CodigoTarifa=? and Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_tipotarifasel),_codigotarifasel,_articulosel}))));
RDebugUtils.currentLine=45088839;
 //BA.debugLineNum = 45088839;BA.debugLine="txtNumPreciosUMDifUMVta.text=NumPreciosUMDifUMVta";
__ref._txtnumpreciosumdifumvta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosumdifumvta));
RDebugUtils.currentLine=45088840;
 //BA.debugLineNum = 45088840;BA.debugLine="Dim tF As B4XView=txtNumPreciosUMDifUMVta";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciosumdifumvta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=45088841;
 //BA.debugLineNum = 45088841;BA.debugLine="If NumPreciosUMDifUMVta>0 Then";
if (true) break;

case 31:
//if
this.state = 36;
if (_numpreciosumdifumvta>0) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
RDebugUtils.currentLine=45088842;
 //BA.debugLineNum = 45088842;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=45088843;
 //BA.debugLineNum = 45088843;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=45088845;
 //BA.debugLineNum = 45088845;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=45088846;
 //BA.debugLineNum = 45088846;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=45088851;
 //BA.debugLineNum = 45088851;BA.debugLine="wait for (CargaLineasTarifaVentaTipoTarifaCodigoT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), __ref._cargalineastarifaventatipotarifacodigotarifaarticulo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_tipotarifasel,_codigotarifasel,_articulosel));
this.state = 66;
return;
case 66:
//C
this.state = 37;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45088852;
 //BA.debugLineNum = 45088852;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=45088853;
 //BA.debugLineNum = 45088853;BA.debugLine="Select Case Accion";
if (true) break;

case 37:
//select
this.state = 44;
switch (BA.switchObjectToInt(_accion,"NOK","SinDatos","OK")) {
case 0: {
this.state = 39;
if (true) break;
}
case 1: {
this.state = 41;
if (true) break;
}
case 2: {
this.state = 43;
if (true) break;
}
}
if (true) break;

case 39:
//C
this.state = 44;
RDebugUtils.currentLine=45088855;
 //BA.debugLineNum = 45088855;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=45088856;
 //BA.debugLineNum = 45088856;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 41:
//C
this.state = 44;
 if (true) break;

case 43:
//C
this.state = 44;
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=45088864;
 //BA.debugLineNum = 45088864;BA.debugLine="Dim rsData As ResultSet=mSQL.ExecQuery(\"select *";
_rsdata = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdata = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblAnalisisTarifasLineasTarifasTipoTarifaCodigoTarifaArticulo");
RDebugUtils.currentLine=45088866;
 //BA.debugLineNum = 45088866;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdata.getObject()));
RDebugUtils.currentLine=45088867;
 //BA.debugLineNum = 45088867;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _rsub);
this.state = 67;
return;
case 67:
//C
this.state = 45;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=45088868;
 //BA.debugLineNum = 45088868;BA.debugLine="rsData.Close";
_rsdata.Close();
RDebugUtils.currentLine=45088869;
 //BA.debugLineNum = 45088869;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=45088870;
 //BA.debugLineNum = 45088870;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 45:
//if
this.state = 65;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=45088871;
 //BA.debugLineNum = 45088871;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 48:
//if
this.state = 55;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=45088872;
 //BA.debugLineNum = 45088872;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=45088873;
 //BA.debugLineNum = 45088873;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _msa);
this.state = 68;
return;
case 68:
//C
this.state = 51;
;
RDebugUtils.currentLine=45088875;
 //BA.debugLineNum = 45088875;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=45088876;
 //BA.debugLineNum = 45088876;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _msa);
this.state = 69;
return;
case 69:
//C
this.state = 51;
_rint = (int) result[1];
;
RDebugUtils.currentLine=45088877;
 //BA.debugLineNum = 45088877;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 51:
//if
this.state = 54;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=45088878;
 //BA.debugLineNum = 45088878;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarif";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=45088879;
 //BA.debugLineNum = 45088879;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=45088882;
 //BA.debugLineNum = 45088882;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=45088884;
 //BA.debugLineNum = 45088884;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 55:
//if
this.state = 64;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=45088885;
 //BA.debugLineNum = 45088885;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 58:
//if
this.state = 63;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=45088886;
 //BA.debugLineNum = 45088886;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=45088887;
 //BA.debugLineNum = 45088887;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "datoslineastarifasavisostipotarifacodigotarifaarticulo"), _msa);
this.state = 70;
return;
case 70:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = -1;
;
RDebugUtils.currentLine=45088892;
 //BA.debugLineNum = 45088892;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=45088894;
 //BA.debugLineNum = 45088894;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.canalisistarifasavisostarifaventa __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.Form  _getform(b4j.docU.canalisistarifasavisostarifaventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "getform", false))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getform", null));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Sub getForm As Form";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="Return mFrmParent";
if (true) return __ref._mfrmparent /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.docU.canalisistarifasavisostarifaventa __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisistarifasavisostarifaventa parent,b4j.docU.canalisistarifasavisostarifaventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifaventa __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="Background= xui.CreatePanel(\"Background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Background");
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="Background.Tag = \"AnalisisTarifasAvisosTarifaVent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("AnalisisTarifasAvisosTarifaVenta_background"));
RDebugUtils.currentLine=44761093;
 //BA.debugLineNum = 44761093;BA.debugLine="Background.Color=xui.Color_Transparent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=44761094;
 //BA.debugLineNum = 44761094;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=44761096;
 //BA.debugLineNum = 44761096;BA.debugLine="Base=xui.CreatePanel(\"pnlBase\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlBase");
RDebugUtils.currentLine=44761097;
 //BA.debugLineNum = 44761097;BA.debugLine="Base.SetLayoutAnimated(0,0,0,Background.Width, Ba";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=44761098;
 //BA.debugLineNum = 44761098;BA.debugLine="Base.LoadLayout(\"scrAnalisisTarifasInfoTarifasVen";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrAnalisisTarifasInfoTarifasVentaValidasTipoTarifaCodigoTarifaArticulo",ba);
RDebugUtils.currentLine=44761099;
 //BA.debugLineNum = 44761099;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=44761100;
 //BA.debugLineNum = 44761100;BA.debugLine="Background.AddView(Base,Background.Width/2-Base.W";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=44761102;
 //BA.debugLineNum = 44761102;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=44761103;
 //BA.debugLineNum = 44761103;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=44761105;
 //BA.debugLineNum = 44761105;BA.debugLine="txtTipoTarifaAvisos.Alignment=\"CENTER\"";
__ref._txttipotarifaavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER");
RDebugUtils.currentLine=44761106;
 //BA.debugLineNum = 44761106;BA.debugLine="txtCodigoTarifaAvisos.Alignment=\"CENTER\"";
__ref._txtcodigotarifaavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER");
RDebugUtils.currentLine=44761107;
 //BA.debugLineNum = 44761107;BA.debugLine="txtArticuloAvisos.Alignment=\"CENTER\"";
__ref._txtarticuloavisos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER");
RDebugUtils.currentLine=44761108;
 //BA.debugLineNum = 44761108;BA.debugLine="txtNumPrecios.Alignment=\"CENTER_RIGHT\"";
__ref._txtnumprecios /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=44761109;
 //BA.debugLineNum = 44761109;BA.debugLine="txtNumPreciosArtTalla.Alignment=\"CENTER_RIGHT\"";
__ref._txtnumpreciosarttalla /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=44761110;
 //BA.debugLineNum = 44761110;BA.debugLine="txtNumPreciosDivisa.Alignment=\"CENTER_RIGHT\"";
__ref._txtnumpreciosdivisa /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=44761111;
 //BA.debugLineNum = 44761111;BA.debugLine="txtNumMinQty.Alignment=\"CENTER_RIGHT\"";
__ref._txtnumminqty /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=44761112;
 //BA.debugLineNum = 44761112;BA.debugLine="txtNumPreciosUMDifUMVta.Alignment=\"CENTER_RIGHT\"";
__ref._txtnumpreciosumdifumvta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=44761121;
 //BA.debugLineNum = 44761121;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._menubartabla /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=44761122;
 //BA.debugLineNum = 44761122;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=44761123;
 //BA.debugLineNum = 44761123;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=44761126;
 //BA.debugLineNum = 44761126;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisTarifasListaTarifasTipoTarifaCodigoTarifaArticulo.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=44761127;
 //BA.debugLineNum = 44761127;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44761128;
 //BA.debugLineNum = 44761128;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("844761128",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=44761129;
 //BA.debugLineNum = 44761129;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=44761130;
 //BA.debugLineNum = 44761130;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=44761131;
 //BA.debugLineNum = 44761131;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
RDebugUtils.currentLine=44761132;
 //BA.debugLineNum = 44761132;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=44761133;
 //BA.debugLineNum = 44761133;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=44761136;
 //BA.debugLineNum = 44761136;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=44761138;
 //BA.debugLineNum = 44761138;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=44761139;
 //BA.debugLineNum = 44761139;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=44761140;
 //BA.debugLineNum = 44761140;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewLineasTar";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=44761141;
 //BA.debugLineNum = 44761141;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"FechaInicial","FechaFinal"}));
RDebugUtils.currentLine=44761143;
 //BA.debugLineNum = 44761143;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=44761144;
 //BA.debugLineNum = 44761144;BA.debugLine="jamTableViewLineasTarifasVentaValidasTipoTarifaCo";
__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Añadir Precio de Línea a Lista Precios Venta Usuario","AddPrecioLineaAListaPreciosVentaUsuario",BA.ObjectToString(parent.__c.Chr(((int)0xf071))));
RDebugUtils.currentLine=44761146;
 //BA.debugLineNum = 44761146;BA.debugLine="Dialog.Initialize(Base)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=44761147;
 //BA.debugLineNum = 44761147;BA.debugLine="jamLoadingIndicator1.Initialize(Me,Base)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=44761151;
 //BA.debugLineNum = 44761151;BA.debugLine="DatosLineasTarifasAvisosTipoTarifaCodigoTarifaArt";
__ref._datoslineastarifasavisostipotarifacodigotarifaarticulo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtipotarifa /*int*/ ,__ref._mcodigotarifa /*String*/ ,__ref._marticulo /*String*/ ,__ref._mdescripcionarticulo /*String*/ );
RDebugUtils.currentLine=44761153;
 //BA.debugLineNum = 44761153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action(b4j.docU.canalisistarifasavisostarifaventa __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";
if (Debug.shouldDelegate(ba, "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewLineasTarifasVentaValidasTipoTarifaCodigoTarifaArticulo_ContextMenuItem_Action(b4j.docU.canalisistarifasavisostarifaventa parent,b4j.docU.canalisistarifasavisostarifaventa __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifaventa __ref;
b4j.docU.canalisistarifasavisostarifaventa parent;
String _tagmenuitem;
int _filasel = 0;
double _precioventausuario = 0;
String _divisa = "";
String _sdivisa = "";
int _rint = 0;
b4j.docU.main._dbcommand _cmd = null;
boolean _rbool = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifaventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 16;
switch (BA.switchObjectToInt(_tagmenuitem,"AddPrecioLineaAListaPreciosVentaUsuario")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=45285382;
 //BA.debugLineNum = 45285382;BA.debugLine="Dim FilaSel As Int=jamTableViewLineasTarifasVen";
_filasel = __ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=45285383;
 //BA.debugLineNum = 45285383;BA.debugLine="Dim PrecioVentaUsuario As Double=jamTableViewLi";
_precioventausuario = (double)(BA.ObjectToNumber(__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"PrecioUnitario")));
RDebugUtils.currentLine=45285384;
 //BA.debugLineNum = 45285384;BA.debugLine="Dim Divisa As String=jamTableViewLineasTarifasV";
_divisa = BA.ObjectToString(__ref._jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Moneda"));
RDebugUtils.currentLine=45285385;
 //BA.debugLineNum = 45285385;BA.debugLine="Dim sDivisa As String=IIf(Divisa=\"\",\"EUR\",Divis";
_sdivisa = BA.ObjectToString((((_divisa).equals("")) ? ((Object)("EUR")) : ((Object)(_divisa))));
RDebugUtils.currentLine=45285387;
 //BA.debugLineNum = 45285387;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\", _ $\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("¿Grabar el precio de la línea "+parent.__c.SmartStringFormatter("1.2",(Object)(_precioventausuario))+" ("+parent.__c.SmartStringFormatter("",(Object)(_sdivisa))+") como precio venta usuario?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 17;
return;
case 17:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=45285389;
 //BA.debugLineNum = 45285389;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
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
RDebugUtils.currentLine=45285392;
 //BA.debugLineNum = 45285392;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"A";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("AnalisisTarifasNuevoEditarPrecioUsuarioVentas",new Object[]{(Object)(__ref._midanalisistarifasventa /*int*/ ),(Object)(__ref._mtipotarifa /*int*/ ),(Object)(__ref._mcodigotarifa /*String*/ ),(Object)(__ref._marticulo /*String*/ ),(Object)(_precioventausuario),(Object)(_divisa),(Object)(parent.__c.DateTime.getNow()),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ ),(Object)(_precioventausuario),(Object)(_divisa),(Object)(parent.__c.DateTime.getNow()),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ )});
RDebugUtils.currentLine=45285395;
 //BA.debugLineNum = 45285395;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNa";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=45285396;
 //BA.debugLineNum = 45285396;BA.debugLine="If rBool=False Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_rbool==parent.__c.False) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=45285397;
 //BA.debugLineNum = 45285397;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible crear el nuevo precio de venta usuario indicado.","Error");
RDebugUtils.currentLine=45285398;
 //BA.debugLineNum = 45285398;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 15;
;
RDebugUtils.currentLine=45285399;
 //BA.debugLineNum = 45285399;BA.debugLine="DatosEditados=False";
__ref._datoseditados /*boolean*/  = parent.__c.False;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=45285401;
 //BA.debugLineNum = 45285401;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Precio de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Precio de venta usuario grabado ("+parent.__c.SmartStringFormatter("1.2",(Object)(_precioventausuario))+")"),"Error");
RDebugUtils.currentLine=45285402;
 //BA.debugLineNum = 45285402;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifaventa", "jamtableviewlineastarifasventavalidastipotarifacodigotarifaarticulo_contextmenuitem_action"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 15;
;
RDebugUtils.currentLine=45285403;
 //BA.debugLineNum = 45285403;BA.debugLine="DatosEditados=True";
__ref._datoseditados /*boolean*/  = parent.__c.True;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=45285406;
 //BA.debugLineNum = 45285406;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}