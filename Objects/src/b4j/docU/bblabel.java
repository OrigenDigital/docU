package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bblabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.bblabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.bblabel.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _runs = null;
public b4j.docU.bctextengine._bcparagraphstyle _style = null;
public b4j.docU.bctextengine _mtextengine = null;
public String _mtext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview = null;
public b4j.docU.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4j.docU.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _disableresizeevent = false;
public boolean _wordwrap = false;
public boolean _rtl = false;
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
public String  _base_resize(b4j.docU.bblabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=152436736;
 //BA.debugLineNum = 152436736;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=152436737;
 //BA.debugLineNum = 152436737;BA.debugLine="If DisableResizeEvent Then Return";
if (__ref._disableresizeevent /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=152436738;
 //BA.debugLineNum = 152436738;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=152436739;
 //BA.debugLineNum = 152436739;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=152436740;
 //BA.debugLineNum = 152436740;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=152436742;
 //BA.debugLineNum = 152436742;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=152436745;
 //BA.debugLineNum = 152436745;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(b4j.docU.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
int _i = 0;
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=152764416;
 //BA.debugLineNum = 152764416;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=152764417;
 //BA.debugLineNum = 152764417;BA.debugLine="For i = mBase.NumberOfViews - 1 To 1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=152764418;
 //BA.debugLineNum = 152764418;BA.debugLine="mBase.GetView(i).RemoveViewFromParent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=152764420;
 //BA.debugLineNum = 152764420;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=152764421;
 //BA.debugLineNum = 152764421;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=152764422;
 //BA.debugLineNum = 152764422;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=152764423;
 //BA.debugLineNum = 152764423;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (__ref._rtl /*boolean*/ ) { 
__ref._mtextengine /*b4j.docU.bctextengine*/ ._rtlaware /*boolean*/  = __c.True;};
RDebugUtils.currentLine=152764424;
 //BA.debugLineNum = 152764424;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=152764425;
 //BA.debugLineNum = 152764425;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Parse";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=152764426;
 //BA.debugLineNum = 152764426;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=152764427;
 //BA.debugLineNum = 152764427;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4j.docU.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
int _dx = 0;
int _dy = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=152829952;
 //BA.debugLineNum = 152829952;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=152829953;
 //BA.debugLineNum = 152829953;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createstyle /*b4j.docU.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=152829954;
 //BA.debugLineNum = 152829954;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=152829955;
 //BA.debugLineNum = 152829955;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=152829956;
 //BA.debugLineNum = 152829956;BA.debugLine="Style.HorizontalAlignment = \"left\"";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/  = "left";
RDebugUtils.currentLine=152829957;
 //BA.debugLineNum = 152829957;BA.debugLine="Style.WordWrap = WordWrap";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/  = __ref._wordwrap /*boolean*/ ;
RDebugUtils.currentLine=152829958;
 //BA.debugLineNum = 152829958;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=152829959;
 //BA.debugLineNum = 152829959;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, For";
__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._drawtext /*b4j.docU.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null)));
RDebugUtils.currentLine=152829960;
 //BA.debugLineNum = 152829960;BA.debugLine="Dim dx As Int = mBase.Width / 2 - ForegroundImage";
_dx = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=152829961;
 //BA.debugLineNum = 152829961;BA.debugLine="Dim dy As Int = mBase.Height / 2 - ForegroundImag";
_dy = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=152829962;
 //BA.debugLineNum = 152829962;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
RDebugUtils.currentLine=152829963;
 //BA.debugLineNum = 152829963;BA.debugLine="v.Left = v.Left + dx";
_v.setLeft(_v.getLeft()+_dx);
RDebugUtils.currentLine=152829964;
 //BA.debugLineNum = 152829964;BA.debugLine="v.Top = v.Top + dy";
_v.setTop(_v.getTop()+_dy);
 }
};
RDebugUtils.currentLine=152829966;
 //BA.debugLineNum = 152829966;BA.debugLine="ForegroundImageView.Visible = Paragraph.Height >";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .Height /*int*/ >0);
RDebugUtils.currentLine=152829967;
 //BA.debugLineNum = 152829967;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
RDebugUtils.currentLine=152240128;
 //BA.debugLineNum = 152240128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=152240129;
 //BA.debugLineNum = 152240129;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=152240130;
 //BA.debugLineNum = 152240130;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=152240131;
 //BA.debugLineNum = 152240131;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=152240132;
 //BA.debugLineNum = 152240132;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=152240133;
 //BA.debugLineNum = 152240133;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=152240134;
 //BA.debugLineNum = 152240134;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4j.docU.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=152240135;
 //BA.debugLineNum = 152240135;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4j.docU.bctextengine();
RDebugUtils.currentLine=152240136;
 //BA.debugLineNum = 152240136;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=152240137;
 //BA.debugLineNum = 152240137;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=152240138;
 //BA.debugLineNum = 152240138;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4j.docU.bctextengine._bcparagraph();
RDebugUtils.currentLine=152240139;
 //BA.debugLineNum = 152240139;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=152240140;
 //BA.debugLineNum = 152240140;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4j.docU.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=152240141;
 //BA.debugLineNum = 152240141;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=152240142;
 //BA.debugLineNum = 152240142;BA.debugLine="Public DisableResizeEvent As Boolean";
_disableresizeevent = false;
RDebugUtils.currentLine=152240143;
 //BA.debugLineNum = 152240143;BA.debugLine="Public WordWrap As Boolean = True";
_wordwrap = __c.True;
RDebugUtils.currentLine=152240144;
 //BA.debugLineNum = 152240144;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=152240145;
 //BA.debugLineNum = 152240145;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4j.docU.bblabel __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4j.objects.JFX _fx = null;
RDebugUtils.currentLine=152371200;
 //BA.debugLineNum = 152371200;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=152371201;
 //BA.debugLineNum = 152371201;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=152371202;
 //BA.debugLineNum = 152371202;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=152371203;
 //BA.debugLineNum = 152371203;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=152371204;
 //BA.debugLineNum = 152371204;BA.debugLine="mBase.AddView(ForegroundImageView, 0, 0, mBase.Wi";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=152371205;
 //BA.debugLineNum = 152371205;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=152371206;
 //BA.debugLineNum = 152371206;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=152371207;
 //BA.debugLineNum = 152371207;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=152371208;
 //BA.debugLineNum = 152371208;BA.debugLine="ParseData.ViewsPanel = mBase";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=152371209;
 //BA.debugLineNum = 152371209;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=152371211;
 //BA.debugLineNum = 152371211;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=152371212;
 //BA.debugLineNum = 152371212;BA.debugLine="ParseData.DefaultBoldFont = fx.CreateFont(Lbl.Fon";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_fx.CreateFont(_lbl.getFont().getFamilyName(),__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize(),__c.True,__c.False).getObject()));
RDebugUtils.currentLine=152371218;
 //BA.debugLineNum = 152371218;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4j.docU.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=152698880;
 //BA.debugLineNum = 152698880;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=152698881;
 //BA.debugLineNum = 152698881;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=152698882;
 //BA.debugLineNum = 152698882;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine  _gettextengine(b4j.docU.bblabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((b4j.docU.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=152567808;
 //BA.debugLineNum = 152567808;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=152567809;
 //BA.debugLineNum = 152567809;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4j.docU.bctextengine*/ ;
RDebugUtils.currentLine=152567810;
 //BA.debugLineNum = 152567810;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.bblabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=152305664;
 //BA.debugLineNum = 152305664;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=152305665;
 //BA.debugLineNum = 152305665;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=152305666;
 //BA.debugLineNum = 152305666;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=152305667;
 //BA.debugLineNum = 152305667;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=152305668;
 //BA.debugLineNum = 152305668;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=152305669;
 //BA.debugLineNum = 152305669;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=152305670;
 //BA.debugLineNum = 152305670;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=152305671;
 //BA.debugLineNum = 152305671;BA.debugLine="Padding.Initialize(2dip, 2dip, 2dip, 2dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))),(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=152305672;
 //BA.debugLineNum = 152305672;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.docU.bblabel __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=152633344;
 //BA.debugLineNum = 152633344;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=152633345;
 //BA.debugLineNum = 152633345;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=152633346;
 //BA.debugLineNum = 152633346;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=152633347;
 //BA.debugLineNum = 152633347;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4j.docU.bblabel __ref,b4j.docU.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblabel";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=152502272;
 //BA.debugLineNum = 152502272;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=152502273;
 //BA.debugLineNum = 152502273;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4j.docU.bctextengine*/  = _b;
RDebugUtils.currentLine=152502275;
 //BA.debugLineNum = 152502275;BA.debugLine="mTextEngine.TagParser.InternalSetMouseTransparent";
__ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._internalsetmousetransparent /*String*/ (null,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=152502277;
 //BA.debugLineNum = 152502277;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=152502278;
 //BA.debugLineNum = 152502278;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=152502280;
 //BA.debugLineNum = 152502280;BA.debugLine="End Sub";
return "";
}
}