package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clvselectionsjamtableview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.clvselectionsjamtableview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.clvselectionsjamtableview.class).invoke(this, new Object[] {null});
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
public int _mode_single_item_temp = 0;
public int _mode_single_item_permanent = 0;
public int _mode_multiple_items = 0;
public int _mcurrentmode = 0;
public b4j.docU.b4xset _selecteditems = null;
public int _selectioncolor = 0;
public b4j.example.customlistview _mclv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _unselectedcolor = 0;
public boolean _singlemode = false;
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
public String  _initialize(b4j.docU.clvselectionsjamtableview __ref,anywheresoftware.b4a.BA _ba,b4j.example.customlistview _clv) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_clv}));}
RDebugUtils.currentLine=181927936;
 //BA.debugLineNum = 181927936;BA.debugLine="Public Sub Initialize (CLV As CustomListView)";
RDebugUtils.currentLine=181927937;
 //BA.debugLineNum = 181927937;BA.debugLine="mCLV = CLV";
__ref._mclv /*b4j.example.customlistview*/  = _clv;
RDebugUtils.currentLine=181927938;
 //BA.debugLineNum = 181927938;BA.debugLine="SelectionColor = CLV.PressedColor";
__ref._selectioncolor /*int*/  = _clv._pressedcolor;
RDebugUtils.currentLine=181927939;
 //BA.debugLineNum = 181927939;BA.debugLine="SelectedItems = B4XCollections.CreateSet";
__ref._selecteditems /*b4j.docU.b4xset*/  = _b4xcollections._createset /*b4j.docU.b4xset*/ ();
RDebugUtils.currentLine=181927940;
 //BA.debugLineNum = 181927940;BA.debugLine="mCurrentMode = MODE_SINGLE_ITEM_TEMP";
__ref._mcurrentmode /*int*/  = __ref._mode_single_item_temp /*int*/ ;
RDebugUtils.currentLine=181927941;
 //BA.debugLineNum = 181927941;BA.debugLine="End Sub";
return "";
}
public String  _setmode(b4j.docU.clvselectionsjamtableview __ref,int _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "setmode", true))
	 {return ((String) Debug.delegate(ba, "setmode", new Object[] {_m}));}
RDebugUtils.currentLine=182255616;
 //BA.debugLineNum = 182255616;BA.debugLine="Public Sub setMode (m As Int)";
RDebugUtils.currentLine=182255617;
 //BA.debugLineNum = 182255617;BA.debugLine="mCurrentMode = m";
__ref._mcurrentmode /*int*/  = _m;
RDebugUtils.currentLine=182255618;
 //BA.debugLineNum = 182255618;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=182255619;
 //BA.debugLineNum = 182255619;BA.debugLine="If mCurrentMode = MODE_SINGLE_ITEM_TEMP Then";
if (__ref._mcurrentmode /*int*/ ==__ref._mode_single_item_temp /*int*/ ) { 
RDebugUtils.currentLine=182255620;
 //BA.debugLineNum = 182255620;BA.debugLine="mCLV.PressedColor = SelectionColor";
__ref._mclv /*b4j.example.customlistview*/ ._pressedcolor = __ref._selectioncolor /*int*/ ;
 }else {
RDebugUtils.currentLine=182255622;
 //BA.debugLineNum = 182255622;BA.debugLine="mCLV.PressedColor = xui.Color_Transparent";
__ref._mclv /*b4j.example.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
 };
RDebugUtils.currentLine=182255624;
 //BA.debugLineNum = 182255624;BA.debugLine="Select mCurrentMode";
switch (BA.switchObjectToInt(__ref._mcurrentmode /*int*/ ,__ref._mode_single_item_permanent /*int*/ ,__ref._mode_multiple_items /*int*/ )) {
case 0: {
RDebugUtils.currentLine=182255626;
 //BA.debugLineNum = 182255626;BA.debugLine="SingleMode = True";
__ref._singlemode /*boolean*/  = __c.True;
 break; }
case 1: {
RDebugUtils.currentLine=182255628;
 //BA.debugLineNum = 182255628;BA.debugLine="SingleMode = False";
__ref._singlemode /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=182255630;
 //BA.debugLineNum = 182255630;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=182255631;
 //BA.debugLineNum = 182255631;BA.debugLine="End Sub";
return "";
}
public void  _selectandmakevisible(b4j.docU.clvselectionsjamtableview __ref,int _index) throws Exception{
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "selectandmakevisible", true))
	 {Debug.delegate(ba, "selectandmakevisible", new Object[] {_index}); return;}
ResumableSub_SelectAndMakeVisible rsub = new ResumableSub_SelectAndMakeVisible(this,__ref,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_SelectAndMakeVisible extends BA.ResumableSub {
public ResumableSub_SelectAndMakeVisible(b4j.docU.clvselectionsjamtableview parent,b4j.docU.clvselectionsjamtableview __ref,int _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this.__ref = parent;
}
b4j.docU.clvselectionsjamtableview __ref;
b4j.docU.clvselectionsjamtableview parent;
int _index;
int _target = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clvselectionsjamtableview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=182386689;
 //BA.debugLineNum = 182386689;BA.debugLine="Dim Target As Int = Max(0, Index - (mCLV.LastVisi";
_target = (int) (parent.__c.Max(0,_index-(__ref._mclv /*b4j.example.customlistview*/ ._getlastvisibleindex()-__ref._mclv /*b4j.example.customlistview*/ ._getfirstvisibleindex()-1)/(double)2));
RDebugUtils.currentLine=182386690;
 //BA.debugLineNum = 182386690;BA.debugLine="If mCurrentMode = MODE_SINGLE_ITEM_TEMP Then";
if (true) break;

case 1:
//if
this.state = 17;
if (__ref._mcurrentmode /*int*/ ==__ref._mode_single_item_temp /*int*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=182386691;
 //BA.debugLineNum = 182386691;BA.debugLine="If mCLV.FirstVisibleIndex > Index Or mCLV.LastVi";
if (true) break;

case 4:
//if
this.state = 7;
if (__ref._mclv /*b4j.example.customlistview*/ ._getfirstvisibleindex()>_index || __ref._mclv /*b4j.example.customlistview*/ ._getlastvisibleindex()<_index) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=182386692;
 //BA.debugLineNum = 182386692;BA.debugLine="mCLV.JumpToItem(Target)";
__ref._mclv /*b4j.example.customlistview*/ ._jumptoitem(_target);
 if (true) break;

case 7:
//C
this.state = 17;
;
RDebugUtils.currentLine=182386694;
 //BA.debugLineNum = 182386694;BA.debugLine="Dim p As B4XView = mCLV.GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._mclv /*b4j.example.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=182386695;
 //BA.debugLineNum = 182386695;BA.debugLine="p.SetColorAnimated(50, UnselectedColor, Selectio";
_p.SetColorAnimated((int) (50),__ref._unselectedcolor /*int*/ ,__ref._selectioncolor /*int*/ );
RDebugUtils.currentLine=182386696;
 //BA.debugLineNum = 182386696;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clvselectionsjamtableview", "selectandmakevisible"),(int) (200));
this.state = 18;
return;
case 18:
//C
this.state = 17;
;
RDebugUtils.currentLine=182386697;
 //BA.debugLineNum = 182386697;BA.debugLine="p.SetColorAnimated(200, SelectionColor, Unselect";
_p.SetColorAnimated((int) (200),__ref._selectioncolor /*int*/ ,__ref._unselectedcolor /*int*/ );
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=182386699;
 //BA.debugLineNum = 182386699;BA.debugLine="If SelectedItems.Contains(Index) = False Then";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._selecteditems /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_index))==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=182386700;
 //BA.debugLineNum = 182386700;BA.debugLine="ItemClicked(Index)";
__ref._itemclicked /*String*/ (null,_index);
 if (true) break;
;
RDebugUtils.currentLine=182386702;
 //BA.debugLineNum = 182386702;BA.debugLine="If mCLV.FirstVisibleIndex > Index Or mCLV.LastVi";

case 13:
//if
this.state = 16;
if (__ref._mclv /*b4j.example.customlistview*/ ._getfirstvisibleindex()>_index || __ref._mclv /*b4j.example.customlistview*/ ._getlastvisibleindex()<_index) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=182386703;
 //BA.debugLineNum = 182386703;BA.debugLine="mCLV.ScrollToItem(Target)";
__ref._mclv /*b4j.example.customlistview*/ ._scrolltoitem(_target);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=182386706;
 //BA.debugLineNum = 182386706;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clear(b4j.docU.clvselectionsjamtableview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
int _i = 0;
RDebugUtils.currentLine=182321152;
 //BA.debugLineNum = 182321152;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=182321153;
 //BA.debugLineNum = 182321153;BA.debugLine="If SelectedItems.Size = 0 Then Return";
if (__ref._selecteditems /*b4j.docU.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return "";};
RDebugUtils.currentLine=182321154;
 //BA.debugLineNum = 182321154;BA.debugLine="For Each i As Int In SelectedItems.AsList";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._selecteditems /*b4j.docU.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_i = (int)(BA.ObjectToNumber(group2.Get(index2)));
RDebugUtils.currentLine=182321155;
 //BA.debugLineNum = 182321155;BA.debugLine="mCLV.GetPanel(i).Color = UnselectedColor";
__ref._mclv /*b4j.example.customlistview*/ ._getpanel(_i).setColor(__ref._unselectedcolor /*int*/ );
 }
};
RDebugUtils.currentLine=182321157;
 //BA.debugLineNum = 182321157;BA.debugLine="SelectedItems.Clear";
__ref._selecteditems /*b4j.docU.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=182321158;
 //BA.debugLineNum = 182321158;BA.debugLine="End Sub";
return "";
}
public String  _itemclicked(b4j.docU.clvselectionsjamtableview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "itemclicked", true))
	 {return ((String) Debug.delegate(ba, "itemclicked", new Object[] {_index}));}
RDebugUtils.currentLine=181993472;
 //BA.debugLineNum = 181993472;BA.debugLine="Public Sub ItemClicked (Index As Int)";
RDebugUtils.currentLine=181993473;
 //BA.debugLineNum = 181993473;BA.debugLine="If mCurrentMode = MODE_SINGLE_ITEM_TEMP Then Retu";
if (__ref._mcurrentmode /*int*/ ==__ref._mode_single_item_temp /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=181993474;
 //BA.debugLineNum = 181993474;BA.debugLine="If SelectedItems.Contains(Index) Then";
if (__ref._selecteditems /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_index))) { 
RDebugUtils.currentLine=181993475;
 //BA.debugLineNum = 181993475;BA.debugLine="SelectedItems.Remove(Index)";
__ref._selecteditems /*b4j.docU.b4xset*/ ._remove /*String*/ (null,(Object)(_index));
RDebugUtils.currentLine=181993476;
 //BA.debugLineNum = 181993476;BA.debugLine="mCLV.GetPanel(Index).Color = UnselectedColor";
__ref._mclv /*b4j.example.customlistview*/ ._getpanel(_index).setColor(__ref._unselectedcolor /*int*/ );
 }else {
RDebugUtils.currentLine=181993478;
 //BA.debugLineNum = 181993478;BA.debugLine="If SingleMode And SelectedItems.Size > 0 Then";
if (__ref._singlemode /*boolean*/  && __ref._selecteditems /*b4j.docU.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=181993479;
 //BA.debugLineNum = 181993479;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
 };
RDebugUtils.currentLine=181993481;
 //BA.debugLineNum = 181993481;BA.debugLine="mCLV.GetPanel(Index).Color = SelectionColor";
__ref._mclv /*b4j.example.customlistview*/ ._getpanel(_index).setColor(__ref._selectioncolor /*int*/ );
RDebugUtils.currentLine=181993482;
 //BA.debugLineNum = 181993482;BA.debugLine="SelectedItems.Add(Index)";
__ref._selecteditems /*b4j.docU.b4xset*/ ._add /*String*/ (null,(Object)(_index));
 };
RDebugUtils.currentLine=181993484;
 //BA.debugLineNum = 181993484;BA.debugLine="End Sub";
return "";
}
public String  _visiblerangechanged(b4j.docU.clvselectionsjamtableview __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "visiblerangechanged", true))
	 {return ((String) Debug.delegate(ba, "visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=182124544;
 //BA.debugLineNum = 182124544;BA.debugLine="Public Sub VisibleRangeChanged (FirstIndex As Int,";
RDebugUtils.currentLine=182124545;
 //BA.debugLineNum = 182124545;BA.debugLine="For i = Max(0, FirstIndex - 5) To Min(mCLV.Size -";
{
final int step1 = 1;
final int limit1 = (int) (__c.Min(__ref._mclv /*b4j.example.customlistview*/ ._getsize()-1,_lastindex+5));
_i = (int) (__c.Max(0,_firstindex-5)) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=182124546;
 //BA.debugLineNum = 182124546;BA.debugLine="Dim p As B4XView = mCLV.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._mclv /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=182124547;
 //BA.debugLineNum = 182124547;BA.debugLine="If SelectedItems.Contains(i) Then";
if (__ref._selecteditems /*b4j.docU.b4xset*/ ._contains /*boolean*/ (null,(Object)(_i))) { 
RDebugUtils.currentLine=182124548;
 //BA.debugLineNum = 182124548;BA.debugLine="p.Color = SelectionColor";
_p.setColor(__ref._selectioncolor /*int*/ );
 }else {
RDebugUtils.currentLine=182124550;
 //BA.debugLineNum = 182124550;BA.debugLine="p.Color = UnselectedColor";
_p.setColor(__ref._unselectedcolor /*int*/ );
 };
 }
};
RDebugUtils.currentLine=182124553;
 //BA.debugLineNum = 182124553;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.clvselectionsjamtableview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
RDebugUtils.currentLine=181862400;
 //BA.debugLineNum = 181862400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=181862401;
 //BA.debugLineNum = 181862401;BA.debugLine="Public MODE_SINGLE_ITEM_TEMP = 1, MODE_SINGLE_ITE";
_mode_single_item_temp = (int) (1);
_mode_single_item_permanent = (int) (2);
_mode_multiple_items = (int) (3);
RDebugUtils.currentLine=181862402;
 //BA.debugLineNum = 181862402;BA.debugLine="Private mCurrentMode As Int";
_mcurrentmode = 0;
RDebugUtils.currentLine=181862403;
 //BA.debugLineNum = 181862403;BA.debugLine="Public SelectedItems As B4XSet";
_selecteditems = new b4j.docU.b4xset();
RDebugUtils.currentLine=181862404;
 //BA.debugLineNum = 181862404;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
RDebugUtils.currentLine=181862405;
 //BA.debugLineNum = 181862405;BA.debugLine="Private mCLV As CustomListView";
_mclv = new b4j.example.customlistview();
RDebugUtils.currentLine=181862406;
 //BA.debugLineNum = 181862406;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=181862407;
 //BA.debugLineNum = 181862407;BA.debugLine="Private UnselectedColor As Int = xui.Color_Transp";
_unselectedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=181862408;
 //BA.debugLineNum = 181862408;BA.debugLine="Private SingleMode As Boolean";
_singlemode = false;
RDebugUtils.currentLine=181862409;
 //BA.debugLineNum = 181862409;BA.debugLine="End Sub";
return "";
}
public int  _getmode(b4j.docU.clvselectionsjamtableview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "getmode", true))
	 {return ((Integer) Debug.delegate(ba, "getmode", null));}
RDebugUtils.currentLine=182190080;
 //BA.debugLineNum = 182190080;BA.debugLine="Public Sub getMode As Int";
RDebugUtils.currentLine=182190081;
 //BA.debugLineNum = 182190081;BA.debugLine="Return mCurrentMode";
if (true) return __ref._mcurrentmode /*int*/ ;
RDebugUtils.currentLine=182190082;
 //BA.debugLineNum = 182190082;BA.debugLine="End Sub";
return 0;
}
public String  _refresh(b4j.docU.clvselectionsjamtableview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clvselectionsjamtableview";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=182059008;
 //BA.debugLineNum = 182059008;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=182059009;
 //BA.debugLineNum = 182059009;BA.debugLine="VisibleRangeChanged(0, mCLV.Size - 1)";
__ref._visiblerangechanged /*String*/ (null,(int) (0),(int) (__ref._mclv /*b4j.example.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=182059010;
 //BA.debugLineNum = 182059010;BA.debugLine="End Sub";
return "";
}
}