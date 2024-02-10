package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class csvparser_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private CurrentIndex As Int";
csvparser._currentindex = RemoteObject.createImmutable(0);__ref.setField("_currentindex",csvparser._currentindex);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _generatestring(RemoteObject __ref,RemoteObject _table,RemoteObject _separatorchar) throws Exception{
try {
		Debug.PushSubsStack("GenerateString (csvparser) ","csvparser",48,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("generatestring")) { return __ref.runUserSub(false, "csvparser","generatestring", __ref, _table, _separatorchar);}
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _row = null;
int _i = 0;
RemoteObject _wrap = RemoteObject.createImmutable(false);
RemoteObject _word = RemoteObject.createImmutable("");
Debug.locals.put("Table", _table);
Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 10;BA.debugLine="Public Sub GenerateString (Table As List, Separato";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim eol As String = Chr(10)";
Debug.ShouldStop(1024);
_eol = BA.ObjectToString(csvparser.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 12;BA.debugLine="If Table.Size = 0 Then Return \"\"";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_table.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 13;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4096);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 14;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="For Each row() As String In Table";
Debug.ShouldStop(16384);
{
final RemoteObject group5 = _table;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (group5.runMethod(false,"Get",index5));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 16;BA.debugLine="For i = 0 To row.Length - 1";
Debug.ShouldStop(32768);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 17;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(65536);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 18;BA.debugLine="Dim word As String = row(i)";
Debug.ShouldStop(131072);
_word = _row.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 19;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
Debug.ShouldStop(262144);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = csvparser.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 20;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(524288);
if (_word.runMethod(true,"contains",(Object)(csvparser.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 21;BA.debugLine="Wrap = True";
Debug.ShouldStop(1048576);
_wrap = csvparser.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 22;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(2097152);
_word = _word.runMethod(true,"replace",(Object)(csvparser.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 24;BA.debugLine="If Wrap Then";
Debug.ShouldStop(8388608);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 25;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(csvparser.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(csvparser.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 27;BA.debugLine="sb.Append(word)";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(_word));
 };
 BA.debugLineNum = 29;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 31;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 32;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(_eol));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 34;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_eol.runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (csvparser) ","csvparser",48,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "csvparser","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parse(RemoteObject __ref,RemoteObject _input,RemoteObject _separatorchar,RemoteObject _skipfirstrow) throws Exception{
try {
		Debug.PushSubsStack("Parse (csvparser) ","csvparser",48,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("parse")) { return __ref.runUserSub(false, "csvparser","parse", __ref, _input, _separatorchar, _skipfirstrow);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _row = null;
Debug.locals.put("Input", _input);
Debug.locals.put("SeparatorChar", _separatorchar);
Debug.locals.put("SkipFirstRow", _skipfirstrow);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Parse (Input As String, SeparatorChar A";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="SeparatorChar = SeparatorChar.CharAt(0)";
Debug.ShouldStop(64);
_separatorchar = BA.ObjectToString(_separatorchar.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 40;BA.debugLine="Dim Result As List";
Debug.ShouldStop(128);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Result", _result);
 BA.debugLineNum = 41;BA.debugLine="Result.Initialize";
Debug.ShouldStop(256);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="If Input = \"\" Then Return Result";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_input,BA.ObjectToString(""))) { 
if (true) return _result;};
 BA.debugLineNum = 43;BA.debugLine="CurrentIndex = 0";
Debug.ShouldStop(1024);
__ref.setField ("_currentindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 44;BA.debugLine="Dim count As Int = ReadLine(Input, Null, True, Se";
Debug.ShouldStop(2048);
_count = __ref.runClassMethod (b4j.docU.csvparser.class, "_readline" /*RemoteObject*/ ,(Object)(_input),(Object)((csvparser.__c.getField(false,"Null"))),(Object)(csvparser.__c.getField(true,"True")),(Object)(_separatorchar));Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 45;BA.debugLine="If SkipFirstRow = False Then CurrentIndex = 0";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_skipfirstrow,csvparser.__c.getField(true,"False"))) { 
__ref.setField ("_currentindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));};
 BA.debugLineNum = 46;BA.debugLine="Do While CurrentIndex < Input.Length";
Debug.ShouldStop(8192);
while (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _input.runMethod(true,"length")))) {
 BA.debugLineNum = 47;BA.debugLine="Dim row(count) As String";
Debug.ShouldStop(16384);
_row = RemoteObject.createNewArray ("String", new int[] {_count.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 48;BA.debugLine="ReadLine(Input, row, False, SeparatorChar)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.csvparser.class, "_readline" /*RemoteObject*/ ,(Object)(_input),(Object)(_row),(Object)(csvparser.__c.getField(true,"False")),(Object)(_separatorchar));
 BA.debugLineNum = 49;BA.debugLine="Result.Add(row)";
Debug.ShouldStop(65536);
_result.runVoidMethod ("Add",(Object)((_row)));
 }
;
 BA.debugLineNum = 51;BA.debugLine="Return Result";
Debug.ShouldStop(262144);
if (true) return _result;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readline(RemoteObject __ref,RemoteObject _input,RemoteObject _row,RemoteObject _justcount,RemoteObject _sep) throws Exception{
try {
		Debug.PushSubsStack("ReadLine (csvparser) ","csvparser",48,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("readline")) { return __ref.runUserSub(false, "csvparser","readline", __ref, _input, _row, _justcount, _sep);}
RemoteObject _insidequotes = RemoteObject.createImmutable(false);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.createImmutable("");
Debug.locals.put("Input", _input);
Debug.locals.put("Row", _row);
Debug.locals.put("JustCount", _justcount);
Debug.locals.put("Sep", _sep);
 BA.debugLineNum = 54;BA.debugLine="Private Sub ReadLine(Input As String, Row() As Str";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim InsideQuotes As Boolean";
Debug.ShouldStop(4194304);
_insidequotes = RemoteObject.createImmutable(false);Debug.locals.put("InsideQuotes", _insidequotes);
 BA.debugLineNum = 56;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 57;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="Dim count As Int";
Debug.ShouldStop(33554432);
_count = RemoteObject.createImmutable(0);Debug.locals.put("count", _count);
 BA.debugLineNum = 59;BA.debugLine="Do While CurrentIndex <= Input.Length";
Debug.ShouldStop(67108864);
while (RemoteObject.solveBoolean("k",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _input.runMethod(true,"length")))) {
 BA.debugLineNum = 60;BA.debugLine="Dim c As String";
Debug.ShouldStop(134217728);
_c = RemoteObject.createImmutable("");Debug.locals.put("c", _c);
 BA.debugLineNum = 61;BA.debugLine="If CurrentIndex < Input.Length Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, _input.runMethod(true,"length")))) { 
 BA.debugLineNum = 62;BA.debugLine="c = Input.CharAt(CurrentIndex)";
Debug.ShouldStop(536870912);
_c = BA.ObjectToString(_input.runMethod(true,"charAt",(Object)(__ref.getField(true,"_currentindex" /*RemoteObject*/ ))));Debug.locals.put("c", _c);
 }else {
 BA.debugLineNum = 64;BA.debugLine="c = Chr(10)";
Debug.ShouldStop(-2147483648);
_c = BA.ObjectToString(csvparser.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("c", _c);
 };
 BA.debugLineNum = 66;BA.debugLine="If InsideQuotes Then";
Debug.ShouldStop(2);
if (_insidequotes.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 67;BA.debugLine="If c = QUOTE Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_c,csvparser.__c.getField(true,"QUOTE"))) { 
 BA.debugLineNum = 69;BA.debugLine="If CurrentIndex < Input.Length - 1 And Input.C";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_currentindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_input.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))) && RemoteObject.solveBoolean("=",_input.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))),BA.ObjectToChar(csvparser.__c.getField(true,"QUOTE")))) { 
 BA.debugLineNum = 70;BA.debugLine="sb.Append(QUOTE)";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(csvparser.__c.getField(true,"QUOTE")));
 BA.debugLineNum = 71;BA.debugLine="CurrentIndex = CurrentIndex + 1";
Debug.ShouldStop(64);
__ref.setField ("_currentindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 }else {
 BA.debugLineNum = 73;BA.debugLine="InsideQuotes = False";
Debug.ShouldStop(256);
_insidequotes = csvparser.__c.getField(true,"False");Debug.locals.put("InsideQuotes", _insidequotes);
 };
 }else {
 BA.debugLineNum = 76;BA.debugLine="sb.Append(c)";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Append",(Object)(_c));
 };
 }else {
 BA.debugLineNum = 79;BA.debugLine="If c = Chr(13) Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString(csvparser.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13)))))) { 
 BA.debugLineNum = 80;BA.debugLine="CurrentIndex = CurrentIndex + 1";
Debug.ShouldStop(32768);
__ref.setField ("_currentindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 81;BA.debugLine="Continue";
Debug.ShouldStop(65536);
if (true) continue;
 }else 
{ BA.debugLineNum = 82;BA.debugLine="Else If c = Chr(10) Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString(csvparser.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10)))))) { 
 BA.debugLineNum = 83;BA.debugLine="If JustCount = False Then Row(count) = sb.ToSt";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_justcount,csvparser.__c.getField(true,"False"))) { 
_row.setArrayElement (_sb.runMethod(true,"ToString"),_count);};
 BA.debugLineNum = 84;BA.debugLine="count = count + 1";
Debug.ShouldStop(524288);
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 85;BA.debugLine="CurrentIndex = CurrentIndex + 1";
Debug.ShouldStop(1048576);
__ref.setField ("_currentindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 86;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 }else 
{ BA.debugLineNum = 87;BA.debugLine="Else If c = Sep Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_c,_sep)) { 
 BA.debugLineNum = 88;BA.debugLine="If JustCount = False Then Row(count) = sb.ToSt";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_justcount,csvparser.__c.getField(true,"False"))) { 
_row.setArrayElement (_sb.runMethod(true,"ToString"),_count);};
 BA.debugLineNum = 89;BA.debugLine="sb.Remove(0, sb.Length)";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Remove",(Object)(BA.numberCast(int.class, 0)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 90;BA.debugLine="count = count + 1";
Debug.ShouldStop(33554432);
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 91;BA.debugLine="InsideQuotes = False";
Debug.ShouldStop(67108864);
_insidequotes = csvparser.__c.getField(true,"False");Debug.locals.put("InsideQuotes", _insidequotes);
 }else 
{ BA.debugLineNum = 92;BA.debugLine="Else If c = QUOTE Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_c,csvparser.__c.getField(true,"QUOTE"))) { 
 BA.debugLineNum = 93;BA.debugLine="InsideQuotes = True";
Debug.ShouldStop(268435456);
_insidequotes = csvparser.__c.getField(true,"True");Debug.locals.put("InsideQuotes", _insidequotes);
 }else {
 BA.debugLineNum = 95;BA.debugLine="sb.Append(c)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(_c));
 }}}}
;
 };
 BA.debugLineNum = 98;BA.debugLine="CurrentIndex = CurrentIndex + 1";
Debug.ShouldStop(2);
__ref.setField ("_currentindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 }
;
 BA.debugLineNum = 100;BA.debugLine="Return count";
Debug.ShouldStop(8);
if (true) return _count;
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}