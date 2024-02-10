package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamclickablebadges_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
jamclickablebadges._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamclickablebadges._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object";
jamclickablebadges._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",jamclickablebadges._mcallback);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String";
jamclickablebadges._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",jamclickablebadges._meventname);
 //BA.debugLineNum = 18;BA.debugLine="Private mViews As Map";
jamclickablebadges._mviews = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mviews",jamclickablebadges._mviews);
 //BA.debugLineNum = 19;BA.debugLine="Private stub As B4XView 'ignore";
jamclickablebadges._stub = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_stub",jamclickablebadges._stub);
 //BA.debugLineNum = 24;BA.debugLine="Private lstBadges As List";
jamclickablebadges._lstbadges = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstbadges",jamclickablebadges._lstbadges);
 //BA.debugLineNum = 26;BA.debugLine="Private xui As XUI";
jamclickablebadges._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamclickablebadges._xui);
 //BA.debugLineNum = 30;BA.debugLine="Type JamClickableBadgeData(ParentView As B4XView,";
;
 //BA.debugLineNum = 33;BA.debugLine="Public const DataTypeString As String=\"string\"";
jamclickablebadges._datatypestring = BA.ObjectToString("string");__ref.setField("_datatypestring",jamclickablebadges._datatypestring);
 //BA.debugLineNum = 34;BA.debugLine="Public const DataTypeInt As String=\"int\"";
jamclickablebadges._datatypeint = BA.ObjectToString("int");__ref.setField("_datatypeint",jamclickablebadges._datatypeint);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _databadge) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "jamclickablebadges","createlabel", __ref, _databadge);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _svalue = RemoteObject.createImmutable("");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
RemoteObject _duration = RemoteObject.createImmutable(0);
Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 192;BA.debugLine="Private Sub CreateLabel(DataBadge As JamClickableB";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="Dim p As B4XView=DataBadge.Panel";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _databadge.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 194;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 195;BA.debugLine="lbl.Initialize(\"lblBadge\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lblBadge")));
 BA.debugLineNum = 196;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 197;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(DataBadge.T";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(_databadge.getField(true,"TextSize" /*RemoteObject*/ ))));
 BA.debugLineNum = 198;BA.debugLine="xlbl.TextColor = DataBadge.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",_databadge.getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 199;BA.debugLine="Select Case DataBadge.DataType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_databadge.getField(true,"DataType" /*RemoteObject*/ ),BA.ObjectToString("string"),BA.ObjectToString("int"))) {
case 0: {
 BA.debugLineNum = 201;BA.debugLine="Dim sValue As String=DataBadge.Value";
Debug.JustUpdateDeviceLine();
_svalue = BA.ObjectToString(_databadge.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 202;BA.debugLine="xlbl.Text = sValue";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",_svalue);
 break; }
case 1: {
 BA.debugLineNum = 204;BA.debugLine="Dim intValue As Int=DataBadge.Value";
Debug.JustUpdateDeviceLine();
_intvalue = BA.numberCast(int.class, _databadge.getField(false,"Value" /*RemoteObject*/ ));Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 205;BA.debugLine="xlbl.Text =intValue";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.NumberToString(_intvalue));
 break; }
}
;
 BA.debugLineNum = 208;BA.debugLine="p.AddView(xlbl, DataBadge.Radius, DataBadge.Radiu";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, _databadge.getField(true,"Radius" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"Radius" /*RemoteObject*/ ),jamclickablebadges.__c.runMethod(true,"Max",(Object)((RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"TextSize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(double.class, 0)))}, "-",1, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 209;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 210;BA.debugLine="Dim duration As Int = DataBadge.AnimationDuration";
Debug.JustUpdateDeviceLine();
_duration = _databadge.getField(true,"AnimationDuration" /*RemoteObject*/ );Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 211;BA.debugLine="xlbl.SetLayoutAnimated(duration, 0, 0, DataBadge.";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"Radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"Radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))));
 BA.debugLineNum = 212;BA.debugLine="xlbl.Visible = False";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setVisible",jamclickablebadges.__c.getField(true,"False"));
 BA.debugLineNum = 213;BA.debugLine="xlbl.SetVisibleAnimated(DataBadge.AnimationDurati";
Debug.JustUpdateDeviceLine();
_xlbl.runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(_databadge.getField(true,"AnimationDuration" /*RemoteObject*/ )),(Object)(jamclickablebadges.__c.getField(true,"True")));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnewpanel(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("CreateNewPanel (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("createnewpanel")) { return __ref.runUserSub(false, "jamclickablebadges","createnewpanel", __ref, _view);}
RemoteObject _databadge = RemoteObject.declareNull("b4j.docU.jamclickablebadges._jamclickablebadgedata");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _xp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("view", _view);
 BA.debugLineNum = 172;BA.debugLine="Private Sub CreateNewPanel(view As B4XView) As B4X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 173;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataBad";
Debug.JustUpdateDeviceLine();
_databadge = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getdatabadge" /*RemoteObject*/ ,(Object)((_view.getObject())));Debug.locals.put("DataBadge", _databadge);Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 175;BA.debugLine="Dim p As Pane";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 179;BA.debugLine="p.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 183;BA.debugLine="Dim xp As B4XView = p";
Debug.JustUpdateDeviceLine();
_xp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());Debug.locals.put("xp", _xp);Debug.locals.put("xp", _xp);
 BA.debugLineNum = 184;BA.debugLine="xp.SetColorAndBorder(DataBadge.BackGroundColor, 0";
Debug.JustUpdateDeviceLine();
_xp.runVoidMethod ("SetColorAndBorder",(Object)(_databadge.getField(true,"BackGroundColor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(_databadge.getField(true,"BackGroundColor" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, _databadge.getField(true,"Radius" /*RemoteObject*/ ))));
 BA.debugLineNum = 187;BA.debugLine="Dim parent As B4XView = view.Parent";
Debug.JustUpdateDeviceLine();
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = _view.runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 188;BA.debugLine="parent.AddView(xp, GetCx(view), GetCy(view), 0, 0";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_xp.getObject())),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getcx" /*RemoteObject*/ ,(Object)(_view)))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getcy" /*RemoteObject*/ ,(Object)(_view)))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 189;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcx(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("GetCx (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("getcx")) { return __ref.runUserSub(false, "jamclickablebadges","getcx", __ref, _view);}
RemoteObject _cx = RemoteObject.createImmutable(0f);
Debug.locals.put("view", _view);
 BA.debugLineNum = 158;BA.debugLine="private Sub GetCx(view As B4XView) As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Dim cx As Float= view.Left + view.Width";
Debug.JustUpdateDeviceLine();
_cx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_view.runMethod(true,"getLeft"),_view.runMethod(true,"getWidth")}, "+",1, 0));Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 160;BA.debugLine="Return cx";
Debug.JustUpdateDeviceLine();
if (true) return _cx;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcy(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("GetCy (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("getcy")) { return __ref.runUserSub(false, "jamclickablebadges","getcy", __ref, _view);}
RemoteObject _cy = RemoteObject.createImmutable(0f);
Debug.locals.put("view", _view);
 BA.debugLineNum = 163;BA.debugLine="private Sub GetCy(view As B4XView) As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="Dim cy As Float= view.Top";
Debug.JustUpdateDeviceLine();
_cy = BA.numberCast(float.class, _view.runMethod(true,"getTop"));Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 165;BA.debugLine="Return cy";
Debug.JustUpdateDeviceLine();
if (true) return _cy;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdatabadge(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("GetDataBadge (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("getdatabadge")) { return __ref.runUserSub(false, "jamclickablebadges","getdatabadge", __ref, _view);}
RemoteObject _databadge = RemoteObject.declareNull("b4j.docU.jamclickablebadges._jamclickablebadgedata");
Debug.locals.put("view", _view);
 BA.debugLineNum = 140;BA.debugLine="Public Sub GetDataBadge(view As Object) As JamClic";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="If mViews.ContainsKey(view) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mviews" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)(_view)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 143;BA.debugLine="Dim DataBadge As JamClickableBadgeData=mViews.Ge";
Debug.JustUpdateDeviceLine();
_databadge = (__ref.getField(false,"_mviews" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_view)));Debug.locals.put("DataBadge", _databadge);Debug.locals.put("DataBadge", _databadge);
 }else {
 BA.debugLineNum = 145;BA.debugLine="Dim DataBadge As JamClickableBadgeData";
Debug.JustUpdateDeviceLine();
_databadge = RemoteObject.createNew ("b4j.docU.jamclickablebadges._jamclickablebadgedata");Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 146;BA.debugLine="DataBadge.Initialize";
Debug.JustUpdateDeviceLine();
_databadge.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 148;BA.debugLine="Return	DataBadge";
Debug.JustUpdateDeviceLine();
if (true) return _databadge;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabel(RemoteObject __ref,RemoteObject _panel) throws Exception{
try {
		Debug.PushSubsStack("GetLabel (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("getlabel")) { return __ref.runUserSub(false, "jamclickablebadges","getlabel", __ref, _panel);}
Debug.locals.put("panel", _panel);
 BA.debugLineNum = 168;BA.debugLine="Private Sub GetLabel(panel As B4XView) As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 169;BA.debugLine="Return panel.GetView(panel.NumberOfViews - 1)";
Debug.JustUpdateDeviceLine();
if (true) return _panel.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_panel.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "jamclickablebadges","getpanel", __ref, _view);}
RemoteObject _databadge = RemoteObject.declareNull("b4j.docU.jamclickablebadges._jamclickablebadgedata");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("view", _view);
 BA.debugLineNum = 151;BA.debugLine="Private Sub GetPanel (view As Object) As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="Dim DataBadge As JamClickableBadgeData=mViews.Get";
Debug.JustUpdateDeviceLine();
_databadge = (__ref.getField(false,"_mviews" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_view)));Debug.locals.put("DataBadge", _databadge);Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 154;BA.debugLine="Dim p As B4XView=DataBadge.panel";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _databadge.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 155;BA.debugLine="Return p";
Debug.JustUpdateDeviceLine();
if (true) return _p;
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamclickablebadges","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize(CallBack As Object, EventNam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="mCallBack=CallBack";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 40;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 41;BA.debugLine="mViews.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mviews" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="lstBadges.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lstbadges" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblbadge_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblBadge_MouseReleased (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("lblbadge_mousereleased")) { return __ref.runUserSub(false, "jamclickablebadges","lblbadge_mousereleased", __ref, _eventdata);}
RemoteObject _lblbadge = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bfound = RemoteObject.createImmutable(false);
RemoteObject _b4xv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _databadge = RemoteObject.declareNull("b4j.docU.jamclickablebadges._jamclickablebadgedata");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 217;BA.debugLine="Sub lblBadge_MouseReleased (EventData As MouseEven";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="Dim lblBadge As B4XView=Sender";
Debug.JustUpdateDeviceLine();
_lblbadge = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lblbadge = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), jamclickablebadges.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("lblBadge", _lblbadge);Debug.locals.put("lblBadge", _lblbadge);
 BA.debugLineNum = 219;BA.debugLine="If SubExists(mCallBack,mEventName & \"_BadgeClick\"";
Debug.JustUpdateDeviceLine();
if (jamclickablebadges.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_BadgeClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 220;BA.debugLine="Dim p As B4XView=lblBadge.Parent";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _lblbadge.runMethod(false,"getParent");Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 222;BA.debugLine="Dim bFound As Boolean";
Debug.JustUpdateDeviceLine();
_bfound = RemoteObject.createImmutable(false);Debug.locals.put("bFound", _bfound);
 BA.debugLineNum = 223;BA.debugLine="For Each B4Xv As B4XView In mViews.Keys";
Debug.JustUpdateDeviceLine();
_b4xv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group5 = __ref.getField(false,"_mviews" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_b4xv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group5.runMethod(false,"Get",index5));Debug.locals.put("B4Xv", _b4xv);
Debug.locals.put("B4Xv", _b4xv);
 BA.debugLineNum = 224;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataB";
Debug.JustUpdateDeviceLine();
_databadge = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getdatabadge" /*RemoteObject*/ ,(Object)((_b4xv.getObject())));Debug.locals.put("DataBadge", _databadge);Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 225;BA.debugLine="If p=DataBadge.Panel Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p,_databadge.getField(false,"Panel" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 226;BA.debugLine="bFound=True";
Debug.JustUpdateDeviceLine();
_bfound = jamclickablebadges.__c.getField(true,"True");Debug.locals.put("bFound", _bfound);
 BA.debugLineNum = 227;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("B4Xv", _b4xv);
;
 BA.debugLineNum = 230;BA.debugLine="If bFound Then CallSub2(mCallBack,mEventName & \"";
Debug.JustUpdateDeviceLine();
if (_bfound.<Boolean>get().booleanValue()) { 
jamclickablebadges.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_BadgeClick"))),(Object)((_databadge)));};
 };
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removebadge(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("RemoveBadge (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("removebadge")) { return __ref.runUserSub(false, "jamclickablebadges","removebadge", __ref, _view);}
ResumableSub_RemoveBadge rsub = new ResumableSub_RemoveBadge(null,__ref,_view);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RemoveBadge extends BA.ResumableSub {
public ResumableSub_RemoveBadge(b4j.docU.jamclickablebadges parent,RemoteObject __ref,RemoteObject _view) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamclickablebadges parent;
RemoteObject _view;
RemoteObject _databadge = RemoteObject.declareNull("b4j.docU.jamclickablebadges._jamclickablebadgedata");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveBadge (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,103);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("view", _view);
 BA.debugLineNum = 104;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataBad";
Debug.JustUpdateDeviceLine();
_databadge = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getdatabadge" /*RemoteObject*/ ,(Object)((_view.getObject())));Debug.locals.put("DataBadge", _databadge);Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 105;BA.debugLine="Dim p As B4XView = GetPanel(view)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getpanel" /*RemoteObject*/ ,(Object)((_view.getObject())));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="GetLabel(p).RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getlabel" /*RemoteObject*/ ,(Object)(_p)).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 107;BA.debugLine="mViews.Remove(view)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mviews" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_view.getObject())));
 BA.debugLineNum = 108;BA.debugLine="p.SetLayoutAnimated(DataBadge.AnimationDuration,";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(_databadge.getField(true,"AnimationDuration" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getcx" /*RemoteObject*/ ,(Object)(_view)))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getcy" /*RemoteObject*/ ,(Object)(_view)))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 109;BA.debugLine="Sleep(DataBadge.AnimationDuration)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamclickablebadges", "removebadge"),_databadge.getField(true,"AnimationDuration" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 110;BA.debugLine="p.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 111;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
public static RemoteObject  _replacelabel(RemoteObject __ref,RemoteObject _view,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ReplaceLabel (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("replacelabel")) { return __ref.runUserSub(false, "jamclickablebadges","replacelabel", __ref, _view, _value);}
ResumableSub_ReplaceLabel rsub = new ResumableSub_ReplaceLabel(null,__ref,_view,_value);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReplaceLabel extends BA.ResumableSub {
public ResumableSub_ReplaceLabel(b4j.docU.jamclickablebadges parent,RemoteObject __ref,RemoteObject _view,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamclickablebadges parent;
RemoteObject _view;
RemoteObject _value;
RemoteObject _databadge = RemoteObject.declareNull("b4j.docU.jamclickablebadges._jamclickablebadgedata");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReplaceLabel (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,118);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("view", _view);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 119;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataBad";
Debug.JustUpdateDeviceLine();
_databadge = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getdatabadge" /*RemoteObject*/ ,(Object)((_view.getObject())));Debug.locals.put("DataBadge", _databadge);Debug.locals.put("DataBadge", _databadge);
 BA.debugLineNum = 120;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getlabel" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getpanel" /*RemoteObject*/ ,(Object)((_view.getObject())))));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 121;BA.debugLine="lbl.SetLayoutAnimated(DataBadge.AnimationDuration";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"AnimationDuration" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"Radius" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"Radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"Radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))));
 BA.debugLineNum = 122;BA.debugLine="DataBadge.Value=Value";
Debug.JustUpdateDeviceLine();
_databadge.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 123;BA.debugLine="CreateLabel(DataBadge)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_createlabel" /*RemoteObject*/ ,(Object)(_databadge));
 BA.debugLineNum = 124;BA.debugLine="Sleep(DataBadge.AnimationDuration / 2)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamclickablebadges", "replacelabel"),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_databadge.getField(true,"AnimationDuration" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 125;BA.debugLine="lbl.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 126;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
public static RemoteObject  _setbadge(RemoteObject __ref,RemoteObject _view,RemoteObject _badgedata) throws Exception{
try {
		Debug.PushSubsStack("SetBadge (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setbadge")) { return __ref.runUserSub(false, "jamclickablebadges","setbadge", __ref, _view, _badgedata);}
ResumableSub_SetBadge rsub = new ResumableSub_SetBadge(null,__ref,_view,_badgedata);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetBadge extends BA.ResumableSub {
public ResumableSub_SetBadge(b4j.docU.jamclickablebadges parent,RemoteObject __ref,RemoteObject _view,RemoteObject _badgedata) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._badgedata = _badgedata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamclickablebadges parent;
RemoteObject _view;
RemoteObject _badgedata;
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetBadge (jamclickablebadges) ","jamclickablebadges",65,__ref.getField(false, "ba"),__ref,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("view", _view);
Debug.locals.put("BadgeData", _badgedata);
 BA.debugLineNum = 77;BA.debugLine="If mViews.ContainsKey(view) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 48;
if (__ref.getField(false,"_mviews" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_view.getObject()))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 48;
 BA.debugLineNum = 78;BA.debugLine="wait for(ReplaceLabel(view, BadgeData.Value)) co";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamclickablebadges", "setbadge"), __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_replacelabel" /*RemoteObject*/ ,(Object)(_view),(Object)(_badgedata.getField(false,"Value" /*RemoteObject*/ ))));
this.state = 49;
return;
case 49:
//C
this.state = 48;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 80;BA.debugLine="If BadgeData.BackGroundColor=0 Then BadgeData.Ba";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_badgedata.getField(true,"BackGroundColor" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
_badgedata.setField ("BackGroundColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 81;BA.debugLine="If BadgeData.TextColor=0 Then BadgeData.TextColo";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_badgedata.getField(true,"TextColor" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
_badgedata.setField ("TextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 82;BA.debugLine="If BadgeData.TextSize=0 Then BadgeData.TextSize=";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_badgedata.getField(true,"TextSize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_badgedata.setField ("TextSize" /*RemoteObject*/ ,BA.numberCast(float.class, 16));
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 83;BA.debugLine="If BadgeData.DataType=Null Then BadgeData.DataTy";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("n",_badgedata.getField(true,"DataType" /*RemoteObject*/ ))) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
_badgedata.setField ("DataType" /*RemoteObject*/ ,__ref.getField(true,"_datatypestring" /*RemoteObject*/ ));
if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 84;BA.debugLine="If BadgeData.DataType=\"\" Then BadgeData.DataType";
Debug.JustUpdateDeviceLine();
if (true) break;

case 30:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_badgedata.getField(true,"DataType" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
_badgedata.setField ("DataType" /*RemoteObject*/ ,__ref.getField(true,"_datatypestring" /*RemoteObject*/ ));
if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 85;BA.debugLine="If BadgeData.AnimationDuration=0 Then BadgeData.";
Debug.JustUpdateDeviceLine();
if (true) break;

case 36:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",_badgedata.getField(true,"AnimationDuration" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
_badgedata.setField ("AnimationDuration" /*RemoteObject*/ ,BA.numberCast(int.class, 250));
if (true) break;

case 41:
//C
this.state = 42;
;
 BA.debugLineNum = 86;BA.debugLine="If BadgeData.Radius=0 Then BadgeData.Radius=15di";
Debug.JustUpdateDeviceLine();
if (true) break;

case 42:
//if
this.state = 47;
if (RemoteObject.solveBoolean("=",_badgedata.getField(true,"Radius" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
_badgedata.setField ("Radius" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 88;BA.debugLine="mViews.Put(view, BadgeData)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mviews" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_view.getObject())),(Object)((_badgedata)));
 BA.debugLineNum = 89;BA.debugLine="Dim p As B4XView = CreateNewPanel(view)";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_createnewpanel" /*RemoteObject*/ ,(Object)(_view));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 90;BA.debugLine="BadgeData.Panel=p";
Debug.JustUpdateDeviceLine();
_badgedata.setField ("Panel" /*RemoteObject*/ ,_p);
 BA.debugLineNum = 91;BA.debugLine="BadgeData.ParentView=view";
Debug.JustUpdateDeviceLine();
_badgedata.setField ("ParentView" /*RemoteObject*/ ,_view);
 BA.debugLineNum = 92;BA.debugLine="CreateLabel(BadgeData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_createlabel" /*RemoteObject*/ ,(Object)(_badgedata));
 BA.debugLineNum = 93;BA.debugLine="p.SetLayoutAnimated(BadgeData.AnimationDuration,";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(_badgedata.getField(true,"AnimationDuration" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getcx" /*RemoteObject*/ ,(Object)(_view)),_badgedata.getField(true,"Radius" /*RemoteObject*/ )}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.docU.jamclickablebadges.class, "_getcy" /*RemoteObject*/ ,(Object)(_view)),_badgedata.getField(true,"Radius" /*RemoteObject*/ )}, "-",1, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_badgedata.getField(true,"Radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_badgedata.getField(true,"Radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))));
 if (true) break;

case 48:
//C
this.state = -1;
;
 BA.debugLineNum = 95;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
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
public static void  _complete(RemoteObject __ref,RemoteObject _robj) throws Exception{
}
}