package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xgifview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xgifview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xgifview.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
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
public String  _base_resize(b4j.docU.b4xgifview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=111607808;
 //BA.debugLineNum = 111607808;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=111607812;
 //BA.debugLineNum = 111607812;BA.debugLine="If iv.GetImage.IsInitialized Then";
if (__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .GetImage().IsInitialized()) { 
RDebugUtils.currentLine=111607813;
 //BA.debugLineNum = 111607813;BA.debugLine="Dim bmp As B4XBitmap = iv.GetImage";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .GetImage().getObject()));
RDebugUtils.currentLine=111607814;
 //BA.debugLineNum = 111607814;BA.debugLine="ResizeBasedOnImage(iv, bmp.Width / bmp.Height)";
__ref._resizebasedonimage /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .getObject())),(float) (_bmp.getWidth()/(double)_bmp.getHeight()));
 };
RDebugUtils.currentLine=111607819;
 //BA.debugLineNum = 111607819;BA.debugLine="End Sub";
return "";
}
public String  _resizebasedonimage(b4j.docU.b4xgifview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xiv,float _bmpratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "resizebasedonimage", true))
	 {return ((String) Debug.delegate(ba, "resizebasedonimage", new Object[] {_xiv,_bmpratio}));}
float _viewratio = 0f;
int _height = 0;
int _width = 0;
RDebugUtils.currentLine=111542272;
 //BA.debugLineNum = 111542272;BA.debugLine="Private Sub ResizeBasedOnImage(xiv As B4XView, Bmp";
RDebugUtils.currentLine=111542273;
 //BA.debugLineNum = 111542273;BA.debugLine="Dim viewRatio As Float = mBase.Width / mBase.Heig";
_viewratio = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=111542274;
 //BA.debugLineNum = 111542274;BA.debugLine="Dim Height, Width As Int";
_height = 0;
_width = 0;
RDebugUtils.currentLine=111542275;
 //BA.debugLineNum = 111542275;BA.debugLine="If viewRatio > BmpRatio Then";
if (_viewratio>_bmpratio) { 
RDebugUtils.currentLine=111542276;
 //BA.debugLineNum = 111542276;BA.debugLine="Height = mBase.Height";
_height = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=111542277;
 //BA.debugLineNum = 111542277;BA.debugLine="Width = mBase.Height * BmpRatio";
_width = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*_bmpratio);
 }else {
RDebugUtils.currentLine=111542279;
 //BA.debugLineNum = 111542279;BA.debugLine="Width = mBase.Width";
_width = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=111542280;
 //BA.debugLineNum = 111542280;BA.debugLine="Height = mBase.Width / BmpRatio";
_height = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)_bmpratio);
 };
RDebugUtils.currentLine=111542282;
 //BA.debugLineNum = 111542282;BA.debugLine="xiv.SetLayoutAnimated(0, mBase.Width / 2 - Width";
_xiv.SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_width/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_height/(double)2,_width,_height);
RDebugUtils.currentLine=111542283;
 //BA.debugLineNum = 111542283;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xgifview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
RDebugUtils.currentLine=111149056;
 //BA.debugLineNum = 111149056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=111149057;
 //BA.debugLineNum = 111149057;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=111149058;
 //BA.debugLineNum = 111149058;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=111149059;
 //BA.debugLineNum = 111149059;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=111149060;
 //BA.debugLineNum = 111149060;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=111149061;
 //BA.debugLineNum = 111149061;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=111149063;
 //BA.debugLineNum = 111149063;BA.debugLine="Private iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=111149070;
 //BA.debugLineNum = 111149070;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.b4xgifview __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=111280128;
 //BA.debugLineNum = 111280128;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=111280129;
 //BA.debugLineNum = 111280129;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=111280130;
 //BA.debugLineNum = 111280130;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=111280131;
 //BA.debugLineNum = 111280131;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=111280133;
 //BA.debugLineNum = 111280133;BA.debugLine="iv.Initialize(\"\")";
__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=111280134;
 //BA.debugLineNum = 111280134;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=111280145;
 //BA.debugLineNum = 111280145;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.b4xgifview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=111214592;
 //BA.debugLineNum = 111214592;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=111214593;
 //BA.debugLineNum = 111214593;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=111214594;
 //BA.debugLineNum = 111214594;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=111214595;
 //BA.debugLineNum = 111214595;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4j.docU.b4xgifview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=111476736;
 //BA.debugLineNum = 111476736;BA.debugLine="Private Sub SetBitmap(bmp As B4XBitmap)";
RDebugUtils.currentLine=111476737;
 //BA.debugLineNum = 111476737;BA.debugLine="iv.SetImage(bmp)";
__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(_bmp.getObject()));
RDebugUtils.currentLine=111476738;
 //BA.debugLineNum = 111476738;BA.debugLine="iv.PreserveRatio = True";
__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .setPreserveRatio(__c.True);
RDebugUtils.currentLine=111476739;
 //BA.debugLineNum = 111476739;BA.debugLine="Dim bmp As B4XBitmap = iv.GetImage";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .GetImage().getObject()));
RDebugUtils.currentLine=111476740;
 //BA.debugLineNum = 111476740;BA.debugLine="ResizeBasedOnImage(iv, bmp.Width / bmp.Height)";
__ref._resizebasedonimage /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._iv /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .getObject())),(float) (_bmp.getWidth()/(double)_bmp.getHeight()));
RDebugUtils.currentLine=111476741;
 //BA.debugLineNum = 111476741;BA.debugLine="End Sub";
return "";
}
public String  _setgif(b4j.docU.b4xgifview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "setgif", true))
	 {return ((String) Debug.delegate(ba, "setgif", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=111345664;
 //BA.debugLineNum = 111345664;BA.debugLine="Public Sub SetGif(Dir As String, FileName As Strin";
RDebugUtils.currentLine=111345668;
 //BA.debugLineNum = 111345668;BA.debugLine="SetBitmap(xui.LoadBitmap(Dir, FileName))";
__ref._setbitmap /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename));
RDebugUtils.currentLine=111345676;
 //BA.debugLineNum = 111345676;BA.debugLine="End Sub";
return "";
}
public String  _setgif2(b4j.docU.b4xgifview __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xgifview";
if (Debug.shouldDelegate(ba, "setgif2", true))
	 {return ((String) Debug.delegate(ba, "setgif2", new Object[] {_data}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=111411200;
 //BA.debugLineNum = 111411200;BA.debugLine="Public Sub SetGif2 (Data() As Byte)";
RDebugUtils.currentLine=111411207;
 //BA.debugLineNum = 111411207;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=111411208;
 //BA.debugLineNum = 111411208;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=111411209;
 //BA.debugLineNum = 111411209;BA.debugLine="in.InitializeFromBytesArray(Data, 0, Data.Length)";
_in.InitializeFromBytesArray(_data,(int) (0),_data.length);
RDebugUtils.currentLine=111411210;
 //BA.debugLineNum = 111411210;BA.debugLine="img.Initialize2(in)";
_img.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=111411211;
 //BA.debugLineNum = 111411211;BA.debugLine="in.Close";
_in.Close();
RDebugUtils.currentLine=111411212;
 //BA.debugLineNum = 111411212;BA.debugLine="SetBitmap(img)";
__ref._setbitmap /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_img.getObject())));
RDebugUtils.currentLine=111411216;
 //BA.debugLineNum = 111411216;BA.debugLine="End Sub";
return "";
}
}