package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlreaderresult extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlreaderresult", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlreaderresult.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xlhyperlink{
public boolean IsInitialized;
public String LinkType;
public String Address;
public String Label;
public void Initialize() {
IsInitialized = true;
LinkType = "";
Address = "";
Label = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public b4j.docU.xlutils._xladdress _topleft = null;
public b4j.docU.xlutils._xladdress _bottomright = null;
public String _name = "";
public b4j.docU.xlutils _xl = null;
public Object _defaultemptycellvalue = null;
public anywheresoftware.b4a.objects.collections.Map _hyperlinks = null;
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
public String  _logresult(b4j.docU.xlreaderresult __ref,boolean _withcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "logresult", true))
	 {return ((String) Debug.delegate(ba, "logresult", new Object[] {_withcontent}));}
boolean _isrectangle = false;
int _length = 0;
Object[] _first = null;
Object[] _row = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _firstcell = false;
Object _cell = null;
RDebugUtils.currentLine=219742208;
 //BA.debugLineNum = 219742208;BA.debugLine="Public Sub LogResult (WithContent As Boolean)";
RDebugUtils.currentLine=219742209;
 //BA.debugLineNum = 219742209;BA.debugLine="Log($\"*** ${Name} ***\"$)";
__c.LogImpl("9219742209",("*** "+__c.SmartStringFormatter("",(Object)(__ref._name /*String*/ ))+" ***"),0);
RDebugUtils.currentLine=219742210;
 //BA.debugLineNum = 219742210;BA.debugLine="Log($\"Number of rows: ${Data.Size}\"$)";
__c.LogImpl("9219742210",("Number of rows: "+__c.SmartStringFormatter("",(Object)(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()))+""),0);
RDebugUtils.currentLine=219742211;
 //BA.debugLineNum = 219742211;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=219742212;
 //BA.debugLineNum = 219742212;BA.debugLine="Dim IsRectangle As Boolean = True";
_isrectangle = __c.True;
RDebugUtils.currentLine=219742213;
 //BA.debugLineNum = 219742213;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=219742214;
 //BA.debugLineNum = 219742214;BA.debugLine="Dim first() As Object = Data.Get(0)";
_first = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=219742215;
 //BA.debugLineNum = 219742215;BA.debugLine="length = first.Length";
_length = _first.length;
RDebugUtils.currentLine=219742216;
 //BA.debugLineNum = 219742216;BA.debugLine="For Each row() As Object In Data";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._data /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (Object[])(group8.Get(index8));
RDebugUtils.currentLine=219742217;
 //BA.debugLineNum = 219742217;BA.debugLine="If row.Length <> length Then";
if (_row.length!=_length) { 
RDebugUtils.currentLine=219742218;
 //BA.debugLineNum = 219742218;BA.debugLine="IsRectangle = False";
_isrectangle = __c.False;
RDebugUtils.currentLine=219742219;
 //BA.debugLineNum = 219742219;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=219742222;
 //BA.debugLineNum = 219742222;BA.debugLine="Log($\"Is rectangle region: ${IsRectangle}\"$)";
__c.LogImpl("9219742222",("Is rectangle region: "+__c.SmartStringFormatter("",(Object)(_isrectangle))+""),0);
RDebugUtils.currentLine=219742223;
 //BA.debugLineNum = 219742223;BA.debugLine="Log($\"${xl.AddressToString(TopLeft)} -> ${xl.Add";
__c.LogImpl("9219742223",(""+__c.SmartStringFormatter("",(Object)(__ref._xl /*b4j.docU.xlutils*/ ._addresstostring /*String*/ (null,__ref._topleft /*b4j.docU.xlutils._xladdress*/ )))+" -> "+__c.SmartStringFormatter("",(Object)(__ref._xl /*b4j.docU.xlutils*/ ._addresstostring /*String*/ (null,__ref._bottomright /*b4j.docU.xlutils._xladdress*/ )))+""),0);
RDebugUtils.currentLine=219742224;
 //BA.debugLineNum = 219742224;BA.debugLine="If WithContent Then";
if (_withcontent) { 
RDebugUtils.currentLine=219742225;
 //BA.debugLineNum = 219742225;BA.debugLine="Log(\"Content:\")";
__c.LogImpl("9219742225","Content:",0);
RDebugUtils.currentLine=219742226;
 //BA.debugLineNum = 219742226;BA.debugLine="For Each row() As Object In Data";
{
final anywheresoftware.b4a.BA.IterableList group18 = __ref._data /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (Object[])(group18.Get(index18));
RDebugUtils.currentLine=219742227;
 //BA.debugLineNum = 219742227;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=219742228;
 //BA.debugLineNum = 219742228;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=219742229;
 //BA.debugLineNum = 219742229;BA.debugLine="Dim firstcell As Boolean = True";
_firstcell = __c.True;
RDebugUtils.currentLine=219742230;
 //BA.debugLineNum = 219742230;BA.debugLine="If row.Length = 0 Then";
if (_row.length==0) { 
RDebugUtils.currentLine=219742231;
 //BA.debugLineNum = 219742231;BA.debugLine="sb.Append(\"(empty row)\")";
_sb.Append("(empty row)");
 }else {
RDebugUtils.currentLine=219742233;
 //BA.debugLineNum = 219742233;BA.debugLine="For Each cell As Object In row";
{
final Object[] group25 = _row;
final int groupLen25 = group25.length
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_cell = group25[index25];
RDebugUtils.currentLine=219742234;
 //BA.debugLineNum = 219742234;BA.debugLine="If firstcell = False Then sb.Append(\", \") El";
if (_firstcell==__c.False) { 
_sb.Append(", ");}
else {
_firstcell = __c.False;};
RDebugUtils.currentLine=219742235;
 //BA.debugLineNum = 219742235;BA.debugLine="If cell = \"\" Then cell = DefaultEmptyCellVal";
if ((_cell).equals((Object)(""))) { 
_cell = __ref._defaultemptycellvalue /*Object*/ ;};
RDebugUtils.currentLine=219742236;
 //BA.debugLineNum = 219742236;BA.debugLine="If cell Is Long Then";
if (_cell instanceof Long) { 
RDebugUtils.currentLine=219742237;
 //BA.debugLineNum = 219742237;BA.debugLine="sb.Append(DateTime.Date(cell))";
_sb.Append(__c.DateTime.Date(BA.ObjectToLongNumber(_cell)));
 }else {
RDebugUtils.currentLine=219742239;
 //BA.debugLineNum = 219742239;BA.debugLine="sb.Append(cell)";
_sb.Append(BA.ObjectToString(_cell));
 };
 }
};
 };
RDebugUtils.currentLine=219742243;
 //BA.debugLineNum = 219742243;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("9219742243",_sb.ToString(),0);
 }
};
 };
 };
RDebugUtils.currentLine=219742247;
 //BA.debugLineNum = 219742247;BA.debugLine="End Sub";
return "";
}
public Object  _get(b4j.docU.xlreaderresult __ref,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_address}));}
RDebugUtils.currentLine=219807744;
 //BA.debugLineNum = 219807744;BA.debugLine="Public Sub Get(Address As XLAddress) As Object";
RDebugUtils.currentLine=219807745;
 //BA.debugLineNum = 219807745;BA.debugLine="Return GetDefault(Address, DefaultEmptyCellValue)";
if (true) return __ref._getdefault /*Object*/ (null,_address,__ref._defaultemptycellvalue /*Object*/ );
RDebugUtils.currentLine=219807746;
 //BA.debugLineNum = 219807746;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(b4j.docU.xlreaderresult __ref,b4j.docU.xlutils._xladdress _address,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "getdefault", true))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_address,_defaultvalue}));}
int _row = 0;
int _col = 0;
Object[] _rrow = null;
Object _res = null;
RDebugUtils.currentLine=219938816;
 //BA.debugLineNum = 219938816;BA.debugLine="Public Sub GetDefault(Address As XLAddress, Defaul";
RDebugUtils.currentLine=219938817;
 //BA.debugLineNum = 219938817;BA.debugLine="Dim row As Int = Address.Row0Based - TopLeft.Row0";
_row = (int) (_address.Row0Based /*int*/ -__ref._topleft /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ );
RDebugUtils.currentLine=219938818;
 //BA.debugLineNum = 219938818;BA.debugLine="Dim col As Int = Address.Col0Based - TopLeft.Col0";
_col = (int) (_address.Col0Based /*int*/ -__ref._topleft /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ );
RDebugUtils.currentLine=219938819;
 //BA.debugLineNum = 219938819;BA.debugLine="If col < 0 Or row < 0 Or row >= Data.Size Then Re";
if (_col<0 || _row<0 || _row>=__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=219938820;
 //BA.debugLineNum = 219938820;BA.debugLine="Dim rrow() As Object = Data.Get(row)";
_rrow = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=219938821;
 //BA.debugLineNum = 219938821;BA.debugLine="If rrow.Length <= col Then Return DefaultValue";
if (_rrow.length<=_col) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=219938822;
 //BA.debugLineNum = 219938822;BA.debugLine="Dim res As Object = rrow(col)";
_res = _rrow[_col];
RDebugUtils.currentLine=219938823;
 //BA.debugLineNum = 219938823;BA.debugLine="If res = \"\" Then Return DefaultValue";
if ((_res).equals((Object)(""))) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=219938824;
 //BA.debugLineNum = 219938824;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=219938825;
 //BA.debugLineNum = 219938825;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.xlreaderresult __ref,anywheresoftware.b4a.BA _ba,b4j.docU.xlutils _vxl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl}));}
RDebugUtils.currentLine=219676672;
 //BA.debugLineNum = 219676672;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
RDebugUtils.currentLine=219676673;
 //BA.debugLineNum = 219676673;BA.debugLine="xl = vXL";
__ref._xl /*b4j.docU.xlutils*/  = _vxl;
RDebugUtils.currentLine=219676674;
 //BA.debugLineNum = 219676674;BA.debugLine="Hyperlinks.Initialize";
__ref._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=219676675;
 //BA.debugLineNum = 219676675;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.xlreaderresult __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
RDebugUtils.currentLine=219611136;
 //BA.debugLineNum = 219611136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=219611137;
 //BA.debugLineNum = 219611137;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=219611138;
 //BA.debugLineNum = 219611138;BA.debugLine="Public TopLeft As XLAddress";
_topleft = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=219611139;
 //BA.debugLineNum = 219611139;BA.debugLine="Public BottomRight As XLAddress";
_bottomright = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=219611140;
 //BA.debugLineNum = 219611140;BA.debugLine="Public Name As String";
_name = "";
RDebugUtils.currentLine=219611141;
 //BA.debugLineNum = 219611141;BA.debugLine="Private xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=219611142;
 //BA.debugLineNum = 219611142;BA.debugLine="Public DefaultEmptyCellValue As Object = \"\"";
_defaultemptycellvalue = (Object)("");
RDebugUtils.currentLine=219611144;
 //BA.debugLineNum = 219611144;BA.debugLine="Type XLHyperlink (LinkType As String, Address As";
;
RDebugUtils.currentLine=219611145;
 //BA.debugLineNum = 219611145;BA.debugLine="Public Hyperlinks As Map";
_hyperlinks = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=219611146;
 //BA.debugLineNum = 219611146;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlreaderresult._xlhyperlink  _gethyperlink(b4j.docU.xlreaderresult __ref,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreaderresult";
if (Debug.shouldDelegate(ba, "gethyperlink", true))
	 {return ((b4j.docU.xlreaderresult._xlhyperlink) Debug.delegate(ba, "gethyperlink", new Object[] {_address}));}
String _a = "";
b4j.docU.xlreaderresult._xlhyperlink _empty = null;
RDebugUtils.currentLine=219873280;
 //BA.debugLineNum = 219873280;BA.debugLine="Public Sub GetHyperlink(Address As XLAddress) As X";
RDebugUtils.currentLine=219873281;
 //BA.debugLineNum = 219873281;BA.debugLine="Dim a As String = xl.AddressToString(Address)";
_a = __ref._xl /*b4j.docU.xlutils*/ ._addresstostring /*String*/ (null,_address);
RDebugUtils.currentLine=219873282;
 //BA.debugLineNum = 219873282;BA.debugLine="If Hyperlinks.ContainsKey(a) Then";
if (__ref._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_a))) { 
RDebugUtils.currentLine=219873283;
 //BA.debugLineNum = 219873283;BA.debugLine="Return Hyperlinks.Get(a)";
if (true) return (b4j.docU.xlreaderresult._xlhyperlink)(__ref._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_a)));
 };
RDebugUtils.currentLine=219873285;
 //BA.debugLineNum = 219873285;BA.debugLine="Dim Empty As XLHyperlink";
_empty = new b4j.docU.xlreaderresult._xlhyperlink();
RDebugUtils.currentLine=219873286;
 //BA.debugLineNum = 219873286;BA.debugLine="Return Empty";
if (true) return _empty;
RDebugUtils.currentLine=219873287;
 //BA.debugLineNum = 219873287;BA.debugLine="End Sub";
return null;
}
}