package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xsignaturetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xsignaturetemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xsignaturetemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public float _lastx = 0f;
public float _lasty = 0f;
public float _strokewidth = 0f;
public int _strokecolor = 0;
public int _textcolor = 0;
public int _backgroundcolor = 0;
public boolean _adddateandtime = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _textfont = null;
public int _numberofpoints = 0;
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
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.b4xsignaturetemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=246546432;
 //BA.debugLineNum = 246546432;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=246546433;
 //BA.debugLineNum = 246546433;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=246546434;
 //BA.debugLineNum = 246546434;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.docU.b4xsignaturetemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=246611968;
 //BA.debugLineNum = 246611968;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=246611969;
 //BA.debugLineNum = 246611969;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._backgroundcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=246611970;
 //BA.debugLineNum = 246611970;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=246611971;
 //BA.debugLineNum = 246611971;BA.debugLine="NumberOfPoints = 0";
__ref._numberofpoints /*int*/  = (int) (0);
RDebugUtils.currentLine=246611972;
 //BA.debugLineNum = 246611972;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.docU.b4xsignaturetemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=246808576;
 //BA.debugLineNum = 246808576;BA.debugLine="Private Sub DialogClosed (Result As Int)";
RDebugUtils.currentLine=246808577;
 //BA.debugLineNum = 246808577;BA.debugLine="If Result = xui.DialogResponse_Positive And AddDa";
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive && __ref._adddateandtime /*boolean*/ ) { 
RDebugUtils.currentLine=246808578;
 //BA.debugLineNum = 246808578;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"M\", TextFont";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText("M",__ref._textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=246808579;
 //BA.debugLineNum = 246808579;BA.debugLine="Dim Baseline As Int = cvs.TargetRect.Bottom - r.";
_baseline = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-_r.getHeight()-_r.getTop()-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=246808580;
 //BA.debugLineNum = 246808580;BA.debugLine="cvs.DrawText($\"$DateTime{DateTime.Now}\"$, 2dip,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText((""+__c.SmartStringFormatter("datetime",(Object)(__c.DateTime.getNow()))+""),__c.DipToCurrent((int) (2)),_baseline,__ref._textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._textcolor /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 };
RDebugUtils.currentLine=246808582;
 //BA.debugLineNum = 246808582;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xsignaturetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
RDebugUtils.currentLine=246349824;
 //BA.debugLineNum = 246349824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=246349825;
 //BA.debugLineNum = 246349825;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=246349826;
 //BA.debugLineNum = 246349826;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=246349827;
 //BA.debugLineNum = 246349827;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=246349828;
 //BA.debugLineNum = 246349828;BA.debugLine="Private LastX, LastY As Float";
_lastx = 0f;
_lasty = 0f;
RDebugUtils.currentLine=246349829;
 //BA.debugLineNum = 246349829;BA.debugLine="Public StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=246349830;
 //BA.debugLineNum = 246349830;BA.debugLine="Public StrokeColor As Int = xui.Color_Black";
_strokecolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=246349831;
 //BA.debugLineNum = 246349831;BA.debugLine="Public TextColor As Int = 0xFFFF8800";
_textcolor = ((int)0xffff8800);
RDebugUtils.currentLine=246349832;
 //BA.debugLineNum = 246349832;BA.debugLine="Public BackgroundColor As Int = xui.Color_White";
_backgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=246349833;
 //BA.debugLineNum = 246349833;BA.debugLine="Public AddDateAndTime As Boolean = True";
_adddateandtime = __c.True;
RDebugUtils.currentLine=246349834;
 //BA.debugLineNum = 246349834;BA.debugLine="Public TextFont As B4XFont";
_textfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=246349835;
 //BA.debugLineNum = 246349835;BA.debugLine="Public NumberOfPoints As Int";
_numberofpoints = 0;
RDebugUtils.currentLine=246349836;
 //BA.debugLineNum = 246349836;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4j.docU.b4xsignaturetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=246743040;
 //BA.debugLineNum = 246743040;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=246743041;
 //BA.debugLineNum = 246743041;BA.debugLine="Return cvs.CreateBitmap";
if (true) return __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .CreateBitmap();
RDebugUtils.currentLine=246743042;
 //BA.debugLineNum = 246743042;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.b4xsignaturetemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=246415360;
 //BA.debugLineNum = 246415360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=246415361;
 //BA.debugLineNum = 246415361;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=246415362;
 //BA.debugLineNum = 246415362;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (200)));
RDebugUtils.currentLine=246415363;
 //BA.debugLineNum = 246415363;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=246415364;
 //BA.debugLineNum = 246415364;BA.debugLine="TextFont = xui.CreateDefaultFont(14)";
__ref._textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14));
RDebugUtils.currentLine=246415365;
 //BA.debugLineNum = 246415365;BA.debugLine="End Sub";
return "";
}
public String  _mbase_touch(b4j.docU.b4xsignaturetemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "mbase_touch", true))
	 {return ((String) Debug.delegate(ba, "mbase_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=246677504;
 //BA.debugLineNum = 246677504;BA.debugLine="Private Sub mBase_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=246677505;
 //BA.debugLineNum = 246677505;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE)) {
case 0: {
RDebugUtils.currentLine=246677507;
 //BA.debugLineNum = 246677507;BA.debugLine="LastX = X";
__ref._lastx /*float*/  = _x;
RDebugUtils.currentLine=246677508;
 //BA.debugLineNum = 246677508;BA.debugLine="LastY = Y";
__ref._lasty /*float*/  = _y;
 break; }
case 1: {
RDebugUtils.currentLine=246677510;
 //BA.debugLineNum = 246677510;BA.debugLine="cvs.DrawLine(LastX, LastY, X, Y, StrokeColor, S";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(__ref._lastx /*float*/ ,__ref._lasty /*float*/ ,_x,_y,__ref._strokecolor /*int*/ ,__ref._strokewidth /*float*/ );
RDebugUtils.currentLine=246677511;
 //BA.debugLineNum = 246677511;BA.debugLine="LastX = X";
__ref._lastx /*float*/  = _x;
RDebugUtils.currentLine=246677512;
 //BA.debugLineNum = 246677512;BA.debugLine="LastY = Y";
__ref._lasty /*float*/  = _y;
RDebugUtils.currentLine=246677513;
 //BA.debugLineNum = 246677513;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=246677514;
 //BA.debugLineNum = 246677514;BA.debugLine="NumberOfPoints = NumberOfPoints + 1";
__ref._numberofpoints /*int*/  = (int) (__ref._numberofpoints /*int*/ +1);
 break; }
}
;
RDebugUtils.currentLine=246677516;
 //BA.debugLineNum = 246677516;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.docU.b4xsignaturetemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsignaturetemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=246480896;
 //BA.debugLineNum = 246480896;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=246480897;
 //BA.debugLineNum = 246480897;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=246480898;
 //BA.debugLineNum = 246480898;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=246480899;
 //BA.debugLineNum = 246480899;BA.debugLine="End Sub";
return "";
}
}