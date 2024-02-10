package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamcircularprogressbar_subs_0 {


public static void  _animatevalueto(RemoteObject __ref,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("AnimateValueTo (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("animatevalueto")) { __ref.runUserSub(false, "jamcircularprogressbar","animatevalueto", __ref, _newvalue); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(null,__ref,_newvalue);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(b4j.docU.jamcircularprogressbar parent,RemoteObject __ref,RemoteObject _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamcircularprogressbar parent;
RemoteObject _newvalue;
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0f);
RemoteObject _tempvalue = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnimateValueTo (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 76;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 77;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
Debug.JustUpdateDeviceLine();
_duration = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),_newvalue}, "-",1, 0))),RemoteObject.createImmutable(100),__ref.getField(true,"_durationfromzeroto100" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/*+",1, 0));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 78;BA.debugLine="Dim start As Float = currentValue";
Debug.JustUpdateDeviceLine();
_start = __ref.getField(true,"_currentvalue" /*RemoteObject*/ );Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 79;BA.debugLine="currentValue = NewValue";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 80;BA.debugLine="Dim tempValue As Float";
Debug.JustUpdateDeviceLine();
_tempvalue = RemoteObject.createImmutable(0f);Debug.locals.put("tempValue", _tempvalue);
 BA.debugLineNum = 81;BA.debugLine="Do While DateTime.Now < n + duration";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 10;
while (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {_n,_duration}, "+",1, 2))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 82;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
Debug.JustUpdateDeviceLine();
_tempvalue = __ref.runClassMethod (b4j.docU.jamcircularprogressbar.class, "_valuefromtimeeaseinout" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2))),(Object)(_start),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_newvalue,_start}, "-",1, 0))),(Object)(_duration));Debug.locals.put("tempValue", _tempvalue);
 BA.debugLineNum = 83;BA.debugLine="DrawValue(tempValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamcircularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(_tempvalue));
 BA.debugLineNum = 84;BA.debugLine="Sleep(10)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamcircularprogressbar", "animatevalueto"),BA.numberCast(int.class, 10));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 85;BA.debugLine="If NewValue <> currentValue Then Return 'will ha";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_newvalue,BA.numberCast(double.class, __ref.getField(true,"_currentvalue" /*RemoteObject*/ )))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 87;BA.debugLine="DrawValue(currentValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamcircularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "jamcircularprogressbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 57;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="cx = Width / 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cx" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 59;BA.debugLine="cy = Height / 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cy" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 60;BA.debugLine="radius = cx - 10dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_radius" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cx" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)));
 BA.debugLineNum = 61;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(jamcircularprogressbar.__c.runMethod(true,"Min",(Object)(_width),(Object)(_height))),(Object)(jamcircularprogressbar.__c.runMethod(true,"Min",(Object)(_width),(Object)(_height))));
 BA.debugLineNum = 62;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 63;BA.debugLine="mLbl.SetLayoutAnimated(0, 0, cy - 20dip, Width, 4";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cy" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0)),(Object)(_width),(Object)(BA.numberCast(double.class, jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))))));
 BA.debugLineNum = 64;BA.debugLine="DrawValue(currentValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamcircularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
jamcircularprogressbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",jamcircularprogressbar._meventname);
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
jamcircularprogressbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",jamcircularprogressbar._mcallback);
 //BA.debugLineNum = 18;BA.debugLine="Private cvs As B4XCanvas";
jamcircularprogressbar._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",jamcircularprogressbar._cvs);
 //BA.debugLineNum = 19;BA.debugLine="Private xui As XUI";
jamcircularprogressbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamcircularprogressbar._xui);
 //BA.debugLineNum = 20;BA.debugLine="Private mLbl As B4XView";
jamcircularprogressbar._mlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlbl",jamcircularprogressbar._mlbl);
 //BA.debugLineNum = 21;BA.debugLine="Private cx, cy, radius As Float";
jamcircularprogressbar._cx = RemoteObject.createImmutable(0f);__ref.setField("_cx",jamcircularprogressbar._cx);
jamcircularprogressbar._cy = RemoteObject.createImmutable(0f);__ref.setField("_cy",jamcircularprogressbar._cy);
jamcircularprogressbar._radius = RemoteObject.createImmutable(0f);__ref.setField("_radius",jamcircularprogressbar._radius);
 //BA.debugLineNum = 22;BA.debugLine="Private stroke As Float";
jamcircularprogressbar._stroke = RemoteObject.createImmutable(0f);__ref.setField("_stroke",jamcircularprogressbar._stroke);
 //BA.debugLineNum = 23;BA.debugLine="Private clrFull, clrEmpty As Int";
jamcircularprogressbar._clrfull = RemoteObject.createImmutable(0);__ref.setField("_clrfull",jamcircularprogressbar._clrfull);
jamcircularprogressbar._clrempty = RemoteObject.createImmutable(0);__ref.setField("_clrempty",jamcircularprogressbar._clrempty);
 //BA.debugLineNum = 24;BA.debugLine="Public mBase As B4XView";
jamcircularprogressbar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",jamcircularprogressbar._mbase);
 //BA.debugLineNum = 25;BA.debugLine="Private currentValue As Float";
jamcircularprogressbar._currentvalue = RemoteObject.createImmutable(0f);__ref.setField("_currentvalue",jamcircularprogressbar._currentvalue);
 //BA.debugLineNum = 26;BA.debugLine="Private DurationFromZeroTo100 As Int";
jamcircularprogressbar._durationfromzeroto100 = RemoteObject.createImmutable(0);__ref.setField("_durationfromzeroto100",jamcircularprogressbar._durationfromzeroto100);
 //BA.debugLineNum = 27;BA.debugLine="private mUpdateLblByCode as boolean";
jamcircularprogressbar._mupdatelblbycode = RemoteObject.createImmutable(false);__ref.setField("_mupdatelblbycode",jamcircularprogressbar._mupdatelblbycode);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "jamcircularprogressbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 36;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 38;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(jamcircularprogressbar.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))),(Object)(jamcircularprogressbar.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")))));
 BA.debugLineNum = 39;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent,0,x";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 41;BA.debugLine="clrFull = xui.PaintOrColorToColor(Props.Get(\"Colo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clrfull" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColorFull")))))));
 BA.debugLineNum = 42;BA.debugLine="clrEmpty = xui.PaintOrColorToColor(Props.Get(\"Col";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clrempty" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ColorEmpty")))))));
 BA.debugLineNum = 43;BA.debugLine="stroke = DipToCurrent(Props.Get(\"StrokeWidth\"))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stroke" /*RemoteObject*/ ,BA.numberCast(float.class, jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StrokeWidth")))))))));
 BA.debugLineNum = 44;BA.debugLine="DurationFromZeroTo100 = Props.Get(\"Duration\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_durationfromzeroto100" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Duration"))))));
 BA.debugLineNum = 45;BA.debugLine="mBase.Visible=Props.Get(\"Visible\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Visible"))))));
 BA.debugLineNum = 46;BA.debugLine="mLbl = Lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 47;BA.debugLine="cx = mBase.Width / 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cx" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 48;BA.debugLine="cy = mBase.Height / 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_cy" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 49;BA.debugLine="radius = cx - 10dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_radius" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cx" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)));
 BA.debugLineNum = 50;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="mLbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 52;BA.debugLine="mBase.AddView(mLbl, 0, cy - 20dip, mBase.Width, 4";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cy" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))))));
 BA.debugLineNum = 53;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="DrawValue(currentValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamcircularprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DrawValue (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("drawvalue")) { return __ref.runUserSub(false, "jamcircularprogressbar","drawvalue", __ref, _value);}
RemoteObject _startangle = RemoteObject.createImmutable(0f);
RemoteObject _sweepangle = RemoteObject.createImmutable(0f);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
Debug.locals.put("Value", _value);
 BA.debugLineNum = 101;BA.debugLine="Private Sub DrawValue(Value As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 103;BA.debugLine="cvs.DrawCircle(cx, cy, radius, clrEmpty, False, s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(true,"_cx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cy" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_radius" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_clrempty" /*RemoteObject*/ )),(Object)(jamcircularprogressbar.__c.getField(true,"False")),(Object)(__ref.getField(true,"_stroke" /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="if not(mUpdateLblByCode) then";
Debug.JustUpdateDeviceLine();
if (jamcircularprogressbar.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mupdatelblbycode" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 105;BA.debugLine="mLbl.Text = $\"$1.0{Value} %\"$";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),jamcircularprogressbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_value))),RemoteObject.createImmutable(" %"))));
 };
 BA.debugLineNum = 107;BA.debugLine="Dim startAngle = -90, sweepAngle = Value / 100 *";
Debug.JustUpdateDeviceLine();
_startangle = BA.numberCast(float.class, -(double) (0 + 90));Debug.locals.put("startAngle", _startangle);Debug.locals.put("startAngle", _startangle);
_sweepangle = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),RemoteObject.createImmutable(360)}, "/*",0, 0));Debug.locals.put("sweepAngle", _sweepangle);Debug.locals.put("sweepAngle", _sweepangle);
 BA.debugLineNum = 109;BA.debugLine="If Value < 100 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_value,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 110;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 111;BA.debugLine="p.InitializeArc(cx, cy, radius + stroke + 1dip,";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(true,"_cx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cy" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),__ref.getField(true,"_stroke" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 0))),(Object)(_startangle),(Object)(_sweepangle));
 BA.debugLineNum = 112;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 113;BA.debugLine="cvs.DrawCircle(cx, cy, radius - 0.5dip, clrFull,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(true,"_cx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cy" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0.5)))}, "-",1, 0))),(Object)(__ref.getField(true,"_clrfull" /*RemoteObject*/ )),(Object)(jamcircularprogressbar.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stroke" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 0))));
 BA.debugLineNum = 114;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 }else {
 BA.debugLineNum = 116;BA.debugLine="cvs.DrawCircle(cx, cy, radius - 0.5dip, clrFull,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(true,"_cx" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_cy" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0.5)))}, "-",1, 0))),(Object)(__ref.getField(true,"_clrfull" /*RemoteObject*/ )),(Object)(jamcircularprogressbar.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_stroke" /*RemoteObject*/ ),jamcircularprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 0))));
 };
 BA.debugLineNum = 118;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "jamcircularprogressbar","getenabled", __ref);}
 BA.debugLineNum = 161;BA.debugLine="sub getEnabled as boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 162;BA.debugLine="return mBase.Enabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getEnabled");
 BA.debugLineNum = 163;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "jamcircularprogressbar","getheight", __ref);}
 BA.debugLineNum = 157;BA.debugLine="sub getHeight as int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="return mBase.Height";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 159;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeft (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "jamcircularprogressbar","getleft", __ref);}
 BA.debugLineNum = 137;BA.debugLine="sub getLeft as int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="return mBase.Left";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft"));
 BA.debugLineNum = 139;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTop (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "jamcircularprogressbar","gettop", __ref);}
 BA.debugLineNum = 141;BA.debugLine="sub getTop as int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="return mBase.Top";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop"));
 BA.debugLineNum = 143;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getupdatelblbycode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getUpdateLblByCode (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("getupdatelblbycode")) { return __ref.runUserSub(false, "jamcircularprogressbar","getupdatelblbycode", __ref);}
 BA.debugLineNum = 170;BA.debugLine="sub getUpdateLblByCode as boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="return mUpdateLblByCode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mupdatelblbycode" /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "jamcircularprogressbar","getvalue", __ref);}
 BA.debugLineNum = 71;BA.debugLine="Public Sub getValue As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Return currentValue";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_currentvalue" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "jamcircularprogressbar","getvisible", __ref);}
 BA.debugLineNum = 125;BA.debugLine="Sub getVisible As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="Return mBase.Visible";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "jamcircularprogressbar","getwidth", __ref);}
 BA.debugLineNum = 153;BA.debugLine="sub getWidth as int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="return mBase.Width";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 155;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamcircularprogressbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 33;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _mbaseenabled) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "jamcircularprogressbar","setenabled", __ref, _mbaseenabled);}
Debug.locals.put("mBaseEnabled", _mbaseenabled);
 BA.debugLineNum = 165;BA.debugLine="sub setEnabled(mBaseEnabled as boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="mBase.Enabled=mBaseEnabled";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setEnabled",_mbaseenabled);
 BA.debugLineNum = 167;BA.debugLine="mLbl.Enabled=mBaseEnabled";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlbl" /*RemoteObject*/ ).runMethod(true,"setEnabled",_mbaseenabled);
 BA.debugLineNum = 168;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _mbaseheight) throws Exception{
try {
		Debug.PushSubsStack("setHeight (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "jamcircularprogressbar","setheight", __ref, _mbaseheight);}
Debug.locals.put("mBaseHeight", _mbaseheight);
 BA.debugLineNum = 149;BA.debugLine="sub setHeight(mBaseHeight as int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="mBase.Height=mBaseHeight";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(double.class, _mbaseheight));
 BA.debugLineNum = 151;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setleft(RemoteObject __ref,RemoteObject _mbaseleft) throws Exception{
try {
		Debug.PushSubsStack("setLeft (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("setleft")) { return __ref.runUserSub(false, "jamcircularprogressbar","setleft", __ref, _mbaseleft);}
Debug.locals.put("mBaseLeft", _mbaseleft);
 BA.debugLineNum = 129;BA.debugLine="sub setLeft(mBaseLeft as int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="mBase.Left=mBaseLeft";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, _mbaseleft));
 BA.debugLineNum = 131;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settop(RemoteObject __ref,RemoteObject _mbasetop) throws Exception{
try {
		Debug.PushSubsStack("setTop (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("settop")) { return __ref.runUserSub(false, "jamcircularprogressbar","settop", __ref, _mbasetop);}
Debug.locals.put("mBaseTop", _mbasetop);
 BA.debugLineNum = 133;BA.debugLine="sub setTop(mBaseTop as int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="mBase.Top=mBaseTop";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, _mbasetop));
 BA.debugLineNum = 135;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupdatelblbycode(RemoteObject __ref,RemoteObject _updatelblbycode) throws Exception{
try {
		Debug.PushSubsStack("setUpdateLblByCode (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("setupdatelblbycode")) { return __ref.runUserSub(false, "jamcircularprogressbar","setupdatelblbycode", __ref, _updatelblbycode);}
Debug.locals.put("UpdateLblByCode", _updatelblbycode);
 BA.debugLineNum = 174;BA.debugLine="sub setUpdateLblByCode(UpdateLblByCode as boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="mUpdateLblByCode=UpdateLblByCode";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mupdatelblbycode" /*RemoteObject*/ ,_updatelblbycode);
 BA.debugLineNum = 176;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("setValue (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "jamcircularprogressbar","setvalue", __ref, _newvalue);}
Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setValue(NewValue As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="AnimateValueTo(NewValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamcircularprogressbar.class, "_animatevalueto" /*void*/ ,(Object)(_newvalue));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _visible) throws Exception{
try {
		Debug.PushSubsStack("setVisible (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "jamcircularprogressbar","setvisible", __ref, _visible);}
Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 121;BA.debugLine="Sub setVisible(Visible As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="mBase.Visible=Visible";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",_visible);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _mbasewidth) throws Exception{
try {
		Debug.PushSubsStack("setWidth (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "jamcircularprogressbar","setwidth", __ref, _mbasewidth);}
Debug.locals.put("mBaseWidth", _mbasewidth);
 BA.debugLineNum = 145;BA.debugLine="sub setWidth(mBaseWidth as int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="mBase.Width=mBaseWidth";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, _mbasewidth));
 BA.debugLineNum = 147;BA.debugLine="end sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _valuefromtimeeaseinout(RemoteObject __ref,RemoteObject _time,RemoteObject _start,RemoteObject _changeinvalue,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("ValueFromTimeEaseInOut (jamcircularprogressbar) ","jamcircularprogressbar",64,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("valuefromtimeeaseinout")) { return __ref.runUserSub(false, "jamcircularprogressbar","valuefromtimeeaseinout", __ref, _time, _start, _changeinvalue, _duration);}
Debug.locals.put("Time", _time);
Debug.locals.put("Start", _start);
Debug.locals.put("ChangeInValue", _changeinvalue);
Debug.locals.put("Duration", _duration);
 BA.debugLineNum = 91;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Time = Time / (Duration / 2)";
Debug.JustUpdateDeviceLine();
_time = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_time,(RemoteObject.solve(new RemoteObject[] {_duration,RemoteObject.createImmutable(2)}, "/",0, 0))}, "/",0, 0));Debug.locals.put("Time", _time);
 BA.debugLineNum = 93;BA.debugLine="If Time < 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_time,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 94;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_changeinvalue,RemoteObject.createImmutable(2),_time,_time,_time,_time,_start}, "/****+",1, 0));
 }else {
 BA.debugLineNum = 96;BA.debugLine="Time = Time - 2";
Debug.JustUpdateDeviceLine();
_time = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_time,RemoteObject.createImmutable(2)}, "-",1, 0));Debug.locals.put("Time", _time);
 BA.debugLineNum = 97;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, -(double) (0 + _changeinvalue.<Float>get().floatValue())/(double)(double) (0 + 2)*(RemoteObject.solve(new RemoteObject[] {_time,_time,_time,_time,RemoteObject.createImmutable(2)}, "***-",1, 0)).<Double>get().doubleValue()+(double) (0 + _start.<Float>get().floatValue()));
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}