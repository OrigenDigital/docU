package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class utilidades_subs_0 {


public static RemoteObject  _addimagetolabel(RemoteObject _lbl,RemoteObject _dirimage,RemoteObject _fileimage) throws Exception{
try {
		Debug.PushSubsStack("AddImageToLabel (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1328);
if (RapidSub.canDelegate("addimagetolabel")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","addimagetolabel", _lbl, _dirimage, _fileimage);}
RemoteObject _xlblsalir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imgv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _ximgv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _jolblsalirjamtableview = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("lbl", _lbl);
Debug.locals.put("DirImage", _dirimage);
Debug.locals.put("FileImage", _fileimage);
 BA.debugLineNum = 1328;BA.debugLine="Sub AddImageToLabel(lbl As Label, DirImage As Stri";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1329;BA.debugLine="Dim xLblSalir As B4XView=lbl";
Debug.ShouldStop(65536);
_xlblsalir = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlblsalir = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xLblSalir", _xlblsalir);Debug.locals.put("xLblSalir", _xlblsalir);
 BA.debugLineNum = 1330;BA.debugLine="xLblSalir.Width=16dip";
Debug.ShouldStop(131072);
_xlblsalir.runMethod(true,"setWidth",BA.numberCast(double.class, utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))));
 BA.debugLineNum = 1331;BA.debugLine="xLblSalir.Height=16dip";
Debug.ShouldStop(262144);
_xlblsalir.runMethod(true,"setHeight",BA.numberCast(double.class, utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))));
 BA.debugLineNum = 1332;BA.debugLine="Dim imgV As ImageView";
Debug.ShouldStop(524288);
_imgv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("imgV", _imgv);
 BA.debugLineNum = 1333;BA.debugLine="imgV.Initialize(\"\")";
Debug.ShouldStop(1048576);
_imgv.runVoidMethod ("Initialize",utilidades.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1334;BA.debugLine="Dim xImgV As B4XView=imgV";
Debug.ShouldStop(2097152);
_ximgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_ximgv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _imgv.getObject());Debug.locals.put("xImgV", _ximgv);Debug.locals.put("xImgV", _ximgv);
 BA.debugLineNum = 1335;BA.debugLine="xImgV.Width=xLblSalir.Width";
Debug.ShouldStop(4194304);
_ximgv.runMethod(true,"setWidth",_xlblsalir.runMethod(true,"getWidth"));
 BA.debugLineNum = 1336;BA.debugLine="xImgV.Height=xLblSalir.Height";
Debug.ShouldStop(8388608);
_ximgv.runMethod(true,"setHeight",_xlblsalir.runMethod(true,"getHeight"));
 BA.debugLineNum = 1338;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmap(DirImage, F";
Debug.ShouldStop(33554432);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = utilidades._xui.runMethod(false,"LoadBitmap",(Object)(_dirimage),(Object)(_fileimage));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1340;BA.debugLine="FillImageToView(bmp, xImgV)";
Debug.ShouldStop(134217728);
_fillimagetoview(_bmp,_ximgv);
 BA.debugLineNum = 1341;BA.debugLine="Dim JOlblSalirJamTableView As JavaObject=lbl";
Debug.ShouldStop(268435456);
_jolblsalirjamtableview = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jolblsalirjamtableview = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _lbl.getObject());Debug.locals.put("JOlblSalirJamTableView", _jolblsalirjamtableview);Debug.locals.put("JOlblSalirJamTableView", _jolblsalirjamtableview);
 BA.debugLineNum = 1342;BA.debugLine="JOlblSalirJamTableView.RunMethod(\"setGraphic\", Ar";
Debug.ShouldStop(536870912);
_jolblsalirjamtableview.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setGraphic")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_imgv.getObject())})));
 BA.debugLineNum = 1343;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ajusteautomaxcolumna(RemoteObject _tv) throws Exception{
try {
		Debug.PushSubsStack("AjusteAutoMaxColumna (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,210);
if (RapidSub.canDelegate("ajusteautomaxcolumna")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","ajusteautomaxcolumna", _tv);}
RemoteObject _colchars = null;
RemoteObject _row = null;
int _c = 0;
RemoteObject _scontenido = RemoteObject.createImmutable("");
RemoteObject _totalchars = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _lstanchos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("tv", _tv);
 BA.debugLineNum = 210;BA.debugLine="public Sub AjusteAutoMaxColumna(tv As TableView) A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim colChars(tv.ColumnsCount) As Int";
Debug.ShouldStop(262144);
_colchars = RemoteObject.createNewArray ("int", new int[] {_tv.runMethod(true,"getColumnsCount").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("colChars", _colchars);
 BA.debugLineNum = 213;BA.debugLine="For Each row() As Object In tv.Items";
Debug.ShouldStop(1048576);
{
final RemoteObject group2 = _tv.runMethod(false,"getItems");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_row = (group2.runMethod(false,"Get",index2));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 214;BA.debugLine="For c = 0 To tv.ColumnsCount - 1";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_tv.runMethod(true,"getColumnsCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step3 > 0 && _c <= limit3) || (step3 < 0 && _c >= limit3) ;_c = ((int)(0 + _c + step3))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 215;BA.debugLine="Dim sContenido As String=row(c)";
Debug.ShouldStop(4194304);
_scontenido = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, _c)));Debug.locals.put("sContenido", _scontenido);Debug.locals.put("sContenido", _scontenido);
 BA.debugLineNum = 216;BA.debugLine="colChars(c) = Max(sContenido.Length, colChars(c";
Debug.ShouldStop(8388608);
_colchars.setArrayElement (BA.numberCast(int.class, utilidades.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _scontenido.runMethod(true,"length"))),(Object)(BA.numberCast(double.class, _colchars.getArrayElement(true,BA.numberCast(int.class, _c)))))),BA.numberCast(int.class, _c));
 }
}Debug.locals.put("c", _c);
;
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 220;BA.debugLine="Dim totalChars As Int    ' Total length in chars";
Debug.ShouldStop(134217728);
_totalchars = RemoteObject.createImmutable(0);Debug.locals.put("totalChars", _totalchars);
 BA.debugLineNum = 221;BA.debugLine="For i = 0 To colChars.Length - 1";
Debug.ShouldStop(268435456);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_colchars.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 222;BA.debugLine="If colChars(i) < tv.GetColumnHeader(i).Length Th";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",_colchars.getArrayElement(true,BA.numberCast(int.class, _i)),BA.numberCast(double.class, _tv.runMethod(true,"GetColumnHeader",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"length")))) { 
 BA.debugLineNum = 223;BA.debugLine="colChars(i) = tv.GetColumnHeader(i).Length";
Debug.ShouldStop(1073741824);
_colchars.setArrayElement (_tv.runMethod(true,"GetColumnHeader",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"length"),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 225;BA.debugLine="totalChars = totalChars + colChars(i)";
Debug.ShouldStop(1);
_totalchars = RemoteObject.solve(new RemoteObject[] {_totalchars,_colchars.getArrayElement(true,BA.numberCast(int.class, _i))}, "+",1, 1);Debug.locals.put("totalChars", _totalchars);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 229;BA.debugLine="Dim lstAnchos As List";
Debug.ShouldStop(16);
_lstanchos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstAnchos", _lstanchos);
 BA.debugLineNum = 230;BA.debugLine="lstAnchos.Initialize";
Debug.ShouldStop(32);
_lstanchos.runVoidMethod ("Initialize");
 BA.debugLineNum = 231;BA.debugLine="For i = 0 To colChars.Length - 1";
Debug.ShouldStop(64);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_colchars.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 233;BA.debugLine="Log(\"Ancho columna \" & tv.GetColumnHeader(i) & \"";
Debug.ShouldStop(256);
utilidades.__c.runVoidMethod ("LogImpl","83997719",RemoteObject.concat(RemoteObject.createImmutable("Ancho columna "),_tv.runMethod(true,"GetColumnHeader",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(" = "),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_colchars.getArrayElement(true,BA.numberCast(int.class, _i)),RemoteObject.createImmutable(8)}, "*",0, 1)),RemoteObject.createImmutable(20)}, "+",1, 1))),0);
 BA.debugLineNum = 234;BA.debugLine="lstAnchos.Add(((colChars(i) * 8)+20))";
Debug.ShouldStop(512);
_lstanchos.runVoidMethod ("Add",(Object)(((RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_colchars.getArrayElement(true,BA.numberCast(int.class, _i)),RemoteObject.createImmutable(8)}, "*",0, 1)),RemoteObject.createImmutable(20)}, "+",1, 1)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 236;BA.debugLine="Return lstAnchos";
Debug.ShouldStop(2048);
if (true) return _lstanchos;
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,320);
if (RapidSub.canDelegate("application_error")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 320;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return utilidades.__c.getField(true,"True");
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asjo(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,317);
if (RapidSub.canDelegate("asjo")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","asjo", _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 317;BA.debugLine="Sub asJO(o As JavaObject)As JavaObject";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="Return o";
Debug.ShouldStop(536870912);
if (true) return _o;
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido() throws Exception{
try {
		Debug.PushSubsStack("CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1449);
if (RapidSub.canDelegate("cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido");}
ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido rsub = new ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido(null);
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
public static class ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido extends BA.ResumableSub {
public ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido(b4j.docU.utilidades parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _error = RemoteObject.createImmutable("");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1449);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1450;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(512);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1451;BA.debugLine="Dim Error As String";
Debug.ShouldStop(1024);
_error = RemoteObject.createImmutable("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 1452;BA.debugLine="Dim mData0 As Map";
Debug.ShouldStop(2048);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 1453;BA.debugLine="mData0.Initialize";
Debug.ShouldStop(4096);
_mdata0.runVoidMethod ("Initialize");
 BA.debugLineNum = 1454;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(8192);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 1455;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(16384);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 1458;BA.debugLine="Dim Comando As String=\"ConfiguracionHttpRequestEn";
Debug.ShouldStop(131072);
_comando = BA.ObjectToString("ConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 1459;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(262144);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(utilidades.getObject()));
 BA.debugLineNum = 1460;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1462;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 1466;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1467;BA.debugLine="Error=$\"Error de conexion servidor/query ${Coman";
Debug.ShouldStop(67108864);
_error = (RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_comando))),RemoteObject.createImmutable(".")));Debug.locals.put("Error", _error);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1471;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 1475;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1476;BA.debugLine="Error=$\"No existe configuración para envio auto";
Debug.ShouldStop(8);
_error = (RemoteObject.createImmutable("No existe configuración para envio automático de email nueva tarea incidencia."));Debug.locals.put("Error", _error);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1479;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(64);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 1480;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1481;BA.debugLine="Error=\"\"";
Debug.ShouldStop(256);
_error = BA.ObjectToString("");Debug.locals.put("Error", _error);
 BA.debugLineNum = 1483;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(1024);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 1490;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 1491;BA.debugLine="mRes.Put(\"Error\",Error)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Error"))),(Object)((_error)));
 BA.debugLineNum = 1492;BA.debugLine="mRes.Put(\"mData0\",mData0)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mData0"))),(Object)((_mdata0.getObject())));
 BA.debugLineNum = 1493;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 1494;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _datosjrdc_completed(RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cdbl(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CDbl (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,123);
if (RapidSub.canDelegate("cdbl")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","cdbl", _o);}
RemoteObject _ox = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 123;BA.debugLine="public Sub CDbl(o As Object) As Double";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 125;BA.debugLine="Dim ox As String = o";
Debug.ShouldStop(268435456);
_ox = BA.ObjectToString(_o);Debug.locals.put("ox", _ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 126;BA.debugLine="If(IsNumber(ox) And (ox.ToLowerCase.Contains(\".\"";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean(".",utilidades.__c.runMethod(true,"IsNumber",(Object)(_ox))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_ox.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable(".")))) || RemoteObject.solveBoolean(".",_ox.runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("e"))))))))) { 
 BA.debugLineNum = 127;BA.debugLine="ox = NumberFormat2(o,0,9,0,False)";
Debug.ShouldStop(1073741824);
_ox = utilidades.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _o)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 9)),(Object)(BA.numberCast(int.class, 0)),(Object)(utilidades.__c.getField(true,"False")));Debug.locals.put("ox", _ox);
 };
 BA.debugLineNum = 129;BA.debugLine="ox = GetNumbers(ox)";
Debug.ShouldStop(1);
_ox = _getnumbers(_ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 130;BA.debugLine="If ox = \"\" Then ox = \"0\"";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_ox,BA.ObjectToString(""))) { 
_ox = BA.ObjectToString("0");Debug.locals.put("ox", _ox);};
 BA.debugLineNum = 131;BA.debugLine="Return ox";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(double.class, _ox);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e10.toString()); BA.debugLineNum = 133;BA.debugLine="Return 0";
Debug.ShouldStop(16);
if (true) return BA.numberCast(double.class, 0);
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _centerformonscreen(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("CenterFormOnScreen (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,27);
if (RapidSub.canDelegate("centerformonscreen")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","centerformonscreen", _f);}
RemoteObject _stage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("f", _f);
 BA.debugLineNum = 27;BA.debugLine="Sub CenterFormOnScreen(f As Form)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Dim Stage As JavaObject = f";
Debug.ShouldStop(134217728);
_stage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("Stage", _stage);Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 29;BA.debugLine="Stage = Stage.GetField(\"stage\")";
Debug.ShouldStop(268435456);
_stage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _stage.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 30;BA.debugLine="Stage.RunMethod(\"centerOnScreen\",Null)";
Debug.ShouldStop(536870912);
_stage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("centerOnScreen")),(Object)((utilidades.__c.getField(false,"Null"))));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkpermisoaplicacionusuario(RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario) throws Exception{
try {
		Debug.PushSubsStack("CheckPermisoAplicacionUsuario (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,594);
if (RapidSub.canDelegate("checkpermisoaplicacionusuario")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","checkpermisoaplicacionusuario", _rdclinkcommandpermisos, _comandopermisos, _aplicacion, _usuario);}
ResumableSub_CheckPermisoAplicacionUsuario rsub = new ResumableSub_CheckPermisoAplicacionUsuario(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario);
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
public static class ResumableSub_CheckPermisoAplicacionUsuario extends BA.ResumableSub {
public ResumableSub_CheckPermisoAplicacionUsuario(b4j.docU.utilidades parent,RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _rdclinkcommandpermisos;
RemoteObject _comandopermisos;
RemoteObject _aplicacion;
RemoteObject _usuario;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckPermisoAplicacionUsuario (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,594);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("rdcLinkCommandPermisos", _rdclinkcommandpermisos);
Debug.locals.put("ComandoPermisos", _comandopermisos);
Debug.locals.put("Aplicacion", _aplicacion);
Debug.locals.put("Usuario", _usuario);
 BA.debugLineNum = 595;BA.debugLine="Wait For(PermisosAplicacionUsuarioObjetoPermiso(r";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisoaplicacionusuario"), _permisosaplicacionusuarioobjetopermiso(_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,RemoteObject.createImmutable("Aplicacion")));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 596;BA.debugLine="Select Case sRes";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 598;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
Debug.ShouldStop(2097152);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 599;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisoaplicacionusuario"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 600;BA.debugLine="ExitApplication";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 601;BA.debugLine="Return Null";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 603;BA.debugLine="Return \"PermisoNoEspecificado\"";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("PermisoNoEspecificado")));return;};
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 605;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
Debug.ShouldStop(268435456);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 606;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisoaplicacionusuario"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
 BA.debugLineNum = 607;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 608;BA.debugLine="Return Null";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 610;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
Debug.ShouldStop(2);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a esta aplicacón.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 611;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisoaplicacionusuario"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
 BA.debugLineNum = 612;BA.debugLine="ExitApplication";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 613;BA.debugLine="Return Null";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 615;BA.debugLine="Return sRes";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_sres));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _complete(RemoteObject _sres) throws Exception{
}
public static void  _msgbox_result() throws Exception{
}
public static RemoteObject  _checkpermisosaplicacionusuarioobjetopermiso(RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario,RemoteObject _nombreobjetopermiso) throws Exception{
try {
		Debug.PushSubsStack("CheckPermisosAplicacionUsuarioObjetoPermiso (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,632);
if (RapidSub.canDelegate("checkpermisosaplicacionusuarioobjetopermiso")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","checkpermisosaplicacionusuarioobjetopermiso", _rdclinkcommandpermisos, _comandopermisos, _aplicacion, _usuario, _nombreobjetopermiso);}
ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso rsub = new ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso);
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
public static class ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso extends BA.ResumableSub {
public ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso(b4j.docU.utilidades parent,RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario,RemoteObject _nombreobjetopermiso) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
this._nombreobjetopermiso = _nombreobjetopermiso;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _rdclinkcommandpermisos;
RemoteObject _comandopermisos;
RemoteObject _aplicacion;
RemoteObject _usuario;
RemoteObject _nombreobjetopermiso;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckPermisosAplicacionUsuarioObjetoPermiso (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,632);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("rdcLinkCommandPermisos", _rdclinkcommandpermisos);
Debug.locals.put("ComandoPermisos", _comandopermisos);
Debug.locals.put("Aplicacion", _aplicacion);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("NombreObjetoPermiso", _nombreobjetopermiso);
 BA.debugLineNum = 633;BA.debugLine="Wait For(PermisosAplicacionUsuarioObjetoPermiso(r";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _permisosaplicacionusuarioobjetopermiso(_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 634;BA.debugLine="Select Case sRes";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,BA.ObjectToString("ErrConn"),BA.ObjectToString("SinPermiso"),BA.ObjectToString("ERROR"),BA.ObjectToString("DENIED"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 636;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
Debug.ShouldStop(134217728);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(BA.ObjectToString("Error de conexion servidor/query.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 637;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 638;BA.debugLine="Return \"ERROR\"";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("ERROR")));return;};
 if (true) break;

case 5:
//C
this.state = 12;
 BA.debugLineNum = 640;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
Debug.ShouldStop(-2147483648);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 641;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
 BA.debugLineNum = 642;BA.debugLine="Return \"NO\"";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("NO")));return;};
 if (true) break;

case 7:
//C
this.state = 12;
 BA.debugLineNum = 644;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
Debug.ShouldStop(8);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(_sres),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 645;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
 BA.debugLineNum = 646;BA.debugLine="Return \"ERROR\"";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("ERROR")));return;};
 if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 648;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
Debug.ShouldStop(128);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(BA.ObjectToString("No tienes permiso para acceder a este módulo.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 649;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
 BA.debugLineNum = 650;BA.debugLine="Return \"DENIED\"";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("DENIED")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 652;BA.debugLine="Return sRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_sres));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 654;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _cint(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CInt (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,138);
if (RapidSub.canDelegate("cint")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","cint", _o);}
RemoteObject _ox = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 138;BA.debugLine="public Sub CInt(o As Object) As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 140;BA.debugLine="Dim ox As String = o";
Debug.ShouldStop(2048);
_ox = BA.ObjectToString(_o);Debug.locals.put("ox", _ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 141;BA.debugLine="ox = GetNumbers(ox)";
Debug.ShouldStop(4096);
_ox = _getnumbers(_ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 142;BA.debugLine="If ox = \"\" Then ox = \"0\"";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_ox,BA.ObjectToString(""))) { 
_ox = BA.ObjectToString("0");Debug.locals.put("ox", _ox);};
 BA.debugLineNum = 143;BA.debugLine="Return Floor(ox)";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(int.class, utilidades.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _ox))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e7.toString()); BA.debugLineNum = 145;BA.debugLine="Return 0";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clng(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CLng (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,111);
if (RapidSub.canDelegate("clng")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","clng", _o);}
RemoteObject _ox = RemoteObject.createImmutable("");
Debug.locals.put("o", _o);
 BA.debugLineNum = 111;BA.debugLine="public Sub CLng(o As Object) As Long";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 113;BA.debugLine="Dim ox As String = o";
Debug.ShouldStop(65536);
_ox = BA.ObjectToString(_o);Debug.locals.put("ox", _ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 114;BA.debugLine="ox = GetNumbers(ox)";
Debug.ShouldStop(131072);
_ox = _getnumbers(_ox);Debug.locals.put("ox", _ox);
 BA.debugLineNum = 115;BA.debugLine="If ox = \"\" Then ox = \"0\"";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_ox,BA.ObjectToString(""))) { 
_ox = BA.ObjectToString("0");Debug.locals.put("ox", _ox);};
 BA.debugLineNum = 116;BA.debugLine="Return Floor(ox)";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return BA.numberCast(long.class, utilidades.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _ox))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e7.toString()); BA.debugLineNum = 118;BA.debugLine="Return 0";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(long.class, 0);
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertmillisecondstostring(RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("ConvertMillisecondsToString (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1156);
if (RapidSub.canDelegate("convertmillisecondstostring")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","convertmillisecondstostring", _t);}
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
RemoteObject _seconds = RemoteObject.createImmutable(0);
Debug.locals.put("t", _t);
 BA.debugLineNum = 1156;BA.debugLine="Sub ConvertMillisecondsToString(t As Long) As Stri";
Debug.ShouldStop(8);
 BA.debugLineNum = 1157;BA.debugLine="Dim hours, minutes, seconds As Int";
Debug.ShouldStop(16);
_hours = RemoteObject.createImmutable(0);Debug.locals.put("hours", _hours);
_minutes = RemoteObject.createImmutable(0);Debug.locals.put("minutes", _minutes);
_seconds = RemoteObject.createImmutable(0);Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 1158;BA.debugLine="hours = t / DateTime.TicksPerHour";
Debug.ShouldStop(32);
_hours = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_t,utilidades.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "/",0, 0));Debug.locals.put("hours", _hours);
 BA.debugLineNum = 1159;BA.debugLine="minutes = (t Mod DateTime.TicksPerHour) / DateTim";
Debug.ShouldStop(64);
_minutes = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,utilidades.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "%",0, 2)),utilidades.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "/",0, 0));Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 1160;BA.debugLine="seconds = (t Mod DateTime.TicksPerMinute) / DateT";
Debug.ShouldStop(128);
_seconds = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_t,utilidades.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "%",0, 2)),utilidades.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "/",0, 0));Debug.locals.put("seconds", _seconds);
 BA.debugLineNum = 1161;BA.debugLine="Return $\"$1.0{hours}:$2.0{minutes}:$2.0{seconds}\"";
Debug.ShouldStop(256);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_hours))),RemoteObject.createImmutable(":"),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_minutes))),RemoteObject.createImmutable(":"),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_seconds))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 1162;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _copyobject(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CopyObject (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1514);
if (RapidSub.canDelegate("copyobject")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","copyobject", _o);}
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
Debug.locals.put("o", _o);
 BA.debugLineNum = 1514;BA.debugLine="Sub CopyObject(o As Object) As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 1515;BA.debugLine="Dim s As B4XSerializator";
Debug.ShouldStop(1024);
_s = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("s", _s);
 BA.debugLineNum = 1516;BA.debugLine="Return s.ConvertBytesToObject(s.ConvertObjectToBy";
Debug.ShouldStop(2048);
if (true) return _s.runMethod(false,"ConvertBytesToObject",(Object)(_s.runMethod(false,"ConvertObjectToBytes",(Object)(_o))));
 BA.debugLineNum = 1517;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4xfont(RemoteObject _fontfilename,RemoteObject _fontsize,RemoteObject _nativefontsize) throws Exception{
try {
		Debug.PushSubsStack("CreateB4XFont (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1023);
if (RapidSub.canDelegate("createb4xfont")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","createb4xfont", _fontfilename, _fontsize, _nativefontsize);}
Debug.locals.put("FontFileName", _fontfilename);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("NativeFontSize", _nativefontsize);
 BA.debugLineNum = 1023;BA.debugLine="Public Sub CreateB4XFont(FontFileName As String, F";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1029;BA.debugLine="Return xui.CreateFont(fx.LoadFont(File.DirAssets,";
Debug.ShouldStop(16);
if (true) return utilidades._xui.runMethod(false,"CreateFont",(Object)((utilidades._fx.runMethod(false,"LoadFont",(Object)(utilidades.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_fontfilename),(Object)(BA.numberCast(double.class, _nativefontsize))).getObject())),(Object)(_fontsize));
 BA.debugLineNum = 1031;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cstr(RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,90);
if (RapidSub.canDelegate("cstr")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","cstr", _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 90;BA.debugLine="public Sub CStr(o As Object) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Return \"\" & o";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _detectos() throws Exception{
try {
		Debug.PushSubsStack("DetectOS (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,827);
if (RapidSub.canDelegate("detectos")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","detectos");}
RemoteObject _os = RemoteObject.createImmutable("");
 BA.debugLineNum = 827;BA.debugLine="private Sub DetectOS As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 828;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
Debug.ShouldStop(134217728);
_os = utilidades.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("os.name")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"toLowerCase");Debug.locals.put("os", _os);Debug.locals.put("os", _os);
 BA.debugLineNum = 829;BA.debugLine="If os.Contains(\"win\") Then";
Debug.ShouldStop(268435456);
if (_os.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("win"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 830;BA.debugLine="Return \"windows\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("windows");
 }else 
{ BA.debugLineNum = 831;BA.debugLine="Else If os.Contains(\"mac\") Then";
Debug.ShouldStop(1073741824);
if (_os.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("mac"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 832;BA.debugLine="Return \"mac\"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString("mac");
 }else {
 BA.debugLineNum = 834;BA.debugLine="Return \"linux\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("linux");
 }}
;
 BA.debugLineNum = 836;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dimensionespantalla() throws Exception{
try {
		Debug.PushSubsStack("DimensionesPantalla (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,10);
if (RapidSub.canDelegate("dimensionespantalla")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","dimensionespantalla");}
RemoteObject _mdim = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 10;BA.debugLine="Sub DimensionesPantalla As Map";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim mDim As Map";
Debug.ShouldStop(1024);
_mdim = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDim", _mdim);
 BA.debugLineNum = 12;BA.debugLine="mDim.Initialize";
Debug.ShouldStop(2048);
_mdim.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="mDim.Put(\"X\",fx.PrimaryScreen.MaxX - fx.PrimarySc";
Debug.ShouldStop(4096);
_mdim.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("X"))),(Object)((RemoteObject.solve(new RemoteObject[] {utilidades._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxX"),utilidades._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinX")}, "-",1, 0))));
 BA.debugLineNum = 14;BA.debugLine="mDim.Put(\"Y\",fx.PrimaryScreen.MaxY - fx.PrimarySc";
Debug.ShouldStop(8192);
_mdim.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Y"))),(Object)((RemoteObject.solve(new RemoteObject[] {utilidades._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMaxY"),utilidades._fx.runMethod(false,"getPrimaryScreen").runMethod(true,"getMinY")}, "-",1, 0))));
 BA.debugLineNum = 15;BA.debugLine="Return mDim";
Debug.ShouldStop(16384);
if (true) return _mdim;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eliminarduplicadostablasqlite(RemoteObject _msql,RemoteObject _nombretabla) throws Exception{
try {
		Debug.PushSubsStack("EliminarDuplicadosTablaSQLite (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1198);
if (RapidSub.canDelegate("eliminarduplicadostablasqlite")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","eliminarduplicadostablasqlite", _msql, _nombretabla);}
Debug.locals.put("mSQL", _msql);
Debug.locals.put("NombreTabla", _nombretabla);
 BA.debugLineNum = 1198;BA.debugLine="Sub EliminarDuplicadosTablaSQLite(mSQL As SQL,Nomb";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1199;BA.debugLine="mSQL.ExecNonQuery($\" delete from ${NombreTabla} w";
Debug.ShouldStop(16384);
_msql.runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("delete from "),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombretabla))),RemoteObject.createImmutable(" where RowID in\n"),RemoteObject.createImmutable("(Select RowID from "),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombretabla))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("where EXISTS\n"),RemoteObject.createImmutable("(Select 1 from "),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombretabla))),RemoteObject.createImmutable(" t2\n"),RemoteObject.createImmutable("where "),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombretabla))),RemoteObject.createImmutable(".NumTarifa=t2.NumTarifa\n"),RemoteObject.createImmutable("And "),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombretabla))),RemoteObject.createImmutable(".ROWID>t2.ROWID))")))));
 BA.debugLineNum = 1206;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enviaremailsolicitudpermisoobjetoapp(RemoteObject _objeto) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailSolicitudPermisoObjetoApp (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,776);
if (RapidSub.canDelegate("enviaremailsolicitudpermisoobjetoapp")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","enviaremailsolicitudpermisoobjetoapp", _objeto);}
ResumableSub_EnviarEmailSolicitudPermisoObjetoApp rsub = new ResumableSub_EnviarEmailSolicitudPermisoObjetoApp(null,_objeto);
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
public static class ResumableSub_EnviarEmailSolicitudPermisoObjetoApp extends BA.ResumableSub {
public ResumableSub_EnviarEmailSolicitudPermisoObjetoApp(b4j.docU.utilidades parent,RemoteObject _objeto) {
this.parent = parent;
this._objeto = _objeto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _objeto;
RemoteObject _smtp = RemoteObject.declareNull("anywheresoftware.b4a.net.SMTPWrapper");
RemoteObject _sendemail = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailSolicitudPermisoObjetoApp (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,776);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Objeto", _objeto);
 BA.debugLineNum = 777;BA.debugLine="Dim SMTP As SMTP";
Debug.ShouldStop(256);
_smtp = RemoteObject.createNew ("anywheresoftware.b4a.net.SMTPWrapper");Debug.locals.put("SMTP", _smtp);
 BA.debugLineNum = 778;BA.debugLine="SMTP.Initialize(Main.DatosConfiguracionAplicacion";
Debug.ShouldStop(512);
_smtp.runVoidMethod ("Initialize",(Object)(parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"ServidorEnvioEmail" /*RemoteObject*/ )),(Object)(parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"PuertoEnvioEmail" /*RemoteObject*/ )),(Object)(parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"DireccionEnvioEmail" /*RemoteObject*/ )),(Object)(parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"PasswordEnvioEmail" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("SMTP")));
 BA.debugLineNum = 780;BA.debugLine="SMTP.StartTLSMode = True";
Debug.ShouldStop(2048);
_smtp.runMethod(true,"setStartTLSMode",parent.__c.getField(true,"True"));
 BA.debugLineNum = 781;BA.debugLine="SMTP.UseSSL = True 'Gmail requires SSL.";
Debug.ShouldStop(4096);
_smtp.runMethod(true,"setUseSSL",parent.__c.getField(true,"True"));
 BA.debugLineNum = 782;BA.debugLine="If Main.DatosConfiguracionAplicacion.EmailDesarro";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 19;
if (RemoteObject.solveBoolean("!",parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"EmailDesarrollador1" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("!",parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"EmailDesarrollador2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 18;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 783;BA.debugLine="If Main.DatosConfiguracionAplicacion.EmailDesarr";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"EmailDesarrollador1" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 784;BA.debugLine="SMTP.To.Add(Main.DatosConfiguracionAplicacion.E";
Debug.ShouldStop(32768);
_smtp.runMethod(false,"getTo").runVoidMethod ("Add",(Object)((parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"EmailDesarrollador1" /*RemoteObject*/ ))));
 if (true) break;
;
 BA.debugLineNum = 787;BA.debugLine="If Main.DatosConfiguracionAplicacion.EmailDesarr";
Debug.ShouldStop(262144);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"EmailDesarrollador2" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 788;BA.debugLine="SMTP.To.Add(Main.DatosConfiguracionAplicacion.E";
Debug.ShouldStop(524288);
_smtp.runMethod(false,"getTo").runVoidMethod ("Add",(Object)((parent._main._datosconfiguracionaplicacion /*RemoteObject*/ .getField(true,"EmailDesarrollador2" /*RemoteObject*/ ))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 791;BA.debugLine="SMTP.Subject = \"Solicitud permiso Usuario \" & Ma";
Debug.ShouldStop(4194304);
_smtp.runMethod(true,"setSubject",RemoteObject.concat(RemoteObject.createImmutable("Solicitud permiso Usuario "),parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ ),RemoteObject.createImmutable(" aplicación: "),parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(" modulo: "),_objeto));
 BA.debugLineNum = 792;BA.debugLine="SMTP.Body = $\" 		Aplicación ${Main.NombreAplicac";
Debug.ShouldStop(8388608);
_smtp.runMethod(true,"setBody",(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Aplicación "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._nombreaplicacion /*RemoteObject*/ ))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Versión "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._version /*RemoteObject*/ ))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dispositivo"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._datosusuario /*RemoteObject*/ .getField(true,"Dispositivo" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		NombreUsuarioWindows"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Modulo "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objeto))),RemoteObject.createImmutable("}\n"),RemoteObject.createImmutable("		"))));
 BA.debugLineNum = 804;BA.debugLine="Dim SendEmail As Object =SMTP.Send";
Debug.ShouldStop(8);
_sendemail = _smtp.runMethod(false,"Send",utilidades.ba);Debug.locals.put("SendEmail", _sendemail);Debug.locals.put("SendEmail", _sendemail);
 BA.debugLineNum = 805;BA.debugLine="Wait For (SendEmail) SMTP_MessageSent(Success As";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","smtp_messagesent", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "enviaremailsolicitudpermisoobjetoapp"), _sendemail);
this.state = 20;
return;
case 20:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 806;BA.debugLine="If Success Then";
Debug.ShouldStop(32);
if (true) break;

case 11:
//if
this.state = 16;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 808;BA.debugLine="Log(\"Error enviando email solicitud permiso\")";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","84915232",RemoteObject.createImmutable("Error enviando email solicitud permiso"),0);
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 if (true) break;

case 19:
//C
this.state = -1;
;
 BA.debugLineNum = 814;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _smtp_messagesent(RemoteObject _success) throws Exception{
}
public static RemoteObject  _enviarmensajehttppa(RemoteObject _senderaccount,RemoteObject _toaccounts,RemoteObject _ccaccounts,RemoteObject _ccoaccounts,RemoteObject _subject,RemoteObject _body) throws Exception{
try {
		Debug.PushSubsStack("EnviarMensajeHttpPA (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1402);
if (RapidSub.canDelegate("enviarmensajehttppa")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","enviarmensajehttppa", _senderaccount, _toaccounts, _ccaccounts, _ccoaccounts, _subject, _body);}
ResumableSub_EnviarMensajeHttpPA rsub = new ResumableSub_EnviarMensajeHttpPA(null,_senderaccount,_toaccounts,_ccaccounts,_ccoaccounts,_subject,_body);
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
public static class ResumableSub_EnviarMensajeHttpPA extends BA.ResumableSub {
public ResumableSub_EnviarMensajeHttpPA(b4j.docU.utilidades parent,RemoteObject _senderaccount,RemoteObject _toaccounts,RemoteObject _ccaccounts,RemoteObject _ccoaccounts,RemoteObject _subject,RemoteObject _body) {
this.parent = parent;
this._senderaccount = _senderaccount;
this._toaccounts = _toaccounts;
this._ccaccounts = _ccaccounts;
this._ccoaccounts = _ccoaccounts;
this._subject = _subject;
this._body = _body;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _senderaccount;
RemoteObject _toaccounts;
RemoteObject _ccaccounts;
RemoteObject _ccoaccounts;
RemoteObject _subject;
RemoteObject _body;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jgen = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _sjson = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarMensajeHttpPA (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1402);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("SenderAccount", _senderaccount);
Debug.locals.put("ToAccounts", _toaccounts);
Debug.locals.put("CCAccounts", _ccaccounts);
Debug.locals.put("CCOAccounts", _ccoaccounts);
Debug.locals.put("Subject", _subject);
Debug.locals.put("Body", _body);
 BA.debugLineNum = 1404;BA.debugLine="Wait For(CargaDatosConfiguracionHttpRequestEnvioC";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "enviarmensajehttppa"), _cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1405;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1406;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1407;BA.debugLine="Return \"ERROR\"";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("ERROR")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1409;BA.debugLine="Dim mData0 As Map=mRes.Get(\"mData0\")";
Debug.ShouldStop(1);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mData0")))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 1410;BA.debugLine="Dim Link As String=mData0.Get(\"Link\")";
Debug.ShouldStop(2);
_link = BA.ObjectToString(_mdata0.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Link")))));Debug.locals.put("Link", _link);Debug.locals.put("Link", _link);
 BA.debugLineNum = 1412;BA.debugLine="Dim mData As Map";
Debug.ShouldStop(8);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1413;BA.debugLine="mData.Initialize";
Debug.ShouldStop(16);
_mdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 1414;BA.debugLine="mData.Put(\"Remitente\",SenderAccount)";
Debug.ShouldStop(32);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Remitente"))),(Object)((_senderaccount)));
 BA.debugLineNum = 1415;BA.debugLine="mData.Put(\"Destinatario\",ToAccounts)";
Debug.ShouldStop(64);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Destinatario"))),(Object)((_toaccounts)));
 BA.debugLineNum = 1416;BA.debugLine="mData.Put(\"CC\",CCAccounts)";
Debug.ShouldStop(128);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CC"))),(Object)((_ccaccounts)));
 BA.debugLineNum = 1417;BA.debugLine="mData.Put(\"CCO\",CCOAccounts)";
Debug.ShouldStop(256);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CCO"))),(Object)((_ccoaccounts)));
 BA.debugLineNum = 1418;BA.debugLine="mData.Put(\"Asunto\",Subject)";
Debug.ShouldStop(512);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Asunto"))),(Object)((_subject)));
 BA.debugLineNum = 1419;BA.debugLine="mData.Put(\"CuerpoMensaje\",Body)";
Debug.ShouldStop(1024);
_mdata.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("CuerpoMensaje"))),(Object)((_body)));
 BA.debugLineNum = 1422;BA.debugLine="Dim jGEn As JSONGenerator";
Debug.ShouldStop(8192);
_jgen = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jGEn", _jgen);
 BA.debugLineNum = 1423;BA.debugLine="jGEn.Initialize(mData)";
Debug.ShouldStop(16384);
_jgen.runVoidMethod ("Initialize",(Object)(_mdata));
 BA.debugLineNum = 1424;BA.debugLine="Dim sJSON As String=jGEn.ToString";
Debug.ShouldStop(32768);
_sjson = _jgen.runMethod(true,"ToString");Debug.locals.put("sJSON", _sjson);Debug.locals.put("sJSON", _sjson);
 BA.debugLineNum = 1426;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(131072);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1427;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,utilidades.ba,(Object)(BA.ObjectToString("")),(Object)(utilidades.getObject()));
 BA.debugLineNum = 1429;BA.debugLine="job.PostString(Link,sJSON)";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_link),(Object)(_sjson));
 BA.debugLineNum = 1430;BA.debugLine="job.GetRequest.SetContentType(\"application/JSON\")";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/JSON")));
 BA.debugLineNum = 1432;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "enviarmensajehttppa"), (_job));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1434;BA.debugLine="If j.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 5:
//if
this.state = 10;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1435;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","87208993",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1436;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","87208994",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1437;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(268435456);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1438;BA.debugLine="j.Release";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1439;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1442;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(2);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1443;BA.debugLine="j.Release";
Debug.ShouldStop(4);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1444;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1446;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _escapefield(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,839);
if (RapidSub.canDelegate("escapefield")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","escapefield", _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 839;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="Return \"[\" & f & \"]\"";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("["),_f,RemoteObject.createImmutable("]"));
 BA.debugLineNum = 841;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esdouble(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("EsDouble (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,916);
if (RapidSub.canDelegate("esdouble")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","esdouble", _s);}
RemoteObject _numdouble = RemoteObject.createImmutable(0);
Debug.locals.put("s", _s);
 BA.debugLineNum = 916;BA.debugLine="Sub EsDouble(s As String) As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 917;BA.debugLine="If IsNumber(s)=False Then Return False";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",utilidades.__c.runMethod(true,"IsNumber",(Object)(_s)),utilidades.__c.getField(true,"False"))) { 
if (true) return utilidades.__c.getField(true,"False");};
 BA.debugLineNum = 918;BA.debugLine="s=asJO(Me).RunMethod(\"TextoSinNotacionCientifica\"";
Debug.ShouldStop(2097152);
_s = BA.ObjectToString(_asjo(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), utilidades.getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("TextoSinNotacionCientifica")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_s)}))));Debug.locals.put("s", _s);
 BA.debugLineNum = 919;BA.debugLine="If EsFraccional(s) Then";
Debug.ShouldStop(4194304);
if (_esfraccional(_s).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 920;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 921;BA.debugLine="Dim NumDouble As Double=s";
Debug.ShouldStop(16777216);
_numdouble = BA.numberCast(double.class, _s);Debug.locals.put("NumDouble", _numdouble);Debug.locals.put("NumDouble", _numdouble);
 BA.debugLineNum = 922;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return utilidades.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e8.toString()); BA.debugLineNum = 924;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
utilidades.__c.runVoidMethod ("LogImpl","85373960",BA.ObjectToString(utilidades.__c.runMethod(false,"LastException",utilidades.ba)),0);
 BA.debugLineNum = 925;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return utilidades.__c.getField(true,"False");
 };
 }else {
 BA.debugLineNum = 928;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return utilidades.__c.getField(true,"False");
 };
 BA.debugLineNum = 930;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esfloat(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("EsFloat (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,932);
if (RapidSub.canDelegate("esfloat")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","esfloat", _s);}
RemoteObject _numdouble = RemoteObject.createImmutable(0f);
Debug.locals.put("s", _s);
 BA.debugLineNum = 932;BA.debugLine="Sub EsFloat(s As String) As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 933;BA.debugLine="If IsNumber(s)=False Then Return False";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",utilidades.__c.runMethod(true,"IsNumber",(Object)(_s)),utilidades.__c.getField(true,"False"))) { 
if (true) return utilidades.__c.getField(true,"False");};
 BA.debugLineNum = 934;BA.debugLine="s=asJO(Me).RunMethod(\"TextoSinNotacionCientifica\"";
Debug.ShouldStop(32);
_s = BA.ObjectToString(_asjo(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), utilidades.getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("TextoSinNotacionCientifica")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_s)}))));Debug.locals.put("s", _s);
 BA.debugLineNum = 936;BA.debugLine="If EsFraccional(s) Then";
Debug.ShouldStop(128);
if (_esfraccional(_s).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 937;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 938;BA.debugLine="Dim NumDouble As Float=s";
Debug.ShouldStop(512);
_numdouble = BA.numberCast(float.class, _s);Debug.locals.put("NumDouble", _numdouble);Debug.locals.put("NumDouble", _numdouble);
 BA.debugLineNum = 939;BA.debugLine="Return True";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return utilidades.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e8.toString()); BA.debugLineNum = 941;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
utilidades.__c.runVoidMethod ("LogImpl","85439497",BA.ObjectToString(utilidades.__c.runMethod(false,"LastException",utilidades.ba)),0);
 BA.debugLineNum = 942;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return utilidades.__c.getField(true,"False");
 };
 }else {
 BA.debugLineNum = 945;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) return utilidades.__c.getField(true,"False");
 };
 BA.debugLineNum = 947;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esfraccional(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("EsFraccional (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,911);
if (RapidSub.canDelegate("esfraccional")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","esfraccional", _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 911;BA.debugLine="Sub EsFraccional(s As String) As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 912;BA.debugLine="Return IsNumber(s) And Regex.IsMatch(\"^-?(0|[1-9]";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",utilidades.__c.runMethod(true,"IsNumber",(Object)(_s))) && RemoteObject.solveBoolean(".",utilidades.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$")),(Object)(_s))));
 BA.debugLineNum = 914;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esinteger(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("EsInteger (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,896);
if (RapidSub.canDelegate("esinteger")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","esinteger", _s);}
RemoteObject _sint = RemoteObject.createImmutable(0);
Debug.locals.put("s", _s);
 BA.debugLineNum = 896;BA.debugLine="Sub EsInteger(s As String) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 897;BA.debugLine="If IsNumber(s) And Regex.IsMatch(\"^-?(0|[1-9]\\d*)";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",utilidades.__c.runMethod(true,"IsNumber",(Object)(_s))) && RemoteObject.solveBoolean(".",utilidades.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("^-?(0|[1-9]\\d*)$")),(Object)(_s)))) { 
 BA.debugLineNum = 898;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 899;BA.debugLine="Dim sInt As Int=s";
Debug.ShouldStop(4);
_sint = BA.numberCast(int.class, _s);Debug.locals.put("sInt", _sint);Debug.locals.put("sInt", _sint);
 BA.debugLineNum = 900;BA.debugLine="Return True";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return utilidades.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e6.toString()); BA.debugLineNum = 902;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
utilidades.__c.runVoidMethod ("LogImpl","85242886",BA.ObjectToString(utilidades.__c.runMethod(false,"LastException",utilidades.ba)),0);
 BA.debugLineNum = 903;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return utilidades.__c.getField(true,"False");
 };
 }else {
 BA.debugLineNum = 906;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) return utilidades.__c.getField(true,"False");
 };
 BA.debugLineNum = 908;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eslong(RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("EsLong (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,957);
if (RapidSub.canDelegate("eslong")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","eslong", _s);}
RemoteObject _numlong = RemoteObject.createImmutable(0L);
Debug.locals.put("s", _s);
 BA.debugLineNum = 957;BA.debugLine="Sub EsLong(s As String) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 958;BA.debugLine="If EsInteger(s) Then";
Debug.ShouldStop(536870912);
if (_esinteger(_s).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 959;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 960;BA.debugLine="Dim Numlong As Long=s";
Debug.ShouldStop(-2147483648);
_numlong = BA.numberCast(long.class, _s);Debug.locals.put("Numlong", _numlong);Debug.locals.put("Numlong", _numlong);
 BA.debugLineNum = 961;BA.debugLine="Return True";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return utilidades.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e6.toString()); BA.debugLineNum = 963;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
utilidades.__c.runVoidMethod ("LogImpl","85505030",BA.ObjectToString(utilidades.__c.runMethod(false,"LastException",utilidades.ba)),0);
 BA.debugLineNum = 964;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) return utilidades.__c.getField(true,"False");
 };
 }else {
 BA.debugLineNum = 967;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return utilidades.__c.getField(true,"False");
 };
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fileexistdirassets(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("FileExistDirAssets (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1229);
if (RapidSub.canDelegate("fileexistdirassets")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fileexistdirassets", _filename);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1229;BA.debugLine="Private Sub FileExistDirAssets(FileName As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1231;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(16384);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1232;BA.debugLine="r.Target = Me";
Debug.ShouldStop(32768);
_r.setField ("Target",utilidades.getObject());
 BA.debugLineNum = 1233;BA.debugLine="r.Target = r.RunMethod(\"getClass\")";
Debug.ShouldStop(65536);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getClass"))));
 BA.debugLineNum = 1234;BA.debugLine="Dim In As InputStream = r.RunMethod2(\"getResource";
Debug.ShouldStop(131072);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_in = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper"), _r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getResourceAsStream")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/Files/"),_filename)),(Object)(RemoteObject.createImmutable("java.lang.String"))));Debug.locals.put("In", _in);Debug.locals.put("In", _in);
 BA.debugLineNum = 1235;BA.debugLine="If In.IsInitialized = False Then Return False";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_in.runMethod(true,"IsInitialized"),utilidades.__c.getField(true,"False"))) { 
if (true) return utilidades.__c.getField(true,"False");};
 BA.debugLineNum = 1236;BA.debugLine="In.Close";
Debug.ShouldStop(524288);
_in.runVoidMethod ("Close");
 BA.debugLineNum = 1237;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return utilidades.__c.getField(true,"True");
 BA.debugLineNum = 1238;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillimagetoview(RemoteObject _bmp,RemoteObject _imageview) throws Exception{
try {
		Debug.PushSubsStack("FillImageToView (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1346);
if (RapidSub.canDelegate("fillimagetoview")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fillimagetoview", _bmp, _imageview);}
RemoteObject _bmpratio = RemoteObject.createImmutable(0f);
RemoteObject _viewratio = RemoteObject.createImmutable(0f);
RemoteObject _newheight = RemoteObject.createImmutable(0);
RemoteObject _newwidth = RemoteObject.createImmutable(0);
RemoteObject _scale = RemoteObject.createImmutable(0f);
Debug.locals.put("bmp", _bmp);
Debug.locals.put("ImageView", _imageview);
 BA.debugLineNum = 1346;BA.debugLine="Sub FillImageToView(bmp As B4XBitmap, ImageView As";
Debug.ShouldStop(2);
 BA.debugLineNum = 1347;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
Debug.ShouldStop(4);
_bmpratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("bmpRatio", _bmpratio);Debug.locals.put("bmpRatio", _bmpratio);
 BA.debugLineNum = 1348;BA.debugLine="Dim viewRatio As Float = ImageView.Width / ImageV";
Debug.ShouldStop(8);
_viewratio = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_imageview.runMethod(true,"getWidth"),_imageview.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("viewRatio", _viewratio);Debug.locals.put("viewRatio", _viewratio);
 BA.debugLineNum = 1349;BA.debugLine="If viewRatio > bmpRatio Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 1350;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
Debug.ShouldStop(32);
_newheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_viewratio}, "/",0, 0));Debug.locals.put("NewHeight", _newheight);Debug.locals.put("NewHeight", _newheight);
 BA.debugLineNum = 1351;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2";
Debug.ShouldStop(64);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_newheight,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getWidth"))),(Object)(_newheight));Debug.locals.put("bmp", _bmp);
 }else 
{ BA.debugLineNum = 1352;BA.debugLine="Else if viewRatio < bmpRatio Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",_viewratio,BA.numberCast(double.class, _bmpratio))) { 
 BA.debugLineNum = 1353;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
Debug.ShouldStop(256);
_newwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_viewratio}, "*",0, 0));Debug.locals.put("NewWidth", _newwidth);Debug.locals.put("NewWidth", _newwidth);
 BA.debugLineNum = 1354;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0,";
Debug.ShouldStop(512);
_bmp = _bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),_newwidth,RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(_newwidth),(Object)(BA.numberCast(int.class, _bmp.runMethod(true,"getHeight"))));Debug.locals.put("bmp", _bmp);
 }}
;
 BA.debugLineNum = 1356;BA.debugLine="Dim scale As Float = 1";
Debug.ShouldStop(2048);
_scale = BA.numberCast(float.class, 1);Debug.locals.put("scale", _scale);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 1360;BA.debugLine="ImageView.SetBitmap(bmp.Resize(ImageView.Width *";
Debug.ShouldStop(32768);
_imageview.runVoidMethod ("SetBitmap",(Object)((_bmp.runMethod(false,"Resize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_imageview.runMethod(true,"getWidth"),_scale}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_imageview.runMethod(true,"getHeight"),_scale}, "*",0, 0))),(Object)(utilidades.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 1361;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findnexttime(RemoteObject _times) throws Exception{
try {
		Debug.PushSubsStack("FindNextTime (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1497);
if (RapidSub.canDelegate("findnexttime")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","findnexttime", _times);}
RemoteObject _st = RemoteObject.createImmutable(0);
Debug.locals.put("Times", _times);
 BA.debugLineNum = 1497;BA.debugLine="Sub FindNextTime(Times As List) As Long";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1498;BA.debugLine="Times.Sort(True)";
Debug.ShouldStop(33554432);
_times.runVoidMethod ("Sort",(Object)(utilidades.__c.getField(true,"True")));
 BA.debugLineNum = 1499;BA.debugLine="For Each st As Double In Times";
Debug.ShouldStop(67108864);
{
final RemoteObject group2 = _times;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_st = BA.numberCast(double.class, group2.runMethod(false,"Get",index2));Debug.locals.put("st", _st);
Debug.locals.put("st", _st);
 BA.debugLineNum = 1500;BA.debugLine="If SetHours(st) > DateTime.Now Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_sethours(_st),utilidades.__c.getField(false,"DateTime").runMethod(true,"getNow"))) { 
 BA.debugLineNum = 1501;BA.debugLine="Return SetHours(st)";
Debug.ShouldStop(268435456);
if (true) return _sethours(_st);
 };
 }
}Debug.locals.put("st", _st);
;
 BA.debugLineNum = 1504;BA.debugLine="Return DateTime.Add(SetHours(Times.Get(0)), 0, 0,";
Debug.ShouldStop(-2147483648);
if (true) return utilidades.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_sethours(BA.numberCast(double.class, _times.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 1505;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finduserdocumentsfolder() throws Exception{
try {
		Debug.PushSubsStack("FindUserDocumentsFolder (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,817);
if (RapidSub.canDelegate("finduserdocumentsfolder")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","finduserdocumentsfolder");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _fs = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 817;BA.debugLine="public Sub FindUserDocumentsFolder As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 818;BA.debugLine="If DetectOS = \"windows\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_detectos(),BA.ObjectToString("windows"))) { 
 BA.debugLineNum = 819;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(262144);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 820;BA.debugLine="Dim fs As JavaObject = jo.InitializeStatic(\"java";
Debug.ShouldStop(524288);
_fs = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_fs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("javax.swing.filechooser.FileSystemView"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFileSystemView")),(Object)((utilidades.__c.getField(false,"Null")))));Debug.locals.put("fs", _fs);Debug.locals.put("fs", _fs);
 BA.debugLineNum = 821;BA.debugLine="Return fs.RunMethodJO(\"getDefaultDirectory\", Nul";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString(_fs.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDefaultDirectory")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPath")),(Object)((utilidades.__c.getField(false,"Null")))));
 }else {
 BA.debugLineNum = 823;BA.debugLine="Return GetSystemProperty(\"user.home\", \"\") & \"/Do";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(utilidades.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("/Documents"));
 };
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnull(RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNull (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,49);
if (RapidSub.canDelegate("fixnull")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fixnull", _sobj);}
RemoteObject _svalue = RemoteObject.createImmutable("");
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 49;BA.debugLine="public Sub FixNull(sObj As Object) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim sValue As String";
Debug.ShouldStop(131072);
_svalue = RemoteObject.createImmutable("");Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 51;BA.debugLine="If sObj = Null Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 52;BA.debugLine="sValue = \"\"";
Debug.ShouldStop(524288);
_svalue = BA.ObjectToString("");Debug.locals.put("sValue", _svalue);
 }else {
 BA.debugLineNum = 54;BA.debugLine="sValue = CStr(sObj)";
Debug.ShouldStop(2097152);
_svalue = _cstr(_sobj);Debug.locals.put("sValue", _svalue);
 };
 BA.debugLineNum = 56;BA.debugLine="sValue = sValue.Replace(\"NULL\",\"\").Replace(\"null\"";
Debug.ShouldStop(8388608);
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString("NULL")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("null")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 57;BA.debugLine="Return sValue";
Debug.ShouldStop(16777216);
if (true) return _svalue;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnulldouble(RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNullDouble (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,60);
if (RapidSub.canDelegate("fixnulldouble")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fixnulldouble", _sobj);}
RemoteObject _dvalue = RemoteObject.createImmutable(0);
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 60;BA.debugLine="public Sub FixNullDouble(sObj As Object) As Double";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim dValue As Double";
Debug.ShouldStop(268435456);
_dvalue = RemoteObject.createImmutable(0);Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 62;BA.debugLine="If sObj = Null Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 63;BA.debugLine="dValue = 0";
Debug.ShouldStop(1073741824);
_dvalue = BA.numberCast(double.class, 0);Debug.locals.put("dValue", _dvalue);
 }else {
 BA.debugLineNum = 65;BA.debugLine="dValue = CDbl(sObj)";
Debug.ShouldStop(1);
_dvalue = _cdbl(_sobj);Debug.locals.put("dValue", _dvalue);
 };
 BA.debugLineNum = 67;BA.debugLine="Return dValue";
Debug.ShouldStop(4);
if (true) return _dvalue;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnullint(RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNullInt (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,70);
if (RapidSub.canDelegate("fixnullint")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fixnullint", _sobj);}
RemoteObject _dvalue = RemoteObject.createImmutable(0);
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 70;BA.debugLine="public Sub FixNullInt(sObj As Object) As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim dValue As Int";
Debug.ShouldStop(64);
_dvalue = RemoteObject.createImmutable(0);Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 72;BA.debugLine="If sObj = Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 73;BA.debugLine="dValue = 0";
Debug.ShouldStop(256);
_dvalue = BA.numberCast(int.class, 0);Debug.locals.put("dValue", _dvalue);
 }else {
 BA.debugLineNum = 75;BA.debugLine="dValue = CInt(sObj)";
Debug.ShouldStop(1024);
_dvalue = _cint(_sobj);Debug.locals.put("dValue", _dvalue);
 };
 BA.debugLineNum = 77;BA.debugLine="Return dValue";
Debug.ShouldStop(4096);
if (true) return _dvalue;
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixnulllong(RemoteObject _sobj) throws Exception{
try {
		Debug.PushSubsStack("FixNullLong (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,80);
if (RapidSub.canDelegate("fixnulllong")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fixnulllong", _sobj);}
RemoteObject _dvalue = RemoteObject.createImmutable(0L);
Debug.locals.put("sObj", _sobj);
 BA.debugLineNum = 80;BA.debugLine="public Sub FixNullLong(sObj As Object) As Long";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim dValue As Long";
Debug.ShouldStop(65536);
_dvalue = RemoteObject.createImmutable(0L);Debug.locals.put("dValue", _dvalue);
 BA.debugLineNum = 82;BA.debugLine="If sObj = Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("n",_sobj)) { 
 BA.debugLineNum = 83;BA.debugLine="dValue = 0";
Debug.ShouldStop(262144);
_dvalue = BA.numberCast(long.class, 0);Debug.locals.put("dValue", _dvalue);
 }else {
 BA.debugLineNum = 85;BA.debugLine="dValue = CLng(sObj)";
Debug.ShouldStop(1048576);
_dvalue = _clng(_sobj);Debug.locals.put("dValue", _dvalue);
 };
 BA.debugLineNum = 87;BA.debugLine="Return dValue";
Debug.ShouldStop(4194304);
if (true) return _dvalue;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fontawesometobitmap(RemoteObject _text,RemoteObject _fontsize,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("FontAwesomeToBitmap (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,971);
if (RapidSub.canDelegate("fontawesometobitmap")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","fontawesometobitmap", _text, _fontsize, _color);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 971;BA.debugLine="Sub FontAwesomeToBitmap (Text As String, FontSize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 972;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(2048);
utilidades._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 973;BA.debugLine="Dim p As Pane = xui.CreatePanel(\"\")";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), utilidades._xui.runMethod(false,"CreatePanel",utilidades.ba,(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 974;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, FontSize+2dip, FontS";
Debug.ShouldStop(8192);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_fontsize,utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_fontsize,utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)));
 BA.debugLineNum = 975;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(16384);
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 976;BA.debugLine="cvs1.Initialize(p)";
Debug.ShouldStop(32768);
_cvs1.runVoidMethod ("Initialize",utilidades.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()));
 BA.debugLineNum = 977;BA.debugLine="Dim fnt As B4XFont = xui.CreateFontAwesome(FontSi";
Debug.ShouldStop(65536);
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_fnt = utilidades._xui.runMethod(false,"CreateFontAwesome",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 978;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, fnt)";
Debug.ShouldStop(131072);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 979;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.ShouldStop(262144);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 980;BA.debugLine="cvs1.DrawText(Text, cvs1.TargetRect.CenterX, Base";
Debug.ShouldStop(524288);
_cvs1.runVoidMethod ("DrawText",(Object)(_text),(Object)(BA.numberCast(double.class, _cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterX"))),(Object)(BA.numberCast(double.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 981;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.ShouldStop(1048576);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 982;BA.debugLine="cvs1.Release";
Debug.ShouldStop(2097152);
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 983;BA.debugLine="Return b";
Debug.ShouldStop(4194304);
if (true) return _b;
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatonumerico(RemoteObject _numero,RemoteObject _minintegers,RemoteObject _maxfracciones) throws Exception{
try {
		Debug.PushSubsStack("FormatoNumerico (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,150);
if (RapidSub.canDelegate("formatonumerico")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","formatonumerico", _numero, _minintegers, _maxfracciones);}
RemoteObject _formatter = RemoteObject.declareNull("b4j.docU.b4xformatter");
Debug.locals.put("Numero", _numero);
Debug.locals.put("MinIntegers", _minintegers);
Debug.locals.put("MaxFracciones", _maxfracciones);
 BA.debugLineNum = 150;BA.debugLine="Public Sub FormatoNumerico(Numero As Double, MinIn";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Dim formatter As B4XFormatter";
Debug.ShouldStop(4194304);
_formatter = RemoteObject.createNew ("b4j.docU.b4xformatter");Debug.locals.put("formatter", _formatter);
 BA.debugLineNum = 152;BA.debugLine="formatter.Initialize";
Debug.ShouldStop(8388608);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_initialize" /*RemoteObject*/ ,utilidades.ba);
 BA.debugLineNum = 153;BA.debugLine="formatter.GetDefaultFormat.MinimumIntegers = MinI";
Debug.ShouldStop(16777216);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumIntegers" /*RemoteObject*/ ,_minintegers);
 BA.debugLineNum = 154;BA.debugLine="formatter.GetDefaultFormat.MaximumFractions = Max";
Debug.ShouldStop(33554432);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MaximumFractions" /*RemoteObject*/ ,_maxfracciones);
 BA.debugLineNum = 155;BA.debugLine="formatter.GetDefaultFormat.DecimalPoint=\",\"";
Debug.ShouldStop(67108864);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("DecimalPoint" /*RemoteObject*/ ,BA.ObjectToString(","));
 BA.debugLineNum = 156;BA.debugLine="Return formatter.Format(Numero)";
Debug.ShouldStop(134217728);
if (true) return _formatter.runClassMethod (b4j.docU.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(_numero));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatonumerico2(RemoteObject _numero,RemoteObject _minintegers,RemoteObject _maxfracciones,RemoteObject _minfracciones,RemoteObject _usaragrupacion) throws Exception{
try {
		Debug.PushSubsStack("FormatoNumerico2 (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,161);
if (RapidSub.canDelegate("formatonumerico2")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","formatonumerico2", _numero, _minintegers, _maxfracciones, _minfracciones, _usaragrupacion);}
RemoteObject _formatter = RemoteObject.declareNull("b4j.docU.b4xformatter");
Debug.locals.put("Numero", _numero);
Debug.locals.put("MinIntegers", _minintegers);
Debug.locals.put("MaxFracciones", _maxfracciones);
Debug.locals.put("MinFracciones", _minfracciones);
Debug.locals.put("UsarAgrupacion", _usaragrupacion);
 BA.debugLineNum = 161;BA.debugLine="Public Sub FormatoNumerico2(Numero As Double, MinI";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim formatter As B4XFormatter";
Debug.ShouldStop(2);
_formatter = RemoteObject.createNew ("b4j.docU.b4xformatter");Debug.locals.put("formatter", _formatter);
 BA.debugLineNum = 163;BA.debugLine="formatter.Initialize";
Debug.ShouldStop(4);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_initialize" /*RemoteObject*/ ,utilidades.ba);
 BA.debugLineNum = 164;BA.debugLine="formatter.GetDefaultFormat.MinimumIntegers = MinI";
Debug.ShouldStop(8);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumIntegers" /*RemoteObject*/ ,_minintegers);
 BA.debugLineNum = 165;BA.debugLine="formatter.GetDefaultFormat.MaximumFractions = Max";
Debug.ShouldStop(16);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MaximumFractions" /*RemoteObject*/ ,_maxfracciones);
 BA.debugLineNum = 166;BA.debugLine="formatter.GetDefaultFormat.MinimumFractions = Min";
Debug.ShouldStop(32);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumFractions" /*RemoteObject*/ ,_minfracciones);
 BA.debugLineNum = 167;BA.debugLine="formatter.GetDefaultFormat.DecimalPoint=\",\"";
Debug.ShouldStop(64);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("DecimalPoint" /*RemoteObject*/ ,BA.ObjectToString(","));
 BA.debugLineNum = 168;BA.debugLine="If UsarAgrupacion Then";
Debug.ShouldStop(128);
if (_usaragrupacion.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 169;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\".\"";
Debug.ShouldStop(256);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString("."));
 }else {
 BA.debugLineNum = 171;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\"\"";
Debug.ShouldStop(1024);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 BA.debugLineNum = 173;BA.debugLine="Return formatter.Format(Numero)";
Debug.ShouldStop(4096);
if (true) return _formatter.runClassMethod (b4j.docU.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(_numero));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatonumerico3(RemoteObject _numero,RemoteObject _minintegers,RemoteObject _maxfracciones,RemoteObject _minfracciones,RemoteObject _usaragrupacion,RemoteObject _prefijo,RemoteObject _sufijo) throws Exception{
try {
		Debug.PushSubsStack("FormatoNumerico3 (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,179);
if (RapidSub.canDelegate("formatonumerico3")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","formatonumerico3", _numero, _minintegers, _maxfracciones, _minfracciones, _usaragrupacion, _prefijo, _sufijo);}
RemoteObject _formatter = RemoteObject.declareNull("b4j.docU.b4xformatter");
Debug.locals.put("Numero", _numero);
Debug.locals.put("MinIntegers", _minintegers);
Debug.locals.put("MaxFracciones", _maxfracciones);
Debug.locals.put("MinFracciones", _minfracciones);
Debug.locals.put("UsarAgrupacion", _usaragrupacion);
Debug.locals.put("Prefijo", _prefijo);
Debug.locals.put("Sufijo", _sufijo);
 BA.debugLineNum = 179;BA.debugLine="Public Sub FormatoNumerico3(Numero As Double, MinI";
Debug.ShouldStop(262144);
 BA.debugLineNum = 181;BA.debugLine="Dim formatter As B4XFormatter";
Debug.ShouldStop(1048576);
_formatter = RemoteObject.createNew ("b4j.docU.b4xformatter");Debug.locals.put("formatter", _formatter);
 BA.debugLineNum = 182;BA.debugLine="formatter.Initialize";
Debug.ShouldStop(2097152);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_initialize" /*RemoteObject*/ ,utilidades.ba);
 BA.debugLineNum = 183;BA.debugLine="formatter.GetDefaultFormat.MinimumIntegers = MinI";
Debug.ShouldStop(4194304);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumIntegers" /*RemoteObject*/ ,_minintegers);
 BA.debugLineNum = 184;BA.debugLine="formatter.GetDefaultFormat.MaximumFractions = Max";
Debug.ShouldStop(8388608);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MaximumFractions" /*RemoteObject*/ ,_maxfracciones);
 BA.debugLineNum = 185;BA.debugLine="formatter.GetDefaultFormat.MinimumFractions = Min";
Debug.ShouldStop(16777216);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("MinimumFractions" /*RemoteObject*/ ,_minfracciones);
 BA.debugLineNum = 186;BA.debugLine="formatter.GetDefaultFormat.DecimalPoint=\",\"";
Debug.ShouldStop(33554432);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("DecimalPoint" /*RemoteObject*/ ,BA.ObjectToString(","));
 BA.debugLineNum = 187;BA.debugLine="If UsarAgrupacion Then";
Debug.ShouldStop(67108864);
if (_usaragrupacion.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\".\"";
Debug.ShouldStop(134217728);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString("."));
 }else {
 BA.debugLineNum = 190;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\"\"";
Debug.ShouldStop(536870912);
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("GroupingCharacter" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 BA.debugLineNum = 192;BA.debugLine="If Prefijo<>\"\" Then formatter.GetDefaultFormat.Pr";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_prefijo,BA.ObjectToString(""))) { 
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("Prefix" /*RemoteObject*/ ,_prefijo);};
 BA.debugLineNum = 193;BA.debugLine="If Sufijo<>\"\" Then formatter.GetDefaultFormat.Pos";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_sufijo,BA.ObjectToString(""))) { 
_formatter.runClassMethod (b4j.docU.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("Postfix" /*RemoteObject*/ ,_sufijo);};
 BA.debugLineNum = 194;BA.debugLine="Return formatter.Format(Numero)";
Debug.ShouldStop(2);
if (true) return _formatter.runClassMethod (b4j.docU.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(_numero));
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generaruuidv4() throws Exception{
try {
		Debug.PushSubsStack("GenerarUUIDv4 (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1164);
if (RapidSub.canDelegate("generaruuidv4")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","generaruuidv4");}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stp = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1164;BA.debugLine="public Sub GenerarUUIDv4 As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1165;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4096);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1166;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1167;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(16384);
{
final RemoteObject group3 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = BA.numberCast(int.class, group3.getArrayElement(false,RemoteObject.createImmutable(index3)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 1168;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 1169;BA.debugLine="For n = 1 To stp";
Debug.ShouldStop(65536);
{
final int step5 = 1;
final int limit5 = _stp.<Integer>get().intValue();
_n = 1 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 1170;BA.debugLine="Dim c As Int = Rnd(0, 16)";
Debug.ShouldStop(131072);
_c = utilidades.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1171;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",_c,BA.numberCast(double.class, 10))) { 
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(48)}, "+",1, 1);Debug.locals.put("c", _c);}
else {
_c = RemoteObject.solve(new RemoteObject[] {_c,RemoteObject.createImmutable(55)}, "+",1, 1);Debug.locals.put("c", _c);};
 BA.debugLineNum = 1172;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 19))) { 
_c = utilidades.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("8"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 1173;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 14))) { 
_c = utilidades.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(RemoteObject.createImmutable("4"))));Debug.locals.put("c", _c);};
 BA.debugLineNum = 1174;BA.debugLine="sb.Append(Chr(c))";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(utilidades.__c.runMethod(true,"Chr",(Object)(_c)))));
 }
}Debug.locals.put("n", _n);
;
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 1177;BA.debugLine="Return sb.ToString.ToLowerCase";
Debug.ShouldStop(16777216);
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"toLowerCase");
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_hash(RemoteObject _text,RemoteObject _algorithm) throws Exception{
try {
		Debug.PushSubsStack("Get_Hash (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1117);
if (RapidSub.canDelegate("get_hash")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","get_hash", _text, _algorithm);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _md = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
RemoteObject _data = null;
RemoteObject _encrypted = null;
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("Text", _text);
Debug.locals.put("algorithm", _algorithm);
 BA.debugLineNum = 1117;BA.debugLine="Sub Get_Hash(Text As String, algorithm As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1118;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(536870912);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1119;BA.debugLine="Dim md As MessageDigest";
Debug.ShouldStop(1073741824);
_md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");Debug.locals.put("md", _md);
 BA.debugLineNum = 1121;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(1);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 1122;BA.debugLine="Dim encrypted() As Byte";
Debug.ShouldStop(2);
_encrypted = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("encrypted", _encrypted);
 BA.debugLineNum = 1124;BA.debugLine="data = bc.StringToBytes(Text, \"UTF-8\")";
Debug.ShouldStop(8);
_data = _bc.runMethod(false,"StringToBytes",(Object)(_text),(Object)(RemoteObject.createImmutable("UTF-8")));Debug.locals.put("data", _data);
 BA.debugLineNum = 1125;BA.debugLine="encrypted = md.GetMessageDigest(data, algorithm)";
Debug.ShouldStop(16);
_encrypted = _md.runMethod(false,"GetMessageDigest",(Object)(_data),(Object)(_algorithm));Debug.locals.put("encrypted", _encrypted);
 BA.debugLineNum = 1126;BA.debugLine="Dim res As String = bc.HexFromBytes(encrypted)";
Debug.ShouldStop(32);
_res = _bc.runMethod(true,"HexFromBytes",(Object)(_encrypted));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1127;BA.debugLine="Return (res)";
Debug.ShouldStop(64);
if (true) return (_res);
 BA.debugLineNum = 1128;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfiletype(RemoteObject _filepath) throws Exception{
try {
		Debug.PushSubsStack("GetFileType (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,296);
if (RapidSub.canDelegate("getfiletype")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","getfiletype", _filepath);}
RemoteObject _mediatype = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _filetype = RemoteObject.createImmutable("");
Debug.locals.put("FilePath", _filepath);
 BA.debugLineNum = 296;BA.debugLine="Sub GetFileType(FilePath As String) As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="Dim MediaType As JavaObject";
Debug.ShouldStop(256);
_mediatype = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("MediaType", _mediatype);
 BA.debugLineNum = 298;BA.debugLine="MediaType.InitializeStatic(\"com.google.common.net";
Debug.ShouldStop(512);
_mediatype.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.google.common.net.MediaType")));
 BA.debugLineNum = 300;BA.debugLine="Dim fileType As String = asJO(Me).RunMethod(\"getT";
Debug.ShouldStop(2048);
_filetype = BA.ObjectToString(_asjo(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), utilidades.getObject())).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_filepath)}))));Debug.locals.put("fileType", _filetype);Debug.locals.put("fileType", _filetype);
 BA.debugLineNum = 302;BA.debugLine="Log(fileType)";
Debug.ShouldStop(8192);
utilidades.__c.runVoidMethod ("LogImpl","84128774",_filetype,0);
 BA.debugLineNum = 304;BA.debugLine="If fileType<>\"null\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_filetype,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 305;BA.debugLine="If MediaType.RunMethodJO(\"parse\",Array(fileType)";
Debug.ShouldStop(65536);
if (BA.ObjectToBoolean(_mediatype.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_filetype)}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("is")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_mediatype.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("ANY_IMAGE_TYPE")))})))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 306;BA.debugLine="Log(\"Image file\")";
Debug.ShouldStop(131072);
utilidades.__c.runVoidMethod ("LogImpl","84128778",RemoteObject.createImmutable("Image file"),0);
 }else 
{ BA.debugLineNum = 307;BA.debugLine="else if MediaType.RunMethodJO(\"parse\",Array(file";
Debug.ShouldStop(262144);
if (BA.ObjectToBoolean(_mediatype.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_filetype)}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("is")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_mediatype.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("ANY_VIDEO_TYPE")))})))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 308;BA.debugLine="Log(\"Video file\")";
Debug.ShouldStop(524288);
utilidades.__c.runVoidMethod ("LogImpl","84128780",RemoteObject.createImmutable("Video file"),0);
 }else 
{ BA.debugLineNum = 309;BA.debugLine="else if MediaType.RunMethodJO(\"parse\",Array(file";
Debug.ShouldStop(1048576);
if (BA.ObjectToBoolean(_mediatype.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_filetype)}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("is")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_mediatype.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("ANY_TEXT_TYPE")))})))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 310;BA.debugLine="Log(\"Text file\")";
Debug.ShouldStop(2097152);
utilidades.__c.runVoidMethod ("LogImpl","84128782",RemoteObject.createImmutable("Text file"),0);
 }else {
 BA.debugLineNum = 312;BA.debugLine="Log(\"File is  : \"&MediaType.RunMethod(\"parse\",A";
Debug.ShouldStop(8388608);
utilidades.__c.runVoidMethod ("LogImpl","84128784",RemoteObject.concat(RemoteObject.createImmutable("File is  : "),_mediatype.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_filetype)})))),0);
 }}}
;
 };
 BA.debugLineNum = 315;BA.debugLine="Return fileType";
Debug.ShouldStop(67108864);
if (true) return _filetype;
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimagebytes(RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetImageBytes (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1033);
if (RapidSub.canDelegate("getimagebytes")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","getimagebytes", _dir, _filename);}
RemoteObject _bytes = null;
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 1033;BA.debugLine="Sub GetImageBytes(Dir As String, Filename As Strin";
Debug.ShouldStop(256);
 BA.debugLineNum = 1034;BA.debugLine="Dim bytes() As Byte = Bit.InputStreamToBytes(File";
Debug.ShouldStop(512);
_bytes = utilidades.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((utilidades.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject())));Debug.locals.put("bytes", _bytes);Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 1035;BA.debugLine="Return bytes";
Debug.ShouldStop(1024);
if (true) return _bytes;
 BA.debugLineNum = 1036;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnumbers(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("GetNumbers (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,95);
if (RapidSub.canDelegate("getnumbers")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","getnumbers", _value);}
RemoteObject _strcnt = RemoteObject.createImmutable(0);
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _master = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
 BA.debugLineNum = 95;BA.debugLine="public Sub GetNumbers(value As String) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim strCnt As Int";
Debug.ShouldStop(-2147483648);
_strcnt = RemoteObject.createImmutable(0);Debug.locals.put("strCnt", _strcnt);
 BA.debugLineNum = 97;BA.debugLine="Dim str As String";
Debug.ShouldStop(1);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 98;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 99;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="Dim master As String = \"0123456789-.\"";
Debug.ShouldStop(8);
_master = BA.ObjectToString("0123456789-.");Debug.locals.put("master", _master);Debug.locals.put("master", _master);
 BA.debugLineNum = 101;BA.debugLine="For strCnt = 0 To value.Length - 1";
Debug.ShouldStop(16);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_value.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_strcnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _strcnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _strcnt.<Integer>get().intValue() >= limit6) ;_strcnt = RemoteObject.createImmutable((int)(0 + _strcnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("strCnt", _strcnt);
 BA.debugLineNum = 102;BA.debugLine="str = value.CharAt(strCnt)";
Debug.ShouldStop(32);
_str = BA.ObjectToString(_value.runMethod(true,"charAt",(Object)(_strcnt)));Debug.locals.put("str", _str);
 BA.debugLineNum = 103;BA.debugLine="If master.IndexOf(str) >= 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",_master.runMethod(true,"indexOf",(Object)(_str)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 104;BA.debugLine="sb.Append(str)";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(_str));
 };
 }
}Debug.locals.put("strCnt", _strcnt);
;
 BA.debugLineNum = 107;BA.debugLine="Return sb.tostring";
Debug.ShouldStop(1024);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsha1md5string(RemoteObject _hstring) throws Exception{
try {
		Debug.PushSubsStack("GetSHA1MD5String (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1130);
if (RapidSub.canDelegate("getsha1md5string")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","getsha1md5string", _hstring);}
RemoteObject _md = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
RemoteObject _bytecon = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _passwordhash = null;
RemoteObject _passwordhash2 = null;
RemoteObject _md5string = RemoteObject.createImmutable("");
RemoteObject _sha1string = RemoteObject.createImmutable("");
Debug.locals.put("hString", _hstring);
 BA.debugLineNum = 1130;BA.debugLine="Sub GetSHA1MD5String(hString As String) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 1132;BA.debugLine="Dim md As MessageDigest";
Debug.ShouldStop(2048);
_md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");Debug.locals.put("md", _md);
 BA.debugLineNum = 1133;BA.debugLine="Dim ByteCon As ByteConverter";
Debug.ShouldStop(4096);
_bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("ByteCon", _bytecon);
 BA.debugLineNum = 1134;BA.debugLine="Dim passwordhash() As Byte";
Debug.ShouldStop(8192);
_passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("passwordhash", _passwordhash);
 BA.debugLineNum = 1135;BA.debugLine="Dim passwordhash2() As Byte";
Debug.ShouldStop(16384);
_passwordhash2 = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("passwordhash2", _passwordhash2);
 BA.debugLineNum = 1136;BA.debugLine="passwordhash = md.GetMessageDigest(hString.GetByt";
Debug.ShouldStop(32768);
_passwordhash = _md.runMethod(false,"GetMessageDigest",(Object)(_hstring.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));Debug.locals.put("passwordhash", _passwordhash);
 BA.debugLineNum = 1137;BA.debugLine="Dim md5string As String";
Debug.ShouldStop(65536);
_md5string = RemoteObject.createImmutable("");Debug.locals.put("md5string", _md5string);
 BA.debugLineNum = 1138;BA.debugLine="md5string = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(131072);
_md5string = _bytecon.runMethod(true,"HexFromBytes",(Object)(_passwordhash));Debug.locals.put("md5string", _md5string);
 BA.debugLineNum = 1139;BA.debugLine="md5string = md5string.ToLowerCase";
Debug.ShouldStop(262144);
_md5string = _md5string.runMethod(true,"toLowerCase");Debug.locals.put("md5string", _md5string);
 BA.debugLineNum = 1140;BA.debugLine="Log(md5string)";
Debug.ShouldStop(524288);
utilidades.__c.runVoidMethod ("LogImpl","86225930",_md5string,0);
 BA.debugLineNum = 1141;BA.debugLine="passwordhash2 = md.GetMessageDigest(md5string.Get";
Debug.ShouldStop(1048576);
_passwordhash2 = _md.runMethod(false,"GetMessageDigest",(Object)(_md5string.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("SHA-1")));Debug.locals.put("passwordhash2", _passwordhash2);
 BA.debugLineNum = 1142;BA.debugLine="Dim SHA1string As String";
Debug.ShouldStop(2097152);
_sha1string = RemoteObject.createImmutable("");Debug.locals.put("SHA1string", _sha1string);
 BA.debugLineNum = 1143;BA.debugLine="SHA1string = ByteCon.HexFromBytes(passwordhash2)";
Debug.ShouldStop(4194304);
_sha1string = _bytecon.runMethod(true,"HexFromBytes",(Object)(_passwordhash2));Debug.locals.put("SHA1string", _sha1string);
 BA.debugLineNum = 1144;BA.debugLine="SHA1string = SHA1string.ToLowerCase";
Debug.ShouldStop(8388608);
_sha1string = _sha1string.runMethod(true,"toLowerCase");Debug.locals.put("SHA1string", _sha1string);
 BA.debugLineNum = 1145;BA.debugLine="Log(SHA1string)";
Debug.ShouldStop(16777216);
utilidades.__c.runVoidMethod ("LogImpl","86225935",_sha1string,0);
 BA.debugLineNum = 1146;BA.debugLine="Return SHA1string";
Debug.ShouldStop(33554432);
if (true) return _sha1string;
 BA.debugLineNum = 1147;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablepragma(RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("GetTablePragma (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,274);
if (RapidSub.canDelegate("gettablepragma")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","gettablepragma", _sql, _tablename);}
RemoteObject _lstfields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tbquery = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _columnparmsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 274;BA.debugLine="Sub GetTablePragma(SQL As SQL,TableName As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Private lstFields As List";
Debug.ShouldStop(262144);
_lstfields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstFields", _lstfields);
 BA.debugLineNum = 276;BA.debugLine="lstFields.Initialize";
Debug.ShouldStop(524288);
_lstfields.runVoidMethod ("Initialize");
 BA.debugLineNum = 277;BA.debugLine="Private TBQuery As String";
Debug.ShouldStop(1048576);
_tbquery = RemoteObject.createImmutable("");Debug.locals.put("TBQuery", _tbquery);
 BA.debugLineNum = 278;BA.debugLine="TBQuery = \"PRAGMA table_info(\" & TableName & \")\"";
Debug.ShouldStop(2097152);
_tbquery = RemoteObject.concat(RemoteObject.createImmutable("PRAGMA table_info("),_tablename,RemoteObject.createImmutable(")"));Debug.locals.put("TBQuery", _tbquery);
 BA.debugLineNum = 279;BA.debugLine="Dim rs As ResultSet=SQL.ExecQuery(TBQuery)";
Debug.ShouldStop(4194304);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = _sql.runMethod(false,"ExecQuery",(Object)(_tbquery));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 280;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8388608);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 281;BA.debugLine="Dim ColumnParmsMap As Map";
Debug.ShouldStop(16777216);
_columnparmsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ColumnParmsMap", _columnparmsmap);
 BA.debugLineNum = 282;BA.debugLine="ColumnParmsMap.Initialize";
Debug.ShouldStop(33554432);
_columnparmsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 283;BA.debugLine="For i=0 To rs.ColumnCount-1";
Debug.ShouldStop(67108864);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 285;BA.debugLine="Log (\"     \" & i & \": \" &  rs.GetColumnName(i)";
Debug.ShouldStop(268435456);
utilidades.__c.runVoidMethod ("LogImpl","84063243",RemoteObject.concat(RemoteObject.createImmutable("     "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(": "),_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("->"),_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 287;BA.debugLine="ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetS";
Debug.ShouldStop(1073741824);
_columnparmsmap.runVoidMethod ("Put",(Object)((_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 289;BA.debugLine="lstFields.Add(ColumnParmsMap)";
Debug.ShouldStop(1);
_lstfields.runVoidMethod ("Add",(Object)((_columnparmsmap.getObject())));
 }
;
 BA.debugLineNum = 291;BA.debugLine="rs.Close";
Debug.ShouldStop(4);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 292;BA.debugLine="Return lstFields";
Debug.ShouldStop(8);
if (true) return _lstfields;
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertarmapssolocamposcoincidentes(RemoteObject _msql,RemoteObject _tablename,RemoteObject _listofmaps) throws Exception{
try {
		Debug.PushSubsStack("InsertarMapsSoloCamposCoincidentes (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,347);
if (RapidSub.canDelegate("insertarmapssolocamposcoincidentes")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","insertarmapssolocamposcoincidentes", _msql, _tablename, _listofmaps);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lstmapscampostabla = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstnombrescampostabla = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcampostabla = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombrecampo = RemoteObject.createImmutable("");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i2 = 0;
RemoteObject _nombrekey = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("mSQL", _msql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 347;BA.debugLine="Sub InsertarMapsSoloCamposCoincidentes(mSQL As SQL";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 348;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(134217728);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 350;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 351;BA.debugLine="LogColor(\"ERROR InsertarMapsSoloCamposCoincident";
Debug.ShouldStop(1073741824);
utilidades.__c.runVoidMethod ("LogImpl","84325380",BA.ObjectToString("ERROR InsertarMapsSoloCamposCoincidentes, hay al menos 1 mapa repetido"),utilidades._xui.getField(true,"Color_Red"));
 BA.debugLineNum = 352;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 355;BA.debugLine="Dim lstMapsCamposTabla As List=GetTablePragma(mSQ";
Debug.ShouldStop(4);
_lstmapscampostabla = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstmapscampostabla = _gettablepragma(_msql,_tablename);Debug.locals.put("lstMapsCamposTabla", _lstmapscampostabla);Debug.locals.put("lstMapsCamposTabla", _lstmapscampostabla);
 BA.debugLineNum = 356;BA.debugLine="Dim lstNombresCamposTabla As List";
Debug.ShouldStop(8);
_lstnombrescampostabla = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNombresCamposTabla", _lstnombrescampostabla);
 BA.debugLineNum = 357;BA.debugLine="lstNombresCamposTabla.Initialize";
Debug.ShouldStop(16);
_lstnombrescampostabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 358;BA.debugLine="For Each mCamposTabla As Map In lstMapsCamposTabl";
Debug.ShouldStop(32);
_mcampostabla = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group9 = _lstmapscampostabla;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_mcampostabla = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group9.runMethod(false,"Get",index9));Debug.locals.put("mCamposTabla", _mcampostabla);
Debug.locals.put("mCamposTabla", _mcampostabla);
 BA.debugLineNum = 359;BA.debugLine="Dim NombreCampo As String=mCamposTabla.Get(\"name";
Debug.ShouldStop(64);
_nombrecampo = BA.ObjectToString(_mcampostabla.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("NombreCampo", _nombrecampo);Debug.locals.put("NombreCampo", _nombrecampo);
 BA.debugLineNum = 360;BA.debugLine="lstNombresCamposTabla.Add(NombreCampo)";
Debug.ShouldStop(128);
_lstnombrescampostabla.runVoidMethod ("Add",(Object)((_nombrecampo)));
 }
}Debug.locals.put("mCamposTabla", _mcampostabla);
;
 BA.debugLineNum = 362;BA.debugLine="mSQL.BeginTransaction";
Debug.ShouldStop(512);
_msql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 363;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 364;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(2048);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step15 > 0 && _i1 <= limit15) || (step15 < 0 && _i1 >= limit15) ;_i1 = ((int)(0 + _i1 + step15))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 365;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 366;BA.debugLine="columns.Initialize";
Debug.ShouldStop(8192);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="values.Initialize";
Debug.ShouldStop(16384);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 368;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(32768);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 369;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(65536);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 370;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 371;BA.debugLine="Dim m As Map";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 372;BA.debugLine="m = ListOfMaps.Get(i1)";
Debug.ShouldStop(524288);
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 373;BA.debugLine="For i2 = 0 To m.Size - 1";
Debug.ShouldStop(1048576);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i2 = 0 ;
for (;(step24 > 0 && _i2 <= limit24) || (step24 < 0 && _i2 >= limit24) ;_i2 = ((int)(0 + _i2 + step24))  ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 374;BA.debugLine="Dim NombreKey As String=m.GetKeyAt(i2)";
Debug.ShouldStop(2097152);
_nombrekey = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("NombreKey", _nombrekey);Debug.locals.put("NombreKey", _nombrekey);
 BA.debugLineNum = 375;BA.debugLine="If lstNombresCamposTabla.IndexOf(NombreKey)>-1";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_lstnombrescampostabla.runMethod(true,"IndexOf",(Object)((_nombrekey))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 376;BA.debugLine="Dim col As String";
Debug.ShouldStop(8388608);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 377;BA.debugLine="Dim value As Object";
Debug.ShouldStop(16777216);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 378;BA.debugLine="col = m.GetKeyAt(i2)";
Debug.ShouldStop(33554432);
_col = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("col", _col);
 BA.debugLineNum = 379;BA.debugLine="value = m.GetValueAt(i2)";
Debug.ShouldStop(67108864);
_value = _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i2)));Debug.locals.put("value", _value);
 BA.debugLineNum = 380;BA.debugLine="If i2 > 0 And columns.Length>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i2),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_columns.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 381;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(268435456);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 382;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(536870912);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 384;BA.debugLine="columns.Append(\"[\").Append(col).Append(\"]\")";
Debug.ShouldStop(-2147483648);
_columns.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(_col)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]")));
 BA.debugLineNum = 385;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(1);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 386;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(2);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }else {
 BA.debugLineNum = 389;BA.debugLine="LogColor(\"AVISO InsertarMapsSoloCamposCoincid";
Debug.ShouldStop(16);
utilidades.__c.runVoidMethod ("LogImpl","84325418",RemoteObject.concat(RemoteObject.createImmutable("AVISO InsertarMapsSoloCamposCoincidentes: Campo "),_nombrekey,RemoteObject.createImmutable(" no existe en tabla "),_tablename,RemoteObject.createImmutable("...¿error?")),utilidades._xui.getField(true,"Color_Magenta"));
 };
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 393;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 394;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i1),BA.numberCast(double.class, 0))) { 
utilidades.__c.runVoidMethod ("LogImpl","84325423",RemoteObject.concat(RemoteObject.createImmutable("InsertMaps (first query out of "),_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable("): "),_sb.runMethod(true,"ToString")),0);};
 BA.debugLineNum = 395;BA.debugLine="mSQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(1024);
_msql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 397;BA.debugLine="mSQL.TransactionSuccessful";
Debug.ShouldStop(4096);
_msql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e48) {
			BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e48.toString()); BA.debugLineNum = 400;BA.debugLine="LogColor(\"ERROR InsertarMapsSoloCamposCoincident";
Debug.ShouldStop(32768);
utilidades.__c.runVoidMethod ("LogImpl","84325429",RemoteObject.concat(RemoteObject.createImmutable("ERROR InsertarMapsSoloCamposCoincidentes "),utilidades.__c.runMethod(false,"LastException",utilidades.ba)),utilidades._xui.getField(true,"Color_Red"));
 BA.debugLineNum = 401;BA.debugLine="mSQL.Rollback";
Debug.ShouldStop(65536);
_msql.runVoidMethod ("Rollback");
 };
 BA.debugLineNum = 403;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iscellinternaldateformatted(RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("isCellInternalDateFormatted (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1256);
if (RapidSub.canDelegate("iscellinternaldateformatted")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","iscellinternaldateformatted", _cell);}
RemoteObject _jodateformated = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 1256;BA.debugLine="Sub isCellInternalDateFormatted(Cell As PoiCell) A";
Debug.ShouldStop(128);
 BA.debugLineNum = 1257;BA.debugLine="Dim JODateFormated As JavaObject";
Debug.ShouldStop(256);
_jodateformated = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JODateFormated", _jodateformated);
 BA.debugLineNum = 1258;BA.debugLine="JODateFormated.InitializeStatic(\"org.apache.poi.s";
Debug.ShouldStop(512);
_jodateformated.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("org.apache.poi.ss.usermodel.DateUtil")));
 BA.debugLineNum = 1259;BA.debugLine="Return JODateFormated.RunMethod(\"isCellInternalDa";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToBoolean(_jodateformated.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isCellInternalDateFormatted")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 1260;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isogetweekofyear(RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("isoGetWeekOfYear (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1381);
if (RapidSub.canDelegate("isogetweekofyear")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","isogetweekofyear", _ticks);}
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _firstday = RemoteObject.createImmutable(0L);
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1381;BA.debugLine="Sub isoGetWeekOfYear(ticks As Long) As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 1382;BA.debugLine="Dim offset As Int =  0";
Debug.ShouldStop(32);
_offset = BA.numberCast(int.class, 0);Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 1383;BA.debugLine="Dim FirstDay As Long  = DateUtils.SetDate(DateTim";
Debug.ShouldStop(64);
_firstday = utilidades._dateutils.runMethod(true,"_setdate",(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDay", _firstday);Debug.locals.put("FirstDay", _firstday);
 BA.debugLineNum = 1384;BA.debugLine="If DateTime.GetDayOfWeek(FirstDay) >5 Then ' is T";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",utilidades.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstday)),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1385;BA.debugLine="Do While(DateTime.GetDayOfWeek(FirstDay) <> 1) '";
Debug.ShouldStop(256);
while ((RemoteObject.solveBoolean("!",utilidades.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstday)),BA.numberCast(double.class, 1)))) {
 BA.debugLineNum = 1386;BA.debugLine="FirstDay=DateTime.Add (FirstDay,0,0,1)";
Debug.ShouldStop(512);
_firstday = utilidades.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_firstday),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDay", _firstday);
 BA.debugLineNum = 1387;BA.debugLine="offset=offset-1";
Debug.ShouldStop(1024);
_offset = RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("offset", _offset);
 }
;
 }else {
 BA.debugLineNum = 1390;BA.debugLine="Do While(DateTime.GetDayOfWeek(FirstDay) <> 1) '";
Debug.ShouldStop(8192);
while ((RemoteObject.solveBoolean("!",utilidades.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstday)),BA.numberCast(double.class, 1)))) {
 BA.debugLineNum = 1391;BA.debugLine="FirstDay=DateTime.Add (FirstDay,0,0,-1)";
Debug.ShouldStop(16384);
_firstday = utilidades.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_firstday),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("FirstDay", _firstday);
 BA.debugLineNum = 1392;BA.debugLine="offset=offset+1";
Debug.ShouldStop(32768);
_offset = RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("offset", _offset);
 }
;
 };
 BA.debugLineNum = 1395;BA.debugLine="Return Floor((DateTime.GetDayOfYear(ticks) + offs";
Debug.ShouldStop(262144);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utilidades.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {utilidades.__c.getField(false,"DateTime").runMethod(true,"GetDayOfYear",(Object)(_ticks)),_offset}, "+",1, 1)),RemoteObject.createImmutable(7)}, "/",0, 0))),RemoteObject.createImmutable(1)}, "+",1, 0));
 BA.debugLineNum = 1396;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jsontocsv(RemoteObject _s,RemoteObject _header,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("JSONtoCSV (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1263);
if (RapidSub.canDelegate("jsontocsv")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","jsontocsv", _s, _header, _delimiter);}
ResumableSub_JSONtoCSV rsub = new ResumableSub_JSONtoCSV(null,_s,_header,_delimiter);
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
public static class ResumableSub_JSONtoCSV extends BA.ResumableSub {
public ResumableSub_JSONtoCSV(b4j.docU.utilidades parent,RemoteObject _s,RemoteObject _header,RemoteObject _delimiter) {
this.parent = parent;
this._s = _s;
this._header = _header;
this._delimiter = _delimiter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _s;
RemoteObject _header;
RemoteObject _delimiter;
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _jmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lilwalker = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _fieldhascommas = RemoteObject.createImmutable(false);
RemoteObject _fieldhasquote = RemoteObject.createImmutable(false);
RemoteObject group22;
int index22;
int groupLen22;
RemoteObject group27;
int index27;
int groupLen27;
RemoteObject group35;
int index35;
int groupLen35;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JSONtoCSV (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1263);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("s", _s);
Debug.locals.put("header", _header);
Debug.locals.put("delimiter", _delimiter);
 BA.debugLineNum = 1264;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(32768);
_json = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 1265;BA.debugLine="Dim jmap As Map";
Debug.ShouldStop(65536);
_jmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("jmap", _jmap);
 BA.debugLineNum = 1266;BA.debugLine="Dim vlist As List";
Debug.ShouldStop(131072);
_vlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("vlist", _vlist);
 BA.debugLineNum = 1267;BA.debugLine="vlist.Initialize";
Debug.ShouldStop(262144);
_vlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1269;BA.debugLine="Try";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 1270;BA.debugLine="json.Initialize(s)";
Debug.ShouldStop(2097152);
_json.runVoidMethod ("Initialize",(Object)(_s));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 1272;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","86881289",parent.__c.runMethod(false,"LastException",utilidades.ba).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 1273;BA.debugLine="wait for(MsgBoxXUI(\"Error\",\"Error initializing o";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "jsontocsv"), _msgboxxui(BA.ObjectToString("Error"),RemoteObject.createImmutable("Error initializing our parser...")));
this.state = 56;
return;
case 56:
//C
this.state = 6;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1274;BA.debugLine="Return \"\"";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1277;BA.debugLine="Try";
Debug.ShouldStop(268435456);

case 6:
//try
this.state = 11;
this.catchState = 0;
this.catchState = 10;
this.state = 8;
if (true) break;

case 8:
//C
this.state = 11;
this.catchState = 10;
 BA.debugLineNum = 1278;BA.debugLine="jmap = json.NextObject";
Debug.ShouldStop(536870912);
_jmap = _json.runMethod(false,"NextObject");Debug.locals.put("jmap", _jmap);
 Debug.CheckDeviceExceptions();
if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
 BA.debugLineNum = 1280;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","86881297",parent.__c.runMethod(false,"LastException",utilidades.ba).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 1281;BA.debugLine="wait for(MsgBoxXUI(\"Error\",\"Some problem reading";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "jsontocsv"), _msgboxxui(BA.ObjectToString("Error"),RemoteObject.createImmutable("Some problem reading the json...")));
this.state = 57;
return;
case 57:
//C
this.state = 11;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 1282;BA.debugLine="Return \"\"";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
 BA.debugLineNum = 1285;BA.debugLine="vlist = jmap.Get(\"root\")";
Debug.ShouldStop(16);
_vlist = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _jmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("root")))));Debug.locals.put("vlist", _vlist);
 BA.debugLineNum = 1286;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1287;BA.debugLine="sb.Initialize";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1291;BA.debugLine="For Each lilwalker As Map In vlist";
Debug.ShouldStop(1024);
if (true) break;

case 12:
//for
this.state = 55;
_lilwalker = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group22 = _vlist;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("lilwalker", _lilwalker);
this.state = 58;
if (true) break;

case 58:
//C
this.state = 55;
if (index22 < groupLen22) {
this.state = 14;
_lilwalker = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("lilwalker", _lilwalker);}
if (true) break;

case 59:
//C
this.state = 58;
index22++;
Debug.locals.put("lilwalker", _lilwalker);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1292;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2048);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1293;BA.debugLine="If header Then";
Debug.ShouldStop(4096);
if (true) break;

case 15:
//if
this.state = 28;
if (_header.<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1294;BA.debugLine="header = False";
Debug.ShouldStop(8192);
_header = parent.__c.getField(true,"False");Debug.locals.put("header", _header);
 BA.debugLineNum = 1295;BA.debugLine="i = 0";
Debug.ShouldStop(16384);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1296;BA.debugLine="For Each key As String In lilwalker.Keys";
Debug.ShouldStop(32768);
if (true) break;

case 18:
//for
this.state = 27;
group27 = _lilwalker.runMethod(false,"Keys");
index27 = 0;
groupLen27 = group27.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("key", _key);
this.state = 60;
if (true) break;

case 60:
//C
this.state = 27;
if (index27 < groupLen27) {
this.state = 20;
_key = BA.ObjectToString(group27.runMethod(false,"Get",index27));Debug.locals.put("key", _key);}
if (true) break;

case 61:
//C
this.state = 60;
index27++;
Debug.locals.put("key", _key);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1297;BA.debugLine="If i > 0 Then sb.Append(delimiter)";
Debug.ShouldStop(65536);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
_sb.runVoidMethod ("Append",(Object)(_delimiter));
if (true) break;

case 26:
//C
this.state = 61;
;
 BA.debugLineNum = 1298;BA.debugLine="sb.Append( key )";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(_key));
 BA.debugLineNum = 1299;BA.debugLine="i = i + 1";
Debug.ShouldStop(262144);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1301;BA.debugLine="sb.Append(CRLF)";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 1304;BA.debugLine="i = 0";
Debug.ShouldStop(8388608);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1305;BA.debugLine="For Each v As String In lilwalker.Values";
Debug.ShouldStop(16777216);
if (true) break;

case 29:
//for
this.state = 54;
group35 = _lilwalker.runMethod(false,"Values");
index35 = 0;
groupLen35 = group35.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("v", _v);
this.state = 62;
if (true) break;

case 62:
//C
this.state = 54;
if (index35 < groupLen35) {
this.state = 31;
_v = BA.ObjectToString(group35.runMethod(false,"Get",index35));Debug.locals.put("v", _v);}
if (true) break;

case 63:
//C
this.state = 62;
index35++;
Debug.locals.put("v", _v);
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1306;BA.debugLine="If i > 0 Then sb.Append(delimiter)";
Debug.ShouldStop(33554432);
if (true) break;

case 32:
//if
this.state = 37;
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
this.state = 34;
;}if (true) break;

case 34:
//C
this.state = 37;
_sb.runVoidMethod ("Append",(Object)(_delimiter));
if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 1309;BA.debugLine="Dim fieldHasCommas As Boolean = False";
Debug.ShouldStop(268435456);
_fieldhascommas = parent.__c.getField(true,"False");Debug.locals.put("fieldHasCommas", _fieldhascommas);Debug.locals.put("fieldHasCommas", _fieldhascommas);
 BA.debugLineNum = 1310;BA.debugLine="Dim fieldHasQuote As Boolean = False";
Debug.ShouldStop(536870912);
_fieldhasquote = parent.__c.getField(true,"False");Debug.locals.put("fieldHasQuote", _fieldhasquote);Debug.locals.put("fieldHasQuote", _fieldhasquote);
 BA.debugLineNum = 1312;BA.debugLine="If v.Contains(delimiter) Then fieldHasCommas =";
Debug.ShouldStop(-2147483648);
if (true) break;

case 38:
//if
this.state = 43;
if (_v.runMethod(true,"contains",(Object)(_delimiter)).<Boolean>get().booleanValue()) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
_fieldhascommas = parent.__c.getField(true,"True");Debug.locals.put("fieldHasCommas", _fieldhascommas);
if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 1313;BA.debugLine="If v.Contains(QUOTE) Then fieldHasQuote = True";
Debug.ShouldStop(1);
if (true) break;

case 44:
//if
this.state = 49;
if (_v.runMethod(true,"contains",(Object)(parent.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
_fieldhasquote = parent.__c.getField(true,"True");Debug.locals.put("fieldHasQuote", _fieldhasquote);
if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 1314;BA.debugLine="v = v.Replace(QUOTE, QUOTE & QUOTE)";
Debug.ShouldStop(2);
_v = _v.runMethod(true,"replace",(Object)(parent.__c.getField(true,"QUOTE")),(Object)(RemoteObject.concat(parent.__c.getField(true,"QUOTE"),parent.__c.getField(true,"QUOTE"))));Debug.locals.put("v", _v);
 BA.debugLineNum = 1315;BA.debugLine="If fieldHasCommas Or fieldHasQuote Then";
Debug.ShouldStop(4);
if (true) break;

case 50:
//if
this.state = 53;
if (RemoteObject.solveBoolean(".",_fieldhascommas) || RemoteObject.solveBoolean(".",_fieldhasquote)) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 1316;BA.debugLine="v = QUOTE & v & QUOTE";
Debug.ShouldStop(8);
_v = RemoteObject.concat(parent.__c.getField(true,"QUOTE"),_v,parent.__c.getField(true,"QUOTE"));Debug.locals.put("v", _v);
 if (true) break;

case 53:
//C
this.state = 63;
;
 BA.debugLineNum = 1319;BA.debugLine="sb.Append(v)";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(_v));
 BA.debugLineNum = 1320;BA.debugLine="i = i + 1";
Debug.ShouldStop(128);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 if (true) break;
if (true) break;

case 54:
//C
this.state = 59;
Debug.locals.put("v", _v);
;
 BA.debugLineNum = 1322;BA.debugLine="sb.Append(CRLF)";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;
if (true) break;

case 55:
//C
this.state = -1;
Debug.locals.put("lilwalker", _lilwalker);
;
 BA.debugLineNum = 1324;BA.debugLine="Return(sb.ToString)";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((_sb.runMethod(true,"ToString"))));return;};
 BA.debugLineNum = 1325;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",utilidades.ba, e0.toString());}
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
public static RemoteObject  _logstringcreartabladesdemap(RemoteObject _tablename,RemoteObject _mapprimerregistro,RemoteObject _primarykey) throws Exception{
try {
		Debug.PushSubsStack("LogStringCrearTablaDesdeMap (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,849);
if (RapidSub.canDelegate("logstringcreartabladesdemap")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","logstringcreartabladesdemap", _tablename, _mapprimerregistro, _primarykey);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _ftype = RemoteObject.createImmutable("");
RemoteObject _svalor = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
Debug.locals.put("TableName", _tablename);
Debug.locals.put("MapPrimerRegistro", _mapprimerregistro);
Debug.locals.put("PrimaryKey", _primarykey);
 BA.debugLineNum = 849;BA.debugLine="Public Sub LogStringCrearTablaDesdeMap(TableName A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 850;BA.debugLine="If MapPrimerRegistro.IsInitialized=False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mapprimerregistro.runMethod(true,"IsInitialized"),utilidades.__c.getField(true,"False"))) { 
 BA.debugLineNum = 851;BA.debugLine="LogColor(\"******** Crear Tabla***********\",xui.C";
Debug.ShouldStop(262144);
utilidades.__c.runVoidMethod ("LogImpl","85177346",BA.ObjectToString("******** Crear Tabla***********"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 852;BA.debugLine="LogColor(\"Mapa Registro no inicializado\",xui.Col";
Debug.ShouldStop(524288);
utilidades.__c.runVoidMethod ("LogImpl","85177347",BA.ObjectToString("Mapa Registro no inicializado"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 853;BA.debugLine="LogColor(\"******** Fin Crear Tabla***********\",x";
Debug.ShouldStop(1048576);
utilidades.__c.runVoidMethod ("LogImpl","85177348",BA.ObjectToString("******** Fin Crear Tabla***********"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 854;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 856;BA.debugLine="If MapPrimerRegistro.Size=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_mapprimerregistro.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 857;BA.debugLine="LogColor(\"******** Crear Tabla***********\",xui.C";
Debug.ShouldStop(16777216);
utilidades.__c.runVoidMethod ("LogImpl","85177352",BA.ObjectToString("******** Crear Tabla***********"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 858;BA.debugLine="LogColor(\"Mapa Registro vacío\",xui.Color_Blue)";
Debug.ShouldStop(33554432);
utilidades.__c.runVoidMethod ("LogImpl","85177353",BA.ObjectToString("Mapa Registro vacío"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 859;BA.debugLine="LogColor(\"******** Fin Crear Tabla***********\",x";
Debug.ShouldStop(67108864);
utilidades.__c.runVoidMethod ("LogImpl","85177354",BA.ObjectToString("******** Fin Crear Tabla***********"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 860;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 862;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(536870912);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 863;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 864;BA.debugLine="sb.Append(\"(\")";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 865;BA.debugLine="For i = 0 To MapPrimerRegistro.Size - 1";
Debug.ShouldStop(1);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_mapprimerregistro.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 866;BA.debugLine="Dim field, ftype, sValor As String";
Debug.ShouldStop(2);
_field = RemoteObject.createImmutable("");Debug.locals.put("field", _field);
_ftype = RemoteObject.createImmutable("");Debug.locals.put("ftype", _ftype);
_svalor = RemoteObject.createImmutable("");Debug.locals.put("sValor", _svalor);
 BA.debugLineNum = 867;BA.debugLine="field = MapPrimerRegistro.GetKeyAt(i)";
Debug.ShouldStop(4);
_field = BA.ObjectToString(_mapprimerregistro.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("field", _field);
 BA.debugLineNum = 868;BA.debugLine="sValor=MapPrimerRegistro.Get(field)";
Debug.ShouldStop(8);
_svalor = BA.ObjectToString(_mapprimerregistro.runMethod(false,"Get",(Object)((_field))));Debug.locals.put("sValor", _svalor);
 BA.debugLineNum = 869;BA.debugLine="Select True";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(utilidades.__c.getField(true,"True"),_esinteger(_svalor),_eslong(_svalor),_esfraccional(_svalor))) {
case 0: {
 BA.debugLineNum = 871;BA.debugLine="ftype=DBUtils.DB_INTEGER";
Debug.ShouldStop(64);
_ftype = utilidades._dbutils._db_integer /*RemoteObject*/ ;Debug.locals.put("ftype", _ftype);
 break; }
case 1: {
 BA.debugLineNum = 873;BA.debugLine="ftype=DBUtils.DB_INTEGER";
Debug.ShouldStop(256);
_ftype = utilidades._dbutils._db_integer /*RemoteObject*/ ;Debug.locals.put("ftype", _ftype);
 break; }
case 2: {
 BA.debugLineNum = 875;BA.debugLine="ftype=DBUtils.DB_REAL";
Debug.ShouldStop(1024);
_ftype = utilidades._dbutils._db_real /*RemoteObject*/ ;Debug.locals.put("ftype", _ftype);
 break; }
default: {
 BA.debugLineNum = 877;BA.debugLine="ftype=DBUtils.DB_TEXT";
Debug.ShouldStop(4096);
_ftype = utilidades._dbutils._db_text /*RemoteObject*/ ;Debug.locals.put("ftype", _ftype);
 break; }
}
;
 BA.debugLineNum = 879;BA.debugLine="If i > 0 Then sb.Append(\", \")";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));};
 BA.debugLineNum = 880;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(_escapefield(_field))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(_ftype));
 BA.debugLineNum = 881;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_field,_primarykey)) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 883;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 884;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
Debug.ShouldStop(524288);
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),_escapefield(_tablename),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 889;BA.debugLine="LogColor(\"******** Crear Tabla***********\",xui.Co";
Debug.ShouldStop(16777216);
utilidades.__c.runVoidMethod ("LogImpl","85177384",BA.ObjectToString("******** Crear Tabla***********"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 890;BA.debugLine="LogColor(query,xui.Color_Blue)";
Debug.ShouldStop(33554432);
utilidades.__c.runVoidMethod ("LogImpl","85177385",_query,utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 891;BA.debugLine="LogColor(\"******** Fin Crear Tabla***********\",xu";
Debug.ShouldStop(67108864);
utilidades.__c.runVoidMethod ("LogImpl","85177386",BA.ObjectToString("******** Fin Crear Tabla***********"),utilidades._xui.getField(true,"Color_Blue"));
 BA.debugLineNum = 892;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _materialiconstobitmap(RemoteObject _text,RemoteObject _fontsize,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("MaterialIconsToBitmap (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,986);
if (RapidSub.canDelegate("materialiconstobitmap")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","materialiconstobitmap", _text, _fontsize, _color);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Text", _text);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 986;BA.debugLine="Sub MaterialIconsToBitmap (Text As String, FontSiz";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 987;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(67108864);
utilidades._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 988;BA.debugLine="Dim p As Pane = xui.CreatePanel(\"\")";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), utilidades._xui.runMethod(false,"CreatePanel",utilidades.ba,(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 989;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, FontSize+2dip, FontS";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_fontsize,utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_fontsize,utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)));
 BA.debugLineNum = 990;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(536870912);
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 991;BA.debugLine="cvs1.Initialize(p)";
Debug.ShouldStop(1073741824);
_cvs1.runVoidMethod ("Initialize",utilidades.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()));
 BA.debugLineNum = 992;BA.debugLine="Dim fnt As B4XFont = xui.CreateMaterialIcons(Font";
Debug.ShouldStop(-2147483648);
_fnt = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
_fnt = utilidades._xui.runMethod(false,"CreateMaterialIcons",(Object)(_fontsize));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 993;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, fnt)";
Debug.ShouldStop(1);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 994;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.ShouldStop(2);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 995;BA.debugLine="cvs1.DrawText(Text, cvs1.TargetRect.CenterX, Base";
Debug.ShouldStop(4);
_cvs1.runVoidMethod ("DrawText",(Object)(_text),(Object)(BA.numberCast(double.class, _cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterX"))),(Object)(BA.numberCast(double.class, _baseline)),(Object)(_fnt),(Object)(_color),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 996;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.ShouldStop(8);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 997;BA.debugLine="cvs1.Release";
Debug.ShouldStop(16);
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 998;BA.debugLine="Return b";
Debug.ShouldStop(32);
if (true) return _b;
 BA.debugLineNum = 999;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuremultilinetextheight(RemoteObject _font,RemoteObject _width,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("MeasureMultilineTextHeight (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1363);
if (RapidSub.canDelegate("measuremultilinetextheight")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","measuremultilinetextheight", _font, _width, _text);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Font", _font);
Debug.locals.put("Width", _width);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 1363;BA.debugLine="Sub MeasureMultilineTextHeight (Font As Font, Widt";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1364;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), utilidades.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1365;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
Debug.ShouldStop(1048576);
if (true) return BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_font.getObject()),(_text),(_width)}))));
 BA.debugLineNum = 1366;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgbox2xui(RemoteObject _titulomsg,RemoteObject _textomensaje,RemoteObject _textook,RemoteObject _textocancelar,RemoteObject _textnok,RemoteObject _imagenicono) throws Exception{
try {
		Debug.PushSubsStack("MsgBox2XUI (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1103);
if (RapidSub.canDelegate("msgbox2xui")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","msgbox2xui", _titulomsg, _textomensaje, _textook, _textocancelar, _textnok, _imagenicono);}
ResumableSub_MsgBox2XUI rsub = new ResumableSub_MsgBox2XUI(null,_titulomsg,_textomensaje,_textook,_textocancelar,_textnok,_imagenicono);
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
public static class ResumableSub_MsgBox2XUI extends BA.ResumableSub {
public ResumableSub_MsgBox2XUI(b4j.docU.utilidades parent,RemoteObject _titulomsg,RemoteObject _textomensaje,RemoteObject _textook,RemoteObject _textocancelar,RemoteObject _textnok,RemoteObject _imagenicono) {
this.parent = parent;
this._titulomsg = _titulomsg;
this._textomensaje = _textomensaje;
this._textook = _textook;
this._textocancelar = _textocancelar;
this._textnok = _textnok;
this._imagenicono = _imagenicono;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _titulomsg;
RemoteObject _textomensaje;
RemoteObject _textook;
RemoteObject _textocancelar;
RemoteObject _textnok;
RemoteObject _imagenicono;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MsgBox2XUI (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1103);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("TituloMsg", _titulomsg);
Debug.locals.put("TextoMensaje", _textomensaje);
Debug.locals.put("TextoOK", _textook);
Debug.locals.put("TextoCancelar", _textocancelar);
Debug.locals.put("TextNOK", _textnok);
Debug.locals.put("ImagenIcono", _imagenicono);
 BA.debugLineNum = 1104;BA.debugLine="If ImagenIcono.IsInitialized Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (_imagenicono.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1105;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(TextoMensaj";
Debug.ShouldStop(65536);
_msa = parent._xui.runMethod(false,"Msgbox2Async",utilidades.ba,(Object)(_textomensaje),(Object)(_titulomsg),(Object)(_textook),(Object)(_textocancelar),(Object)(_textnok),(Object)((_imagenicono.getObject())));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1106;BA.debugLine="Sleep(0)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Sleep",utilidades.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "msgbox2xui"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1108;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(TextoMensaj";
Debug.ShouldStop(524288);
_msa = parent._xui.runMethod(false,"Msgbox2Async",utilidades.ba,(Object)(_textomensaje),(Object)(_titulomsg),(Object)(_textook),(Object)(_textocancelar),(Object)(_textnok),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1109;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",utilidades.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "msgbox2xui"),BA.numberCast(int.class, 0));
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1111;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "msgbox2xui"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = -1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1113;BA.debugLine="Return rInt";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_rint));return;};
 BA.debugLineNum = 1114;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _msgboxxui(RemoteObject _titulomsg,RemoteObject _textomensaje) throws Exception{
try {
		Debug.PushSubsStack("MsgBoxXUI (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1087);
if (RapidSub.canDelegate("msgboxxui")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","msgboxxui", _titulomsg, _textomensaje);}
ResumableSub_MsgBoxXUI rsub = new ResumableSub_MsgBoxXUI(null,_titulomsg,_textomensaje);
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
public static class ResumableSub_MsgBoxXUI extends BA.ResumableSub {
public ResumableSub_MsgBoxXUI(b4j.docU.utilidades parent,RemoteObject _titulomsg,RemoteObject _textomensaje) {
this.parent = parent;
this._titulomsg = _titulomsg;
this._textomensaje = _textomensaje;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _titulomsg;
RemoteObject _textomensaje;
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MsgBoxXUI (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1087);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("TituloMsg", _titulomsg);
Debug.locals.put("TextoMensaje", _textomensaje);
 BA.debugLineNum = 1088;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(TextoMensaje,Ti";
Debug.ShouldStop(-2147483648);
_msa = parent._xui.runMethod(false,"MsgboxAsync",utilidades.ba,(Object)(_textomensaje),(Object)(_titulomsg));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1089;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "msgboxxui"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1091;BA.debugLine="Return Null";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1092;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _permisosaplicacionusuarioobjetopermiso(RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario,RemoteObject _nombreobjetopermiso) throws Exception{
try {
		Debug.PushSubsStack("PermisosAplicacionUsuarioObjetoPermiso (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,682);
if (RapidSub.canDelegate("permisosaplicacionusuarioobjetopermiso")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","permisosaplicacionusuarioobjetopermiso", _rdclinkcommandpermisos, _comandopermisos, _aplicacion, _usuario, _nombreobjetopermiso);}
ResumableSub_PermisosAplicacionUsuarioObjetoPermiso rsub = new ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso);
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
public static class ResumableSub_PermisosAplicacionUsuarioObjetoPermiso extends BA.ResumableSub {
public ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(b4j.docU.utilidades parent,RemoteObject _rdclinkcommandpermisos,RemoteObject _comandopermisos,RemoteObject _aplicacion,RemoteObject _usuario,RemoteObject _nombreobjetopermiso) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
this._nombreobjetopermiso = _nombreobjetopermiso;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.utilidades parent;
RemoteObject _rdclinkcommandpermisos;
RemoteObject _comandopermisos;
RemoteObject _aplicacion;
RemoteObject _usuario;
RemoteObject _nombreobjetopermiso;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mperm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sperm = RemoteObject.createImmutable("");
RemoteObject _permisoaplicaciontodosusuariostodosobjetos = RemoteObject.createImmutable("");
RemoteObject _permisoaplicaciontodosusuariosobjeto = RemoteObject.createImmutable("");
RemoteObject _permisoaplicacionusuariotodosobjetos = RemoteObject.createImmutable("");
RemoteObject _permisoaplicacionusuarioobjeto = RemoteObject.createImmutable("");
RemoteObject _osapp = RemoteObject.createImmutable("");
RemoteObject _osperm = RemoteObject.createImmutable("");
RemoteObject _userperm = RemoteObject.createImmutable("");
RemoteObject _objetoperm = RemoteObject.createImmutable("");
RemoteObject _tipoperm = RemoteObject.createImmutable("");
RemoteObject group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PermisosAplicacionUsuarioObjetoPermiso (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,682);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("rdcLinkCommandPermisos", _rdclinkcommandpermisos);
Debug.locals.put("ComandoPermisos", _comandopermisos);
Debug.locals.put("Aplicacion", _aplicacion);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("NombreObjetoPermiso", _nombreobjetopermiso);
 BA.debugLineNum = 683;BA.debugLine="Dim sRes As String";
Debug.ShouldStop(1024);
_sres = RemoteObject.createImmutable("");Debug.locals.put("sRes", _sres);
 BA.debugLineNum = 684;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkCommandPermisos,Comand";
Debug.ShouldStop(2048);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_rdclinkcommandpermisos),(Object)(_comandopermisos),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_aplicacion)})),(Object)(utilidades.getObject()));
 BA.debugLineNum = 685;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", utilidades.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utilidades", "permisosaplicacionusuarioobjetopermiso"), null);
this.state = 112;
return;
case 112:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 686;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 111;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 111;
 BA.debugLineNum = 687;BA.debugLine="sRes=\"ErrConn\"";
Debug.ShouldStop(16384);
_sres = BA.ObjectToString("ErrConn");Debug.locals.put("sRes", _sres);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 689;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(65536);
if (true) break;

case 6:
//if
this.state = 110;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 110;
 BA.debugLineNum = 690;BA.debugLine="sRes=\"SinPermiso\"";
Debug.ShouldStop(131072);
_sres = BA.ObjectToString("SinPermiso");Debug.locals.put("sRes", _sres);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 692;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(524288);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 693;BA.debugLine="Dim mPerm As Map=lstReg.Get(0)";
Debug.ShouldStop(1048576);
_mperm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mperm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mPerm", _mperm);Debug.locals.put("mPerm", _mperm);
 BA.debugLineNum = 694;BA.debugLine="Dim sPerm As String=mPerm.GetValueAt(0)";
Debug.ShouldStop(2097152);
_sperm = BA.ObjectToString(_mperm.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sPerm", _sperm);Debug.locals.put("sPerm", _sperm);
 BA.debugLineNum = 695;BA.debugLine="If sPerm.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(4194304);
if (true) break;

case 11:
//if
this.state = 109;
if (_sperm.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 109;
 BA.debugLineNum = 696;BA.debugLine="sRes=\"ERROR \" & sPerm";
Debug.ShouldStop(8388608);
_sres = RemoteObject.concat(RemoteObject.createImmutable("ERROR "),_sperm);Debug.locals.put("sRes", _sres);
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 698;BA.debugLine="Dim PermisoAplicacionTodosUsuariosTodosObjetos";
Debug.ShouldStop(33554432);
_permisoaplicaciontodosusuariostodosobjetos = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionTodosUsuariosTodosObjetos", _permisoaplicaciontodosusuariostodosobjetos);
 BA.debugLineNum = 699;BA.debugLine="Dim PermisoAplicacionTodosUsuariosObjeto As St";
Debug.ShouldStop(67108864);
_permisoaplicaciontodosusuariosobjeto = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionTodosUsuariosObjeto", _permisoaplicaciontodosusuariosobjeto);
 BA.debugLineNum = 700;BA.debugLine="Dim PermisoAplicacionUsuarioTodosObjetos As St";
Debug.ShouldStop(134217728);
_permisoaplicacionusuariotodosobjetos = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionUsuarioTodosObjetos", _permisoaplicacionusuariotodosobjetos);
 BA.debugLineNum = 701;BA.debugLine="Dim PermisoAplicacionUsuarioObjeto As String";
Debug.ShouldStop(268435456);
_permisoaplicacionusuarioobjeto = RemoteObject.createImmutable("");Debug.locals.put("PermisoAplicacionUsuarioObjeto", _permisoaplicacionusuarioobjeto);
 BA.debugLineNum = 702;BA.debugLine="Dim OSApp As String";
Debug.ShouldStop(536870912);
_osapp = RemoteObject.createImmutable("");Debug.locals.put("OSApp", _osapp);
 BA.debugLineNum = 704;BA.debugLine="OSApp=\"Windows\"";
Debug.ShouldStop(-2147483648);
_osapp = BA.ObjectToString("Windows");Debug.locals.put("OSApp", _osapp);
 BA.debugLineNum = 709;BA.debugLine="For Each mPerm As Map In lstReg";
Debug.ShouldStop(16);
if (true) break;

case 16:
//for
this.state = 52;
_mperm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group22 = _lstreg;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mPerm", _mperm);
this.state = 113;
if (true) break;

case 113:
//C
this.state = 52;
if (index22 < groupLen22) {
this.state = 18;
_mperm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("mPerm", _mperm);}
if (true) break;

case 114:
//C
this.state = 113;
index22++;
Debug.locals.put("mPerm", _mperm);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 710;BA.debugLine="Dim OSPerm As String=mPerm.Get(\"OS\")";
Debug.ShouldStop(32);
_osperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("OS")))));Debug.locals.put("OSPerm", _osperm);Debug.locals.put("OSPerm", _osperm);
 BA.debugLineNum = 711;BA.debugLine="If OSPerm<>\"\" And OSPerm.ToUpperCase<>OSApp.T";
Debug.ShouldStop(64);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_osperm,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_osperm.runMethod(true,"toUpperCase"),_osapp.runMethod(true,"toUpperCase"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
this.state = 114;
if (true) break;;
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 712;BA.debugLine="Dim UserPerm As String=mPerm.Get(\"IDUsuario\")";
Debug.ShouldStop(128);
_userperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IDUsuario")))));Debug.locals.put("UserPerm", _userperm);Debug.locals.put("UserPerm", _userperm);
 BA.debugLineNum = 713;BA.debugLine="Dim ObjetoPerm As String=mPerm.Get(\"ObjetoPer";
Debug.ShouldStop(256);
_objetoperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ObjetoPermiso")))));Debug.locals.put("ObjetoPerm", _objetoperm);Debug.locals.put("ObjetoPerm", _objetoperm);
 BA.debugLineNum = 714;BA.debugLine="Dim TipoPerm As String=mPerm.Get(\"TipoPermiso";
Debug.ShouldStop(512);
_tipoperm = BA.ObjectToString(_mperm.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TipoPermiso")))));Debug.locals.put("TipoPerm", _tipoperm);Debug.locals.put("TipoPerm", _tipoperm);
 BA.debugLineNum = 716;BA.debugLine="If UserPerm<>\"\" And UserPerm.ToUpperCase<>Usu";
Debug.ShouldStop(2048);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("!",_userperm,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_userperm.runMethod(true,"toUpperCase"),_usuario.runMethod(true,"toUpperCase"))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
this.state = 114;
if (true) break;;
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 718;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";
Debug.ShouldStop(8192);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_userperm.runMethod(true,"toUpperCase"),_usuario.runMethod(true,"toUpperCase")) && RemoteObject.solveBoolean("=",_objetoperm.runMethod(true,"toUpperCase"),_nombreobjetopermiso.runMethod(true,"toUpperCase"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 719;BA.debugLine="PermisoAplicacionUsuarioObjeto=TipoPerm";
Debug.ShouldStop(16384);
_permisoaplicacionusuarioobjeto = _tipoperm;Debug.locals.put("PermisoAplicacionUsuarioObjeto", _permisoaplicacionusuarioobjeto);
 BA.debugLineNum = 721;BA.debugLine="Exit";
Debug.ShouldStop(65536);
this.state = 52;
if (true) break;
 if (true) break;
;
 BA.debugLineNum = 724;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";
Debug.ShouldStop(524288);

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_userperm.runMethod(true,"toUpperCase"),_usuario.runMethod(true,"toUpperCase")) && RemoteObject.solveBoolean("=",_objetoperm,BA.ObjectToString(""))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_permisoaplicacionusuariotodosobjetos = _tipoperm;Debug.locals.put("PermisoAplicacionUsuarioTodosObjetos", _permisoaplicacionusuariotodosobjetos);
if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 726;BA.debugLine="If ObjetoPerm.ToUpperCase=NombreObjetoPermiso";
Debug.ShouldStop(2097152);
if (true) break;

case 40:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_objetoperm.runMethod(true,"toUpperCase"),_nombreobjetopermiso.runMethod(true,"toUpperCase")) && RemoteObject.solveBoolean("=",_userperm,BA.ObjectToString(""))) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
_permisoaplicaciontodosusuariosobjeto = _tipoperm;Debug.locals.put("PermisoAplicacionTodosUsuariosObjeto", _permisoaplicaciontodosusuariosobjeto);
if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 728;BA.debugLine="If UserPerm=\"\" And ObjetoPerm=\"\" Then Permiso";
Debug.ShouldStop(8388608);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean("=",_userperm,BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_objetoperm,BA.ObjectToString(""))) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
_permisoaplicaciontodosusuariostodosobjetos = _tipoperm;Debug.locals.put("PermisoAplicacionTodosUsuariosTodosObjetos", _permisoaplicaciontodosusuariostodosobjetos);
if (true) break;

case 51:
//C
this.state = 114;
;
 if (true) break;
if (true) break;
Debug.locals.put("mPerm", _mperm);
;
 BA.debugLineNum = 733;BA.debugLine="If PermisoAplicacionTodosUsuariosTodosObjetos<";
Debug.ShouldStop(268435456);

case 52:
//if
this.state = 57;
if (RemoteObject.solveBoolean("!",_permisoaplicaciontodosusuariostodosobjetos,BA.ObjectToString(""))) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_sres = _permisoaplicaciontodosusuariostodosobjetos;Debug.locals.put("sRes", _sres);
if (true) break;

case 57:
//C
this.state = 58;
;
 BA.debugLineNum = 734;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" Th";
Debug.ShouldStop(536870912);
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("!",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString(""))) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
_sres = _permisoaplicacionusuariotodosobjetos;Debug.locals.put("sRes", _sres);
if (true) break;

case 63:
//C
this.state = 64;
;
 BA.debugLineNum = 735;BA.debugLine="If PermisoAplicacionTodosUsuariosObjeto<>\"\" Th";
Debug.ShouldStop(1073741824);
if (true) break;

case 64:
//if
this.state = 69;
if (RemoteObject.solveBoolean("!",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString(""))) { 
this.state = 66;
;}if (true) break;

case 66:
//C
this.state = 69;
_sres = _permisoaplicaciontodosusuariosobjeto;Debug.locals.put("sRes", _sres);
if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 738;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" An";
Debug.ShouldStop(2);
if (true) break;

case 70:
//if
this.state = 99;
if (RemoteObject.solveBoolean("!",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_permisoaplicacionusuariotodosobjetos,_permisoaplicaciontodosusuariosobjeto)) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 739;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"ADMI";
Debug.ShouldStop(4);
if (true) break;

case 73:
//if
this.state = 98;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("ADMIN"))) { 
this.state = 75;
}else {
this.state = 77;
}if (true) break;

case 75:
//C
this.state = 98;
 BA.debugLineNum = 740;BA.debugLine="sPerm=\"ADMIN\"";
Debug.ShouldStop(8);
_sperm = BA.ObjectToString("ADMIN");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 742;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"DEN";
Debug.ShouldStop(32);
if (true) break;

case 78:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("DENIED")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("DENIED"))) { 
this.state = 80;
}else {
this.state = 82;
}if (true) break;

case 80:
//C
this.state = 97;
 BA.debugLineNum = 743;BA.debugLine="sPerm=\"DENIED\"";
Debug.ShouldStop(64);
_sperm = BA.ObjectToString("DENIED");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 745;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R\"";
Debug.ShouldStop(256);
if (true) break;

case 83:
//if
this.state = 96;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("R")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("R"))) { 
this.state = 85;
}else {
this.state = 87;
}if (true) break;

case 85:
//C
this.state = 96;
 BA.debugLineNum = 746;BA.debugLine="sPerm=\"R\"";
Debug.ShouldStop(512);
_sperm = BA.ObjectToString("R");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 748;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R";
Debug.ShouldStop(2048);
if (true) break;

case 88:
//if
this.state = 95;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("RW")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("RW"))) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 749;BA.debugLine="sPerm=\"RW\"";
Debug.ShouldStop(4096);
_sperm = BA.ObjectToString("RW");Debug.locals.put("sPerm", _sperm);
 BA.debugLineNum = 751;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"";
Debug.ShouldStop(16384);
if (true) break;

case 91:
//if
this.state = 94;
if (RemoteObject.solveBoolean("=",_permisoaplicacionusuariotodosobjetos,BA.ObjectToString("ADMIN")) || RemoteObject.solveBoolean("=",_permisoaplicaciontodosusuariosobjeto,BA.ObjectToString("ADMIN"))) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 752;BA.debugLine="sPerm=\"ADMIN\"";
Debug.ShouldStop(32768);
_sperm = BA.ObjectToString("ADMIN");Debug.locals.put("sPerm", _sperm);
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;

case 95:
//C
this.state = 96;
;
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = 99;
;
 if (true) break;
;
 BA.debugLineNum = 759;BA.debugLine="If PermisoAplicacionUsuarioObjeto<>\"\" Then sRe";
Debug.ShouldStop(4194304);

case 99:
//if
this.state = 104;
if (RemoteObject.solveBoolean("!",_permisoaplicacionusuarioobjeto,BA.ObjectToString(""))) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_sres = _permisoaplicacionusuarioobjeto;Debug.locals.put("sRes", _sres);
if (true) break;

case 104:
//C
this.state = 105;
;
 BA.debugLineNum = 761;BA.debugLine="If sRes=\"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 105:
//if
this.state = 108;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString(""))) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 762;BA.debugLine="sRes=\"SinPermiso\"";
Debug.ShouldStop(33554432);
_sres = BA.ObjectToString("SinPermiso");Debug.locals.put("sRes", _sres);
 if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;

case 109:
//C
this.state = 110;
;
 if (true) break;

case 110:
//C
this.state = 111;
;
 if (true) break;

case 111:
//C
this.state = -1;
;
 BA.debugLineNum = 769;BA.debugLine="LogColor(\"Check Permiso \" & Aplicacion & \" USUARI";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","84849751",RemoteObject.concat(RemoteObject.createImmutable("Check Permiso "),_aplicacion,RemoteObject.createImmutable(" USUARIO: "),_usuario,RemoteObject.createImmutable(" Nombre OBJETO Permiso: "),_nombreobjetopermiso,RemoteObject.createImmutable(":"),RemoteObject.createImmutable("PERMISO: "),_sres),BA.numberCast(int.class, ((int)0xffff1493)));
 BA.debugLineNum = 772;BA.debugLine="Return sRes";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_sres));return;};
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _poigetformattedcellvalue(RemoteObject _excelcell) throws Exception{
try {
		Debug.PushSubsStack("PoiGetFormattedCellValue (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1245);
if (RapidSub.canDelegate("poigetformattedcellvalue")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","poigetformattedcellvalue", _excelcell);}
RemoteObject _jocell = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jodataformatter = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _joconditionalformattingevaluator = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _joformulaevaluator = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ExcelCell", _excelcell);
 BA.debugLineNum = 1245;BA.debugLine="Sub PoiGetFormattedCellValue(ExcelCell As PoiCell)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1246;BA.debugLine="Dim JOCell As JavaObject = ExcelCell";
Debug.ShouldStop(536870912);
_jocell = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jocell = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _excelcell.getObject());Debug.locals.put("JOCell", _jocell);Debug.locals.put("JOCell", _jocell);
 BA.debugLineNum = 1247;BA.debugLine="Dim JODataFormatter As JavaObject";
Debug.ShouldStop(1073741824);
_jodataformatter = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JODataFormatter", _jodataformatter);
 BA.debugLineNum = 1248;BA.debugLine="Dim JOConditionalFormattingEvaluator As JavaObjec";
Debug.ShouldStop(-2147483648);
_joconditionalformattingevaluator = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("JOConditionalFormattingEvaluator", _joconditionalformattingevaluator);
 BA.debugLineNum = 1249;BA.debugLine="Dim JOFormulaEvaluator As JavaObject =JOCell.RunM";
Debug.ShouldStop(1);
_joformulaevaluator = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joformulaevaluator = _jocell.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSheet")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWorkbook")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getCreationHelper")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("createFormulaEvaluator")),(Object)((utilidades.__c.getField(false,"Null"))));Debug.locals.put("JOFormulaEvaluator", _joformulaevaluator);Debug.locals.put("JOFormulaEvaluator", _joformulaevaluator);
 BA.debugLineNum = 1250;BA.debugLine="JOConditionalFormattingEvaluator.InitializeNewIns";
Debug.ShouldStop(2);
_joconditionalformattingevaluator.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.formula.ConditionalFormattingEvaluator")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_jocell.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSheet")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWorkbook")),(Object)((utilidades.__c.getField(false,"Null")))).getObject()),(_jocell.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSheet")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWorkbook")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getCreationHelper")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("createFormulaEvaluator")),(Object)((utilidades.__c.getField(false,"Null")))).getObject())})));
 BA.debugLineNum = 1251;BA.debugLine="Return JODataFormatter.InitializeNewInstance(\"org";
Debug.ShouldStop(4);
if (true) return BA.ObjectToString(_jodataformatter.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("org.apache.poi.ss.usermodel.DataFormatter")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("formatCellValue")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_jocell.getObject()),(_joformulaevaluator.getObject()),(_joconditionalformattingevaluator.getObject())}))));
 BA.debugLineNum = 1253;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
utilidades._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
utilidades._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _resizetofit(RemoteObject _tv,RemoteObject _columnindex) throws Exception{
try {
		Debug.PushSubsStack("ResizeToFit (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,197);
if (RapidSub.canDelegate("resizetofit")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","resizetofit", _tv, _columnindex);}
RemoteObject _javaversion = RemoteObject.createImmutable(0);
RemoteObject _tvjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("tv", _tv);
Debug.locals.put("ColumnIndex", _columnindex);
 BA.debugLineNum = 197;BA.debugLine="Sub ResizeToFit(tv As TableView, ColumnIndex As In";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="Dim JavaVersion As Int=	GetSystemProperty(\"java.v";
Debug.ShouldStop(32);
_javaversion = BA.numberCast(int.class, utilidades.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("java.version")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("JavaVersion", _javaversion);Debug.locals.put("JavaVersion", _javaversion);
 BA.debugLineNum = 199;BA.debugLine="If JavaVersion>=11 Then Return";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",_javaversion,BA.numberCast(double.class, 11))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 201;BA.debugLine="Dim tvjo As JavaObject = tv";
Debug.ShouldStop(256);
_tvjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_tvjo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tv.getObject());Debug.locals.put("tvjo", _tvjo);Debug.locals.put("tvjo", _tvjo);
 BA.debugLineNum = 202;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(512);
_r = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 203;BA.debugLine="r.Target = tvjo.RunMethod(\"getSkin\", Null)";
Debug.ShouldStop(1024);
_r.setField ("Target",_tvjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSkin")),(Object)((utilidades.__c.getField(false,"Null")))));
 BA.debugLineNum = 204;BA.debugLine="r.RunMethod4(\"resizeColumnToFitContent\", Array(";
Debug.ShouldStop(2048);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("resizeColumnToFitContent")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_tvjo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getColumns")),(Object)((utilidades.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnindex)}))),RemoteObject.createImmutable((-(double) (0 + 1)))})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("javafx.scene.control.TableColumn"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfonttobitmap(RemoteObject _fonttext,RemoteObject _fonttype,RemoteObject _fontsize,RemoteObject _fontcolor) throws Exception{
try {
		Debug.PushSubsStack("SetFontToBitmap (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1001);
if (RapidSub.canDelegate("setfonttobitmap")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setfonttobitmap", _fonttext, _fonttype, _fontsize, _fontcolor);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cvs1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("FontText", _fonttext);
Debug.locals.put("FontType", _fonttype);
Debug.locals.put("FontSize", _fontsize);
Debug.locals.put("FontColor", _fontcolor);
 BA.debugLineNum = 1001;BA.debugLine="Public Sub SetFontToBitmap (FontText As String, Fo";
Debug.ShouldStop(256);
 BA.debugLineNum = 1002;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(512);
utilidades._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 1003;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = utilidades._xui.runMethod(false,"CreatePanel",utilidades.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1004;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
Debug.ShouldStop(2048);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32))))),(Object)(BA.numberCast(double.class, utilidades.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32))))));
 BA.debugLineNum = 1005;BA.debugLine="Dim cvs1 As B4XCanvas";
Debug.ShouldStop(4096);
_cvs1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs1", _cvs1);
 BA.debugLineNum = 1006;BA.debugLine="cvs1.Initialize(p)";
Debug.ShouldStop(8192);
_cvs1.runVoidMethod ("Initialize",utilidades.ba,(Object)(_p));
 BA.debugLineNum = 1007;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(FontText, xui";
Debug.ShouldStop(16384);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_fonttext),(Object)(utilidades._xui.runMethod(false,"CreateFont2",(Object)(_fonttype),(Object)(_fontsize))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1008;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
Debug.ShouldStop(32768);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterY"),_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 1009;BA.debugLine="cvs1.DrawText(FontText, cvs1.TargetRect.CenterX,";
Debug.ShouldStop(65536);
_cvs1.runVoidMethod ("DrawText",(Object)(_fonttext),(Object)(BA.numberCast(double.class, _cvs1.runMethod(false,"getTargetRect").runMethod(true,"getCenterX"))),(Object)(BA.numberCast(double.class, _baseline)),(Object)(utilidades._xui.runMethod(false,"CreateFont2",(Object)(_fonttype),(Object)(_fontsize))),(Object)(_fontcolor),(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.text.TextAlignment"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 1010;BA.debugLine="cvs1.Invalidate";
Debug.ShouldStop(131072);
_cvs1.runVoidMethod ("Invalidate");
 BA.debugLineNum = 1011;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
Debug.ShouldStop(262144);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = _cvs1.runMethod(false,"CreateBitmap");Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 1012;BA.debugLine="cvs1.Release";
Debug.ShouldStop(524288);
_cvs1.runVoidMethod ("Release");
 BA.debugLineNum = 1013;BA.debugLine="Return b";
Debug.ShouldStop(1048576);
if (true) return _b;
 BA.debugLineNum = 1014;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformiconified(RemoteObject _f,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("SetFormIconified (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,35);
if (RapidSub.canDelegate("setformiconified")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setformiconified", _f, _state);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("f", _f);
Debug.locals.put("State", _state);
 BA.debugLineNum = 35;BA.debugLine="Sub SetFormIconified(f As Form, State As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="Dim joForm As JavaObject = f";
Debug.ShouldStop(16);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 39;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(64);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 41;BA.debugLine="joStage.RunMethod(\"setMinimized\", Array(State))";
Debug.ShouldStop(256);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMinimized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_state)})));
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
public static RemoteObject  _setformmaximized(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetFormMaximized (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,18);
if (RapidSub.canDelegate("setformmaximized")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setformmaximized", _f);}
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("f", _f);
 BA.debugLineNum = 18;BA.debugLine="Sub SetFormMaximized(f As Form)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Dim joForm As JavaObject = f";
Debug.ShouldStop(524288);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _f);Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 22;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(2097152);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 24;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(8388608);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(utilidades.__c.getField(true,"True"))})));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethours(RemoteObject _st) throws Exception{
try {
		Debug.PushSubsStack("SetHours (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1507);
if (RapidSub.canDelegate("sethours")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","sethours", _st);}
RemoteObject _hours = RemoteObject.createImmutable(0);
RemoteObject _minutes = RemoteObject.createImmutable(0);
Debug.locals.put("st", _st);
 BA.debugLineNum = 1507;BA.debugLine="Sub SetHours(st As Double) As Long";
Debug.ShouldStop(4);
 BA.debugLineNum = 1508;BA.debugLine="Dim hours As Int = Floor(st)";
Debug.ShouldStop(8);
_hours = BA.numberCast(int.class, utilidades.__c.runMethod(true,"Floor",(Object)(_st)));Debug.locals.put("hours", _hours);Debug.locals.put("hours", _hours);
 BA.debugLineNum = 1509;BA.debugLine="Dim minutes As Int = Round(60 * (st - hours))";
Debug.ShouldStop(16);
_minutes = BA.numberCast(int.class, utilidades.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(60),(RemoteObject.solve(new RemoteObject[] {_st,_hours}, "-",1, 0))}, "*",0, 0))));Debug.locals.put("minutes", _minutes);Debug.locals.put("minutes", _minutes);
 BA.debugLineNum = 1510;BA.debugLine="Return DateUtils.SetDateAndTime(DateTime.GetYear(";
Debug.ShouldStop(32);
if (true) return utilidades._dateutils.runMethod(true,"_setdateandtime",(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(_hours),(Object)(_minutes),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1512;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedate(RemoteObject _datetemplate) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDate (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,441);
if (RapidSub.canDelegate("setlightthemedate")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setlightthemedate", _datetemplate);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("datetemplate", _datetemplate);
 BA.debugLineNum = 441;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 442;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.ShouldStop(33554432);
_textcolor = utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 443;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
Debug.ShouldStop(67108864);
_datetemplate.setField ("_daysinweekcolor" /*RemoteObject*/ ,utilidades._xui.getField(true,"Color_Black"));
 BA.debugLineNum = 444;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.ShouldStop(134217728);
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x39))),(Object)(BA.numberCast(int.class, ((int)0xd7))),(Object)(BA.numberCast(int.class, ((int)0xce)))));
 BA.debugLineNum = 445;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
Debug.ShouldStop(268435456);
_datetemplate.setField ("_highlightedcolor" /*RemoteObject*/ ,utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0xce))),(Object)(BA.numberCast(int.class, ((int)0xff)))));
 BA.debugLineNum = 446;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
Debug.ShouldStop(536870912);
_datetemplate.setField ("_daysinmonthcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 447;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
Debug.ShouldStop(1073741824);
_datetemplate.getField(false,"_lblmonth" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 448;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
Debug.ShouldStop(-2147483648);
_datetemplate.getField(false,"_lblyear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 449;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
Debug.ShouldStop(1);
_datetemplate.setField ("_selectedcolor" /*RemoteObject*/ ,utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xa7))),(Object)(BA.numberCast(int.class, ((int)0x61)))));
 BA.debugLineNum = 450;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
Debug.ShouldStop(2);
_x = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group9 = RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_datetemplate.getField(false,"_btnmonthleft" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnmonthright" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnyearleft" /*RemoteObject*/ ).getObject()),(_datetemplate.getField(false,"_btnyearright" /*RemoteObject*/ ).getObject())});
final int groupLen9 = group9.getField(true,"length").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group9.getArrayElement(false,RemoteObject.createImmutable(index9)));Debug.locals.put("x", _x);
Debug.locals.put("x", _x);
 BA.debugLineNum = 451;BA.debugLine="x.Color = xui.Color_Transparent";
Debug.ShouldStop(4);
_x.runMethod(true,"setColor",utilidades._xui.getField(true,"Color_Transparent"));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 453;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemedialog(RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeDialog (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,407);
if (RapidSub.canDelegate("setlightthemedialog")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setlightthemedialog", _dlg);}
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 407;BA.debugLine="Sub SetLightThemeDialog(dlg As B4XDialog)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 408;BA.debugLine="dlg.BackgroundColor = xui.Color_White";
Debug.ShouldStop(8388608);
_dlg.setField ("_backgroundcolor" /*RemoteObject*/ ,utilidades._xui.getField(true,"Color_White"));
 BA.debugLineNum = 409;BA.debugLine="dlg.ButtonsColor = xui.Color_White";
Debug.ShouldStop(16777216);
_dlg.setField ("_buttonscolor" /*RemoteObject*/ ,utilidades._xui.getField(true,"Color_White"));
 BA.debugLineNum = 410;BA.debugLine="dlg.BorderColor = xui.Color_Gray";
Debug.ShouldStop(33554432);
_dlg.setField ("_bordercolor" /*RemoteObject*/ ,utilidades._xui.getField(true,"Color_Gray"));
 BA.debugLineNum = 411;BA.debugLine="dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
Debug.ShouldStop(67108864);
_dlg.setField ("_buttonstextcolor" /*RemoteObject*/ ,utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x00))),(Object)(BA.numberCast(int.class, ((int)0x7d))),(Object)(BA.numberCast(int.class, ((int)0xc3)))));
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemeinput(RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeInput (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,422);
if (RapidSub.canDelegate("setlightthemeinput")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setlightthemeinput", _input);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("input", _input);
 BA.debugLineNum = 422;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
Debug.ShouldStop(32);
 BA.debugLineNum = 423;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.ShouldStop(64);
_textcolor = utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 424;BA.debugLine="input.TextField1.TextColor = TextColor";
Debug.ShouldStop(128);
_input.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 425;BA.debugLine="input.lblTitle.TextColor = TextColor";
Debug.ShouldStop(256);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 426;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
Debug.ShouldStop(512);
_input.runClassMethod (b4j.docU.b4xinputtemplate.class, "_setbordercolor" /*RemoteObject*/ ,(Object)(_textcolor),(Object)(utilidades._xui.getField(true,"Color_Red")));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemelist(RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeList (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,414);
if (RapidSub.canDelegate("setlightthemelist")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setlightthemelist", _list);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("list", _list);
 BA.debugLineNum = 414;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 415;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.ShouldStop(1073741824);
_textcolor = utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 416;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
Debug.ShouldStop(-2147483648);
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 417;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
Debug.ShouldStop(1);
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",utilidades._xui.getField(true,"Color_White"));
 BA.debugLineNum = 418;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
Debug.ShouldStop(2);
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",utilidades._xui.getField(true,"Color_White"));
 BA.debugLineNum = 419;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
Debug.ShouldStop(4);
_list.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlightthemesearch(RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("SetLightThemeSearch (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,429);
if (RapidSub.canDelegate("setlightthemesearch")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setlightthemesearch", _search);}
RemoteObject _textcolor = RemoteObject.createImmutable(0);
Debug.locals.put("search", _search);
 BA.debugLineNum = 429;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
Debug.ShouldStop(8192);
_textcolor = utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))),(Object)(BA.numberCast(int.class, ((int)0x5b))));Debug.locals.put("TextColor", _textcolor);Debug.locals.put("TextColor", _textcolor);
 BA.debugLineNum = 431;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
Debug.ShouldStop(16384);
_search.getField(false,"_searchfield" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xfloattextfield.class, "_gettextfield" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);
 BA.debugLineNum = 432;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
Debug.ShouldStop(32768);
_search.getField(false,"_searchfield" /*RemoteObject*/ ).setField ("_nonfocusedhintcolor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 433;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
Debug.ShouldStop(65536);
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",utilidades._xui.runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf))),(Object)(BA.numberCast(int.class, ((int)0xdf)))));
 BA.debugLineNum = 434;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
Debug.ShouldStop(131072);
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).getField(false,"_sv").runMethod(true,"setColor",utilidades._xui.getField(true,"Color_White"));
 BA.debugLineNum = 435;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
Debug.ShouldStop(262144);
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",utilidades._xui.getField(true,"Color_White"));
 BA.debugLineNum = 436;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
Debug.ShouldStop(524288);
_search.getField(false,"_customlistview1" /*RemoteObject*/ ).setField ("_defaulttextcolor",_textcolor);
 BA.debugLineNum = 437;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
Debug.ShouldStop(1048576);
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblv" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 438;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
Debug.ShouldStop(2097152);
if (_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_search.getField(false,"_searchfield" /*RemoteObject*/ ).getField(false,"_lblclear" /*RemoteObject*/ ).runMethod(true,"setTextColor",_textcolor);};
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpagesize(RemoteObject _doc,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetPageSize (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1181);
if (RapidSub.canDelegate("setpagesize")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","setpagesize", _doc, _width, _height);}
RemoteObject _document = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _section = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _pagesize = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _biginteger = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("doc", _doc);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1181;BA.debugLine="Private Sub SetPageSize(doc As WordDocument, Width";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1182;BA.debugLine="Dim document As JavaObject = doc.XWPFDocument.Run";
Debug.ShouldStop(536870912);
_document = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_document = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _doc.getField(false,"_xwpfdocument" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDocument")),(Object)((utilidades.__c.getField(false,"Null")))));Debug.locals.put("document", _document);Debug.locals.put("document", _document);
 BA.debugLineNum = 1183;BA.debugLine="Dim body As JavaObject = document.RunMethod(\"getB";
Debug.ShouldStop(1073741824);
_body = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_body = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _document.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBody")),(Object)((utilidades.__c.getField(false,"Null")))));Debug.locals.put("body", _body);Debug.locals.put("body", _body);
 BA.debugLineNum = 1184;BA.debugLine="If body.RunMethod(\"isSetSectPr\", Null).As(Boolean";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",(BA.ObjectToBoolean(_body.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isSetSectPr")),(Object)((utilidades.__c.getField(false,"Null")))))),utilidades.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1185;BA.debugLine="body.RunMethod(\"addNewSectPr\", Null)";
Debug.ShouldStop(1);
_body.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addNewSectPr")),(Object)((utilidades.__c.getField(false,"Null"))));
 };
 BA.debugLineNum = 1187;BA.debugLine="Dim section As JavaObject = body.RunMethod(\"getSe";
Debug.ShouldStop(4);
_section = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_section = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _body.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSectPr")),(Object)((utilidades.__c.getField(false,"Null")))));Debug.locals.put("section", _section);Debug.locals.put("section", _section);
 BA.debugLineNum = 1188;BA.debugLine="If section.RunMethod(\"isSetPgSz\", Null).As(Boolea";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",(BA.ObjectToBoolean(_section.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isSetPgSz")),(Object)((utilidades.__c.getField(false,"Null")))))),utilidades.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1189;BA.debugLine="section.RunMethod(\"addNewPgSz\", Null)";
Debug.ShouldStop(16);
_section.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addNewPgSz")),(Object)((utilidades.__c.getField(false,"Null"))));
 };
 BA.debugLineNum = 1191;BA.debugLine="Dim pageSize As JavaObject = section.RunMethod(\"g";
Debug.ShouldStop(64);
_pagesize = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_pagesize = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _section.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPgSz")),(Object)((utilidades.__c.getField(false,"Null")))));Debug.locals.put("pageSize", _pagesize);Debug.locals.put("pageSize", _pagesize);
 BA.debugLineNum = 1192;BA.debugLine="Dim BigInteger As JavaObject";
Debug.ShouldStop(128);
_biginteger = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("BigInteger", _biginteger);
 BA.debugLineNum = 1193;BA.debugLine="BigInteger.InitializeStatic(\"java.math.BigInteger";
Debug.ShouldStop(256);
_biginteger.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("java.math.BigInteger")));
 BA.debugLineNum = 1194;BA.debugLine="pageSize.RunMethod(\"setW\", Array(BigInteger.RunMe";
Debug.ShouldStop(512);
_pagesize.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setW")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_biginteger.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueOf")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(20)}, "*",0, 2))})))})));
 BA.debugLineNum = 1195;BA.debugLine="pageSize.RunMethod(\"setH\", Array(BigInteger.RunMe";
Debug.ShouldStop(1024);
_pagesize.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setH")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_biginteger.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueOf")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(20)}, "*",0, 2))})))})));
 BA.debugLineNum = 1196;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settooltipfont(RemoteObject _n,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetToolTipFont (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,44);
if (RapidSub.canDelegate("settooltipfont")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","settooltipfont", _n, _f);}
RemoteObject _jon = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("N", _n);
Debug.locals.put("F", _f);
 BA.debugLineNum = 44;BA.debugLine="Sub SetToolTipFont(N As Control,F As Font)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim JoN As JavaObject = N";
Debug.ShouldStop(4096);
_jon = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject());Debug.locals.put("JoN", _jon);Debug.locals.put("JoN", _jon);
 BA.debugLineNum = 46;BA.debugLine="JoN.RunMethodJO(\"getTooltip\",Null).RunMethod(\"set";
Debug.ShouldStop(8192);
_jon.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getTooltip")),(Object)((utilidades.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setFont")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_f.getObject())})));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _texttoimageawesome(RemoteObject _s,RemoteObject _fontsize) throws Exception{
try {
		Debug.PushSubsStack("TextToImageAwesome (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1045);
if (RapidSub.canDelegate("texttoimageawesome")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","texttoimageawesome", _s, _fontsize);}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("s", _s);
Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 1045;BA.debugLine="private Sub TextToImageAwesome(s As String, FontSi";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1046;BA.debugLine="Dim img As Image";
Debug.ShouldStop(2097152);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 1047;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1048;BA.debugLine="lbl.Initialize(\"lbl\")";
Debug.ShouldStop(8388608);
_lbl.runVoidMethod ("Initialize",utilidades.ba,(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 1049;BA.debugLine="lbl.Font = fx.CreateFontAwesome(FontSize)";
Debug.ShouldStop(16777216);
_lbl.runMethod(false,"setFont",utilidades._fx.runMethod(false,"CreateFontAwesome",(Object)(_fontsize)));
 BA.debugLineNum = 1050;BA.debugLine="lbl.Text = s";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setText",_s);
 BA.debugLineNum = 1052;BA.debugLine="Dim p As Pane=xui.CreatePanel(\"\")";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), utilidades._xui.runMethod(false,"CreatePanel",utilidades.ba,(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1053;BA.debugLine="p.AddNode(lbl, -1, -1, -1, -1)";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("AddNode",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 1055;BA.debugLine="img = lbl.Snapshot2(fx.Colors.Transparent) ' snap";
Debug.ShouldStop(1073741824);
_img = _lbl.runMethod(false,"Snapshot2",(Object)(utilidades._fx.getField(false,"Colors").getField(false,"Transparent")));Debug.locals.put("img", _img);
 BA.debugLineNum = 1056;BA.debugLine="lbl.Visible = False";
Debug.ShouldStop(-2147483648);
_lbl.runMethod(true,"setVisible",utilidades.__c.getField(true,"False"));
 BA.debugLineNum = 1058;BA.debugLine="p.RemoveNodeAt(p.NumberOfNodes-1)";
Debug.ShouldStop(2);
_p.runVoidMethod ("RemoveNodeAt",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfNodes"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 1059;BA.debugLine="Return img";
Debug.ShouldStop(4);
if (true) return _img;
 BA.debugLineNum = 1060;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _texttoimagematerialicons(RemoteObject _s,RemoteObject _fontsize) throws Exception{
try {
		Debug.PushSubsStack("TextToImageMaterialIcons (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1062);
if (RapidSub.canDelegate("texttoimagematerialicons")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","texttoimagematerialicons", _s, _fontsize);}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("s", _s);
Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 1062;BA.debugLine="private Sub TextToImageMaterialIcons(s As String,";
Debug.ShouldStop(32);
 BA.debugLineNum = 1063;BA.debugLine="Dim img As Image";
Debug.ShouldStop(64);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 1064;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(128);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1065;BA.debugLine="lbl.Initialize(\"lbl\")";
Debug.ShouldStop(256);
_lbl.runVoidMethod ("Initialize",utilidades.ba,(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 1066;BA.debugLine="lbl.Font = fx.CreateMaterialIcons(FontSize)";
Debug.ShouldStop(512);
_lbl.runMethod(false,"setFont",utilidades._fx.runMethod(false,"CreateMaterialIcons",(Object)(_fontsize)));
 BA.debugLineNum = 1067;BA.debugLine="lbl.Text = s";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setText",_s);
 BA.debugLineNum = 1069;BA.debugLine="Dim p As Pane=xui.CreatePanel(\"\")";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), utilidades._xui.runMethod(false,"CreatePanel",utilidades.ba,(Object)(RemoteObject.createImmutable(""))).getObject());Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1070;BA.debugLine="p.AddNode(lbl, -1, -1, -1, -1)";
Debug.ShouldStop(8192);
_p.runVoidMethod ("AddNode",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 1072;BA.debugLine="img = lbl.Snapshot2(fx.Colors.Transparent) ' snap";
Debug.ShouldStop(32768);
_img = _lbl.runMethod(false,"Snapshot2",(Object)(utilidades._fx.getField(false,"Colors").getField(false,"Transparent")));Debug.locals.put("img", _img);
 BA.debugLineNum = 1073;BA.debugLine="lbl.Visible = False";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setVisible",utilidades.__c.getField(true,"False"));
 BA.debugLineNum = 1075;BA.debugLine="p.RemoveNodeAt(p.NumberOfNodes-1)";
Debug.ShouldStop(262144);
_p.runVoidMethod ("RemoveNodeAt",(Object)(RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getNumberOfNodes"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 1076;BA.debugLine="Return img";
Debug.ShouldStop(524288);
if (true) return _img;
 BA.debugLineNum = 1077;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tickstodate(RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("TicksToDate (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1150);
if (RapidSub.canDelegate("tickstodate")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","tickstodate", _ticks);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1150;BA.debugLine="Sub TicksToDate (ticks As Long) As Object";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1151;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1152;BA.debugLine="jo.InitializeNewInstance(\"java.util.Date\", Array(";
Debug.ShouldStop(-2147483648);
_jo.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.util.Date")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ticks)})));
 BA.debugLineNum = 1153;BA.debugLine="Return jo";
Debug.ShouldStop(1);
if (true) return (_jo.getObject());
 BA.debugLineNum = 1154;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tiempodesdeticks(RemoteObject _ticksdato) throws Exception{
try {
		Debug.PushSubsStack("TiempoDesdeTicks (utilidades) ","utilidades",2,utilidades.ba,utilidades.mostCurrent,1208);
if (RapidSub.canDelegate("tiempodesdeticks")) { return b4j.docU.utilidades.remoteMe.runUserSub(false, "utilidades","tiempodesdeticks", _ticksdato);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _stiempodesdedato = RemoteObject.createImmutable("");
Debug.locals.put("TicksDato", _ticksdato);
 BA.debugLineNum = 1208;BA.debugLine="Sub TiempoDesdeTicks(TicksDato As Long) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1209;BA.debugLine="Dim p As Period";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("p", _p);
 BA.debugLineNum = 1210;BA.debugLine="p.Initialize";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 1211;BA.debugLine="p = DateUtils.PeriodBetweenInDays(TicksDato,DateT";
Debug.ShouldStop(67108864);
_p = utilidades._dateutils.runMethod(false,"_periodbetweenindays",(Object)(_ticksdato),(Object)(utilidades.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("p", _p);
 BA.debugLineNum = 1212;BA.debugLine="Dim sTiempoDesdeDato As String";
Debug.ShouldStop(134217728);
_stiempodesdedato = RemoteObject.createImmutable("");Debug.locals.put("sTiempoDesdeDato", _stiempodesdedato);
 BA.debugLineNum = 1213;BA.debugLine="If p.Days>0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_p.getField(true,"Days"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1214;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$1.0{p.Day";
Debug.ShouldStop(536870912);
_stiempodesdedato = RemoteObject.concat(_stiempodesdedato,(RemoteObject.concat(RemoteObject.createImmutable(""),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_p.getField(true,"Days")))),RemoteObject.createImmutable(" días "))));Debug.locals.put("sTiempoDesdeDato", _stiempodesdedato);
 };
 BA.debugLineNum = 1216;BA.debugLine="If p.Hours>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_p.getField(true,"Hours"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1217;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$2.0{p.Hou";
Debug.ShouldStop(1);
_stiempodesdedato = RemoteObject.concat(_stiempodesdedato,(RemoteObject.concat(RemoteObject.createImmutable(""),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_p.getField(true,"Hours")))),RemoteObject.createImmutable(" h "))));Debug.locals.put("sTiempoDesdeDato", _stiempodesdedato);
 };
 BA.debugLineNum = 1219;BA.debugLine="If p.Minutes>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1220;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$2.0{p.Min";
Debug.ShouldStop(8);
_stiempodesdedato = RemoteObject.concat(_stiempodesdedato,(RemoteObject.concat(RemoteObject.createImmutable(""),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_p.getField(true,"Minutes")))),RemoteObject.createImmutable(" m "))));Debug.locals.put("sTiempoDesdeDato", _stiempodesdedato);
 };
 BA.debugLineNum = 1222;BA.debugLine="If p.Seconds>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_p.getField(true,"Seconds"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1223;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$2.0{p.Sec";
Debug.ShouldStop(64);
_stiempodesdedato = RemoteObject.concat(_stiempodesdedato,(RemoteObject.concat(RemoteObject.createImmutable(""),utilidades.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("2.0")),(Object)((_p.getField(true,"Seconds")))),RemoteObject.createImmutable(" s "))));Debug.locals.put("sTiempoDesdeDato", _stiempodesdedato);
 };
 BA.debugLineNum = 1225;BA.debugLine="Return sTiempoDesdeDato";
Debug.ShouldStop(256);
if (true) return _stiempodesdedato;
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}