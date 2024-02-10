package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clvselectionsjamtableview_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public MODE_SINGLE_ITEM_TEMP = 1, MODE_SINGLE_ITE";
clvselectionsjamtableview._mode_single_item_temp = BA.numberCast(int.class, 1);__ref.setField("_mode_single_item_temp",clvselectionsjamtableview._mode_single_item_temp);
clvselectionsjamtableview._mode_single_item_permanent = BA.numberCast(int.class, 2);__ref.setField("_mode_single_item_permanent",clvselectionsjamtableview._mode_single_item_permanent);
clvselectionsjamtableview._mode_multiple_items = BA.numberCast(int.class, 3);__ref.setField("_mode_multiple_items",clvselectionsjamtableview._mode_multiple_items);
 //BA.debugLineNum = 4;BA.debugLine="Private mCurrentMode As Int";
clvselectionsjamtableview._mcurrentmode = RemoteObject.createImmutable(0);__ref.setField("_mcurrentmode",clvselectionsjamtableview._mcurrentmode);
 //BA.debugLineNum = 5;BA.debugLine="Public SelectedItems As B4XSet";
clvselectionsjamtableview._selecteditems = RemoteObject.createNew ("b4j.docU.b4xset");__ref.setField("_selecteditems",clvselectionsjamtableview._selecteditems);
 //BA.debugLineNum = 6;BA.debugLine="Public SelectionColor As Int";
clvselectionsjamtableview._selectioncolor = RemoteObject.createImmutable(0);__ref.setField("_selectioncolor",clvselectionsjamtableview._selectioncolor);
 //BA.debugLineNum = 7;BA.debugLine="Private mCLV As CustomListView";
clvselectionsjamtableview._mclv = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_mclv",clvselectionsjamtableview._mclv);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
clvselectionsjamtableview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clvselectionsjamtableview._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private UnselectedColor As Int = xui.Color_Transp";
clvselectionsjamtableview._unselectedcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent");__ref.setField("_unselectedcolor",clvselectionsjamtableview._unselectedcolor);
 //BA.debugLineNum = 10;BA.debugLine="Private SingleMode As Boolean";
clvselectionsjamtableview._singlemode = RemoteObject.createImmutable(false);__ref.setField("_singlemode",clvselectionsjamtableview._singlemode);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "clvselectionsjamtableview","clear", __ref);}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 70;BA.debugLine="Public Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="If SelectedItems.Size = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 72;BA.debugLine="For Each i As Int In SelectedItems.AsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = __ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_i = BA.numberCast(int.class, group2.runMethod(false,"Get",index2));Debug.locals.put("i", _i);
Debug.locals.put("i", _i);
 BA.debugLineNum = 73;BA.debugLine="mCLV.GetPanel(i).Color = UnselectedColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_i)).runMethod(true,"setColor",__ref.getField(true,"_unselectedcolor" /*RemoteObject*/ ));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 75;BA.debugLine="SelectedItems.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMode (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getmode")) { return __ref.runUserSub(false, "clvselectionsjamtableview","getmode", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Public Sub getMode As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Return mCurrentMode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcurrentmode" /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _clv) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clvselectionsjamtableview","initialize", __ref, _ba, _clv);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CLV", _clv);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (CLV As CustomListView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="mCLV = CLV";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mclv" /*RemoteObject*/ ,_clv);
 BA.debugLineNum = 15;BA.debugLine="SelectionColor = CLV.PressedColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selectioncolor" /*RemoteObject*/ ,_clv.getField(true,"_pressedcolor"));
 BA.debugLineNum = 16;BA.debugLine="SelectedItems = B4XCollections.CreateSet";
Debug.JustUpdateDeviceLine();
__ref.setField ("_selecteditems" /*RemoteObject*/ ,clvselectionsjamtableview._b4xcollections.runMethod(false,"_createset" /*RemoteObject*/ ));
 BA.debugLineNum = 17;BA.debugLine="mCurrentMode = MODE_SINGLE_ITEM_TEMP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentmode" /*RemoteObject*/ ,__ref.getField(true,"_mode_single_item_temp" /*RemoteObject*/ ));
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemclicked(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ItemClicked (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("itemclicked")) { return __ref.runUserSub(false, "clvselectionsjamtableview","itemclicked", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 20;BA.debugLine="Public Sub ItemClicked (Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="If mCurrentMode = MODE_SINGLE_ITEM_TEMP Then Retu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_mode_single_item_temp" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 22;BA.debugLine="If SelectedItems.Contains(Index) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_index))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 23;BA.debugLine="SelectedItems.Remove(Index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_index)));
 BA.debugLineNum = 24;BA.debugLine="mCLV.GetPanel(Index).Color = UnselectedColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).runMethod(true,"setColor",__ref.getField(true,"_unselectedcolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 26;BA.debugLine="If SingleMode And SelectedItems.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_singlemode" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 27;BA.debugLine="Clear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_clear" /*RemoteObject*/ );
 };
 BA.debugLineNum = 29;BA.debugLine="mCLV.GetPanel(Index).Color = SelectionColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).runMethod(true,"setColor",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));
 BA.debugLineNum = 30;BA.debugLine="SelectedItems.Add(Index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_index)));
 };
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "clvselectionsjamtableview","refresh", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="VisibleRangeChanged(0, mCLV.Size - 1)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_visiblerangechanged" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _selectandmakevisible(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SelectAndMakeVisible (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("selectandmakevisible")) { __ref.runUserSub(false, "clvselectionsjamtableview","selectandmakevisible", __ref, _index); return;}
ResumableSub_SelectAndMakeVisible rsub = new ResumableSub_SelectAndMakeVisible(null,__ref,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SelectAndMakeVisible extends BA.ResumableSub {
public ResumableSub_SelectAndMakeVisible(b4j.docU.clvselectionsjamtableview parent,RemoteObject __ref,RemoteObject _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.clvselectionsjamtableview parent;
RemoteObject _index;
RemoteObject _target = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SelectAndMakeVisible (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,78);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 79;BA.debugLine="Dim Target As Int = Max(0, Index - (mCLV.LastVisi";
Debug.JustUpdateDeviceLine();
_target = BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_index,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getlastvisibleindex"),__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getfirstvisibleindex"),RemoteObject.createImmutable(1)}, "--",2, 1)),RemoteObject.createImmutable(2)}, "-/",1, 0))));Debug.locals.put("Target", _target);Debug.locals.put("Target", _target);
 BA.debugLineNum = 80;BA.debugLine="If mCurrentMode = MODE_SINGLE_ITEM_TEMP Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_mode_single_item_temp" /*RemoteObject*/ )))) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 81;BA.debugLine="If mCLV.FirstVisibleIndex > Index Or mCLV.LastVi";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getfirstvisibleindex"),BA.numberCast(double.class, _index)) || RemoteObject.solveBoolean("<",__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getlastvisibleindex"),BA.numberCast(double.class, _index))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 82;BA.debugLine="mCLV.JumpToItem(Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(_target));
 if (true) break;

case 7:
//C
this.state = 17;
;
 BA.debugLineNum = 84;BA.debugLine="Dim p As B4XView = mCLV.GetPanel(Index)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="p.SetColorAnimated(50, UnselectedColor, Selectio";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 50)),(Object)(__ref.getField(true,"_unselectedcolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_selectioncolor" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="Sleep(200)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clvselectionsjamtableview", "selectandmakevisible"),BA.numberCast(int.class, 200));
this.state = 18;
return;
case 18:
//C
this.state = 17;
;
 BA.debugLineNum = 87;BA.debugLine="p.SetColorAnimated(200, SelectionColor, Unselect";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(true,"_selectioncolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_unselectedcolor" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 89;BA.debugLine="If SelectedItems.Contains(Index) = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_index))),parent.__c.getField(true,"False"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 90;BA.debugLine="ItemClicked(Index)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_itemclicked" /*RemoteObject*/ ,(Object)(_index));
 if (true) break;
;
 BA.debugLineNum = 92;BA.debugLine="If mCLV.FirstVisibleIndex > Index Or mCLV.LastVi";
Debug.JustUpdateDeviceLine();

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getfirstvisibleindex"),BA.numberCast(double.class, _index)) || RemoteObject.solveBoolean("<",__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getlastvisibleindex"),BA.numberCast(double.class, _index))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 93;BA.debugLine="mCLV.ScrollToItem(Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).runVoidMethod ("_scrolltoitem",(Object)(_target));
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
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setmode(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("setMode (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setmode")) { return __ref.runUserSub(false, "clvselectionsjamtableview","setmode", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 53;BA.debugLine="Public Sub setMode (m As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="mCurrentMode = m";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcurrentmode" /*RemoteObject*/ ,_m);
 BA.debugLineNum = 55;BA.debugLine="Clear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 56;BA.debugLine="If mCurrentMode = MODE_SINGLE_ITEM_TEMP Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_mode_single_item_temp" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 57;BA.debugLine="mCLV.PressedColor = SelectionColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).setField ("_pressedcolor",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 59;BA.debugLine="mCLV.PressedColor = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mclv" /*RemoteObject*/ ).setField ("_pressedcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 };
 BA.debugLineNum = 61;BA.debugLine="Select mCurrentMode";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_mcurrentmode" /*RemoteObject*/ ),__ref.getField(true,"_mode_single_item_permanent" /*RemoteObject*/ ),__ref.getField(true,"_mode_multiple_items" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 63;BA.debugLine="SingleMode = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_singlemode" /*RemoteObject*/ ,clvselectionsjamtableview.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 65;BA.debugLine="SingleMode = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_singlemode" /*RemoteObject*/ ,clvselectionsjamtableview.__c.getField(true,"False"));
 break; }
}
;
 BA.debugLineNum = 67;BA.debugLine="Refresh";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.clvselectionsjamtableview.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visiblerangechanged(RemoteObject __ref,RemoteObject _firstindex,RemoteObject _lastindex) throws Exception{
try {
		Debug.PushSubsStack("VisibleRangeChanged (clvselectionsjamtableview) ","clvselectionsjamtableview",94,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("visiblerangechanged")) { return __ref.runUserSub(false, "clvselectionsjamtableview","visiblerangechanged", __ref, _firstindex, _lastindex);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("FirstIndex", _firstindex);
Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 38;BA.debugLine="Public Sub VisibleRangeChanged (FirstIndex As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="For i = Max(0, FirstIndex - 5) To Min(mCLV.Size -";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = (int) (0 + clvselectionsjamtableview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_lastindex,RemoteObject.createImmutable(5)}, "+",1, 1)))).<Double>get().doubleValue());
_i = (int) (0 + clvselectionsjamtableview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_firstindex,RemoteObject.createImmutable(5)}, "-",1, 1)))).<Double>get().doubleValue()) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 40;BA.debugLine="Dim p As B4XView = mCLV.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_mclv" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 41;BA.debugLine="If SelectedItems.Contains(i) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_selecteditems" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable((_i)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="p.Color = SelectionColor";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(true,"_selectioncolor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 44;BA.debugLine="p.Color = UnselectedColor";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(true,"_unselectedcolor" /*RemoteObject*/ ));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}