package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cinfoexpediciondhl_subs_0 {


public static void  _actualizarinfoexpediciondhl(RemoteObject __ref,RemoteObject _iddatobuscado) throws Exception{
try {
		Debug.PushSubsStack("ActualizarInfoExpedicionDHL (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("actualizarinfoexpediciondhl")) { __ref.runUserSub(false, "cinfoexpediciondhl","actualizarinfoexpediciondhl", __ref, _iddatobuscado); return;}
ResumableSub_ActualizarInfoExpedicionDHL rsub = new ResumableSub_ActualizarInfoExpedicionDHL(null,__ref,_iddatobuscado);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizarInfoExpedicionDHL extends BA.ResumableSub {
public ResumableSub_ActualizarInfoExpedicionDHL(b4j.docU.cinfoexpediciondhl parent,RemoteObject __ref,RemoteObject _iddatobuscado) {
this.parent = parent;
this.__ref = __ref;
this._iddatobuscado = _iddatobuscado;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpediciondhl parent;
RemoteObject _iddatobuscado;
RemoteObject _acciontracking = RemoteObject.createImmutable("");
RemoteObject _lstresultadotracking = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcred = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _creduser = RemoteObject.createImmutable("");
RemoteObject _credpswd = RemoteObject.createImmutable("");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _accesstoken = RemoteObject.createImmutable("");
RemoteObject _cookie = RemoteObject.createImmutable("");
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lsttoken = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _datoscsv = null;
RemoteObject _expiration = RemoteObject.createImmutable(0L);
RemoteObject _mjobresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sfechahora = RemoteObject.createImmutable("");
RemoteObject _fh = null;
RemoteObject _lfechahora = RemoteObject.createImmutable(0L);
RemoteObject group66;
int index66;
int groupLen66;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarInfoExpedicionDHL (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,57);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("IDDatoBuscado", _iddatobuscado);
 BA.debugLineNum = 58;BA.debugLine="Dim AccionTracking As String";
Debug.ShouldStop(33554432);
_acciontracking = RemoteObject.createImmutable("");Debug.locals.put("AccionTracking", _acciontracking);
 BA.debugLineNum = 59;BA.debugLine="Dim lstResultadoTracking As List";
Debug.ShouldStop(67108864);
_lstresultadotracking = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstResultadoTracking", _lstresultadotracking);
 BA.debugLineNum = 60;BA.debugLine="lstResultadoTracking.Initialize";
Debug.ShouldStop(134217728);
_lstresultadotracking.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="Wait For(CargaDatosWebServiceTransporte(1)) compl";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), __ref.runClassMethod (b4j.docU.cinfoexpediciondhl.class, "_cargadatoswebservicetransporte" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1))));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 64;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 66;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 67;BA.debugLine="AccionTracking=\"ErrorWS\"";
Debug.ShouldStop(4);
_acciontracking = BA.ObjectToString("ErrorWS");Debug.locals.put("AccionTracking", _acciontracking);
 BA.debugLineNum = 68;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error credenc";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error credenciales DHL")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 69;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 4;
;
 BA.debugLineNum = 70;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 72;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
Debug.ShouldStop(128);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 73;BA.debugLine="Dim mCred As Map=lstRes.Get(0)";
Debug.ShouldStop(256);
_mcred = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mcred = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mCred", _mcred);Debug.locals.put("mCred", _mcred);
 BA.debugLineNum = 74;BA.debugLine="Dim CredUser As String=mCred.Get(\"UsuarioWS\")";
Debug.ShouldStop(512);
_creduser = BA.ObjectToString(_mcred.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UsuarioWS")))));Debug.locals.put("CredUser", _creduser);Debug.locals.put("CredUser", _creduser);
 BA.debugLineNum = 75;BA.debugLine="Dim CredPswd As String=mCred.Get(\"PasswordWS\")";
Debug.ShouldStop(1024);
_credpswd = BA.ObjectToString(_mcred.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PasswordWS")))));Debug.locals.put("CredPswd", _credpswd);Debug.locals.put("CredPswd", _credpswd);
 BA.debugLineNum = 78;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(8192);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 79;BA.debugLine="Dim accessToken As String";
Debug.ShouldStop(16384);
_accesstoken = RemoteObject.createImmutable("");Debug.locals.put("accessToken", _accesstoken);
 BA.debugLineNum = 80;BA.debugLine="Dim Cookie As String";
Debug.ShouldStop(32768);
_cookie = RemoteObject.createImmutable("");Debug.locals.put("Cookie", _cookie);
 BA.debugLineNum = 81;BA.debugLine="Dim lstHeaders As List";
Debug.ShouldStop(65536);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 82;BA.debugLine="lstHeaders.Initialize";
Debug.ShouldStop(131072);
_lstheaders.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="lstHeaders.Add(Array As String(\"Expiration\",\"Toke";
Debug.ShouldStop(262144);
_lstheaders.runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Expiration"),BA.ObjectToString("Token"),RemoteObject.createImmutable("Cookie")}))));
 BA.debugLineNum = 84;BA.debugLine="If File.Exists(Main.UserTempFolder,\"info.csv\") Th";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 14;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("info.csv"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 86;BA.debugLine="Dim lstToken As List=su.LoadCSV2(Main.UserTempFo";
Debug.ShouldStop(2097152);
_lsttoken = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lsttoken = _su.runMethod(false,"LoadCSV2",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("info.csv")),(Object)(BA.ObjectToChar(",")),(Object)(_lstheaders));Debug.locals.put("lstToken", _lsttoken);Debug.locals.put("lstToken", _lsttoken);
 BA.debugLineNum = 87;BA.debugLine="Dim DatosCSV() As String=lstToken.Get(0)";
Debug.ShouldStop(4194304);
_datoscsv = (_lsttoken.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("DatosCSV", _datoscsv);Debug.locals.put("DatosCSV", _datoscsv);
 BA.debugLineNum = 88;BA.debugLine="Dim Expiration As Long=DatosCSV(0)";
Debug.ShouldStop(8388608);
_expiration = BA.numberCast(long.class, _datoscsv.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("Expiration", _expiration);Debug.locals.put("Expiration", _expiration);
 BA.debugLineNum = 89;BA.debugLine="If DateTime.Now<Expiration Then";
Debug.ShouldStop(16777216);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_expiration)) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 90;BA.debugLine="accessToken=DatosCSV(1)";
Debug.ShouldStop(33554432);
_accesstoken = _datoscsv.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("accessToken", _accesstoken);
 BA.debugLineNum = 91;BA.debugLine="Cookie=DatosCSV(2)";
Debug.ShouldStop(67108864);
_cookie = _datoscsv.getArrayElement(true,BA.numberCast(int.class, 2));Debug.locals.put("Cookie", _cookie);
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 93;BA.debugLine="File.Delete(Main.UserTempFolder,\"info.csv\")";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("info.csv")));
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
 BA.debugLineNum = 97;BA.debugLine="If accessToken=\"\" Then";
Debug.ShouldStop(1);

case 14:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_accesstoken,BA.ObjectToString(""))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 99;BA.debugLine="Wait For(ObtenerTokensWebServiceDHL(CredUser,Cre";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), __ref.runClassMethod (b4j.docU.cinfoexpediciondhl.class, "_obtenertokenswebservicedhl" /*RemoteObject*/ ,(Object)(_creduser),(Object)(_credpswd)));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_mjobresponse = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mJobResponse", _mjobresponse);
;
 BA.debugLineNum = 102;BA.debugLine="Dim sResponse As String=mJobResponse.Get(\"sRespu";
Debug.ShouldStop(32);
_sresponse = BA.ObjectToString(_mjobresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sRespuestaWebService")))));Debug.locals.put("sResponse", _sresponse);Debug.locals.put("sResponse", _sresponse);
 BA.debugLineNum = 103;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(64);
if (true) break;

case 17:
//if
this.state = 22;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 104;BA.debugLine="AccionTracking=\"ErrorWS\"";
Debug.ShouldStop(128);
_acciontracking = BA.ObjectToString("ErrorWS");Debug.locals.put("AccionTracking", _acciontracking);
 BA.debugLineNum = 105;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web  service de DHL"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("El error puede estar en el servidor de DHL, o en la conexion a internet. Inténtalo más tarde."))),(Object)(RemoteObject.createImmutable("Error de comunicación")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 107;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 22;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 108;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 110;BA.debugLine="Dim Cookie As String=mJobResponse.Get(\"Cookie\")";
Debug.ShouldStop(8192);
_cookie = BA.ObjectToString(_mjobresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cookie")))));Debug.locals.put("Cookie", _cookie);Debug.locals.put("Cookie", _cookie);
 BA.debugLineNum = 111;BA.debugLine="Log(\"Cookie \" & Cookie)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","888801334",RemoteObject.concat(RemoteObject.createImmutable("Cookie "),_cookie),0);
 BA.debugLineNum = 113;BA.debugLine="Dim accessToken As String=mJobResponse.Get(\"Tok";
Debug.ShouldStop(65536);
_accesstoken = BA.ObjectToString(_mjobresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Token")))));Debug.locals.put("accessToken", _accesstoken);Debug.locals.put("accessToken", _accesstoken);
 BA.debugLineNum = 114;BA.debugLine="Log(\"accessToken \" & accessToken)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","888801337",RemoteObject.concat(RemoteObject.createImmutable("accessToken "),_accesstoken),0);
 BA.debugLineNum = 117;BA.debugLine="Dim Expiration As Long=DateTime.Now+(DateTime.T";
Debug.ShouldStop(1048576);
_expiration = RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),(parent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")),RemoteObject.createImmutable(20)}, "+*",1, 2);Debug.locals.put("Expiration", _expiration);Debug.locals.put("Expiration", _expiration);
 BA.debugLineNum = 118;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(2097152);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 119;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(4194304);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 120;BA.debugLine="lstRegistros.Add(Array As String(Expiration,acc";
Debug.ShouldStop(8388608);
_lstregistros.runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.NumberToString(_expiration),_accesstoken,_cookie}))));
 BA.debugLineNum = 121;BA.debugLine="su.SaveCSV2(Main.UserTempFolder,\"info.csv\",\",\",";
Debug.ShouldStop(16777216);
_su.runVoidMethod ("SaveCSV2",(Object)(parent._main._usertempfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("info.csv")),(Object)(BA.ObjectToChar(",")),(Object)(_lstregistros),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Expiration"),BA.ObjectToString("Token"),RemoteObject.createImmutable("Cookie")})))));
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 126;BA.debugLine="Wait For (EnvioDatosWebServiceDHL(IDDatoBuscado,a";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), __ref.runClassMethod (b4j.docU.cinfoexpediciondhl.class, "_enviodatoswebservicedhl" /*RemoteObject*/ ,(Object)(_iddatobuscado),(Object)(_accesstoken)));
this.state = 38;
return;
case 38:
//C
this.state = 24;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 128;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(-2147483648);
if (true) break;

case 24:
//if
this.state = 33;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 33;
 BA.debugLineNum = 129;BA.debugLine="AccionTracking=\"ErrorWS\"";
Debug.ShouldStop(1);
_acciontracking = BA.ObjectToString("ErrorWS");Debug.locals.put("AccionTracking", _acciontracking);
 BA.debugLineNum = 130;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de DHL."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse)),(Object)(RemoteObject.createImmutable("Error de comunicación")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 131;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 33;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 134;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(32);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 135;BA.debugLine="jp.Initialize(sResponse)";
Debug.ShouldStop(64);
_jp.runVoidMethod ("Initialize",(Object)(_sresponse));
 BA.debugLineNum = 136;BA.debugLine="lstResultadoTracking=jp.NextArray";
Debug.ShouldStop(128);
_lstresultadotracking = _jp.runMethod(false,"NextArray");Debug.locals.put("lstResultadoTracking", _lstresultadotracking);
 BA.debugLineNum = 138;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(512);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 139;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
Debug.ShouldStop(1024);
_timeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 140;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 141;BA.debugLine="DateTime.TimeFormat=\"HH-mm-ss\"";
Debug.ShouldStop(4096);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH-mm-ss"));
 BA.debugLineNum = 142;BA.debugLine="For Each m As Map In lstResultadoTracking";
Debug.ShouldStop(8192);
if (true) break;

case 29:
//for
this.state = 32;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group66 = _lstresultadotracking;
index66 = 0;
groupLen66 = group66.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 40;
if (true) break;

case 40:
//C
this.state = 32;
if (index66 < groupLen66) {
this.state = 31;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group66.runMethod(false,"Get",index66));Debug.locals.put("m", _m);}
if (true) break;

case 41:
//C
this.state = 40;
index66++;
Debug.locals.put("m", _m);
if (true) break;

case 31:
//C
this.state = 41;
 BA.debugLineNum = 143;BA.debugLine="Log(\"m recibido\" & m)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","888801366",RemoteObject.concat(RemoteObject.createImmutable("m recibido"),_m),0);
 BA.debugLineNum = 144;BA.debugLine="Dim sFechaHora As String=m.Get(\"DateTime\")";
Debug.ShouldStop(32768);
_sfechahora = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DateTime")))));Debug.locals.put("sFechaHora", _sfechahora);Debug.locals.put("sFechaHora", _sfechahora);
 BA.debugLineNum = 145;BA.debugLine="sFechaHora=sFechaHora.Replace(\"T\",\" \")";
Debug.ShouldStop(65536);
_sfechahora = _sfechahora.runMethod(true,"replace",(Object)(BA.ObjectToString("T")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("sFechaHora", _sfechahora);
 BA.debugLineNum = 146;BA.debugLine="Dim Fh() As String=Regex.Split(\" \",sFechaHora)";
Debug.ShouldStop(131072);
_fh = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_sfechahora));Debug.locals.put("Fh", _fh);Debug.locals.put("Fh", _fh);
 BA.debugLineNum = 147;BA.debugLine="Dim lFechaHora As Long=DateTime.DateTimeParse(F";
Debug.ShouldStop(262144);
_lfechahora = parent.__c.getField(false,"DateTime").runMethod(true,"DateTimeParse",(Object)(_fh.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_fh.getArrayElement(true,BA.numberCast(int.class, 1))));Debug.locals.put("lFechaHora", _lfechahora);Debug.locals.put("lFechaHora", _lfechahora);
 BA.debugLineNum = 148;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 149;BA.debugLine="sFechaHora=DateTime.Date(lFechaHora) & \" \" & Da";
Debug.ShouldStop(1048576);
_sfechahora = RemoteObject.concat(parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lfechahora)),RemoteObject.createImmutable(" "),parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_lfechahora)));Debug.locals.put("sFechaHora", _sfechahora);
 BA.debugLineNum = 150;BA.debugLine="Log(\"m modificado \" & m)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","888801373",RemoteObject.concat(RemoteObject.createImmutable("m modificado "),_m),0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 152;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 153;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(16777216);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 155;BA.debugLine="CallSubDelayed3(Me,\"ActualizarInfoExpedicionDHL_C";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("ActualizarInfoExpedicionDHL_Completed")),(Object)((_acciontracking)),(Object)((_lstresultadotracking)));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _cargacredenciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("cargacredenciales")) { return __ref.runUserSub(false, "cinfoexpediciondhl","cargacredenciales", __ref);}
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
public ResumableSub_CargaCredenciales(b4j.docU.cinfoexpediciondhl parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpediciondhl parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstresws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCredenciales (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,13);
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
 BA.debugLineNum = 15;BA.debugLine="Wait For(CargaDatosWebServiceTransporte(17)) comp";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "cargacredenciales"), __ref.runClassMethod (b4j.docU.cinfoexpediciondhl.class, "_cargadatoswebservicetransporte" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 17))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 16;BA.debugLine="Dim accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("accion", _accion);Debug.locals.put("accion", _accion);
 BA.debugLineNum = 17;BA.debugLine="If accion=\"NOK\" Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 18;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 20;BA.debugLine="Dim lstResWS As List=mRes.Get(\"lstRes\")";
Debug.ShouldStop(524288);
_lstresws = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstresws = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstResWS", _lstresws);Debug.locals.put("lstResWS", _lstresws);
 BA.debugLineNum = 21;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
Debug.ShouldStop(1048576);
_mdatosws = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdatosws = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstresws.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDatosWS", _mdatosws);Debug.locals.put("mDatosWS", _mdatosws);
 BA.debugLineNum = 23;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
Debug.ShouldStop(4194304);
__ref.setField ("_usuariows" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UsuarioWS"))))));
 BA.debugLineNum = 24;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
Debug.ShouldStop(8388608);
__ref.setField ("_passwordws" /*RemoteObject*/ ,BA.ObjectToString(_mdatosws.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PasswordWS"))))));
 BA.debugLineNum = 25;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 26;BA.debugLine="Return \"Error carga credenciales\"";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Error carga credenciales")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 28;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _cargadatoswebservicetransporte(RemoteObject __ref,RemoteObject _idtransportista) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("cargadatoswebservicetransporte")) { return __ref.runUserSub(false, "cinfoexpediciondhl","cargadatoswebservicetransporte", __ref, _idtransportista);}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(null,__ref,_idtransportista);
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
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cinfoexpediciondhl parent,RemoteObject __ref,RemoteObject _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpediciondhl parent;
RemoteObject _idtransportista;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,32);
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
Debug.locals.put("IDTransportista", _idtransportista);
 BA.debugLineNum = 34;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 35;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 36;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(16);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 38;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
Debug.ShouldStop(32);
_comandojrdc = BA.ObjectToString("DatosWebServiceTransporte");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 39;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
Debug.ShouldStop(64);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(BA.ObjectToString("http://192.168.10.20:17179/rdc")),(Object)(_comandojrdc),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtransportista)}))),(Object)(__ref));
 BA.debugLineNum = 40;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 41;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 42;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 44;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 45;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 47;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 48;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 49;BA.debugLine="mRes.Put(\"lstRes\",lstRes)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
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
 BA.debugLineNum = 52;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 53;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 54;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cinfoexpediciondhl._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cinfoexpediciondhl._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI";
cinfoexpediciondhl._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cinfoexpediciondhl._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private UsuarioWS As String";
cinfoexpediciondhl._usuariows = RemoteObject.createImmutable("");__ref.setField("_usuariows",cinfoexpediciondhl._usuariows);
 //BA.debugLineNum = 5;BA.debugLine="Private PasswordWs As String";
cinfoexpediciondhl._passwordws = RemoteObject.createImmutable("");__ref.setField("_passwordws",cinfoexpediciondhl._passwordws);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _enviodatoswebservicedhl(RemoteObject __ref,RemoteObject _iddatoenviobuscado,RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceDHL (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("enviodatoswebservicedhl")) { return __ref.runUserSub(false, "cinfoexpediciondhl","enviodatoswebservicedhl", __ref, _iddatoenviobuscado, _token);}
ResumableSub_EnvioDatosWebServiceDHL rsub = new ResumableSub_EnvioDatosWebServiceDHL(null,__ref,_iddatoenviobuscado,_token);
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
public static class ResumableSub_EnvioDatosWebServiceDHL extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceDHL(b4j.docU.cinfoexpediciondhl parent,RemoteObject __ref,RemoteObject _iddatoenviobuscado,RemoteObject _token) {
this.parent = parent;
this.__ref = __ref;
this._iddatoenviobuscado = _iddatoenviobuscado;
this._token = _token;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpediciondhl parent;
RemoteObject _iddatoenviobuscado;
RemoteObject _token;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urldhltracktrace = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceDHL (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,161);
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
Debug.locals.put("IDDatoEnvioBuscado", _iddatoenviobuscado);
Debug.locals.put("Token", _token);
 BA.debugLineNum = 163;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 164;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(8);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 166;BA.debugLine="Dim URLDhlTrackTrace As String=\"https://external.";
Debug.ShouldStop(32);
_urldhltracktrace = RemoteObject.concat(RemoteObject.createImmutable("https://external.dhl.es/cimapi/api/v1/customer/track?id="),_iddatoenviobuscado,RemoteObject.createImmutable("&idioma=es"));Debug.locals.put("URLDhlTrackTrace", _urldhltracktrace);Debug.locals.put("URLDhlTrackTrace", _urldhltracktrace);
 BA.debugLineNum = 167;BA.debugLine="job.Download(URLDhlTrackTrace)";
Debug.ShouldStop(64);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_urldhltracktrace));
 BA.debugLineNum = 169;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(256);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 170;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(512);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 177;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(65536);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 179;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "enviodatoswebservicedhl"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 181;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 182;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","888866837",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 184;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(8388608);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 185;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 189;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(268435456);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 190;BA.debugLine="j.Release";
Debug.ShouldStop(536870912);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 191;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cinfoexpediciondhl","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _obtenertokenswebservicedhl(RemoteObject __ref,RemoteObject _credenu,RemoteObject _credenpswd) throws Exception{
try {
		Debug.PushSubsStack("ObtenerTokensWebServiceDHL (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("obtenertokenswebservicedhl")) { return __ref.runUserSub(false, "cinfoexpediciondhl","obtenertokenswebservicedhl", __ref, _credenu, _credenpswd);}
ResumableSub_ObtenerTokensWebServiceDHL rsub = new ResumableSub_ObtenerTokensWebServiceDHL(null,__ref,_credenu,_credenpswd);
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
public static class ResumableSub_ObtenerTokensWebServiceDHL extends BA.ResumableSub {
public ResumableSub_ObtenerTokensWebServiceDHL(b4j.docU.cinfoexpediciondhl parent,RemoteObject __ref,RemoteObject _credenu,RemoteObject _credenpswd) {
this.parent = parent;
this.__ref = __ref;
this._credenu = _credenu;
this._credenpswd = _credenpswd;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinfoexpediciondhl parent;
RemoteObject _credenu;
RemoteObject _credenpswd;
RemoteObject _mtokenjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _tokenjsonstring = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _accesstokenurl = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _mjobresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _resp = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse");
RemoteObject _headers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _scookie = RemoteObject.createImmutable("");
RemoteObject _cookiecomponents = null;
RemoteObject _cookie = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");
RemoteObject group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerTokensWebServiceDHL (cinfoexpediciondhl) ","cinfoexpediciondhl",37,__ref.getField(false, "ba"),__ref,196);
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
Debug.locals.put("CredenU", _credenu);
Debug.locals.put("CredenPswd", _credenpswd);
 BA.debugLineNum = 198;BA.debugLine="Dim mTokenJSON As Map";
Debug.ShouldStop(32);
_mtokenjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mTokenJSON", _mtokenjson);
 BA.debugLineNum = 199;BA.debugLine="mTokenJSON.Initialize";
Debug.ShouldStop(64);
_mtokenjson.runVoidMethod ("Initialize");
 BA.debugLineNum = 202;BA.debugLine="mTokenJSON.Put(\"Username\",CredenU)";
Debug.ShouldStop(512);
_mtokenjson.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Username"))),(Object)((_credenu)));
 BA.debugLineNum = 204;BA.debugLine="mTokenJSON.Put(\"Password\",CredenPswd)";
Debug.ShouldStop(2048);
_mtokenjson.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Password"))),(Object)((_credenpswd)));
 BA.debugLineNum = 206;BA.debugLine="Dim jp As JSONGenerator";
Debug.ShouldStop(8192);
_jp = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 207;BA.debugLine="jp.Initialize(mTokenJSON)";
Debug.ShouldStop(16384);
_jp.runVoidMethod ("Initialize",(Object)(_mtokenjson));
 BA.debugLineNum = 208;BA.debugLine="Dim TokenJSONstring As String";
Debug.ShouldStop(32768);
_tokenjsonstring = RemoteObject.createImmutable("");Debug.locals.put("TokenJSONstring", _tokenjsonstring);
 BA.debugLineNum = 209;BA.debugLine="TokenJSONstring=jp.ToString";
Debug.ShouldStop(65536);
_tokenjsonstring = _jp.runMethod(true,"ToString");Debug.locals.put("TokenJSONstring", _tokenjsonstring);
 BA.debugLineNum = 211;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(262144);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 212;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 215;BA.debugLine="Dim AccessTokenURL As String=\"https://external.dh";
Debug.ShouldStop(4194304);
_accesstokenurl = BA.ObjectToString("https://external.dhl.es/cimapi/api/v1/customer/authenticate");Debug.locals.put("AccessTokenURL", _accesstokenurl);Debug.locals.put("AccessTokenURL", _accesstokenurl);
 BA.debugLineNum = 216;BA.debugLine="job.PostString(AccessTokenURL, TokenJSONstring)";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_accesstokenurl),(Object)(_tokenjsonstring));
 BA.debugLineNum = 217;BA.debugLine="job.GetRequest.SetHeader(\"accept\",\"application/js";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 218;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 219;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 221;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinfoexpediciondhl", "obtenertokenswebservicedhl"), (_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 222;BA.debugLine="Dim mJobResponse As Map";
Debug.ShouldStop(536870912);
_mjobresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mJobResponse", _mjobresponse);
 BA.debugLineNum = 223;BA.debugLine="mJobResponse.Initialize";
Debug.ShouldStop(1073741824);
_mjobresponse.runVoidMethod ("Initialize");
 BA.debugLineNum = 224;BA.debugLine="If j.Success Then   ' la API de españa devuelve 1";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 226;BA.debugLine="Dim sRespuestaWebService As String=j.getstring";
Debug.ShouldStop(2);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 227;BA.debugLine="Dim resp As OkHttpResponse = job.Response";
Debug.ShouldStop(4);
_resp = _job.getField(false,"_response" /*RemoteObject*/ );Debug.locals.put("resp", _resp);Debug.locals.put("resp", _resp);
 BA.debugLineNum = 228;BA.debugLine="Dim headers As Map  = resp.GetHeaders";
Debug.ShouldStop(8);
_headers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_headers = _resp.runMethod(false,"GetHeaders");Debug.locals.put("headers", _headers);Debug.locals.put("headers", _headers);
 BA.debugLineNum = 229;BA.debugLine="For Each key As String In headers.Keys";
Debug.ShouldStop(16);
if (true) break;

case 4:
//for
this.state = 7;
group23 = _headers.runMethod(false,"Keys");
index23 = 0;
groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("key", _key);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index23 < groupLen23) {
this.state = 6;
_key = BA.ObjectToString(group23.runMethod(false,"Get",index23));Debug.locals.put("key", _key);}
if (true) break;

case 13:
//C
this.state = 12;
index23++;
Debug.locals.put("key", _key);
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 230;BA.debugLine="Log($\"Header: ${key} = ${headers.Get(key)}\"$)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","888932386",(RemoteObject.concat(RemoteObject.createImmutable("Header: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable(" = "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_headers.runMethod(false,"Get",(Object)((_key))))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("key", _key);
;
 BA.debugLineNum = 233;BA.debugLine="Dim sCookie As String=resp.GetHeaders.Get(\"set-c";
Debug.ShouldStop(256);
_scookie = BA.ObjectToString(_resp.runMethod(false,"GetHeaders").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set-cookie")))));Debug.locals.put("sCookie", _scookie);Debug.locals.put("sCookie", _scookie);
 BA.debugLineNum = 234;BA.debugLine="sCookie=sCookie.Replace(\"[\",\"\").Replace(\"]\",\"\")";
Debug.ShouldStop(512);
_scookie = _scookie.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sCookie", _scookie);
 BA.debugLineNum = 235;BA.debugLine="Dim CookieComponents() As String =Regex.Split(\";";
Debug.ShouldStop(1024);
_cookiecomponents = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(";")),(Object)(_scookie));Debug.locals.put("CookieComponents", _cookiecomponents);Debug.locals.put("CookieComponents", _cookiecomponents);
 BA.debugLineNum = 236;BA.debugLine="Dim Cookie As String= CookieComponents(0)";
Debug.ShouldStop(2048);
_cookie = _cookiecomponents.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Cookie", _cookie);Debug.locals.put("Cookie", _cookie);
 BA.debugLineNum = 237;BA.debugLine="Log(\"set-cookie \" & Cookie)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","888932393",RemoteObject.concat(RemoteObject.createImmutable("set-cookie "),_cookie),0);
 BA.debugLineNum = 238;BA.debugLine="j.Release";
Debug.ShouldStop(8192);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 239;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sRespues";
Debug.ShouldStop(16384);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sRespuestaWebService"))),(Object)((_srespuestawebservice)));
 BA.debugLineNum = 240;BA.debugLine="mJobResponse.Put(\"Cookie\",Cookie)";
Debug.ShouldStop(32768);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cookie"))),(Object)((_cookie)));
 BA.debugLineNum = 241;BA.debugLine="mJobResponse.Put(\"Token\",sRespuestaWebService.Re";
Debug.ShouldStop(65536);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Token"))),(Object)((_srespuestawebservice.runMethod(true,"replace",(Object)(parent.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable(""))))));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 244;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(524288);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 245;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sErrorJo";
Debug.ShouldStop(2097152);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sRespuestaWebService"))),(Object)((_serrorjobresponse)));
 BA.debugLineNum = 247;BA.debugLine="mJobResponse.Put(\"Cookie\",\"\")";
Debug.ShouldStop(4194304);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cookie"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 248;BA.debugLine="mJobResponse.Put(\"Token\",\"\")";
Debug.ShouldStop(8388608);
_mjobresponse.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Token"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 251;BA.debugLine="Return mJobResponse";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mjobresponse));return;};
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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