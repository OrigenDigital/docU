package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cmarcaralbaranfisico extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cmarcaralbaranfisico", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cmarcaralbaranfisico.class).invoke(this, new Object[] {null});
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
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnseleccionardocumento = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitledocumentosactualizados = null;
public anywheresoftware.b4a.objects.collections.List _lstdocumentosactualizados = null;
public b4j.example.customlistview _clvdocumentosactualizados = null;
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
public String  _initialize(b4j.docU.cmarcaralbaranfisico __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=93519872;
 //BA.debugLineNum = 93519872;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=93519874;
 //BA.debugLineNum = 93519874;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cmarcaralbaranfisico __ref) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cmarcaralbaranfisico parent,b4j.docU.cmarcaralbaranfisico __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cmarcaralbaranfisico __ref;
b4j.docU.cmarcaralbaranfisico parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=93585409;
 //BA.debugLineNum = 93585409;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=93585410;
 //BA.debugLineNum = 93585410;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=93585411;
 //BA.debugLineNum = 93585411;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=93585412;
 //BA.debugLineNum = 93585412;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=93585413;
 //BA.debugLineNum = 93585413;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=93585414;
 //BA.debugLineNum = 93585414;BA.debugLine="frm.RootPane.LoadLayout(\"scrMarcarAlbaranFisico\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrMarcarAlbaranFisico");
RDebugUtils.currentLine=93585415;
 //BA.debugLineNum = 93585415;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "show"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=93585416;
 //BA.debugLineNum = 93585416;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"   \" & \"Marca";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"   "+"Marcar documentos NAVISION con Albaran Físico=Sí");
RDebugUtils.currentLine=93585418;
 //BA.debugLineNum = 93585418;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=93585420;
 //BA.debugLineNum = 93585420;BA.debugLine="lstDocumentosActualizados.Initialize";
__ref._lstdocumentosactualizados /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=93585422;
 //BA.debugLineNum = 93585422;BA.debugLine="lblTitleDocumentosActualizados.Visible=False";
__ref._lbltitledocumentosactualizados /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=93585423;
 //BA.debugLineNum = 93585423;BA.debugLine="clvDocumentosActualizados.AsView.Visible=False";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._asview().setVisible(parent.__c.False);
RDebugUtils.currentLine=93585424;
 //BA.debugLineNum = 93585424;BA.debugLine="clvDocumentosActualizados.Base_Resize(clvDocument";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._base_resize(__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._asview().getWidth(),0);
RDebugUtils.currentLine=93585426;
 //BA.debugLineNum = 93585426;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=93585427;
 //BA.debugLineNum = 93585427;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardocumentofisico(b4j.docU.cmarcaralbaranfisico __ref,String _docsel) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "actualizardocumentofisico", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardocumentofisico", new Object[] {_docsel}));}
ResumableSub_ActualizarDocumentoFisico rsub = new ResumableSub_ActualizarDocumentoFisico(this,__ref,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDocumentoFisico extends BA.ResumableSub {
public ResumableSub_ActualizarDocumentoFisico(b4j.docU.cmarcaralbaranfisico parent,b4j.docU.cmarcaralbaranfisico __ref,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.cmarcaralbaranfisico __ref;
b4j.docU.cmarcaralbaranfisico parent;
String _docsel;
String _comando = "";
Object _msa = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94044161;
 //BA.debugLineNum = 94044161;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=94044162;
 //BA.debugLineNum = 94044162;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("VDEV"))) {
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
RDebugUtils.currentLine=94044164;
 //BA.debugLineNum = 94044164;BA.debugLine="Comando=\"ActualizarAlbaranFisicoALBV\"";
_comando = "ActualizarAlbaranFisicoALBV";
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=94044166;
 //BA.debugLineNum = 94044166;BA.debugLine="Comando=\"ActualizarAlbaranFisicoRT\" ''' pendien";
_comando = "ActualizarAlbaranFisicoRT";
RDebugUtils.currentLine=94044167;
 //BA.debugLineNum = 94044167;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo es posible seleccionar documentos tipo ALBV o VDEV.","Error");
RDebugUtils.currentLine=94044168;
 //BA.debugLineNum = 94044168;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
RDebugUtils.currentLine=94044169;
 //BA.debugLineNum = 94044169;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=94044171;
 //BA.debugLineNum = 94044171;BA.debugLine="Comando=\"ActualizarAlbaranFisicoVDEV\"";
_comando = "ActualizarAlbaranFisicoVDEV";
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=94044173;
 //BA.debugLineNum = 94044173;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo es posible seleccionar documentos tipo ALBV o VDEV.","Error");
RDebugUtils.currentLine=94044174;
 //BA.debugLineNum = 94044174;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 10;
;
RDebugUtils.currentLine=94044175;
 //BA.debugLineNum = 94044175;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=94044178;
 //BA.debugLineNum = 94044178;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(Co";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ (_comando,new Object[]{(Object)(_docsel)});
RDebugUtils.currentLine=94044179;
 //BA.debugLineNum = 94044179;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=94044180;
 //BA.debugLineNum = 94044180;BA.debugLine="If Success=False Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_success==parent.__c.False) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=94044181;
 //BA.debugLineNum = 94044181;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar el campo albarán físico para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=94044182;
 //BA.debugLineNum = 94044182;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "actualizardocumentofisico"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
RDebugUtils.currentLine=94044183;
 //BA.debugLineNum = 94044183;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=94044185;
 //BA.debugLineNum = 94044185;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=94044187;
 //BA.debugLineNum = 94044187;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cmarcaralbaranfisico __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=93716480;
 //BA.debugLineNum = 93716480;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=93716481;
 //BA.debugLineNum = 93716481;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=93716482;
 //BA.debugLineNum = 93716482;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cmarcaralbaranfisico __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=93782016;
 //BA.debugLineNum = 93782016;BA.debugLine="Sub SalirModulo";
RDebugUtils.currentLine=93782017;
 //BA.debugLineNum = 93782017;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=93782018;
 //BA.debugLineNum = 93782018;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=93782019;
 //BA.debugLineNum = 93782019;BA.debugLine="End Sub";
return "";
}
public String  _btnseleccionardocumento_click(b4j.docU.cmarcaralbaranfisico __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "btnseleccionardocumento_click", false))
	 {return ((String) Debug.delegate(ba, "btnseleccionardocumento_click", null));}
RDebugUtils.currentLine=93847552;
 //BA.debugLineNum = 93847552;BA.debugLine="Private Sub btnSeleccionarDocumento_Click";
RDebugUtils.currentLine=93847553;
 //BA.debugLineNum = 93847553;BA.debugLine="SeleccionarDocumento";
__ref._seleccionardocumento /*void*/ (null);
RDebugUtils.currentLine=93847554;
 //BA.debugLineNum = 93847554;BA.debugLine="End Sub";
return "";
}
public void  _seleccionardocumento(b4j.docU.cmarcaralbaranfisico __ref) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "seleccionardocumento", false))
	 {Debug.delegate(ba, "seleccionardocumento", null); return;}
ResumableSub_SeleccionarDocumento rsub = new ResumableSub_SeleccionarDocumento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SeleccionarDocumento extends BA.ResumableSub {
public ResumableSub_SeleccionarDocumento(b4j.docU.cmarcaralbaranfisico parent,b4j.docU.cmarcaralbaranfisico __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cmarcaralbaranfisico __ref;
b4j.docU.cmarcaralbaranfisico parent;
b4j.docU.b4xinputtemplate _inputdlg = null;
int _maxnumchar = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _docsel = "";
Object _msa = null;
boolean _rbool = false;
int _indexdocsel = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _hclv = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=93913089;
 //BA.debugLineNum = 93913089;BA.debugLine="Dialog.Title=\"Selecciona Documento\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Documento");
RDebugUtils.currentLine=93913090;
 //BA.debugLineNum = 93913090;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=93913091;
 //BA.debugLineNum = 93913091;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = ((int)0x00ffffff);
RDebugUtils.currentLine=93913092;
 //BA.debugLineNum = 93913092;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=93913093;
 //BA.debugLineNum = 93913093;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=93913094;
 //BA.debugLineNum = 93913094;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=93913095;
 //BA.debugLineNum = 93913095;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=93913096;
 //BA.debugLineNum = 93913096;BA.debugLine="Dim MaxNumChar As Int=20";
_maxnumchar = (int) (20);
RDebugUtils.currentLine=93913097;
 //BA.debugLineNum = 93913097;BA.debugLine="InputDlg.RegexPattern=\"^.{\" & 5 & \",\" & MaxNumCha";
_inputdlg._regexpattern /*String*/  = "^.{"+BA.NumberToString(5)+","+BA.NumberToString(_maxnumchar)+"}$";
RDebugUtils.currentLine=93913098;
 //BA.debugLineNum = 93913098;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=93913099;
 //BA.debugLineNum = 93913099;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=93913100;
 //BA.debugLineNum = 93913100;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=93913101;
 //BA.debugLineNum = 93913101;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=93913102;
 //BA.debugLineNum = 93913102;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=93913103;
 //BA.debugLineNum = 93913103;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=93913104;
 //BA.debugLineNum = 93913104;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=93913105;
 //BA.debugLineNum = 93913105;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), _rsub);
this.state = 31;
return;
case 31:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=93913107;
 //BA.debugLineNum = 93913107;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=93913108;
 //BA.debugLineNum = 93913108;BA.debugLine="Dim DocSel As String=InputDlg.Text.Trim.ToUpperCa";
_docsel = _inputdlg._text /*String*/ .trim().toUpperCase();
RDebugUtils.currentLine=93913110;
 //BA.debugLineNum = 93913110;BA.debugLine="If DocSel.StartsWith(\"ALBV\")=False And DocSel.Sta";
if (true) break;

case 7:
//if
this.state = 10;
if (_docsel.startsWith("ALBV")==parent.__c.False && _docsel.startsWith("RT")==parent.__c.False && _docsel.startsWith("VDEV")==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=93913111;
 //BA.debugLineNum = 93913111;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posib";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo es posible actualizar documentos de tipo ALBV y VDEV","Aviso");
RDebugUtils.currentLine=93913112;
 //BA.debugLineNum = 93913112;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 10;
;
RDebugUtils.currentLine=93913113;
 //BA.debugLineNum = 93913113;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=93913116;
 //BA.debugLineNum = 93913116;BA.debugLine="Wait For(CheckExisteDocumentoNAV(DocSel)) complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), __ref._checkexistedocumentonav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_docsel));
this.state = 33;
return;
case 33:
//C
this.state = 11;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=93913117;
 //BA.debugLineNum = 93913117;BA.debugLine="If rBool=False Then Return";
if (true) break;

case 11:
//if
this.state = 16;
if (_rbool==parent.__c.False) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) return ;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=93913119;
 //BA.debugLineNum = 93913119;BA.debugLine="Wait For(ActualizarDocumentoFisico(DocSel)) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "seleccionardocumento"), __ref._actualizardocumentofisico /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_docsel));
this.state = 34;
return;
case 34:
//C
this.state = 17;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=93913120;
 //BA.debugLineNum = 93913120;BA.debugLine="If rBool=False Then Return";
if (true) break;

case 17:
//if
this.state = 22;
if (_rbool==parent.__c.False) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
if (true) return ;
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=93913122;
 //BA.debugLineNum = 93913122;BA.debugLine="Dim IndexDocSel As Int=lstDocumentosActualizados.";
_indexdocsel = __ref._lstdocumentosactualizados /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_docsel));
RDebugUtils.currentLine=93913123;
 //BA.debugLineNum = 93913123;BA.debugLine="If IndexDocSel>-1 Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_indexdocsel>-1) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=93913124;
 //BA.debugLineNum = 93913124;BA.debugLine="lstDocumentosActualizados.RemoveAt(IndexDocSel)";
__ref._lstdocumentosactualizados /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_indexdocsel);
RDebugUtils.currentLine=93913125;
 //BA.debugLineNum = 93913125;BA.debugLine="clvDocumentosActualizados.RemoveAt(IndexDocSel)";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._removeat(_indexdocsel);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=93913127;
 //BA.debugLineNum = 93913127;BA.debugLine="lstDocumentosActualizados.Add(DocSel)";
__ref._lstdocumentosactualizados /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_docsel));
RDebugUtils.currentLine=93913128;
 //BA.debugLineNum = 93913128;BA.debugLine="clvDocumentosActualizados.AddTextItem(DocSel,DocS";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._addtextitem((Object)(_docsel),(Object)(_docsel));
RDebugUtils.currentLine=93913129;
 //BA.debugLineNum = 93913129;BA.debugLine="Dim p As B4XView=clvDocumentosActualizados.GetPan";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._getpanel((int) (__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=93913130;
 //BA.debugLineNum = 93913130;BA.debugLine="Dim hClv As Int=Min(0.75*(frm.RootPane.Height-clv";
_hclv = (int) (parent.__c.Min(0.75*(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight()-__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._asview().getTop()),(_p.getHeight()+__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._getdividersize())*__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._getsize()+__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._getdividersize()*2));
RDebugUtils.currentLine=93913131;
 //BA.debugLineNum = 93913131;BA.debugLine="clvDocumentosActualizados.Base_Resize(clvDocument";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._base_resize(__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._asview().getWidth(),_hclv);
RDebugUtils.currentLine=93913132;
 //BA.debugLineNum = 93913132;BA.debugLine="clvDocumentosActualizados.AsView.Height=hClv";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._asview().setHeight(_hclv);
RDebugUtils.currentLine=93913134;
 //BA.debugLineNum = 93913134;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "seleccionardocumento"),(int) (100));
this.state = 35;
return;
case 35:
//C
this.state = 27;
;
RDebugUtils.currentLine=93913135;
 //BA.debugLineNum = 93913135;BA.debugLine="clvDocumentosActualizados.ScrollToItem(clvDocumen";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._scrolltoitem((int) (__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=93913138;
 //BA.debugLineNum = 93913138;BA.debugLine="If lstDocumentosActualizados.Size>0 Then";
if (true) break;

case 27:
//if
this.state = 30;
if (__ref._lstdocumentosactualizados /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=93913139;
 //BA.debugLineNum = 93913139;BA.debugLine="lblTitleDocumentosActualizados.Visible=True";
__ref._lbltitledocumentosactualizados /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=93913140;
 //BA.debugLineNum = 93913140;BA.debugLine="clvDocumentosActualizados.AsView.Visible=True";
__ref._clvdocumentosactualizados /*b4j.example.customlistview*/ ._asview().setVisible(parent.__c.True);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=93913144;
 //BA.debugLineNum = 93913144;BA.debugLine="SeleccionarDocumento";
__ref._seleccionardocumento /*void*/ (null);
RDebugUtils.currentLine=93913146;
 //BA.debugLineNum = 93913146;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkexistedocumentonav(b4j.docU.cmarcaralbaranfisico __ref,String _docsel) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "checkexistedocumentonav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkexistedocumentonav", new Object[] {_docsel}));}
ResumableSub_CheckExisteDocumentoNAV rsub = new ResumableSub_CheckExisteDocumentoNAV(this,__ref,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckExisteDocumentoNAV extends BA.ResumableSub {
public ResumableSub_CheckExisteDocumentoNAV(b4j.docU.cmarcaralbaranfisico parent,b4j.docU.cmarcaralbaranfisico __ref,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.cmarcaralbaranfisico __ref;
b4j.docU.cmarcaralbaranfisico parent;
String _docsel;
String _comando = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
int _numdoc = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmarcaralbaranfisico";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=93978625;
 //BA.debugLineNum = 93978625;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=93978626;
 //BA.debugLineNum = 93978626;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("VDEV"))) {
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
RDebugUtils.currentLine=93978628;
 //BA.debugLineNum = 93978628;BA.debugLine="Comando=\"CheckExisteDocumentoALBV\"";
_comando = "CheckExisteDocumentoALBV";
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=93978630;
 //BA.debugLineNum = 93978630;BA.debugLine="Comando=\"CheckExisteDocumentoRT\"";
_comando = "CheckExisteDocumentoRT";
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=93978632;
 //BA.debugLineNum = 93978632;BA.debugLine="Comando=\"CheckExisteDocumentoVDEV\"";
_comando = "CheckExisteDocumentoVDEV";
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=93978634;
 //BA.debugLineNum = 93978634;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo es posible seleccionar documentos tipo ALBV o VDEV.","Error");
RDebugUtils.currentLine=93978635;
 //BA.debugLineNum = 93978635;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 10;
;
RDebugUtils.currentLine=93978636;
 //BA.debugLineNum = 93978636;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=93978639;
 //BA.debugLineNum = 93978639;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_docsel)},parent);
RDebugUtils.currentLine=93978641;
 //BA.debugLineNum = 93978641;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), null);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=93978643;
 //BA.debugLineNum = 93978643;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 11:
//if
this.state = 28;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 28;
RDebugUtils.currentLine=93978644;
 //BA.debugLineNum = 93978644;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=93978645;
 //BA.debugLineNum = 93978645;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 28;
;
RDebugUtils.currentLine=93978646;
 //BA.debugLineNum = 93978646;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=93978648;
 //BA.debugLineNum = 93978648;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 16:
//if
this.state = 27;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 27;
RDebugUtils.currentLine=93978649;
 //BA.debugLineNum = 93978649;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El documento";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El documento "+_docsel+" no existe en navision.","Aviso");
RDebugUtils.currentLine=93978650;
 //BA.debugLineNum = 93978650;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 27;
;
RDebugUtils.currentLine=93978651;
 //BA.debugLineNum = 93978651;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=93978653;
 //BA.debugLineNum = 93978653;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=93978654;
 //BA.debugLineNum = 93978654;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=93978655;
 //BA.debugLineNum = 93978655;BA.debugLine="Dim NumDoc As Int=mResp.GetValueAt(0)";
_numdoc = (int)(BA.ObjectToNumber(_mresp.GetValueAt((int) (0))));
RDebugUtils.currentLine=93978656;
 //BA.debugLineNum = 93978656;BA.debugLine="If NumDoc=0 Then";
if (true) break;

case 21:
//if
this.state = 26;
if (_numdoc==0) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=93978657;
 //BA.debugLineNum = 93978657;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El document";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El documento "+_docsel+" no existe en navision.","Aviso");
RDebugUtils.currentLine=93978658;
 //BA.debugLineNum = 93978658;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmarcaralbaranfisico", "checkexistedocumentonav"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 26;
;
RDebugUtils.currentLine=93978659;
 //BA.debugLineNum = 93978659;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=93978661;
 //BA.debugLineNum = 93978661;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
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
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=93978666;
 //BA.debugLineNum = 93978666;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cmarcaralbaranfisico __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cmarcaralbaranfisico";
RDebugUtils.currentLine=93454336;
 //BA.debugLineNum = 93454336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=93454338;
 //BA.debugLineNum = 93454338;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=93454339;
 //BA.debugLineNum = 93454339;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=93454340;
 //BA.debugLineNum = 93454340;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=93454342;
 //BA.debugLineNum = 93454342;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=93454344;
 //BA.debugLineNum = 93454344;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=93454345;
 //BA.debugLineNum = 93454345;BA.debugLine="Private btnSeleccionarDocumento As Button";
_btnseleccionardocumento = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=93454346;
 //BA.debugLineNum = 93454346;BA.debugLine="Private lblTitleDocumentosActualizados As Label";
_lbltitledocumentosactualizados = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=93454348;
 //BA.debugLineNum = 93454348;BA.debugLine="Private lstDocumentosActualizados As List";
_lstdocumentosactualizados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=93454349;
 //BA.debugLineNum = 93454349;BA.debugLine="Private clvDocumentosActualizados As CustomListVi";
_clvdocumentosactualizados = new b4j.example.customlistview();
RDebugUtils.currentLine=93454350;
 //BA.debugLineNum = 93454350;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cmarcaralbaranfisico __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cmarcaralbaranfisico";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=93650944;
 //BA.debugLineNum = 93650944;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=93650945;
 //BA.debugLineNum = 93650945;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=93650946;
 //BA.debugLineNum = 93650946;BA.debugLine="End Sub";
return "";
}
}