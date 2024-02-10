package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cinfoexpedicioncorreosexpress extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cinfoexpedicioncorreosexpress", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cinfoexpedicioncorreosexpress.class).invoke(this, new Object[] {null});
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
public String _mnumeroexpedicion = "";
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlenumexpedicion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumexpedicion = null;
public String _usuariows = "";
public String _passwordws = "";
public b4j.docU.b4xdialog _dialog = null;
public Object _callbackinfoenvio = null;
public b4j.docU.jamtableview _jamtableviewinfotrackingenvio = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtref = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfecha = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdirrte = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpobrte = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodposnacrte = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnomdest = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdirdest = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpobdest = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodposnacdest = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumbultos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtkilos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvolumen = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodincestado = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescincestado = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnalbarannav = null;
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
public String  _initialize(b4j.docU.cinfoexpedicioncorreosexpress __ref,anywheresoftware.b4a.BA _ba,String _numexpedicion) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_numexpedicion}));}
RDebugUtils.currentLine=87752704;
 //BA.debugLineNum = 87752704;BA.debugLine="Public Sub Initialize(NumExpedicion As String)";
RDebugUtils.currentLine=87752705;
 //BA.debugLineNum = 87752705;BA.debugLine="mNumeroExpedicion=NumExpedicion";
__ref._mnumeroexpedicion /*String*/  = _numexpedicion;
RDebugUtils.currentLine=87752706;
 //BA.debugLineNum = 87752706;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
anywheresoftware.b4a.objects.collections.List _lstcf = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87818242;
 //BA.debugLineNum = 87818242;BA.debugLine="cmAuxCorreosExpress.CargaListaEstadosCorreosExpre";
parent._cmauxcorreosexpress._cargalistaestadoscorreosexpress /*String*/ ();
RDebugUtils.currentLine=87818243;
 //BA.debugLineNum = 87818243;BA.debugLine="cmAuxCorreosExpress.CargaListaIncidenciasCorreosE";
parent._cmauxcorreosexpress._cargalistaincidenciascorreosexpress /*String*/ ();
RDebugUtils.currentLine=87818251;
 //BA.debugLineNum = 87818251;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=87818252;
 //BA.debugLineNum = 87818252;BA.debugLine="frm.Icon =Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=87818254;
 //BA.debugLineNum = 87818254;BA.debugLine="frm.RootPane.LoadLayout(\"scrInfoTrackingEnvioCor";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrInfoTrackingEnvioCorreosExpress");
RDebugUtils.currentLine=87818255;
 //BA.debugLineNum = 87818255;BA.debugLine="Utilidades.SetFormMaximized(frm)";
parent._utilidades._setformmaximized /*String*/ (__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=87818256;
 //BA.debugLineNum = 87818256;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "show"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=87818257;
 //BA.debugLineNum = 87818257;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    \" &  \"Tr";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    "+"Tracking Envío Correos Express");
RDebugUtils.currentLine=87818259;
 //BA.debugLineNum = 87818259;BA.debugLine="jamTableViewInfoTrackingEnvio.EstadoMenuItem(jam";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=87818260;
 //BA.debugLineNum = 87818260;BA.debugLine="jamTableViewInfoTrackingEnvio.EstadoMenuItem(jam";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=87818262;
 //BA.debugLineNum = 87818262;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=87818264;
 //BA.debugLineNum = 87818264;BA.debugLine="Dim lstCF As List";
_lstcf = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87818265;
 //BA.debugLineNum = 87818265;BA.debugLine="lstCF.initialize";
_lstcf.Initialize();
RDebugUtils.currentLine=87818267;
 //BA.debugLineNum = 87818267;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTrackin";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"FasesTrackingExpedicionCorreosExpress.json",_lstcf);
RDebugUtils.currentLine=87818268;
 //BA.debugLineNum = 87818268;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87818269;
 //BA.debugLineNum = 87818269;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("887818269",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=87818270;
 //BA.debugLineNum = 87818270;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=87818271;
 //BA.debugLineNum = 87818271;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=87818272;
 //BA.debugLineNum = 87818272;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=87818273;
 //BA.debugLineNum = 87818273;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=87818274;
 //BA.debugLineNum = 87818274;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=87818281;
 //BA.debugLineNum = 87818281;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=87818282;
 //BA.debugLineNum = 87818282;BA.debugLine="If mNumeroExpedicion<>\"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((__ref._mnumeroexpedicion /*String*/ ).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=87818283;
 //BA.debugLineNum = 87818283;BA.debugLine="txtNumExpedicion.Text=mNumeroExpedicion";
__ref._txtnumexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._mnumeroexpedicion /*String*/ );
RDebugUtils.currentLine=87818284;
 //BA.debugLineNum = 87818284;BA.debugLine="btnActualizarInfoTracking_Click";
__ref._btnactualizarinfotracking_click /*void*/ (null);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=87818289;
 //BA.debugLineNum = 87818289;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarinfoexpedicion(b4j.docU.cinfoexpedicioncorreosexpress __ref,String _solicitante,String _numexpedicion) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "actualizarinfoexpedicion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarinfoexpedicion", new Object[] {_solicitante,_numexpedicion}));}
ResumableSub_ActualizarInfoExpedicion rsub = new ResumableSub_ActualizarInfoExpedicion(this,__ref,_solicitante,_numexpedicion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarInfoExpedicion extends BA.ResumableSub {
public ResumableSub_ActualizarInfoExpedicion(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref,String _solicitante,String _numexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._solicitante = _solicitante;
this._numexpedicion = _numexpedicion;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
String _solicitante;
String _numexpedicion;
anywheresoftware.b4a.objects.collections.List _lstfases = null;
String _wsresponse = "";
Object _msa = null;
int _result = 0;
b4j.docU.xml2map _xmlresplwebserver = null;
String _wsresponsesinprologo = "";
anywheresoftware.b4a.objects.collections.Map _parseddata = null;
anywheresoftware.b4a.objects.collections.Map _msegenvio = null;
int _coderror = 0;
String _smsgerr = "";
String _k = "";
String _dateformator = "";
String _timeformator = "";
anywheresoftware.b4a.objects.collections.Map _mfasesenvio = null;
String _k2 = "";
String _codestado = "";
long _festl = 0L;
long _testl = 0L;
String _nombreestadoenvio = "";
String _descripcionestadoenvio = "";
String[] _infoestado = null;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
anywheresoftware.b4a.BA.IterableList group55;
int index55;
int groupLen55;
anywheresoftware.b4a.BA.IterableList group56;
int index56;
int groupLen56;
anywheresoftware.b4a.BA.IterableList group70;
int index70;
int groupLen70;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88276993;
 //BA.debugLineNum = 88276993;BA.debugLine="Dim lstFases As List";
_lstfases = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88276994;
 //BA.debugLineNum = 88276994;BA.debugLine="lstFases.Initialize";
_lstfases.Initialize();
RDebugUtils.currentLine=88276995;
 //BA.debugLineNum = 88276995;BA.debugLine="wait for (InfoExpedicionCorreosExpress(Solicitant";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "actualizarinfoexpedicion"), __ref._infoexpedicioncorreosexpress /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_solicitante,_numexpedicion));
this.state = 47;
return;
case 47:
//C
this.state = 1;
_wsresponse = (String) result[1];
;
RDebugUtils.currentLine=88276996;
 //BA.debugLineNum = 88276996;BA.debugLine="Log(\"WSResponse \" & WSResponse)";
parent.__c.LogImpl("888276996","WSResponse "+_wsresponse,0);
RDebugUtils.currentLine=88276997;
 //BA.debugLineNum = 88276997;BA.debugLine="If WSResponse.StartsWith(\"Error carga credenciale";
if (true) break;

case 1:
//if
this.state = 4;
if (_wsresponse.startsWith("Error carga credenciales")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=88276998;
 //BA.debugLineNum = 88276998;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible cargar los credenciales de acceso al web service de Correos Express","Aviso");
RDebugUtils.currentLine=88276999;
 //BA.debugLineNum = 88276999;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "actualizarinfoexpedicion"), _msa);
this.state = 48;
return;
case 48:
//C
this.state = 4;
_result = (int) result[1];
;
RDebugUtils.currentLine=88277000;
 //BA.debugLineNum = 88277000;BA.debugLine="Return lstFases";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lstfases));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=88277002;
 //BA.debugLineNum = 88277002;BA.debugLine="LimpiarDatosCabEnvio";
__ref._limpiardatoscabenvio /*String*/ (null);
RDebugUtils.currentLine=88277003;
 //BA.debugLineNum = 88277003;BA.debugLine="If WSResponse.StartsWith(\"ERROR de comunicacion :";
if (true) break;

case 5:
//if
this.state = 46;
if (_wsresponse.startsWith("ERROR de comunicacion :")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 46;
RDebugUtils.currentLine=88277005;
 //BA.debugLineNum = 88277005;BA.debugLine="Return lstFases";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lstfases));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88277009;
 //BA.debugLineNum = 88277009;BA.debugLine="Dim XMLRespLWebServer As Xml2Map";
_xmlresplwebserver = new b4j.docU.xml2map();
RDebugUtils.currentLine=88277010;
 //BA.debugLineNum = 88277010;BA.debugLine="XMLRespLWebServer.Initialize";
_xmlresplwebserver._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=88277011;
 //BA.debugLineNum = 88277011;BA.debugLine="Dim WSResponseSinPrologo As String=WSResponse.Su";
_wsresponsesinprologo = _wsresponse.substring(_wsresponse.indexOf("<"));
RDebugUtils.currentLine=88277012;
 //BA.debugLineNum = 88277012;BA.debugLine="Dim ParsedData As Map=XMLRespLWebServer.Parse(WS";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
_parseddata = _xmlresplwebserver._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_wsresponsesinprologo);
RDebugUtils.currentLine=88277013;
 //BA.debugLineNum = 88277013;BA.debugLine="Dim mSegEnvio As Map=ParsedData.Get(\"Seguimiento";
_msegenvio = new anywheresoftware.b4a.objects.collections.Map();
_msegenvio = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_parseddata.Get((Object)("SeguimientoEnviosResponse"))));
RDebugUtils.currentLine=88277014;
 //BA.debugLineNum = 88277014;BA.debugLine="Dim CodError As Int=mSegEnvio.Get(\"Error\")";
_coderror = (int)(BA.ObjectToNumber(_msegenvio.Get((Object)("Error"))));
RDebugUtils.currentLine=88277015;
 //BA.debugLineNum = 88277015;BA.debugLine="If 0<>CodError Then";
if (true) break;

case 10:
//if
this.state = 45;
if (0!=_coderror) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=88277017;
 //BA.debugLineNum = 88277017;BA.debugLine="Log(\"Mensaje de error: \" & mSegEnvio.Get(\"Mensa";
parent.__c.LogImpl("888277017","Mensaje de error: "+BA.ObjectToString(_msegenvio.Get((Object)("MensajeError"))),0);
RDebugUtils.currentLine=88277018;
 //BA.debugLineNum = 88277018;BA.debugLine="If CodError=402 Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_coderror==402) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=88277019;
 //BA.debugLineNum = 88277019;BA.debugLine="Dim sMsgErr As String=\"No hay datos de envío p";
_smsgerr = "No hay datos de envío para el número de expedición indicado ("+_numexpedicion+").";
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=88277021;
 //BA.debugLineNum = 88277021;BA.debugLine="Dim sMsgErr As String=mSegEnvio.Get(\"MensajeEr";
_smsgerr = BA.ObjectToString(_msegenvio.Get((Object)("MensajeError")));
 if (true) break;

case 18:
//C
this.state = 45;
;
RDebugUtils.currentLine=88277023;
 //BA.debugLineNum = 88277023;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sMsgErr,\"Av";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_smsgerr,"Aviso");
RDebugUtils.currentLine=88277024;
 //BA.debugLineNum = 88277024;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "actualizarinfoexpedicion"), _msa);
this.state = 49;
return;
case 49:
//C
this.state = 45;
_result = (int) result[1];
;
RDebugUtils.currentLine=88277025;
 //BA.debugLineNum = 88277025;BA.debugLine="Return lstFases";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lstfases));return;};
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=88277029;
 //BA.debugLineNum = 88277029;BA.debugLine="For Each k As String In mSegEnvio.Keys";
if (true) break;

case 21:
//for
this.state = 28;
group31 = _msegenvio.Keys();
index31 = 0;
groupLen31 = group31.getSize();
this.state = 50;
if (true) break;

case 50:
//C
this.state = 28;
if (index31 < groupLen31) {
this.state = 23;
_k = BA.ObjectToString(group31.Get(index31));}
if (true) break;

case 51:
//C
this.state = 50;
index31++;
if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=88277030;
 //BA.debugLineNum = 88277030;BA.debugLine="If k<>\"Attributes\" And k<>\"Error\" And k<>\"Mens";
if (true) break;

case 24:
//if
this.state = 27;
if ((_k).equals("Attributes") == false && (_k).equals("Error") == false && (_k).equals("MensajeError") == false && (_k).equals("EstadoEnvios") == false) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=88277031;
 //BA.debugLineNum = 88277031;BA.debugLine="Log(k & \": \" & mSegEnvio.Get(k))";
parent.__c.LogImpl("888277031",_k+": "+BA.ObjectToString(_msegenvio.Get((Object)(_k))),0);
 if (true) break;

case 27:
//C
this.state = 51;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=88277035;
 //BA.debugLineNum = 88277035;BA.debugLine="txtNumExpedicion.Text=mSegEnvio.Get(\"NumEnvio\")";
__ref._txtnumexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("NumEnvio"))));
RDebugUtils.currentLine=88277036;
 //BA.debugLineNum = 88277036;BA.debugLine="txtRef.Text=mSegEnvio.Get(\"Ref\")";
__ref._txtref /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("Ref"))));
RDebugUtils.currentLine=88277037;
 //BA.debugLineNum = 88277037;BA.debugLine="txtFecha.Text=mSegEnvio.Get(\"Fecha\")";
__ref._txtfecha /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("Fecha"))));
RDebugUtils.currentLine=88277038;
 //BA.debugLineNum = 88277038;BA.debugLine="txtDirRte.Text=mSegEnvio.Get(\"DirRte\")";
__ref._txtdirrte /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("DirRte"))));
RDebugUtils.currentLine=88277039;
 //BA.debugLineNum = 88277039;BA.debugLine="txtPobRte.Text=mSegEnvio.Get(\"PobRte\")";
__ref._txtpobrte /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("PobRte"))));
RDebugUtils.currentLine=88277040;
 //BA.debugLineNum = 88277040;BA.debugLine="txtCodPosNacRte.Text=mSegEnvio.Get(\"CodPosNacRt";
__ref._txtcodposnacrte /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("CodPosNacRte"))));
RDebugUtils.currentLine=88277041;
 //BA.debugLineNum = 88277041;BA.debugLine="txtNomDest.Text=mSegEnvio.Get(\"NomDest\")";
__ref._txtnomdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("NomDest"))));
RDebugUtils.currentLine=88277042;
 //BA.debugLineNum = 88277042;BA.debugLine="txtDirDest.Text=mSegEnvio.Get(\"DirDest\")";
__ref._txtdirdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("DirDest"))));
RDebugUtils.currentLine=88277043;
 //BA.debugLineNum = 88277043;BA.debugLine="txtPobDest.Text=mSegEnvio.Get(\"PobDest\")";
__ref._txtpobdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("PobDest"))));
RDebugUtils.currentLine=88277044;
 //BA.debugLineNum = 88277044;BA.debugLine="txtCodPosNacDest.Text=mSegEnvio.Get(\"CodPosNacD";
__ref._txtcodposnacdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("CodPosNacDest"))));
RDebugUtils.currentLine=88277045;
 //BA.debugLineNum = 88277045;BA.debugLine="txtNumBultos.Text=mSegEnvio.Get(\"NumBultos\")";
__ref._txtnumbultos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("NumBultos"))));
RDebugUtils.currentLine=88277046;
 //BA.debugLineNum = 88277046;BA.debugLine="txtKilos.Text=mSegEnvio.Get(\"Kilos\")";
__ref._txtkilos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("Kilos"))));
RDebugUtils.currentLine=88277047;
 //BA.debugLineNum = 88277047;BA.debugLine="txtVolumen.Text=mSegEnvio.Get(\"Volumen\")";
__ref._txtvolumen /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("Volumen"))));
RDebugUtils.currentLine=88277048;
 //BA.debugLineNum = 88277048;BA.debugLine="txtCodIncEstado.Text=mSegEnvio.Get(\"CodIncEstad";
__ref._txtcodincestado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("CodIncEstado"))));
RDebugUtils.currentLine=88277049;
 //BA.debugLineNum = 88277049;BA.debugLine="txtDescIncEstado.Text=mSegEnvio.Get(\"DescIncEst";
__ref._txtdescincestado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_msegenvio.Get((Object)("DescIncEstado"))));
RDebugUtils.currentLine=88277052;
 //BA.debugLineNum = 88277052;BA.debugLine="Log(\"********* FASES DE ENVIO ********\")";
parent.__c.LogImpl("888277052","********* FASES DE ENVIO ********",0);
RDebugUtils.currentLine=88277053;
 //BA.debugLineNum = 88277053;BA.debugLine="Dim DateFormatOr As String=DateTime.DateFormat";
_dateformator = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=88277054;
 //BA.debugLineNum = 88277054;BA.debugLine="Dim TimeFormatOr As String=DateTime.TimeFormat";
_timeformator = parent.__c.DateTime.getTimeFormat();
RDebugUtils.currentLine=88277055;
 //BA.debugLineNum = 88277055;BA.debugLine="DateTime.DateFormat=\"ddMMyyy\"";
parent.__c.DateTime.setDateFormat("ddMMyyy");
RDebugUtils.currentLine=88277056;
 //BA.debugLineNum = 88277056;BA.debugLine="For Each mFasesEnvio As Map In GetElements(mSeg";
if (true) break;

case 29:
//for
this.state = 44;
_mfasesenvio = new anywheresoftware.b4a.objects.collections.Map();
group55 = __ref._getelements /*anywheresoftware.b4a.objects.collections.List*/ (null,_msegenvio,"EstadoEnvios");
index55 = 0;
groupLen55 = group55.getSize();
this.state = 52;
if (true) break;

case 52:
//C
this.state = 44;
if (index55 < groupLen55) {
this.state = 31;
_mfasesenvio = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group55.Get(index55)));}
if (true) break;

case 53:
//C
this.state = 52;
index55++;
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=88277057;
 //BA.debugLineNum = 88277057;BA.debugLine="For Each k2 As String In mFasesEnvio.Keys";
if (true) break;

case 32:
//for
this.state = 35;
group56 = _mfasesenvio.Keys();
index56 = 0;
groupLen56 = group56.getSize();
this.state = 54;
if (true) break;

case 54:
//C
this.state = 35;
if (index56 < groupLen56) {
this.state = 34;
_k2 = BA.ObjectToString(group56.Get(index56));}
if (true) break;

case 55:
//C
this.state = 54;
index56++;
if (true) break;

case 34:
//C
this.state = 55;
RDebugUtils.currentLine=88277058;
 //BA.debugLineNum = 88277058;BA.debugLine="Log(k2 & \": \" & mFasesEnvio.Get(k2))";
parent.__c.LogImpl("888277058",_k2+": "+BA.ObjectToString(_mfasesenvio.Get((Object)(_k2))),0);
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=88277060;
 //BA.debugLineNum = 88277060;BA.debugLine="Dim CodEstado As String=mFasesEnvio.Get(\"CodEs";
_codestado = BA.ObjectToString(_mfasesenvio.Get((Object)("CodEstado")));
RDebugUtils.currentLine=88277061;
 //BA.debugLineNum = 88277061;BA.debugLine="DateTime.DateFormat=\"ddMMyyyy\"";
parent.__c.DateTime.setDateFormat("ddMMyyyy");
RDebugUtils.currentLine=88277062;
 //BA.debugLineNum = 88277062;BA.debugLine="Dim FestL As Long=DateTime.DateParse(mFasesEnv";
_festl = parent.__c.DateTime.DateParse(BA.ObjectToString(_mfasesenvio.Get((Object)("FechaEstado"))));
RDebugUtils.currentLine=88277063;
 //BA.debugLineNum = 88277063;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=88277064;
 //BA.debugLineNum = 88277064;BA.debugLine="mFasesEnvio.put(\"FechaEstado\",DateTime.Date(Fe";
_mfasesenvio.Put((Object)("FechaEstado"),(Object)(parent.__c.DateTime.Date(_festl)));
RDebugUtils.currentLine=88277066;
 //BA.debugLineNum = 88277066;BA.debugLine="DateTime.TimeFormat=\"HHmmss\"";
parent.__c.DateTime.setTimeFormat("HHmmss");
RDebugUtils.currentLine=88277067;
 //BA.debugLineNum = 88277067;BA.debugLine="Dim TestL As Long=DateTime.TimeParse(mFasesEnv";
_testl = parent.__c.DateTime.TimeParse(BA.ObjectToString(_mfasesenvio.Get((Object)("HoraEstado"))));
RDebugUtils.currentLine=88277068;
 //BA.debugLineNum = 88277068;BA.debugLine="DateTime.DateFormat=\"hh:mm:ss\"";
parent.__c.DateTime.setDateFormat("hh:mm:ss");
RDebugUtils.currentLine=88277069;
 //BA.debugLineNum = 88277069;BA.debugLine="mFasesEnvio.put(\"HoraEstado\",DateTime.Date(Tes";
_mfasesenvio.Put((Object)("HoraEstado"),(Object)(parent.__c.DateTime.Date(_testl)));
RDebugUtils.currentLine=88277071;
 //BA.debugLineNum = 88277071;BA.debugLine="Dim NombreEstadoEnvio As String";
_nombreestadoenvio = "";
RDebugUtils.currentLine=88277072;
 //BA.debugLineNum = 88277072;BA.debugLine="Dim DescripcionEstadoEnvio As String";
_descripcionestadoenvio = "";
RDebugUtils.currentLine=88277073;
 //BA.debugLineNum = 88277073;BA.debugLine="For Each InfoEstado() As String In cmAuxCorreo";
if (true) break;

case 36:
//for
this.state = 43;
group70 = parent._cmauxcorreosexpress._lstestadoscorreosexpress /*anywheresoftware.b4a.objects.collections.List*/ ;
index70 = 0;
groupLen70 = group70.getSize();
this.state = 56;
if (true) break;

case 56:
//C
this.state = 43;
if (index70 < groupLen70) {
this.state = 38;
_infoestado = (String[])(group70.Get(index70));}
if (true) break;

case 57:
//C
this.state = 56;
index70++;
if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=88277074;
 //BA.debugLineNum = 88277074;BA.debugLine="If InfoEstado(0)=CodEstado Then";
if (true) break;

case 39:
//if
this.state = 42;
if ((_infoestado[(int) (0)]).equals(_codestado)) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=88277075;
 //BA.debugLineNum = 88277075;BA.debugLine="NombreEstadoEnvio=InfoEstado(1)";
_nombreestadoenvio = _infoestado[(int) (1)];
RDebugUtils.currentLine=88277076;
 //BA.debugLineNum = 88277076;BA.debugLine="DescripcionEstadoEnvio=InfoEstado(2)";
_descripcionestadoenvio = _infoestado[(int) (2)];
RDebugUtils.currentLine=88277077;
 //BA.debugLineNum = 88277077;BA.debugLine="mFasesEnvio.Put(\"NombreEstadoEnvio\",NombreEs";
_mfasesenvio.Put((Object)("NombreEstadoEnvio"),(Object)(_nombreestadoenvio));
RDebugUtils.currentLine=88277078;
 //BA.debugLineNum = 88277078;BA.debugLine="mFasesEnvio.Put(\"DescripcionEstadoEnvio\",Des";
_mfasesenvio.Put((Object)("DescripcionEstadoEnvio"),(Object)(_descripcionestadoenvio));
RDebugUtils.currentLine=88277079;
 //BA.debugLineNum = 88277079;BA.debugLine="mFasesEnvio.Remove(\"DescEstado\")";
_mfasesenvio.Remove((Object)("DescEstado"));
RDebugUtils.currentLine=88277080;
 //BA.debugLineNum = 88277080;BA.debugLine="Exit";
this.state = 43;
if (true) break;
 if (true) break;

case 42:
//C
this.state = 57;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 53;
;
RDebugUtils.currentLine=88277084;
 //BA.debugLineNum = 88277084;BA.debugLine="DateTime.DateFormat=DateFormatOr";
parent.__c.DateTime.setDateFormat(_dateformator);
RDebugUtils.currentLine=88277085;
 //BA.debugLineNum = 88277085;BA.debugLine="DateTime.TimeFormat=TimeFormatOr";
parent.__c.DateTime.setTimeFormat(_timeformator);
RDebugUtils.currentLine=88277086;
 //BA.debugLineNum = 88277086;BA.debugLine="Log(\"map Fase \" & mFasesEnvio)";
parent.__c.LogImpl("888277086","map Fase "+BA.ObjectToString(_mfasesenvio),0);
RDebugUtils.currentLine=88277087;
 //BA.debugLineNum = 88277087;BA.debugLine="lstFases.Add(mFasesEnvio)";
_lstfases.Add((Object)(_mfasesenvio.getObject()));
 if (true) break;
if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=88277089;
 //BA.debugLineNum = 88277089;BA.debugLine="Return lstFases";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_lstfases));return;};
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=88277093;
 //BA.debugLineNum = 88277093;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _infoexpedicioncorreosexpress(b4j.docU.cinfoexpedicioncorreosexpress __ref,String _solicitante,String _numexpedicion) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "infoexpedicioncorreosexpress", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "infoexpedicioncorreosexpress", new Object[] {_solicitante,_numexpedicion}));}
ResumableSub_InfoExpedicionCorreosExpress rsub = new ResumableSub_InfoExpedicionCorreosExpress(this,__ref,_solicitante,_numexpedicion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InfoExpedicionCorreosExpress extends BA.ResumableSub {
public ResumableSub_InfoExpedicionCorreosExpress(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref,String _solicitante,String _numexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._solicitante = _solicitante;
this._numexpedicion = _numexpedicion;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
String _solicitante;
String _numexpedicion;
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _parseddata = null;
anywheresoftware.b4a.objects.collections.Map _mseguimientoenviosrequest = null;
String _k = "";
b4j.docU.map2xml _m2xml = null;
String _sxml = "";
b4j.docU.httpjob _job = null;
String _urlcorreosexpress = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88342531;
 //BA.debugLineNum = 88342531;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=88342532;
 //BA.debugLineNum = 88342532;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=88342533;
 //BA.debugLineNum = 88342533;BA.debugLine="Dim ParsedData As Map";
_parseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88342534;
 //BA.debugLineNum = 88342534;BA.debugLine="ParsedData = xm.Parse(File.ReadString(File.DirAss";
_parseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,parent.__c.File.ReadString(parent.__c.File.getDirAssets(),"PlantillaXLMCorreosSeguimientoEnvio.xml"));
RDebugUtils.currentLine=88342537;
 //BA.debugLineNum = 88342537;BA.debugLine="Dim mSeguimientoEnviosRequest As Map=ParsedData.G";
_mseguimientoenviosrequest = new anywheresoftware.b4a.objects.collections.Map();
_mseguimientoenviosrequest = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_parseddata.Get((Object)("SeguimientoEnviosRequest"))));
RDebugUtils.currentLine=88342539;
 //BA.debugLineNum = 88342539;BA.debugLine="For Each k As String In mSeguimientoEnviosRequest";
if (true) break;

case 1:
//for
this.state = 4;
group6 = _mseguimientoenviosrequest.Keys();
index6 = 0;
groupLen6 = group6.getSize();
this.state = 11;
if (true) break;

case 11:
//C
this.state = 4;
if (index6 < groupLen6) {
this.state = 3;
_k = BA.ObjectToString(group6.Get(index6));}
if (true) break;

case 12:
//C
this.state = 11;
index6++;
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=88342540;
 //BA.debugLineNum = 88342540;BA.debugLine="Log(\"k :\" & k)";
parent.__c.LogImpl("888342540","k :"+_k,0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=88342545;
 //BA.debugLineNum = 88342545;BA.debugLine="mSeguimientoEnviosRequest.Put(\"Solicitante\",Solic";
_mseguimientoenviosrequest.Put((Object)("Solicitante"),(Object)(_solicitante));
RDebugUtils.currentLine=88342546;
 //BA.debugLineNum = 88342546;BA.debugLine="mSeguimientoEnviosRequest.Put(\"Dato\",NumExpedicio";
_mseguimientoenviosrequest.Put((Object)("Dato"),(Object)(_numexpedicion));
RDebugUtils.currentLine=88342550;
 //BA.debugLineNum = 88342550;BA.debugLine="Dim m2Xml As Map2Xml";
_m2xml = new b4j.docU.map2xml();
RDebugUtils.currentLine=88342551;
 //BA.debugLineNum = 88342551;BA.debugLine="m2Xml.Initialize";
_m2xml._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=88342552;
 //BA.debugLineNum = 88342552;BA.debugLine="Dim sXML As String=m2Xml.MapToXml(ParsedData)";
_sxml = _m2xml._maptoxml /*String*/ (null,_parseddata);
RDebugUtils.currentLine=88342554;
 //BA.debugLineNum = 88342554;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=88342555;
 //BA.debugLineNum = 88342555;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=88342556;
 //BA.debugLineNum = 88342556;BA.debugLine="Dim URLCorreosExpress As String=\"https://www.corr";
_urlcorreosexpress = "https://www.correosexpress.com/wpsc/apiRestSeguimientoEnvios/rest/seguimientoEnvios";
RDebugUtils.currentLine=88342557;
 //BA.debugLineNum = 88342557;BA.debugLine="job.Username=UsuarioWS";
_job._username /*String*/  = __ref._usuariows /*String*/ ;
RDebugUtils.currentLine=88342558;
 //BA.debugLineNum = 88342558;BA.debugLine="job.Password=PasswordWs";
_job._password /*String*/  = __ref._passwordws /*String*/ ;
RDebugUtils.currentLine=88342559;
 //BA.debugLineNum = 88342559;BA.debugLine="job.PostString(URLCorreosExpress,sXML)";
_job._poststring /*String*/ (null,_urlcorreosexpress,_sxml);
RDebugUtils.currentLine=88342561;
 //BA.debugLineNum = 88342561;BA.debugLine="job.GetRequest.SetContentType(\"application/xml\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/xml");
RDebugUtils.currentLine=88342563;
 //BA.debugLineNum = 88342563;BA.debugLine="job.GetRequest.SetContentEncoding(\"UTF-8\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentEncoding("UTF-8");
RDebugUtils.currentLine=88342565;
 //BA.debugLineNum = 88342565;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "infoexpedicioncorreosexpress"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 5;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=88342566;
 //BA.debugLineNum = 88342566;BA.debugLine="If j.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=88342568;
 //BA.debugLineNum = 88342568;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=88342569;
 //BA.debugLineNum = 88342569;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=88342570;
 //BA.debugLineNum = 88342570;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88342572;
 //BA.debugLineNum = 88342572;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=88342573;
 //BA.debugLineNum = 88342573;BA.debugLine="Return \"ERROR de comunicacion con www.correosexp";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("ERROR de comunicacion con www.correosexpress.com webservice"+BA.ObjectToString(((parent.__c.LastException(ba).IsInitialized()) ? ((Object)(parent.__c.LastException(ba).getMessage())) : ((Object)(""))))));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=88342575;
 //BA.debugLineNum = 88342575;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _limpiardatoscabenvio(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "limpiardatoscabenvio", false))
	 {return ((String) Debug.delegate(ba, "limpiardatoscabenvio", null));}
RDebugUtils.currentLine=87883776;
 //BA.debugLineNum = 87883776;BA.debugLine="Sub LimpiarDatosCabEnvio";
RDebugUtils.currentLine=87883777;
 //BA.debugLineNum = 87883777;BA.debugLine="txtCodIncEstado.Text=\"\"";
__ref._txtcodincestado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883778;
 //BA.debugLineNum = 87883778;BA.debugLine="txtCodPosNacDest.Text=\"\"";
__ref._txtcodposnacdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883779;
 //BA.debugLineNum = 87883779;BA.debugLine="txtDescIncEstado.Text=\"\"";
__ref._txtdescincestado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883780;
 //BA.debugLineNum = 87883780;BA.debugLine="txtDirDest.Text=\"\"";
__ref._txtdirdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883781;
 //BA.debugLineNum = 87883781;BA.debugLine="txtDirRte.Text=\"\"";
__ref._txtdirrte /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883782;
 //BA.debugLineNum = 87883782;BA.debugLine="txtFecha.Text=\"\"";
__ref._txtfecha /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883783;
 //BA.debugLineNum = 87883783;BA.debugLine="txtKilos.Text=\"\"";
__ref._txtkilos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883784;
 //BA.debugLineNum = 87883784;BA.debugLine="txtNomDest.Text=\"\"";
__ref._txtnomdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883785;
 //BA.debugLineNum = 87883785;BA.debugLine="txtNumBultos.Text=\"\"";
__ref._txtnumbultos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883786;
 //BA.debugLineNum = 87883786;BA.debugLine="txtNumExpedicion.Text=\"\"";
__ref._txtnumexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883787;
 //BA.debugLineNum = 87883787;BA.debugLine="txtPobDest.Text=\"\"";
__ref._txtpobdest /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883788;
 //BA.debugLineNum = 87883788;BA.debugLine="txtPobRte.Text=\"\"";
__ref._txtpobrte /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883789;
 //BA.debugLineNum = 87883789;BA.debugLine="txtRef.Text=\"\"";
__ref._txtref /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883790;
 //BA.debugLineNum = 87883790;BA.debugLine="txtVolumen.Text=\"\"";
__ref._txtvolumen /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=87883791;
 //BA.debugLineNum = 87883791;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getelements(b4j.docU.cinfoexpedicioncorreosexpress __ref,anywheresoftware.b4a.objects.collections.Map _m,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "getelements", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getelements", new Object[] {_m,_key}));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object _value = null;
RDebugUtils.currentLine=88408064;
 //BA.debugLineNum = 88408064;BA.debugLine="Sub GetElements (m As Map, key As String) As List";
RDebugUtils.currentLine=88408065;
 //BA.debugLineNum = 88408065;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88408066;
 //BA.debugLineNum = 88408066;BA.debugLine="If m.ContainsKey(key) = False Then";
if (_m.ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=88408067;
 //BA.debugLineNum = 88408067;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=88408068;
 //BA.debugLineNum = 88408068;BA.debugLine="Return res";
if (true) return _res;
 }else {
RDebugUtils.currentLine=88408070;
 //BA.debugLineNum = 88408070;BA.debugLine="Dim value As Object = m.Get(key)";
_value = _m.Get((Object)(_key));
RDebugUtils.currentLine=88408071;
 //BA.debugLineNum = 88408071;BA.debugLine="If value Is List Then Return value";
if (_value instanceof java.util.List) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value));};
RDebugUtils.currentLine=88408072;
 //BA.debugLineNum = 88408072;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=88408073;
 //BA.debugLineNum = 88408073;BA.debugLine="res.Add(value)";
_res.Add(_value);
RDebugUtils.currentLine=88408074;
 //BA.debugLineNum = 88408074;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=88408076;
 //BA.debugLineNum = 88408076;BA.debugLine="End Sub";
return null;
}
public void  _btnactualizarinfotracking_click(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "btnactualizarinfotracking_click", false))
	 {Debug.delegate(ba, "btnactualizarinfotracking_click", null); return;}
ResumableSub_btnActualizarInfoTracking_Click rsub = new ResumableSub_btnActualizarInfoTracking_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnActualizarInfoTracking_Click extends BA.ResumableSub {
public ResumableSub_btnActualizarInfoTracking_Click(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
Object _msa = null;
int _result = 0;
String _sresult = "";
anywheresoftware.b4a.objects.collections.List _lstfases = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88211458;
 //BA.debugLineNum = 88211458;BA.debugLine="If txtNumExpedicion.Text=\"\" Then";
if (true) break;

case 1:
//if
this.state = 27;
if ((__ref._txtnumexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 27;
RDebugUtils.currentLine=88211459;
 //BA.debugLineNum = 88211459;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Introduce u";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Introduce un número de expedición","Aviso");
RDebugUtils.currentLine=88211460;
 //BA.debugLineNum = 88211460;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 27;
_result = (int) result[1];
;
RDebugUtils.currentLine=88211461;
 //BA.debugLineNum = 88211461;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=88211464;
 //BA.debugLineNum = 88211464;BA.debugLine="jamTableViewInfoTrackingEnvio.LimpiarTabla";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=88211465;
 //BA.debugLineNum = 88211465;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=88211466;
 //BA.debugLineNum = 88211466;BA.debugLine="Wait For (CargaCredenciales) complete (sResult A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), __ref._cargacredenciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 6;
_sresult = (String) result[1];
;
RDebugUtils.currentLine=88211467;
 //BA.debugLineNum = 88211467;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=88211468;
 //BA.debugLineNum = 88211468;BA.debugLine="If sResult<>\"OK\" Then Return";
if (true) break;

case 6:
//if
this.state = 11;
if ((_sresult).equals("OK") == false) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
if (true) return ;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=88211470;
 //BA.debugLineNum = 88211470;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=88211471;
 //BA.debugLineNum = 88211471;BA.debugLine="wait for (ActualizarInfoExpedicion(\"I519390002\",";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), __ref._actualizarinfoexpedicion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"I519390002",__ref._txtnumexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
this.state = 30;
return;
case 30:
//C
this.state = 12;
_lstfases = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=88211472;
 //BA.debugLineNum = 88211472;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=88211474;
 //BA.debugLineNum = 88211474;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=88211475;
 //BA.debugLineNum = 88211475;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTrackin";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstfases.getObject()));
RDebugUtils.currentLine=88211476;
 //BA.debugLineNum = 88211476;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _rsub);
this.state = 31;
return;
case 31:
//C
this.state = 12;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88211477;
 //BA.debugLineNum = 88211477;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=88211478;
 //BA.debugLineNum = 88211478;BA.debugLine="lstFases.Initialize";
_lstfases.Initialize();
RDebugUtils.currentLine=88211479;
 //BA.debugLineNum = 88211479;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 12:
//if
this.state = 26;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=88211480;
 //BA.debugLineNum = 88211480;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 15:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=88211481;
 //BA.debugLineNum = 88211481;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=88211482;
 //BA.debugLineNum = 88211482;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 18;
;
RDebugUtils.currentLine=88211483;
 //BA.debugLineNum = 88211483;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=88211485;
 //BA.debugLineNum = 88211485;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 18:
//if
this.state = 25;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=88211486;
 //BA.debugLineNum = 88211486;BA.debugLine="If mResultSetData.Get(\"msgAviso\")<>\"La lista d";
if (true) break;

case 21:
//if
this.state = 24;
if ((_mresultsetdata.Get((Object)("msgAviso"))).equals((Object)("La lista de datos está vacía.")) == false) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=88211487;
 //BA.debugLineNum = 88211487;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetD";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=88211488;
 //BA.debugLineNum = 88211488;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _msa);
this.state = 33;
return;
case 33:
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
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=88211495;
 //BA.debugLineNum = 88211495;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacredenciales(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "cargacredenciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacredenciales", null));}
ResumableSub_CargaCredenciales rsub = new ResumableSub_CargaCredenciales(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCredenciales extends BA.ResumableSub {
public ResumableSub_CargaCredenciales(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstresws = null;
anywheresoftware.b4a.objects.collections.Map _mdatosws = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88080386;
 //BA.debugLineNum = 88080386;BA.debugLine="CargaDatosWebServiceTransporte(17)   '17 es el ID";
__ref._cargadatoswebservicetransporte /*void*/ (null,(int) (17));
RDebugUtils.currentLine=88080387;
 //BA.debugLineNum = 88080387;BA.debugLine="Wait For CargaDatosWebServiceTransporte_Completed";
parent.__c.WaitFor("cargadatoswebservicetransporte_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "cargacredenciales"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accion = (String) result[1];
_lstresws = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=88080388;
 //BA.debugLineNum = 88080388;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=88080389;
 //BA.debugLineNum = 88080389;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=88080391;
 //BA.debugLineNum = 88080391;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
_mdatosws = new anywheresoftware.b4a.objects.collections.Map();
_mdatosws = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstresws.Get((int) (0))));
RDebugUtils.currentLine=88080393;
 //BA.debugLineNum = 88080393;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
__ref._usuariows /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("UsuarioWS")));
RDebugUtils.currentLine=88080394;
 //BA.debugLineNum = 88080394;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
__ref._passwordws /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("PasswordWS")));
RDebugUtils.currentLine=88080398;
 //BA.debugLineNum = 88080398;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._usuariows /*String*/ ).equals("") || (__ref._passwordws /*String*/ ).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=88080399;
 //BA.debugLineNum = 88080399;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88080401;
 //BA.debugLineNum = 88080401;BA.debugLine="Return \"OK\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("OK"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=88080403;
 //BA.debugLineNum = 88080403;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnalbarannav_click(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "btnalbarannav_click", false))
	 {Debug.delegate(ba, "btnalbarannav_click", null); return;}
ResumableSub_btnAlbaranNAV_Click rsub = new ResumableSub_btnAlbaranNAV_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAlbaranNAV_Click extends BA.ResumableSub {
public ResumableSub_btnAlbaranNAV_Click(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
int _pagnavtipodoc = 0;
String _tituloventana = "";
String _doc = "";
Object _msa = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88473601;
 //BA.debugLineNum = 88473601;BA.debugLine="Dim  PagNAVTipoDoc As Int";
_pagnavtipodoc = 0;
RDebugUtils.currentLine=88473602;
 //BA.debugLineNum = 88473602;BA.debugLine="Dim TituloVentana As String";
_tituloventana = "";
RDebugUtils.currentLine=88473603;
 //BA.debugLineNum = 88473603;BA.debugLine="Dim Doc As String=txtRef.Text";
_doc = __ref._txtref /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=88473604;
 //BA.debugLineNum = 88473604;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(parent.__c.True,(_doc).equals(""),_doc.startsWith("ALBV"),_doc.startsWith("RT"))) {
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
default: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=88473606;
 //BA.debugLineNum = 88473606;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha ind";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha indicado documento.","Aviso");
RDebugUtils.currentLine=88473607;
 //BA.debugLineNum = 88473607;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnalbarannav_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
RDebugUtils.currentLine=88473608;
 //BA.debugLineNum = 88473608;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=88473610;
 //BA.debugLineNum = 88473610;BA.debugLine="PagNAVTipoDoc=130";
_pagnavtipodoc = (int) (130);
RDebugUtils.currentLine=88473611;
 //BA.debugLineNum = 88473611;BA.debugLine="TituloVentana=\"Histórico albaranes venta\"";
_tituloventana = "Histórico albaranes venta";
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=88473613;
 //BA.debugLineNum = 88473613;BA.debugLine="PagNAVTipoDoc=5745";
_pagnavtipodoc = (int) (5745);
RDebugUtils.currentLine=88473614;
 //BA.debugLineNum = 88473614;BA.debugLine="TituloVentana=\"Histórico recep. transferencia\"";
_tituloventana = "Histórico recep. transferencia";
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88473616;
 //BA.debugLineNum = 88473616;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo es posible navegar a documentos tipo ALBV o RT.","Aviso");
RDebugUtils.currentLine=88473617;
 //BA.debugLineNum = 88473617;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnalbarannav_click"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=88473618;
 //BA.debugLineNum = 88473618;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=88473620;
 //BA.debugLineNum = 88473620;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirLin";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_tituloventana,_pagnavtipodoc,"No.",_doc);
RDebugUtils.currentLine=88473621;
 //BA.debugLineNum = 88473621;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "btnalbarannav_click"), _rsub);
this.state = 13;
return;
case 13:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=88473622;
 //BA.debugLineNum = 88473622;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=88014848;
 //BA.debugLineNum = 88014848;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=88014849;
 //BA.debugLineNum = 88014849;BA.debugLine="LimpiarDatosCabEnvio";
__ref._limpiardatoscabenvio /*String*/ (null);
RDebugUtils.currentLine=88014850;
 //BA.debugLineNum = 88014850;BA.debugLine="jamTableViewInfoTrackingEnvio.GuardarConfiguracio";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=88014851;
 //BA.debugLineNum = 88014851;BA.debugLine="jamTableViewInfoTrackingEnvio.LimpiarTabla";
__ref._jamtableviewinfotrackingenvio /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=88014852;
 //BA.debugLineNum = 88014852;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=88014855;
 //BA.debugLineNum = 88014855;BA.debugLine="End Sub";
return "";
}
public void  _cargadatoswebservicetransporte(b4j.docU.cinfoexpedicioncorreosexpress __ref,int _idtransportista) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "cargadatoswebservicetransporte", false))
	 {Debug.delegate(ba, "cargadatoswebservicetransporte", new Object[] {_idtransportista}); return;}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(this,__ref,_idtransportista);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cinfoexpedicioncorreosexpress parent,b4j.docU.cinfoexpedicioncorreosexpress __ref,int _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
this.__ref = parent;
}
b4j.docU.cinfoexpedicioncorreosexpress __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
int _idtransportista;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88145922;
 //BA.debugLineNum = 88145922;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=88145923;
 //BA.debugLineNum = 88145923;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88145924;
 //BA.debugLineNum = 88145924;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=88145925;
 //BA.debugLineNum = 88145925;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
_comandojrdc = "DatosWebServiceTransporte";
RDebugUtils.currentLine=88145926;
 //BA.debugLineNum = 88145926;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
parent._jrdcquery._datosjrdc /*void*/ ("http://192.168.10.20:17179/rdc",_comandojrdc,(Object[])(new String[]{BA.NumberToString(_idtransportista)}),parent);
RDebugUtils.currentLine=88145927;
 //BA.debugLineNum = 88145927;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpedicioncorreosexpress", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88145928;
 //BA.debugLineNum = 88145928;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=88145929;
 //BA.debugLineNum = 88145929;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=88145931;
 //BA.debugLineNum = 88145931;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=88145932;
 //BA.debugLineNum = 88145932;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=88145934;
 //BA.debugLineNum = 88145934;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=88145935;
 //BA.debugLineNum = 88145935;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
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
RDebugUtils.currentLine=88145938;
 //BA.debugLineNum = 88145938;BA.debugLine="CallSubDelayed3(Me,\"CargaDatosWebServiceTransport";
parent.__c.CallSubDelayed3(ba,parent,"CargaDatosWebServiceTransporte_Completed",(Object)(_accion),(Object)(_lstres));
RDebugUtils.currentLine=88145939;
 //BA.debugLineNum = 88145939;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cinfoexpedicioncorreosexpress __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
RDebugUtils.currentLine=87687168;
 //BA.debugLineNum = 87687168;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=87687169;
 //BA.debugLineNum = 87687169;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=87687171;
 //BA.debugLineNum = 87687171;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=87687172;
 //BA.debugLineNum = 87687172;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=87687174;
 //BA.debugLineNum = 87687174;BA.debugLine="Private mNumeroExpedicion As String";
_mnumeroexpedicion = "";
RDebugUtils.currentLine=87687177;
 //BA.debugLineNum = 87687177;BA.debugLine="Private lblTitleNumExpedicion As Label";
_lbltitlenumexpedicion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=87687178;
 //BA.debugLineNum = 87687178;BA.debugLine="Private txtNumExpedicion As TextField";
_txtnumexpedicion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687180;
 //BA.debugLineNum = 87687180;BA.debugLine="Private UsuarioWS As String";
_usuariows = "";
RDebugUtils.currentLine=87687181;
 //BA.debugLineNum = 87687181;BA.debugLine="Private PasswordWs As String";
_passwordws = "";
RDebugUtils.currentLine=87687183;
 //BA.debugLineNum = 87687183;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=87687188;
 //BA.debugLineNum = 87687188;BA.debugLine="Public CallbackInfoEnvio As Object";
_callbackinfoenvio = new Object();
RDebugUtils.currentLine=87687190;
 //BA.debugLineNum = 87687190;BA.debugLine="Private jamTableViewInfoTrackingEnvio As jamTable";
_jamtableviewinfotrackingenvio = new b4j.docU.jamtableview();
RDebugUtils.currentLine=87687191;
 //BA.debugLineNum = 87687191;BA.debugLine="Private txtRef As TextField";
_txtref = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687192;
 //BA.debugLineNum = 87687192;BA.debugLine="Private txtFecha As TextField";
_txtfecha = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687193;
 //BA.debugLineNum = 87687193;BA.debugLine="Private txtDirRte As TextField";
_txtdirrte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687194;
 //BA.debugLineNum = 87687194;BA.debugLine="Private txtPobRte As TextField";
_txtpobrte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687195;
 //BA.debugLineNum = 87687195;BA.debugLine="Private txtCodPosNacRte As TextField";
_txtcodposnacrte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687196;
 //BA.debugLineNum = 87687196;BA.debugLine="Private txtNomDest As TextField";
_txtnomdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687197;
 //BA.debugLineNum = 87687197;BA.debugLine="Private txtDirDest As TextField";
_txtdirdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687198;
 //BA.debugLineNum = 87687198;BA.debugLine="Private txtPobDest As TextField";
_txtpobdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687199;
 //BA.debugLineNum = 87687199;BA.debugLine="Private txtCodPosNacDest As TextField";
_txtcodposnacdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687200;
 //BA.debugLineNum = 87687200;BA.debugLine="Private txtNumBultos As TextField";
_txtnumbultos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687201;
 //BA.debugLineNum = 87687201;BA.debugLine="Private txtKilos As TextField";
_txtkilos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687202;
 //BA.debugLineNum = 87687202;BA.debugLine="Private txtVolumen As TextField";
_txtvolumen = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687203;
 //BA.debugLineNum = 87687203;BA.debugLine="Private txtCodIncEstado As TextField";
_txtcodincestado = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687204;
 //BA.debugLineNum = 87687204;BA.debugLine="Private txtDescIncEstado As TextField";
_txtdescincestado = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=87687205;
 //BA.debugLineNum = 87687205;BA.debugLine="Private btnAlbaranNAV As Button";
_btnalbarannav = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=87687209;
 //BA.debugLineNum = 87687209;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cinfoexpedicioncorreosexpress __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpedicioncorreosexpress";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=87949312;
 //BA.debugLineNum = 87949312;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=87949313;
 //BA.debugLineNum = 87949313;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=87949314;
 //BA.debugLineNum = 87949314;BA.debugLine="End Sub";
return "";
}
}