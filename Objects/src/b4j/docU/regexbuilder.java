package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class regexbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.regexbuilder", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.regexbuilder.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.keywords.StringBuilderWrapper _pat = null;
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
public b4j.docU.regexbuilder  _addregex(b4j.docU.regexbuilder __ref,String _regexpattern) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "addregex", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "addregex", new Object[] {_regexpattern}));}
RDebugUtils.currentLine=107544576;
 //BA.debugLineNum = 107544576;BA.debugLine="Private Sub AddRegex(RegexPattern As String) As Re";
RDebugUtils.currentLine=107544577;
 //BA.debugLineNum = 107544577;BA.debugLine="pat.Append(RegexPattern)";
__ref._pat /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_regexpattern);
RDebugUtils.currentLine=107544578;
 //BA.debugLineNum = 107544578;BA.debugLine="Return Me";
if (true) return (b4j.docU.regexbuilder)(this);
RDebugUtils.currentLine=107544579;
 //BA.debugLineNum = 107544579;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _append(b4j.docU.regexbuilder __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "append", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "append", new Object[] {_value}));}
RDebugUtils.currentLine=107413504;
 //BA.debugLineNum = 107413504;BA.debugLine="Public Sub Append(Value As String) As RegexBuilder";
RDebugUtils.currentLine=107413505;
 //BA.debugLineNum = 107413505;BA.debugLine="Return AddRegex(\"(?:\" & Value & \")\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"(?:"+_value+")");
RDebugUtils.currentLine=107413506;
 //BA.debugLineNum = 107413506;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendanybut(b4j.docU.regexbuilder __ref,anywheresoftware.b4a.objects.collections.List _characters) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendanybut", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendanybut", new Object[] {_characters}));}
RDebugUtils.currentLine=107675648;
 //BA.debugLineNum = 107675648;BA.debugLine="Public Sub AppendAnyBut (Characters As List) As Re";
RDebugUtils.currentLine=107675649;
 //BA.debugLineNum = 107675649;BA.debugLine="Return Append(\"[^\" & CharactersToString(Character";
if (true) return __ref._append /*b4j.docU.regexbuilder*/ (null,"[^"+__ref._characterstostring /*String*/ (null,_characters)+"]");
RDebugUtils.currentLine=107675650;
 //BA.debugLineNum = 107675650;BA.debugLine="End Sub";
return null;
}
public String  _characterstostring(b4j.docU.regexbuilder __ref,anywheresoftware.b4a.objects.collections.List _chars) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "characterstostring", false))
	 {return ((String) Debug.delegate(ba, "characterstostring", new Object[] {_chars}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _s = "";
RDebugUtils.currentLine=107741184;
 //BA.debugLineNum = 107741184;BA.debugLine="Private Sub CharactersToString (chars As List) As";
RDebugUtils.currentLine=107741185;
 //BA.debugLineNum = 107741185;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=107741186;
 //BA.debugLineNum = 107741186;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=107741187;
 //BA.debugLineNum = 107741187;BA.debugLine="For Each s As String In chars";
{
final anywheresoftware.b4a.BA.IterableList group3 = _chars;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_s = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=107741188;
 //BA.debugLineNum = 107741188;BA.debugLine="sb.Append(s)";
_sb.Append(_s);
 }
};
RDebugUtils.currentLine=107741190;
 //BA.debugLineNum = 107741190;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=107741191;
 //BA.debugLineNum = 107741191;BA.debugLine="End Sub";
return "";
}
public b4j.docU.regexbuilder  _appendanyof(b4j.docU.regexbuilder __ref,anywheresoftware.b4a.objects.collections.List _characters) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendanyof", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendanyof", new Object[] {_characters}));}
RDebugUtils.currentLine=107610112;
 //BA.debugLineNum = 107610112;BA.debugLine="Public Sub AppendAnyOf (Characters As List) As Reg";
RDebugUtils.currentLine=107610113;
 //BA.debugLineNum = 107610113;BA.debugLine="Return Append(\"[\" & CharactersToString(Characters";
if (true) return __ref._append /*b4j.docU.regexbuilder*/ (null,"["+__ref._characterstostring /*String*/ (null,_characters)+"]");
RDebugUtils.currentLine=107610114;
 //BA.debugLineNum = 107610114;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendatleastone(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendatleastone", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendatleastone", null));}
RDebugUtils.currentLine=107872256;
 //BA.debugLineNum = 107872256;BA.debugLine="Public Sub AppendAtLeastOne As RegexBuilder";
RDebugUtils.currentLine=107872257;
 //BA.debugLineNum = 107872257;BA.debugLine="Return AddRegex(\"+\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"+");
RDebugUtils.currentLine=107872258;
 //BA.debugLineNum = 107872258;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendatmostone(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendatmostone", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendatmostone", null));}
RDebugUtils.currentLine=107806720;
 //BA.debugLineNum = 107806720;BA.debugLine="Public Sub AppendAtMostOne As RegexBuilder";
RDebugUtils.currentLine=107806721;
 //BA.debugLineNum = 107806721;BA.debugLine="Return AddRegex(\"?\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"?");
RDebugUtils.currentLine=107806722;
 //BA.debugLineNum = 107806722;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendcount(b4j.docU.regexbuilder __ref,int _minvalue,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendcount", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendcount", new Object[] {_minvalue,_maxvalue}));}
RDebugUtils.currentLine=108003328;
 //BA.debugLineNum = 108003328;BA.debugLine="Public Sub AppendCount(MinValue As Int, MaxValue A";
RDebugUtils.currentLine=108003329;
 //BA.debugLineNum = 108003329;BA.debugLine="pat.Append(\"{\").Append(MinValue).Append(\",\").Appe";
__ref._pat /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append("{").Append(BA.NumberToString(_minvalue)).Append(",").Append(BA.NumberToString(_maxvalue)).Append("}");
RDebugUtils.currentLine=108003330;
 //BA.debugLineNum = 108003330;BA.debugLine="Return Me";
if (true) return (b4j.docU.regexbuilder)(this);
RDebugUtils.currentLine=108003331;
 //BA.debugLineNum = 108003331;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendendstring(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendendstring", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendendstring", null));}
RDebugUtils.currentLine=108199936;
 //BA.debugLineNum = 108199936;BA.debugLine="Public Sub AppendEndString As RegexBuilder";
RDebugUtils.currentLine=108199937;
 //BA.debugLineNum = 108199937;BA.debugLine="Return AddRegex(\"$\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"$");
RDebugUtils.currentLine=108199938;
 //BA.debugLineNum = 108199938;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendescaped(b4j.docU.regexbuilder __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendescaped", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendescaped", new Object[] {_value}));}
RDebugUtils.currentLine=107479040;
 //BA.debugLineNum = 107479040;BA.debugLine="Public Sub AppendEscaped (Value As String) As Rege";
RDebugUtils.currentLine=107479041;
 //BA.debugLineNum = 107479041;BA.debugLine="Return Append(Escape(Value))";
if (true) return __ref._append /*b4j.docU.regexbuilder*/ (null,__ref._escape /*String*/ (null,_value));
RDebugUtils.currentLine=107479042;
 //BA.debugLineNum = 107479042;BA.debugLine="End Sub";
return null;
}
public String  _escape(b4j.docU.regexbuilder __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "escape", false))
	 {return ((String) Debug.delegate(ba, "escape", new Object[] {_value}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _start = 0;
RDebugUtils.currentLine=107282432;
 //BA.debugLineNum = 107282432;BA.debugLine="Public Sub Escape(Value As String) As String";
RDebugUtils.currentLine=107282433;
 //BA.debugLineNum = 107282433;BA.debugLine="Dim i As Int = Value.IndexOf(\"\\E\")";
_i = _value.indexOf("\\E");
RDebugUtils.currentLine=107282434;
 //BA.debugLineNum = 107282434;BA.debugLine="If i = -1 Then Return \"\\Q\" & Value & \"\\E\"";
if (_i==-1) { 
if (true) return "\\Q"+_value+"\\E";};
RDebugUtils.currentLine=107282435;
 //BA.debugLineNum = 107282435;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=107282436;
 //BA.debugLineNum = 107282436;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=107282437;
 //BA.debugLineNum = 107282437;BA.debugLine="sb.Append(\"\\Q\")";
_sb.Append("\\Q");
RDebugUtils.currentLine=107282438;
 //BA.debugLineNum = 107282438;BA.debugLine="Dim start As Int = 0";
_start = (int) (0);
RDebugUtils.currentLine=107282439;
 //BA.debugLineNum = 107282439;BA.debugLine="Do While i > -1";
while (_i>-1) {
RDebugUtils.currentLine=107282440;
 //BA.debugLineNum = 107282440;BA.debugLine="sb.Append(Value.SubString2(start, i))";
_sb.Append(_value.substring(_start,_i));
RDebugUtils.currentLine=107282441;
 //BA.debugLineNum = 107282441;BA.debugLine="sb.Append(\"\\E\\\\E\\Q\")";
_sb.Append("\\E\\\\E\\Q");
RDebugUtils.currentLine=107282442;
 //BA.debugLineNum = 107282442;BA.debugLine="start = i + 2";
_start = (int) (_i+2);
RDebugUtils.currentLine=107282443;
 //BA.debugLineNum = 107282443;BA.debugLine="i = Value.IndexOf2(\"\\E\", start)";
_i = _value.indexOf("\\E",_start);
 }
;
RDebugUtils.currentLine=107282445;
 //BA.debugLineNum = 107282445;BA.debugLine="sb.Append(Value.SubString(start)).Append(\"\\E\")";
_sb.Append(_value.substring(_start)).Append("\\E");
RDebugUtils.currentLine=107282446;
 //BA.debugLineNum = 107282446;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=107282447;
 //BA.debugLineNum = 107282447;BA.debugLine="End Sub";
return "";
}
public b4j.docU.regexbuilder  _appendor(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendor", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendor", null));}
RDebugUtils.currentLine=108068864;
 //BA.debugLineNum = 108068864;BA.debugLine="Public Sub AppendOr As RegexBuilder";
RDebugUtils.currentLine=108068865;
 //BA.debugLineNum = 108068865;BA.debugLine="Return AddRegex(\"|\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"|");
RDebugUtils.currentLine=108068866;
 //BA.debugLineNum = 108068866;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendstartstring(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendstartstring", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendstartstring", null));}
RDebugUtils.currentLine=108134400;
 //BA.debugLineNum = 108134400;BA.debugLine="Public Sub AppendStartString As RegexBuilder";
RDebugUtils.currentLine=108134401;
 //BA.debugLineNum = 108134401;BA.debugLine="Return AddRegex(\"^\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"^");
RDebugUtils.currentLine=108134402;
 //BA.debugLineNum = 108134402;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _appendzeroormore(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "appendzeroormore", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "appendzeroormore", null));}
RDebugUtils.currentLine=107937792;
 //BA.debugLineNum = 107937792;BA.debugLine="Public Sub AppendZeroOrMore As RegexBuilder";
RDebugUtils.currentLine=107937793;
 //BA.debugLineNum = 107937793;BA.debugLine="Return AddRegex(\"*\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"*");
RDebugUtils.currentLine=107937794;
 //BA.debugLineNum = 107937794;BA.debugLine="End Sub";
return null;
}
public String  _charany(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "charany", false))
	 {return ((String) Debug.delegate(ba, "charany", null));}
RDebugUtils.currentLine=109182976;
 //BA.debugLineNum = 109182976;BA.debugLine="Public Sub CharAny As String";
RDebugUtils.currentLine=109182977;
 //BA.debugLineNum = 109182977;BA.debugLine="Return \".\"";
if (true) return ".";
RDebugUtils.currentLine=109182978;
 //BA.debugLineNum = 109182978;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
RDebugUtils.currentLine=107085824;
 //BA.debugLineNum = 107085824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=107085825;
 //BA.debugLineNum = 107085825;BA.debugLine="Private pat As StringBuilder";
_pat = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=107085826;
 //BA.debugLineNum = 107085826;BA.debugLine="End Sub";
return "";
}
public b4j.docU.regexbuilder  _clear(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=107216896;
 //BA.debugLineNum = 107216896;BA.debugLine="Public Sub Clear As RegexBuilder";
RDebugUtils.currentLine=107216897;
 //BA.debugLineNum = 107216897;BA.debugLine="pat.Initialize";
__ref._pat /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=107216898;
 //BA.debugLineNum = 107216898;BA.debugLine="Return Me";
if (true) return (b4j.docU.regexbuilder)(this);
RDebugUtils.currentLine=107216899;
 //BA.debugLineNum = 107216899;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _endcapture(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "endcapture", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "endcapture", null));}
RDebugUtils.currentLine=108331008;
 //BA.debugLineNum = 108331008;BA.debugLine="Public Sub EndCapture As RegexBuilder";
RDebugUtils.currentLine=108331009;
 //BA.debugLineNum = 108331009;BA.debugLine="Return AddRegex(\")\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,")");
RDebugUtils.currentLine=108331010;
 //BA.debugLineNum = 108331010;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _endnoncapture(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "endnoncapture", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "endnoncapture", null));}
RDebugUtils.currentLine=108462080;
 //BA.debugLineNum = 108462080;BA.debugLine="Public Sub EndNonCapture As RegexBuilder";
RDebugUtils.currentLine=108462081;
 //BA.debugLineNum = 108462081;BA.debugLine="Return AddRegex(\")\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,")");
RDebugUtils.currentLine=108462082;
 //BA.debugLineNum = 108462082;BA.debugLine="End Sub";
return null;
}
public String  _getchardigit(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getchardigit", false))
	 {return ((String) Debug.delegate(ba, "getchardigit", null));}
RDebugUtils.currentLine=108855296;
 //BA.debugLineNum = 108855296;BA.debugLine="Public Sub getCharDigit As String";
RDebugUtils.currentLine=108855297;
 //BA.debugLineNum = 108855297;BA.debugLine="Return \"\\d\"";
if (true) return "\\d";
RDebugUtils.currentLine=108855298;
 //BA.debugLineNum = 108855298;BA.debugLine="End Sub";
return "";
}
public String  _getcharnondigit(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharnondigit", false))
	 {return ((String) Debug.delegate(ba, "getcharnondigit", null));}
RDebugUtils.currentLine=108789760;
 //BA.debugLineNum = 108789760;BA.debugLine="Public Sub getCharNonDigit As String";
RDebugUtils.currentLine=108789761;
 //BA.debugLineNum = 108789761;BA.debugLine="Return \"\\D\"";
if (true) return "\\D";
RDebugUtils.currentLine=108789762;
 //BA.debugLineNum = 108789762;BA.debugLine="End Sub";
return "";
}
public String  _getcharnonwhitespace(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharnonwhitespace", false))
	 {return ((String) Debug.delegate(ba, "getcharnonwhitespace", null));}
RDebugUtils.currentLine=108986368;
 //BA.debugLineNum = 108986368;BA.debugLine="Public Sub getCharNonWhitespace As String";
RDebugUtils.currentLine=108986369;
 //BA.debugLineNum = 108986369;BA.debugLine="Return \"\\S\"";
if (true) return "\\S";
RDebugUtils.currentLine=108986370;
 //BA.debugLineNum = 108986370;BA.debugLine="End Sub";
return "";
}
public String  _getcharnonword(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharnonword", false))
	 {return ((String) Debug.delegate(ba, "getcharnonword", null));}
RDebugUtils.currentLine=108724224;
 //BA.debugLineNum = 108724224;BA.debugLine="Public Sub getCharNonWord As String";
RDebugUtils.currentLine=108724225;
 //BA.debugLineNum = 108724225;BA.debugLine="Return \"\\W\"";
if (true) return "\\W";
RDebugUtils.currentLine=108724226;
 //BA.debugLineNum = 108724226;BA.debugLine="End Sub";
return "";
}
public String  _getcharquote(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharquote", false))
	 {return ((String) Debug.delegate(ba, "getcharquote", null));}
RDebugUtils.currentLine=108593152;
 //BA.debugLineNum = 108593152;BA.debugLine="Public Sub getCharQuote As String";
RDebugUtils.currentLine=108593153;
 //BA.debugLineNum = 108593153;BA.debugLine="Return $\"\\\"\"$";
if (true) return ("\\\"");
RDebugUtils.currentLine=108593154;
 //BA.debugLineNum = 108593154;BA.debugLine="End Sub";
return "";
}
public String  _getchartab(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getchartab", false))
	 {return ((String) Debug.delegate(ba, "getchartab", null));}
RDebugUtils.currentLine=108527616;
 //BA.debugLineNum = 108527616;BA.debugLine="Public Sub getCharTab As String";
RDebugUtils.currentLine=108527617;
 //BA.debugLineNum = 108527617;BA.debugLine="Return \"\\t\"";
if (true) return "\\t";
RDebugUtils.currentLine=108527618;
 //BA.debugLineNum = 108527618;BA.debugLine="End Sub";
return "";
}
public String  _getcharunixnewline(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharunixnewline", false))
	 {return ((String) Debug.delegate(ba, "getcharunixnewline", null));}
RDebugUtils.currentLine=109117440;
 //BA.debugLineNum = 109117440;BA.debugLine="Public Sub getCharUnixNewLine As String";
RDebugUtils.currentLine=109117441;
 //BA.debugLineNum = 109117441;BA.debugLine="Return \"\\n\"";
if (true) return "\\n";
RDebugUtils.currentLine=109117442;
 //BA.debugLineNum = 109117442;BA.debugLine="End Sub";
return "";
}
public String  _getcharwhitespace(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharwhitespace", false))
	 {return ((String) Debug.delegate(ba, "getcharwhitespace", null));}
RDebugUtils.currentLine=108920832;
 //BA.debugLineNum = 108920832;BA.debugLine="Public Sub getCharWhitespace As String";
RDebugUtils.currentLine=108920833;
 //BA.debugLineNum = 108920833;BA.debugLine="Return \"\\s\"";
if (true) return "\\s";
RDebugUtils.currentLine=108920834;
 //BA.debugLineNum = 108920834;BA.debugLine="End Sub";
return "";
}
public String  _getcharwindowsnewline(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharwindowsnewline", false))
	 {return ((String) Debug.delegate(ba, "getcharwindowsnewline", null));}
RDebugUtils.currentLine=109051904;
 //BA.debugLineNum = 109051904;BA.debugLine="Public Sub getCharWindowsNewLine As String";
RDebugUtils.currentLine=109051905;
 //BA.debugLineNum = 109051905;BA.debugLine="Return \"\\r\\n\"";
if (true) return "\\r\\n";
RDebugUtils.currentLine=109051906;
 //BA.debugLineNum = 109051906;BA.debugLine="End Sub";
return "";
}
public String  _getcharword(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getcharword", false))
	 {return ((String) Debug.delegate(ba, "getcharword", null));}
RDebugUtils.currentLine=108658688;
 //BA.debugLineNum = 108658688;BA.debugLine="Public Sub getCharWord As String";
RDebugUtils.currentLine=108658689;
 //BA.debugLineNum = 108658689;BA.debugLine="Return \"\\w\"";
if (true) return "\\w";
RDebugUtils.currentLine=108658690;
 //BA.debugLineNum = 108658690;BA.debugLine="End Sub";
return "";
}
public String  _getpattern(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "getpattern", false))
	 {return ((String) Debug.delegate(ba, "getpattern", null));}
RDebugUtils.currentLine=107347968;
 //BA.debugLineNum = 107347968;BA.debugLine="Public Sub getPattern As String";
RDebugUtils.currentLine=107347969;
 //BA.debugLineNum = 107347969;BA.debugLine="Return pat.ToString";
if (true) return __ref._pat /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString();
RDebugUtils.currentLine=107347970;
 //BA.debugLineNum = 107347970;BA.debugLine="End Sub";
return "";
}
public b4j.docU.regexbuilder  _initialize(b4j.docU.regexbuilder __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=107151360;
 //BA.debugLineNum = 107151360;BA.debugLine="Public Sub Initialize As RegexBuilder";
RDebugUtils.currentLine=107151361;
 //BA.debugLineNum = 107151361;BA.debugLine="Clear";
__ref._clear /*b4j.docU.regexbuilder*/ (null);
RDebugUtils.currentLine=107151362;
 //BA.debugLineNum = 107151362;BA.debugLine="Return Me";
if (true) return (b4j.docU.regexbuilder)(this);
RDebugUtils.currentLine=107151363;
 //BA.debugLineNum = 107151363;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _startcapture(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "startcapture", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "startcapture", null));}
RDebugUtils.currentLine=108265472;
 //BA.debugLineNum = 108265472;BA.debugLine="Public Sub StartCapture As RegexBuilder";
RDebugUtils.currentLine=108265473;
 //BA.debugLineNum = 108265473;BA.debugLine="Return AddRegex(\"(\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"(");
RDebugUtils.currentLine=108265474;
 //BA.debugLineNum = 108265474;BA.debugLine="End Sub";
return null;
}
public b4j.docU.regexbuilder  _startnoncapture(b4j.docU.regexbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="regexbuilder";
if (Debug.shouldDelegate(ba, "startnoncapture", false))
	 {return ((b4j.docU.regexbuilder) Debug.delegate(ba, "startnoncapture", null));}
RDebugUtils.currentLine=108396544;
 //BA.debugLineNum = 108396544;BA.debugLine="Public Sub StartNonCapture As RegexBuilder";
RDebugUtils.currentLine=108396545;
 //BA.debugLineNum = 108396545;BA.debugLine="Return AddRegex(\"(?:\")";
if (true) return __ref._addregex /*b4j.docU.regexbuilder*/ (null,"(?:");
RDebugUtils.currentLine=108396546;
 //BA.debugLineNum = 108396546;BA.debugLine="End Sub";
return null;
}
}