package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class map2xml extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.map2xml", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.map2xml.class).invoke(this, new Object[] {null});
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
public com.jamesmurty.utils.XMLBuilder _builder = null;
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
public String  _initialize(b4j.docU.map2xml __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=228786176;
 //BA.debugLineNum = 228786176;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=228786178;
 //BA.debugLineNum = 228786178;BA.debugLine="End Sub";
return "";
}
public String  _maptoxml(b4j.docU.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "maptoxml", true))
	 {return ((String) Debug.delegate(ba, "maptoxml", new Object[] {_m}));}
String _k = "";
anywheresoftware.b4a.objects.collections.Map _props = null;
RDebugUtils.currentLine=228851712;
 //BA.debugLineNum = 228851712;BA.debugLine="Public Sub MapToXml (m As Map) As String";
RDebugUtils.currentLine=228851713;
 //BA.debugLineNum = 228851713;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=228851714;
 //BA.debugLineNum = 228851714;BA.debugLine="builder = builder.create(k)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .create(_k);
RDebugUtils.currentLine=228851715;
 //BA.debugLineNum = 228851715;BA.debugLine="HandleElement(\"\", m.Get(k))";
__ref._handleelement /*String*/ (null,"",_m.Get((Object)(_k)));
RDebugUtils.currentLine=228851716;
 //BA.debugLineNum = 228851716;BA.debugLine="Exit";
if (true) break;
 }
};
RDebugUtils.currentLine=228851718;
 //BA.debugLineNum = 228851718;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
RDebugUtils.currentLine=228851720;
 //BA.debugLineNum = 228851720;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=228851721;
 //BA.debugLineNum = 228851721;BA.debugLine="props.Initialize";
_props.Initialize();
RDebugUtils.currentLine=228851722;
 //BA.debugLineNum = 228851722;BA.debugLine="props.Put(\"{http://xml.apache.org/xslt}indent-amo";
_props.Put((Object)("{http://xml.apache.org/xslt}indent-amount"),(Object)("4"));
RDebugUtils.currentLine=228851723;
 //BA.debugLineNum = 228851723;BA.debugLine="props.Put(\"indent\", \"yes\")";
_props.Put((Object)("indent"),(Object)("yes"));
RDebugUtils.currentLine=228851724;
 //BA.debugLineNum = 228851724;BA.debugLine="Return builder.asString2(props)";
if (true) return __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .asString2((java.util.Map)(_props.getObject()));
RDebugUtils.currentLine=228851728;
 //BA.debugLineNum = 228851728;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.map2xml __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
RDebugUtils.currentLine=228720640;
 //BA.debugLineNum = 228720640;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=228720641;
 //BA.debugLineNum = 228720641;BA.debugLine="Private builder As XMLBuilder";
_builder = new com.jamesmurty.utils.XMLBuilder();
RDebugUtils.currentLine=228720642;
 //BA.debugLineNum = 228720642;BA.debugLine="End Sub";
return "";
}
public String  _handleelement(b4j.docU.map2xml __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handleelement", true))
	 {return ((String) Debug.delegate(ba, "handleelement", new Object[] {_key,_value}));}
RDebugUtils.currentLine=228982784;
 //BA.debugLineNum = 228982784;BA.debugLine="Private Sub HandleElement (key As String, value As";
RDebugUtils.currentLine=228982785;
 //BA.debugLineNum = 228982785;BA.debugLine="If value Is Map Then";
if (_value instanceof java.util.Map) { 
RDebugUtils.currentLine=228982786;
 //BA.debugLineNum = 228982786;BA.debugLine="If key <> \"\" Then builder = builder.element(key)";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);};
RDebugUtils.currentLine=228982787;
 //BA.debugLineNum = 228982787;BA.debugLine="HandleMapElement(value)";
__ref._handlemapelement /*String*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value)));
RDebugUtils.currentLine=228982788;
 //BA.debugLineNum = 228982788;BA.debugLine="If key <> \"\" Then builder = builder.up";
if ((_key).equals("") == false) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();};
 }else 
{RDebugUtils.currentLine=228982789;
 //BA.debugLineNum = 228982789;BA.debugLine="Else if value Is List Then";
if (_value instanceof java.util.List) { 
RDebugUtils.currentLine=228982790;
 //BA.debugLineNum = 228982790;BA.debugLine="HandleListElement (key, value)";
__ref._handlelistelement /*String*/ (null,_key,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value)));
 }else {
RDebugUtils.currentLine=228982792;
 //BA.debugLineNum = 228982792;BA.debugLine="builder = builder.element(key)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .element(_key);
RDebugUtils.currentLine=228982793;
 //BA.debugLineNum = 228982793;BA.debugLine="builder = builder.text(value)";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_value));
RDebugUtils.currentLine=228982794;
 //BA.debugLineNum = 228982794;BA.debugLine="builder = builder.up";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/  = __ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .up();
 }}
;
RDebugUtils.currentLine=228982796;
 //BA.debugLineNum = 228982796;BA.debugLine="End Sub";
return "";
}
public String  _handlemapelement(b4j.docU.map2xml __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlemapelement", true))
	 {return ((String) Debug.delegate(ba, "handlemapelement", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _attributes = null;
String _attr = "";
String _k = "";
Object _value = null;
RDebugUtils.currentLine=228917248;
 //BA.debugLineNum = 228917248;BA.debugLine="Private Sub HandleMapElement (m As Map)";
RDebugUtils.currentLine=228917249;
 //BA.debugLineNum = 228917249;BA.debugLine="Dim attributes As Map = m.Get(\"Attributes\")";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_m.Get((Object)("Attributes"))));
RDebugUtils.currentLine=228917250;
 //BA.debugLineNum = 228917250;BA.debugLine="If attributes.IsInitialized Then";
if (_attributes.IsInitialized()) { 
RDebugUtils.currentLine=228917251;
 //BA.debugLineNum = 228917251;BA.debugLine="For Each attr As String In attributes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _attributes.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_attr = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=228917252;
 //BA.debugLineNum = 228917252;BA.debugLine="builder.attribute(attr, attributes.Get(attr))";
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .attribute(_attr,BA.ObjectToString(_attributes.Get((Object)(_attr))));
 }
};
RDebugUtils.currentLine=228917254;
 //BA.debugLineNum = 228917254;BA.debugLine="If m.ContainsKey(\"Text\") Then builder.text(m.Get";
if (_m.ContainsKey((Object)("Text"))) { 
__ref._builder /*com.jamesmurty.utils.XMLBuilder*/ .text(BA.ObjectToString(_m.Get((Object)("Text"))));};
RDebugUtils.currentLine=228917255;
 //BA.debugLineNum = 228917255;BA.debugLine="m.Remove(\"Attributes\")";
_m.Remove((Object)("Attributes"));
RDebugUtils.currentLine=228917256;
 //BA.debugLineNum = 228917256;BA.debugLine="m.Remove(\"Text\")";
_m.Remove((Object)("Text"));
 };
RDebugUtils.currentLine=228917258;
 //BA.debugLineNum = 228917258;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group10 = _m.Keys();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_k = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=228917259;
 //BA.debugLineNum = 228917259;BA.debugLine="Dim value As Object = m.Get(k)";
_value = _m.Get((Object)(_k));
RDebugUtils.currentLine=228917260;
 //BA.debugLineNum = 228917260;BA.debugLine="HandleElement(k, value)";
__ref._handleelement /*String*/ (null,_k,_value);
 }
};
RDebugUtils.currentLine=228917262;
 //BA.debugLineNum = 228917262;BA.debugLine="End Sub";
return "";
}
public String  _handlelistelement(b4j.docU.map2xml __ref,String _key,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="map2xml";
if (Debug.shouldDelegate(ba, "handlelistelement", true))
	 {return ((String) Debug.delegate(ba, "handlelistelement", new Object[] {_key,_lst}));}
Object _value = null;
RDebugUtils.currentLine=229048320;
 //BA.debugLineNum = 229048320;BA.debugLine="Private Sub HandleListElement (key As String, lst";
RDebugUtils.currentLine=229048321;
 //BA.debugLineNum = 229048321;BA.debugLine="For Each value As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_value = group1.Get(index1);
RDebugUtils.currentLine=229048322;
 //BA.debugLineNum = 229048322;BA.debugLine="HandleElement(key, value)";
__ref._handleelement /*String*/ (null,_key,_value);
 }
};
RDebugUtils.currentLine=229048324;
 //BA.debugLineNum = 229048324;BA.debugLine="End Sub";
return "";
}
}