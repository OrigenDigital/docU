package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cdocumentosnavexpedicion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cdocumentosnavexpedicion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cdocumentosnavexpedicion.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalir = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnumexpedicion = null;
public b4j.example.customlistview _clvdocumentosexpedicion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdocumento = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtfechahoramov = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txttransporte = null;
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
public String  _initialize(b4j.docU.cdocumentosnavexpedicion __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=61145088;
 //BA.debugLineNum = 61145088;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.docU.cdocumentosnavexpedicion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=61210624;
 //BA.debugLineNum = 61210624;BA.debugLine="Sub Show";
RDebugUtils.currentLine=61210625;
 //BA.debugLineNum = 61210625;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",_main._xscreen /*int*/ ,_main._yscreen /*int*/ );
RDebugUtils.currentLine=61210626;
 //BA.debugLineNum = 61210626;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=61210627;
 //BA.debugLineNum = 61210627;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=61210628;
 //BA.debugLineNum = 61210628;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=61210629;
 //BA.debugLineNum = 61210629;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(_main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=61210630;
 //BA.debugLineNum = 61210630;BA.debugLine="frm.RootPane.LoadLayout(\"scrDocumentosExpedicion\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrDocumentosExpedicion");
RDebugUtils.currentLine=61210632;
 //BA.debugLineNum = 61210632;BA.debugLine="txtNumExpedicion.Text=\"\"";
__ref._txtnumexpedicion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=61210633;
 //BA.debugLineNum = 61210633;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=61210634;
 //BA.debugLineNum = 61210634;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
_utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=61210636;
 //BA.debugLineNum = 61210636;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=61210637;
 //BA.debugLineNum = 61210637;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cdocumentosnavexpedicion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=61341696;
 //BA.debugLineNum = 61341696;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=61341697;
 //BA.debugLineNum = 61341697;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=61341698;
 //BA.debugLineNum = 61341698;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cdocumentosnavexpedicion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=61407233;
 //BA.debugLineNum = 61407233;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=61407234;
 //BA.debugLineNum = 61407234;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=61407235;
 //BA.debugLineNum = 61407235;BA.debugLine="End Sub";
return "";
}
public void  _btnselnumexpedicion_click(b4j.docU.cdocumentosnavexpedicion __ref) throws Exception{
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "btnselnumexpedicion_click", false))
	 {Debug.delegate(ba, "btnselnumexpedicion_click", null); return;}
ResumableSub_btnSelNumExpedicion_Click rsub = new ResumableSub_btnSelNumExpedicion_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelNumExpedicion_Click extends BA.ResumableSub {
public ResumableSub_btnSelNumExpedicion_Click(b4j.docU.cdocumentosnavexpedicion parent,b4j.docU.cdocumentosnavexpedicion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cdocumentosnavexpedicion __ref;
b4j.docU.cdocumentosnavexpedicion parent;
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _numexpedicion = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cdocumentosnavexpedicion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61276161;
 //BA.debugLineNum = 61276161;BA.debugLine="Dialog.Title=\"Indica Nº Expedición\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Nº Expedición");
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=61276163;
 //BA.debugLineNum = 61276163;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=61276164;
 //BA.debugLineNum = 61276164;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=61276165;
 //BA.debugLineNum = 61276165;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=61276166;
 //BA.debugLineNum = 61276166;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=61276168;
 //BA.debugLineNum = 61276168;BA.debugLine="Utilidades.SetLightThemeInput(InputDlg)";
parent._utilidades._setlightthemeinput /*String*/ (_inputdlg);
RDebugUtils.currentLine=61276169;
 //BA.debugLineNum = 61276169;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=61276170;
 //BA.debugLineNum = 61276170;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=61276171;
 //BA.debugLineNum = 61276171;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=61276172;
 //BA.debugLineNum = 61276172;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=61276173;
 //BA.debugLineNum = 61276173;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=61276174;
 //BA.debugLineNum = 61276174;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=61276175;
 //BA.debugLineNum = 61276175;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=61276176;
 //BA.debugLineNum = 61276176;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cdocumentosnavexpedicion", "btnselnumexpedicion_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=61276178;
 //BA.debugLineNum = 61276178;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=61276179;
 //BA.debugLineNum = 61276179;BA.debugLine="Dim NumExpedicion As String=InputDlg.Text.Trim.To";
_numexpedicion = _inputdlg._text /*String*/ .trim().toUpperCase();
RDebugUtils.currentLine=61276181;
 //BA.debugLineNum = 61276181;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Es una exp";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Es una expedición de DHL?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=61276182;
 //BA.debugLineNum = 61276182;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cdocumentosnavexpedicion", "btnselnumexpedicion_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=61276183;
 //BA.debugLineNum = 61276183;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=61276184;
 //BA.debugLineNum = 61276184;BA.debugLine="NumExpedicion=NumExpedicion.SubString2(8,10) & N";
_numexpedicion = _numexpedicion.substring((int) (8),(int) (10))+_numexpedicion.substring((int) (12),(int) (20));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=61276187;
 //BA.debugLineNum = 61276187;BA.debugLine="txtNumExpedicion.Text=NumExpedicion";
__ref._txtnumexpedicion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_numexpedicion);
RDebugUtils.currentLine=61276189;
 //BA.debugLineNum = 61276189;BA.debugLine="clvDocumentosExpedicion.Clear";
__ref._clvdocumentosexpedicion /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=61276191;
 //BA.debugLineNum = 61276191;BA.debugLine="Wait For(DocumentosExpedicion(NumExpedicion)) com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cdocumentosnavexpedicion", "btnselnumexpedicion_click"), __ref._documentosexpedicion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_numexpedicion));
this.state = 23;
return;
case 23:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=61276192;
 //BA.debugLineNum = 61276192;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=61276193;
 //BA.debugLineNum = 61276193;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 11:
//if
this.state = 16;
if ((_accion).equals("OK") == false) { 
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
RDebugUtils.currentLine=61276194;
 //BA.debugLineNum = 61276194;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=61276195;
 //BA.debugLineNum = 61276195;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=61276196;
 //BA.debugLineNum = 61276196;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=61276197;
 //BA.debugLineNum = 61276197;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 17:
//for
this.state = 20;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group31 = _lstreg;
index31 = 0;
groupLen31 = group31.getSize();
this.state = 24;
if (true) break;

case 24:
//C
this.state = 20;
if (index31 < groupLen31) {
this.state = 19;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group31.Get(index31)));}
if (true) break;

case 25:
//C
this.state = 24;
index31++;
if (true) break;

case 19:
//C
this.state = 25;
RDebugUtils.currentLine=61276198;
 //BA.debugLineNum = 61276198;BA.debugLine="Log(mData)";
parent.__c.LogImpl("861276198",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=61276199;
 //BA.debugLineNum = 61276199;BA.debugLine="Dim p As Pane=xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=61276200;
 //BA.debugLineNum = 61276200;BA.debugLine="p.LoadLayout(\"scrItemDocumentoExpedicion\")";
_p.LoadLayout(ba,"scrItemDocumentoExpedicion");
RDebugUtils.currentLine=61276201;
 //BA.debugLineNum = 61276201;BA.debugLine="p.SetLayoutAnimated(0,0,0,clvDocumentosExpedicio";
_p.SetLayoutAnimated((int) (0),0,0,__ref._clvdocumentosexpedicion /*b4j.example.customlistview*/ ._asview().getWidth(),parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=61276203;
 //BA.debugLineNum = 61276203;BA.debugLine="txtDocumento.Text=mData.Get(\"Documento\")";
__ref._txtdocumento /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Documento"))));
RDebugUtils.currentLine=61276204;
 //BA.debugLineNum = 61276204;BA.debugLine="txtFechaHoraMov.Text=$\"$DateTime{mData.Get(\"Fech";
__ref._txtfechahoramov /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+parent.__c.SmartStringFormatter("datetime",_mdata.Get((Object)("FechaHoraMov")))+""));
RDebugUtils.currentLine=61276205;
 //BA.debugLineNum = 61276205;BA.debugLine="txtTransporte.Text=mData.Get(\"ResponsableFase\")";
__ref._txttransporte /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("ResponsableFase"))));
RDebugUtils.currentLine=61276206;
 //BA.debugLineNum = 61276206;BA.debugLine="clvDocumentosExpedicion.Add(p,\"\")";
__ref._clvdocumentosexpedicion /*b4j.example.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=61276208;
 //BA.debugLineNum = 61276208;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=61276209;
 //BA.debugLineNum = 61276209;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicion(b4j.docU.cdocumentosnavexpedicion __ref,String _numexp) throws Exception{
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "documentosexpedicion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicion", new Object[] {_numexp}));}
ResumableSub_DocumentosExpedicion rsub = new ResumableSub_DocumentosExpedicion(this,__ref,_numexp);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicion extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicion(b4j.docU.cdocumentosnavexpedicion parent,b4j.docU.cdocumentosnavexpedicion __ref,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cdocumentosnavexpedicion __ref;
b4j.docU.cdocumentosnavexpedicion parent;
String _numexp;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cdocumentosnavexpedicion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61538306;
 //BA.debugLineNum = 61538306;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=61538307;
 //BA.debugLineNum = 61538307;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=61538308;
 //BA.debugLineNum = 61538308;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=61538309;
 //BA.debugLineNum = 61538309;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=61538310;
 //BA.debugLineNum = 61538310;BA.debugLine="Dim Comando As String=\"DocumentosFaseExpedicionNu";
_comando = "DocumentosFaseExpedicionNumeroExpedicion";
RDebugUtils.currentLine=61538313;
 //BA.debugLineNum = 61538313;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(NumEx";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_numexp)},parent);
RDebugUtils.currentLine=61538315;
 //BA.debugLineNum = 61538315;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cdocumentosnavexpedicion", "documentosexpedicion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=61538316;
 //BA.debugLineNum = 61538316;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=61538317;
 //BA.debugLineNum = 61538317;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=61538318;
 //BA.debugLineNum = 61538318;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cdocumentosnavexpedicion", "documentosexpedicion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=61538319;
 //BA.debugLineNum = 61538319;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=61538320;
 //BA.debugLineNum = 61538320;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=61538322;
 //BA.debugLineNum = 61538322;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=61538323;
 //BA.debugLineNum = 61538323;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=61538324;
 //BA.debugLineNum = 61538324;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=61538325;
 //BA.debugLineNum = 61538325;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de documentos para el número de expedición seleccionado ("+_numexp+")","Aviso");
RDebugUtils.currentLine=61538326;
 //BA.debugLineNum = 61538326;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cdocumentosnavexpedicion", "documentosexpedicion"), _msa);
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
RDebugUtils.currentLine=61538328;
 //BA.debugLineNum = 61538328;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=61538329;
 //BA.debugLineNum = 61538329;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=61538330;
 //BA.debugLineNum = 61538330;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=61538331;
 //BA.debugLineNum = 61538331;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=61538334;
 //BA.debugLineNum = 61538334;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=61538335;
 //BA.debugLineNum = 61538335;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cdocumentosnavexpedicion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cdocumentosnavexpedicion";
RDebugUtils.currentLine=61079552;
 //BA.debugLineNum = 61079552;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=61079553;
 //BA.debugLineNum = 61079553;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=61079554;
 //BA.debugLineNum = 61079554;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=61079555;
 //BA.debugLineNum = 61079555;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=61079557;
 //BA.debugLineNum = 61079557;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=61079558;
 //BA.debugLineNum = 61079558;BA.debugLine="Private btnSalir As B4XView";
_btnsalir = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61079560;
 //BA.debugLineNum = 61079560;BA.debugLine="Private txtNumExpedicion As B4XView";
_txtnumexpedicion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61079561;
 //BA.debugLineNum = 61079561;BA.debugLine="Private clvDocumentosExpedicion As CustomListView";
_clvdocumentosexpedicion = new b4j.example.customlistview();
RDebugUtils.currentLine=61079562;
 //BA.debugLineNum = 61079562;BA.debugLine="Private txtDocumento As B4XView";
_txtdocumento = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61079563;
 //BA.debugLineNum = 61079563;BA.debugLine="Private txtFechaHoraMov As B4XView";
_txtfechahoramov = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61079564;
 //BA.debugLineNum = 61079564;BA.debugLine="Private txtTransporte As B4XView";
_txttransporte = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61079565;
 //BA.debugLineNum = 61079565;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cdocumentosnavexpedicion __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cdocumentosnavexpedicion";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=61472768;
 //BA.debugLineNum = 61472768;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=61472769;
 //BA.debugLineNum = 61472769;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=61472770;
 //BA.debugLineNum = 61472770;BA.debugLine="End Sub";
return "";
}
}