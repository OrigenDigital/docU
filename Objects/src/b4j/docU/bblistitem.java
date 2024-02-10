package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bblistitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.bblistitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.bblistitem.class).invoke(this, new Object[] {null});
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
public b4j.docU.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public b4j.docU.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.collections.List _imageviewscache = null;
public b4j.docU.b4xorderedmap _usedimageviews = null;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.collections.Map _urltolines = null;
public boolean _autounderlineurls = false;
public int _updateoffsety = 0;
public int _updateheight = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _stubscrollview = null;
public int _renderindex = 0;
public int _textindex = 0;
public boolean _waitingfordrawing = false;
public anywheresoftware.b4a.objects.collections.List _externalruns = null;
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
public String  _base_resize(b4j.docU.bblistitem __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=38862853;
 //BA.debugLineNum = 38862853;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=38862855;
 //BA.debugLineNum = 38862855;BA.debugLine="Public Style As BCParagraphStyle";
_style = new b4j.docU.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4j.docU.bctextengine();
RDebugUtils.currentLine=38862857;
 //BA.debugLineNum = 38862857;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=38862858;
 //BA.debugLineNum = 38862858;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new b4j.docU.bctextengine._bcparagraph();
RDebugUtils.currentLine=38862859;
 //BA.debugLineNum = 38862859;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38862860;
 //BA.debugLineNum = 38862860;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=38862861;
 //BA.debugLineNum = 38862861;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new b4j.docU.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=38862862;
 //BA.debugLineNum = 38862862;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=38862863;
 //BA.debugLineNum = 38862863;BA.debugLine="Private ImageViewsCache As List";
_imageviewscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38862864;
 //BA.debugLineNum = 38862864;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=38862865;
 //BA.debugLineNum = 38862865;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=38862866;
 //BA.debugLineNum = 38862866;BA.debugLine="Private URLToLines As Map";
_urltolines = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38862867;
 //BA.debugLineNum = 38862867;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_autounderlineurls = false;
RDebugUtils.currentLine=38862868;
 //BA.debugLineNum = 38862868;BA.debugLine="Private UpdateOffsetY, UpdateHeight As Int";
_updateoffsety = 0;
_updateheight = 0;
RDebugUtils.currentLine=38862869;
 //BA.debugLineNum = 38862869;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=38862870;
 //BA.debugLineNum = 38862870;BA.debugLine="Private StubScrollView As B4XView";
_stubscrollview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38862871;
 //BA.debugLineNum = 38862871;BA.debugLine="Private RenderIndex As Int";
_renderindex = 0;
RDebugUtils.currentLine=38862872;
 //BA.debugLineNum = 38862872;BA.debugLine="Public TextIndex As Int";
_textindex = 0;
RDebugUtils.currentLine=38862873;
 //BA.debugLineNum = 38862873;BA.debugLine="Private WaitingForDrawing As Boolean";
_waitingfordrawing = false;
RDebugUtils.currentLine=38862874;
 //BA.debugLineNum = 38862874;BA.debugLine="Public ExternalRuns As List";
_externalruns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38862876;
 //BA.debugLineNum = 38862876;BA.debugLine="End Sub";
return "";
}
public String  _cleanexistingimageviews(b4j.docU.bblistitem __ref,boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "cleanexistingimageviews", false))
	 {return ((String) Debug.delegate(ba, "cleanexistingimageviews", new Object[] {_invisibleonly,_existing,_offset,_height}));}
b4j.docU.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4j.docU.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || __ref._lineisvisible /*boolean*/ (null,_line,_offset,_height)==__c.False) { 
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line))));
RDebugUtils.currentLine=39845892;
 //BA.debugLineNum = 39845892;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
RDebugUtils.currentLine=39845893;
 //BA.debugLineNum = 39845893;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=39845894;
 //BA.debugLineNum = 39845894;BA.debugLine="ImageViewsCache.Add(xiv)";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xiv.getObject()));
RDebugUtils.currentLine=39845895;
 //BA.debugLineNum = 39845895;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_line));};
 };
 }
};
RDebugUtils.currentLine=39845898;
 //BA.debugLineNum = 39845898;BA.debugLine="End Sub";
return "";
}
public boolean  _lineisvisible(b4j.docU.bblistitem __ref,b4j.docU.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "lineisvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "lineisvisible", new Object[] {_line,_offset,_height}));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="End Sub";
return false;
}
public String  _collecturls(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "collecturls", false))
	 {return ((String) Debug.delegate(ba, "collecturls", null));}
b4j.docU.bctextengine._bctextline _line = null;
b4j.docU.bctextengine._bcunbreakabletext _un = null;
b4j.docU.bctextengine._bcsinglestylesection _st = null;
b4j.docU.bbcodeview._internalbbviewurl _extra = null;
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Private Sub CollectURLs";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (b4j.docU.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (b4j.docU.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (b4j.docU.bctextengine._bcsinglestylesection)(group3.Get(index3));
RDebugUtils.currentLine=40304644;
 //BA.debugLineNum = 40304644;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ ))) { 
RDebugUtils.currentLine=40304645;
 //BA.debugLineNum = 40304645;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new b4j.docU.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=40304646;
 //BA.debugLineNum = 40304646;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ ))==__c.False) { 
RDebugUtils.currentLine=40304647;
 //BA.debugLineNum = 40304647;BA.debugLine="extra = CreateBCURLExtraData";
_extra = __ref._createbcurlextradata /*b4j.docU.bbcodeview._internalbbviewurl*/ (null);
RDebugUtils.currentLine=40304648;
 //BA.debugLineNum = 40304648;BA.debugLine="URLToLines.Put(st.Run, extra)";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
RDebugUtils.currentLine=40304650;
 //BA.debugLineNum = 40304650;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (b4j.docU.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_st.Run /*b4j.docU.bctextengine._bctextrun*/ )));
 };
RDebugUtils.currentLine=40304652;
 //BA.debugLineNum = 40304652;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
RDebugUtils.currentLine=40304653;
 //BA.debugLineNum = 40304653;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=40304659;
 //BA.debugLineNum = 40304659;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bbcodeview._internalbbviewurl  _createbcurlextradata(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "createbcurlextradata", false))
	 {return ((b4j.docU.bbcodeview._internalbbviewurl) Debug.delegate(ba, "createbcurlextradata", null));}
b4j.docU.bbcodeview._internalbbviewurl _t1 = null;
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new b4j.docU.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4j.docU.bblistitem __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4j.objects.JFX _fx = null;
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=39124995;
 //BA.debugLineNum = 39124995;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=39124997;
 //BA.debugLineNum = 39124997;BA.debugLine="Dim sp As ScrollPane";
_sp = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
RDebugUtils.currentLine=39124998;
 //BA.debugLineNum = 39124998;BA.debugLine="sp.Initialize(\"sv\")";
_sp.Initialize(ba,"sv");
RDebugUtils.currentLine=39124999;
 //BA.debugLineNum = 39124999;BA.debugLine="sp.SetHScrollVisibility(\"NEVER\")";
_sp.SetHScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"NEVER"));
RDebugUtils.currentLine=39125008;
 //BA.debugLineNum = 39125008;BA.debugLine="StubScrollView = sp";
__ref._stubscrollview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=39125009;
 //BA.debugLineNum = 39125009;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
__ref._autounderlineurls /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
RDebugUtils.currentLine=39125010;
 //BA.debugLineNum = 39125010;BA.debugLine="ImageViewsCache.Initialize";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=39125011;
 //BA.debugLineNum = 39125011;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/  = _b4xcollections._createorderedmap /*b4j.docU.b4xorderedmap*/ ();
RDebugUtils.currentLine=39125012;
 //BA.debugLineNum = 39125012;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=39125013;
 //BA.debugLineNum = 39125013;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=39125014;
 //BA.debugLineNum = 39125014;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=39125015;
 //BA.debugLineNum = 39125015;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=39125016;
 //BA.debugLineNum = 39125016;BA.debugLine="ParseData.ViewsPanel = mBase";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=39125017;
 //BA.debugLineNum = 39125017;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_linkclicked",(int) (1))) { 
RDebugUtils.currentLine=39125018;
 //BA.debugLineNum = 39125018;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
 };
RDebugUtils.currentLine=39125021;
 //BA.debugLineNum = 39125021;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=39125022;
 //BA.debugLineNum = 39125022;BA.debugLine="ParseData.DefaultBoldFont = fx.CreateFont(Lbl.Fon";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_fx.CreateFont(_lbl.getFont().getFamilyName(),__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize(),__c.True,__c.False).getObject()));
RDebugUtils.currentLine=39125029;
 //BA.debugLineNum = 39125029;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine._bctextrun  _findtouchedrun(b4j.docU.bblistitem __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "findtouchedrun", false))
	 {return ((b4j.docU.bctextengine._bctextrun) Debug.delegate(ba, "findtouchedrun", new Object[] {_x,_y}));}
int _offsetx = 0;
int _offsety = 0;
b4j.docU.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = __ref._mtextengine /*b4j.docU.bctextengine*/ ._findsinglestylesection /*b4j.docU.bctextengine._bcsinglestylesection*/ (null,__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ ,(int) (_x+_offsetx),(int) (_y+_offsety));
RDebugUtils.currentLine=40173572;
 //BA.debugLineNum = 40173572;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
RDebugUtils.currentLine=40173573;
 //BA.debugLineNum = 40173573;BA.debugLine="Return single.Run";
if (true) return _single.Run /*b4j.docU.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
RDebugUtils.currentLine=40173577;
 //BA.debugLineNum = 40173577;BA.debugLine="Return Null";
if (true) return (b4j.docU.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=40173578;
 //BA.debugLineNum = 40173578;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getimageview(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "getimageview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getimageview", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub GetImageView As B4XView";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=39714821;
 //BA.debugLineNum = 39714821;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
RDebugUtils.currentLine=39714823;
 //BA.debugLineNum = 39714823;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size -";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=39714824;
 //BA.debugLineNum = 39714824;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size -";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=39714826;
 //BA.debugLineNum = 39714826;BA.debugLine="mBase.AddView(xiv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_xiv.getObject()),0,0,0,0);
RDebugUtils.currentLine=39714827;
 //BA.debugLineNum = 39714827;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
RDebugUtils.currentLine=39714828;
 //BA.debugLineNum = 39714828;BA.debugLine="Return xiv";
if (true) return _xiv;
RDebugUtils.currentLine=39714829;
 //BA.debugLineNum = 39714829;BA.debugLine="End Sub";
return null;
}
public String  _gettext(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "gettext", false))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bctextengine  _gettextengine(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "gettextengine", false))
	 {return ((b4j.docU.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*b4j.docU.bctextengine*/ ;
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getviews(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "getviews", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getviews", null));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub getViews As Map";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Return ParseData.Views";
if (true) return __ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.bblistitem __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="ParseData.Views.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=38928389;
 //BA.debugLineNum = 38928389;BA.debugLine="ParseData.URLs.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=38928390;
 //BA.debugLineNum = 38928390;BA.debugLine="Padding.Initialize(0, 0, 0, 0)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=38928391;
 //BA.debugLineNum = 38928391;BA.debugLine="ParseData.ImageCache.Initialize";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=38928392;
 //BA.debugLineNum = 38928392;BA.debugLine="URLToLines.Initialize";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=38928393;
 //BA.debugLineNum = 38928393;BA.debugLine="End Sub";
return "";
}
public String  _markurl(b4j.docU.bblistitem __ref,b4j.docU.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "markurl", false))
	 {return ((String) Debug.delegate(ba, "markurl", new Object[] {_run}));}
anywheresoftware.b4j.objects.JFX _fx = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
b4j.docU.bctextengine._bctextrun _r = null;
b4j.docU.bbcodeview._internalbbviewurl _extra = null;
b4j.docU.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="Dim fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="Dim n As Node = mBase";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="If Run = Null Then";
if (_run== null) { 
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="n.MouseCursor = fx.Cursors.DEFAULT";
_n.setMouseCursor(_fx.Cursors.DEFAULT);
 }else {
RDebugUtils.currentLine=40239111;
 //BA.debugLineNum = 40239111;BA.debugLine="n.MouseCursor = fx.Cursors.HAND";
_n.setMouseCursor(_fx.Cursors.HAND);
 };
RDebugUtils.currentLine=40239114;
 //BA.debugLineNum = 40239114;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_r = (b4j.docU.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=40239115;
 //BA.debugLineNum = 40239115;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
RDebugUtils.currentLine=40239116;
 //BA.debugLineNum = 40239116;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
RDebugUtils.currentLine=40239117;
 //BA.debugLineNum = 40239117;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (b4j.docU.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_r)));
RDebugUtils.currentLine=40239118;
 //BA.debugLineNum = 40239118;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group12 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_line = (b4j.docU.bctextengine._bctextline)(group12.Get(index12));
RDebugUtils.currentLine=40239119;
 //BA.debugLineNum = 40239119;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=40239120;
 //BA.debugLineNum = 40239120;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
__ref._mtextengine /*b4j.docU.bctextengine*/ ._drawsingleline /*String*/ (null,_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line)))),__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ );
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=40239125;
 //BA.debugLineNum = 40239125;BA.debugLine="End Sub";
return "";
}
public String  _parentscrolled(b4j.docU.bblistitem __ref,int _scrollviewoffset,int _clvheight,int _offsetinitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "parentscrolled", false))
	 {return ((String) Debug.delegate(ba, "parentscrolled", new Object[] {_scrollviewoffset,_clvheight,_offsetinitem}));}
float _scale = 0f;
int _itemoffset = 0;
int _itemheight = 0;
int _fixeditemoffset = 0;
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Public Sub ParentScrolled(ScrollViewOffset As Int,";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="If Paragraph.IsInitialized And mBase.Parent.IsIni";
if (__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .IsInitialized /*boolean*/  && __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized() && __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getParent().IsInitialized()) { 
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="Dim scale As Float = mTextEngine.mScale";
_scale = __ref._mtextengine /*b4j.docU.bctextengine*/ ._mscale /*float*/ ;
RDebugUtils.currentLine=39583747;
 //BA.debugLineNum = 39583747;BA.debugLine="Dim ItemOffset As Int = mBase.Parent.Parent.Top";
_itemoffset = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getParent().getTop()+_offsetinitem);
RDebugUtils.currentLine=39583748;
 //BA.debugLineNum = 39583748;BA.debugLine="Dim ItemHeight As Int = mBase.Height";
_itemheight = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=39583749;
 //BA.debugLineNum = 39583749;BA.debugLine="If ItemOffset > ScrollViewOffset + CLVHeight Or";
if (_itemoffset>_scrollviewoffset+_clvheight || _itemoffset+_itemheight<_scrollviewoffset) { 
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=39583752;
 //BA.debugLineNum = 39583752;BA.debugLine="Dim FixedItemOffset As Int = Max(0, ScrollViewOf";
_fixeditemoffset = (int) (__c.Max(0,_scrollviewoffset-_itemoffset));
RDebugUtils.currentLine=39583753;
 //BA.debugLineNum = 39583753;BA.debugLine="ItemHeight = Min(ItemHeight - FixedItemOffset, S";
_itemheight = (int) (__c.Min(_itemheight-_fixeditemoffset,_scrollviewoffset+_clvheight-_itemoffset));
RDebugUtils.currentLine=39583754;
 //BA.debugLineNum = 39583754;BA.debugLine="UpdateVisibleRegion(FixedItemOffset * scale, Ite";
__ref._updatevisibleregion /*void*/ (null,(int) (_fixeditemoffset*_scale),(int) (_itemheight*_scale));
 };
RDebugUtils.currentLine=39583756;
 //BA.debugLineNum = 39583756;BA.debugLine="End Sub";
return "";
}
public void  _updatevisibleregion(b4j.docU.bblistitem __ref,int _offsety,int _height) throws Exception{
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "updatevisibleregion", false))
	 {Debug.delegate(ba, "updatevisibleregion", new Object[] {_offsety,_height}); return;}
ResumableSub_UpdateVisibleRegion rsub = new ResumableSub_UpdateVisibleRegion(this,__ref,_offsety,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateVisibleRegion extends BA.ResumableSub {
public ResumableSub_UpdateVisibleRegion(b4j.docU.bblistitem parent,b4j.docU.bblistitem __ref,int _offsety,int _height) {
this.parent = parent;
this.__ref = __ref;
this._offsety = _offsety;
this._height = _height;
this.__ref = parent;
}
b4j.docU.bblistitem __ref;
b4j.docU.bblistitem parent;
int _offsety;
int _height;
int _myrenderindex = 0;
int _mytextindex = 0;
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
b4j.docU.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
b4j.example.bitmapcreator _bc = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bblistitem";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="UpdateOffsetY = OffsetY";
__ref._updateoffsety /*int*/  = _offsety;
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="UpdateHeight = Height";
__ref._updateheight /*int*/  = _height;
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="RenderIndex = RenderIndex + 1";
__ref._renderindex /*int*/  = (int) (__ref._renderindex /*int*/ +1);
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="Dim MyRenderIndex As Int = RenderIndex";
_myrenderindex = __ref._renderindex /*int*/ ;
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="Dim MyTextIndex As Int = TextIndex";
_mytextindex = __ref._textindex /*int*/ ;
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="Do While WaitingForDrawing And MyRenderIndex = Re";
if (true) break;

case 1:
//do while
this.state = 4;
while (__ref._waitingfordrawing /*boolean*/  && _myrenderindex==__ref._renderindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=39649287;
 //BA.debugLineNum = 39649287;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bblistitem", "updatevisibleregion"),(int) (10));
this.state = 41;
return;
case 41:
//C
this.state = 1;
;
 if (true) break;
;
RDebugUtils.currentLine=39649289;
 //BA.debugLineNum = 39649289;BA.debugLine="If MyRenderIndex <> RenderIndex Then Return";

case 4:
//if
this.state = 9;
if (_myrenderindex!=__ref._renderindex /*int*/ ) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=39649290;
 //BA.debugLineNum = 39649290;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
RDebugUtils.currentLine=39649291;
 //BA.debugLineNum = 39649291;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39649292;
 //BA.debugLineNum = 39649292;BA.debugLine="Existing.Initialize";
_existing.Initialize();
RDebugUtils.currentLine=39649293;
 //BA.debugLineNum = 39649293;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=39649294;
 //BA.debugLineNum = 39649294;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
__ref._cleanexistingimageviews /*String*/ (null,parent.__c.True,_existing,_offsety,_height);
RDebugUtils.currentLine=39649295;
 //BA.debugLineNum = 39649295;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
if (true) break;

case 10:
//for
this.state = 40;
group15 = __ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 42;
if (true) break;

case 42:
//C
this.state = 40;
if (index15 < groupLen15) {
this.state = 12;
_line = (b4j.docU.bctextengine._bctextline)(group15.Get(index15));}
if (true) break;

case 43:
//C
this.state = 42;
index15++;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=39649296;
 //BA.debugLineNum = 39649296;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (true) break;

case 13:
//if
this.state = 39;
if (__ref._lineisvisible /*boolean*/ (null,_line,_offsety,_height)) { 
this.state = 15;
}else {
this.state = 32;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=39649297;
 //BA.debugLineNum = 39649297;BA.debugLine="foundFirst = True";
_foundfirst = parent.__c.True;
RDebugUtils.currentLine=39649298;
 //BA.debugLineNum = 39649298;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (true) break;

case 16:
//if
this.state = 19;
if (__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=39649299;
 //BA.debugLineNum = 39649299;BA.debugLine="Continue";
this.state = 43;
if (true) break;;
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=39649301;
 //BA.debugLineNum = 39649301;BA.debugLine="Dim xiv As B4XView = GetImageView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = __ref._getimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=39649302;
 //BA.debugLineNum = 39649302;BA.debugLine="Dim bc As BitmapCreator = mTextEngine.DrawSingl";
_bc = __ref._mtextengine /*b4j.docU.bctextengine*/ ._drawsinglelineasync /*b4j.example.bitmapcreator*/ (null,_line,_xiv,__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ ,parent);
RDebugUtils.currentLine=39649303;
 //BA.debugLineNum = 39649303;BA.debugLine="If bc <> Null Then";
if (true) break;

case 20:
//if
this.state = 30;
if (_bc!= null) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=39649304;
 //BA.debugLineNum = 39649304;BA.debugLine="WaitingForDrawing = True";
__ref._waitingfordrawing /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=39649305;
 //BA.debugLineNum = 39649305;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bblistitem", "updatevisibleregion"), null);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
RDebugUtils.currentLine=39649306;
 //BA.debugLineNum = 39649306;BA.debugLine="WaitingForDrawing = False";
__ref._waitingfordrawing /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=39649307;
 //BA.debugLineNum = 39649307;BA.debugLine="mTextEngine.ReleaseAsyncBC(bc)";
__ref._mtextengine /*b4j.docU.bctextengine*/ ._releaseasyncbc /*String*/ (null,_bc);
RDebugUtils.currentLine=39649308;
 //BA.debugLineNum = 39649308;BA.debugLine="If MyTextIndex <> TextIndex Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_mytextindex!=__ref._textindex /*int*/ ) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=39649309;
 //BA.debugLineNum = 39649309;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
RDebugUtils.currentLine=39649310;
 //BA.debugLineNum = 39649310;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=39649311;
 //BA.debugLineNum = 39649311;BA.debugLine="ImageViewsCache.Add(xiv)";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xiv.getObject()));
RDebugUtils.currentLine=39649312;
 //BA.debugLineNum = 39649312;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=39649314;
 //BA.debugLineNum = 39649314;BA.debugLine="If xui.IsB4J Then";

case 26:
//if
this.state = 29;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=39649315;
 //BA.debugLineNum = 39649315;BA.debugLine="bmp = bc.Bitmap";
_bmp = _bc._getbitmap();
 if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=39649317;
 //BA.debugLineNum = 39649317;BA.debugLine="bmp = bmp.Crop(0, 0, bmp.Width, bmp.Height)";
_bmp = _bmp.Crop((int) (0),(int) (0),(int) (_bmp.getWidth()),(int) (_bmp.getHeight()));
RDebugUtils.currentLine=39649318;
 //BA.debugLineNum = 39649318;BA.debugLine="bc.SetBitmapToImageView(bmp, xiv)";
_bc._setbitmaptoimageview(_bmp,_xiv);
 if (true) break;

case 30:
//C
this.state = 39;
;
RDebugUtils.currentLine=39649320;
 //BA.debugLineNum = 39649320;BA.debugLine="UsedImageViews.Put(Line, xiv)";
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_line),(Object)(_xiv.getObject()));
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=39649322;
 //BA.debugLineNum = 39649322;BA.debugLine="If foundFirst Then Exit";
if (true) break;

case 33:
//if
this.state = 38;
if (_foundfirst) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
this.state = 40;
if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 43;
;
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=39649325;
 //BA.debugLineNum = 39649325;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _parseanddraw(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "parseanddraw", false))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="TextIndex = TextIndex + 1";
__ref._textindex /*int*/  = (int) (__ref._textindex /*int*/ +1);
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="ParseData.URLs.Clear";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=39911429;
 //BA.debugLineNum = 39911429;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="URLToLines.Clear";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=39911431;
 //BA.debugLineNum = 39911431;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=39911432;
 //BA.debugLineNum = 39911432;BA.debugLine="mBase.RemoveAllViews";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=39911433;
 //BA.debugLineNum = 39911433;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=39911434;
 //BA.debugLineNum = 39911434;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,0,0);
 };
RDebugUtils.currentLine=39911436;
 //BA.debugLineNum = 39911436;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (__ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=39911437;
 //BA.debugLineNum = 39911437;BA.debugLine="Runs = ExternalRuns";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ ;
 }else {
RDebugUtils.currentLine=39911439;
 //BA.debugLineNum = 39911439;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._tagparser /*b4j.docU.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ );
 };
RDebugUtils.currentLine=39911442;
 //BA.debugLineNum = 39911442;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=39911443;
 //BA.debugLineNum = 39911443;BA.debugLine="End Sub";
return "";
}
public String  _redraw(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "redraw", false))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
b4j.docU.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createstyle /*b4j.docU.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="Style.Padding = Padding";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=39976963;
 //BA.debugLineNum = 39976963;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=39976964;
 //BA.debugLineNum = 39976964;BA.debugLine="Style.ResizeHeightAutomatically = True";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  = __c.True;
RDebugUtils.currentLine=39976965;
 //BA.debugLineNum = 39976965;BA.debugLine="Style.RTL = RTL";
__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="URLToLines.Clear";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=39976967;
 //BA.debugLineNum = 39976967;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Key";
__ref._cleanexistingimageviews /*String*/ (null,__c.False,__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null),(int) (0),(int) (0));
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="UsedImageViews.Clear";
__ref._usedimageviews /*b4j.docU.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Run";
__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._prepareforlazydrawing /*b4j.docU.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*b4j.docU.bctextengine._bcparagraphstyle*/ ,__ref._stubscrollview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .Height /*int*/ /(double)__ref._mtextengine /*b4j.docU.bctextengine*/ ._mscale /*float*/ +__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=39976971;
 //BA.debugLineNum = 39976971;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (__ref._autounderlineurls /*boolean*/  && __ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=39976972;
 //BA.debugLineNum = 39976972;BA.debugLine="CollectURLs";
__ref._collecturls /*String*/ (null);
RDebugUtils.currentLine=39976973;
 //BA.debugLineNum = 39976973;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group13 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_r = (b4j.docU.bctextengine._bctextrun)(group13.Get(index13));
RDebugUtils.currentLine=39976974;
 //BA.debugLineNum = 39976974;BA.debugLine="r.Underline = False";
_r.Underline /*boolean*/  = __c.False;
 }
};
 };
RDebugUtils.currentLine=39976977;
 //BA.debugLineNum = 39976977;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=39976978;
 //BA.debugLineNum = 39976978;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, mBase.Widt";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=39976980;
 //BA.debugLineNum = 39976980;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4j.docU.bblistitem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "settext", false))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(b4j.docU.bblistitem __ref,b4j.docU.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "settextengine", false))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*b4j.docU.bctextengine*/  = _b;
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=39256069;
 //BA.debugLineNum = 39256069;BA.debugLine="End Sub";
return "";
}
public String  _setviews(b4j.docU.bblistitem __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "setviews", false))
	 {return ((String) Debug.delegate(ba, "setviews", new Object[] {_m}));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Public Sub setViews (m As Map)";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="ParseData.Views = m";
__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_mouseexited(b4j.docU.bblistitem __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "touchpanel_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "touchpanel_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Private Sub TouchPanel_MouseExited (EventData As M";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="If URLToLines.Size > 0 Then";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
 };
RDebugUtils.currentLine=40108036;
 //BA.debugLineNum = 40108036;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4j.docU.bblistitem __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "touchpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
b4j.docU.bctextengine._bctextrun _run = null;
String _url = "";
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="Dim run As BCTextRun = Null";
_run = (b4j.docU.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0 || _action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = __ref._findtouchedrun /*b4j.docU.bctextengine._bctextrun*/ (null,_x,_y);
 };
RDebugUtils.currentLine=40042501;
 //BA.debugLineNum = 40042501;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && __ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
RDebugUtils.currentLine=40042502;
 //BA.debugLineNum = 40042502;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=40042503;
 //BA.debugLineNum = 40042503;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(__ref._parsedata /*b4j.docU.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
RDebugUtils.currentLine=40042504;
 //BA.debugLineNum = 40042504;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked",(Object)(_url));
RDebugUtils.currentLine=40042505;
 //BA.debugLineNum = 40042505;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
 }else 
{RDebugUtils.currentLine=40042506;
 //BA.debugLineNum = 40042506;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && _action==4) || (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && _action==3)) { 
RDebugUtils.currentLine=40042507;
 //BA.debugLineNum = 40042507;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
 }else {
RDebugUtils.currentLine=40042510;
 //BA.debugLineNum = 40042510;BA.debugLine="MarkURL(run)";
__ref._markurl /*String*/ (null,_run);
 }}
;
RDebugUtils.currentLine=40042512;
 //BA.debugLineNum = 40042512;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=40042514;
 //BA.debugLineNum = 40042514;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(b4j.docU.bctextengine._bctextrun)(__c.Null));
RDebugUtils.currentLine=40042515;
 //BA.debugLineNum = 40042515;BA.debugLine="End Sub";
return "";
}
public String  _updatelastvisibleregion(b4j.docU.bblistitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bblistitem";
if (Debug.shouldDelegate(ba, "updatelastvisibleregion", false))
	 {return ((String) Debug.delegate(ba, "updatelastvisibleregion", null));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Public Sub UpdateLastVisibleRegion";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="UpdateVisibleRegion(UpdateOffsetY, UpdateHeight)";
__ref._updatevisibleregion /*void*/ (null,__ref._updateoffsety /*int*/ ,__ref._updateheight /*int*/ );
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="End Sub";
return "";
}
}