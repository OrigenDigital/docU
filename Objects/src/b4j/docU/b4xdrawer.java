package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xdrawer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xdrawer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xdrawer.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _msidewidth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mleftpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mdarkpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbasepanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mcenterpanel = null;
public int _extrawidth = 0;
public float _touchxstart = 0f;
public float _touchystart = 0f;
public boolean _isopen = false;
public boolean _handlingswipe = false;
public boolean _startatscrim = false;
public boolean _menabled = false;
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
public String  _setleftopen(b4j.docU.b4xdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "setleftopen", true))
	 {return ((String) Debug.delegate(ba, "setleftopen", new Object[] {_b}));}
float _x = 0f;
RDebugUtils.currentLine=110755840;
 //BA.debugLineNum = 110755840;BA.debugLine="Public Sub setLeftOpen (b As Boolean)";
RDebugUtils.currentLine=110755841;
 //BA.debugLineNum = 110755841;BA.debugLine="If b = IsOpen Then Return";
if (_b==__ref._isopen /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=110755842;
 //BA.debugLineNum = 110755842;BA.debugLine="Dim x As Float";
_x = 0f;
RDebugUtils.currentLine=110755843;
 //BA.debugLineNum = 110755843;BA.debugLine="If b Then x = 0 Else x = -mSideWidth";
if (_b) { 
_x = (float) (0);}
else {
_x = (float) (-__ref._msidewidth /*int*/ );};
RDebugUtils.currentLine=110755844;
 //BA.debugLineNum = 110755844;BA.debugLine="ChangeOffset(x, False, False)";
__ref._changeoffset /*String*/ (null,_x,__c.False,__c.False);
RDebugUtils.currentLine=110755845;
 //BA.debugLineNum = 110755845;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.b4xdrawer __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _sidewidth) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_parent,_sidewidth}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=110297088;
 //BA.debugLineNum = 110297088;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=110297089;
 //BA.debugLineNum = 110297089;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=110297090;
 //BA.debugLineNum = 110297090;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=110297091;
 //BA.debugLineNum = 110297091;BA.debugLine="mSideWidth = SideWidth";
__ref._msidewidth /*int*/  = _sidewidth;
RDebugUtils.currentLine=110297101;
 //BA.debugLineNum = 110297101;BA.debugLine="mBasePanel = xui.CreatePanel(\"\")";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=110297103;
 //BA.debugLineNum = 110297103;BA.debugLine="Parent.AddView(mBasePanel, 0, 0, Parent.Width, Pa";
_parent.AddView((javafx.scene.Node)(__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=110297104;
 //BA.debugLineNum = 110297104;BA.debugLine="mCenterPanel = xui.CreatePanel(\"\")";
__ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=110297105;
 //BA.debugLineNum = 110297105;BA.debugLine="mBasePanel.AddView(mCenterPanel, 0, 0, mBasePanel";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=110297106;
 //BA.debugLineNum = 110297106;BA.debugLine="mDarkPanel = xui.CreatePanel(\"dark\")";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"dark");
RDebugUtils.currentLine=110297107;
 //BA.debugLineNum = 110297107;BA.debugLine="mBasePanel.AddView(mDarkPanel, 0, 0, mBasePanel.W";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=110297108;
 //BA.debugLineNum = 110297108;BA.debugLine="mLeftPanel = xui.CreatePanel(\"LeftPanel\")";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"LeftPanel");
RDebugUtils.currentLine=110297109;
 //BA.debugLineNum = 110297109;BA.debugLine="mBasePanel.AddView(mLeftPanel, -SideWidth, 0, Sid";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),-_sidewidth,0,_sidewidth,__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=110297110;
 //BA.debugLineNum = 110297110;BA.debugLine="mLeftPanel.Color = xui.Color_Red";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=110297124;
 //BA.debugLineNum = 110297124;BA.debugLine="Private jo = mDarkPanel As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=110297125;
 //BA.debugLineNum = 110297125;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=110297127;
 //BA.debugLineNum = 110297127;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getcenterpanel(b4j.docU.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getcenterpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getcenterpanel", null));}
RDebugUtils.currentLine=110886912;
 //BA.debugLineNum = 110886912;BA.debugLine="Public Sub getCenterPanel As B4XView";
RDebugUtils.currentLine=110886913;
 //BA.debugLineNum = 110886913;BA.debugLine="Return mCenterPanel";
if (true) return __ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=110886914;
 //BA.debugLineNum = 110886914;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getleftpanel(b4j.docU.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getleftpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getleftpanel", null));}
RDebugUtils.currentLine=110821376;
 //BA.debugLineNum = 110821376;BA.debugLine="Public Sub getLeftPanel As B4XView";
RDebugUtils.currentLine=110821377;
 //BA.debugLineNum = 110821377;BA.debugLine="Return mLeftPanel";
if (true) return __ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=110821378;
 //BA.debugLineNum = 110821378;BA.debugLine="End Sub";
return null;
}
public String  _changeoffset(b4j.docU.b4xdrawer __ref,float _x,boolean _currentlytouching,boolean _noanimation) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "changeoffset", true))
	 {return ((String) Debug.delegate(ba, "changeoffset", new Object[] {_x,_currentlytouching,_noanimation}));}
int _visibleoffset = 0;
int _dx = 0;
int _duration = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=110493696;
 //BA.debugLineNum = 110493696;BA.debugLine="Private Sub ChangeOffset (x As Float, CurrentlyTou";
RDebugUtils.currentLine=110493697;
 //BA.debugLineNum = 110493697;BA.debugLine="x = Max(-mSideWidth, Min(0, x))";
_x = (float) (__c.Max(-__ref._msidewidth /*int*/ ,__c.Min(0,_x)));
RDebugUtils.currentLine=110493698;
 //BA.debugLineNum = 110493698;BA.debugLine="Dim VisibleOffset As Int = mSideWidth + x";
_visibleoffset = (int) (__ref._msidewidth /*int*/ +_x);
RDebugUtils.currentLine=110493707;
 //BA.debugLineNum = 110493707;BA.debugLine="If CurrentlyTouching = False Then";
if (_currentlytouching==__c.False) { 
RDebugUtils.currentLine=110493708;
 //BA.debugLineNum = 110493708;BA.debugLine="If (IsOpen And VisibleOffset < 0.8 * mSideWidth)";
if ((__ref._isopen /*boolean*/  && _visibleoffset<0.8*__ref._msidewidth /*int*/ ) || (__ref._isopen /*boolean*/ ==__c.False && _visibleoffset<0.2*__ref._msidewidth /*int*/ )) { 
RDebugUtils.currentLine=110493709;
 //BA.debugLineNum = 110493709;BA.debugLine="x = -mSideWidth";
_x = (float) (-__ref._msidewidth /*int*/ );
RDebugUtils.currentLine=110493710;
 //BA.debugLineNum = 110493710;BA.debugLine="SetIsOpen(False)";
__ref._setisopen /*String*/ (null,__c.False);
 }else {
RDebugUtils.currentLine=110493712;
 //BA.debugLineNum = 110493712;BA.debugLine="x = 0";
_x = (float) (0);
RDebugUtils.currentLine=110493713;
 //BA.debugLineNum = 110493713;BA.debugLine="SetIsOpen(True)";
__ref._setisopen /*String*/ (null,__c.True);
 };
RDebugUtils.currentLine=110493715;
 //BA.debugLineNum = 110493715;BA.debugLine="Dim dx As Int = Abs(mLeftPanel.Left - x)";
_dx = (int) (__c.Abs(__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()-_x));
RDebugUtils.currentLine=110493716;
 //BA.debugLineNum = 110493716;BA.debugLine="Dim duration As Int = Max(0, 200 * dx / mSideWid";
_duration = (int) (__c.Max(0,200*_dx/(double)__ref._msidewidth /*int*/ ));
RDebugUtils.currentLine=110493717;
 //BA.debugLineNum = 110493717;BA.debugLine="If NoAnimation Then duration = 0";
if (_noanimation) { 
_duration = (int) (0);};
RDebugUtils.currentLine=110493718;
 //BA.debugLineNum = 110493718;BA.debugLine="mLeftPanel.SetLayoutAnimated(duration, x, 0, mLe";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(_duration,_x,0,__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=110493719;
 //BA.debugLineNum = 110493719;BA.debugLine="mDarkPanel.SetColorAnimated(duration, mDarkPanel";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAnimated(_duration,__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor(),__ref._offsettocolor /*int*/ (null,(int) (_x)));
RDebugUtils.currentLine=110493725;
 //BA.debugLineNum = 110493725;BA.debugLine="Private jo = mDarkPanel As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=110493726;
 //BA.debugLineNum = 110493726;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(Not(Is";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.Not(__ref._isopen /*boolean*/ ))});
 }else {
RDebugUtils.currentLine=110493729;
 //BA.debugLineNum = 110493729;BA.debugLine="mDarkPanel.Color = OffsetToColor(x)";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._offsettocolor /*int*/ (null,(int) (_x)));
RDebugUtils.currentLine=110493730;
 //BA.debugLineNum = 110493730;BA.debugLine="mLeftPanel.Left = x";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_x);
 };
RDebugUtils.currentLine=110493732;
 //BA.debugLineNum = 110493732;BA.debugLine="End Sub";
return "";
}
public String  _setisopen(b4j.docU.b4xdrawer __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "setisopen", true))
	 {return ((String) Debug.delegate(ba, "setisopen", new Object[] {_newstate}));}
RDebugUtils.currentLine=110559232;
 //BA.debugLineNum = 110559232;BA.debugLine="Private Sub SetIsOpen (NewState As Boolean)";
RDebugUtils.currentLine=110559233;
 //BA.debugLineNum = 110559233;BA.debugLine="If IsOpen = NewState Then Return";
if (__ref._isopen /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=110559234;
 //BA.debugLineNum = 110559234;BA.debugLine="IsOpen = NewState";
__ref._isopen /*boolean*/  = _newstate;
RDebugUtils.currentLine=110559235;
 //BA.debugLineNum = 110559235;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_StateC";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StateChanged",(int) (1))) { 
RDebugUtils.currentLine=110559236;
 //BA.debugLineNum = 110559236;BA.debugLine="CallSubDelayed2(mCallBack,  mEventName & \"_State";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_StateChanged",(Object)(__ref._isopen /*boolean*/ ));
 };
RDebugUtils.currentLine=110559238;
 //BA.debugLineNum = 110559238;BA.debugLine="End Sub";
return "";
}
public int  _offsettocolor(b4j.docU.b4xdrawer __ref,int _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "offsettocolor", true))
	 {return ((Integer) Debug.delegate(ba, "offsettocolor", new Object[] {_x}));}
float _visible = 0f;
RDebugUtils.currentLine=110624768;
 //BA.debugLineNum = 110624768;BA.debugLine="Private Sub OffsetToColor (x As Int) As Int";
RDebugUtils.currentLine=110624769;
 //BA.debugLineNum = 110624769;BA.debugLine="Dim Visible As Float = (mSideWidth + x) / mSideWi";
_visible = (float) ((__ref._msidewidth /*int*/ +_x)/(double)__ref._msidewidth /*int*/ );
RDebugUtils.currentLine=110624770;
 //BA.debugLineNum = 110624770;BA.debugLine="Return xui.Color_ARGB(100 * Visible, 0, 0, 0)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100*_visible),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=110624771;
 //BA.debugLineNum = 110624771;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.docU.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
RDebugUtils.currentLine=110231552;
 //BA.debugLineNum = 110231552;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=110231553;
 //BA.debugLineNum = 110231553;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=110231554;
 //BA.debugLineNum = 110231554;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=110231555;
 //BA.debugLineNum = 110231555;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=110231556;
 //BA.debugLineNum = 110231556;BA.debugLine="Private mSideWidth As Int";
_msidewidth = 0;
RDebugUtils.currentLine=110231557;
 //BA.debugLineNum = 110231557;BA.debugLine="Private mLeftPanel As B4XView";
_mleftpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=110231558;
 //BA.debugLineNum = 110231558;BA.debugLine="Private mDarkPanel As B4XView";
_mdarkpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=110231559;
 //BA.debugLineNum = 110231559;BA.debugLine="Private mBasePanel As B4XView";
_mbasepanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=110231560;
 //BA.debugLineNum = 110231560;BA.debugLine="Private mCenterPanel As B4XView";
_mcenterpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=110231561;
 //BA.debugLineNum = 110231561;BA.debugLine="Public ExtraWidth As Int = 50dip";
_extrawidth = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=110231562;
 //BA.debugLineNum = 110231562;BA.debugLine="Private TouchXStart, TouchYStart As Float 'ignore";
_touchxstart = 0f;
_touchystart = 0f;
RDebugUtils.currentLine=110231563;
 //BA.debugLineNum = 110231563;BA.debugLine="Private IsOpen As Boolean";
_isopen = false;
RDebugUtils.currentLine=110231564;
 //BA.debugLineNum = 110231564;BA.debugLine="Private HandlingSwipe As Boolean";
_handlingswipe = false;
RDebugUtils.currentLine=110231565;
 //BA.debugLineNum = 110231565;BA.debugLine="Private StartAtScrim As Boolean 'ignore";
_startatscrim = false;
RDebugUtils.currentLine=110231566;
 //BA.debugLineNum = 110231566;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=110231567;
 //BA.debugLineNum = 110231567;BA.debugLine="End Sub";
return "";
}
public String  _dark_touch(b4j.docU.b4xdrawer __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "dark_touch", true))
	 {return ((String) Debug.delegate(ba, "dark_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=110428160;
 //BA.debugLineNum = 110428160;BA.debugLine="Private Sub Dark_Touch(Action As Int, X As Float,";
RDebugUtils.currentLine=110428161;
 //BA.debugLineNum = 110428161;BA.debugLine="If HandlingSwipe = False And Action = mDarkPanel.";
if (__ref._handlingswipe /*boolean*/ ==__c.False && _action==__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=110428162;
 //BA.debugLineNum = 110428162;BA.debugLine="setLeftOpen(False)";
__ref._setleftopen /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=110428164;
 //BA.debugLineNum = 110428164;BA.debugLine="End Sub";
return "";
}
public boolean  _getgestureenabled(b4j.docU.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getgestureenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getgestureenabled", null));}
RDebugUtils.currentLine=111017984;
 //BA.debugLineNum = 111017984;BA.debugLine="Public Sub getGestureEnabled As Boolean";
RDebugUtils.currentLine=111017985;
 //BA.debugLineNum = 111017985;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=111017986;
 //BA.debugLineNum = 111017986;BA.debugLine="End Sub";
return false;
}
public boolean  _getleftopen(b4j.docU.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "getleftopen", true))
	 {return ((Boolean) Debug.delegate(ba, "getleftopen", null));}
RDebugUtils.currentLine=110690304;
 //BA.debugLineNum = 110690304;BA.debugLine="Public Sub getLeftOpen As Boolean";
RDebugUtils.currentLine=110690305;
 //BA.debugLineNum = 110690305;BA.debugLine="Return IsOpen";
if (true) return __ref._isopen /*boolean*/ ;
RDebugUtils.currentLine=110690306;
 //BA.debugLineNum = 110690306;BA.debugLine="End Sub";
return false;
}
public String  _leftpanel_click(b4j.docU.b4xdrawer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "leftpanel_click", true))
	 {return ((String) Debug.delegate(ba, "leftpanel_click", null));}
RDebugUtils.currentLine=110362624;
 //BA.debugLineNum = 110362624;BA.debugLine="Private Sub LeftPanel_Click";
RDebugUtils.currentLine=110362626;
 //BA.debugLineNum = 110362626;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.docU.b4xdrawer __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=110952448;
 //BA.debugLineNum = 110952448;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=110952449;
 //BA.debugLineNum = 110952449;BA.debugLine="If IsOpen Then ChangeOffset(-mSideWidth, False, T";
if (__ref._isopen /*boolean*/ ) { 
__ref._changeoffset /*String*/ (null,(float) (-__ref._msidewidth /*int*/ ),__c.False,__c.True);};
RDebugUtils.currentLine=110952450;
 //BA.debugLineNum = 110952450;BA.debugLine="mBasePanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=110952451;
 //BA.debugLineNum = 110952451;BA.debugLine="mLeftPanel.SetLayoutAnimated(0, mLeftPanel.Left,";
__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),0,__ref._mleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbasepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=110952452;
 //BA.debugLineNum = 110952452;BA.debugLine="mDarkPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._mdarkpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=110952453;
 //BA.debugLineNum = 110952453;BA.debugLine="mCenterPanel.SetLayoutAnimated(0, 0, 0, Width, He";
__ref._mcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=110952454;
 //BA.debugLineNum = 110952454;BA.debugLine="End Sub";
return "";
}
public String  _setgestureenabled(b4j.docU.b4xdrawer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdrawer";
if (Debug.shouldDelegate(ba, "setgestureenabled", true))
	 {return ((String) Debug.delegate(ba, "setgestureenabled", new Object[] {_b}));}
RDebugUtils.currentLine=111083520;
 //BA.debugLineNum = 111083520;BA.debugLine="Public Sub setGestureEnabled (b As Boolean)";
RDebugUtils.currentLine=111083521;
 //BA.debugLineNum = 111083521;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=111083522;
 //BA.debugLineNum = 111083522;BA.debugLine="End Sub";
return "";
}
}