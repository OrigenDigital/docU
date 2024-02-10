package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamb4xlongtexttemplate_subs_0 {


public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _texto,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","addtextitem", __ref, _texto, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _item = RemoteObject.declareNull("b4j.example.customlistview._clvitem");
Debug.locals.put("Texto", _texto);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 56;BA.debugLine="Public Sub AddTextItem(Texto As Object, Value As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = __ref.runClassMethod (b4j.docU.jamb4xlongtexttemplate.class, "_createpanel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 67;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (b4j.docU.jamb4xlongtexttemplate.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_text" /*RemoteObject*/ ))));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 68;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setHeight",jamb4xlongtexttemplate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(_lbl.runMethod(true,"getHeight"))));
 BA.debugLineNum = 70;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, CustomListView1.sv.S";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(double.class, jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"),jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0)),(Object)(_lbl.runMethod(true,"getHeight")));
 BA.debugLineNum = 74;BA.debugLine="If xui.IsB4i = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"),jamb4xlongtexttemplate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="lbl.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 77;BA.debugLine="pnl.Color = TextBackgroundColor";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setColor",__ref.getField(true,"_textbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 78;BA.debugLine="pnl.Height = lbl.Height + 2dip";
Debug.JustUpdateDeviceLine();
_pnl.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0));
 BA.debugLineNum = 79;BA.debugLine="CustomListView1.InsertAt(0, pnl, Value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_insertat",(Object)(BA.numberCast(int.class, 0)),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 80;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawListI";
Debug.JustUpdateDeviceLine();
_item = __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getrawlistitem",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 81;BA.debugLine="item.TextItem = True";
Debug.JustUpdateDeviceLine();
_item.setField ("TextItem",jamb4xlongtexttemplate.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
jamb4xlongtexttemplate._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamb4xlongtexttemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
jamb4xlongtexttemplate._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",jamb4xlongtexttemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Public CustomListView1 As CustomListView";
jamb4xlongtexttemplate._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",jamb4xlongtexttemplate._customlistview1);
 //BA.debugLineNum = 5;BA.debugLine="Public Text As Object";
jamb4xlongtexttemplate._text = RemoteObject.createNew ("Object");__ref.setField("_text",jamb4xlongtexttemplate._text);
 //BA.debugLineNum = 6;BA.debugLine="Public TextFont As B4XFont";
jamb4xlongtexttemplate._textfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_textfont",jamb4xlongtexttemplate._textfont);
 //BA.debugLineNum = 7;BA.debugLine="Public TextSize As Float";
jamb4xlongtexttemplate._textsize = RemoteObject.createImmutable(0f);__ref.setField("_textsize",jamb4xlongtexttemplate._textsize);
 //BA.debugLineNum = 8;BA.debugLine="Public TextColor As Int";
jamb4xlongtexttemplate._textcolor = RemoteObject.createImmutable(0);__ref.setField("_textcolor",jamb4xlongtexttemplate._textcolor);
 //BA.debugLineNum = 9;BA.debugLine="Public TextBackgroundColor As Int";
jamb4xlongtexttemplate._textbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_textbackgroundcolor",jamb4xlongtexttemplate._textbackgroundcolor);
 //BA.debugLineNum = 10;BA.debugLine="Public CLVBackgroundColor As Int";
jamb4xlongtexttemplate._clvbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_clvbackgroundcolor",jamb4xlongtexttemplate._clvbackgroundcolor);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","createlabel", __ref, _txt);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _b4xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 112;BA.debugLine="Private Sub CreateLabel(txt As String) As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 114;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 119;BA.debugLine="Dim B4Xlbl As B4XView=lbl";
Debug.JustUpdateDeviceLine();
_b4xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("B4Xlbl", _b4xlbl);Debug.locals.put("B4Xlbl", _b4xlbl);
 BA.debugLineNum = 121;BA.debugLine="B4Xlbl.Font = TextFont";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(false,"setFont",__ref.getField(false,"_textfont" /*RemoteObject*/ ));
 BA.debugLineNum = 122;BA.debugLine="B4Xlbl.TextSize=TextSize";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_textsize" /*RemoteObject*/ )));
 BA.debugLineNum = 123;BA.debugLine="B4Xlbl.TextColor=TextColor";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 124;BA.debugLine="B4Xlbl.Color=TextBackgroundColor";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setColor",__ref.getField(true,"_textbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 125;BA.debugLine="B4Xlbl.SetTextAlignment(\"TOP\",\"LEFT\")";
Debug.JustUpdateDeviceLine();
_b4xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 126;BA.debugLine="lbl.WrapText = True";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setWrapText",jamb4xlongtexttemplate.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="lbl.Text = txt";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setText",_txt);
 BA.debugLineNum = 128;BA.debugLine="Dim jo As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 129;BA.debugLine="Dim width As Double = CustomListView1.sv.ScrollVi";
Debug.JustUpdateDeviceLine();
_width = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"getScrollViewContentWidth"),RemoteObject.createImmutable(10)}, "-",1, 0);Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 130;BA.debugLine="lbl.PrefHeight = 10dip + Round(jo.RunMethod(\"Meas";
Debug.JustUpdateDeviceLine();
_lbl.runMethod(true,"setPrefHeight",BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),jamb4xlongtexttemplate.__c.runMethod(true,"Round",(Object)(BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_lbl.runMethod(false,"getFont").getObject()),(_txt),(_width)}))))))}, "+",1, 2)));
 BA.debugLineNum = 131;BA.debugLine="Return lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanel(RemoteObject __ref,RemoteObject _paneleventname) throws Exception{
try {
		Debug.PushSubsStack("CreatePanel (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("createpanel")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","createpanel", __ref, _paneleventname);}
Debug.locals.put("PanelEventName", _paneleventname);
 BA.debugLineNum = 84;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(_paneleventname));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 49;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 36;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, jamb4xlongtexttemplate.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 17;BA.debugLine="mBase.LoadLayout(\"scrJamLongTextTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrJamLongTextTemplate")),__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 19;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 20;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = Text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",__ref.getField(true,"_textbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 21;BA.debugLine="CustomListView1.DefaultTextColor = TextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 22;BA.debugLine="CustomListView1.sv.Color =TextBackgroundColor  '";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(true,"_textbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 24;BA.debugLine="Dim sv As Node = CustomListView1.sv";
Debug.JustUpdateDeviceLine();
_sv = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_sv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").getObject());Debug.locals.put("sv", _sv);Debug.locals.put("sv", _sv);
 BA.debugLineNum = 25;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
Debug.JustUpdateDeviceLine();
_sv.runMethod(false,"getStyleClasses").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b4xdialog"))));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 31;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_asview").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 32;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_base_resize",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (jamb4xlongtexttemplate) ","jamb4xlongtexttemplate",80,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "jamb4xlongtexttemplate","show", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 40;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="CustomListView1.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 43;BA.debugLine="AddTextItem(Text,\"\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamb4xlongtexttemplate.class, "_addtextitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_text" /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 44;BA.debugLine="CustomListView1.sv.Color=CLVBackgroundColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(true,"_clvbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 45;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("TOP")),(Object)(RemoteObject.createImmutable("LEFT")));
 BA.debugLineNum = 46;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
Debug.JustUpdateDeviceLine();
jamb4xlongtexttemplate._xuiviewsutils.runVoidMethod ("_addstubtoclvifneeded" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_customlistview1" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_textbackgroundcolor" /*RemoteObject*/ )));
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