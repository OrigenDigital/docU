package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jammsgdialog_subs_0 {


public static RemoteObject  _booleantoint(RemoteObject __ref,RemoteObject _bool) throws Exception{
try {
		Debug.PushSubsStack("BooleanToInt (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,859);
if (RapidSub.canDelegate("booleantoint")) { return __ref.runUserSub(false, "jammsgdialog","booleantoint", __ref, _bool);}
Debug.locals.put("Bool", _bool);
 BA.debugLineNum = 859;BA.debugLine="Sub BooleanToInt(Bool As Boolean) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 860;BA.debugLine="If Bool Then Return 1 Else Return 0";
Debug.JustUpdateDeviceLine();
if (_bool.<Boolean>get().booleanValue()) { 
if (true) return BA.numberCast(int.class, 1);}
else {
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 861;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
jammsgdialog._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jammsgdialog._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
jammsgdialog._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",jammsgdialog._fx);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
jammsgdialog._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",jammsgdialog._dialog);
 //BA.debugLineNum = 10;BA.debugLine="Private mTextoMensaje As Object";
jammsgdialog._mtextomensaje = RemoteObject.createNew ("Object");__ref.setField("_mtextomensaje",jammsgdialog._mtextomensaje);
 //BA.debugLineNum = 11;BA.debugLine="Private mBaseDialogo As B4XView";
jammsgdialog._mbasedialogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbasedialogo",jammsgdialog._mbasedialogo);
 //BA.debugLineNum = 13;BA.debugLine="Private mColorOverlay As Int";
jammsgdialog._mcoloroverlay = RemoteObject.createImmutable(0);__ref.setField("_mcoloroverlay",jammsgdialog._mcoloroverlay);
 //BA.debugLineNum = 14;BA.debugLine="Private mColorFondoDialogo As Int";
jammsgdialog._mcolorfondodialogo = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondodialogo",jammsgdialog._mcolorfondodialogo);
 //BA.debugLineNum = 18;BA.debugLine="Private mMovible As Boolean";
jammsgdialog._mmovible = RemoteObject.createImmutable(false);__ref.setField("_mmovible",jammsgdialog._mmovible);
 //BA.debugLineNum = 19;BA.debugLine="Private DownX As Double";
jammsgdialog._downx = RemoteObject.createImmutable(0);__ref.setField("_downx",jammsgdialog._downx);
 //BA.debugLineNum = 20;BA.debugLine="Private DownY As Double";
jammsgdialog._downy = RemoteObject.createImmutable(0);__ref.setField("_downy",jammsgdialog._downy);
 //BA.debugLineNum = 22;BA.debugLine="Private mAnchoDialogo As Int";
jammsgdialog._manchodialogo = RemoteObject.createImmutable(0);__ref.setField("_manchodialogo",jammsgdialog._manchodialogo);
 //BA.debugLineNum = 23;BA.debugLine="Private mAltoDialogo As Int";
jammsgdialog._maltodialogo = RemoteObject.createImmutable(0);__ref.setField("_maltodialogo",jammsgdialog._maltodialogo);
 //BA.debugLineNum = 24;BA.debugLine="Private const MaxAltoDialogoMensajeCorto As Int=1";
jammsgdialog._maxaltodialogomensajecorto = jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180)));__ref.setField("_maxaltodialogomensajecorto",jammsgdialog._maxaltodialogomensajecorto);
 //BA.debugLineNum = 25;BA.debugLine="Private const MinAltoDialogoMensajeCorto As Int=1";
jammsgdialog._minaltodialogomensajecorto = jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)));__ref.setField("_minaltodialogomensajecorto",jammsgdialog._minaltodialogomensajecorto);
 //BA.debugLineNum = 26;BA.debugLine="Private mAlineacionVerticalMsg As String";
jammsgdialog._malineacionverticalmsg = RemoteObject.createImmutable("");__ref.setField("_malineacionverticalmsg",jammsgdialog._malineacionverticalmsg);
 //BA.debugLineNum = 27;BA.debugLine="Private mAlineacionHorizontalMsg As String";
jammsgdialog._malineacionhorizontalmsg = RemoteObject.createImmutable("");__ref.setField("_malineacionhorizontalmsg",jammsgdialog._malineacionhorizontalmsg);
 //BA.debugLineNum = 29;BA.debugLine="Private mFuenteTextoMensaje As B4XFont";
jammsgdialog._mfuentetextomensaje = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_mfuentetextomensaje",jammsgdialog._mfuentetextomensaje);
 //BA.debugLineNum = 30;BA.debugLine="Private mTamanoFuenteTextoMensaje As Float";
jammsgdialog._mtamanofuentetextomensaje = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentetextomensaje",jammsgdialog._mtamanofuentetextomensaje);
 //BA.debugLineNum = 31;BA.debugLine="Private mColorTextoMensaje As Int";
jammsgdialog._mcolortextomensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolortextomensaje",jammsgdialog._mcolortextomensaje);
 //BA.debugLineNum = 32;BA.debugLine="Private mColorFondoMensaje As Int";
jammsgdialog._mcolorfondomensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondomensaje",jammsgdialog._mcolorfondomensaje);
 //BA.debugLineNum = 34;BA.debugLine="Private mTextoTitulo As Object";
jammsgdialog._mtextotitulo = RemoteObject.createNew ("Object");__ref.setField("_mtextotitulo",jammsgdialog._mtextotitulo);
 //BA.debugLineNum = 35;BA.debugLine="Private mAltoTitulo As Int";
jammsgdialog._maltotitulo = RemoteObject.createImmutable(0);__ref.setField("_maltotitulo",jammsgdialog._maltotitulo);
 //BA.debugLineNum = 36;BA.debugLine="Private mFuenteTextoTitulo As B4XFont";
jammsgdialog._mfuentetextotitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_mfuentetextotitulo",jammsgdialog._mfuentetextotitulo);
 //BA.debugLineNum = 37;BA.debugLine="Private mColorTextoTitulo As Int";
jammsgdialog._mcolortextotitulo = RemoteObject.createImmutable(0);__ref.setField("_mcolortextotitulo",jammsgdialog._mcolortextotitulo);
 //BA.debugLineNum = 38;BA.debugLine="Private mTamanoFuenteTitulo As Float";
jammsgdialog._mtamanofuentetitulo = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentetitulo",jammsgdialog._mtamanofuentetitulo);
 //BA.debugLineNum = 39;BA.debugLine="Private mColorFondoTitulo As Int";
jammsgdialog._mcolorfondotitulo = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondotitulo",jammsgdialog._mcolorfondotitulo);
 //BA.debugLineNum = 40;BA.debugLine="Private mPanelTitulo As B4XView";
jammsgdialog._mpaneltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpaneltitulo",jammsgdialog._mpaneltitulo);
 //BA.debugLineNum = 42;BA.debugLine="Private mAnchoBordeDialogo As Int";
jammsgdialog._manchobordedialogo = RemoteObject.createImmutable(0);__ref.setField("_manchobordedialogo",jammsgdialog._manchobordedialogo);
 //BA.debugLineNum = 43;BA.debugLine="Private mColorBordeDialogo As Int";
jammsgdialog._mcolorbordedialogo = RemoteObject.createImmutable(0);__ref.setField("_mcolorbordedialogo",jammsgdialog._mcolorbordedialogo);
 //BA.debugLineNum = 46;BA.debugLine="Private mAltoBotonesDialogo As Int";
jammsgdialog._maltobotonesdialogo = RemoteObject.createImmutable(0);__ref.setField("_maltobotonesdialogo",jammsgdialog._maltobotonesdialogo);
 //BA.debugLineNum = 47;BA.debugLine="Private mTextoBotonPositive As String";
jammsgdialog._mtextobotonpositive = RemoteObject.createImmutable("");__ref.setField("_mtextobotonpositive",jammsgdialog._mtextobotonpositive);
 //BA.debugLineNum = 48;BA.debugLine="Private mTextoBotonCancel As String";
jammsgdialog._mtextobotoncancel = RemoteObject.createImmutable("");__ref.setField("_mtextobotoncancel",jammsgdialog._mtextobotoncancel);
 //BA.debugLineNum = 49;BA.debugLine="Private mTextoBotonNegative As String";
jammsgdialog._mtextobotonnegative = RemoteObject.createImmutable("");__ref.setField("_mtextobotonnegative",jammsgdialog._mtextobotonnegative);
 //BA.debugLineNum = 50;BA.debugLine="Private mTamanoFuenteBotonesDialogo As Float";
jammsgdialog._mtamanofuentebotonesdialogo = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentebotonesdialogo",jammsgdialog._mtamanofuentebotonesdialogo);
 //BA.debugLineNum = 51;BA.debugLine="Private mColorFondoBotonPositive As Int";
jammsgdialog._mcolorfondobotonpositive = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondobotonpositive",jammsgdialog._mcolorfondobotonpositive);
 //BA.debugLineNum = 52;BA.debugLine="Private mColorFondoBotonCancel As Int";
jammsgdialog._mcolorfondobotoncancel = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondobotoncancel",jammsgdialog._mcolorfondobotoncancel);
 //BA.debugLineNum = 53;BA.debugLine="Private mColorFondoBotonNegative As Int";
jammsgdialog._mcolorfondobotonnegative = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondobotonnegative",jammsgdialog._mcolorfondobotonnegative);
 //BA.debugLineNum = 54;BA.debugLine="Private mColorTextoBotonPositive As Int";
jammsgdialog._mcolortextobotonpositive = RemoteObject.createImmutable(0);__ref.setField("_mcolortextobotonpositive",jammsgdialog._mcolortextobotonpositive);
 //BA.debugLineNum = 55;BA.debugLine="Private mColorTextoBotonCancel As Int";
jammsgdialog._mcolortextobotoncancel = RemoteObject.createImmutable(0);__ref.setField("_mcolortextobotoncancel",jammsgdialog._mcolortextobotoncancel);
 //BA.debugLineNum = 56;BA.debugLine="Private mColorTextoBotonNegative As Int";
jammsgdialog._mcolortextobotonnegative = RemoteObject.createImmutable(0);__ref.setField("_mcolortextobotonnegative",jammsgdialog._mcolortextobotonnegative);
 //BA.debugLineNum = 58;BA.debugLine="Private mNombreFicheroIconoTitulo As String";
jammsgdialog._mnombreficheroiconotitulo = RemoteObject.createImmutable("");__ref.setField("_mnombreficheroiconotitulo",jammsgdialog._mnombreficheroiconotitulo);
 //BA.debugLineNum = 60;BA.debugLine="Private CONST AlineacionCentro As String=\"CENTER\"";
jammsgdialog._alineacioncentro = BA.ObjectToString("CENTER");__ref.setField("_alineacioncentro",jammsgdialog._alineacioncentro);
 //BA.debugLineNum = 61;BA.debugLine="Private CONST AlineacionIzquierda As String=\"LEFT";
jammsgdialog._alineacionizquierda = BA.ObjectToString("LEFT");__ref.setField("_alineacionizquierda",jammsgdialog._alineacionizquierda);
 //BA.debugLineNum = 62;BA.debugLine="Private CONST AlineacionDerecha As String=\"RIGHT\"";
jammsgdialog._alineacionderecha = BA.ObjectToString("RIGHT");__ref.setField("_alineacionderecha",jammsgdialog._alineacionderecha);
 //BA.debugLineNum = 63;BA.debugLine="Private CONST AlineacionTop As String=\"TOP\"";
jammsgdialog._alineaciontop = BA.ObjectToString("TOP");__ref.setField("_alineaciontop",jammsgdialog._alineaciontop);
 //BA.debugLineNum = 64;BA.debugLine="Private CONST AlineacionBottom As String=\"BOTTOM\"";
jammsgdialog._alineacionbottom = BA.ObjectToString("BOTTOM");__ref.setField("_alineacionbottom",jammsgdialog._alineacionbottom);
 //BA.debugLineNum = 66;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
jammsgdialog._measurementcanvas = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_measurementcanvas",jammsgdialog._measurementcanvas);
 //BA.debugLineNum = 68;BA.debugLine="Private UsaB4XLongTextTemplate As Boolean";
jammsgdialog._usab4xlongtexttemplate = RemoteObject.createImmutable(false);__ref.setField("_usab4xlongtexttemplate",jammsgdialog._usab4xlongtexttemplate);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _contrastcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("ContrastColor (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,895);
if (RapidSub.canDelegate("contrastcolor")) { return __ref.runUserSub(false, "jammsgdialog","contrastcolor", __ref, _c);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _argb = null;
Debug.locals.put("C", _c);
 BA.debugLineNum = 895;BA.debugLine="Sub ContrastColor(C As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 896;BA.debugLine="Dim d As Int";
Debug.JustUpdateDeviceLine();
_d = RemoteObject.createImmutable(0);Debug.locals.put("d", _d);
 BA.debugLineNum = 897;BA.debugLine="Dim a As Double";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createImmutable(0);Debug.locals.put("a", _a);
 BA.debugLineNum = 898;BA.debugLine="Dim argb() As Int";
Debug.JustUpdateDeviceLine();
_argb = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});Debug.locals.put("argb", _argb);
 BA.debugLineNum = 899;BA.debugLine="argb = GetARGB(C)";
Debug.JustUpdateDeviceLine();
_argb = __ref.runClassMethod (b4j.docU.jammsgdialog.class, "_getargb" /*RemoteObject*/ ,(Object)(_c));Debug.locals.put("argb", _argb);
 BA.debugLineNum = 901;BA.debugLine="a = 1 - ( 0.299 * argb(1) + 0.587 * argb(2) + 0.1";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.299),_argb.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(0.587),_argb.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(0.114),_argb.getArrayElement(true,BA.numberCast(int.class, 3))}, "*+*+*",2, 0)),RemoteObject.createImmutable(255)}, "-/",1, 0);Debug.locals.put("a", _a);
 BA.debugLineNum = 903;BA.debugLine="If a < 0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_a,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 904;BA.debugLine="d = 0 ' bright Colors - black font";
Debug.JustUpdateDeviceLine();
_d = BA.numberCast(int.class, 0);Debug.locals.put("d", _d);
 BA.debugLineNum = 905;BA.debugLine="Return xui.Color_Black";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");
 }else {
 BA.debugLineNum = 907;BA.debugLine="d = 255 ' dark Colors - white font";
Debug.JustUpdateDeviceLine();
_d = BA.numberCast(int.class, 255);Debug.locals.put("d", _d);
 BA.debugLineNum = 908;BA.debugLine="Return xui.Color_White";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");
 };
 BA.debugLineNum = 911;BA.debugLine="Return  xui.Color_ARGB(a,d, d, d)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, _a)),(Object)(_d),(Object)(_d),(Object)(_d));
 BA.debugLineNum = 912;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getargb(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetARGB (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,885);
if (RapidSub.canDelegate("getargb")) { return __ref.runUserSub(false, "jammsgdialog","getargb", __ref, _color);}
RemoteObject _res = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 885;BA.debugLine="Sub GetARGB(Color As Int) As Int()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 886;BA.debugLine="Dim res(4) As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 887;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialog.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(jammsgdialog.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 888;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialog.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(jammsgdialog.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 889;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialog.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(jammsgdialog.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 890;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (jammsgdialog.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff)))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 891;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 892;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfuentelabelmensaje(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFuenteLabelMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("getfuentelabelmensaje")) { return __ref.runUserSub(false, "jammsgdialog","getfuentelabelmensaje", __ref);}
 BA.debugLineNum = 315;BA.debugLine="Sub getFuenteLabelMensaje As B4XFont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="Return mFuenteTextoMensaje";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mfuentetextomensaje" /*RemoteObject*/ );
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabelmensaje(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLabelMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("getlabelmensaje")) { return __ref.runUserSub(false, "jammsgdialog","getlabelmensaje", __ref);}
RemoteObject _xlblmensaje = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _scrpnl = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
RemoteObject _scrpnlinnerpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 252;BA.debugLine="private Sub getLabelMensaje As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="Dim xlblMensaje As B4XView";
Debug.JustUpdateDeviceLine();
_xlblmensaje = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xlblMensaje", _xlblmensaje);
 BA.debugLineNum = 274;BA.debugLine="Dim p As B4XView=getPanelMensaje";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (b4j.docU.jammsgdialog.class, "_getpanelmensaje" /*RemoteObject*/ );Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 275;BA.debugLine="Dim xObj As B4XView=p.GetView(0)";
Debug.JustUpdateDeviceLine();
_xobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xobj = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xObj", _xobj);Debug.locals.put("xObj", _xobj);
 BA.debugLineNum = 276;BA.debugLine="Select True";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(jammsgdialog.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("i",_xobj.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Label"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("i",_xobj.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.layout.Pane"))))) {
case 0: {
 BA.debugLineNum = 278;BA.debugLine="xlblMensaje=p.GetView(0)";
Debug.JustUpdateDeviceLine();
_xlblmensaje = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlblMensaje", _xlblmensaje);
 break; }
case 1: {
 BA.debugLineNum = 285;BA.debugLine="Dim scrPnl As ScrollPane=xObj.GetView(0)";
Debug.JustUpdateDeviceLine();
_scrpnl = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_scrpnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), _xobj.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("scrPnl", _scrpnl);Debug.locals.put("scrPnl", _scrpnl);
 BA.debugLineNum = 286;BA.debugLine="Dim scrPnlInnerPanel As B4XView=scrPnl.InnerNod";
Debug.JustUpdateDeviceLine();
_scrpnlinnerpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_scrpnlinnerpanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _scrpnl.runMethod(false,"getInnerNode").getObject());Debug.locals.put("scrPnlInnerPanel", _scrpnlinnerpanel);Debug.locals.put("scrPnlInnerPanel", _scrpnlinnerpanel);
 BA.debugLineNum = 290;BA.debugLine="xlblMensaje=scrPnlInnerPanel.GetView(0).GetView";
Debug.JustUpdateDeviceLine();
_xlblmensaje = _scrpnlinnerpanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlblMensaje", _xlblmensaje);
 break; }
}
;
 BA.debugLineNum = 293;BA.debugLine="Return xlblMensaje";
Debug.JustUpdateDeviceLine();
if (true) return _xlblmensaje;
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanelmensaje(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPanelMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("getpanelmensaje")) { return __ref.runUserSub(false, "jammsgdialog","getpanelmensaje", __ref);}
RemoteObject _idxpanelmensaje = RemoteObject.createImmutable(0);
RemoteObject _b4xpanelmensaje = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 246;BA.debugLine="private Sub getPanelMensaje As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="Dim iDxPanelMensaje As Int=Dialog.Base.NumberOfVi";
Debug.JustUpdateDeviceLine();
_idxpanelmensaje = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iDxPanelMensaje", _idxpanelmensaje);Debug.locals.put("iDxPanelMensaje", _idxpanelmensaje);
 BA.debugLineNum = 248;BA.debugLine="Dim B4xPanelMensaje As B4XView=Dialog.Base.GetVie";
Debug.JustUpdateDeviceLine();
_b4xpanelmensaje = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xpanelmensaje = __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_idxpanelmensaje));Debug.locals.put("B4xPanelMensaje", _b4xpanelmensaje);Debug.locals.put("B4xPanelMensaje", _b4xpanelmensaje);
 BA.debugLineNum = 249;BA.debugLine="Return B4xPanelMensaje";
Debug.JustUpdateDeviceLine();
if (true) return _b4xpanelmensaje;
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettamanofuentetextomensaje(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTamanoFuenteTextoMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,384);
if (RapidSub.canDelegate("gettamanofuentetextomensaje")) { return __ref.runUserSub(false, "jammsgdialog","gettamanofuentetextomensaje", __ref);}
 BA.debugLineNum = 384;BA.debugLine="Sub getTamanoFuenteTextoMensaje As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 385;BA.debugLine="Return mTamanoFuenteTextoMensaje";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ );
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _basedialogo) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jammsgdialog","initialize", __ref, _ba, _basedialogo);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("BaseDialogo", _basedialogo);
 BA.debugLineNum = 96;BA.debugLine="Public Sub Initialize(BaseDialogo As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="mBaseDialogo=BaseDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbasedialogo" /*RemoteObject*/ ,_basedialogo);
 BA.debugLineNum = 100;BA.debugLine="mMovible=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmovible" /*RemoteObject*/ ,jammsgdialog.__c.getField(true,"True"));
 BA.debugLineNum = 103;BA.debugLine="SetTemaClaro";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_settemaclaro" /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="mColorOverlay=xui.Color_Transparent  ' color tran";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcoloroverlay" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 115;BA.debugLine="mBaseDialogo=BaseDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbasedialogo" /*RemoteObject*/ ,_basedialogo);
 BA.debugLineNum = 121;BA.debugLine="mAnchoDialogo=500dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchodialogo" /*RemoteObject*/ ,jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500))));
 BA.debugLineNum = 122;BA.debugLine="mAltoDialogo=180dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 180))));
 BA.debugLineNum = 126;BA.debugLine="mAlineacionVerticalMsg=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionverticalmsg" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 127;BA.debugLine="mAlineacionHorizontalMsg=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionhorizontalmsg" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 129;BA.debugLine="mAltoBotonesDialogo=30dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltobotonesdialogo" /*RemoteObject*/ ,jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))));
 BA.debugLineNum = 133;BA.debugLine="mTextoBotonPositive=\"OK\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonpositive" /*RemoteObject*/ ,BA.ObjectToString("OK"));
 BA.debugLineNum = 134;BA.debugLine="mTextoBotonCancel=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotoncancel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 135;BA.debugLine="mTextoBotonNegative=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonnegative" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 137;BA.debugLine="mTamanoFuenteBotonesDialogo=14";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentebotonesdialogo" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 BA.debugLineNum = 141;BA.debugLine="mColorFondoBotonPositive=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonpositive" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 142;BA.debugLine="mColorFondoBotonCancel=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotoncancel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 143;BA.debugLine="mColorFondoBotonNegative=xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonnegative" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 153;BA.debugLine="mTamanoFuenteTextoMensaje=14";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetextomensaje" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 BA.debugLineNum = 161;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 162;BA.debugLine="mFuenteTextoMensaje=xui.CreateFont(fx.CreateFont";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfuentetextomensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(BA.ObjectToString("Arial")),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ))),(Object)(jammsgdialog.__c.getField(true,"False")),(Object)(jammsgdialog.__c.getField(true,"False"))).getObject())),(Object)(__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e22) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e22.toString()); BA.debugLineNum = 164;BA.debugLine="mFuenteTextoMensaje=xui.CreateDefaultFont(mTaman";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfuentetextomensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 170;BA.debugLine="mAltoTitulo=40dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltotitulo" /*RemoteObject*/ ,jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 BA.debugLineNum = 172;BA.debugLine="mTamanoFuenteTitulo=14";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetitulo" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 BA.debugLineNum = 181;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 182;BA.debugLine="mFuenteTextoTitulo=xui.CreateFont(fx.CreateFont(";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfuentetextotitulo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)(BA.ObjectToString("Arial")),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentetitulo" /*RemoteObject*/ ))),(Object)(jammsgdialog.__c.getField(true,"False")),(Object)(jammsgdialog.__c.getField(true,"False"))).getObject())),(Object)(__ref.getField(true,"_mtamanofuentetitulo" /*RemoteObject*/ ))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e29.toString()); BA.debugLineNum = 184;BA.debugLine="mFuenteTextoTitulo=xui.CreateDefaultFont(mTamano";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfuentetextotitulo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(__ref.getField(true,"_mtamanofuentetitulo" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 192;BA.debugLine="mAnchoBordeDialogo=2dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchobordedialogo" /*RemoteObject*/ ,jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 195;BA.debugLine="mNombreFicheroIconoTitulo=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mnombreficheroiconotitulo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 199;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")  ' necesar";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 200;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(double.class, jammsgdialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 201;BA.debugLine="MeasurementCanvas.Initialize(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_p));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MeasureMultilineTextHeight (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,865);
if (RapidSub.canDelegate("measuremultilinetextheight")) { return __ref.runUserSub(false, "jammsgdialog","measuremultilinetextheight", __ref, _font, _width, _text);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Font", _font);
Debug.locals.put("Width", _width);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 865;BA.debugLine="Sub MeasureMultilineTextHeight (Font As B4XFont, W";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 866;BA.debugLine="Dim jo As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 867;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_font.getObject()),(_text),(_width)}))));
 BA.debugLineNum = 868;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("MostrarAviso (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,477);
if (RapidSub.canDelegate("mostraraviso")) { return __ref.runUserSub(false, "jammsgdialog","mostraraviso", __ref);}
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
public ResumableSub_MostrarAviso(b4j.docU.jammsgdialog parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jammsgdialog parent;
RemoteObject _htitulo = RemoteObject.createImmutable(0);
RemoteObject _hlbldummymensaje = RemoteObject.createImmutable(0);
RemoteObject _dltxt = RemoteObject.declareNull("b4j.docU.jamb4xlongtexttemplate");
RemoteObject _clvlt = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _numerobotonesdialog = RemoteObject.createImmutable(0);
RemoteObject _whueco = RemoteObject.createImmutable(0);
RemoteObject _wtotalhuecos = RemoteObject.createImmutable(0);
RemoteObject _wdispbotones = RemoteObject.createImmutable(0);
RemoteObject _anchobotonesdialog = RemoteObject.createImmutable(0);
RemoteObject _pinterior = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _b4xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lbltitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _lblt = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
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
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MostrarAviso (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,477);
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
 BA.debugLineNum = 481;BA.debugLine="Dim Dialog As B4XDialog";
Debug.JustUpdateDeviceLine();
parent._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",parent._dialog);
 BA.debugLineNum = 482;BA.debugLine="Dialog.Initialize(mBaseDialogo)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 484;BA.debugLine="Dialog.OverlayColor=mColorOverlay";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_overlaycolor" /*RemoteObject*/ ,__ref.getField(true,"_mcoloroverlay" /*RemoteObject*/ ));
 BA.debugLineNum = 486;BA.debugLine="Dialog.BackgroundColor=mColorFondoDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_backgroundcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondodialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 488;BA.debugLine="Dialog.BorderColor=mColorBordeDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_bordercolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorbordedialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 489;BA.debugLine="Dialog.BorderWidth=mAnchoBordeDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_borderwidth" /*RemoteObject*/ ,__ref.getField(true,"_manchobordedialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 491;BA.debugLine="Dialog.Title=mTextoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,__ref.getField(false,"_mtextotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 492;BA.debugLine="Dialog.TitleBarFont=mFuenteTextoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_mfuentetextotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 494;BA.debugLine="Dialog.TitleBarTextColor=mColorTextoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebartextcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolortextotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 495;BA.debugLine="Dialog.TitleBarColor=mColorFondoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 496;BA.debugLine="Dialog.TitleBarHeight=mAltoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ));
 BA.debugLineNum = 500;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(18)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 501;BA.debugLine="Dialog.ButtonsHeight=mAltoBotonesDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsheight" /*RemoteObject*/ ,__ref.getField(true,"_maltobotonesdialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 504;BA.debugLine="Dim hTitulo As Int=MeasureMultilineTextHeight(xui";
Debug.JustUpdateDeviceLine();
_htitulo = BA.numberCast(int.class, __ref.runClassMethod (b4j.docU.jammsgdialog.class, "_measuremultilinetextheight" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont2",(Object)(__ref.getField(false,"_mfuentetextotitulo" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mtamanofuentetitulo" /*RemoteObject*/ )))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(BA.ObjectToString(__ref.getField(false,"_mtextotitulo" /*RemoteObject*/ )))));Debug.locals.put("hTitulo", _htitulo);Debug.locals.put("hTitulo", _htitulo);
 BA.debugLineNum = 505;BA.debugLine="hTitulo=hTitulo+5dip";
Debug.JustUpdateDeviceLine();
_htitulo = RemoteObject.solve(new RemoteObject[] {_htitulo,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1);Debug.locals.put("hTitulo", _htitulo);
 BA.debugLineNum = 506;BA.debugLine="Dim hlblDummyMensaje As Int=MeasureMultilineTextH";
Debug.JustUpdateDeviceLine();
_hlbldummymensaje = BA.numberCast(int.class, __ref.runClassMethod (b4j.docU.jammsgdialog.class, "_measuremultilinetextheight" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont2",(Object)(__ref.getField(false,"_mfuentetextomensaje" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ )))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(BA.ObjectToString(__ref.getField(false,"_mtextomensaje" /*RemoteObject*/ )))));Debug.locals.put("hlblDummyMensaje", _hlbldummymensaje);Debug.locals.put("hlblDummyMensaje", _hlbldummymensaje);
 BA.debugLineNum = 507;BA.debugLine="hlblDummyMensaje=hlblDummyMensaje";
Debug.JustUpdateDeviceLine();
_hlbldummymensaje = _hlbldummymensaje;Debug.locals.put("hlblDummyMensaje", _hlbldummymensaje);
 BA.debugLineNum = 526;BA.debugLine="Dialog.TitleBarHeight=Min(Max(hTitulo,mAltoTitulo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,BA.numberCast(int.class, parent.__c.runMethod(true,"Min",(Object)(parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _htitulo)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_maltotitulo" /*RemoteObject*/ ))))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)))));
 BA.debugLineNum = 527;BA.debugLine="mAltoTitulo=Dialog.TitleBarHeight";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltotitulo" /*RemoteObject*/ ,__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_titlebarheight" /*RemoteObject*/ ));
 BA.debugLineNum = 535;BA.debugLine="If hlblDummyMensaje>MaxAltoDialogoMensajeCorto-mA";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_hlbldummymensaje,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxaltodialogomensajecorto" /*RemoteObject*/ ),__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ),__ref.getField(true,"_maltobotonesdialogo" /*RemoteObject*/ )}, "--",2, 1)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 537;BA.debugLine="UsaB4XLongTextTemplate=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_usab4xlongtexttemplate" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 541;BA.debugLine="Dim Dltxt As jamB4XLongTextTemplate";
Debug.JustUpdateDeviceLine();
_dltxt = RemoteObject.createNew ("b4j.docU.jamb4xlongtexttemplate");Debug.locals.put("Dltxt", _dltxt);
 BA.debugLineNum = 542;BA.debugLine="Dltxt.Initialize";
Debug.JustUpdateDeviceLine();
_dltxt.runClassMethod (b4j.docU.jamb4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 543;BA.debugLine="Dltxt.Text=mTextoMensaje";
Debug.JustUpdateDeviceLine();
_dltxt.setField ("_text" /*RemoteObject*/ ,__ref.getField(false,"_mtextomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 544;BA.debugLine="Dltxt.TextBackgroundColor=mColorFondoMensaje";
Debug.JustUpdateDeviceLine();
_dltxt.setField ("_textbackgroundcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 545;BA.debugLine="Dltxt.TextColor=mColorTextoMensaje";
Debug.JustUpdateDeviceLine();
_dltxt.setField ("_textcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolortextomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 546;BA.debugLine="Dltxt.TextFont=mFuenteTextoMensaje";
Debug.JustUpdateDeviceLine();
_dltxt.setField ("_textfont" /*RemoteObject*/ ,__ref.getField(false,"_mfuentetextomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 547;BA.debugLine="Dltxt.TextSize=mTamanoFuenteTextoMensaje";
Debug.JustUpdateDeviceLine();
_dltxt.setField ("_textsize" /*RemoteObject*/ ,__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 548;BA.debugLine="Dltxt.CLVBackgroundColor=mColorFondoDialogo";
Debug.JustUpdateDeviceLine();
_dltxt.setField ("_clvbackgroundcolor" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondodialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 549;BA.debugLine="Dltxt.CustomListView1.sv.Color=mColorFondoDialog";
Debug.JustUpdateDeviceLine();
_dltxt.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",__ref.getField(true,"_mcolorfondodialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 551;BA.debugLine="Dim clvLT As CustomListView=Dltxt.CustomListView";
Debug.JustUpdateDeviceLine();
_clvlt = _dltxt.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("clvLT", _clvlt);Debug.locals.put("clvLT", _clvlt);
 BA.debugLineNum = 571;BA.debugLine="Dltxt.Resize(mAnchoDialogo-5dip,Max(mAltoDialogo";
Debug.JustUpdateDeviceLine();
_dltxt.runClassMethod (b4j.docU.jamb4xlongtexttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_manchodialogo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maltodialogo" /*RemoteObject*/ ),__ref.getField(true,"_maltobotonesdialogo" /*RemoteObject*/ ),__ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-+/",2, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))))))));
 BA.debugLineNum = 580;BA.debugLine="Dim rSub As ResumableSub=Dialog.Showtemplate(Dlt";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_dltxt)),(Object)((__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 581;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jammsgdialog", "mostraraviso"),BA.numberCast(int.class, 0));
this.state = 67;
return;
case 67:
//C
this.state = 12;
;
 BA.debugLineNum = 582;BA.debugLine="Dim p As B4XView=getPanelMensaje";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (b4j.docU.jammsgdialog.class, "_getpanelmensaje" /*RemoteObject*/ );Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 583;BA.debugLine="p.Color=mColorFondoMensaje";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 614;BA.debugLine="Dim  NumeroBotonesDialog As Int";
Debug.JustUpdateDeviceLine();
_numerobotonesdialog = RemoteObject.createImmutable(0);Debug.locals.put("NumeroBotonesDialog", _numerobotonesdialog);
 BA.debugLineNum = 615;BA.debugLine="NumeroBotonesDialog=BooleanToInt(mTextoBotonPosi";
Debug.JustUpdateDeviceLine();
_numerobotonesdialog = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))))),__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))))),__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0)))))}, "++",2, 1);Debug.locals.put("NumeroBotonesDialog", _numerobotonesdialog);
 BA.debugLineNum = 616;BA.debugLine="Dim wHueco As Double=10dip";
Debug.JustUpdateDeviceLine();
_whueco = BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("wHueco", _whueco);Debug.locals.put("wHueco", _whueco);
 BA.debugLineNum = 617;BA.debugLine="Dim wTotalHuecos As Double=wHueco*(NumeroBotones";
Debug.JustUpdateDeviceLine();
_wtotalhuecos = RemoteObject.solve(new RemoteObject[] {_whueco,(RemoteObject.solve(new RemoteObject[] {_numerobotonesdialog,RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0);Debug.locals.put("wTotalHuecos", _wtotalhuecos);Debug.locals.put("wTotalHuecos", _wtotalhuecos);
 BA.debugLineNum = 618;BA.debugLine="Dim wDispBotones As Double=Dialog.Base.Width-wTo";
Debug.JustUpdateDeviceLine();
_wdispbotones = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_wtotalhuecos}, "-",1, 0);Debug.locals.put("wDispBotones", _wdispbotones);Debug.locals.put("wDispBotones", _wdispbotones);
 BA.debugLineNum = 619;BA.debugLine="Dim AnchoBotonesDialog As Double=wDispBotones/Nu";
Debug.JustUpdateDeviceLine();
_anchobotonesdialog = RemoteObject.solve(new RemoteObject[] {_wdispbotones,_numerobotonesdialog}, "/",0, 0);Debug.locals.put("AnchoBotonesDialog", _anchobotonesdialog);Debug.locals.put("AnchoBotonesDialog", _anchobotonesdialog);
 BA.debugLineNum = 633;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jammsgdialog", "mostraraviso"),BA.numberCast(int.class, 0));
this.state = 68;
return;
case 68:
//C
this.state = 12;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 647;BA.debugLine="UsaB4XLongTextTemplate=False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_usab4xlongtexttemplate" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 648;BA.debugLine="Dim rSub As ResumableSub=Dialog.Show(mTextoMensa";
Debug.JustUpdateDeviceLine();
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_show" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mtextomensaje" /*RemoteObject*/ )),(Object)((__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 649;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jammsgdialog", "mostraraviso"),BA.numberCast(int.class, 0));
this.state = 69;
return;
case 69:
//C
this.state = 6;
;
 BA.debugLineNum = 654;BA.debugLine="mAltoDialogo=Max(hlblDummyMensaje+mAltoTitulo+mA";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_hlbldummymensaje,__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ),__ref.getField(true,"_maltobotonesdialogo" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "+++",3, 1))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_minaltodialogomensajecorto" /*RemoteObject*/ ))))));
 BA.debugLineNum = 656;BA.debugLine="Dialog.Base.Width=mAnchoDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, __ref.getField(true,"_manchodialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 657;BA.debugLine="Dialog.Base.Height=mAltoDialogo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(double.class, __ref.getField(true,"_maltodialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 658;BA.debugLine="Dialog.Base.Left=Max(10dip,(mBaseDialogo.Width-D";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setLeft",parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 660;BA.debugLine="Dim  NumeroBotonesDialog As Int";
Debug.JustUpdateDeviceLine();
_numerobotonesdialog = RemoteObject.createImmutable(0);Debug.locals.put("NumeroBotonesDialog", _numerobotonesdialog);
 BA.debugLineNum = 661;BA.debugLine="NumeroBotonesDialog=BooleanToInt(mTextoBotonPosi";
Debug.JustUpdateDeviceLine();
_numerobotonesdialog = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))))),__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))))),__ref.runClassMethod (b4j.docU.jammsgdialog.class, "_booleantoint" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0)))))}, "++",2, 1);Debug.locals.put("NumeroBotonesDialog", _numerobotonesdialog);
 BA.debugLineNum = 662;BA.debugLine="Dim wHueco As Double=10dip";
Debug.JustUpdateDeviceLine();
_whueco = BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("wHueco", _whueco);Debug.locals.put("wHueco", _whueco);
 BA.debugLineNum = 663;BA.debugLine="Dim wTotalHuecos As Double=wHueco*(NumeroBotones";
Debug.JustUpdateDeviceLine();
_wtotalhuecos = RemoteObject.solve(new RemoteObject[] {_whueco,(RemoteObject.solve(new RemoteObject[] {_numerobotonesdialog,RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0);Debug.locals.put("wTotalHuecos", _wtotalhuecos);Debug.locals.put("wTotalHuecos", _wtotalhuecos);
 BA.debugLineNum = 664;BA.debugLine="Dim wDispBotones As Double=Dialog.Base.Width-wTo";
Debug.JustUpdateDeviceLine();
_wdispbotones = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_wtotalhuecos}, "-",1, 0);Debug.locals.put("wDispBotones", _wdispbotones);Debug.locals.put("wDispBotones", _wdispbotones);
 BA.debugLineNum = 665;BA.debugLine="Dim AnchoBotonesDialog As Double=wDispBotones/Nu";
Debug.JustUpdateDeviceLine();
_anchobotonesdialog = RemoteObject.solve(new RemoteObject[] {_wdispbotones,_numerobotonesdialog}, "/",0, 0);Debug.locals.put("AnchoBotonesDialog", _anchobotonesdialog);Debug.locals.put("AnchoBotonesDialog", _anchobotonesdialog);
 BA.debugLineNum = 667;BA.debugLine="If mTextoTitulo=\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mtextotitulo" /*RemoteObject*/ ),RemoteObject.createImmutable(("")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 668;BA.debugLine="Dim pInterior As B4XView=Dialog.Base.GetView(Nu";
Debug.JustUpdateDeviceLine();
_pinterior = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pinterior = __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(_numerobotonesdialog));Debug.locals.put("pInterior", _pinterior);Debug.locals.put("pInterior", _pinterior);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 670;BA.debugLine="Dim pInterior As B4XView=Dialog.Base.GetView(Nu";
Debug.JustUpdateDeviceLine();
_pinterior = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pinterior = __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_numerobotonesdialog,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("pInterior", _pinterior);Debug.locals.put("pInterior", _pinterior);
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 672;BA.debugLine="pInterior.Width=Dialog.Base.Width-4dip";
Debug.JustUpdateDeviceLine();
_pinterior.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 0));
 BA.debugLineNum = 673;BA.debugLine="pInterior.Height=Dialog.Base.Height-mAltoTitulo-";
Debug.JustUpdateDeviceLine();
_pinterior.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_maltotitulo" /*RemoteObject*/ ),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ )}, "--",2, 0));
 BA.debugLineNum = 674;BA.debugLine="pInterior.Color=mColorFondoMensaje";
Debug.JustUpdateDeviceLine();
_pinterior.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 676;BA.debugLine="Dim b4xlbl As B4XView=pInterior.Getview(0)";
Debug.JustUpdateDeviceLine();
_b4xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xlbl = _pinterior.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("b4xlbl", _b4xlbl);Debug.locals.put("b4xlbl", _b4xlbl);
 BA.debugLineNum = 677;BA.debugLine="b4xlbl.TextColor=mColorTextoMensaje";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextomensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 678;BA.debugLine="b4xlbl.TextSize=mTamanoFuenteTextoMensaje";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentetextomensaje" /*RemoteObject*/ )));
 BA.debugLineNum = 679;BA.debugLine="b4xlbl.Width=pInterior.Width-5dip";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_pinterior.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));
 BA.debugLineNum = 680;BA.debugLine="b4xlbl.Height=pInterior.Height";
Debug.JustUpdateDeviceLine();
_b4xlbl.runMethod(true,"setHeight",_pinterior.runMethod(true,"getHeight"));
 BA.debugLineNum = 681;BA.debugLine="b4xlbl.SetTextAlignment(mAlineacionVerticalMsg,m";
Debug.JustUpdateDeviceLine();
_b4xlbl.runVoidMethod ("SetTextAlignment",(Object)(__ref.getField(true,"_malineacionverticalmsg" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_malineacionhorizontalmsg" /*RemoteObject*/ )));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 686;BA.debugLine="Dialog.Base.Top=Max(5dip,(mBaseDialogo.Height-mAl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_maltodialogo" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 688;BA.debugLine="If mTextoTitulo<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_mtextotitulo" /*RemoteObject*/ ),RemoteObject.createImmutable(("")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 689;BA.debugLine="Dialog.TitleBar.Width=Dialog.Base.Width-Dialog.B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_borderwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 0));
 BA.debugLineNum = 690;BA.debugLine="Dim lblTitle As B4XView=Dialog.TitleBar.GetView(";
Debug.JustUpdateDeviceLine();
_lbltitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbltitle = __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lblTitle", _lbltitle);Debug.locals.put("lblTitle", _lbltitle);
 BA.debugLineNum = 691;BA.debugLine="lblTitle.Width=Dialog.TitleBar.Width";
Debug.JustUpdateDeviceLine();
_lbltitle.runMethod(true,"setWidth",__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getWidth"));
 BA.debugLineNum = 692;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_lbltitle.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 693;BA.debugLine="Dim lblT As Label=Dialog.TitleBar.GetView(0)";
Debug.JustUpdateDeviceLine();
_lblt = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblt = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("lblT", _lblt);Debug.locals.put("lblT", _lblt);
 BA.debugLineNum = 695;BA.debugLine="lblT.WrapText = True";
Debug.JustUpdateDeviceLine();
_lblt.runMethod(true,"setWrapText",parent.__c.getField(true,"True"));
 BA.debugLineNum = 702;BA.debugLine="If mNombreFicheroIconoTitulo<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mnombreficheroiconotitulo" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 703;BA.debugLine="Private ivIcon As ImageView";
Debug.JustUpdateDeviceLine();
_ivicon = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("ivIcon", _ivicon);
 BA.debugLineNum = 704;BA.debugLine="ivIcon.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_ivicon.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 705;BA.debugLine="Dim MedidaLadoIcono As Double=Min(Min(20dip,Dia";
Debug.JustUpdateDeviceLine();
_medidaladoicono = parent.__c.runMethod(true,"Min",(Object)(parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")))),(Object)(parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")))));Debug.locals.put("MedidaLadoIcono", _medidaladoicono);Debug.locals.put("MedidaLadoIcono", _medidaladoicono);
 BA.debugLineNum = 706;BA.debugLine="Dialog.TitleBar.AddView(ivIcon,5dip,5dip,Medida";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_ivicon.getObject())),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(_medidaladoicono),(Object)(_medidaladoicono));
 BA.debugLineNum = 708;BA.debugLine="Dim B4XivIcon As B4XView=ivIcon";
Debug.JustUpdateDeviceLine();
_b4xivicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_b4xivicon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _ivicon.getObject());Debug.locals.put("B4XivIcon", _b4xivicon);Debug.locals.put("B4XivIcon", _b4xivicon);
 BA.debugLineNum = 709;BA.debugLine="B4XivIcon.SetBitmap(xui.LoadBitmapResize(File.D";
Debug.JustUpdateDeviceLine();
_b4xivicon.runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(__ref.getField(true,"_mnombreficheroiconotitulo" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _medidaladoicono)),(Object)(BA.numberCast(int.class, _medidaladoicono)),(Object)(parent.__c.getField(true,"True"))).getObject())));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 713;BA.debugLine="mPanelTitulo=xui.CreatePanel(\"mPanelTitulo\")  '";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mpaneltitulo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mPanelTitulo"))));
 BA.debugLineNum = 714;BA.debugLine="Dialog.TitleBar.AddView(mPanelTitulo,0,0,Dialog.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpaneltitulo" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 718;BA.debugLine="Dim fnt As B4XFont=xui.CreateFont(Dialog.ButtonsF";
Debug.JustUpdateDeviceLine();
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_fnt = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateFont",(Object)((__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_buttonsfont" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 724;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 32;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 725;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRe";
Debug.JustUpdateDeviceLine();
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 726;BA.debugLine="bOK.TextSize=mTamanoFuenteBotonesDialogo";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 727;BA.debugLine="Dim TextWidthBOk As Int = MeasurementCanvas.Meas";
Debug.JustUpdateDeviceLine();
_textwidthbok = BA.numberCast(int.class, __ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ )),(Object)(_fnt)).runMethod(true,"getWidth"));Debug.locals.put("TextWidthBOk", _textwidthbok);Debug.locals.put("TextWidthBOk", _textwidthbok);
 BA.debugLineNum = 729;BA.debugLine="bOK.Width=AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setWidth",_anchobotonesdialog);
 BA.debugLineNum = 730;BA.debugLine="Select Case NumeroBotonesDialog";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//select
this.state = 31;
switch (BA.switchObjectToInt(_numerobotonesdialog,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 26;
if (true) break;
}
case 1: {
this.state = 28;
if (true) break;
}
case 2: {
this.state = 30;
if (true) break;
}
}
if (true) break;

case 26:
//C
this.state = 31;
 BA.debugLineNum = 732;BA.debugLine="bOK.Left=(Dialog.Base.Width-AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_anchobotonesdialog}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 734;BA.debugLine="bOK.Left=wHueco";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",_whueco);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 736;BA.debugLine="bOK.Left=wHueco";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setLeft",_whueco);
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 739;BA.debugLine="bOK.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_bok.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 740;BA.debugLine="bOK.Top=Dialog.Base.Height-Dialog.ButtonsHeight-";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 0));
 BA.debugLineNum = 741;BA.debugLine="bOK.Color=mColorFondoBotonPositive";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondobotonpositive" /*RemoteObject*/ ));
 BA.debugLineNum = 742;BA.debugLine="bOK.TextColor=mColorTextoBotonPositive";
Debug.JustUpdateDeviceLine();
_bok.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextobotonpositive" /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 746;BA.debugLine="If mTextoBotonCancel<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 32:
//if
this.state = 49;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 747;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dial";
Debug.JustUpdateDeviceLine();
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 748;BA.debugLine="bCancel.TextSize=mTamanoFuenteBotonesDialogo";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 749;BA.debugLine="Dim TextWidthBCancel As Int = MeasurementCanvas.";
Debug.JustUpdateDeviceLine();
_textwidthbcancel = BA.numberCast(int.class, __ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_mtextobotoncancel" /*RemoteObject*/ )),(Object)(_fnt)).runMethod(true,"getWidth"));Debug.locals.put("TextWidthBCancel", _textwidthbcancel);Debug.locals.put("TextWidthBCancel", _textwidthbcancel);
 BA.debugLineNum = 750;BA.debugLine="bCancel.Width=AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setWidth",_anchobotonesdialog);
 BA.debugLineNum = 751;BA.debugLine="Select Case NumeroBotonesDialog";
Debug.JustUpdateDeviceLine();
if (true) break;

case 35:
//select
this.state = 48;
switch (BA.switchObjectToInt(_numerobotonesdialog,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 37;
if (true) break;
}
case 1: {
this.state = 39;
if (true) break;
}
case 2: {
this.state = 47;
if (true) break;
}
}
if (true) break;

case 37:
//C
this.state = 48;
 BA.debugLineNum = 753;BA.debugLine="bCancel.Left=(Dialog.Base.Width-AnchoBotonesDi";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_anchobotonesdialog}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 755;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 40:
//if
this.state = 45;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
 BA.debugLineNum = 756;BA.debugLine="bCancel.Left= wHueco+AnchoBotonesDialog+wHuec";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 758;BA.debugLine="bCancel.Left= wHueco";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",_whueco);
 if (true) break;

case 45:
//C
this.state = 48;
;
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 761;BA.debugLine="bCancel.Left=wHueco+AnchoBotonesDialog+wHueco";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 764;BA.debugLine="bCancel.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_bcancel.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 765;BA.debugLine="bCancel.Top=Dialog.Base.Height-Dialog.ButtonsHei";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 0));
 BA.debugLineNum = 766;BA.debugLine="bCancel.Color=mColorFondoBotonCancel";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondobotoncancel" /*RemoteObject*/ ));
 BA.debugLineNum = 767;BA.debugLine="bCancel.textColor=mColorTextoBotonCancel";
Debug.JustUpdateDeviceLine();
_bcancel.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextobotoncancel" /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 771;BA.debugLine="If mTextoBotonNegative<>\"\" Then";
Debug.JustUpdateDeviceLine();

case 49:
//if
this.state = 66;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 772;BA.debugLine="Dim bNegative As B4XView=Dialog.GetButton(xui.Di";
Debug.JustUpdateDeviceLine();
_bnegative = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bnegative = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Negative")));Debug.locals.put("bNegative", _bnegative);Debug.locals.put("bNegative", _bnegative);
 BA.debugLineNum = 773;BA.debugLine="bNegative.TextSize=mTamanoFuenteBotonesDialogo";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentebotonesdialogo" /*RemoteObject*/ )));
 BA.debugLineNum = 774;BA.debugLine="Dim TextWidthBNo As Int = MeasurementCanvas.Meas";
Debug.JustUpdateDeviceLine();
_textwidthbno = BA.numberCast(int.class, __ref.getField(false,"_measurementcanvas" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(__ref.getField(true,"_mtextobotonnegative" /*RemoteObject*/ )),(Object)(_fnt)).runMethod(true,"getWidth"));Debug.locals.put("TextWidthBNo", _textwidthbno);Debug.locals.put("TextWidthBNo", _textwidthbno);
 BA.debugLineNum = 775;BA.debugLine="bNegative.Width=AnchoBotonesDialog";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setWidth",_anchobotonesdialog);
 BA.debugLineNum = 776;BA.debugLine="Select Case NumeroBotonesDialog";
Debug.JustUpdateDeviceLine();
if (true) break;

case 52:
//select
this.state = 65;
switch (BA.switchObjectToInt(_numerobotonesdialog,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
this.state = 54;
if (true) break;
}
case 1: {
this.state = 56;
if (true) break;
}
case 2: {
this.state = 64;
if (true) break;
}
}
if (true) break;

case 54:
//C
this.state = 65;
 BA.debugLineNum = 778;BA.debugLine="bNegative.Left=(Dialog.Base.Width-AnchoBotones";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth"),_anchobotonesdialog}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 780;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 57:
//if
this.state = 62;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mtextobotonpositive" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 781;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 783;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco}, "++",2, 0));
 if (true) break;

case 62:
//C
this.state = 65;
;
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 786;BA.debugLine="bNegative.Left=wHueco+AnchoBotonesDialog+wHuec";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_whueco,_anchobotonesdialog,_whueco,_anchobotonesdialog,_whueco}, "++++",4, 0));
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 789;BA.debugLine="bNegative.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
_bnegative.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 790;BA.debugLine="bNegative.Top=Dialog.Base.Height-Dialog.ButtonsH";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(true,"_buttonsheight" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "--",2, 0));
 BA.debugLineNum = 791;BA.debugLine="bNegative.Color=mColorFondoBotonNegative";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setColor",__ref.getField(true,"_mcolorfondobotonnegative" /*RemoteObject*/ ));
 BA.debugLineNum = 792;BA.debugLine="bNegative.TextColor=mColorTextoBotonNegative";
Debug.JustUpdateDeviceLine();
_bnegative.runMethod(true,"setTextColor",__ref.getField(true,"_mcolortextobotonnegative" /*RemoteObject*/ ));
 if (true) break;

case 66:
//C
this.state = -1;
;
 BA.debugLineNum = 838;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jammsgdialog", "mostraraviso"), _rsub);
this.state = 70;
return;
case 70:
//C
this.state = -1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 840;BA.debugLine="Return rInt";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_rint));return;};
 BA.debugLineNum = 841;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("mPanelTitulo_Touch (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,967);
if (RapidSub.canDelegate("mpaneltitulo_touch")) { return __ref.runUserSub(false, "jammsgdialog","mpaneltitulo_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 967;BA.debugLine="Private Sub mPanelTitulo_Touch(Action As Int, X As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 969;BA.debugLine="If mMovible Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mmovible" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 971;BA.debugLine="If Action = Dialog.TitleBar.TOUCH_ACTION_DOWN Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 972;BA.debugLine="DownX  = X";
Debug.JustUpdateDeviceLine();
__ref.setField ("_downx" /*RemoteObject*/ ,BA.numberCast(double.class, _x));
 BA.debugLineNum = 973;BA.debugLine="DownY  = y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_downy" /*RemoteObject*/ ,BA.numberCast(double.class, _y));
 }else 
{ BA.debugLineNum = 974;BA.debugLine="Else if Action = Dialog.TitleBar.TOUCH_ACTION_MO";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_titlebar" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE")))) { 
 BA.debugLineNum = 975;BA.debugLine="Dialog.Base.Top = Min(Max(Dialog.Base.Top + y -";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setTop",jammsgdialog.__c.runMethod(true,"Min",(Object)(jammsgdialog.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getTop"),_y,__ref.getField(true,"_downy" /*RemoteObject*/ )}, "+-",2, 0)),(Object)(BA.numberCast(double.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 0))));
 BA.debugLineNum = 976;BA.debugLine="Dialog.Base.Left = Min(Max(Dialog.Base.Left + x";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"setLeft",jammsgdialog.__c.runMethod(true,"Min",(Object)(jammsgdialog.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getLeft"),_x,__ref.getField(true,"_downx" /*RemoteObject*/ )}, "+-",2, 0)),(Object)(BA.numberCast(double.class, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_dialog" /*RemoteObject*/ ).getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 0))));
 }}
;
 };
 BA.debugLineNum = 979;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalineacionhorizontalmsg(RemoteObject __ref,RemoteObject _alineacionhorizontal) throws Exception{
try {
		Debug.PushSubsStack("setAlineacionHorizontalMsg (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,404);
if (RapidSub.canDelegate("setalineacionhorizontalmsg")) { return __ref.runUserSub(false, "jammsgdialog","setalineacionhorizontalmsg", __ref, _alineacionhorizontal);}
Debug.locals.put("AlineacionHorizontal", _alineacionhorizontal);
 BA.debugLineNum = 404;BA.debugLine="Sub setAlineacionHorizontalMsg(AlineacionHorizonta";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 405;BA.debugLine="mAlineacionHorizontalMsg=AlineacionHorizontal";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionhorizontalmsg" /*RemoteObject*/ ,_alineacionhorizontal);
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalineacionverticalmsg(RemoteObject __ref,RemoteObject _alineacionvertical) throws Exception{
try {
		Debug.PushSubsStack("setAlineacionVerticalMsg (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,396);
if (RapidSub.canDelegate("setalineacionverticalmsg")) { return __ref.runUserSub(false, "jammsgdialog","setalineacionverticalmsg", __ref, _alineacionvertical);}
Debug.locals.put("AlineacionVertical", _alineacionvertical);
 BA.debugLineNum = 396;BA.debugLine="Sub setAlineacionVerticalMsg(AlineacionVertical As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 397;BA.debugLine="mAlineacionVerticalMsg=AlineacionVertical";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionverticalmsg" /*RemoteObject*/ ,_alineacionvertical);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setAltoBotonesDialogo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("setaltobotonesdialogo")) { return __ref.runUserSub(false, "jammsgdialog","setaltobotonesdialogo", __ref, _altobotonesdialogo);}
Debug.locals.put("AltoBotonesDialogo", _altobotonesdialogo);
 BA.debugLineNum = 408;BA.debugLine="Sub setAltoBotonesDialogo(AltoBotonesDialogo As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="mAltoBotonesDialogo=AltoBotonesDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltobotonesdialogo" /*RemoteObject*/ ,_altobotonesdialogo);
 BA.debugLineNum = 410;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setAltoDialogo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("setaltodialogo")) { return __ref.runUserSub(false, "jammsgdialog","setaltodialogo", __ref, _altodlg);}
Debug.locals.put("AltoDlg", _altodlg);
 BA.debugLineNum = 342;BA.debugLine="Sub setAltoDialogo(AltoDlg As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 343;BA.debugLine="mAltoDialogo=Min(AltoDlg, 0.9*mBaseDialogo.Height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltodialogo" /*RemoteObject*/ ,BA.numberCast(int.class, jammsgdialog.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _altodlg)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.9),__ref.getField(false,"_mbasedialogo" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "*",0, 0)))));
 BA.debugLineNum = 344;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setAltoTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("setaltotitulo")) { return __ref.runUserSub(false, "jammsgdialog","setaltotitulo", __ref, _altotitulo);}
Debug.locals.put("AltoTitulo", _altotitulo);
 BA.debugLineNum = 350;BA.debugLine="Sub setAltoTitulo(AltoTitulo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 351;BA.debugLine="mAltoTitulo=AltoTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_maltotitulo" /*RemoteObject*/ ,_altotitulo);
 BA.debugLineNum = 352;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setAnchoBordeDialogo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,468);
if (RapidSub.canDelegate("setanchobordedialogo")) { return __ref.runUserSub(false, "jammsgdialog","setanchobordedialogo", __ref, _anchobordedialogo);}
Debug.locals.put("AnchoBordeDialogo", _anchobordedialogo);
 BA.debugLineNum = 468;BA.debugLine="Sub setAnchoBordeDialogo(AnchoBordeDialogo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 469;BA.debugLine="mAnchoBordeDialogo=AnchoBordeDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchobordedialogo" /*RemoteObject*/ ,_anchobordedialogo);
 BA.debugLineNum = 470;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setAnchoDialogo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("setanchodialogo")) { return __ref.runUserSub(false, "jammsgdialog","setanchodialogo", __ref, _anchodlg);}
Debug.locals.put("AnchoDlg", _anchodlg);
 BA.debugLineNum = 338;BA.debugLine="Sub setAnchoDialogo(AnchoDlg As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 339;BA.debugLine="mAnchoDialogo=AnchoDlg";
Debug.JustUpdateDeviceLine();
__ref.setField ("_manchodialogo" /*RemoteObject*/ ,_anchodlg);
 BA.debugLineNum = 340;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorFondoBotonCancel (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("setcolorfondobotoncancel")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondobotoncancel", __ref, _colorbotoncancel);}
Debug.locals.put("ColorBotonCancel", _colorbotoncancel);
 BA.debugLineNum = 428;BA.debugLine="Sub setColorFondoBotonCancel(ColorBotonCancel As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 429;BA.debugLine="mColorFondoBotonCancel=ColorBotonCancel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotoncancel" /*RemoteObject*/ ,_colorbotoncancel);
 BA.debugLineNum = 430;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorFondoBotonNegative (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("setcolorfondobotonnegative")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondobotonnegative", __ref, _colorbotonnegative);}
Debug.locals.put("ColorBotonNegative", _colorbotonnegative);
 BA.debugLineNum = 440;BA.debugLine="Sub setColorFondoBotonNegative(ColorBotonNegative";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 441;BA.debugLine="mColorFondoBotonNegative=ColorBotonNegative";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonnegative" /*RemoteObject*/ ,_colorbotonnegative);
 BA.debugLineNum = 442;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorFondoBotonPositive (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("setcolorfondobotonpositive")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondobotonpositive", __ref, _colorbotonpositive);}
Debug.locals.put("ColorBotonPositive", _colorbotonpositive);
 BA.debugLineNum = 416;BA.debugLine="Sub setColorFondoBotonPositive(ColorBotonPositive";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 417;BA.debugLine="mColorFondoBotonPositive=ColorBotonPositive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonpositive" /*RemoteObject*/ ,_colorbotonpositive);
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondodialogo(RemoteObject __ref,RemoteObject _colorbackground) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoDialogo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("setcolorfondodialogo")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondodialogo", __ref, _colorbackground);}
Debug.locals.put("ColorBackground", _colorbackground);
 BA.debugLineNum = 329;BA.debugLine="Sub setColorFondoDialogo(ColorBackground As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="mColorFondoDialogo=ColorBackground";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondodialogo" /*RemoteObject*/ ,_colorbackground);
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondomensaje(RemoteObject __ref,RemoteObject _colorfondomensaje) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("setcolorfondomensaje")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondomensaje", __ref, _colorfondomensaje);}
Debug.locals.put("ColorFondoMensaje", _colorfondomensaje);
 BA.debugLineNum = 376;BA.debugLine="Sub setColorFondoMensaje(ColorFondoMensaje As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 377;BA.debugLine="mColorFondoMensaje=ColorFondoMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondomensaje" /*RemoteObject*/ ,_colorfondomensaje);
 BA.debugLineNum = 378;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorFondoTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,368);
if (RapidSub.canDelegate("setcolorfondotitulo")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondotitulo", __ref, _colorfondotitulo);}
Debug.locals.put("ColorFondoTitulo", _colorfondotitulo);
 BA.debugLineNum = 368;BA.debugLine="Sub setColorFondoTitulo(ColorFondoTitulo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 369;BA.debugLine="mColorFondoTitulo=ColorFondoTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondotitulo" /*RemoteObject*/ ,_colorfondotitulo);
 BA.debugLineNum = 370;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorFondoTodosBotones (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("setcolorfondotodosbotones")) { return __ref.runUserSub(false, "jammsgdialog","setcolorfondotodosbotones", __ref, _colorfondotodosbotones);}
Debug.locals.put("ColorFondoTodosBotones", _colorfondotodosbotones);
 BA.debugLineNum = 448;BA.debugLine="Sub setColorFondoTodosBotones(ColorFondoTodosBoton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 449;BA.debugLine="mColorFondoBotonPositive=ColorFondoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonpositive" /*RemoteObject*/ ,_colorfondotodosbotones);
 BA.debugLineNum = 450;BA.debugLine="mColorFondoBotonCancel=ColorFondoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotoncancel" /*RemoteObject*/ ,_colorfondotodosbotones);
 BA.debugLineNum = 451;BA.debugLine="mColorFondoBotonNegative=ColorFondoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondobotonnegative" /*RemoteObject*/ ,_colorfondotodosbotones);
 BA.debugLineNum = 452;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorOverlay (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("setcoloroverlay")) { return __ref.runUserSub(false, "jammsgdialog","setcoloroverlay", __ref, _coloroverlay);}
Debug.locals.put("ColorOverlay", _coloroverlay);
 BA.debugLineNum = 323;BA.debugLine="Sub setColorOverlay(ColorOverlay As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 324;BA.debugLine="mColorOverlay=ColorOverlay";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcoloroverlay" /*RemoteObject*/ ,_coloroverlay);
 BA.debugLineNum = 325;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorTextoBotonCancel (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,432);
if (RapidSub.canDelegate("setcolortextobotoncancel")) { return __ref.runUserSub(false, "jammsgdialog","setcolortextobotoncancel", __ref, _colorbotoncancel);}
Debug.locals.put("ColorBotonCancel", _colorbotoncancel);
 BA.debugLineNum = 432;BA.debugLine="Sub setColorTextoBotonCancel(ColorBotonCancel As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 433;BA.debugLine="mColorTextoBotonCancel=ColorBotonCancel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,_colorbotoncancel);
 BA.debugLineNum = 434;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorTextoBotonNegative (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("setcolortextobotonnegative")) { return __ref.runUserSub(false, "jammsgdialog","setcolortextobotonnegative", __ref, _colorbotonnegative);}
Debug.locals.put("ColorBotonNegative", _colorbotonnegative);
 BA.debugLineNum = 444;BA.debugLine="Sub setColorTextoBotonNegative(ColorBotonNegative";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 445;BA.debugLine="mColorTextoBotonNegative=ColorBotonNegative";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,_colorbotonnegative);
 BA.debugLineNum = 446;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorTextoBotonPositive (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("setcolortextobotonpositive")) { return __ref.runUserSub(false, "jammsgdialog","setcolortextobotonpositive", __ref, _colorbotonpositive);}
Debug.locals.put("ColorBotonPositive", _colorbotonpositive);
 BA.debugLineNum = 420;BA.debugLine="Sub setColorTextoBotonPositive(ColorBotonPositive";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 421;BA.debugLine="mColorTextoBotonPositive=ColorBotonPositive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,_colorbotonpositive);
 BA.debugLineNum = 422;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorTextoMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("setcolortextomensaje")) { return __ref.runUserSub(false, "jammsgdialog","setcolortextomensaje", __ref, _colortextomensaje);}
Debug.locals.put("ColorTextoMensaje", _colortextomensaje);
 BA.debugLineNum = 380;BA.debugLine="Sub setColorTextoMensaje(ColorTextoMensaje As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 381;BA.debugLine="mColorTextoMensaje=ColorTextoMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextomensaje" /*RemoteObject*/ ,_colortextomensaje);
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolortextotitulo(RemoteObject __ref,RemoteObject _colortextotitulo) throws Exception{
try {
		Debug.PushSubsStack("setColorTextoTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("setcolortextotitulo")) { return __ref.runUserSub(false, "jammsgdialog","setcolortextotitulo", __ref, _colortextotitulo);}
Debug.locals.put("ColorTextoTitulo", _colortextotitulo);
 BA.debugLineNum = 364;BA.debugLine="Sub setColorTextoTitulo(ColorTextoTitulo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="mColorTextoTitulo=ColorTextoTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextotitulo" /*RemoteObject*/ ,_colortextotitulo);
 BA.debugLineNum = 366;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setColorTextoTodosBotones (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("setcolortextotodosbotones")) { return __ref.runUserSub(false, "jammsgdialog","setcolortextotodosbotones", __ref, _colortextotodosbotones);}
Debug.locals.put("ColorTextoTodosBotones", _colortextotodosbotones);
 BA.debugLineNum = 454;BA.debugLine="Sub setColorTextoTodosBotones(ColorTextoTodosBoton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 455;BA.debugLine="mColorTextoBotonPositive=ColorTextoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,_colortextotodosbotones);
 BA.debugLineNum = 456;BA.debugLine="mColorTextoBotonCancel=ColorTextoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,_colortextotodosbotones);
 BA.debugLineNum = 457;BA.debugLine="mColorTextoBotonNegative=ColorTextoTodosBotones";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,_colortextotodosbotones);
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfuentelabelmensaje(RemoteObject __ref,RemoteObject _xfont) throws Exception{
try {
		Debug.PushSubsStack("setFuenteLabelMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("setfuentelabelmensaje")) { return __ref.runUserSub(false, "jammsgdialog","setfuentelabelmensaje", __ref, _xfont);}
Debug.locals.put("xFont", _xfont);
 BA.debugLineNum = 309;BA.debugLine="Sub setFuenteLabelMensaje(xFont As B4XFont)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="mFuenteTextoMensaje=xFont";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfuentetextomensaje" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfuentetextotitulo(RemoteObject __ref,RemoteObject _xfont) throws Exception{
try {
		Debug.PushSubsStack("setFuenteTextoTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("setfuentetextotitulo")) { return __ref.runUserSub(false, "jammsgdialog","setfuentetextotitulo", __ref, _xfont);}
Debug.locals.put("xFont", _xfont);
 BA.debugLineNum = 354;BA.debugLine="Sub setFuenteTextoTitulo(xFont As B4XFont)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 357;BA.debugLine="mFuenteTextoTitulo=xFont";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfuentetextotitulo" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 358;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setMovible (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("setmovible")) { return __ref.runUserSub(false, "jammsgdialog","setmovible", __ref, _movible);}
Debug.locals.put("Movible", _movible);
 BA.debugLineNum = 242;BA.debugLine="Sub setMovible(Movible As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="mMovible=Movible";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmovible" /*RemoteObject*/ ,_movible);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setNombreFicheroIconoBarraTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("setnombreficheroiconobarratitulo")) { return __ref.runUserSub(false, "jammsgdialog","setnombreficheroiconobarratitulo", __ref, _nombreficheroicono);}
Debug.locals.put("NombreFicheroIcono", _nombreficheroicono);
 BA.debugLineNum = 464;BA.debugLine="Sub setNombreFicheroIconoBarraTitulo(NombreFichero";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="mNombreFicheroIconoTitulo=NombreFicheroIcono";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mnombreficheroiconotitulo" /*RemoteObject*/ ,_nombreficheroicono);
 BA.debugLineNum = 466;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTamanoFuenteTextoMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("settamanofuentetextomensaje")) { return __ref.runUserSub(false, "jammsgdialog","settamanofuentetextomensaje", __ref, _tamanofuentetextomensaje);}
Debug.locals.put("TamanoFuenteTextoMensaje", _tamanofuentetextomensaje);
 BA.debugLineNum = 388;BA.debugLine="Sub setTamanoFuenteTextoMensaje(TamanoFuenteTextoM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 389;BA.debugLine="mTamanoFuenteTextoMensaje=TamanoFuenteTextoMensaj";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetextomensaje" /*RemoteObject*/ ,_tamanofuentetextomensaje);
 BA.debugLineNum = 390;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTamanoFuenteTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("settamanofuentetitulo")) { return __ref.runUserSub(false, "jammsgdialog","settamanofuentetitulo", __ref, _tamanofuentetitulo);}
Debug.locals.put("TamanoFuenteTitulo", _tamanofuentetitulo);
 BA.debugLineNum = 360;BA.debugLine="Sub setTamanoFuenteTitulo(TamanoFuenteTitulo As Fl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="mTamanoFuenteTitulo=TamanoFuenteTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentetitulo" /*RemoteObject*/ ,_tamanofuentetitulo);
 BA.debugLineNum = 362;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTamanoTextoTodosBotones (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,460);
if (RapidSub.canDelegate("settamanotextotodosbotones")) { return __ref.runUserSub(false, "jammsgdialog","settamanotextotodosbotones", __ref, _tamanotextotodosbotones);}
Debug.locals.put("TamanoTextoTodosBotones", _tamanotextotodosbotones);
 BA.debugLineNum = 460;BA.debugLine="Sub setTamanoTextoTodosBotones(TamanoTextoTodosBot";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 461;BA.debugLine="mTamanoFuenteBotonesDialogo=TamanoTextoTodosBoton";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentebotonesdialogo" /*RemoteObject*/ ,_tamanotextotodosbotones);
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settemaclaro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTemaClaro (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("settemaclaro")) { return __ref.runUserSub(false, "jammsgdialog","settemaclaro", __ref);}
 BA.debugLineNum = 209;BA.debugLine="public Sub SetTemaClaro";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="mColorFondoDialogo=0xFFDCDCDC   ' gainsboro";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondodialogo" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffdcdcdc)));
 BA.debugLineNum = 211;BA.debugLine="mColorBordeDialogo=xui.Color_Gray";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorbordedialogo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 213;BA.debugLine="mColorFondoTitulo=0xFFB22222  ' firebrick";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondotitulo" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xffb22222)));
 BA.debugLineNum = 214;BA.debugLine="mColorTextoTitulo=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextotitulo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 216;BA.debugLine="mColorTextoBotonPositive=xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 217;BA.debugLine="mColorTextoBotonCancel=xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 218;BA.debugLine="mColorTextoBotonNegative=xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 220;BA.debugLine="mColorTextoMensaje=xui.Color_Black";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextomensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 221;BA.debugLine="mColorFondoMensaje=mColorFondoDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondomensaje" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondodialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settemaoscuro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTemaOscuro (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("settemaoscuro")) { return __ref.runUserSub(false, "jammsgdialog","settemaoscuro", __ref);}
 BA.debugLineNum = 226;BA.debugLine="Public Sub SetTemaOscuro";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 228;BA.debugLine="mColorFondoDialogo=0xFF646464";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondodialogo" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff646464)));
 BA.debugLineNum = 229;BA.debugLine="mColorBordeDialogo=xui.Color_Gray";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorbordedialogo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Gray"));
 BA.debugLineNum = 231;BA.debugLine="mColorFondoTitulo=0xFF0083B8  ' azul título dialo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondotitulo" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff0083b8)));
 BA.debugLineNum = 232;BA.debugLine="mColorTextoTitulo=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextotitulo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 234;BA.debugLine="mColorTextoBotonPositive=0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonpositive" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 235;BA.debugLine="mColorTextoBotonCancel=0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotoncancel" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 236;BA.debugLine="mColorTextoBotonNegative=0xFF89D5FF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextobotonnegative" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff89d5ff)));
 BA.debugLineNum = 238;BA.debugLine="mColorTextoMensaje=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolortextomensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 239;BA.debugLine="mColorFondoMensaje=mColorFondoDialogo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondomensaje" /*RemoteObject*/ ,__ref.getField(true,"_mcolorfondodialogo" /*RemoteObject*/ ));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTextoBotonCancel (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,424);
if (RapidSub.canDelegate("settextobotoncancel")) { return __ref.runUserSub(false, "jammsgdialog","settextobotoncancel", __ref, _textobotoncancel);}
Debug.locals.put("TextoBotonCancel", _textobotoncancel);
 BA.debugLineNum = 424;BA.debugLine="Sub setTextoBotonCancel(TextoBotonCancel As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 425;BA.debugLine="mTextoBotonCancel=TextoBotonCancel";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotoncancel" /*RemoteObject*/ ,_textobotoncancel);
 BA.debugLineNum = 426;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTextoBotonNegative (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("settextobotonnegative")) { return __ref.runUserSub(false, "jammsgdialog","settextobotonnegative", __ref, _textobotonnegative);}
Debug.locals.put("TextoBotonNegative", _textobotonnegative);
 BA.debugLineNum = 436;BA.debugLine="Sub setTextoBotonNegative(TextoBotonNegative As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 437;BA.debugLine="mTextoBotonNegative=TextoBotonNegative";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonnegative" /*RemoteObject*/ ,_textobotonnegative);
 BA.debugLineNum = 438;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTextoBotonPositive (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,412);
if (RapidSub.canDelegate("settextobotonpositive")) { return __ref.runUserSub(false, "jammsgdialog","settextobotonpositive", __ref, _textobotonpositive);}
Debug.locals.put("TextoBotonPositive", _textobotonpositive);
 BA.debugLineNum = 412;BA.debugLine="Sub setTextoBotonPositive(TextoBotonPositive As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 413;BA.debugLine="mTextoBotonPositive=TextoBotonPositive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextobotonpositive" /*RemoteObject*/ ,_textobotonpositive);
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextomensaje(RemoteObject __ref,RemoteObject _textomensaje) throws Exception{
try {
		Debug.PushSubsStack("setTextoMensaje (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,372);
if (RapidSub.canDelegate("settextomensaje")) { return __ref.runUserSub(false, "jammsgdialog","settextomensaje", __ref, _textomensaje);}
Debug.locals.put("TextoMensaje", _textomensaje);
 BA.debugLineNum = 372;BA.debugLine="Sub setTextoMensaje(TextoMensaje As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 373;BA.debugLine="mTextoMensaje=TextoMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextomensaje" /*RemoteObject*/ ,_textomensaje);
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextotitulo(RemoteObject __ref,RemoteObject _textotitulo) throws Exception{
try {
		Debug.PushSubsStack("setTextoTitulo (jammsgdialog) ","jammsgdialog",81,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("settextotitulo")) { return __ref.runUserSub(false, "jammsgdialog","settextotitulo", __ref, _textotitulo);}
Debug.locals.put("TextoTitulo", _textotitulo);
 BA.debugLineNum = 346;BA.debugLine="Sub setTextoTitulo(TextoTitulo As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 347;BA.debugLine="mTextoTitulo=TextoTitulo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextotitulo" /*RemoteObject*/ ,_textotitulo);
 BA.debugLineNum = 348;BA.debugLine="End Sub";
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