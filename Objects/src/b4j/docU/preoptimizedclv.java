package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class preoptimizedclv extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.preoptimizedclv", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.preoptimizedclv.class).invoke(this, new Object[] {null});
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
public b4j.example.customlistview _mclv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.List _panelscache = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _stubpanel = null;
public boolean _horizontal = false;
public b4j.docU.b4xset[] _assigneditems = null;
public int _assigneditemsasindex = 0;
public anywheresoftware.b4j.object.JavaObject _jclv = null;
public int _extraitems = 0;
public anywheresoftware.b4a.objects.collections.List _listofitemsthatshouldbeupdated = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public boolean _showscrollbar = false;
public b4j.docU.b4xseekbar _b4xseekbar1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnloverlay = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblhint = null;
public int _lastuserchangeindex = 0;
public int _numberofsteps = 0;
public int _delaybeforehidingoverlay = 0;
public Object _mcallback = null;
public String _meventname = "";
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
public String  _additem(b4j.docU.preoptimizedclv __ref,int _size,int _clr,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_size,_clr,_value}));}
b4j.example.customlistview._clvitem _newitem = null;
RDebugUtils.currentLine=212992000;
 //BA.debugLineNum = 212992000;BA.debugLine="Public Sub AddItem (Size As Int, Clr As Int, Value";
RDebugUtils.currentLine=212992001;
 //BA.debugLineNum = 212992001;BA.debugLine="Dim NewItem As CLVItem";
_newitem = new b4j.example.customlistview._clvitem();
RDebugUtils.currentLine=212992002;
 //BA.debugLineNum = 212992002;BA.debugLine="NewItem.Color = Clr";
_newitem.Color = _clr;
RDebugUtils.currentLine=212992003;
 //BA.debugLineNum = 212992003;BA.debugLine="NewItem.Panel = StubPanel";
_newitem.Panel = __ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=212992004;
 //BA.debugLineNum = 212992004;BA.debugLine="NewItem.Value = Value";
_newitem.Value = _value;
RDebugUtils.currentLine=212992005;
 //BA.debugLineNum = 212992005;BA.debugLine="NewItem.Size = Size";
_newitem.Size = _size;
RDebugUtils.currentLine=212992006;
 //BA.debugLineNum = 212992006;BA.debugLine="items.Add(NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newitem));
RDebugUtils.currentLine=212992007;
 //BA.debugLineNum = 212992007;BA.debugLine="End Sub";
return "";
}
public String  _commit(b4j.docU.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "commit", true))
	 {return ((String) Debug.delegate(ba, "commit", null));}
int _dividersize = 0;
int _totalsize = 0;
int _i = 0;
b4j.example.customlistview._clvitem _it = null;
RDebugUtils.currentLine=213057536;
 //BA.debugLineNum = 213057536;BA.debugLine="Public Sub Commit";
RDebugUtils.currentLine=213057537;
 //BA.debugLineNum = 213057537;BA.debugLine="ClearAssignedItems";
__ref._clearassigneditems /*String*/ (null);
RDebugUtils.currentLine=213057538;
 //BA.debugLineNum = 213057538;BA.debugLine="Dim DividerSize As Int = mCLV.DividerSize";
_dividersize = (int) (__ref._mclv /*b4j.example.customlistview*/ ._getdividersize());
RDebugUtils.currentLine=213057539;
 //BA.debugLineNum = 213057539;BA.debugLine="Dim TotalSize As Int = DividerSize";
_totalsize = _dividersize;
RDebugUtils.currentLine=213057540;
 //BA.debugLineNum = 213057540;BA.debugLine="For i = 0 To items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=213057541;
 //BA.debugLineNum = 213057541;BA.debugLine="Dim it As CLVItem = items.Get(i)";
_it = (b4j.example.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=213057542;
 //BA.debugLineNum = 213057542;BA.debugLine="it.Offset = TotalSize";
_it.Offset = _totalsize;
RDebugUtils.currentLine=213057543;
 //BA.debugLineNum = 213057543;BA.debugLine="TotalSize = TotalSize + it.Size + DividerSize";
_totalsize = (int) (_totalsize+_it.Size+_dividersize);
 }
};
RDebugUtils.currentLine=213057545;
 //BA.debugLineNum = 213057545;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=213057546;
 //BA.debugLineNum = 213057546;BA.debugLine="mCLV.sv.ScrollViewContentWidth = TotalSize";
__ref._mclv /*b4j.example.customlistview*/ ._sv.setScrollViewContentWidth(_totalsize);
 }else {
RDebugUtils.currentLine=213057548;
 //BA.debugLineNum = 213057548;BA.debugLine="mCLV.sv.ScrollViewContentHeight = TotalSize";
__ref._mclv /*b4j.example.customlistview*/ ._sv.setScrollViewContentHeight(_totalsize);
 };
RDebugUtils.currentLine=213057550;
 //BA.debugLineNum = 213057550;BA.debugLine="B4XSeekBar1.mBase.Visible = ShowScrollBar";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._showscrollbar /*boolean*/ );
RDebugUtils.currentLine=213057551;
 //BA.debugLineNum = 213057551;BA.debugLine="If ShowScrollBar Then";
if (__ref._showscrollbar /*boolean*/ ) { 
RDebugUtils.currentLine=213057552;
 //BA.debugLineNum = 213057552;BA.debugLine="B4XSeekBar1.MaxValue = items.Size";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._maxvalue /*int*/  = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=213057553;
 //BA.debugLineNum = 213057553;BA.debugLine="B4XSeekBar1.Interval = items.Size / NumberOfStep";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._interval /*int*/  = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)__ref._numberofsteps /*int*/ );
 };
RDebugUtils.currentLine=213057555;
 //BA.debugLineNum = 213057555;BA.debugLine="RaiseVisibleRangeEvent";
__ref._raisevisiblerangeevent /*String*/ (null);
RDebugUtils.currentLine=213057557;
 //BA.debugLineNum = 213057557;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _visiblerangechanged(b4j.docU.preoptimizedclv __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "visiblerangechanged", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _fromindex = 0;
int _toindex = 0;
b4j.docU.b4xset _prevset = null;
b4j.docU.b4xset _nextset = null;
int _i = 0;
b4j.example.customlistview._clvitem _it = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=213254144;
 //BA.debugLineNum = 213254144;BA.debugLine="Public Sub VisibleRangeChanged (FirstIndex As Int,";
RDebugUtils.currentLine=213254145;
 //BA.debugLineNum = 213254145;BA.debugLine="Dim FromIndex As Int = Max(0, FirstIndex - ExtraI";
_fromindex = (int) (__c.Max(0,_firstindex-__ref._extraitems /*int*/ ));
RDebugUtils.currentLine=213254146;
 //BA.debugLineNum = 213254146;BA.debugLine="Dim ToIndex As Int = Min(mCLV.Size - 1, LastIndex";
_toindex = (int) (__c.Min(__ref._mclv /*b4j.example.customlistview*/ ._getsize()-1,_lastindex+__ref._extraitems /*int*/ ));
RDebugUtils.currentLine=213254147;
 //BA.debugLineNum = 213254147;BA.debugLine="Dim PrevSet As B4XSet = AssignedItems(AssignedIte";
_prevset = __ref._assigneditems /*b4j.docU.b4xset[]*/ [__ref._assigneditemsasindex /*int*/ ];
RDebugUtils.currentLine=213254148;
 //BA.debugLineNum = 213254148;BA.debugLine="AssignedItemsAsIndex = (AssignedItemsAsIndex + 1)";
__ref._assigneditemsasindex /*int*/  = (int) ((__ref._assigneditemsasindex /*int*/ +1)%2);
RDebugUtils.currentLine=213254149;
 //BA.debugLineNum = 213254149;BA.debugLine="Dim NextSet As B4XSet = AssignedItems(AssignedIte";
_nextset = __ref._assigneditems /*b4j.docU.b4xset[]*/ [__ref._assigneditemsasindex /*int*/ ];
RDebugUtils.currentLine=213254150;
 //BA.debugLineNum = 213254150;BA.debugLine="NextSet.Clear";
_nextset._clear /*String*/ (null);
RDebugUtils.currentLine=213254151;
 //BA.debugLineNum = 213254151;BA.debugLine="ListOfItemsThatShouldBeUpdated.Initialize";
__ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=213254152;
 //BA.debugLineNum = 213254152;BA.debugLine="For i = FromIndex To ToIndex";
{
final int step8 = 1;
final int limit8 = _toindex;
_i = _fromindex ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=213254153;
 //BA.debugLineNum = 213254153;BA.debugLine="Dim it As CLVItem = items.Get(i)";
_it = (b4j.example.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=213254154;
 //BA.debugLineNum = 213254154;BA.debugLine="If it.Panel = StubPanel Then";
if ((_it.Panel).equals(__ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
RDebugUtils.currentLine=213254155;
 //BA.debugLineNum = 213254155;BA.debugLine="it.Panel = GetPanel";
_it.Panel = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=213254156;
 //BA.debugLineNum = 213254156;BA.debugLine="it.Panel.Tag = i";
_it.Panel.setTag((Object)(_i));
RDebugUtils.currentLine=213254157;
 //BA.debugLineNum = 213254157;BA.debugLine="it.Panel.Color = it.Color";
_it.Panel.setColor(_it.Color);
RDebugUtils.currentLine=213254158;
 //BA.debugLineNum = 213254158;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=213254159;
 //BA.debugLineNum = 213254159;BA.debugLine="mCLV.sv.ScrollViewInnerPanel.AddView(it.Panel,";
__ref._mclv /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().AddView((javafx.scene.Node)(_it.Panel.getObject()),_it.Offset,0,_it.Size,__ref._mclv /*b4j.example.customlistview*/ ._sv.getHeight());
 }else {
RDebugUtils.currentLine=213254161;
 //BA.debugLineNum = 213254161;BA.debugLine="mCLV.sv.ScrollViewInnerPanel.AddView(it.Panel,";
__ref._mclv /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().AddView((javafx.scene.Node)(_it.Panel.getObject()),0,_it.Offset,__ref._mclv /*b4j.example.customlistview*/ ._sv.getWidth(),_it.Size);
 };
RDebugUtils.currentLine=213254163;
 //BA.debugLineNum = 213254163;BA.debugLine="NextSet.Add(it.Panel)";
_nextset._add /*String*/ (null,(Object)(_it.Panel.getObject()));
RDebugUtils.currentLine=213254164;
 //BA.debugLineNum = 213254164;BA.debugLine="ListOfItemsThatShouldBeUpdated.Add(i)";
__ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i));
 }else 
{RDebugUtils.currentLine=213254165;
 //BA.debugLineNum = 213254165;BA.debugLine="Else if PrevSet.Contains(it.Panel) Then";
if (_prevset._contains /*boolean*/ (null,(Object)(_it.Panel.getObject()))) { 
RDebugUtils.currentLine=213254166;
 //BA.debugLineNum = 213254166;BA.debugLine="NextSet.Add(it.Panel)";
_nextset._add /*String*/ (null,(Object)(_it.Panel.getObject()));
 }}
;
 }
};
RDebugUtils.currentLine=213254169;
 //BA.debugLineNum = 213254169;BA.debugLine="For Each pnl As B4XView In PrevSet.AsList";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group25 = _prevset._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group25.Get(index25)));
RDebugUtils.currentLine=213254170;
 //BA.debugLineNum = 213254170;BA.debugLine="If NextSet.Contains(pnl) = False Then";
if (_nextset._contains /*boolean*/ (null,(Object)(_pnl.getObject()))==__c.False) { 
RDebugUtils.currentLine=213254171;
 //BA.debugLineNum = 213254171;BA.debugLine="If pnl.Parent.IsInitialized Then";
if (_pnl.getParent().IsInitialized()) { 
RDebugUtils.currentLine=213254172;
 //BA.debugLineNum = 213254172;BA.debugLine="pnl.RemoveViewFromParent";
_pnl.RemoveViewFromParent();
RDebugUtils.currentLine=213254173;
 //BA.debugLineNum = 213254173;BA.debugLine="pnl.GetView(0).RemoveAllViews";
_pnl.GetView((int) (0)).RemoveAllViews();
RDebugUtils.currentLine=213254174;
 //BA.debugLineNum = 213254174;BA.debugLine="pnl.RemoveAllViews";
_pnl.RemoveAllViews();
RDebugUtils.currentLine=213254175;
 //BA.debugLineNum = 213254175;BA.debugLine="PanelsCache.Add(pnl)";
__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_pnl.getObject()));
RDebugUtils.currentLine=213254176;
 //BA.debugLineNum = 213254176;BA.debugLine="Dim it As CLVItem = items.Get(pnl.Tag)";
_it = (b4j.example.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(_pnl.getTag()))));
RDebugUtils.currentLine=213254177;
 //BA.debugLineNum = 213254177;BA.debugLine="it.Panel = StubPanel";
_it.Panel = __ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 };
 };
 }
};
RDebugUtils.currentLine=213254181;
 //BA.debugLineNum = 213254181;BA.debugLine="HandleScrollBar (FirstIndex)";
__ref._handlescrollbar /*String*/ (null,_firstindex);
RDebugUtils.currentLine=213254182;
 //BA.debugLineNum = 213254182;BA.debugLine="Return ListOfItemsThatShouldBeUpdated";
if (true) return __ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=213254183;
 //BA.debugLineNum = 213254183;BA.debugLine="End Sub";
return null;
}
public void  _listchangedexternally(b4j.docU.preoptimizedclv __ref) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "listchangedexternally", true))
	 {Debug.delegate(ba, "listchangedexternally", null); return;}
ResumableSub_ListChangedExternally rsub = new ResumableSub_ListChangedExternally(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ListChangedExternally extends BA.ResumableSub {
public ResumableSub_ListChangedExternally(b4j.docU.preoptimizedclv parent,b4j.docU.preoptimizedclv __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.preoptimizedclv __ref;
b4j.docU.preoptimizedclv parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=213516289;
 //BA.debugLineNum = 213516289;BA.debugLine="ClearAssignedItems";
__ref._clearassigneditems /*String*/ (null);
RDebugUtils.currentLine=213516290;
 //BA.debugLineNum = 213516290;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preoptimizedclv", "listchangedexternally"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=213516291;
 //BA.debugLineNum = 213516291;BA.debugLine="RaiseVisibleRangeEvent";
__ref._raisevisiblerangeevent /*String*/ (null);
RDebugUtils.currentLine=213516292;
 //BA.debugLineNum = 213516292;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.docU.preoptimizedclv __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,b4j.example.customlistview _clv) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_clv}));}
RDebugUtils.currentLine=212926464;
 //BA.debugLineNum = 212926464;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=212926465;
 //BA.debugLineNum = 212926465;BA.debugLine="mCLV = CLV";
__ref._mclv /*b4j.example.customlistview*/  = _clv;
RDebugUtils.currentLine=212926466;
 //BA.debugLineNum = 212926466;BA.debugLine="jclv = mCLV 'ignore";
__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mclv /*b4j.example.customlistview*/ ));
RDebugUtils.currentLine=212926471;
 //BA.debugLineNum = 212926471;BA.debugLine="items = jclv.GetFieldJO(\"_items\").RunMethod(\"getO";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .GetFieldJO("_items").RunMethod("getObject",(Object[])(__c.Null))));
RDebugUtils.currentLine=212926472;
 //BA.debugLineNum = 212926472;BA.debugLine="horizontal = jclv.GetField(\"_horizontal\")";
__ref._horizontal /*boolean*/  = BA.ObjectToBoolean(__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .GetField("_horizontal"));
RDebugUtils.currentLine=212926474;
 //BA.debugLineNum = 212926474;BA.debugLine="PanelsCache.Initialize";
__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=212926475;
 //BA.debugLineNum = 212926475;BA.debugLine="StubPanel = CreatePanel";
__ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=212926476;
 //BA.debugLineNum = 212926476;BA.debugLine="StubPanel.AddView(xui.CreatePanel(\"\"), 0, 0, 10di";
__ref._stubpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"").getObject()),0,0,__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=212926477;
 //BA.debugLineNum = 212926477;BA.debugLine="AssignedItems = Array As B4XSet(B4XCollections.Cr";
__ref._assigneditems /*b4j.docU.b4xset[]*/  = new b4j.docU.b4xset[]{_b4xcollections._createset /*b4j.docU.b4xset*/ (),_b4xcollections._createset /*b4j.docU.b4xset*/ ()};
RDebugUtils.currentLine=212926478;
 //BA.debugLineNum = 212926478;BA.debugLine="ListOfItemsThatShouldBeUpdated.Initialize";
__ref._listofitemsthatshouldbeupdated /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=212926479;
 //BA.debugLineNum = 212926479;BA.debugLine="mCLV.AsView.LoadLayout(\"PCLVSeekBar\")";
__ref._mclv /*b4j.example.customlistview*/ ._asview().LoadLayout("PCLVSeekBar",ba);
RDebugUtils.currentLine=212926480;
 //BA.debugLineNum = 212926480;BA.debugLine="B4XSeekBar1.Size1 = 1dip";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._size1 /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=212926481;
 //BA.debugLineNum = 212926481;BA.debugLine="B4XSeekBar1.Size2 = 1dip";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._size2 /*int*/  = __c.DipToCurrent((int) (1));
RDebugUtils.currentLine=212926482;
 //BA.debugLineNum = 212926482;BA.debugLine="B4XSeekBar1.Radius1 = 8dip";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._radius1 /*int*/  = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=212926483;
 //BA.debugLineNum = 212926483;BA.debugLine="B4XSeekBar1.Update";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._update /*String*/ (null);
RDebugUtils.currentLine=212926484;
 //BA.debugLineNum = 212926484;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=212926485;
 //BA.debugLineNum = 212926485;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=212926486;
 //BA.debugLineNum = 212926486;BA.debugLine="End Sub";
return "";
}
public void  _b4xseekbar1_touchstatechanged(b4j.docU.preoptimizedclv __ref,boolean _pressed) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "b4xseekbar1_touchstatechanged", true))
	 {Debug.delegate(ba, "b4xseekbar1_touchstatechanged", new Object[] {_pressed}); return;}
ResumableSub_B4XSeekBar1_TouchStateChanged rsub = new ResumableSub_B4XSeekBar1_TouchStateChanged(this,__ref,_pressed);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XSeekBar1_TouchStateChanged extends BA.ResumableSub {
public ResumableSub_B4XSeekBar1_TouchStateChanged(b4j.docU.preoptimizedclv parent,b4j.docU.preoptimizedclv __ref,boolean _pressed) {
this.parent = parent;
this.__ref = __ref;
this._pressed = _pressed;
this.__ref = parent;
}
b4j.docU.preoptimizedclv __ref;
b4j.docU.preoptimizedclv parent;
boolean _pressed;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="preoptimizedclv";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=213581825;
 //BA.debugLineNum = 213581825;BA.debugLine="If Pressed = False Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_pressed==parent.__c.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=213581826;
 //BA.debugLineNum = 213581826;BA.debugLine="mCLV.JumpToItem(LastUserChangeIndex)";
__ref._mclv /*b4j.example.customlistview*/ ._jumptoitem(__ref._lastuserchangeindex /*int*/ );
RDebugUtils.currentLine=213581827;
 //BA.debugLineNum = 213581827;BA.debugLine="Sleep(DelayBeforeHidingOverlay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "preoptimizedclv", "b4xseekbar1_touchstatechanged"),__ref._delaybeforehidingoverlay /*int*/ );
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=213581828;
 //BA.debugLineNum = 213581828;BA.debugLine="pnlOverlay.Visible = False";
__ref._pnloverlay /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=213581830;
 //BA.debugLineNum = 213581830;BA.debugLine="pnlOverlay.Visible = True";
__ref._pnloverlay /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=213581836;
 //BA.debugLineNum = 213581836;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xseekbar1_valuechanged(b4j.docU.preoptimizedclv __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "b4xseekbar1_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "b4xseekbar1_valuechanged", new Object[] {_value}));}
Object _t = null;
RDebugUtils.currentLine=213647360;
 //BA.debugLineNum = 213647360;BA.debugLine="Sub B4XSeekBar1_ValueChanged (Value As Int)";
RDebugUtils.currentLine=213647361;
 //BA.debugLineNum = 213647361;BA.debugLine="LastUserChangeIndex = Max(0, items.Size - 1 - Val";
__ref._lastuserchangeindex /*int*/  = (int) (__c.Max(0,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1-_value));
RDebugUtils.currentLine=213647362;
 //BA.debugLineNum = 213647362;BA.debugLine="If LastUserChangeIndex < B4XSeekBar1.Interval The";
if (__ref._lastuserchangeindex /*int*/ <__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._interval /*int*/ ) { 
__ref._lastuserchangeindex /*int*/  = (int) (0);};
RDebugUtils.currentLine=213647363;
 //BA.debugLineNum = 213647363;BA.debugLine="lblHint.Text = \"\"";
__ref._lblhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=213647364;
 //BA.debugLineNum = 213647364;BA.debugLine="If xui.SubExists(mCallback, mEventName & \"_HintRe";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_HintRequested",(int) (1))) { 
RDebugUtils.currentLine=213647365;
 //BA.debugLineNum = 213647365;BA.debugLine="Dim t As Object = CallSub2(mCallback, mEventName";
_t = __c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_HintRequested",(Object)(__ref._lastuserchangeindex /*int*/ ));
RDebugUtils.currentLine=213647366;
 //BA.debugLineNum = 213647366;BA.debugLine="If t <> Null Then";
if (_t!= null) { 
RDebugUtils.currentLine=213647367;
 //BA.debugLineNum = 213647367;BA.debugLine="InternalSetTextOrCSBuilderToLabel(lblHint, t)";
__ref._internalsettextorcsbuildertolabel /*String*/ (null,__ref._lblhint /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
 };
 };
RDebugUtils.currentLine=213647370;
 //BA.debugLineNum = 213647370;BA.debugLine="End Sub";
return "";
}
public String  _internalsettextorcsbuildertolabel(b4j.docU.preoptimizedclv __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "internalsettextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "internalsettextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=213712896;
 //BA.debugLineNum = 213712896;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
RDebugUtils.currentLine=213712898;
 //BA.debugLineNum = 213712898;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
RDebugUtils.currentLine=213712908;
 //BA.debugLineNum = 213712908;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
RDebugUtils.currentLine=212860928;
 //BA.debugLineNum = 212860928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=212860929;
 //BA.debugLineNum = 212860929;BA.debugLine="Private mCLV As CustomListView";
_mclv = new b4j.example.customlistview();
RDebugUtils.currentLine=212860930;
 //BA.debugLineNum = 212860930;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=212860931;
 //BA.debugLineNum = 212860931;BA.debugLine="Private PanelsCache As List";
_panelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=212860932;
 //BA.debugLineNum = 212860932;BA.debugLine="Private StubPanel As B4XView";
_stubpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=212860933;
 //BA.debugLineNum = 212860933;BA.debugLine="Private horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=212860934;
 //BA.debugLineNum = 212860934;BA.debugLine="Private AssignedItems() As B4XSet";
_assigneditems = new b4j.docU.b4xset[(int) (0)];
{
int d0 = _assigneditems.length;
for (int i0 = 0;i0 < d0;i0++) {
_assigneditems[i0] = new b4j.docU.b4xset();
}
}
;
RDebugUtils.currentLine=212860935;
 //BA.debugLineNum = 212860935;BA.debugLine="Private AssignedItemsAsIndex As Int";
_assigneditemsasindex = 0;
RDebugUtils.currentLine=212860939;
 //BA.debugLineNum = 212860939;BA.debugLine="Private jclv As JavaObject";
_jclv = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=212860941;
 //BA.debugLineNum = 212860941;BA.debugLine="Public ExtraItems As Int = 3";
_extraitems = (int) (3);
RDebugUtils.currentLine=212860942;
 //BA.debugLineNum = 212860942;BA.debugLine="Private ListOfItemsThatShouldBeUpdated As List";
_listofitemsthatshouldbeupdated = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=212860943;
 //BA.debugLineNum = 212860943;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=212860944;
 //BA.debugLineNum = 212860944;BA.debugLine="Public ShowScrollBar As Boolean = True";
_showscrollbar = __c.True;
RDebugUtils.currentLine=212860945;
 //BA.debugLineNum = 212860945;BA.debugLine="Public B4XSeekBar1 As B4XSeekBar";
_b4xseekbar1 = new b4j.docU.b4xseekbar();
RDebugUtils.currentLine=212860946;
 //BA.debugLineNum = 212860946;BA.debugLine="Public pnlOverlay As B4XView";
_pnloverlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=212860947;
 //BA.debugLineNum = 212860947;BA.debugLine="Public lblHint As B4XView";
_lblhint = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=212860948;
 //BA.debugLineNum = 212860948;BA.debugLine="Private LastUserChangeIndex As Int";
_lastuserchangeindex = 0;
RDebugUtils.currentLine=212860949;
 //BA.debugLineNum = 212860949;BA.debugLine="Public NumberOfSteps As Int = 20";
_numberofsteps = (int) (20);
RDebugUtils.currentLine=212860950;
 //BA.debugLineNum = 212860950;BA.debugLine="Public DelayBeforeHidingOverlay As Int = 50";
_delaybeforehidingoverlay = (int) (50);
RDebugUtils.currentLine=212860951;
 //BA.debugLineNum = 212860951;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=212860952;
 //BA.debugLineNum = 212860952;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=212860953;
 //BA.debugLineNum = 212860953;BA.debugLine="End Sub";
return "";
}
public String  _clearassigneditems(b4j.docU.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "clearassigneditems", true))
	 {return ((String) Debug.delegate(ba, "clearassigneditems", null));}
b4j.docU.b4xset _s = null;
RDebugUtils.currentLine=213450752;
 //BA.debugLineNum = 213450752;BA.debugLine="Private Sub ClearAssignedItems";
RDebugUtils.currentLine=213450753;
 //BA.debugLineNum = 213450753;BA.debugLine="For Each s As B4XSet In AssignedItems";
{
final b4j.docU.b4xset[] group1 = __ref._assigneditems /*b4j.docU.b4xset[]*/ ;
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = group1[index1];
RDebugUtils.currentLine=213450754;
 //BA.debugLineNum = 213450754;BA.debugLine="s.Clear";
_s._clear /*String*/ (null);
 }
};
RDebugUtils.currentLine=213450756;
 //BA.debugLineNum = 213450756;BA.debugLine="End Sub";
return "";
}
public String  _raisevisiblerangeevent(b4j.docU.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "raisevisiblerangeevent", true))
	 {return ((String) Debug.delegate(ba, "raisevisiblerangeevent", null));}
RDebugUtils.currentLine=213123072;
 //BA.debugLineNum = 213123072;BA.debugLine="Private Sub RaiseVisibleRangeEvent";
RDebugUtils.currentLine=213123073;
 //BA.debugLineNum = 213123073;BA.debugLine="jclv.RunMethod(\"_resetvisibles\", Null)";
__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("_resetvisibles",(Object[])(__c.Null));
RDebugUtils.currentLine=213123074;
 //BA.debugLineNum = 213123074;BA.debugLine="jclv.RunMethod(\"_updatevisiblerange\", Null)";
__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("_updatevisiblerange",(Object[])(__c.Null));
RDebugUtils.currentLine=213123075;
 //BA.debugLineNum = 213123075;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(b4j.docU.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "createpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", null));}
RDebugUtils.currentLine=213188608;
 //BA.debugLineNum = 213188608;BA.debugLine="Private Sub CreatePanel As B4XView";
RDebugUtils.currentLine=213188612;
 //BA.debugLineNum = 213188612;BA.debugLine="Return jclv.RunMethodJO(\"_createpanel\", Array(\"Pa";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._jclv /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("_createpanel",new Object[]{(Object)("Panel")}).RunMethod("getObject",(Object[])(__c.Null))));
RDebugUtils.currentLine=213188614;
 //BA.debugLineNum = 213188614;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.preoptimizedclv __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=213385216;
 //BA.debugLineNum = 213385216;BA.debugLine="Private Sub GetPanel As B4XView";
RDebugUtils.currentLine=213385217;
 //BA.debugLineNum = 213385217;BA.debugLine="If PanelsCache.Size = 0 Then Return CreatePanel";
if (__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);};
RDebugUtils.currentLine=213385218;
 //BA.debugLineNum = 213385218;BA.debugLine="Dim p As B4XView = PanelsCache.Get(PanelsCache.Si";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=213385219;
 //BA.debugLineNum = 213385219;BA.debugLine="PanelsCache.RemoveAt(PanelsCache.Size - 1)";
__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._panelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=213385220;
 //BA.debugLineNum = 213385220;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=213385221;
 //BA.debugLineNum = 213385221;BA.debugLine="End Sub";
return null;
}
public String  _handlescrollbar(b4j.docU.preoptimizedclv __ref,int _firstvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="preoptimizedclv";
if (Debug.shouldDelegate(ba, "handlescrollbar", true))
	 {return ((String) Debug.delegate(ba, "handlescrollbar", new Object[] {_firstvisible}));}
RDebugUtils.currentLine=213319680;
 //BA.debugLineNum = 213319680;BA.debugLine="Private Sub HandleScrollBar (FirstVisible As Int)";
RDebugUtils.currentLine=213319681;
 //BA.debugLineNum = 213319681;BA.debugLine="If ShowScrollBar = False Then Return";
if (__ref._showscrollbar /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=213319682;
 //BA.debugLineNum = 213319682;BA.debugLine="B4XSeekBar1.Value = items.Size - FirstVisible";
__ref._b4xseekbar1 /*b4j.docU.b4xseekbar*/ ._setvalue /*int*/ (null,(int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-_firstvisible));
RDebugUtils.currentLine=213319683;
 //BA.debugLineNum = 213319683;BA.debugLine="End Sub";
return "";
}
}