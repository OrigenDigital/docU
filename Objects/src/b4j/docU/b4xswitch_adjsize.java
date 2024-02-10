package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xswitch_adjsize extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xswitch_adjsize", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xswitch_adjsize.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.bcpath._bcbrush _oncolor = null;
public b4j.example.bcpath._bcbrush _offcolor = null;
public b4j.example.bitmapcreator _bc = null;
public int _width = 0;
public int _height = 0;
public b4j.example.bcpath._bcbrush _thumbcolor = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
public boolean _mvalue = false;
public b4j.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public float _scale = 0f;
public boolean _menabled = false;
public boolean _mhaptic = false;
public float _size = 0f;
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
public String  _base_resize(b4j.docU.b4xswitch_adjsize __ref,double _width1,double _height1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width1,_height1}));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xswitch_adjsize __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="Private OnColor, OffColor As BCBrush";
_oncolor = new b4j.example.bcpath._bcbrush();
_offcolor = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="Private Width As Int = 55dip";
_width = __c.DipToCurrent((int) (55));
RDebugUtils.currentLine=38141960;
 //BA.debugLineNum = 38141960;BA.debugLine="Private Height As Int = 31dip";
_height = __c.DipToCurrent((int) (31));
RDebugUtils.currentLine=38141961;
 //BA.debugLineNum = 38141961;BA.debugLine="Private ThumbColor As BCBrush";
_thumbcolor = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=38141962;
 //BA.debugLineNum = 38141962;BA.debugLine="Private iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=38141963;
 //BA.debugLineNum = 38141963;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
RDebugUtils.currentLine=38141964;
 //BA.debugLineNum = 38141964;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4j.example.bcpath._bcbrush();
RDebugUtils.currentLine=38141965;
 //BA.debugLineNum = 38141965;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=38141966;
 //BA.debugLineNum = 38141966;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=38141967;
 //BA.debugLineNum = 38141967;BA.debugLine="Private Scale As Float";
_scale = 0f;
RDebugUtils.currentLine=38141968;
 //BA.debugLineNum = 38141968;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=38141969;
 //BA.debugLineNum = 38141969;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=38141970;
 //BA.debugLineNum = 38141970;BA.debugLine="Private size As Float";
_size = 0f;
RDebugUtils.currentLine=38141971;
 //BA.debugLineNum = 38141971;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.b4xswitch_adjsize __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="Select Props.Get(\"Size\")";
switch (BA.switchObjectToInt(_props.Get((Object)("Size")),(Object)("XS"),(Object)("S"),(Object)("M"),(Object)("L"),(Object)("XL"))) {
case 0: {
RDebugUtils.currentLine=38273031;
 //BA.debugLineNum = 38273031;BA.debugLine="Case \"XS\": size = 0.50";
__ref._size /*float*/  = (float) (0.50);
 break; }
case 1: {
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="Case \"S\" : size = 0.75";
__ref._size /*float*/  = (float) (0.75);
 break; }
case 2: {
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="Case \"M\" : size = 1.00";
__ref._size /*float*/  = (float) (1.00);
 break; }
case 3: {
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="Case \"L\" : size = 1.25";
__ref._size /*float*/  = (float) (1.25);
 break; }
case 4: {
RDebugUtils.currentLine=38273035;
 //BA.debugLineNum = 38273035;BA.debugLine="Case \"XL\": size = 1.50";
__ref._size /*float*/  = (float) (1.50);
 break; }
}
;
RDebugUtils.currentLine=38273038;
 //BA.debugLineNum = 38273038;BA.debugLine="Width = Width * size";
__ref._width /*int*/  = (int) (__ref._width /*int*/ *__ref._size /*float*/ );
RDebugUtils.currentLine=38273039;
 //BA.debugLineNum = 38273039;BA.debugLine="Height = Height * size";
__ref._height /*int*/  = (int) (__ref._height /*int*/ *__ref._size /*float*/ );
RDebugUtils.currentLine=38273042;
 //BA.debugLineNum = 38273042;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=38273043;
 //BA.debugLineNum = 38273043;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=38273044;
 //BA.debugLineNum = 38273044;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=38273045;
 //BA.debugLineNum = 38273045;BA.debugLine="pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=38273046;
 //BA.debugLineNum = 38273046;BA.debugLine="iv.Initialize(\"\")";
__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=38273047;
 //BA.debugLineNum = 38273047;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .getObject()),0,0,__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=38273048;
 //BA.debugLineNum = 38273048;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_pnl.getObject()),0,0,__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=38273050;
 //BA.debugLineNum = 38273050;BA.debugLine="bc.Initialize(Width, Height)";
__ref._bc /*b4j.example.bitmapcreator*/ ._initialize(ba,__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=38273051;
 //BA.debugLineNum = 38273051;BA.debugLine="Scale = xui.Scale";
__ref._scale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=38273056;
 //BA.debugLineNum = 38273056;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
__ref._oncolor /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OnColor"))));
RDebugUtils.currentLine=38273057;
 //BA.debugLineNum = 38273057;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
__ref._offcolor /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OffColor"))));
RDebugUtils.currentLine=38273058;
 //BA.debugLineNum = 38273058;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
__ref._thumbcolor /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor"))));
RDebugUtils.currentLine=38273059;
 //BA.debugLineNum = 38273059;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=38273060;
 //BA.debugLineNum = 38273060;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref._transparent /*b4j.example.bcpath._bcbrush*/  = __ref._bc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=38273061;
 //BA.debugLineNum = 38273061;BA.debugLine="mEnabled = mBase.Enabled";
__ref._menabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=38273062;
 //BA.debugLineNum = 38273062;BA.debugLine="mBase.Enabled = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=38273063;
 //BA.debugLineNum = 38273063;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
__ref._setvalueimpl /*void*/ (null,BA.ObjectToBoolean(_props.Get((Object)("Value"))),__c.True);
RDebugUtils.currentLine=38273065;
 //BA.debugLineNum = 38273065;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(b4j.docU.b4xswitch_adjsize __ref,boolean _b,boolean _immediate) throws Exception{
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "setvalueimpl", false))
	 {Debug.delegate(ba, "setvalueimpl", new Object[] {_b,_immediate}); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,__ref,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4j.docU.b4xswitch_adjsize parent,b4j.docU.b4xswitch_adjsize __ref,boolean _b,boolean _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
this.__ref = parent;
}
b4j.docU.b4xswitch_adjsize __ref;
b4j.docU.b4xswitch_adjsize parent;
boolean _b;
boolean _immediate;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xswitch_adjsize";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="mValue = b";
__ref._mvalue /*boolean*/  = _b;
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="If Immediate Then";
if (true) break;

case 1:
//if
this.state = 41;
if (_immediate) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 8:
//C
this.state = 11;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 11:
//C
this.state = 41;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=38404103;
 //BA.debugLineNum = 38404103;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 14:
//do while
this.state = 29;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 17:
//if
this.state = 22;
if (__ref._mvalue /*boolean*/ ==parent.__c.False) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
_state1 = (float) (1-_state1);
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="Draw(state1)";
__ref._draw /*String*/ (null,_state1);
RDebugUtils.currentLine=38404109;
 //BA.debugLineNum = 38404109;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xswitch_adjsize", "setvalueimpl"),(int) (16));
this.state = 42;
return;
case 42:
//C
this.state = 23;
;
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 23:
//if
this.state = 28;
if (_myindex!=__ref._loopindex /*int*/ ) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
this.state = 29;
if (true) break;
if (true) break;

case 28:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="If MyIndex = LoopIndex Then";

case 29:
//if
this.state = 40;
if (_myindex==__ref._loopindex /*int*/ ) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=38404113;
 //BA.debugLineNum = 38404113;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 32:
//if
this.state = 39;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 34;
;}
else {
this.state = 36;
;}if (true) break;

case 34:
//C
this.state = 39;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 36:
//C
this.state = 39;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
RDebugUtils.currentLine=38404116;
 //BA.debugLineNum = 38404116;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _draw(b4j.docU.b4xswitch_adjsize __ref,float _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "draw", false))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_state}));}
float _r = 0f;
float _cx = 0f;
int _cy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _smallrect = null;
float _w = 0f;
float _h = 0f;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub Draw (State As Float)";
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
__ref._bc /*b4j.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4j.example.bitmapcreator*/ ._targetrect,__ref._transparent /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
_r = (float) (__c.Round(__ref._bc /*b4j.example.bitmapcreator*/ ._mheight/(double)2));
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
_cx = (float) (_r-1*__ref._scale /*float*/ +(__ref._bc /*b4j.example.bitmapcreator*/ ._mwidth-2*_r)*_state);
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="If State = 0 Then";
if (_state==0) { 
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="cx = r";
_cx = _r;
 }else 
{RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="Else If State = 1 Then";
if (_state==1) { 
RDebugUtils.currentLine=38731785;
 //BA.debugLineNum = 38731785;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
_cx = (float) (__c.Round(__ref._bc /*b4j.example.bitmapcreator*/ ._mwidth-1*__ref._scale /*float*/ -_r));
 }}
;
RDebugUtils.currentLine=38731787;
 //BA.debugLineNum = 38731787;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
_cy = (int) (__ref._bc /*b4j.example.bitmapcreator*/ ._mheight/(double)2);
RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="Dim smallrect As B4XRect";
_smallrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=38731789;
 //BA.debugLineNum = 38731789;BA.debugLine="Dim w As Float = State * bc.mWidth";
_w = (float) (_state*__ref._bc /*b4j.example.bitmapcreator*/ ._mwidth);
RDebugUtils.currentLine=38731790;
 //BA.debugLineNum = 38731790;BA.debugLine="Dim h As Float = State * bc.mHeight";
_h = (float) (_state*__ref._bc /*b4j.example.bitmapcreator*/ ._mheight);
RDebugUtils.currentLine=38731791;
 //BA.debugLineNum = 38731791;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
if (_state<1) { 
__ref._bc /*b4j.example.bitmapcreator*/ ._drawrectrounded2(__ref._bc /*b4j.example.bitmapcreator*/ ._targetrect,__ref._offcolor /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (2*__ref._scale /*float*/ ),(int) (_r));};
RDebugUtils.currentLine=38731792;
 //BA.debugLineNum = 38731792;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
_smallrect.Initialize((float) (__ref._bc /*b4j.example.bitmapcreator*/ ._mwidth/(double)2-_w/(double)2),(float) (_cy-_h/(double)2),(float) (__ref._bc /*b4j.example.bitmapcreator*/ ._mwidth/(double)2+_w/(double)2),(float) (_cy+_h/(double)2));
RDebugUtils.currentLine=38731793;
 //BA.debugLineNum = 38731793;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
if (_state>0) { 
__ref._bc /*b4j.example.bitmapcreator*/ ._drawrectrounded2(_smallrect,__ref._oncolor /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (2*__ref._scale /*float*/ ),(int) (_smallrect.getHeight()/(double)2));};
RDebugUtils.currentLine=38731794;
 //BA.debugLineNum = 38731794;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=38731795;
 //BA.debugLineNum = 38731795;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor,";
__ref._bc /*b4j.example.bitmapcreator*/ ._drawcircle2(_cx,(float) (_cy),(float) (_r-2*__ref._scale /*float*/ ),__ref._thumbcolor /*b4j.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
 };
RDebugUtils.currentLine=38731797;
 //BA.debugLineNum = 38731797;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4j.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4j.example.bitmapcreator*/ ._getbitmap(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .getObject())));
RDebugUtils.currentLine=38731799;
 //BA.debugLineNum = 38731799;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4j.docU.b4xswitch_adjsize __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "getenabled", false))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="End Sub";
return false;
}
public boolean  _getvalue(b4j.docU.b4xswitch_adjsize __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Boolean) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub getValue As Boolean";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*boolean*/ ;
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.docU.b4xswitch_adjsize __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mouseclicked(b4j.docU.b4xswitch_adjsize __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "pnl_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "pnl_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub Pnl_MouseClicked (EventData As MouseEv";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="SetValueImpl(Not(mValue), False)";
__ref._setvalueimpl /*void*/ (null,__c.Not(__ref._mvalue /*boolean*/ ),__c.False);
RDebugUtils.currentLine=38338568;
 //BA.debugLineNum = 38338568;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ValueC";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*boolean*/ ));
 };
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4j.docU.b4xswitch_adjsize __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "setenabled", false))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub setEnabled (b As Boolean)";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4j.docU.b4xswitch_adjsize __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch_adjsize";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_b}));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Public Sub setValue(b As Boolean)";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="If b = mValue Then Return";
if (_b==__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="SetValueImpl(b, False)";
__ref._setvalueimpl /*void*/ (null,_b,__c.False);
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="End Sub";
return "";
}
}