package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcomparatorsort extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xcomparatorsort", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xcomparatorsort.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.docU.b4xcomparatorsort __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
RDebugUtils.currentLine=137560064;
 //BA.debugLineNum = 137560064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=137560065;
 //BA.debugLineNum = 137560065;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.b4xcomparatorsort __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=137625600;
 //BA.debugLineNum = 137625600;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=137625601;
 //BA.debugLineNum = 137625601;BA.debugLine="End Sub";
return "";
}
public int  _partition(b4j.docU.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,int _pivotindex,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "partition", true))
	 {return ((Integer) Debug.delegate(ba, "partition", new Object[] {_data,_startindex,_length,_pivotindex,_comparator}));}
Object _pivotvalue = null;
int _l = 0;
int _i = 0;
RDebugUtils.currentLine=137822208;
 //BA.debugLineNum = 137822208;BA.debugLine="Private Sub Partition(Data As List, StartIndex As";
RDebugUtils.currentLine=137822209;
 //BA.debugLineNum = 137822209;BA.debugLine="Dim PivotValue As Object = Data.Get(StartIndex +";
_pivotvalue = _data.Get((int) (_startindex+_pivotindex));
RDebugUtils.currentLine=137822210;
 //BA.debugLineNum = 137822210;BA.debugLine="Swap(Data, StartIndex, PivotIndex, Length - 1)";
__ref._swap /*String*/ (null,_data,_startindex,_pivotindex,(int) (_length-1));
RDebugUtils.currentLine=137822211;
 //BA.debugLineNum = 137822211;BA.debugLine="Dim L As Int = 0";
_l = (int) (0);
RDebugUtils.currentLine=137822212;
 //BA.debugLineNum = 137822212;BA.debugLine="For i = 0 To Length - 2";
{
final int step4 = 1;
final int limit4 = (int) (_length-2);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=137822213;
 //BA.debugLineNum = 137822213;BA.debugLine="If CallSub3(Comparator, \"Compare\", Data.Get(Star";
if (((int)(BA.ObjectToNumber(__c.CallSubDebug3(ba,_comparator,"Compare",_data.Get((int) (_startindex+_i)),_pivotvalue))))<0) { 
RDebugUtils.currentLine=137822214;
 //BA.debugLineNum = 137822214;BA.debugLine="L = L + 1";
_l = (int) (_l+1);
RDebugUtils.currentLine=137822215;
 //BA.debugLineNum = 137822215;BA.debugLine="Swap(Data, StartIndex, L - 1, i)";
__ref._swap /*String*/ (null,_data,_startindex,(int) (_l-1),_i);
 };
 }
};
RDebugUtils.currentLine=137822218;
 //BA.debugLineNum = 137822218;BA.debugLine="Swap(Data, StartIndex, Length - 1, L)";
__ref._swap /*String*/ (null,_data,_startindex,(int) (_length-1),_l);
RDebugUtils.currentLine=137822219;
 //BA.debugLineNum = 137822219;BA.debugLine="Return L";
if (true) return _l;
RDebugUtils.currentLine=137822220;
 //BA.debugLineNum = 137822220;BA.debugLine="End Sub";
return 0;
}
public String  _swap(b4j.docU.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _i1,int _i2) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "swap", true))
	 {return ((String) Debug.delegate(ba, "swap", new Object[] {_data,_startindex,_i1,_i2}));}
Object _o = null;
RDebugUtils.currentLine=137887744;
 //BA.debugLineNum = 137887744;BA.debugLine="Private Sub Swap (Data As List, StartIndex As Int,";
RDebugUtils.currentLine=137887745;
 //BA.debugLineNum = 137887745;BA.debugLine="Dim o As Object = Data.Get(StartIndex + i1)";
_o = _data.Get((int) (_startindex+_i1));
RDebugUtils.currentLine=137887746;
 //BA.debugLineNum = 137887746;BA.debugLine="Data.Set(StartIndex + i1, Data.Get(StartIndex + i";
_data.Set((int) (_startindex+_i1),_data.Get((int) (_startindex+_i2)));
RDebugUtils.currentLine=137887747;
 //BA.debugLineNum = 137887747;BA.debugLine="Data.Set(StartIndex + i2, o)";
_data.Set((int) (_startindex+_i2),_o);
RDebugUtils.currentLine=137887748;
 //BA.debugLineNum = 137887748;BA.debugLine="End Sub";
return "";
}
public String  _quicksort(b4j.docU.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,int _startindex,int _length,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "quicksort", true))
	 {return ((String) Debug.delegate(ba, "quicksort", new Object[] {_data,_startindex,_length,_comparator}));}
int _pivotindex = 0;
int _r = 0;
RDebugUtils.currentLine=137756672;
 //BA.debugLineNum = 137756672;BA.debugLine="Private Sub QuickSort (Data As List, StartIndex As";
RDebugUtils.currentLine=137756673;
 //BA.debugLineNum = 137756673;BA.debugLine="If Length > 1 Then";
if (_length>1) { 
RDebugUtils.currentLine=137756674;
 //BA.debugLineNum = 137756674;BA.debugLine="Dim PivotIndex As Int = Rnd(0, Length)";
_pivotindex = __c.Rnd((int) (0),_length);
RDebugUtils.currentLine=137756675;
 //BA.debugLineNum = 137756675;BA.debugLine="Dim r As Int = Partition(Data, StartIndex, Lengt";
_r = __ref._partition /*int*/ (null,_data,_startindex,_length,_pivotindex,_comparator);
RDebugUtils.currentLine=137756676;
 //BA.debugLineNum = 137756676;BA.debugLine="QuickSort(Data, StartIndex, r, Comparator)";
__ref._quicksort /*String*/ (null,_data,_startindex,_r,_comparator);
RDebugUtils.currentLine=137756677;
 //BA.debugLineNum = 137756677;BA.debugLine="QuickSort(Data, StartIndex + r + 1, Length - r -";
__ref._quicksort /*String*/ (null,_data,(int) (_startindex+_r+1),(int) (_length-_r-1),_comparator);
 };
RDebugUtils.currentLine=137756679;
 //BA.debugLineNum = 137756679;BA.debugLine="End Sub";
return "";
}
public String  _sort(b4j.docU.b4xcomparatorsort __ref,anywheresoftware.b4a.objects.collections.List _data,Object _comparator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomparatorsort";
if (Debug.shouldDelegate(ba, "sort", true))
	 {return ((String) Debug.delegate(ba, "sort", new Object[] {_data,_comparator}));}
RDebugUtils.currentLine=137691136;
 //BA.debugLineNum = 137691136;BA.debugLine="Public Sub Sort (Data As List, Comparator As Objec";
RDebugUtils.currentLine=137691138;
 //BA.debugLineNum = 137691138;BA.debugLine="QuickSort(Data, 0, Data.Size, Comparator)";
__ref._quicksort /*String*/ (null,_data,(int) (0),_data.getSize(),_comparator);
RDebugUtils.currentLine=137691142;
 //BA.debugLineNum = 137691142;BA.debugLine="End Sub";
return "";
}
}