package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xformatter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xformatter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xformatter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xformatdata{
public boolean IsInitialized;
public String Prefix;
public String Postfix;
public int MinimumIntegers;
public int MinimumFractions;
public int MaximumFractions;
public String GroupingCharacter;
public String DecimalPoint;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont FormatFont;
public double RangeStart;
public double RangeEnd;
public boolean RemoveMinusSign;
public String IntegerPaddingChar;
public String FractionPaddingChar;
public void Initialize() {
IsInitialized = true;
Prefix = "";
Postfix = "";
MinimumIntegers = 0;
MinimumFractions = 0;
MaximumFractions = 0;
GroupingCharacter = "";
DecimalPoint = "";
TextColor = 0;
FormatFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RangeStart = 0;
RangeEnd = 0;
RemoveMinusSign = false;
IntegerPaddingChar = "";
FractionPaddingChar = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _formats = null;
public int _max_value = 0;
public int _min_value = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
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
public String  _initialize(b4j.docU.b4xformatter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
b4j.docU.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=248250368;
 //BA.debugLineNum = 248250368;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=248250369;
 //BA.debugLineNum = 248250369;BA.debugLine="formats.Initialize";
__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=248250370;
 //BA.debugLineNum = 248250370;BA.debugLine="Dim d As B4XFormatData = CreateDefaultFormat";
_d = __ref._createdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null);
RDebugUtils.currentLine=248250371;
 //BA.debugLineNum = 248250371;BA.debugLine="AddFormatData(d, MIN_VALUE, MAX_VALUE, True)";
__ref._addformatdata /*String*/ (null,_d,__ref._min_value /*int*/ ,__ref._max_value /*int*/ ,__c.True);
RDebugUtils.currentLine=248250372;
 //BA.debugLineNum = 248250372;BA.debugLine="End Sub";
return "";
}
public b4j.docU.b4xformatter._b4xformatdata  _getdefaultformat(b4j.docU.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "getdefaultformat", true))
	 {return ((b4j.docU.b4xformatter._b4xformatdata) Debug.delegate(ba, "getdefaultformat", null));}
RDebugUtils.currentLine=248578048;
 //BA.debugLineNum = 248578048;BA.debugLine="Public Sub GetDefaultFormat As B4XFormatData";
RDebugUtils.currentLine=248578049;
 //BA.debugLineNum = 248578049;BA.debugLine="Return formats.Get(0)";
if (true) return (b4j.docU.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=248578050;
 //BA.debugLineNum = 248578050;BA.debugLine="End Sub";
return null;
}
public String  _format(b4j.docU.b4xformatter __ref,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "format", true))
	 {return ((String) Debug.delegate(ba, "format", new Object[] {_number}));}
b4j.docU.b4xformatter._b4xformatdata _data = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _numberstartindex = 0;
double _factor = 0;
int _whole = 0;
double _frac = 0;
int _g = 0;
int _fracstartindex = 0;
int _lastzerocount = 0;
int _multipler = 0;
int _w = 0;
RDebugUtils.currentLine=248709120;
 //BA.debugLineNum = 248709120;BA.debugLine="Public Sub Format (Number As Double) As String";
RDebugUtils.currentLine=248709121;
 //BA.debugLineNum = 248709121;BA.debugLine="If Number < MIN_VALUE Or Number > MAX_VALUE Then";
if (_number<__ref._min_value /*int*/  || _number>__ref._max_value /*int*/ ) { 
if (true) return "OVERFLOW";};
RDebugUtils.currentLine=248709122;
 //BA.debugLineNum = 248709122;BA.debugLine="Dim data As B4XFormatData = GetFormatData (Number";
_data = __ref._getformatdata /*b4j.docU.b4xformatter._b4xformatdata*/ (null,_number);
RDebugUtils.currentLine=248709123;
 //BA.debugLineNum = 248709123;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=248709124;
 //BA.debugLineNum = 248709124;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=248709125;
 //BA.debugLineNum = 248709125;BA.debugLine="sb.Append(data.Prefix)";
_sb.Append(_data.Prefix /*String*/ );
RDebugUtils.currentLine=248709126;
 //BA.debugLineNum = 248709126;BA.debugLine="Dim NumberStartIndex As Int = sb.Length";
_numberstartindex = _sb.getLength();
RDebugUtils.currentLine=248709127;
 //BA.debugLineNum = 248709127;BA.debugLine="Dim factor As Double = Power(10, -data.MaximumFra";
_factor = __c.Power(10,-_data.MaximumFractions /*int*/ -1)*5;
RDebugUtils.currentLine=248709128;
 //BA.debugLineNum = 248709128;BA.debugLine="If Number < -factor And data.RemoveMinusSign = Fa";
if (_number<-_factor && _data.RemoveMinusSign /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=248709129;
 //BA.debugLineNum = 248709129;BA.debugLine="sb.Append(\"-\")";
_sb.Append("-");
RDebugUtils.currentLine=248709130;
 //BA.debugLineNum = 248709130;BA.debugLine="NumberStartIndex = NumberStartIndex + 1";
_numberstartindex = (int) (_numberstartindex+1);
 };
RDebugUtils.currentLine=248709132;
 //BA.debugLineNum = 248709132;BA.debugLine="Number = Abs(Number) + factor";
_number = __c.Abs(_number)+_factor;
RDebugUtils.currentLine=248709133;
 //BA.debugLineNum = 248709133;BA.debugLine="Dim whole As Int = Number";
_whole = (int) (_number);
RDebugUtils.currentLine=248709134;
 //BA.debugLineNum = 248709134;BA.debugLine="Dim frac As Double = Number - whole";
_frac = _number-_whole;
RDebugUtils.currentLine=248709135;
 //BA.debugLineNum = 248709135;BA.debugLine="Dim g As Int";
_g = 0;
RDebugUtils.currentLine=248709136;
 //BA.debugLineNum = 248709136;BA.debugLine="Do While whole > 0";
while (_whole>0) {
RDebugUtils.currentLine=248709137;
 //BA.debugLineNum = 248709137;BA.debugLine="If g > 0 And g Mod 3 = 0 And data.GroupingCharac";
if (_g>0 && _g%3==0 && _data.GroupingCharacter /*String*/ .length()>0) { 
RDebugUtils.currentLine=248709138;
 //BA.debugLineNum = 248709138;BA.debugLine="sb.Insert(NumberStartIndex, data.GroupingCharac";
_sb.Insert(_numberstartindex,_data.GroupingCharacter /*String*/ );
 };
RDebugUtils.currentLine=248709140;
 //BA.debugLineNum = 248709140;BA.debugLine="g = g + 1";
_g = (int) (_g+1);
RDebugUtils.currentLine=248709141;
 //BA.debugLineNum = 248709141;BA.debugLine="sb.Insert(NumberStartIndex, whole Mod 10)";
_sb.Insert(_numberstartindex,BA.NumberToString(_whole%10));
RDebugUtils.currentLine=248709142;
 //BA.debugLineNum = 248709142;BA.debugLine="whole = whole / 10";
_whole = (int) (_whole/(double)10);
 }
;
RDebugUtils.currentLine=248709144;
 //BA.debugLineNum = 248709144;BA.debugLine="Do While sb.Length - NumberStartIndex < data.Mini";
while (_sb.getLength()-_numberstartindex<_data.MinimumIntegers /*int*/ ) {
RDebugUtils.currentLine=248709145;
 //BA.debugLineNum = 248709145;BA.debugLine="sb.Insert(NumberStartIndex, data.IntegerPaddingC";
_sb.Insert(_numberstartindex,_data.IntegerPaddingChar /*String*/ );
 }
;
RDebugUtils.currentLine=248709147;
 //BA.debugLineNum = 248709147;BA.debugLine="If data.MaximumFractions > 0 And (data.MinimumFra";
if (_data.MaximumFractions /*int*/ >0 && (_data.MinimumFractions /*int*/ >0 || _frac>0)) { 
RDebugUtils.currentLine=248709148;
 //BA.debugLineNum = 248709148;BA.debugLine="Dim FracStartIndex As Int = sb.Length";
_fracstartindex = _sb.getLength();
RDebugUtils.currentLine=248709149;
 //BA.debugLineNum = 248709149;BA.debugLine="Dim LastZeroCount As Int";
_lastzerocount = 0;
RDebugUtils.currentLine=248709150;
 //BA.debugLineNum = 248709150;BA.debugLine="Dim Multipler As Int = 10";
_multipler = (int) (10);
RDebugUtils.currentLine=248709151;
 //BA.debugLineNum = 248709151;BA.debugLine="Do While frac >= 2 * factor And sb.Length - Frac";
while (_frac>=2*_factor && _sb.getLength()-_fracstartindex<_data.MaximumFractions /*int*/ ) {
RDebugUtils.currentLine=248709152;
 //BA.debugLineNum = 248709152;BA.debugLine="Dim w As Int = (frac * Multipler)";
_w = (int) ((_frac*_multipler));
RDebugUtils.currentLine=248709153;
 //BA.debugLineNum = 248709153;BA.debugLine="w = w Mod 10";
_w = (int) (_w%10);
RDebugUtils.currentLine=248709154;
 //BA.debugLineNum = 248709154;BA.debugLine="If w = 0 Then LastZeroCount = LastZeroCount + 1";
if (_w==0) { 
_lastzerocount = (int) (_lastzerocount+1);}
else {
_lastzerocount = (int) (0);};
RDebugUtils.currentLine=248709155;
 //BA.debugLineNum = 248709155;BA.debugLine="sb.Append(w)";
_sb.Append(BA.NumberToString(_w));
RDebugUtils.currentLine=248709156;
 //BA.debugLineNum = 248709156;BA.debugLine="Multipler = Multipler * 10";
_multipler = (int) (_multipler*10);
 }
;
RDebugUtils.currentLine=248709158;
 //BA.debugLineNum = 248709158;BA.debugLine="If data.FractionPaddingChar <> \"0\" And LastZeroC";
if ((_data.FractionPaddingChar /*String*/ ).equals("0") == false && _lastzerocount>0) { 
RDebugUtils.currentLine=248709159;
 //BA.debugLineNum = 248709159;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_lastzerocount),_sb.getLength());
RDebugUtils.currentLine=248709160;
 //BA.debugLineNum = 248709160;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 };
RDebugUtils.currentLine=248709162;
 //BA.debugLineNum = 248709162;BA.debugLine="Do While sb.Length - FracStartIndex < data.Minim";
while (_sb.getLength()-_fracstartindex<_data.MinimumFractions /*int*/ ) {
RDebugUtils.currentLine=248709163;
 //BA.debugLineNum = 248709163;BA.debugLine="sb.Append(data.FractionPaddingChar)";
_sb.Append(_data.FractionPaddingChar /*String*/ );
RDebugUtils.currentLine=248709164;
 //BA.debugLineNum = 248709164;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 }
;
RDebugUtils.currentLine=248709166;
 //BA.debugLineNum = 248709166;BA.debugLine="LastZeroCount = Min(LastZeroCount, sb.Length - F";
_lastzerocount = (int) (__c.Min(_lastzerocount,_sb.getLength()-_fracstartindex-_data.MinimumFractions /*int*/ ));
RDebugUtils.currentLine=248709167;
 //BA.debugLineNum = 248709167;BA.debugLine="If LastZeroCount > 0 Then";
if (_lastzerocount>0) { 
RDebugUtils.currentLine=248709168;
 //BA.debugLineNum = 248709168;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_lastzerocount),_sb.getLength());
 };
RDebugUtils.currentLine=248709170;
 //BA.debugLineNum = 248709170;BA.debugLine="If sb.Length > FracStartIndex Then sb.Insert(Fra";
if (_sb.getLength()>_fracstartindex) { 
_sb.Insert(_fracstartindex,_data.DecimalPoint /*String*/ );};
 };
RDebugUtils.currentLine=248709172;
 //BA.debugLineNum = 248709172;BA.debugLine="sb.Append(data.Postfix)";
_sb.Append(_data.Postfix /*String*/ );
RDebugUtils.currentLine=248709173;
 //BA.debugLineNum = 248709173;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=248709174;
 //BA.debugLineNum = 248709174;BA.debugLine="End Sub";
return "";
}
public String  _addformatdata(b4j.docU.b4xformatter __ref,b4j.docU.b4xformatter._b4xformatdata _data,double _rangestart,double _rangeend,boolean _includeedges) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "addformatdata", true))
	 {return ((String) Debug.delegate(ba, "addformatdata", new Object[] {_data,_rangestart,_rangeend,_includeedges}));}
double _factor = 0;
RDebugUtils.currentLine=248512512;
 //BA.debugLineNum = 248512512;BA.debugLine="Public Sub AddFormatData (Data As B4XFormatData, R";
RDebugUtils.currentLine=248512513;
 //BA.debugLineNum = 248512513;BA.debugLine="Dim factor As Double = Power(10, -Data.MaximumFra";
_factor = __c.Power(10,-_data.MaximumFractions /*int*/ );
RDebugUtils.currentLine=248512514;
 //BA.debugLineNum = 248512514;BA.debugLine="If IncludeEdges = False Then";
if (_includeedges==__c.False) { 
RDebugUtils.currentLine=248512515;
 //BA.debugLineNum = 248512515;BA.debugLine="RangeStart = RangeStart + factor";
_rangestart = _rangestart+_factor;
RDebugUtils.currentLine=248512516;
 //BA.debugLineNum = 248512516;BA.debugLine="RangeEnd = RangeEnd - factor";
_rangeend = _rangeend-_factor;
 };
RDebugUtils.currentLine=248512518;
 //BA.debugLineNum = 248512518;BA.debugLine="RangeStart = RangeStart - factor / 2";
_rangestart = _rangestart-_factor/(double)2;
RDebugUtils.currentLine=248512519;
 //BA.debugLineNum = 248512519;BA.debugLine="RangeEnd = RangeEnd + factor / 2";
_rangeend = _rangeend+_factor/(double)2;
RDebugUtils.currentLine=248512520;
 //BA.debugLineNum = 248512520;BA.debugLine="Data.RangeStart = RangeStart";
_data.RangeStart /*double*/  = _rangestart;
RDebugUtils.currentLine=248512521;
 //BA.debugLineNum = 248512521;BA.debugLine="Data.RangeEnd = RangeEnd";
_data.RangeEnd /*double*/  = _rangeend;
RDebugUtils.currentLine=248512522;
 //BA.debugLineNum = 248512522;BA.debugLine="formats.Add(Data)";
__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_data));
RDebugUtils.currentLine=248512523;
 //BA.debugLineNum = 248512523;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
RDebugUtils.currentLine=248184832;
 //BA.debugLineNum = 248184832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=248184833;
 //BA.debugLineNum = 248184833;BA.debugLine="Type B4XFormatData (Prefix As String, Postfix As";
;
RDebugUtils.currentLine=248184837;
 //BA.debugLineNum = 248184837;BA.debugLine="Private formats As List";
_formats = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=248184838;
 //BA.debugLineNum = 248184838;BA.debugLine="Public Const MAX_VALUE = 0x7fffffff, MIN_VALUE =";
_max_value = ((int)0x7fffffff);
_min_value = ((int)0x80000000);
RDebugUtils.currentLine=248184840;
 //BA.debugLineNum = 248184840;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=248184842;
 //BA.debugLineNum = 248184842;BA.debugLine="End Sub";
return "";
}
public b4j.docU.b4xformatter._b4xformatdata  _copyformatdata(b4j.docU.b4xformatter __ref,b4j.docU.b4xformatter._b4xformatdata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "copyformatdata", true))
	 {return ((b4j.docU.b4xformatter._b4xformatdata) Debug.delegate(ba, "copyformatdata", new Object[] {_data}));}
b4j.docU.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=248446976;
 //BA.debugLineNum = 248446976;BA.debugLine="Public Sub CopyFormatData (Data As B4XFormatData)";
RDebugUtils.currentLine=248446977;
 //BA.debugLineNum = 248446977;BA.debugLine="Dim d As B4XFormatData";
_d = new b4j.docU.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=248446978;
 //BA.debugLineNum = 248446978;BA.debugLine="d.Initialize";
_d.Initialize();
RDebugUtils.currentLine=248446979;
 //BA.debugLineNum = 248446979;BA.debugLine="d.DecimalPoint = Data.DecimalPoint";
_d.DecimalPoint /*String*/  = _data.DecimalPoint /*String*/ ;
RDebugUtils.currentLine=248446980;
 //BA.debugLineNum = 248446980;BA.debugLine="If Data.FormatFont.IsInitialized Then";
if (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .IsInitialized()) { 
RDebugUtils.currentLine=248446982;
 //BA.debugLineNum = 248446982;BA.debugLine="d.FormatFont = xui.CreateFont(Data.FormatFont.To";
_d.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((javafx.scene.text.Font)(_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .ToNativeFont().getObject()),(float) (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize()));
 };
RDebugUtils.currentLine=248446985;
 //BA.debugLineNum = 248446985;BA.debugLine="d.GroupingCharacter = Data.GroupingCharacter";
_d.GroupingCharacter /*String*/  = _data.GroupingCharacter /*String*/ ;
RDebugUtils.currentLine=248446986;
 //BA.debugLineNum = 248446986;BA.debugLine="d.MaximumFractions = Data.MaximumFractions";
_d.MaximumFractions /*int*/  = _data.MaximumFractions /*int*/ ;
RDebugUtils.currentLine=248446987;
 //BA.debugLineNum = 248446987;BA.debugLine="d.MinimumFractions = Data.MinimumFractions";
_d.MinimumFractions /*int*/  = _data.MinimumFractions /*int*/ ;
RDebugUtils.currentLine=248446988;
 //BA.debugLineNum = 248446988;BA.debugLine="d.MinimumIntegers = Data.MinimumIntegers";
_d.MinimumIntegers /*int*/  = _data.MinimumIntegers /*int*/ ;
RDebugUtils.currentLine=248446989;
 //BA.debugLineNum = 248446989;BA.debugLine="d.Postfix = Data.Postfix";
_d.Postfix /*String*/  = _data.Postfix /*String*/ ;
RDebugUtils.currentLine=248446990;
 //BA.debugLineNum = 248446990;BA.debugLine="d.Prefix = Data.Prefix";
_d.Prefix /*String*/  = _data.Prefix /*String*/ ;
RDebugUtils.currentLine=248446991;
 //BA.debugLineNum = 248446991;BA.debugLine="d.RangeEnd = Data.RangeEnd";
_d.RangeEnd /*double*/  = _data.RangeEnd /*double*/ ;
RDebugUtils.currentLine=248446992;
 //BA.debugLineNum = 248446992;BA.debugLine="d.RangeStart = Data.RangeStart";
_d.RangeStart /*double*/  = _data.RangeStart /*double*/ ;
RDebugUtils.currentLine=248446993;
 //BA.debugLineNum = 248446993;BA.debugLine="d.RemoveMinusSign = Data.RemoveMinusSign";
_d.RemoveMinusSign /*boolean*/  = _data.RemoveMinusSign /*boolean*/ ;
RDebugUtils.currentLine=248446994;
 //BA.debugLineNum = 248446994;BA.debugLine="d.TextColor = Data.TextColor";
_d.TextColor /*int*/  = _data.TextColor /*int*/ ;
RDebugUtils.currentLine=248446995;
 //BA.debugLineNum = 248446995;BA.debugLine="d.FractionPaddingChar = Data.FractionPaddingChar";
_d.FractionPaddingChar /*String*/  = _data.FractionPaddingChar /*String*/ ;
RDebugUtils.currentLine=248446996;
 //BA.debugLineNum = 248446996;BA.debugLine="d.IntegerPaddingChar = Data.IntegerPaddingChar";
_d.IntegerPaddingChar /*String*/  = _data.IntegerPaddingChar /*String*/ ;
RDebugUtils.currentLine=248446997;
 //BA.debugLineNum = 248446997;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=248446998;
 //BA.debugLineNum = 248446998;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4xformatter._b4xformatdata  _createdefaultformat(b4j.docU.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "createdefaultformat", true))
	 {return ((b4j.docU.b4xformatter._b4xformatdata) Debug.delegate(ba, "createdefaultformat", null));}
b4j.docU.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=248315904;
 //BA.debugLineNum = 248315904;BA.debugLine="Private Sub CreateDefaultFormat As B4XFormatData";
RDebugUtils.currentLine=248315905;
 //BA.debugLineNum = 248315905;BA.debugLine="Dim d As B4XFormatData";
_d = new b4j.docU.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=248315906;
 //BA.debugLineNum = 248315906;BA.debugLine="d.Initialize";
_d.Initialize();
RDebugUtils.currentLine=248315907;
 //BA.debugLineNum = 248315907;BA.debugLine="d.GroupingCharacter = \",\"";
_d.GroupingCharacter /*String*/  = ",";
RDebugUtils.currentLine=248315908;
 //BA.debugLineNum = 248315908;BA.debugLine="d.DecimalPoint = \".\"";
_d.DecimalPoint /*String*/  = ".";
RDebugUtils.currentLine=248315909;
 //BA.debugLineNum = 248315909;BA.debugLine="d.MaximumFractions = 3";
_d.MaximumFractions /*int*/  = (int) (3);
RDebugUtils.currentLine=248315910;
 //BA.debugLineNum = 248315910;BA.debugLine="d.MinimumIntegers = 1";
_d.MinimumIntegers /*int*/  = (int) (1);
RDebugUtils.currentLine=248315911;
 //BA.debugLineNum = 248315911;BA.debugLine="d.IntegerPaddingChar = \"0\"";
_d.IntegerPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=248315912;
 //BA.debugLineNum = 248315912;BA.debugLine="d.FractionPaddingChar = \"0\"";
_d.FractionPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=248315913;
 //BA.debugLineNum = 248315913;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=248315914;
 //BA.debugLineNum = 248315914;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4xformatter._b4xformatdata  _getformatdata(b4j.docU.b4xformatter __ref,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "getformatdata", true))
	 {return ((b4j.docU.b4xformatter._b4xformatdata) Debug.delegate(ba, "getformatdata", new Object[] {_number}));}
int _i = 0;
b4j.docU.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=248643584;
 //BA.debugLineNum = 248643584;BA.debugLine="Public Sub GetFormatData (Number As Double) As B4X";
RDebugUtils.currentLine=248643585;
 //BA.debugLineNum = 248643585;BA.debugLine="For i = formats.Size - 1 To 1 Step - 1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=248643586;
 //BA.debugLineNum = 248643586;BA.debugLine="Dim d As B4XFormatData = formats.Get(i)";
_d = (b4j.docU.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=248643587;
 //BA.debugLineNum = 248643587;BA.debugLine="If Number <= d.RangeEnd And Number >= d.RangeSta";
if (_number<=_d.RangeEnd /*double*/  && _number>=_d.RangeStart /*double*/ ) { 
if (true) return _d;};
 }
};
RDebugUtils.currentLine=248643589;
 //BA.debugLineNum = 248643589;BA.debugLine="Return formats.Get(0)";
if (true) return (b4j.docU.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=248643590;
 //BA.debugLineNum = 248643590;BA.debugLine="End Sub";
return null;
}
public String  _formatlabel(b4j.docU.b4xformatter __ref,double _number,anywheresoftware.b4a.objects.B4XViewWrapper _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "formatlabel", true))
	 {return ((String) Debug.delegate(ba, "formatlabel", new Object[] {_number,_label}));}
b4j.docU.b4xformatter._b4xformatdata _data = null;
RDebugUtils.currentLine=248774656;
 //BA.debugLineNum = 248774656;BA.debugLine="Public Sub FormatLabel (Number As Double, Label As";
RDebugUtils.currentLine=248774657;
 //BA.debugLineNum = 248774657;BA.debugLine="Label.Text = Format(Number)";
_label.setText(__ref._format /*String*/ (null,_number));
RDebugUtils.currentLine=248774658;
 //BA.debugLineNum = 248774658;BA.debugLine="Dim data As B4XFormatData = GetFormatData(Number)";
_data = __ref._getformatdata /*b4j.docU.b4xformatter._b4xformatdata*/ (null,_number);
RDebugUtils.currentLine=248774659;
 //BA.debugLineNum = 248774659;BA.debugLine="If data.TextColor <> 0 Then Label.TextColor = dat";
if (_data.TextColor /*int*/ !=0) { 
_label.setTextColor(_data.TextColor /*int*/ );};
RDebugUtils.currentLine=248774660;
 //BA.debugLineNum = 248774660;BA.debugLine="If data.FormatFont.IsInitialized Then Label.Font";
if (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .IsInitialized()) { 
_label.setFont(_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );};
RDebugUtils.currentLine=248774661;
 //BA.debugLineNum = 248774661;BA.debugLine="End Sub";
return "";
}
public b4j.docU.b4xformatter._b4xformatdata  _newformatdata(b4j.docU.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "newformatdata", true))
	 {return ((b4j.docU.b4xformatter._b4xformatdata) Debug.delegate(ba, "newformatdata", null));}
RDebugUtils.currentLine=248381440;
 //BA.debugLineNum = 248381440;BA.debugLine="Public Sub NewFormatData As B4XFormatData";
RDebugUtils.currentLine=248381441;
 //BA.debugLineNum = 248381441;BA.debugLine="Return CopyFormatData(GetDefaultFormat)";
if (true) return __ref._copyformatdata /*b4j.docU.b4xformatter._b4xformatdata*/ (null,__ref._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null));
RDebugUtils.currentLine=248381442;
 //BA.debugLineNum = 248381442;BA.debugLine="End Sub";
return null;
}
}