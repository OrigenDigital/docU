package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class b4xcollections extends Object{
public static b4xcollections mostCurrent = new b4xcollections();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xcollections", null);
		ba.loadHtSubs(b4xcollections.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.b4xcollections", ba);
		}
	}
    public static Class<?> getObject() {
		return b4xcollections.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static b4j.docU.b4xorderedmap  _createorderedmap() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap", true))
	 {return ((b4j.docU.b4xorderedmap) Debug.delegate(ba, "createorderedmap", null));}
RDebugUtils.currentLine=137363456;
 //BA.debugLineNum = 137363456;BA.debugLine="Public Sub CreateOrderedMap As B4XOrderedMap";
RDebugUtils.currentLine=137363457;
 //BA.debugLineNum = 137363457;BA.debugLine="Return CreateOrderedMap2(Null, Null)";
if (true) return _createorderedmap2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=137363458;
 //BA.debugLineNum = 137363458;BA.debugLine="End Sub";
return null;
}
public static b4j.docU.b4xbitset  _createbitset(int _size) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createbitset", true))
	 {return ((b4j.docU.b4xbitset) Debug.delegate(ba, "createbitset", new Object[] {_size}));}
b4j.docU.b4xbitset _s = null;
RDebugUtils.currentLine=137494528;
 //BA.debugLineNum = 137494528;BA.debugLine="Public Sub CreateBitSet (Size As Int) As B4XBitSet";
RDebugUtils.currentLine=137494529;
 //BA.debugLineNum = 137494529;BA.debugLine="Dim s As B4XBitSet";
_s = new b4j.docU.b4xbitset();
RDebugUtils.currentLine=137494530;
 //BA.debugLineNum = 137494530;BA.debugLine="s.Initialize(Size)";
_s._initialize /*String*/ (null,ba,_size);
RDebugUtils.currentLine=137494531;
 //BA.debugLineNum = 137494531;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=137494532;
 //BA.debugLineNum = 137494532;BA.debugLine="End Sub";
return null;
}
public static b4j.docU.b4xorderedmap  _createorderedmap2(anywheresoftware.b4a.objects.collections.List _keys,anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createorderedmap2", true))
	 {return ((b4j.docU.b4xorderedmap) Debug.delegate(ba, "createorderedmap2", new Object[] {_keys,_values}));}
b4j.docU.b4xorderedmap _m = null;
int _i = 0;
RDebugUtils.currentLine=137428992;
 //BA.debugLineNum = 137428992;BA.debugLine="Public Sub CreateOrderedMap2 (Keys As List, Values";
RDebugUtils.currentLine=137428993;
 //BA.debugLineNum = 137428993;BA.debugLine="Dim m As B4XOrderedMap";
_m = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=137428994;
 //BA.debugLineNum = 137428994;BA.debugLine="m.Initialize";
_m._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=137428995;
 //BA.debugLineNum = 137428995;BA.debugLine="If Keys <> Null And Values <> Null And Keys.IsIni";
if (_keys!= null && _values!= null && _keys.IsInitialized() && _values.IsInitialized()) { 
RDebugUtils.currentLine=137428996;
 //BA.debugLineNum = 137428996;BA.debugLine="For i = 0 To Keys.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=137428997;
 //BA.debugLineNum = 137428997;BA.debugLine="m.Put(Keys.Get(i), Values.Get(i))";
_m._put /*String*/ (null,_keys.Get(_i),_values.Get(_i));
 }
};
 };
RDebugUtils.currentLine=137429000;
 //BA.debugLineNum = 137429000;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=137429001;
 //BA.debugLineNum = 137429001;BA.debugLine="End Sub";
return null;
}
public static b4j.docU.b4xset  _createset() throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset", true))
	 {return ((b4j.docU.b4xset) Debug.delegate(ba, "createset", null));}
RDebugUtils.currentLine=137232384;
 //BA.debugLineNum = 137232384;BA.debugLine="Public Sub CreateSet As B4XSet";
RDebugUtils.currentLine=137232385;
 //BA.debugLineNum = 137232385;BA.debugLine="Return CreateSet2(Null)";
if (true) return _createset2((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=137232386;
 //BA.debugLineNum = 137232386;BA.debugLine="End Sub";
return null;
}
public static b4j.docU.b4xset  _createset2(anywheresoftware.b4a.objects.collections.List _values) throws Exception{
RDebugUtils.currentModule="b4xcollections";
if (Debug.shouldDelegate(ba, "createset2", true))
	 {return ((b4j.docU.b4xset) Debug.delegate(ba, "createset2", new Object[] {_values}));}
b4j.docU.b4xset _s = null;
Object _v = null;
RDebugUtils.currentLine=137297920;
 //BA.debugLineNum = 137297920;BA.debugLine="Public Sub CreateSet2 (Values As List) As B4XSet";
RDebugUtils.currentLine=137297921;
 //BA.debugLineNum = 137297921;BA.debugLine="Dim s As B4XSet";
_s = new b4j.docU.b4xset();
RDebugUtils.currentLine=137297922;
 //BA.debugLineNum = 137297922;BA.debugLine="s.Initialize";
_s._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=137297923;
 //BA.debugLineNum = 137297923;BA.debugLine="If Values <> Null And Values.IsInitialized Then";
if (_values!= null && _values.IsInitialized()) { 
RDebugUtils.currentLine=137297924;
 //BA.debugLineNum = 137297924;BA.debugLine="For Each v As Object In Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _values;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = group4.Get(index4);
RDebugUtils.currentLine=137297925;
 //BA.debugLineNum = 137297925;BA.debugLine="s.Add(v)";
_s._add /*String*/ (null,_v);
 }
};
 };
RDebugUtils.currentLine=137297928;
 //BA.debugLineNum = 137297928;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=137297929;
 //BA.debugLineNum = 137297929;BA.debugLine="End Sub";
return null;
}
}