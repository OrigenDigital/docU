package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jampegardatospreview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jampegardatospreview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jampegardatospreview.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _mlstcampospegar = null;
public anywheresoftware.b4j.objects.TableViewWrapper _tvpegardatospreview = null;
public anywheresoftware.b4a.objects.collections.List _lstdatospegar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnokpegardatospreview = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btncancelarpegardatospreview = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnpegarcontenidoclipboarddatospreview = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnmsginfo = null;
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _textareadlg = null;
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
public String  _initialize(b4j.docU.jampegardatospreview __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.collections.List _lstcampospegar) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent,_lstcampospegar}));}
String _scampo = "";
RDebugUtils.currentLine=157089792;
 //BA.debugLineNum = 157089792;BA.debugLine="Public Sub Initialize(CallBack As Object,Parent As";
RDebugUtils.currentLine=157089794;
 //BA.debugLineNum = 157089794;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=157089795;
 //BA.debugLineNum = 157089795;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=157089798;
 //BA.debugLineNum = 157089798;BA.debugLine="mlstCamposPegar.Initialize";
__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=157089799;
 //BA.debugLineNum = 157089799;BA.debugLine="For Each sCampo As String In lstCamposPegar";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lstcampospegar;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_scampo = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=157089800;
 //BA.debugLineNum = 157089800;BA.debugLine="mlstCamposPegar.Add(sCampo.ToUpperCase.Trim)";
__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_scampo.toUpperCase().trim()));
 }
};
RDebugUtils.currentLine=157089802;
 //BA.debugLineNum = 157089802;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.docU.jampegardatospreview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.collections.Map _mdim = null;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=157155328;
 //BA.debugLineNum = 157155328;BA.debugLine="Public Sub show";
RDebugUtils.currentLine=157155330;
 //BA.debugLineNum = 157155330;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=157155331;
 //BA.debugLineNum = 157155331;BA.debugLine="If v.Tag <> Null And v.Tag = \"jamPegarDatosPrevi";
if (_v.getTag()!= null && (_v.getTag()).equals((Object)("jamPegarDatosPreview_background"))) { 
RDebugUtils.currentLine=157155332;
 //BA.debugLineNum = 157155332;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=157155333;
 //BA.debugLineNum = 157155333;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=157155337;
 //BA.debugLineNum = 157155337;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=157155338;
 //BA.debugLineNum = 157155338;BA.debugLine="Background.Tag = \"jamPegarDatosPreview_background";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("jamPegarDatosPreview_background"));
RDebugUtils.currentLine=157155339;
 //BA.debugLineNum = 157155339;BA.debugLine="Background.Color=0xaa000000";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xaa000000));
RDebugUtils.currentLine=157155340;
 //BA.debugLineNum = 157155340;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=157155342;
 //BA.debugLineNum = 157155342;BA.debugLine="Dim mDim As Map";
_mdim = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157155343;
 //BA.debugLineNum = 157155343;BA.debugLine="mDim.Initialize";
_mdim.Initialize();
RDebugUtils.currentLine=157155344;
 //BA.debugLineNum = 157155344;BA.debugLine="mDim.Put(\"X\",fx.PrimaryScreen.MaxX - fx.PrimarySc";
_mdim.Put((Object)("X"),(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxX()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinX()));
RDebugUtils.currentLine=157155345;
 //BA.debugLineNum = 157155345;BA.debugLine="mDim.Put(\"Y\",fx.PrimaryScreen.MaxY - fx.PrimarySc";
_mdim.Put((Object)("Y"),(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()));
RDebugUtils.currentLine=157155347;
 //BA.debugLineNum = 157155347;BA.debugLine="frm.Initialize(\"frm\",mDim.Get(\"X\")*0.75,mDim.Get(";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",(double)(BA.ObjectToNumber(_mdim.Get((Object)("X"))))*0.75,(double)(BA.ObjectToNumber(_mdim.Get((Object)("Y"))))*0.75);
RDebugUtils.currentLine=157155348;
 //BA.debugLineNum = 157155348;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=157155349;
 //BA.debugLineNum = 157155349;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=157155350;
 //BA.debugLineNum = 157155350;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=157155351;
 //BA.debugLineNum = 157155351;BA.debugLine="frm.RootPane.LoadLayout(\"scrJamPegarDatosPreview\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrJamPegarDatosPreview");
RDebugUtils.currentLine=157155352;
 //BA.debugLineNum = 157155352;BA.debugLine="frm.Title=\"Pegar Datos Copiados\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Pegar Datos Copiados");
RDebugUtils.currentLine=157155353;
 //BA.debugLineNum = 157155353;BA.debugLine="btnOkPegarDatosPreview.Enabled=False";
__ref._btnokpegardatospreview /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(__c.False);
RDebugUtils.currentLine=157155354;
 //BA.debugLineNum = 157155354;BA.debugLine="btnCancelarPegarDatosPreview.Enabled=True";
__ref._btncancelarpegardatospreview /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=157155356;
 //BA.debugLineNum = 157155356;BA.debugLine="SetPlaceholderText(\"Tabla sin Datos\")";
__ref._setplaceholdertext /*String*/ (null,"Tabla sin Datos");
RDebugUtils.currentLine=157155358;
 //BA.debugLineNum = 157155358;BA.debugLine="lstDatosPegar.Initialize";
__ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=157155360;
 //BA.debugLineNum = 157155360;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=157155362;
 //BA.debugLineNum = 157155362;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=157155364;
 //BA.debugLineNum = 157155364;BA.debugLine="End Sub";
return "";
}
public void  _analisisrobotclipboard(b4j.docU.jampegardatospreview __ref) throws Exception{
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "analisisrobotclipboard", true))
	 {Debug.delegate(ba, "analisisrobotclipboard", null); return;}
ResumableSub_AnalisisRobotClipBoard rsub = new ResumableSub_AnalisisRobotClipBoard(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_AnalisisRobotClipBoard extends BA.ResumableSub {
public ResumableSub_AnalisisRobotClipBoard(b4j.docU.jampegardatospreview parent,b4j.docU.jampegardatospreview __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jampegardatospreview __ref;
b4j.docU.jampegardatospreview parent;
butt.droid.awtRobot.AWTRobot _jawt = null;
String _sclip = "";
Object _msa = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancelar = null;
int _result = 0;
int _nfilas = 0;
int _ncols = 0;
boolean _primerafila = false;
int _i = 0;
String _schar = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcontenidocelda = null;
anywheresoftware.b4a.objects.collections.List _lstencabezados = null;
anywheresoftware.b4a.objects.collections.Map _mfila = null;
int _colact = 0;
int _filaact = 0;
String[][] _celdas = null;
int _currfila = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
int _nf = 0;
int _nc = 0;
boolean _flagencabezadosok = false;
anywheresoftware.b4a.objects.collections.List _lstencabezadosfaltantes = null;
String _scampo = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sberrencabezados = null;
String _serrenc = "";
int _idxcol = 0;
Object[] _row = null;
int _numcol = 0;
int step28;
int limit28;
int step52;
int limit52;
anywheresoftware.b4a.BA.IterableList group90;
int index90;
int groupLen90;
anywheresoftware.b4a.BA.IterableList group91;
int index91;
int groupLen91;
int step97;
int limit97;
int step98;
int limit98;
anywheresoftware.b4a.BA.IterableList group105;
int index105;
int groupLen105;
anywheresoftware.b4a.BA.IterableList group116;
int index116;
int groupLen116;
int step123;
int limit123;
anywheresoftware.b4a.BA.IterableList group126;
int index126;
int groupLen126;
anywheresoftware.b4a.BA.IterableList group128;
int index128;
int groupLen128;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jampegardatospreview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=157679617;
 //BA.debugLineNum = 157679617;BA.debugLine="Dim jAWT As AWTRobot";
_jawt = new butt.droid.awtRobot.AWTRobot();
RDebugUtils.currentLine=157679618;
 //BA.debugLineNum = 157679618;BA.debugLine="Dim sClip As String=jAWT.ClipboardStringGet";
_sclip = _jawt.ClipboardStringGet();
RDebugUtils.currentLine=157679620;
 //BA.debugLineNum = 157679620;BA.debugLine="Log(sClip)";
parent.__c.LogImpl("9157679620",_sclip,0);
RDebugUtils.currentLine=157679621;
 //BA.debugLineNum = 157679621;BA.debugLine="Log(\"**************** String\")";
parent.__c.LogImpl("9157679621","**************** String",0);
RDebugUtils.currentLine=157679624;
 //BA.debugLineNum = 157679624;BA.debugLine="If sClip.Length<1 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sclip.length()<1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=157679625;
 //BA.debugLineNum = 157679625;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay nada c";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay nada copiado","Aviso");
RDebugUtils.currentLine=157679626;
 //BA.debugLineNum = 157679626;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jampegardatospreview", "analisisrobotclipboard"), _msa);
this.state = 110;
return;
case 110:
//C
this.state = 4;
;
RDebugUtils.currentLine=157679627;
 //BA.debugLineNum = 157679627;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=157679634;
 //BA.debugLineNum = 157679634;BA.debugLine="Dialog.Title=\"Vista Preliminar Datos a Pegar\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Vista Preliminar Datos a Pegar");
RDebugUtils.currentLine=157679636;
 //BA.debugLineNum = 157679636;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=157679637;
 //BA.debugLineNum = 157679637;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, frm.RootPane.Width*0";
_p.SetLayoutAnimated((int) (0),0,0,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth()*0.8,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight()*0.8);
RDebugUtils.currentLine=157679638;
 //BA.debugLineNum = 157679638;BA.debugLine="p.LoadLayout(\"scrDlgTextArea\")";
_p.LoadLayout("scrDlgTextArea",ba);
RDebugUtils.currentLine=157679639;
 //BA.debugLineNum = 157679639;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowCustom(p, \"Co";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("Continuar"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=157679640;
 //BA.debugLineNum = 157679640;BA.debugLine="Dialog.Resize(frm.RootPane.Width,frm.RootPane.Hei";
__ref._dialog /*b4j.docU.b4xdialog*/ ._resize /*String*/ (null,(int) (__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth()),(int) (__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight()));
RDebugUtils.currentLine=157679641;
 //BA.debugLineNum = 157679641;BA.debugLine="TextAreaDlg.Text=sClip";
__ref._textareadlg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_sclip);
RDebugUtils.currentLine=157679642;
 //BA.debugLineNum = 157679642;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=157679643;
 //BA.debugLineNum = 157679643;BA.debugLine="bOK.Left=bOK.Left-200dip";
_bok.setLeft(_bok.getLeft()-parent.__c.DipToCurrent((int) (200)));
RDebugUtils.currentLine=157679644;
 //BA.debugLineNum = 157679644;BA.debugLine="bOK.Width=bOK.Width+100dip";
_bok.setWidth(_bok.getWidth()+parent.__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=157679645;
 //BA.debugLineNum = 157679645;BA.debugLine="Dim bCancelar As B4XView=Dialog.GetButton(xui.Dia";
_bcancelar = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancelar = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=157679646;
 //BA.debugLineNum = 157679646;BA.debugLine="bCancelar.Left=bCancelar.Left-100dip";
_bcancelar.setLeft(_bcancelar.getLeft()-parent.__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=157679647;
 //BA.debugLineNum = 157679647;BA.debugLine="bCancelar.Width=bCancelar.Width+100dip";
_bcancelar.setWidth(_bcancelar.getWidth()+parent.__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=157679648;
 //BA.debugLineNum = 157679648;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jampegardatospreview", "analisisrobotclipboard"), _rs);
this.state = 111;
return;
case 111:
//C
this.state = 5;
_result = (int) result[1];
;
RDebugUtils.currentLine=157679649;
 //BA.debugLineNum = 157679649;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 5:
//if
this.state = 10;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=157679655;
 //BA.debugLineNum = 157679655;BA.debugLine="Dim nFilas As Int=1";
_nfilas = (int) (1);
RDebugUtils.currentLine=157679656;
 //BA.debugLineNum = 157679656;BA.debugLine="Dim nCols As Int=1";
_ncols = (int) (1);
RDebugUtils.currentLine=157679657;
 //BA.debugLineNum = 157679657;BA.debugLine="Dim PrimeraFila As Boolean=True";
_primerafila = parent.__c.True;
RDebugUtils.currentLine=157679658;
 //BA.debugLineNum = 157679658;BA.debugLine="For i=0 To sClip.Length-1";
if (true) break;

case 11:
//for
this.state = 26;
step28 = 1;
limit28 = (int) (_sclip.length()-1);
_i = (int) (0) ;
this.state = 112;
if (true) break;

case 112:
//C
this.state = 26;
if ((step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28)) this.state = 13;
if (true) break;

case 113:
//C
this.state = 112;
_i = ((int)(0 + _i + step28)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=157679659;
 //BA.debugLineNum = 157679659;BA.debugLine="Dim sChar As String=sClip.SubString2(i,(i+1))";
_schar = _sclip.substring(_i,(int) ((_i+1)));
RDebugUtils.currentLine=157679660;
 //BA.debugLineNum = 157679660;BA.debugLine="Select sChar";
if (true) break;

case 14:
//select
this.state = 25;
switch (BA.switchObjectToInt(_schar,parent.__c.TAB,parent.__c.CRLF)) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
default: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=157679663;
 //BA.debugLineNum = 157679663;BA.debugLine="If PrimeraFila Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_primerafila) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=157679665;
 //BA.debugLineNum = 157679665;BA.debugLine="nCols=nCols+1";
_ncols = (int) (_ncols+1);
 if (true) break;

case 20:
//C
this.state = 25;
;
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=157679669;
 //BA.debugLineNum = 157679669;BA.debugLine="PrimeraFila=False";
_primerafila = parent.__c.False;
RDebugUtils.currentLine=157679670;
 //BA.debugLineNum = 157679670;BA.debugLine="nFilas=nFilas+1";
_nfilas = (int) (_nfilas+1);
 if (true) break;

case 24:
//C
this.state = 25;
 if (true) break;

case 25:
//C
this.state = 113;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=157679676;
 //BA.debugLineNum = 157679676;BA.debugLine="nFilas=nFilas-1";
_nfilas = (int) (_nfilas-1);
RDebugUtils.currentLine=157679677;
 //BA.debugLineNum = 157679677;BA.debugLine="Log (\"nFilas \" & nFilas & \"  nCols \" & nCols)";
parent.__c.LogImpl("9157679677","nFilas "+BA.NumberToString(_nfilas)+"  nCols "+BA.NumberToString(_ncols),0);
RDebugUtils.currentLine=157679680;
 //BA.debugLineNum = 157679680;BA.debugLine="Dim sbContenidoCelda As StringBuilder";
_sbcontenidocelda = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=157679681;
 //BA.debugLineNum = 157679681;BA.debugLine="sbContenidoCelda.Initialize";
_sbcontenidocelda.Initialize();
RDebugUtils.currentLine=157679682;
 //BA.debugLineNum = 157679682;BA.debugLine="Dim lstEncabezados As List";
_lstencabezados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=157679683;
 //BA.debugLineNum = 157679683;BA.debugLine="lstEncabezados.Initialize";
_lstencabezados.Initialize();
RDebugUtils.currentLine=157679685;
 //BA.debugLineNum = 157679685;BA.debugLine="Dim mFila As Map";
_mfila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157679686;
 //BA.debugLineNum = 157679686;BA.debugLine="mFila.Initialize";
_mfila.Initialize();
RDebugUtils.currentLine=157679687;
 //BA.debugLineNum = 157679687;BA.debugLine="PrimeraFila=True";
_primerafila = parent.__c.True;
RDebugUtils.currentLine=157679688;
 //BA.debugLineNum = 157679688;BA.debugLine="Dim ColAct, FilaAct As Int";
_colact = 0;
_filaact = 0;
RDebugUtils.currentLine=157679689;
 //BA.debugLineNum = 157679689;BA.debugLine="Dim Celdas(nFilas,nCols) As String";
_celdas = new String[_nfilas][];
{
int d0 = _celdas.length;
int d1 = _ncols;
for (int i0 = 0;i0 < d0;i0++) {
_celdas[i0] = new String[d1];
java.util.Arrays.fill(_celdas[i0],"");
}
}
;
RDebugUtils.currentLine=157679690;
 //BA.debugLineNum = 157679690;BA.debugLine="For i=0 To sClip.Length-1";
if (true) break;

case 27:
//for
this.state = 58;
step52 = 1;
limit52 = (int) (_sclip.length()-1);
_i = (int) (0) ;
this.state = 114;
if (true) break;

case 114:
//C
this.state = 58;
if ((step52 > 0 && _i <= limit52) || (step52 < 0 && _i >= limit52)) this.state = 29;
if (true) break;

case 115:
//C
this.state = 114;
_i = ((int)(0 + _i + step52)) ;
if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=157679691;
 //BA.debugLineNum = 157679691;BA.debugLine="Dim sChar As String=sClip.SubString2(i,(i+1))";
_schar = _sclip.substring(_i,(int) ((_i+1)));
RDebugUtils.currentLine=157679692;
 //BA.debugLineNum = 157679692;BA.debugLine="Select sChar";
if (true) break;

case 30:
//select
this.state = 57;
switch (BA.switchObjectToInt(_schar,parent.__c.TAB,parent.__c.CRLF)) {
case 0: {
this.state = 32;
if (true) break;
}
case 1: {
this.state = 44;
if (true) break;
}
default: {
this.state = 56;
if (true) break;
}
}
if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=157679695;
 //BA.debugLineNum = 157679695;BA.debugLine="If PrimeraFila Then";
if (true) break;

case 33:
//if
this.state = 42;
if (_primerafila) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 42;
RDebugUtils.currentLine=157679696;
 //BA.debugLineNum = 157679696;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
_celdas[_filaact][_colact] = _sbcontenidocelda.ToString().trim();
RDebugUtils.currentLine=157679697;
 //BA.debugLineNum = 157679697;BA.debugLine="lstEncabezados.Add(sbContenidoCelda.ToString.";
_lstencabezados.Add((Object)(_sbcontenidocelda.ToString().toUpperCase().trim()));
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=157679699;
 //BA.debugLineNum = 157679699;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
_celdas[_filaact][_colact] = _sbcontenidocelda.ToString();
RDebugUtils.currentLine=157679700;
 //BA.debugLineNum = 157679700;BA.debugLine="If mlstCamposPegar.IndexOf(lstEncabezados.Get";
if (true) break;

case 38:
//if
this.state = 41;
if (__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_lstencabezados.Get(_colact))>-1) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=157679701;
 //BA.debugLineNum = 157679701;BA.debugLine="mFila.put(lstEncabezados.Get(ColAct),sbConte";
_mfila.Put(_lstencabezados.Get(_colact),(Object)(_sbcontenidocelda.ToString().trim()));
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 57;
;
RDebugUtils.currentLine=157679705;
 //BA.debugLineNum = 157679705;BA.debugLine="sbContenidoCelda.Initialize";
_sbcontenidocelda.Initialize();
RDebugUtils.currentLine=157679706;
 //BA.debugLineNum = 157679706;BA.debugLine="ColAct=ColAct+1";
_colact = (int) (_colact+1);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=157679709;
 //BA.debugLineNum = 157679709;BA.debugLine="If PrimeraFila Then";
if (true) break;

case 45:
//if
this.state = 54;
if (_primerafila) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 54;
RDebugUtils.currentLine=157679710;
 //BA.debugLineNum = 157679710;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
_celdas[_filaact][_colact] = _sbcontenidocelda.ToString().trim();
RDebugUtils.currentLine=157679711;
 //BA.debugLineNum = 157679711;BA.debugLine="lstEncabezados.Add(sbContenidoCelda.ToString.";
_lstencabezados.Add((Object)(_sbcontenidocelda.ToString().toUpperCase().trim()));
RDebugUtils.currentLine=157679712;
 //BA.debugLineNum = 157679712;BA.debugLine="PrimeraFila=False";
_primerafila = parent.__c.False;
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=157679714;
 //BA.debugLineNum = 157679714;BA.debugLine="Celdas(FilaAct,ColAct)=sbContenidoCelda.ToStr";
_celdas[_filaact][_colact] = _sbcontenidocelda.ToString().trim();
RDebugUtils.currentLine=157679715;
 //BA.debugLineNum = 157679715;BA.debugLine="If mlstCamposPegar.IndexOf(lstEncabezados.Get";
if (true) break;

case 50:
//if
this.state = 53;
if (__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_lstencabezados.Get(_colact))>-1) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=157679716;
 //BA.debugLineNum = 157679716;BA.debugLine="mFila.put(lstEncabezados.Get(ColAct),sbConte";
_mfila.Put(_lstencabezados.Get(_colact),(Object)(_sbcontenidocelda.ToString().trim()));
RDebugUtils.currentLine=157679717;
 //BA.debugLineNum = 157679717;BA.debugLine="lstDatosPegar.Add(mFila)";
__ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mfila.getObject()));
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 57;
;
RDebugUtils.currentLine=157679721;
 //BA.debugLineNum = 157679721;BA.debugLine="Dim mFila As Map";
_mfila = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157679722;
 //BA.debugLineNum = 157679722;BA.debugLine="mFila.Initialize";
_mfila.Initialize();
RDebugUtils.currentLine=157679723;
 //BA.debugLineNum = 157679723;BA.debugLine="FilaAct=FilaAct+1";
_filaact = (int) (_filaact+1);
RDebugUtils.currentLine=157679724;
 //BA.debugLineNum = 157679724;BA.debugLine="ColAct=0";
_colact = (int) (0);
RDebugUtils.currentLine=157679725;
 //BA.debugLineNum = 157679725;BA.debugLine="sbContenidoCelda.Initialize";
_sbcontenidocelda.Initialize();
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=157679727;
 //BA.debugLineNum = 157679727;BA.debugLine="sbContenidoCelda.Append(sChar)";
_sbcontenidocelda.Append(_schar);
 if (true) break;

case 57:
//C
this.state = 115;
;
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=157679731;
 //BA.debugLineNum = 157679731;BA.debugLine="Log(\"********** Lista de mapas\")";
parent.__c.LogImpl("9157679731","********** Lista de mapas",0);
RDebugUtils.currentLine=157679732;
 //BA.debugLineNum = 157679732;BA.debugLine="Dim CurrFila As Int=0";
_currfila = (int) (0);
RDebugUtils.currentLine=157679733;
 //BA.debugLineNum = 157679733;BA.debugLine="For Each m As Map In lstDatosPegar";
if (true) break;

case 59:
//for
this.state = 66;
_m = new anywheresoftware.b4a.objects.collections.Map();
group90 = __ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ ;
index90 = 0;
groupLen90 = group90.getSize();
this.state = 116;
if (true) break;

case 116:
//C
this.state = 66;
if (index90 < groupLen90) {
this.state = 61;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group90.Get(index90)));}
if (true) break;

case 117:
//C
this.state = 116;
index90++;
if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=157679735;
 //BA.debugLineNum = 157679735;BA.debugLine="For Each k As String In m.Keys";
if (true) break;

case 62:
//for
this.state = 65;
group91 = _m.Keys();
index91 = 0;
groupLen91 = group91.getSize();
this.state = 118;
if (true) break;

case 118:
//C
this.state = 65;
if (index91 < groupLen91) {
this.state = 64;
_k = BA.ObjectToString(group91.Get(index91));}
if (true) break;

case 119:
//C
this.state = 118;
index91++;
if (true) break;

case 64:
//C
this.state = 119;
RDebugUtils.currentLine=157679736;
 //BA.debugLineNum = 157679736;BA.debugLine="Log(k & \": \" & m.Get(k))";
parent.__c.LogImpl("9157679736",_k+": "+BA.ObjectToString(_m.Get((Object)(_k))),0);
 if (true) break;
if (true) break;

case 65:
//C
this.state = 117;
;
RDebugUtils.currentLine=157679738;
 //BA.debugLineNum = 157679738;BA.debugLine="CurrFila=CurrFila+1";
_currfila = (int) (_currfila+1);
 if (true) break;
if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=157679740;
 //BA.debugLineNum = 157679740;BA.debugLine="Log(\"********** Array Bidimensional\")";
parent.__c.LogImpl("9157679740","********** Array Bidimensional",0);
RDebugUtils.currentLine=157679741;
 //BA.debugLineNum = 157679741;BA.debugLine="For nf=0 To nFilas-1";
if (true) break;

case 67:
//for
this.state = 74;
step97 = 1;
limit97 = (int) (_nfilas-1);
_nf = (int) (0) ;
this.state = 120;
if (true) break;

case 120:
//C
this.state = 74;
if ((step97 > 0 && _nf <= limit97) || (step97 < 0 && _nf >= limit97)) this.state = 69;
if (true) break;

case 121:
//C
this.state = 120;
_nf = ((int)(0 + _nf + step97)) ;
if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=157679742;
 //BA.debugLineNum = 157679742;BA.debugLine="For nc=0 To nCols-1";
if (true) break;

case 70:
//for
this.state = 73;
step98 = 1;
limit98 = (int) (_ncols-1);
_nc = (int) (0) ;
this.state = 122;
if (true) break;

case 122:
//C
this.state = 73;
if ((step98 > 0 && _nc <= limit98) || (step98 < 0 && _nc >= limit98)) this.state = 72;
if (true) break;

case 123:
//C
this.state = 122;
_nc = ((int)(0 + _nc + step98)) ;
if (true) break;

case 72:
//C
this.state = 123;
RDebugUtils.currentLine=157679743;
 //BA.debugLineNum = 157679743;BA.debugLine="Log(\"Celda Excel (\" & (nf+1) & \",\" & (nc+1) & \"";
parent.__c.LogImpl("9157679743","Celda Excel ("+BA.NumberToString((_nf+1))+","+BA.NumberToString((_nc+1))+") = "+_celdas[_nf][_nc],0);
 if (true) break;
if (true) break;

case 73:
//C
this.state = 121;
;
 if (true) break;
if (true) break;

case 74:
//C
this.state = 75;
;
RDebugUtils.currentLine=157679749;
 //BA.debugLineNum = 157679749;BA.debugLine="Dim FlagEncabezadosOK As Boolean=True";
_flagencabezadosok = parent.__c.True;
RDebugUtils.currentLine=157679750;
 //BA.debugLineNum = 157679750;BA.debugLine="Dim lstEncabezadosFaltantes As List";
_lstencabezadosfaltantes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=157679751;
 //BA.debugLineNum = 157679751;BA.debugLine="lstEncabezadosFaltantes.Initialize";
_lstencabezadosfaltantes.Initialize();
RDebugUtils.currentLine=157679752;
 //BA.debugLineNum = 157679752;BA.debugLine="For Each sCampo As String In mlstCamposPegar";
if (true) break;

case 75:
//for
this.state = 82;
group105 = __ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ ;
index105 = 0;
groupLen105 = group105.getSize();
this.state = 124;
if (true) break;

case 124:
//C
this.state = 82;
if (index105 < groupLen105) {
this.state = 77;
_scampo = BA.ObjectToString(group105.Get(index105));}
if (true) break;

case 125:
//C
this.state = 124;
index105++;
if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=157679753;
 //BA.debugLineNum = 157679753;BA.debugLine="If lstEncabezados.IndexOf(sCampo)=-1 Then";
if (true) break;

case 78:
//if
this.state = 81;
if (_lstencabezados.IndexOf((Object)(_scampo))==-1) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=157679754;
 //BA.debugLineNum = 157679754;BA.debugLine="lstEncabezadosFaltantes.Add(sCampo)";
_lstencabezadosfaltantes.Add((Object)(_scampo));
RDebugUtils.currentLine=157679755;
 //BA.debugLineNum = 157679755;BA.debugLine="FlagEncabezadosOK=False";
_flagencabezadosok = parent.__c.False;
 if (true) break;

case 81:
//C
this.state = 125;
;
 if (true) break;
if (true) break;

case 82:
//C
this.state = 83;
;
RDebugUtils.currentLine=157679758;
 //BA.debugLineNum = 157679758;BA.debugLine="btnOkPegarDatosPreview.Enabled=FlagEncabezadosOK";
__ref._btnokpegardatospreview /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_flagencabezadosok);
RDebugUtils.currentLine=157679759;
 //BA.debugLineNum = 157679759;BA.debugLine="If FlagEncabezadosOK=False Then";
if (true) break;

case 83:
//if
this.state = 109;
if (_flagencabezadosok==parent.__c.False) { 
this.state = 85;
}else {
this.state = 91;
}if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=157679760;
 //BA.debugLineNum = 157679760;BA.debugLine="Dim sbErrEncabezados As StringBuilder";
_sberrencabezados = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=157679761;
 //BA.debugLineNum = 157679761;BA.debugLine="sbErrEncabezados.Initialize";
_sberrencabezados.Initialize();
RDebugUtils.currentLine=157679762;
 //BA.debugLineNum = 157679762;BA.debugLine="sbErrEncabezados.Append(\"Error, faltan los sigui";
_sberrencabezados.Append("Error, faltan los siguientes encabezados:").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=157679763;
 //BA.debugLineNum = 157679763;BA.debugLine="For Each sErrEnc As String In lstEncabezadosFalt";
if (true) break;

case 86:
//for
this.state = 89;
group116 = _lstencabezadosfaltantes;
index116 = 0;
groupLen116 = group116.getSize();
this.state = 126;
if (true) break;

case 126:
//C
this.state = 89;
if (index116 < groupLen116) {
this.state = 88;
_serrenc = BA.ObjectToString(group116.Get(index116));}
if (true) break;

case 127:
//C
this.state = 126;
index116++;
if (true) break;

case 88:
//C
this.state = 127;
RDebugUtils.currentLine=157679764;
 //BA.debugLineNum = 157679764;BA.debugLine="sbErrEncabezados.Append(sErrEnc).Append(CRLF)";
_sberrencabezados.Append(_serrenc).Append(parent.__c.CRLF);
 if (true) break;
if (true) break;

case 89:
//C
this.state = 109;
;
RDebugUtils.currentLine=157679766;
 //BA.debugLineNum = 157679766;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sbErrEncabezad";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sberrencabezados.ToString(),"Error");
RDebugUtils.currentLine=157679767;
 //BA.debugLineNum = 157679767;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jampegardatospreview", "analisisrobotclipboard"), _msa);
this.state = 128;
return;
case 128:
//C
this.state = 109;
;
 if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=157679769;
 //BA.debugLineNum = 157679769;BA.debugLine="If tvPegarDatosPreview.ColumnsCount=0 Then tvPeg";
if (true) break;

case 92:
//if
this.state = 97;
if (__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getColumnsCount()==0) { 
this.state = 94;
;}if (true) break;

case 94:
//C
this.state = 97;
__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumns(__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ );
if (true) break;

case 97:
//C
this.state = 98;
;
RDebugUtils.currentLine=157679770;
 //BA.debugLineNum = 157679770;BA.debugLine="For idxCol=0 To tvPegarDatosPreview.ColumnsCount";
if (true) break;

case 98:
//for
this.state = 101;
step123 = 1;
limit123 = (int) (__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getColumnsCount()-1);
_idxcol = (int) (0) ;
this.state = 129;
if (true) break;

case 129:
//C
this.state = 101;
if ((step123 > 0 && _idxcol <= limit123) || (step123 < 0 && _idxcol >= limit123)) this.state = 100;
if (true) break;

case 130:
//C
this.state = 129;
_idxcol = ((int)(0 + _idxcol + step123)) ;
if (true) break;

case 100:
//C
this.state = 130;
RDebugUtils.currentLine=157679771;
 //BA.debugLineNum = 157679771;BA.debugLine="tvPegarDatosPreview.SetColumnWidth(idxCol,150)";
__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .SetColumnWidth(_idxcol,150);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=157679773;
 //BA.debugLineNum = 157679773;BA.debugLine="For Each m As Map In lstDatosPegar";

case 101:
//for
this.state = 108;
_m = new anywheresoftware.b4a.objects.collections.Map();
group126 = __ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ ;
index126 = 0;
groupLen126 = group126.getSize();
this.state = 131;
if (true) break;

case 131:
//C
this.state = 108;
if (index126 < groupLen126) {
this.state = 103;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group126.Get(index126)));}
if (true) break;

case 132:
//C
this.state = 131;
index126++;
if (true) break;

case 103:
//C
this.state = 104;
RDebugUtils.currentLine=157679774;
 //BA.debugLineNum = 157679774;BA.debugLine="Dim row(mlstCamposPegar.Size) As Object";
_row = new Object[__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=157679775;
 //BA.debugLineNum = 157679775;BA.debugLine="For Each k As String In m.Keys";
if (true) break;

case 104:
//for
this.state = 107;
group128 = _m.Keys();
index128 = 0;
groupLen128 = group128.getSize();
this.state = 133;
if (true) break;

case 133:
//C
this.state = 107;
if (index128 < groupLen128) {
this.state = 106;
_k = BA.ObjectToString(group128.Get(index128));}
if (true) break;

case 134:
//C
this.state = 133;
index128++;
if (true) break;

case 106:
//C
this.state = 134;
RDebugUtils.currentLine=157679776;
 //BA.debugLineNum = 157679776;BA.debugLine="Dim NumCol As Int=mlstCamposPegar.IndexOf(k)";
_numcol = __ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_k));
RDebugUtils.currentLine=157679777;
 //BA.debugLineNum = 157679777;BA.debugLine="row(NumCol)=m.Get(k)";
_row[_numcol] = _m.Get((Object)(_k));
 if (true) break;
if (true) break;

case 107:
//C
this.state = 132;
;
RDebugUtils.currentLine=157679779;
 //BA.debugLineNum = 157679779;BA.debugLine="tvPegarDatosPreview.Items.Add(row)";
__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Add((Object)(_row));
 if (true) break;
if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;

case 109:
//C
this.state = -1;
;
RDebugUtils.currentLine=157679782;
 //BA.debugLineNum = 157679782;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.jampegardatospreview __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "asjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=157417472;
 //BA.debugLineNum = 157417472;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=157417473;
 //BA.debugLineNum = 157417473;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=157417474;
 //BA.debugLineNum = 157417474;BA.debugLine="End Sub";
return null;
}
public String  _btncancelarpegardatospreview_click(b4j.docU.jampegardatospreview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "btncancelarpegardatospreview_click", true))
	 {return ((String) Debug.delegate(ba, "btncancelarpegardatospreview_click", null));}
RDebugUtils.currentLine=157548544;
 //BA.debugLineNum = 157548544;BA.debugLine="Private Sub btnCancelarPegarDatosPreview_Click";
RDebugUtils.currentLine=157548545;
 //BA.debugLineNum = 157548545;BA.debugLine="lstDatosPegar.Initialize";
__ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=157548546;
 //BA.debugLineNum = 157548546;BA.debugLine="SalirForm";
__ref._salirform /*void*/ (null);
RDebugUtils.currentLine=157548547;
 //BA.debugLineNum = 157548547;BA.debugLine="End Sub";
return "";
}
public void  _salirform(b4j.docU.jampegardatospreview __ref) throws Exception{
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "salirform", true))
	 {Debug.delegate(ba, "salirform", null); return;}
ResumableSub_SalirForm rsub = new ResumableSub_SalirForm(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SalirForm extends BA.ResumableSub {
public ResumableSub_SalirForm(b4j.docU.jampegardatospreview parent,b4j.docU.jampegardatospreview __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jampegardatospreview __ref;
b4j.docU.jampegardatospreview parent;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jampegardatospreview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=157810689;
 //BA.debugLineNum = 157810689;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=157810690;
 //BA.debugLineNum = 157810690;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=157810692;
 //BA.debugLineNum = 157810692;BA.debugLine="If SubExists(mCallBack,\"jamPegarDatos_Done\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.SubExists(ba,__ref._mcallback /*Object*/ ,"jamPegarDatos_Done")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=157810694;
 //BA.debugLineNum = 157810694;BA.debugLine="CallSubDelayed2(mCallBack, \"jamPegarDatos_Done\",";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,"jamPegarDatos_Done",(Object)(__ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=157810696;
 //BA.debugLineNum = 157810696;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de prog";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de programación. Revisar la sintaxis de jamPegarDatos. Ver método en código de ayuda en initialize.","Error");
RDebugUtils.currentLine=157810697;
 //BA.debugLineNum = 157810697;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jampegardatospreview", "salirform"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=157810699;
 //BA.debugLineNum = 157810699;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnmsginfo_click(b4j.docU.jampegardatospreview __ref) throws Exception{
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "btnmsginfo_click", true))
	 {Debug.delegate(ba, "btnmsginfo_click", null); return;}
ResumableSub_btnMsgInfo_Click rsub = new ResumableSub_btnMsgInfo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnMsgInfo_Click extends BA.ResumableSub {
public ResumableSub_btnMsgInfo_Click(b4j.docU.jampegardatospreview parent,b4j.docU.jampegardatospreview __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jampegardatospreview __ref;
b4j.docU.jampegardatospreview parent;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jampegardatospreview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=157745153;
 //BA.debugLineNum = 157745153;BA.debugLine="Dim sb As StringBuilder=MensajeInfo(mlstCamposPeg";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_sb = __ref._mensajeinfo /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ (null,__ref._mlstcampospegar /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=157745154;
 //BA.debugLineNum = 157745154;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sb.ToString,\"In";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sb.ToString(),"Información");
RDebugUtils.currentLine=157745155;
 //BA.debugLineNum = 157745155;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jampegardatospreview", "btnmsginfo_click"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=157745156;
 //BA.debugLineNum = 157745156;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.StringBuilderWrapper  _mensajeinfo(b4j.docU.jampegardatospreview __ref,anywheresoftware.b4a.objects.collections.List _lstcampospegar) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "mensajeinfo", true))
	 {return ((anywheresoftware.b4a.keywords.StringBuilderWrapper) Debug.delegate(ba, "mensajeinfo", new Object[] {_lstcampospegar}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _nombrecampo = "";
RDebugUtils.currentLine=157286400;
 //BA.debugLineNum = 157286400;BA.debugLine="private Sub MensajeInfo(lstCamposPegar As List) As";
RDebugUtils.currentLine=157286401;
 //BA.debugLineNum = 157286401;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=157286402;
 //BA.debugLineNum = 157286402;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=157286403;
 //BA.debugLineNum = 157286403;BA.debugLine="sb.Append(\"Condiciones a cumplir para el copiado-";
_sb.Append("Condiciones a cumplir para el copiado-pegado de datos:").Append(__c.CRLF).Append(__c.CRLF);
RDebugUtils.currentLine=157286404;
 //BA.debugLineNum = 157286404;BA.debugLine="sb.Append(\" - Los datos deben copiarse de una tab";
_sb.Append(" - Los datos deben copiarse de una tabla EXCEL");
RDebugUtils.currentLine=157286405;
 //BA.debugLineNum = 157286405;BA.debugLine="sb.Append(\" - Las columnas deben corresponder a l";
_sb.Append(" - Las columnas deben corresponder a los siguientes campos:").Append(__c.CRLF);
RDebugUtils.currentLine=157286406;
 //BA.debugLineNum = 157286406;BA.debugLine="For Each NombreCampo As String In lstCamposPegar";
{
final anywheresoftware.b4a.BA.IterableList group6 = _lstcampospegar;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_nombrecampo = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=157286407;
 //BA.debugLineNum = 157286407;BA.debugLine="sb.append(\" - \").Append(NombreCampo).Append(CRLF";
_sb.Append(" - ").Append(_nombrecampo).Append(__c.CRLF);
 }
};
RDebugUtils.currentLine=157286409;
 //BA.debugLineNum = 157286409;BA.debugLine="sb.Append(CRLF).Append(\"No importa el orden de la";
_sb.Append(__c.CRLF).Append("No importa el orden de las columnas, pero sí el encabezado, el cual debe ser idéntico al indicado anteriormente (no importa mayúsculas o minúsculas).");
RDebugUtils.currentLine=157286411;
 //BA.debugLineNum = 157286411;BA.debugLine="Return sb";
if (true) return _sb;
RDebugUtils.currentLine=157286412;
 //BA.debugLineNum = 157286412;BA.debugLine="End Sub";
return null;
}
public String  _btnokpegardatospreview_click(b4j.docU.jampegardatospreview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "btnokpegardatospreview_click", true))
	 {return ((String) Debug.delegate(ba, "btnokpegardatospreview_click", null));}
RDebugUtils.currentLine=157483008;
 //BA.debugLineNum = 157483008;BA.debugLine="Private Sub btnOkPegarDatosPreview_Click";
RDebugUtils.currentLine=157483009;
 //BA.debugLineNum = 157483009;BA.debugLine="SalirForm";
__ref._salirform /*void*/ (null);
RDebugUtils.currentLine=157483010;
 //BA.debugLineNum = 157483010;BA.debugLine="End Sub";
return "";
}
public String  _btnpegarcontenidoclipboarddatospreview_click(b4j.docU.jampegardatospreview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "btnpegarcontenidoclipboarddatospreview_click", true))
	 {return ((String) Debug.delegate(ba, "btnpegarcontenidoclipboarddatospreview_click", null));}
RDebugUtils.currentLine=157614080;
 //BA.debugLineNum = 157614080;BA.debugLine="Private Sub btnPegarContenidoClipboardDatosPreview";
RDebugUtils.currentLine=157614081;
 //BA.debugLineNum = 157614081;BA.debugLine="lstDatosPegar.Initialize";
__ref._lstdatospegar /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=157614082;
 //BA.debugLineNum = 157614082;BA.debugLine="tvPegarDatosPreview.Items.Clear";
__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=157614083;
 //BA.debugLineNum = 157614083;BA.debugLine="AnalisisRobotClipBoard";
__ref._analisisrobotclipboard /*void*/ (null);
RDebugUtils.currentLine=157614084;
 //BA.debugLineNum = 157614084;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.jampegardatospreview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
RDebugUtils.currentLine=157024256;
 //BA.debugLineNum = 157024256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=157024257;
 //BA.debugLineNum = 157024257;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=157024258;
 //BA.debugLineNum = 157024258;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=157024259;
 //BA.debugLineNum = 157024259;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=157024260;
 //BA.debugLineNum = 157024260;BA.debugLine="Private mlstCamposPegar As List";
_mlstcampospegar = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=157024261;
 //BA.debugLineNum = 157024261;BA.debugLine="Private tvPegarDatosPreview As TableView";
_tvpegardatospreview = new anywheresoftware.b4j.objects.TableViewWrapper();
RDebugUtils.currentLine=157024262;
 //BA.debugLineNum = 157024262;BA.debugLine="Private lstDatosPegar As List  ' lista de mapas c";
_lstdatospegar = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=157024263;
 //BA.debugLineNum = 157024263;BA.debugLine="Private btnOkPegarDatosPreview As Button";
_btnokpegardatospreview = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=157024264;
 //BA.debugLineNum = 157024264;BA.debugLine="Private btnCancelarPegarDatosPreview As Button";
_btncancelarpegardatospreview = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=157024265;
 //BA.debugLineNum = 157024265;BA.debugLine="Private btnPegarContenidoClipboardDatosPreview As";
_btnpegarcontenidoclipboarddatospreview = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=157024266;
 //BA.debugLineNum = 157024266;BA.debugLine="Private btnMsgInfo As Button";
_btnmsginfo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=157024268;
 //BA.debugLineNum = 157024268;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=157024269;
 //BA.debugLineNum = 157024269;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=157024270;
 //BA.debugLineNum = 157024270;BA.debugLine="Dim Background As B4XView";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=157024273;
 //BA.debugLineNum = 157024273;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=157024274;
 //BA.debugLineNum = 157024274;BA.debugLine="Private TextAreaDlg As B4XView";
_textareadlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=157024275;
 //BA.debugLineNum = 157024275;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.jampegardatospreview __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "frm_closerequest", true))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=157220864;
 //BA.debugLineNum = 157220864;BA.debugLine="private Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=157220865;
 //BA.debugLineNum = 157220865;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=157220866;
 //BA.debugLineNum = 157220866;BA.debugLine="End Sub";
return "";
}
public String  _setplaceholdertext(b4j.docU.jampegardatospreview __ref,String _textoplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="jampegardatospreview";
if (Debug.shouldDelegate(ba, "setplaceholdertext", true))
	 {return ((String) Debug.delegate(ba, "setplaceholdertext", new Object[] {_textoplaceholder}));}
anywheresoftware.b4j.object.JavaObject _pohjo = null;
anywheresoftware.b4j.objects.LabelWrapper _lblph = null;
RDebugUtils.currentLine=157351936;
 //BA.debugLineNum = 157351936;BA.debugLine="Public Sub SetPlaceholderText(TextoPlaceholder As";
RDebugUtils.currentLine=157351937;
 //BA.debugLineNum = 157351937;BA.debugLine="Dim pohJO As JavaObject=asJO(tvPegarDatosPreview)";
_pohjo = new anywheresoftware.b4j.object.JavaObject();
_pohjo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tvpegardatospreview /*anywheresoftware.b4j.objects.TableViewWrapper*/ .getObject()))).RunMethod("getPlaceholder",(Object[])(__c.Null))));
RDebugUtils.currentLine=157351938;
 //BA.debugLineNum = 157351938;BA.debugLine="If pohJO.IsInitialized Then";
if (_pohjo.IsInitialized()) { 
RDebugUtils.currentLine=157351939;
 //BA.debugLineNum = 157351939;BA.debugLine="If pohJO Is Label Then";
if (_pohjo.getObjectOrNull() instanceof javafx.scene.control.Label) { 
RDebugUtils.currentLine=157351940;
 //BA.debugLineNum = 157351940;BA.debugLine="Dim lblPH As Label=pohJO";
_lblph = new anywheresoftware.b4j.objects.LabelWrapper();
_lblph = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pohjo.getObject()));
RDebugUtils.currentLine=157351941;
 //BA.debugLineNum = 157351941;BA.debugLine="lblPH.Text=TextoPlaceholder";
_lblph.setText(_textoplaceholder);
RDebugUtils.currentLine=157351942;
 //BA.debugLineNum = 157351942;BA.debugLine="lblPH.TextColor=fx.Colors.From32Bit(0xFFFF0000)";
_lblph.setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffff0000))));
 };
 };
RDebugUtils.currentLine=157351947;
 //BA.debugLineNum = 157351947;BA.debugLine="End Sub";
return "";
}
}