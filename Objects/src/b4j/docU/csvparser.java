package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class csvparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.csvparser", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.csvparser.class).invoke(this, new Object[] {null});
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
public int _currentindex = 0;
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
public String  _initialize(b4j.docU.csvparser __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="csvparser";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=101842944;
 //BA.debugLineNum = 101842944;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=101842946;
 //BA.debugLineNum = 101842946;BA.debugLine="End Sub";
return "";
}
public String  _generatestring(b4j.docU.csvparser __ref,anywheresoftware.b4a.objects.collections.List _table,String _separatorchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvparser";
if (Debug.shouldDelegate(ba, "generatestring", false))
	 {return ((String) Debug.delegate(ba, "generatestring", new Object[] {_table,_separatorchar}));}
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String[] _row = null;
int _i = 0;
boolean _wrap = false;
String _word = "";
RDebugUtils.currentLine=101908480;
 //BA.debugLineNum = 101908480;BA.debugLine="Public Sub GenerateString (Table As List, Separato";
RDebugUtils.currentLine=101908481;
 //BA.debugLineNum = 101908481;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=101908482;
 //BA.debugLineNum = 101908482;BA.debugLine="If Table.Size = 0 Then Return \"\"";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=101908483;
 //BA.debugLineNum = 101908483;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=101908484;
 //BA.debugLineNum = 101908484;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=101908485;
 //BA.debugLineNum = 101908485;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group5 = _table;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (String[])(group5.Get(index5));
RDebugUtils.currentLine=101908486;
 //BA.debugLineNum = 101908486;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=101908487;
 //BA.debugLineNum = 101908487;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=101908488;
 //BA.debugLineNum = 101908488;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
RDebugUtils.currentLine=101908489;
 //BA.debugLineNum = 101908489;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=101908490;
 //BA.debugLineNum = 101908490;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=101908491;
 //BA.debugLineNum = 101908491;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=101908492;
 //BA.debugLineNum = 101908492;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=101908494;
 //BA.debugLineNum = 101908494;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=101908495;
 //BA.debugLineNum = 101908495;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=101908497;
 //BA.debugLineNum = 101908497;BA.debugLine="sb.Append(word)";
_sb.Append(_word);
 };
RDebugUtils.currentLine=101908499;
 //BA.debugLineNum = 101908499;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=101908501;
 //BA.debugLineNum = 101908501;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=101908502;
 //BA.debugLineNum = 101908502;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
RDebugUtils.currentLine=101908504;
 //BA.debugLineNum = 101908504;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
RDebugUtils.currentLine=101908505;
 //BA.debugLineNum = 101908505;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=101908506;
 //BA.debugLineNum = 101908506;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.csvparser __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvparser";
RDebugUtils.currentLine=101777408;
 //BA.debugLineNum = 101777408;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=101777409;
 //BA.debugLineNum = 101777409;BA.debugLine="Private CurrentIndex As Int";
_currentindex = 0;
RDebugUtils.currentLine=101777410;
 //BA.debugLineNum = 101777410;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _parse(b4j.docU.csvparser __ref,String _input,String _separatorchar,boolean _skipfirstrow) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvparser";
if (Debug.shouldDelegate(ba, "parse", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "parse", new Object[] {_input,_separatorchar,_skipfirstrow}));}
anywheresoftware.b4a.objects.collections.List _result = null;
int _count = 0;
String[] _row = null;
RDebugUtils.currentLine=101974016;
 //BA.debugLineNum = 101974016;BA.debugLine="Public Sub Parse (Input As String, SeparatorChar A";
RDebugUtils.currentLine=101974017;
 //BA.debugLineNum = 101974017;BA.debugLine="SeparatorChar = SeparatorChar.CharAt(0)";
_separatorchar = BA.ObjectToString(_separatorchar.charAt((int) (0)));
RDebugUtils.currentLine=101974018;
 //BA.debugLineNum = 101974018;BA.debugLine="Dim Result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=101974019;
 //BA.debugLineNum = 101974019;BA.debugLine="Result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=101974020;
 //BA.debugLineNum = 101974020;BA.debugLine="If Input = \"\" Then Return Result";
if ((_input).equals("")) { 
if (true) return _result;};
RDebugUtils.currentLine=101974021;
 //BA.debugLineNum = 101974021;BA.debugLine="CurrentIndex = 0";
__ref._currentindex /*int*/  = (int) (0);
RDebugUtils.currentLine=101974022;
 //BA.debugLineNum = 101974022;BA.debugLine="Dim count As Int = ReadLine(Input, Null, True, Se";
_count = __ref._readline /*int*/ (null,_input,(String[])(__c.Null),__c.True,_separatorchar);
RDebugUtils.currentLine=101974023;
 //BA.debugLineNum = 101974023;BA.debugLine="If SkipFirstRow = False Then CurrentIndex = 0";
if (_skipfirstrow==__c.False) { 
__ref._currentindex /*int*/  = (int) (0);};
RDebugUtils.currentLine=101974024;
 //BA.debugLineNum = 101974024;BA.debugLine="Do While CurrentIndex < Input.Length";
while (__ref._currentindex /*int*/ <_input.length()) {
RDebugUtils.currentLine=101974025;
 //BA.debugLineNum = 101974025;BA.debugLine="Dim row(count) As String";
_row = new String[_count];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=101974026;
 //BA.debugLineNum = 101974026;BA.debugLine="ReadLine(Input, row, False, SeparatorChar)";
__ref._readline /*int*/ (null,_input,_row,__c.False,_separatorchar);
RDebugUtils.currentLine=101974027;
 //BA.debugLineNum = 101974027;BA.debugLine="Result.Add(row)";
_result.Add((Object)(_row));
 }
;
RDebugUtils.currentLine=101974029;
 //BA.debugLineNum = 101974029;BA.debugLine="Return Result";
if (true) return _result;
RDebugUtils.currentLine=101974030;
 //BA.debugLineNum = 101974030;BA.debugLine="End Sub";
return null;
}
public int  _readline(b4j.docU.csvparser __ref,String _input,String[] _row,boolean _justcount,String _sep) throws Exception{
__ref = this;
RDebugUtils.currentModule="csvparser";
if (Debug.shouldDelegate(ba, "readline", false))
	 {return ((Integer) Debug.delegate(ba, "readline", new Object[] {_input,_row,_justcount,_sep}));}
boolean _insidequotes = false;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _count = 0;
String _c = "";
RDebugUtils.currentLine=102039552;
 //BA.debugLineNum = 102039552;BA.debugLine="Private Sub ReadLine(Input As String, Row() As Str";
RDebugUtils.currentLine=102039553;
 //BA.debugLineNum = 102039553;BA.debugLine="Dim InsideQuotes As Boolean";
_insidequotes = false;
RDebugUtils.currentLine=102039554;
 //BA.debugLineNum = 102039554;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=102039555;
 //BA.debugLineNum = 102039555;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=102039556;
 //BA.debugLineNum = 102039556;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=102039557;
 //BA.debugLineNum = 102039557;BA.debugLine="Do While CurrentIndex <= Input.Length";
while (__ref._currentindex /*int*/ <=_input.length()) {
RDebugUtils.currentLine=102039558;
 //BA.debugLineNum = 102039558;BA.debugLine="Dim c As String";
_c = "";
RDebugUtils.currentLine=102039559;
 //BA.debugLineNum = 102039559;BA.debugLine="If CurrentIndex < Input.Length Then";
if (__ref._currentindex /*int*/ <_input.length()) { 
RDebugUtils.currentLine=102039560;
 //BA.debugLineNum = 102039560;BA.debugLine="c = Input.CharAt(CurrentIndex)";
_c = BA.ObjectToString(_input.charAt(__ref._currentindex /*int*/ ));
 }else {
RDebugUtils.currentLine=102039562;
 //BA.debugLineNum = 102039562;BA.debugLine="c = Chr(10)";
_c = BA.ObjectToString(__c.Chr((int) (10)));
 };
RDebugUtils.currentLine=102039564;
 //BA.debugLineNum = 102039564;BA.debugLine="If InsideQuotes Then";
if (_insidequotes) { 
RDebugUtils.currentLine=102039565;
 //BA.debugLineNum = 102039565;BA.debugLine="If c = QUOTE Then";
if ((_c).equals(__c.QUOTE)) { 
RDebugUtils.currentLine=102039567;
 //BA.debugLineNum = 102039567;BA.debugLine="If CurrentIndex < Input.Length - 1 And Input.C";
if (__ref._currentindex /*int*/ <_input.length()-1 && _input.charAt((int) (__ref._currentindex /*int*/ +1))==BA.ObjectToChar(__c.QUOTE)) { 
RDebugUtils.currentLine=102039568;
 //BA.debugLineNum = 102039568;BA.debugLine="sb.Append(QUOTE)";
_sb.Append(__c.QUOTE);
RDebugUtils.currentLine=102039569;
 //BA.debugLineNum = 102039569;BA.debugLine="CurrentIndex = CurrentIndex + 1";
__ref._currentindex /*int*/  = (int) (__ref._currentindex /*int*/ +1);
 }else {
RDebugUtils.currentLine=102039571;
 //BA.debugLineNum = 102039571;BA.debugLine="InsideQuotes = False";
_insidequotes = __c.False;
 };
 }else {
RDebugUtils.currentLine=102039574;
 //BA.debugLineNum = 102039574;BA.debugLine="sb.Append(c)";
_sb.Append(_c);
 };
 }else {
RDebugUtils.currentLine=102039577;
 //BA.debugLineNum = 102039577;BA.debugLine="If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
RDebugUtils.currentLine=102039578;
 //BA.debugLineNum = 102039578;BA.debugLine="CurrentIndex = CurrentIndex + 1";
__ref._currentindex /*int*/  = (int) (__ref._currentindex /*int*/ +1);
RDebugUtils.currentLine=102039579;
 //BA.debugLineNum = 102039579;BA.debugLine="Continue";
if (true) continue;
 }else 
{RDebugUtils.currentLine=102039580;
 //BA.debugLineNum = 102039580;BA.debugLine="Else If c = Chr(10) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (10))))) { 
RDebugUtils.currentLine=102039581;
 //BA.debugLineNum = 102039581;BA.debugLine="If JustCount = False Then Row(count) = sb.ToSt";
if (_justcount==__c.False) { 
_row[_count] = _sb.ToString();};
RDebugUtils.currentLine=102039582;
 //BA.debugLineNum = 102039582;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=102039583;
 //BA.debugLineNum = 102039583;BA.debugLine="CurrentIndex = CurrentIndex + 1";
__ref._currentindex /*int*/  = (int) (__ref._currentindex /*int*/ +1);
RDebugUtils.currentLine=102039584;
 //BA.debugLineNum = 102039584;BA.debugLine="Exit";
if (true) break;
 }else 
{RDebugUtils.currentLine=102039585;
 //BA.debugLineNum = 102039585;BA.debugLine="Else If c = Sep Then";
if ((_c).equals(_sep)) { 
RDebugUtils.currentLine=102039586;
 //BA.debugLineNum = 102039586;BA.debugLine="If JustCount = False Then Row(count) = sb.ToSt";
if (_justcount==__c.False) { 
_row[_count] = _sb.ToString();};
RDebugUtils.currentLine=102039587;
 //BA.debugLineNum = 102039587;BA.debugLine="sb.Remove(0, sb.Length)";
_sb.Remove((int) (0),_sb.getLength());
RDebugUtils.currentLine=102039588;
 //BA.debugLineNum = 102039588;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=102039589;
 //BA.debugLineNum = 102039589;BA.debugLine="InsideQuotes = False";
_insidequotes = __c.False;
 }else 
{RDebugUtils.currentLine=102039590;
 //BA.debugLineNum = 102039590;BA.debugLine="Else If c = QUOTE Then";
if ((_c).equals(__c.QUOTE)) { 
RDebugUtils.currentLine=102039591;
 //BA.debugLineNum = 102039591;BA.debugLine="InsideQuotes = True";
_insidequotes = __c.True;
 }else {
RDebugUtils.currentLine=102039593;
 //BA.debugLineNum = 102039593;BA.debugLine="sb.Append(c)";
_sb.Append(_c);
 }}}}
;
 };
RDebugUtils.currentLine=102039596;
 //BA.debugLineNum = 102039596;BA.debugLine="CurrentIndex = CurrentIndex + 1";
__ref._currentindex /*int*/  = (int) (__ref._currentindex /*int*/ +1);
 }
;
RDebugUtils.currentLine=102039598;
 //BA.debugLineNum = 102039598;BA.debugLine="Return count";
if (true) return _count;
RDebugUtils.currentLine=102039599;
 //BA.debugLineNum = 102039599;BA.debugLine="End Sub";
return 0;
}
}