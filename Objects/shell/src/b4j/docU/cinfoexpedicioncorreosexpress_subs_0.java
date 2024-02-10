package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cinfoexpedicioncorreosexpress_subs_0 {


public static RemoteObject  _actualizarinfoexpedicion(RemoteObject __ref,RemoteObject _solicitante,RemoteObject _numexpedicion) throws Exception{
try {
		Debug.PushSubsStack("ActualizarInfoExpedicion (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("actualizarinfoexpedicion")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","actualizarinfoexpedicion", __ref, _solicitante, _numexpedicion);}
ResumableSub_ActualizarInfoExpedicion rsub = new ResumableSub_ActualizarInfoExpedicion(null,__ref,_solicitante,_numexpedicion);
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
public static class ResumableSub_ActualizarInfoExpedicion extends BA.ResumableSub {
public ResumableSub_ActualizarInfoExpedicion(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref,RemoteObject _solicitante,RemoteObject _numexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._solicitante = _solicitante;
this._numexpedicion = _numexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _solicitante;
RemoteObject _numexpedicion;
RemoteObject _lstfases = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _wsresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _xmlresplwebserver = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _wsresponsesinprologo = RemoteObject.createImmutable("");
RemoteObject _parseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msegenvio = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _coderror = RemoteObject.createImmutable(0);
RemoteObject _smsgerr = RemoteObject.createImmutable("");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _dateformator = RemoteObject.createImmutable("");
RemoteObject _timeformator = RemoteObject.createImmutable("");
RemoteObject _mfasesenvio = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k2 = RemoteObject.createImmutable("");
RemoteObject _codestado = RemoteObject.createImmutable("");
RemoteObject _festl = RemoteObject.createImmutable(0L);
RemoteObject _testl = RemoteObject.createImmutable(0L);
RemoteObject _nombreestadoenvio = RemoteObject.createImmutable("");
RemoteObject _descripcionestadoenvio = RemoteObject.createImmutable("");
RemoteObject _infoestado = null;
RemoteObject group31;
int index31;
int groupLen31;
RemoteObject group55;
int index55;
int groupLen55;
RemoteObject group56;
int index56;
int groupLen56;
RemoteObject group70;
int index70;
int groupLen70;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarInfoExpedicion (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,216);
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
Debug.locals.put("Solicitante", _solicitante);
Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 217;BA.debugLine="Dim lstFases As List";
Debug.ShouldStop(16777216);
_lstfases = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstFases", _lstfases);
 BA.debugLineNum = 218;BA.debugLine="lstFases.Initialize";
Debug.ShouldStop(33554432);
_lstfases.runVoidMethod ("Initialize");
 BA.debugLineNum = 219;BA.debugLine="wait for (InfoExpedicionCorreosExpress(Solicitant";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "actualizarinfoexpedicion"), __ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_infoexpedicioncorreosexpress" /*RemoteObject*/ ,(Object)(_solicitante),(Object)(_numexpedicion)));
this.state = 47;
return;
case 47:
//C
this.state = 1;
_wsresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("WSResponse", _wsresponse);
;
 BA.debugLineNum = 220;BA.debugLine="Log(\"WSResponse \" & WSResponse)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","888276996",RemoteObject.concat(RemoteObject.createImmutable("WSResponse "),_wsresponse),0);
 BA.debugLineNum = 221;BA.debugLine="If WSResponse.StartsWith(\"Error carga credenciale";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (_wsresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Error carga credenciales"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 222;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible cargar los credenciales de acceso al web service de Correos Express")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 223;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "actualizarinfoexpedicion"), _msa);
this.state = 48;
return;
case 48:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 224;BA.debugLine="Return lstFases";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lstfases));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 226;BA.debugLine="LimpiarDatosCabEnvio";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_limpiardatoscabenvio" /*RemoteObject*/ );
 BA.debugLineNum = 227;BA.debugLine="If WSResponse.StartsWith(\"ERROR de comunicacion :";
Debug.ShouldStop(4);
if (true) break;

case 5:
//if
this.state = 46;
if (_wsresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR de comunicacion :"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 46;
 BA.debugLineNum = 229;BA.debugLine="Return lstFases";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lstfases));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 233;BA.debugLine="Dim XMLRespLWebServer As Xml2Map";
Debug.ShouldStop(256);
_xmlresplwebserver = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("XMLRespLWebServer", _xmlresplwebserver);
 BA.debugLineNum = 234;BA.debugLine="XMLRespLWebServer.Initialize";
Debug.ShouldStop(512);
_xmlresplwebserver.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 235;BA.debugLine="Dim WSResponseSinPrologo As String=WSResponse.Su";
Debug.ShouldStop(1024);
_wsresponsesinprologo = _wsresponse.runMethod(true,"substring",(Object)(_wsresponse.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<")))));Debug.locals.put("WSResponseSinPrologo", _wsresponsesinprologo);Debug.locals.put("WSResponseSinPrologo", _wsresponsesinprologo);
 BA.debugLineNum = 236;BA.debugLine="Dim ParsedData As Map=XMLRespLWebServer.Parse(WS";
Debug.ShouldStop(2048);
_parseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_parseddata = _xmlresplwebserver.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_wsresponsesinprologo));Debug.locals.put("ParsedData", _parseddata);Debug.locals.put("ParsedData", _parseddata);
 BA.debugLineNum = 237;BA.debugLine="Dim mSegEnvio As Map=ParsedData.Get(\"Seguimiento";
Debug.ShouldStop(4096);
_msegenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_msegenvio = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _parseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SeguimientoEnviosResponse")))));Debug.locals.put("mSegEnvio", _msegenvio);Debug.locals.put("mSegEnvio", _msegenvio);
 BA.debugLineNum = 238;BA.debugLine="Dim CodError As Int=mSegEnvio.Get(\"Error\")";
Debug.ShouldStop(8192);
_coderror = BA.numberCast(int.class, _msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Error")))));Debug.locals.put("CodError", _coderror);Debug.locals.put("CodError", _coderror);
 BA.debugLineNum = 239;BA.debugLine="If 0<>CodError Then";
Debug.ShouldStop(16384);
if (true) break;

case 10:
//if
this.state = 45;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(0),BA.numberCast(double.class, _coderror))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 241;BA.debugLine="Log(\"Mensaje de error: \" & mSegEnvio.Get(\"Mensa";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","888277017",RemoteObject.concat(RemoteObject.createImmutable("Mensaje de error: "),_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MensajeError"))))),0);
 BA.debugLineNum = 242;BA.debugLine="If CodError=402 Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_coderror,BA.numberCast(double.class, 402))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 243;BA.debugLine="Dim sMsgErr As String=\"No hay datos de envío p";
Debug.ShouldStop(262144);
_smsgerr = RemoteObject.concat(RemoteObject.createImmutable("No hay datos de envío para el número de expedición indicado ("),_numexpedicion,RemoteObject.createImmutable(")."));Debug.locals.put("sMsgErr", _smsgerr);Debug.locals.put("sMsgErr", _smsgerr);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 245;BA.debugLine="Dim sMsgErr As String=mSegEnvio.Get(\"MensajeEr";
Debug.ShouldStop(1048576);
_smsgerr = BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MensajeError")))));Debug.locals.put("sMsgErr", _smsgerr);Debug.locals.put("sMsgErr", _smsgerr);
 if (true) break;

case 18:
//C
this.state = 45;
;
 BA.debugLineNum = 247;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sMsgErr,\"Av";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(_smsgerr),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 248;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "actualizarinfoexpedicion"), _msa);
this.state = 49;
return;
case 49:
//C
this.state = 45;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 249;BA.debugLine="Return lstFases";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lstfases));return;};
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 253;BA.debugLine="For Each k As String In mSegEnvio.Keys";
Debug.ShouldStop(268435456);
if (true) break;

case 21:
//for
this.state = 28;
group31 = _msegenvio.runMethod(false,"Keys");
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 50;
if (true) break;

case 50:
//C
this.state = 28;
if (index31 < groupLen31) {
this.state = 23;
_k = BA.ObjectToString(group31.runMethod(false,"Get",index31));Debug.locals.put("k", _k);}
if (true) break;

case 51:
//C
this.state = 50;
index31++;
Debug.locals.put("k", _k);
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 254;BA.debugLine="If k<>\"Attributes\" And k<>\"Error\" And k<>\"Mens";
Debug.ShouldStop(536870912);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("!",_k,BA.ObjectToString("Attributes")) && RemoteObject.solveBoolean("!",_k,BA.ObjectToString("Error")) && RemoteObject.solveBoolean("!",_k,BA.ObjectToString("MensajeError")) && RemoteObject.solveBoolean("!",_k,BA.ObjectToString("EstadoEnvios"))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 255;BA.debugLine="Log(k & \": \" & mSegEnvio.Get(k))";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","888277031",RemoteObject.concat(_k,RemoteObject.createImmutable(": "),_msegenvio.runMethod(false,"Get",(Object)((_k)))),0);
 if (true) break;

case 27:
//C
this.state = 51;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 259;BA.debugLine="txtNumExpedicion.Text=mSegEnvio.Get(\"NumEnvio\")";
Debug.ShouldStop(4);
__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumEnvio"))))));
 BA.debugLineNum = 260;BA.debugLine="txtRef.Text=mSegEnvio.Get(\"Ref\")";
Debug.ShouldStop(8);
__ref.getField(false,"_txtref" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ref"))))));
 BA.debugLineNum = 261;BA.debugLine="txtFecha.Text=mSegEnvio.Get(\"Fecha\")";
Debug.ShouldStop(16);
__ref.getField(false,"_txtfecha" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Fecha"))))));
 BA.debugLineNum = 262;BA.debugLine="txtDirRte.Text=mSegEnvio.Get(\"DirRte\")";
Debug.ShouldStop(32);
__ref.getField(false,"_txtdirrte" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DirRte"))))));
 BA.debugLineNum = 263;BA.debugLine="txtPobRte.Text=mSegEnvio.Get(\"PobRte\")";
Debug.ShouldStop(64);
__ref.getField(false,"_txtpobrte" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PobRte"))))));
 BA.debugLineNum = 264;BA.debugLine="txtCodPosNacRte.Text=mSegEnvio.Get(\"CodPosNacRt";
Debug.ShouldStop(128);
__ref.getField(false,"_txtcodposnacrte" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodPosNacRte"))))));
 BA.debugLineNum = 265;BA.debugLine="txtNomDest.Text=mSegEnvio.Get(\"NomDest\")";
Debug.ShouldStop(256);
__ref.getField(false,"_txtnomdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NomDest"))))));
 BA.debugLineNum = 266;BA.debugLine="txtDirDest.Text=mSegEnvio.Get(\"DirDest\")";
Debug.ShouldStop(512);
__ref.getField(false,"_txtdirdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DirDest"))))));
 BA.debugLineNum = 267;BA.debugLine="txtPobDest.Text=mSegEnvio.Get(\"PobDest\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtpobdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PobDest"))))));
 BA.debugLineNum = 268;BA.debugLine="txtCodPosNacDest.Text=mSegEnvio.Get(\"CodPosNacD";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtcodposnacdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodPosNacDest"))))));
 BA.debugLineNum = 269;BA.debugLine="txtNumBultos.Text=mSegEnvio.Get(\"NumBultos\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtnumbultos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NumBultos"))))));
 BA.debugLineNum = 270;BA.debugLine="txtKilos.Text=mSegEnvio.Get(\"Kilos\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtkilos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kilos"))))));
 BA.debugLineNum = 271;BA.debugLine="txtVolumen.Text=mSegEnvio.Get(\"Volumen\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtvolumen" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Volumen"))))));
 BA.debugLineNum = 272;BA.debugLine="txtCodIncEstado.Text=mSegEnvio.Get(\"CodIncEstad";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtcodincestado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodIncEstado"))))));
 BA.debugLineNum = 273;BA.debugLine="txtDescIncEstado.Text=mSegEnvio.Get(\"DescIncEst";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtdescincestado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_msegenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DescIncEstado"))))));
 BA.debugLineNum = 276;BA.debugLine="Log(\"********* FASES DE ENVIO ********\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","888277052",RemoteObject.createImmutable("********* FASES DE ENVIO ********"),0);
 BA.debugLineNum = 277;BA.debugLine="Dim DateFormatOr As String=DateTime.DateFormat";
Debug.ShouldStop(1048576);
_dateformator = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatOr", _dateformator);Debug.locals.put("DateFormatOr", _dateformator);
 BA.debugLineNum = 278;BA.debugLine="Dim TimeFormatOr As String=DateTime.TimeFormat";
Debug.ShouldStop(2097152);
_timeformator = parent.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatOr", _timeformator);Debug.locals.put("TimeFormatOr", _timeformator);
 BA.debugLineNum = 279;BA.debugLine="DateTime.DateFormat=\"ddMMyyy\"";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("ddMMyyy"));
 BA.debugLineNum = 280;BA.debugLine="For Each mFasesEnvio As Map In GetElements(mSeg";
Debug.ShouldStop(8388608);
if (true) break;

case 29:
//for
this.state = 44;
_mfasesenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group55 = __ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_getelements" /*RemoteObject*/ ,(Object)(_msegenvio),(Object)(RemoteObject.createImmutable("EstadoEnvios")));
index55 = 0;
groupLen55 = group55.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mFasesEnvio", _mfasesenvio);
this.state = 52;
if (true) break;

case 52:
//C
this.state = 44;
if (index55 < groupLen55) {
this.state = 31;
_mfasesenvio = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group55.runMethod(false,"Get",index55));Debug.locals.put("mFasesEnvio", _mfasesenvio);}
if (true) break;

case 53:
//C
this.state = 52;
index55++;
Debug.locals.put("mFasesEnvio", _mfasesenvio);
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 281;BA.debugLine="For Each k2 As String In mFasesEnvio.Keys";
Debug.ShouldStop(16777216);
if (true) break;

case 32:
//for
this.state = 35;
group56 = _mfasesenvio.runMethod(false,"Keys");
index56 = 0;
groupLen56 = group56.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k2", _k2);
this.state = 54;
if (true) break;

case 54:
//C
this.state = 35;
if (index56 < groupLen56) {
this.state = 34;
_k2 = BA.ObjectToString(group56.runMethod(false,"Get",index56));Debug.locals.put("k2", _k2);}
if (true) break;

case 55:
//C
this.state = 54;
index56++;
Debug.locals.put("k2", _k2);
if (true) break;

case 34:
//C
this.state = 55;
 BA.debugLineNum = 282;BA.debugLine="Log(k2 & \": \" & mFasesEnvio.Get(k2))";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","888277058",RemoteObject.concat(_k2,RemoteObject.createImmutable(": "),_mfasesenvio.runMethod(false,"Get",(Object)((_k2)))),0);
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
Debug.locals.put("k2", _k2);
;
 BA.debugLineNum = 284;BA.debugLine="Dim CodEstado As String=mFasesEnvio.Get(\"CodEs";
Debug.ShouldStop(134217728);
_codestado = BA.ObjectToString(_mfasesenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CodEstado")))));Debug.locals.put("CodEstado", _codestado);Debug.locals.put("CodEstado", _codestado);
 BA.debugLineNum = 285;BA.debugLine="DateTime.DateFormat=\"ddMMyyyy\"";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("ddMMyyyy"));
 BA.debugLineNum = 286;BA.debugLine="Dim FestL As Long=DateTime.DateParse(mFasesEnv";
Debug.ShouldStop(536870912);
_festl = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_mfasesenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaEstado")))))));Debug.locals.put("FestL", _festl);Debug.locals.put("FestL", _festl);
 BA.debugLineNum = 287;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 288;BA.debugLine="mFasesEnvio.put(\"FechaEstado\",DateTime.Date(Fe";
Debug.ShouldStop(-2147483648);
_mfasesenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("FechaEstado"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_festl)))));
 BA.debugLineNum = 290;BA.debugLine="DateTime.TimeFormat=\"HHmmss\"";
Debug.ShouldStop(2);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 291;BA.debugLine="Dim TestL As Long=DateTime.TimeParse(mFasesEnv";
Debug.ShouldStop(4);
_testl = parent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(BA.ObjectToString(_mfasesenvio.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HoraEstado")))))));Debug.locals.put("TestL", _testl);Debug.locals.put("TestL", _testl);
 BA.debugLineNum = 292;BA.debugLine="DateTime.DateFormat=\"hh:mm:ss\"";
Debug.ShouldStop(8);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("hh:mm:ss"));
 BA.debugLineNum = 293;BA.debugLine="mFasesEnvio.put(\"HoraEstado\",DateTime.Date(Tes";
Debug.ShouldStop(16);
_mfasesenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("HoraEstado"))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_testl)))));
 BA.debugLineNum = 295;BA.debugLine="Dim NombreEstadoEnvio As String";
Debug.ShouldStop(64);
_nombreestadoenvio = RemoteObject.createImmutable("");Debug.locals.put("NombreEstadoEnvio", _nombreestadoenvio);
 BA.debugLineNum = 296;BA.debugLine="Dim DescripcionEstadoEnvio As String";
Debug.ShouldStop(128);
_descripcionestadoenvio = RemoteObject.createImmutable("");Debug.locals.put("DescripcionEstadoEnvio", _descripcionestadoenvio);
 BA.debugLineNum = 297;BA.debugLine="For Each InfoEstado() As String In cmAuxCorreo";
Debug.ShouldStop(256);
if (true) break;

case 36:
//for
this.state = 43;
group70 = parent._cmauxcorreosexpress._lstestadoscorreosexpress /*RemoteObject*/ ;
index70 = 0;
groupLen70 = group70.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("InfoEstado", _infoestado);
this.state = 56;
if (true) break;

case 56:
//C
this.state = 43;
if (index70 < groupLen70) {
this.state = 38;
_infoestado = (group70.runMethod(false,"Get",index70));Debug.locals.put("InfoEstado", _infoestado);}
if (true) break;

case 57:
//C
this.state = 56;
index70++;
Debug.locals.put("InfoEstado", _infoestado);
if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 298;BA.debugLine="If InfoEstado(0)=CodEstado Then";
Debug.ShouldStop(512);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_infoestado.getArrayElement(true,BA.numberCast(int.class, 0)),_codestado)) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 299;BA.debugLine="NombreEstadoEnvio=InfoEstado(1)";
Debug.ShouldStop(1024);
_nombreestadoenvio = _infoestado.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("NombreEstadoEnvio", _nombreestadoenvio);
 BA.debugLineNum = 300;BA.debugLine="DescripcionEstadoEnvio=InfoEstado(2)";
Debug.ShouldStop(2048);
_descripcionestadoenvio = _infoestado.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("DescripcionEstadoEnvio", _descripcionestadoenvio);
 BA.debugLineNum = 301;BA.debugLine="mFasesEnvio.Put(\"NombreEstadoEnvio\",NombreEs";
Debug.ShouldStop(4096);
_mfasesenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreEstadoEnvio"))),(Object)((_nombreestadoenvio)));
 BA.debugLineNum = 302;BA.debugLine="mFasesEnvio.Put(\"DescripcionEstadoEnvio\",Des";
Debug.ShouldStop(8192);
_mfasesenvio.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DescripcionEstadoEnvio"))),(Object)((_descripcionestadoenvio)));
 BA.debugLineNum = 303;BA.debugLine="mFasesEnvio.Remove(\"DescEstado\")";
Debug.ShouldStop(16384);
_mfasesenvio.runVoidMethod ("Remove",(Object)((RemoteObject.createImmutable("DescEstado"))));
 BA.debugLineNum = 304;BA.debugLine="Exit";
Debug.ShouldStop(32768);
this.state = 43;
if (true) break;
 if (true) break;

case 42:
//C
this.state = 57;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 53;
Debug.locals.put("InfoEstado", _infoestado);
;
 BA.debugLineNum = 308;BA.debugLine="DateTime.DateFormat=DateFormatOr";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformator);
 BA.debugLineNum = 309;BA.debugLine="DateTime.TimeFormat=TimeFormatOr";
Debug.ShouldStop(1048576);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformator);
 BA.debugLineNum = 310;BA.debugLine="Log(\"map Fase \" & mFasesEnvio)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","888277086",RemoteObject.concat(RemoteObject.createImmutable("map Fase "),_mfasesenvio),0);
 BA.debugLineNum = 311;BA.debugLine="lstFases.Add(mFasesEnvio)";
Debug.ShouldStop(4194304);
_lstfases.runVoidMethod ("Add",(Object)((_mfasesenvio.getObject())));
 if (true) break;
if (true) break;

case 44:
//C
this.state = 45;
Debug.locals.put("mFasesEnvio", _mfasesenvio);
;
 BA.debugLineNum = 313;BA.debugLine="Return lstFases";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_lstfases));return;};
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _complete(RemoteObject __ref,RemoteObject _wsresponse) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _btnactualizarinfotracking_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizarInfoTracking_Click (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("btnactualizarinfotracking_click")) { __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","btnactualizarinfotracking_click", __ref); return;}
ResumableSub_btnActualizarInfoTracking_Click rsub = new ResumableSub_btnActualizarInfoTracking_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnActualizarInfoTracking_Click extends BA.ResumableSub {
public ResumableSub_btnActualizarInfoTracking_Click(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _sresult = RemoteObject.createImmutable("");
RemoteObject _lstfases = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActualizarInfoTracking_Click (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,175);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 177;BA.debugLine="If txtNumExpedicion.Text=\"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 27;
 BA.debugLineNum = 178;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Introduce u";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Introduce un número de expedición")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 179;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 27;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 180;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 183;BA.debugLine="jamTableViewInfoTrackingEnvio.LimpiarTabla";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 184;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 185;BA.debugLine="Wait For (CargaCredenciales) complete (sResult A";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), __ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_cargacredenciales" /*RemoteObject*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 6;
_sresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResult", _sresult);
;
 BA.debugLineNum = 186;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 187;BA.debugLine="If sResult<>\"OK\" Then Return";
Debug.ShouldStop(67108864);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",_sresult,BA.ObjectToString("OK"))) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
if (true) return ;
if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 189;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 190;BA.debugLine="wait for (ActualizarInfoExpedicion(\"I519390002\",";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), __ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_actualizarinfoexpedicion" /*RemoteObject*/ ,(Object)(BA.ObjectToString("I519390002")),(Object)(__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 30;
return;
case 30:
//C
this.state = 12;
_lstfases = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("lstFases", _lstfases);
;
 BA.debugLineNum = 191;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 193;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 194;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTrackin";
Debug.ShouldStop(2);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_lstfases.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 195;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _rsub);
this.state = 31;
return;
case 31:
//C
this.state = 12;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 196;BA.debugLine="jamTableViewInfoTrackingEnvio.SetMouseCursor(fx.";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 197;BA.debugLine="lstFases.Initialize";
Debug.ShouldStop(16);
_lstfases.runVoidMethod ("Initialize");
 BA.debugLineNum = 198;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32);
if (true) break;

case 12:
//if
this.state = 26;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 199;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(64);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 200;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 201;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 18;
;
 BA.debugLineNum = 202;BA.debugLine="ExitApplication";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 204;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2048);

case 18:
//if
this.state = 25;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 205;BA.debugLine="If mResultSetData.Get(\"msgAviso\")<>\"La lista d";
Debug.ShouldStop(4096);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("!",_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))),RemoteObject.createImmutable(("La lista de datos está vacía.")))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetD";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 207;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnactualizarinfotracking_click"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = -1;
;
 BA.debugLineNum = 214;BA.debugLine="End Sub";
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
public static void  _btnalbarannav_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnAlbaranNAV_Click (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,389);
if (RapidSub.canDelegate("btnalbarannav_click")) { __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","btnalbarannav_click", __ref); return;}
ResumableSub_btnAlbaranNAV_Click rsub = new ResumableSub_btnAlbaranNAV_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnAlbaranNAV_Click extends BA.ResumableSub {
public ResumableSub_btnAlbaranNAV_Click(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _pagnavtipodoc = RemoteObject.createImmutable(0);
RemoteObject _tituloventana = RemoteObject.createImmutable("");
RemoteObject _doc = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnAlbaranNAV_Click (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,389);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 390;BA.debugLine="Dim  PagNAVTipoDoc As Int";
Debug.ShouldStop(32);
_pagnavtipodoc = RemoteObject.createImmutable(0);Debug.locals.put("PagNAVTipoDoc", _pagnavtipodoc);
 BA.debugLineNum = 391;BA.debugLine="Dim TituloVentana As String";
Debug.ShouldStop(64);
_tituloventana = RemoteObject.createImmutable("");Debug.locals.put("TituloVentana", _tituloventana);
 BA.debugLineNum = 392;BA.debugLine="Dim Doc As String=txtRef.Text";
Debug.ShouldStop(128);
_doc = __ref.getField(false,"_txtref" /*RemoteObject*/ ).runMethod(true,"getText");Debug.locals.put("Doc", _doc);Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 393;BA.debugLine="Select True";
Debug.ShouldStop(256);
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_doc,BA.ObjectToString(""))),_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))),_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))))) {
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
default: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 395;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha ind";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha indicado documento.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 396;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnalbarannav_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 BA.debugLineNum = 397;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 399;BA.debugLine="PagNAVTipoDoc=130";
Debug.ShouldStop(16384);
_pagnavtipodoc = BA.numberCast(int.class, 130);Debug.locals.put("PagNAVTipoDoc", _pagnavtipodoc);
 BA.debugLineNum = 400;BA.debugLine="TituloVentana=\"Histórico albaranes venta\"";
Debug.ShouldStop(32768);
_tituloventana = BA.ObjectToString("Histórico albaranes venta");Debug.locals.put("TituloVentana", _tituloventana);
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 402;BA.debugLine="PagNAVTipoDoc=5745";
Debug.ShouldStop(131072);
_pagnavtipodoc = BA.numberCast(int.class, 5745);Debug.locals.put("PagNAVTipoDoc", _pagnavtipodoc);
 BA.debugLineNum = 403;BA.debugLine="TituloVentana=\"Histórico recep. transferencia\"";
Debug.ShouldStop(262144);
_tituloventana = BA.ObjectToString("Histórico recep. transferencia");Debug.locals.put("TituloVentana", _tituloventana);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 405;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Sólo es posible navegar a documentos tipo ALBV o RT.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 406;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnalbarannav_click"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 407;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 409;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirLin";
Debug.ShouldStop(16777216);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(_tituloventana),(Object)(_pagnavtipodoc),(Object)(BA.ObjectToString("No.")),(Object)(_doc));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 410;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "btnalbarannav_click"), _rsub);
this.state = 13;
return;
case 13:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","btnsalir_click", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="LimpiarDatosCabEnvio";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_limpiardatoscabenvio" /*RemoteObject*/ );
 BA.debugLineNum = 124;BA.debugLine="jamTableViewInfoTrackingEnvio.GuardarConfiguracio";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 125;BA.debugLine="jamTableViewInfoTrackingEnvio.LimpiarTabla";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="frm.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargacredenciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("cargacredenciales")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","cargacredenciales", __ref);}
ResumableSub_CargaCredenciales rsub = new ResumableSub_CargaCredenciales(null,__ref);
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
public static class ResumableSub_CargaCredenciales extends BA.ResumableSub {
public ResumableSub_CargaCredenciales(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstresws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,131);
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
 BA.debugLineNum = 133;BA.debugLine="CargaDatosWebServiceTransporte(17)   '17 es el ID";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_cargadatoswebservicetransporte" /*void*/ ,(Object)(BA.numberCast(int.class, 17)));
 BA.debugLineNum = 134;BA.debugLine="Wait For CargaDatosWebServiceTransporte_Completed";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","cargadatoswebservicetransporte_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "cargacredenciales"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstresws = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstResWS", _lstresws);
;
 BA.debugLineNum = 135;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 136;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 138;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
Debug.ShouldStop(512);
_mdatosws = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstresws.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDatosWS", _mdatosws);Debug.locals.put("mDatosWS", _mdatosws);
 BA.debugLineNum = 140;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
Debug.ShouldStop(2048);
__ref.setField ("_usuariows" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UsuarioWS"))))));
 BA.debugLineNum = 141;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
Debug.ShouldStop(4096);
__ref.setField ("_passwordws" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PasswordWS"))))));
 BA.debugLineNum = 145;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_usuariows" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_passwordws" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 146;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 148;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
public static void  _cargadatoswebservicetransporte_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstresws) throws Exception{
}
public static void  _cargadatoswebservicetransporte(RemoteObject __ref,RemoteObject _idtransportista) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("cargadatoswebservicetransporte")) { __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","cargadatoswebservicetransporte", __ref, _idtransportista); return;}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(null,__ref,_idtransportista);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref,RemoteObject _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _idtransportista;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,152);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDTransportista", _idtransportista);
 BA.debugLineNum = 154;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(33554432);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 155;BA.debugLine="Dim lstRes As List";
Debug.ShouldStop(67108864);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 156;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(134217728);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 157;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
Debug.ShouldStop(268435456);
_comandojrdc = BA.ObjectToString("DatosWebServiceTransporte");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 158;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
Debug.ShouldStop(536870912);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(BA.ObjectToString("http://192.168.10.20:17179/rdc")),(Object)(_comandojrdc),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtransportista)}))),(Object)(__ref));
 BA.debugLineNum = 159;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 160;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 161;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 163;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 164;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 166;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
Debug.ShouldStop(32);
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 167;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 170;BA.debugLine="CallSubDelayed3(Me,\"CargaDatosWebServiceTransport";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("CargaDatosWebServiceTransporte_Completed")),(Object)((_accion)),(Object)((_lstres)));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cinfoexpedicioncorreosexpress._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cinfoexpedicioncorreosexpress._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cinfoexpedicioncorreosexpress._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cinfoexpedicioncorreosexpress._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cinfoexpedicioncorreosexpress._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cinfoexpedicioncorreosexpress._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private mNumeroExpedicion As String";
cinfoexpedicioncorreosexpress._mnumeroexpedicion = RemoteObject.createImmutable("");__ref.setField("_mnumeroexpedicion",cinfoexpedicioncorreosexpress._mnumeroexpedicion);
 //BA.debugLineNum = 10;BA.debugLine="Private lblTitleNumExpedicion As Label";
cinfoexpedicioncorreosexpress._lbltitlenumexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlenumexpedicion",cinfoexpedicioncorreosexpress._lbltitlenumexpedicion);
 //BA.debugLineNum = 11;BA.debugLine="Private txtNumExpedicion As TextField";
cinfoexpedicioncorreosexpress._txtnumexpedicion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumexpedicion",cinfoexpedicioncorreosexpress._txtnumexpedicion);
 //BA.debugLineNum = 13;BA.debugLine="Private UsuarioWS As String";
cinfoexpedicioncorreosexpress._usuariows = RemoteObject.createImmutable("");__ref.setField("_usuariows",cinfoexpedicioncorreosexpress._usuariows);
 //BA.debugLineNum = 14;BA.debugLine="Private PasswordWs As String";
cinfoexpedicioncorreosexpress._passwordws = RemoteObject.createImmutable("");__ref.setField("_passwordws",cinfoexpedicioncorreosexpress._passwordws);
 //BA.debugLineNum = 16;BA.debugLine="Private Dialog As B4XDialog";
cinfoexpedicioncorreosexpress._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cinfoexpedicioncorreosexpress._dialog);
 //BA.debugLineNum = 21;BA.debugLine="Public CallbackInfoEnvio As Object";
cinfoexpedicioncorreosexpress._callbackinfoenvio = RemoteObject.createNew ("Object");__ref.setField("_callbackinfoenvio",cinfoexpedicioncorreosexpress._callbackinfoenvio);
 //BA.debugLineNum = 23;BA.debugLine="Private jamTableViewInfoTrackingEnvio As jamTable";
cinfoexpedicioncorreosexpress._jamtableviewinfotrackingenvio = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewinfotrackingenvio",cinfoexpedicioncorreosexpress._jamtableviewinfotrackingenvio);
 //BA.debugLineNum = 24;BA.debugLine="Private txtRef As TextField";
cinfoexpedicioncorreosexpress._txtref = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtref",cinfoexpedicioncorreosexpress._txtref);
 //BA.debugLineNum = 25;BA.debugLine="Private txtFecha As TextField";
cinfoexpedicioncorreosexpress._txtfecha = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfecha",cinfoexpedicioncorreosexpress._txtfecha);
 //BA.debugLineNum = 26;BA.debugLine="Private txtDirRte As TextField";
cinfoexpedicioncorreosexpress._txtdirrte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdirrte",cinfoexpedicioncorreosexpress._txtdirrte);
 //BA.debugLineNum = 27;BA.debugLine="Private txtPobRte As TextField";
cinfoexpedicioncorreosexpress._txtpobrte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpobrte",cinfoexpedicioncorreosexpress._txtpobrte);
 //BA.debugLineNum = 28;BA.debugLine="Private txtCodPosNacRte As TextField";
cinfoexpedicioncorreosexpress._txtcodposnacrte = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodposnacrte",cinfoexpedicioncorreosexpress._txtcodposnacrte);
 //BA.debugLineNum = 29;BA.debugLine="Private txtNomDest As TextField";
cinfoexpedicioncorreosexpress._txtnomdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnomdest",cinfoexpedicioncorreosexpress._txtnomdest);
 //BA.debugLineNum = 30;BA.debugLine="Private txtDirDest As TextField";
cinfoexpedicioncorreosexpress._txtdirdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdirdest",cinfoexpedicioncorreosexpress._txtdirdest);
 //BA.debugLineNum = 31;BA.debugLine="Private txtPobDest As TextField";
cinfoexpedicioncorreosexpress._txtpobdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtpobdest",cinfoexpedicioncorreosexpress._txtpobdest);
 //BA.debugLineNum = 32;BA.debugLine="Private txtCodPosNacDest As TextField";
cinfoexpedicioncorreosexpress._txtcodposnacdest = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodposnacdest",cinfoexpedicioncorreosexpress._txtcodposnacdest);
 //BA.debugLineNum = 33;BA.debugLine="Private txtNumBultos As TextField";
cinfoexpedicioncorreosexpress._txtnumbultos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnumbultos",cinfoexpedicioncorreosexpress._txtnumbultos);
 //BA.debugLineNum = 34;BA.debugLine="Private txtKilos As TextField";
cinfoexpedicioncorreosexpress._txtkilos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtkilos",cinfoexpedicioncorreosexpress._txtkilos);
 //BA.debugLineNum = 35;BA.debugLine="Private txtVolumen As TextField";
cinfoexpedicioncorreosexpress._txtvolumen = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtvolumen",cinfoexpedicioncorreosexpress._txtvolumen);
 //BA.debugLineNum = 36;BA.debugLine="Private txtCodIncEstado As TextField";
cinfoexpedicioncorreosexpress._txtcodincestado = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodincestado",cinfoexpedicioncorreosexpress._txtcodincestado);
 //BA.debugLineNum = 37;BA.debugLine="Private txtDescIncEstado As TextField";
cinfoexpedicioncorreosexpress._txtdescincestado = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtdescincestado",cinfoexpedicioncorreosexpress._txtdescincestado);
 //BA.debugLineNum = 38;BA.debugLine="Private btnAlbaranNAV As Button";
cinfoexpedicioncorreosexpress._btnalbarannav = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnalbarannav",cinfoexpedicioncorreosexpress._btnalbarannav);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 118;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="EventData.Consume";
Debug.ShouldStop(4194304);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getelements(RemoteObject __ref,RemoteObject _m,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetElements (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("getelements")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","getelements", __ref, _m, _key);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
Debug.locals.put("key", _key);
 BA.debugLineNum = 371;BA.debugLine="Sub GetElements (m As Map, key As String) As List";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="Dim res As List";
Debug.ShouldStop(524288);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 373;BA.debugLine="If m.ContainsKey(key) = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"ContainsKey",(Object)((_key))),cinfoexpedicioncorreosexpress.__c.getField(true,"False"))) { 
 BA.debugLineNum = 374;BA.debugLine="res.Initialize";
Debug.ShouldStop(2097152);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 375;BA.debugLine="Return res";
Debug.ShouldStop(4194304);
if (true) return _res;
 }else {
 BA.debugLineNum = 377;BA.debugLine="Dim value As Object = m.Get(key)";
Debug.ShouldStop(16777216);
_value = _m.runMethod(false,"Get",(Object)((_key)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 378;BA.debugLine="If value Is List Then Return value";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value);};
 BA.debugLineNum = 379;BA.debugLine="res.Initialize";
Debug.ShouldStop(67108864);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 380;BA.debugLine="res.Add(value)";
Debug.ShouldStop(134217728);
_res.runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 381;BA.debugLine="Return res";
Debug.ShouldStop(268435456);
if (true) return _res;
 };
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _infoexpedicioncorreosexpress(RemoteObject __ref,RemoteObject _solicitante,RemoteObject _numexpedicion) throws Exception{
try {
		Debug.PushSubsStack("InfoExpedicionCorreosExpress (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("infoexpedicioncorreosexpress")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","infoexpedicioncorreosexpress", __ref, _solicitante, _numexpedicion);}
ResumableSub_InfoExpedicionCorreosExpress rsub = new ResumableSub_InfoExpedicionCorreosExpress(null,__ref,_solicitante,_numexpedicion);
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
public static class ResumableSub_InfoExpedicionCorreosExpress extends BA.ResumableSub {
public ResumableSub_InfoExpedicionCorreosExpress(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref,RemoteObject _solicitante,RemoteObject _numexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._solicitante = _solicitante;
this._numexpedicion = _numexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _solicitante;
RemoteObject _numexpedicion;
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _parseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mseguimientoenviosrequest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _m2xml = RemoteObject.declareNull("b4j.docU.map2xml");
RemoteObject _sxml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlcorreosexpress = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InfoExpedicionCorreosExpress (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,319);
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
Debug.locals.put("Solicitante", _solicitante);
Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 322;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(2);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 323;BA.debugLine="xm.Initialize";
Debug.ShouldStop(4);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 324;BA.debugLine="Dim ParsedData As Map";
Debug.ShouldStop(8);
_parseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ParsedData", _parseddata);
 BA.debugLineNum = 325;BA.debugLine="ParsedData = xm.Parse(File.ReadString(File.DirAss";
Debug.ShouldStop(16);
_parseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("PlantillaXLMCorreosSeguimientoEnvio.xml")))));Debug.locals.put("ParsedData", _parseddata);
 BA.debugLineNum = 328;BA.debugLine="Dim mSeguimientoEnviosRequest As Map=ParsedData.G";
Debug.ShouldStop(128);
_mseguimientoenviosrequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mseguimientoenviosrequest = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _parseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SeguimientoEnviosRequest")))));Debug.locals.put("mSeguimientoEnviosRequest", _mseguimientoenviosrequest);Debug.locals.put("mSeguimientoEnviosRequest", _mseguimientoenviosrequest);
 BA.debugLineNum = 330;BA.debugLine="For Each k As String In mSeguimientoEnviosRequest";
Debug.ShouldStop(512);
if (true) break;

case 1:
//for
this.state = 4;
group6 = _mseguimientoenviosrequest.runMethod(false,"Keys");
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 4;
if (index6 < groupLen6) {
this.state = 3;
_k = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("k", _k);}
if (true) break;

case 12:
//C
this.state = 11;
index6++;
Debug.locals.put("k", _k);
if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 331;BA.debugLine="Log(\"k :\" & k)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","888342540",RemoteObject.concat(RemoteObject.createImmutable("k :"),_k),0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 336;BA.debugLine="mSeguimientoEnviosRequest.Put(\"Solicitante\",Solic";
Debug.ShouldStop(32768);
_mseguimientoenviosrequest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Solicitante"))),(Object)((_solicitante)));
 BA.debugLineNum = 337;BA.debugLine="mSeguimientoEnviosRequest.Put(\"Dato\",NumExpedicio";
Debug.ShouldStop(65536);
_mseguimientoenviosrequest.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dato"))),(Object)((_numexpedicion)));
 BA.debugLineNum = 341;BA.debugLine="Dim m2Xml As Map2Xml";
Debug.ShouldStop(1048576);
_m2xml = RemoteObject.createNew ("b4j.docU.map2xml");Debug.locals.put("m2Xml", _m2xml);
 BA.debugLineNum = 342;BA.debugLine="m2Xml.Initialize";
Debug.ShouldStop(2097152);
_m2xml.runClassMethod (b4j.docU.map2xml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 343;BA.debugLine="Dim sXML As String=m2Xml.MapToXml(ParsedData)";
Debug.ShouldStop(4194304);
_sxml = _m2xml.runClassMethod (b4j.docU.map2xml.class, "_maptoxml" /*RemoteObject*/ ,(Object)(_parseddata));Debug.locals.put("sXML", _sxml);Debug.locals.put("sXML", _sxml);
 BA.debugLineNum = 345;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16777216);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 346;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 347;BA.debugLine="Dim URLCorreosExpress As String=\"https://www.corr";
Debug.ShouldStop(67108864);
_urlcorreosexpress = BA.ObjectToString("https://www.correosexpress.com/wpsc/apiRestSeguimientoEnvios/rest/seguimientoEnvios");Debug.locals.put("URLCorreosExpress", _urlcorreosexpress);Debug.locals.put("URLCorreosExpress", _urlcorreosexpress);
 BA.debugLineNum = 348;BA.debugLine="job.Username=UsuarioWS";
Debug.ShouldStop(134217728);
_job.setField ("_username" /*RemoteObject*/ ,__ref.getField(true,"_usuariows" /*RemoteObject*/ ));
 BA.debugLineNum = 349;BA.debugLine="job.Password=PasswordWs";
Debug.ShouldStop(268435456);
_job.setField ("_password" /*RemoteObject*/ ,__ref.getField(true,"_passwordws" /*RemoteObject*/ ));
 BA.debugLineNum = 350;BA.debugLine="job.PostString(URLCorreosExpress,sXML)";
Debug.ShouldStop(536870912);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlcorreosexpress),(Object)(_sxml));
 BA.debugLineNum = 352;BA.debugLine="job.GetRequest.SetContentType(\"application/xml\")";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/xml")));
 BA.debugLineNum = 354;BA.debugLine="job.GetRequest.SetContentEncoding(\"UTF-8\")";
Debug.ShouldStop(2);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentEncoding",(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 356;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "infoexpedicioncorreosexpress"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 5;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 357;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 359;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(64);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 360;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 361;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 363;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 364;BA.debugLine="Return \"ERROR de comunicacion con www.correosexp";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(RemoteObject.concat(RemoteObject.createImmutable("ERROR de comunicacion con www.correosexpress.com webservice"),((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) ? ((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))) : ((RemoteObject.createImmutable("")))))));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 366;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _numexpedicion) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","initialize", __ref, _ba, _numexpedicion);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize(NumExpedicion As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="mNumeroExpedicion=NumExpedicion";
Debug.ShouldStop(8192);
__ref.setField ("_mnumeroexpedicion" /*RemoteObject*/ ,_numexpedicion);
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
public static RemoteObject  _limpiardatoscabenvio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LimpiarDatosCabEnvio (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("limpiardatoscabenvio")) { return __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","limpiardatoscabenvio", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Sub LimpiarDatosCabEnvio";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="txtCodIncEstado.Text=\"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_txtcodincestado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 103;BA.debugLine="txtCodPosNacDest.Text=\"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtcodposnacdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 104;BA.debugLine="txtDescIncEstado.Text=\"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txtdescincestado" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 105;BA.debugLine="txtDirDest.Text=\"\"";
Debug.ShouldStop(256);
__ref.getField(false,"_txtdirdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 106;BA.debugLine="txtDirRte.Text=\"\"";
Debug.ShouldStop(512);
__ref.getField(false,"_txtdirrte" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 107;BA.debugLine="txtFecha.Text=\"\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtfecha" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 108;BA.debugLine="txtKilos.Text=\"\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtkilos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 109;BA.debugLine="txtNomDest.Text=\"\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtnomdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 110;BA.debugLine="txtNumBultos.Text=\"\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtnumbultos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 111;BA.debugLine="txtNumExpedicion.Text=\"\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 112;BA.debugLine="txtPobDest.Text=\"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtpobdest" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 113;BA.debugLine="txtPobRte.Text=\"\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtpobrte" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 114;BA.debugLine="txtRef.Text=\"\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtref" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 115;BA.debugLine="txtVolumen.Text=\"\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtvolumen" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cinfoexpedicioncorreosexpress","show", __ref); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cinfoexpedicioncorreosexpress parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpedicioncorreosexpress parent;
RemoteObject _lstcf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cinfoexpedicioncorreosexpress) ","cinfoexpedicioncorreosexpress",36,__ref.getField(false, "ba"),__ref,50);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 52;BA.debugLine="cmAuxCorreosExpress.CargaListaEstadosCorreosExpre";
Debug.ShouldStop(524288);
parent._cmauxcorreosexpress.runVoidMethod ("_cargalistaestadoscorreosexpress" /*RemoteObject*/ );
 BA.debugLineNum = 53;BA.debugLine="cmAuxCorreosExpress.CargaListaIncidenciasCorreosE";
Debug.ShouldStop(1048576);
parent._cmauxcorreosexpress.runVoidMethod ("_cargalistaincidenciascorreosexpress" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="frm.Icon =Main.IconoFormularios";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 64;BA.debugLine="frm.RootPane.LoadLayout(\"scrInfoTrackingEnvioCor";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrInfoTrackingEnvioCorreosExpress")));
 BA.debugLineNum = 65;BA.debugLine="Utilidades.SetFormMaximized(frm)";
Debug.ShouldStop(1);
parent._utilidades.runVoidMethod ("_setformmaximized" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="Sleep(0)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "show"),BA.numberCast(int.class, 0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 67;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    \" &  \"Tr";
Debug.ShouldStop(4);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("    "),RemoteObject.createImmutable("Tracking Envío Correos Express")));
 BA.debugLineNum = 69;BA.debugLine="jamTableViewInfoTrackingEnvio.EstadoMenuItem(jam";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 70;BA.debugLine="jamTableViewInfoTrackingEnvio.EstadoMenuItem(jam";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 72;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(128);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 74;BA.debugLine="Dim lstCF As List";
Debug.ShouldStop(512);
_lstcf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstCF", _lstcf);
 BA.debugLineNum = 75;BA.debugLine="lstCF.initialize";
Debug.ShouldStop(1024);
_lstcf.runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTrackin";
Debug.ShouldStop(4096);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewinfotrackingenvio" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FasesTrackingExpedicionCorreosExpress.json")),(Object)(_lstcf));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 78;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 79;BA.debugLine="Log(mRes)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","887818269",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 80;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 81;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 82;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpedicioncorreosexpress", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 83;BA.debugLine="frm.Close";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 91;BA.debugLine="frm.Show";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 92;BA.debugLine="If mNumeroExpedicion<>\"\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mnumeroexpedicion" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 93;BA.debugLine="txtNumExpedicion.Text=mNumeroExpedicion";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnumexpedicion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_mnumeroexpedicion" /*RemoteObject*/ ));
 BA.debugLineNum = 94;BA.debugLine="btnActualizarInfoTracking_Click";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cinfoexpedicioncorreosexpress.class, "_btnactualizarinfotracking_click" /*void*/ );
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
}