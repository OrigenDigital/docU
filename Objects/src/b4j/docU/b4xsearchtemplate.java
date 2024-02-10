package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xsearchtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xsearchtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xsearchtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public b4j.docU.b4xdialog _xdialog = null;
public b4j.docU.b4xfloattextfield _searchfield = null;
public anywheresoftware.b4a.objects.collections.Map _prefixlist = null;
public anywheresoftware.b4a.objects.collections.Map _substringlist = null;
public int _texthighlightcolor = 0;
public int _itemhightlightcolor = 0;
public int _max_limit = 0;
public int _maxnumberofitemstoshow = 0;
public anywheresoftware.b4a.objects.collections.List _itemscache = null;
public anywheresoftware.b4a.objects.collections.List _allitems = null;
public String _selecteditem = "";
public String _lastterm = "";
public boolean _allowunlistedtext = false;
public boolean _prefixonly = false;
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
public String  _initialize(b4j.docU.b4xsearchtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
int _height = 0;
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=244908032;
 //BA.debugLineNum = 244908032;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=244908033;
 //BA.debugLineNum = 244908033;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=244908035;
 //BA.debugLineNum = 244908035;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=244908036;
 //BA.debugLineNum = 244908036;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=244908037;
 //BA.debugLineNum = 244908037;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=244908038;
 //BA.debugLineNum = 244908038;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=244908039;
 //BA.debugLineNum = 244908039;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=244908040;
 //BA.debugLineNum = 244908040;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=244908041;
 //BA.debugLineNum = 244908041;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=244908042;
 //BA.debugLineNum = 244908042;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=244908044;
 //BA.debugLineNum = 244908044;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=244908045;
 //BA.debugLineNum = 244908045;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=244908046;
 //BA.debugLineNum = 244908046;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=244908048;
 //BA.debugLineNum = 244908048;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=244908049;
 //BA.debugLineNum = 244908049;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=244908052;
 //BA.debugLineNum = 244908052;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=244908053;
 //BA.debugLineNum = 244908053;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=244908054;
 //BA.debugLineNum = 244908054;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=244908060;
 //BA.debugLineNum = 244908060;BA.debugLine="End Sub";
return "";
}
public Object  _setitems(b4j.docU.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((Object) Debug.delegate(ba, "setitems", new Object[] {_items}));}
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _itemnotlower = "";
String _itemtolower = "";
int _start = 0;
int _count = 0;
String _str = "";
RDebugUtils.currentLine=245497856;
 //BA.debugLineNum = 245497856;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=245497857;
 //BA.debugLineNum = 245497857;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=245497858;
 //BA.debugLineNum = 245497858;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=245497859;
 //BA.debugLineNum = 245497859;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=245497860;
 //BA.debugLineNum = 245497860;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=245497861;
 //BA.debugLineNum = 245497861;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=245497862;
 //BA.debugLineNum = 245497862;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=245497863;
 //BA.debugLineNum = 245497863;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=245497864;
 //BA.debugLineNum = 245497864;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=245497865;
 //BA.debugLineNum = 245497865;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=245497866;
 //BA.debugLineNum = 245497866;BA.debugLine="Dim itemNotLower As String = Items.Get(i)";
_itemnotlower = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=245497867;
 //BA.debugLineNum = 245497867;BA.debugLine="Dim itemToLower As String = itemNotLower.ToLower";
_itemtolower = _itemnotlower.toLowerCase();
RDebugUtils.currentLine=245497868;
 //BA.debugLineNum = 245497868;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=245497869;
 //BA.debugLineNum = 245497869;BA.debugLine="For start = 0 To IIf(PrefixOnly, 0, itemToLower.";
{
final int step13 = 1;
final int limit13 = (int)(BA.ObjectToNumber(((__ref._prefixonly /*boolean*/ ) ? ((Object)(0)) : ((Object)(_itemtolower.length()-1)))));
_start = (int) (0) ;
for (;_start <= limit13 ;_start = _start + step13 ) {
RDebugUtils.currentLine=245497870;
 //BA.debugLineNum = 245497870;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=245497871;
 //BA.debugLineNum = 245497871;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_itemtolower.length()) {
RDebugUtils.currentLine=245497872;
 //BA.debugLineNum = 245497872;BA.debugLine="Dim str As String = itemToLower.SubString2(sta";
_str = _itemtolower.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=245497873;
 //BA.debugLineNum = 245497873;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=245497874;
 //BA.debugLineNum = 245497874;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=245497875;
 //BA.debugLineNum = 245497875;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=245497876;
 //BA.debugLineNum = 245497876;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=245497877;
 //BA.debugLineNum = 245497877;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=245497878;
 //BA.debugLineNum = 245497878;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=245497879;
 //BA.debugLineNum = 245497879;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=245497881;
 //BA.debugLineNum = 245497881;BA.debugLine="li.Add(itemNotLower)";
_li.Add((Object)(_itemnotlower));
 };
RDebugUtils.currentLine=245497883;
 //BA.debugLineNum = 245497883;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=245497887;
 //BA.debugLineNum = 245497887;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.LogImpl("9245497887","Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)",0);
RDebugUtils.currentLine=245497888;
 //BA.debugLineNum = 245497888;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=245497889;
 //BA.debugLineNum = 245497889;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=245497890;
 //BA.debugLineNum = 245497890;BA.debugLine="End Sub";
return null;
}
public String  _resize(b4j.docU.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
RDebugUtils.currentLine=244973568;
 //BA.debugLineNum = 244973568;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=244973569;
 //BA.debugLineNum = 244973569;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=244973570;
 //BA.debugLineNum = 244973570;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview();
RDebugUtils.currentLine=244973571;
 //BA.debugLineNum = 244973571;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),0,_c.getTop(),_width,_height-_c.getTop());
RDebugUtils.currentLine=244973572;
 //BA.debugLineNum = 244973572;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_c.getHeight());
RDebugUtils.currentLine=244973573;
 //BA.debugLineNum = 244973573;BA.debugLine="End Sub";
return "";
}
public String  _setindex(b4j.docU.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=245563392;
 //BA.debugLineNum = 245563392;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=245563393;
 //BA.debugLineNum = 245563393;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=245563394;
 //BA.debugLineNum = 245563394;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=245563395;
 //BA.debugLineNum = 245563395;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (0)]));
RDebugUtils.currentLine=245563396;
 //BA.debugLineNum = 245563396;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_obj[(int) (1)]));
RDebugUtils.currentLine=245563397;
 //BA.debugLineNum = 245563397;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=245563398;
 //BA.debugLineNum = 245563398;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.b4xsearchtemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=245039104;
 //BA.debugLineNum = 245039104;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=245039105;
 //BA.debugLineNum = 245039105;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=245039106;
 //BA.debugLineNum = 245039106;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.docU.b4xsearchtemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.b4xsearchtemplate parent,b4j.docU.b4xsearchtemplate __ref,b4j.docU.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.docU.b4xsearchtemplate __ref;
b4j.docU.b4xsearchtemplate parent;
b4j.docU.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=245104641;
 //BA.debugLineNum = 245104641;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4j.docU.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=245104642;
 //BA.debugLineNum = 245104642;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=245104643;
 //BA.debugLineNum = 245104643;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=245104644;
 //BA.debugLineNum = 245104644;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=245104645;
 //BA.debugLineNum = 245104645;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=245104646;
 //BA.debugLineNum = 245104646;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=245104647;
 //BA.debugLineNum = 245104647;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=245104648;
 //BA.debugLineNum = 245104648;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=245104649;
 //BA.debugLineNum = 245104649;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*b4j.docU.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=245104650;
 //BA.debugLineNum = 245104650;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=245104654;
 //BA.debugLineNum = 245104654;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4j.docU.b4xsearchtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=245628928;
 //BA.debugLineNum = 245628928;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=245628930;
 //BA.debugLineNum = 245628930;BA.debugLine="End Sub";
return "";
}
public String  _additemstolist(b4j.docU.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "additemstolist", true))
	 {return ((String) Debug.delegate(ba, "additemstolist", new Object[] {_li,_full}));}
b4j.docU.b4jtextflow _tf = null;
int _i = 0;
String _item = "";
int _x = 0;
int _pnlcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _textpane = null;
RDebugUtils.currentLine=245432320;
 //BA.debugLineNum = 245432320;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=245432321;
 //BA.debugLineNum = 245432321;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=245432323;
 //BA.debugLineNum = 245432323;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new b4j.docU.b4jtextflow();
RDebugUtils.currentLine=245432324;
 //BA.debugLineNum = 245432324;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=245432326;
 //BA.debugLineNum = 245432326;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=245432327;
 //BA.debugLineNum = 245432327;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=245432328;
 //BA.debugLineNum = 245432328;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=245432329;
 //BA.debugLineNum = 245432329;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=245432330;
 //BA.debugLineNum = 245432330;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=245432331;
 //BA.debugLineNum = 245432331;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=245432333;
 //BA.debugLineNum = 245432333;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=245432334;
 //BA.debugLineNum = 245432334;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()==0 && _full.length()>0 && __ref._allowunlistedtext /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=245432335;
 //BA.debugLineNum = 245432335;BA.debugLine="pnlColor = ItemHightlightColor";
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=245432337;
 //BA.debugLineNum = 245432337;BA.debugLine="pnlColor = CustomListView1.DefaultTextBackgroun";
_pnlcolor = __ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor;
 };
RDebugUtils.currentLine=245432358;
 //BA.debugLineNum = 245432358;BA.debugLine="tf.Reset";
_tf._reset /*b4j.docU.b4jtextflow*/ (null);
RDebugUtils.currentLine=245432359;
 //BA.debugLineNum = 245432359;BA.debugLine="If x > 0 Then";
if (_x>0) { 
RDebugUtils.currentLine=245432360;
 //BA.debugLineNum = 245432360;BA.debugLine="tf.Append(item.SubString2(0, x)).SetColor(Custo";
_tf._append /*b4j.docU.b4jtextflow*/ (null,_item.substring((int) (0),_x))._setcolor /*b4j.docU.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=245432362;
 //BA.debugLineNum = 245432362;BA.debugLine="If full.Length > 0 Then";
if (_full.length()>0) { 
RDebugUtils.currentLine=245432363;
 //BA.debugLineNum = 245432363;BA.debugLine="tf.Append(item.SubString2(x, x + full.Length)).";
_tf._append /*b4j.docU.b4jtextflow*/ (null,_item.substring(_x,(int) (_x+_full.length())))._setcolor /*b4j.docU.b4jtextflow*/ (null,__ref._texthighlightcolor /*int*/ );
 };
RDebugUtils.currentLine=245432365;
 //BA.debugLineNum = 245432365;BA.debugLine="If x + full.Length < item.Length Then";
if (_x+_full.length()<_item.length()) { 
RDebugUtils.currentLine=245432366;
 //BA.debugLineNum = 245432366;BA.debugLine="tf.Append(item.SubString(x + full.Length)).SetC";
_tf._append /*b4j.docU.b4jtextflow*/ (null,_item.substring((int) (_x+_full.length())))._setcolor /*b4j.docU.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=245432368;
 //BA.debugLineNum = 245432368;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=245432369;
 //BA.debugLineNum = 245432369;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=245432370;
 //BA.debugLineNum = 245432370;BA.debugLine="Dim TextPane As B4XView = tf.CreateTextFlow";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()));
RDebugUtils.currentLine=245432371;
 //BA.debugLineNum = 245432371;BA.debugLine="p.AddView(TextPane, 0, p.Height / 2 - 12, p.Widt";
_p.AddView((javafx.scene.Node)(_textpane.getObject()),0,_p.getHeight()/(double)2-12,_p.getWidth(),_p.getHeight()/(double)2);
RDebugUtils.currentLine=245432372;
 //BA.debugLineNum = 245432372;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=245432373;
 //BA.debugLineNum = 245432373;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_p,(Object)(_item));
 }
};
RDebugUtils.currentLine=245432376;
 //BA.debugLineNum = 245432376;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=245432377;
 //BA.debugLineNum = 245432377;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=245432378;
 //BA.debugLineNum = 245432378;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=245432379;
 //BA.debugLineNum = 245432379;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=245432380;
 //BA.debugLineNum = 245432380;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=245432383;
 //BA.debugLineNum = 245432383;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=244842496;
 //BA.debugLineNum = 244842496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=244842497;
 //BA.debugLineNum = 244842497;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=244842498;
 //BA.debugLineNum = 244842498;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=244842499;
 //BA.debugLineNum = 244842499;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=244842500;
 //BA.debugLineNum = 244842500;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=244842501;
 //BA.debugLineNum = 244842501;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4j.docU.b4xfloattextfield();
RDebugUtils.currentLine=244842502;
 //BA.debugLineNum = 244842502;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=244842503;
 //BA.debugLineNum = 244842503;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=244842504;
 //BA.debugLineNum = 244842504;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = ((int)0xfffd5c5c);
RDebugUtils.currentLine=244842505;
 //BA.debugLineNum = 244842505;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = ((int)0x7e008eff);
RDebugUtils.currentLine=244842506;
 //BA.debugLineNum = 244842506;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=244842507;
 //BA.debugLineNum = 244842507;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=244842508;
 //BA.debugLineNum = 244842508;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=244842509;
 //BA.debugLineNum = 244842509;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=244842510;
 //BA.debugLineNum = 244842510;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=244842511;
 //BA.debugLineNum = 244842511;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=244842515;
 //BA.debugLineNum = 244842515;BA.debugLine="Public AllowUnlistedText As Boolean";
_allowunlistedtext = false;
RDebugUtils.currentLine=244842516;
 //BA.debugLineNum = 244842516;BA.debugLine="Public PrefixOnly As Boolean";
_prefixonly = false;
RDebugUtils.currentLine=244842517;
 //BA.debugLineNum = 244842517;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4j.docU.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=245366784;
 //BA.debugLineNum = 245366784;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=245366785;
 //BA.debugLineNum = 245366785;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=245366786;
 //BA.debugLineNum = 245366786;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=245366787;
 //BA.debugLineNum = 245366787;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=245366788;
 //BA.debugLineNum = 245366788;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(b4j.docU.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=245301248;
 //BA.debugLineNum = 245301248;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=245301249;
 //BA.debugLineNum = 245301249;BA.debugLine="If AllowUnlistedText Then";
if (__ref._allowunlistedtext /*boolean*/ ) { 
RDebugUtils.currentLine=245301250;
 //BA.debugLineNum = 245301250;BA.debugLine="SelectedItem = LastTerm";
__ref._selecteditem /*String*/  = __ref._lastterm /*String*/ ;
RDebugUtils.currentLine=245301251;
 //BA.debugLineNum = 245301251;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 }else 
{RDebugUtils.currentLine=245301252;
 //BA.debugLineNum = 245301252;BA.debugLine="Else If CustomListView1.Size > 0 And LastTerm.Len";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=245301253;
 //BA.debugLineNum = 245301253;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue((int) (0)));
 }}
;
RDebugUtils.currentLine=245301255;
 //BA.debugLineNum = 245301255;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(b4j.docU.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=245170176;
 //BA.debugLineNum = 245170176;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=245170177;
 //BA.debugLineNum = 245170177;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=245170178;
 //BA.debugLineNum = 245170178;BA.debugLine="End Sub";
return "";
}
public String  _update(b4j.docU.b4xsearchtemplate __ref,String _term,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_term,_force}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=245235712;
 //BA.debugLineNum = 245235712;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=245235713;
 //BA.debugLineNum = 245235713;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=245235714;
 //BA.debugLineNum = 245235714;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=245235715;
 //BA.debugLineNum = 245235715;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=245235716;
 //BA.debugLineNum = 245235716;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=245235717;
 //BA.debugLineNum = 245235717;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=245235718;
 //BA.debugLineNum = 245235718;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=245235719;
 //BA.debugLineNum = 245235719;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=245235722;
 //BA.debugLineNum = 245235722;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=245235724;
 //BA.debugLineNum = 245235724;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=245235725;
 //BA.debugLineNum = 245235725;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=245235726;
 //BA.debugLineNum = 245235726;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=245235727;
 //BA.debugLineNum = 245235727;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=245235729;
 //BA.debugLineNum = 245235729;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=245235730;
 //BA.debugLineNum = 245235730;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=245235732;
 //BA.debugLineNum = 245235732;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=245235734;
 //BA.debugLineNum = 245235734;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=245235735;
 //BA.debugLineNum = 245235735;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=245235737;
 //BA.debugLineNum = 245235737;BA.debugLine="End Sub";
return "";
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}