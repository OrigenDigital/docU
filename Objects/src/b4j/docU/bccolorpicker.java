package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bccolorpicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.bccolorpicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.bccolorpicker.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _selectedalpha = 0;
public b4j.example.bitmapcreator _bccolors = null;
public float _selectedh = 0f;
public float _selecteds = 0f;
public float _selectedv = 0f;
public float _devicescale = 0f;
public float _colorscale = 0f;
public int _dont_change = 0;
public b4j.docU.b4xcolortemplate._colorpickerpart _huebar = null;
public b4j.docU.b4xcolortemplate._colorpickerpart _colorpicker = null;
public b4j.docU.b4xcolortemplate._colorpickerpart _alphabar = null;
public int _borderscolor = 0;
public String _meventname = "";
public Object _mcallback = null;
public Object _tag = null;
public b4j.example.customlistview _lstcolors = null;
public anywheresoftware.b4a.agraham.byteconverter.ByteConverter _byteconverter = null;
public String _currentselectedhex = "";
public int _textchangedindex = 0;
public b4j.docU.b4xfloattextfield _txtnewvalue = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _colorpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _colorlabel = null;
public anywheresoftware.b4a.objects.collections.Map _mapofnamedcolors = null;
public b4j.docU.clvselectionsjamtableview _cselections = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlpreview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlprevvalue = null;
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
public String  _setselectedcolor(b4j.docU.bccolorpicker __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "setselectedcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedcolor", new Object[] {_i}));}
RDebugUtils.currentLine=133562368;
 //BA.debugLineNum = 133562368;BA.debugLine="Public Sub setSelectedColor(i As Int)";
RDebugUtils.currentLine=133562369;
 //BA.debugLineNum = 133562369;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
__ref._setselectedhsvcolor /*String*/ (null,__ref._colortohsv /*Object[]*/ (null,_i));
RDebugUtils.currentLine=133562370;
 //BA.debugLineNum = 133562370;BA.debugLine="End Sub";
return "";
}
public int  _getselectedcolor(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "getselectedcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedcolor", null));}
Object[] _hsv = null;
RDebugUtils.currentLine=133431296;
 //BA.debugLineNum = 133431296;BA.debugLine="Public Sub getSelectedColor As Int";
RDebugUtils.currentLine=133431297;
 //BA.debugLineNum = 133431297;BA.debugLine="Dim HSV() As Object = getSelectedHSVColor";
_hsv = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=133431298;
 //BA.debugLineNum = 133431298;BA.debugLine="Return HSVToColor(SelectedAlpha, HSV(0), HSV(1),";
if (true) return __ref._hsvtocolor /*int*/ (null,__ref._selectedalpha /*int*/ ,(float)(BA.ObjectToNumber(_hsv[(int) (0)])),(float)(BA.ObjectToNumber(_hsv[(int) (1)])),(float)(BA.ObjectToNumber(_hsv[(int) (2)])));
RDebugUtils.currentLine=133431299;
 //BA.debugLineNum = 133431299;BA.debugLine="End Sub";
return 0;
}
public String  _alpha_touch(b4j.docU.bccolorpicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "alpha_touch", true))
	 {return ((String) Debug.delegate(ba, "alpha_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=134021120;
 //BA.debugLineNum = 134021120;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=134021121;
 //BA.debugLineNum = 134021121;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=134021122;
 //BA.debugLineNum = 134021122;BA.debugLine="AlphaBarSelectedChange(x)";
__ref._alphabarselectedchange /*String*/ (null,_x);
RDebugUtils.currentLine=134021123;
 //BA.debugLineNum = 134021123;BA.debugLine="End Sub";
return "";
}
public String  _alphabarselectedchange(b4j.docU.bccolorpicker __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "alphabarselectedchange", true))
	 {return ((String) Debug.delegate(ba, "alphabarselectedchange", new Object[] {_x}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=133103616;
 //BA.debugLineNum = 133103616;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
RDebugUtils.currentLine=133103617;
 //BA.debugLineNum = 133103617;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
__ref._selectedalpha /*int*/  = (int) (255*__c.Max(0,__c.Min(1,_x/(double)__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=133103618;
 //BA.debugLineNum = 133103618;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=133103619;
 //BA.debugLineNum = 133103619;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=133103620;
 //BA.debugLineNum = 133103620;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=133103621;
 //BA.debugLineNum = 133103621;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
_r.Initialize((float) (_x-__c.DipToCurrent((int) (3))),(float) (__c.DipToCurrent((int) (1))),(float) (_x+__c.DipToCurrent((int) (3))),(float) (__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=133103622;
 //BA.debugLineNum = 133103622;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,__c.True,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=133103623;
 //BA.debugLineNum = 133103623;BA.debugLine="AlphaBar.cvs.Invalidate";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=133103624;
 //BA.debugLineNum = 133103624;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=133103625;
 //BA.debugLineNum = 133103625;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=133169152;
 //BA.debugLineNum = 133169152;BA.debugLine="Private Sub Update";
RDebugUtils.currentLine=133169153;
 //BA.debugLineNum = 133169153;BA.debugLine="DrawColors";
__ref._drawcolors /*String*/ (null);
RDebugUtils.currentLine=133169154;
 //BA.debugLineNum = 133169154;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
__ref._handleselectedcolorchanged /*String*/ (null,__ref._dont_change /*int*/ ,__ref._dont_change /*int*/ );
RDebugUtils.currentLine=133169155;
 //BA.debugLineNum = 133169155;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.docU.bccolorpicker __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _r = 0;
int _w = 0;
b4j.docU.b4xcolortemplate._colorpickerpart _cpp = null;
int _i = 0;
RDebugUtils.currentLine=132710400;
 //BA.debugLineNum = 132710400;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=132710402;
 //BA.debugLineNum = 132710402;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
__ref._colorscale /*float*/  = (float) (__c.Max(1,__c.Max(_width,_height)/(double)100/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=132710403;
 //BA.debugLineNum = 132710403;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (30)),_height-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=132710404;
 //BA.debugLineNum = 132710404;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) (__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=132710405;
 //BA.debugLineNum = 132710405;BA.debugLine="Dim w As Int = Max(10dip, Width - r - 314dip)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (10)),_width-_r-__c.DipToCurrent((int) (314))));
RDebugUtils.currentLine=132710406;
 //BA.debugLineNum = 132710406;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=132710407;
 //BA.debugLineNum = 132710407;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
RDebugUtils.currentLine=132710408;
 //BA.debugLineNum = 132710408;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
RDebugUtils.currentLine=132710410;
 //BA.debugLineNum = 132710410;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,_height-__c.DipToCurrent((int) (31)),_w,__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=132710411;
 //BA.debugLineNum = 132710411;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,__c.DipToCurrent((int) (1)),_w,_height-__c.DipToCurrent((int) (3))-__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=132710412;
 //BA.debugLineNum = 132710412;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
__ref._bccolors /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._colorscale /*float*/ ),(int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._colorscale /*float*/ ));
RDebugUtils.currentLine=132710413;
 //BA.debugLineNum = 132710413;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
final Object[] group12 = new Object[]{(Object)(__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ )};
final int groupLen12 = group12.length
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (b4j.docU.b4xcolortemplate._colorpickerpart)(group12[index12]);
RDebugUtils.currentLine=132710414;
 //BA.debugLineNum = 132710414;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=132710415;
 //BA.debugLineNum = 132710415;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).SetLayoutAnimated((int) (0),0,0,_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
RDebugUtils.currentLine=132710417;
 //BA.debugLineNum = 132710417;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=132710418;
 //BA.debugLineNum = 132710418;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp.DrawCheckers /*boolean*/ ) { 
RDebugUtils.currentLine=132710419;
 //BA.debugLineNum = 132710419;BA.debugLine="DrawCheckers(cpp)";
__ref._drawcheckers /*String*/ (null,_cpp);
 };
 }
};
RDebugUtils.currentLine=132710422;
 //BA.debugLineNum = 132710422;BA.debugLine="DrawHueBar";
__ref._drawhuebar /*String*/ (null);
RDebugUtils.currentLine=132710423;
 //BA.debugLineNum = 132710423;BA.debugLine="DrawAlphaBar";
__ref._drawalphabar /*String*/ (null);
RDebugUtils.currentLine=132710424;
 //BA.debugLineNum = 132710424;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=132710425;
 //BA.debugLineNum = 132710425;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=132710426;
 //BA.debugLineNum = 132710426;BA.debugLine="End Sub";
return "";
}
public String  _drawcheckers(b4j.docU.bccolorpicker __ref,b4j.docU.b4xcolortemplate._colorpickerpart _cpp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "drawcheckers", true))
	 {return ((String) Debug.delegate(ba, "drawcheckers", new Object[] {_cpp}));}
int _size = 0;
int[] _clrs = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _x = 0;
int _xx = 0;
int _y = 0;
RDebugUtils.currentLine=132775936;
 //BA.debugLineNum = 132775936;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
RDebugUtils.currentLine=132775937;
 //BA.debugLineNum = 132775937;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=132775938;
 //BA.debugLineNum = 132775938;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=132775939;
 //BA.debugLineNum = 132775939;BA.debugLine="Dim size As Int = 10dip";
_size = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=132775940;
 //BA.debugLineNum = 132775940;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = new int[]{((int)0xffc0c0c0),((int)0xff757575)};
RDebugUtils.currentLine=132775941;
 //BA.debugLineNum = 132775941;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
RDebugUtils.currentLine=132775942;
 //BA.debugLineNum = 132775942;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=132775943;
 //BA.debugLineNum = 132775943;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
final int step7 = _size;
final int limit7 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()-__c.DipToCurrent((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
RDebugUtils.currentLine=132775944;
 //BA.debugLineNum = 132775944;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
RDebugUtils.currentLine=132775945;
 //BA.debugLineNum = 132775945;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
RDebugUtils.currentLine=132775946;
 //BA.debugLineNum = 132775946;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
final int step10 = _size;
final int limit10 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
RDebugUtils.currentLine=132775947;
 //BA.debugLineNum = 132775947;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
RDebugUtils.currentLine=132775948;
 //BA.debugLineNum = 132775948;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
_r.Initialize((float) (_x),(float) (_y),(float) (_x+_size),(float) (_y+_size));
RDebugUtils.currentLine=132775949;
 //BA.debugLineNum = 132775949;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_clrs[_clr],__c.True,(float) (0));
 }
};
 }
};
RDebugUtils.currentLine=132775952;
 //BA.debugLineNum = 132775952;BA.debugLine="cpp.checkersCanvas.Invalidate";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=132775953;
 //BA.debugLineNum = 132775953;BA.debugLine="End Sub";
return "";
}
public String  _drawhuebar(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "drawhuebar", true))
	 {return ((String) Debug.delegate(ba, "drawhuebar", null));}
b4j.example.bitmapcreator _bchue = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=132841472;
 //BA.debugLineNum = 132841472;BA.debugLine="Private Sub DrawHueBar";
RDebugUtils.currentLine=132841473;
 //BA.debugLineNum = 132841473;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=132841474;
 //BA.debugLineNum = 132841474;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
_bchue._initialize(ba,(int) (__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=132841475;
 //BA.debugLineNum = 132841475;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
final int step3 = 1;
final int limit3 = (int) (_bchue._mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=132841476;
 //BA.debugLineNum = 132841476;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
final int step4 = 1;
final int limit4 = (int) (_bchue._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=132841477;
 //BA.debugLineNum = 132841477;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
_bchue._sethsv(_x,_y,(int) (255),(int) (360/(double)_bchue._mheight*_y),(float) (1),(float) (1));
 }
};
 }
};
RDebugUtils.currentLine=132841480;
 //BA.debugLineNum = 132841480;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_bchue._getbitmap().getObject()));
RDebugUtils.currentLine=132841481;
 //BA.debugLineNum = 132841481;BA.debugLine="End Sub";
return "";
}
public String  _drawalphabar(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "drawalphabar", true))
	 {return ((String) Debug.delegate(ba, "drawalphabar", null));}
b4j.example.bitmapcreator _bc = null;
b4j.example.bitmapcreator._argbcolor _argb = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=132907008;
 //BA.debugLineNum = 132907008;BA.debugLine="Private Sub DrawAlphaBar";
RDebugUtils.currentLine=132907009;
 //BA.debugLineNum = 132907009;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=132907010;
 //BA.debugLineNum = 132907010;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
_bc._initialize(ba,(int) (__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=132907011;
 //BA.debugLineNum = 132907011;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=132907012;
 //BA.debugLineNum = 132907012;BA.debugLine="argb.r = 0xcc";
_argb.r = ((int)0xcc);
RDebugUtils.currentLine=132907013;
 //BA.debugLineNum = 132907013;BA.debugLine="argb.g = 0xcc";
_argb.g = ((int)0xcc);
RDebugUtils.currentLine=132907014;
 //BA.debugLineNum = 132907014;BA.debugLine="argb.b = 0xcc";
_argb.b = ((int)0xcc);
RDebugUtils.currentLine=132907016;
 //BA.debugLineNum = 132907016;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=132907017;
 //BA.debugLineNum = 132907017;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=132907018;
 //BA.debugLineNum = 132907018;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb.a = (int) (_x/(double)_bc._mwidth*255);
RDebugUtils.currentLine=132907019;
 //BA.debugLineNum = 132907019;BA.debugLine="bc.SetARGB(x, y, argb)";
_bc._setargb(_x,_y,_argb);
 }
};
 }
};
RDebugUtils.currentLine=132907022;
 //BA.debugLineNum = 132907022;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_bc._getbitmap().getObject()));
RDebugUtils.currentLine=132907023;
 //BA.debugLineNum = 132907023;BA.debugLine="End Sub";
return "";
}
public String  _huebarselectedchanged(b4j.docU.bccolorpicker __ref,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "huebarselectedchanged", true))
	 {return ((String) Debug.delegate(ba, "huebarselectedchanged", new Object[] {_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=133038080;
 //BA.debugLineNum = 133038080;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
RDebugUtils.currentLine=133038081;
 //BA.debugLineNum = 133038081;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
__ref._selectedh /*float*/  = (float) (__c.Max(0,__c.Min(360,360*_y/(double)__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=133038082;
 //BA.debugLineNum = 133038082;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (__ref._selectedh /*float*/ *__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)360);
RDebugUtils.currentLine=133038083;
 //BA.debugLineNum = 133038083;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=133038084;
 //BA.debugLineNum = 133038084;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=133038085;
 //BA.debugLineNum = 133038085;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
_r.Initialize((float) (0),(float) (_y-__c.DipToCurrent((int) (3))),__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),(float) (_y+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=133038086;
 //BA.debugLineNum = 133038086;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=133038087;
 //BA.debugLineNum = 133038087;BA.debugLine="HueBar.cvs.Invalidate";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=133038088;
 //BA.debugLineNum = 133038088;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=133038089;
 //BA.debugLineNum = 133038089;BA.debugLine="End Sub";
return "";
}
public String  _btnsetnew_click(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "btnsetnew_click", true))
	 {return ((String) Debug.delegate(ba, "btnsetnew_click", null));}
RDebugUtils.currentLine=134479872;
 //BA.debugLineNum = 134479872;BA.debugLine="Sub btnSetNew_Click";
RDebugUtils.currentLine=134479873;
 //BA.debugLineNum = 134479873;BA.debugLine="RaiseEvent(txtNewValue.Text)";
__ref._raiseevent /*String*/ (null,__ref._txtnewvalue /*b4j.docU.b4xfloattextfield*/ ._gettext /*String*/ (null));
RDebugUtils.currentLine=134479874;
 //BA.debugLineNum = 134479874;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4j.docU.bccolorpicker __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_clr}));}
RDebugUtils.currentLine=134545408;
 //BA.debugLineNum = 134545408;BA.debugLine="Private Sub RaiseEvent (clr As String)";
RDebugUtils.currentLine=134545409;
 //BA.debugLineNum = 134545409;BA.debugLine="If IsValidColorString(clr) Then CallSub2(mCallBac";
if (__ref._isvalidcolorstring /*boolean*/ (null,_clr)) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ColorSet",(Object)(__ref._hextocolor /*int*/ (null,_clr)));};
RDebugUtils.currentLine=134545410;
 //BA.debugLineNum = 134545410;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
RDebugUtils.currentLine=132448256;
 //BA.debugLineNum = 132448256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=132448257;
 //BA.debugLineNum = 132448257;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132448258;
 //BA.debugLineNum = 132448258;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=132448259;
 //BA.debugLineNum = 132448259;BA.debugLine="Private SelectedAlpha As Int = 255";
_selectedalpha = (int) (255);
RDebugUtils.currentLine=132448260;
 //BA.debugLineNum = 132448260;BA.debugLine="Private bcColors As BitmapCreator";
_bccolors = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=132448261;
 //BA.debugLineNum = 132448261;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
_selectedh = (float) (60);
_selecteds = (float) (0.5);
_selectedv = (float) (0.5);
RDebugUtils.currentLine=132448262;
 //BA.debugLineNum = 132448262;BA.debugLine="Private DeviceScale, ColorScale As Float";
_devicescale = 0f;
_colorscale = 0f;
RDebugUtils.currentLine=132448263;
 //BA.debugLineNum = 132448263;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
_dont_change = (int) (-999999999);
RDebugUtils.currentLine=132448264;
 //BA.debugLineNum = 132448264;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
_huebar = new b4j.docU.b4xcolortemplate._colorpickerpart();
_colorpicker = new b4j.docU.b4xcolortemplate._colorpickerpart();
_alphabar = new b4j.docU.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=132448265;
 //BA.debugLineNum = 132448265;BA.debugLine="Private BordersColor As Int = xui.Color_White";
_borderscolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=132448266;
 //BA.debugLineNum = 132448266;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=132448267;
 //BA.debugLineNum = 132448267;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=132448268;
 //BA.debugLineNum = 132448268;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=132448269;
 //BA.debugLineNum = 132448269;BA.debugLine="Private lstColors As CustomListView";
_lstcolors = new b4j.example.customlistview();
RDebugUtils.currentLine=132448270;
 //BA.debugLineNum = 132448270;BA.debugLine="Private ByteConverter As ByteConverter";
_byteconverter = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=132448271;
 //BA.debugLineNum = 132448271;BA.debugLine="Private CurrentSelectedHex As String";
_currentselectedhex = "";
RDebugUtils.currentLine=132448272;
 //BA.debugLineNum = 132448272;BA.debugLine="Private TextChangedIndex As Int";
_textchangedindex = 0;
RDebugUtils.currentLine=132448273;
 //BA.debugLineNum = 132448273;BA.debugLine="Public txtNewValue As B4XFloatTextField";
_txtnewvalue = new b4j.docU.b4xfloattextfield();
RDebugUtils.currentLine=132448274;
 //BA.debugLineNum = 132448274;BA.debugLine="Private ColorPanel As B4XView";
_colorpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132448275;
 //BA.debugLineNum = 132448275;BA.debugLine="Private ColorLabel As B4XView";
_colorlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132448276;
 //BA.debugLineNum = 132448276;BA.debugLine="Private MapOfNamedColors As Map";
_mapofnamedcolors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=132448277;
 //BA.debugLineNum = 132448277;BA.debugLine="Private CSelections As CLVSelectionsJamTableView";
_cselections = new b4j.docU.clvselectionsjamtableview();
RDebugUtils.currentLine=132448278;
 //BA.debugLineNum = 132448278;BA.debugLine="Private pnlPreview As B4XView";
_pnlpreview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132448279;
 //BA.debugLineNum = 132448279;BA.debugLine="Public pnlPrevValue As B4XView";
_pnlprevvalue = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=132448280;
 //BA.debugLineNum = 132448280;BA.debugLine="End Sub";
return "";
}
public String  _colors_touch(b4j.docU.bccolorpicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "colors_touch", true))
	 {return ((String) Debug.delegate(ba, "colors_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=133890048;
 //BA.debugLineNum = 133890048;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=133890049;
 //BA.debugLineNum = 133890049;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=133890050;
 //BA.debugLineNum = 133890050;BA.debugLine="HandleSelectedColorChanged(X, Y)";
__ref._handleselectedcolorchanged /*String*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=133890051;
 //BA.debugLineNum = 133890051;BA.debugLine="End Sub";
return "";
}
public String  _handleselectedcolorchanged(b4j.docU.bccolorpicker __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "handleselectedcolorchanged", true))
	 {return ((String) Debug.delegate(ba, "handleselectedcolorchanged", new Object[] {_x,_y}));}
int _selectedcolor = 0;
int _itemindex = 0;
RDebugUtils.currentLine=133234688;
 //BA.debugLineNum = 133234688;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
RDebugUtils.currentLine=133234689;
 //BA.debugLineNum = 133234689;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=__ref._dont_change /*int*/ ) { 
RDebugUtils.currentLine=133234690;
 //BA.debugLineNum = 133234690;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
__ref._selecteds /*float*/  = (float) (__c.Max(0,__c.Min(1,_x/(double)__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=133234691;
 //BA.debugLineNum = 133234691;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
__ref._selectedv /*float*/  = (float) (__c.Max(0,__c.Min(1,(__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_y)/(double)__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
RDebugUtils.currentLine=133234693;
 //BA.debugLineNum = 133234693;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=133234694;
 //BA.debugLineNum = 133234694;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._selecteds /*float*/ *__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._selectedv /*float*/ *__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(float) (__c.DipToCurrent((int) (10))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=133234696;
 //BA.debugLineNum = 133234696;BA.debugLine="ColorPicker.cvs.Invalidate";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=133234697;
 //BA.debugLineNum = 133234697;BA.debugLine="If txtNewValue.IsInitialized Then";
if (__ref._txtnewvalue /*b4j.docU.b4xfloattextfield*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=133234698;
 //BA.debugLineNum = 133234698;BA.debugLine="Dim SelectedColor As Int = getSelectedColor";
_selectedcolor = __ref._getselectedcolor /*int*/ (null);
RDebugUtils.currentLine=133234699;
 //BA.debugLineNum = 133234699;BA.debugLine="pnlPreview.Color = SelectedColor";
__ref._pnlpreview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_selectedcolor);
RDebugUtils.currentLine=133234700;
 //BA.debugLineNum = 133234700;BA.debugLine="CurrentSelectedHex = ColorToHex(SelectedColor)";
__ref._currentselectedhex /*String*/  = __ref._colortohex /*String*/ (null,_selectedcolor);
RDebugUtils.currentLine=133234701;
 //BA.debugLineNum = 133234701;BA.debugLine="txtNewValue.Text = CurrentSelectedHex";
__ref._txtnewvalue /*b4j.docU.b4xfloattextfield*/ ._settext /*String*/ (null,__ref._currentselectedhex /*String*/ );
RDebugUtils.currentLine=133234702;
 //BA.debugLineNum = 133234702;BA.debugLine="If MapOfNamedColors.ContainsKey(SelectedColor) T";
if (__ref._mapofnamedcolors /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_selectedcolor))) { 
RDebugUtils.currentLine=133234703;
 //BA.debugLineNum = 133234703;BA.debugLine="Dim ItemIndex As Int = MapOfNamedColors.Get(Sel";
_itemindex = (int)(BA.ObjectToNumber(__ref._mapofnamedcolors /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_selectedcolor))));
RDebugUtils.currentLine=133234704;
 //BA.debugLineNum = 133234704;BA.debugLine="CSelections.SelectAndMakeVisible(ItemIndex)";
__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._selectandmakevisible /*void*/ (null,_itemindex);
 }else {
RDebugUtils.currentLine=133234706;
 //BA.debugLineNum = 133234706;BA.debugLine="CSelections.Clear";
__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._clear /*String*/ (null);
 };
 };
RDebugUtils.currentLine=133234709;
 //BA.debugLineNum = 133234709;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.docU.bccolorpicker __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
RDebugUtils.currentLine=133300224;
 //BA.debugLineNum = 133300224;BA.debugLine="Public Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=133300225;
 //BA.debugLineNum = 133300225;BA.debugLine="Return ByteConverter.HexFromBytes(ByteConverter.I";
if (true) return __ref._byteconverter /*anywheresoftware.b4a.agraham.byteconverter.ByteConverter*/ .HexFromBytes(__ref._byteconverter /*anywheresoftware.b4a.agraham.byteconverter.ByteConverter*/ .IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=133300226;
 //BA.debugLineNum = 133300226;BA.debugLine="End Sub";
return "";
}
public Object[]  _colortohsv(b4j.docU.bccolorpicker __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "colortohsv", true))
	 {return ((Object[]) Debug.delegate(ba, "colortohsv", new Object[] {_clr}));}
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
float _h = 0f;
float _s = 0f;
float _v = 0f;
int _cmax = 0;
int _cmin = 0;
float _rc = 0f;
float _gc = 0f;
float _bc = 0f;
RDebugUtils.currentLine=133758976;
 //BA.debugLineNum = 133758976;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
RDebugUtils.currentLine=133758977;
 //BA.debugLineNum = 133758977;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (24)));
RDebugUtils.currentLine=133758978;
 //BA.debugLineNum = 133758978;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (16)));
RDebugUtils.currentLine=133758979;
 //BA.debugLineNum = 133758979;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (8)));
RDebugUtils.currentLine=133758980;
 //BA.debugLineNum = 133758980;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (0)));
RDebugUtils.currentLine=133758981;
 //BA.debugLineNum = 133758981;BA.debugLine="Dim h, s, v As Float";
_h = 0f;
_s = 0f;
_v = 0f;
RDebugUtils.currentLine=133758982;
 //BA.debugLineNum = 133758982;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (__c.Max(__c.Max(_r,_g),_b));
RDebugUtils.currentLine=133758983;
 //BA.debugLineNum = 133758983;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (__c.Min(__c.Min(_r,_g),_b));
RDebugUtils.currentLine=133758984;
 //BA.debugLineNum = 133758984;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
RDebugUtils.currentLine=133758985;
 //BA.debugLineNum = 133758985;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
RDebugUtils.currentLine=133758986;
 //BA.debugLineNum = 133758986;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
RDebugUtils.currentLine=133758988;
 //BA.debugLineNum = 133758988;BA.debugLine="If s = 0 Then";
if (_s==0) { 
RDebugUtils.currentLine=133758989;
 //BA.debugLineNum = 133758989;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
RDebugUtils.currentLine=133758991;
 //BA.debugLineNum = 133758991;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=133758992;
 //BA.debugLineNum = 133758992;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=133758993;
 //BA.debugLineNum = 133758993;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=133758994;
 //BA.debugLineNum = 133758994;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
RDebugUtils.currentLine=133758995;
 //BA.debugLineNum = 133758995;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else 
{RDebugUtils.currentLine=133758996;
 //BA.debugLineNum = 133758996;BA.debugLine="Else If g = cmax Then";
if (_g==_cmax) { 
RDebugUtils.currentLine=133758997;
 //BA.debugLineNum = 133758997;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
RDebugUtils.currentLine=133758999;
 //BA.debugLineNum = 133758999;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 }}
;
RDebugUtils.currentLine=133759001;
 //BA.debugLineNum = 133759001;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
RDebugUtils.currentLine=133759002;
 //BA.debugLineNum = 133759002;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
RDebugUtils.currentLine=133759004;
 //BA.debugLineNum = 133759004;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return new Object[]{(Object)(_h*360),(Object)(_s),(Object)(_v),(Object)(_a)};
RDebugUtils.currentLine=133759005;
 //BA.debugLineNum = 133759005;BA.debugLine="End Sub";
return null;
}
public String  _createlistofcolorslayout(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "createlistofcolorslayout", true))
	 {return ((String) Debug.delegate(ba, "createlistofcolorslayout", null));}
String _line = "";
String[] _s = null;
String _name = "";
int _color = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _item = null;
RDebugUtils.currentLine=134348800;
 //BA.debugLineNum = 134348800;BA.debugLine="Sub CreateListOfColorsLayout";
RDebugUtils.currentLine=134348801;
 //BA.debugLineNum = 134348801;BA.debugLine="lstColors.sv.SetColorAndBorder(xui.Color_Transpar";
__ref._lstcolors /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=134348802;
 //BA.debugLineNum = 134348802;BA.debugLine="MapOfNamedColors.Initialize";
__ref._mapofnamedcolors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=134348803;
 //BA.debugLineNum = 134348803;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group3 = __c.File.ReadList(__c.File.getDirAssets(),"colors.txt");
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=134348804;
 //BA.debugLineNum = 134348804;BA.debugLine="Dim s() As String = Regex.Split(\":\", line)";
_s = __c.Regex.Split(":",_line);
RDebugUtils.currentLine=134348805;
 //BA.debugLineNum = 134348805;BA.debugLine="Dim Name As String = s(0)";
_name = _s[(int) (0)];
RDebugUtils.currentLine=134348806;
 //BA.debugLineNum = 134348806;BA.debugLine="Dim Color As Int = HexToColor(s(1))";
_color = __ref._hextocolor /*int*/ (null,_s[(int) (1)]);
RDebugUtils.currentLine=134348807;
 //BA.debugLineNum = 134348807;BA.debugLine="Dim item As B4XView = xui.CreatePanel(\"\")";
_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
_item = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=134348808;
 //BA.debugLineNum = 134348808;BA.debugLine="item.SetLayoutAnimated(0, 0, 0, lstColors.AsView";
_item.SetLayoutAnimated((int) (0),0,0,__ref._lstcolors /*b4j.example.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=134348809;
 //BA.debugLineNum = 134348809;BA.debugLine="lstColors.Add(item, Array(Name,Color))";
__ref._lstcolors /*b4j.example.customlistview*/ ._add(_item,(Object)(new Object[]{(Object)(_name),(Object)(_color)}));
RDebugUtils.currentLine=134348810;
 //BA.debugLineNum = 134348810;BA.debugLine="If MapOfNamedColors.ContainsKey(Color) Then";
if (__ref._mapofnamedcolors /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_color))) { 
RDebugUtils.currentLine=134348811;
 //BA.debugLineNum = 134348811;BA.debugLine="Log(\"Duplicate color: \" & Name)";
__c.LogImpl("9134348811","Duplicate color: "+_name,0);
 };
RDebugUtils.currentLine=134348813;
 //BA.debugLineNum = 134348813;BA.debugLine="MapOfNamedColors.Put(Color, MapOfNamedColors.Siz";
__ref._mapofnamedcolors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_color),(Object)(__ref._mapofnamedcolors /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()));
 }
};
RDebugUtils.currentLine=134348815;
 //BA.debugLineNum = 134348815;BA.debugLine="End Sub";
return "";
}
public int  _hextocolor(b4j.docU.bccolorpicker __ref,String _hex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "hextocolor", true))
	 {return ((Integer) Debug.delegate(ba, "hextocolor", new Object[] {_hex}));}
int[] _ints = null;
RDebugUtils.currentLine=133365760;
 //BA.debugLineNum = 133365760;BA.debugLine="Public Sub HexToColor(Hex As String) As Int";
RDebugUtils.currentLine=133365761;
 //BA.debugLineNum = 133365761;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=133365762;
 //BA.debugLineNum = 133365762;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=133365763;
 //BA.debugLineNum = 133365763;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=133365764;
 //BA.debugLineNum = 133365764;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }else 
{RDebugUtils.currentLine=133365765;
 //BA.debugLineNum = 133365765;BA.debugLine="Else If Hex.Length = 6 Then";
if (_hex.length()==6) { 
RDebugUtils.currentLine=133365766;
 //BA.debugLineNum = 133365766;BA.debugLine="Hex = \"FF\" & Hex";
_hex = "FF"+_hex;
 }}}
;
RDebugUtils.currentLine=133365768;
 //BA.debugLineNum = 133365768;BA.debugLine="Dim ints() As Int = ByteConverter.IntsFromBytes(B";
_ints = __ref._byteconverter /*anywheresoftware.b4a.agraham.byteconverter.ByteConverter*/ .IntsFromBytes(__ref._byteconverter /*anywheresoftware.b4a.agraham.byteconverter.ByteConverter*/ .HexToBytes(_hex));
RDebugUtils.currentLine=133365769;
 //BA.debugLineNum = 133365769;BA.debugLine="Return ints(0)";
if (true) return _ints[(int) (0)];
RDebugUtils.currentLine=133365770;
 //BA.debugLineNum = 133365770;BA.debugLine="End Sub";
return 0;
}
public b4j.docU.b4xcolortemplate._colorpickerpart  _createpanelforbitmapcreator(b4j.docU.bccolorpicker __ref,String _eventname,boolean _withcheckers) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "createpanelforbitmapcreator", true))
	 {return ((b4j.docU.b4xcolortemplate._colorpickerpart) Debug.delegate(ba, "createpanelforbitmapcreator", new Object[] {_eventname,_withcheckers}));}
b4j.docU.b4xcolortemplate._colorpickerpart _cpp = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _overlay = null;
RDebugUtils.currentLine=132644864;
 //BA.debugLineNum = 132644864;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
RDebugUtils.currentLine=132644865;
 //BA.debugLineNum = 132644865;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = new b4j.docU.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=132644866;
 //BA.debugLineNum = 132644866;BA.debugLine="cpp.Initialize";
_cpp.Initialize();
RDebugUtils.currentLine=132644867;
 //BA.debugLineNum = 132644867;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=132644868;
 //BA.debugLineNum = 132644868;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,0);
RDebugUtils.currentLine=132644869;
 //BA.debugLineNum = 132644869;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=132644870;
 //BA.debugLineNum = 132644870;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
RDebugUtils.currentLine=132644871;
 //BA.debugLineNum = 132644871;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=132644872;
 //BA.debugLineNum = 132644872;BA.debugLine="cpp.DrawCheckers = True";
_cpp.DrawCheckers /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=132644874;
 //BA.debugLineNum = 132644874;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=132644875;
 //BA.debugLineNum = 132644875;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=132644876;
 //BA.debugLineNum = 132644876;BA.debugLine="cpp.iv = iv";
_cpp.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=132644877;
 //BA.debugLineNum = 132644877;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_overlay = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_eventname);
RDebugUtils.currentLine=132644878;
 //BA.debugLineNum = 132644878;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_iv.getObject()),0,0,0,0);
RDebugUtils.currentLine=132644879;
 //BA.debugLineNum = 132644879;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_overlay.getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=132644880;
 //BA.debugLineNum = 132644880;BA.debugLine="cpp.cvs.Initialize(overlay)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_overlay);
RDebugUtils.currentLine=132644881;
 //BA.debugLineNum = 132644881;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=132644882;
 //BA.debugLineNum = 132644882;BA.debugLine="Return cpp";
if (true) return _cpp;
RDebugUtils.currentLine=132644883;
 //BA.debugLineNum = 132644883;BA.debugLine="End Sub";
return null;
}
public void  _designercreateview(b4j.docU.bccolorpicker __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,__ref,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4j.docU.bccolorpicker parent,b4j.docU.bccolorpicker __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
this.__ref = parent;
}
b4j.docU.bccolorpicker __ref;
b4j.docU.bccolorpicker parent;
Object _base;
anywheresoftware.b4j.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;
b4j.docU.b4xfloattextfield _t = null;
Object[] group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bccolorpicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=132579329;
 //BA.debugLineNum = 132579329;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=132579330;
 //BA.debugLineNum = 132579330;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=132579330;
 //BA.debugLineNum = 132579330;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent);
RDebugUtils.currentLine=132579332;
 //BA.debugLineNum = 132579332;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4j.docU.b4xcolortemplate._colorpickerpart*/ (null,"hueBar",parent.__c.False);
RDebugUtils.currentLine=132579333;
 //BA.debugLineNum = 132579333;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4j.docU.b4xcolortemplate._colorpickerpart*/ (null,"colors",parent.__c.True);
RDebugUtils.currentLine=132579334;
 //BA.debugLineNum = 132579334;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4j.docU.b4xcolortemplate._colorpickerpart*/ (null,"alpha",parent.__c.True);
RDebugUtils.currentLine=132579335;
 //BA.debugLineNum = 132579335;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bccolorpicker", "designercreateview"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=132579336;
 //BA.debugLineNum = 132579336;BA.debugLine="mBase.LoadLayout(\"BCColorPicker\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("BCColorPicker",ba);
RDebugUtils.currentLine=132579337;
 //BA.debugLineNum = 132579337;BA.debugLine="CSelections.Initialize(lstColors)";
__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._initialize /*String*/ (null,ba,__ref._lstcolors /*b4j.example.customlistview*/ );
RDebugUtils.currentLine=132579338;
 //BA.debugLineNum = 132579338;BA.debugLine="CSelections.Mode = CSelections.MODE_SINGLE_ITEM_P";
__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._setmode /*int*/ (null,__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._mode_single_item_permanent /*int*/ );
RDebugUtils.currentLine=132579339;
 //BA.debugLineNum = 132579339;BA.debugLine="CreateListOfColorsLayout";
__ref._createlistofcolorslayout /*String*/ (null);
RDebugUtils.currentLine=132579340;
 //BA.debugLineNum = 132579340;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 2dip, Borde";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,parent.__c.DipToCurrent((int) (2)),__ref._borderscolor /*int*/ ,parent.__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=132579341;
 //BA.debugLineNum = 132579341;BA.debugLine="For Each t As B4XFloatTextField In Array(txtNewVa";
if (true) break;

case 1:
//for
this.state = 4;
group13 = new Object[]{(Object)(__ref._txtnewvalue /*b4j.docU.b4xfloattextfield*/ )};
index13 = 0;
groupLen13 = group13.length;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 4;
if (index13 < groupLen13) {
this.state = 3;
_t = (b4j.docU.b4xfloattextfield)(group13[index13]);}
if (true) break;

case 7:
//C
this.state = 6;
index13++;
if (true) break;

case 3:
//C
this.state = 7;
RDebugUtils.currentLine=132579342;
 //BA.debugLineNum = 132579342;BA.debugLine="t.LargeLabelTextSize = 14";
_t._largelabeltextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=132579343;
 //BA.debugLineNum = 132579343;BA.debugLine="t.SmallLabelTextSize = 10";
_t._smalllabeltextsize /*float*/  = (float) (10);
RDebugUtils.currentLine=132579344;
 //BA.debugLineNum = 132579344;BA.debugLine="t.Update";
_t._update /*String*/ (null);
RDebugUtils.currentLine=132579345;
 //BA.debugLineNum = 132579345;BA.debugLine="t.TextField.SetColorAndBorder(xui.Color_Transpar";
_t._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,1,((int)0xffd2d2d2),0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=132579347;
 //BA.debugLineNum = 132579347;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=132579348;
 //BA.debugLineNum = 132579348;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _drawcolors(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "drawcolors", true))
	 {return ((String) Debug.delegate(ba, "drawcolors", null));}
int _x = 0;
int _y = 0;
RDebugUtils.currentLine=132972544;
 //BA.debugLineNum = 132972544;BA.debugLine="Private Sub DrawColors";
RDebugUtils.currentLine=132972545;
 //BA.debugLineNum = 132972545;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._bccolors /*b4j.example.bitmapcreator*/ ._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
RDebugUtils.currentLine=132972546;
 //BA.debugLineNum = 132972546;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._bccolors /*b4j.example.bitmapcreator*/ ._mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
RDebugUtils.currentLine=132972547;
 //BA.debugLineNum = 132972547;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
__ref._bccolors /*b4j.example.bitmapcreator*/ ._sethsv(_x,_y,__ref._selectedalpha /*int*/ ,(int) (__ref._selectedh /*float*/ ),(float) (_x/(double)__ref._bccolors /*b4j.example.bitmapcreator*/ ._mwidth),(float) ((__ref._bccolors /*b4j.example.bitmapcreator*/ ._mheight-_y)/(double)__ref._bccolors /*b4j.example.bitmapcreator*/ ._mheight));
 }
};
 }
};
RDebugUtils.currentLine=132972551;
 //BA.debugLineNum = 132972551;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__ref._bccolors /*b4j.example.bitmapcreator*/ ._getbitmap().Resize((int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__c.False).getObject()));
RDebugUtils.currentLine=132972552;
 //BA.debugLineNum = 132972552;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.bccolorpicker __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=133824512;
 //BA.debugLineNum = 133824512;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=133824513;
 //BA.debugLineNum = 133824513;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=133824514;
 //BA.debugLineNum = 133824514;BA.debugLine="End Sub";
return null;
}
public Object[]  _getselectedhsvcolor(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "getselectedhsvcolor", true))
	 {return ((Object[]) Debug.delegate(ba, "getselectedhsvcolor", null));}
RDebugUtils.currentLine=133627904;
 //BA.debugLineNum = 133627904;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
RDebugUtils.currentLine=133627905;
 //BA.debugLineNum = 133627905;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return new Object[]{(Object)(__ref._selectedh /*float*/ ),(Object)(__ref._selecteds /*float*/ ),(Object)(__ref._selectedv /*float*/ ),(Object)(__ref._selectedalpha /*int*/ )};
RDebugUtils.currentLine=133627906;
 //BA.debugLineNum = 133627906;BA.debugLine="End Sub";
return null;
}
public int  _hsvtocolor(b4j.docU.bccolorpicker __ref,int _alpha,float _h,float _s,float _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "hsvtocolor", true))
	 {return ((Integer) Debug.delegate(ba, "hsvtocolor", new Object[] {_alpha,_h,_s,_v}));}
float _r = 0f;
float _g = 0f;
float _b = 0f;
float _hi = 0f;
int _hbucket = 0;
float _f = 0f;
float _p = 0f;
float _q = 0f;
float _t = 0f;
RDebugUtils.currentLine=133496832;
 //BA.debugLineNum = 133496832;BA.debugLine="Private Sub HSVToColor(alpha As Int, h As Float, s";
RDebugUtils.currentLine=133496833;
 //BA.debugLineNum = 133496833;BA.debugLine="Dim r, g, b As Float";
_r = 0f;
_g = 0f;
_b = 0f;
RDebugUtils.currentLine=133496834;
 //BA.debugLineNum = 133496834;BA.debugLine="Dim hi As Float = Floor(h / 60)";
_hi = (float) (__c.Floor(_h/(double)60));
RDebugUtils.currentLine=133496835;
 //BA.debugLineNum = 133496835;BA.debugLine="Dim hbucket As Int =  hi Mod 6";
_hbucket = (int) (_hi%6);
RDebugUtils.currentLine=133496836;
 //BA.debugLineNum = 133496836;BA.debugLine="Dim f As Float = h / 60 - hi";
_f = (float) (_h/(double)60-_hi);
RDebugUtils.currentLine=133496837;
 //BA.debugLineNum = 133496837;BA.debugLine="Dim p As Float = v * (1 - s)";
_p = (float) (_v*(1-_s));
RDebugUtils.currentLine=133496838;
 //BA.debugLineNum = 133496838;BA.debugLine="Dim q As Float = v  * (1 - f * s)";
_q = (float) (_v*(1-_f*_s));
RDebugUtils.currentLine=133496839;
 //BA.debugLineNum = 133496839;BA.debugLine="Dim t As Float = v * (1 - (1 - f) * s)";
_t = (float) (_v*(1-(1-_f)*_s));
RDebugUtils.currentLine=133496840;
 //BA.debugLineNum = 133496840;BA.debugLine="Select hbucket";
switch (_hbucket) {
case 0: {
RDebugUtils.currentLine=133496842;
 //BA.debugLineNum = 133496842;BA.debugLine="r = v";
_r = _v;
RDebugUtils.currentLine=133496843;
 //BA.debugLineNum = 133496843;BA.debugLine="g = t";
_g = _t;
RDebugUtils.currentLine=133496844;
 //BA.debugLineNum = 133496844;BA.debugLine="b = p";
_b = _p;
 break; }
case 1: {
RDebugUtils.currentLine=133496846;
 //BA.debugLineNum = 133496846;BA.debugLine="r = q";
_r = _q;
RDebugUtils.currentLine=133496847;
 //BA.debugLineNum = 133496847;BA.debugLine="g = v";
_g = _v;
RDebugUtils.currentLine=133496848;
 //BA.debugLineNum = 133496848;BA.debugLine="b = p";
_b = _p;
 break; }
case 2: {
RDebugUtils.currentLine=133496850;
 //BA.debugLineNum = 133496850;BA.debugLine="r = p";
_r = _p;
RDebugUtils.currentLine=133496851;
 //BA.debugLineNum = 133496851;BA.debugLine="g = v";
_g = _v;
RDebugUtils.currentLine=133496852;
 //BA.debugLineNum = 133496852;BA.debugLine="b = t";
_b = _t;
 break; }
case 3: {
RDebugUtils.currentLine=133496854;
 //BA.debugLineNum = 133496854;BA.debugLine="r = p";
_r = _p;
RDebugUtils.currentLine=133496855;
 //BA.debugLineNum = 133496855;BA.debugLine="g = q";
_g = _q;
RDebugUtils.currentLine=133496856;
 //BA.debugLineNum = 133496856;BA.debugLine="b = v";
_b = _v;
 break; }
case 4: {
RDebugUtils.currentLine=133496858;
 //BA.debugLineNum = 133496858;BA.debugLine="r = t";
_r = _t;
RDebugUtils.currentLine=133496859;
 //BA.debugLineNum = 133496859;BA.debugLine="g = p";
_g = _p;
RDebugUtils.currentLine=133496860;
 //BA.debugLineNum = 133496860;BA.debugLine="b = v";
_b = _v;
 break; }
case 5: {
RDebugUtils.currentLine=133496862;
 //BA.debugLineNum = 133496862;BA.debugLine="r = v";
_r = _v;
RDebugUtils.currentLine=133496863;
 //BA.debugLineNum = 133496863;BA.debugLine="g = p";
_g = _p;
RDebugUtils.currentLine=133496864;
 //BA.debugLineNum = 133496864;BA.debugLine="b = q";
_b = _q;
 break; }
}
;
RDebugUtils.currentLine=133496866;
 //BA.debugLineNum = 133496866;BA.debugLine="Return xui.Color_ARGB(alpha, Round(r * 255), Roun";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(_alpha,(int) (__c.Round(_r*255)),(int) (__c.Round(_g*255)),(int) (__c.Round(_b*255)));
RDebugUtils.currentLine=133496867;
 //BA.debugLineNum = 133496867;BA.debugLine="End Sub";
return 0;
}
public String  _huebar_touch(b4j.docU.bccolorpicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "huebar_touch", true))
	 {return ((String) Debug.delegate(ba, "huebar_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=133955584;
 //BA.debugLineNum = 133955584;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=133955585;
 //BA.debugLineNum = 133955585;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=133955586;
 //BA.debugLineNum = 133955586;BA.debugLine="HueBarSelectedChanged(Y)";
__ref._huebarselectedchanged /*String*/ (null,_y);
RDebugUtils.currentLine=133955587;
 //BA.debugLineNum = 133955587;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.bccolorpicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=132513792;
 //BA.debugLineNum = 132513792;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=132513793;
 //BA.debugLineNum = 132513793;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=132513794;
 //BA.debugLineNum = 132513794;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=132513795;
 //BA.debugLineNum = 132513795;BA.debugLine="DeviceScale = 100dip / 100";
__ref._devicescale /*float*/  = (float) (__c.DipToCurrent((int) (100))/(double)100);
RDebugUtils.currentLine=132513796;
 //BA.debugLineNum = 132513796;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalidcolorstring(b4j.docU.bccolorpicker __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "isvalidcolorstring", true))
	 {return ((Boolean) Debug.delegate(ba, "isvalidcolorstring", new Object[] {_s}));}
RDebugUtils.currentLine=134217728;
 //BA.debugLineNum = 134217728;BA.debugLine="Private Sub IsValidColorString(s As String) As Boo";
RDebugUtils.currentLine=134217729;
 //BA.debugLineNum = 134217729;BA.debugLine="Return Regex.IsMatch2(\"[0-9a-f]{8}\", Regex.CASE_I";
if (true) return __c.Regex.IsMatch2("[0-9a-f]{8}",__c.Regex.CASE_INSENSITIVE,_s);
RDebugUtils.currentLine=134217730;
 //BA.debugLineNum = 134217730;BA.debugLine="End Sub";
return false;
}
public String  _lstcolors_itemclick(b4j.docU.bccolorpicker __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "lstcolors_itemclick", true))
	 {return ((String) Debug.delegate(ba, "lstcolors_itemclick", new Object[] {_index,_value}));}
Object[] _nameandvalue = null;
RDebugUtils.currentLine=134283264;
 //BA.debugLineNum = 134283264;BA.debugLine="Sub lstColors_ItemClick (Index As Int, Value As Ob";
RDebugUtils.currentLine=134283265;
 //BA.debugLineNum = 134283265;BA.debugLine="CSelections.ItemClicked(Index)";
__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._itemclicked /*String*/ (null,_index);
RDebugUtils.currentLine=134283266;
 //BA.debugLineNum = 134283266;BA.debugLine="Dim NameAndValue() As Object = Value";
_nameandvalue = (Object[])(_value);
RDebugUtils.currentLine=134283267;
 //BA.debugLineNum = 134283267;BA.debugLine="setSelectedColor(NameAndValue(1))";
__ref._setselectedcolor /*String*/ (null,(int)(BA.ObjectToNumber(_nameandvalue[(int) (1)])));
RDebugUtils.currentLine=134283268;
 //BA.debugLineNum = 134283268;BA.debugLine="End Sub";
return "";
}
public String  _lstcolors_visiblerangechanged(b4j.docU.bccolorpicker __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "lstcolors_visiblerangechanged", true))
	 {return ((String) Debug.delegate(ba, "lstcolors_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
Object[] _nameandvalue = null;
RDebugUtils.currentLine=134414336;
 //BA.debugLineNum = 134414336;BA.debugLine="Sub lstColors_VisibleRangeChanged (FirstIndex As I";
RDebugUtils.currentLine=134414337;
 //BA.debugLineNum = 134414337;BA.debugLine="For i = Max(0, FirstIndex - 5) To Min(lstColors.S";
{
final int step1 = 1;
final int limit1 = (int) (__c.Min(__ref._lstcolors /*b4j.example.customlistview*/ ._getsize()-1,_lastindex+5));
_i = (int) (__c.Max(0,_firstindex-5)) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=134414338;
 //BA.debugLineNum = 134414338;BA.debugLine="Dim p As B4XView = lstColors.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._lstcolors /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=134414339;
 //BA.debugLineNum = 134414339;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
RDebugUtils.currentLine=134414340;
 //BA.debugLineNum = 134414340;BA.debugLine="p.LoadLayout(\"ListOfColors\")";
_p.LoadLayout("ListOfColors",ba);
RDebugUtils.currentLine=134414341;
 //BA.debugLineNum = 134414341;BA.debugLine="Dim NameAndValue() As Object = lstColors.GetVal";
_nameandvalue = (Object[])(__ref._lstcolors /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=134414342;
 //BA.debugLineNum = 134414342;BA.debugLine="ColorLabel.Text = NameAndValue(0)";
__ref._colorlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_nameandvalue[(int) (0)]));
RDebugUtils.currentLine=134414343;
 //BA.debugLineNum = 134414343;BA.debugLine="ColorPanel.Color = NameAndValue(1)";
__ref._colorpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int)(BA.ObjectToNumber(_nameandvalue[(int) (1)])));
 };
 }
};
RDebugUtils.currentLine=134414346;
 //BA.debugLineNum = 134414346;BA.debugLine="CSelections.VisibleRangeChanged(FirstIndex, LastI";
__ref._cselections /*b4j.docU.clvselectionsjamtableview*/ ._visiblerangechanged /*String*/ (null,_firstindex,_lastindex);
RDebugUtils.currentLine=134414347;
 //BA.debugLineNum = 134414347;BA.debugLine="End Sub";
return "";
}
public String  _pnlprevvalue_mouseclicked(b4j.docU.bccolorpicker __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "pnlprevvalue_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "pnlprevvalue_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=134610944;
 //BA.debugLineNum = 134610944;BA.debugLine="Sub pnlPrevValue_MouseClicked (EventData As MouseE";
RDebugUtils.currentLine=134610945;
 //BA.debugLineNum = 134610945;BA.debugLine="setSelectedColor(pnlPrevValue.Color)";
__ref._setselectedcolor /*String*/ (null,__ref._pnlprevvalue /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=134610946;
 //BA.debugLineNum = 134610946;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=134610947;
 //BA.debugLineNum = 134610947;BA.debugLine="End Sub";
return "";
}
public String  _setselectedhsvcolor(b4j.docU.bccolorpicker __ref,Object[] _hsv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "setselectedhsvcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedhsvcolor", new Object[] {_hsv}));}
RDebugUtils.currentLine=133693440;
 //BA.debugLineNum = 133693440;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
RDebugUtils.currentLine=133693441;
 //BA.debugLineNum = 133693441;BA.debugLine="selectedH = HSV(0)";
__ref._selectedh /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (0)]));
RDebugUtils.currentLine=133693442;
 //BA.debugLineNum = 133693442;BA.debugLine="selectedS = HSV(1)";
__ref._selecteds /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (1)]));
RDebugUtils.currentLine=133693443;
 //BA.debugLineNum = 133693443;BA.debugLine="selectedV = HSV(2)";
__ref._selectedv /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (2)]));
RDebugUtils.currentLine=133693444;
 //BA.debugLineNum = 133693444;BA.debugLine="SelectedAlpha = HSV(3)";
__ref._selectedalpha /*int*/  = (int)(BA.ObjectToNumber(_hsv[(int) (3)]));
RDebugUtils.currentLine=133693445;
 //BA.debugLineNum = 133693445;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=133693446;
 //BA.debugLineNum = 133693446;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=133693447;
 //BA.debugLineNum = 133693447;BA.debugLine="End Sub";
return "";
}
public String  _txtnewvalue_enterpressed(b4j.docU.bccolorpicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "txtnewvalue_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "txtnewvalue_enterpressed", null));}
RDebugUtils.currentLine=134152192;
 //BA.debugLineNum = 134152192;BA.debugLine="Private Sub txtNewValue_EnterPressed";
RDebugUtils.currentLine=134152193;
 //BA.debugLineNum = 134152193;BA.debugLine="btnSetNew_Click";
__ref._btnsetnew_click /*String*/ (null);
RDebugUtils.currentLine=134152194;
 //BA.debugLineNum = 134152194;BA.debugLine="End Sub";
return "";
}
public void  _txtnewvalue_textchanged(b4j.docU.bccolorpicker __ref,String _old,String _new) throws Exception{
RDebugUtils.currentModule="bccolorpicker";
if (Debug.shouldDelegate(ba, "txtnewvalue_textchanged", true))
	 {Debug.delegate(ba, "txtnewvalue_textchanged", new Object[] {_old,_new}); return;}
ResumableSub_txtNewValue_TextChanged rsub = new ResumableSub_txtNewValue_TextChanged(this,__ref,_old,_new);
rsub.resume(ba, null);
}
public static class ResumableSub_txtNewValue_TextChanged extends BA.ResumableSub {
public ResumableSub_txtNewValue_TextChanged(b4j.docU.bccolorpicker parent,b4j.docU.bccolorpicker __ref,String _old,String _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
this.__ref = parent;
}
b4j.docU.bccolorpicker __ref;
b4j.docU.bccolorpicker parent;
String _old;
String _new;
int _myindex = 0;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
int _s = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bccolorpicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=134086657;
 //BA.debugLineNum = 134086657;BA.debugLine="TextChangedIndex = TextChangedIndex + 1";
__ref._textchangedindex /*int*/  = (int) (__ref._textchangedindex /*int*/ +1);
RDebugUtils.currentLine=134086658;
 //BA.debugLineNum = 134086658;BA.debugLine="Dim MyIndex As Int = TextChangedIndex";
_myindex = __ref._textchangedindex /*int*/ ;
RDebugUtils.currentLine=134086659;
 //BA.debugLineNum = 134086659;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bccolorpicker", "txtnewvalue_textchanged"),(int) (100));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=134086660;
 //BA.debugLineNum = 134086660;BA.debugLine="If MyIndex <> TextChangedIndex Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_myindex!=__ref._textchangedindex /*int*/ ) { 
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
RDebugUtils.currentLine=134086661;
 //BA.debugLineNum = 134086661;BA.debugLine="If txtNewValue.Text <> CurrentSelectedHex Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((__ref._txtnewvalue /*b4j.docU.b4xfloattextfield*/ ._gettext /*String*/ (null)).equals(__ref._currentselectedhex /*String*/ ) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=134086662;
 //BA.debugLineNum = 134086662;BA.debugLine="If IsValidColorString(New) Then";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._isvalidcolorstring /*boolean*/ (null,_new)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=134086663;
 //BA.debugLineNum = 134086663;BA.debugLine="Dim tf As TextField = txtNewValue.TextField";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_tf = (anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper(), (javafx.scene.control.TextField)(__ref._txtnewvalue /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=134086664;
 //BA.debugLineNum = 134086664;BA.debugLine="Dim s As Int = tf.SelectionStart";
_s = _tf.getSelectionStart();
RDebugUtils.currentLine=134086665;
 //BA.debugLineNum = 134086665;BA.debugLine="setSelectedColor(HexToColor(New))";
__ref._setselectedcolor /*String*/ (null,__ref._hextocolor /*int*/ (null,_new));
RDebugUtils.currentLine=134086666;
 //BA.debugLineNum = 134086666;BA.debugLine="tf.SetSelection(s, s)";
_tf.SetSelection(_s,_s);
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
RDebugUtils.currentLine=134086669;
 //BA.debugLineNum = 134086669;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}