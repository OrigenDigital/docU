package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisistarifasavisostarifacompra extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisistarifasavisostarifacompra", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisistarifasavisostarifacompra.class).invoke(this, new Object[] {null});
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
public int _midanalisistarifasventa = 0;
public String _marticulo = "";
public String _mdescripcionarticulo = "";
public boolean _datoseditados = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalirinfoavisostarifascompravalidasarticulo = null;
public b4j.docU.jamtableview _jamtableviewlineastarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfoavisostarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnumpreciosdivisatarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlearticulotarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitledescripcionarticulotarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumminqtytarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumpreciosarttallatarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumpreciostarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlenumpreciosumdifumcompra = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondodatosavisostarifascompravalidasarticulo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnljamtableviewanalisistarifaslineastarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtarticuloavisostarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescripcionarticuloavisostarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumminqtytarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciosarttallatarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciosdivisatarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciostarifascompravalidasarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumpreciosumdifumcompra = null;
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
public String  _initialize(b4j.docU.canalisistarifasavisostarifacompra __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4j.objects.Form _frmparent,anywheresoftware.b4j.objects.SQL _sqlanalisis,int _idanalisisventa,String _articulo,String _descripcionarticulo) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_frmparent,_sqlanalisis,_idanalisisventa,_articulo,_descripcionarticulo}));}
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=43646986;
 //BA.debugLineNum = 43646986;BA.debugLine="mSQL=SQLAnalisis";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/  = _sqlanalisis;
RDebugUtils.currentLine=43646988;
 //BA.debugLineNum = 43646988;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=43646989;
 //BA.debugLineNum = 43646989;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=43646991;
 //BA.debugLineNum = 43646991;BA.debugLine="mFrmParent=frmParent";
__ref._mfrmparent /*anywheresoftware.b4j.objects.Form*/  = _frmparent;
RDebugUtils.currentLine=43646993;
 //BA.debugLineNum = 43646993;BA.debugLine="mIDAnalisisTarifasVenta=IDAnalisisVenta";
__ref._midanalisistarifasventa /*int*/  = _idanalisisventa;
RDebugUtils.currentLine=43646996;
 //BA.debugLineNum = 43646996;BA.debugLine="mArticulo=Articulo";
__ref._marticulo /*String*/  = _articulo;
RDebugUtils.currentLine=43646997;
 //BA.debugLineNum = 43646997;BA.debugLine="mDescripcionArticulo=DescripcionArticulo";
__ref._mdescripcionarticulo /*String*/  = _descripcionarticulo;
RDebugUtils.currentLine=43646999;
 //BA.debugLineNum = 43646999;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=43647000;
 //BA.debugLineNum = 43647000;BA.debugLine="End Sub";
return "";
}
public void  _addeditarcostearticulousuariovalor(b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulo,double _valor) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "addeditarcostearticulousuariovalor", false))
	 {Debug.delegate(ba, "addeditarcostearticulousuariovalor", new Object[] {_articulo,_valor}); return;}
ResumableSub_AddEditarCosteArticuloUsuarioValor rsub = new ResumableSub_AddEditarCosteArticuloUsuarioValor(this,__ref,_articulo,_valor);
rsub.resume(ba, null);
}
public static class ResumableSub_AddEditarCosteArticuloUsuarioValor extends BA.ResumableSub {
public ResumableSub_AddEditarCosteArticuloUsuarioValor(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulo,double _valor) {
this.parent = parent;
this.__ref = __ref;
this._articulo = _articulo;
this._valor = _valor;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
String _articulo;
double _valor;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
boolean _existecostearticulousuario = false;
String _smsg = "";
int _rint = 0;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mp = null;
double _costearticulousu = 0;
b4j.docU.main._dbcommand _cmd = null;
boolean _rbool = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="DatosEditados=False";
__ref._datoseditados /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos coste artículo usuario para artículo "+_articulo+"..."));
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=44367876;
 //BA.debugLineNum = 44367876;BA.debugLine="Wait For (CosteArticuloUsuario(Articulo)) complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), __ref._costearticulousuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_articulo));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44367877;
 //BA.debugLineNum = 44367877;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44367878;
 //BA.debugLineNum = 44367878;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=44367879;
 //BA.debugLineNum = 44367879;BA.debugLine="If Accion=\"NOK\" Then Return";
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
RDebugUtils.currentLine=44367885;
 //BA.debugLineNum = 44367885;BA.debugLine="Dim ExisteCosteArticuloUsuario As Boolean";
_existecostearticulousuario = false;
RDebugUtils.currentLine=44367886;
 //BA.debugLineNum = 44367886;BA.debugLine="If Accion=\"SinCosteArticuloUsuario\" Then";
if (true) break;

case 7:
//if
this.state = 24;
if ((_accion).equals("SinCosteArticuloUsuario")) { 
this.state = 9;
}else {
this.state = 17;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=44367887;
 //BA.debugLineNum = 44367887;BA.debugLine="Dim sMsg As String=$\"No existe coste artículo us";
_smsg = ("No existe coste artículo usuario para el artículo seleccionado.\n"+"¿Grabar uno nuevo="+parent.__c.SmartStringFormatter("1.2",(Object)(_valor))+"?");
RDebugUtils.currentLine=44367889;
 //BA.debugLineNum = 44367889;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",sMsg,\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",_smsg,"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 36;
return;
case 36:
//C
this.state = 10;
_rint = (int) result[1];
;
RDebugUtils.currentLine=44367890;
 //BA.debugLineNum = 44367890;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 24;
;
RDebugUtils.currentLine=44367896;
 //BA.debugLineNum = 44367896;BA.debugLine="ExisteCosteArticuloUsuario=False";
_existecostearticulousuario = parent.__c.False;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=44367899;
 //BA.debugLineNum = 44367899;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=44367900;
 //BA.debugLineNum = 44367900;BA.debugLine="Dim mP As Map=lstReg.Get(0)";
_mp = new anywheresoftware.b4a.objects.collections.Map();
_mp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=44367901;
 //BA.debugLineNum = 44367901;BA.debugLine="Dim CosteArticuloUsu As Double=mP.Get(\"CosteUnit";
_costearticulousu = (double)(BA.ObjectToNumber(_mp.Get((Object)("CosteUnitarioUsuario"))));
RDebugUtils.currentLine=44367902;
 //BA.debugLineNum = 44367902;BA.debugLine="ExisteCosteArticuloUsuario=True";
_existecostearticulousuario = parent.__c.True;
RDebugUtils.currentLine=44367903;
 //BA.debugLineNum = 44367903;BA.debugLine="Dim sMsg As String=$\"Ya existe coste artículo us";
_smsg = ("Ya existe coste artículo usuario para el artículo seleccionado ( "+parent.__c.SmartStringFormatter("1.2",(Object)(_costearticulousu))+" ).\n"+"¿Cambiarlo por el valor "+parent.__c.SmartStringFormatter("1.2",(Object)(_valor))+"?");
RDebugUtils.currentLine=44367905;
 //BA.debugLineNum = 44367905;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",sMsg,\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",_smsg,"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 37;
return;
case 37:
//C
this.state = 18;
_rint = (int) result[1];
;
RDebugUtils.currentLine=44367906;
 //BA.debugLineNum = 44367906;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 18:
//if
this.state = 23;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
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
RDebugUtils.currentLine=44367914;
 //BA.debugLineNum = 44367914;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando coste artículo usuario para artículo "+_articulo+"..."));
RDebugUtils.currentLine=44367915;
 //BA.debugLineNum = 44367915;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=44367916;
 //BA.debugLineNum = 44367916;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Ana";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("AnalisisTarifasNuevoEditarCosteArticuloUsuario",new Object[]{(Object)(__ref._midanalisistarifasventa /*int*/ ),(Object)(_articulo),(Object)(_valor),(Object)(parent.__c.DateTime.getNow()),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ ),(Object)(_valor),(Object)(parent.__c.DateTime.getNow()),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ )});
RDebugUtils.currentLine=44367919;
 //BA.debugLineNum = 44367919;BA.debugLine="Wait For (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 38;
return;
case 38:
//C
this.state = 25;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=44367920;
 //BA.debugLineNum = 44367920;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44367921;
 //BA.debugLineNum = 44367921;BA.debugLine="If rBool=False Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_rbool==parent.__c.False) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=44367922;
 //BA.debugLineNum = 44367922;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible grabar el nuevo coste artículo usuario indicado.","Error");
RDebugUtils.currentLine=44367923;
 //BA.debugLineNum = 44367923;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 28;
;
RDebugUtils.currentLine=44367924;
 //BA.debugLineNum = 44367924;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=44367940;
 //BA.debugLineNum = 44367940;BA.debugLine="DatosEditados=True";
__ref._datoseditados /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=44367942;
 //BA.debugLineNum = 44367942;BA.debugLine="Dim sMsg As String";
_smsg = "";
RDebugUtils.currentLine=44367943;
 //BA.debugLineNum = 44367943;BA.debugLine="If ExisteCosteArticuloUsuario=False Then";
if (true) break;

case 29:
//if
this.state = 34;
if (_existecostearticulousuario==parent.__c.False) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
RDebugUtils.currentLine=44367944;
 //BA.debugLineNum = 44367944;BA.debugLine="sMsg=$\"Se ha grabado el nuevo coste artículo usu";
_smsg = ("Se ha grabado el nuevo coste artículo usuario.\n"+"Para ver el efecto del cambio, actualiza la tabla.");
RDebugUtils.currentLine=44367946;
 //BA.debugLineNum = 44367946;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sMsg ,\"Aviso\")";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_smsg,"Aviso");
RDebugUtils.currentLine=44367947;
 //BA.debugLineNum = 44367947;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=44367949;
 //BA.debugLineNum = 44367949;BA.debugLine="sMsg=$\"Se ha actualizado el valor del coste artí";
_smsg = ("Se ha actualizado el valor del coste artículo usuario.\n"+"Para ver el efecto del cambio, actualiza la tabla.");
RDebugUtils.currentLine=44367951;
 //BA.debugLineNum = 44367951;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sMsg,\"Aviso\")";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_smsg,"Aviso");
RDebugUtils.currentLine=44367952;
 //BA.debugLineNum = 44367952;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "addeditarcostearticulousuariovalor"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=44367955;
 //BA.debugLineNum = 44367955;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _costearticulousuario(b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulo) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "costearticulousuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "costearticulousuario", new Object[] {_articulo}));}
ResumableSub_CosteArticuloUsuario rsub = new ResumableSub_CosteArticuloUsuario(this,__ref,_articulo);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CosteArticuloUsuario extends BA.ResumableSub {
public ResumableSub_CosteArticuloUsuario(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulo) {
this.parent = parent;
this.__ref = __ref;
this._articulo = _articulo;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
String _articulo;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=44433412;
 //BA.debugLineNum = 44433412;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44433413;
 //BA.debugLineNum = 44433413;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=44433414;
 //BA.debugLineNum = 44433414;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=44433415;
 //BA.debugLineNum = 44433415;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=44433416;
 //BA.debugLineNum = 44433416;BA.debugLine="Dim Comando As String=\"AnalisisTarifasCosteArticu";
_comando = "AnalisisTarifasCosteArticuloUsuario";
RDebugUtils.currentLine=44433417;
 //BA.debugLineNum = 44433417;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(__ref._midanalisistarifasventa /*int*/ ),(Object)(_articulo)},parent);
RDebugUtils.currentLine=44433418;
 //BA.debugLineNum = 44433418;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "costearticulousuario"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44433419;
 //BA.debugLineNum = 44433419;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=44433420;
 //BA.debugLineNum = 44433420;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44433421;
 //BA.debugLineNum = 44433421;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=44433422;
 //BA.debugLineNum = 44433422;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "costearticulousuario"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=44433423;
 //BA.debugLineNum = 44433423;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=44433424;
 //BA.debugLineNum = 44433424;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=44433427;
 //BA.debugLineNum = 44433427;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=44433430;
 //BA.debugLineNum = 44433430;BA.debugLine="Accion=\"SinCosteArticuloUsuario\"";
_accion = "SinCosteArticuloUsuario";
RDebugUtils.currentLine=44433431;
 //BA.debugLineNum = 44433431;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=44433433;
 //BA.debugLineNum = 44433433;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=44433434;
 //BA.debugLineNum = 44433434;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=44433435;
 //BA.debugLineNum = 44433435;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=44433436;
 //BA.debugLineNum = 44433436;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=44433439;
 //BA.debugLineNum = 44433439;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=44433440;
 //BA.debugLineNum = 44433440;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.canalisistarifasavisostarifacompra __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="If jamTableViewLineasTarifasCompraValidasArticulo";
if (__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.G";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
 };
RDebugUtils.currentLine=44040198;
 //BA.debugLineNum = 44040198;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=44040200;
 //BA.debugLineNum = 44040200;BA.debugLine="CallSubDelayed2(mCallBack,\"cAnalisisTarifasAvisos";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"cAnalisisTarifasAvisosTarifaCompra_Done",(Object)(__ref._datoseditados /*boolean*/ ));
RDebugUtils.currentLine=44040201;
 //BA.debugLineNum = 44040201;BA.debugLine="End Sub";
return "";
}
public String  _btnsalirinfoavisostarifascompravalidasarticulo_click(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "btnsalirinfoavisostarifascompravalidasarticulo_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalirinfoavisostarifascompravalidasarticulo_click", null));}
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Private Sub btnSalirInfoAvisosTarifasCompraValidas";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalineastarifacompraarticulo(b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulosel) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "cargalineastarifacompraarticulo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalineastarifacompraarticulo", new Object[] {_articulosel}));}
ResumableSub_CargaLineasTarifaCompraArticulo rsub = new ResumableSub_CargaLineasTarifaCompraArticulo(this,__ref,_articulosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaLineasTarifaCompraArticulo extends BA.ResumableSub {
public ResumableSub_CargaLineasTarifaCompraArticulo(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulosel) {
this.parent = parent;
this.__ref = __ref;
this._articulosel = _articulosel;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
String _articulosel;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAnalisisTarifas";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblAnalisisTarifasLineasTarifasCompraArticulo");
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=44171268;
 //BA.debugLineNum = 44171268;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44171269;
 //BA.debugLineNum = 44171269;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=44171270;
 //BA.debugLineNum = 44171270;BA.debugLine="Dim Comando As String=\"TarifasCompraValidasActual";
_comando = "TarifasCompraValidasActualesYFuturasUltimaFechaInicialArticulo";
RDebugUtils.currentLine=44171271;
 //BA.debugLineNum = 44171271;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_articulosel)},parent);
RDebugUtils.currentLine=44171273;
 //BA.debugLineNum = 44171273;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "cargalineastarifacompraarticulo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44171275;
 //BA.debugLineNum = 44171275;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=44171276;
 //BA.debugLineNum = 44171276;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44171277;
 //BA.debugLineNum = 44171277;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=44171278;
 //BA.debugLineNum = 44171278;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "cargalineastarifacompraarticulo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=44171279;
 //BA.debugLineNum = 44171279;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=44171280;
 //BA.debugLineNum = 44171280;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=44171283;
 //BA.debugLineNum = 44171283;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=44171284;
 //BA.debugLineNum = 44171284;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44171285;
 //BA.debugLineNum = 44171285;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"NO hay línea";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"NO hay líneas de tarifas de compra válidas para los datos seleccionados (Artículo: "+_articulosel+".","Aviso");
RDebugUtils.currentLine=44171286;
 //BA.debugLineNum = 44171286;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "cargalineastarifacompraarticulo"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=44171287;
 //BA.debugLineNum = 44171287;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=44171288;
 //BA.debugLineNum = 44171288;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=44171290;
 //BA.debugLineNum = 44171290;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=44171293;
 //BA.debugLineNum = 44171293;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=44171294;
 //BA.debugLineNum = 44171294;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=44171296;
 //BA.debugLineNum = 44171296;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAnalisisTarifasLineasTarifasCompraArticulo",_lstreg);
RDebugUtils.currentLine=44171297;
 //BA.debugLineNum = 44171297;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisTarifasLi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisTarifasLineasTarifasCompraArticulo set IDAnalisisTarifas=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._midanalisistarifasventa /*int*/ )}));
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
RDebugUtils.currentLine=44171300;
 //BA.debugLineNum = 44171300;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=44171301;
 //BA.debugLineNum = 44171301;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=43581446;
 //BA.debugLineNum = 43581446;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=43581447;
 //BA.debugLineNum = 43581447;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581448;
 //BA.debugLineNum = 43581448;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581449;
 //BA.debugLineNum = 43581449;BA.debugLine="Dim Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581451;
 //BA.debugLineNum = 43581451;BA.debugLine="Dim mFrmParent As Form  '  necesario para el jamT";
_mfrmparent = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=43581454;
 //BA.debugLineNum = 43581454;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=43581456;
 //BA.debugLineNum = 43581456;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=43581457;
 //BA.debugLineNum = 43581457;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=43581458;
 //BA.debugLineNum = 43581458;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=43581462;
 //BA.debugLineNum = 43581462;BA.debugLine="Dim mIDAnalisisTarifasVenta As Int";
_midanalisistarifasventa = 0;
RDebugUtils.currentLine=43581465;
 //BA.debugLineNum = 43581465;BA.debugLine="Dim mArticulo As String";
_marticulo = "";
RDebugUtils.currentLine=43581466;
 //BA.debugLineNum = 43581466;BA.debugLine="Dim mDescripcionArticulo As String";
_mdescripcionarticulo = "";
RDebugUtils.currentLine=43581469;
 //BA.debugLineNum = 43581469;BA.debugLine="Dim DatosEditados As Boolean";
_datoseditados = false;
RDebugUtils.currentLine=43581473;
 //BA.debugLineNum = 43581473;BA.debugLine="Private btnSalirInfoAvisosTarifasCompraValidasArt";
_btnsalirinfoavisostarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581474;
 //BA.debugLineNum = 43581474;BA.debugLine="Private jamTableViewLineasTarifasCompraValidasArt";
_jamtableviewlineastarifascompravalidasarticulo = new b4j.docU.jamtableview();
RDebugUtils.currentLine=43581475;
 //BA.debugLineNum = 43581475;BA.debugLine="Private lblInfoAvisosTarifasCompraValidasArticulo";
_lblinfoavisostarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581476;
 //BA.debugLineNum = 43581476;BA.debugLine="Private lblNumPreciosDivisaTarifasCompraValidasAr";
_lblnumpreciosdivisatarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581477;
 //BA.debugLineNum = 43581477;BA.debugLine="Private lblTitleArticuloTarifasCompraValidasArtic";
_lbltitlearticulotarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581478;
 //BA.debugLineNum = 43581478;BA.debugLine="Private lblTitleDescripcionArticuloTarifasCompraV";
_lbltitledescripcionarticulotarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581479;
 //BA.debugLineNum = 43581479;BA.debugLine="Private lblTitleNumMinQtyTarifasCompraValidasArti";
_lbltitlenumminqtytarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581480;
 //BA.debugLineNum = 43581480;BA.debugLine="Private lblTitleNumPreciosArtTallaTarifasCompraVa";
_lbltitlenumpreciosarttallatarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581481;
 //BA.debugLineNum = 43581481;BA.debugLine="Private lblTitleNumPreciosTarifasCompraValidasArt";
_lbltitlenumpreciostarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581482;
 //BA.debugLineNum = 43581482;BA.debugLine="Private lblTitleNumPreciosUMDifUMCompra As B4XVie";
_lbltitlenumpreciosumdifumcompra = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581483;
 //BA.debugLineNum = 43581483;BA.debugLine="Private pnlFondoDatosAvisosTarifasCompraValidasAr";
_pnlfondodatosavisostarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581484;
 //BA.debugLineNum = 43581484;BA.debugLine="Private pnljamTableViewAnalisisTarifasLineasTarif";
_pnljamtableviewanalisistarifaslineastarifascompravalidasarticulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43581485;
 //BA.debugLineNum = 43581485;BA.debugLine="Private txtArticuloAvisosTarifasCompraValidasArti";
_txtarticuloavisostarifascompravalidasarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581486;
 //BA.debugLineNum = 43581486;BA.debugLine="Private txtDescripcionArticuloAvisosTarifasCompra";
_txtdescripcionarticuloavisostarifascompravalidasarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581487;
 //BA.debugLineNum = 43581487;BA.debugLine="Private txtNumMinQtyTarifasCompraValidasArticulo";
_txtnumminqtytarifascompravalidasarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581488;
 //BA.debugLineNum = 43581488;BA.debugLine="Private txtNumPreciosArtTallaTarifasCompraValidas";
_txtnumpreciosarttallatarifascompravalidasarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581489;
 //BA.debugLineNum = 43581489;BA.debugLine="Private txtNumPreciosDivisaTarifasCompraValidasAr";
_txtnumpreciosdivisatarifascompravalidasarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581490;
 //BA.debugLineNum = 43581490;BA.debugLine="Private txtNumPreciosTarifasCompraValidasArticulo";
_txtnumpreciostarifascompravalidasarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581491;
 //BA.debugLineNum = 43581491;BA.debugLine="Private txtNumPreciosUMDifUMCompra As TextField";
_txtnumpreciosumdifumcompra = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=43581492;
 //BA.debugLineNum = 43581492;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _datoslineastarifascompraavisosarticulo(b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulosel,String _descripcionarticulosel) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "datoslineastarifascompraavisosarticulo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "datoslineastarifascompraavisosarticulo", new Object[] {_articulosel,_descripcionarticulosel}));}
ResumableSub_DatosLineasTarifasCompraAvisosArticulo rsub = new ResumableSub_DatosLineasTarifasCompraAvisosArticulo(this,__ref,_articulosel,_descripcionarticulosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DatosLineasTarifasCompraAvisosArticulo extends BA.ResumableSub {
public ResumableSub_DatosLineasTarifasCompraAvisosArticulo(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref,String _articulosel,String _descripcionarticulosel) {
this.parent = parent;
this.__ref = __ref;
this._articulosel = _articulosel;
this._descripcionarticulosel = _descripcionarticulosel;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
String _articulosel;
String _descripcionarticulosel;
int _numpreciosart = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _tf = null;
int _numpreciosarttalla = 0;
int _numminqty = 0;
int _numpreciosdivisa = 0;
int _numpreciosumdifumcompra = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44105731;
 //BA.debugLineNum = 44105731;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos tarifas..."));
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="txtArticuloAvisosTarifasCompraValidasArticulo.Tex";
__ref._txtarticuloavisostarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_articulosel);
RDebugUtils.currentLine=44105736;
 //BA.debugLineNum = 44105736;BA.debugLine="txtDescripcionArticuloAvisosTarifasCompraValidasA";
__ref._txtdescripcionarticuloavisostarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_descripcionarticulosel);
RDebugUtils.currentLine=44105739;
 //BA.debugLineNum = 44105739;BA.debugLine="Dim NumPreciosArt As Int=Utilidades.FixNullInt(mS";
_numpreciosart = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosArt from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_articulosel}))));
RDebugUtils.currentLine=44105741;
 //BA.debugLineNum = 44105741;BA.debugLine="txtNumPreciosTarifasCompraValidasArticulo.Text=Nu";
__ref._txtnumpreciostarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosart));
RDebugUtils.currentLine=44105742;
 //BA.debugLineNum = 44105742;BA.debugLine="Dim tF As B4XView=txtNumPreciosTarifasCompraValid";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciostarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=44105743;
 //BA.debugLineNum = 44105743;BA.debugLine="If NumPreciosArt>1 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_numpreciosart>1) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=44105744;
 //BA.debugLineNum = 44105744;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=44105745;
 //BA.debugLineNum = 44105745;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=44105747;
 //BA.debugLineNum = 44105747;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=44105748;
 //BA.debugLineNum = 44105748;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=44105751;
 //BA.debugLineNum = 44105751;BA.debugLine="Dim NumPreciosArtTalla As Int=Utilidades.FixNullI";
_numpreciosarttalla = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosArtTalla from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_articulosel}))));
RDebugUtils.currentLine=44105753;
 //BA.debugLineNum = 44105753;BA.debugLine="txtNumPreciosArtTallaTarifasCompraValidasArticulo";
__ref._txtnumpreciosarttallatarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosarttalla));
RDebugUtils.currentLine=44105754;
 //BA.debugLineNum = 44105754;BA.debugLine="Dim tF As B4XView=txtNumPreciosArtTallaTarifasCom";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciosarttallatarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=44105755;
 //BA.debugLineNum = 44105755;BA.debugLine="If NumPreciosArtTalla>0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_numpreciosarttalla>0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=44105756;
 //BA.debugLineNum = 44105756;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=44105757;
 //BA.debugLineNum = 44105757;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=44105759;
 //BA.debugLineNum = 44105759;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=44105760;
 //BA.debugLineNum = 44105760;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=44105763;
 //BA.debugLineNum = 44105763;BA.debugLine="Dim NumMinQty As Int=Utilidades.FixNullInt(mSQL.E";
_numminqty = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosQtyMin from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_articulosel}))));
RDebugUtils.currentLine=44105765;
 //BA.debugLineNum = 44105765;BA.debugLine="txtNumMinQtyTarifasCompraValidasArticulo.text=Num";
__ref._txtnumminqtytarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numminqty));
RDebugUtils.currentLine=44105766;
 //BA.debugLineNum = 44105766;BA.debugLine="Dim tF As B4XView=txtNumMinQtyTarifasCompraValida";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumminqtytarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=44105767;
 //BA.debugLineNum = 44105767;BA.debugLine="If NumMinQty>0 Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_numminqty>0) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=44105768;
 //BA.debugLineNum = 44105768;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=44105769;
 //BA.debugLineNum = 44105769;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=44105771;
 //BA.debugLineNum = 44105771;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=44105772;
 //BA.debugLineNum = 44105772;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=44105776;
 //BA.debugLineNum = 44105776;BA.debugLine="Dim NumPreciosDivisa As Int=Utilidades.FixNullInt";
_numpreciosdivisa = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosDivisa from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_articulosel}))));
RDebugUtils.currentLine=44105778;
 //BA.debugLineNum = 44105778;BA.debugLine="txtNumPreciosDivisaTarifasCompraValidasArticulo.t";
__ref._txtnumpreciosdivisatarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosdivisa));
RDebugUtils.currentLine=44105779;
 //BA.debugLineNum = 44105779;BA.debugLine="Dim tF As B4XView=txtNumPreciosDivisaTarifasCompr";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciosdivisatarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=44105780;
 //BA.debugLineNum = 44105780;BA.debugLine="If NumPreciosDivisa>0 Then";
if (true) break;

case 19:
//if
this.state = 24;
if (_numpreciosdivisa>0) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=44105781;
 //BA.debugLineNum = 44105781;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=44105782;
 //BA.debugLineNum = 44105782;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=44105784;
 //BA.debugLineNum = 44105784;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=44105785;
 //BA.debugLineNum = 44105785;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=44105790;
 //BA.debugLineNum = 44105790;BA.debugLine="Dim NumPreciosUMDifUMCompra As Int=Utilidades.Fix";
_numpreciosumdifumcompra = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NumPreciosUMDifUMCompra from tblAnalisisTarifasVentasAvisosTarifasCompras where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_articulosel}))));
RDebugUtils.currentLine=44105792;
 //BA.debugLineNum = 44105792;BA.debugLine="txtNumPreciosUMDifUMCompra.text=NumPreciosUMDifUM";
__ref._txtnumpreciosumdifumcompra /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_numpreciosumdifumcompra));
RDebugUtils.currentLine=44105793;
 //BA.debugLineNum = 44105793;BA.debugLine="Dim tF As B4XView=txtNumPreciosUMDifUMCompra";
_tf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_tf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnumpreciosumdifumcompra /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=44105794;
 //BA.debugLineNum = 44105794;BA.debugLine="If NumPreciosUMDifUMCompra>0 Then";
if (true) break;

case 25:
//if
this.state = 30;
if (_numpreciosumdifumcompra>0) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=44105795;
 //BA.debugLineNum = 44105795;BA.debugLine="tF.Color=xui.Color_Red";
_tf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=44105796;
 //BA.debugLineNum = 44105796;BA.debugLine="tF.TextColor=xui.Color_White";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=44105798;
 //BA.debugLineNum = 44105798;BA.debugLine="tF.Color=0xFF00FA9A";
_tf.setColor(((int)0xff00fa9a));
RDebugUtils.currentLine=44105799;
 //BA.debugLineNum = 44105799;BA.debugLine="tF.TextColor=xui.Color_Black";
_tf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=44105804;
 //BA.debugLineNum = 44105804;BA.debugLine="wait for (CargaLineasTarifaCompraArticulo(Articul";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), __ref._cargalineastarifacompraarticulo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_articulosel));
this.state = 60;
return;
case 60:
//C
this.state = 31;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44105805;
 //BA.debugLineNum = 44105805;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=44105806;
 //BA.debugLineNum = 44105806;BA.debugLine="Select Case Accion";
if (true) break;

case 31:
//select
this.state = 38;
switch (BA.switchObjectToInt(_accion,"NOK","SinDatos","OK")) {
case 0: {
this.state = 33;
if (true) break;
}
case 1: {
this.state = 35;
if (true) break;
}
case 2: {
this.state = 37;
if (true) break;
}
}
if (true) break;

case 33:
//C
this.state = 38;
RDebugUtils.currentLine=44105808;
 //BA.debugLineNum = 44105808;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=44105809;
 //BA.debugLineNum = 44105809;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 35:
//C
this.state = 38;
 if (true) break;

case 37:
//C
this.state = 38;
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=44105817;
 //BA.debugLineNum = 44105817;BA.debugLine="Dim rsData As ResultSet=mSQL.ExecQuery(\"select *";
_rsdata = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdata = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblAnalisisTarifasLineasTarifasCompraArticulo");
RDebugUtils.currentLine=44105819;
 //BA.debugLineNum = 44105819;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdata.getObject()));
RDebugUtils.currentLine=44105820;
 //BA.debugLineNum = 44105820;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _rsub);
this.state = 61;
return;
case 61:
//C
this.state = 39;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44105821;
 //BA.debugLineNum = 44105821;BA.debugLine="rsData.Close";
_rsdata.Close();
RDebugUtils.currentLine=44105822;
 //BA.debugLineNum = 44105822;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44105823;
 //BA.debugLineNum = 44105823;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 39:
//if
this.state = 59;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=44105824;
 //BA.debugLineNum = 44105824;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 42:
//if
this.state = 49;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=44105825;
 //BA.debugLineNum = 44105825;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=44105826;
 //BA.debugLineNum = 44105826;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _msa);
this.state = 62;
return;
case 62:
//C
this.state = 45;
;
RDebugUtils.currentLine=44105828;
 //BA.debugLineNum = 44105828;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=44105829;
 //BA.debugLineNum = 44105829;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 45;
_rint = (int) result[1];
;
RDebugUtils.currentLine=44105830;
 //BA.debugLineNum = 44105830;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 45:
//if
this.state = 48;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=44105831;
 //BA.debugLineNum = 44105831;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=44105832;
 //BA.debugLineNum = 44105832;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=44105835;
 //BA.debugLineNum = 44105835;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=44105837;
 //BA.debugLineNum = 44105837;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 49:
//if
this.state = 58;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=44105838;
 //BA.debugLineNum = 44105838;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 52:
//if
this.state = 57;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 57:
//C
this.state = 58;
;
RDebugUtils.currentLine=44105839;
 //BA.debugLineNum = 44105839;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=44105840;
 //BA.debugLineNum = 44105840;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "datoslineastarifascompraavisosarticulo"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = -1;
;
RDebugUtils.currentLine=44105845;
 //BA.debugLineNum = 44105845;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=44105847;
 //BA.debugLineNum = 44105847;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.canalisistarifasavisostarifacompra __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.Form  _getform(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "getform", false))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getform", null));}
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Sub getForm As Form";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Return mFrmParent";
if (true) return __ref._mfrmparent /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="Background= xui.CreatePanel(\"Background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Background");
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="Background.Tag = \"AnalisisTarifasAvisosTarifaComp";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("AnalisisTarifasAvisosTarifaCompra_background"));
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="Background.Color=xui.Color_Transparent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=43778054;
 //BA.debugLineNum = 43778054;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43778056;
 //BA.debugLineNum = 43778056;BA.debugLine="Base=xui.CreatePanel(\"pnlBase\")";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlBase");
RDebugUtils.currentLine=43778057;
 //BA.debugLineNum = 43778057;BA.debugLine="Base.SetLayoutAnimated(0,0,0,Background.Width, Ba";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43778058;
 //BA.debugLineNum = 43778058;BA.debugLine="Base.LoadLayout(\"scrAnalisisTarifasVentaInfoTarif";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrAnalisisTarifasVentaInfoTarifasCompraValidasArticulo",ba);
RDebugUtils.currentLine=43778059;
 //BA.debugLineNum = 43778059;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=43778060;
 //BA.debugLineNum = 43778060;BA.debugLine="Background.AddView(Base,Background.Width/2-Base.W";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43778062;
 //BA.debugLineNum = 43778062;BA.debugLine="lblInfoAvisosTarifasCompraValidasArticulo.Text=\"A";
__ref._lblinfoavisostarifascompravalidasarticulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Avisos Tarifa / Líneas Tarifas Compra");
RDebugUtils.currentLine=43778067;
 //BA.debugLineNum = 43778067;BA.debugLine="txtArticuloAvisosTarifasCompraValidasArticulo.Ali";
__ref._txtarticuloavisostarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER");
RDebugUtils.currentLine=43778068;
 //BA.debugLineNum = 43778068;BA.debugLine="txtNumPreciosTarifasCompraValidasArticulo.Alignme";
__ref._txtnumpreciostarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=43778069;
 //BA.debugLineNum = 43778069;BA.debugLine="txtNumPreciosArtTallaTarifasCompraValidasArticulo";
__ref._txtnumpreciosarttallatarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=43778070;
 //BA.debugLineNum = 43778070;BA.debugLine="txtNumPreciosDivisaTarifasCompraValidasArticulo.A";
__ref._txtnumpreciosdivisatarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=43778071;
 //BA.debugLineNum = 43778071;BA.debugLine="txtNumMinQtyTarifasCompraValidasArticulo.Alignmen";
__ref._txtnumminqtytarifascompravalidasarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=43778072;
 //BA.debugLineNum = 43778072;BA.debugLine="txtNumPreciosUMDifUMCompra.Alignment=\"CENTER_RIGH";
__ref._txtnumpreciosumdifumcompra /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=43778081;
 //BA.debugLineNum = 43778081;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Es";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._menubartabla /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=43778082;
 //BA.debugLineNum = 43778082;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Es";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=43778083;
 //BA.debugLineNum = 43778083;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Es";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=43778086;
 //BA.debugLineNum = 43778086;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasTarifa";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisTarifasInfoTarifaComprasArticulo2.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=43778087;
 //BA.debugLineNum = 43778087;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=43778088;
 //BA.debugLineNum = 43778088;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("843778088",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=43778089;
 //BA.debugLineNum = 43778089;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=43778090;
 //BA.debugLineNum = 43778090;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=43778091;
 //BA.debugLineNum = 43778091;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=43778092;
 //BA.debugLineNum = 43778092;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=43778093;
 //BA.debugLineNum = 43778093;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=43778096;
 //BA.debugLineNum = 43778096;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Al";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=43778098;
 //BA.debugLineNum = 43778098;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=43778099;
 //BA.debugLineNum = 43778099;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=43778100;
 //BA.debugLineNum = 43778100;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewLineasTar";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=43778101;
 //BA.debugLineNum = 43778101;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Se";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"FechaInicial","FechaFinal"}));
RDebugUtils.currentLine=43778104;
 //BA.debugLineNum = 43778104;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Ad";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=43778106;
 //BA.debugLineNum = 43778106;BA.debugLine="jamTableViewLineasTarifasCompraValidasArticulo.Ad";
__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Añadir Precio EUR Línea Tarifa a Coste Artículo Usuario","AddEditarCosteArticuloUsuarioValorPrecioEURLineaTarifaCompra",BA.ObjectToString(parent.__c.Chr(((int)0xf071))));
RDebugUtils.currentLine=43778108;
 //BA.debugLineNum = 43778108;BA.debugLine="Dialog.Initialize(Base)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=43778109;
 //BA.debugLineNum = 43778109;BA.debugLine="jamLoadingIndicator1.Initialize(Me,Base)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=43778113;
 //BA.debugLineNum = 43778113;BA.debugLine="DatosLineasTarifasCompraAvisosArticulo(mArticulo,";
__ref._datoslineastarifascompraavisosarticulo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._marticulo /*String*/ ,__ref._mdescripcionarticulo /*String*/ );
RDebugUtils.currentLine=43778115;
 //BA.debugLineNum = 43778115;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action(b4j.docU.canalisistarifasavisostarifacompra __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewLineasTarifasCompraValidasArticulo_ContextMenuItem_Action(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
String _tagmenuitem;
int _filasel = 0;
String _articulosel = "";
double _preciocompra = 0;
String _divisa = "";
double _valoreurpreciocompra = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
boolean _flagdivisaok = false;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sdiv = "";
double _tipocambio = 0;
String _smsg = "";
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 27;
switch (BA.switchObjectToInt(_tagmenuitem,"AddEditarCosteArticuloUsuarioValorPrecioEURLineaTarifaCompra")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=44302368;
 //BA.debugLineNum = 44302368;BA.debugLine="Dim FilaSel As Int=jamTableViewLineasTarifasCom";
_filasel = __ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=44302369;
 //BA.debugLineNum = 44302369;BA.debugLine="Dim ArticuloSel As String=jamTableViewLineasTar";
_articulosel = BA.ObjectToString(__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Articulo"));
RDebugUtils.currentLine=44302370;
 //BA.debugLineNum = 44302370;BA.debugLine="Dim PrecioCompra As Double=jamTableViewLineasTa";
_preciocompra = (double)(BA.ObjectToNumber(__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"PrecioCompra")));
RDebugUtils.currentLine=44302371;
 //BA.debugLineNum = 44302371;BA.debugLine="Dim Divisa As String=jamTableViewLineasTarifasC";
_divisa = BA.ObjectToString(__ref._jamtableviewlineastarifascompravalidasarticulo /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"Moneda"));
RDebugUtils.currentLine=44302372;
 //BA.debugLineNum = 44302372;BA.debugLine="Dim ValorEURPrecioCompra As Double";
_valoreurpreciocompra = 0;
RDebugUtils.currentLine=44302373;
 //BA.debugLineNum = 44302373;BA.debugLine="If Divisa<>\"\" And Divisa<>\"EUR\" Then";
if (true) break;

case 4:
//if
this.state = 26;
if ((_divisa).equals("") == false && (_divisa).equals("EUR") == false) { 
this.state = 6;
}else {
this.state = 25;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=44302374;
 //BA.debugLineNum = 44302374;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando tipos de cambio grabados en NAV..."));
RDebugUtils.currentLine=44302375;
 //BA.debugLineNum = 44302375;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=44302376;
 //BA.debugLineNum = 44302376;BA.debugLine="Wait For (TiposCambioConDatosNAV) complete (mR";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action"), __ref._tiposcambiocondatosnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 28;
return;
case 28:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44302377;
 //BA.debugLineNum = 44302377;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44302378;
 //BA.debugLineNum = 44302378;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=44302379;
 //BA.debugLineNum = 44302379;BA.debugLine="If Accion=\"NOK\" Then Return";
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
RDebugUtils.currentLine=44302380;
 //BA.debugLineNum = 44302380;BA.debugLine="Dim FlagDivisaOK As Boolean=False";
_flagdivisaok = parent.__c.False;
RDebugUtils.currentLine=44302381;
 //BA.debugLineNum = 44302381;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=44302382;
 //BA.debugLineNum = 44302382;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 13:
//for
this.state = 20;
_m = new anywheresoftware.b4a.objects.collections.Map();
group17 = _lstreg;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if (index17 < groupLen17) {
this.state = 15;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group17.Get(index17)));}
if (true) break;

case 30:
//C
this.state = 29;
index17++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=44302383;
 //BA.debugLineNum = 44302383;BA.debugLine="Dim sDiv As String=m.Get(\"Divisa\")";
_sdiv = BA.ObjectToString(_m.Get((Object)("Divisa")));
RDebugUtils.currentLine=44302384;
 //BA.debugLineNum = 44302384;BA.debugLine="If sDiv=Divisa Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((_sdiv).equals(_divisa)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=44302385;
 //BA.debugLineNum = 44302385;BA.debugLine="FlagDivisaOK=True";
_flagdivisaok = parent.__c.True;
RDebugUtils.currentLine=44302386;
 //BA.debugLineNum = 44302386;BA.debugLine="Dim TipoCambio As Double=m.Get(\"TipoCambio\")";
_tipocambio = (double)(BA.ObjectToNumber(_m.Get((Object)("TipoCambio"))));
 if (true) break;

case 19:
//C
this.state = 30;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=44302389;
 //BA.debugLineNum = 44302389;BA.debugLine="If FlagDivisaOK=False Then";

case 20:
//if
this.state = 23;
if (_flagdivisaok==parent.__c.False) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=44302390;
 //BA.debugLineNum = 44302390;BA.debugLine="Dim sMsg As String=$\"No se ha grabado tipo de";
_smsg = ("No se ha grabado tipo de cambio para la divisa "+parent.__c.SmartStringFormatter("",(Object)(_divisa))+" en NAVISION\n"+"No es posible calcular el valor en EUR correspondiente al coste de compra");
RDebugUtils.currentLine=44302392;
 //BA.debugLineNum = 44302392;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sMsg,\"Error";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_smsg,"Error");
RDebugUtils.currentLine=44302393;
 //BA.debugLineNum = 44302393;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "jamtableviewlineastarifascompravalidasarticulo_contextmenuitem_action"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 23;
;
RDebugUtils.currentLine=44302394;
 //BA.debugLineNum = 44302394;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 26;
;
RDebugUtils.currentLine=44302396;
 //BA.debugLineNum = 44302396;BA.debugLine="ValorEURPrecioCompra=PrecioCompra*TipoCambio";
_valoreurpreciocompra = _preciocompra*_tipocambio;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=44302398;
 //BA.debugLineNum = 44302398;BA.debugLine="ValorEURPrecioCompra=PrecioCompra";
_valoreurpreciocompra = _preciocompra;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=44302400;
 //BA.debugLineNum = 44302400;BA.debugLine="AddEditarCosteArticuloUsuarioValor(ArticuloSel,";
__ref._addeditarcostearticulousuariovalor /*void*/ (null,_articulosel,_valoreurpreciocompra);
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=44302404;
 //BA.debugLineNum = 44302404;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _tiposcambiocondatosnav(b4j.docU.canalisistarifasavisostarifacompra __ref) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";
if (Debug.shouldDelegate(ba, "tiposcambiocondatosnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "tiposcambiocondatosnav", null));}
ResumableSub_TiposCambioConDatosNAV rsub = new ResumableSub_TiposCambioConDatosNAV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_TiposCambioConDatosNAV extends BA.ResumableSub {
public ResumableSub_TiposCambioConDatosNAV(b4j.docU.canalisistarifasavisostarifacompra parent,b4j.docU.canalisistarifasavisostarifacompra __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisistarifasavisostarifacompra __ref;
b4j.docU.canalisistarifasavisostarifacompra parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisistarifasavisostarifacompra";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=44498947;
 //BA.debugLineNum = 44498947;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=44498948;
 //BA.debugLineNum = 44498948;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44498949;
 //BA.debugLineNum = 44498949;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=44498950;
 //BA.debugLineNum = 44498950;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=44498951;
 //BA.debugLineNum = 44498951;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=44498952;
 //BA.debugLineNum = 44498952;BA.debugLine="Dim Comando As String=\"TiposCambioConDatosNAV\"";
_comando = "TiposCambioConDatosNAV";
RDebugUtils.currentLine=44498953;
 //BA.debugLineNum = 44498953;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=44498954;
 //BA.debugLineNum = 44498954;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "tiposcambiocondatosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=44498955;
 //BA.debugLineNum = 44498955;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=44498956;
 //BA.debugLineNum = 44498956;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=44498957;
 //BA.debugLineNum = 44498957;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=44498958;
 //BA.debugLineNum = 44498958;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "tiposcambiocondatosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=44498959;
 //BA.debugLineNum = 44498959;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=44498960;
 //BA.debugLineNum = 44498960;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=44498963;
 //BA.debugLineNum = 44498963;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=44498964;
 //BA.debugLineNum = 44498964;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay tipos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay tipos de cambio grabados en NAV.","Error");
RDebugUtils.currentLine=44498965;
 //BA.debugLineNum = 44498965;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisistarifasavisostarifacompra", "tiposcambiocondatosnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=44498966;
 //BA.debugLineNum = 44498966;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=44498967;
 //BA.debugLineNum = 44498967;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=44498969;
 //BA.debugLineNum = 44498969;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=44498970;
 //BA.debugLineNum = 44498970;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=44498971;
 //BA.debugLineNum = 44498971;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=44498972;
 //BA.debugLineNum = 44498972;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=44498975;
 //BA.debugLineNum = 44498975;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=44498976;
 //BA.debugLineNum = 44498976;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}