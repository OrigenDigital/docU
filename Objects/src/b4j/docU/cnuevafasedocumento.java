package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cnuevafasedocumento extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cnuevafasedocumento", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cnuevafasedocumento.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _nuevafasedocumento{
public boolean IsInitialized;
public long FechaFase;
public int IDFase;
public int IDRespFase;
public int IDInfoAdicionalFase;
public int IDRespFaseDest;
public int IDInfoAdicionalFaseDest;
public int IDFaseDest;
public String NumExpFaseActual;
public String NumExpFaseAdicional;
public String ObsFaseActual;
public void Initialize() {
IsInitialized = true;
FechaFase = 0L;
IDFase = 0;
IDRespFase = 0;
IDInfoAdicionalFase = 0;
IDRespFaseDest = 0;
IDInfoAdicionalFaseDest = 0;
IDFaseDest = 0;
NumExpFaseActual = "";
NumExpFaseAdicional = "";
ObsFaseActual = "";
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
public b4j.docU.cnuevafasedocumento._nuevafasedocumento _mnuevafasedocumento = null;
public boolean _mdestinatariotaller = false;
public String _mordenfab = "";
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _mdocumentosel = "";
public String _mtipodocumento = "";
public anywheresoftware.b4j.objects.ButtonWrapper _btncancelargrabarnuevafase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btngrabarnuevafase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnseldocumento = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechanuevafase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselinfoadicionaldoc = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselinfoadicionaldocnuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselnuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselnuevafase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselresponsablenuevafase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselresponsablenuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkfijarfechanuevafase = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkfijarnuevafase = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitledocumento = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlefechanuevafase = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleinfoadicionaldoc = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlenuevafase = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleresponsablenuevafase = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleresponsablenuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechanuevafase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinfoadicionaldoc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnuevafase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtresponsablenuevafase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtresponsablenuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlenuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleinfoadicionalnuevafasedestinopreparacion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinfoadicionalnuevafasedestinopreparacion = null;
public String _datosseleccionados = "";
public String _sourcetablecls = "";
public String _stringsourcetablecls = "";
public String _tipoqrycls = "";
public int _iddatoscls = 0;
public String _obstmp = "";
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlnuevafasecomplementaria = null;
public boolean _nuevafasedocumentoregistrada = false;
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
public String  _initialize(b4j.docU.cnuevafasedocumento __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _documento,String _tipodocumento,boolean _destinatariotaller,String _ordenfab) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_documento,_tipodocumento,_destinatariotaller,_ordenfab}));}
RDebugUtils.currentLine=95879168;
 //BA.debugLineNum = 95879168;BA.debugLine="Public Sub Initialize(CallBack As Object, Parent A";
RDebugUtils.currentLine=95879169;
 //BA.debugLineNum = 95879169;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=95879170;
 //BA.debugLineNum = 95879170;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=95879171;
 //BA.debugLineNum = 95879171;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=95879172;
 //BA.debugLineNum = 95879172;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=95879173;
 //BA.debugLineNum = 95879173;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=95879174;
 //BA.debugLineNum = 95879174;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=95879177;
 //BA.debugLineNum = 95879177;BA.debugLine="mDocumentoSel=Documento";
__ref._mdocumentosel /*String*/  = _documento;
RDebugUtils.currentLine=95879178;
 //BA.debugLineNum = 95879178;BA.debugLine="mTipoDocumento=TipoDocumento";
__ref._mtipodocumento /*String*/  = _tipodocumento;
RDebugUtils.currentLine=95879179;
 //BA.debugLineNum = 95879179;BA.debugLine="mDestinatarioTaller=DestinatarioTaller";
__ref._mdestinatariotaller /*boolean*/  = _destinatariotaller;
RDebugUtils.currentLine=95879180;
 //BA.debugLineNum = 95879180;BA.debugLine="mOrdenFab=OrdenFab";
__ref._mordenfab /*String*/  = _ordenfab;
RDebugUtils.currentLine=95879182;
 //BA.debugLineNum = 95879182;BA.debugLine="If mSQL.IsInitialized Then mSQL.close";
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();};
RDebugUtils.currentLine=95879184;
 //BA.debugLineNum = 95879184;BA.debugLine="mNuevaFaseDocumento.Initialize";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .Initialize();
RDebugUtils.currentLine=95879185;
 //BA.debugLineNum = 95879185;BA.debugLine="NuevaFaseDocumentoRegistrada=False";
__ref._nuevafasedocumentoregistrada /*boolean*/  = __c.False;
RDebugUtils.currentLine=95879186;
 //BA.debugLineNum = 95879186;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=96206849;
 //BA.debugLineNum = 96206849;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen*0.7, Main.yscre";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ *0.7,parent._main._yscreen /*int*/ *0.6);
RDebugUtils.currentLine=96206853;
 //BA.debugLineNum = 96206853;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=96206854;
 //BA.debugLineNum = 96206854;BA.debugLine="frm.RootPane.LoadLayout(\"scrNuevaFaseDocumento\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrNuevaFaseDocumento");
RDebugUtils.currentLine=96206855;
 //BA.debugLineNum = 96206855;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=96206857;
 //BA.debugLineNum = 96206857;BA.debugLine="If mSQL.IsInitialized Then mSQL.close";
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
RDebugUtils.currentLine=96206858;
 //BA.debugLineNum = 96206858;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=96206859;
 //BA.debugLineNum = 96206859;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=96206862;
 //BA.debugLineNum = 96206862;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Nueva Fase Do";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Nueva Fase Documento");
RDebugUtils.currentLine=96206864;
 //BA.debugLineNum = 96206864;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=96206868;
 //BA.debugLineNum = 96206868;BA.debugLine="ResetNuevaFase(True)";
__ref._resetnuevafase /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=96206870;
 //BA.debugLineNum = 96206870;BA.debugLine="ResetNuevaFaseAdicional";
__ref._resetnuevafaseadicional /*String*/ (null);
RDebugUtils.currentLine=96206872;
 //BA.debugLineNum = 96206872;BA.debugLine="FaseAdicionalVisible(False)";
__ref._faseadicionalvisible /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=96206874;
 //BA.debugLineNum = 96206874;BA.debugLine="txtDocumento.Text=mDocumentoSel";
__ref._txtdocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._mdocumentosel /*String*/ );
RDebugUtils.currentLine=96206876;
 //BA.debugLineNum = 96206876;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=96206878;
 //BA.debugLineNum = 96206878;BA.debugLine="Wait For(ActualizarFases) complete (sResp As Stri";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "show"), __ref._actualizarfases /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 12;
return;
case 12:
//C
this.state = 7;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=96206879;
 //BA.debugLineNum = 96206879;BA.debugLine="If sResp<>\"OK\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_sresp).equals("OK") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=96206880;
 //BA.debugLineNum = 96206880;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=96206881;
 //BA.debugLineNum = 96206881;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=96206884;
 //BA.debugLineNum = 96206884;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _actualizardatosopcionseleccionada(b4j.docU.cnuevafasedocumento __ref,int _id,String _textoopcionseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "actualizardatosopcionseleccionada", false))
	 {return ((String) Debug.delegate(ba, "actualizardatosopcionseleccionada", new Object[] {_id,_textoopcionseleccionada}));}
boolean _responsablenuevafasevisible = false;
boolean _infoadicionalnuevafasevisible = false;
boolean _responsablefasedestinopreparacionvisible = false;
boolean _infoadicionaldestinopreparacionvisible = false;
RDebugUtils.currentLine=96927744;
 //BA.debugLineNum = 96927744;BA.debugLine="Sub ActualizarDatosOpcionSeleccionada(ID As Int, T";
RDebugUtils.currentLine=96927745;
 //BA.debugLineNum = 96927745;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(__ref._datosseleccionados /*String*/ ).equals("NuevaFase"),(__ref._datosseleccionados /*String*/ ).equals("ResponsableNuevaFase"),(__ref._datosseleccionados /*String*/ ).equals("InfoAdicionalNuevaFase"),(__ref._datosseleccionados /*String*/ ).equals("NuevaFaseAdicional"),(__ref._datosseleccionados /*String*/ ).equals("ResponsableFaseAdicional"),(__ref._datosseleccionados /*String*/ ).equals("InfoAdicionalFaseAdicional"))) {
case 0: {
RDebugUtils.currentLine=96927747;
 //BA.debugLineNum = 96927747;BA.debugLine="If ID>0 Then";
if (_id>0) { 
RDebugUtils.currentLine=96927748;
 //BA.debugLineNum = 96927748;BA.debugLine="ResetNuevaFase(False)";
__ref._resetnuevafase /*String*/ (null,__c.False);
RDebugUtils.currentLine=96927749;
 //BA.debugLineNum = 96927749;BA.debugLine="mNuevaFaseDocumento.IDFase=ID";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/  = _id;
RDebugUtils.currentLine=96927750;
 //BA.debugLineNum = 96927750;BA.debugLine="txtNuevaFase.Text=TextoOpcionSeleccionada";
__ref._txtnuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_textoopcionseleccionada);
RDebugUtils.currentLine=96927751;
 //BA.debugLineNum = 96927751;BA.debugLine="Dim ResponsableNuevaFaseVisible As Boolean";
_responsablenuevafasevisible = false;
RDebugUtils.currentLine=96927752;
 //BA.debugLineNum = 96927752;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboResp";
if ((__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=96927753;
 //BA.debugLineNum = 96927753;BA.debugLine="ResponsableNuevaFaseVisible =False";
_responsablenuevafasevisible = __c.False;
 }else {
RDebugUtils.currentLine=96927755;
 //BA.debugLineNum = 96927755;BA.debugLine="ResponsableNuevaFaseVisible=True";
_responsablenuevafasevisible = __c.True;
 };
RDebugUtils.currentLine=96927757;
 //BA.debugLineNum = 96927757;BA.debugLine="lblTitleResponsableNuevaFase.Visible=Responsab";
__ref._lbltitleresponsablenuevafase /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(_responsablenuevafasevisible);
RDebugUtils.currentLine=96927758;
 //BA.debugLineNum = 96927758;BA.debugLine="txtResponsableNuevaFase.Visible = ResponsableN";
__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_responsablenuevafasevisible);
RDebugUtils.currentLine=96927759;
 //BA.debugLineNum = 96927759;BA.debugLine="btnSelResponsableNuevaFase.Visible = Responsab";
__ref._btnselresponsablenuevafase /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(_responsablenuevafasevisible);
RDebugUtils.currentLine=96927761;
 //BA.debugLineNum = 96927761;BA.debugLine="If ResponsableNuevaFaseVisible Then";
if (_responsablenuevafasevisible) { 
RDebugUtils.currentLine=96927762;
 //BA.debugLineNum = 96927762;BA.debugLine="lblTitleResponsableNuevaFase.Text=mSQL.ExecQu";
__ref._lbltitleresponsablenuevafase /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=?  and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ })));
 }else {
RDebugUtils.currentLine=96927766;
 //BA.debugLineNum = 96927766;BA.debugLine="lblTitleResponsableNuevaFase.Text=\"\"";
__ref._lbltitleresponsablenuevafase /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("");
 };
RDebugUtils.currentLine=96927769;
 //BA.debugLineNum = 96927769;BA.debugLine="Dim InfoAdicionalNuevaFaseVisible As Boolea";
_infoadicionalnuevafasevisible = false;
RDebugUtils.currentLine=96927770;
 //BA.debugLineNum = 96927770;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboInfo";
if ((double)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }))))+(double)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }))))==0) { 
RDebugUtils.currentLine=96927771;
 //BA.debugLineNum = 96927771;BA.debugLine="InfoAdicionalNuevaFaseVisible=False";
_infoadicionalnuevafasevisible = __c.False;
 }else {
RDebugUtils.currentLine=96927773;
 //BA.debugLineNum = 96927773;BA.debugLine="InfoAdicionalNuevaFaseVisible=True";
_infoadicionalnuevafasevisible = __c.True;
 };
RDebugUtils.currentLine=96927775;
 //BA.debugLineNum = 96927775;BA.debugLine="If InfoAdicionalNuevaFaseVisible=False Then";
if (_infoadicionalnuevafasevisible==__c.False) { 
RDebugUtils.currentLine=96927776;
 //BA.debugLineNum = 96927776;BA.debugLine="lblTitleInfoAdicionalDoc.Visible =False";
__ref._lbltitleinfoadicionaldoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96927777;
 //BA.debugLineNum = 96927777;BA.debugLine="txtInfoAdicionalDoc.Visible=False";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96927778;
 //BA.debugLineNum = 96927778;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96927779;
 //BA.debugLineNum = 96927779;BA.debugLine="btnSelInfoAdicionalDoc.Visible=False";
__ref._btnselinfoadicionaldoc /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=96927781;
 //BA.debugLineNum = 96927781;BA.debugLine="lblTitleInfoAdicionalDoc.text = mSQL.ExecQuer";
__ref._lbltitleinfoadicionaldoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ })));
RDebugUtils.currentLine=96927782;
 //BA.debugLineNum = 96927782;BA.debugLine="lblTitleInfoAdicionalDoc.Visible =True";
__ref._lbltitleinfoadicionaldoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96927784;
 //BA.debugLineNum = 96927784;BA.debugLine="txtInfoAdicionalDoc.Visible=True";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96927785;
 //BA.debugLineNum = 96927785;BA.debugLine="txtInfoAdicionalDoc.text=\"\"";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96927786;
 //BA.debugLineNum = 96927786;BA.debugLine="btnSelInfoAdicionalDoc.Visible=True";
__ref._btnselinfoadicionaldoc /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=96927789;
 //BA.debugLineNum = 96927789;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
 }else {
RDebugUtils.currentLine=96927798;
 //BA.debugLineNum = 96927798;BA.debugLine="ResetNuevaFase(False)";
__ref._resetnuevafase /*String*/ (null,__c.False);
 };
 break; }
case 1: {
RDebugUtils.currentLine=96927805;
 //BA.debugLineNum = 96927805;BA.debugLine="mNuevaFaseDocumento.IDRespFase=ID";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/  = _id;
RDebugUtils.currentLine=96927806;
 //BA.debugLineNum = 96927806;BA.debugLine="txtResponsableNuevaFase.Text=TextoOpcionSelecci";
__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_textoopcionseleccionada);
RDebugUtils.currentLine=96927807;
 //BA.debugLineNum = 96927807;BA.debugLine="If mNuevaFaseDocumento.IDFase=15 And mNuevaFase";
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ==15 && __ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ !=0) { 
RDebugUtils.currentLine=96927808;
 //BA.debugLineNum = 96927808;BA.debugLine="pnlNuevaFaseComplementaria.Visible=True";
__ref._pnlnuevafasecomplementaria /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=96927811;
 //BA.debugLineNum = 96927811;BA.debugLine="pnlNuevaFaseComplementaria.Visible=False";
__ref._pnlnuevafasecomplementaria /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(__c.False);
 };
 break; }
case 2: {
RDebugUtils.currentLine=96927818;
 //BA.debugLineNum = 96927818;BA.debugLine="mNuevaFaseDocumento.IDInfoAdicionalFase=ID";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/  = _id;
RDebugUtils.currentLine=96927819;
 //BA.debugLineNum = 96927819;BA.debugLine="txtInfoAdicionalDoc.Text=TextoOpcionSeleccionad";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_textoopcionseleccionada);
 break; }
case 3: {
RDebugUtils.currentLine=96927822;
 //BA.debugLineNum = 96927822;BA.debugLine="If ID>0 Then";
if (_id>0) { 
RDebugUtils.currentLine=96927823;
 //BA.debugLineNum = 96927823;BA.debugLine="ResetNuevaFaseAdicional";
__ref._resetnuevafaseadicional /*String*/ (null);
RDebugUtils.currentLine=96927827;
 //BA.debugLineNum = 96927827;BA.debugLine="mNuevaFaseDocumento.IDFaseDest=ID";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/  = _id;
RDebugUtils.currentLine=96927828;
 //BA.debugLineNum = 96927828;BA.debugLine="txtNuevaFaseDestinoPreparacion.Text=TextoOpcio";
__ref._txtnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_textoopcionseleccionada);
RDebugUtils.currentLine=96927829;
 //BA.debugLineNum = 96927829;BA.debugLine="Dim ResponsableFaseDestinoPreparacionVisible A";
_responsablefasedestinopreparacionvisible = false;
RDebugUtils.currentLine=96927830;
 //BA.debugLineNum = 96927830;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboResp";
if ((__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select cboResponsableVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=96927831;
 //BA.debugLineNum = 96927831;BA.debugLine="ResponsableFaseDestinoPreparacionVisible =Fal";
_responsablefasedestinopreparacionvisible = __c.False;
 }else {
RDebugUtils.currentLine=96927833;
 //BA.debugLineNum = 96927833;BA.debugLine="ResponsableFaseDestinoPreparacionVisible =Tru";
_responsablefasedestinopreparacionvisible = __c.True;
 };
RDebugUtils.currentLine=96927835;
 //BA.debugLineNum = 96927835;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacion";
__ref._lbltitleresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(_responsablefasedestinopreparacionvisible);
RDebugUtils.currentLine=96927836;
 //BA.debugLineNum = 96927836;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Visi";
__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_responsablefasedestinopreparacionvisible);
RDebugUtils.currentLine=96927837;
 //BA.debugLineNum = 96927837;BA.debugLine="btnSelResponsableNuevaFaseDestinoPreparacion.V";
__ref._btnselresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(_responsablefasedestinopreparacionvisible);
RDebugUtils.currentLine=96927839;
 //BA.debugLineNum = 96927839;BA.debugLine="If ResponsableFaseDestinoPreparacionVisible Th";
if (_responsablefasedestinopreparacionvisible) { 
RDebugUtils.currentLine=96927840;
 //BA.debugLineNum = 96927840;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacio";
__ref._lbltitleresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select TextoEtiquetaResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ })));
 }else {
 };
RDebugUtils.currentLine=96927847;
 //BA.debugLineNum = 96927847;BA.debugLine="Dim InfoAdicionalDestinoPreparacionVisible As";
_infoadicionaldestinopreparacionvisible = false;
RDebugUtils.currentLine=96927848;
 //BA.debugLineNum = 96927848;BA.debugLine="If mSQL.ExecQuerySingleResult2(\"select cboInfo";
if ((double)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }))))+(double)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }))))==0) { 
RDebugUtils.currentLine=96927849;
 //BA.debugLineNum = 96927849;BA.debugLine="InfoAdicionalDestinoPreparacionVisible=False";
_infoadicionaldestinopreparacionvisible = __c.False;
 }else {
RDebugUtils.currentLine=96927851;
 //BA.debugLineNum = 96927851;BA.debugLine="InfoAdicionalDestinoPreparacionVisible=True";
_infoadicionaldestinopreparacionvisible = __c.True;
 };
RDebugUtils.currentLine=96927853;
 //BA.debugLineNum = 96927853;BA.debugLine="If InfoAdicionalDestinoPreparacionVisible=Fals";
if (_infoadicionaldestinopreparacionvisible==__c.False) { 
RDebugUtils.currentLine=96927854;
 //BA.debugLineNum = 96927854;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparac";
__ref._lbltitleinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96927855;
 //BA.debugLineNum = 96927855;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.V";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96927856;
 //BA.debugLineNum = 96927856;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPrepara";
__ref._btnselinfoadicionaldocnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
 }else {
RDebugUtils.currentLine=96927858;
 //BA.debugLineNum = 96927858;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparac";
__ref._lbltitleinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select TextoEtiquetaInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ })));
RDebugUtils.currentLine=96927859;
 //BA.debugLineNum = 96927859;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparac";
__ref._lbltitleinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96927861;
 //BA.debugLineNum = 96927861;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.V";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96927862;
 //BA.debugLineNum = 96927862;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPrepara";
__ref._btnselinfoadicionaldocnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=96927867;
 //BA.debugLineNum = 96927867;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Te";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
 }else {
RDebugUtils.currentLine=96927876;
 //BA.debugLineNum = 96927876;BA.debugLine="ResetNuevaFaseAdicional";
__ref._resetnuevafaseadicional /*String*/ (null);
 };
 break; }
case 4: {
RDebugUtils.currentLine=96927883;
 //BA.debugLineNum = 96927883;BA.debugLine="mNuevaFaseDocumento.IDRespFaseDest=ID";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/  = _id;
RDebugUtils.currentLine=96927884;
 //BA.debugLineNum = 96927884;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Text=";
__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_textoopcionseleccionada);
 break; }
case 5: {
RDebugUtils.currentLine=96927890;
 //BA.debugLineNum = 96927890;BA.debugLine="mNuevaFaseDocumento.IDInfoAdicionalFaseDest=ID";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFaseDest /*int*/  = _id;
RDebugUtils.currentLine=96927891;
 //BA.debugLineNum = 96927891;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Tex";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_textoopcionseleccionada);
 break; }
}
;
RDebugUtils.currentLine=96927895;
 //BA.debugLineNum = 96927895;BA.debugLine="End Sub";
return "";
}
public String  _resetnuevafase(b4j.docU.cnuevafasedocumento __ref,boolean _resetfechafase) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "resetnuevafase", false))
	 {return ((String) Debug.delegate(ba, "resetnuevafase", new Object[] {_resetfechafase}));}
long _fechaactualfase = 0L;
String _dateformatant = "";
RDebugUtils.currentLine=96665600;
 //BA.debugLineNum = 96665600;BA.debugLine="Sub ResetNuevaFase(ResetFechaFase As Boolean)";
RDebugUtils.currentLine=96665602;
 //BA.debugLineNum = 96665602;BA.debugLine="Dim FechaActualFase As Long=mNuevaFaseDocumento.F";
_fechaactualfase = __ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ ;
RDebugUtils.currentLine=96665603;
 //BA.debugLineNum = 96665603;BA.debugLine="mNuevaFaseDocumento.Initialize";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .Initialize();
RDebugUtils.currentLine=96665605;
 //BA.debugLineNum = 96665605;BA.debugLine="If ResetFechaFase Then";
if (_resetfechafase) { 
RDebugUtils.currentLine=96665606;
 //BA.debugLineNum = 96665606;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=96665607;
 //BA.debugLineNum = 96665607;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=96665608;
 //BA.debugLineNum = 96665608;BA.debugLine="txtFechaNuevaFase.Text=DateTime.Date(DateTime.No";
__ref._txtfechanuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(__c.DateTime.getNow()));
RDebugUtils.currentLine=96665609;
 //BA.debugLineNum = 96665609;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=96665610;
 //BA.debugLineNum = 96665610;BA.debugLine="mNuevaFaseDocumento.FechaFase=DateTime.Now";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/  = __c.DateTime.getNow();
 }else {
RDebugUtils.currentLine=96665612;
 //BA.debugLineNum = 96665612;BA.debugLine="mNuevaFaseDocumento.FechaFase=FechaActualFase";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/  = _fechaactualfase;
 };
RDebugUtils.currentLine=96665622;
 //BA.debugLineNum = 96665622;BA.debugLine="txtNuevaFase.Visible=True";
__ref._txtnuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96665623;
 //BA.debugLineNum = 96665623;BA.debugLine="btnSelNuevaFase.Visible=True";
__ref._btnselnuevafase /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96665624;
 //BA.debugLineNum = 96665624;BA.debugLine="txtNuevaFase.Text=\"\"";
__ref._txtnuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96665625;
 //BA.debugLineNum = 96665625;BA.debugLine="lblTitleResponsableNuevaFase.Visible=False";
__ref._lbltitleresponsablenuevafase /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665626;
 //BA.debugLineNum = 96665626;BA.debugLine="txtResponsableNuevaFase.Visible=False";
__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665627;
 //BA.debugLineNum = 96665627;BA.debugLine="txtResponsableNuevaFase.text=\"\"";
__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96665628;
 //BA.debugLineNum = 96665628;BA.debugLine="btnSelResponsableNuevaFase.Visible=False";
__ref._btnselresponsablenuevafase /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665629;
 //BA.debugLineNum = 96665629;BA.debugLine="lblTitleInfoAdicionalDoc.Visible=False";
__ref._lbltitleinfoadicionaldoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665630;
 //BA.debugLineNum = 96665630;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96665631;
 //BA.debugLineNum = 96665631;BA.debugLine="txtInfoAdicionalDoc.visible=False";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665632;
 //BA.debugLineNum = 96665632;BA.debugLine="btnSelInfoAdicionalDoc.Visible=False";
__ref._btnselinfoadicionaldoc /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665634;
 //BA.debugLineNum = 96665634;BA.debugLine="lblTitleNuevaFaseDestinoPreparacion.Visible=True";
__ref._lbltitlenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96665635;
 //BA.debugLineNum = 96665635;BA.debugLine="btnSelNuevaFaseDestinoPreparacion.Visible=True";
__ref._btnselnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96665636;
 //BA.debugLineNum = 96665636;BA.debugLine="txtNuevaFaseDestinoPreparacion.Text=\"\"";
__ref._txtnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96665637;
 //BA.debugLineNum = 96665637;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacion.Vi";
__ref._lbltitleresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665638;
 //BA.debugLineNum = 96665638;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Visible";
__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665639;
 //BA.debugLineNum = 96665639;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.text=\"\"";
__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96665640;
 //BA.debugLineNum = 96665640;BA.debugLine="btnSelResponsableNuevaFaseDestinoPreparacion.Visi";
__ref._btnselresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665641;
 //BA.debugLineNum = 96665641;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.";
__ref._lbltitleinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665642;
 //BA.debugLineNum = 96665642;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Visib";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665643;
 //BA.debugLineNum = 96665643;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96665644;
 //BA.debugLineNum = 96665644;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion";
__ref._btnselinfoadicionaldocnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665655;
 //BA.debugLineNum = 96665655;BA.debugLine="pnlNuevaFaseComplementaria.Visible=False";
__ref._pnlnuevafasecomplementaria /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96665656;
 //BA.debugLineNum = 96665656;BA.debugLine="End Sub";
return "";
}
public String  _resetnuevafaseadicional(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "resetnuevafaseadicional", false))
	 {return ((String) Debug.delegate(ba, "resetnuevafaseadicional", null));}
RDebugUtils.currentLine=96731136;
 //BA.debugLineNum = 96731136;BA.debugLine="Sub ResetNuevaFaseAdicional";
RDebugUtils.currentLine=96731137;
 //BA.debugLineNum = 96731137;BA.debugLine="mNuevaFaseDocumento.IDRespFaseDest=0";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/  = (int) (0);
RDebugUtils.currentLine=96731138;
 //BA.debugLineNum = 96731138;BA.debugLine="mNuevaFaseDocumento.IDInfoAdicionalFaseDest=0";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFaseDest /*int*/  = (int) (0);
RDebugUtils.currentLine=96731139;
 //BA.debugLineNum = 96731139;BA.debugLine="mNuevaFaseDocumento.NumExpFaseAdicional=\"\"";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseAdicional /*String*/  = "";
RDebugUtils.currentLine=96731140;
 //BA.debugLineNum = 96731140;BA.debugLine="mNuevaFaseDocumento.IDFaseDest=0";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/  = (int) (0);
RDebugUtils.currentLine=96731142;
 //BA.debugLineNum = 96731142;BA.debugLine="lblTitleNuevaFaseDestinoPreparacion.Visible=True";
__ref._lbltitlenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96731143;
 //BA.debugLineNum = 96731143;BA.debugLine="btnSelNuevaFaseDestinoPreparacion.Visible=True";
__ref._btnselnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=96731144;
 //BA.debugLineNum = 96731144;BA.debugLine="txtNuevaFaseDestinoPreparacion.Text=\"\"";
__ref._txtnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96731145;
 //BA.debugLineNum = 96731145;BA.debugLine="lblTitleResponsableNuevaFaseDestinoPreparacion.Vi";
__ref._lbltitleresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96731146;
 //BA.debugLineNum = 96731146;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.Visible";
__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96731147;
 //BA.debugLineNum = 96731147;BA.debugLine="txtResponsableNuevaFaseDestinoPreparacion.text=\"\"";
__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96731148;
 //BA.debugLineNum = 96731148;BA.debugLine="btnSelResponsableNuevaFaseDestinoPreparacion.Visi";
__ref._btnselresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96731149;
 //BA.debugLineNum = 96731149;BA.debugLine="lblTitleInfoAdicionalNuevaFaseDestinoPreparacion.";
__ref._lbltitleinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96731150;
 //BA.debugLineNum = 96731150;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Visib";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96731151;
 //BA.debugLineNum = 96731151;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Text=";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=96731152;
 //BA.debugLineNum = 96731152;BA.debugLine="btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion";
__ref._btnselinfoadicionaldocnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=96731155;
 //BA.debugLineNum = 96731155;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarfases(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "actualizarfases", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarfases", null));}
ResumableSub_ActualizarFases rsub = new ResumableSub_ActualizarFases(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarFases extends BA.ResumableSub {
public ResumableSub_ActualizarFases(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=96337922;
 //BA.debugLineNum = 96337922;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblFasesDoc\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblFasesDoc");
RDebugUtils.currentLine=96337923;
 //BA.debugLineNum = 96337923;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=96337926;
 //BA.debugLineNum = 96337926;BA.debugLine="Dim Comando As String=\"FasesDocumentos\"";
_comando = "FasesDocumentos";
RDebugUtils.currentLine=96337927;
 //BA.debugLineNum = 96337927;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=96337929;
 //BA.debugLineNum = 96337929;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizarfases"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=96337931;
 //BA.debugLineNum = 96337931;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=96337932;
 //BA.debugLineNum = 96337932;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=96337933;
 //BA.debugLineNum = 96337933;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizarfases"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=96337934;
 //BA.debugLineNum = 96337934;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=96337938;
 //BA.debugLineNum = 96337938;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=96337939;
 //BA.debugLineNum = 96337939;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=96337941;
 //BA.debugLineNum = 96337941;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Fases de Documentos","Aviso");
RDebugUtils.currentLine=96337942;
 //BA.debugLineNum = 96337942;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizarfases"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=96337944;
 //BA.debugLineNum = 96337944;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=96337945;
 //BA.debugLineNum = 96337945;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=96337946;
 //BA.debugLineNum = 96337946;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblFasesDoc\",lstReg)";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblFasesDoc",_lstreg);
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
RDebugUtils.currentLine=96337949;
 //BA.debugLineNum = 96337949;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=96337950;
 //BA.debugLineNum = 96337950;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizartipificacioninfoadicionalfases(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "actualizartipificacioninfoadicionalfases", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizartipificacioninfoadicionalfases", null));}
ResumableSub_ActualizarTipificacionInfoAdicionalFases rsub = new ResumableSub_ActualizarTipificacionInfoAdicionalFases(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarTipificacionInfoAdicionalFases extends BA.ResumableSub {
public ResumableSub_ActualizarTipificacionInfoAdicionalFases(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98238466;
 //BA.debugLineNum = 98238466;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblTipificacionInf";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblTipificacionInfoAdicionalFases");
RDebugUtils.currentLine=98238467;
 //BA.debugLineNum = 98238467;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=98238470;
 //BA.debugLineNum = 98238470;BA.debugLine="Dim Comando As String=\"TipificacionInfoAdicionalF";
_comando = "TipificacionInfoAdicionalFases";
RDebugUtils.currentLine=98238471;
 //BA.debugLineNum = 98238471;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=98238473;
 //BA.debugLineNum = 98238473;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizartipificacioninfoadicionalfases"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=98238475;
 //BA.debugLineNum = 98238475;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=98238476;
 //BA.debugLineNum = 98238476;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=98238477;
 //BA.debugLineNum = 98238477;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizartipificacioninfoadicionalfases"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=98238478;
 //BA.debugLineNum = 98238478;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=98238480;
 //BA.debugLineNum = 98238480;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=98238481;
 //BA.debugLineNum = 98238481;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=98238482;
 //BA.debugLineNum = 98238482;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Tipificacion Info Adicional Fases","Aviso");
RDebugUtils.currentLine=98238483;
 //BA.debugLineNum = 98238483;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizartipificacioninfoadicionalfases"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=98238485;
 //BA.debugLineNum = 98238485;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=98238486;
 //BA.debugLineNum = 98238486;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=98238487;
 //BA.debugLineNum = 98238487;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblTipificacionInfoAdi";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblTipificacionInfoAdicionalFases",_lstreg);
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
RDebugUtils.currentLine=98238490;
 //BA.debugLineNum = 98238490;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=98238491;
 //BA.debugLineNum = 98238491;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizartransportes(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "actualizartransportes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizartransportes", null));}
ResumableSub_ActualizarTransportes rsub = new ResumableSub_ActualizarTransportes(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarTransportes extends BA.ResumableSub {
public ResumableSub_ActualizarTransportes(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98107394;
 //BA.debugLineNum = 98107394;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblTransporte\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblTransporte");
RDebugUtils.currentLine=98107395;
 //BA.debugLineNum = 98107395;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=98107398;
 //BA.debugLineNum = 98107398;BA.debugLine="Dim Comando As String=\"Transportes\"";
_comando = "Transportes";
RDebugUtils.currentLine=98107399;
 //BA.debugLineNum = 98107399;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=98107401;
 //BA.debugLineNum = 98107401;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizartransportes"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=98107403;
 //BA.debugLineNum = 98107403;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=98107404;
 //BA.debugLineNum = 98107404;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=98107405;
 //BA.debugLineNum = 98107405;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizartransportes"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=98107406;
 //BA.debugLineNum = 98107406;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=98107408;
 //BA.debugLineNum = 98107408;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=98107409;
 //BA.debugLineNum = 98107409;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=98107410;
 //BA.debugLineNum = 98107410;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de transportes","Aviso");
RDebugUtils.currentLine=98107411;
 //BA.debugLineNum = 98107411;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizartransportes"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=98107413;
 //BA.debugLineNum = 98107413;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=98107414;
 //BA.debugLineNum = 98107414;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=98107415;
 //BA.debugLineNum = 98107415;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblTransporte\",lstReg)";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblTransporte",_lstreg);
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
RDebugUtils.currentLine=98107418;
 //BA.debugLineNum = 98107418;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=98107419;
 //BA.debugLineNum = 98107419;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarvwempleadosactivos(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "actualizarvwempleadosactivos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarvwempleadosactivos", null));}
ResumableSub_Actualizarvwempleadosactivos rsub = new ResumableSub_Actualizarvwempleadosactivos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Actualizarvwempleadosactivos extends BA.ResumableSub {
public ResumableSub_Actualizarvwempleadosactivos(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98369538;
 //BA.debugLineNum = 98369538;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from vwempleadosactivos";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from vwempleadosactivos");
RDebugUtils.currentLine=98369539;
 //BA.debugLineNum = 98369539;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=98369542;
 //BA.debugLineNum = 98369542;BA.debugLine="Dim Comando As String=\"vwempleadosactivos\"";
_comando = "vwempleadosactivos";
RDebugUtils.currentLine=98369543;
 //BA.debugLineNum = 98369543;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=98369545;
 //BA.debugLineNum = 98369545;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizarvwempleadosactivos"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=98369547;
 //BA.debugLineNum = 98369547;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=98369548;
 //BA.debugLineNum = 98369548;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=98369549;
 //BA.debugLineNum = 98369549;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizarvwempleadosactivos"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=98369550;
 //BA.debugLineNum = 98369550;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=98369552;
 //BA.debugLineNum = 98369552;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=98369553;
 //BA.debugLineNum = 98369553;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=98369554;
 //BA.debugLineNum = 98369554;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de empleados activos","Aviso");
RDebugUtils.currentLine=98369555;
 //BA.debugLineNum = 98369555;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "actualizarvwempleadosactivos"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=98369557;
 //BA.debugLineNum = 98369557;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=98369558;
 //BA.debugLineNum = 98369558;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=98369559;
 //BA.debugLineNum = 98369559;BA.debugLine="DBUtils.InsertMaps(mSQL,\"vwempleadosactivos\",ls";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"vwempleadosactivos",_lstreg);
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
RDebugUtils.currentLine=98369562;
 //BA.debugLineNum = 98369562;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=98369563;
 //BA.debugLineNum = 98369563;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _background_mouseclicked(b4j.docU.cnuevafasedocumento __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=95944704;
 //BA.debugLineNum = 95944704;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=95944705;
 //BA.debugLineNum = 95944705;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=95944706;
 //BA.debugLineNum = 95944706;BA.debugLine="End Sub";
return "";
}
public void  _btncancelargrabarnuevafase_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btncancelargrabarnuevafase_click", false))
	 {Debug.delegate(ba, "btncancelargrabarnuevafase_click", null); return;}
ResumableSub_btnCancelarGrabarNuevaFase_Click rsub = new ResumableSub_btnCancelarGrabarNuevaFase_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCancelarGrabarNuevaFase_Click extends BA.ResumableSub {
public ResumableSub_btnCancelarGrabarNuevaFase_Click(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97910785;
 //BA.debugLineNum = 97910785;BA.debugLine="If txtFechaNuevaFase.Text=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtfechanuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=97910787;
 //BA.debugLineNum = 97910787;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97910788;
 //BA.debugLineNum = 97910788;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=97910791;
 //BA.debugLineNum = 97910791;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Salir sin";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Salir sin grabar la nueva fase?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=97910792;
 //BA.debugLineNum = 97910792;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btncancelargrabarnuevafase_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=97910793;
 //BA.debugLineNum = 97910793;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=97910794;
 //BA.debugLineNum = 97910794;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97910795;
 //BA.debugLineNum = 97910795;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=97910798;
 //BA.debugLineNum = 97910798;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=96141312;
 //BA.debugLineNum = 96141312;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=96141313;
 //BA.debugLineNum = 96141313;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=96141314;
 //BA.debugLineNum = 96141314;BA.debugLine="mDocumentoSel=\"\"";
__ref._mdocumentosel /*String*/  = "";
RDebugUtils.currentLine=96141315;
 //BA.debugLineNum = 96141315;BA.debugLine="mTipoDocumento=\"\"";
__ref._mtipodocumento /*String*/  = "";
RDebugUtils.currentLine=96141316;
 //BA.debugLineNum = 96141316;BA.debugLine="mNuevaFaseDocumento.Initialize";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .Initialize();
RDebugUtils.currentLine=96141318;
 //BA.debugLineNum = 96141318;BA.debugLine="If SubExists(mCallBack,\"NuevaFaseDocActualizada\")";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,"NuevaFaseDocActualizada")) { 
RDebugUtils.currentLine=96141319;
 //BA.debugLineNum = 96141319;BA.debugLine="CallSub2(mCallBack,\"NuevaFaseDocActualizada\",Nue";
__c.CallSubDebug2(ba,__ref._mcallback /*Object*/ ,"NuevaFaseDocActualizada",(Object)(__ref._nuevafasedocumentoregistrada /*boolean*/ ));
 };
RDebugUtils.currentLine=96141321;
 //BA.debugLineNum = 96141321;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=96141322;
 //BA.debugLineNum = 96141322;BA.debugLine="End Sub";
return "";
}
public void  _btngrabarnuevafase_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btngrabarnuevafase_click", false))
	 {Debug.delegate(ba, "btngrabarnuevafase_click", null); return;}
ResumableSub_btnGrabarNuevaFase_Click rsub = new ResumableSub_btnGrabarNuevaFase_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGrabarNuevaFase_Click extends BA.ResumableSub {
public ResumableSub_btnGrabarNuevaFase_Click(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
boolean _rbool = false;
String _dateformatant = "";
String _fn = "";
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97583105;
 //BA.debugLineNum = 97583105;BA.debugLine="btnGrabarNuevaFase.Enabled=False";
__ref._btngrabarnuevafase /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=97583106;
 //BA.debugLineNum = 97583106;BA.debugLine="Wait For(checkNuevosDatosOk) complete (rBool As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._checknuevosdatosok /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=97583107;
 //BA.debugLineNum = 97583107;BA.debugLine="If rBool Then";
if (true) break;

case 1:
//if
this.state = 60;
if (_rbool) { 
this.state = 3;
}else {
this.state = 59;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=97583108;
 //BA.debugLineNum = 97583108;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=97583109;
 //BA.debugLineNum = 97583109;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=97583110;
 //BA.debugLineNum = 97583110;BA.debugLine="Dim Fn As String=DateUtils.TicksToString(mNuevaF";
_fn = parent._dateutils._tickstostring(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ );
RDebugUtils.currentLine=97583111;
 //BA.debugLineNum = 97583111;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=97583113;
 //BA.debugLineNum = 97583113;BA.debugLine="If mNuevaFaseDocumento.IDFase = 15 Then";
if (true) break;

case 4:
//if
this.state = 57;
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ==15) { 
this.state = 6;
}else {
this.state = 42;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=97583119;
 //BA.debugLineNum = 97583119;BA.debugLine="If mNuevaFaseDocumento.IDInfoAdicionalFase<>0 T";
if (true) break;

case 7:
//if
this.state = 40;
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ !=0) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=97583121;
 //BA.debugLineNum = 97583121;BA.debugLine="If mDestinatarioTaller Then";
if (true) break;

case 10:
//if
this.state = 23;
if (__ref._mdestinatariotaller /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=97583122;
 //BA.debugLineNum = 97583122;BA.debugLine="wait for(RegistroPreparacionRTFab(mNuevaFaseD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._registropreparacionrtfab /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ,__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ,_fn,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/ ,__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ ,"",__ref._mordenfab /*String*/ ));
this.state = 62;
return;
case 62:
//C
this.state = 13;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=97583124;
 //BA.debugLineNum = 97583124;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_sresp).equals("OK")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=97583125;
 //BA.debugLineNum = 97583125;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
__ref._nuevafasedocumentoregistrada /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97583126;
 //BA.debugLineNum = 97583126;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97583127;
 //BA.debugLineNum = 97583127;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 23;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=97583130;
 //BA.debugLineNum = 97583130;BA.debugLine="wait for(RegistroPreparacion(mNuevaFaseDocume";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._registropreparacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ,__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ,_fn,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/ ,__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ ,""));
this.state = 63;
return;
case 63:
//C
this.state = 19;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=97583132;
 //BA.debugLineNum = 97583132;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((_sresp).equals("OK")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=97583133;
 //BA.debugLineNum = 97583133;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
__ref._nuevafasedocumentoregistrada /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97583134;
 //BA.debugLineNum = 97583134;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97583135;
 //BA.debugLineNum = 97583135;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 40;
;
RDebugUtils.currentLine=97583138;
 //BA.debugLineNum = 97583138;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=97583140;
 //BA.debugLineNum = 97583140;BA.debugLine="If mDestinatarioTaller Then";
if (true) break;

case 26:
//if
this.state = 39;
if (__ref._mdestinatariotaller /*boolean*/ ) { 
this.state = 28;
}else {
this.state = 34;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=97583141;
 //BA.debugLineNum = 97583141;BA.debugLine="wait for(RegistroPreparacionRTFab(mNuevaFaseD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._registropreparacionrtfab /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ,__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ,_fn,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/ ,__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int) (0),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseAdicional /*String*/ ,__ref._mordenfab /*String*/ ));
this.state = 64;
return;
case 64:
//C
this.state = 29;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=97583143;
 //BA.debugLineNum = 97583143;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 29:
//if
this.state = 32;
if ((_sresp).equals("OK")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=97583144;
 //BA.debugLineNum = 97583144;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
__ref._nuevafasedocumentoregistrada /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97583145;
 //BA.debugLineNum = 97583145;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97583146;
 //BA.debugLineNum = 97583146;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 39;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=97583150;
 //BA.debugLineNum = 97583150;BA.debugLine="wait for(RegistroPreparacion(mNuevaFaseDocume";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._registropreparacion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ,__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ,_fn,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/ ,__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int) (0),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseAdicional /*String*/ ));
this.state = 65;
return;
case 65:
//C
this.state = 35;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=97583152;
 //BA.debugLineNum = 97583152;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 35:
//if
this.state = 38;
if ((_sresp).equals("OK")) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=97583153;
 //BA.debugLineNum = 97583153;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
__ref._nuevafasedocumentoregistrada /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97583154;
 //BA.debugLineNum = 97583154;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97583155;
 //BA.debugLineNum = 97583155;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=97583158;
 //BA.debugLineNum = 97583158;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 40:
//C
this.state = 57;
;
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=97583173;
 //BA.debugLineNum = 97583173;BA.debugLine="If mNuevaFaseDocumento.IDInfoAdicionalFase>0 Th";
if (true) break;

case 43:
//if
this.state = 56;
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ >0) { 
this.state = 45;
}else {
this.state = 51;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=97583175;
 //BA.debugLineNum = 97583175;BA.debugLine="wait for(RegistroNuevaFase(mNuevaFaseDocumento";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._registronuevafase /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ,_fn,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ,__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ ,""));
this.state = 66;
return;
case 66:
//C
this.state = 46;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=97583176;
 //BA.debugLineNum = 97583176;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 46:
//if
this.state = 49;
if ((_sresp).equals("OK")) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=97583177;
 //BA.debugLineNum = 97583177;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
__ref._nuevafasedocumentoregistrada /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97583178;
 //BA.debugLineNum = 97583178;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97583179;
 //BA.debugLineNum = 97583179;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 56;
;
RDebugUtils.currentLine=97583181;
 //BA.debugLineNum = 97583181;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=97583183;
 //BA.debugLineNum = 97583183;BA.debugLine="wait for(RegistroNuevaFase(mNuevaFaseDocumento";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btngrabarnuevafase_click"), __ref._registronuevafase /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ,_fn,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ,__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int) (0),__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseActual /*String*/ ));
this.state = 67;
return;
case 67:
//C
this.state = 52;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=97583184;
 //BA.debugLineNum = 97583184;BA.debugLine="If sResp=\"OK\" Then";
if (true) break;

case 52:
//if
this.state = 55;
if ((_sresp).equals("OK")) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=97583185;
 //BA.debugLineNum = 97583185;BA.debugLine="NuevaFaseDocumentoRegistrada=True";
__ref._nuevafasedocumentoregistrada /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97583186;
 //BA.debugLineNum = 97583186;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=97583187;
 //BA.debugLineNum = 97583187;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=97583189;
 //BA.debugLineNum = 97583189;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=97583203;
 //BA.debugLineNum = 97583203;BA.debugLine="btnGrabarNuevaFase.Enabled=True";
__ref._btngrabarnuevafase /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=97583205;
 //BA.debugLineNum = 97583205;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checknuevosdatosok(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "checknuevosdatosok", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checknuevosdatosok", null));}
ResumableSub_checkNuevosDatosOk rsub = new ResumableSub_checkNuevosDatosOk(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_checkNuevosDatosOk extends BA.ResumableSub {
public ResumableSub_checkNuevosDatosOk(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
boolean _checkndatosok = false;
Object _msa = null;
int _expreq = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97648641;
 //BA.debugLineNum = 97648641;BA.debugLine="Dim checkNDatosOk As Boolean= True";
_checkndatosok = parent.__c.True;
RDebugUtils.currentLine=97648643;
 //BA.debugLineNum = 97648643;BA.debugLine="If Utilidades.FixNullLong(mNuevaFaseDocumento.Fec";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._utilidades._fixnulllong /*long*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ ))==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=97648644;
 //BA.debugLineNum = 97648644;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha indi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha indicada para la nueva fase no es válida","Aviso");
RDebugUtils.currentLine=97648645;
 //BA.debugLineNum = 97648645;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 4;
;
RDebugUtils.currentLine=97648646;
 //BA.debugLineNum = 97648646;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648650;
 //BA.debugLineNum = 97648650;BA.debugLine="If Utilidades.FixNullInt(mNuevaFaseDocumento.IDFa";

case 4:
//if
this.state = 7;
if (parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ))==0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=97648652;
 //BA.debugLineNum = 97648652;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha indicado la nueva fase","Aviso");
RDebugUtils.currentLine=97648653;
 //BA.debugLineNum = 97648653;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 38;
return;
case 38:
//C
this.state = 7;
;
RDebugUtils.currentLine=97648654;
 //BA.debugLineNum = 97648654;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648665;
 //BA.debugLineNum = 97648665;BA.debugLine="If txtResponsableNuevaFase.Visible And Utilidades";

case 7:
//if
this.state = 10;
if (__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getVisible() && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ ))==0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=97648666;
 //BA.debugLineNum = 97648666;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha indicado responsable de la fase","Aviso");
RDebugUtils.currentLine=97648667;
 //BA.debugLineNum = 97648667;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 10;
;
RDebugUtils.currentLine=97648668;
 //BA.debugLineNum = 97648668;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648673;
 //BA.debugLineNum = 97648673;BA.debugLine="If txtInfoAdicionalDoc.Visible And Utilidades.Fix";

case 10:
//if
this.state = 13;
if (__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getVisible() && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ ))==0 && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ))!=9 && (parent._utilidades._fixnull /*String*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseActual /*String*/ ))).equals("")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=97648674;
 //BA.debugLineNum = 97648674;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligatori";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es obligatorio seleccionar información adicional para esta fase","Aviso");
RDebugUtils.currentLine=97648675;
 //BA.debugLineNum = 97648675;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 13;
;
RDebugUtils.currentLine=97648676;
 //BA.debugLineNum = 97648676;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648680;
 //BA.debugLineNum = 97648680;BA.debugLine="If txtInfoAdicionalDoc.Visible And Utilidades.Fix";

case 13:
//if
this.state = 20;
if (__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getVisible() && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFase /*int*/ ))==0 && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ))==9 && (parent._utilidades._fixnull /*String*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseActual /*String*/ ))).equals("")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=97648681;
 //BA.debugLineNum = 97648681;BA.debugLine="Dim expReq As Int";
_expreq = 0;
RDebugUtils.currentLine=97648682;
 //BA.debugLineNum = 97648682;BA.debugLine="expReq=utilidades.FixNullInt(mSQL.ExecQuerySingl";
_expreq = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select RequiereNumeroExpedicion from tblTransporte where IDTransporte=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFase /*int*/ )))}))));
RDebugUtils.currentLine=97648683;
 //BA.debugLineNum = 97648683;BA.debugLine="If expReq<>0 Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_expreq!=0) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=97648684;
 //BA.debugLineNum = 97648684;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligator";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es obligatorio indicar Número de expedición para esta fase","Aviso");
RDebugUtils.currentLine=97648685;
 //BA.debugLineNum = 97648685;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 19;
;
RDebugUtils.currentLine=97648688;
 //BA.debugLineNum = 97648688;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;
;
RDebugUtils.currentLine=97648693;
 //BA.debugLineNum = 97648693;BA.debugLine="If Utilidades.FixNullInt(mNuevaFaseDocumento.IDFa";

case 20:
//if
this.state = 23;
if (parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ))==15 && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ))==0) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=97648694;
 //BA.debugLineNum = 97648694;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligatori";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es obligatorio indicar el destino del documento preparado.","Aviso");
RDebugUtils.currentLine=97648695;
 //BA.debugLineNum = 97648695;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 23;
;
RDebugUtils.currentLine=97648696;
 //BA.debugLineNum = 97648696;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648701;
 //BA.debugLineNum = 97648701;BA.debugLine="If txtResponsableNuevaFaseDestinoPreparacion.Visi";

case 23:
//if
this.state = 26;
if (__ref._txtresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getVisible() && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/ ))==0) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=97648702;
 //BA.debugLineNum = 97648702;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha indicado "+__ref._lbltitleresponsablenuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText(),"Aviso");
RDebugUtils.currentLine=97648703;
 //BA.debugLineNum = 97648703;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 26;
;
RDebugUtils.currentLine=97648704;
 //BA.debugLineNum = 97648704;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648709;
 //BA.debugLineNum = 97648709;BA.debugLine="If txtInfoAdicionalNuevaFaseDestinoPreparacion.Vi";

case 26:
//if
this.state = 29;
if (__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getVisible() && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFaseDest /*int*/ ))==0 && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ))!=9 && (parent._utilidades._fixnull /*String*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseAdicional /*String*/ ))).equals("")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=97648710;
 //BA.debugLineNum = 97648710;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligatori";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es obligatorio seleccionar información adicional para la fase de destino de preparación","Aviso");
RDebugUtils.currentLine=97648711;
 //BA.debugLineNum = 97648711;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 44;
return;
case 44:
//C
this.state = 29;
;
RDebugUtils.currentLine=97648712;
 //BA.debugLineNum = 97648712;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=97648716;
 //BA.debugLineNum = 97648716;BA.debugLine="If txtInfoAdicionalNuevaFaseDestinoPreparacion.Vi";

case 29:
//if
this.state = 36;
if (__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getVisible() && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDInfoAdicionalFaseDest /*int*/ ))==0 && parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ))==9 && (parent._utilidades._fixnull /*String*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseAdicional /*String*/ ))).equals("")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=97648717;
 //BA.debugLineNum = 97648717;BA.debugLine="Dim expReq As Int";
_expreq = 0;
RDebugUtils.currentLine=97648718;
 //BA.debugLineNum = 97648718;BA.debugLine="expReq=Utilidades.FixNullint(mSQL.ExecQuerySingl";
_expreq = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select RequiereNumeroExpedicion from tblTransporte where IDTransporte=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(parent._utilidades._fixnullint /*int*/ ((Object)(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDRespFaseDest /*int*/ )))}))));
RDebugUtils.currentLine=97648719;
 //BA.debugLineNum = 97648719;BA.debugLine="If expReq<>0 Then";
if (true) break;

case 32:
//if
this.state = 35;
if (_expreq!=0) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=97648720;
 //BA.debugLineNum = 97648720;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligator";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es obligatorio seleccionar información adicional para esta fase de destino de preparación","Aviso");
RDebugUtils.currentLine=97648721;
 //BA.debugLineNum = 97648721;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "checknuevosdatosok"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 35;
;
RDebugUtils.currentLine=97648722;
 //BA.debugLineNum = 97648722;BA.debugLine="checkNDatosOk = False";
_checkndatosok = parent.__c.False;
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=97648744;
 //BA.debugLineNum = 97648744;BA.debugLine="Return checkNDatosOk";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_checkndatosok));return;};
RDebugUtils.currentLine=97648745;
 //BA.debugLineNum = 97648745;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _registropreparacionrtfab(b4j.docU.cnuevafasedocumento __ref,int _idfaseprep,int _idrfprep,String _respfprep,int _idfase,String _fchmv,int _idrfase,String _responsfase,int _idiafase,String _numexpfase,String _pedfab) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "registropreparacionrtfab", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "registropreparacionrtfab", new Object[] {_idfaseprep,_idrfprep,_respfprep,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase,_pedfab}));}
ResumableSub_RegistroPreparacionRTFab rsub = new ResumableSub_RegistroPreparacionRTFab(this,__ref,_idfaseprep,_idrfprep,_respfprep,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase,_pedfab);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RegistroPreparacionRTFab extends BA.ResumableSub {
public ResumableSub_RegistroPreparacionRTFab(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref,int _idfaseprep,int _idrfprep,String _respfprep,int _idfase,String _fchmv,int _idrfase,String _responsfase,int _idiafase,String _numexpfase,String _pedfab) {
this.parent = parent;
this.__ref = __ref;
this._idfaseprep = _idfaseprep;
this._idrfprep = _idrfprep;
this._respfprep = _respfprep;
this._idfase = _idfase;
this._fchmv = _fchmv;
this._idrfase = _idrfase;
this._responsfase = _responsfase;
this._idiafase = _idiafase;
this._numexpfase = _numexpfase;
this._pedfab = _pedfab;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
int _idfaseprep;
int _idrfprep;
String _respfprep;
int _idfase;
String _fchmv;
int _idrfase;
String _responsfase;
int _idiafase;
String _numexpfase;
String _pedfab;
String _accion = "";
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97779714;
 //BA.debugLineNum = 97779714;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=97779715;
 //BA.debugLineNum = 97779715;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=97779716;
 //BA.debugLineNum = 97779716;BA.debugLine="Dim Comando As String=\"NuevaFasePreparacionDocRTF";
_comando = "NuevaFasePreparacionDocRTFab";
RDebugUtils.currentLine=97779718;
 //BA.debugLineNum = 97779718;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mDocu";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(__ref._mdocumentosel /*String*/ ),(Object)(_idfaseprep),(Object)(_idrfprep),(Object)(_respfprep),(Object)(_idfase),(Object)(_fchmv),(Object)(_idrfase),(Object)(_responsfase),(Object)(_idiafase),(Object)(_numexpfase),(Object)(1),(Object)(0),(Object)(_pedfab)},parent);
RDebugUtils.currentLine=97779720;
 //BA.debugLineNum = 97779720;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=97779721;
 //BA.debugLineNum = 97779721;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=97779722;
 //BA.debugLineNum = 97779722;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=97779723;
 //BA.debugLineNum = 97779723;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=97779724;
 //BA.debugLineNum = 97779724;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=97779726;
 //BA.debugLineNum = 97779726;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
RDebugUtils.currentLine=97779728;
 //BA.debugLineNum = 97779728;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=97779729;
 //BA.debugLineNum = 97779729;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible registrar la nueva fase de documento.","Error");
RDebugUtils.currentLine=97779730;
 //BA.debugLineNum = 97779730;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=97779732;
 //BA.debugLineNum = 97779732;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=97779733;
 //BA.debugLineNum = 97779733;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=97779734;
 //BA.debugLineNum = 97779734;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=97779735;
 //BA.debugLineNum = 97779735;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.toUpperCase().startsWith("ERR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=97779736;
 //BA.debugLineNum = 97779736;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible registrar la nueva fase de documento.","Error");
RDebugUtils.currentLine=97779737;
 //BA.debugLineNum = 97779737;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=97779738;
 //BA.debugLineNum = 97779738;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=97779740;
 //BA.debugLineNum = 97779740;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=97779741;
 //BA.debugLineNum = 97779741;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha regis";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Se ha registrado la nueva fase de documento.","Error");
RDebugUtils.currentLine=97779742;
 //BA.debugLineNum = 97779742;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacionrtfab"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
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
RDebugUtils.currentLine=97779747;
 //BA.debugLineNum = 97779747;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=97779748;
 //BA.debugLineNum = 97779748;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _registropreparacion(b4j.docU.cnuevafasedocumento __ref,int _idfaseprep,int _idrfprep,String _respfprep,int _idfase,String _fchmv,int _idrfase,String _responsfase,int _idiafase,String _numexpfase) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "registropreparacion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "registropreparacion", new Object[] {_idfaseprep,_idrfprep,_respfprep,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase}));}
ResumableSub_RegistroPreparacion rsub = new ResumableSub_RegistroPreparacion(this,__ref,_idfaseprep,_idrfprep,_respfprep,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RegistroPreparacion extends BA.ResumableSub {
public ResumableSub_RegistroPreparacion(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref,int _idfaseprep,int _idrfprep,String _respfprep,int _idfase,String _fchmv,int _idrfase,String _responsfase,int _idiafase,String _numexpfase) {
this.parent = parent;
this.__ref = __ref;
this._idfaseprep = _idfaseprep;
this._idrfprep = _idrfprep;
this._respfprep = _respfprep;
this._idfase = _idfase;
this._fchmv = _fchmv;
this._idrfase = _idrfase;
this._responsfase = _responsfase;
this._idiafase = _idiafase;
this._numexpfase = _numexpfase;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
int _idfaseprep;
int _idrfprep;
String _respfprep;
int _idfase;
String _fchmv;
int _idrfase;
String _responsfase;
int _idiafase;
String _numexpfase;
String _accion = "";
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97714178;
 //BA.debugLineNum = 97714178;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=97714179;
 //BA.debugLineNum = 97714179;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=97714180;
 //BA.debugLineNum = 97714180;BA.debugLine="Dim Comando As String=\"NuevaFasePreparacionDoc\"";
_comando = "NuevaFasePreparacionDoc";
RDebugUtils.currentLine=97714182;
 //BA.debugLineNum = 97714182;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mDocu";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(__ref._mdocumentosel /*String*/ ),(Object)(_idfaseprep),(Object)(_idrfprep),(Object)(_respfprep),(Object)(_idfase),(Object)(_fchmv),(Object)(_idrfase),(Object)(_responsfase),(Object)(_idiafase),(Object)(_numexpfase),(Object)(1),(Object)(0)},parent);
RDebugUtils.currentLine=97714184;
 //BA.debugLineNum = 97714184;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacion"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=97714185;
 //BA.debugLineNum = 97714185;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=97714186;
 //BA.debugLineNum = 97714186;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=97714187;
 //BA.debugLineNum = 97714187;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=97714188;
 //BA.debugLineNum = 97714188;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=97714190;
 //BA.debugLineNum = 97714190;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
RDebugUtils.currentLine=97714192;
 //BA.debugLineNum = 97714192;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=97714193;
 //BA.debugLineNum = 97714193;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible registrar la nueva fase de documento.","Error");
RDebugUtils.currentLine=97714194;
 //BA.debugLineNum = 97714194;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=97714196;
 //BA.debugLineNum = 97714196;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=97714197;
 //BA.debugLineNum = 97714197;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=97714198;
 //BA.debugLineNum = 97714198;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=97714199;
 //BA.debugLineNum = 97714199;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.toUpperCase().startsWith("ERR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=97714200;
 //BA.debugLineNum = 97714200;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible registrar la nueva fase de documento.","Error");
RDebugUtils.currentLine=97714201;
 //BA.debugLineNum = 97714201;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=97714202;
 //BA.debugLineNum = 97714202;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=97714204;
 //BA.debugLineNum = 97714204;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha regis";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Se ha registrado la nueva fase de documento.","Error");
RDebugUtils.currentLine=97714205;
 //BA.debugLineNum = 97714205;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registropreparacion"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=97714206;
 //BA.debugLineNum = 97714206;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 16:
//C
this.state = 17;
;
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
RDebugUtils.currentLine=97714211;
 //BA.debugLineNum = 97714211;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=97714213;
 //BA.debugLineNum = 97714213;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _registronuevafase(b4j.docU.cnuevafasedocumento __ref,int _idfase,String _fchmv,int _idrfase,String _responsfase,int _idiafase,String _numexpfase) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "registronuevafase", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "registronuevafase", new Object[] {_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase}));}
ResumableSub_RegistroNuevaFase rsub = new ResumableSub_RegistroNuevaFase(this,__ref,_idfase,_fchmv,_idrfase,_responsfase,_idiafase,_numexpfase);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RegistroNuevaFase extends BA.ResumableSub {
public ResumableSub_RegistroNuevaFase(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref,int _idfase,String _fchmv,int _idrfase,String _responsfase,int _idiafase,String _numexpfase) {
this.parent = parent;
this.__ref = __ref;
this._idfase = _idfase;
this._fchmv = _fchmv;
this._idrfase = _idrfase;
this._responsfase = _responsfase;
this._idiafase = _idiafase;
this._numexpfase = _numexpfase;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
int _idfase;
String _fchmv;
int _idrfase;
String _responsfase;
int _idiafase;
String _numexpfase;
String _accion = "";
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97845251;
 //BA.debugLineNum = 97845251;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=97845252;
 //BA.debugLineNum = 97845252;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=97845253;
 //BA.debugLineNum = 97845253;BA.debugLine="Dim Comando As String=\"NuevaFaseDoc\"";
_comando = "NuevaFaseDoc";
RDebugUtils.currentLine=97845255;
 //BA.debugLineNum = 97845255;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(mTipo";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(__ref._mtipodocumento /*String*/ ),(Object)(__ref._mdocumentosel /*String*/ ),(Object)(_idfase),(Object)(_fchmv),(Object)(_idrfase),(Object)(_responsfase),(Object)(_idiafase),(Object)(_numexpfase),(Object)(1),(Object)(0)},parent);
RDebugUtils.currentLine=97845257;
 //BA.debugLineNum = 97845257;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registronuevafase"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=97845258;
 //BA.debugLineNum = 97845258;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=97845259;
 //BA.debugLineNum = 97845259;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=97845260;
 //BA.debugLineNum = 97845260;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=97845261;
 //BA.debugLineNum = 97845261;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=97845263;
 //BA.debugLineNum = 97845263;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
RDebugUtils.currentLine=97845265;
 //BA.debugLineNum = 97845265;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=97845266;
 //BA.debugLineNum = 97845266;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible registrar la nueva fase de documento.","Error");
RDebugUtils.currentLine=97845267;
 //BA.debugLineNum = 97845267;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=97845269;
 //BA.debugLineNum = 97845269;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=97845270;
 //BA.debugLineNum = 97845270;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=97845271;
 //BA.debugLineNum = 97845271;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=97845272;
 //BA.debugLineNum = 97845272;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.toUpperCase().startsWith("ERR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=97845273;
 //BA.debugLineNum = 97845273;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible registrar la nueva fase de documento.","Error");
RDebugUtils.currentLine=97845274;
 //BA.debugLineNum = 97845274;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=97845275;
 //BA.debugLineNum = 97845275;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=97845277;
 //BA.debugLineNum = 97845277;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=97845278;
 //BA.debugLineNum = 97845278;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha regis";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Se ha registrado la nueva fase de documento.","Error");
RDebugUtils.currentLine=97845279;
 //BA.debugLineNum = 97845279;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "registronuevafase"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
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
RDebugUtils.currentLine=97845284;
 //BA.debugLineNum = 97845284;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=97845286;
 //BA.debugLineNum = 97845286;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=96075776;
 //BA.debugLineNum = 96075776;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=96075777;
 //BA.debugLineNum = 96075777;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=96075778;
 //BA.debugLineNum = 96075778;BA.debugLine="End Sub";
return "";
}
public String  _btnseldocumento_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnseldocumento_click", false))
	 {return ((String) Debug.delegate(ba, "btnseldocumento_click", null));}
RDebugUtils.currentLine=97517568;
 //BA.debugLineNum = 97517568;BA.debugLine="Private Sub btnSelDocumento_Click";
RDebugUtils.currentLine=97517573;
 //BA.debugLineNum = 97517573;BA.debugLine="End Sub";
return "";
}
public String  _btnselfechanuevafase_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselfechanuevafase_click", false))
	 {return ((String) Debug.delegate(ba, "btnselfechanuevafase_click", null));}
RDebugUtils.currentLine=97386496;
 //BA.debugLineNum = 97386496;BA.debugLine="Private Sub btnSelFechaNuevaFase_Click";
RDebugUtils.currentLine=97386497;
 //BA.debugLineNum = 97386497;BA.debugLine="SeleccionarFechaNuevaFase";
__ref._seleccionarfechanuevafase /*void*/ (null);
RDebugUtils.currentLine=97386498;
 //BA.debugLineNum = 97386498;BA.debugLine="End Sub";
return "";
}
public void  _seleccionarfechanuevafase(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "seleccionarfechanuevafase", false))
	 {Debug.delegate(ba, "seleccionarfechanuevafase", null); return;}
ResumableSub_SeleccionarFechaNuevaFase rsub = new ResumableSub_SeleccionarFechaNuevaFase(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SeleccionarFechaNuevaFase extends BA.ResumableSub {
public ResumableSub_SeleccionarFechaNuevaFase(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _dateformatant = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97452033;
 //BA.debugLineNum = 97452033;BA.debugLine="Dialog.Title=\"Indica Fecha Nueva Fase\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Nueva Fase");
RDebugUtils.currentLine=97452035;
 //BA.debugLineNum = 97452035;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=97452036;
 //BA.debugLineNum = 97452036;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=97452037;
 //BA.debugLineNum = 97452037;BA.debugLine="If mNuevaFaseDocumento.FechaFase=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ ==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=97452038;
 //BA.debugLineNum = 97452038;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=97452040;
 //BA.debugLineNum = 97452040;BA.debugLine="B4XDateDlg.Date=mNuevaFaseDocumento.FechaFase";
_b4xdatedlg._setdate /*long*/ (null,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=97452042;
 //BA.debugLineNum = 97452042;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=97452043;
 //BA.debugLineNum = 97452043;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=97452045;
 //BA.debugLineNum = 97452045;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=97452046;
 //BA.debugLineNum = 97452046;BA.debugLine="Utilidades.SetLightThemeDate(B4XDateDlg)";
parent._utilidades._setlightthemedate /*String*/ (_b4xdatedlg);
RDebugUtils.currentLine=97452048;
 //BA.debugLineNum = 97452048;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=97452051;
 //BA.debugLineNum = 97452051;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=97452052;
 //BA.debugLineNum = 97452052;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=97452053;
 //BA.debugLineNum = 97452053;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=97452054;
 //BA.debugLineNum = 97452054;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=97452055;
 //BA.debugLineNum = 97452055;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "seleccionarfechanuevafase"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=97452056;
 //BA.debugLineNum = 97452056;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=97452057;
 //BA.debugLineNum = 97452057;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=97452059;
 //BA.debugLineNum = 97452059;BA.debugLine="mNuevaFaseDocumento.FechaFase=B4XDateDlg.Date";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/  = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=97452061;
 //BA.debugLineNum = 97452061;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=97452062;
 //BA.debugLineNum = 97452062;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=97452065;
 //BA.debugLineNum = 97452065;BA.debugLine="txtFechaNuevaFase.Text=DateTime.Date(mNuevaFaseDo";
__ref._txtfechanuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ ));
RDebugUtils.currentLine=97452066;
 //BA.debugLineNum = 97452066;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=97452068;
 //BA.debugLineNum = 97452068;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselinfoadicionaldoc_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselinfoadicionaldoc_click", false))
	 {Debug.delegate(ba, "btnselinfoadicionaldoc_click", null); return;}
ResumableSub_btnSelInfoAdicionalDoc_Click rsub = new ResumableSub_btnSelInfoAdicionalDoc_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelInfoAdicionalDoc_Click extends BA.ResumableSub {
public ResumableSub_btnSelInfoAdicionalDoc_Click(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
Object _msa = null;
String _srowsource = "";
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _sinfoadicionaldoc = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97320961;
 //BA.debugLineNum = 97320961;BA.debugLine="If txtNuevaFase.Text=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtnuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=97320962;
 //BA.debugLineNum = 97320962;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona an";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Selecciona antes la fase.","Aviso");
RDebugUtils.currentLine=97320963;
 //BA.debugLineNum = 97320963;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btnselinfoadicionaldoc_click"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 4;
;
RDebugUtils.currentLine=97320964;
 //BA.debugLineNum = 97320964;BA.debugLine="SeleccionarNuevaFase";
__ref._seleccionarnuevafase /*void*/ (null);
RDebugUtils.currentLine=97320965;
 //BA.debugLineNum = 97320965;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=97320969;
 //BA.debugLineNum = 97320969;BA.debugLine="Select True";

case 4:
//select
this.state = 15;
switch (BA.switchObjectToInt(parent.__c.True,(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(0)) == false,(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(0)) == false)) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 15;
RDebugUtils.currentLine=97320971;
 //BA.debugLineNum = 97320971;BA.debugLine="Dim sRowSource As String";
_srowsource = "";
RDebugUtils.currentLine=97320972;
 //BA.debugLineNum = 97320972;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select";
_srowsource = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select OrigenFilacboInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }));
RDebugUtils.currentLine=97320973;
 //BA.debugLineNum = 97320973;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
_srowsource = _srowsource.replace("=true","<>0");
RDebugUtils.currentLine=97320974;
 //BA.debugLineNum = 97320974;BA.debugLine="DatosSeleccionados=\"InfoAdicionalNuevaFase\"";
__ref._datosseleccionados /*String*/  = "InfoAdicionalNuevaFase";
RDebugUtils.currentLine=97320975;
 //BA.debugLineNum = 97320975;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocument";
__ref._preloaddatoscls /*String*/ (null,(int) (1),_srowsource,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=97320979;
 //BA.debugLineNum = 97320979;BA.debugLine="Dialog.Title=\"Selecciona \" & lblTitleInfoAdicio";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona "+__ref._lbltitleinfoadicionaldoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText());
RDebugUtils.currentLine=97320980;
 //BA.debugLineNum = 97320980;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=97320982;
 //BA.debugLineNum = 97320982;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=97320983;
 //BA.debugLineNum = 97320983;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=97320984;
 //BA.debugLineNum = 97320984;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=97320985;
 //BA.debugLineNum = 97320985;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=97320988;
 //BA.debugLineNum = 97320988;BA.debugLine="InputDlg.mBase.Width=750dip";
_inputdlg._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (750)));
RDebugUtils.currentLine=97320989;
 //BA.debugLineNum = 97320989;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
parent._utilidades._setlightthemeinput /*String*/ (_inputdlg);
RDebugUtils.currentLine=97320990;
 //BA.debugLineNum = 97320990;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(In";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=97320991;
 //BA.debugLineNum = 97320991;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogR";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=97320992;
 //BA.debugLineNum = 97320992;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=97320993;
 //BA.debugLineNum = 97320993;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dia";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=97320994;
 //BA.debugLineNum = 97320994;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=97320995;
 //BA.debugLineNum = 97320995;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=97320996;
 //BA.debugLineNum = 97320996;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=97320997;
 //BA.debugLineNum = 97320997;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btnselinfoadicionaldoc_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=97320999;
 //BA.debugLineNum = 97320999;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 9:
//if
this.state = 14;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) return ;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=97321003;
 //BA.debugLineNum = 97321003;BA.debugLine="Dim sInfoAdicionalDoc As String=InputDlg.Text";
_sinfoadicionaldoc = _inputdlg._text /*String*/ ;
RDebugUtils.currentLine=97321005;
 //BA.debugLineNum = 97321005;BA.debugLine="txtInfoAdicionalDoc.Text=sInfoAdicionalDoc";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_sinfoadicionaldoc);
RDebugUtils.currentLine=97321006;
 //BA.debugLineNum = 97321006;BA.debugLine="mNuevaFaseDocumento.NumExpFaseActual=sInfoAdici";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseActual /*String*/  = _sinfoadicionaldoc;
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=97321009;
 //BA.debugLineNum = 97321009;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _seleccionarnuevafase(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "seleccionarnuevafase", false))
	 {Debug.delegate(ba, "seleccionarnuevafase", null); return;}
ResumableSub_SeleccionarNuevaFase rsub = new ResumableSub_SeleccionarNuevaFase(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SeleccionarNuevaFase extends BA.ResumableSub {
public ResumableSub_SeleccionarNuevaFase(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97058818;
 //BA.debugLineNum = 97058818;BA.debugLine="If mNuevaFaseDocumento.FechaFase=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .FechaFase /*long*/ ==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=97058819;
 //BA.debugLineNum = 97058819;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona an";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Selecciona antes la fecha de la nueva fase.","Aviso");
RDebugUtils.currentLine=97058820;
 //BA.debugLineNum = 97058820;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "seleccionarnuevafase"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 4;
;
RDebugUtils.currentLine=97058821;
 //BA.debugLineNum = 97058821;BA.debugLine="SeleccionarFechaNuevaFase";
__ref._seleccionarfechanuevafase /*void*/ (null);
RDebugUtils.currentLine=97058822;
 //BA.debugLineNum = 97058822;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=97058825;
 //BA.debugLineNum = 97058825;BA.debugLine="If mNuevaFaseDocumento.IDFase<>0 Then";

case 4:
//if
this.state = 13;
if (__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ !=0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=97058826;
 //BA.debugLineNum = 97058826;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Seleccion";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Seleccionar otra fase?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=97058827;
 //BA.debugLineNum = 97058827;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "seleccionarnuevafase"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=97058828;
 //BA.debugLineNum = 97058828;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=97058834;
 //BA.debugLineNum = 97058834;BA.debugLine="ResetNuevaFase(False)";
__ref._resetnuevafase /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=97058835;
 //BA.debugLineNum = 97058835;BA.debugLine="ResetNuevaFaseAdicional";
__ref._resetnuevafaseadicional /*String*/ (null);
RDebugUtils.currentLine=97058836;
 //BA.debugLineNum = 97058836;BA.debugLine="pnlNuevaFaseComplementaria.Visible=False";
__ref._pnlnuevafasecomplementaria /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=97058838;
 //BA.debugLineNum = 97058838;BA.debugLine="DatosSeleccionados=\"NuevaFase\"";
__ref._datosseleccionados /*String*/  = "NuevaFase";
RDebugUtils.currentLine=97058839;
 //BA.debugLineNum = 97058839;BA.debugLine="If mDestinatarioTaller Then";
if (true) break;

case 14:
//if
this.state = 19;
if (__ref._mdestinatariotaller /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=97058840;
 //BA.debugLineNum = 97058840;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int) (1),"SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='"+__ref._mtipodocumento /*String*/ +"' and DestinoTaller<>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial",(int) (0));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=97058842;
 //BA.debugLineNum = 97058842;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int) (1),"SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='"+__ref._mtipodocumento /*String*/ +"' and IDFase>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial",(int) (0));
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=97058957;
 //BA.debugLineNum = 97058957;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _preloaddatoscls(b4j.docU.cnuevafasedocumento __ref,int _tipoquery,String _sclssource,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "preloaddatoscls", false))
	 {return ((String) Debug.delegate(ba, "preloaddatoscls", new Object[] {_tipoquery,_sclssource,_id}));}
anywheresoftware.b4a.objects.collections.List _lstclss = null;
RDebugUtils.currentLine=96796672;
 //BA.debugLineNum = 96796672;BA.debugLine="Sub PreLoadDatosCls(tipoQuery As Int, sClsSource A";
RDebugUtils.currentLine=96796673;
 //BA.debugLineNum = 96796673;BA.debugLine="TipoQryCls=tipoQuery";
__ref._tipoqrycls /*String*/  = BA.NumberToString(_tipoquery);
RDebugUtils.currentLine=96796674;
 //BA.debugLineNum = 96796674;BA.debugLine="stringSourceTableCls=sClsSource";
__ref._stringsourcetablecls /*String*/  = _sclssource;
RDebugUtils.currentLine=96796675;
 //BA.debugLineNum = 96796675;BA.debugLine="IDDatosCls=ID";
__ref._iddatoscls /*int*/  = _id;
RDebugUtils.currentLine=96796677;
 //BA.debugLineNum = 96796677;BA.debugLine="Dim lstClsS As List= Regex.Split(\" \",sClsSource.S";
_lstclss = new anywheresoftware.b4a.objects.collections.List();
_lstclss = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split(" ",_sclssource.substring((int) (_sclssource.indexOf("from")+5))));
RDebugUtils.currentLine=96796678;
 //BA.debugLineNum = 96796678;BA.debugLine="SourceTableCls=lstClsS.Get(0)";
__ref._sourcetablecls /*String*/  = BA.ObjectToString(_lstclss.Get((int) (0)));
RDebugUtils.currentLine=96796680;
 //BA.debugLineNum = 96796680;BA.debugLine="If mSQL.ExecQuerySingleResult(\"select count(*) fr";
if ((__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from "+__ref._sourcetablecls /*String*/ )).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=96796681;
 //BA.debugLineNum = 96796681;BA.debugLine="CallSub(Me,SourceTableCls)";
__c.CallSubDebug(ba,this,__ref._sourcetablecls /*String*/ );
 }else {
RDebugUtils.currentLine=96796683;
 //BA.debugLineNum = 96796683;BA.debugLine="LoadDatosB4xSearchList(tipoQuery, sClsSource, ID";
__ref._loaddatosb4xsearchlist /*void*/ (null,_tipoquery,_sclssource,_id);
 };
RDebugUtils.currentLine=96796686;
 //BA.debugLineNum = 96796686;BA.debugLine="End Sub";
return "";
}
public void  _btnselinfoadicionaldocnuevafasedestinopreparacion_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselinfoadicionaldocnuevafasedestinopreparacion_click", false))
	 {Debug.delegate(ba, "btnselinfoadicionaldocnuevafasedestinopreparacion_click", null); return;}
ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click rsub = new ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click extends BA.ResumableSub {
public ResumableSub_btnSelInfoAdicionalDocNuevaFaseDestinoPreparacion_Click(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _srowsource = "";
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _sinfoadicionaldocdestinopreparacion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97255425;
 //BA.debugLineNum = 97255425;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent.__c.True,(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select cboInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(0)) == false,(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select txtInfoAdicionalVisible from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(0)) == false)) {
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
this.state = 12;
RDebugUtils.currentLine=97255427;
 //BA.debugLineNum = 97255427;BA.debugLine="Dim sRowSource As String";
_srowsource = "";
RDebugUtils.currentLine=97255428;
 //BA.debugLineNum = 97255428;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select";
_srowsource = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select OrigenFilacboInfoAdicional from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }));
RDebugUtils.currentLine=97255429;
 //BA.debugLineNum = 97255429;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
_srowsource = _srowsource.replace("=true","<>0");
RDebugUtils.currentLine=97255430;
 //BA.debugLineNum = 97255430;BA.debugLine="DatosSeleccionados=\"InfoAdicionalFaseAdicional\"";
__ref._datosseleccionados /*String*/  = "InfoAdicionalFaseAdicional";
RDebugUtils.currentLine=97255431;
 //BA.debugLineNum = 97255431;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocument";
__ref._preloaddatoscls /*String*/ (null,(int) (1),_srowsource,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ );
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=97255446;
 //BA.debugLineNum = 97255446;BA.debugLine="Dialog.Title=\"Selecciona \" & lblTitleInfoAdicio";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona "+__ref._lbltitleinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText());
RDebugUtils.currentLine=97255447;
 //BA.debugLineNum = 97255447;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=97255448;
 //BA.debugLineNum = 97255448;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=97255449;
 //BA.debugLineNum = 97255449;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=97255450;
 //BA.debugLineNum = 97255450;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=97255451;
 //BA.debugLineNum = 97255451;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=97255454;
 //BA.debugLineNum = 97255454;BA.debugLine="InputDlg.mBase.Width=750dip";
_inputdlg._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (750)));
RDebugUtils.currentLine=97255456;
 //BA.debugLineNum = 97255456;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
parent._utilidades._setlightthemeinput /*String*/ (_inputdlg);
RDebugUtils.currentLine=97255457;
 //BA.debugLineNum = 97255457;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(In";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=97255458;
 //BA.debugLineNum = 97255458;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogR";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=97255459;
 //BA.debugLineNum = 97255459;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=97255460;
 //BA.debugLineNum = 97255460;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dia";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=97255461;
 //BA.debugLineNum = 97255461;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=97255462;
 //BA.debugLineNum = 97255462;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=97255463;
 //BA.debugLineNum = 97255463;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=97255464;
 //BA.debugLineNum = 97255464;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btnselinfoadicionaldocnuevafasedestinopreparacion_click"), _rsub);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_rint = (int) result[1];
;
RDebugUtils.currentLine=97255466;
 //BA.debugLineNum = 97255466;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 6:
//if
this.state = 11;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=97255468;
 //BA.debugLineNum = 97255468;BA.debugLine="Dim sInfoAdicionalDocDestinoPreparacion As Stri";
_sinfoadicionaldocdestinopreparacion = _inputdlg._text /*String*/ ;
RDebugUtils.currentLine=97255470;
 //BA.debugLineNum = 97255470;BA.debugLine="txtInfoAdicionalNuevaFaseDestinoPreparacion.Tex";
__ref._txtinfoadicionalnuevafasedestinopreparacion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_sinfoadicionaldocdestinopreparacion);
RDebugUtils.currentLine=97255471;
 //BA.debugLineNum = 97255471;BA.debugLine="mNuevaFaseDocumento.NumExpFaseAdicional=sInfoAd";
__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .NumExpFaseAdicional /*String*/  = _sinfoadicionaldocdestinopreparacion;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=97255474;
 //BA.debugLineNum = 97255474;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnselnuevafase_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselnuevafase_click", false))
	 {return ((String) Debug.delegate(ba, "btnselnuevafase_click", null));}
RDebugUtils.currentLine=96993280;
 //BA.debugLineNum = 96993280;BA.debugLine="Private Sub btnSelNuevaFase_Click";
RDebugUtils.currentLine=96993281;
 //BA.debugLineNum = 96993281;BA.debugLine="SeleccionarNuevaFase";
__ref._seleccionarnuevafase /*void*/ (null);
RDebugUtils.currentLine=96993282;
 //BA.debugLineNum = 96993282;BA.debugLine="End Sub";
return "";
}
public String  _btnselnuevafasedestinopreparacion_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselnuevafasedestinopreparacion_click", false))
	 {return ((String) Debug.delegate(ba, "btnselnuevafasedestinopreparacion_click", null));}
RDebugUtils.currentLine=97189888;
 //BA.debugLineNum = 97189888;BA.debugLine="Private Sub btnSelNuevaFaseDestinoPreparacion_Clic";
RDebugUtils.currentLine=97189889;
 //BA.debugLineNum = 97189889;BA.debugLine="DatosSeleccionados=\"NuevaFaseAdicional\"";
__ref._datosseleccionados /*String*/  = "NuevaFaseAdicional";
RDebugUtils.currentLine=97189891;
 //BA.debugLineNum = 97189891;BA.debugLine="If mDestinatarioTaller Then";
if (__ref._mdestinatariotaller /*boolean*/ ) { 
RDebugUtils.currentLine=97189892;
 //BA.debugLineNum = 97189892;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int) (1),"SELECT IDFase, Fase FROM tblFasesDoc where TipoOrigenDoc='"+__ref._mtipodocumento /*String*/ +"' and DestinoTaller<>0 and DestinoPreparacion<>0 and IDFase=16 ORDER BY tblFasesDoc.OrdenSecuencial",(int) (0));
 }else {
RDebugUtils.currentLine=97189894;
 //BA.debugLineNum = 97189894;BA.debugLine="LoadDatosB4xSearchList(1,\"SELECT IDFase, Fase FR";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int) (1),"SELECT IDFase, Fase FROM tblFasesDoc where  TipoOrigenDoc='"+__ref._mtipodocumento /*String*/ +"' and DestinoPreparacion<>0 and IDFase<>16 ORDER BY tblFasesDoc.OrdenSecuencial",(int) (0));
 };
RDebugUtils.currentLine=97189896;
 //BA.debugLineNum = 97189896;BA.debugLine="End Sub";
return "";
}
public void  _loaddatosb4xsearchlist(b4j.docU.cnuevafasedocumento __ref,int _tipoquery,String _sclssource,int _id) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "loaddatosb4xsearchlist", false))
	 {Debug.delegate(ba, "loaddatosb4xsearchlist", new Object[] {_tipoquery,_sclssource,_id}); return;}
ResumableSub_LoadDatosB4xSearchList rsub = new ResumableSub_LoadDatosB4xSearchList(this,__ref,_tipoquery,_sclssource,_id);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadDatosB4xSearchList extends BA.ResumableSub {
public ResumableSub_LoadDatosB4xSearchList(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref,int _tipoquery,String _sclssource,int _id) {
this.parent = parent;
this.__ref = __ref;
this._tipoquery = _tipoquery;
this._sclssource = _sclssource;
this._id = _id;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
int _tipoquery;
String _sclssource;
int _id;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.collections.List _lstopcionesmap = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.objects.collections.Map _msel = null;
b4j.docU.b4xsearchtemplate _b4xsearchlistdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btcanceldlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lblb4xv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _sopcionsel = "";
int _indexsel = 0;
anywheresoftware.b4a.objects.collections.Map _mdatasel = null;
int _idsel = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=96862210;
 //BA.debugLineNum = 96862210;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=96862211;
 //BA.debugLineNum = 96862211;BA.debugLine="If TipoQuery=1 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_tipoquery==1) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=96862212;
 //BA.debugLineNum = 96862212;BA.debugLine="rs=mSQL.ExecQuery(sClsSource)";
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(_sclssource);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=96862214;
 //BA.debugLineNum = 96862214;BA.debugLine="rs=mSQL.ExecQuery2(sClsSource,Array As String(ID";
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(_sclssource,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_id)}));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=96862217;
 //BA.debugLineNum = 96862217;BA.debugLine="Dim lstOpcionesMap As List";
_lstopcionesmap = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=96862218;
 //BA.debugLineNum = 96862218;BA.debugLine="lstOpcionesMap.Initialize";
_lstopcionesmap.Initialize();
RDebugUtils.currentLine=96862220;
 //BA.debugLineNum = 96862220;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=96862221;
 //BA.debugLineNum = 96862221;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=96862223;
 //BA.debugLineNum = 96862223;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 7:
//do while
this.state = 10;
while (_rs.NextRow()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 7;
RDebugUtils.currentLine=96862224;
 //BA.debugLineNum = 96862224;BA.debugLine="Dim mSel As Map";
_msel = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96862225;
 //BA.debugLineNum = 96862225;BA.debugLine="mSel.Initialize";
_msel.Initialize();
RDebugUtils.currentLine=96862226;
 //BA.debugLineNum = 96862226;BA.debugLine="mSel.Put(\"ID\",rs.getint2(0))";
_msel.Put((Object)("ID"),(Object)(_rs.GetInt2((int) (0))));
RDebugUtils.currentLine=96862227;
 //BA.debugLineNum = 96862227;BA.debugLine="mSel.Put(\"Sel\",rs.getstring2(1))";
_msel.Put((Object)("Sel"),(Object)(_rs.GetString2((int) (1))));
RDebugUtils.currentLine=96862228;
 //BA.debugLineNum = 96862228;BA.debugLine="lstOpcionesMap.Add(mSel)";
_lstopcionesmap.Add((Object)(_msel.getObject()));
RDebugUtils.currentLine=96862229;
 //BA.debugLineNum = 96862229;BA.debugLine="lstOpciones.Add(rs.getstring2(1))";
_lstopciones.Add((Object)(_rs.GetString2((int) (1))));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=96862231;
 //BA.debugLineNum = 96862231;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=96862233;
 //BA.debugLineNum = 96862233;BA.debugLine="Dialog.Title=\"Selecciona Opción\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Opción");
RDebugUtils.currentLine=96862234;
 //BA.debugLineNum = 96862234;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=96862235;
 //BA.debugLineNum = 96862235;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=96862236;
 //BA.debugLineNum = 96862236;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=96862240;
 //BA.debugLineNum = 96862240;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
_b4xsearchlistdlg = new b4j.docU.b4xsearchtemplate();
RDebugUtils.currentLine=96862241;
 //BA.debugLineNum = 96862241;BA.debugLine="B4XSearchListDlg.Initialize";
_b4xsearchlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=96862242;
 //BA.debugLineNum = 96862242;BA.debugLine="B4XSearchListDlg.SetItems(lstOpciones)";
_b4xsearchlistdlg._setitems /*Object*/ (null,_lstopciones);
RDebugUtils.currentLine=96862243;
 //BA.debugLineNum = 96862243;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._hinttext /*String*/  = "Buscar";
RDebugUtils.currentLine=96862244;
 //BA.debugLineNum = 96862244;BA.debugLine="B4XSearchListDlg.SearchField.Update";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=96862245;
 //BA.debugLineNum = 96862245;BA.debugLine="B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA";
_b4xsearchlistdlg._itemhightlightcolor /*int*/  = ((int)0xff87cefa);
RDebugUtils.currentLine=96862246;
 //BA.debugLineNum = 96862246;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=96862249;
 //BA.debugLineNum = 96862249;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=96862250;
 //BA.debugLineNum = 96862250;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=96862253;
 //BA.debugLineNum = 96862253;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=96862254;
 //BA.debugLineNum = 96862254;BA.debugLine="Utilidades.SetLightThemeSearch(B4XSearchListDlg)";
parent._utilidades._setlightthemesearch /*String*/ (_b4xsearchlistdlg);
RDebugUtils.currentLine=96862256;
 //BA.debugLineNum = 96862256;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=96862257;
 //BA.debugLineNum = 96862257;BA.debugLine="Dim xclv As CustomListView=B4XSearchListDlg.Custo";
_xclv = _b4xsearchlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=96862258;
 //BA.debugLineNum = 96862258;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=96862263;
 //BA.debugLineNum = 96862263;BA.debugLine="B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParen";
_b4xsearchlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (400)),(int) (0.75*__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=96862265;
 //BA.debugLineNum = 96862265;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=96862271;
 //BA.debugLineNum = 96862271;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=96862272;
 //BA.debugLineNum = 96862272;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=96862273;
 //BA.debugLineNum = 96862273;BA.debugLine="Dim lblB4Xv As B4XView=dlbl";
_lblb4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblb4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_dlbl.getObject()));
RDebugUtils.currentLine=96862274;
 //BA.debugLineNum = 96862274;BA.debugLine="lblB4Xv.SetTextAlignment(\"CENTER\",\"LEFT\")";
_lblb4xv.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=96862276;
 //BA.debugLineNum = 96862276;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=96862277;
 //BA.debugLineNum = 96862277;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_bcancel.IsInitialized()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=96862278;
 //BA.debugLineNum = 96862278;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=96862279;
 //BA.debugLineNum = 96862279;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=96862280;
 //BA.debugLineNum = 96862280;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=96862283;
 //BA.debugLineNum = 96862283;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "loaddatosb4xsearchlist"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=96862284;
 //BA.debugLineNum = 96862284;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 15:
//if
this.state = 20;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) return ;
if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=96862286;
 //BA.debugLineNum = 96862286;BA.debugLine="Dim sOpcionSel As String=B4XSearchListDlg.Selecte";
_sopcionsel = _b4xsearchlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=96862287;
 //BA.debugLineNum = 96862287;BA.debugLine="Dim IndexSel As Int=lstOpciones.IndexOf(sOpcionSe";
_indexsel = _lstopciones.IndexOf((Object)(_sopcionsel));
RDebugUtils.currentLine=96862288;
 //BA.debugLineNum = 96862288;BA.debugLine="Dim mDataSel As Map=lstOpcionesMap.Get(IndexSel)";
_mdatasel = new anywheresoftware.b4a.objects.collections.Map();
_mdatasel = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstopcionesmap.Get(_indexsel)));
RDebugUtils.currentLine=96862289;
 //BA.debugLineNum = 96862289;BA.debugLine="Dim IDSel As Int=mDataSel.Get(\"ID\")";
_idsel = (int)(BA.ObjectToNumber(_mdatasel.Get((Object)("ID"))));
RDebugUtils.currentLine=96862306;
 //BA.debugLineNum = 96862306;BA.debugLine="ActualizarDatosOpcionSeleccionada(IDSel,sOpcionSe";
__ref._actualizardatosopcionseleccionada /*String*/ (null,_idsel,_sopcionsel);
RDebugUtils.currentLine=96862308;
 //BA.debugLineNum = 96862308;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselresponsablenuevafase_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselresponsablenuevafase_click", false))
	 {Debug.delegate(ba, "btnselresponsablenuevafase_click", null); return;}
ResumableSub_btnSelResponsableNuevaFase_Click rsub = new ResumableSub_btnSelResponsableNuevaFase_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelResponsableNuevaFase_Click extends BA.ResumableSub {
public ResumableSub_btnSelResponsableNuevaFase_Click(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
Object _msa = null;
int _rint = 0;
boolean _opcionnuevo = false;
String _srowsource = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=96600065;
 //BA.debugLineNum = 96600065;BA.debugLine="If txtNuevaFase.Text=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtnuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=96600066;
 //BA.debugLineNum = 96600066;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Selecciona an";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Selecciona antes la fase.","Aviso");
RDebugUtils.currentLine=96600067;
 //BA.debugLineNum = 96600067;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btnselresponsablenuevafase_click"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
RDebugUtils.currentLine=96600068;
 //BA.debugLineNum = 96600068;BA.debugLine="SeleccionarNuevaFase";
__ref._seleccionarnuevafase /*void*/ (null);
RDebugUtils.currentLine=96600069;
 //BA.debugLineNum = 96600069;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=96600072;
 //BA.debugLineNum = 96600072;BA.debugLine="If txtResponsableNuevaFase.Text<>\"\" Then";

case 4:
//if
this.state = 13;
if ((__ref._txtresponsablenuevafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=96600073;
 //BA.debugLineNum = 96600073;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Seleccion";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Seleccionar otro "+__ref._datosseleccionados /*String*/ +"?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=96600074;
 //BA.debugLineNum = 96600074;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "btnselresponsablenuevafase_click"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=96600075;
 //BA.debugLineNum = 96600075;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=96600077;
 //BA.debugLineNum = 96600077;BA.debugLine="txtInfoAdicionalDoc.Text=\"\"";
__ref._txtinfoadicionaldoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=96600083;
 //BA.debugLineNum = 96600083;BA.debugLine="Dim OpcionNuevo As Boolean=mSQL.ExecQuerySingleRe";
_opcionnuevo = (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select LimitarAListaResponsable from tblFasesDoc where IDFase=? And TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }))).equals(BA.NumberToString(1));
RDebugUtils.currentLine=96600085;
 //BA.debugLineNum = 96600085;BA.debugLine="DatosSeleccionados=\"ResponsableNuevaFase\"";
__ref._datosseleccionados /*String*/  = "ResponsableNuevaFase";
RDebugUtils.currentLine=96600086;
 //BA.debugLineNum = 96600086;BA.debugLine="Dim sRowSource As String";
_srowsource = "";
RDebugUtils.currentLine=96600087;
 //BA.debugLineNum = 96600087;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select Or";
_srowsource = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ ),__ref._mtipodocumento /*String*/ }));
RDebugUtils.currentLine=96600088;
 //BA.debugLineNum = 96600088;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
_srowsource = _srowsource.replace("=true","<>0");
RDebugUtils.currentLine=96600090;
 //BA.debugLineNum = 96600090;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.";
__ref._preloaddatoscls /*String*/ (null,(int) (1),_srowsource,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFase /*int*/ );
RDebugUtils.currentLine=96600139;
 //BA.debugLineNum = 96600139;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnselresponsablenuevafasedestinopreparacion_click(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "btnselresponsablenuevafasedestinopreparacion_click", false))
	 {return ((String) Debug.delegate(ba, "btnselresponsablenuevafasedestinopreparacion_click", null));}
String _srowsource = "";
RDebugUtils.currentLine=96534528;
 //BA.debugLineNum = 96534528;BA.debugLine="Private Sub btnSelResponsableNuevaFaseDestinoPrepa";
RDebugUtils.currentLine=96534529;
 //BA.debugLineNum = 96534529;BA.debugLine="DatosSeleccionados=\"ResponsableFaseAdicional\"";
__ref._datosseleccionados /*String*/  = "ResponsableFaseAdicional";
RDebugUtils.currentLine=96534530;
 //BA.debugLineNum = 96534530;BA.debugLine="Dim sRowSource As String";
_srowsource = "";
RDebugUtils.currentLine=96534531;
 //BA.debugLineNum = 96534531;BA.debugLine="sRowSource=mSQL.ExecQuerySingleResult2(\"select Or";
_srowsource = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select OrigenFilacboResponsable from tblFasesDoc where IDFase=? and TipoOrigenDoc=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ ),__ref._mtipodocumento /*String*/ }));
RDebugUtils.currentLine=96534532;
 //BA.debugLineNum = 96534532;BA.debugLine="sRowSource=sRowSource.Replace(\"=true\",\"<>0\")";
_srowsource = _srowsource.replace("=true","<>0");
RDebugUtils.currentLine=96534533;
 //BA.debugLineNum = 96534533;BA.debugLine="PreLoadDatosCls(1,sRowSource,mNuevaFaseDocumento.";
__ref._preloaddatoscls /*String*/ (null,(int) (1),_srowsource,__ref._mnuevafasedocumento /*b4j.docU.cnuevafasedocumento._nuevafasedocumento*/ .IDFaseDest /*int*/ );
RDebugUtils.currentLine=96534534;
 //BA.debugLineNum = 96534534;BA.debugLine="End Sub";
return "";
}
public String  _chkfijarfechanuevafase_checkedchange(b4j.docU.cnuevafasedocumento __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "chkfijarfechanuevafase_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "chkfijarfechanuevafase_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=96468992;
 //BA.debugLineNum = 96468992;BA.debugLine="Private Sub chkFijarFechaNuevaFase_CheckedChange(C";
RDebugUtils.currentLine=96468994;
 //BA.debugLineNum = 96468994;BA.debugLine="End Sub";
return "";
}
public String  _chkfijarnuevafase_checkedchange(b4j.docU.cnuevafasedocumento __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "chkfijarnuevafase_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "chkfijarnuevafase_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=96403456;
 //BA.debugLineNum = 96403456;BA.debugLine="Private Sub chkFijarNuevaFase_CheckedChange(Checke";
RDebugUtils.currentLine=96403458;
 //BA.debugLineNum = 96403458;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
RDebugUtils.currentLine=95813632;
 //BA.debugLineNum = 95813632;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=95813633;
 //BA.debugLineNum = 95813633;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=95813634;
 //BA.debugLineNum = 95813634;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=95813635;
 //BA.debugLineNum = 95813635;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=95813637;
 //BA.debugLineNum = 95813637;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=95813638;
 //BA.debugLineNum = 95813638;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=95813639;
 //BA.debugLineNum = 95813639;BA.debugLine="Private Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=95813641;
 //BA.debugLineNum = 95813641;BA.debugLine="Private mNuevaFaseDocumento As NuevaFaseDocumento";
_mnuevafasedocumento = new b4j.docU.cnuevafasedocumento._nuevafasedocumento();
RDebugUtils.currentLine=95813642;
 //BA.debugLineNum = 95813642;BA.debugLine="Private mDestinatarioTaller As Boolean";
_mdestinatariotaller = false;
RDebugUtils.currentLine=95813643;
 //BA.debugLineNum = 95813643;BA.debugLine="Private mOrdenFab As String";
_mordenfab = "";
RDebugUtils.currentLine=95813645;
 //BA.debugLineNum = 95813645;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=95813647;
 //BA.debugLineNum = 95813647;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=95813649;
 //BA.debugLineNum = 95813649;BA.debugLine="Private mDocumentoSel As String";
_mdocumentosel = "";
RDebugUtils.currentLine=95813650;
 //BA.debugLineNum = 95813650;BA.debugLine="Private mTipoDocumento As String";
_mtipodocumento = "";
RDebugUtils.currentLine=95813651;
 //BA.debugLineNum = 95813651;BA.debugLine="Private btnCancelarGrabarNuevaFase As Button";
_btncancelargrabarnuevafase = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813652;
 //BA.debugLineNum = 95813652;BA.debugLine="Private btnGrabarNuevaFase As Button";
_btngrabarnuevafase = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813653;
 //BA.debugLineNum = 95813653;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813654;
 //BA.debugLineNum = 95813654;BA.debugLine="Private btnSelDocumento As Button";
_btnseldocumento = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813655;
 //BA.debugLineNum = 95813655;BA.debugLine="Private btnSelFechaNuevaFase As Button";
_btnselfechanuevafase = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813656;
 //BA.debugLineNum = 95813656;BA.debugLine="Private btnSelInfoAdicionalDoc As Button";
_btnselinfoadicionaldoc = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813657;
 //BA.debugLineNum = 95813657;BA.debugLine="Private btnSelInfoAdicionalDocNuevaFaseDestinoPre";
_btnselinfoadicionaldocnuevafasedestinopreparacion = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813658;
 //BA.debugLineNum = 95813658;BA.debugLine="Private btnSelNuevaFaseDestinoPreparacion As Butt";
_btnselnuevafasedestinopreparacion = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813659;
 //BA.debugLineNum = 95813659;BA.debugLine="Private btnSelNuevaFase As Button";
_btnselnuevafase = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813660;
 //BA.debugLineNum = 95813660;BA.debugLine="Private btnSelResponsableNuevaFase As Button";
_btnselresponsablenuevafase = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813661;
 //BA.debugLineNum = 95813661;BA.debugLine="Private btnSelResponsableNuevaFaseDestinoPreparac";
_btnselresponsablenuevafasedestinopreparacion = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=95813662;
 //BA.debugLineNum = 95813662;BA.debugLine="Private chkFijarFechaNuevaFase As CheckBox";
_chkfijarfechanuevafase = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=95813663;
 //BA.debugLineNum = 95813663;BA.debugLine="Private chkFijarNuevaFase As CheckBox";
_chkfijarnuevafase = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=95813665;
 //BA.debugLineNum = 95813665;BA.debugLine="Private lblTitleDocumento As Label";
_lbltitledocumento = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813666;
 //BA.debugLineNum = 95813666;BA.debugLine="Private lblTitleFechaNuevaFase As Label";
_lbltitlefechanuevafase = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813667;
 //BA.debugLineNum = 95813667;BA.debugLine="Private lblTitleInfoAdicionalDoc As Label";
_lbltitleinfoadicionaldoc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813668;
 //BA.debugLineNum = 95813668;BA.debugLine="Private lblTitleNuevaFase As Label";
_lbltitlenuevafase = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813669;
 //BA.debugLineNum = 95813669;BA.debugLine="Private lblTitleResponsableNuevaFase As Label";
_lbltitleresponsablenuevafase = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813670;
 //BA.debugLineNum = 95813670;BA.debugLine="Private lblTitleResponsableNuevaFaseDestinoPrepar";
_lbltitleresponsablenuevafasedestinopreparacion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813671;
 //BA.debugLineNum = 95813671;BA.debugLine="Private txtDocumento As TextField";
_txtdocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813672;
 //BA.debugLineNum = 95813672;BA.debugLine="Private txtFechaNuevaFase As TextField";
_txtfechanuevafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813673;
 //BA.debugLineNum = 95813673;BA.debugLine="Private txtInfoAdicionalDoc As TextField";
_txtinfoadicionaldoc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813674;
 //BA.debugLineNum = 95813674;BA.debugLine="Private txtNuevaFaseDestinoPreparacion As TextFie";
_txtnuevafasedestinopreparacion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813675;
 //BA.debugLineNum = 95813675;BA.debugLine="Private txtNuevaFase As TextField";
_txtnuevafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813676;
 //BA.debugLineNum = 95813676;BA.debugLine="Private txtResponsableNuevaFase As TextField";
_txtresponsablenuevafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813677;
 //BA.debugLineNum = 95813677;BA.debugLine="Private txtResponsableNuevaFaseDestinoPreparacion";
_txtresponsablenuevafasedestinopreparacion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813678;
 //BA.debugLineNum = 95813678;BA.debugLine="Private lblTitleNuevaFaseDestinoPreparacion As La";
_lbltitlenuevafasedestinopreparacion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813679;
 //BA.debugLineNum = 95813679;BA.debugLine="Private lblTitleInfoAdicionalNuevaFaseDestinoPrep";
_lbltitleinfoadicionalnuevafasedestinopreparacion = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=95813680;
 //BA.debugLineNum = 95813680;BA.debugLine="Private txtInfoAdicionalNuevaFaseDestinoPreparaci";
_txtinfoadicionalnuevafasedestinopreparacion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=95813683;
 //BA.debugLineNum = 95813683;BA.debugLine="Private DatosSeleccionados As String";
_datosseleccionados = "";
RDebugUtils.currentLine=95813684;
 //BA.debugLineNum = 95813684;BA.debugLine="Private SourceTableCls, stringSourceTableCls,Tipo";
_sourcetablecls = "";
_stringsourcetablecls = "";
_tipoqrycls = "";
RDebugUtils.currentLine=95813686;
 //BA.debugLineNum = 95813686;BA.debugLine="Private IDDatosCls As Int";
_iddatoscls = 0;
RDebugUtils.currentLine=95813687;
 //BA.debugLineNum = 95813687;BA.debugLine="Private Obstmp As String";
_obstmp = "";
RDebugUtils.currentLine=95813689;
 //BA.debugLineNum = 95813689;BA.debugLine="Type NuevaFaseDocumento (FechaFase As Long, IDFas";
;
RDebugUtils.currentLine=95813692;
 //BA.debugLineNum = 95813692;BA.debugLine="Private pnlNuevaFaseComplementaria As Pane";
_pnlnuevafasecomplementaria = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=95813694;
 //BA.debugLineNum = 95813694;BA.debugLine="Private NuevaFaseDocumentoRegistrada As Boolean";
_nuevafasedocumentoregistrada = false;
RDebugUtils.currentLine=95813695;
 //BA.debugLineNum = 95813695;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cnuevafasedocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
anywheresoftware.b4a.objects.collections.Map _f = null;
RDebugUtils.currentLine=96272384;
 //BA.debugLineNum = 96272384;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=96272386;
 //BA.debugLineNum = 96272386;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblFasesDoc"}))));
RDebugUtils.currentLine=96272387;
 //BA.debugLineNum = 96272387;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=96272388;
 //BA.debugLineNum = 96272388;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblFasesDoc\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblFasesDoc");
 };
RDebugUtils.currentLine=96272390;
 //BA.debugLineNum = 96272390;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=96272391;
 //BA.debugLineNum = 96272391;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=96272392;
 //BA.debugLineNum = 96272392;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblFasesDoc (");
RDebugUtils.currentLine=96272394;
 //BA.debugLineNum = 96272394;BA.debugLine="sbCrearTabla.Append(\"TipoOrigenDoc TEXT,\")";
_sbcreartabla.Append("TipoOrigenDoc TEXT,");
RDebugUtils.currentLine=96272395;
 //BA.debugLineNum = 96272395;BA.debugLine="sbCrearTabla.Append(\"IDFase INTEGER,\")";
_sbcreartabla.Append("IDFase INTEGER,");
RDebugUtils.currentLine=96272396;
 //BA.debugLineNum = 96272396;BA.debugLine="sbCrearTabla.Append(\"OrdenSecuencial INTEGER,\")";
_sbcreartabla.Append("OrdenSecuencial INTEGER,");
RDebugUtils.currentLine=96272397;
 //BA.debugLineNum = 96272397;BA.debugLine="sbCrearTabla.Append(\"Agrupable INTEGER,\")";
_sbcreartabla.Append("Agrupable INTEGER,");
RDebugUtils.currentLine=96272398;
 //BA.debugLineNum = 96272398;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT,\")";
_sbcreartabla.Append("Fase TEXT,");
RDebugUtils.currentLine=96272399;
 //BA.debugLineNum = 96272399;BA.debugLine="sbCrearTabla.Append(\"AreaFase TEXT,\")";
_sbcreartabla.Append("AreaFase TEXT,");
RDebugUtils.currentLine=96272400;
 //BA.debugLineNum = 96272400;BA.debugLine="sbCrearTabla.Append(\"DestinoPreparacion INTEGER,\"";
_sbcreartabla.Append("DestinoPreparacion INTEGER,");
RDebugUtils.currentLine=96272401;
 //BA.debugLineNum = 96272401;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER,\")";
_sbcreartabla.Append("Gestionado INTEGER,");
RDebugUtils.currentLine=96272402;
 //BA.debugLineNum = 96272402;BA.debugLine="sbCrearTabla.Append(\"cboResponsableVisible INTEGE";
_sbcreartabla.Append("cboResponsableVisible INTEGER,");
RDebugUtils.currentLine=96272403;
 //BA.debugLineNum = 96272403;BA.debugLine="sbCrearTabla.Append(\"TextoEtiquetaResponsable TEX";
_sbcreartabla.Append("TextoEtiquetaResponsable TEXT,");
RDebugUtils.currentLine=96272404;
 //BA.debugLineNum = 96272404;BA.debugLine="sbCrearTabla.Append(\"OrigenResponsableMovFase TEX";
_sbcreartabla.Append("OrigenResponsableMovFase TEXT,");
RDebugUtils.currentLine=96272405;
 //BA.debugLineNum = 96272405;BA.debugLine="sbCrearTabla.Append(\"OrigenFilaCboResponsable TEX";
_sbcreartabla.Append("OrigenFilaCboResponsable TEXT,");
RDebugUtils.currentLine=96272406;
 //BA.debugLineNum = 96272406;BA.debugLine="sbCrearTabla.Append(\"LimitarAListaResponsable INT";
_sbcreartabla.Append("LimitarAListaResponsable INTEGER,");
RDebugUtils.currentLine=96272407;
 //BA.debugLineNum = 96272407;BA.debugLine="sbCrearTabla.Append(\"cboInfoAdicionalVisible INTE";
_sbcreartabla.Append("cboInfoAdicionalVisible INTEGER,");
RDebugUtils.currentLine=96272408;
 //BA.debugLineNum = 96272408;BA.debugLine="sbCrearTabla.Append(\"txtInfoAdicionalVisible INTE";
_sbcreartabla.Append("txtInfoAdicionalVisible INTEGER,");
RDebugUtils.currentLine=96272409;
 //BA.debugLineNum = 96272409;BA.debugLine="sbCrearTabla.Append(\"TextoEtiquetaInfoAdicional T";
_sbcreartabla.Append("TextoEtiquetaInfoAdicional TEXT,");
RDebugUtils.currentLine=96272410;
 //BA.debugLineNum = 96272410;BA.debugLine="sbCrearTabla.Append(\"OrigenFilacboInfoAdicional T";
_sbcreartabla.Append("OrigenFilacboInfoAdicional TEXT,");
RDebugUtils.currentLine=96272411;
 //BA.debugLineNum = 96272411;BA.debugLine="sbCrearTabla.Append(\"LimitarAListaInfoAdicional I";
_sbcreartabla.Append("LimitarAListaInfoAdicional INTEGER,");
RDebugUtils.currentLine=96272412;
 //BA.debugLineNum = 96272412;BA.debugLine="sbCrearTabla.Append(\"InformeExpediciones INTEGER,";
_sbcreartabla.Append("InformeExpediciones INTEGER,");
RDebugUtils.currentLine=96272413;
 //BA.debugLineNum = 96272413;BA.debugLine="sbCrearTabla.Append(\"DestinoTaller INTEGER)\")";
_sbcreartabla.Append("DestinoTaller INTEGER)");
RDebugUtils.currentLine=96272414;
 //BA.debugLineNum = 96272414;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=96272416;
 //BA.debugLineNum = 96272416;BA.debugLine="DBUtils.DropTable(mSQL,\"tblTipificacionInfoAdicio";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblTipificacionInfoAdicionalFases");
RDebugUtils.currentLine=96272417;
 //BA.debugLineNum = 96272417;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272418;
 //BA.debugLineNum = 96272418;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272419;
 //BA.debugLineNum = 96272419;BA.debugLine="f.Put(\"TipoOrigenDoc\",DBUtils.DB_TEXT)";
_f.Put((Object)("TipoOrigenDoc"),(Object)(_dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=96272420;
 //BA.debugLineNum = 96272420;BA.debugLine="f.Put(\"IDFase\",DBUtils.DB_INTEGER)";
_f.Put((Object)("IDFase"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272421;
 //BA.debugLineNum = 96272421;BA.debugLine="f.Put(\"IDInfoAdicional\",DBUtils.DB_INTEGER)";
_f.Put((Object)("IDInfoAdicional"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272422;
 //BA.debugLineNum = 96272422;BA.debugLine="f.Put(\"InfoAdicional\",DBUtils.DB_TEXT)";
_f.Put((Object)("InfoAdicional"),(Object)(_dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=96272423;
 //BA.debugLineNum = 96272423;BA.debugLine="DBUtils.CreateTable(mSQL,\"tbltipificacioninfoadic";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tbltipificacioninfoadicionalfases",_f,"");
RDebugUtils.currentLine=96272426;
 //BA.debugLineNum = 96272426;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboResponsabl";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboResponsableNuevafase");
RDebugUtils.currentLine=96272427;
 //BA.debugLineNum = 96272427;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272428;
 //BA.debugLineNum = 96272428;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272429;
 //BA.debugLineNum = 96272429;BA.debugLine="f.Put(\"IDResponsableNuevaFase\",DBUtils.DB_INTEGER";
_f.Put((Object)("IDResponsableNuevaFase"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272430;
 //BA.debugLineNum = 96272430;BA.debugLine="f.Put(\"ResponsableNuevaFase\",DBUtils.DB_INTEGER)";
_f.Put((Object)("ResponsableNuevaFase"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272431;
 //BA.debugLineNum = 96272431;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboResponsa";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboResponsableNuevafase",_f,"");
RDebugUtils.currentLine=96272434;
 //BA.debugLineNum = 96272434;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboResponsabl";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboResponsableNuevaFaseAdicional");
RDebugUtils.currentLine=96272435;
 //BA.debugLineNum = 96272435;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272436;
 //BA.debugLineNum = 96272436;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272437;
 //BA.debugLineNum = 96272437;BA.debugLine="f.Put(\"IDResponsableNuevaFaseAdicional\",DBUtils.D";
_f.Put((Object)("IDResponsableNuevaFaseAdicional"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272438;
 //BA.debugLineNum = 96272438;BA.debugLine="f.Put(\"ResponsableNuevaFaseAdicional\",DBUtils.DB_";
_f.Put((Object)("ResponsableNuevaFaseAdicional"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272439;
 //BA.debugLineNum = 96272439;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboResponsa";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboResponsableNuevafaseAdicional",_f,"");
RDebugUtils.currentLine=96272442;
 //BA.debugLineNum = 96272442;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboInfoAdicio";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboInfoAdicionalNuevafase");
RDebugUtils.currentLine=96272443;
 //BA.debugLineNum = 96272443;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272444;
 //BA.debugLineNum = 96272444;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272445;
 //BA.debugLineNum = 96272445;BA.debugLine="f.Put(\"IDInfoAdicionalNuevaFase\",DBUtils.DB_INTEG";
_f.Put((Object)("IDInfoAdicionalNuevaFase"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272446;
 //BA.debugLineNum = 96272446;BA.debugLine="f.Put(\"InfoAdicionalNuevaFase\",DBUtils.DB_INTEGER";
_f.Put((Object)("InfoAdicionalNuevaFase"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272447;
 //BA.debugLineNum = 96272447;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboInfoAdic";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboInfoAdicionalNuevafase",_f,"");
RDebugUtils.currentLine=96272449;
 //BA.debugLineNum = 96272449;BA.debugLine="DBUtils.DropTable(mSQL,\"tblRowSourceCboInfoAdicio";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboInfoAdicionalNuevafaseAdicional");
RDebugUtils.currentLine=96272450;
 //BA.debugLineNum = 96272450;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272451;
 //BA.debugLineNum = 96272451;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272452;
 //BA.debugLineNum = 96272452;BA.debugLine="f.Put(\"IDInfoAdicionalNuevaFaseAdicional\",DBUtils";
_f.Put((Object)("IDInfoAdicionalNuevaFaseAdicional"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272453;
 //BA.debugLineNum = 96272453;BA.debugLine="f.Put(\"IDInfoAdicionalNuevaFaseAdicional\",DBUtils";
_f.Put((Object)("IDInfoAdicionalNuevaFaseAdicional"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272454;
 //BA.debugLineNum = 96272454;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblRowSourceCboInfoAdic";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRowSourceCboInfoAdicionalNuevafaseAdicional",_f,"");
RDebugUtils.currentLine=96272456;
 //BA.debugLineNum = 96272456;BA.debugLine="DBUtils.DropTable(mSQL,\"vwEmpleados\")";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"vwEmpleados");
RDebugUtils.currentLine=96272457;
 //BA.debugLineNum = 96272457;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272458;
 //BA.debugLineNum = 96272458;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272459;
 //BA.debugLineNum = 96272459;BA.debugLine="f.Put(\"IDEmpleado\",DBUtils.DB_INTEGER)";
_f.Put((Object)("IDEmpleado"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272460;
 //BA.debugLineNum = 96272460;BA.debugLine="f.Put(\"Empleado\",DBUtils.DB_TEXT)";
_f.Put((Object)("Empleado"),(Object)(_dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=96272461;
 //BA.debugLineNum = 96272461;BA.debugLine="f.Put(\"Preparacion\",DBUtils.DB_INTEGER)";
_f.Put((Object)("Preparacion"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272462;
 //BA.debugLineNum = 96272462;BA.debugLine="DBUtils.CreateTable(mSQL,\"vwEmpleados\",f,\"\")";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"vwEmpleados",_f,"");
RDebugUtils.currentLine=96272465;
 //BA.debugLineNum = 96272465;BA.debugLine="DBUtils.DropTable(mSQL,\"vwempleadosactivos\")";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"vwempleadosactivos");
RDebugUtils.currentLine=96272466;
 //BA.debugLineNum = 96272466;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272467;
 //BA.debugLineNum = 96272467;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272468;
 //BA.debugLineNum = 96272468;BA.debugLine="f.Put(\"IDEmpleado\",DBUtils.DB_INTEGER)";
_f.Put((Object)("IDEmpleado"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272469;
 //BA.debugLineNum = 96272469;BA.debugLine="f.Put(\"Empleado\",DBUtils.DB_TEXT)";
_f.Put((Object)("Empleado"),(Object)(_dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=96272470;
 //BA.debugLineNum = 96272470;BA.debugLine="f.Put(\"Preparacion\",DBUtils.DB_INTEGER)";
_f.Put((Object)("Preparacion"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272471;
 //BA.debugLineNum = 96272471;BA.debugLine="DBUtils.CreateTable(mSQL,\"vwempleadosactivos\",f,\"";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"vwempleadosactivos",_f,"");
RDebugUtils.currentLine=96272474;
 //BA.debugLineNum = 96272474;BA.debugLine="DBUtils.DropTable(mSQL,\"tblTransporte\")";
_dbutils._droptable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblTransporte");
RDebugUtils.currentLine=96272475;
 //BA.debugLineNum = 96272475;BA.debugLine="Dim f As Map";
_f = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=96272476;
 //BA.debugLineNum = 96272476;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=96272477;
 //BA.debugLineNum = 96272477;BA.debugLine="f.Put(\"IDTransporte\",DBUtils.DB_INTEGER)";
_f.Put((Object)("IDTransporte"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272478;
 //BA.debugLineNum = 96272478;BA.debugLine="f.Put(\"Transporte\",DBUtils.DB_TEXT)";
_f.Put((Object)("Transporte"),(Object)(_dbutils._db_text /*String*/ ));
RDebugUtils.currentLine=96272479;
 //BA.debugLineNum = 96272479;BA.debugLine="f.Put(\"RequiereNumeroExpedicion\",DBUtils.DB_INTEG";
_f.Put((Object)("RequiereNumeroExpedicion"),(Object)(_dbutils._db_integer /*String*/ ));
RDebugUtils.currentLine=96272480;
 //BA.debugLineNum = 96272480;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblTransporte\",f,\"\")";
_dbutils._createtable /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblTransporte",_f,"");
RDebugUtils.currentLine=96272483;
 //BA.debugLineNum = 96272483;BA.debugLine="End Sub";
return "";
}
public String  _faseadicionalvisible(b4j.docU.cnuevafasedocumento __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "faseadicionalvisible", false))
	 {return ((String) Debug.delegate(ba, "faseadicionalvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=97124352;
 //BA.debugLineNum = 97124352;BA.debugLine="Sub FaseAdicionalVisible(Visible As Boolean)";
RDebugUtils.currentLine=97124365;
 //BA.debugLineNum = 97124365;BA.debugLine="pnlNuevaFaseComplementaria.Visible=Visible";
__ref._pnlnuevafasecomplementaria /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=97124366;
 //BA.debugLineNum = 97124366;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cnuevafasedocumento __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=96010240;
 //BA.debugLineNum = 96010240;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=96010241;
 //BA.debugLineNum = 96010241;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=96010242;
 //BA.debugLineNum = 96010242;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getdatefromheaders(b4j.docU.cnuevafasedocumento __ref,String _url) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "getdatefromheaders", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getdatefromheaders", new Object[] {_url}));}
ResumableSub_GetDateFromHeaders rsub = new ResumableSub_GetDateFromHeaders(this,__ref,_url);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetDateFromHeaders extends BA.ResumableSub {
public ResumableSub_GetDateFromHeaders(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref,String _url) {
this.parent = parent;
this.__ref = __ref;
this._url = _url;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _url;
b4j.docU.httpjob _j = null;
long _res = 0L;
String _date = "";
String _f = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=97976321;
 //BA.debugLineNum = 97976321;BA.debugLine="Dim j As HttpJob";
_j = new b4j.docU.httpjob();
RDebugUtils.currentLine=97976322;
 //BA.debugLineNum = 97976322;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=97976323;
 //BA.debugLineNum = 97976323;BA.debugLine="j.Download(Url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=97976324;
 //BA.debugLineNum = 97976324;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=97976325;
 //BA.debugLineNum = 97976325;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "getdatefromheaders"), (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=97976326;
 //BA.debugLineNum = 97976326;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=97976327;
 //BA.debugLineNum = 97976327;BA.debugLine="If j.Response.GetHeaders.ContainsKey(\"date";
if (true) break;

case 4:
//if
this.state = 13;
if (_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders().ContainsKey((Object)("date"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=97976328;
 //BA.debugLineNum = 97976328;BA.debugLine="Dim date As String = j.Response.GetHea";
_date = BA.ObjectToString(_j._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .GetHeaders().Get((Object)("date")));
RDebugUtils.currentLine=97976329;
 //BA.debugLineNum = 97976329;BA.debugLine="date = date.Replace(\"[\", \"\").Replace(\"";
_date = _date.replace("[","").replace("]","");
RDebugUtils.currentLine=97976330;
 //BA.debugLineNum = 97976330;BA.debugLine="Dim f As String = DateTime.DateFormat";
_f = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=97976331;
 //BA.debugLineNum = 97976331;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
RDebugUtils.currentLine=97976332;
 //BA.debugLineNum = 97976332;BA.debugLine="DateTime.DateFormat = \"EEE, dd MMM";
parent.__c.DateTime.setDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
RDebugUtils.currentLine=97976333;
 //BA.debugLineNum = 97976333;BA.debugLine="res = DateTime.DateParse(date)";
_res = parent.__c.DateTime.DateParse(_date);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=97976335;
 //BA.debugLineNum = 97976335;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("897976335",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=97976337;
 //BA.debugLineNum = 97976337;BA.debugLine="DateTime.DateFormat = f";
parent.__c.DateTime.setDateFormat(_f);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=97976340;
 //BA.debugLineNum = 97976340;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=97976341;
 //BA.debugLineNum = 97976341;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=97976342;
 //BA.debugLineNum = 97976342;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _tbltipificacioninfoadicionalfases(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "tbltipificacioninfoadicionalfases", false))
	 {Debug.delegate(ba, "tbltipificacioninfoadicionalfases", null); return;}
ResumableSub_tblTipificacionInfoAdicionalFases rsub = new ResumableSub_tblTipificacionInfoAdicionalFases(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_tblTipificacionInfoAdicionalFases extends BA.ResumableSub {
public ResumableSub_tblTipificacionInfoAdicionalFases(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98172929;
 //BA.debugLineNum = 98172929;BA.debugLine="Wait For(ActualizarTipificacionInfoAdicionalFases";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "tbltipificacioninfoadicionalfases"), __ref._actualizartipificacioninfoadicionalfases /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accion = (String) result[1];
;
RDebugUtils.currentLine=98172930;
 //BA.debugLineNum = 98172930;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("Salir")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=98172931;
 //BA.debugLineNum = 98172931;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=98172932;
 //BA.debugLineNum = 98172932;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=98172934;
 //BA.debugLineNum = 98172934;BA.debugLine="LoadDatosB4xSearchList(TipoQryCls, stringSourceTa";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int)(Double.parseDouble(__ref._tipoqrycls /*String*/ )),__ref._stringsourcetablecls /*String*/ ,__ref._iddatoscls /*int*/ );
RDebugUtils.currentLine=98172935;
 //BA.debugLineNum = 98172935;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _tbltransporte(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "tbltransporte", false))
	 {Debug.delegate(ba, "tbltransporte", null); return;}
ResumableSub_tblTransporte rsub = new ResumableSub_tblTransporte(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_tblTransporte extends BA.ResumableSub {
public ResumableSub_tblTransporte(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98041857;
 //BA.debugLineNum = 98041857;BA.debugLine="Wait For(ActualizarTransportes) complete (Accion";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "tbltransporte"), __ref._actualizartransportes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accion = (String) result[1];
;
RDebugUtils.currentLine=98041858;
 //BA.debugLineNum = 98041858;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("Salir")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=98041859;
 //BA.debugLineNum = 98041859;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=98041860;
 //BA.debugLineNum = 98041860;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=98041862;
 //BA.debugLineNum = 98041862;BA.debugLine="LoadDatosB4xSearchList(TipoQryCls, stringSourceTa";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int)(Double.parseDouble(__ref._tipoqrycls /*String*/ )),__ref._stringsourcetablecls /*String*/ ,__ref._iddatoscls /*int*/ );
RDebugUtils.currentLine=98041863;
 //BA.debugLineNum = 98041863;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _vwempleadosactivos(b4j.docU.cnuevafasedocumento __ref) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";
if (Debug.shouldDelegate(ba, "vwempleadosactivos", false))
	 {Debug.delegate(ba, "vwempleadosactivos", null); return;}
ResumableSub_vwempleadosactivos rsub = new ResumableSub_vwempleadosactivos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_vwempleadosactivos extends BA.ResumableSub {
public ResumableSub_vwempleadosactivos(b4j.docU.cnuevafasedocumento parent,b4j.docU.cnuevafasedocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cnuevafasedocumento __ref;
b4j.docU.cnuevafasedocumento parent;
String _accion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cnuevafasedocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=98304001;
 //BA.debugLineNum = 98304001;BA.debugLine="Wait For(Actualizarvwempleadosactivos) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cnuevafasedocumento", "vwempleadosactivos"), __ref._actualizarvwempleadosactivos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_accion = (String) result[1];
;
RDebugUtils.currentLine=98304002;
 //BA.debugLineNum = 98304002;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("Salir")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=98304003;
 //BA.debugLineNum = 98304003;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=98304004;
 //BA.debugLineNum = 98304004;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=98304006;
 //BA.debugLineNum = 98304006;BA.debugLine="LoadDatosB4xSearchList(TipoQryCls, stringSourceTa";
__ref._loaddatosb4xsearchlist /*void*/ (null,(int)(Double.parseDouble(__ref._tipoqrycls /*String*/ )),__ref._stringsourcetablecls /*String*/ ,__ref._iddatoscls /*int*/ );
RDebugUtils.currentLine=98304007;
 //BA.debugLineNum = 98304007;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}