package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dbrequestmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.dbrequestmanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.dbrequestmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _mtarget = null;
public String _link = "";
public float _version = 0f;
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.docU.main _main = null;
public b4j.docU.mainmenu2 _mainmenu2 = null;
public b4j.docU.utilidades _utilidades = null;
public b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public b4j.docU.cmauxtxt _cmauxtxt = null;
public b4j.docU.jrdcquery _jrdcquery = null;
public b4j.docU.dbutils _dbutils = null;
public b4j.docU.transfermode _transfermode = null;
public b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public b4j.docU.b4xcollections _b4xcollections = null;
public b4j.docU.jamlinknavision _jamlinknavision = null;
public b4j.docU.cmpermisos _cmpermisos = null;
public b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public b4j.docU.httputils2service _httputils2service = null;
public b4j.docU.xuiviewsutils _xuiviewsutils = null;
public b4j.docU.httpjob  _executequery(b4j.docU.dbrequestmanager __ref,b4j.docU.main._dbcommand _command,int _limit,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executequery", false))
	 {return ((b4j.docU.httpjob) Debug.delegate(ba, "executequery", new Object[] {_command,_limit,_tag}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
RDebugUtils.currentLine=106037248;
 //BA.debugLineNum = 106037248;BA.debugLine="Public Sub ExecuteQuery(Command As DBCommand, Limi";
RDebugUtils.currentLine=106037249;
 //BA.debugLineNum = 106037249;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=106037250;
 //BA.debugLineNum = 106037250;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(Cre";
_data = _ser.ConvertObjectToBytes((Object)(__c.createMap(new Object[] {(Object)("command"),(Object)(_command),(Object)("limit"),(Object)(_limit),(Object)("version"),(Object)(__ref._version /*float*/ )}).getObject()));
RDebugUtils.currentLine=106037251;
 //BA.debugLineNum = 106037251;BA.debugLine="Return SendJob(CreateJob, data, Tag, \"query2\")";
if (true) return __ref._sendjob /*b4j.docU.httpjob*/ (null,__ref._createjob /*b4j.docU.httpjob*/ (null),_data,_tag,"query2");
RDebugUtils.currentLine=106037252;
 //BA.debugLineNum = 106037252;BA.debugLine="End Sub";
return null;
}
public void  _handlejobasync(b4j.docU.dbrequestmanager __ref,b4j.docU.httpjob _job,String _eventname) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "handlejobasync", false))
	 {Debug.delegate(ba, "handlejobasync", new Object[] {_job,_eventname}); return;}
ResumableSub_HandleJobAsync rsub = new ResumableSub_HandleJobAsync(this,__ref,_job,_eventname);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleJobAsync extends BA.ResumableSub {
public ResumableSub_HandleJobAsync(b4j.docU.dbrequestmanager parent,b4j.docU.dbrequestmanager __ref,b4j.docU.httpjob _job,String _eventname) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._eventname = _eventname;
this.__ref = parent;
}
b4j.docU.dbrequestmanager __ref;
b4j.docU.dbrequestmanager parent;
b4j.docU.httpjob _job;
String _eventname;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
boolean _success = false;
Object _newobject = null;
b4j.docU.main._dbresult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=106496001;
 //BA.debugLineNum = 106496001;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=106496002;
 //BA.debugLineNum = 106496002;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
_data = parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()));
RDebugUtils.currentLine=106496003;
 //BA.debugLineNum = 106496003;BA.debugLine="ser.ConvertBytesToObjectAsync(data, \"ser\")";
_ser.ConvertBytesToObjectAsync(ba,_data,"ser");
RDebugUtils.currentLine=106496004;
 //BA.debugLineNum = 106496004;BA.debugLine="Wait For (ser) ser_BytesToObject (Success As Bool";
parent.__c.WaitFor("ser_bytestoobject", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dbrequestmanager", "handlejobasync"), (Object)(_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
_newobject = (Object) result[2];
;
RDebugUtils.currentLine=106496005;
 //BA.debugLineNum = 106496005;BA.debugLine="If Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=106496006;
 //BA.debugLineNum = 106496006;BA.debugLine="Log(\"Error reading response: \" & LastException)";
parent.__c.LogImpl("8106496006","Error reading response: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=106496007;
 //BA.debugLineNum = 106496007;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=106496009;
 //BA.debugLineNum = 106496009;BA.debugLine="Dim res As DBResult = NewObject";
_res = (b4j.docU.main._dbresult)(_newobject);
RDebugUtils.currentLine=106496010;
 //BA.debugLineNum = 106496010;BA.debugLine="res.Tag = Job.Tag";
_res.Tag /*Object*/  = _job._tag /*Object*/ ;
RDebugUtils.currentLine=106496011;
 //BA.debugLineNum = 106496011;BA.debugLine="CallSubDelayed2(mTarget, EventName & \"_result\", r";
parent.__c.CallSubDelayed2(ba,__ref._mtarget /*Object*/ ,_eventname+"_result",(Object)(_res));
RDebugUtils.currentLine=106496012;
 //BA.debugLineNum = 106496012;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.docU.dbrequestmanager __ref,anywheresoftware.b4a.BA _ba,Object _target,String _connectorlink) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_connectorlink}));}
RDebugUtils.currentLine=105971712;
 //BA.debugLineNum = 105971712;BA.debugLine="Public Sub Initialize (Target As Object, Connector";
RDebugUtils.currentLine=105971713;
 //BA.debugLineNum = 105971713;BA.debugLine="mTarget = Target";
__ref._mtarget /*Object*/  = _target;
RDebugUtils.currentLine=105971714;
 //BA.debugLineNum = 105971714;BA.debugLine="link = ConnectorLink";
__ref._link /*String*/  = _connectorlink;
RDebugUtils.currentLine=105971715;
 //BA.debugLineNum = 105971715;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.dbrequestmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
RDebugUtils.currentLine=105906176;
 //BA.debugLineNum = 105906176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=105906177;
 //BA.debugLineNum = 105906177;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=105906178;
 //BA.debugLineNum = 105906178;BA.debugLine="Private link As String";
_link = "";
RDebugUtils.currentLine=105906179;
 //BA.debugLineNum = 105906179;BA.debugLine="Private VERSION As Float = 2";
_version = (float) (2);
RDebugUtils.currentLine=105906181;
 //BA.debugLineNum = 105906181;BA.debugLine="End Sub";
return "";
}
public b4j.docU.httpjob  _createjob(b4j.docU.dbrequestmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "createjob", false))
	 {return ((b4j.docU.httpjob) Debug.delegate(ba, "createjob", null));}
b4j.docU.httpjob _j = null;
RDebugUtils.currentLine=106168320;
 //BA.debugLineNum = 106168320;BA.debugLine="Private Sub CreateJob As HttpJob";
RDebugUtils.currentLine=106168321;
 //BA.debugLineNum = 106168321;BA.debugLine="Dim j As HttpJob";
_j = new b4j.docU.httpjob();
RDebugUtils.currentLine=106168322;
 //BA.debugLineNum = 106168322;BA.debugLine="j.Initialize(\"DBRequest\", mTarget)";
_j._initialize /*String*/ (null,ba,"DBRequest",__ref._mtarget /*Object*/ );
RDebugUtils.currentLine=106168323;
 //BA.debugLineNum = 106168323;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=106168324;
 //BA.debugLineNum = 106168324;BA.debugLine="End Sub";
return null;
}
public b4j.docU.httpjob  _executebatch(b4j.docU.dbrequestmanager __ref,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executebatch", false))
	 {return ((b4j.docU.httpjob) Debug.delegate(ba, "executebatch", new Object[] {_listofcommands,_tag}));}
b4j.docU.httpjob _j = null;
RDebugUtils.currentLine=106233856;
 //BA.debugLineNum = 106233856;BA.debugLine="Public Sub ExecuteBatch(ListOfCommands As List, Ta";
RDebugUtils.currentLine=106233857;
 //BA.debugLineNum = 106233857;BA.debugLine="Dim j As HttpJob = CreateJob";
_j = __ref._createjob /*b4j.docU.httpjob*/ (null);
RDebugUtils.currentLine=106233858;
 //BA.debugLineNum = 106233858;BA.debugLine="ExecuteBatchImpl(j, ListOfCommands, Tag)";
__ref._executebatchimpl /*void*/ (null,_j,_listofcommands,_tag);
RDebugUtils.currentLine=106233859;
 //BA.debugLineNum = 106233859;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=106233860;
 //BA.debugLineNum = 106233860;BA.debugLine="End Sub";
return null;
}
public void  _executebatchimpl(b4j.docU.dbrequestmanager __ref,b4j.docU.httpjob _job,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executebatchimpl", false))
	 {Debug.delegate(ba, "executebatchimpl", new Object[] {_job,_listofcommands,_tag}); return;}
ResumableSub_ExecuteBatchImpl rsub = new ResumableSub_ExecuteBatchImpl(this,__ref,_job,_listofcommands,_tag);
rsub.resume(ba, null);
}
public static class ResumableSub_ExecuteBatchImpl extends BA.ResumableSub {
public ResumableSub_ExecuteBatchImpl(b4j.docU.dbrequestmanager parent,b4j.docU.dbrequestmanager __ref,b4j.docU.httpjob _job,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._listofcommands = _listofcommands;
this._tag = _tag;
this.__ref = parent;
}
b4j.docU.dbrequestmanager __ref;
b4j.docU.dbrequestmanager parent;
b4j.docU.httpjob _job;
anywheresoftware.b4a.objects.collections.List _listofcommands;
Object _tag;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
boolean _success = false;
byte[] _bytes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=106299393;
 //BA.debugLineNum = 106299393;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=106299394;
 //BA.debugLineNum = 106299394;BA.debugLine="ser.ConvertObjectToBytesAsync(CreateMap(\"commands";
_ser.ConvertObjectToBytesAsync(ba,(Object)(parent.__c.createMap(new Object[] {(Object)("commands"),(Object)(_listofcommands.getObject()),(Object)("version"),(Object)(__ref._version /*float*/ )}).getObject()),"ser");
RDebugUtils.currentLine=106299395;
 //BA.debugLineNum = 106299395;BA.debugLine="Wait For (ser) ser_ObjectToBytes (Success As Bool";
parent.__c.WaitFor("ser_objecttobytes", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dbrequestmanager", "executebatchimpl"), (Object)(_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
_bytes = (byte[]) result[2];
;
RDebugUtils.currentLine=106299396;
 //BA.debugLineNum = 106299396;BA.debugLine="If Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=106299397;
 //BA.debugLineNum = 106299397;BA.debugLine="Log(\"Error building command: \" & LastException)";
parent.__c.LogImpl("8106299397","Error building command: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=106299398;
 //BA.debugLineNum = 106299398;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=106299400;
 //BA.debugLineNum = 106299400;BA.debugLine="Dim ser As B4XSerializator = Sender";
_ser = (anywheresoftware.b4a.randomaccessfile.B4XSerializator)(parent.__c.Sender(ba));
RDebugUtils.currentLine=106299401;
 //BA.debugLineNum = 106299401;BA.debugLine="SendJob(Job, Bytes, Tag, \"batch2\")";
__ref._sendjob /*b4j.docU.httpjob*/ (null,_job,_bytes,_tag,"batch2");
RDebugUtils.currentLine=106299402;
 //BA.debugLineNum = 106299402;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.docU.httpjob  _sendjob(b4j.docU.dbrequestmanager __ref,b4j.docU.httpjob _j,byte[] _data,Object _tag,String _method) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "sendjob", false))
	 {return ((b4j.docU.httpjob) Debug.delegate(ba, "sendjob", new Object[] {_j,_data,_tag,_method}));}
RDebugUtils.currentLine=106102784;
 //BA.debugLineNum = 106102784;BA.debugLine="Private Sub SendJob(j As HttpJob, Data() As Byte,";
RDebugUtils.currentLine=106102785;
 //BA.debugLineNum = 106102785;BA.debugLine="j.Tag = Tag";
_j._tag /*Object*/  = _tag;
RDebugUtils.currentLine=106102786;
 //BA.debugLineNum = 106102786;BA.debugLine="j.PostBytes(link & \"?method=\" & Method , Data)";
_j._postbytes /*String*/ (null,__ref._link /*String*/ +"?method="+_method,_data);
RDebugUtils.currentLine=106102787;
 //BA.debugLineNum = 106102787;BA.debugLine="j.GetRequest.Timeout=60000 ' AÑADIDO 14/10/22";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (60000));
RDebugUtils.currentLine=106102788;
 //BA.debugLineNum = 106102788;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=106102789;
 //BA.debugLineNum = 106102789;BA.debugLine="End Sub";
return null;
}
public b4j.docU.httpjob  _executecommand(b4j.docU.dbrequestmanager __ref,b4j.docU.main._dbcommand _command,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executecommand", false))
	 {return ((b4j.docU.httpjob) Debug.delegate(ba, "executecommand", new Object[] {_command,_tag}));}
RDebugUtils.currentLine=106364928;
 //BA.debugLineNum = 106364928;BA.debugLine="Public Sub ExecuteCommand(Command As DBCommand, Ta";
RDebugUtils.currentLine=106364929;
 //BA.debugLineNum = 106364929;BA.debugLine="Return ExecuteBatch(Array As DBCommand(Command),";
if (true) return __ref._executebatch /*b4j.docU.httpjob*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new b4j.docU.main._dbcommand[]{_command}),_tag);
RDebugUtils.currentLine=106364930;
 //BA.debugLineNum = 106364930;BA.debugLine="End Sub";
return null;
}
public byte[]  _filetobytes(b4j.docU.dbrequestmanager __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "filetobytes", false))
	 {return ((byte[]) Debug.delegate(ba, "filetobytes", new Object[] {_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=106561536;
 //BA.debugLineNum = 106561536;BA.debugLine="Public Sub FileToBytes(Dir As String, FileName As";
RDebugUtils.currentLine=106561537;
 //BA.debugLineNum = 106561537;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=106561538;
 //BA.debugLineNum = 106561538;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=106561539;
 //BA.debugLineNum = 106561539;BA.debugLine="Dim In As InputStream = File.OpenInput(Dir, FileN";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=106561540;
 //BA.debugLineNum = 106561540;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=106561541;
 //BA.debugLineNum = 106561541;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=106561542;
 //BA.debugLineNum = 106561542;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=106561543;
 //BA.debugLineNum = 106561543;BA.debugLine="End Sub";
return null;
}
public b4j.docU.main._dbresult  _handlejob(b4j.docU.dbrequestmanager __ref,b4j.docU.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "handlejob", false))
	 {return ((b4j.docU.main._dbresult) Debug.delegate(ba, "handlejob", new Object[] {_job}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
b4j.docU.main._dbresult _res = null;
RDebugUtils.currentLine=106430464;
 //BA.debugLineNum = 106430464;BA.debugLine="Public Sub HandleJob(Job As HttpJob) As DBResult";
RDebugUtils.currentLine=106430465;
 //BA.debugLineNum = 106430465;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=106430466;
 //BA.debugLineNum = 106430466;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
_data = __c.Bit.InputStreamToBytes((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()));
RDebugUtils.currentLine=106430467;
 //BA.debugLineNum = 106430467;BA.debugLine="Dim res As DBResult = ser.ConvertBytesToObject(da";
_res = (b4j.docU.main._dbresult)(_ser.ConvertBytesToObject(_data));
RDebugUtils.currentLine=106430468;
 //BA.debugLineNum = 106430468;BA.debugLine="res.Tag = Job.Tag";
_res.Tag /*Object*/  = _job._tag /*Object*/ ;
RDebugUtils.currentLine=106430469;
 //BA.debugLineNum = 106430469;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=106430470;
 //BA.debugLineNum = 106430470;BA.debugLine="End Sub";
return null;
}
public String  _printtable(b4j.docU.dbrequestmanager __ref,b4j.docU.main._dbresult _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "printtable", false))
	 {return ((String) Debug.delegate(ba, "printtable", new Object[] {_table}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _col = null;
Object[] _row = null;
Object _record = null;
RDebugUtils.currentLine=106627072;
 //BA.debugLineNum = 106627072;BA.debugLine="Public Sub PrintTable(Table As DBResult)";
RDebugUtils.currentLine=106627073;
 //BA.debugLineNum = 106627073;BA.debugLine="Log(\"Tag: \" & Table.Tag & \", Columns: \" & Table.C";
__c.LogImpl("8106627073","Tag: "+BA.ObjectToString(_table.Tag /*Object*/ )+", Columns: "+BA.NumberToString(_table.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize())+", Rows: "+BA.NumberToString(_table.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
RDebugUtils.currentLine=106627074;
 //BA.debugLineNum = 106627074;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=106627075;
 //BA.debugLineNum = 106627075;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=106627076;
 //BA.debugLineNum = 106627076;BA.debugLine="For Each col In Table.Columns.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_col = group4.Get(index4);
RDebugUtils.currentLine=106627077;
 //BA.debugLineNum = 106627077;BA.debugLine="sb.Append(col).Append(TAB)";
_sb.Append(BA.ObjectToString(_col)).Append(__c.TAB);
 }
};
RDebugUtils.currentLine=106627079;
 //BA.debugLineNum = 106627079;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("8106627079",_sb.ToString(),0);
RDebugUtils.currentLine=106627080;
 //BA.debugLineNum = 106627080;BA.debugLine="For Each row() As Object In Table.Rows";
{
final anywheresoftware.b4a.BA.IterableList group8 = _table.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (Object[])(group8.Get(index8));
RDebugUtils.currentLine=106627081;
 //BA.debugLineNum = 106627081;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=106627082;
 //BA.debugLineNum = 106627082;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=106627083;
 //BA.debugLineNum = 106627083;BA.debugLine="For Each record As Object In row";
{
final Object[] group11 = _row;
final int groupLen11 = group11.length
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_record = group11[index11];
RDebugUtils.currentLine=106627084;
 //BA.debugLineNum = 106627084;BA.debugLine="sb.Append(record).Append(TAB)";
_sb.Append(BA.ObjectToString(_record)).Append(__c.TAB);
 }
};
RDebugUtils.currentLine=106627086;
 //BA.debugLineNum = 106627086;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("8106627086",_sb.ToString(),0);
 }
};
RDebugUtils.currentLine=106627088;
 //BA.debugLineNum = 106627088;BA.debugLine="End Sub";
return "";
}
}