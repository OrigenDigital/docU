package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jamloadingindicator_subs_0 {


public static RemoteObject  _actualizarmensajeloading(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarMensajeLoading (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("actualizarmensajeloading")) { return __ref.runUserSub(false, "jamloadingindicator","actualizarmensajeloading", __ref);}
RemoteObject _alturaespaciobajoloadingindicator = RemoteObject.createImmutable(0);
RemoteObject _hlabelmensaje = RemoteObject.createImmutable(0);
RemoteObject _lblmensaje = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _pnlleft = RemoteObject.createImmutable(0);
RemoteObject _pnltop = RemoteObject.createImmutable(0);
RemoteObject _pnlwidth = RemoteObject.createImmutable(0);
RemoteObject _pnlheight = RemoteObject.createImmutable(0);
 BA.debugLineNum = 253;BA.debugLine="Private Sub ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="If mLabelMensaje.IsInitialized=False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),jamloadingindicator.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 255;BA.debugLine="mLabelMensaje.Text=mMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_mmensajeloading" /*RemoteObject*/ )));
 BA.debugLineNum = 256;BA.debugLine="mLabelMensaje.TextSize=mTamanoFuenteMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentemensaje" /*RemoteObject*/ )));
 BA.debugLineNum = 257;BA.debugLine="mLabelMensaje.TextColor=mColorMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_mcolormensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 258;BA.debugLine="mLabelMensaje.Left=Max(0,(Background.Width-mAncho";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setLeft",jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 259;BA.debugLine="mLabelMensaje.Width=mAnchoLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )));
 BA.debugLineNum = 261;BA.debugLine="mBaseLoadingIndicator.SetLayoutAnimated(0,Max(0,(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)))),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ))));
 BA.debugLineNum = 263;BA.debugLine="Dim AlturaEspacioBajoLoadingIndicator As Int=Back";
Debug.JustUpdateDeviceLine();
_alturaespaciobajoloadingindicator = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0))}, "-",1, 0));Debug.locals.put("AlturaEspacioBajoLoadingIndicator", _alturaespaciobajoloadingindicator);Debug.locals.put("AlturaEspacioBajoLoadingIndicator", _alturaespaciobajoloadingindicator);
 BA.debugLineNum = 264;BA.debugLine="Dim hLabelMensaje As Double";
Debug.JustUpdateDeviceLine();
_hlabelmensaje = RemoteObject.createImmutable(0);Debug.locals.put("hLabelMensaje", _hlabelmensaje);
 BA.debugLineNum = 269;BA.debugLine="hLabelMensaje=Min(MedirAlturaTextoMultilinea(mLab";
Debug.JustUpdateDeviceLine();
_hlabelmensaje = jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_mediralturatextomultilinea" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(false,"getFont")),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ ))),(Object)(BA.ObjectToString(__ref.getField(false,"_mmensajeloading" /*RemoteObject*/ ))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_alturaespaciobajoloadingindicator,jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))));Debug.locals.put("hLabelMensaje", _hlabelmensaje);
 BA.debugLineNum = 271;BA.debugLine="mLabelMensaje.Height=hLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setHeight",_hlabelmensaje);
 BA.debugLineNum = 278;BA.debugLine="Dim lblMensaje As Label=mLabelMensaje";
Debug.JustUpdateDeviceLine();
_lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblmensaje = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).getObject());Debug.locals.put("lblMensaje", _lblmensaje);Debug.locals.put("lblMensaje", _lblmensaje);
 BA.debugLineNum = 279;BA.debugLine="Dim jo As JavaObject = lblMensaje";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _lblmensaje.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 280;BA.debugLine="jo.RunMethod(\"setTextAlignment\", Array(mAlineacio";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTextAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_malineacionhorizontalmensaje" /*RemoteObject*/ ))})));
 BA.debugLineNum = 284;BA.debugLine="mLabelMensaje.SetLayoutAnimated(0,Max(0,(Backgrou";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ ))),(Object)(_hlabelmensaje));
 BA.debugLineNum = 285;BA.debugLine="mLabelControlTiempoProceso.SetLayoutAnimated(0,Ma";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ ))),(Object)(_hlabelmensaje));
 BA.debugLineNum = 287;BA.debugLine="If mPanelFondoLoadingIndicatorCanvasMensaje.IsIni";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),jamloadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 288;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje=xui.Cre";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 289;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 };
 BA.debugLineNum = 291;BA.debugLine="Dim PnlLeft As Double=Min(mBaseLoadingIndicator.L";
Debug.JustUpdateDeviceLine();
_pnlleft = RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getLeft"))))),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0);Debug.locals.put("PnlLeft", _pnlleft);Debug.locals.put("PnlLeft", _pnlleft);
 BA.debugLineNum = 292;BA.debugLine="Dim PnlTop As Double=Min(mBaseLoadingIndicator.To";
Debug.JustUpdateDeviceLine();
_pnltop = RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getTop"))))),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0);Debug.locals.put("PnlTop", _pnltop);Debug.locals.put("PnlTop", _pnltop);
 BA.debugLineNum = 293;BA.debugLine="Dim PnlWidth As Double=Max(mBaseLoadingIndicator.";
Debug.JustUpdateDeviceLine();
_pnlwidth = RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Max",(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getWidth"))))),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0);Debug.locals.put("PnlWidth", _pnlwidth);Debug.locals.put("PnlWidth", _pnlwidth);
 BA.debugLineNum = 294;BA.debugLine="Dim PnlHeight As Double=mBaseLoadingIndicator.Hei";
Debug.JustUpdateDeviceLine();
_pnlheight = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "+++",3, 0);Debug.locals.put("PnlHeight", _pnlheight);Debug.locals.put("PnlHeight", _pnlheight);
 BA.debugLineNum = 295;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetLayou";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_pnlleft),(Object)(_pnltop),(Object)(_pnlwidth),(Object)(_pnlheight));
 BA.debugLineNum = 296;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.Color=mC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 298;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SendToBa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("SendToBack");
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _background_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Background_MouseClicked (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("background_mouseclicked")) { return __ref.runUserSub(false, "jamloadingindicator","background_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 442;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 443;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 444;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
jamloadingindicator._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",jamloadingindicator._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Private mParent As B4XView";
jamloadingindicator._mparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mparent",jamloadingindicator._mparent);
 //BA.debugLineNum = 6;BA.debugLine="Private mBaseLoadingIndicator As B4XView";
jamloadingindicator._mbaseloadingindicator = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbaseloadingindicator",jamloadingindicator._mbaseloadingindicator);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
jamloadingindicator._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",jamloadingindicator._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private index As Int";
jamloadingindicator._index = RemoteObject.createImmutable(0);__ref.setField("_index",jamloadingindicator._index);
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
jamloadingindicator._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",jamloadingindicator._cvs);
 //BA.debugLineNum = 11;BA.debugLine="Private mAnchoLoadingIndicator As Int";
jamloadingindicator._mancholoadingindicator = RemoteObject.createImmutable(0);__ref.setField("_mancholoadingindicator",jamloadingindicator._mancholoadingindicator);
 //BA.debugLineNum = 13;BA.debugLine="Private mDrawingSubName As String";
jamloadingindicator._mdrawingsubname = RemoteObject.createImmutable("");__ref.setField("_mdrawingsubname",jamloadingindicator._mdrawingsubname);
 //BA.debugLineNum = 15;BA.debugLine="Private Background As B4XView  ' panel para imped";
jamloadingindicator._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_background",jamloadingindicator._background);
 //BA.debugLineNum = 16;BA.debugLine="Private mColorPanelFondo As Int";
jamloadingindicator._mcolorpanelfondo = RemoteObject.createImmutable(0);__ref.setField("_mcolorpanelfondo",jamloadingindicator._mcolorpanelfondo);
 //BA.debugLineNum = 17;BA.debugLine="Private mEstilo As String";
jamloadingindicator._mestilo = RemoteObject.createImmutable("");__ref.setField("_mestilo",jamloadingindicator._mestilo);
 //BA.debugLineNum = 18;BA.debugLine="Private mColorIndicator As Int";
jamloadingindicator._mcolorindicator = RemoteObject.createImmutable(0);__ref.setField("_mcolorindicator",jamloadingindicator._mcolorindicator);
 //BA.debugLineNum = 19;BA.debugLine="Private mDuracionCiclo As Int";
jamloadingindicator._mduracionciclo = RemoteObject.createImmutable(0);__ref.setField("_mduracionciclo",jamloadingindicator._mduracionciclo);
 //BA.debugLineNum = 21;BA.debugLine="Public mPanelFondoLoadingIndicatorCanvasMensaje A";
jamloadingindicator._mpanelfondoloadingindicatorcanvasmensaje = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpanelfondoloadingindicatorcanvasmensaje",jamloadingindicator._mpanelfondoloadingindicatorcanvasmensaje);
 //BA.debugLineNum = 22;BA.debugLine="Public mColorPanelFondoLoadingIndicatorCanvasMens";
jamloadingindicator._mcolorpanelfondoloadingindicatorcanvasmensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolorpanelfondoloadingindicatorcanvasmensaje",jamloadingindicator._mcolorpanelfondoloadingindicatorcanvasmensaje);
 //BA.debugLineNum = 23;BA.debugLine="Public mLabelMensaje As B4XView";
jamloadingindicator._mlabelmensaje = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlabelmensaje",jamloadingindicator._mlabelmensaje);
 //BA.debugLineNum = 24;BA.debugLine="Private mMensajeLoading As Object";
jamloadingindicator._mmensajeloading = RemoteObject.createNew ("Object");__ref.setField("_mmensajeloading",jamloadingindicator._mmensajeloading);
 //BA.debugLineNum = 25;BA.debugLine="Private mTamanoFuenteMensaje As Float";
jamloadingindicator._mtamanofuentemensaje = RemoteObject.createImmutable(0f);__ref.setField("_mtamanofuentemensaje",jamloadingindicator._mtamanofuentemensaje);
 //BA.debugLineNum = 26;BA.debugLine="Private mColorFondoLabelMensaje As Int";
jamloadingindicator._mcolorfondolabelmensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolorfondolabelmensaje",jamloadingindicator._mcolorfondolabelmensaje);
 //BA.debugLineNum = 27;BA.debugLine="Private mColorMensaje As Int";
jamloadingindicator._mcolormensaje = RemoteObject.createImmutable(0);__ref.setField("_mcolormensaje",jamloadingindicator._mcolormensaje);
 //BA.debugLineNum = 28;BA.debugLine="Private mAnchoLabelMensaje As Int";
jamloadingindicator._mancholabelmensaje = RemoteObject.createImmutable(0);__ref.setField("_mancholabelmensaje",jamloadingindicator._mancholabelmensaje);
 //BA.debugLineNum = 29;BA.debugLine="Private mAlineacionHorizontalMensaje As String";
jamloadingindicator._malineacionhorizontalmensaje = RemoteObject.createImmutable("");__ref.setField("_malineacionhorizontalmensaje",jamloadingindicator._malineacionhorizontalmensaje);
 //BA.debugLineNum = 31;BA.debugLine="Private mLabelControlTiempoProceso As B4XView";
jamloadingindicator._mlabelcontroltiempoproceso = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mlabelcontroltiempoproceso",jamloadingindicator._mlabelcontroltiempoproceso);
 //BA.debugLineNum = 33;BA.debugLine="Private mlstEstilos As List";
jamloadingindicator._mlstestilos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mlstestilos",jamloadingindicator._mlstestilos);
 //BA.debugLineNum = 36;BA.debugLine="Private mMostrarTiempoProceso As Boolean";
jamloadingindicator._mmostrartiempoproceso = RemoteObject.createImmutable(false);__ref.setField("_mmostrartiempoproceso",jamloadingindicator._mmostrartiempoproceso);
 //BA.debugLineNum = 37;BA.debugLine="Private TicksInicioControlTiempoProceso As Long";
jamloadingindicator._ticksiniciocontroltiempoproceso = RemoteObject.createImmutable(0L);__ref.setField("_ticksiniciocontroltiempoproceso",jamloadingindicator._ticksiniciocontroltiempoproceso);
 //BA.debugLineNum = 38;BA.debugLine="Private TimerControlTiempoProceso As Timer";
jamloadingindicator._timercontroltiempoproceso = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timercontroltiempoproceso",jamloadingindicator._timercontroltiempoproceso);
 //BA.debugLineNum = 39;BA.debugLine="Private mIntervaloTimerControlTiempoProceso As In";
jamloadingindicator._mintervalotimercontroltiempoproceso = RemoteObject.createImmutable(0);__ref.setField("_mintervalotimercontroltiempoproceso",jamloadingindicator._mintervalotimercontroltiempoproceso);
 //BA.debugLineNum = 40;BA.debugLine="Private mTextoControlTiempoProceso As String";
jamloadingindicator._mtextocontroltiempoproceso = RemoteObject.createImmutable("");__ref.setField("_mtextocontroltiempoproceso",jamloadingindicator._mtextocontroltiempoproceso);
 //BA.debugLineNum = 42;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
jamloadingindicator._jamloadingindicatorestilo_threecircles1 = BA.ObjectToString("Three Circles 1");__ref.setField("_jamloadingindicatorestilo_threecircles1",jamloadingindicator._jamloadingindicatorestilo_threecircles1);
 //BA.debugLineNum = 43;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
jamloadingindicator._jamloadingindicatorestilo_threecircles1b = BA.ObjectToString("Three Circles 1b");__ref.setField("_jamloadingindicatorestilo_threecircles1b",jamloadingindicator._jamloadingindicatorestilo_threecircles1b);
 //BA.debugLineNum = 44;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
jamloadingindicator._jamloadingindicatorestilo_threecircles2 = BA.ObjectToString("Three Circles 2");__ref.setField("_jamloadingindicatorestilo_threecircles2",jamloadingindicator._jamloadingindicatorestilo_threecircles2);
 //BA.debugLineNum = 45;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
jamloadingindicator._jamloadingindicatorestilo_threecircles3 = BA.ObjectToString("Three Circles 3");__ref.setField("_jamloadingindicatorestilo_threecircles3",jamloadingindicator._jamloadingindicatorestilo_threecircles3);
 //BA.debugLineNum = 46;BA.debugLine="Public Const JamLoadingIndicatorEstilo_SingleCirc";
jamloadingindicator._jamloadingindicatorestilo_singlecircle = BA.ObjectToString("Single Circle");__ref.setField("_jamloadingindicatorestilo_singlecircle",jamloadingindicator._jamloadingindicatorestilo_singlecircle);
 //BA.debugLineNum = 47;BA.debugLine="Public Const JamLoadingIndicatorEstilo_FiveLines1";
jamloadingindicator._jamloadingindicatorestilo_fivelines1 = BA.ObjectToString("Five Lines 1");__ref.setField("_jamloadingindicatorestilo_fivelines1",jamloadingindicator._jamloadingindicatorestilo_fivelines1);
 //BA.debugLineNum = 48;BA.debugLine="Public Const JamLoadingIndicatorEstilo_TenLines A";
jamloadingindicator._jamloadingindicatorestilo_tenlines = BA.ObjectToString("TenLines");__ref.setField("_jamloadingindicatorestilo_tenlines",jamloadingindicator._jamloadingindicatorestilo_tenlines);
 //BA.debugLineNum = 49;BA.debugLine="Public Const JamLoadingIndicatorEstilo_Arc1 As St";
jamloadingindicator._jamloadingindicatorestilo_arc1 = BA.ObjectToString("Arc 1");__ref.setField("_jamloadingindicatorestilo_arc1",jamloadingindicator._jamloadingindicatorestilo_arc1);
 //BA.debugLineNum = 50;BA.debugLine="Public Const JamLoadingIndicatorEstilo_Arc2 As St";
jamloadingindicator._jamloadingindicatorestilo_arc2 = BA.ObjectToString("Arc 2");__ref.setField("_jamloadingindicatorestilo_arc2",jamloadingindicator._jamloadingindicatorestilo_arc2);
 //BA.debugLineNum = 51;BA.debugLine="Public Const JamLoadingIndicatorEstilo_PacMan As";
jamloadingindicator._jamloadingindicatorestilo_pacman = BA.ObjectToString("PacMan");__ref.setField("_jamloadingindicatorestilo_pacman",jamloadingindicator._jamloadingindicatorestilo_pacman);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "jamloadingindicator","close", __ref);}
 BA.debugLineNum = 429;BA.debugLine="Public Sub Close";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 430;BA.debugLine="index = index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 431;BA.debugLine="DetenerControlTiempoProceso";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_detenercontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 432;BA.debugLine="If Background.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 433;BA.debugLine="Background.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setVisible",jamloadingindicator.__c.getField(true,"False"));
 BA.debugLineNum = 434;BA.debugLine="Background.RemoveAllViews";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 436;BA.debugLine="Background.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
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
public static RemoteObject  _detenercontroltiempoproceso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DetenerControlTiempoProceso (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("detenercontroltiempoproceso")) { return __ref.runUserSub(false, "jamloadingindicator","detenercontroltiempoproceso", __ref);}
 BA.debugLineNum = 172;BA.debugLine="public Sub DetenerControlTiempoProceso";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 173;BA.debugLine="If TimerControlTiempoProceso.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 174;BA.debugLine="TimerControlTiempoProceso.Enabled=False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setEnabled",jamloadingindicator.__c.getField(true,"False"));
 };
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_arc1(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Arc1 (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("draw_arc1")) { return __ref.runUserSub(false, "jamloadingindicator","draw_arc1", __ref, _progress);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 505;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 506;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 507;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 508;BA.debugLine="If Progress < 0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_progress,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 509;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(2),RemoteObject.createImmutable(360)}, "**",0, 0))));
 }else {
 BA.debugLineNum = 511;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, -(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_progress}, "-",1, 0)).<Double>get().doubleValue()*(double) (0 + 2)*(double) (0 + 360))));
 };
 BA.debugLineNum = 513;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 514;BA.debugLine="cvs.DrawRect(cvs.TargetRect, mColorIndicator, Tru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 515;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_arc2(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_Arc2 (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,518);
if (RapidSub.canDelegate("draw_arc2")) { return __ref.runUserSub(false, "jamloadingindicator","draw_arc2", __ref, _progress);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 518;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 519;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 520;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 521;BA.debugLine="If Progress < 0.5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_progress,BA.numberCast(double.class, 0.5))) { 
 BA.debugLineNum = 522;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(2),RemoteObject.createImmutable(360)}, "**",0, 0))));
 }else {
 BA.debugLineNum = 524;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(BA.numberCast(float.class, -(double) (0 + 90))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(0.5)}, "-",1, 0)),RemoteObject.createImmutable(2),RemoteObject.createImmutable(360)}, "-**",1, 0))));
 };
 BA.debugLineNum = 526;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 527;BA.debugLine="cvs.DrawRect(cvs.TargetRect, mColorIndicator, Tru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 528;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_fivelines1(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_FiveLines1 (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("draw_fivelines1")) { return __ref.runUserSub(false, "jamloadingindicator","draw_fivelines1", __ref, _progress);}
RemoteObject _minr = RemoteObject.createImmutable(0);
RemoteObject _maxr = RemoteObject.createImmutable(0);
RemoteObject _dx = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 495;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 496;BA.debugLine="Dim MinR As Int = 10dip";
Debug.JustUpdateDeviceLine();
_minr = jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("MinR", _minr);Debug.locals.put("MinR", _minr);
 BA.debugLineNum = 497;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 498;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
Debug.JustUpdateDeviceLine();
_dx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 0)),RemoteObject.createImmutable(5)}, "/",0, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 499;BA.debugLine="For i = 0 To 4";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = 4;
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 500;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_minr,_maxr,RemoteObject.createImmutable(2),_maxr,RemoteObject.createImmutable(2),jamloadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(30),RemoteObject.createImmutable(_i)}, "*-*",1, 0)))}, "+/+/*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 501;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(_i),_dx}, "+*",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(_i),_dx}, "+*",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r}, "+",1, 0))),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 503;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_pacman(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_PacMan (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,531);
if (RapidSub.canDelegate("draw_pacman")) { return __ref.runUserSub(false, "jamloadingindicator","draw_pacman", __ref, _progress);}
RemoteObject _dotr = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _cx = RemoteObject.createImmutable(0);
RemoteObject _cy = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 531;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 532;BA.debugLine="Dim DotR As Int = 5dip";
Debug.JustUpdateDeviceLine();
_dotr = jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("DotR", _dotr);Debug.locals.put("DotR", _dotr);
 BA.debugLineNum = 533;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),_dotr,_progress,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 0))}, "--*",2, 0))),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, _dotr)),(Object)(__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),RemoteObject.createImmutable(200),_progress}, "-*",1, 0))))),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 534;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 535;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
Debug.JustUpdateDeviceLine();
_angle = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(70),jamloadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(180)}, "*",0, 0)))}, "*",0, 0));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 536;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
Debug.JustUpdateDeviceLine();
_cx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("cx", _cx);Debug.locals.put("cx", _cx);
 BA.debugLineNum = 537;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
Debug.JustUpdateDeviceLine();
_cy = BA.numberCast(int.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"));Debug.locals.put("cy", _cy);Debug.locals.put("cy", _cy);
 BA.debugLineNum = 538;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 539;BA.debugLine="If angle = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_angle,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 540;BA.debugLine="cvs.DrawCircle(cx, cy, r, mColorIndicator, True,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, _cx)),(Object)(BA.numberCast(float.class, _cy)),(Object)(BA.numberCast(float.class, _r)),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 542;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeArc",(Object)(BA.numberCast(float.class, _cx)),(Object)(BA.numberCast(float.class, _cy)),(Object)(BA.numberCast(float.class, _r)),(Object)(BA.numberCast(float.class, -(double) (0 + _angle.<Integer>get().intValue())/(double)(double) (0 + 2))),(Object)(BA.numberCast(float.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_angle}, "-",1, 1)).<Integer>get().intValue()))));
 BA.debugLineNum = 543;BA.debugLine="cvs.ClipPath(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClipPath",(Object)(_p));
 BA.debugLineNum = 544;BA.debugLine="cvs.DrawRect(cvs.TargetRect, mColorIndicator, Tr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 545;BA.debugLine="cvs.RemoveClip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("RemoveClip");
 };
 BA.debugLineNum = 548;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_singlecircle(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_SingleCircle (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,485);
if (RapidSub.canDelegate("draw_singlecircle")) { return __ref.runUserSub(false, "jamloadingindicator","draw_singlecircle", __ref, _progress);}
int _i = 0;
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 485;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 486;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = 2;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 487;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_progress}, "*",0, 0))),(Object)(__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_setalpha" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),RemoteObject.createImmutable(255),_progress}, "-*",1, 0))))),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_tenlines(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_TenLines (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,581);
if (RapidSub.canDelegate("draw_tenlines")) { return __ref.runUserSub(false, "jamloadingindicator","draw_tenlines", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(false);
RemoteObject _spess = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 581;BA.debugLine="Private Sub Draw_TenLines (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 582;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 583;BA.debugLine="Dim B As Boolean = False";
Debug.JustUpdateDeviceLine();
_b = jamloadingindicator.__c.getField(true,"False");Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 584;BA.debugLine="Dim Spess As Int = 5dip";
Debug.JustUpdateDeviceLine();
_spess = jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Spess", _spess);Debug.locals.put("Spess", _spess);
 BA.debugLineNum = 586;BA.debugLine="For i=0 To 9";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = 9;
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 588;BA.debugLine="Dim Alpha As Float = i*36";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(36)}, "*",0, 1));Debug.locals.put("Alpha", _alpha);Debug.locals.put("Alpha", _alpha);
 BA.debugLineNum = 590;BA.debugLine="If Alpha>Progress*360 And B=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_alpha,RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)) && RemoteObject.solveBoolean("=",_b,jamloadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 591;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * CosD(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(jamloadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0xaaffffff))))),(Object)(BA.numberCast(float.class, _spess)));
 BA.debugLineNum = 592;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * CosD(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _spess)));
 BA.debugLineNum = 593;BA.debugLine="B=True";
Debug.JustUpdateDeviceLine();
_b = jamloadingindicator.__c.getField(true,"True");Debug.locals.put("B", _b);
 }else {
 BA.debugLineNum = 595;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * CosD(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),(RemoteObject.solve(new RemoteObject[] {_r,RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(jamloadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(BA.numberCast(float.class, _spess)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 599;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_threecircles1(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles1 (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("draw_threecircles1")) { return __ref.runUserSub(false, "jamloadingindicator","draw_threecircles1", __ref, _progress);}
RemoteObject _maxr = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 467;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 469;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))),_maxr,_maxr,jamloadingindicator.__c.runMethod(true,"Sin",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(2),jamloadingindicator.__c.getField(true,"cPI")}, "**",0, 0)))}, "++*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 470;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = 2;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 471;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(120),_progress,RemoteObject.createImmutable(360)}, "*+*",1, 0));Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 472;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_threecircles1b(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles1b (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,550);
if (RapidSub.canDelegate("draw_threecircles1b")) { return __ref.runUserSub(false, "jamloadingindicator","draw_threecircles1b", __ref, _progress);}
RemoteObject _maxr = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 550;BA.debugLine="Private Sub Draw_ThreeCircles1b (Progress As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 551;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "/-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 552;BA.debugLine="Dim r As Float = 15dip + MaxR + MaxR * Sin(Progre";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))),_maxr,_maxr,jamloadingindicator.__c.runMethod(true,"Sin",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(1),jamloadingindicator.__c.getField(true,"cPI")}, "**",0, 0)))}, "++*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 553;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = 2;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 554;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(120),_progress,RemoteObject.createImmutable(360)}, "*+*",1, 0));Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 555;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 557;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 558;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_threecircles2(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles2 (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,476);
if (RapidSub.canDelegate("draw_threecircles2")) { return __ref.runUserSub(false, "jamloadingindicator","draw_threecircles2", __ref, _progress);}
RemoteObject _minr = RemoteObject.createImmutable(0);
RemoteObject _maxr = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _r = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 476;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 477;BA.debugLine="Dim MinR As Int = 5dip";
Debug.JustUpdateDeviceLine();
_minr = jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("MinR", _minr);Debug.locals.put("MinR", _minr);
 BA.debugLineNum = 478;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
Debug.JustUpdateDeviceLine();
_maxr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(3),_minr,jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "//--",2, 0));Debug.locals.put("MaxR", _maxr);Debug.locals.put("MaxR", _maxr);
 BA.debugLineNum = 479;BA.debugLine="For i = 0 To 2";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = 2;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 480;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_minr,_maxr,RemoteObject.createImmutable(2),_maxr,RemoteObject.createImmutable(2),jamloadingindicator.__c.runMethod(true,"SinD",(Object)(RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360),RemoteObject.createImmutable(60),RemoteObject.createImmutable(_i)}, "*-*",1, 0)))}, "+/+/*",2, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 481;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_maxr,_minr,(RemoteObject.solve(new RemoteObject[] {_minr,_maxr,jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "++",2, 1)),RemoteObject.createImmutable(2),RemoteObject.createImmutable(_i)}, "++**",2, 1))),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(_r),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw_threecircles3(RemoteObject __ref,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("Draw_ThreeCircles3 (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,562);
if (RapidSub.canDelegate("draw_threecircles3")) { return __ref.runUserSub(false, "jamloadingindicator","draw_threecircles3", __ref, _progress);}
RemoteObject _r = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _alpha = RemoteObject.createImmutable(0f);
Debug.locals.put("Progress", _progress);
 BA.debugLineNum = 562;BA.debugLine="Private Sub Draw_ThreeCircles3 (Progress As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 563;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
Debug.JustUpdateDeviceLine();
_r = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getHeight")))),RemoteObject.createImmutable(2),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))}, "/-",1, 0));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 564;BA.debugLine="Dim B As Boolean = False";
Debug.JustUpdateDeviceLine();
_b = jamloadingindicator.__c.getField(true,"False");Debug.locals.put("B", _b);Debug.locals.put("B", _b);
 BA.debugLineNum = 566;BA.debugLine="For i=0 To 9";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = 9;
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 568;BA.debugLine="Dim Alpha As Float = i*36";
Debug.JustUpdateDeviceLine();
_alpha = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(36)}, "*",0, 1));Debug.locals.put("Alpha", _alpha);Debug.locals.put("Alpha", _alpha);
 BA.debugLineNum = 570;BA.debugLine="If Alpha>Progress*360 And B=False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_alpha,RemoteObject.solve(new RemoteObject[] {_progress,RemoteObject.createImmutable(360)}, "*",0, 0)) && RemoteObject.solveBoolean("=",_b,jamloadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 571;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(36)}, "*",0, 1))))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(jamloadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0xaaffffff))))),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 572;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 573;BA.debugLine="B=True";
Debug.JustUpdateDeviceLine();
_b = jamloadingindicator.__c.getField(true,"True");Debug.locals.put("B", _b);
 }else {
 BA.debugLineNum = 575;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX"),_r,jamloadingindicator.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r,jamloadingindicator.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _alpha)))}, "+*",1, 0))),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))),(Object)(jamloadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(__ref.getField(true,"_mcolorindicator" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((int)0x55ffffff))))),(Object)(jamloadingindicator.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getancholabelmensaje(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAnchoLabelMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("getancholabelmensaje")) { return __ref.runUserSub(false, "jamloadingindicator","getancholabelmensaje", __ref);}
 BA.debugLineNum = 151;BA.debugLine="Public Sub getAnchoLabelMensaje As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Return mAnchoLabelMensaje";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getancholoadingindicator(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAnchoLoadingIndicator (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("getancholoadingindicator")) { return __ref.runUserSub(false, "jamloadingindicator","getancholoadingindicator", __ref);}
 BA.debugLineNum = 139;BA.debugLine="Public Sub getAnchoLoadingIndicator As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Return mAnchoLoadingIndicator";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolorpanelfondo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getColorPanelFondo (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("getcolorpanelfondo")) { return __ref.runUserSub(false, "jamloadingindicator","getcolorpanelfondo", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Public Sub getColorPanelFondo As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="Return mColorPanelFondo";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcolorpanelfondo" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolorpanelfondoloadingindicatorcanvasmensaje(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getColorPanelFondoLoadingIndicatorCanvasMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("getcolorpanelfondoloadingindicatorcanvasmensaje")) { return __ref.runUserSub(false, "jamloadingindicator","getcolorpanelfondoloadingindicatorcanvasmensaje", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Public Sub getColorPanelFondoLoadingIndicatorCanva";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="Return mColorPanelFondoLoadingIndicatorCanvasMens";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ );
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcontroltiempoprocesoactivado(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getControlTiempoProcesoActivado (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("getcontroltiempoprocesoactivado")) { return __ref.runUserSub(false, "jamloadingindicator","getcontroltiempoprocesoactivado", __ref);}
 BA.debugLineNum = 179;BA.debugLine="public Sub getControlTiempoProcesoActivado As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 180;BA.debugLine="Return TimerControlTiempoProceso.Enabled";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getEnabled");
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getisshowing(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIsShowing (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("getisshowing")) { return __ref.runUserSub(false, "jamloadingindicator","getisshowing", __ref);}
 BA.debugLineNum = 319;BA.debugLine="Public Sub getIsShowing As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="If Background.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 321;BA.debugLine="Return Background.Visible";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getVisible");
 }else {
 BA.debugLineNum = 323;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return jamloadingindicator.__c.getField(true,"False");
 };
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iniciarcontroltiempoproceso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IniciarControlTiempoProceso (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("iniciarcontroltiempoproceso")) { return __ref.runUserSub(false, "jamloadingindicator","iniciarcontroltiempoproceso", __ref);}
 BA.debugLineNum = 163;BA.debugLine="public Sub IniciarControlTiempoProceso";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="If TimerControlTiempoProceso.IsInitialized=False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),jamloadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 165;BA.debugLine="TimerControlTiempoProceso.Initialize(\"TimerContr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("TimerControlTiempoProceso")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_mintervalotimercontroltiempoproceso" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 167;BA.debugLine="TimerControlTiempoProceso.Enabled=True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setEnabled",jamloadingindicator.__c.getField(true,"True"));
 BA.debugLineNum = 168;BA.debugLine="ReiniciarTiempoInicioControlTiempoProceso";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_reiniciartiempoiniciocontroltiempoproceso" /*RemoteObject*/ );
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "jamloadingindicator","initialize", __ref, _ba, _callback, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 68;BA.debugLine="Public Sub Initialize (Callback As Object, Parent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 73;BA.debugLine="mParent=Parent";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mparent" /*RemoteObject*/ ,_parent);
 BA.debugLineNum = 76;BA.debugLine="mColorPanelFondo=0xaa000000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorpanelfondo" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xaa000000)));
 BA.debugLineNum = 77;BA.debugLine="mMensajeLoading=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmensajeloading" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 BA.debugLineNum = 82;BA.debugLine="mAnchoLabelMensaje=0.8*mParent.Width";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mancholabelmensaje" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.8),__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "*",0, 0)));
 BA.debugLineNum = 85;BA.debugLine="mAnchoLoadingIndicator=50dip";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mancholoadingindicator" /*RemoteObject*/ ,jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 87;BA.debugLine="mColorMensaje=xui.Color_Cyan";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolormensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Cyan"));
 BA.debugLineNum = 91;BA.debugLine="mEstilo=JamLoadingIndicatorEstilo_FiveLines1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mestilo" /*RemoteObject*/ ,__ref.getField(true,"_jamloadingindicatorestilo_fivelines1" /*RemoteObject*/ ));
 BA.debugLineNum = 100;BA.debugLine="mColorMensaje=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolormensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 101;BA.debugLine="mColorIndicator=xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorindicator" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 102;BA.debugLine="mColorFondoLabelMensaje=0x00FFFFFF";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondolabelmensaje" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x00ffffff)));
 BA.debugLineNum = 103;BA.debugLine="mTamanoFuenteMensaje=14";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentemensaje" /*RemoteObject*/ ,BA.numberCast(float.class, 14));
 BA.debugLineNum = 104;BA.debugLine="mAlineacionHorizontalMensaje=\"CENTER\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionhorizontalmensaje" /*RemoteObject*/ ,BA.ObjectToString("CENTER"));
 BA.debugLineNum = 106;BA.debugLine="mColorPanelFondoLoadingIndicatorCanvasMensaje=xui";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 107;BA.debugLine="mDuracionCiclo=1000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mduracionciclo" /*RemoteObject*/ ,BA.numberCast(int.class, 1000));
 BA.debugLineNum = 109;BA.debugLine="mMostrarTiempoProceso=True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmostrartiempoproceso" /*RemoteObject*/ ,jamloadingindicator.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="mIntervaloTimerControlTiempoProceso=1000";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mintervalotimercontroltiempoproceso" /*RemoteObject*/ ,BA.numberCast(int.class, 1000));
 BA.debugLineNum = 111;BA.debugLine="mTextoControlTiempoProceso=\"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextocontroltiempoproceso" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mainloop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("mainloop")) { __ref.runUserSub(false, "jamloadingindicator","mainloop", __ref); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4j.docU.jamloadingindicator parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.jamloadingindicator parent;
RemoteObject _myindex = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _progress = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MainLoop (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,327);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 328;BA.debugLine="index = index + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_index" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_index" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 329;BA.debugLine="Dim MyIndex As Int = index";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_index" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 330;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.JustUpdateDeviceLine();
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 331;BA.debugLine="Do While MyIndex = index";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_index" /*RemoteObject*/ )))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 332;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / mDu";
Debug.JustUpdateDeviceLine();
_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2)),__ref.getField(true,"_mduracionciclo" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("progress", _progress);Debug.locals.put("progress", _progress);
 BA.debugLineNum = 333;BA.debugLine="progress = progress - Floor(progress)";
Debug.JustUpdateDeviceLine();
_progress = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_progress,parent.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _progress)))}, "-",1, 0));Debug.locals.put("progress", _progress);
 BA.debugLineNum = 334;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 335;BA.debugLine="CallSub2(Me, mDrawingSubName, progress)";
Debug.JustUpdateDeviceLine();
parent.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(true,"_mdrawingsubname" /*RemoteObject*/ )),(Object)((_progress)));
 BA.debugLineNum = 336;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 337;BA.debugLine="Sleep(10)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jamloadingindicator", "mainloop"),BA.numberCast(int.class, 10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 339;BA.debugLine="End Sub";
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
public static RemoteObject  _mediralturatextomultilinea(RemoteObject __ref,RemoteObject _fuente,RemoteObject _ancho,RemoteObject _texto) throws Exception{
try {
		Debug.PushSubsStack("MedirAlturaTextoMultilinea (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,624);
if (RapidSub.canDelegate("mediralturatextomultilinea")) { return __ref.runUserSub(false, "jamloadingindicator","mediralturatextomultilinea", __ref, _fuente, _ancho, _texto);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Fuente", _fuente);
Debug.locals.put("Ancho", _ancho);
Debug.locals.put("Texto", _texto);
 BA.debugLineNum = 624;BA.debugLine="Sub MedirAlturaTextoMultilinea (Fuente As B4XFont,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 625;BA.debugLine="Dim jo As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 626;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_fuente.getObject()),(_texto),(_ancho)}))));
 BA.debugLineNum = 627;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reiniciartiempoiniciocontroltiempoproceso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReiniciarTiempoInicioControlTiempoProceso (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("reiniciartiempoiniciocontroltiempoproceso")) { return __ref.runUserSub(false, "jamloadingindicator","reiniciartiempoiniciocontroltiempoproceso", __ref);}
 BA.debugLineNum = 188;BA.debugLine="Public Sub ReiniciarTiempoInicioControlTiempoProce";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="TicksInicioControlTiempoProceso=DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ticksiniciocontroltiempoproceso" /*RemoteObject*/ ,jamloadingindicator.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalineacionhorizontalmensaje(RemoteObject __ref,RemoteObject _alineacionhorizontalmensaje) throws Exception{
try {
		Debug.PushSubsStack("setAlineacionHorizontalMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setalineacionhorizontalmensaje")) { return __ref.runUserSub(false, "jamloadingindicator","setalineacionhorizontalmensaje", __ref, _alineacionhorizontalmensaje);}
RemoteObject _lblmensaje = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("AlineacionHorizontalMensaje", _alineacionhorizontalmensaje);
 BA.debugLineNum = 244;BA.debugLine="Public Sub setAlineacionHorizontalMensaje(Alineaci";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 246;BA.debugLine="Dim lblMensaje As Label=mLabelMensaje";
Debug.JustUpdateDeviceLine();
_lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblmensaje = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).getObject());Debug.locals.put("lblMensaje", _lblmensaje);Debug.locals.put("lblMensaje", _lblmensaje);
 BA.debugLineNum = 247;BA.debugLine="mAlineacionHorizontalMensaje=AlineacionHorizontal";
Debug.JustUpdateDeviceLine();
__ref.setField ("_malineacionhorizontalmensaje" /*RemoteObject*/ ,_alineacionhorizontalmensaje);
 BA.debugLineNum = 248;BA.debugLine="Dim jo As JavaObject = lblMensaje";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _lblmensaje.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 249;BA.debugLine="jo.RunMethod(\"setTextAlignment\", Array(mAlineacio";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTextAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_malineacionhorizontalmensaje" /*RemoteObject*/ ))})));
 BA.debugLineNum = 250;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalpha(RemoteObject __ref,RemoteObject _c,RemoteObject _alpha) throws Exception{
try {
		Debug.PushSubsStack("SetAlpha (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("setalpha")) { return __ref.runUserSub(false, "jamloadingindicator","setalpha", __ref, _c, _alpha);}
Debug.locals.put("c", _c);
Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 491;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 492;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xffffff))),(Object)(_c)),jamloadingindicator.__c.getField(false,"Bit").runMethod(true,"ShiftLeft",(Object)(_alpha),(Object)(BA.numberCast(int.class, 24)))}, "+",1, 1);
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setancholabelmensaje(RemoteObject __ref,RemoteObject _ancholabelmensaje) throws Exception{
try {
		Debug.PushSubsStack("setAnchoLabelMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("setancholabelmensaje")) { return __ref.runUserSub(false, "jamloadingindicator","setancholabelmensaje", __ref, _ancholabelmensaje);}
Debug.locals.put("AnchoLabelMensaje", _ancholabelmensaje);
 BA.debugLineNum = 156;BA.debugLine="Public Sub setAnchoLabelMensaje(AnchoLabelMensaje";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="mAnchoLabelMensaje=AnchoLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mancholabelmensaje" /*RemoteObject*/ ,BA.numberCast(int.class, _ancholabelmensaje));
 BA.debugLineNum = 158;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setancholoadingindicator(RemoteObject __ref,RemoteObject _ancholoadingindicator) throws Exception{
try {
		Debug.PushSubsStack("setAnchoLoadingIndicator (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setancholoadingindicator")) { return __ref.runUserSub(false, "jamloadingindicator","setancholoadingindicator", __ref, _ancholoadingindicator);}
Debug.locals.put("AnchoLoadingIndicator", _ancholoadingindicator);
 BA.debugLineNum = 145;BA.debugLine="Public Sub setAnchoLoadingIndicator(AnchoLoadingIn";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="mAnchoLoadingIndicator=AnchoLoadingIndicator";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mancholoadingindicator" /*RemoteObject*/ ,BA.numberCast(int.class, _ancholoadingindicator));
 BA.debugLineNum = 147;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorfondolabelmensaje(RemoteObject __ref,RemoteObject _colorfondolabelmensaje) throws Exception{
try {
		Debug.PushSubsStack("setColorFondoLabelMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("setcolorfondolabelmensaje")) { return __ref.runUserSub(false, "jamloadingindicator","setcolorfondolabelmensaje", __ref, _colorfondolabelmensaje);}
Debug.locals.put("ColorFondoLabelMensaje", _colorfondolabelmensaje);
 BA.debugLineNum = 222;BA.debugLine="Public Sub setColorFondoLabelMensaje(ColorFondoLab";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="mColorFondoLabelMensaje=ColorFondoLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorfondolabelmensaje" /*RemoteObject*/ ,_colorfondolabelmensaje);
 BA.debugLineNum = 225;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorloadingindicator(RemoteObject __ref,RemoteObject _colorloadingindicator) throws Exception{
try {
		Debug.PushSubsStack("setColorLoadingIndicator (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("setcolorloadingindicator")) { return __ref.runUserSub(false, "jamloadingindicator","setcolorloadingindicator", __ref, _colorloadingindicator);}
Debug.locals.put("ColorLoadingIndicator", _colorloadingindicator);
 BA.debugLineNum = 310;BA.debugLine="Public Sub setColorLoadingIndicator(ColorLoadingIn";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 311;BA.debugLine="mColorIndicator=ColorLoadingIndicator";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorindicator" /*RemoteObject*/ ,_colorloadingindicator);
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolormensaje(RemoteObject __ref,RemoteObject _colormensaje) throws Exception{
try {
		Debug.PushSubsStack("setColorMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("setcolormensaje")) { return __ref.runUserSub(false, "jamloadingindicator","setcolormensaje", __ref, _colormensaje);}
Debug.locals.put("ColorMensaje", _colormensaje);
 BA.debugLineNum = 236;BA.debugLine="Public Sub setColorMensaje(ColorMensaje As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="mColorMensaje=ColorMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolormensaje" /*RemoteObject*/ ,_colormensaje);
 BA.debugLineNum = 239;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
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
public static RemoteObject  _setcolorpanelfondo(RemoteObject __ref,RemoteObject _colorpanelfondo) throws Exception{
try {
		Debug.PushSubsStack("setColorPanelFondo (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("setcolorpanelfondo")) { return __ref.runUserSub(false, "jamloadingindicator","setcolorpanelfondo", __ref, _colorpanelfondo);}
Debug.locals.put("ColorPanelFondo", _colorpanelfondo);
 BA.debugLineNum = 122;BA.debugLine="Public Sub setColorPanelFondo(ColorPanelFondo As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="mColorPanelFondo=ColorPanelFondo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorpanelfondo" /*RemoteObject*/ ,_colorpanelfondo);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolorpanelfondoloadingindicatorcanvasmensaje(RemoteObject __ref,RemoteObject _colorpanelfondoloadingindicatorcanvasmensaje) throws Exception{
try {
		Debug.PushSubsStack("setColorPanelFondoLoadingIndicatorCanvasMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("setcolorpanelfondoloadingindicatorcanvasmensaje")) { return __ref.runUserSub(false, "jamloadingindicator","setcolorpanelfondoloadingindicatorcanvasmensaje", __ref, _colorpanelfondoloadingindicatorcanvasmensaje);}
Debug.locals.put("ColorPanelFondoLoadingIndicatorCanvasMensaje", _colorpanelfondoloadingindicatorcanvasmensaje);
 BA.debugLineNum = 132;BA.debugLine="Public Sub setColorPanelFondoLoadingIndicatorCanva";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="mColorPanelFondoLoadingIndicatorCanvasMensaje=Col";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ,_colorpanelfondoloadingindicatorcanvasmensaje);
 BA.debugLineNum = 134;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setduracionciclo(RemoteObject __ref,RemoteObject _duracionciclo) throws Exception{
try {
		Debug.PushSubsStack("setDuracionCiclo (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("setduracionciclo")) { return __ref.runUserSub(false, "jamloadingindicator","setduracionciclo", __ref, _duracionciclo);}
Debug.locals.put("DuracionCiclo", _duracionciclo);
 BA.debugLineNum = 315;BA.debugLine="Public Sub setDuracionCiclo(DuracionCiclo As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="mDuracionCiclo=DuracionCiclo";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mduracionciclo" /*RemoteObject*/ ,_duracionciclo);
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setestiloloadingindicator(RemoteObject __ref,RemoteObject _estiloloadingindicator) throws Exception{
try {
		Debug.PushSubsStack("setEstiloLoadingIndicator (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("setestiloloadingindicator")) { return __ref.runUserSub(false, "jamloadingindicator","setestiloloadingindicator", __ref, _estiloloadingindicator);}
Debug.locals.put("EstiloLoadingIndicator", _estiloloadingindicator);
 BA.debugLineNum = 305;BA.debugLine="Public Sub setEstiloLoadingIndicator(EstiloLoading";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 306;BA.debugLine="mEstilo=EstiloLoadingIndicator";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mestilo" /*RemoteObject*/ ,_estiloloadingindicator);
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setintervalomediciontiempoproceso(RemoteObject __ref,RemoteObject _intervalomediciontiempoproceso) throws Exception{
try {
		Debug.PushSubsStack("setIntervaloMedicionTiempoProceso (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("setintervalomediciontiempoproceso")) { return __ref.runUserSub(false, "jamloadingindicator","setintervalomediciontiempoproceso", __ref, _intervalomediciontiempoproceso);}
Debug.locals.put("IntervaloMedicionTiempoProceso", _intervalomediciontiempoproceso);
 BA.debugLineNum = 193;BA.debugLine="Public Sub setIntervaloMedicionTiempoProceso(Inter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 194;BA.debugLine="mIntervaloTimerControlTiempoProceso=IntervaloMedi";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mintervalotimercontroltiempoproceso" /*RemoteObject*/ ,_intervalomediciontiempoproceso);
 BA.debugLineNum = 195;BA.debugLine="If IntervaloMedicionTiempoProceso>0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_intervalomediciontiempoproceso,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 196;BA.debugLine="If TimerControlTiempoProceso.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="TimerControlTiempoProceso.Interval=mIntervaloTi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timercontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_mintervalotimercontroltiempoproceso" /*RemoteObject*/ )));
 };
 };
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
public static RemoteObject  _setmensajeloading(RemoteObject __ref,RemoteObject _mensajeloading) throws Exception{
try {
		Debug.PushSubsStack("setMensajeLoading (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("setmensajeloading")) { return __ref.runUserSub(false, "jamloadingindicator","setmensajeloading", __ref, _mensajeloading);}
Debug.locals.put("MensajeLoading", _mensajeloading);
 BA.debugLineNum = 209;BA.debugLine="Public Sub setMensajeLoading(MensajeLoading As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="mMensajeLoading=MensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmensajeloading" /*RemoteObject*/ ,_mensajeloading);
 BA.debugLineNum = 212;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
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
public static RemoteObject  _setmostrartiempoproceso(RemoteObject __ref,RemoteObject _mostrartiempoproceso) throws Exception{
try {
		Debug.PushSubsStack("setMostrarTiempoProceso (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("setmostrartiempoproceso")) { return __ref.runUserSub(false, "jamloadingindicator","setmostrartiempoproceso", __ref, _mostrartiempoproceso);}
Debug.locals.put("MostrarTiempoProceso", _mostrartiempoproceso);
 BA.debugLineNum = 184;BA.debugLine="Public Sub setMostrarTiempoProceso(MostrarTiempoPr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="mMostrarTiempoProceso=MostrarTiempoProceso";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmostrartiempoproceso" /*RemoteObject*/ ,_mostrartiempoproceso);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settamanofuentemensaje(RemoteObject __ref,RemoteObject _tamanofuentemensaje) throws Exception{
try {
		Debug.PushSubsStack("setTamanoFuenteMensaje (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("settamanofuentemensaje")) { return __ref.runUserSub(false, "jamloadingindicator","settamanofuentemensaje", __ref, _tamanofuentemensaje);}
Debug.locals.put("TamanoFuenteMensaje", _tamanofuentemensaje);
 BA.debugLineNum = 229;BA.debugLine="Public Sub setTamanoFuenteMensaje(TamanoFuenteMens";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="mTamanoFuenteMensaje=TamanoFuenteMensaje";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtamanofuentemensaje" /*RemoteObject*/ ,_tamanofuentemensaje);
 BA.debugLineNum = 232;BA.debugLine="ActualizarMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_actualizarmensajeloading" /*RemoteObject*/ );
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
public static RemoteObject  _settextocontroltiempoproceso(RemoteObject __ref,RemoteObject _textocontroltiempoproceso) throws Exception{
try {
		Debug.PushSubsStack("setTextoControlTiempoProceso (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("settextocontroltiempoproceso")) { return __ref.runUserSub(false, "jamloadingindicator","settextocontroltiempoproceso", __ref, _textocontroltiempoproceso);}
Debug.locals.put("TextoControlTiempoProceso", _textocontroltiempoproceso);
 BA.debugLineNum = 203;BA.debugLine="Public Sub setTextoControlTiempoProceso(TextoContr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="mTextoControlTiempoProceso=TextoControlTiempoProc";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mtextocontroltiempoproceso" /*RemoteObject*/ ,_textocontroltiempoproceso);
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
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "jamloadingindicator","show", __ref);}
RemoteObject _lblmensaje = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _alturaespaciobajoloadingindicator = RemoteObject.createImmutable(0);
RemoteObject _hlabelmensaje = RemoteObject.createImmutable(0);
RemoteObject _lblcontroltiempo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _pnlleft = RemoteObject.createImmutable(0);
RemoteObject _pnltop = RemoteObject.createImmutable(0);
RemoteObject _pnlwidth = RemoteObject.createImmutable(0);
RemoteObject _pnlheight = RemoteObject.createImmutable(0);
 BA.debugLineNum = 341;BA.debugLine="Public Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 343;BA.debugLine="If Background.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="Background.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setVisible",jamloadingindicator.__c.getField(true,"False"));
 BA.debugLineNum = 346;BA.debugLine="Background.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 349;BA.debugLine="Background= xui.CreatePanel(\"background\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_background" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background"))));
 BA.debugLineNum = 350;BA.debugLine="Background.Tag = \"JamLoadingIndicator_background\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("JamLoadingIndicator_background")));
 BA.debugLineNum = 351;BA.debugLine="Background.Color=mColorPanelFondo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_mcolorpanelfondo" /*RemoteObject*/ ));
 BA.debugLineNum = 352;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mparent" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_background" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mparent" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 353;BA.debugLine="mBaseLoadingIndicator =xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbaseloadingindicator" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 354;BA.debugLine="Background.AddView(mBaseLoadingIndicator,Max(0,(B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).getObject())),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))}, "-",1, 0)))),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25)))}, "-",1, 0)))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholoadingindicator" /*RemoteObject*/ ))));
 BA.debugLineNum = 357;BA.debugLine="Dim lblMensaje As Label";
Debug.JustUpdateDeviceLine();
_lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblMensaje", _lblmensaje);
 BA.debugLineNum = 358;BA.debugLine="lblMensaje.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lblmensaje.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 359;BA.debugLine="mLabelMensaje=lblMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).setObject (_lblmensaje.getObject());
 BA.debugLineNum = 360;BA.debugLine="mLabelMensaje.TextSize=mTamanoFuenteMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(double.class, __ref.getField(true,"_mtamanofuentemensaje" /*RemoteObject*/ )));
 BA.debugLineNum = 361;BA.debugLine="mLabelMensaje.Color=mColorFondoLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_mcolorfondolabelmensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 362;BA.debugLine="mLabelMensaje.TextColor=mColorMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_mcolormensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 363;BA.debugLine="mLabelMensaje.Text=mMensajeLoading";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_mmensajeloading" /*RemoteObject*/ )));
 BA.debugLineNum = 364;BA.debugLine="mLabelMensaje.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 366;BA.debugLine="Dim lblMensaje As Label=mLabelMensaje";
Debug.JustUpdateDeviceLine();
_lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lblmensaje = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).getObject());Debug.locals.put("lblMensaje", _lblmensaje);Debug.locals.put("lblMensaje", _lblmensaje);
 BA.debugLineNum = 367;BA.debugLine="Dim jo As JavaObject = lblMensaje";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _lblmensaje.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 368;BA.debugLine="jo.RunMethod(\"setTextAlignment\", Array(mAlineacio";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTextAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_malineacionhorizontalmensaje" /*RemoteObject*/ ))})));
 BA.debugLineNum = 370;BA.debugLine="mLabelMensaje.Width=mAnchoLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )));
 BA.debugLineNum = 372;BA.debugLine="Dim AlturaEspacioBajoLoadingIndicator As Int=Back";
Debug.JustUpdateDeviceLine();
_alturaespaciobajoloadingindicator = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0))}, "-",1, 0));Debug.locals.put("AlturaEspacioBajoLoadingIndicator", _alturaespaciobajoloadingindicator);Debug.locals.put("AlturaEspacioBajoLoadingIndicator", _alturaespaciobajoloadingindicator);
 BA.debugLineNum = 373;BA.debugLine="Dim hLabelMensaje As Double";
Debug.JustUpdateDeviceLine();
_hlabelmensaje = RemoteObject.createImmutable(0);Debug.locals.put("hLabelMensaje", _hlabelmensaje);
 BA.debugLineNum = 380;BA.debugLine="lblMensaje.WrapText = True";
Debug.JustUpdateDeviceLine();
_lblmensaje.runMethod(true,"setWrapText",jamloadingindicator.__c.getField(true,"True"));
 BA.debugLineNum = 381;BA.debugLine="hLabelMensaje=Min(MedirAlturaTextoMultilinea(mLab";
Debug.JustUpdateDeviceLine();
_hlabelmensaje = jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_mediralturatextomultilinea" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(false,"getFont")),(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.ObjectToString(__ref.getField(false,"_mmensajeloading" /*RemoteObject*/ ))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_alturaespaciobajoloadingindicator,jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))));Debug.locals.put("hLabelMensaje", _hlabelmensaje);
 BA.debugLineNum = 382;BA.debugLine="mLabelMensaje.Height=hLabelMensaje";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"setHeight",_hlabelmensaje);
 BA.debugLineNum = 383;BA.debugLine="Background.AddView(mLabelMensaje,Max(0,(Backgroun";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).getObject())),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ ))),(Object)(_hlabelmensaje));
 BA.debugLineNum = 387;BA.debugLine="Dim lblControlTiempo As Label";
Debug.JustUpdateDeviceLine();
_lblcontroltiempo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lblControlTiempo", _lblcontroltiempo);
 BA.debugLineNum = 388;BA.debugLine="lblControlTiempo.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lblcontroltiempo.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 392;BA.debugLine="mLabelControlTiempoProceso=lblControlTiempo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).setObject (_lblcontroltiempo.getObject());
 BA.debugLineNum = 393;BA.debugLine="mLabelControlTiempoProceso.TextSize=Max(mTamanoFu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setTextSize",jamloadingindicator.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mtamanofuentemensaje" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-",1, 0)),(Object)(BA.numberCast(double.class, 4))));
 BA.debugLineNum = 394;BA.debugLine="mLabelControlTiempoProceso.TextColor=mColorMensaj";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setTextColor",__ref.getField(true,"_mcolormensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 395;BA.debugLine="mLabelControlTiempoProceso.SetTextAlignment(\"CENT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 396;BA.debugLine="mLabelControlTiempoProceso.Width=mAnchoLabelMensa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )));
 BA.debugLineNum = 398;BA.debugLine="mLabelControlTiempoProceso.Height=mLabelControlTi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getTextSize"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 0));
 BA.debugLineNum = 399;BA.debugLine="Background.AddView(mLabelControlTiempoProceso,Max";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).getObject())),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_mancholabelmensaje" /*RemoteObject*/ ))),(Object)(_hlabelmensaje));
 BA.debugLineNum = 401;BA.debugLine="mlstEstilos.initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstestilos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 402;BA.debugLine="mlstEstilos.addAll(Array As String(\"Three Circles";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlstestilos" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(jamloadingindicator.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("Three Circles 1"),BA.ObjectToString("Three Circles 1b"),BA.ObjectToString("Three Circles 2"),BA.ObjectToString("Three Circles 3"),BA.ObjectToString("Single Circle"),BA.ObjectToString("Five Lines 1"),BA.ObjectToString("Ten Lines"),BA.ObjectToString("Arc 1"),BA.ObjectToString("Arc 2"),RemoteObject.createImmutable("PacMan")})))));
 BA.debugLineNum = 406;BA.debugLine="mDrawingSubName=\"Draw_\" & mEstilo.Replace(\" \", \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdrawingsubname" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Draw_"),__ref.getField(true,"_mestilo" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 407;BA.debugLine="cvs.Initialize(mBaseLoadingIndicator)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ )));
 BA.debugLineNum = 409;BA.debugLine="If mPanelFondoLoadingIndicatorCanvasMensaje.IsIni";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),jamloadingindicator.__c.getField(true,"False"))) { 
 BA.debugLineNum = 410;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje=xui.Cre";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 411;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 };
 BA.debugLineNum = 413;BA.debugLine="Dim PnlLeft As Double=Min(mBaseLoadingIndicator.L";
Debug.JustUpdateDeviceLine();
_pnlleft = RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getLeft"))))),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0);Debug.locals.put("PnlLeft", _pnlleft);Debug.locals.put("PnlLeft", _pnlleft);
 BA.debugLineNum = 414;BA.debugLine="Dim PnlTop As Double=Min(mBaseLoadingIndicator.To";
Debug.JustUpdateDeviceLine();
_pnltop = RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(jamloadingindicator.__c.runMethod(true,"Min",(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getTop"))))),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0);Debug.locals.put("PnlTop", _pnltop);Debug.locals.put("PnlTop", _pnltop);
 BA.debugLineNum = 415;BA.debugLine="Dim PnlWidth As Double=Max(mBaseLoadingIndicator.";
Debug.JustUpdateDeviceLine();
_pnlwidth = RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.runMethod(true,"Max",(Object)(__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getWidth"))))),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0);Debug.locals.put("PnlWidth", _pnlwidth);Debug.locals.put("PnlWidth", _pnlwidth);
 BA.debugLineNum = 416;BA.debugLine="Dim PnlHeight As Double=mBaseLoadingIndicator.Hei";
Debug.JustUpdateDeviceLine();
_pnlheight = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbaseloadingindicator" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mlabelmensaje" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"getHeight"),jamloadingindicator.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "+++",3, 0);Debug.locals.put("PnlHeight", _pnlheight);Debug.locals.put("PnlHeight", _pnlheight);
 BA.debugLineNum = 417;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetLayou";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(_pnlleft),(Object)(_pnltop),(Object)(_pnlwidth),(Object)(_pnlheight));
 BA.debugLineNum = 418;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.Color=mC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_mcolorpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ));
 BA.debugLineNum = 419;BA.debugLine="If mPanelFondoLoadingIndicatorCanvasMensaje.Paren";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 420;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.RemoveV";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 422;BA.debugLine="Background.AddView(mPanelFondoLoadingIndicatorCan";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).getObject())),(Object)(jamloadingindicator.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"getWidth"),_pnlwidth}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)))),(Object)(_pnltop),(Object)(_pnlwidth),(Object)(_pnlheight));
 BA.debugLineNum = 423;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SendToBa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpanelfondoloadingindicatorcanvasmensaje" /*RemoteObject*/ ).runVoidMethod ("SendToBack");
 BA.debugLineNum = 425;BA.debugLine="Background.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_background" /*RemoteObject*/ ).runMethod(true,"setVisible",jamloadingindicator.__c.getField(true,"True"));
 BA.debugLineNum = 426;BA.debugLine="MainLoop";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.jamloadingindicator.class, "_mainloop" /*void*/ );
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timercontroltiempoproceso_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimerControlTiempoProceso_Tick (jamloadingindicator) ","jamloadingindicator",79,__ref.getField(false, "ba"),__ref,601);
if (RapidSub.canDelegate("timercontroltiempoproceso_tick")) { return __ref.runUserSub(false, "jamloadingindicator","timercontroltiempoproceso_tick", __ref);}
RemoteObject _timeformatant = RemoteObject.createImmutable("");
 BA.debugLineNum = 601;BA.debugLine="Sub TimerControlTiempoProceso_Tick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 602;BA.debugLine="If mMostrarTiempoProceso Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mmostrartiempoproceso" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 609;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
Debug.JustUpdateDeviceLine();
_timeformatant = jamloadingindicator.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 610;BA.debugLine="DateTime.Timeformat=\"mm:ss\"";
Debug.JustUpdateDeviceLine();
jamloadingindicator.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("mm:ss"));
 BA.debugLineNum = 611;BA.debugLine="mLabelControlTiempoProceso.Text=$\"$Time{DateTime";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mlabelcontroltiempoproceso" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),jamloadingindicator.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((RemoteObject.solve(new RemoteObject[] {jamloadingindicator.__c.getField(false,"DateTime").runMethod(true,"getNow"),__ref.getField(true,"_ticksiniciocontroltiempoproceso" /*RemoteObject*/ )}, "-",1, 2)))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 612;BA.debugLine="DateTime.Timeformat=TimeFormatAnt";
Debug.JustUpdateDeviceLine();
jamloadingindicator.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 };
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
}