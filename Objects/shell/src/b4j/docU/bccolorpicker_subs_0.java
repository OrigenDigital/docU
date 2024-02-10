package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bccolorpicker_subs_0 {


public static RemoteObject  _alpha_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Alpha_Touch (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("alpha_touch")) { return __ref.runUserSub(false, "bccolorpicker","alpha_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 335;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 336;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 337;BA.debugLine="AlphaBarSelectedChange(x)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_alphabarselectedchange" /*RemoteObject*/ ,(Object)(_x));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _alphabarselectedchange(RemoteObject __ref,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("AlphaBarSelectedChange (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("alphabarselectedchange")) { return __ref.runUserSub(false, "bccolorpicker","alphabarselectedchange", __ref, _x);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("x", _x);
 BA.debugLineNum = 174;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedalpha" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(bccolorpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/",0, 0)))))}, "*",0, 0)));
 BA.debugLineNum = 176;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ),RemoteObject.createImmutable(255),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("x", _x);
 BA.debugLineNum = 177;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 178;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 179;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom"),bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0))));
 BA.debugLineNum = 180;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(_r),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(bccolorpicker.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 181;BA.debugLine="AlphaBar.cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 182;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "bccolorpicker","base_resize", __ref, _width, _height);}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _cpp = RemoteObject.declareNull("b4j.docU.b4xcolortemplate._colorpickerpart");
int _i = 0;
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 78;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colorscale" /*RemoteObject*/ ,BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {bccolorpicker.__c.runMethod(true,"Max",(Object)(_width),(Object)(_height)),RemoteObject.createImmutable(100),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "//",0, 0)))));
 BA.debugLineNum = 81;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))),(Object)(RemoteObject.solve(new RemoteObject[] {_height,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0)));
 BA.debugLineNum = 82;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getLeft"),bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "++",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 83;BA.debugLine="Dim w As Int = Max(10dip, Width - r - 314dip)";
Debug.JustUpdateDeviceLine();
_w = BA.numberCast(int.class, bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(RemoteObject.solve(new RemoteObject[] {_width,_r,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 314)))}, "--",2, 0))));Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 84;BA.debugLine="If xui.IsB4i Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="r = r - 1";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("r", _r);
 BA.debugLineNum = 86;BA.debugLine="w = w + 1";
Debug.JustUpdateDeviceLine();
_w = RemoteObject.solve(new RemoteObject[] {_w,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("w", _w);
 };
 BA.debugLineNum = 88;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _r)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 31)))}, "-",1, 0)),(Object)(BA.numberCast(double.class, _w)),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 89;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, _r)),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, _w)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "--",2, 0)));
 BA.debugLineNum = 90;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolors" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_colorscale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_colorscale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 91;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group12 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(false,"_huebar" /*RemoteObject*/ )),(__ref.getField(false,"_colorpicker" /*RemoteObject*/ )),(__ref.getField(false,"_alphabar" /*RemoteObject*/ ))});
final int groupLen12 = group12.getField(true,"length").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (group12.getArrayElement(false,RemoteObject.createImmutable(index12)));Debug.locals.put("cpp", _cpp);
Debug.locals.put("cpp", _cpp);
 BA.debugLineNum = 92;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 93;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 95;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 96;BA.debugLine="If cpp.DrawCheckers Then";
Debug.JustUpdateDeviceLine();
if (_cpp.getField(true,"DrawCheckers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="DrawCheckers(cpp)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_drawcheckers" /*RemoteObject*/ ,(Object)(_cpp));
 };
 }
}Debug.locals.put("cpp", _cpp);
;
 BA.debugLineNum = 100;BA.debugLine="DrawHueBar";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_drawhuebar" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="DrawAlphaBar";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_drawalphabar" /*RemoteObject*/ );
 BA.debugLineNum = 102;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_huebarselectedchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedh" /*RemoteObject*/ ),RemoteObject.createImmutable(360),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/*",0, 0))));
 BA.debugLineNum = 103;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_alphabarselectedchange" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ),RemoteObject.createImmutable(255),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/*",0, 0))));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsetnew_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSetNew_Click (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,401);
if (RapidSub.canDelegate("btnsetnew_click")) { return __ref.runUserSub(false, "bccolorpicker","btnsetnew_click", __ref);}
 BA.debugLineNum = 401;BA.debugLine="Sub btnSetNew_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 402;BA.debugLine="RaiseEvent(txtNewValue.Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_raiseevent" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtnewvalue" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )));
 BA.debugLineNum = 403;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView 'ignore";
bccolorpicker._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",bccolorpicker._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
bccolorpicker._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bccolorpicker._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private SelectedAlpha As Int = 255";
bccolorpicker._selectedalpha = BA.numberCast(int.class, 255);__ref.setField("_selectedalpha",bccolorpicker._selectedalpha);
 //BA.debugLineNum = 6;BA.debugLine="Private bcColors As BitmapCreator";
bccolorpicker._bccolors = RemoteObject.createNew ("b4j.example.bitmapcreator");__ref.setField("_bccolors",bccolorpicker._bccolors);
 //BA.debugLineNum = 7;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
bccolorpicker._selectedh = BA.numberCast(float.class, 60);__ref.setField("_selectedh",bccolorpicker._selectedh);
bccolorpicker._selecteds = BA.numberCast(float.class, 0.5);__ref.setField("_selecteds",bccolorpicker._selecteds);
bccolorpicker._selectedv = BA.numberCast(float.class, 0.5);__ref.setField("_selectedv",bccolorpicker._selectedv);
 //BA.debugLineNum = 8;BA.debugLine="Private DeviceScale, ColorScale As Float";
bccolorpicker._devicescale = RemoteObject.createImmutable(0f);__ref.setField("_devicescale",bccolorpicker._devicescale);
bccolorpicker._colorscale = RemoteObject.createImmutable(0f);__ref.setField("_colorscale",bccolorpicker._colorscale);
 //BA.debugLineNum = 9;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
bccolorpicker._dont_change = BA.numberCast(int.class, -(double) (0 + 999999999));__ref.setField("_dont_change",bccolorpicker._dont_change);
 //BA.debugLineNum = 10;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
bccolorpicker._huebar = RemoteObject.createNew ("b4j.docU.b4xcolortemplate._colorpickerpart");__ref.setField("_huebar",bccolorpicker._huebar);
bccolorpicker._colorpicker = RemoteObject.createNew ("b4j.docU.b4xcolortemplate._colorpickerpart");__ref.setField("_colorpicker",bccolorpicker._colorpicker);
bccolorpicker._alphabar = RemoteObject.createNew ("b4j.docU.b4xcolortemplate._colorpickerpart");__ref.setField("_alphabar",bccolorpicker._alphabar);
 //BA.debugLineNum = 11;BA.debugLine="Private BordersColor As Int = xui.Color_White";
bccolorpicker._borderscolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_borderscolor",bccolorpicker._borderscolor);
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
bccolorpicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bccolorpicker._meventname);
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
bccolorpicker._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bccolorpicker._mcallback);
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
bccolorpicker._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",bccolorpicker._tag);
 //BA.debugLineNum = 15;BA.debugLine="Private lstColors As CustomListView";
bccolorpicker._lstcolors = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_lstcolors",bccolorpicker._lstcolors);
 //BA.debugLineNum = 16;BA.debugLine="Private ByteConverter As ByteConverter";
bccolorpicker._byteconverter = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");__ref.setField("_byteconverter",bccolorpicker._byteconverter);
 //BA.debugLineNum = 17;BA.debugLine="Private CurrentSelectedHex As String";
bccolorpicker._currentselectedhex = RemoteObject.createImmutable("");__ref.setField("_currentselectedhex",bccolorpicker._currentselectedhex);
 //BA.debugLineNum = 18;BA.debugLine="Private TextChangedIndex As Int";
bccolorpicker._textchangedindex = RemoteObject.createImmutable(0);__ref.setField("_textchangedindex",bccolorpicker._textchangedindex);
 //BA.debugLineNum = 19;BA.debugLine="Public txtNewValue As B4XFloatTextField";
bccolorpicker._txtnewvalue = RemoteObject.createNew ("b4j.docU.b4xfloattextfield");__ref.setField("_txtnewvalue",bccolorpicker._txtnewvalue);
 //BA.debugLineNum = 20;BA.debugLine="Private ColorPanel As B4XView";
bccolorpicker._colorpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_colorpanel",bccolorpicker._colorpanel);
 //BA.debugLineNum = 21;BA.debugLine="Private ColorLabel As B4XView";
bccolorpicker._colorlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_colorlabel",bccolorpicker._colorlabel);
 //BA.debugLineNum = 22;BA.debugLine="Private MapOfNamedColors As Map";
bccolorpicker._mapofnamedcolors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapofnamedcolors",bccolorpicker._mapofnamedcolors);
 //BA.debugLineNum = 23;BA.debugLine="Private CSelections As CLVSelectionsJamTableView";
bccolorpicker._cselections = RemoteObject.createNew ("b4j.docU.clvselectionsjamtableview");__ref.setField("_cselections",bccolorpicker._cselections);
 //BA.debugLineNum = 24;BA.debugLine="Private pnlPreview As B4XView";
bccolorpicker._pnlpreview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlpreview",bccolorpicker._pnlpreview);
 //BA.debugLineNum = 25;BA.debugLine="Public pnlPrevValue As B4XView";
bccolorpicker._pnlprevvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlprevvalue",bccolorpicker._pnlprevvalue);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _colors_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Colors_Touch (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("colors_touch")) { return __ref.runUserSub(false, "bccolorpicker","colors_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 325;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 326;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 327;BA.debugLine="HandleSelectedColorChanged(X, Y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_handleselectedcolorchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortohex(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("colortohex")) { return __ref.runUserSub(false, "bccolorpicker","colortohex", __ref, _clr);}
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 213;BA.debugLine="Public Sub ColorToHex(clr As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 214;BA.debugLine="Return ByteConverter.HexFromBytes(ByteConverter.I";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_byteconverter" /*RemoteObject*/ ).runMethod(true,"HexFromBytes",(Object)(__ref.getField(false,"_byteconverter" /*RemoteObject*/ ).runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_clr})))));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colortohsv(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHSV (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("colortohsv")) { return __ref.runUserSub(false, "bccolorpicker","colortohsv", __ref, _clr);}
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _g = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0f);
RemoteObject _s = RemoteObject.createImmutable(0f);
RemoteObject _v = RemoteObject.createImmutable(0f);
RemoteObject _cmax = RemoteObject.createImmutable(0);
RemoteObject _cmin = RemoteObject.createImmutable(0);
RemoteObject _rc = RemoteObject.createImmutable(0f);
RemoteObject _gc = RemoteObject.createImmutable(0f);
RemoteObject _bc = RemoteObject.createImmutable(0f);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 289;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_a = bccolorpicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(bccolorpicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 24)))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 291;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_r = bccolorpicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(bccolorpicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 16)))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 292;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_g = bccolorpicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(bccolorpicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 8)))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 293;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
Debug.JustUpdateDeviceLine();
_b = bccolorpicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(bccolorpicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(_clr),(Object)(BA.numberCast(int.class, 0)))));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 294;BA.debugLine="Dim h, s, v As Float";
Debug.JustUpdateDeviceLine();
_h = RemoteObject.createImmutable(0f);Debug.locals.put("h", _h);
_s = RemoteObject.createImmutable(0f);Debug.locals.put("s", _s);
_v = RemoteObject.createImmutable(0f);Debug.locals.put("v", _v);
 BA.debugLineNum = 295;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
Debug.JustUpdateDeviceLine();
_cmax = BA.numberCast(int.class, bccolorpicker.__c.runMethod(true,"Max",(Object)(bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _r)),(Object)(BA.numberCast(double.class, _g)))),(Object)(BA.numberCast(double.class, _b))));Debug.locals.put("cmax", _cmax);Debug.locals.put("cmax", _cmax);
 BA.debugLineNum = 296;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
Debug.JustUpdateDeviceLine();
_cmin = BA.numberCast(int.class, bccolorpicker.__c.runMethod(true,"Min",(Object)(bccolorpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _r)),(Object)(BA.numberCast(double.class, _g)))),(Object)(BA.numberCast(double.class, _b))));Debug.locals.put("cmin", _cmin);Debug.locals.put("cmin", _cmin);
 BA.debugLineNum = 297;BA.debugLine="v = cmax / 255";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cmax,RemoteObject.createImmutable(255)}, "/",0, 0));Debug.locals.put("v", _v);
 BA.debugLineNum = 298;BA.debugLine="If cmax <> 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_cmax,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 299;BA.debugLine="s = (cmax - cmin) / cmax";
Debug.JustUpdateDeviceLine();
_s = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1)),_cmax}, "/",0, 0));Debug.locals.put("s", _s);
 };
 BA.debugLineNum = 301;BA.debugLine="If s = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_s,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 302;BA.debugLine="h = 0";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, 0);Debug.locals.put("h", _h);
 }else {
 BA.debugLineNum = 304;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
Debug.JustUpdateDeviceLine();
_rc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_r}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1))}, "/",0, 0));Debug.locals.put("rc", _rc);Debug.locals.put("rc", _rc);
 BA.debugLineNum = 305;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
Debug.JustUpdateDeviceLine();
_gc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_g}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1))}, "/",0, 0));Debug.locals.put("gc", _gc);Debug.locals.put("gc", _gc);
 BA.debugLineNum = 306;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
Debug.JustUpdateDeviceLine();
_bc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cmax,_b}, "-",1, 1)),(RemoteObject.solve(new RemoteObject[] {_cmax,_cmin}, "-",1, 1))}, "/",0, 0));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 307;BA.debugLine="If r = cmax Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, _cmax))) { 
 BA.debugLineNum = 308;BA.debugLine="h = bc - gc";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bc,_gc}, "-",1, 0));Debug.locals.put("h", _h);
 }else 
{ BA.debugLineNum = 309;BA.debugLine="Else If g = cmax Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_g,BA.numberCast(double.class, _cmax))) { 
 BA.debugLineNum = 310;BA.debugLine="h = 2 + rc - bc";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_rc,_bc}, "+-",2, 0));Debug.locals.put("h", _h);
 }else {
 BA.debugLineNum = 312;BA.debugLine="h = 4 + gc - rc";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(4),_gc,_rc}, "+-",2, 0));Debug.locals.put("h", _h);
 }}
;
 BA.debugLineNum = 314;BA.debugLine="h = h / 6";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(6)}, "/",0, 0));Debug.locals.put("h", _h);
 BA.debugLineNum = 315;BA.debugLine="If h < 0 Then h = h + 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_h,BA.numberCast(double.class, 0))) { 
_h = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(1)}, "+",1, 0));Debug.locals.put("h", _h);};
 };
 BA.debugLineNum = 317;BA.debugLine="Return Array (h * 360, s, v, a)";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(360)}, "*",0, 0)),(_s),(_v),(_a)});
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistofcolorslayout(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateListOfColorsLayout (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("createlistofcolorslayout")) { return __ref.runUserSub(false, "bccolorpicker","createlistofcolorslayout", __ref);}
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _s = null;
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _color = RemoteObject.createImmutable(0);
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 370;BA.debugLine="Sub CreateListOfColorsLayout";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 371;BA.debugLine="lstColors.sv.SetColorAndBorder(xui.Color_Transpar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstcolors" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 372;BA.debugLine="MapOfNamedColors.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mapofnamedcolors" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 373;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = bccolorpicker.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(bccolorpicker.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("colors.txt")));
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 374;BA.debugLine="Dim s() As String = Regex.Split(\":\", line)";
Debug.JustUpdateDeviceLine();
_s = bccolorpicker.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_line));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 375;BA.debugLine="Dim Name As String = s(0)";
Debug.JustUpdateDeviceLine();
_name = _s.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Name", _name);Debug.locals.put("Name", _name);
 BA.debugLineNum = 376;BA.debugLine="Dim Color As Int = HexToColor(s(1))";
Debug.JustUpdateDeviceLine();
_color = __ref.runClassMethod (b4j.docU.bccolorpicker.class, "_hextocolor" /*RemoteObject*/ ,(Object)(_s.getArrayElement(true,BA.numberCast(int.class, 1))));Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 377;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_item = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 378;BA.debugLine="item.SetLayoutAnimated(0, 0, 0, lstColors.AsView";
Debug.JustUpdateDeviceLine();
_item.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_lstcolors" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 379;BA.debugLine="lstColors.Add(item, Array(Name,Color))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstcolors" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_item),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_name),(_color)}))));
 BA.debugLineNum = 380;BA.debugLine="If MapOfNamedColors.ContainsKey(Color) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mapofnamedcolors" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_color))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 381;BA.debugLine="Log(\"Duplicate color: \" & Name)";
Debug.JustUpdateDeviceLine();
bccolorpicker.__c.runVoidMethod ("LogImpl","9134348811",RemoteObject.concat(RemoteObject.createImmutable("Duplicate color: "),_name),0);
 };
 BA.debugLineNum = 383;BA.debugLine="MapOfNamedColors.Put(Color, MapOfNamedColors.Siz";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mapofnamedcolors" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_color)),(Object)((__ref.getField(false,"_mapofnamedcolors" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelforbitmapcreator(RemoteObject __ref,RemoteObject _eventname,RemoteObject _withcheckers) throws Exception{
try {
		Debug.PushSubsStack("CreatePanelForBitmapCreator (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("createpanelforbitmapcreator")) { return __ref.runUserSub(false, "bccolorpicker","createpanelforbitmapcreator", __ref, _eventname, _withcheckers);}
RemoteObject _cpp = RemoteObject.declareNull("b4j.docU.b4xcolortemplate._colorpickerpart");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _overlay = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventName", _eventname);
Debug.locals.put("WithCheckers", _withcheckers);
 BA.debugLineNum = 57;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Dim cpp As ColorPickerPart";
Debug.JustUpdateDeviceLine();
_cpp = RemoteObject.createNew ("b4j.docU.b4xcolortemplate._colorpickerpart");Debug.locals.put("cpp", _cpp);
 BA.debugLineNum = 59;BA.debugLine="cpp.Initialize";
Debug.JustUpdateDeviceLine();
_cpp.runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_cpp.setField ("pnl" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 61;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 62;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 63;BA.debugLine="If WithCheckers Then";
Debug.JustUpdateDeviceLine();
if (_withcheckers.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="cpp.DrawCheckers = True";
Debug.JustUpdateDeviceLine();
_cpp.setField ("DrawCheckers" /*RemoteObject*/ ,bccolorpicker.__c.getField(true,"True"));
 };
 BA.debugLineNum = 67;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 68;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="cpp.iv = iv";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"iv" /*RemoteObject*/ ).setObject (_iv.getObject());
 BA.debugLineNum = 70;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
Debug.JustUpdateDeviceLine();
_overlay = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_overlay = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_eventname));Debug.locals.put("overlay", _overlay);Debug.locals.put("overlay", _overlay);
 BA.debugLineNum = 71;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_iv.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 72;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"pnl" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_overlay.getObject())),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 73;BA.debugLine="cpp.cvs.Initialize(overlay)";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_overlay));
 BA.debugLineNum = 74;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_cpp.getField(false,"pnl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 75;BA.debugLine="Return cpp";
Debug.JustUpdateDeviceLine();
if (true) return _cpp;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("designercreateview")) { __ref.runUserSub(false, "bccolorpicker","designercreateview", __ref, _base, _lbl, _props); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(null,__ref,_base,_lbl,_props);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.docU.bccolorpicker parent,RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.bccolorpicker parent;
RemoteObject _base;
RemoteObject _lbl;
RemoteObject _props;
RemoteObject _t = RemoteObject.declareNull("b4j.docU.b4xfloattextfield");
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 36;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 37;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 37;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 39;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
Debug.JustUpdateDeviceLine();
__ref.setField ("_huebar" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_createpanelforbitmapcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString("hueBar")),(Object)(parent.__c.getField(true,"False"))));
 BA.debugLineNum = 40;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colorpicker" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_createpanelforbitmapcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString("colors")),(Object)(parent.__c.getField(true,"True"))));
 BA.debugLineNum = 41;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
Debug.JustUpdateDeviceLine();
__ref.setField ("_alphabar" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_createpanelforbitmapcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString("alpha")),(Object)(parent.__c.getField(true,"True"))));
 BA.debugLineNum = 42;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bccolorpicker", "designercreateview"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 43;BA.debugLine="mBase.LoadLayout(\"BCColorPicker\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("BCColorPicker")),__ref.getField(false, "ba"));
 BA.debugLineNum = 44;BA.debugLine="CSelections.Initialize(lstColors)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cselections" /*RemoteObject*/ ).runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_lstcolors" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="CSelections.Mode = CSelections.MODE_SINGLE_ITEM_P";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cselections" /*RemoteObject*/ ).runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_setmode" /*RemoteObject*/ ,__ref.getField(false,"_cselections" /*RemoteObject*/ ).getField(true,"_mode_single_item_permanent" /*RemoteObject*/ ));
 BA.debugLineNum = 46;BA.debugLine="CreateListOfColorsLayout";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_createlistofcolorslayout" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 2dip, Borde";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(__ref.getField(true,"_borderscolor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 48;BA.debugLine="For Each t As B4XFloatTextField In Array(txtNewVa";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//for
this.state = 4;
group13 = RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_txtnewvalue" /*RemoteObject*/ ))});
index13 = 0;
groupLen13 = group13.getField(true,"length").<Integer>get();
Debug.locals.put("t", _t);
this.state = 6;
if (true) break;

case 6:
//C
this.state = 4;
if (index13 < groupLen13) {
this.state = 3;
_t = (group13.getArrayElement(false,RemoteObject.createImmutable(index13)));Debug.locals.put("t", _t);}
if (true) break;

case 7:
//C
this.state = 6;
index13++;
Debug.locals.put("t", _t);
if (true) break;

case 3:
//C
this.state = 7;
 BA.debugLineNum = 49;BA.debugLine="t.LargeLabelTextSize = 14";
Debug.JustUpdateDeviceLine();
_t.setField ("_largelabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 BA.debugLineNum = 50;BA.debugLine="t.SmallLabelTextSize = 10";
Debug.JustUpdateDeviceLine();
_t.setField ("_smalllabeltextsize" /*RemoteObject*/ ,BA.numberCast(float.class, 10));
 BA.debugLineNum = 51;BA.debugLine="t.Update";
Debug.JustUpdateDeviceLine();
_t.runClassMethod (b4j.docU.b4xfloattextfield.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="t.TextField.SetColorAndBorder(xui.Color_Transpar";
Debug.JustUpdateDeviceLine();
_t.runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(int.class, ((int)0xffd2d2d2))),(Object)(BA.numberCast(double.class, 0)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("t", _t);
;
 BA.debugLineNum = 54;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
public static RemoteObject  _drawalphabar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawAlphaBar (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("drawalphabar")) { return __ref.runUserSub(false, "bccolorpicker","drawalphabar", __ref);}
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
RemoteObject _argb = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
int _y = 0;
int _x = 0;
 BA.debugLineNum = 136;BA.debugLine="Private Sub DrawAlphaBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 138;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 139;BA.debugLine="Dim argb As ARGBColor";
Debug.JustUpdateDeviceLine();
_argb = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("argb", _argb);
 BA.debugLineNum = 140;BA.debugLine="argb.r = 0xcc";
Debug.JustUpdateDeviceLine();
_argb.setField ("r",BA.numberCast(int.class, ((int)0xcc)));
 BA.debugLineNum = 141;BA.debugLine="argb.g = 0xcc";
Debug.JustUpdateDeviceLine();
_argb.setField ("g",BA.numberCast(int.class, ((int)0xcc)));
 BA.debugLineNum = 142;BA.debugLine="argb.b = 0xcc";
Debug.JustUpdateDeviceLine();
_argb.setField ("b",BA.numberCast(int.class, ((int)0xcc)));
 BA.debugLineNum = 144;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step7 > 0 && _y <= limit7) || (step7 < 0 && _y >= limit7) ;_y = ((int)(0 + _y + step7))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 145;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step8 > 0 && _x <= limit8) || (step8 < 0 && _x >= limit8) ;_x = ((int)(0 + _x + step8))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 146;BA.debugLine="argb.a = x / bc.mWidth * 255";
Debug.JustUpdateDeviceLine();
_argb.setField ("a",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(255)}, "/*",0, 0)));
 BA.debugLineNum = 147;BA.debugLine="bc.SetARGB(x, y, argb)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_setargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_argb));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 150;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bc.runMethod(false,"_getbitmap").getObject())));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcheckers(RemoteObject __ref,RemoteObject _cpp) throws Exception{
try {
		Debug.PushSubsStack("DrawCheckers (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("drawcheckers")) { return __ref.runUserSub(false, "bccolorpicker","drawcheckers", __ref, _cpp);}
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _clrs = null;
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
int _x = 0;
RemoteObject _xx = RemoteObject.createImmutable(0);
int _y = 0;
Debug.locals.put("cpp", _cpp);
 BA.debugLineNum = 106;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_cpp.getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 108;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 109;BA.debugLine="Dim size As Int = 10dip";
Debug.JustUpdateDeviceLine();
_size = bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 110;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
Debug.JustUpdateDeviceLine();
_clrs = RemoteObject.createNewArray("int",new int[] {2},new Object[] {BA.numberCast(int.class, ((int)0xffc0c0c0)),BA.numberCast(int.class, ((int)0xff757575))});Debug.locals.put("clrs", _clrs);Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 111;BA.debugLine="Dim clr As Int = 0";
Debug.JustUpdateDeviceLine();
_clr = BA.numberCast(int.class, 0);Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 112;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 113;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
Debug.JustUpdateDeviceLine();
{
final int step7 = _size.<Integer>get().intValue();
final int limit7 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getRight"),bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0).<Double>get().doubleValue());
_x = 0 ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 114;BA.debugLine="Dim xx As Int = x / size";
Debug.JustUpdateDeviceLine();
_xx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_size}, "/",0, 0));Debug.locals.put("xx", _xx);Debug.locals.put("xx", _xx);
 BA.debugLineNum = 115;BA.debugLine="clr = xx Mod 2";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.solve(new RemoteObject[] {_xx,RemoteObject.createImmutable(2)}, "%",0, 1);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 116;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
Debug.JustUpdateDeviceLine();
{
final int step10 = _size.<Integer>get().intValue();
final int limit10 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom"),bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 0).<Double>get().doubleValue());
_y = 0 ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 117;BA.debugLine="clr = (clr + 1) Mod 2";
Debug.JustUpdateDeviceLine();
_clr = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_clr,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "%",0, 1);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 118;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, _y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),_size}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),_size}, "+",1, 1))));
 BA.debugLineNum = 119;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(_r),(Object)(_clrs.getArrayElement(true,_clr)),(Object)(bccolorpicker.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 122;BA.debugLine="cpp.checkersCanvas.Invalidate";
Debug.JustUpdateDeviceLine();
_cpp.getField(false,"checkersCanvas" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
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
public static RemoteObject  _drawcolors(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawColors (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("drawcolors")) { return __ref.runUserSub(false, "bccolorpicker","drawcolors", __ref);}
int _x = 0;
int _y = 0;
 BA.debugLineNum = 153;BA.debugLine="Private Sub DrawColors";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step1 > 0 && _x <= limit1) || (step1 < 0 && _x >= limit1) ;_x = ((int)(0 + _x + step1))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 155;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step2 > 0 && _y <= limit2) || (step2 < 0 && _y >= limit2) ;_y = ((int)(0 + _y + step2))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 156;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bccolors" /*RemoteObject*/ ).runVoidMethod ("_sethsv",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(__ref.getField(true,"_selectedalpha" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, __ref.getField(true,"_selectedh" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mwidth")}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.createImmutable(_y)}, "-",1, 1)),__ref.getField(false,"_bccolors" /*RemoteObject*/ ).getField(true,"_mheight")}, "/",0, 0))));
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 160;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_bccolors" /*RemoteObject*/ ).runMethod(false,"_getbitmap").runMethod(false,"Resize",(Object)(BA.numberCast(int.class, __ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runMethod(true,"getHeight"))),(Object)(bccolorpicker.__c.getField(true,"False"))).getObject())));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawhuebar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawHueBar (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("drawhuebar")) { return __ref.runUserSub(false, "bccolorpicker","drawhuebar", __ref);}
RemoteObject _bchue = RemoteObject.declareNull("b4j.example.bitmapcreator");
int _y = 0;
int _x = 0;
 BA.debugLineNum = 125;BA.debugLine="Private Sub DrawHueBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="Dim bcHue As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bchue = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bcHue", _bchue);
 BA.debugLineNum = 127;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
Debug.JustUpdateDeviceLine();
_bchue.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_devicescale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 128;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_bchue.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step3 > 0 && _y <= limit3) || (step3 < 0 && _y >= limit3) ;_y = ((int)(0 + _y + step3))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 129;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_bchue.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4) ;_x = ((int)(0 + _x + step4))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 130;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
Debug.JustUpdateDeviceLine();
_bchue.runVoidMethod ("_sethsv",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_bchue.getField(true,"_mheight"),RemoteObject.createImmutable(_y)}, "/*",0, 0))),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 1)));
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 133;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"iv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_bchue.runMethod(false,"_getbitmap").getObject())));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "bccolorpicker","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 320;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedColor (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("getselectedcolor")) { return __ref.runUserSub(false, "bccolorpicker","getselectedcolor", __ref);}
RemoteObject _hsv = null;
 BA.debugLineNum = 229;BA.debugLine="Public Sub getSelectedColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="Dim HSV() As Object = getSelectedHSVColor";
Debug.JustUpdateDeviceLine();
_hsv = __ref.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedhsvcolor" /*RemoteObject*/ );Debug.locals.put("HSV", _hsv);Debug.locals.put("HSV", _hsv);
 BA.debugLineNum = 231;BA.debugLine="Return HSVToColor(SelectedAlpha, HSV(0), HSV(1),";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.docU.bccolorpicker.class, "_hsvtocolor" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_selectedalpha" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedhsvcolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedHSVColor (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("getselectedhsvcolor")) { return __ref.runUserSub(false, "bccolorpicker","getselectedhsvcolor", __ref);}
 BA.debugLineNum = 276;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(true,"_selectedh" /*RemoteObject*/ )),(__ref.getField(true,"_selecteds" /*RemoteObject*/ )),(__ref.getField(true,"_selectedv" /*RemoteObject*/ )),(__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ))});
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleselectedcolorchanged(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HandleSelectedColorChanged (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("handleselectedcolorchanged")) { return __ref.runUserSub(false, "bccolorpicker","handleselectedcolorchanged", __ref, _x, _y);}
RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
RemoteObject _itemindex = RemoteObject.createImmutable(0);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 190;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="If x <> DONT_CHANGE Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_x,BA.numberCast(double.class, __ref.getField(true,"_dont_change" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 192;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteds" /*RemoteObject*/ ,BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(bccolorpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/",0, 0)))))));
 BA.debugLineNum = 193;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedv" /*RemoteObject*/ ,BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(bccolorpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),_y}, "-",1, 0)),__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/",0, 0)))))));
 };
 BA.debugLineNum = 195;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 196;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selecteds" /*RemoteObject*/ ),__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_selectedv" /*RemoteObject*/ ),__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-*",1, 0))),(Object)(BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(bccolorpicker.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 198;BA.debugLine="ColorPicker.cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpicker" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 199;BA.debugLine="If txtNewValue.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_txtnewvalue" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 200;BA.debugLine="Dim SelectedColor As Int = getSelectedColor";
Debug.JustUpdateDeviceLine();
_selectedcolor = __ref.runClassMethod (b4j.docU.bccolorpicker.class, "_getselectedcolor" /*RemoteObject*/ );Debug.locals.put("SelectedColor", _selectedcolor);Debug.locals.put("SelectedColor", _selectedcolor);
 BA.debugLineNum = 201;BA.debugLine="pnlPreview.Color = SelectedColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlpreview" /*RemoteObject*/ ).runMethod(true,"setColor",_selectedcolor);
 BA.debugLineNum = 202;BA.debugLine="CurrentSelectedHex = ColorToHex(SelectedColor)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_currentselectedhex" /*RemoteObject*/ ,__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_colortohex" /*RemoteObject*/ ,(Object)(_selectedcolor)));
 BA.debugLineNum = 203;BA.debugLine="txtNewValue.Text = CurrentSelectedHex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txtnewvalue" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_settext" /*RemoteObject*/ ,__ref.getField(true,"_currentselectedhex" /*RemoteObject*/ ));
 BA.debugLineNum = 204;BA.debugLine="If MapOfNamedColors.ContainsKey(SelectedColor) T";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mapofnamedcolors" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_selectedcolor))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 205;BA.debugLine="Dim ItemIndex As Int = MapOfNamedColors.Get(Sel";
Debug.JustUpdateDeviceLine();
_itemindex = BA.numberCast(int.class, __ref.getField(false,"_mapofnamedcolors" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_selectedcolor))));Debug.locals.put("ItemIndex", _itemindex);Debug.locals.put("ItemIndex", _itemindex);
 BA.debugLineNum = 206;BA.debugLine="CSelections.SelectAndMakeVisible(ItemIndex)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cselections" /*RemoteObject*/ ).runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_selectandmakevisible" /*void*/ ,(Object)(_itemindex));
 }else {
 BA.debugLineNum = 208;BA.debugLine="CSelections.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cselections" /*RemoteObject*/ ).runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_clear" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hextocolor(RemoteObject __ref,RemoteObject _hex) throws Exception{
try {
		Debug.PushSubsStack("HexToColor (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("hextocolor")) { return __ref.runUserSub(false, "bccolorpicker","hextocolor", __ref, _hex);}
RemoteObject _ints = null;
Debug.locals.put("Hex", _hex);
 BA.debugLineNum = 217;BA.debugLine="Public Sub HexToColor(Hex As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="If Hex.StartsWith(\"#\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 219;BA.debugLine="Hex = Hex.SubString(1)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Hex", _hex);
 }else 
{ BA.debugLineNum = 220;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
Debug.JustUpdateDeviceLine();
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 221;BA.debugLine="Hex = Hex.SubString(2)";
Debug.JustUpdateDeviceLine();
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Hex", _hex);
 }else 
{ BA.debugLineNum = 222;BA.debugLine="Else If Hex.Length = 6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hex.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 223;BA.debugLine="Hex = \"FF\" & Hex";
Debug.JustUpdateDeviceLine();
_hex = RemoteObject.concat(RemoteObject.createImmutable("FF"),_hex);Debug.locals.put("Hex", _hex);
 }}}
;
 BA.debugLineNum = 225;BA.debugLine="Dim ints() As Int = ByteConverter.IntsFromBytes(B";
Debug.JustUpdateDeviceLine();
_ints = __ref.getField(false,"_byteconverter" /*RemoteObject*/ ).runMethod(false,"IntsFromBytes",(Object)(__ref.getField(false,"_byteconverter" /*RemoteObject*/ ).runMethod(false,"HexToBytes",(Object)(_hex))));Debug.locals.put("ints", _ints);Debug.locals.put("ints", _ints);
 BA.debugLineNum = 226;BA.debugLine="Return ints(0)";
Debug.JustUpdateDeviceLine();
if (true) return _ints.getArrayElement(true,BA.numberCast(int.class, 0));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hsvtocolor(RemoteObject __ref,RemoteObject _alpha,RemoteObject _h,RemoteObject _s,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("HSVToColor (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("hsvtocolor")) { return __ref.runUserSub(false, "bccolorpicker","hsvtocolor", __ref, _alpha, _h, _s, _v);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _g = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(0f);
RemoteObject _hi = RemoteObject.createImmutable(0f);
RemoteObject _hbucket = RemoteObject.createImmutable(0);
RemoteObject _f = RemoteObject.createImmutable(0f);
RemoteObject _p = RemoteObject.createImmutable(0f);
RemoteObject _q = RemoteObject.createImmutable(0f);
RemoteObject _t = RemoteObject.createImmutable(0f);
Debug.locals.put("alpha", _alpha);
Debug.locals.put("h", _h);
Debug.locals.put("s", _s);
Debug.locals.put("v", _v);
 BA.debugLineNum = 234;BA.debugLine="Private Sub HSVToColor(alpha As Int, h As Float, s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Dim r, g, b As Float";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createImmutable(0f);Debug.locals.put("r", _r);
_g = RemoteObject.createImmutable(0f);Debug.locals.put("g", _g);
_b = RemoteObject.createImmutable(0f);Debug.locals.put("b", _b);
 BA.debugLineNum = 236;BA.debugLine="Dim hi As Float = Floor(h / 60)";
Debug.JustUpdateDeviceLine();
_hi = BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(60)}, "/",0, 0))));Debug.locals.put("hi", _hi);Debug.locals.put("hi", _hi);
 BA.debugLineNum = 237;BA.debugLine="Dim hbucket As Int =  hi Mod 6";
Debug.JustUpdateDeviceLine();
_hbucket = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_hi,RemoteObject.createImmutable(6)}, "%",0, 0));Debug.locals.put("hbucket", _hbucket);Debug.locals.put("hbucket", _hbucket);
 BA.debugLineNum = 238;BA.debugLine="Dim f As Float = h / 60 - hi";
Debug.JustUpdateDeviceLine();
_f = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_h,RemoteObject.createImmutable(60),_hi}, "/-",1, 0));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 239;BA.debugLine="Dim p As Float = v * (1 - s)";
Debug.JustUpdateDeviceLine();
_p = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_v,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_s}, "-",1, 0))}, "*",0, 0));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 240;BA.debugLine="Dim q As Float = v  * (1 - f * s)";
Debug.JustUpdateDeviceLine();
_q = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_v,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_f,_s}, "-*",1, 0))}, "*",0, 0));Debug.locals.put("q", _q);Debug.locals.put("q", _q);
 BA.debugLineNum = 241;BA.debugLine="Dim t As Float = v * (1 - (1 - f) * s)";
Debug.JustUpdateDeviceLine();
_t = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_v,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_f}, "-",1, 0)),_s}, "-*",1, 0))}, "*",0, 0));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 242;BA.debugLine="Select hbucket";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_hbucket,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5))) {
case 0: {
 BA.debugLineNum = 244;BA.debugLine="r = v";
Debug.JustUpdateDeviceLine();
_r = _v;Debug.locals.put("r", _r);
 BA.debugLineNum = 245;BA.debugLine="g = t";
Debug.JustUpdateDeviceLine();
_g = _t;Debug.locals.put("g", _g);
 BA.debugLineNum = 246;BA.debugLine="b = p";
Debug.JustUpdateDeviceLine();
_b = _p;Debug.locals.put("b", _b);
 break; }
case 1: {
 BA.debugLineNum = 248;BA.debugLine="r = q";
Debug.JustUpdateDeviceLine();
_r = _q;Debug.locals.put("r", _r);
 BA.debugLineNum = 249;BA.debugLine="g = v";
Debug.JustUpdateDeviceLine();
_g = _v;Debug.locals.put("g", _g);
 BA.debugLineNum = 250;BA.debugLine="b = p";
Debug.JustUpdateDeviceLine();
_b = _p;Debug.locals.put("b", _b);
 break; }
case 2: {
 BA.debugLineNum = 252;BA.debugLine="r = p";
Debug.JustUpdateDeviceLine();
_r = _p;Debug.locals.put("r", _r);
 BA.debugLineNum = 253;BA.debugLine="g = v";
Debug.JustUpdateDeviceLine();
_g = _v;Debug.locals.put("g", _g);
 BA.debugLineNum = 254;BA.debugLine="b = t";
Debug.JustUpdateDeviceLine();
_b = _t;Debug.locals.put("b", _b);
 break; }
case 3: {
 BA.debugLineNum = 256;BA.debugLine="r = p";
Debug.JustUpdateDeviceLine();
_r = _p;Debug.locals.put("r", _r);
 BA.debugLineNum = 257;BA.debugLine="g = q";
Debug.JustUpdateDeviceLine();
_g = _q;Debug.locals.put("g", _g);
 BA.debugLineNum = 258;BA.debugLine="b = v";
Debug.JustUpdateDeviceLine();
_b = _v;Debug.locals.put("b", _b);
 break; }
case 4: {
 BA.debugLineNum = 260;BA.debugLine="r = t";
Debug.JustUpdateDeviceLine();
_r = _t;Debug.locals.put("r", _r);
 BA.debugLineNum = 261;BA.debugLine="g = p";
Debug.JustUpdateDeviceLine();
_g = _p;Debug.locals.put("g", _g);
 BA.debugLineNum = 262;BA.debugLine="b = v";
Debug.JustUpdateDeviceLine();
_b = _v;Debug.locals.put("b", _b);
 break; }
case 5: {
 BA.debugLineNum = 264;BA.debugLine="r = v";
Debug.JustUpdateDeviceLine();
_r = _v;Debug.locals.put("r", _r);
 BA.debugLineNum = 265;BA.debugLine="g = p";
Debug.JustUpdateDeviceLine();
_g = _p;Debug.locals.put("g", _g);
 BA.debugLineNum = 266;BA.debugLine="b = q";
Debug.JustUpdateDeviceLine();
_b = _q;Debug.locals.put("b", _b);
 break; }
}
;
 BA.debugLineNum = 268;BA.debugLine="Return xui.Color_ARGB(alpha, Round(r * 255), Roun";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(_alpha),(Object)(BA.numberCast(int.class, bccolorpicker.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(255)}, "*",0, 0))))),(Object)(BA.numberCast(int.class, bccolorpicker.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_g,RemoteObject.createImmutable(255)}, "*",0, 0))))),(Object)(BA.numberCast(int.class, bccolorpicker.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_b,RemoteObject.createImmutable(255)}, "*",0, 0))))));
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _huebar_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HueBar_Touch (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("huebar_touch")) { return __ref.runUserSub(false, "bccolorpicker","huebar_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 330;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 331;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE_NOTOUCH")))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 332;BA.debugLine="HueBarSelectedChanged(Y)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_huebarselectedchanged" /*RemoteObject*/ ,(Object)(_y));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _huebarselectedchanged(RemoteObject __ref,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("HueBarSelectedChanged (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("huebarselectedchanged")) { return __ref.runUserSub(false, "bccolorpicker","huebarselectedchanged", __ref, _y);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("y", _y);
 BA.debugLineNum = 163;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedh" /*RemoteObject*/ ,BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(bccolorpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 360)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_y,__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*/",0, 0)))))));
 BA.debugLineNum = 165;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedh" /*RemoteObject*/ ),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(360)}, "*/",0, 0));Debug.locals.put("y", _y);
 BA.debugLineNum = 166;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 167;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 168;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "-",1, 0))),(Object)(__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "+",1, 0))));
 BA.debugLineNum = 169;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(_r),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(bccolorpicker.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 170;BA.debugLine="HueBar.cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 171;BA.debugLine="Update";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_update" /*RemoteObject*/ );
 BA.debugLineNum = 172;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bccolorpicker","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 31;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 32;BA.debugLine="DeviceScale = 100dip / 100";
Debug.JustUpdateDeviceLine();
__ref.setField ("_devicescale" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {bccolorpicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvalidcolorstring(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("IsValidColorString (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("isvalidcolorstring")) { return __ref.runUserSub(false, "bccolorpicker","isvalidcolorstring", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 360;BA.debugLine="Private Sub IsValidColorString(s As String) As Boo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="Return Regex.IsMatch2(\"[0-9a-f]{8}\", Regex.CASE_I";
Debug.JustUpdateDeviceLine();
if (true) return bccolorpicker.__c.getField(false,"Regex").runMethod(true,"IsMatch2",(Object)(BA.ObjectToString("[0-9a-f]{8}")),(Object)(bccolorpicker.__c.getField(false,"Regex").getField(true,"CASE_INSENSITIVE")),(Object)(_s));
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstcolors_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lstColors_ItemClick (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("lstcolors_itemclick")) { return __ref.runUserSub(false, "bccolorpicker","lstcolors_itemclick", __ref, _index, _value);}
RemoteObject _nameandvalue = null;
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 364;BA.debugLine="Sub lstColors_ItemClick (Index As Int, Value As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="CSelections.ItemClicked(Index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cselections" /*RemoteObject*/ ).runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_itemclicked" /*RemoteObject*/ ,(Object)(_index));
 BA.debugLineNum = 366;BA.debugLine="Dim NameAndValue() As Object = Value";
Debug.JustUpdateDeviceLine();
_nameandvalue = (_value);Debug.locals.put("NameAndValue", _nameandvalue);Debug.locals.put("NameAndValue", _nameandvalue);
 BA.debugLineNum = 367;BA.debugLine="setSelectedColor(NameAndValue(1))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nameandvalue.getArrayElement(false,BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstcolors_visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("lstColors_VisibleRangeChanged (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("lstcolors_visiblerangechanged")) { return __ref.runUserSub(false, "bccolorpicker","lstcolors_visiblerangechanged", __ref, _firstindex, _lastindex);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _nameandvalue = null;
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 388;BA.debugLine="Sub lstColors_VisibleRangeChanged (FirstIndex As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 389;BA.debugLine="For i = Max(0, FirstIndex - 5) To Min(lstColors.S";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = (int) (0 + bccolorpicker.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstcolors" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,RemoteObject.createImmutable(5)}, "+",1, 1)))).<Double>get().doubleValue());
_i = (int) (0 + bccolorpicker.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,RemoteObject.createImmutable(5)}, "-",1, 1)))).<Double>get().doubleValue()) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 390;BA.debugLine="Dim p As B4XView = lstColors.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_lstcolors" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 391;BA.debugLine="If p.NumberOfViews = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 392;BA.debugLine="p.LoadLayout(\"ListOfColors\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListOfColors")),__ref.getField(false, "ba"));
 BA.debugLineNum = 393;BA.debugLine="Dim NameAndValue() As Object = lstColors.GetVal";
Debug.JustUpdateDeviceLine();
_nameandvalue = (__ref.getField(false,"_lstcolors" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("NameAndValue", _nameandvalue);Debug.locals.put("NameAndValue", _nameandvalue);
 BA.debugLineNum = 394;BA.debugLine="ColorLabel.Text = NameAndValue(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_nameandvalue.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 395;BA.debugLine="ColorPanel.Color = NameAndValue(1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colorpanel" /*RemoteObject*/ ).runMethod(true,"setColor",BA.numberCast(int.class, _nameandvalue.getArrayElement(false,BA.numberCast(int.class, 1))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 398;BA.debugLine="CSelections.VisibleRangeChanged(FirstIndex, LastI";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cselections" /*RemoteObject*/ ).runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_visiblerangechanged" /*RemoteObject*/ ,(Object)(_firstindex),(Object)(_lastindex));
 BA.debugLineNum = 399;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlprevvalue_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnlPrevValue_MouseClicked (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,410);
if (RapidSub.canDelegate("pnlprevvalue_mouseclicked")) { return __ref.runUserSub(false, "bccolorpicker","pnlprevvalue_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 410;BA.debugLine="Sub pnlPrevValue_MouseClicked (EventData As MouseE";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 411;BA.debugLine="setSelectedColor(pnlPrevValue.Color)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_pnlprevvalue" /*RemoteObject*/ ).runMethod(true,"getColor")));
 BA.debugLineNum = 412;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseevent(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("raiseevent")) { return __ref.runUserSub(false, "bccolorpicker","raiseevent", __ref, _clr);}
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 405;BA.debugLine="Private Sub RaiseEvent (clr As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 406;BA.debugLine="If IsValidColorString(clr) Then CallSub2(mCallBac";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_isvalidcolorstring" /*RemoteObject*/ ,(Object)(_clr)).<Boolean>get().booleanValue()) { 
bccolorpicker.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ColorSet"))),(Object)((__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_hextocolor" /*RemoteObject*/ ,(Object)(_clr)))));};
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedcolor(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setSelectedColor (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("setselectedcolor")) { return __ref.runUserSub(false, "bccolorpicker","setselectedcolor", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 271;BA.debugLine="Public Sub setSelectedColor(i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedhsvcolor" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_colortohsv" /*RemoteObject*/ ,(Object)(_i))));
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedhsvcolor(RemoteObject __ref,RemoteObject _hsv) throws Exception{
try {
		Debug.PushSubsStack("setSelectedHSVColor (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("setselectedhsvcolor")) { return __ref.runUserSub(false, "bccolorpicker","setselectedhsvcolor", __ref, _hsv);}
Debug.locals.put("HSV", _hsv);
 BA.debugLineNum = 280;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="selectedH = HSV(0)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedh" /*RemoteObject*/ ,BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 282;BA.debugLine="selectedS = HSV(1)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteds" /*RemoteObject*/ ,BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 283;BA.debugLine="selectedV = HSV(2)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedv" /*RemoteObject*/ ,BA.numberCast(float.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 284;BA.debugLine="SelectedAlpha = HSV(3)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectedalpha" /*RemoteObject*/ ,BA.numberCast(int.class, _hsv.getArrayElement(false,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 285;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_huebarselectedchanged" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedh" /*RemoteObject*/ ),RemoteObject.createImmutable(360),__ref.getField(false,"_huebar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "/*",0, 0))));
 BA.debugLineNum = 286;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_alphabarselectedchange" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedalpha" /*RemoteObject*/ ),RemoteObject.createImmutable(255),__ref.getField(false,"_alphabar" /*RemoteObject*/ ).getField(false,"pnl" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "/*",0, 0))));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtnewvalue_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("txtNewValue_EnterPressed (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,356);
if (RapidSub.canDelegate("txtnewvalue_enterpressed")) { return __ref.runUserSub(false, "bccolorpicker","txtnewvalue_enterpressed", __ref);}
 BA.debugLineNum = 356;BA.debugLine="Private Sub txtNewValue_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 357;BA.debugLine="btnSetNew_Click";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_btnsetnew_click" /*RemoteObject*/ );
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _txtnewvalue_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtNewValue_TextChanged (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("txtnewvalue_textchanged")) { __ref.runUserSub(false, "bccolorpicker","txtnewvalue_textchanged", __ref, _old, _new); return;}
ResumableSub_txtNewValue_TextChanged rsub = new ResumableSub_txtNewValue_TextChanged(null,__ref,_old,_new);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_txtNewValue_TextChanged extends BA.ResumableSub {
public ResumableSub_txtNewValue_TextChanged(b4j.docU.bccolorpicker parent,RemoteObject __ref,RemoteObject _old,RemoteObject _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.bccolorpicker parent;
RemoteObject _old;
RemoteObject _new;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _tf = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _s = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("txtNewValue_TextChanged (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,341);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 342;BA.debugLine="TextChangedIndex = TextChangedIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textchangedindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_textchangedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 343;BA.debugLine="Dim MyIndex As Int = TextChangedIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_textchangedindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 344;BA.debugLine="Sleep(100)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bccolorpicker", "txtnewvalue_textchanged"),BA.numberCast(int.class, 100));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
 BA.debugLineNum = 345;BA.debugLine="If MyIndex <> TextChangedIndex Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_textchangedindex" /*RemoteObject*/ )))) { 
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
 BA.debugLineNum = 346;BA.debugLine="If txtNewValue.Text <> CurrentSelectedHex Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtnewvalue" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),__ref.getField(true,"_currentselectedhex" /*RemoteObject*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 347;BA.debugLine="If IsValidColorString(New) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_isvalidcolorstring" /*RemoteObject*/ ,(Object)(_new)).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 348;BA.debugLine="Dim tf As TextField = txtNewValue.TextField";
Debug.JustUpdateDeviceLine();
_tf = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
_tf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper"), __ref.getField(false,"_txtnewvalue" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).getObject());Debug.locals.put("tf", _tf);Debug.locals.put("tf", _tf);
 BA.debugLineNum = 349;BA.debugLine="Dim s As Int = tf.SelectionStart";
Debug.JustUpdateDeviceLine();
_s = _tf.runMethod(true,"getSelectionStart");Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 350;BA.debugLine="setSelectedColor(HexToColor(New))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_setselectedcolor" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_hextocolor" /*RemoteObject*/ ,(Object)(_new))));
 BA.debugLineNum = 351;BA.debugLine="tf.SetSelection(s, s)";
Debug.JustUpdateDeviceLine();
_tf.runVoidMethod ("SetSelection",(Object)(_s),(Object)(_s));
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
 BA.debugLineNum = 354;BA.debugLine="End Sub";
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
public static RemoteObject  _update(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Update (bccolorpicker) ","bccolorpicker",69,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "bccolorpicker","update", __ref);}
 BA.debugLineNum = 185;BA.debugLine="Private Sub Update";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="DrawColors";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_drawcolors" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.bccolorpicker.class, "_handleselectedcolorchanged" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dont_change" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_dont_change" /*RemoteObject*/ )));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
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