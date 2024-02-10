package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xml2map extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xml2map", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xml2map.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xmlelement{
public boolean IsInitialized;
public String Name;
public anywheresoftware.b4a.objects.collections.List Children;
public String Text;
public anywheresoftware.b4a.objects.collections.Map Attributes;
public void Initialize() {
IsInitialized = true;
Name = "";
Children = new anywheresoftware.b4a.objects.collections.List();
Text = "";
Attributes = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.SaxParser _parser = null;
public anywheresoftware.b4a.objects.collections.List _elements = null;
public boolean _mstripnamespaces = false;
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
public String  _initialize(b4j.docU.xml2map __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=229179392;
 //BA.debugLineNum = 229179392;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=229179393;
 //BA.debugLineNum = 229179393;BA.debugLine="parser.Initialize";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Initialize(ba);
RDebugUtils.currentLine=229179394;
 //BA.debugLineNum = 229179394;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _parse(b4j.docU.xml2map __ref,String _xml) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse", new Object[] {_xml}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
byte[] _b = null;
RDebugUtils.currentLine=229376000;
 //BA.debugLineNum = 229376000;BA.debugLine="Public Sub Parse(XML As String) As Map";
RDebugUtils.currentLine=229376001;
 //BA.debugLineNum = 229376001;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=229376002;
 //BA.debugLineNum = 229376002;BA.debugLine="Dim b() As Byte = XML.GetBytes(\"UTF8\")";
_b = _xml.getBytes("UTF8");
RDebugUtils.currentLine=229376003;
 //BA.debugLineNum = 229376003;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
RDebugUtils.currentLine=229376004;
 //BA.debugLineNum = 229376004;BA.debugLine="Return Parse2(in)";
if (true) return __ref._parse2 /*anywheresoftware.b4a.objects.collections.Map*/ (null,_in);
RDebugUtils.currentLine=229376005;
 //BA.debugLineNum = 229376005;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
RDebugUtils.currentLine=229113856;
 //BA.debugLineNum = 229113856;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=229113857;
 //BA.debugLineNum = 229113857;BA.debugLine="Private parser As SaxParser";
_parser = new anywheresoftware.b4a.objects.SaxParser();
RDebugUtils.currentLine=229113858;
 //BA.debugLineNum = 229113858;BA.debugLine="Type XmlElement (Name As String, Children As List";
;
RDebugUtils.currentLine=229113859;
 //BA.debugLineNum = 229113859;BA.debugLine="Private elements As List";
_elements = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=229113860;
 //BA.debugLineNum = 229113860;BA.debugLine="Private mStripNamespaces As Boolean";
_mstripnamespaces = false;
RDebugUtils.currentLine=229113861;
 //BA.debugLineNum = 229113861;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xml2map._xmlelement  _createelement(b4j.docU.xml2map __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "createelement", true))
	 {return ((b4j.docU.xml2map._xmlelement) Debug.delegate(ba, "createelement", new Object[] {_name}));}
b4j.docU.xml2map._xmlelement _xe = null;
RDebugUtils.currentLine=229572608;
 //BA.debugLineNum = 229572608;BA.debugLine="Private Sub CreateElement (Name As String) As XmlE";
RDebugUtils.currentLine=229572609;
 //BA.debugLineNum = 229572609;BA.debugLine="Dim xe As XmlElement";
_xe = new b4j.docU.xml2map._xmlelement();
RDebugUtils.currentLine=229572610;
 //BA.debugLineNum = 229572610;BA.debugLine="xe.Initialize";
_xe.Initialize();
RDebugUtils.currentLine=229572611;
 //BA.debugLineNum = 229572611;BA.debugLine="xe.Children.Initialize";
_xe.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=229572612;
 //BA.debugLineNum = 229572612;BA.debugLine="xe.Name = Name";
_xe.Name /*String*/  = _name;
RDebugUtils.currentLine=229572614;
 //BA.debugLineNum = 229572614;BA.debugLine="If mStripNamespaces Then";
if (__ref._mstripnamespaces /*boolean*/ ) { 
RDebugUtils.currentLine=229572615;
 //BA.debugLineNum = 229572615;BA.debugLine="xe.Name = StripNamespace(Name)";
_xe.Name /*String*/  = __ref._stripnamespace /*String*/ (null,_name);
 };
RDebugUtils.currentLine=229572618;
 //BA.debugLineNum = 229572618;BA.debugLine="Return xe";
if (true) return _xe;
RDebugUtils.currentLine=229572619;
 //BA.debugLineNum = 229572619;BA.debugLine="End Sub";
return null;
}
public String  _stripnamespace(b4j.docU.xml2map __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "stripnamespace", true))
	 {return ((String) Debug.delegate(ba, "stripnamespace", new Object[] {_s}));}
int _i = 0;
RDebugUtils.currentLine=229703680;
 //BA.debugLineNum = 229703680;BA.debugLine="Private Sub StripNamespace(s As String) As String";
RDebugUtils.currentLine=229703684;
 //BA.debugLineNum = 229703684;BA.debugLine="Dim i As Int = s.IndexOf(\":\")";
_i = _s.indexOf(":");
RDebugUtils.currentLine=229703685;
 //BA.debugLineNum = 229703685;BA.debugLine="If i > -1 Then";
if (_i>-1) { 
RDebugUtils.currentLine=229703686;
 //BA.debugLineNum = 229703686;BA.debugLine="Return s.SubString(i + 1)";
if (true) return _s.substring((int) (_i+1));
 }else {
RDebugUtils.currentLine=229703688;
 //BA.debugLineNum = 229703688;BA.debugLine="Return s";
if (true) return _s;
 };
RDebugUtils.currentLine=229703691;
 //BA.debugLineNum = 229703691;BA.debugLine="End Sub";
return "";
}
public Object  _elementtoobject(b4j.docU.xml2map __ref,b4j.docU.xml2map._xmlelement _element) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "elementtoobject", true))
	 {return ((Object) Debug.delegate(ba, "elementtoobject", new Object[] {_element}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.xml2map._xmlelement _child = null;
Object _childobject = null;
Object _currentitem = null;
anywheresoftware.b4a.objects.collections.List _list = null;
RDebugUtils.currentLine=229507072;
 //BA.debugLineNum = 229507072;BA.debugLine="Private Sub ElementToObject (Element As XmlElement";
RDebugUtils.currentLine=229507073;
 //BA.debugLineNum = 229507073;BA.debugLine="If Element.Children.Size = 0 And Element.Attribut";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (Object)(_element.Text /*String*/ );};
RDebugUtils.currentLine=229507074;
 //BA.debugLineNum = 229507074;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=229507075;
 //BA.debugLineNum = 229507075;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=229507076;
 //BA.debugLineNum = 229507076;BA.debugLine="If Element.Attributes.IsInitialized Then m.Put(\"A";
if (_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
_m.Put((Object)("Attributes"),(Object)(_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=229507077;
 //BA.debugLineNum = 229507077;BA.debugLine="If Element.Children.Size = 0 Then m.Put(\"Text\", E";
if (_element.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
_m.Put((Object)("Text"),(Object)(_element.Text /*String*/ ));};
RDebugUtils.currentLine=229507078;
 //BA.debugLineNum = 229507078;BA.debugLine="For Each child As XmlElement In Element.Children";
{
final anywheresoftware.b4a.BA.IterableList group6 = _element.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_child = (b4j.docU.xml2map._xmlelement)(group6.Get(index6));
RDebugUtils.currentLine=229507079;
 //BA.debugLineNum = 229507079;BA.debugLine="Dim childObject As Object = ElementToObject(chil";
_childobject = __ref._elementtoobject /*Object*/ (null,_child);
RDebugUtils.currentLine=229507080;
 //BA.debugLineNum = 229507080;BA.debugLine="If m.ContainsKey(child.Name) Then";
if (_m.ContainsKey((Object)(_child.Name /*String*/ ))) { 
RDebugUtils.currentLine=229507081;
 //BA.debugLineNum = 229507081;BA.debugLine="Dim currentItem As Object = m.Get(child.Name)";
_currentitem = _m.Get((Object)(_child.Name /*String*/ ));
RDebugUtils.currentLine=229507082;
 //BA.debugLineNum = 229507082;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=229507083;
 //BA.debugLineNum = 229507083;BA.debugLine="If currentItem Is List Then";
if (_currentitem instanceof java.util.List) { 
RDebugUtils.currentLine=229507084;
 //BA.debugLineNum = 229507084;BA.debugLine="list = currentItem";
_list = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_currentitem));
 }else {
RDebugUtils.currentLine=229507086;
 //BA.debugLineNum = 229507086;BA.debugLine="list.Initialize";
_list.Initialize();
RDebugUtils.currentLine=229507087;
 //BA.debugLineNum = 229507087;BA.debugLine="list.Add(currentItem)";
_list.Add(_currentitem);
RDebugUtils.currentLine=229507088;
 //BA.debugLineNum = 229507088;BA.debugLine="m.Put(child.Name, list)";
_m.Put((Object)(_child.Name /*String*/ ),(Object)(_list.getObject()));
 };
RDebugUtils.currentLine=229507090;
 //BA.debugLineNum = 229507090;BA.debugLine="list.Add(childObject)";
_list.Add(_childobject);
 }else {
RDebugUtils.currentLine=229507092;
 //BA.debugLineNum = 229507092;BA.debugLine="m.Put(child.Name, childObject)";
_m.Put((Object)(_child.Name /*String*/ ),_childobject);
 };
 }
};
RDebugUtils.currentLine=229507095;
 //BA.debugLineNum = 229507095;BA.debugLine="Return m";
if (true) return (Object)(_m.getObject());
RDebugUtils.currentLine=229507096;
 //BA.debugLineNum = 229507096;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xml2map._xmlelement  _getlastelement(b4j.docU.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "getlastelement", true))
	 {return ((b4j.docU.xml2map._xmlelement) Debug.delegate(ba, "getlastelement", null));}
RDebugUtils.currentLine=229769216;
 //BA.debugLineNum = 229769216;BA.debugLine="Private Sub GetLastElement As XmlElement";
RDebugUtils.currentLine=229769217;
 //BA.debugLineNum = 229769217;BA.debugLine="Return elements.Get(elements.Size - 1)";
if (true) return (b4j.docU.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=229769218;
 //BA.debugLineNum = 229769218;BA.debugLine="End Sub";
return null;
}
public boolean  _getstripnamespaces(b4j.docU.xml2map __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "getstripnamespaces", true))
	 {return ((Boolean) Debug.delegate(ba, "getstripnamespaces", null));}
RDebugUtils.currentLine=229244928;
 //BA.debugLineNum = 229244928;BA.debugLine="Public Sub getStripNamespaces As Boolean";
RDebugUtils.currentLine=229244929;
 //BA.debugLineNum = 229244929;BA.debugLine="Return mStripNamespaces";
if (true) return __ref._mstripnamespaces /*boolean*/ ;
RDebugUtils.currentLine=229244930;
 //BA.debugLineNum = 229244930;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _parse2(b4j.docU.xml2map __ref,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _input) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parse2", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parse2", new Object[] {_input}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=229441536;
 //BA.debugLineNum = 229441536;BA.debugLine="Public Sub Parse2(Input As InputStream) As Map";
RDebugUtils.currentLine=229441537;
 //BA.debugLineNum = 229441537;BA.debugLine="elements.Initialize";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=229441538;
 //BA.debugLineNum = 229441538;BA.debugLine="elements.Add(CreateElement(\"stub\"))";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createelement /*b4j.docU.xml2map._xmlelement*/ (null,"stub")));
RDebugUtils.currentLine=229441539;
 //BA.debugLineNum = 229441539;BA.debugLine="parser.Parse(Input, \"parser\")";
__ref._parser /*anywheresoftware.b4a.objects.SaxParser*/ .Parse((java.io.InputStream)(_input.getObject()),"parser");
RDebugUtils.currentLine=229441540;
 //BA.debugLineNum = 229441540;BA.debugLine="Dim m As Map = ElementToObject(elements.Get(0))";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._elementtoobject /*Object*/ (null,(b4j.docU.xml2map._xmlelement)(__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))))));
RDebugUtils.currentLine=229441541;
 //BA.debugLineNum = 229441541;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=229441542;
 //BA.debugLineNum = 229441542;BA.debugLine="End Sub";
return null;
}
public String  _parser_endelement(b4j.docU.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_endelement", true))
	 {return ((String) Debug.delegate(ba, "parser_endelement", new Object[] {_uri,_name,_text}));}
b4j.docU.xml2map._xmlelement _element = null;
RDebugUtils.currentLine=229834752;
 //BA.debugLineNum = 229834752;BA.debugLine="Private Sub Parser_EndElement (Uri As String, Name";
RDebugUtils.currentLine=229834753;
 //BA.debugLineNum = 229834753;BA.debugLine="Dim Element As XmlElement = GetLastElement";
_element = __ref._getlastelement /*b4j.docU.xml2map._xmlelement*/ (null);
RDebugUtils.currentLine=229834754;
 //BA.debugLineNum = 229834754;BA.debugLine="Element.Text = Text.ToString";
_element.Text /*String*/  = _text.ToString();
RDebugUtils.currentLine=229834755;
 //BA.debugLineNum = 229834755;BA.debugLine="elements.RemoveAt(elements.Size - 1)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=229834756;
 //BA.debugLineNum = 229834756;BA.debugLine="End Sub";
return "";
}
public String  _parser_startelement(b4j.docU.xml2map __ref,String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "parser_startelement", true))
	 {return ((String) Debug.delegate(ba, "parser_startelement", new Object[] {_uri,_name,_attributes}));}
b4j.docU.xml2map._xmlelement _element = null;
anywheresoftware.b4a.objects.collections.Map _att = null;
int _i = 0;
String _key = "";
RDebugUtils.currentLine=229638144;
 //BA.debugLineNum = 229638144;BA.debugLine="Private Sub Parser_StartElement (Uri As String, Na";
RDebugUtils.currentLine=229638146;
 //BA.debugLineNum = 229638146;BA.debugLine="Dim Element As XmlElement = CreateElement(Name)";
_element = __ref._createelement /*b4j.docU.xml2map._xmlelement*/ (null,_name);
RDebugUtils.currentLine=229638147;
 //BA.debugLineNum = 229638147;BA.debugLine="If Attributes.IsInitialized And Attributes.Size >";
if (_attributes.IsInitialized() && _attributes.getSize()>0) { 
RDebugUtils.currentLine=229638148;
 //BA.debugLineNum = 229638148;BA.debugLine="Dim att As Map";
_att = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=229638160;
 //BA.debugLineNum = 229638160;BA.debugLine="att.Initialize";
_att.Initialize();
RDebugUtils.currentLine=229638161;
 //BA.debugLineNum = 229638161;BA.debugLine="For i = 0 To Attributes.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_attributes.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=229638162;
 //BA.debugLineNum = 229638162;BA.debugLine="Dim key As String = Attributes.GetName(i)";
_key = _attributes.GetName(_i);
RDebugUtils.currentLine=229638163;
 //BA.debugLineNum = 229638163;BA.debugLine="If mStripNamespaces Then key = StripNamespace(k";
if (__ref._mstripnamespaces /*boolean*/ ) { 
_key = __ref._stripnamespace /*String*/ (null,_key);};
RDebugUtils.currentLine=229638164;
 //BA.debugLineNum = 229638164;BA.debugLine="att.Put(key, Attributes.GetValue(i))";
_att.Put((Object)(_key),(Object)(_attributes.GetValue(_i)));
 }
};
RDebugUtils.currentLine=229638167;
 //BA.debugLineNum = 229638167;BA.debugLine="Element.Attributes = att";
_element.Attributes /*anywheresoftware.b4a.objects.collections.Map*/  = _att;
 };
RDebugUtils.currentLine=229638169;
 //BA.debugLineNum = 229638169;BA.debugLine="GetLastElement.Children.Add(Element)";
__ref._getlastelement /*b4j.docU.xml2map._xmlelement*/ (null).Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=229638170;
 //BA.debugLineNum = 229638170;BA.debugLine="elements.Add(Element)";
__ref._elements /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_element));
RDebugUtils.currentLine=229638171;
 //BA.debugLineNum = 229638171;BA.debugLine="End Sub";
return "";
}
public String  _setstripnamespaces(b4j.docU.xml2map __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="xml2map";
if (Debug.shouldDelegate(ba, "setstripnamespaces", true))
	 {return ((String) Debug.delegate(ba, "setstripnamespaces", new Object[] {_b}));}
RDebugUtils.currentLine=229310464;
 //BA.debugLineNum = 229310464;BA.debugLine="Public Sub setStripNamespaces (b As Boolean)";
RDebugUtils.currentLine=229310465;
 //BA.debugLineNum = 229310465;BA.debugLine="mStripNamespaces = b";
__ref._mstripnamespaces /*boolean*/  = _b;
RDebugUtils.currentLine=229310466;
 //BA.debugLineNum = 229310466;BA.debugLine="End Sub";
return "";
}
}