package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xtimedtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xtimedtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xtimedtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.docU.anotherprogressbar _anotherprogressbar1 = null;
public Object _mtemplate = null;
public int _timeoutmilliseconds = 0;
public int _index = 0;
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
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.b4xtimedtemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
anywheresoftware.b4a.objects.B4XViewWrapper _innerpanel = null;
RDebugUtils.currentLine=247726080;
 //BA.debugLineNum = 247726080;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=247726081;
 //BA.debugLineNum = 247726081;BA.debugLine="If mBase.NumberOfViews = 0 Then";
if (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=247726082;
 //BA.debugLineNum = 247726082;BA.debugLine="Dim InnerPanel As B4XView = CallSub2(mTemplate,";
_innerpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_innerpanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"GetPanel",(Object)(_dialog))));
RDebugUtils.currentLine=247726083;
 //BA.debugLineNum = 247726083;BA.debugLine="If InnerPanel.Parent.IsInitialized Then InnerPan";
if (_innerpanel.getParent().IsInitialized()) { 
_innerpanel.RemoveViewFromParent();};
RDebugUtils.currentLine=247726084;
 //BA.debugLineNum = 247726084;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, InnerPanel.Widt";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_innerpanel.getWidth(),_innerpanel.getHeight()+__c.DipToCurrent((int) (19)));
RDebugUtils.currentLine=247726085;
 //BA.debugLineNum = 247726085;BA.debugLine="mBase.LoadLayout(\"TimedDialogTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("TimedDialogTemplate",ba);
RDebugUtils.currentLine=247726086;
 //BA.debugLineNum = 247726086;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=247726087;
 //BA.debugLineNum = 247726087;BA.debugLine="mBase.AddView(InnerPanel, 0, 19dip, InnerPanel.W";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_innerpanel.getObject()),0,__c.DipToCurrent((int) (19)),_innerpanel.getWidth(),_innerpanel.getHeight());
 };
RDebugUtils.currentLine=247726089;
 //BA.debugLineNum = 247726089;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=247726090;
 //BA.debugLineNum = 247726090;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.docU.b4xtimedtemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.b4xtimedtemplate parent,b4j.docU.b4xtimedtemplate __ref,b4j.docU.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.docU.b4xtimedtemplate __ref;
b4j.docU.b4xtimedtemplate parent;
b4j.docU.b4xdialog _dialog;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtimedtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=247791617;
 //BA.debugLineNum = 247791617;BA.debugLine="CallSub2(mTemplate, \"Show\", Dialog)";
parent.__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"Show",(Object)(_dialog));
RDebugUtils.currentLine=247791618;
 //BA.debugLineNum = 247791618;BA.debugLine="AnotherProgressBar1.SetValueNoAnimation(0)";
__ref._anotherprogressbar1 /*b4j.docU.anotherprogressbar*/ ._setvaluenoanimation /*String*/ (null,(int) (0));
RDebugUtils.currentLine=247791619;
 //BA.debugLineNum = 247791619;BA.debugLine="AnotherProgressBar1.ValueChangePerSecond = 100 /";
__ref._anotherprogressbar1 /*b4j.docU.anotherprogressbar*/ ._valuechangepersecond /*float*/  = (float) (100/(double)(__ref._timeoutmilliseconds /*int*/ /(double)1000));
RDebugUtils.currentLine=247791620;
 //BA.debugLineNum = 247791620;BA.debugLine="AnotherProgressBar1.Value = 100";
__ref._anotherprogressbar1 /*b4j.docU.anotherprogressbar*/ ._setvalue /*int*/ (null,(int) (100));
RDebugUtils.currentLine=247791621;
 //BA.debugLineNum = 247791621;BA.debugLine="Index = Index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=247791622;
 //BA.debugLineNum = 247791622;BA.debugLine="Dim MyIndex As Int = Index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=247791623;
 //BA.debugLineNum = 247791623;BA.debugLine="Sleep(TimeoutMilliseconds)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtimedtemplate", "show"),__ref._timeoutmilliseconds /*int*/ );
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=247791624;
 //BA.debugLineNum = 247791624;BA.debugLine="If MyIndex = Index Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex==__ref._index /*int*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=247791625;
 //BA.debugLineNum = 247791625;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
_dialog._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=247791627;
 //BA.debugLineNum = 247791627;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4j.docU.b4xtimedtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=247857152;
 //BA.debugLineNum = 247857152;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=247857153;
 //BA.debugLineNum = 247857153;BA.debugLine="Index = Index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=247857154;
 //BA.debugLineNum = 247857154;BA.debugLine="CallSub2(mTemplate, \"DialogClosed\", Result)";
__c.CallSubDebug2(ba,__ref._mtemplate /*Object*/ ,"DialogClosed",(Object)(_result));
RDebugUtils.currentLine=247857155;
 //BA.debugLineNum = 247857155;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xtimedtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtimedtemplate";
RDebugUtils.currentLine=247595008;
 //BA.debugLineNum = 247595008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=247595009;
 //BA.debugLineNum = 247595009;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=247595010;
 //BA.debugLineNum = 247595010;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=247595011;
 //BA.debugLineNum = 247595011;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
_anotherprogressbar1 = new b4j.docU.anotherprogressbar();
RDebugUtils.currentLine=247595012;
 //BA.debugLineNum = 247595012;BA.debugLine="Private mTemplate As Object";
_mtemplate = new Object();
RDebugUtils.currentLine=247595013;
 //BA.debugLineNum = 247595013;BA.debugLine="Public TimeoutMilliseconds As Int = 10000";
_timeoutmilliseconds = (int) (10000);
RDebugUtils.currentLine=247595014;
 //BA.debugLineNum = 247595014;BA.debugLine="Private Index As Int";
_index = 0;
RDebugUtils.currentLine=247595015;
 //BA.debugLineNum = 247595015;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.b4xtimedtemplate __ref,anywheresoftware.b4a.BA _ba,Object _innertemplate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtimedtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_innertemplate}));}
RDebugUtils.currentLine=247660544;
 //BA.debugLineNum = 247660544;BA.debugLine="Public Sub Initialize (InnerTemplate As Object)";
RDebugUtils.currentLine=247660545;
 //BA.debugLineNum = 247660545;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=247660546;
 //BA.debugLineNum = 247660546;BA.debugLine="mTemplate = InnerTemplate";
__ref._mtemplate /*Object*/  = _innertemplate;
RDebugUtils.currentLine=247660548;
 //BA.debugLineNum = 247660548;BA.debugLine="End Sub";
return "";
}
}