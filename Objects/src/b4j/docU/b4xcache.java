package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcache extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xcache", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xcache.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xcacheitem{
public boolean IsInitialized;
public Object Value;
public long LastAccessedTime;
public String Key;
public boolean Eternal;
public void Initialize() {
IsInitialized = true;
Value = new Object();
LastAccessedTime = 0L;
Key = "";
Eternal = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.docU.b4xorderedmap _data = null;
public int _mmaxsize = 0;
public float _removethreshold = 0f;
public int _eternalcounts = 0;
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
public String  _class_globals(b4j.docU.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
RDebugUtils.currentLine=136183808;
 //BA.debugLineNum = 136183808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=136183809;
 //BA.debugLineNum = 136183809;BA.debugLine="Type B4XCacheItem (Value As Object, LastAccessedT";
;
RDebugUtils.currentLine=136183810;
 //BA.debugLineNum = 136183810;BA.debugLine="Private Data As B4XOrderedMap";
_data = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=136183811;
 //BA.debugLineNum = 136183811;BA.debugLine="Private mMaxSize As Int = 100";
_mmaxsize = (int) (100);
RDebugUtils.currentLine=136183812;
 //BA.debugLineNum = 136183812;BA.debugLine="Private RemoveThreshold As Float = 0.3";
_removethreshold = (float) (0.3);
RDebugUtils.currentLine=136183813;
 //BA.debugLineNum = 136183813;BA.debugLine="Private EternalCounts As Int";
_eternalcounts = 0;
RDebugUtils.currentLine=136183814;
 //BA.debugLineNum = 136183814;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(b4j.docU.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "containskey", true))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=136773632;
 //BA.debugLineNum = 136773632;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=136773633;
 //BA.debugLineNum = 136773633;BA.debugLine="Return Data.ContainsKey(Key)";
if (true) return __ref._data /*b4j.docU.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_key));
RDebugUtils.currentLine=136773634;
 //BA.debugLineNum = 136773634;BA.debugLine="End Sub";
return false;
}
public b4j.docU.b4xcache._b4xcacheitem  _createb4xcacheitem(b4j.docU.b4xcache __ref,Object _value,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "createb4xcacheitem", true))
	 {return ((b4j.docU.b4xcache._b4xcacheitem) Debug.delegate(ba, "createb4xcacheitem", new Object[] {_value,_key}));}
b4j.docU.b4xcache._b4xcacheitem _t1 = null;
RDebugUtils.currentLine=137101312;
 //BA.debugLineNum = 137101312;BA.debugLine="Private Sub CreateB4XCacheItem (Value As Object, K";
RDebugUtils.currentLine=137101313;
 //BA.debugLineNum = 137101313;BA.debugLine="Dim t1 As B4XCacheItem";
_t1 = new b4j.docU.b4xcache._b4xcacheitem();
RDebugUtils.currentLine=137101314;
 //BA.debugLineNum = 137101314;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=137101315;
 //BA.debugLineNum = 137101315;BA.debugLine="t1.Value = Value";
_t1.Value /*Object*/  = _value;
RDebugUtils.currentLine=137101316;
 //BA.debugLineNum = 137101316;BA.debugLine="t1.LastAccessedTime = DateTime.Now";
_t1.LastAccessedTime /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=137101317;
 //BA.debugLineNum = 137101317;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=137101318;
 //BA.debugLineNum = 137101318;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=137101319;
 //BA.debugLineNum = 137101319;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4j.docU.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
b4j.docU.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=136445952;
 //BA.debugLineNum = 136445952;BA.debugLine="Public Sub Get (Key As String) As Object";
RDebugUtils.currentLine=136445953;
 //BA.debugLineNum = 136445953;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4j.docU.b4xcache._b4xcacheitem)(__ref._data /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=136445954;
 //BA.debugLineNum = 136445954;BA.debugLine="If ci <> Null Then";
if (_ci!= null) { 
RDebugUtils.currentLine=136445955;
 //BA.debugLineNum = 136445955;BA.debugLine="If ci.Eternal = False Then ci.LastAccessedTime =";
if (_ci.Eternal /*boolean*/ ==__c.False) { 
_ci.LastAccessedTime /*long*/  = __c.DateTime.getNow();};
RDebugUtils.currentLine=136445956;
 //BA.debugLineNum = 136445956;BA.debugLine="Return ci.Value";
if (true) return _ci.Value /*Object*/ ;
 };
RDebugUtils.currentLine=136445958;
 //BA.debugLineNum = 136445958;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=136445959;
 //BA.debugLineNum = 136445959;BA.debugLine="End Sub";
return null;
}
public int  _getmaxsize(b4j.docU.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "getmaxsize", true))
	 {return ((Integer) Debug.delegate(ba, "getmaxsize", null));}
RDebugUtils.currentLine=136380416;
 //BA.debugLineNum = 136380416;BA.debugLine="Public Sub getMaxSize As Int";
RDebugUtils.currentLine=136380417;
 //BA.debugLineNum = 136380417;BA.debugLine="Return mMaxSize";
if (true) return __ref._mmaxsize /*int*/ ;
RDebugUtils.currentLine=136380418;
 //BA.debugLineNum = 136380418;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.docU.b4xcache __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=136249344;
 //BA.debugLineNum = 136249344;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=136249345;
 //BA.debugLineNum = 136249345;BA.debugLine="Data.Initialize";
__ref._data /*b4j.docU.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=136249346;
 //BA.debugLineNum = 136249346;BA.debugLine="End Sub";
return "";
}
public boolean  _iseternal(b4j.docU.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "iseternal", true))
	 {return ((Boolean) Debug.delegate(ba, "iseternal", new Object[] {_key}));}
b4j.docU.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=136708096;
 //BA.debugLineNum = 136708096;BA.debugLine="Private Sub IsEternal(Key As String) As Boolean";
RDebugUtils.currentLine=136708097;
 //BA.debugLineNum = 136708097;BA.debugLine="Dim ci As B4XCacheItem = Data.Get(Key)";
_ci = (b4j.docU.b4xcache._b4xcacheitem)(__ref._data /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_key)));
RDebugUtils.currentLine=136708098;
 //BA.debugLineNum = 136708098;BA.debugLine="Return IIf(ci = Null, False, ci.Eternal)";
if (true) return BA.ObjectToBoolean(((_ci== null) ? ((Object)(__c.False)) : ((Object)(_ci.Eternal /*boolean*/ ))));
RDebugUtils.currentLine=136708099;
 //BA.debugLineNum = 136708099;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _keys(b4j.docU.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "keys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "keys", null));}
RDebugUtils.currentLine=137035776;
 //BA.debugLineNum = 137035776;BA.debugLine="Public Sub Keys As List";
RDebugUtils.currentLine=137035777;
 //BA.debugLineNum = 137035777;BA.debugLine="Return Data.Keys";
if (true) return __ref._data /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=137035778;
 //BA.debugLineNum = 137035778;BA.debugLine="End Sub";
return null;
}
public Object  _put(b4j.docU.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "put", true))
	 {return ((Object) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=136511488;
 //BA.debugLineNum = 136511488;BA.debugLine="Public Sub Put (Key As String, Value As Object) As";
RDebugUtils.currentLine=136511489;
 //BA.debugLineNum = 136511489;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=136511490;
 //BA.debugLineNum = 136511490;BA.debugLine="Data.Put(Key, CreateB4XCacheItem(Value, Key))";
__ref._data /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(__ref._createb4xcacheitem /*b4j.docU.b4xcache._b4xcacheitem*/ (null,_value,_key)));
RDebugUtils.currentLine=136511491;
 //BA.debugLineNum = 136511491;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=136511492;
 //BA.debugLineNum = 136511492;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=136511493;
 //BA.debugLineNum = 136511493;BA.debugLine="End Sub";
return null;
}
public String  _trimifoversize(b4j.docU.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "trimifoversize", true))
	 {return ((String) Debug.delegate(ba, "trimifoversize", null));}
anywheresoftware.b4a.objects.collections.List _values = null;
int _numberofitemstoremove = 0;
int _i = 0;
RDebugUtils.currentLine=136839168;
 //BA.debugLineNum = 136839168;BA.debugLine="Private Sub TrimIfOversize";
RDebugUtils.currentLine=136839169;
 //BA.debugLineNum = 136839169;BA.debugLine="If Data.Size - EternalCounts > mMaxSize Then";
if (__ref._data /*b4j.docU.b4xorderedmap*/ ._getsize /*int*/ (null)-__ref._eternalcounts /*int*/ >__ref._mmaxsize /*int*/ ) { 
RDebugUtils.currentLine=136839170;
 //BA.debugLineNum = 136839170;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4j.docU.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=136839171;
 //BA.debugLineNum = 136839171;BA.debugLine="values.SortType(\"LastAccessedTime\", True)";
_values.SortType("LastAccessedTime",__c.True);
RDebugUtils.currentLine=136839172;
 //BA.debugLineNum = 136839172;BA.debugLine="Dim NumberOfItemsToRemove As Int = Ceil(mMaxSize";
_numberofitemstoremove = (int) (__c.Ceil(__ref._mmaxsize /*int*/ *__ref._removethreshold /*float*/ ));
RDebugUtils.currentLine=136839173;
 //BA.debugLineNum = 136839173;BA.debugLine="For i = 0 To NumberOfItemsToRemove";
{
final int step5 = 1;
final int limit5 = _numberofitemstoremove;
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=136839174;
 //BA.debugLineNum = 136839174;BA.debugLine="Data.Remove(values.Get(i).As(B4XCacheItem).Key)";
__ref._data /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(((b4j.docU.b4xcache._b4xcacheitem)(_values.Get(_i))).Key /*String*/ ));
 }
};
 };
RDebugUtils.currentLine=136839177;
 //BA.debugLineNum = 136839177;BA.debugLine="End Sub";
return "";
}
public Object  _puteternal(b4j.docU.b4xcache __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "puteternal", true))
	 {return ((Object) Debug.delegate(ba, "puteternal", new Object[] {_key,_value}));}
b4j.docU.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=136577024;
 //BA.debugLineNum = 136577024;BA.debugLine="Public Sub PutEternal (Key As String, Value As Obj";
RDebugUtils.currentLine=136577025;
 //BA.debugLineNum = 136577025;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=136577026;
 //BA.debugLineNum = 136577026;BA.debugLine="Dim ci As B4XCacheItem = CreateB4XCacheItem(Value";
_ci = __ref._createb4xcacheitem /*b4j.docU.b4xcache._b4xcacheitem*/ (null,_value,_key);
RDebugUtils.currentLine=136577027;
 //BA.debugLineNum = 136577027;BA.debugLine="ci.Eternal = True";
_ci.Eternal /*boolean*/  = __c.True;
RDebugUtils.currentLine=136577028;
 //BA.debugLineNum = 136577028;BA.debugLine="ci.LastAccessedTime = 9223372036854775807";
_ci.LastAccessedTime /*long*/  = (long) (9223372036854775807L);
RDebugUtils.currentLine=136577029;
 //BA.debugLineNum = 136577029;BA.debugLine="EternalCounts = EternalCounts + 1";
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ +1);
RDebugUtils.currentLine=136577030;
 //BA.debugLineNum = 136577030;BA.debugLine="Data.Put(Key, ci)";
__ref._data /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_key),(Object)(_ci));
RDebugUtils.currentLine=136577031;
 //BA.debugLineNum = 136577031;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=136577032;
 //BA.debugLineNum = 136577032;BA.debugLine="End Sub";
return null;
}
public String  _remove(b4j.docU.b4xcache __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=136642560;
 //BA.debugLineNum = 136642560;BA.debugLine="Public Sub Remove (Key As String)";
RDebugUtils.currentLine=136642561;
 //BA.debugLineNum = 136642561;BA.debugLine="If IsEternal(Key) Then EternalCounts = EternalCou";
if (__ref._iseternal /*boolean*/ (null,_key)) { 
__ref._eternalcounts /*int*/  = (int) (__ref._eternalcounts /*int*/ -1);};
RDebugUtils.currentLine=136642562;
 //BA.debugLineNum = 136642562;BA.debugLine="Data.Remove(Key)";
__ref._data /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_key));
RDebugUtils.currentLine=136642563;
 //BA.debugLineNum = 136642563;BA.debugLine="End Sub";
return "";
}
public String  _removeolditems(b4j.docU.b4xcache __ref,long _agems) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "removeolditems", true))
	 {return ((String) Debug.delegate(ba, "removeolditems", new Object[] {_agems}));}
anywheresoftware.b4a.objects.collections.List _values = null;
long _level = 0L;
b4j.docU.b4xcache._b4xcacheitem _ci = null;
RDebugUtils.currentLine=136904704;
 //BA.debugLineNum = 136904704;BA.debugLine="Public Sub RemoveOldItems (AgeMs As Long)";
RDebugUtils.currentLine=136904705;
 //BA.debugLineNum = 136904705;BA.debugLine="Dim values As List = Data.Values";
_values = new anywheresoftware.b4a.objects.collections.List();
_values = __ref._data /*b4j.docU.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=136904706;
 //BA.debugLineNum = 136904706;BA.debugLine="Dim level As Long = DateTime.Now - AgeMs";
_level = (long) (__c.DateTime.getNow()-_agems);
RDebugUtils.currentLine=136904707;
 //BA.debugLineNum = 136904707;BA.debugLine="For Each ci As B4XCacheItem In values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _values;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_ci = (b4j.docU.b4xcache._b4xcacheitem)(group3.Get(index3));
RDebugUtils.currentLine=136904708;
 //BA.debugLineNum = 136904708;BA.debugLine="If ci.LastAccessedTime <= level Then";
if (_ci.LastAccessedTime /*long*/ <=_level) { 
RDebugUtils.currentLine=136904709;
 //BA.debugLineNum = 136904709;BA.debugLine="Data.Remove(ci.Key)";
__ref._data /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_ci.Key /*String*/ ));
 };
 }
};
RDebugUtils.currentLine=136904712;
 //BA.debugLineNum = 136904712;BA.debugLine="End Sub";
return "";
}
public String  _setmaxsize(b4j.docU.b4xcache __ref,int _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "setmaxsize", true))
	 {return ((String) Debug.delegate(ba, "setmaxsize", new Object[] {_s}));}
RDebugUtils.currentLine=136314880;
 //BA.debugLineNum = 136314880;BA.debugLine="Public Sub setMaxSize(s As Int)";
RDebugUtils.currentLine=136314881;
 //BA.debugLineNum = 136314881;BA.debugLine="mMaxSize = s";
__ref._mmaxsize /*int*/  = _s;
RDebugUtils.currentLine=136314882;
 //BA.debugLineNum = 136314882;BA.debugLine="TrimIfOversize";
__ref._trimifoversize /*String*/ (null);
RDebugUtils.currentLine=136314883;
 //BA.debugLineNum = 136314883;BA.debugLine="End Sub";
return "";
}
public int  _size(b4j.docU.b4xcache __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcache";
if (Debug.shouldDelegate(ba, "size", true))
	 {return ((Integer) Debug.delegate(ba, "size", null));}
RDebugUtils.currentLine=136970240;
 //BA.debugLineNum = 136970240;BA.debugLine="Public Sub Size As Int";
RDebugUtils.currentLine=136970241;
 //BA.debugLineNum = 136970241;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*b4j.docU.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=136970242;
 //BA.debugLineNum = 136970242;BA.debugLine="End Sub";
return 0;
}
}