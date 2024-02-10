package b4j.docU;

import anywheresoftware.b4a.debug.*;
import org.apache.poi.ss.usermodel.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlsheetwriter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlsheetwriter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlsheetwriter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PoiSheetWrapper _poisheet = null;
public b4j.docU.xlutils _xl = null;
public b4j.docU.xlutils._xladdress _lastaccessed = null;
public anywheresoftware.b4j.object.JavaObject _jsheet = null;
public b4j.docU.xlworkbookwriter _workbook = null;
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
public b4j.docU.xlsheetwriter  _putstring(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "putstring", new Object[] {_address,_value}));}
RDebugUtils.currentLine=220200960;
 //BA.debugLineNum = 220200960;BA.debugLine="Public Sub PutString (Address As XLAddress, Value";
RDebugUtils.currentLine=220200961;
 //BA.debugLineNum = 220200961;BA.debugLine="GetCell(Address).ValueString = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueString(_value);
RDebugUtils.currentLine=220200962;
 //BA.debugLineNum = 220200962;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220200963;
 //BA.debugLineNum = 220200963;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _setstyle(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,b4j.docU.xlstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "setstyle", new Object[] {_address,_style}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=220397568;
 //BA.debugLineNum = 220397568;BA.debugLine="Public Sub SetStyle (Address As XLAddress, Style A";
RDebugUtils.currentLine=220397569;
 //BA.debugLineNum = 220397569;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=220397570;
 //BA.debugLineNum = 220397570;BA.debugLine="ApplyStyle(cell, False, Style.StyleMap)";
__ref._applystyle /*String*/ (null,_cell,__c.False,_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=220397571;
 //BA.debugLineNum = 220397571;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220397572;
 //BA.debugLineNum = 220397572;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _createhyperlink(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,String _hyperlinktype,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createhyperlink", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "createhyperlink", new Object[] {_address,_hyperlinktype,_url}));}
anywheresoftware.b4j.object.JavaObject _link = null;
anywheresoftware.b4j.object.JavaObject _jcell = null;
RDebugUtils.currentLine=221577216;
 //BA.debugLineNum = 221577216;BA.debugLine="Public Sub CreateHyperlink (Address As XLAddress,";
RDebugUtils.currentLine=221577217;
 //BA.debugLineNum = 221577217;BA.debugLine="Dim link As JavaObject = Workbook.jWorkbook.RunMe";
_link = new anywheresoftware.b4j.object.JavaObject();
_link = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethod("createHyperlink",new Object[]{(Object)(_hyperlinktype)})));
RDebugUtils.currentLine=221577218;
 //BA.debugLineNum = 221577218;BA.debugLine="link.RunMethod(\"setAddress\", Array(URL))";
_link.RunMethod("setAddress",new Object[]{(Object)(_url)});
RDebugUtils.currentLine=221577219;
 //BA.debugLineNum = 221577219;BA.debugLine="Dim jcell As JavaObject = GetCell(Address)";
_jcell = new anywheresoftware.b4j.object.JavaObject();
_jcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).getObject()));
RDebugUtils.currentLine=221577220;
 //BA.debugLineNum = 221577220;BA.debugLine="jcell.RunMethod(\"setHyperlink\", Array(link))";
_jcell.RunMethod("setHyperlink",new Object[]{(Object)(_link.getObject())});
RDebugUtils.currentLine=221577221;
 //BA.debugLineNum = 221577221;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221577222;
 //BA.debugLineNum = 221577222;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _setautofilter(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setautofilter", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "setautofilter", new Object[] {_range}));}
Object _c = null;
RDebugUtils.currentLine=221511680;
 //BA.debugLineNum = 221511680;BA.debugLine="Public Sub SetAutoFilter (Range As XLRange) As XLS";
RDebugUtils.currentLine=221511681;
 //BA.debugLineNum = 221511681;BA.debugLine="Dim c As Object = xl.XLRangeToCellRangeAddress(Ra";
_c = (Object)(__ref._xl /*b4j.docU.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range).getObject());
RDebugUtils.currentLine=221511682;
 //BA.debugLineNum = 221511682;BA.debugLine="jsheet.RunMethod(\"setAutoFilter\", Array(c))";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setAutoFilter",new Object[]{_c});
RDebugUtils.currentLine=221511683;
 //BA.debugLineNum = 221511683;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221511684;
 //BA.debugLineNum = 221511684;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _autosizecolumn(b4j.docU.xlsheetwriter __ref,int _column0based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "autosizecolumn", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "autosizecolumn", new Object[] {_column0based}));}
RDebugUtils.currentLine=221249536;
 //BA.debugLineNum = 221249536;BA.debugLine="Public Sub AutoSizeColumn (Column0Based As Int) As";
RDebugUtils.currentLine=221249537;
 //BA.debugLineNum = 221249537;BA.debugLine="jsheet.RunMethod(\"autoSizeColumn\", Array(Column0B";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("autoSizeColumn",new Object[]{(Object)(_column0based)});
RDebugUtils.currentLine=221249538;
 //BA.debugLineNum = 221249538;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221249539;
 //BA.debugLineNum = 221249539;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _putnumber(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,double _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putnumber", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "putnumber", new Object[] {_address,_value}));}
RDebugUtils.currentLine=220135424;
 //BA.debugLineNum = 220135424;BA.debugLine="Public Sub PutNumber (Address As XLAddress, Value";
RDebugUtils.currentLine=220135425;
 //BA.debugLineNum = 220135425;BA.debugLine="GetCell(Address).ValueNumeric = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueNumeric(_value);
RDebugUtils.currentLine=220135426;
 //BA.debugLineNum = 220135426;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220135427;
 //BA.debugLineNum = 220135427;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _putdate(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,long _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putdate", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "putdate", new Object[] {_address,_value}));}
RDebugUtils.currentLine=220266496;
 //BA.debugLineNum = 220266496;BA.debugLine="Public Sub PutDate (Address As XLAddress, Value As";
RDebugUtils.currentLine=220266497;
 //BA.debugLineNum = 220266497;BA.debugLine="GetCell(Address).ValueDate = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueDate(_value);
RDebugUtils.currentLine=220266498;
 //BA.debugLineNum = 220266498;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220266499;
 //BA.debugLineNum = 220266499;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellWrapper  _getcell(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getcell", true))
	 {return ((anywheresoftware.b4j.objects.PoiCellWrapper) Debug.delegate(ba, "getcell", new Object[] {_address}));}
anywheresoftware.b4j.objects.PoiRowWrapper _row = null;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=220987392;
 //BA.debugLineNum = 220987392;BA.debugLine="Public Sub GetCell (Address As XLAddress) As PoiCe";
RDebugUtils.currentLine=220987393;
 //BA.debugLineNum = 220987393;BA.debugLine="Dim row As PoiRow = GetRow(Address)";
_row = new anywheresoftware.b4j.objects.PoiRowWrapper();
_row = __ref._getrow /*anywheresoftware.b4j.objects.PoiRowWrapper*/ (null,_address);
RDebugUtils.currentLine=220987394;
 //BA.debugLineNum = 220987394;BA.debugLine="Dim Cell As PoiCell = row.GetCell(Address.Col0Bas";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _row.GetCell(_address.Col0Based /*int*/ );
RDebugUtils.currentLine=220987395;
 //BA.debugLineNum = 220987395;BA.debugLine="If Cell.IsInitialized = False Then";
if (_cell.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=220987396;
 //BA.debugLineNum = 220987396;BA.debugLine="Cell = row.CreateCellBlank(Address.Col0Based)";
_cell = _row.CreateCellBlank(_address.Col0Based /*int*/ );
 };
RDebugUtils.currentLine=220987398;
 //BA.debugLineNum = 220987398;BA.debugLine="LastAccessed = Address";
__ref._lastaccessed /*b4j.docU.xlutils._xladdress*/  = _address;
RDebugUtils.currentLine=220987399;
 //BA.debugLineNum = 220987399;BA.debugLine="Return Cell";
if (true) return _cell;
RDebugUtils.currentLine=220987400;
 //BA.debugLineNum = 220987400;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _setstyles(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setstyles", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "setstyles", new Object[] {_address,_styles}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=220528640;
 //BA.debugLineNum = 220528640;BA.debugLine="Public Sub SetStyles (Address As XLAddress, Styles";
RDebugUtils.currentLine=220528641;
 //BA.debugLineNum = 220528641;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=220528642;
 //BA.debugLineNum = 220528642;BA.debugLine="ApplyStyle(cell, False, MergeStyles(Styles))";
__ref._applystyle /*String*/ (null,_cell,__c.False,__ref._mergestyles /*anywheresoftware.b4a.objects.collections.Map*/ (null,_styles));
RDebugUtils.currentLine=220528643;
 //BA.debugLineNum = 220528643;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220528644;
 //BA.debugLineNum = 220528644;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _addconditionalformatting(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _rules) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addconditionalformatting", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "addconditionalformatting", new Object[] {_range,_rules}));}
Object[] _jrules = null;
int _i = 0;
b4j.docU.xlconditionalformattingrule _r = null;
anywheresoftware.b4j.object.JavaObject _cfrules = null;
anywheresoftware.b4j.object.JavaObject _regions = null;
RDebugUtils.currentLine=222035968;
 //BA.debugLineNum = 222035968;BA.debugLine="Public Sub AddConditionalFormatting (Range As XLRa";
RDebugUtils.currentLine=222035969;
 //BA.debugLineNum = 222035969;BA.debugLine="Dim jrules(Rules.Size) As Object";
_jrules = new Object[_rules.getSize()];
{
int d0 = _jrules.length;
for (int i0 = 0;i0 < d0;i0++) {
_jrules[i0] = new Object();
}
}
;
RDebugUtils.currentLine=222035970;
 //BA.debugLineNum = 222035970;BA.debugLine="For i = 0 To Rules.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_rules.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=222035971;
 //BA.debugLineNum = 222035971;BA.debugLine="Dim r As XLConditionalFormattingRule = Rules.Get";
_r = (b4j.docU.xlconditionalformattingrule)(_rules.Get(_i));
RDebugUtils.currentLine=222035972;
 //BA.debugLineNum = 222035972;BA.debugLine="jrules(i) = r.jRule";
_jrules[_i] = (Object)(_r._jrule /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
 }
};
RDebugUtils.currentLine=222035974;
 //BA.debugLineNum = 222035974;BA.debugLine="Dim cfrules As JavaObject";
_cfrules = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=222035975;
 //BA.debugLineNum = 222035975;BA.debugLine="cfrules.InitializeArray(\"org.apache.poi.ss.usermo";
_cfrules.InitializeArray("org.apache.poi.ss.usermodel.ConditionalFormattingRule",_jrules);
RDebugUtils.currentLine=222035976;
 //BA.debugLineNum = 222035976;BA.debugLine="Dim Regions As JavaObject";
_regions = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=222035977;
 //BA.debugLineNum = 222035977;BA.debugLine="Regions.InitializeArray(\"org.apache.poi.ss.util.C";
_regions.InitializeArray("org.apache.poi.ss.util.CellRangeAddress",new Object[]{(Object)(__ref._xl /*b4j.docU.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range).getObject())});
RDebugUtils.currentLine=222035978;
 //BA.debugLineNum = 222035978;BA.debugLine="GetSheetConditionalFormatting.RunMethod(\"addCondi";
__ref._getsheetconditionalformatting /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("addConditionalFormatting",new Object[]{(Object)(_regions.getObject()),(Object)(_cfrules.getObject())});
RDebugUtils.currentLine=222035979;
 //BA.debugLineNum = 222035979;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=222035980;
 //BA.debugLineNum = 222035980;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getsheetconditionalformatting(b4j.docU.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getsheetconditionalformatting", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getsheetconditionalformatting", null));}
RDebugUtils.currentLine=221970432;
 //BA.debugLineNum = 221970432;BA.debugLine="Private Sub GetSheetConditionalFormatting As JavaO";
RDebugUtils.currentLine=221970433;
 //BA.debugLineNum = 221970433;BA.debugLine="Return jsheet.RunMethod(\"getSheetConditionalForma";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSheetConditionalFormatting",(Object[])(__c.Null))));
RDebugUtils.currentLine=221970434;
 //BA.debugLineNum = 221970434;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _addmergedregion(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addmergedregion", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "addmergedregion", new Object[] {_range}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=220921856;
 //BA.debugLineNum = 220921856;BA.debugLine="Public Sub AddMergedRegion (Range As XLRange) As X";
RDebugUtils.currentLine=220921857;
 //BA.debugLineNum = 220921857;BA.debugLine="Dim jo As JavaObject = PoiSheet";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getObject()));
RDebugUtils.currentLine=220921858;
 //BA.debugLineNum = 220921858;BA.debugLine="jo.RunMethod(\"addMergedRegion\", Array(xl.XLRangeT";
_jo.RunMethod("addMergedRegion",new Object[]{(Object)(__ref._xl /*b4j.docU.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range).getObject())});
RDebugUtils.currentLine=220921859;
 //BA.debugLineNum = 220921859;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220921860;
 //BA.debugLineNum = 220921860;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _addstyle(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,b4j.docU.xlstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "addstyle", new Object[] {_address,_style}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=220463104;
 //BA.debugLineNum = 220463104;BA.debugLine="Public Sub AddStyle (Address As XLAddress, Style A";
RDebugUtils.currentLine=220463105;
 //BA.debugLineNum = 220463105;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=220463106;
 //BA.debugLineNum = 220463106;BA.debugLine="ApplyStyle(cell, True, Style.StyleMap)";
__ref._applystyle /*String*/ (null,_cell,__c.True,_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=220463107;
 //BA.debugLineNum = 220463107;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220463108;
 //BA.debugLineNum = 220463108;BA.debugLine="End Sub";
return null;
}
public String  _applystyle(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4j.objects.PoiCellWrapper _cell,boolean _add,anywheresoftware.b4a.objects.collections.Map _stylemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "applystyle", true))
	 {return ((String) Debug.delegate(ba, "applystyle", new Object[] {_cell,_add,_stylemap}));}
anywheresoftware.b4a.objects.collections.Map _props = null;
String _key = "";
RDebugUtils.currentLine=222363648;
 //BA.debugLineNum = 222363648;BA.debugLine="Private Sub ApplyStyle (Cell As PoiCell, Add As Bo";
RDebugUtils.currentLine=222363649;
 //BA.debugLineNum = 222363649;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=222363650;
 //BA.debugLineNum = 222363650;BA.debugLine="If Add = False Then";
if (_add==__c.False) { 
RDebugUtils.currentLine=222363651;
 //BA.debugLineNum = 222363651;BA.debugLine="props = StyleMap";
_props = _stylemap;
 }else {
RDebugUtils.currentLine=222363653;
 //BA.debugLineNum = 222363653;BA.debugLine="props.Initialize";
_props.Initialize();
RDebugUtils.currentLine=222363654;
 //BA.debugLineNum = 222363654;BA.debugLine="FillStyleFromCell(props, Cell.CellStyle)";
__ref._fillstylefromcell /*String*/ (null,_props,_cell.getCellStyle());
RDebugUtils.currentLine=222363655;
 //BA.debugLineNum = 222363655;BA.debugLine="For Each key As String In StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _stylemap.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=222363656;
 //BA.debugLineNum = 222363656;BA.debugLine="props.Put(key, StyleMap.Get(key))";
_props.Put((Object)(_key),_stylemap.Get((Object)(_key)));
 }
};
 };
RDebugUtils.currentLine=222363659;
 //BA.debugLineNum = 222363659;BA.debugLine="Cell.CellStyle = CreateStyle(props)";
_cell.setCellStyle(__ref._createstyle /*anywheresoftware.b4j.objects.PoiCellStyleWrapper*/ (null,_props));
RDebugUtils.currentLine=222363660;
 //BA.debugLineNum = 222363660;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlsheetwriter  _addstyles(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addstyles", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "addstyles", new Object[] {_address,_styles}));}
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=220594176;
 //BA.debugLineNum = 220594176;BA.debugLine="Public Sub AddStyles (Address As XLAddress, Styles";
RDebugUtils.currentLine=220594177;
 //BA.debugLineNum = 220594177;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address);
RDebugUtils.currentLine=220594178;
 //BA.debugLineNum = 220594178;BA.debugLine="ApplyStyle(cell, True, MergeStyles(Styles))";
__ref._applystyle /*String*/ (null,_cell,__c.True,__ref._mergestyles /*anywheresoftware.b4a.objects.collections.Map*/ (null,_styles));
RDebugUtils.currentLine=220594179;
 //BA.debugLineNum = 220594179;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220594180;
 //BA.debugLineNum = 220594180;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mergestyles(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "mergestyles", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergestyles", new Object[] {_styles}));}
anywheresoftware.b4a.objects.collections.Map _newprops = null;
b4j.docU.xlstyle _style = null;
String _key = "";
RDebugUtils.currentLine=220659712;
 //BA.debugLineNum = 220659712;BA.debugLine="Private Sub MergeStyles (Styles As List) As Map";
RDebugUtils.currentLine=220659713;
 //BA.debugLineNum = 220659713;BA.debugLine="Dim NewProps As Map";
_newprops = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=220659714;
 //BA.debugLineNum = 220659714;BA.debugLine="NewProps.Initialize";
_newprops.Initialize();
RDebugUtils.currentLine=220659715;
 //BA.debugLineNum = 220659715;BA.debugLine="For Each style As XLStyle In Styles";
{
final anywheresoftware.b4a.BA.IterableList group3 = _styles;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_style = (b4j.docU.xlstyle)(group3.Get(index3));
RDebugUtils.currentLine=220659716;
 //BA.debugLineNum = 220659716;BA.debugLine="For Each key As String In style.StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=220659717;
 //BA.debugLineNum = 220659717;BA.debugLine="NewProps.Put(key, style.StyleMap.Get(key))";
_newprops.Put((Object)(_key),_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
 }
};
 }
};
RDebugUtils.currentLine=220659720;
 //BA.debugLineNum = 220659720;BA.debugLine="Return NewProps";
if (true) return _newprops;
RDebugUtils.currentLine=220659721;
 //BA.debugLineNum = 220659721;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _addstylestorange(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "addstylestorange", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "addstylestorange", new Object[] {_range,_styles}));}
RDebugUtils.currentLine=220790784;
 //BA.debugLineNum = 220790784;BA.debugLine="Public Sub AddStylesToRange (Range As XLRange, Sty";
RDebugUtils.currentLine=220790785;
 //BA.debugLineNum = 220790785;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Tr";
if (true) return __ref._internalsetstylestorange /*b4j.docU.xlsheetwriter*/ (null,_range,_styles,__c.True);
RDebugUtils.currentLine=220790786;
 //BA.debugLineNum = 220790786;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _internalsetstylestorange(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles,boolean _add) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "internalsetstylestorange", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "internalsetstylestorange", new Object[] {_range,_styles,_add}));}
anywheresoftware.b4a.objects.collections.Map _props = null;
int _col = 0;
int _row = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=220856320;
 //BA.debugLineNum = 220856320;BA.debugLine="Private Sub InternalSetStylesToRange (Range As XLR";
RDebugUtils.currentLine=220856321;
 //BA.debugLineNum = 220856321;BA.debugLine="Dim props As Map = MergeStyles(Styles)";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = __ref._mergestyles /*anywheresoftware.b4a.objects.collections.Map*/ (null,_styles);
RDebugUtils.currentLine=220856322;
 //BA.debugLineNum = 220856322;BA.debugLine="For col = Range.FirstAddress.Col0Based To Range.S";
{
final int step2 = 1;
final int limit2 = _range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ;
_col = _range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/  ;
for (;_col <= limit2 ;_col = _col + step2 ) {
RDebugUtils.currentLine=220856323;
 //BA.debugLineNum = 220856323;BA.debugLine="For row = Range.FirstAddress.Row0Based To Range.";
{
final int step3 = 1;
final int limit3 = _range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ;
_row = _range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/  ;
for (;_row <= limit3 ;_row = _row + step3 ) {
RDebugUtils.currentLine=220856324;
 //BA.debugLineNum = 220856324;BA.debugLine="Dim cell As PoiCell = GetCell(xl.AddressZero(co";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = __ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,__ref._xl /*b4j.docU.xlutils*/ ._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_col,_row));
RDebugUtils.currentLine=220856325;
 //BA.debugLineNum = 220856325;BA.debugLine="ApplyStyle(cell, Add, props)";
__ref._applystyle /*String*/ (null,_cell,_add,_props);
 }
};
 }
};
RDebugUtils.currentLine=220856328;
 //BA.debugLineNum = 220856328;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220856329;
 //BA.debugLineNum = 220856329;BA.debugLine="End Sub";
return null;
}
public String  _fillstylefromcell(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4j.objects.PoiCellStyleWrapper _cellstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "fillstylefromcell", true))
	 {return ((String) Debug.delegate(ba, "fillstylefromcell", new Object[] {_props,_cellstyle}));}
anywheresoftware.b4j.object.JavaObject _jstyle = null;
anywheresoftware.b4a.objects.collections.List _methods = null;
String _method = "";
RDebugUtils.currentLine=222429184;
 //BA.debugLineNum = 222429184;BA.debugLine="Private Sub FillStyleFromCell (props As Map, CellS";
RDebugUtils.currentLine=222429185;
 //BA.debugLineNum = 222429185;BA.debugLine="Dim jStyle As JavaObject = CellStyle";
_jstyle = new anywheresoftware.b4j.object.JavaObject();
_jstyle = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cellstyle.getObject()));
RDebugUtils.currentLine=222429186;
 //BA.debugLineNum = 222429186;BA.debugLine="For Each methods As List In Workbook.InternalAllS";
_methods = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalallsimplemethods /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_methods = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(group2.Get(index2)));
RDebugUtils.currentLine=222429187;
 //BA.debugLineNum = 222429187;BA.debugLine="For Each method As String In methods";
{
final anywheresoftware.b4a.BA.IterableList group3 = _methods;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=222429188;
 //BA.debugLineNum = 222429188;BA.debugLine="props.Put(method, jStyle.RunMethod(\"g\" & method";
_props.Put((Object)(_method),_jstyle.RunMethod("g"+_method.substring((int) (1)),(Object[])(__c.Null)));
 }
};
 }
};
RDebugUtils.currentLine=222429191;
 //BA.debugLineNum = 222429191;BA.debugLine="props.Put(\"setFont\", jStyle.RunMethod(\"getFontInd";
_props.Put((Object)("setFont"),_jstyle.RunMethod("getFontIndex",(Object[])(__c.Null)));
RDebugUtils.currentLine=222429192;
 //BA.debugLineNum = 222429192;BA.debugLine="For Each method As String In Workbook.InternalSty";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstylestrings /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_method = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=222429193;
 //BA.debugLineNum = 222429193;BA.debugLine="props.Put(method, jStyle.RunMethodJO(\"g\" & metho";
_props.Put((Object)(_method),_jstyle.RunMethodJO("g"+_method.substring((int) (1)),(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 }
};
RDebugUtils.currentLine=222429195;
 //BA.debugLineNum = 222429195;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PoiCellStyleWrapper  _createstyle(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((anywheresoftware.b4j.objects.PoiCellStyleWrapper) Debug.delegate(ba, "createstyle", new Object[] {_props}));}
anywheresoftware.b4j.objects.PoiCellStyleWrapper _style = null;
anywheresoftware.b4j.object.JavaObject _jstyle = null;
String _key = "";
RDebugUtils.currentLine=222494720;
 //BA.debugLineNum = 222494720;BA.debugLine="Private Sub CreateStyle (props As Map) As PoiCellS";
RDebugUtils.currentLine=222494721;
 //BA.debugLineNum = 222494721;BA.debugLine="Dim style As PoiCellStyle = CheckIfStyleExists (p";
_style = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
_style = __ref._checkifstyleexists /*anywheresoftware.b4j.objects.PoiCellStyleWrapper*/ (null,_props);
RDebugUtils.currentLine=222494722;
 //BA.debugLineNum = 222494722;BA.debugLine="If style.IsInitialized = False Then";
if (_style.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=222494723;
 //BA.debugLineNum = 222494723;BA.debugLine="style.Initialize(Workbook.PoiWorkbook)";
_style.Initialize(__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ );
RDebugUtils.currentLine=222494724;
 //BA.debugLineNum = 222494724;BA.debugLine="Workbook.InternalStylesCache.Put(props, style)";
__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_props.getObject()),(Object)(_style.getObject()));
RDebugUtils.currentLine=222494725;
 //BA.debugLineNum = 222494725;BA.debugLine="Dim jstyle As JavaObject = style";
_jstyle = new anywheresoftware.b4j.object.JavaObject();
_jstyle = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_style.getObject()));
RDebugUtils.currentLine=222494726;
 //BA.debugLineNum = 222494726;BA.debugLine="For Each key As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _props.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=222494727;
 //BA.debugLineNum = 222494727;BA.debugLine="If key = \"setFont\" Then";
if ((_key).equals("setFont")) { 
RDebugUtils.currentLine=222494728;
 //BA.debugLineNum = 222494728;BA.debugLine="jstyle.RunMethod(key, Array(Workbook.jWorkbook";
_jstyle.RunMethod(_key,new Object[]{__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFontAt",new Object[]{_props.Get((Object)(_key))})});
 }else {
RDebugUtils.currentLine=222494730;
 //BA.debugLineNum = 222494730;BA.debugLine="jstyle.RunMethod(key, Array(props.Get(key)))";
_jstyle.RunMethod(_key,new Object[]{_props.Get((Object)(_key))});
 };
 }
};
 };
RDebugUtils.currentLine=222494734;
 //BA.debugLineNum = 222494734;BA.debugLine="Return style";
if (true) return _style;
RDebugUtils.currentLine=222494735;
 //BA.debugLineNum = 222494735;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellStyleWrapper  _checkifstyleexists(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "checkifstyleexists", true))
	 {return ((anywheresoftware.b4j.objects.PoiCellStyleWrapper) Debug.delegate(ba, "checkifstyleexists", new Object[] {_props}));}
anywheresoftware.b4j.objects.PoiCellStyleWrapper _empty = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=222560256;
 //BA.debugLineNum = 222560256;BA.debugLine="Private Sub CheckIfStyleExists (props As Map) As P";
RDebugUtils.currentLine=222560257;
 //BA.debugLineNum = 222560257;BA.debugLine="Dim empty As PoiCellStyle";
_empty = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
RDebugUtils.currentLine=222560258;
 //BA.debugLineNum = 222560258;BA.debugLine="For Each m As Map In Workbook.InternalStylesCache";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group2.Get(index2)));
RDebugUtils.currentLine=222560259;
 //BA.debugLineNum = 222560259;BA.debugLine="If IsMapTheSameAsProps(m, props) Then";
if (__ref._ismapthesameasprops /*boolean*/ (null,_m,_props)) { 
RDebugUtils.currentLine=222560260;
 //BA.debugLineNum = 222560260;BA.debugLine="Return Workbook.InternalStylesCache.Get(m)";
if (true) return (anywheresoftware.b4j.objects.PoiCellStyleWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellStyleWrapper(), (org.apache.poi.ss.usermodel.CellStyle)(__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_m.getObject()))));
 };
 }
};
RDebugUtils.currentLine=222560263;
 //BA.debugLineNum = 222560263;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=222560264;
 //BA.debugLineNum = 222560264;BA.debugLine="End Sub";
return null;
}
public boolean  _ismapthesameasprops(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "ismapthesameasprops", true))
	 {return ((Boolean) Debug.delegate(ba, "ismapthesameasprops", new Object[] {_m,_props}));}
String _key = "";
int _i = 0;
boolean _b = false;
short _s = (short)0;
String _t = "";
RDebugUtils.currentLine=222625792;
 //BA.debugLineNum = 222625792;BA.debugLine="Private Sub IsMapTheSameAsProps (m As Map, Props A";
RDebugUtils.currentLine=222625793;
 //BA.debugLineNum = 222625793;BA.debugLine="If m.Size = Props.Size Then";
if (_m.getSize()==_props.getSize()) { 
RDebugUtils.currentLine=222625794;
 //BA.debugLineNum = 222625794;BA.debugLine="For Each key As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _props.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=222625795;
 //BA.debugLineNum = 222625795;BA.debugLine="If m.ContainsKey(key) = False Then Return False";
if (_m.ContainsKey((Object)(_key))==__c.False) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=222625797;
 //BA.debugLineNum = 222625797;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstyleints /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=222625798;
 //BA.debugLineNum = 222625798;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=222625799;
 //BA.debugLineNum = 222625799;BA.debugLine="Dim i As Int = Props.Get(key)";
_i = (int)(BA.ObjectToNumber(_props.Get((Object)(_key))));
RDebugUtils.currentLine=222625800;
 //BA.debugLineNum = 222625800;BA.debugLine="If i <> m.Get(key) Then";
if (_i!=(double)(BA.ObjectToNumber(_m.Get((Object)(_key))))) { 
RDebugUtils.currentLine=222625801;
 //BA.debugLineNum = 222625801;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=222625805;
 //BA.debugLineNum = 222625805;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group13 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstylebooleans /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = BA.ObjectToString(group13.Get(index13));
RDebugUtils.currentLine=222625806;
 //BA.debugLineNum = 222625806;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=222625807;
 //BA.debugLineNum = 222625807;BA.debugLine="Dim b As Boolean = Props.Get(key)";
_b = BA.ObjectToBoolean(_props.Get((Object)(_key)));
RDebugUtils.currentLine=222625808;
 //BA.debugLineNum = 222625808;BA.debugLine="If b <> m.Get(key) Then";
if (_b!=BA.ObjectToBoolean(_m.Get((Object)(_key)))) { 
RDebugUtils.currentLine=222625809;
 //BA.debugLineNum = 222625809;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=222625813;
 //BA.debugLineNum = 222625813;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group21 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstyleshorts /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_key = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=222625814;
 //BA.debugLineNum = 222625814;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=222625815;
 //BA.debugLineNum = 222625815;BA.debugLine="Dim s As Short = Props.Get(key)";
_s = (short)(BA.ObjectToNumber(_props.Get((Object)(_key))));
RDebugUtils.currentLine=222625816;
 //BA.debugLineNum = 222625816;BA.debugLine="If s <> m.Get(key) Then";
if (_s!=(double)(BA.ObjectToNumber(_m.Get((Object)(_key))))) { 
RDebugUtils.currentLine=222625817;
 //BA.debugLineNum = 222625817;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=222625821;
 //BA.debugLineNum = 222625821;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group29 = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalstylestrings /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_key = BA.ObjectToString(group29.Get(index29));
RDebugUtils.currentLine=222625822;
 //BA.debugLineNum = 222625822;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=222625823;
 //BA.debugLineNum = 222625823;BA.debugLine="Dim t As String = Props.Get(key)";
_t = BA.ObjectToString(_props.Get((Object)(_key)));
RDebugUtils.currentLine=222625824;
 //BA.debugLineNum = 222625824;BA.debugLine="If t <> m.Get(key) Then";
if ((_t).equals(BA.ObjectToString(_m.Get((Object)(_key)))) == false) { 
RDebugUtils.currentLine=222625825;
 //BA.debugLineNum = 222625825;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
RDebugUtils.currentLine=222625829;
 //BA.debugLineNum = 222625829;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=222625831;
 //BA.debugLineNum = 222625831;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=222625832;
 //BA.debugLineNum = 222625832;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.docU.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
RDebugUtils.currentLine=220004352;
 //BA.debugLineNum = 220004352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=220004353;
 //BA.debugLineNum = 220004353;BA.debugLine="Public PoiSheet As PoiSheet";
_poisheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
RDebugUtils.currentLine=220004354;
 //BA.debugLineNum = 220004354;BA.debugLine="Public xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=220004356;
 //BA.debugLineNum = 220004356;BA.debugLine="Public LastAccessed As XLAddress";
_lastaccessed = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=220004357;
 //BA.debugLineNum = 220004357;BA.debugLine="Private jsheet As JavaObject";
_jsheet = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=220004358;
 //BA.debugLineNum = 220004358;BA.debugLine="Public Workbook As XLWorkbookWriter";
_workbook = new b4j.docU.xlworkbookwriter();
RDebugUtils.currentLine=220004359;
 //BA.debugLineNum = 220004359;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlconditionalformattingrule  _createconditionalformattingrule(b4j.docU.xlsheetwriter __ref,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createconditionalformattingrule", true))
	 {return ((b4j.docU.xlconditionalformattingrule) Debug.delegate(ba, "createconditionalformattingrule", new Object[] {_formula}));}
b4j.docU.xlconditionalformattingrule _x = null;
anywheresoftware.b4j.object.JavaObject _m = null;
RDebugUtils.currentLine=221904896;
 //BA.debugLineNum = 221904896;BA.debugLine="Public Sub CreateConditionalFormattingRule(Formula";
RDebugUtils.currentLine=221904897;
 //BA.debugLineNum = 221904897;BA.debugLine="Dim x As XLConditionalFormattingRule";
_x = new b4j.docU.xlconditionalformattingrule();
RDebugUtils.currentLine=221904898;
 //BA.debugLineNum = 221904898;BA.debugLine="Dim m As JavaObject = Me";
_m = new anywheresoftware.b4j.object.JavaObject();
_m = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=221904899;
 //BA.debugLineNum = 221904899;BA.debugLine="x.Initialize(m.RunMethod(\"createConditionalFormat";
_x._initialize /*String*/ (null,ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_m.RunMethod("createConditionalFormattingRule",new Object[]{(Object)(__ref._getsheetconditionalformatting /*anywheresoftware.b4j.object.JavaObject*/ (null).getObject()),(Object)(_formula)}))));
RDebugUtils.currentLine=221904900;
 //BA.debugLineNum = 221904900;BA.debugLine="Return x";
if (true) return _x;
RDebugUtils.currentLine=221904901;
 //BA.debugLineNum = 221904901;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _createfreezepane(b4j.docU.xlsheetwriter __ref,int _numberofcolumns,int _numberofrows) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createfreezepane", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "createfreezepane", new Object[] {_numberofcolumns,_numberofrows}));}
RDebugUtils.currentLine=221315072;
 //BA.debugLineNum = 221315072;BA.debugLine="Public Sub CreateFreezePane (NumberOfColumns As In";
RDebugUtils.currentLine=221315073;
 //BA.debugLineNum = 221315073;BA.debugLine="jsheet.RunMethod(\"createFreezePane\", Array(Number";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFreezePane",new Object[]{(Object)(_numberofcolumns),(Object)(_numberofrows)});
RDebugUtils.currentLine=221315074;
 //BA.debugLineNum = 221315074;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221315075;
 //BA.debugLineNum = 221315075;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xltable  _createtable(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range,String _tablename,String _stylename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.docU.xltable) Debug.delegate(ba, "createtable", new Object[] {_range,_tablename,_stylename}));}
anywheresoftware.b4j.object.JavaObject _areareference = null;
anywheresoftware.b4j.object.JavaObject _table = null;
b4j.docU.xltable _t = null;
RDebugUtils.currentLine=222101504;
 //BA.debugLineNum = 222101504;BA.debugLine="Public Sub CreateTable (Range As XLRange, TableNam";
RDebugUtils.currentLine=222101505;
 //BA.debugLineNum = 222101505;BA.debugLine="If Workbook.IsXLSX = False Then";
if (__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._isxlsx /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=222101506;
 //BA.debugLineNum = 222101506;BA.debugLine="Log(\"Tables are supported in XLSX only.\")";
__c.LogImpl("9222101506","Tables are supported in XLSX only.",0);
RDebugUtils.currentLine=222101507;
 //BA.debugLineNum = 222101507;BA.debugLine="Return Null";
if (true) return (b4j.docU.xltable)(__c.Null);
 };
RDebugUtils.currentLine=222101509;
 //BA.debugLineNum = 222101509;BA.debugLine="If ValidateTableName(TableName) = False Then Retu";
if (__ref._validatetablename /*boolean*/ (null,_tablename)==__c.False) { 
if (true) return (b4j.docU.xltable)(__c.Null);};
RDebugUtils.currentLine=222101510;
 //BA.debugLineNum = 222101510;BA.debugLine="Range.Sheet = PoiSheet";
_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = __ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ ;
RDebugUtils.currentLine=222101511;
 //BA.debugLineNum = 222101511;BA.debugLine="Dim AreaReference As JavaObject = xl.XLRangeToAre";
_areareference = new anywheresoftware.b4j.object.JavaObject();
_areareference = __ref._xl /*b4j.docU.xlutils*/ ._xlrangetoareareference /*anywheresoftware.b4j.object.JavaObject*/ (null,__ref._workbook /*b4j.docU.xlworkbookwriter*/ ,_range);
RDebugUtils.currentLine=222101512;
 //BA.debugLineNum = 222101512;BA.debugLine="Dim Table As JavaObject = jsheet.RunMethod(\"creat";
_table = new anywheresoftware.b4j.object.JavaObject();
_table = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createTable",new Object[]{(Object)(_areareference.getObject())})));
RDebugUtils.currentLine=222101513;
 //BA.debugLineNum = 222101513;BA.debugLine="Table.RunMethod(\"setName\", Array(TableName))";
_table.RunMethod("setName",new Object[]{(Object)(_tablename)});
RDebugUtils.currentLine=222101514;
 //BA.debugLineNum = 222101514;BA.debugLine="Table.RunMethod(\"setStyleName\", Array(StyleName))";
_table.RunMethod("setStyleName",new Object[]{(Object)(_stylename)});
RDebugUtils.currentLine=222101515;
 //BA.debugLineNum = 222101515;BA.debugLine="Dim t As XLTable";
_t = new b4j.docU.xltable();
RDebugUtils.currentLine=222101516;
 //BA.debugLineNum = 222101516;BA.debugLine="t.Initialize(Table, Me)";
_t._initialize /*String*/ (null,ba,_table,(b4j.docU.xlsheetwriter)(this));
RDebugUtils.currentLine=222101517;
 //BA.debugLineNum = 222101517;BA.debugLine="Return t";
if (true) return _t;
RDebugUtils.currentLine=222101518;
 //BA.debugLineNum = 222101518;BA.debugLine="End Sub";
return null;
}
public boolean  _validatetablename(b4j.docU.xlsheetwriter __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "validatetablename", true))
	 {return ((Boolean) Debug.delegate(ba, "validatetablename", new Object[] {_name}));}
RDebugUtils.currentLine=222298112;
 //BA.debugLineNum = 222298112;BA.debugLine="Public Sub ValidateTableName (Name As String) As B";
RDebugUtils.currentLine=222298113;
 //BA.debugLineNum = 222298113;BA.debugLine="If Regex.IsMatch(Workbook.InternalNameRegex, Name";
if (__c.Regex.IsMatch(__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._internalnameregex /*String*/ ,_name)==__c.False) { 
RDebugUtils.currentLine=222298114;
 //BA.debugLineNum = 222298114;BA.debugLine="LogError(\"Invalid name: \" & Name)";
__c.LogError("Invalid name: "+_name);
RDebugUtils.currentLine=222298115;
 //BA.debugLineNum = 222298115;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=222298117;
 //BA.debugLineNum = 222298117;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=222298118;
 //BA.debugLineNum = 222298118;BA.debugLine="End Sub";
return false;
}
public b4j.docU.xlutils._xladdress  _getactivecell(b4j.docU.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getactivecell", true))
	 {return ((b4j.docU.xlutils._xladdress) Debug.delegate(ba, "getactivecell", null));}
b4j.docU.xlutils._xladdress _res = null;
anywheresoftware.b4j.object.JavaObject _celladdress = null;
RDebugUtils.currentLine=221380608;
 //BA.debugLineNum = 221380608;BA.debugLine="Public Sub getActiveCell As XLAddress";
RDebugUtils.currentLine=221380609;
 //BA.debugLineNum = 221380609;BA.debugLine="Dim res As XLAddress";
_res = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=221380610;
 //BA.debugLineNum = 221380610;BA.debugLine="Dim celladdress As JavaObject = jsheet.RunMethod(";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
_celladdress = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActiveCell",(Object[])(__c.Null))));
RDebugUtils.currentLine=221380611;
 //BA.debugLineNum = 221380611;BA.debugLine="If celladdress.IsInitialized = False Then Return";
if (_celladdress.IsInitialized()==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=221380612;
 //BA.debugLineNum = 221380612;BA.debugLine="Return xl.AddressZero(celladdress.RunMethod(\"getC";
if (true) return __ref._xl /*b4j.docU.xlutils*/ ._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int)(BA.ObjectToNumber(_celladdress.RunMethod("getColumn",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_celladdress.RunMethod("getRow",(Object[])(__c.Null)))));
RDebugUtils.currentLine=221380613;
 //BA.debugLineNum = 221380613;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiRowWrapper  _getrow(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((anywheresoftware.b4j.objects.PoiRowWrapper) Debug.delegate(ba, "getrow", new Object[] {_address}));}
anywheresoftware.b4j.objects.PoiRowWrapper _row = null;
RDebugUtils.currentLine=221052928;
 //BA.debugLineNum = 221052928;BA.debugLine="Public Sub GetRow (Address As XLAddress) As PoiRow";
RDebugUtils.currentLine=221052929;
 //BA.debugLineNum = 221052929;BA.debugLine="Dim row As PoiRow = PoiSheet.GetRow(Address.Row0B";
_row = new anywheresoftware.b4j.objects.PoiRowWrapper();
_row = __ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .GetRow(_address.Row0Based /*int*/ );
RDebugUtils.currentLine=221052930;
 //BA.debugLineNum = 221052930;BA.debugLine="If row.IsInitialized = False Then";
if (_row.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=221052931;
 //BA.debugLineNum = 221052931;BA.debugLine="row = PoiSheet.CreateRow(Address.Row0Based)";
_row = __ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .CreateRow(_address.Row0Based /*int*/ );
 };
RDebugUtils.currentLine=221052933;
 //BA.debugLineNum = 221052933;BA.debugLine="Return row";
if (true) return _row;
RDebugUtils.currentLine=221052934;
 //BA.debugLineNum = 221052934;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xlrange  _getprintarea(b4j.docU.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getprintarea", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "getprintarea", null));}
Object _ref = null;
b4j.docU.xlutils._xlrange _res = null;
RDebugUtils.currentLine=222756864;
 //BA.debugLineNum = 222756864;BA.debugLine="Public Sub getPrintArea As XLRange";
RDebugUtils.currentLine=222756865;
 //BA.debugLineNum = 222756865;BA.debugLine="Dim ref As Object = Workbook.jWorkbook.RunMethod(";
_ref = __ref._workbook /*b4j.docU.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPrintArea",new Object[]{(Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())});
RDebugUtils.currentLine=222756866;
 //BA.debugLineNum = 222756866;BA.debugLine="If ref = Null Then";
if (_ref== null) { 
RDebugUtils.currentLine=222756867;
 //BA.debugLineNum = 222756867;BA.debugLine="Dim res As XLRange";
_res = new b4j.docU.xlutils._xlrange();
RDebugUtils.currentLine=222756868;
 //BA.debugLineNum = 222756868;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=222756870;
 //BA.debugLineNum = 222756870;BA.debugLine="Return xl.RangeStringOrNameToRange(Workbook.PoiWo";
if (true) return __ref._xl /*b4j.docU.xlutils*/ ._rangestringornametorange /*b4j.docU.xlutils._xlrange*/ (null,__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ ,BA.ObjectToString(_ref));
RDebugUtils.currentLine=222756871;
 //BA.debugLineNum = 222756871;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getprintsetup(b4j.docU.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "getprintsetup", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getprintsetup", null));}
RDebugUtils.currentLine=222887936;
 //BA.debugLineNum = 222887936;BA.debugLine="Public Sub getPrintSetup As JavaObject";
RDebugUtils.currentLine=222887937;
 //BA.debugLineNum = 222887937;BA.debugLine="Return jsheet.RunMethod(\"getPrintSetup\", Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPrintSetup",(Object[])(__c.Null))));
RDebugUtils.currentLine=222887938;
 //BA.debugLineNum = 222887938;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _gettables(b4j.docU.xlsheetwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "gettables", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettables", null));}
anywheresoftware.b4a.objects.collections.List _t = null;
anywheresoftware.b4a.objects.collections.List _res = null;
Object _j = null;
b4j.docU.xltable _table = null;
RDebugUtils.currentLine=222167040;
 //BA.debugLineNum = 222167040;BA.debugLine="Public Sub GetTables As List";
RDebugUtils.currentLine=222167041;
 //BA.debugLineNum = 222167041;BA.debugLine="Dim t As List = jsheet.RunMethod(\"getTables\", Nul";
_t = new anywheresoftware.b4a.objects.collections.List();
_t = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getTables",(Object[])(__c.Null))));
RDebugUtils.currentLine=222167042;
 //BA.debugLineNum = 222167042;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=222167043;
 //BA.debugLineNum = 222167043;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=222167044;
 //BA.debugLineNum = 222167044;BA.debugLine="For Each j As Object In t";
{
final anywheresoftware.b4a.BA.IterableList group4 = _t;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_j = group4.Get(index4);
RDebugUtils.currentLine=222167045;
 //BA.debugLineNum = 222167045;BA.debugLine="Dim table As XLTable";
_table = new b4j.docU.xltable();
RDebugUtils.currentLine=222167046;
 //BA.debugLineNum = 222167046;BA.debugLine="table.Initialize(j, Me)";
_table._initialize /*String*/ (null,ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_j)),(b4j.docU.xlsheetwriter)(this));
RDebugUtils.currentLine=222167047;
 //BA.debugLineNum = 222167047;BA.debugLine="res.Add(table)";
_res.Add((Object)(_table));
 }
};
RDebugUtils.currentLine=222167049;
 //BA.debugLineNum = 222167049;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=222167050;
 //BA.debugLineNum = 222167050;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _groupcolumns(b4j.docU.xlsheetwriter __ref,int _fromcolumn0,int _tocolumn0,boolean _collapse) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "groupcolumns", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "groupcolumns", new Object[] {_fromcolumn0,_tocolumn0,_collapse}));}
RDebugUtils.currentLine=221642752;
 //BA.debugLineNum = 221642752;BA.debugLine="Public Sub GroupColumns (FromColumn0 As Int, ToCol";
RDebugUtils.currentLine=221642753;
 //BA.debugLineNum = 221642753;BA.debugLine="jsheet.RunMethod(\"groupColumn\", Array (FromColumn";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("groupColumn",new Object[]{(Object)(_fromcolumn0),(Object)(_tocolumn0)});
RDebugUtils.currentLine=221642754;
 //BA.debugLineNum = 221642754;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setColumnGroup";
if (_collapse) { 
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColumnGroupCollapsed",new Object[]{(Object)(_fromcolumn0),(Object)(_collapse)});};
RDebugUtils.currentLine=221642755;
 //BA.debugLineNum = 221642755;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221642756;
 //BA.debugLineNum = 221642756;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _grouprows(b4j.docU.xlsheetwriter __ref,int _fromrow0,int _torow0,boolean _collapse) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "grouprows", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "grouprows", new Object[] {_fromrow0,_torow0,_collapse}));}
RDebugUtils.currentLine=221708288;
 //BA.debugLineNum = 221708288;BA.debugLine="Public Sub GroupRows (FromRow0 As Int, ToRow0 As I";
RDebugUtils.currentLine=221708289;
 //BA.debugLineNum = 221708289;BA.debugLine="jsheet.RunMethod(\"groupRow\", Array(FromRow0, ToRo";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("groupRow",new Object[]{(Object)(_fromrow0),(Object)(_torow0)});
RDebugUtils.currentLine=221708290;
 //BA.debugLineNum = 221708290;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setRowGroupCol";
if (_collapse) { 
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setRowGroupCollapsed",new Object[]{(Object)(_fromrow0),(Object)(_collapse)});};
RDebugUtils.currentLine=221708291;
 //BA.debugLineNum = 221708291;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221708293;
 //BA.debugLineNum = 221708293;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.xlsheetwriter __ref,anywheresoftware.b4a.BA _ba,b4j.docU.xlutils _vxl,b4j.docU.xlworkbookwriter _vworkbookwriter,anywheresoftware.b4j.objects.PoiSheetWrapper _vsheet) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl,_vworkbookwriter,_vsheet}));}
RDebugUtils.currentLine=220069888;
 //BA.debugLineNum = 220069888;BA.debugLine="Public Sub Initialize (vxl As XLUtils, vWorkbookWr";
RDebugUtils.currentLine=220069889;
 //BA.debugLineNum = 220069889;BA.debugLine="PoiSheet = vSheet";
__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _vsheet;
RDebugUtils.currentLine=220069890;
 //BA.debugLineNum = 220069890;BA.debugLine="xl = vxl";
__ref._xl /*b4j.docU.xlutils*/  = _vxl;
RDebugUtils.currentLine=220069891;
 //BA.debugLineNum = 220069891;BA.debugLine="Workbook = vWorkbookWriter";
__ref._workbook /*b4j.docU.xlworkbookwriter*/  = _vworkbookwriter;
RDebugUtils.currentLine=220069892;
 //BA.debugLineNum = 220069892;BA.debugLine="jsheet = PoiSheet";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getObject()));
RDebugUtils.currentLine=220069893;
 //BA.debugLineNum = 220069893;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlsheetwriter  _putformula(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "putformula", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "putformula", new Object[] {_address,_value}));}
RDebugUtils.currentLine=220332032;
 //BA.debugLineNum = 220332032;BA.debugLine="Public Sub PutFormula (Address As XLAddress, Value";
RDebugUtils.currentLine=220332033;
 //BA.debugLineNum = 220332033;BA.debugLine="If Value.StartsWith(\"=\") Then Value = Value.SubSt";
if (_value.startsWith("=")) { 
_value = _value.substring((int) (1));};
RDebugUtils.currentLine=220332034;
 //BA.debugLineNum = 220332034;BA.debugLine="GetCell(Address).ValueFormula = Value";
__ref._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_address).setValueFormula(_value);
RDebugUtils.currentLine=220332035;
 //BA.debugLineNum = 220332035;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=220332036;
 //BA.debugLineNum = 220332036;BA.debugLine="End Sub";
return null;
}
public String  _removetable(b4j.docU.xlsheetwriter __ref,b4j.docU.xltable _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "removetable", true))
	 {return ((String) Debug.delegate(ba, "removetable", new Object[] {_table}));}
RDebugUtils.currentLine=222232576;
 //BA.debugLineNum = 222232576;BA.debugLine="Public Sub RemoveTable (Table As XLTable)";
RDebugUtils.currentLine=222232577;
 //BA.debugLineNum = 222232577;BA.debugLine="jsheet.RunMethod(\"removeTable\", Array(Table))";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("removeTable",new Object[]{(Object)(_table)});
RDebugUtils.currentLine=222232578;
 //BA.debugLineNum = 222232578;BA.debugLine="End Sub";
return "";
}
public String  _setactivecell(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setactivecell", true))
	 {return ((String) Debug.delegate(ba, "setactivecell", new Object[] {_address}));}
anywheresoftware.b4j.object.JavaObject _celladdress = null;
RDebugUtils.currentLine=221446144;
 //BA.debugLineNum = 221446144;BA.debugLine="Public Sub setActiveCell (Address As XLAddress)";
RDebugUtils.currentLine=221446145;
 //BA.debugLineNum = 221446145;BA.debugLine="Dim celladdress As JavaObject";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=221446146;
 //BA.debugLineNum = 221446146;BA.debugLine="celladdress.InitializeNewInstance(\"org.apache.poi";
_celladdress.InitializeNewInstance("org.apache.poi.ss.util.CellAddress",new Object[]{(Object)(_address.Row0Based /*int*/ ),(Object)(_address.Col0Based /*int*/ )});
RDebugUtils.currentLine=221446147;
 //BA.debugLineNum = 221446147;BA.debugLine="jsheet.RunMethod(\"setActiveCell\", Array(celladdre";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setActiveCell",new Object[]{(Object)(_celladdress.getObject())});
RDebugUtils.currentLine=221446148;
 //BA.debugLineNum = 221446148;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlsheetwriter  _setfittopage(b4j.docU.xlsheetwriter __ref,short _pageswide,short _pagestall) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setfittopage", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "setfittopage", new Object[] {_pageswide,_pagestall}));}
anywheresoftware.b4j.object.JavaObject _ps = null;
RDebugUtils.currentLine=222822400;
 //BA.debugLineNum = 222822400;BA.debugLine="Public Sub SetFitToPage (PagesWide As Short, Pages";
RDebugUtils.currentLine=222822401;
 //BA.debugLineNum = 222822401;BA.debugLine="jsheet.RunMethod(\"setFitToPage\", Array(True))";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFitToPage",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=222822402;
 //BA.debugLineNum = 222822402;BA.debugLine="Dim ps As JavaObject = getPrintSetup";
_ps = new anywheresoftware.b4j.object.JavaObject();
_ps = __ref._getprintsetup /*anywheresoftware.b4j.object.JavaObject*/ (null);
RDebugUtils.currentLine=222822403;
 //BA.debugLineNum = 222822403;BA.debugLine="ps.RunMethod(\"setFitWidth\", Array(PagesWide))";
_ps.RunMethod("setFitWidth",new Object[]{(Object)(_pageswide)});
RDebugUtils.currentLine=222822404;
 //BA.debugLineNum = 222822404;BA.debugLine="ps.RunMethod(\"setFitHeight\", Array(PagesTall))";
_ps.RunMethod("setFitHeight",new Object[]{(Object)(_pagestall)});
RDebugUtils.currentLine=222822405;
 //BA.debugLineNum = 222822405;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=222822406;
 //BA.debugLineNum = 222822406;BA.debugLine="End Sub";
return null;
}
public String  _setprintarea(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setprintarea", true))
	 {return ((String) Debug.delegate(ba, "setprintarea", new Object[] {_range}));}
RDebugUtils.currentLine=222691328;
 //BA.debugLineNum = 222691328;BA.debugLine="Public Sub setPrintArea(Range As XLRange)";
RDebugUtils.currentLine=222691329;
 //BA.debugLineNum = 222691329;BA.debugLine="Workbook.jWorkbook.RunMethod(\"setPrintArea\", Arra";
__ref._workbook /*b4j.docU.xlworkbookwriter*/ ._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setPrintArea",new Object[]{(Object)(__ref._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex()),(Object)(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ )});
RDebugUtils.currentLine=222691331;
 //BA.debugLineNum = 222691331;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlsheetwriter  _setstylestorange(b4j.docU.xlsheetwriter __ref,b4j.docU.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "setstylestorange", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "setstylestorange", new Object[] {_range,_styles}));}
RDebugUtils.currentLine=220725248;
 //BA.debugLineNum = 220725248;BA.debugLine="Public Sub SetStylesToRange (Range As XLRange, Sty";
RDebugUtils.currentLine=220725249;
 //BA.debugLineNum = 220725249;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Fa";
if (true) return __ref._internalsetstylestorange /*b4j.docU.xlsheetwriter*/ (null,_range,_styles,__c.False);
RDebugUtils.currentLine=220725250;
 //BA.debugLineNum = 220725250;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _shiftcolumns(b4j.docU.xlsheetwriter __ref,int _startcolumn0based,int _endcolumn0based,int _shiftamount) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "shiftcolumns", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "shiftcolumns", new Object[] {_startcolumn0based,_endcolumn0based,_shiftamount}));}
RDebugUtils.currentLine=221184000;
 //BA.debugLineNum = 221184000;BA.debugLine="Public Sub ShiftColumns (StartColumn0Based As Int,";
RDebugUtils.currentLine=221184001;
 //BA.debugLineNum = 221184001;BA.debugLine="jsheet.RunMethod(\"shiftColumns\", Array(StartColum";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("shiftColumns",new Object[]{(Object)(_startcolumn0based),(Object)(_endcolumn0based),(Object)(_shiftamount)});
RDebugUtils.currentLine=221184002;
 //BA.debugLineNum = 221184002;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221184003;
 //BA.debugLineNum = 221184003;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _shiftrows(b4j.docU.xlsheetwriter __ref,int _startrow0based,int _endrow0based,int _shiftamount) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "shiftrows", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "shiftrows", new Object[] {_startrow0based,_endrow0based,_shiftamount}));}
RDebugUtils.currentLine=221118464;
 //BA.debugLineNum = 221118464;BA.debugLine="Public Sub ShiftRows (StartRow0Based As Int, EndRo";
RDebugUtils.currentLine=221118465;
 //BA.debugLineNum = 221118465;BA.debugLine="jsheet.RunMethod(\"shiftRows\", Array(StartRow0Base";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("shiftRows",new Object[]{(Object)(_startrow0based),(Object)(_endrow0based),(Object)(_shiftamount)});
RDebugUtils.currentLine=221118466;
 //BA.debugLineNum = 221118466;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221118467;
 //BA.debugLineNum = 221118467;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _ungroupcolumns(b4j.docU.xlsheetwriter __ref,int _fromcolumn0,int _tocolumn0) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "ungroupcolumns", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "ungroupcolumns", new Object[] {_fromcolumn0,_tocolumn0}));}
RDebugUtils.currentLine=221773824;
 //BA.debugLineNum = 221773824;BA.debugLine="Public Sub UngroupColumns (FromColumn0 As Int, ToC";
RDebugUtils.currentLine=221773825;
 //BA.debugLineNum = 221773825;BA.debugLine="jsheet.RunMethod(\"ungroupColumn\", Array (FromColu";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("ungroupColumn",new Object[]{(Object)(_fromcolumn0),(Object)(_tocolumn0)});
RDebugUtils.currentLine=221773826;
 //BA.debugLineNum = 221773826;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221773827;
 //BA.debugLineNum = 221773827;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlsheetwriter  _ungrouprows(b4j.docU.xlsheetwriter __ref,int _fromrow0,int _torow0) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlsheetwriter";
if (Debug.shouldDelegate(ba, "ungrouprows", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "ungrouprows", new Object[] {_fromrow0,_torow0}));}
RDebugUtils.currentLine=221839360;
 //BA.debugLineNum = 221839360;BA.debugLine="Public Sub UngroupRows (FromRow0 As Int, ToRow0 As";
RDebugUtils.currentLine=221839361;
 //BA.debugLineNum = 221839361;BA.debugLine="jsheet.RunMethod(\"ungroupRow\", Array(FromRow0, To";
__ref._jsheet /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("ungroupRow",new Object[]{(Object)(_fromrow0),(Object)(_torow0)});
RDebugUtils.currentLine=221839362;
 //BA.debugLineNum = 221839362;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlsheetwriter)(this);
RDebugUtils.currentLine=221839363;
 //BA.debugLineNum = 221839363;BA.debugLine="End Sub";
return null;
}
public Object createConditionalFormattingRule (SheetConditionalFormatting s, String formula) {
	return s.createConditionalFormattingRule(formula);
}
}