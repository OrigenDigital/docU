package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cfasesdocumento extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cfasesdocumento", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cfasesdocumento.class).invoke(this, new Object[] {null});
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
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _mdocumentosel = "";
public b4j.docU.jamtableclv _jamtableclvfasesdoc = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnaccionesfase = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkfaseactiva = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinfoadicionalfase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumeroexpedicion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtobservaciones = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtresponsablefase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechadocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtareafase = null;
public boolean _destinatariotaller = false;
public String _osubtaller = "";
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlecodigodestinodoc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodigodestinodoc = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlenombredestinodoc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombredestinodoc = null;
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
public String  _initialize(b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,String _documentosel) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_documentosel}));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=30015491;
 //BA.debugLineNum = 30015491;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=30015492;
 //BA.debugLineNum = 30015492;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("b4xdialog_background"));
RDebugUtils.currentLine=30015493;
 //BA.debugLineNum = 30015493;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=30015494;
 //BA.debugLineNum = 30015494;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=30015497;
 //BA.debugLineNum = 30015497;BA.debugLine="mDocumentoSel=DocumentoSel";
__ref._mdocumentosel /*String*/  = _documentosel;
RDebugUtils.currentLine=30015498;
 //BA.debugLineNum = 30015498;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cfasesdocumento __ref) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=30146566;
 //BA.debugLineNum = 30146566;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="frm.RootPane.LoadLayout(\"scrFasesDocumento\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrFasesDocumento");
RDebugUtils.currentLine=30146568;
 //BA.debugLineNum = 30146568;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "show"),(int) (0));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=30146571;
 //BA.debugLineNum = 30146571;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Fases Documen";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Fases Documento");
RDebugUtils.currentLine=30146573;
 //BA.debugLineNum = 30146573;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=30146574;
 //BA.debugLineNum = 30146574;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=30146576;
 //BA.debugLineNum = 30146576;BA.debugLine="JamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=30146578;
 //BA.debugLineNum = 30146578;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=30146580;
 //BA.debugLineNum = 30146580;BA.debugLine="txtDocumento.Text=\"\"";
__ref._txtdocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=30146581;
 //BA.debugLineNum = 30146581;BA.debugLine="LimpiarDatosDocumento";
__ref._limpiardatosdocumento /*String*/ (null);
RDebugUtils.currentLine=30146585;
 //BA.debugLineNum = 30146585;BA.debugLine="JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFas";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._menubartabla /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=30146586;
 //BA.debugLineNum = 30146586;BA.debugLine="JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFas";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=30146587;
 //BA.debugLineNum = 30146587;BA.debugLine="JamTableCLVFasesDoc.EstadoMenuItem(JamTableCLVFas";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=30146588;
 //BA.debugLineNum = 30146588;BA.debugLine="JamTableCLVFasesDoc.AddMenuItemFontAwesomeToMenuI";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Actualizar Datos Fases Documento","Actualizar",BA.ObjectToString(parent.__c.Chr(((int)0xf021))),__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=30146596;
 //BA.debugLineNum = 30146596;BA.debugLine="Dim rSub As ResumableSub=JamTableCLVFasesDoc.Conf";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._configurartableclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaFasesDocumentoNoCorregidas.json");
RDebugUtils.currentLine=30146597;
 //BA.debugLineNum = 30146597;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "show"), _rsub);
this.state = 16;
return;
case 16:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=30146598;
 //BA.debugLineNum = 30146598;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("830146598",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=30146599;
 //BA.debugLineNum = 30146599;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=30146600;
 //BA.debugLineNum = 30146600;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=30146601;
 //BA.debugLineNum = 30146601;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "show"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=30146602;
 //BA.debugLineNum = 30146602;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=30146603;
 //BA.debugLineNum = 30146603;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=30146607;
 //BA.debugLineNum = 30146607;BA.debugLine="JamTableCLVFasesDoc.AddMenuItemFontAwesomeToMenuI";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Nueva Fase","NuevaFase",BA.ObjectToString(parent.__c.Chr(((int)0xf196))),__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=30146610;
 //BA.debugLineNum = 30146610;BA.debugLine="JamTableCLVFasesDoc.AlturaItems=90dip";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._setalturaitems /*int*/ (null,parent.__c.DipToCurrent((int) (90)));
RDebugUtils.currentLine=30146612;
 //BA.debugLineNum = 30146612;BA.debugLine="JamTableCLVFasesDoc.ModoSeleccionItems=JamTableCL";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._setmodoseleccionitems /*String*/ (null,__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._modoseleccionindividualtemp /*String*/ );
RDebugUtils.currentLine=30146614;
 //BA.debugLineNum = 30146614;BA.debugLine="JamTableCLVFasesDoc.AlturaSeparadorPaneles=4dip";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._setalturaseparadorpaneles /*float*/ (null,(float) (parent.__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=30146624;
 //BA.debugLineNum = 30146624;BA.debugLine="If mDocumentoSel<>\"\" Then";
if (true) break;

case 5:
//if
this.state = 14;
if ((__ref._mdocumentosel /*String*/ ).equals("") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=30146625;
 //BA.debugLineNum = 30146625;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDoc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "show"), __ref._actualizardatostotalesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdocumentosel /*String*/ ));
this.state = 18;
return;
case 18:
//C
this.state = 8;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=30146626;
 //BA.debugLineNum = 30146626;BA.debugLine="If Success=False Then SalirModulo";
if (true) break;

case 8:
//if
this.state = 13;
if (_success==parent.__c.False) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
__ref._salirmodulo /*String*/ (null);
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
RDebugUtils.currentLine=30146628;
 //BA.debugLineNum = 30146628;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosnavdocumentosel(b4j.docU.cfasesdocumento __ref,String _docsel) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "actualizardatosnavdocumentosel", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosnavdocumentosel", new Object[] {_docsel}));}
ResumableSub_ActualizarDatosNavDocumentoSel rsub = new ResumableSub_ActualizarDatosNavDocumentoSel(this,__ref,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosNavDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarDatosNavDocumentoSel(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
String _docsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31195140;
 //BA.debugLineNum = 31195140;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
_slinkjrdc = parent._main._rdclinknav /*String*/ ;
RDebugUtils.currentLine=31195142;
 //BA.debugLineNum = 31195142;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=31195143;
 //BA.debugLineNum = 31195143;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("CDEV"),_docsel.startsWith("OSUB"))) {
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
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=31195145;
 //BA.debugLineNum = 31195145;BA.debugLine="Comando=\"CabFasesALBV\"";
_comando = "CabFasesALBV";
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=31195147;
 //BA.debugLineNum = 31195147;BA.debugLine="Comando=\"CabFasesRT\"";
_comando = "CabFasesRT";
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=31195149;
 //BA.debugLineNum = 31195149;BA.debugLine="Comando=\"CabFasesCDEV\"";
_comando = "CabFasesCDEV";
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=31195151;
 //BA.debugLineNum = 31195151;BA.debugLine="Comando=\"CabFasesProduccionPC\"";
_comando = "CabFasesProduccionPC";
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=31195153;
 //BA.debugLineNum = 31195153;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(DocSel & \" no";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_docsel+" no es un documento no válido."+parent.__c.CRLF+parent.__c.CRLF+"(sólo ALBV,RT,CDEV, Y OSUB.)","Aviso");
RDebugUtils.currentLine=31195154;
 //BA.debugLineNum = 31195154;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 12;
;
RDebugUtils.currentLine=31195155;
 //BA.debugLineNum = 31195155;BA.debugLine="mRes.Put(\"Accion\", \"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=31195156;
 //BA.debugLineNum = 31195156;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=31195159;
 //BA.debugLineNum = 31195159;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSe";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_docsel)},parent);
RDebugUtils.currentLine=31195161;
 //BA.debugLineNum = 31195161;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), null);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31195162;
 //BA.debugLineNum = 31195162;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 13:
//if
this.state = 24;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 24;
RDebugUtils.currentLine=31195163;
 //BA.debugLineNum = 31195163;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=31195164;
 //BA.debugLineNum = 31195164;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 24;
;
RDebugUtils.currentLine=31195165;
 //BA.debugLineNum = 31195165;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31195166;
 //BA.debugLineNum = 31195166;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=31195169;
 //BA.debugLineNum = 31195169;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 18:
//if
this.state = 23;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=31195170;
 //BA.debugLineNum = 31195170;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31195171;
 //BA.debugLineNum = 31195171;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31195172;
 //BA.debugLineNum = 31195172;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos en NAVISION para el documento seleccionado ("+_docsel+")","Aviso");
RDebugUtils.currentLine=31195173;
 //BA.debugLineNum = 31195173;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatosnavdocumentosel"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=31195175;
 //BA.debugLineNum = 31195175;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=31195176;
 //BA.debugLineNum = 31195176;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31195179;
 //BA.debugLineNum = 31195179;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31195180;
 //BA.debugLineNum = 31195180;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=31195190;
 //BA.debugLineNum = 31195190;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=31195191;
 //BA.debugLineNum = 31195191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatostotalesdocumentosel(b4j.docU.cfasesdocumento __ref,String _docsel) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "actualizardatostotalesdocumentosel", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatostotalesdocumentosel", new Object[] {_docsel}));}
ResumableSub_ActualizarDatosTotalesDocumentoSel rsub = new ResumableSub_ActualizarDatosTotalesDocumentoSel(this,__ref,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosTotalesDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarDatosTotalesDocumentoSel(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
String _docsel;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _osubrt = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.BA.IterableList group43;
int index43;
int groupLen43;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="OSUBTaller=\"\"";
__ref._osubtaller /*String*/  = "";
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Wait For(ActualizarDatosNavDocumentoSel(DocSel))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), __ref._actualizardatosnavdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_docsel));
this.state = 58;
return;
case 58:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="If Accion=\"NOK\" Then Return False";
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
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=31064070;
 //BA.debugLineNum = 31064070;BA.debugLine="If lstReg.Size=0 Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_lstreg.getSize()==0) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=31064071;
 //BA.debugLineNum = 31064071;BA.debugLine="Dim mData As Map=lstReg.Get(0)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=31064072;
 //BA.debugLineNum = 31064072;BA.debugLine="Log(mData)";
parent.__c.LogImpl("831064072",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=31064073;
 //BA.debugLineNum = 31064073;BA.debugLine="txtDocumento.Text=mDocumentoSel";
__ref._txtdocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._mdocumentosel /*String*/ );
RDebugUtils.currentLine=31064074;
 //BA.debugLineNum = 31064074;BA.debugLine="Select True";
if (true) break;

case 13:
//select
this.state = 22;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("CDEV"),_docsel.startsWith("OSUB"))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 22;
RDebugUtils.currentLine=31064076;
 //BA.debugLineNum = 31064076;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Cliente\"";
__ref._lbltitlecodigodestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Cliente");
RDebugUtils.currentLine=31064077;
 //BA.debugLineNum = 31064077;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Cliente\"";
__ref._lbltitlenombredestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Nombre Cliente");
RDebugUtils.currentLine=31064078;
 //BA.debugLineNum = 31064078;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Destinatari";
__ref._txtcodigodestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Destinatario"))));
RDebugUtils.currentLine=31064079;
 //BA.debugLineNum = 31064079;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreDesti";
__ref._txtnombredestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreDestinatario"))));
 if (true) break;

case 17:
//C
this.state = 22;
RDebugUtils.currentLine=31064081;
 //BA.debugLineNum = 31064081;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Codigo\"";
__ref._lbltitlecodigodestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Codigo");
RDebugUtils.currentLine=31064082;
 //BA.debugLineNum = 31064082;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Destinata";
__ref._lbltitlenombredestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Nombre Destinatario");
RDebugUtils.currentLine=31064083;
 //BA.debugLineNum = 31064083;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Destinatari";
__ref._txtcodigodestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Destinatario"))));
RDebugUtils.currentLine=31064084;
 //BA.debugLineNum = 31064084;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreDesti";
__ref._txtnombredestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreDestinatario"))));
 if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=31064086;
 //BA.debugLineNum = 31064086;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Proveedor\"";
__ref._lbltitlecodigodestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Proveedor");
RDebugUtils.currentLine=31064087;
 //BA.debugLineNum = 31064087;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Proveedor";
__ref._lbltitlenombredestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Nombre Proveedor");
RDebugUtils.currentLine=31064088;
 //BA.debugLineNum = 31064088;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Destinatari";
__ref._txtcodigodestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Destinatario"))));
RDebugUtils.currentLine=31064089;
 //BA.debugLineNum = 31064089;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreDesti";
__ref._txtnombredestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreDestinatario"))));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=31064091;
 //BA.debugLineNum = 31064091;BA.debugLine="lblTitleCodigoDestinoDoc.Text=\"Proveedor\"";
__ref._lbltitlecodigodestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Proveedor");
RDebugUtils.currentLine=31064092;
 //BA.debugLineNum = 31064092;BA.debugLine="lblTitleNombreDestinoDoc.Text=\"Nombre Proveedor";
__ref._lbltitlenombredestinodoc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Nombre Proveedor");
RDebugUtils.currentLine=31064093;
 //BA.debugLineNum = 31064093;BA.debugLine="txtCodigoDestinoDoc.Text=mData.Get(\"Proveedor\")";
__ref._txtcodigodestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Proveedor"))));
RDebugUtils.currentLine=31064094;
 //BA.debugLineNum = 31064094;BA.debugLine="txtNombreDestinoDoc.Text=mData.Get(\"NombreProve";
__ref._txtnombredestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreProveedor"))));
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=31064098;
 //BA.debugLineNum = 31064098;BA.debugLine="txtFechaDocumento.Text=mData.Get(\"Fecha\")";
__ref._txtfechadocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Fecha"))));
RDebugUtils.currentLine=31064100;
 //BA.debugLineNum = 31064100;BA.debugLine="If DocSel.StartsWith(\"RT\") Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_docsel.startsWith("RT")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=31064101;
 //BA.debugLineNum = 31064101;BA.debugLine="Dim OsubRT As String=mData.Get(\"PedidoFab\")";
_osubrt = BA.ObjectToString(_mdata.Get((Object)("PedidoFab")));
RDebugUtils.currentLine=31064102;
 //BA.debugLineNum = 31064102;BA.debugLine="DestinatarioTaller=OsubRT<>\"\"";
__ref._destinatariotaller /*boolean*/  = (_osubrt).equals("") == false;
RDebugUtils.currentLine=31064103;
 //BA.debugLineNum = 31064103;BA.debugLine="OSUBTaller=OsubRT";
__ref._osubtaller /*String*/  = _osubrt;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=31064106;
 //BA.debugLineNum = 31064106;BA.debugLine="JamTableCLVFasesDoc.Clear";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=31064108;
 //BA.debugLineNum = 31064108;BA.debugLine="Wait For(ActualizarFasesDocumentoSel(DocSel)) com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), __ref._actualizarfasesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_docsel));
this.state = 59;
return;
case 59:
//C
this.state = 27;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31064109;
 //BA.debugLineNum = 31064109;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=31064110;
 //BA.debugLineNum = 31064110;BA.debugLine="If Accion=\"NOK\" Then Return False";
if (true) break;

case 27:
//if
this.state = 32;
if ((_accion).equals("NOK")) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=31064111;
 //BA.debugLineNum = 31064111;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=31064112;
 //BA.debugLineNum = 31064112;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 33:
//for
this.state = 36;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group43 = _lstreg;
index43 = 0;
groupLen43 = group43.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 36;
if (index43 < groupLen43) {
this.state = 35;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group43.Get(index43)));}
if (true) break;

case 61:
//C
this.state = 60;
index43++;
if (true) break;

case 35:
//C
this.state = 61;
RDebugUtils.currentLine=31064113;
 //BA.debugLineNum = 31064113;BA.debugLine="Log(mData)";
parent.__c.LogImpl("831064113",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=31064116;
 //BA.debugLineNum = 31064116;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=31064118;
 //BA.debugLineNum = 31064118;BA.debugLine="Dim rSub As ResumableSub=JamTableCLVFasesDoc.setd";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=31064119;
 //BA.debugLineNum = 31064119;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _rsub);
this.state = 62;
return;
case 62:
//C
this.state = 37;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31064120;
 //BA.debugLineNum = 31064120;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=31064121;
 //BA.debugLineNum = 31064121;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 37:
//if
this.state = 57;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=31064122;
 //BA.debugLineNum = 31064122;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 40:
//if
this.state = 47;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=31064123;
 //BA.debugLineNum = 31064123;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=31064124;
 //BA.debugLineNum = 31064124;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 43;
;
RDebugUtils.currentLine=31064126;
 //BA.debugLineNum = 31064126;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=31064127;
 //BA.debugLineNum = 31064127;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 43;
_rint = (int) result[1];
;
RDebugUtils.currentLine=31064128;
 //BA.debugLineNum = 31064128;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 43:
//if
this.state = 46;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=31064129;
 //BA.debugLineNum = 31064129;BA.debugLine="JamTableCLVFasesDoc.AbrirCamposBuilder";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=31064130;
 //BA.debugLineNum = 31064130;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=31064133;
 //BA.debugLineNum = 31064133;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=31064135;
 //BA.debugLineNum = 31064135;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 47:
//if
this.state = 56;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=31064136;
 //BA.debugLineNum = 31064136;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 50:
//if
this.state = 55;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=31064137;
 //BA.debugLineNum = 31064137;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=31064138;
 //BA.debugLineNum = 31064138;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizardatostotalesdocumentosel"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = -1;
;
RDebugUtils.currentLine=31064143;
 //BA.debugLineNum = 31064143;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=31064144;
 //BA.debugLineNum = 31064144;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarfasesdocumentosel(b4j.docU.cfasesdocumento __ref,String _docsel) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "actualizarfasesdocumentosel", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarfasesdocumentosel", new Object[] {_docsel}));}
ResumableSub_ActualizarFasesDocumentoSel rsub = new ResumableSub_ActualizarFasesDocumentoSel(this,__ref,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarFasesDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarFasesDocumentoSel(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
String _docsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=31391749;
 //BA.debugLineNum = 31391749;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=31391750;
 //BA.debugLineNum = 31391750;BA.debugLine="Dim Comando As String=\"FasesDocNoCorregidasDateTi";
_comando = "FasesDocNoCorregidasDateTime";
RDebugUtils.currentLine=31391753;
 //BA.debugLineNum = 31391753;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSe";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_docsel)},parent);
RDebugUtils.currentLine=31391755;
 //BA.debugLineNum = 31391755;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizarfasesdocumentosel"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31391756;
 //BA.debugLineNum = 31391756;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=31391757;
 //BA.debugLineNum = 31391757;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=31391758;
 //BA.debugLineNum = 31391758;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizarfasesdocumentosel"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=31391759;
 //BA.debugLineNum = 31391759;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=31391760;
 //BA.debugLineNum = 31391760;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31391763;
 //BA.debugLineNum = 31391763;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=31391764;
 //BA.debugLineNum = 31391764;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=31391765;
 //BA.debugLineNum = 31391765;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31391766;
 //BA.debugLineNum = 31391766;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31391767;
 //BA.debugLineNum = 31391767;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=31391768;
 //BA.debugLineNum = 31391768;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=31391769;
 //BA.debugLineNum = 31391769;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de fases para el documento seleccionado ("+_docsel+")","Aviso");
RDebugUtils.currentLine=31391770;
 //BA.debugLineNum = 31391770;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizarfasesdocumentosel"), _msa);
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
RDebugUtils.currentLine=31391772;
 //BA.debugLineNum = 31391772;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=31391773;
 //BA.debugLineNum = 31391773;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31391774;
 //BA.debugLineNum = 31391774;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31391775;
 //BA.debugLineNum = 31391775;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=31391778;
 //BA.debugLineNum = 31391778;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=31391779;
 //BA.debugLineNum = 31391779;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarfaseactualdocumentosel(b4j.docU.cfasesdocumento __ref,String _docsel) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "actualizarfaseactualdocumentosel", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarfaseactualdocumentosel", new Object[] {_docsel}));}
ResumableSub_ActualizarFaseActualDocumentoSel rsub = new ResumableSub_ActualizarFaseActualDocumentoSel(this,__ref,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarFaseActualDocumentoSel extends BA.ResumableSub {
public ResumableSub_ActualizarFaseActualDocumentoSel(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
String _docsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=31326213;
 //BA.debugLineNum = 31326213;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=31326214;
 //BA.debugLineNum = 31326214;BA.debugLine="Dim Comando As String=\"FaseActualDocumentoSP\"";
_comando = "FaseActualDocumentoSP";
RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(DocSe";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_docsel)},parent);
RDebugUtils.currentLine=31326219;
 //BA.debugLineNum = 31326219;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizarfaseactualdocumentosel"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31326220;
 //BA.debugLineNum = 31326220;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=31326222;
 //BA.debugLineNum = 31326222;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizarfaseactualdocumentosel"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=31326224;
 //BA.debugLineNum = 31326224;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=31326228;
 //BA.debugLineNum = 31326228;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31326229;
 //BA.debugLineNum = 31326229;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31326230;
 //BA.debugLineNum = 31326230;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos en NAVISION para el documento seleccionado ("+_docsel+")","Aviso");
RDebugUtils.currentLine=31326231;
 //BA.debugLineNum = 31326231;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "actualizarfaseactualdocumentosel"), _msa);
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
RDebugUtils.currentLine=31326233;
 //BA.debugLineNum = 31326233;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=31326234;
 //BA.debugLineNum = 31326234;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31326235;
 //BA.debugLineNum = 31326235;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31326236;
 //BA.debugLineNum = 31326236;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=31326239;
 //BA.debugLineNum = 31326239;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=31326240;
 //BA.debugLineNum = 31326240;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _anularfase(b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "anularfase", false))
	 {Debug.delegate(ba, "anularfase", new Object[] {_mdata}); return;}
ResumableSub_AnularFase rsub = new ResumableSub_AnularFase(this,__ref,_mdata);
rsub.resume(ba, null);
}
public static class ResumableSub_AnularFase extends BA.ResumableSub {
public ResumableSub_AnularFase(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.objects.collections.Map _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
anywheresoftware.b4a.objects.collections.Map _mdata;
Object _msa = null;
int _rint = 0;
boolean _faseactiva = false;
String _accion = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Anular mov";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Anular movimiento seleccionado?","Anulación de Fase","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularfase"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = 7;
;
RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="Dim FaseActiva As Boolean=1=mData.Get(\"Mov\")";
_faseactiva = 1==(double)(BA.ObjectToNumber(_mdata.Get((Object)("Mov"))));
RDebugUtils.currentLine=31588366;
 //BA.debugLineNum = 31588366;BA.debugLine="If FaseActiva=False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_faseactiva==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=31588367;
 //BA.debugLineNum = 31588367;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo se puede";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo se puede anular la última fase del documento.","Aviso");
RDebugUtils.currentLine=31588368;
 //BA.debugLineNum = 31588368;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularfase"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 10;
;
RDebugUtils.currentLine=31588369;
 //BA.debugLineNum = 31588369;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=31588372;
 //BA.debugLineNum = 31588372;BA.debugLine="If DestinatarioTaller Then";

case 10:
//if
this.state = 27;
if (__ref._destinatariotaller /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=31588373;
 //BA.debugLineNum = 31588373;BA.debugLine="wait for (AnularMovimientoFaseRTFab(mData.Get(\"I";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularfase"), __ref._anularmovimientofasertfab /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(BA.ObjectToNumber(_mdata.Get((Object)("IDMov")))),__ref._mdocumentosel /*String*/ ,(int) (0),__ref._osubtaller /*String*/ ));
this.state = 36;
return;
case 36:
//C
this.state = 13;
_accion = (String) result[1];
;
RDebugUtils.currentLine=31588374;
 //BA.debugLineNum = 31588374;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 13:
//if
this.state = 18;
if ((_accion).equals("OK") == false) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 27;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=31588376;
 //BA.debugLineNum = 31588376;BA.debugLine="wait for (AnularMovimientoFaseDoc(mData.Get(\"IDM";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularfase"), __ref._anularmovimientofasedoc /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(BA.ObjectToNumber(_mdata.Get((Object)("IDMov")))),__ref._mdocumentosel /*String*/ ,(int) (0)));
this.state = 37;
return;
case 37:
//C
this.state = 21;
_accion = (String) result[1];
;
RDebugUtils.currentLine=31588377;
 //BA.debugLineNum = 31588377;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 21:
//if
this.state = 26;
if ((_accion).equals("OK") == false) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
if (true) return ;
if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=31588379;
 //BA.debugLineNum = 31588379;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDocu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularfase"), __ref._actualizardatostotalesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdocumentosel /*String*/ ));
this.state = 38;
return;
case 38:
//C
this.state = 28;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=31588380;
 //BA.debugLineNum = 31588380;BA.debugLine="If Success=False Then SalirModulo";
if (true) break;

case 28:
//if
this.state = 33;
if (_success==parent.__c.False) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
__ref._salirmodulo /*String*/ (null);
if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=31588381;
 //BA.debugLineNum = 31588381;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _anularmovimientofasertfab(b4j.docU.cfasesdocumento __ref,int _idmov,String _doc,int _idu,String _osub) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "anularmovimientofasertfab", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "anularmovimientofasertfab", new Object[] {_idmov,_doc,_idu,_osub}));}
ResumableSub_AnularMovimientoFaseRTFab rsub = new ResumableSub_AnularMovimientoFaseRTFab(this,__ref,_idmov,_doc,_idu,_osub);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AnularMovimientoFaseRTFab extends BA.ResumableSub {
public ResumableSub_AnularMovimientoFaseRTFab(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,int _idmov,String _doc,int _idu,String _osub) {
this.parent = parent;
this.__ref = __ref;
this._idmov = _idmov;
this._doc = _doc;
this._idu = _idu;
this._osub = _osub;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
int _idmov;
String _doc;
int _idu;
String _osub;
String _accion = "";
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=31653893;
 //BA.debugLineNum = 31653893;BA.debugLine="Dim Comando As String=\"AnularFaseRTFab\"";
_comando = "AnularFaseRTFab";
RDebugUtils.currentLine=31653896;
 //BA.debugLineNum = 31653896;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_idmov),(Object)(_doc),(Object)(_idu),(Object)(_osub)},parent);
RDebugUtils.currentLine=31653898;
 //BA.debugLineNum = 31653898;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasertfab"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31653899;
 //BA.debugLineNum = 31653899;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=31653900;
 //BA.debugLineNum = 31653900;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=31653901;
 //BA.debugLineNum = 31653901;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasertfab"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=31653902;
 //BA.debugLineNum = 31653902;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31653906;
 //BA.debugLineNum = 31653906;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=31653907;
 //BA.debugLineNum = 31653907;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31653909;
 //BA.debugLineNum = 31653909;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible anular la fase.","Aviso");
RDebugUtils.currentLine=31653910;
 //BA.debugLineNum = 31653910;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasertfab"), _msa);
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
RDebugUtils.currentLine=31653912;
 //BA.debugLineNum = 31653912;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31653913;
 //BA.debugLineNum = 31653913;BA.debugLine="Dim mResp As Map=lstRes.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=31653914;
 //BA.debugLineNum = 31653914;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=31653915;
 //BA.debugLineNum = 31653915;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
RDebugUtils.currentLine=31653916;
 //BA.debugLineNum = 31653916;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31653918;
 //BA.debugLineNum = 31653918;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible ."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=31653919;
 //BA.debugLineNum = 31653919;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasertfab"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=31653921;
 //BA.debugLineNum = 31653921;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=31653927;
 //BA.debugLineNum = 31653927;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=31653928;
 //BA.debugLineNum = 31653928;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _anularmovimientofasedoc(b4j.docU.cfasesdocumento __ref,int _idmov,String _doc,int _idu) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "anularmovimientofasedoc", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "anularmovimientofasedoc", new Object[] {_idmov,_doc,_idu}));}
ResumableSub_AnularMovimientoFaseDoc rsub = new ResumableSub_AnularMovimientoFaseDoc(this,__ref,_idmov,_doc,_idu);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AnularMovimientoFaseDoc extends BA.ResumableSub {
public ResumableSub_AnularMovimientoFaseDoc(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,int _idmov,String _doc,int _idu) {
this.parent = parent;
this.__ref = __ref;
this._idmov = _idmov;
this._doc = _doc;
this._idu = _idu;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
int _idmov;
String _doc;
int _idu;
String _accion = "";
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=31719429;
 //BA.debugLineNum = 31719429;BA.debugLine="Dim Comando As String=\"AnularFase\"";
_comando = "AnularFase";
RDebugUtils.currentLine=31719432;
 //BA.debugLineNum = 31719432;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_idmov),(Object)(_doc),(Object)(_idu)},parent);
RDebugUtils.currentLine=31719434;
 //BA.debugLineNum = 31719434;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasedoc"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=31719436;
 //BA.debugLineNum = 31719436;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=31719437;
 //BA.debugLineNum = 31719437;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasedoc"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=31719438;
 //BA.debugLineNum = 31719438;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31719442;
 //BA.debugLineNum = 31719442;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=31719443;
 //BA.debugLineNum = 31719443;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31719445;
 //BA.debugLineNum = 31719445;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible anular la fase.","Aviso");
RDebugUtils.currentLine=31719446;
 //BA.debugLineNum = 31719446;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasedoc"), _msa);
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
RDebugUtils.currentLine=31719448;
 //BA.debugLineNum = 31719448;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=31719449;
 //BA.debugLineNum = 31719449;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31719450;
 //BA.debugLineNum = 31719450;BA.debugLine="Dim mResp As Map=lstRes.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=31719451;
 //BA.debugLineNum = 31719451;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=31719452;
 //BA.debugLineNum = 31719452;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
RDebugUtils.currentLine=31719453;
 //BA.debugLineNum = 31719453;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31719455;
 //BA.debugLineNum = 31719455;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible ."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=31719456;
 //BA.debugLineNum = 31719456;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "anularmovimientofasedoc"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=31719458;
 //BA.debugLineNum = 31719458;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=31719463;
 //BA.debugLineNum = 31719463;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=31719464;
 //BA.debugLineNum = 31719464;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=30408708;
 //BA.debugLineNum = 30408708;BA.debugLine="If SubExists(mCallBack,\"FaseDocumentoActualizada\"";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,"FaseDocumentoActualizada")) { 
RDebugUtils.currentLine=30408709;
 //BA.debugLineNum = 30408709;BA.debugLine="CallSub2(mCallBack,\"FaseDocumentoActualizada\",mD";
__c.CallSubDebug2(ba,__ref._mcallback /*Object*/ ,"FaseDocumentoActualizada",(Object)(__ref._mdocumentosel /*String*/ ));
 };
RDebugUtils.currentLine=30408711;
 //BA.debugLineNum = 30408711;BA.debugLine="End Sub";
return "";
}
public String  _background_mouseclicked(b4j.docU.cfasesdocumento __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "background_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="End Sub";
return "";
}
public void  _btnaccionesfase_click(b4j.docU.cfasesdocumento __ref) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "btnaccionesfase_click", false))
	 {Debug.delegate(ba, "btnaccionesfase_click", null); return;}
ResumableSub_btnAccionesFase_Click rsub = new ResumableSub_btnAccionesFase_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAccionesFase_Click extends BA.ResumableSub {
public ResumableSub_btnAccionesFase_Click(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
float _offset_before_dialog = 0f;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
String _fasesel = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;
String _accionfase = "";
int step27;
int limit27;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="Dim mData As Map=JamTableCLVFasesDoc.GetValue(Jam";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=31129604;
 //BA.debugLineNum = 31129604;BA.debugLine="Log(mData)";
parent.__c.LogImpl("831129604",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="Dim IndexSel As Int=JamTableCLVFasesDoc.GetItemFr";
_indexsel = __ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLVFa";
_offset_before_dialog = (float) (__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=31129608;
 //BA.debugLineNum = 31129608;BA.debugLine="Dialog.Title=\"Selecciona Acción\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Acción");
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=31129611;
 //BA.debugLineNum = 31129611;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=31129612;
 //BA.debugLineNum = 31129612;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31129613;
 //BA.debugLineNum = 31129613;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
parent._utilidades._setlightthemelist /*String*/ (_b4xlistdlg);
RDebugUtils.currentLine=31129615;
 //BA.debugLineNum = 31129615;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=31129616;
 //BA.debugLineNum = 31129616;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=31129617;
 //BA.debugLineNum = 31129617;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=31129619;
 //BA.debugLineNum = 31129619;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=31129620;
 //BA.debugLineNum = 31129620;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=31129622;
 //BA.debugLineNum = 31129622;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31129623;
 //BA.debugLineNum = 31129623;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=31129624;
 //BA.debugLineNum = 31129624;BA.debugLine="lstOpciones.Add(\"Anular Fase\")";
_lstopciones.Add((Object)("Anular Fase"));
RDebugUtils.currentLine=31129625;
 //BA.debugLineNum = 31129625;BA.debugLine="lstOpciones.Add(\"Editar Observaciones\")";
_lstopciones.Add((Object)("Editar Observaciones"));
RDebugUtils.currentLine=31129627;
 //BA.debugLineNum = 31129627;BA.debugLine="Dim FaseSel As String=mData.Get(\"Fase\")";
_fasesel = BA.ObjectToString(_mdata.Get((Object)("Fase")));
RDebugUtils.currentLine=31129629;
 //BA.debugLineNum = 31129629;BA.debugLine="If FaseSel.ToUpperCase=\"EXPEDIDO\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_fasesel.toUpperCase()).equals("EXPEDIDO")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31129630;
 //BA.debugLineNum = 31129630;BA.debugLine="lstOpciones.Add(\"Trazabilidad Transporte\")";
_lstopciones.Add((Object)("Trazabilidad Transporte"));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=31129636;
 //BA.debugLineNum = 31129636;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=31129638;
 //BA.debugLineNum = 31129638;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(B4XLis";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=31129640;
 //BA.debugLineNum = 31129640;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 5:
//for
this.state = 8;
step27 = 1;
limit27 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 8;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 7;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step27)) ;
if (true) break;

case 7:
//C
this.state = 24;
RDebugUtils.currentLine=31129641;
 //BA.debugLineNum = 31129641;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=31129645;
 //BA.debugLineNum = 31129645;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=31129646;
 //BA.debugLineNum = 31129646;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_bcancel.IsInitialized()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=31129648;
 //BA.debugLineNum = 31129648;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=31129649;
 //BA.debugLineNum = 31129649;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=31129650;
 //BA.debugLineNum = 31129650;BA.debugLine="bCancel.TextSize=16";
_bcancel.setTextSize(16);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=31129653;
 //BA.debugLineNum = 31129653;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnaccionesfase_click"), _rs);
this.state = 25;
return;
case 25:
//C
this.state = 13;
_result = (int) result[1];
;
RDebugUtils.currentLine=31129654;
 //BA.debugLineNum = 31129654;BA.debugLine="JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_b";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=31129655;
 //BA.debugLineNum = 31129655;BA.debugLine="Dim AccionFase As String=B4XListDlg.SelectedItem";
_accionfase = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=31129658;
 //BA.debugLineNum = 31129658;BA.debugLine="Select AccionFase";
if (true) break;

case 13:
//select
this.state = 22;
switch (BA.switchObjectToInt(_accionfase,"Trazabilidad Transporte","Anular Fase","Editar Observaciones","Buscar Expedicion DHL")) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 22;
RDebugUtils.currentLine=31129660;
 //BA.debugLineNum = 31129660;BA.debugLine="TrazabilidadTransporte(mData)";
__ref._trazabilidadtransporte /*void*/ (null,_mdata);
 if (true) break;

case 17:
//C
this.state = 22;
RDebugUtils.currentLine=31129663;
 //BA.debugLineNum = 31129663;BA.debugLine="AnularFase(mData)";
__ref._anularfase /*void*/ (null,_mdata);
 if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=31129666;
 //BA.debugLineNum = 31129666;BA.debugLine="EditarObservaciones(mData)";
__ref._editarobservaciones /*void*/ (null,_mdata);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=31129669;
 //BA.debugLineNum = 31129669;BA.debugLine="BuscarExpedicionDHLPorReferencia";
__ref._buscarexpediciondhlporreferencia /*String*/ (null);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=31129672;
 //BA.debugLineNum = 31129672;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _trazabilidadtransporte(b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "trazabilidadtransporte", false))
	 {Debug.delegate(ba, "trazabilidadtransporte", new Object[] {_mdata}); return;}
ResumableSub_TrazabilidadTransporte rsub = new ResumableSub_TrazabilidadTransporte(this,__ref,_mdata);
rsub.resume(ba, null);
}
public static class ResumableSub_TrazabilidadTransporte extends BA.ResumableSub {
public ResumableSub_TrazabilidadTransporte(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.objects.collections.Map _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
anywheresoftware.b4a.objects.collections.Map _mdata;
String _transporte = "";
String _expedicion = "";
String _expediciondhl = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
String _urltxt = "";
Object _msa = null;
b4j.docU.cinfoexpedicioncorreosexpress _cinfoexpedcorreosexp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="Dim Transporte As String=mData.Get(\"ResponsableFa";
_transporte = BA.ObjectToString(_mdata.Get((Object)("ResponsableFase")));
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="Transporte=Transporte.ToUpperCase";
_transporte = _transporte.toUpperCase();
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="Dim Expedicion As String=mData.Get(\"NumExpedicion";
_expedicion = BA.ObjectToString(_mdata.Get((Object)("NumExpedicion")));
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="Expedicion=Expedicion.ToUpperCase";
_expedicion = _expedicion.toUpperCase();
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="Select Case Transporte";
if (true) break;

case 1:
//select
this.state = 26;
switch (BA.switchObjectToInt(_transporte,"DHL","TXT","CORREOS EXPRESS")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 23;
if (true) break;
}
default: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31522825;
 //BA.debugLineNum = 31522825;BA.debugLine="Dim ExpedicionDHL As String";
_expediciondhl = "";
RDebugUtils.currentLine=31522826;
 //BA.debugLineNum = 31522826;BA.debugLine="If Expedicion.Length>=20 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_expedicion.length()>=20) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=31522827;
 //BA.debugLineNum = 31522827;BA.debugLine="ExpedicionDHL=Expedicion.SubString2(8,10)&Expe";
_expediciondhl = _expedicion.substring((int) (8),(int) (10))+_expedicion.substring((int) (12),(int) (20));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=31522829;
 //BA.debugLineNum = 31522829;BA.debugLine="ExpedicionDHL=Expedicion";
_expediciondhl = _expedicion;
 if (true) break;

case 9:
//C
this.state = 26;
;
RDebugUtils.currentLine=31522831;
 //BA.debugLineNum = 31522831;BA.debugLine="fx.ShowExternalDocument(\"https://clientesparcel";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo="+_expediciondhl+"&anno=2017&lang=sp");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=31522834;
 //BA.debugLineNum = 31522834;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "trazabilidadtransporte"), parent._cmauxtxt._obtenerurltrazabilidadexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_expedicion));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31522835;
 //BA.debugLineNum = 31522835;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=31522836;
 //BA.debugLineNum = 31522836;BA.debugLine="If Accion=\"OK\" Then";
if (true) break;

case 12:
//if
this.state = 21;
if ((_accion).equals("OK")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=31522837;
 //BA.debugLineNum = 31522837;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
_urltxt = BA.ObjectToString(_mres.Get((Object)("URL")));
RDebugUtils.currentLine=31522838;
 //BA.debugLineNum = 31522838;BA.debugLine="If URLtxt<>\"\" Then";
if (true) break;

case 15:
//if
this.state = 20;
if ((_urltxt).equals("") == false) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=31522839;
 //BA.debugLineNum = 31522839;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument(_urltxt);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=31522841;
 //BA.debugLineNum = 31522841;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Ha fallado";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Ha fallado el método obtener URL TXT.","Error");
RDebugUtils.currentLine=31522842;
 //BA.debugLineNum = 31522842;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "trazabilidadtransporte"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 26;
;
 if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=31522847;
 //BA.debugLineNum = 31522847;BA.debugLine="Dim cInfoExpedCorreosExp As cInfoExpedicionCorr";
_cinfoexpedcorreosexp = new b4j.docU.cinfoexpedicioncorreosexpress();
RDebugUtils.currentLine=31522848;
 //BA.debugLineNum = 31522848;BA.debugLine="cInfoExpedCorreosExp.Initialize(Expedicion)";
_cinfoexpedcorreosexp._initialize /*String*/ (null,ba,_expedicion);
RDebugUtils.currentLine=31522849;
 //BA.debugLineNum = 31522849;BA.debugLine="cInfoExpedCorreosExp.Show";
_cinfoexpedcorreosexp._show /*void*/ (null);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=31522851;
 //BA.debugLineNum = 31522851;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No es posible obtener información de trazabilidad de esta expedición mediante este formulario."+parent.__c.CRLF+parent.__c.CRLF+"Consultar con Logística.","Error");
RDebugUtils.currentLine=31522853;
 //BA.debugLineNum = 31522853;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "trazabilidadtransporte"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=31522859;
 //BA.debugLineNum = 31522859;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _editarobservaciones(b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "editarobservaciones", false))
	 {Debug.delegate(ba, "editarobservaciones", new Object[] {_mdata}); return;}
ResumableSub_EditarObservaciones rsub = new ResumableSub_EditarObservaciones(this,__ref,_mdata);
rsub.resume(ba, null);
}
public static class ResumableSub_EditarObservaciones extends BA.ResumableSub {
public ResumableSub_EditarObservaciones(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,anywheresoftware.b4a.objects.collections.Map _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
anywheresoftware.b4a.objects.collections.Map _mdata;
float _offset_before_dialog = 0f;
b4j.docU.b4xinputtemplate _inputdlg = null;
int _maxnumchar = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _nuevasobs = "";
String _sresp = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLVFa";
_offset_before_dialog = (float) (__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="Dialog.Title=\"Editar Observaciones Fase\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Editar Observaciones Fase");
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=31784967;
 //BA.debugLineNum = 31784967;BA.debugLine="InputDlg.Text=mData.Get(\"Obs\")";
_inputdlg._text /*String*/  = BA.ObjectToString(_mdata.Get((Object)("Obs")));
RDebugUtils.currentLine=31784968;
 //BA.debugLineNum = 31784968;BA.debugLine="Dim MaxNumChar As Int=100";
_maxnumchar = (int) (100);
RDebugUtils.currentLine=31784969;
 //BA.debugLineNum = 31784969;BA.debugLine="InputDlg.RegexPattern=\"^.{\" & 0 & \",\" & MaxNumCha";
_inputdlg._regexpattern /*String*/  = "^.{"+BA.NumberToString(0)+","+BA.NumberToString(_maxnumchar)+"}$";
RDebugUtils.currentLine=31784970;
 //BA.debugLineNum = 31784970;BA.debugLine="InputDlg.mBase.Width=750dip";
_inputdlg._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (750)));
RDebugUtils.currentLine=31784971;
 //BA.debugLineNum = 31784971;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
parent._utilidades._setlightthemeinput /*String*/ (_inputdlg);
RDebugUtils.currentLine=31784972;
 //BA.debugLineNum = 31784972;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=31784973;
 //BA.debugLineNum = 31784973;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=31784974;
 //BA.debugLineNum = 31784974;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=31784975;
 //BA.debugLineNum = 31784975;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=31784976;
 //BA.debugLineNum = 31784976;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=31784977;
 //BA.debugLineNum = 31784977;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=31784978;
 //BA.debugLineNum = 31784978;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=31784979;
 //BA.debugLineNum = 31784979;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), _rsub);
this.state = 44;
return;
case 44:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=31784981;
 //BA.debugLineNum = 31784981;BA.debugLine="JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_b";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=31784982;
 //BA.debugLineNum = 31784982;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = 7;
;
RDebugUtils.currentLine=31784983;
 //BA.debugLineNum = 31784983;BA.debugLine="Dim NuevasObs As String=InputDlg.Text";
_nuevasobs = _inputdlg._text /*String*/ ;
RDebugUtils.currentLine=31784984;
 //BA.debugLineNum = 31784984;BA.debugLine="Wait For(UpdateObservacionesFaseDoc(mData.Get(\"ID";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), __ref._updateobservacionesfasedoc /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(BA.ObjectToNumber(_mdata.Get((Object)("IDMov")))),_nuevasobs));
this.state = 45;
return;
case 45:
//C
this.state = 7;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=31784985;
 //BA.debugLineNum = 31784985;BA.debugLine="If sResp=\"NOK\" Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if ((_sresp).equals("NOK")) { 
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
RDebugUtils.currentLine=31784987;
 //BA.debugLineNum = 31784987;BA.debugLine="Wait For(ActualizarFasesDocumentoSel(mDocumentoSe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), __ref._actualizarfasesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdocumentosel /*String*/ ));
this.state = 46;
return;
case 46:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31784988;
 //BA.debugLineNum = 31784988;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=31784989;
 //BA.debugLineNum = 31784989;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 13:
//if
this.state = 18;
if ((_accion).equals("NOK")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=31784990;
 //BA.debugLineNum = 31784990;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=31784991;
 //BA.debugLineNum = 31784991;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 19:
//for
this.state = 22;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group29 = _lstreg;
index29 = 0;
groupLen29 = group29.getSize();
this.state = 47;
if (true) break;

case 47:
//C
this.state = 22;
if (index29 < groupLen29) {
this.state = 21;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group29.Get(index29)));}
if (true) break;

case 48:
//C
this.state = 47;
index29++;
if (true) break;

case 21:
//C
this.state = 48;
RDebugUtils.currentLine=31784992;
 //BA.debugLineNum = 31784992;BA.debugLine="Log(mData)";
parent.__c.LogImpl("831784992",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=31784995;
 //BA.debugLineNum = 31784995;BA.debugLine="Dim rSub As ResumableSub=JamTableCLVFasesDoc.setd";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=31784996;
 //BA.debugLineNum = 31784996;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), _rsub);
this.state = 49;
return;
case 49:
//C
this.state = 23;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31784997;
 //BA.debugLineNum = 31784997;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=31784998;
 //BA.debugLineNum = 31784998;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 23:
//if
this.state = 43;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=31784999;
 //BA.debugLineNum = 31784999;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 26:
//if
this.state = 33;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=31785000;
 //BA.debugLineNum = 31785000;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=31785001;
 //BA.debugLineNum = 31785001;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), _msa);
this.state = 50;
return;
case 50:
//C
this.state = 29;
;
RDebugUtils.currentLine=31785003;
 //BA.debugLineNum = 31785003;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=31785004;
 //BA.debugLineNum = 31785004;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), _msa);
this.state = 51;
return;
case 51:
//C
this.state = 29;
_rint = (int) result[1];
;
RDebugUtils.currentLine=31785005;
 //BA.debugLineNum = 31785005;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 29:
//if
this.state = 32;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=31785006;
 //BA.debugLineNum = 31785006;BA.debugLine="JamTableCLVFasesDoc.AbrirCamposBuilder";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=31785007;
 //BA.debugLineNum = 31785007;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=31785010;
 //BA.debugLineNum = 31785010;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=31785012;
 //BA.debugLineNum = 31785012;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 33:
//if
this.state = 42;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=31785013;
 //BA.debugLineNum = 31785013;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 36:
//if
this.state = 41;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
if (true) return ;
if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=31785014;
 //BA.debugLineNum = 31785014;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=31785015;
 //BA.debugLineNum = 31785015;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "editarobservaciones"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = -1;
;
RDebugUtils.currentLine=31785019;
 //BA.debugLineNum = 31785019;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _buscarexpediciondhlporreferencia(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "buscarexpediciondhlporreferencia", false))
	 {return ((String) Debug.delegate(ba, "buscarexpediciondhlporreferencia", null));}
b4j.docU.cinfoexpediciondhl _cexpdhl = null;
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Sub BuscarExpedicionDHLPorReferencia";
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="Dim cExpDHL As cInfoExpedicionDHL";
_cexpdhl = new b4j.docU.cinfoexpediciondhl();
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="cExpDHL.Initialize";
_cexpdhl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="cExpDHL.ActualizarInfoExpedicionDHL(mDocumentoSel";
_cexpdhl._actualizarinfoexpediciondhl /*void*/ (null,__ref._mdocumentosel /*String*/ );
RDebugUtils.currentLine=31981573;
 //BA.debugLineNum = 31981573;BA.debugLine="End Sub";
return "";
}
public String  _btnejemplo_click(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "btnejemplo_click", false))
	 {return ((String) Debug.delegate(ba, "btnejemplo_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Private Sub btnEjemplo_Click";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="Dim mData As Map=JamTableCLVFasesDoc.GetValue(Jam";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="Log(mData)";
__c.LogImpl("830932995",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="Dim IndexSel As Int=JamTableCLVFasesDoc.GetItemFr";
_indexsel = __ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="End Sub";
return "";
}
public void  _btnmostrardocumentoennavision_click(b4j.docU.cfasesdocumento __ref) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "btnmostrardocumentoennavision_click", false))
	 {Debug.delegate(ba, "btnmostrardocumentoennavision_click", null); return;}
ResumableSub_btnMostrarDocumentoEnNavision_Click rsub = new ResumableSub_btnMostrarDocumentoEnNavision_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnMostrarDocumentoEnNavision_Click extends BA.ResumableSub {
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
Object _msa = null;
int _rint = 0;
String _docsel = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="If mDocumentoSel=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._mdocumentosel /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado ningún documento válido.","Aviso");
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 4;
;
RDebugUtils.currentLine=31457285;
 //BA.debugLineNum = 31457285;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=31457288;
 //BA.debugLineNum = 31457288;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Mostrar el";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Mostrar el documento "+__ref._mdocumentosel /*String*/ +" en NAVISION?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=31457289;
 //BA.debugLineNum = 31457289;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=31457290;
 //BA.debugLineNum = 31457290;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=31457293;
 //BA.debugLineNum = 31457293;BA.debugLine="Dim DocSel As String=mDocumentoSel";
_docsel = __ref._mdocumentosel /*String*/ ;
RDebugUtils.currentLine=31457294;
 //BA.debugLineNum = 31457294;BA.debugLine="Select True";
if (true) break;

case 11:
//select
this.state = 18;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("CDEV"))) {
case 0: {
this.state = 13;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 13:
//C
this.state = 18;
RDebugUtils.currentLine=31457296;
 //BA.debugLineNum = 31457296;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico Albaranes Venta",(int) (130),"No.",_docsel);
 if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=31457298;
 //BA.debugLineNum = 31457298;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico recep. transferencia",(int) (5745),"No.",_docsel);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=31457300;
 //BA.debugLineNum = 31457300;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico envío devolución",(int) (6650),"No.",_docsel);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=31457306;
 //BA.debugLineNum = 31457306;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=31457308;
 //BA.debugLineNum = 31457308;BA.debugLine="If success Then";
if (true) break;

case 19:
//if
this.state = 24;
if (_success) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=31457311;
 //BA.debugLineNum = 31457311;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir la ficha del documento "+_docsel+" en NAVISION.","Error");
RDebugUtils.currentLine=31457312;
 //BA.debugLineNum = 31457312;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnmostrardocumentoennavision_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=31457314;
 //BA.debugLineNum = 31457314;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="End Sub";
return "";
}
public void  _btnseldocumento_click(b4j.docU.cfasesdocumento __ref) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "btnseldocumento_click", false))
	 {Debug.delegate(ba, "btnseldocumento_click", null); return;}
ResumableSub_btnSelDocumento_Click rsub = new ResumableSub_btnSelDocumento_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelDocumento_Click extends BA.ResumableSub {
public ResumableSub_btnSelDocumento_Click(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
float _offset_before_dialog = 0f;
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _docsel = "";
Object _msa = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="mDocumentoSel=\"\"";
__ref._mdocumentosel /*String*/  = "";
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="DestinatarioTaller=False";
__ref._destinatariotaller /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="txtDocumento.Text=\"\"";
__ref._txtdocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="LimpiarDatosDocumento";
__ref._limpiardatosdocumento /*String*/ (null);
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLVFa";
_offset_before_dialog = (float) (__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=30998534;
 //BA.debugLineNum = 30998534;BA.debugLine="Dialog.Title=\"Indica Documento\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Documento");
RDebugUtils.currentLine=30998535;
 //BA.debugLineNum = 30998535;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=30998536;
 //BA.debugLineNum = 30998536;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=30998537;
 //BA.debugLineNum = 30998537;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=30998538;
 //BA.debugLineNum = 30998538;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=30998539;
 //BA.debugLineNum = 30998539;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=30998541;
 //BA.debugLineNum = 30998541;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
parent._utilidades._setlightthemeinput /*String*/ (_inputdlg);
RDebugUtils.currentLine=30998542;
 //BA.debugLineNum = 30998542;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=30998543;
 //BA.debugLineNum = 30998543;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=30998544;
 //BA.debugLineNum = 30998544;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=30998545;
 //BA.debugLineNum = 30998545;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=30998546;
 //BA.debugLineNum = 30998546;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=30998547;
 //BA.debugLineNum = 30998547;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=30998548;
 //BA.debugLineNum = 30998548;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=30998549;
 //BA.debugLineNum = 30998549;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnseldocumento_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=30998551;
 //BA.debugLineNum = 30998551;BA.debugLine="JamTableCLVFasesDoc.sv.ScrollViewOffsetY=offset_b";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=30998552;
 //BA.debugLineNum = 30998552;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = 7;
;
RDebugUtils.currentLine=30998553;
 //BA.debugLineNum = 30998553;BA.debugLine="Dim DocSel As String=InputDlg.Text.Trim.ToUpperCa";
_docsel = _inputdlg._text /*String*/ .trim().toUpperCase();
RDebugUtils.currentLine=30998554;
 //BA.debugLineNum = 30998554;BA.debugLine="If Not(DocSel.StartsWith(\"ALBV\")) And Not(DocSel.";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.__c.Not(_docsel.startsWith("ALBV")) && parent.__c.Not(_docsel.startsWith("RT")) && parent.__c.Not(_docsel.startsWith("CDEV")) && parent.__c.Not(_docsel.startsWith("OSUB"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=30998556;
 //BA.debugLineNum = 30998556;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(DocSel & \" no";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_docsel+" no es un documento no válido."+parent.__c.CRLF+parent.__c.CRLF+"(sólo ALBV,RT,CDEV, Y OSUB.)","Aviso");
RDebugUtils.currentLine=30998557;
 //BA.debugLineNum = 30998557;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnseldocumento_click"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 10;
;
RDebugUtils.currentLine=30998558;
 //BA.debugLineNum = 30998558;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=30998561;
 //BA.debugLineNum = 30998561;BA.debugLine="mDocumentoSel=DocSel";
__ref._mdocumentosel /*String*/  = _docsel;
RDebugUtils.currentLine=30998562;
 //BA.debugLineNum = 30998562;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=30998563;
 //BA.debugLineNum = 30998563;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDocu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "btnseldocumento_click"), __ref._actualizardatostotalesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdocumentosel /*String*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=30998564;
 //BA.debugLineNum = 30998564;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=30998565;
 //BA.debugLineNum = 30998565;BA.debugLine="If Success=False Then SalirModulo";
if (true) break;

case 11:
//if
this.state = 16;
if (_success==parent.__c.False) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
__ref._salirmodulo /*String*/ (null);
if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=30998566;
 //BA.debugLineNum = 30998566;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _limpiardatosdocumento(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "limpiardatosdocumento", false))
	 {return ((String) Debug.delegate(ba, "limpiardatosdocumento", null));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Sub LimpiarDatosDocumento";
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="txtCodigoDestinoDoc.Text=\"\"";
__ref._txtcodigodestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=31260676;
 //BA.debugLineNum = 31260676;BA.debugLine="txtNombreDestinoDoc.Text=\"\"";
__ref._txtnombredestinodoc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="txtFechaDocumento.Text=\"\"";
__ref._txtfechadocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="JamTableCLVFasesDoc.Clear";
__ref._jamtableclvfasesdoc /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=31260679;
 //BA.debugLineNum = 31260679;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoswebservicetransporte(b4j.docU.cfasesdocumento __ref,int _idtransportista) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "cargadatoswebservicetransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoswebservicetransporte", new Object[] {_idtransportista}));}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(this,__ref,_idtransportista);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,int _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
int _idtransportista;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="lstRes.Initialize";
_lstres.Initialize();
RDebugUtils.currentLine=31916037;
 //BA.debugLineNum = 31916037;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=31916038;
 //BA.debugLineNum = 31916038;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
_comandojrdc = "DatosWebServiceTransporte";
RDebugUtils.currentLine=31916039;
 //BA.debugLineNum = 31916039;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comandojrdc,(Object[])(new String[]{BA.NumberToString(_idtransportista)}),parent);
RDebugUtils.currentLine=31916040;
 //BA.debugLineNum = 31916040;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31916041;
 //BA.debugLineNum = 31916041;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=31916042;
 //BA.debugLineNum = 31916042;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31916044;
 //BA.debugLineNum = 31916044;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=31916045;
 //BA.debugLineNum = 31916045;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=31916047;
 //BA.debugLineNum = 31916047;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31916048;
 //BA.debugLineNum = 31916048;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=31916051;
 //BA.debugLineNum = 31916051;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31916052;
 //BA.debugLineNum = 31916052;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=31916053;
 //BA.debugLineNum = 31916053;BA.debugLine="mRes.put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=31916054;
 //BA.debugLineNum = 31916054;BA.debugLine="mRes.put(\"lstRes\",lstRes)";
_mres.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
RDebugUtils.currentLine=31916055;
 //BA.debugLineNum = 31916055;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=31916057;
 //BA.debugLineNum = 31916057;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=29949955;
 //BA.debugLineNum = 29949955;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=29949957;
 //BA.debugLineNum = 29949957;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=29949958;
 //BA.debugLineNum = 29949958;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29949959;
 //BA.debugLineNum = 29949959;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29949961;
 //BA.debugLineNum = 29949961;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=29949963;
 //BA.debugLineNum = 29949963;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=29949965;
 //BA.debugLineNum = 29949965;BA.debugLine="Private mDocumentoSel As String";
_mdocumentosel = "";
RDebugUtils.currentLine=29949970;
 //BA.debugLineNum = 29949970;BA.debugLine="Private JamTableCLVFasesDoc As JamTableCLV";
_jamtableclvfasesdoc = new b4j.docU.jamtableclv();
RDebugUtils.currentLine=29949971;
 //BA.debugLineNum = 29949971;BA.debugLine="Private btnAccionesFase As Button";
_btnaccionesfase = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=29949972;
 //BA.debugLineNum = 29949972;BA.debugLine="Private chkFaseActiva As CheckBox";
_chkfaseactiva = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=29949973;
 //BA.debugLineNum = 29949973;BA.debugLine="Private txtFase As TextField";
_txtfase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949974;
 //BA.debugLineNum = 29949974;BA.debugLine="Private txtFechaFase As TextField";
_txtfechafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949975;
 //BA.debugLineNum = 29949975;BA.debugLine="Private txtInfoAdicionalFase As TextField";
_txtinfoadicionalfase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949976;
 //BA.debugLineNum = 29949976;BA.debugLine="Private txtNumeroExpedicion As TextField";
_txtnumeroexpedicion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949977;
 //BA.debugLineNum = 29949977;BA.debugLine="Private txtObservaciones As TextField";
_txtobservaciones = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949978;
 //BA.debugLineNum = 29949978;BA.debugLine="Private txtResponsableFase As TextField";
_txtresponsablefase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949980;
 //BA.debugLineNum = 29949980;BA.debugLine="Private txtDocumento As TextField";
_txtdocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949981;
 //BA.debugLineNum = 29949981;BA.debugLine="Private txtFechaDocumento As TextField";
_txtfechadocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949983;
 //BA.debugLineNum = 29949983;BA.debugLine="Private txtAreaFase As TextField";
_txtareafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949985;
 //BA.debugLineNum = 29949985;BA.debugLine="Private DestinatarioTaller As Boolean";
_destinatariotaller = false;
RDebugUtils.currentLine=29949986;
 //BA.debugLineNum = 29949986;BA.debugLine="Private OSUBTaller As String";
_osubtaller = "";
RDebugUtils.currentLine=29949989;
 //BA.debugLineNum = 29949989;BA.debugLine="Private lblTitleCodigoDestinoDoc As Label";
_lbltitlecodigodestinodoc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=29949990;
 //BA.debugLineNum = 29949990;BA.debugLine="Private txtCodigoDestinoDoc As TextField";
_txtcodigodestinodoc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949991;
 //BA.debugLineNum = 29949991;BA.debugLine="Private lblTitleNombreDestinoDoc As Label";
_lbltitlenombredestinodoc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=29949992;
 //BA.debugLineNum = 29949992;BA.debugLine="Private txtNombreDestinoDoc As TextField";
_txtnombredestinodoc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=29949994;
 //BA.debugLineNum = 29949994;BA.debugLine="Private JamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=29949995;
 //BA.debugLineNum = 29949995;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updateobservacionesfasedoc(b4j.docU.cfasesdocumento __ref,int _idmov,String _observaciones) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "updateobservacionesfasedoc", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "updateobservacionesfasedoc", new Object[] {_idmov,_observaciones}));}
ResumableSub_UpdateObservacionesFaseDoc rsub = new ResumableSub_UpdateObservacionesFaseDoc(this,__ref,_idmov,_observaciones);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateObservacionesFaseDoc extends BA.ResumableSub {
public ResumableSub_UpdateObservacionesFaseDoc(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,int _idmov,String _observaciones) {
this.parent = parent;
this.__ref = __ref;
this._idmov = _idmov;
this._observaciones = _observaciones;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
int _idmov;
String _observaciones;
String _accion = "";
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="Dim Comando As String=\"UpdateObsFaseDoc\"";
_comando = "UpdateObsFaseDoc";
RDebugUtils.currentLine=31850504;
 //BA.debugLineNum = 31850504;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDMov";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_idmov),(Object)(_observaciones)},parent);
RDebugUtils.currentLine=31850506;
 //BA.debugLineNum = 31850506;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=31850507;
 //BA.debugLineNum = 31850507;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=31850508;
 //BA.debugLineNum = 31850508;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=31850509;
 //BA.debugLineNum = 31850509;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31850514;
 //BA.debugLineNum = 31850514;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=31850515;
 //BA.debugLineNum = 31850515;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31850517;
 //BA.debugLineNum = 31850517;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar las observaciones de la fase.","Aviso");
RDebugUtils.currentLine=31850518;
 //BA.debugLineNum = 31850518;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), _msa);
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
RDebugUtils.currentLine=31850520;
 //BA.debugLineNum = 31850520;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=31850521;
 //BA.debugLineNum = 31850521;BA.debugLine="Dim mResp As Map=lstRes.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=31850522;
 //BA.debugLineNum = 31850522;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=31850523;
 //BA.debugLineNum = 31850523;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
RDebugUtils.currentLine=31850524;
 //BA.debugLineNum = 31850524;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=31850526;
 //BA.debugLineNum = 31850526;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar las observaciones de la fase."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=31850527;
 //BA.debugLineNum = 31850527;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "updateobservacionesfasedoc"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=31850529;
 //BA.debugLineNum = 31850529;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=31850535;
 //BA.debugLineNum = 31850535;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=31850536;
 //BA.debugLineNum = 31850536;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cfasesdocumento __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="End Sub";
return "";
}
public String  _generaruuidv4(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = __c.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=30670855;
 //BA.debugLineNum = 30670855;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=30670856;
 //BA.debugLineNum = 30670856;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = __c.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=30670857;
 //BA.debugLineNum = 30670857;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = __c.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=30670858;
 //BA.debugLineNum = 30670858;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(__c.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=30670861;
 //BA.debugLineNum = 30670861;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=30670862;
 //BA.debugLineNum = 30670862;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclvfasesdoc_accionsalirjamtableclv(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "jamtableclvfasesdoc_accionsalirjamtableclv", false))
	 {return ((String) Debug.delegate(ba, "jamtableclvfasesdoc_accionsalirjamtableclv", null));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Sub JamTableCLVFasesDoc_AccionSalirJamTableCLV";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclvfasesdoc_itemclick(b4j.docU.cfasesdocumento __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "jamtableclvfasesdoc_itemclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclvfasesdoc_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Sub JamTableCLVFasesDoc_ItemClick(Index As Int, Va";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
__c.LogImpl("830801922","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("830801924",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclvfasesdoc_itemlongclick(b4j.docU.cfasesdocumento __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "jamtableclvfasesdoc_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclvfasesdoc_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Sub JamTableCLVFasesDoc_ItemLongClick(Index As Int";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("830867458","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=30867460;
 //BA.debugLineNum = 30867460;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("830867460",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclvfasesdoc_loadlayoutpanelitem(b4j.docU.cfasesdocumento __ref,b4j.docU.jamtableclv._datositemindexclvjamtableclv _datositemindexclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "jamtableclvfasesdoc_loadlayoutpanelitem", false))
	 {return ((String) Debug.delegate(ba, "jamtableclvfasesdoc_loadlayoutpanelitem", new Object[] {_datositemindexclv}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
String _dateformatant = "";
String _timeformatant = "";
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Sub JamTableCLVFasesDoc_LoadLayoutPanelItem(DatosI";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Dim mData As Map = DatosItemIndexCLV.Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_datositemindexclv.Value /*Object*/ ));
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _datositemindexclv.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="pnl.LoadLayout(\"scrItemFasesDocumentoLin\")";
_pnl.LoadLayout("scrItemFasesDocumentoLin",ba);
RDebugUtils.currentLine=30736389;
 //BA.debugLineNum = 30736389;BA.debugLine="txtFase.Text=mData.Get(\"Fase\")";
__ref._txtfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Fase"))));
RDebugUtils.currentLine=30736390;
 //BA.debugLineNum = 30736390;BA.debugLine="txtAreaFase.Text=mData.Get(\"AreaFase\")";
__ref._txtareafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("AreaFase"))));
RDebugUtils.currentLine=30736391;
 //BA.debugLineNum = 30736391;BA.debugLine="txtResponsableFase.Text=mData.Get(\"ResponsableFas";
__ref._txtresponsablefase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("ResponsableFase"))));
RDebugUtils.currentLine=30736392;
 //BA.debugLineNum = 30736392;BA.debugLine="txtInfoAdicionalFase.Text=mData.Get(\"InfoAdiciona";
__ref._txtinfoadicionalfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("InfoAdicionalFase"))));
RDebugUtils.currentLine=30736393;
 //BA.debugLineNum = 30736393;BA.debugLine="txtNumeroExpedicion.Text=mData.Get(\"NumExpedicion";
__ref._txtnumeroexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NumExpedicion"))));
RDebugUtils.currentLine=30736394;
 //BA.debugLineNum = 30736394;BA.debugLine="txtObservaciones.Text=mData.Get(\"Obs\")";
__ref._txtobservaciones /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Obs"))));
RDebugUtils.currentLine=30736396;
 //BA.debugLineNum = 30736396;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=30736397;
 //BA.debugLineNum = 30736397;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=30736398;
 //BA.debugLineNum = 30736398;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
_timeformatant = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=30736399;
 //BA.debugLineNum = 30736399;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=30736400;
 //BA.debugLineNum = 30736400;BA.debugLine="txtFechaFase.Text=DateTime.date(mData.Get(\"FechaF";
__ref._txtfechafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaFase"))))+" "+__c.DateTime.Time(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaFase")))));
RDebugUtils.currentLine=30736402;
 //BA.debugLineNum = 30736402;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=30736403;
 //BA.debugLineNum = 30736403;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=30736405;
 //BA.debugLineNum = 30736405;BA.debugLine="chkFaseActiva.Checked=1=mData.Get(\"Mov\")";
__ref._chkfaseactiva /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(1==(double)(BA.ObjectToNumber(_mdata.Get((Object)("Mov")))));
RDebugUtils.currentLine=30736406;
 //BA.debugLineNum = 30736406;BA.debugLine="End Sub";
return "";
}
public void  _jamtableclvfasesdoc_menubarmenuitem_action(b4j.docU.cfasesdocumento __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "jamtableclvfasesdoc_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableclvfasesdoc_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action rsub = new ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_JamTableCLVFasesDoc_MenuBarMenuItem_Action(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
String _tagmenuitem;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","NuevaFase")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDo";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "jamtableclvfasesdoc_menubarmenuitem_action"), __ref._actualizardatostotalesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdocumentosel /*String*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=30474244;
 //BA.debugLineNum = 30474244;BA.debugLine="If Success=False Then SalirModulo";
if (true) break;

case 4:
//if
this.state = 9;
if (_success==parent.__c.False) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
__ref._salirmodulo /*String*/ (null);
if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=30474251;
 //BA.debugLineNum = 30474251;BA.debugLine="NuevaFaseDoc";
__ref._nuevafasedoc /*String*/ (null);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=30474253;
 //BA.debugLineNum = 30474253;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _nuevafasedoc(b4j.docU.cfasesdocumento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "nuevafasedoc", false))
	 {return ((String) Debug.delegate(ba, "nuevafasedoc", null));}
String _tipodoc = "";
b4j.docU.cnuevafasedocumento _cnuevafasedoc = null;
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Sub NuevaFaseDoc";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Dim TipoDoc As String";
_tipodoc = "";
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="If mDocumentoSel.StartsWith(\"OSUB\") Then";
if (__ref._mdocumentosel /*String*/ .startsWith("OSUB")) { 
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="TipoDoc=\"FAB\"";
_tipodoc = "FAB";
 }else {
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="TipoDoc=\"DOC\"";
_tipodoc = "DOC";
 };
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="Dim cNuevaFaseDoc As cNuevaFaseDocumento";
_cnuevafasedoc = new b4j.docU.cnuevafasedocumento();
RDebugUtils.currentLine=30539784;
 //BA.debugLineNum = 30539784;BA.debugLine="cNuevaFaseDoc.Initialize(Me,frm.RootPane,mDocumen";
_cnuevafasedoc._initialize /*String*/ (null,ba,this,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),__ref._mdocumentosel /*String*/ ,_tipodoc,__ref._destinatariotaller /*boolean*/ ,__ref._osubtaller /*String*/ );
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="cNuevaFaseDoc.Show";
_cnuevafasedoc._show /*void*/ (null);
RDebugUtils.currentLine=30539787;
 //BA.debugLineNum = 30539787;BA.debugLine="End Sub";
return "";
}
public void  _nuevafasedocactualizada(b4j.docU.cfasesdocumento __ref,boolean _actualizada) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";
if (Debug.shouldDelegate(ba, "nuevafasedocactualizada", false))
	 {Debug.delegate(ba, "nuevafasedocactualizada", new Object[] {_actualizada}); return;}
ResumableSub_NuevaFaseDocActualizada rsub = new ResumableSub_NuevaFaseDocActualizada(this,__ref,_actualizada);
rsub.resume(ba, null);
}
public static class ResumableSub_NuevaFaseDocActualizada extends BA.ResumableSub {
public ResumableSub_NuevaFaseDocActualizada(b4j.docU.cfasesdocumento parent,b4j.docU.cfasesdocumento __ref,boolean _actualizada) {
this.parent = parent;
this.__ref = __ref;
this._actualizada = _actualizada;
this.__ref = parent;
}
b4j.docU.cfasesdocumento __ref;
b4j.docU.cfasesdocumento parent;
boolean _actualizada;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfasesdocumento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="If Actualizada=False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_actualizada==parent.__c.False) { 
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
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="Wait For(ActualizarDatosTotalesDocumentoSel(mDocu";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfasesdocumento", "nuevafasedocactualizada"), __ref._actualizardatostotalesdocumentosel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdocumentosel /*String*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="If Success=False Then SalirModulo";
if (true) break;

case 7:
//if
this.state = 12;
if (_success==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref._salirmodulo /*String*/ (null);
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}