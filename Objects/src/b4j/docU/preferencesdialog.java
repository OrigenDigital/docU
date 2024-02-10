package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class preferencesdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.preferencesdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.preferencesdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xprefitem{
public boolean IsInitialized;
public Object Title;
public int ItemType;
public anywheresoftware.b4a.objects.collections.Map Extra;
public String Key;
public boolean Required;
public void Initialize() {
IsInitialized = true;
Title = new Object();
ItemType = 0;
Extra = new anywheresoftware.b4a.objects.collections.Map();
Key = "";
Required = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.collections.List _prefitems = null;
public int _type_boolean = 0;
public int _type_text = 0;
public int _type_date = 0;
public int _type_options = 0;
public int _type_color = 0;
public int _type_separator = 0;
public int _type_number = 0;
public int _type_password = 0;
public int _type_shortoptions = 0;
public int _type_decimalnumber = 0;
public int _type_multilinetext = 0;
public int _type_time = 0;
public int _type_numericrange = 0;
public int _type_explanation = 0;
public b4j.docU.b4xdatetemplate _datetemplate = null;
public b4j.docU.b4xlongtexttemplate _longtexttemplate = null;
public b4j.docU.b4xdialog _dialog = null;
public int _result_showing_nested_dialog = 0;
public int _nesteddialogitemindex = 0;
public Object _mtitle = null;
public b4j.docU.b4xsearchtemplate _searchtemplate = null;
public Object _template = null;
public b4j.docU.b4xcolortemplate _colortemplate = null;
public b4j.docU.b4xcombobox _b4xcombobox1 = null;
public int _theme_dark = 0;
public int _theme_light = 0;
public int _mtheme = 0;
public int _itemsbackgroundcolor = 0;
public int _textcolor = 0;
public int _separatorbackgroundcolor = 0;
public int _separatortextcolor = 0;
public Object _mcallback = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaulthintfont = null;
public int _defaulthintlargesize = 0;
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
public String  _addbooleanitem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addbooleanitem", true))
	 {return ((String) Debug.delegate(ba, "addbooleanitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112328704;
 //BA.debugLineNum = 112328704;BA.debugLine="Public Sub AddBooleanItem (Key As String, Title As";
RDebugUtils.currentLine=112328705;
 //BA.debugLineNum = 112328705;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_BOOLEAN,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_boolean /*int*/ ,_key)));
RDebugUtils.currentLine=112328706;
 //BA.debugLineNum = 112328706;BA.debugLine="End Sub";
return "";
}
public b4j.docU.preferencesdialog._b4xprefitem  _createprefitem(b4j.docU.preferencesdialog __ref,Object _title,int _itemtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createprefitem", true))
	 {return ((b4j.docU.preferencesdialog._b4xprefitem) Debug.delegate(ba, "createprefitem", new Object[] {_title,_itemtype,_key}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=113115136;
 //BA.debugLineNum = 113115136;BA.debugLine="Private Sub CreatePrefItem(Title As Object, ItemTy";
RDebugUtils.currentLine=113115137;
 //BA.debugLineNum = 113115137;BA.debugLine="Dim pi As B4XPrefItem";
_pi = new b4j.docU.preferencesdialog._b4xprefitem();
RDebugUtils.currentLine=113115138;
 //BA.debugLineNum = 113115138;BA.debugLine="pi.Initialize";
_pi.Initialize();
RDebugUtils.currentLine=113115139;
 //BA.debugLineNum = 113115139;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=113115140;
 //BA.debugLineNum = 113115140;BA.debugLine="pi.ItemType = ItemType";
_pi.ItemType /*int*/  = _itemtype;
RDebugUtils.currentLine=113115141;
 //BA.debugLineNum = 113115141;BA.debugLine="pi.Key = Key";
_pi.Key /*String*/  = _key;
RDebugUtils.currentLine=113115142;
 //BA.debugLineNum = 113115142;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=113115143;
 //BA.debugLineNum = 113115143;BA.debugLine="End Sub";
return null;
}
public String  _addcoloritem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addcoloritem", true))
	 {return ((String) Debug.delegate(ba, "addcoloritem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112918528;
 //BA.debugLineNum = 112918528;BA.debugLine="Public Sub AddColorItem(Key As String, Title As Ob";
RDebugUtils.currentLine=112918529;
 //BA.debugLineNum = 112918529;BA.debugLine="If ColorTemplate.IsInitialized = False Then";
if (__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=112918530;
 //BA.debugLineNum = 112918530;BA.debugLine="ColorTemplate.Initialize";
__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ ._initialize /*String*/ (null,ba);
 };
RDebugUtils.currentLine=112918532;
 //BA.debugLineNum = 112918532;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_COLOR, K";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_color /*int*/ ,_key)));
RDebugUtils.currentLine=112918533;
 //BA.debugLineNum = 112918533;BA.debugLine="End Sub";
return "";
}
public String  _adddateitem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddateitem", true))
	 {return ((String) Debug.delegate(ba, "adddateitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112852992;
 //BA.debugLineNum = 112852992;BA.debugLine="Public Sub AddDateItem (Key As String, Title As Ob";
RDebugUtils.currentLine=112852993;
 //BA.debugLineNum = 112852993;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DATE, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_date /*int*/ ,_key)));
RDebugUtils.currentLine=112852994;
 //BA.debugLineNum = 112852994;BA.debugLine="End Sub";
return "";
}
public String  _adddecimalnumberitem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "adddecimalnumberitem", true))
	 {return ((String) Debug.delegate(ba, "adddecimalnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112525312;
 //BA.debugLineNum = 112525312;BA.debugLine="Public Sub AddDecimalNumberItem (Key As String, Ti";
RDebugUtils.currentLine=112525313;
 //BA.debugLineNum = 112525313;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_DECIMALN";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_decimalnumber /*int*/ ,_key)));
RDebugUtils.currentLine=112525314;
 //BA.debugLineNum = 112525314;BA.debugLine="End Sub";
return "";
}
public String  _addexplanationitem(b4j.docU.preferencesdialog __ref,String _key,Object _title,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addexplanationitem", true))
	 {return ((String) Debug.delegate(ba, "addexplanationitem", new Object[] {_key,_title,_text}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=112984064;
 //BA.debugLineNum = 112984064;BA.debugLine="Public Sub AddExplanationItem (Key As String, Titl";
RDebugUtils.currentLine=112984065;
 //BA.debugLineNum = 112984065;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_explanation /*int*/ ,_key);
RDebugUtils.currentLine=112984066;
 //BA.debugLineNum = 112984066;BA.debugLine="pi.Extra = CreateMap(\"text\": Text)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("text"),_text});
RDebugUtils.currentLine=112984067;
 //BA.debugLineNum = 112984067;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=112984068;
 //BA.debugLineNum = 112984068;BA.debugLine="End Sub";
return "";
}
public String  _addmultilinetextitem(b4j.docU.preferencesdialog __ref,String _key,Object _title,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addmultilinetextitem", true))
	 {return ((String) Debug.delegate(ba, "addmultilinetextitem", new Object[] {_key,_title,_height}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=112590848;
 //BA.debugLineNum = 112590848;BA.debugLine="Public Sub AddMultilineTextItem (Key As String, Ti";
RDebugUtils.currentLine=112590849;
 //BA.debugLineNum = 112590849;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_multilinetext /*int*/ ,_key);
RDebugUtils.currentLine=112590850;
 //BA.debugLineNum = 112590850;BA.debugLine="pi.Extra = CreateMap(\"height\": Height)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("height"),(Object)(_height)});
RDebugUtils.currentLine=112590851;
 //BA.debugLineNum = 112590851;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=112590852;
 //BA.debugLineNum = 112590852;BA.debugLine="End Sub";
return "";
}
public String  _addnumberitem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumberitem", true))
	 {return ((String) Debug.delegate(ba, "addnumberitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112459776;
 //BA.debugLineNum = 112459776;BA.debugLine="Public Sub AddNumberItem (Key As String, Title As";
RDebugUtils.currentLine=112459777;
 //BA.debugLineNum = 112459777;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_NUMBER,";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_number /*int*/ ,_key)));
RDebugUtils.currentLine=112459778;
 //BA.debugLineNum = 112459778;BA.debugLine="End Sub";
return "";
}
public String  _addnumericrangeitem(b4j.docU.preferencesdialog __ref,String _key,Object _title,double _rangestart,double _rangeend,double _interval) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "addnumericrangeitem", new Object[] {_key,_title,_rangestart,_rangeend,_interval}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=112656384;
 //BA.debugLineNum = 112656384;BA.debugLine="Public Sub AddNumericRangeItem (Key As String, Tit";
RDebugUtils.currentLine=112656385;
 //BA.debugLineNum = 112656385;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_numericrange /*int*/ ,_key);
RDebugUtils.currentLine=112656386;
 //BA.debugLineNum = 112656386;BA.debugLine="pi.Extra = CreateMap(\"start\": RangeStart, \"end\":";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("start"),(Object)(_rangestart),(Object)("end"),(Object)(_rangeend),(Object)("interval"),(Object)(_interval)});
RDebugUtils.currentLine=112656387;
 //BA.debugLineNum = 112656387;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=112656388;
 //BA.debugLineNum = 112656388;BA.debugLine="End Sub";
return "";
}
public String  _addoptionsitem(b4j.docU.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addoptionsitem", new Object[] {_key,_title,_options}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=112197632;
 //BA.debugLineNum = 112197632;BA.debugLine="Public Sub AddOptionsItem (Key As String, Title As";
RDebugUtils.currentLine=112197634;
 //BA.debugLineNum = 112197634;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_options /*int*/ ,_key);
RDebugUtils.currentLine=112197635;
 //BA.debugLineNum = 112197635;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=112197636;
 //BA.debugLineNum = 112197636;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=112197638;
 //BA.debugLineNum = 112197638;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=112197639;
 //BA.debugLineNum = 112197639;BA.debugLine="End Sub";
return "";
}
public String  _addpassworditem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addpassworditem", true))
	 {return ((String) Debug.delegate(ba, "addpassworditem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112787456;
 //BA.debugLineNum = 112787456;BA.debugLine="Public Sub AddPasswordItem (Key As String, Title A";
RDebugUtils.currentLine=112787457;
 //BA.debugLineNum = 112787457;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_PASSWORD";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_password /*int*/ ,_key)));
RDebugUtils.currentLine=112787458;
 //BA.debugLineNum = 112787458;BA.debugLine="End Sub";
return "";
}
public String  _addseparator(b4j.docU.preferencesdialog __ref,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addseparator", true))
	 {return ((String) Debug.delegate(ba, "addseparator", new Object[] {_title}));}
RDebugUtils.currentLine=113049600;
 //BA.debugLineNum = 113049600;BA.debugLine="Public Sub AddSeparator (Title As Object)";
RDebugUtils.currentLine=113049601;
 //BA.debugLineNum = 113049601;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_SEPARATO";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_separator /*int*/ ,"")));
RDebugUtils.currentLine=113049602;
 //BA.debugLineNum = 113049602;BA.debugLine="End Sub";
return "";
}
public String  _addshortoptionsitem(b4j.docU.preferencesdialog __ref,String _key,Object _title,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addshortoptionsitem", true))
	 {return ((String) Debug.delegate(ba, "addshortoptionsitem", new Object[] {_key,_title,_options}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=112263168;
 //BA.debugLineNum = 112263168;BA.debugLine="Public Sub AddShortOptionsItem (Key As String, Tit";
RDebugUtils.currentLine=112263169;
 //BA.debugLineNum = 112263169;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_shortoptions /*int*/ ,_key);
RDebugUtils.currentLine=112263170;
 //BA.debugLineNum = 112263170;BA.debugLine="If Options.IsInitialized Then";
if (_options.IsInitialized()) { 
RDebugUtils.currentLine=112263171;
 //BA.debugLineNum = 112263171;BA.debugLine="pi.Extra = CreateMap(\"options\": Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("options"),(Object)(_options.getObject())});
 };
RDebugUtils.currentLine=112263173;
 //BA.debugLineNum = 112263173;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=112263174;
 //BA.debugLineNum = 112263174;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtextitem", true))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_key,_title}));}
RDebugUtils.currentLine=112394240;
 //BA.debugLineNum = 112394240;BA.debugLine="Public Sub AddTextItem (Key As String, Title As Ob";
RDebugUtils.currentLine=112394241;
 //BA.debugLineNum = 112394241;BA.debugLine="PrefItems.Add(CreatePrefItem(Title, TYPE_TEXT, Ke";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_text /*int*/ ,_key)));
RDebugUtils.currentLine=112394242;
 //BA.debugLineNum = 112394242;BA.debugLine="End Sub";
return "";
}
public String  _addtimeitem(b4j.docU.preferencesdialog __ref,String _key,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "addtimeitem", true))
	 {return ((String) Debug.delegate(ba, "addtimeitem", new Object[] {_key,_title}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=112721920;
 //BA.debugLineNum = 112721920;BA.debugLine="Public Sub AddTimeItem (Key As String, Title As Ob";
RDebugUtils.currentLine=112721921;
 //BA.debugLineNum = 112721921;BA.debugLine="Dim pi As B4XPrefItem = CreatePrefItem(Title, TYP";
_pi = __ref._createprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_title,__ref._type_time /*int*/ ,_key);
RDebugUtils.currentLine=112721922;
 //BA.debugLineNum = 112721922;BA.debugLine="pi.Extra = CreateMap(\"24\": False)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("24"),(Object)(__c.False)});
RDebugUtils.currentLine=112721923;
 //BA.debugLineNum = 112721923;BA.debugLine="PrefItems.Add(pi)";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pi));
RDebugUtils.currentLine=112721924;
 //BA.debugLineNum = 112721924;BA.debugLine="End Sub";
return "";
}
public String  _b4xcombobox1_selectedindexchanged(b4j.docU.preferencesdialog __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xcombobox1_selectedindexchanged", true))
	 {return ((String) Debug.delegate(ba, "b4xcombobox1_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=114950144;
 //BA.debugLineNum = 114950144;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
RDebugUtils.currentLine=114950146;
 //BA.debugLineNum = 114950146;BA.debugLine="End Sub";
return "";
}
public String  _b4xswitch1_valuechanged(b4j.docU.preferencesdialog __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "b4xswitch1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xswitch1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=114884608;
 //BA.debugLineNum = 114884608;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
RDebugUtils.currentLine=114884610;
 //BA.debugLineNum = 114884610;BA.debugLine="End Sub";
return "";
}
public boolean  _backkeypressed(b4j.docU.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "backkeypressed", true))
	 {return ((Boolean) Debug.delegate(ba, "backkeypressed", null));}
RDebugUtils.currentLine=112066560;
 //BA.debugLineNum = 112066560;BA.debugLine="Public Sub BackKeyPressed As Boolean";
RDebugUtils.currentLine=112066561;
 //BA.debugLineNum = 112066561;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.docU.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=112066562;
 //BA.debugLineNum = 112066562;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=112066563;
 //BA.debugLineNum = 112066563;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=112066565;
 //BA.debugLineNum = 112066565;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=112066566;
 //BA.debugLineNum = 112066566;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.docU.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
RDebugUtils.currentLine=111673344;
 //BA.debugLineNum = 111673344;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=111673345;
 //BA.debugLineNum = 111673345;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=111673346;
 //BA.debugLineNum = 111673346;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=111673347;
 //BA.debugLineNum = 111673347;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=111673348;
 //BA.debugLineNum = 111673348;BA.debugLine="Type B4XPrefItem (Title As Object, ItemType As In";
;
RDebugUtils.currentLine=111673349;
 //BA.debugLineNum = 111673349;BA.debugLine="Public PrefItems As List";
_prefitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=111673350;
 //BA.debugLineNum = 111673350;BA.debugLine="Public TYPE_BOOLEAN = 1, TYPE_TEXT = 2, TYPE_DATE";
_type_boolean = (int) (1);
_type_text = (int) (2);
_type_date = (int) (3);
_type_options = (int) (4);
_type_color = (int) (5);
_type_separator = (int) (6);
_type_number = (int) (7);
_type_password = (int) (8);
_type_shortoptions = (int) (9);
_type_decimalnumber = (int) (10);
_type_multilinetext = (int) (11);
_type_time = (int) (12);
_type_numericrange = (int) (13);
_type_explanation = (int) (14);
RDebugUtils.currentLine=111673353;
 //BA.debugLineNum = 111673353;BA.debugLine="Public DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=111673354;
 //BA.debugLineNum = 111673354;BA.debugLine="Public LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4j.docU.b4xlongtexttemplate();
RDebugUtils.currentLine=111673355;
 //BA.debugLineNum = 111673355;BA.debugLine="Public Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=111673356;
 //BA.debugLineNum = 111673356;BA.debugLine="Private RESULT_SHOWING_NESTED_DIALOG As Int = 100";
_result_showing_nested_dialog = (int) (100);
RDebugUtils.currentLine=111673357;
 //BA.debugLineNum = 111673357;BA.debugLine="Private NestedDialogItemIndex As Int";
_nesteddialogitemindex = 0;
RDebugUtils.currentLine=111673358;
 //BA.debugLineNum = 111673358;BA.debugLine="Private mTitle As Object";
_mtitle = new Object();
RDebugUtils.currentLine=111673359;
 //BA.debugLineNum = 111673359;BA.debugLine="Public SearchTemplate As B4XSearchTemplate";
_searchtemplate = new b4j.docU.b4xsearchtemplate();
RDebugUtils.currentLine=111673360;
 //BA.debugLineNum = 111673360;BA.debugLine="Private Template As Object";
_template = new Object();
RDebugUtils.currentLine=111673361;
 //BA.debugLineNum = 111673361;BA.debugLine="Public ColorTemplate As B4XColorTemplate";
_colortemplate = new b4j.docU.b4xcolortemplate();
RDebugUtils.currentLine=111673362;
 //BA.debugLineNum = 111673362;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new b4j.docU.b4xcombobox();
RDebugUtils.currentLine=111673363;
 //BA.debugLineNum = 111673363;BA.debugLine="Public const THEME_DARK = 1, THEME_LIGHT = 2 As I";
_theme_dark = (int) (1);
_theme_light = (int) (2);
RDebugUtils.currentLine=111673364;
 //BA.debugLineNum = 111673364;BA.debugLine="Private mTheme As Int";
_mtheme = 0;
RDebugUtils.currentLine=111673365;
 //BA.debugLineNum = 111673365;BA.debugLine="Public ItemsBackgroundColor As Int";
_itemsbackgroundcolor = 0;
RDebugUtils.currentLine=111673366;
 //BA.debugLineNum = 111673366;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=111673367;
 //BA.debugLineNum = 111673367;BA.debugLine="Public SeparatorBackgroundColor, SeparatorTextCol";
_separatorbackgroundcolor = 0;
_separatortextcolor = 0;
RDebugUtils.currentLine=111673368;
 //BA.debugLineNum = 111673368;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=111673369;
 //BA.debugLineNum = 111673369;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=111673370;
 //BA.debugLineNum = 111673370;BA.debugLine="Public DefaultHintFont As B4XFont";
_defaulthintfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=111673371;
 //BA.debugLineNum = 111673371;BA.debugLine="Public DefaultHintLargeSize As Int";
_defaulthintlargesize = 0;
RDebugUtils.currentLine=111673372;
 //BA.debugLineNum = 111673372;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.docU.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=113442816;
 //BA.debugLineNum = 113442816;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=113442817;
 //BA.debugLineNum = 113442817;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=113442818;
 //BA.debugLineNum = 113442818;BA.debugLine="PrefItems.Clear";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=113442819;
 //BA.debugLineNum = 113442819;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.docU.preferencesdialog __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=115081216;
 //BA.debugLineNum = 115081216;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=115081217;
 //BA.debugLineNum = 115081217;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=115081218;
 //BA.debugLineNum = 115081218;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=115081219;
 //BA.debugLineNum = 115081219;BA.debugLine="End Sub";
return "";
}
public boolean  _commitchanges(b4j.docU.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "commitchanges", true))
	 {return ((Boolean) Debug.delegate(ba, "commitchanges", new Object[] {_data}));}
anywheresoftware.b4a.objects.collections.Map _temp = null;
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
b4j.docU.preferencesdialog._b4xprefitem _prefitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _itempanel = null;
boolean _required = false;
Object _value = null;
b4j.docU.b4xswitch _switch = null;
b4j.docU.b4xfloattextfield _ft = null;
double _n = 0;
int _n2 = 0;
b4j.docU.b4xplusminus _pmhours = null;
b4j.docU.b4xplusminus _pmminutes = null;
b4j.docU.b4xplusminus _pmampm = null;
b4j.example.dateutils._period _p = null;
b4j.docU.b4xplusminus _pm = null;
b4j.docU.b4xcombobox _cmb = null;
boolean _valid = false;
String _key = "";
RDebugUtils.currentLine=114032640;
 //BA.debugLineNum = 114032640;BA.debugLine="Private Sub CommitChanges (Data As Map) As Boolean";
RDebugUtils.currentLine=114032641;
 //BA.debugLineNum = 114032641;BA.debugLine="Dim Temp As Map";
_temp = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=114032642;
 //BA.debugLineNum = 114032642;BA.debugLine="Temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=114032643;
 //BA.debugLineNum = 114032643;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=114032644;
 //BA.debugLineNum = 114032644;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=114032645;
 //BA.debugLineNum = 114032645;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.docU.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=114032646;
 //BA.debugLineNum = 114032646;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.docU.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=114032647;
 //BA.debugLineNum = 114032647;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=114032648;
 //BA.debugLineNum = 114032648;BA.debugLine="Dim Required As Boolean = PrefItem.Required";
_required = _prefitem.Required /*boolean*/ ;
RDebugUtils.currentLine=114032649;
 //BA.debugLineNum = 114032649;BA.debugLine="Dim Value As Object";
_value = new Object();
RDebugUtils.currentLine=114032650;
 //BA.debugLineNum = 114032650;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ )) {
case 0: {
RDebugUtils.currentLine=114032652;
 //BA.debugLineNum = 114032652;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.docU.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=114032653;
 //BA.debugLineNum = 114032653;BA.debugLine="Value = switch.Value";
_value = (Object)(_switch._getvalue /*boolean*/ (null));
 break; }
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=114032655;
 //BA.debugLineNum = 114032655;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.docU.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=114032656;
 //BA.debugLineNum = 114032656;BA.debugLine="Value = ft.Text";
_value = (Object)(_ft._gettext /*String*/ (null));
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=114032659;
 //BA.debugLineNum = 114032659;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.docU.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=114032660;
 //BA.debugLineNum = 114032660;BA.debugLine="Dim n As Double";
_n = 0;
RDebugUtils.currentLine=114032661;
 //BA.debugLineNum = 114032661;BA.debugLine="If ft.Text <> \"\" Then";
if ((_ft._gettext /*String*/ (null)).equals("") == false) { 
RDebugUtils.currentLine=114032662;
 //BA.debugLineNum = 114032662;BA.debugLine="If IsNumber(ft.Text) Then";
if (__c.IsNumber(_ft._gettext /*String*/ (null))) { 
RDebugUtils.currentLine=114032663;
 //BA.debugLineNum = 114032663;BA.debugLine="n = ft.Text";
_n = (double)(Double.parseDouble(_ft._gettext /*String*/ (null)));
RDebugUtils.currentLine=114032664;
 //BA.debugLineNum = 114032664;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
RDebugUtils.currentLine=114032665;
 //BA.debugLineNum = 114032665;BA.debugLine="Dim n2 As Int = n";
_n2 = (int) (_n);
RDebugUtils.currentLine=114032666;
 //BA.debugLineNum = 114032666;BA.debugLine="Value = n2";
_value = (Object)(_n2);
 }else {
RDebugUtils.currentLine=114032668;
 //BA.debugLineNum = 114032668;BA.debugLine="Value = n";
_value = (Object)(_n);
 };
 }else {
RDebugUtils.currentLine=114032671;
 //BA.debugLineNum = 114032671;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=114032672;
 //BA.debugLineNum = 114032672;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }else {
RDebugUtils.currentLine=114032675;
 //BA.debugLineNum = 114032675;BA.debugLine="Value = \"\"";
_value = (Object)("");
 };
 break; }
case 6: {
RDebugUtils.currentLine=114032678;
 //BA.debugLineNum = 114032678;BA.debugLine="Value = DateTime.DateParse(ItemPanel.GetView(1";
_value = (Object)(__c.DateTime.DateParse(_itempanel.GetView((int) (1)).getText()));
 break; }
case 7: {
RDebugUtils.currentLine=114032680;
 //BA.debugLineNum = 114032680;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=114032681;
 //BA.debugLineNum = 114032681;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=114032682;
 //BA.debugLineNum = 114032682;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=114032683;
 //BA.debugLineNum = 114032683;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=114032684;
 //BA.debugLineNum = 114032684;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=114032685;
 //BA.debugLineNum = 114032685;BA.debugLine="p.Hours = pmHours.SelectedValue";
_p.Hours = (int)(BA.ObjectToNumber(_pmhours._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=114032686;
 //BA.debugLineNum = 114032686;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=114032687;
 //BA.debugLineNum = 114032687;BA.debugLine="If p.Hours = 12 Then p.Hours = 0";
if (_p.Hours==12) { 
_p.Hours = (int) (0);};
RDebugUtils.currentLine=114032688;
 //BA.debugLineNum = 114032688;BA.debugLine="If pmAMPM.SelectedValue = \"pm\" Then p.Hours =";
if ((_pmampm._getselectedvalue /*Object*/ (null)).equals((Object)("pm"))) { 
_p.Hours = (int) (_p.Hours+12);};
 };
RDebugUtils.currentLine=114032690;
 //BA.debugLineNum = 114032690;BA.debugLine="p.Minutes = pmMinutes.SelectedValue";
_p.Minutes = (int)(BA.ObjectToNumber(_pmminutes._getselectedvalue /*Object*/ (null)));
RDebugUtils.currentLine=114032691;
 //BA.debugLineNum = 114032691;BA.debugLine="Value = p";
_value = (Object)(_p);
 break; }
case 8: {
RDebugUtils.currentLine=114032693;
 //BA.debugLineNum = 114032693;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=114032694;
 //BA.debugLineNum = 114032694;BA.debugLine="Value = pm.SelectedValue";
_value = _pm._getselectedvalue /*Object*/ (null);
 break; }
case 9: {
RDebugUtils.currentLine=114032696;
 //BA.debugLineNum = 114032696;BA.debugLine="Value = ItemPanel.GetView(1).Text";
_value = (Object)(_itempanel.GetView((int) (1)).getText());
 break; }
case 10: {
RDebugUtils.currentLine=114032698;
 //BA.debugLineNum = 114032698;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.docU.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=114032699;
 //BA.debugLineNum = 114032699;BA.debugLine="If cmb.SelectedIndex > -1 Then Value = cmb.Get";
if (_cmb._getselectedindex /*int*/ (null)>-1) { 
_value = (Object)(_cmb._getitem /*String*/ (null,_cmb._getselectedindex /*int*/ (null)));}
else {
_value = (Object)("");};
 break; }
case 11: {
RDebugUtils.currentLine=114032701;
 //BA.debugLineNum = 114032701;BA.debugLine="Value = ItemPanel.GetView(1).Color";
_value = (Object)(_itempanel.GetView((int) (1)).getColor());
 break; }
case 12: 
case 13: {
RDebugUtils.currentLine=114032703;
 //BA.debugLineNum = 114032703;BA.debugLine="Continue";
if (true) continue;
 break; }
}
;
RDebugUtils.currentLine=114032705;
 //BA.debugLineNum = 114032705;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=114032706;
 //BA.debugLineNum = 114032706;BA.debugLine="If Required Then";
if (_required) { 
RDebugUtils.currentLine=114032707;
 //BA.debugLineNum = 114032707;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=114032708;
 //BA.debugLineNum = 114032708;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
RDebugUtils.currentLine=114032710;
 //BA.debugLineNum = 114032710;BA.debugLine="Continue";
if (true) continue;
 };
 };
RDebugUtils.currentLine=114032713;
 //BA.debugLineNum = 114032713;BA.debugLine="Temp.Put(PrefItem.Key, Value)";
_temp.Put((Object)(_prefitem.Key /*String*/ ),_value);
 }
};
RDebugUtils.currentLine=114032715;
 //BA.debugLineNum = 114032715;BA.debugLine="If mEventName <> \"\" And xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(int) (1))) { 
RDebugUtils.currentLine=114032716;
 //BA.debugLineNum = 114032716;BA.debugLine="Dim Valid As Boolean = CallSub2(mCallback, mEven";
_valid = BA.ObjectToBoolean(__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_IsValid",(Object)(_temp)));
RDebugUtils.currentLine=114032717;
 //BA.debugLineNum = 114032717;BA.debugLine="If Valid = False Then Return False";
if (_valid==__c.False) { 
if (true) return __c.False;};
 };
RDebugUtils.currentLine=114032719;
 //BA.debugLineNum = 114032719;BA.debugLine="For Each key As String In Temp.Keys";
{
final anywheresoftware.b4a.BA.IterableList group78 = _temp.Keys();
final int groupLen78 = group78.getSize()
;int index78 = 0;
;
for (; index78 < groupLen78;index78++){
_key = BA.ObjectToString(group78.Get(index78));
RDebugUtils.currentLine=114032720;
 //BA.debugLineNum = 114032720;BA.debugLine="Data.Put(key, Temp.Get(key))";
_data.Put((Object)(_key),_temp.Get((Object)(_key)));
 }
};
RDebugUtils.currentLine=114032722;
 //BA.debugLineNum = 114032722;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=114032723;
 //BA.debugLineNum = 114032723;BA.debugLine="End Sub";
return false;
}
public void  _gotoitem(b4j.docU.preferencesdialog __ref,int _i) throws Exception{
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gotoitem", true))
	 {Debug.delegate(ba, "gotoitem", new Object[] {_i}); return;}
ResumableSub_GoToItem rsub = new ResumableSub_GoToItem(this,__ref,_i);
rsub.resume(ba, null);
}
public static class ResumableSub_GoToItem extends BA.ResumableSub {
public ResumableSub_GoToItem(b4j.docU.preferencesdialog parent,b4j.docU.preferencesdialog __ref,int _i) {
this.parent = parent;
this.__ref = __ref;
this._i = _i;
this.__ref = parent;
}
b4j.docU.preferencesdialog __ref;
b4j.docU.preferencesdialog parent;
int _i;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _duration = 0;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preferencesdialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=114163713;
 //BA.debugLineNum = 114163713;BA.debugLine="CustomListView1.JumpToItem(i)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem(_i);
RDebugUtils.currentLine=114163714;
 //BA.debugLineNum = 114163714;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=114163715;
 //BA.debugLineNum = 114163715;BA.debugLine="For i = 0 To 3";
if (true) break;

case 1:
//for
this.state = 4;
step3 = 1;
limit3 = (int) (3);
_i = (int) (0) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=114163716;
 //BA.debugLineNum = 114163716;BA.debugLine="Dim duration As Int = 100 - i * 20";
_duration = (int) (100-_i*20);
RDebugUtils.currentLine=114163717;
 //BA.debugLineNum = 114163717;BA.debugLine="p.SetLayoutAnimated(duration, -10dip, 0, p.Width";
_p.SetLayoutAnimated(_duration,-parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=114163718;
 //BA.debugLineNum = 114163718;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=114163719;
 //BA.debugLineNum = 114163719;BA.debugLine="p.SetLayoutAnimated(duration, 10dip, 0, p.Width,";
_p.SetLayoutAnimated(_duration,parent.__c.DipToCurrent((int) (10)),0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=114163720;
 //BA.debugLineNum = 114163720;BA.debugLine="Sleep(duration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "gotoitem"),_duration);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=114163722;
 //BA.debugLineNum = 114163722;BA.debugLine="p.SetLayoutAnimated(50, 0, 0, p.Width, p.Height)";
_p.SetLayoutAnimated((int) (50),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=114163723;
 //BA.debugLineNum = 114163723;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.docU.preferencesdialog __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=114556928;
 //BA.debugLineNum = 114556928;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=114556929;
 //BA.debugLineNum = 114556929;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=114556930;
 //BA.debugLineNum = 114556930;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=114556931;
 //BA.debugLineNum = 114556931;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=114556932;
 //BA.debugLineNum = 114556932;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlayouts(b4j.docU.preferencesdialog __ref,b4j.docU.preferencesdialog._b4xprefitem _prefitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createlayouts", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlayouts", new Object[] {_prefitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
b4j.docU.b4xfloattextfield _ft = null;
anywheresoftware.b4a.objects.collections.List _original = null;
b4j.docU.b4xfloattextfield _tf = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
anywheresoftware.b4j.objects.LabelWrapper _rlbl = null;
RDebugUtils.currentLine=113836032;
 //BA.debugLineNum = 113836032;BA.debugLine="Private Sub CreateLayouts (PrefItem As B4XPrefItem";
RDebugUtils.currentLine=113836033;
 //BA.debugLineNum = 113836033;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=113836034;
 //BA.debugLineNum = 113836034;BA.debugLine="p.Width = CustomListView1.sv.ScrollViewContentWid";
_p.setWidth(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=113836035;
 //BA.debugLineNum = 113836035;BA.debugLine="p.Height = 50dip";
_p.setHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=113836036;
 //BA.debugLineNum = 113836036;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_time /*int*/ ,__ref._type_numericrange /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_separator /*int*/ )) {
case 0: {
RDebugUtils.currentLine=113836038;
 //BA.debugLineNum = 113836038;BA.debugLine="p.LoadLayout(\"booleanitem\")";
_p.LoadLayout("booleanitem",ba);
RDebugUtils.currentLine=113836039;
 //BA.debugLineNum = 113836039;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113836040;
 //BA.debugLineNum = 113836040;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=113836042;
 //BA.debugLineNum = 113836042;BA.debugLine="p.Height = PrefItem.Extra.Get(\"height\")";
_p.setHeight((double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))));
RDebugUtils.currentLine=113836043;
 //BA.debugLineNum = 113836043;BA.debugLine="p.LoadLayout(\"textitemmulti\")";
_p.LoadLayout("textitemmulti",ba);
RDebugUtils.currentLine=113836044;
 //BA.debugLineNum = 113836044;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.docU.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113836045;
 //BA.debugLineNum = 113836045;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113836046;
 //BA.debugLineNum = 113836046;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=113836047;
 //BA.debugLineNum = 113836047;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=113836048;
 //BA.debugLineNum = 113836048;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=113836050;
 //BA.debugLineNum = 113836050;BA.debugLine="CreateTimeItem(PrefItem, p)";
__ref._createtimeitem /*String*/ (null,_prefitem,_p);
 break; }
case 3: {
RDebugUtils.currentLine=113836052;
 //BA.debugLineNum = 113836052;BA.debugLine="CreateNumericRangeItem(PrefItem, p)";
__ref._createnumericrangeitem /*String*/ (null,_prefitem,_p);
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
RDebugUtils.currentLine=113836054;
 //BA.debugLineNum = 113836054;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=113836055;
 //BA.debugLineNum = 113836055;BA.debugLine="If PrefItem.ItemType = TYPE_PASSWORD Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_password /*int*/ ) { 
RDebugUtils.currentLine=113836056;
 //BA.debugLineNum = 113836056;BA.debugLine="p.LoadLayout(\"passworditem\")";
_p.LoadLayout("passworditem",ba);
 }else {
RDebugUtils.currentLine=113836058;
 //BA.debugLineNum = 113836058;BA.debugLine="p.LoadLayout(\"textitem\")";
_p.LoadLayout("textitem",ba);
RDebugUtils.currentLine=113836059;
 //BA.debugLineNum = 113836059;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.docU.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113836060;
 //BA.debugLineNum = 113836060;BA.debugLine="If PrefItem.ItemType = TYPE_NUMBER Then";
if (_prefitem.ItemType /*int*/ ==__ref._type_number /*int*/ ) { 
 }else 
{RDebugUtils.currentLine=113836068;
 //BA.debugLineNum = 113836068;BA.debugLine="Else If PrefItem.ItemType = TYPE_DECIMALNUMBER";
if (_prefitem.ItemType /*int*/ ==__ref._type_decimalnumber /*int*/ ) { 
 }}
;
 };
RDebugUtils.currentLine=113836079;
 //BA.debugLineNum = 113836079;BA.debugLine="Dim ft As B4XFloatTextField = p.GetView(0).Tag";
_ft = (b4j.docU.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113836080;
 //BA.debugLineNum = 113836080;BA.debugLine="ft.HintText = PrefItem.Title";
_ft._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113836081;
 //BA.debugLineNum = 113836081;BA.debugLine="ft.HintFont = DefaultHintFont";
_ft._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=113836082;
 //BA.debugLineNum = 113836082;BA.debugLine="ft.LargeLabelTextSize = DefaultHintLargeSize";
_ft._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=113836083;
 //BA.debugLineNum = 113836083;BA.debugLine="ft.Update";
_ft._update /*String*/ (null);
 break; }
case 8: {
RDebugUtils.currentLine=113836085;
 //BA.debugLineNum = 113836085;BA.debugLine="TwoLabelsLayout(\"lblDate\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblDate",_p,_prefitem);
 break; }
case 9: {
RDebugUtils.currentLine=113836087;
 //BA.debugLineNum = 113836087;BA.debugLine="TwoLabelsLayout(\"lblOptions\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblOptions",_p,_prefitem);
 break; }
case 10: {
RDebugUtils.currentLine=113836089;
 //BA.debugLineNum = 113836089;BA.debugLine="p.LoadLayout(\"shortoptions\")";
_p.LoadLayout("shortoptions",ba);
RDebugUtils.currentLine=113836090;
 //BA.debugLineNum = 113836090;BA.debugLine="p.GetView(0).TextColor = TextColor";
_p.GetView((int) (0)).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=113836091;
 //BA.debugLineNum = 113836091;BA.debugLine="Dim original As List = PrefItem.Extra.Get(\"opti";
_original = new anywheresoftware.b4a.objects.collections.List();
_original = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=113836111;
 //BA.debugLineNum = 113836111;BA.debugLine="B4XComboBox1.SetItems(original)";
__ref._b4xcombobox1 /*b4j.docU.b4xcombobox*/ ._setitems /*String*/ (null,_original);
RDebugUtils.currentLine=113836113;
 //BA.debugLineNum = 113836113;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetV";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (0)),_prefitem.Title /*Object*/ );
 break; }
case 11: {
RDebugUtils.currentLine=113836115;
 //BA.debugLineNum = 113836115;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=113836116;
 //BA.debugLineNum = 113836116;BA.debugLine="p.LoadLayout(\"coloritem\")";
_p.LoadLayout("coloritem",ba);
RDebugUtils.currentLine=113836117;
 //BA.debugLineNum = 113836117;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.docU.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113836118;
 //BA.debugLineNum = 113836118;BA.debugLine="tf.HintFont = DefaultHintFont";
_tf._hintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=113836119;
 //BA.debugLineNum = 113836119;BA.debugLine="tf.LargeLabelTextSize = DefaultHintLargeSize";
_tf._largelabeltextsize /*float*/  = (float) (__ref._defaulthintlargesize /*int*/ );
RDebugUtils.currentLine=113836120;
 //BA.debugLineNum = 113836120;BA.debugLine="tf.HintText = PrefItem.Title";
_tf._hinttext /*String*/  = BA.ObjectToString(_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113836121;
 //BA.debugLineNum = 113836121;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
 break; }
case 12: {
RDebugUtils.currentLine=113836127;
 //BA.debugLineNum = 113836127;BA.debugLine="TwoLabelsLayout(\"lblExplanation\", p, PrefItem)";
__ref._twolabelslayout /*String*/ (null,"lblExplanation",_p,_prefitem);
 break; }
case 13: {
RDebugUtils.currentLine=113836129;
 //BA.debugLineNum = 113836129;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=113836130;
 //BA.debugLineNum = 113836130;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=113836131;
 //BA.debugLineNum = 113836131;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=113836132;
 //BA.debugLineNum = 113836132;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=113836133;
 //BA.debugLineNum = 113836133;BA.debugLine="xlbl.TextColor = SeparatorTextColor";
_xlbl.setTextColor(__ref._separatortextcolor /*int*/ );
RDebugUtils.currentLine=113836134;
 //BA.debugLineNum = 113836134;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(14)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14)));
RDebugUtils.currentLine=113836135;
 //BA.debugLineNum = 113836135;BA.debugLine="xlbl.Color = SeparatorBackgroundColor";
_xlbl.setColor(__ref._separatorbackgroundcolor /*int*/ );
RDebugUtils.currentLine=113836136;
 //BA.debugLineNum = 113836136;BA.debugLine="p.Height = 30dip";
_p.setHeight(__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=113836137;
 //BA.debugLineNum = 113836137;BA.debugLine="p.AddView(xlbl, 0, 0, p.Width, p.Height)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),0,0,_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=113836138;
 //BA.debugLineNum = 113836138;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(xlbl,";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_xlbl,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113836139;
 //BA.debugLineNum = 113836139;BA.debugLine="PrefItem.Required = False";
_prefitem.Required /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=113836141;
 //BA.debugLineNum = 113836141;BA.debugLine="If PrefItem.Required Then";
if (_prefitem.Required /*boolean*/ ) { 
RDebugUtils.currentLine=113836142;
 //BA.debugLineNum = 113836142;BA.debugLine="Dim rlbl As Label";
_rlbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=113836143;
 //BA.debugLineNum = 113836143;BA.debugLine="rlbl.Initialize(\"\")";
_rlbl.Initialize(ba,"");
RDebugUtils.currentLine=113836144;
 //BA.debugLineNum = 113836144;BA.debugLine="Dim xlbl As B4XView = rlbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_rlbl.getObject()));
RDebugUtils.currentLine=113836145;
 //BA.debugLineNum = 113836145;BA.debugLine="xlbl.Text = \"*\"";
_xlbl.setText("*");
RDebugUtils.currentLine=113836146;
 //BA.debugLineNum = 113836146;BA.debugLine="xlbl.TextColor = xui.Color_Red";
_xlbl.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=113836147;
 //BA.debugLineNum = 113836147;BA.debugLine="xlbl.TextSize = 11";
_xlbl.setTextSize(11);
RDebugUtils.currentLine=113836148;
 //BA.debugLineNum = 113836148;BA.debugLine="xlbl.SetTextAlignment(\"TOP\", \"LEFT\")";
_xlbl.SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=113836149;
 //BA.debugLineNum = 113836149;BA.debugLine="p.AddView(xlbl, 01dip, 0dip, 10dip, 10dip)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),__c.DipToCurrent((int) (01)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
 };
RDebugUtils.currentLine=113836151;
 //BA.debugLineNum = 113836151;BA.debugLine="p.Color = ItemsBackgroundColor";
_p.setColor(__ref._itemsbackgroundcolor /*int*/ );
RDebugUtils.currentLine=113836152;
 //BA.debugLineNum = 113836152;BA.debugLine="If mTheme <> THEME_DARK Then";
if (__ref._mtheme /*int*/ !=__ref._theme_dark /*int*/ ) { 
RDebugUtils.currentLine=113836153;
 //BA.debugLineNum = 113836153;BA.debugLine="If p.GetView(0).Tag Is B4XFloatTextField Then";
if (_p.GetView((int) (0)).getTag() instanceof b4j.docU.b4xfloattextfield) { 
RDebugUtils.currentLine=113836154;
 //BA.debugLineNum = 113836154;BA.debugLine="Dim tf As B4XFloatTextField = p.GetView(0).Tag";
_tf = (b4j.docU.b4xfloattextfield)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113836155;
 //BA.debugLineNum = 113836155;BA.debugLine="tf.TextField.TextColor = TextColor";
_tf._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=113836156;
 //BA.debugLineNum = 113836156;BA.debugLine="tf.NonFocusedHintColor = TextColor";
_tf._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=113836157;
 //BA.debugLineNum = 113836157;BA.debugLine="tf.Update";
_tf._update /*String*/ (null);
RDebugUtils.currentLine=113836158;
 //BA.debugLineNum = 113836158;BA.debugLine="If tf.lblClear.IsInitialized Then tf.lblClear.T";
if (_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
RDebugUtils.currentLine=113836159;
 //BA.debugLineNum = 113836159;BA.debugLine="If tf.lblV.IsInitialized Then tf.lblV.TextColor";
if (_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_tf._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );};
 };
 };
RDebugUtils.currentLine=113836162;
 //BA.debugLineNum = 113836162;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=113836163;
 //BA.debugLineNum = 113836163;BA.debugLine="End Sub";
return null;
}
public String  _createtimeitem(b4j.docU.preferencesdialog __ref,b4j.docU.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createtimeitem", true))
	 {return ((String) Debug.delegate(ba, "createtimeitem", new Object[] {_prefitem,_p}));}
boolean _is24 = false;
b4j.docU.b4xplusminus _pmhours = null;
b4j.docU.b4xplusminus _pmminutes = null;
b4j.docU.b4xplusminus _pmampm = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=113967104;
 //BA.debugLineNum = 113967104;BA.debugLine="Private Sub CreateTimeItem (PrefItem As B4XPrefIte";
RDebugUtils.currentLine=113967105;
 //BA.debugLineNum = 113967105;BA.debugLine="p.Height = 60dip";
_p.setHeight(__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=113967106;
 //BA.debugLineNum = 113967106;BA.debugLine="Dim is24 As Boolean = PrefItem.Extra.GetDefault(\"";
_is24 = BA.ObjectToBoolean(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False)));
RDebugUtils.currentLine=113967107;
 //BA.debugLineNum = 113967107;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=113967108;
 //BA.debugLineNum = 113967108;BA.debugLine="p.LoadLayout(\"timeitem24\")";
_p.LoadLayout("timeitem24",ba);
 }else {
RDebugUtils.currentLine=113967110;
 //BA.debugLineNum = 113967110;BA.debugLine="p.LoadLayout(\"timeitem\")";
_p.LoadLayout("timeitem",ba);
 };
RDebugUtils.currentLine=113967112;
 //BA.debugLineNum = 113967112;BA.debugLine="Dim pmHours As B4XPlusMinus = p.GetView(0).Tag";
_pmhours = (b4j.docU.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113967113;
 //BA.debugLineNum = 113967113;BA.debugLine="pmHours.RapidPeriod2 = 100";
_pmhours._rapidperiod2 /*int*/  = (int) (100);
RDebugUtils.currentLine=113967114;
 //BA.debugLineNum = 113967114;BA.debugLine="Dim pmMinutes As B4XPlusMinus = p.GetView(1).Tag";
_pmminutes = (b4j.docU.b4xplusminus)(_p.GetView((int) (1)).getTag());
RDebugUtils.currentLine=113967115;
 //BA.debugLineNum = 113967115;BA.debugLine="Dim pmAMPM As B4XPlusMinus = p.GetView(2).Tag";
_pmampm = (b4j.docU.b4xplusminus)(_p.GetView((int) (2)).getTag());
RDebugUtils.currentLine=113967116;
 //BA.debugLineNum = 113967116;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=113967117;
 //BA.debugLineNum = 113967117;BA.debugLine="Dim clr As Int = CustomListView1.sv.ScrollViewIn";
_clr = __ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().getColor();
RDebugUtils.currentLine=113967118;
 //BA.debugLineNum = 113967118;BA.debugLine="pmHours.mBase.SetColorAndBorder(xui.Color_Transp";
_pmhours._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=113967119;
 //BA.debugLineNum = 113967119;BA.debugLine="pmMinutes.mBase.SetColorAndBorder(xui.Color_Tran";
_pmminutes._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
RDebugUtils.currentLine=113967120;
 //BA.debugLineNum = 113967120;BA.debugLine="pmAMPM.mBase.SetColorAndBorder(xui.Color_Transpa";
_pmampm._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),_clr,0);
 };
RDebugUtils.currentLine=113967123;
 //BA.debugLineNum = 113967123;BA.debugLine="If is24 Then";
if (_is24) { 
RDebugUtils.currentLine=113967124;
 //BA.debugLineNum = 113967124;BA.debugLine="pmHours.SetNumericRange(0, 23, 1)";
_pmhours._setnumericrange /*String*/ (null,0,23,1);
 }else {
RDebugUtils.currentLine=113967126;
 //BA.debugLineNum = 113967126;BA.debugLine="pmHours.SetNumericRange(1, 12, 1)";
_pmhours._setnumericrange /*String*/ (null,1,12,1);
 };
RDebugUtils.currentLine=113967128;
 //BA.debugLineNum = 113967128;BA.debugLine="pmMinutes.SetNumericRange(0, 59, 1)";
_pmminutes._setnumericrange /*String*/ (null,0,59,1);
RDebugUtils.currentLine=113967129;
 //BA.debugLineNum = 113967129;BA.debugLine="pmMinutes.Formatter.GetDefaultFormat.MinimumInteg";
_pmminutes._formatter /*b4j.docU.b4xformatter*/ ._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = (int) (2);
RDebugUtils.currentLine=113967131;
 //BA.debugLineNum = 113967131;BA.debugLine="pmAMPM.SetStringItems(Array(\"am\", \"pm\"))";
_pmampm._setstringitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("am"),(Object)("pm")}));
RDebugUtils.currentLine=113967132;
 //BA.debugLineNum = 113967132;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (3)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113967133;
 //BA.debugLineNum = 113967133;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group27 = _p.GetAllViewsRecursive();
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group27.Get(index27)));
RDebugUtils.currentLine=113967134;
 //BA.debugLineNum = 113967134;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=113967136;
 //BA.debugLineNum = 113967136;BA.debugLine="End Sub";
return "";
}
public String  _createnumericrangeitem(b4j.docU.preferencesdialog __ref,b4j.docU.preferencesdialog._b4xprefitem _prefitem,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "createnumericrangeitem", true))
	 {return ((String) Debug.delegate(ba, "createnumericrangeitem", new Object[] {_prefitem,_p}));}
b4j.docU.b4xplusminus _pm = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=113901568;
 //BA.debugLineNum = 113901568;BA.debugLine="Private Sub CreateNumericRangeItem (PrefItem As B4";
RDebugUtils.currentLine=113901569;
 //BA.debugLineNum = 113901569;BA.debugLine="p.LoadLayout(\"numericrange\")";
_p.LoadLayout("numericrange",ba);
RDebugUtils.currentLine=113901570;
 //BA.debugLineNum = 113901570;BA.debugLine="Dim pm As B4XPlusMinus = p.GetView(0).Tag";
_pm = (b4j.docU.b4xplusminus)(_p.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113901571;
 //BA.debugLineNum = 113901571;BA.debugLine="pm.SetNumericRange(PrefItem.Extra.Get(\"start\"), P";
_pm._setnumericrange /*String*/ (null,(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("start")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("end")))),(double)(BA.ObjectToNumber(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("interval")))));
RDebugUtils.currentLine=113901572;
 //BA.debugLineNum = 113901572;BA.debugLine="pm.Formatter.GetDefaultFormat.MaximumFractions =";
_pm._formatter /*b4j.docU.b4xformatter*/ ._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = (int) (2);
RDebugUtils.currentLine=113901573;
 //BA.debugLineNum = 113901573;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(p.GetVie";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_p.GetView((int) (1)),_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=113901574;
 //BA.debugLineNum = 113901574;BA.debugLine="For Each v As B4XView In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group6 = _p.GetAllViewsRecursive();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group6.Get(index6)));
RDebugUtils.currentLine=113901575;
 //BA.debugLineNum = 113901575;BA.debugLine="If v Is Label Then v.TextColor = TextColor";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label) { 
_v.setTextColor(__ref._textcolor /*int*/ );};
 }
};
RDebugUtils.currentLine=113901577;
 //BA.debugLineNum = 113901577;BA.debugLine="End Sub";
return "";
}
public String  _twolabelslayout(b4j.docU.preferencesdialog __ref,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _p,b4j.docU.preferencesdialog._b4xprefitem _prefitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "twolabelslayout", true))
	 {return ((String) Debug.delegate(ba, "twolabelslayout", new Object[] {_eventname,_p,_prefitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbldate = null;
RDebugUtils.currentLine=114229248;
 //BA.debugLineNum = 114229248;BA.debugLine="Private Sub TwoLabelsLayout (EventName As String,";
RDebugUtils.currentLine=114229249;
 //BA.debugLineNum = 114229249;BA.debugLine="Dim lblTitle As B4XView = CreateLabel(EventName)";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=114229250;
 //BA.debugLineNum = 114229250;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\", \"LEFT\")";
_lbltitle.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=114229251;
 //BA.debugLineNum = 114229251;BA.debugLine="lblTitle.TextColor = TextColor";
_lbltitle.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=114229252;
 //BA.debugLineNum = 114229252;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultBoldFont(16";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=114229253;
 //BA.debugLineNum = 114229253;BA.debugLine="lblTitle.Font = fnt";
_lbltitle.setFont(_fnt);
RDebugUtils.currentLine=114229254;
 //BA.debugLineNum = 114229254;BA.debugLine="Dialog.InternalSetTextOrCSBuilderToLabel(lblTitle";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internalsettextorcsbuildertolabel /*String*/ (null,_lbltitle,_prefitem.Title /*Object*/ );
RDebugUtils.currentLine=114229255;
 //BA.debugLineNum = 114229255;BA.debugLine="p.AddView(lblTitle, 10dip, 10dip, p.Width - 110di";
_p.AddView((javafx.scene.Node)(_lbltitle.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),_p.getWidth()-__c.DipToCurrent((int) (110)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=114229256;
 //BA.debugLineNum = 114229256;BA.debugLine="Dim lblDate As B4XView = CreateLabel(EventName)";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbldate = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_eventname);
RDebugUtils.currentLine=114229257;
 //BA.debugLineNum = 114229257;BA.debugLine="lblDate.TextColor = TextColor";
_lbldate.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=114229258;
 //BA.debugLineNum = 114229258;BA.debugLine="lblDate.SetTextAlignment(\"CENTER\", \"RIGHT\")";
_lbldate.SetTextAlignment("CENTER","RIGHT");
RDebugUtils.currentLine=114229259;
 //BA.debugLineNum = 114229259;BA.debugLine="lblDate.Font = fnt";
_lbldate.setFont(_fnt);
RDebugUtils.currentLine=114229260;
 //BA.debugLineNum = 114229260;BA.debugLine="p.AddView(lblDate, p.Width - 108dip, 10dip, 98dip";
_p.AddView((javafx.scene.Node)(_lbldate.getObject()),_p.getWidth()-__c.DipToCurrent((int) (108)),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (98)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=114229261;
 //BA.debugLineNum = 114229261;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.docU.preferencesdialog __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=114819072;
 //BA.debugLineNum = 114819072;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=114819074;
 //BA.debugLineNum = 114819074;BA.debugLine="End Sub";
return "";
}
public String  _filldata(b4j.docU.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "filldata", true))
	 {return ((String) Debug.delegate(ba, "filldata", new Object[] {_data}));}
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
b4j.docU.preferencesdialog._b4xprefitem _prefitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _itempanel = null;
b4j.docU.b4xswitch _switch = null;
b4j.docU.b4xfloattextfield _ft = null;
b4j.docU.b4xcombobox _cmb = null;
anywheresoftware.b4a.objects.collections.List _options = null;
b4j.docU.b4xplusminus _pmhours = null;
b4j.docU.b4xplusminus _pmminutes = null;
b4j.docU.b4xplusminus _pmampm = null;
b4j.example.dateutils._period _p = null;
int _hour = 0;
String _m = "";
b4j.docU.b4xplusminus _pm = null;
RDebugUtils.currentLine=113508352;
 //BA.debugLineNum = 113508352;BA.debugLine="Private Sub FillData (Data As Map)";
RDebugUtils.currentLine=113508353;
 //BA.debugLineNum = 113508353;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=113508354;
 //BA.debugLineNum = 113508354;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=113508355;
 //BA.debugLineNum = 113508355;BA.debugLine="If (Item.Value Is B4XPrefItem) = False Then Exit";
if ((_item.Value instanceof b4j.docU.preferencesdialog._b4xprefitem)==__c.False) { 
if (true) break;};
RDebugUtils.currentLine=113508356;
 //BA.debugLineNum = 113508356;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.docU.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=113508357;
 //BA.debugLineNum = 113508357;BA.debugLine="Dim ItemPanel As B4XView = Item.Panel.GetView(0)";
_itempanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_itempanel = _item.Panel.GetView((int) (0));
RDebugUtils.currentLine=113508358;
 //BA.debugLineNum = 113508358;BA.debugLine="Select PrefItem.ItemType";
switch (BA.switchObjectToInt(_prefitem.ItemType /*int*/ ,__ref._type_boolean /*int*/ ,__ref._type_text /*int*/ ,__ref._type_password /*int*/ ,__ref._type_number /*int*/ ,__ref._type_decimalnumber /*int*/ ,__ref._type_multilinetext /*int*/ ,__ref._type_date /*int*/ ,__ref._type_options /*int*/ ,__ref._type_shortoptions /*int*/ ,__ref._type_color /*int*/ ,__ref._type_time /*int*/ ,__ref._type_separator /*int*/ ,__ref._type_explanation /*int*/ ,__ref._type_numericrange /*int*/ )) {
case 0: {
RDebugUtils.currentLine=113508360;
 //BA.debugLineNum = 113508360;BA.debugLine="Dim switch As B4XSwitch = ItemPanel.GetView(1)";
_switch = (b4j.docU.b4xswitch)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=113508361;
 //BA.debugLineNum = 113508361;BA.debugLine="switch.Value = GetPrefItemValue(PrefItem, Fals";
_switch._setvalue /*boolean*/ (null,BA.ObjectToBoolean(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.False),_data)));
 break; }
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=113508363;
 //BA.debugLineNum = 113508363;BA.debugLine="Dim ft As B4XFloatTextField = ItemPanel.GetVie";
_ft = (b4j.docU.b4xfloattextfield)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113508364;
 //BA.debugLineNum = 113508364;BA.debugLine="ft.Text = GetPrefItemValue(PrefItem, \"\", Data)";
_ft._settext /*String*/ (null,BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 6: {
RDebugUtils.currentLine=113508366;
 //BA.debugLineNum = 113508366;BA.debugLine="ItemPanel.GetView(1).Text = DateTime.Date(GetP";
_itempanel.GetView((int) (1)).setText(__c.DateTime.Date(BA.ObjectToLongNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__c.DateTime.getNow()),_data))));
 break; }
case 7: {
RDebugUtils.currentLine=113508368;
 //BA.debugLineNum = 113508368;BA.debugLine="ItemPanel.GetView(1).Text = GetPrefItemValue(P";
_itempanel.GetView((int) (1)).setText(BA.ObjectToString(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)));
 break; }
case 8: {
RDebugUtils.currentLine=113508370;
 //BA.debugLineNum = 113508370;BA.debugLine="Dim cmb As B4XComboBox = ItemPanel.GetView(1).";
_cmb = (b4j.docU.b4xcombobox)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=113508371;
 //BA.debugLineNum = 113508371;BA.debugLine="Dim options As List = PrefItem.Extra.Get(\"opti";
_options = new anywheresoftware.b4a.objects.collections.List();
_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))));
RDebugUtils.currentLine=113508372;
 //BA.debugLineNum = 113508372;BA.debugLine="cmb.SelectedIndex = Max(0, options.IndexOf(Get";
_cmb._setselectedindex /*int*/ (null,(int) (__c.Max(0,_options.IndexOf(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(""),_data)))));
 break; }
case 9: {
RDebugUtils.currentLine=113508374;
 //BA.debugLineNum = 113508374;BA.debugLine="SetLabelColor(ItemPanel.GetView(1), GetPrefIte";
__ref._setlabelcolor /*String*/ (null,_itempanel.GetView((int) (1)),(int)(BA.ObjectToNumber(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red),_data))));
RDebugUtils.currentLine=113508375;
 //BA.debugLineNum = 113508375;BA.debugLine="ItemPanel.GetView(2).Text = \"Pick\"";
_itempanel.GetView((int) (2)).setText("Pick");
 break; }
case 10: {
RDebugUtils.currentLine=113508377;
 //BA.debugLineNum = 113508377;BA.debugLine="Dim pmHours As B4XPlusMinus = ItemPanel.GetVie";
_pmhours = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113508378;
 //BA.debugLineNum = 113508378;BA.debugLine="Dim pmMinutes As B4XPlusMinus = ItemPanel.GetV";
_pmminutes = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (1)).getTag());
RDebugUtils.currentLine=113508379;
 //BA.debugLineNum = 113508379;BA.debugLine="Dim pmAMPM As B4XPlusMinus = ItemPanel.GetView";
_pmampm = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (2)).getTag());
RDebugUtils.currentLine=113508380;
 //BA.debugLineNum = 113508380;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=113508381;
 //BA.debugLineNum = 113508381;BA.debugLine="p = GetPrefItemValue(PrefItem, p, Data)";
_p = (b4j.example.dateutils._period)(__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(_p),_data));
RDebugUtils.currentLine=113508382;
 //BA.debugLineNum = 113508382;BA.debugLine="Dim hour As Int = p.Hours";
_hour = _p.Hours;
RDebugUtils.currentLine=113508383;
 //BA.debugLineNum = 113508383;BA.debugLine="Dim m As String";
_m = "";
RDebugUtils.currentLine=113508384;
 //BA.debugLineNum = 113508384;BA.debugLine="If PrefItem.Extra.GetDefault(\"24\", False) = Fa";
if ((_prefitem.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("24"),(Object)(__c.False))).equals((Object)(__c.False))) { 
RDebugUtils.currentLine=113508385;
 //BA.debugLineNum = 113508385;BA.debugLine="If hour <= 11 Then";
if (_hour<=11) { 
RDebugUtils.currentLine=113508386;
 //BA.debugLineNum = 113508386;BA.debugLine="m = \"am\"";
_m = "am";
 }else {
RDebugUtils.currentLine=113508388;
 //BA.debugLineNum = 113508388;BA.debugLine="m = \"pm\"";
_m = "pm";
RDebugUtils.currentLine=113508389;
 //BA.debugLineNum = 113508389;BA.debugLine="hour = hour - 12";
_hour = (int) (_hour-12);
 };
RDebugUtils.currentLine=113508391;
 //BA.debugLineNum = 113508391;BA.debugLine="If hour = 0 Then hour = 12";
if (_hour==0) { 
_hour = (int) (12);};
 };
RDebugUtils.currentLine=113508393;
 //BA.debugLineNum = 113508393;BA.debugLine="pmHours.SelectedValue = hour";
_pmhours._setselectedvalue /*Object*/ (null,(Object)(_hour));
RDebugUtils.currentLine=113508394;
 //BA.debugLineNum = 113508394;BA.debugLine="pmMinutes.SelectedValue = p.Minutes";
_pmminutes._setselectedvalue /*Object*/ (null,(Object)(_p.Minutes));
RDebugUtils.currentLine=113508395;
 //BA.debugLineNum = 113508395;BA.debugLine="pmAMPM.SelectedValue = m";
_pmampm._setselectedvalue /*Object*/ (null,(Object)(_m));
 break; }
case 11: 
case 12: {
 break; }
case 13: {
RDebugUtils.currentLine=113508398;
 //BA.debugLineNum = 113508398;BA.debugLine="Dim pm As B4XPlusMinus = ItemPanel.GetView(0).";
_pm = (b4j.docU.b4xplusminus)(_itempanel.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113508399;
 //BA.debugLineNum = 113508399;BA.debugLine="pm.SelectedValue = GetPrefItemValue(PrefItem,";
_pm._setselectedvalue /*Object*/ (null,__ref._getprefitemvalue /*Object*/ (null,_prefitem,(Object)(0),_data));
 break; }
default: {
RDebugUtils.currentLine=113508401;
 //BA.debugLineNum = 113508401;BA.debugLine="Log(\"Unknown type: \" & PrefItem.ItemType)";
__c.LogImpl("9113508401","Unknown type: "+BA.NumberToString(_prefitem.ItemType /*int*/ ),0);
 break; }
}
;
 }
};
RDebugUtils.currentLine=113508404;
 //BA.debugLineNum = 113508404;BA.debugLine="End Sub";
return "";
}
public Object  _getprefitemvalue(b4j.docU.preferencesdialog __ref,b4j.docU.preferencesdialog._b4xprefitem _prefitem,Object _defaultvalue,anywheresoftware.b4a.objects.collections.Map _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitemvalue", true))
	 {return ((Object) Debug.delegate(ba, "getprefitemvalue", new Object[] {_prefitem,_defaultvalue,_data}));}
RDebugUtils.currentLine=113639424;
 //BA.debugLineNum = 113639424;BA.debugLine="Private Sub GetPrefItemValue (PrefItem As B4XPrefI";
RDebugUtils.currentLine=113639425;
 //BA.debugLineNum = 113639425;BA.debugLine="Return Data.GetDefault(PrefItem.Key, DefaultValue";
if (true) return _data.GetDefault((Object)(_prefitem.Key /*String*/ ),_defaultvalue);
RDebugUtils.currentLine=113639426;
 //BA.debugLineNum = 113639426;BA.debugLine="End Sub";
return null;
}
public String  _setlabelcolor(b4j.docU.preferencesdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setlabelcolor", true))
	 {return ((String) Debug.delegate(ba, "setlabelcolor", new Object[] {_lbl,_clr}));}
b4j.docU.b4xfloattextfield _ft = null;
RDebugUtils.currentLine=113573888;
 //BA.debugLineNum = 113573888;BA.debugLine="Private Sub SetLabelColor(lbl As B4XView, clr As I";
RDebugUtils.currentLine=113573889;
 //BA.debugLineNum = 113573889;BA.debugLine="Dim ft As B4XFloatTextField = lbl.Parent.GetView(";
_ft = (b4j.docU.b4xfloattextfield)(_lbl.getParent().GetView((int) (0)).getTag());
RDebugUtils.currentLine=113573890;
 //BA.debugLineNum = 113573890;BA.debugLine="ft.Text = ColorToHex(clr)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_clr));
RDebugUtils.currentLine=113573891;
 //BA.debugLineNum = 113573891;BA.debugLine="lbl.SetColorAndBorder(clr, 1dip, Dialog.BorderCol";
_lbl.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._dialog /*b4j.docU.b4xdialog*/ ._bordercolor /*int*/ ,__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=113573892;
 //BA.debugLineNum = 113573892;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.preferencesdialog __ref,b4j.docU.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog1}));}
RDebugUtils.currentLine=113311744;
 //BA.debugLineNum = 113311744;BA.debugLine="Public Sub GetPanel (Dialog1 As B4XDialog) As B4XV";
RDebugUtils.currentLine=113311745;
 //BA.debugLineNum = 113311745;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=113311746;
 //BA.debugLineNum = 113311746;BA.debugLine="End Sub";
return null;
}
public b4j.docU.preferencesdialog._b4xprefitem  _getprefitem(b4j.docU.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "getprefitem", true))
	 {return ((b4j.docU.preferencesdialog._b4xprefitem) Debug.delegate(ba, "getprefitem", new Object[] {_key}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=114753536;
 //BA.debugLineNum = 114753536;BA.debugLine="Public Sub GetPrefItem (Key As String) As B4XPrefI";
RDebugUtils.currentLine=114753537;
 //BA.debugLineNum = 114753537;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4j.docU.preferencesdialog._b4xprefitem)(group1.Get(index1));
RDebugUtils.currentLine=114753538;
 //BA.debugLineNum = 114753538;BA.debugLine="If pi.Key = Key Then Return pi";
if ((_pi.Key /*String*/ ).equals(_key)) { 
if (true) return _pi;};
 }
};
RDebugUtils.currentLine=114753540;
 //BA.debugLineNum = 114753540;BA.debugLine="Return Null";
if (true) return (b4j.docU.preferencesdialog._b4xprefitem)(__c.Null);
RDebugUtils.currentLine=114753541;
 //BA.debugLineNum = 114753541;BA.debugLine="End Sub";
return null;
}
public int  _gettheme(b4j.docU.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettheme", true))
	 {return ((Integer) Debug.delegate(ba, "gettheme", null));}
RDebugUtils.currentLine=113704960;
 //BA.debugLineNum = 113704960;BA.debugLine="Public Sub getTheme As Int";
RDebugUtils.currentLine=113704961;
 //BA.debugLineNum = 113704961;BA.debugLine="Return mTheme";
if (true) return __ref._mtheme /*int*/ ;
RDebugUtils.currentLine=113704962;
 //BA.debugLineNum = 113704962;BA.debugLine="End Sub";
return 0;
}
public Object  _gettitle(b4j.docU.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "gettitle", true))
	 {return ((Object) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=111869952;
 //BA.debugLineNum = 111869952;BA.debugLine="Public Sub getTitle As Object";
RDebugUtils.currentLine=111869953;
 //BA.debugLineNum = 111869953;BA.debugLine="Return mTitle";
if (true) return __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=111869954;
 //BA.debugLineNum = 111869954;BA.debugLine="End Sub";
return null;
}
public int[]  _hextocolor(b4j.docU.preferencesdialog __ref,String _hex) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "hextocolor", true))
	 {return ((int[]) Debug.delegate(ba, "hextocolor", new Object[] {_hex}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _res = null;
int[] _ints = null;
RDebugUtils.currentLine=115146752;
 //BA.debugLineNum = 115146752;BA.debugLine="Private Sub HexToColor(Hex As String) As Int()";
RDebugUtils.currentLine=115146753;
 //BA.debugLineNum = 115146753;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=115146754;
 //BA.debugLineNum = 115146754;BA.debugLine="Hex = Hex.ToLowerCase";
_hex = _hex.toLowerCase();
RDebugUtils.currentLine=115146755;
 //BA.debugLineNum = 115146755;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=115146756;
 //BA.debugLineNum = 115146756;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=115146757;
 //BA.debugLineNum = 115146757;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=115146758;
 //BA.debugLineNum = 115146758;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=115146760;
 //BA.debugLineNum = 115146760;BA.debugLine="If Hex.Length = 6 Then Hex = \"ff\" & Hex";
if (_hex.length()==6) { 
_hex = "ff"+_hex;};
RDebugUtils.currentLine=115146762;
 //BA.debugLineNum = 115146762;BA.debugLine="Dim res() As Int";
_res = new int[(int) (0)];
;
RDebugUtils.currentLine=115146763;
 //BA.debugLineNum = 115146763;BA.debugLine="If Regex.IsMatch(\"[0-9a-f]{8}\", Hex) = False Then";
if (__c.Regex.IsMatch("[0-9a-f]{8}",_hex)==__c.False) { 
if (true) return _res;};
RDebugUtils.currentLine=115146764;
 //BA.debugLineNum = 115146764;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=115146765;
 //BA.debugLineNum = 115146765;BA.debugLine="Return ints";
if (true) return _ints;
RDebugUtils.currentLine=115146766;
 //BA.debugLineNum = 115146766;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.preferencesdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _title,int _width,int _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent,_title,_width,_height}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
RDebugUtils.currentLine=111738880;
 //BA.debugLineNum = 111738880;BA.debugLine="Public Sub Initialize (Parent As B4XView, Title As";
RDebugUtils.currentLine=111738881;
 //BA.debugLineNum = 111738881;BA.debugLine="Dialog.Initialize(Parent)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,_parent);
RDebugUtils.currentLine=111738882;
 //BA.debugLineNum = 111738882;BA.debugLine="Dialog.VisibleAnimationDuration = 0";
__ref._dialog /*b4j.docU.b4xdialog*/ ._visibleanimationduration /*int*/  = (int) (0);
RDebugUtils.currentLine=111738883;
 //BA.debugLineNum = 111738883;BA.debugLine="mTitle = Title";
__ref._mtitle /*Object*/  = _title;
RDebugUtils.currentLine=111738884;
 //BA.debugLineNum = 111738884;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=111738885;
 //BA.debugLineNum = 111738885;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=111738886;
 //BA.debugLineNum = 111738886;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=111738887;
 //BA.debugLineNum = 111738887;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=111738888;
 //BA.debugLineNum = 111738888;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=111738889;
 //BA.debugLineNum = 111738889;BA.debugLine="CustomListView1.PressedColor = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=111738890;
 //BA.debugLineNum = 111738890;BA.debugLine="PrefItems.Initialize";
__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=111738891;
 //BA.debugLineNum = 111738891;BA.debugLine="SearchTemplate.Initialize";
__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=111738892;
 //BA.debugLineNum = 111738892;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=111738893;
 //BA.debugLineNum = 111738893;BA.debugLine="LongTextTemplate.Initialize";
__ref._longtexttemplate /*b4j.docU.b4xlongtexttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=111738894;
 //BA.debugLineNum = 111738894;BA.debugLine="LongTextTemplate.CustomListView1.PressedColor = 0";
__ref._longtexttemplate /*b4j.docU.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ._pressedcolor = (int) (0);
RDebugUtils.currentLine=111738895;
 //BA.debugLineNum = 111738895;BA.debugLine="Dialog.OverlayColor = xui.Color_Transparent";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=111738897;
 //BA.debugLineNum = 111738897;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=111738898;
 //BA.debugLineNum = 111738898;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=111738899;
 //BA.debugLineNum = 111738899;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=111738904;
 //BA.debugLineNum = 111738904;BA.debugLine="DefaultHintFont = xui.CreateDefaultBoldFont(16)";
__ref._defaulthintfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16));
RDebugUtils.currentLine=111738906;
 //BA.debugLineNum = 111738906;BA.debugLine="DefaultHintLargeSize = 16";
__ref._defaulthintlargesize /*int*/  = (int) (16);
RDebugUtils.currentLine=111738907;
 //BA.debugLineNum = 111738907;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
RDebugUtils.currentLine=111738909;
 //BA.debugLineNum = 111738909;BA.debugLine="End Sub";
return "";
}
public String  _settheme(b4j.docU.preferencesdialog __ref,int _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settheme", true))
	 {return ((String) Debug.delegate(ba, "settheme", new Object[] {_t}));}
int _dividercolor = 0;
b4j.example.customlistview _clv = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _sv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
RDebugUtils.currentLine=113770496;
 //BA.debugLineNum = 113770496;BA.debugLine="Public Sub setTheme (t As Int)";
RDebugUtils.currentLine=113770497;
 //BA.debugLineNum = 113770497;BA.debugLine="If t <> mTheme Then";
if (_t!=__ref._mtheme /*int*/ ) { 
RDebugUtils.currentLine=113770498;
 //BA.debugLineNum = 113770498;BA.debugLine="mTheme = t";
__ref._mtheme /*int*/  = _t;
RDebugUtils.currentLine=113770499;
 //BA.debugLineNum = 113770499;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=113770500;
 //BA.debugLineNum = 113770500;BA.debugLine="Dim DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=113770501;
 //BA.debugLineNum = 113770501;BA.debugLine="Select mTheme";
switch (BA.switchObjectToInt(__ref._mtheme /*int*/ ,__ref._theme_dark /*int*/ ,__ref._theme_light /*int*/ )) {
case 0: {
RDebugUtils.currentLine=113770503;
 //BA.debugLineNum = 113770503;BA.debugLine="ItemsBackgroundColor = 0xFF626262";
__ref._itemsbackgroundcolor /*int*/  = ((int)0xff626262);
RDebugUtils.currentLine=113770504;
 //BA.debugLineNum = 113770504;BA.debugLine="SeparatorBackgroundColor = 0xFFC0C0C0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffc0c0c0);
RDebugUtils.currentLine=113770505;
 //BA.debugLineNum = 113770505;BA.debugLine="SeparatorTextColor = xui.Color_Black";
__ref._separatortextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=113770506;
 //BA.debugLineNum = 113770506;BA.debugLine="TextColor = xui.Color_White";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=113770507;
 //BA.debugLineNum = 113770507;BA.debugLine="DividerColor = 0xFF464646";
_dividercolor = ((int)0xff464646);
RDebugUtils.currentLine=113770508;
 //BA.debugLineNum = 113770508;BA.debugLine="Dialog.BackgroundColor = 0xFF555555";
__ref._dialog /*b4j.docU.b4xdialog*/ ._backgroundcolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=113770509;
 //BA.debugLineNum = 113770509;BA.debugLine="Dialog.ButtonsColor = 0xFF555555";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonscolor /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=113770510;
 //BA.debugLineNum = 113770510;BA.debugLine="Dialog.BorderColor = 0xff000000";
__ref._dialog /*b4j.docU.b4xdialog*/ ._bordercolor /*int*/  = ((int)0xff000000);
RDebugUtils.currentLine=113770511;
 //BA.debugLineNum = 113770511;BA.debugLine="Dialog.ButtonsTextColor = 0xFF89D5FF";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=113770512;
 //BA.debugLineNum = 113770512;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Gray";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=113770513;
 //BA.debugLineNum = 113770513;BA.debugLine="DateTemplate.SelectedColor = 0xFF0BA29B";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff0ba29b);
 break; }
case 1: {
RDebugUtils.currentLine=113770515;
 //BA.debugLineNum = 113770515;BA.debugLine="ItemsBackgroundColor = xui.Color_White";
__ref._itemsbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=113770516;
 //BA.debugLineNum = 113770516;BA.debugLine="SeparatorBackgroundColor = 0xFFD0D0D0";
__ref._separatorbackgroundcolor /*int*/  = ((int)0xffd0d0d0);
RDebugUtils.currentLine=113770517;
 //BA.debugLineNum = 113770517;BA.debugLine="SeparatorTextColor = 0xFF4E4F50";
__ref._separatortextcolor /*int*/  = ((int)0xff4e4f50);
RDebugUtils.currentLine=113770518;
 //BA.debugLineNum = 113770518;BA.debugLine="TextColor = 0xFF5B5B5B";
__ref._textcolor /*int*/  = ((int)0xff5b5b5b);
RDebugUtils.currentLine=113770519;
 //BA.debugLineNum = 113770519;BA.debugLine="DividerColor = 0xFFDFDFDF";
_dividercolor = ((int)0xffdfdfdf);
RDebugUtils.currentLine=113770520;
 //BA.debugLineNum = 113770520;BA.debugLine="Dialog.BackgroundColor = xui.Color_White";
__ref._dialog /*b4j.docU.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=113770521;
 //BA.debugLineNum = 113770521;BA.debugLine="Dialog.ButtonsColor = xui.Color_White";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=113770522;
 //BA.debugLineNum = 113770522;BA.debugLine="Dialog.BorderColor = xui.Color_Gray";
__ref._dialog /*b4j.docU.b4xdialog*/ ._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=113770523;
 //BA.debugLineNum = 113770523;BA.debugLine="Dialog.ButtonsTextColor = 0xFF007DC3";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonstextcolor /*int*/  = ((int)0xff007dc3);
RDebugUtils.currentLine=113770524;
 //BA.debugLineNum = 113770524;BA.debugLine="DateTemplate.DaysInWeekColor = xui.Color_Black";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=113770525;
 //BA.debugLineNum = 113770525;BA.debugLine="DateTemplate.SelectedColor = 0xFF39D7CE";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._selectedcolor /*int*/  = ((int)0xff39d7ce);
 break; }
}
;
RDebugUtils.currentLine=113770528;
 //BA.debugLineNum = 113770528;BA.debugLine="SearchTemplate.SearchField.TextField.TextColor =";
__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._searchfield /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=113770529;
 //BA.debugLineNum = 113770529;BA.debugLine="SearchTemplate.SearchField.NonFocusedHintColor =";
__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._searchfield /*b4j.docU.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=113770530;
 //BA.debugLineNum = 113770530;BA.debugLine="Dialog.BorderCornersRadius = 0";
__ref._dialog /*b4j.docU.b4xdialog*/ ._bordercornersradius /*int*/  = (int) (0);
RDebugUtils.currentLine=113770531;
 //BA.debugLineNum = 113770531;BA.debugLine="Dialog.BorderWidth = 1dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._borderwidth /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=113770532;
 //BA.debugLineNum = 113770532;BA.debugLine="DateTemplate.HighlightedColor = 0xFF00CEFF";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._highlightedcolor /*int*/  = ((int)0xff00ceff);
RDebugUtils.currentLine=113770533;
 //BA.debugLineNum = 113770533;BA.debugLine="DateTemplate.DaysInMonthColor = TextColor";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._daysinmonthcolor /*int*/  = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=113770534;
 //BA.debugLineNum = 113770534;BA.debugLine="DateTemplate.lblMonth.TextColor = TextColor";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=113770535;
 //BA.debugLineNum = 113770535;BA.debugLine="DateTemplate.lblYear.TextColor = TextColor";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=113770536;
 //BA.debugLineNum = 113770536;BA.debugLine="For Each clv As CustomListView In Array(CustomLi";
{
final Object[] group39 = new Object[]{(Object)(__ref._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._customlistview1 /*b4j.example.customlistview*/ ),(Object)(__ref._longtexttemplate /*b4j.docU.b4xlongtexttemplate*/ ._customlistview1 /*b4j.example.customlistview*/ )};
final int groupLen39 = group39.length
;int index39 = 0;
;
for (; index39 < groupLen39;index39++){
_clv = (b4j.example.customlistview)(group39[index39]);
RDebugUtils.currentLine=113770537;
 //BA.debugLineNum = 113770537;BA.debugLine="clv.sv.ScrollViewInnerPanel.Color = DividerColo";
_clv._sv.getScrollViewInnerPanel().setColor(_dividercolor);
RDebugUtils.currentLine=113770538;
 //BA.debugLineNum = 113770538;BA.debugLine="clv.sv.Color = Dialog.BackgroundColor";
_clv._sv.setColor(__ref._dialog /*b4j.docU.b4xdialog*/ ._backgroundcolor /*int*/ );
RDebugUtils.currentLine=113770539;
 //BA.debugLineNum = 113770539;BA.debugLine="clv.DefaultTextBackgroundColor = ItemsBackgroun";
_clv._defaulttextbackgroundcolor = __ref._itemsbackgroundcolor /*int*/ ;
RDebugUtils.currentLine=113770540;
 //BA.debugLineNum = 113770540;BA.debugLine="clv.DefaultTextColor = TextColor";
_clv._defaulttextcolor = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=113770542;
 //BA.debugLineNum = 113770542;BA.debugLine="Dim sv As Node = clv.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_clv._sv.getObject()));
RDebugUtils.currentLine=113770543;
 //BA.debugLineNum = 113770543;BA.debugLine="sv.StyleClasses.Clear";
_sv.getStyleClasses().Clear();
RDebugUtils.currentLine=113770544;
 //BA.debugLineNum = 113770544;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=113770545;
 //BA.debugLineNum = 113770545;BA.debugLine="If mTheme = THEME_LIGHT Then sv.StyleClasses.Ad";
if (__ref._mtheme /*int*/ ==__ref._theme_light /*int*/ ) { 
_sv.getStyleClasses().Add((Object)("b4xdialoglight"));};
 }
};
RDebugUtils.currentLine=113770548;
 //BA.debugLineNum = 113770548;BA.debugLine="For Each b As B4XView In Array(DateTemplate.btnM";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group49 = new Object[]{(Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen49 = group49.length
;int index49 = 0;
;
for (; index49 < groupLen49;index49++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group49[index49]));
RDebugUtils.currentLine=113770549;
 //BA.debugLineNum = 113770549;BA.debugLine="b.Color = xui.Color_Transparent";
_b.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=113770550;
 //BA.debugLineNum = 113770550;BA.debugLine="b.TextColor = TextColor";
_b.setTextColor(__ref._textcolor /*int*/ );
 }
};
 };
RDebugUtils.currentLine=113770557;
 //BA.debugLineNum = 113770557;BA.debugLine="End Sub";
return "";
}
public String  _keyboardheightchanged(b4j.docU.preferencesdialog __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "keyboardheightchanged", true))
	 {return ((String) Debug.delegate(ba, "keyboardheightchanged", new Object[] {_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4j.docU.b4xfloattextfield _f = null;
int _index = 0;
RDebugUtils.currentLine=112001024;
 //BA.debugLineNum = 112001024;BA.debugLine="Public Sub KeyboardHeightChanged (Height As Int)";
RDebugUtils.currentLine=112001025;
 //BA.debugLineNum = 112001025;BA.debugLine="If Dialog.Visible Then";
if (__ref._dialog /*b4j.docU.b4xdialog*/ ._getvisible /*boolean*/ (null)) { 
RDebugUtils.currentLine=112001033;
 //BA.debugLineNum = 112001033;BA.debugLine="CustomListView1.sv.Height = Min(CustomListView1.A";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setHeight(__c.Min(__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getHeight(),_height-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getTop()-__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getParent().getParent().getTop()));
RDebugUtils.currentLine=112001036;
 //BA.debugLineNum = 112001036;BA.debugLine="For Each v As B4XView In CustomListView1.AsView.";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=112001037;
 //BA.debugLineNum = 112001037;BA.debugLine="If v.Tag Is B4XFloatTextField Then";
if (_v.getTag() instanceof b4j.docU.b4xfloattextfield) { 
RDebugUtils.currentLine=112001038;
 //BA.debugLineNum = 112001038;BA.debugLine="Dim f As B4XFloatTextField = v.Tag";
_f = (b4j.docU.b4xfloattextfield)(_v.getTag());
RDebugUtils.currentLine=112001039;
 //BA.debugLineNum = 112001039;BA.debugLine="If f.Focused Then";
if (_f._focused /*boolean*/ ) { 
RDebugUtils.currentLine=112001040;
 //BA.debugLineNum = 112001040;BA.debugLine="Dim index As Int = CustomListView1.GetItemFro";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_f._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=112001041;
 //BA.debugLineNum = 112001041;BA.debugLine="CustomListView1.ScrollToItem(index)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._scrolltoitem(_index);
 };
 };
 }
};
 };
RDebugUtils.currentLine=112001046;
 //BA.debugLineNum = 112001046;BA.debugLine="End Sub";
return "";
}
public String  _lblcolors_mouseclicked(b4j.docU.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblcolors_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblcolors_mouseclicked", new Object[] {_eventdata}));}
b4j.docU.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=114425856;
 //BA.debugLineNum = 114425856;BA.debugLine="Private Sub lblColors_MouseClicked (EventData As M";
RDebugUtils.currentLine=114425857;
 //BA.debugLineNum = 114425857;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=114425861;
 //BA.debugLineNum = 114425861;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=114425862;
 //BA.debugLineNum = 114425862;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.docU.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=114425863;
 //BA.debugLineNum = 114425863;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=114425864;
 //BA.debugLineNum = 114425864;BA.debugLine="ColorTemplate.SelectedColor = CustomListView1.Get";
__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ ._setselectedcolor /*int*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getColor());
RDebugUtils.currentLine=114425865;
 //BA.debugLineNum = 114425865;BA.debugLine="Template = ColorTemplate";
__ref._template /*Object*/  = (Object)(__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ );
RDebugUtils.currentLine=114425866;
 //BA.debugLineNum = 114425866;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=114425867;
 //BA.debugLineNum = 114425867;BA.debugLine="End Sub";
return "";
}
public String  _lbldate_mouseclicked(b4j.docU.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbldate_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbldate_mouseclicked", new Object[] {_eventdata}));}
b4j.docU.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=114360320;
 //BA.debugLineNum = 114360320;BA.debugLine="Private Sub lblDate_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=114360321;
 //BA.debugLineNum = 114360321;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=114360325;
 //BA.debugLineNum = 114360325;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=114360326;
 //BA.debugLineNum = 114360326;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.docU.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=114360327;
 //BA.debugLineNum = 114360327;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=114360328;
 //BA.debugLineNum = 114360328;BA.debugLine="DateTemplate.Date = DateTime.DateParse(CustomList";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.DateParse(__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText()));
RDebugUtils.currentLine=114360329;
 //BA.debugLineNum = 114360329;BA.debugLine="Template = DateTemplate";
__ref._template /*Object*/  = (Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ );
RDebugUtils.currentLine=114360330;
 //BA.debugLineNum = 114360330;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=114360331;
 //BA.debugLineNum = 114360331;BA.debugLine="End Sub";
return "";
}
public String  _lblexplanation_mouseclicked(b4j.docU.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lblexplanation_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblexplanation_mouseclicked", new Object[] {_eventdata}));}
b4j.docU.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=114491392;
 //BA.debugLineNum = 114491392;BA.debugLine="Private Sub lblExplanation_MouseClicked (EventData";
RDebugUtils.currentLine=114491393;
 //BA.debugLineNum = 114491393;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=114491397;
 //BA.debugLineNum = 114491397;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=114491398;
 //BA.debugLineNum = 114491398;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.docU.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=114491399;
 //BA.debugLineNum = 114491399;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=114491400;
 //BA.debugLineNum = 114491400;BA.debugLine="LongTextTemplate.Text = pref.Extra.Get(\"text\")";
__ref._longtexttemplate /*b4j.docU.b4xlongtexttemplate*/ ._text /*Object*/  = _pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("text"));
RDebugUtils.currentLine=114491401;
 //BA.debugLineNum = 114491401;BA.debugLine="Template = LongTextTemplate";
__ref._template /*Object*/  = (Object)(__ref._longtexttemplate /*b4j.docU.b4xlongtexttemplate*/ );
RDebugUtils.currentLine=114491402;
 //BA.debugLineNum = 114491402;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=114491403;
 //BA.debugLineNum = 114491403;BA.debugLine="End Sub";
return "";
}
public String  _lbloptions_mouseclicked(b4j.docU.preferencesdialog __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "lbloptions_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lbloptions_mouseclicked", new Object[] {_eventdata}));}
b4j.docU.preferencesdialog._b4xprefitem _pref = null;
RDebugUtils.currentLine=114294784;
 //BA.debugLineNum = 114294784;BA.debugLine="Private Sub lblOptions_MouseClicked (EventData As";
RDebugUtils.currentLine=114294785;
 //BA.debugLineNum = 114294785;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=114294789;
 //BA.debugLineNum = 114294789;BA.debugLine="NestedDialogItemIndex = CustomListView1.GetItemFr";
__ref._nesteddialogitemindex /*int*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=114294790;
 //BA.debugLineNum = 114294790;BA.debugLine="Dim pref As B4XPrefItem = CustomListView1.GetValu";
_pref = (b4j.docU.preferencesdialog._b4xprefitem)(__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue(__ref._nesteddialogitemindex /*int*/ ));
RDebugUtils.currentLine=114294791;
 //BA.debugLineNum = 114294791;BA.debugLine="Dialog.Title = pref.Title";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = _pref.Title /*Object*/ ;
RDebugUtils.currentLine=114294792;
 //BA.debugLineNum = 114294792;BA.debugLine="If pref.Extra.ContainsKey(\"index\") Then";
if (_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("index"))) { 
RDebugUtils.currentLine=114294793;
 //BA.debugLineNum = 114294793;BA.debugLine="SearchTemplate.SetIndex(pref.Extra.Get(\"index\"))";
__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._setindex /*String*/ (null,_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("index")));
 }else {
RDebugUtils.currentLine=114294795;
 //BA.debugLineNum = 114294795;BA.debugLine="pref.Extra.Put(\"index\", SearchTemplate.SetItems(";
_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("index"),__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._setitems /*Object*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pref.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("options"))))));
 };
RDebugUtils.currentLine=114294797;
 //BA.debugLineNum = 114294797;BA.debugLine="SearchTemplate.SelectedItem = CustomListView1.Get";
__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._selecteditem /*String*/  = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1)).getText();
RDebugUtils.currentLine=114294798;
 //BA.debugLineNum = 114294798;BA.debugLine="Template = SearchTemplate";
__ref._template /*Object*/  = (Object)(__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ );
RDebugUtils.currentLine=114294799;
 //BA.debugLineNum = 114294799;BA.debugLine="Dialog.Close(RESULT_SHOWING_NESTED_DIALOG)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._result_showing_nested_dialog /*int*/ );
RDebugUtils.currentLine=114294800;
 //BA.debugLineNum = 114294800;BA.debugLine="End Sub";
return "";
}
public String  _loadfromjson(b4j.docU.preferencesdialog __ref,String _json) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "loadfromjson", true))
	 {return ((String) Debug.delegate(ba, "loadfromjson", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _p = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _theme = "";
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
String _key = "";
String _title = "";
boolean _required = false;
String _itemtype = "";
anywheresoftware.b4a.objects.collections.List _l = null;
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
String _text = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=112132096;
 //BA.debugLineNum = 112132096;BA.debugLine="Public Sub LoadFromJson (Json As String)";
RDebugUtils.currentLine=112132097;
 //BA.debugLineNum = 112132097;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=112132098;
 //BA.debugLineNum = 112132098;BA.debugLine="p.Initialize(Json)";
_p.Initialize(_json);
RDebugUtils.currentLine=112132099;
 //BA.debugLineNum = 112132099;BA.debugLine="Dim m As Map = p.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _p.NextObject();
RDebugUtils.currentLine=112132100;
 //BA.debugLineNum = 112132100;BA.debugLine="Dim theme As String = m.GetDefault(\"Theme\", \"Dark";
_theme = BA.ObjectToString(_m.GetDefault((Object)("Theme"),(Object)("Dark Theme")));
RDebugUtils.currentLine=112132101;
 //BA.debugLineNum = 112132101;BA.debugLine="Select theme";
switch (BA.switchObjectToInt(_theme,"Dark Theme","Light Theme")) {
case 0: {
RDebugUtils.currentLine=112132103;
 //BA.debugLineNum = 112132103;BA.debugLine="setTheme(THEME_DARK)";
__ref._settheme /*String*/ (null,__ref._theme_dark /*int*/ );
 break; }
case 1: {
RDebugUtils.currentLine=112132105;
 //BA.debugLineNum = 112132105;BA.debugLine="setTheme(THEME_LIGHT)";
__ref._settheme /*String*/ (null,__ref._theme_light /*int*/ );
 break; }
}
;
RDebugUtils.currentLine=112132107;
 //BA.debugLineNum = 112132107;BA.debugLine="Dim items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=112132108;
 //BA.debugLineNum = 112132108;BA.debugLine="For Each item As Map In items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group12 = _items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));
RDebugUtils.currentLine=112132109;
 //BA.debugLineNum = 112132109;BA.debugLine="Dim key As String = item.Get(\"key\")";
_key = BA.ObjectToString(_item.Get((Object)("key")));
RDebugUtils.currentLine=112132110;
 //BA.debugLineNum = 112132110;BA.debugLine="Dim title As String = item.Get(\"title\")";
_title = BA.ObjectToString(_item.Get((Object)("title")));
RDebugUtils.currentLine=112132111;
 //BA.debugLineNum = 112132111;BA.debugLine="Dim required As Boolean = item.Get(\"required\")";
_required = BA.ObjectToBoolean(_item.Get((Object)("required")));
RDebugUtils.currentLine=112132112;
 //BA.debugLineNum = 112132112;BA.debugLine="Dim itemType As String = item.Get(\"type\")";
_itemtype = BA.ObjectToString(_item.Get((Object)("type")));
RDebugUtils.currentLine=112132113;
 //BA.debugLineNum = 112132113;BA.debugLine="Select itemType";
switch (BA.switchObjectToInt(_itemtype,"Separator","Boolean","Text","Date","Short Options","Color","Number","Password","Options","Decimal Number","Multiline Text","Time","Numeric Range","Explanation")) {
case 0: {
RDebugUtils.currentLine=112132115;
 //BA.debugLineNum = 112132115;BA.debugLine="AddSeparator(title)";
__ref._addseparator /*String*/ (null,(Object)(_title));
 break; }
case 1: {
RDebugUtils.currentLine=112132117;
 //BA.debugLineNum = 112132117;BA.debugLine="AddBooleanItem(key, title)";
__ref._addbooleanitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 2: {
RDebugUtils.currentLine=112132119;
 //BA.debugLineNum = 112132119;BA.debugLine="AddTextItem(key, title)";
__ref._addtextitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 3: {
RDebugUtils.currentLine=112132121;
 //BA.debugLineNum = 112132121;BA.debugLine="AddDateItem(key, title)";
__ref._adddateitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 4: {
RDebugUtils.currentLine=112132123;
 //BA.debugLineNum = 112132123;BA.debugLine="AddShortOptionsItem(key, title, item.Get(\"opti";
__ref._addshortoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 5: {
RDebugUtils.currentLine=112132125;
 //BA.debugLineNum = 112132125;BA.debugLine="AddColorItem(key, title)";
__ref._addcoloritem /*String*/ (null,_key,(Object)(_title));
 break; }
case 6: {
RDebugUtils.currentLine=112132127;
 //BA.debugLineNum = 112132127;BA.debugLine="AddNumberItem(key, title)";
__ref._addnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 7: {
RDebugUtils.currentLine=112132129;
 //BA.debugLineNum = 112132129;BA.debugLine="AddPasswordItem(key, title)";
__ref._addpassworditem /*String*/ (null,_key,(Object)(_title));
 break; }
case 8: {
RDebugUtils.currentLine=112132131;
 //BA.debugLineNum = 112132131;BA.debugLine="AddOptionsItem(key, title, item.Get(\"options\")";
__ref._addoptionsitem /*String*/ (null,_key,(Object)(_title),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options")))));
 break; }
case 9: {
RDebugUtils.currentLine=112132133;
 //BA.debugLineNum = 112132133;BA.debugLine="AddDecimalNumberItem(key, title)";
__ref._adddecimalnumberitem /*String*/ (null,_key,(Object)(_title));
 break; }
case 10: {
RDebugUtils.currentLine=112132135;
 //BA.debugLineNum = 112132135;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=112132136;
 //BA.debugLineNum = 112132136;BA.debugLine="If l.IsInitialized = False Or l.Size = 0 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()==0 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False) { 
RDebugUtils.currentLine=112132137;
 //BA.debugLineNum = 112132137;BA.debugLine="AddMultilineTextItem(key, title, 100dip)";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int) (100)));
 }else {
RDebugUtils.currentLine=112132139;
 //BA.debugLineNum = 112132139;BA.debugLine="AddMultilineTextItem(key, title, DipToCurrent";
__ref._addmultilinetextitem /*String*/ (null,_key,(Object)(_title),__c.DipToCurrent((int)(BA.ObjectToNumber(_l.Get((int) (0))))));
 };
 break; }
case 11: {
RDebugUtils.currentLine=112132142;
 //BA.debugLineNum = 112132142;BA.debugLine="AddTimeItem(key, title)";
__ref._addtimeitem /*String*/ (null,_key,(Object)(_title));
RDebugUtils.currentLine=112132143;
 //BA.debugLineNum = 112132143;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=112132144;
 //BA.debugLineNum = 112132144;BA.debugLine="If l.IsInitialized And l.Size > 0 Then";
if (_l.IsInitialized() && _l.getSize()>0) { 
RDebugUtils.currentLine=112132145;
 //BA.debugLineNum = 112132145;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefIte";
_pi = (b4j.docU.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=112132146;
 //BA.debugLineNum = 112132146;BA.debugLine="pi.Extra.Put(\"24\", l.Get(0) = \"24\")";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("24"),(Object)((_l.Get((int) (0))).equals((Object)("24"))));
 };
 break; }
case 12: {
RDebugUtils.currentLine=112132150;
 //BA.debugLineNum = 112132150;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=112132151;
 //BA.debugLineNum = 112132151;BA.debugLine="If l.IsInitialized = False Or l.Size < 3 Or Is";
if (_l.IsInitialized()==__c.False || _l.getSize()<3 || __c.IsNumber(BA.ObjectToString(_l.Get((int) (0))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (1))))==__c.False || __c.IsNumber(BA.ObjectToString(_l.Get((int) (2))))==__c.False) { 
RDebugUtils.currentLine=112132152;
 //BA.debugLineNum = 112132152;BA.debugLine="AddNumericRangeItem(key, title, 0, 100, 1)";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),0,100,1);
 }else {
RDebugUtils.currentLine=112132154;
 //BA.debugLineNum = 112132154;BA.debugLine="AddNumericRangeItem(key, title, l.Get(0), l.G";
__ref._addnumericrangeitem /*String*/ (null,_key,(Object)(_title),(double)(BA.ObjectToNumber(_l.Get((int) (0)))),(double)(BA.ObjectToNumber(_l.Get((int) (1)))),(double)(BA.ObjectToNumber(_l.Get((int) (2)))));
 };
 break; }
case 13: {
RDebugUtils.currentLine=112132157;
 //BA.debugLineNum = 112132157;BA.debugLine="Dim l As List = item.Get(\"options\")";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_item.Get((Object)("options"))));
RDebugUtils.currentLine=112132158;
 //BA.debugLineNum = 112132158;BA.debugLine="Dim text As String";
_text = "";
RDebugUtils.currentLine=112132159;
 //BA.debugLineNum = 112132159;BA.debugLine="If l.IsInitialized Then";
if (_l.IsInitialized()) { 
RDebugUtils.currentLine=112132160;
 //BA.debugLineNum = 112132160;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=112132161;
 //BA.debugLineNum = 112132161;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=112132162;
 //BA.debugLineNum = 112132162;BA.debugLine="For i = 0 To l.Size - 1";
{
final int step65 = 1;
final int limit65 = (int) (_l.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit65 ;_i = _i + step65 ) {
RDebugUtils.currentLine=112132163;
 //BA.debugLineNum = 112132163;BA.debugLine="If i > 0 Then sb.Append(CRLF)";
if (_i>0) { 
_sb.Append(__c.CRLF);};
RDebugUtils.currentLine=112132164;
 //BA.debugLineNum = 112132164;BA.debugLine="sb.Append(l.Get(i))";
_sb.Append(BA.ObjectToString(_l.Get(_i)));
 }
};
RDebugUtils.currentLine=112132166;
 //BA.debugLineNum = 112132166;BA.debugLine="text = sb.ToString";
_text = _sb.ToString();
 };
RDebugUtils.currentLine=112132168;
 //BA.debugLineNum = 112132168;BA.debugLine="AddExplanationItem(key, title, text)";
__ref._addexplanationitem /*String*/ (null,_key,(Object)(_title),(Object)(_text));
 break; }
}
;
RDebugUtils.currentLine=112132170;
 //BA.debugLineNum = 112132170;BA.debugLine="Dim pi As B4XPrefItem = PrefItems.Get(PrefItems.";
_pi = (b4j.docU.preferencesdialog._b4xprefitem)(__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=112132171;
 //BA.debugLineNum = 112132171;BA.debugLine="pi.Required = required";
_pi.Required /*boolean*/  = _required;
 }
};
RDebugUtils.currentLine=112132173;
 //BA.debugLineNum = 112132173;BA.debugLine="End Sub";
return "";
}
public String  _raisebeforedialogdisplayed(b4j.docU.preferencesdialog __ref,Object _temp) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "raisebeforedialogdisplayed", true))
	 {return ((String) Debug.delegate(ba, "raisebeforedialogdisplayed", new Object[] {_temp}));}
RDebugUtils.currentLine=113246208;
 //BA.debugLineNum = 113246208;BA.debugLine="Private Sub RaiseBeforeDialogDisplayed (Temp As Ob";
RDebugUtils.currentLine=113246209;
 //BA.debugLineNum = 113246209;BA.debugLine="If mEventName <> \"\" And  xui.SubExists(mCallback,";
if ((__ref._meventname /*String*/ ).equals("") == false && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",(int) (1))) { 
RDebugUtils.currentLine=113246210;
 //BA.debugLineNum = 113246210;BA.debugLine="CallSub2(mCallback, mEventName & \"_BeforeDialogD";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeDialogDisplayed",_temp);
 };
RDebugUtils.currentLine=113246212;
 //BA.debugLineNum = 113246212;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitemwitherror(b4j.docU.preferencesdialog __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "scrolltoitemwitherror", true))
	 {return ((String) Debug.delegate(ba, "scrolltoitemwitherror", new Object[] {_key}));}
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
b4j.docU.preferencesdialog._b4xprefitem _prefitem = null;
RDebugUtils.currentLine=114098176;
 //BA.debugLineNum = 114098176;BA.debugLine="Public Sub ScrollToItemWithError (key As String)";
RDebugUtils.currentLine=114098177;
 //BA.debugLineNum = 114098177;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=114098178;
 //BA.debugLineNum = 114098178;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=114098179;
 //BA.debugLineNum = 114098179;BA.debugLine="Dim PrefItem As B4XPrefItem = Item.Value";
_prefitem = (b4j.docU.preferencesdialog._b4xprefitem)(_item.Value);
RDebugUtils.currentLine=114098180;
 //BA.debugLineNum = 114098180;BA.debugLine="If PrefItem.Key = key Then";
if ((_prefitem.Key /*String*/ ).equals(_key)) { 
RDebugUtils.currentLine=114098181;
 //BA.debugLineNum = 114098181;BA.debugLine="GoToItem(i)";
__ref._gotoitem /*void*/ (null,_i);
RDebugUtils.currentLine=114098182;
 //BA.debugLineNum = 114098182;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=114098185;
 //BA.debugLineNum = 114098185;BA.debugLine="End Sub";
return "";
}
public String  _seteventslistener(b4j.docU.preferencesdialog __ref,Object _callback,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "seteventslistener", true))
	 {return ((String) Debug.delegate(ba, "seteventslistener", new Object[] {_callback,_eventname}));}
RDebugUtils.currentLine=111804416;
 //BA.debugLineNum = 111804416;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
RDebugUtils.currentLine=111804417;
 //BA.debugLineNum = 111804417;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=111804418;
 //BA.debugLineNum = 111804418;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=111804419;
 //BA.debugLineNum = 111804419;BA.debugLine="End Sub";
return "";
}
public String  _setexplanation(b4j.docU.preferencesdialog __ref,String _key,Object _explanation) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setexplanation", true))
	 {return ((String) Debug.delegate(ba, "setexplanation", new Object[] {_key,_explanation}));}
RDebugUtils.currentLine=114688000;
 //BA.debugLineNum = 114688000;BA.debugLine="Public Sub SetExplanation (Key As String, Explanat";
RDebugUtils.currentLine=114688001;
 //BA.debugLineNum = 114688001;BA.debugLine="GetPrefItem(Key).Extra.Put(\"text\", Explanation)";
__ref._getprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_key).Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),_explanation);
RDebugUtils.currentLine=114688002;
 //BA.debugLineNum = 114688002;BA.debugLine="End Sub";
return "";
}
public String  _setoptions(b4j.docU.preferencesdialog __ref,String _key,anywheresoftware.b4a.objects.collections.List _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_key,_options}));}
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
RDebugUtils.currentLine=114622464;
 //BA.debugLineNum = 114622464;BA.debugLine="Public Sub SetOptions (Key As String, Options As L";
RDebugUtils.currentLine=114622465;
 //BA.debugLineNum = 114622465;BA.debugLine="Dim pi As B4XPrefItem = GetPrefItem(Key)";
_pi = __ref._getprefitem /*b4j.docU.preferencesdialog._b4xprefitem*/ (null,_key);
RDebugUtils.currentLine=114622466;
 //BA.debugLineNum = 114622466;BA.debugLine="If pi.Extra.IsInitialized = False Then";
if (_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=114622467;
 //BA.debugLineNum = 114622467;BA.debugLine="pi.Extra.Initialize";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=114622469;
 //BA.debugLineNum = 114622469;BA.debugLine="pi.Extra.Put(\"options\", Options)";
_pi.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("options"),(Object)(_options.getObject()));
RDebugUtils.currentLine=114622470;
 //BA.debugLineNum = 114622470;BA.debugLine="End Sub";
return "";
}
public String  _settitle(b4j.docU.preferencesdialog __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_o}));}
RDebugUtils.currentLine=111935488;
 //BA.debugLineNum = 111935488;BA.debugLine="Public Sub setTitle(o As Object)";
RDebugUtils.currentLine=111935489;
 //BA.debugLineNum = 111935489;BA.debugLine="mTitle = o";
__ref._mtitle /*Object*/  = _o;
RDebugUtils.currentLine=111935490;
 //BA.debugLineNum = 111935490;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.docU.preferencesdialog __ref,b4j.docU.b4xdialog _dialog1) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog1}));}
RDebugUtils.currentLine=113377280;
 //BA.debugLineNum = 113377280;BA.debugLine="Private Sub Show (Dialog1 As B4XDialog) 'ignore";
RDebugUtils.currentLine=113377282;
 //BA.debugLineNum = 113377282;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _showdialog(b4j.docU.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data,Object _yes,Object _cancel) throws Exception{
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "showdialog", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "showdialog", new Object[] {_data,_yes,_cancel}));}
ResumableSub_ShowDialog rsub = new ResumableSub_ShowDialog(this,__ref,_data,_yes,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowDialog extends BA.ResumableSub {
public ResumableSub_ShowDialog(b4j.docU.preferencesdialog parent,b4j.docU.preferencesdialog __ref,anywheresoftware.b4a.objects.collections.Map _data,Object _yes,Object _cancel) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this._yes = _yes;
this._cancel = _cancel;
this.__ref = parent;
}
b4j.docU.preferencesdialog __ref;
b4j.docU.preferencesdialog parent;
anywheresoftware.b4a.objects.collections.Map _data;
Object _yes;
Object _cancel;
b4j.docU.b4xfloattextfield _lasttextfield = null;
b4j.docU.preferencesdialog._b4xprefitem _pi = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.docU.b4xfloattextfield _tf = null;
int _scrollviewoffset = 0;
Object _rs = null;
int _result = 0;
Object _y = null;
Object _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
String _value = "";
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preferencesdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113180673;
 //BA.debugLineNum = 113180673;BA.debugLine="If CustomListView1.Size = 0 Then";
if (true) break;

case 1:
//if
this.state = 16;
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=113180674;
 //BA.debugLineNum = 113180674;BA.debugLine="Dim LastTextField As B4XFloatTextField";
_lasttextfield = new b4j.docU.b4xfloattextfield();
RDebugUtils.currentLine=113180675;
 //BA.debugLineNum = 113180675;BA.debugLine="For Each pi As B4XPrefItem In PrefItems";
if (true) break;

case 4:
//for
this.state = 15;
group3 = __ref._prefitems /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 55;
if (true) break;

case 55:
//C
this.state = 15;
if (index3 < groupLen3) {
this.state = 6;
_pi = (b4j.docU.preferencesdialog._b4xprefitem)(group3.Get(index3));}
if (true) break;

case 56:
//C
this.state = 55;
index3++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=113180676;
 //BA.debugLineNum = 113180676;BA.debugLine="Dim pnl As B4XView = CreateLayouts(pi)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createlayouts /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pi);
RDebugUtils.currentLine=113180677;
 //BA.debugLineNum = 113180677;BA.debugLine="CustomListView1.Add (pnl, pi)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_pnl,(Object)(_pi));
RDebugUtils.currentLine=113180678;
 //BA.debugLineNum = 113180678;BA.debugLine="If pnl.GetView(0).Tag Is B4XFloatTextField Then";
if (true) break;

case 7:
//if
this.state = 14;
if (_pnl.GetView((int) (0)).getTag() instanceof b4j.docU.b4xfloattextfield) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=113180679;
 //BA.debugLineNum = 113180679;BA.debugLine="Dim tf As B4XFloatTextField = pnl.GetView(0).T";
_tf = (b4j.docU.b4xfloattextfield)(_pnl.GetView((int) (0)).getTag());
RDebugUtils.currentLine=113180680;
 //BA.debugLineNum = 113180680;BA.debugLine="If LastTextField.IsInitialized Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_lasttextfield.IsInitialized /*boolean*/ ()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=113180681;
 //BA.debugLineNum = 113180681;BA.debugLine="LastTextField.NextField = tf";
_lasttextfield._setnextfield /*b4j.docU.b4xfloattextfield*/ (null,_tf);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=113180683;
 //BA.debugLineNum = 113180683;BA.debugLine="LastTextField = tf";
_lasttextfield = _tf;
 if (true) break;

case 14:
//C
this.state = 56;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=113180691;
 //BA.debugLineNum = 113180691;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVi";
__ref._dialog /*b4j.docU.b4xdialog*/ ._internaladdstubtoclvifneeded /*String*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=113180693;
 //BA.debugLineNum = 113180693;BA.debugLine="FillData (Data)";
__ref._filldata /*String*/ (null,_data);
RDebugUtils.currentLine=113180694;
 //BA.debugLineNum = 113180694;BA.debugLine="Dim ScrollViewOffset As Int 'ignore";
_scrollviewoffset = 0;
RDebugUtils.currentLine=113180695;
 //BA.debugLineNum = 113180695;BA.debugLine="Do While True";
if (true) break;

case 17:
//do while
this.state = 54;
while (parent.__c.True) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=113180696;
 //BA.debugLineNum = 113180696;BA.debugLine="Dialog.Title = mTitle";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=113180697;
 //BA.debugLineNum = 113180697;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=113180698;
 //BA.debugLineNum = 113180698;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Me, Yes,";
_rs = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent,_yes,(Object)(""),_cancel);
RDebugUtils.currentLine=113180706;
 //BA.debugLineNum = 113180706;BA.debugLine="RaiseBeforeDialogDisplayed(Me)";
__ref._raisebeforedialogdisplayed /*String*/ (null,parent);
RDebugUtils.currentLine=113180707;
 //BA.debugLineNum = 113180707;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 57;
return;
case 57:
//C
this.state = 20;
_result = (int) result[1];
;
RDebugUtils.currentLine=113180708;
 //BA.debugLineNum = 113180708;BA.debugLine="ScrollViewOffset = CustomListView1.sv.ScrollView";
_scrollviewoffset = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY());
RDebugUtils.currentLine=113180709;
 //BA.debugLineNum = 113180709;BA.debugLine="If Result <> RESULT_SHOWING_NESTED_DIALOG Then";
if (true) break;

case 20:
//if
this.state = 53;
if (_result!=__ref._result_showing_nested_dialog /*int*/ ) { 
this.state = 22;
}else {
this.state = 32;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=113180710;
 //BA.debugLineNum = 113180710;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 30;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=113180711;
 //BA.debugLineNum = 113180711;BA.debugLine="If CommitChanges(Data) = False Then";
if (true) break;

case 26:
//if
this.state = 29;
if (__ref._commitchanges /*boolean*/ (null,_data)==parent.__c.False) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=113180712;
 //BA.debugLineNum = 113180712;BA.debugLine="ScrollViewOffset = 0";
_scrollviewoffset = (int) (0);
RDebugUtils.currentLine=113180713;
 //BA.debugLineNum = 113180713;BA.debugLine="Continue";
this.state = 17;
if (true) break;;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 53;
;
RDebugUtils.currentLine=113180716;
 //BA.debugLineNum = 113180716;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=113180718;
 //BA.debugLineNum = 113180718;BA.debugLine="Dim y As Object";
_y = new Object();
RDebugUtils.currentLine=113180719;
 //BA.debugLineNum = 113180719;BA.debugLine="Dim c As Object = Cancel";
_c = _cancel;
RDebugUtils.currentLine=113180720;
 //BA.debugLineNum = 113180720;BA.debugLine="If Template = ColorTemplate Then";
if (true) break;

case 33:
//if
this.state = 40;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ ))) { 
this.state = 35;
}else 
{RDebugUtils.currentLine=113180722;
 //BA.debugLineNum = 113180722;BA.debugLine="Else If Template = LongTextTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._longtexttemplate /*b4j.docU.b4xlongtexttemplate*/ ))) { 
this.state = 37;
}else {
this.state = 39;
}}
if (true) break;

case 35:
//C
this.state = 40;
RDebugUtils.currentLine=113180721;
 //BA.debugLineNum = 113180721;BA.debugLine="y = Yes";
_y = _yes;
 if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=113180723;
 //BA.debugLineNum = 113180723;BA.debugLine="y = Yes";
_y = _yes;
RDebugUtils.currentLine=113180724;
 //BA.debugLineNum = 113180724;BA.debugLine="c = \"\"";
_c = (Object)("");
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=113180726;
 //BA.debugLineNum = 113180726;BA.debugLine="y = \"\"";
_y = (Object)("");
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=113180728;
 //BA.debugLineNum = 113180728;BA.debugLine="Dialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=113180729;
 //BA.debugLineNum = 113180729;BA.debugLine="Dim rs As Object = Dialog.ShowTemplate(Template";
_rs = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._template /*Object*/ ,_y,(Object)(""),_c);
RDebugUtils.currentLine=113180730;
 //BA.debugLineNum = 113180730;BA.debugLine="RaiseBeforeDialogDisplayed(Template)";
__ref._raisebeforedialogdisplayed /*String*/ (null,__ref._template /*Object*/ );
RDebugUtils.currentLine=113180731;
 //BA.debugLineNum = 113180731;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preferencesdialog", "showdialog"), _rs);
this.state = 58;
return;
case 58:
//C
this.state = 41;
_result = (int) result[1];
;
RDebugUtils.currentLine=113180732;
 //BA.debugLineNum = 113180732;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 41:
//if
this.state = 52;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=113180733;
 //BA.debugLineNum = 113180733;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(__ref._nesteddialogitemindex /*int*/ ).GetView((int) (1));
RDebugUtils.currentLine=113180734;
 //BA.debugLineNum = 113180734;BA.debugLine="Dim value As String";
_value = "";
RDebugUtils.currentLine=113180735;
 //BA.debugLineNum = 113180735;BA.debugLine="If Template = DateTemplate Then";
if (true) break;

case 44:
//if
this.state = 51;
if ((__ref._template /*Object*/ ).equals((Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ))) { 
this.state = 46;
}else 
{RDebugUtils.currentLine=113180738;
 //BA.debugLineNum = 113180738;BA.debugLine="Else if Template = SearchTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ))) { 
this.state = 48;
}else 
{RDebugUtils.currentLine=113180741;
 //BA.debugLineNum = 113180741;BA.debugLine="Else If Template = ColorTemplate Then";
if ((__ref._template /*Object*/ ).equals((Object)(__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ ))) { 
this.state = 50;
}}}
if (true) break;

case 46:
//C
this.state = 51;
RDebugUtils.currentLine=113180736;
 //BA.debugLineNum = 113180736;BA.debugLine="value = DateTime.Date(DateTemplate.Date)";
_value = parent.__c.DateTime.Date(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null));
RDebugUtils.currentLine=113180737;
 //BA.debugLineNum = 113180737;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=113180739;
 //BA.debugLineNum = 113180739;BA.debugLine="value = SearchTemplate.SelectedItem";
_value = __ref._searchtemplate /*b4j.docU.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=113180740;
 //BA.debugLineNum = 113180740;BA.debugLine="lbl.Text = value";
_lbl.setText(_value);
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=113180742;
 //BA.debugLineNum = 113180742;BA.debugLine="value = ColorTemplate.SelectedColor";
_value = BA.NumberToString(__ref._colortemplate /*b4j.docU.b4xcolortemplate*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=113180743;
 //BA.debugLineNum = 113180743;BA.debugLine="SetLabelColor(lbl, value)";
__ref._setlabelcolor /*String*/ (null,_lbl,(int)(Double.parseDouble(_value)));
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;

case 53:
//C
this.state = 17;
;
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=113180748;
 //BA.debugLineNum = 113180748;BA.debugLine="Return -1 'never happens";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(-1));return;};
RDebugUtils.currentLine=113180749;
 //BA.debugLineNum = 113180749;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tfcolorcode_enterpressed(b4j.docU.preferencesdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preferencesdialog";
if (Debug.shouldDelegate(ba, "tfcolorcode_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "tfcolorcode_enterpressed", null));}
b4j.docU.b4xfloattextfield _ft = null;
int[] _clr = null;
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=115015680;
 //BA.debugLineNum = 115015680;BA.debugLine="Private Sub tfColorCode_EnterPressed";
RDebugUtils.currentLine=115015681;
 //BA.debugLineNum = 115015681;BA.debugLine="Dim ft As B4XFloatTextField = Sender";
_ft = (b4j.docU.b4xfloattextfield)(__c.Sender(ba));
RDebugUtils.currentLine=115015682;
 //BA.debugLineNum = 115015682;BA.debugLine="Dim clr() As Int = HexToColor(ft.Text)";
_clr = __ref._hextocolor /*int[]*/ (null,_ft._gettext /*String*/ (null));
RDebugUtils.currentLine=115015683;
 //BA.debugLineNum = 115015683;BA.debugLine="Dim index As Int = CustomListView1.GetItemFromVie";
_index = __ref._customlistview1 /*b4j.example.customlistview*/ ._getitemfromview(_ft._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=115015684;
 //BA.debugLineNum = 115015684;BA.debugLine="Dim lbl As B4XView = CustomListView1.GetPanel(ind";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_index).GetView((int) (1));
RDebugUtils.currentLine=115015685;
 //BA.debugLineNum = 115015685;BA.debugLine="If clr.Length = 1 Then";
if (_clr.length==1) { 
RDebugUtils.currentLine=115015686;
 //BA.debugLineNum = 115015686;BA.debugLine="SetLabelColor(lbl, clr(0))";
__ref._setlabelcolor /*String*/ (null,_lbl,_clr[(int) (0)]);
 }else {
RDebugUtils.currentLine=115015688;
 //BA.debugLineNum = 115015688;BA.debugLine="ft.Text = ColorToHex(lbl.Color)";
_ft._settext /*String*/ (null,__ref._colortohex /*String*/ (null,_lbl.getColor()));
 };
RDebugUtils.currentLine=115015690;
 //BA.debugLineNum = 115015690;BA.debugLine="End Sub";
return "";
}
}