package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlstyle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlstyle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlstyle.class).invoke(this, new Object[] {null});
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
public String _style_key_horizontal_alignment = "";
public String _style_key_border_bottom = "";
public String _style_key_border_left = "";
public String _style_key_border_right = "";
public String _style_key_border_top = "";
public String _style_key_bottom_border_color = "";
public String _style_key_left_border_color = "";
public String _style_key_right_border_color = "";
public String _style_key_top_border_color = "";
public String _style_key_data_format = "";
public String _style_key_fill_foreground_color = "";
public String _style_key_fill_pattern = "";
public String _style_key_font = "";
public String _style_key_hidden = "";
public String _style_key_indention = "";
public String _style_key_locked = "";
public String _style_key_rotation = "";
public String _style_key_vertical_alignment = "";
public String _style_key_wrap_text = "";
public anywheresoftware.b4j.object.JavaObject _bba = null;
public anywheresoftware.b4a.objects.collections.Map _stylemap = null;
public b4j.docU.xlworkbookwriter _writer = null;
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
public b4j.docU.xlstyle  _fontcolor(b4j.docU.xlstyle __ref,short _size,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "fontcolor", new Object[] {_size,_color}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=224395264;
 //BA.debugLineNum = 224395264;BA.debugLine="Public Sub FontColor (Size As Short, Color As Int)";
RDebugUtils.currentLine=224395265;
 //BA.debugLineNum = 224395265;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, False, wr";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = __ref._writer /*b4j.docU.xlworkbookwriter*/ ._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (null,_size,__c.False,__ref._writer /*b4j.docU.xlworkbookwriter*/ ._defaultfontname /*String*/ ,__c.False,__c.False,_color);
RDebugUtils.currentLine=224395266;
 //BA.debugLineNum = 224395266;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_f.getIndex()));
RDebugUtils.currentLine=224395267;
 //BA.debugLineNum = 224395267;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224395268;
 //BA.debugLineNum = 224395268;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _foregroundcolor(b4j.docU.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "foregroundcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "foregroundcolor", new Object[] {_color}));}
RDebugUtils.currentLine=223084544;
 //BA.debugLineNum = 223084544;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLS";
RDebugUtils.currentLine=223084545;
 //BA.debugLineNum = 223084545;BA.debugLine="StyleMap.Put(STYLE_KEY_FILL_FOREGROUND_COLOR, Col";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_fill_foreground_color /*String*/ ),(Object)(_color));
RDebugUtils.currentLine=223084546;
 //BA.debugLineNum = 223084546;BA.debugLine="StyleMap.Put(STYLE_KEY_FILL_PATTERN, \"SOLID_FOREG";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_fill_pattern /*String*/ ),(Object)("SOLID_FOREGROUND"));
RDebugUtils.currentLine=223084547;
 //BA.debugLineNum = 223084547;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223084548;
 //BA.debugLineNum = 223084548;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _dataformat(b4j.docU.xlstyle __ref,String _format) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "dataformat", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "dataformat", new Object[] {_format}));}
short _ix = (short)0;
RDebugUtils.currentLine=223805440;
 //BA.debugLineNum = 223805440;BA.debugLine="Public Sub DataFormat (Format As String) As XLStyl";
RDebugUtils.currentLine=223805441;
 //BA.debugLineNum = 223805441;BA.debugLine="Dim ix As Short = writer.jWorkbook.RunMethodJO(\"c";
_ix = (short)(BA.ObjectToNumber(__ref._writer /*b4j.docU.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("createDataFormat",(Object[])(__c.Null)).RunMethod("getFormat",new Object[]{(Object)(_format)})));
RDebugUtils.currentLine=223805442;
 //BA.debugLineNum = 223805442;BA.debugLine="StyleMap.Put(STYLE_KEY_DATA_FORMAT, ix)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_data_format /*String*/ ),(Object)(_ix));
RDebugUtils.currentLine=223805443;
 //BA.debugLineNum = 223805443;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223805444;
 //BA.debugLineNum = 223805444;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _fontlink(b4j.docU.xlstyle __ref,short _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontlink", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "fontlink", new Object[] {_size}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=224526336;
 //BA.debugLineNum = 224526336;BA.debugLine="Public Sub FontLink (Size As Short) As XLStyle";
RDebugUtils.currentLine=224526337;
 //BA.debugLineNum = 224526337;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, False, wr";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = __ref._writer /*b4j.docU.xlworkbookwriter*/ ._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (null,_size,__c.False,__ref._writer /*b4j.docU.xlworkbookwriter*/ ._defaultfontname /*String*/ ,__c.False,__c.True,(int) (__ref._writer /*b4j.docU.xlworkbookwriter*/ ._xl /*b4j.docU.xlutils*/ ._color_blue /*short*/ ));
RDebugUtils.currentLine=224526338;
 //BA.debugLineNum = 224526338;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_f.getIndex()));
RDebugUtils.currentLine=224526339;
 //BA.debugLineNum = 224526339;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224526340;
 //BA.debugLineNum = 224526340;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _horizontalalignment(b4j.docU.xlstyle __ref,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "horizontalalignment", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "horizontalalignment", new Object[] {_alignment}));}
RDebugUtils.currentLine=224264192;
 //BA.debugLineNum = 224264192;BA.debugLine="Public Sub HorizontalAlignment (Alignment As Strin";
RDebugUtils.currentLine=224264193;
 //BA.debugLineNum = 224264193;BA.debugLine="StyleMap.Put(STYLE_KEY_HORIZONTAL_ALIGNMENT, Alig";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_horizontal_alignment /*String*/ ),(Object)(_alignment));
RDebugUtils.currentLine=224264194;
 //BA.debugLineNum = 224264194;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224264195;
 //BA.debugLineNum = 224264195;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _fontboldcolor(b4j.docU.xlstyle __ref,short _size,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontboldcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "fontboldcolor", new Object[] {_size,_color}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=224591872;
 //BA.debugLineNum = 224591872;BA.debugLine="Public Sub FontBoldColor (Size As Short, Color As";
RDebugUtils.currentLine=224591873;
 //BA.debugLineNum = 224591873;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, True, wri";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = __ref._writer /*b4j.docU.xlworkbookwriter*/ ._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (null,_size,__c.True,__ref._writer /*b4j.docU.xlworkbookwriter*/ ._defaultfontname /*String*/ ,__c.False,__c.False,_color);
RDebugUtils.currentLine=224591874;
 //BA.debugLineNum = 224591874;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_f.getIndex()));
RDebugUtils.currentLine=224591875;
 //BA.debugLineNum = 224591875;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224591876;
 //BA.debugLineNum = 224591876;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _borderleft(b4j.docU.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderleft", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "borderleft", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=224002048;
 //BA.debugLineNum = 224002048;BA.debugLine="Public Sub BorderLeft (BorderStyle As String) As X";
RDebugUtils.currentLine=224002049;
 //BA.debugLineNum = 224002049;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_LEFT, BorderSty";
if (true) return __ref._setborder /*b4j.docU.xlstyle*/ (null,__ref._style_key_border_left /*String*/ ,_borderstyle);
RDebugUtils.currentLine=224002050;
 //BA.debugLineNum = 224002050;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _borderright(b4j.docU.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderright", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "borderright", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=224067584;
 //BA.debugLineNum = 224067584;BA.debugLine="Public Sub BorderRight (BorderStyle As String) As";
RDebugUtils.currentLine=224067585;
 //BA.debugLineNum = 224067585;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_RIGHT, BorderSt";
if (true) return __ref._setborder /*b4j.docU.xlstyle*/ (null,__ref._style_key_border_right /*String*/ ,_borderstyle);
RDebugUtils.currentLine=224067586;
 //BA.debugLineNum = 224067586;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _borderbottom(b4j.docU.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderbottom", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "borderbottom", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=223870976;
 //BA.debugLineNum = 223870976;BA.debugLine="Public Sub BorderBottom (BorderStyle As String) As";
RDebugUtils.currentLine=223870977;
 //BA.debugLineNum = 223870977;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_BOTTOM, BorderS";
if (true) return __ref._setborder /*b4j.docU.xlstyle*/ (null,__ref._style_key_border_bottom /*String*/ ,_borderstyle);
RDebugUtils.currentLine=223870978;
 //BA.debugLineNum = 223870978;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _setborder(b4j.docU.xlstyle __ref,String _property,String _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "setborder", new Object[] {_property,_style}));}
RDebugUtils.currentLine=224133120;
 //BA.debugLineNum = 224133120;BA.debugLine="Private Sub SetBorder (Property As String, Style A";
RDebugUtils.currentLine=224133121;
 //BA.debugLineNum = 224133121;BA.debugLine="StyleMap.Put(Property, Style)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_property),(Object)(_style));
RDebugUtils.currentLine=224133122;
 //BA.debugLineNum = 224133122;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224133123;
 //BA.debugLineNum = 224133123;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _borderbottomcolor(b4j.docU.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderbottomcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "borderbottomcolor", new Object[] {_color}));}
RDebugUtils.currentLine=223477760;
 //BA.debugLineNum = 223477760;BA.debugLine="Public Sub BorderBottomColor (Color As Short) As X";
RDebugUtils.currentLine=223477761;
 //BA.debugLineNum = 223477761;BA.debugLine="Return SetBorderColor(STYLE_KEY_BOTTOM_BORDER_COL";
if (true) return __ref._setbordercolor /*b4j.docU.xlstyle*/ (null,__ref._style_key_bottom_border_color /*String*/ ,_color);
RDebugUtils.currentLine=223477762;
 //BA.debugLineNum = 223477762;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _setbordercolor(b4j.docU.xlstyle __ref,String _property,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "setbordercolor", new Object[] {_property,_color}));}
RDebugUtils.currentLine=223739904;
 //BA.debugLineNum = 223739904;BA.debugLine="Private Sub SetBorderColor (Property As String, Co";
RDebugUtils.currentLine=223739905;
 //BA.debugLineNum = 223739905;BA.debugLine="StyleMap.Put(Property, Color)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_property),(Object)(_color));
RDebugUtils.currentLine=223739906;
 //BA.debugLineNum = 223739906;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223739907;
 //BA.debugLineNum = 223739907;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _borderleftcolor(b4j.docU.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderleftcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "borderleftcolor", new Object[] {_color}));}
RDebugUtils.currentLine=223608832;
 //BA.debugLineNum = 223608832;BA.debugLine="Public Sub BorderLeftColor (Color As Short) As XLS";
RDebugUtils.currentLine=223608833;
 //BA.debugLineNum = 223608833;BA.debugLine="Return SetBorderColor(STYLE_KEY_LEFT_BORDER_COLOR";
if (true) return __ref._setbordercolor /*b4j.docU.xlstyle*/ (null,__ref._style_key_left_border_color /*String*/ ,_color);
RDebugUtils.currentLine=223608834;
 //BA.debugLineNum = 223608834;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _borderrightcolor(b4j.docU.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "borderrightcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "borderrightcolor", new Object[] {_color}));}
RDebugUtils.currentLine=223674368;
 //BA.debugLineNum = 223674368;BA.debugLine="Public Sub BorderRightColor (Color As Short) As XL";
RDebugUtils.currentLine=223674369;
 //BA.debugLineNum = 223674369;BA.debugLine="Return SetBorderColor(STYLE_KEY_RIGHT_BORDER_COLO";
if (true) return __ref._setbordercolor /*b4j.docU.xlstyle*/ (null,__ref._style_key_right_border_color /*String*/ ,_color);
RDebugUtils.currentLine=223674370;
 //BA.debugLineNum = 223674370;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _bordertop(b4j.docU.xlstyle __ref,String _borderstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "bordertop", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "bordertop", new Object[] {_borderstyle}));}
RDebugUtils.currentLine=223936512;
 //BA.debugLineNum = 223936512;BA.debugLine="Public Sub BorderTop (BorderStyle As String) As XL";
RDebugUtils.currentLine=223936513;
 //BA.debugLineNum = 223936513;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_TOP, BorderStyl";
if (true) return __ref._setborder /*b4j.docU.xlstyle*/ (null,__ref._style_key_border_top /*String*/ ,_borderstyle);
RDebugUtils.currentLine=223936514;
 //BA.debugLineNum = 223936514;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _bordertopcolor(b4j.docU.xlstyle __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "bordertopcolor", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "bordertopcolor", new Object[] {_color}));}
RDebugUtils.currentLine=223543296;
 //BA.debugLineNum = 223543296;BA.debugLine="Public Sub BorderTopColor (Color As Short) As XLSt";
RDebugUtils.currentLine=223543297;
 //BA.debugLineNum = 223543297;BA.debugLine="Return SetBorderColor(STYLE_KEY_TOP_BORDER_COLOR,";
if (true) return __ref._setbordercolor /*b4j.docU.xlstyle*/ (null,__ref._style_key_top_border_color /*String*/ ,_color);
RDebugUtils.currentLine=223543298;
 //BA.debugLineNum = 223543298;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.xlstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
RDebugUtils.currentLine=222953472;
 //BA.debugLineNum = 222953472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=222953473;
 //BA.debugLineNum = 222953473;BA.debugLine="Private STYLE_KEY_HORIZONTAL_ALIGNMENT = \"setAlig";
_style_key_horizontal_alignment = "setAlignment";
RDebugUtils.currentLine=222953474;
 //BA.debugLineNum = 222953474;BA.debugLine="Private STYLE_KEY_BORDER_BOTTOM = \"setBorderBotto";
_style_key_border_bottom = "setBorderBottom";
RDebugUtils.currentLine=222953475;
 //BA.debugLineNum = 222953475;BA.debugLine="Private STYLE_KEY_BORDER_LEFT = \"setBorderLeft\" A";
_style_key_border_left = "setBorderLeft";
RDebugUtils.currentLine=222953476;
 //BA.debugLineNum = 222953476;BA.debugLine="Private STYLE_KEY_BORDER_RIGHT = \"setBorderRight\"";
_style_key_border_right = "setBorderRight";
RDebugUtils.currentLine=222953477;
 //BA.debugLineNum = 222953477;BA.debugLine="Private STYLE_KEY_BORDER_TOP = \"setBorderTop\" As";
_style_key_border_top = "setBorderTop";
RDebugUtils.currentLine=222953478;
 //BA.debugLineNum = 222953478;BA.debugLine="Private STYLE_KEY_BOTTOM_BORDER_COLOR = \"setBotto";
_style_key_bottom_border_color = "setBottomBorderColor";
RDebugUtils.currentLine=222953479;
 //BA.debugLineNum = 222953479;BA.debugLine="Private STYLE_KEY_LEFT_BORDER_COLOR = \"setLeftBor";
_style_key_left_border_color = "setLeftBorderColor";
RDebugUtils.currentLine=222953480;
 //BA.debugLineNum = 222953480;BA.debugLine="Private STYLE_KEY_RIGHT_BORDER_COLOR = \"setRightB";
_style_key_right_border_color = "setRightBorderColor";
RDebugUtils.currentLine=222953481;
 //BA.debugLineNum = 222953481;BA.debugLine="Private STYLE_KEY_TOP_BORDER_COLOR = \"setTopBorde";
_style_key_top_border_color = "setTopBorderColor";
RDebugUtils.currentLine=222953482;
 //BA.debugLineNum = 222953482;BA.debugLine="Private STYLE_KEY_DATA_FORMAT = \"setDataFormat\" A";
_style_key_data_format = "setDataFormat";
RDebugUtils.currentLine=222953484;
 //BA.debugLineNum = 222953484;BA.debugLine="Private STYLE_KEY_FILL_FOREGROUND_COLOR = \"setFil";
_style_key_fill_foreground_color = "setFillForegroundColor";
RDebugUtils.currentLine=222953485;
 //BA.debugLineNum = 222953485;BA.debugLine="Private STYLE_KEY_FILL_PATTERN = \"setFillPattern\"";
_style_key_fill_pattern = "setFillPattern";
RDebugUtils.currentLine=222953486;
 //BA.debugLineNum = 222953486;BA.debugLine="Private STYLE_KEY_FONT = \"setFont\" As String";
_style_key_font = "setFont";
RDebugUtils.currentLine=222953487;
 //BA.debugLineNum = 222953487;BA.debugLine="Private STYLE_KEY_HIDDEN = \"setHidden\" As String";
_style_key_hidden = "setHidden";
RDebugUtils.currentLine=222953488;
 //BA.debugLineNum = 222953488;BA.debugLine="Private STYLE_KEY_INDENTION = \"setIndention\" As S";
_style_key_indention = "setIndention";
RDebugUtils.currentLine=222953489;
 //BA.debugLineNum = 222953489;BA.debugLine="Private STYLE_KEY_LOCKED = \"setLocked\" As String";
_style_key_locked = "setLocked";
RDebugUtils.currentLine=222953490;
 //BA.debugLineNum = 222953490;BA.debugLine="Private STYLE_KEY_ROTATION = \"setRotation\" As Str";
_style_key_rotation = "setRotation";
RDebugUtils.currentLine=222953491;
 //BA.debugLineNum = 222953491;BA.debugLine="Private STYLE_KEY_VERTICAL_ALIGNMENT = \"setVertic";
_style_key_vertical_alignment = "setVerticalAlignment";
RDebugUtils.currentLine=222953492;
 //BA.debugLineNum = 222953492;BA.debugLine="Private STYLE_KEY_WRAP_TEXT = \"setWrapText\" As St";
_style_key_wrap_text = "setWrapText";
RDebugUtils.currentLine=222953493;
 //BA.debugLineNum = 222953493;BA.debugLine="Private bba As JavaObject";
_bba = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=222953494;
 //BA.debugLineNum = 222953494;BA.debugLine="Public StyleMap As Map";
_stylemap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=222953495;
 //BA.debugLineNum = 222953495;BA.debugLine="Private writer As XLWorkbookWriter";
_writer = new b4j.docU.xlworkbookwriter();
RDebugUtils.currentLine=222953496;
 //BA.debugLineNum = 222953496;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlstyle  _clone(b4j.docU.xlstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "clone", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "clone", null));}
b4j.docU.xlstyle _newstyle = null;
String _k = "";
RDebugUtils.currentLine=224722944;
 //BA.debugLineNum = 224722944;BA.debugLine="Public Sub Clone As XLStyle";
RDebugUtils.currentLine=224722945;
 //BA.debugLineNum = 224722945;BA.debugLine="Dim NewStyle As XLStyle";
_newstyle = new b4j.docU.xlstyle();
RDebugUtils.currentLine=224722946;
 //BA.debugLineNum = 224722946;BA.debugLine="NewStyle.Initialize (writer)";
_newstyle._initialize /*b4j.docU.xlstyle*/ (null,ba,__ref._writer /*b4j.docU.xlworkbookwriter*/ );
RDebugUtils.currentLine=224722947;
 //BA.debugLineNum = 224722947;BA.debugLine="For Each k As String In StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=224722948;
 //BA.debugLineNum = 224722948;BA.debugLine="NewStyle.StyleMap.Put(k, StyleMap.Get(k))";
_newstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=224722950;
 //BA.debugLineNum = 224722950;BA.debugLine="Return NewStyle";
if (true) return _newstyle;
RDebugUtils.currentLine=224722951;
 //BA.debugLineNum = 224722951;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _initialize(b4j.docU.xlstyle __ref,anywheresoftware.b4a.BA _ba,b4j.docU.xlworkbookwriter _vwriter) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "initialize", new Object[] {_ba,_vwriter}));}
RDebugUtils.currentLine=223019008;
 //BA.debugLineNum = 223019008;BA.debugLine="Public Sub Initialize (vwriter As XLWorkbookWriter";
RDebugUtils.currentLine=223019009;
 //BA.debugLineNum = 223019009;BA.debugLine="bba.InitializeStatic(\"anywheresoftware.b4a.BA\")";
__ref._bba /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("anywheresoftware.b4a.BA");
RDebugUtils.currentLine=223019010;
 //BA.debugLineNum = 223019010;BA.debugLine="StyleMap.Initialize";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=223019011;
 //BA.debugLineNum = 223019011;BA.debugLine="writer = vwriter";
__ref._writer /*b4j.docU.xlworkbookwriter*/  = _vwriter;
RDebugUtils.currentLine=223019012;
 //BA.debugLineNum = 223019012;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223019013;
 //BA.debugLineNum = 223019013;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _font(b4j.docU.xlstyle __ref,short _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "font", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "font", new Object[] {_size}));}
RDebugUtils.currentLine=224329728;
 //BA.debugLineNum = 224329728;BA.debugLine="Public Sub Font (Size As Short) As XLStyle";
RDebugUtils.currentLine=224329729;
 //BA.debugLineNum = 224329729;BA.debugLine="Return FontColor(Size, writer.xl.COLOR_BLACK)";
if (true) return __ref._fontcolor /*b4j.docU.xlstyle*/ (null,_size,(int) (__ref._writer /*b4j.docU.xlworkbookwriter*/ ._xl /*b4j.docU.xlutils*/ ._color_black /*short*/ ));
RDebugUtils.currentLine=224329730;
 //BA.debugLineNum = 224329730;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _fontbold(b4j.docU.xlstyle __ref,short _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontbold", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "fontbold", new Object[] {_size}));}
RDebugUtils.currentLine=224460800;
 //BA.debugLineNum = 224460800;BA.debugLine="Public Sub FontBold (Size As Short) As XLStyle";
RDebugUtils.currentLine=224460801;
 //BA.debugLineNum = 224460801;BA.debugLine="Return FontBoldColor(Size, writer.xl.COLOR_BLACK)";
if (true) return __ref._fontboldcolor /*b4j.docU.xlstyle*/ (null,_size,(int) (__ref._writer /*b4j.docU.xlworkbookwriter*/ ._xl /*b4j.docU.xlutils*/ ._color_black /*short*/ ));
RDebugUtils.currentLine=224460802;
 //BA.debugLineNum = 224460802;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _fontother(b4j.docU.xlstyle __ref,anywheresoftware.b4j.objects.PoiFontWrapper _pfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "fontother", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "fontother", new Object[] {_pfont}));}
RDebugUtils.currentLine=224657408;
 //BA.debugLineNum = 224657408;BA.debugLine="Public Sub FontOther (PFont As PoiFont) As XLStyle";
RDebugUtils.currentLine=224657409;
 //BA.debugLineNum = 224657409;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, PFont.Index)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_font /*String*/ ),(Object)(_pfont.getIndex()));
RDebugUtils.currentLine=224657410;
 //BA.debugLineNum = 224657410;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224657411;
 //BA.debugLineNum = 224657411;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _hidden(b4j.docU.xlstyle __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "hidden", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "hidden", new Object[] {_value}));}
RDebugUtils.currentLine=223215616;
 //BA.debugLineNum = 223215616;BA.debugLine="Public Sub Hidden (Value As Boolean) As XLStyle";
RDebugUtils.currentLine=223215617;
 //BA.debugLineNum = 223215617;BA.debugLine="StyleMap.Put(STYLE_KEY_HIDDEN, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_hidden /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=223215618;
 //BA.debugLineNum = 223215618;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223215619;
 //BA.debugLineNum = 223215619;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _importstyle(b4j.docU.xlstyle __ref,b4j.docU.xlstyle _otherstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "importstyle", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "importstyle", new Object[] {_otherstyle}));}
String _k = "";
RDebugUtils.currentLine=224788480;
 //BA.debugLineNum = 224788480;BA.debugLine="Public Sub ImportStyle (OtherStyle As XLStyle) As";
RDebugUtils.currentLine=224788481;
 //BA.debugLineNum = 224788481;BA.debugLine="For Each k As String In OtherStyle.StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _otherstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=224788482;
 //BA.debugLineNum = 224788482;BA.debugLine="StyleMap.Put(k, OtherStyle.StyleMap.Get(k))";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_otherstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=224788484;
 //BA.debugLineNum = 224788484;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224788485;
 //BA.debugLineNum = 224788485;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _indention(b4j.docU.xlstyle __ref,short _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "indention", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "indention", new Object[] {_value}));}
RDebugUtils.currentLine=223346688;
 //BA.debugLineNum = 223346688;BA.debugLine="Public Sub Indention (Value As Short) As XLStyle";
RDebugUtils.currentLine=223346689;
 //BA.debugLineNum = 223346689;BA.debugLine="StyleMap.Put(STYLE_KEY_INDENTION, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_indention /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=223346690;
 //BA.debugLineNum = 223346690;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223346691;
 //BA.debugLineNum = 223346691;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _locked(b4j.docU.xlstyle __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "locked", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "locked", new Object[] {_value}));}
RDebugUtils.currentLine=223150080;
 //BA.debugLineNum = 223150080;BA.debugLine="Public Sub Locked (Value As Boolean) As XLStyle";
RDebugUtils.currentLine=223150081;
 //BA.debugLineNum = 223150081;BA.debugLine="StyleMap.Put(STYLE_KEY_LOCKED, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_locked /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=223150082;
 //BA.debugLineNum = 223150082;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223150083;
 //BA.debugLineNum = 223150083;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _rotation(b4j.docU.xlstyle __ref,short _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "rotation", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "rotation", new Object[] {_value}));}
RDebugUtils.currentLine=223412224;
 //BA.debugLineNum = 223412224;BA.debugLine="Public Sub Rotation (Value As Short) As XLStyle";
RDebugUtils.currentLine=223412225;
 //BA.debugLineNum = 223412225;BA.debugLine="StyleMap.Put(STYLE_KEY_ROTATION, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_rotation /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=223412226;
 //BA.debugLineNum = 223412226;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223412227;
 //BA.debugLineNum = 223412227;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _verticalalignment(b4j.docU.xlstyle __ref,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "verticalalignment", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "verticalalignment", new Object[] {_alignment}));}
RDebugUtils.currentLine=224198656;
 //BA.debugLineNum = 224198656;BA.debugLine="Public Sub VerticalAlignment (Alignment As String)";
RDebugUtils.currentLine=224198657;
 //BA.debugLineNum = 224198657;BA.debugLine="StyleMap.Put(STYLE_KEY_VERTICAL_ALIGNMENT, Alignm";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_vertical_alignment /*String*/ ),(Object)(_alignment));
RDebugUtils.currentLine=224198658;
 //BA.debugLineNum = 224198658;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=224198659;
 //BA.debugLineNum = 224198659;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _wraptext(b4j.docU.xlstyle __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlstyle";
if (Debug.shouldDelegate(ba, "wraptext", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "wraptext", new Object[] {_value}));}
RDebugUtils.currentLine=223281152;
 //BA.debugLineNum = 223281152;BA.debugLine="Public Sub WrapText (Value As Boolean) As XLStyle";
RDebugUtils.currentLine=223281153;
 //BA.debugLineNum = 223281153;BA.debugLine="StyleMap.Put(STYLE_KEY_WRAP_TEXT, Value)";
__ref._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._style_key_wrap_text /*String*/ ),(Object)(_value));
RDebugUtils.currentLine=223281154;
 //BA.debugLineNum = 223281154;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlstyle)(this);
RDebugUtils.currentLine=223281155;
 //BA.debugLineNum = 223281155;BA.debugLine="End Sub";
return null;
}
}