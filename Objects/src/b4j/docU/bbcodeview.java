package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.bbcodeview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.bbcodeview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _internalbbviewurl{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Lines;
public void Initialize() {
IsInitialized = true;
Lines = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
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
public anywheresoftware.b4a.objects.B4XViewWrapper _backgroundimageview = null;
public b4j.docU.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4j.docU.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _lazyloading = false;
public anywheresoftware.b4a.objects.collections.List _imageviewscache = null;
public b4j.docU.b4xorderedmap _usedimageviews = null;
public anywheresoftware.b4a.objects.collections.List _externalruns = null;
public boolean _disableautomaticdrawingsinlazymode = false;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.collections.Map _urltolines = null;
public boolean _autounderlineurls = false;
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
public String  _settext(b4j.docU.bbcodeview __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=151126016;
 //BA.debugLineNum = 151126016;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=151126017;
 //BA.debugLineNum = 151126017;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=151126018;
 //BA.debugLineNum = 151126018;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=151126019;
 //BA.debugLineNum = 151126019;BA.debugLine="End Sub";
return "";
}
public String  _gettext(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=151191552;
 //BA.debugLineNum = 151191552;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=151191553;
 //BA.debugLineNum = 151191553;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=151191554;
 //BA.debugLineNum = 151191554;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4j.docU.bbcodeview __ref,b4j.docU.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=150994944;
 //BA.debugLineNum = 150994944;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=150994945;
 //BA.debugLineNum = 150994945;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4j.docU.bctextengine*/  = _b;
RDebugUtils.currentLine=150994947;
 //BA.debugLineNum = 150994947;BA.debugLine="mTextEngine.TagParser.InternalSetMouseTransparent";
__ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._internalsetmousetransparent /*String*/ (null,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=150994949;
 //BA.debugLineNum = 150994949;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=150994950;
 //BA.debugLineNum = 150994950;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=150994952;
 //BA.debugLineNum = 150994952;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4j.docU.bbcodeview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=150929408;
 //BA.debugLineNum = 150929408;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=150929409;
 //BA.debugLineNum = 150929409;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=150929410;
 //BA.debugLineNum = 150929410;BA.debugLine="sv.ScrollViewContentWidth = Width";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth(_width);
RDebugUtils.currentLine=150929411;
 //BA.debugLineNum = 150929411;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=150929412;
 //BA.debugLineNum = 150929412;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=150929413;
 //BA.debugLineNum = 150929413;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=150929414;
 //BA.debugLineNum = 150929414;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=150929416;
 //BA.debugLineNum = 150929416;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=150929419;
 //BA.debugLineNum = 150929419;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=151650304;
 //BA.debugLineNum = 151650304;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=151650305;
 //BA.debugLineNum = 151650305;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=151650306;
 //BA.debugLineNum = 151650306;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=151650307;
 //BA.debugLineNum = 151650307;BA.debugLine="ParseData.URLs.Clear";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=151650308;
 //BA.debugLineNum = 151650308;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=151650309;
 //BA.debugLineNum = 151650309;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (__ref._rtl /*boolean*/ ) { 
__ref._mtextengine /*b4j.docU.bctextengine*/ ._rtlaware /*boolean*/  = __c.True;};
RDebugUtils.currentLine=151650310;
 //BA.debugLineNum = 151650310;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=151650311;
 //BA.debugLineNum = 151650311;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=151650312;
 //BA.debugLineNum = 151650312;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=151650313;
 //BA.debugLineNum = 151650313;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((javafx.scene.Node)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
 };
RDebugUtils.currentLine=151650315;
 //BA.debugLineNum = 151650315;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((javafx.scene.Node)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=151650316;
 //BA.debugLineNum = 151650316;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (__ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=151650317;
 //BA.debugLineNum = 151650317;BA.debugLine="Runs = ExternalRuns";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ ;
 }else {
RDebugUtils.currentLine=151650319;
 //BA.debugLineNum = 151650319;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ );
 };
RDebugUtils.currentLine=151650322;
 //BA.debugLineNum = 151650322;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=151650323;
 //BA.debugLineNum = 151650323;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
RDebugUtils.currentLine=151715840;
 //BA.debugLineNum = 151715840;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=151715841;
 //BA.debugLineNum = 151715841;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createstyle /*b4j.docU.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=151715842;
 //BA.debugLineNum = 151715842;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=151715843;
 //BA.debugLineNum = 151715843;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=151715844;
 //BA.debugLineNum = 151715844;BA.debugLine="Style.ResizeHeightAutomatically = True";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  = __c.True;
RDebugUtils.currentLine=151715845;
 //BA.debugLineNum = 151715845;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=151715846;
 //BA.debugLineNum = 151715846;BA.debugLine="URLToLines.Clear";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=151715847;
 //BA.debugLineNum = 151715847;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=151715848;
 //BA.debugLineNum = 151715848;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
__ref._cleanexistingimageviews /*String*/ (null,__c.False,__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null),(int) (0),(int) (0));
RDebugUtils.currentLine=151715849;
 //BA.debugLineNum = 151715849;BA.debugLine="UsedImageViews.Clear";
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=151715850;
 //BA.debugLineNum = 151715850;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._prepareforlazydrawing /*b4j.docU.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=151715851;
 //BA.debugLineNum = 151715851;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft(),__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop(),__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth(),__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight());
RDebugUtils.currentLine=151715852;
 //BA.debugLineNum = 151715852;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (__ref._autounderlineurls /*boolean*/  && __ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=151715853;
 //BA.debugLineNum = 151715853;BA.debugLine="CollectURLs";
__ref._collecturls /*String*/ (null);
 };
RDebugUtils.currentLine=151715855;
 //BA.debugLineNum = 151715855;BA.debugLine="DrawVisibleRegion";
__ref._drawvisibleregion /*String*/ (null);
 }else {
RDebugUtils.currentLine=151715857;
 //BA.debugLineNum = 151715857;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._drawtext /*b4j.docU.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 };
RDebugUtils.currentLine=151715859;
 //BA.debugLineNum = 151715859;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=151715860;
 //BA.debugLineNum = 151715860;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=151715862;
 //BA.debugLineNum = 151715862;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
RDebugUtils.currentLine=150601728;
 //BA.debugLineNum = 150601728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=150601729;
 //BA.debugLineNum = 150601729;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=150601730;
 //BA.debugLineNum = 150601730;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=150601731;
 //BA.debugLineNum = 150601731;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=150601732;
 //BA.debugLineNum = 150601732;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=150601733;
 //BA.debugLineNum = 150601733;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150601734;
 //BA.debugLineNum = 150601734;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=150601735;
 //BA.debugLineNum = 150601735;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4j.docU.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=150601736;
 //BA.debugLineNum = 150601736;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4j.docU.bctextengine();
RDebugUtils.currentLine=150601737;
 //BA.debugLineNum = 150601737;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=150601738;
 //BA.debugLineNum = 150601738;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=150601739;
 //BA.debugLineNum = 150601739;BA.debugLine="Public BackgroundImageView As B4XView";
_backgroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=150601740;
 //BA.debugLineNum = 150601740;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4j.docU.bctextengine._bcparagraph();
RDebugUtils.currentLine=150601741;
 //BA.debugLineNum = 150601741;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=150601742;
 //BA.debugLineNum = 150601742;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=150601743;
 //BA.debugLineNum = 150601743;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=150601744;
 //BA.debugLineNum = 150601744;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4j.docU.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=150601745;
 //BA.debugLineNum = 150601745;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=150601746;
 //BA.debugLineNum = 150601746;BA.debugLine="Public LazyLoading As Boolean";
_lazyloading = false;
RDebugUtils.currentLine=150601747;
 //BA.debugLineNum = 150601747;BA.debugLine="Private ImageViewsCache As List";
_imageviewscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150601748;
 //BA.debugLineNum = 150601748;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=150601749;
 //BA.debugLineNum = 150601749;BA.debugLine="Public ExternalRuns As List";
_externalruns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150601750;
 //BA.debugLineNum = 150601750;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
_disableautomaticdrawingsinlazymode = false;
RDebugUtils.currentLine=150601751;
 //BA.debugLineNum = 150601751;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
RDebugUtils.currentLine=150601752;
 //BA.debugLineNum = 150601752;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=150601753;
 //BA.debugLineNum = 150601753;BA.debugLine="Private URLToLines As Map";
_urltolines = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=150601754;
 //BA.debugLineNum = 150601754;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_autounderlineurls = false;
RDebugUtils.currentLine=150601755;
 //BA.debugLineNum = 150601755;BA.debugLine="End Sub";
return "";
}
public String  _cleanexistingimageviews(b4j.docU.bbcodeview __ref,boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "cleanexistingimageviews", true))
	 {return ((String) Debug.delegate(ba, "cleanexistingimageviews", new Object[] {_invisibleonly,_existing,_offset,_height}));}
b4j.docU.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
RDebugUtils.currentLine=151584768;
 //BA.debugLineNum = 151584768;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
RDebugUtils.currentLine=151584769;
 //BA.debugLineNum = 151584769;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4j.docU.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=151584770;
 //BA.debugLineNum = 151584770;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || __ref._lineisvisible /*boolean*/ (null,_line,_offset,_height)==__c.False) { 
RDebugUtils.currentLine=151584771;
 //BA.debugLineNum = 151584771;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line))));
RDebugUtils.currentLine=151584772;
 //BA.debugLineNum = 151584772;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
RDebugUtils.currentLine=151584773;
 //BA.debugLineNum = 151584773;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=151584774;
 //BA.debugLineNum = 151584774;BA.debugLine="ImageViewsCache.Add(xiv)";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xiv.getObject()));
RDebugUtils.currentLine=151584775;
 //BA.debugLineNum = 151584775;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_line));};
 };
 }
};
RDebugUtils.currentLine=151584778;
 //BA.debugLineNum = 151584778;BA.debugLine="End Sub";
return "";
}
public boolean  _lineisvisible(b4j.docU.bbcodeview __ref,b4j.docU.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "lineisvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "lineisvisible", new Object[] {_line,_offset,_height}));}
RDebugUtils.currentLine=151519232;
 //BA.debugLineNum = 151519232;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
RDebugUtils.currentLine=151519233;
 //BA.debugLineNum = 151519233;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
RDebugUtils.currentLine=151519234;
 //BA.debugLineNum = 151519234;BA.debugLine="End Sub";
return false;
}
public String  _collecturls(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "collecturls", true))
	 {return ((String) Debug.delegate(ba, "collecturls", null));}
b4j.docU.bctextengine._bctextline _line = null;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
b4j.docU.bctextengine._bcsinglestylesection _st = null;
b4j.docU.bbcodeview._internalbbviewurl _extra = null;
RDebugUtils.currentLine=152043520;
 //BA.debugLineNum = 152043520;BA.debugLine="Private Sub CollectURLs";
RDebugUtils.currentLine=152043521;
 //BA.debugLineNum = 152043521;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4j.docU.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=152043522;
 //BA.debugLineNum = 152043522;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=152043523;
 //BA.debugLineNum = 152043523;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (b4j.docU.bctextengine._bcsinglestylesection)(group3.Get(index3));
RDebugUtils.currentLine=152043524;
 //BA.debugLineNum = 152043524;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ ))) { 
RDebugUtils.currentLine=152043525;
 //BA.debugLineNum = 152043525;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new b4j.docU.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=152043526;
 //BA.debugLineNum = 152043526;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ ))==__c.False) { 
RDebugUtils.currentLine=152043527;
 //BA.debugLineNum = 152043527;BA.debugLine="extra = CreateBCURLExtraData";
_extra = __ref._createbcurlextradata /*b4j.docU.bbcodeview._internalbbviewurl*/ (null);
RDebugUtils.currentLine=152043528;
 //BA.debugLineNum = 152043528;BA.debugLine="URLToLines.Put(st.Run, extra)";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
RDebugUtils.currentLine=152043530;
 //BA.debugLineNum = 152043530;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (b4j.docU.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ )));
 };
RDebugUtils.currentLine=152043532;
 //BA.debugLineNum = 152043532;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
RDebugUtils.currentLine=152043533;
 //BA.debugLineNum = 152043533;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=152043539;
 //BA.debugLineNum = 152043539;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bbcodeview._internalbbviewurl  _createbcurlextradata(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "createbcurlextradata", true))
	 {return ((b4j.docU.bbcodeview._internalbbviewurl) Debug.delegate(ba, "createbcurlextradata", null));}
b4j.docU.bbcodeview._internalbbviewurl _t1 = null;
RDebugUtils.currentLine=152109056;
 //BA.debugLineNum = 152109056;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
RDebugUtils.currentLine=152109057;
 //BA.debugLineNum = 152109057;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new b4j.docU.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=152109058;
 //BA.debugLineNum = 152109058;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=152109059;
 //BA.debugLineNum = 152109059;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=152109060;
 //BA.debugLineNum = 152109060;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=152109061;
 //BA.debugLineNum = 152109061;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4j.docU.bbcodeview __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4j.objects.JFX _fx = null;
RDebugUtils.currentLine=150863872;
 //BA.debugLineNum = 150863872;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=150863873;
 //BA.debugLineNum = 150863873;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=150863874;
 //BA.debugLineNum = 150863874;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=150863875;
 //BA.debugLineNum = 150863875;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=150863877;
 //BA.debugLineNum = 150863877;BA.debugLine="Dim sp As ScrollPane";
_sp = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
RDebugUtils.currentLine=150863878;
 //BA.debugLineNum = 150863878;BA.debugLine="sp.Initialize(\"sv\")";
_sp.Initialize(ba,"sv");
RDebugUtils.currentLine=150863879;
 //BA.debugLineNum = 150863879;BA.debugLine="sp.SetHScrollVisibility(\"NEVER\")";
_sp.SetHScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"NEVER"));
RDebugUtils.currentLine=150863888;
 //BA.debugLineNum = 150863888;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
__ref._lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.True)));
RDebugUtils.currentLine=150863889;
 //BA.debugLineNum = 150863889;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
__ref._autounderlineurls /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
RDebugUtils.currentLine=150863890;
 //BA.debugLineNum = 150863890;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=150863891;
 //BA.debugLineNum = 150863891;BA.debugLine="ImageViewsCache.Initialize";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=150863892;
 //BA.debugLineNum = 150863892;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/  = _b4xcollections._createorderedmap /*b4j.docU.b4xorderedmap*/ ();
 };
RDebugUtils.currentLine=150863894;
 //BA.debugLineNum = 150863894;BA.debugLine="sv = sp";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=150863895;
 //BA.debugLineNum = 150863895;BA.debugLine="sv.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=150863896;
 //BA.debugLineNum = 150863896;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=150863897;
 //BA.debugLineNum = 150863897;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=150863898;
 //BA.debugLineNum = 150863898;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=150863899;
 //BA.debugLineNum = 150863899;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=150863900;
 //BA.debugLineNum = 150863900;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=150863901;
 //BA.debugLineNum = 150863901;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=150863902;
 //BA.debugLineNum = 150863902;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel();
RDebugUtils.currentLine=150863903;
 //BA.debugLineNum = 150863903;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_linkclicked",(int) (1))) { 
RDebugUtils.currentLine=150863904;
 //BA.debugLineNum = 150863904;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
 };
RDebugUtils.currentLine=150863907;
 //BA.debugLineNum = 150863907;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=150863908;
 //BA.debugLineNum = 150863908;BA.debugLine="ParseData.DefaultBoldFont = fx.CreateFont(Lbl.Fon";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_fx.CreateFont(_lbl.getFont().getFamilyName(),__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize(),__c.True,__c.False).getObject()));
RDebugUtils.currentLine=150863915;
 //BA.debugLineNum = 150863915;BA.debugLine="End Sub";
return "";
}
public String  _drawvisibleregion(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "drawvisibleregion", true))
	 {return ((String) Debug.delegate(ba, "drawvisibleregion", null));}
RDebugUtils.currentLine=151257088;
 //BA.debugLineNum = 151257088;BA.debugLine="Private Sub DrawVisibleRegion";
RDebugUtils.currentLine=151257089;
 //BA.debugLineNum = 151257089;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=151257090;
 //BA.debugLineNum = 151257090;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
__ref._updatevisibleregion /*String*/ (null,(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY()*__ref._mtextengine /*b4j.docU.bctextengine*/ ._mscale /*float*/ ),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mtextengine /*b4j.docU.bctextengine*/ ._mscale /*float*/ ));
RDebugUtils.currentLine=151257091;
 //BA.debugLineNum = 151257091;BA.debugLine="End Sub";
return "";
}
public String  _updatevisibleregion(b4j.docU.bbcodeview __ref,int _offsety,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "updatevisibleregion", true))
	 {return ((String) Debug.delegate(ba, "updatevisibleregion", new Object[] {_offsety,_height}));}
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.docU.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=151322624;
 //BA.debugLineNum = 151322624;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
RDebugUtils.currentLine=151322625;
 //BA.debugLineNum = 151322625;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
RDebugUtils.currentLine=151322626;
 //BA.debugLineNum = 151322626;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=151322627;
 //BA.debugLineNum = 151322627;BA.debugLine="Existing.Initialize";
_existing.Initialize();
RDebugUtils.currentLine=151322628;
 //BA.debugLineNum = 151322628;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=151322629;
 //BA.debugLineNum = 151322629;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
__ref._cleanexistingimageviews /*String*/ (null,__c.True,_existing,_offsety,_height);
RDebugUtils.currentLine=151322630;
 //BA.debugLineNum = 151322630;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (b4j.docU.bctextengine._bctextline)(group6.Get(index6));
RDebugUtils.currentLine=151322631;
 //BA.debugLineNum = 151322631;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (__ref._lineisvisible /*boolean*/ (null,_line,_offsety,_height)) { 
RDebugUtils.currentLine=151322632;
 //BA.debugLineNum = 151322632;BA.debugLine="foundFirst = True";
_foundfirst = __c.True;
RDebugUtils.currentLine=151322633;
 //BA.debugLineNum = 151322633;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=151322634;
 //BA.debugLineNum = 151322634;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=151322636;
 //BA.debugLineNum = 151322636;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=151322637;
 //BA.debugLineNum = 151322637;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=151322638;
 //BA.debugLineNum = 151322638;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=151322639;
 //BA.debugLineNum = 151322639;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=151322640;
 //BA.debugLineNum = 151322640;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
RDebugUtils.currentLine=151322642;
 //BA.debugLineNum = 151322642;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=151322643;
 //BA.debugLineNum = 151322643;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=151322645;
 //BA.debugLineNum = 151322645;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((javafx.scene.Node)(_xiv.getObject()),0,0,0,0);
RDebugUtils.currentLine=151322646;
 //BA.debugLineNum = 151322646;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
RDebugUtils.currentLine=151322647;
 //BA.debugLineNum = 151322647;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
__ref._mtextengine /*b4j.docU.bctextengine*/ ._drawsingleline /*String*/ (null,_line,_xiv,__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ );
RDebugUtils.currentLine=151322648;
 //BA.debugLineNum = 151322648;BA.debugLine="UsedImageViews.Put(Line, xiv)";
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_line),(Object)(_xiv.getObject()));
 }else {
RDebugUtils.currentLine=151322650;
 //BA.debugLineNum = 151322650;BA.debugLine="If foundFirst Then Exit";
if (_foundfirst) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=151322653;
 //BA.debugLineNum = 151322653;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bctextrun  _findtouchedrun(b4j.docU.bbcodeview __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "findtouchedrun", true))
	 {return ((b4j.docU.bctextengine._bctextrun) Debug.delegate(ba, "findtouchedrun", new Object[] {_x,_y}));}
int _offsetx = 0;
int _offsety = 0;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=151912448;
 //BA.debugLineNum = 151912448;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
RDebugUtils.currentLine=151912449;
 //BA.debugLineNum = 151912449;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
RDebugUtils.currentLine=151912450;
 //BA.debugLineNum = 151912450;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
RDebugUtils.currentLine=151912451;
 //BA.debugLineNum = 151912451;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = __ref._mtextengine /*b4j.docU.bctextengine*/ ._findsinglestylesection /*b4j.docU.bctextengine._bcsinglestylesection*/ (null,__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ ,(int) (_x+_offsetx),(int) (_y+_offsety));
RDebugUtils.currentLine=151912452;
 //BA.debugLineNum = 151912452;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
RDebugUtils.currentLine=151912453;
 //BA.debugLineNum = 151912453;BA.debugLine="Return single.Run";
if (true) return _single.Run /*b4j.docU.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
RDebugUtils.currentLine=151912457;
 //BA.debugLineNum = 151912457;BA.debugLine="Return Null";
if (true) return (b4j.docU.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=151912458;
 //BA.debugLineNum = 151912458;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bctextline  _getanchorline(b4j.docU.bbcodeview __ref,String _anchor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getanchorline", true))
	 {return ((b4j.docU.bctextengine._bctextline) Debug.delegate(ba, "getanchorline", new Object[] {_anchor}));}
RDebugUtils.currentLine=151453696;
 //BA.debugLineNum = 151453696;BA.debugLine="Private Sub GetAnchorLine (Anchor As String) As BC";
RDebugUtils.currentLine=151453697;
 //BA.debugLineNum = 151453697;BA.debugLine="If Paragraph.Anchors.IsInitialized = False Then R";
if (__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (b4j.docU.bctextengine._bctextline)(__c.Null);};
RDebugUtils.currentLine=151453698;
 //BA.debugLineNum = 151453698;BA.debugLine="Return Paragraph.Anchors.Get(Anchor)";
if (true) return (b4j.docU.bctextengine._bctextline)(__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_anchor)));
RDebugUtils.currentLine=151453699;
 //BA.debugLineNum = 151453699;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine  _gettextengine(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((b4j.docU.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=151060480;
 //BA.debugLineNum = 151060480;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=151060481;
 //BA.debugLineNum = 151060481;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4j.docU.bctextengine*/ ;
RDebugUtils.currentLine=151060482;
 //BA.debugLineNum = 151060482;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getviews(b4j.docU.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getviews", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getviews", null));}
RDebugUtils.currentLine=150732800;
 //BA.debugLineNum = 150732800;BA.debugLine="Public Sub getViews As Map";
RDebugUtils.currentLine=150732801;
 //BA.debugLineNum = 150732801;BA.debugLine="Return ParseData.Views";
if (true) return __ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=150732802;
 //BA.debugLineNum = 150732802;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.bbcodeview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=150667264;
 //BA.debugLineNum = 150667264;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=150667265;
 //BA.debugLineNum = 150667265;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=150667266;
 //BA.debugLineNum = 150667266;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=150667267;
 //BA.debugLineNum = 150667267;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=150667268;
 //BA.debugLineNum = 150667268;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=150667269;
 //BA.debugLineNum = 150667269;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=150667270;
 //BA.debugLineNum = 150667270;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=150667271;
 //BA.debugLineNum = 150667271;BA.debugLine="ParseData.Views.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=150667272;
 //BA.debugLineNum = 150667272;BA.debugLine="ParseData.URLs.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=150667273;
 //BA.debugLineNum = 150667273;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=150667274;
 //BA.debugLineNum = 150667274;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (5))));
 }else {
RDebugUtils.currentLine=150667276;
 //BA.debugLineNum = 150667276;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 };
RDebugUtils.currentLine=150667278;
 //BA.debugLineNum = 150667278;BA.debugLine="ParseData.ImageCache.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=150667279;
 //BA.debugLineNum = 150667279;BA.debugLine="URLToLines.Initialize";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=150667280;
 //BA.debugLineNum = 150667280;BA.debugLine="End Sub";
return "";
}
public String  _markurl(b4j.docU.bbcodeview __ref,b4j.docU.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "markurl", true))
	 {return ((String) Debug.delegate(ba, "markurl", new Object[] {_run}));}
anywheresoftware.b4j.objects.JFX _fx = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
b4j.docU.bctextengine._bctextrun _r = null;
b4j.docU.bbcodeview._internalbbviewurl _extra = null;
b4j.docU.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=151977984;
 //BA.debugLineNum = 151977984;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
RDebugUtils.currentLine=151977986;
 //BA.debugLineNum = 151977986;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=151977987;
 //BA.debugLineNum = 151977987;BA.debugLine="Dim n As Node = mBase";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=151977988;
 //BA.debugLineNum = 151977988;BA.debugLine="If Run = Null Then";
if (_run== null) { 
RDebugUtils.currentLine=151977989;
 //BA.debugLineNum = 151977989;BA.debugLine="n.MouseCursor = fx.Cursors.DEFAULT";
_n.setMouseCursor(_fx.Cursors.DEFAULT);
 }else {
RDebugUtils.currentLine=151977991;
 //BA.debugLineNum = 151977991;BA.debugLine="n.MouseCursor = fx.Cursors.HAND";
_n.setMouseCursor(_fx.Cursors.HAND);
 };
RDebugUtils.currentLine=151977994;
 //BA.debugLineNum = 151977994;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_r = (b4j.docU.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=151977995;
 //BA.debugLineNum = 151977995;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
RDebugUtils.currentLine=151977996;
 //BA.debugLineNum = 151977996;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
RDebugUtils.currentLine=151977997;
 //BA.debugLineNum = 151977997;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (b4j.docU.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_r)));
RDebugUtils.currentLine=151977998;
 //BA.debugLineNum = 151977998;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group12 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_line = (b4j.docU.bctextengine._bctextline)(group12.Get(index12));
RDebugUtils.currentLine=151977999;
 //BA.debugLineNum = 151977999;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=151978000;
 //BA.debugLineNum = 151978000;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
__ref._mtextengine /*b4j.docU.bctextengine*/ ._drawsingleline /*String*/ (null,_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line)))),__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ );
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=151978005;
 //BA.debugLineNum = 151978005;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoanchor(b4j.docU.bbcodeview __ref,String _anchor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "scrolltoanchor", true))
	 {return ((String) Debug.delegate(ba, "scrolltoanchor", new Object[] {_anchor}));}
b4j.docU.bctextengine._bctextline _line = null;
int _top = 0;
RDebugUtils.currentLine=151388160;
 //BA.debugLineNum = 151388160;BA.debugLine="Public Sub ScrollToAnchor(Anchor As String)";
RDebugUtils.currentLine=151388161;
 //BA.debugLineNum = 151388161;BA.debugLine="Dim line As BCTextLine = GetAnchorLine(Anchor)";
_line = __ref._getanchorline /*b4j.docU.bctextengine._bctextline*/ (null,_anchor);
RDebugUtils.currentLine=151388162;
 //BA.debugLineNum = 151388162;BA.debugLine="If line <> Null Then";
if (_line!= null) { 
RDebugUtils.currentLine=151388163;
 //BA.debugLineNum = 151388163;BA.debugLine="Dim top As Int = line.BaselineY - line.MaxHeight";
_top = (int) (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=151388170;
 //BA.debugLineNum = 151388170;BA.debugLine="sv.ScrollViewOffsetY = top";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY(_top);
 };
RDebugUtils.currentLine=151388176;
 //BA.debugLineNum = 151388176;BA.debugLine="End Sub";
return "";
}
public String  _setviews(b4j.docU.bbcodeview __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "setviews", true))
	 {return ((String) Debug.delegate(ba, "setviews", new Object[] {_m}));}
RDebugUtils.currentLine=150798336;
 //BA.debugLineNum = 150798336;BA.debugLine="Public Sub setViews (m As Map)";
RDebugUtils.currentLine=150798337;
 //BA.debugLineNum = 150798337;BA.debugLine="ParseData.Views = m";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=150798338;
 //BA.debugLineNum = 150798338;BA.debugLine="End Sub";
return "";
}
public String  _sv_vscrollchanged(b4j.docU.bbcodeview __ref,double _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "sv_vscrollchanged", true))
	 {return ((String) Debug.delegate(ba, "sv_vscrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=152174592;
 //BA.debugLineNum = 152174592;BA.debugLine="Private Sub sv_VScrollChanged (Position As Double)";
RDebugUtils.currentLine=152174593;
 //BA.debugLineNum = 152174593;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
if (__ref._lazyloading /*boolean*/ ) { 
__ref._drawvisibleregion /*String*/ (null);};
RDebugUtils.currentLine=152174594;
 //BA.debugLineNum = 152174594;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_mouseexited(b4j.docU.bbcodeview __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "touchpanel_mouseexited", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=151846912;
 //BA.debugLineNum = 151846912;BA.debugLine="Private Sub TouchPanel_MouseExited (EventData As M";
RDebugUtils.currentLine=151846913;
 //BA.debugLineNum = 151846913;BA.debugLine="If URLToLines.Size > 0 Then";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=151846914;
 //BA.debugLineNum = 151846914;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
 };
RDebugUtils.currentLine=151846916;
 //BA.debugLineNum = 151846916;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4j.docU.bbcodeview __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
b4j.docU.bctextengine._bctextrun _run = null;
String _url = "";
RDebugUtils.currentLine=151781376;
 //BA.debugLineNum = 151781376;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=151781377;
 //BA.debugLineNum = 151781377;BA.debugLine="Dim run As BCTextRun = Null";
_run = (b4j.docU.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=151781378;
 //BA.debugLineNum = 151781378;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0 || _action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=151781379;
 //BA.debugLineNum = 151781379;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = __ref._findtouchedrun /*b4j.docU.bctextengine._bctextrun*/ (null,_x,_y);
 };
RDebugUtils.currentLine=151781381;
 //BA.debugLineNum = 151781381;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && __ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
RDebugUtils.currentLine=151781382;
 //BA.debugLineNum = 151781382;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=151781383;
 //BA.debugLineNum = 151781383;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
RDebugUtils.currentLine=151781384;
 //BA.debugLineNum = 151781384;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked",(Object)(_url));
RDebugUtils.currentLine=151781385;
 //BA.debugLineNum = 151781385;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
 }else 
{RDebugUtils.currentLine=151781386;
 //BA.debugLineNum = 151781386;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && _action==4) || (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && _action==3)) { 
RDebugUtils.currentLine=151781387;
 //BA.debugLineNum = 151781387;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
 }else {
RDebugUtils.currentLine=151781390;
 //BA.debugLineNum = 151781390;BA.debugLine="MarkURL(run)";
__ref._markurl /*String*/ (null,_run);
 }}
;
RDebugUtils.currentLine=151781392;
 //BA.debugLineNum = 151781392;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=151781394;
 //BA.debugLineNum = 151781394;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
RDebugUtils.currentLine=151781395;
 //BA.debugLineNum = 151781395;BA.debugLine="End Sub";
return "";
}
}