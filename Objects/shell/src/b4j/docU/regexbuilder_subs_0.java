package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class regexbuilder_subs_0 {


public static RemoteObject  _addregex(RemoteObject __ref,RemoteObject _regexpattern) throws Exception{
try {
		Debug.PushSubsStack("AddRegex (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("addregex")) { return __ref.runUserSub(false, "regexbuilder","addregex", __ref, _regexpattern);}
Debug.locals.put("RegexPattern", _regexpattern);
 BA.debugLineNum = 53;BA.debugLine="Private Sub AddRegex(RegexPattern As String) As Re";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="pat.Append(RegexPattern)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pat" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_regexpattern));
 BA.debugLineNum = 55;BA.debugLine="Return Me";
Debug.ShouldStop(4194304);
if (true) return (__ref);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _append(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Append (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("append")) { return __ref.runUserSub(false, "regexbuilder","append", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 44;BA.debugLine="Public Sub Append(Value As String) As RegexBuilder";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return AddRegex(\"(?:\" & Value & \")\")";
Debug.ShouldStop(4096);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("(?:"),_value,RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendanybut(RemoteObject __ref,RemoteObject _characters) throws Exception{
try {
		Debug.PushSubsStack("AppendAnyBut (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("appendanybut")) { return __ref.runUserSub(false, "regexbuilder","appendanybut", __ref, _characters);}
Debug.locals.put("Characters", _characters);
 BA.debugLineNum = 64;BA.debugLine="Public Sub AppendAnyBut (Characters As List) As Re";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Return Append(\"[^\" & CharactersToString(Character";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_append" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("[^"),__ref.runClassMethod (b4j.docU.regexbuilder.class, "_characterstostring" /*RemoteObject*/ ,(Object)(_characters)),RemoteObject.createImmutable("]"))));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendanyof(RemoteObject __ref,RemoteObject _characters) throws Exception{
try {
		Debug.PushSubsStack("AppendAnyOf (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("appendanyof")) { return __ref.runUserSub(false, "regexbuilder","appendanyof", __ref, _characters);}
Debug.locals.put("Characters", _characters);
 BA.debugLineNum = 59;BA.debugLine="Public Sub AppendAnyOf (Characters As List) As Reg";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Return Append(\"[\" & CharactersToString(Characters";
Debug.ShouldStop(134217728);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_append" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),__ref.runClassMethod (b4j.docU.regexbuilder.class, "_characterstostring" /*RemoteObject*/ ,(Object)(_characters)),RemoteObject.createImmutable("]"))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendatleastone(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppendAtLeastOne (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("appendatleastone")) { return __ref.runUserSub(false, "regexbuilder","appendatleastone", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Public Sub AppendAtLeastOne As RegexBuilder";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="Return AddRegex(\"+\")";
Debug.ShouldStop(262144);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("+")));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendatmostone(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppendAtMostOne (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("appendatmostone")) { return __ref.runUserSub(false, "regexbuilder","appendatmostone", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub AppendAtMostOne As RegexBuilder";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Return AddRegex(\"?\")";
Debug.ShouldStop(16384);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendcount(RemoteObject __ref,RemoteObject _minvalue,RemoteObject _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("AppendCount (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("appendcount")) { return __ref.runUserSub(false, "regexbuilder","appendcount", __ref, _minvalue, _maxvalue);}
Debug.locals.put("MinValue", _minvalue);
Debug.locals.put("MaxValue", _maxvalue);
 BA.debugLineNum = 91;BA.debugLine="Public Sub AppendCount(MinValue As Int, MaxValue A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="pat.Append(\"{\").Append(MinValue).Append(\",\").Appe";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pat" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("{"))).runMethod(false,"Append",(Object)(BA.NumberToString(_minvalue))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(","))).runMethod(false,"Append",(Object)(BA.NumberToString(_maxvalue))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("}")));
 BA.debugLineNum = 93;BA.debugLine="Return Me";
Debug.ShouldStop(268435456);
if (true) return (__ref);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendendstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppendEndString (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("appendendstring")) { return __ref.runUserSub(false, "regexbuilder","appendendstring", __ref);}
 BA.debugLineNum = 104;BA.debugLine="Public Sub AppendEndString As RegexBuilder";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Return AddRegex(\"$\")";
Debug.ShouldStop(256);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("$")));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendescaped(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AppendEscaped (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("appendescaped")) { return __ref.runUserSub(false, "regexbuilder","appendescaped", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 49;BA.debugLine="Public Sub AppendEscaped (Value As String) As Rege";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Return Append(Escape(Value))";
Debug.ShouldStop(131072);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_append" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.docU.regexbuilder.class, "_escape" /*RemoteObject*/ ,(Object)(_value))));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppendOr (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("appendor")) { return __ref.runUserSub(false, "regexbuilder","appendor", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Public Sub AppendOr As RegexBuilder";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Return AddRegex(\"|\")";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("|")));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendstartstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppendStartString (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("appendstartstring")) { return __ref.runUserSub(false, "regexbuilder","appendstartstring", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Public Sub AppendStartString As RegexBuilder";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Return AddRegex(\"^\")";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("^")));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendzeroormore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppendZeroOrMore (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("appendzeroormore")) { return __ref.runUserSub(false, "regexbuilder","appendzeroormore", __ref);}
 BA.debugLineNum = 86;BA.debugLine="Public Sub AppendZeroOrMore As RegexBuilder";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Return AddRegex(\"*\")";
Debug.ShouldStop(4194304);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("*")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _characterstostring(RemoteObject __ref,RemoteObject _chars) throws Exception{
try {
		Debug.PushSubsStack("CharactersToString (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("characterstostring")) { return __ref.runUserSub(false, "regexbuilder","characterstostring", __ref, _chars);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("chars", _chars);
 BA.debugLineNum = 68;BA.debugLine="Private Sub CharactersToString (chars As List) As";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 70;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="For Each s As String In chars";
Debug.ShouldStop(64);
{
final RemoteObject group3 = _chars;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_s = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 72;BA.debugLine="sb.Append(s)";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(_s));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 74;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(512);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _charany(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CharAny (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("charany")) { return __ref.runUserSub(false, "regexbuilder","charany", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Public Sub CharAny As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Return \".\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString(".");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private pat As StringBuilder";
regexbuilder._pat = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_pat",regexbuilder._pat);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "regexbuilder","clear", __ref);}
 BA.debugLineNum = 14;BA.debugLine="Public Sub Clear As RegexBuilder";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="pat.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_pat" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return (__ref);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endcapture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndCapture (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("endcapture")) { return __ref.runUserSub(false, "regexbuilder","endcapture", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Public Sub EndCapture As RegexBuilder";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Return AddRegex(\")\")";
Debug.ShouldStop(131072);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _endnoncapture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EndNonCapture (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("endnoncapture")) { return __ref.runUserSub(false, "regexbuilder","endnoncapture", __ref);}
 BA.debugLineNum = 121;BA.debugLine="Public Sub EndNonCapture As RegexBuilder";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Return AddRegex(\")\")";
Debug.ShouldStop(33554432);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escape(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Escape (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("escape")) { return __ref.runUserSub(false, "regexbuilder","escape", __ref, _value);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _start = RemoteObject.createImmutable(0);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Escape(Value As String) As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim i As Int = Value.IndexOf(\"\\E\")";
Debug.ShouldStop(2097152);
_i = _value.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("\\E")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 23;BA.debugLine="If i = -1 Then Return \"\\Q\" & Value & \"\\E\"";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return RemoteObject.concat(RemoteObject.createImmutable("\\Q"),_value,RemoteObject.createImmutable("\\E"));};
 BA.debugLineNum = 24;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 25;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="sb.Append(\"\\Q\")";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("\\Q")));
 BA.debugLineNum = 27;BA.debugLine="Dim start As Int = 0";
Debug.ShouldStop(67108864);
_start = BA.numberCast(int.class, 0);Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 28;BA.debugLine="Do While i > -1";
Debug.ShouldStop(134217728);
while (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, -(double) (0 + 1)))) {
 BA.debugLineNum = 29;BA.debugLine="sb.Append(Value.SubString2(start, i))";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(_value.runMethod(true,"substring",(Object)(_start),(Object)(_i))));
 BA.debugLineNum = 30;BA.debugLine="sb.Append(\"\\E\\\\E\\Q\")";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("\\E\\\\E\\Q")));
 BA.debugLineNum = 31;BA.debugLine="start = i + 2";
Debug.ShouldStop(1073741824);
_start = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1);Debug.locals.put("start", _start);
 BA.debugLineNum = 32;BA.debugLine="i = Value.IndexOf2(\"\\E\", start)";
Debug.ShouldStop(-2147483648);
_i = _value.runMethod(true,"indexOf",(Object)(BA.ObjectToString("\\E")),(Object)(_start));Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 34;BA.debugLine="sb.Append(Value.SubString(start)).Append(\"\\E\")";
Debug.ShouldStop(2);
_sb.runMethod(false,"Append",(Object)(_value.runMethod(true,"substring",(Object)(_start)))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("\\E")));
 BA.debugLineNum = 35;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(4);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchardigit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharDigit (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("getchardigit")) { return __ref.runUserSub(false, "regexbuilder","getchardigit", __ref);}
 BA.debugLineNum = 145;BA.debugLine="Public Sub getCharDigit As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Return \"\\d\"";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString("\\d");
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharnondigit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharNonDigit (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("getcharnondigit")) { return __ref.runUserSub(false, "regexbuilder","getcharnondigit", __ref);}
 BA.debugLineNum = 141;BA.debugLine="Public Sub getCharNonDigit As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Return \"\\D\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("\\D");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharnonwhitespace(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharNonWhitespace (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("getcharnonwhitespace")) { return __ref.runUserSub(false, "regexbuilder","getcharnonwhitespace", __ref);}
 BA.debugLineNum = 153;BA.debugLine="Public Sub getCharNonWhitespace As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Return \"\\S\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("\\S");
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharnonword(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharNonWord (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("getcharnonword")) { return __ref.runUserSub(false, "regexbuilder","getcharnonword", __ref);}
 BA.debugLineNum = 137;BA.debugLine="Public Sub getCharNonWord As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Return \"\\W\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("\\W");
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharquote(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharQuote (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("getcharquote")) { return __ref.runUserSub(false, "regexbuilder","getcharquote", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Public Sub getCharQuote As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Return $\"\\\"\"$";
Debug.ShouldStop(2);
if (true) return (RemoteObject.createImmutable("\\\""));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchartab(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharTab (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("getchartab")) { return __ref.runUserSub(false, "regexbuilder","getchartab", __ref);}
 BA.debugLineNum = 125;BA.debugLine="Public Sub getCharTab As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Return \"\\t\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("\\t");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharunixnewline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharUnixNewLine (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("getcharunixnewline")) { return __ref.runUserSub(false, "regexbuilder","getcharunixnewline", __ref);}
 BA.debugLineNum = 161;BA.debugLine="Public Sub getCharUnixNewLine As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Return \"\\n\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("\\n");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharwhitespace(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharWhitespace (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("getcharwhitespace")) { return __ref.runUserSub(false, "regexbuilder","getcharwhitespace", __ref);}
 BA.debugLineNum = 149;BA.debugLine="Public Sub getCharWhitespace As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Return \"\\s\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("\\s");
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharwindowsnewline(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharWindowsNewLine (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("getcharwindowsnewline")) { return __ref.runUserSub(false, "regexbuilder","getcharwindowsnewline", __ref);}
 BA.debugLineNum = 157;BA.debugLine="Public Sub getCharWindowsNewLine As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Return \"\\r\\n\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("\\r\\n");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharword(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCharWord (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("getcharword")) { return __ref.runUserSub(false, "regexbuilder","getcharword", __ref);}
 BA.debugLineNum = 133;BA.debugLine="Public Sub getCharWord As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Return \"\\w\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("\\w");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpattern(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPattern (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("getpattern")) { return __ref.runUserSub(false, "regexbuilder","getpattern", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub getPattern As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Return pat.ToString";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_pat" /*RemoteObject*/ ).runMethod(true,"ToString");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "regexbuilder","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize As RegexBuilder";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="Clear";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.docU.regexbuilder.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 10;BA.debugLine="Return Me";
Debug.ShouldStop(512);
if (true) return (__ref);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startcapture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartCapture (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("startcapture")) { return __ref.runUserSub(false, "regexbuilder","startcapture", __ref);}
 BA.debugLineNum = 109;BA.debugLine="Public Sub StartCapture As RegexBuilder";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Return AddRegex(\"(\")";
Debug.ShouldStop(8192);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startnoncapture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartNonCapture (regexbuilder) ","regexbuilder",53,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("startnoncapture")) { return __ref.runUserSub(false, "regexbuilder","startnoncapture", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Public Sub StartNonCapture As RegexBuilder";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="Return AddRegex(\"(?:\")";
Debug.ShouldStop(2097152);
if (true) return __ref.runClassMethod (b4j.docU.regexbuilder.class, "_addregex" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("(?:")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}