package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cinfoexpediciontxt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cinfoexpediciontxt", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cinfoexpediciontxt.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipodatosexpedicionxt{
public boolean IsInitialized;
public String CODEMPRESA;
public String CODORIGEN;
public String CODDESTIN;
public int NEXPED1;
public int NEXPED2;
public String ANO;
public String CODCLIENTE;
public String NOMBREREMITENTE;
public String NIFREMITENTE;
public String DIRECCIONREMITENTE;
public String CPOSTALREMITENTE;
public String POBLACIONREMITENTE;
public String CODPAISREMITENTE;
public String NOMBREDESTINATARIO;
public String NIFDESTINATARIO;
public String DIRECCIONDESTINATARIO;
public String CPOSTALDESTINATARIO;
public String POBLACIONDESTINATARIO;
public String CODPAISDESTINATARIO;
public String REFERENCIA1;
public String REFERENCIA2;
public String REFERENCIA3;
public String REFERENCIA4;
public String OBSERVACIONES;
public String TIPOMERCANCIA;
public int BULTOS;
public int UNIDADES;
public int KILOS;
public double REEMBOLSO;
public double VDECLARADO;
public String TPORTEE;
public String TPORTER;
public String TPORTEV;
public int ALTO;
public int ANCHO;
public int LARGO;
public int VOLUMEN;
public String FECHAALTA;
public String RETENIDO;
public String BORRADO;
public String DOCADJUNTA;
public int TIPOSERVICIO;
public int GRANSUPERFICIE;
public int LARGOS;
public int PALETS;
public String EXPORTADO;
public String EMAIL;
public String PCONTACTO;
public String TELEFONO;
public void Initialize() {
IsInitialized = true;
CODEMPRESA = "";
CODORIGEN = "";
CODDESTIN = "";
NEXPED1 = 0;
NEXPED2 = 0;
ANO = "";
CODCLIENTE = "";
NOMBREREMITENTE = "";
NIFREMITENTE = "";
DIRECCIONREMITENTE = "";
CPOSTALREMITENTE = "";
POBLACIONREMITENTE = "";
CODPAISREMITENTE = "";
NOMBREDESTINATARIO = "";
NIFDESTINATARIO = "";
DIRECCIONDESTINATARIO = "";
CPOSTALDESTINATARIO = "";
POBLACIONDESTINATARIO = "";
CODPAISDESTINATARIO = "";
REFERENCIA1 = "";
REFERENCIA2 = "";
REFERENCIA3 = "";
REFERENCIA4 = "";
OBSERVACIONES = "";
TIPOMERCANCIA = "";
BULTOS = 0;
UNIDADES = 0;
KILOS = 0;
REEMBOLSO = 0;
VDECLARADO = 0;
TPORTEE = "";
TPORTER = "";
TPORTEV = "";
ALTO = 0;
ANCHO = 0;
LARGO = 0;
VOLUMEN = 0;
FECHAALTA = "";
RETENIDO = "";
BORRADO = "";
DOCADJUNTA = "";
TIPOSERVICIO = 0;
GRANSUPERFICIE = 0;
LARGOS = 0;
PALETS = 0;
EXPORTADO = "";
EMAIL = "";
PCONTACTO = "";
TELEFONO = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public String _mnumeroexpedicion = "";
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlenumexpedicion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumexpedicion = null;
public String _usuariows = "";
public String _passwordws = "";
public b4j.docU.b4xdialog _dialog = null;
public String _usertxt = "";
public String _pswtxt = "";
public String _tokenwebtxt = "";
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
public b4j.docU.cinfoexpediciontxt._tipodatosexpedicionxt _mdatosexpediciontxtseleccionada = null;
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
public String  _class_globals(b4j.docU.cinfoexpediciontxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpediciontxt";
RDebugUtils.currentLine=88997888;
 //BA.debugLineNum = 88997888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=88997889;
 //BA.debugLineNum = 88997889;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=88997891;
 //BA.debugLineNum = 88997891;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=88997892;
 //BA.debugLineNum = 88997892;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=88997894;
 //BA.debugLineNum = 88997894;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=88997895;
 //BA.debugLineNum = 88997895;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=88997896;
 //BA.debugLineNum = 88997896;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=88997898;
 //BA.debugLineNum = 88997898;BA.debugLine="Private mNumeroExpedicion As String";
_mnumeroexpedicion = "";
RDebugUtils.currentLine=88997901;
 //BA.debugLineNum = 88997901;BA.debugLine="Private lblTitleNumExpedicion As Label";
_lbltitlenumexpedicion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=88997902;
 //BA.debugLineNum = 88997902;BA.debugLine="Private txtNumExpedicion As TextField";
_txtnumexpedicion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997904;
 //BA.debugLineNum = 88997904;BA.debugLine="Private UsuarioWS As String";
_usuariows = "";
RDebugUtils.currentLine=88997905;
 //BA.debugLineNum = 88997905;BA.debugLine="Private PasswordWs As String";
_passwordws = "";
RDebugUtils.currentLine=88997907;
 //BA.debugLineNum = 88997907;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=88997909;
 //BA.debugLineNum = 88997909;BA.debugLine="Private UserTXT As String";
_usertxt = "";
RDebugUtils.currentLine=88997910;
 //BA.debugLineNum = 88997910;BA.debugLine="Private PswTXT As String";
_pswtxt = "";
RDebugUtils.currentLine=88997911;
 //BA.debugLineNum = 88997911;BA.debugLine="Private TokenWebTXT As String";
_tokenwebtxt = "";
RDebugUtils.currentLine=88997914;
 //BA.debugLineNum = 88997914;BA.debugLine="Public CallbackInfoEnvio As Object";
_callbackinfoenvio = new Object();
RDebugUtils.currentLine=88997916;
 //BA.debugLineNum = 88997916;BA.debugLine="Private jamTableViewInfoTrackingEnvio As jamTable";
_jamtableviewinfotrackingenvio = new b4j.docU.jamtableview();
RDebugUtils.currentLine=88997917;
 //BA.debugLineNum = 88997917;BA.debugLine="Private txtRef As TextField";
_txtref = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997918;
 //BA.debugLineNum = 88997918;BA.debugLine="Private txtFecha As TextField";
_txtfecha = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997919;
 //BA.debugLineNum = 88997919;BA.debugLine="Private txtDirRte As TextField";
_txtdirrte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997920;
 //BA.debugLineNum = 88997920;BA.debugLine="Private txtPobRte As TextField";
_txtpobrte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997921;
 //BA.debugLineNum = 88997921;BA.debugLine="Private txtCodPosNacRte As TextField";
_txtcodposnacrte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997922;
 //BA.debugLineNum = 88997922;BA.debugLine="Private txtNomDest As TextField";
_txtnomdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997923;
 //BA.debugLineNum = 88997923;BA.debugLine="Private txtDirDest As TextField";
_txtdirdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997924;
 //BA.debugLineNum = 88997924;BA.debugLine="Private txtPobDest As TextField";
_txtpobdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997925;
 //BA.debugLineNum = 88997925;BA.debugLine="Private txtCodPosNacDest As TextField";
_txtcodposnacdest = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997926;
 //BA.debugLineNum = 88997926;BA.debugLine="Private txtNumBultos As TextField";
_txtnumbultos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997927;
 //BA.debugLineNum = 88997927;BA.debugLine="Private txtKilos As TextField";
_txtkilos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997928;
 //BA.debugLineNum = 88997928;BA.debugLine="Private txtVolumen As TextField";
_txtvolumen = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997929;
 //BA.debugLineNum = 88997929;BA.debugLine="Private txtCodIncEstado As TextField";
_txtcodincestado = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997930;
 //BA.debugLineNum = 88997930;BA.debugLine="Private txtDescIncEstado As TextField";
_txtdescincestado = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=88997931;
 //BA.debugLineNum = 88997931;BA.debugLine="Private btnAlbaranNAV As Button";
_btnalbarannav = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=88997933;
 //BA.debugLineNum = 88997933;BA.debugLine="Type TipoDatosExpedicionXT(CODEMPRESA As String,";
;
RDebugUtils.currentLine=88997941;
 //BA.debugLineNum = 88997941;BA.debugLine="Private mDatosExpedicionTXTSeleccionada As TipoDa";
_mdatosexpediciontxtseleccionada = new b4j.docU.cinfoexpediciontxt._tipodatosexpedicionxt();
RDebugUtils.currentLine=88997943;
 //BA.debugLineNum = 88997943;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.cinfoexpediciontxt __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _numexpedicion) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cinfoexpediciontxt";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_numexpedicion}));}
RDebugUtils.currentLine=89063424;
 //BA.debugLineNum = 89063424;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=89063425;
 //BA.debugLineNum = 89063425;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=89063426;
 //BA.debugLineNum = 89063426;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=89063427;
 //BA.debugLineNum = 89063427;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=89063428;
 //BA.debugLineNum = 89063428;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=89063429;
 //BA.debugLineNum = 89063429;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=89063430;
 //BA.debugLineNum = 89063430;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=89063432;
 //BA.debugLineNum = 89063432;BA.debugLine="mNumeroExpedicion=NumExpedicion";
__ref._mnumeroexpedicion /*String*/  = _numexpedicion;
RDebugUtils.currentLine=89063438;
 //BA.debugLineNum = 89063438;BA.debugLine="End Sub";
return "";
}
}