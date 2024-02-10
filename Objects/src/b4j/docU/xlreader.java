package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlreader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlreader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlreader.class).invoke(this, new Object[] {null});
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
public Object[] _emptyrow = null;
public String _password = "";
public b4j.docU.xlutils _xl = null;
public Object _missingcellvalue = null;
public boolean _fetchformulasinsteadofcachedvalues = false;
public boolean _fetchhyperlinks = false;
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
public b4j.docU.xlreaderresult  _readsheetbyindex(b4j.docU.xlreader __ref,String _dir,String _filename,int _sheetindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readsheetbyindex", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "readsheetbyindex", new Object[] {_dir,_filename,_sheetindex}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.docU.xlreaderresult _res = null;
RDebugUtils.currentLine=218955776;
 //BA.debugLineNum = 218955776;BA.debugLine="Public Sub ReadSheetByIndex (Dir As String, FileNa";
RDebugUtils.currentLine=218955777;
 //BA.debugLineNum = 218955777;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = __ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename);
RDebugUtils.currentLine=218955778;
 //BA.debugLineNum = 218955778;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
_res = __ref._sheettoresult /*b4j.docU.xlreaderresult*/ (null,_wb.GetSheet(_sheetindex));
RDebugUtils.currentLine=218955779;
 //BA.debugLineNum = 218955779;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=218955780;
 //BA.debugLineNum = 218955780;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=218955781;
 //BA.debugLineNum = 218955781;BA.debugLine="End Sub";
return null;
}
public Object  _celltoobject(b4j.docU.xlreader __ref,anywheresoftware.b4j.objects.PoiCellWrapper _cell,b4j.docU.xlreaderresult _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "celltoobject", true))
	 {return ((Object) Debug.delegate(ba, "celltoobject", new Object[] {_cell,_result}));}
anywheresoftware.b4j.object.JavaObject _jcell = null;
anywheresoftware.b4j.object.JavaObject _hyperlink = null;
b4j.docU.xlreaderresult._xlhyperlink _h = null;
anywheresoftware.b4j.object.JavaObject _celladdress = null;
RDebugUtils.currentLine=219414528;
 //BA.debugLineNum = 219414528;BA.debugLine="Private Sub CellToObject (cell As PoiCell, Result";
RDebugUtils.currentLine=219414529;
 //BA.debugLineNum = 219414529;BA.debugLine="If cell.IsInitialized = False Then Return Missing";
if (_cell.IsInitialized()==__c.False) { 
if (true) return __ref._missingcellvalue /*Object*/ ;};
RDebugUtils.currentLine=219414530;
 //BA.debugLineNum = 219414530;BA.debugLine="If FetchHyperlinks Then";
if (__ref._fetchhyperlinks /*boolean*/ ) { 
RDebugUtils.currentLine=219414531;
 //BA.debugLineNum = 219414531;BA.debugLine="Dim jcell As JavaObject = cell";
_jcell = new anywheresoftware.b4j.object.JavaObject();
_jcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cell.getObject()));
RDebugUtils.currentLine=219414532;
 //BA.debugLineNum = 219414532;BA.debugLine="Dim hyperlink As JavaObject = jcell.RunMethod(\"g";
_hyperlink = new anywheresoftware.b4j.object.JavaObject();
_hyperlink = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcell.RunMethod("getHyperlink",(Object[])(__c.Null))));
RDebugUtils.currentLine=219414533;
 //BA.debugLineNum = 219414533;BA.debugLine="If hyperlink.IsInitialized Then";
if (_hyperlink.IsInitialized()) { 
RDebugUtils.currentLine=219414534;
 //BA.debugLineNum = 219414534;BA.debugLine="Dim h As XLHyperlink";
_h = new b4j.docU.xlreaderresult._xlhyperlink();
RDebugUtils.currentLine=219414535;
 //BA.debugLineNum = 219414535;BA.debugLine="h.Initialize";
_h.Initialize();
RDebugUtils.currentLine=219414536;
 //BA.debugLineNum = 219414536;BA.debugLine="h.Address = ObjectToString(hyperlink.RunMethod(";
_h.Address /*String*/  = __ref._objecttostring /*String*/ (null,_hyperlink.RunMethod("getAddress",(Object[])(__c.Null)));
RDebugUtils.currentLine=219414537;
 //BA.debugLineNum = 219414537;BA.debugLine="h.Label = ObjectToString(hyperlink.RunMethod(\"g";
_h.Label /*String*/  = __ref._objecttostring /*String*/ (null,_hyperlink.RunMethod("getLabel",(Object[])(__c.Null)));
RDebugUtils.currentLine=219414538;
 //BA.debugLineNum = 219414538;BA.debugLine="h.LinkType = hyperlink.RunMethod(\"getType\", Nul";
_h.LinkType /*String*/  = BA.ObjectToString(_hyperlink.RunMethod("getType",(Object[])(__c.Null)));
RDebugUtils.currentLine=219414539;
 //BA.debugLineNum = 219414539;BA.debugLine="Dim CellAddress As JavaObject = jcell.RunMethod";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
_celladdress = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcell.RunMethod("getAddress",(Object[])(__c.Null))));
RDebugUtils.currentLine=219414540;
 //BA.debugLineNum = 219414540;BA.debugLine="Result.Hyperlinks.Put(CellAddress.RunMethod(\"fo";
_result._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_celladdress.RunMethod("formatAsString",(Object[])(__c.Null)),(Object)(_h));
 };
 };
RDebugUtils.currentLine=219414543;
 //BA.debugLineNum = 219414543;BA.debugLine="If FetchFormulasInsteadOfCachedValues Then Return";
if (__ref._fetchformulasinsteadofcachedvalues /*boolean*/ ) { 
if (true) return _cell.getValue();}
else {
if (true) return _cell.getValueCached();};
RDebugUtils.currentLine=219414544;
 //BA.debugLineNum = 219414544;BA.debugLine="End Sub";
return null;
}
public String  _objecttostring(b4j.docU.xlreader __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "objecttostring", true))
	 {return ((String) Debug.delegate(ba, "objecttostring", new Object[] {_o}));}
RDebugUtils.currentLine=219480064;
 //BA.debugLineNum = 219480064;BA.debugLine="Private Sub ObjectToString(o As Object) As String";
RDebugUtils.currentLine=219480065;
 //BA.debugLineNum = 219480065;BA.debugLine="If o = Null Then Return \"\"";
if (_o== null) { 
if (true) return "";};
RDebugUtils.currentLine=219480066;
 //BA.debugLineNum = 219480066;BA.debugLine="Return o";
if (true) return BA.ObjectToString(_o);
RDebugUtils.currentLine=219480067;
 //BA.debugLineNum = 219480067;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.xlreader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
RDebugUtils.currentLine=218562560;
 //BA.debugLineNum = 218562560;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=218562561;
 //BA.debugLineNum = 218562561;BA.debugLine="Private EmptyRow() As Object";
_emptyrow = new Object[(int) (0)];
{
int d0 = _emptyrow.length;
for (int i0 = 0;i0 < d0;i0++) {
_emptyrow[i0] = new Object();
}
}
;
RDebugUtils.currentLine=218562562;
 //BA.debugLineNum = 218562562;BA.debugLine="Public Password As String";
_password = "";
RDebugUtils.currentLine=218562563;
 //BA.debugLineNum = 218562563;BA.debugLine="Private xl As XLUtils 'ignore";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=218562564;
 //BA.debugLineNum = 218562564;BA.debugLine="Private MissingCellValue As Object = \"\"";
_missingcellvalue = (Object)("");
RDebugUtils.currentLine=218562565;
 //BA.debugLineNum = 218562565;BA.debugLine="Public FetchFormulasInsteadOfCachedValues As Bool";
_fetchformulasinsteadofcachedvalues = false;
RDebugUtils.currentLine=218562566;
 //BA.debugLineNum = 218562566;BA.debugLine="Public FetchHyperlinks As Boolean";
_fetchhyperlinks = false;
RDebugUtils.currentLine=218562567;
 //BA.debugLineNum = 218562567;BA.debugLine="End Sub";
return "";
}
public void  _closewbaftersleep(b4j.docU.xlreader __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) throws Exception{
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "closewbaftersleep", true))
	 {Debug.delegate(ba, "closewbaftersleep", new Object[] {_wb}); return;}
ResumableSub_CloseWBAfterSleep rsub = new ResumableSub_CloseWBAfterSleep(this,__ref,_wb);
rsub.resume(ba, null);
}
public static class ResumableSub_CloseWBAfterSleep extends BA.ResumableSub {
public ResumableSub_CloseWBAfterSleep(b4j.docU.xlreader parent,b4j.docU.xlreader __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) {
this.parent = parent;
this.__ref = __ref;
this._wb = _wb;
this.__ref = parent;
}
b4j.docU.xlreader __ref;
b4j.docU.xlreader parent;
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlreader";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=218824705;
 //BA.debugLineNum = 218824705;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlreader", "closewbaftersleep"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=218824706;
 //BA.debugLineNum = 218824706;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=218824707;
 //BA.debugLineNum = 218824707;BA.debugLine="wb.Close";
_wb.Close();
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=218824709;
 //BA.debugLineNum = 218824709;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("9218824709",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=218824711;
 //BA.debugLineNum = 218824711;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public b4j.docU.xlreaderresult  _createxlreaderresult(b4j.docU.xlreader __ref,anywheresoftware.b4a.objects.collections.List _data,b4j.docU.xlutils._xladdress _topleft,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "createxlreaderresult", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "createxlreaderresult", new Object[] {_data,_topleft,_name}));}
b4j.docU.xlreaderresult _t1 = null;
RDebugUtils.currentLine=219545600;
 //BA.debugLineNum = 219545600;BA.debugLine="Private Sub CreateXLReaderResult (Data As List, To";
RDebugUtils.currentLine=219545601;
 //BA.debugLineNum = 219545601;BA.debugLine="Dim t1 As XLReaderResult";
_t1 = new b4j.docU.xlreaderresult();
RDebugUtils.currentLine=219545602;
 //BA.debugLineNum = 219545602;BA.debugLine="t1.Initialize(xl)";
_t1._initialize /*String*/ (null,ba,__ref._xl /*b4j.docU.xlutils*/ );
RDebugUtils.currentLine=219545603;
 //BA.debugLineNum = 219545603;BA.debugLine="t1.Data = Data";
_t1._data /*anywheresoftware.b4a.objects.collections.List*/  = _data;
RDebugUtils.currentLine=219545604;
 //BA.debugLineNum = 219545604;BA.debugLine="t1.TopLeft = TopLeft";
_t1._topleft /*b4j.docU.xlutils._xladdress*/  = _topleft;
RDebugUtils.currentLine=219545605;
 //BA.debugLineNum = 219545605;BA.debugLine="t1.Name = Name";
_t1._name /*String*/  = _name;
RDebugUtils.currentLine=219545606;
 //BA.debugLineNum = 219545606;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=219545607;
 //BA.debugLineNum = 219545607;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.xlreader __ref,anywheresoftware.b4a.BA _ba,b4j.docU.xlutils _vxl) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vxl}));}
RDebugUtils.currentLine=218628096;
 //BA.debugLineNum = 218628096;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
RDebugUtils.currentLine=218628097;
 //BA.debugLineNum = 218628097;BA.debugLine="xl = vXL";
__ref._xl /*b4j.docU.xlutils*/  = _vxl;
RDebugUtils.currentLine=218628098;
 //BA.debugLineNum = 218628098;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PoiWorkbookWrapper  _openworkbook(b4j.docU.xlreader __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "openworkbook", true))
	 {return ((anywheresoftware.b4j.objects.PoiWorkbookWrapper) Debug.delegate(ba, "openworkbook", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
RDebugUtils.currentLine=218759168;
 //BA.debugLineNum = 218759168;BA.debugLine="Private Sub OpenWorkbook (Dir As String, FileName";
RDebugUtils.currentLine=218759169;
 //BA.debugLineNum = 218759169;BA.debugLine="If Dir = \"\" Then";
if ((_dir).equals("")) { 
RDebugUtils.currentLine=218759170;
 //BA.debugLineNum = 218759170;BA.debugLine="Dir = FileName";
_dir = _filename;
RDebugUtils.currentLine=218759171;
 //BA.debugLineNum = 218759171;BA.debugLine="FileName = \"\"";
_filename = "";
 };
RDebugUtils.currentLine=218759173;
 //BA.debugLineNum = 218759173;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=218759174;
 //BA.debugLineNum = 218759174;BA.debugLine="wb.InitializeExisting(Dir, FileName, Password, Tr";
_wb.InitializeExisting(_dir,_filename,__ref._password /*String*/ ,__c.True);
RDebugUtils.currentLine=218759175;
 //BA.debugLineNum = 218759175;BA.debugLine="CloseWBAfterSleep(wb)";
__ref._closewbaftersleep /*void*/ (null,_wb);
RDebugUtils.currentLine=218759176;
 //BA.debugLineNum = 218759176;BA.debugLine="Return wb";
if (true) return _wb;
RDebugUtils.currentLine=218759177;
 //BA.debugLineNum = 218759177;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlreaderresult  _rangetoresult(b4j.docU.xlreader __ref,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "rangetoresult", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "rangetoresult", new Object[] {_range}));}
int _left = 0;
int _right = 0;
int _top = 0;
int _bottom = 0;
anywheresoftware.b4a.objects.collections.List _rows = null;
b4j.docU.xlreaderresult _res = null;
int _r = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.PoiRowWrapper _prow = null;
int _c = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
RDebugUtils.currentLine=219217920;
 //BA.debugLineNum = 219217920;BA.debugLine="Public Sub RangeToResult (range As XLRange) As XLR";
RDebugUtils.currentLine=219217921;
 //BA.debugLineNum = 219217921;BA.debugLine="Dim left = Min(range.FirstAddress.Col0Based, rang";
_left = (int) (__c.Min(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ,_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ));
_right = (int) (__c.Max(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ,_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ));
_top = (int) (__c.Min(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ,_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ));
_bottom = (int) (__c.Max(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ,_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ));
RDebugUtils.currentLine=219217923;
 //BA.debugLineNum = 219217923;BA.debugLine="left = Max(0, left)";
_left = (int) (__c.Max(0,_left));
RDebugUtils.currentLine=219217924;
 //BA.debugLineNum = 219217924;BA.debugLine="bottom = Max(0, Min(range.sheet.LastRowNumber, bo";
_bottom = (int) (__c.Max(0,__c.Min(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getLastRowNumber(),_bottom)));
RDebugUtils.currentLine=219217925;
 //BA.debugLineNum = 219217925;BA.debugLine="right = Max(right, left)";
_right = (int) (__c.Max(_right,_left));
RDebugUtils.currentLine=219217926;
 //BA.debugLineNum = 219217926;BA.debugLine="top = Max(0, Min(top, bottom))";
_top = (int) (__c.Max(0,__c.Min(_top,_bottom)));
RDebugUtils.currentLine=219217927;
 //BA.debugLineNum = 219217927;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=219217928;
 //BA.debugLineNum = 219217928;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=219217929;
 //BA.debugLineNum = 219217929;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
_res = __ref._createxlreaderresult /*b4j.docU.xlreaderresult*/ (null,_rows,__ref._xl /*b4j.docU.xlutils*/ ._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_left,_top),_range.Name /*String*/ );
RDebugUtils.currentLine=219217930;
 //BA.debugLineNum = 219217930;BA.debugLine="For r = top To bottom";
{
final int step9 = 1;
final int limit9 = _bottom;
_r = _top ;
for (;_r <= limit9 ;_r = _r + step9 ) {
RDebugUtils.currentLine=219217931;
 //BA.debugLineNum = 219217931;BA.debugLine="Dim row(right - left + 1) As Object";
_row = new Object[(int) (_right-_left+1)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=219217932;
 //BA.debugLineNum = 219217932;BA.debugLine="Dim prow As PoiRow = range.sheet.GetRow(r)";
_prow = new anywheresoftware.b4j.objects.PoiRowWrapper();
_prow = _range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .GetRow(_r);
RDebugUtils.currentLine=219217933;
 //BA.debugLineNum = 219217933;BA.debugLine="If prow.IsInitialized = False Then";
if (_prow.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=219217934;
 //BA.debugLineNum = 219217934;BA.debugLine="For c = left To right";
{
final int step13 = 1;
final int limit13 = _right;
_c = _left ;
for (;_c <= limit13 ;_c = _c + step13 ) {
RDebugUtils.currentLine=219217935;
 //BA.debugLineNum = 219217935;BA.debugLine="row(c - left) = MissingCellValue";
_row[(int) (_c-_left)] = __ref._missingcellvalue /*Object*/ ;
 }
};
 }else {
RDebugUtils.currentLine=219217938;
 //BA.debugLineNum = 219217938;BA.debugLine="For c = left To right";
{
final int step17 = 1;
final int limit17 = _right;
_c = _left ;
for (;_c <= limit17 ;_c = _c + step17 ) {
RDebugUtils.currentLine=219217939;
 //BA.debugLineNum = 219217939;BA.debugLine="Dim cell As PoiCell = prow.GetCell(c)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _prow.GetCell(_c);
RDebugUtils.currentLine=219217940;
 //BA.debugLineNum = 219217940;BA.debugLine="row(c - left) = CellToObject(cell, res)";
_row[(int) (_c-_left)] = __ref._celltoobject /*Object*/ (null,_cell,_res);
 }
};
 };
RDebugUtils.currentLine=219217943;
 //BA.debugLineNum = 219217943;BA.debugLine="rows.Add(row)";
_rows.Add((Object)(_row));
 }
};
RDebugUtils.currentLine=219217945;
 //BA.debugLineNum = 219217945;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
if (true) return __ref._removeemptyrowsfromendandsetbottomright /*b4j.docU.xlreaderresult*/ (null,_res);
RDebugUtils.currentLine=219217946;
 //BA.debugLineNum = 219217946;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlreaderresult  _removeemptyrowsfromendandsetbottomright(b4j.docU.xlreader __ref,b4j.docU.xlreaderresult _res) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "removeemptyrowsfromendandsetbottomright", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "removeemptyrowsfromendandsetbottomright", new Object[] {_res}));}
Object[] _lastrow = null;
RDebugUtils.currentLine=219348992;
 //BA.debugLineNum = 219348992;BA.debugLine="Private Sub RemoveEmptyRowsFromEndAndSetBottomRigh";
RDebugUtils.currentLine=219348993;
 //BA.debugLineNum = 219348993;BA.debugLine="Do While res.Data.Size > 0";
while (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
RDebugUtils.currentLine=219348994;
 //BA.debugLineNum = 219348994;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
_lastrow = (Object[])(_res._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=219348995;
 //BA.debugLineNum = 219348995;BA.debugLine="If lastrow.Length = 0 Then";
if (_lastrow.length==0) { 
RDebugUtils.currentLine=219348996;
 //BA.debugLineNum = 219348996;BA.debugLine="res.Data.RemoveAt(res.Data.Size - 1)";
_res._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=219348998;
 //BA.debugLineNum = 219348998;BA.debugLine="Exit";
if (true) break;
 };
 }
;
RDebugUtils.currentLine=219349001;
 //BA.debugLineNum = 219349001;BA.debugLine="If res.Data.Size > 0 Then";
if (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=219349002;
 //BA.debugLineNum = 219349002;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
_lastrow = (Object[])(_res._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=219349003;
 //BA.debugLineNum = 219349003;BA.debugLine="res.BottomRight = xl.AddressZero(res.TopLeft.Col";
_res._bottomright /*b4j.docU.xlutils._xladdress*/  = __ref._xl /*b4j.docU.xlutils*/ ._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (_res._topleft /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ +_lastrow.length-1),(int) (_res._topleft /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ +_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=219349005;
 //BA.debugLineNum = 219349005;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=219349006;
 //BA.debugLineNum = 219349006;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readall(b4j.docU.xlreader __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readall", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readall", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=218693632;
 //BA.debugLineNum = 218693632;BA.debugLine="Public Sub ReadAll (Dir As String, FileName As Str";
RDebugUtils.currentLine=218693633;
 //BA.debugLineNum = 218693633;BA.debugLine="Return ReadWorkbook(OpenWorkbook(Dir, FileName))";
if (true) return __ref._readworkbook /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename));
RDebugUtils.currentLine=218693634;
 //BA.debugLineNum = 218693634;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readworkbook(b4j.docU.xlreader __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readworkbook", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readworkbook", new Object[] {_wb}));}
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
RDebugUtils.currentLine=218890240;
 //BA.debugLineNum = 218890240;BA.debugLine="Private Sub ReadWorkbook (wb As PoiWorkbook) As Li";
RDebugUtils.currentLine=218890241;
 //BA.debugLineNum = 218890241;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=218890242;
 //BA.debugLineNum = 218890242;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=218890243;
 //BA.debugLineNum = 218890243;BA.debugLine="For i = 0 To wb.NumberOfSheets - 1";
{
final int step3 = 1;
final int limit3 = (int) (_wb.getNumberOfSheets()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=218890244;
 //BA.debugLineNum = 218890244;BA.debugLine="Dim sheet As PoiSheet = wb.GetSheet(i)";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = _wb.GetSheet(_i);
RDebugUtils.currentLine=218890245;
 //BA.debugLineNum = 218890245;BA.debugLine="res.add(SheetToResult(sheet))";
_res.Add((Object)(__ref._sheettoresult /*b4j.docU.xlreaderresult*/ (null,_sheet)));
 }
};
RDebugUtils.currentLine=218890247;
 //BA.debugLineNum = 218890247;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=218890248;
 //BA.debugLineNum = 218890248;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=218890249;
 //BA.debugLineNum = 218890249;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlreaderresult  _readrange(b4j.docU.xlreader __ref,String _dir,String _filename,String _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readrange", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "readrange", new Object[] {_dir,_filename,_range}));}
anywheresoftware.b4a.objects.collections.List _om = null;
RDebugUtils.currentLine=219086848;
 //BA.debugLineNum = 219086848;BA.debugLine="Public Sub ReadRange (Dir As String, FileName As S";
RDebugUtils.currentLine=219086849;
 //BA.debugLineNum = 219086849;BA.debugLine="Dim om As List = ReadRanges(Dir, FileName, Array(";
_om = new anywheresoftware.b4a.objects.collections.List();
_om = __ref._readranges /*anywheresoftware.b4a.objects.collections.List*/ (null,_dir,_filename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_range)}));
RDebugUtils.currentLine=219086850;
 //BA.debugLineNum = 219086850;BA.debugLine="Return om.Get(0)";
if (true) return (b4j.docU.xlreaderresult)(_om.Get((int) (0)));
RDebugUtils.currentLine=219086851;
 //BA.debugLineNum = 219086851;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readranges(b4j.docU.xlreader __ref,String _dir,String _filename,anywheresoftware.b4a.objects.collections.List _ranges) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readranges", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "readranges", new Object[] {_dir,_filename,_ranges}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
anywheresoftware.b4a.objects.collections.List _result = null;
String _range = "";
RDebugUtils.currentLine=219152384;
 //BA.debugLineNum = 219152384;BA.debugLine="Public Sub ReadRanges(Dir As String, FileName As S";
RDebugUtils.currentLine=219152385;
 //BA.debugLineNum = 219152385;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = __ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename);
RDebugUtils.currentLine=219152386;
 //BA.debugLineNum = 219152386;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=219152387;
 //BA.debugLineNum = 219152387;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=219152388;
 //BA.debugLineNum = 219152388;BA.debugLine="For Each Range As String In Ranges";
{
final anywheresoftware.b4a.BA.IterableList group4 = _ranges;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_range = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=219152389;
 //BA.debugLineNum = 219152389;BA.debugLine="result.Add(RangeToResult(xl.RangeStringOrNameToR";
_result.Add((Object)(__ref._rangetoresult /*b4j.docU.xlreaderresult*/ (null,__ref._xl /*b4j.docU.xlutils*/ ._rangestringornametorange /*b4j.docU.xlutils._xlrange*/ (null,_wb,_range))));
 }
};
RDebugUtils.currentLine=219152391;
 //BA.debugLineNum = 219152391;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=219152392;
 //BA.debugLineNum = 219152392;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=219152393;
 //BA.debugLineNum = 219152393;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlreaderresult  _sheettoresult(b4j.docU.xlreader __ref,anywheresoftware.b4j.objects.PoiSheetWrapper _sheet) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "sheettoresult", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "sheettoresult", new Object[] {_sheet}));}
anywheresoftware.b4a.objects.collections.List _rows = null;
b4j.docU.xlreaderresult _res = null;
int _lastrowindex = 0;
int _r = 0;
anywheresoftware.b4j.objects.PoiRowWrapper _prow = null;
anywheresoftware.b4a.objects.collections.List _cells = null;
anywheresoftware.b4j.objects.PoiCellWrapper _lastcell = null;
Object[] _row = null;
int _currentcellindex = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _currentcell = null;
int _c = 0;
RDebugUtils.currentLine=219283456;
 //BA.debugLineNum = 219283456;BA.debugLine="Public Sub SheetToResult (sheet As PoiSheet) As XL";
RDebugUtils.currentLine=219283457;
 //BA.debugLineNum = 219283457;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=219283458;
 //BA.debugLineNum = 219283458;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=219283459;
 //BA.debugLineNum = 219283459;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
_res = __ref._createxlreaderresult /*b4j.docU.xlreaderresult*/ (null,_rows,__ref._xl /*b4j.docU.xlutils*/ ._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (0),(int) (0)),_sheet.getName());
RDebugUtils.currentLine=219283460;
 //BA.debugLineNum = 219283460;BA.debugLine="Dim LastRowIndex As Int = sheet.LastRowNumber";
_lastrowindex = _sheet.getLastRowNumber();
RDebugUtils.currentLine=219283461;
 //BA.debugLineNum = 219283461;BA.debugLine="For r = 0 To LastRowIndex";
{
final int step5 = 1;
final int limit5 = _lastrowindex;
_r = (int) (0) ;
for (;_r <= limit5 ;_r = _r + step5 ) {
RDebugUtils.currentLine=219283462;
 //BA.debugLineNum = 219283462;BA.debugLine="Dim prow As PoiRow = sheet.GetRow(r)";
_prow = new anywheresoftware.b4j.objects.PoiRowWrapper();
_prow = _sheet.GetRow(_r);
RDebugUtils.currentLine=219283463;
 //BA.debugLineNum = 219283463;BA.debugLine="If prow.IsInitialized = False Then";
if (_prow.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=219283464;
 //BA.debugLineNum = 219283464;BA.debugLine="rows.Add(EmptyRow)";
_rows.Add((Object)(__ref._emptyrow /*Object[]*/ ));
RDebugUtils.currentLine=219283465;
 //BA.debugLineNum = 219283465;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=219283467;
 //BA.debugLineNum = 219283467;BA.debugLine="Dim cells As List = prow.Cells";
_cells = new anywheresoftware.b4a.objects.collections.List();
_cells = _prow.getCells();
RDebugUtils.currentLine=219283468;
 //BA.debugLineNum = 219283468;BA.debugLine="If cells.Size = 0 Then";
if (_cells.getSize()==0) { 
RDebugUtils.currentLine=219283469;
 //BA.debugLineNum = 219283469;BA.debugLine="rows.Add(EmptyRow)";
_rows.Add((Object)(__ref._emptyrow /*Object[]*/ ));
RDebugUtils.currentLine=219283470;
 //BA.debugLineNum = 219283470;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=219283472;
 //BA.debugLineNum = 219283472;BA.debugLine="Dim LastCell As PoiCell = cells.Get(cells.Size -";
_lastcell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_lastcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get((int) (_cells.getSize()-1))));
RDebugUtils.currentLine=219283473;
 //BA.debugLineNum = 219283473;BA.debugLine="Dim row(LastCell.ColumnIndex + 1) As Object";
_row = new Object[(int) (_lastcell.getColumnIndex()+1)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=219283474;
 //BA.debugLineNum = 219283474;BA.debugLine="Dim CurrentCellIndex As Int = 0";
_currentcellindex = (int) (0);
RDebugUtils.currentLine=219283475;
 //BA.debugLineNum = 219283475;BA.debugLine="Dim CurrentCell As PoiCell = cells.Get(CurrentCe";
_currentcell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_currentcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get(_currentcellindex)));
RDebugUtils.currentLine=219283476;
 //BA.debugLineNum = 219283476;BA.debugLine="For c = 0 To row.Length - 1";
{
final int step20 = 1;
final int limit20 = (int) (_row.length-1);
_c = (int) (0) ;
for (;_c <= limit20 ;_c = _c + step20 ) {
RDebugUtils.currentLine=219283477;
 //BA.debugLineNum = 219283477;BA.debugLine="If c = CurrentCell.ColumnIndex Then";
if (_c==_currentcell.getColumnIndex()) { 
RDebugUtils.currentLine=219283478;
 //BA.debugLineNum = 219283478;BA.debugLine="row(c) = CellToObject(CurrentCell, res)";
_row[_c] = __ref._celltoobject /*Object*/ (null,_currentcell,_res);
RDebugUtils.currentLine=219283479;
 //BA.debugLineNum = 219283479;BA.debugLine="CurrentCellIndex = CurrentCellIndex + 1";
_currentcellindex = (int) (_currentcellindex+1);
RDebugUtils.currentLine=219283480;
 //BA.debugLineNum = 219283480;BA.debugLine="If CurrentCellIndex = cells.Size Then Exit";
if (_currentcellindex==_cells.getSize()) { 
if (true) break;};
RDebugUtils.currentLine=219283481;
 //BA.debugLineNum = 219283481;BA.debugLine="CurrentCell = cells.Get(CurrentCellIndex)";
_currentcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get(_currentcellindex)));
 }else {
RDebugUtils.currentLine=219283483;
 //BA.debugLineNum = 219283483;BA.debugLine="row(c) = MissingCellValue";
_row[_c] = __ref._missingcellvalue /*Object*/ ;
 };
 }
};
RDebugUtils.currentLine=219283486;
 //BA.debugLineNum = 219283486;BA.debugLine="rows.Add(row)";
_rows.Add((Object)(_row));
 }
};
RDebugUtils.currentLine=219283488;
 //BA.debugLineNum = 219283488;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
if (true) return __ref._removeemptyrowsfromendandsetbottomright /*b4j.docU.xlreaderresult*/ (null,_res);
RDebugUtils.currentLine=219283489;
 //BA.debugLineNum = 219283489;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlreaderresult  _readsheetbyname(b4j.docU.xlreader __ref,String _dir,String _filename,String _sheetname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlreader";
if (Debug.shouldDelegate(ba, "readsheetbyname", true))
	 {return ((b4j.docU.xlreaderresult) Debug.delegate(ba, "readsheetbyname", new Object[] {_dir,_filename,_sheetname}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.docU.xlreaderresult _res = null;
RDebugUtils.currentLine=219021312;
 //BA.debugLineNum = 219021312;BA.debugLine="Public Sub ReadSheetByName (Dir As String, FileNam";
RDebugUtils.currentLine=219021313;
 //BA.debugLineNum = 219021313;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = __ref._openworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ (null,_dir,_filename);
RDebugUtils.currentLine=219021314;
 //BA.debugLineNum = 219021314;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
_res = __ref._sheettoresult /*b4j.docU.xlreaderresult*/ (null,_wb.GetSheetByName(_sheetname));
RDebugUtils.currentLine=219021315;
 //BA.debugLineNum = 219021315;BA.debugLine="wb.Close";
_wb.Close();
RDebugUtils.currentLine=219021316;
 //BA.debugLineNum = 219021316;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=219021317;
 //BA.debugLineNum = 219021317;BA.debugLine="End Sub";
return null;
}
}