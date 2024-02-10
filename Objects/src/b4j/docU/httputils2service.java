package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "completejob", true))
	 {return ((String) Debug.delegate(ba, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4j.docU.httpjob _job = null;
RDebugUtils.currentLine=211156992;
 //BA.debugLineNum = 211156992;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=211156996;
 //BA.debugLineNum = 211156996;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.docU.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=211156997;
 //BA.debugLineNum = 211156997;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=211156998;
 //BA.debugLineNum = 211156998;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("9211156998","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=211156999;
 //BA.debugLineNum = 211156999;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=211157001;
 //BA.debugLineNum = 211157001;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=211157002;
 //BA.debugLineNum = 211157002;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=211157003;
 //BA.debugLineNum = 211157003;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=211157005;
 //BA.debugLineNum = 211157005;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=211157009;
 //BA.debugLineNum = 211157009;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responseerror", true))
	 {return ((String) Debug.delegate(ba, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4j.docU.httpjob _job = null;
RDebugUtils.currentLine=211091456;
 //BA.debugLineNum = 211091456;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=211091458;
 //BA.debugLineNum = 211091458;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("9211091458",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=211091460;
 //BA.debugLineNum = 211091460;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=211091461;
 //BA.debugLineNum = 211091461;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.docU.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=211091462;
 //BA.debugLineNum = 211091462;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=211091463;
 //BA.debugLineNum = 211091463;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("9211091463","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=211091464;
 //BA.debugLineNum = 211091464;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=211091466;
 //BA.debugLineNum = 211091466;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=211091467;
 //BA.debugLineNum = 211091467;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=211091468;
 //BA.debugLineNum = 211091468;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=211091470;
 //BA.debugLineNum = 211091470;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=211091472;
 //BA.debugLineNum = 211091472;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "hc_responsesuccess", true))
	 {return ((String) Debug.delegate(ba, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4j.docU.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=210960384;
 //BA.debugLineNum = 210960384;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=210960385;
 //BA.debugLineNum = 210960385;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4j.docU.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=210960386;
 //BA.debugLineNum = 210960386;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=210960387;
 //BA.debugLineNum = 210960387;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("9210960387","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=210960388;
 //BA.debugLineNum = 210960388;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=210960390;
 //BA.debugLineNum = 210960390;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=210960391;
 //BA.debugLineNum = 210960391;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=210960395;
 //BA.debugLineNum = 210960395;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=210960397;
 //BA.debugLineNum = 210960397;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "response_streamfinish", true))
	 {return ((String) Debug.delegate(ba, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=211025920;
 //BA.debugLineNum = 211025920;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=211025921;
 //BA.debugLineNum = 211025921;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=211025922;
 //BA.debugLineNum = 211025922;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=211025924;
 //BA.debugLineNum = 211025924;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=211025926;
 //BA.debugLineNum = 211025926;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "service_create", true))
	 {return ((String) Debug.delegate(ba, "service_create", null));}
RDebugUtils.currentLine=210829312;
 //BA.debugLineNum = 210829312;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=210829324;
 //BA.debugLineNum = 210829324;BA.debugLine="TempFolder = File.DirTemp";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
RDebugUtils.currentLine=210829326;
 //BA.debugLineNum = 210829326;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=210829331;
 //BA.debugLineNum = 210829331;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=210829339;
 //BA.debugLineNum = 210829339;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=210829341;
 //BA.debugLineNum = 210829341;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4j.docU.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(ba, "submitjob", true))
	 {return ((String) Debug.delegate(ba, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=210894848;
 //BA.debugLineNum = 210894848;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=210894849;
 //BA.debugLineNum = 210894849;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=210894853;
 //BA.debugLineNum = 210894853;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=210894854;
 //BA.debugLineNum = 210894854;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=210894856;
 //BA.debugLineNum = 210894856;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=210894857;
 //BA.debugLineNum = 210894857;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=210894858;
 //BA.debugLineNum = 210894858;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=210894860;
 //BA.debugLineNum = 210894860;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=210894862;
 //BA.debugLineNum = 210894862;BA.debugLine="End Sub";
return "";
}
}