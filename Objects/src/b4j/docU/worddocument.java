package b4j.docU;

import anywheresoftware.b4a.debug.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import org.apache.poi.xwpf.usermodel.*;
import java.math.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class worddocument extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.worddocument", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.worddocument.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _wordtagnode{
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
public static class _wordtextnode{
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
public static class _worddocelement{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public anywheresoftware.b4a.objects.collections.List Children;
public anywheresoftware.b4j.object.JavaObject JElement;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
Children = new anywheresoftware.b4a.objects.collections.List();
JElement = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _xwpfdocument = null;
public b4j.docU.wordutils _mwu = null;
public b4j.docU.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.objects.collections.Map _highlightcolorsmap = null;
public boolean _debuglog = false;
public anywheresoftware.b4j.object.JavaObject _jme = null;
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
public String  _setmargins(b4j.docU.worddocument __ref,int _left,int _right,int _top,int _bottom,int _header,int _footer,int _gutter) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "setmargins", true))
	 {return ((String) Debug.delegate(ba, "setmargins", new Object[] {_left,_right,_top,_bottom,_header,_footer,_gutter}));}
RDebugUtils.currentLine=217776128;
 //BA.debugLineNum = 217776128;BA.debugLine="Public Sub SetMargins(Left As Int, Right As Int, T";
RDebugUtils.currentLine=217776129;
 //BA.debugLineNum = 217776129;BA.debugLine="jme.RunMethod(\"SetMargins\", Array(XWPFDocument, L";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("SetMargins",new Object[]{(Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_left),(Object)(_right),(Object)(_top),(Object)(_bottom),(Object)(_footer),(Object)(_header),(Object)(_gutter)});
RDebugUtils.currentLine=217776130;
 //BA.debugLineNum = 217776130;BA.debugLine="End Sub";
return "";
}
public b4j.docU.worddocument  _append(b4j.docU.worddocument __ref,String _bbtext) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.docU.worddocument) Debug.delegate(ba, "append", new Object[] {_bbtext}));}
b4j.docU.worddocument._worddocelement _doc = null;
RDebugUtils.currentLine=216399872;
 //BA.debugLineNum = 216399872;BA.debugLine="Public Sub Append(BBText As String) As WordDocumen";
RDebugUtils.currentLine=216399873;
 //BA.debugLineNum = 216399873;BA.debugLine="Dim doc As WordDocElement = Parse(BBText)";
_doc = __ref._parse /*b4j.docU.worddocument._worddocelement*/ (null,_bbtext);
RDebugUtils.currentLine=216399874;
 //BA.debugLineNum = 216399874;BA.debugLine="HandleElements(doc)";
__ref._handleelements /*String*/ (null,_doc);
RDebugUtils.currentLine=216399875;
 //BA.debugLineNum = 216399875;BA.debugLine="Return Me";
if (true) return (b4j.docU.worddocument)(this);
RDebugUtils.currentLine=216399876;
 //BA.debugLineNum = 216399876;BA.debugLine="End Sub";
return null;
}
public String  _saveas(b4j.docU.worddocument __ref,String _dir,String _filename,boolean _renameifneeded) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "saveas", true))
	 {return ((String) Debug.delegate(ba, "saveas", new Object[] {_dir,_filename,_renameifneeded}));}
String _orig = "";
String _extension = "";
int _i = 0;
String _f = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=216662016;
 //BA.debugLineNum = 216662016;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
RDebugUtils.currentLine=216662017;
 //BA.debugLineNum = 216662017;BA.debugLine="If RenameIfNeeded Then";
if (_renameifneeded) { 
RDebugUtils.currentLine=216662018;
 //BA.debugLineNum = 216662018;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
_orig = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=216662019;
 //BA.debugLineNum = 216662019;BA.debugLine="Dim extension As String";
_extension = "";
RDebugUtils.currentLine=216662020;
 //BA.debugLineNum = 216662020;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
_i = _orig.lastIndexOf(".");
RDebugUtils.currentLine=216662021;
 //BA.debugLineNum = 216662021;BA.debugLine="If i >-1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=216662022;
 //BA.debugLineNum = 216662022;BA.debugLine="extension = orig.SubString(i)";
_extension = _orig.substring(_i);
RDebugUtils.currentLine=216662023;
 //BA.debugLineNum = 216662023;BA.debugLine="orig = orig.SubString2(0, i)";
_orig = _orig.substring((int) (0),_i);
 };
RDebugUtils.currentLine=216662025;
 //BA.debugLineNum = 216662025;BA.debugLine="For i = 0 To 10";
{
final int step9 = 1;
final int limit9 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=216662026;
 //BA.debugLineNum = 216662026;BA.debugLine="Dim f As String";
_f = "";
RDebugUtils.currentLine=216662027;
 //BA.debugLineNum = 216662027;BA.debugLine="Try";
try {RDebugUtils.currentLine=216662028;
 //BA.debugLineNum = 216662028;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
if (_i==0) { 
_f = _orig+_extension;}
else {
_f = _orig+" ("+BA.NumberToString(_i)+")"+_extension;};
RDebugUtils.currentLine=216662029;
 //BA.debugLineNum = 216662029;BA.debugLine="Dim out As OutputStream = File.OpenOutput(f, \"";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_f,"",__c.False);
RDebugUtils.currentLine=216662030;
 //BA.debugLineNum = 216662030;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("write",new Object[]{(Object)(_out.getObject())});
RDebugUtils.currentLine=216662031;
 //BA.debugLineNum = 216662031;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=216662032;
 //BA.debugLineNum = 216662032;BA.debugLine="Return f";
if (true) return _f;
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=216662034;
 //BA.debugLineNum = 216662034;BA.debugLine="Log(\"Failed: \" & f)";
__c.LogImpl("9216662034","Failed: "+_f,0);
 };
 }
};
 };
RDebugUtils.currentLine=216662038;
 //BA.debugLineNum = 216662038;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=216662039;
 //BA.debugLineNum = 216662039;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("write",new Object[]{(Object)(_out.getObject())});
RDebugUtils.currentLine=216662040;
 //BA.debugLineNum = 216662040;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=216662041;
 //BA.debugLineNum = 216662041;BA.debugLine="Return File.Combine(Dir, FileName)";
if (true) return __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=216662042;
 //BA.debugLineNum = 216662042;BA.debugLine="End Sub";
return "";
}
public b4j.docU.worddocument._worddocelement  _parse(b4j.docU.worddocument __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((b4j.docU.worddocument._worddocelement) Debug.delegate(ba, "parse", new Object[] {_text}));}
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
b4j.docU.worddocument._wordtagnode _t = null;
b4j.docU.worddocument._wordtagnode _n = null;
RDebugUtils.currentLine=216727552;
 //BA.debugLineNum = 216727552;BA.debugLine="Private Sub Parse (Text As String) As WordDocEleme";
RDebugUtils.currentLine=216727553;
 //BA.debugLineNum = 216727553;BA.debugLine="ErrorString.Initialize";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=216727554;
 //BA.debugLineNum = 216727554;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=216727555;
 //BA.debugLineNum = 216727555;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
RDebugUtils.currentLine=216727556;
 //BA.debugLineNum = 216727556;BA.debugLine="Stack.Initialize";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=216727557;
 //BA.debugLineNum = 216727557;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createtagnode /*b4j.docU.worddocument._wordtagnode*/ (null,"noop")));
RDebugUtils.currentLine=216727558;
 //BA.debugLineNum = 216727558;BA.debugLine="Text = Text.Replace(CRLF, \"[break/]\")";
_text = _text.replace(__c.CRLF,"[break/]");
RDebugUtils.currentLine=216727559;
 //BA.debugLineNum = 216727559;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_text);
RDebugUtils.currentLine=216727560;
 //BA.debugLineNum = 216727560;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=216727561;
 //BA.debugLineNum = 216727561;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
RDebugUtils.currentLine=216727562;
 //BA.debugLineNum = 216727562;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
RDebugUtils.currentLine=216727563;
 //BA.debugLineNum = 216727563;BA.debugLine="Start = matcher.GetStart(0)";
__ref._start /*int*/  = _matcher.GetStart((int) (0));
RDebugUtils.currentLine=216727564;
 //BA.debugLineNum = 216727564;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (__ref._start /*int*/ >_lastmatchend && _skipuntilendtag==__c.False) { 
RDebugUtils.currentLine=216727565;
 //BA.debugLineNum = 216727565;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStrin";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.worddocument._wordtextnode*/ (null,_text.substring(_lastmatchend,__ref._start /*int*/ ))));
 };
RDebugUtils.currentLine=216727567;
 //BA.debugLineNum = 216727567;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
RDebugUtils.currentLine=216727568;
 //BA.debugLineNum = 216727568;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
RDebugUtils.currentLine=216727569;
 //BA.debugLineNum = 216727569;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
RDebugUtils.currentLine=216727570;
 //BA.debugLineNum = 216727570;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((__ref._stackpeek /*b4j.docU.worddocument._wordtagnode*/ (null).Tag /*String*/ ).equals(_tag) == false) { 
RDebugUtils.currentLine=216727571;
 //BA.debugLineNum = 216727571;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (__ref._stackpeek /*b4j.docU.worddocument._wordtagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=216727572;
 //BA.debugLineNum = 216727572;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=216727574;
 //BA.debugLineNum = 216727574;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
__ref._error /*String*/ (null,"Closing tag does not match: "+_tag);
RDebugUtils.currentLine=216727575;
 //BA.debugLineNum = 216727575;BA.debugLine="Return Null";
if (true) return (b4j.docU.worddocument._worddocelement)(__c.Null);
 };
RDebugUtils.currentLine=216727577;
 //BA.debugLineNum = 216727577;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
RDebugUtils.currentLine=216727578;
 //BA.debugLineNum = 216727578;BA.debugLine="If Start > LastMatchEnd Then";
if (__ref._start /*int*/ >_lastmatchend) { 
RDebugUtils.currentLine=216727579;
 //BA.debugLineNum = 216727579;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStr";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.worddocument._wordtextnode*/ (null,_text.substring(_lastmatchend,__ref._start /*int*/ ))));
 };
 };
RDebugUtils.currentLine=216727582;
 //BA.debugLineNum = 216727582;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
RDebugUtils.currentLine=216727583;
 //BA.debugLineNum = 216727583;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
RDebugUtils.currentLine=216727585;
 //BA.debugLineNum = 216727585;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (__ref._stackpeek /*b4j.docU.worddocument._wordtagnode*/ (null).CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=216727586;
 //BA.debugLineNum = 216727586;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
RDebugUtils.currentLine=216727587;
 //BA.debugLineNum = 216727587;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
RDebugUtils.currentLine=216727588;
 //BA.debugLineNum = 216727588;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
RDebugUtils.currentLine=216727589;
 //BA.debugLineNum = 216727589;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else 
{RDebugUtils.currentLine=216727590;
 //BA.debugLineNum = 216727590;BA.debugLine="Else If tag = \"*\" Then";
if ((_tag).equals("*")) { 
RDebugUtils.currentLine=216727591;
 //BA.debugLineNum = 216727591;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 }}
;
RDebugUtils.currentLine=216727593;
 //BA.debugLineNum = 216727593;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
RDebugUtils.currentLine=216727594;
 //BA.debugLineNum = 216727594;BA.debugLine="Dim t As WordTagNode = ParseTag(tag)";
_t = __ref._parsetag /*b4j.docU.worddocument._wordtagnode*/ (null,_tag);
RDebugUtils.currentLine=216727595;
 //BA.debugLineNum = 216727595;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (__ref._allowedtags /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_t.Tag /*String*/ ))==__c.False) { 
RDebugUtils.currentLine=216727596;
 //BA.debugLineNum = 216727596;BA.debugLine="Error(\"Invalid tag: \" & tag)";
__ref._error /*String*/ (null,"Invalid tag: "+_tag);
RDebugUtils.currentLine=216727597;
 //BA.debugLineNum = 216727597;BA.debugLine="Return Null";
if (true) return (b4j.docU.worddocument._worddocelement)(__c.Null);
 };
RDebugUtils.currentLine=216727599;
 //BA.debugLineNum = 216727599;BA.debugLine="StackPush(t)";
__ref._stackpush /*String*/ (null,_t);
RDebugUtils.currentLine=216727600;
 //BA.debugLineNum = 216727600;BA.debugLine="If t.Tag = \"plain\" Or t.Tag = \"url\" Then";
if ((_t.Tag /*String*/ ).equals("plain") || (_t.Tag /*String*/ ).equals("url")) { 
RDebugUtils.currentLine=216727601;
 //BA.debugLineNum = 216727601;BA.debugLine="Dim n As WordTagNode = StackPeek";
_n = __ref._stackpeek /*b4j.docU.worddocument._wordtagnode*/ (null);
RDebugUtils.currentLine=216727602;
 //BA.debugLineNum = 216727602;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
RDebugUtils.currentLine=216727603;
 //BA.debugLineNum = 216727603;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
RDebugUtils.currentLine=216727605;
 //BA.debugLineNum = 216727605;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
RDebugUtils.currentLine=216727606;
 //BA.debugLineNum = 216727606;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.worddocument._wordtextnode*/ (null,"")));
RDebugUtils.currentLine=216727607;
 //BA.debugLineNum = 216727607;BA.debugLine="StackPop";
__ref._stackpop /*String*/ (null);
 };
 };
RDebugUtils.currentLine=216727610;
 //BA.debugLineNum = 216727610;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=216727612;
 //BA.debugLineNum = 216727612;BA.debugLine="If Text.Length > LastMatchEnd Then";
if (_text.length()>_lastmatchend) { 
RDebugUtils.currentLine=216727613;
 //BA.debugLineNum = 216727613;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubString";
_parsedelements.Add((Object)(__ref._createtextnode /*b4j.docU.worddocument._wordtextnode*/ (null,_text.substring(_lastmatchend,_text.length()))));
 };
RDebugUtils.currentLine=216727615;
 //BA.debugLineNum = 216727615;BA.debugLine="Return OrganizeElements( ParsedElements)";
if (true) return __ref._organizeelements /*b4j.docU.worddocument._worddocelement*/ (null,_parsedelements);
RDebugUtils.currentLine=216727616;
 //BA.debugLineNum = 216727616;BA.debugLine="End Sub";
return null;
}
public String  _handleelements(b4j.docU.worddocument __ref,b4j.docU.worddocument._worddocelement _parent) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "handleelements", true))
	 {return ((String) Debug.delegate(ba, "handleelements", new Object[] {_parent}));}
int _index = 0;
b4j.docU.worddocument._worddocelement _child = null;
anywheresoftware.b4j.object.JavaObject _par = null;
anywheresoftware.b4a.objects.collections.List _paragraphs = null;
anywheresoftware.b4j.object.JavaObject _j = null;
b4j.docU.worddocument._wordtextnode _node = null;
int _rows = 0;
int _cols = 0;
String _alignment = "";
anywheresoftware.b4a.objects.collections.Map _fixedmap = null;
String _rh = "";
int _celloffset = 0;
int _colspan = 0;
int _rowspan = 0;
RDebugUtils.currentLine=216465408;
 //BA.debugLineNum = 216465408;BA.debugLine="Private Sub HandleElements(Parent As WordDocElemen";
RDebugUtils.currentLine=216465409;
 //BA.debugLineNum = 216465409;BA.debugLine="For index = 0 To Parent.Children.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_parent.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=216465410;
 //BA.debugLineNum = 216465410;BA.debugLine="Dim child As WordDocElement = Parent.Children.Ge";
_child = (b4j.docU.worddocument._worddocelement)(_parent.Children /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=216465411;
 //BA.debugLineNum = 216465411;BA.debugLine="If DebugLog Then";
if (__ref._debuglog /*boolean*/ ) { 
RDebugUtils.currentLine=216465412;
 //BA.debugLineNum = 216465412;BA.debugLine="Log(\"Tag: \" & child.Tag)";
__c.LogImpl("9216465412","Tag: "+_child.Tag /*String*/ ,0);
 };
RDebugUtils.currentLine=216465414;
 //BA.debugLineNum = 216465414;BA.debugLine="Select child.Tag";
switch (BA.switchObjectToInt(_child.Tag /*String*/ ,"p","header","footer","table","row","cell")) {
case 0: {
RDebugUtils.currentLine=216465416;
 //BA.debugLineNum = 216465416;BA.debugLine="Dim par As JavaObject";
_par = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=216465417;
 //BA.debugLineNum = 216465417;BA.debugLine="Select Parent.Tag";
switch (BA.switchObjectToInt(_parent.Tag /*String*/ ,"doc","header","footer","cell")) {
case 0: {
RDebugUtils.currentLine=216465419;
 //BA.debugLineNum = 216465419;BA.debugLine="par = XWPFDocument.RunMethod(\"createParagrap";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createParagraph",(Object[])(__c.Null))));
 break; }
case 1: 
case 2: {
RDebugUtils.currentLine=216465421;
 //BA.debugLineNum = 216465421;BA.debugLine="par = Parent.JElement.RunMethod(\"createParag";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createParagraph",(Object[])(__c.Null))));
 break; }
case 3: {
RDebugUtils.currentLine=216465423;
 //BA.debugLineNum = 216465423;BA.debugLine="If index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=216465424;
 //BA.debugLineNum = 216465424;BA.debugLine="Dim paragraphs As List";
_paragraphs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=216465425;
 //BA.debugLineNum = 216465425;BA.debugLine="paragraphs.Initialize";
_paragraphs.Initialize();
RDebugUtils.currentLine=216465426;
 //BA.debugLineNum = 216465426;BA.debugLine="Dim j As JavaObject = paragraphs";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraphs.getObject()));
RDebugUtils.currentLine=216465427;
 //BA.debugLineNum = 216465427;BA.debugLine="j.RunMethod(\"addAll\", Array(Parent.JElement";
_j.RunMethod("addAll",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getParagraphs",(Object[])(__c.Null)).getObject())});
RDebugUtils.currentLine=216465428;
 //BA.debugLineNum = 216465428;BA.debugLine="If paragraphs.Size > 0 Then";
if (_paragraphs.getSize()>0) { 
RDebugUtils.currentLine=216465429;
 //BA.debugLineNum = 216465429;BA.debugLine="par = paragraphs.Get(0)";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraphs.Get((int) (0))));
 };
 };
RDebugUtils.currentLine=216465432;
 //BA.debugLineNum = 216465432;BA.debugLine="If par.IsInitialized = False Then";
if (_par.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=216465433;
 //BA.debugLineNum = 216465433;BA.debugLine="par = Parent.JElement.RunMethod(\"addParagra";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addParagraph",(Object[])(__c.Null))));
 };
 break; }
}
;
RDebugUtils.currentLine=216465436;
 //BA.debugLineNum = 216465436;BA.debugLine="ConfigureParagraph(par, child)";
__ref._configureparagraph /*String*/ (null,_par,_child);
RDebugUtils.currentLine=216465437;
 //BA.debugLineNum = 216465437;BA.debugLine="For Each node As WordTextNode In child.Childre";
{
final anywheresoftware.b4a.BA.IterableList group29 = _child.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_node = (b4j.docU.worddocument._wordtextnode)(group29.Get(index29));
RDebugUtils.currentLine=216465438;
 //BA.debugLineNum = 216465438;BA.debugLine="TextToRuns(par, node)";
__ref._texttoruns /*String*/ (null,_par,_node);
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=216465441;
 //BA.debugLineNum = 216465441;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createHeader",new Object[]{(Object)("DEFAULT")})));
RDebugUtils.currentLine=216465442;
 //BA.debugLineNum = 216465442;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 2: {
RDebugUtils.currentLine=216465444;
 //BA.debugLineNum = 216465444;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFooter",new Object[]{(Object)("DEFAULT")})));
RDebugUtils.currentLine=216465445;
 //BA.debugLineNum = 216465445;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 3: {
RDebugUtils.currentLine=216465447;
 //BA.debugLineNum = 216465447;BA.debugLine="Dim rows As Int = child.Extra.Get(\"rows\")";
_rows = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rows"))));
RDebugUtils.currentLine=216465448;
 //BA.debugLineNum = 216465448;BA.debugLine="Dim cols As Int = child.Extra.Get(\"cols\")";
_cols = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("cols"))));
RDebugUtils.currentLine=216465449;
 //BA.debugLineNum = 216465449;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createTable",new Object[]{(Object)(_rows),(Object)(_cols)})));
RDebugUtils.currentLine=216465450;
 //BA.debugLineNum = 216465450;BA.debugLine="If child.Extra.ContainsKey(\"alignment\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("alignment"))) { 
RDebugUtils.currentLine=216465451;
 //BA.debugLineNum = 216465451;BA.debugLine="Dim alignment As String = ToUpper(child.Extra";
_alignment = __ref._toupper /*String*/ (null,BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment"))));
RDebugUtils.currentLine=216465453;
 //BA.debugLineNum = 216465453;BA.debugLine="Dim fixedMap As Map = CreateMap(\"LEFT\": \"RIGH";
_fixedmap = new anywheresoftware.b4a.objects.collections.Map();
_fixedmap = __c.createMap(new Object[] {(Object)("LEFT"),(Object)("RIGHT"),(Object)("CENTER"),(Object)("LEFT"),(Object)("RIGHT"),(Object)("CENTER")});
RDebugUtils.currentLine=216465454;
 //BA.debugLineNum = 216465454;BA.debugLine="child.JElement.RunMethod(\"setTableAlignment\",";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setTableAlignment",new Object[]{_fixedmap.Get((Object)(_alignment))});
 };
RDebugUtils.currentLine=216465456;
 //BA.debugLineNum = 216465456;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 4: {
RDebugUtils.currentLine=216465458;
 //BA.debugLineNum = 216465458;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getRow",new Object[]{(Object)(_index)})));
RDebugUtils.currentLine=216465459;
 //BA.debugLineNum = 216465459;BA.debugLine="If child.Extra.ContainsKey(\"height\") Then chil";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHeight",new Object[]{__ref._to20thspoint /*Object*/ (null,(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))),__c.False)});};
RDebugUtils.currentLine=216465460;
 //BA.debugLineNum = 216465460;BA.debugLine="If child.Extra.ContainsKey(\"repeatheader\") The";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("repeatheader"))) { 
RDebugUtils.currentLine=216465461;
 //BA.debugLineNum = 216465461;BA.debugLine="Dim rh As String = child.Extra.Get(\"repeathea";
_rh = BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("repeatheader")));
RDebugUtils.currentLine=216465462;
 //BA.debugLineNum = 216465462;BA.debugLine="child.JElement.RunMethod(\"setRepeatHeader\", A";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setRepeatHeader",new Object[]{(Object)((_rh.toLowerCase()).equals("true"))});
 };
RDebugUtils.currentLine=216465464;
 //BA.debugLineNum = 216465464;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
case 5: {
RDebugUtils.currentLine=216465466;
 //BA.debugLineNum = 216465466;BA.debugLine="Dim CellOffset As Int = index + child.Extra.Ge";
_celloffset = (int) (_index+(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("offset"),(Object)(0)))));
RDebugUtils.currentLine=216465467;
 //BA.debugLineNum = 216465467;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getCell",new Object[]{(Object)(_celloffset)})));
RDebugUtils.currentLine=216465468;
 //BA.debugLineNum = 216465468;BA.debugLine="If child.Extra.ContainsKey(\"color\") Then child";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColor",new Object[]{(Object)(__ref._parsecolorstring /*String*/ (null,BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});};
RDebugUtils.currentLine=216465469;
 //BA.debugLineNum = 216465469;BA.debugLine="If child.Extra.ContainsKey(\"verticalalignment\"";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("verticalalignment"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setVerticalAlignment",new Object[]{(Object)(__ref._toupper /*String*/ (null,BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("verticalalignment")))))});};
RDebugUtils.currentLine=216465470;
 //BA.debugLineNum = 216465470;BA.debugLine="If child.Extra.ContainsKey(\"width\") Then child";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setWidth",new Object[]{__ref._to20thspoint /*Object*/ (null,(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width")))),__c.True)});};
RDebugUtils.currentLine=216465471;
 //BA.debugLineNum = 216465471;BA.debugLine="If child.Extra.ContainsKey(\"colspan\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("colspan"))) { 
RDebugUtils.currentLine=216465472;
 //BA.debugLineNum = 216465472;BA.debugLine="Dim ColSpan As Int = child.Extra.Get(\"colspan";
_colspan = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("colspan"))));
RDebugUtils.currentLine=216465473;
 //BA.debugLineNum = 216465473;BA.debugLine="jme.RunMethod(\"MergeCellsHorizontal\", Array(P";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("MergeCellsHorizontal",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_index),(Object)(_index+_colspan-1)});
 };
RDebugUtils.currentLine=216465475;
 //BA.debugLineNum = 216465475;BA.debugLine="If child.Extra.ContainsKey(\"rowspan\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("rowspan"))) { 
RDebugUtils.currentLine=216465476;
 //BA.debugLineNum = 216465476;BA.debugLine="Dim RowSpan As Int = child.Extra.Get(\"rowspan";
_rowspan = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rowspan"))));
RDebugUtils.currentLine=216465477;
 //BA.debugLineNum = 216465477;BA.debugLine="jme.RunMethod(\"MergeCellsVertical\", Array(Par";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("MergeCellsVertical",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_index),(Object)(_rowspan)});
 };
RDebugUtils.currentLine=216465479;
 //BA.debugLineNum = 216465479;BA.debugLine="HandleElements(child)";
__ref._handleelements /*String*/ (null,_child);
 break; }
}
;
 }
};
RDebugUtils.currentLine=216465482;
 //BA.debugLineNum = 216465482;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
RDebugUtils.currentLine=216268800;
 //BA.debugLineNum = 216268800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=216268801;
 //BA.debugLineNum = 216268801;BA.debugLine="Public XWPFDocument As JavaObject";
_xwpfdocument = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=216268802;
 //BA.debugLineNum = 216268802;BA.debugLine="Private mWU As WordUtils 'ignore";
_mwu = new b4j.docU.wordutils();
RDebugUtils.currentLine=216268803;
 //BA.debugLineNum = 216268803;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new b4j.docU.b4xset();
RDebugUtils.currentLine=216268804;
 //BA.debugLineNum = 216268804;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=216268805;
 //BA.debugLineNum = 216268805;BA.debugLine="Private Start As Int";
_start = 0;
RDebugUtils.currentLine=216268806;
 //BA.debugLineNum = 216268806;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=216268807;
 //BA.debugLineNum = 216268807;BA.debugLine="Type WordTagNode (Tag As String, Extra As Map, Ca";
;
RDebugUtils.currentLine=216268808;
 //BA.debugLineNum = 216268808;BA.debugLine="Type WordTextNode (Text As String, Tags As List)";
;
RDebugUtils.currentLine=216268809;
 //BA.debugLineNum = 216268809;BA.debugLine="Type WordDocElement(Tag As String, Extra As Map,";
;
RDebugUtils.currentLine=216268810;
 //BA.debugLineNum = 216268810;BA.debugLine="Private ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=216268811;
 //BA.debugLineNum = 216268811;BA.debugLine="Private HighlightColorsMap As Map";
_highlightcolorsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=216268812;
 //BA.debugLineNum = 216268812;BA.debugLine="Public DebugLog As Boolean";
_debuglog = false;
RDebugUtils.currentLine=216268813;
 //BA.debugLineNum = 216268813;BA.debugLine="Private jme As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=216268814;
 //BA.debugLineNum = 216268814;BA.debugLine="End Sub";
return "";
}
public String  _configureparagraph(b4j.docU.worddocument __ref,anywheresoftware.b4j.object.JavaObject _paragraph,b4j.docU.worddocument._worddocelement _element) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "configureparagraph", true))
	 {return ((String) Debug.delegate(ba, "configureparagraph", new Object[] {_paragraph,_element}));}
anywheresoftware.b4a.objects.collections.Map _props = null;
String _alignment = "";
int _indentationleft = 0;
RDebugUtils.currentLine=217382912;
 //BA.debugLineNum = 217382912;BA.debugLine="Private Sub ConfigureParagraph (Paragraph As JavaO";
RDebugUtils.currentLine=217382913;
 //BA.debugLineNum = 217382913;BA.debugLine="Dim props As Map = Element.Extra";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = _element.Extra /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=217382914;
 //BA.debugLineNum = 217382914;BA.debugLine="Dim Alignment As String = props.GetDefault(\"align";
_alignment = BA.ObjectToString(_props.GetDefault((Object)("alignment"),(Object)("START")));
RDebugUtils.currentLine=217382915;
 //BA.debugLineNum = 217382915;BA.debugLine="Paragraph.RunMethod(\"setAlignment\", Array(Alignme";
_paragraph.RunMethod("setAlignment",new Object[]{(Object)(_alignment.toUpperCase())});
RDebugUtils.currentLine=217382916;
 //BA.debugLineNum = 217382916;BA.debugLine="Dim indentationLeft As Int = props.GetDefault(\"in";
_indentationleft = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("indentationleft"),(Object)(0))));
RDebugUtils.currentLine=217382917;
 //BA.debugLineNum = 217382917;BA.debugLine="If GetBoolean(props.GetDefault(\"pagebreak\", False";
if (__ref._getboolean /*boolean*/ (null,BA.ObjectToString(_props.GetDefault((Object)("pagebreak"),(Object)(__c.False))))==__c.True) { 
RDebugUtils.currentLine=217382918;
 //BA.debugLineNum = 217382918;BA.debugLine="Paragraph.RunMethod(\"setPageBreak\", Array(True))";
_paragraph.RunMethod("setPageBreak",new Object[]{(Object)(__c.True)});
 };
RDebugUtils.currentLine=217382920;
 //BA.debugLineNum = 217382920;BA.debugLine="If indentationLeft <> 0 Then Paragraph.RunMethod(";
if (_indentationleft!=0) { 
_paragraph.RunMethod("setIndentationLeft",new Object[]{(Object)(_indentationleft*20)});};
RDebugUtils.currentLine=217382921;
 //BA.debugLineNum = 217382921;BA.debugLine="End Sub";
return "";
}
public boolean  _getboolean(b4j.docU.worddocument __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "getboolean", true))
	 {return ((Boolean) Debug.delegate(ba, "getboolean", new Object[] {_s}));}
RDebugUtils.currentLine=217448448;
 //BA.debugLineNum = 217448448;BA.debugLine="Private Sub GetBoolean(s As String) As Boolean";
RDebugUtils.currentLine=217448449;
 //BA.debugLineNum = 217448449;BA.debugLine="Return s.ToLowerCase = \"true\"";
if (true) return (_s.toLowerCase()).equals("true");
RDebugUtils.currentLine=217448450;
 //BA.debugLineNum = 217448450;BA.debugLine="End Sub";
return false;
}
public b4j.docU.worddocument._wordtagnode  _createtagnode(b4j.docU.worddocument __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "createtagnode", true))
	 {return ((b4j.docU.worddocument._wordtagnode) Debug.delegate(ba, "createtagnode", new Object[] {_tag}));}
b4j.docU.worddocument._wordtagnode _n = null;
RDebugUtils.currentLine=217317376;
 //BA.debugLineNum = 217317376;BA.debugLine="Private Sub CreateTagNode (Tag As String) As WordT";
RDebugUtils.currentLine=217317377;
 //BA.debugLineNum = 217317377;BA.debugLine="Dim n As WordTagNode";
_n = new b4j.docU.worddocument._wordtagnode();
RDebugUtils.currentLine=217317378;
 //BA.debugLineNum = 217317378;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=217317379;
 //BA.debugLineNum = 217317379;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
RDebugUtils.currentLine=217317380;
 //BA.debugLineNum = 217317380;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
RDebugUtils.currentLine=217317381;
 //BA.debugLineNum = 217317381;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=217317382;
 //BA.debugLineNum = 217317382;BA.debugLine="End Sub";
return null;
}
public b4j.docU.worddocument._wordtextnode  _createtextnode(b4j.docU.worddocument __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "createtextnode", true))
	 {return ((b4j.docU.worddocument._wordtextnode) Debug.delegate(ba, "createtextnode", new Object[] {_text}));}
b4j.docU.worddocument._wordtextnode _n = null;
RDebugUtils.currentLine=217251840;
 //BA.debugLineNum = 217251840;BA.debugLine="Private Sub CreateTextNode(Text As String) As Word";
RDebugUtils.currentLine=217251841;
 //BA.debugLineNum = 217251841;BA.debugLine="Dim n As WordTextNode";
_n = new b4j.docU.worddocument._wordtextnode();
RDebugUtils.currentLine=217251842;
 //BA.debugLineNum = 217251842;BA.debugLine="n.Initialize";
_n.Initialize();
RDebugUtils.currentLine=217251843;
 //BA.debugLineNum = 217251843;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
RDebugUtils.currentLine=217251844;
 //BA.debugLineNum = 217251844;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=217251845;
 //BA.debugLineNum = 217251845;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=217251846;
 //BA.debugLineNum = 217251846;BA.debugLine="Return n";
if (true) return _n;
RDebugUtils.currentLine=217251847;
 //BA.debugLineNum = 217251847;BA.debugLine="End Sub";
return null;
}
public b4j.docU.worddocument._worddocelement  _createworddocelement(b4j.docU.worddocument __ref,String _tag,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "createworddocelement", true))
	 {return ((b4j.docU.worddocument._worddocelement) Debug.delegate(ba, "createworddocelement", new Object[] {_tag,_extra}));}
b4j.docU.worddocument._worddocelement _t1 = null;
RDebugUtils.currentLine=217645056;
 //BA.debugLineNum = 217645056;BA.debugLine="Private Sub CreateWordDocElement (Tag As String, E";
RDebugUtils.currentLine=217645057;
 //BA.debugLineNum = 217645057;BA.debugLine="Dim t1 As WordDocElement";
_t1 = new b4j.docU.worddocument._worddocelement();
RDebugUtils.currentLine=217645058;
 //BA.debugLineNum = 217645058;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=217645059;
 //BA.debugLineNum = 217645059;BA.debugLine="t1.Tag = Tag";
_t1.Tag /*String*/  = _tag;
RDebugUtils.currentLine=217645060;
 //BA.debugLineNum = 217645060;BA.debugLine="If Extra.IsInitialized = False Then Extra.Initial";
if (_extra.IsInitialized()==__c.False) { 
_extra.Initialize();};
RDebugUtils.currentLine=217645061;
 //BA.debugLineNum = 217645061;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
RDebugUtils.currentLine=217645062;
 //BA.debugLineNum = 217645062;BA.debugLine="t1.Children.Initialize";
_t1.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=217645063;
 //BA.debugLineNum = 217645063;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=217645064;
 //BA.debugLineNum = 217645064;BA.debugLine="End Sub";
return null;
}
public String  _error(b4j.docU.worddocument __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "error", true))
	 {return ((String) Debug.delegate(ba, "error", new Object[] {_msg}));}
String _s = "";
RDebugUtils.currentLine=217186304;
 //BA.debugLineNum = 217186304;BA.debugLine="Private Sub Error (msg As String)";
RDebugUtils.currentLine=217186305;
 //BA.debugLineNum = 217186305;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(__ref._start /*int*/ ))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
RDebugUtils.currentLine=217186309;
 //BA.debugLineNum = 217186309;BA.debugLine="LogError(s)";
__c.LogError(_s);
RDebugUtils.currentLine=217186311;
 //BA.debugLineNum = 217186311;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
__ref._errorstring /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_s).Append(__c.CRLF);
RDebugUtils.currentLine=217186312;
 //BA.debugLineNum = 217186312;BA.debugLine="End Sub";
return "";
}
public String  _texttoruns(b4j.docU.worddocument __ref,anywheresoftware.b4j.object.JavaObject _paragraph,b4j.docU.worddocument._wordtextnode _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "texttoruns", true))
	 {return ((String) Debug.delegate(ba, "texttoruns", new Object[] {_paragraph,_text}));}
anywheresoftware.b4j.object.JavaObject _run = null;
b4j.docU.worddocument._wordtagnode _lasttag = null;
String _url = "";
int _i = 0;
b4j.docU.worddocument._wordtagnode _tag = null;
String _underlinepattern = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
byte[] _b = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
int _picturetype = 0;
String _f = "";
int _size = 0;
String _color = "";
String _hc = "";
RDebugUtils.currentLine=217513984;
 //BA.debugLineNum = 217513984;BA.debugLine="Private Sub TextToRuns (Paragraph As JavaObject, T";
RDebugUtils.currentLine=217513985;
 //BA.debugLineNum = 217513985;BA.debugLine="Dim Run As JavaObject";
_run = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=217513986;
 //BA.debugLineNum = 217513986;BA.debugLine="Dim LastTag As WordTagNode = Text.Tags.Get(Text.T";
_lasttag = (b4j.docU.worddocument._wordtagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=217513987;
 //BA.debugLineNum = 217513987;BA.debugLine="If LastTag.Tag = \"url\" Then";
if ((_lasttag.Tag /*String*/ ).equals("url")) { 
RDebugUtils.currentLine=217513988;
 //BA.debugLineNum = 217513988;BA.debugLine="Dim url As String = LastTag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_lasttag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
RDebugUtils.currentLine=217513989;
 //BA.debugLineNum = 217513989;BA.debugLine="If url.StartsWith(\"bookmark://\") Then";
if (_url.startsWith("bookmark://")) { 
RDebugUtils.currentLine=217513990;
 //BA.debugLineNum = 217513990;BA.debugLine="Run = jme.RunMethod(\"CreateHyperlinkRunToAnchor";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("CreateHyperlinkRunToAnchor",new Object[]{(Object)(_paragraph.getObject()),(Object)(_url.substring("bookmark://".length()))})));
 }else {
RDebugUtils.currentLine=217513992;
 //BA.debugLineNum = 217513992;BA.debugLine="Run = Paragraph.RunMethod(\"createHyperlinkRun\",";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraph.RunMethod("createHyperlinkRun",new Object[]{(Object)(_url)})));
 };
 }else {
RDebugUtils.currentLine=217513995;
 //BA.debugLineNum = 217513995;BA.debugLine="Run = Paragraph.RunMethod(\"createRun\", Null)";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraph.RunMethod("createRun",(Object[])(__c.Null))));
 };
RDebugUtils.currentLine=217513997;
 //BA.debugLineNum = 217513997;BA.debugLine="Run.RunMethod(\"setText\", Array(Text.Text))";
_run.RunMethod("setText",new Object[]{(Object)(_text.Text /*String*/ )});
RDebugUtils.currentLine=217513998;
 //BA.debugLineNum = 217513998;BA.debugLine="For i = 2 To Text.Tags.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (2) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=217513999;
 //BA.debugLineNum = 217513999;BA.debugLine="Dim tag As WordTagNode = Text.Tags.Get(i)";
_tag = (b4j.docU.worddocument._wordtagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=217514000;
 //BA.debugLineNum = 217514000;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"b","break","i","u","img","color","textsize","embossed","shadow","strike","font","highlight","bookmark")) {
case 0: {
RDebugUtils.currentLine=217514002;
 //BA.debugLineNum = 217514002;BA.debugLine="Run.RunMethod(\"setBold\", Array(True))";
_run.RunMethod("setBold",new Object[]{(Object)(__c.True)});
 break; }
case 1: {
RDebugUtils.currentLine=217514004;
 //BA.debugLineNum = 217514004;BA.debugLine="Run.RunMethod(\"addBreak\", Null)";
_run.RunMethod("addBreak",(Object[])(__c.Null));
 break; }
case 2: {
RDebugUtils.currentLine=217514006;
 //BA.debugLineNum = 217514006;BA.debugLine="Run.RunMethod(\"setItalic\", Array(True))";
_run.RunMethod("setItalic",new Object[]{(Object)(__c.True)});
 break; }
case 3: {
RDebugUtils.currentLine=217514008;
 //BA.debugLineNum = 217514008;BA.debugLine="Dim UnderlinePattern As String = \"SINGLE\"";
_underlinepattern = "SINGLE";
RDebugUtils.currentLine=217514009;
 //BA.debugLineNum = 217514009;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
RDebugUtils.currentLine=217514010;
 //BA.debugLineNum = 217514010;BA.debugLine="UnderlinePattern = tag.Extra.GetDefault(\"patt";
_underlinepattern = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("pattern"),(Object)(_underlinepattern)));
RDebugUtils.currentLine=217514011;
 //BA.debugLineNum = 217514011;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
RDebugUtils.currentLine=217514012;
 //BA.debugLineNum = 217514012;BA.debugLine="Run.RunMethod(\"setUnderlineColor\", Array(Par";
_run.RunMethod("setUnderlineColor",new Object[]{(Object)(__ref._parsecolorstring /*String*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});
 };
 };
RDebugUtils.currentLine=217514015;
 //BA.debugLineNum = 217514015;BA.debugLine="Run.RunMethod(\"setUnderline\", Array(UnderlineP";
_run.RunMethod("setUnderline",new Object[]{(Object)(_underlinepattern.toUpperCase())});
 break; }
case 4: {
RDebugUtils.currentLine=217514017;
 //BA.debugLineNum = 217514017;BA.debugLine="Dim Dir As String = tag.Extra.Get(\"dir\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("dir")));
RDebugUtils.currentLine=217514018;
 //BA.debugLineNum = 217514018;BA.debugLine="If Dir = \"assets\" Then Dir = File.DirAssets";
if ((_dir).equals("assets")) { 
_dir = __c.File.getDirAssets();};
RDebugUtils.currentLine=217514019;
 //BA.debugLineNum = 217514019;BA.debugLine="Dim FileName As String = tag.Extra.Get(\"filena";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("filename")));
RDebugUtils.currentLine=217514020;
 //BA.debugLineNum = 217514020;BA.debugLine="Dim width As Int = tag.Extra.Get(\"width\") * 12";
_width = (int) ((double)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width"))))*12700);
RDebugUtils.currentLine=217514021;
 //BA.debugLineNum = 217514021;BA.debugLine="Dim height As Int = tag.Extra.Get(\"height\") *";
_height = (int) ((double)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height"))))*12700);
RDebugUtils.currentLine=217514022;
 //BA.debugLineNum = 217514022;BA.debugLine="Dim b() As Byte = File.ReadBytes(Dir, FileName";
_b = __c.File.ReadBytes(_dir,_filename);
RDebugUtils.currentLine=217514023;
 //BA.debugLineNum = 217514023;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=217514024;
 //BA.debugLineNum = 217514024;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
RDebugUtils.currentLine=217514025;
 //BA.debugLineNum = 217514025;BA.debugLine="Dim PictureType As Int";
_picturetype = 0;
RDebugUtils.currentLine=217514026;
 //BA.debugLineNum = 217514026;BA.debugLine="Dim f As String = Dir & FileName";
_f = _dir+_filename;
RDebugUtils.currentLine=217514027;
 //BA.debugLineNum = 217514027;BA.debugLine="If f.ToLowerCase.EndsWith(\".png\") Then Picture";
if (_f.toLowerCase().endsWith(".png")) { 
_picturetype = (int) (6);}
else {
_picturetype = (int) (5);};
RDebugUtils.currentLine=217514028;
 //BA.debugLineNum = 217514028;BA.debugLine="Run.RunMethod(\"addPicture\", Array(in, PictureT";
_run.RunMethod("addPicture",new Object[]{(Object)(_in.getObject()),(Object)(_picturetype),(Object)(_filename),(Object)(_width),(Object)(_height)});
 break; }
case 5: {
RDebugUtils.currentLine=217514030;
 //BA.debugLineNum = 217514030;BA.debugLine="Run.RunMethod(\"setColor\", Array(ParseColorStri";
_run.RunMethod("setColor",new Object[]{(Object)(__ref._parsecolorstring /*String*/ (null,BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});
 break; }
case 6: {
RDebugUtils.currentLine=217514032;
 //BA.debugLineNum = 217514032;BA.debugLine="Dim size As Int = tag.Extra.Get(\"textsize\")";
_size = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
RDebugUtils.currentLine=217514033;
 //BA.debugLineNum = 217514033;BA.debugLine="Run.RunMethod(\"setFontSize\", Array(size))";
_run.RunMethod("setFontSize",new Object[]{(Object)(_size)});
 break; }
case 7: {
RDebugUtils.currentLine=217514035;
 //BA.debugLineNum = 217514035;BA.debugLine="Run.RunMethod(\"setEmbossed\", Array(True))";
_run.RunMethod("setEmbossed",new Object[]{(Object)(__c.True)});
 break; }
case 8: {
RDebugUtils.currentLine=217514037;
 //BA.debugLineNum = 217514037;BA.debugLine="Run.RunMethod(\"setShadow\", Array(True))";
_run.RunMethod("setShadow",new Object[]{(Object)(__c.True)});
 break; }
case 9: {
RDebugUtils.currentLine=217514039;
 //BA.debugLineNum = 217514039;BA.debugLine="Run.RunMethod(\"setStrikeThrough\", Array(True))";
_run.RunMethod("setStrikeThrough",new Object[]{(Object)(__c.True)});
 break; }
case 10: {
RDebugUtils.currentLine=217514041;
 //BA.debugLineNum = 217514041;BA.debugLine="Run.RunMethod(\"setFontFamily\", Array(tag.Extra";
_run.RunMethod("setFontFamily",new Object[]{_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("font"))});
 break; }
case 11: {
RDebugUtils.currentLine=217514043;
 //BA.debugLineNum = 217514043;BA.debugLine="Dim color As String = tag.Extra.Get(\"highlight";
_color = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("highlight")));
RDebugUtils.currentLine=217514044;
 //BA.debugLineNum = 217514044;BA.debugLine="Dim hc As String = HighlightColorsMap.GetDefau";
_hc = BA.ObjectToString(__ref._highlightcolorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_color.toLowerCase()),(Object)("")));
RDebugUtils.currentLine=217514045;
 //BA.debugLineNum = 217514045;BA.debugLine="If hc = \"\" Then Error(\"Invalid highlight color";
if ((_hc).equals("")) { 
__ref._error /*String*/ (null,"Invalid highlight color: "+_color);};
RDebugUtils.currentLine=217514046;
 //BA.debugLineNum = 217514046;BA.debugLine="Run.RunMethod(\"setTextHighlightColor\", Array(h";
_run.RunMethod("setTextHighlightColor",new Object[]{(Object)(_hc)});
 break; }
case 12: {
RDebugUtils.currentLine=217514048;
 //BA.debugLineNum = 217514048;BA.debugLine="jme.RunMethod(\"createBookmark\", Array(Paragrap";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createBookmark",new Object[]{(Object)(_paragraph.getObject()),_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("bookmark"))});
 break; }
}
;
 }
};
RDebugUtils.currentLine=217514051;
 //BA.debugLineNum = 217514051;BA.debugLine="End Sub";
return "";
}
public String  _toupper(b4j.docU.worddocument __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "toupper", true))
	 {return ((String) Debug.delegate(ba, "toupper", new Object[] {_s}));}
RDebugUtils.currentLine=216530944;
 //BA.debugLineNum = 216530944;BA.debugLine="Private Sub ToUpper(s As String) As String";
RDebugUtils.currentLine=216530945;
 //BA.debugLineNum = 216530945;BA.debugLine="Return s.ToUpperCase";
if (true) return _s.toUpperCase();
RDebugUtils.currentLine=216530946;
 //BA.debugLineNum = 216530946;BA.debugLine="End Sub";
return "";
}
public Object  _to20thspoint(b4j.docU.worddocument __ref,double _points,boolean _tostring) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "to20thspoint", true))
	 {return ((Object) Debug.delegate(ba, "to20thspoint", new Object[] {_points,_tostring}));}
int _i = 0;
String _s = "";
RDebugUtils.currentLine=216596480;
 //BA.debugLineNum = 216596480;BA.debugLine="Private Sub To20thsPoint(Points As Double, ToStrin";
RDebugUtils.currentLine=216596481;
 //BA.debugLineNum = 216596481;BA.debugLine="Dim i As Int = Round(Points * 20)";
_i = (int) (__c.Round(_points*20));
RDebugUtils.currentLine=216596482;
 //BA.debugLineNum = 216596482;BA.debugLine="If ToString Then";
if (_tostring) { 
RDebugUtils.currentLine=216596483;
 //BA.debugLineNum = 216596483;BA.debugLine="Dim s As String = i";
_s = BA.NumberToString(_i);
RDebugUtils.currentLine=216596484;
 //BA.debugLineNum = 216596484;BA.debugLine="Return s";
if (true) return (Object)(_s);
 }else {
RDebugUtils.currentLine=216596486;
 //BA.debugLineNum = 216596486;BA.debugLine="Return i";
if (true) return (Object)(_i);
 };
RDebugUtils.currentLine=216596488;
 //BA.debugLineNum = 216596488;BA.debugLine="End Sub";
return null;
}
public String  _parsecolorstring(b4j.docU.worddocument __ref,String _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "parsecolorstring", true))
	 {return ((String) Debug.delegate(ba, "parsecolorstring", new Object[] {_clr}));}
int _i = 0;
String _s = "";
RDebugUtils.currentLine=217579520;
 //BA.debugLineNum = 217579520;BA.debugLine="Private Sub ParseColorString(clr As String) As Str";
RDebugUtils.currentLine=217579521;
 //BA.debugLineNum = 217579521;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
RDebugUtils.currentLine=217579522;
 //BA.debugLineNum = 217579522;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
RDebugUtils.currentLine=217579523;
 //BA.debugLineNum = 217579523;BA.debugLine="Return clr.SubString(1)";
if (true) return _clr.substring((int) (1));
 }else 
{RDebugUtils.currentLine=217579524;
 //BA.debugLineNum = 217579524;BA.debugLine="Else If clr.StartsWith(\"0x\") Then";
if (_clr.startsWith("0x")) { 
RDebugUtils.currentLine=217579525;
 //BA.debugLineNum = 217579525;BA.debugLine="Return clr.SubString(4)";
if (true) return _clr.substring((int) (4));
 }else 
{RDebugUtils.currentLine=217579526;
 //BA.debugLineNum = 217579526;BA.debugLine="Else If ColorsMap.ContainsKey(clr) Then";
if (__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
RDebugUtils.currentLine=217579527;
 //BA.debugLineNum = 217579527;BA.debugLine="Dim i As Int = Bit.And(0x00ffffff, ColorsMap.Get";
_i = __c.Bit.And(((int)0x00ffffff),(int)(BA.ObjectToNumber(__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)))));
RDebugUtils.currentLine=217579528;
 //BA.debugLineNum = 217579528;BA.debugLine="Dim s As String = Bit.ToHexString(i)";
_s = __c.Bit.ToHexString(_i);
RDebugUtils.currentLine=217579529;
 //BA.debugLineNum = 217579529;BA.debugLine="Do While s.Length < 6";
while (_s.length()<6) {
RDebugUtils.currentLine=217579530;
 //BA.debugLineNum = 217579530;BA.debugLine="s = \"0\" & s";
_s = "0"+_s;
 }
;
RDebugUtils.currentLine=217579532;
 //BA.debugLineNum = 217579532;BA.debugLine="Return s";
if (true) return _s;
 }else {
RDebugUtils.currentLine=217579534;
 //BA.debugLineNum = 217579534;BA.debugLine="Error(\"Invalid color value: \" & clr)";
__ref._error /*String*/ (null,"Invalid color value: "+_clr);
RDebugUtils.currentLine=217579535;
 //BA.debugLineNum = 217579535;BA.debugLine="Return \"000000\"";
if (true) return "000000";
 }}}
;
RDebugUtils.currentLine=217579537;
 //BA.debugLineNum = 217579537;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.worddocument __ref,anywheresoftware.b4a.BA _ba,b4j.docU.wordutils _wu,anywheresoftware.b4j.object.JavaObject _document) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_wu,_document}));}
RDebugUtils.currentLine=216334336;
 //BA.debugLineNum = 216334336;BA.debugLine="Public Sub Initialize (wu As WordUtils, Document A";
RDebugUtils.currentLine=216334337;
 //BA.debugLineNum = 216334337;BA.debugLine="mWU = wu";
__ref._mwu /*b4j.docU.wordutils*/  = _wu;
RDebugUtils.currentLine=216334338;
 //BA.debugLineNum = 216334338;BA.debugLine="XWPFDocument = Document";
__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/  = _document;
RDebugUtils.currentLine=216334339;
 //BA.debugLineNum = 216334339;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"p\"";
__ref._allowedtags /*b4j.docU.b4xset*/  = _b4xcollections._createset2 /*b4j.docU.b4xset*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("p"),(Object)("b"),(Object)("u"),(Object)("embossed"),(Object)("shadow"),(Object)("plain"),(Object)("color"),(Object)("font"),(Object)("textsize"),(Object)("break"),(Object)("i"),(Object)("strike"),(Object)("img"),(Object)("indentationleft"),(Object)("header"),(Object)("footer"),(Object)("table"),(Object)("row"),(Object)("cell"),(Object)("highlight"),(Object)("url"),(Object)("bookmark")}));
RDebugUtils.currentLine=216334341;
 //BA.debugLineNum = 216334341;BA.debugLine="ColorsMap = CreateMap(\"black\": 0xFF000000, _ 		\"d";
__ref._colorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)(((int)0xff000000)),(Object)("darkgray"),(Object)(((int)0xff444444)),(Object)("gray"),(Object)(((int)0xffcccccc)),(Object)("white"),(Object)(((int)0xffffffff)),(Object)("red"),(Object)(((int)0xffff0000)),(Object)("green"),(Object)(((int)0xff00ff00)),(Object)("blue"),(Object)(((int)0xff0000ff)),(Object)("yellow"),(Object)(((int)0xffffff00)),(Object)("cyan"),(Object)(((int)0xff00ffff)),(Object)("darkblue"),(Object)(((int)0xff000080)),(Object)("darkcyan"),(Object)(((int)0xff008080)),(Object)("darkgreen"),(Object)(((int)0xff008000)),(Object)("darkmagenta"),(Object)(((int)0xff800080)),(Object)("darkred"),(Object)(((int)0xff800000)),(Object)("darkyellow"),(Object)(((int)0xff808000)),(Object)("magenta"),(Object)(((int)0xffff00ff))});
RDebugUtils.currentLine=216334357;
 //BA.debugLineNum = 216334357;BA.debugLine="HighlightColorsMap = CreateMap(\"black\": \"black\",";
__ref._highlightcolorsmap /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("black"),(Object)("black"),(Object)("blue"),(Object)("blue"),(Object)("cyan"),(Object)("cyan"),(Object)("green"),(Object)("green"),(Object)("magenta"),(Object)("magenta"),(Object)("red"),(Object)("red"),(Object)("yellow"),(Object)("yellow"),(Object)("white"),(Object)("white"),(Object)("darkblue"),(Object)("darkBlue"),(Object)("darkcyan"),(Object)("darkCyan"),(Object)("darkgreen"),(Object)("darkGreen"),(Object)("darkmagenta"),(Object)("darkMagenta"),(Object)("darkred"),(Object)("darkRed"),(Object)("darkyellow"),(Object)("darkYellow"),(Object)("darkgray"),(Object)("darkGray"),(Object)("gray"),(Object)("lightGray")});
RDebugUtils.currentLine=216334373;
 //BA.debugLineNum = 216334373;BA.debugLine="jme = Me";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=216334374;
 //BA.debugLineNum = 216334374;BA.debugLine="End Sub";
return "";
}
public b4j.docU.worddocument._worddocelement  _organizeelements(b4j.docU.worddocument __ref,anywheresoftware.b4a.objects.collections.List _nodes) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "organizeelements", true))
	 {return ((b4j.docU.worddocument._worddocelement) Debug.delegate(ba, "organizeelements", new Object[] {_nodes}));}
b4j.docU.worddocument._worddocelement _doc = null;
anywheresoftware.b4a.objects.collections.Map _elements = null;
b4j.docU.worddocument._wordtextnode _node = null;
b4j.docU.worddocument._worddocelement _currentelement = null;
b4j.docU.worddocument._wordtagnode _tag = null;
b4j.docU.worddocument._worddocelement _newelement = null;
RDebugUtils.currentLine=216793088;
 //BA.debugLineNum = 216793088;BA.debugLine="Private Sub OrganizeElements (Nodes As List) As Wo";
RDebugUtils.currentLine=216793089;
 //BA.debugLineNum = 216793089;BA.debugLine="RemoveInvalidNodes(Nodes)";
__ref._removeinvalidnodes /*String*/ (null,_nodes);
RDebugUtils.currentLine=216793090;
 //BA.debugLineNum = 216793090;BA.debugLine="Dim doc As WordDocElement = CreateWordDocElement(";
_doc = __ref._createworddocelement /*b4j.docU.worddocument._worddocelement*/ (null,"doc",__c.createMap(new Object[] {}));
RDebugUtils.currentLine=216793091;
 //BA.debugLineNum = 216793091;BA.debugLine="Dim Elements As Map";
_elements = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=216793092;
 //BA.debugLineNum = 216793092;BA.debugLine="Elements.Initialize";
_elements.Initialize();
RDebugUtils.currentLine=216793093;
 //BA.debugLineNum = 216793093;BA.debugLine="For Each node As WordTextNode In Nodes";
{
final anywheresoftware.b4a.BA.IterableList group5 = _nodes;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_node = (b4j.docU.worddocument._wordtextnode)(group5.Get(index5));
RDebugUtils.currentLine=216793094;
 //BA.debugLineNum = 216793094;BA.debugLine="Dim CurrentElement As WordDocElement = doc";
_currentelement = _doc;
RDebugUtils.currentLine=216793095;
 //BA.debugLineNum = 216793095;BA.debugLine="For Each tag As WordTagNode In node.Tags";
{
final anywheresoftware.b4a.BA.IterableList group7 = _node.Tags /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_tag = (b4j.docU.worddocument._wordtagnode)(group7.Get(index7));
RDebugUtils.currentLine=216793096;
 //BA.debugLineNum = 216793096;BA.debugLine="If tag.Tag = \"noop\" Then Continue";
if ((_tag.Tag /*String*/ ).equals("noop")) { 
if (true) continue;};
RDebugUtils.currentLine=216793097;
 //BA.debugLineNum = 216793097;BA.debugLine="If Elements.ContainsKey(tag) Then";
if (_elements.ContainsKey((Object)(_tag))) { 
RDebugUtils.currentLine=216793098;
 //BA.debugLineNum = 216793098;BA.debugLine="CurrentElement = Elements.Get(tag)";
_currentelement = (b4j.docU.worddocument._worddocelement)(_elements.Get((Object)(_tag)));
 }else {
RDebugUtils.currentLine=216793101;
 //BA.debugLineNum = 216793101;BA.debugLine="Dim NewElement As WordDocElement = CreateWordD";
_newelement = __ref._createworddocelement /*b4j.docU.worddocument._worddocelement*/ (null,_tag.Tag /*String*/ ,_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=216793102;
 //BA.debugLineNum = 216793102;BA.debugLine="CurrentElement.Children.Add(NewElement)";
_currentelement.Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newelement));
RDebugUtils.currentLine=216793103;
 //BA.debugLineNum = 216793103;BA.debugLine="Elements.Put(tag, NewElement)";
_elements.Put((Object)(_tag),(Object)(_newelement));
RDebugUtils.currentLine=216793104;
 //BA.debugLineNum = 216793104;BA.debugLine="CurrentElement = NewElement";
_currentelement = _newelement;
 };
RDebugUtils.currentLine=216793106;
 //BA.debugLineNum = 216793106;BA.debugLine="If tag.Tag = \"p\" Then";
if ((_tag.Tag /*String*/ ).equals("p")) { 
RDebugUtils.currentLine=216793107;
 //BA.debugLineNum = 216793107;BA.debugLine="CurrentElement.Children.Add(node)";
_currentelement.Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_node));
RDebugUtils.currentLine=216793108;
 //BA.debugLineNum = 216793108;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=216793112;
 //BA.debugLineNum = 216793112;BA.debugLine="Return doc";
if (true) return _doc;
RDebugUtils.currentLine=216793113;
 //BA.debugLineNum = 216793113;BA.debugLine="End Sub";
return null;
}
public String  _removeinvalidnodes(b4j.docU.worddocument __ref,anywheresoftware.b4a.objects.collections.List _nodes) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "removeinvalidnodes", true))
	 {return ((String) Debug.delegate(ba, "removeinvalidnodes", new Object[] {_nodes}));}
int[] _paragraphindices = null;
int _i = 0;
b4j.docU.worddocument._wordtextnode _n = null;
boolean _valid = false;
int _p = 0;
b4j.docU.worddocument._wordtagnode _t = null;
RDebugUtils.currentLine=216858624;
 //BA.debugLineNum = 216858624;BA.debugLine="Private Sub RemoveInvalidNodes (Nodes As List)";
RDebugUtils.currentLine=216858625;
 //BA.debugLineNum = 216858625;BA.debugLine="Dim ParagraphIndices() As Int = Array As Int(1, 2";
_paragraphindices = new int[]{(int) (1),(int) (2),(int) (4)};
RDebugUtils.currentLine=216858626;
 //BA.debugLineNum = 216858626;BA.debugLine="For i = Nodes.Size - 1 To 0 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_nodes.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=216858627;
 //BA.debugLineNum = 216858627;BA.debugLine="Dim n As WordTextNode = Nodes.Get(i)";
_n = (b4j.docU.worddocument._wordtextnode)(_nodes.Get(_i));
RDebugUtils.currentLine=216858628;
 //BA.debugLineNum = 216858628;BA.debugLine="Dim valid As Boolean";
_valid = false;
RDebugUtils.currentLine=216858629;
 //BA.debugLineNum = 216858629;BA.debugLine="For Each p As Int In ParagraphIndices";
{
final int[] group5 = _paragraphindices;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_p = group5[index5];
RDebugUtils.currentLine=216858630;
 //BA.debugLineNum = 216858630;BA.debugLine="If n.Tags.Size > p Then";
if (_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_p) { 
RDebugUtils.currentLine=216858631;
 //BA.debugLineNum = 216858631;BA.debugLine="Dim t As WordTagNode = n.Tags.Get(p)";
_t = (b4j.docU.worddocument._wordtagnode)(_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_p));
RDebugUtils.currentLine=216858632;
 //BA.debugLineNum = 216858632;BA.debugLine="If t.Tag = \"p\" Then";
if ((_t.Tag /*String*/ ).equals("p")) { 
RDebugUtils.currentLine=216858633;
 //BA.debugLineNum = 216858633;BA.debugLine="valid = True";
_valid = __c.True;
RDebugUtils.currentLine=216858634;
 //BA.debugLineNum = 216858634;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=216858638;
 //BA.debugLineNum = 216858638;BA.debugLine="If valid = False Then Nodes.RemoveAt(i)";
if (_valid==__c.False) { 
_nodes.RemoveAt(_i);};
 }
};
RDebugUtils.currentLine=216858640;
 //BA.debugLineNum = 216858640;BA.debugLine="End Sub";
return "";
}
public b4j.docU.worddocument._wordtagnode  _stackpeek(b4j.docU.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "stackpeek", true))
	 {return ((b4j.docU.worddocument._wordtagnode) Debug.delegate(ba, "stackpeek", null));}
RDebugUtils.currentLine=217120768;
 //BA.debugLineNum = 217120768;BA.debugLine="Private Sub StackPeek As WordTagNode";
RDebugUtils.currentLine=217120769;
 //BA.debugLineNum = 217120769;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (b4j.docU.worddocument._wordtagnode)(__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=217120770;
 //BA.debugLineNum = 217120770;BA.debugLine="End Sub";
return null;
}
public String  _stackpop(b4j.docU.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "stackpop", true))
	 {return ((String) Debug.delegate(ba, "stackpop", null));}
RDebugUtils.currentLine=216989696;
 //BA.debugLineNum = 216989696;BA.debugLine="Private Sub StackPop";
RDebugUtils.currentLine=216989697;
 //BA.debugLineNum = 216989697;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=216989698;
 //BA.debugLineNum = 216989698;BA.debugLine="End Sub";
return "";
}
public b4j.docU.worddocument._wordtagnode  _parsetag(b4j.docU.worddocument __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "parsetag", true))
	 {return ((b4j.docU.worddocument._wordtagnode) Debug.delegate(ba, "parsetag", new Object[] {_tag}));}
b4j.docU.worddocument._wordtagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
RDebugUtils.currentLine=216924160;
 //BA.debugLineNum = 216924160;BA.debugLine="Private Sub ParseTag (tag As String) As WordTagNod";
RDebugUtils.currentLine=216924164;
 //BA.debugLineNum = 216924164;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return __ref._createtagnode /*b4j.docU.worddocument._wordtagnode*/ (null,_tag.toLowerCase());};
RDebugUtils.currentLine=216924165;
 //BA.debugLineNum = 216924165;BA.debugLine="Dim res As WordTagNode = CreateTagNode(\"\")";
_res = __ref._createtagnode /*b4j.docU.worddocument._wordtagnode*/ (null,"");
RDebugUtils.currentLine=216924166;
 //BA.debugLineNum = 216924166;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=216924167;
 //BA.debugLineNum = 216924167;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=216924168;
 //BA.debugLineNum = 216924168;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
RDebugUtils.currentLine=216924169;
 //BA.debugLineNum = 216924169;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
RDebugUtils.currentLine=216924170;
 //BA.debugLineNum = 216924170;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
RDebugUtils.currentLine=216924171;
 //BA.debugLineNum = 216924171;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
RDebugUtils.currentLine=216924172;
 //BA.debugLineNum = 216924172;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
RDebugUtils.currentLine=216924173;
 //BA.debugLineNum = 216924173;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
RDebugUtils.currentLine=216924174;
 //BA.debugLineNum = 216924174;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=216924176;
 //BA.debugLineNum = 216924176;BA.debugLine="Dim i2 As Int";
_i2 = 0;
RDebugUtils.currentLine=216924177;
 //BA.debugLineNum = 216924177;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=216924178;
 //BA.debugLineNum = 216924178;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
RDebugUtils.currentLine=216924179;
 //BA.debugLineNum = 216924179;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
RDebugUtils.currentLine=216924181;
 //BA.debugLineNum = 216924181;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
RDebugUtils.currentLine=216924182;
 //BA.debugLineNum = 216924182;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
RDebugUtils.currentLine=216924183;
 //BA.debugLineNum = 216924183;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
RDebugUtils.currentLine=216924185;
 //BA.debugLineNum = 216924185;BA.debugLine="i = i2";
_i = _i2;
RDebugUtils.currentLine=216924186;
 //BA.debugLineNum = 216924186;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=216924188;
 //BA.debugLineNum = 216924188;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=216924189;
 //BA.debugLineNum = 216924189;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=216924190;
 //BA.debugLineNum = 216924190;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
RDebugUtils.currentLine=216924191;
 //BA.debugLineNum = 216924191;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
RDebugUtils.currentLine=216924193;
 //BA.debugLineNum = 216924193;BA.debugLine="last = i";
_last = _i;
 };
RDebugUtils.currentLine=216924195;
 //BA.debugLineNum = 216924195;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=216924197;
 //BA.debugLineNum = 216924197;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=216924198;
 //BA.debugLineNum = 216924198;BA.debugLine="End Sub";
return null;
}
public String  _stackpush(b4j.docU.worddocument __ref,b4j.docU.worddocument._wordtagnode _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "stackpush", true))
	 {return ((String) Debug.delegate(ba, "stackpush", new Object[] {_tag}));}
RDebugUtils.currentLine=217055232;
 //BA.debugLineNum = 217055232;BA.debugLine="Private Sub StackPush (Tag As WordTagNode)";
RDebugUtils.currentLine=217055233;
 //BA.debugLineNum = 217055233;BA.debugLine="Stack.Add(Tag)";
__ref._stack /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tag));
RDebugUtils.currentLine=217055234;
 //BA.debugLineNum = 217055234;BA.debugLine="End Sub";
return "";
}
public String  _setlandscapeorientation(b4j.docU.worddocument __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="worddocument";
if (Debug.shouldDelegate(ba, "setlandscapeorientation", true))
	 {return ((String) Debug.delegate(ba, "setlandscapeorientation", null));}
RDebugUtils.currentLine=217710592;
 //BA.debugLineNum = 217710592;BA.debugLine="Public Sub SetLandscapeOrientation";
RDebugUtils.currentLine=217710593;
 //BA.debugLineNum = 217710593;BA.debugLine="jme.RunMethod(\"SetLandscape\", Array(XWPFDocument)";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("SetLandscape",new Object[]{(Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
RDebugUtils.currentLine=217710594;
 //BA.debugLineNum = 217710594;BA.debugLine="jme.RunMethod(\"SetPageSize\", Array(XWPFDocument,";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("SetPageSize",new Object[]{(Object)(__ref._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(15840),(Object)(12240)});
RDebugUtils.currentLine=217710595;
 //BA.debugLineNum = 217710595;BA.debugLine="End Sub";
return "";
}
int BookmarksId;
public void MergeCellsHorizontal (XWPFTableRow row, XWPFTableCell cell, int fromCol, int toCol) {
	CTTcPr tcPr = cell.getCTTc().getTcPr();
  	if (tcPr == null) 
		tcPr = cell.getCTTc().addNewTcPr();
  	if (tcPr.isSetGridSpan()) {
   		tcPr.getGridSpan().setVal(BigInteger.valueOf(toCol-fromCol+1));
  } else {
  	tcPr.addNewGridSpan().setVal(BigInteger.valueOf(toCol-fromCol+1));
  }
  for(int colIndex = toCol; colIndex > fromCol; colIndex--) {
   row.removeCell(colIndex);
  }
}

public void MergeCellsVertical(XWPFTableRow row, int col, int rowSpan) {
	XWPFTable table = row.getTable();
	int fromRow = table.getRows().indexOf(row);
	int toRow = fromRow + rowSpan - 1;
  for(int rowIndex = fromRow; rowIndex <= toRow; rowIndex++) {
   XWPFTableCell cell = table.getRow(rowIndex).getCell(col);
   CTVMerge vmerge = CTVMerge.Factory.newInstance();
   if(rowIndex == fromRow){
    // The first merged cell is set with RESTART merge value
    vmerge.setVal(STMerge.RESTART);
   } else {
    // Cells which join (merge) the first one, are set with CONTINUE
    vmerge.setVal(STMerge.CONTINUE);
    // and the content should be removed
    for (int i = cell.getParagraphs().size(); i > 0; i--) {
     cell.removeParagraph(0);
    }
    cell.addParagraph();
   }
   // Try getting the TcPr. Not simply setting an new one every time.
   CTTcPr tcPr = cell.getCTTc().getTcPr();
   if (tcPr == null) tcPr = cell.getCTTc().addNewTcPr();
   tcPr.setVMerge(vmerge);
  }
 }
 
 public void createBookmark(XWPFParagraph paragraph, String anchor) {
  CTBookmark bookmark = paragraph.getCTP().addNewBookmarkStart();
  bookmark.setName(anchor);
  bookmark.setId(BigInteger.valueOf(++BookmarksId));
  paragraph.getCTP().addNewBookmarkEnd().setId(BigInteger.valueOf(BookmarksId));
 }
 public XWPFHyperlinkRun CreateHyperlinkRunToAnchor(XWPFParagraph paragraph, String anchor) throws Exception {
  CTHyperlink cthyperLink=paragraph.getCTP().addNewHyperlink();
  cthyperLink.setAnchor(anchor);
  cthyperLink.addNewR();
  return new XWPFHyperlinkRun(
    cthyperLink,
    cthyperLink.getRArray(0),
    paragraph
   );
 }
 

 public void SetLandscape(XWPFDocument doc) {
 	CTPageSz pageSize = getPageSize(doc);
	pageSize.setOrient(STPageOrientation.LANDSCAPE);
 }
 public void SetPageSize(XWPFDocument doc, int width, int height) {
 	CTPageSz pageSize = getPageSize(doc);
	pageSize.setW(BigInteger.valueOf(width));
	pageSize.setH(BigInteger.valueOf(height));
 }
 private CTPageSz getPageSize(XWPFDocument doc) {
 	CTDocument1 document = doc.getDocument();
	CTBody body = document.getBody();
	if (!body.isSetSectPr())
	     body.addNewSectPr();
	CTSectPr section = body.getSectPr();
	if(!section.isSetPgSz()) {
	    section.addNewPgSz();
	}
	return section.getPgSz();
 }
 public void SetMargins(XWPFDocument document, int left, int right, int top, int bottom, int footer, int header, int gutter) {
   CTSectPr sectPr = document.getDocument().getBody().getSectPr();
  if (sectPr == null) sectPr = document.getDocument().getBody().addNewSectPr();
  CTPageMar pageMar = sectPr.getPgMar();
  if (pageMar == null) pageMar = sectPr.addNewPgMar();
	  pageMar.setLeft(BigInteger.valueOf(left)); 
	  pageMar.setRight(BigInteger.valueOf(right));
	  pageMar.setTop(BigInteger.valueOf(top));
	  pageMar.setBottom(BigInteger.valueOf(bottom));
	  pageMar.setFooter(BigInteger.valueOf(footer));
	  pageMar.setHeader(BigInteger.valueOf(header));
	  pageMar.setGutter(BigInteger.valueOf(gutter));
 }
}