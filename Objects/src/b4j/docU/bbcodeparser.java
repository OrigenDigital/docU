package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bbcodeparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.bbcodeparser", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.bbcodeparser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bbcodetextnode{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.List Tags;
public void Initialize() {
IsInitialized = true;
Text = "";
Tags = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bbcodetagnode{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public boolean CanHaveNestedTags;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
CanHaveNestedTags = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bbcodeparsedata{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.Map URLs;
public int Width;
public anywheresoftware.b4a.objects.B4XViewWrapper ViewsPanel;
public anywheresoftware.b4a.objects.collections.Map Views;
public boolean NeedToReparseWhenResize;
public anywheresoftware.b4a.objects.collections.Map ImageCache;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont DefaultBoldFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont DefaultFont;
public int DefaultColor;
public int UrlColor;
public void Initialize() {
IsInitialized = true;
Text = "";
URLs = new anywheresoftware.b4a.objects.collections.Map();
Width = 0;
ViewsPanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Views = new anywheresoftware.b4a.objects.collections.Map();
NeedToReparseWhenResize = false;
ImageCache = new anywheresoftware.b4a.objects.collections.Map();
DefaultBoldFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
DefaultFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
DefaultColor = 0;
UrlColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.docU.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public b4j.docU.bctextengine _mtextengine = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _urlcolor = 0;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
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
public anywheresoftware.b4a.objects.collections.List  _parse(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "parse", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
b4j.docU.bbcodeparser._bbcodetagnode _t = null;
b4j.docU.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=149487616;
 //BA.debugLineNum = 149487616;BA.debugLine="Public Sub Parse (Data As BBCodeParseData) As List";
RDebugUtils.currentLine=149487617;
 //BA.debugLineNum = 149487617;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=149487618;
 //BA.debugLineNum = 149487618;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=149487619;
 //BA.debugLineNum = 149487619;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
RDebugUtils.currentLine=149487620;
 //BA.debugLineNum = 149487620;BA.debugLine="Stack.Initialize";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=149487621;
 //BA.debugLineNum = 149487621;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createtagnode /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null,"noop")));
RDebugUtils.currentLine=149487622;
 //BA.debugLineNum = 149487622;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_data.Text /*String*/ );
RDebugUtils.currentLine=149487623;
 //BA.debugLineNum = 149487623;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=149487624;
 //BA.debugLineNum = 149487624;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
RDebugUtils.currentLine=149487625;
 //BA.debugLineNum = 149487625;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
RDebugUtils.currentLine=149487626;
 //BA.debugLineNum = 149487626;BA.debugLine="Start = matcher.GetStart(0)";
__ref._start /*int*/  = _matcher.GetStart((int) (0));
RDebugUtils.currentLine=149487627;
 //BA.debugLineNum = 149487627;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (__ref._start /*int*/ >_lastmatchend && _skipuntilendtag==__c.False) { 
RDebugUtils.currentLine=149487628;
 //BA.debugLineNum = 149487628;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.Sub";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
RDebugUtils.currentLine=149487630;
 //BA.debugLineNum = 149487630;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
RDebugUtils.currentLine=149487631;
 //BA.debugLineNum = 149487631;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
RDebugUtils.currentLine=149487632;
 //BA.debugLineNum = 149487632;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
RDebugUtils.currentLine=149487633;
 //BA.debugLineNum = 149487633;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((__ref._stackpeek /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null).Tag /*String*/ ).equals(_tag) == false) { 
RDebugUtils.currentLine=149487634;
 //BA.debugLineNum = 149487634;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (__ref._stackpeek /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=149487635;
 //BA.debugLineNum = 149487635;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=149487637;
 //BA.debugLineNum = 149487637;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
__ref._error /*String*/ (null,"Closing tag does not match: "+_tag);
RDebugUtils.currentLine=149487638;
 //BA.debugLineNum = 149487638;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=149487640;
 //BA.debugLineNum = 149487640;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
RDebugUtils.currentLine=149487641;
 //BA.debugLineNum = 149487641;BA.debugLine="If Start > LastMatchEnd Then";
if (__ref._start /*int*/ >_lastmatchend) { 
RDebugUtils.currentLine=149487642;
 //BA.debugLineNum = 149487642;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.S";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,__ref._start /*int*/ ))));
 };
 };
RDebugUtils.currentLine=149487645;
 //BA.debugLineNum = 149487645;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
RDebugUtils.currentLine=149487646;
 //BA.debugLineNum = 149487646;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
RDebugUtils.currentLine=149487648;
 //BA.debugLineNum = 149487648;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (__ref._stackpeek /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=149487649;
 //BA.debugLineNum = 149487649;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
RDebugUtils.currentLine=149487650;
 //BA.debugLineNum = 149487650;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
RDebugUtils.currentLine=149487651;
 //BA.debugLineNum = 149487651;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
RDebugUtils.currentLine=149487652;
 //BA.debugLineNum = 149487652;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else 
{RDebugUtils.currentLine=149487653;
 //BA.debugLineNum = 149487653;BA.debugLine="Else If tag = \"*\" Then";
if ((_tag).equals("*")) { 
RDebugUtils.currentLine=149487654;
 //BA.debugLineNum = 149487654;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 }}
;
RDebugUtils.currentLine=149487656;
 //BA.debugLineNum = 149487656;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
RDebugUtils.currentLine=149487657;
 //BA.debugLineNum = 149487657;BA.debugLine="Dim t As BBCodeTagNode = ParseTag(tag)";
_t = __ref._parsetag /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null,_tag);
RDebugUtils.currentLine=149487658;
 //BA.debugLineNum = 149487658;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (__ref._allowedtags /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_t.Tag /*String*/ ))==__c.False) { 
RDebugUtils.currentLine=149487659;
 //BA.debugLineNum = 149487659;BA.debugLine="Error(\"Invalid tag: \" & tag)";
__ref._error /*String*/ (null,"Invalid tag: "+_tag);
RDebugUtils.currentLine=149487660;
 //BA.debugLineNum = 149487660;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=149487662;
 //BA.debugLineNum = 149487662;BA.debugLine="StackPush(t)";
__ref._stackpush /*String*/ (null,_t);
RDebugUtils.currentLine=149487663;
 //BA.debugLineNum = 149487663;BA.debugLine="If t.Tag = \"plain\" Then";
if ((_t.Tag /*String*/ ).equals("plain")) { 
RDebugUtils.currentLine=149487664;
 //BA.debugLineNum = 149487664;BA.debugLine="Dim n As BBCodeTagNode = StackPeek";
_n = __ref._stackpeek /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null);
RDebugUtils.currentLine=149487665;
 //BA.debugLineNum = 149487665;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
RDebugUtils.currentLine=149487666;
 //BA.debugLineNum = 149487666;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
RDebugUtils.currentLine=149487668;
 //BA.debugLineNum = 149487668;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
RDebugUtils.currentLine=149487669;
 //BA.debugLineNum = 149487669;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.bbcodeparser._bbcodetextnode*/ (null,"")));
RDebugUtils.currentLine=149487670;
 //BA.debugLineNum = 149487670;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
 };
 };
RDebugUtils.currentLine=149487673;
 //BA.debugLineNum = 149487673;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=149487675;
 //BA.debugLineNum = 149487675;BA.debugLine="If Data.Text.Length > LastMatchEnd Then";
if (_data.Text /*String*/ .length()>_lastmatchend) { 
RDebugUtils.currentLine=149487676;
 //BA.debugLineNum = 149487676;BA.debugLine="ParsedElements.Add(CreateTextNode(Data.Text.SubS";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.bbcodeparser._bbcodetextnode*/ (null,_data.Text /*String*/ .substring(_lastmatchend,_data.Text /*String*/ .length()))));
 };
RDebugUtils.currentLine=149487678;
 //BA.debugLineNum = 149487678;BA.debugLine="Return ParsedElements";
if (true) return _parsedelements;
RDebugUtils.currentLine=149487679;
 //BA.debugLineNum = 149487679;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createruns(b4j.docU.bbcodeparser __ref,anywheresoftware.b4a.objects.collections.List _texts,b4j.docU.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createruns", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createruns", new Object[] {_texts,_data}));}
anywheresoftware.b4a.objects.collections.List _runs = null;
b4j.docU.bbcodeparser._bbcodetextnode _textnode = null;
RDebugUtils.currentLine=150011904;
 //BA.debugLineNum = 150011904;BA.debugLine="Public Sub CreateRuns (Texts As List, Data As BBCo";
RDebugUtils.currentLine=150011905;
 //BA.debugLineNum = 150011905;BA.debugLine="Dim Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150011906;
 //BA.debugLineNum = 150011906;BA.debugLine="Runs.Initialize";
_runs.Initialize();
RDebugUtils.currentLine=150011907;
 //BA.debugLineNum = 150011907;BA.debugLine="For Each TextNode As BBCodeTextNode In Texts";
{
final anywheresoftware.b4a.BA.IterableList group3 = _texts;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_textnode = (b4j.docU.bbcodeparser._bbcodetextnode)(group3.Get(index3));
RDebugUtils.currentLine=150011908;
 //BA.debugLineNum = 150011908;BA.debugLine="TextToRun(TextNode, Runs, Data)";
__ref._texttorun /*String*/ (null,_textnode,_runs,_data);
 }
};
RDebugUtils.currentLine=150011910;
 //BA.debugLineNum = 150011910;BA.debugLine="Return Runs";
if (true) return _runs;
RDebugUtils.currentLine=150011911;
 //BA.debugLineNum = 150011911;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
RDebugUtils.currentLine=149356544;
 //BA.debugLineNum = 149356544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=149356545;
 //BA.debugLineNum = 149356545;BA.debugLine="Type BBCodeTextNode (Text As String, Tags As List";
;
RDebugUtils.currentLine=149356546;
 //BA.debugLineNum = 149356546;BA.debugLine="Type BBCodeTagNode (Tag As String, Extra As Map,";
;
RDebugUtils.currentLine=149356547;
 //BA.debugLineNum = 149356547;BA.debugLine="Type BBCodeParseData (Text As String, URLs As Map";
;
RDebugUtils.currentLine=149356549;
 //BA.debugLineNum = 149356549;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new b4j.docU.b4xset();
RDebugUtils.currentLine=149356550;
 //BA.debugLineNum = 149356550;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=149356551;
 //BA.debugLineNum = 149356551;BA.debugLine="Private Start As Int";
_start = 0;
RDebugUtils.currentLine=149356552;
 //BA.debugLineNum = 149356552;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new b4j.docU.bctextengine();
RDebugUtils.currentLine=149356553;
 //BA.debugLineNum = 149356553;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=149356554;
 //BA.debugLineNum = 149356554;BA.debugLine="Public UrlColor As Int = 0xFF003FFF";
_urlcolor = ((int)0xff003fff);
RDebugUtils.currentLine=149356555;
 //BA.debugLineNum = 149356555;BA.debugLine="Public ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=149356556;
 //BA.debugLineNum = 149356556;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=149356558;
 //BA.debugLineNum = 149356558;BA.debugLine="End Sub";
return "";
}
public String  _texttorun(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetextnode _text,anywheresoftware.b4a.objects.collections.List _runslist,b4j.docU.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "texttorun", true))
	 {return ((String) Debug.delegate(ba, "texttorun", new Object[] {_text,_runslist,_data}));}
anywheresoftware.b4a.objects.collections.List _list = null;
b4j.docU.bctextengine._bctextrun _run = null;
boolean _customfont = false;
int _fontsize = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _currentfont = null;
boolean _islistelement = false;
int _i = 0;
b4j.docU.bbcodeparser._bbcodetagnode _tag = null;
b4j.docU.bctextengine._bcstyledunderline _uu = null;
String _url = "";
String _clr = "";
String _name = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _newfont = null;
b4j.docU.bctextengine._bctextrun _parent = null;
b4j.docU.bctextengine._bcconnectedruns _cr = null;
String _dir = "";
RDebugUtils.currentLine=150077440;
 //BA.debugLineNum = 150077440;BA.debugLine="Private Sub TextToRun (Text As BBCodeTextNode, Run";
RDebugUtils.currentLine=150077441;
 //BA.debugLineNum = 150077441;BA.debugLine="Dim list As List = RunsList";
_list = new anywheresoftware.b4a.objects.collections.List();
_list = _runslist;
RDebugUtils.currentLine=150077442;
 //BA.debugLineNum = 150077442;BA.debugLine="Dim Run As BCTextRun = mTextEngine.CreateRun(Text";
_run = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createrun /*b4j.docU.bctextengine._bctextrun*/ (null,_text.Text /*String*/ );
RDebugUtils.currentLine=150077443;
 //BA.debugLineNum = 150077443;BA.debugLine="Run.TextColor = Data.DefaultColor";
_run.TextColor /*int*/  = _data.DefaultColor /*int*/ ;
RDebugUtils.currentLine=150077444;
 //BA.debugLineNum = 150077444;BA.debugLine="Run.TextFont = Data.DefaultFont";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=150077445;
 //BA.debugLineNum = 150077445;BA.debugLine="Dim customfont As Boolean";
_customfont = false;
RDebugUtils.currentLine=150077446;
 //BA.debugLineNum = 150077446;BA.debugLine="Dim FontSize As Int = Data.DefaultFont.Size";
_fontsize = (int) (_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
RDebugUtils.currentLine=150077447;
 //BA.debugLineNum = 150077447;BA.debugLine="Dim CurrentFont As B4XFont = Data.DefaultFont";
_currentfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_currentfont = _data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=150077448;
 //BA.debugLineNum = 150077448;BA.debugLine="Dim IsListElement As Boolean";
_islistelement = false;
RDebugUtils.currentLine=150077449;
 //BA.debugLineNum = 150077449;BA.debugLine="For i = 0 To Text.Tags.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=150077450;
 //BA.debugLineNum = 150077450;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4j.docU.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=150077451;
 //BA.debugLineNum = 150077451;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"u","b","url","color","img","view","vertical","textsize","font","alignment","span","indent","list","*","e","direction","fontawesome","materialicons","a")) {
case 0: {
RDebugUtils.currentLine=150077453;
 //BA.debugLineNum = 150077453;BA.debugLine="Run.Underline = True";
_run.Underline /*boolean*/  = __c.True;
RDebugUtils.currentLine=150077454;
 //BA.debugLineNum = 150077454;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=150077455;
 //BA.debugLineNum = 150077455;BA.debugLine="Dim uu As BCStyledUnderline";
_uu = new b4j.docU.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=150077456;
 //BA.debugLineNum = 150077456;BA.debugLine="uu.Initialize";
_uu.Initialize();
RDebugUtils.currentLine=150077457;
 //BA.debugLineNum = 150077457;BA.debugLine="uu.Style = tag.Extra.GetDefault(\"style\", mTex";
_uu.Style /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)(__ref._mtextengine /*b4j.docU.bctextengine*/ ._defaultunderlinestyle /*b4j.docU.bctextengine._bcstyledunderline*/ .Style /*String*/ )));
RDebugUtils.currentLine=150077458;
 //BA.debugLineNum = 150077458;BA.debugLine="uu.Style = uu.Style.ToLowerCase";
_uu.Style /*String*/  = _uu.Style /*String*/ .toLowerCase();
RDebugUtils.currentLine=150077459;
 //BA.debugLineNum = 150077459;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then uu.Clr";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_uu.Clr /*int*/  = __ref._parsecolorstring /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color"))));}
else {
_uu.Clr /*int*/  = (int) (0);};
RDebugUtils.currentLine=150077460;
 //BA.debugLineNum = 150077460;BA.debugLine="uu.Thickness = DipToCurrent(tag.Extra.GetDefa";
_uu.Thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("thickness"),(Object)(1))))));
RDebugUtils.currentLine=150077461;
 //BA.debugLineNum = 150077461;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.E";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=150077462;
 //BA.debugLineNum = 150077462;BA.debugLine="Run.Extra.Put(mTextEngine.EXTRA_STYLEDUNDERLI";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._mtextengine /*b4j.docU.bctextengine*/ ._extra_styledunderline /*String*/ ),(Object)(_uu));
 };
 break; }
case 1: {
RDebugUtils.currentLine=150077465;
 //BA.debugLineNum = 150077465;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=150077466;
 //BA.debugLineNum = 150077466;BA.debugLine="CurrentFont = Data.DefaultBoldFont";
_currentfont = _data.DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=150077468;
 //BA.debugLineNum = 150077468;BA.debugLine="Dim url As String";
_url = "";
RDebugUtils.currentLine=150077469;
 //BA.debugLineNum = 150077469;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=150077470;
 //BA.debugLineNum = 150077470;BA.debugLine="url = tag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
 }else {
RDebugUtils.currentLine=150077472;
 //BA.debugLineNum = 150077472;BA.debugLine="url = Text.Text";
_url = _text.Text /*String*/ ;
RDebugUtils.currentLine=150077473;
 //BA.debugLineNum = 150077473;BA.debugLine="Run.TextDirection = mTextEngine.TextDirection";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._textdirectionltr /*int*/ ;
 };
RDebugUtils.currentLine=150077475;
 //BA.debugLineNum = 150077475;BA.debugLine="If Data.URLs.IsInitialized Then Data.URLs.Put(";
if (_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_data.URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_run),(Object)(_url));};
RDebugUtils.currentLine=150077476;
 //BA.debugLineNum = 150077476;BA.debugLine="Run.AutoUnderline = True";
_run.AutoUnderline /*boolean*/  = __c.True;
RDebugUtils.currentLine=150077477;
 //BA.debugLineNum = 150077477;BA.debugLine="Run.TextColor = Bit.Or(0xff000000, UrlColor)";
_run.TextColor /*int*/  = __c.Bit.Or(((int)0xff000000),__ref._urlcolor /*int*/ );
 break; }
case 3: {
RDebugUtils.currentLine=150077479;
 //BA.debugLineNum = 150077479;BA.debugLine="Dim clr As String = tag.Extra.Get(\"color\")";
_clr = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")));
RDebugUtils.currentLine=150077480;
 //BA.debugLineNum = 150077480;BA.debugLine="Run.TextColor = ParseColorString(clr)";
_run.TextColor /*int*/  = __ref._parsecolorstring /*int*/ (null,_clr);
 break; }
case 4: {
RDebugUtils.currentLine=150077482;
 //BA.debugLineNum = 150077482;BA.debugLine="SetImageView(tag, Run, Data)";
__ref._setimageview /*void*/ (null,_tag,_run,_data);
RDebugUtils.currentLine=150077483;
 //BA.debugLineNum = 150077483;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
RDebugUtils.currentLine=150077484;
 //BA.debugLineNum = 150077484;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 };
RDebugUtils.currentLine=150077486;
 //BA.debugLineNum = 150077486;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 5: {
RDebugUtils.currentLine=150077488;
 //BA.debugLineNum = 150077488;BA.debugLine="Run.View = GetView(tag, Data)";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._getview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_tag,_data);
RDebugUtils.currentLine=150077489;
 //BA.debugLineNum = 150077489;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=150077490;
 //BA.debugLineNum = 150077490;BA.debugLine="If tag.Extra.ContainsKey(\"width\") Then Run.Vie";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data));};
RDebugUtils.currentLine=150077491;
 //BA.debugLineNum = 150077491;BA.debugLine="If tag.Extra.ContainsKey(\"height\") Then Run.Vi";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data));};
RDebugUtils.currentLine=150077492;
 //BA.debugLineNum = 150077492;BA.debugLine="Data.ViewsPanel.AddView(Run.View, 0, 0, Run.Vi";
_data.ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 6: {
RDebugUtils.currentLine=150077494;
 //BA.debugLineNum = 150077494;BA.debugLine="Run.VerticalOffset = GetDimensionFromTag(tag,";
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);
 break; }
case 7: {
RDebugUtils.currentLine=150077496;
 //BA.debugLineNum = 150077496;BA.debugLine="FontSize = tag.Extra.Get(\"textsize\")";
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
 break; }
case 8: {
RDebugUtils.currentLine=150077498;
 //BA.debugLineNum = 150077498;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=150077499;
 //BA.debugLineNum = 150077499;BA.debugLine="Dim name As String = tag.Extra.Get(tag.Tag)";
_name = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )));
RDebugUtils.currentLine=150077500;
 //BA.debugLineNum = 150077500;BA.debugLine="If mTextEngine.CustomFonts.ContainsKey(name) =";
if (__ref._mtextengine /*b4j.docU.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_name))==__c.False) { 
RDebugUtils.currentLine=150077501;
 //BA.debugLineNum = 150077501;BA.debugLine="Log(\"Font missing from TextEngine.CustomFonts";
__c.LogImpl("9150077501","Font missing from TextEngine.CustomFonts: "+_name,0);
 }else {
RDebugUtils.currentLine=150077503;
 //BA.debugLineNum = 150077503;BA.debugLine="Dim NewFont As B4XFont =  mTextEngine.CustomF";
_newfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_newfont = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(__ref._mtextengine /*b4j.docU.bctextengine*/ ._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_name))));
RDebugUtils.currentLine=150077504;
 //BA.debugLineNum = 150077504;BA.debugLine="CurrentFont = NewFont";
_currentfont = _newfont;
RDebugUtils.currentLine=150077505;
 //BA.debugLineNum = 150077505;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSiz";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 };
 break; }
case 9: {
RDebugUtils.currentLine=150077508;
 //BA.debugLineNum = 150077508;BA.debugLine="Run.HorizontalAlignment = tag.Extra.Get(\"align";
_run.HorizontalAlignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment")));
 break; }
case 10: {
RDebugUtils.currentLine=150077510;
 //BA.debugLineNum = 150077510;BA.debugLine="If tag.Extra.ContainsKey(\"run\") = False Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("run"))==__c.False) { 
RDebugUtils.currentLine=150077511;
 //BA.debugLineNum = 150077511;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateC";
_parent = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createconnectedparent /*b4j.docU.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=150077512;
 //BA.debugLineNum = 150077512;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(";
_cr = (b4j.docU.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4j.docU.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=150077513;
 //BA.debugLineNum = 150077513;BA.debugLine="cr.ConnectedWidth = GetDimensionFromTag(tag,";
_cr.ConnectedWidth /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"minwidth",_data);
RDebugUtils.currentLine=150077514;
 //BA.debugLineNum = 150077514;BA.debugLine="cr.Alignment = tag.Extra.GetDefault(\"alignmen";
_cr.Alignment /*String*/  = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("alignment"),(Object)("left")));
RDebugUtils.currentLine=150077515;
 //BA.debugLineNum = 150077515;BA.debugLine="RunsList.Add(parent)";
_runslist.Add((Object)(_parent));
RDebugUtils.currentLine=150077516;
 //BA.debugLineNum = 150077516;BA.debugLine="tag.Extra.Put(\"run\", parent)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("run"),(Object)(_parent));
 };
RDebugUtils.currentLine=150077518;
 //BA.debugLineNum = 150077518;BA.debugLine="Dim parent As BCTextRun = tag.Extra.Get(\"run\")";
_parent = (b4j.docU.bctextengine._bctextrun)(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("run")));
RDebugUtils.currentLine=150077519;
 //BA.debugLineNum = 150077519;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4j.docU.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4j.docU.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=150077520;
 //BA.debugLineNum = 150077520;BA.debugLine="list = cr.Runs";
_list = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
 break; }
case 11: {
RDebugUtils.currentLine=150077522;
 //BA.debugLineNum = 150077522;BA.debugLine="Run.IndentLevel = tag.Extra.Get(\"indent\")";
_run.IndentLevel /*int*/  = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("indent"))));
 break; }
case 12: {
RDebugUtils.currentLine=150077524;
 //BA.debugLineNum = 150077524;BA.debugLine="Run.IndentLevel = Run.IndentLevel + 1";
_run.IndentLevel /*int*/  = (int) (_run.IndentLevel /*int*/ +1);
 break; }
case 13: {
RDebugUtils.currentLine=150077526;
 //BA.debugLineNum = 150077526;BA.debugLine="IsListElement = True";
_islistelement = __c.True;
 break; }
case 14: {
RDebugUtils.currentLine=150077528;
 //BA.debugLineNum = 150077528;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextChars(";
_run.TextChars /*b4j.docU.bctextengine._bctextchars*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createbctextchars /*b4j.docU.bctextengine._bctextchars*/ (null,new String[]{BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))},(int) (0),(int) (1));
RDebugUtils.currentLine=150077529;
 //BA.debugLineNum = 150077529;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
 break; }
case 15: {
RDebugUtils.currentLine=150077531;
 //BA.debugLineNum = 150077531;BA.debugLine="Dim dir As String = tag.Extra.Get(\"direction\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("direction")));
RDebugUtils.currentLine=150077532;
 //BA.debugLineNum = 150077532;BA.debugLine="Select dir.ToLowerCase";
switch (BA.switchObjectToInt(_dir.toLowerCase(),"ltr","rtl","unknown")) {
case 0: {
RDebugUtils.currentLine=150077534;
 //BA.debugLineNum = 150077534;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._textdirectionltr /*int*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=150077536;
 //BA.debugLineNum = 150077536;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._textdirectionrtl /*int*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=150077538;
 //BA.debugLineNum = 150077538;BA.debugLine="Run.TextDirection = mTextEngine.TextDirectio";
_run.TextDirection /*int*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._textdirectionunknown /*int*/ ;
 break; }
}
;
 break; }
case 16: 
case 17: {
RDebugUtils.currentLine=150077541;
 //BA.debugLineNum = 150077541;BA.debugLine="customfont = True";
_customfont = __c.True;
RDebugUtils.currentLine=150077542;
 //BA.debugLineNum = 150077542;BA.debugLine="If tag.Tag = \"fontawesome\" Then";
if ((_tag.Tag /*String*/ ).equals("fontawesome")) { 
RDebugUtils.currentLine=150077543;
 //BA.debugLineNum = 150077543;BA.debugLine="CurrentFont = xui.CreateFontAwesome(FontSize)";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome((float) (_fontsize));
 }else {
RDebugUtils.currentLine=150077545;
 //BA.debugLineNum = 150077545;BA.debugLine="CurrentFont = xui.CreateMaterialIcons(FontSiz";
_currentfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (_fontsize));
 };
RDebugUtils.currentLine=150077547;
 //BA.debugLineNum = 150077547;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4j.docU.bctextengine._bctextchars*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createbctextcharsfromstring /*b4j.docU.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(__ref._parsecodepoint /*int*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_tag.Tag /*String*/ )))))));
RDebugUtils.currentLine=150077548;
 //BA.debugLineNum = 150077548;BA.debugLine="If tag.Extra.ContainsKey(\"vertical\") Then Run.";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("vertical"))) { 
_run.VerticalOffset /*int*/  = __ref._getdimensionfromtag /*int*/ (null,_tag,"vertical",_data);};
RDebugUtils.currentLine=150077549;
 //BA.debugLineNum = 150077549;BA.debugLine="If tag.Extra.ContainsKey(\"size\") Then FontSize";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("size"))) { 
_fontsize = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("size"))));};
 break; }
case 18: {
RDebugUtils.currentLine=150077551;
 //BA.debugLineNum = 150077551;BA.debugLine="If Run.Extra.IsInitialized = False Then Run.Ex";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=150077552;
 //BA.debugLineNum = 150077552;BA.debugLine="Run.Extra.Put(\"a\", tag.Extra.Get(\"a\"))";
_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a")));
 break; }
}
;
 }
};
RDebugUtils.currentLine=150077555;
 //BA.debugLineNum = 150077555;BA.debugLine="If IsListElement Then";
if (_islistelement) { 
RDebugUtils.currentLine=150077556;
 //BA.debugLineNum = 150077556;BA.debugLine="Run = HandleListElement(Text, Run)";
_run = __ref._handlelistelement /*b4j.docU.bctextengine._bctextrun*/ (null,_text,_run);
 };
RDebugUtils.currentLine=150077558;
 //BA.debugLineNum = 150077558;BA.debugLine="If customfont Or FontSize <> Data.DefaultFont.Siz";
if (_customfont || _fontsize!=_data.DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize()) { 
RDebugUtils.currentLine=150077571;
 //BA.debugLineNum = 150077571;BA.debugLine="Run.TextFont = xui.CreateFont2(CurrentFont, Font";
_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(_currentfont,(float) (_fontsize));
 };
RDebugUtils.currentLine=150077574;
 //BA.debugLineNum = 150077574;BA.debugLine="list.Add(Run)";
_list.Add((Object)(_run));
RDebugUtils.currentLine=150077575;
 //BA.debugLineNum = 150077575;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bbcodeparser._bbcodetagnode  _createtagnode(b4j.docU.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtagnode", true))
	 {return ((b4j.docU.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "createtagnode", new Object[] {_tag}));}
b4j.docU.bbcodeparser._bbcodetagnode _n = null;
RDebugUtils.currentLine=149946368;
 //BA.debugLineNum = 149946368;BA.debugLine="Private Sub CreateTagNode (Tag As String) As BBCod";
RDebugUtils.currentLine=149946369;
 //BA.debugLineNum = 149946369;BA.debugLine="Dim n As BBCodeTagNode";
_n = new b4j.docU.bbcodeparser._bbcodetagnode();
RDebugUtils.currentLine=149946370;
 //BA.debugLineNum = 149946370;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=149946371;
 //BA.debugLineNum = 149946371;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
RDebugUtils.currentLine=149946372;
 //BA.debugLineNum = 149946372;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
RDebugUtils.currentLine=149946373;
 //BA.debugLineNum = 149946373;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=149946374;
 //BA.debugLineNum = 149946374;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bbcodeparser._bbcodetextnode  _createtextnode(b4j.docU.bbcodeparser __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "createtextnode", true))
	 {return ((b4j.docU.bbcodeparser._bbcodetextnode) Debug.delegate(ba, "createtextnode", new Object[] {_text}));}
b4j.docU.bbcodeparser._bbcodetextnode _n = null;
RDebugUtils.currentLine=149880832;
 //BA.debugLineNum = 149880832;BA.debugLine="Private Sub CreateTextNode(Text As String) As BBCo";
RDebugUtils.currentLine=149880833;
 //BA.debugLineNum = 149880833;BA.debugLine="Dim n As BBCodeTextNode";
_n = new b4j.docU.bbcodeparser._bbcodetextnode();
RDebugUtils.currentLine=149880834;
 //BA.debugLineNum = 149880834;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=149880835;
 //BA.debugLineNum = 149880835;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
RDebugUtils.currentLine=149880836;
 //BA.debugLineNum = 149880836;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=149880837;
 //BA.debugLineNum = 149880837;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=149880838;
 //BA.debugLineNum = 149880838;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=149880839;
 //BA.debugLineNum = 149880839;BA.debugLine="End Sub";
return null;
}
public String  _error(b4j.docU.bbcodeparser __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "error", true))
	 {return ((String) Debug.delegate(ba, "error", new Object[] {_msg}));}
String _s = "";
RDebugUtils.currentLine=149815296;
 //BA.debugLineNum = 149815296;BA.debugLine="Private Sub Error (msg As String)";
RDebugUtils.currentLine=149815297;
 //BA.debugLineNum = 149815297;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(__ref._start /*int*/ ))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
RDebugUtils.currentLine=149815301;
 //BA.debugLineNum = 149815301;BA.debugLine="LogError(s)";
__c.LogError(_s);
RDebugUtils.currentLine=149815303;
 //BA.debugLineNum = 149815303;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_s).Append(__c.CRLF);
RDebugUtils.currentLine=149815304;
 //BA.debugLineNum = 149815304;BA.debugLine="End Sub";
return "";
}
public int  _getdimensionfromtag(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetagnode _tag,String _key,b4j.docU.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getdimensionfromtag", true))
	 {return ((Integer) Debug.delegate(ba, "getdimensionfromtag", new Object[] {_tag,_key,_data}));}
String _s = "";
int _i = 0;
float _v = 0f;
RDebugUtils.currentLine=150339584;
 //BA.debugLineNum = 150339584;BA.debugLine="Private Sub GetDimensionFromTag (Tag As BBCodeTagN";
RDebugUtils.currentLine=150339585;
 //BA.debugLineNum = 150339585;BA.debugLine="Dim s As String = Tag.Extra.GetDefault(Key, \"\")";
_s = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_key),(Object)("")));
RDebugUtils.currentLine=150339586;
 //BA.debugLineNum = 150339586;BA.debugLine="If s = \"\" Then Return -1";
if ((_s).equals("")) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=150339587;
 //BA.debugLineNum = 150339587;BA.debugLine="Dim i As Int = s.IndexOf(\"%\")";
_i = _s.indexOf("%");
RDebugUtils.currentLine=150339588;
 //BA.debugLineNum = 150339588;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=150339589;
 //BA.debugLineNum = 150339589;BA.debugLine="Dim v As Float = s.SubString2(0, i) / 100";
_v = (float) ((double)(Double.parseDouble(_s.substring((int) (0),_i)))/(double)100);
RDebugUtils.currentLine=150339590;
 //BA.debugLineNum = 150339590;BA.debugLine="If s.EndsWith(\"%x\") Then";
if (_s.endsWith("%x")) { 
RDebugUtils.currentLine=150339591;
 //BA.debugLineNum = 150339591;BA.debugLine="Data.NeedToReparseWhenResize = True";
_data.NeedToReparseWhenResize /*boolean*/  = __c.True;
RDebugUtils.currentLine=150339592;
 //BA.debugLineNum = 150339592;BA.debugLine="Return v * Data.Width";
if (true) return (int) (_v*_data.Width /*int*/ );
 };
 };
RDebugUtils.currentLine=150339595;
 //BA.debugLineNum = 150339595;BA.debugLine="Return DipToCurrent(s)";
if (true) return __c.DipToCurrent((int)(Double.parseDouble(_s)));
RDebugUtils.currentLine=150339596;
 //BA.debugLineNum = 150339596;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getview(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetagnode _tag,b4j.docU.bbcodeparser._bbcodeparsedata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "getview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getview", new Object[] {_tag,_data}));}
String _id = "";
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=150536192;
 //BA.debugLineNum = 150536192;BA.debugLine="Private Sub GetView (Tag As BBCodeTagNode, Data As";
RDebugUtils.currentLine=150536193;
 //BA.debugLineNum = 150536193;BA.debugLine="Dim id As String = Tag.Extra.Get(\"view\")";
_id = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("view")));
RDebugUtils.currentLine=150536194;
 //BA.debugLineNum = 150536194;BA.debugLine="If Data.Views.ContainsKey(id) = False Then";
if (_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_id))==__c.False) { 
RDebugUtils.currentLine=150536195;
 //BA.debugLineNum = 150536195;BA.debugLine="Error(\"Missing view: \" & id)";
__ref._error /*String*/ (null,"Missing view: "+_id);
 };
RDebugUtils.currentLine=150536197;
 //BA.debugLineNum = 150536197;BA.debugLine="Dim v As B4XView = Data.Views.Get(id)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_data.Views /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id))));
RDebugUtils.currentLine=150536198;
 //BA.debugLineNum = 150536198;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=150536199;
 //BA.debugLineNum = 150536199;BA.debugLine="End Sub";
return null;
}
public b4j.docU.bctextengine._bctextrun  _handlelistelement(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetextnode _text,b4j.docU.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((b4j.docU.bctextengine._bctextrun) Debug.delegate(ba, "handlelistelement", new Object[] {_text,_run}));}
int _i = 0;
b4j.docU.bbcodeparser._bbcodetagnode _tag = null;
String _liststyle = "";
int _count = 0;
b4j.docU.bctextengine._bctextrun _parent = null;
b4j.docU.bctextengine._bcconnectedruns _cr = null;
RDebugUtils.currentLine=150274048;
 //BA.debugLineNum = 150274048;BA.debugLine="Private Sub HandleListElement (Text As BBCodeTextN";
RDebugUtils.currentLine=150274049;
 //BA.debugLineNum = 150274049;BA.debugLine="For i = Text.Tags.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=150274050;
 //BA.debugLineNum = 150274050;BA.debugLine="Dim tag As BBCodeTagNode = Text.Tags.Get(i)";
_tag = (b4j.docU.bbcodeparser._bbcodetagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=150274051;
 //BA.debugLineNum = 150274051;BA.debugLine="If tag.Tag = \"list\" Then";
if ((_tag.Tag /*String*/ ).equals("list")) { 
RDebugUtils.currentLine=150274052;
 //BA.debugLineNum = 150274052;BA.debugLine="Dim liststyle As String";
_liststyle = "";
RDebugUtils.currentLine=150274053;
 //BA.debugLineNum = 150274053;BA.debugLine="If tag.extra.IsInitialized Then liststyle = tag";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_liststyle = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("style"),(Object)("unordered")));};
RDebugUtils.currentLine=150274054;
 //BA.debugLineNum = 150274054;BA.debugLine="If liststyle = \"\" Or liststyle.ToLowerCase = \"u";
if ((_liststyle).equals("") || (_liststyle.toLowerCase()).equals("unordered")) { 
RDebugUtils.currentLine=150274055;
 //BA.debugLineNum = 150274055;BA.debugLine="Run.TextChars =  mTextEngine.CreateBCTextChars";
_run.TextChars /*b4j.docU.bctextengine._bctextchars*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createbctextcharsfromstring /*b4j.docU.bctextengine._bctextchars*/ (null,BA.ObjectToString(__c.Chr(((int)0x2022)))+" ");
 }else {
RDebugUtils.currentLine=150274057;
 //BA.debugLineNum = 150274057;BA.debugLine="Dim count As Int = tag.Extra.GetDefault(\"count";
_count = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("count"),(Object)(1))));
RDebugUtils.currentLine=150274058;
 //BA.debugLineNum = 150274058;BA.debugLine="Dim parent As BCTextRun = mTextEngine.CreateCo";
_parent = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createconnectedparent /*b4j.docU.bctextengine._bctextrun*/ (null);
RDebugUtils.currentLine=150274059;
 //BA.debugLineNum = 150274059;BA.debugLine="Run.TextChars = mTextEngine.CreateBCTextCharsF";
_run.TextChars /*b4j.docU.bctextengine._bctextchars*/  = __ref._mtextengine /*b4j.docU.bctextengine*/ ._createbctextcharsfromstring /*b4j.docU.bctextengine._bctextchars*/ (null,BA.NumberToString((_count))+". ");
RDebugUtils.currentLine=150274060;
 //BA.debugLineNum = 150274060;BA.debugLine="Dim cr As BCConnectedRuns = parent.Extra.Get(m";
_cr = (b4j.docU.bctextengine._bcconnectedruns)(_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._mtextengine /*b4j.docU.bctextengine*/ ._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=150274061;
 //BA.debugLineNum = 150274061;BA.debugLine="cr.Runs.Add(Run)";
_cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_run));
RDebugUtils.currentLine=150274062;
 //BA.debugLineNum = 150274062;BA.debugLine="cr.Alignment = \"right\"";
_cr.Alignment /*String*/  = "right";
RDebugUtils.currentLine=150274063;
 //BA.debugLineNum = 150274063;BA.debugLine="cr.ConnectedWidth = mTextEngine.GetFontMetrics";
_cr.ConnectedWidth /*int*/  = (int) (__ref._mtextengine /*b4j.docU.bctextengine*/ ._getfontmetrics /*b4j.docU.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ ).xWidth /*int*/ *3/(double)__ref._mtextengine /*b4j.docU.bctextengine*/ ._mscale /*float*/ );
RDebugUtils.currentLine=150274064;
 //BA.debugLineNum = 150274064;BA.debugLine="parent.IndentLevel = Run.IndentLevel";
_parent.IndentLevel /*int*/  = _run.IndentLevel /*int*/ ;
RDebugUtils.currentLine=150274065;
 //BA.debugLineNum = 150274065;BA.debugLine="Run = parent";
_run = _parent;
RDebugUtils.currentLine=150274066;
 //BA.debugLineNum = 150274066;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=150274067;
 //BA.debugLineNum = 150274067;BA.debugLine="tag.Extra.Put(\"count\", count)";
_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("count"),(Object)(_count));
 };
RDebugUtils.currentLine=150274069;
 //BA.debugLineNum = 150274069;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=150274072;
 //BA.debugLineNum = 150274072;BA.debugLine="Return Run";
if (true) return _run;
RDebugUtils.currentLine=150274073;
 //BA.debugLineNum = 150274073;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.bbcodeparser __ref,anywheresoftware.b4a.BA _ba,b4j.docU.bctextengine _textengine) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_textengine}));}
RDebugUtils.currentLine=149422080;
 //BA.debugLineNum = 149422080;BA.debugLine="Public Sub Initialize (TextEngine As BCTextEngine)";
RDebugUtils.currentLine=149422081;
 //BA.debugLineNum = 149422081;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"b\"";
__ref._allowedtags /*b4j.docU.b4xset*/  = _b4xcollections._createset2 /*b4j.docU.b4xset*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("b"),(Object)("u"),(Object)("url"),(Object)("plain"),(Object)("color"),(Object)("img"),(Object)("view"),(Object)("vertical"),(Object)("textsize"),(Object)("alignment"),(Object)("span"),(Object)("indent"),(Object)("list"),(Object)("*"),(Object)("fontawesome"),(Object)("materialicons"),(Object)("e"),(Object)("font"),(Object)("direction"),(Object)("a")}));
RDebugUtils.currentLine=149422083;
 //BA.debugLineNum = 149422083;BA.debugLine="ColorsMap = CreateMap(\"black\": xui.Color_Black, _";
__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black),(Object)("darkgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_DarkGray),(Object)("gray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray),(Object)("lightgray"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_LightGray),(Object)("white"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White),(Object)("red"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),(Object)("green"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green),(Object)("blue"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue),(Object)("yellow"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Yellow),(Object)("cyan"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan),(Object)("magenta"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta),(Object)("transparent"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent)});
RDebugUtils.currentLine=149422095;
 //BA.debugLineNum = 149422095;BA.debugLine="mTextEngine = TextEngine";
__ref._mtextengine /*b4j.docU.bctextengine*/  = _textengine;
RDebugUtils.currentLine=149422096;
 //BA.debugLineNum = 149422096;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=149422097;
 //BA.debugLineNum = 149422097;BA.debugLine="End Sub";
return "";
}
public String  _internalsetmousetransparent(b4j.docU.bbcodeparser __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "internalsetmousetransparent", true))
	 {return ((String) Debug.delegate(ba, "internalsetmousetransparent", new Object[] {_v}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=150405120;
 //BA.debugLineNum = 150405120;BA.debugLine="Public Sub InternalSetMouseTransparent(v As B4XVie";
RDebugUtils.currentLine=150405121;
 //BA.debugLineNum = 150405121;BA.debugLine="Dim jo As JavaObject = v";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v.getObject()));
RDebugUtils.currentLine=150405122;
 //BA.debugLineNum = 150405122;BA.debugLine="jo.RunMethod(\"setMouseTransparent\", Array(True))";
_jo.RunMethod("setMouseTransparent",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=150405123;
 //BA.debugLineNum = 150405123;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bbcodeparser._bbcodetagnode  _stackpeek(b4j.docU.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpeek", true))
	 {return ((b4j.docU.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "stackpeek", null));}
RDebugUtils.currentLine=149749760;
 //BA.debugLineNum = 149749760;BA.debugLine="Private Sub StackPeek As BBCodeTagNode";
RDebugUtils.currentLine=149749761;
 //BA.debugLineNum = 149749761;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4j.docU.bbcodeparser._bbcodetagnode)(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=149749762;
 //BA.debugLineNum = 149749762;BA.debugLine="End Sub";
return null;
}
public String  _stackpop(b4j.docU.bbcodeparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpop", true))
	 {return ((String) Debug.delegate(ba, "stackpop", null));}
RDebugUtils.currentLine=149618688;
 //BA.debugLineNum = 149618688;BA.debugLine="Private Sub StackPop";
RDebugUtils.currentLine=149618689;
 //BA.debugLineNum = 149618689;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=149618690;
 //BA.debugLineNum = 149618690;BA.debugLine="End Sub";
return "";
}
public b4j.docU.bbcodeparser._bbcodetagnode  _parsetag(b4j.docU.bbcodeparser __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsetag", true))
	 {return ((b4j.docU.bbcodeparser._bbcodetagnode) Debug.delegate(ba, "parsetag", new Object[] {_tag}));}
b4j.docU.bbcodeparser._bbcodetagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
RDebugUtils.currentLine=149553152;
 //BA.debugLineNum = 149553152;BA.debugLine="Private Sub ParseTag (tag As String) As BBCodeTagN";
RDebugUtils.currentLine=149553156;
 //BA.debugLineNum = 149553156;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return __ref._createtagnode /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null,_tag.toLowerCase());};
RDebugUtils.currentLine=149553157;
 //BA.debugLineNum = 149553157;BA.debugLine="Dim res As BBCodeTagNode = CreateTagNode(\"\")";
_res = __ref._createtagnode /*b4j.docU.bbcodeparser._bbcodetagnode*/ (null,"");
RDebugUtils.currentLine=149553158;
 //BA.debugLineNum = 149553158;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=149553159;
 //BA.debugLineNum = 149553159;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=149553160;
 //BA.debugLineNum = 149553160;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
RDebugUtils.currentLine=149553161;
 //BA.debugLineNum = 149553161;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
RDebugUtils.currentLine=149553162;
 //BA.debugLineNum = 149553162;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
RDebugUtils.currentLine=149553163;
 //BA.debugLineNum = 149553163;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
RDebugUtils.currentLine=149553164;
 //BA.debugLineNum = 149553164;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
RDebugUtils.currentLine=149553165;
 //BA.debugLineNum = 149553165;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
RDebugUtils.currentLine=149553166;
 //BA.debugLineNum = 149553166;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=149553168;
 //BA.debugLineNum = 149553168;BA.debugLine="Dim i2 As Int";
_i2 = 0;
RDebugUtils.currentLine=149553169;
 //BA.debugLineNum = 149553169;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=149553170;
 //BA.debugLineNum = 149553170;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
RDebugUtils.currentLine=149553171;
 //BA.debugLineNum = 149553171;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
RDebugUtils.currentLine=149553173;
 //BA.debugLineNum = 149553173;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
RDebugUtils.currentLine=149553174;
 //BA.debugLineNum = 149553174;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
RDebugUtils.currentLine=149553175;
 //BA.debugLineNum = 149553175;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
RDebugUtils.currentLine=149553177;
 //BA.debugLineNum = 149553177;BA.debugLine="i = i2";
_i = _i2;
RDebugUtils.currentLine=149553178;
 //BA.debugLineNum = 149553178;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=149553180;
 //BA.debugLineNum = 149553180;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=149553181;
 //BA.debugLineNum = 149553181;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=149553182;
 //BA.debugLineNum = 149553182;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
RDebugUtils.currentLine=149553183;
 //BA.debugLineNum = 149553183;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=149553185;
 //BA.debugLineNum = 149553185;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=149553187;
 //BA.debugLineNum = 149553187;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=149553189;
 //BA.debugLineNum = 149553189;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=149553190;
 //BA.debugLineNum = 149553190;BA.debugLine="End Sub";
return null;
}
public String  _stackpush(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetagnode _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "stackpush", true))
	 {return ((String) Debug.delegate(ba, "stackpush", new Object[] {_tag}));}
RDebugUtils.currentLine=149684224;
 //BA.debugLineNum = 149684224;BA.debugLine="Private Sub StackPush (Tag As BBCodeTagNode)";
RDebugUtils.currentLine=149684225;
 //BA.debugLineNum = 149684225;BA.debugLine="Stack.Add(Tag)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tag));
RDebugUtils.currentLine=149684226;
 //BA.debugLineNum = 149684226;BA.debugLine="End Sub";
return "";
}
public int  _parsecodepoint(b4j.docU.bbcodeparser __ref,String _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecodepoint", true))
	 {return ((Integer) Debug.delegate(ba, "parsecodepoint", new Object[] {_raw}));}
RDebugUtils.currentLine=150142976;
 //BA.debugLineNum = 150142976;BA.debugLine="Private Sub ParseCodepoint (raw As String) As Int";
RDebugUtils.currentLine=150142977;
 //BA.debugLineNum = 150142977;BA.debugLine="If raw.StartsWith(\"0x\") Then raw = raw.SubString(";
if (_raw.startsWith("0x")) { 
_raw = _raw.substring((int) (2));};
RDebugUtils.currentLine=150142978;
 //BA.debugLineNum = 150142978;BA.debugLine="Return Bit.ParseInt(raw, 16)";
if (true) return __c.Bit.ParseInt(_raw,(int) (16));
RDebugUtils.currentLine=150142979;
 //BA.debugLineNum = 150142979;BA.debugLine="End Sub";
return 0;
}
public int  _parsecolorstring(b4j.docU.bbcodeparser __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "parsecolorstring", true))
	 {return ((Integer) Debug.delegate(ba, "parsecolorstring", new Object[] {_clr}));}
RDebugUtils.currentLine=150208512;
 //BA.debugLineNum = 150208512;BA.debugLine="Private Sub ParseColorString(clr As String) As Int";
RDebugUtils.currentLine=150208513;
 //BA.debugLineNum = 150208513;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
RDebugUtils.currentLine=150208514;
 //BA.debugLineNum = 150208514;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
RDebugUtils.currentLine=150208515;
 //BA.debugLineNum = 150208515;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or(((int)0xff000000),__c.Bit.ParseInt(_clr.substring((int) (1)),(int) (16)));
 }else 
{RDebugUtils.currentLine=150208516;
 //BA.debugLineNum = 150208516;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
if (_clr.startsWith("0x")) { 
RDebugUtils.currentLine=150208517;
 //BA.debugLineNum = 150208517;BA.debugLine="Return Bit.Or(0xff000000, Bit.ParseInt(clr.SubSt";
if (true) return __c.Bit.Or(((int)0xff000000),__c.Bit.ParseInt(_clr.substring((int) (4)),(int) (16)));
 }else 
{RDebugUtils.currentLine=150208518;
 //BA.debugLineNum = 150208518;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
if (__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
RDebugUtils.currentLine=150208519;
 //BA.debugLineNum = 150208519;BA.debugLine="Return ColorsMap.Get(clr)";
if (true) return (int)(BA.ObjectToNumber(__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr))));
 }else {
RDebugUtils.currentLine=150208521;
 //BA.debugLineNum = 150208521;BA.debugLine="Error(\"Invalid color value: \" & clr)";
__ref._error /*String*/ (null,"Invalid color value: "+_clr);
RDebugUtils.currentLine=150208522;
 //BA.debugLineNum = 150208522;BA.debugLine="Return xui.Color_Black";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
 }}}
;
RDebugUtils.currentLine=150208524;
 //BA.debugLineNum = 150208524;BA.debugLine="End Sub";
return 0;
}
public void  _setimageview(b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetagnode _tag,b4j.docU.bctextengine._bctextrun _run,b4j.docU.bbcodeparser._bbcodeparsedata _data) throws Exception{
RDebugUtils.currentModule="bbcodeparser";
if (Debug.shouldDelegate(ba, "setimageview", true))
	 {Debug.delegate(ba, "setimageview", new Object[] {_tag,_run,_data}); return;}
ResumableSub_SetImageView rsub = new ResumableSub_SetImageView(this,__ref,_tag,_run,_data);
rsub.resume(ba, null);
}
public static class ResumableSub_SetImageView extends BA.ResumableSub {
public ResumableSub_SetImageView(b4j.docU.bbcodeparser parent,b4j.docU.bbcodeparser __ref,b4j.docU.bbcodeparser._bbcodetagnode _tag,b4j.docU.bctextengine._bctextrun _run,b4j.docU.bbcodeparser._bbcodeparsedata _data) {
this.parent = parent;
this.__ref = __ref;
this._tag = _tag;
this._run = _run;
this._data = _data;
this.__ref = parent;
}
b4j.docU.bbcodeparser __ref;
b4j.docU.bbcodeparser parent;
b4j.docU.bbcodeparser._bbcodetagnode _tag;
b4j.docU.bctextengine._bctextrun _run;
b4j.docU.bbcodeparser._bbcodeparsedata _data;
String _url = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
b4j.docU.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bbcodeparser";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=150470657;
 //BA.debugLineNum = 150470657;BA.debugLine="Dim url As String = Tag.Extra.GetDefault(\"url\", \"";
_url = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("url"),(Object)("")));
RDebugUtils.currentLine=150470658;
 //BA.debugLineNum = 150470658;BA.debugLine="Dim dir As String = Tag.Extra.GetDefault(\"dir\", F";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("dir"),(Object)(parent.__c.File.getDirAssets())));
RDebugUtils.currentLine=150470659;
 //BA.debugLineNum = 150470659;BA.debugLine="Dim filename As String = Tag.Extra.GetDefault(\"fi";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("filename"),(Object)("")));
RDebugUtils.currentLine=150470660;
 //BA.debugLineNum = 150470660;BA.debugLine="Dim width As Int = GetDimensionFromTag(Tag, \"widt";
_width = __ref._getdimensionfromtag /*int*/ (null,_tag,"width",_data);
RDebugUtils.currentLine=150470661;
 //BA.debugLineNum = 150470661;BA.debugLine="Dim height As Int = GetDimensionFromTag(Tag, \"hei";
_height = __ref._getdimensionfromtag /*int*/ (null,_tag,"height",_data);
RDebugUtils.currentLine=150470662;
 //BA.debugLineNum = 150470662;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=150470663;
 //BA.debugLineNum = 150470663;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=150470665;
 //BA.debugLineNum = 150470665;BA.debugLine="InternalSetMouseTransparent(iv)";
__ref._internalsetmousetransparent /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject())));
RDebugUtils.currentLine=150470667;
 //BA.debugLineNum = 150470667;BA.debugLine="Dim xiv As B4XView = iv";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=150470668;
 //BA.debugLineNum = 150470668;BA.debugLine="run.View = xiv";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xiv;
RDebugUtils.currentLine=150470669;
 //BA.debugLineNum = 150470669;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=150470670;
 //BA.debugLineNum = 150470670;BA.debugLine="If url <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 26;
if ((_url).equals("") == false) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=150470671;
 //BA.debugLineNum = 150470671;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, width, height)";
_xiv.SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=150470672;
 //BA.debugLineNum = 150470672;BA.debugLine="If data.ImageCache.ContainsKey(url) Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_url))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=150470673;
 //BA.debugLineNum = 150470673;BA.debugLine="xiv.SetBitmap(data.ImageCache.Get(url))";
_xiv.SetBitmap((javafx.scene.image.Image)(_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_url))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=150470675;
 //BA.debugLineNum = 150470675;BA.debugLine="Dim j As HttpJob";
_j = new b4j.docU.httpjob();
RDebugUtils.currentLine=150470676;
 //BA.debugLineNum = 150470676;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=150470677;
 //BA.debugLineNum = 150470677;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=150470678;
 //BA.debugLineNum = 150470678;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bbcodeparser", "setimageview"), (Object)(_j));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=150470679;
 //BA.debugLineNum = 150470679;BA.debugLine="If j.Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=150470680;
 //BA.debugLineNum = 150470680;BA.debugLine="bmp = j.GetBitmap";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
RDebugUtils.currentLine=150470681;
 //BA.debugLineNum = 150470681;BA.debugLine="bmp = bmp.Resize(width, height, True)";
_bmp = _bmp.Resize(_width,_height,parent.__c.True);
RDebugUtils.currentLine=150470682;
 //BA.debugLineNum = 150470682;BA.debugLine="data.ImageCache.Put(url, bmp)";
_data.ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_url),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=150470683;
 //BA.debugLineNum = 150470683;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((javafx.scene.image.Image)(_bmp.getObject()));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=150470685;
 //BA.debugLineNum = 150470685;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 13:
//C
this.state = 26;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=150470688;
 //BA.debugLineNum = 150470688;BA.debugLine="If width = -1 And height = -1 Then";
if (true) break;

case 16:
//if
this.state = 25;
if (_width==-1 && _height==-1) { 
this.state = 18;
}else 
{RDebugUtils.currentLine=150470690;
 //BA.debugLineNum = 150470690;BA.debugLine="Else if width > -1 And height > -1 Then";
if (_width>-1 && _height>-1) { 
this.state = 20;
}else 
{RDebugUtils.currentLine=150470692;
 //BA.debugLineNum = 150470692;BA.debugLine="Else if width > -1 Then";
if (_width>-1) { 
this.state = 22;
}else {
this.state = 24;
}}}
if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=150470689;
 //BA.debugLineNum = 150470689;BA.debugLine="bmp = xui.LoadBitmap(dir, filename)";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(_dir,_filename);
 if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=150470691;
 //BA.debugLineNum = 150470691;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,_height,parent.__c.False);
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=150470693;
 //BA.debugLineNum = 150470693;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, width";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,_width,(int) (10000),parent.__c.True);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=150470695;
 //BA.debugLineNum = 150470695;BA.debugLine="bmp = xui.LoadBitmapResize(dir, filename, 10000";
_bmp = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(_dir,_filename,(int) (10000),_height,parent.__c.True);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=150470697;
 //BA.debugLineNum = 150470697;BA.debugLine="xiv.SetBitmap(bmp)";
_xiv.SetBitmap((javafx.scene.image.Image)(_bmp.getObject()));
RDebugUtils.currentLine=150470698;
 //BA.debugLineNum = 150470698;BA.debugLine="xiv.SetLayoutAnimated(0, 0, 0, bmp.Width, bmp.He";
_xiv.SetLayoutAnimated((int) (0),0,0,_bmp.getWidth(),_bmp.getHeight());
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=150470700;
 //BA.debugLineNum = 150470700;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}