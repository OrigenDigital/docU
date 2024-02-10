package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jammsgdialogbbcodeview_subs_0 {


public static RemoteObject  _bbcodeviewdialog_linkclicked(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("BBCodeViewDialog_LinkClicked (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,781);
if (RapidSub.canDelegate("bbcodeviewdialog_linkclicked")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","bbcodeviewdialog_linkclicked", __ref, _url);}
Debug.locals.put("URL", _url);
 BA.debugLineNum = 781;BA.debugLine="Private Sub BBCodeViewDialog_LinkClicked (URL As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 782;BA.debugLine="URLLinkClicked=URL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_urllinkclicked" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 783;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_close" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));
 BA.debugLineNum = 784;BA.debugLine="If SubExists(mCallBack,mEventName & \"_LinkClicked";
Debug.JustUpdateDeviceLine();
if (jammsgdialogbbcodeview.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LinkClicked")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 785;BA.debugLine="CallSub2(mCallBack,mEventName & \"_LinkClicked\",U";
Debug.JustUpdateDeviceLine();
jammsgdialogbbcodeview.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_LinkClicked"))),(Object)((_url)));
 };
 BA.debugLineNum = 787;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _booleantoint(RemoteObject __ref,RemoteObject _bool) throws Exception{
try {
		Debug.PushSubsStack("BooleanToInt (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("booleantoint")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","booleantoint", __ref, _bool);}
Debug.locals.put("Bool", _bool);
 BA.debugLineNum = 538;BA.debugLine="Sub BooleanToInt(Bool As Boolean) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 539;BA.debugLine="If Bool Then Return 1 Else Return 0";
Debug.JustUpdateDeviceLine();
if (_bool.<Boolean>get().booleanValue()) { 
if (true) return BA.numberCast(int.class, 1);}
else {
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object";
jammsgdialogbbcodeview._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",jammsgdialogbbcodeview._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String";
jammsgdialogbbcodeview._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",jammsgdialogbbcodeview._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
jammsgdialogbbcodeview._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jammsgdialogbbcodeview._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
jammsgdialogbbcodeview._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",jammsgdialogbbcodeview._dialog);
 //BA.debugLineNum = 9;BA.debugLine="Private mTitle As Object";
jammsgdialogbbcodeview._mtitle = RemoteObject.createNew ("Object");__ref.setField("_mtitle",jammsgdialogbbcodeview._mtitle);
 //BA.debugLineNum = 10;BA.debugLine="Private mMsgXD As Object";
jammsgdialogbbcodeview._mmsgxd = RemoteObject.createNew ("Object");__ref.setField("_mmsgxd",jammsgdialogbbcodeview._mmsgxd);
 //BA.debugLineNum = 11;BA.debugLine="Private mBaseDialogo As B4XView";
jammsgdialogbbcodeview._mbasedialogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbasedialogo",jammsgdialogbbcodeview._mbasedialogo);
 //BA.debugLineNum = 12;BA.debugLine="Private mDialogPanel As B4XView";
jammsgdialogbbcodeview._mdialogpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mdialogpanel",jammsgdialogbbcodeview._mdialogpanel);
 //BA.debugLineNum = 13;BA.debugLine="Private mColorFondoPanelMensaje as Int";
jammsgdialogbbcodeview._mcolorfondopanelmensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondopanelmensaje",jammsgdialogbbcodeview._mcolorfondopanelmensaje);
 //BA.debugLineNum = 15;BA.debugLine="Private mColorOverlay As Int";
jammsgdialogbbcodeview._mcoloroverlay = RemoteObject.createImmutable(0);__ref.setField("_mcoloroverlay",jammsgdialogbbcodeview._mcoloroverlay);
 //BA.debugLineNum = 16;BA.debugLine="Private mColorBackground As Int";
jammsgdialogbbcodeview._mcolorbackground = RemoteObject.createImmutable(0);__ref.setField("_mcolorbackground",jammsgdialogbbcodeview._mcolorbackground);
 //BA.debugLineNum = 18;BA.debugLine="Private mLightTheme As Boolean";
jammsgdialogbbcodeview._mlighttheme = RemoteObject.createImmutable(false);__ref.setField("_mlighttheme",jammsgdialogbbcodeview._mlighttheme);
 //BA.debugLineNum = 20;BA.debugLine="Private mMovible As Boolean";
jammsgdialogbbcodeview._mmovible = RemoteObject.createImmutable(false);__ref.setField("_mmovible",jammsgdialogbbcodeview._mmovible);
 //BA.debugLineNum = 21;BA.debugLine="Private DownX As Double";
jammsgdialogbbcodeview._downx = RemoteObject.createImmutable(0);__ref.setField("_downx",jammsgdialogbbcodeview._downx);
 //BA.debugLineNum = 22;BA.debugLine="Private DownY As Double";
jammsgdialogbbcodeview._downy = RemoteObject.createImmutable(0);__ref.setField("_downy",jammsgdialogbbcodeview._downy);
 //BA.debugLineNum = 24;BA.debugLine="Private mAnchoDialogo As Int";
jammsgdialogbbcodeview._manchodialogo = RemoteObject.createImmutable(0);__ref.setField("_manchodialogo",jammsgdialogbbcodeview._manchodialogo);
 //BA.debugLineNum = 25;BA.debugLine="Private mAltoDialogo As Int";
jammsgdialogbbcodeview._maltodialogo = RemoteObject.createImmutable(0);__ref.setField("_maltodialogo",jammsgdialogbbcodeview._maltodialogo);
 //BA.debugLineNum = 26;BA.debugLine="Private mAlineacionVerticalMsg As String";
jammsgdialogbbcodeview._malineacionverticalmsg = RemoteObject.createImmutable("");__ref.setField("_malineacionverticalmsg",jammsgdialogbbcodeview._malineacionverticalmsg);
 //BA.debugLineNum = 27;BA.debugLine="Private mAlineacionHorizontalMsg As String";
jammsgdialogbbcodeview._malineacionhorizontalmsg = RemoteObject.createImmutable("");__ref.setField("_malineacionhorizontalmsg",jammsgdialogbbcodeview._malineacionhorizontalmsg);
 //BA.debugLineNum = 28;BA.debugLine="Private mTamanoFuenteTextoMensaje As Float";
jammsgdialogbbcodeview._mtamanofuentetextomensaje = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentetextomensaje",jammsgdialogbbcodeview._mtamanofuentetextomensaje);
 //BA.debugLineNum = 29;BA.debugLine="Private mColorTextoMensaje As Int";
jammsgdialogbbcodeview._mcolortextomensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolortextomensaje",jammsgdialogbbcodeview._mcolortextomensaje);
 //BA.debugLineNum = 31;BA.debugLine="Private mAltoTitulo As Int";
jammsgdialogbbcodeview._maltotitulo = RemoteObject.createImmutable(0);__ref.setField("_maltotitulo",jammsgdialogbbcodeview._maltotitulo);
 //BA.debugLineNum = 32;BA.debugLine="Private mTamanoFuenteTitulo As Float";
jammsgdialogbbcodeview._mtamanofuentetitulo = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentetitulo",jammsgdialogbbcodeview._mtamanofuentetitulo);
 //BA.debugLineNum = 33;BA.debugLine="Private mColorFondoTitulo As Int";
jammsgdialogbbcodeview._mcolorfondotitulo = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondotitulo",jammsgdialogbbcodeview._mcolorfondotitulo);
 //BA.debugLineNum = 34;BA.debugLine="Private mPanelTitulo As B4XView";
jammsgdialogbbcodeview._mpaneltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpaneltitulo",jammsgdialogbbcodeview._mpaneltitulo);
 //BA.debugLineNum = 36;BA.debugLine="Private mAnchoBordeDialogo As Int";
jammsgdialogbbcodeview._manchobordedialogo = RemoteObject.createImmutable(0);__ref.setField("_manchobordedialogo",jammsgdialogbbcodeview._manchobordedialogo);
 //BA.debugLineNum = 37;BA.debugLine="Private mColorBordeDialogo As Int";
jammsgdialogbbcodeview._mcolorbordedialogo = RemoteObject.createImmutable(0);__ref.setField("_mcolorbordedialogo",jammsgdialogbbcodeview._mcolorbordedialogo);
 //BA.debugLineNum = 39;BA.debugLine="Private mAltoBotonesDialogo As Int";
jammsgdialogbbcodeview._maltobotonesdialogo = RemoteObject.createImmutable(0);__ref.setField("_maltobotonesdialogo",jammsgdialogbbcodeview._maltobotonesdialogo);
 //BA.debugLineNum = 40;BA.debugLine="Private mTextoBotonPositive As String";
jammsgdialogbbcodeview._mtextobotonpositive = RemoteObject.createImmutable("");__ref.setField("_mtextobotonpositive",jammsgdialogbbcodeview._mtextobotonpositive);
 //BA.debugLineNum = 41;BA.debugLine="Private mTextoBotonCancel As String";
jammsgdialogbbcodeview._mtextobotoncancel = RemoteObject.createImmutable("");__ref.setField("_mtextobotoncancel",jammsgdialogbbcodeview._mtextobotoncancel);
 //BA.debugLineNum = 42;BA.debugLine="Private mTextoBotonNegative As String";
jammsgdialogbbcodeview._mtextobotonnegative = RemoteObject.createImmutable("");__ref.setField("_mtextobotonnegative",jammsgdialogbbcodeview._mtextobotonnegative);
 //BA.debugLineNum = 43;BA.debugLine="Private mTamanoFuenteBotonesDialogo As Float";
jammsgdialogbbcodeview._mtamanofuentebotonesdialogo = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentebotonesdialogo",jammsgdialogbbcodeview._mtamanofuentebotonesdialogo);
 //BA.debugLineNum = 44;BA.debugLine="Private mColorFondoBotonPositive As Int";
jammsgdialogbbcodeview._mcolorfondobotonpositive = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondobotonpositive",jammsgdialogbbcodeview._mcolorfondobotonpositive);
 //BA.debugLineNum = 45;BA.debugLine="Private mColorFondoBotonCancel As Int";
jammsgdialogbbcodeview._mcolorfondobotoncancel = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondobotoncancel",jammsgdialogbbcodeview._mcolorfondobotoncancel);
 //BA.debugLineNum = 46;BA.debugLine="Private mColorFondoBotonNegative As Int";
jammsgdialogbbcodeview._mcolorfondobotonnegative = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondobotonnegative",jammsgdialogbbcodeview._mcolorfondobotonnegative);
 //BA.debugLineNum = 47;BA.debugLine="Private mColorTextoBotonPositive As Int";
jammsgdialogbbcodeview._mcolortextobotonpositive = RemoteObject.createImmutable(0);__ref.setField("_mcolortextobotonpositive",jammsgdialogbbcodeview._mcolortextobotonpositive);
 //BA.debugLineNum = 48;BA.debugLine="Private mColorTextoBotonCancel As Int";
jammsgdialogbbcodeview._mcolortextobotoncancel = RemoteObject.createImmutable(0);__ref.setField("_mcolortextobotoncancel",jammsgdialogbbcodeview._mcolortextobotoncancel);
 //BA.debugLineNum = 49;BA.debugLine="Private mColorTextoBotonNegative As Int";
jammsgdialogbbcodeview._mcolortextobotonnegative = RemoteObject.createImmutable(0);__ref.setField("_mcolortextobotonnegative",jammsgdialogbbcodeview._mcolortextobotonnegative);
 //BA.debugLineNum = 51;BA.debugLine="Private mNombreFicheroIconoTitulo As String";
jammsgdialogbbcodeview._mnombreficheroiconotitulo = RemoteObject.createImmutable("");__ref.setField("_mnombreficheroiconotitulo",jammsgdialogbbcodeview._mnombreficheroiconotitulo);
 //BA.debugLineNum = 53;BA.debugLine="Private CONST AlineacionCentro As String=\"CENTER\"";
jammsgdialogbbcodeview._alineacioncentro = BA.ObjectToString("CENTER");__ref.setField("_alineacioncentro",jammsgdialogbbcodeview._alineacioncentro);
 //BA.debugLineNum = 54;BA.debugLine="Private CONST AlineacionIzquierda As String=\"LEFT";
jammsgdialogbbcodeview._alineacionizquierda = BA.ObjectToString("LEFT");__ref.setField("_alineacionizquierda",jammsgdialogbbcodeview._alineacionizquierda);
 //BA.debugLineNum = 55;BA.debugLine="Private CONST AlineacionDerecha As String=\"RIGHT\"";
jammsgdialogbbcodeview._alineacionderecha = BA.ObjectToString("RIGHT");__ref.setField("_alineacionderecha",jammsgdialogbbcodeview._alineacionderecha);
 //BA.debugLineNum = 56;BA.debugLine="Private CONST AlineacionTop As String=\"TOP\"";
jammsgdialogbbcodeview._alineaciontop = BA.ObjectToString("TOP");__ref.setField("_alineaciontop",jammsgdialogbbcodeview._alineaciontop);
 //BA.debugLineNum = 57;BA.debugLine="Private CONST AlineacionBottom As String=\"BOTTOM\"";
jammsgdialogbbcodeview._alineacionbottom = BA.ObjectToString("BOTTOM");__ref.setField("_alineacionbottom",jammsgdialogbbcodeview._alineacionbottom);
 //BA.debugLineNum = 59;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
jammsgdialogbbcodeview._measurementcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_measurementcanvas",jammsgdialogbbcodeview._measurementcanvas);
 //BA.debugLineNum = 61;BA.debugLine="Private TextEngine As BCTextEngine";
jammsgdialogbbcodeview._textengine = RemoteObject.createNew ("b4j.docU.bctextengine");__ref.setField("_textengine",jammsgdialogbbcodeview._textengine);
 //BA.debugLineNum = 62;BA.debugLine="Public BBCodeViewDialog As BBCodeView";
jammsgdialogbbcodeview._bbcodeviewdialog = RemoteObject.createNew ("b4j.docU.bbcodeview");__ref.setField("_bbcodeviewdialog",jammsgdialogbbcodeview._bbcodeviewdialog);
 //BA.debugLineNum = 69;BA.debugLine="Public URLLinkClicked as string";
jammsgdialogbbcodeview._urllinkclicked = RemoteObject.createImmutable("");__ref.setField("_urllinkclicked",jammsgdialogbbcodeview._urllinkclicked);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _colortohex(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("ColorToHex (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,542);
if (RapidSub.canDelegate("colortohex")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","colortohex", __ref, _clr);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 542;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 543;BA.debugLine="Dim bc As ByteConverter";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 544;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(true,"HexFromBytes",(Object)(_bc.runMethod(false,"IntsToBytes",(Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {_clr})))));
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _contrastcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("ContrastColor (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,596);
if (RapidSub.canDelegate("contrastcolor")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","contrastcolor", __ref, _c);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _argb = null;
Debug.locals.put("C", _c);
 BA.debugLineNum = 596;BA.debugLine="Sub ContrastColor(C As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 597;BA.debugLine="Dim d As Int";
Debug.JustUpdateDeviceLine();
_d = RemoteObject.createImmutable(0);Debug.locals.put("d", _d);
 BA.debugLineNum = 598;BA.debugLine="Dim a As Double";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createImmutable(0);Debug.locals.put("a", _a);
 BA.debugLineNum = 599;BA.debugLine="Dim argb() As Int";
Debug.JustUpdateDeviceLine();
_argb = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});Debug.locals.put("argb", _argb);
 BA.debugLineNum = 600;BA.debugLine="argb = GetARGB(C)";
Debug.JustUpdateDeviceLine();
_argb = __ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_getargb" /*RemoteObject*/ ,(Object)(_c));Debug.locals.put("argb", _argb);
 BA.debugLineNum = 602;BA.debugLine="a = 1 - ( 0.299 * argb(1) + 0.587 * argb(2) + 0.1";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.299),_argb.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(0.587),_argb.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(0.114),_argb.getArrayElement(true,BA.numberCast(int.class, 3))}, "*+*+*",2, 0)),RemoteObject.createImmutable(255)}, "-/",1, 0);Debug.locals.put("a", _a);
 BA.debugLineNum = 604;BA.debugLine="If a < 0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_a,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 605;BA.debugLine="d = 0 ' bright Colors - black font";
Debug.JustUpdateDeviceLine();
_d = BA.numberCast(int.class, 0);Debug.locals.put("d", _d);
 BA.debugLineNum = 606;BA.debugLine="Return xui.Color_Black";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");
 }else {
 BA.debugLineNum = 608;BA.debugLine="d = 255 ' dark Colors - white font";
Debug.JustUpdateDeviceLine();
_d = BA.numberCast(int.class, 255);Debug.locals.put("d", _d);
 BA.debugLineNum = 609;BA.debugLine="Return xui.Color_White";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");
 };
 BA.debugLineNum = 612;BA.debugLine="Return  xui.Color_ARGB(a,d, d, d)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, _a)),(Object)(_d),(Object)(_d),(Object)(_d));
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createroundbitmap(RemoteObject __ref,RemoteObject _input,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("CreateRoundBitmap (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,755);
if (RapidSub.canDelegate("createroundbitmap")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","createroundbitmap", __ref, _input, _size);}
RemoteObject _l = RemoteObject.createImmutable(0);
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _xview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Input", _input);
Debug.locals.put("Size", _size);
 BA.debugLineNum = 755;BA.debugLine="Sub CreateRoundBitmap (Input As B4XBitmap, Size As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 757;BA.debugLine="If Input.Width <> Input.Height Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_input.runMethod(true,"getWidth"),_input.runMethod(true,"getHeight"))) { 
 BA.debugLineNum = 759;BA.debugLine="Dim l As Int = Min(Input.Width, Input.Height)";
Debug.JustUpdateDeviceLine();
_l = BA.numberCast(int.class, jammsgdialogbbcodeview.__c.runMethod(true,"Min",(Object)(_input.runMethod(true,"getWidth")),(Object)(_input.runMethod(true,"getHeight"))));Debug.locals.put("l", _l);Debug.locals.put("l", _l);
 BA.debugLineNum = 760;BA.debugLine="Input = Input.Crop(Input.Width / 2 - l / 2, Inpu";
Debug.JustUpdateDeviceLine();
_input = _input.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_input.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_l,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_input.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_l,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_l),(Object)(_l));Debug.locals.put("Input", _input);
 };
 BA.debugLineNum = 762;BA.debugLine="Dim c As B4XCanvas";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("c", _c);
 BA.debugLineNum = 763;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_xview = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xview = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xview", _xview);Debug.locals.put("xview", _xview);
 BA.debugLineNum = 764;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, Size, Size)";
Debug.JustUpdateDeviceLine();
_xview.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _size)),(Object)(BA.numberCast(double.class, _size)));
 BA.debugLineNum = 765;BA.debugLine="c.Initialize(xview)";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_xview));
 BA.debugLineNum = 766;BA.debugLine="Dim path As B4XPath";
Debug.JustUpdateDeviceLine();
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("path", _path);
 BA.debugLineNum = 767;BA.debugLine="path.InitializeOval(c.TargetRect)";
Debug.JustUpdateDeviceLine();
_path.runVoidMethod ("InitializeOval",(Object)(_c.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 768;BA.debugLine="c.ClipPath(path)";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("ClipPath",(Object)(_path));
 BA.debugLineNum = 769;BA.debugLine="c.DrawBitmap(Input.Resize(Size, Size, False), c.T";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("DrawBitmap",(Object)((_input.runMethod(false,"Resize",(Object)(_size),(Object)(_size),(Object)(jammsgdialogbbcodeview.__c.getField(true,"False"))).getObject())),(Object)(_c.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 770;BA.debugLine="c.RemoveClip";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("RemoveClip");
 BA.debugLineNum = 772;BA.debugLine="If mAnchoBordeDialogo > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_manchobordedialogo" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 773;BA.debugLine="c.DrawCircle(c.TargetRect.CenterX, c.TargetRect.";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("DrawCircle",(Object)(_c.runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(_c.runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_c.runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "/-",1, 0))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(jammsgdialogbbcodeview.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_manchobordedialogo" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 775;BA.debugLine="c.Invalidate";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("Invalidate");
 BA.debugLineNum = 776;BA.debugLine="Dim res As B4XBitmap = c.CreateBitmap";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_res = _c.runMethod(false,"CreateBitmap");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 777;BA.debugLine="c.Release";
Debug.JustUpdateDeviceLine();
_c.runVoidMethod ("Release");
 BA.debugLineNum = 778;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 779;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getargb(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetARGB (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("getargb")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","getargb", __ref, _color);}
RemoteObject _res = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 586;BA.debugLine="Sub GetARGB(Color As Int) As Int()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 587;BA.debugLine="Dim res(4) As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 588;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 589;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 590;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 591;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialogbbcodeview.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff)))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 592;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcsscolorstringfromintcolor(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetCssColorStringFromIntColor (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,547);
if (RapidSub.canDelegate("getcsscolorstringfromintcolor")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","getcsscolorstringfromintcolor", __ref, _value);}
RemoteObject _hexargb = RemoteObject.createImmutable("");
RemoteObject _hexrgb = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 547;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 548;BA.debugLine="Select value";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_value,BA.numberCast(int.class, ((int)0x00ffffff)))) {
case 0: {
 BA.debugLineNum = 550;BA.debugLine="Return \"transparent\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("transparent");
 break; }
default: {
 BA.debugLineNum = 554;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
Debug.JustUpdateDeviceLine();
_hexargb = __ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_colortohex" /*RemoteObject*/ ,(Object)(_value));Debug.locals.put("HexARGB", _hexargb);Debug.locals.put("HexARGB", _hexargb);
 BA.debugLineNum = 555;BA.debugLine="If HexARGB.Length=6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_hexargb.runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 556;BA.debugLine="Return \"#\" & HexARGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexargb);
 }else {
 BA.debugLineNum = 558;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
Debug.JustUpdateDeviceLine();
_hexrgb = _hexargb.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("HexRGB", _hexrgb);Debug.locals.put("HexRGB", _hexrgb);
 BA.debugLineNum = 559;BA.debugLine="Return \"#\" & HexRGB";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable("#"),_hexrgb);
 };
 break; }
}
;
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _basedialogo,RemoteObject _title,RemoteObject _msgxd) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","initialize", __ref, _ba, _callback, _eventname, _basedialogo, _title, _msgxd);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("BaseDialogo", _basedialogo);
Debug.locals.put("Title", _title);
Debug.locals.put("MsgXD", _msgxd);
 BA.debugLineNum = 91;BA.debugLine="Public Sub Initialize(CallBack As Object, EventNam";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="mCallBack=CallBack";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 114;BA.debugLine="mEventName=EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 116;BA.debugLine="mBaseDialogo=BaseDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbasedialogo" /*RemoteObject*/ ,_basedialogo);
 BA.debugLineNum = 118;BA.debugLine="mMovible=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmovible" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="mColorOverlay=0xaa000000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcoloroverlay" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 121;BA.debugLine="mColorBackground=0xFF555555";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorbackground" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff555555)));
 BA.debugLineNum = 123;BA.debugLine="mTitle=Title";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtitle" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 124;BA.debugLine="mMsgXD=MsgXD";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmsgxd" /*RemoteObject*/ ,_msgxd);
 BA.debugLineNum = 126;BA.debugLine="mAnchoDialogo=300dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchodialogo" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))));
 BA.debugLineNum = 127;BA.debugLine="mAltoDialogo=200dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))));
 BA.debugLineNum = 129;BA.debugLine="mAlineacionVerticalMsg=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionverticalmsg" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 130;BA.debugLine="mAlineacionHorizontalMsg=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionhorizontalmsg" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 132;BA.debugLine="mAltoBotonesDialogo=40dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltobotonesdialogo" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 133;BA.debugLine="mTextoBotonPositive=\"OK\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonpositive" /*RemoteObject*/ ,BA.ObjectToString("OK"));
 BA.debugLineNum = 134;BA.debugLine="mTextoBotonCancel=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotoncancel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 135;BA.debugLine="mTextoBotonNegative=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonnegative" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 136;BA.debugLine="mTamanoFuenteBotonesDialogo=18";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentebotonesdialogo" /*RemoteObject*/ ,BA.numberCast(float.class, 18));
 BA.debugLineNum = 137;BA.debugLine="mColorFondoBotonPositive=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonpositive" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 138;BA.debugLine="mColorFondoBotonCancel=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotoncancel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 139;BA.debugLine="mColorFondoBotonNegative=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonnegative" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 140;BA.debugLine="mColorTextoBotonPositive=0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 141;BA.debugLine="mColorTextoBotonCancel=0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 142;BA.debugLine="mColorTextoBotonNegative=0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 144;BA.debugLine="mLightTheme=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mlighttheme" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="mAlineacionVerticalMsg=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionverticalmsg" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 148;BA.debugLine="mAlineacionHorizontalMsg=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionhorizontalmsg" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 149;BA.debugLine="mTamanoFuenteTextoMensaje=18";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetextomensaje" /*RemoteObject*/ ,BA.numberCast(float.class, 18));
 BA.debugLineNum = 150;BA.debugLine="mColorTextoMensaje=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextomensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 152;BA.debugLine="mAltoTitulo=40dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltotitulo" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 153;BA.debugLine="mTamanoFuenteTitulo=18";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetitulo" /*RemoteObject*/ ,BA.numberCast(float.class, 18));
 BA.debugLineNum = 154;BA.debugLine="mColorFondoTitulo=0xFF0083B8";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondotitulo" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff0083b8)));
 BA.debugLineNum = 156;BA.debugLine="mAnchoBordeDialogo=2dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchobordedialogo" /*RemoteObject*/ ,jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 157;BA.debugLine="mColorBordeDialogo=xui.Color_Gray";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorbordedialogo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 159;BA.debugLine="mNombreFicheroIconoTitulo=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mnombreficheroiconotitulo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 161;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 162;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 163;BA.debugLine="MeasurementCanvas.Initialize(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 166;BA.debugLine="TextEngine.Initialize(mBaseDialogo)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 167;BA.debugLine="Dialog.Initialize(mBaseDialogo)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 178;BA.debugLine="mDialogPanel= xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdialogpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 179;BA.debugLine="mDialogPanel.SetLayoutAnimated(0, 0, 0, mAnchoDia";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maltodialogo" /*RemoteObject*/ ),__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),jammsgdialogbbcodeview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "---",3, 1))));
 BA.debugLineNum = 180;BA.debugLine="mDialogPanel.LoadLayout(\"scrjammsgdialogbbcodevie";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("scrjammsgdialogbbcodeview")),__ref.getField(false, "ba"));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuremultilinetextheight(RemoteObject __ref,RemoteObject _font,RemoteObject _width,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("MeasureMultilineTextHeight (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("measuremultilinetextheight")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","measuremultilinetextheight", __ref, _font, _width, _text);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Font", _font);
Debug.locals.put("Width", _width);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 565;BA.debugLine="Sub MeasureMultilineTextHeight (Font As B4XFont, W";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 566;BA.debugLine="Dim jo As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 567;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_font.getObject()),(_text),(_width)}))));
 BA.debugLineNum = 568;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostraraviso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarAviso (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("mostraraviso")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","mostraraviso", __ref);}
ResumableSub_MostrarAviso rsub = new ResumableSub_MostrarAviso(null,__ref);
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
public static class ResumableSub_MostrarAviso extends BA.ResumableSub {
public ResumableSub_MostrarAviso(b4j.docU.jammsgdialogbbcodeview parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jammsgdialogbbcodeview parent;
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _numerobotonesdialog = RemoteObject.createImmutable(0);
RemoteObject _whueco = RemoteObject.createImmutable(0);
RemoteObject _wtotalhuecos = RemoteObject.createImmutable(0);
RemoteObject _wdispbotones = RemoteObject.createImmutable(0);
RemoteObject _anchobotonesdialog = RemoteObject.createImmutable(0);
RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _htitulo = RemoteObject.createImmutable(0);
RemoteObject _ivicon = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _medidaladoicono = RemoteObject.createImmutable(0);
RemoteObject _b4xivicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _textwidthbok = RemoteObject.createImmutable(0);
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _textwidthbcancel = RemoteObject.createImmutable(0);
RemoteObject _bnegative = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _textwidthbno = RemoteObject.createImmutable(0);
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarAviso (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,314);
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
 BA.debugLineNum = 316;BA.debugLine="If mAltoDialogo<300dip Then mAltoDialogo=300dip";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_maltodialogo" /*RemoteObject*/ ),BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))));
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 317;BA.debugLine="If mAnchoDialogo<240dip Then mAnchoDialogo=240dip";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref.setField ("_manchodialogo" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240))));
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 320;BA.debugLine="If mAltoDialogo>0.9*mBaseDialogo.Height Then mAlt";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_maltodialogo" /*RemoteObject*/ ),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210)))}, "*-",1, 0)));
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 321;BA.debugLine="If mAnchoDialogo>0.9*mBaseDialogo.Width Then mAnc";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
__ref.setField ("_manchodialogo" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0)));
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 329;BA.debugLine="Dialog.OverlayColor=mColorOverlay";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,__ref.getField(true,"_mcoloroverlay" /*RemoteObject*/ ));
 BA.debugLineNum = 331;BA.debugLine="Dialog.BackgroundColor=mColorBackground";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorbackground" /*RemoteObject*/ ));
 BA.debugLineNum = 333;BA.debugLine="Dialog.Title=mTitle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,__ref.getField(false,"_mtitle" /*RemoteObject*/ ));
 BA.debugLineNum = 335;BA.debugLine="Dialog.BorderColor=mColorBordeDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_bordercolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorbordedialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 336;BA.debugLine="Dialog.BorderWidth=mAnchoBordeDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_borderwidth" /*RemoteObject*/ ,__ref.getField(true,"_manchobordedialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 338;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(mTamano";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(__ref.getField(true,"_mtamanofuentetitulo" /*RemoteObject*/ ))));
 BA.debugLineNum = 339;BA.debugLine="Dialog.TitleBarColor=mColorFondoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 340;BA.debugLine="Dialog.TitleBarHeight=mAltoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 345;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(18)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 346;BA.debugLine="Dialog.ButtonsHeight=mAltoBotonesDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsheight" /*RemoteObject*/ ,__ref.getField(true,"_maltobotonesdialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 351;BA.debugLine="If mLightTheme Then SetLightThemeDialog(Dialog)";
Debug.JustUpdateDeviceLine();
if (true) break;

case 25:
//if
this.state = 30;
if (__ref.getField(true,"_mlighttheme" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
__ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_setlightthemedialog" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 356;BA.debugLine="mDialogPanel.SetLayoutAnimated(0, 0, 0, mAnchoDia";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maltodialogo" /*RemoteObject*/ ),__ref.getField(true,"_maltobotonesdialogo" /*RemoteObject*/ ),__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6)))}, "---",3, 1))));
 BA.debugLineNum = 357;BA.debugLine="if mColorFondoPanelMensaje<>0 then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mcolorfondopanelmensaje" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 358;BA.debugLine="mDialogPanel.SetColorAndBorder(mColorFondoPanelM";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_mcolorfondopanelmensaje" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 361;BA.debugLine="BBCodeViewDialog.TextEngine = TextEngine";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.bbcodeview.class, "_settextengine" /*RemoteObject*/ ,__ref.getField(false,"_textengine" /*RemoteObject*/ ));
 BA.debugLineNum = 363;BA.debugLine="TextEngine.SpaceBetweenLines = 1.85 * Measurement";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textengine" /*RemoteObject*/ ).runClassMethod (b4j.docU.bctextengine.class, "_setspacebetweenlines" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1.85),__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(BA.ObjectToString("X")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ))))).runMethod(true,"getHeight")}, "*",0, 0)));
 BA.debugLineNum = 366;BA.debugLine="BBCodeViewDialog.Text=\"[color=\" & GetCssColorStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.bbcodeview.class, "_settext" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("[color="),__ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_getcsscolorstringfromintcolor" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mcolortextomensaje" /*RemoteObject*/ ))),RemoteObject.createImmutable("][TextSize="),__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ),RemoteObject.createImmutable("]"),__ref.getField(false,"_mmsgxd" /*RemoteObject*/ ),RemoteObject.createImmutable("[/TextSize][/color]")));
 BA.debugLineNum = 369;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(mDialo";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ )),(Object)((__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 371;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jammsgdialogbbcodeview", "mostraraviso"),BA.numberCast(int.class, 0));
this.state = 90;
return;
case 90:
//C
this.state = 35;
;
 BA.debugLineNum = 377;BA.debugLine="log(\"mDialogPanel: \" & mDialogPanel.width & \", \"";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9148373567",RemoteObject.concat(RemoteObject.createImmutable("mDialogPanel: "),__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(", "),__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")),0);
 BA.debugLineNum = 378;BA.debugLine="log(\"Dialog.Base: \" & Dialog.Base.width & \", \" &";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","9148373568",RemoteObject.concat(RemoteObject.createImmutable("Dialog.Base: "),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(", "),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")),0);
 BA.debugLineNum = 380;BA.debugLine="BBCodeViewDialog.mBase.Height=mDialogPanel.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 381;BA.debugLine="BBCodeViewDialog.mBase.Width=mDialogPanel.width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 382;BA.debugLine="BBCodeViewDialog.sv.Height=mDialogPanel.Height";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setHeight",__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 383;BA.debugLine="BBCodeViewDialog.sv.Width=mDialogPanel.width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setWidth",__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 385;BA.debugLine="Dim  NumeroBotonesDialog As Int";
Debug.JustUpdateDeviceLine();
_numerobotonesdialog = RemoteObject.createImmutable(0);Debug.locals.put("NumeroBotonesDialog", _numerobotonesdialog);
 BA.debugLineNum = 386;BA.debugLine="NumeroBotonesDialog=BooleanToInt(mTextoBotonPosit";
Debug.JustUpdateDeviceLine();
_numerobotonesdialog = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))))),__ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))))),__ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0)))))}, "++",2, 1);Debug.locals.put("NumeroBotonesDialog", _numerobotonesdialog);
 BA.debugLineNum = 387;BA.debugLine="Dim wHueco As Double=10dip";
Debug.JustUpdateDeviceLine();
_whueco = BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("wHueco", _whueco);Debug.locals.put("wHueco", _whueco);
 BA.debugLineNum = 388;BA.debugLine="Dim wTotalHuecos As Double=wHueco*(NumeroBotonesD";
Debug.JustUpdateDeviceLine();
_wtotalhuecos = RemoteObject.solve(new RemoteObject[] {_whueco,(RemoteObject.solve(new RemoteObject[] {_numerobotonesdialog,RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0);Debug.locals.put("wTotalHuecos", _wtotalhuecos);Debug.locals.put("wTotalHuecos", _wtotalhuecos);
 BA.debugLineNum = 389;BA.debugLine="Dim wDispBotones As Double=Dialog.Base.Width-wTot";
Debug.JustUpdateDeviceLine();
_wdispbotones = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_wtotalhuecos}, "-",1, 0);Debug.locals.put("wDispBotones", _wdispbotones);Debug.locals.put("wDispBotones", _wdispbotones);
 BA.debugLineNum = 390;BA.debugLine="Dim AnchoBotonesDialog As Double=wDispBotones/Num";
Debug.JustUpdateDeviceLine();
_anchobotonesdialog = RemoteObject.solve(new RemoteObject[] {_wdispbotones,_numerobotonesdialog}, "/",0, 0);Debug.locals.put("AnchoBotonesDialog", _anchobotonesdialog);Debug.locals.put("AnchoBotonesDialog", _anchobotonesdialog);
 BA.debugLineNum = 392;BA.debugLine="Dialog.Base.Top=Max(5dip,(Dialog.mParent.Height-m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_maltodialogo" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 394;BA.debugLine="Dialog.TitleBar.Width=Dialog.Base.Width-Dialog.Bo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_borderwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 0));
 BA.debugLineNum = 395;BA.debugLine="Dim lblTitle As B4XView=Dialog.TitleBar.GetView(0";
Debug.JustUpdateDeviceLine();
_lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbltitle = __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lblTitle", _lbltitle);Debug.locals.put("lblTitle", _lbltitle);
 BA.debugLineNum = 396;BA.debugLine="lblTitle.Width=Dialog.TitleBar.Width";
Debug.JustUpdateDeviceLine();
_lbltitle.runMethod(true,"setWidth",__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 397;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_lbltitle.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 398;BA.debugLine="Dim lblT As Label=Dialog.TitleBar.GetView(0)";
Debug.JustUpdateDeviceLine();
_lblt = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lblT", _lblt);Debug.locals.put("lblT", _lblt);
 BA.debugLineNum = 400;BA.debugLine="lblT.WrapText = True";
Debug.JustUpdateDeviceLine();
_lblt.runMethod(true,"setWrapText",parent.__c.getField(true,"True"));
 BA.debugLineNum = 401;BA.debugLine="Dim hTitulo As Int=MeasureMultilineTextHeight(Dia";
Debug.JustUpdateDeviceLine();
_htitulo = BA.numberCast(int.class, __ref.runClassMethod (b4j.docU.jammsgdialogbbcodeview.class, "_measuremultilinetextheight" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebarfont" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(BA.ObjectToString(__ref.getField(false,"_mtitle" /*RemoteObject*/ )))));Debug.locals.put("hTitulo", _htitulo);Debug.locals.put("hTitulo", _htitulo);
 BA.debugLineNum = 410;BA.debugLine="Dialog.TitleBarHeight=hTitulo+5dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_htitulo,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1));
 BA.debugLineNum = 413;BA.debugLine="If mNombreFicheroIconoTitulo<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mnombreficheroiconotitulo" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 414;BA.debugLine="Private ivIcon As ImageView";
Debug.JustUpdateDeviceLine();
_ivicon = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("ivIcon", _ivicon);
 BA.debugLineNum = 415;BA.debugLine="ivIcon.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_ivicon.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 416;BA.debugLine="Dim MedidaLadoIcono As Double=Min(Min(20dip,Dial";
Debug.JustUpdateDeviceLine();
_medidaladoicono = parent.__c.runMethod(true,"Min",(Object)(parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")))),(Object)(parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")))));Debug.locals.put("MedidaLadoIcono", _medidaladoicono);Debug.locals.put("MedidaLadoIcono", _medidaladoicono);
 BA.debugLineNum = 417;BA.debugLine="Dialog.TitleBar.AddView(ivIcon,5dip,5dip,MedidaL";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_ivicon.getObject())),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(_medidaladoicono),(Object)(_medidaladoicono));
 BA.debugLineNum = 419;BA.debugLine="Dim B4XivIcon As B4XView=ivIcon";
Debug.JustUpdateDeviceLine();
_b4xivicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xivicon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _ivicon.getObject());Debug.locals.put("B4XivIcon", _b4xivicon);Debug.locals.put("B4XivIcon", _b4xivicon);
 BA.debugLineNum = 420;BA.debugLine="B4XivIcon.SetBitmap(xui.LoadBitmapResize(File.Di";
Debug.JustUpdateDeviceLine();
_b4xivicon.runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_mnombreficheroiconotitulo" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _medidaladoicono)),(Object)(BA.numberCast(int.class, _medidaladoicono)),(Object)(parent.__c.getField(true,"True"))).getObject())));
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 423;BA.debugLine="mPanelTitulo=xui.CreatePanel(\"mPanelTitulo\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mpaneltitulo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mPanelTitulo"))));
 BA.debugLineNum = 424;BA.debugLine="Dialog.TitleBar.AddView(mPanelTitulo,0,0,Dialog.T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpaneltitulo" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 427;BA.debugLine="Dim fnt As B4XFont=xui.CreateFont(Dialog.ButtonsF";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)((__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_buttonsfont" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 434;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 39:
//if
this.state = 50;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 435;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRe";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 436;BA.debugLine="bOK.TextSize=mTamanoFuenteBotonesDialogo";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 437;BA.debugLine="Dim TextWidthBOk As Int = MeasurementCanvas.Meas";
Debug.JustUpdateDeviceLine();
_textwidthbok = BA.numberCast(int.class, __ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ )),(Object)(_fnt)).runMethod(true,"getWidth"));Debug.locals.put("TextWidthBOk", _textwidthbok);Debug.locals.put("TextWidthBOk", _textwidthbok);
 BA.debugLineNum = 438;BA.debugLine="bOK.Width=AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setWidth",_anchobotonesdialog);
 BA.debugLineNum = 439;BA.debugLine="Select Case NumeroBotonesDialog";
Debug.JustUpdateDeviceLine();
if (true) break;

case 42:
//select
this.state = 49;
switch (BA.switchObjectToInt(_numerobotonesdialog,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 44;
if (true) break;
}
case 1: {
this.state = 46;
if (true) break;
}
case 2: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 44:
//C
this.state = 49;
 BA.debugLineNum = 441;BA.debugLine="bOK.Left=(Dialog.Base.Width-AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_anchobotonesdialog}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 443;BA.debugLine="bOK.Left=wHueco";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",_whueco);
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 445;BA.debugLine="bOK.Left=wHueco";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",_whueco);
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 448;BA.debugLine="bOK.SetTextAlignment(mAlineacionVerticalMsg, mAl";
Debug.JustUpdateDeviceLine();
_bok.runVoidMethod ("SetTextAlignment",(Object)(__ref.getField(true,"_malineacionverticalmsg" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_malineacionhorizontalmsg" /*RemoteObject*/ )));
 BA.debugLineNum = 449;BA.debugLine="bOK.Top=Dialog.Base.Height-Dialog.ButtonsHeight-";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 0));
 BA.debugLineNum = 450;BA.debugLine="bOK.Color=mColorFondoBotonPositive";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondobotonpositive" /*RemoteObject*/ ));
 BA.debugLineNum = 451;BA.debugLine="bOK.TextColor=mColorTextoBotonPositive";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextobotonpositive" /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 455;BA.debugLine="If mTextoBotonCancel<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 50:
//if
this.state = 67;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 456;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dial";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 457;BA.debugLine="bCancel.TextSize=mTamanoFuenteBotonesDialogo";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 458;BA.debugLine="Dim TextWidthBCancel As Int = MeasurementCanvas.";
Debug.JustUpdateDeviceLine();
_textwidthbcancel = BA.numberCast(int.class, __ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ )),(Object)(_fnt)).runMethod(true,"getWidth"));Debug.locals.put("TextWidthBCancel", _textwidthbcancel);Debug.locals.put("TextWidthBCancel", _textwidthbcancel);
 BA.debugLineNum = 459;BA.debugLine="bCancel.Width=AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",_anchobotonesdialog);
 BA.debugLineNum = 460;BA.debugLine="Select Case NumeroBotonesDialog";
Debug.JustUpdateDeviceLine();
if (true) break;

case 53:
//select
this.state = 66;
switch (BA.switchObjectToInt(_numerobotonesdialog,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 55;
if (true) break;
}
case 1: {
this.state = 57;
if (true) break;
}
case 2: {
this.state = 65;
if (true) break;
}
}
if (true) break;

case 55:
//C
this.state = 66;
 BA.debugLineNum = 462;BA.debugLine="bCancel.Left=(Dialog.Base.Width-AnchoBotonesDi";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_anchobotonesdialog}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 464;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
 BA.debugLineNum = 465;BA.debugLine="bCancel.Left= wHueco+AnchoBotonesDialog+wHuec";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 467;BA.debugLine="bCancel.Left= wHueco";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",_whueco);
 if (true) break;

case 63:
//C
this.state = 66;
;
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 470;BA.debugLine="bCancel.Left=wHueco+AnchoBotonesDialog+wHueco";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 473;BA.debugLine="bCancel.SetTextAlignment(mAlineacionVerticalMsg,";
Debug.JustUpdateDeviceLine();
_bcancel.runVoidMethod ("SetTextAlignment",(Object)(__ref.getField(true,"_malineacionverticalmsg" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_malineacionhorizontalmsg" /*RemoteObject*/ )));
 BA.debugLineNum = 474;BA.debugLine="bCancel.Top=Dialog.Base.Height-Dialog.ButtonsHei";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 0));
 BA.debugLineNum = 475;BA.debugLine="bCancel.Color=mColorFondoBotonCancel";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondobotoncancel" /*RemoteObject*/ ));
 BA.debugLineNum = 476;BA.debugLine="bCancel.textColor=mColorTextoBotonCancel";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextobotoncancel" /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 480;BA.debugLine="If mTextoBotonNegative<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 67:
//if
this.state = 84;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 481;BA.debugLine="Dim bNegative As B4XView=Dialog.GetButton(xui.Di";
Debug.JustUpdateDeviceLine();
_bnegative = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bnegative = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative")));Debug.locals.put("bNegative", _bnegative);Debug.locals.put("bNegative", _bnegative);
 BA.debugLineNum = 482;BA.debugLine="bNegative.TextSize=mTamanoFuenteBotonesDialogo";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 483;BA.debugLine="Dim TextWidthBNo As Int = MeasurementCanvas.Meas";
Debug.JustUpdateDeviceLine();
_textwidthbno = BA.numberCast(int.class, __ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ )),(Object)(_fnt)).runMethod(true,"getWidth"));Debug.locals.put("TextWidthBNo", _textwidthbno);Debug.locals.put("TextWidthBNo", _textwidthbno);
 BA.debugLineNum = 484;BA.debugLine="bNegative.Width=AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setWidth",_anchobotonesdialog);
 BA.debugLineNum = 485;BA.debugLine="Select Case NumeroBotonesDialog";
Debug.JustUpdateDeviceLine();
if (true) break;

case 70:
//select
this.state = 83;
switch (BA.switchObjectToInt(_numerobotonesdialog,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 72;
if (true) break;
}
case 1: {
this.state = 74;
if (true) break;
}
case 2: {
this.state = 82;
if (true) break;
}
}
if (true) break;

case 72:
//C
this.state = 83;
 BA.debugLineNum = 487;BA.debugLine="bNegative.Left=(Dialog.Base.Width-AnchoBotones";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_anchobotonesdialog}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 489;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 75:
//if
this.state = 80;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 77;
}else {
this.state = 79;
}if (true) break;

case 77:
//C
this.state = 80;
 BA.debugLineNum = 490;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 492;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 80:
//C
this.state = 83;
;
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 495;BA.debugLine="bNegative.Left=wHueco+AnchoBotonesDialog+wHuec";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco,_anchobotonesdialog,_whueco}, "++++",4, 0));
 if (true) break;

case 83:
//C
this.state = 84;
;
 BA.debugLineNum = 498;BA.debugLine="bNegative.SetTextAlignment(mAlineacionVerticalMs";
Debug.JustUpdateDeviceLine();
_bnegative.runVoidMethod ("SetTextAlignment",(Object)(__ref.getField(true,"_malineacionverticalmsg" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_malineacionhorizontalmsg" /*RemoteObject*/ )));
 BA.debugLineNum = 499;BA.debugLine="bNegative.Top=Dialog.Base.Height-Dialog.ButtonsH";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 0));
 BA.debugLineNum = 500;BA.debugLine="bNegative.Color=mColorFondoBotonNegative";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondobotonnegative" /*RemoteObject*/ ));
 BA.debugLineNum = 501;BA.debugLine="bNegative.TextColor=mColorTextoBotonNegative";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextobotonnegative" /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 508;BA.debugLine="If BBCodeViewDialog.Paragraph.Height>mDialogPanel";
Debug.JustUpdateDeviceLine();

case 84:
//if
this.state = 89;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_paragraph" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),__ref.getField(false,"_mdialogpanel" /*RemoteObject*/ ).runMethod(true,"getHeight"))) { 
this.state = 86;
}else {
this.state = 88;
}if (true) break;

case 86:
//C
this.state = 89;
 BA.debugLineNum = 510;BA.debugLine="Dim sp As ScrollPane = BBCodeViewDialog.sv";
Debug.JustUpdateDeviceLine();
_sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_sp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), __ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("sp", _sp);Debug.locals.put("sp", _sp);
 BA.debugLineNum = 511;BA.debugLine="sp.SetVScrollVisibility(\"ALWAYS\")";
Debug.JustUpdateDeviceLine();
_sp.runVoidMethod ("SetVScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("ALWAYS"))));
 if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 522;BA.debugLine="Dim sp As ScrollPane = BBCodeViewDialog.sv";
Debug.JustUpdateDeviceLine();
_sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_sp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), __ref.getField(false,"_bbcodeviewdialog" /*RemoteObject*/ ).getField(false,"_sv" /*RemoteObject*/ ).getObject());Debug.locals.put("sp", _sp);Debug.locals.put("sp", _sp);
 BA.debugLineNum = 523;BA.debugLine="sp.SetVScrollVisibility(\"NEVER\")";
Debug.JustUpdateDeviceLine();
_sp.runVoidMethod ("SetVScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("NEVER"))));
 if (true) break;

case 89:
//C
this.state = -1;
;
 BA.debugLineNum = 533;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jammsgdialogbbcodeview", "mostraraviso"), _rsub);
this.state = 91;
return;
case 91:
//C
this.state = -1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 535;BA.debugLine="Return rInt";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_rint));return;};
 BA.debugLineNum = 536;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _rint) throws Exception{
}
public static RemoteObject  _mpaneltitulo_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("mPanelTitulo_Touch (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,666);
if (RapidSub.canDelegate("mpaneltitulo_touch")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","mpaneltitulo_touch", __ref, _action, _x, _y);}
RemoteObject _nuevotop = RemoteObject.createImmutable(0);
RemoteObject _nuevoleft = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 666;BA.debugLine="Private Sub mPanelTitulo_Touch(Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 668;BA.debugLine="If mMovible Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mmovible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 669;BA.debugLine="If Action = Dialog.TitleBar.TOUCH_ACTION_DOWN Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 670;BA.debugLine="DownX  = X";
Debug.JustUpdateDeviceLine();
__ref.setField ("_downx" /*RemoteObject*/ ,BA.numberCast(double.class, _x));
 BA.debugLineNum = 671;BA.debugLine="DownY  = y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_downy" /*RemoteObject*/ ,BA.numberCast(double.class, _y));
 }else 
{ BA.debugLineNum = 672;BA.debugLine="Else if Action = Dialog.TitleBar.TOUCH_ACTION_MO";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 673;BA.debugLine="Dim NuevoTop as int=Dialog.Base.Top + y - DownY";
Debug.JustUpdateDeviceLine();
_nuevotop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ )}, "+-",2, 0));Debug.locals.put("NuevoTop", _nuevotop);Debug.locals.put("NuevoTop", _nuevotop);
 BA.debugLineNum = 674;BA.debugLine="Dim NuevoLeft as int=Dialog.Base.Left + x - Dow";
Debug.JustUpdateDeviceLine();
_nuevoleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x,__ref.getField(true,"_downx" /*RemoteObject*/ )}, "+-",2, 0));Debug.locals.put("NuevoLeft", _nuevoleft);Debug.locals.put("NuevoLeft", _nuevoleft);
 BA.debugLineNum = 676;BA.debugLine="if NuevoTop<mBaseDialogo.Top then NuevoTop=mBa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_nuevotop,__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getTop"))) { 
_nuevotop = BA.numberCast(int.class, __ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getTop"));Debug.locals.put("NuevoTop", _nuevotop);};
 BA.debugLineNum = 677;BA.debugLine="if NuevoTop>mBaseDialogo.Height-Dialog.Base.He";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_nuevotop,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0))) { 
_nuevotop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0));Debug.locals.put("NuevoTop", _nuevotop);};
 BA.debugLineNum = 678;BA.debugLine="if NuevoLeft<mBaseDialogo.Left then NuevoLeft=";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_nuevoleft,__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getLeft"))) { 
_nuevoleft = BA.numberCast(int.class, __ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getLeft"));Debug.locals.put("NuevoLeft", _nuevoleft);};
 BA.debugLineNum = 679;BA.debugLine="if NuevoLeft>mBaseDialogo.Width-Dialog.Base.Wi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_nuevoleft,RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0))) { 
_nuevoleft = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0));Debug.locals.put("NuevoLeft", _nuevoleft);};
 BA.debugLineNum = 687;BA.debugLine="Dialog.Base.Top =  NuevoTop";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, _nuevotop));
 BA.debugLineNum = 688;BA.debugLine="Dialog.Base.Left = NuevoLeft";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(double.class, _nuevoleft));
 }}
;
 };
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaltobotonesdialogo(RemoteObject __ref,RemoteObject _altobotonesdialogo) throws Exception{
try {
		Debug.PushSubsStack("setAltoBotonesDialogo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setaltobotonesdialogo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setaltobotonesdialogo", __ref, _altobotonesdialogo);}
Debug.locals.put("AltoBotonesDialogo", _altobotonesdialogo);
 BA.debugLineNum = 244;BA.debugLine="Sub setAltoBotonesDialogo(AltoBotonesDialogo As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="mAltoBotonesDialogo=AltoBotonesDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltobotonesdialogo" /*RemoteObject*/ ,_altobotonesdialogo);
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaltodialogo(RemoteObject __ref,RemoteObject _altodlg) throws Exception{
try {
		Debug.PushSubsStack("setAltoDialogo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("setaltodialogo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setaltodialogo", __ref, _altodlg);}
Debug.locals.put("AltoDlg", _altodlg);
 BA.debugLineNum = 215;BA.debugLine="Sub setAltoDialogo(AltoDlg As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="mAltoDialogo=AltoDlg";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,_altodlg);
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaltotitulo(RemoteObject __ref,RemoteObject _altotitulo) throws Exception{
try {
		Debug.PushSubsStack("setAltoTitulo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("setaltotitulo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setaltotitulo", __ref, _altotitulo);}
Debug.locals.put("AltoTitulo", _altotitulo);
 BA.debugLineNum = 219;BA.debugLine="Sub setAltoTitulo(AltoTitulo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 220;BA.debugLine="mAltoTitulo=AltoTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltotitulo" /*RemoteObject*/ ,_altotitulo);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanchobordedialogo(RemoteObject __ref,RemoteObject _anchobordedialogo) throws Exception{
try {
		Debug.PushSubsStack("setAnchoBordeDialogo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("setanchobordedialogo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setanchobordedialogo", __ref, _anchobordedialogo);}
Debug.locals.put("AnchoBordeDialogo", _anchobordedialogo);
 BA.debugLineNum = 304;BA.debugLine="Sub setAnchoBordeDialogo(AnchoBordeDialogo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 305;BA.debugLine="mAnchoBordeDialogo=AnchoBordeDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchobordedialogo" /*RemoteObject*/ ,_anchobordedialogo);
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanchodialogo(RemoteObject __ref,RemoteObject _anchodlg) throws Exception{
try {
		Debug.PushSubsStack("setAnchoDialogo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("setanchodialogo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setanchodialogo", __ref, _anchodlg);}
Debug.locals.put("AnchoDlg", _anchodlg);
 BA.debugLineNum = 211;BA.debugLine="Sub setAnchoDialogo(AnchoDlg As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 212;BA.debugLine="mAnchoDialogo=AnchoDlg";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchodialogo" /*RemoteObject*/ ,_anchodlg);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorbackground(RemoteObject __ref,RemoteObject _colorbackground) throws Exception{
try {
		Debug.PushSubsStack("setColorBackground (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setcolorbackground")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorbackground", __ref, _colorbackground);}
Debug.locals.put("ColorBackground", _colorbackground);
 BA.debugLineNum = 202;BA.debugLine="Sub setColorBackground(ColorBackground As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="mColorBackground=ColorBackground";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorbackground" /*RemoteObject*/ ,_colorbackground);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondobotoncancel(RemoteObject __ref,RemoteObject _colorbotoncancel) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoBotonCancel (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("setcolorfondobotoncancel")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorfondobotoncancel", __ref, _colorbotoncancel);}
Debug.locals.put("ColorBotonCancel", _colorbotoncancel);
 BA.debugLineNum = 264;BA.debugLine="Sub setColorFondoBotonCancel(ColorBotonCancel As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 265;BA.debugLine="mColorFondoBotonCancel=ColorBotonCancel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotoncancel" /*RemoteObject*/ ,_colorbotoncancel);
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondobotonnegative(RemoteObject __ref,RemoteObject _colorbotonnegative) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoBotonNegative (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("setcolorfondobotonnegative")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorfondobotonnegative", __ref, _colorbotonnegative);}
Debug.locals.put("ColorBotonNegative", _colorbotonnegative);
 BA.debugLineNum = 276;BA.debugLine="Sub setColorFondoBotonNegative(ColorBotonNegative";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="mColorFondoBotonNegative=ColorBotonNegative";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonnegative" /*RemoteObject*/ ,_colorbotonnegative);
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondobotonpositive(RemoteObject __ref,RemoteObject _colorbotonpositive) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoBotonPositive (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("setcolorfondobotonpositive")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorfondobotonpositive", __ref, _colorbotonpositive);}
Debug.locals.put("ColorBotonPositive", _colorbotonpositive);
 BA.debugLineNum = 252;BA.debugLine="Sub setColorFondoBotonPositive(ColorBotonPositive";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="mColorFondoBotonPositive=ColorBotonPositive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonpositive" /*RemoteObject*/ ,_colorbotonpositive);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondopanelmensaje(RemoteObject __ref,RemoteObject _colorfondopanelmensaje) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoPanelMensaje (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("setcolorfondopanelmensaje")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorfondopanelmensaje", __ref, _colorfondopanelmensaje);}
Debug.locals.put("ColorFondoPanelMensaje", _colorfondopanelmensaje);
 BA.debugLineNum = 231;BA.debugLine="Sub setColorFondoPanelMensaje(ColorFondoPanelMensa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="mColorFondoPanelMensaje=ColorFondoPanelMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondopanelmensaje" /*RemoteObject*/ ,_colorfondopanelmensaje);
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondotitulo(RemoteObject __ref,RemoteObject _colorfondotitulo) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoTitulo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("setcolorfondotitulo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorfondotitulo", __ref, _colorfondotitulo);}
Debug.locals.put("ColorFondoTitulo", _colorfondotitulo);
 BA.debugLineNum = 227;BA.debugLine="Sub setColorFondoTitulo(ColorFondoTitulo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 228;BA.debugLine="mColorFondoTitulo=ColorFondoTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondotitulo" /*RemoteObject*/ ,_colorfondotitulo);
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondotodosbotones(RemoteObject __ref,RemoteObject _colorfondotodosbotones) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoTodosBotones (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("setcolorfondotodosbotones")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolorfondotodosbotones", __ref, _colorfondotodosbotones);}
Debug.locals.put("ColorFondoTodosBotones", _colorfondotodosbotones);
 BA.debugLineNum = 284;BA.debugLine="Sub setColorFondoTodosBotones(ColorFondoTodosBoton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 285;BA.debugLine="mColorFondoBotonPositive=ColorFondoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonpositive" /*RemoteObject*/ ,_colorfondotodosbotones);
 BA.debugLineNum = 286;BA.debugLine="mColorFondoBotonCancel=ColorFondoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotoncancel" /*RemoteObject*/ ,_colorfondotodosbotones);
 BA.debugLineNum = 287;BA.debugLine="mColorFondoBotonNegative=ColorFondoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonnegative" /*RemoteObject*/ ,_colorfondotodosbotones);
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcoloroverlay(RemoteObject __ref,RemoteObject _coloroverlay) throws Exception{
try {
		Debug.PushSubsStack("setColorOverlay (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("setcoloroverlay")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcoloroverlay", __ref, _coloroverlay);}
Debug.locals.put("ColorOverlay", _coloroverlay);
 BA.debugLineNum = 198;BA.debugLine="Sub setColorOverlay(ColorOverlay As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="mColorOverlay=ColorOverlay";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcoloroverlay" /*RemoteObject*/ ,_coloroverlay);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolortextobotoncancel(RemoteObject __ref,RemoteObject _colorbotoncancel) throws Exception{
try {
		Debug.PushSubsStack("setColorTextoBotonCancel (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("setcolortextobotoncancel")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolortextobotoncancel", __ref, _colorbotoncancel);}
Debug.locals.put("ColorBotonCancel", _colorbotoncancel);
 BA.debugLineNum = 268;BA.debugLine="Sub setColorTextoBotonCancel(ColorBotonCancel As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="mColorTextoBotonCancel=ColorBotonCancel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,_colorbotoncancel);
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolortextobotonnegative(RemoteObject __ref,RemoteObject _colorbotonnegative) throws Exception{
try {
		Debug.PushSubsStack("setColorTextoBotonNegative (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("setcolortextobotonnegative")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolortextobotonnegative", __ref, _colorbotonnegative);}
Debug.locals.put("ColorBotonNegative", _colorbotonnegative);
 BA.debugLineNum = 280;BA.debugLine="Sub setColorTextoBotonNegative(ColorBotonNegative";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="mColorTextoBotonNegative=ColorBotonNegative";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,_colorbotonnegative);
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolortextobotonpositive(RemoteObject __ref,RemoteObject _colorbotonpositive) throws Exception{
try {
		Debug.PushSubsStack("setColorTextoBotonPositive (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setcolortextobotonpositive")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolortextobotonpositive", __ref, _colorbotonpositive);}
Debug.locals.put("ColorBotonPositive", _colorbotonpositive);
 BA.debugLineNum = 256;BA.debugLine="Sub setColorTextoBotonPositive(ColorBotonPositive";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="mColorTextoBotonPositive=ColorBotonPositive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,_colorbotonpositive);
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolortextomensaje(RemoteObject __ref,RemoteObject _colortextomensaje) throws Exception{
try {
		Debug.PushSubsStack("setColorTextoMensaje (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("setcolortextomensaje")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolortextomensaje", __ref, _colortextomensaje);}
Debug.locals.put("ColorTextoMensaje", _colortextomensaje);
 BA.debugLineNum = 236;BA.debugLine="Sub setColorTextoMensaje(ColorTextoMensaje As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 237;BA.debugLine="mColorTextoMensaje=ColorTextoMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextomensaje" /*RemoteObject*/ ,_colortextomensaje);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolortextotodosbotones(RemoteObject __ref,RemoteObject _colortextotodosbotones) throws Exception{
try {
		Debug.PushSubsStack("setColorTextoTodosBotones (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("setcolortextotodosbotones")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setcolortextotodosbotones", __ref, _colortextotodosbotones);}
Debug.locals.put("ColorTextoTodosBotones", _colortextotodosbotones);
 BA.debugLineNum = 290;BA.debugLine="Sub setColorTextoTodosBotones(ColorTextoTodosBoton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="mColorTextoBotonPositive=ColorTextoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,_colortextotodosbotones);
 BA.debugLineNum = 292;BA.debugLine="mColorTextoBotonCancel=ColorTextoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,_colortextotodosbotones);
 BA.debugLineNum = 293;BA.debugLine="mColorTextoBotonNegative=ColorTextoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,_colortextotodosbotones);
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlighttheme(RemoteObject __ref,RemoteObject _lighttheme) throws Exception{
try {
		Debug.PushSubsStack("setLightTheme (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setlighttheme")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setlighttheme", __ref, _lighttheme);}
Debug.locals.put("LightTheme", _lighttheme);
 BA.debugLineNum = 206;BA.debugLine="Sub setLightTheme(LightTheme As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="mLightTheme=LightTheme";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mlighttheme" /*RemoteObject*/ ,_lighttheme);
 BA.debugLineNum = 208;BA.debugLine="mColorTextoMensaje=xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextomensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedate(RemoteObject __ref,RemoteObject _datetemplate) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDate (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,649);
if (RapidSub.canDelegate("setlightthemedate")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setlightthemedate", __ref, _datetemplate);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("datetemplate", _datetemplate);
 BA.debugLineNum = 649;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 650;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 651;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_daysinweekcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 652;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x39))),(Object)(BA.numberCast(int.class, ((int)0xd7))),(Object)(BA.numberCast(int.class, ((int)0xce)))));
 BA.debugLineNum = 653;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_highlightedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0xce))),(Object)(BA.numberCast(int.class, ((int)0xff)))));
 BA.debugLineNum = 654;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_daysinmonthcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 655;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 656;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_datetemplate.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 657;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.JustUpdateDeviceLine();
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xa7))),(Object)(BA.numberCast(int.class, ((int)0x61)))));
 BA.debugLineNum = 658;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group9 = RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetemplate.getField(false,"_btnmonthleft" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnmonthright" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnyearleft" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnyearright" /*RemoteObject*/ ).getObject())});
final int groupLen9 = group9.getField(true,"length").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group9.getArrayElement(false,RemoteObject.createImmutable(index9)));Debug.locals.put("x", _x);
Debug.locals.put("x", _x);
 BA.debugLineNum = 659;BA.debugLine="x.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_x.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 661;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedialog(RemoteObject __ref,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDialog (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,615);
if (RapidSub.canDelegate("setlightthemedialog")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setlightthemedialog", __ref, _dlg);}
Debug.locals.put("Dlg", _dlg);
 BA.debugLineNum = 615;BA.debugLine="Sub SetLightThemeDialog(Dlg As B4XDialog)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 616;BA.debugLine="Dlg.BackgroundColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 617;BA.debugLine="Dlg.ButtonsColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_buttonscolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 618;BA.debugLine="Dlg.BorderColor = xui.Color_Gray";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_bordercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 619;BA.debugLine="Dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
Debug.JustUpdateDeviceLine();
_dlg.setField ("_buttonstextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0x7d))),(Object)(BA.numberCast(int.class, ((int)0xc3)))));
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemeinput(RemoteObject __ref,RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeInput (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,630);
if (RapidSub.canDelegate("setlightthemeinput")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setlightthemeinput", __ref, _input);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("input", _input);
 BA.debugLineNum = 630;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 631;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 632;BA.debugLine="input.TextField1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_input.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 633;BA.debugLine="input.lblTitle.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 634;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.docU.b4xinputtemplate.class, "_setbordercolor" /*RemoteObject*/ ,(Object)(_textcolor),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red")));
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemelist(RemoteObject __ref,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeList (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,622);
if (RapidSub.canDelegate("setlightthemelist")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setlightthemelist", __ref, _list);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("list", _list);
 BA.debugLineNum = 622;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 623;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 624;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 625;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 626;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 627;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
Debug.JustUpdateDeviceLine();
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 628;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemesearch(RemoteObject __ref,RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeSearch (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,637);
if (RapidSub.canDelegate("setlightthemesearch")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setlightthemesearch", __ref, _search);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("search", _search);
 BA.debugLineNum = 637;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 638;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.JustUpdateDeviceLine();
_textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 639;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 640;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 641;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 642;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 643;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 644;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
Debug.JustUpdateDeviceLine();
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 645;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
Debug.JustUpdateDeviceLine();
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 646;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 647;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmovible(RemoteObject __ref,RemoteObject _movible) throws Exception{
try {
		Debug.PushSubsStack("setMovible (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("setmovible")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setmovible", __ref, _movible);}
Debug.locals.put("Movible", _movible);
 BA.debugLineNum = 194;BA.debugLine="Sub setMovible(Movible As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="mMovible=Movible";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmovible" /*RemoteObject*/ ,_movible);
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnombreficheroiconobarratitulo(RemoteObject __ref,RemoteObject _nombreficheroicono) throws Exception{
try {
		Debug.PushSubsStack("setNombreFicheroIconoBarraTitulo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,300);
if (RapidSub.canDelegate("setnombreficheroiconobarratitulo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","setnombreficheroiconobarratitulo", __ref, _nombreficheroicono);}
Debug.locals.put("NombreFicheroIcono", _nombreficheroicono);
 BA.debugLineNum = 300;BA.debugLine="Sub setNombreFicheroIconoBarraTitulo(NombreFichero";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 301;BA.debugLine="mNombreFicheroIconoTitulo=NombreFicheroIcono";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mnombreficheroiconotitulo" /*RemoteObject*/ ,_nombreficheroicono);
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settamanofuentetextomensaje(RemoteObject __ref,RemoteObject _tamanofuentetextomensaje) throws Exception{
try {
		Debug.PushSubsStack("setTamanoFuenteTextoMensaje (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("settamanofuentetextomensaje")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","settamanofuentetextomensaje", __ref, _tamanofuentetextomensaje);}
Debug.locals.put("TamanoFuenteTextoMensaje", _tamanofuentetextomensaje);
 BA.debugLineNum = 240;BA.debugLine="Sub setTamanoFuenteTextoMensaje(TamanoFuenteTextoM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="mTamanoFuenteTextoMensaje=TamanoFuenteTextoMensaj";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetextomensaje" /*RemoteObject*/ ,_tamanofuentetextomensaje);
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settamanofuentetitulo(RemoteObject __ref,RemoteObject _tamanofuentetitulo) throws Exception{
try {
		Debug.PushSubsStack("setTamanoFuenteTitulo (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("settamanofuentetitulo")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","settamanofuentetitulo", __ref, _tamanofuentetitulo);}
Debug.locals.put("TamanoFuenteTitulo", _tamanofuentetitulo);
 BA.debugLineNum = 223;BA.debugLine="Sub setTamanoFuenteTitulo(TamanoFuenteTitulo As Fl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="mTamanoFuenteTitulo=TamanoFuenteTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetitulo" /*RemoteObject*/ ,_tamanofuentetitulo);
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settamanotextotodosbotones(RemoteObject __ref,RemoteObject _tamanotextotodosbotones) throws Exception{
try {
		Debug.PushSubsStack("setTamanoTextoTodosBotones (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("settamanotextotodosbotones")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","settamanotextotodosbotones", __ref, _tamanotextotodosbotones);}
Debug.locals.put("TamanoTextoTodosBotones", _tamanotextotodosbotones);
 BA.debugLineNum = 296;BA.debugLine="Sub setTamanoTextoTodosBotones(TamanoTextoTodosBot";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="mTamanoFuenteBotonesDialogo=TamanoTextoTodosBoton";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentebotonesdialogo" /*RemoteObject*/ ,_tamanotextotodosbotones);
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextobotoncancel(RemoteObject __ref,RemoteObject _textobotoncancel) throws Exception{
try {
		Debug.PushSubsStack("setTextoBotonCancel (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("settextobotoncancel")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","settextobotoncancel", __ref, _textobotoncancel);}
Debug.locals.put("TextoBotonCancel", _textobotoncancel);
 BA.debugLineNum = 260;BA.debugLine="Sub setTextoBotonCancel(TextoBotonCancel As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="mTextoBotonCancel=TextoBotonCancel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotoncancel" /*RemoteObject*/ ,_textobotoncancel);
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextobotonnegative(RemoteObject __ref,RemoteObject _textobotonnegative) throws Exception{
try {
		Debug.PushSubsStack("setTextoBotonNegative (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("settextobotonnegative")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","settextobotonnegative", __ref, _textobotonnegative);}
Debug.locals.put("TextoBotonNegative", _textobotonnegative);
 BA.debugLineNum = 272;BA.debugLine="Sub setTextoBotonNegative(TextoBotonNegative As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="mTextoBotonNegative=TextoBotonNegative";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonnegative" /*RemoteObject*/ ,_textobotonnegative);
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextobotonpositive(RemoteObject __ref,RemoteObject _textobotonpositive) throws Exception{
try {
		Debug.PushSubsStack("setTextoBotonPositive (jammsgdialogbbcodeview) ","jammsgdialogbbcodeview",82,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("settextobotonpositive")) { return __ref.runUserSub(false, "jammsgdialogbbcodeview","settextobotonpositive", __ref, _textobotonpositive);}
Debug.locals.put("TextoBotonPositive", _textobotonpositive);
 BA.debugLineNum = 248;BA.debugLine="Sub setTextoBotonPositive(TextoBotonPositive As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="mTextoBotonPositive=TextoBotonPositive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonpositive" /*RemoteObject*/ ,_textobotonpositive);
 BA.debugLineNum = 250;BA.debugLine="End Sub";
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