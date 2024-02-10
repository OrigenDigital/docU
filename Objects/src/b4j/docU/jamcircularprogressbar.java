package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamcircularprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamcircularprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamcircularprogressbar.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlbl = null;
public float _cx = 0f;
public float _cy = 0f;
public float _radius = 0f;
public float _stroke = 0f;
public int _clrfull = 0;
public int _clrempty = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public float _currentvalue = 0f;
public int _durationfromzeroto100 = 0;
public boolean _mupdatelblbycode = false;
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
public String  _setvisible(b4j.docU.jamcircularprogressbar __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=122290176;
 //BA.debugLineNum = 122290176;BA.debugLine="Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=122290177;
 //BA.debugLineNum = 122290177;BA.debugLine="mBase.Visible=Visible";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=122290178;
 //BA.debugLineNum = 122290178;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4j.docU.jamcircularprogressbar __ref,float _newvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_newvalue}));}
RDebugUtils.currentLine=121962496;
 //BA.debugLineNum = 121962496;BA.debugLine="Public Sub setValue(NewValue As Float)";
RDebugUtils.currentLine=121962497;
 //BA.debugLineNum = 121962497;BA.debugLine="AnimateValueTo(NewValue)";
__ref._animatevalueto /*void*/ (null,_newvalue);
RDebugUtils.currentLine=121962498;
 //BA.debugLineNum = 121962498;BA.debugLine="End Sub";
return "";
}
public float  _getvalue(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Float) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=122028032;
 //BA.debugLineNum = 122028032;BA.debugLine="Public Sub getValue As Float";
RDebugUtils.currentLine=122028033;
 //BA.debugLineNum = 122028033;BA.debugLine="Return currentValue";
if (true) return __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=122028034;
 //BA.debugLineNum = 122028034;BA.debugLine="End Sub";
return 0f;
}
public void  _animatevalueto(b4j.docU.jamcircularprogressbar __ref,float _newvalue) throws Exception{
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "animatevalueto", true))
	 {Debug.delegate(ba, "animatevalueto", new Object[] {_newvalue}); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(this,__ref,_newvalue);
rsub.resume(ba, null);
}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(b4j.docU.jamcircularprogressbar parent,b4j.docU.jamcircularprogressbar __ref,float _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
this.__ref = parent;
}
b4j.docU.jamcircularprogressbar __ref;
b4j.docU.jamcircularprogressbar parent;
float _newvalue;
long _n = 0L;
int _duration = 0;
float _start = 0f;
float _tempvalue = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamcircularprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=122093569;
 //BA.debugLineNum = 122093569;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=122093570;
 //BA.debugLineNum = 122093570;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(__ref._currentvalue /*float*/ -_newvalue)/(double)100*__ref._durationfromzeroto100 /*int*/ +1000);
RDebugUtils.currentLine=122093571;
 //BA.debugLineNum = 122093571;BA.debugLine="Dim start As Float = currentValue";
_start = __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=122093572;
 //BA.debugLineNum = 122093572;BA.debugLine="currentValue = NewValue";
__ref._currentvalue /*float*/  = _newvalue;
RDebugUtils.currentLine=122093573;
 //BA.debugLineNum = 122093573;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
RDebugUtils.currentLine=122093574;
 //BA.debugLineNum = 122093574;BA.debugLine="Do While DateTime.Now < n + duration";
if (true) break;

case 1:
//do while
this.state = 10;
while (parent.__c.DateTime.getNow()<_n+_duration) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=122093575;
 //BA.debugLineNum = 122093575;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = __ref._valuefromtimeeaseinout /*float*/ (null,(float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
RDebugUtils.currentLine=122093576;
 //BA.debugLineNum = 122093576;BA.debugLine="DrawValue(tempValue)";
__ref._drawvalue /*String*/ (null,_tempvalue);
RDebugUtils.currentLine=122093577;
 //BA.debugLineNum = 122093577;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamcircularprogressbar", "animatevalueto"),(int) (10));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=122093578;
 //BA.debugLineNum = 122093578;BA.debugLine="If NewValue <> currentValue Then Return 'will ha";
if (true) break;

case 4:
//if
this.state = 9;
if (_newvalue!=__ref._currentvalue /*float*/ ) { 
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
RDebugUtils.currentLine=122093580;
 //BA.debugLineNum = 122093580;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=122093581;
 //BA.debugLineNum = 122093581;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public float  _valuefromtimeeaseinout(b4j.docU.jamcircularprogressbar __ref,float _time,float _start,float _changeinvalue,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "valuefromtimeeaseinout", true))
	 {return ((Float) Debug.delegate(ba, "valuefromtimeeaseinout", new Object[] {_time,_start,_changeinvalue,_duration}));}
RDebugUtils.currentLine=122159104;
 //BA.debugLineNum = 122159104;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
RDebugUtils.currentLine=122159105;
 //BA.debugLineNum = 122159105;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
RDebugUtils.currentLine=122159106;
 //BA.debugLineNum = 122159106;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
RDebugUtils.currentLine=122159107;
 //BA.debugLineNum = 122159107;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
RDebugUtils.currentLine=122159109;
 //BA.debugLineNum = 122159109;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
RDebugUtils.currentLine=122159110;
 //BA.debugLineNum = 122159110;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
RDebugUtils.currentLine=122159112;
 //BA.debugLineNum = 122159112;BA.debugLine="End Sub";
return 0f;
}
public String  _drawvalue(b4j.docU.jamcircularprogressbar __ref,float _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "drawvalue", true))
	 {return ((String) Debug.delegate(ba, "drawvalue", new Object[] {_value}));}
float _startangle = 0f;
float _sweepangle = 0f;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=122224640;
 //BA.debugLineNum = 122224640;BA.debugLine="Private Sub DrawValue(Value As Float)";
RDebugUtils.currentLine=122224641;
 //BA.debugLineNum = 122224641;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=122224642;
 //BA.debugLineNum = 122224642;BA.debugLine="cvs.DrawCircle(cx, cy, radius, clrEmpty, False, s";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cx /*float*/ ,__ref._cy /*float*/ ,__ref._radius /*float*/ ,__ref._clrempty /*int*/ ,__c.False,__ref._stroke /*float*/ );
RDebugUtils.currentLine=122224643;
 //BA.debugLineNum = 122224643;BA.debugLine="if not(mUpdateLblByCode) then";
if (__c.Not(__ref._mupdatelblbycode /*boolean*/ )) { 
RDebugUtils.currentLine=122224644;
 //BA.debugLineNum = 122224644;BA.debugLine="mLbl.Text = $\"$1.0{Value} %\"$";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+__c.SmartStringFormatter("1.0",(Object)(_value))+" %"));
 };
RDebugUtils.currentLine=122224646;
 //BA.debugLineNum = 122224646;BA.debugLine="Dim startAngle = -90, sweepAngle = Value / 100 *";
_startangle = (float) (-90);
_sweepangle = (float) (_value/(double)100*360);
RDebugUtils.currentLine=122224648;
 //BA.debugLineNum = 122224648;BA.debugLine="If Value < 100 Then";
if (_value<100) { 
RDebugUtils.currentLine=122224649;
 //BA.debugLineNum = 122224649;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=122224650;
 //BA.debugLineNum = 122224650;BA.debugLine="p.InitializeArc(cx, cy, radius + stroke + 1dip,";
_p.InitializeArc(__ref._cx /*float*/ ,__ref._cy /*float*/ ,(float) (__ref._radius /*float*/ +__ref._stroke /*float*/ +__c.DipToCurrent((int) (1))),_startangle,_sweepangle);
RDebugUtils.currentLine=122224651;
 //BA.debugLineNum = 122224651;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=122224652;
 //BA.debugLineNum = 122224652;BA.debugLine="cvs.DrawCircle(cx, cy, radius - 0.5dip, clrFull,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cx /*float*/ ,__ref._cy /*float*/ ,(float) (__ref._radius /*float*/ -__c.DipToCurrent((int) (0.5))),__ref._clrfull /*int*/ ,__c.False,(float) (__ref._stroke /*float*/ +__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=122224653;
 //BA.debugLineNum = 122224653;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
 }else {
RDebugUtils.currentLine=122224655;
 //BA.debugLineNum = 122224655;BA.debugLine="cvs.DrawCircle(cx, cy, radius - 0.5dip, clrFull,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cx /*float*/ ,__ref._cy /*float*/ ,(float) (__ref._radius /*float*/ -__c.DipToCurrent((int) (0.5))),__ref._clrfull /*int*/ ,__c.False,(float) (__ref._stroke /*float*/ +__c.DipToCurrent((int) (1))));
 };
RDebugUtils.currentLine=122224657;
 //BA.debugLineNum = 122224657;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=122224658;
 //BA.debugLineNum = 122224658;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.docU.jamcircularprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=121896960;
 //BA.debugLineNum = 121896960;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=121896961;
 //BA.debugLineNum = 121896961;BA.debugLine="cx = Width / 2";
__ref._cx /*float*/  = (float) (_width/(double)2);
RDebugUtils.currentLine=121896962;
 //BA.debugLineNum = 121896962;BA.debugLine="cy = Height / 2";
__ref._cy /*float*/  = (float) (_height/(double)2);
RDebugUtils.currentLine=121896963;
 //BA.debugLineNum = 121896963;BA.debugLine="radius = cx - 10dip";
__ref._radius /*float*/  = (float) (__ref._cx /*float*/ -__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=121896964;
 //BA.debugLineNum = 121896964;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__c.Min(_width,_height),__c.Min(_width,_height));
RDebugUtils.currentLine=121896965;
 //BA.debugLineNum = 121896965;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=121896966;
 //BA.debugLineNum = 121896966;BA.debugLine="mLbl.SetLayoutAnimated(0, 0, cy - 20dip, Width, 4";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,__ref._cy /*float*/ -__c.DipToCurrent((int) (20)),_width,__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=121896967;
 //BA.debugLineNum = 121896967;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=121896968;
 //BA.debugLineNum = 121896968;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
RDebugUtils.currentLine=121700352;
 //BA.debugLineNum = 121700352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=121700353;
 //BA.debugLineNum = 121700353;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=121700354;
 //BA.debugLineNum = 121700354;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=121700355;
 //BA.debugLineNum = 121700355;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=121700356;
 //BA.debugLineNum = 121700356;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=121700357;
 //BA.debugLineNum = 121700357;BA.debugLine="Private mLbl As B4XView";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=121700358;
 //BA.debugLineNum = 121700358;BA.debugLine="Private cx, cy, radius As Float";
_cx = 0f;
_cy = 0f;
_radius = 0f;
RDebugUtils.currentLine=121700359;
 //BA.debugLineNum = 121700359;BA.debugLine="Private stroke As Float";
_stroke = 0f;
RDebugUtils.currentLine=121700360;
 //BA.debugLineNum = 121700360;BA.debugLine="Private clrFull, clrEmpty As Int";
_clrfull = 0;
_clrempty = 0;
RDebugUtils.currentLine=121700361;
 //BA.debugLineNum = 121700361;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=121700362;
 //BA.debugLineNum = 121700362;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=121700363;
 //BA.debugLineNum = 121700363;BA.debugLine="Private DurationFromZeroTo100 As Int";
_durationfromzeroto100 = 0;
RDebugUtils.currentLine=121700364;
 //BA.debugLineNum = 121700364;BA.debugLine="private mUpdateLblByCode as boolean";
_mupdatelblbycode = false;
RDebugUtils.currentLine=121700366;
 //BA.debugLineNum = 121700366;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.jamcircularprogressbar __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=121831424;
 //BA.debugLineNum = 121831424;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=121831425;
 //BA.debugLineNum = 121831425;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=121831426;
 //BA.debugLineNum = 121831426;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=121831427;
 //BA.debugLineNum = 121831427;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent,0,x";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0);
RDebugUtils.currentLine=121831429;
 //BA.debugLineNum = 121831429;BA.debugLine="clrFull = xui.PaintOrColorToColor(Props.Get(\"Colo";
__ref._clrfull /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ColorFull")));
RDebugUtils.currentLine=121831430;
 //BA.debugLineNum = 121831430;BA.debugLine="clrEmpty = xui.PaintOrColorToColor(Props.Get(\"Col";
__ref._clrempty /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ColorEmpty")));
RDebugUtils.currentLine=121831431;
 //BA.debugLineNum = 121831431;BA.debugLine="stroke = DipToCurrent(Props.Get(\"StrokeWidth\"))";
__ref._stroke /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("StrokeWidth"))))));
RDebugUtils.currentLine=121831432;
 //BA.debugLineNum = 121831432;BA.debugLine="DurationFromZeroTo100 = Props.Get(\"Duration\")";
__ref._durationfromzeroto100 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=121831433;
 //BA.debugLineNum = 121831433;BA.debugLine="mBase.Visible=Props.Get(\"Visible\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(BA.ObjectToBoolean(_props.Get((Object)("Visible"))));
RDebugUtils.currentLine=121831434;
 //BA.debugLineNum = 121831434;BA.debugLine="mLbl = Lbl";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=121831435;
 //BA.debugLineNum = 121831435;BA.debugLine="cx = mBase.Width / 2";
__ref._cx /*float*/  = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=121831436;
 //BA.debugLineNum = 121831436;BA.debugLine="cy = mBase.Height / 2";
__ref._cy /*float*/  = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=121831437;
 //BA.debugLineNum = 121831437;BA.debugLine="radius = cx - 10dip";
__ref._radius /*float*/  = (float) (__ref._cx /*float*/ -__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=121831438;
 //BA.debugLineNum = 121831438;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=121831439;
 //BA.debugLineNum = 121831439;BA.debugLine="mLbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=121831440;
 //BA.debugLineNum = 121831440;BA.debugLine="mBase.AddView(mLbl, 0, cy - 20dip, mBase.Width, 4";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,__ref._cy /*float*/ -__c.DipToCurrent((int) (20)),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=121831441;
 //BA.debugLineNum = 121831441;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=121831442;
 //BA.debugLineNum = 121831442;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=121831443;
 //BA.debugLineNum = 121831443;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=122945536;
 //BA.debugLineNum = 122945536;BA.debugLine="sub getEnabled as boolean";
RDebugUtils.currentLine=122945537;
 //BA.debugLineNum = 122945537;BA.debugLine="return mBase.Enabled";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=122945538;
 //BA.debugLineNum = 122945538;BA.debugLine="end sub";
return false;
}
public int  _getheight(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getheight", true))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=122880000;
 //BA.debugLineNum = 122880000;BA.debugLine="sub getHeight as int";
RDebugUtils.currentLine=122880001;
 //BA.debugLineNum = 122880001;BA.debugLine="return mBase.Height";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=122880002;
 //BA.debugLineNum = 122880002;BA.debugLine="end sub";
return 0;
}
public int  _getleft(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getleft", true))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=122552320;
 //BA.debugLineNum = 122552320;BA.debugLine="sub getLeft as int";
RDebugUtils.currentLine=122552321;
 //BA.debugLineNum = 122552321;BA.debugLine="return mBase.Left";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=122552322;
 //BA.debugLineNum = 122552322;BA.debugLine="end sub";
return 0;
}
public int  _gettop(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "gettop", true))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=122617856;
 //BA.debugLineNum = 122617856;BA.debugLine="sub getTop as int";
RDebugUtils.currentLine=122617857;
 //BA.debugLineNum = 122617857;BA.debugLine="return mBase.Top";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=122617858;
 //BA.debugLineNum = 122617858;BA.debugLine="end sub";
return 0;
}
public boolean  _getupdatelblbycode(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getupdatelblbycode", true))
	 {return ((Boolean) Debug.delegate(ba, "getupdatelblbycode", null));}
RDebugUtils.currentLine=123076608;
 //BA.debugLineNum = 123076608;BA.debugLine="sub getUpdateLblByCode as boolean";
RDebugUtils.currentLine=123076609;
 //BA.debugLineNum = 123076609;BA.debugLine="return mUpdateLblByCode";
if (true) return __ref._mupdatelblbycode /*boolean*/ ;
RDebugUtils.currentLine=123076610;
 //BA.debugLineNum = 123076610;BA.debugLine="end sub";
return false;
}
public boolean  _getvisible(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=122355712;
 //BA.debugLineNum = 122355712;BA.debugLine="Sub getVisible As Boolean";
RDebugUtils.currentLine=122355713;
 //BA.debugLineNum = 122355713;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
RDebugUtils.currentLine=122355714;
 //BA.debugLineNum = 122355714;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4j.docU.jamcircularprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "getwidth", true))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=122814464;
 //BA.debugLineNum = 122814464;BA.debugLine="sub getWidth as int";
RDebugUtils.currentLine=122814465;
 //BA.debugLineNum = 122814465;BA.debugLine="return mBase.Width";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=122814466;
 //BA.debugLineNum = 122814466;BA.debugLine="end sub";
return 0;
}
public String  _initialize(b4j.docU.jamcircularprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=121765888;
 //BA.debugLineNum = 121765888;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=121765889;
 //BA.debugLineNum = 121765889;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=121765890;
 //BA.debugLineNum = 121765890;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=121765891;
 //BA.debugLineNum = 121765891;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4j.docU.jamcircularprogressbar __ref,boolean _mbaseenabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_mbaseenabled}));}
RDebugUtils.currentLine=123011072;
 //BA.debugLineNum = 123011072;BA.debugLine="sub setEnabled(mBaseEnabled as boolean)";
RDebugUtils.currentLine=123011073;
 //BA.debugLineNum = 123011073;BA.debugLine="mBase.Enabled=mBaseEnabled";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_mbaseenabled);
RDebugUtils.currentLine=123011074;
 //BA.debugLineNum = 123011074;BA.debugLine="mLbl.Enabled=mBaseEnabled";
__ref._mlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(_mbaseenabled);
RDebugUtils.currentLine=123011075;
 //BA.debugLineNum = 123011075;BA.debugLine="end sub";
return "";
}
public String  _setheight(b4j.docU.jamcircularprogressbar __ref,int _mbaseheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_mbaseheight}));}
RDebugUtils.currentLine=122748928;
 //BA.debugLineNum = 122748928;BA.debugLine="sub setHeight(mBaseHeight as int)";
RDebugUtils.currentLine=122748929;
 //BA.debugLineNum = 122748929;BA.debugLine="mBase.Height=mBaseHeight";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_mbaseheight);
RDebugUtils.currentLine=122748930;
 //BA.debugLineNum = 122748930;BA.debugLine="end sub";
return "";
}
public String  _setleft(b4j.docU.jamcircularprogressbar __ref,int _mbaseleft) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setleft", true))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_mbaseleft}));}
RDebugUtils.currentLine=122421248;
 //BA.debugLineNum = 122421248;BA.debugLine="sub setLeft(mBaseLeft as int)";
RDebugUtils.currentLine=122421249;
 //BA.debugLineNum = 122421249;BA.debugLine="mBase.Left=mBaseLeft";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_mbaseleft);
RDebugUtils.currentLine=122421250;
 //BA.debugLineNum = 122421250;BA.debugLine="end sub";
return "";
}
public String  _settop(b4j.docU.jamcircularprogressbar __ref,int _mbasetop) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "settop", true))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_mbasetop}));}
RDebugUtils.currentLine=122486784;
 //BA.debugLineNum = 122486784;BA.debugLine="sub setTop(mBaseTop as int)";
RDebugUtils.currentLine=122486785;
 //BA.debugLineNum = 122486785;BA.debugLine="mBase.Top=mBaseTop";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(_mbasetop);
RDebugUtils.currentLine=122486786;
 //BA.debugLineNum = 122486786;BA.debugLine="end sub";
return "";
}
public String  _setupdatelblbycode(b4j.docU.jamcircularprogressbar __ref,boolean _updatelblbycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setupdatelblbycode", true))
	 {return ((String) Debug.delegate(ba, "setupdatelblbycode", new Object[] {_updatelblbycode}));}
RDebugUtils.currentLine=123142144;
 //BA.debugLineNum = 123142144;BA.debugLine="sub setUpdateLblByCode(UpdateLblByCode as boolean)";
RDebugUtils.currentLine=123142145;
 //BA.debugLineNum = 123142145;BA.debugLine="mUpdateLblByCode=UpdateLblByCode";
__ref._mupdatelblbycode /*boolean*/  = _updatelblbycode;
RDebugUtils.currentLine=123142146;
 //BA.debugLineNum = 123142146;BA.debugLine="end sub";
return "";
}
public String  _setwidth(b4j.docU.jamcircularprogressbar __ref,int _mbasewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamcircularprogressbar";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_mbasewidth}));}
RDebugUtils.currentLine=122683392;
 //BA.debugLineNum = 122683392;BA.debugLine="sub setWidth(mBaseWidth as int)";
RDebugUtils.currentLine=122683393;
 //BA.debugLineNum = 122683393;BA.debugLine="mBase.Width=mBaseWidth";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_mbasewidth);
RDebugUtils.currentLine=122683394;
 //BA.debugLineNum = 122683394;BA.debugLine="end sub";
return "";
}
}