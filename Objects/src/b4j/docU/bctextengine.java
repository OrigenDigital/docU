package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bctextengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.bctextengine", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.bctextengine.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bcfontmetrics{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.Map Glyphs;
public b4j.docU.bctextengine._bcfontmetrics DefaultColorMetrics;
public int xWidth;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont Fnt;
public int Clr;
public anywheresoftware.b4a.objects.collections.Map KerningTable;
public void Initialize() {
IsInitialized = true;
Glyphs = new anywheresoftware.b4a.objects.collections.Map();
DefaultColorMetrics = new b4j.docU.bctextengine._bcfontmetrics();
xWidth = 0;
Fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Clr = 0;
KerningTable = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextchars{
public boolean IsInitialized;
public String[] Buffer;
public int StartIndex;
public int Length;
public void Initialize() {
IsInitialized = true;
Buffer = new String[0];
java.util.Arrays.fill(Buffer,"");
StartIndex = 0;
Length = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraphstyle{
public boolean IsInitialized;
public String HorizontalAlignment;
public float LineSpacingFactor;
public int MaxWidth;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Padding;
public boolean WordWrap;
public boolean ResizeHeightAutomatically;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
HorizontalAlignment = "";
LineSpacingFactor = 0f;
MaxWidth = 0;
Padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
WordWrap = false;
ResizeHeightAutomatically = false;
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextrun{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public int TextColor;
public String Text;
public b4j.docU.bctextengine._bctextchars TextChars;
public float CharacterSpacingFactor;
public int VerticalOffset;
public boolean Underline;
public boolean AutoUnderline;
public int BackgroundColor;
public int IndentLevel;
public anywheresoftware.b4a.objects.B4XViewWrapper View;
public String HorizontalAlignment;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public int TextDirection;
public void Initialize() {
IsInitialized = true;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Text = "";
TextChars = new b4j.docU.bctextengine._bctextchars();
CharacterSpacingFactor = 0f;
VerticalOffset = 0;
Underline = false;
AutoUnderline = false;
BackgroundColor = 0;
IndentLevel = 0;
View = new anywheresoftware.b4a.objects.B4XViewWrapper();
HorizontalAlignment = "";
Tag = new Object();
Extra = new anywheresoftware.b4a.objects.collections.Map();
TextDirection = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcconnectedruns{
public boolean IsInitialized;
public int ConnectedWidth;
public anywheresoftware.b4a.objects.collections.List Runs;
public String Alignment;
public void Initialize() {
IsInitialized = true;
ConnectedWidth = 0;
Runs = new anywheresoftware.b4a.objects.collections.List();
Alignment = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcstyledunderline{
public boolean IsInitialized;
public int Clr;
public String Style;
public float Thickness;
public void Initialize() {
IsInitialized = true;
Clr = 0;
Style = "";
Thickness = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraph{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List TextLines;
public b4j.docU.bctextengine._bctextline CurrentLine;
public b4j.docU.bctextengine._bcparagraphstyle Style;
public boolean TwoLayers;
public int Width;
public int Height;
public anywheresoftware.b4a.objects.collections.List Views;
public anywheresoftware.b4a.objects.collections.Map Anchors;
public void Initialize() {
IsInitialized = true;
TextLines = new anywheresoftware.b4a.objects.collections.List();
CurrentLine = new b4j.docU.bctextengine._bctextline();
Style = new b4j.docU.bctextengine._bcparagraphstyle();
TwoLayers = false;
Width = 0;
Height = 0;
Views = new anywheresoftware.b4a.objects.collections.List();
Anchors = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextline{
public boolean IsInitialized;
public int StartX;
public int BaselineY;
public int Height;
public anywheresoftware.b4a.objects.collections.List Unbreakables;
public int Width;
public boolean EndsWithSoftLineBreak;
public int MaxHeightAboveBaseLine;
public b4j.docU.bctextengine._bcparagraph ParentParagraph;
public int MaxHeightBelowBaseLine;
public void Initialize() {
IsInitialized = true;
StartX = 0;
BaselineY = 0;
Height = 0;
Unbreakables = new anywheresoftware.b4a.objects.collections.List();
Width = 0;
EndsWithSoftLineBreak = false;
MaxHeightAboveBaseLine = 0;
ParentParagraph = new b4j.docU.bctextengine._bcparagraph();
MaxHeightBelowBaseLine = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcunbreakabletext{
public boolean IsInitialized;
public int Width;
public int StartX;
public b4j.docU.bctextengine._bctextchars NotFullTextChars;
public boolean IsMergable;
public anywheresoftware.b4a.objects.collections.List SingleStyleSections;
public b4j.docU.bctextengine._bctextline ParentLine;
public boolean RTL;
public String Anchor;
public void Initialize() {
IsInitialized = true;
Width = 0;
StartX = 0;
NotFullTextChars = new b4j.docU.bctextengine._bctextchars();
IsMergable = false;
SingleStyleSections = new anywheresoftware.b4a.objects.collections.List();
ParentLine = new b4j.docU.bctextengine._bctextline();
RTL = false;
Anchor = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcsinglestylesection{
public boolean IsInitialized;
public int AbsoluteStartX;
public anywheresoftware.b4a.objects.collections.List GlyphsAndOffsets;
public b4j.docU.bctextengine._bctextrun Run;
public int Width;
public int MaxHeightBelowBaseLine;
public int MaxHeightAboveBaseLine;
public b4j.docU.bctextengine._bcunbreakabletext ParentUN;
public b4j.docU.bctextengine._bcfontmetrics fm;
public void Initialize() {
IsInitialized = true;
AbsoluteStartX = 0;
GlyphsAndOffsets = new anywheresoftware.b4a.objects.collections.List();
Run = new b4j.docU.bctextengine._bctextrun();
Width = 0;
MaxHeightBelowBaseLine = 0;
MaxHeightAboveBaseLine = 0;
ParentUN = new b4j.docU.bctextengine._bcunbreakabletext();
fm = new b4j.docU.bctextengine._bcfontmetrics();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyphandoffset{
public boolean IsInitialized;
public b4j.docU.bctextengine._bcglyph Glyph;
public int SpaceBetweenThisAndNext;
public void Initialize() {
IsInitialized = true;
Glyph = new b4j.docU.bctextengine._bcglyph();
SpaceBetweenThisAndNext = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyph{
public boolean IsInitialized;
public b4j.example.bitmapcreator._compressedbc cbc;
public int baseline;
public int Width;
public boolean Emoji;
public boolean Empty;
public void Initialize() {
IsInitialized = true;
cbc = new b4j.example.bitmapcreator._compressedbc();
baseline = 0;
Width = 0;
Emoji = false;
Empty = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public String _extra_connectedruns = "";
public String _extra_styledunderline = "";
public b4j.example.bitmapcreator _charbc = null;
public b4j.example.bitmapcreator._internalcompressedbccache _cbccache = null;
public b4j.docU.bctextengine._bcstyledunderline _defaultunderlinestyle = null;
public float _mscale = 0f;
public float _mspacebetweencharacters = 0f;
public int _mspacebetweenlines = 0;
public anywheresoftware.b4a.objects.collections.Map _fontmetricscache = null;
public b4j.example.bitmapcreator _foregroundbc = null;
public b4j.example.bitmapcreator _backgroundbc = null;
public int _defaultcolor = 0;
public String _wordboundaries = "";
public String _wordboundariesthatcanconnecttoprevword = "";
public anywheresoftware.b4a.objects.collections.Map _brushes = null;
public b4j.docU.bctextengine._bcparagraphstyle _defaultstyle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaultfont = null;
public int _mmingapbetweenlines = 0;
public anywheresoftware.b4j.object.JavaObject _writableimage = null;
public anywheresoftware.b4j.object.JavaObject _sp = null;
public int _tabwidthmeasuredinx = 0;
public b4j.docU.bbcodeparser _tagparser = null;
public b4j.docU.bctextengine._bctextchars _emptytextchars = null;
public b4j.docU.b4xset _emojis = null;
public String _charset = "";
public boolean _lookforcomplexcharacters = false;
public anywheresoftware.b4a.objects.collections.Map _customfonts = null;
public boolean _kerningenabled = false;
public int _indentwidth = 0;
public b4j.docU.b4xset _vowelscodepoints = null;
public b4j.docU.b4xorderedmap _asyncbcs = null;
public b4j.example.bitmapcreator _asyncbc = null;
public anywheresoftware.b4a.objects.collections.List _asynctasks = null;
public boolean _asyncmode = false;
public b4j.docU.b4xset _rtlchars = null;
public int _textdirectionltr = 0;
public int _textdirectionunknown = 0;
public int _textdirectionrtl = 0;
public anywheresoftware.b4a.objects.collections.Map _arabicmap = null;
public b4j.docU.b4xset _arabicnonlinkedletters = null;
public b4j.docU.b4xset _arabiccharsconnectedprev = null;
public b4j.example.bitmapcreator._premultipliedcolor _pmdefaultcolor = null;
public boolean _rtlaware = false;
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
public String  _initialize(b4j.docU.bctextengine __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.JFX _fx = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
byte[] _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=152961024;
 //BA.debugLineNum = 152961024;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=152961025;
 //BA.debugLineNum = 152961025;BA.debugLine="CustomFonts.Initialize";
__ref._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=152961026;
 //BA.debugLineNum = 152961026;BA.debugLine="VowelsCodePoints.Initialize";
__ref._vowelscodepoints /*b4j.docU.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=152961027;
 //BA.debugLineNum = 152961027;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
__ref._emptytextchars /*b4j.docU.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*b4j.docU.bctextengine._bctextchars*/ (null,"");
RDebugUtils.currentLine=152961028;
 //BA.debugLineNum = 152961028;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=152961029;
 //BA.debugLineNum = 152961029;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=152961033;
 //BA.debugLineNum = 152961033;BA.debugLine="Try";
try {RDebugUtils.currentLine=152961034;
 //BA.debugLineNum = 152961034;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=152961035;
 //BA.debugLineNum = 152961035;BA.debugLine="Dim jo As JavaObject = fx.PrimaryScreen";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fx.getPrimaryScreen().getObject()));
RDebugUtils.currentLine=152961036;
 //BA.debugLineNum = 152961036;BA.debugLine="mScale = Ceil(jo.RunMethod(\"getOutputScaleX\", Nu";
__ref._mscale /*float*/  = (float) (__c.Ceil((double)(BA.ObjectToNumber(_jo.RunMethod("getOutputScaleX",(Object[])(__c.Null))))));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=152961038;
 //BA.debugLineNum = 152961038;BA.debugLine="mScale = 1";
__ref._mscale /*float*/  = (float) (1);
 };
RDebugUtils.currentLine=152961042;
 //BA.debugLineNum = 152961042;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
__ref._setspacebetweencharacters /*String*/ (null,(float) (__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=152961043;
 //BA.debugLineNum = 152961043;BA.debugLine="setSpaceBetweenLines(20dip)";
__ref._setspacebetweenlines /*String*/ (null,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=152961044;
 //BA.debugLineNum = 152961044;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=152961045;
 //BA.debugLineNum = 152961045;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
__ref._resizecharbc /*String*/ (null,(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ),(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=152961046;
 //BA.debugLineNum = 152961046;BA.debugLine="Brushes.Initialize";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=152961047;
 //BA.debugLineNum = 152961047;BA.debugLine="ResizeLayers(200dip, 100dip)";
__ref._resizelayers /*String*/ (null,__c.DipToCurrent((int) (200)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=152961048;
 //BA.debugLineNum = 152961048;BA.debugLine="cbccache.Initialize";
__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ .Initialize();
RDebugUtils.currentLine=152961049;
 //BA.debugLineNum = 152961049;BA.debugLine="cbccache.ColorsMap.Initialize";
__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ .ColorsMap.Initialize();
RDebugUtils.currentLine=152961050;
 //BA.debugLineNum = 152961050;BA.debugLine="FontMetricsCache.Initialize";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=152961051;
 //BA.debugLineNum = 152961051;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
_b = new byte[(int) (__ref._charbc /*b4j.example.bitmapcreator*/ ._same_color_length_for_cache*4*__ref._charbc /*b4j.example.bitmapcreator*/ ._max_same_color_size+4)];
;
RDebugUtils.currentLine=152961052;
 //BA.debugLineNum = 152961052;BA.debugLine="cbccache.mBuffer = b";
__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ .mBuffer = _b;
RDebugUtils.currentLine=152961053;
 //BA.debugLineNum = 152961053;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (16));
RDebugUtils.currentLine=152961054;
 //BA.debugLineNum = 152961054;BA.debugLine="DefaultStyle = CreateStyle";
__ref._defaultstyle /*b4j.docU.bctextengine._bcparagraphstyle*/  = __ref._createstyle /*b4j.docU.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=152961055;
 //BA.debugLineNum = 152961055;BA.debugLine="TagParser.Initialize (Me)";
__ref._tagparser /*b4j.docU.bbcodeparser*/ ._initialize /*String*/ (null,ba,(b4j.docU.bctextengine)(this));
RDebugUtils.currentLine=152961056;
 //BA.debugLineNum = 152961056;BA.debugLine="DefaultUnderlineStyle.Initialize";
__ref._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ .Initialize();
RDebugUtils.currentLine=152961057;
 //BA.debugLineNum = 152961057;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
__ref._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ .Clr /*int*/  = (int) (0);
RDebugUtils.currentLine=152961058;
 //BA.debugLineNum = 152961058;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
__ref._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ .Style /*String*/  = "line";
RDebugUtils.currentLine=152961059;
 //BA.debugLineNum = 152961059;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
__ref._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ .Thickness /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=152961060;
 //BA.debugLineNum = 152961060;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group31 = _parent.GetAllViewsRecursive();
final int groupLen31 = group31.getSize()
;int index31 = 0;
;
for (; index31 < groupLen31;index31++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group31.Get(index31)));
RDebugUtils.currentLine=152961061;
 //BA.debugLineNum = 152961061;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
if (_v.getTag() instanceof b4j.docU.bbcodeview || _v.getTag() instanceof b4j.docU.bblabel) { 
RDebugUtils.currentLine=152961062;
 //BA.debugLineNum = 152961062;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
__c.CallSubDebug2(ba,_v.getTag(),"setTextEngine",this);
 };
 }
};
RDebugUtils.currentLine=152961066;
 //BA.debugLineNum = 152961066;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bcsinglestylesection  _findsinglestylesection(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _paragraph,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findsinglestylesection", true))
	 {return ((b4j.docU.bctextengine._bcsinglestylesection) Debug.delegate(ba, "findsinglestylesection", new Object[] {_paragraph,_x,_y}));}
b4j.docU.bctextengine._bctextline _line = null;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
b4j.docU.bctextengine._bcsinglestylesection _s = null;
RDebugUtils.currentLine=155385856;
 //BA.debugLineNum = 155385856;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
RDebugUtils.currentLine=155385857;
 //BA.debugLineNum = 155385857;BA.debugLine="x = x * mScale";
_x = (int) (_x*__ref._mscale /*float*/ );
RDebugUtils.currentLine=155385858;
 //BA.debugLineNum = 155385858;BA.debugLine="y = y * mScale";
_y = (int) (_y*__ref._mscale /*float*/ );
RDebugUtils.currentLine=155385859;
 //BA.debugLineNum = 155385859;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group3 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4j.docU.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=155385861;
 //BA.debugLineNum = 155385861;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
if (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y) { 
RDebugUtils.currentLine=155385862;
 //BA.debugLineNum = 155385862;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
{
final anywheresoftware.b4a.BA.IterableList group5 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group5.Get(index5));
RDebugUtils.currentLine=155385863;
 //BA.debugLineNum = 155385863;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
if ((_paragraph.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ==__c.False && _line.StartX /*int*/ +_un.StartX /*int*/ <=_x && _line.StartX /*int*/ +_un.StartX /*int*/ +_un.Width /*int*/ >=_x) || (_paragraph.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y)) { 
RDebugUtils.currentLine=155385865;
 //BA.debugLineNum = 155385865;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (b4j.docU.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=155385866;
 //BA.debugLineNum = 155385866;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
if (_s.AbsoluteStartX /*int*/ <=_x && _s.AbsoluteStartX /*int*/ +_s.Width /*int*/ >=_x) { 
if (true) return _s;};
 }
};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=155385872;
 //BA.debugLineNum = 155385872;BA.debugLine="Return Null";
if (true) return (b4j.docU.bctextengine._bcsinglestylesection)(__c.Null);
RDebugUtils.currentLine=155385873;
 //BA.debugLineNum = 155385873;BA.debugLine="End Sub";
return null;
}
public String  _drawsingleline(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4j.docU.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsingleline", true))
	 {return ((String) Debug.delegate(ba, "drawsingleline", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=154730496;
 //BA.debugLineNum = 154730496;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
RDebugUtils.currentLine=154730497;
 //BA.debugLineNum = 154730497;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=154730498;
 //BA.debugLineNum = 154730498;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=154730499;
 //BA.debugLineNum = 154730499;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
RDebugUtils.currentLine=154730500;
 //BA.debugLineNum = 154730500;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=154730501;
 //BA.debugLineNum = 154730501;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._getbitmap().Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight())),_iv);
 };
RDebugUtils.currentLine=154730503;
 //BA.debugLineNum = 154730503;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bcparagraphstyle  _createstyle(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4j.docU.bctextengine._bcparagraphstyle) Debug.delegate(ba, "createstyle", null));}
b4j.docU.bctextengine._bcparagraphstyle _s = null;
RDebugUtils.currentLine=153092096;
 //BA.debugLineNum = 153092096;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
RDebugUtils.currentLine=153092097;
 //BA.debugLineNum = 153092097;BA.debugLine="Dim s As BCParagraphStyle";
_s = new b4j.docU.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=153092098;
 //BA.debugLineNum = 153092098;BA.debugLine="s.Initialize";
_s.Initialize();
RDebugUtils.currentLine=153092099;
 //BA.debugLineNum = 153092099;BA.debugLine="s.LineSpacingFactor = 1";
_s.LineSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=153092100;
 //BA.debugLineNum = 153092100;BA.debugLine="s.HorizontalAlignment = \"Left\"";
_s.HorizontalAlignment /*String*/  = "Left";
RDebugUtils.currentLine=153092101;
 //BA.debugLineNum = 153092101;BA.debugLine="s.MaxWidth = 300dip";
_s.MaxWidth /*int*/  = __c.DipToCurrent((int) (300));
RDebugUtils.currentLine=153092102;
 //BA.debugLineNum = 153092102;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_s.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=153092103;
 //BA.debugLineNum = 153092103;BA.debugLine="s.WordWrap = True";
_s.WordWrap /*boolean*/  = __c.True;
RDebugUtils.currentLine=153092104;
 //BA.debugLineNum = 153092104;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=153092105;
 //BA.debugLineNum = 153092105;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bcparagraph  _prepareforlazydrawing(b4j.docU.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4j.docU.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepareforlazydrawing", true))
	 {return ((b4j.docU.bctextengine._bcparagraph) Debug.delegate(ba, "prepareforlazydrawing", new Object[] {_runs,_style,_sv}));}
b4j.docU.bctextengine._bcparagraph _par = null;
int _maxheight = 0;
b4j.docU.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=153354240;
 //BA.debugLineNum = 153354240;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
RDebugUtils.currentLine=153354241;
 //BA.debugLineNum = 153354241;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*b4j.docU.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=153354242;
 //BA.debugLineNum = 153354242;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
_sv.setScrollViewContentHeight(__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()+_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=153354243;
 //BA.debugLineNum = 153354243;BA.debugLine="Dim MaxHeight As Int";
_maxheight = 0;
RDebugUtils.currentLine=153354244;
 //BA.debugLineNum = 153354244;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4j.docU.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=153354245;
 //BA.debugLineNum = 153354245;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
_maxheight = (int) (__c.Max(_maxheight,_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
RDebugUtils.currentLine=153354247;
 //BA.debugLineNum = 153354247;BA.debugLine="ResizeLayers(par.Width / mScale, MaxHeight / mSca";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_maxheight/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=153354248;
 //BA.debugLineNum = 153354248;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=153354249;
 //BA.debugLineNum = 153354249;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=153354250;
 //BA.debugLineNum = 153354250;BA.debugLine="End Sub";
return null;
}
public b4j.example.bitmapcreator  _drawsinglelineasync(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4j.docU.bctextengine._bcparagraph _par,Object _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineasync", true))
	 {return ((b4j.example.bitmapcreator) Debug.delegate(ba, "drawsinglelineasync", new Object[] {_line,_iv,_par,_target}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=154861568;
 //BA.debugLineNum = 154861568;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
RDebugUtils.currentLine=154861569;
 //BA.debugLineNum = 154861569;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=154861570;
 //BA.debugLineNum = 154861570;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=154861571;
 //BA.debugLineNum = 154861571;BA.debugLine="AsyncMode = True";
__ref._asyncmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=154861572;
 //BA.debugLineNum = 154861572;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
if (__ref._asyncbcs /*b4j.docU.b4xorderedmap*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._initialize /*String*/ (null,ba);};
RDebugUtils.currentLine=154861573;
 //BA.debugLineNum = 154861573;BA.debugLine="Dim AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=154861574;
 //BA.debugLineNum = 154861574;BA.debugLine="AsyncTasks.Initialize";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=154861575;
 //BA.debugLineNum = 154861575;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
__ref._asyncbc /*b4j.example.bitmapcreator*/  = __ref._findasyncbc /*b4j.example.bitmapcreator*/ (null,(int) (_r.getWidth()),(int) (_r.getHeight()));
RDebugUtils.currentLine=154861576;
 //BA.debugLineNum = 154861576;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4j.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0))));
RDebugUtils.currentLine=154861577;
 //BA.debugLineNum = 154861577;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=154861578;
 //BA.debugLineNum = 154861578;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
__ref._asyncbc /*b4j.example.bitmapcreator*/ ._drawbitmapcreatorsasync(_target,"BC",__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=154861579;
 //BA.debugLineNum = 154861579;BA.debugLine="AsyncMode = False";
__ref._asyncmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=154861580;
 //BA.debugLineNum = 154861580;BA.debugLine="Return AsyncBC";
if (true) return __ref._asyncbc /*b4j.example.bitmapcreator*/ ;
 };
RDebugUtils.currentLine=154861582;
 //BA.debugLineNum = 154861582;BA.debugLine="Return Null";
if (true) return (b4j.example.bitmapcreator)(__c.Null);
RDebugUtils.currentLine=154861583;
 //BA.debugLineNum = 154861583;BA.debugLine="End Sub";
return null;
}
public String  _releaseasyncbc(b4j.docU.bctextengine __ref,b4j.example.bitmapcreator _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "releaseasyncbc", true))
	 {return ((String) Debug.delegate(ba, "releaseasyncbc", new Object[] {_bc}));}
RDebugUtils.currentLine=154992640;
 //BA.debugLineNum = 154992640;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
RDebugUtils.currentLine=154992641;
 //BA.debugLineNum = 154992641;BA.debugLine="AsyncBCs.Put(bc, False)";
__ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.False));
RDebugUtils.currentLine=154992642;
 //BA.debugLineNum = 154992642;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweenlines(b4j.docU.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweenlines", new Object[] {_f}));}
RDebugUtils.currentLine=156303360;
 //BA.debugLineNum = 156303360;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
RDebugUtils.currentLine=156303361;
 //BA.debugLineNum = 156303361;BA.debugLine="mSpaceBetweenLines = f * mScale";
__ref._mspacebetweenlines /*int*/  = (int) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=156303362;
 //BA.debugLineNum = 156303362;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bctextchars  _createbctextcharsfromstring(b4j.docU.bctextengine __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextcharsfromstring", true))
	 {return ((b4j.docU.bctextengine._bctextchars) Debug.delegate(ba, "createbctextcharsfromstring", new Object[] {_s}));}
byte[] _b = null;
String[] _chars = null;
int _i = 0;
int _bi = 0;
boolean _shouldaddtoprevchar = false;
boolean _therearevowels = false;
int _cp = 0;
RDebugUtils.currentLine=156499968;
 //BA.debugLineNum = 156499968;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
RDebugUtils.currentLine=156499969;
 //BA.debugLineNum = 156499969;BA.debugLine="If RTLAware Then LoadArabicData";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._loadarabicdata /*String*/ (null);};
RDebugUtils.currentLine=156499970;
 //BA.debugLineNum = 156499970;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
_b = _s.getBytes(__ref._charset /*String*/ );
RDebugUtils.currentLine=156499971;
 //BA.debugLineNum = 156499971;BA.debugLine="Dim chars(b.Length / 4) As String";
_chars = new String[(int) (_b.length/(double)4)];
java.util.Arrays.fill(_chars,"");
RDebugUtils.currentLine=156499972;
 //BA.debugLineNum = 156499972;BA.debugLine="Dim i, bi As Int = 0";
_i = 0;
_bi = (int) (0);
RDebugUtils.currentLine=156499973;
 //BA.debugLineNum = 156499973;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
_shouldaddtoprevchar = false;
RDebugUtils.currentLine=156499974;
 //BA.debugLineNum = 156499974;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
_therearevowels = __ref._vowelscodepoints /*b4j.docU.b4xset*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=156499975;
 //BA.debugLineNum = 156499975;BA.debugLine="Do While bi <= chars.Length - 1";
while (_bi<=_chars.length-1) {
RDebugUtils.currentLine=156499976;
 //BA.debugLineNum = 156499976;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
_chars[_i] = __c.BytesToString(_b,(int) (_bi*4),(int) (4),__ref._charset /*String*/ );
RDebugUtils.currentLine=156499977;
 //BA.debugLineNum = 156499977;BA.debugLine="If LookForComplexCharacters Then";
if (__ref._lookforcomplexcharacters /*boolean*/ ) { 
RDebugUtils.currentLine=156499978;
 //BA.debugLineNum = 156499978;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
_cp = __ref._bytestoint /*int*/ (null,_b,(int) (_bi*4));
RDebugUtils.currentLine=156499979;
 //BA.debugLineNum = 156499979;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
if (_i>0 && (_cp==((int)0x200d) || (_cp>=((int)0xfe00) && _cp<=((int)0xfe0f)))) { 
RDebugUtils.currentLine=156499980;
 //BA.debugLineNum = 156499980;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=156499981;
 //BA.debugLineNum = 156499981;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=156499982;
 //BA.debugLineNum = 156499982;BA.debugLine="ShouldAddToPrevChar = True";
_shouldaddtoprevchar = __c.True;
 }else 
{RDebugUtils.currentLine=156499983;
 //BA.debugLineNum = 156499983;BA.debugLine="Else If i > 0 And (cp >= 0x1F3FB And cp <= 0x1F";
if (_i>0 && (_cp>=((int)0x1f3fb) && _cp<=((int)0x1f3ff))) { 
RDebugUtils.currentLine=156499984;
 //BA.debugLineNum = 156499984;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=156499985;
 //BA.debugLineNum = 156499985;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=156499986;
 //BA.debugLineNum = 156499986;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=156499987;
 //BA.debugLineNum = 156499987;BA.debugLine="Else If i > 0 And (ThereAreVowels And VowelsCod";
if (_i>0 && (_therearevowels && __ref._vowelscodepoints /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp)))) { 
RDebugUtils.currentLine=156499988;
 //BA.debugLineNum = 156499988;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=156499989;
 //BA.debugLineNum = 156499989;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=156499990;
 //BA.debugLineNum = 156499990;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=156499991;
 //BA.debugLineNum = 156499991;BA.debugLine="Else If RTLAware And i > 0 And chars(i - 1) = \"";
if (__ref._rtlaware /*boolean*/  && _i>0 && (_chars[(int) (_i-1)]).equals("ل") && (_cp==((int)0x622) || _cp==((int)0x623) || _cp==((int)0x625) || _cp==((int)0x627))) { 
RDebugUtils.currentLine=156499992;
 //BA.debugLineNum = 156499992;BA.debugLine="Select cp";
switch (_cp) {
case 0x622: {
RDebugUtils.currentLine=156499994;
 //BA.debugLineNum = 156499994;BA.debugLine="chars(i - 1) = Chr(0xFEF5)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef5)));
 break; }
case 0x623: {
RDebugUtils.currentLine=156499996;
 //BA.debugLineNum = 156499996;BA.debugLine="chars(i - 1) = Chr(0xFEF7)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef7)));
 break; }
case 0x625: {
RDebugUtils.currentLine=156499998;
 //BA.debugLineNum = 156499998;BA.debugLine="chars(i - 1) = Chr(0xFEF9)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef9)));
 break; }
case 0x627: {
RDebugUtils.currentLine=156500000;
 //BA.debugLineNum = 156500000;BA.debugLine="chars(i - 1) = Chr(0xFEFB)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfefb)));
 break; }
}
;
RDebugUtils.currentLine=156500002;
 //BA.debugLineNum = 156500002;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=156500003;
 //BA.debugLineNum = 156500003;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=156500004;
 //BA.debugLineNum = 156500004;BA.debugLine="Else If i > 0 And ShouldAddToPrevChar Then";
if (_i>0 && _shouldaddtoprevchar) { 
RDebugUtils.currentLine=156500005;
 //BA.debugLineNum = 156500005;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=156500006;
 //BA.debugLineNum = 156500006;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=156500007;
 //BA.debugLineNum = 156500007;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else {
RDebugUtils.currentLine=156500009;
 //BA.debugLineNum = 156500009;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }}}}}
;
 };
RDebugUtils.currentLine=156500012;
 //BA.debugLineNum = 156500012;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
RDebugUtils.currentLine=156500013;
 //BA.debugLineNum = 156500013;BA.debugLine="bi = bi + 1";
_bi = (int) (_bi+1);
 }
;
RDebugUtils.currentLine=156500015;
 //BA.debugLineNum = 156500015;BA.debugLine="If RTLAware Then";
if (__ref._rtlaware /*boolean*/ ) { 
RDebugUtils.currentLine=156500016;
 //BA.debugLineNum = 156500016;BA.debugLine="PreprocessArabic(chars, i)";
__ref._preprocessarabic /*String*/ (null,_chars,_i);
 };
RDebugUtils.currentLine=156500018;
 //BA.debugLineNum = 156500018;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
if (true) return __ref._createbctextchars /*b4j.docU.bctextengine._bctextchars*/ (null,_chars,(int) (0),_i);
RDebugUtils.currentLine=156500019;
 //BA.debugLineNum = 156500019;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bctextrun  _createconnectedparent(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createconnectedparent", true))
	 {return ((b4j.docU.bctextengine._bctextrun) Debug.delegate(ba, "createconnectedparent", null));}
b4j.docU.bctextengine._bcconnectedruns _connected = null;
b4j.docU.bctextengine._bctextrun _parent = null;
RDebugUtils.currentLine=153223168;
 //BA.debugLineNum = 153223168;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
RDebugUtils.currentLine=153223169;
 //BA.debugLineNum = 153223169;BA.debugLine="Dim connected As BCConnectedRuns";
_connected = new b4j.docU.bctextengine._bcconnectedruns();
RDebugUtils.currentLine=153223170;
 //BA.debugLineNum = 153223170;BA.debugLine="connected.Initialize";
_connected.Initialize();
RDebugUtils.currentLine=153223171;
 //BA.debugLineNum = 153223171;BA.debugLine="connected.Runs.Initialize";
_connected.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=153223172;
 //BA.debugLineNum = 153223172;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
_parent = __ref._createrun /*b4j.docU.bctextengine._bctextrun*/ (null,"");
RDebugUtils.currentLine=153223173;
 //BA.debugLineNum = 153223173;BA.debugLine="parent.Extra.Initialize";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=153223174;
 //BA.debugLineNum = 153223174;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._extra_connectedruns /*String*/ ),(Object)(_connected));
RDebugUtils.currentLine=153223175;
 //BA.debugLineNum = 153223175;BA.debugLine="Return parent";
if (true) return _parent;
RDebugUtils.currentLine=153223176;
 //BA.debugLineNum = 153223176;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bcfontmetrics  _getfontmetrics(b4j.docU.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfontmetrics", true))
	 {return ((b4j.docU.bctextengine._bcfontmetrics) Debug.delegate(ba, "getfontmetrics", new Object[] {_fnt,_clr}));}
String _key = "";
b4j.docU.bctextengine._bcfontmetrics _fm = null;
RDebugUtils.currentLine=155582464;
 //BA.debugLineNum = 155582464;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
RDebugUtils.currentLine=155582465;
 //BA.debugLineNum = 155582465;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
_key = __ref._fonttokey /*String*/ (null,_fnt,_clr);
RDebugUtils.currentLine=155582466;
 //BA.debugLineNum = 155582466;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
if (__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))) { 
if (true) return (b4j.docU.bctextengine._bcfontmetrics)(__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));};
RDebugUtils.currentLine=155582467;
 //BA.debugLineNum = 155582467;BA.debugLine="Dim fm As BCFontMetrics";
_fm = new b4j.docU.bctextengine._bcfontmetrics();
RDebugUtils.currentLine=155582468;
 //BA.debugLineNum = 155582468;BA.debugLine="fm.Initialize";
_fm.Initialize();
RDebugUtils.currentLine=155582469;
 //BA.debugLineNum = 155582469;BA.debugLine="fm.Glyphs.Initialize";
_fm.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=155582470;
 //BA.debugLineNum = 155582470;BA.debugLine="fm.Clr = clr";
_fm.Clr /*int*/  = _clr;
RDebugUtils.currentLine=155582471;
 //BA.debugLineNum = 155582471;BA.debugLine="fm.Fnt = Fnt";
_fm.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
RDebugUtils.currentLine=155582472;
 //BA.debugLineNum = 155582472;BA.debugLine="If clr = DefaultColor Then";
if (_clr==__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=155582473;
 //BA.debugLineNum = 155582473;BA.debugLine="fm.KerningTable.Initialize";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=155582474;
 //BA.debugLineNum = 155582474;BA.debugLine="fm.DefaultColorMetrics = fm";
_fm.DefaultColorMetrics /*b4j.docU.bctextengine._bcfontmetrics*/  = _fm;
RDebugUtils.currentLine=155582475;
 //BA.debugLineNum = 155582475;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
_fm.xWidth /*int*/  = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,"x",_fm,__c.False).Width /*int*/ ;
 }else {
RDebugUtils.currentLine=155582477;
 //BA.debugLineNum = 155582477;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
_fm.DefaultColorMetrics /*b4j.docU.bctextengine._bcfontmetrics*/  = __ref._getfontmetrics /*b4j.docU.bctextengine._bcfontmetrics*/ (null,_fnt,__ref._defaultcolor /*int*/ );
RDebugUtils.currentLine=155582478;
 //BA.debugLineNum = 155582478;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
_fm.xWidth /*int*/  = _fm.DefaultColorMetrics /*b4j.docU.bctextengine._bcfontmetrics*/ .xWidth /*int*/ ;
RDebugUtils.currentLine=155582479;
 //BA.debugLineNum = 155582479;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/  = _fm.DefaultColorMetrics /*b4j.docU.bctextengine._bcfontmetrics*/ .KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=155582481;
 //BA.debugLineNum = 155582481;BA.debugLine="FontMetricsCache.Put(key, fm)";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_fm));
RDebugUtils.currentLine=155582482;
 //BA.debugLineNum = 155582482;BA.debugLine="Return fm";
if (true) return _fm;
RDebugUtils.currentLine=155582483;
 //BA.debugLineNum = 155582483;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bctextrun  _createrun(b4j.docU.bctextengine __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createrun", true))
	 {return ((b4j.docU.bctextengine._bctextrun) Debug.delegate(ba, "createrun", new Object[] {_text}));}
b4j.docU.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=153157632;
 //BA.debugLineNum = 153157632;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
RDebugUtils.currentLine=153157633;
 //BA.debugLineNum = 153157633;BA.debugLine="Dim r As BCTextRun";
_r = new b4j.docU.bctextengine._bctextrun();
RDebugUtils.currentLine=153157634;
 //BA.debugLineNum = 153157634;BA.debugLine="r.Initialize";
_r.Initialize();
RDebugUtils.currentLine=153157635;
 //BA.debugLineNum = 153157635;BA.debugLine="r.BackgroundColor = 0";
_r.BackgroundColor /*int*/  = (int) (0);
RDebugUtils.currentLine=153157636;
 //BA.debugLineNum = 153157636;BA.debugLine="r.CharacterSpacingFactor = 1";
_r.CharacterSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=153157637;
 //BA.debugLineNum = 153157637;BA.debugLine="r.TextFont = DefaultFont";
_r.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=153157638;
 //BA.debugLineNum = 153157638;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
_r.TextChars /*b4j.docU.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*b4j.docU.bctextengine._bctextchars*/ (null,_text);
RDebugUtils.currentLine=153157639;
 //BA.debugLineNum = 153157639;BA.debugLine="r.Text = Text";
_r.Text /*String*/  = _text;
RDebugUtils.currentLine=153157640;
 //BA.debugLineNum = 153157640;BA.debugLine="r.TextColor = DefaultColor";
_r.TextColor /*int*/  = __ref._defaultcolor /*int*/ ;
RDebugUtils.currentLine=153157641;
 //BA.debugLineNum = 153157641;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=153157642;
 //BA.debugLineNum = 153157642;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bctextchars  _createbctextchars(b4j.docU.bctextengine __ref,String[] _buffer,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextchars", true))
	 {return ((b4j.docU.bctextengine._bctextchars) Debug.delegate(ba, "createbctextchars", new Object[] {_buffer,_startindex,_length}));}
b4j.docU.bctextengine._bctextchars _t1 = null;
RDebugUtils.currentLine=156565504;
 //BA.debugLineNum = 156565504;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
RDebugUtils.currentLine=156565505;
 //BA.debugLineNum = 156565505;BA.debugLine="Dim t1 As BCTextChars";
_t1 = new b4j.docU.bctextengine._bctextchars();
RDebugUtils.currentLine=156565506;
 //BA.debugLineNum = 156565506;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=156565507;
 //BA.debugLineNum = 156565507;BA.debugLine="t1.Buffer = Buffer";
_t1.Buffer /*String[]*/  = _buffer;
RDebugUtils.currentLine=156565508;
 //BA.debugLineNum = 156565508;BA.debugLine="t1.StartIndex = StartIndex";
_t1.StartIndex /*int*/  = _startindex;
RDebugUtils.currentLine=156565509;
 //BA.debugLineNum = 156565509;BA.debugLine="t1.Length = Length";
_t1.Length /*int*/  = _length;
RDebugUtils.currentLine=156565510;
 //BA.debugLineNum = 156565510;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=156565511;
 //BA.debugLineNum = 156565511;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bcparagraph  _drawtext(b4j.docU.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4j.docU.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawtext", true))
	 {return ((b4j.docU.bctextengine._bcparagraph) Debug.delegate(ba, "drawtext", new Object[] {_runs,_style,_foregroundimageview,_sv}));}
b4j.docU.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=153419776;
 //BA.debugLineNum = 153419776;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
RDebugUtils.currentLine=153419778;
 //BA.debugLineNum = 153419778;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*b4j.docU.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=153419780;
 //BA.debugLineNum = 153419780;BA.debugLine="ResizeLayers(par.Width / mScale, par.Height / mSc";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=153419781;
 //BA.debugLineNum = 153419781;BA.debugLine="DrawParagraph(par)";
__ref._drawparagraph /*String*/ (null,_par);
RDebugUtils.currentLine=153419782;
 //BA.debugLineNum = 153419782;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
if (_par.Width /*int*/ >0 && _par.Height /*int*/ >0) { 
RDebugUtils.currentLine=153419783;
 //BA.debugLineNum = 153419783;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
__ref._resizeimageview /*String*/ (null,__ref._foregroundbc /*b4j.example.bitmapcreator*/ ,_par,_foregroundimageview,_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/ );
 };
RDebugUtils.currentLine=153419785;
 //BA.debugLineNum = 153419785;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
if (_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  && _sv.IsInitialized()) { 
RDebugUtils.currentLine=153419786;
 //BA.debugLineNum = 153419786;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
_sv.setScrollViewContentHeight(__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_foregroundimageview.getHeight()+_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));
 };
RDebugUtils.currentLine=153419788;
 //BA.debugLineNum = 153419788;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=153419789;
 //BA.debugLineNum = 153419789;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=153419790;
 //BA.debugLineNum = 153419790;BA.debugLine="End Sub";
return null;
}
public String  _addltritems(b4j.docU.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _ltrlist,anywheresoftware.b4a.objects.collections.List _newlist) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addltritems", true))
	 {return ((String) Debug.delegate(ba, "addltritems", new Object[] {_ltrlist,_newlist}));}
int _startindex = 0;
int _lastindex = 0;
b4j.docU.bctextengine._bcunbreakabletext _lastun = null;
b4j.docU.bctextengine._bcunbreakabletext _prev = null;
int _i = 0;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=153747456;
 //BA.debugLineNum = 153747456;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
RDebugUtils.currentLine=153747457;
 //BA.debugLineNum = 153747457;BA.debugLine="If LTRList.Size = 0 Then Return";
if (_ltrlist.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=153747458;
 //BA.debugLineNum = 153747458;BA.debugLine="NewList.AddAll(LTRList)";
_newlist.AddAll(_ltrlist);
RDebugUtils.currentLine=153747459;
 //BA.debugLineNum = 153747459;BA.debugLine="If LTRList.Size > 1 Then";
if (_ltrlist.getSize()>1) { 
RDebugUtils.currentLine=153747460;
 //BA.debugLineNum = 153747460;BA.debugLine="Dim StartIndex As Int = 1";
_startindex = (int) (1);
RDebugUtils.currentLine=153747461;
 //BA.debugLineNum = 153747461;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
if (__ref._isunseparator /*boolean*/ (null,(b4j.docU.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (0))))) { 
RDebugUtils.currentLine=153747462;
 //BA.debugLineNum = 153747462;BA.debugLine="StartIndex = 2";
_startindex = (int) (2);
 };
RDebugUtils.currentLine=153747464;
 //BA.debugLineNum = 153747464;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
_lastindex = (int) (_ltrlist.getSize()-1);
RDebugUtils.currentLine=153747465;
 //BA.debugLineNum = 153747465;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=153747466;
 //BA.debugLineNum = 153747466;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
if (__ref._isunseparator /*boolean*/ (null,(b4j.docU.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex)))) { 
RDebugUtils.currentLine=153747467;
 //BA.debugLineNum = 153747467;BA.debugLine="LastIndex = LastIndex - 1";
_lastindex = (int) (_lastindex-1);
 };
 };
RDebugUtils.currentLine=153747470;
 //BA.debugLineNum = 153747470;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=153747471;
 //BA.debugLineNum = 153747471;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
_lastun = (b4j.docU.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex));
RDebugUtils.currentLine=153747472;
 //BA.debugLineNum = 153747472;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
_prev = (b4j.docU.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (_startindex-1)));
RDebugUtils.currentLine=153747473;
 //BA.debugLineNum = 153747473;BA.debugLine="prev.StartX = lastun.StartX";
_prev.StartX /*int*/  = _lastun.StartX /*int*/ ;
RDebugUtils.currentLine=153747474;
 //BA.debugLineNum = 153747474;BA.debugLine="For i = StartIndex To LastIndex";
{
final int step18 = 1;
final int limit18 = _lastindex;
_i = _startindex ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=153747475;
 //BA.debugLineNum = 153747475;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
_un = (b4j.docU.bctextengine._bcunbreakabletext)(_ltrlist.Get(_i));
RDebugUtils.currentLine=153747476;
 //BA.debugLineNum = 153747476;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
_un.StartX /*int*/  = (int) (_prev.StartX /*int*/ +_prev.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=153747477;
 //BA.debugLineNum = 153747477;BA.debugLine="prev = un";
_prev = _un;
 }
};
 };
 };
RDebugUtils.currentLine=153747481;
 //BA.debugLineNum = 153747481;BA.debugLine="LTRList.Clear";
_ltrlist.Clear();
RDebugUtils.currentLine=153747482;
 //BA.debugLineNum = 153747482;BA.debugLine="End Sub";
return "";
}
public boolean  _isunseparator(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isunseparator", true))
	 {return ((Boolean) Debug.delegate(ba, "isunseparator", new Object[] {_un}));}
RDebugUtils.currentLine=153812992;
 //BA.debugLineNum = 153812992;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
RDebugUtils.currentLine=153812993;
 //BA.debugLineNum = 153812993;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
if (_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=153812994;
 //BA.debugLineNum = 153812994;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
if (true) return __ref._wordboundaries /*String*/ .contains(_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .StartIndex /*int*/ ]);
RDebugUtils.currentLine=153812995;
 //BA.debugLineNum = 153812995;BA.debugLine="End Sub";
return false;
}
public String  _addparagraphviews(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addparagraphviews", true))
	 {return ((String) Debug.delegate(ba, "addparagraphviews", new Object[] {_par}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=153485312;
 //BA.debugLineNum = 153485312;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
RDebugUtils.currentLine=153485313;
 //BA.debugLineNum = 153485313;BA.debugLine="If par.Views.IsInitialized Then";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=153485314;
 //BA.debugLineNum = 153485314;BA.debugLine="For Each v As B4XView In par.Views";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _par.Views /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=153485315;
 //BA.debugLineNum = 153485315;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
_v.SetLayoutAnimated((int) (0),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()+_v.getLeft(),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_v.getTop(),_v.getWidth(),_v.getHeight());
 }
};
 };
RDebugUtils.currentLine=153485318;
 //BA.debugLineNum = 153485318;BA.debugLine="End Sub";
return "";
}
public int  _bytestoint(b4j.docU.bctextengine __ref,byte[] _bytes,int _startindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "bytestoint", true))
	 {return ((Integer) Debug.delegate(ba, "bytestoint", new Object[] {_bytes,_startindex}));}
int _cp = 0;
int _i = 0;
RDebugUtils.currentLine=155779072;
 //BA.debugLineNum = 155779072;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
RDebugUtils.currentLine=155779073;
 //BA.debugLineNum = 155779073;BA.debugLine="Dim cp As Int";
_cp = 0;
RDebugUtils.currentLine=155779074;
 //BA.debugLineNum = 155779074;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=155779075;
 //BA.debugLineNum = 155779075;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
_cp = __c.Bit.Or(_cp,__c.Bit.ShiftLeft(__c.Bit.And(((int)0xff),(int) (_bytes[(int) (_i+_startindex)])),(int) (8*_i)));
 }
};
RDebugUtils.currentLine=155779077;
 //BA.debugLineNum = 155779077;BA.debugLine="Return cp";
if (true) return _cp;
RDebugUtils.currentLine=155779078;
 //BA.debugLineNum = 155779078;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
RDebugUtils.currentLine=152895488;
 //BA.debugLineNum = 152895488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=152895489;
 //BA.debugLineNum = 152895489;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=152895490;
 //BA.debugLineNum = 152895490;BA.debugLine="Public cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=152895491;
 //BA.debugLineNum = 152895491;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
RDebugUtils.currentLine=152895493;
 //BA.debugLineNum = 152895493;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
RDebugUtils.currentLine=152895495;
 //BA.debugLineNum = 152895495;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
RDebugUtils.currentLine=152895497;
 //BA.debugLineNum = 152895497;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
RDebugUtils.currentLine=152895500;
 //BA.debugLineNum = 152895500;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
RDebugUtils.currentLine=152895501;
 //BA.debugLineNum = 152895501;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
RDebugUtils.currentLine=152895502;
 //BA.debugLineNum = 152895502;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
_extra_connectedruns = "ConnectedRuns";
_extra_styledunderline = "StyledUnderline";
RDebugUtils.currentLine=152895505;
 //BA.debugLineNum = 152895505;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
RDebugUtils.currentLine=152895508;
 //BA.debugLineNum = 152895508;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
RDebugUtils.currentLine=152895510;
 //BA.debugLineNum = 152895510;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
RDebugUtils.currentLine=152895512;
 //BA.debugLineNum = 152895512;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
RDebugUtils.currentLine=152895514;
 //BA.debugLineNum = 152895514;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
RDebugUtils.currentLine=152895515;
 //BA.debugLineNum = 152895515;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
RDebugUtils.currentLine=152895516;
 //BA.debugLineNum = 152895516;BA.debugLine="Private CharBC As BitmapCreator";
_charbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=152895517;
 //BA.debugLineNum = 152895517;BA.debugLine="Private cbccache As InternalCompressedBCCache";
_cbccache = new b4j.example.bitmapcreator._internalcompressedbccache();
RDebugUtils.currentLine=152895518;
 //BA.debugLineNum = 152895518;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
_defaultunderlinestyle = new b4j.docU.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=152895519;
 //BA.debugLineNum = 152895519;BA.debugLine="Public mScale As Float = 1";
_mscale = (float) (1);
RDebugUtils.currentLine=152895520;
 //BA.debugLineNum = 152895520;BA.debugLine="Private mSpaceBetweenCharacters As Float";
_mspacebetweencharacters = 0f;
RDebugUtils.currentLine=152895521;
 //BA.debugLineNum = 152895521;BA.debugLine="Private mSpaceBetweenLines As Int";
_mspacebetweenlines = 0;
RDebugUtils.currentLine=152895522;
 //BA.debugLineNum = 152895522;BA.debugLine="Private FontMetricsCache As Map";
_fontmetricscache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=152895523;
 //BA.debugLineNum = 152895523;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
_foregroundbc = new b4j.example.bitmapcreator();
_backgroundbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=152895524;
 //BA.debugLineNum = 152895524;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
_defaultcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=152895525;
 //BA.debugLineNum = 152895525;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
_wordboundaries = "&*+-/.<>=\\' ,:{}"+__c.TAB+__c.CRLF+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=152895526;
 //BA.debugLineNum = 152895526;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
_wordboundariesthatcanconnecttoprevword = ".,:";
RDebugUtils.currentLine=152895527;
 //BA.debugLineNum = 152895527;BA.debugLine="Private Brushes As Map";
_brushes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=152895528;
 //BA.debugLineNum = 152895528;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
_defaultstyle = new b4j.docU.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=152895529;
 //BA.debugLineNum = 152895529;BA.debugLine="Public DefaultFont As B4XFont";
_defaultfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=152895530;
 //BA.debugLineNum = 152895530;BA.debugLine="Private mMinGapBetweenLines As Int = 5dip";
_mmingapbetweenlines = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=152895534;
 //BA.debugLineNum = 152895534;BA.debugLine="Private WritableImage As JavaObject";
_writableimage = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=152895535;
 //BA.debugLineNum = 152895535;BA.debugLine="Private sp As JavaObject";
_sp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=152895537;
 //BA.debugLineNum = 152895537;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
_tabwidthmeasuredinx = (int) (4);
RDebugUtils.currentLine=152895538;
 //BA.debugLineNum = 152895538;BA.debugLine="Public TagParser As BBCodeParser";
_tagparser = new b4j.docU.bbcodeparser();
RDebugUtils.currentLine=152895539;
 //BA.debugLineNum = 152895539;BA.debugLine="Private EmptyTextChars As BCTextChars";
_emptytextchars = new b4j.docU.bctextengine._bctextchars();
RDebugUtils.currentLine=152895540;
 //BA.debugLineNum = 152895540;BA.debugLine="Private Emojis As B4XSet";
_emojis = new b4j.docU.b4xset();
RDebugUtils.currentLine=152895541;
 //BA.debugLineNum = 152895541;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
_charset = "UTF-32LE";
RDebugUtils.currentLine=152895542;
 //BA.debugLineNum = 152895542;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
_lookforcomplexcharacters = __c.True;
RDebugUtils.currentLine=152895543;
 //BA.debugLineNum = 152895543;BA.debugLine="Public CustomFonts As Map";
_customfonts = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=152895544;
 //BA.debugLineNum = 152895544;BA.debugLine="Public KerningEnabled As Boolean = True";
_kerningenabled = __c.True;
RDebugUtils.currentLine=152895545;
 //BA.debugLineNum = 152895545;BA.debugLine="Private IndentWidth As Int";
_indentwidth = 0;
RDebugUtils.currentLine=152895546;
 //BA.debugLineNum = 152895546;BA.debugLine="Public VowelsCodePoints As B4XSet";
_vowelscodepoints = new b4j.docU.b4xset();
RDebugUtils.currentLine=152895547;
 //BA.debugLineNum = 152895547;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
_asyncbcs = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=152895548;
 //BA.debugLineNum = 152895548;BA.debugLine="Private AsyncBC As BitmapCreator";
_asyncbc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=152895549;
 //BA.debugLineNum = 152895549;BA.debugLine="Private AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=152895550;
 //BA.debugLineNum = 152895550;BA.debugLine="Private AsyncMode As Boolean";
_asyncmode = false;
RDebugUtils.currentLine=152895551;
 //BA.debugLineNum = 152895551;BA.debugLine="Private RTLChars As B4XSet";
_rtlchars = new b4j.docU.b4xset();
RDebugUtils.currentLine=152895552;
 //BA.debugLineNum = 152895552;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
_textdirectionltr = (int) (1);
_textdirectionunknown = (int) (0);
_textdirectionrtl = (int) (-1);
RDebugUtils.currentLine=152895553;
 //BA.debugLineNum = 152895553;BA.debugLine="Private ArabicMap As Map";
_arabicmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=152895554;
 //BA.debugLineNum = 152895554;BA.debugLine="Private ArabicNonLinkedLetters As B4XSet";
_arabicnonlinkedletters = new b4j.docU.b4xset();
RDebugUtils.currentLine=152895555;
 //BA.debugLineNum = 152895555;BA.debugLine="Private ArabicCharsConnectedPrev As B4XSet";
_arabiccharsconnectedprev = new b4j.docU.b4xset();
RDebugUtils.currentLine=152895556;
 //BA.debugLineNum = 152895556;BA.debugLine="Private PMDefaultColor As PremultipliedColor";
_pmdefaultcolor = new b4j.example.bitmapcreator._premultipliedcolor();
RDebugUtils.currentLine=152895557;
 //BA.debugLineNum = 152895557;BA.debugLine="Public RTLAware As Boolean";
_rtlaware = false;
RDebugUtils.currentLine=152895558;
 //BA.debugLineNum = 152895558;BA.debugLine="End Sub";
return "";
}
public String  _loadarabicdata(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loadarabicdata", true))
	 {return ((String) Debug.delegate(ba, "loadarabicdata", null));}
b4j.example.bitmapcreator._argbcolor _a = null;
String _line = "";
String[] _split = null;
RDebugUtils.currentLine=156762112;
 //BA.debugLineNum = 156762112;BA.debugLine="Private Sub LoadArabicData";
RDebugUtils.currentLine=156762113;
 //BA.debugLineNum = 156762113;BA.debugLine="If ArabicMap.IsInitialized = False Then";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=156762114;
 //BA.debugLineNum = 156762114;BA.debugLine="ArabicMap.Initialize";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=156762115;
 //BA.debugLineNum = 156762115;BA.debugLine="ArabicNonLinkedLetters.Initialize";
__ref._arabicnonlinkedletters /*b4j.docU.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=156762116;
 //BA.debugLineNum = 156762116;BA.debugLine="ArabicCharsConnectedPrev.Initialize";
__ref._arabiccharsconnectedprev /*b4j.docU.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=156762117;
 //BA.debugLineNum = 156762117;BA.debugLine="Dim a As ARGBColor";
_a = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=156762118;
 //BA.debugLineNum = 156762118;BA.debugLine="CharBC.ColorToARGB(DefaultColor, a)";
__ref._charbc /*b4j.example.bitmapcreator*/ ._colortoargb(__ref._defaultcolor /*int*/ ,_a);
RDebugUtils.currentLine=156762119;
 //BA.debugLineNum = 156762119;BA.debugLine="CharBC.ARGBToPremultipliedColor(a, PMDefaultColo";
__ref._charbc /*b4j.example.bitmapcreator*/ ._argbtopremultipliedcolor(_a,__ref._pmdefaultcolor /*b4j.example.bitmapcreator._premultipliedcolor*/ );
RDebugUtils.currentLine=156762120;
 //BA.debugLineNum = 156762120;BA.debugLine="For Each line As String In File.ReadList(File.Di";
{
final anywheresoftware.b4a.BA.IterableList group8 = __c.File.ReadList(__c.File.getDirAssets(),"arabic_mapping.txt");
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_line = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=156762121;
 //BA.debugLineNum = 156762121;BA.debugLine="Dim split() As String = Regex.Split(\",\", line)";
_split = __c.Regex.Split(",",_line);
RDebugUtils.currentLine=156762122;
 //BA.debugLineNum = 156762122;BA.debugLine="If split.Length = 2 And split(1) = \"0\" Then";
if (_split.length==2 && (_split[(int) (1)]).equals("0")) { 
RDebugUtils.currentLine=156762123;
 //BA.debugLineNum = 156762123;BA.debugLine="VowelsCodePoints.Add(Bit.ParseInt(split(0), 16";
__ref._vowelscodepoints /*b4j.docU.b4xset*/ ._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_split[(int) (0)],(int) (16))));
 }else {
RDebugUtils.currentLine=156762125;
 //BA.debugLineNum = 156762125;BA.debugLine="ArabicMap.Put(Chr(Bit.ParseInt(split(0), 16)).";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))),(Object)(__c.Bit.ParseInt(_split[(int) (1)],(int) (16))));
RDebugUtils.currentLine=156762126;
 //BA.debugLineNum = 156762126;BA.debugLine="If 2 = split(2) Then";
if (2==(double)(Double.parseDouble(_split[(int) (2)]))) { 
RDebugUtils.currentLine=156762127;
 //BA.debugLineNum = 156762127;BA.debugLine="ArabicNonLinkedLetters.Add(Chr(Bit.ParseInt(s";
__ref._arabicnonlinkedletters /*b4j.docU.b4xset*/ ._add /*String*/ (null,(Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))));
 };
 };
 }
};
 };
RDebugUtils.currentLine=156762132;
 //BA.debugLineNum = 156762132;BA.debugLine="End Sub";
return "";
}
public String  _preprocessarabic(b4j.docU.bctextengine __ref,String[] _chars,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "preprocessarabic", true))
	 {return ((String) Debug.delegate(ba, "preprocessarabic", new Object[] {_chars,_length}));}
b4j.docU.b4xbitset _arabicchars = null;
b4j.docU.b4xbitset _arabicnonlinked = null;
String[] _fullchars = null;
boolean _found = false;
int _i = 0;
boolean _connecttoprev = false;
boolean _connecttonext = false;
int _offset = 0;
int _targetcp = 0;
RDebugUtils.currentLine=156827648;
 //BA.debugLineNum = 156827648;BA.debugLine="Public Sub PreprocessArabic(chars() As String, Len";
RDebugUtils.currentLine=156827649;
 //BA.debugLineNum = 156827649;BA.debugLine="LoadArabicData";
__ref._loadarabicdata /*String*/ (null);
RDebugUtils.currentLine=156827650;
 //BA.debugLineNum = 156827650;BA.debugLine="Dim ArabicChars, ArabicNonLinked As B4XBitSet";
_arabicchars = new b4j.docU.b4xbitset();
_arabicnonlinked = new b4j.docU.b4xbitset();
RDebugUtils.currentLine=156827651;
 //BA.debugLineNum = 156827651;BA.debugLine="Dim FullChars(Length) As String";
_fullchars = new String[_length];
java.util.Arrays.fill(_fullchars,"");
RDebugUtils.currentLine=156827652;
 //BA.debugLineNum = 156827652;BA.debugLine="Dim Found As Boolean";
_found = false;
RDebugUtils.currentLine=156827653;
 //BA.debugLineNum = 156827653;BA.debugLine="For i = 0 To Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=156827654;
 //BA.debugLineNum = 156827654;BA.debugLine="If ArabicMap.ContainsKey(chars(i).CharAt(0).As(S";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)((BA.ObjectToString(_chars[_i].charAt((int) (0))))))) { 
RDebugUtils.currentLine=156827655;
 //BA.debugLineNum = 156827655;BA.debugLine="If chars(i).Length > 1 Then";
if (_chars[_i].length()>1) { 
RDebugUtils.currentLine=156827656;
 //BA.debugLineNum = 156827656;BA.debugLine="FullChars(i) = chars(i).SubString(1)";
_fullchars[_i] = _chars[_i].substring((int) (1));
RDebugUtils.currentLine=156827657;
 //BA.debugLineNum = 156827657;BA.debugLine="chars(i) = chars(i).CharAt(0).As(String)";
_chars[_i] = (BA.ObjectToString(_chars[_i].charAt((int) (0))));
 };
RDebugUtils.currentLine=156827659;
 //BA.debugLineNum = 156827659;BA.debugLine="If Found = False Then";
if (_found==__c.False) { 
RDebugUtils.currentLine=156827660;
 //BA.debugLineNum = 156827660;BA.debugLine="Found = True";
_found = __c.True;
RDebugUtils.currentLine=156827661;
 //BA.debugLineNum = 156827661;BA.debugLine="ArabicChars.Initialize(Length)";
_arabicchars._initialize /*String*/ (null,ba,_length);
RDebugUtils.currentLine=156827662;
 //BA.debugLineNum = 156827662;BA.debugLine="ArabicNonLinked.Initialize(Length)";
_arabicnonlinked._initialize /*String*/ (null,ba,_length);
 };
RDebugUtils.currentLine=156827664;
 //BA.debugLineNum = 156827664;BA.debugLine="ArabicChars.Set(i, True)";
_arabicchars._set /*String*/ (null,_i,__c.True);
RDebugUtils.currentLine=156827665;
 //BA.debugLineNum = 156827665;BA.debugLine="If ArabicNonLinkedLetters.Contains(chars(i)) Th";
if (__ref._arabicnonlinkedletters /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_chars[_i]))) { 
RDebugUtils.currentLine=156827666;
 //BA.debugLineNum = 156827666;BA.debugLine="ArabicNonLinked.Set(i, True)";
_arabicnonlinked._set /*String*/ (null,_i,__c.True);
 };
 };
 }
};
RDebugUtils.currentLine=156827670;
 //BA.debugLineNum = 156827670;BA.debugLine="If Found = False Then Return";
if (_found==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=156827671;
 //BA.debugLineNum = 156827671;BA.debugLine="For i = 0 To Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=156827672;
 //BA.debugLineNum = 156827672;BA.debugLine="If ArabicChars.Get(i) Then";
if (_arabicchars._get /*boolean*/ (null,_i)) { 
RDebugUtils.currentLine=156827673;
 //BA.debugLineNum = 156827673;BA.debugLine="Dim ConnectToPrev As Boolean = i > 0 And Arabic";
_connecttoprev = _i>0 && _arabicchars._get /*boolean*/ (null,(int) (_i-1)) && _arabicnonlinked._get /*boolean*/ (null,(int) (_i-1))==__c.False;
RDebugUtils.currentLine=156827674;
 //BA.debugLineNum = 156827674;BA.debugLine="Dim ConnectToNext As Boolean = i < Length - 1 A";
_connecttonext = _i<_length-1 && _arabicchars._get /*boolean*/ (null,(int) (_i+1)) && _arabicnonlinked._get /*boolean*/ (null,_i)==__c.False;
RDebugUtils.currentLine=156827675;
 //BA.debugLineNum = 156827675;BA.debugLine="If ConnectToNext = False And ConnectToPrev = Fa";
if (_connecttonext==__c.False && _connecttoprev==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=156827676;
 //BA.debugLineNum = 156827676;BA.debugLine="Dim offset As Int = IIf(ConnectToPrev And Conne";
_offset = (int)(BA.ObjectToNumber(((_connecttoprev && _connecttonext) ? ((Object)(3)) : (((_connecttoprev) ? ((Object)(1)) : ((Object)(2)))))));
RDebugUtils.currentLine=156827677;
 //BA.debugLineNum = 156827677;BA.debugLine="Dim TargetCP As Int = ArabicMap.Get(chars(i))";
_targetcp = (int)(BA.ObjectToNumber(__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_chars[_i]))));
RDebugUtils.currentLine=156827678;
 //BA.debugLineNum = 156827678;BA.debugLine="If TargetCP = Asc(chars(i)) Then";
if (_targetcp==__c.Asc(BA.ObjectToChar(_chars[_i]))) { 
RDebugUtils.currentLine=156827679;
 //BA.debugLineNum = 156827679;BA.debugLine="offset = 0";
_offset = (int) (0);
 };
RDebugUtils.currentLine=156827681;
 //BA.debugLineNum = 156827681;BA.debugLine="TargetCP = TargetCP + offset";
_targetcp = (int) (_targetcp+_offset);
RDebugUtils.currentLine=156827682;
 //BA.debugLineNum = 156827682;BA.debugLine="chars(i) = Chr(TargetCP)";
_chars[_i] = BA.ObjectToString(__c.Chr(_targetcp));
RDebugUtils.currentLine=156827683;
 //BA.debugLineNum = 156827683;BA.debugLine="If FullChars(i).Length > 0 Then chars(i) = char";
if (_fullchars[_i].length()>0) { 
_chars[_i] = _chars[_i]+_fullchars[_i];};
RDebugUtils.currentLine=156827684;
 //BA.debugLineNum = 156827684;BA.debugLine="If ConnectToPrev Then ArabicCharsConnectedPrev.";
if (_connecttoprev) { 
__ref._arabiccharsconnectedprev /*b4j.docU.b4xset*/ ._add /*String*/ (null,(Object)(_chars[_i]));};
 };
 }
};
RDebugUtils.currentLine=156827687;
 //BA.debugLineNum = 156827687;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bcglyph  _createglyph(b4j.docU.bctextengine __ref,String _c,b4j.docU.bctextengine._bcfontmetrics _fontmetrics,boolean _justmeasure) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyph", true))
	 {return ((b4j.docU.bctextengine._bcglyph) Debug.delegate(ba, "createglyph", new Object[] {_c,_fontmetrics,_justmeasure}));}
b4j.docU.bctextengine._bcglyph _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _leftoffset = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
b4j.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=155648000;
 //BA.debugLineNum = 155648000;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
RDebugUtils.currentLine=155648001;
 //BA.debugLineNum = 155648001;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
_g = (b4j.docU.bctextengine._bcglyph)(_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_c)));
RDebugUtils.currentLine=155648002;
 //BA.debugLineNum = 155648002;BA.debugLine="If g <> Null Then Return g";
if (_g!= null) { 
if (true) return _g;};
RDebugUtils.currentLine=155648003;
 //BA.debugLineNum = 155648003;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
if (_fontmetrics.Clr /*int*/ !=__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=155648004;
 //BA.debugLineNum = 155648004;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
if (true) return __ref._createglyphfromdefaultcolor /*b4j.docU.bctextengine._bcglyph*/ (null,_c,_fontmetrics.DefaultColorMetrics /*b4j.docU.bctextengine._bcfontmetrics*/ ,_fontmetrics.Clr /*int*/ );
 }else {
RDebugUtils.currentLine=155648006;
 //BA.debugLineNum = 155648006;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=155648007;
 //BA.debugLineNum = 155648007;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_c,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=155648008;
 //BA.debugLineNum = 155648008;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
_baseline = (int) (-_r.getTop()+5);
RDebugUtils.currentLine=155648009;
 //BA.debugLineNum = 155648009;BA.debugLine="r.Left = r.Left * mScale";
_r.setLeft((float) (_r.getLeft()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155648010;
 //BA.debugLineNum = 155648010;BA.debugLine="r.Top = r.Top * mScale";
_r.setTop((float) (_r.getTop()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155648011;
 //BA.debugLineNum = 155648011;BA.debugLine="r.Right = r.Right * mScale";
_r.setRight((float) (_r.getRight()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155648012;
 //BA.debugLineNum = 155648012;BA.debugLine="r.Bottom = r.Bottom * mScale";
_r.setBottom((float) (_r.getBottom()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155648013;
 //BA.debugLineNum = 155648013;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._mwidth<_r.getWidth()+20*__ref._mscale /*float*/  || __ref._charbc /*b4j.example.bitmapcreator*/ ._mheight<_r.getHeight()+20*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=155648014;
 //BA.debugLineNum = 155648014;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
__ref._resizecharbc /*String*/ (null,(int) (_r.getWidth()+30*__ref._mscale /*float*/ ),(int) (_r.getHeight()+30*__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=155648017;
 //BA.debugLineNum = 155648017;BA.debugLine="Dim leftOffset As Int = 5";
_leftoffset = (int) (5);
RDebugUtils.currentLine=155648018;
 //BA.debugLineNum = 155648018;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(_c,_leftoffset,_baseline,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_fontmetrics.Clr /*int*/ ,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
RDebugUtils.currentLine=155648022;
 //BA.debugLineNum = 155648022;BA.debugLine="Dim jo As JavaObject = cvs";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ));
RDebugUtils.currentLine=155648023;
 //BA.debugLineNum = 155648023;BA.debugLine="Dim bmp As B4XBitmap = jo.GetFieldJO(\"cvs\").RunM";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_jo.GetFieldJO("cvs").RunMethodJO("getObject",(Object[])(__c.Null)).RunMethod("snapshot",new Object[]{(Object)(__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(__ref._writableimage /*anywheresoftware.b4j.object.JavaObject*/ .getObject())})));
RDebugUtils.currentLine=155648031;
 //BA.debugLineNum = 155648031;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
__ref._charbc /*b4j.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=155648032;
 //BA.debugLineNum = 155648032;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
_r2 = __ref._findminrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,(int) (_leftoffset+_r.getRight()+20*__ref._mscale /*float*/ ),(int) (_r.getHeight()+20*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155648034;
 //BA.debugLineNum = 155648034;BA.debugLine="Dim g As BCGlyph";
_g = new b4j.docU.bctextengine._bcglyph();
RDebugUtils.currentLine=155648035;
 //BA.debugLineNum = 155648035;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=155648036;
 //BA.debugLineNum = 155648036;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
_g.baseline /*int*/  = (int) (_baseline*__ref._mscale /*float*/ -_r2.getTop());
RDebugUtils.currentLine=155648037;
 //BA.debugLineNum = 155648037;BA.debugLine="If r2.Width > 0 Then";
if (_r2.getWidth()>0) { 
RDebugUtils.currentLine=155648038;
 //BA.debugLineNum = 155648038;BA.debugLine="r2.Left = Floor(r2.Left)";
_r2.setLeft((float) (__c.Floor(_r2.getLeft())));
RDebugUtils.currentLine=155648039;
 //BA.debugLineNum = 155648039;BA.debugLine="r2.Right = Ceil(r2.Right)";
_r2.setRight((float) (__c.Ceil(_r2.getRight())));
RDebugUtils.currentLine=155648040;
 //BA.debugLineNum = 155648040;BA.debugLine="If RTLAware Then RecolorEdgesOfConnectedCharact";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._recoloredgesofconnectedcharacters /*String*/ (null,_c,_r2);};
RDebugUtils.currentLine=155648046;
 //BA.debugLineNum = 155648046;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
_cbc = __ref._charbc /*b4j.example.bitmapcreator*/ ._extractcompressedbc(_r2,__ref._cbccache /*b4j.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=155648047;
 //BA.debugLineNum = 155648047;BA.debugLine="g.cbc = cbc";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/  = _cbc;
RDebugUtils.currentLine=155648048;
 //BA.debugLineNum = 155648048;BA.debugLine="g.width = cbc.mWidth";
_g.Width /*int*/  = _cbc.mWidth;
 }else {
RDebugUtils.currentLine=155648050;
 //BA.debugLineNum = 155648050;BA.debugLine="g.Empty = True";
_g.Empty /*boolean*/  = __c.True;
RDebugUtils.currentLine=155648051;
 //BA.debugLineNum = 155648051;BA.debugLine="If c = TAB Then";
if ((_c).equals(__c.TAB)) { 
RDebugUtils.currentLine=155648052;
 //BA.debugLineNum = 155648052;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
_g.Width /*int*/  = (int) (_fontmetrics.xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
 }else 
{RDebugUtils.currentLine=155648053;
 //BA.debugLineNum = 155648053;BA.debugLine="Else if c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=155648054;
 //BA.debugLineNum = 155648054;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
_g.Width /*int*/  = (int) (__ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,"x x",_fontmetrics,__c.True).Width /*int*/ -_fontmetrics.xWidth /*int*/ *2);
 }else 
{RDebugUtils.currentLine=155648055;
 //BA.debugLineNum = 155648055;BA.debugLine="Else If c = \"x\" Then";
if ((_c).equals("x")) { 
RDebugUtils.currentLine=155648056;
 //BA.debugLineNum = 155648056;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
_g = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,"X",_fontmetrics,__c.True);
 }else 
{RDebugUtils.currentLine=155648057;
 //BA.debugLineNum = 155648057;BA.debugLine="Else If c = \"x x\" Then";
if ((_c).equals("x x")) { 
RDebugUtils.currentLine=155648058;
 //BA.debugLineNum = 155648058;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
_g = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,"X X",_fontmetrics,__c.True);
 }else {
RDebugUtils.currentLine=155648060;
 //BA.debugLineNum = 155648060;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
_g.Width /*int*/  = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null," ",_fontmetrics,__c.False).Width /*int*/ ;
 }}}}
;
 };
RDebugUtils.currentLine=155648063;
 //BA.debugLineNum = 155648063;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False && __ref._mightbeanemoji /*boolean*/ (null,_c)) { 
RDebugUtils.currentLine=155648064;
 //BA.debugLineNum = 155648064;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
if (__ref._emojis /*b4j.docU.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._loaddata /*String*/ (null,__ref._emojis /*b4j.docU.b4xset*/ ,"emoji-data.txt");};
RDebugUtils.currentLine=155648065;
 //BA.debugLineNum = 155648065;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
_g.Emoji /*boolean*/  = __ref._emojis /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(__ref._bytestoint /*int*/ (null,_c.getBytes(__ref._charset /*String*/ ),(int) (0))));
 };
RDebugUtils.currentLine=155648067;
 //BA.debugLineNum = 155648067;BA.debugLine="If JustMeasure = False Then";
if (_justmeasure==__c.False) { 
RDebugUtils.currentLine=155648068;
 //BA.debugLineNum = 155648068;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_c),(Object)(_g));
 };
RDebugUtils.currentLine=155648070;
 //BA.debugLineNum = 155648070;BA.debugLine="Return g";
if (true) return _g;
 };
RDebugUtils.currentLine=155648072;
 //BA.debugLineNum = 155648072;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bcglyph  _createglyphfromdefaultcolor(b4j.docU.bctextengine __ref,String _c,b4j.docU.bctextengine._bcfontmetrics _defaultcolormetrics,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyphfromdefaultcolor", true))
	 {return ((b4j.docU.bctextengine._bcglyph) Debug.delegate(ba, "createglyphfromdefaultcolor", new Object[] {_c,_defaultcolormetrics,_clr}));}
b4j.docU.bctextengine._bcglyph _blackglyph = null;
b4j.docU.bctextengine._bcglyph _g = null;
byte[] _buffer = null;
b4j.example.bitmapcreator._argbcolor _argb = null;
int _ai = 0;
int _ri = 0;
int _gi = 0;
int _bi = 0;
int _i = 0;
int _a = 0;
float _af = 0f;
RDebugUtils.currentLine=155910144;
 //BA.debugLineNum = 155910144;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
RDebugUtils.currentLine=155910145;
 //BA.debugLineNum = 155910145;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
_blackglyph = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,_c,_defaultcolormetrics,__c.False);
RDebugUtils.currentLine=155910146;
 //BA.debugLineNum = 155910146;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
if (_blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .IsInitialized==__c.False || _blackglyph.Emoji /*boolean*/ ) { 
if (true) return _blackglyph;};
RDebugUtils.currentLine=155910147;
 //BA.debugLineNum = 155910147;BA.debugLine="Dim g As BCGlyph";
_g = new b4j.docU.bctextengine._bcglyph();
RDebugUtils.currentLine=155910148;
 //BA.debugLineNum = 155910148;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=155910149;
 //BA.debugLineNum = 155910149;BA.debugLine="g.baseline = BlackGlyph.baseline";
_g.baseline /*int*/  = _blackglyph.baseline /*int*/ ;
RDebugUtils.currentLine=155910150;
 //BA.debugLineNum = 155910150;BA.debugLine="g.width = BlackGlyph.width";
_g.Width /*int*/  = _blackglyph.Width /*int*/ ;
RDebugUtils.currentLine=155910151;
 //BA.debugLineNum = 155910151;BA.debugLine="g.cbc.Initialize";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Initialize();
RDebugUtils.currentLine=155910152;
 //BA.debugLineNum = 155910152;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Cache = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Cache;
RDebugUtils.currentLine=155910153;
 //BA.debugLineNum = 155910153;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mHeight = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mHeight;
RDebugUtils.currentLine=155910154;
 //BA.debugLineNum = 155910154;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mWidth = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mWidth;
RDebugUtils.currentLine=155910155;
 //BA.debugLineNum = 155910155;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Rows = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .Rows;
RDebugUtils.currentLine=155910156;
 //BA.debugLineNum = 155910156;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect = _blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect;
RDebugUtils.currentLine=155910157;
 //BA.debugLineNum = 155910157;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
_buffer = new byte[_blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mBuffer.length];
;
RDebugUtils.currentLine=155910158;
 //BA.debugLineNum = 155910158;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=155910159;
 //BA.debugLineNum = 155910159;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
__ref._charbc /*b4j.example.bitmapcreator*/ ._colortoargb(_clr,_argb);
RDebugUtils.currentLine=155910160;
 //BA.debugLineNum = 155910160;BA.debugLine="Dim ai, ri, gi, bi As Int";
_ai = 0;
_ri = 0;
_gi = 0;
_bi = 0;
RDebugUtils.currentLine=155910167;
 //BA.debugLineNum = 155910167;BA.debugLine="ai = 3";
_ai = (int) (3);
RDebugUtils.currentLine=155910168;
 //BA.debugLineNum = 155910168;BA.debugLine="ri = 2";
_ri = (int) (2);
RDebugUtils.currentLine=155910169;
 //BA.debugLineNum = 155910169;BA.debugLine="gi = 1";
_gi = (int) (1);
RDebugUtils.currentLine=155910170;
 //BA.debugLineNum = 155910170;BA.debugLine="bi = 0";
_bi = (int) (0);
RDebugUtils.currentLine=155910172;
 //BA.debugLineNum = 155910172;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
{
final int step21 = 4;
final int limit21 = (int) (_buffer.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=155910181;
 //BA.debugLineNum = 155910181;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
_a = __c.Bit.And(((int)0xff),(int) (_blackglyph.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mBuffer[(int) (_i+_ai)]));
RDebugUtils.currentLine=155910182;
 //BA.debugLineNum = 155910182;BA.debugLine="Dim af As Float = a / 255";
_af = (float) (_a/(double)255);
RDebugUtils.currentLine=155910183;
 //BA.debugLineNum = 155910183;BA.debugLine="buffer(i + ai) = a";
_buffer[(int) (_i+_ai)] = (byte) (_a);
RDebugUtils.currentLine=155910184;
 //BA.debugLineNum = 155910184;BA.debugLine="buffer(i + ri) = argb.r * af";
_buffer[(int) (_i+_ri)] = (byte) (_argb.r*_af);
RDebugUtils.currentLine=155910185;
 //BA.debugLineNum = 155910185;BA.debugLine="buffer(i + gi) = argb.g * af";
_buffer[(int) (_i+_gi)] = (byte) (_argb.g*_af);
RDebugUtils.currentLine=155910186;
 //BA.debugLineNum = 155910186;BA.debugLine="buffer(i + bi) = argb.b * af";
_buffer[(int) (_i+_bi)] = (byte) (_argb.b*_af);
 }
};
RDebugUtils.currentLine=155910189;
 //BA.debugLineNum = 155910189;BA.debugLine="g.cbc.mBuffer = buffer";
_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mBuffer = _buffer;
RDebugUtils.currentLine=155910190;
 //BA.debugLineNum = 155910190;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=155910191;
 //BA.debugLineNum = 155910191;BA.debugLine="End Sub";
return null;
}
public String  _resizecharbc(b4j.docU.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizecharbc", true))
	 {return ((String) Debug.delegate(ba, "resizecharbc", new Object[] {_width,_height}));}
int _scaledwidth = 0;
int _scaledheight = 0;
int _w = 0;
int _h = 0;
anywheresoftware.b4j.objects.JFX _fx = null;
anywheresoftware.b4j.object.JavaObject _transform = null;
double _scale = 0;
RDebugUtils.currentLine=155320320;
 //BA.debugLineNum = 155320320;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
RDebugUtils.currentLine=155320321;
 //BA.debugLineNum = 155320321;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
_scaledwidth = (int) ((_width+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=155320322;
 //BA.debugLineNum = 155320322;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
_scaledheight = (int) ((_height+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=155320323;
 //BA.debugLineNum = 155320323;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
__ref._charbc /*b4j.example.bitmapcreator*/ ._initialize(ba,(int) (_scaledwidth*__ref._mscale /*float*/ ),(int) (_scaledheight*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155320324;
 //BA.debugLineNum = 155320324;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
__ref._charbc /*b4j.example.bitmapcreator*/ ._max_same_color_size = (int) (0);
RDebugUtils.currentLine=155320325;
 //BA.debugLineNum = 155320325;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
__ref._charbc /*b4j.example.bitmapcreator*/ ._alphathresholdforcbcextraction = (int) (0);
RDebugUtils.currentLine=155320326;
 //BA.debugLineNum = 155320326;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize(_scaledwidth,_scaledheight);
RDebugUtils.currentLine=155320328;
 //BA.debugLineNum = 155320328;BA.debugLine="Dim w As Int = mScale * cvs.TargetRect.Width";
_w = (int) (__ref._mscale /*float*/ *__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth());
RDebugUtils.currentLine=155320329;
 //BA.debugLineNum = 155320329;BA.debugLine="Dim h As Int = mScale * cvs.TargetRect.Height";
_h = (int) (__ref._mscale /*float*/ *__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=155320330;
 //BA.debugLineNum = 155320330;BA.debugLine="WritableImage.InitializeNewInstance(\"javafx.scene";
__ref._writableimage /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.image.WritableImage",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=155320331;
 //BA.debugLineNum = 155320331;BA.debugLine="Dim sp As JavaObject";
_sp = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=155320332;
 //BA.debugLineNum = 155320332;BA.debugLine="sp.InitializeNewInstance(\"javafx.scene.SnapshotPa";
__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.SnapshotParameters",(Object[])(__c.Null));
RDebugUtils.currentLine=155320333;
 //BA.debugLineNum = 155320333;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=155320334;
 //BA.debugLineNum = 155320334;BA.debugLine="sp.RunMethod(\"setFill\", Array(fx.Colors.Transpare";
__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(_fx.Colors.Transparent)});
RDebugUtils.currentLine=155320335;
 //BA.debugLineNum = 155320335;BA.debugLine="Dim transform As JavaObject";
_transform = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=155320336;
 //BA.debugLineNum = 155320336;BA.debugLine="transform.InitializeStatic(\"javafx.scene.transfor";
_transform.InitializeStatic("javafx.scene.transform.Transform");
RDebugUtils.currentLine=155320337;
 //BA.debugLineNum = 155320337;BA.debugLine="Dim scale As Double = mScale";
_scale = __ref._mscale /*float*/ ;
RDebugUtils.currentLine=155320338;
 //BA.debugLineNum = 155320338;BA.debugLine="sp.RunMethod(\"setTransform\", Array(transform.RunM";
__ref._sp /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setTransform",new Object[]{_transform.RunMethod("scale",new Object[]{(Object)(_scale),(Object)(_scale)})});
RDebugUtils.currentLine=155320340;
 //BA.debugLineNum = 155320340;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _findminrect(b4j.docU.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findminrect", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "findminrect", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=155975680;
 //BA.debugLineNum = 155975680;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
RDebugUtils.currentLine=155975681;
 //BA.debugLineNum = 155975681;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=155975682;
 //BA.debugLineNum = 155975682;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
_r.Initialize((float) (_width/(double)2),(float) (-1),(float) (-1),(float) (0));
RDebugUtils.currentLine=155975683;
 //BA.debugLineNum = 155975683;BA.debugLine="For y = 0 To height - 1";
{
final int step3 = 1;
final int limit3 = (int) (_height-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=155975684;
 //BA.debugLineNum = 155975684;BA.debugLine="For x = 0 To width - 1";
{
final int step4 = 1;
final int limit4 = (int) (_width-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=155975685;
 //BA.debugLineNum = 155975685;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=155975686;
 //BA.debugLineNum = 155975686;BA.debugLine="r.Left = Min(r.Left, x)";
_r.setLeft((float) (__c.Min(_r.getLeft(),_x)));
RDebugUtils.currentLine=155975687;
 //BA.debugLineNum = 155975687;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=155975690;
 //BA.debugLineNum = 155975690;BA.debugLine="If x < width Then";
if (_x<_width) { 
RDebugUtils.currentLine=155975691;
 //BA.debugLineNum = 155975691;BA.debugLine="If r.Top = -1 Then";
if (_r.getTop()==-1) { 
RDebugUtils.currentLine=155975692;
 //BA.debugLineNum = 155975692;BA.debugLine="r.Top = y";
_r.setTop((float) (_y));
 }else {
RDebugUtils.currentLine=155975694;
 //BA.debugLineNum = 155975694;BA.debugLine="r.Bottom = y + 1";
_r.setBottom((float) (_y+1));
 };
RDebugUtils.currentLine=155975696;
 //BA.debugLineNum = 155975696;BA.debugLine="For x = width - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_x = (int) (_width-1) ;
for (;_x >= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=155975697;
 //BA.debugLineNum = 155975697;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=155975698;
 //BA.debugLineNum = 155975698;BA.debugLine="r.Right = Max(r.Right, x + 1)";
_r.setRight((float) (__c.Max(_r.getRight(),_x+1)));
RDebugUtils.currentLine=155975699;
 //BA.debugLineNum = 155975699;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=155975704;
 //BA.debugLineNum = 155975704;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
_r.setBottom((float) (__c.Max(_r.getBottom(),_r.getTop()+1)));
RDebugUtils.currentLine=155975705;
 //BA.debugLineNum = 155975705;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=155975706;
 //BA.debugLineNum = 155975706;BA.debugLine="End Sub";
return null;
}
public String  _recoloredgesofconnectedcharacters(b4j.docU.bctextengine __ref,String _c,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "recoloredgesofconnectedcharacters", true))
	 {return ((String) Debug.delegate(ba, "recoloredgesofconnectedcharacters", new Object[] {_c,_r2}));}
boolean _first = false;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=155713536;
 //BA.debugLineNum = 155713536;BA.debugLine="Private Sub RecolorEdgesOfConnectedCharacters(c As";
RDebugUtils.currentLine=155713537;
 //BA.debugLineNum = 155713537;BA.debugLine="If ArabicCharsConnectedPrev.Contains(c) Then";
if (__ref._arabiccharsconnectedprev /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_c))) { 
RDebugUtils.currentLine=155713538;
 //BA.debugLineNum = 155713538;BA.debugLine="Dim First As Boolean = True";
_first = __c.True;
RDebugUtils.currentLine=155713539;
 //BA.debugLineNum = 155713539;BA.debugLine="For y = r2.Top To r2.Bottom - 1";
{
final int step3 = 1;
final int limit3 = (int) (_r2.getBottom()-1);
_y = (int) (_r2.getTop()) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=155713540;
 //BA.debugLineNum = 155713540;BA.debugLine="For x = r2.Right - 1 To Max(r2.Left, r2.Right -";
{
final int step4 = -1;
final int limit4 = (int) (__c.Max(_r2.getLeft(),_r2.getRight()-5));
_x = (int) (_r2.getRight()-1) ;
for (;_x >= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=155713541;
 //BA.debugLineNum = 155713541;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4j.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=155713542;
 //BA.debugLineNum = 155713542;BA.debugLine="If First Then";
if (_first) { 
RDebugUtils.currentLine=155713543;
 //BA.debugLineNum = 155713543;BA.debugLine="First = False";
_first = __c.False;
 }else {
RDebugUtils.currentLine=155713545;
 //BA.debugLineNum = 155713545;BA.debugLine="CharBC.SetPremultipliedColor(x, y, PMDefault";
__ref._charbc /*b4j.example.bitmapcreator*/ ._setpremultipliedcolor(_x,_y,__ref._pmdefaultcolor /*b4j.example.bitmapcreator._premultipliedcolor*/ );
 };
RDebugUtils.currentLine=155713547;
 //BA.debugLineNum = 155713547;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=155713552;
 //BA.debugLineNum = 155713552;BA.debugLine="End Sub";
return "";
}
public boolean  _mightbeanemoji(b4j.docU.bctextengine __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mightbeanemoji", true))
	 {return ((Boolean) Debug.delegate(ba, "mightbeanemoji", new Object[] {_c}));}
int _cp = 0;
RDebugUtils.currentLine=155844608;
 //BA.debugLineNum = 155844608;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
RDebugUtils.currentLine=155844609;
 //BA.debugLineNum = 155844609;BA.debugLine="Dim cp As Int = Asc(c)";
_cp = __c.Asc(BA.ObjectToChar(_c));
RDebugUtils.currentLine=155844610;
 //BA.debugLineNum = 155844610;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
if (true) return _cp>=((int)0x231a) || _c.length()>1;
RDebugUtils.currentLine=155844611;
 //BA.debugLineNum = 155844611;BA.debugLine="End Sub";
return false;
}
public String  _loaddata(b4j.docU.bctextengine __ref,b4j.docU.b4xset _set,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loaddata", true))
	 {return ((String) Debug.delegate(ba, "loaddata", new Object[] {_set,_filename}));}
String _line = "";
int _i = 0;
int _a = 0;
RDebugUtils.currentLine=156958720;
 //BA.debugLineNum = 156958720;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
RDebugUtils.currentLine=156958721;
 //BA.debugLineNum = 156958721;BA.debugLine="Set.Initialize";
_set._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=156958722;
 //BA.debugLineNum = 156958722;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(__c.File.getDirAssets(),_filename);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=156958723;
 //BA.debugLineNum = 156958723;BA.debugLine="line = line.Trim";
_line = _line.trim();
RDebugUtils.currentLine=156958724;
 //BA.debugLineNum = 156958724;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
_i = _line.indexOf(".");
RDebugUtils.currentLine=156958725;
 //BA.debugLineNum = 156958725;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=156958726;
 //BA.debugLineNum = 156958726;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
_set._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_line,(int) (16))));
 }else {
RDebugUtils.currentLine=156958728;
 //BA.debugLineNum = 156958728;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
{
final int step8 = 1;
final int limit8 = __c.Bit.ParseInt(_line.substring((int) (_i+2)),(int) (16));
_a = __c.Bit.ParseInt(_line.substring((int) (0),_i),(int) (16)) ;
for (;_a <= limit8 ;_a = _a + step8 ) {
RDebugUtils.currentLine=156958729;
 //BA.debugLineNum = 156958729;BA.debugLine="Set.Add(a)";
_set._add /*String*/ (null,(Object)(_a));
 }
};
 };
 }
};
RDebugUtils.currentLine=156958733;
 //BA.debugLineNum = 156958733;BA.debugLine="End Sub";
return "";
}
public String  _createline(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createline", true))
	 {return ((String) Debug.delegate(ba, "createline", new Object[] {_p}));}
b4j.docU.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=154009600;
 //BA.debugLineNum = 154009600;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
RDebugUtils.currentLine=154009601;
 //BA.debugLineNum = 154009601;BA.debugLine="Dim line As BCTextLine";
_line = new b4j.docU.bctextengine._bctextline();
RDebugUtils.currentLine=154009602;
 //BA.debugLineNum = 154009602;BA.debugLine="line.Initialize";
_line.Initialize();
RDebugUtils.currentLine=154009603;
 //BA.debugLineNum = 154009603;BA.debugLine="line.Unbreakables.Initialize";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=154009604;
 //BA.debugLineNum = 154009604;BA.debugLine="line.ParentParagraph = p";
_line.ParentParagraph /*b4j.docU.bctextengine._bcparagraph*/  = _p;
RDebugUtils.currentLine=154009605;
 //BA.debugLineNum = 154009605;BA.debugLine="p.TextLines.Add(line)";
_p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
RDebugUtils.currentLine=154009606;
 //BA.debugLineNum = 154009606;BA.debugLine="p.CurrentLine = line";
_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/  = _line;
RDebugUtils.currentLine=154009608;
 //BA.debugLineNum = 154009608;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bcsinglestylesection  _createsinglesection(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextrun _run,b4j.docU.bctextengine._bctextchars _textchars,b4j.docU.bctextengine._bcfontmetrics _fontmetrics) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createsinglesection", true))
	 {return ((b4j.docU.bctextengine._bcsinglestylesection) Debug.delegate(ba, "createsinglesection", new Object[] {_run,_textchars,_fontmetrics}));}
b4j.docU.bctextengine._bcsinglestylesection _single = null;
String _prevchar = "";
b4j.docU.bctextengine._bcglyphandoffset _prevgo = null;
int _i = 0;
String _s = "";
b4j.docU.bctextengine._bcglyphandoffset _go = null;
b4j.docU.bctextengine._bcglyph _g = null;
b4j.docU.bctextengine._bcstyledunderline _u = null;
RDebugUtils.currentLine=154533888;
 //BA.debugLineNum = 154533888;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
RDebugUtils.currentLine=154533889;
 //BA.debugLineNum = 154533889;BA.debugLine="Dim single As BCSingleStyleSection";
_single = new b4j.docU.bctextengine._bcsinglestylesection();
RDebugUtils.currentLine=154533890;
 //BA.debugLineNum = 154533890;BA.debugLine="single.Initialize";
_single.Initialize();
RDebugUtils.currentLine=154533891;
 //BA.debugLineNum = 154533891;BA.debugLine="single.GlyphsAndOffsets.Initialize";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=154533892;
 //BA.debugLineNum = 154533892;BA.debugLine="single.Run = Run";
_single.Run /*b4j.docU.bctextengine._bctextrun*/  = _run;
RDebugUtils.currentLine=154533893;
 //BA.debugLineNum = 154533893;BA.debugLine="single.fm = FontMetrics";
_single.fm /*b4j.docU.bctextengine._bcfontmetrics*/  = _fontmetrics;
RDebugUtils.currentLine=154533894;
 //BA.debugLineNum = 154533894;BA.debugLine="Dim PrevChar As String";
_prevchar = "";
RDebugUtils.currentLine=154533895;
 //BA.debugLineNum = 154533895;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
_prevgo = new b4j.docU.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=154533896;
 //BA.debugLineNum = 154533896;BA.debugLine="For i = 0 To TextChars.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_textchars.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=154533897;
 //BA.debugLineNum = 154533897;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
_s = _textchars.Buffer /*String[]*/ [(int) (_i+_textchars.StartIndex /*int*/ )];
RDebugUtils.currentLine=154533898;
 //BA.debugLineNum = 154533898;BA.debugLine="Dim go As BCGlyphAndOffset";
_go = new b4j.docU.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=154533899;
 //BA.debugLineNum = 154533899;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
_g = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,_s,_fontmetrics,__c.False);
RDebugUtils.currentLine=154533900;
 //BA.debugLineNum = 154533900;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=154533901;
 //BA.debugLineNum = 154533901;BA.debugLine="If KerningEnabled Then";
if (__ref._kerningenabled /*boolean*/ ) { 
RDebugUtils.currentLine=154533902;
 //BA.debugLineNum = 154533902;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
_prevgo.SpaceBetweenThisAndNext /*int*/  = __ref._getkernspacebetweenchars /*int*/ (null,_fontmetrics,_prevchar,_s,_prevgo.Glyph /*b4j.docU.bctextengine._bcglyph*/ ,_g);
 }else {
RDebugUtils.currentLine=154533904;
 //BA.debugLineNum = 154533904;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
_prevgo.SpaceBetweenThisAndNext /*int*/  = (int) (__ref._mspacebetweencharacters /*float*/ );
 };
 };
RDebugUtils.currentLine=154533907;
 //BA.debugLineNum = 154533907;BA.debugLine="go.Glyph = g";
_go.Glyph /*b4j.docU.bctextengine._bcglyph*/  = _g;
RDebugUtils.currentLine=154533908;
 //BA.debugLineNum = 154533908;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_go));
RDebugUtils.currentLine=154533909;
 //BA.debugLineNum = 154533909;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=154533910;
 //BA.debugLineNum = 154533910;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
_single.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_g.baseline /*int*/ -_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=154533911;
 //BA.debugLineNum = 154533911;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mHeight-_g.baseline /*int*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=154533913;
 //BA.debugLineNum = 154533913;BA.debugLine="single.Width = single.Width + g.Width";
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_g.Width /*int*/ );
RDebugUtils.currentLine=154533914;
 //BA.debugLineNum = 154533914;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=154533915;
 //BA.debugLineNum = 154533915;BA.debugLine="If Run.Underline Or Run.AutoUnderline Then";
if (_run.Underline /*boolean*/  || _run.AutoUnderline /*boolean*/ ) { 
RDebugUtils.currentLine=154533916;
 //BA.debugLineNum = 154533916;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ (null,_run);
RDebugUtils.currentLine=154533917;
 //BA.debugLineNum = 154533917;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max((_u.Thickness /*float*/ +2)*__ref._mscale /*float*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ,_single.MaxHeightBelowBaseLine /*int*/ ));
 };
RDebugUtils.currentLine=154533919;
 //BA.debugLineNum = 154533919;BA.debugLine="PrevGO = go";
_prevgo = _go;
RDebugUtils.currentLine=154533920;
 //BA.debugLineNum = 154533920;BA.debugLine="PrevChar = s";
_prevchar = _s;
 }
};
RDebugUtils.currentLine=154533922;
 //BA.debugLineNum = 154533922;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=154533923;
 //BA.debugLineNum = 154533923;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
if (_textchars.Length /*int*/ ==0 && _run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=154533924;
 //BA.debugLineNum = 154533924;BA.debugLine="Run.View.Left = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(0);
RDebugUtils.currentLine=154533925;
 //BA.debugLineNum = 154533925;BA.debugLine="Run.View.Top = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(0);
RDebugUtils.currentLine=154533926;
 //BA.debugLineNum = 154533926;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
_single.Width /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*__ref._mscale /*float*/ +__ref._mspacebetweencharacters /*float*/ *2);
RDebugUtils.currentLine=154533927;
 //BA.debugLineNum = 154533927;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
_single.MaxHeightAboveBaseLine /*int*/  = (int) ((_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_run.VerticalOffset /*int*/ )*__ref._mscale /*float*/ );
RDebugUtils.currentLine=154533928;
 //BA.debugLineNum = 154533928;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mscale /*float*/ -_single.MaxHeightAboveBaseLine /*int*/ );
 };
RDebugUtils.currentLine=154533931;
 //BA.debugLineNum = 154533931;BA.debugLine="Return single";
if (true) return _single;
RDebugUtils.currentLine=154533932;
 //BA.debugLineNum = 154533932;BA.debugLine="End Sub";
return null;
}
public int  _getkernspacebetweenchars(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcfontmetrics _fm,String _prevchar,String _thischar,b4j.docU.bctextengine._bcglyph _prevglyph,b4j.docU.bctextengine._bcglyph _thisglyph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getkernspacebetweenchars", true))
	 {return ((Integer) Debug.delegate(ba, "getkernspacebetweenchars", new Object[] {_fm,_prevchar,_thischar,_prevglyph,_thisglyph}));}
String _together = "";
int _space = 0;
int _res = 0;
int _w = 0;
RDebugUtils.currentLine=154599424;
 //BA.debugLineNum = 154599424;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
RDebugUtils.currentLine=154599425;
 //BA.debugLineNum = 154599425;BA.debugLine="Dim together As String = PrevChar & ThisChar";
_together = _prevchar+_thischar;
RDebugUtils.currentLine=154599426;
 //BA.debugLineNum = 154599426;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
_space = (int)(BA.ObjectToNumber(_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_together),(Object)(-1000))));
RDebugUtils.currentLine=154599427;
 //BA.debugLineNum = 154599427;BA.debugLine="If Space > -1000 Then Return Space";
if (_space>-1000) { 
if (true) return _space;};
RDebugUtils.currentLine=154599428;
 //BA.debugLineNum = 154599428;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=154599429;
 //BA.debugLineNum = 154599429;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
if (_thisglyph.Empty /*boolean*/  || _prevglyph.Empty /*boolean*/ ) { 
RDebugUtils.currentLine=154599430;
 //BA.debugLineNum = 154599430;BA.debugLine="res = mSpaceBetweenCharacters";
_res = (int) (__ref._mspacebetweencharacters /*float*/ );
 }else {
RDebugUtils.currentLine=154599432;
 //BA.debugLineNum = 154599432;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
_w = __ref._createglyph /*b4j.docU.bctextengine._bcglyph*/ (null,_together,_fm,__c.True).Width /*int*/ ;
RDebugUtils.currentLine=154599433;
 //BA.debugLineNum = 154599433;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
_res = (int) (_w-_prevglyph.Width /*int*/ -_thisglyph.Width /*int*/ );
 };
RDebugUtils.currentLine=154599435;
 //BA.debugLineNum = 154599435;BA.debugLine="fm.KerningTable.Put(together, res)";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_together),(Object)(_res));
RDebugUtils.currentLine=154599436;
 //BA.debugLineNum = 154599436;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=154599437;
 //BA.debugLineNum = 154599437;BA.debugLine="End Sub";
return 0;
}
public b4j.docU.bctextengine._bcstyledunderline  _getunderlinestyle(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getunderlinestyle", true))
	 {return ((b4j.docU.bctextengine._bcstyledunderline) Debug.delegate(ba, "getunderlinestyle", new Object[] {_run}));}
RDebugUtils.currentLine=155254784;
 //BA.debugLineNum = 155254784;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
RDebugUtils.currentLine=155254785;
 //BA.debugLineNum = 155254785;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __ref._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ ;};
RDebugUtils.currentLine=155254786;
 //BA.debugLineNum = 155254786;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
if (true) return (b4j.docU.bctextengine._bcstyledunderline)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._extra_styledunderline /*String*/ ),(Object)(__ref._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ )));
RDebugUtils.currentLine=155254787;
 //BA.debugLineNum = 155254787;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bcunbreakabletext  _createunbreakable(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextrun _run,b4j.docU.bctextengine._bctextchars _textchars,b4j.docU.bctextengine._bcfontmetrics _fontmetrics,boolean _isseparator,b4j.docU.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createunbreakable", true))
	 {return ((b4j.docU.bctextengine._bcunbreakabletext) Debug.delegate(ba, "createunbreakable", new Object[] {_run,_textchars,_fontmetrics,_isseparator,_style}));}
b4j.docU.bctextengine._bcunbreakabletext _unbreakable = null;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=154206208;
 //BA.debugLineNum = 154206208;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
RDebugUtils.currentLine=154206209;
 //BA.debugLineNum = 154206209;BA.debugLine="Dim unbreakable As BCUnbreakableText";
_unbreakable = new b4j.docU.bctextengine._bcunbreakabletext();
RDebugUtils.currentLine=154206210;
 //BA.debugLineNum = 154206210;BA.debugLine="unbreakable.Initialize";
_unbreakable.Initialize();
RDebugUtils.currentLine=154206211;
 //BA.debugLineNum = 154206211;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=154206212;
 //BA.debugLineNum = 154206212;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
_unbreakable.IsMergable /*boolean*/  = __c.Not(_isseparator) && __c.Not(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized());
RDebugUtils.currentLine=154206213;
 //BA.debugLineNum = 154206213;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
_single = __ref._createsinglesection /*b4j.docU.bctextengine._bcsinglestylesection*/ (null,_run,_textchars,_fontmetrics);
RDebugUtils.currentLine=154206214;
 //BA.debugLineNum = 154206214;BA.debugLine="single.ParentUN = unbreakable";
_single.ParentUN /*b4j.docU.bctextengine._bcunbreakabletext*/  = _unbreakable;
RDebugUtils.currentLine=154206215;
 //BA.debugLineNum = 154206215;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_single));
RDebugUtils.currentLine=154206216;
 //BA.debugLineNum = 154206216;BA.debugLine="unbreakable.Width = single.Width";
_unbreakable.Width /*int*/  = _single.Width /*int*/ ;
RDebugUtils.currentLine=154206217;
 //BA.debugLineNum = 154206217;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
_unbreakable.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/  = _textchars;
RDebugUtils.currentLine=154206218;
 //BA.debugLineNum = 154206218;BA.debugLine="If style.RTL Then";
if (_style.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=154206219;
 //BA.debugLineNum = 154206219;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
_unbreakable.RTL /*boolean*/  = _run.TextDirection /*int*/ ==__ref._textdirectionrtl /*int*/  || (_run.TextDirection /*int*/ ==__ref._textdirectionunknown /*int*/  && __ref._detectrtl /*boolean*/ (null,_unbreakable)==__c.True);
 };
RDebugUtils.currentLine=154206221;
 //BA.debugLineNum = 154206221;BA.debugLine="unbreakable.Anchor = GetRunAnchorIfCurrentNotSet(";
_unbreakable.Anchor /*String*/  = __ref._getrunanchorifcurrentnotset /*String*/ (null,_run,"");
RDebugUtils.currentLine=154206222;
 //BA.debugLineNum = 154206222;BA.debugLine="Return unbreakable";
if (true) return _unbreakable;
RDebugUtils.currentLine=154206223;
 //BA.debugLineNum = 154206223;BA.debugLine="End Sub";
return null;
}
public boolean  _detectrtl(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "detectrtl", true))
	 {return ((Boolean) Debug.delegate(ba, "detectrtl", new Object[] {_un}));}
String _firstchar = "";
int _cp = 0;
RDebugUtils.currentLine=154271744;
 //BA.debugLineNum = 154271744;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
RDebugUtils.currentLine=154271745;
 //BA.debugLineNum = 154271745;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
if (_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
RDebugUtils.currentLine=154271746;
 //BA.debugLineNum = 154271746;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=154271748;
 //BA.debugLineNum = 154271748;BA.debugLine="If RTLChars.IsInitialized = False Then";
if (__ref._rtlchars /*b4j.docU.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=154271749;
 //BA.debugLineNum = 154271749;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
__ref._loaddata /*String*/ (null,__ref._rtlchars /*b4j.docU.b4xset*/ ,"rtl-data.txt");
 };
RDebugUtils.currentLine=154271751;
 //BA.debugLineNum = 154271751;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
_firstchar = _un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .StartIndex /*int*/ ];
RDebugUtils.currentLine=154271752;
 //BA.debugLineNum = 154271752;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
_cp = __ref._bytestoint /*int*/ (null,_firstchar.getBytes(__ref._charset /*String*/ ),(int) (0));
RDebugUtils.currentLine=154271753;
 //BA.debugLineNum = 154271753;BA.debugLine="Return RTLChars.Contains(cp)";
if (true) return __ref._rtlchars /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp));
RDebugUtils.currentLine=154271754;
 //BA.debugLineNum = 154271754;BA.debugLine="End Sub";
return false;
}
public String  _getrunanchorifcurrentnotset(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextrun _textrun,String _current) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getrunanchorifcurrentnotset", true))
	 {return ((String) Debug.delegate(ba, "getrunanchorifcurrentnotset", new Object[] {_textrun,_current}));}
RDebugUtils.currentLine=154468352;
 //BA.debugLineNum = 154468352;BA.debugLine="Private Sub GetRunAnchorIfCurrentNotSet(TextRun As";
RDebugUtils.currentLine=154468353;
 //BA.debugLineNum = 154468353;BA.debugLine="If Current <> \"\" Then Return Current";
if ((_current).equals("") == false) { 
if (true) return _current;};
RDebugUtils.currentLine=154468354;
 //BA.debugLineNum = 154468354;BA.debugLine="If TextRun.Extra.IsInitialized = False Then Retur";
if (_textrun.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=154468355;
 //BA.debugLineNum = 154468355;BA.debugLine="Return TextRun.Extra.GetDefault(\"a\", \"\")";
if (true) return BA.ObjectToString(_textrun.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("a"),(Object)("")));
RDebugUtils.currentLine=154468356;
 //BA.debugLineNum = 154468356;BA.debugLine="End Sub";
return "";
}
public String  _drawline(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextline _line,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawline", true))
	 {return ((String) Debug.delegate(ba, "drawline", new Object[] {_line,_offsety}));}
b4j.docU.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=155058176;
 //BA.debugLineNum = 155058176;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
RDebugUtils.currentLine=155058177;
 //BA.debugLineNum = 155058177;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
{
final anywheresoftware.b4a.BA.IterableList group1 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group1.Get(index1));
RDebugUtils.currentLine=155058178;
 //BA.debugLineNum = 155058178;BA.debugLine="DrawUnbreakable(un, OffsetY)";
__ref._drawunbreakable /*String*/ (null,_un,_offsety);
 }
};
RDebugUtils.currentLine=155058180;
 //BA.debugLineNum = 155058180;BA.debugLine="End Sub";
return "";
}
public String  _drawunbreakable(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcunbreakabletext _un,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawunbreakable", true))
	 {return ((String) Debug.delegate(ba, "drawunbreakable", new Object[] {_un,_offsety}));}
b4j.docU.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=155123712;
 //BA.debugLineNum = 155123712;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
RDebugUtils.currentLine=155123713;
 //BA.debugLineNum = 155123713;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
{
final anywheresoftware.b4a.BA.IterableList group1 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (b4j.docU.bctextengine._bcsinglestylesection)(group1.Get(index1));
RDebugUtils.currentLine=155123714;
 //BA.debugLineNum = 155123714;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
__ref._drawsinglestylesection /*String*/ (null,_single,_offsety);
 }
};
RDebugUtils.currentLine=155123716;
 //BA.debugLineNum = 155123716;BA.debugLine="End Sub";
return "";
}
public String  _drawparagraph(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _paragraph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawparagraph", true))
	 {return ((String) Debug.delegate(ba, "drawparagraph", new Object[] {_paragraph}));}
b4j.docU.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=154664960;
 //BA.debugLineNum = 154664960;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
RDebugUtils.currentLine=154664961;
 //BA.debugLineNum = 154664961;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4j.docU.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=154664962;
 //BA.debugLineNum = 154664962;BA.debugLine="DrawLine(line, line.BaselineY)";
__ref._drawline /*String*/ (null,_line,_line.BaselineY /*int*/ );
 }
};
RDebugUtils.currentLine=154664964;
 //BA.debugLineNum = 154664964;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _drawsinglelineshared(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,b4j.docU.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineshared", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "drawsinglelineshared", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=154796032;
 //BA.debugLineNum = 154796032;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
RDebugUtils.currentLine=154796033;
 //BA.debugLineNum = 154796033;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=154796034;
 //BA.debugLineNum = 154796034;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
_r.Initialize((float) (0),(float) (0),(float) (__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mwidth),(float) (_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
RDebugUtils.currentLine=154796035;
 //BA.debugLineNum = 154796035;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
_iv.SetLayoutAnimated((int) (0),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+(_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ )/(double)__ref._mscale /*float*/ ,_r.getWidth()/(double)__ref._mscale /*float*/ ,_r.getHeight()/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=154796037;
 //BA.debugLineNum = 154796037;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=154796038;
 //BA.debugLineNum = 154796038;BA.debugLine="End Sub";
return null;
}
public b4j.example.bcpath._bcbrush  _getbrush(b4j.docU.bctextengine __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getbrush", true))
	 {return ((b4j.example.bcpath._bcbrush) Debug.delegate(ba, "getbrush", new Object[] {_clr}));}
b4j.example.bcpath._bcbrush _b = null;
RDebugUtils.currentLine=155516928;
 //BA.debugLineNum = 155516928;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
RDebugUtils.currentLine=155516929;
 //BA.debugLineNum = 155516929;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
if (__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
if (true) return (b4j.example.bcpath._bcbrush)(__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)));};
RDebugUtils.currentLine=155516930;
 //BA.debugLineNum = 155516930;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
_b = __ref._foregroundbc /*b4j.example.bitmapcreator*/ ._createbrushfromcolor(_clr);
RDebugUtils.currentLine=155516931;
 //BA.debugLineNum = 155516931;BA.debugLine="Brushes.Put(clr, b)";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_clr),(Object)(_b));
RDebugUtils.currentLine=155516932;
 //BA.debugLineNum = 155516932;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=155516933;
 //BA.debugLineNum = 155516933;BA.debugLine="End Sub";
return null;
}
public b4j.example.bitmapcreator  _findasyncbc(b4j.docU.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findasyncbc", true))
	 {return ((b4j.example.bitmapcreator) Debug.delegate(ba, "findasyncbc", new Object[] {_width,_height}));}
b4j.example.bitmapcreator _bc = null;
boolean _used = false;
int _i = 0;
boolean _b = false;
RDebugUtils.currentLine=154927104;
 //BA.debugLineNum = 154927104;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
RDebugUtils.currentLine=154927105;
 //BA.debugLineNum = 154927105;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (b4j.example.bitmapcreator)(group1.Get(index1));
RDebugUtils.currentLine=154927106;
 //BA.debugLineNum = 154927106;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
if (_bc._mwidth==_width && _bc._mheight==_height) { 
RDebugUtils.currentLine=154927107;
 //BA.debugLineNum = 154927107;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
_used = BA.ObjectToBoolean(__ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_bc)));
RDebugUtils.currentLine=154927108;
 //BA.debugLineNum = 154927108;BA.debugLine="If Used = False Then";
if (_used==__c.False) { 
RDebugUtils.currentLine=154927109;
 //BA.debugLineNum = 154927109;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=154927110;
 //BA.debugLineNum = 154927110;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
 }
};
RDebugUtils.currentLine=154927114;
 //BA.debugLineNum = 154927114;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=154927115;
 //BA.debugLineNum = 154927115;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
RDebugUtils.currentLine=154927116;
 //BA.debugLineNum = 154927116;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=154927117;
 //BA.debugLineNum = 154927117;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=154927118;
 //BA.debugLineNum = 154927118;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
{
final anywheresoftware.b4a.BA.IterableList group14 = __ref._asyncbcs /*b4j.docU.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.Get(index14));
RDebugUtils.currentLine=154927119;
 //BA.debugLineNum = 154927119;BA.debugLine="If b Then i = i + 1";
if (_b) { 
_i = (int) (_i+1);};
 }
};
RDebugUtils.currentLine=154927121;
 //BA.debugLineNum = 154927121;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=154927122;
 //BA.debugLineNum = 154927122;BA.debugLine="End Sub";
return null;
}
public String  _drawsinglestylesection(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcsinglestylesection _single,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglestylesection", true))
	 {return ((String) Debug.delegate(ba, "drawsinglestylesection", new Object[] {_single,_offsety}));}
int _offsetx = 0;
boolean _rtl = false;
b4j.docU.bctextengine._bcglyphandoffset _go = null;
b4j.docU.bctextengine._bcglyph _g = null;
int _x = 0;
b4j.example.bitmapcreator._drawtask _dt = null;
b4j.docU.bctextengine._bcstyledunderline _u = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=155189248;
 //BA.debugLineNum = 155189248;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
RDebugUtils.currentLine=155189249;
 //BA.debugLineNum = 155189249;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
_offsetx = _single.AbsoluteStartX /*int*/ ;
RDebugUtils.currentLine=155189250;
 //BA.debugLineNum = 155189250;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
_rtl = _single.ParentUN /*b4j.docU.bctextengine._bcunbreakabletext*/ .RTL /*boolean*/ ;
RDebugUtils.currentLine=155189251;
 //BA.debugLineNum = 155189251;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
if (_rtl) { 
_offsetx = (int) (_single.AbsoluteStartX /*int*/ +_single.Width /*int*/ );};
RDebugUtils.currentLine=155189252;
 //BA.debugLineNum = 155189252;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
{
final anywheresoftware.b4a.BA.IterableList group4 = _single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (b4j.docU.bctextengine._bcglyphandoffset)(group4.Get(index4));
RDebugUtils.currentLine=155189253;
 //BA.debugLineNum = 155189253;BA.debugLine="Dim g As BCGlyph = go.Glyph";
_g = _go.Glyph /*b4j.docU.bctextengine._bcglyph*/ ;
RDebugUtils.currentLine=155189257;
 //BA.debugLineNum = 155189257;BA.debugLine="Dim x As Int = OffsetX";
_x = _offsetx;
RDebugUtils.currentLine=155189258;
 //BA.debugLineNum = 155189258;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
if (_rtl) { 
_x = (int) (_x-_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .mWidth);};
RDebugUtils.currentLine=155189259;
 //BA.debugLineNum = 155189259;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=155189260;
 //BA.debugLineNum = 155189260;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=155189261;
 //BA.debugLineNum = 155189261;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
_dt = __ref._asyncbc /*b4j.example.bitmapcreator*/ ._createdrawtask((Object)(_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ ),_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4j.docU.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ),__c.True);
RDebugUtils.currentLine=155189262;
 //BA.debugLineNum = 155189262;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=155189263;
 //BA.debugLineNum = 155189263;BA.debugLine="AsyncTasks.Add(dt)";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }else {
RDebugUtils.currentLine=155189265;
 //BA.debugLineNum = 155189265;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawcompressedbitmap(_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ ,_g.cbc /*b4j.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*b4j.docU.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
 };
RDebugUtils.currentLine=155189268;
 //BA.debugLineNum = 155189268;BA.debugLine="If single.Run.Underline Then";
if (_single.Run /*b4j.docU.bctextengine._bctextrun*/ .Underline /*boolean*/ ) { 
RDebugUtils.currentLine=155189269;
 //BA.debugLineNum = 155189269;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ (null,_single.Run /*b4j.docU.bctextengine._bctextrun*/ );
RDebugUtils.currentLine=155189270;
 //BA.debugLineNum = 155189270;BA.debugLine="Dim clr As Int = u.Clr";
_clr = _u.Clr /*int*/ ;
RDebugUtils.currentLine=155189271;
 //BA.debugLineNum = 155189271;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
if (_clr==0) { 
_clr = _single.Run /*b4j.docU.bctextengine._bctextrun*/ .TextColor /*int*/ ;};
RDebugUtils.currentLine=155189272;
 //BA.debugLineNum = 155189272;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=155189273;
 //BA.debugLineNum = 155189273;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
_r.Initialize((float) (_x),(float) (_single.Run /*b4j.docU.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ +_offsety+__ref._mscale /*float*/ ),(float) (_x+_g.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4j.docU.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ ),(float) (_offsety+__ref._mscale /*float*/ +_u.Thickness /*float*/ *__ref._mscale /*float*/ +_single.Run /*b4j.docU.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=155189275;
 //BA.debugLineNum = 155189275;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=155189276;
 //BA.debugLineNum = 155189276;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4j.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0))));
 }else {
RDebugUtils.currentLine=155189278;
 //BA.debugLineNum = 155189278;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0));
 };
 };
RDebugUtils.currentLine=155189281;
 //BA.debugLineNum = 155189281;BA.debugLine="If rtl Then";
if (_rtl) { 
RDebugUtils.currentLine=155189282;
 //BA.debugLineNum = 155189282;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
_offsetx = (int) (_offsetx-_g.Width /*int*/ -_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4j.docU.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 }else {
RDebugUtils.currentLine=155189284;
 //BA.debugLineNum = 155189284;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
_offsetx = (int) (_offsetx+_g.Width /*int*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*b4j.docU.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 };
 }
};
RDebugUtils.currentLine=155189287;
 //BA.debugLineNum = 155189287;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bcparagraph  _prepare(b4j.docU.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,b4j.docU.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((b4j.docU.bctextengine._bcparagraph) Debug.delegate(ba, "prepare", new Object[] {_runs,_style}));}
b4j.docU.bctextengine._bcparagraph _par = null;
anywheresoftware.b4a.objects.collections.List _unbreakeables = null;
b4j.docU.bctextengine._bctextrun _run = null;
RDebugUtils.currentLine=153288704;
 //BA.debugLineNum = 153288704;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
RDebugUtils.currentLine=153288705;
 //BA.debugLineNum = 153288705;BA.debugLine="Dim par As BCParagraph";
_par = new b4j.docU.bctextengine._bcparagraph();
RDebugUtils.currentLine=153288706;
 //BA.debugLineNum = 153288706;BA.debugLine="par.Initialize";
_par.Initialize();
RDebugUtils.currentLine=153288707;
 //BA.debugLineNum = 153288707;BA.debugLine="par.TextLines.Initialize";
_par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=153288708;
 //BA.debugLineNum = 153288708;BA.debugLine="par.Style = Style";
_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/  = _style;
RDebugUtils.currentLine=153288709;
 //BA.debugLineNum = 153288709;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
__ref._indentwidth /*int*/  = (int) (__ref._getfontmetrics /*b4j.docU.bctextengine._bcfontmetrics*/ (null,__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._defaultcolor /*int*/ ).xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
RDebugUtils.currentLine=153288710;
 //BA.debugLineNum = 153288710;BA.debugLine="Dim unbreakeables As List";
_unbreakeables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=153288711;
 //BA.debugLineNum = 153288711;BA.debugLine="unbreakeables.Initialize";
_unbreakeables.Initialize();
RDebugUtils.currentLine=153288712;
 //BA.debugLineNum = 153288712;BA.debugLine="For Each run As BCTextRun In Runs";
{
final anywheresoftware.b4a.BA.IterableList group8 = _runs;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (b4j.docU.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=153288713;
 //BA.debugLineNum = 153288713;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._extra_connectedruns /*String*/ ))) { 
RDebugUtils.currentLine=153288714;
 //BA.debugLineNum = 153288714;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
__ref._handleconnectedtextruns /*String*/ (null,_run,_unbreakeables,_style);
 }else {
RDebugUtils.currentLine=153288716;
 //BA.debugLineNum = 153288716;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
__ref._handletextrun /*String*/ (null,_run,_unbreakeables,_style);
 };
 }
};
RDebugUtils.currentLine=153288719;
 //BA.debugLineNum = 153288719;BA.debugLine="CreateLine(par)";
__ref._createline /*String*/ (null,_par);
RDebugUtils.currentLine=153288720;
 //BA.debugLineNum = 153288720;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
__ref._organizeunbreakables /*String*/ (null,_par,_unbreakeables);
RDebugUtils.currentLine=153288721;
 //BA.debugLineNum = 153288721;BA.debugLine="OrganizeLines(par)";
__ref._organizelines /*String*/ (null,_par);
RDebugUtils.currentLine=153288722;
 //BA.debugLineNum = 153288722;BA.debugLine="OrganizeSingleStyles(par)";
__ref._organizesinglestyles /*String*/ (null,_par);
RDebugUtils.currentLine=153288723;
 //BA.debugLineNum = 153288723;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
if (_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ) { 
__ref._organizertlparagraph /*String*/ (null,_par);};
RDebugUtils.currentLine=153288724;
 //BA.debugLineNum = 153288724;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=153288725;
 //BA.debugLineNum = 153288725;BA.debugLine="End Sub";
return null;
}
public String  _resizelayers(b4j.docU.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizelayers", true))
	 {return ((String) Debug.delegate(ba, "resizelayers", new Object[] {_width,_height}));}
RDebugUtils.currentLine=153026560;
 //BA.debugLineNum = 153026560;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
RDebugUtils.currentLine=153026561;
 //BA.debugLineNum = 153026561;BA.debugLine="Width = Max(Width, 2) * mScale";
_width = (int) (__c.Max(_width,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=153026562;
 //BA.debugLineNum = 153026562;BA.debugLine="Height = Max(Height, 2) * mScale";
_height = (int) (__c.Max(_height,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=153026563;
 //BA.debugLineNum = 153026563;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
if (__ref._foregroundbc /*b4j.example.bitmapcreator*/ .IsInitialized()==__c.False || _width>__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mwidth || _height>__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mheight) { 
RDebugUtils.currentLine=153026564;
 //BA.debugLineNum = 153026564;BA.debugLine="If ForegroundBC.IsInitialized Then";
if (__ref._foregroundbc /*b4j.example.bitmapcreator*/ .IsInitialized()) { 
RDebugUtils.currentLine=153026565;
 //BA.debugLineNum = 153026565;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
_width = (int) (__c.Max(_width,__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mwidth));
RDebugUtils.currentLine=153026566;
 //BA.debugLineNum = 153026566;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
_height = (int) (__c.Max(_height,__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._mheight));
 };
RDebugUtils.currentLine=153026571;
 //BA.debugLineNum = 153026571;BA.debugLine="Brushes.Clear";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=153026572;
 //BA.debugLineNum = 153026572;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._initialize(ba,_width,_height);
 }else {
RDebugUtils.currentLine=153026574;
 //BA.debugLineNum = 153026574;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._drawrect2(__ref._foregroundbc /*b4j.example.bitmapcreator*/ ._targetrect,__ref._getbrush /*b4j.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
 };
RDebugUtils.currentLine=153026576;
 //BA.debugLineNum = 153026576;BA.debugLine="End Sub";
return "";
}
public String  _resizeimageview(b4j.docU.bctextengine __ref,b4j.example.bitmapcreator _bc,b4j.docU.bctextengine._bcparagraph _par,anywheresoftware.b4a.objects.B4XViewWrapper _iv,boolean _resizeheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizeimageview", true))
	 {return ((String) Debug.delegate(ba, "resizeimageview", new Object[] {_bc,_par,_iv,_resizeheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _ivheight = 0;
RDebugUtils.currentLine=153550848;
 //BA.debugLineNum = 153550848;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
RDebugUtils.currentLine=153550849;
 //BA.debugLineNum = 153550849;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _bc._getbitmap();
RDebugUtils.currentLine=153550850;
 //BA.debugLineNum = 153550850;BA.debugLine="Dim ivHeight As Int = par.Height / mScale";
_ivheight = (int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=153550851;
 //BA.debugLineNum = 153550851;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
if (_resizeheight==__c.False) { 
_ivheight = (int) (__c.Min(_ivheight,_iv.getParent().getHeight()-_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()-_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));};
RDebugUtils.currentLine=153550852;
 //BA.debugLineNum = 153550852;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
_iv.SetLayoutAnimated((int) (0),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),_par.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop(),_par.Width /*int*/ /(double)__ref._mscale /*float*/ ,_ivheight);
RDebugUtils.currentLine=153550853;
 //BA.debugLineNum = 153550853;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
_bc._setbitmaptoimageview(_bmp.Crop((int) (0),(int) (0),(int) (_iv.getWidth()*__ref._mscale /*float*/ ),(int) (_iv.getHeight()*__ref._mscale /*float*/ )),_iv);
RDebugUtils.currentLine=153550854;
 //BA.debugLineNum = 153550854;BA.debugLine="End Sub";
return "";
}
public String  _fonttokey(b4j.docU.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "fonttokey", true))
	 {return ((String) Debug.delegate(ba, "fonttokey", new Object[] {_fnt,_clr}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=156041216;
 //BA.debugLineNum = 156041216;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
RDebugUtils.currentLine=156041218;
 //BA.debugLineNum = 156041218;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fnt.ToNativeFont().getObject()));
RDebugUtils.currentLine=156041219;
 //BA.debugLineNum = 156041219;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
if (true) return BA.NumberToString(_clr+(double)(BA.ObjectToNumber(_jo.RunMethod("hashCode",(Object[])(__c.Null))))+_fnt.getSize());
RDebugUtils.currentLine=156041225;
 //BA.debugLineNum = 156041225;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bcsinglestylesection  _getfirstsinglestyle(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextline _line) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfirstsinglestyle", true))
	 {return ((b4j.docU.bctextengine._bcsinglestylesection) Debug.delegate(ba, "getfirstsinglestyle", new Object[] {_line}));}
b4j.docU.bctextengine._bcunbreakabletext _firstun = null;
RDebugUtils.currentLine=153944064;
 //BA.debugLineNum = 153944064;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
RDebugUtils.currentLine=153944065;
 //BA.debugLineNum = 153944065;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
_firstun = (b4j.docU.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=153944066;
 //BA.debugLineNum = 153944066;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
if (true) return (b4j.docU.bctextengine._bcsinglestylesection)(_firstun.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=153944067;
 //BA.debugLineNum = 153944067;BA.debugLine="End Sub";
return null;
}
public int  _getmingapbetweenlines(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getmingapbetweenlines", true))
	 {return ((Integer) Debug.delegate(ba, "getmingapbetweenlines", null));}
RDebugUtils.currentLine=156434432;
 //BA.debugLineNum = 156434432;BA.debugLine="Public Sub getMinGapBetweenLines As Int";
RDebugUtils.currentLine=156434433;
 //BA.debugLineNum = 156434433;BA.debugLine="Return mMinGapBetweenLines";
if (true) return __ref._mmingapbetweenlines /*int*/ ;
RDebugUtils.currentLine=156434434;
 //BA.debugLineNum = 156434434;BA.debugLine="End Sub";
return 0;
}
public float  _getspacebetweencharacters(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweencharacters", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweencharacters", null));}
RDebugUtils.currentLine=156106752;
 //BA.debugLineNum = 156106752;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
RDebugUtils.currentLine=156106753;
 //BA.debugLineNum = 156106753;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
if (true) return (float) (__ref._mspacebetweencharacters /*float*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=156106754;
 //BA.debugLineNum = 156106754;BA.debugLine="End Sub";
return 0f;
}
public float  _getspacebetweenlines(b4j.docU.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweenlines", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweenlines", null));}
RDebugUtils.currentLine=156237824;
 //BA.debugLineNum = 156237824;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
RDebugUtils.currentLine=156237825;
 //BA.debugLineNum = 156237825;BA.debugLine="Return mSpaceBetweenLines / mScale";
if (true) return (float) (__ref._mspacebetweenlines /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=156237826;
 //BA.debugLineNum = 156237826;BA.debugLine="End Sub";
return 0f;
}
public String  _handleconnectedtextruns(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4j.docU.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handleconnectedtextruns", true))
	 {return ((String) Debug.delegate(ba, "handleconnectedtextruns", new Object[] {_run,_unbreakables,_style}));}
anywheresoftware.b4a.objects.collections.List _children = null;
b4j.docU.bctextengine._bcconnectedruns _cr = null;
b4j.docU.bctextengine._bctextrun _r = null;
int _width = 0;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
b4j.docU.bctextengine._bcfontmetrics _fm = null;
int _connectedwidth = 0;
b4j.docU.bctextengine._bcunbreakabletext _u = null;
int _i = 0;
int _leftoffset = 0;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=154075136;
 //BA.debugLineNum = 154075136;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
RDebugUtils.currentLine=154075137;
 //BA.debugLineNum = 154075137;BA.debugLine="Dim children As List";
_children = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=154075138;
 //BA.debugLineNum = 154075138;BA.debugLine="children.Initialize";
_children.Initialize();
RDebugUtils.currentLine=154075139;
 //BA.debugLineNum = 154075139;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
_cr = (b4j.docU.bctextengine._bcconnectedruns)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=154075140;
 //BA.debugLineNum = 154075140;BA.debugLine="For Each r As BCTextRun In cr.Runs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (b4j.docU.bctextengine._bctextrun)(group4.Get(index4));
RDebugUtils.currentLine=154075141;
 //BA.debugLineNum = 154075141;BA.debugLine="HandleTextRun(r, children, Style)";
__ref._handletextrun /*String*/ (null,_r,_children,_style);
 }
};
RDebugUtils.currentLine=154075143;
 //BA.debugLineNum = 154075143;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=154075144;
 //BA.debugLineNum = 154075144;BA.debugLine="For Each un As BCUnbreakableText In children";
{
final anywheresoftware.b4a.BA.IterableList group8 = _children;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group8.Get(index8));
RDebugUtils.currentLine=154075145;
 //BA.debugLineNum = 154075145;BA.debugLine="un.IsMergable = True";
_un.IsMergable /*boolean*/  = __c.True;
RDebugUtils.currentLine=154075146;
 //BA.debugLineNum = 154075146;BA.debugLine="width = width + un.Width";
_width = (int) (_width+_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=154075148;
 //BA.debugLineNum = 154075148;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*b4j.docU.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=154075149;
 //BA.debugLineNum = 154075149;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
_connectedwidth = (int) (_cr.ConnectedWidth /*int*/ *__ref._mscale /*float*/ );
RDebugUtils.currentLine=154075151;
 //BA.debugLineNum = 154075151;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
_u = (b4j.docU.bctextengine._bcunbreakabletext)(_children.Get((int) (0)));
RDebugUtils.currentLine=154075152;
 //BA.debugLineNum = 154075152;BA.debugLine="For i = 1 To children.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_children.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=154075153;
 //BA.debugLineNum = 154075153;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
__ref._mergeunbreakables /*String*/ (null,_u,(b4j.docU.bctextengine._bcunbreakabletext)(_children.Get(_i)));
 }
};
RDebugUtils.currentLine=154075155;
 //BA.debugLineNum = 154075155;BA.debugLine="If width < ConnectedWidth Then";
if (_width<_connectedwidth) { 
RDebugUtils.currentLine=154075156;
 //BA.debugLineNum = 154075156;BA.debugLine="Dim leftOffset As Int";
_leftoffset = 0;
RDebugUtils.currentLine=154075157;
 //BA.debugLineNum = 154075157;BA.debugLine="Select cr.Alignment.ToLowerCase";
switch (BA.switchObjectToInt(_cr.Alignment /*String*/ .toLowerCase(),"center","right")) {
case 0: {
RDebugUtils.currentLine=154075159;
 //BA.debugLineNum = 154075159;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
_leftoffset = (int) ((_connectedwidth-_u.Width /*int*/ )/(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=154075161;
 //BA.debugLineNum = 154075161;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
_leftoffset = (int) (_connectedwidth-_u.Width /*int*/ -__ref._mspacebetweencharacters /*float*/ );
 break; }
}
;
RDebugUtils.currentLine=154075163;
 //BA.debugLineNum = 154075163;BA.debugLine="u.Width = ConnectedWidth";
_u.Width /*int*/  = _connectedwidth;
RDebugUtils.currentLine=154075164;
 //BA.debugLineNum = 154075164;BA.debugLine="If leftOffset > 0 Then";
if (_leftoffset>0) { 
RDebugUtils.currentLine=154075165;
 //BA.debugLineNum = 154075165;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
_single = __ref._createsinglesection /*b4j.docU.bctextengine._bcsinglestylesection*/ (null,_run,__ref._emptytextchars /*b4j.docU.bctextengine._bctextchars*/ ,_fm);
RDebugUtils.currentLine=154075166;
 //BA.debugLineNum = 154075166;BA.debugLine="single.Width = leftOffset";
_single.Width /*int*/  = _leftoffset;
RDebugUtils.currentLine=154075167;
 //BA.debugLineNum = 154075167;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
_u.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_single));
 };
 };
RDebugUtils.currentLine=154075170;
 //BA.debugLineNum = 154075170;BA.debugLine="u.IsMergable = False";
_u.IsMergable /*boolean*/  = __c.False;
RDebugUtils.currentLine=154075171;
 //BA.debugLineNum = 154075171;BA.debugLine="Unbreakables.Add(u)";
_unbreakables.Add((Object)(_u));
RDebugUtils.currentLine=154075172;
 //BA.debugLineNum = 154075172;BA.debugLine="End Sub";
return "";
}
public String  _handletextrun(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,b4j.docU.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handletextrun", true))
	 {return ((String) Debug.delegate(ba, "handletextrun", new Object[] {_run,_unbreakables,_style}));}
b4j.docU.bctextengine._bcfontmetrics _fm = null;
int _i1 = 0;
int _i = 0;
String _c = "";
boolean _separatorgoestogetherwithtext = false;
int _offset = 0;
RDebugUtils.currentLine=154140672;
 //BA.debugLineNum = 154140672;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
RDebugUtils.currentLine=154140673;
 //BA.debugLineNum = 154140673;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*b4j.docU.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=154140674;
 //BA.debugLineNum = 154140674;BA.debugLine="Dim i1 As Int";
_i1 = 0;
RDebugUtils.currentLine=154140675;
 //BA.debugLineNum = 154140675;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ .Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=154140676;
 //BA.debugLineNum = 154140676;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
_c = _run.TextChars /*b4j.docU.bctextengine._bctextchars*/ .Buffer /*String[]*/ [(int) (_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ .StartIndex /*int*/ +_i)];
RDebugUtils.currentLine=154140677;
 //BA.debugLineNum = 154140677;BA.debugLine="If WordBoundaries.Contains(c) Then";
if (__ref._wordboundaries /*String*/ .contains(_c)) { 
RDebugUtils.currentLine=154140678;
 //BA.debugLineNum = 154140678;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
_separatorgoestogetherwithtext = false;
RDebugUtils.currentLine=154140679;
 //BA.debugLineNum = 154140679;BA.debugLine="If i >= i1 + 1 Then";
if (_i>=_i1+1) { 
RDebugUtils.currentLine=154140680;
 //BA.debugLineNum = 154140680;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=154140681;
 //BA.debugLineNum = 154140681;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
if (__ref._wordboundariesthatcanconnecttoprevword /*String*/ .indexOf(_c)>-1) { 
RDebugUtils.currentLine=154140682;
 //BA.debugLineNum = 154140682;BA.debugLine="offset = 1";
_offset = (int) (1);
RDebugUtils.currentLine=154140683;
 //BA.debugLineNum = 154140683;BA.debugLine="SeparatorGoesTogetherWithText = True";
_separatorgoestogetherwithtext = __c.True;
 };
RDebugUtils.currentLine=154140685;
 //BA.debugLineNum = 154140685;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4j.docU.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4j.docU.bctextengine._bctextchars*/ (null,_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ ,_i1,(int) (_i+_offset)),_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=154140687;
 //BA.debugLineNum = 154140687;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
if (_separatorgoestogetherwithtext==__c.False) { 
RDebugUtils.currentLine=154140688;
 //BA.debugLineNum = 154140688;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4j.docU.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4j.docU.bctextengine._bctextchars*/ (null,_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ ,_i,(int) (_i+1)),_fm,__c.True,_style)));
 }else {
RDebugUtils.currentLine=154140690;
 //BA.debugLineNum = 154140690;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4j.docU.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*b4j.docU.bctextengine._bctextchars*/ ,_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=154140692;
 //BA.debugLineNum = 154140692;BA.debugLine="i1 = i + 1";
_i1 = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=154140693;
 //BA.debugLineNum = 154140693;BA.debugLine="Else If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
RDebugUtils.currentLine=154140694;
 //BA.debugLineNum = 154140694;BA.debugLine="Continue";
if (true) continue;
 }}
;
 }
};
RDebugUtils.currentLine=154140697;
 //BA.debugLineNum = 154140697;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
if (_i1<_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ .Length /*int*/ ) { 
_unbreakables.Add((Object)(__ref._createunbreakable /*b4j.docU.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*b4j.docU.bctextengine._bctextchars*/ (null,_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ ,_i1,_run.TextChars /*b4j.docU.bctextengine._bctextchars*/ .Length /*int*/ ),_fm,__c.False,_style)));};
RDebugUtils.currentLine=154140698;
 //BA.debugLineNum = 154140698;BA.debugLine="If Run.View.IsInitialized Then";
if (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=154140699;
 //BA.debugLineNum = 154140699;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
_unbreakables.Add((Object)(__ref._createunbreakable /*b4j.docU.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*b4j.docU.bctextengine._bctextchars*/ ,_fm,__c.False,_style)));
 };
RDebugUtils.currentLine=154140701;
 //BA.debugLineNum = 154140701;BA.debugLine="End Sub";
return "";
}
public String  _mergeunbreakables(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcunbreakabletext _un1,b4j.docU.bctextengine._bcunbreakabletext _un2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mergeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "mergeunbreakables", new Object[] {_un1,_un2}));}
b4j.docU.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=154402816;
 //BA.debugLineNum = 154402816;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
RDebugUtils.currentLine=154402817;
 //BA.debugLineNum = 154402817;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
_un1.Width /*int*/  = (int) (_un1.Width /*int*/ +_un2.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=154402818;
 //BA.debugLineNum = 154402818;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
{
final anywheresoftware.b4a.BA.IterableList group2 = _un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (b4j.docU.bctextengine._bcsinglestylesection)(group2.Get(index2));
RDebugUtils.currentLine=154402819;
 //BA.debugLineNum = 154402819;BA.debugLine="single.ParentUN = un1";
_single.ParentUN /*b4j.docU.bctextengine._bcunbreakabletext*/  = _un1;
RDebugUtils.currentLine=154402820;
 //BA.debugLineNum = 154402820;BA.debugLine="un1.Anchor = GetRunAnchorIfCurrentNotSet(single.";
_un1.Anchor /*String*/  = __ref._getrunanchorifcurrentnotset /*String*/ (null,_single.Run /*b4j.docU.bctextengine._bctextrun*/ ,_un1.Anchor /*String*/ );
 }
};
RDebugUtils.currentLine=154402822;
 //BA.debugLineNum = 154402822;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
_un1.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=154402823;
 //BA.debugLineNum = 154402823;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
if (_un1.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
_un1.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/  = _un2.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ ;};
RDebugUtils.currentLine=154402824;
 //BA.debugLineNum = 154402824;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bctextchars  _textcharssubstring(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextchars _tc,int _startindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharssubstring", true))
	 {return ((b4j.docU.bctextengine._bctextchars) Debug.delegate(ba, "textcharssubstring", new Object[] {_tc,_startindex,_endindex}));}
RDebugUtils.currentLine=156631040;
 //BA.debugLineNum = 156631040;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
RDebugUtils.currentLine=156631041;
 //BA.debugLineNum = 156631041;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
if (true) return __ref._createbctextchars /*b4j.docU.bctextengine._bctextchars*/ (null,_tc.Buffer /*String[]*/ ,(int) (_startindex+_tc.StartIndex /*int*/ ),(int) (_endindex-_startindex));
RDebugUtils.currentLine=156631042;
 //BA.debugLineNum = 156631042;BA.debugLine="End Sub";
return null;
}
public String  _setspacebetweencharacters(b4j.docU.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweencharacters", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweencharacters", new Object[] {_f}));}
RDebugUtils.currentLine=156172288;
 //BA.debugLineNum = 156172288;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
RDebugUtils.currentLine=156172289;
 //BA.debugLineNum = 156172289;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
__ref._mspacebetweencharacters /*float*/  = (float) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=156172290;
 //BA.debugLineNum = 156172290;BA.debugLine="End Sub";
return "";
}
public boolean  _isspace(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isspace", true))
	 {return ((Boolean) Debug.delegate(ba, "isspace", new Object[] {_tc}));}
RDebugUtils.currentLine=155451392;
 //BA.debugLineNum = 155451392;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
RDebugUtils.currentLine=155451393;
 //BA.debugLineNum = 155451393;BA.debugLine="Return TextCharEquals(TC, \" \")";
if (true) return __ref._textcharequals /*boolean*/ (null,_tc," ");
RDebugUtils.currentLine=155451394;
 //BA.debugLineNum = 155451394;BA.debugLine="End Sub";
return false;
}
public boolean  _textcharequals(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextchars _tc,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharequals", true))
	 {return ((Boolean) Debug.delegate(ba, "textcharequals", new Object[] {_tc,_s}));}
int _i = 0;
RDebugUtils.currentLine=156696576;
 //BA.debugLineNum = 156696576;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
RDebugUtils.currentLine=156696577;
 //BA.debugLineNum = 156696577;BA.debugLine="If TC.Length <> s.Length Then Return False";
if (_tc.Length /*int*/ !=_s.length()) { 
if (true) return __c.False;};
RDebugUtils.currentLine=156696578;
 //BA.debugLineNum = 156696578;BA.debugLine="For i = 0 To TC.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_tc.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=156696579;
 //BA.debugLineNum = 156696579;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
if ((_tc.Buffer /*String[]*/ [(int) (_i+_tc.StartIndex /*int*/ )]).equals(BA.ObjectToString(_s.charAt(_i))) == false) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=156696581;
 //BA.debugLineNum = 156696581;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=156696582;
 //BA.debugLineNum = 156696582;BA.debugLine="End Sub";
return false;
}
public String  _organizelines(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizelines", true))
	 {return ((String) Debug.delegate(ba, "organizelines", new Object[] {_p}));}
String _paralignment = "";
int _count = 0;
int _prevlinebelowbaselineheight = 0;
b4j.docU.bctextengine._bctextline _line = null;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
int _maxwidth = 0;
String _alignment = "";
b4j.docU.bctextengine._bcsinglestylesection _linestyle = null;
b4j.docU.bctextengine._bcunbreakabletext _last = null;
int _numberofgaps = 0;
float _delta = 0f;
float _accumalated = 0f;
RDebugUtils.currentLine=153616384;
 //BA.debugLineNum = 153616384;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
RDebugUtils.currentLine=153616385;
 //BA.debugLineNum = 153616385;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
_paralignment = _p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/ .toLowerCase();
RDebugUtils.currentLine=153616386;
 //BA.debugLineNum = 153616386;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=153616387;
 //BA.debugLineNum = 153616387;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
_prevlinebelowbaselineheight = 0;
RDebugUtils.currentLine=153616388;
 //BA.debugLineNum = 153616388;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (b4j.docU.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=153616389;
 //BA.debugLineNum = 153616389;BA.debugLine="p.Width = Max(p.Width, line.Width)";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,_line.Width /*int*/ ));
RDebugUtils.currentLine=153616390;
 //BA.debugLineNum = 153616390;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=153616391;
 //BA.debugLineNum = 153616391;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (b4j.docU.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=153616392;
 //BA.debugLineNum = 153616392;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
_line.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_line.MaxHeightAboveBaseLine /*int*/ ));
RDebugUtils.currentLine=153616393;
 //BA.debugLineNum = 153616393;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
_line.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=153616396;
 //BA.debugLineNum = 153616396;BA.debugLine="If count = 0 Then";
if (_count==0) { 
RDebugUtils.currentLine=153616397;
 //BA.debugLineNum = 153616397;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = _line.MaxHeightAboveBaseLine /*int*/ ;
 }else {
RDebugUtils.currentLine=153616399;
 //BA.debugLineNum = 153616399;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = (int) (__c.Max(_line.MaxHeightAboveBaseLine /*int*/ +_prevlinebelowbaselineheight+__ref._mmingapbetweenlines /*int*/ *__ref._mscale /*float*/ ,__ref._mspacebetweenlines /*int*/ *_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .LineSpacingFactor /*float*/ ));
 };
RDebugUtils.currentLine=153616401;
 //BA.debugLineNum = 153616401;BA.debugLine="p.Height = p.Height + line.Height";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.Height /*int*/ );
RDebugUtils.currentLine=153616402;
 //BA.debugLineNum = 153616402;BA.debugLine="line.BaselineY = p.Height";
_line.BaselineY /*int*/  = _p.Height /*int*/ ;
RDebugUtils.currentLine=153616403;
 //BA.debugLineNum = 153616403;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
_prevlinebelowbaselineheight = _line.MaxHeightBelowBaseLine /*int*/ ;
RDebugUtils.currentLine=153616404;
 //BA.debugLineNum = 153616404;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
RDebugUtils.currentLine=153616406;
 //BA.debugLineNum = 153616406;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
_maxwidth = (int) ((_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ );
RDebugUtils.currentLine=153616407;
 //BA.debugLineNum = 153616407;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
_p.Width /*int*/  = (int) (__c.Min(_maxwidth,_p.Width /*int*/ ));
RDebugUtils.currentLine=153616408;
 //BA.debugLineNum = 153616408;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ );
RDebugUtils.currentLine=153616409;
 //BA.debugLineNum = 153616409;BA.debugLine="Dim alignment As String";
_alignment = "";
RDebugUtils.currentLine=153616410;
 //BA.debugLineNum = 153616410;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group26 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (b4j.docU.bctextengine._bctextline)(group26.Get(index26));
RDebugUtils.currentLine=153616411;
 //BA.debugLineNum = 153616411;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
if (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=153616412;
 //BA.debugLineNum = 153616412;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
_linestyle = __ref._getfirstsinglestyle /*b4j.docU.bctextengine._bcsinglestylesection*/ (null,_line);
RDebugUtils.currentLine=153616413;
 //BA.debugLineNum = 153616413;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
if ((_linestyle.Run /*b4j.docU.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ ).equals("")) { 
_alignment = _paralignment;}
else {
_alignment = _linestyle.Run /*b4j.docU.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ .toLowerCase();};
RDebugUtils.currentLine=153616414;
 //BA.debugLineNum = 153616414;BA.debugLine="If alignment = \"left\" Then";
if ((_alignment).equals("left")) { 
RDebugUtils.currentLine=153616415;
 //BA.debugLineNum = 153616415;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
if (_linestyle.Run /*b4j.docU.bctextengine._bctextrun*/ .IndentLevel /*int*/ >0) { 
RDebugUtils.currentLine=153616416;
 //BA.debugLineNum = 153616416;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
_line.StartX /*int*/  = (int) (__ref._indentwidth /*int*/ *_linestyle.Run /*b4j.docU.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=153616417;
 //BA.debugLineNum = 153616417;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,__c.Min(_maxwidth,_line.Width /*int*/ +_line.StartX /*int*/ )));
 };
 }else {
RDebugUtils.currentLine=153616420;
 //BA.debugLineNum = 153616420;BA.debugLine="p.Width = MaxWidth";
_p.Width /*int*/  = _maxwidth;
 };
RDebugUtils.currentLine=153616422;
 //BA.debugLineNum = 153616422;BA.debugLine="Select alignment";
switch (BA.switchObjectToInt(_alignment,"center","right","justify")) {
case 0: {
RDebugUtils.currentLine=153616424;
 //BA.debugLineNum = 153616424;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ /(double)2-_line.Width /*int*/ /(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=153616426;
 //BA.debugLineNum = 153616426;BA.debugLine="line.StartX = p.Width - line.Width";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ -_line.Width /*int*/ );
 break; }
case 2: {
RDebugUtils.currentLine=153616428;
 //BA.debugLineNum = 153616428;BA.debugLine="If line.EndsWithSoftLineBreak Then";
if (_line.EndsWithSoftLineBreak /*boolean*/ ) { 
RDebugUtils.currentLine=153616429;
 //BA.debugLineNum = 153616429;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
_last = (b4j.docU.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=153616430;
 //BA.debugLineNum = 153616430;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
if (__ref._isspace /*boolean*/ (null,_last.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ )) { 
RDebugUtils.currentLine=153616431;
 //BA.debugLineNum = 153616431;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=153616432;
 //BA.debugLineNum = 153616432;BA.debugLine="line.Width = line.Width - last.Width";
_line.Width /*int*/  = (int) (_line.Width /*int*/ -_last.Width /*int*/ );
 };
RDebugUtils.currentLine=153616434;
 //BA.debugLineNum = 153616434;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
_numberofgaps = (int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=153616435;
 //BA.debugLineNum = 153616435;BA.debugLine="If NumberOfGaps > 0 Then";
if (_numberofgaps>0) { 
RDebugUtils.currentLine=153616436;
 //BA.debugLineNum = 153616436;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
_delta = (float) ((_p.Width /*int*/ -_line.Width /*int*/ )/(double)_numberofgaps);
RDebugUtils.currentLine=153616437;
 //BA.debugLineNum = 153616437;BA.debugLine="Dim accumalated As Float = 0";
_accumalated = (float) (0);
RDebugUtils.currentLine=153616438;
 //BA.debugLineNum = 153616438;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
{
final anywheresoftware.b4a.BA.IterableList group54 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group54.Get(index54));
RDebugUtils.currentLine=153616439;
 //BA.debugLineNum = 153616439;BA.debugLine="un.StartX = un.StartX + accumalated";
_un.StartX /*int*/  = (int) (_un.StartX /*int*/ +_accumalated);
RDebugUtils.currentLine=153616440;
 //BA.debugLineNum = 153616440;BA.debugLine="accumalated = accumalated + delta";
_accumalated = (float) (_accumalated+_delta);
 }
};
 };
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=153616446;
 //BA.debugLineNum = 153616446;BA.debugLine="End Sub";
return "";
}
public String  _organizertlparagraph(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizertlparagraph", true))
	 {return ((String) Debug.delegate(ba, "organizertlparagraph", new Object[] {_par}));}
anywheresoftware.b4a.objects.collections.List _ltrlist = null;
b4j.docU.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.collections.List _newlist = null;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=153681920;
 //BA.debugLineNum = 153681920;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
RDebugUtils.currentLine=153681921;
 //BA.debugLineNum = 153681921;BA.debugLine="Dim LTRList As List";
_ltrlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=153681922;
 //BA.debugLineNum = 153681922;BA.debugLine="LTRList.Initialize";
_ltrlist.Initialize();
RDebugUtils.currentLine=153681924;
 //BA.debugLineNum = 153681924;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group3 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (b4j.docU.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=153681925;
 //BA.debugLineNum = 153681925;BA.debugLine="Dim NewList As List";
_newlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=153681926;
 //BA.debugLineNum = 153681926;BA.debugLine="NewList.Initialize";
_newlist.Initialize();
RDebugUtils.currentLine=153681930;
 //BA.debugLineNum = 153681930;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=153681931;
 //BA.debugLineNum = 153681931;BA.debugLine="If un.RTL Then";
if (_un.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=153681932;
 //BA.debugLineNum = 153681932;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=153681933;
 //BA.debugLineNum = 153681933;BA.debugLine="NewList.Add(un)";
_newlist.Add((Object)(_un));
 }else {
RDebugUtils.currentLine=153681935;
 //BA.debugLineNum = 153681935;BA.debugLine="LTRList.InsertAt(0, un)";
_ltrlist.InsertAt((int) (0),(Object)(_un));
 };
 }
};
RDebugUtils.currentLine=153681938;
 //BA.debugLineNum = 153681938;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=153681939;
 //BA.debugLineNum = 153681939;BA.debugLine="line.Unbreakables = NewList";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/  = _newlist;
RDebugUtils.currentLine=153681944;
 //BA.debugLineNum = 153681944;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group16 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group16.Get(index16));
RDebugUtils.currentLine=153681945;
 //BA.debugLineNum = 153681945;BA.debugLine="un.StartX = line.Width - un.StartX";
_un.StartX /*int*/  = (int) (_line.Width /*int*/ -_un.StartX /*int*/ );
RDebugUtils.currentLine=153681946;
 //BA.debugLineNum = 153681946;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=153681947;
 //BA.debugLineNum = 153681947;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group19 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (b4j.docU.bctextengine._bcsinglestylesection)(group19.Get(index19));
RDebugUtils.currentLine=153681948;
 //BA.debugLineNum = 153681948;BA.debugLine="x = x - single.Width";
_x = (int) (_x-_single.Width /*int*/ );
RDebugUtils.currentLine=153681949;
 //BA.debugLineNum = 153681949;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=153681950;
 //BA.debugLineNum = 153681950;BA.debugLine="x = x - mSpaceBetweenCharacters";
_x = (int) (_x-__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=153681951;
 //BA.debugLineNum = 153681951;BA.debugLine="If single.Run.View.IsInitialized Then";
if (_single.Run /*b4j.docU.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=153681952;
 //BA.debugLineNum = 153681952;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4j.docU.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=153681953;
 //BA.debugLineNum = 153681953;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ );
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=153681958;
 //BA.debugLineNum = 153681958;BA.debugLine="End Sub";
return "";
}
public String  _organizesinglestyles(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizesinglestyles", true))
	 {return ((String) Debug.delegate(ba, "organizesinglestyles", new Object[] {_p}));}
b4j.docU.bctextengine._bctextline _line = null;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4j.docU.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=153878528;
 //BA.debugLineNum = 153878528;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
RDebugUtils.currentLine=153878529;
 //BA.debugLineNum = 153878529;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4j.docU.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=153878530;
 //BA.debugLineNum = 153878530;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=153878531;
 //BA.debugLineNum = 153878531;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=153878532;
 //BA.debugLineNum = 153878532;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group4 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (b4j.docU.bctextengine._bcsinglestylesection)(group4.Get(index4));
RDebugUtils.currentLine=153878533;
 //BA.debugLineNum = 153878533;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=153878534;
 //BA.debugLineNum = 153878534;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
if (_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _single.Run /*b4j.docU.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=153878535;
 //BA.debugLineNum = 153878535;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*b4j.docU.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=153878536;
 //BA.debugLineNum = 153878536;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
_par = _single.ParentUN /*b4j.docU.bctextengine._bcunbreakabletext*/ .ParentLine /*b4j.docU.bctextengine._bctextline*/ .ParentParagraph /*b4j.docU.bctextengine._bcparagraph*/ ;
RDebugUtils.currentLine=153878537;
 //BA.debugLineNum = 153878537;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=153878538;
 //BA.debugLineNum = 153878538;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=153878539;
 //BA.debugLineNum = 153878539;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
_v.setTop(_line.BaselineY /*int*/ /(double)__ref._mscale /*float*/ -_v.getHeight()+_single.Run /*b4j.docU.bctextengine._bctextrun*/ .VerticalOffset /*int*/ );
RDebugUtils.currentLine=153878540;
 //BA.debugLineNum = 153878540;BA.debugLine="par.Views.Add(v)";
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v.getObject()));
 };
RDebugUtils.currentLine=153878542;
 //BA.debugLineNum = 153878542;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
_x = (int) (_x+_single.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
 }
};
 }
};
 }
};
RDebugUtils.currentLine=153878546;
 //BA.debugLineNum = 153878546;BA.debugLine="End Sub";
return "";
}
public String  _organizeunbreakables(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bcparagraph _p,anywheresoftware.b4a.objects.collections.List _unbreakables) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "organizeunbreakables", new Object[] {_p,_unbreakables}));}
b4j.docU.bctextengine._bcunbreakabletext _un = null;
int _i = 0;
b4j.docU.bctextengine._bcunbreakabletext _nextun = null;
b4j.docU.bctextengine._bcsinglestylesection _singlestyle = null;
int _indent = 0;
RDebugUtils.currentLine=154337280;
 //BA.debugLineNum = 154337280;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
RDebugUtils.currentLine=154337281;
 //BA.debugLineNum = 154337281;BA.debugLine="If unbreakables.Size = 0 Then Return";
if (_unbreakables.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=154337282;
 //BA.debugLineNum = 154337282;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
_un = (b4j.docU.bctextengine._bcunbreakabletext)(_unbreakables.Get((int) (0)));
RDebugUtils.currentLine=154337283;
 //BA.debugLineNum = 154337283;BA.debugLine="Dim i As Int = 1";
_i = (int) (1);
RDebugUtils.currentLine=154337284;
 //BA.debugLineNum = 154337284;BA.debugLine="Do While i < unbreakables.Size";
while (_i<_unbreakables.getSize()) {
RDebugUtils.currentLine=154337285;
 //BA.debugLineNum = 154337285;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
_nextun = (b4j.docU.bctextengine._bcunbreakabletext)(_unbreakables.Get(_i));
RDebugUtils.currentLine=154337286;
 //BA.debugLineNum = 154337286;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
if (_un.IsMergable /*boolean*/ ==__c.True && _nextun.IsMergable /*boolean*/ ==__c.True && _un.RTL /*boolean*/ ==_nextun.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=154337287;
 //BA.debugLineNum = 154337287;BA.debugLine="MergeUnbreakables(un, NextUn)";
__ref._mergeunbreakables /*String*/ (null,_un,_nextun);
RDebugUtils.currentLine=154337288;
 //BA.debugLineNum = 154337288;BA.debugLine="unbreakables.RemoveAt(i)";
_unbreakables.RemoveAt(_i);
RDebugUtils.currentLine=154337289;
 //BA.debugLineNum = 154337289;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 }else {
RDebugUtils.currentLine=154337291;
 //BA.debugLineNum = 154337291;BA.debugLine="un = NextUn";
_un = _nextun;
 };
RDebugUtils.currentLine=154337293;
 //BA.debugLineNum = 154337293;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=154337295;
 //BA.debugLineNum = 154337295;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
{
final anywheresoftware.b4a.BA.IterableList group15 = _unbreakables;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group15.Get(index15));
RDebugUtils.currentLine=154337296;
 //BA.debugLineNum = 154337296;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (13))))) { 
if (true) continue;};
RDebugUtils.currentLine=154337297;
 //BA.debugLineNum = 154337297;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (10))))) { 
RDebugUtils.currentLine=154337298;
 //BA.debugLineNum = 154337298;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
RDebugUtils.currentLine=154337299;
 //BA.debugLineNum = 154337299;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=154337301;
 //BA.debugLineNum = 154337301;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
if (_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && _p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/ ) { 
RDebugUtils.currentLine=154337302;
 //BA.debugLineNum = 154337302;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
_singlestyle = (b4j.docU.bctextengine._bcsinglestylesection)(_un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=154337303;
 //BA.debugLineNum = 154337303;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
_indent = (int) (__ref._indentwidth /*int*/ *_singlestyle.Run /*b4j.docU.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=154337304;
 //BA.debugLineNum = 154337304;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
if (_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_un.Width /*int*/ +_indent>(_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=154337305;
 //BA.debugLineNum = 154337305;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .EndsWithSoftLineBreak /*boolean*/  = __c.True;
RDebugUtils.currentLine=154337306;
 //BA.debugLineNum = 154337306;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
 };
 };
RDebugUtils.currentLine=154337309;
 //BA.debugLineNum = 154337309;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_un));
RDebugUtils.currentLine=154337310;
 //BA.debugLineNum = 154337310;BA.debugLine="un.ParentLine = p.CurrentLine";
_un.ParentLine /*b4j.docU.bctextengine._bctextline*/  = _p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ ;
RDebugUtils.currentLine=154337311;
 //BA.debugLineNum = 154337311;BA.debugLine="If un.Anchor <> \"\" Then";
if ((_un.Anchor /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=154337312;
 //BA.debugLineNum = 154337312;BA.debugLine="If p.Anchors.IsInitialized = False Then p.Ancho";
if (_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=154337313;
 //BA.debugLineNum = 154337313;BA.debugLine="p.Anchors.Put(un.Anchor, p.CurrentLine)";
_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_un.Anchor /*String*/ ),(Object)(_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ ));
 };
RDebugUtils.currentLine=154337315;
 //BA.debugLineNum = 154337315;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
if (__ref._isspace /*boolean*/ (null,_un.NotFullTextChars /*b4j.docU.bctextengine._bctextchars*/ ) && _p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=154337316;
 //BA.debugLineNum = 154337316;BA.debugLine="un.Width = 0";
_un.Width /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=154337318;
 //BA.debugLineNum = 154337318;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
if (_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );};
RDebugUtils.currentLine=154337319;
 //BA.debugLineNum = 154337319;BA.debugLine="un.StartX = p.CurrentLine.Width";
_un.StartX /*int*/  = _p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Width /*int*/ ;
RDebugUtils.currentLine=154337320;
 //BA.debugLineNum = 154337320;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*b4j.docU.bctextengine._bctextline*/ .Width /*int*/ +_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=154337322;
 //BA.debugLineNum = 154337322;BA.debugLine="End Sub";
return "";
}
public String  _printtextchars(b4j.docU.bctextengine __ref,b4j.docU.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "printtextchars", true))
	 {return ((String) Debug.delegate(ba, "printtextchars", new Object[] {_tc}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=156893184;
 //BA.debugLineNum = 156893184;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
RDebugUtils.currentLine=156893185;
 //BA.debugLineNum = 156893185;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=156893186;
 //BA.debugLineNum = 156893186;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=156893187;
 //BA.debugLineNum = 156893187;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
{
final int step3 = 1;
final int limit3 = (int) (_tc.StartIndex /*int*/ +_tc.Length /*int*/ -1);
_i = _tc.StartIndex /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=156893188;
 //BA.debugLineNum = 156893188;BA.debugLine="sb.Append(TC.Buffer(i))";
_sb.Append(_tc.Buffer /*String[]*/ [_i]);
 }
};
RDebugUtils.currentLine=156893190;
 //BA.debugLineNum = 156893190;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("9156893190",_sb.ToString(),0);
RDebugUtils.currentLine=156893191;
 //BA.debugLineNum = 156893191;BA.debugLine="End Sub";
return "";
}
public String  _setmingapbetweenlines(b4j.docU.bctextengine __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setmingapbetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setmingapbetweenlines", new Object[] {_i}));}
RDebugUtils.currentLine=156368896;
 //BA.debugLineNum = 156368896;BA.debugLine="Public Sub setMinGapBetweenLines(i As Int)";
RDebugUtils.currentLine=156368897;
 //BA.debugLineNum = 156368897;BA.debugLine="mMinGapBetweenLines = i";
__ref._mmingapbetweenlines /*int*/  = _i;
RDebugUtils.currentLine=156368898;
 //BA.debugLineNum = 156368898;BA.debugLine="End Sub";
return "";
}
}