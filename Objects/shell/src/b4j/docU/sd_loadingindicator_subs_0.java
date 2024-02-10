package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sd_loadingindicator_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "sd_loadingindicator","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 43;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 45;BA.debugLine="bmpBubble = Gradient";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bmpbubble" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_gradient" /*RemoteObject*/ ));
 BA.debugLineNum = 46;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bringtofront(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BringToFront (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("bringtofront")) { return __ref.runUserSub(false, "sd_loadingindicator","bringtofront", __ref);}
 BA.debugLineNum = 419;BA.debugLine="Public Sub BringToFront";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 420;BA.debugLine="mBase.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 421;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
sd_loadingindicator._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",sd_loadingindicator._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
sd_loadingindicator._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",sd_loadingindicator._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As B4XView 'ignore";
sd_loadingindicator._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",sd_loadingindicator._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
sd_loadingindicator._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",sd_loadingindicator._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private clr As Int";
sd_loadingindicator._clr = RemoteObject.createImmutable(0);__ref.setField("_clr",sd_loadingindicator._clr);
 //BA.debugLineNum = 12;BA.debugLine="Private bgclr As Int";
sd_loadingindicator._bgclr = RemoteObject.createImmutable(0);__ref.setField("_bgclr",sd_loadingindicator._bgclr);
 //BA.debugLineNum = 13;BA.debugLine="Private index As Int";
sd_loadingindicator._index = RemoteObject.createImmutable(0);__ref.setField("_index",sd_loadingindicator._index);
 //BA.debugLineNum = 14;BA.debugLine="Private cvs As B4XCanvas";
sd_loadingindicator._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",sd_loadingindicator._cvs);
 //BA.debugLineNum = 15;BA.debugLine="Private duration As Int";
sd_loadingindicator._duration = RemoteObject.createImmutable(0);__ref.setField("_duration",sd_loadingindicator._duration);
 //BA.debugLineNum = 16;BA.debugLine="Private DrawingSubName As String";
sd_loadingindicator._drawingsubname = RemoteObject.createImmutable("");__ref.setField("_drawingsubname",sd_loadingindicator._drawingsubname);
 //BA.debugLineNum = 18;BA.debugLine="Private Radial As Float = 0";
sd_loadingindicator._radial = BA.numberCast(float.class, 0);__ref.setField("_radial",sd_loadingindicator._radial);
 //BA.debugLineNum = 19;BA.debugLine="Dim bmpBubble As B4XBitmap";
sd_loadingindicator._bmpbubble = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_bmpbubble",sd_loadingindicator._bmpbubble);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "sd_loadingindicator","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _style = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 30;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 31;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Color")))))));
 BA.debugLineNum = 32;BA.debugLine="bgclr=mBase.Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bgclr" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getColor"));
 BA.debugLineNum = 33;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
Debug.JustUpdateDeviceLine();
_style = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IndicatorStyle")))));Debug.locals.put("style", _style);Debug.locals.put("style", _style);
 BA.debugLineNum = 34;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
Debug.JustUpdateDeviceLine();
sd_loadingindicator._duration = BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Duration")))));__ref.setField("_duration",sd_loadingindicator._duration);
 BA.debugLineNum = 35;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_drawingsubname" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Draw_"),_style.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 36;BA.debugLine="mBase.Color=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 37;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="bmpBubble = Gradient";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bmpbubble" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_gradient" /*RemoteObject*/ ));
 BA.debugLineNum = 40;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_arc(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Arc (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("draw_arc")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_arc", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _r2 = RemoteObject.createImmutable(0f);
RemoteObject _r3 = RemoteObject.createImmutable(0f);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 165;BA.debugLine="Private Sub Draw_Arc (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="Dim r As Float = (Min(cvs.TargetRect.Width,cvs.Ta";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 167;BA.debugLine="Dim r2 As Float = 2*r/3";
Debug.JustUpdateDeviceLine();
_r2 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_r,RemoteObject.createImmutable(3)}, "*/",0, 0));Debug.locals.put("r2", _r2);Debug.locals.put("r2", _r2);
 BA.debugLineNum = 168;BA.debugLine="Dim r3 As Float = r/3";
Debug.JustUpdateDeviceLine();
_r3 = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(3)}, "/",0, 0));Debug.locals.put("r3", _r3);Debug.locals.put("r3", _r3);
 BA.debugLineNum = 169;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 171;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 172;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX,cvs.Target";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + _progress.<Float>get().floatValue())*(double) (0 + 360))),(Object)(BA.numberCast(float.class, 180)));
 BA.debugLineNum = 173;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 174;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 175;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 177;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX,cvs.Target";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r2),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0))),(Object)(BA.numberCast(float.class, 180)));
 BA.debugLineNum = 178;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 179;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r2,sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 180;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 182;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX,cvs.Target";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r3),(Object)(BA.numberCast(float.class, -(double) (0 + _progress.<Float>get().floatValue())*(double) (0 + 360))),(Object)(BA.numberCast(float.class, 180)));
 BA.debugLineNum = 183;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 184;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r3,sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 185;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_bubble(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Bubble (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("draw_bubble")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_bubble", __ref, _progress);}
RemoteObject _centerx = RemoteObject.createImmutable(0f);
RemoteObject _centery = RemoteObject.createImmutable(0f);
RemoteObject _frac = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _wdt = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
int _i = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 291;BA.debugLine="Private Sub Draw_Bubble (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="Dim CenterX As Float = mBase.Width/2";
Debug.JustUpdateDeviceLine();
_centerx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("CenterX", _centerx);Debug.locals.put("CenterX", _centerx);
 BA.debugLineNum = 293;BA.debugLine="Dim CenterY As Float = mBase.Height/2";
Debug.JustUpdateDeviceLine();
_centery = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("CenterY", _centery);Debug.locals.put("CenterY", _centery);
 BA.debugLineNum = 294;BA.debugLine="Dim Frac As Int = 20";
Debug.JustUpdateDeviceLine();
_frac = BA.numberCast(int.class, 20);Debug.locals.put("Frac", _frac);Debug.locals.put("Frac", _frac);
 BA.debugLineNum = 295;BA.debugLine="Dim D As Double = Progress*360";
Debug.JustUpdateDeviceLine();
_d = RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0);Debug.locals.put("D", _d);Debug.locals.put("D", _d);
 BA.debugLineNum = 296;BA.debugLine="Dim Wdt As Int = Min (mBase.Width,mBase.Height)*0";
Debug.JustUpdateDeviceLine();
_wdt = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))),RemoteObject.createImmutable(0.60)}, "*",0, 0));Debug.locals.put("Wdt", _wdt);Debug.locals.put("Wdt", _wdt);
 BA.debugLineNum = 297;BA.debugLine="Dim X,Y As Int";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createImmutable(0);Debug.locals.put("X", _x);
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
 BA.debugLineNum = 298;BA.debugLine="Dim rec As B4XRect";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("rec", _rec);
 BA.debugLineNum = 299;BA.debugLine="Dim Path As B4XPath";
Debug.JustUpdateDeviceLine();
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("Path", _path);
 BA.debugLineNum = 301;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 302;BA.debugLine="For i=0 To Frac-1";
Debug.JustUpdateDeviceLine();
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_frac,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 303;BA.debugLine="X=CenterX+CosD(D)*Wdt*0.20*(i+3)/Frac";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centerx,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(_d)),_wdt,RemoteObject.createImmutable(0.20),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "+",1, 1)),_frac}, "+***/",1, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 304;BA.debugLine="y=CenterY+SinD(D)*Wdt*0.20*(i+3)/Frac";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(_d)),_wdt,RemoteObject.createImmutable(0.20),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(3)}, "+",1, 1)),_frac}, "+***/",1, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 305;BA.debugLine="rec.Initialize(x-Wdt*(50-(10*i/Frac))/100,y-Wdt*";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,_wdt,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(50),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),RemoteObject.createImmutable(_i),_frac}, "*/",0, 0))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "-*/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,_wdt,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(50),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),RemoteObject.createImmutable(_i),_frac}, "*/",0, 0))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "-*/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,_wdt,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(50),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),RemoteObject.createImmutable(_i),_frac}, "*/",0, 0))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "+*/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,_wdt,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(50),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),RemoteObject.createImmutable(_i),_frac}, "*/",0, 0))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "+*/",1, 0))));
 BA.debugLineNum = 306;BA.debugLine="Path.InitializeOval(rec)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeOval",(Object)(_rec));
 BA.debugLineNum = 307;BA.debugLine="cvs.ClipPath(Path)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_path));
 BA.debugLineNum = 308;BA.debugLine="cvs.DrawBitmap(bmpBubble,cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawBitmap",(Object)((__ref.getField(false,"_bmpbubble" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 309;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_fivelines(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_FiveLines (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("draw_fivelines")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_fivelines", __ref, _progress);}
RemoteObject _minr = RemoteObject.createImmutable(0);
RemoteObject _maxr = RemoteObject.createImmutable(0);
RemoteObject _dx = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 239;BA.debugLine="Private Sub Draw_FiveLines(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="Dim MinR As Int = 10dip";
Debug.JustUpdateDeviceLine();
_minr = sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("MinR", _minr);Debug.locals.put("MinR", _minr);
 BA.debugLineNum = 241;BA.debugLine="Dim MaxR As Int = (cvs.TargetRect.Height/2)-4dip-";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))),_minr}, "--",2, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 242;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0)),RemoteObject.createImmutable(5)}, "/",0, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 244;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 245;BA.debugLine="For i = 0 To 4";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = 4;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 246;BA.debugLine="Dim r As Float = MinR + (MaxR / 2) + (MaxR / 2)";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_minr,(RemoteObject.solve(new RemoteObject[] {_maxr,RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_maxr,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(30),RemoteObject.createImmutable(_i)}, "*-*",1, 0)))}, "++*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 247;BA.debugLine="cvs.DrawLine((dx/2) + i * dx, cvs.TargetRect.Cen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dx,RemoteObject.createImmutable(2)}, "/",0, 0)),RemoteObject.createImmutable(_i),_dx}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_dx,RemoteObject.createImmutable(2)}, "/",0, 0)),RemoteObject.createImmutable(_i),_dx}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r}, "+",1, 0))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_followcircles(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_FollowCircles (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("draw_followcircles")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_followcircles", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 131;BA.debugLine="Private Sub Draw_FollowCircles (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "/-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 133;BA.debugLine="Dim X As Int = r*SinD(Progress*360)";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)))}, "*",0, 0));Debug.locals.put("X", _x);Debug.locals.put("X", _x);
 BA.debugLineNum = 134;BA.debugLine="Dim Y As Int = r*CosD(Progress*360)";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)))}, "*",0, 0));Debug.locals.put("Y", _y);Debug.locals.put("Y", _y);
 BA.debugLineNum = 136;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 137;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.Ta";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_x}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_y}, "+",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 138;BA.debugLine="For i=0 To 4";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = 4;
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="X = r*SinD(Progress*360-i*(72*Abs(Progress-0.5))";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(72),sd_loadingindicator.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)))}, "*",0, 0))}, "*-*",1, 0)))}, "*",0, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 140;BA.debugLine="Y = r*CosD(Progress*360-i*(72*Abs(Progress-0.5))";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(72),sd_loadingindicator.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)))}, "*",0, 0))}, "*-*",1, 0)))}, "*",0, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 141;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_x}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_y}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),RemoteObject.createImmutable(5)}, "*/",0, 0))}, "-",1, 0))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_followcircles2(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_FollowCircles2 (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("draw_followcircles2")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_followcircles2", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 145;BA.debugLine="Private Sub Draw_FollowCircles2 (Progress As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "/-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 147;BA.debugLine="Dim X As Int";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createImmutable(0);Debug.locals.put("X", _x);
 BA.debugLineNum = 148;BA.debugLine="Dim Y As Int";
Debug.JustUpdateDeviceLine();
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
 BA.debugLineNum = 150;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 151;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + (r*SinD(P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 152;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + (r*SinD(P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(180)}, "*+",1, 0)))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(180)}, "*+",1, 0)))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 154;BA.debugLine="For i=0 To 4";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = 4;
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 155;BA.debugLine="X = r*SinD(Progress*360-i*(72*Abs(Progress-0.5))";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(72),sd_loadingindicator.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)))}, "*",0, 0))}, "*-*",1, 0)))}, "*",0, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 156;BA.debugLine="Y = r*CosD(Progress*360-i*(72*Abs(Progress-0.5))";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(72),sd_loadingindicator.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)))}, "*",0, 0))}, "*-*",1, 0)))}, "*",0, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 157;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_x}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_y}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),RemoteObject.createImmutable(5)}, "*/",0, 0))}, "-",1, 0))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 159;BA.debugLine="X = r*SinD(Progress*360+180-i*(72*Abs(Progress-0";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(180),RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(72),sd_loadingindicator.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)))}, "*",0, 0))}, "*+-*",2, 0)))}, "*",0, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 160;BA.debugLine="Y = r*CosD(Progress*360+180-i*(72*Abs(Progress-0";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(180),RemoteObject.createImmutable(_i),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(72),sd_loadingindicator.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)))}, "*",0, 0))}, "*+-*",2, 0)))}, "*",0, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 161;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_x}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_y}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),RemoteObject.createImmutable(5)}, "*/",0, 0))}, "-",1, 0))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_foursquares(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_FourSquares (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("draw_foursquares")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_foursquares", __ref, _progress);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _bottom = RemoteObject.createImmutable(0);
RemoteObject _right = RemoteObject.createImmutable(0);
RemoteObject _top2 = RemoteObject.createImmutable(0);
RemoteObject _left2 = RemoteObject.createImmutable(0);
RemoteObject _bottom2 = RemoteObject.createImmutable(0);
RemoteObject _right2 = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _prg = RemoteObject.createImmutable(0f);
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _roundrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 322;BA.debugLine="Private Sub Draw_FourSquares (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 323;BA.debugLine="Dim Rec As B4XRect";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("Rec", _rec);
 BA.debugLineNum = 324;BA.debugLine="Dim top As Int = cvs.TargetRect.Centery*0.125";
Debug.JustUpdateDeviceLine();
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),RemoteObject.createImmutable(0.125)}, "*",0, 0));Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 325;BA.debugLine="Dim left As Int = cvs.TargetRect.CenterX*0.125";
Debug.JustUpdateDeviceLine();
_left = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),RemoteObject.createImmutable(0.125)}, "*",0, 0));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 326;BA.debugLine="Dim bottom As Int = cvs.TargetRect.CenterY*0.925";
Debug.JustUpdateDeviceLine();
_bottom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),RemoteObject.createImmutable(0.925)}, "*",0, 0));Debug.locals.put("bottom", _bottom);Debug.locals.put("bottom", _bottom);
 BA.debugLineNum = 327;BA.debugLine="Dim right As Int = cvs.TargetRect.Centerx*0.925";
Debug.JustUpdateDeviceLine();
_right = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),RemoteObject.createImmutable(0.925)}, "*",0, 0));Debug.locals.put("right", _right);Debug.locals.put("right", _right);
 BA.debugLineNum = 329;BA.debugLine="Dim top2 As Int = cvs.TargetRect.Centery*1.1";
Debug.JustUpdateDeviceLine();
_top2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),RemoteObject.createImmutable(1.1)}, "*",0, 0));Debug.locals.put("top2", _top2);Debug.locals.put("top2", _top2);
 BA.debugLineNum = 330;BA.debugLine="Dim left2 As Int = cvs.TargetRect.CenterX*1.1";
Debug.JustUpdateDeviceLine();
_left2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),RemoteObject.createImmutable(1.1)}, "*",0, 0));Debug.locals.put("left2", _left2);Debug.locals.put("left2", _left2);
 BA.debugLineNum = 331;BA.debugLine="Dim bottom2 As Int = cvs.TargetRect.CenterY*1.9";
Debug.JustUpdateDeviceLine();
_bottom2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),RemoteObject.createImmutable(1.9)}, "*",0, 0));Debug.locals.put("bottom2", _bottom2);Debug.locals.put("bottom2", _bottom2);
 BA.debugLineNum = 332;BA.debugLine="Dim right2 As Int = cvs.TargetRect.Centerx*1.9";
Debug.JustUpdateDeviceLine();
_right2 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),RemoteObject.createImmutable(1.9)}, "*",0, 0));Debug.locals.put("right2", _right2);Debug.locals.put("right2", _right2);
 BA.debugLineNum = 334;BA.debugLine="Dim  Width As Int = cvs.TargetView.Width";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetView").runMethod(true,"getWidth"));Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 335;BA.debugLine="Dim  Height As Int = cvs.TargetView.Height";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetView").runMethod(true,"getHeight"));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 336;BA.debugLine="Dim Prg As Float";
Debug.JustUpdateDeviceLine();
_prg = RemoteObject.createImmutable(0f);Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 338;BA.debugLine="Rec.Initialize(0,0,Width,Height)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 339;BA.debugLine="Dim Path As B4XPath";
Debug.JustUpdateDeviceLine();
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("Path", _path);
 BA.debugLineNum = 340;BA.debugLine="Path.InitializeRoundedRect(Rec,5dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 341;BA.debugLine="cvs.DrawPath(Path,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 343;BA.debugLine="Rec.Initialize(left,top,right, bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom)));
 BA.debugLineNum = 344;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 345;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 346;BA.debugLine="Rec.Initialize(left2,top,right2,bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom)));
 BA.debugLineNum = 347;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 348;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 349;BA.debugLine="Rec.Initialize(left,top2,right,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom2)));
 BA.debugLineNum = 350;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 351;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 352;BA.debugLine="Rec.Initialize(left2,top2,right2,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom2)));
 BA.debugLineNum = 353;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 354;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 356;BA.debugLine="If Progress<=0.125 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.125))) { 
 BA.debugLineNum = 357;BA.debugLine="Rec.Initialize(left,top,right, bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom)));
 BA.debugLineNum = 358;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 359;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 361;BA.debugLine="Prg=Progress*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 362;BA.debugLine="Rec.Initialize(left,top,right+(right2-right)*Prg";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_right,(RemoteObject.solve(new RemoteObject[] {_right2,_right}, "-",1, 1)),_prg}, "+*",1, 0))),(Object)(BA.numberCast(float.class, _bottom)));
 }else 
{ BA.debugLineNum = 363;BA.debugLine="Else If Progress<=0.25 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.25))) { 
 BA.debugLineNum = 364;BA.debugLine="Rec.Initialize(left,top,right, bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom)));
 BA.debugLineNum = 365;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 366;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 368;BA.debugLine="Prg=(Progress-0.125)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.125)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 369;BA.debugLine="Rec.Initialize(left2*Prg,top,right2,bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left2,_prg}, "*",0, 0))),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom)));
 }else 
{ BA.debugLineNum = 370;BA.debugLine="Else If Progress<=0.375 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.375))) { 
 BA.debugLineNum = 371;BA.debugLine="Rec.Initialize(left2,top,right2,bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom)));
 BA.debugLineNum = 372;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 373;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 375;BA.debugLine="Prg=(Progress-0.250)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.250)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 376;BA.debugLine="Rec.Initialize(left2,top,right2,bottom+(bottom2-";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bottom,(RemoteObject.solve(new RemoteObject[] {_bottom2,_bottom}, "-",1, 1)),_prg}, "+*",1, 0))));
 }else 
{ BA.debugLineNum = 377;BA.debugLine="Else If Progress<=0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 378;BA.debugLine="Rec.Initialize(left2,top,right2,bottom)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom)));
 BA.debugLineNum = 379;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 380;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 382;BA.debugLine="Prg=(Progress-0.375)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.375)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 383;BA.debugLine="Rec.Initialize(left2,top2*Prg,right2,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top2,_prg}, "*",0, 0))),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom2)));
 }else 
{ BA.debugLineNum = 384;BA.debugLine="Else If Progress<=0.625 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.625))) { 
 BA.debugLineNum = 385;BA.debugLine="Rec.Initialize(left2,top2,right2,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom2)));
 BA.debugLineNum = 386;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 387;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 389;BA.debugLine="Prg=(Progress-0.500)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.500)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 390;BA.debugLine="Rec.Initialize(left2+(left-left2)*Prg,top2,right";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left2,(RemoteObject.solve(new RemoteObject[] {_left,_left2}, "-",1, 1)),_prg}, "+*",1, 0))),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom2)));
 }else 
{ BA.debugLineNum = 391;BA.debugLine="Else If Progress<=0.75 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.75))) { 
 BA.debugLineNum = 392;BA.debugLine="Rec.Initialize(left2,top2,right2,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left2)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right2)),(Object)(BA.numberCast(float.class, _bottom2)));
 BA.debugLineNum = 393;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 394;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 396;BA.debugLine="Prg=(Progress-0.625)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.625)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 397;BA.debugLine="Rec.Initialize(left,top2,right2+(right-right2)*P";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_right2,(RemoteObject.solve(new RemoteObject[] {_right,_right2}, "-",1, 1)),_prg}, "+*",1, 0))),(Object)(BA.numberCast(float.class, _bottom2)));
 }else 
{ BA.debugLineNum = 398;BA.debugLine="Else If Progress<=0.875 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.875))) { 
 BA.debugLineNum = 399;BA.debugLine="Rec.Initialize(left,top2,right,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom2)));
 BA.debugLineNum = 400;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 401;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 403;BA.debugLine="Prg=(Progress-0.750)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.750)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 404;BA.debugLine="Rec.Initialize(left,top2+(top-top2)*Prg,right,bo";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top2,(RemoteObject.solve(new RemoteObject[] {_top,_top2}, "-",1, 1)),_prg}, "+*",1, 0))),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom2)));
 }else {
 BA.debugLineNum = 406;BA.debugLine="Rec.Initialize(left,top2,right,bottom2)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top2)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, _bottom2)));
 BA.debugLineNum = 407;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))));
 BA.debugLineNum = 408;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_path),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 200)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 410;BA.debugLine="Prg=(Progress-0.875)*8";
Debug.JustUpdateDeviceLine();
_prg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.875)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "*",0, 0));Debug.locals.put("Prg", _prg);
 BA.debugLineNum = 411;BA.debugLine="Rec.Initialize(left,top,right,bottom2+(bottom-bo";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, _right)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bottom2,(RemoteObject.solve(new RemoteObject[] {_bottom,_bottom2}, "-",1, 1)),_prg}, "+*",1, 0))));
 }}}}}}}
;
 BA.debugLineNum = 414;BA.debugLine="Dim RoundRec As B4XPath";
Debug.JustUpdateDeviceLine();
_roundrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("RoundRec", _roundrec);
 BA.debugLineNum = 415;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,5dip)";
Debug.JustUpdateDeviceLine();
_roundrec.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 416;BA.debugLine="cvs.DrawPath(RoundRec,SetAlpha(clr,100),True,1dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_roundrec),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 100)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_hearth(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Hearth (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("draw_hearth")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_hearth", __ref, _progress);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _radius = RemoteObject.createImmutable(0f);
int _i = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 268;BA.debugLine="Private Sub Draw_Hearth (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="Dim X As Int";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createImmutable(0);Debug.locals.put("X", _x);
 BA.debugLineNum = 270;BA.debugLine="Dim Y As Int";
Debug.JustUpdateDeviceLine();
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
 BA.debugLineNum = 271;BA.debugLine="Dim r As Float = (Min(cvs.TargetRect.Width,cvs.Ta";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0)),RemoteObject.createImmutable(40)}, "/",0, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 272;BA.debugLine="Dim Radius As Float";
Debug.JustUpdateDeviceLine();
_radius = RemoteObject.createImmutable(0f);Debug.locals.put("Radius", _radius);
 BA.debugLineNum = 274;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 275;BA.debugLine="Radial=(Radial + cPI * 0.02)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_radial" /*RemoteObject*/ ,BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radial" /*RemoteObject*/ ),sd_loadingindicator.__c.getField(true,"cPI"),RemoteObject.createImmutable(0.02)}, "+*",1, 0))));
 BA.debugLineNum = 276;BA.debugLine="If Radial>2*cPI Then Radial=Radial-(2*cPI)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_radial" /*RemoteObject*/ ),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),sd_loadingindicator.__c.getField(true,"cPI")}, "*",0, 0))) { 
__ref.setField ("_radial" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radial" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),sd_loadingindicator.__c.getField(true,"cPI")}, "*",0, 0))}, "-",1, 0)));};
 BA.debugLineNum = 278;BA.debugLine="For I=0 To 10";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = 10;
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("I", _i);
 BA.debugLineNum = 279;BA.debugLine="Radius=(Radial*10-i*2.5)/10";
Debug.JustUpdateDeviceLine();
_radius = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radial" /*RemoteObject*/ ),RemoteObject.createImmutable(10),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2.5)}, "*-*",1, 0)),RemoteObject.createImmutable(10)}, "/",0, 0));Debug.locals.put("Radius", _radius);
 BA.debugLineNum = 280;BA.debugLine="X=cvs.TargetRect.CenterX + (16*Power(Sin(Radius)";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(16),sd_loadingindicator.__c.runMethod(true,"Power",(Object)(sd_loadingindicator.__c.runMethod(true,"Sin",(Object)(BA.numberCast(double.class, _radius)))),(Object)(BA.numberCast(double.class, 3)))}, "*",0, 0)),_r}, "+*",1, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 281;BA.debugLine="Y=cvs.TargetRect.CenterY - (13*Cos(Radius)-5*Cos";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(13),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(BA.numberCast(double.class, _radius))),RemoteObject.createImmutable(5),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_radius}, "*",0, 0))),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),_radius}, "*",0, 0))),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),_radius}, "*",0, 0)))}, "*-*-*-",3, 0)),_r}, "-*",1, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 282;BA.debugLine="cvs.DrawCircle( x,  y, 7dip, SetAlpha(clr,110-(I";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(110),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(10)}, "*",0, 1))}, "-",1, 1)))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("I", _i);
;
 BA.debugLineNum = 285;BA.debugLine="X=cvs.TargetRect.CenterX + (16*Power(Sin(Radial),";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(16),sd_loadingindicator.__c.runMethod(true,"Power",(Object)(sd_loadingindicator.__c.runMethod(true,"Sin",(Object)(BA.numberCast(double.class, __ref.getField(true,"_radial" /*RemoteObject*/ ))))),(Object)(BA.numberCast(double.class, 3)))}, "*",0, 0)),_r}, "+*",1, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 286;BA.debugLine="Y=cvs.TargetRect.CenterY - (13*Cos(Radial)-5*Cos(";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(13),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(BA.numberCast(double.class, __ref.getField(true,"_radial" /*RemoteObject*/ )))),RemoteObject.createImmutable(5),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getField(true,"_radial" /*RemoteObject*/ )}, "*",0, 0))),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),__ref.getField(true,"_radial" /*RemoteObject*/ )}, "*",0, 0))),sd_loadingindicator.__c.runMethod(true,"Cos",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),__ref.getField(true,"_radial" /*RemoteObject*/ )}, "*",0, 0)))}, "*-*-*-",3, 0)),_r}, "-*",1, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 287;BA.debugLine="cvs.DrawCircle( x,  y, 7dip, clr, True, 1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_infinity(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Infinity (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("draw_infinity")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_infinity", __ref, _progress);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _degree = RemoteObject.createImmutable(0);
int _t = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 251;BA.debugLine="Private Sub Draw_Infinity (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="Dim X As Int";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createImmutable(0);Debug.locals.put("X", _x);
 BA.debugLineNum = 253;BA.debugLine="Dim Y As Int";
Debug.JustUpdateDeviceLine();
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
 BA.debugLineNum = 254;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "/-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 255;BA.debugLine="Dim Degree As Int = (Progress*360)";
Debug.JustUpdateDeviceLine();
_degree = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)));Debug.locals.put("Degree", _degree);Debug.locals.put("Degree", _degree);
 BA.debugLineNum = 257;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 258;BA.debugLine="For t=8 To 1 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step6 = -1;
final int limit6 = 1;
_t = 8 ;
for (;(step6 > 0 && _t <= limit6) || (step6 < 0 && _t >= limit6) ;_t = ((int)(0 + _t + step6))  ) {
Debug.locals.put("t", _t);
 BA.debugLineNum = 259;BA.debugLine="Degree=(Progress*360)-t*20";
Debug.JustUpdateDeviceLine();
_degree = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)),RemoteObject.createImmutable(_t),RemoteObject.createImmutable(20)}, "-*",1, 0));Debug.locals.put("Degree", _degree);
 BA.debugLineNum = 260;BA.debugLine="x = (r*CosD(Degree))/(1+Power(SinD(Degree),2))";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _degree)))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),sd_loadingindicator.__c.runMethod(true,"Power",(Object)(sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _degree)))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))}, "/",0, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 261;BA.debugLine="y = (r*SinD(Degree)*CosD(Degree))/(1+Power(SinD(";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _degree))),sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _degree)))}, "**",0, 0)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),sd_loadingindicator.__c.runMethod(true,"Power",(Object)(sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _degree)))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))}, "/",0, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 262;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_x}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_y}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))),RemoteObject.createImmutable(_t),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),RemoteObject.createImmutable((_t))}, "/",0, 0))))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 265;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.Ta";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_x}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_y}, "+",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_square(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Square (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("draw_square")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_square", __ref, _progress);}
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 188;BA.debugLine="Private Sub Draw_Square (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="Square(Progress,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_square" /*RemoteObject*/ ,(Object)(_progress),(Object)(sd_loadingindicator.__c.getField(true,"False")));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_squarerounded(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_SquareRounded (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("draw_squarerounded")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_squarerounded", __ref, _progress);}
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 192;BA.debugLine="Private Sub Draw_SquareRounded (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="Square(Progress,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_square" /*RemoteObject*/ ,(Object)(_progress),(Object)(sd_loadingindicator.__c.getField(true,"True")));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_tencircles(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_TenCircles (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("draw_tencircles")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_tencircles", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 92;BA.debugLine="Private Sub Draw_TenCircles (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "/-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 94;BA.debugLine="Dim B As Boolean = False";
Debug.JustUpdateDeviceLine();
_b = sd_loadingindicator.__c.getField(true,"False");Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 96;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 97;BA.debugLine="For i=0 To 9";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = 9;
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 99;BA.debugLine="Dim Alpha As Float = i*36";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(36)}, "*",0, 1));Debug.locals.put("Alpha", _alpha);Debug.locals.put("Alpha", _alpha);
 BA.debugLineNum = 101;BA.debugLine="If Alpha>Progress*360 And B=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_alpha,RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)) && RemoteObject.solveBoolean("=",_b,sd_loadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 102;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0xaaffffff))))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 103;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 104;BA.debugLine="B=True";
Debug.JustUpdateDeviceLine();
_b = sd_loadingindicator.__c.getField(true,"True");Debug.locals.put("B", _b);
 }else {
 BA.debugLineNum = 106;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_tenlines(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_TenLines (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("draw_tenlines")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_tenlines", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(false);
RemoteObject _spess = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 111;BA.debugLine="Private Sub Draw_TenLines (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 113;BA.debugLine="Dim B As Boolean = False";
Debug.JustUpdateDeviceLine();
_b = sd_loadingindicator.__c.getField(true,"False");Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 114;BA.debugLine="Dim Spess As Int = 6dip";
Debug.JustUpdateDeviceLine();
_spess = sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("Spess", _spess);Debug.locals.put("Spess", _spess);
 BA.debugLineNum = 116;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 117;BA.debugLine="For i=0 To 9";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = 9;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 119;BA.debugLine="Dim Alpha As Float = i*36";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(36)}, "*",0, 1));Debug.locals.put("Alpha", _alpha);Debug.locals.put("Alpha", _alpha);
 BA.debugLineNum = 121;BA.debugLine="If Alpha>Progress*360 And B=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_alpha,RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)) && RemoteObject.solveBoolean("=",_b,sd_loadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 122;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * SinD(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0xaaffffff))))),(Object)(BA.numberCast(float.class, _spess)));
 BA.debugLineNum = 123;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * SinD(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _spess)));
 BA.debugLineNum = 124;BA.debugLine="B=True";
Debug.JustUpdateDeviceLine();
_b = sd_loadingindicator.__c.getField(true,"True");Debug.locals.put("B", _b);
 }else {
 BA.debugLineNum = 126;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * SinD(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(BA.numberCast(float.class, _spess)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_threecircles(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("draw_threecircles")) { return __ref.runUserSub(false, "sd_loadingindicator","draw_threecircles", __ref, _progress);}
RemoteObject _maxr = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 79;BA.debugLine="Private Sub Draw_ThreeCircles (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 81;BA.debugLine="Dim r As Float = 15dip + MaxR + MaxR * Sin(Progre";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))),_maxr,_maxr,sd_loadingindicator.__c.runMethod(true,"Sin",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(1),sd_loadingindicator.__c.getField(true,"cPI")}, "**",0, 0)))}, "++*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 83;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 84;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = 2;
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(120),_progress,RemoteObject.createImmutable(360)}, "*+*",1, 0));Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 86;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,sd_loadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,sd_loadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 88;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 89;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,434);
if (RapidSub.canDelegate("getheight")) { return __ref.runUserSub(false, "sd_loadingindicator","getheight", __ref);}
 BA.debugLineNum = 434;BA.debugLine="Public Sub getHeight As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 435;BA.debugLine="Return mBase.Width";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 436;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getLeft (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("getleft")) { return __ref.runUserSub(false, "sd_loadingindicator","getleft", __ref);}
 BA.debugLineNum = 430;BA.debugLine="Public Sub getLeft As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="Return mBase.Left";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft"));
 BA.debugLineNum = 432;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getTop (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("gettop")) { return __ref.runUserSub(false, "sd_loadingindicator","gettop", __ref);}
 BA.debugLineNum = 458;BA.debugLine="Public Sub getTop As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 459;BA.debugLine="Return mBase.Width";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 460;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getVisible (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("getvisible")) { return __ref.runUserSub(false, "sd_loadingindicator","getvisible", __ref);}
 BA.debugLineNum = 466;BA.debugLine="Public Sub getVisible As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 467;BA.debugLine="Return mBase.Visible";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 468;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("getWidth (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,474);
if (RapidSub.canDelegate("getwidth")) { return __ref.runUserSub(false, "sd_loadingindicator","getwidth", __ref);}
 BA.debugLineNum = 474;BA.debugLine="Public Sub getWidth As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 475;BA.debugLine="Return mBase.Width";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gradient(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Gradient (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("gradient")) { return __ref.runUserSub(false, "sd_loadingindicator","gradient", __ref);}
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
 BA.debugLineNum = 313;BA.debugLine="Private Sub Gradient As B4XBitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 314;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 316;BA.debugLine="bc.Initialize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 317;BA.debugLine="bc.FillRadialGradient(Array As Int (clr,bgclr),cv";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_fillradialgradient",(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {__ref.getField(true,"_clr" /*RemoteObject*/ ),__ref.getField(true,"_bgclr" /*RemoteObject*/ )})),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 319;BA.debugLine="Return bc.Bitmap";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(false,"_getbitmap");
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "sd_loadingindicator","hide", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="mBase.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",sd_loadingindicator.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="index = index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sd_loadingindicator","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mainloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("mainloop")) { __ref.runUserSub(false, "sd_loadingindicator","mainloop", __ref); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4j.docU.sd_loadingindicator parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.sd_loadingindicator parent;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _progress = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,49);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 50;BA.debugLine="index = index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 51;BA.debugLine="Dim MyIndex As Int = index";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_index" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 52;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 53;BA.debugLine="Do While MyIndex = index";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_index" /*RemoteObject*/ )))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 54;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
Debug.JustUpdateDeviceLine();
_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2)),__ref.getField(true,"_duration" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("progress", _progress);Debug.locals.put("progress", _progress);
 BA.debugLineNum = 55;BA.debugLine="progress = progress - Floor(progress)";
Debug.JustUpdateDeviceLine();
_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,parent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _progress)))}, "-",1, 0));Debug.locals.put("progress", _progress);
 BA.debugLineNum = 56;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 57;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(true,"_drawingsubname" /*RemoteObject*/ )),(Object)((_progress)));
 BA.debugLineNum = 58;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 59;BA.debugLine="Sleep(10)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sd_loadingindicator", "mainloop"),BA.numberCast(int.class, 10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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
public static RemoteObject  _removeviewfromparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveViewFromParent (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("removeviewfromparent")) { return __ref.runUserSub(false, "sd_loadingindicator","removeviewfromparent", __ref);}
 BA.debugLineNum = 438;BA.debugLine="Public Sub RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 439;BA.debugLine="mBase.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _requestfocus(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RequestFocus (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("requestfocus")) { return __ref.runUserSub(false, "sd_loadingindicator","requestfocus", __ref);}
 BA.debugLineNum = 442;BA.debugLine="Public Sub RequestFocus";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 443;BA.debugLine="mBase.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendtoback(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SendToBack (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("sendtoback")) { return __ref.runUserSub(false, "sd_loadingindicator","sendtoback", __ref);}
 BA.debugLineNum = 446;BA.debugLine="Public Sub SendToBack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 447;BA.debugLine="mBase.SendToBack";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SendToBack");
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalpha(RemoteObject __ref,RemoteObject _c,RemoteObject _alpha) throws Exception{
try {
		Debug.PushSubsStack("SetAlpha (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setalpha")) { return __ref.runUserSub(false, "sd_loadingindicator","setalpha", __ref, _c, _alpha);}
Debug.locals.put("c", _c);
Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 73;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xffffff))),(Object)(_c)),sd_loadingindicator.__c.getField(false,"Bit").runMethod(true,"ShiftLeft",(Object)(_alpha),(Object)(BA.numberCast(int.class, 24)))}, "+",1, 1);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setHeight (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "sd_loadingindicator","setheight", __ref, _b);}
Debug.locals.put("B", _b);
 BA.debugLineNum = 423;BA.debugLine="Public Sub setHeight(B As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 424;BA.debugLine="mBase.Height=B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(double.class, _b));
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setLeft (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,426);
if (RapidSub.canDelegate("setleft")) { return __ref.runUserSub(false, "sd_loadingindicator","setleft", __ref, _b);}
Debug.locals.put("B", _b);
 BA.debugLineNum = 426;BA.debugLine="Public Sub setLeft(B As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 427;BA.debugLine="mBase.Left=B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, _b));
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setTop (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("settop")) { return __ref.runUserSub(false, "sd_loadingindicator","settop", __ref, _b);}
Debug.locals.put("B", _b);
 BA.debugLineNum = 454;BA.debugLine="Public Sub setTop(B As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 455;BA.debugLine="mBase.Top=B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, _b));
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setVisible (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "sd_loadingindicator","setvisible", __ref, _b);}
Debug.locals.put("B", _b);
 BA.debugLineNum = 462;BA.debugLine="Public Sub setVisible(B As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 463;BA.debugLine="mBase.Visible=B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",_b);
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setWidth (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "sd_loadingindicator","setwidth", __ref, _b);}
Debug.locals.put("B", _b);
 BA.debugLineNum = 470;BA.debugLine="Public Sub setWidth(B As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="mBase.Width=B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, _b));
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "sd_loadingindicator","show", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="mBase.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",sd_loadingindicator.__c.getField(true,"True"));
 BA.debugLineNum = 65;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.sd_loadingindicator.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _snapshot(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Snapshot (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("snapshot")) { return __ref.runUserSub(false, "sd_loadingindicator","snapshot", __ref);}
 BA.debugLineNum = 450;BA.debugLine="Public Sub Snapshot As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 451;BA.debugLine="Return mBase.Snapshot";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"Snapshot").getObject());
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _square(RemoteObject __ref,RemoteObject _progress,RemoteObject _rounded) throws Exception{
try {
		Debug.PushSubsStack("Square (sd_loadingindicator) ","sd_loadingindicator",101,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("square")) { return __ref.runUserSub(false, "sd_loadingindicator","square", __ref, _progress, _rounded);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _roundrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
Debug.locals.put("Progress", _progress);
Debug.locals.put("Rounded", _rounded);
 BA.debugLineNum = 196;BA.debugLine="Private Sub Square (Progress As Float, Rounded As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="Dim Rec As B4XRect";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("Rec", _rec);
 BA.debugLineNum = 198;BA.debugLine="Dim top As Int = 5dip";
Debug.JustUpdateDeviceLine();
_top = sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 199;BA.debugLine="Dim left As Int = 5dip";
Debug.JustUpdateDeviceLine();
_left = sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 200;BA.debugLine="Dim  Width As Int = cvs.TargetView.Width";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetView").runMethod(true,"getWidth"));Debug.locals.put("Width", _width);Debug.locals.put("Width", _width);
 BA.debugLineNum = 201;BA.debugLine="Dim  Height As Int = cvs.TargetView.Height";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetView").runMethod(true,"getHeight"));Debug.locals.put("Height", _height);Debug.locals.put("Height", _height);
 BA.debugLineNum = 203;BA.debugLine="Rec.Initialize(0,0,Width,Height)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 204;BA.debugLine="Dim RoundRec As B4XPath";
Debug.JustUpdateDeviceLine();
_roundrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("RoundRec", _roundrec);
 BA.debugLineNum = 205;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,5dip)";
Debug.JustUpdateDeviceLine();
_roundrec.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 207;BA.debugLine="cvs.DrawPath(RoundRec,bgclr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_roundrec),(Object)(__ref.getField(true,"_bgclr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 208;BA.debugLine="Height=Height-top*2";
Debug.JustUpdateDeviceLine();
_height = RemoteObject.solve(new RemoteObject[] {_height,_top,RemoteObject.createImmutable(2)}, "-*",1, 1);Debug.locals.put("Height", _height);
 BA.debugLineNum = 209;BA.debugLine="Width=Width-left*2";
Debug.JustUpdateDeviceLine();
_width = RemoteObject.solve(new RemoteObject[] {_width,_left,RemoteObject.createImmutable(2)}, "-*",1, 1);Debug.locals.put("Width", _width);
 BA.debugLineNum = 211;BA.debugLine="If Progress<=0.125 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.125))) { 
 BA.debugLineNum = 212;BA.debugLine="Rec.Initialize(left,top,left+Width*(0.5+Progress";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.5),_progress,RemoteObject.createImmutable(4)}, "+*",1, 0))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,RemoteObject.createImmutable(2)}, "+/",1, 0))));
 }else 
{ BA.debugLineNum = 213;BA.debugLine="Else If Progress<=0.25 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.25))) { 
 BA.debugLineNum = 214;BA.debugLine="Rec.Initialize(left+Width*(Progress-0.125)*4,top";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.125)}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,RemoteObject.createImmutable(2)}, "+/",1, 0))));
 }else 
{ BA.debugLineNum = 215;BA.debugLine="Else If Progress<=0.375 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.375))) { 
 BA.debugLineNum = 216;BA.debugLine="Rec.Initialize(left+Width/2,top,left+Width,top+H";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.125)}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))));
 }else 
{ BA.debugLineNum = 217;BA.debugLine="Else If Progress<=0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 218;BA.debugLine="Rec.Initialize(left+Width/2,top+Height*(Progress";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.375)}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height}, "+",1, 1))));
 }else 
{ BA.debugLineNum = 219;BA.debugLine="Else If Progress<=0.625 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.625))) { 
 BA.debugLineNum = 220;BA.debugLine="Rec.Initialize(left+Width*(0.625-Progress)*4,top";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.625),_progress}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height}, "+",1, 1))));
 }else 
{ BA.debugLineNum = 221;BA.debugLine="Else If Progress<=0.75 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.75))) { 
 BA.debugLineNum = 222;BA.debugLine="Rec.Initialize(left,top+Height/2,left+Width*(0.8";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.875),_progress}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height}, "+",1, 1))));
 }else 
{ BA.debugLineNum = 223;BA.debugLine="Else If Progress<=0.875 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_progress,BA.numberCast(double.class, 0.875))) { 
 BA.debugLineNum = 224;BA.debugLine="Rec.Initialize(left,top+Height*(0.875-Progress)*";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.875),_progress}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height}, "+",1, 1))));
 }else {
 BA.debugLineNum = 226;BA.debugLine="Rec.Initialize(left,top,left+Width/2,top+Height*";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _top)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_left,_width,RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_top,_height,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.125),_progress}, "-",1, 0)),RemoteObject.createImmutable(4)}, "+**",1, 0))));
 }}}}}}}
;
 BA.debugLineNum = 229;BA.debugLine="Dim RoundRec As B4XPath";
Debug.JustUpdateDeviceLine();
_roundrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("RoundRec", _roundrec);
 BA.debugLineNum = 230;BA.debugLine="If Rounded Then";
Debug.JustUpdateDeviceLine();
if (_rounded.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,Min(Width,Hei";
Debug.JustUpdateDeviceLine();
_roundrec.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {sd_loadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height))),RemoteObject.createImmutable(2)}, "/",0, 0))));
 }else {
 BA.debugLineNum = 233;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,5dip)";
Debug.JustUpdateDeviceLine();
_roundrec.runVoidMethod ("InitializeRoundedRect",(Object)(_rec),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 };
 BA.debugLineNum = 236;BA.debugLine="cvs.DrawPath(RoundRec,clr,True,1dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_roundrec),(Object)(__ref.getField(true,"_clr" /*RemoteObject*/ )),(Object)(sd_loadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, sd_loadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}