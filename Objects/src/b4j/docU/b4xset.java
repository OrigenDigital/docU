package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xset.class).invoke(this, new Object[] {null});
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
public b4j.docU.b4xorderedmap _map = null;
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
public String  _initialize(b4j.docU.b4xset __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=138870784;
 //BA.debugLineNum = 138870784;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=138870785;
 //BA.debugLineNum = 138870785;BA.debugLine="map.Initialize";
__ref._map /*b4j.docU.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=138870786;
 //BA.debugLineNum = 138870786;BA.debugLine="End Sub";
return "";
}
public String  _add(b4j.docU.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_value}));}
RDebugUtils.currentLine=138936320;
 //BA.debugLineNum = 138936320;BA.debugLine="Public Sub Add(Value As Object)";
RDebugUtils.currentLine=138936321;
 //BA.debugLineNum = 138936321;BA.debugLine="map.Put(Value, \"\")";
__ref._map /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,_value,(Object)(""));
RDebugUtils.currentLine=138936322;
 //BA.debugLineNum = 138936322;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _aslist(b4j.docU.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "aslist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "aslist", null));}
RDebugUtils.currentLine=139264000;
 //BA.debugLineNum = 139264000;BA.debugLine="Public Sub AsList As List";
RDebugUtils.currentLine=139264001;
 //BA.debugLineNum = 139264001;BA.debugLine="Return map.Keys";
if (true) return __ref._map /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=139264002;
 //BA.debugLineNum = 139264002;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
RDebugUtils.currentLine=138805248;
 //BA.debugLineNum = 138805248;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=138805249;
 //BA.debugLineNum = 138805249;BA.debugLine="Private map As B4XOrderedMap";
_map = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=138805250;
 //BA.debugLineNum = 138805250;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.docU.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=139198464;
 //BA.debugLineNum = 139198464;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=139198465;
 //BA.debugLineNum = 139198465;BA.debugLine="map.Clear";
__ref._map /*b4j.docU.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=139198466;
 //BA.debugLineNum = 139198466;BA.debugLine="End Sub";
return "";
}
public boolean  _contains(b4j.docU.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "contains", true))
	 {return ((Boolean) Debug.delegate(ba, "contains", new Object[] {_value}));}
RDebugUtils.currentLine=139067392;
 //BA.debugLineNum = 139067392;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
RDebugUtils.currentLine=139067393;
 //BA.debugLineNum = 139067393;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return __ref._map /*b4j.docU.b4xorderedmap*/ ._containskey /*boolean*/ (null,_value);
RDebugUtils.currentLine=139067394;
 //BA.debugLineNum = 139067394;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4j.docU.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=139132928;
 //BA.debugLineNum = 139132928;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=139132929;
 //BA.debugLineNum = 139132929;BA.debugLine="Return map.Size";
if (true) return __ref._map /*b4j.docU.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=139132930;
 //BA.debugLineNum = 139132930;BA.debugLine="End Sub";
return 0;
}
public String  _remove(b4j.docU.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_value}));}
RDebugUtils.currentLine=139001856;
 //BA.debugLineNum = 139001856;BA.debugLine="Public Sub Remove(Value As Object)";
RDebugUtils.currentLine=139001857;
 //BA.debugLineNum = 139001857;BA.debugLine="map.Remove(Value)";
__ref._map /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,_value);
RDebugUtils.currentLine=139001858;
 //BA.debugLineNum = 139001858;BA.debugLine="End Sub";
return "";
}
}