package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamrecordformclvdragger_subs_0 {


public static RemoteObject  _adddragbuttons(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddDragButtons (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("adddragbuttons")) { return __ref.runUserSub(false, "jamrecordformclvdragger","adddragbuttons", __ref);}
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 42;BA.debugLine="Public Sub AddDragButtons";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="list.PressedColor = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).setField ("_pressedcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 44;BA.debugLine="Dim fnt As B4XFont = xui.CreateMaterialIcons(30)";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, 30)));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 45;BA.debugLine="For i = 0 To list.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 46;BA.debugLine="Dim p As B4XView = list.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 47;BA.debugLine="If IsLastViewADragLabel(p) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.docU.jamrecordformclvdragger.class, "_islastviewadraglabel" /*RemoteObject*/ ,(Object)(_p)),jamrecordformclvdragger.__c.getField(true,"False"))) { 
 BA.debugLineNum = 48;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 49;BA.debugLine="lbl.Initialize(\"drag\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("drag")));
 BA.debugLineNum = 50;BA.debugLine="lbl.MouseCursor = fx.Cursors.HAND";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 51;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 52;BA.debugLine="xlbl.Font = fnt";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",_fnt);
 BA.debugLineNum = 53;BA.debugLine="xlbl.Text = Chr(0xE25D)";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToString(jamrecordformclvdragger.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe25d))))));
 BA.debugLineNum = 56;BA.debugLine="xlbl.TextColor = 0xFFFFA500";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",BA.numberCast(int.class, ((int)0xffffa500)));
 BA.debugLineNum = 57;BA.debugLine="xlbl.Tag = list";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setTag",(__ref.getField(false,"_list" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="p.AddView(xlbl, 2dip, p.Height / 2 - 15dip, 30d";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, jamrecordformclvdragger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),jamrecordformclvdragger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "/-",1, 0)),(Object)(BA.numberCast(double.class, jamrecordformclvdragger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))),(Object)(BA.numberCast(double.class, jamrecordformclvdragger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
jamrecordformclvdragger._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamrecordformclvdragger._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
jamrecordformclvdragger._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",jamrecordformclvdragger._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private list As CustomListView";
jamrecordformclvdragger._list = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_list",jamrecordformclvdragger._list);
 //BA.debugLineNum = 6;BA.debugLine="Private PressedColor As Int";
jamrecordformclvdragger._pressedcolor = RemoteObject.createImmutable(0);__ref.setField("_pressedcolor",jamrecordformclvdragger._pressedcolor);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _drag_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Drag_MousePressed (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("drag_mousepressed")) { __ref.runUserSub(false, "jamrecordformclvdragger","drag_mousepressed", __ref, _eventdata); return;}
ResumableSub_Drag_MousePressed rsub = new ResumableSub_Drag_MousePressed(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Drag_MousePressed extends BA.ResumableSub {
public ResumableSub_Drag_MousePressed(b4j.docU.jamrecordformclvdragger parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamrecordformclvdragger parent;
RemoteObject _eventdata;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _liststarty = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _listy = RemoteObject.createImmutable(0);
RemoteObject _delta = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Drag_MousePressed (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 65;BA.debugLine="Dim lbl As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 66;BA.debugLine="Dim list As CustomListView = lbl.Tag";
Debug.JustUpdateDeviceLine();
parent._list = (_lbl.runMethod(false,"getTag"));__ref.setField("_list",parent._list);
 BA.debugLineNum = 67;BA.debugLine="Dim pnl As B4XView = list.GetPanel(list.GetItemFr";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",(Object)(_lbl)))).runMethod(false,"getParent");Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 68;BA.debugLine="pnl.GetView(0).SetColorAndBorder(xui.Color_Transp";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(int.class, ((int)0xff503acd))),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 69;BA.debugLine="Dim ListStartY As Int = EventData.Y + lbl.Top + p";
Debug.JustUpdateDeviceLine();
_liststarty = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getY"),_lbl.runMethod(true,"getTop"),_pnl.runMethod(true,"getTop")}, "++",2, 0));Debug.locals.put("ListStartY", _liststarty);Debug.locals.put("ListStartY", _liststarty);
 BA.debugLineNum = 70;BA.debugLine="pnl.BringToFront";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("BringToFront");
 BA.debugLineNum = 71;BA.debugLine="Dim Top As Int = pnl.Top";
Debug.JustUpdateDeviceLine();
_top = BA.numberCast(int.class, _pnl.runMethod(true,"getTop"));Debug.locals.put("Top", _top);Debug.locals.put("Top", _top);
 BA.debugLineNum = 72;BA.debugLine="Do While True";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 10;
while (parent.__c.getField(true,"True").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 73;BA.debugLine="Wait For (lbl) Drag_MouseDragged (EventData As M";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","drag_mousedragged", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamrecordformclvdragger", "drag_mousepressed"), (_lbl.getObject()));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_eventdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("EventData", _eventdata);
;
 BA.debugLineNum = 74;BA.debugLine="If pnl.Top < list.sv.ScrollViewOffsetY Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("<",_pnl.runMethod(true,"getTop"),__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 76;BA.debugLine="Else If list.sv.ScrollViewOffsetY + list.sv.Heig";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"),__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getHeight")}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 0))) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 75;BA.debugLine="list.sv.ScrollViewOffsetY = Max(0, list.sv.Scro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewOffsetY",parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 77;BA.debugLine="list.sv.ScrollViewOffsetY = list.sv.ScrollViewO";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setScrollViewOffsetY",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_list" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewOffsetY"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0));
 if (true) break;

case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 79;BA.debugLine="Dim ListY As Int = EventData.Y + lbl.Top + pnl.T";
Debug.JustUpdateDeviceLine();
_listy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getY"),_lbl.runMethod(true,"getTop"),_pnl.runMethod(true,"getTop")}, "++",2, 0));Debug.locals.put("ListY", _listy);Debug.locals.put("ListY", _listy);
 BA.debugLineNum = 80;BA.debugLine="Dim delta As Int = ListY - ListStartY";
Debug.JustUpdateDeviceLine();
_delta = RemoteObject.solve(new RemoteObject[] {_listy,_liststarty}, "-",1, 1);Debug.locals.put("delta", _delta);Debug.locals.put("delta", _delta);
 BA.debugLineNum = 81;BA.debugLine="pnl.Top = Top + delta";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setTop",BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_top,_delta}, "+",1, 1)));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
public static void  _drag_mousedragged(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
}
public static RemoteObject  _drag_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Drag_MouseReleased (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("drag_mousereleased")) { return __ref.runUserSub(false, "jamrecordformclvdragger","drag_mousereleased", __ref, _eventdata);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _newindex = RemoteObject.createImmutable(0);
RemoteObject _underlyingitem = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
RemoteObject _actualitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rawitem = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 85;BA.debugLine="Private Sub Drag_MouseReleased (EventData As Mouse";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Dim lbl As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamrecordformclvdragger.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 87;BA.debugLine="Dim list As CustomListView = lbl.Tag";
Debug.JustUpdateDeviceLine();
jamrecordformclvdragger._list = (_lbl.runMethod(false,"getTag"));__ref.setField("_list",jamrecordformclvdragger._list);
 BA.debugLineNum = 88;BA.debugLine="Dim index As Int = list.GetItemFromView(lbl)";
Debug.JustUpdateDeviceLine();
_index = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_getitemfromview",(Object)(_lbl));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 89;BA.debugLine="Dim pnl As B4XView = list.GetPanel(index).Parent";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index)).runMethod(false,"getParent");Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 90;BA.debugLine="Dim Offset As Int = pnl.Top + pnl.Height / 2";
Debug.JustUpdateDeviceLine();
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0));Debug.locals.put("Offset", _offset);Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 91;BA.debugLine="Dim NewIndex As Int = list.FindIndexFromOffset(Of";
Debug.JustUpdateDeviceLine();
_newindex = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_findindexfromoffset",(Object)(_offset));Debug.locals.put("NewIndex", _newindex);Debug.locals.put("NewIndex", _newindex);
 BA.debugLineNum = 92;BA.debugLine="Dim UnderlyingItem As CLVItem = list.GetRawListIt";
Debug.JustUpdateDeviceLine();
_underlyingitem = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_newindex));Debug.locals.put("UnderlyingItem", _underlyingitem);Debug.locals.put("UnderlyingItem", _underlyingitem);
 BA.debugLineNum = 93;BA.debugLine="If Offset - UnderlyingItem.Offset > UnderlyingIte";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_offset,_underlyingitem.getField(true,"Offset")}, "-",1, 1),RemoteObject.solve(new RemoteObject[] {_underlyingitem.getField(true,"Size"),RemoteObject.createImmutable(2)}, "/",0, 0))) { 
_newindex = RemoteObject.solve(new RemoteObject[] {_newindex,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NewIndex", _newindex);};
 BA.debugLineNum = 94;BA.debugLine="Dim ActualItem As B4XView = pnl.GetView(0)";
Debug.JustUpdateDeviceLine();
_actualitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_actualitem = _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ActualItem", _actualitem);Debug.locals.put("ActualItem", _actualitem);
 BA.debugLineNum = 95;BA.debugLine="ActualItem.SetColorAndBorder(pnl.Color, 0dip, xui";
Debug.JustUpdateDeviceLine();
_actualitem.runVoidMethod ("SetColorAndBorder",(Object)(_pnl.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, jamrecordformclvdragger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 96;BA.debugLine="Dim RawItem As CLVItem = list.GetRawListItem(inde";
Debug.JustUpdateDeviceLine();
_rawitem = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_index));Debug.locals.put("RawItem", _rawitem);Debug.locals.put("RawItem", _rawitem);
 BA.debugLineNum = 97;BA.debugLine="list.RemoveAt(index)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 98;BA.debugLine="If NewIndex > index Then NewIndex = NewIndex - 1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_newindex,BA.numberCast(double.class, _index))) { 
_newindex = RemoteObject.solve(new RemoteObject[] {_newindex,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("NewIndex", _newindex);};
 BA.debugLineNum = 99;BA.debugLine="NewIndex = Max(0, Min(list.Size, NewIndex))";
Debug.JustUpdateDeviceLine();
_newindex = BA.numberCast(int.class, jamrecordformclvdragger.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(jamrecordformclvdragger.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_getsize"))),(Object)(BA.numberCast(double.class, _newindex))))));Debug.locals.put("NewIndex", _newindex);
 BA.debugLineNum = 100;BA.debugLine="list.InsertAt(NewIndex, ActualItem, RawItem.Value";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runVoidMethod ("_insertat",(Object)(_newindex),(Object)(_actualitem),(Object)(_rawitem.getField(false,"Value")));
 BA.debugLineNum = 101;BA.debugLine="list.GetRawListItem(NewIndex).TextItem = RawItem.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(_newindex)).setField ("TextItem",_rawitem.getField(true,"TextItem"));
 BA.debugLineNum = 103;BA.debugLine="Log(\"Drag_MouseReleased\")";
Debug.JustUpdateDeviceLine();
jamrecordformclvdragger.__c.runVoidMethod ("LogImpl","9132382738",RemoteObject.createImmutable("Drag_MouseReleased"),0);
 BA.debugLineNum = 104;BA.debugLine="CallSubDelayed(jamRecordFormBuilder,\"RecalcularID";
Debug.JustUpdateDeviceLine();
jamrecordformclvdragger.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)((jamrecordformclvdragger._jamrecordformbuilder.getObject())),(Object)(RemoteObject.createImmutable("RecalcularIDOrdenColumnas")));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _clv) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamrecordformclvdragger","initialize", __ref, _ba, _clv);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("clv", _clv);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize (clv As CustomListView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="list = clv";
Debug.JustUpdateDeviceLine();
__ref.setField ("_list" /*RemoteObject*/ ,_clv);
 BA.debugLineNum = 11;BA.debugLine="PressedColor = list.PressedColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressedcolor" /*RemoteObject*/ ,__ref.getField(false,"_list" /*RemoteObject*/ ).getField(true,"_pressedcolor"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _islastviewadraglabel(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("IsLastViewADragLabel (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("islastviewadraglabel")) { return __ref.runUserSub(false, "jamrecordformclvdragger","islastviewadraglabel", __ref, _p);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("p", _p);
 BA.debugLineNum = 34;BA.debugLine="Private Sub IsLastViewADragLabel (p As B4XView) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 36;BA.debugLine="Dim v As B4XView = p.GetView(p.NumberOfViews - 1";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = _p.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 37;BA.debugLine="Return v Is Label And v.Tag = list";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label")) && RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),(__ref.getField(false,"_list" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 39;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return jamrecordformclvdragger.__c.getField(true,"False");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removedragbuttons(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveDragButtons (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("removedragbuttons")) { return __ref.runUserSub(false, "jamrecordformclvdragger","removedragbuttons", __ref);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 24;BA.debugLine="Public Sub RemoveDragButtons";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="For i = 0 To list.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 26;BA.debugLine="Dim p As B4XView = list.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 27;BA.debugLine="If IsLastViewADragLabel(p) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4j.docU.jamrecordformclvdragger.class, "_islastviewadraglabel" /*RemoteObject*/ ,(Object)(_p)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="p.GetView(p.NumberOfViews - 1).RemoveViewFromPa";
Debug.JustUpdateDeviceLine();
_p.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).runVoidMethod ("RemoveViewFromParent");
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 31;BA.debugLine="list.PressedColor = PressedColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).setField ("_pressedcolor",__ref.getField(true,"_pressedcolor" /*RemoteObject*/ ));
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
public static RemoteObject  _resize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Resize (jamrecordformclvdragger) ","jamrecordformclvdragger",68,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "jamrecordformclvdragger","resize", __ref);}
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 14;BA.debugLine="Public Sub Resize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="For i = 0 To list.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 16;BA.debugLine="Dim p As B4XView = list.GetPanel(i)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_list" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 17;BA.debugLine="Dim v As B4XView = p.GetView(p.NumberOfViews - 1";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = _p.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 18;BA.debugLine="If v Is Label And v.Tag = list Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label")) && RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),(__ref.getField(false,"_list" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 19;BA.debugLine="v.Left = p.Width - 32dip";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getWidth"),jamrecordformclvdragger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))}, "-",1, 0));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 22;BA.debugLine="End Sub";
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