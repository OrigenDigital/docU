package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cmauxtxt_subs_0 {


public static RemoteObject  _cargacredencialestxt() throws Exception{
try {
		Debug.PushSubsStack("CargaCredencialesTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,56);
if (RapidSub.canDelegate("cargacredencialestxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","cargacredencialestxt");}
ResumableSub_CargaCredencialesTXT rsub = new ResumableSub_CargaCredencialesTXT(null);
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
public static class ResumableSub_CargaCredencialesTXT extends BA.ResumableSub {
public ResumableSub_CargaCredencialesTXT(b4j.docU.cmauxtxt parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codigotransportista = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcred = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaCredencialesTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 57;BA.debugLine="Dim CodigoTransportista As Int=7";
Debug.ShouldStop(16777216);
_codigotransportista = BA.numberCast(int.class, 7);Debug.locals.put("CodigoTransportista", _codigotransportista);Debug.locals.put("CodigoTransportista", _codigotransportista);
 BA.debugLineNum = 60;BA.debugLine="wait for (CargaDatosWebServiceTransporte(CodigoTr";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "cargacredencialestxt"), _cargadatoswebservicetransporte(_codigotransportista));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 61;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 62;BA.debugLine="If Accion=\"NOK\" Then";
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
 BA.debugLineNum = 63;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error credenc";
Debug.ShouldStop(1073741824);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(BA.ObjectToString("Error credenciales TXT")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 64;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "cargacredencialestxt"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 BA.debugLineNum = 65;BA.debugLine="Return \"NOK\"";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("NOK")));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 67;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
Debug.ShouldStop(4);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 68;BA.debugLine="Dim mCred As Map=lstRes.Get(0)";
Debug.ShouldStop(8);
_mcred = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mcred = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstres.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mCred", _mcred);Debug.locals.put("mCred", _mcred);
 BA.debugLineNum = 69;BA.debugLine="UserTXT=mCred.Get(\"UsuarioWS\")";
Debug.ShouldStop(16);
parent._usertxt = BA.ObjectToString(_mcred.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UsuarioWS")))));
 BA.debugLineNum = 70;BA.debugLine="PswTXT=mCred.Get(\"PasswordWS\")";
Debug.ShouldStop(32);
parent._pswtxt = BA.ObjectToString(_mcred.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PasswordWS")))));
 BA.debugLineNum = 72;BA.debugLine="TokenWebTXT=mCred.Get(\"TokenWeb\")";
Debug.ShouldStop(128);
parent._tokenwebtxt = BA.ObjectToString(_mcred.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TokenWeb")))));
 BA.debugLineNum = 73;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("OK")));return;};
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static void  _complete(RemoteObject _mres) throws Exception{
}
public static void  _msgbox_result() throws Exception{
}
public static RemoteObject  _cargadatoswebservicetransporte(RemoteObject _idtransportista) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,29);
if (RapidSub.canDelegate("cargadatoswebservicetransporte")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","cargadatoswebservicetransporte", _idtransportista);}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(null,_idtransportista);
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
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cmauxtxt parent,RemoteObject _idtransportista) {
this.parent = parent;
this._idtransportista = _idtransportista;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _idtransportista;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comandojrdc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosWebServiceTransporte (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,29);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("IDTransportista", _idtransportista);
 BA.debugLineNum = 31;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 32;BA.debugLine="Dim lstRes As List";
Debug.ShouldStop(-2147483648);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 33;BA.debugLine="lstRes.Initialize";
Debug.ShouldStop(1);
_lstres.runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="Dim ComandoJRDC As String";
Debug.ShouldStop(2);
_comandojrdc = RemoteObject.createImmutable("");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 35;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
Debug.ShouldStop(4);
_comandojrdc = BA.ObjectToString("DatosWebServiceTransporte");Debug.locals.put("ComandoJRDC", _comandojrdc);
 BA.debugLineNum = 36;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(8);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comandojrdc),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_idtransportista)}))),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 37;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 38;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 39;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 41;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 42;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 44;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
Debug.ShouldStop(2048);
_lstres = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 45;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 48;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32768);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 49;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="mRes.put(\"Accion\",Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 51;BA.debugLine="mRes.put(\"lstRes\",lstRes)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
 BA.debugLineNum = 52;BA.debugLine="Return mRes";
Debug.ShouldStop(524288);
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
public static void  _datosjrdc_completed(RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _enviodatoswebservicebuscarestadoexpediciontxt(RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceBuscarEstadoExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,455);
if (RapidSub.canDelegate("enviodatoswebservicebuscarestadoexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","enviodatoswebservicebuscarestadoexpediciontxt", _codcliente, _user, _pwd, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT rsub = new ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT(b4j.docU.cmauxtxt parent,RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codcliente;
RemoteObject _user;
RemoteObject _pwd;
RemoteObject _tokenweb;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _xml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlwebservicetxt = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceBuscarEstadoExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,455);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("User", _user);
Debug.locals.put("Pwd", _pwd);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 458;BA.debugLine="Dim xml As String=XmlSoapBuscarEstadoExpedicionTx";
Debug.ShouldStop(512);
_xml = _xmlsoapbuscarestadoexpediciontxt(BA.ObjectToString("001"),BA.numberCast(int.class, _codcliente),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);Debug.locals.put("xml", _xml);Debug.locals.put("xml", _xml);
 BA.debugLineNum = 461;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 462;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(8192);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba,(Object)(BA.ObjectToString("")),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 463;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
Debug.ShouldStop(16384);
_urlwebservicetxt = BA.ObjectToString("http://ws.txt.es/webserviceTXT.asmx");Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);
 BA.debugLineNum = 464;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlwebservicetxt),(Object)(_xml));
 BA.debugLineNum = 465;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
Debug.ShouldStop(65536);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/soap+xml")));
 BA.debugLineNum = 466;BA.debugLine="job.GetRequest.Timeout=30000";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 468;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "enviodatoswebservicebuscarestadoexpediciontxt"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 469;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 470;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","895027215",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 472;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(8388608);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 473;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 474;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 476;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(134217728);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 477;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 478;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 480;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _enviodatoswebservicebuscarexpedicionesperiodotxt(RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _fechadesde,RemoteObject _fechahasta) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,890);
if (RapidSub.canDelegate("enviodatoswebservicebuscarexpedicionesperiodotxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","enviodatoswebservicebuscarexpedicionesperiodotxt", _codcliente, _user, _pwd, _tokenweb, _fechadesde, _fechahasta);}
ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT rsub = new ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT(null,_codcliente,_user,_pwd,_tokenweb,_fechadesde,_fechahasta);
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
public static class ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT(b4j.docU.cmauxtxt parent,RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _fechadesde,RemoteObject _fechahasta) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._fechadesde = _fechadesde;
this._fechahasta = _fechahasta;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codcliente;
RemoteObject _user;
RemoteObject _pwd;
RemoteObject _tokenweb;
RemoteObject _fechadesde;
RemoteObject _fechahasta;
RemoteObject _xml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlwebservicetxt = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,890);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("User", _user);
Debug.locals.put("Pwd", _pwd);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("FechaDesde", _fechadesde);
Debug.locals.put("FechaHasta", _fechahasta);
 BA.debugLineNum = 893;BA.debugLine="Dim xml As String=XmlSoapBuscarExpedicionesPeriod";
Debug.ShouldStop(268435456);
_xml = _xmlsoapbuscarexpedicionesperiodotxt(BA.ObjectToString("001"),BA.numberCast(int.class, _codcliente),_user,_pwd,_tokenweb,_fechadesde,_fechahasta);Debug.locals.put("xml", _xml);Debug.locals.put("xml", _xml);
 BA.debugLineNum = 896;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 897;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(1);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba,(Object)(BA.ObjectToString("")),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 898;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
Debug.ShouldStop(2);
_urlwebservicetxt = BA.ObjectToString("http://ws.txt.es/webserviceTXT.asmx");Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);
 BA.debugLineNum = 899;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
Debug.ShouldStop(4);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlwebservicetxt),(Object)(_xml));
 BA.debugLineNum = 900;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
Debug.ShouldStop(8);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/soap+xml")));
 BA.debugLineNum = 901;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(16);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 903;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "enviodatoswebservicebuscarexpedicionesperiodotxt"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 904;BA.debugLine="If j.Success Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 905;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","895617039",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 907;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(1024);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 908;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 909;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 911;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(16384);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 912;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 913;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 915;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _enviodatoswebservicebuscarhistoricoestadosexpediciontxt(RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,599);
if (RapidSub.canDelegate("enviodatoswebservicebuscarhistoricoestadosexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","enviodatoswebservicebuscarhistoricoestadosexpediciontxt", _codcliente, _user, _pwd, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT rsub = new ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT(b4j.docU.cmauxtxt parent,RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codcliente;
RemoteObject _user;
RemoteObject _pwd;
RemoteObject _tokenweb;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _xml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlwebservicetxt = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,599);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("User", _user);
Debug.locals.put("Pwd", _pwd);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 602;BA.debugLine="Dim xml As String=XmlSoapBuscarHistoricoEstadosEx";
Debug.ShouldStop(33554432);
_xml = _xmlsoapbuscarhistoricoestadosexpediciontxt(BA.ObjectToString("001"),BA.numberCast(int.class, _codcliente),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);Debug.locals.put("xml", _xml);Debug.locals.put("xml", _xml);
 BA.debugLineNum = 605;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(268435456);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 606;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(536870912);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba,(Object)(BA.ObjectToString("")),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 607;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
Debug.ShouldStop(1073741824);
_urlwebservicetxt = BA.ObjectToString("http://ws.txt.es/webserviceTXT.asmx");Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);
 BA.debugLineNum = 608;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlwebservicetxt),(Object)(_xml));
 BA.debugLineNum = 609;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
Debug.ShouldStop(1);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/soap+xml")));
 BA.debugLineNum = 610;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(2);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 612;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "enviodatoswebservicebuscarhistoricoestadosexpediciontxt"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 613;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 614;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","895223823",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 616;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(128);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 617;BA.debugLine="j.Release";
Debug.ShouldStop(256);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 618;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 620;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(2048);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 621;BA.debugLine="j.Release";
Debug.ShouldStop(4096);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 622;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 624;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _enviodatoswebserviceconsultaincidenciasexpediciontxt(RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,745);
if (RapidSub.canDelegate("enviodatoswebserviceconsultaincidenciasexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","enviodatoswebserviceconsultaincidenciasexpediciontxt", _codcliente, _user, _pwd, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT rsub = new ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT(b4j.docU.cmauxtxt parent,RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codcliente;
RemoteObject _user;
RemoteObject _pwd;
RemoteObject _tokenweb;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _xml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlwebservicetxt = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,745);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("User", _user);
Debug.locals.put("Pwd", _pwd);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 748;BA.debugLine="Dim xml As String=XmlSoapConsultaIncidenciasExped";
Debug.ShouldStop(2048);
_xml = _xmlsoapconsultaincidenciasexpediciontxt(BA.ObjectToString("001"),BA.numberCast(int.class, _codcliente),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);Debug.locals.put("xml", _xml);Debug.locals.put("xml", _xml);
 BA.debugLineNum = 751;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16384);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 752;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(32768);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba,(Object)(BA.ObjectToString("")),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 753;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
Debug.ShouldStop(65536);
_urlwebservicetxt = BA.ObjectToString("http://ws.txt.es/webserviceTXT.asmx");Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);
 BA.debugLineNum = 754;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlwebservicetxt),(Object)(_xml));
 BA.debugLineNum = 755;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/soap+xml")));
 BA.debugLineNum = 756;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 758;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "enviodatoswebserviceconsultaincidenciasexpediciontxt"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 759;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 760;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","895420431",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 762;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(33554432);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 763;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 764;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 766;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(536870912);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 767;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 768;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 770;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static RemoteObject  _enviodatoswebserviceexpedicionessinentregartxt(RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceExpedicionesSinEntregarTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,305);
if (RapidSub.canDelegate("enviodatoswebserviceexpedicionessinentregartxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","enviodatoswebserviceexpedicionessinentregartxt", _codcliente, _user, _pwd, _tokenweb);}
ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT rsub = new ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT(null,_codcliente,_user,_pwd,_tokenweb);
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
public static class ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT(b4j.docU.cmauxtxt parent,RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codcliente;
RemoteObject _user;
RemoteObject _pwd;
RemoteObject _tokenweb;
RemoteObject _xml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlwebservicetxt = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceExpedicionesSinEntregarTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,305);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("User", _user);
Debug.locals.put("Pwd", _pwd);
Debug.locals.put("TokenWeb", _tokenweb);
 BA.debugLineNum = 307;BA.debugLine="Dim xml As String=XmlSoapExpedicionesSinEntregarT";
Debug.ShouldStop(262144);
_xml = _xmlsoapexpedicionessinentregartxt(BA.ObjectToString("001"),BA.numberCast(int.class, _codcliente),_user,_pwd,_tokenweb);Debug.locals.put("xml", _xml);Debug.locals.put("xml", _xml);
 BA.debugLineNum = 309;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(1048576);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 310;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba,(Object)(BA.ObjectToString("")),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 311;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
Debug.ShouldStop(4194304);
_urlwebservicetxt = BA.ObjectToString("http://ws.txt.es/webserviceTXT.asmx");Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);
 BA.debugLineNum = 312;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlwebservicetxt),(Object)(_xml));
 BA.debugLineNum = 313;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/soap+xml")));
 BA.debugLineNum = 314;BA.debugLine="job.GetRequest.Timeout=30000";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 30000));
 BA.debugLineNum = 316;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "enviodatoswebserviceexpedicionessinentregartxt"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 317;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 318;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","894830605",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 320;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(-2147483648);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 321;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 322;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 324;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(8);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 325;BA.debugLine="j.Release";
Debug.ShouldStop(16);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 326;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static RemoteObject  _enviodatoswebserviceurltrackingtxt(RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceURLTrackingTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,154);
if (RapidSub.canDelegate("enviodatoswebserviceurltrackingtxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","enviodatoswebserviceurltrackingtxt", _codcliente, _user, _pwd, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_EnvioDatosWebServiceURLTrackingTxT rsub = new ResumableSub_EnvioDatosWebServiceURLTrackingTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_EnvioDatosWebServiceURLTrackingTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceURLTrackingTxT(b4j.docU.cmauxtxt parent,RemoteObject _codcliente,RemoteObject _user,RemoteObject _pwd,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codcliente;
RemoteObject _user;
RemoteObject _pwd;
RemoteObject _tokenweb;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _xml = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _urlwebservicetxt = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosWebServiceURLTrackingTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,154);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("User", _user);
Debug.locals.put("Pwd", _pwd);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 157;BA.debugLine="Dim xml As String=XmlSoapURLTrackingTxT(\"001\",Cod";
Debug.ShouldStop(268435456);
_xml = _xmlsoapurltrackingtxt(BA.ObjectToString("001"),BA.numberCast(int.class, _codcliente),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,BA.numberCast(long.class, _nexped2),_ano);Debug.locals.put("xml", _xml);Debug.locals.put("xml", _xml);
 BA.debugLineNum = 160;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 161;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(1);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba,(Object)(BA.ObjectToString("")),(Object)(cmauxtxt.getObject()));
 BA.debugLineNum = 162;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
Debug.ShouldStop(2);
_urlwebservicetxt = BA.ObjectToString("http://ws.txt.es/webserviceTXT.asmx");Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);Debug.locals.put("URLWebServiceTXT", _urlwebservicetxt);
 BA.debugLineNum = 163;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
Debug.ShouldStop(4);
_job.runClassMethod (b4j.docU.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlwebservicetxt),(Object)(_xml));
 BA.debugLineNum = 164;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
Debug.ShouldStop(8);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/soap+xml")));
 BA.debugLineNum = 165;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(16);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 167;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "enviodatoswebserviceurltrackingtxt"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 168;BA.debugLine="If j.Success Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 169;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","894633999",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 171;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(1024);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 172;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 173;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 175;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(16384);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 176;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _getelements(RemoteObject _m,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetElements (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,14);
if (RapidSub.canDelegate("getelements")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","getelements", _m, _key);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
Debug.locals.put("key", _key);
 BA.debugLineNum = 14;BA.debugLine="Sub GetElements (m As Map, key As String) As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim res As List";
Debug.ShouldStop(16384);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 16;BA.debugLine="If m.ContainsKey(key) = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"ContainsKey",(Object)((_key))),cmauxtxt.__c.getField(true,"False"))) { 
 BA.debugLineNum = 17;BA.debugLine="res.Initialize";
Debug.ShouldStop(65536);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="Return res";
Debug.ShouldStop(131072);
if (true) return _res;
 }else {
 BA.debugLineNum = 20;BA.debugLine="Dim value As Object = m.Get(key)";
Debug.ShouldStop(524288);
_value = _m.runMethod(false,"Get",(Object)((_key)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 21;BA.debugLine="If value Is List Then Return value";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("java.util.List"))) { 
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _value);};
 BA.debugLineNum = 22;BA.debugLine="res.Initialize";
Debug.ShouldStop(2097152);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="res.Add(value)";
Debug.ShouldStop(4194304);
_res.runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 24;BA.debugLine="Return res";
Debug.ShouldStop(8388608);
if (true) return _res;
 };
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _obtenerbuscarexpedicionesperiodotxt(RemoteObject _fechadesde,RemoteObject _fechahasta) throws Exception{
try {
		Debug.PushSubsStack("ObtenerBuscarExpedicionesPeriodoTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,796);
if (RapidSub.canDelegate("obtenerbuscarexpedicionesperiodotxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","obtenerbuscarexpedicionesperiodotxt", _fechadesde, _fechahasta);}
ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT rsub = new ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT(null,_fechadesde,_fechahasta);
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
public static class ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT extends BA.ResumableSub {
public ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT(b4j.docU.cmauxtxt parent,RemoteObject _fechadesde,RemoteObject _fechahasta) {
this.parent = parent;
this._fechadesde = _fechadesde;
this._fechahasta = _fechahasta;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _fechadesde;
RemoteObject _fechahasta;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _mparseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _menvelope = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbuscarexpedicionesresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbuscarexpedicionesresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mexpediciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstdatosexpediciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ref1 = RemoteObject.createImmutable("");
RemoteObject group39;
int index39;
int groupLen39;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerBuscarExpedicionesPeriodoTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,796);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("FechaDesde", _fechadesde);
Debug.locals.put("FechaHasta", _fechahasta);
 BA.debugLineNum = 801;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 802;BA.debugLine="Dim URL As String";
Debug.ShouldStop(2);
_url = RemoteObject.createImmutable("");Debug.locals.put("URL", _url);
 BA.debugLineNum = 803;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 804;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 806;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerbuscarexpedicionesperiodotxt"), _cargacredencialestxt());
this.state = 25;
return;
case 25:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 807;BA.debugLine="If sResp=\"NOK\" Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 808;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 809;BA.debugLine="Return mRes";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 812;BA.debugLine="Wait For(EnvioDatosWebServiceBuscarExpedicionesPe";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerbuscarexpedicionesperiodotxt"), _enviodatoswebservicebuscarexpedicionesperiodotxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_fechadesde,_fechahasta));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 813;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(4096);
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 814;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 816;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(32768);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de TXT solicitando BuscarExpediciones."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 817;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerbuscarexpedicionesperiodotxt"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 818;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 819;BA.debugLine="mRes.Put(\"URL\",URL)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_url)));
 BA.debugLineNum = 821;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 829;BA.debugLine="Log(\"sresponse BuscarExpediciones\")";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","895551521",RemoteObject.createImmutable("sresponse BuscarExpediciones"),0);
 BA.debugLineNum = 830;BA.debugLine="Log(\"\")";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","895551522",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 831;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","895551523",_sresponse,0);
 BA.debugLineNum = 833;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(1);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 834;BA.debugLine="xm.Initialize";
Debug.ShouldStop(2);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba);
 BA.debugLineNum = 835;BA.debugLine="Dim mParsedData As Map";
Debug.ShouldStop(4);
_mparseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 836;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
Debug.ShouldStop(8);
_mparseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_sresponse));Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 842;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
Debug.ShouldStop(512);
_menvelope = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_menvelope = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Envelope")))));Debug.locals.put("mEnvelope", _menvelope);Debug.locals.put("mEnvelope", _menvelope);
 BA.debugLineNum = 846;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
Debug.ShouldStop(8192);
_mbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbody = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _menvelope.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Body")))));Debug.locals.put("mBody", _mbody);Debug.locals.put("mBody", _mbody);
 BA.debugLineNum = 850;BA.debugLine="Dim mBuscarExpedicionesResponse As Map=mBody.Get(";
Debug.ShouldStop(131072);
_mbuscarexpedicionesresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbuscarexpedicionesresponse = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbody.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BuscarExpedicionesResponse")))));Debug.locals.put("mBuscarExpedicionesResponse", _mbuscarexpedicionesresponse);Debug.locals.put("mBuscarExpedicionesResponse", _mbuscarexpedicionesresponse);
 BA.debugLineNum = 854;BA.debugLine="Dim mBuscarExpedicionesResult As Map=mBuscarExped";
Debug.ShouldStop(2097152);
_mbuscarexpedicionesresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbuscarexpedicionesresult = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbuscarexpedicionesresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BuscarExpedicionesResult")))));Debug.locals.put("mBuscarExpedicionesResult", _mbuscarexpedicionesresult);Debug.locals.put("mBuscarExpedicionesResult", _mbuscarexpedicionesresult);
 BA.debugLineNum = 865;BA.debugLine="Dim mDiffgram As Map=mBuscarExpedicionesResult.ge";
Debug.ShouldStop(1);
_mdiffgram = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbuscarexpedicionesresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("diffgr:diffgram")))));Debug.locals.put("mDiffgram", _mdiffgram);Debug.locals.put("mDiffgram", _mdiffgram);
 BA.debugLineNum = 867;BA.debugLine="If mDiffgram.ContainsKey(\"Expediciones\") Then";
Debug.ShouldStop(4);
if (true) break;

case 9:
//if
this.state = 14;
if (_mdiffgram.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Expediciones")))).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 868;BA.debugLine="Dim mExpediciones As Map=mDiffgram.Get(\"Expedici";
Debug.ShouldStop(8);
_mexpediciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mexpediciones = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdiffgram.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Expediciones")))));Debug.locals.put("mExpediciones", _mexpediciones);Debug.locals.put("mExpediciones", _mexpediciones);
 BA.debugLineNum = 869;BA.debugLine="Dim lstDatosExpediciones As List=GetElements(mEx";
Debug.ShouldStop(16);
_lstdatosexpediciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosexpediciones = _getelements(_mexpediciones,RemoteObject.createImmutable("Expediciones"));Debug.locals.put("lstDatosExpediciones", _lstdatosexpediciones);Debug.locals.put("lstDatosExpediciones", _lstdatosexpediciones);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 871;BA.debugLine="Dim lstDatosExpediciones As List";
Debug.ShouldStop(64);
_lstdatosexpediciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDatosExpediciones", _lstdatosexpediciones);
 BA.debugLineNum = 872;BA.debugLine="lstDatosExpediciones.Initialize";
Debug.ShouldStop(128);
_lstdatosexpediciones.runVoidMethod ("Initialize");
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 874;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 876;BA.debugLine="For Each m As Map In lstDatosExpediciones";
Debug.ShouldStop(2048);
if (true) break;

case 15:
//for
this.state = 24;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group39 = _lstdatosexpediciones;
index39 = 0;
groupLen39 = group39.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 24;
if (index39 < groupLen39) {
this.state = 17;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group39.runMethod(false,"Get",index39));Debug.locals.put("m", _m);}
if (true) break;

case 29:
//C
this.state = 28;
index39++;
Debug.locals.put("m", _m);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 877;BA.debugLine="Dim Ref1 As String=m.Get(\"Referencia_x0020_1\")";
Debug.ShouldStop(4096);
_ref1 = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Referencia_x0020_1")))));Debug.locals.put("Ref1", _ref1);Debug.locals.put("Ref1", _ref1);
 BA.debugLineNum = 878;BA.debugLine="If Ref1=\"{Attributes={xml:space=preserve}, Text=";
Debug.ShouldStop(8192);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_ref1,BA.ObjectToString("{Attributes={xml:space=preserve}, Text= }"))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Referencia_x0020_1"))),(Object)((RemoteObject.createImmutable(""))));
if (true) break;

case 23:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 883;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 884;BA.debugLine="mRes.Put(\"lstRes\",lstDatosExpediciones)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstdatosexpediciones.getObject())));
 BA.debugLineNum = 885;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 888;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _obtenerconsultaincidenciasexpediciontxt(RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("ObtenerConsultaIncidenciasExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,655);
if (RapidSub.canDelegate("obtenerconsultaincidenciasexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","obtenerconsultaincidenciasexpediciontxt", _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT rsub = new ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT(null,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT(b4j.docU.cmauxtxt parent,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _mparseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _menvelope = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mconsultaincidenciasresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mconsultaincidenciasresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstdatosincidenciasexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mincidencias = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerConsultaIncidenciasExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,655);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 657;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(65536);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 658;BA.debugLine="Dim URL As String";
Debug.ShouldStop(131072);
_url = RemoteObject.createImmutable("");Debug.locals.put("URL", _url);
 BA.debugLineNum = 659;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(262144);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 660;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 662;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _cargacredencialestxt());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 663;BA.debugLine="If sResp=\"NOK\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 664;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 665;BA.debugLine="Return mRes";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 673;BA.debugLine="Wait For(EnvioDatosWebServiceConsultaIncidenciasE";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _enviodatoswebserviceconsultaincidenciasexpediciontxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 674;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 675;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 677;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(16);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de TXT solicitando URL Tracking."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 678;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 679;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 680;BA.debugLine="mRes.Put(\"URL\",URL)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_url)));
 BA.debugLineNum = 682;BA.debugLine="Return mRes";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 690;BA.debugLine="Log(\"sresponse ConsultaIncidencias\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","895354915",RemoteObject.createImmutable("sresponse ConsultaIncidencias"),0);
 BA.debugLineNum = 691;BA.debugLine="Log(\"\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","895354916",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 692;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","895354917",_sresponse,0);
 BA.debugLineNum = 694;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(2097152);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 695;BA.debugLine="xm.Initialize";
Debug.ShouldStop(4194304);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba);
 BA.debugLineNum = 696;BA.debugLine="Dim mParsedData As Map";
Debug.ShouldStop(8388608);
_mparseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 697;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
Debug.ShouldStop(16777216);
_mparseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_sresponse));Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 703;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
Debug.ShouldStop(1073741824);
_menvelope = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_menvelope = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Envelope")))));Debug.locals.put("mEnvelope", _menvelope);Debug.locals.put("mEnvelope", _menvelope);
 BA.debugLineNum = 707;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
Debug.ShouldStop(4);
_mbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbody = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _menvelope.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Body")))));Debug.locals.put("mBody", _mbody);Debug.locals.put("mBody", _mbody);
 BA.debugLineNum = 711;BA.debugLine="Dim mConsultaIncidenciasResponse  As Map=mBody.Ge";
Debug.ShouldStop(64);
_mconsultaincidenciasresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mconsultaincidenciasresponse = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbody.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConsultaIncidenciasResponse")))));Debug.locals.put("mConsultaIncidenciasResponse", _mconsultaincidenciasresponse);Debug.locals.put("mConsultaIncidenciasResponse", _mconsultaincidenciasresponse);
 BA.debugLineNum = 715;BA.debugLine="Dim mConsultaIncidenciasResult As Map=mConsultaIn";
Debug.ShouldStop(1024);
_mconsultaincidenciasresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mconsultaincidenciasresult = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mconsultaincidenciasresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConsultaIncidenciasResult")))));Debug.locals.put("mConsultaIncidenciasResult", _mconsultaincidenciasresult);Debug.locals.put("mConsultaIncidenciasResult", _mconsultaincidenciasresult);
 BA.debugLineNum = 725;BA.debugLine="Dim mDiffgram As Map=mConsultaIncidenciasResult.g";
Debug.ShouldStop(1048576);
_mdiffgram = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mconsultaincidenciasresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("diffgr:diffgram")))));Debug.locals.put("mDiffgram", _mdiffgram);Debug.locals.put("mDiffgram", _mdiffgram);
 BA.debugLineNum = 727;BA.debugLine="If mDiffgram.ContainsKey(\"Incidencias\")=False The";
Debug.ShouldStop(4194304);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_mdiffgram.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Incidencias")))),parent.__c.getField(true,"False"))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 728;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List";
Debug.ShouldStop(8388608);
_lstdatosincidenciasexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);
 BA.debugLineNum = 729;BA.debugLine="lstDatosIncidenciasExpedicion.Initialize";
Debug.ShouldStop(16777216);
_lstdatosincidenciasexpedicion.runVoidMethod ("Initialize");
 BA.debugLineNum = 730;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No hay dato";
Debug.ShouldStop(33554432);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(BA.ObjectToString("No hay datos de incidencias para la expedicion seleccionada.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 731;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 732;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(134217728);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 734;BA.debugLine="Dim mIncidencias As Map=mDiffgram.Get(\"Incidenci";
Debug.ShouldStop(536870912);
_mincidencias = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mincidencias = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdiffgram.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Incidencias")))));Debug.locals.put("mIncidencias", _mincidencias);Debug.locals.put("mIncidencias", _mincidencias);
 BA.debugLineNum = 735;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List=GetEle";
Debug.ShouldStop(1073741824);
_lstdatosincidenciasexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosincidenciasexpedicion = _getelements(_mincidencias,RemoteObject.createImmutable("Incidencias"));Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);Debug.locals.put("lstDatosIncidenciasExpedicion", _lstdatosincidenciasexpedicion);
 BA.debugLineNum = 736;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 739;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 740;BA.debugLine="mRes.Put(\"lstRes\",lstDatosIncidenciasExpedicion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstdatosincidenciasexpedicion.getObject())));
 BA.debugLineNum = 741;BA.debugLine="Return mRes";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 743;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static RemoteObject  _obtenerestadoexpediciontxt(RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("ObtenerEstadoExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,369);
if (RapidSub.canDelegate("obtenerestadoexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","obtenerestadoexpediciontxt", _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_ObtenerEstadoExpedicionTXT rsub = new ResumableSub_ObtenerEstadoExpedicionTXT(null,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_ObtenerEstadoExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerEstadoExpedicionTXT(b4j.docU.cmauxtxt parent,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _mparseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _menvelope = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbuscarestadoresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbuscarestadoresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mestados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerEstadoExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,369);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 371;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(262144);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 372;BA.debugLine="Dim URL As String";
Debug.ShouldStop(524288);
_url = RemoteObject.createImmutable("");Debug.locals.put("URL", _url);
 BA.debugLineNum = 373;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1048576);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 374;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 376;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _cargacredencialestxt());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 377;BA.debugLine="If sResp=\"NOK\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 378;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 379;BA.debugLine="Return mRes";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 387;BA.debugLine="Wait For(EnvioDatosWebServiceBuscarEstadoExpedici";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _enviodatoswebservicebuscarestadoexpediciontxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 388;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(8);
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 389;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 391;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(64);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de TXT solicitando BuscarEstadoExpedicionTxT."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 392;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 393;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 394;BA.debugLine="mRes.Put(\"URL\",URL)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_url)));
 BA.debugLineNum = 396;BA.debugLine="Return mRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 404;BA.debugLine="Log(\"sresponse BuscarEstadoExpedicion\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","894961699",RemoteObject.createImmutable("sresponse BuscarEstadoExpedicion"),0);
 BA.debugLineNum = 405;BA.debugLine="Log(\"\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","894961700",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 406;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","894961701",_sresponse,0);
 BA.debugLineNum = 408;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(8388608);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 409;BA.debugLine="xm.Initialize";
Debug.ShouldStop(16777216);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba);
 BA.debugLineNum = 410;BA.debugLine="Dim mParsedData As Map";
Debug.ShouldStop(33554432);
_mparseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 411;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
Debug.ShouldStop(67108864);
_mparseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_sresponse));Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 417;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
Debug.ShouldStop(1);
_menvelope = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_menvelope = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Envelope")))));Debug.locals.put("mEnvelope", _menvelope);Debug.locals.put("mEnvelope", _menvelope);
 BA.debugLineNum = 421;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
Debug.ShouldStop(16);
_mbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbody = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _menvelope.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Body")))));Debug.locals.put("mBody", _mbody);Debug.locals.put("mBody", _mbody);
 BA.debugLineNum = 425;BA.debugLine="Dim mBuscarEstadoResponse As Map=mBody.Get(\"Busca";
Debug.ShouldStop(256);
_mbuscarestadoresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbuscarestadoresponse = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbody.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BuscarEstadoResponse")))));Debug.locals.put("mBuscarEstadoResponse", _mbuscarestadoresponse);Debug.locals.put("mBuscarEstadoResponse", _mbuscarestadoresponse);
 BA.debugLineNum = 429;BA.debugLine="Dim mBuscarEstadoResult As Map=mBuscarEstadoRespo";
Debug.ShouldStop(4096);
_mbuscarestadoresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbuscarestadoresult = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbuscarestadoresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BuscarEstadoResult")))));Debug.locals.put("mBuscarEstadoResult", _mbuscarestadoresult);Debug.locals.put("mBuscarEstadoResult", _mbuscarestadoresult);
 BA.debugLineNum = 434;BA.debugLine="Dim mDiffgram As Map=mBuscarEstadoResult.get(\"dif";
Debug.ShouldStop(131072);
_mdiffgram = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbuscarestadoresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("diffgr:diffgram")))));Debug.locals.put("mDiffgram", _mdiffgram);Debug.locals.put("mDiffgram", _mdiffgram);
 BA.debugLineNum = 436;BA.debugLine="Dim mEstados As Map=mDiffgram.Get(\"ESTADO\")";
Debug.ShouldStop(524288);
_mestados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mestados = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdiffgram.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("mEstados", _mestados);Debug.locals.put("mEstados", _mestados);
 BA.debugLineNum = 438;BA.debugLine="If mEstados.IsInitialized=False Then  ' no datos";
Debug.ShouldStop(2097152);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_mestados.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 439;BA.debugLine="Dim lstDatosEstadosExpedicion As List";
Debug.ShouldStop(4194304);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 440;BA.debugLine="lstDatosEstadosExpedicion.Initialize";
Debug.ShouldStop(8388608);
_lstdatosestadosexpedicion.runVoidMethod ("Initialize");
 BA.debugLineNum = 441;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No hay dato";
Debug.ShouldStop(16777216);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos de estados para la expedicion seleccionada ("),_codorigen,_coddestino,_nexped1,_nexped2,_ano,RemoteObject.createImmutable(") ."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 442;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 443;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 445;BA.debugLine="Dim lstDatosEstadosExpedicion As List=GetElement";
Debug.ShouldStop(268435456);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = _getelements(_mestados,RemoteObject.createImmutable("ESTADO"));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 446;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 449;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 450;BA.debugLine="mRes.Put(\"lstRes\",lstDatosEstadosExpedicion)";
Debug.ShouldStop(2);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstdatosestadosexpedicion.getObject())));
 BA.debugLineNum = 451;BA.debugLine="Return mRes";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 453;BA.debugLine="End Sub";
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
public static RemoteObject  _obtenerexpedicionessinentregartxt() throws Exception{
try {
		Debug.PushSubsStack("ObtenerExpedicionesSinEntregarTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,208);
if (RapidSub.canDelegate("obtenerexpedicionessinentregartxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","obtenerexpedicionessinentregartxt");}
ResumableSub_ObtenerExpedicionesSinEntregarTXT rsub = new ResumableSub_ObtenerExpedicionesSinEntregarTXT(null);
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
public static class ResumableSub_ObtenerExpedicionesSinEntregarTXT extends BA.ResumableSub {
public ResumableSub_ObtenerExpedicionesSinEntregarTXT(b4j.docU.cmauxtxt parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _lstdatosexpediciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _mparseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _menvelope = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mexpedicionessinentregarresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _mexpedicionessinentregarresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mexpediciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group31;
int index31;
int groupLen31;
RemoteObject group36;
int index36;
int groupLen36;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerExpedicionesSinEntregarTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,208);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 213;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1048576);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 214;BA.debugLine="Dim URL As String";
Debug.ShouldStop(2097152);
_url = RemoteObject.createImmutable("");Debug.locals.put("URL", _url);
 BA.debugLineNum = 215;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(4194304);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 216;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 218;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerexpedicionessinentregartxt"), _cargacredencialestxt());
this.state = 26;
return;
case 26:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 219;BA.debugLine="If sResp=\"NOK\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 220;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 221;BA.debugLine="Return mRes";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 224;BA.debugLine="Wait For(EnvioDatosWebServiceExpedicionesSinEntre";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerexpedicionessinentregartxt"), _enviodatoswebserviceexpedicionessinentregartxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt));
this.state = 27;
return;
case 27:
//C
this.state = 5;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 225;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(1);
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 226;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 229;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(16);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de TXT solicitando URL Tracking."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 230;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerexpedicionessinentregartxt"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 231;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 232;BA.debugLine="mRes.Put(\"URL\",URL)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_url)));
 BA.debugLineNum = 234;BA.debugLine="Return mRes";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 242;BA.debugLine="Log(\"sresponse Expediciones Sin Entregar\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","894765090",RemoteObject.createImmutable("sresponse Expediciones Sin Entregar"),0);
 BA.debugLineNum = 243;BA.debugLine="Log(\"\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","894765091",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 244;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","894765092",_sresponse,0);
 BA.debugLineNum = 246;BA.debugLine="Dim lstDatosExpediciones As List";
Debug.ShouldStop(2097152);
_lstdatosexpediciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDatosExpediciones", _lstdatosexpediciones);
 BA.debugLineNum = 247;BA.debugLine="lstDatosExpediciones.Initialize";
Debug.ShouldStop(4194304);
_lstdatosexpediciones.runVoidMethod ("Initialize");
 BA.debugLineNum = 249;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(16777216);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 250;BA.debugLine="xm.Initialize";
Debug.ShouldStop(33554432);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba);
 BA.debugLineNum = 251;BA.debugLine="Dim mParsedData As Map";
Debug.ShouldStop(67108864);
_mparseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 252;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
Debug.ShouldStop(134217728);
_mparseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_sresponse));Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 258;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
Debug.ShouldStop(2);
_menvelope = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_menvelope = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Envelope")))));Debug.locals.put("mEnvelope", _menvelope);Debug.locals.put("mEnvelope", _menvelope);
 BA.debugLineNum = 262;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
Debug.ShouldStop(32);
_mbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbody = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _menvelope.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Body")))));Debug.locals.put("mBody", _mbody);Debug.locals.put("mBody", _mbody);
 BA.debugLineNum = 266;BA.debugLine="Dim mExpedicionesSinEntregarResponse As Map=mBody";
Debug.ShouldStop(512);
_mexpedicionessinentregarresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mexpedicionessinentregarresponse = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbody.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExpedicionesSinEntregarResponse")))));Debug.locals.put("mExpedicionesSinEntregarResponse", _mexpedicionessinentregarresponse);Debug.locals.put("mExpedicionesSinEntregarResponse", _mexpedicionessinentregarresponse);
 BA.debugLineNum = 267;BA.debugLine="For Each k As String In mExpedicionesSinEntregarR";
Debug.ShouldStop(1024);
if (true) break;

case 9:
//for
this.state = 12;
group31 = _mexpedicionessinentregarresponse.runMethod(false,"Keys");
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 12;
if (index31 < groupLen31) {
this.state = 11;
_k = BA.ObjectToString(group31.runMethod(false,"Get",index31));Debug.locals.put("k", _k);}
if (true) break;

case 30:
//C
this.state = 29;
index31++;
Debug.locals.put("k", _k);
if (true) break;

case 11:
//C
this.state = 30;
 BA.debugLineNum = 268;BA.debugLine="Log(\"mExpedicionesSinEntregarResponse: \" & k & \"";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","894765116",RemoteObject.concat(RemoteObject.createImmutable("mExpedicionesSinEntregarResponse: "),_k,RemoteObject.createImmutable(": "),_mexpedicionessinentregarresponse.runMethod(false,"Get",(Object)((_k)))),0);
 if (true) break;
if (true) break;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 270;BA.debugLine="If mExpedicionesSinEntregarResponse.ContainsKey(\"";
Debug.ShouldStop(8192);

case 12:
//if
this.state = 25;
if (_mexpedicionessinentregarresponse.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("ExpedicionesSinEntregarResult")))).<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 271;BA.debugLine="Dim mExpedicionesSinEntregarResult As Map=mExped";
Debug.ShouldStop(16384);
_mexpedicionessinentregarresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mexpedicionessinentregarresult = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mexpedicionessinentregarresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExpedicionesSinEntregarResult")))));Debug.locals.put("mExpedicionesSinEntregarResult", _mexpedicionessinentregarresult);Debug.locals.put("mExpedicionesSinEntregarResult", _mexpedicionessinentregarresult);
 BA.debugLineNum = 272;BA.debugLine="For Each k As String In mExpedicionesSinEntregar";
Debug.ShouldStop(32768);
if (true) break;

case 15:
//for
this.state = 18;
group36 = _mexpedicionessinentregarresult.runMethod(false,"Keys");
index36 = 0;
groupLen36 = group36.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("k", _k);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 18;
if (index36 < groupLen36) {
this.state = 17;
_k = BA.ObjectToString(group36.runMethod(false,"Get",index36));Debug.locals.put("k", _k);}
if (true) break;

case 32:
//C
this.state = 31;
index36++;
Debug.locals.put("k", _k);
if (true) break;

case 17:
//C
this.state = 32;
 BA.debugLineNum = 273;BA.debugLine="Log(\"mExpedicionesSinEntregarResult: \" & k & \":";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","894765121",RemoteObject.concat(RemoteObject.createImmutable("mExpedicionesSinEntregarResult: "),_k,RemoteObject.createImmutable(": "),_mexpedicionessinentregarresult.runMethod(false,"Get",(Object)((_k)))),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
Debug.locals.put("k", _k);
;
 BA.debugLineNum = 276;BA.debugLine="Dim mDiffgram As Map=mExpedicionesSinEntregarRes";
Debug.ShouldStop(524288);
_mdiffgram = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mexpedicionessinentregarresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("diffgr:diffgram")))));Debug.locals.put("mDiffgram", _mdiffgram);Debug.locals.put("mDiffgram", _mdiffgram);
 BA.debugLineNum = 278;BA.debugLine="If mDiffgram.ContainsKey(\"EXPEDICIONES\")=False T";
Debug.ShouldStop(2097152);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_mdiffgram.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("EXPEDICIONES")))),parent.__c.getField(true,"False"))) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 279;BA.debugLine="Log(\"Sin Expediciones pendientes\")";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","894765127",RemoteObject.createImmutable("Sin Expediciones pendientes"),0);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 281;BA.debugLine="Dim mExpediciones As Map=mDiffgram.get(\"EXPEDIC";
Debug.ShouldStop(16777216);
_mexpediciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mexpediciones = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdiffgram.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EXPEDICIONES")))));Debug.locals.put("mExpediciones", _mexpediciones);Debug.locals.put("mExpediciones", _mexpediciones);
 BA.debugLineNum = 282;BA.debugLine="Log(\"Hay Expediciones pendientes\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","894765130",RemoteObject.createImmutable("Hay Expediciones pendientes"),0);
 BA.debugLineNum = 292;BA.debugLine="lstDatosExpediciones=GetElements(mExpediciones,";
Debug.ShouldStop(8);
_lstdatosexpediciones = _getelements(_mexpediciones,RemoteObject.createImmutable("EXPEDICIONES"));Debug.locals.put("lstDatosExpediciones", _lstdatosexpediciones);
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 296;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 298;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 299;BA.debugLine="mRes.Put(\"lstRes\",lstDatosExpediciones)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstdatosexpediciones.getObject())));
 BA.debugLineNum = 300;BA.debugLine="Return mRes";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _obtenerhistoricoestadosexpediciontxt(RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("ObtenerHistoricoEstadosExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,513);
if (RapidSub.canDelegate("obtenerhistoricoestadosexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","obtenerhistoricoestadosexpediciontxt", _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
ResumableSub_ObtenerHistoricoEstadosExpedicionTXT rsub = new ResumableSub_ObtenerHistoricoEstadosExpedicionTXT(null,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
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
public static class ResumableSub_ObtenerHistoricoEstadosExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerHistoricoEstadosExpedicionTXT(b4j.docU.cmauxtxt parent,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) {
this.parent = parent;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _codorigen;
RemoteObject _coddestino;
RemoteObject _nexped1;
RemoteObject _nexped2;
RemoteObject _ano;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _mparseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _menvelope = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbuscarhistoricoestadosresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbuscarhistoricoestadosresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mestados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstdatosestadosexpedicion = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerHistoricoEstadosExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,513);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 515;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 516;BA.debugLine="Dim URL As String";
Debug.ShouldStop(8);
_url = RemoteObject.createImmutable("");Debug.locals.put("URL", _url);
 BA.debugLineNum = 517;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(16);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 518;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(32);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 520;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _cargacredencialestxt());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 521;BA.debugLine="If sResp=\"NOK\" Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 522;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 523;BA.debugLine="Return mRes";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 531;BA.debugLine="Wait For(EnvioDatosWebServiceBuscarHistoricoEstad";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _enviodatoswebservicebuscarhistoricoestadosexpediciontxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 532;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 533;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 535;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(4194304);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de TXT solicitando URL Tracking."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 536;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 537;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 538;BA.debugLine="mRes.Put(\"URL\",URL)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_url)));
 BA.debugLineNum = 540;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 548;BA.debugLine="Log(\"sresponse BuscarHistoricoEstados\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","895158307",RemoteObject.createImmutable("sresponse BuscarHistoricoEstados"),0);
 BA.debugLineNum = 549;BA.debugLine="Log(\"\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","895158308",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 550;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","895158309",_sresponse,0);
 BA.debugLineNum = 552;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(128);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 553;BA.debugLine="xm.Initialize";
Debug.ShouldStop(256);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba);
 BA.debugLineNum = 554;BA.debugLine="Dim mParsedData As Map";
Debug.ShouldStop(512);
_mparseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 555;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
Debug.ShouldStop(1024);
_mparseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_sresponse));Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 561;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
Debug.ShouldStop(65536);
_menvelope = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_menvelope = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Envelope")))));Debug.locals.put("mEnvelope", _menvelope);Debug.locals.put("mEnvelope", _menvelope);
 BA.debugLineNum = 565;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
Debug.ShouldStop(1048576);
_mbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbody = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _menvelope.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Body")))));Debug.locals.put("mBody", _mbody);Debug.locals.put("mBody", _mbody);
 BA.debugLineNum = 569;BA.debugLine="Dim mBuscarHistoricoEstadosResponse As Map=mBody.";
Debug.ShouldStop(16777216);
_mbuscarhistoricoestadosresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbuscarhistoricoestadosresponse = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbody.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BuscarHistoricoEstadosResponse")))));Debug.locals.put("mBuscarHistoricoEstadosResponse", _mbuscarhistoricoestadosresponse);Debug.locals.put("mBuscarHistoricoEstadosResponse", _mbuscarhistoricoestadosresponse);
 BA.debugLineNum = 573;BA.debugLine="Dim mBuscarHistoricoEstadosResult As Map=mBuscarH";
Debug.ShouldStop(268435456);
_mbuscarhistoricoestadosresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbuscarhistoricoestadosresult = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbuscarhistoricoestadosresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BuscarHistoricoEstadosResult")))));Debug.locals.put("mBuscarHistoricoEstadosResult", _mbuscarhistoricoestadosresult);Debug.locals.put("mBuscarHistoricoEstadosResult", _mbuscarhistoricoestadosresult);
 BA.debugLineNum = 578;BA.debugLine="Dim mDiffgram As Map=mBuscarHistoricoEstadosResul";
Debug.ShouldStop(2);
_mdiffgram = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdiffgram = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbuscarhistoricoestadosresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("diffgr:diffgram")))));Debug.locals.put("mDiffgram", _mdiffgram);Debug.locals.put("mDiffgram", _mdiffgram);
 BA.debugLineNum = 580;BA.debugLine="Dim mEstados As Map=mDiffgram.Get(\"ESTADO\")";
Debug.ShouldStop(8);
_mestados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mestados = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mdiffgram.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ESTADO")))));Debug.locals.put("mEstados", _mestados);Debug.locals.put("mEstados", _mestados);
 BA.debugLineNum = 582;BA.debugLine="If mEstados.IsInitialized=False Then  ' no datos";
Debug.ShouldStop(32);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_mestados.runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 583;BA.debugLine="Dim lstDatosEstadosExpedicion As List";
Debug.ShouldStop(64);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 584;BA.debugLine="lstDatosEstadosExpedicion.Initialize";
Debug.ShouldStop(128);
_lstdatosestadosexpedicion.runVoidMethod ("Initialize");
 BA.debugLineNum = 585;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No hay dato";
Debug.ShouldStop(256);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(BA.ObjectToString("No hay datos de estados para la expedicion seleccionada.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 586;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 587;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 589;BA.debugLine="Dim lstDatosEstadosExpedicion As List=GetElement";
Debug.ShouldStop(4096);
_lstdatosestadosexpedicion = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstdatosestadosexpedicion = _getelements(_mestados,RemoteObject.createImmutable("ESTADO"));Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);Debug.locals.put("lstDatosEstadosExpedicion", _lstdatosestadosexpedicion);
 BA.debugLineNum = 590;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 593;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 594;BA.debugLine="mRes.Put(\"lstRes\",lstDatosEstadosExpedicion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstdatosestadosexpedicion.getObject())));
 BA.debugLineNum = 595;BA.debugLine="Return mRes";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _obtenerurltrazabilidadexpediciontxt(RemoteObject _numexpedicion) throws Exception{
try {
		Debug.PushSubsStack("ObtenerURLTrazabilidadExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,78);
if (RapidSub.canDelegate("obtenerurltrazabilidadexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","obtenerurltrazabilidadexpediciontxt", _numexpedicion);}
ResumableSub_ObtenerURLTrazabilidadExpedicionTXT rsub = new ResumableSub_ObtenerURLTrazabilidadExpedicionTXT(null,_numexpedicion);
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
public static class ResumableSub_ObtenerURLTrazabilidadExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerURLTrazabilidadExpedicionTXT(b4j.docU.cmauxtxt parent,RemoteObject _numexpedicion) {
this.parent = parent;
this._numexpedicion = _numexpedicion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.cmauxtxt parent;
RemoteObject _numexpedicion;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _codorigen = RemoteObject.createImmutable("");
RemoteObject _coddestino = RemoteObject.createImmutable("");
RemoteObject _nexped1 = RemoteObject.createImmutable(0);
RemoteObject _nexped2 = RemoteObject.createImmutable("");
RemoteObject _ano = RemoteObject.createImmutable("");
RemoteObject _sresponse = RemoteObject.createImmutable("");
RemoteObject _xm = RemoteObject.declareNull("b4j.docU.xml2map");
RemoteObject _mparseddata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _menvelope = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mbody = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _murltrackingresponse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _urltrackingresult = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ObtenerURLTrazabilidadExpedicionTXT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,78);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("NumExpedicion", _numexpedicion);
 BA.debugLineNum = 80;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(32768);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 81;BA.debugLine="Dim URL As String";
Debug.ShouldStop(65536);
_url = RemoteObject.createImmutable("");Debug.locals.put("URL", _url);
 BA.debugLineNum = 82;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(131072);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 83;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="If NumExpedicion.Length<23 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("<",_numexpedicion.runMethod(true,"length"),BA.numberCast(double.class, 23))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 86;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El número d";
Debug.ShouldStop(2097152);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(BA.ObjectToString("El número de expedición es erróneo, revisar.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 87;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 88;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 89;BA.debugLine="Return mRes";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 97;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _cargacredencialestxt());
this.state = 14;
return;
case 14:
//C
this.state = 5;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 98;BA.debugLine="If sResp=\"NOK\" Then";
Debug.ShouldStop(2);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_sresp,BA.ObjectToString("NOK"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 99;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("NOK"))));
 BA.debugLineNum = 100;BA.debugLine="Return mRes";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 103;BA.debugLine="Dim CodOrigen As String=NumExpedicion.SubString2(";
Debug.ShouldStop(64);
_codorigen = _numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("CodOrigen", _codorigen);Debug.locals.put("CodOrigen", _codorigen);
 BA.debugLineNum = 104;BA.debugLine="Dim CodDestino As String=NumExpedicion.SubString2";
Debug.ShouldStop(128);
_coddestino = _numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 6)),(Object)(BA.numberCast(int.class, 9)));Debug.locals.put("CodDestino", _coddestino);Debug.locals.put("CodDestino", _coddestino);
 BA.debugLineNum = 105;BA.debugLine="Dim Nexped1 As Int=NumExpedicion.SubString2(9,12)";
Debug.ShouldStop(256);
_nexped1 = BA.numberCast(int.class, _numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 9)),(Object)(BA.numberCast(int.class, 12))));Debug.locals.put("Nexped1", _nexped1);Debug.locals.put("Nexped1", _nexped1);
 BA.debugLineNum = 106;BA.debugLine="Dim Nexped2 As String=NumExpedicion.SubString2(12";
Debug.ShouldStop(512);
_nexped2 = _numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 19)));Debug.locals.put("Nexped2", _nexped2);Debug.locals.put("Nexped2", _nexped2);
 BA.debugLineNum = 107;BA.debugLine="Dim Ano As String=NumExpedicion.SubString2(19,23)";
Debug.ShouldStop(1024);
_ano = _numexpedicion.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 19)),(Object)(BA.numberCast(int.class, 23)));Debug.locals.put("Ano", _ano);Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 108;BA.debugLine="Wait For(EnvioDatosWebServiceURLTrackingTxT(Codig";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _enviodatoswebserviceurltrackingtxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_sresponse = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("sResponse", _sresponse);
;
 BA.debugLineNum = 109;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
Debug.ShouldStop(4096);
if (true) break;

case 9:
//if
this.state = 12;
if (_sresponse.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR HTTPJob"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 110;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 112;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
Debug.ShouldStop(32768);
_msa = parent._xui.runMethod(false,"MsgboxAsync",cmauxtxt.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Ha fallado la llamada al web service de TXT solicitando URL Tracking."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresponse,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 113;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", cmauxtxt.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 114;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 115;BA.debugLine="mRes.Put(\"URL\",URL)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_url)));
 BA.debugLineNum = 117;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 120;BA.debugLine="Log(\"sresponse URLTRacking\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","894568490",RemoteObject.createImmutable("sresponse URLTRacking"),0);
 BA.debugLineNum = 121;BA.debugLine="Log(\"\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","894568491",RemoteObject.createImmutable(""),0);
 BA.debugLineNum = 122;BA.debugLine="Log(sResponse)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","894568492",_sresponse,0);
 BA.debugLineNum = 124;BA.debugLine="Dim xm As Xml2Map";
Debug.ShouldStop(134217728);
_xm = RemoteObject.createNew ("b4j.docU.xml2map");Debug.locals.put("xm", _xm);
 BA.debugLineNum = 125;BA.debugLine="xm.Initialize";
Debug.ShouldStop(268435456);
_xm.runClassMethod (b4j.docU.xml2map.class, "_initialize" /*RemoteObject*/ ,cmauxtxt.ba);
 BA.debugLineNum = 126;BA.debugLine="Dim mParsedData As Map";
Debug.ShouldStop(536870912);
_mparseddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 127;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
Debug.ShouldStop(1073741824);
_mparseddata = _xm.runClassMethod (b4j.docU.xml2map.class, "_parse" /*RemoteObject*/ ,(Object)(_sresponse));Debug.locals.put("mParsedData", _mparseddata);
 BA.debugLineNum = 133;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
Debug.ShouldStop(16);
_menvelope = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_menvelope = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparseddata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Envelope")))));Debug.locals.put("mEnvelope", _menvelope);Debug.locals.put("mEnvelope", _menvelope);
 BA.debugLineNum = 137;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
Debug.ShouldStop(256);
_mbody = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mbody = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _menvelope.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("soap:Body")))));Debug.locals.put("mBody", _mbody);Debug.locals.put("mBody", _mbody);
 BA.debugLineNum = 141;BA.debugLine="Dim mURLTrackingResponse As Map=mBody.Get(\"UrlTra";
Debug.ShouldStop(4096);
_murltrackingresponse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_murltrackingresponse = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mbody.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UrlTrackingResponse")))));Debug.locals.put("mURLTrackingResponse", _murltrackingresponse);Debug.locals.put("mURLTrackingResponse", _murltrackingresponse);
 BA.debugLineNum = 145;BA.debugLine="Dim URLTrackingResult As String=mURLTrackingRespo";
Debug.ShouldStop(65536);
_urltrackingresult = BA.ObjectToString(_murltrackingresponse.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UrlTrackingResult")))));Debug.locals.put("URLTrackingResult", _urltrackingresult);Debug.locals.put("URLTrackingResult", _urltrackingresult);
 BA.debugLineNum = 146;BA.debugLine="mRes.Put(\"Accion\",\"OK\")";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((RemoteObject.createImmutable("OK"))));
 BA.debugLineNum = 147;BA.debugLine="mRes.Put(\"URL\",URLTrackingResult)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((_urltrackingresult)));
 BA.debugLineNum = 149;BA.debugLine="Return mRes";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cmauxtxt._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 5;BA.debugLine="Private UserTXT, PswTXT, TokenWebTXT As String";
cmauxtxt._usertxt = RemoteObject.createImmutable("");
cmauxtxt._pswtxt = RemoteObject.createImmutable("");
cmauxtxt._tokenwebtxt = RemoteObject.createImmutable("");
 //BA.debugLineNum = 6;BA.debugLine="Private CodigoClienteTXT As Int=66441";
cmauxtxt._codigoclientetxt = BA.numberCast(int.class, 66441);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _xmlsoapbuscarestadoexpediciontxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapBuscarEstadoExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,482);
if (RapidSub.canDelegate("xmlsoapbuscarestadoexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapbuscarestadoexpediciontxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 482;BA.debugLine="Sub XmlSoapBuscarEstadoExpedicionTxT(CodEmpresa As";
Debug.ShouldStop(2);
 BA.debugLineNum = 485;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(16);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("  <soap12:Header>\n"),RemoteObject.createImmutable("	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("	</cLoginCredential>\n"),RemoteObject.createImmutable("  </soap12:Header>\n"),RemoteObject.createImmutable("  <soap12:Body>\n"),RemoteObject.createImmutable("    <BuscarEstado xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("		<CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("		<CodOrigen>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codorigen))),RemoteObject.createImmutable("</CodOrigen>\n"),RemoteObject.createImmutable("		<CodDestin>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_coddestino))),RemoteObject.createImmutable("</CodDestin>\n"),RemoteObject.createImmutable("		<Nexped1>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_nexped1))),RemoteObject.createImmutable("</Nexped1>\n"),RemoteObject.createImmutable("		<Nexped2>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nexped2))),RemoteObject.createImmutable("</Nexped2>\n"),RemoteObject.createImmutable("		<Ano>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ano))),RemoteObject.createImmutable("</Ano>\n"),RemoteObject.createImmutable("    </BuscarEstado>\n"),RemoteObject.createImmutable("  </soap12:Body>\n"),RemoteObject.createImmutable("</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 507;BA.debugLine="Return xlmStr";
Debug.ShouldStop(67108864);
if (true) return _xlmstr;
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlsoapbuscarexpedicionesperiodotxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb,RemoteObject _fechadesde,RemoteObject _fechahasta) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapBuscarExpedicionesPeriodoTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,917);
if (RapidSub.canDelegate("xmlsoapbuscarexpedicionesperiodotxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapbuscarexpedicionesperiodotxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb, _fechadesde, _fechahasta);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("FechaDesde", _fechadesde);
Debug.locals.put("FechaHasta", _fechahasta);
 BA.debugLineNum = 917;BA.debugLine="Sub XmlSoapBuscarExpedicionesPeriodoTxT(CodEmpresa";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 920;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(8388608);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("  <soap12:Header>\n"),RemoteObject.createImmutable("	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("	</cLoginCredential>\n"),RemoteObject.createImmutable("  </soap12:Header>\n"),RemoteObject.createImmutable("  <soap12:Body>\n"),RemoteObject.createImmutable("    <BuscarExpediciones xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <FechaDesde>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fechadesde))),RemoteObject.createImmutable("</FechaDesde>\n"),RemoteObject.createImmutable("      <FechaHasta>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fechahasta))),RemoteObject.createImmutable("</FechaHasta>\n"),RemoteObject.createImmutable("    </BuscarExpediciones>\n"),RemoteObject.createImmutable("  </soap12:Body>\n"),RemoteObject.createImmutable("</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 938;BA.debugLine="Return xlmStr";
Debug.ShouldStop(512);
if (true) return _xlmstr;
 BA.debugLineNum = 939;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlsoapbuscarhistoricoestadosexpediciontxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapBuscarHistoricoEstadosExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,626);
if (RapidSub.canDelegate("xmlsoapbuscarhistoricoestadosexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapbuscarhistoricoestadosexpediciontxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 626;BA.debugLine="Sub XmlSoapBuscarHistoricoEstadosExpedicionTxT(Cod";
Debug.ShouldStop(131072);
 BA.debugLineNum = 629;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(1048576);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("  <soap12:Header>\n"),RemoteObject.createImmutable("	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("	</cLoginCredential>\n"),RemoteObject.createImmutable("  </soap12:Header>\n"),RemoteObject.createImmutable("  <soap12:Body>\n"),RemoteObject.createImmutable("    <BuscarHistoricoEstados xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("		<CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("		<CodOrigen>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codorigen))),RemoteObject.createImmutable("</CodOrigen>\n"),RemoteObject.createImmutable("		<CodDestin>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_coddestino))),RemoteObject.createImmutable("</CodDestin>\n"),RemoteObject.createImmutable("		<Nexped1>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_nexped1))),RemoteObject.createImmutable("</Nexped1>\n"),RemoteObject.createImmutable("		<Nexped2>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nexped2))),RemoteObject.createImmutable("</Nexped2>\n"),RemoteObject.createImmutable("		<Ano>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ano))),RemoteObject.createImmutable("</Ano>\n"),RemoteObject.createImmutable("    </BuscarHistoricoEstados>\n"),RemoteObject.createImmutable("  </soap12:Body>\n"),RemoteObject.createImmutable("</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 651;BA.debugLine="Return xlmStr";
Debug.ShouldStop(1024);
if (true) return _xlmstr;
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlsoapconsultaincidenciasexpediciontxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapConsultaIncidenciasExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,772);
if (RapidSub.canDelegate("xmlsoapconsultaincidenciasexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapconsultaincidenciasexpediciontxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 772;BA.debugLine="Sub XmlSoapConsultaIncidenciasExpedicionTxT(CodEmp";
Debug.ShouldStop(8);
 BA.debugLineNum = 775;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(64);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("  <soap12:Body>\n"),RemoteObject.createImmutable("    <ConsultaIncidencias xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("      <CodOrigen>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codorigen))),RemoteObject.createImmutable("</CodOrigen>\n"),RemoteObject.createImmutable("      <CodDestin>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_coddestino))),RemoteObject.createImmutable("</CodDestin>\n"),RemoteObject.createImmutable("      <Nexped1>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_nexped1))),RemoteObject.createImmutable("</Nexped1>\n"),RemoteObject.createImmutable("      <Nexped2>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nexped2))),RemoteObject.createImmutable("</Nexped2>\n"),RemoteObject.createImmutable("      <Ano>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ano))),RemoteObject.createImmutable("</Ano>\n"),RemoteObject.createImmutable("    </ConsultaIncidencias>\n"),RemoteObject.createImmutable("  </soap12:Body>\n"),RemoteObject.createImmutable("</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 792;BA.debugLine="Return xlmStr";
Debug.ShouldStop(8388608);
if (true) return _xlmstr;
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlsoapexpediciones_incidenciasexpediciontxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb,RemoteObject _idexpedicion) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapExpediciones_IncidenciasExpedicionTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,943);
if (RapidSub.canDelegate("xmlsoapexpediciones_incidenciasexpediciontxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapexpediciones_incidenciasexpediciontxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb, _idexpedicion);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("IDExpedicion", _idexpedicion);
 BA.debugLineNum = 943;BA.debugLine="Sub XmlSoapExpediciones_IncidenciasExpedicionTxT(C";
Debug.ShouldStop(16384);
 BA.debugLineNum = 945;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(65536);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("  <soap12:Header>\n"),RemoteObject.createImmutable("    <cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("    </cLoginCredential>ººº\n"),RemoteObject.createImmutable("  </soap12:Header>\n"),RemoteObject.createImmutable("  <soap12:Body>\n"),RemoteObject.createImmutable("    <Expediciones_Incidencias xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <IdExpedicion>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_idexpedicion))),RemoteObject.createImmutable("</IdExpedicion>\n"),RemoteObject.createImmutable("    </Expediciones_Incidencias>\n"),RemoteObject.createImmutable("  </soap12:Body>\n"),RemoteObject.createImmutable("</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 962;BA.debugLine="Return xlmStr";
Debug.ShouldStop(2);
if (true) return _xlmstr;
 BA.debugLineNum = 963;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlsoapexpedicionessinentregartxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapExpedicionesSinEntregarTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,330);
if (RapidSub.canDelegate("xmlsoapexpedicionessinentregartxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapexpedicionessinentregartxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
 BA.debugLineNum = 330;BA.debugLine="Sub XmlSoapExpedicionesSinEntregarTxT(CodEmpresa A";
Debug.ShouldStop(512);
 BA.debugLineNum = 331;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(1024);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("  <soap12:Header>\n"),RemoteObject.createImmutable("	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("	</cLoginCredential>\n"),RemoteObject.createImmutable("  </soap12:Header>\n"),RemoteObject.createImmutable("  <soap12:Body>\n"),RemoteObject.createImmutable("    <ExpedicionesSinEntregar xmlns=\"https://ws.txt.es/webserviceTXT.asmx\" />\n"),RemoteObject.createImmutable("  </soap12:Body>\n"),RemoteObject.createImmutable("</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 346;BA.debugLine="Return xlmStr";
Debug.ShouldStop(33554432);
if (true) return _xlmstr;
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xmlsoapurltrackingtxt(RemoteObject _codempresa,RemoteObject _codcliente,RemoteObject _usuario,RemoteObject _passw,RemoteObject _tokenweb,RemoteObject _codorigen,RemoteObject _coddestino,RemoteObject _nexped1,RemoteObject _nexped2,RemoteObject _ano) throws Exception{
try {
		Debug.PushSubsStack("XmlSoapURLTrackingTxT (cmauxtxt) ","cmauxtxt",43,cmauxtxt.ba,cmauxtxt.mostCurrent,181);
if (RapidSub.canDelegate("xmlsoapurltrackingtxt")) { return b4j.docU.cmauxtxt.remoteMe.runUserSub(false, "cmauxtxt","xmlsoapurltrackingtxt", _codempresa, _codcliente, _usuario, _passw, _tokenweb, _codorigen, _coddestino, _nexped1, _nexped2, _ano);}
RemoteObject _xlmstr = RemoteObject.createImmutable("");
Debug.locals.put("CodEmpresa", _codempresa);
Debug.locals.put("CodCliente", _codcliente);
Debug.locals.put("Usuario", _usuario);
Debug.locals.put("Passw", _passw);
Debug.locals.put("TokenWeb", _tokenweb);
Debug.locals.put("CodOrigen", _codorigen);
Debug.locals.put("CodDestino", _coddestino);
Debug.locals.put("Nexped1", _nexped1);
Debug.locals.put("Nexped2", _nexped2);
Debug.locals.put("Ano", _ano);
 BA.debugLineNum = 181;BA.debugLine="Sub XmlSoapURLTrackingTxT(CodEmpresa As String, Co";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
Debug.ShouldStop(4194304);
_xlmstr = (RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"),RemoteObject.createImmutable("	<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"),RemoteObject.createImmutable("	<soap12:Header>\n"),RemoteObject.createImmutable("	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("      <CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("      <CodCliente>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codcliente))),RemoteObject.createImmutable("</CodCliente>\n"),RemoteObject.createImmutable("      <Usuario>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_usuario))),RemoteObject.createImmutable("</Usuario>\n"),RemoteObject.createImmutable("      <Password>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_passw))),RemoteObject.createImmutable("</Password>\n"),RemoteObject.createImmutable("      <Token>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tokenweb))),RemoteObject.createImmutable("</Token>\n"),RemoteObject.createImmutable("	</cLoginCredential>\n"),RemoteObject.createImmutable("	</soap12:Header>\n"),RemoteObject.createImmutable("	<soap12:Body>\n"),RemoteObject.createImmutable("	<UrlTracking xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"),RemoteObject.createImmutable("	<CodEmpresa>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codempresa))),RemoteObject.createImmutable("</CodEmpresa>\n"),RemoteObject.createImmutable("	<CodOrigen>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_codorigen))),RemoteObject.createImmutable("</CodOrigen>\n"),RemoteObject.createImmutable("	<CodDestin>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_coddestino))),RemoteObject.createImmutable("</CodDestin>\n"),RemoteObject.createImmutable("	<Nexped1>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_nexped1))),RemoteObject.createImmutable("</Nexped1>\n"),RemoteObject.createImmutable("	<Nexped2>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nexped2))),RemoteObject.createImmutable("</Nexped2>\n"),RemoteObject.createImmutable("	<Ano>"),cmauxtxt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ano))),RemoteObject.createImmutable("</Ano>\n"),RemoteObject.createImmutable("	</UrlTracking>\n"),RemoteObject.createImmutable("	</soap12:Body>\n"),RemoteObject.createImmutable("	</soap12:Envelope>")));Debug.locals.put("xlmStr", _xlmstr);Debug.locals.put("xlmStr", _xlmstr);
 BA.debugLineNum = 205;BA.debugLine="Return xlmStr";
Debug.ShouldStop(4096);
if (true) return _xlmstr;
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
}