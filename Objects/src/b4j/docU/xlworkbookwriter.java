package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlworkbookwriter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlworkbookwriter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlworkbookwriter.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook = null;
public b4j.docU.xlutils _xl = null;
public boolean _fromtemplate = false;
public anywheresoftware.b4j.object.JavaObject _jworkbook = null;
public int _maxrows = 0;
public int _maxcolumns = 0;
public String _mversionname = "";
public boolean _isxlsx = false;
public String _defaultfontname = "";
public short _defaultfontsize = (short)0;
public String _defaultextension = "";
public anywheresoftware.b4a.objects.collections.Map _internalstylescache = null;
public anywheresoftware.b4a.objects.collections.List _internalstyleshorts = null;
public anywheresoftware.b4a.objects.collections.List _internalstylebooleans = null;
public anywheresoftware.b4a.objects.collections.List _internalstyleints = null;
public anywheresoftware.b4a.objects.collections.List _internalstylestrings = null;
public anywheresoftware.b4a.objects.collections.List _internalallsimplemethods = null;
public String _internalnameregex = "";
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
public b4j.docU.xlsheetwriter  _createsheetwriterbyname(b4j.docU.xlworkbookwriter __ref,String _sheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createsheetwriterbyname", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "createsheetwriterbyname", new Object[] {_sheetname}));}
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
b4j.docU.xlsheetwriter _writer = null;
RDebugUtils.currentLine=227672064;
 //BA.debugLineNum = 227672064;BA.debugLine="Public Sub CreateSheetWriterByName (SheetName As S";
RDebugUtils.currentLine=227672065;
 //BA.debugLineNum = 227672065;BA.debugLine="Dim sheet As PoiSheet = PoiWorkbook.GetSheetByNam";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .GetSheetByName(_sheetname);
RDebugUtils.currentLine=227672066;
 //BA.debugLineNum = 227672066;BA.debugLine="If sheet.IsInitialized = False Then";
if (_sheet.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=227672067;
 //BA.debugLineNum = 227672067;BA.debugLine="sheet = PoiWorkbook.AddSheet(SheetName, PoiWorkb";
_sheet = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .AddSheet(_sheetname,__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getNumberOfSheets());
 };
RDebugUtils.currentLine=227672069;
 //BA.debugLineNum = 227672069;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new b4j.docU.xlsheetwriter();
RDebugUtils.currentLine=227672070;
 //BA.debugLineNum = 227672070;BA.debugLine="writer.Initialize(xl, Me, sheet)";
_writer._initialize /*String*/ (null,ba,__ref._xl /*b4j.docU.xlutils*/ ,(b4j.docU.xlworkbookwriter)(this),_sheet);
RDebugUtils.currentLine=227672071;
 //BA.debugLineNum = 227672071;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=227672072;
 //BA.debugLineNum = 227672072;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlstyle  _createstyle(b4j.docU.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((b4j.docU.xlstyle) Debug.delegate(ba, "createstyle", null));}
b4j.docU.xlstyle _style = null;
RDebugUtils.currentLine=227934208;
 //BA.debugLineNum = 227934208;BA.debugLine="Public Sub CreateStyle As XLStyle";
RDebugUtils.currentLine=227934209;
 //BA.debugLineNum = 227934209;BA.debugLine="Dim style As XLStyle";
_style = new b4j.docU.xlstyle();
RDebugUtils.currentLine=227934210;
 //BA.debugLineNum = 227934210;BA.debugLine="style.Initialize (Me)";
_style._initialize /*b4j.docU.xlstyle*/ (null,ba,(b4j.docU.xlworkbookwriter)(this));
RDebugUtils.currentLine=227934211;
 //BA.debugLineNum = 227934211;BA.debugLine="Return style";
if (true) return _style;
RDebugUtils.currentLine=227934212;
 //BA.debugLineNum = 227934212;BA.debugLine="End Sub";
return null;
}
public String  _saveas(b4j.docU.xlworkbookwriter __ref,String _dir,String _filename,boolean _renameifneeded) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "saveas", true))
	 {return ((String) Debug.delegate(ba, "saveas", new Object[] {_dir,_filename,_renameifneeded}));}
String _orig = "";
String _extension = "";
int _i = 0;
String _f = "";
RDebugUtils.currentLine=227606528;
 //BA.debugLineNum = 227606528;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
RDebugUtils.currentLine=227606529;
 //BA.debugLineNum = 227606529;BA.debugLine="If RenameIfNeeded Then";
if (_renameifneeded) { 
RDebugUtils.currentLine=227606530;
 //BA.debugLineNum = 227606530;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
_orig = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=227606531;
 //BA.debugLineNum = 227606531;BA.debugLine="Dim extension As String";
_extension = "";
RDebugUtils.currentLine=227606532;
 //BA.debugLineNum = 227606532;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
_i = _orig.lastIndexOf(".");
RDebugUtils.currentLine=227606533;
 //BA.debugLineNum = 227606533;BA.debugLine="If i >-1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=227606534;
 //BA.debugLineNum = 227606534;BA.debugLine="extension = orig.SubString(i)";
_extension = _orig.substring(_i);
RDebugUtils.currentLine=227606535;
 //BA.debugLineNum = 227606535;BA.debugLine="orig = orig.SubString2(0, i)";
_orig = _orig.substring((int) (0),_i);
 };
RDebugUtils.currentLine=227606537;
 //BA.debugLineNum = 227606537;BA.debugLine="For i = 0 To 10";
{
final int step9 = 1;
final int limit9 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=227606538;
 //BA.debugLineNum = 227606538;BA.debugLine="Dim f As String";
_f = "";
RDebugUtils.currentLine=227606539;
 //BA.debugLineNum = 227606539;BA.debugLine="Try";
try {RDebugUtils.currentLine=227606540;
 //BA.debugLineNum = 227606540;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
if (_i==0) { 
_f = _orig+_extension;}
else {
_f = _orig+" ("+BA.NumberToString(_i)+")"+_extension;};
RDebugUtils.currentLine=227606541;
 //BA.debugLineNum = 227606541;BA.debugLine="PoiWorkbook.Save(f, \"\")";
__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .Save(_f,"");
RDebugUtils.currentLine=227606542;
 //BA.debugLineNum = 227606542;BA.debugLine="Return f";
if (true) return _f;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=227606544;
 //BA.debugLineNum = 227606544;BA.debugLine="Log(\"Failed: \" & f)";
__c.LogImpl("9227606544","Failed: "+_f,0);
 };
 }
};
 };
RDebugUtils.currentLine=227606548;
 //BA.debugLineNum = 227606548;BA.debugLine="PoiWorkbook.Save(Dir, FileName)";
__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .Save(_dir,_filename);
RDebugUtils.currentLine=227606549;
 //BA.debugLineNum = 227606549;BA.debugLine="Return File.Combine(Dir, FileName)";
if (true) return __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=227606550;
 //BA.debugLineNum = 227606550;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlsheetwriter  _createsheetwriterbyindex(b4j.docU.xlworkbookwriter __ref,int _sheetindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createsheetwriterbyindex", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "createsheetwriterbyindex", new Object[] {_sheetindex}));}
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
b4j.docU.xlsheetwriter _writer = null;
RDebugUtils.currentLine=227737600;
 //BA.debugLineNum = 227737600;BA.debugLine="Public Sub CreateSheetWriterByIndex (SheetIndex As";
RDebugUtils.currentLine=227737601;
 //BA.debugLineNum = 227737601;BA.debugLine="Dim Sheet As PoiSheet = PoiWorkbook.GetSheet(Shee";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .GetSheet(_sheetindex);
RDebugUtils.currentLine=227737602;
 //BA.debugLineNum = 227737602;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new b4j.docU.xlsheetwriter();
RDebugUtils.currentLine=227737603;
 //BA.debugLineNum = 227737603;BA.debugLine="writer.Initialize(xl, Me, Sheet)";
_writer._initialize /*String*/ (null,ba,__ref._xl /*b4j.docU.xlutils*/ ,(b4j.docU.xlworkbookwriter)(this),_sheet);
RDebugUtils.currentLine=227737604;
 //BA.debugLineNum = 227737604;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=227737605;
 //BA.debugLineNum = 227737605;BA.debugLine="End Sub";
return null;
}
public String  _evaluateformulas(b4j.docU.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "evaluateformulas", true))
	 {return ((String) Debug.delegate(ba, "evaluateformulas", null));}
RDebugUtils.currentLine=227999744;
 //BA.debugLineNum = 227999744;BA.debugLine="Public Sub EvaluateFormulas";
RDebugUtils.currentLine=227999745;
 //BA.debugLineNum = 227999745;BA.debugLine="jWorkbook.RunMethodJO(\"getCreationHelper\", Null).";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(__c.Null)).RunMethod("evaluateAll",(Object[])(__c.Null));
RDebugUtils.currentLine=227999746;
 //BA.debugLineNum = 227999746;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PoiFontWrapper  _getfont(b4j.docU.xlworkbookwriter __ref,short _size,boolean _bold,String _name,boolean _italic,boolean _underline,int _indexedcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getfont", true))
	 {return ((anywheresoftware.b4j.objects.PoiFontWrapper) Debug.delegate(ba, "getfont", new Object[] {_size,_bold,_name,_italic,_underline,_indexedcolor}));}
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
RDebugUtils.currentLine=227868672;
 //BA.debugLineNum = 227868672;BA.debugLine="Public Sub GetFont (Size As Short, Bold As Boolean";
RDebugUtils.currentLine=227868673;
 //BA.debugLineNum = 227868673;BA.debugLine="For Each f As PoiFont In PoiWorkbook.Fonts";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getFonts();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = (anywheresoftware.b4j.objects.PoiFontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiFontWrapper(), (org.apache.poi.ss.usermodel.Font)(group1.Get(index1)));
RDebugUtils.currentLine=227868674;
 //BA.debugLineNum = 227868674;BA.debugLine="If f.Size = Size And f.Bold = Bold And f.Name =";
if (_f.getSize()==_size && _f.getBold()==_bold && (_f.getName()).equals(_name) && _f.getItalic()==_italic && _f.getUnderline()==_underline && _f.getIndexedColor()==_indexedcolor) { 
RDebugUtils.currentLine=227868675;
 //BA.debugLineNum = 227868675;BA.debugLine="Return f";
if (true) return _f;
 };
 }
};
RDebugUtils.currentLine=227868678;
 //BA.debugLineNum = 227868678;BA.debugLine="Dim f As PoiFont";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
RDebugUtils.currentLine=227868679;
 //BA.debugLineNum = 227868679;BA.debugLine="f.Initialize(PoiWorkbook)";
_f.Initialize(__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ );
RDebugUtils.currentLine=227868680;
 //BA.debugLineNum = 227868680;BA.debugLine="f.Size = Size";
_f.setSize(_size);
RDebugUtils.currentLine=227868681;
 //BA.debugLineNum = 227868681;BA.debugLine="f.Bold = Bold";
_f.setBold(_bold);
RDebugUtils.currentLine=227868682;
 //BA.debugLineNum = 227868682;BA.debugLine="f.Name = Name";
_f.setName(_name);
RDebugUtils.currentLine=227868683;
 //BA.debugLineNum = 227868683;BA.debugLine="f.Italic = Italic";
_f.setItalic(_italic);
RDebugUtils.currentLine=227868684;
 //BA.debugLineNum = 227868684;BA.debugLine="f.Underline = Underline";
_f.setUnderline(_underline);
RDebugUtils.currentLine=227868685;
 //BA.debugLineNum = 227868685;BA.debugLine="f.IndexedColor = IndexedColor";
_f.setIndexedColor((short) (_indexedcolor));
RDebugUtils.currentLine=227868686;
 //BA.debugLineNum = 227868686;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=227868687;
 //BA.debugLineNum = 227868687;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.xlworkbookwriter __ref,anywheresoftware.b4a.BA _ba,b4j.docU.xlutils _vxl,anywheresoftware.b4j.objects.PoiWorkbookWrapper _vworkbook,boolean _vfromtemplate) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl,_vworkbook,_vfromtemplate}));}
RDebugUtils.currentLine=227475456;
 //BA.debugLineNum = 227475456;BA.debugLine="Public Sub Initialize (vXL As XLUtils, vWorkbook A";
RDebugUtils.currentLine=227475457;
 //BA.debugLineNum = 227475457;BA.debugLine="xl = vXL";
__ref._xl /*b4j.docU.xlutils*/  = _vxl;
RDebugUtils.currentLine=227475458;
 //BA.debugLineNum = 227475458;BA.debugLine="PoiWorkbook = vWorkbook";
__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/  = _vworkbook;
RDebugUtils.currentLine=227475459;
 //BA.debugLineNum = 227475459;BA.debugLine="FromTemplate = vFromTemplate";
__ref._fromtemplate /*boolean*/  = _vfromtemplate;
RDebugUtils.currentLine=227475460;
 //BA.debugLineNum = 227475460;BA.debugLine="jWorkbook = PoiWorkbook";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getObject()));
RDebugUtils.currentLine=227475461;
 //BA.debugLineNum = 227475461;BA.debugLine="mVersionName = jWorkbook.RunMethodJO(\"getSpreadsh";
__ref._mversionname /*String*/  = BA.ObjectToString(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getSpreadsheetVersion",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
RDebugUtils.currentLine=227475462;
 //BA.debugLineNum = 227475462;BA.debugLine="IsXLSX = mVersionName = \"EXCEL2007\"";
__ref._isxlsx /*boolean*/  = (__ref._mversionname /*String*/ ).equals("EXCEL2007");
RDebugUtils.currentLine=227475463;
 //BA.debugLineNum = 227475463;BA.debugLine="If IsXLSX Then";
if (__ref._isxlsx /*boolean*/ ) { 
RDebugUtils.currentLine=227475464;
 //BA.debugLineNum = 227475464;BA.debugLine="MaxRows = 0x100000";
__ref._maxrows /*int*/  = ((int)0x100000);
RDebugUtils.currentLine=227475465;
 //BA.debugLineNum = 227475465;BA.debugLine="MaxColumns = 0x4000";
__ref._maxcolumns /*int*/  = ((int)0x4000);
RDebugUtils.currentLine=227475466;
 //BA.debugLineNum = 227475466;BA.debugLine="DefaultFontName = \"Calibri\"";
__ref._defaultfontname /*String*/  = "Calibri";
RDebugUtils.currentLine=227475467;
 //BA.debugLineNum = 227475467;BA.debugLine="DefaultFontSize = 11";
__ref._defaultfontsize /*short*/  = (short) (11);
RDebugUtils.currentLine=227475468;
 //BA.debugLineNum = 227475468;BA.debugLine="DefaultExtension = \".xlsx\"";
__ref._defaultextension /*String*/  = ".xlsx";
 }else {
RDebugUtils.currentLine=227475470;
 //BA.debugLineNum = 227475470;BA.debugLine="MaxRows = 0x10000";
__ref._maxrows /*int*/  = ((int)0x10000);
RDebugUtils.currentLine=227475471;
 //BA.debugLineNum = 227475471;BA.debugLine="MaxColumns = 0x0100";
__ref._maxcolumns /*int*/  = ((int)0x0100);
RDebugUtils.currentLine=227475472;
 //BA.debugLineNum = 227475472;BA.debugLine="DefaultFontName = \"Arial\"";
__ref._defaultfontname /*String*/  = "Arial";
RDebugUtils.currentLine=227475473;
 //BA.debugLineNum = 227475473;BA.debugLine="DefaultFontSize = 10";
__ref._defaultfontsize /*short*/  = (short) (10);
RDebugUtils.currentLine=227475474;
 //BA.debugLineNum = 227475474;BA.debugLine="DefaultExtension = \".xls\"";
__ref._defaultextension /*String*/  = ".xls";
 };
RDebugUtils.currentLine=227475476;
 //BA.debugLineNum = 227475476;BA.debugLine="InternalStylesCache.Initialize";
__ref._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=227475477;
 //BA.debugLineNum = 227475477;BA.debugLine="End Sub";
return "";
}
public String  _getversionname(b4j.docU.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getversionname", true))
	 {return ((String) Debug.delegate(ba, "getversionname", null));}
RDebugUtils.currentLine=227540992;
 //BA.debugLineNum = 227540992;BA.debugLine="Public Sub getVersionName As String";
RDebugUtils.currentLine=227540993;
 //BA.debugLineNum = 227540993;BA.debugLine="Return mVersionName";
if (true) return __ref._mversionname /*String*/ ;
RDebugUtils.currentLine=227540994;
 //BA.debugLineNum = 227540994;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _addnamedrange(b4j.docU.xlworkbookwriter __ref,String _name,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "addnamedrange", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "addnamedrange", new Object[] {_name,_range}));}
anywheresoftware.b4j.object.JavaObject _cellrangeaddress = null;
anywheresoftware.b4j.object.JavaObject _jname = null;
RDebugUtils.currentLine=228196352;
 //BA.debugLineNum = 228196352;BA.debugLine="Public Sub AddNamedRange (Name As String, Range As";
RDebugUtils.currentLine=228196353;
 //BA.debugLineNum = 228196353;BA.debugLine="RemoveNamedRange(Name)";
__ref._removenamedrange /*String*/ (null,_name);
RDebugUtils.currentLine=228196354;
 //BA.debugLineNum = 228196354;BA.debugLine="If Range.Sheet.IsInitialized = False Then";
if (_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=228196355;
 //BA.debugLineNum = 228196355;BA.debugLine="LogError(\"Range.Sheet must me set. Use xl.Create";
__c.LogError("Range.Sheet must me set. Use xl.CreateXLRangeWithSheet!");
 };
RDebugUtils.currentLine=228196357;
 //BA.debugLineNum = 228196357;BA.debugLine="Dim CellRangeAddress As JavaObject = xl.XLRangeTo";
_cellrangeaddress = new anywheresoftware.b4j.object.JavaObject();
_cellrangeaddress = __ref._xl /*b4j.docU.xlutils*/ ._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (null,_range);
RDebugUtils.currentLine=228196358;
 //BA.debugLineNum = 228196358;BA.debugLine="Dim jname As JavaObject = CreateName(Name, CellRa";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = __ref._createname /*anywheresoftware.b4j.object.JavaObject*/ (null,_name,BA.ObjectToString(_cellrangeaddress.RunMethod("formatAsString",new Object[]{(Object)(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName()),(Object)(__c.True)})));
RDebugUtils.currentLine=228196359;
 //BA.debugLineNum = 228196359;BA.debugLine="Return jname";
if (true) return _jname;
RDebugUtils.currentLine=228196360;
 //BA.debugLineNum = 228196360;BA.debugLine="End Sub";
return null;
}
public String  _removenamedrange(b4j.docU.xlworkbookwriter __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "removenamedrange", true))
	 {return ((String) Debug.delegate(ba, "removenamedrange", new Object[] {_name}));}
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4a.objects.collections.List _dontmodifylistwhileremoving = null;
Object _n = null;
RDebugUtils.currentLine=228458496;
 //BA.debugLineNum = 228458496;BA.debugLine="Public Sub RemoveNamedRange (Name As String)";
RDebugUtils.currentLine=228458497;
 //BA.debugLineNum = 228458497;BA.debugLine="Dim Names As List = jWorkbook.RunMethod(\"getNames";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getNames",new Object[]{(Object)(_name)})));
RDebugUtils.currentLine=228458498;
 //BA.debugLineNum = 228458498;BA.debugLine="Dim DontModifyListWhileRemoving As List";
_dontmodifylistwhileremoving = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=228458499;
 //BA.debugLineNum = 228458499;BA.debugLine="DontModifyListWhileRemoving.Initialize";
_dontmodifylistwhileremoving.Initialize();
RDebugUtils.currentLine=228458500;
 //BA.debugLineNum = 228458500;BA.debugLine="DontModifyListWhileRemoving.AddAll(Names)";
_dontmodifylistwhileremoving.AddAll(_names);
RDebugUtils.currentLine=228458501;
 //BA.debugLineNum = 228458501;BA.debugLine="For Each n As Object In DontModifyListWhileRemovi";
{
final anywheresoftware.b4a.BA.IterableList group5 = _dontmodifylistwhileremoving;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_n = group5.Get(index5);
RDebugUtils.currentLine=228458502;
 //BA.debugLineNum = 228458502;BA.debugLine="jWorkbook.RunMethod(\"removeName\", Array(n))";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("removeName",new Object[]{_n});
 }
};
RDebugUtils.currentLine=228458504;
 //BA.debugLineNum = 228458504;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _createname(b4j.docU.xlworkbookwriter __ref,String _name,String _formula) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "createname", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "createname", new Object[] {_name,_formula}));}
anywheresoftware.b4j.object.JavaObject _jname = null;
RDebugUtils.currentLine=228261888;
 //BA.debugLineNum = 228261888;BA.debugLine="Private Sub CreateName (Name As String, Formula As";
RDebugUtils.currentLine=228261889;
 //BA.debugLineNum = 228261889;BA.debugLine="Dim jname As JavaObject = jWorkbook.RunMethod(\"cr";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createName",(Object[])(__c.Null))));
RDebugUtils.currentLine=228261890;
 //BA.debugLineNum = 228261890;BA.debugLine="jname.RunMethod(\"setNameName\", Array(Name))";
_jname.RunMethod("setNameName",new Object[]{(Object)(_name)});
RDebugUtils.currentLine=228261891;
 //BA.debugLineNum = 228261891;BA.debugLine="jname.RunMethod(\"setRefersToFormula\", Array(Formu";
_jname.RunMethod("setRefersToFormula",new Object[]{(Object)(_formula)});
RDebugUtils.currentLine=228261892;
 //BA.debugLineNum = 228261892;BA.debugLine="Return jname";
if (true) return _jname;
RDebugUtils.currentLine=228261893;
 //BA.debugLineNum = 228261893;BA.debugLine="End Sub";
return null;
}
public String  _addnamedrangeoffset(b4j.docU.xlworkbookwriter __ref,String _name,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "addnamedrangeoffset", true))
	 {return ((String) Debug.delegate(ba, "addnamedrangeoffset", new Object[] {_name,_range}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=228392960;
 //BA.debugLineNum = 228392960;BA.debugLine="Public Sub AddNamedRangeOffset (Name As String, Ra";
RDebugUtils.currentLine=228392961;
 //BA.debugLineNum = 228392961;BA.debugLine="RemoveNamedRange(Name)";
__ref._removenamedrange /*String*/ (null,_name);
RDebugUtils.currentLine=228392962;
 //BA.debugLineNum = 228392962;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=228392963;
 //BA.debugLineNum = 228392963;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=228392964;
 //BA.debugLineNum = 228392964;BA.debugLine="sb.Append(\"OFFSET(\").Append(xl.XLAddressToCellRef";
_sb.Append("OFFSET(").Append(BA.ObjectToString(__ref._xl /*b4j.docU.xlutils*/ ._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (null,_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ ).RunMethod("formatAsString",(Object[])(__c.Null))));
RDebugUtils.currentLine=228392965;
 //BA.debugLineNum = 228392965;BA.debugLine="sb.Append(\", 0, 0, \").Append(Range.SecondAddress.";
_sb.Append(", 0, 0, ").Append(BA.NumberToString(_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ -_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ +1)).Append(", ");
RDebugUtils.currentLine=228392966;
 //BA.debugLineNum = 228392966;BA.debugLine="sb.Append(Range.SecondAddress.Col0Based - Range.F";
_sb.Append(BA.NumberToString(_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ -_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ +1)).Append(")");
RDebugUtils.currentLine=228392967;
 //BA.debugLineNum = 228392967;BA.debugLine="CreateName(Name, sb.ToString)";
__ref._createname /*anywheresoftware.b4j.object.JavaObject*/ (null,_name,_sb.ToString());
RDebugUtils.currentLine=228392968;
 //BA.debugLineNum = 228392968;BA.debugLine="End Sub";
return "";
}
public String  _addnamedrangescoped(b4j.docU.xlworkbookwriter __ref,String _name,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "addnamedrangescoped", true))
	 {return ((String) Debug.delegate(ba, "addnamedrangescoped", new Object[] {_name,_range}));}
anywheresoftware.b4j.object.JavaObject _jname = null;
RDebugUtils.currentLine=228327424;
 //BA.debugLineNum = 228327424;BA.debugLine="Public Sub AddNamedRangeScoped (Name As String, Ra";
RDebugUtils.currentLine=228327425;
 //BA.debugLineNum = 228327425;BA.debugLine="Dim jName As JavaObject = AddNamedRange(Name, Ran";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = __ref._addnamedrange /*anywheresoftware.b4j.object.JavaObject*/ (null,_name,_range);
RDebugUtils.currentLine=228327426;
 //BA.debugLineNum = 228327426;BA.debugLine="jName.RunMethod(\"setSheetIndex\", Array(Range.Shee";
_jname.RunMethod("setSheetIndex",new Object[]{(Object)(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())});
RDebugUtils.currentLine=228327427;
 //BA.debugLineNum = 228327427;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
RDebugUtils.currentLine=227409920;
 //BA.debugLineNum = 227409920;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=227409921;
 //BA.debugLineNum = 227409921;BA.debugLine="Public PoiWorkbook As PoiWorkbook";
_poiworkbook = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=227409922;
 //BA.debugLineNum = 227409922;BA.debugLine="Public xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=227409923;
 //BA.debugLineNum = 227409923;BA.debugLine="Private FromTemplate As Boolean 'ignore";
_fromtemplate = false;
RDebugUtils.currentLine=227409924;
 //BA.debugLineNum = 227409924;BA.debugLine="Public jWorkbook As JavaObject";
_jworkbook = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=227409925;
 //BA.debugLineNum = 227409925;BA.debugLine="Public MaxRows, MaxColumns As Int";
_maxrows = 0;
_maxcolumns = 0;
RDebugUtils.currentLine=227409926;
 //BA.debugLineNum = 227409926;BA.debugLine="Private mVersionName As String";
_mversionname = "";
RDebugUtils.currentLine=227409927;
 //BA.debugLineNum = 227409927;BA.debugLine="Public IsXLSX As Boolean";
_isxlsx = false;
RDebugUtils.currentLine=227409928;
 //BA.debugLineNum = 227409928;BA.debugLine="Public DefaultFontName As String";
_defaultfontname = "";
RDebugUtils.currentLine=227409929;
 //BA.debugLineNum = 227409929;BA.debugLine="Public DefaultFontSize As Short";
_defaultfontsize = (short)0;
RDebugUtils.currentLine=227409930;
 //BA.debugLineNum = 227409930;BA.debugLine="Public DefaultExtension As String";
_defaultextension = "";
RDebugUtils.currentLine=227409931;
 //BA.debugLineNum = 227409931;BA.debugLine="Public InternalStylesCache As Map";
_internalstylescache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=227409932;
 //BA.debugLineNum = 227409932;BA.debugLine="Public InternalStyleShorts As List = Array(\"setBo";
_internalstyleshorts = new anywheresoftware.b4a.objects.collections.List();
_internalstyleshorts = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setBottomBorderColor"),(Object)("setLeftBorderColor"),(Object)("setRightBorderColor"),(Object)("setTopBorderColor"),(Object)("setFillForegroundColor"),(Object)("setFillBackgroundColor"),(Object)("setIndention"),(Object)("setDataFormat"),(Object)("setRotation")});
RDebugUtils.currentLine=227409933;
 //BA.debugLineNum = 227409933;BA.debugLine="Public InternalStyleBooleans As List = Array(\"set";
_internalstylebooleans = new anywheresoftware.b4a.objects.collections.List();
_internalstylebooleans = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setLocked"),(Object)("setHidden"),(Object)("setWrapText")});
RDebugUtils.currentLine=227409934;
 //BA.debugLineNum = 227409934;BA.debugLine="Public InternalStyleInts As List = Array(\"setFont";
_internalstyleints = new anywheresoftware.b4a.objects.collections.List();
_internalstyleints = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setFont")});
RDebugUtils.currentLine=227409935;
 //BA.debugLineNum = 227409935;BA.debugLine="Public InternalStyleStrings As List = Array(\"setB";
_internalstylestrings = new anywheresoftware.b4a.objects.collections.List();
_internalstylestrings = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setBorderBottom"),(Object)("setBorderLeft"),(Object)("setBorderRight"),(Object)("setBorderTop"),(Object)("setAlignment"),(Object)("setVerticalAlignment"),(Object)("setFillPattern")});
RDebugUtils.currentLine=227409936;
 //BA.debugLineNum = 227409936;BA.debugLine="Public InternalAllSimpleMethods As List = Array(I";
_internalallsimplemethods = new anywheresoftware.b4a.objects.collections.List();
_internalallsimplemethods = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._internalstyleshorts /*anywheresoftware.b4a.objects.collections.List*/ .getObject()),(Object)(__ref._internalstylebooleans /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=227409937;
 //BA.debugLineNum = 227409937;BA.debugLine="Public InternalNameRegex As String = \"[_A-Za-z][_";
_internalnameregex = "[_A-Za-z][_\\.A-Za-z0-9]+";
RDebugUtils.currentLine=227409938;
 //BA.debugLineNum = 227409938;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlsheetwriter  _clonesheet(b4j.docU.xlworkbookwriter __ref,b4j.docU.xlsheetwriter _sheet,String _newsheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "clonesheet", true))
	 {return ((b4j.docU.xlsheetwriter) Debug.delegate(ba, "clonesheet", new Object[] {_sheet,_newsheetname}));}
anywheresoftware.b4j.objects.PoiSheetWrapper _newpoisheet = null;
b4j.docU.xlsheetwriter _writer = null;
RDebugUtils.currentLine=227803136;
 //BA.debugLineNum = 227803136;BA.debugLine="Public Sub CloneSheet (Sheet As XLSheetWriter, New";
RDebugUtils.currentLine=227803137;
 //BA.debugLineNum = 227803137;BA.debugLine="Dim NewPoiSheet As PoiSheet = jWorkbook.RunMethod";
_newpoisheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_newpoisheet = (anywheresoftware.b4j.objects.PoiSheetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiSheetWrapper(), (org.apache.poi.ss.usermodel.Sheet)(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("cloneSheet",new Object[]{(Object)(_sheet._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())})));
RDebugUtils.currentLine=227803138;
 //BA.debugLineNum = 227803138;BA.debugLine="NewPoiSheet.Name = NewSheetName";
_newpoisheet.setName(_newsheetname);
RDebugUtils.currentLine=227803139;
 //BA.debugLineNum = 227803139;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new b4j.docU.xlsheetwriter();
RDebugUtils.currentLine=227803140;
 //BA.debugLineNum = 227803140;BA.debugLine="writer.Initialize(xl, Me, NewPoiSheet)";
_writer._initialize /*String*/ (null,ba,__ref._xl /*b4j.docU.xlutils*/ ,(b4j.docU.xlworkbookwriter)(this),_newpoisheet);
RDebugUtils.currentLine=227803141;
 //BA.debugLineNum = 227803141;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=227803142;
 //BA.debugLineNum = 227803142;BA.debugLine="End Sub";
return null;
}
public int  _getactivesheetindex(b4j.docU.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getactivesheetindex", true))
	 {return ((Integer) Debug.delegate(ba, "getactivesheetindex", null));}
RDebugUtils.currentLine=228065280;
 //BA.debugLineNum = 228065280;BA.debugLine="Public Sub getActiveSheetIndex As Int";
RDebugUtils.currentLine=228065281;
 //BA.debugLineNum = 228065281;BA.debugLine="Return jWorkbook.RunMethod(\"getActiveSheetIndex\",";
if (true) return (int)(BA.ObjectToNumber(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActiveSheetIndex",(Object[])(__c.Null))));
RDebugUtils.currentLine=228065282;
 //BA.debugLineNum = 228065282;BA.debugLine="End Sub";
return 0;
}
public boolean  _getforceformularecalculation(b4j.docU.xlworkbookwriter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "getforceformularecalculation", true))
	 {return ((Boolean) Debug.delegate(ba, "getforceformularecalculation", null));}
RDebugUtils.currentLine=228589568;
 //BA.debugLineNum = 228589568;BA.debugLine="Public Sub getForceFormulaRecalculation As Boolean";
RDebugUtils.currentLine=228589569;
 //BA.debugLineNum = 228589569;BA.debugLine="Return jWorkbook.RunMethod(\"getForceFormulaRecalc";
if (true) return BA.ObjectToBoolean(__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getForceFormulaRecalculation",(Object[])(__c.Null)));
RDebugUtils.currentLine=228589570;
 //BA.debugLineNum = 228589570;BA.debugLine="End Sub";
return false;
}
public String  _removesheetat(b4j.docU.xlworkbookwriter __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "removesheetat", true))
	 {return ((String) Debug.delegate(ba, "removesheetat", new Object[] {_index}));}
RDebugUtils.currentLine=228524032;
 //BA.debugLineNum = 228524032;BA.debugLine="Public Sub RemoveSheetAt (Index As Int)";
RDebugUtils.currentLine=228524033;
 //BA.debugLineNum = 228524033;BA.debugLine="jWorkbook.RunMethod(\"removeSheetAt\", Array(Index)";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("removeSheetAt",new Object[]{(Object)(_index)});
RDebugUtils.currentLine=228524034;
 //BA.debugLineNum = 228524034;BA.debugLine="End Sub";
return "";
}
public String  _setactivesheetindex(b4j.docU.xlworkbookwriter __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "setactivesheetindex", true))
	 {return ((String) Debug.delegate(ba, "setactivesheetindex", new Object[] {_i}));}
int _ii = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=228130816;
 //BA.debugLineNum = 228130816;BA.debugLine="Public Sub setActiveSheetIndex (i As Int)";
RDebugUtils.currentLine=228130817;
 //BA.debugLineNum = 228130817;BA.debugLine="For ii = 0 To PoiWorkbook.NumberOfSheets - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .getNumberOfSheets()-1);
_ii = (int) (0) ;
for (;_ii <= limit1 ;_ii = _ii + step1 ) {
RDebugUtils.currentLine=228130818;
 //BA.debugLineNum = 228130818;BA.debugLine="Dim jo As JavaObject = PoiWorkbook.GetSheet(ii)";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .GetSheet(_ii).getObject()));
RDebugUtils.currentLine=228130819;
 //BA.debugLineNum = 228130819;BA.debugLine="jo.RunMethod(\"setSelected\", Array(False))";
_jo.RunMethod("setSelected",new Object[]{(Object)(__c.False)});
 }
};
RDebugUtils.currentLine=228130821;
 //BA.debugLineNum = 228130821;BA.debugLine="jWorkbook.RunMethod(\"setActiveSheet\", Array(i))";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setActiveSheet",new Object[]{(Object)(_i)});
RDebugUtils.currentLine=228130822;
 //BA.debugLineNum = 228130822;BA.debugLine="End Sub";
return "";
}
public String  _setforceformularecalculation(b4j.docU.xlworkbookwriter __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlworkbookwriter";
if (Debug.shouldDelegate(ba, "setforceformularecalculation", true))
	 {return ((String) Debug.delegate(ba, "setforceformularecalculation", new Object[] {_b}));}
RDebugUtils.currentLine=228655104;
 //BA.debugLineNum = 228655104;BA.debugLine="Public Sub setForceFormulaRecalculation (b As Bool";
RDebugUtils.currentLine=228655105;
 //BA.debugLineNum = 228655105;BA.debugLine="jWorkbook.RunMethod(\"setForceFormulaRecalculation";
__ref._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setForceFormulaRecalculation",new Object[]{(Object)(_b)});
RDebugUtils.currentLine=228655106;
 //BA.debugLineNum = 228655106;BA.debugLine="End Sub";
return "";
}
}