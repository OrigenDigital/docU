package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcolortemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xcolortemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xcolortemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _colorpickerpart{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XCanvas cvs;
public anywheresoftware.b4a.objects.B4XViewWrapper pnl;
public anywheresoftware.b4a.objects.B4XViewWrapper iv;
public anywheresoftware.b4a.objects.B4XCanvas checkersCanvas;
public boolean DrawCheckers;
public void Initialize() {
IsInitialized = true;
cvs = new anywheresoftware.b4a.objects.B4XCanvas();
pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
checkersCanvas = new anywheresoftware.b4a.objects.B4XCanvas();
DrawCheckers = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
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
public b4j.example.bitmapcreator _tempbc = null;
public int _dont_change = 0;
public b4j.docU.b4xcolortemplate._colorpickerpart _huebar = null;
public b4j.docU.b4xcolortemplate._colorpickerpart _colorpicker = null;
public b4j.docU.b4xcolortemplate._colorpickerpart _alphabar = null;
public int _borderscolor = 0;
public b4j.docU.b4xdialog _xdialog = null;
public Object[] _initialcolor = null;
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
public String  _initialize(b4j.docU.b4xcolortemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=232062976;
 //BA.debugLineNum = 232062976;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=232062977;
 //BA.debugLineNum = 232062977;BA.debugLine="tempBC.Initialize(1, 1)";
__ref._tempbc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=232062978;
 //BA.debugLineNum = 232062978;BA.debugLine="DeviceScale = 100dip / 100";
__ref._devicescale /*float*/  = (float) (__c.DipToCurrent((int) (100))/(double)100);
RDebugUtils.currentLine=232062979;
 //BA.debugLineNum = 232062979;BA.debugLine="mBase = xui.CreatePanel(\"\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=232062980;
 //BA.debugLineNum = 232062980;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=232062981;
 //BA.debugLineNum = 232062981;BA.debugLine="BordersColor = xui.Color_Black";
__ref._borderscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=232062982;
 //BA.debugLineNum = 232062982;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=232062983;
 //BA.debugLineNum = 232062983;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4j.docU.b4xcolortemplate._colorpickerpart*/ (null,"hueBar",__c.False);
RDebugUtils.currentLine=232062984;
 //BA.debugLineNum = 232062984;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4j.docU.b4xcolortemplate._colorpickerpart*/ (null,"colors",__c.True);
RDebugUtils.currentLine=232062985;
 //BA.debugLineNum = 232062985;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4j.docU.b4xcolortemplate._colorpickerpart*/ (null,"alpha",__c.True);
RDebugUtils.currentLine=232062986;
 //BA.debugLineNum = 232062986;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=232062987;
 //BA.debugLineNum = 232062987;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcolor(b4j.docU.b4xcolortemplate __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedcolor", new Object[] {_i}));}
RDebugUtils.currentLine=232849408;
 //BA.debugLineNum = 232849408;BA.debugLine="Public Sub setSelectedColor(i As Int)";
RDebugUtils.currentLine=232849409;
 //BA.debugLineNum = 232849409;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
__ref._setselectedhsvcolor /*String*/ (null,__ref._colortohsv /*Object[]*/ (null,_i));
RDebugUtils.currentLine=232849410;
 //BA.debugLineNum = 232849410;BA.debugLine="End Sub";
return "";
}
public int  _getselectedcolor(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedcolor", null));}
Object[] _hsv = null;
RDebugUtils.currentLine=232783872;
 //BA.debugLineNum = 232783872;BA.debugLine="Public Sub getSelectedColor As Int";
RDebugUtils.currentLine=232783873;
 //BA.debugLineNum = 232783873;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
_hsv = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=232783874;
 //BA.debugLineNum = 232783874;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
__ref._tempbc /*b4j.example.bitmapcreator*/ ._sethsv((int) (0),(int) (0),__ref._selectedalpha /*int*/ ,(int)(BA.ObjectToNumber(_hsv[(int) (0)])),(float)(BA.ObjectToNumber(_hsv[(int) (1)])),(float)(BA.ObjectToNumber(_hsv[(int) (2)])));
RDebugUtils.currentLine=232783875;
 //BA.debugLineNum = 232783875;BA.debugLine="Return tempBC.GetColor(0, 0)";
if (true) return __ref._tempbc /*b4j.example.bitmapcreator*/ ._getcolor((int) (0),(int) (0));
RDebugUtils.currentLine=232783876;
 //BA.debugLineNum = 232783876;BA.debugLine="End Sub";
return 0;
}
public String  _alpha_touch(b4j.docU.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alpha_touch", true))
	 {return ((String) Debug.delegate(ba, "alpha_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=233504768;
 //BA.debugLineNum = 233504768;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=233504769;
 //BA.debugLineNum = 233504769;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=233504770;
 //BA.debugLineNum = 233504770;BA.debugLine="AlphaBarSelectedChange(x)";
__ref._alphabarselectedchange /*String*/ (null,_x);
RDebugUtils.currentLine=233504771;
 //BA.debugLineNum = 233504771;BA.debugLine="End Sub";
return "";
}
public String  _alphabarselectedchange(b4j.docU.b4xcolortemplate __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alphabarselectedchange", true))
	 {return ((String) Debug.delegate(ba, "alphabarselectedchange", new Object[] {_x}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=232587264;
 //BA.debugLineNum = 232587264;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
RDebugUtils.currentLine=232587265;
 //BA.debugLineNum = 232587265;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
__ref._selectedalpha /*int*/  = (int) (255*__c.Max(0,__c.Min(1,_x/(double)__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=232587266;
 //BA.debugLineNum = 232587266;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=232587267;
 //BA.debugLineNum = 232587267;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=232587268;
 //BA.debugLineNum = 232587268;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=232587269;
 //BA.debugLineNum = 232587269;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
_r.Initialize((float) (_x-__c.DipToCurrent((int) (3))),(float) (__c.DipToCurrent((int) (1))),(float) (_x+__c.DipToCurrent((int) (3))),(float) (__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=232587270;
 //BA.debugLineNum = 232587270;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,__c.True,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=232587271;
 //BA.debugLineNum = 232587271;BA.debugLine="AlphaBar.cvs.Invalidate";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=232587272;
 //BA.debugLineNum = 232587272;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=232587273;
 //BA.debugLineNum = 232587273;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=232652800;
 //BA.debugLineNum = 232652800;BA.debugLine="Private Sub Update";
RDebugUtils.currentLine=232652801;
 //BA.debugLineNum = 232652801;BA.debugLine="DrawColors";
__ref._drawcolors /*String*/ (null);
RDebugUtils.currentLine=232652802;
 //BA.debugLineNum = 232652802;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
__ref._handleselectedcolorchanged /*String*/ (null,__ref._dont_change /*int*/ ,__ref._dont_change /*int*/ );
RDebugUtils.currentLine=232652803;
 //BA.debugLineNum = 232652803;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.docU.b4xcolortemplate __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _r = 0;
int _w = 0;
b4j.docU.b4xcolortemplate._colorpickerpart _cpp = null;
int _i = 0;
RDebugUtils.currentLine=232194048;
 //BA.debugLineNum = 232194048;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=232194050;
 //BA.debugLineNum = 232194050;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
__ref._colorscale /*float*/  = (float) (__c.Max(1,__c.Max(_width,_height)/(double)100/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=232194051;
 //BA.debugLineNum = 232194051;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (30)),_height-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=232194052;
 //BA.debugLineNum = 232194052;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) (__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=232194053;
 //BA.debugLineNum = 232194053;BA.debugLine="Dim w As Int = Width - r - 1dip";
_w = (int) (_width-_r-__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=232194054;
 //BA.debugLineNum = 232194054;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=232194055;
 //BA.debugLineNum = 232194055;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
RDebugUtils.currentLine=232194056;
 //BA.debugLineNum = 232194056;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
RDebugUtils.currentLine=232194058;
 //BA.debugLineNum = 232194058;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,_height-__c.DipToCurrent((int) (31)),_w,__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=232194059;
 //BA.debugLineNum = 232194059;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,__c.DipToCurrent((int) (1)),_w,_height-__c.DipToCurrent((int) (3))-__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=232194060;
 //BA.debugLineNum = 232194060;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
__ref._bccolors /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._colorscale /*float*/ ),(int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._colorscale /*float*/ ));
RDebugUtils.currentLine=232194061;
 //BA.debugLineNum = 232194061;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
final Object[] group12 = new Object[]{(Object)(__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ )};
final int groupLen12 = group12.length
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (b4j.docU.b4xcolortemplate._colorpickerpart)(group12[index12]);
RDebugUtils.currentLine=232194062;
 //BA.debugLineNum = 232194062;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=232194063;
 //BA.debugLineNum = 232194063;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).SetLayoutAnimated((int) (0),0,0,_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
RDebugUtils.currentLine=232194065;
 //BA.debugLineNum = 232194065;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=232194066;
 //BA.debugLineNum = 232194066;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp.DrawCheckers /*boolean*/ ) { 
RDebugUtils.currentLine=232194067;
 //BA.debugLineNum = 232194067;BA.debugLine="DrawCheckers(cpp)";
__ref._drawcheckers /*String*/ (null,_cpp);
 };
 }
};
RDebugUtils.currentLine=232194070;
 //BA.debugLineNum = 232194070;BA.debugLine="DrawHueBar";
__ref._drawhuebar /*String*/ (null);
RDebugUtils.currentLine=232194071;
 //BA.debugLineNum = 232194071;BA.debugLine="DrawAlphaBar";
__ref._drawalphabar /*String*/ (null);
RDebugUtils.currentLine=232194072;
 //BA.debugLineNum = 232194072;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=232194073;
 //BA.debugLineNum = 232194073;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=232194074;
 //BA.debugLineNum = 232194074;BA.debugLine="End Sub";
return "";
}
public String  _drawcheckers(b4j.docU.b4xcolortemplate __ref,b4j.docU.b4xcolortemplate._colorpickerpart _cpp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcheckers", true))
	 {return ((String) Debug.delegate(ba, "drawcheckers", new Object[] {_cpp}));}
int _size = 0;
int[] _clrs = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _x = 0;
int _xx = 0;
int _y = 0;
RDebugUtils.currentLine=232259584;
 //BA.debugLineNum = 232259584;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
RDebugUtils.currentLine=232259585;
 //BA.debugLineNum = 232259585;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=232259586;
 //BA.debugLineNum = 232259586;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=232259587;
 //BA.debugLineNum = 232259587;BA.debugLine="Dim size As Int = 10dip";
_size = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=232259588;
 //BA.debugLineNum = 232259588;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = new int[]{((int)0xffc0c0c0),((int)0xff757575)};
RDebugUtils.currentLine=232259589;
 //BA.debugLineNum = 232259589;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
RDebugUtils.currentLine=232259590;
 //BA.debugLineNum = 232259590;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=232259591;
 //BA.debugLineNum = 232259591;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
final int step7 = _size;
final int limit7 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()-__c.DipToCurrent((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
RDebugUtils.currentLine=232259592;
 //BA.debugLineNum = 232259592;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
RDebugUtils.currentLine=232259593;
 //BA.debugLineNum = 232259593;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
RDebugUtils.currentLine=232259594;
 //BA.debugLineNum = 232259594;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
final int step10 = _size;
final int limit10 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
RDebugUtils.currentLine=232259595;
 //BA.debugLineNum = 232259595;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
RDebugUtils.currentLine=232259596;
 //BA.debugLineNum = 232259596;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
_r.Initialize((float) (_x),(float) (_y),(float) (_x+_size),(float) (_y+_size));
RDebugUtils.currentLine=232259597;
 //BA.debugLineNum = 232259597;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_clrs[_clr],__c.True,(float) (0));
 }
};
 }
};
RDebugUtils.currentLine=232259600;
 //BA.debugLineNum = 232259600;BA.debugLine="cpp.checkersCanvas.Invalidate";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=232259601;
 //BA.debugLineNum = 232259601;BA.debugLine="End Sub";
return "";
}
public String  _drawhuebar(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawhuebar", true))
	 {return ((String) Debug.delegate(ba, "drawhuebar", null));}
b4j.example.bitmapcreator _bchue = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=232325120;
 //BA.debugLineNum = 232325120;BA.debugLine="Private Sub DrawHueBar";
RDebugUtils.currentLine=232325121;
 //BA.debugLineNum = 232325121;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=232325122;
 //BA.debugLineNum = 232325122;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
_bchue._initialize(ba,(int) (__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=232325123;
 //BA.debugLineNum = 232325123;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
final int step3 = 1;
final int limit3 = (int) (_bchue._mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=232325124;
 //BA.debugLineNum = 232325124;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
final int step4 = 1;
final int limit4 = (int) (_bchue._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=232325125;
 //BA.debugLineNum = 232325125;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
_bchue._sethsv(_x,_y,(int) (255),(int) (360/(double)_bchue._mheight*_y),(float) (1),(float) (1));
 }
};
 }
};
RDebugUtils.currentLine=232325128;
 //BA.debugLineNum = 232325128;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_bchue._getbitmap().getObject()));
RDebugUtils.currentLine=232325129;
 //BA.debugLineNum = 232325129;BA.debugLine="End Sub";
return "";
}
public String  _drawalphabar(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawalphabar", true))
	 {return ((String) Debug.delegate(ba, "drawalphabar", null));}
b4j.example.bitmapcreator _bc = null;
b4j.example.bitmapcreator._argbcolor _argb = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=232390656;
 //BA.debugLineNum = 232390656;BA.debugLine="Private Sub DrawAlphaBar";
RDebugUtils.currentLine=232390657;
 //BA.debugLineNum = 232390657;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=232390658;
 //BA.debugLineNum = 232390658;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
_bc._initialize(ba,(int) (__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=232390659;
 //BA.debugLineNum = 232390659;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=232390660;
 //BA.debugLineNum = 232390660;BA.debugLine="argb.r = 0xcc";
_argb.r = ((int)0xcc);
RDebugUtils.currentLine=232390661;
 //BA.debugLineNum = 232390661;BA.debugLine="argb.g = 0xcc";
_argb.g = ((int)0xcc);
RDebugUtils.currentLine=232390662;
 //BA.debugLineNum = 232390662;BA.debugLine="argb.b = 0xcc";
_argb.b = ((int)0xcc);
RDebugUtils.currentLine=232390664;
 //BA.debugLineNum = 232390664;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=232390665;
 //BA.debugLineNum = 232390665;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=232390666;
 //BA.debugLineNum = 232390666;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb.a = (int) (_x/(double)_bc._mwidth*255);
RDebugUtils.currentLine=232390667;
 //BA.debugLineNum = 232390667;BA.debugLine="bc.SetARGB(x, y, argb)";
_bc._setargb(_x,_y,_argb);
 }
};
 }
};
RDebugUtils.currentLine=232390670;
 //BA.debugLineNum = 232390670;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_bc._getbitmap().getObject()));
RDebugUtils.currentLine=232390671;
 //BA.debugLineNum = 232390671;BA.debugLine="End Sub";
return "";
}
public String  _huebarselectedchanged(b4j.docU.b4xcolortemplate __ref,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebarselectedchanged", true))
	 {return ((String) Debug.delegate(ba, "huebarselectedchanged", new Object[] {_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=232521728;
 //BA.debugLineNum = 232521728;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
RDebugUtils.currentLine=232521729;
 //BA.debugLineNum = 232521729;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
__ref._selectedh /*float*/  = (float) (__c.Max(0,__c.Min(360,360*_y/(double)__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=232521730;
 //BA.debugLineNum = 232521730;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (__ref._selectedh /*float*/ *__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)360);
RDebugUtils.currentLine=232521731;
 //BA.debugLineNum = 232521731;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=232521732;
 //BA.debugLineNum = 232521732;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=232521733;
 //BA.debugLineNum = 232521733;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
_r.Initialize((float) (0),(float) (_y-__c.DipToCurrent((int) (3))),__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),(float) (_y+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=232521734;
 //BA.debugLineNum = 232521734;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=232521735;
 //BA.debugLineNum = 232521735;BA.debugLine="HueBar.cvs.Invalidate";
__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=232521736;
 //BA.debugLineNum = 232521736;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=232521737;
 //BA.debugLineNum = 232521737;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
RDebugUtils.currentLine=231997440;
 //BA.debugLineNum = 231997440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=231997441;
 //BA.debugLineNum = 231997441;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=231997442;
 //BA.debugLineNum = 231997442;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=231997443;
 //BA.debugLineNum = 231997443;BA.debugLine="Private SelectedAlpha As Int = 255";
_selectedalpha = (int) (255);
RDebugUtils.currentLine=231997444;
 //BA.debugLineNum = 231997444;BA.debugLine="Private bcColors As BitmapCreator";
_bccolors = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=231997445;
 //BA.debugLineNum = 231997445;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
_selectedh = (float) (60);
_selecteds = (float) (0.5);
_selectedv = (float) (0.5);
RDebugUtils.currentLine=231997446;
 //BA.debugLineNum = 231997446;BA.debugLine="Private DeviceScale, ColorScale As Float";
_devicescale = 0f;
_colorscale = 0f;
RDebugUtils.currentLine=231997447;
 //BA.debugLineNum = 231997447;BA.debugLine="Private tempBC As BitmapCreator";
_tempbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=231997448;
 //BA.debugLineNum = 231997448;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
_dont_change = (int) (-999999999);
RDebugUtils.currentLine=231997449;
 //BA.debugLineNum = 231997449;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
RDebugUtils.currentLine=231997450;
 //BA.debugLineNum = 231997450;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
_huebar = new b4j.docU.b4xcolortemplate._colorpickerpart();
_colorpicker = new b4j.docU.b4xcolortemplate._colorpickerpart();
_alphabar = new b4j.docU.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=231997451;
 //BA.debugLineNum = 231997451;BA.debugLine="Private BordersColor As Int";
_borderscolor = 0;
RDebugUtils.currentLine=231997452;
 //BA.debugLineNum = 231997452;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=231997453;
 //BA.debugLineNum = 231997453;BA.debugLine="Private InitialColor() As Object";
_initialcolor = new Object[(int) (0)];
{
int d0 = _initialcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_initialcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=231997454;
 //BA.debugLineNum = 231997454;BA.debugLine="End Sub";
return "";
}
public String  _colors_touch(b4j.docU.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "colors_touch", true))
	 {return ((String) Debug.delegate(ba, "colors_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=233373696;
 //BA.debugLineNum = 233373696;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=233373697;
 //BA.debugLineNum = 233373697;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=233373698;
 //BA.debugLineNum = 233373698;BA.debugLine="HandleSelectedColorChanged(X, Y)";
__ref._handleselectedcolorchanged /*String*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=233373699;
 //BA.debugLineNum = 233373699;BA.debugLine="End Sub";
return "";
}
public String  _handleselectedcolorchanged(b4j.docU.b4xcolortemplate __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "handleselectedcolorchanged", true))
	 {return ((String) Debug.delegate(ba, "handleselectedcolorchanged", new Object[] {_x,_y}));}
RDebugUtils.currentLine=232718336;
 //BA.debugLineNum = 232718336;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
RDebugUtils.currentLine=232718337;
 //BA.debugLineNum = 232718337;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=__ref._dont_change /*int*/ ) { 
RDebugUtils.currentLine=232718338;
 //BA.debugLineNum = 232718338;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
__ref._selecteds /*float*/  = (float) (__c.Max(0,__c.Min(1,_x/(double)__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=232718339;
 //BA.debugLineNum = 232718339;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
__ref._selectedv /*float*/  = (float) (__c.Max(0,__c.Min(1,(__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_y)/(double)__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
RDebugUtils.currentLine=232718341;
 //BA.debugLineNum = 232718341;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=232718342;
 //BA.debugLineNum = 232718342;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._selecteds /*float*/ *__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._selectedv /*float*/ *__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(float) (__c.DipToCurrent((int) (10))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=232718344;
 //BA.debugLineNum = 232718344;BA.debugLine="ColorPicker.cvs.Invalidate";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=232718345;
 //BA.debugLineNum = 232718345;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=232718346;
 //BA.debugLineNum = 232718346;BA.debugLine="End Sub";
return "";
}
public Object[]  _colortohsv(b4j.docU.b4xcolortemplate __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
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
RDebugUtils.currentLine=233046016;
 //BA.debugLineNum = 233046016;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
RDebugUtils.currentLine=233046017;
 //BA.debugLineNum = 233046017;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (24)));
RDebugUtils.currentLine=233046018;
 //BA.debugLineNum = 233046018;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (16)));
RDebugUtils.currentLine=233046019;
 //BA.debugLineNum = 233046019;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (8)));
RDebugUtils.currentLine=233046020;
 //BA.debugLineNum = 233046020;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (0)));
RDebugUtils.currentLine=233046021;
 //BA.debugLineNum = 233046021;BA.debugLine="Dim h, s, v As Float";
_h = 0f;
_s = 0f;
_v = 0f;
RDebugUtils.currentLine=233046022;
 //BA.debugLineNum = 233046022;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (__c.Max(__c.Max(_r,_g),_b));
RDebugUtils.currentLine=233046023;
 //BA.debugLineNum = 233046023;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (__c.Min(__c.Min(_r,_g),_b));
RDebugUtils.currentLine=233046024;
 //BA.debugLineNum = 233046024;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
RDebugUtils.currentLine=233046025;
 //BA.debugLineNum = 233046025;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
RDebugUtils.currentLine=233046026;
 //BA.debugLineNum = 233046026;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
RDebugUtils.currentLine=233046028;
 //BA.debugLineNum = 233046028;BA.debugLine="If s = 0 Then";
if (_s==0) { 
RDebugUtils.currentLine=233046029;
 //BA.debugLineNum = 233046029;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
RDebugUtils.currentLine=233046031;
 //BA.debugLineNum = 233046031;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=233046032;
 //BA.debugLineNum = 233046032;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=233046033;
 //BA.debugLineNum = 233046033;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=233046034;
 //BA.debugLineNum = 233046034;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
RDebugUtils.currentLine=233046035;
 //BA.debugLineNum = 233046035;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else 
{RDebugUtils.currentLine=233046036;
 //BA.debugLineNum = 233046036;BA.debugLine="Else If g = cmax Then";
if (_g==_cmax) { 
RDebugUtils.currentLine=233046037;
 //BA.debugLineNum = 233046037;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
RDebugUtils.currentLine=233046039;
 //BA.debugLineNum = 233046039;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 }}
;
RDebugUtils.currentLine=233046041;
 //BA.debugLineNum = 233046041;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
RDebugUtils.currentLine=233046042;
 //BA.debugLineNum = 233046042;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
RDebugUtils.currentLine=233046044;
 //BA.debugLineNum = 233046044;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return new Object[]{(Object)(_h*360),(Object)(_s),(Object)(_v),(Object)(_a)};
RDebugUtils.currentLine=233046045;
 //BA.debugLineNum = 233046045;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4xcolortemplate._colorpickerpart  _createpanelforbitmapcreator(b4j.docU.b4xcolortemplate __ref,String _eventname,boolean _withcheckers) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "createpanelforbitmapcreator", true))
	 {return ((b4j.docU.b4xcolortemplate._colorpickerpart) Debug.delegate(ba, "createpanelforbitmapcreator", new Object[] {_eventname,_withcheckers}));}
b4j.docU.b4xcolortemplate._colorpickerpart _cpp = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _overlay = null;
RDebugUtils.currentLine=232128512;
 //BA.debugLineNum = 232128512;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
RDebugUtils.currentLine=232128513;
 //BA.debugLineNum = 232128513;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = new b4j.docU.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=232128514;
 //BA.debugLineNum = 232128514;BA.debugLine="cpp.Initialize";
_cpp.Initialize();
RDebugUtils.currentLine=232128515;
 //BA.debugLineNum = 232128515;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=232128516;
 //BA.debugLineNum = 232128516;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,0);
RDebugUtils.currentLine=232128517;
 //BA.debugLineNum = 232128517;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=232128518;
 //BA.debugLineNum = 232128518;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
RDebugUtils.currentLine=232128519;
 //BA.debugLineNum = 232128519;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=232128520;
 //BA.debugLineNum = 232128520;BA.debugLine="cpp.DrawCheckers = True";
_cpp.DrawCheckers /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=232128522;
 //BA.debugLineNum = 232128522;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=232128523;
 //BA.debugLineNum = 232128523;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=232128524;
 //BA.debugLineNum = 232128524;BA.debugLine="cpp.iv = iv";
_cpp.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=232128525;
 //BA.debugLineNum = 232128525;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_overlay = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_eventname);
RDebugUtils.currentLine=232128526;
 //BA.debugLineNum = 232128526;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_iv.getObject()),0,0,0,0);
RDebugUtils.currentLine=232128527;
 //BA.debugLineNum = 232128527;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_overlay.getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=232128528;
 //BA.debugLineNum = 232128528;BA.debugLine="cpp.cvs.Initialize(overlay)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_overlay);
RDebugUtils.currentLine=232128529;
 //BA.debugLineNum = 232128529;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
RDebugUtils.currentLine=232128530;
 //BA.debugLineNum = 232128530;BA.debugLine="Return cpp";
if (true) return _cpp;
RDebugUtils.currentLine=232128531;
 //BA.debugLineNum = 232128531;BA.debugLine="End Sub";
return null;
}
public String  _dialogclosed(b4j.docU.b4xcolortemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=233242624;
 //BA.debugLineNum = 233242624;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=233242625;
 //BA.debugLineNum = 233242625;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=233242626;
 //BA.debugLineNum = 233242626;BA.debugLine="setSelectedHSVColor(InitialColor)";
__ref._setselectedhsvcolor /*String*/ (null,__ref._initialcolor /*Object[]*/ );
 };
RDebugUtils.currentLine=233242628;
 //BA.debugLineNum = 233242628;BA.debugLine="End Sub";
return "";
}
public String  _setselectedhsvcolor(b4j.docU.b4xcolortemplate __ref,Object[] _hsv) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedhsvcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedhsvcolor", new Object[] {_hsv}));}
RDebugUtils.currentLine=232980480;
 //BA.debugLineNum = 232980480;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
RDebugUtils.currentLine=232980481;
 //BA.debugLineNum = 232980481;BA.debugLine="selectedH = HSV(0)";
__ref._selectedh /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (0)]));
RDebugUtils.currentLine=232980482;
 //BA.debugLineNum = 232980482;BA.debugLine="selectedS = HSV(1)";
__ref._selecteds /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (1)]));
RDebugUtils.currentLine=232980483;
 //BA.debugLineNum = 232980483;BA.debugLine="selectedV = HSV(2)";
__ref._selectedv /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (2)]));
RDebugUtils.currentLine=232980484;
 //BA.debugLineNum = 232980484;BA.debugLine="SelectedAlpha = HSV(3)";
__ref._selectedalpha /*int*/  = (int)(BA.ObjectToNumber(_hsv[(int) (3)]));
RDebugUtils.currentLine=232980485;
 //BA.debugLineNum = 232980485;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=232980486;
 //BA.debugLineNum = 232980486;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=232980487;
 //BA.debugLineNum = 232980487;BA.debugLine="End Sub";
return "";
}
public String  _drawcolors(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcolors", true))
	 {return ((String) Debug.delegate(ba, "drawcolors", null));}
int _x = 0;
int _y = 0;
RDebugUtils.currentLine=232456192;
 //BA.debugLineNum = 232456192;BA.debugLine="Private Sub DrawColors";
RDebugUtils.currentLine=232456193;
 //BA.debugLineNum = 232456193;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._bccolors /*b4j.example.bitmapcreator*/ ._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
RDebugUtils.currentLine=232456194;
 //BA.debugLineNum = 232456194;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._bccolors /*b4j.example.bitmapcreator*/ ._mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
RDebugUtils.currentLine=232456195;
 //BA.debugLineNum = 232456195;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
__ref._bccolors /*b4j.example.bitmapcreator*/ ._sethsv(_x,_y,__ref._selectedalpha /*int*/ ,(int) (__ref._selectedh /*float*/ ),(float) (_x/(double)__ref._bccolors /*b4j.example.bitmapcreator*/ ._mwidth),(float) ((__ref._bccolors /*b4j.example.bitmapcreator*/ ._mheight-_y)/(double)__ref._bccolors /*b4j.example.bitmapcreator*/ ._mheight));
 }
};
 }
};
RDebugUtils.currentLine=232456199;
 //BA.debugLineNum = 232456199;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__ref._bccolors /*b4j.example.bitmapcreator*/ ._getbitmap().Resize((int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(int) (__ref._colorpicker /*b4j.docU.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),__c.False).getObject()));
RDebugUtils.currentLine=232456200;
 //BA.debugLineNum = 232456200;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.b4xcolortemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=233111552;
 //BA.debugLineNum = 233111552;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=233111553;
 //BA.debugLineNum = 233111553;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=233111554;
 //BA.debugLineNum = 233111554;BA.debugLine="End Sub";
return null;
}
public Object[]  _getselectedhsvcolor(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedhsvcolor", true))
	 {return ((Object[]) Debug.delegate(ba, "getselectedhsvcolor", null));}
RDebugUtils.currentLine=232914944;
 //BA.debugLineNum = 232914944;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
RDebugUtils.currentLine=232914945;
 //BA.debugLineNum = 232914945;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return new Object[]{(Object)(__ref._selectedh /*float*/ ),(Object)(__ref._selecteds /*float*/ ),(Object)(__ref._selectedv /*float*/ ),(Object)(__ref._selectedalpha /*int*/ )};
RDebugUtils.currentLine=232914946;
 //BA.debugLineNum = 232914946;BA.debugLine="End Sub";
return null;
}
public String  _updatebarcolor(b4j.docU.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "updatebarcolor", true))
	 {return ((String) Debug.delegate(ba, "updatebarcolor", null));}
RDebugUtils.currentLine=233308160;
 //BA.debugLineNum = 233308160;BA.debugLine="Private Sub UpdateBarColor";
RDebugUtils.currentLine=233308161;
 //BA.debugLineNum = 233308161;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
if (__ref._xdialog /*b4j.docU.b4xdialog*/ .IsInitialized /*boolean*/ () && __ref._xdialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=233308162;
 //BA.debugLineNum = 233308162;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
__ref._xdialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._getselectedcolor /*int*/ (null));
 };
RDebugUtils.currentLine=233308164;
 //BA.debugLineNum = 233308164;BA.debugLine="End Sub";
return "";
}
public String  _huebar_touch(b4j.docU.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebar_touch", true))
	 {return ((String) Debug.delegate(ba, "huebar_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=233439232;
 //BA.debugLineNum = 233439232;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=233439233;
 //BA.debugLineNum = 233439233;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=233439234;
 //BA.debugLineNum = 233439234;BA.debugLine="HueBarSelectedChanged(Y)";
__ref._huebarselectedchanged /*String*/ (null,_y);
RDebugUtils.currentLine=233439235;
 //BA.debugLineNum = 233439235;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.b4xcolortemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.b4xcolortemplate parent,b4j.docU.b4xcolortemplate __ref,b4j.docU.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.docU.b4xcolortemplate __ref;
b4j.docU.b4xcolortemplate parent;
b4j.docU.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcolortemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=233177089;
 //BA.debugLineNum = 233177089;BA.debugLine="InitialColor = getSelectedHSVColor";
__ref._initialcolor /*Object[]*/  = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=233177090;
 //BA.debugLineNum = 233177090;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4j.docU.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=233177091;
 //BA.debugLineNum = 233177091;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcolortemplate", "show"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=233177092;
 //BA.debugLineNum = 233177092;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=233177093;
 //BA.debugLineNum = 233177093;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}