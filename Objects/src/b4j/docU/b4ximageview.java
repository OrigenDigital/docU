package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4ximageview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4ximageview.class).invoke(this, new Object[] {null});
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
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
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
public String  _base_resize(b4j.docU.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=239075328;
 //BA.debugLineNum = 239075328;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=239075329;
 //BA.debugLineNum = 239075329;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=239075330;
 //BA.debugLineNum = 239075330;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=239534080;
 //BA.debugLineNum = 239534080;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=239534081;
 //BA.debugLineNum = 239534081;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=239534082;
 //BA.debugLineNum = 239534082;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=239534083;
 //BA.debugLineNum = 239534083;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=239534084;
 //BA.debugLineNum = 239534084;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=239534085;
 //BA.debugLineNum = 239534085;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=239534087;
 //BA.debugLineNum = 239534087;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=239534088;
 //BA.debugLineNum = 239534088;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=239534090;
 //BA.debugLineNum = 239534090;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=239534091;
 //BA.debugLineNum = 239534091;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=239534092;
 //BA.debugLineNum = 239534092;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=239534094;
 //BA.debugLineNum = 239534094;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=239534095;
 //BA.debugLineNum = 239534095;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=239534097;
 //BA.debugLineNum = 239534097;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=239534098;
 //BA.debugLineNum = 239534098;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=239534100;
 //BA.debugLineNum = 239534100;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=239534101;
 //BA.debugLineNum = 239534101;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=239534102;
 //BA.debugLineNum = 239534102;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=239534104;
 //BA.debugLineNum = 239534104;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=239534105;
 //BA.debugLineNum = 239534105;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=239534107;
 //BA.debugLineNum = 239534107;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("9239534107","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=239534109;
 //BA.debugLineNum = 239534109;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2),__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2),__c.Round(_imageviewwidth),__c.Round(_imageviewheight));
RDebugUtils.currentLine=239534110;
 //BA.debugLineNum = 239534110;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=238878720;
 //BA.debugLineNum = 238878720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=238878721;
 //BA.debugLineNum = 238878721;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=238878722;
 //BA.debugLineNum = 238878722;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=238878723;
 //BA.debugLineNum = 238878723;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=238878724;
 //BA.debugLineNum = 238878724;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=238878725;
 //BA.debugLineNum = 238878725;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=238878726;
 //BA.debugLineNum = 238878726;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=238878727;
 //BA.debugLineNum = 238878727;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=238878728;
 //BA.debugLineNum = 238878728;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=238878729;
 //BA.debugLineNum = 238878729;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=238878730;
 //BA.debugLineNum = 238878730;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=238878731;
 //BA.debugLineNum = 238878731;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
RDebugUtils.currentLine=238878732;
 //BA.debugLineNum = 238878732;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=239665152;
 //BA.debugLineNum = 239665152;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=239665153;
 //BA.debugLineNum = 239665153;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=239665154;
 //BA.debugLineNum = 239665154;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=239665155;
 //BA.debugLineNum = 239665155;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.b4ximageview __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=239009792;
 //BA.debugLineNum = 239009792;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=239009793;
 //BA.debugLineNum = 239009793;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=239009794;
 //BA.debugLineNum = 239009794;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=239009795;
 //BA.debugLineNum = 239009795;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=239009796;
 //BA.debugLineNum = 239009796;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=239009797;
 //BA.debugLineNum = 239009797;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=239009798;
 //BA.debugLineNum = 239009798;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=239009799;
 //BA.debugLineNum = 239009799;BA.debugLine="mRound =Props.Get(\"Round\")";
__ref._mround /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Round")));
RDebugUtils.currentLine=239009800;
 //BA.debugLineNum = 239009800;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
__ref._mresizemode /*String*/  = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
RDebugUtils.currentLine=239009801;
 //BA.debugLineNum = 239009801;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=239009802;
 //BA.debugLineNum = 239009802;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
__ref._mcornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
RDebugUtils.currentLine=239009803;
 //BA.debugLineNum = 239009803;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=239009804;
 //BA.debugLineNum = 239009804;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=239009805;
 //BA.debugLineNum = 239009805;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=239796224;
 //BA.debugLineNum = 239796224;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=239796225;
 //BA.debugLineNum = 239796225;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=239796226;
 //BA.debugLineNum = 239796226;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getcornersradius", true))
	 {return ((Integer) Debug.delegate(ba, "getcornersradius", null));}
RDebugUtils.currentLine=239271936;
 //BA.debugLineNum = 239271936;BA.debugLine="Public Sub getCornersRadius As Int";
RDebugUtils.currentLine=239271937;
 //BA.debugLineNum = 239271937;BA.debugLine="Return mCornersRadius";
if (true) return __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=239271938;
 //BA.debugLineNum = 239271938;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=239403008;
 //BA.debugLineNum = 239403008;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=239403009;
 //BA.debugLineNum = 239403009;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=239403010;
 //BA.debugLineNum = 239403010;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=239140864;
 //BA.debugLineNum = 239140864;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=239140865;
 //BA.debugLineNum = 239140865;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=239140866;
 //BA.debugLineNum = 239140866;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.docU.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=238944256;
 //BA.debugLineNum = 238944256;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=238944257;
 //BA.debugLineNum = 238944257;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=238944258;
 //BA.debugLineNum = 238944258;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=238944259;
 //BA.debugLineNum = 238944259;BA.debugLine="End Sub";
return "";
}
public String  _load(b4j.docU.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=239599616;
 //BA.debugLineNum = 239599616;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=239599620;
 //BA.debugLineNum = 239599620;BA.debugLine="setBitmap(xui.LoadBitmap(Dir, FileName))";
__ref._setbitmap /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename));
RDebugUtils.currentLine=239599622;
 //BA.debugLineNum = 239599622;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4j.docU.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=239730688;
 //BA.debugLineNum = 239730688;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=239730689;
 //BA.debugLineNum = 239730689;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=239730690;
 //BA.debugLineNum = 239730690;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=239730691;
 //BA.debugLineNum = 239730691;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=239730692;
 //BA.debugLineNum = 239730692;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(b4j.docU.b4ximageview __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcornersradius", true))
	 {return ((String) Debug.delegate(ba, "setcornersradius", new Object[] {_i}));}
RDebugUtils.currentLine=239337472;
 //BA.debugLineNum = 239337472;BA.debugLine="Public Sub setCornersRadius (i As Int)";
RDebugUtils.currentLine=239337473;
 //BA.debugLineNum = 239337473;BA.debugLine="mCornersRadius = i";
__ref._mcornersradius /*int*/  = _i;
RDebugUtils.currentLine=239337474;
 //BA.debugLineNum = 239337474;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=239337475;
 //BA.debugLineNum = 239337475;BA.debugLine="End Sub";
return "";
}
public String  _updateclip(b4j.docU.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "updateclip", true))
	 {return ((String) Debug.delegate(ba, "updateclip", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _shape = null;
double _radius = 0;
double _cx = 0;
double _cy = 0;
double _d = 0;
RDebugUtils.currentLine=239861760;
 //BA.debugLineNum = 239861760;BA.debugLine="Private Sub UpdateClip";
RDebugUtils.currentLine=239861761;
 //BA.debugLineNum = 239861761;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=239861762;
 //BA.debugLineNum = 239861762;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,0,(int) (0),__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
 }else {
RDebugUtils.currentLine=239861764;
 //BA.debugLineNum = 239861764;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,0,(int) (0),__ref._mcornersradius /*int*/ );
 };
RDebugUtils.currentLine=239861767;
 //BA.debugLineNum = 239861767;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=239861768;
 //BA.debugLineNum = 239861768;BA.debugLine="Dim shape As JavaObject";
_shape = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=239861769;
 //BA.debugLineNum = 239861769;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=239861770;
 //BA.debugLineNum = 239861770;BA.debugLine="Dim radius As Double = Min(mBase.Width / 2, mBas";
_radius = __c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=239861771;
 //BA.debugLineNum = 239861771;BA.debugLine="Dim cx As Double = mBase.Width / 2";
_cx = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2;
RDebugUtils.currentLine=239861772;
 //BA.debugLineNum = 239861772;BA.debugLine="Dim cy As Double = mBase.Height / 2";
_cy = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2;
RDebugUtils.currentLine=239861773;
 //BA.debugLineNum = 239861773;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_cx),(Object)(_cy),(Object)(_radius)});
 }else {
RDebugUtils.currentLine=239861775;
 //BA.debugLineNum = 239861775;BA.debugLine="Dim cx As Double = mBase.Width";
_cx = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=239861776;
 //BA.debugLineNum = 239861776;BA.debugLine="Dim cy As Double = mBase.Height";
_cy = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=239861777;
 //BA.debugLineNum = 239861777;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Rectangle",new Object[]{(Object)(_cx),(Object)(_cy)});
RDebugUtils.currentLine=239861778;
 //BA.debugLineNum = 239861778;BA.debugLine="If mCornersRadius > 0 Then";
if (__ref._mcornersradius /*int*/ >0) { 
RDebugUtils.currentLine=239861779;
 //BA.debugLineNum = 239861779;BA.debugLine="Dim d As Double = mCornersRadius";
_d = __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=239861780;
 //BA.debugLineNum = 239861780;BA.debugLine="shape.RunMethod(\"setArcHeight\", Array(d))";
_shape.RunMethod("setArcHeight",new Object[]{(Object)(_d)});
RDebugUtils.currentLine=239861781;
 //BA.debugLineNum = 239861781;BA.debugLine="shape.RunMethod(\"setArcWidth\", Array(d))";
_shape.RunMethod("setArcWidth",new Object[]{(Object)(_d)});
 };
 };
RDebugUtils.currentLine=239861784;
 //BA.debugLineNum = 239861784;BA.debugLine="jo.RunMethod(\"setClip\", Array(shape))";
_jo.RunMethod("setClip",new Object[]{(Object)(_shape.getObject())});
RDebugUtils.currentLine=239861789;
 //BA.debugLineNum = 239861789;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(b4j.docU.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=239468544;
 //BA.debugLineNum = 239468544;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=239468545;
 //BA.debugLineNum = 239468545;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=239468546;
 //BA.debugLineNum = 239468546;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=239468547;
 //BA.debugLineNum = 239468547;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=239468548;
 //BA.debugLineNum = 239468548;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4j.docU.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=239206400;
 //BA.debugLineNum = 239206400;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=239206401;
 //BA.debugLineNum = 239206401;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=239206402;
 //BA.debugLineNum = 239206402;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=239206403;
 //BA.debugLineNum = 239206403;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=239206404;
 //BA.debugLineNum = 239206404;BA.debugLine="End Sub";
return "";
}
}