package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bblistitem_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "bblistitem","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 92;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mEventName As String 'ignore";
bblistitem._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",bblistitem._meventname);
 //BA.debugLineNum = 5;BA.debugLine="Private mCallBack As Object 'ignore";
bblistitem._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",bblistitem._mcallback);
 //BA.debugLineNum = 6;BA.debugLine="Public mBase As B4XView 'ignore";
bblistitem._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",bblistitem._mbase);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI 'ignore";
bblistitem._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bblistitem._xui);
 //BA.debugLineNum = 8;BA.debugLine="Private Runs As List";
bblistitem._runs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_runs",bblistitem._runs);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
bblistitem._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bblistitem._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Style As BCParagraphStyle";
bblistitem._style = RemoteObject.createNew ("b4j.docU.bctextengine._bcparagraphstyle");__ref.setField("_style",bblistitem._style);
 //BA.debugLineNum = 11;BA.debugLine="Private mTextEngine As BCTextEngine";
bblistitem._mtextengine = RemoteObject.createNew ("b4j.docU.bctextengine");__ref.setField("_mtextengine",bblistitem._mtextengine);
 //BA.debugLineNum = 12;BA.debugLine="Private mText As String";
bblistitem._mtext = RemoteObject.createImmutable("");__ref.setField("_mtext",bblistitem._mtext);
 //BA.debugLineNum = 13;BA.debugLine="Public Paragraph As BCParagraph";
bblistitem._paragraph = RemoteObject.createNew ("b4j.docU.bctextengine._bcparagraph");__ref.setField("_paragraph",bblistitem._paragraph);
 //BA.debugLineNum = 14;BA.debugLine="Private TouchPanel As B4XView";
bblistitem._touchpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_touchpanel",bblistitem._touchpanel);
 //BA.debugLineNum = 15;BA.debugLine="Public Padding As B4XRect";
bblistitem._padding = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");__ref.setField("_padding",bblistitem._padding);
 //BA.debugLineNum = 16;BA.debugLine="Public ParseData As BBCodeParseData";
bblistitem._parsedata = RemoteObject.createNew ("b4j.docU.bbcodeparser._bbcodeparsedata");__ref.setField("_parsedata",bblistitem._parsedata);
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
bblistitem._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",bblistitem._tag);
 //BA.debugLineNum = 18;BA.debugLine="Private ImageViewsCache As List";
bblistitem._imageviewscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_imageviewscache",bblistitem._imageviewscache);
 //BA.debugLineNum = 19;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
bblistitem._usedimageviews = RemoteObject.createNew ("b4j.docU.b4xorderedmap");__ref.setField("_usedimageviews",bblistitem._usedimageviews);
 //BA.debugLineNum = 20;BA.debugLine="Public RTL As Boolean";
bblistitem._rtl = RemoteObject.createImmutable(false);__ref.setField("_rtl",bblistitem._rtl);
 //BA.debugLineNum = 21;BA.debugLine="Private URLToLines As Map";
bblistitem._urltolines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_urltolines",bblistitem._urltolines);
 //BA.debugLineNum = 22;BA.debugLine="Public AutoUnderlineURLs As Boolean";
bblistitem._autounderlineurls = RemoteObject.createImmutable(false);__ref.setField("_autounderlineurls",bblistitem._autounderlineurls);
 //BA.debugLineNum = 23;BA.debugLine="Private UpdateOffsetY, UpdateHeight As Int";
bblistitem._updateoffsety = RemoteObject.createImmutable(0);__ref.setField("_updateoffsety",bblistitem._updateoffsety);
bblistitem._updateheight = RemoteObject.createImmutable(0);__ref.setField("_updateheight",bblistitem._updateheight);
 //BA.debugLineNum = 24;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
bblistitem._usedimageviews = RemoteObject.createNew ("b4j.docU.b4xorderedmap");__ref.setField("_usedimageviews",bblistitem._usedimageviews);
 //BA.debugLineNum = 25;BA.debugLine="Private StubScrollView As B4XView";
bblistitem._stubscrollview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_stubscrollview",bblistitem._stubscrollview);
 //BA.debugLineNum = 26;BA.debugLine="Private RenderIndex As Int";
bblistitem._renderindex = RemoteObject.createImmutable(0);__ref.setField("_renderindex",bblistitem._renderindex);
 //BA.debugLineNum = 27;BA.debugLine="Public TextIndex As Int";
bblistitem._textindex = RemoteObject.createImmutable(0);__ref.setField("_textindex",bblistitem._textindex);
 //BA.debugLineNum = 28;BA.debugLine="Private WaitingForDrawing As Boolean";
bblistitem._waitingfordrawing = RemoteObject.createImmutable(false);__ref.setField("_waitingfordrawing",bblistitem._waitingfordrawing);
 //BA.debugLineNum = 29;BA.debugLine="Public ExternalRuns As List";
bblistitem._externalruns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_externalruns",bblistitem._externalruns);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cleanexistingimageviews(RemoteObject __ref,RemoteObject _invisibleonly,RemoteObject _existing,RemoteObject _offset,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CleanExistingImageViews (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("cleanexistingimageviews")) { return __ref.runUserSub(false, "bblistitem","cleanexistingimageviews", __ref, _invisibleonly, _existing, _offset, _height);}
RemoteObject _line = RemoteObject.declareNull("b4j.docU.bctextengine._bctextline");
RemoteObject _xiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("InvisibleOnly", _invisibleonly);
Debug.locals.put("Existing", _existing);
Debug.locals.put("Offset", _offset);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 201;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="For Each Line As BCTextLine In Existing";
Debug.ShouldStop(512);
{
final RemoteObject group1 = _existing;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (group1.runMethod(false,"Get",index1));Debug.locals.put("Line", _line);
Debug.locals.put("Line", _line);
 BA.debugLineNum = 203;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_invisibleonly,bblistitem.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.docU.bblistitem.class, "_lineisvisible" /*RemoteObject*/ ,(Object)(_line),(Object)(_offset),(Object)(_height)),bblistitem.__c.getField(true,"False"))) { 
 BA.debugLineNum = 204;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
Debug.ShouldStop(2048);
_xiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_line))));Debug.locals.put("xiv", _xiv);Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 205;BA.debugLine="xiv.RemoveViewFromParent";
Debug.ShouldStop(4096);
_xiv.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 206;BA.debugLine="xiv.SetBitmap(Null)";
Debug.ShouldStop(8192);
_xiv.runVoidMethod ("SetBitmap",(Object)((bblistitem.__c.getField(false,"Null"))));
 BA.debugLineNum = 207;BA.debugLine="ImageViewsCache.Add(xiv)";
Debug.ShouldStop(16384);
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_xiv.getObject())));
 BA.debugLineNum = 208;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_invisibleonly,bblistitem.__c.getField(true,"True"))) { 
__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_line)));};
 };
 }
}Debug.locals.put("Line", _line);
;
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collecturls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CollectURLs (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("collecturls")) { return __ref.runUserSub(false, "bblistitem","collecturls", __ref);}
RemoteObject _line = RemoteObject.declareNull("b4j.docU.bctextengine._bctextline");
RemoteObject _un = RemoteObject.declareNull("b4j.docU.bctextengine._bcunbreakabletext");
RemoteObject _st = RemoteObject.declareNull("b4j.docU.bctextengine._bcsinglestylesection");
RemoteObject _extra = RemoteObject.declareNull("b4j.docU.bbcodeview._internalbbviewurl");
 BA.debugLineNum = 321;BA.debugLine="Private Sub CollectURLs";
Debug.ShouldStop(1);
 BA.debugLineNum = 322;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
Debug.ShouldStop(2);
{
final RemoteObject group1 = __ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (group1.runMethod(false,"Get",index1));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 323;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
Debug.ShouldStop(4);
{
final RemoteObject group2 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (group2.runMethod(false,"Get",index2));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 324;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
Debug.ShouldStop(8);
{
final RemoteObject group3 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (group3.runMethod(false,"Get",index3));Debug.locals.put("st", _st);
Debug.locals.put("st", _st);
 BA.debugLineNum = 325;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
Debug.ShouldStop(16);
if (__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_st.getField(false,"Run" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 326;BA.debugLine="Dim extra As InternalBBViewURL";
Debug.ShouldStop(32);
_extra = RemoteObject.createNew ("b4j.docU.bbcodeview._internalbbviewurl");Debug.locals.put("extra", _extra);
 BA.debugLineNum = 327;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_st.getField(false,"Run" /*RemoteObject*/ )))),bblistitem.__c.getField(true,"False"))) { 
 BA.debugLineNum = 328;BA.debugLine="extra = CreateBCURLExtraData";
Debug.ShouldStop(128);
_extra = __ref.runClassMethod (b4j.docU.bblistitem.class, "_createbcurlextradata" /*RemoteObject*/ );Debug.locals.put("extra", _extra);
 BA.debugLineNum = 329;BA.debugLine="URLToLines.Put(st.Run, extra)";
Debug.ShouldStop(256);
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_st.getField(false,"Run" /*RemoteObject*/ ))),(Object)((_extra)));
 }else {
 BA.debugLineNum = 331;BA.debugLine="extra = URLToLines.Get(st.Run)";
Debug.ShouldStop(1024);
_extra = (__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_st.getField(false,"Run" /*RemoteObject*/ )))));Debug.locals.put("extra", _extra);
 };
 BA.debugLineNum = 333;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_extra.getField(false,"Lines" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_line))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 334;BA.debugLine="extra.Lines.Add(line)";
Debug.ShouldStop(8192);
_extra.getField(false,"Lines" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_line)));
 };
 };
 }
}Debug.locals.put("st", _st);
;
 }
}Debug.locals.put("un", _un);
;
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbcurlextradata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateBCURLExtraData (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("createbcurlextradata")) { return __ref.runUserSub(false, "bblistitem","createbcurlextradata", __ref);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.docU.bbcodeview._internalbbviewurl");
 BA.debugLineNum = 342;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="Dim t1 As InternalBBViewURL";
Debug.ShouldStop(4194304);
_t1 = RemoteObject.createNew ("b4j.docU.bbcodeview._internalbbviewurl");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 344;BA.debugLine="t1.Initialize";
Debug.ShouldStop(8388608);
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 345;BA.debugLine="t1.Lines.Initialize";
Debug.ShouldStop(16777216);
_t1.getField(false,"Lines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 346;BA.debugLine="Return t1";
Debug.ShouldStop(33554432);
if (true) return _t1;
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "bblistitem","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 52;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 54;BA.debugLine="Tag = mBase.Tag";
Debug.ShouldStop(2097152);
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 55;BA.debugLine="mBase.Tag = Me";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 57;BA.debugLine="Dim sp As ScrollPane";
Debug.ShouldStop(16777216);
_sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");Debug.locals.put("sp", _sp);
 BA.debugLineNum = 58;BA.debugLine="sp.Initialize(\"sv\")";
Debug.ShouldStop(33554432);
_sp.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 59;BA.debugLine="sp.SetHScrollVisibility(\"NEVER\")";
Debug.ShouldStop(67108864);
_sp.runVoidMethod ("SetHScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("NEVER"))));
 BA.debugLineNum = 68;BA.debugLine="StubScrollView = sp";
Debug.ShouldStop(8);
__ref.getField(false,"_stubscrollview" /*RemoteObject*/ ).setObject (_sp.getObject());
 BA.debugLineNum = 69;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
Debug.ShouldStop(16);
__ref.setField ("_autounderlineurls" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("AutoUnderline"))),(Object)((bblistitem.__c.getField(true,"True"))))));
 BA.debugLineNum = 70;BA.debugLine="ImageViewsCache.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
Debug.ShouldStop(64);
__ref.setField ("_usedimageviews" /*RemoteObject*/ ,bblistitem._b4xcollections.runMethod(false,"_createorderedmap" /*RemoteObject*/ ));
 BA.debugLineNum = 72;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.ShouldStop(128);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 73;BA.debugLine="mText = xlbl.Text";
Debug.ShouldStop(256);
__ref.setField ("_mtext" /*RemoteObject*/ ,_xlbl.runMethod(true,"getText"));
 BA.debugLineNum = 74;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
Debug.ShouldStop(512);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultColor" /*RemoteObject*/ ,_xlbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 75;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
Debug.ShouldStop(1024);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("DefaultFont" /*RemoteObject*/ ,_xlbl.runMethod(false,"getFont"));
 BA.debugLineNum = 76;BA.debugLine="ParseData.ViewsPanel = mBase";
Debug.ShouldStop(2048);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("ViewsPanel" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
Debug.ShouldStop(4096);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_linkclicked"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 78;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
Debug.ShouldStop(8192);
__ref.setField ("_touchpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TouchPanel"))));
 };
 BA.debugLineNum = 81;BA.debugLine="Dim fx As JFX";
Debug.ShouldStop(65536);
_fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");Debug.locals.put("fx", _fx);
 BA.debugLineNum = 82;BA.debugLine="ParseData.DefaultBoldFont = fx.CreateFont(Lbl.Fon";
Debug.ShouldStop(131072);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"DefaultBoldFont" /*RemoteObject*/ ).setObject (_fx.runMethod(false,"CreateFont",(Object)(_lbl.runMethod(false,"getFont").runMethod(true,"getFamilyName")),(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"DefaultFont" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(bblistitem.__c.getField(true,"True")),(Object)(bblistitem.__c.getField(true,"False"))).getObject());
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findtouchedrun(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("FindTouchedRun (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("findtouchedrun")) { return __ref.runUserSub(false, "bblistitem","findtouchedrun", __ref, _x, _y);}
RemoteObject _offsetx = RemoteObject.createImmutable(0);
RemoteObject _offsety = RemoteObject.createImmutable(0);
RemoteObject _single = RemoteObject.declareNull("b4j.docU.bctextengine._bcsinglestylesection");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 286;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
Debug.ShouldStop(1073741824);
{
final RemoteObject group1 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable((0)),RemoteObject.createImmutable((-(double) (0 + bblistitem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))).<Integer>get().intValue()))),(bblistitem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))});
final int groupLen1 = group1.getField(true,"length").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = BA.numberCast(int.class, group1.getArrayElement(false,RemoteObject.createImmutable(index1)));Debug.locals.put("offsetx", _offsetx);
Debug.locals.put("offsetx", _offsetx);
 BA.debugLineNum = 288;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group2 = RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable((0)),RemoteObject.createImmutable((-(double) (0 + bblistitem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))).<Integer>get().intValue()))),(bblistitem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3))))});
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = BA.numberCast(int.class, group2.getArrayElement(false,RemoteObject.createImmutable(index2)));Debug.locals.put("offsety", _offsety);
Debug.locals.put("offsety", _offsety);
 BA.debugLineNum = 289;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
Debug.ShouldStop(1);
_single = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_findsinglestylesection" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_paragraph" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,_offsetx}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,_offsety}, "+",1, 0))));Debug.locals.put("single", _single);Debug.locals.put("single", _single);
 BA.debugLineNum = 290;BA.debugLine="If single <> Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_single)) { 
 BA.debugLineNum = 291;BA.debugLine="Return single.Run";
Debug.ShouldStop(4);
if (true) return _single.getField(false,"Run" /*RemoteObject*/ );
 };
 }
}Debug.locals.put("offsety", _offsety);
;
 }
}Debug.locals.put("offsetx", _offsetx);
;
 BA.debugLineNum = 295;BA.debugLine="Return Null";
Debug.ShouldStop(64);
if (true) return (bblistitem.__c.getField(false,"Null"));
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimageview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetImageView (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("getimageview")) { return __ref.runUserSub(false, "bblistitem","getimageview", __ref);}
RemoteObject _xiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
 BA.debugLineNum = 182;BA.debugLine="Private Sub GetImageView As B4XView";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim xiv As B4XView";
Debug.ShouldStop(4194304);
_xiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 184;BA.debugLine="If ImageViewsCache.Size = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 185;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(16777216);
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 186;BA.debugLine="iv.Initialize(\"\")";
Debug.ShouldStop(33554432);
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 187;BA.debugLine="xiv = iv";
Debug.ShouldStop(67108864);
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject());Debug.locals.put("xiv", _xiv);
 }else {
 BA.debugLineNum = 189;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size -";
Debug.ShouldStop(268435456);
_xiv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 190;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size -";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 };
 BA.debugLineNum = 192;BA.debugLine="mBase.AddView(xiv, 0, 0, 0, 0)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xiv.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 193;BA.debugLine="xiv.SendToBack";
Debug.ShouldStop(1);
_xiv.runVoidMethod ("SendToBack");
 BA.debugLineNum = 194;BA.debugLine="Return xiv";
Debug.ShouldStop(2);
if (true) return _xiv;
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "bblistitem","gettext", __ref);}
 BA.debugLineNum = 112;BA.debugLine="Public Sub getText As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Return mText";
Debug.ShouldStop(65536);
if (true) return __ref.getField(true,"_mtext" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettextengine(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTextEngine (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("gettextengine")) { return __ref.runUserSub(false, "bblistitem","gettextengine", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Return mTextEngine";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_mtextengine" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getviews(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getViews (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("getviews")) { return __ref.runUserSub(false, "bblistitem","getviews", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Public Sub getViews As Map";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return ParseData.Views";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"Views" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bblistitem","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(4);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 36;BA.debugLine="ParseData.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="ParseData.Views.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"Views" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="ParseData.URLs.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="Padding.Initialize(0, 0, 0, 0)";
Debug.ShouldStop(64);
__ref.getField(false,"_padding" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 40;BA.debugLine="ParseData.ImageCache.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"ImageCache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="URLToLines.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lineisvisible(RemoteObject __ref,RemoteObject _line,RemoteObject _offset,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("LineIsVisible (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("lineisvisible")) { return __ref.runUserSub(false, "bblistitem","lineisvisible", __ref, _line, _offset, _height);}
Debug.locals.put("line", _line);
Debug.locals.put("offset", _offset);
Debug.locals.put("height", _height);
 BA.debugLineNum = 197;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
Debug.ShouldStop(32);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _offset)) && RemoteObject.solveBoolean("k",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )}, "-",1, 1),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_offset,_height}, "+",1, 1))));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _markurl(RemoteObject __ref,RemoteObject _run) throws Exception{
try {
		Debug.PushSubsStack("MarkURL (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("markurl")) { return __ref.runUserSub(false, "bblistitem","markurl", __ref, _run);}
RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _r = RemoteObject.declareNull("b4j.docU.bctextengine._bctextrun");
RemoteObject _extra = RemoteObject.declareNull("b4j.docU.bbcodeview._internalbbviewurl");
RemoteObject _line = RemoteObject.declareNull("b4j.docU.bctextengine._bctextline");
Debug.locals.put("Run", _run);
 BA.debugLineNum = 298;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
Debug.ShouldStop(512);
 BA.debugLineNum = 300;BA.debugLine="Dim fx As JFX";
Debug.ShouldStop(2048);
_fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");Debug.locals.put("fx", _fx);
 BA.debugLineNum = 301;BA.debugLine="Dim n As Node = mBase";
Debug.ShouldStop(4096);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_mbase" /*RemoteObject*/ ).getObject());Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 302;BA.debugLine="If Run = Null Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("n",_run)) { 
 BA.debugLineNum = 303;BA.debugLine="n.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(16384);
_n.runMethod(false,"setMouseCursor",_fx.getField(false,"Cursors").getField(false,"DEFAULT"));
 }else {
 BA.debugLineNum = 305;BA.debugLine="n.MouseCursor = fx.Cursors.HAND";
Debug.ShouldStop(65536);
_n.runMethod(false,"setMouseCursor",_fx.getField(false,"Cursors").getField(false,"HAND"));
 };
 BA.debugLineNum = 308;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
Debug.ShouldStop(524288);
{
final RemoteObject group8 = __ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_r = (group8.runMethod(false,"Get",index8));Debug.locals.put("r", _r);
Debug.locals.put("r", _r);
 BA.debugLineNum = 309;BA.debugLine="If r.Underline <> (r = Run) Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_r.getField(true,"Underline" /*RemoteObject*/ ),BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_r,_run))))) { 
 BA.debugLineNum = 310;BA.debugLine="r.Underline = r = Run";
Debug.ShouldStop(2097152);
_r.setField ("Underline" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_r,_run)));
 BA.debugLineNum = 311;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
Debug.ShouldStop(4194304);
_extra = (__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_r))));Debug.locals.put("extra", _extra);Debug.locals.put("extra", _extra);
 BA.debugLineNum = 312;BA.debugLine="For Each line As BCTextLine In extra.Lines";
Debug.ShouldStop(8388608);
{
final RemoteObject group12 = _extra.getField(false,"Lines" /*RemoteObject*/ );
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_line = (group12.runMethod(false,"Get",index12));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 313;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_line))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 314;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_drawsingleline" /*RemoteObject*/ ,(Object)(_line),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_line)))),(Object)(__ref.getField(false,"_paragraph" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("line", _line);
;
 };
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parentscrolled(RemoteObject __ref,RemoteObject _scrollviewoffset,RemoteObject _clvheight,RemoteObject _offsetinitem) throws Exception{
try {
		Debug.PushSubsStack("ParentScrolled (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("parentscrolled")) { return __ref.runUserSub(false, "bblistitem","parentscrolled", __ref, _scrollviewoffset, _clvheight, _offsetinitem);}
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _itemoffset = RemoteObject.createImmutable(0);
RemoteObject _itemheight = RemoteObject.createImmutable(0);
RemoteObject _fixeditemoffset = RemoteObject.createImmutable(0);
Debug.locals.put("ScrollViewOffset", _scrollviewoffset);
Debug.locals.put("CLVHeight", _clvheight);
Debug.locals.put("OffsetInItem", _offsetinitem);
 BA.debugLineNum = 120;BA.debugLine="Public Sub ParentScrolled(ScrollViewOffset As Int,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="If Paragraph.IsInitialized And mBase.Parent.IsIni";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(true,"IsInitialized" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"getParent").runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 122;BA.debugLine="Dim scale As Float = mTextEngine.mScale";
Debug.ShouldStop(33554432);
_scale = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_mscale" /*RemoteObject*/ );Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 123;BA.debugLine="Dim ItemOffset As Int = mBase.Parent.Parent.Top";
Debug.ShouldStop(67108864);
_itemoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"getParent").runMethod(true,"getTop"),_offsetinitem}, "+",1, 0));Debug.locals.put("ItemOffset", _itemoffset);Debug.locals.put("ItemOffset", _itemoffset);
 BA.debugLineNum = 124;BA.debugLine="Dim ItemHeight As Int = mBase.Height";
Debug.ShouldStop(134217728);
_itemheight = BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"));Debug.locals.put("ItemHeight", _itemheight);Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 125;BA.debugLine="If ItemOffset > ScrollViewOffset + CLVHeight Or";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_itemoffset,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_scrollviewoffset,_clvheight}, "+",1, 1))) || RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_itemoffset,_itemheight}, "+",1, 1),BA.numberCast(double.class, _scrollviewoffset))) { 
 BA.debugLineNum = 126;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 128;BA.debugLine="Dim FixedItemOffset As Int = Max(0, ScrollViewOf";
Debug.ShouldStop(-2147483648);
_fixeditemoffset = BA.numberCast(int.class, bblistitem.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_scrollviewoffset,_itemoffset}, "-",1, 1)))));Debug.locals.put("FixedItemOffset", _fixeditemoffset);Debug.locals.put("FixedItemOffset", _fixeditemoffset);
 BA.debugLineNum = 129;BA.debugLine="ItemHeight = Min(ItemHeight - FixedItemOffset, S";
Debug.ShouldStop(1);
_itemheight = BA.numberCast(int.class, bblistitem.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_itemheight,_fixeditemoffset}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_scrollviewoffset,_clvheight,_itemoffset}, "+-",2, 1)))));Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 130;BA.debugLine="UpdateVisibleRegion(FixedItemOffset * scale, Ite";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_updatevisibleregion" /*void*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_fixeditemoffset,_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_itemheight,_scale}, "*",0, 0))));
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseanddraw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ParseAndDraw (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("parseanddraw")) { return __ref.runUserSub(false, "bblistitem","parseanddraw", __ref);}
RemoteObject _pe = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 214;BA.debugLine="Public Sub ParseAndDraw";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="TextIndex = TextIndex + 1";
Debug.ShouldStop(4194304);
__ref.setField ("_textindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_textindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 216;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("NeedToReparseWhenResize" /*RemoteObject*/ ,bblistitem.__c.getField(true,"False"));
 BA.debugLineNum = 217;BA.debugLine="ParseData.Text = mText";
Debug.ShouldStop(16777216);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Text" /*RemoteObject*/ ,__ref.getField(true,"_mtext" /*RemoteObject*/ ));
 BA.debugLineNum = 218;BA.debugLine="ParseData.URLs.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 219;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
Debug.ShouldStop(67108864);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_padding" /*RemoteObject*/ ).runMethod(true,"getLeft"),__ref.getField(false,"_padding" /*RemoteObject*/ ).runMethod(true,"getRight")}, "--",2, 0))));
 BA.debugLineNum = 220;BA.debugLine="URLToLines.Clear";
Debug.ShouldStop(134217728);
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 221;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
Debug.ShouldStop(268435456);
_pe = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_pe = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (b4j.docU.bbcodeparser.class, "_parse" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ )));Debug.locals.put("pe", _pe);Debug.locals.put("pe", _pe);
 BA.debugLineNum = 222;BA.debugLine="mBase.RemoveAllViews";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 223;BA.debugLine="If TouchPanel.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 224;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, 0, 0)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 };
 BA.debugLineNum = 226;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_externalruns" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_externalruns" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 227;BA.debugLine="Runs = ExternalRuns";
Debug.ShouldStop(4);
__ref.setField ("_runs" /*RemoteObject*/ ,__ref.getField(false,"_externalruns" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 229;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
Debug.ShouldStop(16);
__ref.setField ("_runs" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (b4j.docU.bbcodeparser.class, "_createruns" /*RemoteObject*/ ,(Object)(_pe),(Object)(__ref.getField(false,"_parsedata" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 232;BA.debugLine="Redraw";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_redraw" /*RemoteObject*/ );
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redraw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Redraw (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("redraw")) { return __ref.runUserSub(false, "bblistitem","redraw", __ref);}
RemoteObject _r = RemoteObject.declareNull("b4j.docU.bctextengine._bctextrun");
 BA.debugLineNum = 235;BA.debugLine="Public Sub Redraw";
Debug.ShouldStop(1024);
 BA.debugLineNum = 236;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
Debug.ShouldStop(2048);
bblistitem._style = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_createstyle" /*RemoteObject*/ );__ref.setField("_style",bblistitem._style);
 BA.debugLineNum = 237;BA.debugLine="Style.Padding = Padding";
Debug.ShouldStop(4096);
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("Padding" /*RemoteObject*/ ,__ref.getField(false,"_padding" /*RemoteObject*/ ));
 BA.debugLineNum = 238;BA.debugLine="Style.MaxWidth = mBase.Width";
Debug.ShouldStop(8192);
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("MaxWidth" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")));
 BA.debugLineNum = 239;BA.debugLine="Style.ResizeHeightAutomatically = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("ResizeHeightAutomatically" /*RemoteObject*/ ,bblistitem.__c.getField(true,"True"));
 BA.debugLineNum = 240;BA.debugLine="Style.RTL = RTL";
Debug.ShouldStop(32768);
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("RTL" /*RemoteObject*/ ,__ref.getField(true,"_rtl" /*RemoteObject*/ ));
 BA.debugLineNum = 241;BA.debugLine="URLToLines.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 242;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Key";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_cleanexistingimageviews" /*RemoteObject*/ ,(Object)(bblistitem.__c.getField(true,"False")),(Object)(__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 243;BA.debugLine="UsedImageViews.Clear";
Debug.ShouldStop(262144);
__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 244;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Run";
Debug.ShouldStop(524288);
__ref.setField ("_paragraph" /*RemoteObject*/ ,__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_prepareforlazydrawing" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_runs" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_style" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_stubscrollview" /*RemoteObject*/ ))));
 BA.debugLineNum = 245;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).getField(true,"_mscale" /*RemoteObject*/ ),bblistitem.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/+",1, 0)));
 BA.debugLineNum = 246;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_autounderlineurls" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 247;BA.debugLine="CollectURLs";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_collecturls" /*RemoteObject*/ );
 BA.debugLineNum = 248;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
Debug.ShouldStop(8388608);
{
final RemoteObject group13 = __ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen13 = group13.runMethod(true,"getSize").<Integer>get()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_r = (group13.runMethod(false,"Get",index13));Debug.locals.put("r", _r);
Debug.locals.put("r", _r);
 BA.debugLineNum = 249;BA.debugLine="r.Underline = False";
Debug.ShouldStop(16777216);
_r.setField ("Underline" /*RemoteObject*/ ,bblistitem.__c.getField(true,"False"));
 }
}Debug.locals.put("r", _r);
;
 };
 BA.debugLineNum = 252;BA.debugLine="If TouchPanel.IsInitialized Then";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 253;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, mBase.Widt";
Debug.ShouldStop(268435456);
__ref.getField(false,"_touchpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("setText (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "bblistitem","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 107;BA.debugLine="Public Sub setText(t As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="mText = t";
Debug.ShouldStop(2048);
__ref.setField ("_mtext" /*RemoteObject*/ ,_t);
 BA.debugLineNum = 109;BA.debugLine="ParseAndDraw";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_parseanddraw" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextengine(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setTextEngine (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("settextengine")) { return __ref.runUserSub(false, "bblistitem","settextengine", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 96;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="mTextEngine = b";
Debug.ShouldStop(1);
__ref.setField ("_mtextengine" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 98;BA.debugLine="If mText <> \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtext" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 99;BA.debugLine="setText(mText)";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtext" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviews(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("setViews (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setviews")) { return __ref.runUserSub(false, "bblistitem","setviews", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 48;BA.debugLine="Public Sub setViews (m As Map)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="ParseData.Views = m";
Debug.ShouldStop(65536);
__ref.getField(false,"_parsedata" /*RemoteObject*/ ).setField ("Views" /*RemoteObject*/ ,_m);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_MouseExited (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("touchpanel_mouseexited")) { return __ref.runUserSub(false, "bblistitem","touchpanel_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 279;BA.debugLine="Private Sub TouchPanel_MouseExited (EventData As M";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="If URLToLines.Size > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 281;BA.debugLine="MarkURL(Null)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_markurl" /*RemoteObject*/ ,(Object)((bblistitem.__c.getField(false,"Null"))));
 };
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_Touch (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("touchpanel_touch")) { return __ref.runUserSub(false, "bblistitem","touchpanel_touch", __ref, _action, _x, _y);}
RemoteObject _run = RemoteObject.declareNull("b4j.docU.bctextengine._bctextrun");
RemoteObject _url = RemoteObject.createImmutable("");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 257;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="Dim run As BCTextRun = Null";
Debug.ShouldStop(2);
_run = (bblistitem.__c.getField(false,"Null"));Debug.locals.put("run", _run);Debug.locals.put("run", _run);
 BA.debugLineNum = 259;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_urltolines" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 260;BA.debugLine="run = FindTouchedRun(X, Y)";
Debug.ShouldStop(8);
_run = __ref.runClassMethod (b4j.docU.bblistitem.class, "_findtouchedrun" /*RemoteObject*/ ,(Object)(_x),(Object)(_y));Debug.locals.put("run", _run);
 };
 BA.debugLineNum = 262;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_run) && RemoteObject.solveBoolean(".",__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_run))))) { 
 BA.debugLineNum = 263;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_touchpanel" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 264;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
Debug.ShouldStop(128);
_url = BA.ObjectToString(__ref.getField(false,"_parsedata" /*RemoteObject*/ ).getField(false,"URLs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_run))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 265;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
Debug.ShouldStop(256);
bblistitem.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LinkClicked"))),(Object)((_url)));
 BA.debugLineNum = 266;BA.debugLine="MarkURL(Null)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_markurl" /*RemoteObject*/ ,(Object)((bblistitem.__c.getField(false,"Null"))));
 }else 
{ BA.debugLineNum = 267;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i")) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 4))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 3)))))) { 
 BA.debugLineNum = 268;BA.debugLine="MarkURL(Null)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_markurl" /*RemoteObject*/ ,(Object)((bblistitem.__c.getField(false,"Null"))));
 }else {
 BA.debugLineNum = 271;BA.debugLine="MarkURL(run)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_markurl" /*RemoteObject*/ ,(Object)(_run));
 }}
;
 BA.debugLineNum = 273;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 275;BA.debugLine="MarkURL(Null)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_markurl" /*RemoteObject*/ ,(Object)((bblistitem.__c.getField(false,"Null"))));
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatelastvisibleregion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateLastVisibleRegion (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("updatelastvisibleregion")) { return __ref.runUserSub(false, "bblistitem","updatelastvisibleregion", __ref);}
 BA.debugLineNum = 116;BA.debugLine="Public Sub UpdateLastVisibleRegion";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="UpdateVisibleRegion(UpdateOffsetY, UpdateHeight)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_updatevisibleregion" /*void*/ ,(Object)(__ref.getField(true,"_updateoffsety" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_updateheight" /*RemoteObject*/ )));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _updatevisibleregion(RemoteObject __ref,RemoteObject _offsety,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleRegion (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("updatevisibleregion")) { __ref.runUserSub(false, "bblistitem","updatevisibleregion", __ref, _offsety, _height); return;}
ResumableSub_UpdateVisibleRegion rsub = new ResumableSub_UpdateVisibleRegion(null,__ref,_offsety,_height);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateVisibleRegion extends BA.ResumableSub {
public ResumableSub_UpdateVisibleRegion(b4j.docU.bblistitem parent,RemoteObject __ref,RemoteObject _offsety,RemoteObject _height) {
this.parent = parent;
this.__ref = __ref;
this._offsety = _offsety;
this._height = _height;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.bblistitem parent;
RemoteObject _offsety;
RemoteObject _height;
RemoteObject _myrenderindex = RemoteObject.createImmutable(0);
RemoteObject _mytextindex = RemoteObject.createImmutable(0);
RemoteObject _foundfirst = RemoteObject.createImmutable(false);
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _line = RemoteObject.declareNull("b4j.docU.bctextengine._bctextline");
RemoteObject _xiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleRegion (bblistitem) ","bblistitem",13,__ref.getField(false, "ba"),__ref,135);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("OffsetY", _offsety);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 136;BA.debugLine="UpdateOffsetY = OffsetY";
Debug.ShouldStop(128);
__ref.setField ("_updateoffsety" /*RemoteObject*/ ,_offsety);
 BA.debugLineNum = 137;BA.debugLine="UpdateHeight = Height";
Debug.ShouldStop(256);
__ref.setField ("_updateheight" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 138;BA.debugLine="RenderIndex = RenderIndex + 1";
Debug.ShouldStop(512);
__ref.setField ("_renderindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_renderindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 139;BA.debugLine="Dim MyRenderIndex As Int = RenderIndex";
Debug.ShouldStop(1024);
_myrenderindex = __ref.getField(true,"_renderindex" /*RemoteObject*/ );Debug.locals.put("MyRenderIndex", _myrenderindex);Debug.locals.put("MyRenderIndex", _myrenderindex);
 BA.debugLineNum = 140;BA.debugLine="Dim MyTextIndex As Int = TextIndex";
Debug.ShouldStop(2048);
_mytextindex = __ref.getField(true,"_textindex" /*RemoteObject*/ );Debug.locals.put("MyTextIndex", _mytextindex);Debug.locals.put("MyTextIndex", _mytextindex);
 BA.debugLineNum = 141;BA.debugLine="Do While WaitingForDrawing And MyRenderIndex = Re";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean(".",__ref.getField(true,"_waitingfordrawing" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",_myrenderindex,BA.numberCast(double.class, __ref.getField(true,"_renderindex" /*RemoteObject*/ )))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 142;BA.debugLine="Sleep(10)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bblistitem", "updatevisibleregion"),BA.numberCast(int.class, 10));
this.state = 41;
return;
case 41:
//C
this.state = 1;
;
 if (true) break;
;
 BA.debugLineNum = 144;BA.debugLine="If MyRenderIndex <> RenderIndex Then Return";
Debug.ShouldStop(32768);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_myrenderindex,BA.numberCast(double.class, __ref.getField(true,"_renderindex" /*RemoteObject*/ )))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 145;BA.debugLine="Dim foundFirst As Boolean";
Debug.ShouldStop(65536);
_foundfirst = RemoteObject.createImmutable(false);Debug.locals.put("foundFirst", _foundfirst);
 BA.debugLineNum = 146;BA.debugLine="Dim Existing As List";
Debug.ShouldStop(131072);
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Existing", _existing);
 BA.debugLineNum = 147;BA.debugLine="Existing.Initialize";
Debug.ShouldStop(262144);
_existing.runVoidMethod ("Initialize");
 BA.debugLineNum = 148;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
Debug.ShouldStop(524288);
_existing.runVoidMethod ("AddAll",(Object)(__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ )));
 BA.debugLineNum = 149;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.docU.bblistitem.class, "_cleanexistingimageviews" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")),(Object)(_existing),(Object)(_offsety),(Object)(_height));
 BA.debugLineNum = 150;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//for
this.state = 40;
group15 = __ref.getField(false,"_paragraph" /*RemoteObject*/ ).getField(false,"TextLines" /*RemoteObject*/ );
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Line", _line);
this.state = 42;
if (true) break;

case 42:
//C
this.state = 40;
if (index15 < groupLen15) {
this.state = 12;
_line = (group15.runMethod(false,"Get",index15));Debug.locals.put("Line", _line);}
if (true) break;

case 43:
//C
this.state = 42;
index15++;
Debug.locals.put("Line", _line);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 151;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 13:
//if
this.state = 39;
if (__ref.runClassMethod (b4j.docU.bblistitem.class, "_lineisvisible" /*RemoteObject*/ ,(Object)(_line),(Object)(_offsety),(Object)(_height)).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 32;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 152;BA.debugLine="foundFirst = True";
Debug.ShouldStop(8388608);
_foundfirst = parent.__c.getField(true,"True");Debug.locals.put("foundFirst", _foundfirst);
 BA.debugLineNum = 153;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 16:
//if
this.state = 19;
if (__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_line))).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 154;BA.debugLine="Continue";
Debug.ShouldStop(33554432);
this.state = 43;
if (true) break;;
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 156;BA.debugLine="Dim xiv As B4XView = GetImageView";
Debug.ShouldStop(134217728);
_xiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xiv = __ref.runClassMethod (b4j.docU.bblistitem.class, "_getimageview" /*RemoteObject*/ );Debug.locals.put("xiv", _xiv);Debug.locals.put("xiv", _xiv);
 BA.debugLineNum = 157;BA.debugLine="Dim bc As BitmapCreator = mTextEngine.DrawSingl";
Debug.ShouldStop(268435456);
_bc = __ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_drawsinglelineasync" /*RemoteObject*/ ,(Object)(_line),(Object)(_xiv),(Object)(__ref.getField(false,"_paragraph" /*RemoteObject*/ )),(Object)(__ref));Debug.locals.put("bc", _bc);Debug.locals.put("bc", _bc);
 BA.debugLineNum = 158;BA.debugLine="If bc <> Null Then";
Debug.ShouldStop(536870912);
if (true) break;

case 20:
//if
this.state = 30;
if (RemoteObject.solveBoolean("N",_bc)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 159;BA.debugLine="WaitingForDrawing = True";
Debug.ShouldStop(1073741824);
__ref.setField ("_waitingfordrawing" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 160;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","bc_bitmapready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bblistitem", "updatevisibleregion"), null);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("bmp", _bmp);
;
 BA.debugLineNum = 161;BA.debugLine="WaitingForDrawing = False";
Debug.ShouldStop(1);
__ref.setField ("_waitingfordrawing" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 162;BA.debugLine="mTextEngine.ReleaseAsyncBC(bc)";
Debug.ShouldStop(2);
__ref.getField(false,"_mtextengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_releaseasyncbc" /*RemoteObject*/ ,(Object)(_bc));
 BA.debugLineNum = 163;BA.debugLine="If MyTextIndex <> TextIndex Then";
Debug.ShouldStop(4);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_mytextindex,BA.numberCast(double.class, __ref.getField(true,"_textindex" /*RemoteObject*/ )))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 164;BA.debugLine="xiv.RemoveViewFromParent";
Debug.ShouldStop(8);
_xiv.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 165;BA.debugLine="xiv.SetBitmap(Null)";
Debug.ShouldStop(16);
_xiv.runVoidMethod ("SetBitmap",(Object)((parent.__c.getField(false,"Null"))));
 BA.debugLineNum = 166;BA.debugLine="ImageViewsCache.Add(xiv)";
Debug.ShouldStop(32);
__ref.getField(false,"_imageviewscache" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_xiv.getObject())));
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 169;BA.debugLine="If xui.IsB4J Then";
Debug.ShouldStop(256);

case 26:
//if
this.state = 29;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 170;BA.debugLine="bmp = bc.Bitmap";
Debug.ShouldStop(512);
_bmp = _bc.runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);
 if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 172;BA.debugLine="bmp = bmp.Crop(0, 0, bmp.Width, bmp.Height)";
Debug.ShouldStop(2048);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getHeight"))));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 173;BA.debugLine="bc.SetBitmapToImageView(bmp, xiv)";
Debug.ShouldStop(4096);
_bc.runVoidMethod ("_setbitmaptoimageview",(Object)(_bmp),(Object)(_xiv));
 if (true) break;

case 30:
//C
this.state = 39;
;
 BA.debugLineNum = 175;BA.debugLine="UsedImageViews.Put(Line, xiv)";
Debug.ShouldStop(16384);
__ref.getField(false,"_usedimageviews" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_line)),(Object)((_xiv.getObject())));
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 177;BA.debugLine="If foundFirst Then Exit";
Debug.ShouldStop(65536);
if (true) break;

case 33:
//if
this.state = 38;
if (_foundfirst.<Boolean>get().booleanValue()) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
this.state = 40;
if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 43;
;
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
Debug.locals.put("Line", _line);
;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _bc_bitmapready(RemoteObject __ref,RemoteObject _bmp) throws Exception{
}
}