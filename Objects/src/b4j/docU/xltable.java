package b4j.docU;

import anywheresoftware.b4a.debug.*;
import org.apache.poi.xssf.usermodel.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xltable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xltable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xltable.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _jtable = null;
public b4j.docU.xlsheetwriter _msheet = null;
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
public String  _initialize(b4j.docU.xltable __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _xssftable,b4j.docU.xlsheetwriter _sheet) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_xssftable,_sheet}));}
RDebugUtils.currentLine=224919552;
 //BA.debugLineNum = 224919552;BA.debugLine="Public Sub Initialize (XSSFTable As JavaObject, Sh";
RDebugUtils.currentLine=224919553;
 //BA.debugLineNum = 224919553;BA.debugLine="jTable = XSSFTable";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/  = _xssftable;
RDebugUtils.currentLine=224919554;
 //BA.debugLineNum = 224919554;BA.debugLine="mSheet = Sheet";
__ref._msheet /*b4j.docU.xlsheetwriter*/  = _sheet;
RDebugUtils.currentLine=224919555;
 //BA.debugLineNum = 224919555;BA.debugLine="jMe = Me";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=224919556;
 //BA.debugLineNum = 224919556;BA.debugLine="End Sub";
return "";
}
public String  _addautofilter(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "addautofilter", true))
	 {return ((String) Debug.delegate(ba, "addautofilter", null));}
RDebugUtils.currentLine=225837056;
 //BA.debugLineNum = 225837056;BA.debugLine="Public Sub AddAutoFilter";
RDebugUtils.currentLine=225837057;
 //BA.debugLineNum = 225837057;BA.debugLine="jMe.RunMethod(\"addAutoFilter\", Array(jTable))";
__ref._jme /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addAutoFilter",new Object[]{(Object)(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
RDebugUtils.currentLine=225837058;
 //BA.debugLineNum = 225837058;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
RDebugUtils.currentLine=224854016;
 //BA.debugLineNum = 224854016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=224854017;
 //BA.debugLineNum = 224854017;BA.debugLine="Public jTable As JavaObject";
_jtable = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=224854018;
 //BA.debugLineNum = 224854018;BA.debugLine="Private mSheet As XLSheetWriter";
_msheet = new b4j.docU.xlsheetwriter();
RDebugUtils.currentLine=224854019;
 //BA.debugLineNum = 224854019;BA.debugLine="Private jMe As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=224854020;
 //BA.debugLineNum = 224854020;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlutils._xlrange  _getcellreferences(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getcellreferences", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "getcellreferences", null));}
anywheresoftware.b4j.object.JavaObject _area = null;
RDebugUtils.currentLine=225443840;
 //BA.debugLineNum = 225443840;BA.debugLine="Public Sub getCellReferences As XLRange";
RDebugUtils.currentLine=225443841;
 //BA.debugLineNum = 225443841;BA.debugLine="Dim area As JavaObject = jTable.RunMethod(\"getCel";
_area = new anywheresoftware.b4j.object.JavaObject();
_area = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getCellReferences",(Object[])(__c.Null))));
RDebugUtils.currentLine=225443842;
 //BA.debugLineNum = 225443842;BA.debugLine="Return mSheet.xl.AreaReferenceToXLRange(mSheet.Wo";
if (true) return __ref._msheet /*b4j.docU.xlsheetwriter*/ ._xl /*b4j.docU.xlutils*/ ._areareferencetoxlrange /*b4j.docU.xlutils._xlrange*/ (null,__ref._msheet /*b4j.docU.xlsheetwriter*/ ._workbook /*b4j.docU.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ ,_area);
RDebugUtils.currentLine=225443843;
 //BA.debugLineNum = 225443843;BA.debugLine="End Sub";
return null;
}
public String  _getdisplayname(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getdisplayname", true))
	 {return ((String) Debug.delegate(ba, "getdisplayname", null));}
RDebugUtils.currentLine=225116160;
 //BA.debugLineNum = 225116160;BA.debugLine="Public Sub getDisplayName As String";
RDebugUtils.currentLine=225116161;
 //BA.debugLineNum = 225116161;BA.debugLine="Return jTable.RunMethod(\"getDisplayName\", Null)";
if (true) return BA.ObjectToString(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDisplayName",(Object[])(__c.Null)));
RDebugUtils.currentLine=225116162;
 //BA.debugLineNum = 225116162;BA.debugLine="End Sub";
return "";
}
public String  _getname(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getname", true))
	 {return ((String) Debug.delegate(ba, "getname", null));}
RDebugUtils.currentLine=224985088;
 //BA.debugLineNum = 224985088;BA.debugLine="Public Sub getName As String";
RDebugUtils.currentLine=224985089;
 //BA.debugLineNum = 224985089;BA.debugLine="Return jTable.RunMethod(\"getName\", Null)";
if (true) return BA.ObjectToString(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getName",(Object[])(__c.Null)));
RDebugUtils.currentLine=224985090;
 //BA.debugLineNum = 224985090;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowcolumnstripes(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getshowcolumnstripes", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowcolumnstripes", null));}
RDebugUtils.currentLine=225574912;
 //BA.debugLineNum = 225574912;BA.debugLine="Public Sub getShowColumnStripes As Boolean";
RDebugUtils.currentLine=225574913;
 //BA.debugLineNum = 225574913;BA.debugLine="Return GetStyle.RunMethod(\"isShowColumnStripes\",";
if (true) return BA.ObjectToBoolean(__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("isShowColumnStripes",(Object[])(__c.Null)));
RDebugUtils.currentLine=225574914;
 //BA.debugLineNum = 225574914;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.object.JavaObject  _getstyle(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getstyle", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getstyle", null));}
RDebugUtils.currentLine=225378304;
 //BA.debugLineNum = 225378304;BA.debugLine="Private Sub GetStyle As JavaObject";
RDebugUtils.currentLine=225378305;
 //BA.debugLineNum = 225378305;BA.debugLine="Return jTable.RunMethodJO(\"getStyle\", Null)";
if (true) return __ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getStyle",(Object[])(__c.Null));
RDebugUtils.currentLine=225378306;
 //BA.debugLineNum = 225378306;BA.debugLine="End Sub";
return null;
}
public boolean  _getshowrowstripes(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getshowrowstripes", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowrowstripes", null));}
RDebugUtils.currentLine=225705984;
 //BA.debugLineNum = 225705984;BA.debugLine="Public Sub getShowRowStripes As Boolean";
RDebugUtils.currentLine=225705985;
 //BA.debugLineNum = 225705985;BA.debugLine="Return GetStyle.RunMethod(\"isShowRowStripes\", Nul";
if (true) return BA.ObjectToBoolean(__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("isShowRowStripes",(Object[])(__c.Null)));
RDebugUtils.currentLine=225705986;
 //BA.debugLineNum = 225705986;BA.debugLine="End Sub";
return false;
}
public String  _getstylename(b4j.docU.xltable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "getstylename", true))
	 {return ((String) Debug.delegate(ba, "getstylename", null));}
RDebugUtils.currentLine=225247232;
 //BA.debugLineNum = 225247232;BA.debugLine="Public Sub getStyleName As String";
RDebugUtils.currentLine=225247233;
 //BA.debugLineNum = 225247233;BA.debugLine="Return jTable.RunMethod(\"getStyleName\", Null)";
if (true) return BA.ObjectToString(__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getStyleName",(Object[])(__c.Null)));
RDebugUtils.currentLine=225247234;
 //BA.debugLineNum = 225247234;BA.debugLine="End Sub";
return "";
}
public String  _setcellreferences(b4j.docU.xltable __ref,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setcellreferences", true))
	 {return ((String) Debug.delegate(ba, "setcellreferences", new Object[] {_range}));}
Object _area = null;
RDebugUtils.currentLine=225509376;
 //BA.debugLineNum = 225509376;BA.debugLine="Public Sub setCellReferences (Range As XLRange)";
RDebugUtils.currentLine=225509377;
 //BA.debugLineNum = 225509377;BA.debugLine="Range.Sheet = mSheet.PoiSheet";
_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = __ref._msheet /*b4j.docU.xlsheetwriter*/ ._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ ;
RDebugUtils.currentLine=225509378;
 //BA.debugLineNum = 225509378;BA.debugLine="Dim area As Object = mSheet.xl.XLRangeToAreaRefer";
_area = (Object)(__ref._msheet /*b4j.docU.xlsheetwriter*/ ._xl /*b4j.docU.xlutils*/ ._xlrangetoareareference /*anywheresoftware.b4j.object.JavaObject*/ (null,__ref._msheet /*b4j.docU.xlsheetwriter*/ ._workbook /*b4j.docU.xlworkbookwriter*/ ,_range).getObject());
RDebugUtils.currentLine=225509379;
 //BA.debugLineNum = 225509379;BA.debugLine="jTable.RunMethod(\"setArea\", Array(area))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setArea",new Object[]{_area});
RDebugUtils.currentLine=225509380;
 //BA.debugLineNum = 225509380;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayname(b4j.docU.xltable __ref,String _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setdisplayname", true))
	 {return ((String) Debug.delegate(ba, "setdisplayname", new Object[] {_n}));}
RDebugUtils.currentLine=225181696;
 //BA.debugLineNum = 225181696;BA.debugLine="Public Sub setDisplayName(n As String)";
RDebugUtils.currentLine=225181697;
 //BA.debugLineNum = 225181697;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
if (__ref._msheet /*b4j.docU.xlsheetwriter*/ ._validatetablename /*boolean*/ (null,_n)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=225181698;
 //BA.debugLineNum = 225181698;BA.debugLine="jTable.RunMethod(\"setDisplayName\", Array(n))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayName",new Object[]{(Object)(_n)});
RDebugUtils.currentLine=225181699;
 //BA.debugLineNum = 225181699;BA.debugLine="End Sub";
return "";
}
public String  _setname(b4j.docU.xltable __ref,String _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((String) Debug.delegate(ba, "setname", new Object[] {_n}));}
RDebugUtils.currentLine=225050624;
 //BA.debugLineNum = 225050624;BA.debugLine="Public Sub setName(n As String)";
RDebugUtils.currentLine=225050625;
 //BA.debugLineNum = 225050625;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
if (__ref._msheet /*b4j.docU.xlsheetwriter*/ ._validatetablename /*boolean*/ (null,_n)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=225050626;
 //BA.debugLineNum = 225050626;BA.debugLine="jTable.RunMethod(\"setName\", Array(n))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setName",new Object[]{(Object)(_n)});
RDebugUtils.currentLine=225050627;
 //BA.debugLineNum = 225050627;BA.debugLine="End Sub";
return "";
}
public String  _setshowcolumnstripes(b4j.docU.xltable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setshowcolumnstripes", true))
	 {return ((String) Debug.delegate(ba, "setshowcolumnstripes", new Object[] {_b}));}
RDebugUtils.currentLine=225640448;
 //BA.debugLineNum = 225640448;BA.debugLine="Public Sub setShowColumnStripes (b As Boolean)";
RDebugUtils.currentLine=225640449;
 //BA.debugLineNum = 225640449;BA.debugLine="GetStyle.RunMethod(\"setShowColumnStripes\", Array(";
__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("setShowColumnStripes",new Object[]{(Object)(_b)});
RDebugUtils.currentLine=225640450;
 //BA.debugLineNum = 225640450;BA.debugLine="End Sub";
return "";
}
public String  _setshowrowstripes(b4j.docU.xltable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setshowrowstripes", true))
	 {return ((String) Debug.delegate(ba, "setshowrowstripes", new Object[] {_b}));}
RDebugUtils.currentLine=225771520;
 //BA.debugLineNum = 225771520;BA.debugLine="Public Sub setShowRowStripes (b As Boolean)";
RDebugUtils.currentLine=225771521;
 //BA.debugLineNum = 225771521;BA.debugLine="GetStyle.RunMethod(\"setShowRowStripes\", Array(b))";
__ref._getstyle /*anywheresoftware.b4j.object.JavaObject*/ (null).RunMethod("setShowRowStripes",new Object[]{(Object)(_b)});
RDebugUtils.currentLine=225771522;
 //BA.debugLineNum = 225771522;BA.debugLine="End Sub";
return "";
}
public String  _setstylename(b4j.docU.xltable __ref,String _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="xltable";
if (Debug.shouldDelegate(ba, "setstylename", true))
	 {return ((String) Debug.delegate(ba, "setstylename", new Object[] {_n}));}
RDebugUtils.currentLine=225312768;
 //BA.debugLineNum = 225312768;BA.debugLine="Public Sub setStyleName(n As String)";
RDebugUtils.currentLine=225312769;
 //BA.debugLineNum = 225312769;BA.debugLine="jTable.RunMethod(\"setStyleName\", Array(n))";
__ref._jtable /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStyleName",new Object[]{(Object)(_n)});
RDebugUtils.currentLine=225312770;
 //BA.debugLineNum = 225312770;BA.debugLine="End Sub";
return "";
}
public void addAutoFilter(XSSFTable table) {
	table.getCTTable().addNewAutoFilter().setRef(table.getArea().formatAsString());
}

public void setTotalsRowShown(XSSFTable table, boolean b) {
	table.getCTTable().setTotalsRowShown(b);
}
public void setTotalsRowCount(XSSFTable table, int b) {
	table.getCTTable().setTotalsRowCount(b);
}
}