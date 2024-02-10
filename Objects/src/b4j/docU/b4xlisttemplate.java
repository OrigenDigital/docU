package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xlisttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4xlisttemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4xlisttemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _options = null;
public String _selecteditem = "";
public b4j.docU.b4xdialog _xdialog = null;
public boolean _allowmultiselection = false;
public int _selectioncolor = 0;
public anywheresoftware.b4a.objects.collections.List _selecteditems = null;
public int _multiselectionminimum = 0;
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
public String  _initialize(b4j.docU.b4xlisttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _sv = null;
RDebugUtils.currentLine=240844800;
 //BA.debugLineNum = 240844800;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=240844801;
 //BA.debugLineNum = 240844801;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=240844802;
 //BA.debugLineNum = 240844802;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=240844803;
 //BA.debugLineNum = 240844803;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("ListTemplate",ba);
RDebugUtils.currentLine=240844804;
 //BA.debugLineNum = 240844804;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=240844805;
 //BA.debugLineNum = 240844805;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=240844806;
 //BA.debugLineNum = 240844806;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff555555);
RDebugUtils.currentLine=240844807;
 //BA.debugLineNum = 240844807;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=240844809;
 //BA.debugLineNum = 240844809;BA.debugLine="Dim sv As Node = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=240844810;
 //BA.debugLineNum = 240844810;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=240844812;
 //BA.debugLineNum = 240844812;BA.debugLine="Options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=240844813;
 //BA.debugLineNum = 240844813;BA.debugLine="SelectedItems.Initialize";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=240844814;
 //BA.debugLineNum = 240844814;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.docU.b4xlisttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=240910336;
 //BA.debugLineNum = 240910336;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=240910337;
 //BA.debugLineNum = 240910337;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=240910338;
 //BA.debugLineNum = 240910338;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=240910339;
 //BA.debugLineNum = 240910339;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.b4xlisttemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=240975872;
 //BA.debugLineNum = 240975872;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=240975873;
 //BA.debugLineNum = 240975873;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=240975874;
 //BA.debugLineNum = 240975874;BA.debugLine="End Sub";
return null;
}
public void  _show(b4j.docU.b4xlisttemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.b4xlisttemplate parent,b4j.docU.b4xlisttemplate __ref,b4j.docU.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4j.docU.b4xlisttemplate __ref;
b4j.docU.b4xlisttemplate parent;
b4j.docU.b4xdialog _dialog;
Object _opt = null;
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xlisttemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=241041409;
 //BA.debugLineNum = 241041409;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4j.docU.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=241041410;
 //BA.debugLineNum = 241041410;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=241041411;
 //BA.debugLineNum = 241041411;BA.debugLine="For Each opt As Object In Options";
if (true) break;

case 1:
//for
this.state = 4;
group3 = __ref._options /*anywheresoftware.b4a.objects.collections.List*/ ;
index3 = 0;
groupLen3 = group3.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_opt = group3.Get(index3);}
if (true) break;

case 13:
//C
this.state = 12;
index3++;
if (true) break;

case 3:
//C
this.state = 13;
RDebugUtils.currentLine=241041412;
 //BA.debugLineNum = 241041412;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._addtextitem(_opt,_opt);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=241041414;
 //BA.debugLineNum = 241041414;BA.debugLine="If AllowMultiSelection Then";

case 4:
//if
this.state = 11;
if (__ref._allowmultiselection /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=241041415;
 //BA.debugLineNum = 241041415;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xlisttemplate", "show"),(int) (20));
this.state = 14;
return;
case 14:
//C
this.state = 7;
;
RDebugUtils.currentLine=241041416;
 //BA.debugLineNum = 241041416;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
if (true) break;

case 7:
//for
this.state = 10;
step8 = 1;
limit8 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=241041417;
 //BA.debugLineNum = 241041417;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=241041418;
 //BA.debugLineNum = 241041418;BA.debugLine="SelectItem (item, False)";
__ref._selectitem /*String*/ (null,_item,parent.__c.False);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=241041421;
 //BA.debugLineNum = 241041421;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
parent._xuiviewsutils._addstubtoclvifneeded /*String*/ (__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);
RDebugUtils.currentLine=241041422;
 //BA.debugLineNum = 241041422;BA.debugLine="SelectedItem = \"\"";
__ref._selecteditem /*String*/  = "";
RDebugUtils.currentLine=241041424;
 //BA.debugLineNum = 241041424;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(b4j.docU.b4xlisttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=241238016;
 //BA.debugLineNum = 241238016;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=241238018;
 //BA.debugLineNum = 241238018;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.b4xlisttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
RDebugUtils.currentLine=240779264;
 //BA.debugLineNum = 240779264;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=240779265;
 //BA.debugLineNum = 240779265;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=240779266;
 //BA.debugLineNum = 240779266;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=240779267;
 //BA.debugLineNum = 240779267;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=240779268;
 //BA.debugLineNum = 240779268;BA.debugLine="Public Options As List";
_options = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=240779269;
 //BA.debugLineNum = 240779269;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=240779270;
 //BA.debugLineNum = 240779270;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=240779271;
 //BA.debugLineNum = 240779271;BA.debugLine="Public AllowMultiSelection As Boolean";
_allowmultiselection = false;
RDebugUtils.currentLine=240779272;
 //BA.debugLineNum = 240779272;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
_selectioncolor = ((int)0xaa0086ff);
RDebugUtils.currentLine=240779273;
 //BA.debugLineNum = 240779273;BA.debugLine="Public SelectedItems As List";
_selecteditems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=240779274;
 //BA.debugLineNum = 240779274;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
_multiselectionminimum = (int) (0);
RDebugUtils.currentLine=240779275;
 //BA.debugLineNum = 240779275;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4j.docU.b4xlisttemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
b4j.example.customlistview._clvitem _item = null;
RDebugUtils.currentLine=241172480;
 //BA.debugLineNum = 241172480;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=241172481;
 //BA.debugLineNum = 241172481;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=241172482;
 //BA.debugLineNum = 241172482;BA.debugLine="If AllowMultiSelection Then";
if (__ref._allowmultiselection /*boolean*/ ) { 
RDebugUtils.currentLine=241172483;
 //BA.debugLineNum = 241172483;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=241172484;
 //BA.debugLineNum = 241172484;BA.debugLine="SelectItem (Item, True)";
__ref._selectitem /*String*/ (null,_item,__c.True);
 }else {
RDebugUtils.currentLine=241172486;
 //BA.debugLineNum = 241172486;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=241172487;
 //BA.debugLineNum = 241172487;BA.debugLine="SelectedItems.Clear";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=241172488;
 //BA.debugLineNum = 241172488;BA.debugLine="SelectedItems.Add(Value)";
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_value);
RDebugUtils.currentLine=241172489;
 //BA.debugLineNum = 241172489;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
 };
RDebugUtils.currentLine=241172491;
 //BA.debugLineNum = 241172491;BA.debugLine="End Sub";
return "";
}
public String  _selectitem(b4j.docU.b4xlisttemplate __ref,b4j.example.customlistview._clvitem _item,boolean _toggle) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xlisttemplate";
if (Debug.shouldDelegate(ba, "selectitem", true))
	 {return ((String) Debug.delegate(ba, "selectitem", new Object[] {_item,_toggle}));}
int _index = 0;
boolean _selected = false;
RDebugUtils.currentLine=241106944;
 //BA.debugLineNum = 241106944;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
RDebugUtils.currentLine=241106945;
 //BA.debugLineNum = 241106945;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
_index = __ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_item.Value);
RDebugUtils.currentLine=241106946;
 //BA.debugLineNum = 241106946;BA.debugLine="Dim Selected As Boolean = index > -1";
_selected = _index>-1;
RDebugUtils.currentLine=241106947;
 //BA.debugLineNum = 241106947;BA.debugLine="If Toggle Then Selected = Not(Selected)";
if (_toggle) { 
_selected = __c.Not(_selected);};
RDebugUtils.currentLine=241106948;
 //BA.debugLineNum = 241106948;BA.debugLine="If Selected Then";
if (_selected) { 
RDebugUtils.currentLine=241106949;
 //BA.debugLineNum = 241106949;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._selectioncolor /*int*/ );};
RDebugUtils.currentLine=241106950;
 //BA.debugLineNum = 241106950;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
_item.Color = __ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor;
RDebugUtils.currentLine=241106951;
 //BA.debugLineNum = 241106951;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
if (_index==-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item.Value);};
 }else {
RDebugUtils.currentLine=241106953;
 //BA.debugLineNum = 241106953;BA.debugLine="Item.Color = SelectionColor";
_item.Color = __ref._selectioncolor /*int*/ ;
RDebugUtils.currentLine=241106954;
 //BA.debugLineNum = 241106954;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
if (__c.Not(_toggle)) { 
_item.Panel.setColor(__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor);};
RDebugUtils.currentLine=241106955;
 //BA.debugLineNum = 241106955;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
if (_index>-1) { 
__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);};
 };
RDebugUtils.currentLine=241106957;
 //BA.debugLineNum = 241106957;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
__ref._xdialog /*b4j.docU.b4xdialog*/ ._setbuttonstate /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._selecteditems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._multiselectionminimum /*int*/ );
RDebugUtils.currentLine=241106958;
 //BA.debugLineNum = 241106958;BA.debugLine="End Sub";
return "";
}
}