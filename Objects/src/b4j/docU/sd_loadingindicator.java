package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class sd_loadingindicator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.sd_loadingindicator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.sd_loadingindicator.class).invoke(this, new Object[] {null});
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
public int _clr = 0;
public int _bgclr = 0;
public int _index = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _duration = 0;
public String _drawingsubname = "";
public float _radial = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmpbubble = null;
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
public String  _show(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=214106112;
 //BA.debugLineNum = 214106112;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=214106113;
 //BA.debugLineNum = 214106113;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=214106114;
 //BA.debugLineNum = 214106114;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=214106115;
 //BA.debugLineNum = 214106115;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=214171648;
 //BA.debugLineNum = 214171648;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=214171649;
 //BA.debugLineNum = 214171649;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=214171650;
 //BA.debugLineNum = 214171650;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=214171651;
 //BA.debugLineNum = 214171651;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.docU.sd_loadingindicator __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=213975040;
 //BA.debugLineNum = 213975040;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=213975041;
 //BA.debugLineNum = 213975041;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=213975042;
 //BA.debugLineNum = 213975042;BA.debugLine="bmpBubble = Gradient";
__ref._bmpbubble /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._gradient /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null);
RDebugUtils.currentLine=213975043;
 //BA.debugLineNum = 213975043;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=213975044;
 //BA.debugLineNum = 213975044;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _gradient(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "gradient", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "gradient", null));}
b4j.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=215154688;
 //BA.debugLineNum = 215154688;BA.debugLine="Private Sub Gradient As B4XBitmap";
RDebugUtils.currentLine=215154689;
 //BA.debugLineNum = 215154689;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=215154691;
 //BA.debugLineNum = 215154691;BA.debugLine="bc.Initialize(mBase.Width,mBase.Height)";
_bc._initialize(ba,(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=215154692;
 //BA.debugLineNum = 215154692;BA.debugLine="bc.FillRadialGradient(Array As Int (clr,bgclr),cv";
_bc._fillradialgradient(new int[]{__ref._clr /*int*/ ,__ref._bgclr /*int*/ },__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=215154694;
 //BA.debugLineNum = 215154694;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=215154695;
 //BA.debugLineNum = 215154695;BA.debugLine="End Sub";
return null;
}
public void  _mainloop(b4j.docU.sd_loadingindicator __ref) throws Exception{
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "mainloop", true))
	 {Debug.delegate(ba, "mainloop", null); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4j.docU.sd_loadingindicator parent,b4j.docU.sd_loadingindicator __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.sd_loadingindicator __ref;
b4j.docU.sd_loadingindicator parent;
int _myindex = 0;
long _n = 0L;
float _progress = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="sd_loadingindicator";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=214040577;
 //BA.debugLineNum = 214040577;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=214040578;
 //BA.debugLineNum = 214040578;BA.debugLine="Dim MyIndex As Int = index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=214040579;
 //BA.debugLineNum = 214040579;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=214040580;
 //BA.debugLineNum = 214040580;BA.debugLine="Do While MyIndex = index";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myindex==__ref._index /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=214040581;
 //BA.debugLineNum = 214040581;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
_progress = (float) ((parent.__c.DateTime.getNow()-_n)/(double)__ref._duration /*int*/ );
RDebugUtils.currentLine=214040582;
 //BA.debugLineNum = 214040582;BA.debugLine="progress = progress - Floor(progress)";
_progress = (float) (_progress-parent.__c.Floor(_progress));
RDebugUtils.currentLine=214040583;
 //BA.debugLineNum = 214040583;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=214040584;
 //BA.debugLineNum = 214040584;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
parent.__c.CallSubDebug2(ba,parent,__ref._drawingsubname /*String*/ ,(Object)(_progress));
RDebugUtils.currentLine=214040585;
 //BA.debugLineNum = 214040585;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=214040586;
 //BA.debugLineNum = 214040586;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "sd_loadingindicator", "mainloop"),(int) (10));
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
RDebugUtils.currentLine=214040588;
 //BA.debugLineNum = 214040588;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _bringtofront(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "bringtofront", true))
	 {return ((String) Debug.delegate(ba, "bringtofront", null));}
RDebugUtils.currentLine=215285760;
 //BA.debugLineNum = 215285760;BA.debugLine="Public Sub BringToFront";
RDebugUtils.currentLine=215285761;
 //BA.debugLineNum = 215285761;BA.debugLine="mBase.BringToFront";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=215285762;
 //BA.debugLineNum = 215285762;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
RDebugUtils.currentLine=213778432;
 //BA.debugLineNum = 213778432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=213778433;
 //BA.debugLineNum = 213778433;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=213778434;
 //BA.debugLineNum = 213778434;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=213778435;
 //BA.debugLineNum = 213778435;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=213778436;
 //BA.debugLineNum = 213778436;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=213778437;
 //BA.debugLineNum = 213778437;BA.debugLine="Private clr As Int";
_clr = 0;
RDebugUtils.currentLine=213778438;
 //BA.debugLineNum = 213778438;BA.debugLine="Private bgclr As Int";
_bgclr = 0;
RDebugUtils.currentLine=213778439;
 //BA.debugLineNum = 213778439;BA.debugLine="Private index As Int";
_index = 0;
RDebugUtils.currentLine=213778440;
 //BA.debugLineNum = 213778440;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=213778441;
 //BA.debugLineNum = 213778441;BA.debugLine="Private duration As Int";
_duration = 0;
RDebugUtils.currentLine=213778442;
 //BA.debugLineNum = 213778442;BA.debugLine="Private DrawingSubName As String";
_drawingsubname = "";
RDebugUtils.currentLine=213778444;
 //BA.debugLineNum = 213778444;BA.debugLine="Private Radial As Float = 0";
_radial = (float) (0);
RDebugUtils.currentLine=213778445;
 //BA.debugLineNum = 213778445;BA.debugLine="Dim bmpBubble As B4XBitmap";
_bmpbubble = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=213778446;
 //BA.debugLineNum = 213778446;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.sd_loadingindicator __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _style = "";
RDebugUtils.currentLine=213909504;
 //BA.debugLineNum = 213909504;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=213909505;
 //BA.debugLineNum = 213909505;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=213909506;
 //BA.debugLineNum = 213909506;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=213909507;
 //BA.debugLineNum = 213909507;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
__ref._clr /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color")));
RDebugUtils.currentLine=213909508;
 //BA.debugLineNum = 213909508;BA.debugLine="bgclr=mBase.Color";
__ref._bgclr /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();
RDebugUtils.currentLine=213909509;
 //BA.debugLineNum = 213909509;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
_style = BA.ObjectToString(_props.Get((Object)("IndicatorStyle")));
RDebugUtils.currentLine=213909510;
 //BA.debugLineNum = 213909510;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
_duration = (int)(BA.ObjectToNumber(_props.Get((Object)("Duration"))));
RDebugUtils.currentLine=213909511;
 //BA.debugLineNum = 213909511;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
__ref._drawingsubname /*String*/  = "Draw_"+_style.replace(" ","");
RDebugUtils.currentLine=213909512;
 //BA.debugLineNum = 213909512;BA.debugLine="mBase.Color=xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=213909513;
 //BA.debugLineNum = 213909513;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=213909515;
 //BA.debugLineNum = 213909515;BA.debugLine="bmpBubble = Gradient";
__ref._bmpbubble /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._gradient /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null);
RDebugUtils.currentLine=213909516;
 //BA.debugLineNum = 213909516;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=213909517;
 //BA.debugLineNum = 213909517;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc", true))
	 {return ((String) Debug.delegate(ba, "draw_arc", new Object[] {_progress}));}
float _r = 0f;
float _r2 = 0f;
float _r3 = 0f;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=214630400;
 //BA.debugLineNum = 214630400;BA.debugLine="Private Sub Draw_Arc (Progress As Float)";
RDebugUtils.currentLine=214630401;
 //BA.debugLineNum = 214630401;BA.debugLine="Dim r As Float = (Min(cvs.TargetRect.Width,cvs.Ta";
_r = (float) ((__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2)-__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=214630402;
 //BA.debugLineNum = 214630402;BA.debugLine="Dim r2 As Float = 2*r/3";
_r2 = (float) (2*_r/(double)3);
RDebugUtils.currentLine=214630403;
 //BA.debugLineNum = 214630403;BA.debugLine="Dim r3 As Float = r/3";
_r3 = (float) (_r/(double)3);
RDebugUtils.currentLine=214630404;
 //BA.debugLineNum = 214630404;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=214630406;
 //BA.debugLineNum = 214630406;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214630407;
 //BA.debugLineNum = 214630407;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX,cvs.Target";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-_progress*360),(float) (180));
RDebugUtils.currentLine=214630408;
 //BA.debugLineNum = 214630408;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=214630409;
 //BA.debugLineNum = 214630409;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_r-__c.DipToCurrent((int) (1))),__ref._clr /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214630410;
 //BA.debugLineNum = 214630410;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=214630412;
 //BA.debugLineNum = 214630412;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX,cvs.Target";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r2,(float) (_progress*360),(float) (180));
RDebugUtils.currentLine=214630413;
 //BA.debugLineNum = 214630413;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=214630414;
 //BA.debugLineNum = 214630414;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_r2-__c.DipToCurrent((int) (1))),__ref._clr /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214630415;
 //BA.debugLineNum = 214630415;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=214630417;
 //BA.debugLineNum = 214630417;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX,cvs.Target";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r3,(float) (-_progress*360),(float) (180));
RDebugUtils.currentLine=214630418;
 //BA.debugLineNum = 214630418;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=214630419;
 //BA.debugLineNum = 214630419;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_r3-__c.DipToCurrent((int) (1))),__ref._clr /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214630420;
 //BA.debugLineNum = 214630420;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=214630421;
 //BA.debugLineNum = 214630421;BA.debugLine="End Sub";
return "";
}
public String  _draw_bubble(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_bubble", true))
	 {return ((String) Debug.delegate(ba, "draw_bubble", new Object[] {_progress}));}
float _centerx = 0f;
float _centery = 0f;
int _frac = 0;
double _d = 0;
int _wdt = 0;
int _x = 0;
int _y = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rec = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
int _i = 0;
RDebugUtils.currentLine=215089152;
 //BA.debugLineNum = 215089152;BA.debugLine="Private Sub Draw_Bubble (Progress As Float)";
RDebugUtils.currentLine=215089153;
 //BA.debugLineNum = 215089153;BA.debugLine="Dim CenterX As Float = mBase.Width/2";
_centerx = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=215089154;
 //BA.debugLineNum = 215089154;BA.debugLine="Dim CenterY As Float = mBase.Height/2";
_centery = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=215089155;
 //BA.debugLineNum = 215089155;BA.debugLine="Dim Frac As Int = 20";
_frac = (int) (20);
RDebugUtils.currentLine=215089156;
 //BA.debugLineNum = 215089156;BA.debugLine="Dim D As Double = Progress*360";
_d = _progress*360;
RDebugUtils.currentLine=215089157;
 //BA.debugLineNum = 215089157;BA.debugLine="Dim Wdt As Int = Min (mBase.Width,mBase.Height)*0";
_wdt = (int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())*0.60);
RDebugUtils.currentLine=215089158;
 //BA.debugLineNum = 215089158;BA.debugLine="Dim X,Y As Int";
_x = 0;
_y = 0;
RDebugUtils.currentLine=215089159;
 //BA.debugLineNum = 215089159;BA.debugLine="Dim rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=215089160;
 //BA.debugLineNum = 215089160;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=215089162;
 //BA.debugLineNum = 215089162;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215089163;
 //BA.debugLineNum = 215089163;BA.debugLine="For i=0 To Frac-1";
{
final int step10 = 1;
final int limit10 = (int) (_frac-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=215089164;
 //BA.debugLineNum = 215089164;BA.debugLine="X=CenterX+CosD(D)*Wdt*0.20*(i+3)/Frac";
_x = (int) (_centerx+__c.CosD(_d)*_wdt*0.20*(_i+3)/(double)_frac);
RDebugUtils.currentLine=215089165;
 //BA.debugLineNum = 215089165;BA.debugLine="y=CenterY+SinD(D)*Wdt*0.20*(i+3)/Frac";
_y = (int) (_centery+__c.SinD(_d)*_wdt*0.20*(_i+3)/(double)_frac);
RDebugUtils.currentLine=215089166;
 //BA.debugLineNum = 215089166;BA.debugLine="rec.Initialize(x-Wdt*(50-(10*i/Frac))/100,y-Wdt*";
_rec.Initialize((float) (_x-_wdt*(50-(10*_i/(double)_frac))/(double)100),(float) (_y-_wdt*(50-(10*_i/(double)_frac))/(double)100),(float) (_x+_wdt*(50-(10*_i/(double)_frac))/(double)100),(float) (_y+_wdt*(50-(10*_i/(double)_frac))/(double)100));
RDebugUtils.currentLine=215089167;
 //BA.debugLineNum = 215089167;BA.debugLine="Path.InitializeOval(rec)";
_path.InitializeOval(_rec);
RDebugUtils.currentLine=215089168;
 //BA.debugLineNum = 215089168;BA.debugLine="cvs.ClipPath(Path)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_path);
RDebugUtils.currentLine=215089169;
 //BA.debugLineNum = 215089169;BA.debugLine="cvs.DrawBitmap(bmpBubble,cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmap((javafx.scene.image.Image)(__ref._bmpbubble /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=215089170;
 //BA.debugLineNum = 215089170;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
 }
};
RDebugUtils.currentLine=215089172;
 //BA.debugLineNum = 215089172;BA.debugLine="End Sub";
return "";
}
public String  _draw_fivelines(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_fivelines", true))
	 {return ((String) Debug.delegate(ba, "draw_fivelines", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _dx = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=214892544;
 //BA.debugLineNum = 214892544;BA.debugLine="Private Sub Draw_FiveLines(Progress As Float)";
RDebugUtils.currentLine=214892545;
 //BA.debugLineNum = 214892545;BA.debugLine="Dim MinR As Int = 10dip";
_minr = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=214892546;
 //BA.debugLineNum = 214892546;BA.debugLine="Dim MaxR As Int = (cvs.TargetRect.Height/2)-4dip-";
_maxr = (int) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)2)-__c.DipToCurrent((int) (4))-_minr);
RDebugUtils.currentLine=214892547;
 //BA.debugLineNum = 214892547;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
_dx = (int) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-__c.DipToCurrent((int) (2)))/(double)5);
RDebugUtils.currentLine=214892549;
 //BA.debugLineNum = 214892549;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214892550;
 //BA.debugLineNum = 214892550;BA.debugLine="For i = 0 To 4";
{
final int step5 = 1;
final int limit5 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=214892551;
 //BA.debugLineNum = 214892551;BA.debugLine="Dim r As Float = MinR + (MaxR / 2) + (MaxR / 2)";
_r = (float) (_minr+(_maxr/(double)2)+(_maxr/(double)2)*__c.SinD(_progress*360-30*_i));
RDebugUtils.currentLine=214892552;
 //BA.debugLineNum = 214892552;BA.debugLine="cvs.DrawLine((dx/2) + i * dx, cvs.TargetRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) ((_dx/(double)2)+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r),(float) ((_dx/(double)2)+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r),__ref._clr /*int*/ ,(float) (__c.DipToCurrent((int) (4))));
 }
};
RDebugUtils.currentLine=214892554;
 //BA.debugLineNum = 214892554;BA.debugLine="End Sub";
return "";
}
public String  _draw_followcircles(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_followcircles", true))
	 {return ((String) Debug.delegate(ba, "draw_followcircles", new Object[] {_progress}));}
float _r = 0f;
int _x = 0;
int _y = 0;
int _i = 0;
RDebugUtils.currentLine=214499328;
 //BA.debugLineNum = 214499328;BA.debugLine="Private Sub Draw_FollowCircles (Progress As Float)";
RDebugUtils.currentLine=214499329;
 //BA.debugLineNum = 214499329;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2-__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=214499330;
 //BA.debugLineNum = 214499330;BA.debugLine="Dim X As Int = r*SinD(Progress*360)";
_x = (int) (_r*__c.SinD(_progress*360));
RDebugUtils.currentLine=214499331;
 //BA.debugLineNum = 214499331;BA.debugLine="Dim Y As Int = r*CosD(Progress*360)";
_y = (int) (_r*__c.CosD(_progress*360));
RDebugUtils.currentLine=214499333;
 //BA.debugLineNum = 214499333;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214499334;
 //BA.debugLineNum = 214499334;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.Ta";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_x),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_y),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214499335;
 //BA.debugLineNum = 214499335;BA.debugLine="For i=0 To 4";
{
final int step6 = 1;
final int limit6 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=214499336;
 //BA.debugLineNum = 214499336;BA.debugLine="X = r*SinD(Progress*360-i*(72*Abs(Progress-0.5))";
_x = (int) (_r*__c.SinD(_progress*360-_i*(72*__c.Abs(_progress-0.5))));
RDebugUtils.currentLine=214499337;
 //BA.debugLineNum = 214499337;BA.debugLine="Y = r*CosD(Progress*360-i*(72*Abs(Progress-0.5))";
_y = (int) (_r*__c.CosD(_progress*360-_i*(72*__c.Abs(_progress-0.5))));
RDebugUtils.currentLine=214499338;
 //BA.debugLineNum = 214499338;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_x),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_y),(float) (__c.DipToCurrent((int) (7))-(_i*__c.DipToCurrent((int) (5))/(double)5)),__c.Bit.And(__ref._clr /*int*/ ,((int)0x55ffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=214499340;
 //BA.debugLineNum = 214499340;BA.debugLine="End Sub";
return "";
}
public String  _draw_followcircles2(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_followcircles2", true))
	 {return ((String) Debug.delegate(ba, "draw_followcircles2", new Object[] {_progress}));}
float _r = 0f;
int _x = 0;
int _y = 0;
int _i = 0;
RDebugUtils.currentLine=214564864;
 //BA.debugLineNum = 214564864;BA.debugLine="Private Sub Draw_FollowCircles2 (Progress As Float";
RDebugUtils.currentLine=214564865;
 //BA.debugLineNum = 214564865;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2-__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=214564866;
 //BA.debugLineNum = 214564866;BA.debugLine="Dim X As Int";
_x = 0;
RDebugUtils.currentLine=214564867;
 //BA.debugLineNum = 214564867;BA.debugLine="Dim Y As Int";
_y = 0;
RDebugUtils.currentLine=214564869;
 //BA.debugLineNum = 214564869;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214564870;
 //BA.debugLineNum = 214564870;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + (r*SinD(P";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r*__c.SinD(_progress*360))),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r*__c.CosD(_progress*360))),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214564871;
 //BA.debugLineNum = 214564871;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + (r*SinD(P";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r*__c.SinD(_progress*360+180))),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r*__c.CosD(_progress*360+180))),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214564873;
 //BA.debugLineNum = 214564873;BA.debugLine="For i=0 To 4";
{
final int step7 = 1;
final int limit7 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=214564874;
 //BA.debugLineNum = 214564874;BA.debugLine="X = r*SinD(Progress*360-i*(72*Abs(Progress-0.5))";
_x = (int) (_r*__c.SinD(_progress*360-_i*(72*__c.Abs(_progress-0.5))));
RDebugUtils.currentLine=214564875;
 //BA.debugLineNum = 214564875;BA.debugLine="Y = r*CosD(Progress*360-i*(72*Abs(Progress-0.5))";
_y = (int) (_r*__c.CosD(_progress*360-_i*(72*__c.Abs(_progress-0.5))));
RDebugUtils.currentLine=214564876;
 //BA.debugLineNum = 214564876;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_x),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_y),(float) (__c.DipToCurrent((int) (7))-(_i*__c.DipToCurrent((int) (5))/(double)5)),__c.Bit.And(__ref._clr /*int*/ ,((int)0x55ffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214564878;
 //BA.debugLineNum = 214564878;BA.debugLine="X = r*SinD(Progress*360+180-i*(72*Abs(Progress-0";
_x = (int) (_r*__c.SinD(_progress*360+180-_i*(72*__c.Abs(_progress-0.5))));
RDebugUtils.currentLine=214564879;
 //BA.debugLineNum = 214564879;BA.debugLine="Y = r*CosD(Progress*360+180-i*(72*Abs(Progress-0";
_y = (int) (_r*__c.CosD(_progress*360+180-_i*(72*__c.Abs(_progress-0.5))));
RDebugUtils.currentLine=214564880;
 //BA.debugLineNum = 214564880;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_x),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_y),(float) (__c.DipToCurrent((int) (7))-(_i*__c.DipToCurrent((int) (5))/(double)5)),__c.Bit.And(__ref._clr /*int*/ ,((int)0x55ffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=214564882;
 //BA.debugLineNum = 214564882;BA.debugLine="End Sub";
return "";
}
public String  _draw_foursquares(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_foursquares", true))
	 {return ((String) Debug.delegate(ba, "draw_foursquares", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rec = null;
int _top = 0;
int _left = 0;
int _bottom = 0;
int _right = 0;
int _top2 = 0;
int _left2 = 0;
int _bottom2 = 0;
int _right2 = 0;
int _width = 0;
int _height = 0;
float _prg = 0f;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _roundrec = null;
RDebugUtils.currentLine=215220224;
 //BA.debugLineNum = 215220224;BA.debugLine="Private Sub Draw_FourSquares (Progress As Float)";
RDebugUtils.currentLine=215220225;
 //BA.debugLineNum = 215220225;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=215220226;
 //BA.debugLineNum = 215220226;BA.debugLine="Dim top As Int = cvs.TargetRect.Centery*0.125";
_top = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()*0.125);
RDebugUtils.currentLine=215220227;
 //BA.debugLineNum = 215220227;BA.debugLine="Dim left As Int = cvs.TargetRect.CenterX*0.125";
_left = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*0.125);
RDebugUtils.currentLine=215220228;
 //BA.debugLineNum = 215220228;BA.debugLine="Dim bottom As Int = cvs.TargetRect.CenterY*0.925";
_bottom = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()*0.925);
RDebugUtils.currentLine=215220229;
 //BA.debugLineNum = 215220229;BA.debugLine="Dim right As Int = cvs.TargetRect.Centerx*0.925";
_right = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*0.925);
RDebugUtils.currentLine=215220231;
 //BA.debugLineNum = 215220231;BA.debugLine="Dim top2 As Int = cvs.TargetRect.Centery*1.1";
_top2 = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()*1.1);
RDebugUtils.currentLine=215220232;
 //BA.debugLineNum = 215220232;BA.debugLine="Dim left2 As Int = cvs.TargetRect.CenterX*1.1";
_left2 = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*1.1);
RDebugUtils.currentLine=215220233;
 //BA.debugLineNum = 215220233;BA.debugLine="Dim bottom2 As Int = cvs.TargetRect.CenterY*1.9";
_bottom2 = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()*1.9);
RDebugUtils.currentLine=215220234;
 //BA.debugLineNum = 215220234;BA.debugLine="Dim right2 As Int = cvs.TargetRect.Centerx*1.9";
_right2 = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*1.9);
RDebugUtils.currentLine=215220236;
 //BA.debugLineNum = 215220236;BA.debugLine="Dim  Width As Int = cvs.TargetView.Width";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetView().getWidth());
RDebugUtils.currentLine=215220237;
 //BA.debugLineNum = 215220237;BA.debugLine="Dim  Height As Int = cvs.TargetView.Height";
_height = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetView().getHeight());
RDebugUtils.currentLine=215220238;
 //BA.debugLineNum = 215220238;BA.debugLine="Dim Prg As Float";
_prg = 0f;
RDebugUtils.currentLine=215220240;
 //BA.debugLineNum = 215220240;BA.debugLine="Rec.Initialize(0,0,Width,Height)";
_rec.Initialize((float) (0),(float) (0),(float) (_width),(float) (_height));
RDebugUtils.currentLine=215220241;
 //BA.debugLineNum = 215220241;BA.debugLine="Dim Path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=215220242;
 //BA.debugLineNum = 215220242;BA.debugLine="Path.InitializeRoundedRect(Rec,5dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=215220243;
 //BA.debugLineNum = 215220243;BA.debugLine="cvs.DrawPath(Path,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220245;
 //BA.debugLineNum = 215220245;BA.debugLine="Rec.Initialize(left,top,right, bottom)";
_rec.Initialize((float) (_left),(float) (_top),(float) (_right),(float) (_bottom));
RDebugUtils.currentLine=215220246;
 //BA.debugLineNum = 215220246;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220247;
 //BA.debugLineNum = 215220247;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220248;
 //BA.debugLineNum = 215220248;BA.debugLine="Rec.Initialize(left2,top,right2,bottom)";
_rec.Initialize((float) (_left2),(float) (_top),(float) (_right2),(float) (_bottom));
RDebugUtils.currentLine=215220249;
 //BA.debugLineNum = 215220249;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220250;
 //BA.debugLineNum = 215220250;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220251;
 //BA.debugLineNum = 215220251;BA.debugLine="Rec.Initialize(left,top2,right,bottom2)";
_rec.Initialize((float) (_left),(float) (_top2),(float) (_right),(float) (_bottom2));
RDebugUtils.currentLine=215220252;
 //BA.debugLineNum = 215220252;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220253;
 //BA.debugLineNum = 215220253;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220254;
 //BA.debugLineNum = 215220254;BA.debugLine="Rec.Initialize(left2,top2,right2,bottom2)";
_rec.Initialize((float) (_left2),(float) (_top2),(float) (_right2),(float) (_bottom2));
RDebugUtils.currentLine=215220255;
 //BA.debugLineNum = 215220255;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220256;
 //BA.debugLineNum = 215220256;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220258;
 //BA.debugLineNum = 215220258;BA.debugLine="If Progress<=0.125 Then";
if (_progress<=0.125) { 
RDebugUtils.currentLine=215220259;
 //BA.debugLineNum = 215220259;BA.debugLine="Rec.Initialize(left,top,right, bottom)";
_rec.Initialize((float) (_left),(float) (_top),(float) (_right),(float) (_bottom));
RDebugUtils.currentLine=215220260;
 //BA.debugLineNum = 215220260;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220261;
 //BA.debugLineNum = 215220261;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220263;
 //BA.debugLineNum = 215220263;BA.debugLine="Prg=Progress*8";
_prg = (float) (_progress*8);
RDebugUtils.currentLine=215220264;
 //BA.debugLineNum = 215220264;BA.debugLine="Rec.Initialize(left,top,right+(right2-right)*Prg";
_rec.Initialize((float) (_left),(float) (_top),(float) (_right+(_right2-_right)*_prg),(float) (_bottom));
 }else 
{RDebugUtils.currentLine=215220265;
 //BA.debugLineNum = 215220265;BA.debugLine="Else If Progress<=0.25 Then";
if (_progress<=0.25) { 
RDebugUtils.currentLine=215220266;
 //BA.debugLineNum = 215220266;BA.debugLine="Rec.Initialize(left,top,right, bottom)";
_rec.Initialize((float) (_left),(float) (_top),(float) (_right),(float) (_bottom));
RDebugUtils.currentLine=215220267;
 //BA.debugLineNum = 215220267;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220268;
 //BA.debugLineNum = 215220268;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220270;
 //BA.debugLineNum = 215220270;BA.debugLine="Prg=(Progress-0.125)*8";
_prg = (float) ((_progress-0.125)*8);
RDebugUtils.currentLine=215220271;
 //BA.debugLineNum = 215220271;BA.debugLine="Rec.Initialize(left2*Prg,top,right2,bottom)";
_rec.Initialize((float) (_left2*_prg),(float) (_top),(float) (_right2),(float) (_bottom));
 }else 
{RDebugUtils.currentLine=215220272;
 //BA.debugLineNum = 215220272;BA.debugLine="Else If Progress<=0.375 Then";
if (_progress<=0.375) { 
RDebugUtils.currentLine=215220273;
 //BA.debugLineNum = 215220273;BA.debugLine="Rec.Initialize(left2,top,right2,bottom)";
_rec.Initialize((float) (_left2),(float) (_top),(float) (_right2),(float) (_bottom));
RDebugUtils.currentLine=215220274;
 //BA.debugLineNum = 215220274;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220275;
 //BA.debugLineNum = 215220275;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220277;
 //BA.debugLineNum = 215220277;BA.debugLine="Prg=(Progress-0.250)*8";
_prg = (float) ((_progress-0.250)*8);
RDebugUtils.currentLine=215220278;
 //BA.debugLineNum = 215220278;BA.debugLine="Rec.Initialize(left2,top,right2,bottom+(bottom2-";
_rec.Initialize((float) (_left2),(float) (_top),(float) (_right2),(float) (_bottom+(_bottom2-_bottom)*_prg));
 }else 
{RDebugUtils.currentLine=215220279;
 //BA.debugLineNum = 215220279;BA.debugLine="Else If Progress<=0.5 Then";
if (_progress<=0.5) { 
RDebugUtils.currentLine=215220280;
 //BA.debugLineNum = 215220280;BA.debugLine="Rec.Initialize(left2,top,right2,bottom)";
_rec.Initialize((float) (_left2),(float) (_top),(float) (_right2),(float) (_bottom));
RDebugUtils.currentLine=215220281;
 //BA.debugLineNum = 215220281;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220282;
 //BA.debugLineNum = 215220282;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220284;
 //BA.debugLineNum = 215220284;BA.debugLine="Prg=(Progress-0.375)*8";
_prg = (float) ((_progress-0.375)*8);
RDebugUtils.currentLine=215220285;
 //BA.debugLineNum = 215220285;BA.debugLine="Rec.Initialize(left2,top2*Prg,right2,bottom2)";
_rec.Initialize((float) (_left2),(float) (_top2*_prg),(float) (_right2),(float) (_bottom2));
 }else 
{RDebugUtils.currentLine=215220286;
 //BA.debugLineNum = 215220286;BA.debugLine="Else If Progress<=0.625 Then";
if (_progress<=0.625) { 
RDebugUtils.currentLine=215220287;
 //BA.debugLineNum = 215220287;BA.debugLine="Rec.Initialize(left2,top2,right2,bottom2)";
_rec.Initialize((float) (_left2),(float) (_top2),(float) (_right2),(float) (_bottom2));
RDebugUtils.currentLine=215220288;
 //BA.debugLineNum = 215220288;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220289;
 //BA.debugLineNum = 215220289;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220291;
 //BA.debugLineNum = 215220291;BA.debugLine="Prg=(Progress-0.500)*8";
_prg = (float) ((_progress-0.500)*8);
RDebugUtils.currentLine=215220292;
 //BA.debugLineNum = 215220292;BA.debugLine="Rec.Initialize(left2+(left-left2)*Prg,top2,right";
_rec.Initialize((float) (_left2+(_left-_left2)*_prg),(float) (_top2),(float) (_right2),(float) (_bottom2));
 }else 
{RDebugUtils.currentLine=215220293;
 //BA.debugLineNum = 215220293;BA.debugLine="Else If Progress<=0.75 Then";
if (_progress<=0.75) { 
RDebugUtils.currentLine=215220294;
 //BA.debugLineNum = 215220294;BA.debugLine="Rec.Initialize(left2,top2,right2,bottom2)";
_rec.Initialize((float) (_left2),(float) (_top2),(float) (_right2),(float) (_bottom2));
RDebugUtils.currentLine=215220295;
 //BA.debugLineNum = 215220295;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220296;
 //BA.debugLineNum = 215220296;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220298;
 //BA.debugLineNum = 215220298;BA.debugLine="Prg=(Progress-0.625)*8";
_prg = (float) ((_progress-0.625)*8);
RDebugUtils.currentLine=215220299;
 //BA.debugLineNum = 215220299;BA.debugLine="Rec.Initialize(left,top2,right2+(right-right2)*P";
_rec.Initialize((float) (_left),(float) (_top2),(float) (_right2+(_right-_right2)*_prg),(float) (_bottom2));
 }else 
{RDebugUtils.currentLine=215220300;
 //BA.debugLineNum = 215220300;BA.debugLine="Else If Progress<=0.875 Then";
if (_progress<=0.875) { 
RDebugUtils.currentLine=215220301;
 //BA.debugLineNum = 215220301;BA.debugLine="Rec.Initialize(left,top2,right,bottom2)";
_rec.Initialize((float) (_left),(float) (_top2),(float) (_right),(float) (_bottom2));
RDebugUtils.currentLine=215220302;
 //BA.debugLineNum = 215220302;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220303;
 //BA.debugLineNum = 215220303;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220305;
 //BA.debugLineNum = 215220305;BA.debugLine="Prg=(Progress-0.750)*8";
_prg = (float) ((_progress-0.750)*8);
RDebugUtils.currentLine=215220306;
 //BA.debugLineNum = 215220306;BA.debugLine="Rec.Initialize(left,top2+(top-top2)*Prg,right,bo";
_rec.Initialize((float) (_left),(float) (_top2+(_top-_top2)*_prg),(float) (_right),(float) (_bottom2));
 }else {
RDebugUtils.currentLine=215220308;
 //BA.debugLineNum = 215220308;BA.debugLine="Rec.Initialize(left,top2,right,bottom2)";
_rec.Initialize((float) (_left),(float) (_top2),(float) (_right),(float) (_bottom2));
RDebugUtils.currentLine=215220309;
 //BA.debugLineNum = 215220309;BA.debugLine="Path.InitializeRoundedRect(Rec,3dip)";
_path.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=215220310;
 //BA.debugLineNum = 215220310;BA.debugLine="cvs.DrawPath(Path ,SetAlpha(clr,200),True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_path,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (200)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220312;
 //BA.debugLineNum = 215220312;BA.debugLine="Prg=(Progress-0.875)*8";
_prg = (float) ((_progress-0.875)*8);
RDebugUtils.currentLine=215220313;
 //BA.debugLineNum = 215220313;BA.debugLine="Rec.Initialize(left,top,right,bottom2+(bottom-bo";
_rec.Initialize((float) (_left),(float) (_top),(float) (_right),(float) (_bottom2+(_bottom-_bottom2)*_prg));
 }}}}}}}
;
RDebugUtils.currentLine=215220316;
 //BA.debugLineNum = 215220316;BA.debugLine="Dim RoundRec As B4XPath";
_roundrec = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=215220317;
 //BA.debugLineNum = 215220317;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,5dip)";
_roundrec.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=215220318;
 //BA.debugLineNum = 215220318;BA.debugLine="cvs.DrawPath(RoundRec,SetAlpha(clr,100),True,1dip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_roundrec,__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (100)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215220319;
 //BA.debugLineNum = 215220319;BA.debugLine="End Sub";
return "";
}
public int  _setalpha(b4j.docU.sd_loadingindicator __ref,int _c,int _alpha) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "setalpha", true))
	 {return ((Integer) Debug.delegate(ba, "setalpha", new Object[] {_c,_alpha}));}
RDebugUtils.currentLine=214237184;
 //BA.debugLineNum = 214237184;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
RDebugUtils.currentLine=214237185;
 //BA.debugLineNum = 214237185;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
if (true) return (int) (__c.Bit.And(((int)0xffffff),_c)+__c.Bit.ShiftLeft(_alpha,(int) (24)));
RDebugUtils.currentLine=214237186;
 //BA.debugLineNum = 214237186;BA.debugLine="End Sub";
return 0;
}
public String  _draw_hearth(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_hearth", true))
	 {return ((String) Debug.delegate(ba, "draw_hearth", new Object[] {_progress}));}
int _x = 0;
int _y = 0;
float _r = 0f;
float _radius = 0f;
int _i = 0;
RDebugUtils.currentLine=215023616;
 //BA.debugLineNum = 215023616;BA.debugLine="Private Sub Draw_Hearth (Progress As Float)";
RDebugUtils.currentLine=215023617;
 //BA.debugLineNum = 215023617;BA.debugLine="Dim X As Int";
_x = 0;
RDebugUtils.currentLine=215023618;
 //BA.debugLineNum = 215023618;BA.debugLine="Dim Y As Int";
_y = 0;
RDebugUtils.currentLine=215023619;
 //BA.debugLineNum = 215023619;BA.debugLine="Dim r As Float = (Min(cvs.TargetRect.Width,cvs.Ta";
_r = (float) ((__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())-__c.DipToCurrent((int) (2)))/(double)40);
RDebugUtils.currentLine=215023620;
 //BA.debugLineNum = 215023620;BA.debugLine="Dim Radius As Float";
_radius = 0f;
RDebugUtils.currentLine=215023622;
 //BA.debugLineNum = 215023622;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215023623;
 //BA.debugLineNum = 215023623;BA.debugLine="Radial=(Radial + cPI * 0.02)";
__ref._radial /*float*/  = (float) ((__ref._radial /*float*/ +__c.cPI*0.02));
RDebugUtils.currentLine=215023624;
 //BA.debugLineNum = 215023624;BA.debugLine="If Radial>2*cPI Then Radial=Radial-(2*cPI)";
if (__ref._radial /*float*/ >2*__c.cPI) { 
__ref._radial /*float*/  = (float) (__ref._radial /*float*/ -(2*__c.cPI));};
RDebugUtils.currentLine=215023626;
 //BA.debugLineNum = 215023626;BA.debugLine="For I=0 To 10";
{
final int step8 = 1;
final int limit8 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=215023627;
 //BA.debugLineNum = 215023627;BA.debugLine="Radius=(Radial*10-i*2.5)/10";
_radius = (float) ((__ref._radial /*float*/ *10-_i*2.5)/(double)10);
RDebugUtils.currentLine=215023628;
 //BA.debugLineNum = 215023628;BA.debugLine="X=cvs.TargetRect.CenterX + (16*Power(Sin(Radius)";
_x = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(16*__c.Power(__c.Sin(_radius),3))*_r);
RDebugUtils.currentLine=215023629;
 //BA.debugLineNum = 215023629;BA.debugLine="Y=cvs.TargetRect.CenterY - (13*Cos(Radius)-5*Cos";
_y = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-(13*__c.Cos(_radius)-5*__c.Cos(2*_radius)-2*__c.Cos(3*_radius)-__c.Cos(4*_radius))*_r);
RDebugUtils.currentLine=215023630;
 //BA.debugLineNum = 215023630;BA.debugLine="cvs.DrawCircle( x,  y, 7dip, SetAlpha(clr,110-(I";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_y),(float) (__c.DipToCurrent((int) (7))),__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (110-(_i*10))),__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=215023633;
 //BA.debugLineNum = 215023633;BA.debugLine="X=cvs.TargetRect.CenterX + (16*Power(Sin(Radial),";
_x = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(16*__c.Power(__c.Sin(__ref._radial /*float*/ ),3))*_r);
RDebugUtils.currentLine=215023634;
 //BA.debugLineNum = 215023634;BA.debugLine="Y=cvs.TargetRect.CenterY - (13*Cos(Radial)-5*Cos(";
_y = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-(13*__c.Cos(__ref._radial /*float*/ )-5*__c.Cos(2*__ref._radial /*float*/ )-2*__c.Cos(3*__ref._radial /*float*/ )-__c.Cos(4*__ref._radial /*float*/ ))*_r);
RDebugUtils.currentLine=215023635;
 //BA.debugLineNum = 215023635;BA.debugLine="cvs.DrawCircle( x,  y, 7dip, clr, True, 1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_y),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=215023636;
 //BA.debugLineNum = 215023636;BA.debugLine="End Sub";
return "";
}
public String  _draw_infinity(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_infinity", true))
	 {return ((String) Debug.delegate(ba, "draw_infinity", new Object[] {_progress}));}
int _x = 0;
int _y = 0;
float _r = 0f;
int _degree = 0;
int _t = 0;
RDebugUtils.currentLine=214958080;
 //BA.debugLineNum = 214958080;BA.debugLine="Private Sub Draw_Infinity (Progress As Float)";
RDebugUtils.currentLine=214958081;
 //BA.debugLineNum = 214958081;BA.debugLine="Dim X As Int";
_x = 0;
RDebugUtils.currentLine=214958082;
 //BA.debugLineNum = 214958082;BA.debugLine="Dim Y As Int";
_y = 0;
RDebugUtils.currentLine=214958083;
 //BA.debugLineNum = 214958083;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2-__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=214958084;
 //BA.debugLineNum = 214958084;BA.debugLine="Dim Degree As Int = (Progress*360)";
_degree = (int) ((_progress*360));
RDebugUtils.currentLine=214958086;
 //BA.debugLineNum = 214958086;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214958087;
 //BA.debugLineNum = 214958087;BA.debugLine="For t=8 To 1 Step -1";
{
final int step6 = -1;
final int limit6 = (int) (1);
_t = (int) (8) ;
for (;_t >= limit6 ;_t = _t + step6 ) {
RDebugUtils.currentLine=214958088;
 //BA.debugLineNum = 214958088;BA.debugLine="Degree=(Progress*360)-t*20";
_degree = (int) ((_progress*360)-_t*20);
RDebugUtils.currentLine=214958089;
 //BA.debugLineNum = 214958089;BA.debugLine="x = (r*CosD(Degree))/(1+Power(SinD(Degree),2))";
_x = (int) ((_r*__c.CosD(_degree))/(double)(1+__c.Power(__c.SinD(_degree),2)));
RDebugUtils.currentLine=214958090;
 //BA.debugLineNum = 214958090;BA.debugLine="y = (r*SinD(Degree)*CosD(Degree))/(1+Power(SinD(";
_y = (int) ((_r*__c.SinD(_degree)*__c.CosD(_degree))/(double)(1+__c.Power(__c.SinD(_degree),2)));
RDebugUtils.currentLine=214958091;
 //BA.debugLineNum = 214958091;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.T";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_x),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_y),(float) (__c.DipToCurrent((int) (7))-_t/(double)2),__ref._setalpha /*int*/ (null,__ref._clr /*int*/ ,(int) (255/(double)(_t))),__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=214958094;
 //BA.debugLineNum = 214958094;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + x, cvs.Ta";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_x),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_y),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214958095;
 //BA.debugLineNum = 214958095;BA.debugLine="End Sub";
return "";
}
public String  _draw_square(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_square", true))
	 {return ((String) Debug.delegate(ba, "draw_square", new Object[] {_progress}));}
RDebugUtils.currentLine=214695936;
 //BA.debugLineNum = 214695936;BA.debugLine="Private Sub Draw_Square (Progress As Float)";
RDebugUtils.currentLine=214695937;
 //BA.debugLineNum = 214695937;BA.debugLine="Square(Progress,False)";
__ref._square /*String*/ (null,_progress,__c.False);
RDebugUtils.currentLine=214695938;
 //BA.debugLineNum = 214695938;BA.debugLine="End Sub";
return "";
}
public String  _square(b4j.docU.sd_loadingindicator __ref,float _progress,boolean _rounded) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "square", true))
	 {return ((String) Debug.delegate(ba, "square", new Object[] {_progress,_rounded}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rec = null;
int _top = 0;
int _left = 0;
int _width = 0;
int _height = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _roundrec = null;
RDebugUtils.currentLine=214827008;
 //BA.debugLineNum = 214827008;BA.debugLine="Private Sub Square (Progress As Float, Rounded As";
RDebugUtils.currentLine=214827009;
 //BA.debugLineNum = 214827009;BA.debugLine="Dim Rec As B4XRect";
_rec = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=214827010;
 //BA.debugLineNum = 214827010;BA.debugLine="Dim top As Int = 5dip";
_top = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=214827011;
 //BA.debugLineNum = 214827011;BA.debugLine="Dim left As Int = 5dip";
_left = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=214827012;
 //BA.debugLineNum = 214827012;BA.debugLine="Dim  Width As Int = cvs.TargetView.Width";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetView().getWidth());
RDebugUtils.currentLine=214827013;
 //BA.debugLineNum = 214827013;BA.debugLine="Dim  Height As Int = cvs.TargetView.Height";
_height = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetView().getHeight());
RDebugUtils.currentLine=214827015;
 //BA.debugLineNum = 214827015;BA.debugLine="Rec.Initialize(0,0,Width,Height)";
_rec.Initialize((float) (0),(float) (0),(float) (_width),(float) (_height));
RDebugUtils.currentLine=214827016;
 //BA.debugLineNum = 214827016;BA.debugLine="Dim RoundRec As B4XPath";
_roundrec = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=214827017;
 //BA.debugLineNum = 214827017;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,5dip)";
_roundrec.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=214827019;
 //BA.debugLineNum = 214827019;BA.debugLine="cvs.DrawPath(RoundRec,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_roundrec,__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214827020;
 //BA.debugLineNum = 214827020;BA.debugLine="Height=Height-top*2";
_height = (int) (_height-_top*2);
RDebugUtils.currentLine=214827021;
 //BA.debugLineNum = 214827021;BA.debugLine="Width=Width-left*2";
_width = (int) (_width-_left*2);
RDebugUtils.currentLine=214827023;
 //BA.debugLineNum = 214827023;BA.debugLine="If Progress<=0.125 Then";
if (_progress<=0.125) { 
RDebugUtils.currentLine=214827024;
 //BA.debugLineNum = 214827024;BA.debugLine="Rec.Initialize(left,top,left+Width*(0.5+Progress";
_rec.Initialize((float) (_left),(float) (_top),(float) (_left+_width*(0.5+_progress*4)),(float) (_top+_height/(double)2));
 }else 
{RDebugUtils.currentLine=214827025;
 //BA.debugLineNum = 214827025;BA.debugLine="Else If Progress<=0.25 Then";
if (_progress<=0.25) { 
RDebugUtils.currentLine=214827026;
 //BA.debugLineNum = 214827026;BA.debugLine="Rec.Initialize(left+Width*(Progress-0.125)*4,top";
_rec.Initialize((float) (_left+_width*(_progress-0.125)*4),(float) (_top),(float) (_left+_width),(float) (_top+_height/(double)2));
 }else 
{RDebugUtils.currentLine=214827027;
 //BA.debugLineNum = 214827027;BA.debugLine="Else If Progress<=0.375 Then";
if (_progress<=0.375) { 
RDebugUtils.currentLine=214827028;
 //BA.debugLineNum = 214827028;BA.debugLine="Rec.Initialize(left+Width/2,top,left+Width,top+H";
_rec.Initialize((float) (_left+_width/(double)2),(float) (_top),(float) (_left+_width),(float) (_top+_height*(_progress-0.125)*4));
 }else 
{RDebugUtils.currentLine=214827029;
 //BA.debugLineNum = 214827029;BA.debugLine="Else If Progress<=0.5 Then";
if (_progress<=0.5) { 
RDebugUtils.currentLine=214827030;
 //BA.debugLineNum = 214827030;BA.debugLine="Rec.Initialize(left+Width/2,top+Height*(Progress";
_rec.Initialize((float) (_left+_width/(double)2),(float) (_top+_height*(_progress-0.375)*4),(float) (_left+_width),(float) (_top+_height));
 }else 
{RDebugUtils.currentLine=214827031;
 //BA.debugLineNum = 214827031;BA.debugLine="Else If Progress<=0.625 Then";
if (_progress<=0.625) { 
RDebugUtils.currentLine=214827032;
 //BA.debugLineNum = 214827032;BA.debugLine="Rec.Initialize(left+Width*(0.625-Progress)*4,top";
_rec.Initialize((float) (_left+_width*(0.625-_progress)*4),(float) (_top+_height/(double)2),(float) (_left+_width),(float) (_top+_height));
 }else 
{RDebugUtils.currentLine=214827033;
 //BA.debugLineNum = 214827033;BA.debugLine="Else If Progress<=0.75 Then";
if (_progress<=0.75) { 
RDebugUtils.currentLine=214827034;
 //BA.debugLineNum = 214827034;BA.debugLine="Rec.Initialize(left,top+Height/2,left+Width*(0.8";
_rec.Initialize((float) (_left),(float) (_top+_height/(double)2),(float) (_left+_width*(0.875-_progress)*4),(float) (_top+_height));
 }else 
{RDebugUtils.currentLine=214827035;
 //BA.debugLineNum = 214827035;BA.debugLine="Else If Progress<=0.875 Then";
if (_progress<=0.875) { 
RDebugUtils.currentLine=214827036;
 //BA.debugLineNum = 214827036;BA.debugLine="Rec.Initialize(left,top+Height*(0.875-Progress)*";
_rec.Initialize((float) (_left),(float) (_top+_height*(0.875-_progress)*4),(float) (_left+_width/(double)2),(float) (_top+_height));
 }else {
RDebugUtils.currentLine=214827038;
 //BA.debugLineNum = 214827038;BA.debugLine="Rec.Initialize(left,top,left+Width/2,top+Height*";
_rec.Initialize((float) (_left),(float) (_top),(float) (_left+_width/(double)2),(float) (_top+_height*(1.125-_progress)*4));
 }}}}}}}
;
RDebugUtils.currentLine=214827041;
 //BA.debugLineNum = 214827041;BA.debugLine="Dim RoundRec As B4XPath";
_roundrec = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=214827042;
 //BA.debugLineNum = 214827042;BA.debugLine="If Rounded Then";
if (_rounded) { 
RDebugUtils.currentLine=214827043;
 //BA.debugLineNum = 214827043;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,Min(Width,Hei";
_roundrec.InitializeRoundedRect(_rec,(float) (__c.Min(_width,_height)/(double)2));
 }else {
RDebugUtils.currentLine=214827045;
 //BA.debugLineNum = 214827045;BA.debugLine="RoundRec.InitializeRoundedRect(Rec,5dip)";
_roundrec.InitializeRoundedRect(_rec,(float) (__c.DipToCurrent((int) (5))));
 };
RDebugUtils.currentLine=214827048;
 //BA.debugLineNum = 214827048;BA.debugLine="cvs.DrawPath(RoundRec,clr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_roundrec,__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214827049;
 //BA.debugLineNum = 214827049;BA.debugLine="End Sub";
return "";
}
public String  _draw_squarerounded(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_squarerounded", true))
	 {return ((String) Debug.delegate(ba, "draw_squarerounded", new Object[] {_progress}));}
RDebugUtils.currentLine=214761472;
 //BA.debugLineNum = 214761472;BA.debugLine="Private Sub Draw_SquareRounded (Progress As Float)";
RDebugUtils.currentLine=214761473;
 //BA.debugLineNum = 214761473;BA.debugLine="Square(Progress,True)";
__ref._square /*String*/ (null,_progress,__c.True);
RDebugUtils.currentLine=214761474;
 //BA.debugLineNum = 214761474;BA.debugLine="End Sub";
return "";
}
public String  _draw_tencircles(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_tencircles", true))
	 {return ((String) Debug.delegate(ba, "draw_tencircles", new Object[] {_progress}));}
float _r = 0f;
boolean _b = false;
int _i = 0;
float _alpha = 0f;
RDebugUtils.currentLine=214368256;
 //BA.debugLineNum = 214368256;BA.debugLine="Private Sub Draw_TenCircles (Progress As Float)";
RDebugUtils.currentLine=214368257;
 //BA.debugLineNum = 214368257;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2-__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=214368258;
 //BA.debugLineNum = 214368258;BA.debugLine="Dim B As Boolean = False";
_b = __c.False;
RDebugUtils.currentLine=214368260;
 //BA.debugLineNum = 214368260;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214368261;
 //BA.debugLineNum = 214368261;BA.debugLine="For i=0 To 9";
{
final int step4 = 1;
final int limit4 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=214368263;
 //BA.debugLineNum = 214368263;BA.debugLine="Dim Alpha As Float = i*36";
_alpha = (float) (_i*36);
RDebugUtils.currentLine=214368265;
 //BA.debugLineNum = 214368265;BA.debugLine="If Alpha>Progress*360 And B=False Then";
if (_alpha>_progress*360 && _b==__c.False) { 
RDebugUtils.currentLine=214368266;
 //BA.debugLineNum = 214368266;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD((_i-1)*36)),(float) (__c.DipToCurrent((int) (7))),__c.Bit.And(__ref._clr /*int*/ ,((int)0xaaffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214368267;
 //BA.debugLineNum = 214368267;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (8))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214368268;
 //BA.debugLineNum = 214368268;BA.debugLine="B=True";
_b = __c.True;
 }else {
RDebugUtils.currentLine=214368270;
 //BA.debugLineNum = 214368270;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__c.Bit.And(__ref._clr /*int*/ ,((int)0x55ffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 }
};
RDebugUtils.currentLine=214368273;
 //BA.debugLineNum = 214368273;BA.debugLine="End Sub";
return "";
}
public String  _draw_tenlines(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_tenlines", true))
	 {return ((String) Debug.delegate(ba, "draw_tenlines", new Object[] {_progress}));}
float _r = 0f;
boolean _b = false;
int _spess = 0;
int _i = 0;
float _alpha = 0f;
RDebugUtils.currentLine=214433792;
 //BA.debugLineNum = 214433792;BA.debugLine="Private Sub Draw_TenLines (Progress As Float)";
RDebugUtils.currentLine=214433793;
 //BA.debugLineNum = 214433793;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2);
RDebugUtils.currentLine=214433794;
 //BA.debugLineNum = 214433794;BA.debugLine="Dim B As Boolean = False";
_b = __c.False;
RDebugUtils.currentLine=214433795;
 //BA.debugLineNum = 214433795;BA.debugLine="Dim Spess As Int = 6dip";
_spess = __c.DipToCurrent((int) (6));
RDebugUtils.currentLine=214433797;
 //BA.debugLineNum = 214433797;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214433798;
 //BA.debugLineNum = 214433798;BA.debugLine="For i=0 To 9";
{
final int step5 = 1;
final int limit5 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=214433800;
 //BA.debugLineNum = 214433800;BA.debugLine="Dim Alpha As Float = i*36";
_alpha = (float) (_i*36);
RDebugUtils.currentLine=214433802;
 //BA.debugLineNum = 214433802;BA.debugLine="If Alpha>Progress*360 And B=False Then";
if (_alpha>_progress*360 && _b==__c.False) { 
RDebugUtils.currentLine=214433803;
 //BA.debugLineNum = 214433803;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * SinD(";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r/(double)2)*__c.SinD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r/(double)2)*__c.CosD((_i-1)*36)),__c.Bit.And(__ref._clr /*int*/ ,((int)0xaaffffff)),(float) (_spess));
RDebugUtils.currentLine=214433804;
 //BA.debugLineNum = 214433804;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * SinD(";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r/(double)2)*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r/(double)2)*__c.CosD(_alpha)),__ref._clr /*int*/ ,(float) (_spess));
RDebugUtils.currentLine=214433805;
 //BA.debugLineNum = 214433805;BA.debugLine="B=True";
_b = __c.True;
 }else {
RDebugUtils.currentLine=214433807;
 //BA.debugLineNum = 214433807;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * SinD(";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r/(double)2)*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r/(double)2)*__c.CosD(_alpha)),__c.Bit.And(__ref._clr /*int*/ ,((int)0x55ffffff)),(float) (_spess));
 };
 }
};
RDebugUtils.currentLine=214433810;
 //BA.debugLineNum = 214433810;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles(b4j.docU.sd_loadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles", new Object[] {_progress}));}
float _maxr = 0f;
float _r = 0f;
int _i = 0;
int _alpha = 0;
RDebugUtils.currentLine=214302720;
 //BA.debugLineNum = 214302720;BA.debugLine="Private Sub Draw_ThreeCircles (Progress As Float)";
RDebugUtils.currentLine=214302721;
 //BA.debugLineNum = 214302721;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (20)))/(double)2);
RDebugUtils.currentLine=214302722;
 //BA.debugLineNum = 214302722;BA.debugLine="Dim r As Float = 15dip + MaxR + MaxR * Sin(Progre";
_r = (float) (__c.DipToCurrent((int) (15))+_maxr+_maxr*__c.Sin(_progress*1*__c.cPI));
RDebugUtils.currentLine=214302724;
 //BA.debugLineNum = 214302724;BA.debugLine="cvs.DrawRect(cvs.TargetRect,bgclr,True,1dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._bgclr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214302725;
 //BA.debugLineNum = 214302725;BA.debugLine="For i = 0 To 2";
{
final int step4 = 1;
final int limit4 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=214302726;
 //BA.debugLineNum = 214302726;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
RDebugUtils.currentLine=214302727;
 //BA.debugLineNum = 214302727;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=214302729;
 //BA.debugLineNum = 214302729;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (__c.DipToCurrent((int) (7))),__ref._clr /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214302730;
 //BA.debugLineNum = 214302730;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,__ref._clr /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=214302731;
 //BA.debugLineNum = 214302731;BA.debugLine="End Sub";
return "";
}
public int  _getheight(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "getheight", true))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=215547904;
 //BA.debugLineNum = 215547904;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=215547905;
 //BA.debugLineNum = 215547905;BA.debugLine="Return mBase.Width";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=215547906;
 //BA.debugLineNum = 215547906;BA.debugLine="End Sub";
return 0;
}
public int  _getleft(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "getleft", true))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=215482368;
 //BA.debugLineNum = 215482368;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=215482369;
 //BA.debugLineNum = 215482369;BA.debugLine="Return mBase.Left";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=215482370;
 //BA.debugLineNum = 215482370;BA.debugLine="End Sub";
return 0;
}
public int  _gettop(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "gettop", true))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=215941120;
 //BA.debugLineNum = 215941120;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=215941121;
 //BA.debugLineNum = 215941121;BA.debugLine="Return mBase.Width";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=215941122;
 //BA.debugLineNum = 215941122;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "getvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=216072192;
 //BA.debugLineNum = 216072192;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=216072193;
 //BA.debugLineNum = 216072193;BA.debugLine="Return mBase.Visible";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
RDebugUtils.currentLine=216072194;
 //BA.debugLineNum = 216072194;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "getwidth", true))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=216203264;
 //BA.debugLineNum = 216203264;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=216203265;
 //BA.debugLineNum = 216203265;BA.debugLine="Return mBase.Width";
if (true) return (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=216203266;
 //BA.debugLineNum = 216203266;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.docU.sd_loadingindicator __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=213843968;
 //BA.debugLineNum = 213843968;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=213843969;
 //BA.debugLineNum = 213843969;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=213843970;
 //BA.debugLineNum = 213843970;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=213843971;
 //BA.debugLineNum = 213843971;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4j.docU.sd_loadingindicator __ref,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_b}));}
RDebugUtils.currentLine=215351296;
 //BA.debugLineNum = 215351296;BA.debugLine="Public Sub setHeight(B As Int)";
RDebugUtils.currentLine=215351297;
 //BA.debugLineNum = 215351297;BA.debugLine="mBase.Height=B";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_b);
RDebugUtils.currentLine=215351298;
 //BA.debugLineNum = 215351298;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4j.docU.sd_loadingindicator __ref,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "setleft", true))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_b}));}
RDebugUtils.currentLine=215416832;
 //BA.debugLineNum = 215416832;BA.debugLine="Public Sub setLeft(B As Int)";
RDebugUtils.currentLine=215416833;
 //BA.debugLineNum = 215416833;BA.debugLine="mBase.Left=B";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_b);
RDebugUtils.currentLine=215416834;
 //BA.debugLineNum = 215416834;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4j.docU.sd_loadingindicator __ref,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "settop", true))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_b}));}
RDebugUtils.currentLine=215875584;
 //BA.debugLineNum = 215875584;BA.debugLine="Public Sub setTop(B As Int)";
RDebugUtils.currentLine=215875585;
 //BA.debugLineNum = 215875585;BA.debugLine="mBase.Top=B";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(_b);
RDebugUtils.currentLine=215875586;
 //BA.debugLineNum = 215875586;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4j.docU.sd_loadingindicator __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=216006656;
 //BA.debugLineNum = 216006656;BA.debugLine="Public Sub setVisible(B As Boolean)";
RDebugUtils.currentLine=216006657;
 //BA.debugLineNum = 216006657;BA.debugLine="mBase.Visible=B";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_b);
RDebugUtils.currentLine=216006658;
 //BA.debugLineNum = 216006658;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4j.docU.sd_loadingindicator __ref,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_b}));}
RDebugUtils.currentLine=216137728;
 //BA.debugLineNum = 216137728;BA.debugLine="Public Sub setWidth(B As Int)";
RDebugUtils.currentLine=216137729;
 //BA.debugLineNum = 216137729;BA.debugLine="mBase.Width=B";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_b);
RDebugUtils.currentLine=216137730;
 //BA.debugLineNum = 216137730;BA.debugLine="End Sub";
return "";
}
public String  _removeviewfromparent(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "removeviewfromparent", true))
	 {return ((String) Debug.delegate(ba, "removeviewfromparent", null));}
RDebugUtils.currentLine=215613440;
 //BA.debugLineNum = 215613440;BA.debugLine="Public Sub RemoveViewFromParent";
RDebugUtils.currentLine=215613441;
 //BA.debugLineNum = 215613441;BA.debugLine="mBase.RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=215613442;
 //BA.debugLineNum = 215613442;BA.debugLine="End Sub";
return "";
}
public String  _requestfocus(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "requestfocus", true))
	 {return ((String) Debug.delegate(ba, "requestfocus", null));}
RDebugUtils.currentLine=215678976;
 //BA.debugLineNum = 215678976;BA.debugLine="Public Sub RequestFocus";
RDebugUtils.currentLine=215678977;
 //BA.debugLineNum = 215678977;BA.debugLine="mBase.RequestFocus";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RequestFocus();
RDebugUtils.currentLine=215678978;
 //BA.debugLineNum = 215678978;BA.debugLine="End Sub";
return "";
}
public String  _sendtoback(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "sendtoback", true))
	 {return ((String) Debug.delegate(ba, "sendtoback", null));}
RDebugUtils.currentLine=215744512;
 //BA.debugLineNum = 215744512;BA.debugLine="Public Sub SendToBack";
RDebugUtils.currentLine=215744513;
 //BA.debugLineNum = 215744513;BA.debugLine="mBase.SendToBack";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SendToBack();
RDebugUtils.currentLine=215744514;
 //BA.debugLineNum = 215744514;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _snapshot(b4j.docU.sd_loadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_loadingindicator";
if (Debug.shouldDelegate(ba, "snapshot", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "snapshot", null));}
RDebugUtils.currentLine=215810048;
 //BA.debugLineNum = 215810048;BA.debugLine="Public Sub Snapshot As B4XView";
RDebugUtils.currentLine=215810049;
 //BA.debugLineNum = 215810049;BA.debugLine="Return mBase.Snapshot";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .Snapshot().getObject()));
RDebugUtils.currentLine=215810050;
 //BA.debugLineNum = 215810050;BA.debugLine="End Sub";
return null;
}
}