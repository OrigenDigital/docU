package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class jrdcquery extends Object{
public static jrdcquery mostCurrent = new jrdcquery();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jrdcquery", null);
		ba.loadHtSubs(jrdcquery.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.jrdcquery", ba);
		}
	}
    public static Class<?> getObject() {
		return jrdcquery.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static void  _datosjrdc(String _rdclink,String _comandoconfigproperties,Object[] _parametros,Object _callmodule) throws Exception{
RDebugUtils.currentModule="jrdcquery";
if (Debug.shouldDelegate(ba, "datosjrdc", false))
	 {Debug.delegate(ba, "datosjrdc", new Object[] {_rdclink,_comandoconfigproperties,_parametros,_callmodule}); return;}
ResumableSub_DatosJRDC rsub = new ResumableSub_DatosJRDC(null,_rdclink,_comandoconfigproperties,_parametros,_callmodule);
rsub.resume(ba, null);
}
public static class ResumableSub_DatosJRDC extends BA.ResumableSub {
public ResumableSub_DatosJRDC(b4j.docU.jrdcquery parent,String _rdclink,String _comandoconfigproperties,Object[] _parametros,Object _callmodule) {
this.parent = parent;
this._rdclink = _rdclink;
this._comandoconfigproperties = _comandoconfigproperties;
this._parametros = _parametros;
this._callmodule = _callmodule;
}
b4j.docU.jrdcquery parent;
String _rdclink;
String _comandoconfigproperties;
Object[] _parametros;
Object _callmodule;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.httpjob _jobtest = null;
int _rdclastpos = 0;
String _urltestjrdc = "";
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _records = null;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group38;
int index38;
int groupLen38;
int step41;
int limit41;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jrdcquery";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=106889230;
 //BA.debugLineNum = 106889230;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=106889231;
 //BA.debugLineNum = 106889231;BA.debugLine="lstRes.Initialize";
_lstres.Initialize();
RDebugUtils.currentLine=106889232;
 //BA.debugLineNum = 106889232;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=106889233;
 //BA.debugLineNum = 106889233;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=106889234;
 //BA.debugLineNum = 106889234;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=106889235;
 //BA.debugLineNum = 106889235;BA.debugLine="m.Put(\"QryOK\",False)  ' añadido 14/10/22";
_m.Put((Object)("QryOK"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=106889236;
 //BA.debugLineNum = 106889236;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=106889237;
 //BA.debugLineNum = 106889237;BA.debugLine="m.Put(\"lstRes\",lstRes)";
_m.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
RDebugUtils.currentLine=106889240;
 //BA.debugLineNum = 106889240;BA.debugLine="m.Put(\"ErrMsg\",\"\")";
_m.Put((Object)("ErrMsg"),(Object)(""));
RDebugUtils.currentLine=106889242;
 //BA.debugLineNum = 106889242;BA.debugLine="Log(\"inicio check test JRDC\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8106889242","inicio check test JRDC",0);
RDebugUtils.currentLine=106889244;
 //BA.debugLineNum = 106889244;BA.debugLine="Dim jobTest As HttpJob";
_jobtest = new b4j.docU.httpjob();
RDebugUtils.currentLine=106889245;
 //BA.debugLineNum = 106889245;BA.debugLine="jobTest.Initialize(\"\",Me)";
_jobtest._initialize /*String*/ (null,ba,"",jrdcquery.getObject());
RDebugUtils.currentLine=106889246;
 //BA.debugLineNum = 106889246;BA.debugLine="Dim rdcLastPos As Int=rdcLink.LastIndexOf(\"/rdc\")";
_rdclastpos = _rdclink.lastIndexOf("/rdc");
RDebugUtils.currentLine=106889247;
 //BA.debugLineNum = 106889247;BA.debugLine="Dim URLTestJRDC As String=rdcLink.SubString2(0,rd";
_urltestjrdc = _rdclink.substring((int) (0),_rdclastpos)+"/test";
RDebugUtils.currentLine=106889248;
 //BA.debugLineNum = 106889248;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=106889249;
 //BA.debugLineNum = 106889249;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(\"\")";
_data = _ser.ConvertObjectToBytes((Object)(""));
RDebugUtils.currentLine=106889250;
 //BA.debugLineNum = 106889250;BA.debugLine="jobTest.PostBytes(URLTestJRDC,data)";
_jobtest._postbytes /*String*/ (null,_urltestjrdc,_data);
RDebugUtils.currentLine=106889251;
 //BA.debugLineNum = 106889251;BA.debugLine="jobTest.GetRequest.Timeout=10000";
_jobtest._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (10000));
RDebugUtils.currentLine=106889252;
 //BA.debugLineNum = 106889252;BA.debugLine="Wait For (jobTest) JobDone(jobTest As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jrdcquery", "datosjrdc"), (Object)(_jobtest));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_jobtest = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=106889254;
 //BA.debugLineNum = 106889254;BA.debugLine="Log(\"Success check test JRDC: \" & jobTest.Success";
anywheresoftware.b4a.keywords.Common.LogImpl("8106889254","Success check test JRDC: "+BA.ObjectToString(_jobtest._success /*boolean*/ ),0);
RDebugUtils.currentLine=106889256;
 //BA.debugLineNum = 106889256;BA.debugLine="If Not(jobTest.Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_jobtest._success /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=106889257;
 //BA.debugLineNum = 106889257;BA.debugLine="Log(\"jobTest.Response.ErrorMessage: \" & jobTest.";
anywheresoftware.b4a.keywords.Common.LogImpl("8106889257","jobTest.Response.ErrorMessage: "+_jobtest._errormessage /*String*/ ,0);
RDebugUtils.currentLine=106889258;
 //BA.debugLineNum = 106889258;BA.debugLine="m.Put(\"ErrMsg\",jobTest.ErrorMessage)";
_m.Put((Object)("ErrMsg"),(Object)(_jobtest._errormessage /*String*/ ));
RDebugUtils.currentLine=106889259;
 //BA.debugLineNum = 106889259;BA.debugLine="jobTest.Release";
_jobtest._release /*String*/ (null);
RDebugUtils.currentLine=106889260;
 //BA.debugLineNum = 106889260;BA.debugLine="CallSubDelayed2(CallModule, \"DatosJRDC_Completed";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,_callmodule,"DatosJRDC_Completed",(Object)(_m));
RDebugUtils.currentLine=106889261;
 //BA.debugLineNum = 106889261;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=106889263;
 //BA.debugLineNum = 106889263;BA.debugLine="jobTest.Release";
_jobtest._release /*String*/ (null);
RDebugUtils.currentLine=106889273;
 //BA.debugLineNum = 106889273;BA.debugLine="Dim req As DBRequestManager = CreateRequest(rdcLi";
_req = _createrequest(_rdclink);
RDebugUtils.currentLine=106889274;
 //BA.debugLineNum = 106889274;BA.debugLine="Dim cmd As DBCommand = CreateCommand(ComandoConfi";
_cmd = _createcommand(_comandoconfigproperties,_parametros);
RDebugUtils.currentLine=106889277;
 //BA.debugLineNum = 106889277;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jrdcquery", "datosjrdc"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=106889279;
 //BA.debugLineNum = 106889279;BA.debugLine="If j.Success Then";
if (true) break;

case 5:
//if
this.state = 24;
if (_j._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 23;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=106889280;
 //BA.debugLineNum = 106889280;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=106889281;
 //BA.debugLineNum = 106889281;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=106889282;
 //BA.debugLineNum = 106889282;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jrdcquery", "datosjrdc"), (Object)(_req));
this.state = 27;
return;
case 27:
//C
this.state = 8;
_res = (b4j.docU.main._dbresult) result[0];
;
RDebugUtils.currentLine=106889284;
 //BA.debugLineNum = 106889284;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 8:
//if
this.state = 21;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 10;
}else {
this.state = 20;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=106889285;
 //BA.debugLineNum = 106889285;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=106889286;
 //BA.debugLineNum = 106889286;BA.debugLine="For Each records() As Object In res.Rows";
if (true) break;

case 11:
//for
this.state = 18;
group38 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index38 = 0;
groupLen38 = group38.getSize();
this.state = 28;
if (true) break;

case 28:
//C
this.state = 18;
if (index38 < groupLen38) {
this.state = 13;
_records = (Object[])(group38.Get(index38));}
if (true) break;

case 29:
//C
this.state = 28;
index38++;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=106889287;
 //BA.debugLineNum = 106889287;BA.debugLine="Dim mReg As Map";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=106889288;
 //BA.debugLineNum = 106889288;BA.debugLine="mReg.Initialize";
_mreg.Initialize();
RDebugUtils.currentLine=106889289;
 //BA.debugLineNum = 106889289;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 14:
//for
this.state = 17;
step41 = 1;
limit41 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 16:
//C
this.state = 31;
RDebugUtils.currentLine=106889291;
 //BA.debugLineNum = 106889291;BA.debugLine="mReg.Put(res.Columns.GetKeyAt(i),records(i))";
_mreg.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_records[_i]);
 if (true) break;
if (true) break;

case 17:
//C
this.state = 29;
;
RDebugUtils.currentLine=106889295;
 //BA.debugLineNum = 106889295;BA.debugLine="lstRes.Add(mReg)";
_lstres.Add((Object)(_mreg.getObject()));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
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
RDebugUtils.currentLine=106889303;
 //BA.debugLineNum = 106889303;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=106889309;
 //BA.debugLineNum = 106889309;BA.debugLine="CallSubDelayed2(CallModule, \"DatosJRDC_Completed\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,_callmodule,"DatosJRDC_Completed",(Object)(_m));
RDebugUtils.currentLine=106889311;
 //BA.debugLineNum = 106889311;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static b4j.docU.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="jrdcquery";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4j.docU.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4j.docU.main._dbcommand _cmd = null;
RDebugUtils.currentLine=106823680;
 //BA.debugLineNum = 106823680;BA.debugLine="Sub CreateCommand(name As String, Parameters() As";
RDebugUtils.currentLine=106823681;
 //BA.debugLineNum = 106823681;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4j.docU.main._dbcommand();
RDebugUtils.currentLine=106823682;
 //BA.debugLineNum = 106823682;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=106823683;
 //BA.debugLineNum = 106823683;BA.debugLine="cmd.Name = name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=106823684;
 //BA.debugLineNum = 106823684;BA.debugLine="If Parameters <> Null Then";
if (_parameters!= null) { 
RDebugUtils.currentLine=106823685;
 //BA.debugLineNum = 106823685;BA.debugLine="cmd.Parameters = Parameters";
_cmd.Parameters /*Object[]*/  = _parameters;
 };
RDebugUtils.currentLine=106823688;
 //BA.debugLineNum = 106823688;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=106823689;
 //BA.debugLineNum = 106823689;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executebatch(String _rdclink,anywheresoftware.b4a.objects.collections.List _listacmds) throws Exception{
RDebugUtils.currentModule="jrdcquery";
if (Debug.shouldDelegate(ba, "executebatch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "executebatch", new Object[] {_rdclink,_listacmds}));}
ResumableSub_ExecuteBatch rsub = new ResumableSub_ExecuteBatch(null,_rdclink,_listacmds);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteBatch extends BA.ResumableSub {
public ResumableSub_ExecuteBatch(b4j.docU.jrdcquery parent,String _rdclink,anywheresoftware.b4a.objects.collections.List _listacmds) {
this.parent = parent;
this._rdclink = _rdclink;
this._listacmds = _listacmds;
}
b4j.docU.jrdcquery parent;
String _rdclink;
anywheresoftware.b4a.objects.collections.List _listacmds;
b4j.docU.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jrdcquery";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=107020289;
 //BA.debugLineNum = 107020289;BA.debugLine="Dim j As HttpJob = CreateRequest(rdcLink).Execute";
_j = _createrequest(_rdclink)._executebatch /*b4j.docU.httpjob*/ (null,_listacmds,anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=107020290;
 //BA.debugLineNum = 107020290;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jrdcquery", "executebatch"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=107020291;
 //BA.debugLineNum = 107020291;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=107020292;
 //BA.debugLineNum = 107020292;BA.debugLine="Log(\"Inserted successfully!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8107020292","Inserted successfully!",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=107020294;
 //BA.debugLineNum = 107020294;BA.debugLine="Log(\"Error, no insertado\")";
anywheresoftware.b4a.keywords.Common.LogImpl("8107020294","Error, no insertado",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=107020296;
 //BA.debugLineNum = 107020296;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=107020297;
 //BA.debugLineNum = 107020297;BA.debugLine="Return j.Success";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_j._success /*boolean*/ ));return;};
RDebugUtils.currentLine=107020298;
 //BA.debugLineNum = 107020298;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _ejecutarbatch(String _rdclink,anywheresoftware.b4a.objects.collections.List _listacmds,Object _callmodule) throws Exception{
RDebugUtils.currentModule="jrdcquery";
if (Debug.shouldDelegate(ba, "ejecutarbatch", false))
	 {Debug.delegate(ba, "ejecutarbatch", new Object[] {_rdclink,_listacmds,_callmodule}); return;}
ResumableSub_EjecutarBatch rsub = new ResumableSub_EjecutarBatch(null,_rdclink,_listacmds,_callmodule);
rsub.resume(ba, null);
}
public static class ResumableSub_EjecutarBatch extends BA.ResumableSub {
public ResumableSub_EjecutarBatch(b4j.docU.jrdcquery parent,String _rdclink,anywheresoftware.b4a.objects.collections.List _listacmds,Object _callmodule) {
this.parent = parent;
this._rdclink = _rdclink;
this._listacmds = _listacmds;
this._callmodule = _callmodule;
}
b4j.docU.jrdcquery parent;
String _rdclink;
anywheresoftware.b4a.objects.collections.List _listacmds;
Object _callmodule;
boolean _bresult = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jrdcquery";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=106954753;
 //BA.debugLineNum = 106954753;BA.debugLine="Wait For(ExecuteBatch(rdcLink, ListaCmds))  compl";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jrdcquery", "ejecutarbatch"), _executebatch(_rdclink,_listacmds));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_bresult = (boolean) result[0];
;
RDebugUtils.currentLine=106954754;
 //BA.debugLineNum = 106954754;BA.debugLine="CallSubDelayed2(CallModule, \"EjecutarBatch_Comple";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,_callmodule,"EjecutarBatch_Completed",(Object)(_bresult));
RDebugUtils.currentLine=106954755;
 //BA.debugLineNum = 106954755;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static b4j.docU.dbrequestmanager  _createrequest(String _rdclink) throws Exception{
RDebugUtils.currentModule="jrdcquery";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4j.docU.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_rdclink}));}
b4j.docU.dbrequestmanager _req = null;
RDebugUtils.currentLine=106758144;
 //BA.debugLineNum = 106758144;BA.debugLine="Sub CreateRequest(rdcLink As String) As DBRequestM";
RDebugUtils.currentLine=106758145;
 //BA.debugLineNum = 106758145;BA.debugLine="Dim req As DBRequestManager";
_req = new b4j.docU.dbrequestmanager();
RDebugUtils.currentLine=106758146;
 //BA.debugLineNum = 106758146;BA.debugLine="req.Initialize(Me, rdcLink)   'originalmente  req";
_req._initialize /*String*/ (null,ba,jrdcquery.getObject(),_rdclink);
RDebugUtils.currentLine=106758147;
 //BA.debugLineNum = 106758147;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=106758148;
 //BA.debugLineNum = 106758148;BA.debugLine="End Sub";
return null;
}
}