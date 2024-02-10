package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class jrdcquery_subs_0 {


public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,14);
if (RapidSub.canDelegate("createcommand")) { return b4j.docU.jrdcquery.remoteMe.runUserSub(false, "jrdcquery","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
Debug.locals.put("name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 14;BA.debugLine="Sub CreateCommand(name As String, Parameters() As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(16384);
_cmd = RemoteObject.createNew ("b4j.docU.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 16;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(32768);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="cmd.Name = name";
Debug.ShouldStop(65536);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 18;BA.debugLine="If Parameters <> Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_parameters)) { 
 BA.debugLineNum = 19;BA.debugLine="cmd.Parameters = Parameters";
Debug.ShouldStop(262144);
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);
 };
 BA.debugLineNum = 22;BA.debugLine="Return cmd";
Debug.ShouldStop(2097152);
if (true) return _cmd;
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject _rdclink) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,7);
if (RapidSub.canDelegate("createrequest")) { return b4j.docU.jrdcquery.remoteMe.runUserSub(false, "jrdcquery","createrequest", _rdclink);}
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
Debug.locals.put("rdcLink", _rdclink);
 BA.debugLineNum = 7;BA.debugLine="Sub CreateRequest(rdcLink As String) As DBRequestM";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(128);
_req = RemoteObject.createNew ("b4j.docU.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 9;BA.debugLine="req.Initialize(Me, rdcLink)   'originalmente  req";
Debug.ShouldStop(256);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,jrdcquery.ba,(Object)(jrdcquery.getObject()),(Object)(_rdclink));
 BA.debugLineNum = 10;BA.debugLine="Return req";
Debug.ShouldStop(512);
if (true) return _req;
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _datosjrdc(RemoteObject _rdclink,RemoteObject _comandoconfigproperties,RemoteObject _parametros,RemoteObject _callmodule) throws Exception{
try {
		Debug.PushSubsStack("DatosJRDC (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,27);
if (RapidSub.canDelegate("datosjrdc")) { b4j.docU.jrdcquery.remoteMe.runUserSub(false, "jrdcquery","datosjrdc", _rdclink, _comandoconfigproperties, _parametros, _callmodule); return;}
ResumableSub_DatosJRDC rsub = new ResumableSub_DatosJRDC(null,_rdclink,_comandoconfigproperties,_parametros,_callmodule);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DatosJRDC extends BA.ResumableSub {
public ResumableSub_DatosJRDC(b4j.docU.jrdcquery parent,RemoteObject _rdclink,RemoteObject _comandoconfigproperties,RemoteObject _parametros,RemoteObject _callmodule) {
this.parent = parent;
this._rdclink = _rdclink;
this._comandoconfigproperties = _comandoconfigproperties;
this._parametros = _parametros;
this._callmodule = _callmodule;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jrdcquery parent;
RemoteObject _rdclink;
RemoteObject _comandoconfigproperties;
RemoteObject _parametros;
RemoteObject _callmodule;
RemoteObject _lstres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jobtest = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _rdclastpos = RemoteObject.createImmutable(0);
RemoteObject _urltestjrdc = RemoteObject.createImmutable("");
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _data = null;
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject group38;
int index38;
int groupLen38;
int step41;
int limit41;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosJRDC (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,27);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("rdcLink", _rdclink);
Debug.locals.put("ComandoConfigProperties", _comandoconfigproperties);
Debug.locals.put("Parametros", _parametros);
Debug.locals.put("CallModule", _callmodule);
 BA.debugLineNum = 41;BA.debugLine="Dim lstRes As List";
Debug.ShouldStop(256);
_lstres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRes", _lstres);
 BA.debugLineNum = 42;BA.debugLine="lstRes.Initialize";
Debug.ShouldStop(512);
_lstres.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 44;BA.debugLine="m.Initialize";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 46;BA.debugLine="m.Put(\"QryOK\",False)  ' añadido 14/10/22";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("QryOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 47;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 48;BA.debugLine="m.Put(\"lstRes\",lstRes)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRes"))),(Object)((_lstres.getObject())));
 BA.debugLineNum = 51;BA.debugLine="m.Put(\"ErrMsg\",\"\")";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrMsg"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 53;BA.debugLine="Log(\"inicio check test JRDC\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","8106889242",RemoteObject.createImmutable("inicio check test JRDC"),0);
 BA.debugLineNum = 55;BA.debugLine="Dim jobTest As HttpJob";
Debug.ShouldStop(4194304);
_jobtest = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("jobTest", _jobtest);
 BA.debugLineNum = 56;BA.debugLine="jobTest.Initialize(\"\",Me)";
Debug.ShouldStop(8388608);
_jobtest.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,jrdcquery.ba,(Object)(BA.ObjectToString("")),(Object)(jrdcquery.getObject()));
 BA.debugLineNum = 57;BA.debugLine="Dim rdcLastPos As Int=rdcLink.LastIndexOf(\"/rdc\")";
Debug.ShouldStop(16777216);
_rdclastpos = _rdclink.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/rdc")));Debug.locals.put("rdcLastPos", _rdclastpos);Debug.locals.put("rdcLastPos", _rdclastpos);
 BA.debugLineNum = 58;BA.debugLine="Dim URLTestJRDC As String=rdcLink.SubString2(0,rd";
Debug.ShouldStop(33554432);
_urltestjrdc = RemoteObject.concat(_rdclink.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_rdclastpos)),RemoteObject.createImmutable("/test"));Debug.locals.put("URLTestJRDC", _urltestjrdc);Debug.locals.put("URLTestJRDC", _urltestjrdc);
 BA.debugLineNum = 59;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(67108864);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 60;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(\"\")";
Debug.ShouldStop(134217728);
_data = _ser.runMethod(false,"ConvertObjectToBytes",(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 61;BA.debugLine="jobTest.PostBytes(URLTestJRDC,data)";
Debug.ShouldStop(268435456);
_jobtest.runClassMethod (b4j.docU.httpjob.class, "_postbytes" /*RemoteObject*/ ,(Object)(_urltestjrdc),(Object)(_data));
 BA.debugLineNum = 62;BA.debugLine="jobTest.GetRequest.Timeout=10000";
Debug.ShouldStop(536870912);
_jobtest.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 10000));
 BA.debugLineNum = 63;BA.debugLine="Wait For (jobTest) JobDone(jobTest As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", jrdcquery.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jrdcquery", "datosjrdc"), (_jobtest));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_jobtest = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("jobTest", _jobtest);
;
 BA.debugLineNum = 65;BA.debugLine="Log(\"Success check test JRDC: \" & jobTest.Success";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","8106889254",RemoteObject.concat(RemoteObject.createImmutable("Success check test JRDC: "),_jobtest.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 67;BA.debugLine="If Not(jobTest.Success) Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.runMethod(true,"Not",(Object)(_jobtest.getField(true,"_success" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 68;BA.debugLine="Log(\"jobTest.Response.ErrorMessage: \" & jobTest.";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","8106889257",RemoteObject.concat(RemoteObject.createImmutable("jobTest.Response.ErrorMessage: "),_jobtest.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 69;BA.debugLine="m.Put(\"ErrMsg\",jobTest.ErrorMessage)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ErrMsg"))),(Object)((_jobtest.getField(true,"_errormessage" /*RemoteObject*/ ))));
 BA.debugLineNum = 70;BA.debugLine="jobTest.Release";
Debug.ShouldStop(32);
_jobtest.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="CallSubDelayed2(CallModule, \"DatosJRDC_Completed";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("CallSubDelayed2",jrdcquery.ba,(Object)(_callmodule),(Object)(BA.ObjectToString("DatosJRDC_Completed")),(Object)((_m)));
 BA.debugLineNum = 72;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 74;BA.debugLine="jobTest.Release";
Debug.ShouldStop(512);
_jobtest.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="Dim req As DBRequestManager = CreateRequest(rdcLi";
Debug.ShouldStop(524288);
_req = _createrequest(_rdclink);Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 85;BA.debugLine="Dim cmd As DBCommand = CreateCommand(ComandoConfi";
Debug.ShouldStop(1048576);
_cmd = _createcommand(_comandoconfigproperties,_parametros);Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 88;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", jrdcquery.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jrdcquery", "datosjrdc"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 90;BA.debugLine="If j.Success Then";
Debug.ShouldStop(33554432);
if (true) break;

case 5:
//if
this.state = 24;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 23;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 91;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(67108864);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 92;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(134217728);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 93;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","req_result", jrdcquery.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jrdcquery", "datosjrdc"), (_req));
this.state = 27;
return;
case 27:
//C
this.state = 8;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 95;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 8:
//if
this.state = 21;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 10;
}else {
this.state = 20;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 96;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 97;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(1);
if (true) break;

case 11:
//for
this.state = 18;
group38 = _res.getField(false,"Rows" /*RemoteObject*/ );
index38 = 0;
groupLen38 = group38.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 18;
if (index38 < groupLen38) {
this.state = 13;
_records = (group38.runMethod(false,"Get",index38));Debug.locals.put("records", _records);}
if (true) break;

case 29:
//C
this.state = 28;
index38++;
Debug.locals.put("records", _records);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 98;BA.debugLine="Dim mReg As Map";
Debug.ShouldStop(2);
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 99;BA.debugLine="mReg.Initialize";
Debug.ShouldStop(4);
_mreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(8);
if (true) break;

case 14:
//for
this.state = 17;
step41 = 1;
limit41 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 17;
if ((step41 > 0 && _i <= limit41) || (step41 < 0 && _i >= limit41)) this.state = 16;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step41)) ;
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 31;
 BA.debugLineNum = 102;BA.debugLine="mReg.Put(res.Columns.GetKeyAt(i),records(i))";
Debug.ShouldStop(32);
_mreg.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_records.getArrayElement(false,BA.numberCast(int.class, _i))));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 29;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 106;BA.debugLine="lstRes.Add(mReg)";
Debug.ShouldStop(512);
_lstres.runVoidMethod ("Add",(Object)((_mreg.getObject())));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
Debug.locals.put("records", _records);
;
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 114;BA.debugLine="j.Release";
Debug.ShouldStop(131072);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="CallSubDelayed2(CallModule, \"DatosJRDC_Completed\"";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("CallSubDelayed2",jrdcquery.ba,(Object)(_callmodule),(Object)(BA.ObjectToString("DatosJRDC_Completed")),(Object)((_m)));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject _jobtest) throws Exception{
}
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static void  _ejecutarbatch(RemoteObject _rdclink,RemoteObject _listacmds,RemoteObject _callmodule) throws Exception{
try {
		Debug.PushSubsStack("EjecutarBatch (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,130);
if (RapidSub.canDelegate("ejecutarbatch")) { b4j.docU.jrdcquery.remoteMe.runUserSub(false, "jrdcquery","ejecutarbatch", _rdclink, _listacmds, _callmodule); return;}
ResumableSub_EjecutarBatch rsub = new ResumableSub_EjecutarBatch(null,_rdclink,_listacmds,_callmodule);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EjecutarBatch extends BA.ResumableSub {
public ResumableSub_EjecutarBatch(b4j.docU.jrdcquery parent,RemoteObject _rdclink,RemoteObject _listacmds,RemoteObject _callmodule) {
this.parent = parent;
this._rdclink = _rdclink;
this._listacmds = _listacmds;
this._callmodule = _callmodule;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jrdcquery parent;
RemoteObject _rdclink;
RemoteObject _listacmds;
RemoteObject _callmodule;
RemoteObject _bresult = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EjecutarBatch (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,130);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("rdcLink", _rdclink);
Debug.locals.put("ListaCmds", _listacmds);
Debug.locals.put("CallModule", _callmodule);
 BA.debugLineNum = 131;BA.debugLine="Wait For(ExecuteBatch(rdcLink, ListaCmds))  compl";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", jrdcquery.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jrdcquery", "ejecutarbatch"), _executebatch(_rdclink,_listacmds));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_bresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("bresult", _bresult);
;
 BA.debugLineNum = 132;BA.debugLine="CallSubDelayed2(CallModule, \"EjecutarBatch_Comple";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("CallSubDelayed2",jrdcquery.ba,(Object)(_callmodule),(Object)(BA.ObjectToString("EjecutarBatch_Completed")),(Object)((_bresult)));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject _bresult) throws Exception{
}
public static RemoteObject  _executebatch(RemoteObject _rdclink,RemoteObject _listacmds) throws Exception{
try {
		Debug.PushSubsStack("ExecuteBatch (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,135);
if (RapidSub.canDelegate("executebatch")) { return b4j.docU.jrdcquery.remoteMe.runUserSub(false, "jrdcquery","executebatch", _rdclink, _listacmds);}
ResumableSub_ExecuteBatch rsub = new ResumableSub_ExecuteBatch(null,_rdclink,_listacmds);
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
public static class ResumableSub_ExecuteBatch extends BA.ResumableSub {
public ResumableSub_ExecuteBatch(b4j.docU.jrdcquery parent,RemoteObject _rdclink,RemoteObject _listacmds) {
this.parent = parent;
this._rdclink = _rdclink;
this._listacmds = _listacmds;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.docU.jrdcquery parent;
RemoteObject _rdclink;
RemoteObject _listacmds;
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExecuteBatch (jrdcquery) ","jrdcquery",52,jrdcquery.ba,jrdcquery.mostCurrent,135);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("rdcLink", _rdclink);
Debug.locals.put("ListaCmds", _listacmds);
 BA.debugLineNum = 136;BA.debugLine="Dim j As HttpJob = CreateRequest(rdcLink).Execute";
Debug.ShouldStop(128);
_j = _createrequest(_rdclink).runClassMethod (b4j.docU.dbrequestmanager.class, "_executebatch" /*RemoteObject*/ ,(Object)(_listacmds),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 137;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", jrdcquery.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "jrdcquery", "executebatch"), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 138;BA.debugLine="If j.Success Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 139;BA.debugLine="Log(\"Inserted successfully!\")";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","8107020292",RemoteObject.createImmutable("Inserted successfully!"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 141;BA.debugLine="Log(\"Error, no insertado\")";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","8107020294",RemoteObject.createImmutable("Error, no insertado"),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 143;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 144;BA.debugLine="Return j.Success";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_j.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}