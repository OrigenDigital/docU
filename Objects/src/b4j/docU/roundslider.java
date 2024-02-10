package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.roundslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.roundslider.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _mvalue = 0;
public int _mmin = 0;
public int _mmax = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _thumb = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _circlerect = null;
public int _valuecolor = 0;
public int _stroke = 0;
public int _thumbsize = 0;
public Object _tag = null;
public int _mthumbbordercolor = 0;
public int _mthumbinnercolor = 0;
public int _mcirclefillcolor = 0;
public int _mcirclenonvaluecolor = 0;
public boolean _mrollover = false;
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
public String  _base_resize(b4j.docU.roundslider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=249233408;
 //BA.debugLineNum = 249233408;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=249233409;
 //BA.debugLineNum = 249233409;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_width,_height);
RDebugUtils.currentLine=249233410;
 //BA.debugLineNum = 249233410;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=249233411;
 //BA.debugLineNum = 249233411;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
__ref._createthumb /*String*/ (null);};
RDebugUtils.currentLine=249233412;
 //BA.debugLineNum = 249233412;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (__ref._thumbsize /*int*/ +__ref._stroke /*int*/ ),(float) (_width-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ),(float) (_height-__ref._thumbsize /*int*/ -__ref._stroke /*int*/ ));
RDebugUtils.currentLine=249233413;
 //BA.debugLineNum = 249233413;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight());
RDebugUtils.currentLine=249233414;
 //BA.debugLineNum = 249233414;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=249233415;
 //BA.debugLineNum = 249233415;BA.debugLine="End Sub";
return "";
}
public String  _createthumb(b4j.docU.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "createthumb", true))
	 {return ((String) Debug.delegate(ba, "createthumb", null));}
b4j.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4j.example.bitmapcreator _bc = null;
RDebugUtils.currentLine=249167872;
 //BA.debugLineNum = 249167872;BA.debugLine="Private Sub CreateThumb";
RDebugUtils.currentLine=249167873;
 //BA.debugLineNum = 249167873;BA.debugLine="Dim p As BCPath";
_p = new b4j.example.bcpath();
RDebugUtils.currentLine=249167874;
 //BA.debugLineNum = 249167874;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
RDebugUtils.currentLine=249167875;
 //BA.debugLineNum = 249167875;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=249167876;
 //BA.debugLineNum = 249167876;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
RDebugUtils.currentLine=249167877;
 //BA.debugLineNum = 249167877;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=249167878;
 //BA.debugLineNum = 249167878;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
RDebugUtils.currentLine=249167879;
 //BA.debugLineNum = 249167879;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=249167880;
 //BA.debugLineNum = 249167880;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=249167881;
 //BA.debugLineNum = 249167881;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
RDebugUtils.currentLine=249167882;
 //BA.debugLineNum = 249167882;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
RDebugUtils.currentLine=249167883;
 //BA.debugLineNum = 249167883;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,__ref._mthumbbordercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=249167884;
 //BA.debugLineNum = 249167884;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbinnercolor /*int*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=249167885;
 //BA.debugLineNum = 249167885;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),__ref._mthumbbordercolor /*int*/ ,__c.False,__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=249167886;
 //BA.debugLineNum = 249167886;BA.debugLine="thumb = bc.Bitmap";
__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bc._getbitmap();
RDebugUtils.currentLine=249167887;
 //BA.debugLineNum = 249167887;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref._thumbsize /*int*/  = (int) (__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=249167888;
 //BA.debugLineNum = 249167888;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=249167889;
 //BA.debugLineNum = 249167889;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4j.docU.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
RDebugUtils.currentLine=249298944;
 //BA.debugLineNum = 249298944;BA.debugLine="Public Sub Draw";
RDebugUtils.currentLine=249298945;
 //BA.debugLineNum = 249298945;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=249298946;
 //BA.debugLineNum = 249298946;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2);
RDebugUtils.currentLine=249298947;
 //BA.debugLineNum = 249298947;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._mcirclenonvaluecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
RDebugUtils.currentLine=249298948;
 //BA.debugLineNum = 249298948;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=249298949;
 //BA.debugLineNum = 249298949;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref._mvalue /*int*/ -__ref._mmin /*int*/ )/(double)(__ref._mmax /*int*/ -__ref._mmin /*int*/ )*360);
RDebugUtils.currentLine=249298950;
 //BA.debugLineNum = 249298950;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
RDebugUtils.currentLine=249298951;
 //BA.debugLineNum = 249298951;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
_b4jstrokeoffset = (int) (__ref._stroke /*int*/ /(double)2);};
RDebugUtils.currentLine=249298952;
 //BA.debugLineNum = 249298952;BA.debugLine="If mValue = mMax Then";
if (__ref._mvalue /*int*/ ==__ref._mmax /*int*/ ) { 
RDebugUtils.currentLine=249298953;
 //BA.debugLineNum = 249298953;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Ce";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius),__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 }else {
RDebugUtils.currentLine=249298955;
 //BA.debugLineNum = 249298955;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.C";
_p.InitializeArc(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
RDebugUtils.currentLine=249298956;
 //BA.debugLineNum = 249298956;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._valuecolor /*int*/ ,__c.False,(float) (__ref._stroke /*int*/ ));
 };
RDebugUtils.currentLine=249298958;
 //BA.debugLineNum = 249298958;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX(),__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY(),(float) (_radius-_b4jstrokeoffset),__ref._mcirclefillcolor /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=249298959;
 //BA.debugLineNum = 249298959;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=249298960;
 //BA.debugLineNum = 249298960;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref._thumbsize /*int*/ /(double)2+__ref._stroke /*int*/ /(double)2);
RDebugUtils.currentLine=249298961;
 //BA.debugLineNum = 249298961;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX()+_r*__c.CosD(_angle-90));
RDebugUtils.currentLine=249298962;
 //BA.debugLineNum = 249298962;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY()+_r*__c.SinD(_angle-90));
RDebugUtils.currentLine=249298963;
 //BA.debugLineNum = 249298963;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy-__ref._thumbsize /*int*/ /(double)2),(float) (_cx+__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)8),(float) (_cy+__ref._thumbsize /*int*/ /(double)2));
RDebugUtils.currentLine=249298964;
 //BA.debugLineNum = 249298964;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawBitmapRotated((javafx.scene.image.Image)(__ref._thumb /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_dest,(float) (_angle));
RDebugUtils.currentLine=249298965;
 //BA.debugLineNum = 249298965;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=249298966;
 //BA.debugLineNum = 249298966;BA.debugLine="xlbl.Text = mValue";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(__ref._mvalue /*int*/ ));
RDebugUtils.currentLine=249298967;
 //BA.debugLineNum = 249298967;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
RDebugUtils.currentLine=248840192;
 //BA.debugLineNum = 248840192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=248840193;
 //BA.debugLineNum = 248840193;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=248840194;
 //BA.debugLineNum = 248840194;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=248840195;
 //BA.debugLineNum = 248840195;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=248840196;
 //BA.debugLineNum = 248840196;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=248840197;
 //BA.debugLineNum = 248840197;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=248840198;
 //BA.debugLineNum = 248840198;BA.debugLine="Private mValue As Int = 75";
_mvalue = (int) (75);
RDebugUtils.currentLine=248840199;
 //BA.debugLineNum = 248840199;BA.debugLine="Private mMin, mMax As Int";
_mmin = 0;
_mmax = 0;
RDebugUtils.currentLine=248840200;
 //BA.debugLineNum = 248840200;BA.debugLine="Private thumb As B4XBitmap";
_thumb = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=248840201;
 //BA.debugLineNum = 248840201;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=248840202;
 //BA.debugLineNum = 248840202;BA.debugLine="Private xlbl As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=248840203;
 //BA.debugLineNum = 248840203;BA.debugLine="Private CircleRect As B4XRect";
_circlerect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=248840204;
 //BA.debugLineNum = 248840204;BA.debugLine="Private ValueColor As Int";
_valuecolor = 0;
RDebugUtils.currentLine=248840205;
 //BA.debugLineNum = 248840205;BA.debugLine="Private stroke As Int";
_stroke = 0;
RDebugUtils.currentLine=248840206;
 //BA.debugLineNum = 248840206;BA.debugLine="Private ThumbSize As Int";
_thumbsize = 0;
RDebugUtils.currentLine=248840207;
 //BA.debugLineNum = 248840207;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=248840208;
 //BA.debugLineNum = 248840208;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_mthumbbordercolor = ((int)0xff5b5b5b);
RDebugUtils.currentLine=248840209;
 //BA.debugLineNum = 248840209;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_mthumbinnercolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=248840210;
 //BA.debugLineNum = 248840210;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_mcirclefillcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=248840211;
 //BA.debugLineNum = 248840211;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_mcirclenonvaluecolor = ((int)0xffb6b6b6);
RDebugUtils.currentLine=248840212;
 //BA.debugLineNum = 248840212;BA.debugLine="Private mRollOver As Boolean";
_mrollover = false;
RDebugUtils.currentLine=248840213;
 //BA.debugLineNum = 248840213;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.roundslider __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=248971264;
 //BA.debugLineNum = 248971264;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=248971265;
 //BA.debugLineNum = 248971265;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=248971266;
 //BA.debugLineNum = 248971266;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=248971266;
 //BA.debugLineNum = 248971266;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=248971267;
 //BA.debugLineNum = 248971267;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=248971268;
 //BA.debugLineNum = 248971268;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref._mmin /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=248971269;
 //BA.debugLineNum = 248971269;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref._mmax /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=248971270;
 //BA.debugLineNum = 248971270;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
RDebugUtils.currentLine=248971271;
 //BA.debugLineNum = 248971271;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=248971272;
 //BA.debugLineNum = 248971272;BA.debugLine="xlbl = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=248971273;
 //BA.debugLineNum = 248971273;BA.debugLine="xlbl.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=248971274;
 //BA.debugLineNum = 248971274;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=248971275;
 //BA.debugLineNum = 248971275;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=248971276;
 //BA.debugLineNum = 248971276;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref._valuecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ValueColor")));
RDebugUtils.currentLine=248971277;
 //BA.debugLineNum = 248971277;BA.debugLine="mRollOver = Props.GetDefault(\"RollOver\", False)";
__ref._mrollover /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("RollOver"),(Object)(__c.False)));
RDebugUtils.currentLine=248971278;
 //BA.debugLineNum = 248971278;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=248971279;
 //BA.debugLineNum = 248971279;BA.debugLine="stroke = 8dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (8));
 }else 
{RDebugUtils.currentLine=248971280;
 //BA.debugLineNum = 248971280;BA.debugLine="Else If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=248971281;
 //BA.debugLineNum = 248971281;BA.debugLine="stroke = 6dip";
__ref._stroke /*int*/  = __c.DipToCurrent((int) (6));
 }}
;
RDebugUtils.currentLine=248971283;
 //BA.debugLineNum = 248971283;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=248971284;
 //BA.debugLineNum = 248971284;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4j.docU.roundslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=249757696;
 //BA.debugLineNum = 249757696;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=249757697;
 //BA.debugLineNum = 249757697;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=249757698;
 //BA.debugLineNum = 249757698;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.docU.roundslider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=248905728;
 //BA.debugLineNum = 248905728;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=248905729;
 //BA.debugLineNum = 248905729;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=248905730;
 //BA.debugLineNum = 248905730;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=248905731;
 //BA.debugLineNum = 248905731;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mouseclicked(b4j.docU.roundslider __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "pnl_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=249495552;
 //BA.debugLineNum = 249495552;BA.debugLine="Private Sub pnl_MouseClicked(EventData As MouseEve";
RDebugUtils.currentLine=249495553;
 //BA.debugLineNum = 249495553;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=249495554;
 //BA.debugLineNum = 249495554;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mousepressed(b4j.docU.roundslider __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_mousepressed", true))
	 {return ((String) Debug.delegate(ba, "pnl_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=249430016;
 //BA.debugLineNum = 249430016;BA.debugLine="Private Sub pnl_MousePressed (EventData As MouseEv";
RDebugUtils.currentLine=249430017;
 //BA.debugLineNum = 249430017;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=249430018;
 //BA.debugLineNum = 249430018;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mousereleased(b4j.docU.roundslider __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_mousereleased", true))
	 {return ((String) Debug.delegate(ba, "pnl_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=249561088;
 //BA.debugLineNum = 249561088;BA.debugLine="Private Sub pnl_MouseReleased(EventData As MouseEv";
RDebugUtils.currentLine=249561089;
 //BA.debugLineNum = 249561089;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=249561090;
 //BA.debugLineNum = 249561090;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(b4j.docU.roundslider __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "pnl_touch", true))
	 {return ((String) Debug.delegate(ba, "pnl_touch", new Object[] {_action,_x,_y}));}
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
RDebugUtils.currentLine=249364480;
 //BA.debugLineNum = 249364480;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
RDebugUtils.currentLine=249364481;
 //BA.debugLineNum = 249364481;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=249364482;
 //BA.debugLineNum = 249364482;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterX());
RDebugUtils.currentLine=249364483;
 //BA.debugLineNum = 249364483;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getCenterY());
RDebugUtils.currentLine=249364484;
 //BA.debugLineNum = 249364484;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
RDebugUtils.currentLine=249364485;
 //BA.debugLineNum = 249364485;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>__ref._circlerect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()/(double)2) { 
RDebugUtils.currentLine=249364486;
 //BA.debugLineNum = 249364486;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
RDebugUtils.currentLine=249364487;
 //BA.debugLineNum = 249364487;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
RDebugUtils.currentLine=249364488;
 //BA.debugLineNum = 249364488;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
RDebugUtils.currentLine=249364489;
 //BA.debugLineNum = 249364489;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref._mmin /*int*/ +_angle/(double)360*(__ref._mmax /*int*/ -__ref._mmin /*int*/ ));
RDebugUtils.currentLine=249364490;
 //BA.debugLineNum = 249364490;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_newvalue)));
RDebugUtils.currentLine=249364491;
 //BA.debugLineNum = 249364491;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=249364492;
 //BA.debugLineNum = 249364492;BA.debugLine="If mRollOver = False Then";
if (__ref._mrollover /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=249364493;
 //BA.debugLineNum = 249364493;BA.debugLine="If Abs(NewValue - mValue) > (mMax - mMin) / 2";
if (__c.Abs(_newvalue-__ref._mvalue /*int*/ )>(__ref._mmax /*int*/ -__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=249364494;
 //BA.debugLineNum = 249364494;BA.debugLine="If mValue >= (mMax + mMin) / 2 Then";
if (__ref._mvalue /*int*/ >=(__ref._mmax /*int*/ +__ref._mmin /*int*/ )/(double)2) { 
RDebugUtils.currentLine=249364495;
 //BA.debugLineNum = 249364495;BA.debugLine="mValue = mMax";
__ref._mvalue /*int*/  = __ref._mmax /*int*/ ;
 }else {
RDebugUtils.currentLine=249364497;
 //BA.debugLineNum = 249364497;BA.debugLine="mValue = mMin";
__ref._mvalue /*int*/  = __ref._mmin /*int*/ ;
 };
 }else {
RDebugUtils.currentLine=249364500;
 //BA.debugLineNum = 249364500;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
 }else {
RDebugUtils.currentLine=249364503;
 //BA.debugLineNum = 249364503;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
 };
RDebugUtils.currentLine=249364505;
 //BA.debugLineNum = 249364505;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Valu";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=249364506;
 //BA.debugLineNum = 249364506;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChange";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=249364509;
 //BA.debugLineNum = 249364509;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
RDebugUtils.currentLine=249364511;
 //BA.debugLineNum = 249364511;BA.debugLine="End Sub";
return "";
}
public String  _setcirclecolor(b4j.docU.roundslider __ref,int _nonvaluecolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setcirclecolor", true))
	 {return ((String) Debug.delegate(ba, "setcirclecolor", new Object[] {_nonvaluecolor,_innercolor}));}
RDebugUtils.currentLine=249102336;
 //BA.debugLineNum = 249102336;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
RDebugUtils.currentLine=249102337;
 //BA.debugLineNum = 249102337;BA.debugLine="mCircleNonValueColor = NonValueColor";
__ref._mcirclenonvaluecolor /*int*/  = _nonvaluecolor;
RDebugUtils.currentLine=249102338;
 //BA.debugLineNum = 249102338;BA.debugLine="mCircleFillColor = InnerColor";
__ref._mcirclefillcolor /*int*/  = _innercolor;
RDebugUtils.currentLine=249102339;
 //BA.debugLineNum = 249102339;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=249102340;
 //BA.debugLineNum = 249102340;BA.debugLine="End Sub";
return "";
}
public String  _setrange(b4j.docU.roundslider __ref,int _newmin,int _newmax) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setrange", true))
	 {return ((String) Debug.delegate(ba, "setrange", new Object[] {_newmin,_newmax}));}
RDebugUtils.currentLine=249692160;
 //BA.debugLineNum = 249692160;BA.debugLine="Public Sub SetRange(NewMin As Int, NewMax As Int)";
RDebugUtils.currentLine=249692161;
 //BA.debugLineNum = 249692161;BA.debugLine="mMin = NewMin";
__ref._mmin /*int*/  = _newmin;
RDebugUtils.currentLine=249692162;
 //BA.debugLineNum = 249692162;BA.debugLine="mMax = NewMax";
__ref._mmax /*int*/  = _newmax;
RDebugUtils.currentLine=249692163;
 //BA.debugLineNum = 249692163;BA.debugLine="setValue(mValue)";
__ref._setvalue /*String*/ (null,__ref._mvalue /*int*/ );
RDebugUtils.currentLine=249692164;
 //BA.debugLineNum = 249692164;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4j.docU.roundslider __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=249626624;
 //BA.debugLineNum = 249626624;BA.debugLine="Public Sub setValue (v As Int)";
RDebugUtils.currentLine=249626625;
 //BA.debugLineNum = 249626625;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._mmin /*int*/ ,__c.Min(__ref._mmax /*int*/ ,_v)));
RDebugUtils.currentLine=249626626;
 //BA.debugLineNum = 249626626;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=249626627;
 //BA.debugLineNum = 249626627;BA.debugLine="End Sub";
return "";
}
public String  _setthumbcolor(b4j.docU.roundslider __ref,int _bordercolor,int _innercolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="roundslider";
if (Debug.shouldDelegate(ba, "setthumbcolor", true))
	 {return ((String) Debug.delegate(ba, "setthumbcolor", new Object[] {_bordercolor,_innercolor}));}
RDebugUtils.currentLine=249036800;
 //BA.debugLineNum = 249036800;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
RDebugUtils.currentLine=249036801;
 //BA.debugLineNum = 249036801;BA.debugLine="mThumbBorderColor = BorderColor";
__ref._mthumbbordercolor /*int*/  = _bordercolor;
RDebugUtils.currentLine=249036802;
 //BA.debugLineNum = 249036802;BA.debugLine="mThumbInnerColor = InnerColor";
__ref._mthumbinnercolor /*int*/  = _innercolor;
RDebugUtils.currentLine=249036803;
 //BA.debugLineNum = 249036803;BA.debugLine="CreateThumb";
__ref._createthumb /*String*/ (null);
RDebugUtils.currentLine=249036804;
 //BA.debugLineNum = 249036804;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=249036805;
 //BA.debugLineNum = 249036805;BA.debugLine="End Sub";
return "";
}
}